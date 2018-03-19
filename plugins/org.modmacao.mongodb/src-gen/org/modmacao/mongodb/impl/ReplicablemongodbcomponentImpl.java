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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modmacao.mongodb.MongodbPackage;
import org.modmacao.mongodb.Replicablemongodbcomponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replicablemongodbcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modmacao.mongodb.impl.ReplicablemongodbcomponentImpl#getMongodbReplicationSetName <em>Mongodb Replication Set Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplicablemongodbcomponentImpl extends MongodbcomponentImpl implements Replicablemongodbcomponent {
	/**
	 * The default value of the '{@link #getMongodbReplicationSetName() <em>Mongodb Replication Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMongodbReplicationSetName()
	 * @generated
	 * @ordered
	 */
	protected static final String MONGODB_REPLICATION_SET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMongodbReplicationSetName() <em>Mongodb Replication Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMongodbReplicationSetName()
	 * @generated
	 * @ordered
	 */
	protected String mongodbReplicationSetName = MONGODB_REPLICATION_SET_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplicablemongodbcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MongodbPackage.Literals.REPLICABLEMONGODBCOMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMongodbReplicationSetName() {
		return mongodbReplicationSetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMongodbReplicationSetName(String newMongodbReplicationSetName) {
		String oldMongodbReplicationSetName = mongodbReplicationSetName;
		mongodbReplicationSetName = newMongodbReplicationSetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MongodbPackage.REPLICABLEMONGODBCOMPONENT__MONGODB_REPLICATION_SET_NAME, oldMongodbReplicationSetName, mongodbReplicationSetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MongodbPackage.REPLICABLEMONGODBCOMPONENT__MONGODB_REPLICATION_SET_NAME:
				return getMongodbReplicationSetName();
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
			case MongodbPackage.REPLICABLEMONGODBCOMPONENT__MONGODB_REPLICATION_SET_NAME:
				setMongodbReplicationSetName((String)newValue);
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
			case MongodbPackage.REPLICABLEMONGODBCOMPONENT__MONGODB_REPLICATION_SET_NAME:
				setMongodbReplicationSetName(MONGODB_REPLICATION_SET_NAME_EDEFAULT);
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
			case MongodbPackage.REPLICABLEMONGODBCOMPONENT__MONGODB_REPLICATION_SET_NAME:
				return MONGODB_REPLICATION_SET_NAME_EDEFAULT == null ? mongodbReplicationSetName != null : !MONGODB_REPLICATION_SET_NAME_EDEFAULT.equals(mongodbReplicationSetName);
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
		result.append(" (mongodbReplicationSetName: ");
		result.append(mongodbReplicationSetName);
		result.append(')');
		return result.toString();
	}

} //ReplicablemongodbcomponentImpl
