DISCLAIMER: MoDMaCAO has currently the status of a research prototype, functionality might change or be extended without 
further notice.

# MoDMaCAO with Ansible from inside OCCI-Studio
The framework is currently developed and tested on Linux (Ubuntu) and has not been tested on other systems so
far. To understand this tutorial, you should have a basic knowledge on how to work with Eclipse and Eclipse plugins.

## Requirements
- Ansible >= 2.7.6
- A fresh version of [OCCI-Studio](https://github.com/occiware/OCCI-Studio/releases)

## Overview
Each of the projects from this repository is implemented as an Eclipse-plugin.
The following projects are important for this tutorial:

<pre>org.modmacao.core.connector</pre>
A connector for the MoDMaCAO OCCI Platform extension. It implements
the general handling of the dependencies between components and links to org.modmacao.cm for the actual configuration management.
Currently it is still programmatically linked to the Ansible-specific implementation, which should be removed as soon as there are
more implementations available.

<pre>org.modmacao.cm</pre>
The general interface for configuration management tools is provided by this package. It also currently contains its
Ansible-specific implementation, including Acceleo scripts for generating Ansible roles skeletons and
and Ansible variables files which are used to pass the attributes from the OCCI model to Ansible.

<pre>org.modmacao.ansible</pre>
Contains a very small Ansible-specific OCCI extension, that allows for tagging NetworkLinks to be used as Ansible endpoints.

<pre>org.modmacao.all.extensions.design.extended</pre>

<pre>org.modmacao.openstack.runtime</pre>
Contains a very small OpenStack-specific OCCI extension, that allows to attach public IP addresses to compute instances and
to store runtime ids (the ones provided by OpenStack) in the modell.

<pre>org.modmacao.openstack.connector</pre>
This is a connector for the OCCI Infrastructure extension, that connects to an OpenStack cloud. It can be used to manage virtual
machines, networks, network interfaces and block storage.

## Setup
We assume that you allready downloaded and installed OCCI-Studio.
1. Start OCCI-Studio
2. Import the projects from inside this repository in your workspace.

You should end up with an OCCI-Studio that looks similar to the one below.

<p align="center">
  <img src="/doc/workspace-after-import.png" alt="OCCI-Studio after import" width="600"/>
</p>


3. Locate the project *org.modmacao.all.extensions.design.extended*.
4. Right-Click->Run As->Run Configurations... You are now prompted to create a new run configuration for 
the project. Choose *Eclipse Application*, select Lauch with "plug-ins selected below only" and make sure
that *org.modmacao.openstack.connector* is deselected (see screenshot below)

<p align="center">
  <img src="/doc/create-run-configuration.png" alt="Run Configuration Creation" width="600"/>
</p>

5. Press Run. A new Eclipse instance will be started, configured with the plugins from your workspace. Go to its
workspace and import the project *org.modmacao.all.extensions.example* from MoDMaCAO. You should end up with a 
workspace as shown below:

<p align="center">
  <img src="/doc/setup-example-project.png" alt="Setup example project" width="600"/>
</p>















