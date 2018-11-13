/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Fabian Korte <fabian.korte@cs.uni-goettingen.de>
 *
 * Generated at Fri Jan 12 16:41:42 CET 2018 from platform:/resource/org.modmacao.occi.platform/model/platform.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.modmacao.core.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import modmacao.Executiondependency;
import modmacao.Installationdependency;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.modmacao.cm.ConfigurationManagementTool;
import org.modmacao.cm.ansible.AnsibleCMTool;
import org.modmacao.occi.platform.Component;
import org.modmacao.occi.platform.Status;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.modmacao.org/occi/platform#
 * - term: component
 * - title: Component
 */
public class ComponentConnector extends org.modmacao.occi.platform.impl.ComponentImpl
{
	private ConfigurationManagementTool cmtool = new AnsibleCMTool();
	
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentConnector.class);

	// Start of user code Componentconnector_constructor
	/**
	 * Constructs a component connector.
	 */
	ComponentConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code ComponentocciCreate
	/**
	 * Called when this Component instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Component_occiRetrieve_method
	/**
	 * Called when this Component instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Component_occiUpdate_method
	/**
	 * Called when this Component instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code ComponentocciDelete_method
	/**
	 * Called when this Component instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Component actions.
	//

	// Start of user code Component_Kind_undeploy_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.modmacao.org/occi/platform/component/action#
     * - term: undeploy
     * - title: 
	 */
	@Override
	public void undeploy()
	{
		// TODO Implement status update check
		LOGGER.debug("Action undeploy() called on " + this);

		// Component State Machine.
		switch(getOcciComponentState().getValue()) {

		case Status.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"undeploy\")...");
			
			//TODO: Other components that have an execution dependency TO this component should be stopped.
			this.stop();
			cmtool.undeploy(this);
			setOcciComponentState(Status.UNDEPLOYED);
			break;


		case Status.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"undeploy\")...");
			cmtool.undeploy(this);
			setOcciComponentState(Status.UNDEPLOYED);
			break;


		case Status.DEPLOYED_VALUE:
			LOGGER.debug("Fire transition(state=deployed, action=\"undeploy\")...");
			cmtool.undeploy(this);
			setOcciComponentState(Status.UNDEPLOYED);
			break;


		case Status.ERROR_VALUE:
			LOGGER.debug("Fire transition(state=error, action=\"undeploy\")...");
			cmtool.undeploy(this);
			setOcciComponentState(Status.UNDEPLOYED);
			break;

		default:
			break;
		}
	}
	// End of user code
	// Start of user code Component_Kind_Stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.modmacao.org/occi/platform/component/action#
     * - term: stop
     * - title: Stop the application.
	 */
	@Override
	public void stop()
	{
		int status = -1;
		LOGGER.debug("Action stop() called on " + this);

		// Component State Machine.
		switch(getOcciComponentState().getValue()) {

		case Status.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"stop\")...");
			
			status = cmtool.stop(this);
						
			setOcciComponentState(Status.INACTIVE);
		
			break;

		default:
			break;
		}
	}
	// End of user code
	// Start of user code Component_Kind_Start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.modmacao.org/occi/platform/component/action#
     * - term: start
     * - title: Start the application.
	 */
	@Override
	public void start()
	{
		int status = -1;
		LOGGER.debug("Action start() called on " + this);

		// Component State Machine.
		switch(getOcciComponentState().getValue()) {

		case Status.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"start\")...");
			for (Component component: this.getExecutionDependendComps()) {
				component.start();
			}
			
			status = cmtool.start(this);
						
			if (status == 0 && assertCompsStatusEquals(getExecutionDependendComps(), Status.ACTIVE))
				setOcciComponentState(Status.ACTIVE);
			else
				setOcciComponentState(Status.ERROR);
			
			break;


		case Status.UNDEPLOYED_VALUE:
			LOGGER.debug("Fire transition(state=undeployed, action=\"start\")...");
			for (Component component: this.getInstallDependendComps()) {
				component.deploy();
			}
			this.deploy();
			
			for (Component component: this.getInstallDependendComps()) {
				component.configure();
			}
			this.configure();
			
			for (Component component: this.getExecutionDependendComps()) {
				component.start();
			}
			
			status = cmtool.start(this);
			
			if (status == 0 && assertCompsStatusEquals(getExecutionDependendComps(), Status.ACTIVE))
				setOcciComponentState(Status.ACTIVE);
			else 
				setOcciComponentState(Status.ERROR);

		default:
			break;
		}
	}
	// End of user code
	// Start of user code Component_Kind_configure_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.modmacao.org/occi/platform/component/action#
     * - term: configure
     * - title: 
	 */
	@Override
	public void configure()
	{
		int status = -1;
		LOGGER.debug("Action configure() called on " + this);

		// Component State Machine.
		switch(getOcciComponentState().getValue()) {

		case Status.DEPLOYED_VALUE:
			LOGGER.debug("Fire transition(state=deployed, action=\"configure\")...");
			for (Component component: this.getInstallDependendComps()) {
				component.configure();
			}
			status = cmtool.configure(this);
			
			if (status == 0 && assertCompsStatusEquals(getInstallDependendComps(), Status.INACTIVE))
					setOcciComponentState(Status.INACTIVE);
			else
					setOcciComponentState(Status.ERROR);
			break;

		default:
			break;
		}
	}
	// End of user code
	// Start of user code Component_Kind_deploy_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.modmacao.org/occi/platform/component/action#
     * - term: deploy
     * - title: 
	 */
	@Override
	public void deploy()
	{
		int status = -1;
		LOGGER.debug("Action deploy() called on " + this);

		// Component State Machine.
		switch(getOcciComponentState().getValue()) {

		case Status.UNDEPLOYED_VALUE:
			LOGGER.debug("Fire transition(state=undeployed, action=\"deploy\")...");
			for (Component component: this.getInstallDependendComps()) {
				component.deploy();
			}
			status = cmtool.deploy(this);
			
			if (status == 0 && assertCompsStatusEquals(getInstallDependendComps(), Status.DEPLOYED))
				setOcciComponentState(Status.DEPLOYED);
			else
				setOcciComponentState(Status.ERROR);
			break;

		default:
			break;
		}
	}
	// End of user code
	
	private List<Component> getInstallDependendComps(){
		LinkedList<Component> dependendComponents = new LinkedList<Component>();
		for (Link link: this.getLinks()) {
			for (MixinBase mixin: link.getParts()) {
				if (mixin instanceof Installationdependency) {
					dependendComponents.add((Component) link.getTarget());
					break;
				}
			}
		}
		return dependendComponents;		
	}
	
	private List<Component> getExecutionDependendComps(){
		LinkedList<Component> dependendComponents = new LinkedList<Component>();
		for (Link link: this.getLinks()) {
			for (MixinBase mixin: link.getParts()) {
				if (mixin instanceof Executiondependency) {
					dependendComponents.add((Component) link.getTarget());
					break;
				}
			}
		}
		return dependendComponents;
	}
	
	private boolean assertCompsStatusEquals(List<Component> components, Status status) {
		for (Component component: components) {
			if (component.getOcciComponentState().getValue() != status.getValue()) {
				LOGGER.debug("Missmatching state of component " + component.getTitle() + " detected. "
						+ "Expected " + status.getName() + " but was " 
						+ component.getOcciComponentState().getName() + ".");
				return false;
			}
		}	
		return true;
	}

}	
