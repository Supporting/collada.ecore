/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.CommonTransparentType;
import org.khronos.collada.FxOpaqueEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Transparent Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.CommonTransparentTypeImpl#getOpaque <em>Opaque</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommonTransparentTypeImpl extends CommonColorOrTextureTypeImpl implements CommonTransparentType {
	/**
   * The default value of the '{@link #getOpaque() <em>Opaque</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOpaque()
   * @generated
   * @ordered
   */
	protected static final FxOpaqueEnum OPAQUE_EDEFAULT = FxOpaqueEnum.AONE;

	/**
   * The cached value of the '{@link #getOpaque() <em>Opaque</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOpaque()
   * @generated
   * @ordered
   */
	protected FxOpaqueEnum opaque = OPAQUE_EDEFAULT;

	/**
   * This is true if the Opaque attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean opaqueESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CommonTransparentTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getCommonTransparentType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxOpaqueEnum getOpaque() {
    return opaque;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setOpaque(FxOpaqueEnum newOpaque) {
    FxOpaqueEnum oldOpaque = opaque;
    opaque = newOpaque == null ? OPAQUE_EDEFAULT : newOpaque;
    boolean oldOpaqueESet = opaqueESet;
    opaqueESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_TRANSPARENT_TYPE__OPAQUE, oldOpaque, opaque, !oldOpaqueESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetOpaque() {
    FxOpaqueEnum oldOpaque = opaque;
    boolean oldOpaqueESet = opaqueESet;
    opaque = OPAQUE_EDEFAULT;
    opaqueESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.COMMON_TRANSPARENT_TYPE__OPAQUE, oldOpaque, OPAQUE_EDEFAULT, oldOpaqueESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetOpaque() {
    return opaqueESet;
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
      case ColladaPackage.COMMON_TRANSPARENT_TYPE__OPAQUE:
        return getOpaque();
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
      case ColladaPackage.COMMON_TRANSPARENT_TYPE__OPAQUE:
        setOpaque((FxOpaqueEnum)newValue);
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
      case ColladaPackage.COMMON_TRANSPARENT_TYPE__OPAQUE:
        unsetOpaque();
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
      case ColladaPackage.COMMON_TRANSPARENT_TYPE__OPAQUE:
        return isSetOpaque();
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
    result.append(" (opaque: ");
    if (opaqueESet) result.append(opaque); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //CommonTransparentTypeImpl
