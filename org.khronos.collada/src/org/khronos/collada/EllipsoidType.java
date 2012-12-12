/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ellipsoid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.EllipsoidType#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getEllipsoidType()
 * @model extendedMetaData="name='ellipsoid_._type' kind='elementOnly'"
 * @generated
 */
public interface EllipsoidType extends EObject {
	/**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(List)
   * @see org.khronos.collada.ColladaPackage#getEllipsoidType_Size()
   * @model dataType="org.khronos.collada.Float3" required="true" many="false"
   *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getSize();

	/**
   * Sets the value of the '{@link org.khronos.collada.EllipsoidType#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
	void setSize(List<Double> value);

} // EllipsoidType
