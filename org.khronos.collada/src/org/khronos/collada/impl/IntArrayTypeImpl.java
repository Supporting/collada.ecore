/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.IntArrayType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.IntArrayTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.khronos.collada.impl.IntArrayTypeImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.khronos.collada.impl.IntArrayTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.IntArrayTypeImpl#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link org.khronos.collada.impl.IntArrayTypeImpl#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link org.khronos.collada.impl.IntArrayTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntArrayTypeImpl extends EObjectImpl implements IntArrayType {
	/**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected static final List<Long> VALUE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected List<Long> value = VALUE_EDEFAULT;

	/**
   * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
	protected static final BigInteger COUNT_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
	protected BigInteger count = COUNT_EDEFAULT;

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
   * The default value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMaxInclusive()
   * @generated
   * @ordered
   */
	protected static final BigInteger MAX_INCLUSIVE_EDEFAULT = new BigInteger("2147483647");

	/**
   * The cached value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMaxInclusive()
   * @generated
   * @ordered
   */
	protected BigInteger maxInclusive = MAX_INCLUSIVE_EDEFAULT;

	/**
   * This is true if the Max Inclusive attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean maxInclusiveESet;

	/**
   * The default value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMinInclusive()
   * @generated
   * @ordered
   */
	protected static final BigInteger MIN_INCLUSIVE_EDEFAULT = new BigInteger("-2147483648");

	/**
   * The cached value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMinInclusive()
   * @generated
   * @ordered
   */
	protected BigInteger minInclusive = MIN_INCLUSIVE_EDEFAULT;

	/**
   * This is true if the Min Inclusive attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean minInclusiveESet;

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
	protected IntArrayTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getIntArrayType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Long> getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setValue(List<Long> newValue) {
    List<Long> oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INT_ARRAY_TYPE__VALUE, oldValue, value));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getCount() {
    return count;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCount(BigInteger newCount) {
    BigInteger oldCount = count;
    count = newCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INT_ARRAY_TYPE__COUNT, oldCount, count));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INT_ARRAY_TYPE__ID, oldId, id));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getMaxInclusive() {
    return maxInclusive;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMaxInclusive(BigInteger newMaxInclusive) {
    BigInteger oldMaxInclusive = maxInclusive;
    maxInclusive = newMaxInclusive;
    boolean oldMaxInclusiveESet = maxInclusiveESet;
    maxInclusiveESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INT_ARRAY_TYPE__MAX_INCLUSIVE, oldMaxInclusive, maxInclusive, !oldMaxInclusiveESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMaxInclusive() {
    BigInteger oldMaxInclusive = maxInclusive;
    boolean oldMaxInclusiveESet = maxInclusiveESet;
    maxInclusive = MAX_INCLUSIVE_EDEFAULT;
    maxInclusiveESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.INT_ARRAY_TYPE__MAX_INCLUSIVE, oldMaxInclusive, MAX_INCLUSIVE_EDEFAULT, oldMaxInclusiveESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMaxInclusive() {
    return maxInclusiveESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getMinInclusive() {
    return minInclusive;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMinInclusive(BigInteger newMinInclusive) {
    BigInteger oldMinInclusive = minInclusive;
    minInclusive = newMinInclusive;
    boolean oldMinInclusiveESet = minInclusiveESet;
    minInclusiveESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INT_ARRAY_TYPE__MIN_INCLUSIVE, oldMinInclusive, minInclusive, !oldMinInclusiveESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMinInclusive() {
    BigInteger oldMinInclusive = minInclusive;
    boolean oldMinInclusiveESet = minInclusiveESet;
    minInclusive = MIN_INCLUSIVE_EDEFAULT;
    minInclusiveESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.INT_ARRAY_TYPE__MIN_INCLUSIVE, oldMinInclusive, MIN_INCLUSIVE_EDEFAULT, oldMinInclusiveESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMinInclusive() {
    return minInclusiveESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INT_ARRAY_TYPE__NAME, oldName, name));
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
      case ColladaPackage.INT_ARRAY_TYPE__VALUE:
        return getValue();
      case ColladaPackage.INT_ARRAY_TYPE__COUNT:
        return getCount();
      case ColladaPackage.INT_ARRAY_TYPE__ID:
        return getId();
      case ColladaPackage.INT_ARRAY_TYPE__MAX_INCLUSIVE:
        return getMaxInclusive();
      case ColladaPackage.INT_ARRAY_TYPE__MIN_INCLUSIVE:
        return getMinInclusive();
      case ColladaPackage.INT_ARRAY_TYPE__NAME:
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
      case ColladaPackage.INT_ARRAY_TYPE__VALUE:
        setValue((List<Long>)newValue);
        return;
      case ColladaPackage.INT_ARRAY_TYPE__COUNT:
        setCount((BigInteger)newValue);
        return;
      case ColladaPackage.INT_ARRAY_TYPE__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.INT_ARRAY_TYPE__MAX_INCLUSIVE:
        setMaxInclusive((BigInteger)newValue);
        return;
      case ColladaPackage.INT_ARRAY_TYPE__MIN_INCLUSIVE:
        setMinInclusive((BigInteger)newValue);
        return;
      case ColladaPackage.INT_ARRAY_TYPE__NAME:
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
      case ColladaPackage.INT_ARRAY_TYPE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case ColladaPackage.INT_ARRAY_TYPE__COUNT:
        setCount(COUNT_EDEFAULT);
        return;
      case ColladaPackage.INT_ARRAY_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.INT_ARRAY_TYPE__MAX_INCLUSIVE:
        unsetMaxInclusive();
        return;
      case ColladaPackage.INT_ARRAY_TYPE__MIN_INCLUSIVE:
        unsetMinInclusive();
        return;
      case ColladaPackage.INT_ARRAY_TYPE__NAME:
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
      case ColladaPackage.INT_ARRAY_TYPE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case ColladaPackage.INT_ARRAY_TYPE__COUNT:
        return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
      case ColladaPackage.INT_ARRAY_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.INT_ARRAY_TYPE__MAX_INCLUSIVE:
        return isSetMaxInclusive();
      case ColladaPackage.INT_ARRAY_TYPE__MIN_INCLUSIVE:
        return isSetMinInclusive();
      case ColladaPackage.INT_ARRAY_TYPE__NAME:
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
    result.append(" (value: ");
    result.append(value);
    result.append(", count: ");
    result.append(count);
    result.append(", id: ");
    result.append(id);
    result.append(", maxInclusive: ");
    if (maxInclusiveESet) result.append(maxInclusive); else result.append("<unset>");
    result.append(", minInclusive: ");
    if (minInclusiveESet) result.append(minInclusive); else result.append("<unset>");
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //IntArrayTypeImpl
