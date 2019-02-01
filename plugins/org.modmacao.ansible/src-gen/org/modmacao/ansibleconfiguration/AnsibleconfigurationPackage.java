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

import modmacao.ModmacaoPackage;

import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.modmacao.ansibleconfiguration.AnsibleconfigurationFactory
 * @model kind="package"
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
	 * The number of structural features of the '<em>Ansibleendpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEENDPOINT_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEENDPOINT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ansibleendpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLEENDPOINT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modmacao.ansibleconfiguration.impl.AnsibleconfigurationImpl <em>Ansibleconfiguration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.ansibleconfiguration.impl.AnsibleconfigurationImpl
	 * @see org.modmacao.ansibleconfiguration.impl.AnsibleconfigurationPackageImpl#getAnsibleconfiguration()
	 * @generated
	 */
	int ANSIBLECONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLECONFIGURATION__MIXIN = ModmacaoPackage.COMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLECONFIGURATION__ENTITY = ModmacaoPackage.COMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLECONFIGURATION__ATTRIBUTES = ModmacaoPackage.COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLECONFIGURATION__MODMACAO_COMPONENT_VERSION = ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Ansible Privatekey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLECONFIGURATION__ANSIBLE_PRIVATEKEY = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ansible Remoteuser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLECONFIGURATION__ANSIBLE_REMOTEUSER = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ansibleconfiguration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLECONFIGURATION_FEATURE_COUNT = ModmacaoPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ansibleconfiguration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSIBLECONFIGURATION_OPERATION_COUNT = ModmacaoPackage.COMPONENT_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the '{@link org.modmacao.ansibleconfiguration.Ansibleendpoint#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.modmacao.ansibleconfiguration.Ansibleendpoint#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAnsibleendpoint__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.modmacao.ansibleconfiguration.Ansibleconfiguration <em>Ansibleconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ansibleconfiguration</em>'.
	 * @see org.modmacao.ansibleconfiguration.Ansibleconfiguration
	 * @generated
	 */
	EClass getAnsibleconfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.modmacao.ansibleconfiguration.Ansibleconfiguration#getAnsiblePrivatekey <em>Ansible Privatekey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ansible Privatekey</em>'.
	 * @see org.modmacao.ansibleconfiguration.Ansibleconfiguration#getAnsiblePrivatekey()
	 * @see #getAnsibleconfiguration()
	 * @generated
	 */
	EAttribute getAnsibleconfiguration_AnsiblePrivatekey();

	/**
	 * Returns the meta object for the attribute '{@link org.modmacao.ansibleconfiguration.Ansibleconfiguration#getAnsibleRemoteuser <em>Ansible Remoteuser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ansible Remoteuser</em>'.
	 * @see org.modmacao.ansibleconfiguration.Ansibleconfiguration#getAnsibleRemoteuser()
	 * @see #getAnsibleconfiguration()
	 * @generated
	 */
	EAttribute getAnsibleconfiguration_AnsibleRemoteuser();

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
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANSIBLEENDPOINT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAnsibleendpoint__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.modmacao.ansibleconfiguration.impl.AnsibleconfigurationImpl <em>Ansibleconfiguration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.ansibleconfiguration.impl.AnsibleconfigurationImpl
		 * @see org.modmacao.ansibleconfiguration.impl.AnsibleconfigurationPackageImpl#getAnsibleconfiguration()
		 * @generated
		 */
		EClass ANSIBLECONFIGURATION = eINSTANCE.getAnsibleconfiguration();

		/**
		 * The meta object literal for the '<em><b>Ansible Privatekey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSIBLECONFIGURATION__ANSIBLE_PRIVATEKEY = eINSTANCE.getAnsibleconfiguration_AnsiblePrivatekey();

		/**
		 * The meta object literal for the '<em><b>Ansible Remoteuser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSIBLECONFIGURATION__ANSIBLE_REMOTEUSER = eINSTANCE.getAnsibleconfiguration_AnsibleRemoteuser();

	}

} //AnsibleconfigurationPackage
