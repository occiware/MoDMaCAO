package org.modmacao.cm.saltstack;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface;
import org.eclipse.cmf.occi.infrastructure.Networkinterface;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.modmacao.ansibleconfiguration.Ansibleendpoint;
import org.modmacao.occi.platform.Component;
import org.modmacao.placement.Placementlink;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
* This class provides utility methods for the configuration management tool Saltstack.
* @author Johannes Erbel - UGOE
*/
public final class SaltstackHelper {
	Properties props;
	
	public SaltstackHelper() {
		loadProperties();
	}
	
	
	/**
	 * Getter method for providing the properties of this AnsibleHelper.
	 * Properties will be read from local file ansible.properties.
	 * @return The properties
	 */
	public Properties getProperties() {
		if (props == null)
			loadProperties();
		
		return props;
	}
	
	private void loadProperties() {
		props = new Properties();
    	InputStream input = null;

    	try {

    		String filename = "saltstack.properties";
    		
    		// try to load bundle
    		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
    		if (bundle != null) {
    			URL url = FrameworkUtil.getBundle(this.getClass()).getResource(filename);
    			input = url.openConnection().getInputStream();
    		}

    		if (input == null) {
    			// try to read properties without BundleLoader
    			input = this.getClass().getClassLoader().getResourceAsStream(filename);	
    		}
    		
    		System.out.println(input);
    		props.load(input);
    		
    	} catch (IOException ex) {
    		ex.printStackTrace();
        } finally{
        	if(input!=null){
        		try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	}
        }		
	}
	
	public Path createRoster(String ipaddress, Path roster) throws IOException{
		String lb = System.getProperty("line.separator");
		String offset = "  ";
		StringBuilder sb = new StringBuilder(ipaddress).append(":").append(lb);
		sb.append(offset).append("host: ").append(ipaddress).append(lb);
		sb.append(offset).append("user: ").append(this.getProperties().getProperty("saltstack_user")).append(lb);
		sb.append(offset).append("priv: ").append(this.getProperties().getProperty("private_key_path")).append(lb);
		sb.append(offset).append("sudo: True").append(lb);
		sb.append(offset).append("timeout: ").append(this.getProperties().getProperty("ssh_timeout")).append(lb);
		FileUtils.writeStringToFile(roster.toFile(), sb.toString(), (Charset) null);
		return roster;
	}
	
	
	/**
	 * Creates a Ansible playbook, with host given by ipaddress, roles given by roles,
	 * the remote user, given by user, a link to a variable file, given by variables
	 * at path path.
	 * @param ipaddress The ipaddres of the host on which this playbook shoule be executed.
	 * @param states The roles that should be executed on the host.
	 * @param task 
	 * @param user The user that is used to connect to the host.
	 * @param path The path where this playbook should be created.
	 * @return The path where this playbook was created.
	 * @throws IOException
	 */
	public Path createTopfile(String ipaddress, List<String> states, String task, Path path) throws IOException {
		String lb = System.getProperty("line.separator");
		String offset = "  ";
		StringBuilder sb = new StringBuilder("");
		sb.append("base: ").append(lb);
		sb.append(offset).append(ipaddress).append(":").append(lb);
		
		for (String state: states) {
			sb.append(offset).append(offset).append("- ").append(state).append("."+task).append(lb);
		}
		
		FileUtils.writeStringToFile(path.toFile(), sb.toString(), (Charset) null);
		return path;
	}
	
	public Path createPillarTopfile(String ipaddress, List<String> states, List<Path> variables,
			Path path) throws IOException {
		String lb = System.getProperty("line.separator");
		String offset = "  ";
		StringBuilder sb = new StringBuilder("");
		sb.append("base: ").append(lb);
		sb.append(offset).append(ipaddress).append(":").append(lb);
		
		
		for (Path variable: variables) {
			String varfile = FilenameUtils.removeExtension(variable.getFileName().toString());
			sb.append(offset).append(offset).append("- ").append(varfile).append(lb);
		}
		
		for(String state: states) {
			sb.append(offset).append(offset).append("- ").append(state).append(".pillar.*").append(lb);
		}
		
		FileUtils.writeStringToFile(path.toFile(), sb.toString(), (Charset) null);
		return path;
	}
	

