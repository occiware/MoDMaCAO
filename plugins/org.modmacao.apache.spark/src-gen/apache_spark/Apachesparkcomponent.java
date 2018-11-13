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

import modmacao.Component;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apachesparkcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apache_spark.Apachesparkcomponent#getApacheSparkPort <em>Apache Spark Port</em>}</li>
 *   <li>{@link apache_spark.Apachesparkcomponent#getApacheSparkWebuiPort <em>Apache Spark Webui Port</em>}</li>
 * </ul>
 *
 * @see apache_spark.Apache_sparkPackage#getApachesparkcomponent()
 * @model
 * @generated
 */
public interface Apachesparkcomponent extends Component, MixinBase {
	/**
	 * Returns the value of the '<em><b>Apache Spark Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Port for service to listen on (default: 7077 for master, random for worker)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Apache Spark Port</em>' attribute.
	 * @see #setApacheSparkPort(Integer)
	 * @see apache_spark.Apache_sparkPackage#getApachesparkcomponent_ApacheSparkPort()
	 * @model dataType="modmacao.Port"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/apache/spark/ecore!Apachesparkcomponent!apacheSparkPort'"
	 * @generated
	 */
	Integer getApacheSparkPort();

	/**
	 * Sets the value of the '{@link apache_spark.Apachesparkcomponent#getApacheSparkPort <em>Apache Spark Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apache Spark Port</em>' attribute.
	 * @see #getApacheSparkPort()
	 * @generated
	 */
	void setApacheSparkPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Apache Spark Webui Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Port for Web UI (default: 8080 for master, 8081 for worker)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Apache Spark Webui Port</em>' attribute.
	 * @see #setApacheSparkWebuiPort(Integer)
	 * @see apache_spark.Apache_sparkPackage#getApachesparkcomponent_ApacheSparkWebuiPort()
	 * @model dataType="modmacao.Port"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/apache/spark/ecore!Apachesparkcomponent!apacheSparkWebuiPort'"
	 * @generated
	 */
	Integer getApacheSparkWebuiPort();

	/**
	 * Sets the value of the '{@link apache_spark.Apachesparkcomponent#getApacheSparkWebuiPort <em>Apache Spark Webui Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apache Spark Webui Port</em>' attribute.
	 * @see #getApacheSparkWebuiPort()
	 * @generated
	 */
	void setApacheSparkWebuiPort(Integer value);

} // Apachesparkcomponent
