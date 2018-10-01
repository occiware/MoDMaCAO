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
package apache_spark;

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
 * @see apache_spark.Apache_sparkFactory
 * @model kind="package"
 * @generated
 */
public interface Apache_sparkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "apache_spark";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.modmacao.org/apache/spark/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apache_spark";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Apache_sparkPackage eINSTANCE = apache_spark.impl.Apache_sparkPackageImpl.init();

	/**
	 * The meta object id for the '{@link apache_spark.impl.ApachesparkcomponentImpl <em>Apachesparkcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apache_spark.impl.ApachesparkcomponentImpl
	 * @see apache_spark.impl.Apache_sparkPackageImpl#getApachesparkcomponent()
	 * @generated
	 */
	int APACHESPARKCOMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESPARKCOMPONENT__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESPARKCOMPONENT__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESPARKCOMPONENT__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESPARKCOMPONENT__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Apache Spark Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESPARKCOMPONENT__APACHE_SPARK_PORT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Apache Spark Webui Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESPARKCOMPONENT__APACHE_SPARK_WEBUI_PORT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Apachesparkcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESPARKCOMPONENT_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Apachesparkcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESPARKCOMPONENT_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link apache_spark.impl.MasterImpl <em>Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apache_spark.impl.MasterImpl
	 * @see apache_spark.impl.Apache_sparkPackageImpl#getMaster()
	 * @generated
	 */
	int MASTER = 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__MIXIN = APACHESPARKCOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__ENTITY = APACHESPARKCOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__ATTRIBUTES = APACHESPARKCOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__MODMACAO_COMPONENT_VERSION = APACHESPARKCOMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Apache Spark Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__APACHE_SPARK_PORT = APACHESPARKCOMPONENT__APACHE_SPARK_PORT;

	/**
	 * The feature id for the '<em><b>Apache Spark Webui Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__APACHE_SPARK_WEBUI_PORT = APACHESPARKCOMPONENT__APACHE_SPARK_WEBUI_PORT;

	/**
	 * The number of structural features of the '<em>Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FEATURE_COUNT = APACHESPARKCOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_OPERATION_COUNT = APACHESPARKCOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link apache_spark.impl.WorkerImpl <em>Worker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apache_spark.impl.WorkerImpl
	 * @see apache_spark.impl.Apache_sparkPackageImpl#getWorker()
	 * @generated
	 */
	int WORKER = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__MIXIN = APACHESPARKCOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__ENTITY = APACHESPARKCOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__ATTRIBUTES = APACHESPARKCOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__MODMACAO_COMPONENT_VERSION = APACHESPARKCOMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Apache Spark Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__APACHE_SPARK_PORT = APACHESPARKCOMPONENT__APACHE_SPARK_PORT;

	/**
	 * The feature id for the '<em><b>Apache Spark Webui Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__APACHE_SPARK_WEBUI_PORT = APACHESPARKCOMPONENT__APACHE_SPARK_WEBUI_PORT;

	/**
	 * The feature id for the '<em><b>Apache Spark Worker Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__APACHE_SPARK_WORKER_CORES = APACHESPARKCOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Apache Spark Worker Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__APACHE_SPARK_WORKER_MEMORY = APACHESPARKCOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Worker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_FEATURE_COUNT = APACHESPARKCOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Worker Memory Smaller Than Compute Memory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER___WORKER_MEMORY_SMALLER_THAN_COMPUTE_MEMORY__DIAGNOSTICCHAIN_MAP = APACHESPARKCOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Worker Cores Smaller Than Compute Cores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER___WORKER_CORES_SMALLER_THAN_COMPUTE_CORES__DIAGNOSTICCHAIN_MAP = APACHESPARKCOMPONENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Only One Master Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER___ONLY_ONE_MASTER_DEPENDENCY__DIAGNOSTICCHAIN_MAP = APACHESPARKCOMPONENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Worker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_OPERATION_COUNT = APACHESPARKCOMPONENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link apache_spark.impl.ApachesparkclusterImpl <em>Apachesparkcluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apache_spark.impl.ApachesparkclusterImpl
	 * @see apache_spark.impl.Apache_sparkPackageImpl#getApachesparkcluster()
	 * @generated
	 */
	int APACHESPARKCLUSTER = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESPARKCLUSTER__MIXIN = ModmacaoPackage.CLUSTER__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESPARKCLUSTER__ENTITY = ModmacaoPackage.CLUSTER__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESPARKCLUSTER__ATTRIBUTES = ModmacaoPackage.CLUSTER__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Apachesparkcluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESPARKCLUSTER_FEATURE_COUNT = ModmacaoPackage.CLUSTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Only One Master</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESPARKCLUSTER___ONLY_ONE_MASTER__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.CLUSTER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>One Or More Workers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESPARKCLUSTER___ONE_OR_MORE_WORKERS__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.CLUSTER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Apachesparkcluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESPARKCLUSTER_OPERATION_COUNT = ModmacaoPackage.CLUSTER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link apache_spark.impl.MasterdependencyImpl <em>Masterdependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apache_spark.impl.MasterdependencyImpl
	 * @see apache_spark.impl.Apache_sparkPackageImpl#getMasterdependency()
	 * @generated
	 */
	int MASTERDEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERDEPENDENCY__MIXIN = ModmacaoPackage.EXECUTIONDEPENDENCY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERDEPENDENCY__ENTITY = ModmacaoPackage.EXECUTIONDEPENDENCY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERDEPENDENCY__ATTRIBUTES = ModmacaoPackage.EXECUTIONDEPENDENCY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Masterdependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERDEPENDENCY_FEATURE_COUNT = ModmacaoPackage.EXECUTIONDEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Target Must Be Master</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERDEPENDENCY___TARGET_MUST_BE_MASTER__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.EXECUTIONDEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Source Must Be Worker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERDEPENDENCY___SOURCE_MUST_BE_WORKER__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.EXECUTIONDEPENDENCY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Masterdependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERDEPENDENCY_OPERATION_COUNT = ModmacaoPackage.EXECUTIONDEPENDENCY_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link apache_spark.Master <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master</em>'.
	 * @see apache_spark.Master
	 * @generated
	 */
	EClass getMaster();

	/**
	 * Returns the meta object for class '{@link apache_spark.Worker <em>Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worker</em>'.
	 * @see apache_spark.Worker
	 * @generated
	 */
	EClass getWorker();

	/**
	 * Returns the meta object for the attribute '{@link apache_spark.Worker#getApacheSparkWorkerCores <em>Apache Spark Worker Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apache Spark Worker Cores</em>'.
	 * @see apache_spark.Worker#getApacheSparkWorkerCores()
	 * @see #getWorker()
	 * @generated
	 */
	EAttribute getWorker_ApacheSparkWorkerCores();

	/**
	 * Returns the meta object for the attribute '{@link apache_spark.Worker#getApacheSparkWorkerMemory <em>Apache Spark Worker Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apache Spark Worker Memory</em>'.
	 * @see apache_spark.Worker#getApacheSparkWorkerMemory()
	 * @see #getWorker()
	 * @generated
	 */
	EAttribute getWorker_ApacheSparkWorkerMemory();

	/**
	 * Returns the meta object for the '{@link apache_spark.Worker#WorkerMemorySmallerThanComputeMemory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Worker Memory Smaller Than Compute Memory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Worker Memory Smaller Than Compute Memory</em>' operation.
	 * @see apache_spark.Worker#WorkerMemorySmallerThanComputeMemory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWorker__WorkerMemorySmallerThanComputeMemory__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link apache_spark.Worker#WorkerCoresSmallerThanComputeCores(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Worker Cores Smaller Than Compute Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Worker Cores Smaller Than Compute Cores</em>' operation.
	 * @see apache_spark.Worker#WorkerCoresSmallerThanComputeCores(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWorker__WorkerCoresSmallerThanComputeCores__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link apache_spark.Worker#OnlyOneMasterDependency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only One Master Dependency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Only One Master Dependency</em>' operation.
	 * @see apache_spark.Worker#OnlyOneMasterDependency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWorker__OnlyOneMasterDependency__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link apache_spark.Apachesparkcomponent <em>Apachesparkcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apachesparkcomponent</em>'.
	 * @see apache_spark.Apachesparkcomponent
	 * @generated
	 */
	EClass getApachesparkcomponent();

	/**
	 * Returns the meta object for the attribute '{@link apache_spark.Apachesparkcomponent#getApacheSparkPort <em>Apache Spark Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apache Spark Port</em>'.
	 * @see apache_spark.Apachesparkcomponent#getApacheSparkPort()
	 * @see #getApachesparkcomponent()
	 * @generated
	 */
	EAttribute getApachesparkcomponent_ApacheSparkPort();

	/**
	 * Returns the meta object for the attribute '{@link apache_spark.Apachesparkcomponent#getApacheSparkWebuiPort <em>Apache Spark Webui Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apache Spark Webui Port</em>'.
	 * @see apache_spark.Apachesparkcomponent#getApacheSparkWebuiPort()
	 * @see #getApachesparkcomponent()
	 * @generated
	 */
	EAttribute getApachesparkcomponent_ApacheSparkWebuiPort();

	/**
	 * Returns the meta object for class '{@link apache_spark.Apachesparkcluster <em>Apachesparkcluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apachesparkcluster</em>'.
	 * @see apache_spark.Apachesparkcluster
	 * @generated
	 */
	EClass getApachesparkcluster();

	/**
	 * Returns the meta object for the '{@link apache_spark.Apachesparkcluster#OnlyOneMaster(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only One Master</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Only One Master</em>' operation.
	 * @see apache_spark.Apachesparkcluster#OnlyOneMaster(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApachesparkcluster__OnlyOneMaster__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link apache_spark.Apachesparkcluster#OneOrMoreWorkers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>One Or More Workers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>One Or More Workers</em>' operation.
	 * @see apache_spark.Apachesparkcluster#OneOrMoreWorkers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApachesparkcluster__OneOrMoreWorkers__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link apache_spark.Masterdependency <em>Masterdependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Masterdependency</em>'.
	 * @see apache_spark.Masterdependency
	 * @generated
	 */
	EClass getMasterdependency();

	/**
	 * Returns the meta object for the '{@link apache_spark.Masterdependency#TargetMustBeMaster(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Must Be Master</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Must Be Master</em>' operation.
	 * @see apache_spark.Masterdependency#TargetMustBeMaster(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMasterdependency__TargetMustBeMaster__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link apache_spark.Masterdependency#SourceMustBeWorker(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Worker</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Worker</em>' operation.
	 * @see apache_spark.Masterdependency#SourceMustBeWorker(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMasterdependency__SourceMustBeWorker__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Apache_sparkFactory getApache_sparkFactory();

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
		 * The meta object literal for the '{@link apache_spark.impl.MasterImpl <em>Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apache_spark.impl.MasterImpl
		 * @see apache_spark.impl.Apache_sparkPackageImpl#getMaster()
		 * @generated
		 */
		EClass MASTER = eINSTANCE.getMaster();

		/**
		 * The meta object literal for the '{@link apache_spark.impl.WorkerImpl <em>Worker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apache_spark.impl.WorkerImpl
		 * @see apache_spark.impl.Apache_sparkPackageImpl#getWorker()
		 * @generated
		 */
		EClass WORKER = eINSTANCE.getWorker();

		/**
		 * The meta object literal for the '<em><b>Apache Spark Worker Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKER__APACHE_SPARK_WORKER_CORES = eINSTANCE.getWorker_ApacheSparkWorkerCores();

		/**
		 * The meta object literal for the '<em><b>Apache Spark Worker Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKER__APACHE_SPARK_WORKER_MEMORY = eINSTANCE.getWorker_ApacheSparkWorkerMemory();

		/**
		 * The meta object literal for the '<em><b>Worker Memory Smaller Than Compute Memory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKER___WORKER_MEMORY_SMALLER_THAN_COMPUTE_MEMORY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getWorker__WorkerMemorySmallerThanComputeMemory__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Worker Cores Smaller Than Compute Cores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKER___WORKER_CORES_SMALLER_THAN_COMPUTE_CORES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getWorker__WorkerCoresSmallerThanComputeCores__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Only One Master Dependency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKER___ONLY_ONE_MASTER_DEPENDENCY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getWorker__OnlyOneMasterDependency__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link apache_spark.impl.ApachesparkcomponentImpl <em>Apachesparkcomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apache_spark.impl.ApachesparkcomponentImpl
		 * @see apache_spark.impl.Apache_sparkPackageImpl#getApachesparkcomponent()
		 * @generated
		 */
		EClass APACHESPARKCOMPONENT = eINSTANCE.getApachesparkcomponent();

		/**
		 * The meta object literal for the '<em><b>Apache Spark Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHESPARKCOMPONENT__APACHE_SPARK_PORT = eINSTANCE.getApachesparkcomponent_ApacheSparkPort();

		/**
		 * The meta object literal for the '<em><b>Apache Spark Webui Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHESPARKCOMPONENT__APACHE_SPARK_WEBUI_PORT = eINSTANCE.getApachesparkcomponent_ApacheSparkWebuiPort();

		/**
		 * The meta object literal for the '{@link apache_spark.impl.ApachesparkclusterImpl <em>Apachesparkcluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apache_spark.impl.ApachesparkclusterImpl
		 * @see apache_spark.impl.Apache_sparkPackageImpl#getApachesparkcluster()
		 * @generated
		 */
		EClass APACHESPARKCLUSTER = eINSTANCE.getApachesparkcluster();

		/**
		 * The meta object literal for the '<em><b>Only One Master</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APACHESPARKCLUSTER___ONLY_ONE_MASTER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getApachesparkcluster__OnlyOneMaster__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>One Or More Workers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APACHESPARKCLUSTER___ONE_OR_MORE_WORKERS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getApachesparkcluster__OneOrMoreWorkers__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link apache_spark.impl.MasterdependencyImpl <em>Masterdependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apache_spark.impl.MasterdependencyImpl
		 * @see apache_spark.impl.Apache_sparkPackageImpl#getMasterdependency()
		 * @generated
		 */
		EClass MASTERDEPENDENCY = eINSTANCE.getMasterdependency();

		/**
		 * The meta object literal for the '<em><b>Target Must Be Master</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MASTERDEPENDENCY___TARGET_MUST_BE_MASTER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMasterdependency__TargetMustBeMaster__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Worker</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MASTERDEPENDENCY___SOURCE_MUST_BE_WORKER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMasterdependency__SourceMustBeWorker__DiagnosticChain_Map();

	}

} //Apache_sparkPackage
