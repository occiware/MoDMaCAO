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
package openstackruntime.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import openstackruntime.Floatingip;
import openstackruntime.OpenstackruntimeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Floatingip</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FloatingipTest extends TestCase {

	/**
	 * The fixture for this Floatingip test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Floatingip fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FloatingipTest.class);
	}

	/**
	 * Constructs a new Floatingip test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingipTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Floatingip test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Floatingip fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Floatingip test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Floatingip getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OpenstackruntimeFactory.eINSTANCE.createFloatingip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FloatingipTest
