/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.PrimaryType1#getOrder <em>Order</em>}</li>
 *   <li>{@link org.khronos.collada.PrimaryType1#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getPrimaryType1()
 * @model extendedMetaData="name='primary_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface PrimaryType1 extends EObject {
	/**
   * Returns the value of the '<em><b>Order</b></em>' attribute list.
   * The list contents are of type {@link org.khronos.collada.FxSurfaceFaceEnum}.
   * The literals are from the enumeration {@link org.khronos.collada.FxSurfaceFaceEnum}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * If the image dues not natively describe the face ordering then this series of order elements will describe which face the index belongs too
   * <!-- end-model-doc -->
   * @return the value of the '<em>Order</em>' attribute list.
   * @see org.khronos.collada.FxSurfaceFaceEnum
   * @see org.khronos.collada.ColladaPackage#getPrimaryType1_Order()
   * @model unique="false" upper="6"
   *        extendedMetaData="kind='element' name='order' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxSurfaceFaceEnum> getOrder();

	/**
   * Returns the value of the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' attribute.
   * @see #setRef(String)
   * @see org.khronos.collada.ColladaPackage#getPrimaryType1_Ref()
   * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
   *        extendedMetaData="kind='attribute' name='ref'"
   * @generated
   */
	String getRef();

	/**
   * Sets the value of the '{@link org.khronos.collada.PrimaryType1#getRef <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' attribute.
   * @see #getRef()
   * @generated
   */
	void setRef(String value);

} // PrimaryType1
