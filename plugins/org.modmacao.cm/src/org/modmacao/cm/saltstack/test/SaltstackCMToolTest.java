package org.modmacao.cm.saltstack.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.InfrastructureFactory;
import org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface;
import org.eclipse.cmf.occi.infrastructure.Networkinterface;
import org.junit.Before;
import org.junit.Test;
import org.modmacao.ansibleconfiguration.Ansibleconfiguration;
import org.modmacao.ansibleconfiguration.AnsibleconfigurationFactory;
import org.modmacao.ansibleconfiguration.Ansibleendpoint;
import org.modmacao.cm.ansible.AnsibleCMTool;
import org.modmacao.occi.platform.Application;
import org.modmacao.occi.platform.Component;
import org.modmacao.occi.platform.impl.PlatformFactoryImpl;
import org.modmacao.placement.PlacementFactory;
import org.modmacao.placement.Placementlink;

import modmacao.impl.ModmacaoFactoryImpl;

public class SaltstackCMToolTest {
	AnsibleCMTool  cmtool = new AnsibleCMTool();
	Component cut;
	Application aut;
	
	
	@Before
	public void setUP() {
		// Create component
		cut = new PlatformFactoryImpl().createComponent();
		
		cut.setTitle("shard1");
		MixinBase modmacaoComponentMixinBase = new ModmacaoFactoryImpl().createComponent();
		Mixin mixin = OCCIFactory.eINSTANCE.createMixin();
		mixin.setScheme("http://schemas.modmacao.org/modmacao#");
		mixin.setName("testrole");
		modmacaoComponentMixinBase.setMixin(mixin);
				
		cut.getParts().add(modmacaoComponentMixinBase);

		
		// create compute 
		Compute vm1 = InfrastructureFactory.eINSTANCE.createCompute();
		vm1.setTitle("vm1");
			
		Networkinterface nic = InfrastructureFactory.eINSTANCE.createNetworkinterface();
		Ipnetworkinterface ipNetworkMixinBase = InfrastructureFactory.eINSTANCE.createIpnetworkinterface();
	
		Ansibleendpoint ansibleendpoint = AnsibleconfigurationFactory.eINSTANCE.createAnsibleendpoint();
		
		AttributeState ipaddress = OCCIFactory.eINSTANCE.createAttributeState();
		ipaddress.setName("occi.networkinterface.address");
		// we set ip both as AttributeState and member variable, since otherwise we might encounter inconsistencies
		ipaddress.setValue("127.0.0.1");
		ipNetworkMixinBase.setOcciNetworkinterfaceAddress("127.0.0.1");
		ipNetworkMixinBase.getAttributes().add(ipaddress);
		nic.getParts().add(ipNetworkMixinBase);
		nic.getParts().add(ansibleendpoint);
		
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
