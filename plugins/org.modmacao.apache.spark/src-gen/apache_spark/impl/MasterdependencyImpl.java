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
import apache_spark.Masterdependency;

import apache_spark.util.Apache_sparkValidator;
import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import modmacao.impl.ExecutiondependencyImpl;

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
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

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
		 *
		 * inv TargetMustBeMaster:
		 *   let
		 *     severity : Integer[1] = 'Masterdependency::TargetMustBeMaster'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[?] = self.entity.oclAsType(occi::Link)
		 *         .target.oclAsType(occi::Resource)
		 *         .parts->exists(m | m.oclIsTypeOf(Master))
		 *       in
		 *         'Masterdependency::TargetMustBeMaster'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Apache_sparkTables.STR_Masterdependency_c_c_TargetMustBeMaster);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Apache_sparkTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Link_0 = idResolver.getClass(Apache_sparkTables.CLSSid_Link, null);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource_0 = idResolver.getClass(Apache_sparkTables.CLSSid_Resource, null);
				final /*@NonInvalid*/ Entity entity = this.getEntity();
				final /*@Thrown*/ Link oclAsType = ClassUtil.nonNullState((Link)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Link_0));
				final /*@Thrown*/ Resource target = oclAsType.getTarget();
				final /*@Thrown*/ Resource oclAsType_0 = ClassUtil.nonNullState((Resource)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, target, TYP_occi_c_c_Resource_0));
				final /*@Thrown*/ List<MixinBase> parts = oclAsType_0.getParts();
				final /*@Thrown*/ OrderedSetValue BOXED_parts = idResolver.createOrderedSetOfAll(Apache_sparkTables.ORD_CLSSid_MixinBase, parts);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				/*@NonNull*/ Iterator<Object> ITERATOR_m = BOXED_parts.iterator();
				/*@Thrown*/ boolean result;
				while (true) {
					if (!ITERATOR_m.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ MixinBase m = (MixinBase)ITERATOR_m.next();
					/**
					 * m.oclIsTypeOf(Master)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_apache_spark_c_c_Master_0 = idResolver.getClass(Apache_sparkTables.CLSSid_Master, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, m, TYP_apache_spark_c_c_Master_0).booleanValue();
					//
					if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break;														// Stop immediately
					}
					else if (oclIsTypeOf == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, Apache_sparkTables.STR_Masterdependency_c_c_TargetMustBeMaster, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Apache_sparkTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SourceMustBeWorker(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SourceMustBeWorker:
		 *   let
		 *     severity : Integer[1] = 'Masterdependency::SourceMustBeWorker'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[?] = self.entity.oclAsType(occi::Link)
		 *         .source.oclAsType(occi::Resource)
		 *         .parts->exists(m | m.oclIsTypeOf(Worker))
		 *       in
		 *         'Masterdependency::SourceMustBeWorker'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Apache_sparkTables.STR_Masterdependency_c_c_SourceMustBeWorker);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Apache_sparkTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Link = idResolver.getClass(Apache_sparkTables.CLSSid_Link, null);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource_0 = idResolver.getClass(Apache_sparkTables.CLSSid_Resource, null);
				final /*@NonInvalid*/ Entity entity = this.getEntity();
				final /*@Thrown*/ Link oclAsType = ClassUtil.nonNullState((Link)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Link));
				final /*@Thrown*/ Resource source = oclAsType.getSource();
				final /*@Thrown*/ Resource oclAsType_0 = ClassUtil.nonNullState((Resource)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, source, TYP_occi_c_c_Resource_0));
				final /*@Thrown*/ List<MixinBase> parts = oclAsType_0.getParts();
				final /*@Thrown*/ OrderedSetValue BOXED_parts = idResolver.createOrderedSetOfAll(Apache_sparkTables.ORD_CLSSid_MixinBase, parts);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				/*@NonNull*/ Iterator<Object> ITERATOR_m = BOXED_parts.iterator();
				/*@Thrown*/ boolean result;
				while (true) {
					if (!ITERATOR_m.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ MixinBase m = (MixinBase)ITERATOR_m.next();
					/**
					 * m.oclIsTypeOf(Worker)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_apache_spark_c_c_Worker_0 = idResolver.getClass(Apache_sparkTables.CLSSid_Worker, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, m, TYP_apache_spark_c_c_Worker_0).booleanValue();
					//
					if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break;														// Stop immediately
					}
					else if (oclIsTypeOf == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, Apache_sparkTables.STR_Masterdependency_c_c_SourceMustBeWorker, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Apache_sparkTables.INT_0).booleanValue();
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
			case Apache_sparkPackage.MASTERDEPENDENCY___TARGET_MUST_BE_MASTER__DIAGNOSTICCHAIN_MAP:
				return TargetMustBeMaster((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Apache_sparkPackage.MASTERDEPENDENCY___SOURCE_MUST_BE_WORKER__DIAGNOSTICCHAIN_MAP:
				return SourceMustBeWorker((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MasterdependencyImpl
