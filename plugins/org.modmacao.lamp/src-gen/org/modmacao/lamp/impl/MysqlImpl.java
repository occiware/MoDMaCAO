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
package org.modmacao.lamp.impl;

import modmacao.impl.ComponentImpl;

import org.eclipse.emf.ecore.EClass;

import org.modmacao.lamp.LampPackage;
import org.modmacao.lamp.Mysql;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mysql</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MysqlImpl extends ComponentImpl implements Mysql {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MysqlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LampPackage.Literals.MYSQL;
	}

} //MysqlImpl
