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
 * A representation of the model object '<em><b>Stencil Mask Separate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.StencilMaskSeparateType#getFace <em>Face</em>}</li>
 *   <li>{@link org.khronos.collada.StencilMaskSeparateType#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getStencilMaskSeparateType()
 * @model extendedMetaData="name='stencil_mask_separate_._type' kind='elementOnly'"
 * @generated
 */
public interface StencilMaskSeparateType extends EObject {
	/**
   * Returns the value of the '<em><b>Face</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Face</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Face</em>' containment reference.
   * @see #setFace(FaceType2)
   * @see org.khronos.collada.ColladaPackage#getStencilMaskSeparateType_Face()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='face' namespace='##targetNamespace'"
   * @generated
   */
	FaceType2 getFace();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilMaskSeparateType#getFace <em>Face</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Face</em>' containment reference.
   * @see #getFace()
   * @generated
   */
	void setFace(FaceType2 value);

	/**
   * Returns the value of the '<em><b>Mask</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mask</em>' containment reference.
   * @see #setMask(MaskType)
   * @see org.khronos.collada.ColladaPackage#getStencilMaskSeparateType_Mask()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='mask' namespace='##targetNamespace'"
   * @generated
   */
	MaskType getMask();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilMaskSeparateType#getMask <em>Mask</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mask</em>' containment reference.
   * @see #getMask()
   * @generated
   */
	void setMask(MaskType value);

} // StencilMaskSeparateType