	public Path createMasterConfiguration(Path configuration, String basedir) throws IOException{
		String lb = System.getProperty("line.separator");
		String offset = "  ";
		StringBuilder sb = new StringBuilder("file_roots:").append(lb);
		sb.append(offset).append("base:").append(lb);
		sb.append(offset).append(offset).append("- ").append(this.getProperties().getProperty("saltstack_statespath")).append(lb);
		sb.append(offset).append(offset).append("- ").append(basedir).append(lb);
		
		sb.append("pillar_roots:").append(lb);
		sb.append(offset).append("base:").append(lb);
		sb.append(offset).append(offset).append("- ").append(this.getProperties().getProperty("saltstack_statespath")).append(lb);
		sb.append(offset).append(offset).append("- ").append(basedir).append("/pillar").append(lb);
		FileUtils.writeStringToFile(configuration.toFile(), sb.toString(), (Charset) null);
		return configuration;
	}
	
	
	public int executeSaltstack(String basedir, List<String> states, String task, Path roster, String ipaddress, String options) throws IOException, 
	InterruptedException {
	String command = this.getProperties().getProperty("saltstack_bin");
	Process process = null;
	
	//Exeuction without topfile
	/*
	for(String state: states) {
		SaltstackCMTool.LOGGER.info("sudo " + command +  " -i -c " + basedir + " --roster-file " + roster.toString() + " " + ipaddress + " state.sls_id " + task + " " + state + ".*");
		
		if (options == null) {
			process = new ProcessBuilder("sudo", command, "-i", "-c", basedir, "--roster-file", roster.toString(), ipaddress, "state.sls_id", task, state+".*").inheritIO().start();
			SaltstackCMTool.LOGGER.info(process.toString());
		}
		else {
			process = new ProcessBuilder("sudo", command, "-i", "-c", basedir, "--roster-file", roster.toString(), ipaddress,"state.sls_id", task, state+".*", options).inheritIO().start();
			SaltstackCMTool.LOGGER.info(process.toString());
		}
	}*/
	
	//Execution with topfile
	
	SaltstackCMTool.LOGGER.info("sudo " + command +  " -i -c " + basedir + " --roster-file " + roster.toString() + " " + ipaddress + " state.apply");
	
	if (options == null) {
		process = new ProcessBuilder("sudo", command, "-i", "-c", basedir, "--roster-file", roster.toString(), ipaddress, "state.apply").inheritIO().start();
		SaltstackCMTool.LOGGER.info(process.toString());
	}
	else {
		process = new ProcessBuilder("sudo", command, "-i", "-c", basedir, "--roster-file", roster.toString(), ipaddress, "state.apply", options).inheritIO().start();
		SaltstackCMTool.LOGGER.info(process.toString());
	}
	
	process.waitFor();
	return process.exitValue();
}
	
	/**
	 * Creates an Ansible variables file at the given path from the AttributeStates of a given OCCI Entity.
	 * @param variablefile The Path where this variable file should be created.
	 * @param entity The entity for whichs AttributeStates the variable file should be created.
	 * @return The path where this variable file was created.
	 * @throws IOException
	 */
	public Path createVariableFile(Path variablefile, Entity entity) throws IOException{		
		String lb = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder();
		List<AttributeState> attributes  = new LinkedList<AttributeState>();
		
		// Collect all attribute states
		attributes.addAll(entity.getAttributes());
		for (MixinBase base: entity.getParts()) {
			attributes.addAll(base.getAttributes());
		}
		if (entity instanceof Component) {
			AttributeState modifiedAttribute = OCCIFactory.eINSTANCE.createAttributeState();
			modifiedAttribute.setName("ip_address");
			modifiedAttribute.setValue(getIPAddress((Resource) entity));
			attributes.add(modifiedAttribute);
		}
		
		// If the entity is a Resource, collect all attribute states of the connected Resources
		if (entity instanceof Resource) {
			Resource resource = (Resource) entity;
			for (Link link: resource.getLinks()) {
				Resource target = link.getTarget();
				List<AttributeState> collectedAttributes  = new LinkedList<AttributeState>();
				collectedAttributes.addAll(target.getAttributes());
				for (MixinBase base: target.getParts()) {
					collectedAttributes.addAll(base.getAttributes());
				}
				for (AttributeState attribute: collectedAttributes) {
					AttributeState modifiedAttribute = OCCIFactory.eINSTANCE.createAttributeState();
					modifiedAttribute.setName("id" + getTitle(target).replaceAll("[- ]","_") +  '_' + attribute.getName());
					modifiedAttribute.setValue(attribute.getValue());
					attributes.add(modifiedAttribute);
				}
				if (target instanceof Component) {
					AttributeState modifiedAttribute = OCCIFactory.eINSTANCE.createAttributeState();
					modifiedAttribute.setName("id" + getTitle(target).replaceAll("[- ]","_") + '_' + "ip_address");
					modifiedAttribute.setValue(getIPAddress(target));
					attributes.add(modifiedAttribute);
				}
			}
		}
		
		for (AttributeState attribute: attributes) {
			//  Ansible does not allow variable names with points, so we replace them with underscores
			String name = attribute.getName().replace('.', '_');
			sb.append(name);
			sb.append(": ");
			sb.append(attribute.getValue());
			sb.append(lb);
		}
		
		FileUtils.writeStringToFile(variablefile.toFile(), sb.toString(), (Charset) null);
		
		return variablefile;
	}


