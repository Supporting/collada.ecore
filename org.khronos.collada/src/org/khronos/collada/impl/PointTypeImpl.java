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
import org.khronos.collada.PointType;
import org.khronos.collada.TargetableFloat;
import org.khronos.collada.TargetableFloat3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.PointTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PointTypeImpl#getConstantAttenuation <em>Constant Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PointTypeImpl#getLinearAttenuation <em>Linear Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PointTypeImpl#getQuadraticAttenuation <em>Quadratic Attenuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointTypeImpl extends EObjectImpl implements PointType {
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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PointTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getPointType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.POINT_TYPE__COLOR, oldColor, newColor);
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
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.POINT_TYPE__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.POINT_TYPE__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.POINT_TYPE__COLOR, newColor, newColor));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.POINT_TYPE__CONSTANT_ATTENUATION, oldConstantAttenuation, newConstantAttenuation);
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
        msgs = ((InternalEObject)constantAttenuation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.POINT_TYPE__CONSTANT_ATTENUATION, null, msgs);
      if (newConstantAttenuation != null)
        msgs = ((InternalEObject)newConstantAttenuation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.POINT_TYPE__CONSTANT_ATTENUATION, null, msgs);
      msgs = basicSetConstantAttenuation(newConstantAttenuation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.POINT_TYPE__CONSTANT_ATTENUATION, newConstantAttenuation, newConstantAttenuation));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.POINT_TYPE__LINEAR_ATTENUATION, oldLinearAttenuation, newLinearAttenuation);
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
        msgs = ((InternalEObject)linearAttenuation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.POINT_TYPE__LINEAR_ATTENUATION, null, msgs);
      if (newLinearAttenuation != null)
        msgs = ((InternalEObject)newLinearAttenuation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.POINT_TYPE__LINEAR_ATTENUATION, null, msgs);
      msgs = basicSetLinearAttenuation(newLinearAttenuation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.POINT_TYPE__LINEAR_ATTENUATION, newLinearAttenuation, newLinearAttenuation));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.POINT_TYPE__QUADRATIC_ATTENUATION, oldQuadraticAttenuation, newQuadraticAttenuation);
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
        msgs = ((InternalEObject)quadraticAttenuation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.POINT_TYPE__QUADRATIC_ATTENUATION, null, msgs);
      if (newQuadraticAttenuation != null)
        msgs = ((InternalEObject)newQuadraticAttenuation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.POINT_TYPE__QUADRATIC_ATTENUATION, null, msgs);
      msgs = basicSetQuadraticAttenuation(newQuadraticAttenuation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.POINT_TYPE__QUADRATIC_ATTENUATION, newQuadraticAttenuation, newQuadraticAttenuation));
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
      case ColladaPackage.POINT_TYPE__COLOR:
        return basicSetColor(null, msgs);
      case ColladaPackage.POINT_TYPE__CONSTANT_ATTENUATION:
        return basicSetConstantAttenuation(null, msgs);
      case ColladaPackage.POINT_TYPE__LINEAR_ATTENUATION:
        return basicSetLinearAttenuation(null, msgs);
      case ColladaPackage.POINT_TYPE__QUADRATIC_ATTENUATION:
        return basicSetQuadraticAttenuation(null, msgs);
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
      case ColladaPackage.POINT_TYPE__COLOR:
        return getColor();
      case ColladaPackage.POINT_TYPE__CONSTANT_ATTENUATION:
        return getConstantAttenuation();
      case ColladaPackage.POINT_TYPE__LINEAR_ATTENUATION:
        return getLinearAttenuation();
      case ColladaPackage.POINT_TYPE__QUADRATIC_ATTENUATION:
        return getQuadraticAttenuation();
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
      case ColladaPackage.POINT_TYPE__COLOR:
        setColor((TargetableFloat3)newValue);
        return;
      case ColladaPackage.POINT_TYPE__CONSTANT_ATTENUATION:
        setConstantAttenuation((TargetableFloat)newValue);
        return;
      case ColladaPackage.POINT_TYPE__LINEAR_ATTENUATION:
        setLinearAttenuation((TargetableFloat)newValue);
        return;
      case ColladaPackage.POINT_TYPE__QUADRATIC_ATTENUATION:
        setQuadraticAttenuation((TargetableFloat)newValue);
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
      case ColladaPackage.POINT_TYPE__COLOR:
        setColor((TargetableFloat3)null);
        return;
      case ColladaPackage.POINT_TYPE__CONSTANT_ATTENUATION:
        setConstantAttenuation((TargetableFloat)null);
        return;
      case ColladaPackage.POINT_TYPE__LINEAR_ATTENUATION:
        setLinearAttenuation((TargetableFloat)null);
        return;
      case ColladaPackage.POINT_TYPE__QUADRATIC_ATTENUATION:
        setQuadraticAttenuation((TargetableFloat)null);
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
      case ColladaPackage.POINT_TYPE__COLOR:
        return color != null;
      case ColladaPackage.POINT_TYPE__CONSTANT_ATTENUATION:
        return constantAttenuation != null;
      case ColladaPackage.POINT_TYPE__LINEAR_ATTENUATION:
        return linearAttenuation != null;
      case ColladaPackage.POINT_TYPE__QUADRATIC_ATTENUATION:
        return quadraticAttenuation != null;
    }
    return super.eIsSet(featureID);
  }

} //PointTypeImpl
