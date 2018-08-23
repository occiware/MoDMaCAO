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
package org.modmacao.ansibleconfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.modmacao.ansibleconfiguration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnsibleconfigurationFactoryImpl extends EFactoryImpl implements AnsibleconfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnsibleconfigurationFactory init() {
		try {
			AnsibleconfigurationFactory theAnsibleconfigurationFactory = (AnsibleconfigurationFactory)EPackage.Registry.INSTANCE.getEFactory(AnsibleconfigurationPackage.eNS_URI);
			if (theAnsibleconfigurationFactory != null) {
				return theAnsibleconfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnsibleconfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnsibleconfigurationFactoryImpl() {
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
			case AnsibleconfigurationPackage.ANSIBLEENDPOINT: return createAnsibleendpoint();
			case AnsibleconfigurationPackage.ANSIBLECONFIGURATION: return createAnsibleconfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ansibleendpoint createAnsibleendpoint() {
		AnsibleendpointImpl ansibleendpoint = new AnsibleendpointImpl();
		return ansibleendpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ansibleconfiguration createAnsibleconfiguration() {
		AnsibleconfigurationImpl ansibleconfiguration = new AnsibleconfigurationImpl();
		return ansibleconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnsibleconfigurationPackage getAnsibleconfigurationPackage() {
		return (AnsibleconfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnsibleconfigurationPackage getPackage() {
		return AnsibleconfigurationPackage.eINSTANCE;
	}

} //AnsibleconfigurationFactoryImpl
