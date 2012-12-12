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
 * A representation of the model object '<em><b>Scene Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.SceneType#getInstancePhysicsScene <em>Instance Physics Scene</em>}</li>
 *   <li>{@link org.khronos.collada.SceneType#getInstanceVisualScene <em>Instance Visual Scene</em>}</li>
 *   <li>{@link org.khronos.collada.SceneType#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getSceneType()
 * @model extendedMetaData="name='scene_._type' kind='elementOnly'"
 * @generated
 */
public interface SceneType extends EObject {
	/**
   * Returns the value of the '<em><b>Instance Physics Scene</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.InstanceWithExtra}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The instance_physics_scene element declares the instantiation of a COLLADA physics_scene resource.
   * 									The instance_physics_scene element may appear any number of times.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Physics Scene</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getSceneType_InstancePhysicsScene()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_physics_scene' namespace='##targetNamespace'"
   * @generated
   */
	EList<InstanceWithExtra> getInstancePhysicsScene();

	/**
   * Returns the value of the '<em><b>Instance Visual Scene</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The instance_visual_scene element declares the instantiation of a COLLADA visual_scene resource.
   * 									The instance_visual_scene element may only appear once.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Visual Scene</em>' containment reference.
   * @see #setInstanceVisualScene(InstanceWithExtra)
   * @see org.khronos.collada.ColladaPackage#getSceneType_InstanceVisualScene()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_visual_scene' namespace='##targetNamespace'"
   * @generated
   */
	InstanceWithExtra getInstanceVisualScene();

	/**
   * Sets the value of the '{@link org.khronos.collada.SceneType#getInstanceVisualScene <em>Instance Visual Scene</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Visual Scene</em>' containment reference.
   * @see #getInstanceVisualScene()
   * @generated
   */
	void setInstanceVisualScene(InstanceWithExtra value);

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ExtraType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The extra element may appear any number of times.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getSceneType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

} // SceneType
