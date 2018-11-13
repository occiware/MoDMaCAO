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
 *
 * Generated at Fri Mar 02 15:56:56 CET 2018 from platform:/plugin/org.eclipse.cmf.occi.infrastructure/model/Infrastructure.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.modmacao.openstack.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import openstackruntime.OpenstackruntimeFactory;
import openstackruntime.Runtimeid;

import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.infrastructure.StorageStatus;
import org.openstack4j.api.Builders;
import org.openstack4j.api.OSClient.OSClientV2;
import org.openstack4j.model.storage.block.Volume.Status;
import org.openstack4j.model.storage.block.Volume;
import org.openstack4j.model.storage.block.builder.VolumeBuilder;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/infrastructure#
 * - term: storage
 * - title: Storage Resource
 */
public class StorageConnector extends org.eclipse.cmf.occi.infrastructure.impl.StorageImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(StorageConnector.class);
	
	private OSClientV2 os = null;
	private Volume volume = null;

	// Start of user code Storageconnector_constructor
	/**
	 * Constructs a storage connector.
	 */
	StorageConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code StorageocciCreate
	/**
	 * Called when this Storage instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		VolumeBuilder builder = Builders.storage().volume();
		
		os = OpenStackHelper.getInstance().getOSClient();
		
		// first check if runtime id is present; if yes try to connect to runtime state
		String runtimeID = OpenStackHelper.getInstance().getRuntimeID(this);
		
		if (runtimeID != null)	{
			volume = getRuntimeObject();
			if (volume == null) {
				this.setOcciStorageState(StorageStatus.ERROR);
				this.setOcciStorageStateMessage("Runtime id set, but unable to connect to runtime object.");	
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
		
		if (this.getOcciStorageSize() == null) {
			for (AttributeState attribute: this.getAttributes()) {
				if (attribute.getName().equals("occi.storage.size"))
					this.setOcciStorageSize(Float.parseFloat(attribute.getValue()));
			}
		}
		
		builder.size(this.getOcciStorageSize().intValue());
		
		volume = os.blockStorage().volumes().create(builder.build());
		
		Runtimeid runtimeIDMixin = OpenstackruntimeFactory.eINSTANCE.createRuntimeid();
		OpenStackHelper.getInstance().setAttributeState(runtimeIDMixin, "openstack.runtime.id", 
				volume.getId());
		
		this.getParts().add(runtimeIDMixin);
	}
	// End of user code

	// Start of user code Storage_occiRetrieve_method
	/**
	 * Called when this Storage instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		os = OpenStackHelper.getInstance().getOSClient();
		
		volume = getRuntimeObject();
		
		if (volume == null) {
			this.setOcciStorageState(StorageStatus.ERROR);
			this.setOcciStorageStateMessage("Unable to retrieve runtime object");
			return;
		}
		
		// Retrieving Status
		Status status = volume.getStatus();
		
		if (status == Status.AVAILABLE || status == Status.IN_USE) {
			this.setOcciStorageState(StorageStatus.ONLINE);
		}
	}
	// End of user code

	// Start of user code Storage_occiUpdate_method
	/**
	 * Called when this Storage instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code StorageocciDelete_method
	/**
	 * Called when this Storage instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		os = OpenStackHelper.getInstance().getOSClient();
		
		volume = getRuntimeObject();
		
		if (volume != null) {
			os.blockStorage().volumes().delete(volume.getId());
		}
		
		OpenStackHelper.getInstance().removeRuntimeID(this);
		
		this.setOcciStorageState(StorageStatus.OFFLINE);
	}
	// End of user code

	//
	// Storage actions.
	//

	// Start of user code Storage_Kind_Offline_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/storage/action#
     * - term: offline
     * - title: Set storage offline
	 */
	@Override
	public void offline()
	{
		LOGGER.debug("Action offline() called on " + this);

		// Storage State Machine.
		switch(getOcciStorageState().getValue()) {

		case StorageStatus.ONLINE_VALUE:
			LOGGER.debug("Fire transition(state=online, action=\"offline\")...");
			// TODO Implement transition(state=online, action="offline")
			if(true){
				setOcciStorageState(StorageStatus.OFFLINE);
			}
			else	
				if(true){
					setOcciStorageState(StorageStatus.ERROR);
				}
			break;

		default:
			break;
		}
	}
	// End of user code
	// Start of user code Storage_Kind_Online_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/storage/action#
     * - term: online
     * - title: Set storage online
	 */
	@Override
	public void online()
	{
		LOGGER.debug("Action online() called on " + this);

		// Storage State Machine.
		switch(getOcciStorageState().getValue()) {

		case StorageStatus.OFFLINE_VALUE:
			LOGGER.debug("Fire transition(state=offline, action=\"online\")...");
			// TODO Implement transition(state=offline, action="online")
			if(true){
				setOcciStorageState(StorageStatus.ONLINE);
			}
			else	
				if(true){
					setOcciStorageState(StorageStatus.ERROR);
				}
			break;

		default:
			break;
		}
	}
	
	private Volume getRuntimeObject() {
		String runtimeid = OpenStackHelper.getInstance().getRuntimeID(this);
		if (runtimeid == null) {
			return null;
		}
		volume = os.blockStorage().volumes().get(runtimeid);
		return volume;
	}
	// End of user code
		


}	
