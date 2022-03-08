# The MoDMaCAO Modeling Framework
An overview of the MoDMaCAO modeling framework is shown below: 
![MoDMaCAO modeling framework](/doc/modmacao-modeling-framework.jpg "MoDMaCAO modeling framework")

* The Application mixin type abstracts the notion of cloud application. This mixin applies to OCCI Platform Application resources. A cloud application is composed of one or more cloud application components as enforced by the OneOrMoreComponents constraint. Then, modeling specific cloud applications  requires to design new mixin types inheriting from Application, e.g., Cluster and ClientServer types. These new types  could define their own attributes and constraints. For instance, a client-server application has only one server component (i.e., OnlyOneServer constraint) and some client components (i.e., OneOrMoreClients constraint).

* The Cluster mixin type abstracts the notion of clustered cloud application.

* The Component mixin type abstracts the notion of cloud application component. This mixin applies to OCCI Platform Component resources. Each component has an optional immutable modmacao.component.version attribute repre senting the version of the component used at runtime, and must be placed on only one OCCI Compute resource (i.e., OnlyOnePlacementLink constraint). Then, modeling specific cloud application components requires to  define new mixin types inheriting from Component, e.g., Client and Server types. These new component types can define their own attributes and constraints. For instance, a server component has a network port on which to listen to client requests (i.e., server.port immutable attribute) and a client component must be connected to a server component (i.e., OneServerDependency constraint).

* The Version data type defines the valid string pattern for version values, i.e., major.minor.

* The Port data type defines the valid network port values, i.e., range from 0 to 65535.

* The Dependency mixin type abstracts the notion of dependency between two cloud application components. This mixin applies to OCCI Platform ComponentLink links. Both SourceMustBeComponent and TargetMustBeComponent constraints enforce that a dependency link connects two Component instances. Then, modeling specific dependencies requires to define new mixin types inheriting from Dependency, e.g., InstallationDependency, ExecutionDependency, and ServerDependency . These new types could define their own attributes and constraints. For instance, ServerDependency defines two constraints enforcing the dependency source to be a client component and the dependency target to be a server component.

* The InstallationDependency mixin type abstracts an installation dependency, i.e., the source component could be deployed only when the target component is already deployed.

* The ExecutionDependency mixin type abstracts an execution dependency, i.e., the source component could be started only when the target component is already started. For instance, the ServerDependency type abstracts the execution dependency from a client and a server component, i.e., the client component can not start until the server component is started.

