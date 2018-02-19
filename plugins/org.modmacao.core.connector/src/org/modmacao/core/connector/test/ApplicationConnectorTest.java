package org.modmacao.core.connector.test;


import static org.junit.Assert.assertEquals;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.Test;
import org.modmacao.core.connector.ApplicationConnector;
import org.modmacao.occi.platform.Status;


public class ApplicationConnectorTest {
	ApplicationConnector aut;
	
	
	@Before
	public void setUP() {
		//org.apache.log4j.BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.DEBUG);
		
		org.eclipse.cmf.occi.platform.PlatformPackage.eINSTANCE.eClass();
//		ModmacaoPackage.eINSTANCE.eClass();
//		PlatformPackage.eINSTANCE.eClass();
//		MongodbPackage.eINSTANCE.eClass();
//		PlacementPackage.eINSTANCE.eClass();
		
//		OcciRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/core#", "jar:file:////home/fglaser/occiware_current_03012017/plugins/org.eclipse.cmf.occi.core_1.0.0.201801031230.jar!/model/core.occie");
//		OcciRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/infrastructure#", "jar:file:////home/fglaser/occiware_current_03012017/plugins/org.eclipse.cmf.occi.infrastructure_1.0.0.201801031230.jar!/model/infrastructure.occie");
//		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/occi/platform#", "file:///home/fglaser/MoDMaCAO/plugins/org.modmacao.occi.platform/model/platform.occie");
//		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/modmacao#", "file:///home/fglaser/MoDMaCAO/plugins/org.modmacao.core/model/modmacao.occie");
//		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/placement#", "file:///home/fglaser/MoDMaCAO/plugins/org.modmacao.placement/model/placement.occie");
//		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/mongodb#", "file:///home/fglaser/MoDMaCAO/plugins/org.modmacao.mongodb/model/mongodb.occie");
			
//		// Load test configuration
//		List<Path> extensions = new ArrayList<Path>();
//		extensions.add(Paths.get("file://home/fglaser/MoDMaCAO/plugins/org.modmacao.occi.platform/model/platform.occie"));
//		extensions.add(Paths.get("file://home/fglaser/MoDMaCAO/plugins/org.modmacao.mongodb/model/mongodb.occie"));
//		extensions.add(Paths.get("file://home/fglaser/MoDMaCAO/plugins/org.modmacao.placement/model/placement.occie"));
		
		
		
		Path occiPath = Paths.get("file://home/fglaser/MoDMaCAO/plugins/org.modmacao.mongodb.example/model-anonymous.occic");
		OCCIPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("occie", new OCCIResourceFactoryImpl());
		m.put("occic", new OCCIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		String file = occiPath.toString();
	    //URI fileURI = URI.createURI(path.toString());
	    URI fileURI = URI.createURI(file);
	    Resource resource = resSet.getResource(fileURI, true);
		
		
		Configuration configuration =  (Configuration) resource.getContents().get(0);
		
		aut = (ApplicationConnector) configuration.getResources().get(0);
		
		
	}
	
//	@Test
//	public void testComponentDeploy() {
//		aut.deploy();
//	}
	
//	@Test
//	public void testComponentConfigure() {
//		cut.configure();
//	}
//	
//	@Test
//	public void testComponentStart() {
//		aut.stop();
//		assertEquals(Status.ACTIVE_VALUE, aut.getOcciAppState().getValue());
//	}
//	
//	@Test
//	public void testComponentStop() {
//		cut.stop();
//	}
//	
//	@Test
//	public void testComponentUndeploy() {
//		cut.undeploy();
//	}
//	
	@Test
	public void testComponentFullLifeCycle() {
		aut.deploy();
		assertEquals(Status.DEPLOYED, aut.getOcciAppState());
		aut.configure();
		assertEquals(Status.INACTIVE, aut.getOcciAppState());
		aut.start();
		assertEquals(Status.ACTIVE, aut.getOcciAppState());
		aut.stop();
		assertEquals(Status.INACTIVE, aut.getOcciAppState() );
		aut.undeploy();
		assertEquals(Status.UNDEPLOYED, aut.getOcciAppState());
	}
}
