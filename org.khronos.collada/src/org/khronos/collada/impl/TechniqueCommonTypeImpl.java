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
import org.khronos.collada.TargetableFloat;
import org.khronos.collada.EnabledType;
import org.khronos.collada.InterpenetrateType;
import org.khronos.collada.LimitsType;
import org.khronos.collada.SpringType1;
import org.khronos.collada.TechniqueCommonType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technique Common Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonTypeImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonTypeImpl#getInterpenetrate <em>Interpenetrate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonTypeImpl#getLimits <em>Limits</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonTypeImpl#getSpring <em>Spring</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechniqueCommonTypeImpl extends EObjectImpl implements TechniqueCommonType {
	/**
   * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEnabled()
   * @generated
   * @ordered
   */
	protected EnabledType enabled;

	/**
   * The cached value of the '{@link #getInterpenetrate() <em>Interpenetrate</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInterpenetrate()
   * @generated
   * @ordered
   */
	protected InterpenetrateType interpenetrate;

	/**
   * The cached value of the '{@link #getLimits() <em>Limits</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLimits()
   * @generated
   * @ordered
   */
	protected LimitsType limits;

	/**
   * The cached value of the '{@link #getSpring() <em>Spring</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSpring()
   * @generated
   * @ordered
   */
	protected SpringType1 spring;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TechniqueCommonTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTechniqueCommonType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EnabledType getEnabled() {
    return enabled;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetEnabled(EnabledType newEnabled, NotificationChain msgs) {
    EnabledType oldEnabled = enabled;
    enabled = newEnabled;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE__ENABLED, oldEnabled, newEnabled);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setEnabled(EnabledType newEnabled) {
    if (newEnabled != enabled)
    {
      NotificationChain msgs = null;
      if (enabled != null)
        msgs = ((InternalEObject)enabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE__ENABLED, null, msgs);
      if (newEnabled != null)
        msgs = ((InternalEObject)newEnabled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE__ENABLED, null, msgs);
      msgs = basicSetEnabled(newEnabled, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE__ENABLED, newEnabled, newEnabled));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InterpenetrateType getInterpenetrate() {
    return interpenetrate;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInterpenetrate(InterpenetrateType newInterpenetrate, NotificationChain msgs) {
    InterpenetrateType oldInterpenetrate = interpenetrate;
    interpenetrate = newInterpenetrate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE__INTERPENETRATE, oldInterpenetrate, newInterpenetrate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInterpenetrate(InterpenetrateType newInterpenetrate) {
    if (newInterpenetrate != interpenetrate)
    {
      NotificationChain msgs = null;
      if (interpenetrate != null)
        msgs = ((InternalEObject)interpenetrate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE__INTERPENETRATE, null, msgs);
      if (newInterpenetrate != null)
        msgs = ((InternalEObject)newInterpenetrate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE__INTERPENETRATE, null, msgs);
      msgs = basicSetInterpenetrate(newInterpenetrate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE__INTERPENETRATE, newInterpenetrate, newInterpenetrate));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LimitsType getLimits() {
    return limits;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLimits(LimitsType newLimits, NotificationChain msgs) {
    LimitsType oldLimits = limits;
    limits = newLimits;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE__LIMITS, oldLimits, newLimits);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLimits(LimitsType newLimits) {
    if (newLimits != limits)
    {
      NotificationChain msgs = null;
      if (limits != null)
        msgs = ((InternalEObject)limits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE__LIMITS, null, msgs);
      if (newLimits != null)
        msgs = ((InternalEObject)newLimits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE__LIMITS, null, msgs);
      msgs = basicSetLimits(newLimits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE__LIMITS, newLimits, newLimits));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SpringType1 getSpring() {
    return spring;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSpring(SpringType1 newSpring, NotificationChain msgs) {
    SpringType1 oldSpring = spring;
    spring = newSpring;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE__SPRING, oldSpring, newSpring);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSpring(SpringType1 newSpring) {
    if (newSpring != spring)
    {
      NotificationChain msgs = null;
      if (spring != null)
        msgs = ((InternalEObject)spring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE__SPRING, null, msgs);
      if (newSpring != null)
        msgs = ((InternalEObject)newSpring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE__SPRING, null, msgs);
      msgs = basicSetSpring(newSpring, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE__SPRING, newSpring, newSpring));
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__ENABLED:
        return basicSetEnabled(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__INTERPENETRATE:
        return basicSetInterpenetrate(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__LIMITS:
        return basicSetLimits(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__SPRING:
        return basicSetSpring(null, msgs);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__ENABLED:
        return getEnabled();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__INTERPENETRATE:
        return getInterpenetrate();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__LIMITS:
        return getLimits();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__SPRING:
        return getSpring();
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__ENABLED:
        setEnabled((EnabledType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__INTERPENETRATE:
        setInterpenetrate((InterpenetrateType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__LIMITS:
        setLimits((LimitsType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__SPRING:
        setSpring((SpringType1)newValue);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__ENABLED:
        setEnabled((EnabledType)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__INTERPENETRATE:
        setInterpenetrate((InterpenetrateType)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__LIMITS:
        setLimits((LimitsType)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__SPRING:
        setSpring((SpringType1)null);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__ENABLED:
        return enabled != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__INTERPENETRATE:
        return interpenetrate != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__LIMITS:
        return limits != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE__SPRING:
        return spring != null;
    }
    return super.eIsSet(featureID);
  }

} //TechniqueCommonTypeImpl
