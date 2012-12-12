/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.FloatArrayType#getValue <em>Value</em>}</li>
 *   <li>{@link org.khronos.collada.FloatArrayType#getCount <em>Count</em>}</li>
 *   <li>{@link org.khronos.collada.FloatArrayType#getDigits <em>Digits</em>}</li>
 *   <li>{@link org.khronos.collada.FloatArrayType#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.FloatArrayType#getMagnitude <em>Magnitude</em>}</li>
 *   <li>{@link org.khronos.collada.FloatArrayType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getFloatArrayType()
 * @model extendedMetaData="name='float_array_._type' kind='simple'"
 * @generated
 */
public interface FloatArrayType extends EObject {
	/**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(List)
   * @see org.khronos.collada.ColladaPackage#getFloatArrayType_Value()
   * @model dataType="org.khronos.collada.ListOfFloats" many="false"
   *        extendedMetaData="name=':0' kind='simple'"
   * @generated
   */
	List<Double> getValue();

	/**
   * Sets the value of the '{@link org.khronos.collada.FloatArrayType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
	void setValue(List<Double> value);

	/**
   * Returns the value of the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The count attribute indicates the number of values in the array. Required attribute.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Count</em>' attribute.
   * @see #setCount(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getFloatArrayType_Count()
   * @model dataType="org.khronos.collada.Uint" required="true"
   *        extendedMetaData="kind='attribute' name='count'"
   * @generated
   */
	BigInteger getCount();

	/**
   * Sets the value of the '{@link org.khronos.collada.FloatArrayType#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #getCount()
   * @generated
   */
	void setCount(BigInteger value);

	/**
   * Returns the value of the '<em><b>Digits</b></em>' attribute.
   * The default value is <code>"6"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The digits attribute indicates the number of significant decimal digits of the float values that 
   * 							can be contained in the array. The default value is 6. Optional attribute.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Digits</em>' attribute.
   * @see #isSetDigits()
   * @see #unsetDigits()
   * @see #setDigits(short)
   * @see org.khronos.collada.ColladaPackage#getFloatArrayType_Digits()
   * @model default="6" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
   *        extendedMetaData="kind='attribute' name='digits'"
   * @generated
   */
	short getDigits();

	/**
   * Sets the value of the '{@link org.khronos.collada.FloatArrayType#getDigits <em>Digits</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Digits</em>' attribute.
   * @see #isSetDigits()
   * @see #unsetDigits()
   * @see #getDigits()
   * @generated
   */
	void setDigits(short value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FloatArrayType#getDigits <em>Digits</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetDigits()
   * @see #getDigits()
   * @see #setDigits(short)
   * @generated
   */
	void unsetDigits();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FloatArrayType#getDigits <em>Digits</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Digits</em>' attribute is set.
   * @see #unsetDigits()
   * @see #getDigits()
   * @see #setDigits(short)
   * @generated
   */
	boolean isSetDigits();

	/**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The id attribute is a text string containing the unique identifier of this element. This value 
   * 							must be unique within the instance document. Optional attribute.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.khronos.collada.ColladaPackage#getFloatArrayType_Id()
   * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.khronos.collada.FloatArrayType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
	void setId(String value);

	/**
   * Returns the value of the '<em><b>Magnitude</b></em>' attribute.
   * The default value is <code>"38"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The magnitude attribute indicates the largest exponent of the float values that can be contained 
   * 							in the array. The default value is 38. Optional attribute.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Magnitude</em>' attribute.
   * @see #isSetMagnitude()
   * @see #unsetMagnitude()
   * @see #setMagnitude(short)
   * @see org.khronos.collada.ColladaPackage#getFloatArrayType_Magnitude()
   * @model default="38" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
   *        extendedMetaData="kind='attribute' name='magnitude'"
   * @generated
   */
	short getMagnitude();

	/**
   * Sets the value of the '{@link org.khronos.collada.FloatArrayType#getMagnitude <em>Magnitude</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Magnitude</em>' attribute.
   * @see #isSetMagnitude()
   * @see #unsetMagnitude()
   * @see #getMagnitude()
   * @generated
   */
	void setMagnitude(short value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FloatArrayType#getMagnitude <em>Magnitude</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMagnitude()
   * @see #getMagnitude()
   * @see #setMagnitude(short)
   * @generated
   */
	void unsetMagnitude();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FloatArrayType#getMagnitude <em>Magnitude</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Magnitude</em>' attribute is set.
   * @see #unsetMagnitude()
   * @see #getMagnitude()
   * @see #setMagnitude(short)
   * @generated
   */
	boolean isSetMagnitude();

	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The name attribute is the text string name of this element. Optional attribute.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.khronos.collada.ColladaPackage#getFloatArrayType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.FloatArrayType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // FloatArrayType
