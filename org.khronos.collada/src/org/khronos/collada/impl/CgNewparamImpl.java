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

import org.khronos.collada.CgNewarrayType;
import org.khronos.collada.CgNewparam;
import org.khronos.collada.CgSampler1D;
import org.khronos.collada.CgSampler2D;
import org.khronos.collada.CgSampler3D;
import org.khronos.collada.CgSamplerCUBE;
import org.khronos.collada.CgSamplerDEPTH;
import org.khronos.collada.CgSamplerRECT;
import org.khronos.collada.CgSetuserType;
import org.khronos.collada.CgSurfaceType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.FxAnnotateCommon;
import org.khronos.collada.FxModifierEnumCommon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cg Newparam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#isBool <em>Bool</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#isBool1 <em>Bool1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool2 <em>Bool2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool3 <em>Bool3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool4 <em>Bool4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool1x1 <em>Bool1x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool1x2 <em>Bool1x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool1x3 <em>Bool1x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool1x4 <em>Bool1x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool2x1 <em>Bool2x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool2x2 <em>Bool2x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool2x3 <em>Bool2x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool2x4 <em>Bool2x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool3x1 <em>Bool3x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool3x2 <em>Bool3x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool3x3 <em>Bool3x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool3x4 <em>Bool3x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool4x1 <em>Bool4x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool4x2 <em>Bool4x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool4x3 <em>Bool4x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getBool4x4 <em>Bool4x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat1 <em>Float1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat1x1 <em>Float1x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat1x2 <em>Float1x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat1x3 <em>Float1x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat1x4 <em>Float1x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat2x1 <em>Float2x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat2x2 <em>Float2x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat2x3 <em>Float2x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat2x4 <em>Float2x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat3x1 <em>Float3x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat3x2 <em>Float3x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat3x3 <em>Float3x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat3x4 <em>Float3x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat4x1 <em>Float4x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat4x2 <em>Float4x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat4x3 <em>Float4x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt1 <em>Int1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt2 <em>Int2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt3 <em>Int3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt1x1 <em>Int1x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt1x2 <em>Int1x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt1x3 <em>Int1x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt1x4 <em>Int1x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt2x1 <em>Int2x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt2x2 <em>Int2x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt2x3 <em>Int2x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt2x4 <em>Int2x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt3x1 <em>Int3x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt3x2 <em>Int3x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt3x3 <em>Int3x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt3x4 <em>Int3x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt4x1 <em>Int4x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt4x2 <em>Int4x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt4x3 <em>Int4x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getInt4x4 <em>Int4x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf <em>Half</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf1 <em>Half1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf2 <em>Half2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf3 <em>Half3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf4 <em>Half4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf1x1 <em>Half1x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf1x2 <em>Half1x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf1x3 <em>Half1x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf1x4 <em>Half1x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf2x1 <em>Half2x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf2x2 <em>Half2x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf2x3 <em>Half2x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf2x4 <em>Half2x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf3x1 <em>Half3x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf3x2 <em>Half3x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf3x3 <em>Half3x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf3x4 <em>Half3x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf4x1 <em>Half4x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf4x2 <em>Half4x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf4x3 <em>Half4x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getHalf4x4 <em>Half4x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed1 <em>Fixed1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed2 <em>Fixed2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed3 <em>Fixed3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed4 <em>Fixed4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed1x1 <em>Fixed1x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed1x2 <em>Fixed1x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed1x3 <em>Fixed1x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed1x4 <em>Fixed1x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed2x1 <em>Fixed2x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed2x2 <em>Fixed2x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed2x3 <em>Fixed2x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed2x4 <em>Fixed2x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed3x1 <em>Fixed3x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed3x2 <em>Fixed3x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed3x3 <em>Fixed3x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed3x4 <em>Fixed3x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed4x1 <em>Fixed4x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed4x2 <em>Fixed4x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed4x3 <em>Fixed4x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getFixed4x4 <em>Fixed4x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getSampler1D <em>Sampler1 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getSampler2D <em>Sampler2 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getSampler3D <em>Sampler3 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getSamplerRECT <em>Sampler RECT</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getSamplerCUBE <em>Sampler CUBE</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getSamplerDEPTH <em>Sampler DEPTH</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getString <em>String</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getUsertype <em>Usertype</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getArray <em>Array</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgNewparamImpl#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CgNewparamImpl extends EObjectImpl implements CgNewparam {
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
   * The default value of the '{@link #isBool1() <em>Bool1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isBool1()
   * @generated
   * @ordered
   */
	protected static final boolean BOOL1_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isBool1() <em>Bool1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isBool1()
   * @generated
   * @ordered
   */
	protected boolean bool1 = BOOL1_EDEFAULT;

	/**
   * This is true if the Bool1 attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean bool1ESet;

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
   * The default value of the '{@link #getBool1x1() <em>Bool1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool1x1()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL1X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool1x1() <em>Bool1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool1x1()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool1x1 = BOOL1X1_EDEFAULT;

	/**
   * The default value of the '{@link #getBool1x2() <em>Bool1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool1x2()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL1X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool1x2() <em>Bool1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool1x2()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool1x2 = BOOL1X2_EDEFAULT;

	/**
   * The default value of the '{@link #getBool1x3() <em>Bool1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool1x3()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL1X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool1x3() <em>Bool1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool1x3()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool1x3 = BOOL1X3_EDEFAULT;

	/**
   * The default value of the '{@link #getBool1x4() <em>Bool1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool1x4()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL1X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool1x4() <em>Bool1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool1x4()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool1x4 = BOOL1X4_EDEFAULT;

	/**
   * The default value of the '{@link #getBool2x1() <em>Bool2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool2x1()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL2X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool2x1() <em>Bool2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool2x1()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool2x1 = BOOL2X1_EDEFAULT;

	/**
   * The default value of the '{@link #getBool2x2() <em>Bool2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool2x2()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL2X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool2x2() <em>Bool2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool2x2()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool2x2 = BOOL2X2_EDEFAULT;

	/**
   * The default value of the '{@link #getBool2x3() <em>Bool2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool2x3()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL2X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool2x3() <em>Bool2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool2x3()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool2x3 = BOOL2X3_EDEFAULT;

	/**
   * The default value of the '{@link #getBool2x4() <em>Bool2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool2x4()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL2X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool2x4() <em>Bool2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool2x4()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool2x4 = BOOL2X4_EDEFAULT;

	/**
   * The default value of the '{@link #getBool3x1() <em>Bool3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool3x1()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL3X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool3x1() <em>Bool3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool3x1()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool3x1 = BOOL3X1_EDEFAULT;

	/**
   * The default value of the '{@link #getBool3x2() <em>Bool3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool3x2()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL3X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool3x2() <em>Bool3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool3x2()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool3x2 = BOOL3X2_EDEFAULT;

	/**
   * The default value of the '{@link #getBool3x3() <em>Bool3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool3x3()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL3X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool3x3() <em>Bool3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool3x3()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool3x3 = BOOL3X3_EDEFAULT;

	/**
   * The default value of the '{@link #getBool3x4() <em>Bool3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool3x4()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL3X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool3x4() <em>Bool3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool3x4()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool3x4 = BOOL3X4_EDEFAULT;

	/**
   * The default value of the '{@link #getBool4x1() <em>Bool4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool4x1()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL4X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool4x1() <em>Bool4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool4x1()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool4x1 = BOOL4X1_EDEFAULT;

	/**
   * The default value of the '{@link #getBool4x2() <em>Bool4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool4x2()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL4X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool4x2() <em>Bool4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool4x2()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool4x2 = BOOL4X2_EDEFAULT;

	/**
   * The default value of the '{@link #getBool4x3() <em>Bool4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool4x3()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL4X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool4x3() <em>Bool4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool4x3()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool4x3 = BOOL4X3_EDEFAULT;

	/**
   * The default value of the '{@link #getBool4x4() <em>Bool4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool4x4()
   * @generated
   * @ordered
   */
	protected static final List<Boolean> BOOL4X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBool4x4() <em>Bool4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBool4x4()
   * @generated
   * @ordered
   */
	protected List<Boolean> bool4x4 = BOOL4X4_EDEFAULT;

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
   * The default value of the '{@link #getFloat1() <em>Float1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1()
   * @generated
   * @ordered
   */
	protected static final float FLOAT1_EDEFAULT = 0.0F;

	/**
   * The cached value of the '{@link #getFloat1() <em>Float1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1()
   * @generated
   * @ordered
   */
	protected float float1 = FLOAT1_EDEFAULT;

	/**
   * This is true if the Float1 attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean float1ESet;

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
   * The default value of the '{@link #getFloat1x1() <em>Float1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x1()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT1X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat1x1() <em>Float1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x1()
   * @generated
   * @ordered
   */
	protected List<Float> float1x1 = FLOAT1X1_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat1x2() <em>Float1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x2()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT1X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat1x2() <em>Float1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x2()
   * @generated
   * @ordered
   */
	protected List<Float> float1x2 = FLOAT1X2_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat1x3() <em>Float1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x3()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT1X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat1x3() <em>Float1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x3()
   * @generated
   * @ordered
   */
	protected List<Float> float1x3 = FLOAT1X3_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat1x4() <em>Float1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x4()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT1X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat1x4() <em>Float1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat1x4()
   * @generated
   * @ordered
   */
	protected List<Float> float1x4 = FLOAT1X4_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat2x1() <em>Float2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x1()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT2X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat2x1() <em>Float2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x1()
   * @generated
   * @ordered
   */
	protected List<Float> float2x1 = FLOAT2X1_EDEFAULT;

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
   * The default value of the '{@link #getFloat2x3() <em>Float2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x3()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT2X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat2x3() <em>Float2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x3()
   * @generated
   * @ordered
   */
	protected List<Float> float2x3 = FLOAT2X3_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat2x4() <em>Float2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x4()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT2X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat2x4() <em>Float2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2x4()
   * @generated
   * @ordered
   */
	protected List<Float> float2x4 = FLOAT2X4_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat3x1() <em>Float3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x1()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT3X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat3x1() <em>Float3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x1()
   * @generated
   * @ordered
   */
	protected List<Float> float3x1 = FLOAT3X1_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat3x2() <em>Float3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x2()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT3X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat3x2() <em>Float3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x2()
   * @generated
   * @ordered
   */
	protected List<Float> float3x2 = FLOAT3X2_EDEFAULT;

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
   * The default value of the '{@link #getFloat3x4() <em>Float3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x4()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT3X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat3x4() <em>Float3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3x4()
   * @generated
   * @ordered
   */
	protected List<Float> float3x4 = FLOAT3X4_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat4x1() <em>Float4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x1()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT4X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat4x1() <em>Float4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x1()
   * @generated
   * @ordered
   */
	protected List<Float> float4x1 = FLOAT4X1_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat4x2() <em>Float4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x2()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT4X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat4x2() <em>Float4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x2()
   * @generated
   * @ordered
   */
	protected List<Float> float4x2 = FLOAT4X2_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat4x3() <em>Float4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x3()
   * @generated
   * @ordered
   */
	protected static final List<Float> FLOAT4X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat4x3() <em>Float4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4x3()
   * @generated
   * @ordered
   */
	protected List<Float> float4x3 = FLOAT4X3_EDEFAULT;

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
   * The default value of the '{@link #getInt1() <em>Int1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt1()
   * @generated
   * @ordered
   */
	protected static final int INT1_EDEFAULT = 0;

	/**
   * The cached value of the '{@link #getInt1() <em>Int1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt1()
   * @generated
   * @ordered
   */
	protected int int1 = INT1_EDEFAULT;

	/**
   * This is true if the Int1 attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean int1ESet;

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
   * The default value of the '{@link #getInt1x1() <em>Int1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt1x1()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT1X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt1x1() <em>Int1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt1x1()
   * @generated
   * @ordered
   */
	protected List<Integer> int1x1 = INT1X1_EDEFAULT;

	/**
   * The default value of the '{@link #getInt1x2() <em>Int1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt1x2()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT1X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt1x2() <em>Int1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt1x2()
   * @generated
   * @ordered
   */
	protected List<Integer> int1x2 = INT1X2_EDEFAULT;

	/**
   * The default value of the '{@link #getInt1x3() <em>Int1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt1x3()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT1X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt1x3() <em>Int1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt1x3()
   * @generated
   * @ordered
   */
	protected List<Integer> int1x3 = INT1X3_EDEFAULT;

	/**
   * The default value of the '{@link #getInt1x4() <em>Int1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt1x4()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT1X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt1x4() <em>Int1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt1x4()
   * @generated
   * @ordered
   */
	protected List<Integer> int1x4 = INT1X4_EDEFAULT;

	/**
   * The default value of the '{@link #getInt2x1() <em>Int2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt2x1()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT2X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt2x1() <em>Int2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt2x1()
   * @generated
   * @ordered
   */
	protected List<Integer> int2x1 = INT2X1_EDEFAULT;

	/**
   * The default value of the '{@link #getInt2x2() <em>Int2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt2x2()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT2X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt2x2() <em>Int2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt2x2()
   * @generated
   * @ordered
   */
	protected List<Integer> int2x2 = INT2X2_EDEFAULT;

	/**
   * The default value of the '{@link #getInt2x3() <em>Int2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt2x3()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT2X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt2x3() <em>Int2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt2x3()
   * @generated
   * @ordered
   */
	protected List<Integer> int2x3 = INT2X3_EDEFAULT;

	/**
   * The default value of the '{@link #getInt2x4() <em>Int2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt2x4()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT2X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt2x4() <em>Int2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt2x4()
   * @generated
   * @ordered
   */
	protected List<Integer> int2x4 = INT2X4_EDEFAULT;

	/**
   * The default value of the '{@link #getInt3x1() <em>Int3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt3x1()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT3X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt3x1() <em>Int3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt3x1()
   * @generated
   * @ordered
   */
	protected List<Integer> int3x1 = INT3X1_EDEFAULT;

	/**
   * The default value of the '{@link #getInt3x2() <em>Int3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt3x2()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT3X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt3x2() <em>Int3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt3x2()
   * @generated
   * @ordered
   */
	protected List<Integer> int3x2 = INT3X2_EDEFAULT;

	/**
   * The default value of the '{@link #getInt3x3() <em>Int3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt3x3()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT3X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt3x3() <em>Int3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt3x3()
   * @generated
   * @ordered
   */
	protected List<Integer> int3x3 = INT3X3_EDEFAULT;

	/**
   * The default value of the '{@link #getInt3x4() <em>Int3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt3x4()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT3X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt3x4() <em>Int3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt3x4()
   * @generated
   * @ordered
   */
	protected List<Integer> int3x4 = INT3X4_EDEFAULT;

	/**
   * The default value of the '{@link #getInt4x1() <em>Int4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt4x1()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT4X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt4x1() <em>Int4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt4x1()
   * @generated
   * @ordered
   */
	protected List<Integer> int4x1 = INT4X1_EDEFAULT;

	/**
   * The default value of the '{@link #getInt4x2() <em>Int4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt4x2()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT4X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt4x2() <em>Int4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt4x2()
   * @generated
   * @ordered
   */
	protected List<Integer> int4x2 = INT4X2_EDEFAULT;

	/**
   * The default value of the '{@link #getInt4x3() <em>Int4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt4x3()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT4X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt4x3() <em>Int4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt4x3()
   * @generated
   * @ordered
   */
	protected List<Integer> int4x3 = INT4X3_EDEFAULT;

	/**
   * The default value of the '{@link #getInt4x4() <em>Int4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt4x4()
   * @generated
   * @ordered
   */
	protected static final List<Integer> INT4X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInt4x4() <em>Int4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInt4x4()
   * @generated
   * @ordered
   */
	protected List<Integer> int4x4 = INT4X4_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf() <em>Half</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf()
   * @generated
   * @ordered
   */
	protected static final float HALF_EDEFAULT = 0.0F;

	/**
   * The cached value of the '{@link #getHalf() <em>Half</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf()
   * @generated
   * @ordered
   */
	protected float half = HALF_EDEFAULT;

	/**
   * This is true if the Half attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean halfESet;

	/**
   * The default value of the '{@link #getHalf1() <em>Half1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf1()
   * @generated
   * @ordered
   */
	protected static final float HALF1_EDEFAULT = 0.0F;

	/**
   * The cached value of the '{@link #getHalf1() <em>Half1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf1()
   * @generated
   * @ordered
   */
	protected float half1 = HALF1_EDEFAULT;

	/**
   * This is true if the Half1 attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean half1ESet;

	/**
   * The default value of the '{@link #getHalf2() <em>Half2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf2()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf2() <em>Half2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf2()
   * @generated
   * @ordered
   */
	protected List<Float> half2 = HALF2_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf3() <em>Half3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf3()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf3() <em>Half3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf3()
   * @generated
   * @ordered
   */
	protected List<Float> half3 = HALF3_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf4() <em>Half4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf4()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf4() <em>Half4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf4()
   * @generated
   * @ordered
   */
	protected List<Float> half4 = HALF4_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf1x1() <em>Half1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf1x1()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF1X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf1x1() <em>Half1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf1x1()
   * @generated
   * @ordered
   */
	protected List<Float> half1x1 = HALF1X1_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf1x2() <em>Half1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf1x2()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF1X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf1x2() <em>Half1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf1x2()
   * @generated
   * @ordered
   */
	protected List<Float> half1x2 = HALF1X2_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf1x3() <em>Half1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf1x3()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF1X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf1x3() <em>Half1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf1x3()
   * @generated
   * @ordered
   */
	protected List<Float> half1x3 = HALF1X3_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf1x4() <em>Half1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf1x4()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF1X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf1x4() <em>Half1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf1x4()
   * @generated
   * @ordered
   */
	protected List<Float> half1x4 = HALF1X4_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf2x1() <em>Half2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf2x1()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF2X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf2x1() <em>Half2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf2x1()
   * @generated
   * @ordered
   */
	protected List<Float> half2x1 = HALF2X1_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf2x2() <em>Half2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf2x2()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF2X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf2x2() <em>Half2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf2x2()
   * @generated
   * @ordered
   */
	protected List<Float> half2x2 = HALF2X2_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf2x3() <em>Half2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf2x3()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF2X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf2x3() <em>Half2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf2x3()
   * @generated
   * @ordered
   */
	protected List<Float> half2x3 = HALF2X3_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf2x4() <em>Half2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf2x4()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF2X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf2x4() <em>Half2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf2x4()
   * @generated
   * @ordered
   */
	protected List<Float> half2x4 = HALF2X4_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf3x1() <em>Half3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf3x1()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF3X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf3x1() <em>Half3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf3x1()
   * @generated
   * @ordered
   */
	protected List<Float> half3x1 = HALF3X1_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf3x2() <em>Half3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf3x2()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF3X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf3x2() <em>Half3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf3x2()
   * @generated
   * @ordered
   */
	protected List<Float> half3x2 = HALF3X2_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf3x3() <em>Half3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf3x3()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF3X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf3x3() <em>Half3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf3x3()
   * @generated
   * @ordered
   */
	protected List<Float> half3x3 = HALF3X3_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf3x4() <em>Half3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf3x4()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF3X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf3x4() <em>Half3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf3x4()
   * @generated
   * @ordered
   */
	protected List<Float> half3x4 = HALF3X4_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf4x1() <em>Half4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf4x1()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF4X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf4x1() <em>Half4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf4x1()
   * @generated
   * @ordered
   */
	protected List<Float> half4x1 = HALF4X1_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf4x2() <em>Half4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf4x2()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF4X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf4x2() <em>Half4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf4x2()
   * @generated
   * @ordered
   */
	protected List<Float> half4x2 = HALF4X2_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf4x3() <em>Half4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf4x3()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF4X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf4x3() <em>Half4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf4x3()
   * @generated
   * @ordered
   */
	protected List<Float> half4x3 = HALF4X3_EDEFAULT;

	/**
   * The default value of the '{@link #getHalf4x4() <em>Half4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf4x4()
   * @generated
   * @ordered
   */
	protected static final List<Float> HALF4X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHalf4x4() <em>Half4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHalf4x4()
   * @generated
   * @ordered
   */
	protected List<Float> half4x4 = HALF4X4_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed() <em>Fixed</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed()
   * @generated
   * @ordered
   */
	protected static final float FIXED_EDEFAULT = 0.0F;

	/**
   * The cached value of the '{@link #getFixed() <em>Fixed</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed()
   * @generated
   * @ordered
   */
	protected float fixed = FIXED_EDEFAULT;

	/**
   * This is true if the Fixed attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean fixedESet;

	/**
   * The default value of the '{@link #getFixed1() <em>Fixed1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed1()
   * @generated
   * @ordered
   */
	protected static final float FIXED1_EDEFAULT = 0.0F;

	/**
   * The cached value of the '{@link #getFixed1() <em>Fixed1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed1()
   * @generated
   * @ordered
   */
	protected float fixed1 = FIXED1_EDEFAULT;

	/**
   * This is true if the Fixed1 attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean fixed1ESet;

	/**
   * The default value of the '{@link #getFixed2() <em>Fixed2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed2()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed2() <em>Fixed2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed2()
   * @generated
   * @ordered
   */
	protected List<Float> fixed2 = FIXED2_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed3() <em>Fixed3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed3()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed3() <em>Fixed3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed3()
   * @generated
   * @ordered
   */
	protected List<Float> fixed3 = FIXED3_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed4() <em>Fixed4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed4()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed4() <em>Fixed4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed4()
   * @generated
   * @ordered
   */
	protected List<Float> fixed4 = FIXED4_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed1x1() <em>Fixed1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed1x1()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED1X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed1x1() <em>Fixed1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed1x1()
   * @generated
   * @ordered
   */
	protected List<Float> fixed1x1 = FIXED1X1_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed1x2() <em>Fixed1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed1x2()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED1X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed1x2() <em>Fixed1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed1x2()
   * @generated
   * @ordered
   */
	protected List<Float> fixed1x2 = FIXED1X2_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed1x3() <em>Fixed1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed1x3()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED1X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed1x3() <em>Fixed1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed1x3()
   * @generated
   * @ordered
   */
	protected List<Float> fixed1x3 = FIXED1X3_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed1x4() <em>Fixed1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed1x4()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED1X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed1x4() <em>Fixed1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed1x4()
   * @generated
   * @ordered
   */
	protected List<Float> fixed1x4 = FIXED1X4_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed2x1() <em>Fixed2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed2x1()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED2X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed2x1() <em>Fixed2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed2x1()
   * @generated
   * @ordered
   */
	protected List<Float> fixed2x1 = FIXED2X1_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed2x2() <em>Fixed2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed2x2()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED2X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed2x2() <em>Fixed2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed2x2()
   * @generated
   * @ordered
   */
	protected List<Float> fixed2x2 = FIXED2X2_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed2x3() <em>Fixed2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed2x3()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED2X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed2x3() <em>Fixed2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed2x3()
   * @generated
   * @ordered
   */
	protected List<Float> fixed2x3 = FIXED2X3_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed2x4() <em>Fixed2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed2x4()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED2X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed2x4() <em>Fixed2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed2x4()
   * @generated
   * @ordered
   */
	protected List<Float> fixed2x4 = FIXED2X4_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed3x1() <em>Fixed3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed3x1()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED3X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed3x1() <em>Fixed3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed3x1()
   * @generated
   * @ordered
   */
	protected List<Float> fixed3x1 = FIXED3X1_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed3x2() <em>Fixed3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed3x2()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED3X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed3x2() <em>Fixed3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed3x2()
   * @generated
   * @ordered
   */
	protected List<Float> fixed3x2 = FIXED3X2_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed3x3() <em>Fixed3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed3x3()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED3X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed3x3() <em>Fixed3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed3x3()
   * @generated
   * @ordered
   */
	protected List<Float> fixed3x3 = FIXED3X3_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed3x4() <em>Fixed3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed3x4()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED3X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed3x4() <em>Fixed3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed3x4()
   * @generated
   * @ordered
   */
	protected List<Float> fixed3x4 = FIXED3X4_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed4x1() <em>Fixed4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed4x1()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED4X1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed4x1() <em>Fixed4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed4x1()
   * @generated
   * @ordered
   */
	protected List<Float> fixed4x1 = FIXED4X1_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed4x2() <em>Fixed4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed4x2()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED4X2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed4x2() <em>Fixed4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed4x2()
   * @generated
   * @ordered
   */
	protected List<Float> fixed4x2 = FIXED4X2_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed4x3() <em>Fixed4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed4x3()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED4X3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed4x3() <em>Fixed4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed4x3()
   * @generated
   * @ordered
   */
	protected List<Float> fixed4x3 = FIXED4X3_EDEFAULT;

	/**
   * The default value of the '{@link #getFixed4x4() <em>Fixed4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed4x4()
   * @generated
   * @ordered
   */
	protected static final List<Float> FIXED4X4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFixed4x4() <em>Fixed4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFixed4x4()
   * @generated
   * @ordered
   */
	protected List<Float> fixed4x4 = FIXED4X4_EDEFAULT;

	/**
   * The cached value of the '{@link #getSurface() <em>Surface</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSurface()
   * @generated
   * @ordered
   */
	protected CgSurfaceType surface;

	/**
   * The cached value of the '{@link #getSampler1D() <em>Sampler1 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSampler1D()
   * @generated
   * @ordered
   */
	protected CgSampler1D sampler1D;

	/**
   * The cached value of the '{@link #getSampler2D() <em>Sampler2 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSampler2D()
   * @generated
   * @ordered
   */
	protected CgSampler2D sampler2D;

	/**
   * The cached value of the '{@link #getSampler3D() <em>Sampler3 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSampler3D()
   * @generated
   * @ordered
   */
	protected CgSampler3D sampler3D;

	/**
   * The cached value of the '{@link #getSamplerRECT() <em>Sampler RECT</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSamplerRECT()
   * @generated
   * @ordered
   */
	protected CgSamplerRECT samplerRECT;

	/**
   * The cached value of the '{@link #getSamplerCUBE() <em>Sampler CUBE</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSamplerCUBE()
   * @generated
   * @ordered
   */
	protected CgSamplerCUBE samplerCUBE;

	/**
   * The cached value of the '{@link #getSamplerDEPTH() <em>Sampler DEPTH</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSamplerDEPTH()
   * @generated
   * @ordered
   */
	protected CgSamplerDEPTH samplerDEPTH;

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
   * The cached value of the '{@link #getUsertype() <em>Usertype</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUsertype()
   * @generated
   * @ordered
   */
	protected CgSetuserType usertype;

	/**
   * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
	protected CgNewarrayType array;

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
	protected CgNewparamImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getCgNewparam();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxAnnotateCommon> getAnnotate() {
    if (annotate == null)
    {
      annotate = new EObjectContainmentEList<FxAnnotateCommon>(FxAnnotateCommon.class, this, ColladaPackage.CG_NEWPARAM__ANNOTATE);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SEMANTIC, oldSemantic, semantic));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__MODIFIER, oldModifier, modifier, !oldModifierESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.CG_NEWPARAM__MODIFIER, oldModifier, MODIFIER_EDEFAULT, oldModifierESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL, oldBool, bool, !oldBoolESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.CG_NEWPARAM__BOOL, oldBool, BOOL_EDEFAULT, oldBoolESet));
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
	public boolean isBool1() {
    return bool1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool1(boolean newBool1) {
    boolean oldBool1 = bool1;
    bool1 = newBool1;
    boolean oldBool1ESet = bool1ESet;
    bool1ESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL1, oldBool1, bool1, !oldBool1ESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetBool1() {
    boolean oldBool1 = bool1;
    boolean oldBool1ESet = bool1ESet;
    bool1 = BOOL1_EDEFAULT;
    bool1ESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.CG_NEWPARAM__BOOL1, oldBool1, BOOL1_EDEFAULT, oldBool1ESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetBool1() {
    return bool1ESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL2, oldBool2, bool2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL3, oldBool3, bool3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL4, oldBool4, bool4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool1x1() {
    return bool1x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool1x1(List<Boolean> newBool1x1) {
    List<Boolean> oldBool1x1 = bool1x1;
    bool1x1 = newBool1x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL1X1, oldBool1x1, bool1x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool1x2() {
    return bool1x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool1x2(List<Boolean> newBool1x2) {
    List<Boolean> oldBool1x2 = bool1x2;
    bool1x2 = newBool1x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL1X2, oldBool1x2, bool1x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool1x3() {
    return bool1x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool1x3(List<Boolean> newBool1x3) {
    List<Boolean> oldBool1x3 = bool1x3;
    bool1x3 = newBool1x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL1X3, oldBool1x3, bool1x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool1x4() {
    return bool1x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool1x4(List<Boolean> newBool1x4) {
    List<Boolean> oldBool1x4 = bool1x4;
    bool1x4 = newBool1x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL1X4, oldBool1x4, bool1x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool2x1() {
    return bool2x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool2x1(List<Boolean> newBool2x1) {
    List<Boolean> oldBool2x1 = bool2x1;
    bool2x1 = newBool2x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL2X1, oldBool2x1, bool2x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool2x2() {
    return bool2x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool2x2(List<Boolean> newBool2x2) {
    List<Boolean> oldBool2x2 = bool2x2;
    bool2x2 = newBool2x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL2X2, oldBool2x2, bool2x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool2x3() {
    return bool2x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool2x3(List<Boolean> newBool2x3) {
    List<Boolean> oldBool2x3 = bool2x3;
    bool2x3 = newBool2x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL2X3, oldBool2x3, bool2x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool2x4() {
    return bool2x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool2x4(List<Boolean> newBool2x4) {
    List<Boolean> oldBool2x4 = bool2x4;
    bool2x4 = newBool2x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL2X4, oldBool2x4, bool2x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool3x1() {
    return bool3x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool3x1(List<Boolean> newBool3x1) {
    List<Boolean> oldBool3x1 = bool3x1;
    bool3x1 = newBool3x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL3X1, oldBool3x1, bool3x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool3x2() {
    return bool3x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool3x2(List<Boolean> newBool3x2) {
    List<Boolean> oldBool3x2 = bool3x2;
    bool3x2 = newBool3x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL3X2, oldBool3x2, bool3x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool3x3() {
    return bool3x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool3x3(List<Boolean> newBool3x3) {
    List<Boolean> oldBool3x3 = bool3x3;
    bool3x3 = newBool3x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL3X3, oldBool3x3, bool3x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool3x4() {
    return bool3x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool3x4(List<Boolean> newBool3x4) {
    List<Boolean> oldBool3x4 = bool3x4;
    bool3x4 = newBool3x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL3X4, oldBool3x4, bool3x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool4x1() {
    return bool4x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool4x1(List<Boolean> newBool4x1) {
    List<Boolean> oldBool4x1 = bool4x1;
    bool4x1 = newBool4x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL4X1, oldBool4x1, bool4x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool4x2() {
    return bool4x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool4x2(List<Boolean> newBool4x2) {
    List<Boolean> oldBool4x2 = bool4x2;
    bool4x2 = newBool4x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL4X2, oldBool4x2, bool4x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool4x3() {
    return bool4x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool4x3(List<Boolean> newBool4x3) {
    List<Boolean> oldBool4x3 = bool4x3;
    bool4x3 = newBool4x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL4X3, oldBool4x3, bool4x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> getBool4x4() {
    return bool4x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBool4x4(List<Boolean> newBool4x4) {
    List<Boolean> oldBool4x4 = bool4x4;
    bool4x4 = newBool4x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__BOOL4X4, oldBool4x4, bool4x4));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT, oldFloat, float_, !oldFloatESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.CG_NEWPARAM__FLOAT, oldFloat, FLOAT_EDEFAULT, oldFloatESet));
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
	public float getFloat1() {
    return float1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat1(float newFloat1) {
    float oldFloat1 = float1;
    float1 = newFloat1;
    boolean oldFloat1ESet = float1ESet;
    float1ESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT1, oldFloat1, float1, !oldFloat1ESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetFloat1() {
    float oldFloat1 = float1;
    boolean oldFloat1ESet = float1ESet;
    float1 = FLOAT1_EDEFAULT;
    float1ESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.CG_NEWPARAM__FLOAT1, oldFloat1, FLOAT1_EDEFAULT, oldFloat1ESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetFloat1() {
    return float1ESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT2, oldFloat2, float2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT3, oldFloat3, float3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT4, oldFloat4, float4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat1x1() {
    return float1x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat1x1(List<Float> newFloat1x1) {
    List<Float> oldFloat1x1 = float1x1;
    float1x1 = newFloat1x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT1X1, oldFloat1x1, float1x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat1x2() {
    return float1x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat1x2(List<Float> newFloat1x2) {
    List<Float> oldFloat1x2 = float1x2;
    float1x2 = newFloat1x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT1X2, oldFloat1x2, float1x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat1x3() {
    return float1x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat1x3(List<Float> newFloat1x3) {
    List<Float> oldFloat1x3 = float1x3;
    float1x3 = newFloat1x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT1X3, oldFloat1x3, float1x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat1x4() {
    return float1x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat1x4(List<Float> newFloat1x4) {
    List<Float> oldFloat1x4 = float1x4;
    float1x4 = newFloat1x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT1X4, oldFloat1x4, float1x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat2x1() {
    return float2x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat2x1(List<Float> newFloat2x1) {
    List<Float> oldFloat2x1 = float2x1;
    float2x1 = newFloat2x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT2X1, oldFloat2x1, float2x1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT2X2, oldFloat2x2, float2x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat2x3() {
    return float2x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat2x3(List<Float> newFloat2x3) {
    List<Float> oldFloat2x3 = float2x3;
    float2x3 = newFloat2x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT2X3, oldFloat2x3, float2x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat2x4() {
    return float2x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat2x4(List<Float> newFloat2x4) {
    List<Float> oldFloat2x4 = float2x4;
    float2x4 = newFloat2x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT2X4, oldFloat2x4, float2x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat3x1() {
    return float3x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat3x1(List<Float> newFloat3x1) {
    List<Float> oldFloat3x1 = float3x1;
    float3x1 = newFloat3x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT3X1, oldFloat3x1, float3x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat3x2() {
    return float3x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat3x2(List<Float> newFloat3x2) {
    List<Float> oldFloat3x2 = float3x2;
    float3x2 = newFloat3x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT3X2, oldFloat3x2, float3x2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT3X3, oldFloat3x3, float3x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat3x4() {
    return float3x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat3x4(List<Float> newFloat3x4) {
    List<Float> oldFloat3x4 = float3x4;
    float3x4 = newFloat3x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT3X4, oldFloat3x4, float3x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat4x1() {
    return float4x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat4x1(List<Float> newFloat4x1) {
    List<Float> oldFloat4x1 = float4x1;
    float4x1 = newFloat4x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT4X1, oldFloat4x1, float4x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat4x2() {
    return float4x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat4x2(List<Float> newFloat4x2) {
    List<Float> oldFloat4x2 = float4x2;
    float4x2 = newFloat4x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT4X2, oldFloat4x2, float4x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFloat4x3() {
    return float4x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat4x3(List<Float> newFloat4x3) {
    List<Float> oldFloat4x3 = float4x3;
    float4x3 = newFloat4x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT4X3, oldFloat4x3, float4x3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FLOAT4X4, oldFloat4x4, float4x4));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT, oldInt, int_, !oldIntESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.CG_NEWPARAM__INT, oldInt, INT_EDEFAULT, oldIntESet));
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
	public int getInt1() {
    return int1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt1(int newInt1) {
    int oldInt1 = int1;
    int1 = newInt1;
    boolean oldInt1ESet = int1ESet;
    int1ESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT1, oldInt1, int1, !oldInt1ESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetInt1() {
    int oldInt1 = int1;
    boolean oldInt1ESet = int1ESet;
    int1 = INT1_EDEFAULT;
    int1ESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.CG_NEWPARAM__INT1, oldInt1, INT1_EDEFAULT, oldInt1ESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetInt1() {
    return int1ESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT2, oldInt2, int2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT3, oldInt3, int3));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT4, oldInt4, int4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt1x1() {
    return int1x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt1x1(List<Integer> newInt1x1) {
    List<Integer> oldInt1x1 = int1x1;
    int1x1 = newInt1x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT1X1, oldInt1x1, int1x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt1x2() {
    return int1x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt1x2(List<Integer> newInt1x2) {
    List<Integer> oldInt1x2 = int1x2;
    int1x2 = newInt1x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT1X2, oldInt1x2, int1x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt1x3() {
    return int1x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt1x3(List<Integer> newInt1x3) {
    List<Integer> oldInt1x3 = int1x3;
    int1x3 = newInt1x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT1X3, oldInt1x3, int1x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt1x4() {
    return int1x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt1x4(List<Integer> newInt1x4) {
    List<Integer> oldInt1x4 = int1x4;
    int1x4 = newInt1x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT1X4, oldInt1x4, int1x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt2x1() {
    return int2x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt2x1(List<Integer> newInt2x1) {
    List<Integer> oldInt2x1 = int2x1;
    int2x1 = newInt2x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT2X1, oldInt2x1, int2x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt2x2() {
    return int2x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt2x2(List<Integer> newInt2x2) {
    List<Integer> oldInt2x2 = int2x2;
    int2x2 = newInt2x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT2X2, oldInt2x2, int2x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt2x3() {
    return int2x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt2x3(List<Integer> newInt2x3) {
    List<Integer> oldInt2x3 = int2x3;
    int2x3 = newInt2x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT2X3, oldInt2x3, int2x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt2x4() {
    return int2x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt2x4(List<Integer> newInt2x4) {
    List<Integer> oldInt2x4 = int2x4;
    int2x4 = newInt2x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT2X4, oldInt2x4, int2x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt3x1() {
    return int3x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt3x1(List<Integer> newInt3x1) {
    List<Integer> oldInt3x1 = int3x1;
    int3x1 = newInt3x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT3X1, oldInt3x1, int3x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt3x2() {
    return int3x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt3x2(List<Integer> newInt3x2) {
    List<Integer> oldInt3x2 = int3x2;
    int3x2 = newInt3x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT3X2, oldInt3x2, int3x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt3x3() {
    return int3x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt3x3(List<Integer> newInt3x3) {
    List<Integer> oldInt3x3 = int3x3;
    int3x3 = newInt3x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT3X3, oldInt3x3, int3x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt3x4() {
    return int3x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt3x4(List<Integer> newInt3x4) {
    List<Integer> oldInt3x4 = int3x4;
    int3x4 = newInt3x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT3X4, oldInt3x4, int3x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt4x1() {
    return int4x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt4x1(List<Integer> newInt4x1) {
    List<Integer> oldInt4x1 = int4x1;
    int4x1 = newInt4x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT4X1, oldInt4x1, int4x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt4x2() {
    return int4x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt4x2(List<Integer> newInt4x2) {
    List<Integer> oldInt4x2 = int4x2;
    int4x2 = newInt4x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT4X2, oldInt4x2, int4x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt4x3() {
    return int4x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt4x3(List<Integer> newInt4x3) {
    List<Integer> oldInt4x3 = int4x3;
    int4x3 = newInt4x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT4X3, oldInt4x3, int4x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> getInt4x4() {
    return int4x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInt4x4(List<Integer> newInt4x4) {
    List<Integer> oldInt4x4 = int4x4;
    int4x4 = newInt4x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__INT4X4, oldInt4x4, int4x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public float getHalf() {
    return half;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf(float newHalf) {
    float oldHalf = half;
    half = newHalf;
    boolean oldHalfESet = halfESet;
    halfESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF, oldHalf, half, !oldHalfESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetHalf() {
    float oldHalf = half;
    boolean oldHalfESet = halfESet;
    half = HALF_EDEFAULT;
    halfESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.CG_NEWPARAM__HALF, oldHalf, HALF_EDEFAULT, oldHalfESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetHalf() {
    return halfESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public float getHalf1() {
    return half1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf1(float newHalf1) {
    float oldHalf1 = half1;
    half1 = newHalf1;
    boolean oldHalf1ESet = half1ESet;
    half1ESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF1, oldHalf1, half1, !oldHalf1ESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetHalf1() {
    float oldHalf1 = half1;
    boolean oldHalf1ESet = half1ESet;
    half1 = HALF1_EDEFAULT;
    half1ESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.CG_NEWPARAM__HALF1, oldHalf1, HALF1_EDEFAULT, oldHalf1ESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetHalf1() {
    return half1ESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf2() {
    return half2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf2(List<Float> newHalf2) {
    List<Float> oldHalf2 = half2;
    half2 = newHalf2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF2, oldHalf2, half2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf3() {
    return half3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf3(List<Float> newHalf3) {
    List<Float> oldHalf3 = half3;
    half3 = newHalf3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF3, oldHalf3, half3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf4() {
    return half4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf4(List<Float> newHalf4) {
    List<Float> oldHalf4 = half4;
    half4 = newHalf4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF4, oldHalf4, half4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf1x1() {
    return half1x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf1x1(List<Float> newHalf1x1) {
    List<Float> oldHalf1x1 = half1x1;
    half1x1 = newHalf1x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF1X1, oldHalf1x1, half1x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf1x2() {
    return half1x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf1x2(List<Float> newHalf1x2) {
    List<Float> oldHalf1x2 = half1x2;
    half1x2 = newHalf1x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF1X2, oldHalf1x2, half1x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf1x3() {
    return half1x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf1x3(List<Float> newHalf1x3) {
    List<Float> oldHalf1x3 = half1x3;
    half1x3 = newHalf1x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF1X3, oldHalf1x3, half1x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf1x4() {
    return half1x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf1x4(List<Float> newHalf1x4) {
    List<Float> oldHalf1x4 = half1x4;
    half1x4 = newHalf1x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF1X4, oldHalf1x4, half1x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf2x1() {
    return half2x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf2x1(List<Float> newHalf2x1) {
    List<Float> oldHalf2x1 = half2x1;
    half2x1 = newHalf2x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF2X1, oldHalf2x1, half2x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf2x2() {
    return half2x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf2x2(List<Float> newHalf2x2) {
    List<Float> oldHalf2x2 = half2x2;
    half2x2 = newHalf2x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF2X2, oldHalf2x2, half2x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf2x3() {
    return half2x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf2x3(List<Float> newHalf2x3) {
    List<Float> oldHalf2x3 = half2x3;
    half2x3 = newHalf2x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF2X3, oldHalf2x3, half2x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf2x4() {
    return half2x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf2x4(List<Float> newHalf2x4) {
    List<Float> oldHalf2x4 = half2x4;
    half2x4 = newHalf2x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF2X4, oldHalf2x4, half2x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf3x1() {
    return half3x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf3x1(List<Float> newHalf3x1) {
    List<Float> oldHalf3x1 = half3x1;
    half3x1 = newHalf3x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF3X1, oldHalf3x1, half3x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf3x2() {
    return half3x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf3x2(List<Float> newHalf3x2) {
    List<Float> oldHalf3x2 = half3x2;
    half3x2 = newHalf3x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF3X2, oldHalf3x2, half3x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf3x3() {
    return half3x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf3x3(List<Float> newHalf3x3) {
    List<Float> oldHalf3x3 = half3x3;
    half3x3 = newHalf3x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF3X3, oldHalf3x3, half3x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf3x4() {
    return half3x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf3x4(List<Float> newHalf3x4) {
    List<Float> oldHalf3x4 = half3x4;
    half3x4 = newHalf3x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF3X4, oldHalf3x4, half3x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf4x1() {
    return half4x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf4x1(List<Float> newHalf4x1) {
    List<Float> oldHalf4x1 = half4x1;
    half4x1 = newHalf4x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF4X1, oldHalf4x1, half4x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf4x2() {
    return half4x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf4x2(List<Float> newHalf4x2) {
    List<Float> oldHalf4x2 = half4x2;
    half4x2 = newHalf4x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF4X2, oldHalf4x2, half4x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf4x3() {
    return half4x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf4x3(List<Float> newHalf4x3) {
    List<Float> oldHalf4x3 = half4x3;
    half4x3 = newHalf4x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF4X3, oldHalf4x3, half4x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getHalf4x4() {
    return half4x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHalf4x4(List<Float> newHalf4x4) {
    List<Float> oldHalf4x4 = half4x4;
    half4x4 = newHalf4x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__HALF4X4, oldHalf4x4, half4x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public float getFixed() {
    return fixed;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed(float newFixed) {
    float oldFixed = fixed;
    fixed = newFixed;
    boolean oldFixedESet = fixedESet;
    fixedESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED, oldFixed, fixed, !oldFixedESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetFixed() {
    float oldFixed = fixed;
    boolean oldFixedESet = fixedESet;
    fixed = FIXED_EDEFAULT;
    fixedESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.CG_NEWPARAM__FIXED, oldFixed, FIXED_EDEFAULT, oldFixedESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetFixed() {
    return fixedESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public float getFixed1() {
    return fixed1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed1(float newFixed1) {
    float oldFixed1 = fixed1;
    fixed1 = newFixed1;
    boolean oldFixed1ESet = fixed1ESet;
    fixed1ESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED1, oldFixed1, fixed1, !oldFixed1ESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetFixed1() {
    float oldFixed1 = fixed1;
    boolean oldFixed1ESet = fixed1ESet;
    fixed1 = FIXED1_EDEFAULT;
    fixed1ESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.CG_NEWPARAM__FIXED1, oldFixed1, FIXED1_EDEFAULT, oldFixed1ESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetFixed1() {
    return fixed1ESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed2() {
    return fixed2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed2(List<Float> newFixed2) {
    List<Float> oldFixed2 = fixed2;
    fixed2 = newFixed2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED2, oldFixed2, fixed2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed3() {
    return fixed3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed3(List<Float> newFixed3) {
    List<Float> oldFixed3 = fixed3;
    fixed3 = newFixed3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED3, oldFixed3, fixed3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed4() {
    return fixed4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed4(List<Float> newFixed4) {
    List<Float> oldFixed4 = fixed4;
    fixed4 = newFixed4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED4, oldFixed4, fixed4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed1x1() {
    return fixed1x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed1x1(List<Float> newFixed1x1) {
    List<Float> oldFixed1x1 = fixed1x1;
    fixed1x1 = newFixed1x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED1X1, oldFixed1x1, fixed1x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed1x2() {
    return fixed1x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed1x2(List<Float> newFixed1x2) {
    List<Float> oldFixed1x2 = fixed1x2;
    fixed1x2 = newFixed1x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED1X2, oldFixed1x2, fixed1x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed1x3() {
    return fixed1x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed1x3(List<Float> newFixed1x3) {
    List<Float> oldFixed1x3 = fixed1x3;
    fixed1x3 = newFixed1x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED1X3, oldFixed1x3, fixed1x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed1x4() {
    return fixed1x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed1x4(List<Float> newFixed1x4) {
    List<Float> oldFixed1x4 = fixed1x4;
    fixed1x4 = newFixed1x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED1X4, oldFixed1x4, fixed1x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed2x1() {
    return fixed2x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed2x1(List<Float> newFixed2x1) {
    List<Float> oldFixed2x1 = fixed2x1;
    fixed2x1 = newFixed2x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED2X1, oldFixed2x1, fixed2x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed2x2() {
    return fixed2x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed2x2(List<Float> newFixed2x2) {
    List<Float> oldFixed2x2 = fixed2x2;
    fixed2x2 = newFixed2x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED2X2, oldFixed2x2, fixed2x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed2x3() {
    return fixed2x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed2x3(List<Float> newFixed2x3) {
    List<Float> oldFixed2x3 = fixed2x3;
    fixed2x3 = newFixed2x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED2X3, oldFixed2x3, fixed2x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed2x4() {
    return fixed2x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed2x4(List<Float> newFixed2x4) {
    List<Float> oldFixed2x4 = fixed2x4;
    fixed2x4 = newFixed2x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED2X4, oldFixed2x4, fixed2x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed3x1() {
    return fixed3x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed3x1(List<Float> newFixed3x1) {
    List<Float> oldFixed3x1 = fixed3x1;
    fixed3x1 = newFixed3x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED3X1, oldFixed3x1, fixed3x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed3x2() {
    return fixed3x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed3x2(List<Float> newFixed3x2) {
    List<Float> oldFixed3x2 = fixed3x2;
    fixed3x2 = newFixed3x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED3X2, oldFixed3x2, fixed3x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed3x3() {
    return fixed3x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed3x3(List<Float> newFixed3x3) {
    List<Float> oldFixed3x3 = fixed3x3;
    fixed3x3 = newFixed3x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED3X3, oldFixed3x3, fixed3x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed3x4() {
    return fixed3x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed3x4(List<Float> newFixed3x4) {
    List<Float> oldFixed3x4 = fixed3x4;
    fixed3x4 = newFixed3x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED3X4, oldFixed3x4, fixed3x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed4x1() {
    return fixed4x1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed4x1(List<Float> newFixed4x1) {
    List<Float> oldFixed4x1 = fixed4x1;
    fixed4x1 = newFixed4x1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED4X1, oldFixed4x1, fixed4x1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed4x2() {
    return fixed4x2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed4x2(List<Float> newFixed4x2) {
    List<Float> oldFixed4x2 = fixed4x2;
    fixed4x2 = newFixed4x2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED4X2, oldFixed4x2, fixed4x2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed4x3() {
    return fixed4x3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed4x3(List<Float> newFixed4x3) {
    List<Float> oldFixed4x3 = fixed4x3;
    fixed4x3 = newFixed4x3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED4X3, oldFixed4x3, fixed4x3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> getFixed4x4() {
    return fixed4x4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFixed4x4(List<Float> newFixed4x4) {
    List<Float> oldFixed4x4 = fixed4x4;
    fixed4x4 = newFixed4x4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__FIXED4X4, oldFixed4x4, fixed4x4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSurfaceType getSurface() {
    return surface;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSurface(CgSurfaceType newSurface, NotificationChain msgs) {
    CgSurfaceType oldSurface = surface;
    surface = newSurface;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SURFACE, oldSurface, newSurface);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSurface(CgSurfaceType newSurface) {
    if (newSurface != surface)
    {
      NotificationChain msgs = null;
      if (surface != null)
        msgs = ((InternalEObject)surface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__SURFACE, null, msgs);
      if (newSurface != null)
        msgs = ((InternalEObject)newSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__SURFACE, null, msgs);
      msgs = basicSetSurface(newSurface, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SURFACE, newSurface, newSurface));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSampler1D getSampler1D() {
    return sampler1D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSampler1D(CgSampler1D newSampler1D, NotificationChain msgs) {
    CgSampler1D oldSampler1D = sampler1D;
    sampler1D = newSampler1D;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SAMPLER1_D, oldSampler1D, newSampler1D);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSampler1D(CgSampler1D newSampler1D) {
    if (newSampler1D != sampler1D)
    {
      NotificationChain msgs = null;
      if (sampler1D != null)
        msgs = ((InternalEObject)sampler1D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__SAMPLER1_D, null, msgs);
      if (newSampler1D != null)
        msgs = ((InternalEObject)newSampler1D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__SAMPLER1_D, null, msgs);
      msgs = basicSetSampler1D(newSampler1D, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SAMPLER1_D, newSampler1D, newSampler1D));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSampler2D getSampler2D() {
    return sampler2D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSampler2D(CgSampler2D newSampler2D, NotificationChain msgs) {
    CgSampler2D oldSampler2D = sampler2D;
    sampler2D = newSampler2D;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SAMPLER2_D, oldSampler2D, newSampler2D);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSampler2D(CgSampler2D newSampler2D) {
    if (newSampler2D != sampler2D)
    {
      NotificationChain msgs = null;
      if (sampler2D != null)
        msgs = ((InternalEObject)sampler2D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__SAMPLER2_D, null, msgs);
      if (newSampler2D != null)
        msgs = ((InternalEObject)newSampler2D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__SAMPLER2_D, null, msgs);
      msgs = basicSetSampler2D(newSampler2D, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SAMPLER2_D, newSampler2D, newSampler2D));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSampler3D getSampler3D() {
    return sampler3D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSampler3D(CgSampler3D newSampler3D, NotificationChain msgs) {
    CgSampler3D oldSampler3D = sampler3D;
    sampler3D = newSampler3D;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SAMPLER3_D, oldSampler3D, newSampler3D);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSampler3D(CgSampler3D newSampler3D) {
    if (newSampler3D != sampler3D)
    {
      NotificationChain msgs = null;
      if (sampler3D != null)
        msgs = ((InternalEObject)sampler3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__SAMPLER3_D, null, msgs);
      if (newSampler3D != null)
        msgs = ((InternalEObject)newSampler3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__SAMPLER3_D, null, msgs);
      msgs = basicSetSampler3D(newSampler3D, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SAMPLER3_D, newSampler3D, newSampler3D));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSamplerRECT getSamplerRECT() {
    return samplerRECT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSamplerRECT(CgSamplerRECT newSamplerRECT, NotificationChain msgs) {
    CgSamplerRECT oldSamplerRECT = samplerRECT;
    samplerRECT = newSamplerRECT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SAMPLER_RECT, oldSamplerRECT, newSamplerRECT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSamplerRECT(CgSamplerRECT newSamplerRECT) {
    if (newSamplerRECT != samplerRECT)
    {
      NotificationChain msgs = null;
      if (samplerRECT != null)
        msgs = ((InternalEObject)samplerRECT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__SAMPLER_RECT, null, msgs);
      if (newSamplerRECT != null)
        msgs = ((InternalEObject)newSamplerRECT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__SAMPLER_RECT, null, msgs);
      msgs = basicSetSamplerRECT(newSamplerRECT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SAMPLER_RECT, newSamplerRECT, newSamplerRECT));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSamplerCUBE getSamplerCUBE() {
    return samplerCUBE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSamplerCUBE(CgSamplerCUBE newSamplerCUBE, NotificationChain msgs) {
    CgSamplerCUBE oldSamplerCUBE = samplerCUBE;
    samplerCUBE = newSamplerCUBE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SAMPLER_CUBE, oldSamplerCUBE, newSamplerCUBE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSamplerCUBE(CgSamplerCUBE newSamplerCUBE) {
    if (newSamplerCUBE != samplerCUBE)
    {
      NotificationChain msgs = null;
      if (samplerCUBE != null)
        msgs = ((InternalEObject)samplerCUBE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__SAMPLER_CUBE, null, msgs);
      if (newSamplerCUBE != null)
        msgs = ((InternalEObject)newSamplerCUBE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__SAMPLER_CUBE, null, msgs);
      msgs = basicSetSamplerCUBE(newSamplerCUBE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SAMPLER_CUBE, newSamplerCUBE, newSamplerCUBE));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSamplerDEPTH getSamplerDEPTH() {
    return samplerDEPTH;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSamplerDEPTH(CgSamplerDEPTH newSamplerDEPTH, NotificationChain msgs) {
    CgSamplerDEPTH oldSamplerDEPTH = samplerDEPTH;
    samplerDEPTH = newSamplerDEPTH;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SAMPLER_DEPTH, oldSamplerDEPTH, newSamplerDEPTH);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSamplerDEPTH(CgSamplerDEPTH newSamplerDEPTH) {
    if (newSamplerDEPTH != samplerDEPTH)
    {
      NotificationChain msgs = null;
      if (samplerDEPTH != null)
        msgs = ((InternalEObject)samplerDEPTH).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__SAMPLER_DEPTH, null, msgs);
      if (newSamplerDEPTH != null)
        msgs = ((InternalEObject)newSamplerDEPTH).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__SAMPLER_DEPTH, null, msgs);
      msgs = basicSetSamplerDEPTH(newSamplerDEPTH, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SAMPLER_DEPTH, newSamplerDEPTH, newSamplerDEPTH));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__STRING, oldString, string));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__ENUM, oldEnum, enum_));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSetuserType getUsertype() {
    return usertype;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetUsertype(CgSetuserType newUsertype, NotificationChain msgs) {
    CgSetuserType oldUsertype = usertype;
    usertype = newUsertype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__USERTYPE, oldUsertype, newUsertype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUsertype(CgSetuserType newUsertype) {
    if (newUsertype != usertype)
    {
      NotificationChain msgs = null;
      if (usertype != null)
        msgs = ((InternalEObject)usertype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__USERTYPE, null, msgs);
      if (newUsertype != null)
        msgs = ((InternalEObject)newUsertype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__USERTYPE, null, msgs);
      msgs = basicSetUsertype(newUsertype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__USERTYPE, newUsertype, newUsertype));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgNewarrayType getArray() {
    return array;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetArray(CgNewarrayType newArray, NotificationChain msgs) {
    CgNewarrayType oldArray = array;
    array = newArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__ARRAY, oldArray, newArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setArray(CgNewarrayType newArray) {
    if (newArray != array)
    {
      NotificationChain msgs = null;
      if (array != null)
        msgs = ((InternalEObject)array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__ARRAY, null, msgs);
      if (newArray != null)
        msgs = ((InternalEObject)newArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.CG_NEWPARAM__ARRAY, null, msgs);
      msgs = basicSetArray(newArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__ARRAY, newArray, newArray));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_NEWPARAM__SID, oldSid, sid));
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
      case ColladaPackage.CG_NEWPARAM__ANNOTATE:
        return ((InternalEList<?>)getAnnotate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.CG_NEWPARAM__SURFACE:
        return basicSetSurface(null, msgs);
      case ColladaPackage.CG_NEWPARAM__SAMPLER1_D:
        return basicSetSampler1D(null, msgs);
      case ColladaPackage.CG_NEWPARAM__SAMPLER2_D:
        return basicSetSampler2D(null, msgs);
      case ColladaPackage.CG_NEWPARAM__SAMPLER3_D:
        return basicSetSampler3D(null, msgs);
      case ColladaPackage.CG_NEWPARAM__SAMPLER_RECT:
        return basicSetSamplerRECT(null, msgs);
      case ColladaPackage.CG_NEWPARAM__SAMPLER_CUBE:
        return basicSetSamplerCUBE(null, msgs);
      case ColladaPackage.CG_NEWPARAM__SAMPLER_DEPTH:
        return basicSetSamplerDEPTH(null, msgs);
      case ColladaPackage.CG_NEWPARAM__USERTYPE:
        return basicSetUsertype(null, msgs);
      case ColladaPackage.CG_NEWPARAM__ARRAY:
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
      case ColladaPackage.CG_NEWPARAM__ANNOTATE:
        return getAnnotate();
      case ColladaPackage.CG_NEWPARAM__SEMANTIC:
        return getSemantic();
      case ColladaPackage.CG_NEWPARAM__MODIFIER:
        return getModifier();
      case ColladaPackage.CG_NEWPARAM__BOOL:
        return isBool();
      case ColladaPackage.CG_NEWPARAM__BOOL1:
        return isBool1();
      case ColladaPackage.CG_NEWPARAM__BOOL2:
        return getBool2();
      case ColladaPackage.CG_NEWPARAM__BOOL3:
        return getBool3();
      case ColladaPackage.CG_NEWPARAM__BOOL4:
        return getBool4();
      case ColladaPackage.CG_NEWPARAM__BOOL1X1:
        return getBool1x1();
      case ColladaPackage.CG_NEWPARAM__BOOL1X2:
        return getBool1x2();
      case ColladaPackage.CG_NEWPARAM__BOOL1X3:
        return getBool1x3();
      case ColladaPackage.CG_NEWPARAM__BOOL1X4:
        return getBool1x4();
      case ColladaPackage.CG_NEWPARAM__BOOL2X1:
        return getBool2x1();
      case ColladaPackage.CG_NEWPARAM__BOOL2X2:
        return getBool2x2();
      case ColladaPackage.CG_NEWPARAM__BOOL2X3:
        return getBool2x3();
      case ColladaPackage.CG_NEWPARAM__BOOL2X4:
        return getBool2x4();
      case ColladaPackage.CG_NEWPARAM__BOOL3X1:
        return getBool3x1();
      case ColladaPackage.CG_NEWPARAM__BOOL3X2:
        return getBool3x2();
      case ColladaPackage.CG_NEWPARAM__BOOL3X3:
        return getBool3x3();
      case ColladaPackage.CG_NEWPARAM__BOOL3X4:
        return getBool3x4();
      case ColladaPackage.CG_NEWPARAM__BOOL4X1:
        return getBool4x1();
      case ColladaPackage.CG_NEWPARAM__BOOL4X2:
        return getBool4x2();
      case ColladaPackage.CG_NEWPARAM__BOOL4X3:
        return getBool4x3();
      case ColladaPackage.CG_NEWPARAM__BOOL4X4:
        return getBool4x4();
      case ColladaPackage.CG_NEWPARAM__FLOAT:
        return getFloat();
      case ColladaPackage.CG_NEWPARAM__FLOAT1:
        return getFloat1();
      case ColladaPackage.CG_NEWPARAM__FLOAT2:
        return getFloat2();
      case ColladaPackage.CG_NEWPARAM__FLOAT3:
        return getFloat3();
      case ColladaPackage.CG_NEWPARAM__FLOAT4:
        return getFloat4();
      case ColladaPackage.CG_NEWPARAM__FLOAT1X1:
        return getFloat1x1();
      case ColladaPackage.CG_NEWPARAM__FLOAT1X2:
        return getFloat1x2();
      case ColladaPackage.CG_NEWPARAM__FLOAT1X3:
        return getFloat1x3();
      case ColladaPackage.CG_NEWPARAM__FLOAT1X4:
        return getFloat1x4();
      case ColladaPackage.CG_NEWPARAM__FLOAT2X1:
        return getFloat2x1();
      case ColladaPackage.CG_NEWPARAM__FLOAT2X2:
        return getFloat2x2();
      case ColladaPackage.CG_NEWPARAM__FLOAT2X3:
        return getFloat2x3();
      case ColladaPackage.CG_NEWPARAM__FLOAT2X4:
        return getFloat2x4();
      case ColladaPackage.CG_NEWPARAM__FLOAT3X1:
        return getFloat3x1();
      case ColladaPackage.CG_NEWPARAM__FLOAT3X2:
        return getFloat3x2();
      case ColladaPackage.CG_NEWPARAM__FLOAT3X3:
        return getFloat3x3();
      case ColladaPackage.CG_NEWPARAM__FLOAT3X4:
        return getFloat3x4();
      case ColladaPackage.CG_NEWPARAM__FLOAT4X1:
        return getFloat4x1();
      case ColladaPackage.CG_NEWPARAM__FLOAT4X2:
        return getFloat4x2();
      case ColladaPackage.CG_NEWPARAM__FLOAT4X3:
        return getFloat4x3();
      case ColladaPackage.CG_NEWPARAM__FLOAT4X4:
        return getFloat4x4();
      case ColladaPackage.CG_NEWPARAM__INT:
        return getInt();
      case ColladaPackage.CG_NEWPARAM__INT1:
        return getInt1();
      case ColladaPackage.CG_NEWPARAM__INT2:
        return getInt2();
      case ColladaPackage.CG_NEWPARAM__INT3:
        return getInt3();
      case ColladaPackage.CG_NEWPARAM__INT4:
        return getInt4();
      case ColladaPackage.CG_NEWPARAM__INT1X1:
        return getInt1x1();
      case ColladaPackage.CG_NEWPARAM__INT1X2:
        return getInt1x2();
      case ColladaPackage.CG_NEWPARAM__INT1X3:
        return getInt1x3();
      case ColladaPackage.CG_NEWPARAM__INT1X4:
        return getInt1x4();
      case ColladaPackage.CG_NEWPARAM__INT2X1:
        return getInt2x1();
      case ColladaPackage.CG_NEWPARAM__INT2X2:
        return getInt2x2();
      case ColladaPackage.CG_NEWPARAM__INT2X3:
        return getInt2x3();
      case ColladaPackage.CG_NEWPARAM__INT2X4:
        return getInt2x4();
      case ColladaPackage.CG_NEWPARAM__INT3X1:
        return getInt3x1();
      case ColladaPackage.CG_NEWPARAM__INT3X2:
        return getInt3x2();
      case ColladaPackage.CG_NEWPARAM__INT3X3:
        return getInt3x3();
      case ColladaPackage.CG_NEWPARAM__INT3X4:
        return getInt3x4();
      case ColladaPackage.CG_NEWPARAM__INT4X1:
        return getInt4x1();
      case ColladaPackage.CG_NEWPARAM__INT4X2:
        return getInt4x2();
      case ColladaPackage.CG_NEWPARAM__INT4X3:
        return getInt4x3();
      case ColladaPackage.CG_NEWPARAM__INT4X4:
        return getInt4x4();
      case ColladaPackage.CG_NEWPARAM__HALF:
        return getHalf();
      case ColladaPackage.CG_NEWPARAM__HALF1:
        return getHalf1();
      case ColladaPackage.CG_NEWPARAM__HALF2:
        return getHalf2();
      case ColladaPackage.CG_NEWPARAM__HALF3:
        return getHalf3();
      case ColladaPackage.CG_NEWPARAM__HALF4:
        return getHalf4();
      case ColladaPackage.CG_NEWPARAM__HALF1X1:
        return getHalf1x1();
      case ColladaPackage.CG_NEWPARAM__HALF1X2:
        return getHalf1x2();
      case ColladaPackage.CG_NEWPARAM__HALF1X3:
        return getHalf1x3();
      case ColladaPackage.CG_NEWPARAM__HALF1X4:
        return getHalf1x4();
      case ColladaPackage.CG_NEWPARAM__HALF2X1:
        return getHalf2x1();
      case ColladaPackage.CG_NEWPARAM__HALF2X2:
        return getHalf2x2();
      case ColladaPackage.CG_NEWPARAM__HALF2X3:
        return getHalf2x3();
      case ColladaPackage.CG_NEWPARAM__HALF2X4:
        return getHalf2x4();
      case ColladaPackage.CG_NEWPARAM__HALF3X1:
        return getHalf3x1();
      case ColladaPackage.CG_NEWPARAM__HALF3X2:
        return getHalf3x2();
      case ColladaPackage.CG_NEWPARAM__HALF3X3:
        return getHalf3x3();
      case ColladaPackage.CG_NEWPARAM__HALF3X4:
        return getHalf3x4();
      case ColladaPackage.CG_NEWPARAM__HALF4X1:
        return getHalf4x1();
      case ColladaPackage.CG_NEWPARAM__HALF4X2:
        return getHalf4x2();
      case ColladaPackage.CG_NEWPARAM__HALF4X3:
        return getHalf4x3();
      case ColladaPackage.CG_NEWPARAM__HALF4X4:
        return getHalf4x4();
      case ColladaPackage.CG_NEWPARAM__FIXED:
        return getFixed();
      case ColladaPackage.CG_NEWPARAM__FIXED1:
        return getFixed1();
      case ColladaPackage.CG_NEWPARAM__FIXED2:
        return getFixed2();
      case ColladaPackage.CG_NEWPARAM__FIXED3:
        return getFixed3();
      case ColladaPackage.CG_NEWPARAM__FIXED4:
        return getFixed4();
      case ColladaPackage.CG_NEWPARAM__FIXED1X1:
        return getFixed1x1();
      case ColladaPackage.CG_NEWPARAM__FIXED1X2:
        return getFixed1x2();
      case ColladaPackage.CG_NEWPARAM__FIXED1X3:
        return getFixed1x3();
      case ColladaPackage.CG_NEWPARAM__FIXED1X4:
        return getFixed1x4();
      case ColladaPackage.CG_NEWPARAM__FIXED2X1:
        return getFixed2x1();
      case ColladaPackage.CG_NEWPARAM__FIXED2X2:
        return getFixed2x2();
      case ColladaPackage.CG_NEWPARAM__FIXED2X3:
        return getFixed2x3();
      case ColladaPackage.CG_NEWPARAM__FIXED2X4:
        return getFixed2x4();
      case ColladaPackage.CG_NEWPARAM__FIXED3X1:
        return getFixed3x1();
      case ColladaPackage.CG_NEWPARAM__FIXED3X2:
        return getFixed3x2();
      case ColladaPackage.CG_NEWPARAM__FIXED3X3:
        return getFixed3x3();
      case ColladaPackage.CG_NEWPARAM__FIXED3X4:
        return getFixed3x4();
      case ColladaPackage.CG_NEWPARAM__FIXED4X1:
        return getFixed4x1();
      case ColladaPackage.CG_NEWPARAM__FIXED4X2:
        return getFixed4x2();
      case ColladaPackage.CG_NEWPARAM__FIXED4X3:
        return getFixed4x3();
      case ColladaPackage.CG_NEWPARAM__FIXED4X4:
        return getFixed4x4();
      case ColladaPackage.CG_NEWPARAM__SURFACE:
        return getSurface();
      case ColladaPackage.CG_NEWPARAM__SAMPLER1_D:
        return getSampler1D();
      case ColladaPackage.CG_NEWPARAM__SAMPLER2_D:
        return getSampler2D();
      case ColladaPackage.CG_NEWPARAM__SAMPLER3_D:
        return getSampler3D();
      case ColladaPackage.CG_NEWPARAM__SAMPLER_RECT:
        return getSamplerRECT();
      case ColladaPackage.CG_NEWPARAM__SAMPLER_CUBE:
        return getSamplerCUBE();
      case ColladaPackage.CG_NEWPARAM__SAMPLER_DEPTH:
        return getSamplerDEPTH();
      case ColladaPackage.CG_NEWPARAM__STRING:
        return getString();
      case ColladaPackage.CG_NEWPARAM__ENUM:
        return getEnum();
      case ColladaPackage.CG_NEWPARAM__USERTYPE:
        return getUsertype();
      case ColladaPackage.CG_NEWPARAM__ARRAY:
        return getArray();
      case ColladaPackage.CG_NEWPARAM__SID:
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
      case ColladaPackage.CG_NEWPARAM__ANNOTATE:
        getAnnotate().clear();
        getAnnotate().addAll((Collection<? extends FxAnnotateCommon>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__SEMANTIC:
        setSemantic((String)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__MODIFIER:
        setModifier((FxModifierEnumCommon)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL:
        setBool((Boolean)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL1:
        setBool1((Boolean)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL2:
        setBool2((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL3:
        setBool3((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL4:
        setBool4((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL1X1:
        setBool1x1((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL1X2:
        setBool1x2((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL1X3:
        setBool1x3((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL1X4:
        setBool1x4((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL2X1:
        setBool2x1((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL2X2:
        setBool2x2((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL2X3:
        setBool2x3((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL2X4:
        setBool2x4((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL3X1:
        setBool3x1((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL3X2:
        setBool3x2((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL3X3:
        setBool3x3((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL3X4:
        setBool3x4((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL4X1:
        setBool4x1((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL4X2:
        setBool4x2((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL4X3:
        setBool4x3((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL4X4:
        setBool4x4((List<Boolean>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT:
        setFloat((Float)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT1:
        setFloat1((Float)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT2:
        setFloat2((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT3:
        setFloat3((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT4:
        setFloat4((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT1X1:
        setFloat1x1((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT1X2:
        setFloat1x2((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT1X3:
        setFloat1x3((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT1X4:
        setFloat1x4((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT2X1:
        setFloat2x1((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT2X2:
        setFloat2x2((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT2X3:
        setFloat2x3((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT2X4:
        setFloat2x4((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT3X1:
        setFloat3x1((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT3X2:
        setFloat3x2((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT3X3:
        setFloat3x3((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT3X4:
        setFloat3x4((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT4X1:
        setFloat4x1((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT4X2:
        setFloat4x2((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT4X3:
        setFloat4x3((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT4X4:
        setFloat4x4((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT:
        setInt((Integer)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT1:
        setInt1((Integer)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT2:
        setInt2((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT3:
        setInt3((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT4:
        setInt4((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT1X1:
        setInt1x1((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT1X2:
        setInt1x2((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT1X3:
        setInt1x3((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT1X4:
        setInt1x4((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT2X1:
        setInt2x1((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT2X2:
        setInt2x2((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT2X3:
        setInt2x3((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT2X4:
        setInt2x4((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT3X1:
        setInt3x1((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT3X2:
        setInt3x2((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT3X3:
        setInt3x3((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT3X4:
        setInt3x4((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT4X1:
        setInt4x1((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT4X2:
        setInt4x2((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT4X3:
        setInt4x3((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__INT4X4:
        setInt4x4((List<Integer>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF:
        setHalf((Float)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF1:
        setHalf1((Float)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF2:
        setHalf2((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF3:
        setHalf3((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF4:
        setHalf4((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF1X1:
        setHalf1x1((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF1X2:
        setHalf1x2((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF1X3:
        setHalf1x3((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF1X4:
        setHalf1x4((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF2X1:
        setHalf2x1((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF2X2:
        setHalf2x2((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF2X3:
        setHalf2x3((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF2X4:
        setHalf2x4((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF3X1:
        setHalf3x1((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF3X2:
        setHalf3x2((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF3X3:
        setHalf3x3((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF3X4:
        setHalf3x4((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF4X1:
        setHalf4x1((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF4X2:
        setHalf4x2((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF4X3:
        setHalf4x3((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF4X4:
        setHalf4x4((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED:
        setFixed((Float)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED1:
        setFixed1((Float)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED2:
        setFixed2((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED3:
        setFixed3((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED4:
        setFixed4((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED1X1:
        setFixed1x1((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED1X2:
        setFixed1x2((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED1X3:
        setFixed1x3((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED1X4:
        setFixed1x4((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED2X1:
        setFixed2x1((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED2X2:
        setFixed2x2((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED2X3:
        setFixed2x3((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED2X4:
        setFixed2x4((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED3X1:
        setFixed3x1((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED3X2:
        setFixed3x2((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED3X3:
        setFixed3x3((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED3X4:
        setFixed3x4((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED4X1:
        setFixed4x1((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED4X2:
        setFixed4x2((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED4X3:
        setFixed4x3((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED4X4:
        setFixed4x4((List<Float>)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__SURFACE:
        setSurface((CgSurfaceType)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__SAMPLER1_D:
        setSampler1D((CgSampler1D)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__SAMPLER2_D:
        setSampler2D((CgSampler2D)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__SAMPLER3_D:
        setSampler3D((CgSampler3D)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__SAMPLER_RECT:
        setSamplerRECT((CgSamplerRECT)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__SAMPLER_CUBE:
        setSamplerCUBE((CgSamplerCUBE)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__SAMPLER_DEPTH:
        setSamplerDEPTH((CgSamplerDEPTH)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__STRING:
        setString((String)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__ENUM:
        setEnum((Enumerator)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__USERTYPE:
        setUsertype((CgSetuserType)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__ARRAY:
        setArray((CgNewarrayType)newValue);
        return;
      case ColladaPackage.CG_NEWPARAM__SID:
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
      case ColladaPackage.CG_NEWPARAM__ANNOTATE:
        getAnnotate().clear();
        return;
      case ColladaPackage.CG_NEWPARAM__SEMANTIC:
        setSemantic(SEMANTIC_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__MODIFIER:
        unsetModifier();
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL:
        unsetBool();
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL1:
        unsetBool1();
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL2:
        setBool2(BOOL2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL3:
        setBool3(BOOL3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL4:
        setBool4(BOOL4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL1X1:
        setBool1x1(BOOL1X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL1X2:
        setBool1x2(BOOL1X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL1X3:
        setBool1x3(BOOL1X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL1X4:
        setBool1x4(BOOL1X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL2X1:
        setBool2x1(BOOL2X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL2X2:
        setBool2x2(BOOL2X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL2X3:
        setBool2x3(BOOL2X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL2X4:
        setBool2x4(BOOL2X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL3X1:
        setBool3x1(BOOL3X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL3X2:
        setBool3x2(BOOL3X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL3X3:
        setBool3x3(BOOL3X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL3X4:
        setBool3x4(BOOL3X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL4X1:
        setBool4x1(BOOL4X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL4X2:
        setBool4x2(BOOL4X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL4X3:
        setBool4x3(BOOL4X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__BOOL4X4:
        setBool4x4(BOOL4X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT:
        unsetFloat();
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT1:
        unsetFloat1();
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT2:
        setFloat2(FLOAT2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT3:
        setFloat3(FLOAT3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT4:
        setFloat4(FLOAT4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT1X1:
        setFloat1x1(FLOAT1X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT1X2:
        setFloat1x2(FLOAT1X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT1X3:
        setFloat1x3(FLOAT1X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT1X4:
        setFloat1x4(FLOAT1X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT2X1:
        setFloat2x1(FLOAT2X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT2X2:
        setFloat2x2(FLOAT2X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT2X3:
        setFloat2x3(FLOAT2X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT2X4:
        setFloat2x4(FLOAT2X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT3X1:
        setFloat3x1(FLOAT3X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT3X2:
        setFloat3x2(FLOAT3X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT3X3:
        setFloat3x3(FLOAT3X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT3X4:
        setFloat3x4(FLOAT3X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT4X1:
        setFloat4x1(FLOAT4X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT4X2:
        setFloat4x2(FLOAT4X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT4X3:
        setFloat4x3(FLOAT4X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FLOAT4X4:
        setFloat4x4(FLOAT4X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT:
        unsetInt();
        return;
      case ColladaPackage.CG_NEWPARAM__INT1:
        unsetInt1();
        return;
      case ColladaPackage.CG_NEWPARAM__INT2:
        setInt2(INT2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT3:
        setInt3(INT3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT4:
        setInt4(INT4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT1X1:
        setInt1x1(INT1X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT1X2:
        setInt1x2(INT1X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT1X3:
        setInt1x3(INT1X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT1X4:
        setInt1x4(INT1X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT2X1:
        setInt2x1(INT2X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT2X2:
        setInt2x2(INT2X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT2X3:
        setInt2x3(INT2X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT2X4:
        setInt2x4(INT2X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT3X1:
        setInt3x1(INT3X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT3X2:
        setInt3x2(INT3X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT3X3:
        setInt3x3(INT3X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT3X4:
        setInt3x4(INT3X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT4X1:
        setInt4x1(INT4X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT4X2:
        setInt4x2(INT4X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT4X3:
        setInt4x3(INT4X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__INT4X4:
        setInt4x4(INT4X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF:
        unsetHalf();
        return;
      case ColladaPackage.CG_NEWPARAM__HALF1:
        unsetHalf1();
        return;
      case ColladaPackage.CG_NEWPARAM__HALF2:
        setHalf2(HALF2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF3:
        setHalf3(HALF3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF4:
        setHalf4(HALF4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF1X1:
        setHalf1x1(HALF1X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF1X2:
        setHalf1x2(HALF1X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF1X3:
        setHalf1x3(HALF1X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF1X4:
        setHalf1x4(HALF1X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF2X1:
        setHalf2x1(HALF2X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF2X2:
        setHalf2x2(HALF2X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF2X3:
        setHalf2x3(HALF2X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF2X4:
        setHalf2x4(HALF2X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF3X1:
        setHalf3x1(HALF3X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF3X2:
        setHalf3x2(HALF3X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF3X3:
        setHalf3x3(HALF3X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF3X4:
        setHalf3x4(HALF3X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF4X1:
        setHalf4x1(HALF4X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF4X2:
        setHalf4x2(HALF4X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF4X3:
        setHalf4x3(HALF4X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__HALF4X4:
        setHalf4x4(HALF4X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED:
        unsetFixed();
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED1:
        unsetFixed1();
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED2:
        setFixed2(FIXED2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED3:
        setFixed3(FIXED3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED4:
        setFixed4(FIXED4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED1X1:
        setFixed1x1(FIXED1X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED1X2:
        setFixed1x2(FIXED1X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED1X3:
        setFixed1x3(FIXED1X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED1X4:
        setFixed1x4(FIXED1X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED2X1:
        setFixed2x1(FIXED2X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED2X2:
        setFixed2x2(FIXED2X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED2X3:
        setFixed2x3(FIXED2X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED2X4:
        setFixed2x4(FIXED2X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED3X1:
        setFixed3x1(FIXED3X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED3X2:
        setFixed3x2(FIXED3X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED3X3:
        setFixed3x3(FIXED3X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED3X4:
        setFixed3x4(FIXED3X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED4X1:
        setFixed4x1(FIXED4X1_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED4X2:
        setFixed4x2(FIXED4X2_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED4X3:
        setFixed4x3(FIXED4X3_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__FIXED4X4:
        setFixed4x4(FIXED4X4_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__SURFACE:
        setSurface((CgSurfaceType)null);
        return;
      case ColladaPackage.CG_NEWPARAM__SAMPLER1_D:
        setSampler1D((CgSampler1D)null);
        return;
      case ColladaPackage.CG_NEWPARAM__SAMPLER2_D:
        setSampler2D((CgSampler2D)null);
        return;
      case ColladaPackage.CG_NEWPARAM__SAMPLER3_D:
        setSampler3D((CgSampler3D)null);
        return;
      case ColladaPackage.CG_NEWPARAM__SAMPLER_RECT:
        setSamplerRECT((CgSamplerRECT)null);
        return;
      case ColladaPackage.CG_NEWPARAM__SAMPLER_CUBE:
        setSamplerCUBE((CgSamplerCUBE)null);
        return;
      case ColladaPackage.CG_NEWPARAM__SAMPLER_DEPTH:
        setSamplerDEPTH((CgSamplerDEPTH)null);
        return;
      case ColladaPackage.CG_NEWPARAM__STRING:
        setString(STRING_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__ENUM:
        setEnum(ENUM_EDEFAULT);
        return;
      case ColladaPackage.CG_NEWPARAM__USERTYPE:
        setUsertype((CgSetuserType)null);
        return;
      case ColladaPackage.CG_NEWPARAM__ARRAY:
        setArray((CgNewarrayType)null);
        return;
      case ColladaPackage.CG_NEWPARAM__SID:
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
      case ColladaPackage.CG_NEWPARAM__ANNOTATE:
        return annotate != null && !annotate.isEmpty();
      case ColladaPackage.CG_NEWPARAM__SEMANTIC:
        return SEMANTIC_EDEFAULT == null ? semantic != null : !SEMANTIC_EDEFAULT.equals(semantic);
      case ColladaPackage.CG_NEWPARAM__MODIFIER:
        return isSetModifier();
      case ColladaPackage.CG_NEWPARAM__BOOL:
        return isSetBool();
      case ColladaPackage.CG_NEWPARAM__BOOL1:
        return isSetBool1();
      case ColladaPackage.CG_NEWPARAM__BOOL2:
        return BOOL2_EDEFAULT == null ? bool2 != null : !BOOL2_EDEFAULT.equals(bool2);
      case ColladaPackage.CG_NEWPARAM__BOOL3:
        return BOOL3_EDEFAULT == null ? bool3 != null : !BOOL3_EDEFAULT.equals(bool3);
      case ColladaPackage.CG_NEWPARAM__BOOL4:
        return BOOL4_EDEFAULT == null ? bool4 != null : !BOOL4_EDEFAULT.equals(bool4);
      case ColladaPackage.CG_NEWPARAM__BOOL1X1:
        return BOOL1X1_EDEFAULT == null ? bool1x1 != null : !BOOL1X1_EDEFAULT.equals(bool1x1);
      case ColladaPackage.CG_NEWPARAM__BOOL1X2:
        return BOOL1X2_EDEFAULT == null ? bool1x2 != null : !BOOL1X2_EDEFAULT.equals(bool1x2);
      case ColladaPackage.CG_NEWPARAM__BOOL1X3:
        return BOOL1X3_EDEFAULT == null ? bool1x3 != null : !BOOL1X3_EDEFAULT.equals(bool1x3);
      case ColladaPackage.CG_NEWPARAM__BOOL1X4:
        return BOOL1X4_EDEFAULT == null ? bool1x4 != null : !BOOL1X4_EDEFAULT.equals(bool1x4);
      case ColladaPackage.CG_NEWPARAM__BOOL2X1:
        return BOOL2X1_EDEFAULT == null ? bool2x1 != null : !BOOL2X1_EDEFAULT.equals(bool2x1);
      case ColladaPackage.CG_NEWPARAM__BOOL2X2:
        return BOOL2X2_EDEFAULT == null ? bool2x2 != null : !BOOL2X2_EDEFAULT.equals(bool2x2);
      case ColladaPackage.CG_NEWPARAM__BOOL2X3:
        return BOOL2X3_EDEFAULT == null ? bool2x3 != null : !BOOL2X3_EDEFAULT.equals(bool2x3);
      case ColladaPackage.CG_NEWPARAM__BOOL2X4:
        return BOOL2X4_EDEFAULT == null ? bool2x4 != null : !BOOL2X4_EDEFAULT.equals(bool2x4);
      case ColladaPackage.CG_NEWPARAM__BOOL3X1:
        return BOOL3X1_EDEFAULT == null ? bool3x1 != null : !BOOL3X1_EDEFAULT.equals(bool3x1);
      case ColladaPackage.CG_NEWPARAM__BOOL3X2:
        return BOOL3X2_EDEFAULT == null ? bool3x2 != null : !BOOL3X2_EDEFAULT.equals(bool3x2);
      case ColladaPackage.CG_NEWPARAM__BOOL3X3:
        return BOOL3X3_EDEFAULT == null ? bool3x3 != null : !BOOL3X3_EDEFAULT.equals(bool3x3);
      case ColladaPackage.CG_NEWPARAM__BOOL3X4:
        return BOOL3X4_EDEFAULT == null ? bool3x4 != null : !BOOL3X4_EDEFAULT.equals(bool3x4);
      case ColladaPackage.CG_NEWPARAM__BOOL4X1:
        return BOOL4X1_EDEFAULT == null ? bool4x1 != null : !BOOL4X1_EDEFAULT.equals(bool4x1);
      case ColladaPackage.CG_NEWPARAM__BOOL4X2:
        return BOOL4X2_EDEFAULT == null ? bool4x2 != null : !BOOL4X2_EDEFAULT.equals(bool4x2);
      case ColladaPackage.CG_NEWPARAM__BOOL4X3:
        return BOOL4X3_EDEFAULT == null ? bool4x3 != null : !BOOL4X3_EDEFAULT.equals(bool4x3);
      case ColladaPackage.CG_NEWPARAM__BOOL4X4:
        return BOOL4X4_EDEFAULT == null ? bool4x4 != null : !BOOL4X4_EDEFAULT.equals(bool4x4);
      case ColladaPackage.CG_NEWPARAM__FLOAT:
        return isSetFloat();
      case ColladaPackage.CG_NEWPARAM__FLOAT1:
        return isSetFloat1();
      case ColladaPackage.CG_NEWPARAM__FLOAT2:
        return FLOAT2_EDEFAULT == null ? float2 != null : !FLOAT2_EDEFAULT.equals(float2);
      case ColladaPackage.CG_NEWPARAM__FLOAT3:
        return FLOAT3_EDEFAULT == null ? float3 != null : !FLOAT3_EDEFAULT.equals(float3);
      case ColladaPackage.CG_NEWPARAM__FLOAT4:
        return FLOAT4_EDEFAULT == null ? float4 != null : !FLOAT4_EDEFAULT.equals(float4);
      case ColladaPackage.CG_NEWPARAM__FLOAT1X1:
        return FLOAT1X1_EDEFAULT == null ? float1x1 != null : !FLOAT1X1_EDEFAULT.equals(float1x1);
      case ColladaPackage.CG_NEWPARAM__FLOAT1X2:
        return FLOAT1X2_EDEFAULT == null ? float1x2 != null : !FLOAT1X2_EDEFAULT.equals(float1x2);
      case ColladaPackage.CG_NEWPARAM__FLOAT1X3:
        return FLOAT1X3_EDEFAULT == null ? float1x3 != null : !FLOAT1X3_EDEFAULT.equals(float1x3);
      case ColladaPackage.CG_NEWPARAM__FLOAT1X4:
        return FLOAT1X4_EDEFAULT == null ? float1x4 != null : !FLOAT1X4_EDEFAULT.equals(float1x4);
      case ColladaPackage.CG_NEWPARAM__FLOAT2X1:
        return FLOAT2X1_EDEFAULT == null ? float2x1 != null : !FLOAT2X1_EDEFAULT.equals(float2x1);
      case ColladaPackage.CG_NEWPARAM__FLOAT2X2:
        return FLOAT2X2_EDEFAULT == null ? float2x2 != null : !FLOAT2X2_EDEFAULT.equals(float2x2);
      case ColladaPackage.CG_NEWPARAM__FLOAT2X3:
        return FLOAT2X3_EDEFAULT == null ? float2x3 != null : !FLOAT2X3_EDEFAULT.equals(float2x3);
      case ColladaPackage.CG_NEWPARAM__FLOAT2X4:
        return FLOAT2X4_EDEFAULT == null ? float2x4 != null : !FLOAT2X4_EDEFAULT.equals(float2x4);
      case ColladaPackage.CG_NEWPARAM__FLOAT3X1:
        return FLOAT3X1_EDEFAULT == null ? float3x1 != null : !FLOAT3X1_EDEFAULT.equals(float3x1);
      case ColladaPackage.CG_NEWPARAM__FLOAT3X2:
        return FLOAT3X2_EDEFAULT == null ? float3x2 != null : !FLOAT3X2_EDEFAULT.equals(float3x2);
      case ColladaPackage.CG_NEWPARAM__FLOAT3X3:
        return FLOAT3X3_EDEFAULT == null ? float3x3 != null : !FLOAT3X3_EDEFAULT.equals(float3x3);
      case ColladaPackage.CG_NEWPARAM__FLOAT3X4:
        return FLOAT3X4_EDEFAULT == null ? float3x4 != null : !FLOAT3X4_EDEFAULT.equals(float3x4);
      case ColladaPackage.CG_NEWPARAM__FLOAT4X1:
        return FLOAT4X1_EDEFAULT == null ? float4x1 != null : !FLOAT4X1_EDEFAULT.equals(float4x1);
      case ColladaPackage.CG_NEWPARAM__FLOAT4X2:
        return FLOAT4X2_EDEFAULT == null ? float4x2 != null : !FLOAT4X2_EDEFAULT.equals(float4x2);
      case ColladaPackage.CG_NEWPARAM__FLOAT4X3:
        return FLOAT4X3_EDEFAULT == null ? float4x3 != null : !FLOAT4X3_EDEFAULT.equals(float4x3);
      case ColladaPackage.CG_NEWPARAM__FLOAT4X4:
        return FLOAT4X4_EDEFAULT == null ? float4x4 != null : !FLOAT4X4_EDEFAULT.equals(float4x4);
      case ColladaPackage.CG_NEWPARAM__INT:
        return isSetInt();
      case ColladaPackage.CG_NEWPARAM__INT1:
        return isSetInt1();
      case ColladaPackage.CG_NEWPARAM__INT2:
        return INT2_EDEFAULT == null ? int2 != null : !INT2_EDEFAULT.equals(int2);
      case ColladaPackage.CG_NEWPARAM__INT3:
        return INT3_EDEFAULT == null ? int3 != null : !INT3_EDEFAULT.equals(int3);
      case ColladaPackage.CG_NEWPARAM__INT4:
        return INT4_EDEFAULT == null ? int4 != null : !INT4_EDEFAULT.equals(int4);
      case ColladaPackage.CG_NEWPARAM__INT1X1:
        return INT1X1_EDEFAULT == null ? int1x1 != null : !INT1X1_EDEFAULT.equals(int1x1);
      case ColladaPackage.CG_NEWPARAM__INT1X2:
        return INT1X2_EDEFAULT == null ? int1x2 != null : !INT1X2_EDEFAULT.equals(int1x2);
      case ColladaPackage.CG_NEWPARAM__INT1X3:
        return INT1X3_EDEFAULT == null ? int1x3 != null : !INT1X3_EDEFAULT.equals(int1x3);
      case ColladaPackage.CG_NEWPARAM__INT1X4:
        return INT1X4_EDEFAULT == null ? int1x4 != null : !INT1X4_EDEFAULT.equals(int1x4);
      case ColladaPackage.CG_NEWPARAM__INT2X1:
        return INT2X1_EDEFAULT == null ? int2x1 != null : !INT2X1_EDEFAULT.equals(int2x1);
      case ColladaPackage.CG_NEWPARAM__INT2X2:
        return INT2X2_EDEFAULT == null ? int2x2 != null : !INT2X2_EDEFAULT.equals(int2x2);
      case ColladaPackage.CG_NEWPARAM__INT2X3:
        return INT2X3_EDEFAULT == null ? int2x3 != null : !INT2X3_EDEFAULT.equals(int2x3);
      case ColladaPackage.CG_NEWPARAM__INT2X4:
        return INT2X4_EDEFAULT == null ? int2x4 != null : !INT2X4_EDEFAULT.equals(int2x4);
      case ColladaPackage.CG_NEWPARAM__INT3X1:
        return INT3X1_EDEFAULT == null ? int3x1 != null : !INT3X1_EDEFAULT.equals(int3x1);
      case ColladaPackage.CG_NEWPARAM__INT3X2:
        return INT3X2_EDEFAULT == null ? int3x2 != null : !INT3X2_EDEFAULT.equals(int3x2);
      case ColladaPackage.CG_NEWPARAM__INT3X3:
        return INT3X3_EDEFAULT == null ? int3x3 != null : !INT3X3_EDEFAULT.equals(int3x3);
      case ColladaPackage.CG_NEWPARAM__INT3X4:
        return INT3X4_EDEFAULT == null ? int3x4 != null : !INT3X4_EDEFAULT.equals(int3x4);
      case ColladaPackage.CG_NEWPARAM__INT4X1:
        return INT4X1_EDEFAULT == null ? int4x1 != null : !INT4X1_EDEFAULT.equals(int4x1);
      case ColladaPackage.CG_NEWPARAM__INT4X2:
        return INT4X2_EDEFAULT == null ? int4x2 != null : !INT4X2_EDEFAULT.equals(int4x2);
      case ColladaPackage.CG_NEWPARAM__INT4X3:
        return INT4X3_EDEFAULT == null ? int4x3 != null : !INT4X3_EDEFAULT.equals(int4x3);
      case ColladaPackage.CG_NEWPARAM__INT4X4:
        return INT4X4_EDEFAULT == null ? int4x4 != null : !INT4X4_EDEFAULT.equals(int4x4);
      case ColladaPackage.CG_NEWPARAM__HALF:
        return isSetHalf();
      case ColladaPackage.CG_NEWPARAM__HALF1:
        return isSetHalf1();
      case ColladaPackage.CG_NEWPARAM__HALF2:
        return HALF2_EDEFAULT == null ? half2 != null : !HALF2_EDEFAULT.equals(half2);
      case ColladaPackage.CG_NEWPARAM__HALF3:
        return HALF3_EDEFAULT == null ? half3 != null : !HALF3_EDEFAULT.equals(half3);
      case ColladaPackage.CG_NEWPARAM__HALF4:
        return HALF4_EDEFAULT == null ? half4 != null : !HALF4_EDEFAULT.equals(half4);
      case ColladaPackage.CG_NEWPARAM__HALF1X1:
        return HALF1X1_EDEFAULT == null ? half1x1 != null : !HALF1X1_EDEFAULT.equals(half1x1);
      case ColladaPackage.CG_NEWPARAM__HALF1X2:
        return HALF1X2_EDEFAULT == null ? half1x2 != null : !HALF1X2_EDEFAULT.equals(half1x2);
      case ColladaPackage.CG_NEWPARAM__HALF1X3:
        return HALF1X3_EDEFAULT == null ? half1x3 != null : !HALF1X3_EDEFAULT.equals(half1x3);
      case ColladaPackage.CG_NEWPARAM__HALF1X4:
        return HALF1X4_EDEFAULT == null ? half1x4 != null : !HALF1X4_EDEFAULT.equals(half1x4);
      case ColladaPackage.CG_NEWPARAM__HALF2X1:
        return HALF2X1_EDEFAULT == null ? half2x1 != null : !HALF2X1_EDEFAULT.equals(half2x1);
      case ColladaPackage.CG_NEWPARAM__HALF2X2:
        return HALF2X2_EDEFAULT == null ? half2x2 != null : !HALF2X2_EDEFAULT.equals(half2x2);
      case ColladaPackage.CG_NEWPARAM__HALF2X3:
        return HALF2X3_EDEFAULT == null ? half2x3 != null : !HALF2X3_EDEFAULT.equals(half2x3);
      case ColladaPackage.CG_NEWPARAM__HALF2X4:
        return HALF2X4_EDEFAULT == null ? half2x4 != null : !HALF2X4_EDEFAULT.equals(half2x4);
      case ColladaPackage.CG_NEWPARAM__HALF3X1:
        return HALF3X1_EDEFAULT == null ? half3x1 != null : !HALF3X1_EDEFAULT.equals(half3x1);
      case ColladaPackage.CG_NEWPARAM__HALF3X2:
        return HALF3X2_EDEFAULT == null ? half3x2 != null : !HALF3X2_EDEFAULT.equals(half3x2);
      case ColladaPackage.CG_NEWPARAM__HALF3X3:
        return HALF3X3_EDEFAULT == null ? half3x3 != null : !HALF3X3_EDEFAULT.equals(half3x3);
      case ColladaPackage.CG_NEWPARAM__HALF3X4:
        return HALF3X4_EDEFAULT == null ? half3x4 != null : !HALF3X4_EDEFAULT.equals(half3x4);
      case ColladaPackage.CG_NEWPARAM__HALF4X1:
        return HALF4X1_EDEFAULT == null ? half4x1 != null : !HALF4X1_EDEFAULT.equals(half4x1);
      case ColladaPackage.CG_NEWPARAM__HALF4X2:
        return HALF4X2_EDEFAULT == null ? half4x2 != null : !HALF4X2_EDEFAULT.equals(half4x2);
      case ColladaPackage.CG_NEWPARAM__HALF4X3:
        return HALF4X3_EDEFAULT == null ? half4x3 != null : !HALF4X3_EDEFAULT.equals(half4x3);
      case ColladaPackage.CG_NEWPARAM__HALF4X4:
        return HALF4X4_EDEFAULT == null ? half4x4 != null : !HALF4X4_EDEFAULT.equals(half4x4);
      case ColladaPackage.CG_NEWPARAM__FIXED:
        return isSetFixed();
      case ColladaPackage.CG_NEWPARAM__FIXED1:
        return isSetFixed1();
      case ColladaPackage.CG_NEWPARAM__FIXED2:
        return FIXED2_EDEFAULT == null ? fixed2 != null : !FIXED2_EDEFAULT.equals(fixed2);
      case ColladaPackage.CG_NEWPARAM__FIXED3:
        return FIXED3_EDEFAULT == null ? fixed3 != null : !FIXED3_EDEFAULT.equals(fixed3);
      case ColladaPackage.CG_NEWPARAM__FIXED4:
        return FIXED4_EDEFAULT == null ? fixed4 != null : !FIXED4_EDEFAULT.equals(fixed4);
      case ColladaPackage.CG_NEWPARAM__FIXED1X1:
        return FIXED1X1_EDEFAULT == null ? fixed1x1 != null : !FIXED1X1_EDEFAULT.equals(fixed1x1);
      case ColladaPackage.CG_NEWPARAM__FIXED1X2:
        return FIXED1X2_EDEFAULT == null ? fixed1x2 != null : !FIXED1X2_EDEFAULT.equals(fixed1x2);
      case ColladaPackage.CG_NEWPARAM__FIXED1X3:
        return FIXED1X3_EDEFAULT == null ? fixed1x3 != null : !FIXED1X3_EDEFAULT.equals(fixed1x3);
      case ColladaPackage.CG_NEWPARAM__FIXED1X4:
        return FIXED1X4_EDEFAULT == null ? fixed1x4 != null : !FIXED1X4_EDEFAULT.equals(fixed1x4);
      case ColladaPackage.CG_NEWPARAM__FIXED2X1:
        return FIXED2X1_EDEFAULT == null ? fixed2x1 != null : !FIXED2X1_EDEFAULT.equals(fixed2x1);
      case ColladaPackage.CG_NEWPARAM__FIXED2X2:
        return FIXED2X2_EDEFAULT == null ? fixed2x2 != null : !FIXED2X2_EDEFAULT.equals(fixed2x2);
      case ColladaPackage.CG_NEWPARAM__FIXED2X3:
        return FIXED2X3_EDEFAULT == null ? fixed2x3 != null : !FIXED2X3_EDEFAULT.equals(fixed2x3);
      case ColladaPackage.CG_NEWPARAM__FIXED2X4:
        return FIXED2X4_EDEFAULT == null ? fixed2x4 != null : !FIXED2X4_EDEFAULT.equals(fixed2x4);
      case ColladaPackage.CG_NEWPARAM__FIXED3X1:
        return FIXED3X1_EDEFAULT == null ? fixed3x1 != null : !FIXED3X1_EDEFAULT.equals(fixed3x1);
      case ColladaPackage.CG_NEWPARAM__FIXED3X2:
        return FIXED3X2_EDEFAULT == null ? fixed3x2 != null : !FIXED3X2_EDEFAULT.equals(fixed3x2);
      case ColladaPackage.CG_NEWPARAM__FIXED3X3:
        return FIXED3X3_EDEFAULT == null ? fixed3x3 != null : !FIXED3X3_EDEFAULT.equals(fixed3x3);
      case ColladaPackage.CG_NEWPARAM__FIXED3X4:
        return FIXED3X4_EDEFAULT == null ? fixed3x4 != null : !FIXED3X4_EDEFAULT.equals(fixed3x4);
      case ColladaPackage.CG_NEWPARAM__FIXED4X1:
        return FIXED4X1_EDEFAULT == null ? fixed4x1 != null : !FIXED4X1_EDEFAULT.equals(fixed4x1);
      case ColladaPackage.CG_NEWPARAM__FIXED4X2:
        return FIXED4X2_EDEFAULT == null ? fixed4x2 != null : !FIXED4X2_EDEFAULT.equals(fixed4x2);
      case ColladaPackage.CG_NEWPARAM__FIXED4X3:
        return FIXED4X3_EDEFAULT == null ? fixed4x3 != null : !FIXED4X3_EDEFAULT.equals(fixed4x3);
      case ColladaPackage.CG_NEWPARAM__FIXED4X4:
        return FIXED4X4_EDEFAULT == null ? fixed4x4 != null : !FIXED4X4_EDEFAULT.equals(fixed4x4);
      case ColladaPackage.CG_NEWPARAM__SURFACE:
        return surface != null;
      case ColladaPackage.CG_NEWPARAM__SAMPLER1_D:
        return sampler1D != null;
      case ColladaPackage.CG_NEWPARAM__SAMPLER2_D:
        return sampler2D != null;
      case ColladaPackage.CG_NEWPARAM__SAMPLER3_D:
        return sampler3D != null;
      case ColladaPackage.CG_NEWPARAM__SAMPLER_RECT:
        return samplerRECT != null;
      case ColladaPackage.CG_NEWPARAM__SAMPLER_CUBE:
        return samplerCUBE != null;
      case ColladaPackage.CG_NEWPARAM__SAMPLER_DEPTH:
        return samplerDEPTH != null;
      case ColladaPackage.CG_NEWPARAM__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
      case ColladaPackage.CG_NEWPARAM__ENUM:
        return ENUM_EDEFAULT == null ? enum_ != null : !ENUM_EDEFAULT.equals(enum_);
      case ColladaPackage.CG_NEWPARAM__USERTYPE:
        return usertype != null;
      case ColladaPackage.CG_NEWPARAM__ARRAY:
        return array != null;
      case ColladaPackage.CG_NEWPARAM__SID:
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
    result.append(", bool1: ");
    if (bool1ESet) result.append(bool1); else result.append("<unset>");
    result.append(", bool2: ");
    result.append(bool2);
    result.append(", bool3: ");
    result.append(bool3);
    result.append(", bool4: ");
    result.append(bool4);
    result.append(", bool1x1: ");
    result.append(bool1x1);
    result.append(", bool1x2: ");
    result.append(bool1x2);
    result.append(", bool1x3: ");
    result.append(bool1x3);
    result.append(", bool1x4: ");
    result.append(bool1x4);
    result.append(", bool2x1: ");
    result.append(bool2x1);
    result.append(", bool2x2: ");
    result.append(bool2x2);
    result.append(", bool2x3: ");
    result.append(bool2x3);
    result.append(", bool2x4: ");
    result.append(bool2x4);
    result.append(", bool3x1: ");
    result.append(bool3x1);
    result.append(", bool3x2: ");
    result.append(bool3x2);
    result.append(", bool3x3: ");
    result.append(bool3x3);
    result.append(", bool3x4: ");
    result.append(bool3x4);
    result.append(", bool4x1: ");
    result.append(bool4x1);
    result.append(", bool4x2: ");
    result.append(bool4x2);
    result.append(", bool4x3: ");
    result.append(bool4x3);
    result.append(", bool4x4: ");
    result.append(bool4x4);
    result.append(", float: ");
    if (floatESet) result.append(float_); else result.append("<unset>");
    result.append(", float1: ");
    if (float1ESet) result.append(float1); else result.append("<unset>");
    result.append(", float2: ");
    result.append(float2);
    result.append(", float3: ");
    result.append(float3);
    result.append(", float4: ");
    result.append(float4);
    result.append(", float1x1: ");
    result.append(float1x1);
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
    result.append(", int: ");
    if (intESet) result.append(int_); else result.append("<unset>");
    result.append(", int1: ");
    if (int1ESet) result.append(int1); else result.append("<unset>");
    result.append(", int2: ");
    result.append(int2);
    result.append(", int3: ");
    result.append(int3);
    result.append(", int4: ");
    result.append(int4);
    result.append(", int1x1: ");
    result.append(int1x1);
    result.append(", int1x2: ");
    result.append(int1x2);
    result.append(", int1x3: ");
    result.append(int1x3);
    result.append(", int1x4: ");
    result.append(int1x4);
    result.append(", int2x1: ");
    result.append(int2x1);
    result.append(", int2x2: ");
    result.append(int2x2);
    result.append(", int2x3: ");
    result.append(int2x3);
    result.append(", int2x4: ");
    result.append(int2x4);
    result.append(", int3x1: ");
    result.append(int3x1);
    result.append(", int3x2: ");
    result.append(int3x2);
    result.append(", int3x3: ");
    result.append(int3x3);
    result.append(", int3x4: ");
    result.append(int3x4);
    result.append(", int4x1: ");
    result.append(int4x1);
    result.append(", int4x2: ");
    result.append(int4x2);
    result.append(", int4x3: ");
    result.append(int4x3);
    result.append(", int4x4: ");
    result.append(int4x4);
    result.append(", half: ");
    if (halfESet) result.append(half); else result.append("<unset>");
    result.append(", half1: ");
    if (half1ESet) result.append(half1); else result.append("<unset>");
    result.append(", half2: ");
    result.append(half2);
    result.append(", half3: ");
    result.append(half3);
    result.append(", half4: ");
    result.append(half4);
    result.append(", half1x1: ");
    result.append(half1x1);
    result.append(", half1x2: ");
    result.append(half1x2);
    result.append(", half1x3: ");
    result.append(half1x3);
    result.append(", half1x4: ");
    result.append(half1x4);
    result.append(", half2x1: ");
    result.append(half2x1);
    result.append(", half2x2: ");
    result.append(half2x2);
    result.append(", half2x3: ");
    result.append(half2x3);
    result.append(", half2x4: ");
    result.append(half2x4);
    result.append(", half3x1: ");
    result.append(half3x1);
    result.append(", half3x2: ");
    result.append(half3x2);
    result.append(", half3x3: ");
    result.append(half3x3);
    result.append(", half3x4: ");
    result.append(half3x4);
    result.append(", half4x1: ");
    result.append(half4x1);
    result.append(", half4x2: ");
    result.append(half4x2);
    result.append(", half4x3: ");
    result.append(half4x3);
    result.append(", half4x4: ");
    result.append(half4x4);
    result.append(", fixed: ");
    if (fixedESet) result.append(fixed); else result.append("<unset>");
    result.append(", fixed1: ");
    if (fixed1ESet) result.append(fixed1); else result.append("<unset>");
    result.append(", fixed2: ");
    result.append(fixed2);
    result.append(", fixed3: ");
    result.append(fixed3);
    result.append(", fixed4: ");
    result.append(fixed4);
    result.append(", fixed1x1: ");
    result.append(fixed1x1);
    result.append(", fixed1x2: ");
    result.append(fixed1x2);
    result.append(", fixed1x3: ");
    result.append(fixed1x3);
    result.append(", fixed1x4: ");
    result.append(fixed1x4);
    result.append(", fixed2x1: ");
    result.append(fixed2x1);
    result.append(", fixed2x2: ");
    result.append(fixed2x2);
    result.append(", fixed2x3: ");
    result.append(fixed2x3);
    result.append(", fixed2x4: ");
    result.append(fixed2x4);
    result.append(", fixed3x1: ");
    result.append(fixed3x1);
    result.append(", fixed3x2: ");
    result.append(fixed3x2);
    result.append(", fixed3x3: ");
    result.append(fixed3x3);
    result.append(", fixed3x4: ");
    result.append(fixed3x4);
    result.append(", fixed4x1: ");
    result.append(fixed4x1);
    result.append(", fixed4x2: ");
    result.append(fixed4x2);
    result.append(", fixed4x3: ");
    result.append(fixed4x3);
    result.append(", fixed4x4: ");
    result.append(fixed4x4);
    result.append(", string: ");
    result.append(string);
    result.append(", enum: ");
    result.append(enum_);
    result.append(", sid: ");
    result.append(sid);
    result.append(')');
    return result.toString();
  }

} //CgNewparamImpl
