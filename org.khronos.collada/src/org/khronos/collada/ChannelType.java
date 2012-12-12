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
 * A representation of the model object '<em><b>Channel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.ChannelType#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.ChannelType#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getChannelType()
 * @model extendedMetaData="name='channel_._type' kind='empty'"
 * @generated
 */
public interface ChannelType extends EObject {
	/**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The source attribute indicates the location of the sampler using a URL expression. 
   * 					The sampler must be declared within the same document. Required attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see org.khronos.collada.ColladaPackage#getChannelType_Source()
   * @model dataType="org.khronos.collada.URIFragmentType" required="true"
   *        extendedMetaData="kind='attribute' name='source'"
   * @generated
   */
	String getSource();

	/**
   * Sets the value of the '{@link org.khronos.collada.ChannelType#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
	void setSource(String value);

	/**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The target attribute indicates the location of the element bound to the output of the sampler. 
   * 					This text string is a path-name following a simple syntax described in Address Syntax. 
   * 					Required attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see org.khronos.collada.ColladaPackage#getChannelType_Target()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token" required="true"
   *        extendedMetaData="kind='attribute' name='target'"
   * @generated
   */
	String getTarget();

	/**
   * Sets the value of the '{@link org.khronos.collada.ChannelType#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
	void setTarget(String value);

} // ChannelType
