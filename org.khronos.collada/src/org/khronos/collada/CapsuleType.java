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
 * A representation of the model object '<em><b>Capsule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.CapsuleType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.khronos.collada.CapsuleType#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.khronos.collada.CapsuleType#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getCapsuleType()
 * @model extendedMetaData="name='capsule_._type' kind='elementOnly'"
 * @generated
 */
public interface CapsuleType extends EObject {
	/**
   * Returns the value of the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						A float value that represents the length of the line segment connecting the centers 
   * 						of the capping hemispheres.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Height</em>' attribute.
   * @see #isSetHeight()
   * @see #unsetHeight()
   * @see #setHeight(double)
   * @see org.khronos.collada.ColladaPackage#getCapsuleType_Height()
   * @model unsettable="true" dataType="org.khronos.collada.Float" required="true"
   *        extendedMetaData="kind='element' name='height' namespace='##targetNamespace'"
   * @generated
   */
	double getHeight();

	/**
   * Sets the value of the '{@link org.khronos.collada.CapsuleType#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' attribute.
   * @see #isSetHeight()
   * @see #unsetHeight()
   * @see #getHeight()
   * @generated
   */
	void setHeight(double value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.CapsuleType#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetHeight()
   * @see #getHeight()
   * @see #setHeight(double)
   * @generated
   */
	void unsetHeight();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.CapsuleType#getHeight <em>Height</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Height</em>' attribute is set.
   * @see #unsetHeight()
   * @see #getHeight()
   * @see #setHeight(double)
   * @generated
   */
	boolean isSetHeight();

	/**
   * Returns the value of the '<em><b>Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						Two float values that represent the radii of the capsule (it may be elliptical)
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Radius</em>' attribute.
   * @see #setRadius(List)
   * @see org.khronos.collada.ColladaPackage#getCapsuleType_Radius()
   * @model dataType="org.khronos.collada.Float2" required="true" many="false"
   *        extendedMetaData="kind='element' name='radius' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getRadius();

	/**
   * Sets the value of the '{@link org.khronos.collada.CapsuleType#getRadius <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Radius</em>' attribute.
   * @see #getRadius()
   * @generated
   */
	void setRadius(List<Double> value);

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
   * @see org.khronos.collada.ColladaPackage#getCapsuleType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

} // CapsuleType
