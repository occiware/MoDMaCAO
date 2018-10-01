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

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import modmacao.impl.ExecutiondependencyImpl;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.modmacao.lamp.LampPackage;
import org.modmacao.lamp.Tomcatdependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tomcatdependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TomcatdependencyImpl extends ExecutiondependencyImpl implements Tomcatdependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TomcatdependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LampPackage.Literals.TOMCATDEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TargetMustBeTomcat(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv TargetMustBeTomcat: true
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
			case LampPackage.TOMCATDEPENDENCY___TARGET_MUST_BE_TOMCAT__DIAGNOSTICCHAIN_MAP:
				return TargetMustBeTomcat((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TomcatdependencyImpl
