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
package apache_cassandra;

import modmacao.ModmacaoPackage;

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
 * @see apache_cassandra.Apache_cassandraFactory
 * @model kind="package"
 * @generated
 */
public interface Apache_cassandraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "apache_cassandra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.modmacao.org/apache/cassandra/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apache_cassandra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Apache_cassandraPackage eINSTANCE = apache_cassandra.impl.Apache_cassandraPackageImpl.init();

	/**
	 * The meta object id for the '{@link apache_cassandra.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apache_cassandra.impl.ClusterImpl
	 * @see apache_cassandra.impl.Apache_cassandraPackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 0;

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
	 * The operation id for the '<em>One Or More Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___ONE_OR_MORE_NODES__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.CLUSTER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>One Or More Seeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___ONE_OR_MORE_SEEDS__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.CLUSTER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_OPERATION_COUNT = ModmacaoPackage.CLUSTER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link apache_cassandra.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apache_cassandra.impl.NodeImpl
	 * @see apache_cassandra.impl.Apache_cassandraPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link apache_cassandra.impl.SeedImpl <em>Seed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apache_cassandra.impl.SeedImpl
	 * @see apache_cassandra.impl.Apache_cassandraPackageImpl#getSeed()
	 * @generated
	 */
	int SEED = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED__MIXIN = NODE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED__ENTITY = NODE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED__ATTRIBUTES = NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED__MODMACAO_COMPONENT_VERSION = NODE__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Seed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Seed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link apache_cassandra.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see apache_cassandra.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the '{@link apache_cassandra.Cluster#OneOrMoreNodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>One Or More Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>One Or More Nodes</em>' operation.
	 * @see apache_cassandra.Cluster#OneOrMoreNodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCluster__OneOrMoreNodes__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link apache_cassandra.Cluster#OneOrMoreSeeds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>One Or More Seeds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>One Or More Seeds</em>' operation.
	 * @see apache_cassandra.Cluster#OneOrMoreSeeds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCluster__OneOrMoreSeeds__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link apache_cassandra.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see apache_cassandra.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link apache_cassandra.Seed <em>Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seed</em>'.
	 * @see apache_cassandra.Seed
	 * @generated
	 */
	EClass getSeed();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Apache_cassandraFactory getApache_cassandraFactory();

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
		 * The meta object literal for the '{@link apache_cassandra.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apache_cassandra.impl.ClusterImpl
		 * @see apache_cassandra.impl.Apache_cassandraPackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>One Or More Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLUSTER___ONE_OR_MORE_NODES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCluster__OneOrMoreNodes__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>One Or More Seeds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLUSTER___ONE_OR_MORE_SEEDS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCluster__OneOrMoreSeeds__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link apache_cassandra.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apache_cassandra.impl.NodeImpl
		 * @see apache_cassandra.impl.Apache_cassandraPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link apache_cassandra.impl.SeedImpl <em>Seed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apache_cassandra.impl.SeedImpl
		 * @see apache_cassandra.impl.Apache_cassandraPackageImpl#getSeed()
		 * @generated
		 */
		EClass SEED = eINSTANCE.getSeed();

	}

} //Apache_cassandraPackage
