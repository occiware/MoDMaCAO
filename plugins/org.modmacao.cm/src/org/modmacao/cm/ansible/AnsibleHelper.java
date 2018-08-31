package org.modmacao.cm.ansible;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.MixinBase;
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
	 * @param variables A path to the variables file that should be used. 
	 * @param path The path where this playbook should be created.
	 * @return The path where this playbook was created.
	 * @throws IOException
	 */
	public Path createPlaybook(String ipaddress, List<String> roles, String user, Path variables,
			Path path) throws IOException {
		String lb = System.getProperty("line.separator");
		String offset = "  ";
		StringBuilder sb = new StringBuilder("---");
		sb.append(lb);
		sb.append("- hosts: ").append(ipaddress).append(lb);
		sb.append(offset).append("remote_user: ").append(user).append(lb);
		sb.append(offset).append("become: yes").append(lb);
		sb.append(offset).append("vars_files: ").append(lb);
		sb.append(offset).append(offset).append("- ").append(variables.toAbsolutePath().toString()).append(lb);
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
	public int executePlaybook(Path playbook, String task, Path inventory, String options) throws IOException, 
		InterruptedException {
		String command = this.getProperties().getProperty("ansible_bin");
		Process process = null;
		if (options == null) {
			process = new ProcessBuilder(command, "--inventory", inventory.toString(),
				"-e", "task=" + task, 
				playbook.toString()).inheritIO().start();
		}
		else {
			process = new ProcessBuilder(command, "--inventory", inventory.toString(),
					"-e", "task=" + task, 
					playbook.toString(), options).inheritIO().start();
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
}
