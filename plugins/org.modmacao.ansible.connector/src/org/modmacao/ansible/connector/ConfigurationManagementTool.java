/**
 * 
 */
package org.modmacao.ansible.connector;

import org.modmacao.occi.platform.Application;
import org.modmacao.occi.platform.Component;

/**
 * @author fglaser
 *
 */
public interface ConfigurationManagementTool {
	public void deploy (Application app);
	public void configure (Application app);
	public void start (Application app);
	public void stop (Application app);
	public void undeploy (Application app);
	
	public void deploy (Component comp);
	public void configure (Component comp);
	public void start (Component comp);
	public void stop (Component comp);
	public void undeploy (Component comp);

}
