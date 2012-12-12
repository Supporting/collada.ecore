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
import org.khronos.collada.FaceType2;
import org.khronos.collada.MaskType2;
import org.khronos.collada.MaskType;
import org.khronos.collada.StencilMaskSeparateType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stencil Mask Separate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.StencilMaskSeparateTypeImpl#getFace <em>Face</em>}</li>
 *   <li>{@link org.khronos.collada.impl.StencilMaskSeparateTypeImpl#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StencilMaskSeparateTypeImpl extends EObjectImpl implements StencilMaskSeparateType {
	/**
   * The cached value of the '{@link #getFace() <em>Face</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFace()
   * @generated
   * @ordered
   */
	protected FaceType2 face;

	/**
   * The cached value of the '{@link #getMask() <em>Mask</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMask()
   * @generated
   * @ordered
   */
	protected MaskType mask;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected StencilMaskSeparateTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getStencilMaskSeparateType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FaceType2 getFace() {
    return face;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFace(FaceType2 newFace, NotificationChain msgs) {
    FaceType2 oldFace = face;
    face = newFace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__FACE, oldFace, newFace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFace(FaceType2 newFace) {
    if (newFace != face)
    {
      NotificationChain msgs = null;
      if (face != null)
        msgs = ((InternalEObject)face).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__FACE, null, msgs);
      if (newFace != null)
        msgs = ((InternalEObject)newFace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__FACE, null, msgs);
      msgs = basicSetFace(newFace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__FACE, newFace, newFace));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaskType getMask() {
    return mask;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMask(MaskType newMask, NotificationChain msgs) {
    MaskType oldMask = mask;
    mask = newMask;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__MASK, oldMask, newMask);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMask(MaskType newMask) {
    if (newMask != mask)
    {
      NotificationChain msgs = null;
      if (mask != null)
        msgs = ((InternalEObject)mask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__MASK, null, msgs);
      if (newMask != null)
        msgs = ((InternalEObject)newMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__MASK, null, msgs);
      msgs = basicSetMask(newMask, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__MASK, newMask, newMask));
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
      case ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__FACE:
        return basicSetFace(null, msgs);
      case ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__MASK:
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
      case ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__FACE:
        return getFace();
      case ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__MASK:
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
      case ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__FACE:
        setFace((FaceType2)newValue);
        return;
      case ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__MASK:
        setMask((MaskType)newValue);
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
      case ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__FACE:
        setFace((FaceType2)null);
        return;
      case ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__MASK:
        setMask((MaskType)null);
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
      case ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__FACE:
        return face != null;
      case ColladaPackage.STENCIL_MASK_SEPARATE_TYPE__MASK:
        return mask != null;
    }
    return super.eIsSet(featureID);
  }

} //StencilMaskSeparateTypeImpl
