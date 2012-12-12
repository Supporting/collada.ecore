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
import org.khronos.collada.SpotType;
import org.khronos.collada.TargetableFloat;
import org.khronos.collada.TargetableFloat3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spot Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.SpotTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SpotTypeImpl#getConstantAttenuation <em>Constant Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SpotTypeImpl#getLinearAttenuation <em>Linear Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SpotTypeImpl#getQuadraticAttenuation <em>Quadratic Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SpotTypeImpl#getFalloffAngle <em>Falloff Angle</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SpotTypeImpl#getFalloffExponent <em>Falloff Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpotTypeImpl extends EObjectImpl implements SpotType {
	/**
   * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
	protected TargetableFloat3 color;

	/**
   * The cached value of the '{@link #getConstantAttenuation() <em>Constant Attenuation</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConstantAttenuation()
   * @generated
   * @ordered
   */
	protected TargetableFloat constantAttenuation;

	/**
   * The cached value of the '{@link #getLinearAttenuation() <em>Linear Attenuation</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLinearAttenuation()
   * @generated
   * @ordered
   */
	protected TargetableFloat linearAttenuation;

	/**
   * The cached value of the '{@link #getQuadraticAttenuation() <em>Quadratic Attenuation</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getQuadraticAttenuation()
   * @generated
   * @ordered
   */
	protected TargetableFloat quadraticAttenuation;

	/**
   * The cached value of the '{@link #getFalloffAngle() <em>Falloff Angle</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFalloffAngle()
   * @generated
   * @ordered
   */
	protected TargetableFloat falloffAngle;

	/**
   * The cached value of the '{@link #getFalloffExponent() <em>Falloff Exponent</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFalloffExponent()
   * @generated
   * @ordered
   */
	protected TargetableFloat falloffExponent;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SpotTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getSpotType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat3 getColor() {
    return color;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetColor(TargetableFloat3 newColor, NotificationChain msgs) {
    TargetableFloat3 oldColor = color;
    color = newColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SPOT_TYPE__COLOR, oldColor, newColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setColor(TargetableFloat3 newColor) {
    if (newColor != color)
    {
      NotificationChain msgs = null;
      if (color != null)
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPOT_TYPE__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPOT_TYPE__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SPOT_TYPE__COLOR, newColor, newColor));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getConstantAttenuation() {
    return constantAttenuation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetConstantAttenuation(TargetableFloat newConstantAttenuation, NotificationChain msgs) {
    TargetableFloat oldConstantAttenuation = constantAttenuation;
    constantAttenuation = newConstantAttenuation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SPOT_TYPE__CONSTANT_ATTENUATION, oldConstantAttenuation, newConstantAttenuation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setConstantAttenuation(TargetableFloat newConstantAttenuation) {
    if (newConstantAttenuation != constantAttenuation)
    {
      NotificationChain msgs = null;
      if (constantAttenuation != null)
        msgs = ((InternalEObject)constantAttenuation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPOT_TYPE__CONSTANT_ATTENUATION, null, msgs);
      if (newConstantAttenuation != null)
        msgs = ((InternalEObject)newConstantAttenuation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPOT_TYPE__CONSTANT_ATTENUATION, null, msgs);
      msgs = basicSetConstantAttenuation(newConstantAttenuation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SPOT_TYPE__CONSTANT_ATTENUATION, newConstantAttenuation, newConstantAttenuation));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getLinearAttenuation() {
    return linearAttenuation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLinearAttenuation(TargetableFloat newLinearAttenuation, NotificationChain msgs) {
    TargetableFloat oldLinearAttenuation = linearAttenuation;
    linearAttenuation = newLinearAttenuation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SPOT_TYPE__LINEAR_ATTENUATION, oldLinearAttenuation, newLinearAttenuation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLinearAttenuation(TargetableFloat newLinearAttenuation) {
    if (newLinearAttenuation != linearAttenuation)
    {
      NotificationChain msgs = null;
      if (linearAttenuation != null)
        msgs = ((InternalEObject)linearAttenuation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPOT_TYPE__LINEAR_ATTENUATION, null, msgs);
      if (newLinearAttenuation != null)
        msgs = ((InternalEObject)newLinearAttenuation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPOT_TYPE__LINEAR_ATTENUATION, null, msgs);
      msgs = basicSetLinearAttenuation(newLinearAttenuation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SPOT_TYPE__LINEAR_ATTENUATION, newLinearAttenuation, newLinearAttenuation));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getQuadraticAttenuation() {
    return quadraticAttenuation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetQuadraticAttenuation(TargetableFloat newQuadraticAttenuation, NotificationChain msgs) {
    TargetableFloat oldQuadraticAttenuation = quadraticAttenuation;
    quadraticAttenuation = newQuadraticAttenuation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SPOT_TYPE__QUADRATIC_ATTENUATION, oldQuadraticAttenuation, newQuadraticAttenuation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setQuadraticAttenuation(TargetableFloat newQuadraticAttenuation) {
    if (newQuadraticAttenuation != quadraticAttenuation)
    {
      NotificationChain msgs = null;
      if (quadraticAttenuation != null)
        msgs = ((InternalEObject)quadraticAttenuation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPOT_TYPE__QUADRATIC_ATTENUATION, null, msgs);
      if (newQuadraticAttenuation != null)
        msgs = ((InternalEObject)newQuadraticAttenuation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPOT_TYPE__QUADRATIC_ATTENUATION, null, msgs);
      msgs = basicSetQuadraticAttenuation(newQuadraticAttenuation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SPOT_TYPE__QUADRATIC_ATTENUATION, newQuadraticAttenuation, newQuadraticAttenuation));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getFalloffAngle() {
    return falloffAngle;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFalloffAngle(TargetableFloat newFalloffAngle, NotificationChain msgs) {
    TargetableFloat oldFalloffAngle = falloffAngle;
    falloffAngle = newFalloffAngle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SPOT_TYPE__FALLOFF_ANGLE, oldFalloffAngle, newFalloffAngle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFalloffAngle(TargetableFloat newFalloffAngle) {
    if (newFalloffAngle != falloffAngle)
    {
      NotificationChain msgs = null;
      if (falloffAngle != null)
        msgs = ((InternalEObject)falloffAngle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPOT_TYPE__FALLOFF_ANGLE, null, msgs);
      if (newFalloffAngle != null)
        msgs = ((InternalEObject)newFalloffAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPOT_TYPE__FALLOFF_ANGLE, null, msgs);
      msgs = basicSetFalloffAngle(newFalloffAngle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SPOT_TYPE__FALLOFF_ANGLE, newFalloffAngle, newFalloffAngle));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getFalloffExponent() {
    return falloffExponent;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFalloffExponent(TargetableFloat newFalloffExponent, NotificationChain msgs) {
    TargetableFloat oldFalloffExponent = falloffExponent;
    falloffExponent = newFalloffExponent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SPOT_TYPE__FALLOFF_EXPONENT, oldFalloffExponent, newFalloffExponent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFalloffExponent(TargetableFloat newFalloffExponent) {
    if (newFalloffExponent != falloffExponent)
    {
      NotificationChain msgs = null;
      if (falloffExponent != null)
        msgs = ((InternalEObject)falloffExponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPOT_TYPE__FALLOFF_EXPONENT, null, msgs);
      if (newFalloffExponent != null)
        msgs = ((InternalEObject)newFalloffExponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPOT_TYPE__FALLOFF_EXPONENT, null, msgs);
      msgs = basicSetFalloffExponent(newFalloffExponent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SPOT_TYPE__FALLOFF_EXPONENT, newFalloffExponent, newFalloffExponent));
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
      case ColladaPackage.SPOT_TYPE__COLOR:
        return basicSetColor(null, msgs);
      case ColladaPackage.SPOT_TYPE__CONSTANT_ATTENUATION:
        return basicSetConstantAttenuation(null, msgs);
      case ColladaPackage.SPOT_TYPE__LINEAR_ATTENUATION:
        return basicSetLinearAttenuation(null, msgs);
      case ColladaPackage.SPOT_TYPE__QUADRATIC_ATTENUATION:
        return basicSetQuadraticAttenuation(null, msgs);
      case ColladaPackage.SPOT_TYPE__FALLOFF_ANGLE:
        return basicSetFalloffAngle(null, msgs);
      case ColladaPackage.SPOT_TYPE__FALLOFF_EXPONENT:
        return basicSetFalloffExponent(null, msgs);
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
      case ColladaPackage.SPOT_TYPE__COLOR:
        return getColor();
      case ColladaPackage.SPOT_TYPE__CONSTANT_ATTENUATION:
        return getConstantAttenuation();
      case ColladaPackage.SPOT_TYPE__LINEAR_ATTENUATION:
        return getLinearAttenuation();
      case ColladaPackage.SPOT_TYPE__QUADRATIC_ATTENUATION:
        return getQuadraticAttenuation();
      case ColladaPackage.SPOT_TYPE__FALLOFF_ANGLE:
        return getFalloffAngle();
      case ColladaPackage.SPOT_TYPE__FALLOFF_EXPONENT:
        return getFalloffExponent();
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
      case ColladaPackage.SPOT_TYPE__COLOR:
        setColor((TargetableFloat3)newValue);
        return;
      case ColladaPackage.SPOT_TYPE__CONSTANT_ATTENUATION:
        setConstantAttenuation((TargetableFloat)newValue);
        return;
      case ColladaPackage.SPOT_TYPE__LINEAR_ATTENUATION:
        setLinearAttenuation((TargetableFloat)newValue);
        return;
      case ColladaPackage.SPOT_TYPE__QUADRATIC_ATTENUATION:
        setQuadraticAttenuation((TargetableFloat)newValue);
        return;
      case ColladaPackage.SPOT_TYPE__FALLOFF_ANGLE:
        setFalloffAngle((TargetableFloat)newValue);
        return;
      case ColladaPackage.SPOT_TYPE__FALLOFF_EXPONENT:
        setFalloffExponent((TargetableFloat)newValue);
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
      case ColladaPackage.SPOT_TYPE__COLOR:
        setColor((TargetableFloat3)null);
        return;
      case ColladaPackage.SPOT_TYPE__CONSTANT_ATTENUATION:
        setConstantAttenuation((TargetableFloat)null);
        return;
      case ColladaPackage.SPOT_TYPE__LINEAR_ATTENUATION:
        setLinearAttenuation((TargetableFloat)null);
        return;
      case ColladaPackage.SPOT_TYPE__QUADRATIC_ATTENUATION:
        setQuadraticAttenuation((TargetableFloat)null);
        return;
      case ColladaPackage.SPOT_TYPE__FALLOFF_ANGLE:
        setFalloffAngle((TargetableFloat)null);
        return;
      case ColladaPackage.SPOT_TYPE__FALLOFF_EXPONENT:
        setFalloffExponent((TargetableFloat)null);
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
      case ColladaPackage.SPOT_TYPE__COLOR:
        return color != null;
      case ColladaPackage.SPOT_TYPE__CONSTANT_ATTENUATION:
        return constantAttenuation != null;
      case ColladaPackage.SPOT_TYPE__LINEAR_ATTENUATION:
        return linearAttenuation != null;
      case ColladaPackage.SPOT_TYPE__QUADRATIC_ATTENUATION:
        return quadraticAttenuation != null;
      case ColladaPackage.SPOT_TYPE__FALLOFF_ANGLE:
        return falloffAngle != null;
      case ColladaPackage.SPOT_TYPE__FALLOFF_EXPONENT:
        return falloffExponent != null;
    }
    return super.eIsSet(featureID);
  }

} //SpotTypeImpl
