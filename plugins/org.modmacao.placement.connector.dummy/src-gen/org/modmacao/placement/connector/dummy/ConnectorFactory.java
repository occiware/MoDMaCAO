/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Wed Aug 22 02:14:11 CEST 2018 from platform:/resource/org.modmacao.placement/model/placement.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.modmacao.placement.connector.dummy;

/**
 * Connector EFactory for the OCCI extension:
 * - name: placement
 * - scheme: http://schemas.modmacao.org/placement#
 */
public class ConnectorFactory extends org.modmacao.placement.impl.PlacementFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.modmacao.org/placement#
	 * - term: placementlink
	 * - title: 
	 */
	@Override
	public org.modmacao.placement.Placementlink createPlacementlink() {
		return new PlacementlinkConnector();
	}

}
