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

import client_server.Client;
import client_server.Client_serverPackage;

import client_server.Client_serverTables;
import client_server.util.Client_serverValidator;
import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import modmacao.impl.ComponentImpl;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ClientImpl extends ComponentImpl implements Client {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serverPackage.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OneServerDependency(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv OneServerDependency:
		 *   let severity : Integer[1] = 'Client::OneServerDependency'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclAsType(occi::Resource)
		 *         .links->select(l |
		 *           l.oclIsTypeOf(platform::Componentlink))
		 *         ->collect(l | l.parts)
		 *         ->select(mb | mb.oclIsTypeOf(Serverdependency))
		 *         ->size() = 1
		 *       in
		 *         'Client::OneServerDependency'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Client_serverTables.STR_Client_c_c_OneServerDependency);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Client_serverTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource_0 = idResolver.getClass(Client_serverTables.CLSSid_Resource, null);
				final /*@NonInvalid*/ Entity entity = this.getEntity();
				final /*@Thrown*/ Resource oclAsType = ClassUtil.nonNullState((Resource)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource_0));
				final /*@Thrown*/ List<Link> links = oclAsType.getLinks();
				final /*@Thrown*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(Client_serverTables.ORD_CLSSid_Link, links);
				/*@Thrown*/ OrderedSetValue.Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(Client_serverTables.ORD_CLSSid_Link);
				/*@NonNull*/ Iterator<Object> ITERATOR_l = BOXED_links.iterator();
				/*@Thrown*/ OrderedSetValue select_0;
				while (true) {
					if (!ITERATOR_l.hasNext()) {
						select_0 = accumulator;
						break;
					}
					/*@NonInvalid*/ Link l = (Link)ITERATOR_l.next();
					/**
					 * l.oclIsTypeOf(platform::Componentlink)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_platform_c_c_Componentlink = idResolver.getClass(Client_serverTables.CLSSid_Componentlink, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, l, TYP_platform_c_c_Componentlink).booleanValue();
					//
					if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
						accumulator.add(l);
					}
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(Client_serverTables.SEQ_CLSSid_MixinBase);
				/*@NonNull*/ Iterator<Object> ITERATOR_l_0 = select_0.iterator();
				/*@Thrown*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR_l_0.hasNext()) {
						collect = accumulator_0;
						break;
					}
					/*@NonInvalid*/ Link l_0 = (Link)ITERATOR_l_0.next();
					/**
					 * l.parts
					 */
					final /*@NonInvalid*/ List<MixinBase> parts = l_0.getParts();
					final /*@NonInvalid*/ OrderedSetValue BOXED_parts = idResolver.createOrderedSetOfAll(Client_serverTables.ORD_CLSSid_MixinBase, parts);
					//
					for (Object value : BOXED_parts.flatten().getElements()) {
						accumulator_0.add(value);
					}
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(Client_serverTables.SEQ_CLSSid_MixinBase);
				/*@NonNull*/ Iterator<Object> ITERATOR_mb = collect.iterator();
				/*@Thrown*/ SequenceValue select;
				while (true) {
					if (!ITERATOR_mb.hasNext()) {
						select = accumulator_1;
						break;
					}
					/*@NonInvalid*/ MixinBase mb = (MixinBase)ITERATOR_mb.next();
					/**
					 * mb.oclIsTypeOf(Serverdependency)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_client_server_c_c_Serverdependency = idResolver.getClass(Client_serverTables.CLSSid_Serverdependency, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, mb, TYP_client_server_c_c_Serverdependency).booleanValue();
					//
					if (oclIsTypeOf_0 == ValueUtil.TRUE_VALUE) {
						accumulator_1.add(mb);
					}
				}
				final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@Thrown*/ boolean result = size.equals(Client_serverTables.INT_1);
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, Client_serverTables.STR_Client_c_c_OneServerDependency, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Client_serverTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
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
			case Client_serverPackage.CLIENT___ONE_SERVER_DEPENDENCY__DIAGNOSTICCHAIN_MAP:
				return OneServerDependency((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ClientImpl
