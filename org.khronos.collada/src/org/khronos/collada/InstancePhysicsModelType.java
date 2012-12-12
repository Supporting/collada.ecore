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
 * A representation of the model object '<em><b>Instance Physics Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.InstancePhysicsModelType#getInstanceForceField <em>Instance Force Field</em>}</li>
 *   <li>{@link org.khronos.collada.InstancePhysicsModelType#getInstanceRigidBody <em>Instance Rigid Body</em>}</li>
 *   <li>{@link org.khronos.collada.InstancePhysicsModelType#getInstanceRigidConstraint <em>Instance Rigid Constraint</em>}</li>
 *   <li>{@link org.khronos.collada.InstancePhysicsModelType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.InstancePhysicsModelType#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.InstancePhysicsModelType#getParent <em>Parent</em>}</li>
 *   <li>{@link org.khronos.collada.InstancePhysicsModelType#getSid <em>Sid</em>}</li>
 *   <li>{@link org.khronos.collada.InstancePhysicsModelType#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getInstancePhysicsModelType()
 * @model extendedMetaData="name='instance_physics_model_._type' kind='elementOnly'"
 * @generated
 */
public interface InstancePhysicsModelType extends EObject {
	/**
   * Returns the value of the '<em><b>Instance Force Field</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.InstanceWithExtra}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The instance_physics_model element may instance any number of force_field elements.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Force Field</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getInstancePhysicsModelType_InstanceForceField()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_force_field' namespace='##targetNamespace'"
   * @generated
   */
	EList<InstanceWithExtra> getInstanceForceField();

	/**
   * Returns the value of the '<em><b>Instance Rigid Body</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.InstanceRigidBodyType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The instance_physics_model element may instance any number of rigid_body elements.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Rigid Body</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getInstancePhysicsModelType_InstanceRigidBody()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_rigid_body' namespace='##targetNamespace'"
   * @generated
   */
	EList<InstanceRigidBodyType> getInstanceRigidBody();

	/**
   * Returns the value of the '<em><b>Instance Rigid Constraint</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.InstanceRigidConstraintType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The instance_physics_model element may instance any number of rigid_constraint elements.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Rigid Constraint</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getInstancePhysicsModelType_InstanceRigidConstraint()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_rigid_constraint' namespace='##targetNamespace'"
   * @generated
   */
	EList<InstanceRigidConstraintType> getInstanceRigidConstraint();

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ExtraType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The extra element may appear any number of times.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getInstancePhysicsModelType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The name attribute is the text string name of this element. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.khronos.collada.ColladaPackage#getInstancePhysicsModelType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstancePhysicsModelType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Parent</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The parent attribute points to the id of a node in the visual scene. This allows a physics model 
   * 					to be instantiated under a specific transform node, which will dictate the initial position and 
   * 					orientation, and could be animated to influence kinematic rigid bodies.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Parent</em>' attribute.
   * @see #setParent(String)
   * @see org.khronos.collada.ColladaPackage#getInstancePhysicsModelType_Parent()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
   *        extendedMetaData="kind='attribute' name='parent'"
   * @generated
   */
	String getParent();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstancePhysicsModelType#getParent <em>Parent</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' attribute.
   * @see #getParent()
   * @generated
   */
	void setParent(String value);

	/**
   * Returns the value of the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The sid attribute is a text string value containing the sub-identifier of this element. This 
   * 					value must be unique within the scope of the parent element. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sid</em>' attribute.
   * @see #setSid(String)
   * @see org.khronos.collada.ColladaPackage#getInstancePhysicsModelType_Sid()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstancePhysicsModelType#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

	/**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The url attribute refers to resource.  This may refer to a local resource using a relative URL 
   * 					fragment identifier that begins with the “#” character. The url attribute may refer to an external 
   * 					resource using an absolute or relative URL.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see org.khronos.collada.ColladaPackage#getInstancePhysicsModelType_Url()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
   *        extendedMetaData="kind='attribute' name='url'"
   * @generated
   */
	String getUrl();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstancePhysicsModelType#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
	void setUrl(String value);

} // InstancePhysicsModelType
