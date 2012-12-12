/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.GlSamplerRECT;
import org.khronos.collada.TextureRECTType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Texture RECT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TextureRECTTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TextureRECTTypeImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TextureRECTTypeImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextureRECTTypeImpl extends EObjectImpl implements TextureRECTType {
	/**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected GlSamplerRECT value;

	/**
   * The default value of the '{@link #getParam() <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
	protected static final String PARAM_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getParam() <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
	protected String param = PARAM_EDEFAULT;

	/**
   * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
	protected static final BigInteger INDEX_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
	protected BigInteger index = INDEX_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TextureRECTTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTextureRECTType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlSamplerRECT getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetValue(GlSamplerRECT newValue, NotificationChain msgs) {
    GlSamplerRECT oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TEXTURE_RECT_TYPE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setValue(GlSamplerRECT newValue) {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TEXTURE_RECT_TYPE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TEXTURE_RECT_TYPE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TEXTURE_RECT_TYPE__VALUE, newValue, newValue));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getParam() {
    return param;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setParam(String newParam) {
    String oldParam = param;
    param = newParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TEXTURE_RECT_TYPE__PARAM, oldParam, param));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getIndex() {
    return index;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setIndex(BigInteger newIndex) {
    BigInteger oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TEXTURE_RECT_TYPE__INDEX, oldIndex, index));
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
      case ColladaPackage.TEXTURE_RECT_TYPE__VALUE:
        return basicSetValue(null, msgs);
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
      case ColladaPackage.TEXTURE_RECT_TYPE__VALUE:
        return getValue();
      case ColladaPackage.TEXTURE_RECT_TYPE__PARAM:
        return getParam();
      case ColladaPackage.TEXTURE_RECT_TYPE__INDEX:
        return getIndex();
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
      case ColladaPackage.TEXTURE_RECT_TYPE__VALUE:
        setValue((GlSamplerRECT)newValue);
        return;
      case ColladaPackage.TEXTURE_RECT_TYPE__PARAM:
        setParam((String)newValue);
        return;
      case ColladaPackage.TEXTURE_RECT_TYPE__INDEX:
        setIndex((BigInteger)newValue);
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
      case ColladaPackage.TEXTURE_RECT_TYPE__VALUE:
        setValue((GlSamplerRECT)null);
        return;
      case ColladaPackage.TEXTURE_RECT_TYPE__PARAM:
        setParam(PARAM_EDEFAULT);
        return;
      case ColladaPackage.TEXTURE_RECT_TYPE__INDEX:
        setIndex(INDEX_EDEFAULT);
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
      case ColladaPackage.TEXTURE_RECT_TYPE__VALUE:
        return value != null;
      case ColladaPackage.TEXTURE_RECT_TYPE__PARAM:
        return PARAM_EDEFAULT == null ? param != null : !PARAM_EDEFAULT.equals(param);
      case ColladaPackage.TEXTURE_RECT_TYPE__INDEX:
        return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
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
    result.append(" (param: ");
    result.append(param);
    result.append(", index: ");
    result.append(index);
    result.append(')');
    return result.toString();
  }

} //TextureRECTTypeImpl
