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
 * A representation of the model object '<em><b>Cg Newparam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			Create a new, named param object in the CG Runtime, assign it a type, an initial value, and additional attributes at declaration time.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.CgNewparam#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#isBool <em>Bool</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#isBool1 <em>Bool1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool2 <em>Bool2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool3 <em>Bool3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool4 <em>Bool4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool1x1 <em>Bool1x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool1x2 <em>Bool1x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool1x3 <em>Bool1x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool1x4 <em>Bool1x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool2x1 <em>Bool2x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool2x2 <em>Bool2x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool2x3 <em>Bool2x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool2x4 <em>Bool2x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool3x1 <em>Bool3x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool3x2 <em>Bool3x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool3x3 <em>Bool3x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool3x4 <em>Bool3x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool4x1 <em>Bool4x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool4x2 <em>Bool4x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool4x3 <em>Bool4x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getBool4x4 <em>Bool4x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat1 <em>Float1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat1x1 <em>Float1x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat1x2 <em>Float1x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat1x3 <em>Float1x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat1x4 <em>Float1x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat2x1 <em>Float2x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat2x2 <em>Float2x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat2x3 <em>Float2x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat2x4 <em>Float2x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat3x1 <em>Float3x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat3x2 <em>Float3x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat3x3 <em>Float3x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat3x4 <em>Float3x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat4x1 <em>Float4x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat4x2 <em>Float4x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat4x3 <em>Float4x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt <em>Int</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt1 <em>Int1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt2 <em>Int2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt3 <em>Int3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt1x1 <em>Int1x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt1x2 <em>Int1x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt1x3 <em>Int1x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt1x4 <em>Int1x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt2x1 <em>Int2x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt2x2 <em>Int2x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt2x3 <em>Int2x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt2x4 <em>Int2x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt3x1 <em>Int3x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt3x2 <em>Int3x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt3x3 <em>Int3x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt3x4 <em>Int3x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt4x1 <em>Int4x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt4x2 <em>Int4x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt4x3 <em>Int4x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getInt4x4 <em>Int4x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf <em>Half</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf1 <em>Half1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf2 <em>Half2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf3 <em>Half3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf4 <em>Half4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf1x1 <em>Half1x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf1x2 <em>Half1x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf1x3 <em>Half1x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf1x4 <em>Half1x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf2x1 <em>Half2x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf2x2 <em>Half2x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf2x3 <em>Half2x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf2x4 <em>Half2x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf3x1 <em>Half3x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf3x2 <em>Half3x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf3x3 <em>Half3x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf3x4 <em>Half3x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf4x1 <em>Half4x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf4x2 <em>Half4x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf4x3 <em>Half4x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getHalf4x4 <em>Half4x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed1 <em>Fixed1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed2 <em>Fixed2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed3 <em>Fixed3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed4 <em>Fixed4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed1x1 <em>Fixed1x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed1x2 <em>Fixed1x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed1x3 <em>Fixed1x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed1x4 <em>Fixed1x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed2x1 <em>Fixed2x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed2x2 <em>Fixed2x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed2x3 <em>Fixed2x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed2x4 <em>Fixed2x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed3x1 <em>Fixed3x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed3x2 <em>Fixed3x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed3x3 <em>Fixed3x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed3x4 <em>Fixed3x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed4x1 <em>Fixed4x1</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed4x2 <em>Fixed4x2</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed4x3 <em>Fixed4x3</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getFixed4x4 <em>Fixed4x4</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getSampler1D <em>Sampler1 D</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getSampler2D <em>Sampler2 D</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getSampler3D <em>Sampler3 D</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getSamplerRECT <em>Sampler RECT</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getSamplerCUBE <em>Sampler CUBE</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getSamplerDEPTH <em>Sampler DEPTH</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getString <em>String</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getUsertype <em>Usertype</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getArray <em>Array</em>}</li>
 *   <li>{@link org.khronos.collada.CgNewparam#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getCgNewparam()
 * @model extendedMetaData="name='cg_newparam' kind='elementOnly'"
 * @generated
 */
public interface CgNewparam extends EObject {
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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Annotate()
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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Semantic()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='element' name='semantic' namespace='##targetNamespace'"
   * @generated
   */
	String getSemantic();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getSemantic <em>Semantic</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Modifier()
   * @model unsettable="true"
   *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
   * @generated
   */
	FxModifierEnumCommon getModifier();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getModifier <em>Modifier</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.CgNewparam#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetModifier()
   * @see #getModifier()
   * @see #setModifier(FxModifierEnumCommon)
   * @generated
   */
	void unsetModifier();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.CgNewparam#getModifier <em>Modifier</em>}' attribute is set.
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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool()
   * @model unsettable="true" dataType="org.khronos.collada.CgBool"
   *        extendedMetaData="kind='element' name='bool' namespace='##targetNamespace'"
   * @generated
   */
	boolean isBool();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#isBool <em>Bool</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.CgNewparam#isBool <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetBool()
   * @see #isBool()
   * @see #setBool(boolean)
   * @generated
   */
	void unsetBool();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.CgNewparam#isBool <em>Bool</em>}' attribute is set.
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
   * Returns the value of the '<em><b>Bool1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool1</em>' attribute.
   * @see #isSetBool1()
   * @see #unsetBool1()
   * @see #setBool1(boolean)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool1()
   * @model unsettable="true" dataType="org.khronos.collada.CgBool1"
   *        extendedMetaData="kind='element' name='bool1' namespace='##targetNamespace'"
   * @generated
   */
	boolean isBool1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#isBool1 <em>Bool1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool1</em>' attribute.
   * @see #isSetBool1()
   * @see #unsetBool1()
   * @see #isBool1()
   * @generated
   */
	void setBool1(boolean value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.CgNewparam#isBool1 <em>Bool1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetBool1()
   * @see #isBool1()
   * @see #setBool1(boolean)
   * @generated
   */
	void unsetBool1();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.CgNewparam#isBool1 <em>Bool1</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Bool1</em>' attribute is set.
   * @see #unsetBool1()
   * @see #isBool1()
   * @see #setBool1(boolean)
   * @generated
   */
	boolean isSetBool1();

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool2()
   * @model dataType="org.khronos.collada.CgBool2" many="false"
   *        extendedMetaData="kind='element' name='bool2' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool2 <em>Bool2</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool3()
   * @model dataType="org.khronos.collada.CgBool3" many="false"
   *        extendedMetaData="kind='element' name='bool3' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool3 <em>Bool3</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool4()
   * @model dataType="org.khronos.collada.CgBool4" many="false"
   *        extendedMetaData="kind='element' name='bool4' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool4 <em>Bool4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool4</em>' attribute.
   * @see #getBool4()
   * @generated
   */
	void setBool4(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool1x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool1x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool1x1</em>' attribute.
   * @see #setBool1x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool1x1()
   * @model dataType="org.khronos.collada.CgBool1x1" many="false"
   *        extendedMetaData="kind='element' name='bool1x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool1x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool1x1 <em>Bool1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool1x1</em>' attribute.
   * @see #getBool1x1()
   * @generated
   */
	void setBool1x1(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool1x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool1x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool1x2</em>' attribute.
   * @see #setBool1x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool1x2()
   * @model dataType="org.khronos.collada.CgBool1x2" many="false"
   *        extendedMetaData="kind='element' name='bool1x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool1x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool1x2 <em>Bool1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool1x2</em>' attribute.
   * @see #getBool1x2()
   * @generated
   */
	void setBool1x2(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool1x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool1x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool1x3</em>' attribute.
   * @see #setBool1x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool1x3()
   * @model dataType="org.khronos.collada.CgBool1x3" many="false"
   *        extendedMetaData="kind='element' name='bool1x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool1x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool1x3 <em>Bool1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool1x3</em>' attribute.
   * @see #getBool1x3()
   * @generated
   */
	void setBool1x3(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool1x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool1x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool1x4</em>' attribute.
   * @see #setBool1x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool1x4()
   * @model dataType="org.khronos.collada.CgBool1x4" many="false"
   *        extendedMetaData="kind='element' name='bool1x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool1x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool1x4 <em>Bool1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool1x4</em>' attribute.
   * @see #getBool1x4()
   * @generated
   */
	void setBool1x4(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool2x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool2x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool2x1</em>' attribute.
   * @see #setBool2x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool2x1()
   * @model dataType="org.khronos.collada.CgBool2x1" many="false"
   *        extendedMetaData="kind='element' name='bool2x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool2x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool2x1 <em>Bool2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool2x1</em>' attribute.
   * @see #getBool2x1()
   * @generated
   */
	void setBool2x1(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool2x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool2x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool2x2</em>' attribute.
   * @see #setBool2x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool2x2()
   * @model dataType="org.khronos.collada.CgBool2x2" many="false"
   *        extendedMetaData="kind='element' name='bool2x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool2x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool2x2 <em>Bool2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool2x2</em>' attribute.
   * @see #getBool2x2()
   * @generated
   */
	void setBool2x2(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool2x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool2x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool2x3</em>' attribute.
   * @see #setBool2x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool2x3()
   * @model dataType="org.khronos.collada.CgBool2x3" many="false"
   *        extendedMetaData="kind='element' name='bool2x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool2x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool2x3 <em>Bool2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool2x3</em>' attribute.
   * @see #getBool2x3()
   * @generated
   */
	void setBool2x3(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool2x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool2x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool2x4</em>' attribute.
   * @see #setBool2x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool2x4()
   * @model dataType="org.khronos.collada.CgBool2x4" many="false"
   *        extendedMetaData="kind='element' name='bool2x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool2x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool2x4 <em>Bool2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool2x4</em>' attribute.
   * @see #getBool2x4()
   * @generated
   */
	void setBool2x4(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool3x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool3x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool3x1</em>' attribute.
   * @see #setBool3x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool3x1()
   * @model dataType="org.khronos.collada.CgBool3x1" many="false"
   *        extendedMetaData="kind='element' name='bool3x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool3x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool3x1 <em>Bool3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool3x1</em>' attribute.
   * @see #getBool3x1()
   * @generated
   */
	void setBool3x1(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool3x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool3x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool3x2</em>' attribute.
   * @see #setBool3x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool3x2()
   * @model dataType="org.khronos.collada.CgBool3x2" many="false"
   *        extendedMetaData="kind='element' name='bool3x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool3x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool3x2 <em>Bool3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool3x2</em>' attribute.
   * @see #getBool3x2()
   * @generated
   */
	void setBool3x2(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool3x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool3x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool3x3</em>' attribute.
   * @see #setBool3x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool3x3()
   * @model dataType="org.khronos.collada.CgBool3x3" many="false"
   *        extendedMetaData="kind='element' name='bool3x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool3x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool3x3 <em>Bool3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool3x3</em>' attribute.
   * @see #getBool3x3()
   * @generated
   */
	void setBool3x3(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool3x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool3x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool3x4</em>' attribute.
   * @see #setBool3x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool3x4()
   * @model dataType="org.khronos.collada.CgBool3x4" many="false"
   *        extendedMetaData="kind='element' name='bool3x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool3x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool3x4 <em>Bool3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool3x4</em>' attribute.
   * @see #getBool3x4()
   * @generated
   */
	void setBool3x4(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool4x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool4x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool4x1</em>' attribute.
   * @see #setBool4x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool4x1()
   * @model dataType="org.khronos.collada.CgBool4x1" many="false"
   *        extendedMetaData="kind='element' name='bool4x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool4x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool4x1 <em>Bool4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool4x1</em>' attribute.
   * @see #getBool4x1()
   * @generated
   */
	void setBool4x1(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool4x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool4x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool4x2</em>' attribute.
   * @see #setBool4x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool4x2()
   * @model dataType="org.khronos.collada.CgBool4x2" many="false"
   *        extendedMetaData="kind='element' name='bool4x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool4x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool4x2 <em>Bool4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool4x2</em>' attribute.
   * @see #getBool4x2()
   * @generated
   */
	void setBool4x2(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool4x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool4x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool4x3</em>' attribute.
   * @see #setBool4x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool4x3()
   * @model dataType="org.khronos.collada.CgBool4x3" many="false"
   *        extendedMetaData="kind='element' name='bool4x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool4x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool4x3 <em>Bool4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool4x3</em>' attribute.
   * @see #getBool4x3()
   * @generated
   */
	void setBool4x3(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool4x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool4x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool4x4</em>' attribute.
   * @see #setBool4x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Bool4x4()
   * @model dataType="org.khronos.collada.CgBool4x4" many="false"
   *        extendedMetaData="kind='element' name='bool4x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool4x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getBool4x4 <em>Bool4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool4x4</em>' attribute.
   * @see #getBool4x4()
   * @generated
   */
	void setBool4x4(List<Boolean> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float()
   * @model unsettable="true" dataType="org.khronos.collada.CgFloat"
   *        extendedMetaData="kind='element' name='float' namespace='##targetNamespace'"
   * @generated
   */
	float getFloat();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat <em>Float</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.CgNewparam#getFloat <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetFloat()
   * @see #getFloat()
   * @see #setFloat(float)
   * @generated
   */
	void unsetFloat();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.CgNewparam#getFloat <em>Float</em>}' attribute is set.
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
   * Returns the value of the '<em><b>Float1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float1</em>' attribute.
   * @see #isSetFloat1()
   * @see #unsetFloat1()
   * @see #setFloat1(float)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float1()
   * @model unsettable="true" dataType="org.khronos.collada.CgFloat1"
   *        extendedMetaData="kind='element' name='float1' namespace='##targetNamespace'"
   * @generated
   */
	float getFloat1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat1 <em>Float1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float1</em>' attribute.
   * @see #isSetFloat1()
   * @see #unsetFloat1()
   * @see #getFloat1()
   * @generated
   */
	void setFloat1(float value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.CgNewparam#getFloat1 <em>Float1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetFloat1()
   * @see #getFloat1()
   * @see #setFloat1(float)
   * @generated
   */
	void unsetFloat1();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.CgNewparam#getFloat1 <em>Float1</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Float1</em>' attribute is set.
   * @see #unsetFloat1()
   * @see #getFloat1()
   * @see #setFloat1(float)
   * @generated
   */
	boolean isSetFloat1();

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float2()
   * @model dataType="org.khronos.collada.CgFloat2" many="false"
   *        extendedMetaData="kind='element' name='float2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat2 <em>Float2</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float3()
   * @model dataType="org.khronos.collada.CgFloat3" many="false"
   *        extendedMetaData="kind='element' name='float3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat3 <em>Float3</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float4()
   * @model dataType="org.khronos.collada.CgFloat4" many="false"
   *        extendedMetaData="kind='element' name='float4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat4 <em>Float4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4</em>' attribute.
   * @see #getFloat4()
   * @generated
   */
	void setFloat4(List<Float> value);

	/**
   * Returns the value of the '<em><b>Float1x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float1x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float1x1</em>' attribute.
   * @see #setFloat1x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float1x1()
   * @model dataType="org.khronos.collada.CgFloat1x1" many="false"
   *        extendedMetaData="kind='element' name='float1x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat1x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat1x1 <em>Float1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float1x1</em>' attribute.
   * @see #getFloat1x1()
   * @generated
   */
	void setFloat1x1(List<Float> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float1x2()
   * @model dataType="org.khronos.collada.CgFloat1x2" many="false"
   *        extendedMetaData="kind='element' name='float1x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat1x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat1x2 <em>Float1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float1x2</em>' attribute.
   * @see #getFloat1x2()
   * @generated
   */
	void setFloat1x2(List<Float> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float1x3()
   * @model dataType="org.khronos.collada.CgFloat1x3" many="false"
   *        extendedMetaData="kind='element' name='float1x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat1x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat1x3 <em>Float1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float1x3</em>' attribute.
   * @see #getFloat1x3()
   * @generated
   */
	void setFloat1x3(List<Float> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float1x4()
   * @model dataType="org.khronos.collada.CgFloat1x4" many="false"
   *        extendedMetaData="kind='element' name='float1x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat1x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat1x4 <em>Float1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float1x4</em>' attribute.
   * @see #getFloat1x4()
   * @generated
   */
	void setFloat1x4(List<Float> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float2x1()
   * @model dataType="org.khronos.collada.CgFloat2x1" many="false"
   *        extendedMetaData="kind='element' name='float2x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat2x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat2x1 <em>Float2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2x1</em>' attribute.
   * @see #getFloat2x1()
   * @generated
   */
	void setFloat2x1(List<Float> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float2x2()
   * @model dataType="org.khronos.collada.CgFloat2x2" many="false"
   *        extendedMetaData="kind='element' name='float2x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat2x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat2x2 <em>Float2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2x2</em>' attribute.
   * @see #getFloat2x2()
   * @generated
   */
	void setFloat2x2(List<Float> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float2x3()
   * @model dataType="org.khronos.collada.CgFloat2x3" many="false"
   *        extendedMetaData="kind='element' name='float2x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat2x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat2x3 <em>Float2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2x3</em>' attribute.
   * @see #getFloat2x3()
   * @generated
   */
	void setFloat2x3(List<Float> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float2x4()
   * @model dataType="org.khronos.collada.CgFloat2x4" many="false"
   *        extendedMetaData="kind='element' name='float2x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat2x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat2x4 <em>Float2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2x4</em>' attribute.
   * @see #getFloat2x4()
   * @generated
   */
	void setFloat2x4(List<Float> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float3x1()
   * @model dataType="org.khronos.collada.CgFloat3x1" many="false"
   *        extendedMetaData="kind='element' name='float3x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat3x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat3x1 <em>Float3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3x1</em>' attribute.
   * @see #getFloat3x1()
   * @generated
   */
	void setFloat3x1(List<Float> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float3x2()
   * @model dataType="org.khronos.collada.CgFloat3x2" many="false"
   *        extendedMetaData="kind='element' name='float3x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat3x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat3x2 <em>Float3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3x2</em>' attribute.
   * @see #getFloat3x2()
   * @generated
   */
	void setFloat3x2(List<Float> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float3x3()
   * @model dataType="org.khronos.collada.CgFloat3x3" many="false"
   *        extendedMetaData="kind='element' name='float3x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat3x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat3x3 <em>Float3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3x3</em>' attribute.
   * @see #getFloat3x3()
   * @generated
   */
	void setFloat3x3(List<Float> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float3x4()
   * @model dataType="org.khronos.collada.CgFloat3x4" many="false"
   *        extendedMetaData="kind='element' name='float3x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat3x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat3x4 <em>Float3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3x4</em>' attribute.
   * @see #getFloat3x4()
   * @generated
   */
	void setFloat3x4(List<Float> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float4x1()
   * @model dataType="org.khronos.collada.CgFloat4x1" many="false"
   *        extendedMetaData="kind='element' name='float4x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat4x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat4x1 <em>Float4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4x1</em>' attribute.
   * @see #getFloat4x1()
   * @generated
   */
	void setFloat4x1(List<Float> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float4x2()
   * @model dataType="org.khronos.collada.CgFloat4x2" many="false"
   *        extendedMetaData="kind='element' name='float4x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat4x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat4x2 <em>Float4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4x2</em>' attribute.
   * @see #getFloat4x2()
   * @generated
   */
	void setFloat4x2(List<Float> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float4x3()
   * @model dataType="org.khronos.collada.CgFloat4x3" many="false"
   *        extendedMetaData="kind='element' name='float4x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat4x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat4x3 <em>Float4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4x3</em>' attribute.
   * @see #getFloat4x3()
   * @generated
   */
	void setFloat4x3(List<Float> value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Float4x4()
   * @model dataType="org.khronos.collada.CgFloat4x4" many="false"
   *        extendedMetaData="kind='element' name='float4x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFloat4x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFloat4x4 <em>Float4x4</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int()
   * @model unsettable="true" dataType="org.khronos.collada.CgInt"
   *        extendedMetaData="kind='element' name='int' namespace='##targetNamespace'"
   * @generated
   */
	int getInt();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt <em>Int</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.CgNewparam#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetInt()
   * @see #getInt()
   * @see #setInt(int)
   * @generated
   */
	void unsetInt();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.CgNewparam#getInt <em>Int</em>}' attribute is set.
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
   * Returns the value of the '<em><b>Int1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int1</em>' attribute.
   * @see #isSetInt1()
   * @see #unsetInt1()
   * @see #setInt1(int)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int1()
   * @model unsettable="true" dataType="org.khronos.collada.CgInt1"
   *        extendedMetaData="kind='element' name='int1' namespace='##targetNamespace'"
   * @generated
   */
	int getInt1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt1 <em>Int1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int1</em>' attribute.
   * @see #isSetInt1()
   * @see #unsetInt1()
   * @see #getInt1()
   * @generated
   */
	void setInt1(int value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.CgNewparam#getInt1 <em>Int1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetInt1()
   * @see #getInt1()
   * @see #setInt1(int)
   * @generated
   */
	void unsetInt1();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.CgNewparam#getInt1 <em>Int1</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Int1</em>' attribute is set.
   * @see #unsetInt1()
   * @see #getInt1()
   * @see #setInt1(int)
   * @generated
   */
	boolean isSetInt1();

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int2()
   * @model dataType="org.khronos.collada.CgInt2" many="false"
   *        extendedMetaData="kind='element' name='int2' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt2 <em>Int2</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int3()
   * @model dataType="org.khronos.collada.CgInt3" many="false"
   *        extendedMetaData="kind='element' name='int3' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt3 <em>Int3</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int4()
   * @model dataType="org.khronos.collada.CgInt4" many="false"
   *        extendedMetaData="kind='element' name='int4' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt4 <em>Int4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int4</em>' attribute.
   * @see #getInt4()
   * @generated
   */
	void setInt4(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int1x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int1x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int1x1</em>' attribute.
   * @see #setInt1x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int1x1()
   * @model dataType="org.khronos.collada.CgInt1x1" many="false"
   *        extendedMetaData="kind='element' name='int1x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt1x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt1x1 <em>Int1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int1x1</em>' attribute.
   * @see #getInt1x1()
   * @generated
   */
	void setInt1x1(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int1x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int1x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int1x2</em>' attribute.
   * @see #setInt1x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int1x2()
   * @model dataType="org.khronos.collada.CgInt1x2" many="false"
   *        extendedMetaData="kind='element' name='int1x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt1x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt1x2 <em>Int1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int1x2</em>' attribute.
   * @see #getInt1x2()
   * @generated
   */
	void setInt1x2(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int1x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int1x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int1x3</em>' attribute.
   * @see #setInt1x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int1x3()
   * @model dataType="org.khronos.collada.CgInt1x3" many="false"
   *        extendedMetaData="kind='element' name='int1x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt1x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt1x3 <em>Int1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int1x3</em>' attribute.
   * @see #getInt1x3()
   * @generated
   */
	void setInt1x3(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int1x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int1x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int1x4</em>' attribute.
   * @see #setInt1x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int1x4()
   * @model dataType="org.khronos.collada.CgInt1x4" many="false"
   *        extendedMetaData="kind='element' name='int1x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt1x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt1x4 <em>Int1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int1x4</em>' attribute.
   * @see #getInt1x4()
   * @generated
   */
	void setInt1x4(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int2x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int2x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int2x1</em>' attribute.
   * @see #setInt2x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int2x1()
   * @model dataType="org.khronos.collada.CgInt2x1" many="false"
   *        extendedMetaData="kind='element' name='int2x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt2x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt2x1 <em>Int2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int2x1</em>' attribute.
   * @see #getInt2x1()
   * @generated
   */
	void setInt2x1(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int2x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int2x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int2x2</em>' attribute.
   * @see #setInt2x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int2x2()
   * @model dataType="org.khronos.collada.CgInt2x2" many="false"
   *        extendedMetaData="kind='element' name='int2x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt2x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt2x2 <em>Int2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int2x2</em>' attribute.
   * @see #getInt2x2()
   * @generated
   */
	void setInt2x2(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int2x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int2x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int2x3</em>' attribute.
   * @see #setInt2x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int2x3()
   * @model dataType="org.khronos.collada.CgInt2x3" many="false"
   *        extendedMetaData="kind='element' name='int2x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt2x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt2x3 <em>Int2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int2x3</em>' attribute.
   * @see #getInt2x3()
   * @generated
   */
	void setInt2x3(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int2x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int2x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int2x4</em>' attribute.
   * @see #setInt2x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int2x4()
   * @model dataType="org.khronos.collada.CgInt2x4" many="false"
   *        extendedMetaData="kind='element' name='int2x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt2x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt2x4 <em>Int2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int2x4</em>' attribute.
   * @see #getInt2x4()
   * @generated
   */
	void setInt2x4(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int3x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int3x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int3x1</em>' attribute.
   * @see #setInt3x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int3x1()
   * @model dataType="org.khronos.collada.CgInt3x1" many="false"
   *        extendedMetaData="kind='element' name='int3x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt3x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt3x1 <em>Int3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int3x1</em>' attribute.
   * @see #getInt3x1()
   * @generated
   */
	void setInt3x1(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int3x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int3x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int3x2</em>' attribute.
   * @see #setInt3x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int3x2()
   * @model dataType="org.khronos.collada.CgInt3x2" many="false"
   *        extendedMetaData="kind='element' name='int3x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt3x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt3x2 <em>Int3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int3x2</em>' attribute.
   * @see #getInt3x2()
   * @generated
   */
	void setInt3x2(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int3x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int3x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int3x3</em>' attribute.
   * @see #setInt3x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int3x3()
   * @model dataType="org.khronos.collada.CgInt3x3" many="false"
   *        extendedMetaData="kind='element' name='int3x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt3x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt3x3 <em>Int3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int3x3</em>' attribute.
   * @see #getInt3x3()
   * @generated
   */
	void setInt3x3(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int3x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int3x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int3x4</em>' attribute.
   * @see #setInt3x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int3x4()
   * @model dataType="org.khronos.collada.CgInt3x4" many="false"
   *        extendedMetaData="kind='element' name='int3x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt3x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt3x4 <em>Int3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int3x4</em>' attribute.
   * @see #getInt3x4()
   * @generated
   */
	void setInt3x4(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int4x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int4x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int4x1</em>' attribute.
   * @see #setInt4x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int4x1()
   * @model dataType="org.khronos.collada.CgInt4x1" many="false"
   *        extendedMetaData="kind='element' name='int4x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt4x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt4x1 <em>Int4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int4x1</em>' attribute.
   * @see #getInt4x1()
   * @generated
   */
	void setInt4x1(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int4x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int4x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int4x2</em>' attribute.
   * @see #setInt4x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int4x2()
   * @model dataType="org.khronos.collada.CgInt4x2" many="false"
   *        extendedMetaData="kind='element' name='int4x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt4x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt4x2 <em>Int4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int4x2</em>' attribute.
   * @see #getInt4x2()
   * @generated
   */
	void setInt4x2(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int4x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int4x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int4x3</em>' attribute.
   * @see #setInt4x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int4x3()
   * @model dataType="org.khronos.collada.CgInt4x3" many="false"
   *        extendedMetaData="kind='element' name='int4x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt4x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt4x3 <em>Int4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int4x3</em>' attribute.
   * @see #getInt4x3()
   * @generated
   */
	void setInt4x3(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Int4x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int4x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int4x4</em>' attribute.
   * @see #setInt4x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Int4x4()
   * @model dataType="org.khronos.collada.CgInt4x4" many="false"
   *        extendedMetaData="kind='element' name='int4x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Integer> getInt4x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getInt4x4 <em>Int4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int4x4</em>' attribute.
   * @see #getInt4x4()
   * @generated
   */
	void setInt4x4(List<Integer> value);

	/**
   * Returns the value of the '<em><b>Half</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half</em>' attribute.
   * @see #isSetHalf()
   * @see #unsetHalf()
   * @see #setHalf(float)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half()
   * @model unsettable="true" dataType="org.khronos.collada.CgHalf"
   *        extendedMetaData="kind='element' name='half' namespace='##targetNamespace'"
   * @generated
   */
	float getHalf();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf <em>Half</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half</em>' attribute.
   * @see #isSetHalf()
   * @see #unsetHalf()
   * @see #getHalf()
   * @generated
   */
	void setHalf(float value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.CgNewparam#getHalf <em>Half</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetHalf()
   * @see #getHalf()
   * @see #setHalf(float)
   * @generated
   */
	void unsetHalf();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.CgNewparam#getHalf <em>Half</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Half</em>' attribute is set.
   * @see #unsetHalf()
   * @see #getHalf()
   * @see #setHalf(float)
   * @generated
   */
	boolean isSetHalf();

	/**
   * Returns the value of the '<em><b>Half1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half1</em>' attribute.
   * @see #isSetHalf1()
   * @see #unsetHalf1()
   * @see #setHalf1(float)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half1()
   * @model unsettable="true" dataType="org.khronos.collada.CgHalf1"
   *        extendedMetaData="kind='element' name='half1' namespace='##targetNamespace'"
   * @generated
   */
	float getHalf1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf1 <em>Half1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half1</em>' attribute.
   * @see #isSetHalf1()
   * @see #unsetHalf1()
   * @see #getHalf1()
   * @generated
   */
	void setHalf1(float value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.CgNewparam#getHalf1 <em>Half1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetHalf1()
   * @see #getHalf1()
   * @see #setHalf1(float)
   * @generated
   */
	void unsetHalf1();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.CgNewparam#getHalf1 <em>Half1</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Half1</em>' attribute is set.
   * @see #unsetHalf1()
   * @see #getHalf1()
   * @see #setHalf1(float)
   * @generated
   */
	boolean isSetHalf1();

	/**
   * Returns the value of the '<em><b>Half2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half2</em>' attribute.
   * @see #setHalf2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half2()
   * @model dataType="org.khronos.collada.CgHalf2" many="false"
   *        extendedMetaData="kind='element' name='half2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf2 <em>Half2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half2</em>' attribute.
   * @see #getHalf2()
   * @generated
   */
	void setHalf2(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half3</em>' attribute.
   * @see #setHalf3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half3()
   * @model dataType="org.khronos.collada.CgHalf3" many="false"
   *        extendedMetaData="kind='element' name='half3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf3 <em>Half3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half3</em>' attribute.
   * @see #getHalf3()
   * @generated
   */
	void setHalf3(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half4</em>' attribute.
   * @see #setHalf4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half4()
   * @model dataType="org.khronos.collada.CgHalf4" many="false"
   *        extendedMetaData="kind='element' name='half4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf4 <em>Half4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half4</em>' attribute.
   * @see #getHalf4()
   * @generated
   */
	void setHalf4(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half1x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half1x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half1x1</em>' attribute.
   * @see #setHalf1x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half1x1()
   * @model dataType="org.khronos.collada.CgHalf1x1" many="false"
   *        extendedMetaData="kind='element' name='half1x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf1x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf1x1 <em>Half1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half1x1</em>' attribute.
   * @see #getHalf1x1()
   * @generated
   */
	void setHalf1x1(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half1x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half1x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half1x2</em>' attribute.
   * @see #setHalf1x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half1x2()
   * @model dataType="org.khronos.collada.CgHalf1x2" many="false"
   *        extendedMetaData="kind='element' name='half1x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf1x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf1x2 <em>Half1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half1x2</em>' attribute.
   * @see #getHalf1x2()
   * @generated
   */
	void setHalf1x2(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half1x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half1x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half1x3</em>' attribute.
   * @see #setHalf1x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half1x3()
   * @model dataType="org.khronos.collada.CgHalf1x3" many="false"
   *        extendedMetaData="kind='element' name='half1x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf1x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf1x3 <em>Half1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half1x3</em>' attribute.
   * @see #getHalf1x3()
   * @generated
   */
	void setHalf1x3(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half1x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half1x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half1x4</em>' attribute.
   * @see #setHalf1x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half1x4()
   * @model dataType="org.khronos.collada.CgHalf1x4" many="false"
   *        extendedMetaData="kind='element' name='half1x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf1x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf1x4 <em>Half1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half1x4</em>' attribute.
   * @see #getHalf1x4()
   * @generated
   */
	void setHalf1x4(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half2x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half2x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half2x1</em>' attribute.
   * @see #setHalf2x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half2x1()
   * @model dataType="org.khronos.collada.CgHalf2x1" many="false"
   *        extendedMetaData="kind='element' name='half2x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf2x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf2x1 <em>Half2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half2x1</em>' attribute.
   * @see #getHalf2x1()
   * @generated
   */
	void setHalf2x1(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half2x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half2x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half2x2</em>' attribute.
   * @see #setHalf2x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half2x2()
   * @model dataType="org.khronos.collada.CgHalf2x2" many="false"
   *        extendedMetaData="kind='element' name='half2x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf2x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf2x2 <em>Half2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half2x2</em>' attribute.
   * @see #getHalf2x2()
   * @generated
   */
	void setHalf2x2(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half2x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half2x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half2x3</em>' attribute.
   * @see #setHalf2x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half2x3()
   * @model dataType="org.khronos.collada.CgHalf2x3" many="false"
   *        extendedMetaData="kind='element' name='half2x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf2x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf2x3 <em>Half2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half2x3</em>' attribute.
   * @see #getHalf2x3()
   * @generated
   */
	void setHalf2x3(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half2x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half2x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half2x4</em>' attribute.
   * @see #setHalf2x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half2x4()
   * @model dataType="org.khronos.collada.CgHalf2x4" many="false"
   *        extendedMetaData="kind='element' name='half2x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf2x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf2x4 <em>Half2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half2x4</em>' attribute.
   * @see #getHalf2x4()
   * @generated
   */
	void setHalf2x4(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half3x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half3x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half3x1</em>' attribute.
   * @see #setHalf3x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half3x1()
   * @model dataType="org.khronos.collada.CgHalf3x1" many="false"
   *        extendedMetaData="kind='element' name='half3x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf3x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf3x1 <em>Half3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half3x1</em>' attribute.
   * @see #getHalf3x1()
   * @generated
   */
	void setHalf3x1(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half3x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half3x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half3x2</em>' attribute.
   * @see #setHalf3x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half3x2()
   * @model dataType="org.khronos.collada.CgHalf3x2" many="false"
   *        extendedMetaData="kind='element' name='half3x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf3x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf3x2 <em>Half3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half3x2</em>' attribute.
   * @see #getHalf3x2()
   * @generated
   */
	void setHalf3x2(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half3x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half3x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half3x3</em>' attribute.
   * @see #setHalf3x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half3x3()
   * @model dataType="org.khronos.collada.CgHalf3x3" many="false"
   *        extendedMetaData="kind='element' name='half3x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf3x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf3x3 <em>Half3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half3x3</em>' attribute.
   * @see #getHalf3x3()
   * @generated
   */
	void setHalf3x3(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half3x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half3x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half3x4</em>' attribute.
   * @see #setHalf3x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half3x4()
   * @model dataType="org.khronos.collada.CgHalf3x4" many="false"
   *        extendedMetaData="kind='element' name='half3x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf3x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf3x4 <em>Half3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half3x4</em>' attribute.
   * @see #getHalf3x4()
   * @generated
   */
	void setHalf3x4(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half4x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half4x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half4x1</em>' attribute.
   * @see #setHalf4x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half4x1()
   * @model dataType="org.khronos.collada.CgHalf4x1" many="false"
   *        extendedMetaData="kind='element' name='half4x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf4x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf4x1 <em>Half4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half4x1</em>' attribute.
   * @see #getHalf4x1()
   * @generated
   */
	void setHalf4x1(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half4x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half4x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half4x2</em>' attribute.
   * @see #setHalf4x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half4x2()
   * @model dataType="org.khronos.collada.CgHalf4x2" many="false"
   *        extendedMetaData="kind='element' name='half4x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf4x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf4x2 <em>Half4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half4x2</em>' attribute.
   * @see #getHalf4x2()
   * @generated
   */
	void setHalf4x2(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half4x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half4x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half4x3</em>' attribute.
   * @see #setHalf4x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half4x3()
   * @model dataType="org.khronos.collada.CgHalf4x3" many="false"
   *        extendedMetaData="kind='element' name='half4x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf4x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf4x3 <em>Half4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half4x3</em>' attribute.
   * @see #getHalf4x3()
   * @generated
   */
	void setHalf4x3(List<Float> value);

	/**
   * Returns the value of the '<em><b>Half4x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half4x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Half4x4</em>' attribute.
   * @see #setHalf4x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Half4x4()
   * @model dataType="org.khronos.collada.CgHalf4x4" many="false"
   *        extendedMetaData="kind='element' name='half4x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getHalf4x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getHalf4x4 <em>Half4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half4x4</em>' attribute.
   * @see #getHalf4x4()
   * @generated
   */
	void setHalf4x4(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed</em>' attribute.
   * @see #isSetFixed()
   * @see #unsetFixed()
   * @see #setFixed(float)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed()
   * @model unsettable="true" dataType="org.khronos.collada.CgFixed"
   *        extendedMetaData="kind='element' name='fixed' namespace='##targetNamespace'"
   * @generated
   */
	float getFixed();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed <em>Fixed</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed</em>' attribute.
   * @see #isSetFixed()
   * @see #unsetFixed()
   * @see #getFixed()
   * @generated
   */
	void setFixed(float value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.CgNewparam#getFixed <em>Fixed</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetFixed()
   * @see #getFixed()
   * @see #setFixed(float)
   * @generated
   */
	void unsetFixed();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.CgNewparam#getFixed <em>Fixed</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Fixed</em>' attribute is set.
   * @see #unsetFixed()
   * @see #getFixed()
   * @see #setFixed(float)
   * @generated
   */
	boolean isSetFixed();

	/**
   * Returns the value of the '<em><b>Fixed1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed1</em>' attribute.
   * @see #isSetFixed1()
   * @see #unsetFixed1()
   * @see #setFixed1(float)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed1()
   * @model unsettable="true" dataType="org.khronos.collada.CgFixed1"
   *        extendedMetaData="kind='element' name='fixed1' namespace='##targetNamespace'"
   * @generated
   */
	float getFixed1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed1 <em>Fixed1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed1</em>' attribute.
   * @see #isSetFixed1()
   * @see #unsetFixed1()
   * @see #getFixed1()
   * @generated
   */
	void setFixed1(float value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.CgNewparam#getFixed1 <em>Fixed1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetFixed1()
   * @see #getFixed1()
   * @see #setFixed1(float)
   * @generated
   */
	void unsetFixed1();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.CgNewparam#getFixed1 <em>Fixed1</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Fixed1</em>' attribute is set.
   * @see #unsetFixed1()
   * @see #getFixed1()
   * @see #setFixed1(float)
   * @generated
   */
	boolean isSetFixed1();

	/**
   * Returns the value of the '<em><b>Fixed2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed2</em>' attribute.
   * @see #setFixed2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed2()
   * @model dataType="org.khronos.collada.CgFixed2" many="false"
   *        extendedMetaData="kind='element' name='fixed2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed2 <em>Fixed2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed2</em>' attribute.
   * @see #getFixed2()
   * @generated
   */
	void setFixed2(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed3</em>' attribute.
   * @see #setFixed3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed3()
   * @model dataType="org.khronos.collada.CgFixed3" many="false"
   *        extendedMetaData="kind='element' name='fixed3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed3 <em>Fixed3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed3</em>' attribute.
   * @see #getFixed3()
   * @generated
   */
	void setFixed3(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed4</em>' attribute.
   * @see #setFixed4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed4()
   * @model dataType="org.khronos.collada.CgFixed4" many="false"
   *        extendedMetaData="kind='element' name='fixed4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed4 <em>Fixed4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed4</em>' attribute.
   * @see #getFixed4()
   * @generated
   */
	void setFixed4(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed1x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed1x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed1x1</em>' attribute.
   * @see #setFixed1x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed1x1()
   * @model dataType="org.khronos.collada.CgFixed1x1" many="false"
   *        extendedMetaData="kind='element' name='fixed1x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed1x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed1x1 <em>Fixed1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed1x1</em>' attribute.
   * @see #getFixed1x1()
   * @generated
   */
	void setFixed1x1(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed1x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed1x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed1x2</em>' attribute.
   * @see #setFixed1x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed1x2()
   * @model dataType="org.khronos.collada.CgFixed1x2" many="false"
   *        extendedMetaData="kind='element' name='fixed1x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed1x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed1x2 <em>Fixed1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed1x2</em>' attribute.
   * @see #getFixed1x2()
   * @generated
   */
	void setFixed1x2(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed1x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed1x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed1x3</em>' attribute.
   * @see #setFixed1x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed1x3()
   * @model dataType="org.khronos.collada.CgFixed1x3" many="false"
   *        extendedMetaData="kind='element' name='fixed1x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed1x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed1x3 <em>Fixed1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed1x3</em>' attribute.
   * @see #getFixed1x3()
   * @generated
   */
	void setFixed1x3(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed1x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed1x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed1x4</em>' attribute.
   * @see #setFixed1x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed1x4()
   * @model dataType="org.khronos.collada.CgFixed1x4" many="false"
   *        extendedMetaData="kind='element' name='fixed1x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed1x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed1x4 <em>Fixed1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed1x4</em>' attribute.
   * @see #getFixed1x4()
   * @generated
   */
	void setFixed1x4(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed2x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed2x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed2x1</em>' attribute.
   * @see #setFixed2x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed2x1()
   * @model dataType="org.khronos.collada.CgFixed2x1" many="false"
   *        extendedMetaData="kind='element' name='fixed2x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed2x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed2x1 <em>Fixed2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed2x1</em>' attribute.
   * @see #getFixed2x1()
   * @generated
   */
	void setFixed2x1(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed2x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed2x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed2x2</em>' attribute.
   * @see #setFixed2x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed2x2()
   * @model dataType="org.khronos.collada.CgFixed2x2" many="false"
   *        extendedMetaData="kind='element' name='fixed2x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed2x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed2x2 <em>Fixed2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed2x2</em>' attribute.
   * @see #getFixed2x2()
   * @generated
   */
	void setFixed2x2(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed2x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed2x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed2x3</em>' attribute.
   * @see #setFixed2x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed2x3()
   * @model dataType="org.khronos.collada.CgFixed2x3" many="false"
   *        extendedMetaData="kind='element' name='fixed2x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed2x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed2x3 <em>Fixed2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed2x3</em>' attribute.
   * @see #getFixed2x3()
   * @generated
   */
	void setFixed2x3(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed2x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed2x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed2x4</em>' attribute.
   * @see #setFixed2x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed2x4()
   * @model dataType="org.khronos.collada.CgFixed2x4" many="false"
   *        extendedMetaData="kind='element' name='fixed2x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed2x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed2x4 <em>Fixed2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed2x4</em>' attribute.
   * @see #getFixed2x4()
   * @generated
   */
	void setFixed2x4(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed3x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed3x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed3x1</em>' attribute.
   * @see #setFixed3x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed3x1()
   * @model dataType="org.khronos.collada.CgFixed3x1" many="false"
   *        extendedMetaData="kind='element' name='fixed3x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed3x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed3x1 <em>Fixed3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed3x1</em>' attribute.
   * @see #getFixed3x1()
   * @generated
   */
	void setFixed3x1(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed3x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed3x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed3x2</em>' attribute.
   * @see #setFixed3x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed3x2()
   * @model dataType="org.khronos.collada.CgFixed3x2" many="false"
   *        extendedMetaData="kind='element' name='fixed3x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed3x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed3x2 <em>Fixed3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed3x2</em>' attribute.
   * @see #getFixed3x2()
   * @generated
   */
	void setFixed3x2(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed3x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed3x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed3x3</em>' attribute.
   * @see #setFixed3x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed3x3()
   * @model dataType="org.khronos.collada.CgFixed3x3" many="false"
   *        extendedMetaData="kind='element' name='fixed3x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed3x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed3x3 <em>Fixed3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed3x3</em>' attribute.
   * @see #getFixed3x3()
   * @generated
   */
	void setFixed3x3(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed3x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed3x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed3x4</em>' attribute.
   * @see #setFixed3x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed3x4()
   * @model dataType="org.khronos.collada.CgFixed3x4" many="false"
   *        extendedMetaData="kind='element' name='fixed3x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed3x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed3x4 <em>Fixed3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed3x4</em>' attribute.
   * @see #getFixed3x4()
   * @generated
   */
	void setFixed3x4(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed4x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed4x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed4x1</em>' attribute.
   * @see #setFixed4x1(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed4x1()
   * @model dataType="org.khronos.collada.CgFixed4x1" many="false"
   *        extendedMetaData="kind='element' name='fixed4x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed4x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed4x1 <em>Fixed4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed4x1</em>' attribute.
   * @see #getFixed4x1()
   * @generated
   */
	void setFixed4x1(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed4x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed4x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed4x2</em>' attribute.
   * @see #setFixed4x2(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed4x2()
   * @model dataType="org.khronos.collada.CgFixed4x2" many="false"
   *        extendedMetaData="kind='element' name='fixed4x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed4x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed4x2 <em>Fixed4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed4x2</em>' attribute.
   * @see #getFixed4x2()
   * @generated
   */
	void setFixed4x2(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed4x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed4x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed4x3</em>' attribute.
   * @see #setFixed4x3(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed4x3()
   * @model dataType="org.khronos.collada.CgFixed4x3" many="false"
   *        extendedMetaData="kind='element' name='fixed4x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed4x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed4x3 <em>Fixed4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed4x3</em>' attribute.
   * @see #getFixed4x3()
   * @generated
   */
	void setFixed4x3(List<Float> value);

	/**
   * Returns the value of the '<em><b>Fixed4x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed4x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed4x4</em>' attribute.
   * @see #setFixed4x4(List)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Fixed4x4()
   * @model dataType="org.khronos.collada.CgFixed4x4" many="false"
   *        extendedMetaData="kind='element' name='fixed4x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Float> getFixed4x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getFixed4x4 <em>Fixed4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed4x4</em>' attribute.
   * @see #getFixed4x4()
   * @generated
   */
	void setFixed4x4(List<Float> value);

	/**
   * Returns the value of the '<em><b>Surface</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Surface</em>' containment reference.
   * @see #setSurface(CgSurfaceType)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Surface()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='surface' namespace='##targetNamespace'"
   * @generated
   */
	CgSurfaceType getSurface();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getSurface <em>Surface</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Surface</em>' containment reference.
   * @see #getSurface()
   * @generated
   */
	void setSurface(CgSurfaceType value);

	/**
   * Returns the value of the '<em><b>Sampler1 D</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler1 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler1 D</em>' containment reference.
   * @see #setSampler1D(CgSampler1D)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Sampler1D()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sampler1D' namespace='##targetNamespace'"
   * @generated
   */
	CgSampler1D getSampler1D();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getSampler1D <em>Sampler1 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler1 D</em>' containment reference.
   * @see #getSampler1D()
   * @generated
   */
	void setSampler1D(CgSampler1D value);

	/**
   * Returns the value of the '<em><b>Sampler2 D</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler2 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler2 D</em>' containment reference.
   * @see #setSampler2D(CgSampler2D)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Sampler2D()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sampler2D' namespace='##targetNamespace'"
   * @generated
   */
	CgSampler2D getSampler2D();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getSampler2D <em>Sampler2 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler2 D</em>' containment reference.
   * @see #getSampler2D()
   * @generated
   */
	void setSampler2D(CgSampler2D value);

	/**
   * Returns the value of the '<em><b>Sampler3 D</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler3 D</em>' containment reference.
   * @see #setSampler3D(CgSampler3D)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Sampler3D()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sampler3D' namespace='##targetNamespace'"
   * @generated
   */
	CgSampler3D getSampler3D();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getSampler3D <em>Sampler3 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler3 D</em>' containment reference.
   * @see #getSampler3D()
   * @generated
   */
	void setSampler3D(CgSampler3D value);

	/**
   * Returns the value of the '<em><b>Sampler RECT</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler RECT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler RECT</em>' containment reference.
   * @see #setSamplerRECT(CgSamplerRECT)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_SamplerRECT()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='samplerRECT' namespace='##targetNamespace'"
   * @generated
   */
	CgSamplerRECT getSamplerRECT();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getSamplerRECT <em>Sampler RECT</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler RECT</em>' containment reference.
   * @see #getSamplerRECT()
   * @generated
   */
	void setSamplerRECT(CgSamplerRECT value);

	/**
   * Returns the value of the '<em><b>Sampler CUBE</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler CUBE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler CUBE</em>' containment reference.
   * @see #setSamplerCUBE(CgSamplerCUBE)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_SamplerCUBE()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='samplerCUBE' namespace='##targetNamespace'"
   * @generated
   */
	CgSamplerCUBE getSamplerCUBE();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getSamplerCUBE <em>Sampler CUBE</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler CUBE</em>' containment reference.
   * @see #getSamplerCUBE()
   * @generated
   */
	void setSamplerCUBE(CgSamplerCUBE value);

	/**
   * Returns the value of the '<em><b>Sampler DEPTH</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler DEPTH</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler DEPTH</em>' containment reference.
   * @see #setSamplerDEPTH(CgSamplerDEPTH)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_SamplerDEPTH()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='samplerDEPTH' namespace='##targetNamespace'"
   * @generated
   */
	CgSamplerDEPTH getSamplerDEPTH();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getSamplerDEPTH <em>Sampler DEPTH</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler DEPTH</em>' containment reference.
   * @see #getSamplerDEPTH()
   * @generated
   */
	void setSamplerDEPTH(CgSamplerDEPTH value);

	/**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_String()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='string' namespace='##targetNamespace'"
   * @generated
   */
	String getString();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
	void setString(String value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Enum()
   * @model dataType="org.khronos.collada.GlEnumeration"
   *        extendedMetaData="kind='element' name='enum' namespace='##targetNamespace'"
   * @generated
   */
	Enumerator getEnum();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getEnum <em>Enum</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum</em>' attribute.
   * @see #getEnum()
   * @generated
   */
	void setEnum(Enumerator value);

	/**
   * Returns the value of the '<em><b>Usertype</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usertype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Usertype</em>' containment reference.
   * @see #setUsertype(CgSetuserType)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Usertype()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='usertype' namespace='##targetNamespace'"
   * @generated
   */
	CgSetuserType getUsertype();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getUsertype <em>Usertype</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Usertype</em>' containment reference.
   * @see #getUsertype()
   * @generated
   */
	void setUsertype(CgSetuserType value);

	/**
   * Returns the value of the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference.
   * @see #setArray(CgNewarrayType)
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Array()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='array' namespace='##targetNamespace'"
   * @generated
   */
	CgNewarrayType getArray();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
	void setArray(CgNewarrayType value);

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
   * @see org.khronos.collada.ColladaPackage#getCgNewparam_Sid()
   * @model dataType="org.khronos.collada.CgIdentifier" required="true"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgNewparam#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

} // CgNewparam
