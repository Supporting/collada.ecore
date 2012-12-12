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

import org.khronos.collada.AnimationClipType;
import org.khronos.collada.AssetType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.InstanceWithExtra;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animation Clip Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.AnimationClipTypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationClipTypeImpl#getInstanceAnimation <em>Instance Animation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationClipTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationClipTypeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationClipTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationClipTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationClipTypeImpl#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnimationClipTypeImpl extends EObjectImpl implements AnimationClipType {
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
   * The cached value of the '{@link #getInstanceAnimation() <em>Instance Animation</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstanceAnimation()
   * @generated
   * @ordered
   */
	protected EList<InstanceWithExtra> instanceAnimation;

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
   * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
	protected static final double END_EDEFAULT = 0.0;

	/**
   * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
	protected double end = END_EDEFAULT;

	/**
   * This is true if the End attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean endESet;

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
   * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
	protected static final double START_EDEFAULT = 0.0;

	/**
   * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
	protected double start = START_EDEFAULT;

	/**
   * This is true if the Start attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean startESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AnimationClipTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getAnimationClipType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.ANIMATION_CLIP_TYPE__ASSET, oldAsset, newAsset);
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
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ANIMATION_CLIP_TYPE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ANIMATION_CLIP_TYPE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ANIMATION_CLIP_TYPE__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<InstanceWithExtra> getInstanceAnimation() {
    if (instanceAnimation == null)
    {
      instanceAnimation = new EObjectContainmentEList<InstanceWithExtra>(InstanceWithExtra.class, this, ColladaPackage.ANIMATION_CLIP_TYPE__INSTANCE_ANIMATION);
    }
    return instanceAnimation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.ANIMATION_CLIP_TYPE__EXTRA);
    }
    return extra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public double getEnd() {
    return end;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setEnd(double newEnd) {
    double oldEnd = end;
    end = newEnd;
    boolean oldEndESet = endESet;
    endESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ANIMATION_CLIP_TYPE__END, oldEnd, end, !oldEndESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetEnd() {
    double oldEnd = end;
    boolean oldEndESet = endESet;
    end = END_EDEFAULT;
    endESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.ANIMATION_CLIP_TYPE__END, oldEnd, END_EDEFAULT, oldEndESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetEnd() {
    return endESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ANIMATION_CLIP_TYPE__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ANIMATION_CLIP_TYPE__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public double getStart() {
    return start;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setStart(double newStart) {
    double oldStart = start;
    start = newStart;
    boolean oldStartESet = startESet;
    startESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ANIMATION_CLIP_TYPE__START, oldStart, start, !oldStartESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetStart() {
    double oldStart = start;
    boolean oldStartESet = startESet;
    start = START_EDEFAULT;
    startESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.ANIMATION_CLIP_TYPE__START, oldStart, START_EDEFAULT, oldStartESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetStart() {
    return startESet;
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
      case ColladaPackage.ANIMATION_CLIP_TYPE__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.ANIMATION_CLIP_TYPE__INSTANCE_ANIMATION:
        return ((InternalEList<?>)getInstanceAnimation()).basicRemove(otherEnd, msgs);
      case ColladaPackage.ANIMATION_CLIP_TYPE__EXTRA:
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
      case ColladaPackage.ANIMATION_CLIP_TYPE__ASSET:
        return getAsset();
      case ColladaPackage.ANIMATION_CLIP_TYPE__INSTANCE_ANIMATION:
        return getInstanceAnimation();
      case ColladaPackage.ANIMATION_CLIP_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.ANIMATION_CLIP_TYPE__END:
        return getEnd();
      case ColladaPackage.ANIMATION_CLIP_TYPE__ID:
        return getId();
      case ColladaPackage.ANIMATION_CLIP_TYPE__NAME:
        return getName();
      case ColladaPackage.ANIMATION_CLIP_TYPE__START:
        return getStart();
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
      case ColladaPackage.ANIMATION_CLIP_TYPE__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.ANIMATION_CLIP_TYPE__INSTANCE_ANIMATION:
        getInstanceAnimation().clear();
        getInstanceAnimation().addAll((Collection<? extends InstanceWithExtra>)newValue);
        return;
      case ColladaPackage.ANIMATION_CLIP_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.ANIMATION_CLIP_TYPE__END:
        setEnd((Double)newValue);
        return;
      case ColladaPackage.ANIMATION_CLIP_TYPE__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.ANIMATION_CLIP_TYPE__NAME:
        setName((String)newValue);
        return;
      case ColladaPackage.ANIMATION_CLIP_TYPE__START:
        setStart((Double)newValue);
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
      case ColladaPackage.ANIMATION_CLIP_TYPE__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.ANIMATION_CLIP_TYPE__INSTANCE_ANIMATION:
        getInstanceAnimation().clear();
        return;
      case ColladaPackage.ANIMATION_CLIP_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.ANIMATION_CLIP_TYPE__END:
        unsetEnd();
        return;
      case ColladaPackage.ANIMATION_CLIP_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.ANIMATION_CLIP_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ColladaPackage.ANIMATION_CLIP_TYPE__START:
        unsetStart();
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
      case ColladaPackage.ANIMATION_CLIP_TYPE__ASSET:
        return asset != null;
      case ColladaPackage.ANIMATION_CLIP_TYPE__INSTANCE_ANIMATION:
        return instanceAnimation != null && !instanceAnimation.isEmpty();
      case ColladaPackage.ANIMATION_CLIP_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.ANIMATION_CLIP_TYPE__END:
        return isSetEnd();
      case ColladaPackage.ANIMATION_CLIP_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.ANIMATION_CLIP_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ColladaPackage.ANIMATION_CLIP_TYPE__START:
        return isSetStart();
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
    result.append(" (end: ");
    if (endESet) result.append(end); else result.append("<unset>");
    result.append(", id: ");
    result.append(id);
    result.append(", name: ");
    result.append(name);
    result.append(", start: ");
    if (startESet) result.append(start); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //AnimationClipTypeImpl
