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
 * A representation of the model object '<em><b>Spring Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.SpringType1#getAngular <em>Angular</em>}</li>
 *   <li>{@link org.khronos.collada.SpringType1#getLinear <em>Linear</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getSpringType1()
 * @model extendedMetaData="name='spring_._type' kind='elementOnly'"
 * @generated
 */
public interface SpringType1 extends EObject {
	/**
   * Returns the value of the '<em><b>Angular</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 												The angular spring properties.
   * 												
   * <!-- end-model-doc -->
   * @return the value of the '<em>Angular</em>' containment reference.
   * @see #setAngular(AngularType)
   * @see org.khronos.collada.ColladaPackage#getSpringType1_Angular()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='angular' namespace='##targetNamespace'"
   * @generated
   */
	AngularType getAngular();

	/**
   * Sets the value of the '{@link org.khronos.collada.SpringType1#getAngular <em>Angular</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Angular</em>' containment reference.
   * @see #getAngular()
   * @generated
   */
	void setAngular(AngularType value);

	/**
   * Returns the value of the '<em><b>Linear</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 												The linear spring properties.
   * 												
   * <!-- end-model-doc -->
   * @return the value of the '<em>Linear</em>' containment reference.
   * @see #setLinear(LinearType)
   * @see org.khronos.collada.ColladaPackage#getSpringType1_Linear()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='linear' namespace='##targetNamespace'"
   * @generated
   */
	LinearType getLinear();

	/**
   * Sets the value of the '{@link org.khronos.collada.SpringType1#getLinear <em>Linear</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Linear</em>' containment reference.
   * @see #getLinear()
   * @generated
   */
	void setLinear(LinearType value);

} // SpringType1
