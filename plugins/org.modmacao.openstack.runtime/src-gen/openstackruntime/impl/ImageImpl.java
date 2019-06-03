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

import openstackruntime.Image;
import openstackruntime.OpenstackruntimePackage;

import org.eclipse.cmf.occi.infrastructure.impl.Os_tplImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openstackruntime.impl.ImageImpl#getOpenstackImageId <em>Openstack Image Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends Os_tplImpl implements Image {
	/**
	 * The default value of the '{@link #getOpenstackImageId() <em>Openstack Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackImageId()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENSTACK_IMAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenstackImageId() <em>Openstack Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackImageId()
	 * @generated
	 * @ordered
	 */
	protected String openstackImageId = OPENSTACK_IMAGE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenstackruntimePackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpenstackImageId() {
		return openstackImageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenstackImageId(String newOpenstackImageId) {
		String oldOpenstackImageId = openstackImageId;
		openstackImageId = newOpenstackImageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenstackruntimePackage.IMAGE__OPENSTACK_IMAGE_ID, oldOpenstackImageId, openstackImageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenstackruntimePackage.IMAGE__OPENSTACK_IMAGE_ID:
				return getOpenstackImageId();
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
			case OpenstackruntimePackage.IMAGE__OPENSTACK_IMAGE_ID:
				setOpenstackImageId((String)newValue);
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
			case OpenstackruntimePackage.IMAGE__OPENSTACK_IMAGE_ID:
				setOpenstackImageId(OPENSTACK_IMAGE_ID_EDEFAULT);
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
			case OpenstackruntimePackage.IMAGE__OPENSTACK_IMAGE_ID:
				return OPENSTACK_IMAGE_ID_EDEFAULT == null ? openstackImageId != null : !OPENSTACK_IMAGE_ID_EDEFAULT.equals(openstackImageId);
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
		result.append(" (openstackImageId: ");
		result.append(openstackImageId);
		result.append(')');
		return result.toString();
	}

} //ImageImpl
