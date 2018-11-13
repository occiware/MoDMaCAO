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
import apache_spark.Apache_sparkTables;
import apache_spark.Apachesparkcluster;

import apache_spark.util.Apache_sparkValidator;
import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import modmacao.impl.ClusterImpl;

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
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
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
		 *
		 * inv OnlyOneMaster:
		 *   let
		 *     severity : Integer[1] = 'Apachesparkcluster::OnlyOneMaster'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclAsType(occi::Resource)
		 *         .links->collect(l | l.target)
		 *         ->collect(c | c.parts)
		 *         ->select(mb | mb.oclIsTypeOf(Master))
		 *         ->size() = 1
		 *       in
		 *         'Apachesparkcluster::OnlyOneMaster'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Apache_sparkTables.STR_Apachesparkcluster_c_c_OnlyOneMaster);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Apache_sparkTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource_0 = idResolver.getClass(Apache_sparkTables.CLSSid_Resource, null);
				final /*@NonInvalid*/ Entity entity = this.getEntity();
				final /*@Thrown*/ Resource oclAsType = ClassUtil.nonNullState((Resource)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource_0));
				final /*@Thrown*/ List<Link> links = oclAsType.getLinks();
				final /*@Thrown*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(Apache_sparkTables.ORD_CLSSid_Link, links);
				/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(Apache_sparkTables.SEQ_CLSSid_Resource);
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
				/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(Apache_sparkTables.SEQ_CLSSid_MixinBase);
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
					final /*@NonInvalid*/ OrderedSetValue BOXED_parts = idResolver.createOrderedSetOfAll(Apache_sparkTables.ORD_CLSSid_MixinBase, parts);
					//
					for (Object value : BOXED_parts.flatten().getElements()) {
						accumulator_0.add(value);
					}
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(Apache_sparkTables.SEQ_CLSSid_MixinBase);
				/*@NonNull*/ Iterator<Object> ITERATOR_mb = collect.iterator();
				/*@Thrown*/ SequenceValue select;
				while (true) {
					if (!ITERATOR_mb.hasNext()) {
						select = accumulator_1;
						break;
					}
					/*@NonInvalid*/ MixinBase mb = (MixinBase)ITERATOR_mb.next();
					/**
					 * mb.oclIsTypeOf(Master)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_apache_spark_c_c_Master = idResolver.getClass(Apache_sparkTables.CLSSid_Master, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, mb, TYP_apache_spark_c_c_Master).booleanValue();
					//
					if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
						accumulator_1.add(mb);
					}
				}
				final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@Thrown*/ boolean result = size.equals(Apache_sparkTables.INT_1);
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, Apache_sparkTables.STR_Apachesparkcluster_c_c_OnlyOneMaster, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Apache_sparkTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OneOrMoreWorkers(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv OneOrMoreWorkers:
		 *   let
		 *     severity : Integer[1] = 'Apachesparkcluster::OneOrMoreWorkers'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclAsType(occi::Resource)
		 *         .links->collect(l | l.target)
		 *         ->collect(c | c.parts)
		 *         ->select(mb | mb.oclIsTypeOf(Worker))
		 *         ->size() >= 1
		 *       in
		 *         'Apachesparkcluster::OneOrMoreWorkers'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Apache_sparkTables.STR_Apachesparkcluster_c_c_OneOrMoreWorkers);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Apache_sparkTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource_0 = idResolver.getClass(Apache_sparkTables.CLSSid_Resource, null);
				final /*@NonInvalid*/ Entity entity = this.getEntity();
				final /*@Thrown*/ Resource oclAsType = ClassUtil.nonNullState((Resource)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource_0));
				final /*@Thrown*/ List<Link> links = oclAsType.getLinks();
				final /*@Thrown*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(Apache_sparkTables.ORD_CLSSid_Link, links);
				/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(Apache_sparkTables.SEQ_CLSSid_Resource);
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
				/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(Apache_sparkTables.SEQ_CLSSid_MixinBase);
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
					final /*@NonInvalid*/ OrderedSetValue BOXED_parts = idResolver.createOrderedSetOfAll(Apache_sparkTables.ORD_CLSSid_MixinBase, parts);
					//
					for (Object value : BOXED_parts.flatten().getElements()) {
						accumulator_0.add(value);
					}
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(Apache_sparkTables.SEQ_CLSSid_MixinBase);
				/*@NonNull*/ Iterator<Object> ITERATOR_mb = collect.iterator();
				/*@Thrown*/ SequenceValue select;
				while (true) {
					if (!ITERATOR_mb.hasNext()) {
						select = accumulator_1;
						break;
					}
					/*@NonInvalid*/ MixinBase mb = (MixinBase)ITERATOR_mb.next();
					/**
					 * mb.oclIsTypeOf(Worker)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_apache_spark_c_c_Worker = idResolver.getClass(Apache_sparkTables.CLSSid_Worker, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, mb, TYP_apache_spark_c_c_Worker).booleanValue();
					//
					if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
						accumulator_1.add(mb);
					}
				}
				final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@Thrown*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, Apache_sparkTables.INT_1).booleanValue();
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, Apache_sparkTables.STR_Apachesparkcluster_c_c_OneOrMoreWorkers, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Apache_sparkTables.INT_0).booleanValue();
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
			case Apache_sparkPackage.APACHESPARKCLUSTER___ONLY_ONE_MASTER__DIAGNOSTICCHAIN_MAP:
				return OnlyOneMaster((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Apache_sparkPackage.APACHESPARKCLUSTER___ONE_OR_MORE_WORKERS__DIAGNOSTICCHAIN_MAP:
				return OneOrMoreWorkers((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApachesparkclusterImpl
