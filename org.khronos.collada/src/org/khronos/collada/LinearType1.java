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
 * A representation of the model object '<em><b>Linear Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.LinearType1#getMin <em>Min</em>}</li>
 *   <li>{@link org.khronos.collada.LinearType1#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getLinearType1()
 * @model extendedMetaData="name='linear_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface LinearType1 extends EObject {
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
   * @see org.khronos.collada.ColladaPackage#getLinearType1_Min()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='min' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat3 getMin();

	/**
   * Sets the value of the '{@link org.khronos.collada.LinearType1#getMin <em>Min</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getLinearType1_Max()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat3 getMax();

	/**
   * Sets the value of the '{@link org.khronos.collada.LinearType1#getMax <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' containment reference.
   * @see #getMax()
   * @generated
   */
	void setMax(TargetableFloat3 value);

} // LinearType1
