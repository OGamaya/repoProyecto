/**
 *
 * $Id$
 */
package projectTour.validation;

import projectTour.Panorama;
import projectTour.Position;
import projectTour.Rotation;

/**
 * A sample validator interface for {@link projectTour.Hotspot}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HotspotValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateTo(Panorama value);

	boolean validatePosition(Position value);

	boolean validateRotation(Rotation value);
}
