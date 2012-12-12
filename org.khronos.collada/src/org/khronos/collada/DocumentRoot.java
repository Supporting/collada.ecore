/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getAnimation <em>Animation</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getAnimationClip <em>Animation Clip</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getBindMaterial <em>Bind Material</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getBoolArray <em>Bool Array</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getBox <em>Box</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getCamera <em>Camera</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getCapsule <em>Capsule</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getCOLLADA <em>COLLADA</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getController <em>Controller</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getConvexMesh <em>Convex Mesh</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getEllipsoid <em>Ellipsoid</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getFloatArray <em>Float Array</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getForceField <em>Force Field</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getFxProfileAbstract <em>Fx Profile Abstract</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getGlHookAbstract <em>Gl Hook Abstract</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getIDREFArray <em>IDREF Array</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getImage <em>Image</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getInstanceCamera <em>Instance Camera</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getInstanceController <em>Instance Controller</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getInstanceEffect <em>Instance Effect</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getInstanceForceField <em>Instance Force Field</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getInstanceGeometry <em>Instance Geometry</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getInstanceLight <em>Instance Light</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getInstanceMaterial <em>Instance Material</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getInstanceNode <em>Instance Node</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getInstancePhysicsMaterial <em>Instance Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getInstancePhysicsModel <em>Instance Physics Model</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getInstanceRigidBody <em>Instance Rigid Body</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getInstanceRigidConstraint <em>Instance Rigid Constraint</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getIntArray <em>Int Array</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLibraryAnimationClips <em>Library Animation Clips</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLibraryAnimations <em>Library Animations</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLibraryCameras <em>Library Cameras</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLibraryControllers <em>Library Controllers</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLibraryEffects <em>Library Effects</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLibraryForceFields <em>Library Force Fields</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLibraryGeometries <em>Library Geometries</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLibraryImages <em>Library Images</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLibraryLights <em>Library Lights</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLibraryMaterials <em>Library Materials</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLibraryNodes <em>Library Nodes</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLibraryPhysicsMaterials <em>Library Physics Materials</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLibraryPhysicsModels <em>Library Physics Models</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLibraryPhysicsScenes <em>Library Physics Scenes</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLibraryVisualScenes <em>Library Visual Scenes</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLight <em>Light</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLines <em>Lines</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLinestrips <em>Linestrips</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getLookat <em>Lookat</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getMesh <em>Mesh</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getMorph <em>Morph</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getNameArray <em>Name Array</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getNode <em>Node</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getP <em>P</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getPhysicsMaterial <em>Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getPhysicsModel <em>Physics Model</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getPhysicsScene <em>Physics Scene</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getPolygons <em>Polygons</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getPolylist <em>Polylist</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getProfileCG <em>Profile CG</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getProfileCOMMON <em>Profile COMMON</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getProfileGLES <em>Profile GLES</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getProfileGLSL <em>Profile GLSL</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getRigidBody <em>Rigid Body</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getRigidConstraint <em>Rigid Constraint</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getRotate <em>Rotate</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getSampler <em>Sampler</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getScale <em>Scale</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getSkew <em>Skew</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getSkin <em>Skin</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getSphere <em>Sphere</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getSpline <em>Spline</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getTaperedCapsule <em>Tapered Capsule</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getTaperedCylinder <em>Tapered Cylinder</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getTranslate <em>Translate</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getTriangles <em>Triangles</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getTrifans <em>Trifans</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getTristrips <em>Tristrips</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getVertices <em>Vertices</em>}</li>
 *   <li>{@link org.khronos.collada.DocumentRoot#getVisualScene <em>Visual Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
   * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mixed</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Mixed()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='elementWildcard' name=':mixed'"
   * @generated
   */
	FeatureMap getMixed();

	/**
   * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>XMLNS Prefix Map</em>' map.
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_XMLNSPrefixMap()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
   *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
   * @generated
   */
	EMap<String, String> getXMLNSPrefixMap();

	/**
   * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>XSI Schema Location</em>' map.
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_XSISchemaLocation()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
   *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
   * @generated
   */
	EMap<String, String> getXSISchemaLocation();

	/**
   * Returns the value of the '<em><b>Accessor</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The accessor element declares an access pattern to one of the array elements: float_array, 
   * 			int_array, Name_array, bool_array, and IDREF_array. The accessor element describes access 
   * 			to arrays that are organized in either an interleaved or non-interleaved manner, depending 
   * 			on the offset and stride attributes.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Accessor</em>' containment reference.
   * @see #setAccessor(AccessorType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Accessor()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='accessor' namespace='##targetNamespace'"
   * @generated
   */
	AccessorType getAccessor();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getAccessor <em>Accessor</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accessor</em>' containment reference.
   * @see #getAccessor()
   * @generated
   */
	void setAccessor(AccessorType value);

	/**
   * Returns the value of the '<em><b>Animation</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The animation element categorizes the declaration of animation information. The animation 
   * 			hierarchy contains elements that describe the animation’s key-frame data and sampler functions, 
   * 			ordered in such a way to group together animations that should be executed together.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Animation</em>' containment reference.
   * @see #setAnimation(AnimationType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Animation()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='animation' namespace='##targetNamespace'"
   * @generated
   */
	AnimationType getAnimation();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getAnimation <em>Animation</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Animation</em>' containment reference.
   * @see #getAnimation()
   * @generated
   */
	void setAnimation(AnimationType value);

	/**
   * Returns the value of the '<em><b>Animation Clip</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The animation_clip element defines a section of the animation curves to be used together as 
   * 			an animation clip.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Animation Clip</em>' containment reference.
   * @see #setAnimationClip(AnimationClipType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_AnimationClip()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='animation_clip' namespace='##targetNamespace'"
   * @generated
   */
	AnimationClipType getAnimationClip();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getAnimationClip <em>Animation Clip</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Animation Clip</em>' containment reference.
   * @see #getAnimationClip()
   * @generated
   */
	void setAnimationClip(AnimationClipType value);

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
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Asset()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
   * @generated
   */
	AssetType getAsset();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getAsset <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asset</em>' containment reference.
   * @see #getAsset()
   * @generated
   */
	void setAsset(AssetType value);

	/**
   * Returns the value of the '<em><b>Bind Material</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			Bind a specific material to a piece of geometry, binding varying and uniform parameters at the 
   * 			same time.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Bind Material</em>' containment reference.
   * @see #setBindMaterial(BindMaterialType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_BindMaterial()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bind_material' namespace='##targetNamespace'"
   * @generated
   */
	BindMaterialType getBindMaterial();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getBindMaterial <em>Bind Material</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bind Material</em>' containment reference.
   * @see #getBindMaterial()
   * @generated
   */
	void setBindMaterial(BindMaterialType value);

	/**
   * Returns the value of the '<em><b>Bool Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The bool_array element declares the storage for a homogenous array of boolean values.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Bool Array</em>' containment reference.
   * @see #setBoolArray(BoolArrayType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_BoolArray()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='bool_array' namespace='##targetNamespace'"
   * @generated
   */
	BoolArrayType getBoolArray();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getBoolArray <em>Bool Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool Array</em>' containment reference.
   * @see #getBoolArray()
   * @generated
   */
	void setBoolArray(BoolArrayType value);

	/**
   * Returns the value of the '<em><b>Box</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			An axis-aligned, centered box primitive.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Box</em>' containment reference.
   * @see #setBox(BoxType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Box()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='box' namespace='##targetNamespace'"
   * @generated
   */
	BoxType getBox();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getBox <em>Box</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Box</em>' containment reference.
   * @see #getBox()
   * @generated
   */
	void setBox(BoxType value);

	/**
   * Returns the value of the '<em><b>Camera</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The camera element declares a view into the scene hierarchy or scene graph. The camera contains 
   * 			elements that describe the camera’s optics and imager.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Camera</em>' containment reference.
   * @see #setCamera(CameraType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Camera()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='camera' namespace='##targetNamespace'"
   * @generated
   */
	CameraType getCamera();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getCamera <em>Camera</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Camera</em>' containment reference.
   * @see #getCamera()
   * @generated
   */
	void setCamera(CameraType value);

	/**
   * Returns the value of the '<em><b>Capsule</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			A capsule primitive that is centered on and aligned with the local Y axis.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Capsule</em>' containment reference.
   * @see #setCapsule(CapsuleType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Capsule()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='capsule' namespace='##targetNamespace'"
   * @generated
   */
	CapsuleType getCapsule();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getCapsule <em>Capsule</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Capsule</em>' containment reference.
   * @see #getCapsule()
   * @generated
   */
	void setCapsule(CapsuleType value);

	/**
   * Returns the value of the '<em><b>Channel</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The channel element declares an output channel of an animation.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Channel</em>' containment reference.
   * @see #setChannel(ChannelType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Channel()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='channel' namespace='##targetNamespace'"
   * @generated
   */
	ChannelType getChannel();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getChannel <em>Channel</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Channel</em>' containment reference.
   * @see #getChannel()
   * @generated
   */
	void setChannel(ChannelType value);

	/**
   * Returns the value of the '<em><b>COLLADA</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The COLLADA element declares the root of the document that comprises some of the content 
   * 			in the COLLADA schema.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>COLLADA</em>' containment reference.
   * @see #setCOLLADA(COLLADAType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_COLLADA()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='COLLADA' namespace='##targetNamespace'"
   * @generated
   */
	COLLADAType getCOLLADA();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getCOLLADA <em>COLLADA</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>COLLADA</em>' containment reference.
   * @see #getCOLLADA()
   * @generated
   */
	void setCOLLADA(COLLADAType value);

	/**
   * Returns the value of the '<em><b>Controller</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The controller element categorizes the declaration of generic control information.
   * 			A controller is a device or mechanism that manages and directs the operations of another object.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Controller</em>' containment reference.
   * @see #setController(ControllerType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Controller()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='controller' namespace='##targetNamespace'"
   * @generated
   */
	ControllerType getController();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getController <em>Controller</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Controller</em>' containment reference.
   * @see #getController()
   * @generated
   */
	void setController(ControllerType value);

	/**
   * Returns the value of the '<em><b>Convex Mesh</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The definition of the convex_mesh element is identical to the mesh element with the exception that 
   * 			instead of a complete description (source, vertices, polygons etc.), it may simply point to another 
   * 			geometry to derive its shape. The latter case means that the convex hull of that geometry should 
   * 			be computed and is indicated by the optional “convex_hull_of” attribute.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Convex Mesh</em>' containment reference.
   * @see #setConvexMesh(ConvexMeshType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_ConvexMesh()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='convex_mesh' namespace='##targetNamespace'"
   * @generated
   */
	ConvexMeshType getConvexMesh();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getConvexMesh <em>Convex Mesh</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Convex Mesh</em>' containment reference.
   * @see #getConvexMesh()
   * @generated
   */
	void setConvexMesh(ConvexMeshType value);

	/**
   * Returns the value of the '<em><b>Cylinder</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			A cylinder primitive that is centered on, and aligned with. the local Y axis.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Cylinder</em>' containment reference.
   * @see #setCylinder(CylinderType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Cylinder()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='cylinder' namespace='##targetNamespace'"
   * @generated
   */
	CylinderType getCylinder();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getCylinder <em>Cylinder</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cylinder</em>' containment reference.
   * @see #getCylinder()
   * @generated
   */
	void setCylinder(CylinderType value);

	/**
   * Returns the value of the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			A self contained description of a shader effect.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Effect</em>' containment reference.
   * @see #setEffect(EffectType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Effect()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='effect' namespace='##targetNamespace'"
   * @generated
   */
	EffectType getEffect();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getEffect <em>Effect</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effect</em>' containment reference.
   * @see #getEffect()
   * @generated
   */
	void setEffect(EffectType value);

	/**
   * Returns the value of the '<em><b>Ellipsoid</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ellipsoid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Ellipsoid</em>' containment reference.
   * @see #setEllipsoid(EllipsoidType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Ellipsoid()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ellipsoid' namespace='##targetNamespace'"
   * @generated
   */
	EllipsoidType getEllipsoid();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getEllipsoid <em>Ellipsoid</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ellipsoid</em>' containment reference.
   * @see #getEllipsoid()
   * @generated
   */
	void setEllipsoid(EllipsoidType value);

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The extra element declares additional information regarding its parent element.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference.
   * @see #setExtra(ExtraType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Extra()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	ExtraType getExtra();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getExtra <em>Extra</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extra</em>' containment reference.
   * @see #getExtra()
   * @generated
   */
	void setExtra(ExtraType value);

	/**
   * Returns the value of the '<em><b>Float Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The float_array element declares the storage for a homogenous array of floating point values.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Float Array</em>' containment reference.
   * @see #setFloatArray(FloatArrayType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_FloatArray()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='float_array' namespace='##targetNamespace'"
   * @generated
   */
	FloatArrayType getFloatArray();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getFloatArray <em>Float Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float Array</em>' containment reference.
   * @see #getFloatArray()
   * @generated
   */
	void setFloatArray(FloatArrayType value);

	/**
   * Returns the value of the '<em><b>Force Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			A general container for force-fields. At the moment, it only has techniques and extra elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Force Field</em>' containment reference.
   * @see #setForceField(ForceFieldType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_ForceField()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='force_field' namespace='##targetNamespace'"
   * @generated
   */
	ForceFieldType getForceField();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getForceField <em>Force Field</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Force Field</em>' containment reference.
   * @see #getForceField()
   * @generated
   */
	void setForceField(ForceFieldType value);

	/**
   * Returns the value of the '<em><b>Fx Profile Abstract</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The fx_profile_abstract element is only used as a substitution group hook for COLLADA FX profiles.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Fx Profile Abstract</em>' containment reference.
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_FxProfileAbstract()
   * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fx_profile_abstract' namespace='##targetNamespace'"
   * @generated
   */
	EObject getFxProfileAbstract();

	/**
   * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			Geometry describes the visual shape and appearance of an object in the scene.
   * 			The geometry element categorizes the declaration of geometric information. Geometry is a 
   * 			branch of mathematics that deals with the measurement, properties, and relationships of 
   * 			points, lines, angles, surfaces, and solids.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Geometry</em>' containment reference.
   * @see #setGeometry(GeometryType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Geometry()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='geometry' namespace='##targetNamespace'"
   * @generated
   */
	GeometryType getGeometry();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getGeometry <em>Geometry</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Geometry</em>' containment reference.
   * @see #getGeometry()
   * @generated
   */
	void setGeometry(GeometryType value);

	/**
   * Returns the value of the '<em><b>Gl Hook Abstract</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Hook Abstract</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Gl Hook Abstract</em>' containment reference.
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_GlHookAbstract()
   * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='gl_hook_abstract' namespace='##targetNamespace'"
   * @generated
   */
	EObject getGlHookAbstract();

	/**
   * Returns the value of the '<em><b>IDREF Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The IDREF_array element declares the storage for a homogenous array of ID reference values.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>IDREF Array</em>' containment reference.
   * @see #setIDREFArray(IDREFArrayType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_IDREFArray()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='IDREF_array' namespace='##targetNamespace'"
   * @generated
   */
	IDREFArrayType getIDREFArray();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getIDREFArray <em>IDREF Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>IDREF Array</em>' containment reference.
   * @see #getIDREFArray()
   * @generated
   */
	void setIDREFArray(IDREFArrayType value);

	/**
   * Returns the value of the '<em><b>Image</b></em>' containment reference.
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
   * @return the value of the '<em>Image</em>' containment reference.
   * @see #setImage(ImageType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Image()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace'"
   * @generated
   */
	ImageType getImage();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getImage <em>Image</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' containment reference.
   * @see #getImage()
   * @generated
   */
	void setImage(ImageType value);

	/**
   * Returns the value of the '<em><b>Instance Camera</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The instance_camera element declares the instantiation of a COLLADA camera resource.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Camera</em>' containment reference.
   * @see #setInstanceCamera(InstanceWithExtra)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_InstanceCamera()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='instance_camera' namespace='##targetNamespace'"
   * @generated
   */
	InstanceWithExtra getInstanceCamera();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getInstanceCamera <em>Instance Camera</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Camera</em>' containment reference.
   * @see #getInstanceCamera()
   * @generated
   */
	void setInstanceCamera(InstanceWithExtra value);

	/**
   * Returns the value of the '<em><b>Instance Controller</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The instance_controller element declares the instantiation of a COLLADA controller resource.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Controller</em>' containment reference.
   * @see #setInstanceController(InstanceControllerType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_InstanceController()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='instance_controller' namespace='##targetNamespace'"
   * @generated
   */
	InstanceControllerType getInstanceController();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getInstanceController <em>Instance Controller</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Controller</em>' containment reference.
   * @see #getInstanceController()
   * @generated
   */
	void setInstanceController(InstanceControllerType value);

	/**
   * Returns the value of the '<em><b>Instance Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The instance_effect element declares the instantiation of a COLLADA effect resource.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Effect</em>' containment reference.
   * @see #setInstanceEffect(InstanceEffectType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_InstanceEffect()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='instance_effect' namespace='##targetNamespace'"
   * @generated
   */
	InstanceEffectType getInstanceEffect();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getInstanceEffect <em>Instance Effect</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Effect</em>' containment reference.
   * @see #getInstanceEffect()
   * @generated
   */
	void setInstanceEffect(InstanceEffectType value);

	/**
   * Returns the value of the '<em><b>Instance Force Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The instance_force_field element declares the instantiation of a COLLADA force_field resource.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Force Field</em>' containment reference.
   * @see #setInstanceForceField(InstanceWithExtra)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_InstanceForceField()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='instance_force_field' namespace='##targetNamespace'"
   * @generated
   */
	InstanceWithExtra getInstanceForceField();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getInstanceForceField <em>Instance Force Field</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Force Field</em>' containment reference.
   * @see #getInstanceForceField()
   * @generated
   */
	void setInstanceForceField(InstanceWithExtra value);

	/**
   * Returns the value of the '<em><b>Instance Geometry</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The instance_geometry element declares the instantiation of a COLLADA geometry resource.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Geometry</em>' containment reference.
   * @see #setInstanceGeometry(InstanceGeometryType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_InstanceGeometry()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='instance_geometry' namespace='##targetNamespace'"
   * @generated
   */
	InstanceGeometryType getInstanceGeometry();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getInstanceGeometry <em>Instance Geometry</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Geometry</em>' containment reference.
   * @see #getInstanceGeometry()
   * @generated
   */
	void setInstanceGeometry(InstanceGeometryType value);

	/**
   * Returns the value of the '<em><b>Instance Light</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The instance_light element declares the instantiation of a COLLADA light resource.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Light</em>' containment reference.
   * @see #setInstanceLight(InstanceWithExtra)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_InstanceLight()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='instance_light' namespace='##targetNamespace'"
   * @generated
   */
	InstanceWithExtra getInstanceLight();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getInstanceLight <em>Instance Light</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Light</em>' containment reference.
   * @see #getInstanceLight()
   * @generated
   */
	void setInstanceLight(InstanceWithExtra value);

	/**
   * Returns the value of the '<em><b>Instance Material</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The instance_material element declares the instantiation of a COLLADA material resource.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Material</em>' containment reference.
   * @see #setInstanceMaterial(InstanceMaterialType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_InstanceMaterial()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='instance_material' namespace='##targetNamespace'"
   * @generated
   */
	InstanceMaterialType getInstanceMaterial();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getInstanceMaterial <em>Instance Material</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Material</em>' containment reference.
   * @see #getInstanceMaterial()
   * @generated
   */
	void setInstanceMaterial(InstanceMaterialType value);

	/**
   * Returns the value of the '<em><b>Instance Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The instance_node element declares the instantiation of a COLLADA node resource.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Node</em>' containment reference.
   * @see #setInstanceNode(InstanceWithExtra)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_InstanceNode()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='instance_node' namespace='##targetNamespace'"
   * @generated
   */
	InstanceWithExtra getInstanceNode();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getInstanceNode <em>Instance Node</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Node</em>' containment reference.
   * @see #getInstanceNode()
   * @generated
   */
	void setInstanceNode(InstanceWithExtra value);

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
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_InstancePhysicsMaterial()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='instance_physics_material' namespace='##targetNamespace'"
   * @generated
   */
	InstanceWithExtra getInstancePhysicsMaterial();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getInstancePhysicsMaterial <em>Instance Physics Material</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Physics Material</em>' containment reference.
   * @see #getInstancePhysicsMaterial()
   * @generated
   */
	void setInstancePhysicsMaterial(InstanceWithExtra value);

	/**
   * Returns the value of the '<em><b>Instance Physics Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			This element allows instancing physics model within another physics model, or in a physics scene.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Physics Model</em>' containment reference.
   * @see #setInstancePhysicsModel(InstancePhysicsModelType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_InstancePhysicsModel()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='instance_physics_model' namespace='##targetNamespace'"
   * @generated
   */
	InstancePhysicsModelType getInstancePhysicsModel();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getInstancePhysicsModel <em>Instance Physics Model</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Physics Model</em>' containment reference.
   * @see #getInstancePhysicsModel()
   * @generated
   */
	void setInstancePhysicsModel(InstancePhysicsModelType value);

	/**
   * Returns the value of the '<em><b>Instance Rigid Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			This element allows instancing a rigid_body within an instance_physics_model. 
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Rigid Body</em>' containment reference.
   * @see #setInstanceRigidBody(InstanceRigidBodyType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_InstanceRigidBody()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='instance_rigid_body' namespace='##targetNamespace'"
   * @generated
   */
	InstanceRigidBodyType getInstanceRigidBody();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getInstanceRigidBody <em>Instance Rigid Body</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Rigid Body</em>' containment reference.
   * @see #getInstanceRigidBody()
   * @generated
   */
	void setInstanceRigidBody(InstanceRigidBodyType value);

	/**
   * Returns the value of the '<em><b>Instance Rigid Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			This element allows instancing a rigid_constraint within an instance_physics_model. 
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Rigid Constraint</em>' containment reference.
   * @see #setInstanceRigidConstraint(InstanceRigidConstraintType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_InstanceRigidConstraint()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='instance_rigid_constraint' namespace='##targetNamespace'"
   * @generated
   */
	InstanceRigidConstraintType getInstanceRigidConstraint();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getInstanceRigidConstraint <em>Instance Rigid Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Rigid Constraint</em>' containment reference.
   * @see #getInstanceRigidConstraint()
   * @generated
   */
	void setInstanceRigidConstraint(InstanceRigidConstraintType value);

	/**
   * Returns the value of the '<em><b>Int Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The int_array element declares the storage for a homogenous array of integer values.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Int Array</em>' containment reference.
   * @see #setIntArray(IntArrayType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_IntArray()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='int_array' namespace='##targetNamespace'"
   * @generated
   */
	IntArrayType getIntArray();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getIntArray <em>Int Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Array</em>' containment reference.
   * @see #getIntArray()
   * @generated
   */
	void setIntArray(IntArrayType value);

	/**
   * Returns the value of the '<em><b>Library Animation Clips</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The library_animation_clips element declares a module of animation_clip elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Animation Clips</em>' containment reference.
   * @see #setLibraryAnimationClips(LibraryAnimationClipsType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_LibraryAnimationClips()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_animation_clips' namespace='##targetNamespace'"
   * @generated
   */
	LibraryAnimationClipsType getLibraryAnimationClips();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLibraryAnimationClips <em>Library Animation Clips</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Animation Clips</em>' containment reference.
   * @see #getLibraryAnimationClips()
   * @generated
   */
	void setLibraryAnimationClips(LibraryAnimationClipsType value);

	/**
   * Returns the value of the '<em><b>Library Animations</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The library_animations element declares a module of animation elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Animations</em>' containment reference.
   * @see #setLibraryAnimations(LibraryAnimationsType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_LibraryAnimations()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_animations' namespace='##targetNamespace'"
   * @generated
   */
	LibraryAnimationsType getLibraryAnimations();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLibraryAnimations <em>Library Animations</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Animations</em>' containment reference.
   * @see #getLibraryAnimations()
   * @generated
   */
	void setLibraryAnimations(LibraryAnimationsType value);

	/**
   * Returns the value of the '<em><b>Library Cameras</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The library_cameras element declares a module of camera elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Cameras</em>' containment reference.
   * @see #setLibraryCameras(LibraryCamerasType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_LibraryCameras()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_cameras' namespace='##targetNamespace'"
   * @generated
   */
	LibraryCamerasType getLibraryCameras();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLibraryCameras <em>Library Cameras</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Cameras</em>' containment reference.
   * @see #getLibraryCameras()
   * @generated
   */
	void setLibraryCameras(LibraryCamerasType value);

	/**
   * Returns the value of the '<em><b>Library Controllers</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The library_controllers element declares a module of controller elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Controllers</em>' containment reference.
   * @see #setLibraryControllers(LibraryControllersType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_LibraryControllers()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_controllers' namespace='##targetNamespace'"
   * @generated
   */
	LibraryControllersType getLibraryControllers();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLibraryControllers <em>Library Controllers</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Controllers</em>' containment reference.
   * @see #getLibraryControllers()
   * @generated
   */
	void setLibraryControllers(LibraryControllersType value);

	/**
   * Returns the value of the '<em><b>Library Effects</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The library_effects element declares a module of effect elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Effects</em>' containment reference.
   * @see #setLibraryEffects(LibraryEffectsType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_LibraryEffects()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_effects' namespace='##targetNamespace'"
   * @generated
   */
	LibraryEffectsType getLibraryEffects();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLibraryEffects <em>Library Effects</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Effects</em>' containment reference.
   * @see #getLibraryEffects()
   * @generated
   */
	void setLibraryEffects(LibraryEffectsType value);

	/**
   * Returns the value of the '<em><b>Library Force Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The library_force_fields element declares a module of force_field elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Force Fields</em>' containment reference.
   * @see #setLibraryForceFields(LibraryForceFieldsType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_LibraryForceFields()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_force_fields' namespace='##targetNamespace'"
   * @generated
   */
	LibraryForceFieldsType getLibraryForceFields();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLibraryForceFields <em>Library Force Fields</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Force Fields</em>' containment reference.
   * @see #getLibraryForceFields()
   * @generated
   */
	void setLibraryForceFields(LibraryForceFieldsType value);

	/**
   * Returns the value of the '<em><b>Library Geometries</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The library_geometries element declares a module of geometry elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Geometries</em>' containment reference.
   * @see #setLibraryGeometries(LibraryGeometriesType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_LibraryGeometries()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_geometries' namespace='##targetNamespace'"
   * @generated
   */
	LibraryGeometriesType getLibraryGeometries();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLibraryGeometries <em>Library Geometries</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Geometries</em>' containment reference.
   * @see #getLibraryGeometries()
   * @generated
   */
	void setLibraryGeometries(LibraryGeometriesType value);

	/**
   * Returns the value of the '<em><b>Library Images</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The library_images element declares a module of image elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Images</em>' containment reference.
   * @see #setLibraryImages(LibraryImagesType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_LibraryImages()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_images' namespace='##targetNamespace'"
   * @generated
   */
	LibraryImagesType getLibraryImages();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLibraryImages <em>Library Images</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Images</em>' containment reference.
   * @see #getLibraryImages()
   * @generated
   */
	void setLibraryImages(LibraryImagesType value);

	/**
   * Returns the value of the '<em><b>Library Lights</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The library_lights element declares a module of light elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Lights</em>' containment reference.
   * @see #setLibraryLights(LibraryLightsType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_LibraryLights()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_lights' namespace='##targetNamespace'"
   * @generated
   */
	LibraryLightsType getLibraryLights();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLibraryLights <em>Library Lights</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Lights</em>' containment reference.
   * @see #getLibraryLights()
   * @generated
   */
	void setLibraryLights(LibraryLightsType value);

	/**
   * Returns the value of the '<em><b>Library Materials</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The library_materials element declares a module of material elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Materials</em>' containment reference.
   * @see #setLibraryMaterials(LibraryMaterialsType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_LibraryMaterials()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_materials' namespace='##targetNamespace'"
   * @generated
   */
	LibraryMaterialsType getLibraryMaterials();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLibraryMaterials <em>Library Materials</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Materials</em>' containment reference.
   * @see #getLibraryMaterials()
   * @generated
   */
	void setLibraryMaterials(LibraryMaterialsType value);

	/**
   * Returns the value of the '<em><b>Library Nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The library_nodes element declares a module of node elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Nodes</em>' containment reference.
   * @see #setLibraryNodes(LibraryNodesType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_LibraryNodes()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_nodes' namespace='##targetNamespace'"
   * @generated
   */
	LibraryNodesType getLibraryNodes();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLibraryNodes <em>Library Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Nodes</em>' containment reference.
   * @see #getLibraryNodes()
   * @generated
   */
	void setLibraryNodes(LibraryNodesType value);

	/**
   * Returns the value of the '<em><b>Library Physics Materials</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The library_physics_materials element declares a module of physics_material elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Physics Materials</em>' containment reference.
   * @see #setLibraryPhysicsMaterials(LibraryPhysicsMaterialsType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_LibraryPhysicsMaterials()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_physics_materials' namespace='##targetNamespace'"
   * @generated
   */
	LibraryPhysicsMaterialsType getLibraryPhysicsMaterials();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLibraryPhysicsMaterials <em>Library Physics Materials</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Physics Materials</em>' containment reference.
   * @see #getLibraryPhysicsMaterials()
   * @generated
   */
	void setLibraryPhysicsMaterials(LibraryPhysicsMaterialsType value);

	/**
   * Returns the value of the '<em><b>Library Physics Models</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The library_physics_models element declares a module of physics_model elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Physics Models</em>' containment reference.
   * @see #setLibraryPhysicsModels(LibraryPhysicsModelsType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_LibraryPhysicsModels()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_physics_models' namespace='##targetNamespace'"
   * @generated
   */
	LibraryPhysicsModelsType getLibraryPhysicsModels();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLibraryPhysicsModels <em>Library Physics Models</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Physics Models</em>' containment reference.
   * @see #getLibraryPhysicsModels()
   * @generated
   */
	void setLibraryPhysicsModels(LibraryPhysicsModelsType value);

	/**
   * Returns the value of the '<em><b>Library Physics Scenes</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The library_physics_scenes element declares a module of physics_scene elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Physics Scenes</em>' containment reference.
   * @see #setLibraryPhysicsScenes(LibraryPhysicsScenesType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_LibraryPhysicsScenes()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_physics_scenes' namespace='##targetNamespace'"
   * @generated
   */
	LibraryPhysicsScenesType getLibraryPhysicsScenes();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLibraryPhysicsScenes <em>Library Physics Scenes</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Physics Scenes</em>' containment reference.
   * @see #getLibraryPhysicsScenes()
   * @generated
   */
	void setLibraryPhysicsScenes(LibraryPhysicsScenesType value);

	/**
   * Returns the value of the '<em><b>Library Visual Scenes</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The library_visual_scenes element declares a module of visual_scene elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Library Visual Scenes</em>' containment reference.
   * @see #setLibraryVisualScenes(LibraryVisualScenesType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_LibraryVisualScenes()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='library_visual_scenes' namespace='##targetNamespace'"
   * @generated
   */
	LibraryVisualScenesType getLibraryVisualScenes();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLibraryVisualScenes <em>Library Visual Scenes</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Visual Scenes</em>' containment reference.
   * @see #getLibraryVisualScenes()
   * @generated
   */
	void setLibraryVisualScenes(LibraryVisualScenesType value);

	/**
   * Returns the value of the '<em><b>Light</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The light element declares a light source that illuminates the scene.
   * 			Light sources have many different properties and radiate light in many different patterns and 
   * 			frequencies.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Light</em>' containment reference.
   * @see #setLight(LightType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Light()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light' namespace='##targetNamespace'"
   * @generated
   */
	LightType getLight();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLight <em>Light</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Light</em>' containment reference.
   * @see #getLight()
   * @generated
   */
	void setLight(LightType value);

	/**
   * Returns the value of the '<em><b>Lines</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The lines element provides the information needed to bind vertex attributes together and then 
   * 			organize those vertices into individual lines. Each line described by the mesh has two vertices. 
   * 			The first line is formed from first and second vertices. The second line is formed from the 
   * 			third and fourth vertices and so on.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Lines</em>' containment reference.
   * @see #setLines(LinesType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Lines()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='lines' namespace='##targetNamespace'"
   * @generated
   */
	LinesType getLines();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLines <em>Lines</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lines</em>' containment reference.
   * @see #getLines()
   * @generated
   */
	void setLines(LinesType value);

	/**
   * Returns the value of the '<em><b>Linestrips</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The linestrips element provides the information needed to bind vertex attributes together and 
   * 			then organize those vertices into connected line-strips. Each line-strip described by the mesh 
   * 			has an arbitrary number of vertices. Each line segment within the line-strip is formed from the 
   * 			current vertex and the preceding vertex.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Linestrips</em>' containment reference.
   * @see #setLinestrips(LinestripsType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Linestrips()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='linestrips' namespace='##targetNamespace'"
   * @generated
   */
	LinestripsType getLinestrips();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLinestrips <em>Linestrips</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Linestrips</em>' containment reference.
   * @see #getLinestrips()
   * @generated
   */
	void setLinestrips(LinestripsType value);

	/**
   * Returns the value of the '<em><b>Lookat</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The lookat element contains a position and orientation transformation suitable for aiming a camera.
   * 			The lookat element contains three mathematical vectors within it that describe: 
   * 			1.	The position of the object;
   * 			2.	The position of the interest point;
   * 			3.	The direction that points up.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Lookat</em>' containment reference.
   * @see #setLookat(LookatType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Lookat()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='lookat' namespace='##targetNamespace'"
   * @generated
   */
	LookatType getLookat();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getLookat <em>Lookat</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lookat</em>' containment reference.
   * @see #getLookat()
   * @generated
   */
	void setLookat(LookatType value);

	/**
   * Returns the value of the '<em><b>Material</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			Materials describe the visual appearance of a geometric object.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Material</em>' containment reference.
   * @see #setMaterial(MaterialType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Material()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
   * @generated
   */
	MaterialType getMaterial();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getMaterial <em>Material</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Material</em>' containment reference.
   * @see #getMaterial()
   * @generated
   */
	void setMaterial(MaterialType value);

	/**
   * Returns the value of the '<em><b>Matrix</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			Matrix transformations embody mathematical changes to points within a coordinate systems or the 
   * 			coordinate system itself. The matrix element contains a 4-by-4 matrix of floating-point values.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Matrix</em>' containment reference.
   * @see #setMatrix(MatrixType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Matrix()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='matrix' namespace='##targetNamespace'"
   * @generated
   */
	MatrixType getMatrix();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getMatrix <em>Matrix</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Matrix</em>' containment reference.
   * @see #getMatrix()
   * @generated
   */
	void setMatrix(MatrixType value);

	/**
   * Returns the value of the '<em><b>Mesh</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The mesh element contains vertex and primitive information sufficient to describe basic geometric meshes.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Mesh</em>' containment reference.
   * @see #setMesh(MeshType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Mesh()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='mesh' namespace='##targetNamespace'"
   * @generated
   */
	MeshType getMesh();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getMesh <em>Mesh</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mesh</em>' containment reference.
   * @see #getMesh()
   * @generated
   */
	void setMesh(MeshType value);

	/**
   * Returns the value of the '<em><b>Morph</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The morph element describes the data required to blend between sets of static meshes. Each 
   * 			possible mesh that can be blended (a morph target) must be specified.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Morph</em>' containment reference.
   * @see #setMorph(MorphType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Morph()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='morph' namespace='##targetNamespace'"
   * @generated
   */
	MorphType getMorph();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getMorph <em>Morph</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Morph</em>' containment reference.
   * @see #getMorph()
   * @generated
   */
	void setMorph(MorphType value);

	/**
   * Returns the value of the '<em><b>Name Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The Name_array element declares the storage for a homogenous array of Name string values.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name Array</em>' containment reference.
   * @see #setNameArray(NameArrayType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_NameArray()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Name_array' namespace='##targetNamespace'"
   * @generated
   */
	NameArrayType getNameArray();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getNameArray <em>Name Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Array</em>' containment reference.
   * @see #getNameArray()
   * @generated
   */
	void setNameArray(NameArrayType value);

	/**
   * Returns the value of the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			Nodes embody the hierarchical relationship of elements in the scene.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Node</em>' containment reference.
   * @see #setNode(NodeType1)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Node()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='node' namespace='##targetNamespace'"
   * @generated
   */
	NodeType1 getNode();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getNode <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' containment reference.
   * @see #getNode()
   * @generated
   */
	void setNode(NodeType1 value);

	/**
   * Returns the value of the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The p element represents primitive data for the primitive types (lines, linestrips, polygons, 
   * 			polylist, triangles, trifans, tristrips). The p element contains indices that reference into 
   * 			the parent's source elements referenced by the input elements.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>P</em>' attribute.
   * @see #setP(List)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_P()
   * @model unique="false" dataType="org.khronos.collada.ListOfUInts" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace'"
   * @generated
   */
	List<BigInteger> getP();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getP <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' attribute.
   * @see #getP()
   * @generated
   */
	void setP(List<BigInteger> value);

	/**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The param element declares parametric information regarding its parent element.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(ParamType4)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Param()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
   * @generated
   */
	ParamType4 getParam();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
   * @see #getParam()
   * @generated
   */
	void setParam(ParamType4 value);

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
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_PhysicsMaterial()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='physics_material' namespace='##targetNamespace'"
   * @generated
   */
	PhysicsMaterialType getPhysicsMaterial();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getPhysicsMaterial <em>Physics Material</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Physics Material</em>' containment reference.
   * @see #getPhysicsMaterial()
   * @generated
   */
	void setPhysicsMaterial(PhysicsMaterialType value);

	/**
   * Returns the value of the '<em><b>Physics Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			This element allows for building complex combinations of rigid-bodies and constraints that 
   * 			may be instantiated multiple times.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Physics Model</em>' containment reference.
   * @see #setPhysicsModel(PhysicsModelType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_PhysicsModel()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='physics_model' namespace='##targetNamespace'"
   * @generated
   */
	PhysicsModelType getPhysicsModel();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getPhysicsModel <em>Physics Model</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Physics Model</em>' containment reference.
   * @see #getPhysicsModel()
   * @generated
   */
	void setPhysicsModel(PhysicsModelType value);

	/**
   * Returns the value of the '<em><b>Physics Scene</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physics Scene</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Physics Scene</em>' containment reference.
   * @see #setPhysicsScene(PhysicsSceneType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_PhysicsScene()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='physics_scene' namespace='##targetNamespace'"
   * @generated
   */
	PhysicsSceneType getPhysicsScene();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getPhysicsScene <em>Physics Scene</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Physics Scene</em>' containment reference.
   * @see #getPhysicsScene()
   * @generated
   */
	void setPhysicsScene(PhysicsSceneType value);

	/**
   * Returns the value of the '<em><b>Plane</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			An infinite plane primitive.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Plane</em>' containment reference.
   * @see #setPlane(PlaneType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Plane()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='plane' namespace='##targetNamespace'"
   * @generated
   */
	PlaneType getPlane();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getPlane <em>Plane</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plane</em>' containment reference.
   * @see #getPlane()
   * @generated
   */
	void setPlane(PlaneType value);

	/**
   * Returns the value of the '<em><b>Polygons</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The polygons element provides the information needed to bind vertex attributes together and 
   * 			then organize those vertices into individual polygons. The polygons described can contain 
   * 			arbitrary numbers of vertices. These polygons may be self intersecting and may also contain holes.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Polygons</em>' containment reference.
   * @see #setPolygons(PolygonsType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Polygons()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='polygons' namespace='##targetNamespace'"
   * @generated
   */
	PolygonsType getPolygons();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getPolygons <em>Polygons</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Polygons</em>' containment reference.
   * @see #getPolygons()
   * @generated
   */
	void setPolygons(PolygonsType value);

	/**
   * Returns the value of the '<em><b>Polylist</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The polylist element provides the information needed to bind vertex attributes together and 
   * 			then organize those vertices into individual polygons. The polygons described in polylist can 
   * 			contain arbitrary numbers of vertices. Unlike the polygons element, the polylist element cannot 
   * 			contain polygons with holes.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Polylist</em>' containment reference.
   * @see #setPolylist(PolylistType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Polylist()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='polylist' namespace='##targetNamespace'"
   * @generated
   */
	PolylistType getPolylist();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getPolylist <em>Polylist</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Polylist</em>' containment reference.
   * @see #getPolylist()
   * @generated
   */
	void setPolylist(PolylistType value);

	/**
   * Returns the value of the '<em><b>Profile CG</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			Opens a block of CG platform-specific data types and technique declarations.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Profile CG</em>' containment reference.
   * @see #setProfileCG(ProfileCGType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_ProfileCG()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='profile_CG' namespace='##targetNamespace' affiliation='fx_profile_abstract'"
   * @generated
   */
	ProfileCGType getProfileCG();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getProfileCG <em>Profile CG</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profile CG</em>' containment reference.
   * @see #getProfileCG()
   * @generated
   */
	void setProfileCG(ProfileCGType value);

	/**
   * Returns the value of the '<em><b>Profile COMMON</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			Opens a block of COMMON platform-specific data types and technique declarations.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Profile COMMON</em>' containment reference.
   * @see #setProfileCOMMON(ProfileCOMMONType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_ProfileCOMMON()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='profile_COMMON' namespace='##targetNamespace' affiliation='fx_profile_abstract'"
   * @generated
   */
	ProfileCOMMONType getProfileCOMMON();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getProfileCOMMON <em>Profile COMMON</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profile COMMON</em>' containment reference.
   * @see #getProfileCOMMON()
   * @generated
   */
	void setProfileCOMMON(ProfileCOMMONType value);

	/**
   * Returns the value of the '<em><b>Profile GLES</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			Opens a block of GLES platform-specific data types and technique declarations.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Profile GLES</em>' containment reference.
   * @see #setProfileGLES(ProfileGLESType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_ProfileGLES()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='profile_GLES' namespace='##targetNamespace' affiliation='fx_profile_abstract'"
   * @generated
   */
	ProfileGLESType getProfileGLES();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getProfileGLES <em>Profile GLES</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profile GLES</em>' containment reference.
   * @see #getProfileGLES()
   * @generated
   */
	void setProfileGLES(ProfileGLESType value);

	/**
   * Returns the value of the '<em><b>Profile GLSL</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			Opens a block of GLSL platform-specific data types and technique declarations.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Profile GLSL</em>' containment reference.
   * @see #setProfileGLSL(ProfileGLSLType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_ProfileGLSL()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='profile_GLSL' namespace='##targetNamespace' affiliation='fx_profile_abstract'"
   * @generated
   */
	ProfileGLSLType getProfileGLSL();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getProfileGLSL <em>Profile GLSL</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profile GLSL</em>' containment reference.
   * @see #getProfileGLSL()
   * @generated
   */
	void setProfileGLSL(ProfileGLSLType value);

	/**
   * Returns the value of the '<em><b>Rigid Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			This element allows for describing simulated bodies that do not deform. These bodies may or may 
   * 			not be connected by constraints (hinge, ball-joint etc.).  Rigid-bodies, constraints etc. are 
   * 			encapsulated in physics_model elements to allow for instantiating complex models.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Rigid Body</em>' containment reference.
   * @see #setRigidBody(RigidBodyType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_RigidBody()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='rigid_body' namespace='##targetNamespace'"
   * @generated
   */
	RigidBodyType getRigidBody();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getRigidBody <em>Rigid Body</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rigid Body</em>' containment reference.
   * @see #getRigidBody()
   * @generated
   */
	void setRigidBody(RigidBodyType value);

	/**
   * Returns the value of the '<em><b>Rigid Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			This element allows for connecting components, such as rigid_body into complex physics models 
   * 			with moveable parts.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Rigid Constraint</em>' containment reference.
   * @see #setRigidConstraint(RigidConstraintType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_RigidConstraint()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='rigid_constraint' namespace='##targetNamespace'"
   * @generated
   */
	RigidConstraintType getRigidConstraint();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getRigidConstraint <em>Rigid Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rigid Constraint</em>' containment reference.
   * @see #getRigidConstraint()
   * @generated
   */
	void setRigidConstraint(RigidConstraintType value);

	/**
   * Returns the value of the '<em><b>Rotate</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The rotate element contains an angle and a mathematical vector that represents the axis of rotation.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Rotate</em>' containment reference.
   * @see #setRotate(RotateType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Rotate()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='rotate' namespace='##targetNamespace'"
   * @generated
   */
	RotateType getRotate();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getRotate <em>Rotate</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rotate</em>' containment reference.
   * @see #getRotate()
   * @generated
   */
	void setRotate(RotateType value);

	/**
   * Returns the value of the '<em><b>Sampler</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The sampler element declares an N-dimensional function used for animation. Animation function curves 
   * 			are represented by 1-D sampler elements in COLLADA. The sampler defines sampling points and how to 
   * 			interpolate between them.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sampler</em>' containment reference.
   * @see #setSampler(SamplerType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Sampler()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='sampler' namespace='##targetNamespace'"
   * @generated
   */
	SamplerType getSampler();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getSampler <em>Sampler</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler</em>' containment reference.
   * @see #getSampler()
   * @generated
   */
	void setSampler(SamplerType value);

	/**
   * Returns the value of the '<em><b>Scale</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The scale element contains a mathematical vector that represents the relative proportions of the 
   * 			X, Y and Z axes of a coordinated system.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Scale</em>' containment reference.
   * @see #setScale(TargetableFloat3)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Scale()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='scale' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat3 getScale();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getScale <em>Scale</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scale</em>' containment reference.
   * @see #getScale()
   * @generated
   */
	void setScale(TargetableFloat3 value);

	/**
   * Returns the value of the '<em><b>Skew</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The skew element contains an angle and two mathematical vectors that represent the axis of 
   * 			rotation and the axis of translation.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Skew</em>' containment reference.
   * @see #setSkew(SkewType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Skew()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='skew' namespace='##targetNamespace'"
   * @generated
   */
	SkewType getSkew();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getSkew <em>Skew</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skew</em>' containment reference.
   * @see #getSkew()
   * @generated
   */
	void setSkew(SkewType value);

	/**
   * Returns the value of the '<em><b>Skin</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The skin element contains vertex and primitive information sufficient to describe blend-weight skinning.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Skin</em>' containment reference.
   * @see #setSkin(SkinType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Skin()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='skin' namespace='##targetNamespace'"
   * @generated
   */
	SkinType getSkin();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getSkin <em>Skin</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skin</em>' containment reference.
   * @see #getSkin()
   * @generated
   */
	void setSkin(SkinType value);

	/**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The source element declares a data repository that provides values according to the semantics of an 
   * 			input element that refers to it.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(SourceType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Source()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
   * @generated
   */
	SourceType getSource();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
	void setSource(SourceType value);

	/**
   * Returns the value of the '<em><b>Sphere</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			A centered sphere primitive.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sphere</em>' containment reference.
   * @see #setSphere(SphereType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Sphere()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='sphere' namespace='##targetNamespace'"
   * @generated
   */
	SphereType getSphere();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getSphere <em>Sphere</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sphere</em>' containment reference.
   * @see #getSphere()
   * @generated
   */
	void setSphere(SphereType value);

	/**
   * Returns the value of the '<em><b>Spline</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The spline element contains control vertex information sufficient to describe basic splines.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Spline</em>' containment reference.
   * @see #setSpline(SplineType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Spline()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='spline' namespace='##targetNamespace'"
   * @generated
   */
	SplineType getSpline();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getSpline <em>Spline</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spline</em>' containment reference.
   * @see #getSpline()
   * @generated
   */
	void setSpline(SplineType value);

	/**
   * Returns the value of the '<em><b>Tapered Capsule</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			A tapered capsule primitive that is centered on, and aligned with, the local Y axis.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Tapered Capsule</em>' containment reference.
   * @see #setTaperedCapsule(TaperedCapsuleType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_TaperedCapsule()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='tapered_capsule' namespace='##targetNamespace'"
   * @generated
   */
	TaperedCapsuleType getTaperedCapsule();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getTaperedCapsule <em>Tapered Capsule</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tapered Capsule</em>' containment reference.
   * @see #getTaperedCapsule()
   * @generated
   */
	void setTaperedCapsule(TaperedCapsuleType value);

	/**
   * Returns the value of the '<em><b>Tapered Cylinder</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			A tapered cylinder primitive that is centered on and aligned with the local Y axis.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Tapered Cylinder</em>' containment reference.
   * @see #setTaperedCylinder(TaperedCylinderType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_TaperedCylinder()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='tapered_cylinder' namespace='##targetNamespace'"
   * @generated
   */
	TaperedCylinderType getTaperedCylinder();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getTaperedCylinder <em>Tapered Cylinder</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tapered Cylinder</em>' containment reference.
   * @see #getTaperedCylinder()
   * @generated
   */
	void setTaperedCylinder(TaperedCylinderType value);

	/**
   * Returns the value of the '<em><b>Technique</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The technique element declares the information used to process some portion of the content. Each 
   * 			technique conforms to an associated profile. Techniques generally act as a “switch”. If more than 
   * 			one is present for a particular portion of content, on import, one or the other is picked, but 
   * 			usually not both. Selection should be based on which profile the importing application can support.
   * 			Techniques contain application data and programs, making them assets that can be managed as a unit.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Technique</em>' containment reference.
   * @see #setTechnique(TechniqueType4)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Technique()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='technique' namespace='##targetNamespace'"
   * @generated
   */
	TechniqueType4 getTechnique();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getTechnique <em>Technique</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Technique</em>' containment reference.
   * @see #getTechnique()
   * @generated
   */
	void setTechnique(TechniqueType4 value);

	/**
   * Returns the value of the '<em><b>Translate</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The translate element contains a mathematical vector that represents the distance along the 
   * 			X, Y and Z-axes.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Translate</em>' containment reference.
   * @see #setTranslate(TargetableFloat3)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Translate()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='translate' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat3 getTranslate();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getTranslate <em>Translate</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Translate</em>' containment reference.
   * @see #getTranslate()
   * @generated
   */
	void setTranslate(TargetableFloat3 value);

	/**
   * Returns the value of the '<em><b>Triangles</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The triangles element provides the information needed to bind vertex attributes together and 
   * 			then organize those vertices into individual triangles.	Each triangle described by the mesh has 
   * 			three vertices. The first triangle is formed from the first, second, and third vertices. The 
   * 			second triangle is formed from the fourth, fifth, and sixth vertices, and so on.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Triangles</em>' containment reference.
   * @see #setTriangles(TrianglesType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Triangles()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='triangles' namespace='##targetNamespace'"
   * @generated
   */
	TrianglesType getTriangles();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getTriangles <em>Triangles</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Triangles</em>' containment reference.
   * @see #getTriangles()
   * @generated
   */
	void setTriangles(TrianglesType value);

	/**
   * Returns the value of the '<em><b>Trifans</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The trifans element provides the information needed to bind vertex attributes together and then 
   * 			organize those vertices into connected triangles. Each triangle described by the mesh has three 
   * 			vertices. The first triangle is formed from first, second, and third vertices. Each subsequent 
   * 			triangle is formed from the current vertex, reusing the first and the previous vertices.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Trifans</em>' containment reference.
   * @see #setTrifans(TrifansType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Trifans()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='trifans' namespace='##targetNamespace'"
   * @generated
   */
	TrifansType getTrifans();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getTrifans <em>Trifans</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trifans</em>' containment reference.
   * @see #getTrifans()
   * @generated
   */
	void setTrifans(TrifansType value);

	/**
   * Returns the value of the '<em><b>Tristrips</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The tristrips element provides the information needed to bind vertex attributes together and then 
   * 			organize those vertices into connected triangles. Each triangle described by the mesh has three 
   * 			vertices. The first triangle is formed from first, second, and third vertices. Each subsequent 
   * 			triangle is formed from the current vertex, reusing the previous two vertices.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Tristrips</em>' containment reference.
   * @see #setTristrips(TristripsType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Tristrips()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='tristrips' namespace='##targetNamespace'"
   * @generated
   */
	TristripsType getTristrips();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getTristrips <em>Tristrips</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tristrips</em>' containment reference.
   * @see #getTristrips()
   * @generated
   */
	void setTristrips(TristripsType value);

	/**
   * Returns the value of the '<em><b>Vertices</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The vertices element declares the attributes and identity of mesh-vertices. The vertices element
   * 			describes mesh-vertices in a mesh geometry. The mesh-vertices represent the position (identity) 
   * 			of the vertices comprising the mesh and other vertex attributes that are invariant to tessellation.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Vertices</em>' containment reference.
   * @see #setVertices(VerticesType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_Vertices()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='vertices' namespace='##targetNamespace'"
   * @generated
   */
	VerticesType getVertices();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getVertices <em>Vertices</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vertices</em>' containment reference.
   * @see #getVertices()
   * @generated
   */
	void setVertices(VerticesType value);

	/**
   * Returns the value of the '<em><b>Visual Scene</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The visual_scene element declares the base of the visual_scene hierarchy or scene graph. The 
   * 			scene contains elements that comprise much of the visual and transformational information 
   * 			content as created by the authoring tools.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Visual Scene</em>' containment reference.
   * @see #setVisualScene(VisualSceneType)
   * @see org.khronos.collada.ColladaPackage#getDocumentRoot_VisualScene()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='visual_scene' namespace='##targetNamespace'"
   * @generated
   */
	VisualSceneType getVisualScene();

	/**
   * Sets the value of the '{@link org.khronos.collada.DocumentRoot#getVisualScene <em>Visual Scene</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visual Scene</em>' containment reference.
   * @see #getVisualScene()
   * @generated
   */
	void setVisualScene(VisualSceneType value);

} // DocumentRoot
