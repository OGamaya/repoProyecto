/**
 * generated by Xtext 2.12.0
 */
package edu.uniandes.tour.tourdsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import edu.uniandes.tour.tourdsl.TourDslRuntimeModule;
import edu.uniandes.tour.tourdsl.TourDslStandaloneSetup;
import edu.uniandes.tour.tourdsl.ide.TourDslIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class TourDslIdeSetup extends TourDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    TourDslRuntimeModule _tourDslRuntimeModule = new TourDslRuntimeModule();
    TourDslIdeModule _tourDslIdeModule = new TourDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_tourDslRuntimeModule, _tourDslIdeModule));
  }
}
