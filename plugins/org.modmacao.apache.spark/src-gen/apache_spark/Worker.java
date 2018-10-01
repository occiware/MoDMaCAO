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
package apache_spark;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apache_spark.Worker#getApacheSparkWorkerCores <em>Apache Spark Worker Cores</em>}</li>
 *   <li>{@link apache_spark.Worker#getApacheSparkWorkerMemory <em>Apache Spark Worker Memory</em>}</li>
 * </ul>
 *
 * @see apache_spark.Apache_sparkPackage#getWorker()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyOneMasterDependency'"
 * @generated
 */
public interface Worker extends Apachesparkcomponent, MixinBase {
	/**
	 * Returns the value of the '<em><b>Apache Spark Worker Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total CPU cores to allow Spark applications to use on the machine (default: all available)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Apache Spark Worker Cores</em>' attribute.
	 * @see #setApacheSparkWorkerCores(Integer)
	 * @see apache_spark.Apache_sparkPackage#getWorker_ApacheSparkWorkerCores()
	 * @model dataType="org.eclipse.cmf.occi.infrastructure.Core"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/apache/spark/ecore!Worker!apacheSparkWorkerCores'"
	 * @generated
	 */
	Integer getApacheSparkWorkerCores();

	/**
	 * Sets the value of the '{@link apache_spark.Worker#getApacheSparkWorkerCores <em>Apache Spark Worker Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apache Spark Worker Cores</em>' attribute.
	 * @see #getApacheSparkWorkerCores()
	 * @generated
	 */
	void setApacheSparkWorkerCores(Integer value);

	/**
	 * Returns the value of the '<em><b>Apache Spark Worker Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total amount of memory to allow Spark applications to use on the machine, in a format like 1000M or 2G (default: your machine's total RAM minus 1 GB)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Apache Spark Worker Memory</em>' attribute.
	 * @see #setApacheSparkWorkerMemory(Float)
	 * @see apache_spark.Apache_sparkPackage#getWorker_ApacheSparkWorkerMemory()
	 * @model dataType="org.eclipse.cmf.occi.infrastructure.GiB"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/apache/spark/ecore!Worker!apacheSparkWorkerMemory'"
	 * @generated
	 */
	Float getApacheSparkWorkerMemory();

	/**
	 * Sets the value of the '{@link apache_spark.Worker#getApacheSparkWorkerMemory <em>Apache Spark Worker Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apache Spark Worker Memory</em>' attribute.
	 * @see #getApacheSparkWorkerMemory()
	 * @generated
	 */
	void setApacheSparkWorkerMemory(Float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv WorkerMemorySmallerThanComputeMemory: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean WorkerMemorySmallerThanComputeMemory(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv WorkerCoresSmallerThanComputeCores: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean WorkerCoresSmallerThanComputeCores(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv OnlyOneMasterDependency: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean OnlyOneMasterDependency(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Worker
