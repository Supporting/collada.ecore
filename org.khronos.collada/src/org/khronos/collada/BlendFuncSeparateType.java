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
 * A representation of the model object '<em><b>Blend Func Separate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.BlendFuncSeparateType#getSrcRgb <em>Src Rgb</em>}</li>
 *   <li>{@link org.khronos.collada.BlendFuncSeparateType#getDestRgb <em>Dest Rgb</em>}</li>
 *   <li>{@link org.khronos.collada.BlendFuncSeparateType#getSrcAlpha <em>Src Alpha</em>}</li>
 *   <li>{@link org.khronos.collada.BlendFuncSeparateType#getDestAlpha <em>Dest Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getBlendFuncSeparateType()
 * @model extendedMetaData="name='blend_func_separate_._type' kind='elementOnly'"
 * @generated
 */
public interface BlendFuncSeparateType extends EObject {
	/**
   * Returns the value of the '<em><b>Src Rgb</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Rgb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Src Rgb</em>' containment reference.
   * @see #setSrcRgb(SrcRgbType)
   * @see org.khronos.collada.ColladaPackage#getBlendFuncSeparateType_SrcRgb()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='src_rgb' namespace='##targetNamespace'"
   * @generated
   */
	SrcRgbType getSrcRgb();

	/**
   * Sets the value of the '{@link org.khronos.collada.BlendFuncSeparateType#getSrcRgb <em>Src Rgb</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src Rgb</em>' containment reference.
   * @see #getSrcRgb()
   * @generated
   */
	void setSrcRgb(SrcRgbType value);

	/**
   * Returns the value of the '<em><b>Dest Rgb</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Rgb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Dest Rgb</em>' containment reference.
   * @see #setDestRgb(DestRgbType)
   * @see org.khronos.collada.ColladaPackage#getBlendFuncSeparateType_DestRgb()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='dest_rgb' namespace='##targetNamespace'"
   * @generated
   */
	DestRgbType getDestRgb();

	/**
   * Sets the value of the '{@link org.khronos.collada.BlendFuncSeparateType#getDestRgb <em>Dest Rgb</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest Rgb</em>' containment reference.
   * @see #getDestRgb()
   * @generated
   */
	void setDestRgb(DestRgbType value);

	/**
   * Returns the value of the '<em><b>Src Alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Alpha</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Src Alpha</em>' containment reference.
   * @see #setSrcAlpha(SrcAlphaType)
   * @see org.khronos.collada.ColladaPackage#getBlendFuncSeparateType_SrcAlpha()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='src_alpha' namespace='##targetNamespace'"
   * @generated
   */
	SrcAlphaType getSrcAlpha();

	/**
   * Sets the value of the '{@link org.khronos.collada.BlendFuncSeparateType#getSrcAlpha <em>Src Alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src Alpha</em>' containment reference.
   * @see #getSrcAlpha()
   * @generated
   */
	void setSrcAlpha(SrcAlphaType value);

	/**
   * Returns the value of the '<em><b>Dest Alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Alpha</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Dest Alpha</em>' containment reference.
   * @see #setDestAlpha(DestAlphaType)
   * @see org.khronos.collada.ColladaPackage#getBlendFuncSeparateType_DestAlpha()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='dest_alpha' namespace='##targetNamespace'"
   * @generated
   */
	DestAlphaType getDestAlpha();

	/**
   * Sets the value of the '{@link org.khronos.collada.BlendFuncSeparateType#getDestAlpha <em>Dest Alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest Alpha</em>' containment reference.
   * @see #getDestAlpha()
   * @generated
   */
	void setDestAlpha(DestAlphaType value);

} // BlendFuncSeparateType
