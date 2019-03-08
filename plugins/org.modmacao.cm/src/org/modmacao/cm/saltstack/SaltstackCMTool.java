package org.modmacao.cm.saltstack;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.modmacao.cm.ConfigurationManagementTool;
import org.modmacao.occi.platform.Application;
import org.modmacao.occi.platform.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SaltstackCMTool implements ConfigurationManagementTool {
	static Logger LOGGER = LoggerFactory.getLogger(SaltstackCMTool.class);
	
	@Override
	public int deploy(Application app) {
		List<String> roles = getStates(app);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeStates(app, roles, "DEPLOY");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return status;
	}

	@Override
	public int configure(Application app) {
		List<String> roles = getStates(app);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeStates(app, roles, "CONFIGURE");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return status;

	}

	@Override
	public int start(Application app) {
		List<String> roles = getStates(app);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeStates(app, roles, "START");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return status;
	}

	@Override
	public int stop(Application app) {
		List<String> roles = getStates(app);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeStates(app, roles, "STOP");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		
		return status;

	}

	@Override
	public int undeploy(Application app) {
		List<String> roles = getStates(app);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeStates(app, roles, "UNDEPLOY");
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
		List<String> roles = getStates(comp);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeStates(comp, roles, "CONFIGURE");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return status;

	}

	@Override
	public int start(Component comp) {
		List<String> roles = getStates(comp);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeStates(comp, roles, "START");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return status;

	}

	@Override
	public int stop(Component comp) {
		List<String> roles = getStates(comp);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeStates(comp, roles, "STOP");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return status;

	}

	@Override
	public int undeploy(Component comp) {
		List<String> roles = getStates(comp);
		if (roles.isEmpty())
			return 0;
		
		int status = -1;
		
		try {
			status = executeStates(comp, roles, "UNDEPLOY");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return status;

	}
	
	private String getUser() {
		return new SaltstackHelper().getProperties().getProperty("saltstack_user");
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
		LOGGER.info(ipaddress);
		String user = this.getUser();
		LOGGER.info(user);
		String options = null;
		
		if (ipaddress.equals("127.0.0.1")) {
			options = "--connection=local";
		}
		
		String basedir = "/tmp/" + helper.getTitle(resource).replace(' ', '_') + "_saltstack_" + System.currentTimeMillis();
		
		List <Path> pillar = new ArrayList<Path>();
		
		pillar.add(helper.createVariableFile(Paths.get(basedir + "/pillar", "vars.sls"), resource));
		//pillar.add(helper.createExtendedVariableFile(Paths.get(basedir), resource));
		
		
		Path pillarTopFile = helper.createPillarTopfile(ipaddress, states, pillar, 
				Paths.get(basedir + "/pillar", "top.sls"));
		
		Path topFile = helper.createTopfile(ipaddress, states, task,
				Paths.get(basedir, "top.sls"));
			
		Path master = helper.createMasterConfiguration(Paths.get(basedir, "master"), basedir);
		
		Path roster = helper.createRoster(ipaddress, Paths.get(basedir, "roster"));
			
		LOGGER.info("Executing role " + states + " on host " + ipaddress + " with user " + user + ".");	
		int status = helper.executeSaltstack(basedir, states, task, roster, ipaddress, options);	
		
		return status;
	}
}
