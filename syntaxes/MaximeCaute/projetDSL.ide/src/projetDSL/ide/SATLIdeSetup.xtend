/*
 * generated by Xtext 2.19.0
 */
package projetDSL.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import projetDSL.SATLRuntimeModule
import projetDSL.SATLStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SATLIdeSetup extends SATLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SATLRuntimeModule, new SATLIdeModule))
	}
	
}
