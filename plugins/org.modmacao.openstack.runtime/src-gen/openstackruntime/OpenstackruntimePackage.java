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
package openstackruntime;

import org.eclipse.cmf.occi.core.OCCIPackage;

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
 * @see openstackruntime.OpenstackruntimeFactory
 * @model kind="package"
 * @generated
 */
public interface OpenstackruntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openstackruntime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.modmacao.org/openstack/runtime/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openstackruntime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenstackruntimePackage eINSTANCE = openstackruntime.impl.OpenstackruntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link openstackruntime.impl.RuntimeidImpl <em>Runtimeid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openstackruntime.impl.RuntimeidImpl
	 * @see openstackruntime.impl.OpenstackruntimePackageImpl#getRuntimeid()
	 * @generated
	 */
	int RUNTIMEID = 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIMEID__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIMEID__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIMEID__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Openstack Runtime Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIMEID__OPENSTACK_RUNTIME_ID = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Runtimeid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIMEID_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIMEID___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Runtimeid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIMEID_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link openstackruntime.impl.FloatingipImpl <em>Floatingip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openstackruntime.impl.FloatingipImpl
	 * @see openstackruntime.impl.OpenstackruntimePackageImpl#getFloatingip()
	 * @generated
	 */
	int FLOATINGIP = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATINGIP__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATINGIP__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATINGIP__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Openstack Floatingip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATINGIP__OPENSTACK_FLOATINGIP_ADDRESS = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Openstack Floatingip Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATINGIP__OPENSTACK_FLOATINGIP_POOL = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Floatingip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATINGIP_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATINGIP___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Floatingip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATINGIP_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link openstackruntime.Runtimeid <em>Runtimeid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtimeid</em>'.
	 * @see openstackruntime.Runtimeid
	 * @generated
	 */
	EClass getRuntimeid();

	/**
	 * Returns the meta object for the attribute '{@link openstackruntime.Runtimeid#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openstack Runtime Id</em>'.
	 * @see openstackruntime.Runtimeid#getOpenstackRuntimeId()
	 * @see #getRuntimeid()
	 * @generated
	 */
	EAttribute getRuntimeid_OpenstackRuntimeId();

	/**
	 * Returns the meta object for the '{@link openstackruntime.Runtimeid#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see openstackruntime.Runtimeid#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRuntimeid__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link openstackruntime.Floatingip <em>Floatingip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floatingip</em>'.
	 * @see openstackruntime.Floatingip
	 * @generated
	 */
	EClass getFloatingip();

	/**
	 * Returns the meta object for the attribute '{@link openstackruntime.Floatingip#getOpenstackFloatingipAddress <em>Openstack Floatingip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openstack Floatingip Address</em>'.
	 * @see openstackruntime.Floatingip#getOpenstackFloatingipAddress()
	 * @see #getFloatingip()
	 * @generated
	 */
	EAttribute getFloatingip_OpenstackFloatingipAddress();

	/**
	 * Returns the meta object for the attribute '{@link openstackruntime.Floatingip#getOpenstackFloatingipPool <em>Openstack Floatingip Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openstack Floatingip Pool</em>'.
	 * @see openstackruntime.Floatingip#getOpenstackFloatingipPool()
	 * @see #getFloatingip()
	 * @generated
	 */
	EAttribute getFloatingip_OpenstackFloatingipPool();

	/**
	 * Returns the meta object for the '{@link openstackruntime.Floatingip#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see openstackruntime.Floatingip#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFloatingip__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpenstackruntimeFactory getOpenstackruntimeFactory();

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
		 * The meta object literal for the '{@link openstackruntime.impl.RuntimeidImpl <em>Runtimeid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openstackruntime.impl.RuntimeidImpl
		 * @see openstackruntime.impl.OpenstackruntimePackageImpl#getRuntimeid()
		 * @generated
		 */
		EClass RUNTIMEID = eINSTANCE.getRuntimeid();

		/**
		 * The meta object literal for the '<em><b>Openstack Runtime Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIMEID__OPENSTACK_RUNTIME_ID = eINSTANCE.getRuntimeid_OpenstackRuntimeId();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUNTIMEID___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRuntimeid__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link openstackruntime.impl.FloatingipImpl <em>Floatingip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openstackruntime.impl.FloatingipImpl
		 * @see openstackruntime.impl.OpenstackruntimePackageImpl#getFloatingip()
		 * @generated
		 */
		EClass FLOATINGIP = eINSTANCE.getFloatingip();

		/**
		 * The meta object literal for the '<em><b>Openstack Floatingip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATINGIP__OPENSTACK_FLOATINGIP_ADDRESS = eINSTANCE.getFloatingip_OpenstackFloatingipAddress();

		/**
		 * The meta object literal for the '<em><b>Openstack Floatingip Pool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATINGIP__OPENSTACK_FLOATINGIP_POOL = eINSTANCE.getFloatingip_OpenstackFloatingipPool();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FLOATINGIP___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getFloatingip__AppliesConstraint__DiagnosticChain_Map();

	}

} //OpenstackruntimePackage
