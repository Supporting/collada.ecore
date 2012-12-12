/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.FxStenciltargetCommon;
import org.khronos.collada.FxSurfaceFaceEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fx Stenciltarget Common</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.FxStenciltargetCommonImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxStenciltargetCommonImpl#getFace <em>Face</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxStenciltargetCommonImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxStenciltargetCommonImpl#getMip <em>Mip</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxStenciltargetCommonImpl#getSlice <em>Slice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FxStenciltargetCommonImpl extends EObjectImpl implements FxStenciltargetCommon {
	/**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected static final String VALUE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected String value = VALUE_EDEFAULT;

	/**
   * The default value of the '{@link #getFace() <em>Face</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFace()
   * @generated
   * @ordered
   */
	protected static final FxSurfaceFaceEnum FACE_EDEFAULT = FxSurfaceFaceEnum.POSITIVEX;

	/**
   * The cached value of the '{@link #getFace() <em>Face</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFace()
   * @generated
   * @ordered
   */
	protected FxSurfaceFaceEnum face = FACE_EDEFAULT;

	/**
   * This is true if the Face attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean faceESet;

	/**
   * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
	protected static final BigInteger INDEX_EDEFAULT = new BigInteger("0");

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
   * This is true if the Index attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean indexESet;

	/**
   * The default value of the '{@link #getMip() <em>Mip</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMip()
   * @generated
   * @ordered
   */
	protected static final BigInteger MIP_EDEFAULT = new BigInteger("0");

	/**
   * The cached value of the '{@link #getMip() <em>Mip</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMip()
   * @generated
   * @ordered
   */
	protected BigInteger mip = MIP_EDEFAULT;

	/**
   * This is true if the Mip attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean mipESet;

	/**
   * The default value of the '{@link #getSlice() <em>Slice</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSlice()
   * @generated
   * @ordered
   */
	protected static final BigInteger SLICE_EDEFAULT = new BigInteger("0");

	/**
   * The cached value of the '{@link #getSlice() <em>Slice</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSlice()
   * @generated
   * @ordered
   */
	protected BigInteger slice = SLICE_EDEFAULT;

	/**
   * This is true if the Slice attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean sliceESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected FxStenciltargetCommonImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getFxStenciltargetCommon();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setValue(String newValue) {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_STENCILTARGET_COMMON__VALUE, oldValue, value));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFaceEnum getFace() {
    return face;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFace(FxSurfaceFaceEnum newFace) {
    FxSurfaceFaceEnum oldFace = face;
    face = newFace == null ? FACE_EDEFAULT : newFace;
    boolean oldFaceESet = faceESet;
    faceESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_STENCILTARGET_COMMON__FACE, oldFace, face, !oldFaceESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetFace() {
    FxSurfaceFaceEnum oldFace = face;
    boolean oldFaceESet = faceESet;
    face = FACE_EDEFAULT;
    faceESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_STENCILTARGET_COMMON__FACE, oldFace, FACE_EDEFAULT, oldFaceESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetFace() {
    return faceESet;
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
    boolean oldIndexESet = indexESet;
    indexESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_STENCILTARGET_COMMON__INDEX, oldIndex, index, !oldIndexESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetIndex() {
    BigInteger oldIndex = index;
    boolean oldIndexESet = indexESet;
    index = INDEX_EDEFAULT;
    indexESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_STENCILTARGET_COMMON__INDEX, oldIndex, INDEX_EDEFAULT, oldIndexESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetIndex() {
    return indexESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getMip() {
    return mip;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMip(BigInteger newMip) {
    BigInteger oldMip = mip;
    mip = newMip;
    boolean oldMipESet = mipESet;
    mipESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_STENCILTARGET_COMMON__MIP, oldMip, mip, !oldMipESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMip() {
    BigInteger oldMip = mip;
    boolean oldMipESet = mipESet;
    mip = MIP_EDEFAULT;
    mipESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_STENCILTARGET_COMMON__MIP, oldMip, MIP_EDEFAULT, oldMipESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMip() {
    return mipESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getSlice() {
    return slice;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSlice(BigInteger newSlice) {
    BigInteger oldSlice = slice;
    slice = newSlice;
    boolean oldSliceESet = sliceESet;
    sliceESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_STENCILTARGET_COMMON__SLICE, oldSlice, slice, !oldSliceESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetSlice() {
    BigInteger oldSlice = slice;
    boolean oldSliceESet = sliceESet;
    slice = SLICE_EDEFAULT;
    sliceESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_STENCILTARGET_COMMON__SLICE, oldSlice, SLICE_EDEFAULT, oldSliceESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetSlice() {
    return sliceESet;
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
      case ColladaPackage.FX_STENCILTARGET_COMMON__VALUE:
        return getValue();
      case ColladaPackage.FX_STENCILTARGET_COMMON__FACE:
        return getFace();
      case ColladaPackage.FX_STENCILTARGET_COMMON__INDEX:
        return getIndex();
      case ColladaPackage.FX_STENCILTARGET_COMMON__MIP:
        return getMip();
      case ColladaPackage.FX_STENCILTARGET_COMMON__SLICE:
        return getSlice();
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
      case ColladaPackage.FX_STENCILTARGET_COMMON__VALUE:
        setValue((String)newValue);
        return;
      case ColladaPackage.FX_STENCILTARGET_COMMON__FACE:
        setFace((FxSurfaceFaceEnum)newValue);
        return;
      case ColladaPackage.FX_STENCILTARGET_COMMON__INDEX:
        setIndex((BigInteger)newValue);
        return;
      case ColladaPackage.FX_STENCILTARGET_COMMON__MIP:
        setMip((BigInteger)newValue);
        return;
      case ColladaPackage.FX_STENCILTARGET_COMMON__SLICE:
        setSlice((BigInteger)newValue);
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
      case ColladaPackage.FX_STENCILTARGET_COMMON__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case ColladaPackage.FX_STENCILTARGET_COMMON__FACE:
        unsetFace();
        return;
      case ColladaPackage.FX_STENCILTARGET_COMMON__INDEX:
        unsetIndex();
        return;
      case ColladaPackage.FX_STENCILTARGET_COMMON__MIP:
        unsetMip();
        return;
      case ColladaPackage.FX_STENCILTARGET_COMMON__SLICE:
        unsetSlice();
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
      case ColladaPackage.FX_STENCILTARGET_COMMON__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case ColladaPackage.FX_STENCILTARGET_COMMON__FACE:
        return isSetFace();
      case ColladaPackage.FX_STENCILTARGET_COMMON__INDEX:
        return isSetIndex();
      case ColladaPackage.FX_STENCILTARGET_COMMON__MIP:
        return isSetMip();
      case ColladaPackage.FX_STENCILTARGET_COMMON__SLICE:
        return isSetSlice();
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
    result.append(" (value: ");
    result.append(value);
    result.append(", face: ");
    if (faceESet) result.append(face); else result.append("<unset>");
    result.append(", index: ");
    if (indexESet) result.append(index); else result.append("<unset>");
    result.append(", mip: ");
    if (mipESet) result.append(mip); else result.append("<unset>");
    result.append(", slice: ");
    if (sliceESet) result.append(slice); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //FxStenciltargetCommonImpl
