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
 *   /org.modmacao.apache.spark/model/apache_spark.ecore
 * using:
 *   /org.modmacao.apache.spark/model/apache_spark.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package apache_spark;

import apache_spark.Apache_sparkTables;
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

/**
 * Apache_sparkTables provides the dispatch tables for the apache_spark for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Apache_sparkTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Apache_sparkPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_modmacao_org_s_apache_s_spark_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.modmacao.org/apache/spark/ecore", null, apache_spark.Apache_sparkPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_modmacao_org_s_modmacao_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.modmacao.org/modmacao/ecore", null, modmacao.ModmacaoPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/infrastructure/ecore", null, org.eclipse.cmf.occi.infrastructure.InfrastructurePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Apachesparkcluster = apache_spark.Apache_sparkTables.PACKid_http_c_s_s_schemas_modmacao_org_s_apache_s_spark_s_ecore.getClassId("Apachesparkcluster", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Masterdependency = apache_spark.Apache_sparkTables.PACKid_http_c_s_s_schemas_modmacao_org_s_apache_s_spark_s_ecore.getClassId("Masterdependency", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Worker = apache_spark.Apache_sparkTables.PACKid_http_c_s_s_schemas_modmacao_org_s_apache_s_spark_s_ecore.getClassId("Worker", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Core = apache_spark.Apache_sparkTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("Core", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_GiB = apache_spark.Apache_sparkTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("GiB", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Port = apache_spark.Apache_sparkTables.PACKid_http_c_s_s_schemas_modmacao_org_s_modmacao_s_ecore.getDataTypeId("Port", 0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Apache_sparkTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Apache_sparkTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Apachesparkcluster = new EcoreExecutorType(Apache_sparkPackage.Literals.APACHESPARKCLUSTER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Apachesparkcomponent = new EcoreExecutorType(Apache_sparkPackage.Literals.APACHESPARKCOMPONENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Master = new EcoreExecutorType(Apache_sparkPackage.Literals.MASTER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Masterdependency = new EcoreExecutorType(Apache_sparkPackage.Literals.MASTERDEPENDENCY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Worker = new EcoreExecutorType(Apache_sparkPackage.Literals.WORKER, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Apachesparkcluster,
			_Apachesparkcomponent,
			_Master,
			_Masterdependency,
			_Worker
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Apache_sparkTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Apachesparkcluster__Apachesparkcluster = new ExecutorFragment(Types._Apachesparkcluster, Apache_sparkTables.Types._Apachesparkcluster);
		private static final /*@NonNull*/ ExecutorFragment _Apachesparkcluster__Application = new ExecutorFragment(Types._Apachesparkcluster, ModmacaoTables.Types._Application);
		private static final /*@NonNull*/ ExecutorFragment _Apachesparkcluster__Cluster = new ExecutorFragment(Types._Apachesparkcluster, ModmacaoTables.Types._Cluster);
		private static final /*@NonNull*/ ExecutorFragment _Apachesparkcluster__MixinBase = new ExecutorFragment(Types._Apachesparkcluster, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Apachesparkcluster__OclAny = new ExecutorFragment(Types._Apachesparkcluster, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Apachesparkcluster__OclElement = new ExecutorFragment(Types._Apachesparkcluster, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Apachesparkcomponent__Apachesparkcomponent = new ExecutorFragment(Types._Apachesparkcomponent, Apache_sparkTables.Types._Apachesparkcomponent);
		private static final /*@NonNull*/ ExecutorFragment _Apachesparkcomponent__Component = new ExecutorFragment(Types._Apachesparkcomponent, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Apachesparkcomponent__MixinBase = new ExecutorFragment(Types._Apachesparkcomponent, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Apachesparkcomponent__OclAny = new ExecutorFragment(Types._Apachesparkcomponent, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Apachesparkcomponent__OclElement = new ExecutorFragment(Types._Apachesparkcomponent, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Master__Apachesparkcomponent = new ExecutorFragment(Types._Master, Apache_sparkTables.Types._Apachesparkcomponent);
		private static final /*@NonNull*/ ExecutorFragment _Master__Component = new ExecutorFragment(Types._Master, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Master__Master = new ExecutorFragment(Types._Master, Apache_sparkTables.Types._Master);
		private static final /*@NonNull*/ ExecutorFragment _Master__MixinBase = new ExecutorFragment(Types._Master, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Master__OclAny = new ExecutorFragment(Types._Master, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Master__OclElement = new ExecutorFragment(Types._Master, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Masterdependency__Dependency = new ExecutorFragment(Types._Masterdependency, ModmacaoTables.Types._Dependency);
		private static final /*@NonNull*/ ExecutorFragment _Masterdependency__Executiondependency = new ExecutorFragment(Types._Masterdependency, ModmacaoTables.Types._Executiondependency);
		private static final /*@NonNull*/ ExecutorFragment _Masterdependency__Masterdependency = new ExecutorFragment(Types._Masterdependency, Apache_sparkTables.Types._Masterdependency);
		private static final /*@NonNull*/ ExecutorFragment _Masterdependency__MixinBase = new ExecutorFragment(Types._Masterdependency, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Masterdependency__OclAny = new ExecutorFragment(Types._Masterdependency, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Masterdependency__OclElement = new ExecutorFragment(Types._Masterdependency, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Worker__Apachesparkcomponent = new ExecutorFragment(Types._Worker, Apache_sparkTables.Types._Apachesparkcomponent);
		private static final /*@NonNull*/ ExecutorFragment _Worker__Component = new ExecutorFragment(Types._Worker, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Worker__MixinBase = new ExecutorFragment(Types._Worker, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Worker__OclAny = new ExecutorFragment(Types._Worker, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Worker__OclElement = new ExecutorFragment(Types._Worker, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Worker__Worker = new ExecutorFragment(Types._Worker, Apache_sparkTables.Types._Worker);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Apache_sparkTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of Apache_sparkTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of Apache_sparkTables::Operations and all preceding sub-packages.
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


		public static final /*@NonNull*/ ExecutorProperty _Apachesparkcomponent__apacheSparkPort = new EcoreExecutorProperty(Apache_sparkPackage.Literals.APACHESPARKCOMPONENT__APACHE_SPARK_PORT, Types._Apachesparkcomponent, 0);
		public static final /*@NonNull*/ ExecutorProperty _Apachesparkcomponent__apacheSparkWebuiPort = new EcoreExecutorProperty(Apache_sparkPackage.Literals.APACHESPARKCOMPONENT__APACHE_SPARK_WEBUI_PORT, Types._Apachesparkcomponent, 1);

		public static final /*@NonNull*/ ExecutorProperty _Worker__apacheSparkWorkerCores = new EcoreExecutorProperty(Apache_sparkPackage.Literals.WORKER__APACHE_SPARK_WORKER_CORES, Types._Worker, 0);
		public static final /*@NonNull*/ ExecutorProperty _Worker__apacheSparkWorkerMemory = new EcoreExecutorProperty(Apache_sparkPackage.Literals.WORKER__APACHE_SPARK_WORKER_MEMORY, Types._Worker, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Apache_sparkTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Apachesparkcluster =
			{
				Fragments._Apachesparkcluster__OclAny /* 0 */,
				Fragments._Apachesparkcluster__OclElement /* 1 */,
				Fragments._Apachesparkcluster__MixinBase /* 2 */,
				Fragments._Apachesparkcluster__Application /* 3 */,
				Fragments._Apachesparkcluster__Cluster /* 4 */,
				Fragments._Apachesparkcluster__Apachesparkcluster /* 5 */
			};
		private static final int /*@NonNull*/ [] __Apachesparkcluster = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Apachesparkcomponent =
			{
				Fragments._Apachesparkcomponent__OclAny /* 0 */,
				Fragments._Apachesparkcomponent__OclElement /* 1 */,
				Fragments._Apachesparkcomponent__MixinBase /* 2 */,
				Fragments._Apachesparkcomponent__Component /* 3 */,
				Fragments._Apachesparkcomponent__Apachesparkcomponent /* 4 */
			};
		private static final int /*@NonNull*/ [] __Apachesparkcomponent = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Master =
			{
				Fragments._Master__OclAny /* 0 */,
				Fragments._Master__OclElement /* 1 */,
				Fragments._Master__MixinBase /* 2 */,
				Fragments._Master__Component /* 3 */,
				Fragments._Master__Apachesparkcomponent /* 4 */,
				Fragments._Master__Master /* 5 */
			};
		private static final int /*@NonNull*/ [] __Master = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Masterdependency =
			{
				Fragments._Masterdependency__OclAny /* 0 */,
				Fragments._Masterdependency__OclElement /* 1 */,
				Fragments._Masterdependency__MixinBase /* 2 */,
				Fragments._Masterdependency__Dependency /* 3 */,
				Fragments._Masterdependency__Executiondependency /* 4 */,
				Fragments._Masterdependency__Masterdependency /* 5 */
			};
		private static final int /*@NonNull*/ [] __Masterdependency = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Worker =
			{
				Fragments._Worker__OclAny /* 0 */,
				Fragments._Worker__OclElement /* 1 */,
				Fragments._Worker__MixinBase /* 2 */,
				Fragments._Worker__Component /* 3 */,
				Fragments._Worker__Apachesparkcomponent /* 4 */,
				Fragments._Worker__Worker /* 5 */
			};
		private static final int /*@NonNull*/ [] __Worker = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Apachesparkcluster.initFragments(_Apachesparkcluster, __Apachesparkcluster);
			Types._Apachesparkcomponent.initFragments(_Apachesparkcomponent, __Apachesparkcomponent);
			Types._Master.initFragments(_Master, __Master);
			Types._Masterdependency.initFragments(_Masterdependency, __Masterdependency);
			Types._Worker.initFragments(_Worker, __Worker);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Apache_sparkTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachesparkcluster__Apachesparkcluster = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachesparkcluster__Application = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachesparkcluster__Cluster = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachesparkcluster__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachesparkcluster__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachesparkcluster__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachesparkcomponent__Apachesparkcomponent = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachesparkcomponent__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachesparkcomponent__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachesparkcomponent__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apachesparkcomponent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Master__Master = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Master__Apachesparkcomponent = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Master__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Master__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Master__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Master__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Masterdependency__Masterdependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Masterdependency__Dependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Masterdependency__Executiondependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Masterdependency__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Masterdependency__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Masterdependency__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Worker__Worker = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Worker__Apachesparkcomponent = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Worker__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Worker__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Worker__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Worker__OclElement = {
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
			Fragments._Apachesparkcluster__Apachesparkcluster.initOperations(_Apachesparkcluster__Apachesparkcluster);
			Fragments._Apachesparkcluster__Application.initOperations(_Apachesparkcluster__Application);
			Fragments._Apachesparkcluster__Cluster.initOperations(_Apachesparkcluster__Cluster);
			Fragments._Apachesparkcluster__MixinBase.initOperations(_Apachesparkcluster__MixinBase);
			Fragments._Apachesparkcluster__OclAny.initOperations(_Apachesparkcluster__OclAny);
			Fragments._Apachesparkcluster__OclElement.initOperations(_Apachesparkcluster__OclElement);

			Fragments._Apachesparkcomponent__Apachesparkcomponent.initOperations(_Apachesparkcomponent__Apachesparkcomponent);
			Fragments._Apachesparkcomponent__Component.initOperations(_Apachesparkcomponent__Component);
			Fragments._Apachesparkcomponent__MixinBase.initOperations(_Apachesparkcomponent__MixinBase);
			Fragments._Apachesparkcomponent__OclAny.initOperations(_Apachesparkcomponent__OclAny);
			Fragments._Apachesparkcomponent__OclElement.initOperations(_Apachesparkcomponent__OclElement);

			Fragments._Master__Apachesparkcomponent.initOperations(_Master__Apachesparkcomponent);
			Fragments._Master__Component.initOperations(_Master__Component);
			Fragments._Master__Master.initOperations(_Master__Master);
			Fragments._Master__MixinBase.initOperations(_Master__MixinBase);
			Fragments._Master__OclAny.initOperations(_Master__OclAny);
			Fragments._Master__OclElement.initOperations(_Master__OclElement);

			Fragments._Masterdependency__Dependency.initOperations(_Masterdependency__Dependency);
			Fragments._Masterdependency__Executiondependency.initOperations(_Masterdependency__Executiondependency);
			Fragments._Masterdependency__Masterdependency.initOperations(_Masterdependency__Masterdependency);
			Fragments._Masterdependency__MixinBase.initOperations(_Masterdependency__MixinBase);
			Fragments._Masterdependency__OclAny.initOperations(_Masterdependency__OclAny);
			Fragments._Masterdependency__OclElement.initOperations(_Masterdependency__OclElement);

			Fragments._Worker__Apachesparkcomponent.initOperations(_Worker__Apachesparkcomponent);
			Fragments._Worker__Component.initOperations(_Worker__Component);
			Fragments._Worker__MixinBase.initOperations(_Worker__MixinBase);
			Fragments._Worker__OclAny.initOperations(_Worker__OclAny);
			Fragments._Worker__OclElement.initOperations(_Worker__OclElement);
			Fragments._Worker__Worker.initOperations(_Worker__Worker);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Apache_sparkTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Apachesparkcluster = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Apachesparkcomponent = {
			Apache_sparkTables.Properties._Apachesparkcomponent__apacheSparkPort,
			Apache_sparkTables.Properties._Apachesparkcomponent__apacheSparkWebuiPort
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Master = {
			Apache_sparkTables.Properties._Apachesparkcomponent__apacheSparkPort,
			Apache_sparkTables.Properties._Apachesparkcomponent__apacheSparkWebuiPort
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Masterdependency = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Worker = {
			Apache_sparkTables.Properties._Apachesparkcomponent__apacheSparkPort,
			Apache_sparkTables.Properties._Apachesparkcomponent__apacheSparkWebuiPort,
			Apache_sparkTables.Properties._Worker__apacheSparkWorkerCores,
			Apache_sparkTables.Properties._Worker__apacheSparkWorkerMemory
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Apachesparkcluster__Apachesparkcluster.initProperties(_Apachesparkcluster);
			Fragments._Apachesparkcomponent__Apachesparkcomponent.initProperties(_Apachesparkcomponent);
			Fragments._Master__Master.initProperties(_Master);
			Fragments._Masterdependency__Masterdependency.initProperties(_Masterdependency);
			Fragments._Worker__Worker.initProperties(_Worker);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Apache_sparkTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of Apache_sparkTables::EnumerationLiterals and all preceding sub-packages.
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
