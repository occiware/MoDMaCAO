/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.modmacao.mongodb;

import modmacao.ModmacaoPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.modmacao.mongodb.MongodbFactory
 * @model kind="package"
 * @generated
 */
public interface MongodbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mongodb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.modmacao.org/mongodb/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mongodb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MongodbPackage eINSTANCE = org.modmacao.mongodb.impl.MongodbPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modmacao.mongodb.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.mongodb.impl.ComponentImpl
	 * @see org.modmacao.mongodb.impl.MongodbPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Mongodb Replication Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MONGODB_REPLICATION_SET_NAME = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.mongodb.impl.ConfigserverImpl <em>Configserver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.mongodb.impl.ConfigserverImpl
	 * @see org.modmacao.mongodb.impl.MongodbPackageImpl#getConfigserver()
	 * @generated
	 */
	int CONFIGSERVER = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGSERVER__MIXIN = COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGSERVER__ENTITY = COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGSERVER__ATTRIBUTES = COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGSERVER__MODMACAO_COMPONENT_VERSION = COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Mongodb Replication Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGSERVER__MONGODB_REPLICATION_SET_NAME = COMPONENT__MONGODB_REPLICATION_SET_NAME;

	/**
	 * The number of structural features of the '<em>Configserver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGSERVER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Configserver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGSERVER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.mongodb.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.mongodb.impl.RouterImpl
	 * @see org.modmacao.mongodb.impl.MongodbPackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__MIXIN = COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__ENTITY = COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__ATTRIBUTES = COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__MODMACAO_COMPONENT_VERSION = COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Mongodb Replication Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__MONGODB_REPLICATION_SET_NAME = COMPONENT__MONGODB_REPLICATION_SET_NAME;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.mongodb.impl.ShardImpl <em>Shard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.mongodb.impl.ShardImpl
	 * @see org.modmacao.mongodb.impl.MongodbPackageImpl#getShard()
	 * @generated
	 */
	int SHARD = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARD__MIXIN = COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARD__ENTITY = COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARD__ATTRIBUTES = COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARD__MODMACAO_COMPONENT_VERSION = COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Mongodb Replication Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARD__MONGODB_REPLICATION_SET_NAME = COMPONENT__MONGODB_REPLICATION_SET_NAME;

	/**
	 * The number of structural features of the '<em>Shard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARD_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARD_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.mongodb.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.mongodb.impl.ClusterImpl
	 * @see org.modmacao.mongodb.impl.MongodbPackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__MIXIN = ModmacaoPackage.CLUSTER__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__ENTITY = ModmacaoPackage.CLUSTER__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__ATTRIBUTES = ModmacaoPackage.CLUSTER__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = ModmacaoPackage.CLUSTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>One Or More Config Servers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___ONE_OR_MORE_CONFIG_SERVERS__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.CLUSTER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>One Or More Routers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___ONE_OR_MORE_ROUTERS__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.CLUSTER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>One Or More Shards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___ONE_OR_MORE_SHARDS__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.CLUSTER_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_OPERATION_COUNT = ModmacaoPackage.CLUSTER_OPERATION_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.modmacao.mongodb.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.modmacao.mongodb.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.modmacao.mongodb.Component#getMongodbReplicationSetName <em>Mongodb Replication Set Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mongodb Replication Set Name</em>'.
	 * @see org.modmacao.mongodb.Component#getMongodbReplicationSetName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_MongodbReplicationSetName();

	/**
	 * Returns the meta object for class '{@link org.modmacao.mongodb.Configserver <em>Configserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configserver</em>'.
	 * @see org.modmacao.mongodb.Configserver
	 * @generated
	 */
	EClass getConfigserver();

	/**
	 * Returns the meta object for class '{@link org.modmacao.mongodb.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see org.modmacao.mongodb.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for class '{@link org.modmacao.mongodb.Shard <em>Shard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shard</em>'.
	 * @see org.modmacao.mongodb.Shard
	 * @generated
	 */
	EClass getShard();

	/**
	 * Returns the meta object for class '{@link org.modmacao.mongodb.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see org.modmacao.mongodb.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the '{@link org.modmacao.mongodb.Cluster#OneOrMoreConfigServers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>One Or More Config Servers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>One Or More Config Servers</em>' operation.
	 * @see org.modmacao.mongodb.Cluster#OneOrMoreConfigServers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCluster__OneOrMoreConfigServers__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.modmacao.mongodb.Cluster#OneOrMoreRouters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>One Or More Routers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>One Or More Routers</em>' operation.
	 * @see org.modmacao.mongodb.Cluster#OneOrMoreRouters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCluster__OneOrMoreRouters__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.modmacao.mongodb.Cluster#OneOrMoreShards(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>One Or More Shards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>One Or More Shards</em>' operation.
	 * @see org.modmacao.mongodb.Cluster#OneOrMoreShards(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCluster__OneOrMoreShards__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MongodbFactory getMongodbFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.modmacao.mongodb.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.mongodb.impl.ComponentImpl
		 * @see org.modmacao.mongodb.impl.MongodbPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Mongodb Replication Set Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__MONGODB_REPLICATION_SET_NAME = eINSTANCE.getComponent_MongodbReplicationSetName();

		/**
		 * The meta object literal for the '{@link org.modmacao.mongodb.impl.ConfigserverImpl <em>Configserver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.mongodb.impl.ConfigserverImpl
		 * @see org.modmacao.mongodb.impl.MongodbPackageImpl#getConfigserver()
		 * @generated
		 */
		EClass CONFIGSERVER = eINSTANCE.getConfigserver();

		/**
		 * The meta object literal for the '{@link org.modmacao.mongodb.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.mongodb.impl.RouterImpl
		 * @see org.modmacao.mongodb.impl.MongodbPackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '{@link org.modmacao.mongodb.impl.ShardImpl <em>Shard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.mongodb.impl.ShardImpl
		 * @see org.modmacao.mongodb.impl.MongodbPackageImpl#getShard()
		 * @generated
		 */
		EClass SHARD = eINSTANCE.getShard();

		/**
		 * The meta object literal for the '{@link org.modmacao.mongodb.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.mongodb.impl.ClusterImpl
		 * @see org.modmacao.mongodb.impl.MongodbPackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>One Or More Config Servers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLUSTER___ONE_OR_MORE_CONFIG_SERVERS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCluster__OneOrMoreConfigServers__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>One Or More Routers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLUSTER___ONE_OR_MORE_ROUTERS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCluster__OneOrMoreRouters__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>One Or More Shards</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLUSTER___ONE_OR_MORE_SHARDS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCluster__OneOrMoreShards__DiagnosticChain_Map();

	}

} //MongodbPackage
