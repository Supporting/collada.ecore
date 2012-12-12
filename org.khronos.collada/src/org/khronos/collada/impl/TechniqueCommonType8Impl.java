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

import org.khronos.collada.AccessorType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.TechniqueCommonType8;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technique Common Type8</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType8Impl#getAccessor <em>Accessor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechniqueCommonType8Impl extends EObjectImpl implements TechniqueCommonType8 {
	/**
   * The cached value of the '{@link #getAccessor() <em>Accessor</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAccessor()
   * @generated
   * @ordered
   */
	protected AccessorType accessor;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TechniqueCommonType8Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTechniqueCommonType8();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AccessorType getAccessor() {
    return accessor;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAccessor(AccessorType newAccessor, NotificationChain msgs) {
    AccessorType oldAccessor = accessor;
    accessor = newAccessor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE8__ACCESSOR, oldAccessor, newAccessor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAccessor(AccessorType newAccessor) {
    if (newAccessor != accessor)
    {
      NotificationChain msgs = null;
      if (accessor != null)
        msgs = ((InternalEObject)accessor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE8__ACCESSOR, null, msgs);
      if (newAccessor != null)
        msgs = ((InternalEObject)newAccessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE8__ACCESSOR, null, msgs);
      msgs = basicSetAccessor(newAccessor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE8__ACCESSOR, newAccessor, newAccessor));
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE8__ACCESSOR:
        return basicSetAccessor(null, msgs);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE8__ACCESSOR:
        return getAccessor();
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE8__ACCESSOR:
        setAccessor((AccessorType)newValue);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE8__ACCESSOR:
        setAccessor((AccessorType)null);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE8__ACCESSOR:
        return accessor != null;
    }
    return super.eIsSet(featureID);
  }

} //TechniqueCommonType8Impl
