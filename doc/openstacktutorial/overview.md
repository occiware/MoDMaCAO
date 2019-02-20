# Using the OpenStack Connector from inside OCCI-Studio
The framework is currently developed and tested on Linux (Ubuntu) and has not been tested on other systems so
far. To understand this tutorial, you should have a basic knowledge on how to work with Eclipse and Eclipse plugins.

## Requirements
DISCLAIMER: MoDMaCAO has currently the status of a research prototype, functionality might change or be extended without 
further notice.

- A fresh version of [OCCI-Studio](https://github.com/occiware/OCCI-Studio/releases)
- Access to an OpenStack cloud that you can use to provision Infrastructure.

The following section will give an overview over the involved projects. [(NOT INTERESTED, continue with setup directly)](setup.md)
## Overview
Each of the projects from this repository is implemented as an Eclipse-plugin.
The following projects are important for this tutorial:

<pre>org.modmacao.all.extensions.example</pre>
Contains an example OCCI configuration, which we will use in this tutorial.

<pre>org.modmacao.openstack.runtime</pre>
Contains a small OpenStack-specific OCCI extension, that allows to attach public IP addresses, images and flavors 
to compute instances and to store runtime ids (the ones provided by OpenStack) in the modell.

<pre>org.modmacao.openstack.connector</pre>
This is a connector for the OCCI Infrastructure extension, that connects to an OpenStack cloud. It can be used to manage virtual
machines, networks, network interfaces and block storage. The connector uses [openstack4j](http://www.openstack4j.com/) to
connecto to OpenStack.

Continue with [setup](setup.md).
