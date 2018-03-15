package org.modmacao.openstack.connector.test;


import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.cmf.occi.infrastructure.Ipnetwork;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.modmacao.openstack.connector.ConnectorFactory;
import org.modmacao.openstack.connector.NetworkConnector;

public class NetworkConnectorTest {
	private NetworkConnector nut = null;

	@Before
	public void setUp() throws Exception {
		InfrastructurePackage.eINSTANCE.eClass();
		OcciRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/infrastructure#", 
				"jar:file:////home/fglaser/occiware_current_03012017/plugins/org.eclipse.cmf.occi."
				+ "infrastructure_1.0.0.201801031230.jar!/model/infrastructure.occie");
		
		ConnectorFactory factory = new ConnectorFactory();
		nut = (NetworkConnector) factory.createNetwork();
		Ipnetwork ipnetwork = factory.createIpnetwork();
		ipnetwork.setOcciNetworkAddress("10.0.0.1/24");
		nut.getParts().add(ipnetwork);
		
		nut.setTitle("test-network");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOCCICreateAndDelete() {
		nut.occiCreate();
		nut.occiDelete();
	}
}
