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
import org.khronos.collada.ExtraType;
import org.khronos.collada.InstancePhysicsModelType;
import org.khronos.collada.InstanceWithExtra;
import org.khronos.collada.PhysicsSceneType;
import org.khronos.collada.TechniqueCommonType1;
import org.khronos.collada.TechniqueCommonType7;
import org.khronos.collada.TechniqueType4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physics Scene Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.PhysicsSceneTypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PhysicsSceneTypeImpl#getInstanceForceField <em>Instance Force Field</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PhysicsSceneTypeImpl#getInstancePhysicsModel <em>Instance Physics Model</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PhysicsSceneTypeImpl#getTechniqueCommon <em>Technique Common</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PhysicsSceneTypeImpl#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PhysicsSceneTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PhysicsSceneTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PhysicsSceneTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicsSceneTypeImpl extends EObjectImpl implements PhysicsSceneType {
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
   * The cached value of the '{@link #getInstanceForceField() <em>Instance Force Field</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstanceForceField()
   * @generated
   * @ordered
   */
	protected EList<InstanceWithExtra> instanceForceField;

	/**
   * The cached value of the '{@link #getInstancePhysicsModel() <em>Instance Physics Model</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstancePhysicsModel()
   * @generated
   * @ordered
   */
	protected EList<InstancePhysicsModelType> instancePhysicsModel;

	/**
   * The cached value of the '{@link #getTechniqueCommon() <em>Technique Common</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTechniqueCommon()
   * @generated
   * @ordered
   */
	protected TechniqueCommonType7 techniqueCommon;

	/**
   * The cached value of the '{@link #getTechnique() <em>Technique</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTechnique()
   * @generated
   * @ordered
   */
	protected EList<TechniqueType4> technique;

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
	protected PhysicsSceneTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getPhysicsSceneType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.PHYSICS_SCENE_TYPE__ASSET, oldAsset, newAsset);
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
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PHYSICS_SCENE_TYPE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PHYSICS_SCENE_TYPE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PHYSICS_SCENE_TYPE__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<InstanceWithExtra> getInstanceForceField() {
    if (instanceForceField == null)
    {
      instanceForceField = new EObjectContainmentEList<InstanceWithExtra>(InstanceWithExtra.class, this, ColladaPackage.PHYSICS_SCENE_TYPE__INSTANCE_FORCE_FIELD);
    }
    return instanceForceField;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<InstancePhysicsModelType> getInstancePhysicsModel() {
    if (instancePhysicsModel == null)
    {
      instancePhysicsModel = new EObjectContainmentEList<InstancePhysicsModelType>(InstancePhysicsModelType.class, this, ColladaPackage.PHYSICS_SCENE_TYPE__INSTANCE_PHYSICS_MODEL);
    }
    return instancePhysicsModel;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueCommonType7 getTechniqueCommon() {
    return techniqueCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTechniqueCommon(TechniqueCommonType7 newTechniqueCommon, NotificationChain msgs) {
    TechniqueCommonType7 oldTechniqueCommon = techniqueCommon;
    techniqueCommon = newTechniqueCommon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.PHYSICS_SCENE_TYPE__TECHNIQUE_COMMON, oldTechniqueCommon, newTechniqueCommon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTechniqueCommon(TechniqueCommonType7 newTechniqueCommon) {
    if (newTechniqueCommon != techniqueCommon)
    {
      NotificationChain msgs = null;
      if (techniqueCommon != null)
        msgs = ((InternalEObject)techniqueCommon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PHYSICS_SCENE_TYPE__TECHNIQUE_COMMON, null, msgs);
      if (newTechniqueCommon != null)
        msgs = ((InternalEObject)newTechniqueCommon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PHYSICS_SCENE_TYPE__TECHNIQUE_COMMON, null, msgs);
      msgs = basicSetTechniqueCommon(newTechniqueCommon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PHYSICS_SCENE_TYPE__TECHNIQUE_COMMON, newTechniqueCommon, newTechniqueCommon));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TechniqueType4> getTechnique() {
    if (technique == null)
    {
      technique = new EObjectContainmentEList<TechniqueType4>(TechniqueType4.class, this, ColladaPackage.PHYSICS_SCENE_TYPE__TECHNIQUE);
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
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.PHYSICS_SCENE_TYPE__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PHYSICS_SCENE_TYPE__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PHYSICS_SCENE_TYPE__NAME, oldName, name));
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
      case ColladaPackage.PHYSICS_SCENE_TYPE__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.PHYSICS_SCENE_TYPE__INSTANCE_FORCE_FIELD:
        return ((InternalEList<?>)getInstanceForceField()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PHYSICS_SCENE_TYPE__INSTANCE_PHYSICS_MODEL:
        return ((InternalEList<?>)getInstancePhysicsModel()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PHYSICS_SCENE_TYPE__TECHNIQUE_COMMON:
        return basicSetTechniqueCommon(null, msgs);
      case ColladaPackage.PHYSICS_SCENE_TYPE__TECHNIQUE:
        return ((InternalEList<?>)getTechnique()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PHYSICS_SCENE_TYPE__EXTRA:
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
      case ColladaPackage.PHYSICS_SCENE_TYPE__ASSET:
        return getAsset();
      case ColladaPackage.PHYSICS_SCENE_TYPE__INSTANCE_FORCE_FIELD:
        return getInstanceForceField();
      case ColladaPackage.PHYSICS_SCENE_TYPE__INSTANCE_PHYSICS_MODEL:
        return getInstancePhysicsModel();
      case ColladaPackage.PHYSICS_SCENE_TYPE__TECHNIQUE_COMMON:
        return getTechniqueCommon();
      case ColladaPackage.PHYSICS_SCENE_TYPE__TECHNIQUE:
        return getTechnique();
      case ColladaPackage.PHYSICS_SCENE_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.PHYSICS_SCENE_TYPE__ID:
        return getId();
      case ColladaPackage.PHYSICS_SCENE_TYPE__NAME:
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
      case ColladaPackage.PHYSICS_SCENE_TYPE__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.PHYSICS_SCENE_TYPE__INSTANCE_FORCE_FIELD:
        getInstanceForceField().clear();
        getInstanceForceField().addAll((Collection<? extends InstanceWithExtra>)newValue);
        return;
      case ColladaPackage.PHYSICS_SCENE_TYPE__INSTANCE_PHYSICS_MODEL:
        getInstancePhysicsModel().clear();
        getInstancePhysicsModel().addAll((Collection<? extends InstancePhysicsModelType>)newValue);
        return;
      case ColladaPackage.PHYSICS_SCENE_TYPE__TECHNIQUE_COMMON:
        setTechniqueCommon((TechniqueCommonType7)newValue);
        return;
      case ColladaPackage.PHYSICS_SCENE_TYPE__TECHNIQUE:
        getTechnique().clear();
        getTechnique().addAll((Collection<? extends TechniqueType4>)newValue);
        return;
      case ColladaPackage.PHYSICS_SCENE_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.PHYSICS_SCENE_TYPE__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.PHYSICS_SCENE_TYPE__NAME:
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
      case ColladaPackage.PHYSICS_SCENE_TYPE__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.PHYSICS_SCENE_TYPE__INSTANCE_FORCE_FIELD:
        getInstanceForceField().clear();
        return;
      case ColladaPackage.PHYSICS_SCENE_TYPE__INSTANCE_PHYSICS_MODEL:
        getInstancePhysicsModel().clear();
        return;
      case ColladaPackage.PHYSICS_SCENE_TYPE__TECHNIQUE_COMMON:
        setTechniqueCommon((TechniqueCommonType7)null);
        return;
      case ColladaPackage.PHYSICS_SCENE_TYPE__TECHNIQUE:
        getTechnique().clear();
        return;
      case ColladaPackage.PHYSICS_SCENE_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.PHYSICS_SCENE_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.PHYSICS_SCENE_TYPE__NAME:
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
      case ColladaPackage.PHYSICS_SCENE_TYPE__ASSET:
        return asset != null;
      case ColladaPackage.PHYSICS_SCENE_TYPE__INSTANCE_FORCE_FIELD:
        return instanceForceField != null && !instanceForceField.isEmpty();
      case ColladaPackage.PHYSICS_SCENE_TYPE__INSTANCE_PHYSICS_MODEL:
        return instancePhysicsModel != null && !instancePhysicsModel.isEmpty();
      case ColladaPackage.PHYSICS_SCENE_TYPE__TECHNIQUE_COMMON:
        return techniqueCommon != null;
      case ColladaPackage.PHYSICS_SCENE_TYPE__TECHNIQUE:
        return technique != null && !technique.isEmpty();
      case ColladaPackage.PHYSICS_SCENE_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.PHYSICS_SCENE_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.PHYSICS_SCENE_TYPE__NAME:
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

} //PhysicsSceneTypeImpl
