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

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floatingip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openstackruntime.Floatingip#getOpenstackFloatingipAddress <em>Openstack Floatingip Address</em>}</li>
 *   <li>{@link openstackruntime.Floatingip#getOpenstackFloatingipPool <em>Openstack Floatingip Pool</em>}</li>
 * </ul>
 *
 * @see openstackruntime.OpenstackruntimePackage#getFloatingip()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(infrastructure::Compute)'"
 * @generated
 */
public interface Floatingip extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Openstack Floatingip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Openstack Floatingip Address</em>' attribute.
	 * @see #setOpenstackFloatingipAddress(String)
	 * @see openstackruntime.OpenstackruntimePackage#getFloatingip_OpenstackFloatingipAddress()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getOpenstackFloatingipAddress();

	/**
	 * Sets the value of the '{@link openstackruntime.Floatingip#getOpenstackFloatingipAddress <em>Openstack Floatingip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openstack Floatingip Address</em>' attribute.
	 * @see #getOpenstackFloatingipAddress()
	 * @generated
	 */
	void setOpenstackFloatingipAddress(String value);

	/**
	 * Returns the value of the '<em><b>Openstack Floatingip Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Openstack Floatingip Pool</em>' attribute.
	 * @see #setOpenstackFloatingipPool(String)
	 * @see openstackruntime.OpenstackruntimePackage#getFloatingip_OpenstackFloatingipPool()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getOpenstackFloatingipPool();

	/**
	 * Sets the value of the '{@link openstackruntime.Floatingip#getOpenstackFloatingipPool <em>Openstack Floatingip Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openstack Floatingip Pool</em>' attribute.
	 * @see #getOpenstackFloatingipPool()
	 * @generated
	 */
	void setOpenstackFloatingipPool(String value);

} // Floatingip
