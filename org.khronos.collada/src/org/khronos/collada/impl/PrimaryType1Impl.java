/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.FxSurfaceFaceEnum;
import org.khronos.collada.PrimaryType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.PrimaryType1Impl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PrimaryType1Impl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryType1Impl extends EObjectImpl implements PrimaryType1 {
	/**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
	protected EList<FxSurfaceFaceEnum> order;

	/**
   * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
	protected static final String REF_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
	protected String ref = REF_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PrimaryType1Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getPrimaryType1();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxSurfaceFaceEnum> getOrder() {
    if (order == null)
    {
      order = new EDataTypeEList<FxSurfaceFaceEnum>(FxSurfaceFaceEnum.class, this, ColladaPackage.PRIMARY_TYPE1__ORDER);
    }
    return order;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getRef() {
    return ref;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRef(String newRef) {
    String oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PRIMARY_TYPE1__REF, oldRef, ref));
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
      case ColladaPackage.PRIMARY_TYPE1__ORDER:
        return getOrder();
      case ColladaPackage.PRIMARY_TYPE1__REF:
        return getRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case ColladaPackage.PRIMARY_TYPE1__ORDER:
        getOrder().clear();
        getOrder().addAll((Collection<? extends FxSurfaceFaceEnum>)newValue);
        return;
      case ColladaPackage.PRIMARY_TYPE1__REF:
        setRef((String)newValue);
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
      case ColladaPackage.PRIMARY_TYPE1__ORDER:
        getOrder().clear();
        return;
      case ColladaPackage.PRIMARY_TYPE1__REF:
        setRef(REF_EDEFAULT);
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
      case ColladaPackage.PRIMARY_TYPE1__ORDER:
        return order != null && !order.isEmpty();
      case ColladaPackage.PRIMARY_TYPE1__REF:
        return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
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
    result.append(" (order: ");
    result.append(order);
    result.append(", ref: ");
    result.append(ref);
    result.append(')');
    return result.toString();
  }

} //PrimaryType1Impl
