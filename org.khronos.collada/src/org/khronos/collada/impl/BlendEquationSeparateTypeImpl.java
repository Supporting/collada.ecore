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

import org.khronos.collada.AlphaType;
import org.khronos.collada.BlendEquationSeparateType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.RgbType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blend Equation Separate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.BlendEquationSeparateTypeImpl#getRgb <em>Rgb</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BlendEquationSeparateTypeImpl#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlendEquationSeparateTypeImpl extends EObjectImpl implements BlendEquationSeparateType {
	/**
   * The cached value of the '{@link #getRgb() <em>Rgb</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRgb()
   * @generated
   * @ordered
   */
	protected RgbType rgb;

	/**
   * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAlpha()
   * @generated
   * @ordered
   */
	protected AlphaType alpha;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected BlendEquationSeparateTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getBlendEquationSeparateType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RgbType getRgb() {
    return rgb;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRgb(RgbType newRgb, NotificationChain msgs) {
    RgbType oldRgb = rgb;
    rgb = newRgb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__RGB, oldRgb, newRgb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRgb(RgbType newRgb) {
    if (newRgb != rgb)
    {
      NotificationChain msgs = null;
      if (rgb != null)
        msgs = ((InternalEObject)rgb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__RGB, null, msgs);
      if (newRgb != null)
        msgs = ((InternalEObject)newRgb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__RGB, null, msgs);
      msgs = basicSetRgb(newRgb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__RGB, newRgb, newRgb));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AlphaType getAlpha() {
    return alpha;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAlpha(AlphaType newAlpha, NotificationChain msgs) {
    AlphaType oldAlpha = alpha;
    alpha = newAlpha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__ALPHA, oldAlpha, newAlpha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAlpha(AlphaType newAlpha) {
    if (newAlpha != alpha)
    {
      NotificationChain msgs = null;
      if (alpha != null)
        msgs = ((InternalEObject)alpha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__ALPHA, null, msgs);
      if (newAlpha != null)
        msgs = ((InternalEObject)newAlpha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__ALPHA, null, msgs);
      msgs = basicSetAlpha(newAlpha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__ALPHA, newAlpha, newAlpha));
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
      case ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__RGB:
        return basicSetRgb(null, msgs);
      case ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__ALPHA:
        return basicSetAlpha(null, msgs);
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
      case ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__RGB:
        return getRgb();
      case ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__ALPHA:
        return getAlpha();
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
      case ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__RGB:
        setRgb((RgbType)newValue);
        return;
      case ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__ALPHA:
        setAlpha((AlphaType)newValue);
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
      case ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__RGB:
        setRgb((RgbType)null);
        return;
      case ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__ALPHA:
        setAlpha((AlphaType)null);
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
      case ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__RGB:
        return rgb != null;
      case ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE__ALPHA:
        return alpha != null;
    }
    return super.eIsSet(featureID);
  }

} //BlendEquationSeparateTypeImpl
