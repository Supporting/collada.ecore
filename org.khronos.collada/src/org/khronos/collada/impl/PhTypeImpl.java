/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.PhType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ph Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.PhTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PhTypeImpl#getH <em>H</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhTypeImpl extends EObjectImpl implements PhType {
	/**
   * The default value of the '{@link #getP() <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
	protected static final List<BigInteger> P_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getP() <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
	protected List<BigInteger> p = P_EDEFAULT;

	/**
   * The cached value of the '{@link #getH() <em>H</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getH()
   * @generated
   * @ordered
   */
	protected EList<List> h;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PhTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getPhType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<BigInteger> getP() {
    return p;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setP(List<BigInteger> newP) {
    List<BigInteger> oldP = p;
    p = newP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PH_TYPE__P, oldP, p));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<List> getH() {
    if (h == null)
    {
      h = new EDataTypeEList<List>(List.class, this, ColladaPackage.PH_TYPE__H);
    }
    return h;
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
      case ColladaPackage.PH_TYPE__P:
        return getP();
      case ColladaPackage.PH_TYPE__H:
        return getH();
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
      case ColladaPackage.PH_TYPE__P:
        setP((List<BigInteger>)newValue);
        return;
      case ColladaPackage.PH_TYPE__H:
        getH().clear();
        getH().addAll((Collection<? extends List>)newValue);
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
      case ColladaPackage.PH_TYPE__P:
        setP(P_EDEFAULT);
        return;
      case ColladaPackage.PH_TYPE__H:
        getH().clear();
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
      case ColladaPackage.PH_TYPE__P:
        return P_EDEFAULT == null ? p != null : !P_EDEFAULT.equals(p);
      case ColladaPackage.PH_TYPE__H:
        return h != null && !h.isEmpty();
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
    result.append(" (p: ");
    result.append(p);
    result.append(", h: ");
    result.append(h);
    result.append(')');
    return result.toString();
  }

} //PhTypeImpl
