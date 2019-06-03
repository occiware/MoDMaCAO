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
package org.modmacao.mongodb.util;

import java.util.Map;

import modmacao.util.ModmacaoValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.modmacao.mongodb.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.modmacao.mongodb.MongodbPackage
 * @generated
 */
public class MongodbValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MongodbValidator INSTANCE = new MongodbValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.modmacao.mongodb";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Or More Config Servers' of 'Cluster'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLUSTER__ONE_OR_MORE_CONFIG_SERVERS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Or More Routers' of 'Cluster'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLUSTER__ONE_OR_MORE_ROUTERS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Or More Shards' of 'Cluster'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLUSTER__ONE_OR_MORE_SHARDS = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

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
	public MongodbValidator() {
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
	  return MongodbPackage.eINSTANCE;
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
			case MongodbPackage.MONGODBCOMPONENT:
				return validateMongodbcomponent((Mongodbcomponent)value, diagnostics, context);
			case MongodbPackage.CONFIGSERVER:
				return validateConfigserver((Configserver)value, diagnostics, context);
			case MongodbPackage.ROUTER:
				return validateRouter((Router)value, diagnostics, context);
			case MongodbPackage.SHARD:
				return validateShard((Shard)value, diagnostics, context);
			case MongodbPackage.CLUSTER:
				return validateCluster((Cluster)value, diagnostics, context);
			case MongodbPackage.CONFIGSERVERDEPENDENCY:
				return validateConfigserverdependency((Configserverdependency)value, diagnostics, context);
			case MongodbPackage.REPLICABLEMONGODBCOMPONENT:
				return validateReplicablemongodbcomponent((Replicablemongodbcomponent)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMongodbcomponent(Mongodbcomponent mongodbcomponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mongodbcomponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_OnlyOnePlacementLink(mongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_appliesConstraint(mongodbcomponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigserver(Configserver configserver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(configserver, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(configserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(configserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(configserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(configserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(configserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(configserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(configserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(configserver, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_OnlyOnePlacementLink(configserver, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_appliesConstraint(configserver, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRouter(Router router, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(router, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(router, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(router, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(router, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(router, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(router, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(router, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(router, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(router, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_OnlyOnePlacementLink(router, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_appliesConstraint(router, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShard(Shard shard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(shard, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(shard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(shard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(shard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(shard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(shard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(shard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(shard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(shard, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_OnlyOnePlacementLink(shard, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_appliesConstraint(shard, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cluster, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateApplication_OneOrMoreComponents(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateApplication_appliesConstraint(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateCluster_OneOrMoreShards(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateCluster_OneOrMoreConfigServers(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateCluster_OneOrMoreRouters(cluster, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OneOrMoreShards constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster_OneOrMoreShards(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cluster.OneOrMoreShards(diagnostics, context);
	}

	/**
	 * Validates the OneOrMoreConfigServers constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster_OneOrMoreConfigServers(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cluster.OneOrMoreConfigServers(diagnostics, context);
	}

	/**
	 * Validates the OneOrMoreRouters constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster_OneOrMoreRouters(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cluster.OneOrMoreRouters(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigserverdependency(Configserverdependency configserverdependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(configserverdependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(configserverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(configserverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(configserverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(configserverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(configserverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(configserverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(configserverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(configserverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_SourceMustBeComponent(configserverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_TargetMustBeComponent(configserverdependency, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_appliesConstraint(configserverdependency, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplicablemongodbcomponent(Replicablemongodbcomponent replicablemongodbcomponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(replicablemongodbcomponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(replicablemongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(replicablemongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(replicablemongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(replicablemongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(replicablemongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(replicablemongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(replicablemongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(replicablemongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_OnlyOnePlacementLink(replicablemongodbcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateComponent_appliesConstraint(replicablemongodbcomponent, diagnostics, context);
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

} //MongodbValidator
