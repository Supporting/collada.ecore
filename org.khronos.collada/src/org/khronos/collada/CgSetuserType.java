/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cg Setuser Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			Creates an instance of a structured class.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.CgSetuserType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool <em>Bool</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool1 <em>Bool1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool2 <em>Bool2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool3 <em>Bool3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool4 <em>Bool4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool1x1 <em>Bool1x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool1x2 <em>Bool1x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool1x3 <em>Bool1x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool1x4 <em>Bool1x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool2x1 <em>Bool2x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool2x2 <em>Bool2x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool2x3 <em>Bool2x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool2x4 <em>Bool2x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool3x1 <em>Bool3x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool3x2 <em>Bool3x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool3x3 <em>Bool3x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool3x4 <em>Bool3x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool4x1 <em>Bool4x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool4x2 <em>Bool4x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool4x3 <em>Bool4x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getBool4x4 <em>Bool4x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat1 <em>Float1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat1x1 <em>Float1x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat1x2 <em>Float1x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat1x3 <em>Float1x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat1x4 <em>Float1x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat2x1 <em>Float2x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat2x2 <em>Float2x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat2x3 <em>Float2x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat2x4 <em>Float2x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat3x1 <em>Float3x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat3x2 <em>Float3x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat3x3 <em>Float3x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat3x4 <em>Float3x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat4x1 <em>Float4x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat4x2 <em>Float4x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat4x3 <em>Float4x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt <em>Int</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt1 <em>Int1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt2 <em>Int2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt3 <em>Int3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt1x1 <em>Int1x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt1x2 <em>Int1x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt1x3 <em>Int1x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt1x4 <em>Int1x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt2x1 <em>Int2x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt2x2 <em>Int2x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt2x3 <em>Int2x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt2x4 <em>Int2x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt3x1 <em>Int3x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt3x2 <em>Int3x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt3x3 <em>Int3x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt3x4 <em>Int3x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt4x1 <em>Int4x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt4x2 <em>Int4x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt4x3 <em>Int4x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getInt4x4 <em>Int4x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf <em>Half</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf1 <em>Half1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf2 <em>Half2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf3 <em>Half3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf4 <em>Half4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf1x1 <em>Half1x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf1x2 <em>Half1x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf1x3 <em>Half1x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf1x4 <em>Half1x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf2x1 <em>Half2x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf2x2 <em>Half2x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf2x3 <em>Half2x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf2x4 <em>Half2x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf3x1 <em>Half3x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf3x2 <em>Half3x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf3x3 <em>Half3x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf3x4 <em>Half3x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf4x1 <em>Half4x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf4x2 <em>Half4x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf4x3 <em>Half4x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getHalf4x4 <em>Half4x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed1 <em>Fixed1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed2 <em>Fixed2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed3 <em>Fixed3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed4 <em>Fixed4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed1x1 <em>Fixed1x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed1x2 <em>Fixed1x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed1x3 <em>Fixed1x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed1x4 <em>Fixed1x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed2x1 <em>Fixed2x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed2x2 <em>Fixed2x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed2x3 <em>Fixed2x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed2x4 <em>Fixed2x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed3x1 <em>Fixed3x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed3x2 <em>Fixed3x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed3x3 <em>Fixed3x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed3x4 <em>Fixed3x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed4x1 <em>Fixed4x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed4x2 <em>Fixed4x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed4x3 <em>Fixed4x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getFixed4x4 <em>Fixed4x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getSampler1D <em>Sampler1 D</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getSampler2D <em>Sampler2 D</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getSampler3D <em>Sampler3 D</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getSamplerRECT <em>Sampler RECT</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getSamplerCUBE <em>Sampler CUBE</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getSamplerDEPTH <em>Sampler DEPTH</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getString <em>String</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getArray <em>Array</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getUsertype <em>Usertype</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getConnectParam <em>Connect Param</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getSetparam <em>Setparam</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.CgSetuserType#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getCgSetuserType()
 * @model extendedMetaData="name='cg_setuser_type' kind='elementOnly'"
 * @generated
 */
public interface CgSetuserType extends EObject {
	/**
   * Returns the value of the '<em><b>Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Use a combination of these to initialize the usertype in an order-dependent manner.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Group</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:0'"
   * @generated
   */
	FeatureMap getGroup();

