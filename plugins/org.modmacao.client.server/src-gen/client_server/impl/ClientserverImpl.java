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
import client_server.Clientserver;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import modmacao.impl.ApplicationImpl;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clientserver</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ClientserverImpl extends ApplicationImpl implements Clientserver {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientserverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serverPackage.Literals.CLIENTSERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OnlyOneServer(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv OnlyOneServer: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OneOrMoreClients(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv OneOrMoreClients: true
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
			case Client_serverPackage.CLIENTSERVER___ONLY_ONE_SERVER__DIAGNOSTICCHAIN_MAP:
				return OnlyOneServer((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Client_serverPackage.CLIENTSERVER___ONE_OR_MORE_CLIENTS__DIAGNOSTICCHAIN_MAP:
				return OneOrMoreClients((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ClientserverImpl
