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
package apache_spark.impl;

import apache_spark.Apache_sparkPackage;
import apache_spark.Apachesparkcomponent;

import modmacao.impl.ComponentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apachesparkcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apache_spark.impl.ApachesparkcomponentImpl#getApacheSparkPort <em>Apache Spark Port</em>}</li>
 *   <li>{@link apache_spark.impl.ApachesparkcomponentImpl#getApacheSparkWebuiPort <em>Apache Spark Webui Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApachesparkcomponentImpl extends ComponentImpl implements Apachesparkcomponent {
	/**
	 * The default value of the '{@link #getApacheSparkPort() <em>Apache Spark Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApacheSparkPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer APACHE_SPARK_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApacheSparkPort() <em>Apache Spark Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApacheSparkPort()
	 * @generated
	 * @ordered
	 */
	protected Integer apacheSparkPort = APACHE_SPARK_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getApacheSparkWebuiPort() <em>Apache Spark Webui Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApacheSparkWebuiPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer APACHE_SPARK_WEBUI_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApacheSparkWebuiPort() <em>Apache Spark Webui Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApacheSparkWebuiPort()
	 * @generated
	 * @ordered
	 */
	protected Integer apacheSparkWebuiPort = APACHE_SPARK_WEBUI_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApachesparkcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Apache_sparkPackage.Literals.APACHESPARKCOMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getApacheSparkPort() {
		return apacheSparkPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApacheSparkPort(Integer newApacheSparkPort) {
		Integer oldApacheSparkPort = apacheSparkPort;
		apacheSparkPort = newApacheSparkPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Apache_sparkPackage.APACHESPARKCOMPONENT__APACHE_SPARK_PORT, oldApacheSparkPort, apacheSparkPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getApacheSparkWebuiPort() {
		return apacheSparkWebuiPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApacheSparkWebuiPort(Integer newApacheSparkWebuiPort) {
		Integer oldApacheSparkWebuiPort = apacheSparkWebuiPort;
		apacheSparkWebuiPort = newApacheSparkWebuiPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Apache_sparkPackage.APACHESPARKCOMPONENT__APACHE_SPARK_WEBUI_PORT, oldApacheSparkWebuiPort, apacheSparkWebuiPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Apache_sparkPackage.APACHESPARKCOMPONENT__APACHE_SPARK_PORT:
				return getApacheSparkPort();
			case Apache_sparkPackage.APACHESPARKCOMPONENT__APACHE_SPARK_WEBUI_PORT:
				return getApacheSparkWebuiPort();
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
			case Apache_sparkPackage.APACHESPARKCOMPONENT__APACHE_SPARK_PORT:
				setApacheSparkPort((Integer)newValue);
				return;
			case Apache_sparkPackage.APACHESPARKCOMPONENT__APACHE_SPARK_WEBUI_PORT:
				setApacheSparkWebuiPort((Integer)newValue);
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
			case Apache_sparkPackage.APACHESPARKCOMPONENT__APACHE_SPARK_PORT:
				setApacheSparkPort(APACHE_SPARK_PORT_EDEFAULT);
				return;
			case Apache_sparkPackage.APACHESPARKCOMPONENT__APACHE_SPARK_WEBUI_PORT:
				setApacheSparkWebuiPort(APACHE_SPARK_WEBUI_PORT_EDEFAULT);
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
			case Apache_sparkPackage.APACHESPARKCOMPONENT__APACHE_SPARK_PORT:
				return APACHE_SPARK_PORT_EDEFAULT == null ? apacheSparkPort != null : !APACHE_SPARK_PORT_EDEFAULT.equals(apacheSparkPort);
			case Apache_sparkPackage.APACHESPARKCOMPONENT__APACHE_SPARK_WEBUI_PORT:
				return APACHE_SPARK_WEBUI_PORT_EDEFAULT == null ? apacheSparkWebuiPort != null : !APACHE_SPARK_WEBUI_PORT_EDEFAULT.equals(apacheSparkWebuiPort);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (apacheSparkPort: ");
		result.append(apacheSparkPort);
		result.append(", apacheSparkWebuiPort: ");
		result.append(apacheSparkWebuiPort);
		result.append(')');
		return result.toString();
	}

} //ApachesparkcomponentImpl
