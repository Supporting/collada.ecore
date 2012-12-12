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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.AssetType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ControllerType;
import org.khronos.collada.ExtraType;
import org.khronos.collada.MorphType;
import org.khronos.collada.SkinType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.ControllerTypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ControllerTypeImpl#getSkin <em>Skin</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ControllerTypeImpl#getMorph <em>Morph</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ControllerTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ControllerTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ControllerTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerTypeImpl extends EObjectImpl implements ControllerType {
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
   * The cached value of the '{@link #getSkin() <em>Skin</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSkin()
   * @generated
   * @ordered
   */
	protected SkinType skin;

	/**
   * The cached value of the '{@link #getMorph() <em>Morph</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMorph()
   * @generated
   * @ordered
   */
	protected MorphType morph;

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
	protected ControllerTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getControllerType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.CONTROLLER_TYPE__ASSET, oldAsset, newAsset);
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
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CONTROLLER_TYPE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CONTROLLER_TYPE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CONTROLLER_TYPE__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SkinType getSkin() {
    return skin;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSkin(SkinType newSkin, NotificationChain msgs) {
    SkinType oldSkin = skin;
    skin = newSkin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.CONTROLLER_TYPE__SKIN, oldSkin, newSkin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSkin(SkinType newSkin) {
    if (newSkin != skin)
    {
      NotificationChain msgs = null;
      if (skin != null)
        msgs = ((InternalEObject)skin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CONTROLLER_TYPE__SKIN, null, msgs);
      if (newSkin != null)
        msgs = ((InternalEObject)newSkin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CONTROLLER_TYPE__SKIN, null, msgs);
      msgs = basicSetSkin(newSkin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CONTROLLER_TYPE__SKIN, newSkin, newSkin));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MorphType getMorph() {
    return morph;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMorph(MorphType newMorph, NotificationChain msgs) {
    MorphType oldMorph = morph;
    morph = newMorph;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.CONTROLLER_TYPE__MORPH, oldMorph, newMorph);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMorph(MorphType newMorph) {
    if (newMorph != morph)
    {
      NotificationChain msgs = null;
      if (morph != null)
        msgs = ((InternalEObject)morph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CONTROLLER_TYPE__MORPH, null, msgs);
      if (newMorph != null)
        msgs = ((InternalEObject)newMorph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CONTROLLER_TYPE__MORPH, null, msgs);
      msgs = basicSetMorph(newMorph, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CONTROLLER_TYPE__MORPH, newMorph, newMorph));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.CONTROLLER_TYPE__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CONTROLLER_TYPE__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CONTROLLER_TYPE__NAME, oldName, name));
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
      case ColladaPackage.CONTROLLER_TYPE__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.CONTROLLER_TYPE__SKIN:
        return basicSetSkin(null, msgs);
      case ColladaPackage.CONTROLLER_TYPE__MORPH:
        return basicSetMorph(null, msgs);
      case ColladaPackage.CONTROLLER_TYPE__EXTRA:
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
      case ColladaPackage.CONTROLLER_TYPE__ASSET:
        return getAsset();
      case ColladaPackage.CONTROLLER_TYPE__SKIN:
        return getSkin();
      case ColladaPackage.CONTROLLER_TYPE__MORPH:
        return getMorph();
      case ColladaPackage.CONTROLLER_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.CONTROLLER_TYPE__ID:
        return getId();
      case ColladaPackage.CONTROLLER_TYPE__NAME:
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
      case ColladaPackage.CONTROLLER_TYPE__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.CONTROLLER_TYPE__SKIN:
        setSkin((SkinType)newValue);
        return;
      case ColladaPackage.CONTROLLER_TYPE__MORPH:
        setMorph((MorphType)newValue);
        return;
      case ColladaPackage.CONTROLLER_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.CONTROLLER_TYPE__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.CONTROLLER_TYPE__NAME:
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
      case ColladaPackage.CONTROLLER_TYPE__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.CONTROLLER_TYPE__SKIN:
        setSkin((SkinType)null);
        return;
      case ColladaPackage.CONTROLLER_TYPE__MORPH:
        setMorph((MorphType)null);
        return;
      case ColladaPackage.CONTROLLER_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.CONTROLLER_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.CONTROLLER_TYPE__NAME:
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
      case ColladaPackage.CONTROLLER_TYPE__ASSET:
        return asset != null;
      case ColladaPackage.CONTROLLER_TYPE__SKIN:
        return skin != null;
      case ColladaPackage.CONTROLLER_TYPE__MORPH:
        return morph != null;
      case ColladaPackage.CONTROLLER_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.CONTROLLER_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.CONTROLLER_TYPE__NAME:
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
    result.append(" (id: ");
    result.append(id);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ControllerTypeImpl
