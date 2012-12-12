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
import org.khronos.collada.GlesTexenvCommandType;
import org.khronos.collada.GlesTexenvModeEnums;
import org.khronos.collada.GlesTextureConstantType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gles Texenv Command Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.GlesTexenvCommandTypeImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTexenvCommandTypeImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTexenvCommandTypeImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlesTexenvCommandTypeImpl extends EObjectImpl implements GlesTexenvCommandType {
	/**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
	protected GlesTextureConstantType constant;

	/**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
	protected static final GlesTexenvModeEnums OPERATOR_EDEFAULT = GlesTexenvModeEnums.REPLACE;

	/**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
	protected GlesTexenvModeEnums operator = OPERATOR_EDEFAULT;

	/**
   * This is true if the Operator attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean operatorESet;

	/**
   * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
	protected static final String UNIT_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
	protected String unit = UNIT_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected GlesTexenvCommandTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getGlesTexenvCommandType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTextureConstantType getConstant() {
    return constant;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetConstant(GlesTextureConstantType newConstant, NotificationChain msgs) {
    GlesTextureConstantType oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXENV_COMMAND_TYPE__CONSTANT, oldConstant, newConstant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setConstant(GlesTextureConstantType newConstant) {
    if (newConstant != constant)
    {
      NotificationChain msgs = null;
      if (constant != null)
        msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLES_TEXENV_COMMAND_TYPE__CONSTANT, null, msgs);
      if (newConstant != null)
        msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLES_TEXENV_COMMAND_TYPE__CONSTANT, null, msgs);
      msgs = basicSetConstant(newConstant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXENV_COMMAND_TYPE__CONSTANT, newConstant, newConstant));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexenvModeEnums getOperator() {
    return operator;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setOperator(GlesTexenvModeEnums newOperator) {
    GlesTexenvModeEnums oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    boolean oldOperatorESet = operatorESet;
    operatorESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXENV_COMMAND_TYPE__OPERATOR, oldOperator, operator, !oldOperatorESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetOperator() {
    GlesTexenvModeEnums oldOperator = operator;
    boolean oldOperatorESet = operatorESet;
    operator = OPERATOR_EDEFAULT;
    operatorESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.GLES_TEXENV_COMMAND_TYPE__OPERATOR, oldOperator, OPERATOR_EDEFAULT, oldOperatorESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetOperator() {
    return operatorESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getUnit() {
    return unit;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUnit(String newUnit) {
    String oldUnit = unit;
    unit = newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXENV_COMMAND_TYPE__UNIT, oldUnit, unit));
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
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE__CONSTANT:
        return basicSetConstant(null, msgs);
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
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE__CONSTANT:
        return getConstant();
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE__OPERATOR:
        return getOperator();
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE__UNIT:
        return getUnit();
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
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE__CONSTANT:
        setConstant((GlesTextureConstantType)newValue);
        return;
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE__OPERATOR:
        setOperator((GlesTexenvModeEnums)newValue);
        return;
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE__UNIT:
        setUnit((String)newValue);
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
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE__CONSTANT:
        setConstant((GlesTextureConstantType)null);
        return;
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE__OPERATOR:
        unsetOperator();
        return;
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE__UNIT:
        setUnit(UNIT_EDEFAULT);
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
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE__CONSTANT:
        return constant != null;
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE__OPERATOR:
        return isSetOperator();
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE__UNIT:
        return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
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
    result.append(" (operator: ");
    if (operatorESet) result.append(operator); else result.append("<unset>");
    result.append(", unit: ");
    result.append(unit);
    result.append(')');
    return result.toString();
  }

} //GlesTexenvCommandTypeImpl
