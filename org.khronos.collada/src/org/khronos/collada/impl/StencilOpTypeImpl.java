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
import org.khronos.collada.FailType;
import org.khronos.collada.StencilOpType;
import org.khronos.collada.ZfailType1;
import org.khronos.collada.ZpassType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stencil Op Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.StencilOpTypeImpl#getFail <em>Fail</em>}</li>
 *   <li>{@link org.khronos.collada.impl.StencilOpTypeImpl#getZfail <em>Zfail</em>}</li>
 *   <li>{@link org.khronos.collada.impl.StencilOpTypeImpl#getZpass <em>Zpass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StencilOpTypeImpl extends EObjectImpl implements StencilOpType {
	/**
   * The cached value of the '{@link #getFail() <em>Fail</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFail()
   * @generated
   * @ordered
   */
	protected FailType fail;

	/**
   * The cached value of the '{@link #getZfail() <em>Zfail</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getZfail()
   * @generated
   * @ordered
   */
	protected ZfailType1 zfail;

	/**
   * The cached value of the '{@link #getZpass() <em>Zpass</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getZpass()
   * @generated
   * @ordered
   */
	protected ZpassType zpass;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected StencilOpTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getStencilOpType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FailType getFail() {
    return fail;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFail(FailType newFail, NotificationChain msgs) {
    FailType oldFail = fail;
    fail = newFail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_OP_TYPE__FAIL, oldFail, newFail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFail(FailType newFail) {
    if (newFail != fail)
    {
      NotificationChain msgs = null;
      if (fail != null)
        msgs = ((InternalEObject)fail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_OP_TYPE__FAIL, null, msgs);
      if (newFail != null)
        msgs = ((InternalEObject)newFail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_OP_TYPE__FAIL, null, msgs);
      msgs = basicSetFail(newFail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_OP_TYPE__FAIL, newFail, newFail));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ZfailType1 getZfail() {
    return zfail;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetZfail(ZfailType1 newZfail, NotificationChain msgs) {
    ZfailType1 oldZfail = zfail;
    zfail = newZfail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_OP_TYPE__ZFAIL, oldZfail, newZfail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setZfail(ZfailType1 newZfail) {
    if (newZfail != zfail)
    {
      NotificationChain msgs = null;
      if (zfail != null)
        msgs = ((InternalEObject)zfail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_OP_TYPE__ZFAIL, null, msgs);
      if (newZfail != null)
        msgs = ((InternalEObject)newZfail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_OP_TYPE__ZFAIL, null, msgs);
      msgs = basicSetZfail(newZfail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_OP_TYPE__ZFAIL, newZfail, newZfail));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ZpassType getZpass() {
    return zpass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetZpass(ZpassType newZpass, NotificationChain msgs) {
    ZpassType oldZpass = zpass;
    zpass = newZpass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_OP_TYPE__ZPASS, oldZpass, newZpass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setZpass(ZpassType newZpass) {
    if (newZpass != zpass)
    {
      NotificationChain msgs = null;
      if (zpass != null)
        msgs = ((InternalEObject)zpass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_OP_TYPE__ZPASS, null, msgs);
      if (newZpass != null)
        msgs = ((InternalEObject)newZpass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_OP_TYPE__ZPASS, null, msgs);
      msgs = basicSetZpass(newZpass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_OP_TYPE__ZPASS, newZpass, newZpass));
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
      case ColladaPackage.STENCIL_OP_TYPE__FAIL:
        return basicSetFail(null, msgs);
      case ColladaPackage.STENCIL_OP_TYPE__ZFAIL:
        return basicSetZfail(null, msgs);
      case ColladaPackage.STENCIL_OP_TYPE__ZPASS:
        return basicSetZpass(null, msgs);
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
      case ColladaPackage.STENCIL_OP_TYPE__FAIL:
        return getFail();
      case ColladaPackage.STENCIL_OP_TYPE__ZFAIL:
        return getZfail();
      case ColladaPackage.STENCIL_OP_TYPE__ZPASS:
        return getZpass();
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
      case ColladaPackage.STENCIL_OP_TYPE__FAIL:
        setFail((FailType)newValue);
        return;
      case ColladaPackage.STENCIL_OP_TYPE__ZFAIL:
        setZfail((ZfailType1)newValue);
        return;
      case ColladaPackage.STENCIL_OP_TYPE__ZPASS:
        setZpass((ZpassType)newValue);
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
      case ColladaPackage.STENCIL_OP_TYPE__FAIL:
        setFail((FailType)null);
        return;
      case ColladaPackage.STENCIL_OP_TYPE__ZFAIL:
        setZfail((ZfailType1)null);
        return;
      case ColladaPackage.STENCIL_OP_TYPE__ZPASS:
        setZpass((ZpassType)null);
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
      case ColladaPackage.STENCIL_OP_TYPE__FAIL:
        return fail != null;
      case ColladaPackage.STENCIL_OP_TYPE__ZFAIL:
        return zfail != null;
      case ColladaPackage.STENCIL_OP_TYPE__ZPASS:
        return zpass != null;
    }
    return super.eIsSet(featureID);
  }

} //StencilOpTypeImpl
