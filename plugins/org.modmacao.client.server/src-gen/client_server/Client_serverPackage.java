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
package client_server;

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
 * @see client_server.Client_serverFactory
 * @model kind="package"
 * @generated
 */
public interface Client_serverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "client_server";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.modmacao.org/client_server/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "client_server";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Client_serverPackage eINSTANCE = client_server.impl.Client_serverPackageImpl.init();

	/**
	 * The meta object id for the '{@link client_server.impl.ClientserverImpl <em>Clientserver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_server.impl.ClientserverImpl
	 * @see client_server.impl.Client_serverPackageImpl#getClientserver()
	 * @generated
	 */
	int CLIENTSERVER = 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTSERVER__MIXIN = ModmacaoPackage.APPLICATION__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTSERVER__ENTITY = ModmacaoPackage.APPLICATION__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTSERVER__ATTRIBUTES = ModmacaoPackage.APPLICATION__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Clientserver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTSERVER_FEATURE_COUNT = ModmacaoPackage.APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Only One Server</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTSERVER___ONLY_ONE_SERVER__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>One Or More Clients</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTSERVER___ONE_OR_MORE_CLIENTS__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.APPLICATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clientserver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTSERVER_OPERATION_COUNT = ModmacaoPackage.APPLICATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link client_server.impl.ServerdependencyImpl <em>Serverdependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_server.impl.ServerdependencyImpl
	 * @see client_server.impl.Client_serverPackageImpl#getServerdependency()
	 * @generated
	 */
	int SERVERDEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERDEPENDENCY__MIXIN = ModmacaoPackage.EXECUTIONDEPENDENCY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERDEPENDENCY__ENTITY = ModmacaoPackage.EXECUTIONDEPENDENCY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERDEPENDENCY__ATTRIBUTES = ModmacaoPackage.EXECUTIONDEPENDENCY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Serverdependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERDEPENDENCY_FEATURE_COUNT = ModmacaoPackage.EXECUTIONDEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Source Must Be Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERDEPENDENCY___SOURCE_MUST_BE_CLIENT__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.EXECUTIONDEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Target Must Be Server</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERDEPENDENCY___TARGET_MUST_BE_SERVER__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.EXECUTIONDEPENDENCY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Serverdependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERDEPENDENCY_OPERATION_COUNT = ModmacaoPackage.EXECUTIONDEPENDENCY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link client_server.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_server.impl.ClientImpl
	 * @see client_server.impl.Client_serverPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>One Server Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT___ONE_SERVER_DEPENDENCY__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link client_server.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_server.impl.ServerImpl
	 * @see client_server.impl.Client_serverPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Server Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_PORT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link client_server.Clientserver <em>Clientserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clientserver</em>'.
	 * @see client_server.Clientserver
	 * @generated
	 */
	EClass getClientserver();

	/**
	 * Returns the meta object for the '{@link client_server.Clientserver#OnlyOneServer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only One Server</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Only One Server</em>' operation.
	 * @see client_server.Clientserver#OnlyOneServer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClientserver__OnlyOneServer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link client_server.Clientserver#OneOrMoreClients(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>One Or More Clients</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>One Or More Clients</em>' operation.
	 * @see client_server.Clientserver#OneOrMoreClients(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClientserver__OneOrMoreClients__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link client_server.Serverdependency <em>Serverdependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serverdependency</em>'.
	 * @see client_server.Serverdependency
	 * @generated
	 */
	EClass getServerdependency();

	/**
	 * Returns the meta object for the '{@link client_server.Serverdependency#SourceMustBeClient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Client</em>' operation.
	 * @see client_server.Serverdependency#SourceMustBeClient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getServerdependency__SourceMustBeClient__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link client_server.Serverdependency#TargetMustBeServer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Must Be Server</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Must Be Server</em>' operation.
	 * @see client_server.Serverdependency#TargetMustBeServer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getServerdependency__TargetMustBeServer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link client_server.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see client_server.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the '{@link client_server.Client#OneServerDependency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>One Server Dependency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>One Server Dependency</em>' operation.
	 * @see client_server.Client#OneServerDependency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClient__OneServerDependency__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link client_server.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see client_server.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link client_server.Server#getServerPort <em>Server Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Port</em>'.
	 * @see client_server.Server#getServerPort()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_ServerPort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Client_serverFactory getClient_serverFactory();

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
		 * The meta object literal for the '{@link client_server.impl.ClientserverImpl <em>Clientserver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_server.impl.ClientserverImpl
		 * @see client_server.impl.Client_serverPackageImpl#getClientserver()
		 * @generated
		 */
		EClass CLIENTSERVER = eINSTANCE.getClientserver();

		/**
		 * The meta object literal for the '<em><b>Only One Server</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENTSERVER___ONLY_ONE_SERVER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getClientserver__OnlyOneServer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>One Or More Clients</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENTSERVER___ONE_OR_MORE_CLIENTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getClientserver__OneOrMoreClients__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link client_server.impl.ServerdependencyImpl <em>Serverdependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_server.impl.ServerdependencyImpl
		 * @see client_server.impl.Client_serverPackageImpl#getServerdependency()
		 * @generated
		 */
		EClass SERVERDEPENDENCY = eINSTANCE.getServerdependency();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVERDEPENDENCY___SOURCE_MUST_BE_CLIENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getServerdependency__SourceMustBeClient__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Target Must Be Server</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVERDEPENDENCY___TARGET_MUST_BE_SERVER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getServerdependency__TargetMustBeServer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link client_server.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_server.impl.ClientImpl
		 * @see client_server.impl.Client_serverPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>One Server Dependency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENT___ONE_SERVER_DEPENDENCY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getClient__OneServerDependency__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link client_server.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_server.impl.ServerImpl
		 * @see client_server.impl.Client_serverPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Server Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__SERVER_PORT = eINSTANCE.getServer_ServerPort();

	}

} //Client_serverPackage
