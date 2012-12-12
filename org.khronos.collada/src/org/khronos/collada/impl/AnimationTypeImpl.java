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

import org.khronos.collada.AnimationType;
import org.khronos.collada.AssetType;
import org.khronos.collada.ChannelType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.SamplerType;
import org.khronos.collada.SourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.AnimationTypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationTypeImpl#getSampler <em>Sampler</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationTypeImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationTypeImpl#getAnimation <em>Animation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationTypeImpl#getAnimation1 <em>Animation1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationTypeImpl#getSampler1 <em>Sampler1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationTypeImpl#getChannel1 <em>Channel1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationTypeImpl#getAnimation2 <em>Animation2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationTypeImpl#getAnimation3 <em>Animation3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AnimationTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnimationTypeImpl extends EObjectImpl implements AnimationType {
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
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
	protected EList<SourceType> source;

	/**
   * The cached value of the '{@link #getSampler() <em>Sampler</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSampler()
   * @generated
   * @ordered
   */
	protected EList<SamplerType> sampler;

	/**
   * The cached value of the '{@link #getChannel() <em>Channel</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChannel()
   * @generated
   * @ordered
   */
	protected EList<ChannelType> channel;

	/**
   * The cached value of the '{@link #getAnimation() <em>Animation</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnimation()
   * @generated
   * @ordered
   */
	protected EList<AnimationType> animation;

	/**
   * The cached value of the '{@link #getAnimation1() <em>Animation1</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnimation1()
   * @generated
   * @ordered
   */
	protected EList<AnimationType> animation1;

	/**
   * The cached value of the '{@link #getSampler1() <em>Sampler1</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSampler1()
   * @generated
   * @ordered
   */
	protected EList<SamplerType> sampler1;

	/**
   * The cached value of the '{@link #getChannel1() <em>Channel1</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChannel1()
   * @generated
   * @ordered
   */
	protected EList<ChannelType> channel1;

	/**
   * The cached value of the '{@link #getAnimation2() <em>Animation2</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnimation2()
   * @generated
   * @ordered
   */
	protected EList<AnimationType> animation2;

	/**
   * The cached value of the '{@link #getAnimation3() <em>Animation3</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnimation3()
   * @generated
   * @ordered
   */
	protected EList<AnimationType> animation3;

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
	protected AnimationTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getAnimationType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.ANIMATION_TYPE__ASSET, oldAsset, newAsset);
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
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ANIMATION_TYPE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ANIMATION_TYPE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ANIMATION_TYPE__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SourceType> getSource() {
    if (source == null)
    {
      source = new EObjectContainmentEList<SourceType>(SourceType.class, this, ColladaPackage.ANIMATION_TYPE__SOURCE);
    }
    return source;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SamplerType> getSampler() {
    if (sampler == null)
    {
      sampler = new EObjectContainmentEList<SamplerType>(SamplerType.class, this, ColladaPackage.ANIMATION_TYPE__SAMPLER);
    }
    return sampler;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ChannelType> getChannel() {
    if (channel == null)
    {
      channel = new EObjectContainmentEList<ChannelType>(ChannelType.class, this, ColladaPackage.ANIMATION_TYPE__CHANNEL);
    }
    return channel;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<AnimationType> getAnimation() {
    if (animation == null)
    {
      animation = new EObjectContainmentEList<AnimationType>(AnimationType.class, this, ColladaPackage.ANIMATION_TYPE__ANIMATION);
    }
    return animation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<AnimationType> getAnimation1() {
    if (animation1 == null)
    {
      animation1 = new EObjectContainmentEList<AnimationType>(AnimationType.class, this, ColladaPackage.ANIMATION_TYPE__ANIMATION1);
    }
    return animation1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SamplerType> getSampler1() {
    if (sampler1 == null)
    {
      sampler1 = new EObjectContainmentEList<SamplerType>(SamplerType.class, this, ColladaPackage.ANIMATION_TYPE__SAMPLER1);
    }
    return sampler1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ChannelType> getChannel1() {
    if (channel1 == null)
    {
      channel1 = new EObjectContainmentEList<ChannelType>(ChannelType.class, this, ColladaPackage.ANIMATION_TYPE__CHANNEL1);
    }
    return channel1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<AnimationType> getAnimation2() {
    if (animation2 == null)
    {
      animation2 = new EObjectContainmentEList<AnimationType>(AnimationType.class, this, ColladaPackage.ANIMATION_TYPE__ANIMATION2);
    }
    return animation2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<AnimationType> getAnimation3() {
    if (animation3 == null)
    {
      animation3 = new EObjectContainmentEList<AnimationType>(AnimationType.class, this, ColladaPackage.ANIMATION_TYPE__ANIMATION3);
    }
    return animation3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.ANIMATION_TYPE__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ANIMATION_TYPE__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ANIMATION_TYPE__NAME, oldName, name));
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
      case ColladaPackage.ANIMATION_TYPE__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.ANIMATION_TYPE__SOURCE:
        return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
      case ColladaPackage.ANIMATION_TYPE__SAMPLER:
        return ((InternalEList<?>)getSampler()).basicRemove(otherEnd, msgs);
      case ColladaPackage.ANIMATION_TYPE__CHANNEL:
        return ((InternalEList<?>)getChannel()).basicRemove(otherEnd, msgs);
      case ColladaPackage.ANIMATION_TYPE__ANIMATION:
        return ((InternalEList<?>)getAnimation()).basicRemove(otherEnd, msgs);
      case ColladaPackage.ANIMATION_TYPE__ANIMATION1:
        return ((InternalEList<?>)getAnimation1()).basicRemove(otherEnd, msgs);
      case ColladaPackage.ANIMATION_TYPE__SAMPLER1:
        return ((InternalEList<?>)getSampler1()).basicRemove(otherEnd, msgs);
      case ColladaPackage.ANIMATION_TYPE__CHANNEL1:
        return ((InternalEList<?>)getChannel1()).basicRemove(otherEnd, msgs);
      case ColladaPackage.ANIMATION_TYPE__ANIMATION2:
        return ((InternalEList<?>)getAnimation2()).basicRemove(otherEnd, msgs);
      case ColladaPackage.ANIMATION_TYPE__ANIMATION3:
        return ((InternalEList<?>)getAnimation3()).basicRemove(otherEnd, msgs);
      case ColladaPackage.ANIMATION_TYPE__EXTRA:
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
      case ColladaPackage.ANIMATION_TYPE__ASSET:
        return getAsset();
      case ColladaPackage.ANIMATION_TYPE__SOURCE:
        return getSource();
      case ColladaPackage.ANIMATION_TYPE__SAMPLER:
        return getSampler();
      case ColladaPackage.ANIMATION_TYPE__CHANNEL:
        return getChannel();
      case ColladaPackage.ANIMATION_TYPE__ANIMATION:
        return getAnimation();
      case ColladaPackage.ANIMATION_TYPE__ANIMATION1:
        return getAnimation1();
      case ColladaPackage.ANIMATION_TYPE__SAMPLER1:
        return getSampler1();
      case ColladaPackage.ANIMATION_TYPE__CHANNEL1:
        return getChannel1();
      case ColladaPackage.ANIMATION_TYPE__ANIMATION2:
        return getAnimation2();
      case ColladaPackage.ANIMATION_TYPE__ANIMATION3:
        return getAnimation3();
      case ColladaPackage.ANIMATION_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.ANIMATION_TYPE__ID:
        return getId();
      case ColladaPackage.ANIMATION_TYPE__NAME:
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
      case ColladaPackage.ANIMATION_TYPE__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.ANIMATION_TYPE__SOURCE:
        getSource().clear();
        getSource().addAll((Collection<? extends SourceType>)newValue);
        return;
      case ColladaPackage.ANIMATION_TYPE__SAMPLER:
        getSampler().clear();
        getSampler().addAll((Collection<? extends SamplerType>)newValue);
        return;
      case ColladaPackage.ANIMATION_TYPE__CHANNEL:
        getChannel().clear();
        getChannel().addAll((Collection<? extends ChannelType>)newValue);
        return;
      case ColladaPackage.ANIMATION_TYPE__ANIMATION:
        getAnimation().clear();
        getAnimation().addAll((Collection<? extends AnimationType>)newValue);
        return;
      case ColladaPackage.ANIMATION_TYPE__ANIMATION1:
        getAnimation1().clear();
        getAnimation1().addAll((Collection<? extends AnimationType>)newValue);
        return;
      case ColladaPackage.ANIMATION_TYPE__SAMPLER1:
        getSampler1().clear();
        getSampler1().addAll((Collection<? extends SamplerType>)newValue);
        return;
      case ColladaPackage.ANIMATION_TYPE__CHANNEL1:
        getChannel1().clear();
        getChannel1().addAll((Collection<? extends ChannelType>)newValue);
        return;
      case ColladaPackage.ANIMATION_TYPE__ANIMATION2:
        getAnimation2().clear();
        getAnimation2().addAll((Collection<? extends AnimationType>)newValue);
        return;
      case ColladaPackage.ANIMATION_TYPE__ANIMATION3:
        getAnimation3().clear();
        getAnimation3().addAll((Collection<? extends AnimationType>)newValue);
        return;
      case ColladaPackage.ANIMATION_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.ANIMATION_TYPE__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.ANIMATION_TYPE__NAME:
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
      case ColladaPackage.ANIMATION_TYPE__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.ANIMATION_TYPE__SOURCE:
        getSource().clear();
        return;
      case ColladaPackage.ANIMATION_TYPE__SAMPLER:
        getSampler().clear();
        return;
      case ColladaPackage.ANIMATION_TYPE__CHANNEL:
        getChannel().clear();
        return;
      case ColladaPackage.ANIMATION_TYPE__ANIMATION:
        getAnimation().clear();
        return;
      case ColladaPackage.ANIMATION_TYPE__ANIMATION1:
        getAnimation1().clear();
        return;
      case ColladaPackage.ANIMATION_TYPE__SAMPLER1:
        getSampler1().clear();
        return;
      case ColladaPackage.ANIMATION_TYPE__CHANNEL1:
        getChannel1().clear();
        return;
      case ColladaPackage.ANIMATION_TYPE__ANIMATION2:
        getAnimation2().clear();
        return;
      case ColladaPackage.ANIMATION_TYPE__ANIMATION3:
        getAnimation3().clear();
        return;
      case ColladaPackage.ANIMATION_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.ANIMATION_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.ANIMATION_TYPE__NAME:
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
      case ColladaPackage.ANIMATION_TYPE__ASSET:
        return asset != null;
      case ColladaPackage.ANIMATION_TYPE__SOURCE:
        return source != null && !source.isEmpty();
      case ColladaPackage.ANIMATION_TYPE__SAMPLER:
        return sampler != null && !sampler.isEmpty();
      case ColladaPackage.ANIMATION_TYPE__CHANNEL:
        return channel != null && !channel.isEmpty();
      case ColladaPackage.ANIMATION_TYPE__ANIMATION:
        return animation != null && !animation.isEmpty();
      case ColladaPackage.ANIMATION_TYPE__ANIMATION1:
        return animation1 != null && !animation1.isEmpty();
      case ColladaPackage.ANIMATION_TYPE__SAMPLER1:
        return sampler1 != null && !sampler1.isEmpty();
      case ColladaPackage.ANIMATION_TYPE__CHANNEL1:
        return channel1 != null && !channel1.isEmpty();
      case ColladaPackage.ANIMATION_TYPE__ANIMATION2:
        return animation2 != null && !animation2.isEmpty();
      case ColladaPackage.ANIMATION_TYPE__ANIMATION3:
        return animation3 != null && !animation3.isEmpty();
      case ColladaPackage.ANIMATION_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.ANIMATION_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.ANIMATION_TYPE__NAME:
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

} //AnimationTypeImpl
