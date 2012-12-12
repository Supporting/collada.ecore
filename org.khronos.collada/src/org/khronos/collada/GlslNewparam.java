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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glsl Newparam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.GlslNewparam#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#isBool <em>Bool</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getBool2 <em>Bool2</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getBool3 <em>Bool3</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getBool4 <em>Bool4</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getFloat2x2 <em>Float2x2</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getFloat3x3 <em>Float3x3</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getInt <em>Int</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getInt2 <em>Int2</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getInt3 <em>Int3</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getSampler1D <em>Sampler1 D</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getSampler2D <em>Sampler2 D</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getSampler3D <em>Sampler3 D</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getSamplerCUBE <em>Sampler CUBE</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getSamplerRECT <em>Sampler RECT</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getSamplerDEPTH <em>Sampler DEPTH</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getArray <em>Array</em>}</li>
 *   <li>{@link org.khronos.collada.GlslNewparam#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getGlslNewparam()
 * @model extendedMetaData="name='glsl_newparam' kind='elementOnly'"
 * @generated
 */
public interface GlslNewparam extends EObject {
	/**
   * Returns the value of the '<em><b>Annotate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxAnnotateCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Annotate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Annotate()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotate' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxAnnotateCommon> getAnnotate();

	/**
   * Returns the value of the '<em><b>Semantic</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Semantic</em>' attribute.
   * @see #setSemantic(String)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Semantic()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='element' name='semantic' namespace='##targetNamespace'"
   * @generated
   */
	String getSemantic();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getSemantic <em>Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semantic</em>' attribute.
   * @see #getSemantic()
   * @generated
   */
	void setSemantic(String value);

	/**
   * Returns the value of the '<em><b>Modifier</b></em>' attribute.
   * The literals are from the enumeration {@link org.khronos.collada.FxModifierEnumCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' attribute.
   * @see org.khronos.collada.FxModifierEnumCommon
   * @see #isSetModifier()
   * @see #unsetModifier()
   * @see #setModifier(FxModifierEnumCommon)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Modifier()
   * @model unsettable="true"
   *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
   * @generated
   */
	FxModifierEnumCommon getModifier();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see org.khronos.collada.FxModifierEnumCommon
   * @see #isSetModifier()
   * @see #unsetModifier()
   * @see #getModifier()
   * @generated
   */
	void setModifier(FxModifierEnumCommon value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.GlslNewparam#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetModifier()
   * @see #getModifier()
   * @see #setModifier(FxModifierEnumCommon)
   * @generated
   */
	void unsetModifier();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.GlslNewparam#getModifier <em>Modifier</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Modifier</em>' attribute is set.
   * @see #unsetModifier()
   * @see #getModifier()
   * @see #setModifier(FxModifierEnumCommon)
   * @generated
   */
	boolean isSetModifier();

	/**
   * Returns the value of the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' attribute.
   * @see #isSetBool()
   * @see #unsetBool()
   * @see #setBool(boolean)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Bool()
   * @model unsettable="true" dataType="org.khronos.collada.GlslBool"
   *        extendedMetaData="kind='element' name='bool' namespace='##targetNamespace'"
   * @generated
   */
	boolean isBool();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#isBool <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool</em>' attribute.
   * @see #isSetBool()
   * @see #unsetBool()
   * @see #isBool()
   * @generated
   */
	void setBool(boolean value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.GlslNewparam#isBool <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetBool()
   * @see #isBool()
   * @see #setBool(boolean)
   * @generated
   */
	void unsetBool();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.GlslNewparam#isBool <em>Bool</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Bool</em>' attribute is set.
   * @see #unsetBool()
   * @see #isBool()
   * @see #setBool(boolean)
   * @generated
   */
	boolean isSetBool();

	/**
   * Returns the value of the '<em><b>Bool2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool2</em>' attribute.
   * @see #setBool2(List)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Bool2()
   * @model dataType="org.khronos.collada.GlslBool2" many="false"
   *        extendedMetaData="kind='element' name='bool2' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool2();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getBool2 <em>Bool2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool2</em>' attribute.
   * @see #getBool2()
   * @generated
   */
	void setBool2(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool3</em>' attribute.
   * @see #setBool3(List)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Bool3()
   * @model dataType="org.khronos.collada.GlslBool3" many="false"
   *        extendedMetaData="kind='element' name='bool3' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool3();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getBool3 <em>Bool3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool3</em>' attribute.
   * @see #getBool3()
   * @generated
   */
	void setBool3(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool4</em>' attribute.
   * @see #setBool4(List)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Bool4()
   * @model dataType="org.khronos.collada.GlslBool4" many="false"
   *        extendedMetaData="kind='element' name='bool4' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool4();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getBool4 <em>Bool4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool4</em>' attribute.
   * @see #getBool4()
   * @generated
   */
	void setBool4(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Float</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float</em>' attribute.
   * @see #isSetFloat()
   * @see #unsetFloat()
   * @see #setFloat(float)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Float()
   * @model unsettable="true" dataType="org.khronos.collada.GlslFloat"
   *        extendedMetaData="kind='element' name='float' namespace='##targetNamespace'"
   * @generated
   */
	float getFloat();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getFloat <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float</em>' attribute.
   * @see #isSetFloat()
   * @see #unsetFloat()
   * @see #getFloat()
   * @generated
   */
	void setFloat(float value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.GlslNewparam#getFloat <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetFloat()
   * @see #getFloat()
   * @see #setFloat(float)
   * @generated
   */
	void unsetFloat();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.GlslNewparam#getFloat <em>Float</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Float</em>' attribute is set.
   * @see #unsetFloat()
   * @see #getFloat()
   * @see #setFloat(float)
   * @generated
   */
	boolean isSetFloat();

	/**
   * Returns the value of the '<em><b>Float2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float2</em>' attribute.
   * @see #setFloat2(List)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Float2()
   * @model dataType="org.khronos.collada.GlslFloat2" many="false"
   *        extendedMetaData="kind='element' name='float2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat2();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getFloat2 <em>Float2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2</em>' attribute.
   * @see #getFloat2()
   * @generated
   */
	void setFloat2(List<Float> value);

	/**
   * Returns the value of the '<em><b>Float3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float3</em>' attribute.
   * @see #setFloat3(List)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Float3()
   * @model dataType="org.khronos.collada.GlslFloat3" many="false"
   *        extendedMetaData="kind='element' name='float3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat3();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getFloat3 <em>Float3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3</em>' attribute.
   * @see #getFloat3()
   * @generated
   */
	void setFloat3(List<Float> value);

	/**
   * Returns the value of the '<em><b>Float4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float4</em>' attribute.
   * @see #setFloat4(List)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Float4()
   * @model dataType="org.khronos.collada.GlslFloat4" many="false"
   *        extendedMetaData="kind='element' name='float4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat4();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getFloat4 <em>Float4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4</em>' attribute.
   * @see #getFloat4()
   * @generated
   */
	void setFloat4(List<Float> value);

	/**
   * Returns the value of the '<em><b>Float2x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float2x2</em>' attribute.
   * @see #setFloat2x2(List)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Float2x2()
   * @model dataType="org.khronos.collada.GlslFloat2x2" many="false"
   *        extendedMetaData="kind='element' name='float2x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat2x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getFloat2x2 <em>Float2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2x2</em>' attribute.
   * @see #getFloat2x2()
   * @generated
   */
	void setFloat2x2(List<Float> value);

	/**
   * Returns the value of the '<em><b>Float3x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float3x3</em>' attribute.
   * @see #setFloat3x3(List)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Float3x3()
   * @model dataType="org.khronos.collada.GlslFloat3x3" many="false"
   *        extendedMetaData="kind='element' name='float3x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat3x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getFloat3x3 <em>Float3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3x3</em>' attribute.
   * @see #getFloat3x3()
   * @generated
   */
	void setFloat3x3(List<Float> value);

	/**
   * Returns the value of the '<em><b>Float4x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float4x4</em>' attribute.
   * @see #setFloat4x4(List)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Float4x4()
   * @model dataType="org.khronos.collada.GlslFloat4x4" many="false"
   *        extendedMetaData="kind='element' name='float4x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat4x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getFloat4x4 <em>Float4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4x4</em>' attribute.
   * @see #getFloat4x4()
   * @generated
   */
	void setFloat4x4(List<Float> value);

	/**
   * Returns the value of the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int</em>' attribute.
   * @see #isSetInt()
   * @see #unsetInt()
   * @see #setInt(int)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Int()
   * @model unsettable="true" dataType="org.khronos.collada.GlslInt"
   *        extendedMetaData="kind='element' name='int' namespace='##targetNamespace'"
   * @generated
   */
	int getInt();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int</em>' attribute.
   * @see #isSetInt()
   * @see #unsetInt()
   * @see #getInt()
   * @generated
   */
	void setInt(int value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.GlslNewparam#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetInt()
   * @see #getInt()
   * @see #setInt(int)
   * @generated
   */
	void unsetInt();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.GlslNewparam#getInt <em>Int</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Int</em>' attribute is set.
   * @see #unsetInt()
   * @see #getInt()
   * @see #setInt(int)
   * @generated
   */
	boolean isSetInt();

	/**
   * Returns the value of the '<em><b>Int2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int2</em>' attribute.
   * @see #setInt2(List)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Int2()
   * @model dataType="org.khronos.collada.GlslInt2" many="false"
   *        extendedMetaData="kind='element' name='int2' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt2();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getInt2 <em>Int2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int2</em>' attribute.
   * @see #getInt2()
   * @generated
   */
	void setInt2(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int3</em>' attribute.
   * @see #setInt3(List)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Int3()
   * @model dataType="org.khronos.collada.GlslInt3" many="false"
   *        extendedMetaData="kind='element' name='int3' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt3();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getInt3 <em>Int3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int3</em>' attribute.
   * @see #getInt3()
   * @generated
   */
	void setInt3(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int4</em>' attribute.
   * @see #setInt4(List)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Int4()
   * @model dataType="org.khronos.collada.GlslInt4" many="false"
   *        extendedMetaData="kind='element' name='int4' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt4();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getInt4 <em>Int4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int4</em>' attribute.
   * @see #getInt4()
   * @generated
   */
	void setInt4(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Surface</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Surface</em>' containment reference.
   * @see #setSurface(GlslSurfaceType)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Surface()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='surface' namespace='##targetNamespace'"
   * @generated
   */
	GlslSurfaceType getSurface();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getSurface <em>Surface</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Surface</em>' containment reference.
   * @see #getSurface()
   * @generated
   */
	void setSurface(GlslSurfaceType value);

	/**
   * Returns the value of the '<em><b>Sampler1 D</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler1 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler1 D</em>' containment reference.
   * @see #setSampler1D(GlSampler1D)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Sampler1D()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sampler1D' namespace='##targetNamespace'"
   * @generated
   */
	GlSampler1D getSampler1D();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getSampler1D <em>Sampler1 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler1 D</em>' containment reference.
   * @see #getSampler1D()
   * @generated
   */
	void setSampler1D(GlSampler1D value);

	/**
   * Returns the value of the '<em><b>Sampler2 D</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler2 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler2 D</em>' containment reference.
   * @see #setSampler2D(GlSampler2D)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Sampler2D()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sampler2D' namespace='##targetNamespace'"
   * @generated
   */
	GlSampler2D getSampler2D();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getSampler2D <em>Sampler2 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler2 D</em>' containment reference.
   * @see #getSampler2D()
   * @generated
   */
	void setSampler2D(GlSampler2D value);

	/**
   * Returns the value of the '<em><b>Sampler3 D</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler3 D</em>' containment reference.
   * @see #setSampler3D(GlSampler3D)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Sampler3D()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sampler3D' namespace='##targetNamespace'"
   * @generated
   */
	GlSampler3D getSampler3D();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getSampler3D <em>Sampler3 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler3 D</em>' containment reference.
   * @see #getSampler3D()
   * @generated
   */
	void setSampler3D(GlSampler3D value);

	/**
   * Returns the value of the '<em><b>Sampler CUBE</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler CUBE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler CUBE</em>' containment reference.
   * @see #setSamplerCUBE(GlSamplerCUBE)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_SamplerCUBE()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='samplerCUBE' namespace='##targetNamespace'"
   * @generated
   */
	GlSamplerCUBE getSamplerCUBE();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getSamplerCUBE <em>Sampler CUBE</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler CUBE</em>' containment reference.
   * @see #getSamplerCUBE()
   * @generated
   */
	void setSamplerCUBE(GlSamplerCUBE value);

	/**
   * Returns the value of the '<em><b>Sampler RECT</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler RECT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler RECT</em>' containment reference.
   * @see #setSamplerRECT(GlSamplerRECT)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_SamplerRECT()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='samplerRECT' namespace='##targetNamespace'"
   * @generated
   */
	GlSamplerRECT getSamplerRECT();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getSamplerRECT <em>Sampler RECT</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler RECT</em>' containment reference.
   * @see #getSamplerRECT()
   * @generated
   */
	void setSamplerRECT(GlSamplerRECT value);

	/**
   * Returns the value of the '<em><b>Sampler DEPTH</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler DEPTH</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler DEPTH</em>' containment reference.
   * @see #setSamplerDEPTH(GlSamplerDEPTH)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_SamplerDEPTH()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='samplerDEPTH' namespace='##targetNamespace'"
   * @generated
   */
	GlSamplerDEPTH getSamplerDEPTH();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getSamplerDEPTH <em>Sampler DEPTH</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler DEPTH</em>' containment reference.
   * @see #getSamplerDEPTH()
   * @generated
   */
	void setSamplerDEPTH(GlSamplerDEPTH value);

	/**
   * Returns the value of the '<em><b>Enum</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Enum</em>' attribute.
   * @see #setEnum(Enumerator)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Enum()
   * @model dataType="org.khronos.collada.GlEnumeration"
   *        extendedMetaData="kind='element' name='enum' namespace='##targetNamespace'"
   * @generated
   */
	Enumerator getEnum();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getEnum <em>Enum</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum</em>' attribute.
   * @see #getEnum()
   * @generated
   */
	void setEnum(Enumerator value);

	/**
   * Returns the value of the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference.
   * @see #setArray(GlslNewarrayType)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Array()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='array' namespace='##targetNamespace'"
   * @generated
   */
	GlslNewarrayType getArray();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
	void setArray(GlslNewarrayType value);

	/**
   * Returns the value of the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sid</em>' attribute.
   * @see #setSid(String)
   * @see org.khronos.collada.ColladaPackage#getGlslNewparam_Sid()
   * @model dataType="org.khronos.collada.GlslIdentifier" required="true"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslNewparam#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

} // GlslNewparam
