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
 * A representation of the model object '<em><b>COLLADA Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.COLLADAType#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getLibraryAnimations <em>Library Animations</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getLibraryAnimationClips <em>Library Animation Clips</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getLibraryCameras <em>Library Cameras</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getLibraryControllers <em>Library Controllers</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getLibraryGeometries <em>Library Geometries</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getLibraryEffects <em>Library Effects</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getLibraryForceFields <em>Library Force Fields</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getLibraryImages <em>Library Images</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getLibraryLights <em>Library Lights</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getLibraryMaterials <em>Library Materials</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getLibraryNodes <em>Library Nodes</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getLibraryPhysicsMaterials <em>Library Physics Materials</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getLibraryPhysicsModels <em>Library Physics Models</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getLibraryPhysicsScenes <em>Library Physics Scenes</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getLibraryVisualScenes <em>Library Visual Scenes</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getScene <em>Scene</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getBase <em>Base</em>}</li>
 *   <li>{@link org.khronos.collada.COLLADAType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getCOLLADAType()
 * @model extendedMetaData="name='COLLADA_._type' kind='elementOnly'"
 * @generated
 */
public interface COLLADAType extends EObject {
	/**
   * Returns the value of the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The COLLADA element must contain an asset element.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Asset</em>' containment reference.
   * @see #setAsset(AssetType)
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_Asset()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
   * @generated
   */
	AssetType getAsset();

	/**
   * Sets the value of the '{@link org.khronos.collada.COLLADAType#getAsset <em>Asset</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:1'"
   * @generated
   */
	FeatureMap getGroup();

	/**
   * Returns the value of the '<em><b>Library Animations</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LibraryAnimationsType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The COLLADA element may contain any number of library_animations elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Animations</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_LibraryAnimations()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_animations' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LibraryAnimationsType> getLibraryAnimations();

	/**
   * Returns the value of the '<em><b>Library Animation Clips</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LibraryAnimationClipsType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The COLLADA element may contain any number of library_animation_clips elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Animation Clips</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_LibraryAnimationClips()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_animation_clips' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LibraryAnimationClipsType> getLibraryAnimationClips();

	/**
   * Returns the value of the '<em><b>Library Cameras</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LibraryCamerasType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The COLLADA element may contain any number of library_cameras elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Cameras</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_LibraryCameras()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_cameras' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LibraryCamerasType> getLibraryCameras();

	/**
   * Returns the value of the '<em><b>Library Controllers</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LibraryControllersType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The COLLADA element may contain any number of library_controllerss elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Controllers</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_LibraryControllers()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_controllers' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LibraryControllersType> getLibraryControllers();

	/**
   * Returns the value of the '<em><b>Library Geometries</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LibraryGeometriesType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The COLLADA element may contain any number of library_geometriess elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Geometries</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_LibraryGeometries()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_geometries' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LibraryGeometriesType> getLibraryGeometries();

	/**
   * Returns the value of the '<em><b>Library Effects</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LibraryEffectsType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The COLLADA element may contain any number of library_effects elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Effects</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_LibraryEffects()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_effects' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LibraryEffectsType> getLibraryEffects();

	/**
   * Returns the value of the '<em><b>Library Force Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LibraryForceFieldsType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The COLLADA element may contain any number of library_force_fields elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Force Fields</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_LibraryForceFields()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_force_fields' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LibraryForceFieldsType> getLibraryForceFields();

	/**
   * Returns the value of the '<em><b>Library Images</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LibraryImagesType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The COLLADA element may contain any number of library_images elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Images</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_LibraryImages()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_images' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LibraryImagesType> getLibraryImages();

	/**
   * Returns the value of the '<em><b>Library Lights</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LibraryLightsType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The COLLADA element may contain any number of library_lights elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Lights</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_LibraryLights()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_lights' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LibraryLightsType> getLibraryLights();

	/**
   * Returns the value of the '<em><b>Library Materials</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LibraryMaterialsType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The COLLADA element may contain any number of library_materials elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Materials</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_LibraryMaterials()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_materials' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LibraryMaterialsType> getLibraryMaterials();

	/**
   * Returns the value of the '<em><b>Library Nodes</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LibraryNodesType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The COLLADA element may contain any number of library_nodes elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Nodes</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_LibraryNodes()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_nodes' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LibraryNodesType> getLibraryNodes();

	/**
   * Returns the value of the '<em><b>Library Physics Materials</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LibraryPhysicsMaterialsType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The COLLADA element may contain any number of library_materials elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Physics Materials</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_LibraryPhysicsMaterials()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_physics_materials' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LibraryPhysicsMaterialsType> getLibraryPhysicsMaterials();

	/**
   * Returns the value of the '<em><b>Library Physics Models</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LibraryPhysicsModelsType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The COLLADA element may contain any number of library_physics_models elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Physics Models</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_LibraryPhysicsModels()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_physics_models' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LibraryPhysicsModelsType> getLibraryPhysicsModels();

	/**
   * Returns the value of the '<em><b>Library Physics Scenes</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LibraryPhysicsScenesType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The COLLADA element may contain any number of library_physics_scenes elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Physics Scenes</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_LibraryPhysicsScenes()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_physics_scenes' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LibraryPhysicsScenesType> getLibraryPhysicsScenes();

	/**
   * Returns the value of the '<em><b>Library Visual Scenes</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LibraryVisualScenesType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The COLLADA element may contain any number of library_visual_scenes elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Visual Scenes</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_LibraryVisualScenes()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_visual_scenes' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<LibraryVisualScenesType> getLibraryVisualScenes();

	/**
   * Returns the value of the '<em><b>Scene</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The scene embodies the entire set of information that can be visualized from the 
   * 						contents of a COLLADA resource. The scene element declares the base of the scene 
   * 						hierarchy or scene graph. The scene contains elements that comprise much of the 
   * 						visual and transformational information content as created by the authoring tools.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Scene</em>' containment reference.
   * @see #setScene(SceneType)
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_Scene()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='scene' namespace='##targetNamespace'"
   * @generated
   */
	SceneType getScene();

	/**
   * Sets the value of the '{@link org.khronos.collada.COLLADAType#getScene <em>Scene</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scene</em>' containment reference.
   * @see #getScene()
   * @generated
   */
	void setScene(SceneType value);

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
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The xml:base attribute allows you to define the base URI for this COLLADA document. See
   * 					http://www.w3.org/TR/xmlbase/ for more information.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Base</em>' attribute.
   * @see #setBase(String)
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_Base()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
   *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
   * @generated
   */
	String getBase();

	/**
   * Sets the value of the '{@link org.khronos.collada.COLLADAType#getBase <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' attribute.
   * @see #getBase()
   * @generated
   */
	void setBase(String value);

	/**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * The literals are from the enumeration {@link org.khronos.collada.VersionType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The version attribute is the COLLADA schema revision with which the instance document 
   * 						conforms. Required Attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see org.khronos.collada.VersionType
   * @see #isSetVersion()
   * @see #unsetVersion()
   * @see #setVersion(VersionType)
   * @see org.khronos.collada.ColladaPackage#getCOLLADAType_Version()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='attribute' name='version'"
   * @generated
   */
	VersionType getVersion();

	/**
   * Sets the value of the '{@link org.khronos.collada.COLLADAType#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see org.khronos.collada.VersionType
   * @see #isSetVersion()
   * @see #unsetVersion()
   * @see #getVersion()
   * @generated
   */
	void setVersion(VersionType value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.COLLADAType#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetVersion()
   * @see #getVersion()
   * @see #setVersion(VersionType)
   * @generated
   */
	void unsetVersion();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.COLLADAType#getVersion <em>Version</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Version</em>' attribute is set.
   * @see #unsetVersion()
   * @see #getVersion()
   * @see #setVersion(VersionType)
   * @generated
   */
	boolean isSetVersion();

} // COLLADAType
