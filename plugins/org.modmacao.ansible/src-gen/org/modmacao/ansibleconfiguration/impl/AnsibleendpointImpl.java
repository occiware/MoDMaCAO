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
package org.modmacao.ansibleconfiguration.impl;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modmacao.ansibleconfiguration.AnsibleconfigurationPackage;
import org.modmacao.ansibleconfiguration.Ansibleendpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ansibleendpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modmacao.ansibleconfiguration.impl.AnsibleendpointImpl#getAnsibleRemoteuser <em>Ansible Remoteuser</em>}</li>
 *   <li>{@link org.modmacao.ansibleconfiguration.impl.AnsibleendpointImpl#getAnsiblePrivatekey <em>Ansible Privatekey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnsibleendpointImpl extends MixinBaseImpl implements Ansibleendpoint {
	/**
	 * The default value of the '{@link #getAnsibleRemoteuser() <em>Ansible Remoteuser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnsibleRemoteuser()
	 * @generated
	 * @ordered
	 */
	protected static final String ANSIBLE_REMOTEUSER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnsibleRemoteuser() <em>Ansible Remoteuser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnsibleRemoteuser()
	 * @generated
	 * @ordered
	 */
	protected String ansibleRemoteuser = ANSIBLE_REMOTEUSER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnsiblePrivatekey() <em>Ansible Privatekey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnsiblePrivatekey()
	 * @generated
	 * @ordered
	 */
	protected static final String ANSIBLE_PRIVATEKEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnsiblePrivatekey() <em>Ansible Privatekey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnsiblePrivatekey()
	 * @generated
	 * @ordered
	 */
	protected String ansiblePrivatekey = ANSIBLE_PRIVATEKEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnsibleendpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnsibleconfigurationPackage.Literals.ANSIBLEENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnsibleRemoteuser() {
		return ansibleRemoteuser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnsibleRemoteuser(String newAnsibleRemoteuser) {
		String oldAnsibleRemoteuser = ansibleRemoteuser;
		ansibleRemoteuser = newAnsibleRemoteuser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnsibleconfigurationPackage.ANSIBLEENDPOINT__ANSIBLE_REMOTEUSER, oldAnsibleRemoteuser, ansibleRemoteuser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnsiblePrivatekey() {
		return ansiblePrivatekey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnsiblePrivatekey(String newAnsiblePrivatekey) {
		String oldAnsiblePrivatekey = ansiblePrivatekey;
		ansiblePrivatekey = newAnsiblePrivatekey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnsibleconfigurationPackage.ANSIBLEENDPOINT__ANSIBLE_PRIVATEKEY, oldAnsiblePrivatekey, ansiblePrivatekey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnsibleconfigurationPackage.ANSIBLEENDPOINT__ANSIBLE_REMOTEUSER:
				return getAnsibleRemoteuser();
			case AnsibleconfigurationPackage.ANSIBLEENDPOINT__ANSIBLE_PRIVATEKEY:
				return getAnsiblePrivatekey();
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
			case AnsibleconfigurationPackage.ANSIBLEENDPOINT__ANSIBLE_REMOTEUSER:
				setAnsibleRemoteuser((String)newValue);
				return;
			case AnsibleconfigurationPackage.ANSIBLEENDPOINT__ANSIBLE_PRIVATEKEY:
				setAnsiblePrivatekey((String)newValue);
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
			case AnsibleconfigurationPackage.ANSIBLEENDPOINT__ANSIBLE_REMOTEUSER:
				setAnsibleRemoteuser(ANSIBLE_REMOTEUSER_EDEFAULT);
				return;
			case AnsibleconfigurationPackage.ANSIBLEENDPOINT__ANSIBLE_PRIVATEKEY:
				setAnsiblePrivatekey(ANSIBLE_PRIVATEKEY_EDEFAULT);
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
			case AnsibleconfigurationPackage.ANSIBLEENDPOINT__ANSIBLE_REMOTEUSER:
				return ANSIBLE_REMOTEUSER_EDEFAULT == null ? ansibleRemoteuser != null : !ANSIBLE_REMOTEUSER_EDEFAULT.equals(ansibleRemoteuser);
			case AnsibleconfigurationPackage.ANSIBLEENDPOINT__ANSIBLE_PRIVATEKEY:
				return ANSIBLE_PRIVATEKEY_EDEFAULT == null ? ansiblePrivatekey != null : !ANSIBLE_PRIVATEKEY_EDEFAULT.equals(ansiblePrivatekey);
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
		result.append(" (ansibleRemoteuser: ");
		result.append(ansibleRemoteuser);
		result.append(", ansiblePrivatekey: ");
		result.append(ansiblePrivatekey);
		result.append(')');
		return result.toString();
	}

} //AnsibleendpointImpl
