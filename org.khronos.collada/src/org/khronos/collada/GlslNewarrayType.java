/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glsl Newarray Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			The glsl_newarray_type is used to creates a parameter of a one-dimensional array type.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getBool <em>Bool</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getBool2 <em>Bool2</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getBool3 <em>Bool3</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getBool4 <em>Bool4</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getFloat2x2 <em>Float2x2</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getFloat3x3 <em>Float3x3</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getInt <em>Int</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getInt2 <em>Int2</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getInt3 <em>Int3</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getSampler1D <em>Sampler1 D</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getSampler2D <em>Sampler2 D</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getSampler3D <em>Sampler3 D</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getSamplerCUBE <em>Sampler CUBE</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getSamplerRECT <em>Sampler RECT</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getSamplerDEPTH <em>Sampler DEPTH</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getArray <em>Array</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewarrayType#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType()
 * @model extendedMetaData="name='glsl_newarray_type' kind='elementOnly'"
 * @generated
 */
public interface GlslNewarrayType extends EObject {
	/**
   * Returns the value of the '<em><b>Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Group()
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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Bool()
   * @model unique="false" dataType="org.khronos.collada.GlslBool" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<Boolean> getBool();

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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Bool2()
   * @model unique="false" dataType="org.khronos.collada.GlslBool2" transient="true" volatile="true" derived="true"
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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Bool3()
   * @model unique="false" dataType="org.khronos.collada.GlslBool3" transient="true" volatile="true" derived="true"
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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Bool4()
   * @model unique="false" dataType="org.khronos.collada.GlslBool4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getBool4();

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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Float()
   * @model unique="false" dataType="org.khronos.collada.GlslFloat" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<Float> getFloat();

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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Float2()
   * @model unique="false" dataType="org.khronos.collada.GlslFloat2" transient="true" volatile="true" derived="true"
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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Float3()
   * @model unique="false" dataType="org.khronos.collada.GlslFloat3" transient="true" volatile="true" derived="true"
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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Float4()
   * @model unique="false" dataType="org.khronos.collada.GlslFloat4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat4();

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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Float2x2()
   * @model unique="false" dataType="org.khronos.collada.GlslFloat2x2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float2x2' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat2x2();

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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Float3x3()
   * @model unique="false" dataType="org.khronos.collada.GlslFloat3x3" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float3x3' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getFloat3x3();

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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Float4x4()
   * @model unique="false" dataType="org.khronos.collada.GlslFloat4x4" transient="true" volatile="true" derived="true"
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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Int()
   * @model unique="false" dataType="org.khronos.collada.GlslInt" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<Integer> getInt();

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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Int2()
   * @model unique="false" dataType="org.khronos.collada.GlslInt2" transient="true" volatile="true" derived="true"
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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Int3()
   * @model unique="false" dataType="org.khronos.collada.GlslInt3" transient="true" volatile="true" derived="true"
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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Int4()
   * @model unique="false" dataType="org.khronos.collada.GlslInt4" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int4' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<List> getInt4();

	/**
   * Returns the value of the '<em><b>Surface</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.GlslSurfaceType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Surface</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Surface()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='surface' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<GlslSurfaceType> getSurface();

	/**
   * Returns the value of the '<em><b>Sampler1 D</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.GlSampler1D}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler1 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler1 D</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Sampler1D()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='sampler1D' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<GlSampler1D> getSampler1D();

	/**
   * Returns the value of the '<em><b>Sampler2 D</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.GlSampler2D}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler2 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler2 D</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Sampler2D()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='sampler2D' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<GlSampler2D> getSampler2D();

	/**
   * Returns the value of the '<em><b>Sampler3 D</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.GlSampler3D}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler3 D</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Sampler3D()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='sampler3D' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<GlSampler3D> getSampler3D();

	/**
   * Returns the value of the '<em><b>Sampler CUBE</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.GlSamplerCUBE}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler CUBE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler CUBE</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_SamplerCUBE()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='samplerCUBE' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<GlSamplerCUBE> getSamplerCUBE();

	/**
   * Returns the value of the '<em><b>Sampler RECT</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.GlSamplerRECT}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler RECT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler RECT</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_SamplerRECT()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='samplerRECT' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<GlSamplerRECT> getSamplerRECT();

	/**
   * Returns the value of the '<em><b>Sampler DEPTH</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.GlSamplerDEPTH}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler DEPTH</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler DEPTH</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_SamplerDEPTH()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='samplerDEPTH' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<GlSamplerDEPTH> getSamplerDEPTH();

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
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Enum()
   * @model unique="false" dataType="org.khronos.collada.GlEnumeration" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='enum' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<Enumerator> getEnum();

	/**
   * Returns the value of the '<em><b>Array</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.GlslNewarrayType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					You may recursively nest glsl_newarray elements to create multidimensional arrays.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Array</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Array()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='array' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<GlslNewarrayType> getArray();

	/**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 				The length attribute specifies the length of the array.
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getGlslNewarrayType_Length()
   * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
   *        extendedMetaData="kind='attribute' name='length'"
   * @generated
   */
	BigInteger getLength();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewarrayType#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
	void setLength(BigInteger value);

} // GlslNewarrayType
