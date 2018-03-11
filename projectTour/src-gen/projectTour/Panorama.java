/**
 */
package projectTour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panorama</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectTour.Panorama#getName <em>Name</em>}</li>
 *   <li>{@link projectTour.Panorama#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link projectTour.Panorama#isDeparture <em>Departure</em>}</li>
 *   <li>{@link projectTour.Panorama#getHotspot <em>Hotspot</em>}</li>
 *   <li>{@link projectTour.Panorama#getRotation <em>Rotation</em>}</li>
 *   <li>{@link projectTour.Panorama#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see projectTour.ProjectTourPackage#getPanorama()
 * @model
 * @generated
 */
public interface Panorama extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projectTour.ProjectTourPackage#getPanorama_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projectTour.Panorama#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Path</em>' attribute.
	 * @see #setImagePath(String)
	 * @see projectTour.ProjectTourPackage#getPanorama_ImagePath()
	 * @model
	 * @generated
	 */
	String getImagePath();

	/**
	 * Sets the value of the '{@link projectTour.Panorama#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
	void setImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Departure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Departure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure</em>' attribute.
	 * @see #setDeparture(boolean)
	 * @see projectTour.ProjectTourPackage#getPanorama_Departure()
	 * @model
	 * @generated
	 */
	boolean isDeparture();

	/**
	 * Sets the value of the '{@link projectTour.Panorama#isDeparture <em>Departure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure</em>' attribute.
	 * @see #isDeparture()
	 * @generated
	 */
	void setDeparture(boolean value);

	/**
	 * Returns the value of the '<em><b>Hotspot</b></em>' containment reference list.
	 * The list contents are of type {@link projectTour.Hotspot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hotspot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hotspot</em>' containment reference list.
	 * @see projectTour.ProjectTourPackage#getPanorama_Hotspot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Hotspot> getHotspot();

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(RotPanorama)
	 * @see projectTour.ProjectTourPackage#getPanorama_Rotation()
	 * @model containment="true"
	 * @generated
	 */
	RotPanorama getRotation();

	/**
	 * Sets the value of the '{@link projectTour.Panorama#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(RotPanorama value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see projectTour.ProjectTourPackage#getPanorama_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link projectTour.Panorama#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Panorama
