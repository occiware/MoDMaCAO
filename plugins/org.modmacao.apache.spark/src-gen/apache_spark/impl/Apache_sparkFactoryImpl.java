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

import apache_spark.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Apache_sparkFactoryImpl extends EFactoryImpl implements Apache_sparkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Apache_sparkFactory init() {
		try {
			Apache_sparkFactory theApache_sparkFactory = (Apache_sparkFactory)EPackage.Registry.INSTANCE.getEFactory(Apache_sparkPackage.eNS_URI);
			if (theApache_sparkFactory != null) {
				return theApache_sparkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Apache_sparkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apache_sparkFactoryImpl() {
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
			case Apache_sparkPackage.MASTER: return createMaster();
			case Apache_sparkPackage.WORKER: return createWorker();
			case Apache_sparkPackage.APACHESPARKCOMPONENT: return createApachesparkcomponent();
			case Apache_sparkPackage.APACHESPARKCLUSTER: return createApachesparkcluster();
			case Apache_sparkPackage.MASTERDEPENDENCY: return createMasterdependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Master createMaster() {
		MasterImpl master = new MasterImpl();
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Worker createWorker() {
		WorkerImpl worker = new WorkerImpl();
		return worker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apachesparkcomponent createApachesparkcomponent() {
		ApachesparkcomponentImpl apachesparkcomponent = new ApachesparkcomponentImpl();
		return apachesparkcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apachesparkcluster createApachesparkcluster() {
		ApachesparkclusterImpl apachesparkcluster = new ApachesparkclusterImpl();
		return apachesparkcluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Masterdependency createMasterdependency() {
		MasterdependencyImpl masterdependency = new MasterdependencyImpl();
		return masterdependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apache_sparkPackage getApache_sparkPackage() {
		return (Apache_sparkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Apache_sparkPackage getPackage() {
		return Apache_sparkPackage.eINSTANCE;
	}

} //Apache_sparkFactoryImpl
