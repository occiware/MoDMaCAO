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
package org.modmacao.lamp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.modmacao.lamp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LampFactoryImpl extends EFactoryImpl implements LampFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LampFactory init() {
		try {
			LampFactory theLampFactory = (LampFactory)EPackage.Registry.INSTANCE.getEFactory(LampPackage.eNS_URI);
			if (theLampFactory != null) {
				return theLampFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LampFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LampFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LampPackage.LAMP: return createLamp();
			case LampPackage.APACHESERVER: return createApacheserver();
			case LampPackage.TOMCAT: return createTomcat();
			case LampPackage.MYSQL: return createMysql();
			case LampPackage.TOMCATDEPENDENCY: return createTomcatdependency();
			case LampPackage.MYSQLDEPENDENCY: return createMysqldependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lamp createLamp() {
		LampImpl lamp = new LampImpl();
		return lamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apacheserver createApacheserver() {
		ApacheserverImpl apacheserver = new ApacheserverImpl();
		return apacheserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tomcat createTomcat() {
		TomcatImpl tomcat = new TomcatImpl();
		return tomcat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mysql createMysql() {
		MysqlImpl mysql = new MysqlImpl();
		return mysql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tomcatdependency createTomcatdependency() {
		TomcatdependencyImpl tomcatdependency = new TomcatdependencyImpl();
		return tomcatdependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mysqldependency createMysqldependency() {
		MysqldependencyImpl mysqldependency = new MysqldependencyImpl();
		return mysqldependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LampPackage getLampPackage() {
		return (LampPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LampPackage getPackage() {
		return LampPackage.eINSTANCE;
	}

} //LampFactoryImpl
