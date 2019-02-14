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
package openstackruntime.util;

import java.util.Map;

import openstackruntime.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see openstackruntime.OpenstackruntimePackage
 * @generated
 */
public class OpenstackruntimeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OpenstackruntimeValidator INSTANCE = new OpenstackruntimeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "openstackruntime";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Runtimeid'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RUNTIMEID__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Floatingip'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FLOATINGIP__APPLIES_CONSTRAINT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenstackruntimeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OpenstackruntimePackage.eINSTANCE;
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
			case OpenstackruntimePackage.RUNTIMEID:
				return validateRuntimeid((Runtimeid)value, diagnostics, context);
			case OpenstackruntimePackage.FLOATINGIP:
				return validateFloatingip((Floatingip)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeid(Runtimeid runtimeid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(runtimeid, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(runtimeid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(runtimeid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(runtimeid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(runtimeid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(runtimeid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(runtimeid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(runtimeid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(runtimeid, diagnostics, context);
		if (result || diagnostics != null) result &= validateRuntimeid_appliesConstraint(runtimeid, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Runtimeid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeid_appliesConstraint(Runtimeid runtimeid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return runtimeid.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatingip(Floatingip floatingip, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(floatingip, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(floatingip, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(floatingip, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(floatingip, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(floatingip, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(floatingip, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(floatingip, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(floatingip, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(floatingip, diagnostics, context);
		if (result || diagnostics != null) result &= validateFloatingip_appliesConstraint(floatingip, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Floatingip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatingip_appliesConstraint(Floatingip floatingip, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return floatingip.appliesConstraint(diagnostics, context);
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

} //OpenstackruntimeValidator
