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
 *   /org.modmacao.apache.cassandra/model/apache_cassandra.ecore
 * using:
 *   /org.modmacao.apache.cassandra/model/apache_cassandra.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package apache_cassandra;

import apache_cassandra.Apache_cassandraTables;
import modmacao.ModmacaoTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * Apache_cassandraTables provides the dispatch tables for the apache_cassandra for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Apache_cassandraTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Apache_cassandraPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_modmacao_org_s_apache_s_cassandra_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.modmacao.org/apache/cassandra/ecore", null, apache_cassandra.Apache_cassandraPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", null, org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = apache_cassandra.Apache_cassandraTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Cluster = apache_cassandra.Apache_cassandraTables.PACKid_http_c_s_s_schemas_modmacao_org_s_apache_s_cassandra_s_ecore.getClassId("Cluster", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = apache_cassandra.Apache_cassandraTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Link = apache_cassandra.Apache_cassandraTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Link", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_MixinBase = apache_cassandra.Apache_cassandraTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("MixinBase", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Node = apache_cassandra.Apache_cassandraTables.PACKid_http_c_s_s_schemas_modmacao_org_s_apache_s_cassandra_s_ecore.getClassId("Node", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = apache_cassandra.Apache_cassandraTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Seed = apache_cassandra.Apache_cassandraTables.PACKid_http_c_s_s_schemas_modmacao_org_s_apache_s_cassandra_s_ecore.getClassId("Seed", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_1 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ java.lang.String STR_Cluster_c_c_OneOrMoreNodes = "Cluster::OneOrMoreNodes";
	public static final /*@NonInvalid*/ java.lang.String STR_Cluster_c_c_OneOrMoreSeeds = "Cluster::OneOrMoreSeeds";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Link = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(apache_cassandra.Apache_cassandraTables.CLSSid_Link);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_MixinBase = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(apache_cassandra.Apache_cassandraTables.CLSSid_MixinBase);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_MixinBase = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(apache_cassandra.Apache_cassandraTables.CLSSid_MixinBase);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Resource = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(apache_cassandra.Apache_cassandraTables.CLSSid_Resource);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Apache_cassandraTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Apache_cassandraTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Cluster = new EcoreExecutorType(Apache_cassandraPackage.Literals.CLUSTER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Node = new EcoreExecutorType(Apache_cassandraPackage.Literals.NODE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Seed = new EcoreExecutorType(Apache_cassandraPackage.Literals.SEED, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Cluster,
			_Node,
			_Seed
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Apache_cassandraTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Cluster__Application = new ExecutorFragment(Types._Cluster, ModmacaoTables.Types._Application);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__Cluster = new ExecutorFragment(Types._Cluster, ModmacaoTables.Types._Cluster);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__Cluster_1 = new ExecutorFragment(Types._Cluster, Apache_cassandraTables.Types._Cluster);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__MixinBase = new ExecutorFragment(Types._Cluster, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__OclAny = new ExecutorFragment(Types._Cluster, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__OclElement = new ExecutorFragment(Types._Cluster, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Node__Component = new ExecutorFragment(Types._Node, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Node__MixinBase = new ExecutorFragment(Types._Node, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Node__Node = new ExecutorFragment(Types._Node, Apache_cassandraTables.Types._Node);
		private static final /*@NonNull*/ ExecutorFragment _Node__OclAny = new ExecutorFragment(Types._Node, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Node__OclElement = new ExecutorFragment(Types._Node, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Seed__Component = new ExecutorFragment(Types._Seed, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Seed__MixinBase = new ExecutorFragment(Types._Seed, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Seed__Node = new ExecutorFragment(Types._Seed, Apache_cassandraTables.Types._Node);
		private static final /*@NonNull*/ ExecutorFragment _Seed__OclAny = new ExecutorFragment(Types._Seed, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Seed__OclElement = new ExecutorFragment(Types._Seed, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Seed__Seed = new ExecutorFragment(Types._Seed, Apache_cassandraTables.Types._Seed);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Apache_cassandraTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of Apache_cassandraTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of Apache_cassandraTables::Operations and all preceding sub-packages.
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

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Apache_cassandraTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cluster =
			{
				Fragments._Cluster__OclAny /* 0 */,
				Fragments._Cluster__OclElement /* 1 */,
				Fragments._Cluster__MixinBase /* 2 */,
				Fragments._Cluster__Application /* 3 */,
				Fragments._Cluster__Cluster /* 4 */,
				Fragments._Cluster__Cluster_1 /* 5 */
			};
		private static final int /*@NonNull*/ [] __Cluster = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Node =
			{
				Fragments._Node__OclAny /* 0 */,
				Fragments._Node__OclElement /* 1 */,
				Fragments._Node__MixinBase /* 2 */,
				Fragments._Node__Component /* 3 */,
				Fragments._Node__Node /* 4 */
			};
		private static final int /*@NonNull*/ [] __Node = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Seed =
			{
				Fragments._Seed__OclAny /* 0 */,
				Fragments._Seed__OclElement /* 1 */,
				Fragments._Seed__MixinBase /* 2 */,
				Fragments._Seed__Component /* 3 */,
				Fragments._Seed__Node /* 4 */,
				Fragments._Seed__Seed /* 5 */
			};
		private static final int /*@NonNull*/ [] __Seed = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Cluster.initFragments(_Cluster, __Cluster);
			Types._Node.initFragments(_Node, __Node);
			Types._Seed.initFragments(_Seed, __Seed);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Apache_cassandraTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__Cluster_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__Application = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__Cluster = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Node__Node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Node__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Node__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Node__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Node__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Seed__Seed = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Seed__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Seed__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Seed__Node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Seed__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Seed__OclElement = {
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
			Fragments._Cluster__Application.initOperations(_Cluster__Application);
			Fragments._Cluster__Cluster.initOperations(_Cluster__Cluster);
			Fragments._Cluster__Cluster_1.initOperations(_Cluster__Cluster_1);
			Fragments._Cluster__MixinBase.initOperations(_Cluster__MixinBase);
			Fragments._Cluster__OclAny.initOperations(_Cluster__OclAny);
			Fragments._Cluster__OclElement.initOperations(_Cluster__OclElement);

			Fragments._Node__Component.initOperations(_Node__Component);
			Fragments._Node__MixinBase.initOperations(_Node__MixinBase);
			Fragments._Node__Node.initOperations(_Node__Node);
			Fragments._Node__OclAny.initOperations(_Node__OclAny);
			Fragments._Node__OclElement.initOperations(_Node__OclElement);

			Fragments._Seed__Component.initOperations(_Seed__Component);
			Fragments._Seed__MixinBase.initOperations(_Seed__MixinBase);
			Fragments._Seed__Node.initOperations(_Seed__Node);
			Fragments._Seed__OclAny.initOperations(_Seed__OclAny);
			Fragments._Seed__OclElement.initOperations(_Seed__OclElement);
			Fragments._Seed__Seed.initOperations(_Seed__Seed);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Apache_cassandraTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cluster = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Node = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Seed = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Cluster__Cluster_1.initProperties(_Cluster);
			Fragments._Node__Node.initProperties(_Node);
			Fragments._Seed__Seed.initProperties(_Seed);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Apache_cassandraTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of Apache_cassandraTables::EnumerationLiterals and all preceding sub-packages.
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
