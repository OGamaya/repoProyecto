/**
 */
package projectTour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectTour.Tour#getName <em>Name</em>}</li>
 *   <li>{@link projectTour.Tour#getPanorama <em>Panorama</em>}</li>
 * </ul>
 *
 * @see projectTour.ProjectTourPackage#getTour()
 * @model
 * @generated
 */
public interface Tour extends EObject {
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
	 * @see projectTour.ProjectTourPackage#getTour_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projectTour.Tour#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Panorama</b></em>' containment reference list.
	 * The list contents are of type {@link projectTour.Panorama}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panorama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panorama</em>' containment reference list.
	 * @see projectTour.ProjectTourPackage#getTour_Panorama()
	 * @model containment="true"
	 * @generated
	 */
	EList<Panorama> getPanorama();

} // Tour
