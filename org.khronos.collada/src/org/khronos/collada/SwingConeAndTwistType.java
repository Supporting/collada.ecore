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
 * A representation of the model object '<em><b>Swing Cone And Twist Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.SwingConeAndTwistType#getMin <em>Min</em>}</li>
 *   <li>{@link org.khronos.collada.SwingConeAndTwistType#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getSwingConeAndTwistType()
 * @model extendedMetaData="name='swing_cone_and_twist_._type' kind='elementOnly'"
 * @generated
 */
public interface SwingConeAndTwistType extends EObject {
	/**
   * Returns the value of the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 															The minimum values for the limit.
   * 															
   * <!-- end-model-doc -->
   * @return the value of the '<em>Min</em>' containment reference.
   * @see #setMin(TargetableFloat3)
   * @see org.khronos.collada.ColladaPackage#getSwingConeAndTwistType_Min()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='min' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat3 getMin();

	/**
   * Sets the value of the '{@link org.khronos.collada.SwingConeAndTwistType#getMin <em>Min</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' containment reference.
   * @see #getMin()
   * @generated
   */
	void setMin(TargetableFloat3 value);

	/**
   * Returns the value of the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 															The maximum values for the limit.
   * 															
   * <!-- end-model-doc -->
   * @return the value of the '<em>Max</em>' containment reference.
   * @see #setMax(TargetableFloat3)
   * @see org.khronos.collada.ColladaPackage#getSwingConeAndTwistType_Max()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat3 getMax();

	/**
   * Sets the value of the '{@link org.khronos.collada.SwingConeAndTwistType#getMax <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' containment reference.
   * @see #getMax()
   * @generated
   */
	void setMax(TargetableFloat3 value);

} // SwingConeAndTwistType
