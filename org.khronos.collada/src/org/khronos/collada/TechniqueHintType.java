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
 * A representation of the model object '<em><b>Technique Hint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TechniqueHintType#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueHintType#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueHintType#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTechniqueHintType()
 * @model extendedMetaData="name='technique_hint_._type' kind='empty'"
 * @generated
 */
public interface TechniqueHintType extends EObject {
	/**
   * Returns the value of the '<em><b>Platform</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 								A platform defines a string that specifies which platform this is hint is aimed for.
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Platform</em>' attribute.
   * @see #setPlatform(String)
   * @see org.khronos.collada.ColladaPackage#getTechniqueHintType_Platform()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='platform'"
   * @generated
   */
	String getPlatform();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueHintType#getPlatform <em>Platform</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Platform</em>' attribute.
   * @see #getPlatform()
   * @generated
   */
	void setPlatform(String value);

	/**
   * Returns the value of the '<em><b>Profile</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 								A profile defines a string that specifies which API profile this is hint is aimed for.
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Profile</em>' attribute.
   * @see #setProfile(String)
   * @see org.khronos.collada.ColladaPackage#getTechniqueHintType_Profile()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='profile'"
   * @generated
   */
	String getProfile();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueHintType#getProfile <em>Profile</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profile</em>' attribute.
   * @see #getProfile()
   * @generated
   */
	void setProfile(String value);

	/**
   * Returns the value of the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 								A reference to the technique to use for the specified platform.
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Ref</em>' attribute.
   * @see #setRef(String)
   * @see org.khronos.collada.ColladaPackage#getTechniqueHintType_Ref()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='ref'"
   * @generated
   */
	String getRef();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueHintType#getRef <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' attribute.
   * @see #getRef()
   * @generated
   */
	void setRef(String value);

} // TechniqueHintType
