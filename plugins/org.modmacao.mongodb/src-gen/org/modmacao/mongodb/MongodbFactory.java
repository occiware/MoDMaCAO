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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.modmacao.mongodb.MongodbPackage
 * @generated
 */
public interface MongodbFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MongodbFactory eINSTANCE = org.modmacao.mongodb.impl.MongodbFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mongodbcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mongodbcomponent</em>'.
	 * @generated
	 */
	Mongodbcomponent createMongodbcomponent();

	/**
	 * Returns a new object of class '<em>Configserver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configserver</em>'.
	 * @generated
	 */
	Configserver createConfigserver();

	/**
	 * Returns a new object of class '<em>Router</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Router</em>'.
	 * @generated
	 */
	Router createRouter();

	/**
	 * Returns a new object of class '<em>Shard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shard</em>'.
	 * @generated
	 */
	Shard createShard();

	/**
	 * Returns a new object of class '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster</em>'.
	 * @generated
	 */
	Cluster createCluster();

	/**
	 * Returns a new object of class '<em>Configserverdependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configserverdependency</em>'.
	 * @generated
	 */
	Configserverdependency createConfigserverdependency();

	/**
	 * Returns a new object of class '<em>Replicablemongodbcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replicablemongodbcomponent</em>'.
	 * @generated
	 */
	Replicablemongodbcomponent createReplicablemongodbcomponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MongodbPackage getMongodbPackage();

} //MongodbFactory
