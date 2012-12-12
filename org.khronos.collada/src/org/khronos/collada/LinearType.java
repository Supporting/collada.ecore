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
 * A representation of the model object '<em><b>Linear Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.LinearType#getStiffness <em>Stiffness</em>}</li>
 *   <li>{@link org.khronos.collada.LinearType#getDamping <em>Damping</em>}</li>
 *   <li>{@link org.khronos.collada.LinearType#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getLinearType()
 * @model extendedMetaData="name='linear_._type' kind='elementOnly'"
 * @generated
 */
public interface LinearType extends EObject {
	/**
   * Returns the value of the '<em><b>Stiffness</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 															The stiffness (also called spring coefficient) has units of force/distance. 
   * 															
   * <!-- end-model-doc -->
   * @return the value of the '<em>Stiffness</em>' containment reference.
   * @see #setStiffness(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getLinearType_Stiffness()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='stiffness' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getStiffness();

	/**
   * Sets the value of the '{@link org.khronos.collada.LinearType#getStiffness <em>Stiffness</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stiffness</em>' containment reference.
   * @see #getStiffness()
   * @generated
   */
	void setStiffness(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Damping</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 															The spring damping coefficient.
   * 															
   * <!-- end-model-doc -->
   * @return the value of the '<em>Damping</em>' containment reference.
   * @see #setDamping(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getLinearType_Damping()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='damping' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getDamping();

	/**
   * Sets the value of the '{@link org.khronos.collada.LinearType#getDamping <em>Damping</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Damping</em>' containment reference.
   * @see #getDamping()
   * @generated
   */
	void setDamping(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Target Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 															The spring's target or resting distance.
   * 															
   * <!-- end-model-doc -->
   * @return the value of the '<em>Target Value</em>' containment reference.
   * @see #setTargetValue(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getLinearType_TargetValue()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='target_value' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getTargetValue();

	/**
   * Sets the value of the '{@link org.khronos.collada.LinearType#getTargetValue <em>Target Value</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Value</em>' containment reference.
   * @see #getTargetValue()
   * @generated
   */
	void setTargetValue(TargetableFloat value);

} // LinearType
