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
package client_server.impl;

import client_server.Client;
import client_server.Client_serverFactory;
import client_server.Client_serverPackage;
import client_server.Clientserver;
import client_server.Server;
import client_server.Serverdependency;

import client_server.util.Client_serverValidator;

import modmacao.ModmacaoPackage;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modmacao.occi.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Client_serverPackageImpl extends EPackageImpl implements Client_serverPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverdependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

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
	 * @see client_server.Client_serverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Client_serverPackageImpl() {
		super(eNS_URI, Client_serverFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Client_serverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Client_serverPackage init() {
		if (isInited) return (Client_serverPackage)EPackage.Registry.INSTANCE.getEPackage(Client_serverPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredClient_serverPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Client_serverPackageImpl theClient_serverPackage = registeredClient_serverPackage instanceof Client_serverPackageImpl ? (Client_serverPackageImpl)registeredClient_serverPackage : new Client_serverPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ModmacaoPackage.eINSTANCE.eClass();
		PlatformPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theClient_serverPackage.createPackageContents();

		// Initialize created meta-data
		theClient_serverPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theClient_serverPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Client_serverValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theClient_serverPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Client_serverPackage.eNS_URI, theClient_serverPackage);
		return theClient_serverPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClientserver() {
		return clientserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClientserver__OnlyOneServer__DiagnosticChain_Map() {
		return clientserverEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClientserver__OneOrMoreClients__DiagnosticChain_Map() {
		return clientserverEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerdependency() {
		return serverdependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServerdependency__SourceMustBeClient__DiagnosticChain_Map() {
		return serverdependencyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServerdependency__TargetMustBeServer__DiagnosticChain_Map() {
		return serverdependencyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClient__OneServerDependency__DiagnosticChain_Map() {
		return clientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_ServerPort() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client_serverFactory getClient_serverFactory() {
		return (Client_serverFactory)getEFactoryInstance();
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
		clientserverEClass = createEClass(CLIENTSERVER);
		createEOperation(clientserverEClass, CLIENTSERVER___ONLY_ONE_SERVER__DIAGNOSTICCHAIN_MAP);
		createEOperation(clientserverEClass, CLIENTSERVER___ONE_OR_MORE_CLIENTS__DIAGNOSTICCHAIN_MAP);

		serverdependencyEClass = createEClass(SERVERDEPENDENCY);
		createEOperation(serverdependencyEClass, SERVERDEPENDENCY___SOURCE_MUST_BE_CLIENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(serverdependencyEClass, SERVERDEPENDENCY___TARGET_MUST_BE_SERVER__DIAGNOSTICCHAIN_MAP);

		clientEClass = createEClass(CLIENT);
		createEOperation(clientEClass, CLIENT___ONE_SERVER_DEPENDENCY__DIAGNOSTICCHAIN_MAP);

		serverEClass = createEClass(SERVER);
		createEAttribute(serverEClass, SERVER__SERVER_PORT);
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
		clientserverEClass.getESuperTypes().add(theModmacaoPackage.getApplication());
		clientserverEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		serverdependencyEClass.getESuperTypes().add(theModmacaoPackage.getExecutiondependency());
		serverdependencyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		clientEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		clientEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		serverEClass.getESuperTypes().add(theModmacaoPackage.getComponent());
		serverEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(clientserverEClass, Clientserver.class, "Clientserver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getClientserver__OnlyOneServer__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OnlyOneServer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClientserver__OneOrMoreClients__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OneOrMoreClients", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serverdependencyEClass, Serverdependency.class, "Serverdependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getServerdependency__SourceMustBeClient__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SourceMustBeClient", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getServerdependency__TargetMustBeServer__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "TargetMustBeServer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getClient__OneServerDependency__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OneServerDependency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServer_ServerPort(), theModmacaoPackage.getPort(), "serverPort", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (clientserverEClass,
		   source,
		   new String[] {
			   "constraints", "OneOrMoreClients"
		   });
		addAnnotation
		  (serverdependencyEClass,
		   source,
		   new String[] {
			   "constraints", "TargetMustBeServer"
		   });
		addAnnotation
		  (clientEClass,
		   source,
		   new String[] {
			   "constraints", "OneServerDependency"
		   });
	}

} //Client_serverPackageImpl
