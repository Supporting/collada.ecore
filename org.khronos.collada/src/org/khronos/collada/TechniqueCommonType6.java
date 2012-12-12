/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technique Common Type6</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TechniqueCommonType6#getAngularVelocity <em>Angular Velocity</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType6#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType6#getDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType6#getMass <em>Mass</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType6#getMassFrame <em>Mass Frame</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType6#getInertia <em>Inertia</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType6#getInstancePhysicsMaterial <em>Instance Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType6#getPhysicsMaterial <em>Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType6#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType6()
 * @model extendedMetaData="name='technique_common_._6_._type' kind='elementOnly'"
 * @generated
 */
public interface TechniqueCommonType6 extends EObject {
	/**
   * Returns the value of the '<em><b>Angular Velocity</b></em>' attribute.
   * The default value is <code>"0.0 0.0 0.0"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									Specifies the initial angular velocity of the rigid_body instance in degrees per second 
   * 									around each axis, in the form of an X-Y-Z Euler rotation.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Angular Velocity</em>' attribute.
   * @see #isSetAngularVelocity()
   * @see #unsetAngularVelocity()
   * @see #setAngularVelocity(List)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType6_AngularVelocity()
   * @model default="0.0 0.0 0.0" unsettable="true" dataType="org.khronos.collada.Float3" many="false"
   *        extendedMetaData="kind='element' name='angular_velocity' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getAngularVelocity();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType6#getAngularVelocity <em>Angular Velocity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Angular Velocity</em>' attribute.
   * @see #isSetAngularVelocity()
   * @see #unsetAngularVelocity()
   * @see #getAngularVelocity()
   * @generated
   */
	void setAngularVelocity(List<Double> value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.TechniqueCommonType6#getAngularVelocity <em>Angular Velocity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetAngularVelocity()
   * @see #getAngularVelocity()
   * @see #setAngularVelocity(List)
   * @generated
   */
	void unsetAngularVelocity();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.TechniqueCommonType6#getAngularVelocity <em>Angular Velocity</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Angular Velocity</em>' attribute is set.
   * @see #unsetAngularVelocity()
   * @see #getAngularVelocity()
   * @see #setAngularVelocity(List)
   * @generated
   */
	boolean isSetAngularVelocity();

	/**
   * Returns the value of the '<em><b>Velocity</b></em>' attribute.
   * The default value is <code>"0.0 0.0 0.0"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									Specifies the initial linear velocity of the rigid_body instance.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Velocity</em>' attribute.
   * @see #isSetVelocity()
   * @see #unsetVelocity()
   * @see #setVelocity(List)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType6_Velocity()
   * @model default="0.0 0.0 0.0" unsettable="true" dataType="org.khronos.collada.Float3" many="false"
   *        extendedMetaData="kind='element' name='velocity' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getVelocity();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType6#getVelocity <em>Velocity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Velocity</em>' attribute.
   * @see #isSetVelocity()
   * @see #unsetVelocity()
   * @see #getVelocity()
   * @generated
   */
	void setVelocity(List<Double> value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.TechniqueCommonType6#getVelocity <em>Velocity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetVelocity()
   * @see #getVelocity()
   * @see #setVelocity(List)
   * @generated
   */
	void unsetVelocity();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.TechniqueCommonType6#getVelocity <em>Velocity</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Velocity</em>' attribute is set.
   * @see #unsetVelocity()
   * @see #getVelocity()
   * @see #setVelocity(List)
   * @generated
   */
	boolean isSetVelocity();

	/**
   * Returns the value of the '<em><b>Dynamic</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Dynamic</em>' containment reference.
   * @see #setDynamic(DynamicType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType6_Dynamic()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='dynamic' namespace='##targetNamespace'"
   * @generated
   */
	DynamicType getDynamic();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType6#getDynamic <em>Dynamic</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dynamic</em>' containment reference.
   * @see #getDynamic()
   * @generated
   */
	void setDynamic(DynamicType value);

	/**
   * Returns the value of the '<em><b>Mass</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mass</em>' containment reference.
   * @see #setMass(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType6_Mass()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getMass();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType6#getMass <em>Mass</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Mass Frame</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mass Frame</em>' containment reference.
   * @see #setMassFrame(MassFrameType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType6_MassFrame()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='mass_frame' namespace='##targetNamespace'"
   * @generated
   */
	MassFrameType getMassFrame();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType6#getMassFrame <em>Mass Frame</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mass Frame</em>' containment reference.
   * @see #getMassFrame()
   * @generated
   */
	void setMassFrame(MassFrameType value);

	/**
   * Returns the value of the '<em><b>Inertia</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inertia</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Inertia</em>' containment reference.
   * @see #setInertia(TargetableFloat3)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType6_Inertia()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='inertia' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat3 getInertia();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType6#getInertia <em>Inertia</em>}' containment reference.
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
   * 			The instance_physics_material element declares the instantiation of a COLLADA physics_material 
   * 			resource.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Physics Material</em>' containment reference.
   * @see #setInstancePhysicsMaterial(InstanceWithExtra)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType6_InstancePhysicsMaterial()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_physics_material' namespace='##targetNamespace'"
   * @generated
   */
	InstanceWithExtra getInstancePhysicsMaterial();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType6#getInstancePhysicsMaterial <em>Instance Physics Material</em>}' containment reference.
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
   * 			This element defines the physical properties of an object. It contains a technique/profile with 
   * 			parameters. The COMMON profile defines the built-in names, such as static_friction.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Physics Material</em>' containment reference.
   * @see #setPhysicsMaterial(PhysicsMaterialType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType6_PhysicsMaterial()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='physics_material' namespace='##targetNamespace'"
   * @generated
   */
	PhysicsMaterialType getPhysicsMaterial();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType6#getPhysicsMaterial <em>Physics Material</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Physics Material</em>' containment reference.
   * @see #getPhysicsMaterial()
   * @generated
   */
	void setPhysicsMaterial(PhysicsMaterialType value);

	/**
   * Returns the value of the '<em><b>Shape</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ShapeType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Shape</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType6_Shape()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='shape' namespace='##targetNamespace'"
   * @generated
   */
	EList<ShapeType> getShape();

} // TechniqueCommonType6
