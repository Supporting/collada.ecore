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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex Weights Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.VertexWeightsType#getInput <em>Input</em>}</li>
 *   <li>{@link org.khronos.collada.VertexWeightsType#getVcount <em>Vcount</em>}</li>
 *   <li>{@link org.khronos.collada.VertexWeightsType#getV <em>V</em>}</li>
 *   <li>{@link org.khronos.collada.VertexWeightsType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.VertexWeightsType#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getVertexWeightsType()
 * @model extendedMetaData="name='vertex_weights_._type' kind='elementOnly'"
 * @generated
 */
public interface VertexWeightsType extends EObject {
	/**
   * Returns the value of the '<em><b>Input</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.InputLocalOffset}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The input element must occur at least twice.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Input</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getVertexWeightsType_Input()
   * @model containment="true" lower="2"
   *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
   * @generated
   */
	EList<InputLocalOffset> getInput();

	/**
   * Returns the value of the '<em><b>Vcount</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The vcount element contains a list of integers describing the number of influences for each vertex.
   * 									The vcount element may occur once.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Vcount</em>' attribute.
   * @see #setVcount(List)
   * @see org.khronos.collada.ColladaPackage#getVertexWeightsType_Vcount()
   * @model dataType="org.khronos.collada.ListOfUInts" many="false"
   *        extendedMetaData="kind='element' name='vcount' namespace='##targetNamespace'"
   * @generated
   */
	List<BigInteger> getVcount();

	/**
   * Sets the value of the '{@link org.khronos.collada.VertexWeightsType#getVcount <em>Vcount</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vcount</em>' attribute.
   * @see #getVcount()
   * @generated
   */
	void setVcount(List<BigInteger> value);

	/**
   * Returns the value of the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The v element describes which bones and attributes are associated with each vertex.  An index 
   * 									of –1 into the array of joints refers to the bind shape.  Weights should be normalized before use.
   * 									The v element must occur zero or one times.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>V</em>' attribute.
   * @see #setV(List)
   * @see org.khronos.collada.ColladaPackage#getVertexWeightsType_V()
   * @model dataType="org.khronos.collada.ListOfInts" many="false"
   *        extendedMetaData="kind='element' name='v' namespace='##targetNamespace'"
   * @generated
   */
	List<Long> getV();

	/**
   * Sets the value of the '{@link org.khronos.collada.VertexWeightsType#getV <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' attribute.
   * @see #getV()
   * @generated
   */
	void setV(List<Long> value);

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ExtraType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The extra element may appear any number of times.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getVertexWeightsType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 								The count attribute describes the number of vertices in the base mesh. Required element. 
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Count</em>' attribute.
   * @see #setCount(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getVertexWeightsType_Count()
   * @model dataType="org.khronos.collada.Uint" required="true"
   *        extendedMetaData="kind='attribute' name='count'"
   * @generated
   */
	BigInteger getCount();

	/**
   * Sets the value of the '{@link org.khronos.collada.VertexWeightsType#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #getCount()
   * @generated
   */
	void setCount(BigInteger value);

} // VertexWeightsType
