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
 * A representation of the model object '<em><b>Stencil Func Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.StencilFuncType1#getFunc <em>Func</em>}</li>
 *   <li>{@link org.khronos.collada.StencilFuncType1#getRef <em>Ref</em>}</li>
 *   <li>{@link org.khronos.collada.StencilFuncType1#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getStencilFuncType1()
 * @model extendedMetaData="name='stencil_func_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface StencilFuncType1 extends EObject {
	/**
   * Returns the value of the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Func</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' containment reference.
   * @see #setFunc(FuncType2)
   * @see org.khronos.collada.ColladaPackage#getStencilFuncType1_Func()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='func' namespace='##targetNamespace'"
   * @generated
   */
	FuncType2 getFunc();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilFuncType1#getFunc <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' containment reference.
   * @see #getFunc()
   * @generated
   */
	void setFunc(FuncType2 value);

	/**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(RefType2)
   * @see org.khronos.collada.ColladaPackage#getStencilFuncType1_Ref()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
   * @generated
   */
	RefType2 getRef();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilFuncType1#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
	void setRef(RefType2 value);

	/**
   * Returns the value of the '<em><b>Mask</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mask</em>' containment reference.
   * @see #setMask(MaskType3)
   * @see org.khronos.collada.ColladaPackage#getStencilFuncType1_Mask()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='mask' namespace='##targetNamespace'"
   * @generated
   */
	MaskType3 getMask();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilFuncType1#getMask <em>Mask</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mask</em>' containment reference.
   * @see #getMask()
   * @generated
   */
	void setMask(MaskType3 value);

} // StencilFuncType1
