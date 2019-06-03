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

import openstackruntime.Flavor;
import openstackruntime.OpenstackruntimePackage;

import org.eclipse.cmf.occi.infrastructure.impl.Resource_tplImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flavor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openstackruntime.impl.FlavorImpl#getOpenstackFlavorId <em>Openstack Flavor Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlavorImpl extends Resource_tplImpl implements Flavor {
	/**
	 * The default value of the '{@link #getOpenstackFlavorId() <em>Openstack Flavor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackFlavorId()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENSTACK_FLAVOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenstackFlavorId() <em>Openstack Flavor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackFlavorId()
	 * @generated
	 * @ordered
	 */
	protected String openstackFlavorId = OPENSTACK_FLAVOR_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlavorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenstackruntimePackage.Literals.FLAVOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpenstackFlavorId() {
		return openstackFlavorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenstackFlavorId(String newOpenstackFlavorId) {
		String oldOpenstackFlavorId = openstackFlavorId;
		openstackFlavorId = newOpenstackFlavorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenstackruntimePackage.FLAVOR__OPENSTACK_FLAVOR_ID, oldOpenstackFlavorId, openstackFlavorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenstackruntimePackage.FLAVOR__OPENSTACK_FLAVOR_ID:
				return getOpenstackFlavorId();
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
			case OpenstackruntimePackage.FLAVOR__OPENSTACK_FLAVOR_ID:
				setOpenstackFlavorId((String)newValue);
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
			case OpenstackruntimePackage.FLAVOR__OPENSTACK_FLAVOR_ID:
				setOpenstackFlavorId(OPENSTACK_FLAVOR_ID_EDEFAULT);
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
			case OpenstackruntimePackage.FLAVOR__OPENSTACK_FLAVOR_ID:
				return OPENSTACK_FLAVOR_ID_EDEFAULT == null ? openstackFlavorId != null : !OPENSTACK_FLAVOR_ID_EDEFAULT.equals(openstackFlavorId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (openstackFlavorId: ");
		result.append(openstackFlavorId);
		result.append(')');
		return result.toString();
	}

} //FlavorImpl
