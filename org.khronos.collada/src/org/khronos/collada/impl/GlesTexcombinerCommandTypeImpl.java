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
import org.khronos.collada.GlesTexcombinerCommandAlphaType;
import org.khronos.collada.GlesTexcombinerCommandRGBType;
import org.khronos.collada.GlesTexcombinerCommandType;
import org.khronos.collada.GlesTextureConstantType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gles Texcombiner Command Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.GlesTexcombinerCommandTypeImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTexcombinerCommandTypeImpl#getRGB <em>RGB</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTexcombinerCommandTypeImpl#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlesTexcombinerCommandTypeImpl extends EObjectImpl implements GlesTexcombinerCommandType {
	/**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
	protected GlesTextureConstantType constant;

	/**
   * The cached value of the '{@link #getRGB() <em>RGB</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRGB()
   * @generated
   * @ordered
   */
	protected GlesTexcombinerCommandRGBType rGB;

	/**
   * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAlpha()
   * @generated
   * @ordered
   */
	protected GlesTexcombinerCommandAlphaType alpha;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected GlesTexcombinerCommandTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getGlesTexcombinerCommandType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTextureConstantType getConstant() {
    return constant;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetConstant(GlesTextureConstantType newConstant, NotificationChain msgs) {
    GlesTextureConstantType oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__CONSTANT, oldConstant, newConstant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setConstant(GlesTextureConstantType newConstant) {
    if (newConstant != constant)
    {
      NotificationChain msgs = null;
      if (constant != null)
        msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__CONSTANT, null, msgs);
      if (newConstant != null)
        msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__CONSTANT, null, msgs);
      msgs = basicSetConstant(newConstant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__CONSTANT, newConstant, newConstant));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerCommandRGBType getRGB() {
    return rGB;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRGB(GlesTexcombinerCommandRGBType newRGB, NotificationChain msgs) {
    GlesTexcombinerCommandRGBType oldRGB = rGB;
    rGB = newRGB;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__RGB, oldRGB, newRGB);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRGB(GlesTexcombinerCommandRGBType newRGB) {
    if (newRGB != rGB)
    {
      NotificationChain msgs = null;
      if (rGB != null)
        msgs = ((InternalEObject)rGB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__RGB, null, msgs);
      if (newRGB != null)
        msgs = ((InternalEObject)newRGB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__RGB, null, msgs);
      msgs = basicSetRGB(newRGB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__RGB, newRGB, newRGB));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerCommandAlphaType getAlpha() {
    return alpha;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAlpha(GlesTexcombinerCommandAlphaType newAlpha, NotificationChain msgs) {
    GlesTexcombinerCommandAlphaType oldAlpha = alpha;
    alpha = newAlpha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__ALPHA, oldAlpha, newAlpha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAlpha(GlesTexcombinerCommandAlphaType newAlpha) {
    if (newAlpha != alpha)
    {
      NotificationChain msgs = null;
      if (alpha != null)
        msgs = ((InternalEObject)alpha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__ALPHA, null, msgs);
      if (newAlpha != null)
        msgs = ((InternalEObject)newAlpha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__ALPHA, null, msgs);
      msgs = basicSetAlpha(newAlpha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__ALPHA, newAlpha, newAlpha));
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
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__CONSTANT:
        return basicSetConstant(null, msgs);
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__RGB:
        return basicSetRGB(null, msgs);
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__ALPHA:
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
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__CONSTANT:
        return getConstant();
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__RGB:
        return getRGB();
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__ALPHA:
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
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__CONSTANT:
        setConstant((GlesTextureConstantType)newValue);
        return;
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__RGB:
        setRGB((GlesTexcombinerCommandRGBType)newValue);
        return;
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__ALPHA:
        setAlpha((GlesTexcombinerCommandAlphaType)newValue);
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
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__CONSTANT:
        setConstant((GlesTextureConstantType)null);
        return;
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__RGB:
        setRGB((GlesTexcombinerCommandRGBType)null);
        return;
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__ALPHA:
        setAlpha((GlesTexcombinerCommandAlphaType)null);
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
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__CONSTANT:
        return constant != null;
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__RGB:
        return rGB != null;
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE__ALPHA:
        return alpha != null;
    }
    return super.eIsSet(featureID);
  }

} //GlesTexcombinerCommandTypeImpl
