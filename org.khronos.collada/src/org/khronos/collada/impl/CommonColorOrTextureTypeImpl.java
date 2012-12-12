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
import org.khronos.collada.ColorType;
import org.khronos.collada.CommonColorOrTextureType;
import org.khronos.collada.ParamType3;
import org.khronos.collada.ParamType;
import org.khronos.collada.TextureType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Color Or Texture Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.CommonColorOrTextureTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CommonColorOrTextureTypeImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CommonColorOrTextureTypeImpl#getTexture <em>Texture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommonColorOrTextureTypeImpl extends EObjectImpl implements CommonColorOrTextureType {
	/**
   * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
	protected ColorType color;

	/**
   * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
	protected ParamType param;

	/**
   * The cached value of the '{@link #getTexture() <em>Texture</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTexture()
   * @generated
   * @ordered
   */
	protected TextureType texture;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CommonColorOrTextureTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getCommonColorOrTextureType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColorType getColor() {
    return color;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetColor(ColorType newColor, NotificationChain msgs) {
    ColorType oldColor = color;
    color = newColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__COLOR, oldColor, newColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setColor(ColorType newColor) {
    if (newColor != color)
    {
      NotificationChain msgs = null;
      if (color != null)
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__COLOR, newColor, newColor));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ParamType getParam() {
    return param;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetParam(ParamType newParam, NotificationChain msgs) {
    ParamType oldParam = param;
    param = newParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__PARAM, oldParam, newParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setParam(ParamType newParam) {
    if (newParam != param)
    {
      NotificationChain msgs = null;
      if (param != null)
        msgs = ((InternalEObject)param).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__PARAM, null, msgs);
      if (newParam != null)
        msgs = ((InternalEObject)newParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__PARAM, null, msgs);
      msgs = basicSetParam(newParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__PARAM, newParam, newParam));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TextureType getTexture() {
    return texture;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTexture(TextureType newTexture, NotificationChain msgs) {
    TextureType oldTexture = texture;
    texture = newTexture;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__TEXTURE, oldTexture, newTexture);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTexture(TextureType newTexture) {
    if (newTexture != texture)
    {
      NotificationChain msgs = null;
      if (texture != null)
        msgs = ((InternalEObject)texture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__TEXTURE, null, msgs);
      if (newTexture != null)
        msgs = ((InternalEObject)newTexture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__TEXTURE, null, msgs);
      msgs = basicSetTexture(newTexture, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__TEXTURE, newTexture, newTexture));
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
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__COLOR:
        return basicSetColor(null, msgs);
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__PARAM:
        return basicSetParam(null, msgs);
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__TEXTURE:
        return basicSetTexture(null, msgs);
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
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__COLOR:
        return getColor();
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__PARAM:
        return getParam();
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__TEXTURE:
        return getTexture();
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
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__COLOR:
        setColor((ColorType)newValue);
        return;
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__PARAM:
        setParam((ParamType)newValue);
        return;
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__TEXTURE:
        setTexture((TextureType)newValue);
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
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__COLOR:
        setColor((ColorType)null);
        return;
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__PARAM:
        setParam((ParamType)null);
        return;
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__TEXTURE:
        setTexture((TextureType)null);
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
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__COLOR:
        return color != null;
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__PARAM:
        return param != null;
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE__TEXTURE:
        return texture != null;
    }
    return super.eIsSet(featureID);
  }

} //CommonColorOrTextureTypeImpl
