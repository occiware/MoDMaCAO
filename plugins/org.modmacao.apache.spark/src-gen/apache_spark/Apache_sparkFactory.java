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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see apache_spark.Apache_sparkPackage
 * @generated
 */
public interface Apache_sparkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Apache_sparkFactory eINSTANCE = apache_spark.impl.Apache_sparkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Master</em>'.
	 * @generated
	 */
	Master createMaster();

	/**
	 * Returns a new object of class '<em>Worker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Worker</em>'.
	 * @generated
	 */
	Worker createWorker();

	/**
	 * Returns a new object of class '<em>Apachesparkcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apachesparkcomponent</em>'.
	 * @generated
	 */
	Apachesparkcomponent createApachesparkcomponent();

	/**
	 * Returns a new object of class '<em>Apachesparkcluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apachesparkcluster</em>'.
	 * @generated
	 */
	Apachesparkcluster createApachesparkcluster();

	/**
	 * Returns a new object of class '<em>Masterdependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Masterdependency</em>'.
	 * @generated
	 */
	Masterdependency createMasterdependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Apache_sparkPackage getApache_sparkPackage();

} //Apache_sparkFactory
