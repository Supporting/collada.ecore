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
 * A representation of the model object '<em><b>Fx Annotate Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#isBool <em>Bool</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getBool2 <em>Bool2</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getBool3 <em>Bool3</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getBool4 <em>Bool4</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getInt <em>Int</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getInt2 <em>Int2</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getInt3 <em>Int3</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getFloat2x2 <em>Float2x2</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getFloat3x3 <em>Float3x3</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getString <em>String</em>}</li>
 *   <li>{@link org.khronos.collada.FxAnnotateCommon#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon()
 * @model extendedMetaData="name='fx_annotate_common' kind='elementOnly'"
 * @generated
 */
public interface FxAnnotateCommon extends EObject {
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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Bool()
   * @model unsettable="true" dataType="org.khronos.collada.Bool"
   *        extendedMetaData="kind='element' name='bool' namespace='##targetNamespace'"
   * @generated
   */
	boolean isBool();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#isBool <em>Bool</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.FxAnnotateCommon#isBool <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetBool()
   * @see #isBool()
   * @see #setBool(boolean)
   * @generated
   */
	void unsetBool();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxAnnotateCommon#isBool <em>Bool</em>}' attribute is set.
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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Bool2()
   * @model dataType="org.khronos.collada.Bool2" many="false"
   *        extendedMetaData="kind='element' name='bool2' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool2();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getBool2 <em>Bool2</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Bool3()
   * @model dataType="org.khronos.collada.Bool3" many="false"
   *        extendedMetaData="kind='element' name='bool3' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool3();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getBool3 <em>Bool3</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Bool4()
   * @model dataType="org.khronos.collada.Bool4" many="false"
   *        extendedMetaData="kind='element' name='bool4' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool4();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getBool4 <em>Bool4</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Int()
   * @model unsettable="true" dataType="org.khronos.collada.Int"
   *        extendedMetaData="kind='element' name='int' namespace='##targetNamespace'"
   * @generated
   */
	long getInt();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getInt <em>Int</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetInt()
   * @see #getInt()
   * @see #setInt(long)
   * @generated
   */
	void unsetInt();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxAnnotateCommon#getInt <em>Int</em>}' attribute is set.
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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Int2()
   * @model dataType="org.khronos.collada.Int2" many="false"
   *        extendedMetaData="kind='element' name='int2' namespace='##targetNamespace'"
   * @generated
   */
	List<Long> getInt2();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getInt2 <em>Int2</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Int3()
   * @model dataType="org.khronos.collada.Int3" many="false"
   *        extendedMetaData="kind='element' name='int3' namespace='##targetNamespace'"
   * @generated
   */
	List<Long> getInt3();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getInt3 <em>Int3</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Int4()
   * @model dataType="org.khronos.collada.Int4" many="false"
   *        extendedMetaData="kind='element' name='int4' namespace='##targetNamespace'"
   * @generated
   */
	List<Long> getInt4();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getInt4 <em>Int4</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Float()
   * @model unsettable="true" dataType="org.khronos.collada.Float"
   *        extendedMetaData="kind='element' name='float' namespace='##targetNamespace'"
   * @generated
   */
	double getFloat();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getFloat <em>Float</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getFloat <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetFloat()
   * @see #getFloat()
   * @see #setFloat(double)
   * @generated
   */
	void unsetFloat();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxAnnotateCommon#getFloat <em>Float</em>}' attribute is set.
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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Float2()
   * @model dataType="org.khronos.collada.Float2" many="false"
   *        extendedMetaData="kind='element' name='float2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getFloat2 <em>Float2</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Float3()
   * @model dataType="org.khronos.collada.Float3" many="false"
   *        extendedMetaData="kind='element' name='float3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getFloat3 <em>Float3</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Float4()
   * @model dataType="org.khronos.collada.Float4" many="false"
   *        extendedMetaData="kind='element' name='float4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getFloat4 <em>Float4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4</em>' attribute.
   * @see #getFloat4()
   * @generated
   */
	void setFloat4(List<Double> value);

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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Float2x2()
   * @model dataType="org.khronos.collada.Float2x2" many="false"
   *        extendedMetaData="kind='element' name='float2x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getFloat2x2 <em>Float2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2x2</em>' attribute.
   * @see #getFloat2x2()
   * @generated
   */
	void setFloat2x2(List<Double> value);

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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Float3x3()
   * @model dataType="org.khronos.collada.Float3x3" many="false"
   *        extendedMetaData="kind='element' name='float3x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getFloat3x3 <em>Float3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3x3</em>' attribute.
   * @see #getFloat3x3()
   * @generated
   */
	void setFloat3x3(List<Double> value);

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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Float4x4()
   * @model dataType="org.khronos.collada.Float4x4" many="false"
   *        extendedMetaData="kind='element' name='float4x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getFloat4x4 <em>Float4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4x4</em>' attribute.
   * @see #getFloat4x4()
   * @generated
   */
	void setFloat4x4(List<Double> value);

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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_String()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='string' namespace='##targetNamespace'"
   * @generated
   */
	String getString();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
	void setString(String value);

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
   * @see org.khronos.collada.ColladaPackage#getFxAnnotateCommon_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxAnnotateCommon#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // FxAnnotateCommon
