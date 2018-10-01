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
package org.modmacao.lamp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.modmacao.lamp.LampPackage
 * @generated
 */
public interface LampFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LampFactory eINSTANCE = org.modmacao.lamp.impl.LampFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Lamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lamp</em>'.
	 * @generated
	 */
	Lamp createLamp();

	/**
	 * Returns a new object of class '<em>Apacheserver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apacheserver</em>'.
	 * @generated
	 */
	Apacheserver createApacheserver();

	/**
	 * Returns a new object of class '<em>Tomcat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tomcat</em>'.
	 * @generated
	 */
	Tomcat createTomcat();

	/**
	 * Returns a new object of class '<em>Mysql</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mysql</em>'.
	 * @generated
	 */
	Mysql createMysql();

	/**
	 * Returns a new object of class '<em>Tomcatdependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tomcatdependency</em>'.
	 * @generated
	 */
	Tomcatdependency createTomcatdependency();

	/**
	 * Returns a new object of class '<em>Mysqldependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mysqldependency</em>'.
	 * @generated
	 */
	Mysqldependency createMysqldependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LampPackage getLampPackage();

} //LampFactory
