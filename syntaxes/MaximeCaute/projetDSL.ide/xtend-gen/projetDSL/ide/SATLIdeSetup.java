/**
 * generated by Xtext 2.19.0
 */
package projetDSL.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import projetDSL.SATLRuntimeModule;
import projetDSL.SATLStandaloneSetup;
import projetDSL.ide.SATLIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class SATLIdeSetup extends SATLStandaloneSetup {
  @Override
  public Injector createInjector() {
    SATLRuntimeModule _sATLRuntimeModule = new SATLRuntimeModule();
    SATLIdeModule _sATLIdeModule = new SATLIdeModule();
    return Guice.createInjector(Modules2.mixin(_sATLRuntimeModule, _sATLIdeModule));
  }
}