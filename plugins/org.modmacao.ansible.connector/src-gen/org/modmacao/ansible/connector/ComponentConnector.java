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
 * Generated at Wed Oct 11 21:54:19 CEST 2017 from platform:/resource/org.modmacao.occi.platform/model/platform.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.modmacao.ansible.connector;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.Networkinterface;
import org.eclipse.emf.common.util.EList;
import org.modmacao.occi.platform.Status;
import org.modmacao.placement.Placementlink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.modmacao.org/occi/platform#
 * - term: component
 * - title: Component
 */
public class ComponentConnector extends org.modmacao.occi.platform.impl.ComponentImpl
{	
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
		LOGGER.debug("Action start() called on " + this);

		// Component State Machine.
		switch(getOcciComponentState().getValue()) {

		case Status.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"start\")...");
			List<String> roles = this.getRoles();
			for (int i = 0; i < roles.size(); i++) {
				roles.set(i, roles.get(i) + "_start");
			}
			int status = -1;
			
			try {
				status = this.executeRoles(roles);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (status == 0)
				setOcciComponentState(Status.ACTIVE);
			break;

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
		LOGGER.debug("Action configure() called on " + this);

		// Component State Machine.
		switch(getOcciComponentState().getValue()) {

		case Status.DEPLOYED_VALUE:
			LOGGER.debug("Fire transition(state=deployed, action=\"configure\")...");
			List<String> roles = this.getRoles();
			for (int i = 0; i < roles.size(); i++) {
				roles.set(i, roles.get(i) + "configure");
			}
			int status = -1;
			
			try {
				status = this.executeRoles(roles);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (status == 0)
				setOcciComponentState(Status.INACTIVE);
			break;

		default:
			break;
		}
	}
	// End of user code
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
		LOGGER.debug("Action undeploy() called on " + this);

		// Component State Machine.
		switch(getOcciComponentState().getValue()) {

		case Status.DEPLOYED_VALUE:
			LOGGER.debug("Fire transition(state=deployed, action=\"undeploy\")...");
		case Status.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"undeploy\")...");
		case Status.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"undeploy\")...");
		case Status.ERROR_VALUE:
			LOGGER.debug("Fire transition(state=error, action=\"undeploy\")...");
		default:
			List<String> roles = this.getRoles();
			for (int i = 0; i < roles.size(); i++) {
				roles.set(i, roles.get(i) + "_undeploy");
			}
			int status = -1;
			
			try {
				status = this.executeRoles(roles);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (status == 0)
				setOcciComponentState(Status.UNDEPLOYED);
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
		LOGGER.debug("Action deploy() called on " + this);

		// Component State Machine.
		switch(getOcciComponentState().getValue()) {

		case Status.UNDEPLOYED_VALUE:
			LOGGER.debug("Fire transition(state=undeployed, action=\"deploy\")...");
			
			List<String> roles = this.getRoles();
			int status = -1;
			
			try {
				status = this.executeRoles(roles);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (status == 0)
				setOcciComponentState(Status.DEPLOYED);
			
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
		LOGGER.debug("Action stop() called on " + this);

		// Component State Machine.
		switch(getOcciComponentState().getValue()) {

		case Status.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"stop\")...");
			List<String> roles = this.getRoles();
			for (int i = 0; i < roles.size(); i++) {
				roles.set(i, roles.get(i) + "_stop");
			}
			int status = -1;
			
			try {
				status = this.executeRoles(roles);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (status == 0)
				setOcciComponentState(Status.INACTIVE);
			break;

		default:
			break;
		}
	}
	// End of user code
	
	private String getUser() {
		// TODO: should be provided as additional mixin
		return "ubuntu";
	}
	
	private List<String> getRoles() {
		List<String> roles = new ArrayList<String>();
		for (Mixin mixin : this.getMixins()) {
			if (mixin.getScheme().equals("http://schemas.modmacao.org/modmacao#")){
				LOGGER.info("Found mixin " + mixin.getName());
				roles.add(mixin.getName());
			}
		}
		return roles;
	}
	
	private String getIPAddress() {
		EList<Link> links = this.getLinks();
		Networkinterface networklink = null;
		Placementlink hosting = null;
		String ipaddress = null;

		for (Link link:links) {
			if (link instanceof Placementlink) {
				LOGGER.info("Found placementlink for " + this.getTitle());
				hosting = (Placementlink) link;
				break;
			}	
		}
		if (hosting == null) {
			LOGGER.error("No hosting found for component " + this.getTitle());	
		} else {
			Compute target = (Compute) hosting.getTarget();
			links = target.getLinks();

			for (Link link:links) {
				if (link instanceof Networkinterface) {
					LOGGER.info("Found network interface for " + target);
					networklink = (Networkinterface) link;
					break;
				}	
			}
			if (networklink == null) {
				LOGGER.error("No network interface found for " + target);	
			} else {
				List<AttributeState> attributes  = new LinkedList<AttributeState>();
				attributes.addAll(networklink.getAttributes());
				for (MixinBase base: networklink.getParts()) {
					attributes.addAll(base.getAttributes());
				}
				
				for (AttributeState attribute: attributes ) {
					if (attribute.getName().equals("occi.networkinterface.address")) {
						LOGGER.info("Found IP address for " + networklink);
						ipaddress = attribute.getValue();
						LOGGER.info("IP address is " + ipaddress);
					}
				}
			}
		}

		return ipaddress;
	}
	
	private int executeRoles(List<String> roles) throws Exception{
		String ipaddress = this.getIPAddress();
		String user = this.getUser();
		
		String basedir = "/tmp/" + this.getTitle() + "_ansible";
		
		AnsibleHelper helper = new AnsibleHelper();
		
		helper.createConfiguration(Paths.get(".", "ansible.cfg"), 
				Paths.get("/home/fglaser/.ssh/mongoscale-key.pem"));
		Path variablefile = helper.createVariableFile(Paths.get(".", "vars.yaml"), this);
			
		Path playbook = helper.createPlaybook(ipaddress, roles, user, variablefile, 
				Paths.get(basedir, "playbook.yml"));
			
		Path inventory = helper.createInventory(ipaddress, Paths.get(basedir, "inventory"));
			
		LOGGER.info("Executing role " + roles + " on host " + ipaddress + " with user " + user + ".");	
		int status = helper.executePlaybook(playbook, inventory);
			
		return status;
	}	
		

}	
