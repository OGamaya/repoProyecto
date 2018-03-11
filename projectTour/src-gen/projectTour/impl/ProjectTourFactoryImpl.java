/**
 */
package projectTour.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projectTour.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectTourFactoryImpl extends EFactoryImpl implements ProjectTourFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjectTourFactory init() {
		try {
			ProjectTourFactory theProjectTourFactory = (ProjectTourFactory) EPackage.Registry.INSTANCE
					.getEFactory(ProjectTourPackage.eNS_URI);
			if (theProjectTourFactory != null) {
				return theProjectTourFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProjectTourFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectTourFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ProjectTourPackage.TOUR:
			return createTour();
		case ProjectTourPackage.PANORAMA:
			return createPanorama();
		case ProjectTourPackage.ROT_PANORAMA:
			return createRotPanorama();
		case ProjectTourPackage.HOTSPOT:
			return createHotspot();
		case ProjectTourPackage.ROTATION:
			return createRotation();
		case ProjectTourPackage.POSITION:
			return createPosition();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tour createTour() {
		TourImpl tour = new TourImpl();
		return tour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panorama createPanorama() {
		PanoramaImpl panorama = new PanoramaImpl();
		return panorama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotPanorama createRotPanorama() {
		RotPanoramaImpl rotPanorama = new RotPanoramaImpl();
		return rotPanorama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotspot createHotspot() {
		HotspotImpl hotspot = new HotspotImpl();
		return hotspot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotation createRotation() {
		RotationImpl rotation = new RotationImpl();
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectTourPackage getProjectTourPackage() {
		return (ProjectTourPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProjectTourPackage getPackage() {
		return ProjectTourPackage.eINSTANCE;
	}

} //ProjectTourFactoryImpl
