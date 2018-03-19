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

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import modmacao.impl.ExecutiondependencyImpl;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.modmacao.mongodb.Configserverdependency;
import org.modmacao.mongodb.MongodbPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configserverdependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConfigserverdependencyImpl extends ExecutiondependencyImpl implements Configserverdependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigserverdependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MongodbPackage.Literals.CONFIGSERVERDEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TargetMustBeConfigServer(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv TargetMustBeConfigServer: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MongodbPackage.CONFIGSERVERDEPENDENCY___TARGET_MUST_BE_CONFIG_SERVER__DIAGNOSTICCHAIN_MAP:
				return TargetMustBeConfigServer((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConfigserverdependencyImpl
