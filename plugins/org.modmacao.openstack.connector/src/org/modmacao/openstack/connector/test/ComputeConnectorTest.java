package org.modmacao.openstack.connector.test;

import org.eclipse.cmf.occi.infrastructure.Os_tpl;
import org.eclipse.cmf.occi.infrastructure.Resource_tpl;
import org.eclipse.cmf.occi.infrastructure.Ssh_key;
import org.junit.Before;
import org.junit.Test;
import org.modmacao.openstack.connector.ComputeConnector;
import org.modmacao.openstack.connector.ConnectorFactory;
import org.modmacao.openstack.connector.OpenStackHelper;
import org.openstack4j.api.OSClient.OSClientV2;
import org.openstack4j.model.compute.Server.Status;

import openstackruntime.Floatingip;
import openstackruntime.OpenstackruntimeFactory;

public class ComputeConnectorTest {
	private ComputeConnector cut = null;
	
	@Before
	public void setUp() {	
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
		
		Floatingip ip = OpenstackruntimeFactory.eINSTANCE.createFloatingip();
		ip.setOpenstackFloatingipPool("provider");
		
		cut.getParts().add(ip);
		
		//Networkinterface nic = factory.createNetworkinterface();
		
		//Network publicnet = factory.createNetwork();
		//publicnet.setId("d52754e0-6729-4034-adbb-8f1f3800f2c6");
		
		//nic.setTarget(publicnet);
		//cut.getLinks().add(nic);
		
	}
	
	@Test
	public void testOcciCreateAndDelete() {
		cut.occiCreate();
		
		OSClientV2 os = OpenStackHelper.getInstance().getOSClient();
		
		// wait until server is active
		while (os.compute().servers().get(OpenStackHelper.getInstance().getRuntimeID(cut)).getStatus() != Status.ACTIVE) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Server started, now waiting for 5 seconds before deleting it.");		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// then delete server
		cut.occiDelete();
	}
//	@Test
//	public void testOcciDelete() {
//		cut.occiDelete();
//	}

}
