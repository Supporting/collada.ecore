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
import org.khronos.collada.FuncType;
import org.khronos.collada.FuncType2;
import org.khronos.collada.MaskType3;
import org.khronos.collada.RefType2;
import org.khronos.collada.StencilFuncType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stencil Func Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.StencilFuncType1Impl#getFunc <em>Func</em>}</li>
 *   <li>{@link org.khronos.collada.impl.StencilFuncType1Impl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.khronos.collada.impl.StencilFuncType1Impl#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StencilFuncType1Impl extends EObjectImpl implements StencilFuncType1 {
	/**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
	protected FuncType2 func;

	/**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
	protected RefType2 ref;

	/**
   * The cached value of the '{@link #getMask() <em>Mask</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMask()
   * @generated
   * @ordered
   */
	protected MaskType3 mask;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected StencilFuncType1Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getStencilFuncType1();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FuncType2 getFunc() {
    return func;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFunc(FuncType2 newFunc, NotificationChain msgs) {
    FuncType2 oldFunc = func;
    func = newFunc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_FUNC_TYPE1__FUNC, oldFunc, newFunc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFunc(FuncType2 newFunc) {
    if (newFunc != func)
    {
      NotificationChain msgs = null;
      if (func != null)
        msgs = ((InternalEObject)func).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_FUNC_TYPE1__FUNC, null, msgs);
      if (newFunc != null)
        msgs = ((InternalEObject)newFunc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_FUNC_TYPE1__FUNC, null, msgs);
      msgs = basicSetFunc(newFunc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_FUNC_TYPE1__FUNC, newFunc, newFunc));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RefType2 getRef() {
    return ref;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRef(RefType2 newRef, NotificationChain msgs) {
    RefType2 oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_FUNC_TYPE1__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRef(RefType2 newRef) {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_FUNC_TYPE1__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_FUNC_TYPE1__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_FUNC_TYPE1__REF, newRef, newRef));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaskType3 getMask() {
    return mask;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMask(MaskType3 newMask, NotificationChain msgs) {
    MaskType3 oldMask = mask;
    mask = newMask;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_FUNC_TYPE1__MASK, oldMask, newMask);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMask(MaskType3 newMask) {
    if (newMask != mask)
    {
      NotificationChain msgs = null;
      if (mask != null)
        msgs = ((InternalEObject)mask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_FUNC_TYPE1__MASK, null, msgs);
      if (newMask != null)
        msgs = ((InternalEObject)newMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_FUNC_TYPE1__MASK, null, msgs);
      msgs = basicSetMask(newMask, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_FUNC_TYPE1__MASK, newMask, newMask));
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
      case ColladaPackage.STENCIL_FUNC_TYPE1__FUNC:
        return basicSetFunc(null, msgs);
      case ColladaPackage.STENCIL_FUNC_TYPE1__REF:
        return basicSetRef(null, msgs);
      case ColladaPackage.STENCIL_FUNC_TYPE1__MASK:
        return basicSetMask(null, msgs);
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
      case ColladaPackage.STENCIL_FUNC_TYPE1__FUNC:
        return getFunc();
      case ColladaPackage.STENCIL_FUNC_TYPE1__REF:
        return getRef();
      case ColladaPackage.STENCIL_FUNC_TYPE1__MASK:
        return getMask();
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
      case ColladaPackage.STENCIL_FUNC_TYPE1__FUNC:
        setFunc((FuncType2)newValue);
        return;
      case ColladaPackage.STENCIL_FUNC_TYPE1__REF:
        setRef((RefType2)newValue);
        return;
      case ColladaPackage.STENCIL_FUNC_TYPE1__MASK:
        setMask((MaskType3)newValue);
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
      case ColladaPackage.STENCIL_FUNC_TYPE1__FUNC:
        setFunc((FuncType2)null);
        return;
      case ColladaPackage.STENCIL_FUNC_TYPE1__REF:
        setRef((RefType2)null);
        return;
      case ColladaPackage.STENCIL_FUNC_TYPE1__MASK:
        setMask((MaskType3)null);
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
      case ColladaPackage.STENCIL_FUNC_TYPE1__FUNC:
        return func != null;
      case ColladaPackage.STENCIL_FUNC_TYPE1__REF:
        return ref != null;
      case ColladaPackage.STENCIL_FUNC_TYPE1__MASK:
        return mask != null;
    }
    return super.eIsSet(featureID);
  }

} //StencilFuncType1Impl
