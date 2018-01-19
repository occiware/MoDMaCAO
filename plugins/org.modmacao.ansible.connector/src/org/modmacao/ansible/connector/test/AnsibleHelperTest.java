package org.modmacao.ansible.connector.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.InfrastructureFactory;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.junit.Test;
import org.modmacao.ansible.connector.AnsibleHelper;


public class AnsibleHelperTest {
	@Test
	public void testCreateInventory() {
		AnsibleHelper helper = new AnsibleHelper();
		try {
			helper.createInventory("192.168.35.23", Paths.get("testdata/inventory"));
			
		} catch(IOException e) {
			fail("Should not throw exception.");
		}
	}
	
	
	@Test
	public void testCreateVariableFile() {
		AnsibleHelper helper = new AnsibleHelper();
		try {
			Compute vm = InfrastructureFactory.eINSTANCE.createCompute();
			AttributeState state1 = OCCIFactory.eINSTANCE.createAttributeState();
			state1.setName("occi.core.id");
			state1.setValue("12345");
			AttributeState state2 = OCCIFactory.eINSTANCE.createAttributeState();
			state2.setName("occi.core.title");
			state2.setValue("title");
			vm.getAttributes().add(state1);
			vm.getAttributes().add(state2);
			
			helper.createVariableFile(Paths.get("testdata/variable.yaml"), vm);
		} catch(IOException e) {
			fail("Should not throw exception.");
		}
	}
	
	@Test
	public void testCreatePlaybook() {
		AnsibleHelper helper = new AnsibleHelper();
		try {
			ArrayList<String> roles = new ArrayList<String>();		
			roles.add("testrole");
			Path variablefile = Paths.get("testdata/variable.yaml");
			helper.createPlaybook("192.168.35.23", roles,
					"testuser", variablefile, Paths.get("testdata/playbook.yml"));
		} catch(IOException e) {
			fail("Should not throw exception.");
		}
	}
	
	@Test
	public void testCreateConfiguration() {
		AnsibleHelper helper = new AnsibleHelper();
		try {
			helper.createConfiguration(Paths.get("ansible.cfg"), Paths.get("testdata/testkey.pem"));
		} catch(IOException e) {
			fail("Should not throw exception.");
		}
	}
	
	@Test
	public void testExecutePlaybook() {
		AnsibleHelper helper = new AnsibleHelper();
		try {
			ArrayList<String> roles = new ArrayList<String>();
			roles.add("testrole");
			
			helper.createConfiguration(Paths.get("ansible.cfg"), Paths.get("testdata/testkey.pem"));
			
			Entity entity = OCCIFactory.eINSTANCE.createResource();
			entity.setKind(OCCIFactory.eINSTANCE.createKind());
			AttributeState state1 = OCCIFactory.eINSTANCE.createAttributeState();
			state1.setName("occi.core.id");
			state1.setValue("12345");
			AttributeState state2 = OCCIFactory.eINSTANCE.createAttributeState();
			state2.setName("occi.platform.package");
			state2.setValue("apache2");
			entity.getAttributes().add(state1);
			entity.getAttributes().add(state2);
			
			helper.createVariableFile(Paths.get("testdata/variable.yaml"), entity);
			Path variablefile = Paths.get("testdata/variable.yaml");
			
			Path playbook = helper.createPlaybook("192.168.35.24", roles, 
					"ubuntu", variablefile, Paths.get("testdata/playbook.yml"));
			
			Path inventory = helper.createInventory("192.168.35.24", 
					Paths.get("testdata/inventory"));
			
			int status = helper.executePlaybook(playbook, "TEST", inventory);
			
			assertEquals(0, status);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("Should not throw exception.");
		}
		
	}
	@Test
	public void testGetProperties() {
		AnsibleHelper helper = new AnsibleHelper();
		Properties props = helper.getProperties();
		System.out.println(props.propertyNames());
		System.out.println(props.getProperty("test"));
	}
	



}
