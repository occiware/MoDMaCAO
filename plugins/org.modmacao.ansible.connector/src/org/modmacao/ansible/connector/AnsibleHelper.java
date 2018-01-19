package org.modmacao.ansible.connector;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.MixinBase;

public class AnsibleHelper {
	
	private Properties props = null;
	
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
    		input = this.getClass().getClassLoader().getResourceAsStream(filename);

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
	
	
	public Path createInventory(String ipaddress, Path path) throws IOException {
		FileUtils.writeStringToFile(path.toFile(), ipaddress, (Charset) null);
		return path;
	}
	
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
	
	public Path createConfiguration(Path configuration, Path keyPath) throws IOException{
		String lb = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder("[defaults]").append(lb);
		// TODO: Roles path should not be hardcoded, but instead be given by configuration file
		//sb.append("roles_path = /opt/ansibleconnector/roles").append(lb);
		sb.append("roles_path = ").append(this.getProperties().getProperty("ansible_rolespath")).append(lb);
		sb.append("ssh_args = -o StrictHostKeyChecking=no").append(lb);
		sb.append("private_key_file = ").append(keyPath.toString());
		
		FileUtils.writeStringToFile(configuration.toFile(), sb.toString(), (Charset) null);
		return configuration;
	}
	
	public int executePlaybook(Path playbook, String task, Path inventory) throws IOException, 
		InterruptedException {
		String command = this.getProperties().getProperty("ansible_bin");
		Process process = new ProcessBuilder(command, "--inventory", inventory.toString(),
				"-e", "task=" + task,
				playbook.toString())
				.inheritIO().start();
		process.waitFor();
		return process.exitValue();
	}
	
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
