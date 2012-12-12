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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.AssetType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.EffectType;
import org.khronos.collada.ExtraType;
import org.khronos.collada.FxAnnotateCommon;
import org.khronos.collada.FxNewparamCommon;
import org.khronos.collada.ImageType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.EffectTypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.EffectTypeImpl#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.EffectTypeImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.khronos.collada.impl.EffectTypeImpl#getNewparam <em>Newparam</em>}</li>
 *   <li>{@link org.khronos.collada.impl.EffectTypeImpl#getFxProfileAbstractGroup <em>Fx Profile Abstract Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.EffectTypeImpl#getFxProfileAbstract <em>Fx Profile Abstract</em>}</li>
 *   <li>{@link org.khronos.collada.impl.EffectTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.EffectTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.EffectTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EffectTypeImpl extends EObjectImpl implements EffectType {
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
   * The cached value of the '{@link #getAnnotate() <em>Annotate</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnnotate()
   * @generated
   * @ordered
   */
	protected EList<FxAnnotateCommon> annotate;

	/**
   * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
	protected EList<ImageType> image;

	/**
   * The cached value of the '{@link #getNewparam() <em>Newparam</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNewparam()
   * @generated
   * @ordered
   */
	protected EList<FxNewparamCommon> newparam;

	/**
   * The cached value of the '{@link #getFxProfileAbstractGroup() <em>Fx Profile Abstract Group</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFxProfileAbstractGroup()
   * @generated
   * @ordered
   */
	protected FeatureMap fxProfileAbstractGroup;

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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EffectTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getEffectType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.EFFECT_TYPE__ASSET, oldAsset, newAsset);
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
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.EFFECT_TYPE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.EFFECT_TYPE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.EFFECT_TYPE__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxAnnotateCommon> getAnnotate() {
    if (annotate == null)
    {
      annotate = new EObjectContainmentEList<FxAnnotateCommon>(FxAnnotateCommon.class, this, ColladaPackage.EFFECT_TYPE__ANNOTATE);
    }
    return annotate;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ImageType> getImage() {
    if (image == null)
    {
      image = new EObjectContainmentEList<ImageType>(ImageType.class, this, ColladaPackage.EFFECT_TYPE__IMAGE);
    }
    return image;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxNewparamCommon> getNewparam() {
    if (newparam == null)
    {
      newparam = new EObjectContainmentEList<FxNewparamCommon>(FxNewparamCommon.class, this, ColladaPackage.EFFECT_TYPE__NEWPARAM);
    }
    return newparam;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getFxProfileAbstractGroup() {
    if (fxProfileAbstractGroup == null)
    {
      fxProfileAbstractGroup = new BasicFeatureMap(this, ColladaPackage.EFFECT_TYPE__FX_PROFILE_ABSTRACT_GROUP);
    }
    return fxProfileAbstractGroup;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<EObject> getFxProfileAbstract() {
    return getFxProfileAbstractGroup().list(ColladaPackage.eINSTANCE.getEffectType_FxProfileAbstract());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.EFFECT_TYPE__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.EFFECT_TYPE__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.EFFECT_TYPE__NAME, oldName, name));
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
      case ColladaPackage.EFFECT_TYPE__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.EFFECT_TYPE__ANNOTATE:
        return ((InternalEList<?>)getAnnotate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.EFFECT_TYPE__IMAGE:
        return ((InternalEList<?>)getImage()).basicRemove(otherEnd, msgs);
      case ColladaPackage.EFFECT_TYPE__NEWPARAM:
        return ((InternalEList<?>)getNewparam()).basicRemove(otherEnd, msgs);
      case ColladaPackage.EFFECT_TYPE__FX_PROFILE_ABSTRACT_GROUP:
        return ((InternalEList<?>)getFxProfileAbstractGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.EFFECT_TYPE__FX_PROFILE_ABSTRACT:
        return ((InternalEList<?>)getFxProfileAbstract()).basicRemove(otherEnd, msgs);
      case ColladaPackage.EFFECT_TYPE__EXTRA:
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
      case ColladaPackage.EFFECT_TYPE__ASSET:
        return getAsset();
      case ColladaPackage.EFFECT_TYPE__ANNOTATE:
        return getAnnotate();
      case ColladaPackage.EFFECT_TYPE__IMAGE:
        return getImage();
      case ColladaPackage.EFFECT_TYPE__NEWPARAM:
        return getNewparam();
      case ColladaPackage.EFFECT_TYPE__FX_PROFILE_ABSTRACT_GROUP:
        if (coreType) return getFxProfileAbstractGroup();
        return ((FeatureMap.Internal)getFxProfileAbstractGroup()).getWrapper();
      case ColladaPackage.EFFECT_TYPE__FX_PROFILE_ABSTRACT:
        return getFxProfileAbstract();
      case ColladaPackage.EFFECT_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.EFFECT_TYPE__ID:
        return getId();
      case ColladaPackage.EFFECT_TYPE__NAME:
        return getName();
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
      case ColladaPackage.EFFECT_TYPE__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.EFFECT_TYPE__ANNOTATE:
        getAnnotate().clear();
        getAnnotate().addAll((Collection<? extends FxAnnotateCommon>)newValue);
        return;
      case ColladaPackage.EFFECT_TYPE__IMAGE:
        getImage().clear();
        getImage().addAll((Collection<? extends ImageType>)newValue);
        return;
      case ColladaPackage.EFFECT_TYPE__NEWPARAM:
        getNewparam().clear();
        getNewparam().addAll((Collection<? extends FxNewparamCommon>)newValue);
        return;
      case ColladaPackage.EFFECT_TYPE__FX_PROFILE_ABSTRACT_GROUP:
        ((FeatureMap.Internal)getFxProfileAbstractGroup()).set(newValue);
        return;
      case ColladaPackage.EFFECT_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.EFFECT_TYPE__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.EFFECT_TYPE__NAME:
        setName((String)newValue);
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
      case ColladaPackage.EFFECT_TYPE__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.EFFECT_TYPE__ANNOTATE:
        getAnnotate().clear();
        return;
      case ColladaPackage.EFFECT_TYPE__IMAGE:
        getImage().clear();
        return;
      case ColladaPackage.EFFECT_TYPE__NEWPARAM:
        getNewparam().clear();
        return;
      case ColladaPackage.EFFECT_TYPE__FX_PROFILE_ABSTRACT_GROUP:
        getFxProfileAbstractGroup().clear();
        return;
      case ColladaPackage.EFFECT_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.EFFECT_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.EFFECT_TYPE__NAME:
        setName(NAME_EDEFAULT);
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
      case ColladaPackage.EFFECT_TYPE__ASSET:
        return asset != null;
      case ColladaPackage.EFFECT_TYPE__ANNOTATE:
        return annotate != null && !annotate.isEmpty();
      case ColladaPackage.EFFECT_TYPE__IMAGE:
        return image != null && !image.isEmpty();
      case ColladaPackage.EFFECT_TYPE__NEWPARAM:
        return newparam != null && !newparam.isEmpty();
      case ColladaPackage.EFFECT_TYPE__FX_PROFILE_ABSTRACT_GROUP:
        return fxProfileAbstractGroup != null && !fxProfileAbstractGroup.isEmpty();
      case ColladaPackage.EFFECT_TYPE__FX_PROFILE_ABSTRACT:
        return !getFxProfileAbstract().isEmpty();
      case ColladaPackage.EFFECT_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.EFFECT_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.EFFECT_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (fxProfileAbstractGroup: ");
    result.append(fxProfileAbstractGroup);
    result.append(", id: ");
    result.append(id);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EffectTypeImpl
