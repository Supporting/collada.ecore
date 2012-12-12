/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.BoxType#getHalfExtents <em>Half Extents</em>}</li>
 *   <li>{@link org.khronos.collada.BoxType#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getBoxType()
 * @model extendedMetaData="name='box_._type' kind='elementOnly'"
 * @generated
 */
public interface BoxType extends EObject {
	/**
   * Returns the value of the '<em><b>Half Extents</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						3 float values that represent the extents of the box
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Half Extents</em>' attribute.
   * @see #setHalfExtents(List)
   * @see org.khronos.collada.ColladaPackage#getBoxType_HalfExtents()
   * @model dataType="org.khronos.collada.Float3" required="true" many="false"
   *        extendedMetaData="kind='element' name='half_extents' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getHalfExtents();

	/**
   * Sets the value of the '{@link org.khronos.collada.BoxType#getHalfExtents <em>Half Extents</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Half Extents</em>' attribute.
   * @see #getHalfExtents()
   * @generated
   */
	void setHalfExtents(List<Double> value);

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ExtraType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The extra element may appear any number of times.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getBoxType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

} // BoxType
