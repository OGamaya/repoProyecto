/**
 * generated by Xtext 2.12.0
 */
package edu.uniandes.tour.tourdsl.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class TourDslLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public TourDslLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
