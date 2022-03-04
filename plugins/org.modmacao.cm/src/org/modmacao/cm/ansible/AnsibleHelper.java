package org.modmacao.cm.ansible;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface;
import org.eclipse.cmf.occi.infrastructure.Networkinterface;
import org.eclipse.emf.common.util.EList;
import org.modmacao.ansibleconfiguration.Ansibleendpoint;
import org.modmacao.occi.platform.Component;
import org.modmacao.placement.Placementlink;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
* This class provides utility methods for the configuration management tool Ansible.
* @author Fabian Korte - UGOE
*/
public final class AnsibleHelper {
	Properties props;
	
	public AnsibleHelper() {
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

    		String filename = "ansible.properties";
    		
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
	
	
	/**
	 * Creates an Ansible inventory file at the given path with the given IP address.
	 * @param ipaddress The IP address that should be added to the inventory.
	 * @param path The path where the inventory file should be created.
	 * @return The path where the inventory was created.
	 * @throws IOException
	 */
	public Path createInventory(String ipaddress, Path path) throws IOException {
		FileUtils.writeStringToFile(path.toFile(), ipaddress, (Charset) null);
		return path;
	}
	
	/**
	 * Creates a Ansible playbook, with host given by ipaddress, roles given by roles,
	 * the remote user, given by user, a link to a variable file, given by variables
	 * at path path.
	 * @param ipaddress The ipaddres of the host on which this playbook shoule be executed.
	 * @param roles The roles that should be executed on the host.
	 * @param user The user that is used to connect to the host.
	 * @param variables A list of paths to the variables file that should be used. 
	 * @param path The path where this playbook should be created.
	 * @return The path where this playbook was created.
	 * @throws IOException
	 */
	public Path createPlaybook(String ipaddress, List<String> roles, String user, List<Path> variables,
			Path path) throws IOException {
		String lb = System.getProperty("line.separator");
		String offset = "  ";
		StringBuilder sb = new StringBuilder("---");
		sb.append(lb);
		sb.append("- hosts: ").append(ipaddress).append(lb);
		sb.append(offset).append("remote_user: ").append(user).append(lb);
		sb.append(offset).append("become: yes").append(lb);
		sb.append(offset).append("vars_files: ").append(lb);
		for (Path variablepath: variables) {
			sb.append(offset).append(offset).append("- ").append(variablepath.toAbsolutePath().toString()).append(lb);
		}
		sb.append(offset).append("roles:").append(lb);
		
		for (String role: roles) {
			sb.append(offset).append(offset).append("- ").append(role).append(lb);
		}
		
		FileUtils.writeStringToFile(path.toFile(), sb.toString(), (Charset) null);
		return path;
	}
	
	/**
	 * Creates an Ansible configuration at the given path linking to a private key file given by a path.
	 * @param configuration The path where this configuration should be created.
	 * @param keyPath The path to the private key file which should be used in the configuration.
	 * @return The path where the configuration was created.
	 * @throws IOException
	 */
	public Path createConfiguration(Path configuration, Path keyPath) throws IOException{
		String lb = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder("[defaults]").append(lb);
		sb.append("timeout = ").append(this.getProperties().getProperty("ssh_timeout")).append(lb);
		sb.append("roles_path = ").append(this.getProperties().getProperty("ansible_rolespath")).append(lb);
		sb.append("private_key_file = ").append(keyPath.toString()).append(lb);
		sb.append("[ssh_connection]").append(lb);
		sb.append("ssh_args = -o UserKnownHostsFile=/dev/null -o StrictHostKeyChecking=no").append(lb);
		FileUtils.writeStringToFile(configuration.toFile(), sb.toString(), (Charset) null);
		return configuration;
	}
	
	/**
	 * Executes an Ansible playbook.
	 * @param playbook The path to the Ansible playbook.
	 * @param task The task that should be executed (used to select block in Ansible playbook)
	 * @param inventory The inventory that should be used.
	 * @param options Additional options that should be handed over to the call of the Ansible binary. 
	 * @return The return code of the external Ansible binary.
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public AnsibleReturnState executePlaybook(Path playbook, String task, Path inventory, String options) throws IOException, 
		InterruptedException {
		String command = this.getProperties().getProperty("ansible_bin");
		Process process = null;
		String message = null;
		
		if (options == null) {
			process = new ProcessBuilder(command, "--inventory", inventory.toString(),
				"-e", "task=" + task, 
				playbook.toString()).start();
		}
		else {
			process = new ProcessBuilder(command, "--inventory", inventory.toString(),
					"-e", "task=" + task, 
					playbook.toString(), options).start();
		}
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(new BufferedReader(new InputStreamReader(process.getInputStream()))
					  .lines().collect(Collectors.joining(System.lineSeparator())));
		
		process.waitFor();
				
		message = buffer.toString();
		System.out.println(message);
		
		return new AnsibleReturnState(process.exitValue(), message);
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
	
	/**
	 * Creates an extended Ansible variables file with Acceleo.
	 * @param variablepath The Path where this variable file should be created.
	 * @param entity The entity for whichs AttributeStates the variable file should be created.
	 * @return The path where this variable file was created.
	 * @throws IOException
	 */
	public Path createExtendedVariableFile(Path variablepath, Entity entity) throws IOException{
		
		VariablesGenerator gen = new VariablesGenerator(entity, 
				variablepath.toFile(), new ArrayList<String>());
		gen.doGenerate(null);
		
		return Paths.get(variablepath.toString(), "vars2.yaml"); 
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
	
	public Ansibleendpoint getAnsibleEndboint(Resource resource) {
		EList<Link> links = resource.getLinks();
		Networkinterface networklink = null;
		Placementlink hosting = null;

		for (Link link:links) {
			if (link instanceof Placementlink) {
				AnsibleCMTool.LOGGER.info("Found placementlink for " + getTitle(resource));
				hosting = (Placementlink) link;
				break;
			}	
		}
		if (hosting == null) {
			AnsibleCMTool.LOGGER.warn("No hosting found for component " + getTitle(resource) + ". Falling back to localhost.");
			return null;					
		} else {
			Compute target = (Compute) hosting.getTarget();
			links = target.getLinks();

			List<Link> endpointCandidates = new LinkedList<Link>();
			
			for (Link link:links) {
				if (link instanceof Networkinterface) {
					AnsibleCMTool.LOGGER.info("Found network interface for " + target);
					endpointCandidates.add(link);
					for (MixinBase mixin: link.getParts()) {
						if (mixin instanceof Ansibleendpoint) {
							AnsibleCMTool.LOGGER.info("Found explicitly specified Ansible endpoint for " + target);
							return (Ansibleendpoint) mixin;
						}
					}
				}
			}
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
					AnsibleCMTool.LOGGER.info("Found placementlink for " + getTitle(resource));
					hosting = (Placementlink) link;
					break;
				}	
			}
			if (hosting == null) {
				AnsibleCMTool.LOGGER.warn("No hosting found for component " + getTitle(resource) + ". Falling back to localhost.");
				ipaddress = "127.0.0.1";
				return ipaddress;					
			} else {
				Compute target = (Compute) hosting.getTarget();
				links = target.getLinks();
	
				List<Link> endpointCandidates = new LinkedList<Link>();
				
				for (Link link:links) {
					if (link instanceof Networkinterface) {
						AnsibleCMTool.LOGGER.info("Found network interface for " + target);
						endpointCandidates.add(link);
						for (MixinBase mixin: link.getParts()) {
							if (mixin instanceof Ansibleendpoint) {
								AnsibleCMTool.LOGGER.info("Found explicitly specified Ansible endpoint for " + target);
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
					AnsibleCMTool.LOGGER.error("No network interface found for " + target);	
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
}
