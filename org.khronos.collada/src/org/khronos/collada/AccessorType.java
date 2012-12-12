/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accessor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.AccessorType#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.AccessorType#getCount <em>Count</em>}</li>
 *   <li>{@link org.khronos.collada.AccessorType#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.khronos.collada.AccessorType#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.AccessorType#getStride <em>Stride</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getAccessorType()
 * @model extendedMetaData="name='accessor_._type' kind='elementOnly'"
 * @generated
 */
public interface AccessorType extends EObject {
	/**
   * Returns the value of the '<em><b>Param</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ParamType4}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The accessor element may have any number of param elements.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Param</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getAccessorType_Param()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
   * @generated
   */
	EList<ParamType4> getParam();

	/**
   * Returns the value of the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The count attribute indicates the number of times the array is accessed. Required attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Count</em>' attribute.
   * @see #setCount(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getAccessorType_Count()
   * @model dataType="org.khronos.collada.Uint" required="true"
   *        extendedMetaData="kind='attribute' name='count'"
   * @generated
   */
	BigInteger getCount();

	/**
   * Sets the value of the '{@link org.khronos.collada.AccessorType#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #getCount()
   * @generated
   */
	void setCount(BigInteger value);

	/**
   * Returns the value of the '<em><b>Offset</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The offset attribute indicates the index of the first value to be read from the array. 
   * 					The default value is 0. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Offset</em>' attribute.
   * @see #isSetOffset()
   * @see #unsetOffset()
   * @see #setOffset(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getAccessorType_Offset()
   * @model default="0" unsettable="true" dataType="org.khronos.collada.Uint"
   *        extendedMetaData="kind='attribute' name='offset'"
   * @generated
   */
	BigInteger getOffset();

	/**
   * Sets the value of the '{@link org.khronos.collada.AccessorType#getOffset <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Offset</em>' attribute.
   * @see #isSetOffset()
   * @see #unsetOffset()
   * @see #getOffset()
   * @generated
   */
	void setOffset(BigInteger value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.AccessorType#getOffset <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetOffset()
   * @see #getOffset()
   * @see #setOffset(BigInteger)
   * @generated
   */
	void unsetOffset();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.AccessorType#getOffset <em>Offset</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Offset</em>' attribute is set.
   * @see #unsetOffset()
   * @see #getOffset()
   * @see #setOffset(BigInteger)
   * @generated
   */
	boolean isSetOffset();

	/**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The source attribute indicates the location of the array to access using a URL expression. Required attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see org.khronos.collada.ColladaPackage#getAccessorType_Source()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
   *        extendedMetaData="kind='attribute' name='source'"
   * @generated
   */
	String getSource();

	/**
   * Sets the value of the '{@link org.khronos.collada.AccessorType#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
	void setSource(String value);

	/**
   * Returns the value of the '<em><b>Stride</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The stride attribute indicates number of values to be considered a unit during each access to 
   * 					the array. The default value is 1, indicating that a single value is accessed. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Stride</em>' attribute.
   * @see #isSetStride()
   * @see #unsetStride()
   * @see #setStride(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getAccessorType_Stride()
   * @model default="1" unsettable="true" dataType="org.khronos.collada.Uint"
   *        extendedMetaData="kind='attribute' name='stride'"
   * @generated
   */
	BigInteger getStride();

	/**
   * Sets the value of the '{@link org.khronos.collada.AccessorType#getStride <em>Stride</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stride</em>' attribute.
   * @see #isSetStride()
   * @see #unsetStride()
   * @see #getStride()
   * @generated
   */
	void setStride(BigInteger value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.AccessorType#getStride <em>Stride</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetStride()
   * @see #getStride()
   * @see #setStride(BigInteger)
   * @generated
   */
	void unsetStride();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.AccessorType#getStride <em>Stride</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Stride</em>' attribute is set.
   * @see #unsetStride()
   * @see #getStride()
   * @see #setStride(BigInteger)
   * @generated
   */
	boolean isSetStride();

} // AccessorType
