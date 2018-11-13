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
package client_server.util;

import client_server.*;

import java.util.Map;

import modmacao.util.ModmacaoValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see client_server.Client_serverPackage
 * @generated
 */
public class Client_serverValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Client_serverValidator INSTANCE = new Client_serverValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "client_server";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only One Server' of 'Clientserver'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENTSERVER__ONLY_ONE_SERVER = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Or More Clients' of 'Clientserver'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENTSERVER__ONE_OR_MORE_CLIENTS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Must Be Client' of 'Serverdependency'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVERDEPENDENCY__SOURCE_MUST_BE_CLIENT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Must Be Server' of 'Serverdependency'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVERDEPENDENCY__TARGET_MUST_BE_SERVER = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Server Dependency' of 'Client'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT__ONE_SERVER_DEPENDENCY = 5;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 5;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModmacaoValidator modmacaoValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client_serverValidator() {
		super();
		modmacaoValidator = ModmacaoValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Client_serverPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Client_serverPackage.CLIENTSERVER:
				return validateClientserver((Clientserver)value, diagnostics, context);
			case Client_serverPackage.SERVERDEPENDENCY:
				return validateServerdependency((Serverdependency)value, diagnostics, context);
			case Client_serverPackage.CLIENT:
				return validateClient((Client)value, diagnostics, context);
			case Client_serverPackage.SERVER:
				return validateServer((Server)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientserver(Clientserver clientserver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clientserver, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clientserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clientserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clientserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clientserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clientserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clientserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clientserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clientserver, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateApplication_OneOrMoreComponents(clientserver, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateApplication_appliesConstraint(clientserver, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientserver_OneOrMoreClients(clientserver, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientserver_OnlyOneServer(clientserver, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OneOrMoreClients constraint of '<em>Clientserver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientserver_OneOrMoreClients(Clientserver clientserver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientserver.OneOrMoreClients(diagnostics, context);
	}

	/**
	 * Validates the OnlyOneServer constraint of '<em>Clientserver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientserver_OnlyOneServer(Clientserver clientserver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientserver.OnlyOneServer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerdependency(Serverdependency serverdependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serverdependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_SourceMustBeComponent(serverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_TargetMustBeComponent(serverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_appliesConstraint(serverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateServerdependency_TargetMustBeServer(serverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateServerdependency_SourceMustBeClient(serverdependency, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TargetMustBeServer constraint of '<em>Serverdependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerdependency_TargetMustBeServer(Serverdependency serverdependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serverdependency.TargetMustBeServer(diagnostics, context);
	}

	/**
	 * Validates the SourceMustBeClient constraint of '<em>Serverdependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerdependency_SourceMustBeClient(Serverdependency serverdependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serverdependency.SourceMustBeClient(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClient(Client client, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(client, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(client, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(client, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(client, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(client, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(client, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(client, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(client, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(client, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_OnlyOnePlacementLink(client, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_appliesConstraint(client, diagnostics, context);
		if (result || diagnostics != null) result &= validateClient_OneServerDependency(client, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OneServerDependency constraint of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClient_OneServerDependency(Client client, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return client.OneServerDependency(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer(Server server, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(server, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(server, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_OnlyOnePlacementLink(server, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_appliesConstraint(server, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Client_serverValidator
