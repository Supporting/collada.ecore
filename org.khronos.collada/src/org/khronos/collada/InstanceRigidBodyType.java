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
 * A representation of the model object '<em><b>Instance Rigid Body Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.InstanceRigidBodyType#getTechniqueCommon <em>Technique Common</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceRigidBodyType#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceRigidBodyType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceRigidBodyType#getBody <em>Body</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceRigidBodyType#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceRigidBodyType#getSid <em>Sid</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceRigidBodyType#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getInstanceRigidBodyType()
 * @model extendedMetaData="name='instance_rigid_body_._type' kind='elementOnly'"
 * @generated
 */
public interface InstanceRigidBodyType extends EObject {
	/**
   * Returns the value of the '<em><b>Technique Common</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The technique_common element specifies the instance_rigid_body information for the common 
   * 						profile which all COLLADA implementations need to support.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Technique Common</em>' containment reference.
   * @see #setTechniqueCommon(TechniqueCommonType6)
   * @see org.khronos.collada.ColladaPackage#getInstanceRigidBodyType_TechniqueCommon()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='technique_common' namespace='##targetNamespace'"
   * @generated
   */
	TechniqueCommonType6 getTechniqueCommon();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstanceRigidBodyType#getTechniqueCommon <em>Technique Common</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Technique Common</em>' containment reference.
   * @see #getTechniqueCommon()
   * @generated
   */
	void setTechniqueCommon(TechniqueCommonType6 value);

	/**
   * Returns the value of the '<em><b>Technique</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TechniqueType4}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						This element may contain any number of non-common profile techniques.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Technique</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getInstanceRigidBodyType_Technique()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='technique' namespace='##targetNamespace'"
   * @generated
   */
	EList<TechniqueType4> getTechnique();

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
   * @see org.khronos.collada.ColladaPackage#getInstanceRigidBodyType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The body attribute indicates which rigid_body to instantiate. Required attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Body</em>' attribute.
   * @see #setBody(String)
   * @see org.khronos.collada.ColladaPackage#getInstanceRigidBodyType_Body()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='body'"
   * @generated
   */
	String getBody();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstanceRigidBodyType#getBody <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' attribute.
   * @see #getBody()
   * @generated
   */
	void setBody(String value);

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
   * @see org.khronos.collada.ColladaPackage#getInstanceRigidBodyType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstanceRigidBodyType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

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
   * @see org.khronos.collada.ColladaPackage#getInstanceRigidBodyType_Sid()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstanceRigidBodyType#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

	/**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The target attribute indicates which node is influenced by this rigid_body instance. 
   * 					Required attribute
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see org.khronos.collada.ColladaPackage#getInstanceRigidBodyType_Target()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
   *        extendedMetaData="kind='attribute' name='target'"
   * @generated
   */
	String getTarget();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstanceRigidBodyType#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
	void setTarget(String value);

} // InstanceRigidBodyType
