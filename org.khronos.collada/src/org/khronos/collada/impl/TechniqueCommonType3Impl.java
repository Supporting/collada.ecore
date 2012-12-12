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

import org.khronos.collada.AmbientType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.EnabledType;
import org.khronos.collada.InterpenetrateType;
import org.khronos.collada.LimitsType;
import org.khronos.collada.SpringType1;
import org.khronos.collada.DirectionalType;
import org.khronos.collada.PointType;
import org.khronos.collada.SpotType;
import org.khronos.collada.TechniqueCommonType3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technique Common Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType3Impl#getAmbient <em>Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType3Impl#getDirectional <em>Directional</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType3Impl#getPoint <em>Point</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType3Impl#getSpot <em>Spot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechniqueCommonType3Impl extends EObjectImpl implements TechniqueCommonType3 {
	/**
   * The cached value of the '{@link #getAmbient() <em>Ambient</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAmbient()
   * @generated
   * @ordered
   */
	protected AmbientType ambient;

	/**
   * The cached value of the '{@link #getDirectional() <em>Directional</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDirectional()
   * @generated
   * @ordered
   */
	protected DirectionalType directional;

	/**
   * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPoint()
   * @generated
   * @ordered
   */
	protected PointType point;

	/**
   * The cached value of the '{@link #getSpot() <em>Spot</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSpot()
   * @generated
   * @ordered
   */
	protected SpotType spot;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TechniqueCommonType3Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTechniqueCommonType3();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AmbientType getAmbient() {
    return ambient;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAmbient(AmbientType newAmbient, NotificationChain msgs) {
    AmbientType oldAmbient = ambient;
    ambient = newAmbient;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE3__AMBIENT, oldAmbient, newAmbient);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAmbient(AmbientType newAmbient) {
    if (newAmbient != ambient)
    {
      NotificationChain msgs = null;
      if (ambient != null)
        msgs = ((InternalEObject)ambient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE3__AMBIENT, null, msgs);
      if (newAmbient != null)
        msgs = ((InternalEObject)newAmbient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE3__AMBIENT, null, msgs);
      msgs = basicSetAmbient(newAmbient, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE3__AMBIENT, newAmbient, newAmbient));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DirectionalType getDirectional() {
    return directional;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDirectional(DirectionalType newDirectional, NotificationChain msgs) {
    DirectionalType oldDirectional = directional;
    directional = newDirectional;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE3__DIRECTIONAL, oldDirectional, newDirectional);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDirectional(DirectionalType newDirectional) {
    if (newDirectional != directional)
    {
      NotificationChain msgs = null;
      if (directional != null)
        msgs = ((InternalEObject)directional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE3__DIRECTIONAL, null, msgs);
      if (newDirectional != null)
        msgs = ((InternalEObject)newDirectional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE3__DIRECTIONAL, null, msgs);
      msgs = basicSetDirectional(newDirectional, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE3__DIRECTIONAL, newDirectional, newDirectional));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PointType getPoint() {
    return point;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPoint(PointType newPoint, NotificationChain msgs) {
    PointType oldPoint = point;
    point = newPoint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE3__POINT, oldPoint, newPoint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPoint(PointType newPoint) {
    if (newPoint != point)
    {
      NotificationChain msgs = null;
      if (point != null)
        msgs = ((InternalEObject)point).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE3__POINT, null, msgs);
      if (newPoint != null)
        msgs = ((InternalEObject)newPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE3__POINT, null, msgs);
      msgs = basicSetPoint(newPoint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE3__POINT, newPoint, newPoint));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SpotType getSpot() {
    return spot;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSpot(SpotType newSpot, NotificationChain msgs) {
    SpotType oldSpot = spot;
    spot = newSpot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE3__SPOT, oldSpot, newSpot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSpot(SpotType newSpot) {
    if (newSpot != spot)
    {
      NotificationChain msgs = null;
      if (spot != null)
        msgs = ((InternalEObject)spot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE3__SPOT, null, msgs);
      if (newSpot != null)
        msgs = ((InternalEObject)newSpot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE3__SPOT, null, msgs);
      msgs = basicSetSpot(newSpot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE3__SPOT, newSpot, newSpot));
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__AMBIENT:
        return basicSetAmbient(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__DIRECTIONAL:
        return basicSetDirectional(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__POINT:
        return basicSetPoint(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__SPOT:
        return basicSetSpot(null, msgs);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__AMBIENT:
        return getAmbient();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__DIRECTIONAL:
        return getDirectional();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__POINT:
        return getPoint();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__SPOT:
        return getSpot();
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__AMBIENT:
        setAmbient((AmbientType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__DIRECTIONAL:
        setDirectional((DirectionalType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__POINT:
        setPoint((PointType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__SPOT:
        setSpot((SpotType)newValue);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__AMBIENT:
        setAmbient((AmbientType)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__DIRECTIONAL:
        setDirectional((DirectionalType)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__POINT:
        setPoint((PointType)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__SPOT:
        setSpot((SpotType)null);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__AMBIENT:
        return ambient != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__DIRECTIONAL:
        return directional != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__POINT:
        return point != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3__SPOT:
        return spot != null;
    }
    return super.eIsSet(featureID);
  }

} //TechniqueCommonType3Impl
