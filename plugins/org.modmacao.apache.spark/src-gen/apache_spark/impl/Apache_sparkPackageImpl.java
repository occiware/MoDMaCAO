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
package apache_spark.impl;

import apache_spark.Apache_sparkFactory;
import apache_spark.Apache_sparkPackage;
import apache_spark.Apachesparkcluster;
import apache_spark.Apachesparkcomponent;
import apache_spark.Master;
import apache_spark.Masterdependency;
import apache_spark.Worker;

import apache_spark.util.Apache_sparkValidator;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Apache_sparkPackageImpl extends EPackageImpl implements Apache_sparkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apachesparkcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apachesparkclusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterdependencyEClass = null;

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
	 * @see apache_spark.Apache_sparkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Apache_sparkPackageImpl() {
		super(eNS_URI, Apache_sparkFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Apache_sparkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Apache_sparkPackage init() {
		if (isInited) return (Apache_sparkPackage)EPackage.Registry.INSTANCE.getEPackage(Apache_sparkPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredApache_sparkPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Apache_sparkPackageImpl theApache_sparkPackage = registeredApache_sparkPackage instanceof Apache_sparkPackageImpl ? (Apache_sparkPackageImpl)registeredApache_sparkPackage : new Apache_sparkPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		ModmacaoPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApache_sparkPackage.createPackageContents();

		// Initialize created meta-data
		theApache_sparkPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theApache_sparkPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Apache_sparkValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theApache_sparkPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Apache_sparkPackage.eNS_URI, theApache_sparkPackage);
		return theApache_sparkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaster() {
		return masterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorker() {
		return workerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorker_ApacheSparkWorkerCores() {
		return (EAttribute)workerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorker_ApacheSparkWorkerMemory() {
		return (EAttribute)workerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorker__WorkerMemorySmallerThanComputeMemory__DiagnosticChain_Map() {
		return workerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorker__WorkerCoresSmallerThanComputeCores__DiagnosticChain_Map() {
		return workerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorker__OnlyOneMasterDependency__DiagnosticChain_Map() {
		return workerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApachesparkcomponent() {
		return apachesparkcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApachesparkcomponent_ApacheSparkPort() {
		return (EAttribute)apachesparkcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApachesparkcomponent_ApacheSparkWebuiPort() {
		return (EAttribute)apachesparkcomponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApachesparkcluster() {
		return apachesparkclusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApachesparkcluster__OnlyOneMaster__DiagnosticChain_Map() {
		return apachesparkclusterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApachesparkcluster__OneOrMoreWorkers__DiagnosticChain_Map() {
		return apachesparkclusterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterdependency() {
		return masterdependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMasterdependency__TargetMustBeMaster__DiagnosticChain_Map() {
		return masterdependencyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMasterdependency__SourceMustBeWorker__DiagnosticChain_Map() {
		return masterdependencyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apache_sparkFactory getApache_sparkFactory() {
		return (Apache_sparkFactory)getEFactoryInstance();
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
		masterEClass = createEClass(MASTER);

		workerEClass = createEClass(WORKER);
		createEAttribute(workerEClass, WORKER__APACHE_SPARK_WORKER_CORES);
		createEAttribute(workerEClass, WORKER__APACHE_SPARK_WORKER_MEMORY);
		createEOperation(workerEClass, WORKER___WORKER_MEMORY_SMALLER_THAN_COMPUTE_MEMORY__DIAGNOSTICCHAIN_MAP);
		createEOperation(workerEClass, WORKER___WORKER_CORES_SMALLER_THAN_COMPUTE_CORES__DIAGNOSTICCHAIN_MAP);
		createEOperation(workerEClass, WORKER___ONLY_ONE_MASTER_DEPENDENCY__DIAGNOSTICCHAIN_MAP);

		apachesparkcomponentEClass = createEClass(APACHESPARKCOMPONENT);
		createEAttribute(apachesparkcomponentEClass, APACHESPARKCOMPONENT__APACHE_SPARK_PORT);
		createEAttribute(apachesparkcomponentEClass, APACHESPARKCOMPONENT__APACHE_SPARK_WEBUI_PORT);

		apachesparkclusterEClass = createEClass(APACHESPARKCLUSTER);
		createEOperation(apachesparkclusterEClass, APACHESPARKCLUSTER___ONLY_ONE_MASTER__DIAGNOSTICCHAIN_MAP);
		createEOperation(apachesparkclusterEClass, APACHESPARKCLUSTER___ONE_OR_MORE_WORKERS__DIAGNOSTICCHAIN_MAP);

		masterdependencyEClass = createEClass(MASTERDEPENDENCY);
		createEOperation(masterdependencyEClass, MASTERDEPENDENCY___TARGET_MUST_BE_MASTER__DIAGNOSTICCHAIN_MAP);
		createEOperation(masterdependencyEClass, MASTERDEPENDENCY___SOURCE_MUST_BE_WORKER__DIAGNOSTICCHAIN_MAP);
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
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		ModmacaoPackage theModmacaoPackage = (ModmacaoPackage)EPackage.Registry.INSTANCE.getEPackage(ModmacaoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		masterEClass.getESuperTypes().add(this.getApachesparkcomponent());
		masterEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		workerEClass.getESuperTypes().add(this.getApachesparkcomponent());
		workerEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		apachesparkcomponentEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		apachesparkcomponentEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		apachesparkclusterEClass.getESuperTypes().add(theModmacaoPackage.getCluster());
		apachesparkclusterEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		masterdependencyEClass.getESuperTypes().add(theModmacaoPackage.getExecutiondependency());
		masterdependencyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(masterEClass, Master.class, "Master", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workerEClass, Worker.class, "Worker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorker_ApacheSparkWorkerCores(), theInfrastructurePackage.getCore(), "apacheSparkWorkerCores", null, 0, 1, Worker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorker_ApacheSparkWorkerMemory(), theInfrastructurePackage.getGiB(), "apacheSparkWorkerMemory", null, 0, 1, Worker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getWorker__WorkerMemorySmallerThanComputeMemory__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "WorkerMemorySmallerThanComputeMemory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWorker__WorkerCoresSmallerThanComputeCores__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "WorkerCoresSmallerThanComputeCores", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWorker__OnlyOneMasterDependency__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OnlyOneMasterDependency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(apachesparkcomponentEClass, Apachesparkcomponent.class, "Apachesparkcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApachesparkcomponent_ApacheSparkPort(), theModmacaoPackage.getPort(), "apacheSparkPort", null, 0, 1, Apachesparkcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApachesparkcomponent_ApacheSparkWebuiPort(), theModmacaoPackage.getPort(), "apacheSparkWebuiPort", null, 0, 1, Apachesparkcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apachesparkclusterEClass, Apachesparkcluster.class, "Apachesparkcluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getApachesparkcluster__OnlyOneMaster__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OnlyOneMaster", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApachesparkcluster__OneOrMoreWorkers__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OneOrMoreWorkers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(masterdependencyEClass, Masterdependency.class, "Masterdependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getMasterdependency__TargetMustBeMaster__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "TargetMustBeMaster", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMasterdependency__SourceMustBeWorker__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SourceMustBeWorker", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		  (workerEClass,
		   source,
		   new String[] {
			   "constraints", "OnlyOneMasterDependency"
		   });
		addAnnotation
		  (apachesparkclusterEClass,
		   source,
		   new String[] {
			   "constraints", "OneOrMoreWorkers"
		   });
		addAnnotation
		  (masterdependencyEClass,
		   source,
		   new String[] {
			   "constraints", "SourceMustBeWorker"
		   });
	}

} //Apache_sparkPackageImpl
