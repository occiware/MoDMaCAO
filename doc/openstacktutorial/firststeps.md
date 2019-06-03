# First Steps with OpenStack in MoDMaCAO #

1. Open *test-openstack* in the *representation.aird* file:

<p align="center">
  <img src="test-openstack-representation.png" alt="OpenStack Test Representation" width="600"/>
</p>

The representation shows a simple setup with one virtual machine connected to a network.

2. Provision the Network: Right-Click on the Network Resource->CRUD Operations->Create
The Network will change its color to light green, when it becomes active and a new Mixin "RuntimeID"
will be added. The RuntimeID Mixin contains the OpenStack id of the running network instance.

<p align="center">
  <img src="openstack-network-provisioning.png" alt="OpenStack Network Provisioning" width="600"/>
</p>

3. Provision the VM: Right-Click on the Compute Resource->CRUD Operations->Create
This will provision a VM with the default flavor,image and key set in your configuration file.
The VM will change its color to light green, when it becomes active and a new Mixin "RuntimeID"
will be added. The RuntimeID Mixin contains the OpenStack id of the running VM. Note that also
the NetworkInterface will become active, since it will be created by default, when the VM gets
created

<p align="center">
  <img src="openstack-vm-provisioning.png" alt="OpenStack VM Provisioning" width="600"/>
</p>

## Add a second VM with a specified flavor ##
tbd

## Use an allready existing ressource ##
tbd

Make sure that you call OCCI Delete (Right-Click->CRUD Operations->Delete) on all elements to deprovision the resources when you done with the tutorial.



