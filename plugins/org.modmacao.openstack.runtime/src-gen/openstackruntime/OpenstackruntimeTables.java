/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.modmacao.openstack.runtime/model/openstackruntime.ecore
 * using:
 *   /org.modmacao.openstack.runtime/model/openstackruntime.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package openstackruntime;

import openstackruntime.OpenstackruntimeTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * OpenstackruntimeTables provides the dispatch tables for the openstackruntime for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class OpenstackruntimeTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(OpenstackruntimePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_modmacao_org_s_openstack_s_runtime_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.modmacao.org/openstack/runtime/ecore", null, openstackruntime.OpenstackruntimePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/infrastructure/ecore", null, org.eclipse.cmf.occi.infrastructure.InfrastructurePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = openstackruntime.OpenstackruntimeTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Compute = openstackruntime.OpenstackruntimeTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Compute", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = openstackruntime.OpenstackruntimeTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Flavor = openstackruntime.OpenstackruntimeTables.PACKid_http_c_s_s_schemas_modmacao_org_s_openstack_s_runtime_s_ecore.getClassId("Flavor", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Floatingip = openstackruntime.OpenstackruntimeTables.PACKid_http_c_s_s_schemas_modmacao_org_s_openstack_s_runtime_s_ecore.getClassId("Floatingip", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Image = openstackruntime.OpenstackruntimeTables.PACKid_http_c_s_s_schemas_modmacao_org_s_openstack_s_runtime_s_ecore.getClassId("Image", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Network = openstackruntime.OpenstackruntimeTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Network", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Networkinterface = openstackruntime.OpenstackruntimeTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Networkinterface", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Runtimeid = openstackruntime.OpenstackruntimeTables.PACKid_http_c_s_s_schemas_modmacao_org_s_openstack_s_runtime_s_ecore.getClassId("Runtimeid", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Storage = openstackruntime.OpenstackruntimeTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Storage", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Storagelink = openstackruntime.OpenstackruntimeTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Storagelink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Flavor_c_c_appliesConstraint = "Flavor::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Floatingip_c_c_appliesConstraint = "Floatingip::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Image_c_c_appliesConstraint = "Image::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Runtimeid_c_c_appliesConstraint = "Runtimeid::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			OpenstackruntimeTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenstackruntimeTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Flavor = new EcoreExecutorType(OpenstackruntimePackage.Literals.FLAVOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Floatingip = new EcoreExecutorType(OpenstackruntimePackage.Literals.FLOATINGIP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Image = new EcoreExecutorType(OpenstackruntimePackage.Literals.IMAGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Runtimeid = new EcoreExecutorType(OpenstackruntimePackage.Literals.RUNTIMEID, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Flavor,
			_Floatingip,
			_Image,
			_Runtimeid
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenstackruntimeTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Flavor__Flavor = new ExecutorFragment(Types._Flavor, OpenstackruntimeTables.Types._Flavor);
		private static final /*@NonNull*/ ExecutorFragment _Flavor__MixinBase = new ExecutorFragment(Types._Flavor, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Flavor__OclAny = new ExecutorFragment(Types._Flavor, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Flavor__OclElement = new ExecutorFragment(Types._Flavor, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Flavor__Resource_tpl = new ExecutorFragment(Types._Flavor, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Floatingip__Floatingip = new ExecutorFragment(Types._Floatingip, OpenstackruntimeTables.Types._Floatingip);
		private static final /*@NonNull*/ ExecutorFragment _Floatingip__MixinBase = new ExecutorFragment(Types._Floatingip, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Floatingip__OclAny = new ExecutorFragment(Types._Floatingip, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Floatingip__OclElement = new ExecutorFragment(Types._Floatingip, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Image__Image = new ExecutorFragment(Types._Image, OpenstackruntimeTables.Types._Image);
		private static final /*@NonNull*/ ExecutorFragment _Image__MixinBase = new ExecutorFragment(Types._Image, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Image__OclAny = new ExecutorFragment(Types._Image, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Image__OclElement = new ExecutorFragment(Types._Image, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Image__Os_tpl = new ExecutorFragment(Types._Image, InfrastructureTables.Types._Os_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Runtimeid__MixinBase = new ExecutorFragment(Types._Runtimeid, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Runtimeid__OclAny = new ExecutorFragment(Types._Runtimeid, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Runtimeid__OclElement = new ExecutorFragment(Types._Runtimeid, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Runtimeid__Runtimeid = new ExecutorFragment(Types._Runtimeid, OpenstackruntimeTables.Types._Runtimeid);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenstackruntimeTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenstackruntimeTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenstackruntimeTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final /*@NonNull*/ ExecutorProperty _Flavor__openstackFlavorRuntimeId = new EcoreExecutorProperty(OpenstackruntimePackage.Literals.FLAVOR__OPENSTACK_FLAVOR_RUNTIME_ID, Types._Flavor, 0);

		public static final /*@NonNull*/ ExecutorProperty _Floatingip__openstackFloatingipAddress = new EcoreExecutorProperty(OpenstackruntimePackage.Literals.FLOATINGIP__OPENSTACK_FLOATINGIP_ADDRESS, Types._Floatingip, 0);
		public static final /*@NonNull*/ ExecutorProperty _Floatingip__openstackFloatingipPool = new EcoreExecutorProperty(OpenstackruntimePackage.Literals.FLOATINGIP__OPENSTACK_FLOATINGIP_POOL, Types._Floatingip, 1);

		public static final /*@NonNull*/ ExecutorProperty _Image__openstackImageRuntimeId = new EcoreExecutorProperty(OpenstackruntimePackage.Literals.IMAGE__OPENSTACK_IMAGE_RUNTIME_ID, Types._Image, 0);

		public static final /*@NonNull*/ ExecutorProperty _Runtimeid__openstackRuntimeId = new EcoreExecutorProperty(OpenstackruntimePackage.Literals.RUNTIMEID__OPENSTACK_RUNTIME_ID, Types._Runtimeid, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenstackruntimeTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Flavor =
			{
				Fragments._Flavor__OclAny /* 0 */,
				Fragments._Flavor__OclElement /* 1 */,
				Fragments._Flavor__MixinBase /* 2 */,
				Fragments._Flavor__Resource_tpl /* 3 */,
				Fragments._Flavor__Flavor /* 4 */
			};
		private static final int /*@NonNull*/ [] __Flavor = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Floatingip =
			{
				Fragments._Floatingip__OclAny /* 0 */,
				Fragments._Floatingip__OclElement /* 1 */,
				Fragments._Floatingip__MixinBase /* 2 */,
				Fragments._Floatingip__Floatingip /* 3 */
			};
		private static final int /*@NonNull*/ [] __Floatingip = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Image =
			{
				Fragments._Image__OclAny /* 0 */,
				Fragments._Image__OclElement /* 1 */,
				Fragments._Image__MixinBase /* 2 */,
				Fragments._Image__Os_tpl /* 3 */,
				Fragments._Image__Image /* 4 */
			};
		private static final int /*@NonNull*/ [] __Image = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Runtimeid =
			{
				Fragments._Runtimeid__OclAny /* 0 */,
				Fragments._Runtimeid__OclElement /* 1 */,
				Fragments._Runtimeid__MixinBase /* 2 */,
				Fragments._Runtimeid__Runtimeid /* 3 */
			};
		private static final int /*@NonNull*/ [] __Runtimeid = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Flavor.initFragments(_Flavor, __Flavor);
			Types._Floatingip.initFragments(_Floatingip, __Floatingip);
			Types._Image.initFragments(_Image, __Image);
			Types._Runtimeid.initFragments(_Runtimeid, __Runtimeid);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenstackruntimeTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Flavor__Flavor = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Flavor__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Flavor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Flavor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Flavor__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Floatingip__Floatingip = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Floatingip__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Floatingip__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Floatingip__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Image__Image = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Image__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Image__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Image__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Image__Os_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Runtimeid__Runtimeid = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Runtimeid__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Runtimeid__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Runtimeid__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Flavor__Flavor.initOperations(_Flavor__Flavor);
			Fragments._Flavor__MixinBase.initOperations(_Flavor__MixinBase);
			Fragments._Flavor__OclAny.initOperations(_Flavor__OclAny);
			Fragments._Flavor__OclElement.initOperations(_Flavor__OclElement);
			Fragments._Flavor__Resource_tpl.initOperations(_Flavor__Resource_tpl);

			Fragments._Floatingip__Floatingip.initOperations(_Floatingip__Floatingip);
			Fragments._Floatingip__MixinBase.initOperations(_Floatingip__MixinBase);
			Fragments._Floatingip__OclAny.initOperations(_Floatingip__OclAny);
			Fragments._Floatingip__OclElement.initOperations(_Floatingip__OclElement);

			Fragments._Image__Image.initOperations(_Image__Image);
			Fragments._Image__MixinBase.initOperations(_Image__MixinBase);
			Fragments._Image__OclAny.initOperations(_Image__OclAny);
			Fragments._Image__OclElement.initOperations(_Image__OclElement);
			Fragments._Image__Os_tpl.initOperations(_Image__Os_tpl);

			Fragments._Runtimeid__MixinBase.initOperations(_Runtimeid__MixinBase);
			Fragments._Runtimeid__OclAny.initOperations(_Runtimeid__OclAny);
			Fragments._Runtimeid__OclElement.initOperations(_Runtimeid__OclElement);
			Fragments._Runtimeid__Runtimeid.initOperations(_Runtimeid__Runtimeid);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenstackruntimeTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Flavor = {
			OpenstackruntimeTables.Properties._Flavor__openstackFlavorRuntimeId
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Floatingip = {
			OpenstackruntimeTables.Properties._Floatingip__openstackFloatingipAddress,
			OpenstackruntimeTables.Properties._Floatingip__openstackFloatingipPool
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Image = {
			OpenstackruntimeTables.Properties._Image__openstackImageRuntimeId
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Runtimeid = {
			OpenstackruntimeTables.Properties._Runtimeid__openstackRuntimeId
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Flavor__Flavor.initProperties(_Flavor);
			Fragments._Floatingip__Floatingip.initProperties(_Floatingip);
			Fragments._Image__Image.initProperties(_Image);
			Fragments._Runtimeid__Runtimeid.initProperties(_Runtimeid);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenstackruntimeTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OpenstackruntimeTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
