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
import org.khronos.collada.LimitsType;
import org.khronos.collada.LinearType1;
import org.khronos.collada.SwingConeAndTwistType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limits Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.LimitsTypeImpl#getSwingConeAndTwist <em>Swing Cone And Twist</em>}</li>
 *   <li>{@link org.khronos.collada.impl.LimitsTypeImpl#getLinear <em>Linear</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LimitsTypeImpl extends EObjectImpl implements LimitsType {
	/**
   * The cached value of the '{@link #getSwingConeAndTwist() <em>Swing Cone And Twist</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSwingConeAndTwist()
   * @generated
   * @ordered
   */
	protected SwingConeAndTwistType swingConeAndTwist;

	/**
   * The cached value of the '{@link #getLinear() <em>Linear</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLinear()
   * @generated
   * @ordered
   */
	protected LinearType1 linear;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected LimitsTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getLimitsType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SwingConeAndTwistType getSwingConeAndTwist() {
    return swingConeAndTwist;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSwingConeAndTwist(SwingConeAndTwistType newSwingConeAndTwist, NotificationChain msgs) {
    SwingConeAndTwistType oldSwingConeAndTwist = swingConeAndTwist;
    swingConeAndTwist = newSwingConeAndTwist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.LIMITS_TYPE__SWING_CONE_AND_TWIST, oldSwingConeAndTwist, newSwingConeAndTwist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSwingConeAndTwist(SwingConeAndTwistType newSwingConeAndTwist) {
    if (newSwingConeAndTwist != swingConeAndTwist)
    {
      NotificationChain msgs = null;
      if (swingConeAndTwist != null)
        msgs = ((InternalEObject)swingConeAndTwist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.LIMITS_TYPE__SWING_CONE_AND_TWIST, null, msgs);
      if (newSwingConeAndTwist != null)
        msgs = ((InternalEObject)newSwingConeAndTwist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.LIMITS_TYPE__SWING_CONE_AND_TWIST, null, msgs);
      msgs = basicSetSwingConeAndTwist(newSwingConeAndTwist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.LIMITS_TYPE__SWING_CONE_AND_TWIST, newSwingConeAndTwist, newSwingConeAndTwist));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LinearType1 getLinear() {
    return linear;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLinear(LinearType1 newLinear, NotificationChain msgs) {
    LinearType1 oldLinear = linear;
    linear = newLinear;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.LIMITS_TYPE__LINEAR, oldLinear, newLinear);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLinear(LinearType1 newLinear) {
    if (newLinear != linear)
    {
      NotificationChain msgs = null;
      if (linear != null)
        msgs = ((InternalEObject)linear).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.LIMITS_TYPE__LINEAR, null, msgs);
      if (newLinear != null)
        msgs = ((InternalEObject)newLinear).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.LIMITS_TYPE__LINEAR, null, msgs);
      msgs = basicSetLinear(newLinear, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.LIMITS_TYPE__LINEAR, newLinear, newLinear));
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
      case ColladaPackage.LIMITS_TYPE__SWING_CONE_AND_TWIST:
        return basicSetSwingConeAndTwist(null, msgs);
      case ColladaPackage.LIMITS_TYPE__LINEAR:
        return basicSetLinear(null, msgs);
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
      case ColladaPackage.LIMITS_TYPE__SWING_CONE_AND_TWIST:
        return getSwingConeAndTwist();
      case ColladaPackage.LIMITS_TYPE__LINEAR:
        return getLinear();
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
      case ColladaPackage.LIMITS_TYPE__SWING_CONE_AND_TWIST:
        setSwingConeAndTwist((SwingConeAndTwistType)newValue);
        return;
      case ColladaPackage.LIMITS_TYPE__LINEAR:
        setLinear((LinearType1)newValue);
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
      case ColladaPackage.LIMITS_TYPE__SWING_CONE_AND_TWIST:
        setSwingConeAndTwist((SwingConeAndTwistType)null);
        return;
      case ColladaPackage.LIMITS_TYPE__LINEAR:
        setLinear((LinearType1)null);
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
      case ColladaPackage.LIMITS_TYPE__SWING_CONE_AND_TWIST:
        return swingConeAndTwist != null;
      case ColladaPackage.LIMITS_TYPE__LINEAR:
        return linear != null;
    }
    return super.eIsSet(featureID);
  }

} //LimitsTypeImpl
