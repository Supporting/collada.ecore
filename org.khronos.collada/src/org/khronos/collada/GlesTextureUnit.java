/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gles Texture Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.GlesTextureUnit#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTextureUnit#getSamplerState <em>Sampler State</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTextureUnit#getTexcoord <em>Texcoord</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTextureUnit#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTextureUnit#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getGlesTextureUnit()
 * @model extendedMetaData="name='gles_texture_unit' kind='elementOnly'"
 * @generated
 */
public interface GlesTextureUnit extends EObject {
	/**
   * Returns the value of the '<em><b>Surface</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Surface</em>' attribute.
   * @see #setSurface(String)
   * @see org.khronos.collada.ColladaPackage#getGlesTextureUnit_Surface()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='element' name='surface' namespace='##targetNamespace'"
   * @generated
   */
	String getSurface();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTextureUnit#getSurface <em>Surface</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Surface</em>' attribute.
   * @see #getSurface()
   * @generated
   */
	void setSurface(String value);

	/**
   * Returns the value of the '<em><b>Sampler State</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler State</em>' attribute.
   * @see #setSamplerState(String)
   * @see org.khronos.collada.ColladaPackage#getGlesTextureUnit_SamplerState()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='element' name='sampler_state' namespace='##targetNamespace'"
   * @generated
   */
	String getSamplerState();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTextureUnit#getSamplerState <em>Sampler State</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler State</em>' attribute.
   * @see #getSamplerState()
   * @generated
   */
	void setSamplerState(String value);

	/**
   * Returns the value of the '<em><b>Texcoord</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texcoord</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texcoord</em>' containment reference.
   * @see #setTexcoord(TexcoordType)
   * @see org.khronos.collada.ColladaPackage#getGlesTextureUnit_Texcoord()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='texcoord' namespace='##targetNamespace'"
   * @generated
   */
	TexcoordType getTexcoord();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTextureUnit#getTexcoord <em>Texcoord</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texcoord</em>' containment reference.
   * @see #getTexcoord()
   * @generated
   */
	void setTexcoord(TexcoordType value);

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ExtraType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The extra element declares additional information regarding its parent element.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGlesTextureUnit_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 				The sid attribute is a text string value containing the sub-identifier of this element. 
   * 				This value must be unique within the scope of the parent element. Optional attribute.
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sid</em>' attribute.
   * @see #setSid(String)
   * @see org.khronos.collada.ColladaPackage#getGlesTextureUnit_Sid()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTextureUnit#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

} // GlesTextureUnit
