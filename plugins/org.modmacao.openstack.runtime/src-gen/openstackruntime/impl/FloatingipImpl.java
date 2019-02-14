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
import openstackruntime.Floatingip;
import openstackruntime.OpenstackruntimePackage;

import openstackruntime.OpenstackruntimeTables;
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
 * An implementation of the model object '<em><b>Floatingip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openstackruntime.impl.FloatingipImpl#getOpenstackFloatingipAddress <em>Openstack Floatingip Address</em>}</li>
 *   <li>{@link openstackruntime.impl.FloatingipImpl#getOpenstackFloatingipPool <em>Openstack Floatingip Pool</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloatingipImpl extends MixinBaseImpl implements Floatingip {
	/**
	 * The default value of the '{@link #getOpenstackFloatingipAddress() <em>Openstack Floatingip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackFloatingipAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENSTACK_FLOATINGIP_ADDRESS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOpenstackFloatingipAddress() <em>Openstack Floatingip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackFloatingipAddress()
	 * @generated
	 * @ordered
	 */
	protected String openstackFloatingipAddress = OPENSTACK_FLOATINGIP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpenstackFloatingipPool() <em>Openstack Floatingip Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackFloatingipPool()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENSTACK_FLOATINGIP_POOL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOpenstackFloatingipPool() <em>Openstack Floatingip Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackFloatingipPool()
	 * @generated
	 * @ordered
	 */
	protected String openstackFloatingipPool = OPENSTACK_FLOATINGIP_POOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatingipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenstackruntimePackage.Literals.FLOATINGIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpenstackFloatingipAddress() {
		return openstackFloatingipAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenstackFloatingipAddress(String newOpenstackFloatingipAddress) {
		String oldOpenstackFloatingipAddress = openstackFloatingipAddress;
		openstackFloatingipAddress = newOpenstackFloatingipAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenstackruntimePackage.FLOATINGIP__OPENSTACK_FLOATINGIP_ADDRESS, oldOpenstackFloatingipAddress, openstackFloatingipAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpenstackFloatingipPool() {
		return openstackFloatingipPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenstackFloatingipPool(String newOpenstackFloatingipPool) {
		String oldOpenstackFloatingipPool = openstackFloatingipPool;
		openstackFloatingipPool = newOpenstackFloatingipPool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenstackruntimePackage.FLOATINGIP__OPENSTACK_FLOATINGIP_POOL, oldOpenstackFloatingipPool, openstackFloatingipPool));
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
		 *   let severity : Integer[1] = 'Floatingip::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(infrastructure::Compute)
		 *       in
		 *         'Floatingip::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OpenstackruntimeTables.STR_Floatingip_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OpenstackruntimeTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Compute_0 = idResolver.getClass(OpenstackruntimeTables.CLSSid_Compute, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Compute_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OpenstackruntimeTables.STR_Floatingip_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, OpenstackruntimeTables.INT_0).booleanValue();
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
			case OpenstackruntimePackage.FLOATINGIP__OPENSTACK_FLOATINGIP_ADDRESS:
				return getOpenstackFloatingipAddress();
			case OpenstackruntimePackage.FLOATINGIP__OPENSTACK_FLOATINGIP_POOL:
				return getOpenstackFloatingipPool();
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
			case OpenstackruntimePackage.FLOATINGIP__OPENSTACK_FLOATINGIP_ADDRESS:
				setOpenstackFloatingipAddress((String)newValue);
				return;
			case OpenstackruntimePackage.FLOATINGIP__OPENSTACK_FLOATINGIP_POOL:
				setOpenstackFloatingipPool((String)newValue);
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
			case OpenstackruntimePackage.FLOATINGIP__OPENSTACK_FLOATINGIP_ADDRESS:
				setOpenstackFloatingipAddress(OPENSTACK_FLOATINGIP_ADDRESS_EDEFAULT);
				return;
			case OpenstackruntimePackage.FLOATINGIP__OPENSTACK_FLOATINGIP_POOL:
				setOpenstackFloatingipPool(OPENSTACK_FLOATINGIP_POOL_EDEFAULT);
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
			case OpenstackruntimePackage.FLOATINGIP__OPENSTACK_FLOATINGIP_ADDRESS:
				return OPENSTACK_FLOATINGIP_ADDRESS_EDEFAULT == null ? openstackFloatingipAddress != null : !OPENSTACK_FLOATINGIP_ADDRESS_EDEFAULT.equals(openstackFloatingipAddress);
			case OpenstackruntimePackage.FLOATINGIP__OPENSTACK_FLOATINGIP_POOL:
				return OPENSTACK_FLOATINGIP_POOL_EDEFAULT == null ? openstackFloatingipPool != null : !OPENSTACK_FLOATINGIP_POOL_EDEFAULT.equals(openstackFloatingipPool);
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
			case OpenstackruntimePackage.FLOATINGIP___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (openstackFloatingipAddress: ");
		result.append(openstackFloatingipAddress);
		result.append(", openstackFloatingipPool: ");
		result.append(openstackFloatingipPool);
		result.append(')');
		return result.toString();
	}

} //FloatingipImpl
