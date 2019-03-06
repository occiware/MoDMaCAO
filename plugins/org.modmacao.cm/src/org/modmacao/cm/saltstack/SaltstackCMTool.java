package org.modmacao.cm.saltstack;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.modmacao.cm.ConfigurationManagementTool;
import org.modmacao.cm.ansible.AnsibleCMTool;
import org.modmacao.cm.ansible.AnsibleHelper;
import org.modmacao.occi.platform.Application;
import org.modmacao.occi.platform.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SaltstackCMTool implements ConfigurationManagementTool {
	static Logger LOGGER = LoggerFactory.getLogger(SaltstackCMTool.class);
	
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
		List<String> states = getStates(comp);
		if (states.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeStates(comp, states, "DEPLOY");
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
	
	private List<String> getStates(Resource resource) {
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
	
	private int executeStates(Resource resource, List<String> states, String task) throws Exception{
		SaltstackHelper helper = new SaltstackHelper();
		String ipaddress = helper.getIPAddress(resource);
		String user = this.getUser();
		String options = null;
		
		if (ipaddress.equals("127.0.0.1")) {
			options = "--connection=local";
		}
		
		String basedir = "/tmp/" + helper.getTitle(resource).replace(' ', '_') + "_saltstack_" + System.currentTimeMillis();
		
		
		List <Path> variablefiles = new ArrayList<Path>();
		
		//variablefiles.add(helper.createVariableFile(Paths.get(basedir, "vars.yaml"), resource));
		//variablefiles.add(helper.createExtendedVariableFile(Paths.get(basedir), resource));
			
		Path topFile = helper.createTopfile(ipaddress, states, user, variablefiles, 
				Paths.get(basedir, "top.sls"));
			
		Path master = helper.createMasterConfiguration(Paths.get(basedir, "master"), basedir);
		
		Path roster = helper.createRoster(ipaddress, Paths.get(basedir, "roster"));
			
		LOGGER.info("Executing role " + states + " on host " + ipaddress + " with user " + user + ".");	
		int status = helper.executeSaltstack(basedir, task, roster, options);	
		
		return status;
	}
	
	
	private int executeRoles(Resource resource, List<String> roles, String task) throws Exception{
		AnsibleHelper helper = new AnsibleHelper();
		String ipaddress = helper.getIPAddress(resource);
		String user = this.getUser();
		String options = null;
		
		if (ipaddress.equals("127.0.0.1")) {
			options = "--connection=local";
		}
		
		String basedir = "/tmp/" + helper.getTitle(resource).replace(' ', '_') + "_ansible_" + System.currentTimeMillis();
		
		
		helper.createConfiguration(Paths.get("ansible.cfg"), 
				Paths.get(helper.getProperties().getProperty("private_key_path")));
		List <Path> variablefiles = new ArrayList<Path>();
		
		variablefiles.add(helper.createVariableFile(Paths.get(basedir, "vars.yaml"), resource));
		variablefiles.add(helper.createExtendedVariableFile(Paths.get(basedir), resource));
			
		Path playbook = helper.createPlaybook(ipaddress, roles, user, variablefiles, 
				Paths.get(basedir, "playbook.yml"));
			
		Path inventory = helper.createInventory(ipaddress, Paths.get(basedir, "inventory"));
			
		LOGGER.info("Executing role " + roles + " on host " + ipaddress + " with user " + user + ".");	
		int status = helper.executePlaybook(playbook, task, inventory, options);	
		
		return status;
	}
}
