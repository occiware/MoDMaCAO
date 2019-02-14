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
package openstackruntime.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import openstackruntime.OpenstackruntimePackage;
import openstackruntime.OpenstackruntimeTables;
import openstackruntime.Runtimeid;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtimeid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openstackruntime.impl.RuntimeidImpl#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeidImpl extends MixinBaseImpl implements Runtimeid {
	/**
	 * The default value of the '{@link #getOpenstackRuntimeId() <em>Openstack Runtime Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackRuntimeId()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENSTACK_RUNTIME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenstackRuntimeId() <em>Openstack Runtime Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackRuntimeId()
	 * @generated
	 * @ordered
	 */
	protected String openstackRuntimeId = OPENSTACK_RUNTIME_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenstackruntimePackage.Literals.RUNTIMEID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpenstackRuntimeId() {
		return openstackRuntimeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenstackRuntimeId(String newOpenstackRuntimeId) {
		String oldOpenstackRuntimeId = openstackRuntimeId;
		openstackRuntimeId = newOpenstackRuntimeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenstackruntimePackage.RUNTIMEID__OPENSTACK_RUNTIME_ID, oldOpenstackRuntimeId, openstackRuntimeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let severity : Integer[1] = 'Runtimeid::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[?] = self.entity.oclIsKindOf(infrastructure::Network) or
		 *         self.entity.oclIsKindOf(infrastructure::Compute) or
		 *         self.entity.oclIsKindOf(infrastructure::Storage) or
		 *         self.entity.oclIsKindOf(infrastructure::Storagelink) or
		 *         self.entity.oclIsKindOf(infrastructure::Networkinterface)
		 *       in
		 *         'Runtimeid::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OpenstackruntimeTables.STR_Runtimeid_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OpenstackruntimeTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Network = idResolver.getClass(OpenstackruntimeTables.CLSSid_Network, null);
			final /*@NonInvalid*/ Entity entity_3 = this.getEntity();
			final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_3, TYP_infrastructure_c_c_Network).booleanValue();
			/*@NonInvalid*/ boolean or;
			if (oclIsKindOf) {
				or = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Compute = idResolver.getClass(OpenstackruntimeTables.CLSSid_Compute, null);
				final /*@NonInvalid*/ boolean oclIsKindOf_0 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_3, TYP_infrastructure_c_c_Compute).booleanValue();
				or = oclIsKindOf_0;
			}
			/*@NonInvalid*/ boolean or_0;
			if (or) {
				or_0 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Storage = idResolver.getClass(OpenstackruntimeTables.CLSSid_Storage, null);
				final /*@NonInvalid*/ boolean oclIsKindOf_1 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_3, TYP_infrastructure_c_c_Storage).booleanValue();
				or_0 = oclIsKindOf_1;
			}
			/*@NonInvalid*/ boolean or_1;
			if (or_0) {
				or_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Storagelink = idResolver.getClass(OpenstackruntimeTables.CLSSid_Storagelink, null);
				final /*@NonInvalid*/ boolean oclIsKindOf_2 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_3, TYP_infrastructure_c_c_Storagelink).booleanValue();
				or_1 = oclIsKindOf_2;
			}
			/*@NonInvalid*/ boolean result;
			if (or_1) {
				result = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Networkinterface = idResolver.getClass(OpenstackruntimeTables.CLSSid_Networkinterface, null);
				final /*@NonInvalid*/ boolean oclIsKindOf_3 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_3, TYP_infrastructure_c_c_Networkinterface).booleanValue();
				result = oclIsKindOf_3;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OpenstackruntimeTables.STR_Runtimeid_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, OpenstackruntimeTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenstackruntimePackage.RUNTIMEID__OPENSTACK_RUNTIME_ID:
				return getOpenstackRuntimeId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenstackruntimePackage.RUNTIMEID__OPENSTACK_RUNTIME_ID:
				setOpenstackRuntimeId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OpenstackruntimePackage.RUNTIMEID__OPENSTACK_RUNTIME_ID:
				setOpenstackRuntimeId(OPENSTACK_RUNTIME_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OpenstackruntimePackage.RUNTIMEID__OPENSTACK_RUNTIME_ID:
				return OPENSTACK_RUNTIME_ID_EDEFAULT == null ? openstackRuntimeId != null : !OPENSTACK_RUNTIME_ID_EDEFAULT.equals(openstackRuntimeId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OpenstackruntimePackage.RUNTIMEID___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (openstackRuntimeId: ");
		result.append(openstackRuntimeId);
		result.append(')');
		return result.toString();
	}

} //RuntimeidImpl
