package org.modmacao.cm.ansible.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.junit.Test;
import org.modmacao.cm.ansible.Generate;

public class AnsibleGeneratorTest {

	@Test
	public void testGenerate() throws IOException{
		List<String> arguments = new ArrayList<String>();
		Generate generator = new Generate(URI.createFileURI("/home/fglaser/workspace_oco_git/de.ugoe.cs.oco.usecases.occi.sugarcrm/model/SugarCRM-Types.occie"), 
								new File("/home/fglaser/de.ugoe.cs.oco.usecases/sugercrm"), arguments);
		generator.doGenerate(new BasicMonitor());
		
		generator = new Generate(URI.createFileURI("/home/fglaser/workspace_oco_git/de.ugoe.cs.oco.usecases.occi.sugarcrm/model/TOSCA-v1.0-BaseTypes-Definitions.occie"), 
				new File("/home/fglaser/de.ugoe.cs.oco.usecases/sugercrm"), arguments);
		generator.doGenerate(new BasicMonitor());
		
		generator = new Generate(URI.createFileURI("/home/fglaser/workspace_oco_git/de.ugoe.cs.oco.usecases.occi.sugarcrm/model/TOSCA-v1.0-SpecificTypes-Definitions.occie"), 
				new File("/home/fglaser/de.ugoe.cs.oco.usecases/sugercrm"), arguments);
		generator.doGenerate(new BasicMonitor());
		
	}

}
