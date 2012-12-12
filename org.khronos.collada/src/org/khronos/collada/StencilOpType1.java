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
 * A representation of the model object '<em><b>Stencil Op Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.StencilOpType1#getFail <em>Fail</em>}</li>
 *   <li>{@link org.khronos.collada.StencilOpType1#getZfail <em>Zfail</em>}</li>
 *   <li>{@link org.khronos.collada.StencilOpType1#getZpass <em>Zpass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getStencilOpType1()
 * @model extendedMetaData="name='stencil_op_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface StencilOpType1 extends EObject {
	/**
   * Returns the value of the '<em><b>Fail</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fail</em>' containment reference.
   * @see #setFail(FailType2)
   * @see org.khronos.collada.ColladaPackage#getStencilOpType1_Fail()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='fail' namespace='##targetNamespace'"
   * @generated
   */
	FailType2 getFail();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilOpType1#getFail <em>Fail</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fail</em>' containment reference.
   * @see #getFail()
   * @generated
   */
	void setFail(FailType2 value);

	/**
   * Returns the value of the '<em><b>Zfail</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zfail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Zfail</em>' containment reference.
   * @see #setZfail(ZfailType2)
   * @see org.khronos.collada.ColladaPackage#getStencilOpType1_Zfail()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='zfail' namespace='##targetNamespace'"
   * @generated
   */
	ZfailType2 getZfail();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilOpType1#getZfail <em>Zfail</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zfail</em>' containment reference.
   * @see #getZfail()
   * @generated
   */
	void setZfail(ZfailType2 value);

	/**
   * Returns the value of the '<em><b>Zpass</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zpass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Zpass</em>' containment reference.
   * @see #setZpass(ZpassType2)
   * @see org.khronos.collada.ColladaPackage#getStencilOpType1_Zpass()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='zpass' namespace='##targetNamespace'"
   * @generated
   */
	ZpassType2 getZpass();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilOpType1#getZpass <em>Zpass</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zpass</em>' containment reference.
   * @see #getZpass()
   * @generated
   */
	void setZpass(ZpassType2 value);

} // StencilOpType1
