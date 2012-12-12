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
 * A representation of the model object '<em><b>Input Local Offset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			The InputLocalOffset type is used to represent indexed inputs that can only reference resources declared in the same document.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.InputLocalOffset#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.khronos.collada.InputLocalOffset#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link org.khronos.collada.InputLocalOffset#getSet <em>Set</em>}</li>
 *   <li>{@link org.khronos.collada.InputLocalOffset#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getInputLocalOffset()
 * @model extendedMetaData="name='InputLocalOffset' kind='empty'"
 * @generated
 */
public interface InputLocalOffset extends EObject {
	/**
   * Returns the value of the '<em><b>Offset</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 				The offset attribute represents the offset into the list of indices.  If two input elements share 
   * 				the same offset, they will be indexed the same.  This works as a simple form of compression for the 
   * 				list of indices as well as defining the order the inputs should be used in.  Required attribute.
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Offset</em>' attribute.
   * @see #setOffset(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getInputLocalOffset_Offset()
   * @model dataType="org.khronos.collada.Uint" required="true"
   *        extendedMetaData="kind='attribute' name='offset'"
   * @generated
   */
	BigInteger getOffset();

	/**
   * Sets the value of the '{@link org.khronos.collada.InputLocalOffset#getOffset <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Offset</em>' attribute.
   * @see #getOffset()
   * @generated
   */
	void setOffset(BigInteger value);

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
   * @see org.khronos.collada.ColladaPackage#getInputLocalOffset_Semantic()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
   *        extendedMetaData="kind='attribute' name='semantic'"
   * @generated
   */
	String getSemantic();

	/**
   * Sets the value of the '{@link org.khronos.collada.InputLocalOffset#getSemantic <em>Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semantic</em>' attribute.
   * @see #getSemantic()
   * @generated
   */
	void setSemantic(String value);

	/**
   * Returns the value of the '<em><b>Set</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 				The set attribute indicates which inputs should be grouped together as a single set. This is helpful 
   * 				when multiple inputs share the same semantics. 
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Set</em>' attribute.
   * @see #setSet(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getInputLocalOffset_Set()
   * @model dataType="org.khronos.collada.Uint"
   *        extendedMetaData="kind='attribute' name='set'"
   * @generated
   */
	BigInteger getSet();

	/**
   * Sets the value of the '{@link org.khronos.collada.InputLocalOffset#getSet <em>Set</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' attribute.
   * @see #getSet()
   * @generated
   */
	void setSet(BigInteger value);

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
   * @see org.khronos.collada.ColladaPackage#getInputLocalOffset_Source()
   * @model dataType="org.khronos.collada.URIFragmentType" required="true"
   *        extendedMetaData="kind='attribute' name='source'"
   * @generated
   */
	String getSource();

	/**
   * Sets the value of the '{@link org.khronos.collada.InputLocalOffset#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
	void setSource(String value);

} // InputLocalOffset
