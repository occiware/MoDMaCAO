package org.modmacao.openstack.connector;

import org.openstack4j.api.OSClient.OSClientV2;
import org.openstack4j.openstack.OSFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenStackHelper {
	private static Logger LOGGER = LoggerFactory.getLogger(ComputeConnector.class);
	private static OSClientV2 os = null;
	
	public static OSClientV2 getOSClient() {
		//if (os == null) {
			os = OSFactory.builderV2()
				.endpoint("http://192.168.34.1:5000/v2.0")
	            .credentials("fglaser","eCzA2017")
	            .tenantName("fglaser")
	            .authenticate();
		//}
			
		return os;
	}
	
	public static String getDefaultFlavor() {
		return "36637a26-fded-4635-b6c5-ec8ec0745eab";
	}
	
	public static String getDefaultImage() {
		return "adf63ddc-debe-4d7e-b899-b936e989439f";
	}
	
	public static String getDefaultNetwork() {
		return "29d78078-fb4c-47aa-a9af-b8aaf3339590";
	}
}
