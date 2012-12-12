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
 * A representation of the model object '<em><b>Common Color Or Texture Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.CommonColorOrTextureType#getColor <em>Color</em>}</li>
 *   <li>{@link org.khronos.collada.CommonColorOrTextureType#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.CommonColorOrTextureType#getTexture <em>Texture</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getCommonColorOrTextureType()
 * @model extendedMetaData="name='common_color_or_texture_type' kind='elementOnly'"
 * @generated
 */
public interface CommonColorOrTextureType extends EObject {
	/**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(ColorType)
   * @see org.khronos.collada.ColladaPackage#getCommonColorOrTextureType_Color()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
   * @generated
   */
	ColorType getColor();

	/**
   * Sets the value of the '{@link org.khronos.collada.CommonColorOrTextureType#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
	void setColor(ColorType value);

	/**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(ParamType)
   * @see org.khronos.collada.ColladaPackage#getCommonColorOrTextureType_Param()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
   * @generated
   */
	ParamType getParam();

	/**
   * Sets the value of the '{@link org.khronos.collada.CommonColorOrTextureType#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
   * @see #getParam()
   * @generated
   */
	void setParam(ParamType value);

	/**
   * Returns the value of the '<em><b>Texture</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture</em>' containment reference.
   * @see #setTexture(TextureType)
   * @see org.khronos.collada.ColladaPackage#getCommonColorOrTextureType_Texture()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='texture' namespace='##targetNamespace'"
   * @generated
   */
	TextureType getTexture();

	/**
   * Sets the value of the '{@link org.khronos.collada.CommonColorOrTextureType#getTexture <em>Texture</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texture</em>' containment reference.
   * @see #getTexture()
   * @generated
   */
	void setTexture(TextureType value);

} // CommonColorOrTextureType
