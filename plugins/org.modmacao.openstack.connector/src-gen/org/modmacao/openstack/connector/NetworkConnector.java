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
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.infrastructure.Ipnetwork;
import org.eclipse.cmf.occi.infrastructure.NetworkStatus;
import org.openstack4j.api.Builders;
import org.openstack4j.api.OSClient.OSClientV2;
import org.openstack4j.model.compute.NetworkCreate;
import org.openstack4j.model.network.IPVersionType;
import org.openstack4j.model.network.Network;
import org.openstack4j.model.network.builder.NetworkBuilder;
import org.openstack4j.model.network.builder.SubnetBuilder;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/infrastructure#
 * - term: network
 * - title: Network Resource
 */
public class NetworkConnector extends org.eclipse.cmf.occi.infrastructure.impl.NetworkImpl
{
	private OSClientV2 os = null;
	private Network network = null;
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(NetworkConnector.class);

	// Start of user code Networkconnector_constructor
	/**
	 * Constructs a network connector.
	 */
	NetworkConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		os = OpenStackHelper.getOSClient();
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code NetworkocciCreate
	/**
	 * Called when this Network instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		
		network = os.networking().network().get(this.getId());
		
		if (network == null) {
			NetworkBuilder builder = Builders.network();
			builder.name(this.getTitle());
		
			network = os.networking().network().create(builder.build());
		
			for (MixinBase mixin: this.getParts()) {
				if (mixin instanceof Ipnetwork) {
					SubnetBuilder snbuilder = Builders.subnet();
					snbuilder.name(this.getTitle() + "-subnet");
					snbuilder.cidr(((Ipnetwork) mixin).getOcciNetworkAddress());
					snbuilder.ipVersion(IPVersionType.V4);
					snbuilder.networkId(network.getId());
					os.networking().subnet().create(snbuilder.build());
				}
			}
		}
		
	}
	// End of user code

	// Start of user code Network_occiRetrieve_method
	/**
	 * Called when this Network instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Network_occiUpdate_method
	/**
	 * Called when this Network instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code NetworkocciDelete_method
	/**
	 * Called when this Network instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		os.networking().network().delete(network.getId());
	}
	// End of user code

	//
	// Network actions.
	//

	// Start of user code Network_Kind_Up_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/network/action#
     * - term: up
     * - title: Up a network.
	 */
	@Override
	public void up()
	{
		LOGGER.debug("Action up() called on " + this);

		// Network State Machine.
		switch(getOcciNetworkState().getValue()) {

		case NetworkStatus.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"up\")...");
			// TODO Implement transition(state=inactive, action="up")
			if(true){
				setOcciNetworkState(NetworkStatus.ACTIVE);
			}
			else	
				if(true){
					setOcciNetworkState(NetworkStatus.ERROR);
				}
			break;

		default:
			break;
		}
	}
	// End of user code
	// Start of user code Network_Kind_Down_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/network/action#
     * - term: down
     * - title: Down a network.
	 */
	@Override
	public void down()
	{
		LOGGER.debug("Action down() called on " + this);

		// Network State Machine.
		switch(getOcciNetworkState().getValue()) {

		case NetworkStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"down\")...");
			// TODO Implement transition(state=active, action="down")
			if(true){
				setOcciNetworkState(NetworkStatus.INACTIVE);
			}
			else	
				if(true){
					setOcciNetworkState(NetworkStatus.ERROR);
				}
			break;

		default:
			break;
		}
	}
	// End of user code
		


}	
