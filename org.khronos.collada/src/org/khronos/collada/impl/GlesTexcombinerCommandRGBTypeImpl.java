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

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.GlesTexcombinerArgumentRGBType;
import org.khronos.collada.GlesTexcombinerCommandRGBType;
import org.khronos.collada.GlesTexcombinerOperatorRGBEnums;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gles Texcombiner Command RGB Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.GlesTexcombinerCommandRGBTypeImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTexcombinerCommandRGBTypeImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTexcombinerCommandRGBTypeImpl#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlesTexcombinerCommandRGBTypeImpl extends EObjectImpl implements GlesTexcombinerCommandRGBType {
	/**
   * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
	protected EList<GlesTexcombinerArgumentRGBType> argument;

	/**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
	protected static final GlesTexcombinerOperatorRGBEnums OPERATOR_EDEFAULT = GlesTexcombinerOperatorRGBEnums.REPLACE;

	/**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
	protected GlesTexcombinerOperatorRGBEnums operator = OPERATOR_EDEFAULT;

	/**
   * This is true if the Operator attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean operatorESet;

	/**
   * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getScale()
   * @generated
   * @ordered
   */
	protected static final float SCALE_EDEFAULT = 0.0F;

	/**
   * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getScale()
   * @generated
   * @ordered
   */
	protected float scale = SCALE_EDEFAULT;

	/**
   * This is true if the Scale attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean scaleESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected GlesTexcombinerCommandRGBTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getGlesTexcombinerCommandRGBType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<GlesTexcombinerArgumentRGBType> getArgument() {
    if (argument == null)
    {
      argument = new EObjectContainmentEList<GlesTexcombinerArgumentRGBType>(GlesTexcombinerArgumentRGBType.class, this, ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__ARGUMENT);
    }
    return argument;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerOperatorRGBEnums getOperator() {
    return operator;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setOperator(GlesTexcombinerOperatorRGBEnums newOperator) {
    GlesTexcombinerOperatorRGBEnums oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    boolean oldOperatorESet = operatorESet;
    operatorESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__OPERATOR, oldOperator, operator, !oldOperatorESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetOperator() {
    GlesTexcombinerOperatorRGBEnums oldOperator = operator;
    boolean oldOperatorESet = operatorESet;
    operator = OPERATOR_EDEFAULT;
    operatorESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__OPERATOR, oldOperator, OPERATOR_EDEFAULT, oldOperatorESet));
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
	public float getScale() {
    return scale;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setScale(float newScale) {
    float oldScale = scale;
    scale = newScale;
    boolean oldScaleESet = scaleESet;
    scaleESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__SCALE, oldScale, scale, !oldScaleESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetScale() {
    float oldScale = scale;
    boolean oldScaleESet = scaleESet;
    scale = SCALE_EDEFAULT;
    scaleESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__SCALE, oldScale, SCALE_EDEFAULT, oldScaleESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetScale() {
    return scaleESet;
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
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__ARGUMENT:
        return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
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
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__ARGUMENT:
        return getArgument();
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__OPERATOR:
        return getOperator();
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__SCALE:
        return getScale();
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
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__ARGUMENT:
        getArgument().clear();
        getArgument().addAll((Collection<? extends GlesTexcombinerArgumentRGBType>)newValue);
        return;
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__OPERATOR:
        setOperator((GlesTexcombinerOperatorRGBEnums)newValue);
        return;
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__SCALE:
        setScale((Float)newValue);
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
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__ARGUMENT:
        getArgument().clear();
        return;
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__OPERATOR:
        unsetOperator();
        return;
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__SCALE:
        unsetScale();
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
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__ARGUMENT:
        return argument != null && !argument.isEmpty();
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__OPERATOR:
        return isSetOperator();
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE__SCALE:
        return isSetScale();
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
    result.append(", scale: ");
    if (scaleESet) result.append(scale); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //GlesTexcombinerCommandRGBTypeImpl
