/*
 * generated by Xtext 2.19.0
 */
package fr.gjouneau.dsl.sat.ui.tests;

import com.google.inject.Injector;
import fr.gjouneau.dsl.sat.ui.internal.SatActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class SatUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SatActivator.getInstance().getInjector("fr.gjouneau.dsl.sat.Sat");
	}

}
