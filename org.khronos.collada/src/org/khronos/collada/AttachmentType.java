/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.AttachmentType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.AttachmentType#getTranslate <em>Translate</em>}</li>
 *   <li>{@link org.khronos.collada.AttachmentType#getRotate <em>Rotate</em>}</li>
 *   <li>{@link org.khronos.collada.AttachmentType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.AttachmentType#getRigidBody <em>Rigid Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getAttachmentType()
 * @model extendedMetaData="name='attachment_._type' kind='elementOnly'"
 * @generated
 */
public interface AttachmentType extends EObject {
	/**
   * Returns the value of the '<em><b>Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getAttachmentType_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:0'"
   * @generated
   */
	FeatureMap getGroup();

	/**
   * Returns the value of the '<em><b>Translate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TargetableFloat3}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									Allows you to "position" the attachment point.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Translate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getAttachmentType_Translate()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='translate' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<TargetableFloat3> getTranslate();

	/**
   * Returns the value of the '<em><b>Rotate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.RotateType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									Allows you to "position" the attachment point.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Rotate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getAttachmentType_Rotate()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='rotate' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<RotateType> getRotate();

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
   * @see org.khronos.collada.ColladaPackage#getAttachmentType_Extra()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Rigid Body</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 								The “rigid_body” attribute is a relative reference to a rigid-body within the same physics_model.
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Rigid Body</em>' attribute.
   * @see #setRigidBody(String)
   * @see org.khronos.collada.ColladaPackage#getAttachmentType_RigidBody()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
   *        extendedMetaData="kind='attribute' name='rigid_body'"
   * @generated
   */
	String getRigidBody();

	/**
   * Sets the value of the '{@link org.khronos.collada.AttachmentType#getRigidBody <em>Rigid Body</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rigid Body</em>' attribute.
   * @see #getRigidBody()
   * @generated
   */
	void setRigidBody(String value);

} // AttachmentType
