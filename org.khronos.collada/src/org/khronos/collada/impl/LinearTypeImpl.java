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
import org.khronos.collada.LinearType;
import org.khronos.collada.TargetableFloat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.LinearTypeImpl#getStiffness <em>Stiffness</em>}</li>
 *   <li>{@link org.khronos.collada.impl.LinearTypeImpl#getDamping <em>Damping</em>}</li>
 *   <li>{@link org.khronos.collada.impl.LinearTypeImpl#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinearTypeImpl extends EObjectImpl implements LinearType {
	/**
   * The cached value of the '{@link #getStiffness() <em>Stiffness</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStiffness()
   * @generated
   * @ordered
   */
	protected TargetableFloat stiffness;

	/**
   * The cached value of the '{@link #getDamping() <em>Damping</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDamping()
   * @generated
   * @ordered
   */
	protected TargetableFloat damping;

	/**
   * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTargetValue()
   * @generated
   * @ordered
   */
	protected TargetableFloat targetValue;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected LinearTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getLinearType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getStiffness() {
    return stiffness;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetStiffness(TargetableFloat newStiffness, NotificationChain msgs) {
    TargetableFloat oldStiffness = stiffness;
    stiffness = newStiffness;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.LINEAR_TYPE__STIFFNESS, oldStiffness, newStiffness);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setStiffness(TargetableFloat newStiffness) {
    if (newStiffness != stiffness)
    {
      NotificationChain msgs = null;
      if (stiffness != null)
        msgs = ((InternalEObject)stiffness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.LINEAR_TYPE__STIFFNESS, null, msgs);
      if (newStiffness != null)
        msgs = ((InternalEObject)newStiffness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.LINEAR_TYPE__STIFFNESS, null, msgs);
      msgs = basicSetStiffness(newStiffness, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.LINEAR_TYPE__STIFFNESS, newStiffness, newStiffness));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getDamping() {
    return damping;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDamping(TargetableFloat newDamping, NotificationChain msgs) {
    TargetableFloat oldDamping = damping;
    damping = newDamping;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.LINEAR_TYPE__DAMPING, oldDamping, newDamping);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDamping(TargetableFloat newDamping) {
    if (newDamping != damping)
    {
      NotificationChain msgs = null;
      if (damping != null)
        msgs = ((InternalEObject)damping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.LINEAR_TYPE__DAMPING, null, msgs);
      if (newDamping != null)
        msgs = ((InternalEObject)newDamping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.LINEAR_TYPE__DAMPING, null, msgs);
      msgs = basicSetDamping(newDamping, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.LINEAR_TYPE__DAMPING, newDamping, newDamping));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getTargetValue() {
    return targetValue;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTargetValue(TargetableFloat newTargetValue, NotificationChain msgs) {
    TargetableFloat oldTargetValue = targetValue;
    targetValue = newTargetValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.LINEAR_TYPE__TARGET_VALUE, oldTargetValue, newTargetValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTargetValue(TargetableFloat newTargetValue) {
    if (newTargetValue != targetValue)
    {
      NotificationChain msgs = null;
      if (targetValue != null)
        msgs = ((InternalEObject)targetValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.LINEAR_TYPE__TARGET_VALUE, null, msgs);
      if (newTargetValue != null)
        msgs = ((InternalEObject)newTargetValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.LINEAR_TYPE__TARGET_VALUE, null, msgs);
      msgs = basicSetTargetValue(newTargetValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.LINEAR_TYPE__TARGET_VALUE, newTargetValue, newTargetValue));
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
      case ColladaPackage.LINEAR_TYPE__STIFFNESS:
        return basicSetStiffness(null, msgs);
      case ColladaPackage.LINEAR_TYPE__DAMPING:
        return basicSetDamping(null, msgs);
      case ColladaPackage.LINEAR_TYPE__TARGET_VALUE:
        return basicSetTargetValue(null, msgs);
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
      case ColladaPackage.LINEAR_TYPE__STIFFNESS:
        return getStiffness();
      case ColladaPackage.LINEAR_TYPE__DAMPING:
        return getDamping();
      case ColladaPackage.LINEAR_TYPE__TARGET_VALUE:
        return getTargetValue();
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
      case ColladaPackage.LINEAR_TYPE__STIFFNESS:
        setStiffness((TargetableFloat)newValue);
        return;
      case ColladaPackage.LINEAR_TYPE__DAMPING:
        setDamping((TargetableFloat)newValue);
        return;
      case ColladaPackage.LINEAR_TYPE__TARGET_VALUE:
        setTargetValue((TargetableFloat)newValue);
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
      case ColladaPackage.LINEAR_TYPE__STIFFNESS:
        setStiffness((TargetableFloat)null);
        return;
      case ColladaPackage.LINEAR_TYPE__DAMPING:
        setDamping((TargetableFloat)null);
        return;
      case ColladaPackage.LINEAR_TYPE__TARGET_VALUE:
        setTargetValue((TargetableFloat)null);
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
      case ColladaPackage.LINEAR_TYPE__STIFFNESS:
        return stiffness != null;
      case ColladaPackage.LINEAR_TYPE__DAMPING:
        return damping != null;
      case ColladaPackage.LINEAR_TYPE__TARGET_VALUE:
        return targetValue != null;
    }
    return super.eIsSet(featureID);
  }

} //LinearTypeImpl
