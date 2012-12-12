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
 * A representation of the model object '<em><b>Physics Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.PhysicsModelType#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.PhysicsModelType#getRigidBody <em>Rigid Body</em>}</li>
 *   <li>{@link org.khronos.collada.PhysicsModelType#getRigidConstraint <em>Rigid Constraint</em>}</li>
 *   <li>{@link org.khronos.collada.PhysicsModelType#getInstancePhysicsModel <em>Instance Physics Model</em>}</li>
 *   <li>{@link org.khronos.collada.PhysicsModelType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.PhysicsModelType#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.PhysicsModelType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getPhysicsModelType()
 * @model extendedMetaData="name='physics_model_._type' kind='elementOnly'"
 * @generated
 */
public interface PhysicsModelType extends EObject {
	/**
   * Returns the value of the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The physics_model element may contain an asset element.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Asset</em>' containment reference.
   * @see #setAsset(AssetType)
   * @see org.khronos.collada.ColladaPackage#getPhysicsModelType_Asset()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
   * @generated
   */
	AssetType getAsset();

	/**
   * Sets the value of the '{@link org.khronos.collada.PhysicsModelType#getAsset <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asset</em>' containment reference.
   * @see #getAsset()
   * @generated
   */
	void setAsset(AssetType value);

	/**
   * Returns the value of the '<em><b>Rigid Body</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.RigidBodyType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The physics_model may define any number of rigid_body elements.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Rigid Body</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPhysicsModelType_RigidBody()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='rigid_body' namespace='##targetNamespace'"
   * @generated
   */
	EList<RigidBodyType> getRigidBody();

	/**
   * Returns the value of the '<em><b>Rigid Constraint</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.RigidConstraintType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The physics_model may define any number of rigid_constraint elements.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Rigid Constraint</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPhysicsModelType_RigidConstraint()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='rigid_constraint' namespace='##targetNamespace'"
   * @generated
   */
	EList<RigidConstraintType> getRigidConstraint();

	/**
   * Returns the value of the '<em><b>Instance Physics Model</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.InstancePhysicsModelType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The physics_model may instance any number of other physics_model elements.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Physics Model</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPhysicsModelType_InstancePhysicsModel()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_physics_model' namespace='##targetNamespace'"
   * @generated
   */
	EList<InstancePhysicsModelType> getInstancePhysicsModel();

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
   * @see org.khronos.collada.ColladaPackage#getPhysicsModelType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The id attribute is a text string containing the unique identifier of this element. 
   * 					This value must be unique within the instance document. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.khronos.collada.ColladaPackage#getPhysicsModelType_Id()
   * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.khronos.collada.PhysicsModelType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
	void setId(String value);

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
   * @see org.khronos.collada.ColladaPackage#getPhysicsModelType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.PhysicsModelType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // PhysicsModelType
