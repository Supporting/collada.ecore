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

import org.khronos.collada.AngularType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.LinearType;
import org.khronos.collada.SpringType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spring Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.SpringType1Impl#getAngular <em>Angular</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SpringType1Impl#getLinear <em>Linear</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpringType1Impl extends EObjectImpl implements SpringType1 {
	/**
   * The cached value of the '{@link #getAngular() <em>Angular</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAngular()
   * @generated
   * @ordered
   */
	protected AngularType angular;

	/**
   * The cached value of the '{@link #getLinear() <em>Linear</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLinear()
   * @generated
   * @ordered
   */
	protected LinearType linear;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SpringType1Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getSpringType1();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AngularType getAngular() {
    return angular;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAngular(AngularType newAngular, NotificationChain msgs) {
    AngularType oldAngular = angular;
    angular = newAngular;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SPRING_TYPE1__ANGULAR, oldAngular, newAngular);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAngular(AngularType newAngular) {
    if (newAngular != angular)
    {
      NotificationChain msgs = null;
      if (angular != null)
        msgs = ((InternalEObject)angular).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPRING_TYPE1__ANGULAR, null, msgs);
      if (newAngular != null)
        msgs = ((InternalEObject)newAngular).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPRING_TYPE1__ANGULAR, null, msgs);
      msgs = basicSetAngular(newAngular, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SPRING_TYPE1__ANGULAR, newAngular, newAngular));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LinearType getLinear() {
    return linear;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLinear(LinearType newLinear, NotificationChain msgs) {
    LinearType oldLinear = linear;
    linear = newLinear;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SPRING_TYPE1__LINEAR, oldLinear, newLinear);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLinear(LinearType newLinear) {
    if (newLinear != linear)
    {
      NotificationChain msgs = null;
      if (linear != null)
        msgs = ((InternalEObject)linear).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPRING_TYPE1__LINEAR, null, msgs);
      if (newLinear != null)
        msgs = ((InternalEObject)newLinear).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPRING_TYPE1__LINEAR, null, msgs);
      msgs = basicSetLinear(newLinear, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SPRING_TYPE1__LINEAR, newLinear, newLinear));
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
      case ColladaPackage.SPRING_TYPE1__ANGULAR:
        return basicSetAngular(null, msgs);
      case ColladaPackage.SPRING_TYPE1__LINEAR:
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
      case ColladaPackage.SPRING_TYPE1__ANGULAR:
        return getAngular();
      case ColladaPackage.SPRING_TYPE1__LINEAR:
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
      case ColladaPackage.SPRING_TYPE1__ANGULAR:
        setAngular((AngularType)newValue);
        return;
      case ColladaPackage.SPRING_TYPE1__LINEAR:
        setLinear((LinearType)newValue);
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
      case ColladaPackage.SPRING_TYPE1__ANGULAR:
        setAngular((AngularType)null);
        return;
      case ColladaPackage.SPRING_TYPE1__LINEAR:
        setLinear((LinearType)null);
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
      case ColladaPackage.SPRING_TYPE1__ANGULAR:
        return angular != null;
      case ColladaPackage.SPRING_TYPE1__LINEAR:
        return linear != null;
    }
    return super.eIsSet(featureID);
  }

} //SpringType1Impl
