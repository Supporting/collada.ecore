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
 * A representation of the model object '<em><b>Rigid Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.RigidConstraintType#getRefAttachment <em>Ref Attachment</em>}</li>
 *   <li>{@link org.khronos.collada.RigidConstraintType#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link org.khronos.collada.RigidConstraintType#getTechniqueCommon <em>Technique Common</em>}</li>
 *   <li>{@link org.khronos.collada.RigidConstraintType#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.RigidConstraintType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.RigidConstraintType#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.RigidConstraintType#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getRigidConstraintType()
 * @model extendedMetaData="name='rigid_constraint_._type' kind='elementOnly'"
 * @generated
 */
public interface RigidConstraintType extends EObject {
	/**
   * Returns the value of the '<em><b>Ref Attachment</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						Defines the attachment (to a rigid_body or a node) to be used as the reference-frame.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Ref Attachment</em>' containment reference.
   * @see #setRefAttachment(RefAttachmentType)
   * @see org.khronos.collada.ColladaPackage#getRigidConstraintType_RefAttachment()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='ref_attachment' namespace='##targetNamespace'"
   * @generated
   */
	RefAttachmentType getRefAttachment();

	/**
   * Sets the value of the '{@link org.khronos.collada.RigidConstraintType#getRefAttachment <em>Ref Attachment</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Attachment</em>' containment reference.
   * @see #getRefAttachment()
   * @generated
   */
	void setRefAttachment(RefAttachmentType value);

	/**
   * Returns the value of the '<em><b>Attachment</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						Defines an attachment to a rigid-body or a node.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Attachment</em>' containment reference.
   * @see #setAttachment(AttachmentType)
   * @see org.khronos.collada.ColladaPackage#getRigidConstraintType_Attachment()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='attachment' namespace='##targetNamespace'"
   * @generated
   */
	AttachmentType getAttachment();

	/**
   * Sets the value of the '{@link org.khronos.collada.RigidConstraintType#getAttachment <em>Attachment</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attachment</em>' containment reference.
   * @see #getAttachment()
   * @generated
   */
	void setAttachment(AttachmentType value);

	/**
   * Returns the value of the '<em><b>Technique Common</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The technique_common element specifies the rigid_constraint information for the common profile 
   * 						which all COLLADA implementations need to support.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Technique Common</em>' containment reference.
   * @see #setTechniqueCommon(TechniqueCommonType)
   * @see org.khronos.collada.ColladaPackage#getRigidConstraintType_TechniqueCommon()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='technique_common' namespace='##targetNamespace'"
   * @generated
   */
	TechniqueCommonType getTechniqueCommon();

	/**
   * Sets the value of the '{@link org.khronos.collada.RigidConstraintType#getTechniqueCommon <em>Technique Common</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Technique Common</em>' containment reference.
   * @see #getTechniqueCommon()
   * @generated
   */
	void setTechniqueCommon(TechniqueCommonType value);

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
   * @see org.khronos.collada.ColladaPackage#getRigidConstraintType_Technique()
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
   * @see org.khronos.collada.ColladaPackage#getRigidConstraintType_Extra()
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
   * @see org.khronos.collada.ColladaPackage#getRigidConstraintType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.RigidConstraintType#getName <em>Name</em>}' attribute.
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
   * 					The sid attribute is a text string value containing the sub-identifier of this element. 
   * 					This value must be unique within the scope of the parent element. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sid</em>' attribute.
   * @see #setSid(String)
   * @see org.khronos.collada.ColladaPackage#getRigidConstraintType_Sid()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.RigidConstraintType#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

} // RigidConstraintType
