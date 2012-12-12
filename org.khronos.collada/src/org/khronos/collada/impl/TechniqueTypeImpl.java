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
import org.khronos.collada.CgSetparam;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.FxAnnotateCommon;
import org.khronos.collada.GlesNewparam;
import org.khronos.collada.FxCodeProfile;
import org.khronos.collada.FxIncludeCommon;
import org.khronos.collada.ImageType;
import org.khronos.collada.PassType1;
import org.khronos.collada.SetparamType;
import org.khronos.collada.PassType2;
import org.khronos.collada.TechniqueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technique Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TechniqueTypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueTypeImpl#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueTypeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueTypeImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueTypeImpl#getNewparam <em>Newparam</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueTypeImpl#getSetparam <em>Setparam</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueTypeImpl#getPass <em>Pass</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueTypeImpl#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechniqueTypeImpl extends EObjectImpl implements TechniqueType {
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
   * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGroup1()
   * @generated
   * @ordered
   */
	protected FeatureMap group1;

	/**
   * The cached value of the '{@link #getPass() <em>Pass</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPass()
   * @generated
   * @ordered
   */
	protected EList<PassType2> pass;

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
	protected TechniqueTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTechniqueType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE__ASSET, oldAsset, newAsset);
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
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_TYPE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_TYPE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxAnnotateCommon> getAnnotate() {
    if (annotate == null)
    {
      annotate = new EObjectContainmentEList<FxAnnotateCommon>(FxAnnotateCommon.class, this, ColladaPackage.TECHNIQUE_TYPE__ANNOTATE);
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
      group = new BasicFeatureMap(this, ColladaPackage.TECHNIQUE_TYPE__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxCodeProfile> getCode() {
    return getGroup().list(ColladaPackage.eINSTANCE.getTechniqueType_Code());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxIncludeCommon> getInclude() {
    return getGroup().list(ColladaPackage.eINSTANCE.getTechniqueType_Include());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup1() {
    if (group1 == null)
    {
      group1 = new BasicFeatureMap(this, ColladaPackage.TECHNIQUE_TYPE__GROUP1);
    }
    return group1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ImageType> getImage() {
    return getGroup1().list(ColladaPackage.eINSTANCE.getTechniqueType_Image());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CgNewparam> getNewparam() {
    return getGroup1().list(ColladaPackage.eINSTANCE.getTechniqueType_Newparam());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CgSetparam> getSetparam() {
    return getGroup1().list(ColladaPackage.eINSTANCE.getTechniqueType_Setparam());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PassType2> getPass() {
    if (pass == null)
    {
      pass = new EObjectContainmentEList<PassType2>(PassType2.class, this, ColladaPackage.TECHNIQUE_TYPE__PASS);
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
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.TECHNIQUE_TYPE__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_TYPE__SID, oldSid, sid));
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
      case ColladaPackage.TECHNIQUE_TYPE__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.TECHNIQUE_TYPE__ANNOTATE:
        return ((InternalEList<?>)getAnnotate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE__CODE:
        return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE__INCLUDE:
        return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE__GROUP1:
        return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE__IMAGE:
        return ((InternalEList<?>)getImage()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE__NEWPARAM:
        return ((InternalEList<?>)getNewparam()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE__SETPARAM:
        return ((InternalEList<?>)getSetparam()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE__PASS:
        return ((InternalEList<?>)getPass()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TECHNIQUE_TYPE__EXTRA:
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
      case ColladaPackage.TECHNIQUE_TYPE__ASSET:
        return getAsset();
      case ColladaPackage.TECHNIQUE_TYPE__ANNOTATE:
        return getAnnotate();
      case ColladaPackage.TECHNIQUE_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.TECHNIQUE_TYPE__CODE:
        return getCode();
      case ColladaPackage.TECHNIQUE_TYPE__INCLUDE:
        return getInclude();
      case ColladaPackage.TECHNIQUE_TYPE__GROUP1:
        if (coreType) return getGroup1();
        return ((FeatureMap.Internal)getGroup1()).getWrapper();
      case ColladaPackage.TECHNIQUE_TYPE__IMAGE:
        return getImage();
      case ColladaPackage.TECHNIQUE_TYPE__NEWPARAM:
        return getNewparam();
      case ColladaPackage.TECHNIQUE_TYPE__SETPARAM:
        return getSetparam();
      case ColladaPackage.TECHNIQUE_TYPE__PASS:
        return getPass();
      case ColladaPackage.TECHNIQUE_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.TECHNIQUE_TYPE__ID:
        return getId();
      case ColladaPackage.TECHNIQUE_TYPE__SID:
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
      case ColladaPackage.TECHNIQUE_TYPE__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE__ANNOTATE:
        getAnnotate().clear();
        getAnnotate().addAll((Collection<? extends FxAnnotateCommon>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE__CODE:
        getCode().clear();
        getCode().addAll((Collection<? extends FxCodeProfile>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE__INCLUDE:
        getInclude().clear();
        getInclude().addAll((Collection<? extends FxIncludeCommon>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE__GROUP1:
        ((FeatureMap.Internal)getGroup1()).set(newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE__IMAGE:
        getImage().clear();
        getImage().addAll((Collection<? extends ImageType>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE__NEWPARAM:
        getNewparam().clear();
        getNewparam().addAll((Collection<? extends CgNewparam>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE__SETPARAM:
        getSetparam().clear();
        getSetparam().addAll((Collection<? extends CgSetparam>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE__PASS:
        getPass().clear();
        getPass().addAll((Collection<? extends PassType2>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.TECHNIQUE_TYPE__SID:
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
      case ColladaPackage.TECHNIQUE_TYPE__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.TECHNIQUE_TYPE__ANNOTATE:
        getAnnotate().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE__CODE:
        getCode().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE__INCLUDE:
        getInclude().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE__GROUP1:
        getGroup1().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE__IMAGE:
        getImage().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE__NEWPARAM:
        getNewparam().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE__SETPARAM:
        getSetparam().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE__PASS:
        getPass().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.TECHNIQUE_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.TECHNIQUE_TYPE__SID:
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
      case ColladaPackage.TECHNIQUE_TYPE__ASSET:
        return asset != null;
      case ColladaPackage.TECHNIQUE_TYPE__ANNOTATE:
        return annotate != null && !annotate.isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE__CODE:
        return !getCode().isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE__INCLUDE:
        return !getInclude().isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE__GROUP1:
        return group1 != null && !group1.isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE__IMAGE:
        return !getImage().isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE__NEWPARAM:
        return !getNewparam().isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE__SETPARAM:
        return !getSetparam().isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE__PASS:
        return pass != null && !pass.isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.TECHNIQUE_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.TECHNIQUE_TYPE__SID:
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
    result.append(", group1: ");
    result.append(group1);
    result.append(", id: ");
    result.append(id);
    result.append(", sid: ");
    result.append(sid);
    result.append(')');
    return result.toString();
  }

} //TechniqueTypeImpl
