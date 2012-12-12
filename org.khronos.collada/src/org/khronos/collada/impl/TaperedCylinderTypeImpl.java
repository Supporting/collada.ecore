/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.util.Collection;
import java.util.List;

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
import org.khronos.collada.ExtraType;
import org.khronos.collada.TaperedCylinderType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tapered Cylinder Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TaperedCylinderTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TaperedCylinderTypeImpl#getRadius1 <em>Radius1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TaperedCylinderTypeImpl#getRadius2 <em>Radius2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TaperedCylinderTypeImpl#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaperedCylinderTypeImpl extends EObjectImpl implements TaperedCylinderType {
	/**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
	protected double height = HEIGHT_EDEFAULT;

	/**
   * This is true if the Height attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean heightESet;

	/**
   * The default value of the '{@link #getRadius1() <em>Radius1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRadius1()
   * @generated
   * @ordered
   */
	protected static final List<Double> RADIUS1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getRadius1() <em>Radius1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRadius1()
   * @generated
   * @ordered
   */
	protected List<Double> radius1 = RADIUS1_EDEFAULT;

	/**
   * The default value of the '{@link #getRadius2() <em>Radius2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRadius2()
   * @generated
   * @ordered
   */
	protected static final List<Double> RADIUS2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getRadius2() <em>Radius2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRadius2()
   * @generated
   * @ordered
   */
	protected List<Double> radius2 = RADIUS2_EDEFAULT;

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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TaperedCylinderTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTaperedCylinderType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public double getHeight() {
    return height;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHeight(double newHeight) {
    double oldHeight = height;
    height = newHeight;
    boolean oldHeightESet = heightESet;
    heightESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TAPERED_CYLINDER_TYPE__HEIGHT, oldHeight, height, !oldHeightESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetHeight() {
    double oldHeight = height;
    boolean oldHeightESet = heightESet;
    height = HEIGHT_EDEFAULT;
    heightESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.TAPERED_CYLINDER_TYPE__HEIGHT, oldHeight, HEIGHT_EDEFAULT, oldHeightESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetHeight() {
    return heightESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getRadius1() {
    return radius1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRadius1(List<Double> newRadius1) {
    List<Double> oldRadius1 = radius1;
    radius1 = newRadius1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TAPERED_CYLINDER_TYPE__RADIUS1, oldRadius1, radius1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getRadius2() {
    return radius2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRadius2(List<Double> newRadius2) {
    List<Double> oldRadius2 = radius2;
    radius2 = newRadius2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TAPERED_CYLINDER_TYPE__RADIUS2, oldRadius2, radius2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.TAPERED_CYLINDER_TYPE__EXTRA);
    }
    return extra;
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
      case ColladaPackage.TAPERED_CYLINDER_TYPE__EXTRA:
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
      case ColladaPackage.TAPERED_CYLINDER_TYPE__HEIGHT:
        return getHeight();
      case ColladaPackage.TAPERED_CYLINDER_TYPE__RADIUS1:
        return getRadius1();
      case ColladaPackage.TAPERED_CYLINDER_TYPE__RADIUS2:
        return getRadius2();
      case ColladaPackage.TAPERED_CYLINDER_TYPE__EXTRA:
        return getExtra();
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
      case ColladaPackage.TAPERED_CYLINDER_TYPE__HEIGHT:
        setHeight((Double)newValue);
        return;
      case ColladaPackage.TAPERED_CYLINDER_TYPE__RADIUS1:
        setRadius1((List<Double>)newValue);
        return;
      case ColladaPackage.TAPERED_CYLINDER_TYPE__RADIUS2:
        setRadius2((List<Double>)newValue);
        return;
      case ColladaPackage.TAPERED_CYLINDER_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
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
      case ColladaPackage.TAPERED_CYLINDER_TYPE__HEIGHT:
        unsetHeight();
        return;
      case ColladaPackage.TAPERED_CYLINDER_TYPE__RADIUS1:
        setRadius1(RADIUS1_EDEFAULT);
        return;
      case ColladaPackage.TAPERED_CYLINDER_TYPE__RADIUS2:
        setRadius2(RADIUS2_EDEFAULT);
        return;
      case ColladaPackage.TAPERED_CYLINDER_TYPE__EXTRA:
        getExtra().clear();
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
      case ColladaPackage.TAPERED_CYLINDER_TYPE__HEIGHT:
        return isSetHeight();
      case ColladaPackage.TAPERED_CYLINDER_TYPE__RADIUS1:
        return RADIUS1_EDEFAULT == null ? radius1 != null : !RADIUS1_EDEFAULT.equals(radius1);
      case ColladaPackage.TAPERED_CYLINDER_TYPE__RADIUS2:
        return RADIUS2_EDEFAULT == null ? radius2 != null : !RADIUS2_EDEFAULT.equals(radius2);
      case ColladaPackage.TAPERED_CYLINDER_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
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
    result.append(" (height: ");
    if (heightESet) result.append(height); else result.append("<unset>");
    result.append(", radius1: ");
    result.append(radius1);
    result.append(", radius2: ");
    result.append(radius2);
    result.append(')');
    return result.toString();
  }

} //TaperedCylinderTypeImpl
