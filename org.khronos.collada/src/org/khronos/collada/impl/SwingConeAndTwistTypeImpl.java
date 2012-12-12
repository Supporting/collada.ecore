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
import org.khronos.collada.SwingConeAndTwistType;
import org.khronos.collada.TargetableFloat3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swing Cone And Twist Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.SwingConeAndTwistTypeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SwingConeAndTwistTypeImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwingConeAndTwistTypeImpl extends EObjectImpl implements SwingConeAndTwistType {
	/**
   * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
	protected TargetableFloat3 min;

	/**
   * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
	protected TargetableFloat3 max;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SwingConeAndTwistTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getSwingConeAndTwistType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat3 getMin() {
    return min;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMin(TargetableFloat3 newMin, NotificationChain msgs) {
    TargetableFloat3 oldMin = min;
    min = newMin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MIN, oldMin, newMin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMin(TargetableFloat3 newMin) {
    if (newMin != min)
    {
      NotificationChain msgs = null;
      if (min != null)
        msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MIN, null, msgs);
      if (newMin != null)
        msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MIN, null, msgs);
      msgs = basicSetMin(newMin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MIN, newMin, newMin));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat3 getMax() {
    return max;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMax(TargetableFloat3 newMax, NotificationChain msgs) {
    TargetableFloat3 oldMax = max;
    max = newMax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MAX, oldMax, newMax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMax(TargetableFloat3 newMax) {
    if (newMax != max)
    {
      NotificationChain msgs = null;
      if (max != null)
        msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MAX, null, msgs);
      if (newMax != null)
        msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MAX, null, msgs);
      msgs = basicSetMax(newMax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MAX, newMax, newMax));
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
      case ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MIN:
        return basicSetMin(null, msgs);
      case ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MAX:
        return basicSetMax(null, msgs);
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
      case ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MIN:
        return getMin();
      case ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MAX:
        return getMax();
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
      case ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MIN:
        setMin((TargetableFloat3)newValue);
        return;
      case ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MAX:
        setMax((TargetableFloat3)newValue);
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
      case ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MIN:
        setMin((TargetableFloat3)null);
        return;
      case ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MAX:
        setMax((TargetableFloat3)null);
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
      case ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MIN:
        return min != null;
      case ColladaPackage.SWING_CONE_AND_TWIST_TYPE__MAX:
        return max != null;
    }
    return super.eIsSet(featureID);
  }

} //SwingConeAndTwistTypeImpl
