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
<p align="center">
  <img src="/doc/lamp-extension.jpg" alt="LAMP Extension" width="600"/>
</p>

An overview of a LAMP configuration using the defined LAMP extension is shown below:
![Sample LAMP configuration](/doc/lamp-cluster.jpg "Sample LAMP configuration")

### Apache Cassandra
An overview of the Apache Cassandra extension is shown below:
<p align="center">
  <img src="/doc/apache-cassandra-extension.jpg" alt="Apache Cassandra Extension" width="400"/>
</p>

An overview of a sample Apache Cassandra configuration using the defined Apache Cassandra extension is shown below:
![Sample Cassandra configuration](/doc/apache-cassandra-cluster.jpg "Sample Apache Cassandra configuration")

### Apache Spark
An overview of the Apache Spark extension is shown below:
![Apache Spark extension](/doc/apache-spark-extension.jpg "Apache Spark extension")

An overview of a sample Apache Spark configuration using the defined extension is shown below:
![Sample Apache Spark configuration](/doc/apache-spark-cluster.jpg "Sample Apache Spark configuration")
