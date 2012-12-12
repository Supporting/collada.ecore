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
 * A representation of the model object '<em><b>Directional Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.DirectionalType#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getDirectionalType()
 * @model extendedMetaData="name='directional_._type' kind='elementOnly'"
 * @generated
 */
public interface DirectionalType extends EObject {
	/**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 												The color element contains three floating point numbers specifying the color of the light.
   * 												The color element must occur exactly once.  
   * 												
   * <!-- end-model-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(TargetableFloat3)
   * @see org.khronos.collada.ColladaPackage#getDirectionalType_Color()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat3 getColor();

	/**
   * Sets the value of the '{@link org.khronos.collada.DirectionalType#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
	void setColor(TargetableFloat3 value);

} // DirectionalType
