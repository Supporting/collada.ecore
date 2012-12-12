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
 * A representation of the model object '<em><b>Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.PointType#getColor <em>Color</em>}</li>
 *   <li>{@link org.khronos.collada.PointType#getConstantAttenuation <em>Constant Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.PointType#getLinearAttenuation <em>Linear Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.PointType#getQuadraticAttenuation <em>Quadratic Attenuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getPointType()
 * @model extendedMetaData="name='point_._type' kind='elementOnly'"
 * @generated
 */
public interface PointType extends EObject {
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
   * @see org.khronos.collada.ColladaPackage#getPointType_Color()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat3 getColor();

	/**
   * Sets the value of the '{@link org.khronos.collada.PointType#getColor <em>Color</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getPointType_ConstantAttenuation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='constant_attenuation' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getConstantAttenuation();

	/**
   * Sets the value of the '{@link org.khronos.collada.PointType#getConstantAttenuation <em>Constant Attenuation</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getPointType_LinearAttenuation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='linear_attenuation' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getLinearAttenuation();

	/**
   * Sets the value of the '{@link org.khronos.collada.PointType#getLinearAttenuation <em>Linear Attenuation</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getPointType_QuadraticAttenuation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='quadratic_attenuation' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getQuadraticAttenuation();

	/**
   * Sets the value of the '{@link org.khronos.collada.PointType#getQuadraticAttenuation <em>Quadratic Attenuation</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quadratic Attenuation</em>' containment reference.
   * @see #getQuadraticAttenuation()
   * @generated
   */
	void setQuadraticAttenuation(TargetableFloat value);

} // PointType
