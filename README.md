# MoDMaCAO
This repository contains the prototypical implementation of the Model-Driven Configuration Management
of Cloud Applications with OCCI (MoDMaCAO) framework and the models for several example use cases.

The MoDMaCAO modeling framework is based on [OCCI-Studio](https://github.com/occiware/OCCI-Studio) and allows cloud architects to: 
1.  design abstract types modeling cloud applications  and  their  components, 
2.  model  configured instances of cloud applications that use the defined abstract types, and 
3.  check the validity of instances of cloud applications.

## Getting Started
To get started with MoDMaCAO you can download and setup OCCI-Studio or use our preconfigured virtual machine (vm) image.
The virtual machine image can be found here, with the password being `modmacao`.
If the vm image is used you can start with point 4. from the manual setup:

1. Requirements: Java (11.0.13), Ansible

2. Download the latest release of OCCI-Studio [here](https://github.com/occiware/OCCI-Studio/releases/tag/current).

3. After downloading the proper archive according to your OS, unzip it

4. Navigate to the OCCI-Studio folder and double click on the executable file `OCCI-Studio`.

5. Import the `MoDMaCAO` project into the workspace:
	1. File->Import->Git..
6. Now you can, e.g., navigate to the `*.example` projects and launch the `MoDMaCAO` modeling tools. 
7. For further scenarios refer to the Tutorials and Use Cases section.

![MoDMaCAO modeling framework](/doc/modmacao-configuration-framework.png)


## Tutorials and Use Cases
- [Custom designers for OCCI applications](doc/designertutorial/overview.md)
- [Using MoDMaCAO with Ansible](doc/ansibletutorial/overview.md)
- [Using the OpenStack Connector of MoDMaCAO](doc/openstacktutorial/overview.md)

## Further Reading
Under the following links an explanation of the [extended OCCI platform extension](doc/extension) can be found, as well as some [Example use cases](doc/usecases/usecasedoc.md).
If you are interested in the full story, [read the paper](https://doi.org/10.5220/0006693001000111).
