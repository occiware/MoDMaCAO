package org.modmacao.openstack.connector.test;

import org.junit.Before;
import org.junit.Test;
import org.modmacao.openstack.connector.ConnectorFactory;
import org.modmacao.openstack.connector.OpenStackHelper;
import org.modmacao.openstack.connector.StorageConnector;
import org.openstack4j.api.OSClient.OSClientV2;
import org.openstack4j.model.storage.block.Volume.Status;

public class StorageConnectorTest {
	private StorageConnector cut = null;
	
	@Before
	public void setUp() {	
//		InfrastructurePackage.eINSTANCE.eClass();
//		OcciRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/infrastructure#", 
//				"jar:file:////home/fglaser/occiware_current_03012017/plugins/org.eclipse.cmf.occi."
//				+ "infrastructure_1.0.0.201801031230.jar!/model/infrastructure.occie");
//				
//		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/openstack/runtime#", 
//				"file:////home/fglaser/occiware_current/workspace/org.modmacao.openstack.runtime/model/openstackruntime.occie");
//		
//		OcciRegistry.getInstance().registerExtension("http://schemas.modmacao.org/openstack/swe#", 
//				"file:////home/fglaser/occiware_current/workspace/org.modmacao.openstack.swe.runtime/model/ossweruntime.occie");
//		
		ConnectorFactory factory = new ConnectorFactory();
		cut = (StorageConnector) factory.createStorage();
		
		cut.setTitle("TestStorage");
		cut.setOcciStorageSize(100f);
		
	}
	
	@Test
	public void testOcciCreateAndDelete() {
		cut.occiCreate();
		
		OSClientV2 os = OpenStackHelper.getInstance().getOSClient();
		
		// wait until storage is present
		while (os.blockStorage().volumes().get(OpenStackHelper.getInstance().getRuntimeID(cut)).getStatus() != Status.AVAILABLE) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Volume available, now waiting for 5 seconds before deleting it.");		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// then delete storage
		cut.occiDelete();
	}
}
