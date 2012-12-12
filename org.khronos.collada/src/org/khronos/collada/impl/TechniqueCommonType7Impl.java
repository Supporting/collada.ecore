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
import org.khronos.collada.InstanceMaterialType;
import org.khronos.collada.TargetableFloat;
import org.khronos.collada.TargetableFloat3;
import org.khronos.collada.TechniqueCommonType7;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technique Common Type7</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType7Impl#getGravity <em>Gravity</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType7Impl#getTimeStep <em>Time Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechniqueCommonType7Impl extends EObjectImpl implements TechniqueCommonType7 {
	/**
   * The cached value of the '{@link #getGravity() <em>Gravity</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGravity()
   * @generated
   * @ordered
   */
	protected TargetableFloat3 gravity;
	/**
   * The cached value of the '{@link #getTimeStep() <em>Time Step</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTimeStep()
   * @generated
   * @ordered
   */
	protected TargetableFloat timeStep;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TechniqueCommonType7Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTechniqueCommonType7();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat3 getGravity() {
    return gravity;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetGravity(TargetableFloat3 newGravity, NotificationChain msgs) {
    TargetableFloat3 oldGravity = gravity;
    gravity = newGravity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE7__GRAVITY, oldGravity, newGravity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setGravity(TargetableFloat3 newGravity) {
    if (newGravity != gravity)
    {
      NotificationChain msgs = null;
      if (gravity != null)
        msgs = ((InternalEObject)gravity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE7__GRAVITY, null, msgs);
      if (newGravity != null)
        msgs = ((InternalEObject)newGravity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE7__GRAVITY, null, msgs);
      msgs = basicSetGravity(newGravity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE7__GRAVITY, newGravity, newGravity));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getTimeStep() {
    return timeStep;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTimeStep(TargetableFloat newTimeStep, NotificationChain msgs) {
    TargetableFloat oldTimeStep = timeStep;
    timeStep = newTimeStep;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE7__TIME_STEP, oldTimeStep, newTimeStep);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTimeStep(TargetableFloat newTimeStep) {
    if (newTimeStep != timeStep)
    {
      NotificationChain msgs = null;
      if (timeStep != null)
        msgs = ((InternalEObject)timeStep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE7__TIME_STEP, null, msgs);
      if (newTimeStep != null)
        msgs = ((InternalEObject)newTimeStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE7__TIME_STEP, null, msgs);
      msgs = basicSetTimeStep(newTimeStep, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE7__TIME_STEP, newTimeStep, newTimeStep));
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE7__GRAVITY:
        return basicSetGravity(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE7__TIME_STEP:
        return basicSetTimeStep(null, msgs);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE7__GRAVITY:
        return getGravity();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE7__TIME_STEP:
        return getTimeStep();
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE7__GRAVITY:
        setGravity((TargetableFloat3)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE7__TIME_STEP:
        setTimeStep((TargetableFloat)newValue);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE7__GRAVITY:
        setGravity((TargetableFloat3)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE7__TIME_STEP:
        setTimeStep((TargetableFloat)null);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE7__GRAVITY:
        return gravity != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE7__TIME_STEP:
        return timeStep != null;
    }
    return super.eIsSet(featureID);
  }

} //TechniqueCommonType7Impl
