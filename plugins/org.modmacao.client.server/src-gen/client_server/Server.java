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
package client_server;

import modmacao.Component;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_server.Server#getServerPort <em>Server Port</em>}</li>
 * </ul>
 *
 * @see client_server.Client_serverPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends Component, MixinBase {
	/**
	 * Returns the value of the '<em><b>Server Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Server Port</em>' attribute.
	 * @see #setServerPort(Integer)
	 * @see client_server.Client_serverPackage#getServer_ServerPort()
	 * @model dataType="modmacao.Port" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/client_server/ecore!Server!serverPort'"
	 * @generated
	 */
	Integer getServerPort();

	/**
	 * Sets the value of the '{@link client_server.Server#getServerPort <em>Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Port</em>' attribute.
	 * @see #getServerPort()
	 * @generated
	 */
	void setServerPort(Integer value);

} // Server
