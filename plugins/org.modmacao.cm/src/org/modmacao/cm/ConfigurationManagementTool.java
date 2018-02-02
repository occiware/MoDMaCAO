/**
 * 
 */
package org.modmacao.cm;

import org.modmacao.occi.platform.Application;
import org.modmacao.occi.platform.Component;

/**
 * @author fkorte
 *
 */
public interface ConfigurationManagementTool {
	public int deploy (Application app);
	public int configure (Application app);
	public int start (Application app);
	public int stop (Application app);
	public int undeploy (Application app);
	
	public int deploy (Component comp);
	public int configure (Component comp);
	public int start (Component comp);
	public int stop (Component comp);
	public int undeploy (Component comp);

}
