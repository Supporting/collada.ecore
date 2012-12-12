/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setparam Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.SetparamType1#isBool <em>Bool</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getBool2 <em>Bool2</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getBool3 <em>Bool3</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getBool4 <em>Bool4</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getInt <em>Int</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getInt2 <em>Int2</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getInt3 <em>Int3</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat1x1 <em>Float1x1</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat1x2 <em>Float1x2</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat1x3 <em>Float1x3</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat1x4 <em>Float1x4</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat2x1 <em>Float2x1</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat2x2 <em>Float2x2</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat2x3 <em>Float2x3</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat2x4 <em>Float2x4</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat3x1 <em>Float3x1</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat3x2 <em>Float3x2</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat3x3 <em>Float3x3</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat3x4 <em>Float3x4</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat4x1 <em>Float4x1</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat4x2 <em>Float4x2</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat4x3 <em>Float4x3</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getSampler1D <em>Sampler1 D</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getSampler2D <em>Sampler2 D</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getSampler3D <em>Sampler3 D</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getSamplerCUBE <em>Sampler CUBE</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getSamplerRECT <em>Sampler RECT</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getSamplerDEPTH <em>Sampler DEPTH</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType1#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getSetparamType1()
 * @model extendedMetaData="name='setparam_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface SetparamType1 extends EObject {
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Bool()
   * @model unsettable="true" dataType="org.khronos.collada.Bool"
   *        extendedMetaData="kind='element' name='bool' namespace='##targetNamespace'"
   * @generated
   */
	boolean isBool();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#isBool <em>Bool</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.SetparamType1#isBool <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetBool()
   * @see #isBool()
   * @see #setBool(boolean)
   * @generated
   */
	void unsetBool();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.SetparamType1#isBool <em>Bool</em>}' attribute is set.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Bool2()
   * @model dataType="org.khronos.collada.Bool2" many="false"
   *        extendedMetaData="kind='element' name='bool2' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool2();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getBool2 <em>Bool2</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Bool3()
   * @model dataType="org.khronos.collada.Bool3" many="false"
   *        extendedMetaData="kind='element' name='bool3' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool3();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getBool3 <em>Bool3</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Bool4()
   * @model dataType="org.khronos.collada.Bool4" many="false"
   *        extendedMetaData="kind='element' name='bool4' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool4();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getBool4 <em>Bool4</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Int()
   * @model unsettable="true" dataType="org.khronos.collada.Int"
   *        extendedMetaData="kind='element' name='int' namespace='##targetNamespace'"
   * @generated
   */
	long getInt();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getInt <em>Int</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.SetparamType1#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetInt()
   * @see #getInt()
   * @see #setInt(long)
   * @generated
   */
	void unsetInt();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.SetparamType1#getInt <em>Int</em>}' attribute is set.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Int2()
   * @model dataType="org.khronos.collada.Int2" many="false"
   *        extendedMetaData="kind='element' name='int2' namespace='##targetNamespace'"
   * @generated
   */
	List<Long> getInt2();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getInt2 <em>Int2</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Int3()
   * @model dataType="org.khronos.collada.Int3" many="false"
   *        extendedMetaData="kind='element' name='int3' namespace='##targetNamespace'"
   * @generated
   */
	List<Long> getInt3();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getInt3 <em>Int3</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Int4()
   * @model dataType="org.khronos.collada.Int4" many="false"
   *        extendedMetaData="kind='element' name='int4' namespace='##targetNamespace'"
   * @generated
   */
	List<Long> getInt4();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getInt4 <em>Int4</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float()
   * @model unsettable="true" dataType="org.khronos.collada.Float"
   *        extendedMetaData="kind='element' name='float' namespace='##targetNamespace'"
   * @generated
   */
	double getFloat();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat <em>Float</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.SetparamType1#getFloat <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetFloat()
   * @see #getFloat()
   * @see #setFloat(double)
   * @generated
   */
	void unsetFloat();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.SetparamType1#getFloat <em>Float</em>}' attribute is set.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float2()
   * @model dataType="org.khronos.collada.Float2" many="false"
   *        extendedMetaData="kind='element' name='float2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat2 <em>Float2</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float3()
   * @model dataType="org.khronos.collada.Float3" many="false"
   *        extendedMetaData="kind='element' name='float3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat3 <em>Float3</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float4()
   * @model dataType="org.khronos.collada.Float4" many="false"
   *        extendedMetaData="kind='element' name='float4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat4 <em>Float4</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float1x1()
   * @model unsettable="true" dataType="org.khronos.collada.Float"
   *        extendedMetaData="kind='element' name='float1x1' namespace='##targetNamespace'"
   * @generated
   */
	double getFloat1x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat1x1 <em>Float1x1</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.SetparamType1#getFloat1x1 <em>Float1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetFloat1x1()
   * @see #getFloat1x1()
   * @see #setFloat1x1(double)
   * @generated
   */
	void unsetFloat1x1();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.SetparamType1#getFloat1x1 <em>Float1x1</em>}' attribute is set.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float1x2()
   * @model dataType="org.khronos.collada.Float2" many="false"
   *        extendedMetaData="kind='element' name='float1x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat1x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat1x2 <em>Float1x2</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float1x3()
   * @model dataType="org.khronos.collada.Float3" many="false"
   *        extendedMetaData="kind='element' name='float1x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat1x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat1x3 <em>Float1x3</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float1x4()
   * @model dataType="org.khronos.collada.Float4" many="false"
   *        extendedMetaData="kind='element' name='float1x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat1x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat1x4 <em>Float1x4</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float2x1()
   * @model dataType="org.khronos.collada.Float2" many="false"
   *        extendedMetaData="kind='element' name='float2x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat2x1 <em>Float2x1</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float2x2()
   * @model dataType="org.khronos.collada.Float2x2" many="false"
   *        extendedMetaData="kind='element' name='float2x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat2x2 <em>Float2x2</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float2x3()
   * @model dataType="org.khronos.collada.Float2x3" many="false"
   *        extendedMetaData="kind='element' name='float2x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat2x3 <em>Float2x3</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float2x4()
   * @model dataType="org.khronos.collada.Float2x4" many="false"
   *        extendedMetaData="kind='element' name='float2x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat2x4 <em>Float2x4</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float3x1()
   * @model dataType="org.khronos.collada.Float3" many="false"
   *        extendedMetaData="kind='element' name='float3x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat3x1 <em>Float3x1</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float3x2()
   * @model dataType="org.khronos.collada.Float3x2" many="false"
   *        extendedMetaData="kind='element' name='float3x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat3x2 <em>Float3x2</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float3x3()
   * @model dataType="org.khronos.collada.Float3x3" many="false"
   *        extendedMetaData="kind='element' name='float3x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat3x3 <em>Float3x3</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float3x4()
   * @model dataType="org.khronos.collada.Float3x4" many="false"
   *        extendedMetaData="kind='element' name='float3x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat3x4 <em>Float3x4</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float4x1()
   * @model dataType="org.khronos.collada.Float4" many="false"
   *        extendedMetaData="kind='element' name='float4x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat4x1 <em>Float4x1</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float4x2()
   * @model dataType="org.khronos.collada.Float4x2" many="false"
   *        extendedMetaData="kind='element' name='float4x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat4x2 <em>Float4x2</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float4x3()
   * @model dataType="org.khronos.collada.Float4x3" many="false"
   *        extendedMetaData="kind='element' name='float4x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat4x3 <em>Float4x3</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Float4x4()
   * @model dataType="org.khronos.collada.Float4x4" many="false"
   *        extendedMetaData="kind='element' name='float4x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getFloat4x4 <em>Float4x4</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Surface()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='surface' namespace='##targetNamespace'"
   * @generated
   */
	FxSurfaceCommon getSurface();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getSurface <em>Surface</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Sampler1D()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sampler1D' namespace='##targetNamespace'"
   * @generated
   */
	FxSampler1DCommon getSampler1D();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getSampler1D <em>Sampler1 D</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Sampler2D()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sampler2D' namespace='##targetNamespace'"
   * @generated
   */
	FxSampler2DCommon getSampler2D();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getSampler2D <em>Sampler2 D</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Sampler3D()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sampler3D' namespace='##targetNamespace'"
   * @generated
   */
	FxSampler3DCommon getSampler3D();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getSampler3D <em>Sampler3 D</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_SamplerCUBE()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='samplerCUBE' namespace='##targetNamespace'"
   * @generated
   */
	FxSamplerCUBECommon getSamplerCUBE();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getSamplerCUBE <em>Sampler CUBE</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_SamplerRECT()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='samplerRECT' namespace='##targetNamespace'"
   * @generated
   */
	FxSamplerRECTCommon getSamplerRECT();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getSamplerRECT <em>Sampler RECT</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_SamplerDEPTH()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='samplerDEPTH' namespace='##targetNamespace'"
   * @generated
   */
	FxSamplerDEPTHCommon getSamplerDEPTH();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getSamplerDEPTH <em>Sampler DEPTH</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Enum()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='enum' namespace='##targetNamespace'"
   * @generated
   */
	String getEnum();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getEnum <em>Enum</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum</em>' attribute.
   * @see #getEnum()
   * @generated
   */
	void setEnum(String value);

	/**
   * Returns the value of the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' attribute.
   * @see #setRef(String)
   * @see org.khronos.collada.ColladaPackage#getSetparamType1_Ref()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token" required="true"
   *        extendedMetaData="kind='attribute' name='ref'"
   * @generated
   */
	String getRef();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType1#getRef <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' attribute.
   * @see #getRef()
   * @generated
   */
	void setRef(String value);

} // SetparamType1
