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
 *   /org.modmacao.lamp/model/lamp.ecore
 * using:
 *   /org.modmacao.lamp/model/lamp.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.modmacao.lamp;

import modmacao.ModmacaoTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.modmacao.lamp.LampTables;

/**
 * LampTables provides the dispatch tables for the lamp for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class LampTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(LampPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_modmacao_org_s_lamp_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.modmacao.org/lamp/ecore", null, org.modmacao.lamp.LampPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Apacheserver = org.modmacao.lamp.LampTables.PACKid_http_c_s_s_schemas_modmacao_org_s_lamp_s_ecore.getClassId("Apacheserver", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Lamp = org.modmacao.lamp.LampTables.PACKid_http_c_s_s_schemas_modmacao_org_s_lamp_s_ecore.getClassId("Lamp", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Mysqldependency = org.modmacao.lamp.LampTables.PACKid_http_c_s_s_schemas_modmacao_org_s_lamp_s_ecore.getClassId("Mysqldependency", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tomcat = org.modmacao.lamp.LampTables.PACKid_http_c_s_s_schemas_modmacao_org_s_lamp_s_ecore.getClassId("Tomcat", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tomcatdependency = org.modmacao.lamp.LampTables.PACKid_http_c_s_s_schemas_modmacao_org_s_lamp_s_ecore.getClassId("Tomcatdependency", 0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			LampTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LampTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Apacheserver = new EcoreExecutorType(LampPackage.Literals.APACHESERVER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Lamp = new EcoreExecutorType(LampPackage.Literals.LAMP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mysql = new EcoreExecutorType(LampPackage.Literals.MYSQL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mysqldependency = new EcoreExecutorType(LampPackage.Literals.MYSQLDEPENDENCY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tomcat = new EcoreExecutorType(LampPackage.Literals.TOMCAT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tomcatdependency = new EcoreExecutorType(LampPackage.Literals.TOMCATDEPENDENCY, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Apacheserver,
			_Lamp,
			_Mysql,
			_Mysqldependency,
			_Tomcat,
			_Tomcatdependency
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LampTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Apacheserver__Apacheserver = new ExecutorFragment(Types._Apacheserver, LampTables.Types._Apacheserver);
		private static final /*@NonNull*/ ExecutorFragment _Apacheserver__Component = new ExecutorFragment(Types._Apacheserver, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Apacheserver__MixinBase = new ExecutorFragment(Types._Apacheserver, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Apacheserver__OclAny = new ExecutorFragment(Types._Apacheserver, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Apacheserver__OclElement = new ExecutorFragment(Types._Apacheserver, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Lamp__Application = new ExecutorFragment(Types._Lamp, ModmacaoTables.Types._Application);
		private static final /*@NonNull*/ ExecutorFragment _Lamp__Lamp = new ExecutorFragment(Types._Lamp, LampTables.Types._Lamp);
		private static final /*@NonNull*/ ExecutorFragment _Lamp__MixinBase = new ExecutorFragment(Types._Lamp, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Lamp__OclAny = new ExecutorFragment(Types._Lamp, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Lamp__OclElement = new ExecutorFragment(Types._Lamp, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Mysql__Component = new ExecutorFragment(Types._Mysql, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Mysql__MixinBase = new ExecutorFragment(Types._Mysql, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Mysql__Mysql = new ExecutorFragment(Types._Mysql, LampTables.Types._Mysql);
		private static final /*@NonNull*/ ExecutorFragment _Mysql__OclAny = new ExecutorFragment(Types._Mysql, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mysql__OclElement = new ExecutorFragment(Types._Mysql, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Mysqldependency__Dependency = new ExecutorFragment(Types._Mysqldependency, ModmacaoTables.Types._Dependency);
		private static final /*@NonNull*/ ExecutorFragment _Mysqldependency__Executiondependency = new ExecutorFragment(Types._Mysqldependency, ModmacaoTables.Types._Executiondependency);
		private static final /*@NonNull*/ ExecutorFragment _Mysqldependency__MixinBase = new ExecutorFragment(Types._Mysqldependency, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Mysqldependency__Mysqldependency = new ExecutorFragment(Types._Mysqldependency, LampTables.Types._Mysqldependency);
		private static final /*@NonNull*/ ExecutorFragment _Mysqldependency__OclAny = new ExecutorFragment(Types._Mysqldependency, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mysqldependency__OclElement = new ExecutorFragment(Types._Mysqldependency, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Tomcat__Component = new ExecutorFragment(Types._Tomcat, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Tomcat__MixinBase = new ExecutorFragment(Types._Tomcat, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tomcat__OclAny = new ExecutorFragment(Types._Tomcat, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tomcat__OclElement = new ExecutorFragment(Types._Tomcat, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tomcat__Tomcat = new ExecutorFragment(Types._Tomcat, LampTables.Types._Tomcat);

		private static final /*@NonNull*/ ExecutorFragment _Tomcatdependency__Dependency = new ExecutorFragment(Types._Tomcatdependency, ModmacaoTables.Types._Dependency);
		private static final /*@NonNull*/ ExecutorFragment _Tomcatdependency__Executiondependency = new ExecutorFragment(Types._Tomcatdependency, ModmacaoTables.Types._Executiondependency);
		private static final /*@NonNull*/ ExecutorFragment _Tomcatdependency__MixinBase = new ExecutorFragment(Types._Tomcatdependency, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tomcatdependency__OclAny = new ExecutorFragment(Types._Tomcatdependency, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tomcatdependency__OclElement = new ExecutorFragment(Types._Tomcatdependency, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tomcatdependency__Tomcatdependency = new ExecutorFragment(Types._Tomcatdependency, LampTables.Types._Tomcatdependency);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LampTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of LampTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of LampTables::Operations and all preceding sub-packages.
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
		 * Force initialization of the fields of LampTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Apacheserver =
			{
				Fragments._Apacheserver__OclAny /* 0 */,
				Fragments._Apacheserver__OclElement /* 1 */,
				Fragments._Apacheserver__MixinBase /* 2 */,
				Fragments._Apacheserver__Component /* 3 */,
				Fragments._Apacheserver__Apacheserver /* 4 */
			};
		private static final int /*@NonNull*/ [] __Apacheserver = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Lamp =
			{
				Fragments._Lamp__OclAny /* 0 */,
				Fragments._Lamp__OclElement /* 1 */,
				Fragments._Lamp__MixinBase /* 2 */,
				Fragments._Lamp__Application /* 3 */,
				Fragments._Lamp__Lamp /* 4 */
			};
		private static final int /*@NonNull*/ [] __Lamp = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mysql =
			{
				Fragments._Mysql__OclAny /* 0 */,
				Fragments._Mysql__OclElement /* 1 */,
				Fragments._Mysql__MixinBase /* 2 */,
				Fragments._Mysql__Component /* 3 */,
				Fragments._Mysql__Mysql /* 4 */
			};
		private static final int /*@NonNull*/ [] __Mysql = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mysqldependency =
			{
				Fragments._Mysqldependency__OclAny /* 0 */,
				Fragments._Mysqldependency__OclElement /* 1 */,
				Fragments._Mysqldependency__MixinBase /* 2 */,
				Fragments._Mysqldependency__Dependency /* 3 */,
				Fragments._Mysqldependency__Executiondependency /* 4 */,
				Fragments._Mysqldependency__Mysqldependency /* 5 */
			};
		private static final int /*@NonNull*/ [] __Mysqldependency = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tomcat =
			{
				Fragments._Tomcat__OclAny /* 0 */,
				Fragments._Tomcat__OclElement /* 1 */,
				Fragments._Tomcat__MixinBase /* 2 */,
				Fragments._Tomcat__Component /* 3 */,
				Fragments._Tomcat__Tomcat /* 4 */
			};
		private static final int /*@NonNull*/ [] __Tomcat = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tomcatdependency =
			{
				Fragments._Tomcatdependency__OclAny /* 0 */,
				Fragments._Tomcatdependency__OclElement /* 1 */,
				Fragments._Tomcatdependency__MixinBase /* 2 */,
				Fragments._Tomcatdependency__Dependency /* 3 */,
				Fragments._Tomcatdependency__Executiondependency /* 4 */,
				Fragments._Tomcatdependency__Tomcatdependency /* 5 */
			};
		private static final int /*@NonNull*/ [] __Tomcatdependency = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Apacheserver.initFragments(_Apacheserver, __Apacheserver);
			Types._Lamp.initFragments(_Lamp, __Lamp);
			Types._Mysql.initFragments(_Mysql, __Mysql);
			Types._Mysqldependency.initFragments(_Mysqldependency, __Mysqldependency);
			Types._Tomcat.initFragments(_Tomcat, __Tomcat);
			Types._Tomcatdependency.initFragments(_Tomcatdependency, __Tomcatdependency);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LampTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apacheserver__Apacheserver = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apacheserver__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apacheserver__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apacheserver__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apacheserver__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Lamp__Lamp = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Lamp__Application = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Lamp__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Lamp__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Lamp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysql__Mysql = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysql__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysql__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysql__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysql__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysqldependency__Mysqldependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysqldependency__Dependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysqldependency__Executiondependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysqldependency__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysqldependency__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mysqldependency__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tomcat__Tomcat = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tomcat__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tomcat__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tomcat__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tomcat__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tomcatdependency__Tomcatdependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tomcatdependency__Dependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tomcatdependency__Executiondependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tomcatdependency__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tomcatdependency__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tomcatdependency__OclElement = {
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
			Fragments._Apacheserver__Apacheserver.initOperations(_Apacheserver__Apacheserver);
			Fragments._Apacheserver__Component.initOperations(_Apacheserver__Component);
			Fragments._Apacheserver__MixinBase.initOperations(_Apacheserver__MixinBase);
			Fragments._Apacheserver__OclAny.initOperations(_Apacheserver__OclAny);
			Fragments._Apacheserver__OclElement.initOperations(_Apacheserver__OclElement);

			Fragments._Lamp__Application.initOperations(_Lamp__Application);
			Fragments._Lamp__Lamp.initOperations(_Lamp__Lamp);
			Fragments._Lamp__MixinBase.initOperations(_Lamp__MixinBase);
			Fragments._Lamp__OclAny.initOperations(_Lamp__OclAny);
			Fragments._Lamp__OclElement.initOperations(_Lamp__OclElement);

			Fragments._Mysql__Component.initOperations(_Mysql__Component);
			Fragments._Mysql__MixinBase.initOperations(_Mysql__MixinBase);
			Fragments._Mysql__Mysql.initOperations(_Mysql__Mysql);
			Fragments._Mysql__OclAny.initOperations(_Mysql__OclAny);
			Fragments._Mysql__OclElement.initOperations(_Mysql__OclElement);

			Fragments._Mysqldependency__Dependency.initOperations(_Mysqldependency__Dependency);
			Fragments._Mysqldependency__Executiondependency.initOperations(_Mysqldependency__Executiondependency);
			Fragments._Mysqldependency__MixinBase.initOperations(_Mysqldependency__MixinBase);
			Fragments._Mysqldependency__Mysqldependency.initOperations(_Mysqldependency__Mysqldependency);
			Fragments._Mysqldependency__OclAny.initOperations(_Mysqldependency__OclAny);
			Fragments._Mysqldependency__OclElement.initOperations(_Mysqldependency__OclElement);

			Fragments._Tomcat__Component.initOperations(_Tomcat__Component);
			Fragments._Tomcat__MixinBase.initOperations(_Tomcat__MixinBase);
			Fragments._Tomcat__OclAny.initOperations(_Tomcat__OclAny);
			Fragments._Tomcat__OclElement.initOperations(_Tomcat__OclElement);
			Fragments._Tomcat__Tomcat.initOperations(_Tomcat__Tomcat);

			Fragments._Tomcatdependency__Dependency.initOperations(_Tomcatdependency__Dependency);
			Fragments._Tomcatdependency__Executiondependency.initOperations(_Tomcatdependency__Executiondependency);
			Fragments._Tomcatdependency__MixinBase.initOperations(_Tomcatdependency__MixinBase);
			Fragments._Tomcatdependency__OclAny.initOperations(_Tomcatdependency__OclAny);
			Fragments._Tomcatdependency__OclElement.initOperations(_Tomcatdependency__OclElement);
			Fragments._Tomcatdependency__Tomcatdependency.initOperations(_Tomcatdependency__Tomcatdependency);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LampTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Apacheserver = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Lamp = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mysql = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mysqldependency = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tomcat = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tomcatdependency = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Apacheserver__Apacheserver.initProperties(_Apacheserver);
			Fragments._Lamp__Lamp.initProperties(_Lamp);
			Fragments._Mysql__Mysql.initProperties(_Mysql);
			Fragments._Mysqldependency__Mysqldependency.initProperties(_Mysqldependency);
			Fragments._Tomcat__Tomcat.initProperties(_Tomcat);
			Fragments._Tomcatdependency__Tomcatdependency.initProperties(_Tomcatdependency);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LampTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of LampTables::EnumerationLiterals and all preceding sub-packages.
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
