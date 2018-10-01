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
 *   /org.modmacao.client.server/model/client_server.ecore
 * using:
 *   /org.modmacao.client.server/model/client_server.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package client_server;

import client_server.Client_serverTables;
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
 * Client_serverTables provides the dispatch tables for the client_server for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Client_serverTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Client_serverPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_modmacao_org_s_client_server_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.modmacao.org/client_server/ecore", null, client_server.Client_serverPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_modmacao_org_s_modmacao_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.modmacao.org/modmacao/ecore", null, modmacao.ModmacaoPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Client = client_server.Client_serverTables.PACKid_http_c_s_s_schemas_modmacao_org_s_client_server_s_ecore.getClassId("Client", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Clientserver = client_server.Client_serverTables.PACKid_http_c_s_s_schemas_modmacao_org_s_client_server_s_ecore.getClassId("Clientserver", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Serverdependency = client_server.Client_serverTables.PACKid_http_c_s_s_schemas_modmacao_org_s_client_server_s_ecore.getClassId("Serverdependency", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Port = client_server.Client_serverTables.PACKid_http_c_s_s_schemas_modmacao_org_s_modmacao_s_ecore.getDataTypeId("Port", 0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Client_serverTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Client_serverTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Client = new EcoreExecutorType(Client_serverPackage.Literals.CLIENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Clientserver = new EcoreExecutorType(Client_serverPackage.Literals.CLIENTSERVER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Server = new EcoreExecutorType(Client_serverPackage.Literals.SERVER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Serverdependency = new EcoreExecutorType(Client_serverPackage.Literals.SERVERDEPENDENCY, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Client,
			_Clientserver,
			_Server,
			_Serverdependency
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Client_serverTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Client__Client = new ExecutorFragment(Types._Client, Client_serverTables.Types._Client);
		private static final /*@NonNull*/ ExecutorFragment _Client__Component = new ExecutorFragment(Types._Client, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Client__MixinBase = new ExecutorFragment(Types._Client, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Client__OclAny = new ExecutorFragment(Types._Client, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Client__OclElement = new ExecutorFragment(Types._Client, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Clientserver__Application = new ExecutorFragment(Types._Clientserver, ModmacaoTables.Types._Application);
		private static final /*@NonNull*/ ExecutorFragment _Clientserver__Clientserver = new ExecutorFragment(Types._Clientserver, Client_serverTables.Types._Clientserver);
		private static final /*@NonNull*/ ExecutorFragment _Clientserver__MixinBase = new ExecutorFragment(Types._Clientserver, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Clientserver__OclAny = new ExecutorFragment(Types._Clientserver, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Clientserver__OclElement = new ExecutorFragment(Types._Clientserver, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Server__Component = new ExecutorFragment(Types._Server, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Server__MixinBase = new ExecutorFragment(Types._Server, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Server__OclAny = new ExecutorFragment(Types._Server, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Server__OclElement = new ExecutorFragment(Types._Server, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Server__Server = new ExecutorFragment(Types._Server, Client_serverTables.Types._Server);

		private static final /*@NonNull*/ ExecutorFragment _Serverdependency__Dependency = new ExecutorFragment(Types._Serverdependency, ModmacaoTables.Types._Dependency);
		private static final /*@NonNull*/ ExecutorFragment _Serverdependency__Executiondependency = new ExecutorFragment(Types._Serverdependency, ModmacaoTables.Types._Executiondependency);
		private static final /*@NonNull*/ ExecutorFragment _Serverdependency__MixinBase = new ExecutorFragment(Types._Serverdependency, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Serverdependency__OclAny = new ExecutorFragment(Types._Serverdependency, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Serverdependency__OclElement = new ExecutorFragment(Types._Serverdependency, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Serverdependency__Serverdependency = new ExecutorFragment(Types._Serverdependency, Client_serverTables.Types._Serverdependency);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Client_serverTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of Client_serverTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of Client_serverTables::Operations and all preceding sub-packages.
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


		public static final /*@NonNull*/ ExecutorProperty _Server__serverPort = new EcoreExecutorProperty(Client_serverPackage.Literals.SERVER__SERVER_PORT, Types._Server, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Client_serverTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Client =
			{
				Fragments._Client__OclAny /* 0 */,
				Fragments._Client__OclElement /* 1 */,
				Fragments._Client__MixinBase /* 2 */,
				Fragments._Client__Component /* 3 */,
				Fragments._Client__Client /* 4 */
			};
		private static final int /*@NonNull*/ [] __Client = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Clientserver =
			{
				Fragments._Clientserver__OclAny /* 0 */,
				Fragments._Clientserver__OclElement /* 1 */,
				Fragments._Clientserver__MixinBase /* 2 */,
				Fragments._Clientserver__Application /* 3 */,
				Fragments._Clientserver__Clientserver /* 4 */
			};
		private static final int /*@NonNull*/ [] __Clientserver = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Server =
			{
				Fragments._Server__OclAny /* 0 */,
				Fragments._Server__OclElement /* 1 */,
				Fragments._Server__MixinBase /* 2 */,
				Fragments._Server__Component /* 3 */,
				Fragments._Server__Server /* 4 */
			};
		private static final int /*@NonNull*/ [] __Server = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Serverdependency =
			{
				Fragments._Serverdependency__OclAny /* 0 */,
				Fragments._Serverdependency__OclElement /* 1 */,
				Fragments._Serverdependency__MixinBase /* 2 */,
				Fragments._Serverdependency__Dependency /* 3 */,
				Fragments._Serverdependency__Executiondependency /* 4 */,
				Fragments._Serverdependency__Serverdependency /* 5 */
			};
		private static final int /*@NonNull*/ [] __Serverdependency = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Client.initFragments(_Client, __Client);
			Types._Clientserver.initFragments(_Clientserver, __Clientserver);
			Types._Server.initFragments(_Server, __Server);
			Types._Serverdependency.initFragments(_Serverdependency, __Serverdependency);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Client_serverTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Client__Client = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Client__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Client__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Client__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Client__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Clientserver__Clientserver = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Clientserver__Application = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Clientserver__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Clientserver__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Clientserver__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Server__Server = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Server__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Server__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Server__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Server__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Serverdependency__Serverdependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Serverdependency__Dependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Serverdependency__Executiondependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Serverdependency__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Serverdependency__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Serverdependency__OclElement = {
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
			Fragments._Client__Client.initOperations(_Client__Client);
			Fragments._Client__Component.initOperations(_Client__Component);
			Fragments._Client__MixinBase.initOperations(_Client__MixinBase);
			Fragments._Client__OclAny.initOperations(_Client__OclAny);
			Fragments._Client__OclElement.initOperations(_Client__OclElement);

			Fragments._Clientserver__Application.initOperations(_Clientserver__Application);
			Fragments._Clientserver__Clientserver.initOperations(_Clientserver__Clientserver);
			Fragments._Clientserver__MixinBase.initOperations(_Clientserver__MixinBase);
			Fragments._Clientserver__OclAny.initOperations(_Clientserver__OclAny);
			Fragments._Clientserver__OclElement.initOperations(_Clientserver__OclElement);

			Fragments._Server__Component.initOperations(_Server__Component);
			Fragments._Server__MixinBase.initOperations(_Server__MixinBase);
			Fragments._Server__OclAny.initOperations(_Server__OclAny);
			Fragments._Server__OclElement.initOperations(_Server__OclElement);
			Fragments._Server__Server.initOperations(_Server__Server);

			Fragments._Serverdependency__Dependency.initOperations(_Serverdependency__Dependency);
			Fragments._Serverdependency__Executiondependency.initOperations(_Serverdependency__Executiondependency);
			Fragments._Serverdependency__MixinBase.initOperations(_Serverdependency__MixinBase);
			Fragments._Serverdependency__OclAny.initOperations(_Serverdependency__OclAny);
			Fragments._Serverdependency__OclElement.initOperations(_Serverdependency__OclElement);
			Fragments._Serverdependency__Serverdependency.initOperations(_Serverdependency__Serverdependency);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Client_serverTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Client = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Clientserver = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Server = {
			Client_serverTables.Properties._Server__serverPort
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Serverdependency = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Client__Client.initProperties(_Client);
			Fragments._Clientserver__Clientserver.initProperties(_Clientserver);
			Fragments._Server__Server.initProperties(_Server);
			Fragments._Serverdependency__Serverdependency.initProperties(_Serverdependency);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Client_serverTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of Client_serverTables::EnumerationLiterals and all preceding sub-packages.
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
