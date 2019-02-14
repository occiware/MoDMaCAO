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

Continue with [set]