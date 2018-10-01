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
package org.modmacao.lamp.impl;

import modmacao.ModmacaoPackage;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modmacao.lamp.Apacheserver;
import org.modmacao.lamp.Lamp;
import org.modmacao.lamp.LampFactory;
import org.modmacao.lamp.LampPackage;
import org.modmacao.lamp.Mysql;
import org.modmacao.lamp.Mysqldependency;
import org.modmacao.lamp.Tomcat;
import org.modmacao.lamp.Tomcatdependency;

import org.modmacao.lamp.util.LampValidator;

import org.modmacao.occi.platform.PlatformPackage;

import org.modmacao.placement.PlacementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LampPackageImpl extends EPackageImpl implements LampPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apacheserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tomcatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mysqlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tomcatdependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mysqldependencyEClass = null;

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
	 * @see org.modmacao.lamp.LampPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LampPackageImpl() {
		super(eNS_URI, LampFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LampPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LampPackage init() {
		if (isInited) return (LampPackage)EPackage.Registry.INSTANCE.getEPackage(LampPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLampPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LampPackageImpl theLampPackage = registeredLampPackage instanceof LampPackageImpl ? (LampPackageImpl)registeredLampPackage : new LampPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ModmacaoPackage.eINSTANCE.eClass();
		PlatformPackage.eINSTANCE.eClass();
		PlacementPackage.eINSTANCE.eClass();
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLampPackage.createPackageContents();

		// Initialize created meta-data
		theLampPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLampPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return LampValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLampPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LampPackage.eNS_URI, theLampPackage);
		return theLampPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLamp() {
		return lampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLamp__OnlyOneApacheServer__DiagnosticChain_Map() {
		return lampEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLamp__OneOrMoreTomcats__DiagnosticChain_Map() {
		return lampEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLamp__OnlyOneMySQL__DiagnosticChain_Map() {
		return lampEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApacheserver() {
		return apacheserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApacheserver__OneOrMoreTomcatDependencies__DiagnosticChain_Map() {
		return apacheserverEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTomcat() {
		return tomcatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTomcat__OnlyOneMySQLDependency__DiagnosticChain_Map() {
		return tomcatEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMysql() {
		return mysqlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTomcatdependency() {
		return tomcatdependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTomcatdependency__TargetMustBeTomcat__DiagnosticChain_Map() {
		return tomcatdependencyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMysqldependency() {
		return mysqldependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMysqldependency__TargetMustBeMySQL__DiagnosticChain_Map() {
		return mysqldependencyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LampFactory getLampFactory() {
		return (LampFactory)getEFactoryInstance();
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
		lampEClass = createEClass(LAMP);
		createEOperation(lampEClass, LAMP___ONLY_ONE_APACHE_SERVER__DIAGNOSTICCHAIN_MAP);
		createEOperation(lampEClass, LAMP___ONE_OR_MORE_TOMCATS__DIAGNOSTICCHAIN_MAP);
		createEOperation(lampEClass, LAMP___ONLY_ONE_MY_SQL__DIAGNOSTICCHAIN_MAP);

		apacheserverEClass = createEClass(APACHESERVER);
		createEOperation(apacheserverEClass, APACHESERVER___ONE_OR_MORE_TOMCAT_DEPENDENCIES__DIAGNOSTICCHAIN_MAP);

		tomcatEClass = createEClass(TOMCAT);
		createEOperation(tomcatEClass, TOMCAT___ONLY_ONE_MY_SQL_DEPENDENCY__DIAGNOSTICCHAIN_MAP);

		mysqlEClass = createEClass(MYSQL);

		tomcatdependencyEClass = createEClass(TOMCATDEPENDENCY);
		createEOperation(tomcatdependencyEClass, TOMCATDEPENDENCY___TARGET_MUST_BE_TOMCAT__DIAGNOSTICCHAIN_MAP);

		mysqldependencyEClass = createEClass(MYSQLDEPENDENCY);
		createEOperation(mysqldependencyEClass, MYSQLDEPENDENCY___TARGET_MUST_BE_MY_SQL__DIAGNOSTICCHAIN_MAP);
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
		lampEClass.getESuperTypes().add(theModmacaoPackage.getApplication());
		lampEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		apacheserverEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		apacheserverEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tomcatEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		tomcatEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		mysqlEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		mysqlEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tomcatdependencyEClass.getESuperTypes().add(theModmacaoPackage.getExecutiondependency());
		tomcatdependencyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		mysqldependencyEClass.getESuperTypes().add(theModmacaoPackage.getExecutiondependency());
		mysqldependencyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(lampEClass, Lamp.class, "Lamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getLamp__OnlyOneApacheServer__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OnlyOneApacheServer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLamp__OneOrMoreTomcats__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OneOrMoreTomcats", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLamp__OnlyOneMySQL__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OnlyOneMySQL", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(apacheserverEClass, Apacheserver.class, "Apacheserver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getApacheserver__OneOrMoreTomcatDependencies__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OneOrMoreTomcatDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tomcatEClass, Tomcat.class, "Tomcat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTomcat__OnlyOneMySQLDependency__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OnlyOneMySQLDependency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mysqlEClass, Mysql.class, "Mysql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tomcatdependencyEClass, Tomcatdependency.class, "Tomcatdependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTomcatdependency__TargetMustBeTomcat__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "TargetMustBeTomcat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mysqldependencyEClass, Mysqldependency.class, "Mysqldependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getMysqldependency__TargetMustBeMySQL__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "TargetMustBeMySQL", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		  (lampEClass,
		   source,
		   new String[] {
			   "constraints", "OnlyOneMySQL"
		   });
		addAnnotation
		  (apacheserverEClass,
		   source,
		   new String[] {
			   "constraints", "OneOrMoreTomcatDependencies"
		   });
		addAnnotation
		  (tomcatEClass,
		   source,
		   new String[] {
			   "constraints", "OnlyOneMySQLDependency"
		   });
		addAnnotation
		  (tomcatdependencyEClass,
		   source,
		   new String[] {
			   "constraints", "TargetMustBeTomcat"
		   });
		addAnnotation
		  (mysqldependencyEClass,
		   source,
		   new String[] {
			   "constraints", "TargetMustBeMySQL"
		   });
	}

} //LampPackageImpl
