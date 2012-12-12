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
 * A representation of the model object '<em><b>Sphere Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.SphereType#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.khronos.collada.SphereType#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getSphereType()
 * @model extendedMetaData="name='sphere_._type' kind='elementOnly'"
 * @generated
 */
public interface SphereType extends EObject {
	/**
   * Returns the value of the '<em><b>Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						A float value that represents the radius of the sphere
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Radius</em>' attribute.
   * @see #isSetRadius()
   * @see #unsetRadius()
   * @see #setRadius(double)
   * @see org.khronos.collada.ColladaPackage#getSphereType_Radius()
   * @model unsettable="true" dataType="org.khronos.collada.Float" required="true"
   *        extendedMetaData="kind='element' name='radius' namespace='##targetNamespace'"
   * @generated
   */
	double getRadius();

	/**
   * Sets the value of the '{@link org.khronos.collada.SphereType#getRadius <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Radius</em>' attribute.
   * @see #isSetRadius()
   * @see #unsetRadius()
   * @see #getRadius()
   * @generated
   */
	void setRadius(double value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.SphereType#getRadius <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetRadius()
   * @see #getRadius()
   * @see #setRadius(double)
   * @generated
   */
	void unsetRadius();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.SphereType#getRadius <em>Radius</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Radius</em>' attribute is set.
   * @see #unsetRadius()
   * @see #getRadius()
   * @see #setRadius(double)
   * @generated
   */
	boolean isSetRadius();

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
   * @see org.khronos.collada.ColladaPackage#getSphereType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

} // SphereType
