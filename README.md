# MoDMaCAO
This repository contains the prototypical implementation of the Model-Driven Configuration Management
of Cloud Applications with OCCI (MoDMaCAO) framework and the models for several example use cases.

The MoDMaCAO modeling framework is based on [OCCI-Studio](https://github.com/occiware/OCCI-Studio) and allows cloud architects to: 
1.  design abstract types modeling cloud applications  and  their  components, 
2.  model  configured instances of cloud applications that use the defined abstract types, and 
3.  check the validity of instances of cloud applications.

## Getting Started
1. Requirements: Java (11.0.13), Ansible

2. Download the latest release of OCCI-Studio [here](https://github.com/occiware/OCCI-Studio/releases/tag/current).

3. After downloading the proper archive according to your OS, unzip and you should find an executable file `OCCI-Studio`.

	1.  You can start the exectuable by double-clicking it or by running  `./Eclipse` on the command line.

4. Import the `MoDMaCAO` project from this site.
	1. File->Import->Git..
5.  After downloading the project register the Ecore packages and OCCI extensions in the Eclipse environment.
	1. Select all plugin projects (Ctrl+a).
	6. Right click and select OCCI-Studio.
	7. Register all EPackages.
	8. Repeat for Register all OCCI Extensions.

Now you can navigate to the `*.example` projects and launch the `MoDMaCAO` modeling tools. 
We included the prebuilt `MoDMaCAO` configurations such as `Lamp` and `Mongodb` visualized below.

![MoDMaCAO modeling framework](/doc/modmacao-configuration-framework.png)


## Tutorials and Use Cases
- [Custom designs for OCCI applications](doc/designertutorial/overview.md)
- [Using MoDMaCAO with Ansible](doc/ansibletutorial/overview.md)
- [Using the OpenStack Connector of MoDMaCAO](doc/openstacktutorial/overview.md)

## Further Reading
Under the following links an explanation of the [extended OCCI platform extension](doc/extension) can be found, as well as some [Example use cases](doc/usecases/usecasedoc.md).
If you are interested in the full story, [read the paper](https://doi.org/10.5220/0006693001000111).
