package org.modmacao.cm.saltstack.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.InfrastructureFactory;
import org.junit.Test;
import org.modmacao.cm.ansible.AnsibleHelper;
import org.modmacao.cm.saltstack.SaltstackHelper;


public class SaltstackHelperTest {	
	@Test
	public void testCreateTopFile() {
		SaltstackHelper helper = new SaltstackHelper();
		try {
			ArrayList<String> roles = new ArrayList<String>();		
			roles.add("testrole");
			List<Path> variablefiles = new ArrayList<Path>();;
			Path pillarTopFile = helper.createPillarTopfile("127.0.0.1", roles, variablefiles, 
					Paths.get("testdata/pillar/top.sls"));
			
			helper.createTopfile("127.0.0.1", roles,
					"testuser", Paths.get("testdata/top.sls"));
		} catch(IOException e) {
			fail("Should not throw exception.");
		}
	}
	
	@Test
	public void testCreateConfiguration() {
		SaltstackHelper helper = new SaltstackHelper();
		try {
			helper.createMasterConfiguration(Paths.get("testdata/master"), Paths.get("SomeTmpDir").toString());
		} catch(IOException e) {
			fail("Should not throw exception.");
		}
	}
	
	@Test
	public void testCreateRoster() {
		SaltstackHelper helper = new SaltstackHelper();
		try {
			helper.createRoster("127.0.0.1", Paths.get("testdata/roster"));
		} catch(IOException e) {
			fail("Should not throw exception.");
		}
	}
	
	@Test
	public void testExecutePlaybook() {
		SaltstackHelper helper = new SaltstackHelper();
		try {
			ArrayList<String> roles = new ArrayList<String>();
			roles.add("testrole");
			
			helper.createMasterConfiguration(Paths.get("testdata/master"), Paths.get("testdata").toString());
			
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
			
			List<Path> variablefiles = new ArrayList<Path>();
			Path pillarTopFile = helper.createPillarTopfile("127.0.0.1", roles, variablefiles, 
					Paths.get("testdata/pillar/top.sls"));
			
			Path topFile = helper.createTopfile("127.0.0.1", roles,
					"testuser", Paths.get("testdata/top.sls"));
			
			Path roster =helper.createRoster("127.0.0.1", Paths.get("testdata/roster"));
			
			String options = "";
			
			int status = helper.executeSaltstack(Paths.get("testdata").toString(), roles, "TEST", roster, "127.0.0.1", options);
			
			assertEquals(0, status);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("Should not throw exception.");
		}
		
	}
	@Test
	public void testGetProperties() {
		SaltstackHelper helper = new SaltstackHelper();
		Properties props = helper.getProperties();
		assertEquals("ubuntu", props.getProperty("saltstack_user"));
	}
	



}
