package org.modmacao.cm.ansible;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface;
import org.eclipse.cmf.occi.infrastructure.Networkinterface;
import org.eclipse.emf.common.util.EList;
import org.modmacao.cm.ConfigurationManagementTool;
import org.modmacao.occi.platform.Application;
import org.modmacao.occi.platform.Component;
import org.modmacao.placement.Placementlink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnsibleCMTool implements ConfigurationManagementTool {
	private static Logger LOGGER = LoggerFactory.getLogger(AnsibleCMTool.class);

	@Override
	public int deploy(Application app) {
		List<String> roles = getRoles(app);
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
		int status = -1;
		
		try {
			status = executeRoles(comp, roles, "UNDEPLOY");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return status;

	}
	
	private String getUser() {
		return AnsibleHelper.getInstance().getProperties().getProperty("ansible_user");
	}
	
	private List<String> getRoles(Resource resource) {
		List<String> roles = new ArrayList<String>();
		for (MixinBase mixin : resource.getParts()) {
			LOGGER.debug("Mixin has schema: " + mixin.getMixin().getScheme());
			if (mixin.getMixin().getScheme().matches(".*(schemas\\.modmacao\\.org).*")){
				LOGGER.info("Found mixin " + mixin.getMixin().getName());
				roles.add(mixin.getMixin().getName().toLowerCase());
			}
		}
		return roles;
	}
	
	private String getIPAddress(Resource resource) {
		EList<Link> links = resource.getLinks();
		Networkinterface networklink = null;
		Placementlink hosting = null;
		String ipaddress = null;

		for (Link link:links) {
			if (link instanceof Placementlink) {
				LOGGER.info("Found placementlink for " + resource.getTitle());
				hosting = (Placementlink) link;
				break;
			}	
		}
		if (hosting == null) {
			LOGGER.warn("No hosting found for component " + resource.getTitle() + ". Falling back to localhost.");
			ipaddress = "127.0.0.1";
			return ipaddress;					
		} else {
			Compute target = (Compute) hosting.getTarget();
			links = target.getLinks();

			for (Link link:links) {
				if (link instanceof Networkinterface) {
					LOGGER.info("Found network interface for " + target);
					networklink = (Networkinterface) link;
					break;
				}	
			}
			
			if (networklink == null) {
				LOGGER.error("No network interface found for " + target);	
			} else {
				List<AttributeState> attributes  = new LinkedList<AttributeState>();
				attributes.addAll(networklink.getAttributes());
				for (MixinBase base: networklink.getParts()) {
					if (base instanceof Ipnetworkinterface) {
						ipaddress = ((Ipnetworkinterface) base).getOcciNetworkinterfaceAddress();
					}
				}
				
//				for (AttributeState attribute: attributes ) {
//					LOGGER.debug(attribute.getName() + ":" + attribute.getValue());
//					if (attribute.getName().equals("occi.networkinterface.address")) {
//						LOGGER.info("Found IP address for " + networklink);
//						ipaddress = attribute.getValue();
//						LOGGER.info("IP address is " + ipaddress);
//						break;
//					}
//				}
			}
		}

		return ipaddress;
	}
	
	private int executeRoles(Resource resource, List<String> roles, String task) throws Exception{
		String ipaddress = getIPAddress(resource);
		String user = this.getUser();
		String options = null;
		
		if (ipaddress.equals("127.0.0.1")) {
			options = "--connection=local";
		}
		
		String basedir = "/tmp/" + resource.getTitle() + "_ansible";
		
		AnsibleHelper helper = AnsibleHelper.getInstance();
		
		helper.createConfiguration(Paths.get("ansible.cfg"), 
				Paths.get(helper.getProperties().getProperty("private_key_path")));
		Path variablefile = helper.createVariableFile(Paths.get(basedir, "vars.yaml"), resource);
			
		Path playbook = helper.createPlaybook(ipaddress, roles, user, variablefile, 
				Paths.get(basedir, "playbook.yml"));
			
		Path inventory = helper.createInventory(ipaddress, Paths.get(basedir, "inventory"));
			
		LOGGER.info("Executing role " + roles + " on host " + ipaddress + " with user " + user + ".");	
		int status = helper.executePlaybook(playbook, task, inventory, options);
			
		return status;
	}

}
