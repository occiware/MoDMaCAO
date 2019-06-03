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
package org.modmacao.mongodb.impl;

import org.eclipse.emf.ecore.EClass;

import org.modmacao.mongodb.MongodbPackage;
import org.modmacao.mongodb.Shard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shard</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ShardImpl extends ReplicablemongodbcomponentImpl implements Shard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MongodbPackage.Literals.SHARD;
	}

} //ShardImpl
