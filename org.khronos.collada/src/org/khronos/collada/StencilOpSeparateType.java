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
 * A representation of the model object '<em><b>Stencil Op Separate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.StencilOpSeparateType#getFace <em>Face</em>}</li>
 *   <li>{@link org.khronos.collada.StencilOpSeparateType#getFail <em>Fail</em>}</li>
 *   <li>{@link org.khronos.collada.StencilOpSeparateType#getZfail <em>Zfail</em>}</li>
 *   <li>{@link org.khronos.collada.StencilOpSeparateType#getZpass <em>Zpass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getStencilOpSeparateType()
 * @model extendedMetaData="name='stencil_op_separate_._type' kind='elementOnly'"
 * @generated
 */
public interface StencilOpSeparateType extends EObject {
	/**
   * Returns the value of the '<em><b>Face</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Face</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Face</em>' containment reference.
   * @see #setFace(FaceType1)
   * @see org.khronos.collada.ColladaPackage#getStencilOpSeparateType_Face()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='face' namespace='##targetNamespace'"
   * @generated
   */
	FaceType1 getFace();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilOpSeparateType#getFace <em>Face</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Face</em>' containment reference.
   * @see #getFace()
   * @generated
   */
	void setFace(FaceType1 value);

	/**
   * Returns the value of the '<em><b>Fail</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fail</em>' containment reference.
   * @see #setFail(FailType1)
   * @see org.khronos.collada.ColladaPackage#getStencilOpSeparateType_Fail()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='fail' namespace='##targetNamespace'"
   * @generated
   */
	FailType1 getFail();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilOpSeparateType#getFail <em>Fail</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fail</em>' containment reference.
   * @see #getFail()
   * @generated
   */
	void setFail(FailType1 value);

	/**
   * Returns the value of the '<em><b>Zfail</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zfail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Zfail</em>' containment reference.
   * @see #setZfail(ZfailType)
   * @see org.khronos.collada.ColladaPackage#getStencilOpSeparateType_Zfail()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='zfail' namespace='##targetNamespace'"
   * @generated
   */
	ZfailType getZfail();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilOpSeparateType#getZfail <em>Zfail</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zfail</em>' containment reference.
   * @see #getZfail()
   * @generated
   */
	void setZfail(ZfailType value);

	/**
   * Returns the value of the '<em><b>Zpass</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zpass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Zpass</em>' containment reference.
   * @see #setZpass(ZpassType1)
   * @see org.khronos.collada.ColladaPackage#getStencilOpSeparateType_Zpass()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='zpass' namespace='##targetNamespace'"
   * @generated
   */
	ZpassType1 getZpass();

	/**
   * Sets the value of the '{@link org.khronos.collada.StencilOpSeparateType#getZpass <em>Zpass</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zpass</em>' containment reference.
   * @see #getZpass()
   * @generated
   */
	void setZpass(ZpassType1 value);

} // StencilOpSeparateType
