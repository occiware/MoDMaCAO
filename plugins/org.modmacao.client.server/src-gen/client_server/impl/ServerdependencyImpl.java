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
package client_server.impl;

import client_server.Client_serverPackage;
import client_server.Serverdependency;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import modmacao.impl.ExecutiondependencyImpl;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serverdependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServerdependencyImpl extends ExecutiondependencyImpl implements Serverdependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerdependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serverPackage.Literals.SERVERDEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SourceMustBeClient(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv SourceMustBeClient: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TargetMustBeServer(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv TargetMustBeServer: true
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
			case Client_serverPackage.SERVERDEPENDENCY___SOURCE_MUST_BE_CLIENT__DIAGNOSTICCHAIN_MAP:
				return SourceMustBeClient((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Client_serverPackage.SERVERDEPENDENCY___TARGET_MUST_BE_SERVER__DIAGNOSTICCHAIN_MAP:
				return TargetMustBeServer((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServerdependencyImpl
