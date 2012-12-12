/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fx Newparam Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			This element creates a new, named param object in the FX Runtime, assigns it a type, an initial value, and additional attributes at declaration time.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#isBool <em>Bool</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getBool2 <em>Bool2</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getBool3 <em>Bool3</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getBool4 <em>Bool4</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getInt <em>Int</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getInt2 <em>Int2</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getInt3 <em>Int3</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat1x1 <em>Float1x1</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat1x2 <em>Float1x2</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat1x3 <em>Float1x3</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat1x4 <em>Float1x4</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat2x1 <em>Float2x1</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat2x2 <em>Float2x2</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat2x3 <em>Float2x3</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat2x4 <em>Float2x4</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat3x1 <em>Float3x1</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat3x2 <em>Float3x2</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat3x3 <em>Float3x3</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat3x4 <em>Float3x4</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat4x1 <em>Float4x1</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat4x2 <em>Float4x2</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat4x3 <em>Float4x3</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getSampler1D <em>Sampler1 D</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getSampler2D <em>Sampler2 D</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getSampler3D <em>Sampler3 D</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getSamplerCUBE <em>Sampler CUBE</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getSamplerRECT <em>Sampler RECT</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getSamplerDEPTH <em>Sampler DEPTH</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.khronos.collada.FxNewparamCommon#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon()
 * @model extendedMetaData="name='fx_newparam_common' kind='elementOnly'"
 * @generated
 */
