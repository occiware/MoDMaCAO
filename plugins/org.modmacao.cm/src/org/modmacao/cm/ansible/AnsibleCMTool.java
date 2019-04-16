package org.modmacao.cm.ansible;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.modmacao.ansibleconfiguration.Ansibleconfiguration;
import org.modmacao.cm.ConfigurationManagementTool;
import org.modmacao.occi.platform.Application;
import org.modmacao.occi.platform.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnsibleCMTool implements ConfigurationManagementTool {
	static Logger LOGGER = LoggerFactory.getLogger(AnsibleCMTool.class);

	@Override
	public int deploy(Application app) {
		List<String> roles = getRoles(app);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeRoles(app, roles, "DEPLOY");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return status;
	}

	@Override
	public int configure(Application app) {
		List<String> roles = getRoles(app);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeRoles(app, roles, "CONFIGURE");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return status;

	}

	@Override
	public int start(Application app) {
		List<String> roles = getRoles(app);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeRoles(app, roles, "START");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return status;
	}

	@Override
	public int stop(Application app) {
		List<String> roles = getRoles(app);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeRoles(app, roles, "STOP");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		
		return status;

	}

	@Override
	public int undeploy(Application app) {
		List<String> roles = getRoles(app);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeRoles(app, roles, "UNDEPLOY");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return status;

	}

	@Override
	public int deploy(Component comp) {
		List<String> roles = getRoles(comp);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeRoles(comp, roles, "DEPLOY");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return status;

	}

	@Override
	public int configure(Component comp) {
		List<String> roles = getRoles(comp);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeRoles(comp, roles, "CONFIGURE");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return status;

	}

	@Override
	public int start(Component comp) {
		List<String> roles = getRoles(comp);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeRoles(comp, roles, "START");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return status;

	}

	@Override
	public int stop(Component comp) {
		List<String> roles = getRoles(comp);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeRoles(comp, roles, "STOP");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return status;

	}

	@Override
	public int undeploy(Component comp) {
		List<String> roles = getRoles(comp);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeRoles(comp, roles, "UNDEPLOY");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return status;

	}
	
	private String getUser() {
		return new AnsibleHelper().getProperties().getProperty("ansible_user");
	}
	
	private List<String> getRoles(Resource resource) {
		List<String> roles = new ArrayList<String>();
		for (MixinBase mixin : resource.getParts()) {
			LOGGER.debug("Mixin has schema: " + mixin.getMixin().getScheme());
			if (mixin.getMixin().getScheme().matches(".*(schemas\\.modmacao\\.org).*") || mixin instanceof modmacao.Component){
				LOGGER.info("Found mixin " + mixin.getMixin().getName());
				roles.add(mixin.getMixin().getName().toLowerCase());
			}
		}
		return roles;
	}
	
	private int executeRoles(Resource resource, List<String> roles, String task) throws Exception{
		AnsibleHelper helper = new AnsibleHelper();
		String ipaddress = helper.getIPAddress(resource);
		String user = this.getUser();
		String options = null;
		String keypath = helper.getProperties().getProperty("private_key_path");
		
		if (ipaddress.equals("127.0.0.1")) {
			options = "--connection=local";
		}
		
		String basedir = "/tmp/" + helper.getTitle(resource).replace(' ', '_') + "_ansible_" + System.currentTimeMillis();
		
//		for (MixinBase base: resource.getParts()) {
//			if (base instanceof Ansibleconfiguration) {
//				Ansibleconfiguration configuration = (Ansibleconfiguration) base;
//				String remoteuser = configuration.getAnsibleRemoteuser();
//				String privatekey = configuration.getAnsiblePrivatekey();
//				if (remoteuser != null && !remoteuser.equals("")) {
//					user = remoteuser;
//				}
//				if (privatekey != null && !privatekey.equals("")) {
//					keypath = privatekey;
//				}
//				break;
//			}
//		}
		
		
		helper.createConfiguration(Paths.get("ansible.cfg"), 
				Paths.get(keypath));
		List <Path> variablefiles = new ArrayList<Path>();
		
		variablefiles.add(helper.createVariableFile(Paths.get(basedir, "vars.yaml"), resource));
		variablefiles.add(helper.createExtendedVariableFile(Paths.get(basedir), resource));
			
		Path playbook = helper.createPlaybook(ipaddress, roles, user, variablefiles, 
				Paths.get(basedir, "playbook.yml"));
			
		Path inventory = helper.createInventory(ipaddress, Paths.get(basedir, "inventory"));
			
		LOGGER.info("Executing role " + roles + " with task " + task + " on host " + ipaddress + " with user " + user + ".");
		
		AnsibleReturnState state = helper.executePlaybook(playbook, task, inventory, options);	
		
		if (state.getStateMessage() != null) {
			LOGGER.info("Received state message.");
			LOGGER.info(state.getStateMessage());
			if (resource instanceof Component) {
				((Component) resource).setOcciComponentStateMessage(state.getStateMessage());
			} else if (resource instanceof Application) {
				((Application) resource).setOcciAppStateMessage(state.getStateMessage());	
			}
		}
		
		return state.getExitValue();
	}

}