	public String getTitle(Resource resource) {
		if (resource.getTitle() != null)
			return resource.getTitle();
			
		for (AttributeState attribute: resource.getAttributes()) {
			if (attribute.getName().equals("occi.core.title"));
				return attribute.getValue();
		}
		
		return null;
	}


	public String getIPAddress(Resource resource) {
			EList<Link> links = resource.getLinks();
			Networkinterface networklink = null;
			Placementlink hosting = null;
			String ipaddress = null;
	
			for (Link link:links) {
				if (link instanceof Placementlink) {
					SaltstackCMTool.LOGGER.info("Found placementlink for " + getTitle(resource));
					hosting = (Placementlink) link;
					break;
				}	
			}
			if (hosting == null) {
				SaltstackCMTool.LOGGER.warn("No hosting found for component " + getTitle(resource) + ". Falling back to localhost.");
				ipaddress = "127.0.0.1";
				return ipaddress;					
			} else {
				Compute target = (Compute) hosting.getTarget();
				links = target.getLinks();
	
				List<Link> endpointCandidates = new LinkedList<Link>();
				
				for (Link link:links) {
					if (link instanceof Networkinterface) {
						SaltstackCMTool.LOGGER.info("Found network interface for " + target);
						endpointCandidates.add(link);
						for (MixinBase mixin: link.getParts()) {
							if (mixin instanceof Ansibleendpoint) {
								SaltstackCMTool.LOGGER.info("Found explicitly specified Ansible endpoint for " + target);
								networklink = (Networkinterface) link;
								endpointCandidates.clear();
								break;
							}
						}
					}
					if (networklink != null) {
						break;
					}
				}
				
				if (endpointCandidates.size() > 0) {
					networklink = (Networkinterface) endpointCandidates.get(0);
				}
				
				if (networklink == null) {
					SaltstackCMTool.LOGGER.error("No network interface found for " + target);	
				} else {
					// Retrieving object to ensure ip address is correct
					networklink.occiRetrieve();
					List<AttributeState> attributes  = new LinkedList<AttributeState>();
					attributes.addAll(networklink.getAttributes());
					for (MixinBase base: networklink.getParts()) {
						if (base instanceof Ipnetworkinterface) {
							ipaddress = ((Ipnetworkinterface) base).getOcciNetworkinterfaceAddress();
						}
					}
					if(ipaddress == null) {
					
					for (AttributeState attribute: attributes ) {
						SaltstackCMTool.LOGGER.debug(attribute.getName() + ":" + attribute.getValue());
						if (attribute.getName().equals("occi.networkinterface.address")) {
							SaltstackCMTool.LOGGER.info("Found IP address for " + networklink);
							ipaddress = attribute.getValue();
							SaltstackCMTool.LOGGER.info("IP address is " + ipaddress);
							break;
						}
					}
					}
				}
			}
	
			return ipaddress;
		}

}
