package org.modmacao.openstack.connector.test;

import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.cmf.occi.infrastructure.Network;
import org.eclipse.cmf.occi.infrastructure.Ssh_key;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.modmacao.openstack.connector.ComputeConnector;
import org.modmacao.openstack.connector.ConnectorFactory;
import org.modmacao.openstack.connector.NetworkinterfaceConnector;

import com.sun.xml.internal.ws.wsdl.parser.RuntimeWSDLParser;

import openstackruntime.OpenstackruntimePackage;
import openstackruntime.Runtimeid;
import ossweruntime.OssweruntimePackage;

public class NetworkinterfaceConnectorTest {
	private NetworkinterfaceConnector niut = null;	
	private ComputeConnector cut = null;
	@Before
	public void setUp() throws Exception {
		InfrastructurePackage.eINSTANCE.eClass();
		OcciRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/infrastructure#", 
				InfrastructurePackage.class.getClassLoader().getResource("model/Infrastructure.occie").toString());
		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/openstack/runtime#", 
				OpenstackruntimePackage.class.getClassLoader().getResource("model/openstackruntime.occie").toString());
		
		
		ConnectorFactory factory = new ConnectorFactory();
		cut = (ComputeConnector) factory.createCompute();
		
		
		cut.setTitle("vm1");
		Ssh_key key = factory.createSsh_key();
		
		key.setOcciCredentialsSshPublickey("ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC3y+/DnTyhETdDGREFT9Pzq"
				+ "A3DWY3h5O5l0cgRu37NiWSyHJUD8RgdRXd/GtJ4iNQqudvvABNYR65304o6ayO9nZKsyL4Q0o789eCiqk6oU/g"
				+ "Y7t8LotJYpvk5Hn+bEznaykmZmOJ/56vSigntUKjke0TMCOrnzof765mapePZkT4Vqj1gD6owpLceGd3iLK8kd"
				+ "+iKISyp9Ca4Q1D6hXmLdw0aB4t8eJr+rulPvjU1WoqE/miU76+Qj5/foMNwiEJN2GpNSUdTv9+FBpi4AESGpeO"
				+ "ukVlOsZQshmKzeQqUnjb/R8ZSjebZOwmE+KZBHg39iIiqumK4vppYhk5huUeV");
		
		
		cut.getParts().add(key);
		
		cut.occiCreate();
		
		niut = (NetworkinterfaceConnector) factory.createNetworkinterface();
		
		//Ipnetworkinterface ipmixin = factory.createIpnetworkinterface();
		//ipmixin.setOcciNetworkinterfaceAddress("10.0.0.25");
		
		//niut.getParts().add(ipmixin);
		Network publicnet = factory.createNetwork();
		//TODO: Fix test to use runtime id mixin
		
		publicnet.setId("29d78078-fb4c-47aa-a9af-b8aaf3339590");
		
		niut.setTarget(publicnet);
		niut.setSource(cut);
	}

	@Test
	public void testOcciCreateAndOcciDelete() {
		niut.occiCreate();	
		niut.occiDelete();
	}
	
	@After
	public void tearDown() throws Exception{
		cut.occiDelete();
	}
	
	

}
