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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.CgConnectParam;
import org.khronos.collada.CgSampler1D;
import org.khronos.collada.CgSampler2D;
import org.khronos.collada.CgSampler3D;
import org.khronos.collada.CgSamplerCUBE;
import org.khronos.collada.CgSamplerDEPTH;
import org.khronos.collada.CgSamplerRECT;
import org.khronos.collada.CgSetarrayType;
import org.khronos.collada.CgSetparam;
import org.khronos.collada.CgSetuserType;
import org.khronos.collada.CgSurfaceType;
import org.khronos.collada.ColladaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cg Setuser Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool1 <em>Bool1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool2 <em>Bool2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool3 <em>Bool3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool4 <em>Bool4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool1x1 <em>Bool1x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool1x2 <em>Bool1x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool1x3 <em>Bool1x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool1x4 <em>Bool1x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool2x1 <em>Bool2x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool2x2 <em>Bool2x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool2x3 <em>Bool2x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool2x4 <em>Bool2x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool3x1 <em>Bool3x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool3x2 <em>Bool3x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool3x3 <em>Bool3x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool3x4 <em>Bool3x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool4x1 <em>Bool4x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool4x2 <em>Bool4x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool4x3 <em>Bool4x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getBool4x4 <em>Bool4x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat1 <em>Float1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat1x1 <em>Float1x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat1x2 <em>Float1x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat1x3 <em>Float1x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat1x4 <em>Float1x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat2x1 <em>Float2x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat2x2 <em>Float2x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat2x3 <em>Float2x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat2x4 <em>Float2x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat3x1 <em>Float3x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat3x2 <em>Float3x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat3x3 <em>Float3x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat3x4 <em>Float3x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat4x1 <em>Float4x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat4x2 <em>Float4x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat4x3 <em>Float4x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt1 <em>Int1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt2 <em>Int2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt3 <em>Int3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt1x1 <em>Int1x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt1x2 <em>Int1x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt1x3 <em>Int1x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt1x4 <em>Int1x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt2x1 <em>Int2x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt2x2 <em>Int2x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt2x3 <em>Int2x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt2x4 <em>Int2x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt3x1 <em>Int3x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt3x2 <em>Int3x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt3x3 <em>Int3x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt3x4 <em>Int3x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt4x1 <em>Int4x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt4x2 <em>Int4x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt4x3 <em>Int4x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getInt4x4 <em>Int4x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf <em>Half</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf1 <em>Half1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf2 <em>Half2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf3 <em>Half3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf4 <em>Half4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf1x1 <em>Half1x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf1x2 <em>Half1x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf1x3 <em>Half1x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf1x4 <em>Half1x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf2x1 <em>Half2x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf2x2 <em>Half2x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf2x3 <em>Half2x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf2x4 <em>Half2x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf3x1 <em>Half3x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf3x2 <em>Half3x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf3x3 <em>Half3x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf3x4 <em>Half3x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf4x1 <em>Half4x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf4x2 <em>Half4x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf4x3 <em>Half4x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getHalf4x4 <em>Half4x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed1 <em>Fixed1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed2 <em>Fixed2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed3 <em>Fixed3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed4 <em>Fixed4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed1x1 <em>Fixed1x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed1x2 <em>Fixed1x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed1x3 <em>Fixed1x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed1x4 <em>Fixed1x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed2x1 <em>Fixed2x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed2x2 <em>Fixed2x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed2x3 <em>Fixed2x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed2x4 <em>Fixed2x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed3x1 <em>Fixed3x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed3x2 <em>Fixed3x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed3x3 <em>Fixed3x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed3x4 <em>Fixed3x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed4x1 <em>Fixed4x1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed4x2 <em>Fixed4x2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed4x3 <em>Fixed4x3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getFixed4x4 <em>Fixed4x4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getSampler1D <em>Sampler1 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getSampler2D <em>Sampler2 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getSampler3D <em>Sampler3 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getSamplerRECT <em>Sampler RECT</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getSamplerCUBE <em>Sampler CUBE</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getSamplerDEPTH <em>Sampler DEPTH</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getString <em>String</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getUsertype <em>Usertype</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getConnectParam <em>Connect Param</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getSetparam <em>Setparam</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CgSetuserTypeImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CgSetuserTypeImpl extends EObjectImpl implements CgSetuserType {
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
   * The cached value of the '{@link #getSetparam() <em>Setparam</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSetparam()
   * @generated
   * @ordered
   */
	protected EList<CgSetparam> setparam;

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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CgSetuserTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getCgSetuserType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null)
    {
      group = new BasicFeatureMap(this, ColladaPackage.CG_SETUSER_TYPE__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Boolean> getBool() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Boolean> getBool1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool1x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool1x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool1x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool1x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool1x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool1x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool1x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool1x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool2x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool2x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool2x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool2x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool2x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool2x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool2x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool2x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool3x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool3x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool3x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool3x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool3x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool3x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool3x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool3x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool4x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool4x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool4x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool4x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool4x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool4x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getBool4x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Bool4x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Float> getFloat() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Float> getFloat1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat1x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float1x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat1x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float1x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat1x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float1x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat1x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float1x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat2x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float2x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat2x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float2x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat2x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float2x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat2x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float2x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat3x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float3x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat3x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float3x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat3x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float3x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat3x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float3x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat4x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float4x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat4x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float4x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat4x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float4x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFloat4x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Float4x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Integer> getInt() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Integer> getInt1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt1x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int1x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt1x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int1x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt1x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int1x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt1x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int1x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt2x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int2x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt2x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int2x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt2x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int2x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt2x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int2x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt3x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int3x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt3x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int3x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt3x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int3x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt3x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int3x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt4x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int4x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt4x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int4x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt4x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int4x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getInt4x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Int4x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Float> getHalf() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Float> getHalf1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf1x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half1x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf1x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half1x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf1x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half1x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf1x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half1x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf2x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half2x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf2x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half2x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf2x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half2x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf2x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half2x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf3x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half3x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf3x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half3x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf3x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half3x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf3x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half3x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf4x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half4x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf4x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half4x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf4x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half4x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getHalf4x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Half4x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Float> getFixed() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Float> getFixed1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed1x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed1x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed1x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed1x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed1x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed1x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed1x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed1x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed2x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed2x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed2x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed2x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed2x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed2x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed2x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed2x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed3x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed3x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed3x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed3x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed3x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed3x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed3x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed3x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed4x1() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed4x1());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed4x2() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed4x2());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed4x3() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed4x3());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public EList<List> getFixed4x4() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Fixed4x4());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CgSurfaceType> getSurface() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Surface());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CgSampler1D> getSampler1D() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Sampler1D());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CgSampler2D> getSampler2D() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Sampler2D());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CgSampler3D> getSampler3D() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Sampler3D());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CgSamplerRECT> getSamplerRECT() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_SamplerRECT());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CgSamplerCUBE> getSamplerCUBE() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_SamplerCUBE());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CgSamplerDEPTH> getSamplerDEPTH() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_SamplerDEPTH());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<String> getString() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_String());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Enumerator> getEnum() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Enum());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CgSetarrayType> getArray() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Array());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CgSetuserType> getUsertype() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_Usertype());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CgConnectParam> getConnectParam() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCgSetuserType_ConnectParam());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CgSetparam> getSetparam() {
    if (setparam == null)
    {
      setparam = new EObjectContainmentEList<CgSetparam>(CgSetparam.class, this, ColladaPackage.CG_SETUSER_TYPE__SETPARAM);
    }
    return setparam;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_SETUSER_TYPE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CG_SETUSER_TYPE__SOURCE, oldSource, source));
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
      case ColladaPackage.CG_SETUSER_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.CG_SETUSER_TYPE__SURFACE:
        return ((InternalEList<?>)getSurface()).basicRemove(otherEnd, msgs);
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER1_D:
        return ((InternalEList<?>)getSampler1D()).basicRemove(otherEnd, msgs);
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER2_D:
        return ((InternalEList<?>)getSampler2D()).basicRemove(otherEnd, msgs);
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER3_D:
        return ((InternalEList<?>)getSampler3D()).basicRemove(otherEnd, msgs);
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER_RECT:
        return ((InternalEList<?>)getSamplerRECT()).basicRemove(otherEnd, msgs);
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER_CUBE:
        return ((InternalEList<?>)getSamplerCUBE()).basicRemove(otherEnd, msgs);
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER_DEPTH:
        return ((InternalEList<?>)getSamplerDEPTH()).basicRemove(otherEnd, msgs);
      case ColladaPackage.CG_SETUSER_TYPE__ARRAY:
        return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
      case ColladaPackage.CG_SETUSER_TYPE__USERTYPE:
        return ((InternalEList<?>)getUsertype()).basicRemove(otherEnd, msgs);
      case ColladaPackage.CG_SETUSER_TYPE__CONNECT_PARAM:
        return ((InternalEList<?>)getConnectParam()).basicRemove(otherEnd, msgs);
      case ColladaPackage.CG_SETUSER_TYPE__SETPARAM:
        return ((InternalEList<?>)getSetparam()).basicRemove(otherEnd, msgs);
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
      case ColladaPackage.CG_SETUSER_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL:
        return getBool();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1:
        return getBool1();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2:
        return getBool2();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3:
        return getBool3();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4:
        return getBool4();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X1:
        return getBool1x1();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X2:
        return getBool1x2();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X3:
        return getBool1x3();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X4:
        return getBool1x4();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X1:
        return getBool2x1();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X2:
        return getBool2x2();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X3:
        return getBool2x3();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X4:
        return getBool2x4();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X1:
        return getBool3x1();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X2:
        return getBool3x2();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X3:
        return getBool3x3();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X4:
        return getBool3x4();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X1:
        return getBool4x1();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X2:
        return getBool4x2();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X3:
        return getBool4x3();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X4:
        return getBool4x4();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT:
        return getFloat();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1:
        return getFloat1();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2:
        return getFloat2();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3:
        return getFloat3();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4:
        return getFloat4();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X1:
        return getFloat1x1();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X2:
        return getFloat1x2();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X3:
        return getFloat1x3();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X4:
        return getFloat1x4();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X1:
        return getFloat2x1();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X2:
        return getFloat2x2();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X3:
        return getFloat2x3();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X4:
        return getFloat2x4();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X1:
        return getFloat3x1();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X2:
        return getFloat3x2();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X3:
        return getFloat3x3();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X4:
        return getFloat3x4();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X1:
        return getFloat4x1();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X2:
        return getFloat4x2();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X3:
        return getFloat4x3();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X4:
        return getFloat4x4();
      case ColladaPackage.CG_SETUSER_TYPE__INT:
        return getInt();
      case ColladaPackage.CG_SETUSER_TYPE__INT1:
        return getInt1();
      case ColladaPackage.CG_SETUSER_TYPE__INT2:
        return getInt2();
      case ColladaPackage.CG_SETUSER_TYPE__INT3:
        return getInt3();
      case ColladaPackage.CG_SETUSER_TYPE__INT4:
        return getInt4();
      case ColladaPackage.CG_SETUSER_TYPE__INT1X1:
        return getInt1x1();
      case ColladaPackage.CG_SETUSER_TYPE__INT1X2:
        return getInt1x2();
      case ColladaPackage.CG_SETUSER_TYPE__INT1X3:
        return getInt1x3();
      case ColladaPackage.CG_SETUSER_TYPE__INT1X4:
        return getInt1x4();
      case ColladaPackage.CG_SETUSER_TYPE__INT2X1:
        return getInt2x1();
      case ColladaPackage.CG_SETUSER_TYPE__INT2X2:
        return getInt2x2();
      case ColladaPackage.CG_SETUSER_TYPE__INT2X3:
        return getInt2x3();
      case ColladaPackage.CG_SETUSER_TYPE__INT2X4:
        return getInt2x4();
      case ColladaPackage.CG_SETUSER_TYPE__INT3X1:
        return getInt3x1();
      case ColladaPackage.CG_SETUSER_TYPE__INT3X2:
        return getInt3x2();
      case ColladaPackage.CG_SETUSER_TYPE__INT3X3:
        return getInt3x3();
      case ColladaPackage.CG_SETUSER_TYPE__INT3X4:
        return getInt3x4();
      case ColladaPackage.CG_SETUSER_TYPE__INT4X1:
        return getInt4x1();
      case ColladaPackage.CG_SETUSER_TYPE__INT4X2:
        return getInt4x2();
      case ColladaPackage.CG_SETUSER_TYPE__INT4X3:
        return getInt4x3();
      case ColladaPackage.CG_SETUSER_TYPE__INT4X4:
        return getInt4x4();
      case ColladaPackage.CG_SETUSER_TYPE__HALF:
        return getHalf();
      case ColladaPackage.CG_SETUSER_TYPE__HALF1:
        return getHalf1();
      case ColladaPackage.CG_SETUSER_TYPE__HALF2:
        return getHalf2();
      case ColladaPackage.CG_SETUSER_TYPE__HALF3:
        return getHalf3();
      case ColladaPackage.CG_SETUSER_TYPE__HALF4:
        return getHalf4();
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X1:
        return getHalf1x1();
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X2:
        return getHalf1x2();
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X3:
        return getHalf1x3();
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X4:
        return getHalf1x4();
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X1:
        return getHalf2x1();
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X2:
        return getHalf2x2();
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X3:
        return getHalf2x3();
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X4:
        return getHalf2x4();
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X1:
        return getHalf3x1();
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X2:
        return getHalf3x2();
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X3:
        return getHalf3x3();
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X4:
        return getHalf3x4();
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X1:
        return getHalf4x1();
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X2:
        return getHalf4x2();
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X3:
        return getHalf4x3();
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X4:
        return getHalf4x4();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED:
        return getFixed();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1:
        return getFixed1();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2:
        return getFixed2();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3:
        return getFixed3();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4:
        return getFixed4();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X1:
        return getFixed1x1();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X2:
        return getFixed1x2();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X3:
        return getFixed1x3();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X4:
        return getFixed1x4();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X1:
        return getFixed2x1();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X2:
        return getFixed2x2();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X3:
        return getFixed2x3();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X4:
        return getFixed2x4();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X1:
        return getFixed3x1();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X2:
        return getFixed3x2();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X3:
        return getFixed3x3();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X4:
        return getFixed3x4();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X1:
        return getFixed4x1();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X2:
        return getFixed4x2();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X3:
        return getFixed4x3();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X4:
        return getFixed4x4();
      case ColladaPackage.CG_SETUSER_TYPE__SURFACE:
        return getSurface();
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER1_D:
        return getSampler1D();
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER2_D:
        return getSampler2D();
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER3_D:
        return getSampler3D();
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER_RECT:
        return getSamplerRECT();
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER_CUBE:
        return getSamplerCUBE();
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER_DEPTH:
        return getSamplerDEPTH();
      case ColladaPackage.CG_SETUSER_TYPE__STRING:
        return getString();
      case ColladaPackage.CG_SETUSER_TYPE__ENUM:
        return getEnum();
      case ColladaPackage.CG_SETUSER_TYPE__ARRAY:
        return getArray();
      case ColladaPackage.CG_SETUSER_TYPE__USERTYPE:
        return getUsertype();
      case ColladaPackage.CG_SETUSER_TYPE__CONNECT_PARAM:
        return getConnectParam();
      case ColladaPackage.CG_SETUSER_TYPE__SETPARAM:
        return getSetparam();
      case ColladaPackage.CG_SETUSER_TYPE__NAME:
        return getName();
      case ColladaPackage.CG_SETUSER_TYPE__SOURCE:
        return getSource();
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
      case ColladaPackage.CG_SETUSER_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL:
        getBool().clear();
        getBool().addAll((Collection<? extends Boolean>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1:
        getBool1().clear();
        getBool1().addAll((Collection<? extends Boolean>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2:
        getBool2().clear();
        getBool2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3:
        getBool3().clear();
        getBool3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4:
        getBool4().clear();
        getBool4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X1:
        getBool1x1().clear();
        getBool1x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X2:
        getBool1x2().clear();
        getBool1x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X3:
        getBool1x3().clear();
        getBool1x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X4:
        getBool1x4().clear();
        getBool1x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X1:
        getBool2x1().clear();
        getBool2x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X2:
        getBool2x2().clear();
        getBool2x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X3:
        getBool2x3().clear();
        getBool2x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X4:
        getBool2x4().clear();
        getBool2x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X1:
        getBool3x1().clear();
        getBool3x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X2:
        getBool3x2().clear();
        getBool3x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X3:
        getBool3x3().clear();
        getBool3x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X4:
        getBool3x4().clear();
        getBool3x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X1:
        getBool4x1().clear();
        getBool4x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X2:
        getBool4x2().clear();
        getBool4x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X3:
        getBool4x3().clear();
        getBool4x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X4:
        getBool4x4().clear();
        getBool4x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT:
        getFloat().clear();
        getFloat().addAll((Collection<? extends Float>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1:
        getFloat1().clear();
        getFloat1().addAll((Collection<? extends Float>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2:
        getFloat2().clear();
        getFloat2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3:
        getFloat3().clear();
        getFloat3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4:
        getFloat4().clear();
        getFloat4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X1:
        getFloat1x1().clear();
        getFloat1x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X2:
        getFloat1x2().clear();
        getFloat1x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X3:
        getFloat1x3().clear();
        getFloat1x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X4:
        getFloat1x4().clear();
        getFloat1x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X1:
        getFloat2x1().clear();
        getFloat2x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X2:
        getFloat2x2().clear();
        getFloat2x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X3:
        getFloat2x3().clear();
        getFloat2x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X4:
        getFloat2x4().clear();
        getFloat2x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X1:
        getFloat3x1().clear();
        getFloat3x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X2:
        getFloat3x2().clear();
        getFloat3x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X3:
        getFloat3x3().clear();
        getFloat3x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X4:
        getFloat3x4().clear();
        getFloat3x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X1:
        getFloat4x1().clear();
        getFloat4x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X2:
        getFloat4x2().clear();
        getFloat4x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X3:
        getFloat4x3().clear();
        getFloat4x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X4:
        getFloat4x4().clear();
        getFloat4x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT:
        getInt().clear();
        getInt().addAll((Collection<? extends Integer>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT1:
        getInt1().clear();
        getInt1().addAll((Collection<? extends Integer>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT2:
        getInt2().clear();
        getInt2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT3:
        getInt3().clear();
        getInt3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT4:
        getInt4().clear();
        getInt4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT1X1:
        getInt1x1().clear();
        getInt1x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT1X2:
        getInt1x2().clear();
        getInt1x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT1X3:
        getInt1x3().clear();
        getInt1x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT1X4:
        getInt1x4().clear();
        getInt1x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT2X1:
        getInt2x1().clear();
        getInt2x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT2X2:
        getInt2x2().clear();
        getInt2x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT2X3:
        getInt2x3().clear();
        getInt2x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT2X4:
        getInt2x4().clear();
        getInt2x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT3X1:
        getInt3x1().clear();
        getInt3x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT3X2:
        getInt3x2().clear();
        getInt3x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT3X3:
        getInt3x3().clear();
        getInt3x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT3X4:
        getInt3x4().clear();
        getInt3x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT4X1:
        getInt4x1().clear();
        getInt4x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT4X2:
        getInt4x2().clear();
        getInt4x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT4X3:
        getInt4x3().clear();
        getInt4x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT4X4:
        getInt4x4().clear();
        getInt4x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF:
        getHalf().clear();
        getHalf().addAll((Collection<? extends Float>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF1:
        getHalf1().clear();
        getHalf1().addAll((Collection<? extends Float>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF2:
        getHalf2().clear();
        getHalf2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF3:
        getHalf3().clear();
        getHalf3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF4:
        getHalf4().clear();
        getHalf4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X1:
        getHalf1x1().clear();
        getHalf1x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X2:
        getHalf1x2().clear();
        getHalf1x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X3:
        getHalf1x3().clear();
        getHalf1x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X4:
        getHalf1x4().clear();
        getHalf1x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X1:
        getHalf2x1().clear();
        getHalf2x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X2:
        getHalf2x2().clear();
        getHalf2x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X3:
        getHalf2x3().clear();
        getHalf2x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X4:
        getHalf2x4().clear();
        getHalf2x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X1:
        getHalf3x1().clear();
        getHalf3x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X2:
        getHalf3x2().clear();
        getHalf3x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X3:
        getHalf3x3().clear();
        getHalf3x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X4:
        getHalf3x4().clear();
        getHalf3x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X1:
        getHalf4x1().clear();
        getHalf4x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X2:
        getHalf4x2().clear();
        getHalf4x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X3:
        getHalf4x3().clear();
        getHalf4x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X4:
        getHalf4x4().clear();
        getHalf4x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED:
        getFixed().clear();
        getFixed().addAll((Collection<? extends Float>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1:
        getFixed1().clear();
        getFixed1().addAll((Collection<? extends Float>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2:
        getFixed2().clear();
        getFixed2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3:
        getFixed3().clear();
        getFixed3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4:
        getFixed4().clear();
        getFixed4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X1:
        getFixed1x1().clear();
        getFixed1x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X2:
        getFixed1x2().clear();
        getFixed1x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X3:
        getFixed1x3().clear();
        getFixed1x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X4:
        getFixed1x4().clear();
        getFixed1x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X1:
        getFixed2x1().clear();
        getFixed2x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X2:
        getFixed2x2().clear();
        getFixed2x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X3:
        getFixed2x3().clear();
        getFixed2x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X4:
        getFixed2x4().clear();
        getFixed2x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X1:
        getFixed3x1().clear();
        getFixed3x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X2:
        getFixed3x2().clear();
        getFixed3x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X3:
        getFixed3x3().clear();
        getFixed3x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X4:
        getFixed3x4().clear();
        getFixed3x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X1:
        getFixed4x1().clear();
        getFixed4x1().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X2:
        getFixed4x2().clear();
        getFixed4x2().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X3:
        getFixed4x3().clear();
        getFixed4x3().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X4:
        getFixed4x4().clear();
        getFixed4x4().addAll((Collection<? extends List>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SURFACE:
        getSurface().clear();
        getSurface().addAll((Collection<? extends CgSurfaceType>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER1_D:
        getSampler1D().clear();
        getSampler1D().addAll((Collection<? extends CgSampler1D>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER2_D:
        getSampler2D().clear();
        getSampler2D().addAll((Collection<? extends CgSampler2D>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER3_D:
        getSampler3D().clear();
        getSampler3D().addAll((Collection<? extends CgSampler3D>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER_RECT:
        getSamplerRECT().clear();
        getSamplerRECT().addAll((Collection<? extends CgSamplerRECT>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER_CUBE:
        getSamplerCUBE().clear();
        getSamplerCUBE().addAll((Collection<? extends CgSamplerCUBE>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER_DEPTH:
        getSamplerDEPTH().clear();
        getSamplerDEPTH().addAll((Collection<? extends CgSamplerDEPTH>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__STRING:
        getString().clear();
        getString().addAll((Collection<? extends String>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__ENUM:
        getEnum().clear();
        getEnum().addAll((Collection<? extends Enumerator>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__ARRAY:
        getArray().clear();
        getArray().addAll((Collection<? extends CgSetarrayType>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__USERTYPE:
        getUsertype().clear();
        getUsertype().addAll((Collection<? extends CgSetuserType>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__CONNECT_PARAM:
        getConnectParam().clear();
        getConnectParam().addAll((Collection<? extends CgConnectParam>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SETPARAM:
        getSetparam().clear();
        getSetparam().addAll((Collection<? extends CgSetparam>)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__NAME:
        setName((String)newValue);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SOURCE:
        setSource((String)newValue);
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
      case ColladaPackage.CG_SETUSER_TYPE__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL:
        getBool().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1:
        getBool1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2:
        getBool2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3:
        getBool3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4:
        getBool4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X1:
        getBool1x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X2:
        getBool1x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X3:
        getBool1x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X4:
        getBool1x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X1:
        getBool2x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X2:
        getBool2x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X3:
        getBool2x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X4:
        getBool2x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X1:
        getBool3x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X2:
        getBool3x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X3:
        getBool3x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X4:
        getBool3x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X1:
        getBool4x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X2:
        getBool4x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X3:
        getBool4x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X4:
        getBool4x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT:
        getFloat().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1:
        getFloat1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2:
        getFloat2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3:
        getFloat3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4:
        getFloat4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X1:
        getFloat1x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X2:
        getFloat1x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X3:
        getFloat1x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X4:
        getFloat1x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X1:
        getFloat2x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X2:
        getFloat2x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X3:
        getFloat2x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X4:
        getFloat2x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X1:
        getFloat3x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X2:
        getFloat3x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X3:
        getFloat3x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X4:
        getFloat3x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X1:
        getFloat4x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X2:
        getFloat4x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X3:
        getFloat4x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X4:
        getFloat4x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT:
        getInt().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT1:
        getInt1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT2:
        getInt2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT3:
        getInt3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT4:
        getInt4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT1X1:
        getInt1x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT1X2:
        getInt1x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT1X3:
        getInt1x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT1X4:
        getInt1x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT2X1:
        getInt2x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT2X2:
        getInt2x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT2X3:
        getInt2x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT2X4:
        getInt2x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT3X1:
        getInt3x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT3X2:
        getInt3x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT3X3:
        getInt3x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT3X4:
        getInt3x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT4X1:
        getInt4x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT4X2:
        getInt4x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT4X3:
        getInt4x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__INT4X4:
        getInt4x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF:
        getHalf().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF1:
        getHalf1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF2:
        getHalf2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF3:
        getHalf3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF4:
        getHalf4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X1:
        getHalf1x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X2:
        getHalf1x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X3:
        getHalf1x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X4:
        getHalf1x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X1:
        getHalf2x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X2:
        getHalf2x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X3:
        getHalf2x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X4:
        getHalf2x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X1:
        getHalf3x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X2:
        getHalf3x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X3:
        getHalf3x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X4:
        getHalf3x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X1:
        getHalf4x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X2:
        getHalf4x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X3:
        getHalf4x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X4:
        getHalf4x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED:
        getFixed().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1:
        getFixed1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2:
        getFixed2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3:
        getFixed3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4:
        getFixed4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X1:
        getFixed1x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X2:
        getFixed1x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X3:
        getFixed1x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X4:
        getFixed1x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X1:
        getFixed2x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X2:
        getFixed2x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X3:
        getFixed2x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X4:
        getFixed2x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X1:
        getFixed3x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X2:
        getFixed3x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X3:
        getFixed3x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X4:
        getFixed3x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X1:
        getFixed4x1().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X2:
        getFixed4x2().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X3:
        getFixed4x3().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X4:
        getFixed4x4().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SURFACE:
        getSurface().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER1_D:
        getSampler1D().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER2_D:
        getSampler2D().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER3_D:
        getSampler3D().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER_RECT:
        getSamplerRECT().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER_CUBE:
        getSamplerCUBE().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER_DEPTH:
        getSamplerDEPTH().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__STRING:
        getString().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__ENUM:
        getEnum().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__ARRAY:
        getArray().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__USERTYPE:
        getUsertype().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__CONNECT_PARAM:
        getConnectParam().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SETPARAM:
        getSetparam().clear();
        return;
      case ColladaPackage.CG_SETUSER_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ColladaPackage.CG_SETUSER_TYPE__SOURCE:
        setSource(SOURCE_EDEFAULT);
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
      case ColladaPackage.CG_SETUSER_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL:
        return !getBool().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1:
        return !getBool1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2:
        return !getBool2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3:
        return !getBool3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4:
        return !getBool4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X1:
        return !getBool1x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X2:
        return !getBool1x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X3:
        return !getBool1x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL1X4:
        return !getBool1x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X1:
        return !getBool2x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X2:
        return !getBool2x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X3:
        return !getBool2x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL2X4:
        return !getBool2x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X1:
        return !getBool3x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X2:
        return !getBool3x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X3:
        return !getBool3x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL3X4:
        return !getBool3x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X1:
        return !getBool4x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X2:
        return !getBool4x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X3:
        return !getBool4x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__BOOL4X4:
        return !getBool4x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT:
        return !getFloat().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1:
        return !getFloat1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2:
        return !getFloat2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3:
        return !getFloat3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4:
        return !getFloat4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X1:
        return !getFloat1x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X2:
        return !getFloat1x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X3:
        return !getFloat1x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT1X4:
        return !getFloat1x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X1:
        return !getFloat2x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X2:
        return !getFloat2x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X3:
        return !getFloat2x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT2X4:
        return !getFloat2x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X1:
        return !getFloat3x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X2:
        return !getFloat3x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X3:
        return !getFloat3x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT3X4:
        return !getFloat3x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X1:
        return !getFloat4x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X2:
        return !getFloat4x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X3:
        return !getFloat4x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FLOAT4X4:
        return !getFloat4x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT:
        return !getInt().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT1:
        return !getInt1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT2:
        return !getInt2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT3:
        return !getInt3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT4:
        return !getInt4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT1X1:
        return !getInt1x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT1X2:
        return !getInt1x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT1X3:
        return !getInt1x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT1X4:
        return !getInt1x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT2X1:
        return !getInt2x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT2X2:
        return !getInt2x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT2X3:
        return !getInt2x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT2X4:
        return !getInt2x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT3X1:
        return !getInt3x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT3X2:
        return !getInt3x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT3X3:
        return !getInt3x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT3X4:
        return !getInt3x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT4X1:
        return !getInt4x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT4X2:
        return !getInt4x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT4X3:
        return !getInt4x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__INT4X4:
        return !getInt4x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF:
        return !getHalf().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF1:
        return !getHalf1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF2:
        return !getHalf2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF3:
        return !getHalf3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF4:
        return !getHalf4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X1:
        return !getHalf1x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X2:
        return !getHalf1x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X3:
        return !getHalf1x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF1X4:
        return !getHalf1x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X1:
        return !getHalf2x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X2:
        return !getHalf2x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X3:
        return !getHalf2x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF2X4:
        return !getHalf2x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X1:
        return !getHalf3x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X2:
        return !getHalf3x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X3:
        return !getHalf3x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF3X4:
        return !getHalf3x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X1:
        return !getHalf4x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X2:
        return !getHalf4x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X3:
        return !getHalf4x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__HALF4X4:
        return !getHalf4x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED:
        return !getFixed().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1:
        return !getFixed1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2:
        return !getFixed2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3:
        return !getFixed3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4:
        return !getFixed4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X1:
        return !getFixed1x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X2:
        return !getFixed1x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X3:
        return !getFixed1x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED1X4:
        return !getFixed1x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X1:
        return !getFixed2x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X2:
        return !getFixed2x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X3:
        return !getFixed2x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED2X4:
        return !getFixed2x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X1:
        return !getFixed3x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X2:
        return !getFixed3x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X3:
        return !getFixed3x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED3X4:
        return !getFixed3x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X1:
        return !getFixed4x1().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X2:
        return !getFixed4x2().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X3:
        return !getFixed4x3().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__FIXED4X4:
        return !getFixed4x4().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__SURFACE:
        return !getSurface().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER1_D:
        return !getSampler1D().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER2_D:
        return !getSampler2D().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER3_D:
        return !getSampler3D().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER_RECT:
        return !getSamplerRECT().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER_CUBE:
        return !getSamplerCUBE().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__SAMPLER_DEPTH:
        return !getSamplerDEPTH().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__STRING:
        return !getString().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__ENUM:
        return !getEnum().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__ARRAY:
        return !getArray().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__USERTYPE:
        return !getUsertype().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__CONNECT_PARAM:
        return !getConnectParam().isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__SETPARAM:
        return setparam != null && !setparam.isEmpty();
      case ColladaPackage.CG_SETUSER_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ColladaPackage.CG_SETUSER_TYPE__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
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
    result.append(", name: ");
    result.append(name);
    result.append(", source: ");
    result.append(source);
    result.append(')');
    return result.toString();
  }

} //CgSetuserTypeImpl
