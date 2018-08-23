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

import modmacao.Component;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ansibleconfiguration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modmacao.ansibleconfiguration.Ansibleconfiguration#getAnsiblePrivatekey <em>Ansible Privatekey</em>}</li>
 *   <li>{@link org.modmacao.ansibleconfiguration.Ansibleconfiguration#getAnsibleRemoteuser <em>Ansible Remoteuser</em>}</li>
 * </ul>
 *
 * @see org.modmacao.ansibleconfiguration.AnsibleconfigurationPackage#getAnsibleconfiguration()
 * @model
 * @generated
 */
public interface Ansibleconfiguration extends Component, MixinBase {
	/**
	 * Returns the value of the '<em><b>Ansible Privatekey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ansible Privatekey</em>' attribute.
	 * @see #setAnsiblePrivatekey(String)
	 * @see org.modmacao.ansibleconfiguration.AnsibleconfigurationPackage#getAnsibleconfiguration_AnsiblePrivatekey()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/occi/ansible/ecore!Ansibleconfiguration!ansiblePrivatekey'"
	 * @generated
	 */
	String getAnsiblePrivatekey();

	/**
	 * Sets the value of the '{@link org.modmacao.ansibleconfiguration.Ansibleconfiguration#getAnsiblePrivatekey <em>Ansible Privatekey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ansible Privatekey</em>' attribute.
	 * @see #getAnsiblePrivatekey()
	 * @generated
	 */
	void setAnsiblePrivatekey(String value);

	/**
	 * Returns the value of the '<em><b>Ansible Remoteuser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ansible Remoteuser</em>' attribute.
	 * @see #setAnsibleRemoteuser(String)
	 * @see org.modmacao.ansibleconfiguration.AnsibleconfigurationPackage#getAnsibleconfiguration_AnsibleRemoteuser()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/occi/ansible/ecore!Ansibleconfiguration!ansibleRemoteuser'"
	 * @generated
	 */
	String getAnsibleRemoteuser();

	/**
	 * Sets the value of the '{@link org.modmacao.ansibleconfiguration.Ansibleconfiguration#getAnsibleRemoteuser <em>Ansible Remoteuser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ansible Remoteuser</em>' attribute.
	 * @see #getAnsibleRemoteuser()
	 * @generated
	 */
	void setAnsibleRemoteuser(String value);

} // Ansibleconfiguration
