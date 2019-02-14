
## Setup
We assume that you allready downloaded and installed OCCI-Studio.
1. Start OCCI-Studio
2. Import the projects from inside this repository in your workspace.

You should end up with an OCCI-Studio that looks similar to the one below.

<p align="center">
  <img src="workspace-after-import.png" alt="OCCI-Studio after import" width="600"/>
</p>


3. Locate the project *org.modmacao.all.extensions.design.extended*.
4. Right-Click->Run As->Run Configurations... You are now prompted to create a new run configuration for 
the project. Choose *Eclipse Application*, select Lauch with "plug-ins selected below only" and make sure
that *org.modmacao.openstack.connector* is deselected (see screenshot below)

<p align="center">
  <img src="create-run-configuration.png" alt="Run Configuration Creation" width="600"/>
</p>

5. Press Run. A new Eclipse instance will be started, configured with the plugins from your workspace. Go to its
workspace and import the project *org.modmacao.all.extensions.example* from MoDMaCAO. You should end up with a 
workspace as shown below:

<p align="center">
  <img src="setup-example-project.png" alt="Setup example project" width="600"/>
</p>
