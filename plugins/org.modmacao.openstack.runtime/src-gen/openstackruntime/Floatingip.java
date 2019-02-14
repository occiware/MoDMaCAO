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
package openstackruntime;

import java.util.Map;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floatingip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openstackruntime.Floatingip#getOpenstackFloatingipAddress <em>Openstack Floatingip Address</em>}</li>
 *   <li>{@link openstackruntime.Floatingip#getOpenstackFloatingipPool <em>Openstack Floatingip Pool</em>}</li>
 * </ul>
 *
 * @see openstackruntime.OpenstackruntimePackage#getFloatingip()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Floatingip extends MixinBase {

	/**
	 * Returns the value of the '<em><b>Openstack Floatingip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Openstack Floatingip Address</em>' attribute.
	 * @see #setOpenstackFloatingipAddress(String)
	 * @see openstackruntime.OpenstackruntimePackage#getFloatingip_OpenstackFloatingipAddress()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/openstack/runtime/ecore!Floatingip!openstackFloatingipAddress'"
	 * @generated
	 */
	String getOpenstackFloatingipAddress();

	/**
	 * Sets the value of the '{@link openstackruntime.Floatingip#getOpenstackFloatingipAddress <em>Openstack Floatingip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openstack Floatingip Address</em>' attribute.
	 * @see #getOpenstackFloatingipAddress()
	 * @generated
	 */
	void setOpenstackFloatingipAddress(String value);

	/**
	 * Returns the value of the '<em><b>Openstack Floatingip Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Openstack Floatingip Pool</em>' attribute.
	 * @see #setOpenstackFloatingipPool(String)
	 * @see openstackruntime.OpenstackruntimePackage#getFloatingip_OpenstackFloatingipPool()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/openstack/runtime/ecore!Floatingip!openstackFloatingipPool'"
	 * @generated
	 */
	String getOpenstackFloatingipPool();

	/**
	 * Sets the value of the '{@link openstackruntime.Floatingip#getOpenstackFloatingipPool <em>Openstack Floatingip Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openstack Floatingip Pool</em>' attribute.
	 * @see #getOpenstackFloatingipPool()
	 * @generated
	 */
	void setOpenstackFloatingipPool(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Floatingip::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(infrastructure::Compute)\n *       in\n *         \'Floatingip::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%openstackruntime.OpenstackruntimeTables%&gt;.STR_Floatingip_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%openstackruntime.OpenstackruntimeTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Compute_0 = idResolver.getClass(&lt;%openstackruntime.OpenstackruntimeTables%&gt;.CLSSid_Compute, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Compute_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%openstackruntime.OpenstackruntimeTables%&gt;.STR_Floatingip_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%openstackruntime.OpenstackruntimeTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Floatingip
