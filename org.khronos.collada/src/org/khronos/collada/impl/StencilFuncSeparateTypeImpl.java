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

import org.khronos.collada.BackType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.FrontType;
import org.khronos.collada.MaskType1;
import org.khronos.collada.RefType1;
import org.khronos.collada.MaskType2;
import org.khronos.collada.RefType;
import org.khronos.collada.StencilFuncSeparateType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stencil Func Separate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.StencilFuncSeparateTypeImpl#getFront <em>Front</em>}</li>
 *   <li>{@link org.khronos.collada.impl.StencilFuncSeparateTypeImpl#getBack <em>Back</em>}</li>
 *   <li>{@link org.khronos.collada.impl.StencilFuncSeparateTypeImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.khronos.collada.impl.StencilFuncSeparateTypeImpl#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StencilFuncSeparateTypeImpl extends EObjectImpl implements StencilFuncSeparateType {
	/**
   * The cached value of the '{@link #getFront() <em>Front</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFront()
   * @generated
   * @ordered
   */
	protected FrontType front;

	/**
   * The cached value of the '{@link #getBack() <em>Back</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBack()
   * @generated
   * @ordered
   */
	protected BackType back;

	/**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
	protected RefType ref;

	/**
   * The cached value of the '{@link #getMask() <em>Mask</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMask()
   * @generated
   * @ordered
   */
	protected MaskType2 mask;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected StencilFuncSeparateTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getStencilFuncSeparateType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FrontType getFront() {
    return front;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFront(FrontType newFront, NotificationChain msgs) {
    FrontType oldFront = front;
    front = newFront;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__FRONT, oldFront, newFront);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFront(FrontType newFront) {
    if (newFront != front)
    {
      NotificationChain msgs = null;
      if (front != null)
        msgs = ((InternalEObject)front).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__FRONT, null, msgs);
      if (newFront != null)
        msgs = ((InternalEObject)newFront).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__FRONT, null, msgs);
      msgs = basicSetFront(newFront, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__FRONT, newFront, newFront));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BackType getBack() {
    return back;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetBack(BackType newBack, NotificationChain msgs) {
    BackType oldBack = back;
    back = newBack;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__BACK, oldBack, newBack);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBack(BackType newBack) {
    if (newBack != back)
    {
      NotificationChain msgs = null;
      if (back != null)
        msgs = ((InternalEObject)back).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__BACK, null, msgs);
      if (newBack != null)
        msgs = ((InternalEObject)newBack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__BACK, null, msgs);
      msgs = basicSetBack(newBack, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__BACK, newBack, newBack));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RefType getRef() {
    return ref;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRef(RefType newRef, NotificationChain msgs) {
    RefType oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRef(RefType newRef) {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__REF, newRef, newRef));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaskType2 getMask() {
    return mask;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMask(MaskType2 newMask, NotificationChain msgs) {
    MaskType2 oldMask = mask;
    mask = newMask;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__MASK, oldMask, newMask);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMask(MaskType2 newMask) {
    if (newMask != mask)
    {
      NotificationChain msgs = null;
      if (mask != null)
        msgs = ((InternalEObject)mask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__MASK, null, msgs);
      if (newMask != null)
        msgs = ((InternalEObject)newMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__MASK, null, msgs);
      msgs = basicSetMask(newMask, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__MASK, newMask, newMask));
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
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__FRONT:
        return basicSetFront(null, msgs);
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__BACK:
        return basicSetBack(null, msgs);
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__REF:
        return basicSetRef(null, msgs);
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__MASK:
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
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__FRONT:
        return getFront();
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__BACK:
        return getBack();
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__REF:
        return getRef();
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__MASK:
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
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__FRONT:
        setFront((FrontType)newValue);
        return;
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__BACK:
        setBack((BackType)newValue);
        return;
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__REF:
        setRef((RefType)newValue);
        return;
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__MASK:
        setMask((MaskType2)newValue);
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
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__FRONT:
        setFront((FrontType)null);
        return;
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__BACK:
        setBack((BackType)null);
        return;
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__REF:
        setRef((RefType)null);
        return;
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__MASK:
        setMask((MaskType2)null);
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
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__FRONT:
        return front != null;
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__BACK:
        return back != null;
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__REF:
        return ref != null;
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE__MASK:
        return mask != null;
    }
    return super.eIsSet(featureID);
  }

} //StencilFuncSeparateTypeImpl