	/**
   * Returns the value of the '<em><b>Bool</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Boolean}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool()
   * @model unique="false" dataType="org.khronos.collada.CgBool" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<Boolean> getBool();

	/**
   * Returns the value of the '<em><b>Bool1</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Boolean}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool1()
   * @model unique="false" dataType="org.khronos.collada.CgBool1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<Boolean> getBool1();

	/**
   * Returns the value of the '<em><b>Bool2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool2()
   * @model unique="false" dataType="org.khronos.collada.CgBool2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool2();

	/**
   * Returns the value of the '<em><b>Bool3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool3()
   * @model unique="false" dataType="org.khronos.collada.CgBool3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool3();

	/**
   * Returns the value of the '<em><b>Bool4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool4()
   * @model unique="false" dataType="org.khronos.collada.CgBool4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool4();

	/**
   * Returns the value of the '<em><b>Bool1x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool1x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool1x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool1x1()
   * @model unique="false" dataType="org.khronos.collada.CgBool1x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool1x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool1x1();

	/**
   * Returns the value of the '<em><b>Bool1x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool1x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool1x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool1x2()
   * @model unique="false" dataType="org.khronos.collada.CgBool1x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool1x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool1x2();

	/**
   * Returns the value of the '<em><b>Bool1x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool1x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool1x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool1x3()
   * @model unique="false" dataType="org.khronos.collada.CgBool1x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool1x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool1x3();

	/**
   * Returns the value of the '<em><b>Bool1x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool1x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool1x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool1x4()
   * @model unique="false" dataType="org.khronos.collada.CgBool1x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool1x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool1x4();

	/**
   * Returns the value of the '<em><b>Bool2x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool2x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool2x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool2x1()
   * @model unique="false" dataType="org.khronos.collada.CgBool2x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool2x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool2x1();

	/**
   * Returns the value of the '<em><b>Bool2x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool2x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool2x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool2x2()
   * @model unique="false" dataType="org.khronos.collada.CgBool2x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool2x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool2x2();

	/**
   * Returns the value of the '<em><b>Bool2x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool2x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool2x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool2x3()
   * @model unique="false" dataType="org.khronos.collada.CgBool2x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool2x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool2x3();

	/**
   * Returns the value of the '<em><b>Bool2x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool2x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool2x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool2x4()
   * @model unique="false" dataType="org.khronos.collada.CgBool2x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool2x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool2x4();

	/**
   * Returns the value of the '<em><b>Bool3x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool3x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool3x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool3x1()
   * @model unique="false" dataType="org.khronos.collada.CgBool3x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool3x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool3x1();

	/**
   * Returns the value of the '<em><b>Bool3x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool3x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool3x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool3x2()
   * @model unique="false" dataType="org.khronos.collada.CgBool3x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool3x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool3x2();

	/**
   * Returns the value of the '<em><b>Bool3x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool3x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool3x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool3x3()
   * @model unique="false" dataType="org.khronos.collada.CgBool3x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool3x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool3x3();

	/**
   * Returns the value of the '<em><b>Bool3x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool3x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool3x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool3x4()
   * @model unique="false" dataType="org.khronos.collada.CgBool3x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool3x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool3x4();

	/**
   * Returns the value of the '<em><b>Bool4x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool4x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool4x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool4x1()
   * @model unique="false" dataType="org.khronos.collada.CgBool4x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool4x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool4x1();

	/**
   * Returns the value of the '<em><b>Bool4x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool4x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool4x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool4x2()
   * @model unique="false" dataType="org.khronos.collada.CgBool4x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool4x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool4x2();

	/**
   * Returns the value of the '<em><b>Bool4x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool4x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool4x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool4x3()
   * @model unique="false" dataType="org.khronos.collada.CgBool4x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool4x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool4x3();

	/**
   * Returns the value of the '<em><b>Bool4x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool4x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool4x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Bool4x4()
   * @model unique="false" dataType="org.khronos.collada.CgBool4x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool4x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool4x4();

	/**
   * Returns the value of the '<em><b>Float</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float()
   * @model unique="false" dataType="org.khronos.collada.CgFloat" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<Float> getFloat();

	/**
   * Returns the value of the '<em><b>Float1</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float1()
   * @model unique="false" dataType="org.khronos.collada.CgFloat1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<Float> getFloat1();

	/**
   * Returns the value of the '<em><b>Float2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float2()
   * @model unique="false" dataType="org.khronos.collada.CgFloat2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat2();

	/**
   * Returns the value of the '<em><b>Float3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float3()
   * @model unique="false" dataType="org.khronos.collada.CgFloat3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat3();

	/**
   * Returns the value of the '<em><b>Float4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float4()
   * @model unique="false" dataType="org.khronos.collada.CgFloat4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat4();

	/**
   * Returns the value of the '<em><b>Float1x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float1x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float1x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float1x1()
   * @model unique="false" dataType="org.khronos.collada.CgFloat1x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float1x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat1x1();

	/**
   * Returns the value of the '<em><b>Float1x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float1x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float1x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float1x2()
   * @model unique="false" dataType="org.khronos.collada.CgFloat1x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float1x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat1x2();

	/**
   * Returns the value of the '<em><b>Float1x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float1x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float1x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float1x3()
   * @model unique="false" dataType="org.khronos.collada.CgFloat1x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float1x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat1x3();

	/**
   * Returns the value of the '<em><b>Float1x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float1x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float1x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float1x4()
   * @model unique="false" dataType="org.khronos.collada.CgFloat1x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float1x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat1x4();

	/**
   * Returns the value of the '<em><b>Float2x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float2x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float2x1()
   * @model unique="false" dataType="org.khronos.collada.CgFloat2x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float2x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat2x1();

	/**
   * Returns the value of the '<em><b>Float2x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float2x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float2x2()
   * @model unique="false" dataType="org.khronos.collada.CgFloat2x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float2x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat2x2();

	/**
   * Returns the value of the '<em><b>Float2x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float2x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float2x3()
   * @model unique="false" dataType="org.khronos.collada.CgFloat2x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float2x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat2x3();

	/**
   * Returns the value of the '<em><b>Float2x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float2x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float2x4()
   * @model unique="false" dataType="org.khronos.collada.CgFloat2x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float2x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat2x4();

	/**
   * Returns the value of the '<em><b>Float3x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float3x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float3x1()
   * @model unique="false" dataType="org.khronos.collada.CgFloat3x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float3x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat3x1();

	/**
   * Returns the value of the '<em><b>Float3x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float3x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float3x2()
   * @model unique="false" dataType="org.khronos.collada.CgFloat3x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float3x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat3x2();

	/**
   * Returns the value of the '<em><b>Float3x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float3x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float3x3()
   * @model unique="false" dataType="org.khronos.collada.CgFloat3x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float3x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat3x3();

	/**
   * Returns the value of the '<em><b>Float3x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float3x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float3x4()
   * @model unique="false" dataType="org.khronos.collada.CgFloat3x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float3x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat3x4();

	/**
   * Returns the value of the '<em><b>Float4x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float4x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float4x1()
   * @model unique="false" dataType="org.khronos.collada.CgFloat4x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float4x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat4x1();

	/**
   * Returns the value of the '<em><b>Float4x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float4x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float4x2()
   * @model unique="false" dataType="org.khronos.collada.CgFloat4x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float4x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat4x2();

	/**
   * Returns the value of the '<em><b>Float4x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float4x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float4x3()
   * @model unique="false" dataType="org.khronos.collada.CgFloat4x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float4x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat4x3();

	/**
   * Returns the value of the '<em><b>Float4x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float4x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Float4x4()
   * @model unique="false" dataType="org.khronos.collada.CgFloat4x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float4x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat4x4();

	/**
   * Returns the value of the '<em><b>Int</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int()
   * @model unique="false" dataType="org.khronos.collada.CgInt" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<Integer> getInt();

	/**
   * Returns the value of the '<em><b>Int1</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int1()
   * @model unique="false" dataType="org.khronos.collada.CgInt1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<Integer> getInt1();

	/**
   * Returns the value of the '<em><b>Int2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int2()
   * @model unique="false" dataType="org.khronos.collada.CgInt2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt2();

	/**
   * Returns the value of the '<em><b>Int3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int3()
   * @model unique="false" dataType="org.khronos.collada.CgInt3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt3();

	/**
   * Returns the value of the '<em><b>Int4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int4()
   * @model unique="false" dataType="org.khronos.collada.CgInt4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt4();

	/**
   * Returns the value of the '<em><b>Int1x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int1x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int1x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int1x1()
   * @model unique="false" dataType="org.khronos.collada.CgInt1x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int1x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt1x1();

	/**
   * Returns the value of the '<em><b>Int1x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int1x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int1x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int1x2()
   * @model unique="false" dataType="org.khronos.collada.CgInt1x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int1x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt1x2();

	/**
   * Returns the value of the '<em><b>Int1x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int1x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int1x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int1x3()
   * @model unique="false" dataType="org.khronos.collada.CgInt1x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int1x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt1x3();

	/**
   * Returns the value of the '<em><b>Int1x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int1x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int1x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int1x4()
   * @model unique="false" dataType="org.khronos.collada.CgInt1x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int1x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt1x4();

	/**
   * Returns the value of the '<em><b>Int2x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int2x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int2x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int2x1()
   * @model unique="false" dataType="org.khronos.collada.CgInt2x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int2x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt2x1();

	/**
   * Returns the value of the '<em><b>Int2x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int2x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int2x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int2x2()
   * @model unique="false" dataType="org.khronos.collada.CgInt2x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int2x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt2x2();

	/**
   * Returns the value of the '<em><b>Int2x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int2x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int2x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int2x3()
   * @model unique="false" dataType="org.khronos.collada.CgInt2x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int2x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt2x3();

	/**
   * Returns the value of the '<em><b>Int2x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int2x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int2x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int2x4()
   * @model unique="false" dataType="org.khronos.collada.CgInt2x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int2x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt2x4();

	/**
   * Returns the value of the '<em><b>Int3x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int3x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int3x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int3x1()
   * @model unique="false" dataType="org.khronos.collada.CgInt3x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int3x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt3x1();

	/**
   * Returns the value of the '<em><b>Int3x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int3x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int3x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int3x2()
   * @model unique="false" dataType="org.khronos.collada.CgInt3x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int3x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt3x2();

	/**
   * Returns the value of the '<em><b>Int3x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int3x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int3x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int3x3()
   * @model unique="false" dataType="org.khronos.collada.CgInt3x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int3x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt3x3();

	/**
   * Returns the value of the '<em><b>Int3x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int3x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int3x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int3x4()
   * @model unique="false" dataType="org.khronos.collada.CgInt3x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int3x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt3x4();

	/**
   * Returns the value of the '<em><b>Int4x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int4x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int4x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int4x1()
   * @model unique="false" dataType="org.khronos.collada.CgInt4x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int4x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt4x1();

	/**
   * Returns the value of the '<em><b>Int4x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int4x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int4x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int4x2()
   * @model unique="false" dataType="org.khronos.collada.CgInt4x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int4x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt4x2();

	/**
   * Returns the value of the '<em><b>Int4x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int4x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int4x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int4x3()
   * @model unique="false" dataType="org.khronos.collada.CgInt4x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int4x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt4x3();

	/**
   * Returns the value of the '<em><b>Int4x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int4x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int4x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Int4x4()
   * @model unique="false" dataType="org.khronos.collada.CgInt4x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int4x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt4x4();

	/**
   * Returns the value of the '<em><b>Half</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half()
   * @model unique="false" dataType="org.khronos.collada.CgHalf" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<Float> getHalf();

	/**
   * Returns the value of the '<em><b>Half1</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half1()
   * @model unique="false" dataType="org.khronos.collada.CgHalf1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<Float> getHalf1();

	/**
   * Returns the value of the '<em><b>Half2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half2()
   * @model unique="false" dataType="org.khronos.collada.CgHalf2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf2();

	/**
   * Returns the value of the '<em><b>Half3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half3()
   * @model unique="false" dataType="org.khronos.collada.CgHalf3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf3();

	/**
   * Returns the value of the '<em><b>Half4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half4()
   * @model unique="false" dataType="org.khronos.collada.CgHalf4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf4();

	/**
   * Returns the value of the '<em><b>Half1x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half1x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half1x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half1x1()
   * @model unique="false" dataType="org.khronos.collada.CgHalf1x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half1x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf1x1();

	/**
   * Returns the value of the '<em><b>Half1x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half1x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half1x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half1x2()
   * @model unique="false" dataType="org.khronos.collada.CgHalf1x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half1x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf1x2();

	/**
   * Returns the value of the '<em><b>Half1x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half1x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half1x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half1x3()
   * @model unique="false" dataType="org.khronos.collada.CgHalf1x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half1x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf1x3();

	/**
   * Returns the value of the '<em><b>Half1x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half1x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half1x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half1x4()
   * @model unique="false" dataType="org.khronos.collada.CgHalf1x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half1x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf1x4();

	/**
   * Returns the value of the '<em><b>Half2x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half2x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half2x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half2x1()
   * @model unique="false" dataType="org.khronos.collada.CgHalf2x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half2x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf2x1();

	/**
   * Returns the value of the '<em><b>Half2x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half2x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half2x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half2x2()
   * @model unique="false" dataType="org.khronos.collada.CgHalf2x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half2x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf2x2();

	/**
   * Returns the value of the '<em><b>Half2x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half2x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half2x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half2x3()
   * @model unique="false" dataType="org.khronos.collada.CgHalf2x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half2x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf2x3();

	/**
   * Returns the value of the '<em><b>Half2x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half2x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half2x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half2x4()
   * @model unique="false" dataType="org.khronos.collada.CgHalf2x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half2x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf2x4();

	/**
   * Returns the value of the '<em><b>Half3x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half3x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half3x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half3x1()
   * @model unique="false" dataType="org.khronos.collada.CgHalf3x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half3x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf3x1();

	/**
   * Returns the value of the '<em><b>Half3x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half3x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half3x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half3x2()
   * @model unique="false" dataType="org.khronos.collada.CgHalf3x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half3x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf3x2();

	/**
   * Returns the value of the '<em><b>Half3x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half3x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half3x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half3x3()
   * @model unique="false" dataType="org.khronos.collada.CgHalf3x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half3x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf3x3();

	/**
   * Returns the value of the '<em><b>Half3x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half3x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half3x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half3x4()
   * @model unique="false" dataType="org.khronos.collada.CgHalf3x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half3x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf3x4();

	/**
   * Returns the value of the '<em><b>Half4x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half4x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half4x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half4x1()
   * @model unique="false" dataType="org.khronos.collada.CgHalf4x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half4x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf4x1();

	/**
   * Returns the value of the '<em><b>Half4x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half4x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half4x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half4x2()
   * @model unique="false" dataType="org.khronos.collada.CgHalf4x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half4x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf4x2();

	/**
   * Returns the value of the '<em><b>Half4x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half4x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half4x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half4x3()
   * @model unique="false" dataType="org.khronos.collada.CgHalf4x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half4x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf4x3();

	/**
   * Returns the value of the '<em><b>Half4x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half4x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half4x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Half4x4()
   * @model unique="false" dataType="org.khronos.collada.CgHalf4x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='half4x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getHalf4x4();

	/**
   * Returns the value of the '<em><b>Fixed</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed()
   * @model unique="false" dataType="org.khronos.collada.CgFixed" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<Float> getFixed();

	/**
   * Returns the value of the '<em><b>Fixed1</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed1()
   * @model unique="false" dataType="org.khronos.collada.CgFixed1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<Float> getFixed1();

	/**
   * Returns the value of the '<em><b>Fixed2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed2()
   * @model unique="false" dataType="org.khronos.collada.CgFixed2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed2();

	/**
   * Returns the value of the '<em><b>Fixed3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed3()
   * @model unique="false" dataType="org.khronos.collada.CgFixed3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed3();

	/**
   * Returns the value of the '<em><b>Fixed4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed4()
   * @model unique="false" dataType="org.khronos.collada.CgFixed4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed4();

	/**
   * Returns the value of the '<em><b>Fixed1x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed1x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed1x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed1x1()
   * @model unique="false" dataType="org.khronos.collada.CgFixed1x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed1x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed1x1();

	/**
   * Returns the value of the '<em><b>Fixed1x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed1x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed1x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed1x2()
   * @model unique="false" dataType="org.khronos.collada.CgFixed1x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed1x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed1x2();

	/**
   * Returns the value of the '<em><b>Fixed1x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed1x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed1x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed1x3()
   * @model unique="false" dataType="org.khronos.collada.CgFixed1x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed1x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed1x3();

	/**
   * Returns the value of the '<em><b>Fixed1x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed1x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed1x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed1x4()
   * @model unique="false" dataType="org.khronos.collada.CgFixed1x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed1x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed1x4();

	/**
   * Returns the value of the '<em><b>Fixed2x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed2x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed2x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed2x1()
   * @model unique="false" dataType="org.khronos.collada.CgFixed2x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed2x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed2x1();

	/**
   * Returns the value of the '<em><b>Fixed2x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed2x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed2x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed2x2()
   * @model unique="false" dataType="org.khronos.collada.CgFixed2x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed2x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed2x2();

	/**
   * Returns the value of the '<em><b>Fixed2x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed2x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed2x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed2x3()
   * @model unique="false" dataType="org.khronos.collada.CgFixed2x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed2x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed2x3();

	/**
   * Returns the value of the '<em><b>Fixed2x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed2x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed2x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed2x4()
   * @model unique="false" dataType="org.khronos.collada.CgFixed2x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed2x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed2x4();

	/**
   * Returns the value of the '<em><b>Fixed3x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed3x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed3x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed3x1()
   * @model unique="false" dataType="org.khronos.collada.CgFixed3x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed3x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed3x1();

	/**
   * Returns the value of the '<em><b>Fixed3x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed3x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed3x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed3x2()
   * @model unique="false" dataType="org.khronos.collada.CgFixed3x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed3x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed3x2();

	/**
   * Returns the value of the '<em><b>Fixed3x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed3x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed3x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed3x3()
   * @model unique="false" dataType="org.khronos.collada.CgFixed3x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed3x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed3x3();

	/**
   * Returns the value of the '<em><b>Fixed3x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed3x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed3x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed3x4()
   * @model unique="false" dataType="org.khronos.collada.CgFixed3x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed3x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed3x4();

	/**
   * Returns the value of the '<em><b>Fixed4x1</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed4x1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed4x1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed4x1()
   * @model unique="false" dataType="org.khronos.collada.CgFixed4x1" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed4x1' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed4x1();

	/**
   * Returns the value of the '<em><b>Fixed4x2</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed4x2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed4x2</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed4x2()
   * @model unique="false" dataType="org.khronos.collada.CgFixed4x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed4x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed4x2();

	/**
   * Returns the value of the '<em><b>Fixed4x3</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed4x3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed4x3</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed4x3()
   * @model unique="false" dataType="org.khronos.collada.CgFixed4x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed4x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed4x3();

	/**
   * Returns the value of the '<em><b>Fixed4x4</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed4x4</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed4x4</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Fixed4x4()
   * @model unique="false" dataType="org.khronos.collada.CgFixed4x4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fixed4x4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFixed4x4();

	/**
   * Returns the value of the '<em><b>Surface</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CgSurfaceType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Surface</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Surface()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='surface' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<CgSurfaceType> getSurface();

	/**
   * Returns the value of the '<em><b>Sampler1 D</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CgSampler1D}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler1 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler1 D</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Sampler1D()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='sampler1D' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<CgSampler1D> getSampler1D();

	/**
   * Returns the value of the '<em><b>Sampler2 D</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CgSampler2D}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler2 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler2 D</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Sampler2D()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='sampler2D' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<CgSampler2D> getSampler2D();

	/**
   * Returns the value of the '<em><b>Sampler3 D</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CgSampler3D}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler3 D</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Sampler3D()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='sampler3D' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<CgSampler3D> getSampler3D();

	/**
   * Returns the value of the '<em><b>Sampler RECT</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CgSamplerRECT}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler RECT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler RECT</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_SamplerRECT()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='samplerRECT' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<CgSamplerRECT> getSamplerRECT();

	/**
   * Returns the value of the '<em><b>Sampler CUBE</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CgSamplerCUBE}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler CUBE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler CUBE</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_SamplerCUBE()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='samplerCUBE' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<CgSamplerCUBE> getSamplerCUBE();

	/**
   * Returns the value of the '<em><b>Sampler DEPTH</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CgSamplerDEPTH}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler DEPTH</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler DEPTH</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_SamplerDEPTH()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='samplerDEPTH' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<CgSamplerDEPTH> getSamplerDEPTH();

	/**
   * Returns the value of the '<em><b>String</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_String()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='string' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<String> getString();

	/**
   * Returns the value of the '<em><b>Enum</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.common.util.Enumerator}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Enum</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Enum()
   * @model unique="false" dataType="org.khronos.collada.GlEnumeration" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='enum' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<Enumerator> getEnum();

	/**
   * Returns the value of the '<em><b>Array</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CgSetarrayType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Array()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='array' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<CgSetarrayType> getArray();

	/**
   * Returns the value of the '<em><b>Usertype</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CgSetuserType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usertype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Usertype</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Usertype()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='usertype' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<CgSetuserType> getUsertype();

	/**
   * Returns the value of the '<em><b>Connect Param</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CgConnectParam}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Connect Param</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_ConnectParam()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='connect_param' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<CgConnectParam> getConnectParam();

	/**
   * Returns the value of the '<em><b>Setparam</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CgSetparam}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Use a series of these to set the members by name.  The ref attribute will be relative to the usertype you are in right now.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Setparam</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Setparam()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='setparam' namespace='##targetNamespace'"
   * @generated
   */
	EList<CgSetparam> getSetparam();

	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Name()
   * @model dataType="org.khronos.collada.CgIdentifier" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgSetuserType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					Reference a code or include element which defines the usertype
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see org.khronos.collada.ColladaPackage#getCgSetuserType_Source()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='source'"
   * @generated
   */
	String getSource();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgSetuserType#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
	void setSource(String value);

} // CgSetuserType
