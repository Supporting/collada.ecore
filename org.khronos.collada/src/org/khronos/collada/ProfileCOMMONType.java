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
 * A representation of the model object '<em><b>Profile COMMON Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.ProfileCOMMONType#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.ProfileCOMMONType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.ProfileCOMMONType#getImage <em>Image</em>}</li>
 *   <li>{@link org.khronos.collada.ProfileCOMMONType#getNewparam <em>Newparam</em>}</li>
 *   <li>{@link org.khronos.collada.ProfileCOMMONType#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.ProfileCOMMONType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.ProfileCOMMONType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getProfileCOMMONType()
 * @model extendedMetaData="name='profile_COMMON_._type' kind='elementOnly'"
 * @generated
 */
public interface ProfileCOMMONType extends EObject {
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
   * @see org.khronos.collada.ColladaPackage#getProfileCOMMONType_Asset()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
   * @generated
   */
	AssetType getAsset();

	/**
   * Sets the value of the '{@link org.khronos.collada.ProfileCOMMONType#getAsset <em>Asset</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getProfileCOMMONType_Group()
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
   * @see org.khronos.collada.ColladaPackage#getProfileCOMMONType_Image()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<ImageType> getImage();

	/**
   * Returns the value of the '<em><b>Newparam</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CommonNewparamType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newparam</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Newparam</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getProfileCOMMONType_Newparam()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='newparam' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<CommonNewparamType> getNewparam();

	/**
   * Returns the value of the '<em><b>Technique</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						Holds a description of the textures, samplers, shaders, parameters, and passes necessary for rendering this effect using one method.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Technique</em>' containment reference.
   * @see #setTechnique(TechniqueType2)
   * @see org.khronos.collada.ColladaPackage#getProfileCOMMONType_Technique()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='technique' namespace='##targetNamespace'"
   * @generated
   */
	TechniqueType2 getTechnique();

	/**
   * Sets the value of the '{@link org.khronos.collada.ProfileCOMMONType#getTechnique <em>Technique</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Technique</em>' containment reference.
   * @see #getTechnique()
   * @generated
   */
	void setTechnique(TechniqueType2 value);

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
   * @see org.khronos.collada.ColladaPackage#getProfileCOMMONType_Extra()
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
   * @see org.khronos.collada.ColladaPackage#getProfileCOMMONType_Id()
   * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.khronos.collada.ProfileCOMMONType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
	void setId(String value);

} // ProfileCOMMONType
