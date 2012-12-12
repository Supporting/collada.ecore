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
import org.khronos.collada.ExtraType;
import org.khronos.collada.FxAnnotateCommon;
import org.khronos.collada.FxCodeProfile;
import org.khronos.collada.FxIncludeCommon;
import org.khronos.collada.GlslNewparam;
import org.khronos.collada.GlslSetparam;
import org.khronos.collada.GlesNewparam;
import org.khronos.collada.ImageType;
import org.khronos.collada.PassType;
import org.khronos.collada.SetparamType;
import org.khronos.collada.TechniqueType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technique Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TechniqueType1Impl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType1Impl#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType1Impl#getImage <em>Image</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType1Impl#getNewparam <em>Newparam</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType1Impl#getSetparam <em>Setparam</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType1Impl#getPass <em>Pass</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType1Impl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType1Impl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueType1Impl#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechniqueType1Impl extends EObjectImpl implements TechniqueType1 {
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
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
	protected FeatureMap group;

	/**
   * The cached value of the '{@link #getPass() <em>Pass</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPass()
   * @generated
   * @ordered
   */
	protected EList<PassType> pass;

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
	protected TechniqueType1Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTechniqueType1();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE1__ASSET, oldAsset, newAsset);
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
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_TYPE1__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_TYPE1__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE1__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxAnnotateCommon> getAnnotate() {
    if (annotate == null)
    {
      annotate = new EObjectContainmentEList<FxAnnotateCommon>(FxAnnotateCommon.class, this, ColladaPackage.TECHNIQUE_TYPE1__ANNOTATE);
    }
    return annotate;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null)
    {
      group = new BasicFeatureMap(this, ColladaPackage.TECHNIQUE_TYPE1__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ImageType> getImage() {
    return getGroup().list(ColladaPackage.eINSTANCE.getTechniqueType1_Image());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<GlesNewparam> getNewparam() {
    return getGroup().list(ColladaPackage.eINSTANCE.getTechniqueType1_Newparam());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SetparamType> getSetparam() {
    return getGroup().list(ColladaPackage.eINSTANCE.getTechniqueType1_Setparam());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PassType> getPass() {
    if (pass == null)
    {
      pass = new EObjectContainmentEList<PassType>(PassType.class, this, ColladaPackage.TECHNIQUE_TYPE1__PASS);
    }
    return pass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.TECHNIQUE_TYPE1__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE1__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE1__SID, oldSid, sid));
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
      case ColladaPackage.TECHNIQUE_TYPE1__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.TECHNIQUE_TYPE1__ANNOTATE:
        return ((InternalEList<?>)getAnnotate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE1__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE1__IMAGE:
        return ((InternalEList<?>)getImage()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE1__NEWPARAM:
        return ((InternalEList<?>)getNewparam()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE1__SETPARAM:
        return ((InternalEList<?>)getSetparam()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE1__PASS:
        return ((InternalEList<?>)getPass()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE1__EXTRA:
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
      case ColladaPackage.TECHNIQUE_TYPE1__ASSET:
        return getAsset();
      case ColladaPackage.TECHNIQUE_TYPE1__ANNOTATE:
        return getAnnotate();
      case ColladaPackage.TECHNIQUE_TYPE1__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.TECHNIQUE_TYPE1__IMAGE:
        return getImage();
      case ColladaPackage.TECHNIQUE_TYPE1__NEWPARAM:
        return getNewparam();
      case ColladaPackage.TECHNIQUE_TYPE1__SETPARAM:
        return getSetparam();
      case ColladaPackage.TECHNIQUE_TYPE1__PASS:
        return getPass();
      case ColladaPackage.TECHNIQUE_TYPE1__EXTRA:
        return getExtra();
      case ColladaPackage.TECHNIQUE_TYPE1__ID:
        return getId();
      case ColladaPackage.TECHNIQUE_TYPE1__SID:
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
      case ColladaPackage.TECHNIQUE_TYPE1__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__ANNOTATE:
        getAnnotate().clear();
        getAnnotate().addAll((Collection<? extends FxAnnotateCommon>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__IMAGE:
        getImage().clear();
        getImage().addAll((Collection<? extends ImageType>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__NEWPARAM:
        getNewparam().clear();
        getNewparam().addAll((Collection<? extends GlesNewparam>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__SETPARAM:
        getSetparam().clear();
        getSetparam().addAll((Collection<? extends SetparamType>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__PASS:
        getPass().clear();
        getPass().addAll((Collection<? extends PassType>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__SID:
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
      case ColladaPackage.TECHNIQUE_TYPE1__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__ANNOTATE:
        getAnnotate().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__IMAGE:
        getImage().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__NEWPARAM:
        getNewparam().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__SETPARAM:
        getSetparam().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__PASS:
        getPass().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.TECHNIQUE_TYPE1__SID:
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
      case ColladaPackage.TECHNIQUE_TYPE1__ASSET:
        return asset != null;
      case ColladaPackage.TECHNIQUE_TYPE1__ANNOTATE:
        return annotate != null && !annotate.isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE1__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE1__IMAGE:
        return !getImage().isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE1__NEWPARAM:
        return !getNewparam().isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE1__SETPARAM:
        return !getSetparam().isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE1__PASS:
        return pass != null && !pass.isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE1__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE1__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.TECHNIQUE_TYPE1__SID:
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

} //TechniqueType1Impl
