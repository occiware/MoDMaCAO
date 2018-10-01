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
package apache_spark.util;

import apache_spark.*;

import java.util.Map;

import modmacao.util.ModmacaoValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see apache_spark.Apache_sparkPackage
 * @generated
 */
public class Apache_sparkValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Apache_sparkValidator INSTANCE = new Apache_sparkValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "apache_spark";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Worker Memory Smaller Than Compute Memory' of 'Worker'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WORKER__WORKER_MEMORY_SMALLER_THAN_COMPUTE_MEMORY = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Worker Cores Smaller Than Compute Cores' of 'Worker'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WORKER__WORKER_CORES_SMALLER_THAN_COMPUTE_CORES = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only One Master Dependency' of 'Worker'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WORKER__ONLY_ONE_MASTER_DEPENDENCY = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only One Master' of 'Apachesparkcluster'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APACHESPARKCLUSTER__ONLY_ONE_MASTER = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Or More Workers' of 'Apachesparkcluster'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APACHESPARKCLUSTER__ONE_OR_MORE_WORKERS = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Must Be Master' of 'Masterdependency'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MASTERDEPENDENCY__TARGET_MUST_BE_MASTER = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Must Be Worker' of 'Masterdependency'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MASTERDEPENDENCY__SOURCE_MUST_BE_WORKER = 7;

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
	public Apache_sparkValidator() {
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
	  return Apache_sparkPackage.eINSTANCE;
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
			case Apache_sparkPackage.MASTER:
				return validateMaster((Master)value, diagnostics, context);
			case Apache_sparkPackage.WORKER:
				return validateWorker((Worker)value, diagnostics, context);
			case Apache_sparkPackage.APACHESPARKCOMPONENT:
				return validateApachesparkcomponent((Apachesparkcomponent)value, diagnostics, context);
			case Apache_sparkPackage.APACHESPARKCLUSTER:
				return validateApachesparkcluster((Apachesparkcluster)value, diagnostics, context);
			case Apache_sparkPackage.MASTERDEPENDENCY:
				return validateMasterdependency((Masterdependency)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaster(Master master, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(master, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(master, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_OnlyOnePlacementLink(master, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_appliesConstraint(master, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorker(Worker worker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(worker, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(worker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(worker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(worker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(worker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(worker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(worker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(worker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(worker, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_OnlyOnePlacementLink(worker, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_appliesConstraint(worker, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorker_OnlyOneMasterDependency(worker, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorker_WorkerMemorySmallerThanComputeMemory(worker, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorker_WorkerCoresSmallerThanComputeCores(worker, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OnlyOneMasterDependency constraint of '<em>Worker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorker_OnlyOneMasterDependency(Worker worker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return worker.OnlyOneMasterDependency(diagnostics, context);
	}

	/**
	 * Validates the WorkerMemorySmallerThanComputeMemory constraint of '<em>Worker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorker_WorkerMemorySmallerThanComputeMemory(Worker worker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return worker.WorkerMemorySmallerThanComputeMemory(diagnostics, context);
	}

	/**
	 * Validates the WorkerCoresSmallerThanComputeCores constraint of '<em>Worker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorker_WorkerCoresSmallerThanComputeCores(Worker worker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return worker.WorkerCoresSmallerThanComputeCores(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApachesparkcomponent(Apachesparkcomponent apachesparkcomponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(apachesparkcomponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(apachesparkcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(apachesparkcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(apachesparkcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(apachesparkcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(apachesparkcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(apachesparkcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(apachesparkcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(apachesparkcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_OnlyOnePlacementLink(apachesparkcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_appliesConstraint(apachesparkcomponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApachesparkcluster(Apachesparkcluster apachesparkcluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(apachesparkcluster, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(apachesparkcluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(apachesparkcluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(apachesparkcluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(apachesparkcluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(apachesparkcluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(apachesparkcluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(apachesparkcluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(apachesparkcluster, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateApplication_OneOrMoreComponents(apachesparkcluster, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateApplication_appliesConstraint(apachesparkcluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateApachesparkcluster_OneOrMoreWorkers(apachesparkcluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateApachesparkcluster_OnlyOneMaster(apachesparkcluster, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OneOrMoreWorkers constraint of '<em>Apachesparkcluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApachesparkcluster_OneOrMoreWorkers(Apachesparkcluster apachesparkcluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return apachesparkcluster.OneOrMoreWorkers(diagnostics, context);
	}

	/**
	 * Validates the OnlyOneMaster constraint of '<em>Apachesparkcluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApachesparkcluster_OnlyOneMaster(Apachesparkcluster apachesparkcluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return apachesparkcluster.OnlyOneMaster(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterdependency(Masterdependency masterdependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(masterdependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(masterdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(masterdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(masterdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(masterdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(masterdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(masterdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(masterdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(masterdependency, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_SourceMustBeComponent(masterdependency, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_TargetMustBeComponent(masterdependency, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_appliesConstraint(masterdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateMasterdependency_SourceMustBeWorker(masterdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateMasterdependency_TargetMustBeMaster(masterdependency, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SourceMustBeWorker constraint of '<em>Masterdependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterdependency_SourceMustBeWorker(Masterdependency masterdependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return masterdependency.SourceMustBeWorker(diagnostics, context);
	}

	/**
	 * Validates the TargetMustBeMaster constraint of '<em>Masterdependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterdependency_TargetMustBeMaster(Masterdependency masterdependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return masterdependency.TargetMustBeMaster(diagnostics, context);
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

} //Apache_sparkValidator
