/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bind Vertex Input Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.BindVertexInputType#getInputSemantic <em>Input Semantic</em>}</li>
 *   <li>{@link org.khronos.collada.BindVertexInputType#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.khronos.collada.BindVertexInputType#getSemantic <em>Semantic</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getBindVertexInputType()
 * @model extendedMetaData="name='bind_vertex_input_._type' kind='empty'"
 * @generated
 */
public interface BindVertexInputType extends EObject {
	/**
   * Returns the value of the '<em><b>Input Semantic</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 								The input_semantic attribute specifies which input semantic to bind.
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Input Semantic</em>' attribute.
   * @see #setInputSemantic(String)
   * @see org.khronos.collada.ColladaPackage#getBindVertexInputType_InputSemantic()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='input_semantic'"
   * @generated
   */
	String getInputSemantic();

	/**
   * Sets the value of the '{@link org.khronos.collada.BindVertexInputType#getInputSemantic <em>Input Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Semantic</em>' attribute.
   * @see #getInputSemantic()
   * @generated
   */
	void setInputSemantic(String value);

	/**
   * Returns the value of the '<em><b>Input Set</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 								The input_set attribute specifies which input set to bind. 
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Input Set</em>' attribute.
   * @see #setInputSet(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getBindVertexInputType_InputSet()
   * @model dataType="org.khronos.collada.Uint"
   *        extendedMetaData="kind='attribute' name='input_set'"
   * @generated
   */
	BigInteger getInputSet();

	/**
   * Sets the value of the '{@link org.khronos.collada.BindVertexInputType#getInputSet <em>Input Set</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Set</em>' attribute.
   * @see #getInputSet()
   * @generated
   */
	void setInputSet(BigInteger value);

	/**
   * Returns the value of the '<em><b>Semantic</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 								The semantic attribute specifies which effect parameter to bind.
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Semantic</em>' attribute.
   * @see #setSemantic(String)
   * @see org.khronos.collada.ColladaPackage#getBindVertexInputType_Semantic()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='semantic'"
   * @generated
   */
	String getSemantic();

	/**
   * Sets the value of the '{@link org.khronos.collada.BindVertexInputType#getSemantic <em>Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semantic</em>' attribute.
   * @see #getSemantic()
   * @generated
   */
	void setSemantic(String value);

} // BindVertexInputType
