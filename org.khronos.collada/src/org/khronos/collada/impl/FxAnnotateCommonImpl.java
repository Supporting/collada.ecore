/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.FxAnnotateCommon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fx Annotate Common</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#isBool <em>Bool</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getBool2 <em>Bool2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getBool3 <em>Bool3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getBool4 <em>Bool4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getInt2 <em>Int2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getInt3 <em>Int3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getFloat2x2 <em>Float2x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getFloat3x3 <em>Float3x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getString <em>String</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxAnnotateCommonImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FxAnnotateCommonImpl extends EObjectImpl implements FxAnnotateCommon {
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
   * The default value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
	protected static final String STRING_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
	protected String string = STRING_EDEFAULT;

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
	protected FxAnnotateCommonImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getFxAnnotateCommon();
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__BOOL, oldBool, bool, !oldBoolESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_ANNOTATE_COMMON__BOOL, oldBool, BOOL_EDEFAULT, oldBoolESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__BOOL2, oldBool2, bool2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__BOOL3, oldBool3, bool3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__BOOL4, oldBool4, bool4));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__INT, oldInt, int_, !oldIntESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_ANNOTATE_COMMON__INT, oldInt, INT_EDEFAULT, oldIntESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__INT2, oldInt2, int2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__INT3, oldInt3, int3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__INT4, oldInt4, int4));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__FLOAT, oldFloat, float_, !oldFloatESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_ANNOTATE_COMMON__FLOAT, oldFloat, FLOAT_EDEFAULT, oldFloatESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__FLOAT2, oldFloat2, float2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__FLOAT3, oldFloat3, float3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__FLOAT4, oldFloat4, float4));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__FLOAT2X2, oldFloat2x2, float2x2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__FLOAT3X3, oldFloat3x3, float3x3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__FLOAT4X4, oldFloat4x4, float4x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getString() {
    return string;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setString(String newString) {
    String oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__STRING, oldString, string));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_ANNOTATE_COMMON__NAME, oldName, name));
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
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL:
        return isBool();
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL2:
        return getBool2();
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL3:
        return getBool3();
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL4:
        return getBool4();
      case ColladaPackage.FX_ANNOTATE_COMMON__INT:
        return getInt();
      case ColladaPackage.FX_ANNOTATE_COMMON__INT2:
        return getInt2();
      case ColladaPackage.FX_ANNOTATE_COMMON__INT3:
        return getInt3();
      case ColladaPackage.FX_ANNOTATE_COMMON__INT4:
        return getInt4();
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT:
        return getFloat();
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT2:
        return getFloat2();
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT3:
        return getFloat3();
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT4:
        return getFloat4();
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT2X2:
        return getFloat2x2();
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT3X3:
        return getFloat3x3();
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT4X4:
        return getFloat4x4();
      case ColladaPackage.FX_ANNOTATE_COMMON__STRING:
        return getString();
      case ColladaPackage.FX_ANNOTATE_COMMON__NAME:
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
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL:
        setBool((Boolean)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL2:
        setBool2((List<Boolean>)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL3:
        setBool3((List<Boolean>)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL4:
        setBool4((List<Boolean>)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__INT:
        setInt((Long)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__INT2:
        setInt2((List<Long>)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__INT3:
        setInt3((List<Long>)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__INT4:
        setInt4((List<Long>)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT:
        setFloat((Double)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT2:
        setFloat2((List<Double>)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT3:
        setFloat3((List<Double>)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT4:
        setFloat4((List<Double>)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT2X2:
        setFloat2x2((List<Double>)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT3X3:
        setFloat3x3((List<Double>)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT4X4:
        setFloat4x4((List<Double>)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__STRING:
        setString((String)newValue);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__NAME:
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
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL:
        unsetBool();
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL2:
        setBool2(BOOL2_EDEFAULT);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL3:
        setBool3(BOOL3_EDEFAULT);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL4:
        setBool4(BOOL4_EDEFAULT);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__INT:
        unsetInt();
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__INT2:
        setInt2(INT2_EDEFAULT);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__INT3:
        setInt3(INT3_EDEFAULT);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__INT4:
        setInt4(INT4_EDEFAULT);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT:
        unsetFloat();
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT2:
        setFloat2(FLOAT2_EDEFAULT);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT3:
        setFloat3(FLOAT3_EDEFAULT);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT4:
        setFloat4(FLOAT4_EDEFAULT);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT2X2:
        setFloat2x2(FLOAT2X2_EDEFAULT);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT3X3:
        setFloat3x3(FLOAT3X3_EDEFAULT);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT4X4:
        setFloat4x4(FLOAT4X4_EDEFAULT);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__STRING:
        setString(STRING_EDEFAULT);
        return;
      case ColladaPackage.FX_ANNOTATE_COMMON__NAME:
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
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL:
        return isSetBool();
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL2:
        return BOOL2_EDEFAULT == null ? bool2 != null : !BOOL2_EDEFAULT.equals(bool2);
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL3:
        return BOOL3_EDEFAULT == null ? bool3 != null : !BOOL3_EDEFAULT.equals(bool3);
      case ColladaPackage.FX_ANNOTATE_COMMON__BOOL4:
        return BOOL4_EDEFAULT == null ? bool4 != null : !BOOL4_EDEFAULT.equals(bool4);
      case ColladaPackage.FX_ANNOTATE_COMMON__INT:
        return isSetInt();
      case ColladaPackage.FX_ANNOTATE_COMMON__INT2:
        return INT2_EDEFAULT == null ? int2 != null : !INT2_EDEFAULT.equals(int2);
      case ColladaPackage.FX_ANNOTATE_COMMON__INT3:
        return INT3_EDEFAULT == null ? int3 != null : !INT3_EDEFAULT.equals(int3);
      case ColladaPackage.FX_ANNOTATE_COMMON__INT4:
        return INT4_EDEFAULT == null ? int4 != null : !INT4_EDEFAULT.equals(int4);
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT:
        return isSetFloat();
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT2:
        return FLOAT2_EDEFAULT == null ? float2 != null : !FLOAT2_EDEFAULT.equals(float2);
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT3:
        return FLOAT3_EDEFAULT == null ? float3 != null : !FLOAT3_EDEFAULT.equals(float3);
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT4:
        return FLOAT4_EDEFAULT == null ? float4 != null : !FLOAT4_EDEFAULT.equals(float4);
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT2X2:
        return FLOAT2X2_EDEFAULT == null ? float2x2 != null : !FLOAT2X2_EDEFAULT.equals(float2x2);
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT3X3:
        return FLOAT3X3_EDEFAULT == null ? float3x3 != null : !FLOAT3X3_EDEFAULT.equals(float3x3);
      case ColladaPackage.FX_ANNOTATE_COMMON__FLOAT4X4:
        return FLOAT4X4_EDEFAULT == null ? float4x4 != null : !FLOAT4X4_EDEFAULT.equals(float4x4);
      case ColladaPackage.FX_ANNOTATE_COMMON__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
      case ColladaPackage.FX_ANNOTATE_COMMON__NAME:
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
    result.append(", float2x2: ");
    result.append(float2x2);
    result.append(", float3x3: ");
    result.append(float3x3);
    result.append(", float4x4: ");
    result.append(float4x4);
    result.append(", string: ");
    result.append(string);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FxAnnotateCommonImpl
