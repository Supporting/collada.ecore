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
 * A representation of the model object '<em><b>Blend Equation Separate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.BlendEquationSeparateType#getRgb <em>Rgb</em>}</li>
 *   <li>{@link org.khronos.collada.BlendEquationSeparateType#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getBlendEquationSeparateType()
 * @model extendedMetaData="name='blend_equation_separate_._type' kind='elementOnly'"
 * @generated
 */
public interface BlendEquationSeparateType extends EObject {
	/**
   * Returns the value of the '<em><b>Rgb</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rgb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Rgb</em>' containment reference.
   * @see #setRgb(RgbType)
   * @see org.khronos.collada.ColladaPackage#getBlendEquationSeparateType_Rgb()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='rgb' namespace='##targetNamespace'"
   * @generated
   */
	RgbType getRgb();

	/**
   * Sets the value of the '{@link org.khronos.collada.BlendEquationSeparateType#getRgb <em>Rgb</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rgb</em>' containment reference.
   * @see #getRgb()
   * @generated
   */
	void setRgb(RgbType value);

	/**
   * Returns the value of the '<em><b>Alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Alpha</em>' containment reference.
   * @see #setAlpha(AlphaType)
   * @see org.khronos.collada.ColladaPackage#getBlendEquationSeparateType_Alpha()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='alpha' namespace='##targetNamespace'"
   * @generated
   */
	AlphaType getAlpha();

	/**
   * Sets the value of the '{@link org.khronos.collada.BlendEquationSeparateType#getAlpha <em>Alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alpha</em>' containment reference.
   * @see #getAlpha()
   * @generated
   */
	void setAlpha(AlphaType value);

} // BlendEquationSeparateType
