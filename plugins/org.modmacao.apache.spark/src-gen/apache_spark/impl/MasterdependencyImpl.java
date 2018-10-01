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
import apache_spark.Masterdependency;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import modmacao.impl.ExecutiondependencyImpl;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Masterdependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MasterdependencyImpl extends ExecutiondependencyImpl implements Masterdependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasterdependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Apache_sparkPackage.Literals.MASTERDEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TargetMustBeMaster(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv TargetMustBeMaster: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SourceMustBeWorker(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv SourceMustBeWorker: true
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
			case Apache_sparkPackage.MASTERDEPENDENCY___TARGET_MUST_BE_MASTER__DIAGNOSTICCHAIN_MAP:
				return TargetMustBeMaster((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Apache_sparkPackage.MASTERDEPENDENCY___SOURCE_MUST_BE_WORKER__DIAGNOSTICCHAIN_MAP:
				return SourceMustBeWorker((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MasterdependencyImpl
