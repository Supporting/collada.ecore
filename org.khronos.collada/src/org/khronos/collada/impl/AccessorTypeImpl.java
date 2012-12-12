/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.AccessorType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ParamType4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accessor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.AccessorTypeImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AccessorTypeImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AccessorTypeImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AccessorTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AccessorTypeImpl#getStride <em>Stride</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessorTypeImpl extends EObjectImpl implements AccessorType {
	/**
   * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
	protected EList<ParamType4> param;

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
   * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
	protected static final BigInteger OFFSET_EDEFAULT = new BigInteger("0");

	/**
   * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
	protected BigInteger offset = OFFSET_EDEFAULT;

	/**
   * This is true if the Offset attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean offsetESet;

	/**
   * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
	protected static final String SOURCE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
	protected String source = SOURCE_EDEFAULT;

	/**
   * The default value of the '{@link #getStride() <em>Stride</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStride()
   * @generated
   * @ordered
   */
	protected static final BigInteger STRIDE_EDEFAULT = new BigInteger("1");

	/**
   * The cached value of the '{@link #getStride() <em>Stride</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStride()
   * @generated
   * @ordered
   */
	protected BigInteger stride = STRIDE_EDEFAULT;

	/**
   * This is true if the Stride attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean strideESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AccessorTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getAccessorType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ParamType4> getParam() {
    if (param == null)
    {
      param = new EObjectContainmentEList<ParamType4>(ParamType4.class, this, ColladaPackage.ACCESSOR_TYPE__PARAM);
    }
    return param;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ACCESSOR_TYPE__COUNT, oldCount, count));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getOffset() {
    return offset;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setOffset(BigInteger newOffset) {
    BigInteger oldOffset = offset;
    offset = newOffset;
    boolean oldOffsetESet = offsetESet;
    offsetESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ACCESSOR_TYPE__OFFSET, oldOffset, offset, !oldOffsetESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetOffset() {
    BigInteger oldOffset = offset;
    boolean oldOffsetESet = offsetESet;
    offset = OFFSET_EDEFAULT;
    offsetESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.ACCESSOR_TYPE__OFFSET, oldOffset, OFFSET_EDEFAULT, oldOffsetESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetOffset() {
    return offsetESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSource() {
    return source;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSource(String newSource) {
    String oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ACCESSOR_TYPE__SOURCE, oldSource, source));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getStride() {
    return stride;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setStride(BigInteger newStride) {
    BigInteger oldStride = stride;
    stride = newStride;
    boolean oldStrideESet = strideESet;
    strideESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ACCESSOR_TYPE__STRIDE, oldStride, stride, !oldStrideESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetStride() {
    BigInteger oldStride = stride;
    boolean oldStrideESet = strideESet;
    stride = STRIDE_EDEFAULT;
    strideESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.ACCESSOR_TYPE__STRIDE, oldStride, STRIDE_EDEFAULT, oldStrideESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetStride() {
    return strideESet;
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
      case ColladaPackage.ACCESSOR_TYPE__PARAM:
        return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
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
      case ColladaPackage.ACCESSOR_TYPE__PARAM:
        return getParam();
      case ColladaPackage.ACCESSOR_TYPE__COUNT:
        return getCount();
      case ColladaPackage.ACCESSOR_TYPE__OFFSET:
        return getOffset();
      case ColladaPackage.ACCESSOR_TYPE__SOURCE:
        return getSource();
      case ColladaPackage.ACCESSOR_TYPE__STRIDE:
        return getStride();
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
      case ColladaPackage.ACCESSOR_TYPE__PARAM:
        getParam().clear();
        getParam().addAll((Collection<? extends ParamType4>)newValue);
        return;
      case ColladaPackage.ACCESSOR_TYPE__COUNT:
        setCount((BigInteger)newValue);
        return;
      case ColladaPackage.ACCESSOR_TYPE__OFFSET:
        setOffset((BigInteger)newValue);
        return;
      case ColladaPackage.ACCESSOR_TYPE__SOURCE:
        setSource((String)newValue);
        return;
      case ColladaPackage.ACCESSOR_TYPE__STRIDE:
        setStride((BigInteger)newValue);
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
      case ColladaPackage.ACCESSOR_TYPE__PARAM:
        getParam().clear();
        return;
      case ColladaPackage.ACCESSOR_TYPE__COUNT:
        setCount(COUNT_EDEFAULT);
        return;
      case ColladaPackage.ACCESSOR_TYPE__OFFSET:
        unsetOffset();
        return;
      case ColladaPackage.ACCESSOR_TYPE__SOURCE:
        setSource(SOURCE_EDEFAULT);
        return;
      case ColladaPackage.ACCESSOR_TYPE__STRIDE:
        unsetStride();
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
      case ColladaPackage.ACCESSOR_TYPE__PARAM:
        return param != null && !param.isEmpty();
      case ColladaPackage.ACCESSOR_TYPE__COUNT:
        return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
      case ColladaPackage.ACCESSOR_TYPE__OFFSET:
        return isSetOffset();
      case ColladaPackage.ACCESSOR_TYPE__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
      case ColladaPackage.ACCESSOR_TYPE__STRIDE:
        return isSetStride();
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
    result.append(" (count: ");
    result.append(count);
    result.append(", offset: ");
    if (offsetESet) result.append(offset); else result.append("<unset>");
    result.append(", source: ");
    result.append(source);
    result.append(", stride: ");
    if (strideESet) result.append(stride); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //AccessorTypeImpl
