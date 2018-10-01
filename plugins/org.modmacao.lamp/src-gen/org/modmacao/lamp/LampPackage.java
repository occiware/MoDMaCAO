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

import modmacao.ModmacaoPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.modmacao.lamp.LampFactory
 * @model kind="package"
 * @generated
 */
public interface LampPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lamp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.modmacao.org/lamp/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lamp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LampPackage eINSTANCE = org.modmacao.lamp.impl.LampPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modmacao.lamp.impl.LampImpl <em>Lamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.lamp.impl.LampImpl
	 * @see org.modmacao.lamp.impl.LampPackageImpl#getLamp()
	 * @generated
	 */
	int LAMP = 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP__MIXIN = ModmacaoPackage.APPLICATION__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP__ENTITY = ModmacaoPackage.APPLICATION__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP__ATTRIBUTES = ModmacaoPackage.APPLICATION__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Lamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_FEATURE_COUNT = ModmacaoPackage.APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Only One Apache Server</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP___ONLY_ONE_APACHE_SERVER__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>One Or More Tomcats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP___ONE_OR_MORE_TOMCATS__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.APPLICATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Only One My SQL</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP___ONLY_ONE_MY_SQL__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.APPLICATION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_OPERATION_COUNT = ModmacaoPackage.APPLICATION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.modmacao.lamp.impl.ApacheserverImpl <em>Apacheserver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.lamp.impl.ApacheserverImpl
	 * @see org.modmacao.lamp.impl.LampPackageImpl#getApacheserver()
	 * @generated
	 */
	int APACHESERVER = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESERVER__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESERVER__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESERVER__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESERVER__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Apacheserver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESERVER_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>One Or More Tomcat Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESERVER___ONE_OR_MORE_TOMCAT_DEPENDENCIES__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Apacheserver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHESERVER_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modmacao.lamp.impl.TomcatImpl <em>Tomcat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.lamp.impl.TomcatImpl
	 * @see org.modmacao.lamp.impl.LampPackageImpl#getTomcat()
	 * @generated
	 */
	int TOMCAT = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Tomcat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Only One My SQL Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT___ONLY_ONE_MY_SQL_DEPENDENCY__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tomcat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modmacao.lamp.impl.MysqlImpl <em>Mysql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.lamp.impl.MysqlImpl
	 * @see org.modmacao.lamp.impl.LampPackageImpl#getMysql()
	 * @generated
	 */
	int MYSQL = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Mysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modmacao.lamp.impl.TomcatdependencyImpl <em>Tomcatdependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.lamp.impl.TomcatdependencyImpl
	 * @see org.modmacao.lamp.impl.LampPackageImpl#getTomcatdependency()
	 * @generated
	 */
	int TOMCATDEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCATDEPENDENCY__MIXIN = ModmacaoPackage.EXECUTIONDEPENDENCY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCATDEPENDENCY__ENTITY = ModmacaoPackage.EXECUTIONDEPENDENCY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCATDEPENDENCY__ATTRIBUTES = ModmacaoPackage.EXECUTIONDEPENDENCY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tomcatdependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCATDEPENDENCY_FEATURE_COUNT = ModmacaoPackage.EXECUTIONDEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Target Must Be Tomcat</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCATDEPENDENCY___TARGET_MUST_BE_TOMCAT__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.EXECUTIONDEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tomcatdependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCATDEPENDENCY_OPERATION_COUNT = ModmacaoPackage.EXECUTIONDEPENDENCY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modmacao.lamp.impl.MysqldependencyImpl <em>Mysqldependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.lamp.impl.MysqldependencyImpl
	 * @see org.modmacao.lamp.impl.LampPackageImpl#getMysqldependency()
	 * @generated
	 */
	int MYSQLDEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDEPENDENCY__MIXIN = ModmacaoPackage.EXECUTIONDEPENDENCY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDEPENDENCY__ENTITY = ModmacaoPackage.EXECUTIONDEPENDENCY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDEPENDENCY__ATTRIBUTES = ModmacaoPackage.EXECUTIONDEPENDENCY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Mysqldependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDEPENDENCY_FEATURE_COUNT = ModmacaoPackage.EXECUTIONDEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Target Must Be My SQL</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDEPENDENCY___TARGET_MUST_BE_MY_SQL__DIAGNOSTICCHAIN_MAP = ModmacaoPackage.EXECUTIONDEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mysqldependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQLDEPENDENCY_OPERATION_COUNT = ModmacaoPackage.EXECUTIONDEPENDENCY_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.modmacao.lamp.Lamp <em>Lamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lamp</em>'.
	 * @see org.modmacao.lamp.Lamp
	 * @generated
	 */
	EClass getLamp();

	/**
	 * Returns the meta object for the '{@link org.modmacao.lamp.Lamp#OnlyOneApacheServer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only One Apache Server</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Only One Apache Server</em>' operation.
	 * @see org.modmacao.lamp.Lamp#OnlyOneApacheServer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLamp__OnlyOneApacheServer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.modmacao.lamp.Lamp#OneOrMoreTomcats(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>One Or More Tomcats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>One Or More Tomcats</em>' operation.
	 * @see org.modmacao.lamp.Lamp#OneOrMoreTomcats(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLamp__OneOrMoreTomcats__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.modmacao.lamp.Lamp#OnlyOneMySQL(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only One My SQL</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Only One My SQL</em>' operation.
	 * @see org.modmacao.lamp.Lamp#OnlyOneMySQL(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLamp__OnlyOneMySQL__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.modmacao.lamp.Apacheserver <em>Apacheserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apacheserver</em>'.
	 * @see org.modmacao.lamp.Apacheserver
	 * @generated
	 */
	EClass getApacheserver();

	/**
	 * Returns the meta object for the '{@link org.modmacao.lamp.Apacheserver#OneOrMoreTomcatDependencies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>One Or More Tomcat Dependencies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>One Or More Tomcat Dependencies</em>' operation.
	 * @see org.modmacao.lamp.Apacheserver#OneOrMoreTomcatDependencies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApacheserver__OneOrMoreTomcatDependencies__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.modmacao.lamp.Tomcat <em>Tomcat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tomcat</em>'.
	 * @see org.modmacao.lamp.Tomcat
	 * @generated
	 */
	EClass getTomcat();

	/**
	 * Returns the meta object for the '{@link org.modmacao.lamp.Tomcat#OnlyOneMySQLDependency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only One My SQL Dependency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Only One My SQL Dependency</em>' operation.
	 * @see org.modmacao.lamp.Tomcat#OnlyOneMySQLDependency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTomcat__OnlyOneMySQLDependency__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.modmacao.lamp.Mysql <em>Mysql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mysql</em>'.
	 * @see org.modmacao.lamp.Mysql
	 * @generated
	 */
	EClass getMysql();

	/**
	 * Returns the meta object for class '{@link org.modmacao.lamp.Tomcatdependency <em>Tomcatdependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tomcatdependency</em>'.
	 * @see org.modmacao.lamp.Tomcatdependency
	 * @generated
	 */
	EClass getTomcatdependency();

	/**
	 * Returns the meta object for the '{@link org.modmacao.lamp.Tomcatdependency#TargetMustBeTomcat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Must Be Tomcat</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Must Be Tomcat</em>' operation.
	 * @see org.modmacao.lamp.Tomcatdependency#TargetMustBeTomcat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTomcatdependency__TargetMustBeTomcat__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.modmacao.lamp.Mysqldependency <em>Mysqldependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mysqldependency</em>'.
	 * @see org.modmacao.lamp.Mysqldependency
	 * @generated
	 */
	EClass getMysqldependency();

	/**
	 * Returns the meta object for the '{@link org.modmacao.lamp.Mysqldependency#TargetMustBeMySQL(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Must Be My SQL</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Must Be My SQL</em>' operation.
	 * @see org.modmacao.lamp.Mysqldependency#TargetMustBeMySQL(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMysqldependency__TargetMustBeMySQL__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LampFactory getLampFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.modmacao.lamp.impl.LampImpl <em>Lamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.lamp.impl.LampImpl
		 * @see org.modmacao.lamp.impl.LampPackageImpl#getLamp()
		 * @generated
		 */
		EClass LAMP = eINSTANCE.getLamp();

		/**
		 * The meta object literal for the '<em><b>Only One Apache Server</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAMP___ONLY_ONE_APACHE_SERVER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLamp__OnlyOneApacheServer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>One Or More Tomcats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAMP___ONE_OR_MORE_TOMCATS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLamp__OneOrMoreTomcats__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Only One My SQL</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAMP___ONLY_ONE_MY_SQL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLamp__OnlyOneMySQL__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.modmacao.lamp.impl.ApacheserverImpl <em>Apacheserver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.lamp.impl.ApacheserverImpl
		 * @see org.modmacao.lamp.impl.LampPackageImpl#getApacheserver()
		 * @generated
		 */
		EClass APACHESERVER = eINSTANCE.getApacheserver();

		/**
		 * The meta object literal for the '<em><b>One Or More Tomcat Dependencies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APACHESERVER___ONE_OR_MORE_TOMCAT_DEPENDENCIES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getApacheserver__OneOrMoreTomcatDependencies__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.modmacao.lamp.impl.TomcatImpl <em>Tomcat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.lamp.impl.TomcatImpl
		 * @see org.modmacao.lamp.impl.LampPackageImpl#getTomcat()
		 * @generated
		 */
		EClass TOMCAT = eINSTANCE.getTomcat();

		/**
		 * The meta object literal for the '<em><b>Only One My SQL Dependency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOMCAT___ONLY_ONE_MY_SQL_DEPENDENCY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTomcat__OnlyOneMySQLDependency__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.modmacao.lamp.impl.MysqlImpl <em>Mysql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.lamp.impl.MysqlImpl
		 * @see org.modmacao.lamp.impl.LampPackageImpl#getMysql()
		 * @generated
		 */
		EClass MYSQL = eINSTANCE.getMysql();

		/**
		 * The meta object literal for the '{@link org.modmacao.lamp.impl.TomcatdependencyImpl <em>Tomcatdependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.lamp.impl.TomcatdependencyImpl
		 * @see org.modmacao.lamp.impl.LampPackageImpl#getTomcatdependency()
		 * @generated
		 */
		EClass TOMCATDEPENDENCY = eINSTANCE.getTomcatdependency();

		/**
		 * The meta object literal for the '<em><b>Target Must Be Tomcat</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOMCATDEPENDENCY___TARGET_MUST_BE_TOMCAT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTomcatdependency__TargetMustBeTomcat__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.modmacao.lamp.impl.MysqldependencyImpl <em>Mysqldependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.lamp.impl.MysqldependencyImpl
		 * @see org.modmacao.lamp.impl.LampPackageImpl#getMysqldependency()
		 * @generated
		 */
		EClass MYSQLDEPENDENCY = eINSTANCE.getMysqldependency();

		/**
		 * The meta object literal for the '<em><b>Target Must Be My SQL</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MYSQLDEPENDENCY___TARGET_MUST_BE_MY_SQL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMysqldependency__TargetMustBeMySQL__DiagnosticChain_Map();

	}

} //LampPackage
