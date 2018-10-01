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
package apache_cassandra.impl;

import apache_cassandra.Apache_cassandraFactory;
import apache_cassandra.Apache_cassandraPackage;
import apache_cassandra.Cluster;
import apache_cassandra.Node;
import apache_cassandra.Seed;

import apache_cassandra.util.Apache_cassandraValidator;

import modmacao.ModmacaoPackage;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Apache_cassandraPackageImpl extends EPackageImpl implements Apache_cassandraPackage {
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
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seedEClass = null;

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
	 * @see apache_cassandra.Apache_cassandraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Apache_cassandraPackageImpl() {
		super(eNS_URI, Apache_cassandraFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Apache_cassandraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Apache_cassandraPackage init() {
		if (isInited) return (Apache_cassandraPackage)EPackage.Registry.INSTANCE.getEPackage(Apache_cassandraPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredApache_cassandraPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Apache_cassandraPackageImpl theApache_cassandraPackage = registeredApache_cassandraPackage instanceof Apache_cassandraPackageImpl ? (Apache_cassandraPackageImpl)registeredApache_cassandraPackage : new Apache_cassandraPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ModmacaoPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApache_cassandraPackage.createPackageContents();

		// Initialize created meta-data
		theApache_cassandraPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theApache_cassandraPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Apache_cassandraValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theApache_cassandraPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Apache_cassandraPackage.eNS_URI, theApache_cassandraPackage);
		return theApache_cassandraPackage;
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
	public EOperation getCluster__OneOrMoreNodes__DiagnosticChain_Map() {
		return clusterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCluster__OneOrMoreSeeds__DiagnosticChain_Map() {
		return clusterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeed() {
		return seedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apache_cassandraFactory getApache_cassandraFactory() {
		return (Apache_cassandraFactory)getEFactoryInstance();
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
		clusterEClass = createEClass(CLUSTER);
		createEOperation(clusterEClass, CLUSTER___ONE_OR_MORE_NODES__DIAGNOSTICCHAIN_MAP);
		createEOperation(clusterEClass, CLUSTER___ONE_OR_MORE_SEEDS__DIAGNOSTICCHAIN_MAP);

		nodeEClass = createEClass(NODE);

		seedEClass = createEClass(SEED);
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
		clusterEClass.getESuperTypes().add(theModmacaoPackage.getCluster());
		clusterEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		nodeEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		nodeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		seedEClass.getESuperTypes().add(this.getNode());
		seedEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getCluster__OneOrMoreNodes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OneOrMoreNodes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCluster__OneOrMoreSeeds__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OneOrMoreSeeds", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(seedEClass, Seed.class, "Seed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
			   "constraints", "OneOrMoreSeeds"
		   });
	}

} //Apache_cassandraPackageImpl
