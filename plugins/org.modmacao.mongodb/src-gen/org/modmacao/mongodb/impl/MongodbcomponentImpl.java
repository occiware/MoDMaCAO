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
package org.modmacao.mongodb.impl;

import modmacao.impl.ComponentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modmacao.mongodb.MongodbPackage;
import org.modmacao.mongodb.Mongodbcomponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mongodbcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modmacao.mongodb.impl.MongodbcomponentImpl#getMongodbPort <em>Mongodb Port</em>}</li>
 *   <li>{@link org.modmacao.mongodb.impl.MongodbcomponentImpl#getMongodbBindip <em>Mongodb Bindip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MongodbcomponentImpl extends ComponentImpl implements Mongodbcomponent {
	/**
	 * The default value of the '{@link #getMongodbPort() <em>Mongodb Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMongodbPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MONGODB_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMongodbPort() <em>Mongodb Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMongodbPort()
	 * @generated
	 * @ordered
	 */
	protected Integer mongodbPort = MONGODB_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMongodbBindip() <em>Mongodb Bindip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMongodbBindip()
	 * @generated
	 * @ordered
	 */
	protected static final String MONGODB_BINDIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMongodbBindip() <em>Mongodb Bindip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMongodbBindip()
	 * @generated
	 * @ordered
	 */
	protected String mongodbBindip = MONGODB_BINDIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MongodbcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MongodbPackage.Literals.MONGODBCOMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMongodbPort() {
		return mongodbPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMongodbPort(Integer newMongodbPort) {
		Integer oldMongodbPort = mongodbPort;
		mongodbPort = newMongodbPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MongodbPackage.MONGODBCOMPONENT__MONGODB_PORT, oldMongodbPort, mongodbPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMongodbBindip() {
		return mongodbBindip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMongodbBindip(String newMongodbBindip) {
		String oldMongodbBindip = mongodbBindip;
		mongodbBindip = newMongodbBindip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MongodbPackage.MONGODBCOMPONENT__MONGODB_BINDIP, oldMongodbBindip, mongodbBindip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MongodbPackage.MONGODBCOMPONENT__MONGODB_PORT:
				return getMongodbPort();
			case MongodbPackage.MONGODBCOMPONENT__MONGODB_BINDIP:
				return getMongodbBindip();
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
			case MongodbPackage.MONGODBCOMPONENT__MONGODB_PORT:
				setMongodbPort((Integer)newValue);
				return;
			case MongodbPackage.MONGODBCOMPONENT__MONGODB_BINDIP:
				setMongodbBindip((String)newValue);
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
			case MongodbPackage.MONGODBCOMPONENT__MONGODB_PORT:
				setMongodbPort(MONGODB_PORT_EDEFAULT);
				return;
			case MongodbPackage.MONGODBCOMPONENT__MONGODB_BINDIP:
				setMongodbBindip(MONGODB_BINDIP_EDEFAULT);
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
			case MongodbPackage.MONGODBCOMPONENT__MONGODB_PORT:
				return MONGODB_PORT_EDEFAULT == null ? mongodbPort != null : !MONGODB_PORT_EDEFAULT.equals(mongodbPort);
			case MongodbPackage.MONGODBCOMPONENT__MONGODB_BINDIP:
				return MONGODB_BINDIP_EDEFAULT == null ? mongodbBindip != null : !MONGODB_BINDIP_EDEFAULT.equals(mongodbBindip);
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
		result.append(" (mongodbPort: ");
		result.append(mongodbPort);
		result.append(", mongodbBindip: ");
		result.append(mongodbBindip);
		result.append(')');
		return result.toString();
	}

} //MongodbcomponentImpl
