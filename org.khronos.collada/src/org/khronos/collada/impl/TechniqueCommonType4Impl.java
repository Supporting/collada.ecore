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
import org.khronos.collada.DynamicType1;
import org.khronos.collada.InstanceWithExtra;
import org.khronos.collada.MassFrameType1;
import org.khronos.collada.PhysicsMaterialType;
import org.khronos.collada.ShapeType1;
import org.khronos.collada.TargetableFloat;
import org.khronos.collada.TargetableFloat3;
import org.khronos.collada.TechniqueCommonType4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technique Common Type4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType4Impl#getDynamicFriction <em>Dynamic Friction</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType4Impl#getRestitution <em>Restitution</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType4Impl#getStaticFriction <em>Static Friction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechniqueCommonType4Impl extends EObjectImpl implements TechniqueCommonType4 {
	/**
   * The cached value of the '{@link #getDynamicFriction() <em>Dynamic Friction</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDynamicFriction()
   * @generated
   * @ordered
   */
	protected TargetableFloat dynamicFriction;

	/**
   * The cached value of the '{@link #getRestitution() <em>Restitution</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRestitution()
   * @generated
   * @ordered
   */
	protected TargetableFloat restitution;

	/**
   * The cached value of the '{@link #getStaticFriction() <em>Static Friction</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStaticFriction()
   * @generated
   * @ordered
   */
	protected TargetableFloat staticFriction;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TechniqueCommonType4Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTechniqueCommonType4();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getDynamicFriction() {
    return dynamicFriction;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDynamicFriction(TargetableFloat newDynamicFriction, NotificationChain msgs) {
    TargetableFloat oldDynamicFriction = dynamicFriction;
    dynamicFriction = newDynamicFriction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE4__DYNAMIC_FRICTION, oldDynamicFriction, newDynamicFriction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDynamicFriction(TargetableFloat newDynamicFriction) {
    if (newDynamicFriction != dynamicFriction)
    {
      NotificationChain msgs = null;
      if (dynamicFriction != null)
        msgs = ((InternalEObject)dynamicFriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE4__DYNAMIC_FRICTION, null, msgs);
      if (newDynamicFriction != null)
        msgs = ((InternalEObject)newDynamicFriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE4__DYNAMIC_FRICTION, null, msgs);
      msgs = basicSetDynamicFriction(newDynamicFriction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE4__DYNAMIC_FRICTION, newDynamicFriction, newDynamicFriction));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getRestitution() {
    return restitution;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRestitution(TargetableFloat newRestitution, NotificationChain msgs) {
    TargetableFloat oldRestitution = restitution;
    restitution = newRestitution;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE4__RESTITUTION, oldRestitution, newRestitution);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRestitution(TargetableFloat newRestitution) {
    if (newRestitution != restitution)
    {
      NotificationChain msgs = null;
      if (restitution != null)
        msgs = ((InternalEObject)restitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE4__RESTITUTION, null, msgs);
      if (newRestitution != null)
        msgs = ((InternalEObject)newRestitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE4__RESTITUTION, null, msgs);
      msgs = basicSetRestitution(newRestitution, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE4__RESTITUTION, newRestitution, newRestitution));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getStaticFriction() {
    return staticFriction;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetStaticFriction(TargetableFloat newStaticFriction, NotificationChain msgs) {
    TargetableFloat oldStaticFriction = staticFriction;
    staticFriction = newStaticFriction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE4__STATIC_FRICTION, oldStaticFriction, newStaticFriction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setStaticFriction(TargetableFloat newStaticFriction) {
    if (newStaticFriction != staticFriction)
    {
      NotificationChain msgs = null;
      if (staticFriction != null)
        msgs = ((InternalEObject)staticFriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE4__STATIC_FRICTION, null, msgs);
      if (newStaticFriction != null)
        msgs = ((InternalEObject)newStaticFriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE4__STATIC_FRICTION, null, msgs);
      msgs = basicSetStaticFriction(newStaticFriction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE4__STATIC_FRICTION, newStaticFriction, newStaticFriction));
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4__DYNAMIC_FRICTION:
        return basicSetDynamicFriction(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4__RESTITUTION:
        return basicSetRestitution(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4__STATIC_FRICTION:
        return basicSetStaticFriction(null, msgs);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4__DYNAMIC_FRICTION:
        return getDynamicFriction();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4__RESTITUTION:
        return getRestitution();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4__STATIC_FRICTION:
        return getStaticFriction();
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4__DYNAMIC_FRICTION:
        setDynamicFriction((TargetableFloat)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4__RESTITUTION:
        setRestitution((TargetableFloat)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4__STATIC_FRICTION:
        setStaticFriction((TargetableFloat)newValue);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4__DYNAMIC_FRICTION:
        setDynamicFriction((TargetableFloat)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4__RESTITUTION:
        setRestitution((TargetableFloat)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4__STATIC_FRICTION:
        setStaticFriction((TargetableFloat)null);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4__DYNAMIC_FRICTION:
        return dynamicFriction != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4__RESTITUTION:
        return restitution != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4__STATIC_FRICTION:
        return staticFriction != null;
    }
    return super.eIsSet(featureID);
  }

} //TechniqueCommonType4Impl
