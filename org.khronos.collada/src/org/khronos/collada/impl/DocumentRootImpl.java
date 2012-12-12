/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.AccessorType;
import org.khronos.collada.AnimationClipType;
import org.khronos.collada.AnimationType;
import org.khronos.collada.AssetType;
import org.khronos.collada.BindMaterialType;
import org.khronos.collada.BoolArrayType;
import org.khronos.collada.BoxType;
import org.khronos.collada.COLLADAType;
import org.khronos.collada.CameraType;
import org.khronos.collada.CapsuleType;
import org.khronos.collada.ChannelType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ControllerType;
import org.khronos.collada.ConvexMeshType;
import org.khronos.collada.CylinderType;
import org.khronos.collada.DocumentRoot;
import org.khronos.collada.EffectType;
import org.khronos.collada.EllipsoidType;
import org.khronos.collada.ExtraType;
import org.khronos.collada.FloatArrayType;
import org.khronos.collada.ForceFieldType;
import org.khronos.collada.GeometryType;
import org.khronos.collada.IDREFArrayType;
import org.khronos.collada.ImageType;
import org.khronos.collada.InstanceControllerType;
import org.khronos.collada.InstanceEffectType;
import org.khronos.collada.InstanceGeometryType;
import org.khronos.collada.InstanceMaterialType;
import org.khronos.collada.InstancePhysicsModelType;
import org.khronos.collada.InstanceRigidBodyType;
import org.khronos.collada.InstanceRigidConstraintType;
import org.khronos.collada.InstanceWithExtra;
import org.khronos.collada.IntArrayType;
import org.khronos.collada.LibraryAnimationClipsType;
import org.khronos.collada.LibraryAnimationsType;
import org.khronos.collada.LibraryCamerasType;
import org.khronos.collada.LibraryControllersType;
import org.khronos.collada.LibraryEffectsType;
import org.khronos.collada.LibraryForceFieldsType;
import org.khronos.collada.LibraryGeometriesType;
import org.khronos.collada.LibraryImagesType;
import org.khronos.collada.LibraryLightsType;
import org.khronos.collada.LibraryMaterialsType;
import org.khronos.collada.LibraryNodesType;
import org.khronos.collada.LibraryPhysicsMaterialsType;
import org.khronos.collada.LibraryPhysicsModelsType;
import org.khronos.collada.LibraryPhysicsScenesType;
import org.khronos.collada.LibraryVisualScenesType;
import org.khronos.collada.LightType;
import org.khronos.collada.LinesType;
import org.khronos.collada.LinestripsType;
import org.khronos.collada.LookatType;
import org.khronos.collada.MaterialType;
import org.khronos.collada.MatrixType;
import org.khronos.collada.MeshType;
import org.khronos.collada.MorphType;
import org.khronos.collada.NameArrayType;
import org.khronos.collada.NodeType1;
import org.khronos.collada.ParamType4;
import org.khronos.collada.PhysicsMaterialType;
import org.khronos.collada.PhysicsModelType;
import org.khronos.collada.PhysicsSceneType;
import org.khronos.collada.PlaneType;
import org.khronos.collada.PolygonsType;
import org.khronos.collada.PolylistType;
import org.khronos.collada.ProfileCGType;
import org.khronos.collada.ProfileCOMMONType;
import org.khronos.collada.ProfileGLESType;
import org.khronos.collada.ProfileGLSLType;
import org.khronos.collada.RigidBodyType;
import org.khronos.collada.RigidConstraintType;
import org.khronos.collada.RotateType;
import org.khronos.collada.SamplerType;
import org.khronos.collada.SkewType;
import org.khronos.collada.SkinType;
import org.khronos.collada.SourceType;
import org.khronos.collada.SphereType;
import org.khronos.collada.SplineType;
import org.khronos.collada.TaperedCapsuleType;
import org.khronos.collada.TaperedCylinderType;
import org.khronos.collada.TargetableFloat3;
import org.khronos.collada.TechniqueType4;
import org.khronos.collada.TrianglesType;
import org.khronos.collada.TrifansType;
import org.khronos.collada.TristripsType;
import org.khronos.collada.VerticesType;
import org.khronos.collada.VisualSceneType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getAnimation <em>Animation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getAnimationClip <em>Animation Clip</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getBindMaterial <em>Bind Material</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getBoolArray <em>Bool Array</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getBox <em>Box</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getCamera <em>Camera</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getCapsule <em>Capsule</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getCOLLADA <em>COLLADA</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getController <em>Controller</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getConvexMesh <em>Convex Mesh</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getEllipsoid <em>Ellipsoid</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getFloatArray <em>Float Array</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getForceField <em>Force Field</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getFxProfileAbstract <em>Fx Profile Abstract</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getGlHookAbstract <em>Gl Hook Abstract</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getIDREFArray <em>IDREF Array</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getInstanceCamera <em>Instance Camera</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getInstanceController <em>Instance Controller</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getInstanceEffect <em>Instance Effect</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getInstanceForceField <em>Instance Force Field</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getInstanceGeometry <em>Instance Geometry</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getInstanceLight <em>Instance Light</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getInstanceMaterial <em>Instance Material</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getInstanceNode <em>Instance Node</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getInstancePhysicsMaterial <em>Instance Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getInstancePhysicsModel <em>Instance Physics Model</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getInstanceRigidBody <em>Instance Rigid Body</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getInstanceRigidConstraint <em>Instance Rigid Constraint</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getIntArray <em>Int Array</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLibraryAnimationClips <em>Library Animation Clips</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLibraryAnimations <em>Library Animations</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLibraryCameras <em>Library Cameras</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLibraryControllers <em>Library Controllers</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLibraryEffects <em>Library Effects</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLibraryForceFields <em>Library Force Fields</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLibraryGeometries <em>Library Geometries</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLibraryImages <em>Library Images</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLibraryLights <em>Library Lights</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLibraryMaterials <em>Library Materials</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLibraryNodes <em>Library Nodes</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLibraryPhysicsMaterials <em>Library Physics Materials</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLibraryPhysicsModels <em>Library Physics Models</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLibraryPhysicsScenes <em>Library Physics Scenes</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLibraryVisualScenes <em>Library Visual Scenes</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLight <em>Light</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLinestrips <em>Linestrips</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getLookat <em>Lookat</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getMesh <em>Mesh</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getMorph <em>Morph</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getNameArray <em>Name Array</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getP <em>P</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getPhysicsMaterial <em>Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getPhysicsModel <em>Physics Model</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getPhysicsScene <em>Physics Scene</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getPolygons <em>Polygons</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getPolylist <em>Polylist</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getProfileCG <em>Profile CG</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getProfileCOMMON <em>Profile COMMON</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getProfileGLES <em>Profile GLES</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getProfileGLSL <em>Profile GLSL</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getRigidBody <em>Rigid Body</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getRigidConstraint <em>Rigid Constraint</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getRotate <em>Rotate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getSampler <em>Sampler</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getSkew <em>Skew</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getSkin <em>Skin</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getSphere <em>Sphere</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getSpline <em>Spline</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getTaperedCapsule <em>Tapered Capsule</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getTaperedCylinder <em>Tapered Cylinder</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getTranslate <em>Translate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getTriangles <em>Triangles</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getTrifans <em>Trifans</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getTristrips <em>Tristrips</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link org.khronos.collada.impl.DocumentRootImpl#getVisualScene <em>Visual Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
   * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMixed()
   * @generated
   * @ordered
   */
	protected FeatureMap mixed;

	/**
   * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getXMLNSPrefixMap()
   * @generated
   * @ordered
   */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
   * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getXSISchemaLocation()
   * @generated
   * @ordered
   */
	protected EMap<String, String> xSISchemaLocation;

	/**
   * The default value of the '{@link #getP() <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
	protected static final List<BigInteger> P_EDEFAULT = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DocumentRootImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getDocumentRoot();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getMixed() {
    if (mixed == null)
    {
      mixed = new BasicFeatureMap(this, ColladaPackage.DOCUMENT_ROOT__MIXED);
    }
    return mixed;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMap<String, String> getXMLNSPrefixMap() {
    if (xMLNSPrefixMap == null)
    {
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ColladaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    }
    return xMLNSPrefixMap;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMap<String, String> getXSISchemaLocation() {
    if (xSISchemaLocation == null)
    {
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ColladaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AccessorType getAccessor() {
    return (AccessorType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Accessor(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAccessor(AccessorType newAccessor, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Accessor(), newAccessor, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAccessor(AccessorType newAccessor) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Accessor(), newAccessor);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnimationType getAnimation() {
    return (AnimationType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Animation(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAnimation(AnimationType newAnimation, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Animation(), newAnimation, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAnimation(AnimationType newAnimation) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Animation(), newAnimation);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnimationClipType getAnimationClip() {
    return (AnimationClipType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_AnimationClip(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAnimationClip(AnimationClipType newAnimationClip, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_AnimationClip(), newAnimationClip, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAnimationClip(AnimationClipType newAnimationClip) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_AnimationClip(), newAnimationClip);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AssetType getAsset() {
    return (AssetType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Asset(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAsset(AssetType newAsset, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Asset(), newAsset, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAsset(AssetType newAsset) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Asset(), newAsset);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BindMaterialType getBindMaterial() {
    return (BindMaterialType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_BindMaterial(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetBindMaterial(BindMaterialType newBindMaterial, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_BindMaterial(), newBindMaterial, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBindMaterial(BindMaterialType newBindMaterial) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_BindMaterial(), newBindMaterial);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BoolArrayType getBoolArray() {
    return (BoolArrayType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_BoolArray(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetBoolArray(BoolArrayType newBoolArray, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_BoolArray(), newBoolArray, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBoolArray(BoolArrayType newBoolArray) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_BoolArray(), newBoolArray);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BoxType getBox() {
    return (BoxType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Box(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetBox(BoxType newBox, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Box(), newBox, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBox(BoxType newBox) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Box(), newBox);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CameraType getCamera() {
    return (CameraType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Camera(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetCamera(CameraType newCamera, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Camera(), newCamera, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCamera(CameraType newCamera) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Camera(), newCamera);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CapsuleType getCapsule() {
    return (CapsuleType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Capsule(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetCapsule(CapsuleType newCapsule, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Capsule(), newCapsule, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCapsule(CapsuleType newCapsule) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Capsule(), newCapsule);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ChannelType getChannel() {
    return (ChannelType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Channel(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetChannel(ChannelType newChannel, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Channel(), newChannel, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setChannel(ChannelType newChannel) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Channel(), newChannel);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public COLLADAType getCOLLADA() {
    return (COLLADAType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_COLLADA(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetCOLLADA(COLLADAType newCOLLADA, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_COLLADA(), newCOLLADA, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCOLLADA(COLLADAType newCOLLADA) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_COLLADA(), newCOLLADA);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ControllerType getController() {
    return (ControllerType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Controller(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetController(ControllerType newController, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Controller(), newController, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setController(ControllerType newController) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Controller(), newController);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ConvexMeshType getConvexMesh() {
    return (ConvexMeshType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_ConvexMesh(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetConvexMesh(ConvexMeshType newConvexMesh, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_ConvexMesh(), newConvexMesh, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setConvexMesh(ConvexMeshType newConvexMesh) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_ConvexMesh(), newConvexMesh);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CylinderType getCylinder() {
    return (CylinderType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Cylinder(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetCylinder(CylinderType newCylinder, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Cylinder(), newCylinder, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCylinder(CylinderType newCylinder) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Cylinder(), newCylinder);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EffectType getEffect() {
    return (EffectType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Effect(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetEffect(EffectType newEffect, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Effect(), newEffect, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setEffect(EffectType newEffect) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Effect(), newEffect);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EllipsoidType getEllipsoid() {
    return (EllipsoidType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Ellipsoid(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetEllipsoid(EllipsoidType newEllipsoid, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Ellipsoid(), newEllipsoid, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setEllipsoid(EllipsoidType newEllipsoid) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Ellipsoid(), newEllipsoid);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ExtraType getExtra() {
    return (ExtraType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Extra(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetExtra(ExtraType newExtra, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Extra(), newExtra, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setExtra(ExtraType newExtra) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Extra(), newExtra);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FloatArrayType getFloatArray() {
    return (FloatArrayType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_FloatArray(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFloatArray(FloatArrayType newFloatArray, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_FloatArray(), newFloatArray, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloatArray(FloatArrayType newFloatArray) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_FloatArray(), newFloatArray);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ForceFieldType getForceField() {
    return (ForceFieldType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_ForceField(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetForceField(ForceFieldType newForceField, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_ForceField(), newForceField, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setForceField(ForceFieldType newForceField) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_ForceField(), newForceField);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EObject getFxProfileAbstract() {
    return (EObject)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_FxProfileAbstract(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFxProfileAbstract(EObject newFxProfileAbstract, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_FxProfileAbstract(), newFxProfileAbstract, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GeometryType getGeometry() {
    return (GeometryType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Geometry(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetGeometry(GeometryType newGeometry, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Geometry(), newGeometry, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setGeometry(GeometryType newGeometry) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Geometry(), newGeometry);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EObject getGlHookAbstract() {
    return (EObject)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_GlHookAbstract(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetGlHookAbstract(EObject newGlHookAbstract, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_GlHookAbstract(), newGlHookAbstract, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public IDREFArrayType getIDREFArray() {
    return (IDREFArrayType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_IDREFArray(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetIDREFArray(IDREFArrayType newIDREFArray, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_IDREFArray(), newIDREFArray, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setIDREFArray(IDREFArrayType newIDREFArray) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_IDREFArray(), newIDREFArray);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ImageType getImage() {
    return (ImageType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Image(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetImage(ImageType newImage, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Image(), newImage, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setImage(ImageType newImage) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Image(), newImage);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceWithExtra getInstanceCamera() {
    return (InstanceWithExtra)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceCamera(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstanceCamera(InstanceWithExtra newInstanceCamera, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceCamera(), newInstanceCamera, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstanceCamera(InstanceWithExtra newInstanceCamera) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceCamera(), newInstanceCamera);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceControllerType getInstanceController() {
    return (InstanceControllerType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceController(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstanceController(InstanceControllerType newInstanceController, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceController(), newInstanceController, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstanceController(InstanceControllerType newInstanceController) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceController(), newInstanceController);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceEffectType getInstanceEffect() {
    return (InstanceEffectType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceEffect(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstanceEffect(InstanceEffectType newInstanceEffect, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceEffect(), newInstanceEffect, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstanceEffect(InstanceEffectType newInstanceEffect) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceEffect(), newInstanceEffect);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceWithExtra getInstanceForceField() {
    return (InstanceWithExtra)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceForceField(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstanceForceField(InstanceWithExtra newInstanceForceField, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceForceField(), newInstanceForceField, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstanceForceField(InstanceWithExtra newInstanceForceField) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceForceField(), newInstanceForceField);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceGeometryType getInstanceGeometry() {
    return (InstanceGeometryType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceGeometry(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstanceGeometry(InstanceGeometryType newInstanceGeometry, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceGeometry(), newInstanceGeometry, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstanceGeometry(InstanceGeometryType newInstanceGeometry) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceGeometry(), newInstanceGeometry);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceWithExtra getInstanceLight() {
    return (InstanceWithExtra)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceLight(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstanceLight(InstanceWithExtra newInstanceLight, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceLight(), newInstanceLight, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstanceLight(InstanceWithExtra newInstanceLight) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceLight(), newInstanceLight);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceMaterialType getInstanceMaterial() {
    return (InstanceMaterialType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceMaterial(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstanceMaterial(InstanceMaterialType newInstanceMaterial, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceMaterial(), newInstanceMaterial, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstanceMaterial(InstanceMaterialType newInstanceMaterial) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceMaterial(), newInstanceMaterial);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceWithExtra getInstanceNode() {
    return (InstanceWithExtra)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceNode(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstanceNode(InstanceWithExtra newInstanceNode, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceNode(), newInstanceNode, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstanceNode(InstanceWithExtra newInstanceNode) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceNode(), newInstanceNode);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceWithExtra getInstancePhysicsMaterial() {
    return (InstanceWithExtra)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_InstancePhysicsMaterial(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstancePhysicsMaterial(InstanceWithExtra newInstancePhysicsMaterial, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_InstancePhysicsMaterial(), newInstancePhysicsMaterial, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstancePhysicsMaterial(InstanceWithExtra newInstancePhysicsMaterial) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_InstancePhysicsMaterial(), newInstancePhysicsMaterial);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstancePhysicsModelType getInstancePhysicsModel() {
    return (InstancePhysicsModelType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_InstancePhysicsModel(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstancePhysicsModel(InstancePhysicsModelType newInstancePhysicsModel, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_InstancePhysicsModel(), newInstancePhysicsModel, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstancePhysicsModel(InstancePhysicsModelType newInstancePhysicsModel) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_InstancePhysicsModel(), newInstancePhysicsModel);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceRigidBodyType getInstanceRigidBody() {
    return (InstanceRigidBodyType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceRigidBody(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstanceRigidBody(InstanceRigidBodyType newInstanceRigidBody, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceRigidBody(), newInstanceRigidBody, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstanceRigidBody(InstanceRigidBodyType newInstanceRigidBody) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceRigidBody(), newInstanceRigidBody);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceRigidConstraintType getInstanceRigidConstraint() {
    return (InstanceRigidConstraintType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceRigidConstraint(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstanceRigidConstraint(InstanceRigidConstraintType newInstanceRigidConstraint, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceRigidConstraint(), newInstanceRigidConstraint, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstanceRigidConstraint(InstanceRigidConstraintType newInstanceRigidConstraint) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_InstanceRigidConstraint(), newInstanceRigidConstraint);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public IntArrayType getIntArray() {
    return (IntArrayType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_IntArray(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetIntArray(IntArrayType newIntArray, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_IntArray(), newIntArray, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setIntArray(IntArrayType newIntArray) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_IntArray(), newIntArray);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryAnimationClipsType getLibraryAnimationClips() {
    return (LibraryAnimationClipsType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryAnimationClips(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLibraryAnimationClips(LibraryAnimationClipsType newLibraryAnimationClips, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryAnimationClips(), newLibraryAnimationClips, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibraryAnimationClips(LibraryAnimationClipsType newLibraryAnimationClips) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryAnimationClips(), newLibraryAnimationClips);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryAnimationsType getLibraryAnimations() {
    return (LibraryAnimationsType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryAnimations(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLibraryAnimations(LibraryAnimationsType newLibraryAnimations, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryAnimations(), newLibraryAnimations, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibraryAnimations(LibraryAnimationsType newLibraryAnimations) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryAnimations(), newLibraryAnimations);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryCamerasType getLibraryCameras() {
    return (LibraryCamerasType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryCameras(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLibraryCameras(LibraryCamerasType newLibraryCameras, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryCameras(), newLibraryCameras, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibraryCameras(LibraryCamerasType newLibraryCameras) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryCameras(), newLibraryCameras);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryControllersType getLibraryControllers() {
    return (LibraryControllersType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryControllers(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLibraryControllers(LibraryControllersType newLibraryControllers, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryControllers(), newLibraryControllers, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibraryControllers(LibraryControllersType newLibraryControllers) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryControllers(), newLibraryControllers);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryEffectsType getLibraryEffects() {
    return (LibraryEffectsType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryEffects(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLibraryEffects(LibraryEffectsType newLibraryEffects, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryEffects(), newLibraryEffects, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibraryEffects(LibraryEffectsType newLibraryEffects) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryEffects(), newLibraryEffects);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryForceFieldsType getLibraryForceFields() {
    return (LibraryForceFieldsType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryForceFields(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLibraryForceFields(LibraryForceFieldsType newLibraryForceFields, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryForceFields(), newLibraryForceFields, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibraryForceFields(LibraryForceFieldsType newLibraryForceFields) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryForceFields(), newLibraryForceFields);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryGeometriesType getLibraryGeometries() {
    return (LibraryGeometriesType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryGeometries(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLibraryGeometries(LibraryGeometriesType newLibraryGeometries, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryGeometries(), newLibraryGeometries, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibraryGeometries(LibraryGeometriesType newLibraryGeometries) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryGeometries(), newLibraryGeometries);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryImagesType getLibraryImages() {
    return (LibraryImagesType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryImages(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLibraryImages(LibraryImagesType newLibraryImages, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryImages(), newLibraryImages, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibraryImages(LibraryImagesType newLibraryImages) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryImages(), newLibraryImages);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryLightsType getLibraryLights() {
    return (LibraryLightsType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryLights(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLibraryLights(LibraryLightsType newLibraryLights, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryLights(), newLibraryLights, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibraryLights(LibraryLightsType newLibraryLights) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryLights(), newLibraryLights);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryMaterialsType getLibraryMaterials() {
    return (LibraryMaterialsType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryMaterials(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLibraryMaterials(LibraryMaterialsType newLibraryMaterials, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryMaterials(), newLibraryMaterials, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibraryMaterials(LibraryMaterialsType newLibraryMaterials) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryMaterials(), newLibraryMaterials);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryNodesType getLibraryNodes() {
    return (LibraryNodesType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryNodes(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLibraryNodes(LibraryNodesType newLibraryNodes, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryNodes(), newLibraryNodes, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibraryNodes(LibraryNodesType newLibraryNodes) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryNodes(), newLibraryNodes);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryPhysicsMaterialsType getLibraryPhysicsMaterials() {
    return (LibraryPhysicsMaterialsType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryPhysicsMaterials(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLibraryPhysicsMaterials(LibraryPhysicsMaterialsType newLibraryPhysicsMaterials, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryPhysicsMaterials(), newLibraryPhysicsMaterials, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibraryPhysicsMaterials(LibraryPhysicsMaterialsType newLibraryPhysicsMaterials) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryPhysicsMaterials(), newLibraryPhysicsMaterials);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryPhysicsModelsType getLibraryPhysicsModels() {
    return (LibraryPhysicsModelsType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryPhysicsModels(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLibraryPhysicsModels(LibraryPhysicsModelsType newLibraryPhysicsModels, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryPhysicsModels(), newLibraryPhysicsModels, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibraryPhysicsModels(LibraryPhysicsModelsType newLibraryPhysicsModels) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryPhysicsModels(), newLibraryPhysicsModels);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryPhysicsScenesType getLibraryPhysicsScenes() {
    return (LibraryPhysicsScenesType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryPhysicsScenes(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLibraryPhysicsScenes(LibraryPhysicsScenesType newLibraryPhysicsScenes, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryPhysicsScenes(), newLibraryPhysicsScenes, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibraryPhysicsScenes(LibraryPhysicsScenesType newLibraryPhysicsScenes) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryPhysicsScenes(), newLibraryPhysicsScenes);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryVisualScenesType getLibraryVisualScenes() {
    return (LibraryVisualScenesType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryVisualScenes(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLibraryVisualScenes(LibraryVisualScenesType newLibraryVisualScenes, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryVisualScenes(), newLibraryVisualScenes, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibraryVisualScenes(LibraryVisualScenesType newLibraryVisualScenes) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_LibraryVisualScenes(), newLibraryVisualScenes);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightType getLight() {
    return (LightType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Light(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLight(LightType newLight, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Light(), newLight, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLight(LightType newLight) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Light(), newLight);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LinesType getLines() {
    return (LinesType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Lines(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLines(LinesType newLines, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Lines(), newLines, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLines(LinesType newLines) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Lines(), newLines);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LinestripsType getLinestrips() {
    return (LinestripsType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Linestrips(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLinestrips(LinestripsType newLinestrips, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Linestrips(), newLinestrips, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLinestrips(LinestripsType newLinestrips) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Linestrips(), newLinestrips);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LookatType getLookat() {
    return (LookatType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Lookat(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLookat(LookatType newLookat, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Lookat(), newLookat, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLookat(LookatType newLookat) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Lookat(), newLookat);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaterialType getMaterial() {
    return (MaterialType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Material(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMaterial(MaterialType newMaterial, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Material(), newMaterial, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMaterial(MaterialType newMaterial) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Material(), newMaterial);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MatrixType getMatrix() {
    return (MatrixType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Matrix(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMatrix(MatrixType newMatrix, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Matrix(), newMatrix, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMatrix(MatrixType newMatrix) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Matrix(), newMatrix);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MeshType getMesh() {
    return (MeshType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Mesh(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMesh(MeshType newMesh, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Mesh(), newMesh, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMesh(MeshType newMesh) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Mesh(), newMesh);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MorphType getMorph() {
    return (MorphType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Morph(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMorph(MorphType newMorph, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Morph(), newMorph, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMorph(MorphType newMorph) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Morph(), newMorph);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NameArrayType getNameArray() {
    return (NameArrayType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_NameArray(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetNameArray(NameArrayType newNameArray, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_NameArray(), newNameArray, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setNameArray(NameArrayType newNameArray) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_NameArray(), newNameArray);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NodeType1 getNode() {
    return (NodeType1)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Node(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetNode(NodeType1 newNode, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Node(), newNode, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setNode(NodeType1 newNode) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Node(), newNode);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public List<BigInteger> getP() {
    return (List<BigInteger>)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_P(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setP(List<BigInteger> newP) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_P(), newP);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ParamType4 getParam() {
    return (ParamType4)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Param(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetParam(ParamType4 newParam, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Param(), newParam, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setParam(ParamType4 newParam) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Param(), newParam);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhysicsMaterialType getPhysicsMaterial() {
    return (PhysicsMaterialType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_PhysicsMaterial(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPhysicsMaterial(PhysicsMaterialType newPhysicsMaterial, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_PhysicsMaterial(), newPhysicsMaterial, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPhysicsMaterial(PhysicsMaterialType newPhysicsMaterial) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_PhysicsMaterial(), newPhysicsMaterial);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhysicsModelType getPhysicsModel() {
    return (PhysicsModelType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_PhysicsModel(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPhysicsModel(PhysicsModelType newPhysicsModel, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_PhysicsModel(), newPhysicsModel, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPhysicsModel(PhysicsModelType newPhysicsModel) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_PhysicsModel(), newPhysicsModel);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhysicsSceneType getPhysicsScene() {
    return (PhysicsSceneType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_PhysicsScene(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPhysicsScene(PhysicsSceneType newPhysicsScene, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_PhysicsScene(), newPhysicsScene, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPhysicsScene(PhysicsSceneType newPhysicsScene) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_PhysicsScene(), newPhysicsScene);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PlaneType getPlane() {
    return (PlaneType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Plane(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPlane(PlaneType newPlane, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Plane(), newPlane, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPlane(PlaneType newPlane) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Plane(), newPlane);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PolygonsType getPolygons() {
    return (PolygonsType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Polygons(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPolygons(PolygonsType newPolygons, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Polygons(), newPolygons, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPolygons(PolygonsType newPolygons) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Polygons(), newPolygons);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PolylistType getPolylist() {
    return (PolylistType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Polylist(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPolylist(PolylistType newPolylist, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Polylist(), newPolylist, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPolylist(PolylistType newPolylist) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Polylist(), newPolylist);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ProfileCGType getProfileCG() {
    return (ProfileCGType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_ProfileCG(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetProfileCG(ProfileCGType newProfileCG, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_ProfileCG(), newProfileCG, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setProfileCG(ProfileCGType newProfileCG) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_ProfileCG(), newProfileCG);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ProfileCOMMONType getProfileCOMMON() {
    return (ProfileCOMMONType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_ProfileCOMMON(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetProfileCOMMON(ProfileCOMMONType newProfileCOMMON, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_ProfileCOMMON(), newProfileCOMMON, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setProfileCOMMON(ProfileCOMMONType newProfileCOMMON) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_ProfileCOMMON(), newProfileCOMMON);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ProfileGLESType getProfileGLES() {
    return (ProfileGLESType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_ProfileGLES(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetProfileGLES(ProfileGLESType newProfileGLES, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_ProfileGLES(), newProfileGLES, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setProfileGLES(ProfileGLESType newProfileGLES) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_ProfileGLES(), newProfileGLES);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ProfileGLSLType getProfileGLSL() {
    return (ProfileGLSLType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_ProfileGLSL(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetProfileGLSL(ProfileGLSLType newProfileGLSL, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_ProfileGLSL(), newProfileGLSL, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setProfileGLSL(ProfileGLSLType newProfileGLSL) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_ProfileGLSL(), newProfileGLSL);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RigidBodyType getRigidBody() {
    return (RigidBodyType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_RigidBody(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRigidBody(RigidBodyType newRigidBody, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_RigidBody(), newRigidBody, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRigidBody(RigidBodyType newRigidBody) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_RigidBody(), newRigidBody);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RigidConstraintType getRigidConstraint() {
    return (RigidConstraintType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_RigidConstraint(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRigidConstraint(RigidConstraintType newRigidConstraint, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_RigidConstraint(), newRigidConstraint, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRigidConstraint(RigidConstraintType newRigidConstraint) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_RigidConstraint(), newRigidConstraint);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RotateType getRotate() {
    return (RotateType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Rotate(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRotate(RotateType newRotate, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Rotate(), newRotate, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRotate(RotateType newRotate) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Rotate(), newRotate);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SamplerType getSampler() {
    return (SamplerType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Sampler(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSampler(SamplerType newSampler, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Sampler(), newSampler, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSampler(SamplerType newSampler) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Sampler(), newSampler);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat3 getScale() {
    return (TargetableFloat3)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Scale(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetScale(TargetableFloat3 newScale, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Scale(), newScale, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setScale(TargetableFloat3 newScale) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Scale(), newScale);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SkewType getSkew() {
    return (SkewType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Skew(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSkew(SkewType newSkew, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Skew(), newSkew, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSkew(SkewType newSkew) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Skew(), newSkew);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SkinType getSkin() {
    return (SkinType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Skin(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSkin(SkinType newSkin, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Skin(), newSkin, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSkin(SkinType newSkin) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Skin(), newSkin);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SourceType getSource() {
    return (SourceType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Source(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSource(SourceType newSource, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Source(), newSource, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSource(SourceType newSource) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Source(), newSource);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SphereType getSphere() {
    return (SphereType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Sphere(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSphere(SphereType newSphere, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Sphere(), newSphere, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSphere(SphereType newSphere) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Sphere(), newSphere);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SplineType getSpline() {
    return (SplineType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Spline(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSpline(SplineType newSpline, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Spline(), newSpline, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSpline(SplineType newSpline) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Spline(), newSpline);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TaperedCapsuleType getTaperedCapsule() {
    return (TaperedCapsuleType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_TaperedCapsule(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTaperedCapsule(TaperedCapsuleType newTaperedCapsule, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_TaperedCapsule(), newTaperedCapsule, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTaperedCapsule(TaperedCapsuleType newTaperedCapsule) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_TaperedCapsule(), newTaperedCapsule);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TaperedCylinderType getTaperedCylinder() {
    return (TaperedCylinderType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_TaperedCylinder(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTaperedCylinder(TaperedCylinderType newTaperedCylinder, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_TaperedCylinder(), newTaperedCylinder, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTaperedCylinder(TaperedCylinderType newTaperedCylinder) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_TaperedCylinder(), newTaperedCylinder);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueType4 getTechnique() {
    return (TechniqueType4)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Technique(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTechnique(TechniqueType4 newTechnique, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Technique(), newTechnique, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTechnique(TechniqueType4 newTechnique) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Technique(), newTechnique);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat3 getTranslate() {
    return (TargetableFloat3)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Translate(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTranslate(TargetableFloat3 newTranslate, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Translate(), newTranslate, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTranslate(TargetableFloat3 newTranslate) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Translate(), newTranslate);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TrianglesType getTriangles() {
    return (TrianglesType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Triangles(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTriangles(TrianglesType newTriangles, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Triangles(), newTriangles, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTriangles(TrianglesType newTriangles) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Triangles(), newTriangles);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TrifansType getTrifans() {
    return (TrifansType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Trifans(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTrifans(TrifansType newTrifans, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Trifans(), newTrifans, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTrifans(TrifansType newTrifans) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Trifans(), newTrifans);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TristripsType getTristrips() {
    return (TristripsType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Tristrips(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTristrips(TristripsType newTristrips, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Tristrips(), newTristrips, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTristrips(TristripsType newTristrips) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Tristrips(), newTristrips);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public VerticesType getVertices() {
    return (VerticesType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_Vertices(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetVertices(VerticesType newVertices, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_Vertices(), newVertices, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setVertices(VerticesType newVertices) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_Vertices(), newVertices);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public VisualSceneType getVisualScene() {
    return (VisualSceneType)getMixed().get(ColladaPackage.eINSTANCE.getDocumentRoot_VisualScene(), true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetVisualScene(VisualSceneType newVisualScene, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ColladaPackage.eINSTANCE.getDocumentRoot_VisualScene(), newVisualScene, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setVisualScene(VisualSceneType newVisualScene) {
    ((FeatureMap.Internal)getMixed()).set(ColladaPackage.eINSTANCE.getDocumentRoot_VisualScene(), newVisualScene);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case ColladaPackage.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
      case ColladaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case ColladaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case ColladaPackage.DOCUMENT_ROOT__ACCESSOR:
        return basicSetAccessor(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__ANIMATION:
        return basicSetAnimation(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__ANIMATION_CLIP:
        return basicSetAnimationClip(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__BIND_MATERIAL:
        return basicSetBindMaterial(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__BOOL_ARRAY:
        return basicSetBoolArray(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__BOX:
        return basicSetBox(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__CAMERA:
        return basicSetCamera(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__CAPSULE:
        return basicSetCapsule(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__CHANNEL:
        return basicSetChannel(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__COLLADA:
        return basicSetCOLLADA(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__CONTROLLER:
        return basicSetController(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__CONVEX_MESH:
        return basicSetConvexMesh(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__CYLINDER:
        return basicSetCylinder(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__EFFECT:
        return basicSetEffect(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__ELLIPSOID:
        return basicSetEllipsoid(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__EXTRA:
        return basicSetExtra(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__FLOAT_ARRAY:
        return basicSetFloatArray(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__FORCE_FIELD:
        return basicSetForceField(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__FX_PROFILE_ABSTRACT:
        return basicSetFxProfileAbstract(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__GEOMETRY:
        return basicSetGeometry(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__GL_HOOK_ABSTRACT:
        return basicSetGlHookAbstract(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__IDREF_ARRAY:
        return basicSetIDREFArray(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__IMAGE:
        return basicSetImage(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_CAMERA:
        return basicSetInstanceCamera(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_CONTROLLER:
        return basicSetInstanceController(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_EFFECT:
        return basicSetInstanceEffect(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_FORCE_FIELD:
        return basicSetInstanceForceField(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_GEOMETRY:
        return basicSetInstanceGeometry(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_LIGHT:
        return basicSetInstanceLight(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_MATERIAL:
        return basicSetInstanceMaterial(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_NODE:
        return basicSetInstanceNode(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_PHYSICS_MATERIAL:
        return basicSetInstancePhysicsMaterial(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_PHYSICS_MODEL:
        return basicSetInstancePhysicsModel(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_RIGID_BODY:
        return basicSetInstanceRigidBody(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_RIGID_CONSTRAINT:
        return basicSetInstanceRigidConstraint(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__INT_ARRAY:
        return basicSetIntArray(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_ANIMATION_CLIPS:
        return basicSetLibraryAnimationClips(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_ANIMATIONS:
        return basicSetLibraryAnimations(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_CAMERAS:
        return basicSetLibraryCameras(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_CONTROLLERS:
        return basicSetLibraryControllers(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_EFFECTS:
        return basicSetLibraryEffects(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_FORCE_FIELDS:
        return basicSetLibraryForceFields(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_GEOMETRIES:
        return basicSetLibraryGeometries(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_IMAGES:
        return basicSetLibraryImages(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_LIGHTS:
        return basicSetLibraryLights(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_MATERIALS:
        return basicSetLibraryMaterials(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_NODES:
        return basicSetLibraryNodes(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_PHYSICS_MATERIALS:
        return basicSetLibraryPhysicsMaterials(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_PHYSICS_MODELS:
        return basicSetLibraryPhysicsModels(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_PHYSICS_SCENES:
        return basicSetLibraryPhysicsScenes(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_VISUAL_SCENES:
        return basicSetLibraryVisualScenes(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LIGHT:
        return basicSetLight(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LINES:
        return basicSetLines(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LINESTRIPS:
        return basicSetLinestrips(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__LOOKAT:
        return basicSetLookat(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__MATERIAL:
        return basicSetMaterial(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__MATRIX:
        return basicSetMatrix(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__MESH:
        return basicSetMesh(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__MORPH:
        return basicSetMorph(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__NAME_ARRAY:
        return basicSetNameArray(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__NODE:
        return basicSetNode(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__PARAM:
        return basicSetParam(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__PHYSICS_MATERIAL:
        return basicSetPhysicsMaterial(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__PHYSICS_MODEL:
        return basicSetPhysicsModel(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__PHYSICS_SCENE:
        return basicSetPhysicsScene(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__PLANE:
        return basicSetPlane(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__POLYGONS:
        return basicSetPolygons(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__POLYLIST:
        return basicSetPolylist(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_CG:
        return basicSetProfileCG(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_COMMON:
        return basicSetProfileCOMMON(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_GLES:
        return basicSetProfileGLES(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_GLSL:
        return basicSetProfileGLSL(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__RIGID_BODY:
        return basicSetRigidBody(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__RIGID_CONSTRAINT:
        return basicSetRigidConstraint(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__ROTATE:
        return basicSetRotate(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__SAMPLER:
        return basicSetSampler(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__SCALE:
        return basicSetScale(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__SKEW:
        return basicSetSkew(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__SKIN:
        return basicSetSkin(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__SOURCE:
        return basicSetSource(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__SPHERE:
        return basicSetSphere(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__SPLINE:
        return basicSetSpline(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__TAPERED_CAPSULE:
        return basicSetTaperedCapsule(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__TAPERED_CYLINDER:
        return basicSetTaperedCylinder(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__TECHNIQUE:
        return basicSetTechnique(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__TRANSLATE:
        return basicSetTranslate(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__TRIANGLES:
        return basicSetTriangles(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__TRIFANS:
        return basicSetTrifans(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__TRISTRIPS:
        return basicSetTristrips(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__VERTICES:
        return basicSetVertices(null, msgs);
      case ColladaPackage.DOCUMENT_ROOT__VISUAL_SCENE:
        return basicSetVisualScene(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case ColladaPackage.DOCUMENT_ROOT__MIXED:
        if (coreType) return getMixed();
        return ((FeatureMap.Internal)getMixed()).getWrapper();
      case ColladaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case ColladaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case ColladaPackage.DOCUMENT_ROOT__ACCESSOR:
        return getAccessor();
      case ColladaPackage.DOCUMENT_ROOT__ANIMATION:
        return getAnimation();
      case ColladaPackage.DOCUMENT_ROOT__ANIMATION_CLIP:
        return getAnimationClip();
      case ColladaPackage.DOCUMENT_ROOT__ASSET:
        return getAsset();
      case ColladaPackage.DOCUMENT_ROOT__BIND_MATERIAL:
        return getBindMaterial();
      case ColladaPackage.DOCUMENT_ROOT__BOOL_ARRAY:
        return getBoolArray();
      case ColladaPackage.DOCUMENT_ROOT__BOX:
        return getBox();
      case ColladaPackage.DOCUMENT_ROOT__CAMERA:
        return getCamera();
      case ColladaPackage.DOCUMENT_ROOT__CAPSULE:
        return getCapsule();
      case ColladaPackage.DOCUMENT_ROOT__CHANNEL:
        return getChannel();
      case ColladaPackage.DOCUMENT_ROOT__COLLADA:
        return getCOLLADA();
      case ColladaPackage.DOCUMENT_ROOT__CONTROLLER:
        return getController();
      case ColladaPackage.DOCUMENT_ROOT__CONVEX_MESH:
        return getConvexMesh();
      case ColladaPackage.DOCUMENT_ROOT__CYLINDER:
        return getCylinder();
      case ColladaPackage.DOCUMENT_ROOT__EFFECT:
        return getEffect();
      case ColladaPackage.DOCUMENT_ROOT__ELLIPSOID:
        return getEllipsoid();
      case ColladaPackage.DOCUMENT_ROOT__EXTRA:
        return getExtra();
      case ColladaPackage.DOCUMENT_ROOT__FLOAT_ARRAY:
        return getFloatArray();
      case ColladaPackage.DOCUMENT_ROOT__FORCE_FIELD:
        return getForceField();
      case ColladaPackage.DOCUMENT_ROOT__FX_PROFILE_ABSTRACT:
        return getFxProfileAbstract();
      case ColladaPackage.DOCUMENT_ROOT__GEOMETRY:
        return getGeometry();
      case ColladaPackage.DOCUMENT_ROOT__GL_HOOK_ABSTRACT:
        return getGlHookAbstract();
      case ColladaPackage.DOCUMENT_ROOT__IDREF_ARRAY:
        return getIDREFArray();
      case ColladaPackage.DOCUMENT_ROOT__IMAGE:
        return getImage();
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_CAMERA:
        return getInstanceCamera();
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_CONTROLLER:
        return getInstanceController();
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_EFFECT:
        return getInstanceEffect();
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_FORCE_FIELD:
        return getInstanceForceField();
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_GEOMETRY:
        return getInstanceGeometry();
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_LIGHT:
        return getInstanceLight();
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_MATERIAL:
        return getInstanceMaterial();
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_NODE:
        return getInstanceNode();
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_PHYSICS_MATERIAL:
        return getInstancePhysicsMaterial();
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_PHYSICS_MODEL:
        return getInstancePhysicsModel();
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_RIGID_BODY:
        return getInstanceRigidBody();
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_RIGID_CONSTRAINT:
        return getInstanceRigidConstraint();
      case ColladaPackage.DOCUMENT_ROOT__INT_ARRAY:
        return getIntArray();
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_ANIMATION_CLIPS:
        return getLibraryAnimationClips();
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_ANIMATIONS:
        return getLibraryAnimations();
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_CAMERAS:
        return getLibraryCameras();
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_CONTROLLERS:
        return getLibraryControllers();
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_EFFECTS:
        return getLibraryEffects();
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_FORCE_FIELDS:
        return getLibraryForceFields();
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_GEOMETRIES:
        return getLibraryGeometries();
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_IMAGES:
        return getLibraryImages();
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_LIGHTS:
        return getLibraryLights();
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_MATERIALS:
        return getLibraryMaterials();
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_NODES:
        return getLibraryNodes();
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_PHYSICS_MATERIALS:
        return getLibraryPhysicsMaterials();
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_PHYSICS_MODELS:
        return getLibraryPhysicsModels();
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_PHYSICS_SCENES:
        return getLibraryPhysicsScenes();
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_VISUAL_SCENES:
        return getLibraryVisualScenes();
      case ColladaPackage.DOCUMENT_ROOT__LIGHT:
        return getLight();
      case ColladaPackage.DOCUMENT_ROOT__LINES:
        return getLines();
      case ColladaPackage.DOCUMENT_ROOT__LINESTRIPS:
        return getLinestrips();
      case ColladaPackage.DOCUMENT_ROOT__LOOKAT:
        return getLookat();
      case ColladaPackage.DOCUMENT_ROOT__MATERIAL:
        return getMaterial();
      case ColladaPackage.DOCUMENT_ROOT__MATRIX:
        return getMatrix();
      case ColladaPackage.DOCUMENT_ROOT__MESH:
        return getMesh();
      case ColladaPackage.DOCUMENT_ROOT__MORPH:
        return getMorph();
      case ColladaPackage.DOCUMENT_ROOT__NAME_ARRAY:
        return getNameArray();
      case ColladaPackage.DOCUMENT_ROOT__NODE:
        return getNode();
      case ColladaPackage.DOCUMENT_ROOT__P:
        return getP();
      case ColladaPackage.DOCUMENT_ROOT__PARAM:
        return getParam();
      case ColladaPackage.DOCUMENT_ROOT__PHYSICS_MATERIAL:
        return getPhysicsMaterial();
      case ColladaPackage.DOCUMENT_ROOT__PHYSICS_MODEL:
        return getPhysicsModel();
      case ColladaPackage.DOCUMENT_ROOT__PHYSICS_SCENE:
        return getPhysicsScene();
      case ColladaPackage.DOCUMENT_ROOT__PLANE:
        return getPlane();
      case ColladaPackage.DOCUMENT_ROOT__POLYGONS:
        return getPolygons();
      case ColladaPackage.DOCUMENT_ROOT__POLYLIST:
        return getPolylist();
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_CG:
        return getProfileCG();
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_COMMON:
        return getProfileCOMMON();
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_GLES:
        return getProfileGLES();
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_GLSL:
        return getProfileGLSL();
      case ColladaPackage.DOCUMENT_ROOT__RIGID_BODY:
        return getRigidBody();
      case ColladaPackage.DOCUMENT_ROOT__RIGID_CONSTRAINT:
        return getRigidConstraint();
      case ColladaPackage.DOCUMENT_ROOT__ROTATE:
        return getRotate();
      case ColladaPackage.DOCUMENT_ROOT__SAMPLER:
        return getSampler();
      case ColladaPackage.DOCUMENT_ROOT__SCALE:
        return getScale();
      case ColladaPackage.DOCUMENT_ROOT__SKEW:
        return getSkew();
      case ColladaPackage.DOCUMENT_ROOT__SKIN:
        return getSkin();
      case ColladaPackage.DOCUMENT_ROOT__SOURCE:
        return getSource();
      case ColladaPackage.DOCUMENT_ROOT__SPHERE:
        return getSphere();
      case ColladaPackage.DOCUMENT_ROOT__SPLINE:
        return getSpline();
      case ColladaPackage.DOCUMENT_ROOT__TAPERED_CAPSULE:
        return getTaperedCapsule();
      case ColladaPackage.DOCUMENT_ROOT__TAPERED_CYLINDER:
        return getTaperedCylinder();
      case ColladaPackage.DOCUMENT_ROOT__TECHNIQUE:
        return getTechnique();
      case ColladaPackage.DOCUMENT_ROOT__TRANSLATE:
        return getTranslate();
      case ColladaPackage.DOCUMENT_ROOT__TRIANGLES:
        return getTriangles();
      case ColladaPackage.DOCUMENT_ROOT__TRIFANS:
        return getTrifans();
      case ColladaPackage.DOCUMENT_ROOT__TRISTRIPS:
        return getTristrips();
      case ColladaPackage.DOCUMENT_ROOT__VERTICES:
        return getVertices();
      case ColladaPackage.DOCUMENT_ROOT__VISUAL_SCENE:
        return getVisualScene();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case ColladaPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)getMixed()).set(newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__ACCESSOR:
        setAccessor((AccessorType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__ANIMATION:
        setAnimation((AnimationType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__ANIMATION_CLIP:
        setAnimationClip((AnimationClipType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__BIND_MATERIAL:
        setBindMaterial((BindMaterialType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__BOOL_ARRAY:
        setBoolArray((BoolArrayType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__BOX:
        setBox((BoxType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__CAMERA:
        setCamera((CameraType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__CAPSULE:
        setCapsule((CapsuleType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__CHANNEL:
        setChannel((ChannelType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__COLLADA:
        setCOLLADA((COLLADAType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__CONTROLLER:
        setController((ControllerType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__CONVEX_MESH:
        setConvexMesh((ConvexMeshType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__CYLINDER:
        setCylinder((CylinderType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__EFFECT:
        setEffect((EffectType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__ELLIPSOID:
        setEllipsoid((EllipsoidType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__EXTRA:
        setExtra((ExtraType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__FLOAT_ARRAY:
        setFloatArray((FloatArrayType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__FORCE_FIELD:
        setForceField((ForceFieldType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__GEOMETRY:
        setGeometry((GeometryType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__IDREF_ARRAY:
        setIDREFArray((IDREFArrayType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__IMAGE:
        setImage((ImageType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_CAMERA:
        setInstanceCamera((InstanceWithExtra)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_CONTROLLER:
        setInstanceController((InstanceControllerType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_EFFECT:
        setInstanceEffect((InstanceEffectType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_FORCE_FIELD:
        setInstanceForceField((InstanceWithExtra)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_GEOMETRY:
        setInstanceGeometry((InstanceGeometryType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_LIGHT:
        setInstanceLight((InstanceWithExtra)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_MATERIAL:
        setInstanceMaterial((InstanceMaterialType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_NODE:
        setInstanceNode((InstanceWithExtra)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_PHYSICS_MATERIAL:
        setInstancePhysicsMaterial((InstanceWithExtra)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_PHYSICS_MODEL:
        setInstancePhysicsModel((InstancePhysicsModelType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_RIGID_BODY:
        setInstanceRigidBody((InstanceRigidBodyType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_RIGID_CONSTRAINT:
        setInstanceRigidConstraint((InstanceRigidConstraintType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INT_ARRAY:
        setIntArray((IntArrayType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_ANIMATION_CLIPS:
        setLibraryAnimationClips((LibraryAnimationClipsType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_ANIMATIONS:
        setLibraryAnimations((LibraryAnimationsType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_CAMERAS:
        setLibraryCameras((LibraryCamerasType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_CONTROLLERS:
        setLibraryControllers((LibraryControllersType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_EFFECTS:
        setLibraryEffects((LibraryEffectsType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_FORCE_FIELDS:
        setLibraryForceFields((LibraryForceFieldsType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_GEOMETRIES:
        setLibraryGeometries((LibraryGeometriesType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_IMAGES:
        setLibraryImages((LibraryImagesType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_LIGHTS:
        setLibraryLights((LibraryLightsType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_MATERIALS:
        setLibraryMaterials((LibraryMaterialsType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_NODES:
        setLibraryNodes((LibraryNodesType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_PHYSICS_MATERIALS:
        setLibraryPhysicsMaterials((LibraryPhysicsMaterialsType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_PHYSICS_MODELS:
        setLibraryPhysicsModels((LibraryPhysicsModelsType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_PHYSICS_SCENES:
        setLibraryPhysicsScenes((LibraryPhysicsScenesType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_VISUAL_SCENES:
        setLibraryVisualScenes((LibraryVisualScenesType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIGHT:
        setLight((LightType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LINES:
        setLines((LinesType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LINESTRIPS:
        setLinestrips((LinestripsType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LOOKAT:
        setLookat((LookatType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__MATERIAL:
        setMaterial((MaterialType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__MATRIX:
        setMatrix((MatrixType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__MESH:
        setMesh((MeshType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__MORPH:
        setMorph((MorphType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__NAME_ARRAY:
        setNameArray((NameArrayType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__NODE:
        setNode((NodeType1)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__P:
        setP((List<BigInteger>)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PARAM:
        setParam((ParamType4)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PHYSICS_MATERIAL:
        setPhysicsMaterial((PhysicsMaterialType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PHYSICS_MODEL:
        setPhysicsModel((PhysicsModelType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PHYSICS_SCENE:
        setPhysicsScene((PhysicsSceneType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PLANE:
        setPlane((PlaneType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__POLYGONS:
        setPolygons((PolygonsType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__POLYLIST:
        setPolylist((PolylistType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_CG:
        setProfileCG((ProfileCGType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_COMMON:
        setProfileCOMMON((ProfileCOMMONType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_GLES:
        setProfileGLES((ProfileGLESType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_GLSL:
        setProfileGLSL((ProfileGLSLType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__RIGID_BODY:
        setRigidBody((RigidBodyType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__RIGID_CONSTRAINT:
        setRigidConstraint((RigidConstraintType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__ROTATE:
        setRotate((RotateType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__SAMPLER:
        setSampler((SamplerType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__SCALE:
        setScale((TargetableFloat3)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__SKEW:
        setSkew((SkewType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__SKIN:
        setSkin((SkinType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__SOURCE:
        setSource((SourceType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__SPHERE:
        setSphere((SphereType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__SPLINE:
        setSpline((SplineType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__TAPERED_CAPSULE:
        setTaperedCapsule((TaperedCapsuleType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__TAPERED_CYLINDER:
        setTaperedCylinder((TaperedCylinderType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__TECHNIQUE:
        setTechnique((TechniqueType4)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__TRANSLATE:
        setTranslate((TargetableFloat3)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__TRIANGLES:
        setTriangles((TrianglesType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__TRIFANS:
        setTrifans((TrifansType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__TRISTRIPS:
        setTristrips((TristripsType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__VERTICES:
        setVertices((VerticesType)newValue);
        return;
      case ColladaPackage.DOCUMENT_ROOT__VISUAL_SCENE:
        setVisualScene((VisualSceneType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID)
    {
      case ColladaPackage.DOCUMENT_ROOT__MIXED:
        getMixed().clear();
        return;
      case ColladaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case ColladaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case ColladaPackage.DOCUMENT_ROOT__ACCESSOR:
        setAccessor((AccessorType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__ANIMATION:
        setAnimation((AnimationType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__ANIMATION_CLIP:
        setAnimationClip((AnimationClipType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__BIND_MATERIAL:
        setBindMaterial((BindMaterialType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__BOOL_ARRAY:
        setBoolArray((BoolArrayType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__BOX:
        setBox((BoxType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__CAMERA:
        setCamera((CameraType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__CAPSULE:
        setCapsule((CapsuleType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__CHANNEL:
        setChannel((ChannelType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__COLLADA:
        setCOLLADA((COLLADAType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__CONTROLLER:
        setController((ControllerType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__CONVEX_MESH:
        setConvexMesh((ConvexMeshType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__CYLINDER:
        setCylinder((CylinderType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__EFFECT:
        setEffect((EffectType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__ELLIPSOID:
        setEllipsoid((EllipsoidType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__EXTRA:
        setExtra((ExtraType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__FLOAT_ARRAY:
        setFloatArray((FloatArrayType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__FORCE_FIELD:
        setForceField((ForceFieldType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__GEOMETRY:
        setGeometry((GeometryType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__IDREF_ARRAY:
        setIDREFArray((IDREFArrayType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__IMAGE:
        setImage((ImageType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_CAMERA:
        setInstanceCamera((InstanceWithExtra)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_CONTROLLER:
        setInstanceController((InstanceControllerType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_EFFECT:
        setInstanceEffect((InstanceEffectType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_FORCE_FIELD:
        setInstanceForceField((InstanceWithExtra)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_GEOMETRY:
        setInstanceGeometry((InstanceGeometryType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_LIGHT:
        setInstanceLight((InstanceWithExtra)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_MATERIAL:
        setInstanceMaterial((InstanceMaterialType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_NODE:
        setInstanceNode((InstanceWithExtra)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_PHYSICS_MATERIAL:
        setInstancePhysicsMaterial((InstanceWithExtra)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_PHYSICS_MODEL:
        setInstancePhysicsModel((InstancePhysicsModelType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_RIGID_BODY:
        setInstanceRigidBody((InstanceRigidBodyType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_RIGID_CONSTRAINT:
        setInstanceRigidConstraint((InstanceRigidConstraintType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__INT_ARRAY:
        setIntArray((IntArrayType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_ANIMATION_CLIPS:
        setLibraryAnimationClips((LibraryAnimationClipsType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_ANIMATIONS:
        setLibraryAnimations((LibraryAnimationsType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_CAMERAS:
        setLibraryCameras((LibraryCamerasType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_CONTROLLERS:
        setLibraryControllers((LibraryControllersType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_EFFECTS:
        setLibraryEffects((LibraryEffectsType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_FORCE_FIELDS:
        setLibraryForceFields((LibraryForceFieldsType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_GEOMETRIES:
        setLibraryGeometries((LibraryGeometriesType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_IMAGES:
        setLibraryImages((LibraryImagesType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_LIGHTS:
        setLibraryLights((LibraryLightsType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_MATERIALS:
        setLibraryMaterials((LibraryMaterialsType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_NODES:
        setLibraryNodes((LibraryNodesType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_PHYSICS_MATERIALS:
        setLibraryPhysicsMaterials((LibraryPhysicsMaterialsType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_PHYSICS_MODELS:
        setLibraryPhysicsModels((LibraryPhysicsModelsType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_PHYSICS_SCENES:
        setLibraryPhysicsScenes((LibraryPhysicsScenesType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_VISUAL_SCENES:
        setLibraryVisualScenes((LibraryVisualScenesType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LIGHT:
        setLight((LightType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LINES:
        setLines((LinesType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LINESTRIPS:
        setLinestrips((LinestripsType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__LOOKAT:
        setLookat((LookatType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__MATERIAL:
        setMaterial((MaterialType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__MATRIX:
        setMatrix((MatrixType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__MESH:
        setMesh((MeshType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__MORPH:
        setMorph((MorphType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__NAME_ARRAY:
        setNameArray((NameArrayType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__NODE:
        setNode((NodeType1)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__P:
        setP(P_EDEFAULT);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PARAM:
        setParam((ParamType4)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PHYSICS_MATERIAL:
        setPhysicsMaterial((PhysicsMaterialType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PHYSICS_MODEL:
        setPhysicsModel((PhysicsModelType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PHYSICS_SCENE:
        setPhysicsScene((PhysicsSceneType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PLANE:
        setPlane((PlaneType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__POLYGONS:
        setPolygons((PolygonsType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__POLYLIST:
        setPolylist((PolylistType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_CG:
        setProfileCG((ProfileCGType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_COMMON:
        setProfileCOMMON((ProfileCOMMONType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_GLES:
        setProfileGLES((ProfileGLESType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_GLSL:
        setProfileGLSL((ProfileGLSLType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__RIGID_BODY:
        setRigidBody((RigidBodyType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__RIGID_CONSTRAINT:
        setRigidConstraint((RigidConstraintType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__ROTATE:
        setRotate((RotateType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__SAMPLER:
        setSampler((SamplerType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__SCALE:
        setScale((TargetableFloat3)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__SKEW:
        setSkew((SkewType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__SKIN:
        setSkin((SkinType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__SOURCE:
        setSource((SourceType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__SPHERE:
        setSphere((SphereType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__SPLINE:
        setSpline((SplineType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__TAPERED_CAPSULE:
        setTaperedCapsule((TaperedCapsuleType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__TAPERED_CYLINDER:
        setTaperedCylinder((TaperedCylinderType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__TECHNIQUE:
        setTechnique((TechniqueType4)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__TRANSLATE:
        setTranslate((TargetableFloat3)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__TRIANGLES:
        setTriangles((TrianglesType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__TRIFANS:
        setTrifans((TrifansType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__TRISTRIPS:
        setTristrips((TristripsType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__VERTICES:
        setVertices((VerticesType)null);
        return;
      case ColladaPackage.DOCUMENT_ROOT__VISUAL_SCENE:
        setVisualScene((VisualSceneType)null);
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID)
    {
      case ColladaPackage.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.isEmpty();
      case ColladaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case ColladaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case ColladaPackage.DOCUMENT_ROOT__ACCESSOR:
        return getAccessor() != null;
      case ColladaPackage.DOCUMENT_ROOT__ANIMATION:
        return getAnimation() != null;
      case ColladaPackage.DOCUMENT_ROOT__ANIMATION_CLIP:
        return getAnimationClip() != null;
      case ColladaPackage.DOCUMENT_ROOT__ASSET:
        return getAsset() != null;
      case ColladaPackage.DOCUMENT_ROOT__BIND_MATERIAL:
        return getBindMaterial() != null;
      case ColladaPackage.DOCUMENT_ROOT__BOOL_ARRAY:
        return getBoolArray() != null;
      case ColladaPackage.DOCUMENT_ROOT__BOX:
        return getBox() != null;
      case ColladaPackage.DOCUMENT_ROOT__CAMERA:
        return getCamera() != null;
      case ColladaPackage.DOCUMENT_ROOT__CAPSULE:
        return getCapsule() != null;
      case ColladaPackage.DOCUMENT_ROOT__CHANNEL:
        return getChannel() != null;
      case ColladaPackage.DOCUMENT_ROOT__COLLADA:
        return getCOLLADA() != null;
      case ColladaPackage.DOCUMENT_ROOT__CONTROLLER:
        return getController() != null;
      case ColladaPackage.DOCUMENT_ROOT__CONVEX_MESH:
        return getConvexMesh() != null;
      case ColladaPackage.DOCUMENT_ROOT__CYLINDER:
        return getCylinder() != null;
      case ColladaPackage.DOCUMENT_ROOT__EFFECT:
        return getEffect() != null;
      case ColladaPackage.DOCUMENT_ROOT__ELLIPSOID:
        return getEllipsoid() != null;
      case ColladaPackage.DOCUMENT_ROOT__EXTRA:
        return getExtra() != null;
      case ColladaPackage.DOCUMENT_ROOT__FLOAT_ARRAY:
        return getFloatArray() != null;
      case ColladaPackage.DOCUMENT_ROOT__FORCE_FIELD:
        return getForceField() != null;
      case ColladaPackage.DOCUMENT_ROOT__FX_PROFILE_ABSTRACT:
        return getFxProfileAbstract() != null;
      case ColladaPackage.DOCUMENT_ROOT__GEOMETRY:
        return getGeometry() != null;
      case ColladaPackage.DOCUMENT_ROOT__GL_HOOK_ABSTRACT:
        return getGlHookAbstract() != null;
      case ColladaPackage.DOCUMENT_ROOT__IDREF_ARRAY:
        return getIDREFArray() != null;
      case ColladaPackage.DOCUMENT_ROOT__IMAGE:
        return getImage() != null;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_CAMERA:
        return getInstanceCamera() != null;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_CONTROLLER:
        return getInstanceController() != null;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_EFFECT:
        return getInstanceEffect() != null;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_FORCE_FIELD:
        return getInstanceForceField() != null;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_GEOMETRY:
        return getInstanceGeometry() != null;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_LIGHT:
        return getInstanceLight() != null;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_MATERIAL:
        return getInstanceMaterial() != null;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_NODE:
        return getInstanceNode() != null;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_PHYSICS_MATERIAL:
        return getInstancePhysicsMaterial() != null;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_PHYSICS_MODEL:
        return getInstancePhysicsModel() != null;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_RIGID_BODY:
        return getInstanceRigidBody() != null;
      case ColladaPackage.DOCUMENT_ROOT__INSTANCE_RIGID_CONSTRAINT:
        return getInstanceRigidConstraint() != null;
      case ColladaPackage.DOCUMENT_ROOT__INT_ARRAY:
        return getIntArray() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_ANIMATION_CLIPS:
        return getLibraryAnimationClips() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_ANIMATIONS:
        return getLibraryAnimations() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_CAMERAS:
        return getLibraryCameras() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_CONTROLLERS:
        return getLibraryControllers() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_EFFECTS:
        return getLibraryEffects() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_FORCE_FIELDS:
        return getLibraryForceFields() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_GEOMETRIES:
        return getLibraryGeometries() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_IMAGES:
        return getLibraryImages() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_LIGHTS:
        return getLibraryLights() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_MATERIALS:
        return getLibraryMaterials() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_NODES:
        return getLibraryNodes() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_PHYSICS_MATERIALS:
        return getLibraryPhysicsMaterials() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_PHYSICS_MODELS:
        return getLibraryPhysicsModels() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_PHYSICS_SCENES:
        return getLibraryPhysicsScenes() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIBRARY_VISUAL_SCENES:
        return getLibraryVisualScenes() != null;
      case ColladaPackage.DOCUMENT_ROOT__LIGHT:
        return getLight() != null;
      case ColladaPackage.DOCUMENT_ROOT__LINES:
        return getLines() != null;
      case ColladaPackage.DOCUMENT_ROOT__LINESTRIPS:
        return getLinestrips() != null;
      case ColladaPackage.DOCUMENT_ROOT__LOOKAT:
        return getLookat() != null;
      case ColladaPackage.DOCUMENT_ROOT__MATERIAL:
        return getMaterial() != null;
      case ColladaPackage.DOCUMENT_ROOT__MATRIX:
        return getMatrix() != null;
      case ColladaPackage.DOCUMENT_ROOT__MESH:
        return getMesh() != null;
      case ColladaPackage.DOCUMENT_ROOT__MORPH:
        return getMorph() != null;
      case ColladaPackage.DOCUMENT_ROOT__NAME_ARRAY:
        return getNameArray() != null;
      case ColladaPackage.DOCUMENT_ROOT__NODE:
        return getNode() != null;
      case ColladaPackage.DOCUMENT_ROOT__P:
        return P_EDEFAULT == null ? getP() != null : !P_EDEFAULT.equals(getP());
      case ColladaPackage.DOCUMENT_ROOT__PARAM:
        return getParam() != null;
      case ColladaPackage.DOCUMENT_ROOT__PHYSICS_MATERIAL:
        return getPhysicsMaterial() != null;
      case ColladaPackage.DOCUMENT_ROOT__PHYSICS_MODEL:
        return getPhysicsModel() != null;
      case ColladaPackage.DOCUMENT_ROOT__PHYSICS_SCENE:
        return getPhysicsScene() != null;
      case ColladaPackage.DOCUMENT_ROOT__PLANE:
        return getPlane() != null;
      case ColladaPackage.DOCUMENT_ROOT__POLYGONS:
        return getPolygons() != null;
      case ColladaPackage.DOCUMENT_ROOT__POLYLIST:
        return getPolylist() != null;
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_CG:
        return getProfileCG() != null;
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_COMMON:
        return getProfileCOMMON() != null;
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_GLES:
        return getProfileGLES() != null;
      case ColladaPackage.DOCUMENT_ROOT__PROFILE_GLSL:
        return getProfileGLSL() != null;
      case ColladaPackage.DOCUMENT_ROOT__RIGID_BODY:
        return getRigidBody() != null;
      case ColladaPackage.DOCUMENT_ROOT__RIGID_CONSTRAINT:
        return getRigidConstraint() != null;
      case ColladaPackage.DOCUMENT_ROOT__ROTATE:
        return getRotate() != null;
      case ColladaPackage.DOCUMENT_ROOT__SAMPLER:
        return getSampler() != null;
      case ColladaPackage.DOCUMENT_ROOT__SCALE:
        return getScale() != null;
      case ColladaPackage.DOCUMENT_ROOT__SKEW:
        return getSkew() != null;
      case ColladaPackage.DOCUMENT_ROOT__SKIN:
        return getSkin() != null;
      case ColladaPackage.DOCUMENT_ROOT__SOURCE:
        return getSource() != null;
      case ColladaPackage.DOCUMENT_ROOT__SPHERE:
        return getSphere() != null;
      case ColladaPackage.DOCUMENT_ROOT__SPLINE:
        return getSpline() != null;
      case ColladaPackage.DOCUMENT_ROOT__TAPERED_CAPSULE:
        return getTaperedCapsule() != null;
      case ColladaPackage.DOCUMENT_ROOT__TAPERED_CYLINDER:
        return getTaperedCylinder() != null;
      case ColladaPackage.DOCUMENT_ROOT__TECHNIQUE:
        return getTechnique() != null;
      case ColladaPackage.DOCUMENT_ROOT__TRANSLATE:
        return getTranslate() != null;
      case ColladaPackage.DOCUMENT_ROOT__TRIANGLES:
        return getTriangles() != null;
      case ColladaPackage.DOCUMENT_ROOT__TRIFANS:
        return getTrifans() != null;
      case ColladaPackage.DOCUMENT_ROOT__TRISTRIPS:
        return getTristrips() != null;
      case ColladaPackage.DOCUMENT_ROOT__VERTICES:
        return getVertices() != null;
      case ColladaPackage.DOCUMENT_ROOT__VISUAL_SCENE:
        return getVisualScene() != null;
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (mixed: ");
    result.append(mixed);
    result.append(')');
    return result.toString();
  }

} //DocumentRootImpl
