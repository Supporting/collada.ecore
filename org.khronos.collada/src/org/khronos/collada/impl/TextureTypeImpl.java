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
import org.khronos.collada.ExtraType;
import org.khronos.collada.TextureType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Texture Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TextureTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TextureTypeImpl#getTexcoord <em>Texcoord</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TextureTypeImpl#getTexture <em>Texture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextureTypeImpl extends EObjectImpl implements TextureType {
	/**
   * The cached value of the '{@link #getExtra() <em>Extra</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getExtra()
   * @generated
   * @ordered
   */
	protected ExtraType extra;

	/**
   * The default value of the '{@link #getTexcoord() <em>Texcoord</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTexcoord()
   * @generated
   * @ordered
   */
	protected static final String TEXCOORD_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getTexcoord() <em>Texcoord</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTexcoord()
   * @generated
   * @ordered
   */
	protected String texcoord = TEXCOORD_EDEFAULT;

	/**
   * The default value of the '{@link #getTexture() <em>Texture</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTexture()
   * @generated
   * @ordered
   */
	protected static final String TEXTURE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getTexture() <em>Texture</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTexture()
   * @generated
   * @ordered
   */
	protected String texture = TEXTURE_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TextureTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTextureType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ExtraType getExtra() {
    return extra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetExtra(ExtraType newExtra, NotificationChain msgs) {
    ExtraType oldExtra = extra;
    extra = newExtra;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TEXTURE_TYPE__EXTRA, oldExtra, newExtra);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setExtra(ExtraType newExtra) {
    if (newExtra != extra)
    {
      NotificationChain msgs = null;
      if (extra != null)
        msgs = ((InternalEObject)extra).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TEXTURE_TYPE__EXTRA, null, msgs);
      if (newExtra != null)
        msgs = ((InternalEObject)newExtra).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TEXTURE_TYPE__EXTRA, null, msgs);
      msgs = basicSetExtra(newExtra, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TEXTURE_TYPE__EXTRA, newExtra, newExtra));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getTexcoord() {
    return texcoord;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTexcoord(String newTexcoord) {
    String oldTexcoord = texcoord;
    texcoord = newTexcoord;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TEXTURE_TYPE__TEXCOORD, oldTexcoord, texcoord));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getTexture() {
    return texture;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTexture(String newTexture) {
    String oldTexture = texture;
    texture = newTexture;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TEXTURE_TYPE__TEXTURE, oldTexture, texture));
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
      case ColladaPackage.TEXTURE_TYPE__EXTRA:
        return basicSetExtra(null, msgs);
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
      case ColladaPackage.TEXTURE_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.TEXTURE_TYPE__TEXCOORD:
        return getTexcoord();
      case ColladaPackage.TEXTURE_TYPE__TEXTURE:
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
      case ColladaPackage.TEXTURE_TYPE__EXTRA:
        setExtra((ExtraType)newValue);
        return;
      case ColladaPackage.TEXTURE_TYPE__TEXCOORD:
        setTexcoord((String)newValue);
        return;
      case ColladaPackage.TEXTURE_TYPE__TEXTURE:
        setTexture((String)newValue);
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
      case ColladaPackage.TEXTURE_TYPE__EXTRA:
        setExtra((ExtraType)null);
        return;
      case ColladaPackage.TEXTURE_TYPE__TEXCOORD:
        setTexcoord(TEXCOORD_EDEFAULT);
        return;
      case ColladaPackage.TEXTURE_TYPE__TEXTURE:
        setTexture(TEXTURE_EDEFAULT);
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
      case ColladaPackage.TEXTURE_TYPE__EXTRA:
        return extra != null;
      case ColladaPackage.TEXTURE_TYPE__TEXCOORD:
        return TEXCOORD_EDEFAULT == null ? texcoord != null : !TEXCOORD_EDEFAULT.equals(texcoord);
      case ColladaPackage.TEXTURE_TYPE__TEXTURE:
        return TEXTURE_EDEFAULT == null ? texture != null : !TEXTURE_EDEFAULT.equals(texture);
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (texcoord: ");
    result.append(texcoord);
    result.append(", texture: ");
    result.append(texture);
    result.append(')');
    return result.toString();
  }

} //TextureTypeImpl
