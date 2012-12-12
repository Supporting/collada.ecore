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
 * A representation of the model object '<em><b>Plane Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.PlaneType#getEquation <em>Equation</em>}</li>
 *   <li>{@link org.khronos.collada.PlaneType#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getPlaneType()
 * @model extendedMetaData="name='plane_._type' kind='elementOnly'"
 * @generated
 */
public interface PlaneType extends EObject {
	/**
   * Returns the value of the '<em><b>Equation</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						4 float values that represent the coefficients for the plane’s equation:    Ax + By + Cz + D = 0
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Equation</em>' attribute.
   * @see #setEquation(List)
   * @see org.khronos.collada.ColladaPackage#getPlaneType_Equation()
   * @model dataType="org.khronos.collada.Float4" required="true" many="false"
   *        extendedMetaData="kind='element' name='equation' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getEquation();

	/**
   * Sets the value of the '{@link org.khronos.collada.PlaneType#getEquation <em>Equation</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Equation</em>' attribute.
   * @see #getEquation()
   * @generated
   */
	void setEquation(List<Double> value);

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
   * @see org.khronos.collada.ColladaPackage#getPlaneType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

} // PlaneType
