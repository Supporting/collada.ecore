/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Transparent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.CommonTransparentType#getOpaque <em>Opaque</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getCommonTransparentType()
 * @model extendedMetaData="name='common_transparent_type' kind='elementOnly'"
 * @generated
 */
public interface CommonTransparentType extends CommonColorOrTextureType {
	/**
   * Returns the value of the '<em><b>Opaque</b></em>' attribute.
   * The default value is <code>"A_ONE"</code>.
   * The literals are from the enumeration {@link org.khronos.collada.FxOpaqueEnum}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opaque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Opaque</em>' attribute.
   * @see org.khronos.collada.FxOpaqueEnum
   * @see #isSetOpaque()
   * @see #unsetOpaque()
   * @see #setOpaque(FxOpaqueEnum)
   * @see org.khronos.collada.ColladaPackage#getCommonTransparentType_Opaque()
   * @model default="A_ONE" unsettable="true"
   *        extendedMetaData="kind='attribute' name='opaque'"
   * @generated
   */
	FxOpaqueEnum getOpaque();

	/**
   * Sets the value of the '{@link org.khronos.collada.CommonTransparentType#getOpaque <em>Opaque</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opaque</em>' attribute.
   * @see org.khronos.collada.FxOpaqueEnum
   * @see #isSetOpaque()
   * @see #unsetOpaque()
   * @see #getOpaque()
   * @generated
   */
	void setOpaque(FxOpaqueEnum value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.CommonTransparentType#getOpaque <em>Opaque</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetOpaque()
   * @see #getOpaque()
   * @see #setOpaque(FxOpaqueEnum)
   * @generated
   */
	void unsetOpaque();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.CommonTransparentType#getOpaque <em>Opaque</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Opaque</em>' attribute is set.
   * @see #unsetOpaque()
   * @see #getOpaque()
   * @see #setOpaque(FxOpaqueEnum)
   * @generated
   */
	boolean isSetOpaque();

} // CommonTransparentType
