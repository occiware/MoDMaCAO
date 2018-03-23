package org.modmacao.cm.ansible.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.InfrastructureFactory;
import org.eclipse.cmf.occi.infrastructure.Networkinterface;
import org.junit.Before;
import org.junit.Test;
import org.modmacao.cm.ansible.AnsibleCMTool;
import org.modmacao.mongodb.MongodbFactory;
import org.modmacao.occi.platform.Application;
import org.modmacao.occi.platform.Component;
import org.modmacao.occi.platform.impl.PlatformFactoryImpl;
import org.modmacao.placement.PlacementFactory;
import org.modmacao.placement.Placementlink;

public class AnsibleCMToolTest {
	AnsibleCMTool  cmtool = new AnsibleCMTool();
	Component cut;
	Application aut;
	
	
	@Before
	public void setUP() {		
		OcciRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/core#", "jar:file:////home/fglaser/occiware_current_03012017/plugins/org.eclipse.cmf.occi.core_1.0.0.201801031230.jar!/model/core.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/infrastructure#", "jar:file:////home/fglaser/occiware_current_03012017/plugins/org.eclipse.cmf.occi.infrastructure_1.0.0.201801031230.jar!/model/infrastructure.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/occi/platform#", "file:///home/fglaser/MoDMaCAO/plugins/org.modmacao.occi.platform/model/platform.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/modmacao#", "file:///home/fglaser/MoDMaCAO/plugins/org.modmacao.core/model/modmacao.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/placement#", "file:///home/fglaser/MoDMaCAO/plugins/org.modmacao.placement/model/placement.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/mongodb#", "file:///home/fglaser/MoDMaCAO/plugins/org.modmacao.mongodb/model/mongodb.occie");
		
		// Create component
		cut = new PlatformFactoryImpl().createComponent();
		
		cut.setTitle("shard1");
		MixinBase modmacaoComponentMixinBase = MongodbFactory.eINSTANCE.createShard();
		Mixin mixin = OCCIFactory.eINSTANCE.createMixin();
		mixin.setScheme("http://schemas.modmacao.org/modmacao#");
		mixin.setName("shard");
		modmacaoComponentMixinBase.setMixin(mixin);
		
		
		cut.getParts().add(modmacaoComponentMixinBase);
		AttributeState replicationset = OCCIFactory.eINSTANCE.createAttributeState();
		replicationset.setName("mongodb.replication.set.name");
		replicationset.setValue("shard1");
		
		cut.getAttributes().add(replicationset);
		
		// create compute 
		Compute vm1 = InfrastructureFactory.eINSTANCE.createCompute();
		vm1.setTitle("vm1");
			
		Networkinterface nic = InfrastructureFactory.eINSTANCE.createNetworkinterface();
		MixinBase ipNetworkMixinBase = InfrastructureFactory.eINSTANCE.createIpnetworkinterface();
		//Mixin ipmixin = OCCIFactory.eINSTANCE.createMixin();
		//ipNetworkMixinBase.setMixin(ipmixin);
		
		//ipmixin.setScheme("http://schemas.ogf.org/occi/infrastructure#");
		//ipmixin.setName("nic");
		//Attribute attribute = OCCIFactory.eINSTANCE.createAttribute();
		//ttribute.setName("occi.networkinterface.address");
		//ipmixin.getAttributes().add(attribute);
		
		AttributeState ipaddress = OCCIFactory.eINSTANCE.createAttributeState();
		ipaddress.setName("occi.networkinterface.address");
		ipaddress.setValue("192.168.35.28");
		ipNetworkMixinBase.getAttributes().add(ipaddress);
		nic.getParts().add(ipNetworkMixinBase);
		
		vm1.getLinks().add(nic);
		
		// set link between vm and component
		Placementlink link = PlacementFactory.eINSTANCE.createPlacementlink();
		link.setTarget(vm1);
		cut.getLinks().add(link);
		
		
	}
	
	@Test
	public void testComponentDeploy() {
		assertEquals(0, cmtool.deploy(cut));
	}
	
//	@Test
//	public void testComponentConfigure() {
//		cut.configure();
//	}
//	
//	@Test
//	public void testComponentStart() {
//		cut.start();
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
	
}
