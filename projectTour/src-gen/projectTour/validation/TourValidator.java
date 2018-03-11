/**
 *
 * $Id$
 */
package projectTour.validation;

import org.eclipse.emf.common.util.EList;

import projectTour.Panorama;

/**
 * A sample validator interface for {@link projectTour.Tour}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TourValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validatePanorama(EList<Panorama> value);
}