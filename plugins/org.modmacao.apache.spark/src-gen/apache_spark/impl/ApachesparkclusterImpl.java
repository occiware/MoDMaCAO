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
package apache_spark.impl;

import apache_spark.Apache_sparkPackage;
import apache_spark.Apachesparkcluster;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import modmacao.impl.ClusterImpl;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apachesparkcluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApachesparkclusterImpl extends ClusterImpl implements Apachesparkcluster {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApachesparkclusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Apache_sparkPackage.Literals.APACHESPARKCLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OnlyOneMaster(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv OnlyOneMaster: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OneOrMoreWorkers(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv OneOrMoreWorkers: true
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
			case Apache_sparkPackage.APACHESPARKCLUSTER___ONLY_ONE_MASTER__DIAGNOSTICCHAIN_MAP:
				return OnlyOneMaster((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Apache_sparkPackage.APACHESPARKCLUSTER___ONE_OR_MORE_WORKERS__DIAGNOSTICCHAIN_MAP:
				return OneOrMoreWorkers((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApachesparkclusterImpl
