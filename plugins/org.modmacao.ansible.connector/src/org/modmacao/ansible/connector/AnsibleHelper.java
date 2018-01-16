package org.modmacao.ansible.connector;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Entity;

public class AnsibleHelper {
	
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
		sb.append("roles_path = /home/fglaser/occiware_current/workspace/org.modmacao.ansible.connector.test/roles").append(lb);
		sb.append("ssh_args = -o StrictHostKeyChecking=no").append(lb);
		sb.append("private_key_file = " + keyPath.toString());
		
		FileUtils.writeStringToFile(configuration.toFile(), sb.toString(), (Charset) null);
		return configuration;
	}
	
	public int executePlaybook(Path playbook, Path inventory) throws IOException, 
		InterruptedException {
		// TODO: Command path should not be hardcoded, but instead be given by configuration file
		String command = "/usr/local/bin/ansible-playbook";
		Process process = new ProcessBuilder(command, "--inventory", inventory.toString(), 
				playbook.toString())
				.inheritIO().start();
		process.waitFor();
		return process.exitValue();
	}
	
	public Path createVariableFile(Path variablefile, Entity entity) throws IOException{
		String lb = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder();
		for (AttributeState attribute: entity.getAttributes()) {
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
