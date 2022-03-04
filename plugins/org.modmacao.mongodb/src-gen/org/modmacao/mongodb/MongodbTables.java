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
 *   /org.modmacao.mongodb/model/mongodb.ecore
 * using:
 *   /org.modmacao.mongodb/model/mongodb.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.modmacao.mongodb;

import modmacao.ModmacaoTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.modmacao.mongodb.MongodbTables;

/**
 * MongodbTables provides the dispatch tables for the mongodb for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class MongodbTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(MongodbPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_modmacao_org_s_modmacao_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.modmacao.org/modmacao/ecore", null, modmacao.ModmacaoPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_modmacao_org_s_mongodb_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.modmacao.org/mongodb/ecore", null, org.modmacao.mongodb.MongodbPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", null, org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.modmacao.mongodb.MongodbTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Cluster = org.modmacao.mongodb.MongodbTables.PACKid_http_c_s_s_schemas_modmacao_org_s_mongodb_s_ecore.getClassId("Cluster", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Configserver = org.modmacao.mongodb.MongodbTables.PACKid_http_c_s_s_schemas_modmacao_org_s_mongodb_s_ecore.getClassId("Configserver", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.modmacao.mongodb.MongodbTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Link = org.modmacao.mongodb.MongodbTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Link", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_MixinBase = org.modmacao.mongodb.MongodbTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("MixinBase", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = org.modmacao.mongodb.MongodbTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Router = org.modmacao.mongodb.MongodbTables.PACKid_http_c_s_s_schemas_modmacao_org_s_mongodb_s_ecore.getClassId("Router", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Shard = org.modmacao.mongodb.MongodbTables.PACKid_http_c_s_s_schemas_modmacao_org_s_mongodb_s_ecore.getClassId("Shard", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Port = org.modmacao.mongodb.MongodbTables.PACKid_http_c_s_s_schemas_modmacao_org_s_modmacao_s_ecore.getDataTypeId("Port", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_1 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ java.lang.String STR_Cluster_c_c_OneOrMoreConfigServers = "Cluster::OneOrMoreConfigServers";
	public static final /*@NonInvalid*/ java.lang.String STR_Cluster_c_c_OneOrMoreRouters = "Cluster::OneOrMoreRouters";
	public static final /*@NonInvalid*/ java.lang.String STR_Cluster_c_c_OneOrMoreShards = "Cluster::OneOrMoreShards";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Link = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.modmacao.mongodb.MongodbTables.CLSSid_Link);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_MixinBase = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.modmacao.mongodb.MongodbTables.CLSSid_MixinBase);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_MixinBase = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.modmacao.mongodb.MongodbTables.CLSSid_MixinBase);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Resource = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.modmacao.mongodb.MongodbTables.CLSSid_Resource);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			MongodbTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MongodbTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Cluster = new EcoreExecutorType(MongodbPackage.Literals.CLUSTER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Configserver = new EcoreExecutorType(MongodbPackage.Literals.CONFIGSERVER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Configserverdependency = new EcoreExecutorType(MongodbPackage.Literals.CONFIGSERVERDEPENDENCY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mongodbcomponent = new EcoreExecutorType(MongodbPackage.Literals.MONGODBCOMPONENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Replicablemongodbcomponent = new EcoreExecutorType(MongodbPackage.Literals.REPLICABLEMONGODBCOMPONENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Router = new EcoreExecutorType(MongodbPackage.Literals.ROUTER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Shard = new EcoreExecutorType(MongodbPackage.Literals.SHARD, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Cluster,
			_Configserver,
			_Configserverdependency,
			_Mongodbcomponent,
			_Replicablemongodbcomponent,
			_Router,
			_Shard
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MongodbTables::Types and all preceding sub-packages.
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
		private static final /*@NonNull*/ ExecutorFragment _Cluster__Cluster_1 = new ExecutorFragment(Types._Cluster, MongodbTables.Types._Cluster);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__MixinBase = new ExecutorFragment(Types._Cluster, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__OclAny = new ExecutorFragment(Types._Cluster, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__OclElement = new ExecutorFragment(Types._Cluster, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Configserver__Component = new ExecutorFragment(Types._Configserver, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Configserver__Configserver = new ExecutorFragment(Types._Configserver, MongodbTables.Types._Configserver);
		private static final /*@NonNull*/ ExecutorFragment _Configserver__MixinBase = new ExecutorFragment(Types._Configserver, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Configserver__Mongodbcomponent = new ExecutorFragment(Types._Configserver, MongodbTables.Types._Mongodbcomponent);
		private static final /*@NonNull*/ ExecutorFragment _Configserver__OclAny = new ExecutorFragment(Types._Configserver, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Configserver__OclElement = new ExecutorFragment(Types._Configserver, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Configserver__Replicablemongodbcomponent = new ExecutorFragment(Types._Configserver, MongodbTables.Types._Replicablemongodbcomponent);

		private static final /*@NonNull*/ ExecutorFragment _Configserverdependency__Configserverdependency = new ExecutorFragment(Types._Configserverdependency, MongodbTables.Types._Configserverdependency);
		private static final /*@NonNull*/ ExecutorFragment _Configserverdependency__Dependency = new ExecutorFragment(Types._Configserverdependency, ModmacaoTables.Types._Dependency);
		private static final /*@NonNull*/ ExecutorFragment _Configserverdependency__Executiondependency = new ExecutorFragment(Types._Configserverdependency, ModmacaoTables.Types._Executiondependency);
		private static final /*@NonNull*/ ExecutorFragment _Configserverdependency__MixinBase = new ExecutorFragment(Types._Configserverdependency, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Configserverdependency__OclAny = new ExecutorFragment(Types._Configserverdependency, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Configserverdependency__OclElement = new ExecutorFragment(Types._Configserverdependency, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Mongodbcomponent__Component = new ExecutorFragment(Types._Mongodbcomponent, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Mongodbcomponent__MixinBase = new ExecutorFragment(Types._Mongodbcomponent, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Mongodbcomponent__Mongodbcomponent = new ExecutorFragment(Types._Mongodbcomponent, MongodbTables.Types._Mongodbcomponent);
		private static final /*@NonNull*/ ExecutorFragment _Mongodbcomponent__OclAny = new ExecutorFragment(Types._Mongodbcomponent, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mongodbcomponent__OclElement = new ExecutorFragment(Types._Mongodbcomponent, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Replicablemongodbcomponent__Component = new ExecutorFragment(Types._Replicablemongodbcomponent, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Replicablemongodbcomponent__MixinBase = new ExecutorFragment(Types._Replicablemongodbcomponent, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Replicablemongodbcomponent__Mongodbcomponent = new ExecutorFragment(Types._Replicablemongodbcomponent, MongodbTables.Types._Mongodbcomponent);
		private static final /*@NonNull*/ ExecutorFragment _Replicablemongodbcomponent__OclAny = new ExecutorFragment(Types._Replicablemongodbcomponent, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Replicablemongodbcomponent__OclElement = new ExecutorFragment(Types._Replicablemongodbcomponent, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Replicablemongodbcomponent__Replicablemongodbcomponent = new ExecutorFragment(Types._Replicablemongodbcomponent, MongodbTables.Types._Replicablemongodbcomponent);

		private static final /*@NonNull*/ ExecutorFragment _Router__Component = new ExecutorFragment(Types._Router, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Router__MixinBase = new ExecutorFragment(Types._Router, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Router__Mongodbcomponent = new ExecutorFragment(Types._Router, MongodbTables.Types._Mongodbcomponent);
		private static final /*@NonNull*/ ExecutorFragment _Router__OclAny = new ExecutorFragment(Types._Router, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Router__OclElement = new ExecutorFragment(Types._Router, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Router__Router = new ExecutorFragment(Types._Router, MongodbTables.Types._Router);

		private static final /*@NonNull*/ ExecutorFragment _Shard__Component = new ExecutorFragment(Types._Shard, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Shard__MixinBase = new ExecutorFragment(Types._Shard, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Shard__Mongodbcomponent = new ExecutorFragment(Types._Shard, MongodbTables.Types._Mongodbcomponent);
		private static final /*@NonNull*/ ExecutorFragment _Shard__OclAny = new ExecutorFragment(Types._Shard, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Shard__OclElement = new ExecutorFragment(Types._Shard, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Shard__Replicablemongodbcomponent = new ExecutorFragment(Types._Shard, MongodbTables.Types._Replicablemongodbcomponent);
		private static final /*@NonNull*/ ExecutorFragment _Shard__Shard = new ExecutorFragment(Types._Shard, MongodbTables.Types._Shard);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MongodbTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of MongodbTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of MongodbTables::Operations and all preceding sub-packages.
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


		public static final /*@NonNull*/ ExecutorProperty _Mongodbcomponent__mongodbBindIP = new EcoreExecutorProperty(MongodbPackage.Literals.MONGODBCOMPONENT__MONGODB_BIND_IP, Types._Mongodbcomponent, 0);
		public static final /*@NonNull*/ ExecutorProperty _Mongodbcomponent__mongodbPort = new EcoreExecutorProperty(MongodbPackage.Literals.MONGODBCOMPONENT__MONGODB_PORT, Types._Mongodbcomponent, 1);

		public static final /*@NonNull*/ ExecutorProperty _Replicablemongodbcomponent__mongodbReplicationSetName = new EcoreExecutorProperty(MongodbPackage.Literals.REPLICABLEMONGODBCOMPONENT__MONGODB_REPLICATION_SET_NAME, Types._Replicablemongodbcomponent, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MongodbTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Configserver =
			{
				Fragments._Configserver__OclAny /* 0 */,
				Fragments._Configserver__OclElement /* 1 */,
				Fragments._Configserver__MixinBase /* 2 */,
				Fragments._Configserver__Component /* 3 */,
				Fragments._Configserver__Mongodbcomponent /* 4 */,
				Fragments._Configserver__Replicablemongodbcomponent /* 5 */,
				Fragments._Configserver__Configserver /* 6 */
			};
		private static final int /*@NonNull*/ [] __Configserver = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Configserverdependency =
			{
				Fragments._Configserverdependency__OclAny /* 0 */,
				Fragments._Configserverdependency__OclElement /* 1 */,
				Fragments._Configserverdependency__MixinBase /* 2 */,
				Fragments._Configserverdependency__Dependency /* 3 */,
				Fragments._Configserverdependency__Executiondependency /* 4 */,
				Fragments._Configserverdependency__Configserverdependency /* 5 */
			};
		private static final int /*@NonNull*/ [] __Configserverdependency = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mongodbcomponent =
			{
				Fragments._Mongodbcomponent__OclAny /* 0 */,
				Fragments._Mongodbcomponent__OclElement /* 1 */,
				Fragments._Mongodbcomponent__MixinBase /* 2 */,
				Fragments._Mongodbcomponent__Component /* 3 */,
				Fragments._Mongodbcomponent__Mongodbcomponent /* 4 */
			};
		private static final int /*@NonNull*/ [] __Mongodbcomponent = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Replicablemongodbcomponent =
			{
				Fragments._Replicablemongodbcomponent__OclAny /* 0 */,
				Fragments._Replicablemongodbcomponent__OclElement /* 1 */,
				Fragments._Replicablemongodbcomponent__MixinBase /* 2 */,
				Fragments._Replicablemongodbcomponent__Component /* 3 */,
				Fragments._Replicablemongodbcomponent__Mongodbcomponent /* 4 */,
				Fragments._Replicablemongodbcomponent__Replicablemongodbcomponent /* 5 */
			};
		private static final int /*@NonNull*/ [] __Replicablemongodbcomponent = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Router =
			{
				Fragments._Router__OclAny /* 0 */,
				Fragments._Router__OclElement /* 1 */,
				Fragments._Router__MixinBase /* 2 */,
				Fragments._Router__Component /* 3 */,
				Fragments._Router__Mongodbcomponent /* 4 */,
				Fragments._Router__Router /* 5 */
			};
		private static final int /*@NonNull*/ [] __Router = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Shard =
			{
				Fragments._Shard__OclAny /* 0 */,
				Fragments._Shard__OclElement /* 1 */,
				Fragments._Shard__MixinBase /* 2 */,
				Fragments._Shard__Component /* 3 */,
				Fragments._Shard__Mongodbcomponent /* 4 */,
				Fragments._Shard__Replicablemongodbcomponent /* 5 */,
				Fragments._Shard__Shard /* 6 */
			};
		private static final int /*@NonNull*/ [] __Shard = { 1,1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Cluster.initFragments(_Cluster, __Cluster);
			Types._Configserver.initFragments(_Configserver, __Configserver);
			Types._Configserverdependency.initFragments(_Configserverdependency, __Configserverdependency);
			Types._Mongodbcomponent.initFragments(_Mongodbcomponent, __Mongodbcomponent);
			Types._Replicablemongodbcomponent.initFragments(_Replicablemongodbcomponent, __Replicablemongodbcomponent);
			Types._Router.initFragments(_Router, __Router);
			Types._Shard.initFragments(_Shard, __Shard);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MongodbTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configserver__Configserver = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configserver__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configserver__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configserver__Mongodbcomponent = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configserver__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configserver__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configserver__Replicablemongodbcomponent = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configserverdependency__Configserverdependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configserverdependency__Dependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configserverdependency__Executiondependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configserverdependency__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configserverdependency__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configserverdependency__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mongodbcomponent__Mongodbcomponent = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mongodbcomponent__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mongodbcomponent__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mongodbcomponent__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mongodbcomponent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Replicablemongodbcomponent__Replicablemongodbcomponent = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Replicablemongodbcomponent__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Replicablemongodbcomponent__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Replicablemongodbcomponent__Mongodbcomponent = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Replicablemongodbcomponent__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Replicablemongodbcomponent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Router__Router = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Router__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Router__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Router__Mongodbcomponent = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Router__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Router__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Shard__Shard = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Shard__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Shard__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Shard__Mongodbcomponent = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Shard__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Shard__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Shard__Replicablemongodbcomponent = {};

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

			Fragments._Configserver__Component.initOperations(_Configserver__Component);
			Fragments._Configserver__Configserver.initOperations(_Configserver__Configserver);
			Fragments._Configserver__MixinBase.initOperations(_Configserver__MixinBase);
			Fragments._Configserver__Mongodbcomponent.initOperations(_Configserver__Mongodbcomponent);
			Fragments._Configserver__OclAny.initOperations(_Configserver__OclAny);
			Fragments._Configserver__OclElement.initOperations(_Configserver__OclElement);
			Fragments._Configserver__Replicablemongodbcomponent.initOperations(_Configserver__Replicablemongodbcomponent);

			Fragments._Configserverdependency__Configserverdependency.initOperations(_Configserverdependency__Configserverdependency);
			Fragments._Configserverdependency__Dependency.initOperations(_Configserverdependency__Dependency);
			Fragments._Configserverdependency__Executiondependency.initOperations(_Configserverdependency__Executiondependency);
			Fragments._Configserverdependency__MixinBase.initOperations(_Configserverdependency__MixinBase);
			Fragments._Configserverdependency__OclAny.initOperations(_Configserverdependency__OclAny);
			Fragments._Configserverdependency__OclElement.initOperations(_Configserverdependency__OclElement);

			Fragments._Mongodbcomponent__Component.initOperations(_Mongodbcomponent__Component);
			Fragments._Mongodbcomponent__MixinBase.initOperations(_Mongodbcomponent__MixinBase);
			Fragments._Mongodbcomponent__Mongodbcomponent.initOperations(_Mongodbcomponent__Mongodbcomponent);
			Fragments._Mongodbcomponent__OclAny.initOperations(_Mongodbcomponent__OclAny);
			Fragments._Mongodbcomponent__OclElement.initOperations(_Mongodbcomponent__OclElement);

			Fragments._Replicablemongodbcomponent__Component.initOperations(_Replicablemongodbcomponent__Component);
			Fragments._Replicablemongodbcomponent__MixinBase.initOperations(_Replicablemongodbcomponent__MixinBase);
			Fragments._Replicablemongodbcomponent__Mongodbcomponent.initOperations(_Replicablemongodbcomponent__Mongodbcomponent);
			Fragments._Replicablemongodbcomponent__OclAny.initOperations(_Replicablemongodbcomponent__OclAny);
			Fragments._Replicablemongodbcomponent__OclElement.initOperations(_Replicablemongodbcomponent__OclElement);
			Fragments._Replicablemongodbcomponent__Replicablemongodbcomponent.initOperations(_Replicablemongodbcomponent__Replicablemongodbcomponent);

			Fragments._Router__Component.initOperations(_Router__Component);
			Fragments._Router__MixinBase.initOperations(_Router__MixinBase);
			Fragments._Router__Mongodbcomponent.initOperations(_Router__Mongodbcomponent);
			Fragments._Router__OclAny.initOperations(_Router__OclAny);
			Fragments._Router__OclElement.initOperations(_Router__OclElement);
			Fragments._Router__Router.initOperations(_Router__Router);

			Fragments._Shard__Component.initOperations(_Shard__Component);
			Fragments._Shard__MixinBase.initOperations(_Shard__MixinBase);
			Fragments._Shard__Mongodbcomponent.initOperations(_Shard__Mongodbcomponent);
			Fragments._Shard__OclAny.initOperations(_Shard__OclAny);
			Fragments._Shard__OclElement.initOperations(_Shard__OclElement);
			Fragments._Shard__Replicablemongodbcomponent.initOperations(_Shard__Replicablemongodbcomponent);
			Fragments._Shard__Shard.initOperations(_Shard__Shard);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MongodbTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Configserver = {
			MongodbTables.Properties._Mongodbcomponent__mongodbBindIP,
			MongodbTables.Properties._Mongodbcomponent__mongodbPort,
			MongodbTables.Properties._Replicablemongodbcomponent__mongodbReplicationSetName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Configserverdependency = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mongodbcomponent = {
			MongodbTables.Properties._Mongodbcomponent__mongodbBindIP,
			MongodbTables.Properties._Mongodbcomponent__mongodbPort
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Replicablemongodbcomponent = {
			MongodbTables.Properties._Mongodbcomponent__mongodbBindIP,
			MongodbTables.Properties._Mongodbcomponent__mongodbPort,
			MongodbTables.Properties._Replicablemongodbcomponent__mongodbReplicationSetName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Router = {
			MongodbTables.Properties._Mongodbcomponent__mongodbBindIP,
			MongodbTables.Properties._Mongodbcomponent__mongodbPort
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Shard = {
			MongodbTables.Properties._Mongodbcomponent__mongodbBindIP,
			MongodbTables.Properties._Mongodbcomponent__mongodbPort,
			MongodbTables.Properties._Replicablemongodbcomponent__mongodbReplicationSetName
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Cluster__Cluster_1.initProperties(_Cluster);
			Fragments._Configserver__Configserver.initProperties(_Configserver);
			Fragments._Configserverdependency__Configserverdependency.initProperties(_Configserverdependency);
			Fragments._Mongodbcomponent__Mongodbcomponent.initProperties(_Mongodbcomponent);
			Fragments._Replicablemongodbcomponent__Replicablemongodbcomponent.initProperties(_Replicablemongodbcomponent);
			Fragments._Router__Router.initProperties(_Router);
			Fragments._Shard__Shard.initProperties(_Shard);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MongodbTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of MongodbTables::EnumerationLiterals and all preceding sub-packages.
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
