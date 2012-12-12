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
 * A representation of the model object '<em><b>Stencil Op Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.StencilOpType#getFail <em>Fail</em>}</li>
 *   <li>{@link org.khronos.collada.StencilOpType#getZfail <em>Zfail</em>}</li>
 *   <li>{@link org.khronos.collada.StencilOpType#getZpass <em>Zpass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getStencilOpType()
 * @model extendedMetaData="name='stencil_op_._type' kind='elementOnly'"
 * @generated
 */
public interface StencilOpType extends EObject {
	/**
   * Returns the value of the '<em><b>Fail</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fail</em>' containment reference.
   * @see #setFail(FailType)
   * @see org.khronos.collada.ColladaPackage#getStencilOpType_Fail()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='fail' namespace='##targetNamespace'"
   * @generated
   */
	FailType getFail();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilOpType#getFail <em>Fail</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fail</em>' containment reference.
   * @see #getFail()
   * @generated
   */
	void setFail(FailType value);

	/**
   * Returns the value of the '<em><b>Zfail</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zfail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Zfail</em>' containment reference.
   * @see #setZfail(ZfailType1)
   * @see org.khronos.collada.ColladaPackage#getStencilOpType_Zfail()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='zfail' namespace='##targetNamespace'"
   * @generated
   */
	ZfailType1 getZfail();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilOpType#getZfail <em>Zfail</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zfail</em>' containment reference.
   * @see #getZfail()
   * @generated
   */
	void setZfail(ZfailType1 value);

	/**
   * Returns the value of the '<em><b>Zpass</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zpass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Zpass</em>' containment reference.
   * @see #setZpass(ZpassType)
   * @see org.khronos.collada.ColladaPackage#getStencilOpType_Zpass()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='zpass' namespace='##targetNamespace'"
   * @generated
   */
	ZpassType getZpass();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilOpType#getZpass <em>Zpass</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zpass</em>' containment reference.
   * @see #getZpass()
   * @generated
   */
	void setZpass(ZpassType value);

} // StencilOpType
