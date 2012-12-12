/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.AssetType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.CommonNewparamType;
import org.khronos.collada.ExtraType;
import org.khronos.collada.ImageType;
import org.khronos.collada.ProfileCOMMONType;
import org.khronos.collada.TechniqueType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile COMMON Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.ProfileCOMMONTypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCOMMONTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCOMMONTypeImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCOMMONTypeImpl#getNewparam <em>Newparam</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCOMMONTypeImpl#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCOMMONTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCOMMONTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileCOMMONTypeImpl extends EObjectImpl implements ProfileCOMMONType {
	/**
   * The cached value of the '{@link #getAsset() <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAsset()
   * @generated
   * @ordered
   */
	protected AssetType asset;

	/**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
	protected FeatureMap group;

	/**
   * The cached value of the '{@link #getTechnique() <em>Technique</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTechnique()
   * @generated
   * @ordered
   */
	protected TechniqueType2 technique;

	/**
   * The cached value of the '{@link #getExtra() <em>Extra</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getExtra()
   * @generated
   * @ordered
   */
	protected EList<ExtraType> extra;

	/**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
	protected static final String ID_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
	protected String id = ID_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ProfileCOMMONTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getProfileCOMMONType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AssetType getAsset() {
    return asset;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAsset(AssetType newAsset, NotificationChain msgs) {
    AssetType oldAsset = asset;
    asset = newAsset;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.PROFILE_COMMON_TYPE__ASSET, oldAsset, newAsset);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAsset(AssetType newAsset) {
    if (newAsset != asset)
    {
      NotificationChain msgs = null;
      if (asset != null)
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PROFILE_COMMON_TYPE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PROFILE_COMMON_TYPE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PROFILE_COMMON_TYPE__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null)
    {
      group = new BasicFeatureMap(this, ColladaPackage.PROFILE_COMMON_TYPE__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ImageType> getImage() {
    return getGroup().list(ColladaPackage.eINSTANCE.getProfileCOMMONType_Image());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CommonNewparamType> getNewparam() {
    return getGroup().list(ColladaPackage.eINSTANCE.getProfileCOMMONType_Newparam());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueType2 getTechnique() {
    return technique;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTechnique(TechniqueType2 newTechnique, NotificationChain msgs) {
    TechniqueType2 oldTechnique = technique;
    technique = newTechnique;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.PROFILE_COMMON_TYPE__TECHNIQUE, oldTechnique, newTechnique);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTechnique(TechniqueType2 newTechnique) {
    if (newTechnique != technique)
    {
      NotificationChain msgs = null;
      if (technique != null)
        msgs = ((InternalEObject)technique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PROFILE_COMMON_TYPE__TECHNIQUE, null, msgs);
      if (newTechnique != null)
        msgs = ((InternalEObject)newTechnique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PROFILE_COMMON_TYPE__TECHNIQUE, null, msgs);
      msgs = basicSetTechnique(newTechnique, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PROFILE_COMMON_TYPE__TECHNIQUE, newTechnique, newTechnique));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.PROFILE_COMMON_TYPE__EXTRA);
    }
    return extra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getId() {
    return id;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setId(String newId) {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PROFILE_COMMON_TYPE__ID, oldId, id));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case ColladaPackage.PROFILE_COMMON_TYPE__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.PROFILE_COMMON_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PROFILE_COMMON_TYPE__IMAGE:
        return ((InternalEList<?>)getImage()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PROFILE_COMMON_TYPE__NEWPARAM:
        return ((InternalEList<?>)getNewparam()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PROFILE_COMMON_TYPE__TECHNIQUE:
        return basicSetTechnique(null, msgs);
      case ColladaPackage.PROFILE_COMMON_TYPE__EXTRA:
        return ((InternalEList<?>)getExtra()).basicRemove(otherEnd, msgs);
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
    switch (featureID)
    {
      case ColladaPackage.PROFILE_COMMON_TYPE__ASSET:
        return getAsset();
      case ColladaPackage.PROFILE_COMMON_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.PROFILE_COMMON_TYPE__IMAGE:
        return getImage();
      case ColladaPackage.PROFILE_COMMON_TYPE__NEWPARAM:
        return getNewparam();
      case ColladaPackage.PROFILE_COMMON_TYPE__TECHNIQUE:
        return getTechnique();
      case ColladaPackage.PROFILE_COMMON_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.PROFILE_COMMON_TYPE__ID:
        return getId();
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
    switch (featureID)
    {
      case ColladaPackage.PROFILE_COMMON_TYPE__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.PROFILE_COMMON_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.PROFILE_COMMON_TYPE__IMAGE:
        getImage().clear();
        getImage().addAll((Collection<? extends ImageType>)newValue);
        return;
      case ColladaPackage.PROFILE_COMMON_TYPE__NEWPARAM:
        getNewparam().clear();
        getNewparam().addAll((Collection<? extends CommonNewparamType>)newValue);
        return;
      case ColladaPackage.PROFILE_COMMON_TYPE__TECHNIQUE:
        setTechnique((TechniqueType2)newValue);
        return;
      case ColladaPackage.PROFILE_COMMON_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.PROFILE_COMMON_TYPE__ID:
        setId((String)newValue);
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
      case ColladaPackage.PROFILE_COMMON_TYPE__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.PROFILE_COMMON_TYPE__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.PROFILE_COMMON_TYPE__IMAGE:
        getImage().clear();
        return;
      case ColladaPackage.PROFILE_COMMON_TYPE__NEWPARAM:
        getNewparam().clear();
        return;
      case ColladaPackage.PROFILE_COMMON_TYPE__TECHNIQUE:
        setTechnique((TechniqueType2)null);
        return;
      case ColladaPackage.PROFILE_COMMON_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.PROFILE_COMMON_TYPE__ID:
        setId(ID_EDEFAULT);
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
      case ColladaPackage.PROFILE_COMMON_TYPE__ASSET:
        return asset != null;
      case ColladaPackage.PROFILE_COMMON_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.PROFILE_COMMON_TYPE__IMAGE:
        return !getImage().isEmpty();
      case ColladaPackage.PROFILE_COMMON_TYPE__NEWPARAM:
        return !getNewparam().isEmpty();
      case ColladaPackage.PROFILE_COMMON_TYPE__TECHNIQUE:
        return technique != null;
      case ColladaPackage.PROFILE_COMMON_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.PROFILE_COMMON_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
    result.append(" (group: ");
    result.append(group);
    result.append(", id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //ProfileCOMMONTypeImpl
