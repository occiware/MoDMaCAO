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

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.modmacao.mongodb.Cluster;
import org.modmacao.mongodb.MongodbPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ClusterImpl extends modmacao.impl.ClusterImpl implements Cluster {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MongodbPackage.Literals.CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OneOrMoreConfigServers(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv OneOrMoreConfigServers: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OneOrMoreRouters(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv OneOrMoreRouters: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OneOrMoreShards(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv OneOrMoreShards: true
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
			case MongodbPackage.CLUSTER___ONE_OR_MORE_CONFIG_SERVERS__DIAGNOSTICCHAIN_MAP:
				return OneOrMoreConfigServers((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MongodbPackage.CLUSTER___ONE_OR_MORE_ROUTERS__DIAGNOSTICCHAIN_MAP:
				return OneOrMoreRouters((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MongodbPackage.CLUSTER___ONE_OR_MORE_SHARDS__DIAGNOSTICCHAIN_MAP:
				return OneOrMoreShards((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ClusterImpl
