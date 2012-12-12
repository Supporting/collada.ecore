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

import org.khronos.collada.BlendFuncSeparateType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.DestAlphaType;
import org.khronos.collada.DestRgbType;
import org.khronos.collada.SrcAlphaType;
import org.khronos.collada.SrcRgbType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blend Func Separate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.BlendFuncSeparateTypeImpl#getSrcRgb <em>Src Rgb</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BlendFuncSeparateTypeImpl#getDestRgb <em>Dest Rgb</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BlendFuncSeparateTypeImpl#getSrcAlpha <em>Src Alpha</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BlendFuncSeparateTypeImpl#getDestAlpha <em>Dest Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlendFuncSeparateTypeImpl extends EObjectImpl implements BlendFuncSeparateType {
	/**
   * The cached value of the '{@link #getSrcRgb() <em>Src Rgb</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSrcRgb()
   * @generated
   * @ordered
   */
	protected SrcRgbType srcRgb;

	/**
   * The cached value of the '{@link #getDestRgb() <em>Dest Rgb</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDestRgb()
   * @generated
   * @ordered
   */
	protected DestRgbType destRgb;

	/**
   * The cached value of the '{@link #getSrcAlpha() <em>Src Alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSrcAlpha()
   * @generated
   * @ordered
   */
	protected SrcAlphaType srcAlpha;

	/**
   * The cached value of the '{@link #getDestAlpha() <em>Dest Alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDestAlpha()
   * @generated
   * @ordered
   */
	protected DestAlphaType destAlpha;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected BlendFuncSeparateTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getBlendFuncSeparateType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SrcRgbType getSrcRgb() {
    return srcRgb;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSrcRgb(SrcRgbType newSrcRgb, NotificationChain msgs) {
    SrcRgbType oldSrcRgb = srcRgb;
    srcRgb = newSrcRgb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_RGB, oldSrcRgb, newSrcRgb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSrcRgb(SrcRgbType newSrcRgb) {
    if (newSrcRgb != srcRgb)
    {
      NotificationChain msgs = null;
      if (srcRgb != null)
        msgs = ((InternalEObject)srcRgb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_RGB, null, msgs);
      if (newSrcRgb != null)
        msgs = ((InternalEObject)newSrcRgb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_RGB, null, msgs);
      msgs = basicSetSrcRgb(newSrcRgb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_RGB, newSrcRgb, newSrcRgb));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DestRgbType getDestRgb() {
    return destRgb;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDestRgb(DestRgbType newDestRgb, NotificationChain msgs) {
    DestRgbType oldDestRgb = destRgb;
    destRgb = newDestRgb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_RGB, oldDestRgb, newDestRgb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDestRgb(DestRgbType newDestRgb) {
    if (newDestRgb != destRgb)
    {
      NotificationChain msgs = null;
      if (destRgb != null)
        msgs = ((InternalEObject)destRgb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_RGB, null, msgs);
      if (newDestRgb != null)
        msgs = ((InternalEObject)newDestRgb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_RGB, null, msgs);
      msgs = basicSetDestRgb(newDestRgb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_RGB, newDestRgb, newDestRgb));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SrcAlphaType getSrcAlpha() {
    return srcAlpha;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSrcAlpha(SrcAlphaType newSrcAlpha, NotificationChain msgs) {
    SrcAlphaType oldSrcAlpha = srcAlpha;
    srcAlpha = newSrcAlpha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_ALPHA, oldSrcAlpha, newSrcAlpha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSrcAlpha(SrcAlphaType newSrcAlpha) {
    if (newSrcAlpha != srcAlpha)
    {
      NotificationChain msgs = null;
      if (srcAlpha != null)
        msgs = ((InternalEObject)srcAlpha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_ALPHA, null, msgs);
      if (newSrcAlpha != null)
        msgs = ((InternalEObject)newSrcAlpha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_ALPHA, null, msgs);
      msgs = basicSetSrcAlpha(newSrcAlpha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_ALPHA, newSrcAlpha, newSrcAlpha));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DestAlphaType getDestAlpha() {
    return destAlpha;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDestAlpha(DestAlphaType newDestAlpha, NotificationChain msgs) {
    DestAlphaType oldDestAlpha = destAlpha;
    destAlpha = newDestAlpha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_ALPHA, oldDestAlpha, newDestAlpha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDestAlpha(DestAlphaType newDestAlpha) {
    if (newDestAlpha != destAlpha)
    {
      NotificationChain msgs = null;
      if (destAlpha != null)
        msgs = ((InternalEObject)destAlpha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_ALPHA, null, msgs);
      if (newDestAlpha != null)
        msgs = ((InternalEObject)newDestAlpha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_ALPHA, null, msgs);
      msgs = basicSetDestAlpha(newDestAlpha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_ALPHA, newDestAlpha, newDestAlpha));
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
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_RGB:
        return basicSetSrcRgb(null, msgs);
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_RGB:
        return basicSetDestRgb(null, msgs);
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_ALPHA:
        return basicSetSrcAlpha(null, msgs);
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_ALPHA:
        return basicSetDestAlpha(null, msgs);
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
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_RGB:
        return getSrcRgb();
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_RGB:
        return getDestRgb();
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_ALPHA:
        return getSrcAlpha();
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_ALPHA:
        return getDestAlpha();
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
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_RGB:
        setSrcRgb((SrcRgbType)newValue);
        return;
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_RGB:
        setDestRgb((DestRgbType)newValue);
        return;
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_ALPHA:
        setSrcAlpha((SrcAlphaType)newValue);
        return;
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_ALPHA:
        setDestAlpha((DestAlphaType)newValue);
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
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_RGB:
        setSrcRgb((SrcRgbType)null);
        return;
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_RGB:
        setDestRgb((DestRgbType)null);
        return;
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_ALPHA:
        setSrcAlpha((SrcAlphaType)null);
        return;
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_ALPHA:
        setDestAlpha((DestAlphaType)null);
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
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_RGB:
        return srcRgb != null;
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_RGB:
        return destRgb != null;
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__SRC_ALPHA:
        return srcAlpha != null;
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE__DEST_ALPHA:
        return destAlpha != null;
    }
    return super.eIsSet(featureID);
  }

} //BlendFuncSeparateTypeImpl
