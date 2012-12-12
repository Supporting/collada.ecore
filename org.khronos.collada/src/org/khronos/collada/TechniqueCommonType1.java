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
 * A representation of the model object '<em><b>Technique Common Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TechniqueCommonType1#getDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType1#getMass <em>Mass</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType1#getMassFrame <em>Mass Frame</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType1#getInertia <em>Inertia</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType1#getInstancePhysicsMaterial <em>Instance Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType1#getPhysicsMaterial <em>Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType1#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType1()
 * @model extendedMetaData="name='technique_common_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface TechniqueCommonType1 extends EObject {
	/**
   * Returns the value of the '<em><b>Dynamic</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									If false, the rigid_body is not moveable
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Dynamic</em>' containment reference.
   * @see #setDynamic(DynamicType1)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType1_Dynamic()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='dynamic' namespace='##targetNamespace'"
   * @generated
   */
	DynamicType1 getDynamic();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType1#getDynamic <em>Dynamic</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dynamic</em>' containment reference.
   * @see #getDynamic()
   * @generated
   */
	void setDynamic(DynamicType1 value);

	/**
   * Returns the value of the '<em><b>Mass</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The total mass of the rigid-body
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Mass</em>' containment reference.
   * @see #setMass(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType1_Mass()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getMass();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType1#getMass <em>Mass</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mass</em>' containment reference.
   * @see #getMass()
   * @generated
   */
	void setMass(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Mass Frame</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									Defines the center and orientation of mass of the rigid-body relative to the local origin of the 
   * 									“root” shape.This makes the off-diagonal elements of the inertia tensor (products of inertia) all 
   * 									0 and allows us to just store the diagonal elements (moments of inertia).
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Mass Frame</em>' containment reference.
   * @see #setMassFrame(MassFrameType1)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType1_MassFrame()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='mass_frame' namespace='##targetNamespace'"
   * @generated
   */
	MassFrameType1 getMassFrame();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType1#getMassFrame <em>Mass Frame</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mass Frame</em>' containment reference.
   * @see #getMassFrame()
   * @generated
   */
	void setMassFrame(MassFrameType1 value);

	/**
   * Returns the value of the '<em><b>Inertia</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									float3 – The diagonal elements of the inertia tensor (moments of inertia), which is represented 
   * 									in the local frame of the center of mass. See above.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Inertia</em>' containment reference.
   * @see #setInertia(TargetableFloat3)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType1_Inertia()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='inertia' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat3 getInertia();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType1#getInertia <em>Inertia</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inertia</em>' containment reference.
   * @see #getInertia()
   * @generated
   */
	void setInertia(TargetableFloat3 value);

	/**
   * Returns the value of the '<em><b>Instance Physics Material</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 										References a physics_material for the rigid_body.
   * 										
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Physics Material</em>' containment reference.
   * @see #setInstancePhysicsMaterial(InstanceWithExtra)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType1_InstancePhysicsMaterial()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_physics_material' namespace='##targetNamespace'"
   * @generated
   */
	InstanceWithExtra getInstancePhysicsMaterial();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType1#getInstancePhysicsMaterial <em>Instance Physics Material</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Physics Material</em>' containment reference.
   * @see #getInstancePhysicsMaterial()
   * @generated
   */
	void setInstancePhysicsMaterial(InstanceWithExtra value);

	/**
   * Returns the value of the '<em><b>Physics Material</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 										Defines a physics_material for the rigid_body.
   * 										
   * <!-- end-model-doc -->
   * @return the value of the '<em>Physics Material</em>' containment reference.
   * @see #setPhysicsMaterial(PhysicsMaterialType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType1_PhysicsMaterial()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='physics_material' namespace='##targetNamespace'"
   * @generated
   */
	PhysicsMaterialType getPhysicsMaterial();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType1#getPhysicsMaterial <em>Physics Material</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Physics Material</em>' containment reference.
   * @see #getPhysicsMaterial()
   * @generated
   */
	void setPhysicsMaterial(PhysicsMaterialType value);

	/**
   * Returns the value of the '<em><b>Shape</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ShapeType1}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									This element allows for describing components of a rigid_body.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Shape</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType1_Shape()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='shape' namespace='##targetNamespace'"
   * @generated
   */
	EList<ShapeType1> getShape();

} // TechniqueCommonType1
