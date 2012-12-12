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
 * A representation of the model object '<em><b>Spot Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.SpotType#getColor <em>Color</em>}</li>
 *   <li>{@link org.khronos.collada.SpotType#getConstantAttenuation <em>Constant Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.SpotType#getLinearAttenuation <em>Linear Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.SpotType#getQuadraticAttenuation <em>Quadratic Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.SpotType#getFalloffAngle <em>Falloff Angle</em>}</li>
 *   <li>{@link org.khronos.collada.SpotType#getFalloffExponent <em>Falloff Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getSpotType()
 * @model extendedMetaData="name='spot_._type' kind='elementOnly'"
 * @generated
 */
public interface SpotType extends EObject {
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
   * @see org.khronos.collada.ColladaPackage#getSpotType_Color()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat3 getColor();

	/**
   * Sets the value of the '{@link org.khronos.collada.SpotType#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
	void setColor(TargetableFloat3 value);

	/**
   * Returns the value of the '<em><b>Constant Attenuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 												The constant_attenuation is used to calculate the total attenuation of this light given a distance. 
   * 												The equation used is A = constant_attenuation + Dist*linear_attenuation + Dist^2*quadratic_attenuation. 
   * 												
   * <!-- end-model-doc -->
   * @return the value of the '<em>Constant Attenuation</em>' containment reference.
   * @see #setConstantAttenuation(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getSpotType_ConstantAttenuation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='constant_attenuation' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getConstantAttenuation();

	/**
   * Sets the value of the '{@link org.khronos.collada.SpotType#getConstantAttenuation <em>Constant Attenuation</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant Attenuation</em>' containment reference.
   * @see #getConstantAttenuation()
   * @generated
   */
	void setConstantAttenuation(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Linear Attenuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 												The linear_attenuation is used to calculate the total attenuation of this light given a distance. 
   * 												The equation used is A = constant_attenuation + Dist*linear_attenuation + Dist^2*quadratic_attenuation. 
   * 												
   * <!-- end-model-doc -->
   * @return the value of the '<em>Linear Attenuation</em>' containment reference.
   * @see #setLinearAttenuation(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getSpotType_LinearAttenuation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='linear_attenuation' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getLinearAttenuation();

	/**
   * Sets the value of the '{@link org.khronos.collada.SpotType#getLinearAttenuation <em>Linear Attenuation</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Linear Attenuation</em>' containment reference.
   * @see #getLinearAttenuation()
   * @generated
   */
	void setLinearAttenuation(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Quadratic Attenuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 												The quadratic_attenuation is used to calculate the total attenuation of this light given a distance. 
   * 												The equation used is A = constant_attenuation + Dist*linear_attenuation + Dist^2*quadratic_attenuation. 
   * 												
   * <!-- end-model-doc -->
   * @return the value of the '<em>Quadratic Attenuation</em>' containment reference.
   * @see #setQuadraticAttenuation(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getSpotType_QuadraticAttenuation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='quadratic_attenuation' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getQuadraticAttenuation();

	/**
   * Sets the value of the '{@link org.khronos.collada.SpotType#getQuadraticAttenuation <em>Quadratic Attenuation</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quadratic Attenuation</em>' containment reference.
   * @see #getQuadraticAttenuation()
   * @generated
   */
	void setQuadraticAttenuation(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Falloff Angle</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 												The falloff_angle is used to specify the amount of attenuation based on the direction of the light.
   * 												
   * <!-- end-model-doc -->
   * @return the value of the '<em>Falloff Angle</em>' containment reference.
   * @see #setFalloffAngle(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getSpotType_FalloffAngle()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='falloff_angle' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getFalloffAngle();

	/**
   * Sets the value of the '{@link org.khronos.collada.SpotType#getFalloffAngle <em>Falloff Angle</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Falloff Angle</em>' containment reference.
   * @see #getFalloffAngle()
   * @generated
   */
	void setFalloffAngle(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Falloff Exponent</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 												The falloff_exponent is used to specify the amount of attenuation based on the direction of the light.
   * 												
   * <!-- end-model-doc -->
   * @return the value of the '<em>Falloff Exponent</em>' containment reference.
   * @see #setFalloffExponent(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getSpotType_FalloffExponent()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='falloff_exponent' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getFalloffExponent();

	/**
   * Sets the value of the '{@link org.khronos.collada.SpotType#getFalloffExponent <em>Falloff Exponent</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Falloff Exponent</em>' containment reference.
   * @see #getFalloffExponent()
   * @generated
   */
	void setFalloffExponent(TargetableFloat value);

} // SpotType
