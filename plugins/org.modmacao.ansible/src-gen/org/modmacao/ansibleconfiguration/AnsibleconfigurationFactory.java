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
package org.modmacao.ansibleconfiguration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.modmacao.ansibleconfiguration.AnsibleconfigurationPackage
 * @generated
 */
public interface AnsibleconfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnsibleconfigurationFactory eINSTANCE = org.modmacao.ansibleconfiguration.impl.AnsibleconfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ansibleendpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ansibleendpoint</em>'.
	 * @generated
	 */
	Ansibleendpoint createAnsibleendpoint();

	/**
	 * Returns a new object of class '<em>Ansibleconfiguration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ansibleconfiguration</em>'.
	 * @generated
	 */
	Ansibleconfiguration createAnsibleconfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnsibleconfigurationPackage getAnsibleconfigurationPackage();

} //AnsibleconfigurationFactory
