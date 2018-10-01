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
import apache_spark.Worker;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Worker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apache_spark.impl.WorkerImpl#getApacheSparkWorkerCores <em>Apache Spark Worker Cores</em>}</li>
 *   <li>{@link apache_spark.impl.WorkerImpl#getApacheSparkWorkerMemory <em>Apache Spark Worker Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkerImpl extends ApachesparkcomponentImpl implements Worker {
	/**
	 * The default value of the '{@link #getApacheSparkWorkerCores() <em>Apache Spark Worker Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApacheSparkWorkerCores()
	 * @generated
	 * @ordered
	 */
	protected static final Integer APACHE_SPARK_WORKER_CORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApacheSparkWorkerCores() <em>Apache Spark Worker Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApacheSparkWorkerCores()
	 * @generated
	 * @ordered
	 */
	protected Integer apacheSparkWorkerCores = APACHE_SPARK_WORKER_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getApacheSparkWorkerMemory() <em>Apache Spark Worker Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApacheSparkWorkerMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Float APACHE_SPARK_WORKER_MEMORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApacheSparkWorkerMemory() <em>Apache Spark Worker Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApacheSparkWorkerMemory()
	 * @generated
	 * @ordered
	 */
	protected Float apacheSparkWorkerMemory = APACHE_SPARK_WORKER_MEMORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Apache_sparkPackage.Literals.WORKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getApacheSparkWorkerCores() {
		return apacheSparkWorkerCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApacheSparkWorkerCores(Integer newApacheSparkWorkerCores) {
		Integer oldApacheSparkWorkerCores = apacheSparkWorkerCores;
		apacheSparkWorkerCores = newApacheSparkWorkerCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_CORES, oldApacheSparkWorkerCores, apacheSparkWorkerCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getApacheSparkWorkerMemory() {
		return apacheSparkWorkerMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApacheSparkWorkerMemory(Float newApacheSparkWorkerMemory) {
		Float oldApacheSparkWorkerMemory = apacheSparkWorkerMemory;
		apacheSparkWorkerMemory = newApacheSparkWorkerMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_MEMORY, oldApacheSparkWorkerMemory, apacheSparkWorkerMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean WorkerMemorySmallerThanComputeMemory(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv WorkerMemorySmallerThanComputeMemory: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean WorkerCoresSmallerThanComputeCores(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv WorkerCoresSmallerThanComputeCores: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OnlyOneMasterDependency(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv OnlyOneMasterDependency: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_CORES:
				return getApacheSparkWorkerCores();
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_MEMORY:
				return getApacheSparkWorkerMemory();
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
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_CORES:
				setApacheSparkWorkerCores((Integer)newValue);
				return;
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_MEMORY:
				setApacheSparkWorkerMemory((Float)newValue);
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
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_CORES:
				setApacheSparkWorkerCores(APACHE_SPARK_WORKER_CORES_EDEFAULT);
				return;
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_MEMORY:
				setApacheSparkWorkerMemory(APACHE_SPARK_WORKER_MEMORY_EDEFAULT);
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
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_CORES:
				return APACHE_SPARK_WORKER_CORES_EDEFAULT == null ? apacheSparkWorkerCores != null : !APACHE_SPARK_WORKER_CORES_EDEFAULT.equals(apacheSparkWorkerCores);
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_MEMORY:
				return APACHE_SPARK_WORKER_MEMORY_EDEFAULT == null ? apacheSparkWorkerMemory != null : !APACHE_SPARK_WORKER_MEMORY_EDEFAULT.equals(apacheSparkWorkerMemory);
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
			case Apache_sparkPackage.WORKER___WORKER_MEMORY_SMALLER_THAN_COMPUTE_MEMORY__DIAGNOSTICCHAIN_MAP:
				return WorkerMemorySmallerThanComputeMemory((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Apache_sparkPackage.WORKER___WORKER_CORES_SMALLER_THAN_COMPUTE_CORES__DIAGNOSTICCHAIN_MAP:
				return WorkerCoresSmallerThanComputeCores((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Apache_sparkPackage.WORKER___ONLY_ONE_MASTER_DEPENDENCY__DIAGNOSTICCHAIN_MAP:
				return OnlyOneMasterDependency((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (apacheSparkWorkerCores: ");
		result.append(apacheSparkWorkerCores);
		result.append(", apacheSparkWorkerMemory: ");
		result.append(apacheSparkWorkerMemory);
		result.append(')');
		return result.toString();
	}

} //WorkerImpl
