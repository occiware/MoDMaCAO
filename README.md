# MoDMaCAO
This repository contains the prototypical implementation of the Model-Driven Configuration Management
of Cloud Applications with OCCI (MoDMaCAO) framework and the models for several example use cases.

The MoDMaCAO modeling framework is based on [OCCI-Studio](https://github.com/occiware/OCCI-Studio) and allows cloud architects to: 
1.  design abstract types modeling cloud applications  and  their  components, 
2.  model  configured instances of cloud applications that use the defined abstract types, and 
3.  check the validity of instances of cloud applications.

## Getting Started
To get started with MoDMaCAO you can download and setup OCCI-Studio or use our preconfigured virtual machine (vm) image.

### Pre-Configured Image:
To use the pre-configured image, e.g., VirtualBox can be used:
1. Download the virtual image from [here](https://owncloud.gwdg.de/index.php/s/psbthAzauw1d7AU).
	1. The password is `modmacao`.
2. Import the appliance in VirtualBox.
3. Start the VM and log in.
	1. Both username and password are: `modmacao`.
4. Navigate to the OCCI-Studio folder on the desktop and double-click on the executable file `OCCI-Studio`.

### Manual Setup
The steps required for a manual setup of MoDMaCAO are enumerated in the following:

1. Requirements: Java (11.0.13), Ansible
2. Download the latest release of OCCI-Studio [here](https://github.com/occiware/OCCI-Studio/releases/tag/current).
3. After downloading the proper archive according to your OS, unzip it
4. Navigate to the OCCI-Studio folder and double-click on the executable file `OCCI-Studio`.
5. Import the `MoDMaCAO` project into the workspace:
	1. File->Import->Git..

### First View
A screenshot displaying the imported MoDMaCAO project is shown below.
After successfully importing the project, you can navigate to the `*.example` projects and launch the `MoDMaCAO` modeling tools. 
For further scenarios, refer to the Tutorials and Use Cases section.

![MoDMaCAO modeling framework](/doc/modmacao-configuration-framework.png)


## Tutorials and Use Cases
- [Custom designers for OCCI applications](doc/designertutorial/overview.md)
- [Using MoDMaCAO with Ansible](doc/ansibletutorial/overview.md)
- [Using the OpenStack Connector of MoDMaCAO](doc/openstacktutorial/overview.md)

## Further Reading
Under the following links, an explanation of the [extended OCCI platform extension](doc/extension/description.md) can be found, as well as some [Example use cases](doc/usecases/usecasedoc.md).
If you are interested in the full story, [read the paper](https://doi.org/10.5220/0006693001000111).


