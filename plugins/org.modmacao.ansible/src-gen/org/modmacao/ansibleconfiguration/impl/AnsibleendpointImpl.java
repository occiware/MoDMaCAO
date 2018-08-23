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

import org.eclipse.cmf.occi.infrastructure.impl.IpnetworkinterfaceImpl;

import org.eclipse.emf.ecore.EClass;

import org.modmacao.ansibleconfiguration.AnsibleconfigurationPackage;
import org.modmacao.ansibleconfiguration.Ansibleendpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ansibleendpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AnsibleendpointImpl extends IpnetworkinterfaceImpl implements Ansibleendpoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnsibleendpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnsibleconfigurationPackage.Literals.ANSIBLEENDPOINT;
	}

} //AnsibleendpointImpl
