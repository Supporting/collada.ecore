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
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.GlSampler1D;
import org.khronos.collada.GlSampler2D;
import org.khronos.collada.GlSampler3D;
import org.khronos.collada.GlSamplerCUBE;
import org.khronos.collada.GlSamplerDEPTH;
import org.khronos.collada.GlSamplerRECT;
import org.khronos.collada.GlslNewarrayType;
import org.khronos.collada.GlslSurfaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glsl Newarray Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getBool2 <em>Bool2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getBool3 <em>Bool3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getBool4 <em>Bool4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getFloat2x2 <em>Float2x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getFloat3x3 <em>Float3x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getInt2 <em>Int2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getInt3 <em>Int3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getSampler1D <em>Sampler1 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getSampler2D <em>Sampler2 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getSampler3D <em>Sampler3 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getSamplerCUBE <em>Sampler CUBE</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getSamplerRECT <em>Sampler RECT</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getSamplerDEPTH <em>Sampler DEPTH</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslNewarrayTypeImpl#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlslNewarrayTypeImpl extends EObjectImpl implements GlslNewarrayType {
	/**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
	protected FeatureMap group;

	/**
   * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
	protected static final BigInteger LENGTH_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
	protected BigInteger length = LENGTH_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected GlslNewarrayTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getGlslNewarrayType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null)
    {
      group = new BasicFeatureMap(this, ColladaPackage.GLSL_NEWARRAY_TYPE__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Boolean> getBool() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Bool());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Bool2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Bool3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Bool4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Float> getFloat() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Float());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Float2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Float3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Float4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat2x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Float2x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat3x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Float3x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat4x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Float4x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Integer> getInt() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Int());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Int2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Int3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Int4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<GlslSurfaceType> getSurface() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Surface());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<GlSampler1D> getSampler1D() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Sampler1D());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<GlSampler2D> getSampler2D() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Sampler2D());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<GlSampler3D> getSampler3D() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Sampler3D());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<GlSamplerCUBE> getSamplerCUBE() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_SamplerCUBE());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<GlSamplerRECT> getSamplerRECT() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_SamplerRECT());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<GlSamplerDEPTH> getSamplerDEPTH() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_SamplerDEPTH());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Enumerator> getEnum() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Enum());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<GlslNewarrayType> getArray() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlslNewarrayType_Array());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getLength() {
    return length;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLength(BigInteger newLength) {
    BigInteger oldLength = length;
    length = newLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_NEWARRAY_TYPE__LENGTH, oldLength, length));
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
      case ColladaPackage.GLSL_NEWARRAY_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SURFACE:
        return ((InternalEList<?>)getSurface()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER1_D:
        return ((InternalEList<?>)getSampler1D()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER2_D:
        return ((InternalEList<?>)getSampler2D()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER3_D:
        return ((InternalEList<?>)getSampler3D()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER_CUBE:
        return ((InternalEList<?>)getSamplerCUBE()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER_RECT:
        return ((InternalEList<?>)getSamplerRECT()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER_DEPTH:
        return ((InternalEList<?>)getSamplerDEPTH()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GLSL_NEWARRAY_TYPE__ARRAY:
        return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
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
      case ColladaPackage.GLSL_NEWARRAY_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL:
        return getBool();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL2:
        return getBool2();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL3:
        return getBool3();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL4:
        return getBool4();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT:
        return getFloat();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT2:
        return getFloat2();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT3:
        return getFloat3();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT4:
        return getFloat4();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT2X2:
        return getFloat2x2();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT3X3:
        return getFloat3x3();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT4X4:
        return getFloat4x4();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT:
        return getInt();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT2:
        return getInt2();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT3:
        return getInt3();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT4:
        return getInt4();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SURFACE:
        return getSurface();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER1_D:
        return getSampler1D();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER2_D:
        return getSampler2D();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER3_D:
        return getSampler3D();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER_CUBE:
        return getSamplerCUBE();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER_RECT:
        return getSamplerRECT();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER_DEPTH:
        return getSamplerDEPTH();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__ENUM:
        return getEnum();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__ARRAY:
        return getArray();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__LENGTH:
        return getLength();
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
      case ColladaPackage.GLSL_NEWARRAY_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL:
        getBool().clear();
        getBool().addAll((Collection<? extends Boolean>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL2:
        getBool2().clear();
        getBool2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL3:
        getBool3().clear();
        getBool3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL4:
        getBool4().clear();
        getBool4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT:
        getFloat().clear();
        getFloat().addAll((Collection<? extends Float>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT2:
        getFloat2().clear();
        getFloat2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT3:
        getFloat3().clear();
        getFloat3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT4:
        getFloat4().clear();
        getFloat4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT2X2:
        getFloat2x2().clear();
        getFloat2x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT3X3:
        getFloat3x3().clear();
        getFloat3x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT4X4:
        getFloat4x4().clear();
        getFloat4x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT:
        getInt().clear();
        getInt().addAll((Collection<? extends Integer>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT2:
        getInt2().clear();
        getInt2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT3:
        getInt3().clear();
        getInt3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT4:
        getInt4().clear();
        getInt4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SURFACE:
        getSurface().clear();
        getSurface().addAll((Collection<? extends GlslSurfaceType>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER1_D:
        getSampler1D().clear();
        getSampler1D().addAll((Collection<? extends GlSampler1D>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER2_D:
        getSampler2D().clear();
        getSampler2D().addAll((Collection<? extends GlSampler2D>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER3_D:
        getSampler3D().clear();
        getSampler3D().addAll((Collection<? extends GlSampler3D>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER_CUBE:
        getSamplerCUBE().clear();
        getSamplerCUBE().addAll((Collection<? extends GlSamplerCUBE>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER_RECT:
        getSamplerRECT().clear();
        getSamplerRECT().addAll((Collection<? extends GlSamplerRECT>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER_DEPTH:
        getSamplerDEPTH().clear();
        getSamplerDEPTH().addAll((Collection<? extends GlSamplerDEPTH>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__ENUM:
        getEnum().clear();
        getEnum().addAll((Collection<? extends Enumerator>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__ARRAY:
        getArray().clear();
        getArray().addAll((Collection<? extends GlslNewarrayType>)newValue);
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__LENGTH:
        setLength((BigInteger)newValue);
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
      case ColladaPackage.GLSL_NEWARRAY_TYPE__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL:
        getBool().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL2:
        getBool2().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL3:
        getBool3().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL4:
        getBool4().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT:
        getFloat().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT2:
        getFloat2().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT3:
        getFloat3().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT4:
        getFloat4().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT2X2:
        getFloat2x2().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT3X3:
        getFloat3x3().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT4X4:
        getFloat4x4().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT:
        getInt().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT2:
        getInt2().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT3:
        getInt3().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT4:
        getInt4().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SURFACE:
        getSurface().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER1_D:
        getSampler1D().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER2_D:
        getSampler2D().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER3_D:
        getSampler3D().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER_CUBE:
        getSamplerCUBE().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER_RECT:
        getSamplerRECT().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER_DEPTH:
        getSamplerDEPTH().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__ENUM:
        getEnum().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__ARRAY:
        getArray().clear();
        return;
      case ColladaPackage.GLSL_NEWARRAY_TYPE__LENGTH:
        setLength(LENGTH_EDEFAULT);
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
      case ColladaPackage.GLSL_NEWARRAY_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL:
        return !getBool().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL2:
        return !getBool2().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL3:
        return !getBool3().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__BOOL4:
        return !getBool4().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT:
        return !getFloat().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT2:
        return !getFloat2().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT3:
        return !getFloat3().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT4:
        return !getFloat4().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT2X2:
        return !getFloat2x2().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT3X3:
        return !getFloat3x3().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__FLOAT4X4:
        return !getFloat4x4().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT:
        return !getInt().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT2:
        return !getInt2().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT3:
        return !getInt3().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__INT4:
        return !getInt4().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SURFACE:
        return !getSurface().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER1_D:
        return !getSampler1D().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER2_D:
        return !getSampler2D().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER3_D:
        return !getSampler3D().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER_CUBE:
        return !getSamplerCUBE().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER_RECT:
        return !getSamplerRECT().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__SAMPLER_DEPTH:
        return !getSamplerDEPTH().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__ENUM:
        return !getEnum().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__ARRAY:
        return !getArray().isEmpty();
      case ColladaPackage.GLSL_NEWARRAY_TYPE__LENGTH:
        return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
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
    result.append(" (group: ");
    result.append(group);
    result.append(", length: ");
    result.append(length);
    result.append(')');
    return result.toString();
  }

} //GlslNewarrayTypeImpl
