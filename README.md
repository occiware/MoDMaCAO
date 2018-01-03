# MoDMaCAO
This repository contains the prototypical implementation of the Model-Driven Configuration Management
of Cloud Applications with OCCI (MoDMaCAO) framework and the models for several example use cases.

## Overall Architecture
The overall architecture is shown below:
![Overall Architecture](/doc/overall-architecture.png "Overall Architecture")


## The MoDMaCAO Modeling Framework
The MoDMaCAO modeling framework is
based on OCCIware and allows cloud architects to: 
1.  design abstract types modeling cloud applications  and  their  components, 
2.  model  configured instances of cloud applications that use the defined abstract types, and 
3.  check the validity of instances of cloud applications.

An overview of the MoDMaCAO modeling framework is shown below:
![MoDMaCAO modeling framework](/doc/modmacao-modeling-framework.jpg "MoDMaCAO modeling framework")

* The Application mixin  type  abstracts  the  notion  of  cloud  application. This  mixin  applies
to  OCCI  Platform Application resources. A cloud  application  is  composed  of  one  or  more
cloud application components as enforced by the OneOrMoreComponents constraint. Then, modeling specific cloud applications 
requires to design new  mixin  types  inheriting  from Application, e.g., Cluster and ClientServer types. These new  types  
could  define  their  own  attributes  and constraints. For  instance,   a  client-server  ap-
plication  has  only  one  server  component  (i.e., OnlyOneServer constraint) and some client com-
ponents (i.e., OneOrMoreClients constraint).

* The Cluster mixin  type  abstracts  the  notion  of
clustered cloud application.

* The Component mixin  type  abstracts  the  notion of cloud application component.  This mixin applies to OCCI Platform
Component resources. Each   component   has   an   optional   immutable modmacao.component.version attribute  repre
senting the version of the component used at runtime,  and  must  be  placed  on  only  one  OCCI
Compute resource (i.e., OnlyOnePlacementLink constraint).  Then, modeling specific cloud application components requires to 
define new mixin types  inheriting  from Component, e.g., Client and Server
types.  These new component types can  define  their  own  attributes  and  constraints.
For instance,  a server component has a network port  on  which  to  listen  to  client  requests  (i.e., server.port
immutable  attribute)  and  a  client component  must  be  connected  to  a  server  com-
ponent (i.e., OneServerDependency constraint).

* The Version data type defines the valid string pattern for version values, i.e., <major>.<minor>.

* The Port data type defines the valid network port values, i.e., range from 0 to 65535.

* The Dependency mixin type abstracts the notion of dependency    between    two    cloud
application    components.         This    mixin    ap-
plies     to     OCCI     Platform
ComponentLink
links.        Both
SourceMustBeComponent
and
TargetMustBeComponent
constraints    enforce
that a dependency link connects two
Component
instances.  Then, modeling specific dependencies
requires to define new mixin types inheriting from
Dependency
,   e.g.,
InstallationDependency
,
ExecutionDependency
,     and
ServerDepen-
dency
.      These  new  types  could  define  their
own  attributes  and  constraints.     For  instance,
ServerDependency
defines    two    constraints
enforcing  the  dependency  source  to  be  a  client
component  and  the  dependency  target  to  be  a
server component.

* The InstallationDependency
mixin   type   ab-
stracts an installation dependency, i.e., the source
component could be deployed only when the tar-
get component is already deployed.

* The ExecutionDependency mixin type abstracts
an  execution  dependency,  i.e.,  the  source  com-
ponent  could  be  started  only  when  the  target
component  is  already  started.   For  instance,  the
ServerDependency type abstracts the execution
dependency from a client and a server component,
i.e.,  the  client  component can  not  start  until  the
server component is started.


## The MoDMaCAO Implementation Framework
tba

## Example Use Cases
The repository contains several examples that have been modelled with help of MoDMaCAO: a model
for a distributed MongoDB, a model for a the popular LAMP stack, a model for the Apache
Cassandra database, and a model for an Apache Spark cluster.

### MongoDB
MongoDB  is  a  NoSQL  database  that  can  be  highly scaled and is often used in cloud environments.   To
achieve scalability, it supports the concept of sharding, i.e., the decomposition of and distributed storage
of a data collection to several machines. Furthermore, replication sets can be used,  to provide redundancy
and high availability in case a machine experiences a failure.
An overview of the MongoDB specific extension is shown below:
![MongoDB extension](/doc/mongodb-extension.jpg "MongoDB extension")

* The MongoDBComponent mixin type is the base type for all other MongoDB-specific mixin types.
It  defines  the  attributes mongodb.bindip, and mongodb.port, that specifies the IP address and
port on which the mongodb service should be listening.

* The ReplicableMongoDBComponent mixin type   defines   the   base   type   for   components
that  can  be  replicated.    It  defines  the  attribute mongodb.replication.set.name
that  is  used to assign a component to a certain replication set. MongoDB  components  belonging  to  the  same
replication  set  are  synchronized  copies  of  each other.

* The Router mixin type abstracts the notion of a router in the MongoDB cluster.  A router implements the component to which the 
user connects. It  forwards  the  requests  of  the  user  to  the  machines that actually hold the data

* The ConfigServer mixin type abstracts the notion of a config server of a MongoDB cluster. A config server stores the metadata,
including the state and organization of the data.  It is also responsible to store authentication configuration information.

* The Shard mixin  type  abstracts  the  notion  of  a shard in  the  MongoDB  cluster.   The  shards  are
used to store the actual data of the database. Each shard holds a subset of the overall data.

* The Cluster mixin type defines constraints for a MongoDB cluster: A cluster must contain at least one router (i.e., 
OneOrMoreRouters), at least one shard (i.e., OneOrMoreShards),  and at least one config server (i.e., OneOrMoreConfigServer
).

* The ConfigServerDependency mixin type abstracts   the   execution   dependency   between MongoDBComponents and a ConfigServer
, to be able to ensure that the ConfigServer is started, before the other components get started.

An overview of a sample configuration using the defined MongoDB extension is shown below:
![Sample MongoDB configuration](/doc/mongodb-cluster-simplified-representation-updated.jpg "Sample MongoDB configuration")

For  the  sake  of  brevity,  we  omit  the  depiction  of Attributes.   The  MongoDB-cluster cluster consists of the components 
router, configserver, and the  three  shards, shard1 to shard3. The router and shard1 to shard3 have an execution dependency to  
the configserver. The  components  are  placed on five different virtual machines, vm1 to vm5 , using
PlacementLinks, which are connected to a network using NetworkInterfaces.


### LAMP
An overview of the LAMP specific extension is shown below:
![LAMP extension](/doc/lamp-extension.jpg "LAMP extension")

An overview of a LAMP configuration using the defined LAMP extension is shown below:
![Sample LAMP configuration](/doc/lamp-cluster.jpg "Sample LAMP configuration")

### Apache Cassandra
An overview of the Apache Cassandra extension is shown below:
![Apache Cassandra extension](/doc/apache-cassandra-extension.jpg "Apache Cassandra extension")

An overview of a sample Apache Cassandra configuration using the defined Apache Cassandra extension is shown below:
![Sample Cassandra configuration](/doc/apache-cassandra-cluster.jpg "Sample Apache Cassandra configuration")

### Apache Spark
An overview of the Apache Spark extension is shown below:
![Apache Spark extension](/doc/apache-spark-extension.jpg "Apache Spark extension")

An overview of a sample Apache Spark configuration using the defined extension is shown belwo:
![Sample Apache Spark configuration](/doc/apache-spark-cluster.jpg "Sample Apache Spark configuration")

