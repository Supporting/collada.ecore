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
 * A representation of the model object '<em><b>Gles Texcombiner Command Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.GlesTexcombinerCommandType#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTexcombinerCommandType#getRGB <em>RGB</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTexcombinerCommandType#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerCommandType()
 * @model extendedMetaData="name='gles_texcombiner_command_type' kind='elementOnly'"
 * @generated
 */
public interface GlesTexcombinerCommandType extends EObject {
	/**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference.
   * @see #setConstant(GlesTextureConstantType)
   * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerCommandType_Constant()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='constant' namespace='##targetNamespace'"
   * @generated
   */
	GlesTextureConstantType getConstant();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTexcombinerCommandType#getConstant <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' containment reference.
   * @see #getConstant()
   * @generated
   */
	void setConstant(GlesTextureConstantType value);

	/**
   * Returns the value of the '<em><b>RGB</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RGB</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>RGB</em>' containment reference.
   * @see #setRGB(GlesTexcombinerCommandRGBType)
   * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerCommandType_RGB()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='RGB' namespace='##targetNamespace'"
   * @generated
   */
	GlesTexcombinerCommandRGBType getRGB();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTexcombinerCommandType#getRGB <em>RGB</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>RGB</em>' containment reference.
   * @see #getRGB()
   * @generated
   */
	void setRGB(GlesTexcombinerCommandRGBType value);

	/**
   * Returns the value of the '<em><b>Alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Alpha</em>' containment reference.
   * @see #setAlpha(GlesTexcombinerCommandAlphaType)
   * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerCommandType_Alpha()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='alpha' namespace='##targetNamespace'"
   * @generated
   */
	GlesTexcombinerCommandAlphaType getAlpha();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTexcombinerCommandType#getAlpha <em>Alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alpha</em>' containment reference.
   * @see #getAlpha()
   * @generated
   */
	void setAlpha(GlesTexcombinerCommandAlphaType value);

} // GlesTexcombinerCommandType
