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
 *   /org.modmacao.ansible/model/ansibleconfiguration.ecore
 * using:
 *   /org.modmacao.ansible/model/ansibleconfiguration.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.modmacao.ansibleconfiguration;

import modmacao.ModmacaoTables;
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
import org.modmacao.ansibleconfiguration.AnsibleconfigurationTables;

/**
 * AnsibleconfigurationTables provides the dispatch tables for the ansibleconfiguration for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class AnsibleconfigurationTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(AnsibleconfigurationPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			AnsibleconfigurationTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AnsibleconfigurationTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Ansibleconfiguration = new EcoreExecutorType(AnsibleconfigurationPackage.Literals.ANSIBLECONFIGURATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ansibleendpoint = new EcoreExecutorType(AnsibleconfigurationPackage.Literals.ANSIBLEENDPOINT, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Ansibleconfiguration,
			_Ansibleendpoint
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AnsibleconfigurationTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Ansibleconfiguration__Ansibleconfiguration = new ExecutorFragment(Types._Ansibleconfiguration, AnsibleconfigurationTables.Types._Ansibleconfiguration);
		private static final /*@NonNull*/ ExecutorFragment _Ansibleconfiguration__Component = new ExecutorFragment(Types._Ansibleconfiguration, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Ansibleconfiguration__MixinBase = new ExecutorFragment(Types._Ansibleconfiguration, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ansibleconfiguration__OclAny = new ExecutorFragment(Types._Ansibleconfiguration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ansibleconfiguration__OclElement = new ExecutorFragment(Types._Ansibleconfiguration, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Ansibleendpoint__Ansibleendpoint = new ExecutorFragment(Types._Ansibleendpoint, AnsibleconfigurationTables.Types._Ansibleendpoint);
		private static final /*@NonNull*/ ExecutorFragment _Ansibleendpoint__Ipnetworkinterface = new ExecutorFragment(Types._Ansibleendpoint, InfrastructureTables.Types._Ipnetworkinterface);
		private static final /*@NonNull*/ ExecutorFragment _Ansibleendpoint__MixinBase = new ExecutorFragment(Types._Ansibleendpoint, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ansibleendpoint__OclAny = new ExecutorFragment(Types._Ansibleendpoint, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ansibleendpoint__OclElement = new ExecutorFragment(Types._Ansibleendpoint, OCLstdlibTables.Types._OclElement);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AnsibleconfigurationTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of AnsibleconfigurationTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of AnsibleconfigurationTables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Ansibleconfiguration__ansiblePrivatekey = new EcoreExecutorProperty(AnsibleconfigurationPackage.Literals.ANSIBLECONFIGURATION__ANSIBLE_PRIVATEKEY, Types._Ansibleconfiguration, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ansibleconfiguration__ansibleRemoteuser = new EcoreExecutorProperty(AnsibleconfigurationPackage.Literals.ANSIBLECONFIGURATION__ANSIBLE_REMOTEUSER, Types._Ansibleconfiguration, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AnsibleconfigurationTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ansibleconfiguration =
			{
				Fragments._Ansibleconfiguration__OclAny /* 0 */,
				Fragments._Ansibleconfiguration__OclElement /* 1 */,
				Fragments._Ansibleconfiguration__MixinBase /* 2 */,
				Fragments._Ansibleconfiguration__Component /* 3 */,
				Fragments._Ansibleconfiguration__Ansibleconfiguration /* 4 */
			};
		private static final int /*@NonNull*/ [] __Ansibleconfiguration = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ansibleendpoint =
			{
				Fragments._Ansibleendpoint__OclAny /* 0 */,
				Fragments._Ansibleendpoint__OclElement /* 1 */,
				Fragments._Ansibleendpoint__MixinBase /* 2 */,
				Fragments._Ansibleendpoint__Ipnetworkinterface /* 3 */,
				Fragments._Ansibleendpoint__Ansibleendpoint /* 4 */
			};
		private static final int /*@NonNull*/ [] __Ansibleendpoint = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Ansibleconfiguration.initFragments(_Ansibleconfiguration, __Ansibleconfiguration);
			Types._Ansibleendpoint.initFragments(_Ansibleendpoint, __Ansibleendpoint);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AnsibleconfigurationTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ansibleconfiguration__Ansibleconfiguration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ansibleconfiguration__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ansibleconfiguration__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ansibleconfiguration__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ansibleconfiguration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ansibleendpoint__Ansibleendpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ansibleendpoint__Ipnetworkinterface = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ansibleendpoint__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ansibleendpoint__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ansibleendpoint__OclElement = {
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
			Fragments._Ansibleconfiguration__Ansibleconfiguration.initOperations(_Ansibleconfiguration__Ansibleconfiguration);
			Fragments._Ansibleconfiguration__Component.initOperations(_Ansibleconfiguration__Component);
			Fragments._Ansibleconfiguration__MixinBase.initOperations(_Ansibleconfiguration__MixinBase);
			Fragments._Ansibleconfiguration__OclAny.initOperations(_Ansibleconfiguration__OclAny);
			Fragments._Ansibleconfiguration__OclElement.initOperations(_Ansibleconfiguration__OclElement);

			Fragments._Ansibleendpoint__Ansibleendpoint.initOperations(_Ansibleendpoint__Ansibleendpoint);
			Fragments._Ansibleendpoint__Ipnetworkinterface.initOperations(_Ansibleendpoint__Ipnetworkinterface);
			Fragments._Ansibleendpoint__MixinBase.initOperations(_Ansibleendpoint__MixinBase);
			Fragments._Ansibleendpoint__OclAny.initOperations(_Ansibleendpoint__OclAny);
			Fragments._Ansibleendpoint__OclElement.initOperations(_Ansibleendpoint__OclElement);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AnsibleconfigurationTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ansibleconfiguration = {
			AnsibleconfigurationTables.Properties._Ansibleconfiguration__ansiblePrivatekey,
			AnsibleconfigurationTables.Properties._Ansibleconfiguration__ansibleRemoteuser
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ansibleendpoint = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Ansibleconfiguration__Ansibleconfiguration.initProperties(_Ansibleconfiguration);
			Fragments._Ansibleendpoint__Ansibleendpoint.initProperties(_Ansibleendpoint);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AnsibleconfigurationTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of AnsibleconfigurationTables::EnumerationLiterals and all preceding sub-packages.
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
