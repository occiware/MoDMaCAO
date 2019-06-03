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
package org.modmacao.mongodb;

import modmacao.Component;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mongodbcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modmacao.mongodb.Mongodbcomponent#getMongodbBindIP <em>Mongodb Bind IP</em>}</li>
 *   <li>{@link org.modmacao.mongodb.Mongodbcomponent#getMongodbPort <em>Mongodb Port</em>}</li>
 * </ul>
 *
 * @see org.modmacao.mongodb.MongodbPackage#getMongodbcomponent()
 * @model
 * @generated
 */
public interface Mongodbcomponent extends Component, MixinBase {
	/**
	 * Returns the value of the '<em><b>Mongodb Bind IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mongodb Bind IP</em>' attribute.
	 * @see #setMongodbBindIP(String)
	 * @see org.modmacao.mongodb.MongodbPackage#getMongodbcomponent_MongodbBindIP()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/mongodb/ecore!Mongodbcomponent!mongodbBindIP'"
	 * @generated
	 */
	String getMongodbBindIP();

	/**
	 * Sets the value of the '{@link org.modmacao.mongodb.Mongodbcomponent#getMongodbBindIP <em>Mongodb Bind IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mongodb Bind IP</em>' attribute.
	 * @see #getMongodbBindIP()
	 * @generated
	 */
	void setMongodbBindIP(String value);

	/**
	 * Returns the value of the '<em><b>Mongodb Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mongodb Port</em>' attribute.
	 * @see #setMongodbPort(Integer)
	 * @see org.modmacao.mongodb.MongodbPackage#getMongodbcomponent_MongodbPort()
	 * @model dataType="modmacao.Port"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/mongodb/ecore!Mongodbcomponent!mongodbPort'"
	 * @generated
	 */
	Integer getMongodbPort();

	/**
	 * Sets the value of the '{@link org.modmacao.mongodb.Mongodbcomponent#getMongodbPort <em>Mongodb Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mongodb Port</em>' attribute.
	 * @see #getMongodbPort()
	 * @generated
	 */
	void setMongodbPort(Integer value);

} // Mongodbcomponent