public interface FxNewparamCommon extends EObject {
	/**
   * Returns the value of the '<em><b>Annotate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxAnnotateCommon}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The annotate element allows you to specify an annotation for this new param.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Annotate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Annotate()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotate' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxAnnotateCommon> getAnnotate();

	/**
   * Returns the value of the '<em><b>Semantic</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The semantic element allows you to specify a semantic for this new param.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Semantic</em>' attribute.
   * @see #setSemantic(String)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Semantic()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='element' name='semantic' namespace='##targetNamespace'"
   * @generated
   */
	String getSemantic();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getSemantic <em>Semantic</em>}' attribute.
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
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The modifier element allows you to specify a modifier for this new param.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Modifier</em>' attribute.
   * @see org.khronos.collada.FxModifierEnumCommon
   * @see #isSetModifier()
   * @see #unsetModifier()
   * @see #setModifier(FxModifierEnumCommon)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Modifier()
   * @model unsettable="true"
   *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
   * @generated
   */
	FxModifierEnumCommon getModifier();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getModifier <em>Modifier</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.FxNewparamCommon#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetModifier()
   * @see #getModifier()
   * @see #setModifier(FxModifierEnumCommon)
   * @generated
   */
	void unsetModifier();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxNewparamCommon#getModifier <em>Modifier</em>}' attribute is set.
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
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Bool()
   * @model unsettable="true" dataType="org.khronos.collada.Bool"
   *        extendedMetaData="kind='element' name='bool' namespace='##targetNamespace'"
   * @generated
   */
	boolean isBool();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#isBool <em>Bool</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.FxNewparamCommon#isBool <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetBool()
   * @see #isBool()
   * @see #setBool(boolean)
   * @generated
   */
	void unsetBool();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxNewparamCommon#isBool <em>Bool</em>}' attribute is set.
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
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Bool2()
   * @model dataType="org.khronos.collada.Bool2" many="false"
   *        extendedMetaData="kind='element' name='bool2' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool2();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getBool2 <em>Bool2</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Bool3()
   * @model dataType="org.khronos.collada.Bool3" many="false"
   *        extendedMetaData="kind='element' name='bool3' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool3();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getBool3 <em>Bool3</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Bool4()
   * @model dataType="org.khronos.collada.Bool4" many="false"
   *        extendedMetaData="kind='element' name='bool4' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool4();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getBool4 <em>Bool4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool4</em>' attribute.
   * @see #getBool4()
   * @generated
   */
	void setBool4(List<Boolean> value);

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
   * @see #setInt(long)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Int()
   * @model unsettable="true" dataType="org.khronos.collada.Int"
   *        extendedMetaData="kind='element' name='int' namespace='##targetNamespace'"
   * @generated
   */
	long getInt();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int</em>' attribute.
   * @see #isSetInt()
   * @see #unsetInt()
   * @see #getInt()
   * @generated
   */
	void setInt(long value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxNewparamCommon#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetInt()
   * @see #getInt()
   * @see #setInt(long)
   * @generated
   */
	void unsetInt();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxNewparamCommon#getInt <em>Int</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Int</em>' attribute is set.
   * @see #unsetInt()
   * @see #getInt()
   * @see #setInt(long)
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
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Int2()
   * @model dataType="org.khronos.collada.Int2" many="false"
   *        extendedMetaData="kind='element' name='int2' namespace='##targetNamespace'"
   * @generated
   */
	List<Long> getInt2();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getInt2 <em>Int2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int2</em>' attribute.
   * @see #getInt2()
   * @generated
   */
	void setInt2(List<Long> value);

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
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Int3()
   * @model dataType="org.khronos.collada.Int3" many="false"
   *        extendedMetaData="kind='element' name='int3' namespace='##targetNamespace'"
   * @generated
   */
	List<Long> getInt3();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getInt3 <em>Int3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int3</em>' attribute.
   * @see #getInt3()
   * @generated
   */
	void setInt3(List<Long> value);

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
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Int4()
   * @model dataType="org.khronos.collada.Int4" many="false"
   *        extendedMetaData="kind='element' name='int4' namespace='##targetNamespace'"
   * @generated
   */
	List<Long> getInt4();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getInt4 <em>Int4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int4</em>' attribute.
   * @see #getInt4()
   * @generated
   */
	void setInt4(List<Long> value);

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
   * @see #setFloat(double)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float()
   * @model unsettable="true" dataType="org.khronos.collada.Float"
   *        extendedMetaData="kind='element' name='float' namespace='##targetNamespace'"
   * @generated
   */
	double getFloat();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float</em>' attribute.
   * @see #isSetFloat()
   * @see #unsetFloat()
   * @see #getFloat()
   * @generated
   */
	void setFloat(double value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetFloat()
   * @see #getFloat()
   * @see #setFloat(double)
   * @generated
   */
	void unsetFloat();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat <em>Float</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Float</em>' attribute is set.
   * @see #unsetFloat()
   * @see #getFloat()
   * @see #setFloat(double)
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
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float2()
   * @model dataType="org.khronos.collada.Float2" many="false"
   *        extendedMetaData="kind='element' name='float2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat2 <em>Float2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2</em>' attribute.
   * @see #getFloat2()
   * @generated
   */
	void setFloat2(List<Double> value);

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
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float3()
   * @model dataType="org.khronos.collada.Float3" many="false"
   *        extendedMetaData="kind='element' name='float3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat3 <em>Float3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3</em>' attribute.
   * @see #getFloat3()
   * @generated
   */
	void setFloat3(List<Double> value);

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
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float4()
   * @model dataType="org.khronos.collada.Float4" many="false"
   *        extendedMetaData="kind='element' name='float4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat4 <em>Float4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4</em>' attribute.
   * @see #getFloat4()
   * @generated
   */
	void setFloat4(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float1x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float1x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float1x1</em>' attribute.
   * @see #isSetFloat1x1()
   * @see #unsetFloat1x1()
   * @see #setFloat1x1(double)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float1x1()
   * @model unsettable="true" dataType="org.khronos.collada.Float"
   *        extendedMetaData="kind='element' name='float1x1' namespace='##targetNamespace'"
   * @generated
   */
	double getFloat1x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat1x1 <em>Float1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float1x1</em>' attribute.
   * @see #isSetFloat1x1()
   * @see #unsetFloat1x1()
   * @see #getFloat1x1()
   * @generated
   */
	void setFloat1x1(double value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat1x1 <em>Float1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetFloat1x1()
   * @see #getFloat1x1()
   * @see #setFloat1x1(double)
   * @generated
   */
	void unsetFloat1x1();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat1x1 <em>Float1x1</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Float1x1</em>' attribute is set.
   * @see #unsetFloat1x1()
   * @see #getFloat1x1()
   * @see #setFloat1x1(double)
   * @generated
   */
	boolean isSetFloat1x1();

	/**
   * Returns the value of the '<em><b>Float1x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float1x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float1x2</em>' attribute.
   * @see #setFloat1x2(List)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float1x2()
   * @model dataType="org.khronos.collada.Float2" many="false"
   *        extendedMetaData="kind='element' name='float1x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat1x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat1x2 <em>Float1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float1x2</em>' attribute.
   * @see #getFloat1x2()
   * @generated
   */
	void setFloat1x2(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float1x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float1x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float1x3</em>' attribute.
   * @see #setFloat1x3(List)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float1x3()
   * @model dataType="org.khronos.collada.Float3" many="false"
   *        extendedMetaData="kind='element' name='float1x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat1x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat1x3 <em>Float1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float1x3</em>' attribute.
   * @see #getFloat1x3()
   * @generated
   */
	void setFloat1x3(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float1x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float1x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float1x4</em>' attribute.
   * @see #setFloat1x4(List)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float1x4()
   * @model dataType="org.khronos.collada.Float4" many="false"
   *        extendedMetaData="kind='element' name='float1x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat1x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat1x4 <em>Float1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float1x4</em>' attribute.
   * @see #getFloat1x4()
   * @generated
   */
	void setFloat1x4(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float2x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float2x1</em>' attribute.
   * @see #setFloat2x1(List)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float2x1()
   * @model dataType="org.khronos.collada.Float2" many="false"
   *        extendedMetaData="kind='element' name='float2x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat2x1 <em>Float2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2x1</em>' attribute.
   * @see #getFloat2x1()
   * @generated
   */
	void setFloat2x1(List<Double> value);

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
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float2x2()
   * @model dataType="org.khronos.collada.Float2x2" many="false"
   *        extendedMetaData="kind='element' name='float2x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat2x2 <em>Float2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2x2</em>' attribute.
   * @see #getFloat2x2()
   * @generated
   */
	void setFloat2x2(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float2x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float2x3</em>' attribute.
   * @see #setFloat2x3(List)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float2x3()
   * @model dataType="org.khronos.collada.Float2x3" many="false"
   *        extendedMetaData="kind='element' name='float2x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat2x3 <em>Float2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2x3</em>' attribute.
   * @see #getFloat2x3()
   * @generated
   */
	void setFloat2x3(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float2x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float2x4</em>' attribute.
   * @see #setFloat2x4(List)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float2x4()
   * @model dataType="org.khronos.collada.Float2x4" many="false"
   *        extendedMetaData="kind='element' name='float2x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat2x4 <em>Float2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2x4</em>' attribute.
   * @see #getFloat2x4()
   * @generated
   */
	void setFloat2x4(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float3x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float3x1</em>' attribute.
   * @see #setFloat3x1(List)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float3x1()
   * @model dataType="org.khronos.collada.Float3" many="false"
   *        extendedMetaData="kind='element' name='float3x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat3x1 <em>Float3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3x1</em>' attribute.
   * @see #getFloat3x1()
   * @generated
   */
	void setFloat3x1(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float3x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float3x2</em>' attribute.
   * @see #setFloat3x2(List)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float3x2()
   * @model dataType="org.khronos.collada.Float3x2" many="false"
   *        extendedMetaData="kind='element' name='float3x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat3x2 <em>Float3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3x2</em>' attribute.
   * @see #getFloat3x2()
   * @generated
   */
	void setFloat3x2(List<Double> value);

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
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float3x3()
   * @model dataType="org.khronos.collada.Float3x3" many="false"
   *        extendedMetaData="kind='element' name='float3x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat3x3 <em>Float3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3x3</em>' attribute.
   * @see #getFloat3x3()
   * @generated
   */
	void setFloat3x3(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float3x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float3x4</em>' attribute.
   * @see #setFloat3x4(List)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float3x4()
   * @model dataType="org.khronos.collada.Float3x4" many="false"
   *        extendedMetaData="kind='element' name='float3x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat3x4 <em>Float3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3x4</em>' attribute.
   * @see #getFloat3x4()
   * @generated
   */
	void setFloat3x4(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float4x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float4x1</em>' attribute.
   * @see #setFloat4x1(List)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float4x1()
   * @model dataType="org.khronos.collada.Float4" many="false"
   *        extendedMetaData="kind='element' name='float4x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat4x1 <em>Float4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4x1</em>' attribute.
   * @see #getFloat4x1()
   * @generated
   */
	void setFloat4x1(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float4x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float4x2</em>' attribute.
   * @see #setFloat4x2(List)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float4x2()
   * @model dataType="org.khronos.collada.Float4x2" many="false"
   *        extendedMetaData="kind='element' name='float4x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat4x2 <em>Float4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4x2</em>' attribute.
   * @see #getFloat4x2()
   * @generated
   */
	void setFloat4x2(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float4x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float4x3</em>' attribute.
   * @see #setFloat4x3(List)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float4x3()
   * @model dataType="org.khronos.collada.Float4x3" many="false"
   *        extendedMetaData="kind='element' name='float4x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat4x3 <em>Float4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4x3</em>' attribute.
   * @see #getFloat4x3()
   * @generated
   */
	void setFloat4x3(List<Double> value);

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
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Float4x4()
   * @model dataType="org.khronos.collada.Float4x4" many="false"
   *        extendedMetaData="kind='element' name='float4x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getFloat4x4 <em>Float4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4x4</em>' attribute.
   * @see #getFloat4x4()
   * @generated
   */
	void setFloat4x4(List<Double> value);

	/**
   * Returns the value of the '<em><b>Surface</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Surface</em>' containment reference.
   * @see #setSurface(FxSurfaceCommon)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Surface()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='surface' namespace='##targetNamespace'"
   * @generated
   */
	FxSurfaceCommon getSurface();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getSurface <em>Surface</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Surface</em>' containment reference.
   * @see #getSurface()
   * @generated
   */
	void setSurface(FxSurfaceCommon value);

	/**
   * Returns the value of the '<em><b>Sampler1 D</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler1 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler1 D</em>' containment reference.
   * @see #setSampler1D(FxSampler1DCommon)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Sampler1D()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sampler1D' namespace='##targetNamespace'"
   * @generated
   */
	FxSampler1DCommon getSampler1D();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getSampler1D <em>Sampler1 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler1 D</em>' containment reference.
   * @see #getSampler1D()
   * @generated
   */
	void setSampler1D(FxSampler1DCommon value);

	/**
   * Returns the value of the '<em><b>Sampler2 D</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler2 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler2 D</em>' containment reference.
   * @see #setSampler2D(FxSampler2DCommon)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Sampler2D()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sampler2D' namespace='##targetNamespace'"
   * @generated
   */
	FxSampler2DCommon getSampler2D();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getSampler2D <em>Sampler2 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler2 D</em>' containment reference.
   * @see #getSampler2D()
   * @generated
   */
	void setSampler2D(FxSampler2DCommon value);

	/**
   * Returns the value of the '<em><b>Sampler3 D</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler3 D</em>' containment reference.
   * @see #setSampler3D(FxSampler3DCommon)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Sampler3D()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sampler3D' namespace='##targetNamespace'"
   * @generated
   */
	FxSampler3DCommon getSampler3D();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getSampler3D <em>Sampler3 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler3 D</em>' containment reference.
   * @see #getSampler3D()
   * @generated
   */
	void setSampler3D(FxSampler3DCommon value);

	/**
   * Returns the value of the '<em><b>Sampler CUBE</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler CUBE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler CUBE</em>' containment reference.
   * @see #setSamplerCUBE(FxSamplerCUBECommon)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_SamplerCUBE()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='samplerCUBE' namespace='##targetNamespace'"
   * @generated
   */
	FxSamplerCUBECommon getSamplerCUBE();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getSamplerCUBE <em>Sampler CUBE</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler CUBE</em>' containment reference.
   * @see #getSamplerCUBE()
   * @generated
   */
	void setSamplerCUBE(FxSamplerCUBECommon value);

	/**
   * Returns the value of the '<em><b>Sampler RECT</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler RECT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler RECT</em>' containment reference.
   * @see #setSamplerRECT(FxSamplerRECTCommon)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_SamplerRECT()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='samplerRECT' namespace='##targetNamespace'"
   * @generated
   */
	FxSamplerRECTCommon getSamplerRECT();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getSamplerRECT <em>Sampler RECT</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler RECT</em>' containment reference.
   * @see #getSamplerRECT()
   * @generated
   */
	void setSamplerRECT(FxSamplerRECTCommon value);

	/**
   * Returns the value of the '<em><b>Sampler DEPTH</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler DEPTH</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler DEPTH</em>' containment reference.
   * @see #setSamplerDEPTH(FxSamplerDEPTHCommon)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_SamplerDEPTH()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='samplerDEPTH' namespace='##targetNamespace'"
   * @generated
   */
	FxSamplerDEPTHCommon getSamplerDEPTH();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getSamplerDEPTH <em>Sampler DEPTH</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler DEPTH</em>' containment reference.
   * @see #getSamplerDEPTH()
   * @generated
   */
	void setSamplerDEPTH(FxSamplerDEPTHCommon value);

	/**
   * Returns the value of the '<em><b>Enum</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Enum</em>' attribute.
   * @see #setEnum(String)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Enum()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='enum' namespace='##targetNamespace'"
   * @generated
   */
	String getEnum();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getEnum <em>Enum</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum</em>' attribute.
   * @see #getEnum()
   * @generated
   */
	void setEnum(String value);

	/**
   * Returns the value of the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 				The sid attribute is a text string value containing the sub-identifier of this element. 
   * 				This value must be unique within the scope of the parent element. Optional attribute.
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sid</em>' attribute.
   * @see #setSid(String)
   * @see org.khronos.collada.ColladaPackage#getFxNewparamCommon_Sid()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxNewparamCommon#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

} // FxNewparamCommon
