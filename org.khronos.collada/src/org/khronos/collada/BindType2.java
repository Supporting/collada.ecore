/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bind Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.BindType2#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link org.khronos.collada.BindType2#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getBindType2()
 * @model extendedMetaData="name='bind_._2_._type' kind='empty'"
 * @generated
 */
public interface BindType2 extends EObject {
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
   * @see org.khronos.collada.ColladaPackage#getBindType2_Semantic()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='semantic'"
   * @generated
   */
	String getSemantic();

	/**
   * Sets the value of the '{@link org.khronos.collada.BindType2#getSemantic <em>Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semantic</em>' attribute.
   * @see #getSemantic()
   * @generated
   */
	void setSemantic(String value);

	/**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 								The target attribute specifies the location of the value to bind to the specified semantic. 
   * 								This text string is a path-name following a simple syntax described in the “Addressing Syntax” 
   * 								section.
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see org.khronos.collada.ColladaPackage#getBindType2_Target()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token" required="true"
   *        extendedMetaData="kind='attribute' name='target'"
   * @generated
   */
	String getTarget();

	/**
   * Sets the value of the '{@link org.khronos.collada.BindType2#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
	void setTarget(String value);

} // BindType2
