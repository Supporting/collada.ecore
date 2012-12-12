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
 * A representation of the model object '<em><b>Int Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.IntArrayType#getValue <em>Value</em>}</li>
 *   <li>{@link org.khronos.collada.IntArrayType#getCount <em>Count</em>}</li>
 *   <li>{@link org.khronos.collada.IntArrayType#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.IntArrayType#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link org.khronos.collada.IntArrayType#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link org.khronos.collada.IntArrayType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getIntArrayType()
 * @model extendedMetaData="name='int_array_._type' kind='simple'"
 * @generated
 */
public interface IntArrayType extends EObject {
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
   * @see org.khronos.collada.ColladaPackage#getIntArrayType_Value()
   * @model dataType="org.khronos.collada.ListOfInts" many="false"
   *        extendedMetaData="name=':0' kind='simple'"
   * @generated
   */
	List<Long> getValue();

	/**
   * Sets the value of the '{@link org.khronos.collada.IntArrayType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
	void setValue(List<Long> value);

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
   * @see org.khronos.collada.ColladaPackage#getIntArrayType_Count()
   * @model dataType="org.khronos.collada.Uint" required="true"
   *        extendedMetaData="kind='attribute' name='count'"
   * @generated
   */
	BigInteger getCount();

	/**
   * Sets the value of the '{@link org.khronos.collada.IntArrayType#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #getCount()
   * @generated
   */
	void setCount(BigInteger value);

	/**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The id attribute is a text string containing the unique identifier of this element. 
   * 							This value must be unique within the instance document. Optional attribute.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.khronos.collada.ColladaPackage#getIntArrayType_Id()
   * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.khronos.collada.IntArrayType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
	void setId(String value);

	/**
   * Returns the value of the '<em><b>Max Inclusive</b></em>' attribute.
   * The default value is <code>"2147483647"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The maxInclusive attribute indicates the largest integer value that can be contained in 
   * 							the array. The default value is 2147483647. Optional attribute.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Max Inclusive</em>' attribute.
   * @see #isSetMaxInclusive()
   * @see #unsetMaxInclusive()
   * @see #setMaxInclusive(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getIntArrayType_MaxInclusive()
   * @model default="2147483647" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='maxInclusive'"
   * @generated
   */
	BigInteger getMaxInclusive();

	/**
   * Sets the value of the '{@link org.khronos.collada.IntArrayType#getMaxInclusive <em>Max Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Inclusive</em>' attribute.
   * @see #isSetMaxInclusive()
   * @see #unsetMaxInclusive()
   * @see #getMaxInclusive()
   * @generated
   */
	void setMaxInclusive(BigInteger value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.IntArrayType#getMaxInclusive <em>Max Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMaxInclusive()
   * @see #getMaxInclusive()
   * @see #setMaxInclusive(BigInteger)
   * @generated
   */
	void unsetMaxInclusive();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.IntArrayType#getMaxInclusive <em>Max Inclusive</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Max Inclusive</em>' attribute is set.
   * @see #unsetMaxInclusive()
   * @see #getMaxInclusive()
   * @see #setMaxInclusive(BigInteger)
   * @generated
   */
	boolean isSetMaxInclusive();

	/**
   * Returns the value of the '<em><b>Min Inclusive</b></em>' attribute.
   * The default value is <code>"-2147483648"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The minInclusive attribute indicates the smallest integer value that can be contained in 
   * 							the array. The default value is –2147483648. Optional attribute.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Min Inclusive</em>' attribute.
   * @see #isSetMinInclusive()
   * @see #unsetMinInclusive()
   * @see #setMinInclusive(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getIntArrayType_MinInclusive()
   * @model default="-2147483648" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='minInclusive'"
   * @generated
   */
	BigInteger getMinInclusive();

	/**
   * Sets the value of the '{@link org.khronos.collada.IntArrayType#getMinInclusive <em>Min Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Inclusive</em>' attribute.
   * @see #isSetMinInclusive()
   * @see #unsetMinInclusive()
   * @see #getMinInclusive()
   * @generated
   */
	void setMinInclusive(BigInteger value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.IntArrayType#getMinInclusive <em>Min Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMinInclusive()
   * @see #getMinInclusive()
   * @see #setMinInclusive(BigInteger)
   * @generated
   */
	void unsetMinInclusive();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.IntArrayType#getMinInclusive <em>Min Inclusive</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Min Inclusive</em>' attribute is set.
   * @see #unsetMinInclusive()
   * @see #getMinInclusive()
   * @see #setMinInclusive(BigInteger)
   * @generated
   */
	boolean isSetMinInclusive();

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
   * @see org.khronos.collada.ColladaPackage#getIntArrayType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.IntArrayType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // IntArrayType
