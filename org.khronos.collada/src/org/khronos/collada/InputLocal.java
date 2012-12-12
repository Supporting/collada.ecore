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
 * A representation of the model object '<em><b>Input Local</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			The InputLocal type is used to represent inputs that can only reference resources declared in the same document.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.InputLocal#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link org.khronos.collada.InputLocal#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getInputLocal()
 * @model extendedMetaData="name='InputLocal' kind='empty'"
 * @generated
 */
public interface InputLocal extends EObject {
	/**
   * Returns the value of the '<em><b>Semantic</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 				The semantic attribute is the user-defined meaning of the input connection. Required attribute.
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Semantic</em>' attribute.
   * @see #setSemantic(String)
   * @see org.khronos.collada.ColladaPackage#getInputLocal_Semantic()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
   *        extendedMetaData="kind='attribute' name='semantic'"
   * @generated
   */
	String getSemantic();

	/**
   * Sets the value of the '{@link org.khronos.collada.InputLocal#getSemantic <em>Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semantic</em>' attribute.
   * @see #getSemantic()
   * @generated
   */
	void setSemantic(String value);

	/**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 				The source attribute indicates the location of the data source. Required attribute.
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see org.khronos.collada.ColladaPackage#getInputLocal_Source()
   * @model dataType="org.khronos.collada.URIFragmentType" required="true"
   *        extendedMetaData="kind='attribute' name='source'"
   * @generated
   */
	String getSource();

	/**
   * Sets the value of the '{@link org.khronos.collada.InputLocal#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
	void setSource(String value);

} // InputLocal
