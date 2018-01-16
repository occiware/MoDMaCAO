package org.modmacao.ansible.connector.test;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.impl.OCCIFactoryImpl;
import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.InfrastructureFactory;
import org.eclipse.cmf.occi.infrastructure.Networkinterface;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.Test;
import org.modmacao.ansible.connector.ComponentConnector;
import org.modmacao.ansible.connector.ConnectorFactory;
import org.modmacao.occi.platform.Component;
import org.modmacao.occi.platform.PlatformFactory;
import org.modmacao.occi.platform.PlatformPackage;
import org.modmacao.occi.platform.impl.PlatformFactoryImpl;
import org.modmacao.placement.PlacementFactory;
import org.modmacao.placement.Placementlink;
import org.slf4j.LoggerFactory;

import com.sun.org.apache.bcel.internal.generic.NEW;

import modmacao.ModmacaoFactory;
import modmacao.ModmacaoPackage;
import modmacao.impl.ModmacaoFactoryImpl;

public class ComponentConnectorTest {
	Component cut;
	
	
	@Before
	public void setUP() {
		org.apache.log4j.BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.DEBUG);
		
		OcciRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/core#", "jar:file:////home/fglaser/occiware_current_03012017/plugins/org.eclipse.cmf.occi.core_1.0.0.201801031230.jar!/model/core.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/infrastructure#", "jar:file:////home/fglaser/occiware_current_03012017/plugins/org.eclipse.cmf.occi.infrastructure_1.0.0.201801031230.jar!/model/infrastructure.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/occi/platform#", "file:///home/fglaser/MoDMaCAO/plugins/org.modmacao.occi.platform/model/platform.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/modmacao#", "file:///home/fglaser/MoDMaCAO/plugins/org.modmacao.core/model/modmacao.occie");
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/placement#", "file:///home/fglaser/MoDMaCAO/plugins/org.modmacao.placement/model/placement.occie");
		
		// Create component
		cut = new ConnectorFactory().createComponent();
		cut.setTitle("shard1");
		MixinBase modmacaoComponentMixinBase = ModmacaoFactory.eINSTANCE.createComponent();
		Mixin mixin = OCCIFactory.eINSTANCE.createMixin();
		mixin.setScheme("http://schemas.modmacao.org/modmacao#");
		mixin.setName("shard");
		modmacaoComponentMixinBase.setMixin(mixin);
		cut.getParts().add(modmacaoComponentMixinBase);
		
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
		cut.deploy();
	}
	
	@Test
	public void testComponentUndeploy() {
		cut.undeploy();
	}

}
