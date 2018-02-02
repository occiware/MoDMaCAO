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
 * Generated at Wed Oct 11 21:54:19 CEST 2017 from platform:/resource/org.modmacao.occi.platform/model/platform.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.modmacao.ansible.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.modmacao.occi.platform.Status;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.modmacao.org/occi/platform#
 * - term: application
 * - title: Application
 */
public class ApplicationConnector extends org.modmacao.occi.platform.impl.ApplicationImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ApplicationConnector.class);

	// Start of user code Applicationconnector_constructor
	/**
	 * Constructs a application connector.
	 */
	ApplicationConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code ApplicationocciCreate
	/**
	 * Called when this Application instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Application_occiRetrieve_method
	/**
	 * Called when this Application instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Application_occiUpdate_method
	/**
	 * Called when this Application instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code ApplicationocciDelete_method
	/**
	 * Called when this Application instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Application actions.
	//

	// Start of user code Application_Kind_deploy_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.modmacao.org/occi/platform/application/action#
     * - term: deploy
     * - title: 
	 */
	@Override
	public void deploy()
	{
		LOGGER.debug("Action deploy() called on " + this);

		// Application State Machine.
		switch(getOcciAppState().getValue()) {

		case Status.UNDEPLOYED_VALUE:
			LOGGER.debug("Fire transition(state=undeployed, action=\"deploy\")...");
			// TODO Implement transition(state=undeployed, action="deploy")
			setOcciAppState(Status.DEPLOYED);
			break;

		default:
			break;
		}
	}
	// End of user code
	// Start of user code Application_Kind_Start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.modmacao.org/occi/platform/application/action#
     * - term: start
     * - title: Start the application.
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);

		// Application State Machine.
		switch(getOcciAppState().getValue()) {

		case Status.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"start\")...");
			// TODO Implement transition(state=inactive, action="start")
			setOcciAppState(Status.ACTIVE);
			break;

		default:
			break;
		}
	}
	// End of user code
	// Start of user code Application_Kind_undeploy_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.modmacao.org/occi/platform/application/action#
     * - term: undeploy
     * - title: 
	 */
	@Override
	public void undeploy()
	{
		LOGGER.debug("Action undeploy() called on " + this);

		// Application State Machine.
		switch(getOcciAppState().getValue()) {

		case Status.DEPLOYED_VALUE:
			LOGGER.debug("Fire transition(state=deployed, action=\"undeploy\")...");
			// TODO Implement transition(state=deployed, action="undeploy")
			setOcciAppState(Status.UNDEPLOYED);
			break;


		case Status.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"undeploy\")...");
			// TODO Implement transition(state=inactive, action="undeploy")
			setOcciAppState(Status.UNDEPLOYED);
			break;


		case Status.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"undeploy\")...");
			// TODO Implement transition(state=active, action="undeploy")
			setOcciAppState(Status.UNDEPLOYED);
			break;


		case Status.ERROR_VALUE:
			LOGGER.debug("Fire transition(state=error, action=\"undeploy\")...");
			// TODO Implement transition(state=error, action="undeploy")
			setOcciAppState(Status.UNDEPLOYED);
			break;

		default:
			break;
		}
	}
	// End of user code
	// Start of user code Application_Kind_configure_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.modmacao.org/occi/platform/application/action#
     * - term: configure
     * - title: 
	 */
	@Override
	public void configure()
	{
		LOGGER.debug("Action configure() called on " + this);

		// Application State Machine.
		switch(getOcciAppState().getValue()) {

		case Status.DEPLOYED_VALUE:
			LOGGER.debug("Fire transition(state=deployed, action=\"configure\")...");
			// TODO Implement transition(state=deployed, action="configure")
			setOcciAppState(Status.INACTIVE);
			break;

		default:
			break;
		}
	}
	// End of user code
	// Start of user code Application_Kind_Stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.modmacao.org/occi/platform/application/action#
     * - term: stop
     * - title: Stop the application.
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// Application State Machine.
		switch(getOcciAppState().getValue()) {

		case Status.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"stop\")...");
			// TODO Implement transition(state=active, action="stop")
			setOcciAppState(Status.INACTIVE);
			break;

		default:
			break;
		}
	}
	// End of user code
		


}	
