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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.FxAnnotateCommon;
import org.khronos.collada.FxModifierEnumCommon;
import org.khronos.collada.FxNewparamCommon;
import org.khronos.collada.FxSampler1DCommon;
import org.khronos.collada.FxSampler2DCommon;
import org.khronos.collada.FxSampler3DCommon;
import org.khronos.collada.FxSamplerCUBECommon;
import org.khronos.collada.FxSamplerDEPTHCommon;
import org.khronos.collada.FxSamplerRECTCommon;
import org.khronos.collada.FxSurfaceCommon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fx Newparam Common</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#isBool <em>Bool</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getBool2 <em>Bool2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getBool3 <em>Bool3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getBool4 <em>Bool4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getInt2 <em>Int2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getInt3 <em>Int3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat1x1 <em>Float1x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat1x2 <em>Float1x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat1x3 <em>Float1x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat1x4 <em>Float1x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat2x1 <em>Float2x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat2x2 <em>Float2x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat2x3 <em>Float2x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat2x4 <em>Float2x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat3x1 <em>Float3x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat3x2 <em>Float3x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat3x3 <em>Float3x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat3x4 <em>Float3x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat4x1 <em>Float4x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat4x2 <em>Float4x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat4x3 <em>Float4x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getSampler1D <em>Sampler1 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getSampler2D <em>Sampler2 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getSampler3D <em>Sampler3 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getSamplerCUBE <em>Sampler CUBE</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getSamplerRECT <em>Sampler RECT</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getSamplerDEPTH <em>Sampler DEPTH</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxNewparamCommonImpl#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FxNewparamCommonImpl extends EObjectImpl implements FxNewparamCommon {
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
   * The default value of the '{@link #getSemantic() <em>Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSemantic()
   * @generated
   * @ordered
   */
	protected static final String SEMANTIC_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSemantic() <em>Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSemantic()
   * @generated
   * @ordered
   */
	protected String semantic = SEMANTIC_EDEFAULT;

	/**
   * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
	protected static final FxModifierEnumCommon MODIFIER_EDEFAULT = FxModifierEnumCommon.CONST;

	/**
   * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
	protected FxModifierEnumCommon modifier = MODIFIER_EDEFAULT;

	/**
   * This is true if the Modifier attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean modifierESet;

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
   * The cached value of the '{@link #getSampler1D() <em>Sampler1 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSampler1D()
   * @generated
   * @ordered
   */
	protected FxSampler1DCommon sampler1D;

	/**
   * The cached value of the '{@link #getSampler2D() <em>Sampler2 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSampler2D()
   * @generated
   * @ordered
   */
	protected FxSampler2DCommon sampler2D;

	/**
   * The cached value of the '{@link #getSampler3D() <em>Sampler3 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSampler3D()
   * @generated
   * @ordered
   */
	protected FxSampler3DCommon sampler3D;

	/**
   * The cached value of the '{@link #getSamplerCUBE() <em>Sampler CUBE</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSamplerCUBE()
   * @generated
   * @ordered
   */
	protected FxSamplerCUBECommon samplerCUBE;

	/**
   * The cached value of the '{@link #getSamplerRECT() <em>Sampler RECT</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSamplerRECT()
   * @generated
   * @ordered
   */
	protected FxSamplerRECTCommon samplerRECT;

	/**
   * The cached value of the '{@link #getSamplerDEPTH() <em>Sampler DEPTH</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSamplerDEPTH()
   * @generated
   * @ordered
   */
	protected FxSamplerDEPTHCommon samplerDEPTH;

	/**
   * The default value of the '{@link #getEnum() <em>Enum</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEnum()
   * @generated
   * @ordered
   */
	protected static final String ENUM_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEnum()
   * @generated
   * @ordered
   */
	protected String enum_ = ENUM_EDEFAULT;

	/**
   * The default value of the '{@link #getSid() <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSid()
   * @generated
   * @ordered
   */
	protected static final String SID_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSid() <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSid()
   * @generated
   * @ordered
   */
	protected String sid = SID_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected FxNewparamCommonImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getFxNewparamCommon();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxAnnotateCommon> getAnnotate() {
    if (annotate == null)
    {
      annotate = new EObjectContainmentEList<FxAnnotateCommon>(FxAnnotateCommon.class, this, ColladaPackage.FX_NEWPARAM_COMMON__ANNOTATE);
    }
    return annotate;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSemantic() {
    return semantic;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSemantic(String newSemantic) {
    String oldSemantic = semantic;
    semantic = newSemantic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SEMANTIC, oldSemantic, semantic));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxModifierEnumCommon getModifier() {
    return modifier;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setModifier(FxModifierEnumCommon newModifier) {
    FxModifierEnumCommon oldModifier = modifier;
    modifier = newModifier == null ? MODIFIER_EDEFAULT : newModifier;
    boolean oldModifierESet = modifierESet;
    modifierESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__MODIFIER, oldModifier, modifier, !oldModifierESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetModifier() {
    FxModifierEnumCommon oldModifier = modifier;
    boolean oldModifierESet = modifierESet;
    modifier = MODIFIER_EDEFAULT;
    modifierESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_NEWPARAM_COMMON__MODIFIER, oldModifier, MODIFIER_EDEFAULT, oldModifierESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetModifier() {
    return modifierESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__BOOL, oldBool, bool, !oldBoolESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_NEWPARAM_COMMON__BOOL, oldBool, BOOL_EDEFAULT, oldBoolESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__BOOL2, oldBool2, bool2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__BOOL3, oldBool3, bool3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__BOOL4, oldBool4, bool4));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__INT, oldInt, int_, !oldIntESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_NEWPARAM_COMMON__INT, oldInt, INT_EDEFAULT, oldIntESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__INT2, oldInt2, int2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__INT3, oldInt3, int3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__INT4, oldInt4, int4));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT, oldFloat, float_, !oldFloatESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT, oldFloat, FLOAT_EDEFAULT, oldFloatESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2, oldFloat2, float2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3, oldFloat3, float3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4, oldFloat4, float4));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X1, oldFloat1x1, float1x1, !oldFloat1x1ESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X1, oldFloat1x1, FLOAT1X1_EDEFAULT, oldFloat1x1ESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X2, oldFloat1x2, float1x2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X3, oldFloat1x3, float1x3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X4, oldFloat1x4, float1x4));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X1, oldFloat2x1, float2x1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X2, oldFloat2x2, float2x2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X3, oldFloat2x3, float2x3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X4, oldFloat2x4, float2x4));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X1, oldFloat3x1, float3x1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X2, oldFloat3x2, float3x2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X3, oldFloat3x3, float3x3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X4, oldFloat3x4, float3x4));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X1, oldFloat4x1, float4x1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X2, oldFloat4x2, float4x2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X3, oldFloat4x3, float4x3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X4, oldFloat4x4, float4x4));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SURFACE, oldSurface, newSurface);
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
        msgs = ((InternalEObject)surface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_NEWPARAM_COMMON__SURFACE, null, msgs);
      if (newSurface != null)
        msgs = ((InternalEObject)newSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_NEWPARAM_COMMON__SURFACE, null, msgs);
      msgs = basicSetSurface(newSurface, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SURFACE, newSurface, newSurface));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSampler1DCommon getSampler1D() {
    return sampler1D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSampler1D(FxSampler1DCommon newSampler1D, NotificationChain msgs) {
    FxSampler1DCommon oldSampler1D = sampler1D;
    sampler1D = newSampler1D;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER1_D, oldSampler1D, newSampler1D);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSampler1D(FxSampler1DCommon newSampler1D) {
    if (newSampler1D != sampler1D)
    {
      NotificationChain msgs = null;
      if (sampler1D != null)
        msgs = ((InternalEObject)sampler1D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER1_D, null, msgs);
      if (newSampler1D != null)
        msgs = ((InternalEObject)newSampler1D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER1_D, null, msgs);
      msgs = basicSetSampler1D(newSampler1D, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER1_D, newSampler1D, newSampler1D));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSampler2DCommon getSampler2D() {
    return sampler2D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSampler2D(FxSampler2DCommon newSampler2D, NotificationChain msgs) {
    FxSampler2DCommon oldSampler2D = sampler2D;
    sampler2D = newSampler2D;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER2_D, oldSampler2D, newSampler2D);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSampler2D(FxSampler2DCommon newSampler2D) {
    if (newSampler2D != sampler2D)
    {
      NotificationChain msgs = null;
      if (sampler2D != null)
        msgs = ((InternalEObject)sampler2D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER2_D, null, msgs);
      if (newSampler2D != null)
        msgs = ((InternalEObject)newSampler2D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER2_D, null, msgs);
      msgs = basicSetSampler2D(newSampler2D, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER2_D, newSampler2D, newSampler2D));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSampler3DCommon getSampler3D() {
    return sampler3D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSampler3D(FxSampler3DCommon newSampler3D, NotificationChain msgs) {
    FxSampler3DCommon oldSampler3D = sampler3D;
    sampler3D = newSampler3D;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER3_D, oldSampler3D, newSampler3D);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSampler3D(FxSampler3DCommon newSampler3D) {
    if (newSampler3D != sampler3D)
    {
      NotificationChain msgs = null;
      if (sampler3D != null)
        msgs = ((InternalEObject)sampler3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER3_D, null, msgs);
      if (newSampler3D != null)
        msgs = ((InternalEObject)newSampler3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER3_D, null, msgs);
      msgs = basicSetSampler3D(newSampler3D, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER3_D, newSampler3D, newSampler3D));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSamplerCUBECommon getSamplerCUBE() {
    return samplerCUBE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSamplerCUBE(FxSamplerCUBECommon newSamplerCUBE, NotificationChain msgs) {
    FxSamplerCUBECommon oldSamplerCUBE = samplerCUBE;
    samplerCUBE = newSamplerCUBE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_CUBE, oldSamplerCUBE, newSamplerCUBE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSamplerCUBE(FxSamplerCUBECommon newSamplerCUBE) {
    if (newSamplerCUBE != samplerCUBE)
    {
      NotificationChain msgs = null;
      if (samplerCUBE != null)
        msgs = ((InternalEObject)samplerCUBE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_CUBE, null, msgs);
      if (newSamplerCUBE != null)
        msgs = ((InternalEObject)newSamplerCUBE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_CUBE, null, msgs);
      msgs = basicSetSamplerCUBE(newSamplerCUBE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_CUBE, newSamplerCUBE, newSamplerCUBE));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSamplerRECTCommon getSamplerRECT() {
    return samplerRECT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSamplerRECT(FxSamplerRECTCommon newSamplerRECT, NotificationChain msgs) {
    FxSamplerRECTCommon oldSamplerRECT = samplerRECT;
    samplerRECT = newSamplerRECT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_RECT, oldSamplerRECT, newSamplerRECT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSamplerRECT(FxSamplerRECTCommon newSamplerRECT) {
    if (newSamplerRECT != samplerRECT)
    {
      NotificationChain msgs = null;
      if (samplerRECT != null)
        msgs = ((InternalEObject)samplerRECT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_RECT, null, msgs);
      if (newSamplerRECT != null)
        msgs = ((InternalEObject)newSamplerRECT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_RECT, null, msgs);
      msgs = basicSetSamplerRECT(newSamplerRECT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_RECT, newSamplerRECT, newSamplerRECT));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSamplerDEPTHCommon getSamplerDEPTH() {
    return samplerDEPTH;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSamplerDEPTH(FxSamplerDEPTHCommon newSamplerDEPTH, NotificationChain msgs) {
    FxSamplerDEPTHCommon oldSamplerDEPTH = samplerDEPTH;
    samplerDEPTH = newSamplerDEPTH;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_DEPTH, oldSamplerDEPTH, newSamplerDEPTH);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSamplerDEPTH(FxSamplerDEPTHCommon newSamplerDEPTH) {
    if (newSamplerDEPTH != samplerDEPTH)
    {
      NotificationChain msgs = null;
      if (samplerDEPTH != null)
        msgs = ((InternalEObject)samplerDEPTH).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_DEPTH, null, msgs);
      if (newSamplerDEPTH != null)
        msgs = ((InternalEObject)newSamplerDEPTH).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_DEPTH, null, msgs);
      msgs = basicSetSamplerDEPTH(newSamplerDEPTH, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_DEPTH, newSamplerDEPTH, newSamplerDEPTH));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getEnum() {
    return enum_;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setEnum(String newEnum) {
    String oldEnum = enum_;
    enum_ = newEnum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__ENUM, oldEnum, enum_));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSid() {
    return sid;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSid(String newSid) {
    String oldSid = sid;
    sid = newSid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_NEWPARAM_COMMON__SID, oldSid, sid));
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
      case ColladaPackage.FX_NEWPARAM_COMMON__ANNOTATE:
        return ((InternalEList<?>)getAnnotate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.FX_NEWPARAM_COMMON__SURFACE:
        return basicSetSurface(null, msgs);
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER1_D:
        return basicSetSampler1D(null, msgs);
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER2_D:
        return basicSetSampler2D(null, msgs);
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER3_D:
        return basicSetSampler3D(null, msgs);
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_CUBE:
        return basicSetSamplerCUBE(null, msgs);
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_RECT:
        return basicSetSamplerRECT(null, msgs);
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_DEPTH:
        return basicSetSamplerDEPTH(null, msgs);
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
      case ColladaPackage.FX_NEWPARAM_COMMON__ANNOTATE:
        return getAnnotate();
      case ColladaPackage.FX_NEWPARAM_COMMON__SEMANTIC:
        return getSemantic();
      case ColladaPackage.FX_NEWPARAM_COMMON__MODIFIER:
        return getModifier();
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL:
        return isBool();
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL2:
        return getBool2();
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL3:
        return getBool3();
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL4:
        return getBool4();
      case ColladaPackage.FX_NEWPARAM_COMMON__INT:
        return getInt();
      case ColladaPackage.FX_NEWPARAM_COMMON__INT2:
        return getInt2();
      case ColladaPackage.FX_NEWPARAM_COMMON__INT3:
        return getInt3();
      case ColladaPackage.FX_NEWPARAM_COMMON__INT4:
        return getInt4();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT:
        return getFloat();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2:
        return getFloat2();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3:
        return getFloat3();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4:
        return getFloat4();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X1:
        return getFloat1x1();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X2:
        return getFloat1x2();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X3:
        return getFloat1x3();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X4:
        return getFloat1x4();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X1:
        return getFloat2x1();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X2:
        return getFloat2x2();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X3:
        return getFloat2x3();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X4:
        return getFloat2x4();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X1:
        return getFloat3x1();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X2:
        return getFloat3x2();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X3:
        return getFloat3x3();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X4:
        return getFloat3x4();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X1:
        return getFloat4x1();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X2:
        return getFloat4x2();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X3:
        return getFloat4x3();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X4:
        return getFloat4x4();
      case ColladaPackage.FX_NEWPARAM_COMMON__SURFACE:
        return getSurface();
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER1_D:
        return getSampler1D();
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER2_D:
        return getSampler2D();
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER3_D:
        return getSampler3D();
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_CUBE:
        return getSamplerCUBE();
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_RECT:
        return getSamplerRECT();
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_DEPTH:
        return getSamplerDEPTH();
      case ColladaPackage.FX_NEWPARAM_COMMON__ENUM:
        return getEnum();
      case ColladaPackage.FX_NEWPARAM_COMMON__SID:
        return getSid();
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
      case ColladaPackage.FX_NEWPARAM_COMMON__ANNOTATE:
        getAnnotate().clear();
        getAnnotate().addAll((Collection<? extends FxAnnotateCommon>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SEMANTIC:
        setSemantic((String)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__MODIFIER:
        setModifier((FxModifierEnumCommon)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL:
        setBool((Boolean)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL2:
        setBool2((List<Boolean>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL3:
        setBool3((List<Boolean>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL4:
        setBool4((List<Boolean>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__INT:
        setInt((Long)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__INT2:
        setInt2((List<Long>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__INT3:
        setInt3((List<Long>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__INT4:
        setInt4((List<Long>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT:
        setFloat((Double)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2:
        setFloat2((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3:
        setFloat3((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4:
        setFloat4((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X1:
        setFloat1x1((Double)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X2:
        setFloat1x2((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X3:
        setFloat1x3((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X4:
        setFloat1x4((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X1:
        setFloat2x1((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X2:
        setFloat2x2((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X3:
        setFloat2x3((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X4:
        setFloat2x4((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X1:
        setFloat3x1((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X2:
        setFloat3x2((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X3:
        setFloat3x3((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X4:
        setFloat3x4((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X1:
        setFloat4x1((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X2:
        setFloat4x2((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X3:
        setFloat4x3((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X4:
        setFloat4x4((List<Double>)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SURFACE:
        setSurface((FxSurfaceCommon)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER1_D:
        setSampler1D((FxSampler1DCommon)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER2_D:
        setSampler2D((FxSampler2DCommon)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER3_D:
        setSampler3D((FxSampler3DCommon)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_CUBE:
        setSamplerCUBE((FxSamplerCUBECommon)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_RECT:
        setSamplerRECT((FxSamplerRECTCommon)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_DEPTH:
        setSamplerDEPTH((FxSamplerDEPTHCommon)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__ENUM:
        setEnum((String)newValue);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SID:
        setSid((String)newValue);
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
      case ColladaPackage.FX_NEWPARAM_COMMON__ANNOTATE:
        getAnnotate().clear();
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SEMANTIC:
        setSemantic(SEMANTIC_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__MODIFIER:
        unsetModifier();
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL:
        unsetBool();
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL2:
        setBool2(BOOL2_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL3:
        setBool3(BOOL3_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL4:
        setBool4(BOOL4_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__INT:
        unsetInt();
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__INT2:
        setInt2(INT2_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__INT3:
        setInt3(INT3_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__INT4:
        setInt4(INT4_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT:
        unsetFloat();
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2:
        setFloat2(FLOAT2_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3:
        setFloat3(FLOAT3_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4:
        setFloat4(FLOAT4_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X1:
        unsetFloat1x1();
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X2:
        setFloat1x2(FLOAT1X2_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X3:
        setFloat1x3(FLOAT1X3_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X4:
        setFloat1x4(FLOAT1X4_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X1:
        setFloat2x1(FLOAT2X1_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X2:
        setFloat2x2(FLOAT2X2_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X3:
        setFloat2x3(FLOAT2X3_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X4:
        setFloat2x4(FLOAT2X4_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X1:
        setFloat3x1(FLOAT3X1_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X2:
        setFloat3x2(FLOAT3X2_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X3:
        setFloat3x3(FLOAT3X3_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X4:
        setFloat3x4(FLOAT3X4_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X1:
        setFloat4x1(FLOAT4X1_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X2:
        setFloat4x2(FLOAT4X2_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X3:
        setFloat4x3(FLOAT4X3_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X4:
        setFloat4x4(FLOAT4X4_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SURFACE:
        setSurface((FxSurfaceCommon)null);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER1_D:
        setSampler1D((FxSampler1DCommon)null);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER2_D:
        setSampler2D((FxSampler2DCommon)null);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER3_D:
        setSampler3D((FxSampler3DCommon)null);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_CUBE:
        setSamplerCUBE((FxSamplerCUBECommon)null);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_RECT:
        setSamplerRECT((FxSamplerRECTCommon)null);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_DEPTH:
        setSamplerDEPTH((FxSamplerDEPTHCommon)null);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__ENUM:
        setEnum(ENUM_EDEFAULT);
        return;
      case ColladaPackage.FX_NEWPARAM_COMMON__SID:
        setSid(SID_EDEFAULT);
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
      case ColladaPackage.FX_NEWPARAM_COMMON__ANNOTATE:
        return annotate != null && !annotate.isEmpty();
      case ColladaPackage.FX_NEWPARAM_COMMON__SEMANTIC:
        return SEMANTIC_EDEFAULT == null ? semantic != null : !SEMANTIC_EDEFAULT.equals(semantic);
      case ColladaPackage.FX_NEWPARAM_COMMON__MODIFIER:
        return isSetModifier();
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL:
        return isSetBool();
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL2:
        return BOOL2_EDEFAULT == null ? bool2 != null : !BOOL2_EDEFAULT.equals(bool2);
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL3:
        return BOOL3_EDEFAULT == null ? bool3 != null : !BOOL3_EDEFAULT.equals(bool3);
      case ColladaPackage.FX_NEWPARAM_COMMON__BOOL4:
        return BOOL4_EDEFAULT == null ? bool4 != null : !BOOL4_EDEFAULT.equals(bool4);
      case ColladaPackage.FX_NEWPARAM_COMMON__INT:
        return isSetInt();
      case ColladaPackage.FX_NEWPARAM_COMMON__INT2:
        return INT2_EDEFAULT == null ? int2 != null : !INT2_EDEFAULT.equals(int2);
      case ColladaPackage.FX_NEWPARAM_COMMON__INT3:
        return INT3_EDEFAULT == null ? int3 != null : !INT3_EDEFAULT.equals(int3);
      case ColladaPackage.FX_NEWPARAM_COMMON__INT4:
        return INT4_EDEFAULT == null ? int4 != null : !INT4_EDEFAULT.equals(int4);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT:
        return isSetFloat();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2:
        return FLOAT2_EDEFAULT == null ? float2 != null : !FLOAT2_EDEFAULT.equals(float2);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3:
        return FLOAT3_EDEFAULT == null ? float3 != null : !FLOAT3_EDEFAULT.equals(float3);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4:
        return FLOAT4_EDEFAULT == null ? float4 != null : !FLOAT4_EDEFAULT.equals(float4);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X1:
        return isSetFloat1x1();
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X2:
        return FLOAT1X2_EDEFAULT == null ? float1x2 != null : !FLOAT1X2_EDEFAULT.equals(float1x2);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X3:
        return FLOAT1X3_EDEFAULT == null ? float1x3 != null : !FLOAT1X3_EDEFAULT.equals(float1x3);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT1X4:
        return FLOAT1X4_EDEFAULT == null ? float1x4 != null : !FLOAT1X4_EDEFAULT.equals(float1x4);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X1:
        return FLOAT2X1_EDEFAULT == null ? float2x1 != null : !FLOAT2X1_EDEFAULT.equals(float2x1);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X2:
        return FLOAT2X2_EDEFAULT == null ? float2x2 != null : !FLOAT2X2_EDEFAULT.equals(float2x2);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X3:
        return FLOAT2X3_EDEFAULT == null ? float2x3 != null : !FLOAT2X3_EDEFAULT.equals(float2x3);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT2X4:
        return FLOAT2X4_EDEFAULT == null ? float2x4 != null : !FLOAT2X4_EDEFAULT.equals(float2x4);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X1:
        return FLOAT3X1_EDEFAULT == null ? float3x1 != null : !FLOAT3X1_EDEFAULT.equals(float3x1);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X2:
        return FLOAT3X2_EDEFAULT == null ? float3x2 != null : !FLOAT3X2_EDEFAULT.equals(float3x2);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X3:
        return FLOAT3X3_EDEFAULT == null ? float3x3 != null : !FLOAT3X3_EDEFAULT.equals(float3x3);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT3X4:
        return FLOAT3X4_EDEFAULT == null ? float3x4 != null : !FLOAT3X4_EDEFAULT.equals(float3x4);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X1:
        return FLOAT4X1_EDEFAULT == null ? float4x1 != null : !FLOAT4X1_EDEFAULT.equals(float4x1);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X2:
        return FLOAT4X2_EDEFAULT == null ? float4x2 != null : !FLOAT4X2_EDEFAULT.equals(float4x2);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X3:
        return FLOAT4X3_EDEFAULT == null ? float4x3 != null : !FLOAT4X3_EDEFAULT.equals(float4x3);
      case ColladaPackage.FX_NEWPARAM_COMMON__FLOAT4X4:
        return FLOAT4X4_EDEFAULT == null ? float4x4 != null : !FLOAT4X4_EDEFAULT.equals(float4x4);
      case ColladaPackage.FX_NEWPARAM_COMMON__SURFACE:
        return surface != null;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER1_D:
        return sampler1D != null;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER2_D:
        return sampler2D != null;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER3_D:
        return sampler3D != null;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_CUBE:
        return samplerCUBE != null;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_RECT:
        return samplerRECT != null;
      case ColladaPackage.FX_NEWPARAM_COMMON__SAMPLER_DEPTH:
        return samplerDEPTH != null;
      case ColladaPackage.FX_NEWPARAM_COMMON__ENUM:
        return ENUM_EDEFAULT == null ? enum_ != null : !ENUM_EDEFAULT.equals(enum_);
      case ColladaPackage.FX_NEWPARAM_COMMON__SID:
        return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
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
    result.append(" (semantic: ");
    result.append(semantic);
    result.append(", modifier: ");
    if (modifierESet) result.append(modifier); else result.append("<unset>");
    result.append(", bool: ");
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
    result.append(", sid: ");
    result.append(sid);
    result.append(')');
    return result.toString();
  }

} //FxNewparamCommonImpl
