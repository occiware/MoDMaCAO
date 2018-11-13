/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 * - Fabian Korte <fabian.korte@cs.uni-goettingen.de>
 *
 * Generated at Fri Mar 02 15:56:56 CET 2018 from platform:/plugin/org.eclipse.cmf.occi.infrastructure/model/Infrastructure.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.modmacao.openstack.connector;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.infrastructure.Networkinterface;
import org.eclipse.cmf.occi.infrastructure.Os_tpl;
import org.eclipse.cmf.occi.infrastructure.Resource_tpl;
import org.eclipse.cmf.occi.infrastructure.RestartMethod;
import org.eclipse.cmf.occi.infrastructure.SaveMethod;
import org.eclipse.cmf.occi.infrastructure.Ssh_key;
import org.eclipse.cmf.occi.infrastructure.StopMethod;
import org.eclipse.cmf.occi.infrastructure.SuspendMethod;
import org.eclipse.cmf.occi.infrastructure.User_data;
import org.openstack4j.api.Builders;
import org.openstack4j.api.OSClient.OSClientV2;
import org.openstack4j.model.compute.FloatingIP;
import org.openstack4j.model.compute.Server;
import org.openstack4j.model.compute.Server.Status;
import org.openstack4j.model.compute.ServerCreate;
import org.openstack4j.model.compute.builder.ServerCreateBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.codec.binary.Base64;

import openstackruntime.Floatingip;
import openstackruntime.OpenstackruntimeFactory;
import openstackruntime.Runtimeid; 

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/infrastructure#
 * - term: compute
 * - title: Compute Resource
 */
