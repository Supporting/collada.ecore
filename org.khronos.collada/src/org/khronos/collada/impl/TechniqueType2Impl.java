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
import org.khronos.collada.BlinnType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.CommonNewparamType;
import org.khronos.collada.ConstantType;
import org.khronos.collada.ExtraType;
import org.khronos.collada.ImageType;
import org.khronos.collada.LambertType;
import org.khronos.collada.PhongType;
import org.khronos.collada.TechniqueType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technique Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TechniqueType2Impl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType2Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType2Impl#getImage <em>Image</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType2Impl#getNewparam <em>Newparam</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType2Impl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType2Impl#getLambert <em>Lambert</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType2Impl#getPhong <em>Phong</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType2Impl#getBlinn <em>Blinn</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType2Impl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType2Impl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType2Impl#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechniqueType2Impl extends EObjectImpl implements TechniqueType2 {
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
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
	protected ConstantType constant;

	/**
   * The cached value of the '{@link #getLambert() <em>Lambert</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLambert()
   * @generated
   * @ordered
   */
	protected LambertType lambert;

	/**
   * The cached value of the '{@link #getPhong() <em>Phong</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPhong()
   * @generated
   * @ordered
   */
	protected PhongType phong;

	/**
   * The cached value of the '{@link #getBlinn() <em>Blinn</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBlinn()
   * @generated
   * @ordered
   */
	protected BlinnType blinn;

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
   * The default value of the '{@link #getSid() <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSid()
   * @generated
   * @ordered
   */
	protected static final String SID_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSid() <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSid()
   * @generated
   * @ordered
   */
	protected String sid = SID_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TechniqueType2Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTechniqueType2();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE2__ASSET, oldAsset, newAsset);
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
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_TYPE2__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_TYPE2__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE2__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null)
    {
      group = new BasicFeatureMap(this, ColladaPackage.TECHNIQUE_TYPE2__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ImageType> getImage() {
    return getGroup().list(ColladaPackage.eINSTANCE.getTechniqueType2_Image());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CommonNewparamType> getNewparam() {
    return getGroup().list(ColladaPackage.eINSTANCE.getTechniqueType2_Newparam());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ConstantType getConstant() {
    return constant;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetConstant(ConstantType newConstant, NotificationChain msgs) {
    ConstantType oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE2__CONSTANT, oldConstant, newConstant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setConstant(ConstantType newConstant) {
    if (newConstant != constant)
    {
      NotificationChain msgs = null;
      if (constant != null)
        msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_TYPE2__CONSTANT, null, msgs);
      if (newConstant != null)
        msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_TYPE2__CONSTANT, null, msgs);
      msgs = basicSetConstant(newConstant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE2__CONSTANT, newConstant, newConstant));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LambertType getLambert() {
    return lambert;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLambert(LambertType newLambert, NotificationChain msgs) {
    LambertType oldLambert = lambert;
    lambert = newLambert;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE2__LAMBERT, oldLambert, newLambert);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLambert(LambertType newLambert) {
    if (newLambert != lambert)
    {
      NotificationChain msgs = null;
      if (lambert != null)
        msgs = ((InternalEObject)lambert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_TYPE2__LAMBERT, null, msgs);
      if (newLambert != null)
        msgs = ((InternalEObject)newLambert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_TYPE2__LAMBERT, null, msgs);
      msgs = basicSetLambert(newLambert, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE2__LAMBERT, newLambert, newLambert));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhongType getPhong() {
    return phong;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPhong(PhongType newPhong, NotificationChain msgs) {
    PhongType oldPhong = phong;
    phong = newPhong;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE2__PHONG, oldPhong, newPhong);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPhong(PhongType newPhong) {
    if (newPhong != phong)
    {
      NotificationChain msgs = null;
      if (phong != null)
        msgs = ((InternalEObject)phong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_TYPE2__PHONG, null, msgs);
      if (newPhong != null)
        msgs = ((InternalEObject)newPhong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_TYPE2__PHONG, null, msgs);
      msgs = basicSetPhong(newPhong, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE2__PHONG, newPhong, newPhong));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BlinnType getBlinn() {
    return blinn;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetBlinn(BlinnType newBlinn, NotificationChain msgs) {
    BlinnType oldBlinn = blinn;
    blinn = newBlinn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE2__BLINN, oldBlinn, newBlinn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBlinn(BlinnType newBlinn) {
    if (newBlinn != blinn)
    {
      NotificationChain msgs = null;
      if (blinn != null)
        msgs = ((InternalEObject)blinn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_TYPE2__BLINN, null, msgs);
      if (newBlinn != null)
        msgs = ((InternalEObject)newBlinn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_TYPE2__BLINN, null, msgs);
      msgs = basicSetBlinn(newBlinn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE2__BLINN, newBlinn, newBlinn));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.TECHNIQUE_TYPE2__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE2__ID, oldId, id));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSid() {
    return sid;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSid(String newSid) {
    String oldSid = sid;
    sid = newSid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE2__SID, oldSid, sid));
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
      case ColladaPackage.TECHNIQUE_TYPE2__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.TECHNIQUE_TYPE2__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE2__IMAGE:
        return ((InternalEList<?>)getImage()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE2__NEWPARAM:
        return ((InternalEList<?>)getNewparam()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE2__CONSTANT:
        return basicSetConstant(null, msgs);
      case ColladaPackage.TECHNIQUE_TYPE2__LAMBERT:
        return basicSetLambert(null, msgs);
      case ColladaPackage.TECHNIQUE_TYPE2__PHONG:
        return basicSetPhong(null, msgs);
      case ColladaPackage.TECHNIQUE_TYPE2__BLINN:
        return basicSetBlinn(null, msgs);
      case ColladaPackage.TECHNIQUE_TYPE2__EXTRA:
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
      case ColladaPackage.TECHNIQUE_TYPE2__ASSET:
        return getAsset();
      case ColladaPackage.TECHNIQUE_TYPE2__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.TECHNIQUE_TYPE2__IMAGE:
        return getImage();
      case ColladaPackage.TECHNIQUE_TYPE2__NEWPARAM:
        return getNewparam();
      case ColladaPackage.TECHNIQUE_TYPE2__CONSTANT:
        return getConstant();
      case ColladaPackage.TECHNIQUE_TYPE2__LAMBERT:
        return getLambert();
      case ColladaPackage.TECHNIQUE_TYPE2__PHONG:
        return getPhong();
      case ColladaPackage.TECHNIQUE_TYPE2__BLINN:
        return getBlinn();
      case ColladaPackage.TECHNIQUE_TYPE2__EXTRA:
        return getExtra();
      case ColladaPackage.TECHNIQUE_TYPE2__ID:
        return getId();
      case ColladaPackage.TECHNIQUE_TYPE2__SID:
        return getSid();
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
      case ColladaPackage.TECHNIQUE_TYPE2__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__IMAGE:
        getImage().clear();
        getImage().addAll((Collection<? extends ImageType>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__NEWPARAM:
        getNewparam().clear();
        getNewparam().addAll((Collection<? extends CommonNewparamType>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__CONSTANT:
        setConstant((ConstantType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__LAMBERT:
        setLambert((LambertType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__PHONG:
        setPhong((PhongType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__BLINN:
        setBlinn((BlinnType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__SID:
        setSid((String)newValue);
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
      case ColladaPackage.TECHNIQUE_TYPE2__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__IMAGE:
        getImage().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__NEWPARAM:
        getNewparam().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__CONSTANT:
        setConstant((ConstantType)null);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__LAMBERT:
        setLambert((LambertType)null);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__PHONG:
        setPhong((PhongType)null);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__BLINN:
        setBlinn((BlinnType)null);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.TECHNIQUE_TYPE2__SID:
        setSid(SID_EDEFAULT);
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
      case ColladaPackage.TECHNIQUE_TYPE2__ASSET:
        return asset != null;
      case ColladaPackage.TECHNIQUE_TYPE2__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE2__IMAGE:
        return !getImage().isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE2__NEWPARAM:
        return !getNewparam().isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE2__CONSTANT:
        return constant != null;
      case ColladaPackage.TECHNIQUE_TYPE2__LAMBERT:
        return lambert != null;
      case ColladaPackage.TECHNIQUE_TYPE2__PHONG:
        return phong != null;
      case ColladaPackage.TECHNIQUE_TYPE2__BLINN:
        return blinn != null;
      case ColladaPackage.TECHNIQUE_TYPE2__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE2__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.TECHNIQUE_TYPE2__SID:
        return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
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
    result.append(", sid: ");
    result.append(sid);
    result.append(')');
    return result.toString();
  }

} //TechniqueType2Impl
