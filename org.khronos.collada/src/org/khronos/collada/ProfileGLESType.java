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
 * A representation of the model object '<em><b>Profile GLES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.ProfileGLESType#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.ProfileGLESType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.ProfileGLESType#getImage <em>Image</em>}</li>
 *   <li>{@link org.khronos.collada.ProfileGLESType#getNewparam <em>Newparam</em>}</li>
 *   <li>{@link org.khronos.collada.ProfileGLESType#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.ProfileGLESType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.ProfileGLESType#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.ProfileGLESType#getPlatform <em>Platform</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getProfileGLESType()
 * @model extendedMetaData="name='profile_GLES_._type' kind='elementOnly'"
 * @generated
 */
public interface ProfileGLESType extends EObject {
	/**
   * Returns the value of the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The asset element defines asset management information regarding its parent element.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Asset</em>' containment reference.
   * @see #setAsset(AssetType)
   * @see org.khronos.collada.ColladaPackage#getProfileGLESType_Asset()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
   * @generated
   */
	AssetType getAsset();

	/**
   * Sets the value of the '{@link org.khronos.collada.ProfileGLESType#getAsset <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asset</em>' containment reference.
   * @see #getAsset()
   * @generated
   */
	void setAsset(AssetType value);

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
   * @see org.khronos.collada.ColladaPackage#getProfileGLESType_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:1'"
   * @generated
   */
	FeatureMap getGroup();

	/**
   * Returns the value of the '<em><b>Image</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ImageType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The image element declares the storage for the graphical representation of an object. 
   * 			The image element best describes raster image data, but can conceivably handle other 
   * 			forms of imagery. The image elements allows for specifying an external image file with 
   * 			the init_from element or embed image data with the data element.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Image</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getProfileGLESType_Image()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<ImageType> getImage();

	/**
   * Returns the value of the '<em><b>Newparam</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.GlesNewparam}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newparam</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Newparam</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getProfileGLESType_Newparam()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='newparam' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<GlesNewparam> getNewparam();

	/**
   * Returns the value of the '<em><b>Technique</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TechniqueType1}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						Holds a description of the textures, samplers, shaders, parameters, and passes necessary for rendering this effect using one method.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Technique</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getProfileGLESType_Technique()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='technique' namespace='##targetNamespace'"
   * @generated
   */
	EList<TechniqueType1> getTechnique();

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ExtraType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The extra element declares additional information regarding its parent element.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getProfileGLESType_Extra()
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
   * @see org.khronos.collada.ColladaPackage#getProfileGLESType_Id()
   * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.khronos.collada.ProfileGLESType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
	void setId(String value);

	/**
   * Returns the value of the '<em><b>Platform</b></em>' attribute.
   * The default value is <code>"PC"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The type of platform. This is a vendor-defined character string that indicates the platform or capability target for the technique. Optional
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Platform</em>' attribute.
   * @see #isSetPlatform()
   * @see #unsetPlatform()
   * @see #setPlatform(String)
   * @see org.khronos.collada.ColladaPackage#getProfileGLESType_Platform()
   * @model default="PC" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='platform'"
   * @generated
   */
	String getPlatform();

	/**
   * Sets the value of the '{@link org.khronos.collada.ProfileGLESType#getPlatform <em>Platform</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Platform</em>' attribute.
   * @see #isSetPlatform()
   * @see #unsetPlatform()
   * @see #getPlatform()
   * @generated
   */
	void setPlatform(String value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.ProfileGLESType#getPlatform <em>Platform</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetPlatform()
   * @see #getPlatform()
   * @see #setPlatform(String)
   * @generated
   */
	void unsetPlatform();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.ProfileGLESType#getPlatform <em>Platform</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Platform</em>' attribute is set.
   * @see #unsetPlatform()
   * @see #getPlatform()
   * @see #setPlatform(String)
   * @generated
   */
	boolean isSetPlatform();

} // ProfileGLESType
