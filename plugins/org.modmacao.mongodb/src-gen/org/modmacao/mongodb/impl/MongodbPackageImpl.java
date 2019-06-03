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
package org.modmacao.mongodb.impl;

import modmacao.ModmacaoPackage;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modmacao.mongodb.Cluster;
import org.modmacao.mongodb.Configserver;
import org.modmacao.mongodb.Configserverdependency;
import org.modmacao.mongodb.MongodbFactory;
import org.modmacao.mongodb.MongodbPackage;
import org.modmacao.mongodb.Mongodbcomponent;
import org.modmacao.mongodb.Replicablemongodbcomponent;
import org.modmacao.mongodb.Router;
import org.modmacao.mongodb.Shard;

import org.modmacao.mongodb.util.MongodbValidator;

import org.modmacao.occi.platform.PlatformPackage;

import org.modmacao.placement.PlacementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MongodbPackageImpl extends EPackageImpl implements MongodbPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mongodbcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configserverdependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replicablemongodbcomponentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.modmacao.mongodb.MongodbPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MongodbPackageImpl() {
		super(eNS_URI, MongodbFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MongodbPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MongodbPackage init() {
		if (isInited) return (MongodbPackage)EPackage.Registry.INSTANCE.getEPackage(MongodbPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMongodbPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MongodbPackageImpl theMongodbPackage = registeredMongodbPackage instanceof MongodbPackageImpl ? (MongodbPackageImpl)registeredMongodbPackage : new MongodbPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		PlatformPackage.eINSTANCE.eClass();
		PlacementPackage.eINSTANCE.eClass();
		ModmacaoPackage.eINSTANCE.eClass();
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMongodbPackage.createPackageContents();

		// Initialize created meta-data
		theMongodbPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMongodbPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MongodbValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMongodbPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MongodbPackage.eNS_URI, theMongodbPackage);
		return theMongodbPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMongodbcomponent() {
		return mongodbcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMongodbcomponent_MongodbBindIP() {
		return (EAttribute)mongodbcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMongodbcomponent_MongodbPort() {
		return (EAttribute)mongodbcomponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigserver() {
		return configserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouter() {
		return routerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShard() {
		return shardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCluster() {
		return clusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCluster__OneOrMoreConfigServers__DiagnosticChain_Map_1() {
		return clusterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCluster__OneOrMoreRouters__DiagnosticChain_Map_1() {
		return clusterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCluster__OneOrMoreShards__DiagnosticChain_Map_1() {
		return clusterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigserverdependency() {
		return configserverdependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplicablemongodbcomponent() {
		return replicablemongodbcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicablemongodbcomponent_MongodbReplicationSetName() {
		return (EAttribute)replicablemongodbcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MongodbFactory getMongodbFactory() {
		return (MongodbFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mongodbcomponentEClass = createEClass(MONGODBCOMPONENT);
		createEAttribute(mongodbcomponentEClass, MONGODBCOMPONENT__MONGODB_BIND_IP);
		createEAttribute(mongodbcomponentEClass, MONGODBCOMPONENT__MONGODB_PORT);

		configserverEClass = createEClass(CONFIGSERVER);

		routerEClass = createEClass(ROUTER);

		shardEClass = createEClass(SHARD);

		clusterEClass = createEClass(CLUSTER);
		createEOperation(clusterEClass, CLUSTER___ONE_OR_MORE_CONFIG_SERVERS__DIAGNOSTICCHAIN_MAP_1);
		createEOperation(clusterEClass, CLUSTER___ONE_OR_MORE_ROUTERS__DIAGNOSTICCHAIN_MAP_1);
		createEOperation(clusterEClass, CLUSTER___ONE_OR_MORE_SHARDS__DIAGNOSTICCHAIN_MAP_1);

		configserverdependencyEClass = createEClass(CONFIGSERVERDEPENDENCY);

		replicablemongodbcomponentEClass = createEClass(REPLICABLEMONGODBCOMPONENT);
		createEAttribute(replicablemongodbcomponentEClass, REPLICABLEMONGODBCOMPONENT__MONGODB_REPLICATION_SET_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModmacaoPackage theModmacaoPackage = (ModmacaoPackage)EPackage.Registry.INSTANCE.getEPackage(ModmacaoPackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mongodbcomponentEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		mongodbcomponentEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		configserverEClass.getESuperTypes().add(this.getReplicablemongodbcomponent());
		configserverEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		routerEClass.getESuperTypes().add(this.getMongodbcomponent());
		routerEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		shardEClass.getESuperTypes().add(this.getReplicablemongodbcomponent());
		shardEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		clusterEClass.getESuperTypes().add(theModmacaoPackage.getCluster());
		clusterEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		configserverdependencyEClass.getESuperTypes().add(theModmacaoPackage.getExecutiondependency());
		configserverdependencyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		replicablemongodbcomponentEClass.getESuperTypes().add(this.getMongodbcomponent());
		replicablemongodbcomponentEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(mongodbcomponentEClass, Mongodbcomponent.class, "Mongodbcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMongodbcomponent_MongodbBindIP(), ecorePackage.getEString(), "mongodbBindIP", null, 0, 1, Mongodbcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMongodbcomponent_MongodbPort(), theModmacaoPackage.getPort(), "mongodbPort", null, 0, 1, Mongodbcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configserverEClass, Configserver.class, "Configserver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(routerEClass, Router.class, "Router", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shardEClass, Shard.class, "Shard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getCluster__OneOrMoreConfigServers__DiagnosticChain_Map_1(), ecorePackage.getEBoolean(), "OneOrMoreConfigServers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCluster__OneOrMoreRouters__DiagnosticChain_Map_1(), ecorePackage.getEBoolean(), "OneOrMoreRouters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCluster__OneOrMoreShards__DiagnosticChain_Map_1(), ecorePackage.getEBoolean(), "OneOrMoreShards", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(configserverdependencyEClass, Configserverdependency.class, "Configserverdependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(replicablemongodbcomponentEClass, Replicablemongodbcomponent.class, "Replicablemongodbcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReplicablemongodbcomponent_MongodbReplicationSetName(), ecorePackage.getEString(), "mongodbReplicationSetName", null, 0, 1, Replicablemongodbcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (clusterEClass,
		   source,
		   new String[] {
			   "constraints", "OneOrMoreShards"
		   });
	}

} //MongodbPackageImpl
