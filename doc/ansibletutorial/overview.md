
# MoDMaCAO with Ansible from inside OCCI-Studio
The framework is currently developed and tested on Linux (Ubuntu) and has not been tested on other systems so
far. To understand this tutorial, you should have a basic knowledge on how to work with Eclipse and Eclipse plugins.

## Requirements
DISCLAIMER: MoDMaCAO has currently the status of a research prototype, functionality might change or be extended without 
further notice.

- Ansible >= 2.7.6
- A fresh version of [OCCI-Studio](https://github.com/occiware/OCCI-Studio/releases)

Additionally you need access to a virtual or physical machine that you can use as the target for 
the Ansible configurations, which has
- access via SSH,
- with a user with sudo privileges,
- with a private key you have access to,
- and python installed (requirement for using Ansible).

The following section will give an overview over the involved projects. [(NOT INTERESTED, continue with setup directly)](setup.md)
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
Contains a graphical editor generated with OCCI-Studio, which we will use in this tutorial.

<pre>org.modmacao.all.extensions.example</pre>
Contains an example OCCI configuration, which we will use in this tutorial.

Continue with [setup](setup.md).
