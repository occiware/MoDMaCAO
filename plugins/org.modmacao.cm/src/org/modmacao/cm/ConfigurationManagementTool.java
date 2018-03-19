/**
 * 
 */
package org.modmacao.cm;

import org.modmacao.occi.platform.Application;
import org.modmacao.occi.platform.Component;

/**
 * Interface for implementing ConfigurationManagementTools
 * for MoDMaCAO
 * @author Fabian Korte - UGOE
 *
 */
public interface ConfigurationManagementTool {
	/** A configuration management tool specific implementation for
	 * deploying the Application App.
	 * @param app The application that should be deployed.
	 * @return The return code of the configuration management tool.
	 */
	public int deploy (Application app);

	/** A configuration management tool specific implementation for
	 * configuring the Application App.
	 * @param app The application that should be configured.
	 * @return The return code of the configuration management tool.
	*/
	public int configure (Application app);

	/** A configuration management tool specific implementation for
	 * starting the Application App.
	 * @param app The application that should be started.
	 * @return The return code of the configuration management tool.
	*/
	public int start (Application app);
	
	/** A configuration management tool specific implementation for
	 * stopping the Application App.
	 * @param app The application that should be stopped.
	 * @return The return code of the configuration management tool.
	*/
	public int stop (Application app);
	
	/** A configuration management tool specific implementation for
	 * undeploying the Application App.
	 * @param app The application that should be undeployed.
	 * @return The return code of the configuration management tool.
	*/
	public int undeploy (Application app);
	
	/** A configuration management tool specific implementation for
	 * deploying the Component comp.
	 * @param app The component that should be deployed.
	 * @return The return code of the configuration management tool.
	 */
	public int deploy (Component comp);
	
	/** A configuration management tool specific implementation for
	 * configuring the Component comp.
	 * @param app The component that should be cofigured.
	 * @return The return code of the configuration management tool.
	 */
	public int configure (Component comp);
	
	/** A configuration management tool specific implementation for
	 * starting the Component comp.
	 * @param app The component that should be started.
	 * @return The return code of the configuration management tool.
	 */
	public int start (Component comp);
	
	/** A configuration management tool specific implementation for
	 * stopping the Component comp.
	 * @param app The component that should be stopped.
	 * @return The return code of the configuration management tool.
	 */
	public int stop (Component comp);
	
	/** A configuration management tool specific implementation for
	 * undeploying the Component comp.
	 * @param app The component that should be undeployed.
	 * @return The return code of the configuration management tool.
	 */
	public int undeploy (Component comp);

}
