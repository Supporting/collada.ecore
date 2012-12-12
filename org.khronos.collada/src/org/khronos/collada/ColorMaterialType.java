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
 * A representation of the model object '<em><b>Color Material Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.ColorMaterialType#getFace <em>Face</em>}</li>
 *   <li>{@link org.khronos.collada.ColorMaterialType#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getColorMaterialType()
 * @model extendedMetaData="name='color_material_._type' kind='elementOnly'"
 * @generated
 */
public interface ColorMaterialType extends EObject {
	/**
   * Returns the value of the '<em><b>Face</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Face</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Face</em>' containment reference.
   * @see #setFace(FaceType3)
   * @see org.khronos.collada.ColladaPackage#getColorMaterialType_Face()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='face' namespace='##targetNamespace'"
   * @generated
   */
	FaceType3 getFace();

	/**
   * Sets the value of the '{@link org.khronos.collada.ColorMaterialType#getFace <em>Face</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Face</em>' containment reference.
   * @see #getFace()
   * @generated
   */
	void setFace(FaceType3 value);

	/**
   * Returns the value of the '<em><b>Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' containment reference.
   * @see #setMode(ModeType1)
   * @see org.khronos.collada.ColladaPackage#getColorMaterialType_Mode()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
   * @generated
   */
	ModeType1 getMode();

	/**
   * Sets the value of the '{@link org.khronos.collada.ColorMaterialType#getMode <em>Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' containment reference.
   * @see #getMode()
   * @generated
   */
	void setMode(ModeType1 value);

} // ColorMaterialType
