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
import org.khronos.collada.CgNewparam;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.FxCodeProfile;
import org.khronos.collada.FxIncludeCommon;
import org.khronos.collada.ImageType;
import org.khronos.collada.ProfileCGType;
import org.khronos.collada.TechniqueType3;
import org.khronos.collada.TechniqueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile CG Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.ProfileCGTypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCGTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCGTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCGTypeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCGTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCGTypeImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCGTypeImpl#getNewparam <em>Newparam</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCGTypeImpl#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCGTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCGTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ProfileCGTypeImpl#getPlatform <em>Platform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileCGTypeImpl extends EObjectImpl implements ProfileCGType {
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
   * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGroup1()
   * @generated
   * @ordered
   */
	protected FeatureMap group1;

	/**
   * The cached value of the '{@link #getTechnique() <em>Technique</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTechnique()
   * @generated
   * @ordered
   */
	protected EList<TechniqueType> technique;

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
   * The default value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPlatform()
   * @generated
   * @ordered
   */
	protected static final String PLATFORM_EDEFAULT = "PC";

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
   * This is true if the Platform attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean platformESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ProfileCGTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getProfileCGType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.PROFILE_CG_TYPE__ASSET, oldAsset, newAsset);
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
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PROFILE_CG_TYPE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PROFILE_CG_TYPE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PROFILE_CG_TYPE__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null)
    {
      group = new BasicFeatureMap(this, ColladaPackage.PROFILE_CG_TYPE__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxCodeProfile> getCode() {
    return getGroup().list(ColladaPackage.eINSTANCE.getProfileCGType_Code());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxIncludeCommon> getInclude() {
    return getGroup().list(ColladaPackage.eINSTANCE.getProfileCGType_Include());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup1() {
    if (group1 == null)
    {
      group1 = new BasicFeatureMap(this, ColladaPackage.PROFILE_CG_TYPE__GROUP1);
    }
    return group1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ImageType> getImage() {
    return getGroup1().list(ColladaPackage.eINSTANCE.getProfileCGType_Image());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CgNewparam> getNewparam() {
    return getGroup1().list(ColladaPackage.eINSTANCE.getProfileCGType_Newparam());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TechniqueType> getTechnique() {
    if (technique == null)
    {
      technique = new EObjectContainmentEList<TechniqueType>(TechniqueType.class, this, ColladaPackage.PROFILE_CG_TYPE__TECHNIQUE);
    }
    return technique;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.PROFILE_CG_TYPE__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PROFILE_CG_TYPE__ID, oldId, id));
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
    boolean oldPlatformESet = platformESet;
    platformESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PROFILE_CG_TYPE__PLATFORM, oldPlatform, platform, !oldPlatformESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetPlatform() {
    String oldPlatform = platform;
    boolean oldPlatformESet = platformESet;
    platform = PLATFORM_EDEFAULT;
    platformESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.PROFILE_CG_TYPE__PLATFORM, oldPlatform, PLATFORM_EDEFAULT, oldPlatformESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetPlatform() {
    return platformESet;
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
      case ColladaPackage.PROFILE_CG_TYPE__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.PROFILE_CG_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PROFILE_CG_TYPE__CODE:
        return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PROFILE_CG_TYPE__INCLUDE:
        return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PROFILE_CG_TYPE__GROUP1:
        return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PROFILE_CG_TYPE__IMAGE:
        return ((InternalEList<?>)getImage()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PROFILE_CG_TYPE__NEWPARAM:
        return ((InternalEList<?>)getNewparam()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PROFILE_CG_TYPE__TECHNIQUE:
        return ((InternalEList<?>)getTechnique()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PROFILE_CG_TYPE__EXTRA:
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
      case ColladaPackage.PROFILE_CG_TYPE__ASSET:
        return getAsset();
      case ColladaPackage.PROFILE_CG_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.PROFILE_CG_TYPE__CODE:
        return getCode();
      case ColladaPackage.PROFILE_CG_TYPE__INCLUDE:
        return getInclude();
      case ColladaPackage.PROFILE_CG_TYPE__GROUP1:
        if (coreType) return getGroup1();
        return ((FeatureMap.Internal)getGroup1()).getWrapper();
      case ColladaPackage.PROFILE_CG_TYPE__IMAGE:
        return getImage();
      case ColladaPackage.PROFILE_CG_TYPE__NEWPARAM:
        return getNewparam();
      case ColladaPackage.PROFILE_CG_TYPE__TECHNIQUE:
        return getTechnique();
      case ColladaPackage.PROFILE_CG_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.PROFILE_CG_TYPE__ID:
        return getId();
      case ColladaPackage.PROFILE_CG_TYPE__PLATFORM:
        return getPlatform();
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
      case ColladaPackage.PROFILE_CG_TYPE__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.PROFILE_CG_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.PROFILE_CG_TYPE__CODE:
        getCode().clear();
        getCode().addAll((Collection<? extends FxCodeProfile>)newValue);
        return;
      case ColladaPackage.PROFILE_CG_TYPE__INCLUDE:
        getInclude().clear();
        getInclude().addAll((Collection<? extends FxIncludeCommon>)newValue);
        return;
      case ColladaPackage.PROFILE_CG_TYPE__GROUP1:
        ((FeatureMap.Internal)getGroup1()).set(newValue);
        return;
      case ColladaPackage.PROFILE_CG_TYPE__IMAGE:
        getImage().clear();
        getImage().addAll((Collection<? extends ImageType>)newValue);
        return;
      case ColladaPackage.PROFILE_CG_TYPE__NEWPARAM:
        getNewparam().clear();
        getNewparam().addAll((Collection<? extends CgNewparam>)newValue);
        return;
      case ColladaPackage.PROFILE_CG_TYPE__TECHNIQUE:
        getTechnique().clear();
        getTechnique().addAll((Collection<? extends TechniqueType>)newValue);
        return;
      case ColladaPackage.PROFILE_CG_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.PROFILE_CG_TYPE__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.PROFILE_CG_TYPE__PLATFORM:
        setPlatform((String)newValue);
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
      case ColladaPackage.PROFILE_CG_TYPE__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.PROFILE_CG_TYPE__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.PROFILE_CG_TYPE__CODE:
        getCode().clear();
        return;
      case ColladaPackage.PROFILE_CG_TYPE__INCLUDE:
        getInclude().clear();
        return;
      case ColladaPackage.PROFILE_CG_TYPE__GROUP1:
        getGroup1().clear();
        return;
      case ColladaPackage.PROFILE_CG_TYPE__IMAGE:
        getImage().clear();
        return;
      case ColladaPackage.PROFILE_CG_TYPE__NEWPARAM:
        getNewparam().clear();
        return;
      case ColladaPackage.PROFILE_CG_TYPE__TECHNIQUE:
        getTechnique().clear();
        return;
      case ColladaPackage.PROFILE_CG_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.PROFILE_CG_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.PROFILE_CG_TYPE__PLATFORM:
        unsetPlatform();
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
      case ColladaPackage.PROFILE_CG_TYPE__ASSET:
        return asset != null;
      case ColladaPackage.PROFILE_CG_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.PROFILE_CG_TYPE__CODE:
        return !getCode().isEmpty();
      case ColladaPackage.PROFILE_CG_TYPE__INCLUDE:
        return !getInclude().isEmpty();
      case ColladaPackage.PROFILE_CG_TYPE__GROUP1:
        return group1 != null && !group1.isEmpty();
      case ColladaPackage.PROFILE_CG_TYPE__IMAGE:
        return !getImage().isEmpty();
      case ColladaPackage.PROFILE_CG_TYPE__NEWPARAM:
        return !getNewparam().isEmpty();
      case ColladaPackage.PROFILE_CG_TYPE__TECHNIQUE:
        return technique != null && !technique.isEmpty();
      case ColladaPackage.PROFILE_CG_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.PROFILE_CG_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.PROFILE_CG_TYPE__PLATFORM:
        return isSetPlatform();
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
    result.append(", group1: ");
    result.append(group1);
    result.append(", id: ");
    result.append(id);
    result.append(", platform: ");
    if (platformESet) result.append(platform); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //ProfileCGTypeImpl
