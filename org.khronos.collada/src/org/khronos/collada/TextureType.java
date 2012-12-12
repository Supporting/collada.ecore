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
 * A representation of the model object '<em><b>Texture Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TextureType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.TextureType#getTexcoord <em>Texcoord</em>}</li>
 *   <li>{@link org.khronos.collada.TextureType#getTexture <em>Texture</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTextureType()
 * @model extendedMetaData="name='texture_._type' kind='elementOnly'"
 * @generated
 */
public interface TextureType extends EObject {
	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The extra element declares additional information regarding its parent element.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference.
   * @see #setExtra(ExtraType)
   * @see org.khronos.collada.ColladaPackage#getTextureType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	ExtraType getExtra();

	/**
   * Sets the value of the '{@link org.khronos.collada.TextureType#getExtra <em>Extra</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extra</em>' containment reference.
   * @see #getExtra()
   * @generated
   */
	void setExtra(ExtraType value);

	/**
   * Returns the value of the '<em><b>Texcoord</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texcoord</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texcoord</em>' attribute.
   * @see #setTexcoord(String)
   * @see org.khronos.collada.ColladaPackage#getTextureType_Texcoord()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='texcoord'"
   * @generated
   */
	String getTexcoord();

	/**
   * Sets the value of the '{@link org.khronos.collada.TextureType#getTexcoord <em>Texcoord</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texcoord</em>' attribute.
   * @see #getTexcoord()
   * @generated
   */
	void setTexcoord(String value);

	/**
   * Returns the value of the '<em><b>Texture</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture</em>' attribute.
   * @see #setTexture(String)
   * @see org.khronos.collada.ColladaPackage#getTextureType_Texture()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='texture'"
   * @generated
   */
	String getTexture();

	/**
   * Sets the value of the '{@link org.khronos.collada.TextureType#getTexture <em>Texture</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texture</em>' attribute.
   * @see #getTexture()
   * @generated
   */
	void setTexture(String value);

} // TextureType
