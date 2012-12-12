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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.FxSurfaceFaceEnum;
import org.khronos.collada.FxSurfaceInitFromCommon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fx Surface Init From Common</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceInitFromCommonImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceInitFromCommonImpl#getFace <em>Face</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceInitFromCommonImpl#getMip <em>Mip</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceInitFromCommonImpl#getSlice <em>Slice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FxSurfaceInitFromCommonImpl extends EObjectImpl implements FxSurfaceInitFromCommon {
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
   * The default value of the '{@link #getMip() <em>Mip</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMip()
   * @generated
   * @ordered
   */
	protected static final long MIP_EDEFAULT = 0L;

	/**
   * The cached value of the '{@link #getMip() <em>Mip</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMip()
   * @generated
   * @ordered
   */
	protected long mip = MIP_EDEFAULT;

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
	protected static final long SLICE_EDEFAULT = 0L;

	/**
   * The cached value of the '{@link #getSlice() <em>Slice</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSlice()
   * @generated
   * @ordered
   */
	protected long slice = SLICE_EDEFAULT;

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
	protected FxSurfaceInitFromCommonImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getFxSurfaceInitFromCommon();
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__VALUE, oldValue, value));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__FACE, oldFace, face, !oldFaceESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__FACE, oldFace, FACE_EDEFAULT, oldFaceESet));
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
	public long getMip() {
    return mip;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMip(long newMip) {
    long oldMip = mip;
    mip = newMip;
    boolean oldMipESet = mipESet;
    mipESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__MIP, oldMip, mip, !oldMipESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMip() {
    long oldMip = mip;
    boolean oldMipESet = mipESet;
    mip = MIP_EDEFAULT;
    mipESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__MIP, oldMip, MIP_EDEFAULT, oldMipESet));
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
	public long getSlice() {
    return slice;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSlice(long newSlice) {
    long oldSlice = slice;
    slice = newSlice;
    boolean oldSliceESet = sliceESet;
    sliceESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__SLICE, oldSlice, slice, !oldSliceESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetSlice() {
    long oldSlice = slice;
    boolean oldSliceESet = sliceESet;
    slice = SLICE_EDEFAULT;
    sliceESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__SLICE, oldSlice, SLICE_EDEFAULT, oldSliceESet));
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
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__VALUE:
        return getValue();
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__FACE:
        return getFace();
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__MIP:
        return getMip();
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__SLICE:
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
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__VALUE:
        setValue((String)newValue);
        return;
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__FACE:
        setFace((FxSurfaceFaceEnum)newValue);
        return;
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__MIP:
        setMip((Long)newValue);
        return;
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__SLICE:
        setSlice((Long)newValue);
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
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__FACE:
        unsetFace();
        return;
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__MIP:
        unsetMip();
        return;
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__SLICE:
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
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__FACE:
        return isSetFace();
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__MIP:
        return isSetMip();
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON__SLICE:
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
    result.append(", mip: ");
    if (mipESet) result.append(mip); else result.append("<unset>");
    result.append(", slice: ");
    if (sliceESet) result.append(slice); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //FxSurfaceInitFromCommonImpl
