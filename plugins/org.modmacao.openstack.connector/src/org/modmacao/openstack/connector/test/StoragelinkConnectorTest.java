package org.modmacao.openstack.connector.test;

import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.cmf.occi.infrastructure.Ssh_key;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.modmacao.openstack.connector.ComputeConnector;
import org.modmacao.openstack.connector.ConnectorFactory;
import org.modmacao.openstack.connector.StorageConnector;
import org.modmacao.openstack.connector.StoragelinkConnector;

import openstackruntime.OpenstackruntimePackage;

public class StoragelinkConnectorTest {
	private StoragelinkConnector slut = null;	
	private ComputeConnector cut = null;
	private StorageConnector sut = null;
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
		
		slut = (StoragelinkConnector) factory.createStoragelink();		
		sut = (StorageConnector) factory.createStorage();
		
		sut.setTitle("Storage1");
		sut.setOcciStorageSize(100f);
		
		sut.occiCreate();
		
		slut.setTarget(sut);
		slut.setSource(cut);
	}

	@Test
	public void testOcciCreateAndOcciDelete() {
		slut.occiCreate();
		slut.occiDelete();
	}
	
	@After
	public void tearDown() throws Exception{
		cut.occiDelete();
		sut.occiDelete();
	}
	
	

}
