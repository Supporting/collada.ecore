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
import org.khronos.collada.FaceType;
import org.khronos.collada.FaceType1;
import org.khronos.collada.FailType1;
import org.khronos.collada.StencilOpSeparateType;
import org.khronos.collada.ZfailType;
import org.khronos.collada.ZpassType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stencil Op Separate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.StencilOpSeparateTypeImpl#getFace <em>Face</em>}</li>
 *   <li>{@link org.khronos.collada.impl.StencilOpSeparateTypeImpl#getFail <em>Fail</em>}</li>
 *   <li>{@link org.khronos.collada.impl.StencilOpSeparateTypeImpl#getZfail <em>Zfail</em>}</li>
 *   <li>{@link org.khronos.collada.impl.StencilOpSeparateTypeImpl#getZpass <em>Zpass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StencilOpSeparateTypeImpl extends EObjectImpl implements StencilOpSeparateType {
	/**
   * The cached value of the '{@link #getFace() <em>Face</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFace()
   * @generated
   * @ordered
   */
	protected FaceType1 face;

	/**
   * The cached value of the '{@link #getFail() <em>Fail</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFail()
   * @generated
   * @ordered
   */
	protected FailType1 fail;

	/**
   * The cached value of the '{@link #getZfail() <em>Zfail</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getZfail()
   * @generated
   * @ordered
   */
	protected ZfailType zfail;

	/**
   * The cached value of the '{@link #getZpass() <em>Zpass</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getZpass()
   * @generated
   * @ordered
   */
	protected ZpassType1 zpass;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected StencilOpSeparateTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getStencilOpSeparateType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FaceType1 getFace() {
    return face;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFace(FaceType1 newFace, NotificationChain msgs) {
    FaceType1 oldFace = face;
    face = newFace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FACE, oldFace, newFace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFace(FaceType1 newFace) {
    if (newFace != face)
    {
      NotificationChain msgs = null;
      if (face != null)
        msgs = ((InternalEObject)face).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FACE, null, msgs);
      if (newFace != null)
        msgs = ((InternalEObject)newFace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FACE, null, msgs);
      msgs = basicSetFace(newFace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FACE, newFace, newFace));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FailType1 getFail() {
    return fail;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFail(FailType1 newFail, NotificationChain msgs) {
    FailType1 oldFail = fail;
    fail = newFail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FAIL, oldFail, newFail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFail(FailType1 newFail) {
    if (newFail != fail)
    {
      NotificationChain msgs = null;
      if (fail != null)
        msgs = ((InternalEObject)fail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FAIL, null, msgs);
      if (newFail != null)
        msgs = ((InternalEObject)newFail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FAIL, null, msgs);
      msgs = basicSetFail(newFail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FAIL, newFail, newFail));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ZfailType getZfail() {
    return zfail;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetZfail(ZfailType newZfail, NotificationChain msgs) {
    ZfailType oldZfail = zfail;
    zfail = newZfail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZFAIL, oldZfail, newZfail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setZfail(ZfailType newZfail) {
    if (newZfail != zfail)
    {
      NotificationChain msgs = null;
      if (zfail != null)
        msgs = ((InternalEObject)zfail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZFAIL, null, msgs);
      if (newZfail != null)
        msgs = ((InternalEObject)newZfail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZFAIL, null, msgs);
      msgs = basicSetZfail(newZfail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZFAIL, newZfail, newZfail));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ZpassType1 getZpass() {
    return zpass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetZpass(ZpassType1 newZpass, NotificationChain msgs) {
    ZpassType1 oldZpass = zpass;
    zpass = newZpass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZPASS, oldZpass, newZpass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setZpass(ZpassType1 newZpass) {
    if (newZpass != zpass)
    {
      NotificationChain msgs = null;
      if (zpass != null)
        msgs = ((InternalEObject)zpass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZPASS, null, msgs);
      if (newZpass != null)
        msgs = ((InternalEObject)newZpass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZPASS, null, msgs);
      msgs = basicSetZpass(newZpass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZPASS, newZpass, newZpass));
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
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FACE:
        return basicSetFace(null, msgs);
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FAIL:
        return basicSetFail(null, msgs);
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZFAIL:
        return basicSetZfail(null, msgs);
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZPASS:
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
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FACE:
        return getFace();
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FAIL:
        return getFail();
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZFAIL:
        return getZfail();
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZPASS:
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
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FACE:
        setFace((FaceType1)newValue);
        return;
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FAIL:
        setFail((FailType1)newValue);
        return;
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZFAIL:
        setZfail((ZfailType)newValue);
        return;
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZPASS:
        setZpass((ZpassType1)newValue);
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
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FACE:
        setFace((FaceType1)null);
        return;
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FAIL:
        setFail((FailType1)null);
        return;
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZFAIL:
        setZfail((ZfailType)null);
        return;
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZPASS:
        setZpass((ZpassType1)null);
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
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FACE:
        return face != null;
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__FAIL:
        return fail != null;
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZFAIL:
        return zfail != null;
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE__ZPASS:
        return zpass != null;
    }
    return super.eIsSet(featureID);
  }

} //StencilOpSeparateTypeImpl
