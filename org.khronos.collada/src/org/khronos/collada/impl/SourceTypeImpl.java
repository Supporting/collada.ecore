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
import org.khronos.collada.BoolArrayType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.FloatArrayType;
import org.khronos.collada.IDREFArrayType;
import org.khronos.collada.IntArrayType;
import org.khronos.collada.NameArrayType;
import org.khronos.collada.SourceType;
import org.khronos.collada.TechniqueCommonType8;
import org.khronos.collada.TechniqueType4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.SourceTypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SourceTypeImpl#getIDREFArray <em>IDREF Array</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SourceTypeImpl#getNameArray <em>Name Array</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SourceTypeImpl#getBoolArray <em>Bool Array</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SourceTypeImpl#getFloatArray <em>Float Array</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SourceTypeImpl#getIntArray <em>Int Array</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SourceTypeImpl#getTechniqueCommon <em>Technique Common</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SourceTypeImpl#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SourceTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SourceTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceTypeImpl extends EObjectImpl implements SourceType {
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
   * The cached value of the '{@link #getIDREFArray() <em>IDREF Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIDREFArray()
   * @generated
   * @ordered
   */
	protected IDREFArrayType iDREFArray;

	/**
   * The cached value of the '{@link #getNameArray() <em>Name Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNameArray()
   * @generated
   * @ordered
   */
	protected NameArrayType nameArray;

	/**
   * The cached value of the '{@link #getBoolArray() <em>Bool Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBoolArray()
   * @generated
   * @ordered
   */
	protected BoolArrayType boolArray;

	/**
   * The cached value of the '{@link #getFloatArray() <em>Float Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloatArray()
   * @generated
   * @ordered
   */
	protected FloatArrayType floatArray;

	/**
   * The cached value of the '{@link #getIntArray() <em>Int Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIntArray()
   * @generated
   * @ordered
   */
	protected IntArrayType intArray;

	/**
   * The cached value of the '{@link #getTechniqueCommon() <em>Technique Common</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTechniqueCommon()
   * @generated
   * @ordered
   */
	protected TechniqueCommonType8 techniqueCommon;

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
	protected SourceTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getSourceType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__ASSET, oldAsset, newAsset);
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
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SOURCE_TYPE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SOURCE_TYPE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public IDREFArrayType getIDREFArray() {
    return iDREFArray;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetIDREFArray(IDREFArrayType newIDREFArray, NotificationChain msgs) {
    IDREFArrayType oldIDREFArray = iDREFArray;
    iDREFArray = newIDREFArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__IDREF_ARRAY, oldIDREFArray, newIDREFArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setIDREFArray(IDREFArrayType newIDREFArray) {
    if (newIDREFArray != iDREFArray)
    {
      NotificationChain msgs = null;
      if (iDREFArray != null)
        msgs = ((InternalEObject)iDREFArray).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SOURCE_TYPE__IDREF_ARRAY, null, msgs);
      if (newIDREFArray != null)
        msgs = ((InternalEObject)newIDREFArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SOURCE_TYPE__IDREF_ARRAY, null, msgs);
      msgs = basicSetIDREFArray(newIDREFArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__IDREF_ARRAY, newIDREFArray, newIDREFArray));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NameArrayType getNameArray() {
    return nameArray;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetNameArray(NameArrayType newNameArray, NotificationChain msgs) {
    NameArrayType oldNameArray = nameArray;
    nameArray = newNameArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__NAME_ARRAY, oldNameArray, newNameArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setNameArray(NameArrayType newNameArray) {
    if (newNameArray != nameArray)
    {
      NotificationChain msgs = null;
      if (nameArray != null)
        msgs = ((InternalEObject)nameArray).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SOURCE_TYPE__NAME_ARRAY, null, msgs);
      if (newNameArray != null)
        msgs = ((InternalEObject)newNameArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SOURCE_TYPE__NAME_ARRAY, null, msgs);
      msgs = basicSetNameArray(newNameArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__NAME_ARRAY, newNameArray, newNameArray));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BoolArrayType getBoolArray() {
    return boolArray;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetBoolArray(BoolArrayType newBoolArray, NotificationChain msgs) {
    BoolArrayType oldBoolArray = boolArray;
    boolArray = newBoolArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__BOOL_ARRAY, oldBoolArray, newBoolArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBoolArray(BoolArrayType newBoolArray) {
    if (newBoolArray != boolArray)
    {
      NotificationChain msgs = null;
      if (boolArray != null)
        msgs = ((InternalEObject)boolArray).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SOURCE_TYPE__BOOL_ARRAY, null, msgs);
      if (newBoolArray != null)
        msgs = ((InternalEObject)newBoolArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SOURCE_TYPE__BOOL_ARRAY, null, msgs);
      msgs = basicSetBoolArray(newBoolArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__BOOL_ARRAY, newBoolArray, newBoolArray));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FloatArrayType getFloatArray() {
    return floatArray;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFloatArray(FloatArrayType newFloatArray, NotificationChain msgs) {
    FloatArrayType oldFloatArray = floatArray;
    floatArray = newFloatArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__FLOAT_ARRAY, oldFloatArray, newFloatArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloatArray(FloatArrayType newFloatArray) {
    if (newFloatArray != floatArray)
    {
      NotificationChain msgs = null;
      if (floatArray != null)
        msgs = ((InternalEObject)floatArray).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SOURCE_TYPE__FLOAT_ARRAY, null, msgs);
      if (newFloatArray != null)
        msgs = ((InternalEObject)newFloatArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SOURCE_TYPE__FLOAT_ARRAY, null, msgs);
      msgs = basicSetFloatArray(newFloatArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__FLOAT_ARRAY, newFloatArray, newFloatArray));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public IntArrayType getIntArray() {
    return intArray;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetIntArray(IntArrayType newIntArray, NotificationChain msgs) {
    IntArrayType oldIntArray = intArray;
    intArray = newIntArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__INT_ARRAY, oldIntArray, newIntArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setIntArray(IntArrayType newIntArray) {
    if (newIntArray != intArray)
    {
      NotificationChain msgs = null;
      if (intArray != null)
        msgs = ((InternalEObject)intArray).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SOURCE_TYPE__INT_ARRAY, null, msgs);
      if (newIntArray != null)
        msgs = ((InternalEObject)newIntArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SOURCE_TYPE__INT_ARRAY, null, msgs);
      msgs = basicSetIntArray(newIntArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__INT_ARRAY, newIntArray, newIntArray));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueCommonType8 getTechniqueCommon() {
    return techniqueCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTechniqueCommon(TechniqueCommonType8 newTechniqueCommon, NotificationChain msgs) {
    TechniqueCommonType8 oldTechniqueCommon = techniqueCommon;
    techniqueCommon = newTechniqueCommon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__TECHNIQUE_COMMON, oldTechniqueCommon, newTechniqueCommon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTechniqueCommon(TechniqueCommonType8 newTechniqueCommon) {
    if (newTechniqueCommon != techniqueCommon)
    {
      NotificationChain msgs = null;
      if (techniqueCommon != null)
        msgs = ((InternalEObject)techniqueCommon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SOURCE_TYPE__TECHNIQUE_COMMON, null, msgs);
      if (newTechniqueCommon != null)
        msgs = ((InternalEObject)newTechniqueCommon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SOURCE_TYPE__TECHNIQUE_COMMON, null, msgs);
      msgs = basicSetTechniqueCommon(newTechniqueCommon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__TECHNIQUE_COMMON, newTechniqueCommon, newTechniqueCommon));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TechniqueType4> getTechnique() {
    if (technique == null)
    {
      technique = new EObjectContainmentEList<TechniqueType4>(TechniqueType4.class, this, ColladaPackage.SOURCE_TYPE__TECHNIQUE);
    }
    return technique;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SOURCE_TYPE__NAME, oldName, name));
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
      case ColladaPackage.SOURCE_TYPE__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.SOURCE_TYPE__IDREF_ARRAY:
        return basicSetIDREFArray(null, msgs);
      case ColladaPackage.SOURCE_TYPE__NAME_ARRAY:
        return basicSetNameArray(null, msgs);
      case ColladaPackage.SOURCE_TYPE__BOOL_ARRAY:
        return basicSetBoolArray(null, msgs);
      case ColladaPackage.SOURCE_TYPE__FLOAT_ARRAY:
        return basicSetFloatArray(null, msgs);
      case ColladaPackage.SOURCE_TYPE__INT_ARRAY:
        return basicSetIntArray(null, msgs);
      case ColladaPackage.SOURCE_TYPE__TECHNIQUE_COMMON:
        return basicSetTechniqueCommon(null, msgs);
      case ColladaPackage.SOURCE_TYPE__TECHNIQUE:
        return ((InternalEList<?>)getTechnique()).basicRemove(otherEnd, msgs);
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
      case ColladaPackage.SOURCE_TYPE__ASSET:
        return getAsset();
      case ColladaPackage.SOURCE_TYPE__IDREF_ARRAY:
        return getIDREFArray();
      case ColladaPackage.SOURCE_TYPE__NAME_ARRAY:
        return getNameArray();
      case ColladaPackage.SOURCE_TYPE__BOOL_ARRAY:
        return getBoolArray();
      case ColladaPackage.SOURCE_TYPE__FLOAT_ARRAY:
        return getFloatArray();
      case ColladaPackage.SOURCE_TYPE__INT_ARRAY:
        return getIntArray();
      case ColladaPackage.SOURCE_TYPE__TECHNIQUE_COMMON:
        return getTechniqueCommon();
      case ColladaPackage.SOURCE_TYPE__TECHNIQUE:
        return getTechnique();
      case ColladaPackage.SOURCE_TYPE__ID:
        return getId();
      case ColladaPackage.SOURCE_TYPE__NAME:
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
      case ColladaPackage.SOURCE_TYPE__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.SOURCE_TYPE__IDREF_ARRAY:
        setIDREFArray((IDREFArrayType)newValue);
        return;
      case ColladaPackage.SOURCE_TYPE__NAME_ARRAY:
        setNameArray((NameArrayType)newValue);
        return;
      case ColladaPackage.SOURCE_TYPE__BOOL_ARRAY:
        setBoolArray((BoolArrayType)newValue);
        return;
      case ColladaPackage.SOURCE_TYPE__FLOAT_ARRAY:
        setFloatArray((FloatArrayType)newValue);
        return;
      case ColladaPackage.SOURCE_TYPE__INT_ARRAY:
        setIntArray((IntArrayType)newValue);
        return;
      case ColladaPackage.SOURCE_TYPE__TECHNIQUE_COMMON:
        setTechniqueCommon((TechniqueCommonType8)newValue);
        return;
      case ColladaPackage.SOURCE_TYPE__TECHNIQUE:
        getTechnique().clear();
        getTechnique().addAll((Collection<? extends TechniqueType4>)newValue);
        return;
      case ColladaPackage.SOURCE_TYPE__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.SOURCE_TYPE__NAME:
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
      case ColladaPackage.SOURCE_TYPE__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.SOURCE_TYPE__IDREF_ARRAY:
        setIDREFArray((IDREFArrayType)null);
        return;
      case ColladaPackage.SOURCE_TYPE__NAME_ARRAY:
        setNameArray((NameArrayType)null);
        return;
      case ColladaPackage.SOURCE_TYPE__BOOL_ARRAY:
        setBoolArray((BoolArrayType)null);
        return;
      case ColladaPackage.SOURCE_TYPE__FLOAT_ARRAY:
        setFloatArray((FloatArrayType)null);
        return;
      case ColladaPackage.SOURCE_TYPE__INT_ARRAY:
        setIntArray((IntArrayType)null);
        return;
      case ColladaPackage.SOURCE_TYPE__TECHNIQUE_COMMON:
        setTechniqueCommon((TechniqueCommonType8)null);
        return;
      case ColladaPackage.SOURCE_TYPE__TECHNIQUE:
        getTechnique().clear();
        return;
      case ColladaPackage.SOURCE_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.SOURCE_TYPE__NAME:
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
      case ColladaPackage.SOURCE_TYPE__ASSET:
        return asset != null;
      case ColladaPackage.SOURCE_TYPE__IDREF_ARRAY:
        return iDREFArray != null;
      case ColladaPackage.SOURCE_TYPE__NAME_ARRAY:
        return nameArray != null;
      case ColladaPackage.SOURCE_TYPE__BOOL_ARRAY:
        return boolArray != null;
      case ColladaPackage.SOURCE_TYPE__FLOAT_ARRAY:
        return floatArray != null;
      case ColladaPackage.SOURCE_TYPE__INT_ARRAY:
        return intArray != null;
      case ColladaPackage.SOURCE_TYPE__TECHNIQUE_COMMON:
        return techniqueCommon != null;
      case ColladaPackage.SOURCE_TYPE__TECHNIQUE:
        return technique != null && !technique.isEmpty();
      case ColladaPackage.SOURCE_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.SOURCE_TYPE__NAME:
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

} //SourceTypeImpl
