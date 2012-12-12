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
import org.khronos.collada.FloatArrayType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.FloatArrayTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FloatArrayTypeImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FloatArrayTypeImpl#getDigits <em>Digits</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FloatArrayTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FloatArrayTypeImpl#getMagnitude <em>Magnitude</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FloatArrayTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FloatArrayTypeImpl extends EObjectImpl implements FloatArrayType {
	/**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected static final List<Double> VALUE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected List<Double> value = VALUE_EDEFAULT;

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
   * The default value of the '{@link #getDigits() <em>Digits</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDigits()
   * @generated
   * @ordered
   */
	protected static final short DIGITS_EDEFAULT = 6;

	/**
   * The cached value of the '{@link #getDigits() <em>Digits</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDigits()
   * @generated
   * @ordered
   */
	protected short digits = DIGITS_EDEFAULT;

	/**
   * This is true if the Digits attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean digitsESet;

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
   * The default value of the '{@link #getMagnitude() <em>Magnitude</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMagnitude()
   * @generated
   * @ordered
   */
	protected static final short MAGNITUDE_EDEFAULT = 38;

	/**
   * The cached value of the '{@link #getMagnitude() <em>Magnitude</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMagnitude()
   * @generated
   * @ordered
   */
	protected short magnitude = MAGNITUDE_EDEFAULT;

	/**
   * This is true if the Magnitude attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean magnitudeESet;

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
	protected FloatArrayTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getFloatArrayType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setValue(List<Double> newValue) {
    List<Double> oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FLOAT_ARRAY_TYPE__VALUE, oldValue, value));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FLOAT_ARRAY_TYPE__COUNT, oldCount, count));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public short getDigits() {
    return digits;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDigits(short newDigits) {
    short oldDigits = digits;
    digits = newDigits;
    boolean oldDigitsESet = digitsESet;
    digitsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FLOAT_ARRAY_TYPE__DIGITS, oldDigits, digits, !oldDigitsESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetDigits() {
    short oldDigits = digits;
    boolean oldDigitsESet = digitsESet;
    digits = DIGITS_EDEFAULT;
    digitsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FLOAT_ARRAY_TYPE__DIGITS, oldDigits, DIGITS_EDEFAULT, oldDigitsESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetDigits() {
    return digitsESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FLOAT_ARRAY_TYPE__ID, oldId, id));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public short getMagnitude() {
    return magnitude;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMagnitude(short newMagnitude) {
    short oldMagnitude = magnitude;
    magnitude = newMagnitude;
    boolean oldMagnitudeESet = magnitudeESet;
    magnitudeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FLOAT_ARRAY_TYPE__MAGNITUDE, oldMagnitude, magnitude, !oldMagnitudeESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMagnitude() {
    short oldMagnitude = magnitude;
    boolean oldMagnitudeESet = magnitudeESet;
    magnitude = MAGNITUDE_EDEFAULT;
    magnitudeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FLOAT_ARRAY_TYPE__MAGNITUDE, oldMagnitude, MAGNITUDE_EDEFAULT, oldMagnitudeESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMagnitude() {
    return magnitudeESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FLOAT_ARRAY_TYPE__NAME, oldName, name));
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
      case ColladaPackage.FLOAT_ARRAY_TYPE__VALUE:
        return getValue();
      case ColladaPackage.FLOAT_ARRAY_TYPE__COUNT:
        return getCount();
      case ColladaPackage.FLOAT_ARRAY_TYPE__DIGITS:
        return getDigits();
      case ColladaPackage.FLOAT_ARRAY_TYPE__ID:
        return getId();
      case ColladaPackage.FLOAT_ARRAY_TYPE__MAGNITUDE:
        return getMagnitude();
      case ColladaPackage.FLOAT_ARRAY_TYPE__NAME:
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
      case ColladaPackage.FLOAT_ARRAY_TYPE__VALUE:
        setValue((List<Double>)newValue);
        return;
      case ColladaPackage.FLOAT_ARRAY_TYPE__COUNT:
        setCount((BigInteger)newValue);
        return;
      case ColladaPackage.FLOAT_ARRAY_TYPE__DIGITS:
        setDigits((Short)newValue);
        return;
      case ColladaPackage.FLOAT_ARRAY_TYPE__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.FLOAT_ARRAY_TYPE__MAGNITUDE:
        setMagnitude((Short)newValue);
        return;
      case ColladaPackage.FLOAT_ARRAY_TYPE__NAME:
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
      case ColladaPackage.FLOAT_ARRAY_TYPE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case ColladaPackage.FLOAT_ARRAY_TYPE__COUNT:
        setCount(COUNT_EDEFAULT);
        return;
      case ColladaPackage.FLOAT_ARRAY_TYPE__DIGITS:
        unsetDigits();
        return;
      case ColladaPackage.FLOAT_ARRAY_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.FLOAT_ARRAY_TYPE__MAGNITUDE:
        unsetMagnitude();
        return;
      case ColladaPackage.FLOAT_ARRAY_TYPE__NAME:
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
      case ColladaPackage.FLOAT_ARRAY_TYPE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case ColladaPackage.FLOAT_ARRAY_TYPE__COUNT:
        return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
      case ColladaPackage.FLOAT_ARRAY_TYPE__DIGITS:
        return isSetDigits();
      case ColladaPackage.FLOAT_ARRAY_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.FLOAT_ARRAY_TYPE__MAGNITUDE:
        return isSetMagnitude();
      case ColladaPackage.FLOAT_ARRAY_TYPE__NAME:
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
    result.append(", digits: ");
    if (digitsESet) result.append(digits); else result.append("<unset>");
    result.append(", id: ");
    result.append(id);
    result.append(", magnitude: ");
    if (magnitudeESet) result.append(magnitude); else result.append("<unset>");
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FloatArrayTypeImpl
