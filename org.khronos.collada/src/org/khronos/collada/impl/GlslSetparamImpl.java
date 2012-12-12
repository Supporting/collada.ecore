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
import org.khronos.collada.GlSampler1D;
import org.khronos.collada.GlSampler2D;
import org.khronos.collada.GlSampler3D;
import org.khronos.collada.GlSamplerCUBE;
import org.khronos.collada.GlSamplerDEPTH;
import org.khronos.collada.GlSamplerRECT;
import org.khronos.collada.GlslSetarrayType;
import org.khronos.collada.GlslSetparam;
import org.khronos.collada.GlslSurfaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glsl Setparam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#isBool <em>Bool</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getBool2 <em>Bool2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getBool3 <em>Bool3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getBool4 <em>Bool4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getFloat2x2 <em>Float2x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getFloat3x3 <em>Float3x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getInt2 <em>Int2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getInt3 <em>Int3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getSampler1D <em>Sampler1 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getSampler2D <em>Sampler2 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getSampler3D <em>Sampler3 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getSamplerCUBE <em>Sampler CUBE</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getSamplerRECT <em>Sampler RECT</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getSamplerDEPTH <em>Sampler DEPTH</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getArray <em>Array</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlslSetparamImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlslSetparamImpl extends EObjectImpl implements GlslSetparam {
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
   * The default value of the '{@link #getFloat() <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat()
   * @generated
   * @ordered
   */
	protected static final float FLOAT_EDEFAULT = 0.0F;

	/**
   * The cached value of the '{@link #getFloat() <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat()
   * @generated
   * @ordered
   */
	protected float float_ = FLOAT_EDEFAULT;

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
	protected static final List<Float> FLOAT2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat2() <em>Float2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2()
   * @generated
   * @ordered
   */
	protected List<Float> float2 = FLOAT2_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat3() <em>Float3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat3() <em>Float3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3()
   * @generated
   * @ordered
   */
	protected List<Float> float3 = FLOAT3_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat4() <em>Float4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat4() <em>Float4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4()
   * @generated
   * @ordered
   */
	protected List<Float> float4 = FLOAT4_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat2x2() <em>Float2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x2()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT2X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat2x2() <em>Float2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x2()
   * @generated
   * @ordered
   */
	protected List<Float> float2x2 = FLOAT2X2_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat3x3() <em>Float3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x3()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT3X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat3x3() <em>Float3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x3()
   * @generated
   * @ordered
   */
	protected List<Float> float3x3 = FLOAT3X3_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat4x4() <em>Float4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x4()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT4X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat4x4() <em>Float4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x4()
   * @generated
   * @ordered
   */
	protected List<Float> float4x4 = FLOAT4X4_EDEFAULT;

	/**
   * The default value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
	protected static final int INT_EDEFAULT = 0;

	/**
   * The cached value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
	protected int int_ = INT_EDEFAULT;

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
	protected static final List<Integer> INT2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt2() <em>Int2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt2()
   * @generated
   * @ordered
   */
	protected List<Integer> int2 = INT2_EDEFAULT;

	/**
   * The default value of the '{@link #getInt3() <em>Int3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt3()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt3() <em>Int3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt3()
   * @generated
   * @ordered
   */
	protected List<Integer> int3 = INT3_EDEFAULT;

	/**
   * The default value of the '{@link #getInt4() <em>Int4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt4()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt4() <em>Int4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt4()
   * @generated
   * @ordered
   */
	protected List<Integer> int4 = INT4_EDEFAULT;

	/**
   * The cached value of the '{@link #getSurface() <em>Surface</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSurface()
   * @generated
   * @ordered
   */
	protected GlslSurfaceType surface;

	/**
   * The cached value of the '{@link #getSampler1D() <em>Sampler1 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSampler1D()
   * @generated
   * @ordered
   */
	protected GlSampler1D sampler1D;

	/**
   * The cached value of the '{@link #getSampler2D() <em>Sampler2 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSampler2D()
   * @generated
   * @ordered
   */
	protected GlSampler2D sampler2D;

	/**
   * The cached value of the '{@link #getSampler3D() <em>Sampler3 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSampler3D()
   * @generated
   * @ordered
   */
	protected GlSampler3D sampler3D;

	/**
   * The cached value of the '{@link #getSamplerCUBE() <em>Sampler CUBE</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSamplerCUBE()
   * @generated
   * @ordered
   */
	protected GlSamplerCUBE samplerCUBE;

	/**
   * The cached value of the '{@link #getSamplerRECT() <em>Sampler RECT</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSamplerRECT()
   * @generated
   * @ordered
   */
	protected GlSamplerRECT samplerRECT;

	/**
   * The cached value of the '{@link #getSamplerDEPTH() <em>Sampler DEPTH</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSamplerDEPTH()
   * @generated
   * @ordered
   */
	protected GlSamplerDEPTH samplerDEPTH;

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
   * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
	protected GlslSetarrayType array;

	/**
   * The default value of the '{@link #getProgram() <em>Program</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProgram()
   * @generated
   * @ordered
   */
	protected static final String PROGRAM_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getProgram() <em>Program</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProgram()
   * @generated
   * @ordered
   */
	protected String program = PROGRAM_EDEFAULT;

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
	protected GlslSetparamImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getGlslSetparam();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxAnnotateCommon> getAnnotate() {
    if (annotate == null)
    {
      annotate = new EObjectContainmentEList<FxAnnotateCommon>(FxAnnotateCommon.class, this, ColladaPackage.GLSL_SETPARAM__ANNOTATE);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__BOOL, oldBool, bool, !oldBoolESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.GLSL_SETPARAM__BOOL, oldBool, BOOL_EDEFAULT, oldBoolESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__BOOL2, oldBool2, bool2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__BOOL3, oldBool3, bool3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__BOOL4, oldBool4, bool4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public float getFloat() {
    return float_;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat(float newFloat) {
    float oldFloat = float_;
    float_ = newFloat;
    boolean oldFloatESet = floatESet;
    floatESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__FLOAT, oldFloat, float_, !oldFloatESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetFloat() {
    float oldFloat = float_;
    boolean oldFloatESet = floatESet;
    float_ = FLOAT_EDEFAULT;
    floatESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.GLSL_SETPARAM__FLOAT, oldFloat, FLOAT_EDEFAULT, oldFloatESet));
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
	public List<Float> getFloat2() {
    return float2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat2(List<Float> newFloat2) {
    List<Float> oldFloat2 = float2;
    float2 = newFloat2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__FLOAT2, oldFloat2, float2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat3() {
    return float3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat3(List<Float> newFloat3) {
    List<Float> oldFloat3 = float3;
    float3 = newFloat3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__FLOAT3, oldFloat3, float3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat4() {
    return float4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat4(List<Float> newFloat4) {
    List<Float> oldFloat4 = float4;
    float4 = newFloat4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__FLOAT4, oldFloat4, float4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat2x2() {
    return float2x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat2x2(List<Float> newFloat2x2) {
    List<Float> oldFloat2x2 = float2x2;
    float2x2 = newFloat2x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__FLOAT2X2, oldFloat2x2, float2x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat3x3() {
    return float3x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat3x3(List<Float> newFloat3x3) {
    List<Float> oldFloat3x3 = float3x3;
    float3x3 = newFloat3x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__FLOAT3X3, oldFloat3x3, float3x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat4x4() {
    return float4x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat4x4(List<Float> newFloat4x4) {
    List<Float> oldFloat4x4 = float4x4;
    float4x4 = newFloat4x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__FLOAT4X4, oldFloat4x4, float4x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getInt() {
    return int_;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt(int newInt) {
    int oldInt = int_;
    int_ = newInt;
    boolean oldIntESet = intESet;
    intESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__INT, oldInt, int_, !oldIntESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetInt() {
    int oldInt = int_;
    boolean oldIntESet = intESet;
    int_ = INT_EDEFAULT;
    intESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.GLSL_SETPARAM__INT, oldInt, INT_EDEFAULT, oldIntESet));
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
	public List<Integer> getInt2() {
    return int2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt2(List<Integer> newInt2) {
    List<Integer> oldInt2 = int2;
    int2 = newInt2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__INT2, oldInt2, int2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt3() {
    return int3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt3(List<Integer> newInt3) {
    List<Integer> oldInt3 = int3;
    int3 = newInt3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__INT3, oldInt3, int3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt4() {
    return int4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt4(List<Integer> newInt4) {
    List<Integer> oldInt4 = int4;
    int4 = newInt4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__INT4, oldInt4, int4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlslSurfaceType getSurface() {
    return surface;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSurface(GlslSurfaceType newSurface, NotificationChain msgs) {
    GlslSurfaceType oldSurface = surface;
    surface = newSurface;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__SURFACE, oldSurface, newSurface);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSurface(GlslSurfaceType newSurface) {
    if (newSurface != surface)
    {
      NotificationChain msgs = null;
      if (surface != null)
        msgs = ((InternalEObject)surface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__SURFACE, null, msgs);
      if (newSurface != null)
        msgs = ((InternalEObject)newSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__SURFACE, null, msgs);
      msgs = basicSetSurface(newSurface, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__SURFACE, newSurface, newSurface));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlSampler1D getSampler1D() {
    return sampler1D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSampler1D(GlSampler1D newSampler1D, NotificationChain msgs) {
    GlSampler1D oldSampler1D = sampler1D;
    sampler1D = newSampler1D;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__SAMPLER1_D, oldSampler1D, newSampler1D);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSampler1D(GlSampler1D newSampler1D) {
    if (newSampler1D != sampler1D)
    {
      NotificationChain msgs = null;
      if (sampler1D != null)
        msgs = ((InternalEObject)sampler1D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__SAMPLER1_D, null, msgs);
      if (newSampler1D != null)
        msgs = ((InternalEObject)newSampler1D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__SAMPLER1_D, null, msgs);
      msgs = basicSetSampler1D(newSampler1D, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__SAMPLER1_D, newSampler1D, newSampler1D));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlSampler2D getSampler2D() {
    return sampler2D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSampler2D(GlSampler2D newSampler2D, NotificationChain msgs) {
    GlSampler2D oldSampler2D = sampler2D;
    sampler2D = newSampler2D;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__SAMPLER2_D, oldSampler2D, newSampler2D);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSampler2D(GlSampler2D newSampler2D) {
    if (newSampler2D != sampler2D)
    {
      NotificationChain msgs = null;
      if (sampler2D != null)
        msgs = ((InternalEObject)sampler2D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__SAMPLER2_D, null, msgs);
      if (newSampler2D != null)
        msgs = ((InternalEObject)newSampler2D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__SAMPLER2_D, null, msgs);
      msgs = basicSetSampler2D(newSampler2D, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__SAMPLER2_D, newSampler2D, newSampler2D));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlSampler3D getSampler3D() {
    return sampler3D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSampler3D(GlSampler3D newSampler3D, NotificationChain msgs) {
    GlSampler3D oldSampler3D = sampler3D;
    sampler3D = newSampler3D;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__SAMPLER3_D, oldSampler3D, newSampler3D);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSampler3D(GlSampler3D newSampler3D) {
    if (newSampler3D != sampler3D)
    {
      NotificationChain msgs = null;
      if (sampler3D != null)
        msgs = ((InternalEObject)sampler3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__SAMPLER3_D, null, msgs);
      if (newSampler3D != null)
        msgs = ((InternalEObject)newSampler3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__SAMPLER3_D, null, msgs);
      msgs = basicSetSampler3D(newSampler3D, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__SAMPLER3_D, newSampler3D, newSampler3D));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlSamplerCUBE getSamplerCUBE() {
    return samplerCUBE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSamplerCUBE(GlSamplerCUBE newSamplerCUBE, NotificationChain msgs) {
    GlSamplerCUBE oldSamplerCUBE = samplerCUBE;
    samplerCUBE = newSamplerCUBE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__SAMPLER_CUBE, oldSamplerCUBE, newSamplerCUBE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSamplerCUBE(GlSamplerCUBE newSamplerCUBE) {
    if (newSamplerCUBE != samplerCUBE)
    {
      NotificationChain msgs = null;
      if (samplerCUBE != null)
        msgs = ((InternalEObject)samplerCUBE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__SAMPLER_CUBE, null, msgs);
      if (newSamplerCUBE != null)
        msgs = ((InternalEObject)newSamplerCUBE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__SAMPLER_CUBE, null, msgs);
      msgs = basicSetSamplerCUBE(newSamplerCUBE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__SAMPLER_CUBE, newSamplerCUBE, newSamplerCUBE));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlSamplerRECT getSamplerRECT() {
    return samplerRECT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSamplerRECT(GlSamplerRECT newSamplerRECT, NotificationChain msgs) {
    GlSamplerRECT oldSamplerRECT = samplerRECT;
    samplerRECT = newSamplerRECT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__SAMPLER_RECT, oldSamplerRECT, newSamplerRECT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSamplerRECT(GlSamplerRECT newSamplerRECT) {
    if (newSamplerRECT != samplerRECT)
    {
      NotificationChain msgs = null;
      if (samplerRECT != null)
        msgs = ((InternalEObject)samplerRECT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__SAMPLER_RECT, null, msgs);
      if (newSamplerRECT != null)
        msgs = ((InternalEObject)newSamplerRECT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__SAMPLER_RECT, null, msgs);
      msgs = basicSetSamplerRECT(newSamplerRECT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__SAMPLER_RECT, newSamplerRECT, newSamplerRECT));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlSamplerDEPTH getSamplerDEPTH() {
    return samplerDEPTH;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSamplerDEPTH(GlSamplerDEPTH newSamplerDEPTH, NotificationChain msgs) {
    GlSamplerDEPTH oldSamplerDEPTH = samplerDEPTH;
    samplerDEPTH = newSamplerDEPTH;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__SAMPLER_DEPTH, oldSamplerDEPTH, newSamplerDEPTH);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSamplerDEPTH(GlSamplerDEPTH newSamplerDEPTH) {
    if (newSamplerDEPTH != samplerDEPTH)
    {
      NotificationChain msgs = null;
      if (samplerDEPTH != null)
        msgs = ((InternalEObject)samplerDEPTH).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__SAMPLER_DEPTH, null, msgs);
      if (newSamplerDEPTH != null)
        msgs = ((InternalEObject)newSamplerDEPTH).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__SAMPLER_DEPTH, null, msgs);
      msgs = basicSetSamplerDEPTH(newSamplerDEPTH, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__SAMPLER_DEPTH, newSamplerDEPTH, newSamplerDEPTH));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__ENUM, oldEnum, enum_));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlslSetarrayType getArray() {
    return array;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetArray(GlslSetarrayType newArray, NotificationChain msgs) {
    GlslSetarrayType oldArray = array;
    array = newArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__ARRAY, oldArray, newArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setArray(GlslSetarrayType newArray) {
    if (newArray != array)
    {
      NotificationChain msgs = null;
      if (array != null)
        msgs = ((InternalEObject)array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__ARRAY, null, msgs);
      if (newArray != null)
        msgs = ((InternalEObject)newArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SETPARAM__ARRAY, null, msgs);
      msgs = basicSetArray(newArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__ARRAY, newArray, newArray));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getProgram() {
    return program;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setProgram(String newProgram) {
    String oldProgram = program;
    program = newProgram;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__PROGRAM, oldProgram, program));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SETPARAM__REF, oldRef, ref));
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
      case ColladaPackage.GLSL_SETPARAM__ANNOTATE:
        return ((InternalEList<?>)getAnnotate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GLSL_SETPARAM__SURFACE:
        return basicSetSurface(null, msgs);
      case ColladaPackage.GLSL_SETPARAM__SAMPLER1_D:
        return basicSetSampler1D(null, msgs);
      case ColladaPackage.GLSL_SETPARAM__SAMPLER2_D:
        return basicSetSampler2D(null, msgs);
      case ColladaPackage.GLSL_SETPARAM__SAMPLER3_D:
        return basicSetSampler3D(null, msgs);
      case ColladaPackage.GLSL_SETPARAM__SAMPLER_CUBE:
        return basicSetSamplerCUBE(null, msgs);
      case ColladaPackage.GLSL_SETPARAM__SAMPLER_RECT:
        return basicSetSamplerRECT(null, msgs);
      case ColladaPackage.GLSL_SETPARAM__SAMPLER_DEPTH:
        return basicSetSamplerDEPTH(null, msgs);
      case ColladaPackage.GLSL_SETPARAM__ARRAY:
        return basicSetArray(null, msgs);
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
      case ColladaPackage.GLSL_SETPARAM__ANNOTATE:
        return getAnnotate();
      case ColladaPackage.GLSL_SETPARAM__BOOL:
        return isBool();
      case ColladaPackage.GLSL_SETPARAM__BOOL2:
        return getBool2();
      case ColladaPackage.GLSL_SETPARAM__BOOL3:
        return getBool3();
      case ColladaPackage.GLSL_SETPARAM__BOOL4:
        return getBool4();
      case ColladaPackage.GLSL_SETPARAM__FLOAT:
        return getFloat();
      case ColladaPackage.GLSL_SETPARAM__FLOAT2:
        return getFloat2();
      case ColladaPackage.GLSL_SETPARAM__FLOAT3:
        return getFloat3();
      case ColladaPackage.GLSL_SETPARAM__FLOAT4:
        return getFloat4();
      case ColladaPackage.GLSL_SETPARAM__FLOAT2X2:
        return getFloat2x2();
      case ColladaPackage.GLSL_SETPARAM__FLOAT3X3:
        return getFloat3x3();
      case ColladaPackage.GLSL_SETPARAM__FLOAT4X4:
        return getFloat4x4();
      case ColladaPackage.GLSL_SETPARAM__INT:
        return getInt();
      case ColladaPackage.GLSL_SETPARAM__INT2:
        return getInt2();
      case ColladaPackage.GLSL_SETPARAM__INT3:
        return getInt3();
      case ColladaPackage.GLSL_SETPARAM__INT4:
        return getInt4();
      case ColladaPackage.GLSL_SETPARAM__SURFACE:
        return getSurface();
      case ColladaPackage.GLSL_SETPARAM__SAMPLER1_D:
        return getSampler1D();
      case ColladaPackage.GLSL_SETPARAM__SAMPLER2_D:
        return getSampler2D();
      case ColladaPackage.GLSL_SETPARAM__SAMPLER3_D:
        return getSampler3D();
      case ColladaPackage.GLSL_SETPARAM__SAMPLER_CUBE:
        return getSamplerCUBE();
      case ColladaPackage.GLSL_SETPARAM__SAMPLER_RECT:
        return getSamplerRECT();
      case ColladaPackage.GLSL_SETPARAM__SAMPLER_DEPTH:
        return getSamplerDEPTH();
      case ColladaPackage.GLSL_SETPARAM__ENUM:
        return getEnum();
      case ColladaPackage.GLSL_SETPARAM__ARRAY:
        return getArray();
      case ColladaPackage.GLSL_SETPARAM__PROGRAM:
        return getProgram();
      case ColladaPackage.GLSL_SETPARAM__REF:
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
      case ColladaPackage.GLSL_SETPARAM__ANNOTATE:
        getAnnotate().clear();
        getAnnotate().addAll((Collection<? extends FxAnnotateCommon>)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__BOOL:
        setBool((Boolean)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__BOOL2:
        setBool2((List<Boolean>)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__BOOL3:
        setBool3((List<Boolean>)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__BOOL4:
        setBool4((List<Boolean>)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__FLOAT:
        setFloat((Float)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__FLOAT2:
        setFloat2((List<Float>)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__FLOAT3:
        setFloat3((List<Float>)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__FLOAT4:
        setFloat4((List<Float>)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__FLOAT2X2:
        setFloat2x2((List<Float>)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__FLOAT3X3:
        setFloat3x3((List<Float>)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__FLOAT4X4:
        setFloat4x4((List<Float>)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__INT:
        setInt((Integer)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__INT2:
        setInt2((List<Integer>)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__INT3:
        setInt3((List<Integer>)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__INT4:
        setInt4((List<Integer>)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__SURFACE:
        setSurface((GlslSurfaceType)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER1_D:
        setSampler1D((GlSampler1D)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER2_D:
        setSampler2D((GlSampler2D)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER3_D:
        setSampler3D((GlSampler3D)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER_CUBE:
        setSamplerCUBE((GlSamplerCUBE)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER_RECT:
        setSamplerRECT((GlSamplerRECT)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER_DEPTH:
        setSamplerDEPTH((GlSamplerDEPTH)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__ENUM:
        setEnum((Enumerator)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__ARRAY:
        setArray((GlslSetarrayType)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__PROGRAM:
        setProgram((String)newValue);
        return;
      case ColladaPackage.GLSL_SETPARAM__REF:
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
      case ColladaPackage.GLSL_SETPARAM__ANNOTATE:
        getAnnotate().clear();
        return;
      case ColladaPackage.GLSL_SETPARAM__BOOL:
        unsetBool();
        return;
      case ColladaPackage.GLSL_SETPARAM__BOOL2:
        setBool2(BOOL2_EDEFAULT);
        return;
      case ColladaPackage.GLSL_SETPARAM__BOOL3:
        setBool3(BOOL3_EDEFAULT);
        return;
      case ColladaPackage.GLSL_SETPARAM__BOOL4:
        setBool4(BOOL4_EDEFAULT);
        return;
      case ColladaPackage.GLSL_SETPARAM__FLOAT:
        unsetFloat();
        return;
      case ColladaPackage.GLSL_SETPARAM__FLOAT2:
        setFloat2(FLOAT2_EDEFAULT);
        return;
      case ColladaPackage.GLSL_SETPARAM__FLOAT3:
        setFloat3(FLOAT3_EDEFAULT);
        return;
      case ColladaPackage.GLSL_SETPARAM__FLOAT4:
        setFloat4(FLOAT4_EDEFAULT);
        return;
      case ColladaPackage.GLSL_SETPARAM__FLOAT2X2:
        setFloat2x2(FLOAT2X2_EDEFAULT);
        return;
      case ColladaPackage.GLSL_SETPARAM__FLOAT3X3:
        setFloat3x3(FLOAT3X3_EDEFAULT);
        return;
      case ColladaPackage.GLSL_SETPARAM__FLOAT4X4:
        setFloat4x4(FLOAT4X4_EDEFAULT);
        return;
      case ColladaPackage.GLSL_SETPARAM__INT:
        unsetInt();
        return;
      case ColladaPackage.GLSL_SETPARAM__INT2:
        setInt2(INT2_EDEFAULT);
        return;
      case ColladaPackage.GLSL_SETPARAM__INT3:
        setInt3(INT3_EDEFAULT);
        return;
      case ColladaPackage.GLSL_SETPARAM__INT4:
        setInt4(INT4_EDEFAULT);
        return;
      case ColladaPackage.GLSL_SETPARAM__SURFACE:
        setSurface((GlslSurfaceType)null);
        return;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER1_D:
        setSampler1D((GlSampler1D)null);
        return;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER2_D:
        setSampler2D((GlSampler2D)null);
        return;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER3_D:
        setSampler3D((GlSampler3D)null);
        return;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER_CUBE:
        setSamplerCUBE((GlSamplerCUBE)null);
        return;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER_RECT:
        setSamplerRECT((GlSamplerRECT)null);
        return;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER_DEPTH:
        setSamplerDEPTH((GlSamplerDEPTH)null);
        return;
      case ColladaPackage.GLSL_SETPARAM__ENUM:
        setEnum(ENUM_EDEFAULT);
        return;
      case ColladaPackage.GLSL_SETPARAM__ARRAY:
        setArray((GlslSetarrayType)null);
        return;
      case ColladaPackage.GLSL_SETPARAM__PROGRAM:
        setProgram(PROGRAM_EDEFAULT);
        return;
      case ColladaPackage.GLSL_SETPARAM__REF:
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
      case ColladaPackage.GLSL_SETPARAM__ANNOTATE:
        return annotate != null && !annotate.isEmpty();
      case ColladaPackage.GLSL_SETPARAM__BOOL:
        return isSetBool();
      case ColladaPackage.GLSL_SETPARAM__BOOL2:
        return BOOL2_EDEFAULT == null ? bool2 != null : !BOOL2_EDEFAULT.equals(bool2);
      case ColladaPackage.GLSL_SETPARAM__BOOL3:
        return BOOL3_EDEFAULT == null ? bool3 != null : !BOOL3_EDEFAULT.equals(bool3);
      case ColladaPackage.GLSL_SETPARAM__BOOL4:
        return BOOL4_EDEFAULT == null ? bool4 != null : !BOOL4_EDEFAULT.equals(bool4);
      case ColladaPackage.GLSL_SETPARAM__FLOAT:
        return isSetFloat();
      case ColladaPackage.GLSL_SETPARAM__FLOAT2:
        return FLOAT2_EDEFAULT == null ? float2 != null : !FLOAT2_EDEFAULT.equals(float2);
      case ColladaPackage.GLSL_SETPARAM__FLOAT3:
        return FLOAT3_EDEFAULT == null ? float3 != null : !FLOAT3_EDEFAULT.equals(float3);
      case ColladaPackage.GLSL_SETPARAM__FLOAT4:
        return FLOAT4_EDEFAULT == null ? float4 != null : !FLOAT4_EDEFAULT.equals(float4);
      case ColladaPackage.GLSL_SETPARAM__FLOAT2X2:
        return FLOAT2X2_EDEFAULT == null ? float2x2 != null : !FLOAT2X2_EDEFAULT.equals(float2x2);
      case ColladaPackage.GLSL_SETPARAM__FLOAT3X3:
        return FLOAT3X3_EDEFAULT == null ? float3x3 != null : !FLOAT3X3_EDEFAULT.equals(float3x3);
      case ColladaPackage.GLSL_SETPARAM__FLOAT4X4:
        return FLOAT4X4_EDEFAULT == null ? float4x4 != null : !FLOAT4X4_EDEFAULT.equals(float4x4);
      case ColladaPackage.GLSL_SETPARAM__INT:
        return isSetInt();
      case ColladaPackage.GLSL_SETPARAM__INT2:
        return INT2_EDEFAULT == null ? int2 != null : !INT2_EDEFAULT.equals(int2);
      case ColladaPackage.GLSL_SETPARAM__INT3:
        return INT3_EDEFAULT == null ? int3 != null : !INT3_EDEFAULT.equals(int3);
      case ColladaPackage.GLSL_SETPARAM__INT4:
        return INT4_EDEFAULT == null ? int4 != null : !INT4_EDEFAULT.equals(int4);
      case ColladaPackage.GLSL_SETPARAM__SURFACE:
        return surface != null;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER1_D:
        return sampler1D != null;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER2_D:
        return sampler2D != null;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER3_D:
        return sampler3D != null;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER_CUBE:
        return samplerCUBE != null;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER_RECT:
        return samplerRECT != null;
      case ColladaPackage.GLSL_SETPARAM__SAMPLER_DEPTH:
        return samplerDEPTH != null;
      case ColladaPackage.GLSL_SETPARAM__ENUM:
        return ENUM_EDEFAULT == null ? enum_ != null : !ENUM_EDEFAULT.equals(enum_);
      case ColladaPackage.GLSL_SETPARAM__ARRAY:
        return array != null;
      case ColladaPackage.GLSL_SETPARAM__PROGRAM:
        return PROGRAM_EDEFAULT == null ? program != null : !PROGRAM_EDEFAULT.equals(program);
      case ColladaPackage.GLSL_SETPARAM__REF:
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
    result.append(", float: ");
    if (floatESet) result.append(float_); else result.append("<unset>");
    result.append(", float2: ");
    result.append(float2);
    result.append(", float3: ");
    result.append(float3);
    result.append(", float4: ");
    result.append(float4);
    result.append(", float2x2: ");
    result.append(float2x2);
    result.append(", float3x3: ");
    result.append(float3x3);
    result.append(", float4x4: ");
    result.append(float4x4);
    result.append(", int: ");
    if (intESet) result.append(int_); else result.append("<unset>");
    result.append(", int2: ");
    result.append(int2);
    result.append(", int3: ");
    result.append(int3);
    result.append(", int4: ");
    result.append(int4);
    result.append(", enum: ");
    result.append(enum_);
    result.append(", program: ");
    result.append(program);
    result.append(", ref: ");
    result.append(ref);
    result.append(')');
    return result.toString();
  }

} //GlslSetparamImpl
