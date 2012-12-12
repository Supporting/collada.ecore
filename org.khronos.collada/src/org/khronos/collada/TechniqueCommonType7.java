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
 * A representation of the model object '<em><b>Technique Common Type7</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TechniqueCommonType7#getGravity <em>Gravity</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType7#getTimeStep <em>Time Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType7()
 * @model extendedMetaData="name='technique_common_._7_._type' kind='elementOnly'"
 * @generated
 */
public interface TechniqueCommonType7 extends EObject {
	/**
   * Returns the value of the '<em><b>Gravity</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The gravity vector to use for the physics_scene.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Gravity</em>' containment reference.
   * @see #setGravity(TargetableFloat3)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType7_Gravity()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='gravity' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat3 getGravity();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType7#getGravity <em>Gravity</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gravity</em>' containment reference.
   * @see #getGravity()
   * @generated
   */
	void setGravity(TargetableFloat3 value);

	/**
   * Returns the value of the '<em><b>Time Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The time_step for the physics_scene.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Time Step</em>' containment reference.
   * @see #setTimeStep(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType7_TimeStep()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='time_step' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getTimeStep();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType7#getTimeStep <em>Time Step</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Step</em>' containment reference.
   * @see #getTimeStep()
   * @generated
   */
	void setTimeStep(TargetableFloat value);

} // TechniqueCommonType7
