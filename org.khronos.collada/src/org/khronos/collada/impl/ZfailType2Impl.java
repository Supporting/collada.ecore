/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.GlStencilOpType;
import org.khronos.collada.ZfailType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zfail Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.ZfailType2Impl#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ZfailType2Impl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZfailType2Impl extends EObjectImpl implements ZfailType2 {
	/**
   * The default value of the '{@link #getParam() <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
	protected static final String PARAM_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getParam() <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
	protected String param = PARAM_EDEFAULT;

	/**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected static final GlStencilOpType VALUE_EDEFAULT = GlStencilOpType.KEEP;

	/**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected GlStencilOpType value = VALUE_EDEFAULT;

	/**
   * This is true if the Value attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean valueESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ZfailType2Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getZfailType2();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getParam() {
    return param;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setParam(String newParam) {
    String oldParam = param;
    param = newParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ZFAIL_TYPE2__PARAM, oldParam, param));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlStencilOpType getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setValue(GlStencilOpType newValue) {
    GlStencilOpType oldValue = value;
    value = newValue == null ? VALUE_EDEFAULT : newValue;
    boolean oldValueESet = valueESet;
    valueESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ZFAIL_TYPE2__VALUE, oldValue, value, !oldValueESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetValue() {
    GlStencilOpType oldValue = value;
    boolean oldValueESet = valueESet;
    value = VALUE_EDEFAULT;
    valueESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.ZFAIL_TYPE2__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetValue() {
    return valueESet;
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
      case ColladaPackage.ZFAIL_TYPE2__PARAM:
        return getParam();
      case ColladaPackage.ZFAIL_TYPE2__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case ColladaPackage.ZFAIL_TYPE2__PARAM:
        setParam((String)newValue);
        return;
      case ColladaPackage.ZFAIL_TYPE2__VALUE:
        setValue((GlStencilOpType)newValue);
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
      case ColladaPackage.ZFAIL_TYPE2__PARAM:
        setParam(PARAM_EDEFAULT);
        return;
      case ColladaPackage.ZFAIL_TYPE2__VALUE:
        unsetValue();
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
      case ColladaPackage.ZFAIL_TYPE2__PARAM:
        return PARAM_EDEFAULT == null ? param != null : !PARAM_EDEFAULT.equals(param);
      case ColladaPackage.ZFAIL_TYPE2__VALUE:
        return isSetValue();
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
    result.append(" (param: ");
    result.append(param);
    result.append(", value: ");
    if (valueESet) result.append(value); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //ZfailType2Impl
