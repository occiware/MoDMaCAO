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

import org.eclipse.cmf.occi.infrastructure.Os_tpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openstackruntime.Image#getOpenstackImageId <em>Openstack Image Id</em>}</li>
 * </ul>
 *
 * @see openstackruntime.OpenstackruntimePackage#getImage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(infrastructure::Compute)'"
 * @generated
 */
public interface Image extends Os_tpl, MixinBase {
	/**
	 * Returns the value of the '<em><b>Openstack Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Openstack Image Id</em>' attribute.
	 * @see #setOpenstackImageId(String)
	 * @see openstackruntime.OpenstackruntimePackage#getImage_OpenstackImageId()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getOpenstackImageId();

	/**
	 * Sets the value of the '{@link openstackruntime.Image#getOpenstackImageId <em>Openstack Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openstack Image Id</em>' attribute.
	 * @see #getOpenstackImageId()
	 * @generated
	 */
	void setOpenstackImageId(String value);

} // Image
