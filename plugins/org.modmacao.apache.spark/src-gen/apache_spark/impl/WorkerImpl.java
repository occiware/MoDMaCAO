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
import apache_spark.Worker;

import apache_spark.util.Apache_sparkValidator;
import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Worker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apache_spark.impl.WorkerImpl#getApacheSparkWorkerCores <em>Apache Spark Worker Cores</em>}</li>
 *   <li>{@link apache_spark.impl.WorkerImpl#getApacheSparkWorkerMemory <em>Apache Spark Worker Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkerImpl extends ApachesparkcomponentImpl implements Worker {
	/**
	 * The default value of the '{@link #getApacheSparkWorkerCores() <em>Apache Spark Worker Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApacheSparkWorkerCores()
	 * @generated
	 * @ordered
	 */
	protected static final Integer APACHE_SPARK_WORKER_CORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApacheSparkWorkerCores() <em>Apache Spark Worker Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApacheSparkWorkerCores()
	 * @generated
	 * @ordered
	 */
	protected Integer apacheSparkWorkerCores = APACHE_SPARK_WORKER_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getApacheSparkWorkerMemory() <em>Apache Spark Worker Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApacheSparkWorkerMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Float APACHE_SPARK_WORKER_MEMORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApacheSparkWorkerMemory() <em>Apache Spark Worker Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApacheSparkWorkerMemory()
	 * @generated
	 * @ordered
	 */
	protected Float apacheSparkWorkerMemory = APACHE_SPARK_WORKER_MEMORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Apache_sparkPackage.Literals.WORKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getApacheSparkWorkerCores() {
		return apacheSparkWorkerCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApacheSparkWorkerCores(Integer newApacheSparkWorkerCores) {
		Integer oldApacheSparkWorkerCores = apacheSparkWorkerCores;
		apacheSparkWorkerCores = newApacheSparkWorkerCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_CORES, oldApacheSparkWorkerCores, apacheSparkWorkerCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getApacheSparkWorkerMemory() {
		return apacheSparkWorkerMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApacheSparkWorkerMemory(Float newApacheSparkWorkerMemory) {
		Float oldApacheSparkWorkerMemory = apacheSparkWorkerMemory;
		apacheSparkWorkerMemory = newApacheSparkWorkerMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_MEMORY, oldApacheSparkWorkerMemory, apacheSparkWorkerMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean WorkerMemorySmallerThanComputeMemory(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv WorkerMemorySmallerThanComputeMemory:
		 *   let
		 *     severity : Integer[1] = 'Worker::WorkerMemorySmallerThanComputeMemory'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let result : occi::Boolean[1] = self.apacheSparkWorkerMemory <
		 *         self.entity.oclAsType(occi::Resource)
		 *         .links->select(l |
		 *           l.oclIsTypeOf(placement::Placementlink))
		 *         ->first()
		 *         .target.oclAsType(infrastructure::Compute).occiComputeMemory
		 *       in
		 *         'Worker::WorkerMemorySmallerThanComputeMemory'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Apache_sparkTables.STR_Worker_c_c_WorkerMemorySmallerThanComputeMemory);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Apache_sparkTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Compute_0 = idResolver.getClass(Apache_sparkTables.CLSSid_Compute, null);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource_0 = idResolver.getClass(Apache_sparkTables.CLSSid_Resource, null);
				final /*@NonInvalid*/ Float apacheSparkWorkerMemory = this.getApacheSparkWorkerMemory();
				final /*@NonInvalid*/ RealValue BOXED_apacheSparkWorkerMemory = apacheSparkWorkerMemory == null ? null : ValueUtil.realValueOf(apacheSparkWorkerMemory);
				final /*@NonInvalid*/ Entity entity = this.getEntity();
				final /*@Thrown*/ Resource oclAsType = ClassUtil.nonNullState((Resource)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource_0));
				final /*@Thrown*/ List<Link> links = oclAsType.getLinks();
				final /*@Thrown*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(Apache_sparkTables.ORD_CLSSid_Link, links);
				/*@Thrown*/ OrderedSetValue.Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(Apache_sparkTables.ORD_CLSSid_Link);
				/*@NonNull*/ Iterator<Object> ITERATOR_l = BOXED_links.iterator();
				/*@Thrown*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_l.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Link l = (Link)ITERATOR_l.next();
					/**
					 * l.oclIsTypeOf(placement::Placementlink)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_placement_c_c_Placementlink_0 = idResolver.getClass(Apache_sparkTables.CLSSid_Placementlink, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, l, TYP_placement_c_c_Placementlink_0).booleanValue();
					//
					if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
						accumulator.add(l);
					}
				}
				final /*@Thrown*/ Link first = (Link)OrderedCollectionFirstOperation.INSTANCE.evaluate(select);
				if (first == null) {
					throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Link::target\'");
				}
				final /*@Thrown*/ Resource target = first.getTarget();
				final /*@Thrown*/ Compute oclAsType_0 = ClassUtil.nonNullState((Compute)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, target, TYP_infrastructure_c_c_Compute_0));
				final /*@Thrown*/ Float occiComputeMemory = oclAsType_0.getOcciComputeMemory();
				final /*@Thrown*/ RealValue BOXED_occiComputeMemory = occiComputeMemory == null ? null : ValueUtil.realValueOf(occiComputeMemory);
				final /*@Thrown*/ boolean result = OclComparableLessThanOperation.INSTANCE.evaluate(executor, BOXED_apacheSparkWorkerMemory, BOXED_occiComputeMemory).booleanValue();
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, Apache_sparkTables.STR_Worker_c_c_WorkerMemorySmallerThanComputeMemory, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Apache_sparkTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean WorkerCoresSmallerThanComputeCores(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv WorkerCoresSmallerThanComputeCores:
		 *   let
		 *     severity : Integer[1] = 'Worker::WorkerCoresSmallerThanComputeCores'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let result : occi::Boolean[1] = self.apacheSparkWorkerCores <
		 *         self.entity.oclAsType(occi::Resource)
		 *         .links->select(l |
		 *           l.oclIsTypeOf(placement::Placementlink))
		 *         ->first()
		 *         .target.oclAsType(infrastructure::Compute).occiComputeCores
		 *       in
		 *         'Worker::WorkerCoresSmallerThanComputeCores'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Apache_sparkTables.STR_Worker_c_c_WorkerCoresSmallerThanComputeCores);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Apache_sparkTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Compute = idResolver.getClass(Apache_sparkTables.CLSSid_Compute, null);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource_0 = idResolver.getClass(Apache_sparkTables.CLSSid_Resource, null);
				final /*@NonInvalid*/ Integer apacheSparkWorkerCores = this.getApacheSparkWorkerCores();
				final /*@NonInvalid*/ IntegerValue BOXED_apacheSparkWorkerCores = apacheSparkWorkerCores == null ? null : ValueUtil.integerValueOf(apacheSparkWorkerCores);
				final /*@NonInvalid*/ Entity entity = this.getEntity();
				final /*@Thrown*/ Resource oclAsType = ClassUtil.nonNullState((Resource)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource_0));
				final /*@Thrown*/ List<Link> links = oclAsType.getLinks();
				final /*@Thrown*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(Apache_sparkTables.ORD_CLSSid_Link, links);
				/*@Thrown*/ OrderedSetValue.Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(Apache_sparkTables.ORD_CLSSid_Link);
				/*@NonNull*/ Iterator<Object> ITERATOR_l = BOXED_links.iterator();
				/*@Thrown*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_l.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Link l = (Link)ITERATOR_l.next();
					/**
					 * l.oclIsTypeOf(placement::Placementlink)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_placement_c_c_Placementlink = idResolver.getClass(Apache_sparkTables.CLSSid_Placementlink, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, l, TYP_placement_c_c_Placementlink).booleanValue();
					//
					if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
						accumulator.add(l);
					}
				}
				final /*@Thrown*/ Link first = (Link)OrderedCollectionFirstOperation.INSTANCE.evaluate(select);
				if (first == null) {
					throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Link::target\'");
				}
				final /*@Thrown*/ Resource target = first.getTarget();
				final /*@Thrown*/ Compute oclAsType_0 = ClassUtil.nonNullState((Compute)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, target, TYP_infrastructure_c_c_Compute));
				final /*@Thrown*/ Integer occiComputeCores = oclAsType_0.getOcciComputeCores();
				final /*@Thrown*/ IntegerValue BOXED_occiComputeCores = occiComputeCores == null ? null : ValueUtil.integerValueOf(occiComputeCores);
				final /*@Thrown*/ boolean result = OclComparableLessThanOperation.INSTANCE.evaluate(executor, BOXED_apacheSparkWorkerCores, BOXED_occiComputeCores).booleanValue();
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, Apache_sparkTables.STR_Worker_c_c_WorkerCoresSmallerThanComputeCores, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Apache_sparkTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OnlyOneMasterDependency(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv OnlyOneMasterDependency:
		 *   let severity : Integer[1] = 'Worker::OnlyOneMasterDependency'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclAsType(occi::Resource)
		 *         .links->select(l |
		 *           l.oclIsTypeOf(platform::Componentlink))
		 *         ->collect(l | l.parts)
		 *         ->select(mb | mb.oclIsTypeOf(Masterdependency))
		 *         ->size() = 1
		 *       in
		 *         'Worker::OnlyOneMasterDependency'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Apache_sparkTables.STR_Worker_c_c_OnlyOneMasterDependency);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Apache_sparkTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource = idResolver.getClass(Apache_sparkTables.CLSSid_Resource, null);
				final /*@NonInvalid*/ Entity entity = this.getEntity();
				final /*@Thrown*/ Resource oclAsType = ClassUtil.nonNullState((Resource)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource));
				final /*@Thrown*/ List<Link> links = oclAsType.getLinks();
				final /*@Thrown*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(Apache_sparkTables.ORD_CLSSid_Link, links);
				/*@Thrown*/ OrderedSetValue.Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(Apache_sparkTables.ORD_CLSSid_Link);
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
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_platform_c_c_Componentlink = idResolver.getClass(Apache_sparkTables.CLSSid_Componentlink, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, l, TYP_platform_c_c_Componentlink).booleanValue();
					//
					if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
						accumulator.add(l);
					}
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(Apache_sparkTables.SEQ_CLSSid_MixinBase);
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
					 * mb.oclIsTypeOf(Masterdependency)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_apache_spark_c_c_Masterdependency = idResolver.getClass(Apache_sparkTables.CLSSid_Masterdependency, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, mb, TYP_apache_spark_c_c_Masterdependency).booleanValue();
					//
					if (oclIsTypeOf_0 == ValueUtil.TRUE_VALUE) {
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
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, Apache_sparkTables.STR_Worker_c_c_OnlyOneMasterDependency, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Apache_sparkTables.INT_0).booleanValue();
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_CORES:
				return getApacheSparkWorkerCores();
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_MEMORY:
				return getApacheSparkWorkerMemory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_CORES:
				setApacheSparkWorkerCores((Integer)newValue);
				return;
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_MEMORY:
				setApacheSparkWorkerMemory((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_CORES:
				setApacheSparkWorkerCores(APACHE_SPARK_WORKER_CORES_EDEFAULT);
				return;
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_MEMORY:
				setApacheSparkWorkerMemory(APACHE_SPARK_WORKER_MEMORY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_CORES:
				return APACHE_SPARK_WORKER_CORES_EDEFAULT == null ? apacheSparkWorkerCores != null : !APACHE_SPARK_WORKER_CORES_EDEFAULT.equals(apacheSparkWorkerCores);
			case Apache_sparkPackage.WORKER__APACHE_SPARK_WORKER_MEMORY:
				return APACHE_SPARK_WORKER_MEMORY_EDEFAULT == null ? apacheSparkWorkerMemory != null : !APACHE_SPARK_WORKER_MEMORY_EDEFAULT.equals(apacheSparkWorkerMemory);
		}
		return super.eIsSet(featureID);
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
			case Apache_sparkPackage.WORKER___WORKER_MEMORY_SMALLER_THAN_COMPUTE_MEMORY__DIAGNOSTICCHAIN_MAP:
				return WorkerMemorySmallerThanComputeMemory((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Apache_sparkPackage.WORKER___WORKER_CORES_SMALLER_THAN_COMPUTE_CORES__DIAGNOSTICCHAIN_MAP:
				return WorkerCoresSmallerThanComputeCores((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Apache_sparkPackage.WORKER___ONLY_ONE_MASTER_DEPENDENCY__DIAGNOSTICCHAIN_MAP:
				return OnlyOneMasterDependency((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (apacheSparkWorkerCores: ");
		result.append(apacheSparkWorkerCores);
		result.append(", apacheSparkWorkerMemory: ");
		result.append(apacheSparkWorkerMemory);
		result.append(')');
		return result.toString();
	}

} //WorkerImpl
