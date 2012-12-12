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
 * A representation of the model object '<em><b>Limits Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.LimitsType#getSwingConeAndTwist <em>Swing Cone And Twist</em>}</li>
 *   <li>{@link org.khronos.collada.LimitsType#getLinear <em>Linear</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getLimitsType()
 * @model extendedMetaData="name='limits_._type' kind='elementOnly'"
 * @generated
 */
public interface LimitsType extends EObject {
	/**
   * Returns the value of the '<em><b>Swing Cone And Twist</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 												The swing_cone_and_twist element describes the angular limits along each rotation axis in degrees.
   * 												The the X and Y limits describe a “swing cone” and the Z limits describe the “twist angle” range 
   * 												
   * <!-- end-model-doc -->
   * @return the value of the '<em>Swing Cone And Twist</em>' containment reference.
   * @see #setSwingConeAndTwist(SwingConeAndTwistType)
   * @see org.khronos.collada.ColladaPackage#getLimitsType_SwingConeAndTwist()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='swing_cone_and_twist' namespace='##targetNamespace'"
   * @generated
   */
	SwingConeAndTwistType getSwingConeAndTwist();

	/**
   * Sets the value of the '{@link org.khronos.collada.LimitsType#getSwingConeAndTwist <em>Swing Cone And Twist</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Swing Cone And Twist</em>' containment reference.
   * @see #getSwingConeAndTwist()
   * @generated
   */
	void setSwingConeAndTwist(SwingConeAndTwistType value);

	/**
   * Returns the value of the '<em><b>Linear</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 												The linear element describes linear (translational) limits along each axis.
   * 												
   * <!-- end-model-doc -->
   * @return the value of the '<em>Linear</em>' containment reference.
   * @see #setLinear(LinearType1)
   * @see org.khronos.collada.ColladaPackage#getLimitsType_Linear()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='linear' namespace='##targetNamespace'"
   * @generated
   */
	LinearType1 getLinear();

	/**
   * Sets the value of the '{@link org.khronos.collada.LimitsType#getLinear <em>Linear</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Linear</em>' containment reference.
   * @see #getLinear()
   * @generated
   */
	void setLinear(LinearType1 value);

} // LimitsType
