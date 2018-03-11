/**
 */
package projectTour.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projectTour.Hotspot;
import projectTour.Panorama;
import projectTour.ProjectTourPackage;
import projectTour.RotPanorama;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Panorama</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectTour.impl.PanoramaImpl#getName <em>Name</em>}</li>
 *   <li>{@link projectTour.impl.PanoramaImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link projectTour.impl.PanoramaImpl#isDeparture <em>Departure</em>}</li>
 *   <li>{@link projectTour.impl.PanoramaImpl#getHotspot <em>Hotspot</em>}</li>
 *   <li>{@link projectTour.impl.PanoramaImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link projectTour.impl.PanoramaImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PanoramaImpl extends MinimalEObjectImpl.Container implements Panorama {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
	protected String imagePath = IMAGE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeparture() <em>Departure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeparture()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEPARTURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeparture() <em>Departure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeparture()
	 * @generated
	 * @ordered
	 */
	protected boolean departure = DEPARTURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHotspot() <em>Hotspot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotspot()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotspot> hotspot;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected RotPanorama rotation;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PanoramaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectTourPackage.Literals.PANORAMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectTourPackage.PANORAMA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagePath(String newImagePath) {
		String oldImagePath = imagePath;
		imagePath = newImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectTourPackage.PANORAMA__IMAGE_PATH, oldImagePath,
					imagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeparture() {
		return departure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeparture(boolean newDeparture) {
		boolean oldDeparture = departure;
		departure = newDeparture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectTourPackage.PANORAMA__DEPARTURE, oldDeparture,
					departure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotspot> getHotspot() {
		if (hotspot == null) {
			hotspot = new EObjectContainmentEList<Hotspot>(Hotspot.class, this, ProjectTourPackage.PANORAMA__HOTSPOT);
		}
		return hotspot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotPanorama getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotation(RotPanorama newRotation, NotificationChain msgs) {
		RotPanorama oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectTourPackage.PANORAMA__ROTATION, oldRotation, newRotation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(RotPanorama newRotation) {
		if (newRotation != rotation) {
			NotificationChain msgs = null;
			if (rotation != null)
				msgs = ((InternalEObject) rotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ProjectTourPackage.PANORAMA__ROTATION, null, msgs);
			if (newRotation != null)
				msgs = ((InternalEObject) newRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ProjectTourPackage.PANORAMA__ROTATION, null, msgs);
			msgs = basicSetRotation(newRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectTourPackage.PANORAMA__ROTATION, newRotation,
					newRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectTourPackage.PANORAMA__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectTourPackage.PANORAMA__HOTSPOT:
			return ((InternalEList<?>) getHotspot()).basicRemove(otherEnd, msgs);
		case ProjectTourPackage.PANORAMA__ROTATION:
			return basicSetRotation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjectTourPackage.PANORAMA__NAME:
			return getName();
		case ProjectTourPackage.PANORAMA__IMAGE_PATH:
			return getImagePath();
		case ProjectTourPackage.PANORAMA__DEPARTURE:
			return isDeparture();
		case ProjectTourPackage.PANORAMA__HOTSPOT:
			return getHotspot();
		case ProjectTourPackage.PANORAMA__ROTATION:
			return getRotation();
		case ProjectTourPackage.PANORAMA__DESCRIPTION:
			return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProjectTourPackage.PANORAMA__NAME:
			setName((String) newValue);
			return;
		case ProjectTourPackage.PANORAMA__IMAGE_PATH:
			setImagePath((String) newValue);
			return;
		case ProjectTourPackage.PANORAMA__DEPARTURE:
			setDeparture((Boolean) newValue);
			return;
		case ProjectTourPackage.PANORAMA__HOTSPOT:
			getHotspot().clear();
			getHotspot().addAll((Collection<? extends Hotspot>) newValue);
			return;
		case ProjectTourPackage.PANORAMA__ROTATION:
			setRotation((RotPanorama) newValue);
			return;
		case ProjectTourPackage.PANORAMA__DESCRIPTION:
			setDescription((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ProjectTourPackage.PANORAMA__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjectTourPackage.PANORAMA__IMAGE_PATH:
			setImagePath(IMAGE_PATH_EDEFAULT);
			return;
		case ProjectTourPackage.PANORAMA__DEPARTURE:
			setDeparture(DEPARTURE_EDEFAULT);
			return;
		case ProjectTourPackage.PANORAMA__HOTSPOT:
			getHotspot().clear();
			return;
		case ProjectTourPackage.PANORAMA__ROTATION:
			setRotation((RotPanorama) null);
			return;
		case ProjectTourPackage.PANORAMA__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ProjectTourPackage.PANORAMA__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjectTourPackage.PANORAMA__IMAGE_PATH:
			return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
		case ProjectTourPackage.PANORAMA__DEPARTURE:
			return departure != DEPARTURE_EDEFAULT;
		case ProjectTourPackage.PANORAMA__HOTSPOT:
			return hotspot != null && !hotspot.isEmpty();
		case ProjectTourPackage.PANORAMA__ROTATION:
			return rotation != null;
		case ProjectTourPackage.PANORAMA__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", imagePath: ");
		result.append(imagePath);
		result.append(", departure: ");
		result.append(departure);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //PanoramaImpl
