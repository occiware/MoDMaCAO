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

import org.eclipse.cmf.occi.infrastructure.StorageLinkStatus;
import org.openstack4j.api.OSClient.OSClientV2;
import org.openstack4j.model.compute.Server;
import org.openstack4j.model.compute.VolumeAttachment;
import org.openstack4j.model.storage.block.Volume;
import org.openstack4j.model.storage.block.Volume.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/infrastructure#
 * - term: storagelink
 * - title: StorageLink Link
 */
public class StoragelinkConnector extends org.eclipse.cmf.occi.infrastructure.impl.StoragelinkImpl
{
	private OSClientV2 os = null;
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(StoragelinkConnector.class);

	// Start of user code Storagelinkconnector_constructor
	/**
	 * Constructs a storagelink connector.
	 */
	StoragelinkConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code StoragelinkocciCreate
	/**
	 * Called when this Storagelink instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
				
		os = OpenStackHelper.getInstance().getOSClient();
		
		String serverID = OpenStackHelper.getInstance().getRuntimeID(this.getSource());
		if (serverID == null) {
			LOGGER.error("Unable to retrieve server id.");
			this.setOcciStoragelinkState(StorageLinkStatus.ERROR);
			this.setOcciStoragelinkStateMessage("Unale to retrieve server id.");
			return;
		}
		
		Server server = os.compute().servers().get(serverID);
		
		if (server == null) {
			LOGGER.error("Source server not found.");
			this.setOcciStoragelinkState(StorageLinkStatus.ERROR);
			this.setOcciStoragelinkStateMessage("Source server not found.");
			return;
		}
		
		String volumeID = OpenStackHelper.getInstance().getRuntimeID(this.getTarget());
		Volume volume = os.blockStorage().volumes().get(volumeID);
		
		if (volume == null) {
			LOGGER.error("Target volume not found.");
			this.setOcciStoragelinkState(StorageLinkStatus.ERROR);
			this.setOcciStoragelinkStateMessage("Target volume not found.");
			return;
		}
		
		if (volume.getStatus() == Status.AVAILABLE) {
			VolumeAttachment attachment = os.compute().servers().attachVolume(serverID, volumeID, null);
		
			if (attachment == null) {
				LOGGER.error("Error attaching volume.");
				this.setOcciStoragelinkState(StorageLinkStatus.ERROR);
				this.setOcciStoragelinkStateMessage("Error attaching volume.");
				return;	
			}
		}
		else {
			LOGGER.info("Volume is currently not available. Try again later.");
			this.setOcciStoragelinkState(StorageLinkStatus.ERROR);
			this.setOcciStoragelinkStateMessage("Volume was not available during attachment. Try again later.");	
			return;
		}
	}
	// End of user code

	// Start of user code Storagelink_occiRetrieve_method
	/**
	 * Called when this Storagelink instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Storagelink_occiUpdate_method
	/**
	 * Called when this Storagelink instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code StoragelinkocciDelete_method
	/**
	 * Called when this Storagelink instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		
		os = OpenStackHelper.getInstance().getOSClient();
		
		String serverID = OpenStackHelper.getInstance().getRuntimeID(this.getSource());
		if (serverID == null) {
			LOGGER.error("Server runtime id is not set.");
			this.setOcciStoragelinkState(StorageLinkStatus.ERROR);
			this.setOcciStoragelinkStateMessage("Server runtime id not set.");
			return;
		}
		
		Server server = os.compute().servers().get(serverID);
		
		if (server == null) {
			LOGGER.error("Source server not found.");
			this.setOcciStoragelinkState(StorageLinkStatus.ERROR);
			this.setOcciStoragelinkStateMessage("Source server not found.");
			return;
		}
		
		String volumeID = OpenStackHelper.getInstance().getRuntimeID(this.getTarget());
		Volume volume = os.blockStorage().volumes().get(volumeID);
		
		if (volume == null) {
			LOGGER.error("Target volume not found.");
			this.setOcciStoragelinkState(StorageLinkStatus.ERROR);
			this.setOcciStoragelinkStateMessage("Target volume not found.");
			return;
		}
		
		os.compute().servers().detachVolume(serverID, volumeID);
		
	}
	// End of user code

	//
	// Storagelink actions.
	//

		


}	
