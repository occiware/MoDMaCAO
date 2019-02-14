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
 * A representation of the model object '<em><b>Runtimeid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openstackruntime.Runtimeid#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}</li>
 * </ul>
 *
 * @see openstackruntime.OpenstackruntimePackage#getRuntimeid()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Runtimeid extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Openstack Runtime Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Openstack Runtime Id</em>' attribute.
	 * @see #setOpenstackRuntimeId(String)
	 * @see openstackruntime.OpenstackruntimePackage#getRuntimeid_OpenstackRuntimeId()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/openstack/runtime/ecore!Runtimeid!openstackRuntimeId'"
	 * @generated
	 */
	String getOpenstackRuntimeId();

	/**
	 * Sets the value of the '{@link openstackruntime.Runtimeid#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openstack Runtime Id</em>' attribute.
	 * @see #getOpenstackRuntimeId()
	 * @generated
	 */
	void setOpenstackRuntimeId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Runtimeid::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[?] = self.entity.oclIsKindOf(infrastructure::Network) or\n *         self.entity.oclIsKindOf(infrastructure::Compute) or\n *         self.entity.oclIsKindOf(infrastructure::Storage) or\n *         self.entity.oclIsKindOf(infrastructure::Storagelink) or\n *         self.entity.oclIsKindOf(infrastructure::Networkinterface)\n *       in\n *         \'Runtimeid::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%openstackruntime.OpenstackruntimeTables%&gt;.STR_Runtimeid_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%openstackruntime.OpenstackruntimeTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Network = idResolver.getClass(&lt;%openstackruntime.OpenstackruntimeTables%&gt;.CLSSid_Network, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity_3 = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean oclIsKindOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_3, TYP_infrastructure_c_c_Network).booleanValue();\n\t/*@NonInvalid\052/ boolean or;\n\tif (oclIsKindOf) {\n\t\tor = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Compute = idResolver.getClass(&lt;%openstackruntime.OpenstackruntimeTables%&gt;.CLSSid_Compute, null);\n\t\tfinal /*@NonInvalid\052/ boolean oclIsKindOf_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_3, TYP_infrastructure_c_c_Compute).booleanValue();\n\t\tor = oclIsKindOf_0;\n\t}\n\t/*@NonInvalid\052/ boolean or_0;\n\tif (or) {\n\t\tor_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Storage = idResolver.getClass(&lt;%openstackruntime.OpenstackruntimeTables%&gt;.CLSSid_Storage, null);\n\t\tfinal /*@NonInvalid\052/ boolean oclIsKindOf_1 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_3, TYP_infrastructure_c_c_Storage).booleanValue();\n\t\tor_0 = oclIsKindOf_1;\n\t}\n\t/*@NonInvalid\052/ boolean or_1;\n\tif (or_0) {\n\t\tor_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Storagelink = idResolver.getClass(&lt;%openstackruntime.OpenstackruntimeTables%&gt;.CLSSid_Storagelink, null);\n\t\tfinal /*@NonInvalid\052/ boolean oclIsKindOf_2 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_3, TYP_infrastructure_c_c_Storagelink).booleanValue();\n\t\tor_1 = oclIsKindOf_2;\n\t}\n\t/*@NonInvalid\052/ boolean result;\n\tif (or_1) {\n\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Networkinterface = idResolver.getClass(&lt;%openstackruntime.OpenstackruntimeTables%&gt;.CLSSid_Networkinterface, null);\n\t\tfinal /*@NonInvalid\052/ boolean oclIsKindOf_3 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_3, TYP_infrastructure_c_c_Networkinterface).booleanValue();\n\t\tresult = oclIsKindOf_3;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%openstackruntime.OpenstackruntimeTables%&gt;.STR_Runtimeid_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%openstackruntime.OpenstackruntimeTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Runtimeid
