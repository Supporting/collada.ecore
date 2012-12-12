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
 * A representation of the model object '<em><b>Blend Func Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.BlendFuncType#getSrc <em>Src</em>}</li>
 *   <li>{@link org.khronos.collada.BlendFuncType#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getBlendFuncType()
 * @model extendedMetaData="name='blend_func_._type' kind='elementOnly'"
 * @generated
 */
public interface BlendFuncType extends EObject {
	/**
   * Returns the value of the '<em><b>Src</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Src</em>' containment reference.
   * @see #setSrc(SrcType)
   * @see org.khronos.collada.ColladaPackage#getBlendFuncType_Src()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='src' namespace='##targetNamespace'"
   * @generated
   */
	SrcType getSrc();

	/**
   * Sets the value of the '{@link org.khronos.collada.BlendFuncType#getSrc <em>Src</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src</em>' containment reference.
   * @see #getSrc()
   * @generated
   */
	void setSrc(SrcType value);

	/**
   * Returns the value of the '<em><b>Dest</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' containment reference.
   * @see #setDest(DestType)
   * @see org.khronos.collada.ColladaPackage#getBlendFuncType_Dest()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='dest' namespace='##targetNamespace'"
   * @generated
   */
	DestType getDest();

	/**
   * Sets the value of the '{@link org.khronos.collada.BlendFuncType#getDest <em>Dest</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' containment reference.
   * @see #getDest()
   * @generated
   */
	void setDest(DestType value);

} // BlendFuncType
