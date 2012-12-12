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
 * A representation of the model object '<em><b>Stencil Func Separate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.StencilFuncSeparateType#getFront <em>Front</em>}</li>
 *   <li>{@link org.khronos.collada.StencilFuncSeparateType#getBack <em>Back</em>}</li>
 *   <li>{@link org.khronos.collada.StencilFuncSeparateType#getRef <em>Ref</em>}</li>
 *   <li>{@link org.khronos.collada.StencilFuncSeparateType#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getStencilFuncSeparateType()
 * @model extendedMetaData="name='stencil_func_separate_._type' kind='elementOnly'"
 * @generated
 */
public interface StencilFuncSeparateType extends EObject {
	/**
   * Returns the value of the '<em><b>Front</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Front</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Front</em>' containment reference.
   * @see #setFront(FrontType)
   * @see org.khronos.collada.ColladaPackage#getStencilFuncSeparateType_Front()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='front' namespace='##targetNamespace'"
   * @generated
   */
	FrontType getFront();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilFuncSeparateType#getFront <em>Front</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Front</em>' containment reference.
   * @see #getFront()
   * @generated
   */
	void setFront(FrontType value);

	/**
   * Returns the value of the '<em><b>Back</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Back</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Back</em>' containment reference.
   * @see #setBack(BackType)
   * @see org.khronos.collada.ColladaPackage#getStencilFuncSeparateType_Back()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='back' namespace='##targetNamespace'"
   * @generated
   */
	BackType getBack();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilFuncSeparateType#getBack <em>Back</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Back</em>' containment reference.
   * @see #getBack()
   * @generated
   */
	void setBack(BackType value);

	/**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(RefType)
   * @see org.khronos.collada.ColladaPackage#getStencilFuncSeparateType_Ref()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
   * @generated
   */
	RefType getRef();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilFuncSeparateType#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
	void setRef(RefType value);

	/**
   * Returns the value of the '<em><b>Mask</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mask</em>' containment reference.
   * @see #setMask(MaskType2)
   * @see org.khronos.collada.ColladaPackage#getStencilFuncSeparateType_Mask()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='mask' namespace='##targetNamespace'"
   * @generated
   */
	MaskType2 getMask();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilFuncSeparateType#getMask <em>Mask</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mask</em>' containment reference.
   * @see #getMask()
   * @generated
   */
	void setMask(MaskType2 value);

} // StencilFuncSeparateType
