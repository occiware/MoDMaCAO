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
package org.modmacao.ansibleconfiguration;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.modmacao.ansibleconfiguration.AnsibleconfigurationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 *        annotation="http://www.eclipse.org/OCL/Import occi='http://schemas.ogf.org/occi/core/ecore' infrastructure='http://schemas.ogf.org/occi/infrastructure/ecore'"
 * @generated
 */
public interface AnsibleconfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ansibleconfiguration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.modmacao.org/occi/ansible/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ansibleconfiguration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnsibleconfigurationPackage eINSTANCE = org.modmacao.ansibleconfiguration.impl.AnsibleconfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modmacao.ansibleconfiguration.impl.AnsibleendpointImpl <em>Ansibleendpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.ansibleconfiguration.impl.AnsibleendpointImpl
	 * @see org.modmacao.ansibleconfiguration.impl.AnsibleconfigurationPackageImpl#getAnsibleendpoint()
	 * @generated
	 */
	int ANSIBLEENDPOINT = 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEENDPOINT__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEENDPOINT__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEENDPOINT__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Ansible Remoteuser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEENDPOINT__ANSIBLE_REMOTEUSER = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ansible Privatekey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEENDPOINT__ANSIBLE_PRIVATEKEY = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ansibleendpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEENDPOINT_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ansibleendpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEENDPOINT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.modmacao.ansibleconfiguration.Ansibleendpoint <em>Ansibleendpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ansibleendpoint</em>'.
	 * @see org.modmacao.ansibleconfiguration.Ansibleendpoint
	 * @generated
	 */
	EClass getAnsibleendpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.modmacao.ansibleconfiguration.Ansibleendpoint#getAnsibleRemoteuser <em>Ansible Remoteuser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ansible Remoteuser</em>'.
	 * @see org.modmacao.ansibleconfiguration.Ansibleendpoint#getAnsibleRemoteuser()
	 * @see #getAnsibleendpoint()
	 * @generated
	 */
	EAttribute getAnsibleendpoint_AnsibleRemoteuser();

	/**
	 * Returns the meta object for the attribute '{@link org.modmacao.ansibleconfiguration.Ansibleendpoint#getAnsiblePrivatekey <em>Ansible Privatekey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ansible Privatekey</em>'.
	 * @see org.modmacao.ansibleconfiguration.Ansibleendpoint#getAnsiblePrivatekey()
	 * @see #getAnsibleendpoint()
	 * @generated
	 */
	EAttribute getAnsibleendpoint_AnsiblePrivatekey();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnsibleconfigurationFactory getAnsibleconfigurationFactory();

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
		 * The meta object literal for the '{@link org.modmacao.ansibleconfiguration.impl.AnsibleendpointImpl <em>Ansibleendpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.ansibleconfiguration.impl.AnsibleendpointImpl
		 * @see org.modmacao.ansibleconfiguration.impl.AnsibleconfigurationPackageImpl#getAnsibleendpoint()
		 * @generated
		 */
		EClass ANSIBLEENDPOINT = eINSTANCE.getAnsibleendpoint();

		/**
		 * The meta object literal for the '<em><b>Ansible Remoteuser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSIBLEENDPOINT__ANSIBLE_REMOTEUSER = eINSTANCE.getAnsibleendpoint_AnsibleRemoteuser();

		/**
		 * The meta object literal for the '<em><b>Ansible Privatekey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSIBLEENDPOINT__ANSIBLE_PRIVATEKEY = eINSTANCE.getAnsibleendpoint_AnsiblePrivatekey();

	}

} //AnsibleconfigurationPackage
