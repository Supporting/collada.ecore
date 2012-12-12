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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.InputLocalOffset;
import org.khronos.collada.VertexWeightsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex Weights Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.VertexWeightsTypeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.khronos.collada.impl.VertexWeightsTypeImpl#getVcount <em>Vcount</em>}</li>
 *   <li>{@link org.khronos.collada.impl.VertexWeightsTypeImpl#getV <em>V</em>}</li>
 *   <li>{@link org.khronos.collada.impl.VertexWeightsTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.VertexWeightsTypeImpl#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VertexWeightsTypeImpl extends EObjectImpl implements VertexWeightsType {
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
   * The default value of the '{@link #getVcount() <em>Vcount</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVcount()
   * @generated
   * @ordered
   */
	protected static final List<BigInteger> VCOUNT_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getVcount() <em>Vcount</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVcount()
   * @generated
   * @ordered
   */
	protected List<BigInteger> vcount = VCOUNT_EDEFAULT;

	/**
   * The default value of the '{@link #getV() <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
	protected static final List<Long> V_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getV() <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
	protected List<Long> v = V_EDEFAULT;

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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected VertexWeightsTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getVertexWeightsType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<InputLocalOffset> getInput() {
    if (input == null)
    {
      input = new EObjectContainmentEList<InputLocalOffset>(InputLocalOffset.class, this, ColladaPackage.VERTEX_WEIGHTS_TYPE__INPUT);
    }
    return input;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<BigInteger> getVcount() {
    return vcount;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setVcount(List<BigInteger> newVcount) {
    List<BigInteger> oldVcount = vcount;
    vcount = newVcount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.VERTEX_WEIGHTS_TYPE__VCOUNT, oldVcount, vcount));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Long> getV() {
    return v;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setV(List<Long> newV) {
    List<Long> oldV = v;
    v = newV;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.VERTEX_WEIGHTS_TYPE__V, oldV, v));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.VERTEX_WEIGHTS_TYPE__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.VERTEX_WEIGHTS_TYPE__COUNT, oldCount, count));
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
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__INPUT:
        return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__EXTRA:
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
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__INPUT:
        return getInput();
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__VCOUNT:
        return getVcount();
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__V:
        return getV();
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__COUNT:
        return getCount();
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
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__INPUT:
        getInput().clear();
        getInput().addAll((Collection<? extends InputLocalOffset>)newValue);
        return;
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__VCOUNT:
        setVcount((List<BigInteger>)newValue);
        return;
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__V:
        setV((List<Long>)newValue);
        return;
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__COUNT:
        setCount((BigInteger)newValue);
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
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__INPUT:
        getInput().clear();
        return;
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__VCOUNT:
        setVcount(VCOUNT_EDEFAULT);
        return;
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__V:
        setV(V_EDEFAULT);
        return;
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__COUNT:
        setCount(COUNT_EDEFAULT);
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
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__INPUT:
        return input != null && !input.isEmpty();
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__VCOUNT:
        return VCOUNT_EDEFAULT == null ? vcount != null : !VCOUNT_EDEFAULT.equals(vcount);
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__V:
        return V_EDEFAULT == null ? v != null : !V_EDEFAULT.equals(v);
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.VERTEX_WEIGHTS_TYPE__COUNT:
        return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
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
    result.append(" (vcount: ");
    result.append(vcount);
    result.append(", v: ");
    result.append(v);
    result.append(", count: ");
    result.append(count);
    result.append(')');
    return result.toString();
  }

} //VertexWeightsTypeImpl
