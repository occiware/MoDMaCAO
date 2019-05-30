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

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replicablemongodbcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modmacao.mongodb.Replicablemongodbcomponent#getMongodbReplicationSetName <em>Mongodb Replication Set Name</em>}</li>
 * </ul>
 *
 * @see org.modmacao.mongodb.MongodbPackage#getReplicablemongodbcomponent()
 * @model
 * @generated
 */
public interface Replicablemongodbcomponent extends Mongodbcomponent, MixinBase {
	/**
	 * Returns the value of the '<em><b>Mongodb Replication Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mongodb Replication Set Name</em>' attribute.
	 * @see #setMongodbReplicationSetName(String)
	 * @see org.modmacao.mongodb.MongodbPackage#getReplicablemongodbcomponent_MongodbReplicationSetName()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/mongodb/ecore!Replicablemongodbcomponent!mongodbReplicationSetName'"
	 * @generated
	 */
	String getMongodbReplicationSetName();

	/**
	 * Sets the value of the '{@link org.modmacao.mongodb.Replicablemongodbcomponent#getMongodbReplicationSetName <em>Mongodb Replication Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mongodb Replication Set Name</em>' attribute.
	 * @see #getMongodbReplicationSetName()
	 * @generated
	 */
	void setMongodbReplicationSetName(String value);

} // Replicablemongodbcomponent
