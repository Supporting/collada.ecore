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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.InputLocalOffset;
import org.khronos.collada.TrifansType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trifans Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TrifansTypeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TrifansTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TrifansTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TrifansTypeImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TrifansTypeImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TrifansTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrifansTypeImpl extends EObjectImpl implements TrifansType {
	/**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
	protected EList<InputLocalOffset> input;

	/**
   * The cached value of the '{@link #getP() <em>P</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
	protected EList<List> p;

	/**
   * The cached value of the '{@link #getExtra() <em>Extra</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getExtra()
   * @generated
   * @ordered
   */
	protected EList<ExtraType> extra;

	/**
   * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
	protected static final BigInteger COUNT_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
	protected BigInteger count = COUNT_EDEFAULT;

	/**
   * The default value of the '{@link #getMaterial() <em>Material</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMaterial()
   * @generated
   * @ordered
   */
	protected static final String MATERIAL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getMaterial() <em>Material</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMaterial()
   * @generated
   * @ordered
   */
	protected String material = MATERIAL_EDEFAULT;

	/**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected static final String NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected String name = NAME_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TrifansTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTrifansType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<InputLocalOffset> getInput() {
    if (input == null)
    {
      input = new EObjectContainmentEList<InputLocalOffset>(InputLocalOffset.class, this, ColladaPackage.TRIFANS_TYPE__INPUT);
    }
    return input;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<List> getP() {
    if (p == null)
    {
      p = new EDataTypeEList<List>(List.class, this, ColladaPackage.TRIFANS_TYPE__P);
    }
    return p;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.TRIFANS_TYPE__EXTRA);
    }
    return extra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getCount() {
    return count;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCount(BigInteger newCount) {
    BigInteger oldCount = count;
    count = newCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TRIFANS_TYPE__COUNT, oldCount, count));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getMaterial() {
    return material;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMaterial(String newMaterial) {
    String oldMaterial = material;
    material = newMaterial;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TRIFANS_TYPE__MATERIAL, oldMaterial, material));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TRIFANS_TYPE__NAME, oldName, name));
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
      case ColladaPackage.TRIFANS_TYPE__INPUT:
        return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
      case ColladaPackage.TRIFANS_TYPE__EXTRA:
        return ((InternalEList<?>)getExtra()).basicRemove(otherEnd, msgs);
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
      case ColladaPackage.TRIFANS_TYPE__INPUT:
        return getInput();
      case ColladaPackage.TRIFANS_TYPE__P:
        return getP();
      case ColladaPackage.TRIFANS_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.TRIFANS_TYPE__COUNT:
        return getCount();
      case ColladaPackage.TRIFANS_TYPE__MATERIAL:
        return getMaterial();
      case ColladaPackage.TRIFANS_TYPE__NAME:
        return getName();
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
      case ColladaPackage.TRIFANS_TYPE__INPUT:
        getInput().clear();
        getInput().addAll((Collection<? extends InputLocalOffset>)newValue);
        return;
      case ColladaPackage.TRIFANS_TYPE__P:
        getP().clear();
        getP().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.TRIFANS_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.TRIFANS_TYPE__COUNT:
        setCount((BigInteger)newValue);
        return;
      case ColladaPackage.TRIFANS_TYPE__MATERIAL:
        setMaterial((String)newValue);
        return;
      case ColladaPackage.TRIFANS_TYPE__NAME:
        setName((String)newValue);
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
      case ColladaPackage.TRIFANS_TYPE__INPUT:
        getInput().clear();
        return;
      case ColladaPackage.TRIFANS_TYPE__P:
        getP().clear();
        return;
      case ColladaPackage.TRIFANS_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.TRIFANS_TYPE__COUNT:
        setCount(COUNT_EDEFAULT);
        return;
      case ColladaPackage.TRIFANS_TYPE__MATERIAL:
        setMaterial(MATERIAL_EDEFAULT);
        return;
      case ColladaPackage.TRIFANS_TYPE__NAME:
        setName(NAME_EDEFAULT);
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
      case ColladaPackage.TRIFANS_TYPE__INPUT:
        return input != null && !input.isEmpty();
      case ColladaPackage.TRIFANS_TYPE__P:
        return p != null && !p.isEmpty();
      case ColladaPackage.TRIFANS_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.TRIFANS_TYPE__COUNT:
        return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
      case ColladaPackage.TRIFANS_TYPE__MATERIAL:
        return MATERIAL_EDEFAULT == null ? material != null : !MATERIAL_EDEFAULT.equals(material);
      case ColladaPackage.TRIFANS_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(", count: ");
    result.append(count);
    result.append(", material: ");
    result.append(material);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TrifansTypeImpl
