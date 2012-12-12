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
import org.khronos.collada.CameraType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.ImagerType;
import org.khronos.collada.OpticsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.CameraTypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CameraTypeImpl#getOptics <em>Optics</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CameraTypeImpl#getImager <em>Imager</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CameraTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CameraTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CameraTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CameraTypeImpl extends EObjectImpl implements CameraType {
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
   * The cached value of the '{@link #getOptics() <em>Optics</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOptics()
   * @generated
   * @ordered
   */
	protected OpticsType optics;

	/**
   * The cached value of the '{@link #getImager() <em>Imager</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImager()
   * @generated
   * @ordered
   */
	protected ImagerType imager;

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
	protected CameraTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getCameraType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.CAMERA_TYPE__ASSET, oldAsset, newAsset);
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
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CAMERA_TYPE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CAMERA_TYPE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CAMERA_TYPE__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public OpticsType getOptics() {
    return optics;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetOptics(OpticsType newOptics, NotificationChain msgs) {
    OpticsType oldOptics = optics;
    optics = newOptics;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.CAMERA_TYPE__OPTICS, oldOptics, newOptics);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setOptics(OpticsType newOptics) {
    if (newOptics != optics)
    {
      NotificationChain msgs = null;
      if (optics != null)
        msgs = ((InternalEObject)optics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CAMERA_TYPE__OPTICS, null, msgs);
      if (newOptics != null)
        msgs = ((InternalEObject)newOptics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CAMERA_TYPE__OPTICS, null, msgs);
      msgs = basicSetOptics(newOptics, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CAMERA_TYPE__OPTICS, newOptics, newOptics));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ImagerType getImager() {
    return imager;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetImager(ImagerType newImager, NotificationChain msgs) {
    ImagerType oldImager = imager;
    imager = newImager;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.CAMERA_TYPE__IMAGER, oldImager, newImager);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setImager(ImagerType newImager) {
    if (newImager != imager)
    {
      NotificationChain msgs = null;
      if (imager != null)
        msgs = ((InternalEObject)imager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CAMERA_TYPE__IMAGER, null, msgs);
      if (newImager != null)
        msgs = ((InternalEObject)newImager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CAMERA_TYPE__IMAGER, null, msgs);
      msgs = basicSetImager(newImager, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CAMERA_TYPE__IMAGER, newImager, newImager));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.CAMERA_TYPE__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CAMERA_TYPE__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CAMERA_TYPE__NAME, oldName, name));
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
      case ColladaPackage.CAMERA_TYPE__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.CAMERA_TYPE__OPTICS:
        return basicSetOptics(null, msgs);
      case ColladaPackage.CAMERA_TYPE__IMAGER:
        return basicSetImager(null, msgs);
      case ColladaPackage.CAMERA_TYPE__EXTRA:
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
      case ColladaPackage.CAMERA_TYPE__ASSET:
        return getAsset();
      case ColladaPackage.CAMERA_TYPE__OPTICS:
        return getOptics();
      case ColladaPackage.CAMERA_TYPE__IMAGER:
        return getImager();
      case ColladaPackage.CAMERA_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.CAMERA_TYPE__ID:
        return getId();
      case ColladaPackage.CAMERA_TYPE__NAME:
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
      case ColladaPackage.CAMERA_TYPE__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.CAMERA_TYPE__OPTICS:
        setOptics((OpticsType)newValue);
        return;
      case ColladaPackage.CAMERA_TYPE__IMAGER:
        setImager((ImagerType)newValue);
        return;
      case ColladaPackage.CAMERA_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.CAMERA_TYPE__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.CAMERA_TYPE__NAME:
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
      case ColladaPackage.CAMERA_TYPE__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.CAMERA_TYPE__OPTICS:
        setOptics((OpticsType)null);
        return;
      case ColladaPackage.CAMERA_TYPE__IMAGER:
        setImager((ImagerType)null);
        return;
      case ColladaPackage.CAMERA_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.CAMERA_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.CAMERA_TYPE__NAME:
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
      case ColladaPackage.CAMERA_TYPE__ASSET:
        return asset != null;
      case ColladaPackage.CAMERA_TYPE__OPTICS:
        return optics != null;
      case ColladaPackage.CAMERA_TYPE__IMAGER:
        return imager != null;
      case ColladaPackage.CAMERA_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.CAMERA_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.CAMERA_TYPE__NAME:
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

} //CameraTypeImpl
