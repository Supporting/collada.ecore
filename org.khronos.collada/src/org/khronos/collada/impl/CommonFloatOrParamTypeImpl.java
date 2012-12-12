/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.CommonFloatOrParamType;
import org.khronos.collada.FloatType;
import org.khronos.collada.ParamType;
import org.khronos.collada.ParamType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Float Or Param Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.CommonFloatOrParamTypeImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CommonFloatOrParamTypeImpl#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommonFloatOrParamTypeImpl extends EObjectImpl implements CommonFloatOrParamType {
	/**
   * The cached value of the '{@link #getFloat() <em>Float</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat()
   * @generated
   * @ordered
   */
	protected FloatType float_;

	/**
   * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
	protected ParamType2 param;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CommonFloatOrParamTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getCommonFloatOrParamType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FloatType getFloat() {
    return float_;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFloat(FloatType newFloat, NotificationChain msgs) {
    FloatType oldFloat = float_;
    float_ = newFloat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__FLOAT, oldFloat, newFloat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat(FloatType newFloat) {
    if (newFloat != float_)
    {
      NotificationChain msgs = null;
      if (float_ != null)
        msgs = ((InternalEObject)float_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__FLOAT, null, msgs);
      if (newFloat != null)
        msgs = ((InternalEObject)newFloat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__FLOAT, null, msgs);
      msgs = basicSetFloat(newFloat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__FLOAT, newFloat, newFloat));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ParamType2 getParam() {
    return param;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetParam(ParamType2 newParam, NotificationChain msgs) {
    ParamType2 oldParam = param;
    param = newParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__PARAM, oldParam, newParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setParam(ParamType2 newParam) {
    if (newParam != param)
    {
      NotificationChain msgs = null;
      if (param != null)
        msgs = ((InternalEObject)param).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__PARAM, null, msgs);
      if (newParam != null)
        msgs = ((InternalEObject)newParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__PARAM, null, msgs);
      msgs = basicSetParam(newParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__PARAM, newParam, newParam));
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
      case ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__FLOAT:
        return basicSetFloat(null, msgs);
      case ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__PARAM:
        return basicSetParam(null, msgs);
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
      case ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__FLOAT:
        return getFloat();
      case ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__PARAM:
        return getParam();
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
      case ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__FLOAT:
        setFloat((FloatType)newValue);
        return;
      case ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__PARAM:
        setParam((ParamType2)newValue);
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
      case ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__FLOAT:
        setFloat((FloatType)null);
        return;
      case ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__PARAM:
        setParam((ParamType2)null);
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
      case ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__FLOAT:
        return float_ != null;
      case ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE__PARAM:
        return param != null;
    }
    return super.eIsSet(featureID);
  }

} //CommonFloatOrParamTypeImpl