public class ComputeConnector extends org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl
{
	private OSClientV2 os = null;
	private Server server = null;

	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ComputeConnector.class);

	// Start of user code Computeconnector_constructor
	/**
	 * Constructs a compute connector.
	 */
	ComputeConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code ComputeocciCreate
	/**
	 * Called when this Compute instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		List<String> networkList = new ArrayList<String>();
		String flavorID = null;
		String imageID = null;
		ServerCreateBuilder builder = Builders.server();
		
		os = OpenStackHelper.getInstance().getOSClient();
		
		// first check if runtime id is present; if yes try to connect to runtime state
		String runtimeID = OpenStackHelper.getInstance().getRuntimeID(this);
		
		if (runtimeID != null)	{
			server = getRuntimeObject();
			if (server == null) {
				this.setOcciComputeState(ComputeStatus.ERROR);
				this.setOcciComputeStateMessage("Runtime id set, but unable to connect to runtime object.");	
			}
			return;
		}
		
		if (this.getTitle() == null) {
			// Check if an attribute state with title is present and set
			// title accordingly
			for (AttributeState attribute: this.getAttributes()) {
				if (attribute.getName().equals("occi.core.title"))
					this.setTitle(attribute.getValue());
			}	
		}
		
		builder.name(this.getTitle());		
		
		for (Link link: this.getLinks()) {
			if (link instanceof Networkinterface) {
				String networkID = OpenStackHelper.getInstance().getRuntimeID(link.getTarget());
				if (networkID  != null) {
					networkList.add(networkID);
				}
			}	
		}
		
		// add default network, since OpenStack
		// does not allow the creation of vms without network connection
		if (networkList.size() == 0) {
			networkList.add(OpenStackHelper.getInstance().getDefaultNetwork());
		}
		
		builder.networks(networkList);	
		
		for (MixinBase mixin: this.getParts()) {
			if (mixin instanceof Ssh_key) {
				String publickey = ((Ssh_key) mixin).getOcciCredentialsSshPublickey();
				// create new ssh key on OpenStack
			    os.compute().keypairs().create(this.getTitle() + "_keypair", publickey);	
					
				builder.keypairName(this.getTitle() + "_keypair");
			}
			
			if (mixin instanceof Resource_tpl) {
				LOGGER.info("Found resource template in " + this);
				for (Attribute attribute: mixin.getMixin().getAttributes()) {
					if (attribute.getName().equals("openstack.runtime.id")) {
						flavorID = attribute.getDefault();
						break;
					}
				}
			}
	
			if (mixin instanceof Os_tpl) {
				LOGGER.info("Found os template in " + this);
				for (Attribute attribute: mixin.getMixin().getAttributes()) {
					if (attribute.getName().equals("openstack.runtime.id")) {
						imageID = attribute.getDefault();
						break;
					}
				}
			}
			
			if (mixin instanceof User_data) {
				LOGGER.info("Found user data in " + this);
				//byte[] encodedBytes = ((User_data) mixin).getOcciComputeUserdata().getBytes();
				builder.userData(((User_data) mixin).getOcciComputeUserdata());
			}
		}
		
		if (flavorID == null) {
			LOGGER.warn("No flavor is set for compute resource, using default value.");
			flavorID = OpenStackHelper.getInstance().getDefaultFlavor();
		}
		
		builder.flavor(flavorID);
		
		if (imageID == null) {
			LOGGER.warn("No image is set for compute resource, using default value.");
			imageID = OpenStackHelper.getInstance().getDefaultImage();
		}
		
		builder.image(imageID);
		
		ServerCreate sc = builder.build();
		
		try {
			server = os.compute().servers().bootAndWaitActive(sc, 50000);

			Runtimeid runtimeIDMixin = OpenstackruntimeFactory.eINSTANCE.createRuntimeid();
			OpenStackHelper.getInstance().setAttributeState(runtimeIDMixin, "openstack.runtime.id", 
						server.getId());

				this.getParts().add(runtimeIDMixin);

				for (MixinBase mixin: this.getParts()) {
					if (mixin instanceof Floatingip) {
						String pool = ((Floatingip) mixin).getOpenstackFloatingipPool();
						String address = ((Floatingip) mixin).getOpenstackFloatingipAddress();
						if (address != null) {
							//TODO: Implement
						} else {
							FloatingIP fip = os.compute().floatingIps().allocateIP(pool);
							LOGGER.debug("Allocated new floating ip " + fip.getFloatingIpAddress());
							os.compute().floatingIps().addFloatingIP(server, fip.getFloatingIpAddress());
						}				
					}
				}
		} catch (Exception e) {
			LOGGER.debug("Problem while creating VM: " + e.getMessage());
			os.compute().keypairs().delete(this.getTitle() + "_keypair");
		}
	}
	// End of user code

	// Start of user code Compute_occiRetrieve_method
	/**
	 * Called when this Compute instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		os = OpenStackHelper.getInstance().getOSClient();
		
		server = getRuntimeObject();
		
		if (server == null) {
			LOGGER.debug("Unable to retrieve runtime object.");
			this.setOcciComputeState(ComputeStatus.ERROR);
			this.setOcciComputeStateMessage("Unable to retrieve runtime object.");
			return;
		}
		
		// Retrieving Status
		Status status = server.getStatus();
		
		if (status == Status.ACTIVE) {
			this.setOcciComputeState(ComputeStatus.ACTIVE);
		}
	}
	// End of user code

	// Start of user code Compute_occiUpdate_method
	/**
	 * Called when this Compute instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code ComputeocciDelete_method
	/**
	 * Called when this Compute instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		os = OpenStackHelper.getInstance().getOSClient();
		
		server = getRuntimeObject();
		
		if (server != null) {
			os.compute().servers().delete(server.getId());
			os.compute().keypairs().delete(this.getTitle() + "_keypair");

		}
		
		OpenStackHelper.getInstance().removeRuntimeID(this);
		
		this.setOcciComputeState(ComputeStatus.INACTIVE);
	}
	// End of user code

	//
	// Compute actions.
	//

	// Start of user code Compute_Kind_Save_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: save
     * - title: Save the system (hot, deferred)
	 */
	@Override
	public void save(final SaveMethod method, final String name)
	{
		LOGGER.debug("Action save(" + "method=" + method + "name=" + name + ") called on " + this);

		// Compute State Machine.
		switch(getOcciComputeState().getValue()) {
		default:
			break;
		}
	}
	// End of user code
	// Start of user code Compute_Kind_Restart_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: restart
     * - title: Restart the system (graceful, warm or cold)
	 */
	@Override
	public void restart(final RestartMethod method)
	{
		LOGGER.debug("Action restart(" + "method=" + method + ") called on " + this);

		// Compute State Machine.
		switch(getOcciComputeState().getValue()) {
		default:
			break;
		}
	}
	// End of user code
	// Start of user code Compute_Kind_Stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: stop
     * - title: Stop the system (graceful, acpioff or poweroff)
	 */
	@Override
	public void stop(final StopMethod method)
	{
		LOGGER.debug("Action stop(" + "method=" + method + ") called on " + this);

		// Compute State Machine.
		switch(getOcciComputeState().getValue()) {

		case ComputeStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"stop\")...");
			// TODO Implement transition(state=active, action="stop")
			if(true){
				setOcciComputeState(ComputeStatus.ERROR);
			}
			else	
				if(true){
					setOcciComputeState(ComputeStatus.INACTIVE);
				}
			break;

		default:
			break;
		}
	}
	// End of user code
	// Start of user code Compute_Kind_Start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: start
     * - title: Start the system
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);

		// Compute State Machine.
		switch(getOcciComputeState().getValue()) {

		case ComputeStatus.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"start\")...");
			// TODO Implement transition(state=inactive, action="start")
			if(true){
				setOcciComputeState(ComputeStatus.ERROR);
			}
			else	
				if(true){
					setOcciComputeState(ComputeStatus.ACTIVE);
				}
			break;


		case ComputeStatus.SUSPENDED_VALUE:
			LOGGER.debug("Fire transition(state=suspended, action=\"start\")...");
			// TODO Implement transition(state=suspended, action="start")
			if(true){
				setOcciComputeState(ComputeStatus.ERROR);
			}
			else	
				if(true){
					setOcciComputeState(ComputeStatus.ACTIVE);
				}
			break;

		default:
			break;
		}
	}
	// End of user code
	// Start of user code Compute_Kind_Suspend_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: suspend
     * - title: Suspend the system (hibernate or in RAM)
	 */
	@Override
	public void suspend(final SuspendMethod method)
	{
		LOGGER.debug("Action suspend(" + "method=" + method + ") called on " + this);

		// Compute State Machine.
		switch(getOcciComputeState().getValue()) {

		case ComputeStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"suspend\")...");
			// TODO Implement transition(state=active, action="suspend")
			if(true){
				setOcciComputeState(ComputeStatus.ERROR);
			}
			else	
				if(true){
					setOcciComputeState(ComputeStatus.SUSPENDED);
				}
			break;

		default:
			break;
		}
	}
	// End of user code

	private Server getRuntimeObject() {
		String runtimeid = OpenStackHelper.getInstance().getRuntimeID(this);
		if (runtimeid == null) {
			LOGGER.debug("Object hat no runtime id");
			return null;
		}
		server = os.compute().servers().get(runtimeid);
		return server;
	}

}	
