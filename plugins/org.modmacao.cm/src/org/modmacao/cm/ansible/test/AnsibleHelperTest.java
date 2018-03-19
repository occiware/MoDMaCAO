package org.modmacao.cm.ansible.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.InfrastructureFactory;
import org.junit.Test;
import org.modmacao.cm.ansible.AnsibleHelper;


public class AnsibleHelperTest {
	@Test
	public void testCreateInventory() {
		AnsibleHelper helper = AnsibleHelper.getInstance();
		try {
			helper.createInventory("127.0.0.1", Paths.get("testdata/inventory"));
			
		} catch(IOException e) {
			fail("Should not throw exception.");
		}
	}
	
	
	@Test
	public void testCreateVariableFile() {
		AnsibleHelper helper = AnsibleHelper.getInstance();
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
		AnsibleHelper helper = AnsibleHelper.getInstance();
		try {
			ArrayList<String> roles = new ArrayList<String>();		
			roles.add("testrole");
			Path variablefile = Paths.get("testdata/variable.yaml");
			helper.createPlaybook("127.0.0.1", roles,
					"testuser", variablefile, Paths.get("testdata/playbook.yml"));
		} catch(IOException e) {
			fail("Should not throw exception.");
		}
	}
	
	@Test
	public void testCreateConfiguration() {
		AnsibleHelper helper = AnsibleHelper.getInstance();
		try {
			helper.createConfiguration(Paths.get("ansible.cfg"), Paths.get("testdata/testkey.pem"));
		} catch(IOException e) {
			fail("Should not throw exception.");
		}
	}
	
	@Test
	public void testExecutePlaybook() {
		AnsibleHelper helper = AnsibleHelper.getInstance();
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
			
			Path playbook = helper.createPlaybook("127.0.0.1", roles, 
					"ubuntu", variablefile, Paths.get("testdata/playbook.yml"));
			
			Path inventory = helper.createInventory("127.0.0.1", 
					Paths.get("testdata/inventory"));
			
			String options = "--connection=local";
			
			int status = helper.executePlaybook(playbook, "TEST", inventory, options);
			
			assertEquals(0, status);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("Should not throw exception.");
		}
		
	}
	@Test
	public void testGetProperties() {
		AnsibleHelper helper = AnsibleHelper.getInstance();
		Properties props = helper.getProperties();
		assertEquals("testuser", props.getProperty("ansible_user"));
	}
	



}
