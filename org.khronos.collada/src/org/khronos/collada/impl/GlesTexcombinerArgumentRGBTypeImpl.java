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
import org.khronos.collada.GlesTexcombinerArgumentRGBType;
import org.khronos.collada.GlesTexcombinerOperandRGBEnums;
import org.khronos.collada.GlesTexcombinerSourceEnums;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gles Texcombiner Argument RGB Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.GlesTexcombinerArgumentRGBTypeImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTexcombinerArgumentRGBTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTexcombinerArgumentRGBTypeImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlesTexcombinerArgumentRGBTypeImpl extends EObjectImpl implements GlesTexcombinerArgumentRGBType {
	/**
   * The default value of the '{@link #getOperand() <em>Operand</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOperand()
   * @generated
   * @ordered
   */
	protected static final GlesTexcombinerOperandRGBEnums OPERAND_EDEFAULT = GlesTexcombinerOperandRGBEnums.SRCCOLOR;

	/**
   * The cached value of the '{@link #getOperand() <em>Operand</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOperand()
   * @generated
   * @ordered
   */
	protected GlesTexcombinerOperandRGBEnums operand = OPERAND_EDEFAULT;

	/**
   * This is true if the Operand attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean operandESet;

	/**
   * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
	protected static final GlesTexcombinerSourceEnums SOURCE_EDEFAULT = GlesTexcombinerSourceEnums.TEXTURE;

	/**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
	protected GlesTexcombinerSourceEnums source = SOURCE_EDEFAULT;

	/**
   * This is true if the Source attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean sourceESet;

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
	protected GlesTexcombinerArgumentRGBTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getGlesTexcombinerArgumentRGBType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerOperandRGBEnums getOperand() {
    return operand;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setOperand(GlesTexcombinerOperandRGBEnums newOperand) {
    GlesTexcombinerOperandRGBEnums oldOperand = operand;
    operand = newOperand == null ? OPERAND_EDEFAULT : newOperand;
    boolean oldOperandESet = operandESet;
    operandESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__OPERAND, oldOperand, operand, !oldOperandESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetOperand() {
    GlesTexcombinerOperandRGBEnums oldOperand = operand;
    boolean oldOperandESet = operandESet;
    operand = OPERAND_EDEFAULT;
    operandESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__OPERAND, oldOperand, OPERAND_EDEFAULT, oldOperandESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetOperand() {
    return operandESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerSourceEnums getSource() {
    return source;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSource(GlesTexcombinerSourceEnums newSource) {
    GlesTexcombinerSourceEnums oldSource = source;
    source = newSource == null ? SOURCE_EDEFAULT : newSource;
    boolean oldSourceESet = sourceESet;
    sourceESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__SOURCE, oldSource, source, !oldSourceESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetSource() {
    GlesTexcombinerSourceEnums oldSource = source;
    boolean oldSourceESet = sourceESet;
    source = SOURCE_EDEFAULT;
    sourceESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__SOURCE, oldSource, SOURCE_EDEFAULT, oldSourceESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetSource() {
    return sourceESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__UNIT, oldUnit, unit));
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
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__OPERAND:
        return getOperand();
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__SOURCE:
        return getSource();
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__UNIT:
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
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__OPERAND:
        setOperand((GlesTexcombinerOperandRGBEnums)newValue);
        return;
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__SOURCE:
        setSource((GlesTexcombinerSourceEnums)newValue);
        return;
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__UNIT:
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
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__OPERAND:
        unsetOperand();
        return;
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__SOURCE:
        unsetSource();
        return;
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__UNIT:
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
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__OPERAND:
        return isSetOperand();
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__SOURCE:
        return isSetSource();
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE__UNIT:
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
    result.append(" (operand: ");
    if (operandESet) result.append(operand); else result.append("<unset>");
    result.append(", source: ");
    if (sourceESet) result.append(source); else result.append("<unset>");
    result.append(", unit: ");
    result.append(unit);
    result.append(')');
    return result.toString();
  }

} //GlesTexcombinerArgumentRGBTypeImpl
