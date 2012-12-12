/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.FxAnnotateCommon;
import org.khronos.collada.FxSurfaceCommon;
import org.khronos.collada.GlesSamplerState;
import org.khronos.collada.GlesTexturePipeline;
import org.khronos.collada.GlesTextureUnit;
import org.khronos.collada.SetparamType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setparam Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#isBool <em>Bool</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getBool2 <em>Bool2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getBool3 <em>Bool3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getBool4 <em>Bool4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getInt2 <em>Int2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getInt3 <em>Int3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat1x1 <em>Float1x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat1x2 <em>Float1x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat1x3 <em>Float1x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat1x4 <em>Float1x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat2x1 <em>Float2x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat2x2 <em>Float2x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat2x3 <em>Float2x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat2x4 <em>Float2x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat3x1 <em>Float3x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat3x2 <em>Float3x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat3x3 <em>Float3x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat3x4 <em>Float3x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat4x1 <em>Float4x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat4x2 <em>Float4x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat4x3 <em>Float4x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getTexturePipeline <em>Texture Pipeline</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getSamplerState <em>Sampler State</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getTextureUnit <em>Texture Unit</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SetparamTypeImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetparamTypeImpl extends EObjectImpl implements SetparamType {
	/**
   * The cached value of the '{@link #getAnnotate() <em>Annotate</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnnotate()
   * @generated
   * @ordered
   */
	protected EList<FxAnnotateCommon> annotate;

	/**
   * The default value of the '{@link #isBool() <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isBool()
   * @generated
   * @ordered
   */
	protected static final boolean BOOL_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isBool() <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isBool()
   * @generated
   * @ordered
   */
	protected boolean bool = BOOL_EDEFAULT;

	/**
   * This is true if the Bool attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean boolESet;

	/**
   * The default value of the '{@link #getBool2() <em>Bool2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool2()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool2() <em>Bool2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool2()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool2 = BOOL2_EDEFAULT;

	/**
   * The default value of the '{@link #getBool3() <em>Bool3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool3()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool3() <em>Bool3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool3()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool3 = BOOL3_EDEFAULT;

	/**
   * The default value of the '{@link #getBool4() <em>Bool4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool4()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool4() <em>Bool4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool4()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool4 = BOOL4_EDEFAULT;

	/**
   * The default value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
	protected static final long INT_EDEFAULT = 0L;

	/**
   * The cached value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
	protected long int_ = INT_EDEFAULT;

	/**
   * This is true if the Int attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean intESet;

	/**
   * The default value of the '{@link #getInt2() <em>Int2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt2()
   * @generated
   * @ordered
   */
	protected static final List<Long> INT2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt2() <em>Int2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt2()
   * @generated
   * @ordered
   */
	protected List<Long> int2 = INT2_EDEFAULT;

	/**
   * The default value of the '{@link #getInt3() <em>Int3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt3()
   * @generated
   * @ordered
   */
	protected static final List<Long> INT3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt3() <em>Int3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt3()
   * @generated
   * @ordered
   */
	protected List<Long> int3 = INT3_EDEFAULT;

	/**
   * The default value of the '{@link #getInt4() <em>Int4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt4()
   * @generated
   * @ordered
   */
	protected static final List<Long> INT4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt4() <em>Int4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt4()
   * @generated
   * @ordered
   */
	protected List<Long> int4 = INT4_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat() <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat()
   * @generated
   * @ordered
   */
	protected static final double FLOAT_EDEFAULT = 0.0;

	/**
   * The cached value of the '{@link #getFloat() <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat()
   * @generated
   * @ordered
   */
	protected double float_ = FLOAT_EDEFAULT;

	/**
   * This is true if the Float attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean floatESet;

	/**
   * The default value of the '{@link #getFloat2() <em>Float2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat2() <em>Float2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2()
   * @generated
   * @ordered
   */
	protected List<Double> float2 = FLOAT2_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat3() <em>Float3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat3() <em>Float3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3()
   * @generated
   * @ordered
   */
	protected List<Double> float3 = FLOAT3_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat4() <em>Float4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat4() <em>Float4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4()
   * @generated
   * @ordered
   */
	protected List<Double> float4 = FLOAT4_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat1x1() <em>Float1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x1()
   * @generated
   * @ordered
   */
	protected static final double FLOAT1X1_EDEFAULT = 0.0;

	/**
   * The cached value of the '{@link #getFloat1x1() <em>Float1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x1()
   * @generated
   * @ordered
   */
	protected double float1x1 = FLOAT1X1_EDEFAULT;

	/**
   * This is true if the Float1x1 attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean float1x1ESet;

	/**
   * The default value of the '{@link #getFloat1x2() <em>Float1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x2()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT1X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat1x2() <em>Float1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x2()
   * @generated
   * @ordered
   */
	protected List<Double> float1x2 = FLOAT1X2_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat1x3() <em>Float1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x3()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT1X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat1x3() <em>Float1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x3()
   * @generated
   * @ordered
   */
	protected List<Double> float1x3 = FLOAT1X3_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat1x4() <em>Float1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x4()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT1X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat1x4() <em>Float1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x4()
   * @generated
   * @ordered
   */
	protected List<Double> float1x4 = FLOAT1X4_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat2x1() <em>Float2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x1()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT2X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat2x1() <em>Float2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x1()
   * @generated
   * @ordered
   */
	protected List<Double> float2x1 = FLOAT2X1_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat2x2() <em>Float2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x2()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT2X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat2x2() <em>Float2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x2()
   * @generated
   * @ordered
   */
	protected List<Double> float2x2 = FLOAT2X2_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat2x3() <em>Float2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x3()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT2X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat2x3() <em>Float2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x3()
   * @generated
   * @ordered
   */
	protected List<Double> float2x3 = FLOAT2X3_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat2x4() <em>Float2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x4()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT2X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat2x4() <em>Float2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x4()
   * @generated
   * @ordered
   */
	protected List<Double> float2x4 = FLOAT2X4_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat3x1() <em>Float3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x1()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT3X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat3x1() <em>Float3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x1()
   * @generated
   * @ordered
   */
	protected List<Double> float3x1 = FLOAT3X1_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat3x2() <em>Float3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x2()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT3X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat3x2() <em>Float3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x2()
   * @generated
   * @ordered
   */
	protected List<Double> float3x2 = FLOAT3X2_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat3x3() <em>Float3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x3()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT3X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat3x3() <em>Float3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x3()
   * @generated
   * @ordered
   */
	protected List<Double> float3x3 = FLOAT3X3_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat3x4() <em>Float3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x4()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT3X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat3x4() <em>Float3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x4()
   * @generated
   * @ordered
   */
	protected List<Double> float3x4 = FLOAT3X4_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat4x1() <em>Float4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x1()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT4X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat4x1() <em>Float4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x1()
   * @generated
   * @ordered
   */
	protected List<Double> float4x1 = FLOAT4X1_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat4x2() <em>Float4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x2()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT4X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat4x2() <em>Float4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x2()
   * @generated
   * @ordered
   */
	protected List<Double> float4x2 = FLOAT4X2_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat4x3() <em>Float4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x3()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT4X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat4x3() <em>Float4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x3()
   * @generated
   * @ordered
   */
	protected List<Double> float4x3 = FLOAT4X3_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat4x4() <em>Float4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x4()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT4X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat4x4() <em>Float4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x4()
   * @generated
   * @ordered
   */
	protected List<Double> float4x4 = FLOAT4X4_EDEFAULT;

	/**
   * The cached value of the '{@link #getSurface() <em>Surface</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSurface()
   * @generated
   * @ordered
   */
	protected FxSurfaceCommon surface;

	/**
   * The cached value of the '{@link #getTexturePipeline() <em>Texture Pipeline</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTexturePipeline()
   * @generated
   * @ordered
   */
	protected GlesTexturePipeline texturePipeline;

	/**
   * The cached value of the '{@link #getSamplerState() <em>Sampler State</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSamplerState()
   * @generated
   * @ordered
   */
	protected GlesSamplerState samplerState;

	/**
   * The cached value of the '{@link #getTextureUnit() <em>Texture Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTextureUnit()
   * @generated
   * @ordered
   */
	protected GlesTextureUnit textureUnit;

	/**
   * The default value of the '{@link #getEnum() <em>Enum</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEnum()
   * @generated
   * @ordered
   */
	protected static final Enumerator ENUM_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEnum()
   * @generated
   * @ordered
   */
	protected Enumerator enum_ = ENUM_EDEFAULT;

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
	protected SetparamTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getSetparamType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxAnnotateCommon> getAnnotate() {
    if (annotate == null)
    {
      annotate = new EObjectContainmentEList<FxAnnotateCommon>(FxAnnotateCommon.class, this, ColladaPackage.SETPARAM_TYPE__ANNOTATE);
    }
    return annotate;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isBool() {
    return bool;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool(boolean newBool) {
    boolean oldBool = bool;
    bool = newBool;
    boolean oldBoolESet = boolESet;
    boolESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__BOOL, oldBool, bool, !oldBoolESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetBool() {
    boolean oldBool = bool;
    boolean oldBoolESet = boolESet;
    bool = BOOL_EDEFAULT;
    boolESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.SETPARAM_TYPE__BOOL, oldBool, BOOL_EDEFAULT, oldBoolESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetBool() {
    return boolESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool2() {
    return bool2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool2(List<Boolean> newBool2) {
    List<Boolean> oldBool2 = bool2;
    bool2 = newBool2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__BOOL2, oldBool2, bool2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool3() {
    return bool3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool3(List<Boolean> newBool3) {
    List<Boolean> oldBool3 = bool3;
    bool3 = newBool3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__BOOL3, oldBool3, bool3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool4() {
    return bool4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool4(List<Boolean> newBool4) {
    List<Boolean> oldBool4 = bool4;
    bool4 = newBool4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__BOOL4, oldBool4, bool4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public long getInt() {
    return int_;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt(long newInt) {
    long oldInt = int_;
    int_ = newInt;
    boolean oldIntESet = intESet;
    intESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__INT, oldInt, int_, !oldIntESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetInt() {
    long oldInt = int_;
    boolean oldIntESet = intESet;
    int_ = INT_EDEFAULT;
    intESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.SETPARAM_TYPE__INT, oldInt, INT_EDEFAULT, oldIntESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetInt() {
    return intESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Long> getInt2() {
    return int2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt2(List<Long> newInt2) {
    List<Long> oldInt2 = int2;
    int2 = newInt2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__INT2, oldInt2, int2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Long> getInt3() {
    return int3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt3(List<Long> newInt3) {
    List<Long> oldInt3 = int3;
    int3 = newInt3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__INT3, oldInt3, int3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Long> getInt4() {
    return int4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt4(List<Long> newInt4) {
    List<Long> oldInt4 = int4;
    int4 = newInt4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__INT4, oldInt4, int4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public double getFloat() {
    return float_;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat(double newFloat) {
    double oldFloat = float_;
    float_ = newFloat;
    boolean oldFloatESet = floatESet;
    floatESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT, oldFloat, float_, !oldFloatESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetFloat() {
    double oldFloat = float_;
    boolean oldFloatESet = floatESet;
    float_ = FLOAT_EDEFAULT;
    floatESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.SETPARAM_TYPE__FLOAT, oldFloat, FLOAT_EDEFAULT, oldFloatESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetFloat() {
    return floatESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat2() {
    return float2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat2(List<Double> newFloat2) {
    List<Double> oldFloat2 = float2;
    float2 = newFloat2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT2, oldFloat2, float2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat3() {
    return float3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat3(List<Double> newFloat3) {
    List<Double> oldFloat3 = float3;
    float3 = newFloat3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT3, oldFloat3, float3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat4() {
    return float4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat4(List<Double> newFloat4) {
    List<Double> oldFloat4 = float4;
    float4 = newFloat4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT4, oldFloat4, float4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public double getFloat1x1() {
    return float1x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat1x1(double newFloat1x1) {
    double oldFloat1x1 = float1x1;
    float1x1 = newFloat1x1;
    boolean oldFloat1x1ESet = float1x1ESet;
    float1x1ESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT1X1, oldFloat1x1, float1x1, !oldFloat1x1ESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetFloat1x1() {
    double oldFloat1x1 = float1x1;
    boolean oldFloat1x1ESet = float1x1ESet;
    float1x1 = FLOAT1X1_EDEFAULT;
    float1x1ESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.SETPARAM_TYPE__FLOAT1X1, oldFloat1x1, FLOAT1X1_EDEFAULT, oldFloat1x1ESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetFloat1x1() {
    return float1x1ESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat1x2() {
    return float1x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat1x2(List<Double> newFloat1x2) {
    List<Double> oldFloat1x2 = float1x2;
    float1x2 = newFloat1x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT1X2, oldFloat1x2, float1x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat1x3() {
    return float1x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat1x3(List<Double> newFloat1x3) {
    List<Double> oldFloat1x3 = float1x3;
    float1x3 = newFloat1x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT1X3, oldFloat1x3, float1x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat1x4() {
    return float1x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat1x4(List<Double> newFloat1x4) {
    List<Double> oldFloat1x4 = float1x4;
    float1x4 = newFloat1x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT1X4, oldFloat1x4, float1x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat2x1() {
    return float2x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat2x1(List<Double> newFloat2x1) {
    List<Double> oldFloat2x1 = float2x1;
    float2x1 = newFloat2x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT2X1, oldFloat2x1, float2x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat2x2() {
    return float2x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat2x2(List<Double> newFloat2x2) {
    List<Double> oldFloat2x2 = float2x2;
    float2x2 = newFloat2x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT2X2, oldFloat2x2, float2x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat2x3() {
    return float2x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat2x3(List<Double> newFloat2x3) {
    List<Double> oldFloat2x3 = float2x3;
    float2x3 = newFloat2x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT2X3, oldFloat2x3, float2x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat2x4() {
    return float2x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat2x4(List<Double> newFloat2x4) {
    List<Double> oldFloat2x4 = float2x4;
    float2x4 = newFloat2x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT2X4, oldFloat2x4, float2x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat3x1() {
    return float3x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat3x1(List<Double> newFloat3x1) {
    List<Double> oldFloat3x1 = float3x1;
    float3x1 = newFloat3x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT3X1, oldFloat3x1, float3x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat3x2() {
    return float3x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat3x2(List<Double> newFloat3x2) {
    List<Double> oldFloat3x2 = float3x2;
    float3x2 = newFloat3x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT3X2, oldFloat3x2, float3x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat3x3() {
    return float3x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat3x3(List<Double> newFloat3x3) {
    List<Double> oldFloat3x3 = float3x3;
    float3x3 = newFloat3x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT3X3, oldFloat3x3, float3x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat3x4() {
    return float3x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat3x4(List<Double> newFloat3x4) {
    List<Double> oldFloat3x4 = float3x4;
    float3x4 = newFloat3x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT3X4, oldFloat3x4, float3x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat4x1() {
    return float4x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat4x1(List<Double> newFloat4x1) {
    List<Double> oldFloat4x1 = float4x1;
    float4x1 = newFloat4x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT4X1, oldFloat4x1, float4x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat4x2() {
    return float4x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat4x2(List<Double> newFloat4x2) {
    List<Double> oldFloat4x2 = float4x2;
    float4x2 = newFloat4x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT4X2, oldFloat4x2, float4x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat4x3() {
    return float4x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat4x3(List<Double> newFloat4x3) {
    List<Double> oldFloat4x3 = float4x3;
    float4x3 = newFloat4x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT4X3, oldFloat4x3, float4x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat4x4() {
    return float4x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat4x4(List<Double> newFloat4x4) {
    List<Double> oldFloat4x4 = float4x4;
    float4x4 = newFloat4x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__FLOAT4X4, oldFloat4x4, float4x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceCommon getSurface() {
    return surface;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSurface(FxSurfaceCommon newSurface, NotificationChain msgs) {
    FxSurfaceCommon oldSurface = surface;
    surface = newSurface;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__SURFACE, oldSurface, newSurface);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSurface(FxSurfaceCommon newSurface) {
    if (newSurface != surface)
    {
      NotificationChain msgs = null;
      if (surface != null)
        msgs = ((InternalEObject)surface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SETPARAM_TYPE__SURFACE, null, msgs);
      if (newSurface != null)
        msgs = ((InternalEObject)newSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SETPARAM_TYPE__SURFACE, null, msgs);
      msgs = basicSetSurface(newSurface, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__SURFACE, newSurface, newSurface));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexturePipeline getTexturePipeline() {
    return texturePipeline;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTexturePipeline(GlesTexturePipeline newTexturePipeline, NotificationChain msgs) {
    GlesTexturePipeline oldTexturePipeline = texturePipeline;
    texturePipeline = newTexturePipeline;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__TEXTURE_PIPELINE, oldTexturePipeline, newTexturePipeline);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTexturePipeline(GlesTexturePipeline newTexturePipeline) {
    if (newTexturePipeline != texturePipeline)
    {
      NotificationChain msgs = null;
      if (texturePipeline != null)
        msgs = ((InternalEObject)texturePipeline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SETPARAM_TYPE__TEXTURE_PIPELINE, null, msgs);
      if (newTexturePipeline != null)
        msgs = ((InternalEObject)newTexturePipeline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SETPARAM_TYPE__TEXTURE_PIPELINE, null, msgs);
      msgs = basicSetTexturePipeline(newTexturePipeline, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__TEXTURE_PIPELINE, newTexturePipeline, newTexturePipeline));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesSamplerState getSamplerState() {
    return samplerState;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSamplerState(GlesSamplerState newSamplerState, NotificationChain msgs) {
    GlesSamplerState oldSamplerState = samplerState;
    samplerState = newSamplerState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__SAMPLER_STATE, oldSamplerState, newSamplerState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSamplerState(GlesSamplerState newSamplerState) {
    if (newSamplerState != samplerState)
    {
      NotificationChain msgs = null;
      if (samplerState != null)
        msgs = ((InternalEObject)samplerState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SETPARAM_TYPE__SAMPLER_STATE, null, msgs);
      if (newSamplerState != null)
        msgs = ((InternalEObject)newSamplerState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SETPARAM_TYPE__SAMPLER_STATE, null, msgs);
      msgs = basicSetSamplerState(newSamplerState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__SAMPLER_STATE, newSamplerState, newSamplerState));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTextureUnit getTextureUnit() {
    return textureUnit;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTextureUnit(GlesTextureUnit newTextureUnit, NotificationChain msgs) {
    GlesTextureUnit oldTextureUnit = textureUnit;
    textureUnit = newTextureUnit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__TEXTURE_UNIT, oldTextureUnit, newTextureUnit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTextureUnit(GlesTextureUnit newTextureUnit) {
    if (newTextureUnit != textureUnit)
    {
      NotificationChain msgs = null;
      if (textureUnit != null)
        msgs = ((InternalEObject)textureUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SETPARAM_TYPE__TEXTURE_UNIT, null, msgs);
      if (newTextureUnit != null)
        msgs = ((InternalEObject)newTextureUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SETPARAM_TYPE__TEXTURE_UNIT, null, msgs);
      msgs = basicSetTextureUnit(newTextureUnit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__TEXTURE_UNIT, newTextureUnit, newTextureUnit));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Enumerator getEnum() {
    return enum_;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setEnum(Enumerator newEnum) {
    Enumerator oldEnum = enum_;
    enum_ = newEnum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__ENUM, oldEnum, enum_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SETPARAM_TYPE__REF, oldRef, ref));
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
      case ColladaPackage.SETPARAM_TYPE__ANNOTATE:
        return ((InternalEList<?>)getAnnotate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.SETPARAM_TYPE__SURFACE:
        return basicSetSurface(null, msgs);
      case ColladaPackage.SETPARAM_TYPE__TEXTURE_PIPELINE:
        return basicSetTexturePipeline(null, msgs);
      case ColladaPackage.SETPARAM_TYPE__SAMPLER_STATE:
        return basicSetSamplerState(null, msgs);
      case ColladaPackage.SETPARAM_TYPE__TEXTURE_UNIT:
        return basicSetTextureUnit(null, msgs);
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
      case ColladaPackage.SETPARAM_TYPE__ANNOTATE:
        return getAnnotate();
      case ColladaPackage.SETPARAM_TYPE__BOOL:
        return isBool();
      case ColladaPackage.SETPARAM_TYPE__BOOL2:
        return getBool2();
      case ColladaPackage.SETPARAM_TYPE__BOOL3:
        return getBool3();
      case ColladaPackage.SETPARAM_TYPE__BOOL4:
        return getBool4();
      case ColladaPackage.SETPARAM_TYPE__INT:
        return getInt();
      case ColladaPackage.SETPARAM_TYPE__INT2:
        return getInt2();
      case ColladaPackage.SETPARAM_TYPE__INT3:
        return getInt3();
      case ColladaPackage.SETPARAM_TYPE__INT4:
        return getInt4();
      case ColladaPackage.SETPARAM_TYPE__FLOAT:
        return getFloat();
      case ColladaPackage.SETPARAM_TYPE__FLOAT2:
        return getFloat2();
      case ColladaPackage.SETPARAM_TYPE__FLOAT3:
        return getFloat3();
      case ColladaPackage.SETPARAM_TYPE__FLOAT4:
        return getFloat4();
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X1:
        return getFloat1x1();
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X2:
        return getFloat1x2();
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X3:
        return getFloat1x3();
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X4:
        return getFloat1x4();
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X1:
        return getFloat2x1();
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X2:
        return getFloat2x2();
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X3:
        return getFloat2x3();
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X4:
        return getFloat2x4();
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X1:
        return getFloat3x1();
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X2:
        return getFloat3x2();
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X3:
        return getFloat3x3();
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X4:
        return getFloat3x4();
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X1:
        return getFloat4x1();
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X2:
        return getFloat4x2();
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X3:
        return getFloat4x3();
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X4:
        return getFloat4x4();
      case ColladaPackage.SETPARAM_TYPE__SURFACE:
        return getSurface();
      case ColladaPackage.SETPARAM_TYPE__TEXTURE_PIPELINE:
        return getTexturePipeline();
      case ColladaPackage.SETPARAM_TYPE__SAMPLER_STATE:
        return getSamplerState();
      case ColladaPackage.SETPARAM_TYPE__TEXTURE_UNIT:
        return getTextureUnit();
      case ColladaPackage.SETPARAM_TYPE__ENUM:
        return getEnum();
      case ColladaPackage.SETPARAM_TYPE__REF:
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
      case ColladaPackage.SETPARAM_TYPE__ANNOTATE:
        getAnnotate().clear();
        getAnnotate().addAll((Collection<? extends FxAnnotateCommon>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__BOOL:
        setBool((Boolean)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__BOOL2:
        setBool2((List<Boolean>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__BOOL3:
        setBool3((List<Boolean>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__BOOL4:
        setBool4((List<Boolean>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__INT:
        setInt((Long)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__INT2:
        setInt2((List<Long>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__INT3:
        setInt3((List<Long>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__INT4:
        setInt4((List<Long>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT:
        setFloat((Double)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT2:
        setFloat2((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT3:
        setFloat3((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT4:
        setFloat4((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X1:
        setFloat1x1((Double)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X2:
        setFloat1x2((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X3:
        setFloat1x3((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X4:
        setFloat1x4((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X1:
        setFloat2x1((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X2:
        setFloat2x2((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X3:
        setFloat2x3((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X4:
        setFloat2x4((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X1:
        setFloat3x1((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X2:
        setFloat3x2((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X3:
        setFloat3x3((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X4:
        setFloat3x4((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X1:
        setFloat4x1((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X2:
        setFloat4x2((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X3:
        setFloat4x3((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X4:
        setFloat4x4((List<Double>)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__SURFACE:
        setSurface((FxSurfaceCommon)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__TEXTURE_PIPELINE:
        setTexturePipeline((GlesTexturePipeline)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__SAMPLER_STATE:
        setSamplerState((GlesSamplerState)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__TEXTURE_UNIT:
        setTextureUnit((GlesTextureUnit)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__ENUM:
        setEnum((Enumerator)newValue);
        return;
      case ColladaPackage.SETPARAM_TYPE__REF:
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
      case ColladaPackage.SETPARAM_TYPE__ANNOTATE:
        getAnnotate().clear();
        return;
      case ColladaPackage.SETPARAM_TYPE__BOOL:
        unsetBool();
        return;
      case ColladaPackage.SETPARAM_TYPE__BOOL2:
        setBool2(BOOL2_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__BOOL3:
        setBool3(BOOL3_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__BOOL4:
        setBool4(BOOL4_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__INT:
        unsetInt();
        return;
      case ColladaPackage.SETPARAM_TYPE__INT2:
        setInt2(INT2_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__INT3:
        setInt3(INT3_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__INT4:
        setInt4(INT4_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT:
        unsetFloat();
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT2:
        setFloat2(FLOAT2_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT3:
        setFloat3(FLOAT3_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT4:
        setFloat4(FLOAT4_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X1:
        unsetFloat1x1();
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X2:
        setFloat1x2(FLOAT1X2_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X3:
        setFloat1x3(FLOAT1X3_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X4:
        setFloat1x4(FLOAT1X4_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X1:
        setFloat2x1(FLOAT2X1_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X2:
        setFloat2x2(FLOAT2X2_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X3:
        setFloat2x3(FLOAT2X3_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X4:
        setFloat2x4(FLOAT2X4_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X1:
        setFloat3x1(FLOAT3X1_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X2:
        setFloat3x2(FLOAT3X2_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X3:
        setFloat3x3(FLOAT3X3_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X4:
        setFloat3x4(FLOAT3X4_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X1:
        setFloat4x1(FLOAT4X1_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X2:
        setFloat4x2(FLOAT4X2_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X3:
        setFloat4x3(FLOAT4X3_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X4:
        setFloat4x4(FLOAT4X4_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__SURFACE:
        setSurface((FxSurfaceCommon)null);
        return;
      case ColladaPackage.SETPARAM_TYPE__TEXTURE_PIPELINE:
        setTexturePipeline((GlesTexturePipeline)null);
        return;
      case ColladaPackage.SETPARAM_TYPE__SAMPLER_STATE:
        setSamplerState((GlesSamplerState)null);
        return;
      case ColladaPackage.SETPARAM_TYPE__TEXTURE_UNIT:
        setTextureUnit((GlesTextureUnit)null);
        return;
      case ColladaPackage.SETPARAM_TYPE__ENUM:
        setEnum(ENUM_EDEFAULT);
        return;
      case ColladaPackage.SETPARAM_TYPE__REF:
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
      case ColladaPackage.SETPARAM_TYPE__ANNOTATE:
        return annotate != null && !annotate.isEmpty();
      case ColladaPackage.SETPARAM_TYPE__BOOL:
        return isSetBool();
      case ColladaPackage.SETPARAM_TYPE__BOOL2:
        return BOOL2_EDEFAULT == null ? bool2 != null : !BOOL2_EDEFAULT.equals(bool2);
      case ColladaPackage.SETPARAM_TYPE__BOOL3:
        return BOOL3_EDEFAULT == null ? bool3 != null : !BOOL3_EDEFAULT.equals(bool3);
      case ColladaPackage.SETPARAM_TYPE__BOOL4:
        return BOOL4_EDEFAULT == null ? bool4 != null : !BOOL4_EDEFAULT.equals(bool4);
      case ColladaPackage.SETPARAM_TYPE__INT:
        return isSetInt();
      case ColladaPackage.SETPARAM_TYPE__INT2:
        return INT2_EDEFAULT == null ? int2 != null : !INT2_EDEFAULT.equals(int2);
      case ColladaPackage.SETPARAM_TYPE__INT3:
        return INT3_EDEFAULT == null ? int3 != null : !INT3_EDEFAULT.equals(int3);
      case ColladaPackage.SETPARAM_TYPE__INT4:
        return INT4_EDEFAULT == null ? int4 != null : !INT4_EDEFAULT.equals(int4);
      case ColladaPackage.SETPARAM_TYPE__FLOAT:
        return isSetFloat();
      case ColladaPackage.SETPARAM_TYPE__FLOAT2:
        return FLOAT2_EDEFAULT == null ? float2 != null : !FLOAT2_EDEFAULT.equals(float2);
      case ColladaPackage.SETPARAM_TYPE__FLOAT3:
        return FLOAT3_EDEFAULT == null ? float3 != null : !FLOAT3_EDEFAULT.equals(float3);
      case ColladaPackage.SETPARAM_TYPE__FLOAT4:
        return FLOAT4_EDEFAULT == null ? float4 != null : !FLOAT4_EDEFAULT.equals(float4);
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X1:
        return isSetFloat1x1();
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X2:
        return FLOAT1X2_EDEFAULT == null ? float1x2 != null : !FLOAT1X2_EDEFAULT.equals(float1x2);
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X3:
        return FLOAT1X3_EDEFAULT == null ? float1x3 != null : !FLOAT1X3_EDEFAULT.equals(float1x3);
      case ColladaPackage.SETPARAM_TYPE__FLOAT1X4:
        return FLOAT1X4_EDEFAULT == null ? float1x4 != null : !FLOAT1X4_EDEFAULT.equals(float1x4);
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X1:
        return FLOAT2X1_EDEFAULT == null ? float2x1 != null : !FLOAT2X1_EDEFAULT.equals(float2x1);
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X2:
        return FLOAT2X2_EDEFAULT == null ? float2x2 != null : !FLOAT2X2_EDEFAULT.equals(float2x2);
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X3:
        return FLOAT2X3_EDEFAULT == null ? float2x3 != null : !FLOAT2X3_EDEFAULT.equals(float2x3);
      case ColladaPackage.SETPARAM_TYPE__FLOAT2X4:
        return FLOAT2X4_EDEFAULT == null ? float2x4 != null : !FLOAT2X4_EDEFAULT.equals(float2x4);
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X1:
        return FLOAT3X1_EDEFAULT == null ? float3x1 != null : !FLOAT3X1_EDEFAULT.equals(float3x1);
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X2:
        return FLOAT3X2_EDEFAULT == null ? float3x2 != null : !FLOAT3X2_EDEFAULT.equals(float3x2);
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X3:
        return FLOAT3X3_EDEFAULT == null ? float3x3 != null : !FLOAT3X3_EDEFAULT.equals(float3x3);
      case ColladaPackage.SETPARAM_TYPE__FLOAT3X4:
        return FLOAT3X4_EDEFAULT == null ? float3x4 != null : !FLOAT3X4_EDEFAULT.equals(float3x4);
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X1:
        return FLOAT4X1_EDEFAULT == null ? float4x1 != null : !FLOAT4X1_EDEFAULT.equals(float4x1);
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X2:
        return FLOAT4X2_EDEFAULT == null ? float4x2 != null : !FLOAT4X2_EDEFAULT.equals(float4x2);
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X3:
        return FLOAT4X3_EDEFAULT == null ? float4x3 != null : !FLOAT4X3_EDEFAULT.equals(float4x3);
      case ColladaPackage.SETPARAM_TYPE__FLOAT4X4:
        return FLOAT4X4_EDEFAULT == null ? float4x4 != null : !FLOAT4X4_EDEFAULT.equals(float4x4);
      case ColladaPackage.SETPARAM_TYPE__SURFACE:
        return surface != null;
      case ColladaPackage.SETPARAM_TYPE__TEXTURE_PIPELINE:
        return texturePipeline != null;
      case ColladaPackage.SETPARAM_TYPE__SAMPLER_STATE:
        return samplerState != null;
      case ColladaPackage.SETPARAM_TYPE__TEXTURE_UNIT:
        return textureUnit != null;
      case ColladaPackage.SETPARAM_TYPE__ENUM:
        return ENUM_EDEFAULT == null ? enum_ != null : !ENUM_EDEFAULT.equals(enum_);
      case ColladaPackage.SETPARAM_TYPE__REF:
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
    result.append(" (bool: ");
    if (boolESet) result.append(bool); else result.append("<unset>");
    result.append(", bool2: ");
    result.append(bool2);
    result.append(", bool3: ");
    result.append(bool3);
    result.append(", bool4: ");
    result.append(bool4);
    result.append(", int: ");
    if (intESet) result.append(int_); else result.append("<unset>");
    result.append(", int2: ");
    result.append(int2);
    result.append(", int3: ");
    result.append(int3);
    result.append(", int4: ");
    result.append(int4);
    result.append(", float: ");
    if (floatESet) result.append(float_); else result.append("<unset>");
    result.append(", float2: ");
    result.append(float2);
    result.append(", float3: ");
    result.append(float3);
    result.append(", float4: ");
    result.append(float4);
    result.append(", float1x1: ");
    if (float1x1ESet) result.append(float1x1); else result.append("<unset>");
    result.append(", float1x2: ");
    result.append(float1x2);
    result.append(", float1x3: ");
    result.append(float1x3);
    result.append(", float1x4: ");
    result.append(float1x4);
    result.append(", float2x1: ");
    result.append(float2x1);
    result.append(", float2x2: ");
    result.append(float2x2);
    result.append(", float2x3: ");
    result.append(float2x3);
    result.append(", float2x4: ");
    result.append(float2x4);
    result.append(", float3x1: ");
    result.append(float3x1);
    result.append(", float3x2: ");
    result.append(float3x2);
    result.append(", float3x3: ");
    result.append(float3x3);
    result.append(", float3x4: ");
    result.append(float3x4);
    result.append(", float4x1: ");
    result.append(float4x1);
    result.append(", float4x2: ");
    result.append(float4x2);
    result.append(", float4x3: ");
    result.append(float4x3);
    result.append(", float4x4: ");
    result.append(float4x4);
    result.append(", enum: ");
    result.append(enum_);
    result.append(", ref: ");
    result.append(ref);
    result.append(')');
    return result.toString();
  }

} //SetparamTypeImpl
