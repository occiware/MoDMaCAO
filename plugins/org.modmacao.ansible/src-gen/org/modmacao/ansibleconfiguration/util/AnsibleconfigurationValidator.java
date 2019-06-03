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
package org.modmacao.ansibleconfiguration.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.modmacao.ansibleconfiguration.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.modmacao.ansibleconfiguration.AnsibleconfigurationPackage
 * @generated
 */
public class AnsibleconfigurationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AnsibleconfigurationValidator INSTANCE = new AnsibleconfigurationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.modmacao.ansibleconfiguration";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

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
	public AnsibleconfigurationValidator() {
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
	  return AnsibleconfigurationPackage.eINSTANCE;
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
			case AnsibleconfigurationPackage.ANSIBLEENDPOINT:
				return validateAnsibleendpoint((Ansibleendpoint)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnsibleendpoint(Ansibleendpoint ansibleendpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ansibleendpoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ansibleendpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ansibleendpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ansibleendpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ansibleendpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ansibleendpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ansibleendpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ansibleendpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ansibleendpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnsibleendpoint_appliesConstraint(ansibleendpoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Ansibleendpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ANSIBLEENDPOINT__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(infrastructure::Networkinterface)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Ansibleendpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnsibleendpoint_appliesConstraint(Ansibleendpoint ansibleendpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnsibleconfigurationPackage.Literals.ANSIBLEENDPOINT,
				 ansibleendpoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 ANSIBLEENDPOINT__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //AnsibleconfigurationValidator
