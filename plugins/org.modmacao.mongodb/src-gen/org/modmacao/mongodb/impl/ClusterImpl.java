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

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;

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
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.modmacao.mongodb.Cluster;
import org.modmacao.mongodb.MongodbPackage;
import org.modmacao.mongodb.MongodbTables;

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
		 *
		 * inv OneOrMoreConfigServers:
		 *   let severity : Integer[1] = 'Cluster::OneOrMoreConfigServers'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclAsType(occi::Resource)
		 *         .links->collect(l | l.target)
		 *         ->collect(c | c.parts)
		 *         ->select(mb | mb.oclIsTypeOf(Configserver))
		 *         ->size() >= 1
		 *       in
		 *         'Cluster::OneOrMoreConfigServers'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MongodbTables.STR_Cluster_c_c_OneOrMoreConfigServers);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MongodbTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource_0 = idResolver.getClass(MongodbTables.CLSSid_Resource, null);
				final /*@NonInvalid*/ Entity entity = this.getEntity();
				final /*@Thrown*/ Resource oclAsType = ClassUtil.nonNullState((Resource)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource_0));
				final /*@Thrown*/ List<Link> links = oclAsType.getLinks();
				final /*@Thrown*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(MongodbTables.ORD_CLSSid_Link, links);
				/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(MongodbTables.SEQ_CLSSid_Resource);
				/*@NonNull*/ Iterator<Object> ITERATOR_l = BOXED_links.iterator();
				/*@Thrown*/ SequenceValue collect_0;
				while (true) {
					if (!ITERATOR_l.hasNext()) {
						collect_0 = accumulator;
						break;
					}
					/*@NonInvalid*/ Link l = (Link)ITERATOR_l.next();
					/**
					 * l.target
					 */
					final /*@NonInvalid*/ Resource target = l.getTarget();
					//
					accumulator.add(target);
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(MongodbTables.SEQ_CLSSid_MixinBase);
				/*@NonNull*/ Iterator<Object> ITERATOR_c = collect_0.iterator();
				/*@Thrown*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						collect = accumulator_0;
						break;
					}
					/*@NonInvalid*/ Resource c = (Resource)ITERATOR_c.next();
					/**
					 * c.parts
					 */
					final /*@NonInvalid*/ List<MixinBase> parts = c.getParts();
					final /*@NonInvalid*/ OrderedSetValue BOXED_parts = idResolver.createOrderedSetOfAll(MongodbTables.ORD_CLSSid_MixinBase, parts);
					//
					for (Object value : BOXED_parts.flatten().getElements()) {
						accumulator_0.add(value);
					}
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(MongodbTables.SEQ_CLSSid_MixinBase);
				/*@NonNull*/ Iterator<Object> ITERATOR_mb = collect.iterator();
				/*@Thrown*/ SequenceValue select;
				while (true) {
					if (!ITERATOR_mb.hasNext()) {
						select = accumulator_1;
						break;
					}
					/*@NonInvalid*/ MixinBase mb = (MixinBase)ITERATOR_mb.next();
					/**
					 * mb.oclIsTypeOf(Configserver)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_mongodb_c_c_Configserver = idResolver.getClass(MongodbTables.CLSSid_Configserver, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, mb, TYP_mongodb_c_c_Configserver).booleanValue();
					//
					if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
						accumulator_1.add(mb);
					}
				}
				final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@Thrown*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, MongodbTables.INT_1).booleanValue();
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, MongodbTables.STR_Cluster_c_c_OneOrMoreConfigServers, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, MongodbTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OneOrMoreRouters(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv OneOrMoreRouters:
		 *   let severity : Integer[1] = 'Cluster::OneOrMoreRouters'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclAsType(occi::Resource)
		 *         .links->collect(l | l.target)
		 *         ->collect(c | c.parts)
		 *         ->select(mb | mb.oclIsTypeOf(Router))
		 *         ->size() >= 1
		 *       in
		 *         'Cluster::OneOrMoreRouters'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MongodbTables.STR_Cluster_c_c_OneOrMoreRouters);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MongodbTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource = idResolver.getClass(MongodbTables.CLSSid_Resource, null);
				final /*@NonInvalid*/ Entity entity = this.getEntity();
				final /*@Thrown*/ Resource oclAsType = ClassUtil.nonNullState((Resource)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource));
				final /*@Thrown*/ List<Link> links = oclAsType.getLinks();
				final /*@Thrown*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(MongodbTables.ORD_CLSSid_Link, links);
				/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(MongodbTables.SEQ_CLSSid_Resource);
				/*@NonNull*/ Iterator<Object> ITERATOR_l = BOXED_links.iterator();
				/*@Thrown*/ SequenceValue collect_0;
				while (true) {
					if (!ITERATOR_l.hasNext()) {
						collect_0 = accumulator;
						break;
					}
					/*@NonInvalid*/ Link l = (Link)ITERATOR_l.next();
					/**
					 * l.target
					 */
					final /*@NonInvalid*/ Resource target = l.getTarget();
					//
					accumulator.add(target);
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(MongodbTables.SEQ_CLSSid_MixinBase);
				/*@NonNull*/ Iterator<Object> ITERATOR_c = collect_0.iterator();
				/*@Thrown*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						collect = accumulator_0;
						break;
					}
					/*@NonInvalid*/ Resource c = (Resource)ITERATOR_c.next();
					/**
					 * c.parts
					 */
					final /*@NonInvalid*/ List<MixinBase> parts = c.getParts();
					final /*@NonInvalid*/ OrderedSetValue BOXED_parts = idResolver.createOrderedSetOfAll(MongodbTables.ORD_CLSSid_MixinBase, parts);
					//
					for (Object value : BOXED_parts.flatten().getElements()) {
						accumulator_0.add(value);
					}
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(MongodbTables.SEQ_CLSSid_MixinBase);
				/*@NonNull*/ Iterator<Object> ITERATOR_mb = collect.iterator();
				/*@Thrown*/ SequenceValue select;
				while (true) {
					if (!ITERATOR_mb.hasNext()) {
						select = accumulator_1;
						break;
					}
					/*@NonInvalid*/ MixinBase mb = (MixinBase)ITERATOR_mb.next();
					/**
					 * mb.oclIsTypeOf(Router)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_mongodb_c_c_Router = idResolver.getClass(MongodbTables.CLSSid_Router, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, mb, TYP_mongodb_c_c_Router).booleanValue();
					//
					if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
						accumulator_1.add(mb);
					}
				}
				final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@Thrown*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, MongodbTables.INT_1).booleanValue();
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, MongodbTables.STR_Cluster_c_c_OneOrMoreRouters, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, MongodbTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OneOrMoreShards(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv OneOrMoreShards:
		 *   let severity : Integer[1] = 'Cluster::OneOrMoreShards'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclAsType(occi::Resource)
		 *         .links->collect(l | l.target)
		 *         ->collect(c | c.parts)
		 *         ->select(mb | mb.oclIsTypeOf(Shard))
		 *         ->size() >= 1
		 *       in
		 *         'Cluster::OneOrMoreShards'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MongodbTables.STR_Cluster_c_c_OneOrMoreShards);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MongodbTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource_0 = idResolver.getClass(MongodbTables.CLSSid_Resource, null);
				final /*@NonInvalid*/ Entity entity = this.getEntity();
				final /*@Thrown*/ Resource oclAsType = ClassUtil.nonNullState((Resource)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource_0));
				final /*@Thrown*/ List<Link> links = oclAsType.getLinks();
				final /*@Thrown*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(MongodbTables.ORD_CLSSid_Link, links);
				/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(MongodbTables.SEQ_CLSSid_Resource);
				/*@NonNull*/ Iterator<Object> ITERATOR_l = BOXED_links.iterator();
				/*@Thrown*/ SequenceValue collect_0;
				while (true) {
					if (!ITERATOR_l.hasNext()) {
						collect_0 = accumulator;
						break;
					}
					/*@NonInvalid*/ Link l = (Link)ITERATOR_l.next();
					/**
					 * l.target
					 */
					final /*@NonInvalid*/ Resource target = l.getTarget();
					//
					accumulator.add(target);
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(MongodbTables.SEQ_CLSSid_MixinBase);
				/*@NonNull*/ Iterator<Object> ITERATOR_c = collect_0.iterator();
				/*@Thrown*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						collect = accumulator_0;
						break;
					}
					/*@NonInvalid*/ Resource c = (Resource)ITERATOR_c.next();
					/**
					 * c.parts
					 */
					final /*@NonInvalid*/ List<MixinBase> parts = c.getParts();
					final /*@NonInvalid*/ OrderedSetValue BOXED_parts = idResolver.createOrderedSetOfAll(MongodbTables.ORD_CLSSid_MixinBase, parts);
					//
					for (Object value : BOXED_parts.flatten().getElements()) {
						accumulator_0.add(value);
					}
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(MongodbTables.SEQ_CLSSid_MixinBase);
				/*@NonNull*/ Iterator<Object> ITERATOR_mb = collect.iterator();
				/*@Thrown*/ SequenceValue select;
				while (true) {
					if (!ITERATOR_mb.hasNext()) {
						select = accumulator_1;
						break;
					}
					/*@NonInvalid*/ MixinBase mb = (MixinBase)ITERATOR_mb.next();
					/**
					 * mb.oclIsTypeOf(Shard)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_mongodb_c_c_Shard = idResolver.getClass(MongodbTables.CLSSid_Shard, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, mb, TYP_mongodb_c_c_Shard).booleanValue();
					//
					if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
						accumulator_1.add(mb);
					}
				}
				final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@Thrown*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, MongodbTables.INT_1).booleanValue();
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, MongodbTables.STR_Cluster_c_c_OneOrMoreShards, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, MongodbTables.INT_0).booleanValue();
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
