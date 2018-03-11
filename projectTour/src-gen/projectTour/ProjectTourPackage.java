/**
 */
package projectTour;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see projectTour.ProjectTourFactory
 * @model kind="package"
 * @generated
 */
public interface ProjectTourPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "projectTour";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uniandes.edu.co/projectTour";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "projectTour";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjectTourPackage eINSTANCE = projectTour.impl.ProjectTourPackageImpl.init();

	/**
	 * The meta object id for the '{@link projectTour.impl.TourImpl <em>Tour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectTour.impl.TourImpl
	 * @see projectTour.impl.ProjectTourPackageImpl#getTour()
	 * @generated
	 */
	int TOUR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Panorama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__PANORAMA = 1;

	/**
	 * The number of structural features of the '<em>Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectTour.impl.PanoramaImpl <em>Panorama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectTour.impl.PanoramaImpl
	 * @see projectTour.impl.ProjectTourPackageImpl#getPanorama()
	 * @generated
	 */
	int PANORAMA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA__IMAGE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Departure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA__DEPARTURE = 2;

	/**
	 * The feature id for the '<em><b>Hotspot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA__HOTSPOT = 3;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA__ROTATION = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Panorama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Panorama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectTour.impl.CoordinateImpl <em>Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectTour.impl.CoordinateImpl
	 * @see projectTour.impl.ProjectTourPackageImpl#getCoordinate()
	 * @generated
	 */
	int COORDINATE = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__Z = 2;

	/**
	 * The number of structural features of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectTour.impl.RotPanoramaImpl <em>Rot Panorama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectTour.impl.RotPanoramaImpl
	 * @see projectTour.impl.ProjectTourPackageImpl#getRotPanorama()
	 * @generated
	 */
	int ROT_PANORAMA = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROT_PANORAMA__X = COORDINATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROT_PANORAMA__Y = COORDINATE__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROT_PANORAMA__Z = COORDINATE__Z;

	/**
	 * The number of structural features of the '<em>Rot Panorama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROT_PANORAMA_FEATURE_COUNT = COORDINATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rot Panorama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROT_PANORAMA_OPERATION_COUNT = COORDINATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectTour.impl.HotspotImpl <em>Hotspot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectTour.impl.HotspotImpl
	 * @see projectTour.impl.ProjectTourPackageImpl#getHotspot()
	 * @generated
	 */
	int HOTSPOT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__TO = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__POSITION = 2;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__ROTATION = 3;

	/**
	 * The number of structural features of the '<em>Hotspot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Hotspot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectTour.impl.RotationImpl <em>Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectTour.impl.RotationImpl
	 * @see projectTour.impl.ProjectTourPackageImpl#getRotation()
	 * @generated
	 */
	int ROTATION = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__X = COORDINATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__Y = COORDINATE__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__Z = COORDINATE__Z;

	/**
	 * The number of structural features of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_FEATURE_COUNT = COORDINATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_OPERATION_COUNT = COORDINATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectTour.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectTour.impl.PositionImpl
	 * @see projectTour.impl.ProjectTourPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = COORDINATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = COORDINATE__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Z = COORDINATE__Z;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = COORDINATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = COORDINATE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link projectTour.Tour <em>Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tour</em>'.
	 * @see projectTour.Tour
	 * @generated
	 */
	EClass getTour();

	/**
	 * Returns the meta object for the attribute '{@link projectTour.Tour#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projectTour.Tour#getName()
	 * @see #getTour()
	 * @generated
	 */
	EAttribute getTour_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link projectTour.Tour#getPanorama <em>Panorama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Panorama</em>'.
	 * @see projectTour.Tour#getPanorama()
	 * @see #getTour()
	 * @generated
	 */
	EReference getTour_Panorama();

	/**
	 * Returns the meta object for class '{@link projectTour.Panorama <em>Panorama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panorama</em>'.
	 * @see projectTour.Panorama
	 * @generated
	 */
	EClass getPanorama();

	/**
	 * Returns the meta object for the attribute '{@link projectTour.Panorama#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projectTour.Panorama#getName()
	 * @see #getPanorama()
	 * @generated
	 */
	EAttribute getPanorama_Name();

	/**
	 * Returns the meta object for the attribute '{@link projectTour.Panorama#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see projectTour.Panorama#getImagePath()
	 * @see #getPanorama()
	 * @generated
	 */
	EAttribute getPanorama_ImagePath();

	/**
	 * Returns the meta object for the attribute '{@link projectTour.Panorama#isDeparture <em>Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departure</em>'.
	 * @see projectTour.Panorama#isDeparture()
	 * @see #getPanorama()
	 * @generated
	 */
	EAttribute getPanorama_Departure();

	/**
	 * Returns the meta object for the containment reference list '{@link projectTour.Panorama#getHotspot <em>Hotspot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hotspot</em>'.
	 * @see projectTour.Panorama#getHotspot()
	 * @see #getPanorama()
	 * @generated
	 */
	EReference getPanorama_Hotspot();

	/**
	 * Returns the meta object for the containment reference '{@link projectTour.Panorama#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation</em>'.
	 * @see projectTour.Panorama#getRotation()
	 * @see #getPanorama()
	 * @generated
	 */
	EReference getPanorama_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link projectTour.Panorama#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see projectTour.Panorama#getDescription()
	 * @see #getPanorama()
	 * @generated
	 */
	EAttribute getPanorama_Description();

	/**
	 * Returns the meta object for class '{@link projectTour.RotPanorama <em>Rot Panorama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rot Panorama</em>'.
	 * @see projectTour.RotPanorama
	 * @generated
	 */
	EClass getRotPanorama();

	/**
	 * Returns the meta object for class '{@link projectTour.Hotspot <em>Hotspot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotspot</em>'.
	 * @see projectTour.Hotspot
	 * @generated
	 */
	EClass getHotspot();

	/**
	 * Returns the meta object for the attribute '{@link projectTour.Hotspot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projectTour.Hotspot#getName()
	 * @see #getHotspot()
	 * @generated
	 */
	EAttribute getHotspot_Name();

	/**
	 * Returns the meta object for the reference '{@link projectTour.Hotspot#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see projectTour.Hotspot#getTo()
	 * @see #getHotspot()
	 * @generated
	 */
	EReference getHotspot_To();

	/**
	 * Returns the meta object for the containment reference '{@link projectTour.Hotspot#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see projectTour.Hotspot#getPosition()
	 * @see #getHotspot()
	 * @generated
	 */
	EReference getHotspot_Position();

	/**
	 * Returns the meta object for the containment reference '{@link projectTour.Hotspot#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation</em>'.
	 * @see projectTour.Hotspot#getRotation()
	 * @see #getHotspot()
	 * @generated
	 */
	EReference getHotspot_Rotation();

	/**
	 * Returns the meta object for class '{@link projectTour.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation</em>'.
	 * @see projectTour.Rotation
	 * @generated
	 */
	EClass getRotation();

	/**
	 * Returns the meta object for class '{@link projectTour.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see projectTour.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for class '{@link projectTour.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate</em>'.
	 * @see projectTour.Coordinate
	 * @generated
	 */
	EClass getCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link projectTour.Coordinate#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see projectTour.Coordinate#getX()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_X();

	/**
	 * Returns the meta object for the attribute '{@link projectTour.Coordinate#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see projectTour.Coordinate#getY()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Y();

	/**
	 * Returns the meta object for the attribute '{@link projectTour.Coordinate#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see projectTour.Coordinate#getZ()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Z();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjectTourFactory getProjectTourFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link projectTour.impl.TourImpl <em>Tour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectTour.impl.TourImpl
		 * @see projectTour.impl.ProjectTourPackageImpl#getTour()
		 * @generated
		 */
		EClass TOUR = eINSTANCE.getTour();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUR__NAME = eINSTANCE.getTour_Name();

		/**
		 * The meta object literal for the '<em><b>Panorama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUR__PANORAMA = eINSTANCE.getTour_Panorama();

		/**
		 * The meta object literal for the '{@link projectTour.impl.PanoramaImpl <em>Panorama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectTour.impl.PanoramaImpl
		 * @see projectTour.impl.ProjectTourPackageImpl#getPanorama()
		 * @generated
		 */
		EClass PANORAMA = eINSTANCE.getPanorama();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANORAMA__NAME = eINSTANCE.getPanorama_Name();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANORAMA__IMAGE_PATH = eINSTANCE.getPanorama_ImagePath();

		/**
		 * The meta object literal for the '<em><b>Departure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANORAMA__DEPARTURE = eINSTANCE.getPanorama_Departure();

		/**
		 * The meta object literal for the '<em><b>Hotspot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANORAMA__HOTSPOT = eINSTANCE.getPanorama_Hotspot();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANORAMA__ROTATION = eINSTANCE.getPanorama_Rotation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANORAMA__DESCRIPTION = eINSTANCE.getPanorama_Description();

		/**
		 * The meta object literal for the '{@link projectTour.impl.RotPanoramaImpl <em>Rot Panorama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectTour.impl.RotPanoramaImpl
		 * @see projectTour.impl.ProjectTourPackageImpl#getRotPanorama()
		 * @generated
		 */
		EClass ROT_PANORAMA = eINSTANCE.getRotPanorama();

		/**
		 * The meta object literal for the '{@link projectTour.impl.HotspotImpl <em>Hotspot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectTour.impl.HotspotImpl
		 * @see projectTour.impl.ProjectTourPackageImpl#getHotspot()
		 * @generated
		 */
		EClass HOTSPOT = eINSTANCE.getHotspot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTSPOT__NAME = eINSTANCE.getHotspot_Name();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTSPOT__TO = eINSTANCE.getHotspot_To();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTSPOT__POSITION = eINSTANCE.getHotspot_Position();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTSPOT__ROTATION = eINSTANCE.getHotspot_Rotation();

		/**
		 * The meta object literal for the '{@link projectTour.impl.RotationImpl <em>Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectTour.impl.RotationImpl
		 * @see projectTour.impl.ProjectTourPackageImpl#getRotation()
		 * @generated
		 */
		EClass ROTATION = eINSTANCE.getRotation();

		/**
		 * The meta object literal for the '{@link projectTour.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectTour.impl.PositionImpl
		 * @see projectTour.impl.ProjectTourPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link projectTour.impl.CoordinateImpl <em>Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectTour.impl.CoordinateImpl
		 * @see projectTour.impl.ProjectTourPackageImpl#getCoordinate()
		 * @generated
		 */
		EClass COORDINATE = eINSTANCE.getCoordinate();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__X = eINSTANCE.getCoordinate_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__Y = eINSTANCE.getCoordinate_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__Z = eINSTANCE.getCoordinate_Z();

	}

} //ProjectTourPackage
