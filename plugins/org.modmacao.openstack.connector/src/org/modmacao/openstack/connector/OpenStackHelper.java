package org.modmacao.openstack.connector;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.openstack4j.api.OSClient.OSClientV2;
import org.openstack4j.openstack.OSFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import openstackruntime.Runtimeid;

public final class OpenStackHelper {
	private static Logger LOGGER = LoggerFactory.getLogger(ComputeConnector.class);
	private OSClientV2 os = null;
	private Properties props;
	
	private static OpenStackHelper helper;
	
	private OpenStackHelper() {
		loadProperties();
	}
	
	private void loadProperties() {
		props = new Properties();
		InputStream input = null;

		try {

			String filename = "openstack.properties";

			// try to load bundle
			Bundle bundle = FrameworkUtil.getBundle(this.getClass());
			if (bundle != null) {
				URL url = FrameworkUtil.getBundle(this.getClass()).getResource(filename);
				input = url.openConnection().getInputStream();
			}

			if (input == null) {
				// try to read properties without BundleLoader
				input = this.getClass().getClassLoader().getResourceAsStream(filename);	
			}

			props.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally{
			if(input!=null){
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}	

	}

	public static OpenStackHelper getInstance() {
		if (OpenStackHelper.helper == null) {
			OpenStackHelper.helper = new OpenStackHelper();
		}
		return OpenStackHelper.helper;
	}
	
	public Properties getProperties() {
		if (props == null)
			loadProperties();
		
		return props;
	}
	
	public OSClientV2 getOSClient() {
		//if (os == null) {
		String endpoint = this.getProperties().getProperty("openstack_endpoint");
		String username = this.getProperties().getProperty("openstack_username");
		String tenant = this.getProperties().getProperty("openstack_tenant");
		String password = this.getProperties().getProperty("openstack_password");
		
		os = OSFactory.builderV2()
				.endpoint(endpoint)
	            .credentials(username, password)
	            .tenantName(username)
	            .authenticate();
		//}
			
		return os;
	}
	
	public String getDefaultFlavor() {
		return this.getProperties().getProperty("openstack_default_flavor");
	}
	
	public String getDefaultImage() {
		return this.getProperties().getProperty("openstack_default_image");
	}
	
	public String getDefaultNetwork() {
		return this.getProperties().getProperty("openstack_default_network");
	}
	
	public String getRuntimeID(Entity entity) {
		for (MixinBase mixin: entity.getParts()) {
			if (mixin instanceof Runtimeid) {
				String runtimeid = ((Runtimeid) mixin).getOpenstackRuntimeId();
				return runtimeid;
			}		
		}
		return null;
	}
	
	public void removeRuntimeID(Entity entity) {
		MixinBase runtimeid = null;
		for (MixinBase mixin: entity.getParts()) {
			if (mixin instanceof Runtimeid) {
				runtimeid = mixin;
			}
		}	
		entity.getParts().remove(runtimeid);	
	}
}
