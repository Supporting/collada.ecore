/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.TechniqueHintType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technique Hint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TechniqueHintTypeImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueHintTypeImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueHintTypeImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechniqueHintTypeImpl extends EObjectImpl implements TechniqueHintType {
	/**
   * The default value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPlatform()
   * @generated
   * @ordered
   */
	protected static final String PLATFORM_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPlatform()
   * @generated
   * @ordered
   */
	protected String platform = PLATFORM_EDEFAULT;

	/**
   * The default value of the '{@link #getProfile() <em>Profile</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProfile()
   * @generated
   * @ordered
   */
	protected static final String PROFILE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getProfile() <em>Profile</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProfile()
   * @generated
   * @ordered
   */
	protected String profile = PROFILE_EDEFAULT;

	/**
   * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
	protected static final String REF_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
	protected String ref = REF_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TechniqueHintTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTechniqueHintType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getPlatform() {
    return platform;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPlatform(String newPlatform) {
    String oldPlatform = platform;
    platform = newPlatform;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_HINT_TYPE__PLATFORM, oldPlatform, platform));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getProfile() {
    return profile;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setProfile(String newProfile) {
    String oldProfile = profile;
    profile = newProfile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_HINT_TYPE__PROFILE, oldProfile, profile));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getRef() {
    return ref;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRef(String newRef) {
    String oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_HINT_TYPE__REF, oldRef, ref));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case ColladaPackage.TECHNIQUE_HINT_TYPE__PLATFORM:
        return getPlatform();
      case ColladaPackage.TECHNIQUE_HINT_TYPE__PROFILE:
        return getProfile();
      case ColladaPackage.TECHNIQUE_HINT_TYPE__REF:
        return getRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case ColladaPackage.TECHNIQUE_HINT_TYPE__PLATFORM:
        setPlatform((String)newValue);
        return;
      case ColladaPackage.TECHNIQUE_HINT_TYPE__PROFILE:
        setProfile((String)newValue);
        return;
      case ColladaPackage.TECHNIQUE_HINT_TYPE__REF:
        setRef((String)newValue);
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
    switch (featureID)
    {
      case ColladaPackage.TECHNIQUE_HINT_TYPE__PLATFORM:
        setPlatform(PLATFORM_EDEFAULT);
        return;
      case ColladaPackage.TECHNIQUE_HINT_TYPE__PROFILE:
        setProfile(PROFILE_EDEFAULT);
        return;
      case ColladaPackage.TECHNIQUE_HINT_TYPE__REF:
        setRef(REF_EDEFAULT);
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
    switch (featureID)
    {
      case ColladaPackage.TECHNIQUE_HINT_TYPE__PLATFORM:
        return PLATFORM_EDEFAULT == null ? platform != null : !PLATFORM_EDEFAULT.equals(platform);
      case ColladaPackage.TECHNIQUE_HINT_TYPE__PROFILE:
        return PROFILE_EDEFAULT == null ? profile != null : !PROFILE_EDEFAULT.equals(profile);
      case ColladaPackage.TECHNIQUE_HINT_TYPE__REF:
        return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
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
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (platform: ");
    result.append(platform);
    result.append(", profile: ");
    result.append(profile);
    result.append(", ref: ");
    result.append(ref);
    result.append(')');
    return result.toString();
  }

} //TechniqueHintTypeImpl
