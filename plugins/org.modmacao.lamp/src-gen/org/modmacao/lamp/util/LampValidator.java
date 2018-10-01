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
package org.modmacao.lamp.util;

import java.util.Map;

import modmacao.util.ModmacaoValidator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.modmacao.lamp.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.modmacao.lamp.LampPackage
 * @generated
 */
public class LampValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LampValidator INSTANCE = new LampValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.modmacao.lamp";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only One Apache Server' of 'Lamp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAMP__ONLY_ONE_APACHE_SERVER = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Or More Tomcats' of 'Lamp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAMP__ONE_OR_MORE_TOMCATS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only One My SQL' of 'Lamp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAMP__ONLY_ONE_MY_SQL = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Or More Tomcat Dependencies' of 'Apacheserver'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APACHESERVER__ONE_OR_MORE_TOMCAT_DEPENDENCIES = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only One My SQL Dependency' of 'Tomcat'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOMCAT__ONLY_ONE_MY_SQL_DEPENDENCY = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Must Be Tomcat' of 'Tomcatdependency'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOMCATDEPENDENCY__TARGET_MUST_BE_TOMCAT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Must Be My SQL' of 'Mysqldependency'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MYSQLDEPENDENCY__TARGET_MUST_BE_MY_SQL = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 7;

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
	public LampValidator() {
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
	  return LampPackage.eINSTANCE;
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
			case LampPackage.LAMP:
				return validateLamp((Lamp)value, diagnostics, context);
			case LampPackage.APACHESERVER:
				return validateApacheserver((Apacheserver)value, diagnostics, context);
			case LampPackage.TOMCAT:
				return validateTomcat((Tomcat)value, diagnostics, context);
			case LampPackage.MYSQL:
				return validateMysql((Mysql)value, diagnostics, context);
			case LampPackage.TOMCATDEPENDENCY:
				return validateTomcatdependency((Tomcatdependency)value, diagnostics, context);
			case LampPackage.MYSQLDEPENDENCY:
				return validateMysqldependency((Mysqldependency)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLamp(Lamp lamp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lamp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lamp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lamp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lamp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lamp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lamp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lamp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lamp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lamp, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateApplication_OneOrMoreComponents(lamp, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateApplication_appliesConstraint(lamp, diagnostics, context);
		if (result || diagnostics != null) result &= validateLamp_OnlyOneMySQL(lamp, diagnostics, context);
		if (result || diagnostics != null) result &= validateLamp_OnlyOneApacheServer(lamp, diagnostics, context);
		if (result || diagnostics != null) result &= validateLamp_OneOrMoreTomcats(lamp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OnlyOneApacheServer constraint of '<em>Lamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLamp_OnlyOneApacheServer(Lamp lamp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lamp.OnlyOneApacheServer(diagnostics, context);
	}

	/**
	 * Validates the OneOrMoreTomcats constraint of '<em>Lamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLamp_OneOrMoreTomcats(Lamp lamp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lamp.OneOrMoreTomcats(diagnostics, context);
	}

	/**
	 * Validates the OnlyOneMySQL constraint of '<em>Lamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLamp_OnlyOneMySQL(Lamp lamp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lamp.OnlyOneMySQL(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApacheserver(Apacheserver apacheserver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(apacheserver, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(apacheserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(apacheserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(apacheserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(apacheserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(apacheserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(apacheserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(apacheserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(apacheserver, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_OnlyOnePlacementLink(apacheserver, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_appliesConstraint(apacheserver, diagnostics, context);
		if (result || diagnostics != null) result &= validateApacheserver_OneOrMoreTomcatDependencies(apacheserver, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OneOrMoreTomcatDependencies constraint of '<em>Apacheserver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApacheserver_OneOrMoreTomcatDependencies(Apacheserver apacheserver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return apacheserver.OneOrMoreTomcatDependencies(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTomcat(Tomcat tomcat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tomcat, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tomcat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tomcat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tomcat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tomcat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tomcat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tomcat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tomcat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tomcat, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_OnlyOnePlacementLink(tomcat, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_appliesConstraint(tomcat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTomcat_OnlyOneMySQLDependency(tomcat, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OnlyOneMySQLDependency constraint of '<em>Tomcat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTomcat_OnlyOneMySQLDependency(Tomcat tomcat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tomcat.OnlyOneMySQLDependency(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMysql(Mysql mysql, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mysql, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mysql, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_OnlyOnePlacementLink(mysql, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_appliesConstraint(mysql, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTomcatdependency(Tomcatdependency tomcatdependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tomcatdependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tomcatdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tomcatdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tomcatdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tomcatdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tomcatdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tomcatdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tomcatdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tomcatdependency, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_SourceMustBeComponent(tomcatdependency, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_TargetMustBeComponent(tomcatdependency, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_appliesConstraint(tomcatdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateTomcatdependency_TargetMustBeTomcat(tomcatdependency, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TargetMustBeTomcat constraint of '<em>Tomcatdependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTomcatdependency_TargetMustBeTomcat(Tomcatdependency tomcatdependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tomcatdependency.TargetMustBeTomcat(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMysqldependency(Mysqldependency mysqldependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mysqldependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mysqldependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mysqldependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mysqldependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mysqldependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mysqldependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mysqldependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mysqldependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mysqldependency, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_SourceMustBeComponent(mysqldependency, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_TargetMustBeComponent(mysqldependency, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_appliesConstraint(mysqldependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateMysqldependency_TargetMustBeMySQL(mysqldependency, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TargetMustBeMySQL constraint of '<em>Mysqldependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMysqldependency_TargetMustBeMySQL(Mysqldependency mysqldependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mysqldependency.TargetMustBeMySQL(diagnostics, context);
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

} //LampValidator
