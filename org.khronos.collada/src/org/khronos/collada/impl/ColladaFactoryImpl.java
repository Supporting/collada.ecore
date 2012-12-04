/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.khronos.collada.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColladaFactoryImpl extends EFactoryImpl implements ColladaFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static ColladaFactory init() {
    try
    {
      ColladaFactory theColladaFactory = (ColladaFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.collada.org/2005/11/COLLADASchema"); 
      if (theColladaFactory != null)
      {
        return theColladaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ColladaFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColladaFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case ColladaPackage.ACCESSOR_TYPE: return createAccessorType();
      case ColladaPackage.ALL_TYPE: return createAllType();
      case ColladaPackage.ALL_TYPE1: return createAllType1();
      case ColladaPackage.ALL_TYPE2: return createAllType2();
      case ColladaPackage.ALPHA_FUNC_TYPE: return createAlphaFuncType();
      case ColladaPackage.ALPHA_FUNC_TYPE1: return createAlphaFuncType1();
      case ColladaPackage.ALPHA_TEST_ENABLE_TYPE: return createAlphaTestEnableType();
      case ColladaPackage.ALPHA_TEST_ENABLE_TYPE1: return createAlphaTestEnableType1();
      case ColladaPackage.ALPHA_TYPE: return createAlphaType();
      case ColladaPackage.AMBIENT_TYPE: return createAmbientType();
      case ColladaPackage.ANGULAR_TYPE: return createAngularType();
      case ColladaPackage.ANIMATION_CLIP_TYPE: return createAnimationClipType();
      case ColladaPackage.ANIMATION_TYPE: return createAnimationType();
      case ColladaPackage.ASSET_TYPE: return createAssetType();
      case ColladaPackage.ATTACHMENT_TYPE: return createAttachmentType();
      case ColladaPackage.AUTO_NORMAL_ENABLE_TYPE: return createAutoNormalEnableType();
      case ColladaPackage.BACK_TYPE: return createBackType();
      case ColladaPackage.BIND_MATERIAL_TYPE: return createBindMaterialType();
      case ColladaPackage.BIND_TYPE: return createBindType();
      case ColladaPackage.BIND_TYPE1: return createBindType1();
      case ColladaPackage.BIND_TYPE2: return createBindType2();
      case ColladaPackage.BIND_VERTEX_INPUT_TYPE: return createBindVertexInputType();
      case ColladaPackage.BLEND_COLOR_TYPE: return createBlendColorType();
      case ColladaPackage.BLEND_ENABLE_TYPE: return createBlendEnableType();
      case ColladaPackage.BLEND_ENABLE_TYPE1: return createBlendEnableType1();
      case ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE: return createBlendEquationSeparateType();
      case ColladaPackage.BLEND_EQUATION_TYPE: return createBlendEquationType();
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE: return createBlendFuncSeparateType();
      case ColladaPackage.BLEND_FUNC_TYPE: return createBlendFuncType();
      case ColladaPackage.BLEND_FUNC_TYPE1: return createBlendFuncType1();
      case ColladaPackage.BLINN_TYPE: return createBlinnType();
      case ColladaPackage.BOOL_ARRAY_TYPE: return createBoolArrayType();
      case ColladaPackage.BOX_TYPE: return createBoxType();
      case ColladaPackage.CAMERA_TYPE: return createCameraType();
      case ColladaPackage.CAPSULE_TYPE: return createCapsuleType();
      case ColladaPackage.CG_CONNECT_PARAM: return createCgConnectParam();
      case ColladaPackage.CG_NEWARRAY_TYPE: return createCgNewarrayType();
      case ColladaPackage.CG_NEWPARAM: return createCgNewparam();
      case ColladaPackage.CG_SAMPLER1_D: return createCgSampler1D();
      case ColladaPackage.CG_SAMPLER2_D: return createCgSampler2D();
      case ColladaPackage.CG_SAMPLER3_D: return createCgSampler3D();
      case ColladaPackage.CG_SAMPLER_CUBE: return createCgSamplerCUBE();
      case ColladaPackage.CG_SAMPLER_DEPTH: return createCgSamplerDEPTH();
      case ColladaPackage.CG_SAMPLER_RECT: return createCgSamplerRECT();
      case ColladaPackage.CG_SETARRAY_TYPE: return createCgSetarrayType();
      case ColladaPackage.CG_SETPARAM: return createCgSetparam();
      case ColladaPackage.CG_SETPARAM_SIMPLE: return createCgSetparamSimple();
      case ColladaPackage.CG_SETUSER_TYPE: return createCgSetuserType();
      case ColladaPackage.CG_SURFACE_TYPE: return createCgSurfaceType();
      case ColladaPackage.CHANNEL_TYPE: return createChannelType();
      case ColladaPackage.CLEAR_COLOR_TYPE: return createClearColorType();
      case ColladaPackage.CLEAR_COLOR_TYPE1: return createClearColorType1();
      case ColladaPackage.CLEAR_DEPTH_TYPE: return createClearDepthType();
      case ColladaPackage.CLEAR_DEPTH_TYPE1: return createClearDepthType1();
      case ColladaPackage.CLEAR_STENCIL_TYPE: return createClearStencilType();
      case ColladaPackage.CLEAR_STENCIL_TYPE1: return createClearStencilType1();
      case ColladaPackage.CLIP_PLANE_ENABLE_TYPE: return createClipPlaneEnableType();
      case ColladaPackage.CLIP_PLANE_ENABLE_TYPE1: return createClipPlaneEnableType1();
      case ColladaPackage.CLIP_PLANE_TYPE: return createClipPlaneType();
      case ColladaPackage.CLIP_PLANE_TYPE1: return createClipPlaneType1();
      case ColladaPackage.COLLADA_TYPE: return createCOLLADAType();
      case ColladaPackage.COLOR_LOGIC_OP_ENABLE_TYPE: return createColorLogicOpEnableType();
      case ColladaPackage.COLOR_LOGIC_OP_ENABLE_TYPE1: return createColorLogicOpEnableType1();
      case ColladaPackage.COLOR_MASK_TYPE: return createColorMaskType();
      case ColladaPackage.COLOR_MASK_TYPE1: return createColorMaskType1();
      case ColladaPackage.COLOR_MATERIAL_ENABLE_TYPE: return createColorMaterialEnableType();
      case ColladaPackage.COLOR_MATERIAL_ENABLE_TYPE1: return createColorMaterialEnableType1();
      case ColladaPackage.COLOR_MATERIAL_TYPE: return createColorMaterialType();
      case ColladaPackage.COLOR_TYPE: return createColorType();
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE: return createCommonColorOrTextureType();
      case ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE: return createCommonFloatOrParamType();
      case ColladaPackage.COMMON_NEWPARAM_TYPE: return createCommonNewparamType();
      case ColladaPackage.COMMON_TRANSPARENT_TYPE: return createCommonTransparentType();
      case ColladaPackage.COMPILER_TARGET_TYPE: return createCompilerTargetType();
      case ColladaPackage.COMPILER_TARGET_TYPE1: return createCompilerTargetType1();
      case ColladaPackage.CONSTANT_TYPE: return createConstantType();
      case ColladaPackage.CONTRIBUTOR_TYPE: return createContributorType();
      case ColladaPackage.CONTROLLER_TYPE: return createControllerType();
      case ColladaPackage.CONTROL_VERTICES_TYPE: return createControlVerticesType();
      case ColladaPackage.CONVEX_MESH_TYPE: return createConvexMeshType();
      case ColladaPackage.CULL_FACE_ENABLE_TYPE: return createCullFaceEnableType();
      case ColladaPackage.CULL_FACE_ENABLE_TYPE1: return createCullFaceEnableType1();
      case ColladaPackage.CULL_FACE_TYPE: return createCullFaceType();
      case ColladaPackage.CULL_FACE_TYPE1: return createCullFaceType1();
      case ColladaPackage.CYLINDER_TYPE: return createCylinderType();
      case ColladaPackage.DEPTH_BOUNDS_ENABLE_TYPE: return createDepthBoundsEnableType();
      case ColladaPackage.DEPTH_BOUNDS_TYPE: return createDepthBoundsType();
      case ColladaPackage.DEPTH_CLAMP_ENABLE_TYPE: return createDepthClampEnableType();
      case ColladaPackage.DEPTH_FUNC_TYPE: return createDepthFuncType();
      case ColladaPackage.DEPTH_FUNC_TYPE1: return createDepthFuncType1();
      case ColladaPackage.DEPTH_MASK_TYPE: return createDepthMaskType();
      case ColladaPackage.DEPTH_MASK_TYPE1: return createDepthMaskType1();
      case ColladaPackage.DEPTH_RANGE_TYPE: return createDepthRangeType();
      case ColladaPackage.DEPTH_RANGE_TYPE1: return createDepthRangeType1();
      case ColladaPackage.DEPTH_TEST_ENABLE_TYPE: return createDepthTestEnableType();
      case ColladaPackage.DEPTH_TEST_ENABLE_TYPE1: return createDepthTestEnableType1();
      case ColladaPackage.DEST_ALPHA_TYPE: return createDestAlphaType();
      case ColladaPackage.DEST_RGB_TYPE: return createDestRgbType();
      case ColladaPackage.DEST_TYPE: return createDestType();
      case ColladaPackage.DEST_TYPE1: return createDestType1();
      case ColladaPackage.DIRECTIONAL_TYPE: return createDirectionalType();
      case ColladaPackage.DITHER_ENABLE_TYPE: return createDitherEnableType();
      case ColladaPackage.DITHER_ENABLE_TYPE1: return createDitherEnableType1();
      case ColladaPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case ColladaPackage.DYNAMIC_TYPE: return createDynamicType();
      case ColladaPackage.DYNAMIC_TYPE1: return createDynamicType1();
      case ColladaPackage.EFFECT_TYPE: return createEffectType();
      case ColladaPackage.ELLIPSOID_TYPE: return createEllipsoidType();
      case ColladaPackage.ENABLED_TYPE: return createEnabledType();
      case ColladaPackage.EVALUATE_SCENE_TYPE: return createEvaluateSceneType();
      case ColladaPackage.EXTRA_TYPE: return createExtraType();
      case ColladaPackage.FACE_TYPE: return createFaceType();
      case ColladaPackage.FACE_TYPE1: return createFaceType1();
      case ColladaPackage.FACE_TYPE2: return createFaceType2();
      case ColladaPackage.FACE_TYPE3: return createFaceType3();
      case ColladaPackage.FACE_TYPE4: return createFaceType4();
      case ColladaPackage.FAIL_TYPE: return createFailType();
      case ColladaPackage.FAIL_TYPE1: return createFailType1();
      case ColladaPackage.FAIL_TYPE2: return createFailType2();
      case ColladaPackage.FLOAT_ARRAY_TYPE: return createFloatArrayType();
      case ColladaPackage.FLOAT_TYPE: return createFloatType();
      case ColladaPackage.FOG_COLOR_TYPE: return createFogColorType();
      case ColladaPackage.FOG_COLOR_TYPE1: return createFogColorType1();
      case ColladaPackage.FOG_COORD_SRC_TYPE: return createFogCoordSrcType();
      case ColladaPackage.FOG_DENSITY_TYPE: return createFogDensityType();
      case ColladaPackage.FOG_DENSITY_TYPE1: return createFogDensityType1();
      case ColladaPackage.FOG_ENABLE_TYPE: return createFogEnableType();
      case ColladaPackage.FOG_ENABLE_TYPE1: return createFogEnableType1();
      case ColladaPackage.FOG_END_TYPE: return createFogEndType();
      case ColladaPackage.FOG_END_TYPE1: return createFogEndType1();
      case ColladaPackage.FOG_MODE_TYPE: return createFogModeType();
      case ColladaPackage.FOG_MODE_TYPE1: return createFogModeType1();
      case ColladaPackage.FOG_START_TYPE: return createFogStartType();
      case ColladaPackage.FOG_START_TYPE1: return createFogStartType1();
      case ColladaPackage.FORCE_FIELD_TYPE: return createForceFieldType();
      case ColladaPackage.FRONT_FACE_TYPE: return createFrontFaceType();
      case ColladaPackage.FRONT_FACE_TYPE1: return createFrontFaceType1();
      case ColladaPackage.FRONT_TYPE: return createFrontType();
      case ColladaPackage.FUNC_TYPE: return createFuncType();
      case ColladaPackage.FUNC_TYPE1: return createFuncType1();
      case ColladaPackage.FUNC_TYPE2: return createFuncType2();
      case ColladaPackage.FUNC_TYPE3: return createFuncType3();
      case ColladaPackage.FX_ANNOTATE_COMMON: return createFxAnnotateCommon();
      case ColladaPackage.FX_CLEARCOLOR_COMMON: return createFxClearcolorCommon();
      case ColladaPackage.FX_CLEARDEPTH_COMMON: return createFxCleardepthCommon();
      case ColladaPackage.FX_CLEARSTENCIL_COMMON: return createFxClearstencilCommon();
      case ColladaPackage.FX_CODE_PROFILE: return createFxCodeProfile();
      case ColladaPackage.FX_COLORTARGET_COMMON: return createFxColortargetCommon();
      case ColladaPackage.FX_DEPTHTARGET_COMMON: return createFxDepthtargetCommon();
      case ColladaPackage.FX_INCLUDE_COMMON: return createFxIncludeCommon();
      case ColladaPackage.FX_NEWPARAM_COMMON: return createFxNewparamCommon();
      case ColladaPackage.FX_SAMPLER1_DCOMMON: return createFxSampler1DCommon();
      case ColladaPackage.FX_SAMPLER2_DCOMMON: return createFxSampler2DCommon();
      case ColladaPackage.FX_SAMPLER3_DCOMMON: return createFxSampler3DCommon();
      case ColladaPackage.FX_SAMPLER_CUBE_COMMON: return createFxSamplerCUBECommon();
      case ColladaPackage.FX_SAMPLER_DEPTH_COMMON: return createFxSamplerDEPTHCommon();
      case ColladaPackage.FX_SAMPLER_RECT_COMMON: return createFxSamplerRECTCommon();
      case ColladaPackage.FX_STENCILTARGET_COMMON: return createFxStenciltargetCommon();
      case ColladaPackage.FX_SURFACE_COMMON: return createFxSurfaceCommon();
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON: return createFxSurfaceFormatHintCommon();
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON: return createFxSurfaceInitCubeCommon();
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON: return createFxSurfaceInitFromCommon();
      case ColladaPackage.FX_SURFACE_INIT_PLANAR_COMMON: return createFxSurfaceInitPlanarCommon();
      case ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON: return createFxSurfaceInitVolumeCommon();
      case ColladaPackage.GENERATOR_TYPE: return createGeneratorType();
      case ColladaPackage.GENERATOR_TYPE1: return createGeneratorType1();
      case ColladaPackage.GEOMETRY_TYPE: return createGeometryType();
      case ColladaPackage.GLES_NEWPARAM: return createGlesNewparam();
      case ColladaPackage.GLES_SAMPLER_STATE: return createGlesSamplerState();
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_ALPHA_TYPE: return createGlesTexcombinerArgumentAlphaType();
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE: return createGlesTexcombinerArgumentRGBType();
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_ALPHA_TYPE: return createGlesTexcombinerCommandAlphaType();
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE: return createGlesTexcombinerCommandRGBType();
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE: return createGlesTexcombinerCommandType();
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE: return createGlesTexenvCommandType();
      case ColladaPackage.GLES_TEXTURE_CONSTANT_TYPE: return createGlesTextureConstantType();
      case ColladaPackage.GLES_TEXTURE_PIPELINE: return createGlesTexturePipeline();
      case ColladaPackage.GLES_TEXTURE_UNIT: return createGlesTextureUnit();
      case ColladaPackage.GL_SAMPLER1_D: return createGlSampler1D();
      case ColladaPackage.GL_SAMPLER2_D: return createGlSampler2D();
      case ColladaPackage.GL_SAMPLER3_D: return createGlSampler3D();
      case ColladaPackage.GL_SAMPLER_CUBE: return createGlSamplerCUBE();
      case ColladaPackage.GL_SAMPLER_DEPTH: return createGlSamplerDEPTH();
      case ColladaPackage.GL_SAMPLER_RECT: return createGlSamplerRECT();
      case ColladaPackage.GLSL_NEWARRAY_TYPE: return createGlslNewarrayType();
      case ColladaPackage.GLSL_NEWPARAM: return createGlslNewparam();
      case ColladaPackage.GLSL_SETARRAY_TYPE: return createGlslSetarrayType();
      case ColladaPackage.GLSL_SETPARAM: return createGlslSetparam();
      case ColladaPackage.GLSL_SETPARAM_SIMPLE: return createGlslSetparamSimple();
      case ColladaPackage.GLSL_SURFACE_TYPE: return createGlslSurfaceType();
      case ColladaPackage.HOLLOW_TYPE: return createHollowType();
      case ColladaPackage.HOLLOW_TYPE1: return createHollowType1();
      case ColladaPackage.IDREF_ARRAY_TYPE: return createIDREFArrayType();
      case ColladaPackage.IMAGER_TYPE: return createImagerType();
      case ColladaPackage.IMAGE_TYPE: return createImageType();
      case ColladaPackage.INPUT_GLOBAL: return createInputGlobal();
      case ColladaPackage.INPUT_LOCAL: return createInputLocal();
      case ColladaPackage.INPUT_LOCAL_OFFSET: return createInputLocalOffset();
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE: return createInstanceControllerType();
      case ColladaPackage.INSTANCE_EFFECT_TYPE: return createInstanceEffectType();
      case ColladaPackage.INSTANCE_GEOMETRY_TYPE: return createInstanceGeometryType();
      case ColladaPackage.INSTANCE_MATERIAL_TYPE: return createInstanceMaterialType();
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE: return createInstancePhysicsModelType();
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE: return createInstanceRigidBodyType();
      case ColladaPackage.INSTANCE_RIGID_CONSTRAINT_TYPE: return createInstanceRigidConstraintType();
      case ColladaPackage.INSTANCE_WITH_EXTRA: return createInstanceWithExtra();
      case ColladaPackage.INT_ARRAY_TYPE: return createIntArrayType();
      case ColladaPackage.INTERPENETRATE_TYPE: return createInterpenetrateType();
      case ColladaPackage.JOINTS_TYPE: return createJointsType();
      case ColladaPackage.LAMBERT_TYPE: return createLambertType();
      case ColladaPackage.LIBRARY_ANIMATION_CLIPS_TYPE: return createLibraryAnimationClipsType();
      case ColladaPackage.LIBRARY_ANIMATIONS_TYPE: return createLibraryAnimationsType();
      case ColladaPackage.LIBRARY_CAMERAS_TYPE: return createLibraryCamerasType();
      case ColladaPackage.LIBRARY_CONTROLLERS_TYPE: return createLibraryControllersType();
      case ColladaPackage.LIBRARY_EFFECTS_TYPE: return createLibraryEffectsType();
      case ColladaPackage.LIBRARY_FORCE_FIELDS_TYPE: return createLibraryForceFieldsType();
      case ColladaPackage.LIBRARY_GEOMETRIES_TYPE: return createLibraryGeometriesType();
      case ColladaPackage.LIBRARY_IMAGES_TYPE: return createLibraryImagesType();
      case ColladaPackage.LIBRARY_LIGHTS_TYPE: return createLibraryLightsType();
      case ColladaPackage.LIBRARY_MATERIALS_TYPE: return createLibraryMaterialsType();
      case ColladaPackage.LIBRARY_NODES_TYPE: return createLibraryNodesType();
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE: return createLibraryPhysicsMaterialsType();
      case ColladaPackage.LIBRARY_PHYSICS_MODELS_TYPE: return createLibraryPhysicsModelsType();
      case ColladaPackage.LIBRARY_PHYSICS_SCENES_TYPE: return createLibraryPhysicsScenesType();
      case ColladaPackage.LIBRARY_VISUAL_SCENES_TYPE: return createLibraryVisualScenesType();
      case ColladaPackage.LIGHT_AMBIENT_TYPE: return createLightAmbientType();
      case ColladaPackage.LIGHT_AMBIENT_TYPE1: return createLightAmbientType1();
      case ColladaPackage.LIGHT_CONSTANT_ATTENUATION_TYPE: return createLightConstantAttenuationType();
      case ColladaPackage.LIGHT_CONSTANT_ATTENUATION_TYPE1: return createLightConstantAttenuationType1();
      case ColladaPackage.LIGHT_DIFFUSE_TYPE: return createLightDiffuseType();
      case ColladaPackage.LIGHT_DIFFUSE_TYPE1: return createLightDiffuseType1();
      case ColladaPackage.LIGHT_ENABLE_TYPE: return createLightEnableType();
      case ColladaPackage.LIGHT_ENABLE_TYPE1: return createLightEnableType1();
      case ColladaPackage.LIGHTING_ENABLE_TYPE: return createLightingEnableType();
      case ColladaPackage.LIGHTING_ENABLE_TYPE1: return createLightingEnableType1();
      case ColladaPackage.LIGHT_LINEAR_ATTENUATION_TYPE: return createLightLinearAttenuationType();
      case ColladaPackage.LIGHT_LINEAR_ATTENUTATION_TYPE: return createLightLinearAttenutationType();
      case ColladaPackage.LIGHT_MODEL_AMBIENT_TYPE: return createLightModelAmbientType();
      case ColladaPackage.LIGHT_MODEL_AMBIENT_TYPE1: return createLightModelAmbientType1();
      case ColladaPackage.LIGHT_MODEL_COLOR_CONTROL_TYPE: return createLightModelColorControlType();
      case ColladaPackage.LIGHT_MODEL_LOCAL_VIEWER_ENABLE_TYPE: return createLightModelLocalViewerEnableType();
      case ColladaPackage.LIGHT_MODEL_TWO_SIDE_ENABLE_TYPE: return createLightModelTwoSideEnableType();
      case ColladaPackage.LIGHT_MODEL_TWO_SIDE_ENABLE_TYPE1: return createLightModelTwoSideEnableType1();
      case ColladaPackage.LIGHT_POSITION_TYPE: return createLightPositionType();
      case ColladaPackage.LIGHT_POSITION_TYPE1: return createLightPositionType1();
      case ColladaPackage.LIGHT_QUADRATIC_ATTENUATION_TYPE: return createLightQuadraticAttenuationType();
      case ColladaPackage.LIGHT_QUADRATIC_ATTENUATION_TYPE1: return createLightQuadraticAttenuationType1();
      case ColladaPackage.LIGHT_SPECULAR_TYPE: return createLightSpecularType();
      case ColladaPackage.LIGHT_SPECULAR_TYPE1: return createLightSpecularType1();
      case ColladaPackage.LIGHT_SPOT_CUTOFF_TYPE: return createLightSpotCutoffType();
      case ColladaPackage.LIGHT_SPOT_CUTOFF_TYPE1: return createLightSpotCutoffType1();
      case ColladaPackage.LIGHT_SPOT_DIRECTION_TYPE: return createLightSpotDirectionType();
      case ColladaPackage.LIGHT_SPOT_DIRECTION_TYPE1: return createLightSpotDirectionType1();
      case ColladaPackage.LIGHT_SPOT_EXPONENT_TYPE: return createLightSpotExponentType();
      case ColladaPackage.LIGHT_SPOT_EXPONENT_TYPE1: return createLightSpotExponentType1();
      case ColladaPackage.LIGHT_TYPE: return createLightType();
      case ColladaPackage.LIMITS_TYPE: return createLimitsType();
      case ColladaPackage.LINEAR_TYPE: return createLinearType();
      case ColladaPackage.LINEAR_TYPE1: return createLinearType1();
      case ColladaPackage.LINE_SMOOTH_ENABLE_TYPE: return createLineSmoothEnableType();
      case ColladaPackage.LINE_SMOOTH_ENABLE_TYPE1: return createLineSmoothEnableType1();
      case ColladaPackage.LINE_STIPPLE_ENABLE_TYPE: return createLineStippleEnableType();
      case ColladaPackage.LINE_STIPPLE_TYPE: return createLineStippleType();
      case ColladaPackage.LINESTRIPS_TYPE: return createLinestripsType();
      case ColladaPackage.LINES_TYPE: return createLinesType();
      case ColladaPackage.LINE_WIDTH_TYPE: return createLineWidthType();
      case ColladaPackage.LINE_WIDTH_TYPE1: return createLineWidthType1();
      case ColladaPackage.LOGIC_OP_ENABLE_TYPE: return createLogicOpEnableType();
      case ColladaPackage.LOGIC_OP_TYPE: return createLogicOpType();
      case ColladaPackage.LOGIC_OP_TYPE1: return createLogicOpType1();
      case ColladaPackage.LOOKAT_TYPE: return createLookatType();
      case ColladaPackage.MASK_TYPE: return createMaskType();
      case ColladaPackage.MASK_TYPE1: return createMaskType1();
      case ColladaPackage.MASK_TYPE2: return createMaskType2();
      case ColladaPackage.MASK_TYPE3: return createMaskType3();
      case ColladaPackage.MASS_FRAME_TYPE: return createMassFrameType();
      case ColladaPackage.MASS_FRAME_TYPE1: return createMassFrameType1();
      case ColladaPackage.MATERIAL_AMBIENT_TYPE: return createMaterialAmbientType();
      case ColladaPackage.MATERIAL_AMBIENT_TYPE1: return createMaterialAmbientType1();
      case ColladaPackage.MATERIAL_DIFFUSE_TYPE: return createMaterialDiffuseType();
      case ColladaPackage.MATERIAL_DIFFUSE_TYPE1: return createMaterialDiffuseType1();
      case ColladaPackage.MATERIAL_EMISSION_TYPE: return createMaterialEmissionType();
      case ColladaPackage.MATERIAL_EMISSION_TYPE1: return createMaterialEmissionType1();
      case ColladaPackage.MATERIAL_SHININESS_TYPE: return createMaterialShininessType();
      case ColladaPackage.MATERIAL_SHININESS_TYPE1: return createMaterialShininessType1();
      case ColladaPackage.MATERIAL_SPECULAR_TYPE: return createMaterialSpecularType();
      case ColladaPackage.MATERIAL_SPECULAR_TYPE1: return createMaterialSpecularType1();
      case ColladaPackage.MATERIAL_TYPE: return createMaterialType();
      case ColladaPackage.MATRIX_TYPE: return createMatrixType();
      case ColladaPackage.MESH_TYPE: return createMeshType();
      case ColladaPackage.MODEL_VIEW_MATRIX_TYPE: return createModelViewMatrixType();
      case ColladaPackage.MODEL_VIEW_MATRIX_TYPE1: return createModelViewMatrixType1();
      case ColladaPackage.MODE_TYPE: return createModeType();
      case ColladaPackage.MODE_TYPE1: return createModeType1();
      case ColladaPackage.MORPH_TYPE: return createMorphType();
      case ColladaPackage.MULTISAMPLE_ENABLE_TYPE: return createMultisampleEnableType();
      case ColladaPackage.MULTISAMPLE_ENABLE_TYPE1: return createMultisampleEnableType1();
      case ColladaPackage.NAME_ARRAY_TYPE: return createNameArrayType();
      case ColladaPackage.NAME_TYPE: return createNameType();
      case ColladaPackage.NAME_TYPE1: return createNameType1();
      case ColladaPackage.NAME_TYPE2: return createNameType2();
      case ColladaPackage.NAME_TYPE3: return createNameType3();
      case ColladaPackage.NODE_TYPE1: return createNodeType1();
      case ColladaPackage.NORMALIZE_ENABLE_TYPE: return createNormalizeEnableType();
      case ColladaPackage.NORMALIZE_ENABLE_TYPE1: return createNormalizeEnableType1();
      case ColladaPackage.OPTICS_TYPE: return createOpticsType();
      case ColladaPackage.ORTHOGRAPHIC_TYPE: return createOrthographicType();
      case ColladaPackage.PARAM_TYPE: return createParamType();
      case ColladaPackage.PARAM_TYPE1: return createParamType1();
      case ColladaPackage.PARAM_TYPE2: return createParamType2();
      case ColladaPackage.PARAM_TYPE3: return createParamType3();
      case ColladaPackage.PARAM_TYPE4: return createParamType4();
      case ColladaPackage.PASS_TYPE: return createPassType();
      case ColladaPackage.PASS_TYPE1: return createPassType1();
      case ColladaPackage.PASS_TYPE2: return createPassType2();
      case ColladaPackage.PERSPECTIVE_TYPE: return createPerspectiveType();
      case ColladaPackage.PHONG_TYPE: return createPhongType();
      case ColladaPackage.PH_TYPE: return createPhType();
      case ColladaPackage.PHYSICS_MATERIAL_TYPE: return createPhysicsMaterialType();
      case ColladaPackage.PHYSICS_MODEL_TYPE: return createPhysicsModelType();
      case ColladaPackage.PHYSICS_SCENE_TYPE: return createPhysicsSceneType();
      case ColladaPackage.PLANE_TYPE: return createPlaneType();
      case ColladaPackage.POINT_DISTANCE_ATTENUATION_TYPE: return createPointDistanceAttenuationType();
      case ColladaPackage.POINT_DISTANCE_ATTENUATION_TYPE1: return createPointDistanceAttenuationType1();
      case ColladaPackage.POINT_FADE_THRESHOLD_SIZE_TYPE: return createPointFadeThresholdSizeType();
      case ColladaPackage.POINT_FADE_THRESHOLD_SIZE_TYPE1: return createPointFadeThresholdSizeType1();
      case ColladaPackage.POINT_SIZE_MAX_TYPE: return createPointSizeMaxType();
      case ColladaPackage.POINT_SIZE_MAX_TYPE1: return createPointSizeMaxType1();
      case ColladaPackage.POINT_SIZE_MIN_TYPE: return createPointSizeMinType();
      case ColladaPackage.POINT_SIZE_MIN_TYPE1: return createPointSizeMinType1();
      case ColladaPackage.POINT_SIZE_TYPE: return createPointSizeType();
      case ColladaPackage.POINT_SIZE_TYPE1: return createPointSizeType1();
      case ColladaPackage.POINT_SMOOTH_ENABLE_TYPE: return createPointSmoothEnableType();
      case ColladaPackage.POINT_SMOOTH_ENABLE_TYPE1: return createPointSmoothEnableType1();
      case ColladaPackage.POINT_TYPE: return createPointType();
      case ColladaPackage.POLYGON_MODE_TYPE: return createPolygonModeType();
      case ColladaPackage.POLYGON_OFFSET_FILL_ENABLE_TYPE: return createPolygonOffsetFillEnableType();
      case ColladaPackage.POLYGON_OFFSET_FILL_ENABLE_TYPE1: return createPolygonOffsetFillEnableType1();
      case ColladaPackage.POLYGON_OFFSET_LINE_ENABLE_TYPE: return createPolygonOffsetLineEnableType();
      case ColladaPackage.POLYGON_OFFSET_POINT_ENABLE_TYPE: return createPolygonOffsetPointEnableType();
      case ColladaPackage.POLYGON_OFFSET_TYPE: return createPolygonOffsetType();
      case ColladaPackage.POLYGON_OFFSET_TYPE1: return createPolygonOffsetType1();
      case ColladaPackage.POLYGON_SMOOTH_ENABLE_TYPE: return createPolygonSmoothEnableType();
      case ColladaPackage.POLYGON_STIPPLE_ENABLE_TYPE: return createPolygonStippleEnableType();
      case ColladaPackage.POLYGONS_TYPE: return createPolygonsType();
      case ColladaPackage.POLYLIST_TYPE: return createPolylistType();
      case ColladaPackage.PRIMARY_TYPE: return createPrimaryType();
      case ColladaPackage.PRIMARY_TYPE1: return createPrimaryType1();
      case ColladaPackage.PROFILE_CG_TYPE: return createProfileCGType();
      case ColladaPackage.PROFILE_COMMON_TYPE: return createProfileCOMMONType();
      case ColladaPackage.PROFILE_GLES_TYPE: return createProfileGLESType();
      case ColladaPackage.PROFILE_GLSL_TYPE: return createProfileGLSLType();
      case ColladaPackage.PROJECTION_MATRIX_TYPE: return createProjectionMatrixType();
      case ColladaPackage.PROJECTION_MATRIX_TYPE1: return createProjectionMatrixType1();
      case ColladaPackage.REF_ATTACHMENT_TYPE: return createRefAttachmentType();
      case ColladaPackage.REF_TYPE: return createRefType();
      case ColladaPackage.REF_TYPE1: return createRefType1();
      case ColladaPackage.REF_TYPE2: return createRefType2();
      case ColladaPackage.RENDER_TYPE: return createRenderType();
      case ColladaPackage.RESCALE_NORMAL_ENABLE_TYPE: return createRescaleNormalEnableType();
      case ColladaPackage.RESCALE_NORMAL_ENABLE_TYPE1: return createRescaleNormalEnableType1();
      case ColladaPackage.RGB_TYPE: return createRgbType();
      case ColladaPackage.RIGID_BODY_TYPE: return createRigidBodyType();
      case ColladaPackage.RIGID_CONSTRAINT_TYPE: return createRigidConstraintType();
      case ColladaPackage.ROTATE_TYPE: return createRotateType();
      case ColladaPackage.SAMPLE_ALPHA_TO_COVERAGE_ENABLE_TYPE: return createSampleAlphaToCoverageEnableType();
      case ColladaPackage.SAMPLE_ALPHA_TO_COVERAGE_ENABLE_TYPE1: return createSampleAlphaToCoverageEnableType1();
      case ColladaPackage.SAMPLE_ALPHA_TO_ONE_ENABLE_TYPE: return createSampleAlphaToOneEnableType();
      case ColladaPackage.SAMPLE_ALPHA_TO_ONE_ENABLE_TYPE1: return createSampleAlphaToOneEnableType1();
      case ColladaPackage.SAMPLE_COVERAGE_ENABLE_TYPE: return createSampleCoverageEnableType();
      case ColladaPackage.SAMPLE_COVERAGE_ENABLE_TYPE1: return createSampleCoverageEnableType1();
      case ColladaPackage.SAMPLER_TYPE: return createSamplerType();
      case ColladaPackage.SCENE_TYPE: return createSceneType();
      case ColladaPackage.SCISSOR_TEST_ENABLE_TYPE: return createScissorTestEnableType();
      case ColladaPackage.SCISSOR_TEST_ENABLE_TYPE1: return createScissorTestEnableType1();
      case ColladaPackage.SCISSOR_TYPE: return createScissorType();
      case ColladaPackage.SCISSOR_TYPE1: return createScissorType1();
      case ColladaPackage.SETPARAM_TYPE: return createSetparamType();
      case ColladaPackage.SETPARAM_TYPE1: return createSetparamType1();
      case ColladaPackage.SHADE_MODEL_TYPE: return createShadeModelType();
      case ColladaPackage.SHADE_MODEL_TYPE1: return createShadeModelType1();
      case ColladaPackage.SHADER_TYPE: return createShaderType();
      case ColladaPackage.SHADER_TYPE1: return createShaderType1();
      case ColladaPackage.SHAPE_TYPE: return createShapeType();
      case ColladaPackage.SHAPE_TYPE1: return createShapeType1();
      case ColladaPackage.SKEW_TYPE: return createSkewType();
      case ColladaPackage.SKIN_TYPE: return createSkinType();
      case ColladaPackage.SOURCE_TYPE: return createSourceType();
      case ColladaPackage.SPHERE_TYPE: return createSphereType();
      case ColladaPackage.SPLINE_TYPE: return createSplineType();
      case ColladaPackage.SPOT_TYPE: return createSpotType();
      case ColladaPackage.SPRING_TYPE1: return createSpringType1();
      case ColladaPackage.SRC_ALPHA_TYPE: return createSrcAlphaType();
      case ColladaPackage.SRC_RGB_TYPE: return createSrcRgbType();
      case ColladaPackage.SRC_TYPE: return createSrcType();
      case ColladaPackage.SRC_TYPE1: return createSrcType1();
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE: return createStencilFuncSeparateType();
      case ColladaPackage.STENCIL_FUNC_TYPE: return createStencilFuncType();
      case ColladaPackage.STENCIL_FUNC_TYPE1: return createStencilFuncType1();
      case ColladaPackage.STENCIL_MASK_SEPARATE_TYPE: return createStencilMaskSeparateType();
      case ColladaPackage.STENCIL_MASK_TYPE: return createStencilMaskType();
      case ColladaPackage.STENCIL_MASK_TYPE1: return createStencilMaskType1();
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE: return createStencilOpSeparateType();
      case ColladaPackage.STENCIL_OP_TYPE: return createStencilOpType();
      case ColladaPackage.STENCIL_OP_TYPE1: return createStencilOpType1();
      case ColladaPackage.STENCIL_TEST_ENABLE_TYPE: return createStencilTestEnableType();
      case ColladaPackage.STENCIL_TEST_ENABLE_TYPE1: return createStencilTestEnableType1();
      case ColladaPackage.SWING_CONE_AND_TWIST_TYPE: return createSwingConeAndTwistType();
      case ColladaPackage.TAPERED_CAPSULE_TYPE: return createTaperedCapsuleType();
      case ColladaPackage.TAPERED_CYLINDER_TYPE: return createTaperedCylinderType();
      case ColladaPackage.TARGETABLE_FLOAT: return createTargetableFloat();
      case ColladaPackage.TARGETABLE_FLOAT3: return createTargetableFloat3();
      case ColladaPackage.TARGETS_TYPE: return createTargetsType();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE: return createTechniqueCommonType();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1: return createTechniqueCommonType1();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE2: return createTechniqueCommonType2();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3: return createTechniqueCommonType3();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4: return createTechniqueCommonType4();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE5: return createTechniqueCommonType5();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6: return createTechniqueCommonType6();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE7: return createTechniqueCommonType7();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE8: return createTechniqueCommonType8();
      case ColladaPackage.TECHNIQUE_HINT_TYPE: return createTechniqueHintType();
      case ColladaPackage.TECHNIQUE_TYPE: return createTechniqueType();
      case ColladaPackage.TECHNIQUE_TYPE1: return createTechniqueType1();
      case ColladaPackage.TECHNIQUE_TYPE2: return createTechniqueType2();
      case ColladaPackage.TECHNIQUE_TYPE3: return createTechniqueType3();
      case ColladaPackage.TECHNIQUE_TYPE4: return createTechniqueType4();
      case ColladaPackage.TEXCOORD_TYPE: return createTexcoordType();
      case ColladaPackage.TEXTURE1_DENABLE_TYPE: return createTexture1DEnableType();
      case ColladaPackage.TEXTURE1_DTYPE: return createTexture1DType();
      case ColladaPackage.TEXTURE2_DENABLE_TYPE: return createTexture2DEnableType();
      case ColladaPackage.TEXTURE2_DTYPE: return createTexture2DType();
      case ColladaPackage.TEXTURE3_DENABLE_TYPE: return createTexture3DEnableType();
      case ColladaPackage.TEXTURE3_DTYPE: return createTexture3DType();
      case ColladaPackage.TEXTURE_CUBE_ENABLE_TYPE: return createTextureCUBEEnableType();
      case ColladaPackage.TEXTURE_CUBE_TYPE: return createTextureCUBEType();
      case ColladaPackage.TEXTURE_DEPTH_ENABLE_TYPE: return createTextureDEPTHEnableType();
      case ColladaPackage.TEXTURE_DEPTH_TYPE: return createTextureDEPTHType();
      case ColladaPackage.TEXTURE_ENV_COLOR_TYPE: return createTextureEnvColorType();
      case ColladaPackage.TEXTURE_ENV_MODE_TYPE: return createTextureEnvModeType();
      case ColladaPackage.TEXTURE_PIPELINE_ENABLE_TYPE: return createTexturePipelineEnableType();
      case ColladaPackage.TEXTURE_PIPELINE_TYPE: return createTexturePipelineType();
      case ColladaPackage.TEXTURE_RECT_ENABLE_TYPE: return createTextureRECTEnableType();
      case ColladaPackage.TEXTURE_RECT_TYPE: return createTextureRECTType();
      case ColladaPackage.TEXTURE_TYPE: return createTextureType();
      case ColladaPackage.TRIANGLES_TYPE: return createTrianglesType();
      case ColladaPackage.TRIFANS_TYPE: return createTrifansType();
      case ColladaPackage.TRISTRIPS_TYPE: return createTristripsType();
      case ColladaPackage.UNIT_TYPE: return createUnitType();
      case ColladaPackage.VALUE_TYPE: return createValueType();
      case ColladaPackage.VALUE_TYPE1: return createValueType1();
      case ColladaPackage.VERTEX_WEIGHTS_TYPE: return createVertexWeightsType();
      case ColladaPackage.VERTICES_TYPE: return createVerticesType();
      case ColladaPackage.VISUAL_SCENE_TYPE: return createVisualSceneType();
      case ColladaPackage.ZFAIL_TYPE: return createZfailType();
      case ColladaPackage.ZFAIL_TYPE1: return createZfailType1();
      case ColladaPackage.ZFAIL_TYPE2: return createZfailType2();
      case ColladaPackage.ZPASS_TYPE: return createZpassType();
      case ColladaPackage.ZPASS_TYPE1: return createZpassType1();
      case ColladaPackage.ZPASS_TYPE2: return createZpassType2();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID())
    {
      case ColladaPackage.CG_PIPELINE_STAGE:
        return createCgPipelineStageFromString(eDataType, initialValue);
      case ColladaPackage.COMMON_PROFILE_INPUT:
        return createCommonProfileInputFromString(eDataType, initialValue);
      case ColladaPackage.COMMON_PROFILE_PARAM:
        return createCommonProfileParamFromString(eDataType, initialValue);
      case ColladaPackage.FX_MODIFIER_ENUM_COMMON:
        return createFxModifierEnumCommonFromString(eDataType, initialValue);
      case ColladaPackage.FX_OPAQUE_ENUM:
        return createFxOpaqueEnumFromString(eDataType, initialValue);
      case ColladaPackage.FX_PIPELINE_STAGE_COMMON:
        return createFxPipelineStageCommonFromString(eDataType, initialValue);
      case ColladaPackage.FX_SAMPLER_FILTER_COMMON:
        return createFxSamplerFilterCommonFromString(eDataType, initialValue);
      case ColladaPackage.FX_SAMPLER_WRAP_COMMON:
        return createFxSamplerWrapCommonFromString(eDataType, initialValue);
      case ColladaPackage.FX_SURFACE_FACE_ENUM:
        return createFxSurfaceFaceEnumFromString(eDataType, initialValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_CHANNELS_ENUM:
        return createFxSurfaceFormatHintChannelsEnumFromString(eDataType, initialValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_OPTION_ENUM:
        return createFxSurfaceFormatHintOptionEnumFromString(eDataType, initialValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_PRECISION_ENUM:
        return createFxSurfaceFormatHintPrecisionEnumFromString(eDataType, initialValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_RANGE_ENUM:
        return createFxSurfaceFormatHintRangeEnumFromString(eDataType, initialValue);
      case ColladaPackage.FX_SURFACE_TYPE_ENUM:
        return createFxSurfaceTypeEnumFromString(eDataType, initialValue);
      case ColladaPackage.GL_BLEND_EQUATION_TYPE:
        return createGlBlendEquationTypeFromString(eDataType, initialValue);
      case ColladaPackage.GL_BLEND_TYPE:
        return createGlBlendTypeFromString(eDataType, initialValue);
      case ColladaPackage.GLES_SAMPLER_WRAP:
        return createGlesSamplerWrapFromString(eDataType, initialValue);
      case ColladaPackage.GLES_STENCIL_OP_TYPE:
        return createGlesStencilOpTypeFromString(eDataType, initialValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERAND_ALPHA_ENUMS:
        return createGlesTexcombinerOperandAlphaEnumsFromString(eDataType, initialValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERAND_RGB_ENUMS:
        return createGlesTexcombinerOperandRGBEnumsFromString(eDataType, initialValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERATOR_ALPHA_ENUMS:
        return createGlesTexcombinerOperatorAlphaEnumsFromString(eDataType, initialValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERATOR_RGB_ENUMS:
        return createGlesTexcombinerOperatorRGBEnumsFromString(eDataType, initialValue);
      case ColladaPackage.GLES_TEXCOMBINER_SOURCE_ENUMS:
        return createGlesTexcombinerSourceEnumsFromString(eDataType, initialValue);
      case ColladaPackage.GLES_TEXENV_MODE_ENUMS:
        return createGlesTexenvModeEnumsFromString(eDataType, initialValue);
      case ColladaPackage.GL_FACE_TYPE:
        return createGlFaceTypeFromString(eDataType, initialValue);
      case ColladaPackage.GL_FOG_COORD_SRC_TYPE:
        return createGlFogCoordSrcTypeFromString(eDataType, initialValue);
      case ColladaPackage.GL_FOG_TYPE:
        return createGlFogTypeFromString(eDataType, initialValue);
      case ColladaPackage.GL_FRONT_FACE_TYPE:
        return createGlFrontFaceTypeFromString(eDataType, initialValue);
      case ColladaPackage.GL_FUNC_TYPE:
        return createGlFuncTypeFromString(eDataType, initialValue);
      case ColladaPackage.GL_LIGHT_MODEL_COLOR_CONTROL_TYPE:
        return createGlLightModelColorControlTypeFromString(eDataType, initialValue);
      case ColladaPackage.GL_LOGIC_OP_TYPE:
        return createGlLogicOpTypeFromString(eDataType, initialValue);
      case ColladaPackage.GL_MATERIAL_TYPE:
        return createGlMaterialTypeFromString(eDataType, initialValue);
      case ColladaPackage.GL_POLYGON_MODE_TYPE:
        return createGlPolygonModeTypeFromString(eDataType, initialValue);
      case ColladaPackage.GL_SHADE_MODEL_TYPE:
        return createGlShadeModelTypeFromString(eDataType, initialValue);
      case ColladaPackage.GLSL_PIPELINE_STAGE:
        return createGlslPipelineStageFromString(eDataType, initialValue);
      case ColladaPackage.GL_STENCIL_OP_TYPE:
        return createGlStencilOpTypeFromString(eDataType, initialValue);
      case ColladaPackage.MORPH_METHOD_TYPE:
        return createMorphMethodTypeFromString(eDataType, initialValue);
      case ColladaPackage.NODE_TYPE:
        return createNodeTypeFromString(eDataType, initialValue);
      case ColladaPackage.SPRING_TYPE:
        return createSpringTypeFromString(eDataType, initialValue);
      case ColladaPackage.UP_AXIS_TYPE:
        return createUpAxisTypeFromString(eDataType, initialValue);
      case ColladaPackage.VERSION_TYPE:
        return createVersionTypeFromString(eDataType, initialValue);
      case ColladaPackage.BOOL:
        return createBoolFromString(eDataType, initialValue);
      case ColladaPackage.BOOL2:
        return createBool2FromString(eDataType, initialValue);
      case ColladaPackage.BOOL3:
        return createBool3FromString(eDataType, initialValue);
      case ColladaPackage.BOOL4:
        return createBool4FromString(eDataType, initialValue);
      case ColladaPackage.BOOL_OBJECT:
        return createBoolObjectFromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL:
        return createCgBoolFromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL1:
        return createCgBool1FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL1_OBJECT:
        return createCgBool1ObjectFromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL1X1:
        return createCgBool1x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL1X2:
        return createCgBool1x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL1X3:
        return createCgBool1x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL1X4:
        return createCgBool1x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL2:
        return createCgBool2FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL2X1:
        return createCgBool2x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL2X2:
        return createCgBool2x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL2X3:
        return createCgBool2x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL2X4:
        return createCgBool2x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL3:
        return createCgBool3FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL3X1:
        return createCgBool3x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL3X2:
        return createCgBool3x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL3X3:
        return createCgBool3x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL3X4:
        return createCgBool3x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL4:
        return createCgBool4FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL4X1:
        return createCgBool4x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL4X2:
        return createCgBool4x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL4X3:
        return createCgBool4x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL4X4:
        return createCgBool4x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_BOOL_OBJECT:
        return createCgBoolObjectFromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED:
        return createCgFixedFromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED1:
        return createCgFixed1FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED1_OBJECT:
        return createCgFixed1ObjectFromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED1X1:
        return createCgFixed1x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED1X2:
        return createCgFixed1x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED1X3:
        return createCgFixed1x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED1X4:
        return createCgFixed1x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED2:
        return createCgFixed2FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED2X1:
        return createCgFixed2x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED2X2:
        return createCgFixed2x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED2X3:
        return createCgFixed2x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED2X4:
        return createCgFixed2x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED3:
        return createCgFixed3FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED3X1:
        return createCgFixed3x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED3X2:
        return createCgFixed3x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED3X3:
        return createCgFixed3x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED3X4:
        return createCgFixed3x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED4:
        return createCgFixed4FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED4X1:
        return createCgFixed4x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED4X2:
        return createCgFixed4x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED4X3:
        return createCgFixed4x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED4X4:
        return createCgFixed4x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_FIXED_OBJECT:
        return createCgFixedObjectFromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT:
        return createCgFloatFromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT1:
        return createCgFloat1FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT1_OBJECT:
        return createCgFloat1ObjectFromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT1X1:
        return createCgFloat1x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT1X2:
        return createCgFloat1x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT1X3:
        return createCgFloat1x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT1X4:
        return createCgFloat1x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT2:
        return createCgFloat2FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT2X1:
        return createCgFloat2x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT2X2:
        return createCgFloat2x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT2X3:
        return createCgFloat2x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT2X4:
        return createCgFloat2x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT3:
        return createCgFloat3FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT3X1:
        return createCgFloat3x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT3X2:
        return createCgFloat3x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT3X3:
        return createCgFloat3x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT3X4:
        return createCgFloat3x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT4:
        return createCgFloat4FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT4X1:
        return createCgFloat4x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT4X2:
        return createCgFloat4x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT4X3:
        return createCgFloat4x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT4X4:
        return createCgFloat4x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_FLOAT_OBJECT:
        return createCgFloatObjectFromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF:
        return createCgHalfFromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF1:
        return createCgHalf1FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF1_OBJECT:
        return createCgHalf1ObjectFromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF1X1:
        return createCgHalf1x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF1X2:
        return createCgHalf1x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF1X3:
        return createCgHalf1x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF1X4:
        return createCgHalf1x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF2:
        return createCgHalf2FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF2X1:
        return createCgHalf2x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF2X2:
        return createCgHalf2x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF2X3:
        return createCgHalf2x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF2X4:
        return createCgHalf2x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF3:
        return createCgHalf3FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF3X1:
        return createCgHalf3x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF3X2:
        return createCgHalf3x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF3X3:
        return createCgHalf3x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF3X4:
        return createCgHalf3x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF4:
        return createCgHalf4FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF4X1:
        return createCgHalf4x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF4X2:
        return createCgHalf4x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF4X3:
        return createCgHalf4x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF4X4:
        return createCgHalf4x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_HALF_OBJECT:
        return createCgHalfObjectFromString(eDataType, initialValue);
      case ColladaPackage.CG_IDENTIFIER:
        return createCgIdentifierFromString(eDataType, initialValue);
      case ColladaPackage.CG_INT:
        return createCgIntFromString(eDataType, initialValue);
      case ColladaPackage.CG_INT1:
        return createCgInt1FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT1_OBJECT:
        return createCgInt1ObjectFromString(eDataType, initialValue);
      case ColladaPackage.CG_INT1X1:
        return createCgInt1x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT1X2:
        return createCgInt1x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT1X3:
        return createCgInt1x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT1X4:
        return createCgInt1x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT2:
        return createCgInt2FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT2X1:
        return createCgInt2x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT2X2:
        return createCgInt2x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT2X3:
        return createCgInt2x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT2X4:
        return createCgInt2x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT3:
        return createCgInt3FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT3X1:
        return createCgInt3x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT3X2:
        return createCgInt3x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT3X3:
        return createCgInt3x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT3X4:
        return createCgInt3x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT4:
        return createCgInt4FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT4X1:
        return createCgInt4x1FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT4X2:
        return createCgInt4x2FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT4X3:
        return createCgInt4x3FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT4X4:
        return createCgInt4x4FromString(eDataType, initialValue);
      case ColladaPackage.CG_INT_OBJECT:
        return createCgIntObjectFromString(eDataType, initialValue);
      case ColladaPackage.CG_LIST_OF_BOOL:
        return createCgListOfBoolFromString(eDataType, initialValue);
      case ColladaPackage.CG_LIST_OF_FIXED:
        return createCgListOfFixedFromString(eDataType, initialValue);
      case ColladaPackage.CG_LIST_OF_FLOAT:
        return createCgListOfFloatFromString(eDataType, initialValue);
      case ColladaPackage.CG_LIST_OF_HALF:
        return createCgListOfHalfFromString(eDataType, initialValue);
      case ColladaPackage.CG_LIST_OF_INT:
        return createCgListOfIntFromString(eDataType, initialValue);
      case ColladaPackage.CG_PIPELINE_STAGE_OBJECT:
        return createCgPipelineStageObjectFromString(eDataType, initialValue);
      case ColladaPackage.COMMON_PROFILE_INPUT_OBJECT:
        return createCommonProfileInputObjectFromString(eDataType, initialValue);
      case ColladaPackage.COMMON_PROFILE_PARAM_OBJECT:
        return createCommonProfileParamObjectFromString(eDataType, initialValue);
      case ColladaPackage.DATE_TIME:
        return createDateTimeFromString(eDataType, initialValue);
      case ColladaPackage.FLOAT:
        return createFloatFromString(eDataType, initialValue);
      case ColladaPackage.FLOAT2:
        return createFloat2FromString(eDataType, initialValue);
      case ColladaPackage.FLOAT2X2:
        return createFloat2x2FromString(eDataType, initialValue);
      case ColladaPackage.FLOAT2X3:
        return createFloat2x3FromString(eDataType, initialValue);
      case ColladaPackage.FLOAT2X4:
        return createFloat2x4FromString(eDataType, initialValue);
      case ColladaPackage.FLOAT3:
        return createFloat3FromString(eDataType, initialValue);
      case ColladaPackage.FLOAT3X2:
        return createFloat3x2FromString(eDataType, initialValue);
      case ColladaPackage.FLOAT3X3:
        return createFloat3x3FromString(eDataType, initialValue);
      case ColladaPackage.FLOAT3X4:
        return createFloat3x4FromString(eDataType, initialValue);
      case ColladaPackage.FLOAT4:
        return createFloat4FromString(eDataType, initialValue);
      case ColladaPackage.FLOAT4X2:
        return createFloat4x2FromString(eDataType, initialValue);
      case ColladaPackage.FLOAT4X3:
        return createFloat4x3FromString(eDataType, initialValue);
      case ColladaPackage.FLOAT4X4:
        return createFloat4x4FromString(eDataType, initialValue);
      case ColladaPackage.FLOAT7:
        return createFloat7FromString(eDataType, initialValue);
      case ColladaPackage.FLOAT_OBJECT:
        return createFloatObjectFromString(eDataType, initialValue);
      case ColladaPackage.FX_COLOR_COMMON:
        return createFxColorCommonFromString(eDataType, initialValue);
      case ColladaPackage.FX_DRAW_COMMON:
        return createFxDrawCommonFromString(eDataType, initialValue);
      case ColladaPackage.FX_MODIFIER_ENUM_COMMON_OBJECT:
        return createFxModifierEnumCommonObjectFromString(eDataType, initialValue);
      case ColladaPackage.FX_OPAQUE_ENUM_OBJECT:
        return createFxOpaqueEnumObjectFromString(eDataType, initialValue);
      case ColladaPackage.FX_PIPELINE_STAGE_COMMON_OBJECT:
        return createFxPipelineStageCommonObjectFromString(eDataType, initialValue);
      case ColladaPackage.FX_SAMPLER_FILTER_COMMON_OBJECT:
        return createFxSamplerFilterCommonObjectFromString(eDataType, initialValue);
      case ColladaPackage.FX_SAMPLER_WRAP_COMMON_OBJECT:
        return createFxSamplerWrapCommonObjectFromString(eDataType, initialValue);
      case ColladaPackage.FX_SURFACE_FACE_ENUM_OBJECT:
        return createFxSurfaceFaceEnumObjectFromString(eDataType, initialValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_CHANNELS_ENUM_OBJECT:
        return createFxSurfaceFormatHintChannelsEnumObjectFromString(eDataType, initialValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_OPTION_ENUM_OBJECT:
        return createFxSurfaceFormatHintOptionEnumObjectFromString(eDataType, initialValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_PRECISION_ENUM_OBJECT:
        return createFxSurfaceFormatHintPrecisionEnumObjectFromString(eDataType, initialValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_RANGE_ENUM_OBJECT:
        return createFxSurfaceFormatHintRangeEnumObjectFromString(eDataType, initialValue);
      case ColladaPackage.FX_SURFACE_TYPE_ENUM_OBJECT:
        return createFxSurfaceTypeEnumObjectFromString(eDataType, initialValue);
      case ColladaPackage.GL_ALPHA_VALUE_TYPE:
        return createGlAlphaValueTypeFromString(eDataType, initialValue);
      case ColladaPackage.GL_ALPHA_VALUE_TYPE_OBJECT:
        return createGlAlphaValueTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.GL_BLEND_EQUATION_TYPE_OBJECT:
        return createGlBlendEquationTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.GL_BLEND_TYPE_OBJECT:
        return createGlBlendTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.GL_ENUMERATION:
        return createGlEnumerationFromString(eDataType, initialValue);
      case ColladaPackage.GLES_ENUMERATION:
        return createGlesEnumerationFromString(eDataType, initialValue);
      case ColladaPackage.GLESMAXCLIPPLANES_INDEX:
        return createGLESMAXCLIPPLANESIndexFromString(eDataType, initialValue);
      case ColladaPackage.GLESMAXLIGHTS_INDEX:
        return createGLESMAXLIGHTSIndexFromString(eDataType, initialValue);
      case ColladaPackage.GLESMAXTEXTURECOORDS_INDEX:
        return createGLESMAXTEXTURECOORDSIndexFromString(eDataType, initialValue);
      case ColladaPackage.GLESMAXTEXTUREIMAGEUNITS_INDEX:
        return createGLESMAXTEXTUREIMAGEUNITSIndexFromString(eDataType, initialValue);
      case ColladaPackage.GLES_RENDERTARGET_COMMON:
        return createGlesRendertargetCommonFromString(eDataType, initialValue);
      case ColladaPackage.GLES_SAMPLER_WRAP_OBJECT:
        return createGlesSamplerWrapObjectFromString(eDataType, initialValue);
      case ColladaPackage.GLES_STENCIL_OP_TYPE_OBJECT:
        return createGlesStencilOpTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_INDEX_TYPE:
        return createGlesTexcombinerArgumentIndexTypeFromString(eDataType, initialValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERAND_ALPHA_ENUMS_OBJECT:
        return createGlesTexcombinerOperandAlphaEnumsObjectFromString(eDataType, initialValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERAND_RGB_ENUMS_OBJECT:
        return createGlesTexcombinerOperandRGBEnumsObjectFromString(eDataType, initialValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERATOR_ALPHA_ENUMS_OBJECT:
        return createGlesTexcombinerOperatorAlphaEnumsObjectFromString(eDataType, initialValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERATOR_RGB_ENUMS_OBJECT:
        return createGlesTexcombinerOperatorRGBEnumsObjectFromString(eDataType, initialValue);
      case ColladaPackage.GLES_TEXCOMBINER_SOURCE_ENUMS_OBJECT:
        return createGlesTexcombinerSourceEnumsObjectFromString(eDataType, initialValue);
      case ColladaPackage.GLES_TEXENV_MODE_ENUMS_OBJECT:
        return createGlesTexenvModeEnumsObjectFromString(eDataType, initialValue);
      case ColladaPackage.GL_FACE_TYPE_OBJECT:
        return createGlFaceTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.GL_FOG_COORD_SRC_TYPE_OBJECT:
        return createGlFogCoordSrcTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.GL_FOG_TYPE_OBJECT:
        return createGlFogTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.GL_FRONT_FACE_TYPE_OBJECT:
        return createGlFrontFaceTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.GL_FUNC_TYPE_OBJECT:
        return createGlFuncTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.GL_LIGHT_MODEL_COLOR_CONTROL_TYPE_OBJECT:
        return createGlLightModelColorControlTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.GL_LOGIC_OP_TYPE_OBJECT:
        return createGlLogicOpTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.GL_MATERIAL_TYPE_OBJECT:
        return createGlMaterialTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.GLMAXCLIPPLANES_INDEX:
        return createGLMAXCLIPPLANESIndexFromString(eDataType, initialValue);
      case ColladaPackage.GLMAXLIGHTS_INDEX:
        return createGLMAXLIGHTSIndexFromString(eDataType, initialValue);
      case ColladaPackage.GLMAXTEXTUREIMAGEUNITS_INDEX:
        return createGLMAXTEXTUREIMAGEUNITSIndexFromString(eDataType, initialValue);
      case ColladaPackage.GL_POLYGON_MODE_TYPE_OBJECT:
        return createGlPolygonModeTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.GL_SHADE_MODEL_TYPE_OBJECT:
        return createGlShadeModelTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.GLSL_BOOL:
        return createGlslBoolFromString(eDataType, initialValue);
      case ColladaPackage.GLSL_BOOL2:
        return createGlslBool2FromString(eDataType, initialValue);
      case ColladaPackage.GLSL_BOOL3:
        return createGlslBool3FromString(eDataType, initialValue);
      case ColladaPackage.GLSL_BOOL4:
        return createGlslBool4FromString(eDataType, initialValue);
      case ColladaPackage.GLSL_BOOL_OBJECT:
        return createGlslBoolObjectFromString(eDataType, initialValue);
      case ColladaPackage.GLSL_FLOAT:
        return createGlslFloatFromString(eDataType, initialValue);
      case ColladaPackage.GLSL_FLOAT2:
        return createGlslFloat2FromString(eDataType, initialValue);
      case ColladaPackage.GLSL_FLOAT2X2:
        return createGlslFloat2x2FromString(eDataType, initialValue);
      case ColladaPackage.GLSL_FLOAT3:
        return createGlslFloat3FromString(eDataType, initialValue);
      case ColladaPackage.GLSL_FLOAT3X3:
        return createGlslFloat3x3FromString(eDataType, initialValue);
      case ColladaPackage.GLSL_FLOAT4:
        return createGlslFloat4FromString(eDataType, initialValue);
      case ColladaPackage.GLSL_FLOAT4X4:
        return createGlslFloat4x4FromString(eDataType, initialValue);
      case ColladaPackage.GLSL_FLOAT_OBJECT:
        return createGlslFloatObjectFromString(eDataType, initialValue);
      case ColladaPackage.GLSL_IDENTIFIER:
        return createGlslIdentifierFromString(eDataType, initialValue);
      case ColladaPackage.GLSL_INT:
        return createGlslIntFromString(eDataType, initialValue);
      case ColladaPackage.GLSL_INT2:
        return createGlslInt2FromString(eDataType, initialValue);
      case ColladaPackage.GLSL_INT3:
        return createGlslInt3FromString(eDataType, initialValue);
      case ColladaPackage.GLSL_INT4:
        return createGlslInt4FromString(eDataType, initialValue);
      case ColladaPackage.GLSL_INT_OBJECT:
        return createGlslIntObjectFromString(eDataType, initialValue);
      case ColladaPackage.GLSL_LIST_OF_BOOL:
        return createGlslListOfBoolFromString(eDataType, initialValue);
      case ColladaPackage.GLSL_LIST_OF_FLOAT:
        return createGlslListOfFloatFromString(eDataType, initialValue);
      case ColladaPackage.GLSL_LIST_OF_INT:
        return createGlslListOfIntFromString(eDataType, initialValue);
      case ColladaPackage.GLSL_PIPELINE_STAGE_OBJECT:
        return createGlslPipelineStageObjectFromString(eDataType, initialValue);
      case ColladaPackage.GL_STENCIL_OP_TYPE_OBJECT:
        return createGlStencilOpTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.INT:
        return createIntFromString(eDataType, initialValue);
      case ColladaPackage.INT2:
        return createInt2FromString(eDataType, initialValue);
      case ColladaPackage.INT2X2:
        return createInt2x2FromString(eDataType, initialValue);
      case ColladaPackage.INT3:
        return createInt3FromString(eDataType, initialValue);
      case ColladaPackage.INT3X3:
        return createInt3x3FromString(eDataType, initialValue);
      case ColladaPackage.INT4:
        return createInt4FromString(eDataType, initialValue);
      case ColladaPackage.INT4X4:
        return createInt4x4FromString(eDataType, initialValue);
      case ColladaPackage.INT_OBJECT:
        return createIntObjectFromString(eDataType, initialValue);
      case ColladaPackage.LIST_OF_BOOLS:
        return createListOfBoolsFromString(eDataType, initialValue);
      case ColladaPackage.LIST_OF_FLOATS:
        return createListOfFloatsFromString(eDataType, initialValue);
      case ColladaPackage.LIST_OF_HEX_BINARY:
        return createListOfHexBinaryFromString(eDataType, initialValue);
      case ColladaPackage.LIST_OF_INTS:
        return createListOfIntsFromString(eDataType, initialValue);
      case ColladaPackage.LIST_OF_NAMES:
        return createListOfNamesFromString(eDataType, initialValue);
      case ColladaPackage.LIST_OF_TOKENS:
        return createListOfTokensFromString(eDataType, initialValue);
      case ColladaPackage.LIST_OF_UINTS:
        return createListOfUIntsFromString(eDataType, initialValue);
      case ColladaPackage.MORPH_METHOD_TYPE_OBJECT:
        return createMorphMethodTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.NAME:
        return createNameFromString(eDataType, initialValue);
      case ColladaPackage.NODE_TYPE_OBJECT:
        return createNodeTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.SPRING_TYPE_OBJECT:
        return createSpringTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.STRING:
        return createStringFromString(eDataType, initialValue);
      case ColladaPackage.TOKEN:
        return createTokenFromString(eDataType, initialValue);
      case ColladaPackage.UINT:
        return createUintFromString(eDataType, initialValue);
      case ColladaPackage.UP_AXIS_TYPE_OBJECT:
        return createUpAxisTypeObjectFromString(eDataType, initialValue);
      case ColladaPackage.URI_FRAGMENT_TYPE:
        return createURIFragmentTypeFromString(eDataType, initialValue);
      case ColladaPackage.VERSION_TYPE_OBJECT:
        return createVersionTypeObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID())
    {
      case ColladaPackage.CG_PIPELINE_STAGE:
        return convertCgPipelineStageToString(eDataType, instanceValue);
      case ColladaPackage.COMMON_PROFILE_INPUT:
        return convertCommonProfileInputToString(eDataType, instanceValue);
      case ColladaPackage.COMMON_PROFILE_PARAM:
        return convertCommonProfileParamToString(eDataType, instanceValue);
      case ColladaPackage.FX_MODIFIER_ENUM_COMMON:
        return convertFxModifierEnumCommonToString(eDataType, instanceValue);
      case ColladaPackage.FX_OPAQUE_ENUM:
        return convertFxOpaqueEnumToString(eDataType, instanceValue);
      case ColladaPackage.FX_PIPELINE_STAGE_COMMON:
        return convertFxPipelineStageCommonToString(eDataType, instanceValue);
      case ColladaPackage.FX_SAMPLER_FILTER_COMMON:
        return convertFxSamplerFilterCommonToString(eDataType, instanceValue);
      case ColladaPackage.FX_SAMPLER_WRAP_COMMON:
        return convertFxSamplerWrapCommonToString(eDataType, instanceValue);
      case ColladaPackage.FX_SURFACE_FACE_ENUM:
        return convertFxSurfaceFaceEnumToString(eDataType, instanceValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_CHANNELS_ENUM:
        return convertFxSurfaceFormatHintChannelsEnumToString(eDataType, instanceValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_OPTION_ENUM:
        return convertFxSurfaceFormatHintOptionEnumToString(eDataType, instanceValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_PRECISION_ENUM:
        return convertFxSurfaceFormatHintPrecisionEnumToString(eDataType, instanceValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_RANGE_ENUM:
        return convertFxSurfaceFormatHintRangeEnumToString(eDataType, instanceValue);
      case ColladaPackage.FX_SURFACE_TYPE_ENUM:
        return convertFxSurfaceTypeEnumToString(eDataType, instanceValue);
      case ColladaPackage.GL_BLEND_EQUATION_TYPE:
        return convertGlBlendEquationTypeToString(eDataType, instanceValue);
      case ColladaPackage.GL_BLEND_TYPE:
        return convertGlBlendTypeToString(eDataType, instanceValue);
      case ColladaPackage.GLES_SAMPLER_WRAP:
        return convertGlesSamplerWrapToString(eDataType, instanceValue);
      case ColladaPackage.GLES_STENCIL_OP_TYPE:
        return convertGlesStencilOpTypeToString(eDataType, instanceValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERAND_ALPHA_ENUMS:
        return convertGlesTexcombinerOperandAlphaEnumsToString(eDataType, instanceValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERAND_RGB_ENUMS:
        return convertGlesTexcombinerOperandRGBEnumsToString(eDataType, instanceValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERATOR_ALPHA_ENUMS:
        return convertGlesTexcombinerOperatorAlphaEnumsToString(eDataType, instanceValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERATOR_RGB_ENUMS:
        return convertGlesTexcombinerOperatorRGBEnumsToString(eDataType, instanceValue);
      case ColladaPackage.GLES_TEXCOMBINER_SOURCE_ENUMS:
        return convertGlesTexcombinerSourceEnumsToString(eDataType, instanceValue);
      case ColladaPackage.GLES_TEXENV_MODE_ENUMS:
        return convertGlesTexenvModeEnumsToString(eDataType, instanceValue);
      case ColladaPackage.GL_FACE_TYPE:
        return convertGlFaceTypeToString(eDataType, instanceValue);
      case ColladaPackage.GL_FOG_COORD_SRC_TYPE:
        return convertGlFogCoordSrcTypeToString(eDataType, instanceValue);
      case ColladaPackage.GL_FOG_TYPE:
        return convertGlFogTypeToString(eDataType, instanceValue);
      case ColladaPackage.GL_FRONT_FACE_TYPE:
        return convertGlFrontFaceTypeToString(eDataType, instanceValue);
      case ColladaPackage.GL_FUNC_TYPE:
        return convertGlFuncTypeToString(eDataType, instanceValue);
      case ColladaPackage.GL_LIGHT_MODEL_COLOR_CONTROL_TYPE:
        return convertGlLightModelColorControlTypeToString(eDataType, instanceValue);
      case ColladaPackage.GL_LOGIC_OP_TYPE:
        return convertGlLogicOpTypeToString(eDataType, instanceValue);
      case ColladaPackage.GL_MATERIAL_TYPE:
        return convertGlMaterialTypeToString(eDataType, instanceValue);
      case ColladaPackage.GL_POLYGON_MODE_TYPE:
        return convertGlPolygonModeTypeToString(eDataType, instanceValue);
      case ColladaPackage.GL_SHADE_MODEL_TYPE:
        return convertGlShadeModelTypeToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_PIPELINE_STAGE:
        return convertGlslPipelineStageToString(eDataType, instanceValue);
      case ColladaPackage.GL_STENCIL_OP_TYPE:
        return convertGlStencilOpTypeToString(eDataType, instanceValue);
      case ColladaPackage.MORPH_METHOD_TYPE:
        return convertMorphMethodTypeToString(eDataType, instanceValue);
      case ColladaPackage.NODE_TYPE:
        return convertNodeTypeToString(eDataType, instanceValue);
      case ColladaPackage.SPRING_TYPE:
        return convertSpringTypeToString(eDataType, instanceValue);
      case ColladaPackage.UP_AXIS_TYPE:
        return convertUpAxisTypeToString(eDataType, instanceValue);
      case ColladaPackage.VERSION_TYPE:
        return convertVersionTypeToString(eDataType, instanceValue);
      case ColladaPackage.BOOL:
        return convertBoolToString(eDataType, instanceValue);
      case ColladaPackage.BOOL2:
        return convertBool2ToString(eDataType, instanceValue);
      case ColladaPackage.BOOL3:
        return convertBool3ToString(eDataType, instanceValue);
      case ColladaPackage.BOOL4:
        return convertBool4ToString(eDataType, instanceValue);
      case ColladaPackage.BOOL_OBJECT:
        return convertBoolObjectToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL:
        return convertCgBoolToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL1:
        return convertCgBool1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL1_OBJECT:
        return convertCgBool1ObjectToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL1X1:
        return convertCgBool1x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL1X2:
        return convertCgBool1x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL1X3:
        return convertCgBool1x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL1X4:
        return convertCgBool1x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL2:
        return convertCgBool2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL2X1:
        return convertCgBool2x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL2X2:
        return convertCgBool2x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL2X3:
        return convertCgBool2x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL2X4:
        return convertCgBool2x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL3:
        return convertCgBool3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL3X1:
        return convertCgBool3x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL3X2:
        return convertCgBool3x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL3X3:
        return convertCgBool3x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL3X4:
        return convertCgBool3x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL4:
        return convertCgBool4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL4X1:
        return convertCgBool4x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL4X2:
        return convertCgBool4x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL4X3:
        return convertCgBool4x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL4X4:
        return convertCgBool4x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_BOOL_OBJECT:
        return convertCgBoolObjectToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED:
        return convertCgFixedToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED1:
        return convertCgFixed1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED1_OBJECT:
        return convertCgFixed1ObjectToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED1X1:
        return convertCgFixed1x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED1X2:
        return convertCgFixed1x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED1X3:
        return convertCgFixed1x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED1X4:
        return convertCgFixed1x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED2:
        return convertCgFixed2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED2X1:
        return convertCgFixed2x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED2X2:
        return convertCgFixed2x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED2X3:
        return convertCgFixed2x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED2X4:
        return convertCgFixed2x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED3:
        return convertCgFixed3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED3X1:
        return convertCgFixed3x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED3X2:
        return convertCgFixed3x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED3X3:
        return convertCgFixed3x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED3X4:
        return convertCgFixed3x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED4:
        return convertCgFixed4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED4X1:
        return convertCgFixed4x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED4X2:
        return convertCgFixed4x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED4X3:
        return convertCgFixed4x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED4X4:
        return convertCgFixed4x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FIXED_OBJECT:
        return convertCgFixedObjectToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT:
        return convertCgFloatToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT1:
        return convertCgFloat1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT1_OBJECT:
        return convertCgFloat1ObjectToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT1X1:
        return convertCgFloat1x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT1X2:
        return convertCgFloat1x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT1X3:
        return convertCgFloat1x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT1X4:
        return convertCgFloat1x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT2:
        return convertCgFloat2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT2X1:
        return convertCgFloat2x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT2X2:
        return convertCgFloat2x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT2X3:
        return convertCgFloat2x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT2X4:
        return convertCgFloat2x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT3:
        return convertCgFloat3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT3X1:
        return convertCgFloat3x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT3X2:
        return convertCgFloat3x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT3X3:
        return convertCgFloat3x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT3X4:
        return convertCgFloat3x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT4:
        return convertCgFloat4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT4X1:
        return convertCgFloat4x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT4X2:
        return convertCgFloat4x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT4X3:
        return convertCgFloat4x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT4X4:
        return convertCgFloat4x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_FLOAT_OBJECT:
        return convertCgFloatObjectToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF:
        return convertCgHalfToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF1:
        return convertCgHalf1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF1_OBJECT:
        return convertCgHalf1ObjectToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF1X1:
        return convertCgHalf1x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF1X2:
        return convertCgHalf1x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF1X3:
        return convertCgHalf1x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF1X4:
        return convertCgHalf1x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF2:
        return convertCgHalf2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF2X1:
        return convertCgHalf2x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF2X2:
        return convertCgHalf2x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF2X3:
        return convertCgHalf2x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF2X4:
        return convertCgHalf2x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF3:
        return convertCgHalf3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF3X1:
        return convertCgHalf3x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF3X2:
        return convertCgHalf3x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF3X3:
        return convertCgHalf3x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF3X4:
        return convertCgHalf3x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF4:
        return convertCgHalf4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF4X1:
        return convertCgHalf4x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF4X2:
        return convertCgHalf4x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF4X3:
        return convertCgHalf4x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF4X4:
        return convertCgHalf4x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_HALF_OBJECT:
        return convertCgHalfObjectToString(eDataType, instanceValue);
      case ColladaPackage.CG_IDENTIFIER:
        return convertCgIdentifierToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT:
        return convertCgIntToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT1:
        return convertCgInt1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT1_OBJECT:
        return convertCgInt1ObjectToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT1X1:
        return convertCgInt1x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT1X2:
        return convertCgInt1x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT1X3:
        return convertCgInt1x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT1X4:
        return convertCgInt1x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT2:
        return convertCgInt2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT2X1:
        return convertCgInt2x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT2X2:
        return convertCgInt2x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT2X3:
        return convertCgInt2x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT2X4:
        return convertCgInt2x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT3:
        return convertCgInt3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT3X1:
        return convertCgInt3x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT3X2:
        return convertCgInt3x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT3X3:
        return convertCgInt3x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT3X4:
        return convertCgInt3x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT4:
        return convertCgInt4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT4X1:
        return convertCgInt4x1ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT4X2:
        return convertCgInt4x2ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT4X3:
        return convertCgInt4x3ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT4X4:
        return convertCgInt4x4ToString(eDataType, instanceValue);
      case ColladaPackage.CG_INT_OBJECT:
        return convertCgIntObjectToString(eDataType, instanceValue);
      case ColladaPackage.CG_LIST_OF_BOOL:
        return convertCgListOfBoolToString(eDataType, instanceValue);
      case ColladaPackage.CG_LIST_OF_FIXED:
        return convertCgListOfFixedToString(eDataType, instanceValue);
      case ColladaPackage.CG_LIST_OF_FLOAT:
        return convertCgListOfFloatToString(eDataType, instanceValue);
      case ColladaPackage.CG_LIST_OF_HALF:
        return convertCgListOfHalfToString(eDataType, instanceValue);
      case ColladaPackage.CG_LIST_OF_INT:
        return convertCgListOfIntToString(eDataType, instanceValue);
      case ColladaPackage.CG_PIPELINE_STAGE_OBJECT:
        return convertCgPipelineStageObjectToString(eDataType, instanceValue);
      case ColladaPackage.COMMON_PROFILE_INPUT_OBJECT:
        return convertCommonProfileInputObjectToString(eDataType, instanceValue);
      case ColladaPackage.COMMON_PROFILE_PARAM_OBJECT:
        return convertCommonProfileParamObjectToString(eDataType, instanceValue);
      case ColladaPackage.DATE_TIME:
        return convertDateTimeToString(eDataType, instanceValue);
      case ColladaPackage.FLOAT:
        return convertFloatToString(eDataType, instanceValue);
      case ColladaPackage.FLOAT2:
        return convertFloat2ToString(eDataType, instanceValue);
      case ColladaPackage.FLOAT2X2:
        return convertFloat2x2ToString(eDataType, instanceValue);
      case ColladaPackage.FLOAT2X3:
        return convertFloat2x3ToString(eDataType, instanceValue);
      case ColladaPackage.FLOAT2X4:
        return convertFloat2x4ToString(eDataType, instanceValue);
      case ColladaPackage.FLOAT3:
        return convertFloat3ToString(eDataType, instanceValue);
      case ColladaPackage.FLOAT3X2:
        return convertFloat3x2ToString(eDataType, instanceValue);
      case ColladaPackage.FLOAT3X3:
        return convertFloat3x3ToString(eDataType, instanceValue);
      case ColladaPackage.FLOAT3X4:
        return convertFloat3x4ToString(eDataType, instanceValue);
      case ColladaPackage.FLOAT4:
        return convertFloat4ToString(eDataType, instanceValue);
      case ColladaPackage.FLOAT4X2:
        return convertFloat4x2ToString(eDataType, instanceValue);
      case ColladaPackage.FLOAT4X3:
        return convertFloat4x3ToString(eDataType, instanceValue);
      case ColladaPackage.FLOAT4X4:
        return convertFloat4x4ToString(eDataType, instanceValue);
      case ColladaPackage.FLOAT7:
        return convertFloat7ToString(eDataType, instanceValue);
      case ColladaPackage.FLOAT_OBJECT:
        return convertFloatObjectToString(eDataType, instanceValue);
      case ColladaPackage.FX_COLOR_COMMON:
        return convertFxColorCommonToString(eDataType, instanceValue);
      case ColladaPackage.FX_DRAW_COMMON:
        return convertFxDrawCommonToString(eDataType, instanceValue);
      case ColladaPackage.FX_MODIFIER_ENUM_COMMON_OBJECT:
        return convertFxModifierEnumCommonObjectToString(eDataType, instanceValue);
      case ColladaPackage.FX_OPAQUE_ENUM_OBJECT:
        return convertFxOpaqueEnumObjectToString(eDataType, instanceValue);
      case ColladaPackage.FX_PIPELINE_STAGE_COMMON_OBJECT:
        return convertFxPipelineStageCommonObjectToString(eDataType, instanceValue);
      case ColladaPackage.FX_SAMPLER_FILTER_COMMON_OBJECT:
        return convertFxSamplerFilterCommonObjectToString(eDataType, instanceValue);
      case ColladaPackage.FX_SAMPLER_WRAP_COMMON_OBJECT:
        return convertFxSamplerWrapCommonObjectToString(eDataType, instanceValue);
      case ColladaPackage.FX_SURFACE_FACE_ENUM_OBJECT:
        return convertFxSurfaceFaceEnumObjectToString(eDataType, instanceValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_CHANNELS_ENUM_OBJECT:
        return convertFxSurfaceFormatHintChannelsEnumObjectToString(eDataType, instanceValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_OPTION_ENUM_OBJECT:
        return convertFxSurfaceFormatHintOptionEnumObjectToString(eDataType, instanceValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_PRECISION_ENUM_OBJECT:
        return convertFxSurfaceFormatHintPrecisionEnumObjectToString(eDataType, instanceValue);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_RANGE_ENUM_OBJECT:
        return convertFxSurfaceFormatHintRangeEnumObjectToString(eDataType, instanceValue);
      case ColladaPackage.FX_SURFACE_TYPE_ENUM_OBJECT:
        return convertFxSurfaceTypeEnumObjectToString(eDataType, instanceValue);
      case ColladaPackage.GL_ALPHA_VALUE_TYPE:
        return convertGlAlphaValueTypeToString(eDataType, instanceValue);
      case ColladaPackage.GL_ALPHA_VALUE_TYPE_OBJECT:
        return convertGlAlphaValueTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.GL_BLEND_EQUATION_TYPE_OBJECT:
        return convertGlBlendEquationTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.GL_BLEND_TYPE_OBJECT:
        return convertGlBlendTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.GL_ENUMERATION:
        return convertGlEnumerationToString(eDataType, instanceValue);
      case ColladaPackage.GLES_ENUMERATION:
        return convertGlesEnumerationToString(eDataType, instanceValue);
      case ColladaPackage.GLESMAXCLIPPLANES_INDEX:
        return convertGLESMAXCLIPPLANESIndexToString(eDataType, instanceValue);
      case ColladaPackage.GLESMAXLIGHTS_INDEX:
        return convertGLESMAXLIGHTSIndexToString(eDataType, instanceValue);
      case ColladaPackage.GLESMAXTEXTURECOORDS_INDEX:
        return convertGLESMAXTEXTURECOORDSIndexToString(eDataType, instanceValue);
      case ColladaPackage.GLESMAXTEXTUREIMAGEUNITS_INDEX:
        return convertGLESMAXTEXTUREIMAGEUNITSIndexToString(eDataType, instanceValue);
      case ColladaPackage.GLES_RENDERTARGET_COMMON:
        return convertGlesRendertargetCommonToString(eDataType, instanceValue);
      case ColladaPackage.GLES_SAMPLER_WRAP_OBJECT:
        return convertGlesSamplerWrapObjectToString(eDataType, instanceValue);
      case ColladaPackage.GLES_STENCIL_OP_TYPE_OBJECT:
        return convertGlesStencilOpTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_INDEX_TYPE:
        return convertGlesTexcombinerArgumentIndexTypeToString(eDataType, instanceValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERAND_ALPHA_ENUMS_OBJECT:
        return convertGlesTexcombinerOperandAlphaEnumsObjectToString(eDataType, instanceValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERAND_RGB_ENUMS_OBJECT:
        return convertGlesTexcombinerOperandRGBEnumsObjectToString(eDataType, instanceValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERATOR_ALPHA_ENUMS_OBJECT:
        return convertGlesTexcombinerOperatorAlphaEnumsObjectToString(eDataType, instanceValue);
      case ColladaPackage.GLES_TEXCOMBINER_OPERATOR_RGB_ENUMS_OBJECT:
        return convertGlesTexcombinerOperatorRGBEnumsObjectToString(eDataType, instanceValue);
      case ColladaPackage.GLES_TEXCOMBINER_SOURCE_ENUMS_OBJECT:
        return convertGlesTexcombinerSourceEnumsObjectToString(eDataType, instanceValue);
      case ColladaPackage.GLES_TEXENV_MODE_ENUMS_OBJECT:
        return convertGlesTexenvModeEnumsObjectToString(eDataType, instanceValue);
      case ColladaPackage.GL_FACE_TYPE_OBJECT:
        return convertGlFaceTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.GL_FOG_COORD_SRC_TYPE_OBJECT:
        return convertGlFogCoordSrcTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.GL_FOG_TYPE_OBJECT:
        return convertGlFogTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.GL_FRONT_FACE_TYPE_OBJECT:
        return convertGlFrontFaceTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.GL_FUNC_TYPE_OBJECT:
        return convertGlFuncTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.GL_LIGHT_MODEL_COLOR_CONTROL_TYPE_OBJECT:
        return convertGlLightModelColorControlTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.GL_LOGIC_OP_TYPE_OBJECT:
        return convertGlLogicOpTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.GL_MATERIAL_TYPE_OBJECT:
        return convertGlMaterialTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.GLMAXCLIPPLANES_INDEX:
        return convertGLMAXCLIPPLANESIndexToString(eDataType, instanceValue);
      case ColladaPackage.GLMAXLIGHTS_INDEX:
        return convertGLMAXLIGHTSIndexToString(eDataType, instanceValue);
      case ColladaPackage.GLMAXTEXTUREIMAGEUNITS_INDEX:
        return convertGLMAXTEXTUREIMAGEUNITSIndexToString(eDataType, instanceValue);
      case ColladaPackage.GL_POLYGON_MODE_TYPE_OBJECT:
        return convertGlPolygonModeTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.GL_SHADE_MODEL_TYPE_OBJECT:
        return convertGlShadeModelTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_BOOL:
        return convertGlslBoolToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_BOOL2:
        return convertGlslBool2ToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_BOOL3:
        return convertGlslBool3ToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_BOOL4:
        return convertGlslBool4ToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_BOOL_OBJECT:
        return convertGlslBoolObjectToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_FLOAT:
        return convertGlslFloatToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_FLOAT2:
        return convertGlslFloat2ToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_FLOAT2X2:
        return convertGlslFloat2x2ToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_FLOAT3:
        return convertGlslFloat3ToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_FLOAT3X3:
        return convertGlslFloat3x3ToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_FLOAT4:
        return convertGlslFloat4ToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_FLOAT4X4:
        return convertGlslFloat4x4ToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_FLOAT_OBJECT:
        return convertGlslFloatObjectToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_IDENTIFIER:
        return convertGlslIdentifierToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_INT:
        return convertGlslIntToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_INT2:
        return convertGlslInt2ToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_INT3:
        return convertGlslInt3ToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_INT4:
        return convertGlslInt4ToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_INT_OBJECT:
        return convertGlslIntObjectToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_LIST_OF_BOOL:
        return convertGlslListOfBoolToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_LIST_OF_FLOAT:
        return convertGlslListOfFloatToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_LIST_OF_INT:
        return convertGlslListOfIntToString(eDataType, instanceValue);
      case ColladaPackage.GLSL_PIPELINE_STAGE_OBJECT:
        return convertGlslPipelineStageObjectToString(eDataType, instanceValue);
      case ColladaPackage.GL_STENCIL_OP_TYPE_OBJECT:
        return convertGlStencilOpTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.INT:
        return convertIntToString(eDataType, instanceValue);
      case ColladaPackage.INT2:
        return convertInt2ToString(eDataType, instanceValue);
      case ColladaPackage.INT2X2:
        return convertInt2x2ToString(eDataType, instanceValue);
      case ColladaPackage.INT3:
        return convertInt3ToString(eDataType, instanceValue);
      case ColladaPackage.INT3X3:
        return convertInt3x3ToString(eDataType, instanceValue);
      case ColladaPackage.INT4:
        return convertInt4ToString(eDataType, instanceValue);
      case ColladaPackage.INT4X4:
        return convertInt4x4ToString(eDataType, instanceValue);
      case ColladaPackage.INT_OBJECT:
        return convertIntObjectToString(eDataType, instanceValue);
      case ColladaPackage.LIST_OF_BOOLS:
        return convertListOfBoolsToString(eDataType, instanceValue);
      case ColladaPackage.LIST_OF_FLOATS:
        return convertListOfFloatsToString(eDataType, instanceValue);
      case ColladaPackage.LIST_OF_HEX_BINARY:
        return convertListOfHexBinaryToString(eDataType, instanceValue);
      case ColladaPackage.LIST_OF_INTS:
        return convertListOfIntsToString(eDataType, instanceValue);
      case ColladaPackage.LIST_OF_NAMES:
        return convertListOfNamesToString(eDataType, instanceValue);
      case ColladaPackage.LIST_OF_TOKENS:
        return convertListOfTokensToString(eDataType, instanceValue);
      case ColladaPackage.LIST_OF_UINTS:
        return convertListOfUIntsToString(eDataType, instanceValue);
      case ColladaPackage.MORPH_METHOD_TYPE_OBJECT:
        return convertMorphMethodTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.NAME:
        return convertNameToString(eDataType, instanceValue);
      case ColladaPackage.NODE_TYPE_OBJECT:
        return convertNodeTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.SPRING_TYPE_OBJECT:
        return convertSpringTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.STRING:
        return convertStringToString(eDataType, instanceValue);
      case ColladaPackage.TOKEN:
        return convertTokenToString(eDataType, instanceValue);
      case ColladaPackage.UINT:
        return convertUintToString(eDataType, instanceValue);
      case ColladaPackage.UP_AXIS_TYPE_OBJECT:
        return convertUpAxisTypeObjectToString(eDataType, instanceValue);
      case ColladaPackage.URI_FRAGMENT_TYPE:
        return convertURIFragmentTypeToString(eDataType, instanceValue);
      case ColladaPackage.VERSION_TYPE_OBJECT:
        return convertVersionTypeObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AccessorType createAccessorType() {
    AccessorTypeImpl accessorType = new AccessorTypeImpl();
    return accessorType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AllType createAllType() {
    AllTypeImpl allType = new AllTypeImpl();
    return allType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AllType1 createAllType1() {
    AllType1Impl allType1 = new AllType1Impl();
    return allType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AllType2 createAllType2() {
    AllType2Impl allType2 = new AllType2Impl();
    return allType2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AlphaFuncType createAlphaFuncType() {
    AlphaFuncTypeImpl alphaFuncType = new AlphaFuncTypeImpl();
    return alphaFuncType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AlphaFuncType1 createAlphaFuncType1() {
    AlphaFuncType1Impl alphaFuncType1 = new AlphaFuncType1Impl();
    return alphaFuncType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AlphaTestEnableType createAlphaTestEnableType() {
    AlphaTestEnableTypeImpl alphaTestEnableType = new AlphaTestEnableTypeImpl();
    return alphaTestEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AlphaTestEnableType1 createAlphaTestEnableType1() {
    AlphaTestEnableType1Impl alphaTestEnableType1 = new AlphaTestEnableType1Impl();
    return alphaTestEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AlphaType createAlphaType() {
    AlphaTypeImpl alphaType = new AlphaTypeImpl();
    return alphaType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AmbientType createAmbientType() {
    AmbientTypeImpl ambientType = new AmbientTypeImpl();
    return ambientType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AngularType createAngularType() {
    AngularTypeImpl angularType = new AngularTypeImpl();
    return angularType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnimationClipType createAnimationClipType() {
    AnimationClipTypeImpl animationClipType = new AnimationClipTypeImpl();
    return animationClipType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnimationType createAnimationType() {
    AnimationTypeImpl animationType = new AnimationTypeImpl();
    return animationType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AssetType createAssetType() {
    AssetTypeImpl assetType = new AssetTypeImpl();
    return assetType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AttachmentType createAttachmentType() {
    AttachmentTypeImpl attachmentType = new AttachmentTypeImpl();
    return attachmentType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AutoNormalEnableType createAutoNormalEnableType() {
    AutoNormalEnableTypeImpl autoNormalEnableType = new AutoNormalEnableTypeImpl();
    return autoNormalEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BackType createBackType() {
    BackTypeImpl backType = new BackTypeImpl();
    return backType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BindMaterialType createBindMaterialType() {
    BindMaterialTypeImpl bindMaterialType = new BindMaterialTypeImpl();
    return bindMaterialType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BindType createBindType() {
    BindTypeImpl bindType = new BindTypeImpl();
    return bindType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BindType1 createBindType1() {
    BindType1Impl bindType1 = new BindType1Impl();
    return bindType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BindType2 createBindType2() {
    BindType2Impl bindType2 = new BindType2Impl();
    return bindType2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BindVertexInputType createBindVertexInputType() {
    BindVertexInputTypeImpl bindVertexInputType = new BindVertexInputTypeImpl();
    return bindVertexInputType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BlendColorType createBlendColorType() {
    BlendColorTypeImpl blendColorType = new BlendColorTypeImpl();
    return blendColorType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BlendEnableType createBlendEnableType() {
    BlendEnableTypeImpl blendEnableType = new BlendEnableTypeImpl();
    return blendEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BlendEnableType1 createBlendEnableType1() {
    BlendEnableType1Impl blendEnableType1 = new BlendEnableType1Impl();
    return blendEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BlendEquationSeparateType createBlendEquationSeparateType() {
    BlendEquationSeparateTypeImpl blendEquationSeparateType = new BlendEquationSeparateTypeImpl();
    return blendEquationSeparateType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BlendEquationType createBlendEquationType() {
    BlendEquationTypeImpl blendEquationType = new BlendEquationTypeImpl();
    return blendEquationType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BlendFuncSeparateType createBlendFuncSeparateType() {
    BlendFuncSeparateTypeImpl blendFuncSeparateType = new BlendFuncSeparateTypeImpl();
    return blendFuncSeparateType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BlendFuncType createBlendFuncType() {
    BlendFuncTypeImpl blendFuncType = new BlendFuncTypeImpl();
    return blendFuncType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BlendFuncType1 createBlendFuncType1() {
    BlendFuncType1Impl blendFuncType1 = new BlendFuncType1Impl();
    return blendFuncType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BlinnType createBlinnType() {
    BlinnTypeImpl blinnType = new BlinnTypeImpl();
    return blinnType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BoolArrayType createBoolArrayType() {
    BoolArrayTypeImpl boolArrayType = new BoolArrayTypeImpl();
    return boolArrayType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BoxType createBoxType() {
    BoxTypeImpl boxType = new BoxTypeImpl();
    return boxType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CameraType createCameraType() {
    CameraTypeImpl cameraType = new CameraTypeImpl();
    return cameraType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CapsuleType createCapsuleType() {
    CapsuleTypeImpl capsuleType = new CapsuleTypeImpl();
    return capsuleType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgConnectParam createCgConnectParam() {
    CgConnectParamImpl cgConnectParam = new CgConnectParamImpl();
    return cgConnectParam;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgNewarrayType createCgNewarrayType() {
    CgNewarrayTypeImpl cgNewarrayType = new CgNewarrayTypeImpl();
    return cgNewarrayType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgNewparam createCgNewparam() {
    CgNewparamImpl cgNewparam = new CgNewparamImpl();
    return cgNewparam;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSampler1D createCgSampler1D() {
    CgSampler1DImpl cgSampler1D = new CgSampler1DImpl();
    return cgSampler1D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSampler2D createCgSampler2D() {
    CgSampler2DImpl cgSampler2D = new CgSampler2DImpl();
    return cgSampler2D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSampler3D createCgSampler3D() {
    CgSampler3DImpl cgSampler3D = new CgSampler3DImpl();
    return cgSampler3D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSamplerCUBE createCgSamplerCUBE() {
    CgSamplerCUBEImpl cgSamplerCUBE = new CgSamplerCUBEImpl();
    return cgSamplerCUBE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSamplerDEPTH createCgSamplerDEPTH() {
    CgSamplerDEPTHImpl cgSamplerDEPTH = new CgSamplerDEPTHImpl();
    return cgSamplerDEPTH;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSamplerRECT createCgSamplerRECT() {
    CgSamplerRECTImpl cgSamplerRECT = new CgSamplerRECTImpl();
    return cgSamplerRECT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSetarrayType createCgSetarrayType() {
    CgSetarrayTypeImpl cgSetarrayType = new CgSetarrayTypeImpl();
    return cgSetarrayType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSetparam createCgSetparam() {
    CgSetparamImpl cgSetparam = new CgSetparamImpl();
    return cgSetparam;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSetparamSimple createCgSetparamSimple() {
    CgSetparamSimpleImpl cgSetparamSimple = new CgSetparamSimpleImpl();
    return cgSetparamSimple;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSetuserType createCgSetuserType() {
    CgSetuserTypeImpl cgSetuserType = new CgSetuserTypeImpl();
    return cgSetuserType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgSurfaceType createCgSurfaceType() {
    CgSurfaceTypeImpl cgSurfaceType = new CgSurfaceTypeImpl();
    return cgSurfaceType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ChannelType createChannelType() {
    ChannelTypeImpl channelType = new ChannelTypeImpl();
    return channelType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClearColorType createClearColorType() {
    ClearColorTypeImpl clearColorType = new ClearColorTypeImpl();
    return clearColorType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClearColorType1 createClearColorType1() {
    ClearColorType1Impl clearColorType1 = new ClearColorType1Impl();
    return clearColorType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClearDepthType createClearDepthType() {
    ClearDepthTypeImpl clearDepthType = new ClearDepthTypeImpl();
    return clearDepthType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClearDepthType1 createClearDepthType1() {
    ClearDepthType1Impl clearDepthType1 = new ClearDepthType1Impl();
    return clearDepthType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClearStencilType createClearStencilType() {
    ClearStencilTypeImpl clearStencilType = new ClearStencilTypeImpl();
    return clearStencilType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClearStencilType1 createClearStencilType1() {
    ClearStencilType1Impl clearStencilType1 = new ClearStencilType1Impl();
    return clearStencilType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClipPlaneEnableType createClipPlaneEnableType() {
    ClipPlaneEnableTypeImpl clipPlaneEnableType = new ClipPlaneEnableTypeImpl();
    return clipPlaneEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClipPlaneEnableType1 createClipPlaneEnableType1() {
    ClipPlaneEnableType1Impl clipPlaneEnableType1 = new ClipPlaneEnableType1Impl();
    return clipPlaneEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClipPlaneType createClipPlaneType() {
    ClipPlaneTypeImpl clipPlaneType = new ClipPlaneTypeImpl();
    return clipPlaneType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClipPlaneType1 createClipPlaneType1() {
    ClipPlaneType1Impl clipPlaneType1 = new ClipPlaneType1Impl();
    return clipPlaneType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public COLLADAType createCOLLADAType() {
    COLLADATypeImpl colladaType = new COLLADATypeImpl();
    return colladaType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColorLogicOpEnableType createColorLogicOpEnableType() {
    ColorLogicOpEnableTypeImpl colorLogicOpEnableType = new ColorLogicOpEnableTypeImpl();
    return colorLogicOpEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColorLogicOpEnableType1 createColorLogicOpEnableType1() {
    ColorLogicOpEnableType1Impl colorLogicOpEnableType1 = new ColorLogicOpEnableType1Impl();
    return colorLogicOpEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColorMaskType createColorMaskType() {
    ColorMaskTypeImpl colorMaskType = new ColorMaskTypeImpl();
    return colorMaskType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColorMaskType1 createColorMaskType1() {
    ColorMaskType1Impl colorMaskType1 = new ColorMaskType1Impl();
    return colorMaskType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColorMaterialEnableType createColorMaterialEnableType() {
    ColorMaterialEnableTypeImpl colorMaterialEnableType = new ColorMaterialEnableTypeImpl();
    return colorMaterialEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColorMaterialEnableType1 createColorMaterialEnableType1() {
    ColorMaterialEnableType1Impl colorMaterialEnableType1 = new ColorMaterialEnableType1Impl();
    return colorMaterialEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColorMaterialType createColorMaterialType() {
    ColorMaterialTypeImpl colorMaterialType = new ColorMaterialTypeImpl();
    return colorMaterialType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColorType createColorType() {
    ColorTypeImpl colorType = new ColorTypeImpl();
    return colorType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonColorOrTextureType createCommonColorOrTextureType() {
    CommonColorOrTextureTypeImpl commonColorOrTextureType = new CommonColorOrTextureTypeImpl();
    return commonColorOrTextureType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonFloatOrParamType createCommonFloatOrParamType() {
    CommonFloatOrParamTypeImpl commonFloatOrParamType = new CommonFloatOrParamTypeImpl();
    return commonFloatOrParamType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonNewparamType createCommonNewparamType() {
    CommonNewparamTypeImpl commonNewparamType = new CommonNewparamTypeImpl();
    return commonNewparamType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonTransparentType createCommonTransparentType() {
    CommonTransparentTypeImpl commonTransparentType = new CommonTransparentTypeImpl();
    return commonTransparentType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CompilerTargetType createCompilerTargetType() {
    CompilerTargetTypeImpl compilerTargetType = new CompilerTargetTypeImpl();
    return compilerTargetType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CompilerTargetType1 createCompilerTargetType1() {
    CompilerTargetType1Impl compilerTargetType1 = new CompilerTargetType1Impl();
    return compilerTargetType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ConstantType createConstantType() {
    ConstantTypeImpl constantType = new ConstantTypeImpl();
    return constantType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ContributorType createContributorType() {
    ContributorTypeImpl contributorType = new ContributorTypeImpl();
    return contributorType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ControllerType createControllerType() {
    ControllerTypeImpl controllerType = new ControllerTypeImpl();
    return controllerType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ControlVerticesType createControlVerticesType() {
    ControlVerticesTypeImpl controlVerticesType = new ControlVerticesTypeImpl();
    return controlVerticesType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ConvexMeshType createConvexMeshType() {
    ConvexMeshTypeImpl convexMeshType = new ConvexMeshTypeImpl();
    return convexMeshType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CullFaceEnableType createCullFaceEnableType() {
    CullFaceEnableTypeImpl cullFaceEnableType = new CullFaceEnableTypeImpl();
    return cullFaceEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CullFaceEnableType1 createCullFaceEnableType1() {
    CullFaceEnableType1Impl cullFaceEnableType1 = new CullFaceEnableType1Impl();
    return cullFaceEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CullFaceType createCullFaceType() {
    CullFaceTypeImpl cullFaceType = new CullFaceTypeImpl();
    return cullFaceType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CullFaceType1 createCullFaceType1() {
    CullFaceType1Impl cullFaceType1 = new CullFaceType1Impl();
    return cullFaceType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CylinderType createCylinderType() {
    CylinderTypeImpl cylinderType = new CylinderTypeImpl();
    return cylinderType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DepthBoundsEnableType createDepthBoundsEnableType() {
    DepthBoundsEnableTypeImpl depthBoundsEnableType = new DepthBoundsEnableTypeImpl();
    return depthBoundsEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DepthBoundsType createDepthBoundsType() {
    DepthBoundsTypeImpl depthBoundsType = new DepthBoundsTypeImpl();
    return depthBoundsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DepthClampEnableType createDepthClampEnableType() {
    DepthClampEnableTypeImpl depthClampEnableType = new DepthClampEnableTypeImpl();
    return depthClampEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DepthFuncType createDepthFuncType() {
    DepthFuncTypeImpl depthFuncType = new DepthFuncTypeImpl();
    return depthFuncType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DepthFuncType1 createDepthFuncType1() {
    DepthFuncType1Impl depthFuncType1 = new DepthFuncType1Impl();
    return depthFuncType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DepthMaskType createDepthMaskType() {
    DepthMaskTypeImpl depthMaskType = new DepthMaskTypeImpl();
    return depthMaskType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DepthMaskType1 createDepthMaskType1() {
    DepthMaskType1Impl depthMaskType1 = new DepthMaskType1Impl();
    return depthMaskType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DepthRangeType createDepthRangeType() {
    DepthRangeTypeImpl depthRangeType = new DepthRangeTypeImpl();
    return depthRangeType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DepthRangeType1 createDepthRangeType1() {
    DepthRangeType1Impl depthRangeType1 = new DepthRangeType1Impl();
    return depthRangeType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DepthTestEnableType createDepthTestEnableType() {
    DepthTestEnableTypeImpl depthTestEnableType = new DepthTestEnableTypeImpl();
    return depthTestEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DepthTestEnableType1 createDepthTestEnableType1() {
    DepthTestEnableType1Impl depthTestEnableType1 = new DepthTestEnableType1Impl();
    return depthTestEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DestAlphaType createDestAlphaType() {
    DestAlphaTypeImpl destAlphaType = new DestAlphaTypeImpl();
    return destAlphaType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DestRgbType createDestRgbType() {
    DestRgbTypeImpl destRgbType = new DestRgbTypeImpl();
    return destRgbType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DestType createDestType() {
    DestTypeImpl destType = new DestTypeImpl();
    return destType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DestType1 createDestType1() {
    DestType1Impl destType1 = new DestType1Impl();
    return destType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DirectionalType createDirectionalType() {
    DirectionalTypeImpl directionalType = new DirectionalTypeImpl();
    return directionalType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DitherEnableType createDitherEnableType() {
    DitherEnableTypeImpl ditherEnableType = new DitherEnableTypeImpl();
    return ditherEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DitherEnableType1 createDitherEnableType1() {
    DitherEnableType1Impl ditherEnableType1 = new DitherEnableType1Impl();
    return ditherEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DocumentRoot createDocumentRoot() {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DynamicType createDynamicType() {
    DynamicTypeImpl dynamicType = new DynamicTypeImpl();
    return dynamicType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DynamicType1 createDynamicType1() {
    DynamicType1Impl dynamicType1 = new DynamicType1Impl();
    return dynamicType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EffectType createEffectType() {
    EffectTypeImpl effectType = new EffectTypeImpl();
    return effectType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EllipsoidType createEllipsoidType() {
    EllipsoidTypeImpl ellipsoidType = new EllipsoidTypeImpl();
    return ellipsoidType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EnabledType createEnabledType() {
    EnabledTypeImpl enabledType = new EnabledTypeImpl();
    return enabledType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EvaluateSceneType createEvaluateSceneType() {
    EvaluateSceneTypeImpl evaluateSceneType = new EvaluateSceneTypeImpl();
    return evaluateSceneType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ExtraType createExtraType() {
    ExtraTypeImpl extraType = new ExtraTypeImpl();
    return extraType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FaceType createFaceType() {
    FaceTypeImpl faceType = new FaceTypeImpl();
    return faceType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FaceType1 createFaceType1() {
    FaceType1Impl faceType1 = new FaceType1Impl();
    return faceType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FaceType2 createFaceType2() {
    FaceType2Impl faceType2 = new FaceType2Impl();
    return faceType2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FaceType3 createFaceType3() {
    FaceType3Impl faceType3 = new FaceType3Impl();
    return faceType3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FaceType4 createFaceType4() {
    FaceType4Impl faceType4 = new FaceType4Impl();
    return faceType4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FailType createFailType() {
    FailTypeImpl failType = new FailTypeImpl();
    return failType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FailType1 createFailType1() {
    FailType1Impl failType1 = new FailType1Impl();
    return failType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FailType2 createFailType2() {
    FailType2Impl failType2 = new FailType2Impl();
    return failType2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FloatArrayType createFloatArrayType() {
    FloatArrayTypeImpl floatArrayType = new FloatArrayTypeImpl();
    return floatArrayType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FloatType createFloatType() {
    FloatTypeImpl floatType = new FloatTypeImpl();
    return floatType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FogColorType createFogColorType() {
    FogColorTypeImpl fogColorType = new FogColorTypeImpl();
    return fogColorType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FogColorType1 createFogColorType1() {
    FogColorType1Impl fogColorType1 = new FogColorType1Impl();
    return fogColorType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FogCoordSrcType createFogCoordSrcType() {
    FogCoordSrcTypeImpl fogCoordSrcType = new FogCoordSrcTypeImpl();
    return fogCoordSrcType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FogDensityType createFogDensityType() {
    FogDensityTypeImpl fogDensityType = new FogDensityTypeImpl();
    return fogDensityType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FogDensityType1 createFogDensityType1() {
    FogDensityType1Impl fogDensityType1 = new FogDensityType1Impl();
    return fogDensityType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FogEnableType createFogEnableType() {
    FogEnableTypeImpl fogEnableType = new FogEnableTypeImpl();
    return fogEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FogEnableType1 createFogEnableType1() {
    FogEnableType1Impl fogEnableType1 = new FogEnableType1Impl();
    return fogEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FogEndType createFogEndType() {
    FogEndTypeImpl fogEndType = new FogEndTypeImpl();
    return fogEndType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FogEndType1 createFogEndType1() {
    FogEndType1Impl fogEndType1 = new FogEndType1Impl();
    return fogEndType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FogModeType createFogModeType() {
    FogModeTypeImpl fogModeType = new FogModeTypeImpl();
    return fogModeType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FogModeType1 createFogModeType1() {
    FogModeType1Impl fogModeType1 = new FogModeType1Impl();
    return fogModeType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FogStartType createFogStartType() {
    FogStartTypeImpl fogStartType = new FogStartTypeImpl();
    return fogStartType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FogStartType1 createFogStartType1() {
    FogStartType1Impl fogStartType1 = new FogStartType1Impl();
    return fogStartType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ForceFieldType createForceFieldType() {
    ForceFieldTypeImpl forceFieldType = new ForceFieldTypeImpl();
    return forceFieldType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FrontFaceType createFrontFaceType() {
    FrontFaceTypeImpl frontFaceType = new FrontFaceTypeImpl();
    return frontFaceType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FrontFaceType1 createFrontFaceType1() {
    FrontFaceType1Impl frontFaceType1 = new FrontFaceType1Impl();
    return frontFaceType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FrontType createFrontType() {
    FrontTypeImpl frontType = new FrontTypeImpl();
    return frontType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FuncType createFuncType() {
    FuncTypeImpl funcType = new FuncTypeImpl();
    return funcType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FuncType1 createFuncType1() {
    FuncType1Impl funcType1 = new FuncType1Impl();
    return funcType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FuncType2 createFuncType2() {
    FuncType2Impl funcType2 = new FuncType2Impl();
    return funcType2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FuncType3 createFuncType3() {
    FuncType3Impl funcType3 = new FuncType3Impl();
    return funcType3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxAnnotateCommon createFxAnnotateCommon() {
    FxAnnotateCommonImpl fxAnnotateCommon = new FxAnnotateCommonImpl();
    return fxAnnotateCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxClearcolorCommon createFxClearcolorCommon() {
    FxClearcolorCommonImpl fxClearcolorCommon = new FxClearcolorCommonImpl();
    return fxClearcolorCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxCleardepthCommon createFxCleardepthCommon() {
    FxCleardepthCommonImpl fxCleardepthCommon = new FxCleardepthCommonImpl();
    return fxCleardepthCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxClearstencilCommon createFxClearstencilCommon() {
    FxClearstencilCommonImpl fxClearstencilCommon = new FxClearstencilCommonImpl();
    return fxClearstencilCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxCodeProfile createFxCodeProfile() {
    FxCodeProfileImpl fxCodeProfile = new FxCodeProfileImpl();
    return fxCodeProfile;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxColortargetCommon createFxColortargetCommon() {
    FxColortargetCommonImpl fxColortargetCommon = new FxColortargetCommonImpl();
    return fxColortargetCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxDepthtargetCommon createFxDepthtargetCommon() {
    FxDepthtargetCommonImpl fxDepthtargetCommon = new FxDepthtargetCommonImpl();
    return fxDepthtargetCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxIncludeCommon createFxIncludeCommon() {
    FxIncludeCommonImpl fxIncludeCommon = new FxIncludeCommonImpl();
    return fxIncludeCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxNewparamCommon createFxNewparamCommon() {
    FxNewparamCommonImpl fxNewparamCommon = new FxNewparamCommonImpl();
    return fxNewparamCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSampler1DCommon createFxSampler1DCommon() {
    FxSampler1DCommonImpl fxSampler1DCommon = new FxSampler1DCommonImpl();
    return fxSampler1DCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSampler2DCommon createFxSampler2DCommon() {
    FxSampler2DCommonImpl fxSampler2DCommon = new FxSampler2DCommonImpl();
    return fxSampler2DCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSampler3DCommon createFxSampler3DCommon() {
    FxSampler3DCommonImpl fxSampler3DCommon = new FxSampler3DCommonImpl();
    return fxSampler3DCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSamplerCUBECommon createFxSamplerCUBECommon() {
    FxSamplerCUBECommonImpl fxSamplerCUBECommon = new FxSamplerCUBECommonImpl();
    return fxSamplerCUBECommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSamplerDEPTHCommon createFxSamplerDEPTHCommon() {
    FxSamplerDEPTHCommonImpl fxSamplerDEPTHCommon = new FxSamplerDEPTHCommonImpl();
    return fxSamplerDEPTHCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSamplerRECTCommon createFxSamplerRECTCommon() {
    FxSamplerRECTCommonImpl fxSamplerRECTCommon = new FxSamplerRECTCommonImpl();
    return fxSamplerRECTCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxStenciltargetCommon createFxStenciltargetCommon() {
    FxStenciltargetCommonImpl fxStenciltargetCommon = new FxStenciltargetCommonImpl();
    return fxStenciltargetCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceCommon createFxSurfaceCommon() {
    FxSurfaceCommonImpl fxSurfaceCommon = new FxSurfaceCommonImpl();
    return fxSurfaceCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFormatHintCommon createFxSurfaceFormatHintCommon() {
    FxSurfaceFormatHintCommonImpl fxSurfaceFormatHintCommon = new FxSurfaceFormatHintCommonImpl();
    return fxSurfaceFormatHintCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceInitCubeCommon createFxSurfaceInitCubeCommon() {
    FxSurfaceInitCubeCommonImpl fxSurfaceInitCubeCommon = new FxSurfaceInitCubeCommonImpl();
    return fxSurfaceInitCubeCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceInitFromCommon createFxSurfaceInitFromCommon() {
    FxSurfaceInitFromCommonImpl fxSurfaceInitFromCommon = new FxSurfaceInitFromCommonImpl();
    return fxSurfaceInitFromCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceInitPlanarCommon createFxSurfaceInitPlanarCommon() {
    FxSurfaceInitPlanarCommonImpl fxSurfaceInitPlanarCommon = new FxSurfaceInitPlanarCommonImpl();
    return fxSurfaceInitPlanarCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceInitVolumeCommon createFxSurfaceInitVolumeCommon() {
    FxSurfaceInitVolumeCommonImpl fxSurfaceInitVolumeCommon = new FxSurfaceInitVolumeCommonImpl();
    return fxSurfaceInitVolumeCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GeneratorType createGeneratorType() {
    GeneratorTypeImpl generatorType = new GeneratorTypeImpl();
    return generatorType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GeneratorType1 createGeneratorType1() {
    GeneratorType1Impl generatorType1 = new GeneratorType1Impl();
    return generatorType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GeometryType createGeometryType() {
    GeometryTypeImpl geometryType = new GeometryTypeImpl();
    return geometryType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesNewparam createGlesNewparam() {
    GlesNewparamImpl glesNewparam = new GlesNewparamImpl();
    return glesNewparam;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesSamplerState createGlesSamplerState() {
    GlesSamplerStateImpl glesSamplerState = new GlesSamplerStateImpl();
    return glesSamplerState;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerArgumentAlphaType createGlesTexcombinerArgumentAlphaType() {
    GlesTexcombinerArgumentAlphaTypeImpl glesTexcombinerArgumentAlphaType = new GlesTexcombinerArgumentAlphaTypeImpl();
    return glesTexcombinerArgumentAlphaType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerArgumentRGBType createGlesTexcombinerArgumentRGBType() {
    GlesTexcombinerArgumentRGBTypeImpl glesTexcombinerArgumentRGBType = new GlesTexcombinerArgumentRGBTypeImpl();
    return glesTexcombinerArgumentRGBType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerCommandAlphaType createGlesTexcombinerCommandAlphaType() {
    GlesTexcombinerCommandAlphaTypeImpl glesTexcombinerCommandAlphaType = new GlesTexcombinerCommandAlphaTypeImpl();
    return glesTexcombinerCommandAlphaType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerCommandRGBType createGlesTexcombinerCommandRGBType() {
    GlesTexcombinerCommandRGBTypeImpl glesTexcombinerCommandRGBType = new GlesTexcombinerCommandRGBTypeImpl();
    return glesTexcombinerCommandRGBType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerCommandType createGlesTexcombinerCommandType() {
    GlesTexcombinerCommandTypeImpl glesTexcombinerCommandType = new GlesTexcombinerCommandTypeImpl();
    return glesTexcombinerCommandType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexenvCommandType createGlesTexenvCommandType() {
    GlesTexenvCommandTypeImpl glesTexenvCommandType = new GlesTexenvCommandTypeImpl();
    return glesTexenvCommandType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTextureConstantType createGlesTextureConstantType() {
    GlesTextureConstantTypeImpl glesTextureConstantType = new GlesTextureConstantTypeImpl();
    return glesTextureConstantType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexturePipeline createGlesTexturePipeline() {
    GlesTexturePipelineImpl glesTexturePipeline = new GlesTexturePipelineImpl();
    return glesTexturePipeline;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTextureUnit createGlesTextureUnit() {
    GlesTextureUnitImpl glesTextureUnit = new GlesTextureUnitImpl();
    return glesTextureUnit;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlSampler1D createGlSampler1D() {
    GlSampler1DImpl glSampler1D = new GlSampler1DImpl();
    return glSampler1D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlSampler2D createGlSampler2D() {
    GlSampler2DImpl glSampler2D = new GlSampler2DImpl();
    return glSampler2D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlSampler3D createGlSampler3D() {
    GlSampler3DImpl glSampler3D = new GlSampler3DImpl();
    return glSampler3D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlSamplerCUBE createGlSamplerCUBE() {
    GlSamplerCUBEImpl glSamplerCUBE = new GlSamplerCUBEImpl();
    return glSamplerCUBE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlSamplerDEPTH createGlSamplerDEPTH() {
    GlSamplerDEPTHImpl glSamplerDEPTH = new GlSamplerDEPTHImpl();
    return glSamplerDEPTH;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlSamplerRECT createGlSamplerRECT() {
    GlSamplerRECTImpl glSamplerRECT = new GlSamplerRECTImpl();
    return glSamplerRECT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlslNewarrayType createGlslNewarrayType() {
    GlslNewarrayTypeImpl glslNewarrayType = new GlslNewarrayTypeImpl();
    return glslNewarrayType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlslNewparam createGlslNewparam() {
    GlslNewparamImpl glslNewparam = new GlslNewparamImpl();
    return glslNewparam;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlslSetarrayType createGlslSetarrayType() {
    GlslSetarrayTypeImpl glslSetarrayType = new GlslSetarrayTypeImpl();
    return glslSetarrayType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlslSetparam createGlslSetparam() {
    GlslSetparamImpl glslSetparam = new GlslSetparamImpl();
    return glslSetparam;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlslSetparamSimple createGlslSetparamSimple() {
    GlslSetparamSimpleImpl glslSetparamSimple = new GlslSetparamSimpleImpl();
    return glslSetparamSimple;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlslSurfaceType createGlslSurfaceType() {
    GlslSurfaceTypeImpl glslSurfaceType = new GlslSurfaceTypeImpl();
    return glslSurfaceType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HollowType createHollowType() {
    HollowTypeImpl hollowType = new HollowTypeImpl();
    return hollowType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HollowType1 createHollowType1() {
    HollowType1Impl hollowType1 = new HollowType1Impl();
    return hollowType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public IDREFArrayType createIDREFArrayType() {
    IDREFArrayTypeImpl idrefArrayType = new IDREFArrayTypeImpl();
    return idrefArrayType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ImagerType createImagerType() {
    ImagerTypeImpl imagerType = new ImagerTypeImpl();
    return imagerType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ImageType createImageType() {
    ImageTypeImpl imageType = new ImageTypeImpl();
    return imageType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InputGlobal createInputGlobal() {
    InputGlobalImpl inputGlobal = new InputGlobalImpl();
    return inputGlobal;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InputLocal createInputLocal() {
    InputLocalImpl inputLocal = new InputLocalImpl();
    return inputLocal;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InputLocalOffset createInputLocalOffset() {
    InputLocalOffsetImpl inputLocalOffset = new InputLocalOffsetImpl();
    return inputLocalOffset;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceControllerType createInstanceControllerType() {
    InstanceControllerTypeImpl instanceControllerType = new InstanceControllerTypeImpl();
    return instanceControllerType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceEffectType createInstanceEffectType() {
    InstanceEffectTypeImpl instanceEffectType = new InstanceEffectTypeImpl();
    return instanceEffectType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceGeometryType createInstanceGeometryType() {
    InstanceGeometryTypeImpl instanceGeometryType = new InstanceGeometryTypeImpl();
    return instanceGeometryType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceMaterialType createInstanceMaterialType() {
    InstanceMaterialTypeImpl instanceMaterialType = new InstanceMaterialTypeImpl();
    return instanceMaterialType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstancePhysicsModelType createInstancePhysicsModelType() {
    InstancePhysicsModelTypeImpl instancePhysicsModelType = new InstancePhysicsModelTypeImpl();
    return instancePhysicsModelType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceRigidBodyType createInstanceRigidBodyType() {
    InstanceRigidBodyTypeImpl instanceRigidBodyType = new InstanceRigidBodyTypeImpl();
    return instanceRigidBodyType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceRigidConstraintType createInstanceRigidConstraintType() {
    InstanceRigidConstraintTypeImpl instanceRigidConstraintType = new InstanceRigidConstraintTypeImpl();
    return instanceRigidConstraintType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceWithExtra createInstanceWithExtra() {
    InstanceWithExtraImpl instanceWithExtra = new InstanceWithExtraImpl();
    return instanceWithExtra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public IntArrayType createIntArrayType() {
    IntArrayTypeImpl intArrayType = new IntArrayTypeImpl();
    return intArrayType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InterpenetrateType createInterpenetrateType() {
    InterpenetrateTypeImpl interpenetrateType = new InterpenetrateTypeImpl();
    return interpenetrateType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public JointsType createJointsType() {
    JointsTypeImpl jointsType = new JointsTypeImpl();
    return jointsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LambertType createLambertType() {
    LambertTypeImpl lambertType = new LambertTypeImpl();
    return lambertType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryAnimationClipsType createLibraryAnimationClipsType() {
    LibraryAnimationClipsTypeImpl libraryAnimationClipsType = new LibraryAnimationClipsTypeImpl();
    return libraryAnimationClipsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryAnimationsType createLibraryAnimationsType() {
    LibraryAnimationsTypeImpl libraryAnimationsType = new LibraryAnimationsTypeImpl();
    return libraryAnimationsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryCamerasType createLibraryCamerasType() {
    LibraryCamerasTypeImpl libraryCamerasType = new LibraryCamerasTypeImpl();
    return libraryCamerasType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryControllersType createLibraryControllersType() {
    LibraryControllersTypeImpl libraryControllersType = new LibraryControllersTypeImpl();
    return libraryControllersType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryEffectsType createLibraryEffectsType() {
    LibraryEffectsTypeImpl libraryEffectsType = new LibraryEffectsTypeImpl();
    return libraryEffectsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryForceFieldsType createLibraryForceFieldsType() {
    LibraryForceFieldsTypeImpl libraryForceFieldsType = new LibraryForceFieldsTypeImpl();
    return libraryForceFieldsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryGeometriesType createLibraryGeometriesType() {
    LibraryGeometriesTypeImpl libraryGeometriesType = new LibraryGeometriesTypeImpl();
    return libraryGeometriesType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryImagesType createLibraryImagesType() {
    LibraryImagesTypeImpl libraryImagesType = new LibraryImagesTypeImpl();
    return libraryImagesType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryLightsType createLibraryLightsType() {
    LibraryLightsTypeImpl libraryLightsType = new LibraryLightsTypeImpl();
    return libraryLightsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryMaterialsType createLibraryMaterialsType() {
    LibraryMaterialsTypeImpl libraryMaterialsType = new LibraryMaterialsTypeImpl();
    return libraryMaterialsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryNodesType createLibraryNodesType() {
    LibraryNodesTypeImpl libraryNodesType = new LibraryNodesTypeImpl();
    return libraryNodesType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryPhysicsMaterialsType createLibraryPhysicsMaterialsType() {
    LibraryPhysicsMaterialsTypeImpl libraryPhysicsMaterialsType = new LibraryPhysicsMaterialsTypeImpl();
    return libraryPhysicsMaterialsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryPhysicsModelsType createLibraryPhysicsModelsType() {
    LibraryPhysicsModelsTypeImpl libraryPhysicsModelsType = new LibraryPhysicsModelsTypeImpl();
    return libraryPhysicsModelsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryPhysicsScenesType createLibraryPhysicsScenesType() {
    LibraryPhysicsScenesTypeImpl libraryPhysicsScenesType = new LibraryPhysicsScenesTypeImpl();
    return libraryPhysicsScenesType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LibraryVisualScenesType createLibraryVisualScenesType() {
    LibraryVisualScenesTypeImpl libraryVisualScenesType = new LibraryVisualScenesTypeImpl();
    return libraryVisualScenesType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightAmbientType createLightAmbientType() {
    LightAmbientTypeImpl lightAmbientType = new LightAmbientTypeImpl();
    return lightAmbientType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightAmbientType1 createLightAmbientType1() {
    LightAmbientType1Impl lightAmbientType1 = new LightAmbientType1Impl();
    return lightAmbientType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightConstantAttenuationType createLightConstantAttenuationType() {
    LightConstantAttenuationTypeImpl lightConstantAttenuationType = new LightConstantAttenuationTypeImpl();
    return lightConstantAttenuationType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightConstantAttenuationType1 createLightConstantAttenuationType1() {
    LightConstantAttenuationType1Impl lightConstantAttenuationType1 = new LightConstantAttenuationType1Impl();
    return lightConstantAttenuationType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightDiffuseType createLightDiffuseType() {
    LightDiffuseTypeImpl lightDiffuseType = new LightDiffuseTypeImpl();
    return lightDiffuseType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightDiffuseType1 createLightDiffuseType1() {
    LightDiffuseType1Impl lightDiffuseType1 = new LightDiffuseType1Impl();
    return lightDiffuseType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightEnableType createLightEnableType() {
    LightEnableTypeImpl lightEnableType = new LightEnableTypeImpl();
    return lightEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightEnableType1 createLightEnableType1() {
    LightEnableType1Impl lightEnableType1 = new LightEnableType1Impl();
    return lightEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightingEnableType createLightingEnableType() {
    LightingEnableTypeImpl lightingEnableType = new LightingEnableTypeImpl();
    return lightingEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightingEnableType1 createLightingEnableType1() {
    LightingEnableType1Impl lightingEnableType1 = new LightingEnableType1Impl();
    return lightingEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightLinearAttenuationType createLightLinearAttenuationType() {
    LightLinearAttenuationTypeImpl lightLinearAttenuationType = new LightLinearAttenuationTypeImpl();
    return lightLinearAttenuationType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightLinearAttenutationType createLightLinearAttenutationType() {
    LightLinearAttenutationTypeImpl lightLinearAttenutationType = new LightLinearAttenutationTypeImpl();
    return lightLinearAttenutationType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightModelAmbientType createLightModelAmbientType() {
    LightModelAmbientTypeImpl lightModelAmbientType = new LightModelAmbientTypeImpl();
    return lightModelAmbientType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightModelAmbientType1 createLightModelAmbientType1() {
    LightModelAmbientType1Impl lightModelAmbientType1 = new LightModelAmbientType1Impl();
    return lightModelAmbientType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightModelColorControlType createLightModelColorControlType() {
    LightModelColorControlTypeImpl lightModelColorControlType = new LightModelColorControlTypeImpl();
    return lightModelColorControlType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightModelLocalViewerEnableType createLightModelLocalViewerEnableType() {
    LightModelLocalViewerEnableTypeImpl lightModelLocalViewerEnableType = new LightModelLocalViewerEnableTypeImpl();
    return lightModelLocalViewerEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightModelTwoSideEnableType createLightModelTwoSideEnableType() {
    LightModelTwoSideEnableTypeImpl lightModelTwoSideEnableType = new LightModelTwoSideEnableTypeImpl();
    return lightModelTwoSideEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightModelTwoSideEnableType1 createLightModelTwoSideEnableType1() {
    LightModelTwoSideEnableType1Impl lightModelTwoSideEnableType1 = new LightModelTwoSideEnableType1Impl();
    return lightModelTwoSideEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightPositionType createLightPositionType() {
    LightPositionTypeImpl lightPositionType = new LightPositionTypeImpl();
    return lightPositionType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightPositionType1 createLightPositionType1() {
    LightPositionType1Impl lightPositionType1 = new LightPositionType1Impl();
    return lightPositionType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightQuadraticAttenuationType createLightQuadraticAttenuationType() {
    LightQuadraticAttenuationTypeImpl lightQuadraticAttenuationType = new LightQuadraticAttenuationTypeImpl();
    return lightQuadraticAttenuationType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightQuadraticAttenuationType1 createLightQuadraticAttenuationType1() {
    LightQuadraticAttenuationType1Impl lightQuadraticAttenuationType1 = new LightQuadraticAttenuationType1Impl();
    return lightQuadraticAttenuationType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightSpecularType createLightSpecularType() {
    LightSpecularTypeImpl lightSpecularType = new LightSpecularTypeImpl();
    return lightSpecularType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightSpecularType1 createLightSpecularType1() {
    LightSpecularType1Impl lightSpecularType1 = new LightSpecularType1Impl();
    return lightSpecularType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightSpotCutoffType createLightSpotCutoffType() {
    LightSpotCutoffTypeImpl lightSpotCutoffType = new LightSpotCutoffTypeImpl();
    return lightSpotCutoffType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightSpotCutoffType1 createLightSpotCutoffType1() {
    LightSpotCutoffType1Impl lightSpotCutoffType1 = new LightSpotCutoffType1Impl();
    return lightSpotCutoffType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightSpotDirectionType createLightSpotDirectionType() {
    LightSpotDirectionTypeImpl lightSpotDirectionType = new LightSpotDirectionTypeImpl();
    return lightSpotDirectionType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightSpotDirectionType1 createLightSpotDirectionType1() {
    LightSpotDirectionType1Impl lightSpotDirectionType1 = new LightSpotDirectionType1Impl();
    return lightSpotDirectionType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightSpotExponentType createLightSpotExponentType() {
    LightSpotExponentTypeImpl lightSpotExponentType = new LightSpotExponentTypeImpl();
    return lightSpotExponentType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightSpotExponentType1 createLightSpotExponentType1() {
    LightSpotExponentType1Impl lightSpotExponentType1 = new LightSpotExponentType1Impl();
    return lightSpotExponentType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LightType createLightType() {
    LightTypeImpl lightType = new LightTypeImpl();
    return lightType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LimitsType createLimitsType() {
    LimitsTypeImpl limitsType = new LimitsTypeImpl();
    return limitsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LinearType createLinearType() {
    LinearTypeImpl linearType = new LinearTypeImpl();
    return linearType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LinearType1 createLinearType1() {
    LinearType1Impl linearType1 = new LinearType1Impl();
    return linearType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LineSmoothEnableType createLineSmoothEnableType() {
    LineSmoothEnableTypeImpl lineSmoothEnableType = new LineSmoothEnableTypeImpl();
    return lineSmoothEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LineSmoothEnableType1 createLineSmoothEnableType1() {
    LineSmoothEnableType1Impl lineSmoothEnableType1 = new LineSmoothEnableType1Impl();
    return lineSmoothEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LineStippleEnableType createLineStippleEnableType() {
    LineStippleEnableTypeImpl lineStippleEnableType = new LineStippleEnableTypeImpl();
    return lineStippleEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LineStippleType createLineStippleType() {
    LineStippleTypeImpl lineStippleType = new LineStippleTypeImpl();
    return lineStippleType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LinestripsType createLinestripsType() {
    LinestripsTypeImpl linestripsType = new LinestripsTypeImpl();
    return linestripsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LinesType createLinesType() {
    LinesTypeImpl linesType = new LinesTypeImpl();
    return linesType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LineWidthType createLineWidthType() {
    LineWidthTypeImpl lineWidthType = new LineWidthTypeImpl();
    return lineWidthType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LineWidthType1 createLineWidthType1() {
    LineWidthType1Impl lineWidthType1 = new LineWidthType1Impl();
    return lineWidthType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LogicOpEnableType createLogicOpEnableType() {
    LogicOpEnableTypeImpl logicOpEnableType = new LogicOpEnableTypeImpl();
    return logicOpEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LogicOpType createLogicOpType() {
    LogicOpTypeImpl logicOpType = new LogicOpTypeImpl();
    return logicOpType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LogicOpType1 createLogicOpType1() {
    LogicOpType1Impl logicOpType1 = new LogicOpType1Impl();
    return logicOpType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LookatType createLookatType() {
    LookatTypeImpl lookatType = new LookatTypeImpl();
    return lookatType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaskType createMaskType() {
    MaskTypeImpl maskType = new MaskTypeImpl();
    return maskType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaskType1 createMaskType1() {
    MaskType1Impl maskType1 = new MaskType1Impl();
    return maskType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaskType2 createMaskType2() {
    MaskType2Impl maskType2 = new MaskType2Impl();
    return maskType2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaskType3 createMaskType3() {
    MaskType3Impl maskType3 = new MaskType3Impl();
    return maskType3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MassFrameType createMassFrameType() {
    MassFrameTypeImpl massFrameType = new MassFrameTypeImpl();
    return massFrameType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MassFrameType1 createMassFrameType1() {
    MassFrameType1Impl massFrameType1 = new MassFrameType1Impl();
    return massFrameType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaterialAmbientType createMaterialAmbientType() {
    MaterialAmbientTypeImpl materialAmbientType = new MaterialAmbientTypeImpl();
    return materialAmbientType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaterialAmbientType1 createMaterialAmbientType1() {
    MaterialAmbientType1Impl materialAmbientType1 = new MaterialAmbientType1Impl();
    return materialAmbientType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaterialDiffuseType createMaterialDiffuseType() {
    MaterialDiffuseTypeImpl materialDiffuseType = new MaterialDiffuseTypeImpl();
    return materialDiffuseType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaterialDiffuseType1 createMaterialDiffuseType1() {
    MaterialDiffuseType1Impl materialDiffuseType1 = new MaterialDiffuseType1Impl();
    return materialDiffuseType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaterialEmissionType createMaterialEmissionType() {
    MaterialEmissionTypeImpl materialEmissionType = new MaterialEmissionTypeImpl();
    return materialEmissionType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaterialEmissionType1 createMaterialEmissionType1() {
    MaterialEmissionType1Impl materialEmissionType1 = new MaterialEmissionType1Impl();
    return materialEmissionType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaterialShininessType createMaterialShininessType() {
    MaterialShininessTypeImpl materialShininessType = new MaterialShininessTypeImpl();
    return materialShininessType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaterialShininessType1 createMaterialShininessType1() {
    MaterialShininessType1Impl materialShininessType1 = new MaterialShininessType1Impl();
    return materialShininessType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaterialSpecularType createMaterialSpecularType() {
    MaterialSpecularTypeImpl materialSpecularType = new MaterialSpecularTypeImpl();
    return materialSpecularType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaterialSpecularType1 createMaterialSpecularType1() {
    MaterialSpecularType1Impl materialSpecularType1 = new MaterialSpecularType1Impl();
    return materialSpecularType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaterialType createMaterialType() {
    MaterialTypeImpl materialType = new MaterialTypeImpl();
    return materialType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MatrixType createMatrixType() {
    MatrixTypeImpl matrixType = new MatrixTypeImpl();
    return matrixType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MeshType createMeshType() {
    MeshTypeImpl meshType = new MeshTypeImpl();
    return meshType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ModelViewMatrixType createModelViewMatrixType() {
    ModelViewMatrixTypeImpl modelViewMatrixType = new ModelViewMatrixTypeImpl();
    return modelViewMatrixType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ModelViewMatrixType1 createModelViewMatrixType1() {
    ModelViewMatrixType1Impl modelViewMatrixType1 = new ModelViewMatrixType1Impl();
    return modelViewMatrixType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ModeType createModeType() {
    ModeTypeImpl modeType = new ModeTypeImpl();
    return modeType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ModeType1 createModeType1() {
    ModeType1Impl modeType1 = new ModeType1Impl();
    return modeType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MorphType createMorphType() {
    MorphTypeImpl morphType = new MorphTypeImpl();
    return morphType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MultisampleEnableType createMultisampleEnableType() {
    MultisampleEnableTypeImpl multisampleEnableType = new MultisampleEnableTypeImpl();
    return multisampleEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MultisampleEnableType1 createMultisampleEnableType1() {
    MultisampleEnableType1Impl multisampleEnableType1 = new MultisampleEnableType1Impl();
    return multisampleEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NameArrayType createNameArrayType() {
    NameArrayTypeImpl nameArrayType = new NameArrayTypeImpl();
    return nameArrayType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NameType createNameType() {
    NameTypeImpl nameType = new NameTypeImpl();
    return nameType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NameType1 createNameType1() {
    NameType1Impl nameType1 = new NameType1Impl();
    return nameType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NameType2 createNameType2() {
    NameType2Impl nameType2 = new NameType2Impl();
    return nameType2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NameType3 createNameType3() {
    NameType3Impl nameType3 = new NameType3Impl();
    return nameType3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NodeType1 createNodeType1() {
    NodeType1Impl nodeType1 = new NodeType1Impl();
    return nodeType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NormalizeEnableType createNormalizeEnableType() {
    NormalizeEnableTypeImpl normalizeEnableType = new NormalizeEnableTypeImpl();
    return normalizeEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NormalizeEnableType1 createNormalizeEnableType1() {
    NormalizeEnableType1Impl normalizeEnableType1 = new NormalizeEnableType1Impl();
    return normalizeEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public OpticsType createOpticsType() {
    OpticsTypeImpl opticsType = new OpticsTypeImpl();
    return opticsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public OrthographicType createOrthographicType() {
    OrthographicTypeImpl orthographicType = new OrthographicTypeImpl();
    return orthographicType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ParamType createParamType() {
    ParamTypeImpl paramType = new ParamTypeImpl();
    return paramType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ParamType1 createParamType1() {
    ParamType1Impl paramType1 = new ParamType1Impl();
    return paramType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ParamType2 createParamType2() {
    ParamType2Impl paramType2 = new ParamType2Impl();
    return paramType2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ParamType3 createParamType3() {
    ParamType3Impl paramType3 = new ParamType3Impl();
    return paramType3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ParamType4 createParamType4() {
    ParamType4Impl paramType4 = new ParamType4Impl();
    return paramType4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PassType createPassType() {
    PassTypeImpl passType = new PassTypeImpl();
    return passType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PassType1 createPassType1() {
    PassType1Impl passType1 = new PassType1Impl();
    return passType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PassType2 createPassType2() {
    PassType2Impl passType2 = new PassType2Impl();
    return passType2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PerspectiveType createPerspectiveType() {
    PerspectiveTypeImpl perspectiveType = new PerspectiveTypeImpl();
    return perspectiveType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhongType createPhongType() {
    PhongTypeImpl phongType = new PhongTypeImpl();
    return phongType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhType createPhType() {
    PhTypeImpl phType = new PhTypeImpl();
    return phType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhysicsMaterialType createPhysicsMaterialType() {
    PhysicsMaterialTypeImpl physicsMaterialType = new PhysicsMaterialTypeImpl();
    return physicsMaterialType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhysicsModelType createPhysicsModelType() {
    PhysicsModelTypeImpl physicsModelType = new PhysicsModelTypeImpl();
    return physicsModelType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhysicsSceneType createPhysicsSceneType() {
    PhysicsSceneTypeImpl physicsSceneType = new PhysicsSceneTypeImpl();
    return physicsSceneType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PlaneType createPlaneType() {
    PlaneTypeImpl planeType = new PlaneTypeImpl();
    return planeType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PointDistanceAttenuationType createPointDistanceAttenuationType() {
    PointDistanceAttenuationTypeImpl pointDistanceAttenuationType = new PointDistanceAttenuationTypeImpl();
    return pointDistanceAttenuationType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PointDistanceAttenuationType1 createPointDistanceAttenuationType1() {
    PointDistanceAttenuationType1Impl pointDistanceAttenuationType1 = new PointDistanceAttenuationType1Impl();
    return pointDistanceAttenuationType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PointFadeThresholdSizeType createPointFadeThresholdSizeType() {
    PointFadeThresholdSizeTypeImpl pointFadeThresholdSizeType = new PointFadeThresholdSizeTypeImpl();
    return pointFadeThresholdSizeType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PointFadeThresholdSizeType1 createPointFadeThresholdSizeType1() {
    PointFadeThresholdSizeType1Impl pointFadeThresholdSizeType1 = new PointFadeThresholdSizeType1Impl();
    return pointFadeThresholdSizeType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PointSizeMaxType createPointSizeMaxType() {
    PointSizeMaxTypeImpl pointSizeMaxType = new PointSizeMaxTypeImpl();
    return pointSizeMaxType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PointSizeMaxType1 createPointSizeMaxType1() {
    PointSizeMaxType1Impl pointSizeMaxType1 = new PointSizeMaxType1Impl();
    return pointSizeMaxType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PointSizeMinType createPointSizeMinType() {
    PointSizeMinTypeImpl pointSizeMinType = new PointSizeMinTypeImpl();
    return pointSizeMinType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PointSizeMinType1 createPointSizeMinType1() {
    PointSizeMinType1Impl pointSizeMinType1 = new PointSizeMinType1Impl();
    return pointSizeMinType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PointSizeType createPointSizeType() {
    PointSizeTypeImpl pointSizeType = new PointSizeTypeImpl();
    return pointSizeType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PointSizeType1 createPointSizeType1() {
    PointSizeType1Impl pointSizeType1 = new PointSizeType1Impl();
    return pointSizeType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PointSmoothEnableType createPointSmoothEnableType() {
    PointSmoothEnableTypeImpl pointSmoothEnableType = new PointSmoothEnableTypeImpl();
    return pointSmoothEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PointSmoothEnableType1 createPointSmoothEnableType1() {
    PointSmoothEnableType1Impl pointSmoothEnableType1 = new PointSmoothEnableType1Impl();
    return pointSmoothEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PointType createPointType() {
    PointTypeImpl pointType = new PointTypeImpl();
    return pointType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PolygonModeType createPolygonModeType() {
    PolygonModeTypeImpl polygonModeType = new PolygonModeTypeImpl();
    return polygonModeType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PolygonOffsetFillEnableType createPolygonOffsetFillEnableType() {
    PolygonOffsetFillEnableTypeImpl polygonOffsetFillEnableType = new PolygonOffsetFillEnableTypeImpl();
    return polygonOffsetFillEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PolygonOffsetFillEnableType1 createPolygonOffsetFillEnableType1() {
    PolygonOffsetFillEnableType1Impl polygonOffsetFillEnableType1 = new PolygonOffsetFillEnableType1Impl();
    return polygonOffsetFillEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PolygonOffsetLineEnableType createPolygonOffsetLineEnableType() {
    PolygonOffsetLineEnableTypeImpl polygonOffsetLineEnableType = new PolygonOffsetLineEnableTypeImpl();
    return polygonOffsetLineEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PolygonOffsetPointEnableType createPolygonOffsetPointEnableType() {
    PolygonOffsetPointEnableTypeImpl polygonOffsetPointEnableType = new PolygonOffsetPointEnableTypeImpl();
    return polygonOffsetPointEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PolygonOffsetType createPolygonOffsetType() {
    PolygonOffsetTypeImpl polygonOffsetType = new PolygonOffsetTypeImpl();
    return polygonOffsetType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PolygonOffsetType1 createPolygonOffsetType1() {
    PolygonOffsetType1Impl polygonOffsetType1 = new PolygonOffsetType1Impl();
    return polygonOffsetType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PolygonSmoothEnableType createPolygonSmoothEnableType() {
    PolygonSmoothEnableTypeImpl polygonSmoothEnableType = new PolygonSmoothEnableTypeImpl();
    return polygonSmoothEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PolygonStippleEnableType createPolygonStippleEnableType() {
    PolygonStippleEnableTypeImpl polygonStippleEnableType = new PolygonStippleEnableTypeImpl();
    return polygonStippleEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PolygonsType createPolygonsType() {
    PolygonsTypeImpl polygonsType = new PolygonsTypeImpl();
    return polygonsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PolylistType createPolylistType() {
    PolylistTypeImpl polylistType = new PolylistTypeImpl();
    return polylistType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PrimaryType createPrimaryType() {
    PrimaryTypeImpl primaryType = new PrimaryTypeImpl();
    return primaryType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PrimaryType1 createPrimaryType1() {
    PrimaryType1Impl primaryType1 = new PrimaryType1Impl();
    return primaryType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ProfileCGType createProfileCGType() {
    ProfileCGTypeImpl profileCGType = new ProfileCGTypeImpl();
    return profileCGType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ProfileCOMMONType createProfileCOMMONType() {
    ProfileCOMMONTypeImpl profileCOMMONType = new ProfileCOMMONTypeImpl();
    return profileCOMMONType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ProfileGLESType createProfileGLESType() {
    ProfileGLESTypeImpl profileGLESType = new ProfileGLESTypeImpl();
    return profileGLESType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ProfileGLSLType createProfileGLSLType() {
    ProfileGLSLTypeImpl profileGLSLType = new ProfileGLSLTypeImpl();
    return profileGLSLType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ProjectionMatrixType createProjectionMatrixType() {
    ProjectionMatrixTypeImpl projectionMatrixType = new ProjectionMatrixTypeImpl();
    return projectionMatrixType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ProjectionMatrixType1 createProjectionMatrixType1() {
    ProjectionMatrixType1Impl projectionMatrixType1 = new ProjectionMatrixType1Impl();
    return projectionMatrixType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RefAttachmentType createRefAttachmentType() {
    RefAttachmentTypeImpl refAttachmentType = new RefAttachmentTypeImpl();
    return refAttachmentType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RefType createRefType() {
    RefTypeImpl refType = new RefTypeImpl();
    return refType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RefType1 createRefType1() {
    RefType1Impl refType1 = new RefType1Impl();
    return refType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RefType2 createRefType2() {
    RefType2Impl refType2 = new RefType2Impl();
    return refType2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RenderType createRenderType() {
    RenderTypeImpl renderType = new RenderTypeImpl();
    return renderType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RescaleNormalEnableType createRescaleNormalEnableType() {
    RescaleNormalEnableTypeImpl rescaleNormalEnableType = new RescaleNormalEnableTypeImpl();
    return rescaleNormalEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RescaleNormalEnableType1 createRescaleNormalEnableType1() {
    RescaleNormalEnableType1Impl rescaleNormalEnableType1 = new RescaleNormalEnableType1Impl();
    return rescaleNormalEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RgbType createRgbType() {
    RgbTypeImpl rgbType = new RgbTypeImpl();
    return rgbType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RigidBodyType createRigidBodyType() {
    RigidBodyTypeImpl rigidBodyType = new RigidBodyTypeImpl();
    return rigidBodyType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RigidConstraintType createRigidConstraintType() {
    RigidConstraintTypeImpl rigidConstraintType = new RigidConstraintTypeImpl();
    return rigidConstraintType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RotateType createRotateType() {
    RotateTypeImpl rotateType = new RotateTypeImpl();
    return rotateType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SampleAlphaToCoverageEnableType createSampleAlphaToCoverageEnableType() {
    SampleAlphaToCoverageEnableTypeImpl sampleAlphaToCoverageEnableType = new SampleAlphaToCoverageEnableTypeImpl();
    return sampleAlphaToCoverageEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SampleAlphaToCoverageEnableType1 createSampleAlphaToCoverageEnableType1() {
    SampleAlphaToCoverageEnableType1Impl sampleAlphaToCoverageEnableType1 = new SampleAlphaToCoverageEnableType1Impl();
    return sampleAlphaToCoverageEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SampleAlphaToOneEnableType createSampleAlphaToOneEnableType() {
    SampleAlphaToOneEnableTypeImpl sampleAlphaToOneEnableType = new SampleAlphaToOneEnableTypeImpl();
    return sampleAlphaToOneEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SampleAlphaToOneEnableType1 createSampleAlphaToOneEnableType1() {
    SampleAlphaToOneEnableType1Impl sampleAlphaToOneEnableType1 = new SampleAlphaToOneEnableType1Impl();
    return sampleAlphaToOneEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SampleCoverageEnableType createSampleCoverageEnableType() {
    SampleCoverageEnableTypeImpl sampleCoverageEnableType = new SampleCoverageEnableTypeImpl();
    return sampleCoverageEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SampleCoverageEnableType1 createSampleCoverageEnableType1() {
    SampleCoverageEnableType1Impl sampleCoverageEnableType1 = new SampleCoverageEnableType1Impl();
    return sampleCoverageEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SamplerType createSamplerType() {
    SamplerTypeImpl samplerType = new SamplerTypeImpl();
    return samplerType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SceneType createSceneType() {
    SceneTypeImpl sceneType = new SceneTypeImpl();
    return sceneType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ScissorTestEnableType createScissorTestEnableType() {
    ScissorTestEnableTypeImpl scissorTestEnableType = new ScissorTestEnableTypeImpl();
    return scissorTestEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ScissorTestEnableType1 createScissorTestEnableType1() {
    ScissorTestEnableType1Impl scissorTestEnableType1 = new ScissorTestEnableType1Impl();
    return scissorTestEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ScissorType createScissorType() {
    ScissorTypeImpl scissorType = new ScissorTypeImpl();
    return scissorType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ScissorType1 createScissorType1() {
    ScissorType1Impl scissorType1 = new ScissorType1Impl();
    return scissorType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SetparamType createSetparamType() {
    SetparamTypeImpl setparamType = new SetparamTypeImpl();
    return setparamType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SetparamType1 createSetparamType1() {
    SetparamType1Impl setparamType1 = new SetparamType1Impl();
    return setparamType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ShadeModelType createShadeModelType() {
    ShadeModelTypeImpl shadeModelType = new ShadeModelTypeImpl();
    return shadeModelType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ShadeModelType1 createShadeModelType1() {
    ShadeModelType1Impl shadeModelType1 = new ShadeModelType1Impl();
    return shadeModelType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ShaderType createShaderType() {
    ShaderTypeImpl shaderType = new ShaderTypeImpl();
    return shaderType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ShaderType1 createShaderType1() {
    ShaderType1Impl shaderType1 = new ShaderType1Impl();
    return shaderType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ShapeType createShapeType() {
    ShapeTypeImpl shapeType = new ShapeTypeImpl();
    return shapeType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ShapeType1 createShapeType1() {
    ShapeType1Impl shapeType1 = new ShapeType1Impl();
    return shapeType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SkewType createSkewType() {
    SkewTypeImpl skewType = new SkewTypeImpl();
    return skewType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SkinType createSkinType() {
    SkinTypeImpl skinType = new SkinTypeImpl();
    return skinType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SourceType createSourceType() {
    SourceTypeImpl sourceType = new SourceTypeImpl();
    return sourceType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SphereType createSphereType() {
    SphereTypeImpl sphereType = new SphereTypeImpl();
    return sphereType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SplineType createSplineType() {
    SplineTypeImpl splineType = new SplineTypeImpl();
    return splineType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SpotType createSpotType() {
    SpotTypeImpl spotType = new SpotTypeImpl();
    return spotType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SpringType1 createSpringType1() {
    SpringType1Impl springType1 = new SpringType1Impl();
    return springType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SrcAlphaType createSrcAlphaType() {
    SrcAlphaTypeImpl srcAlphaType = new SrcAlphaTypeImpl();
    return srcAlphaType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SrcRgbType createSrcRgbType() {
    SrcRgbTypeImpl srcRgbType = new SrcRgbTypeImpl();
    return srcRgbType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SrcType createSrcType() {
    SrcTypeImpl srcType = new SrcTypeImpl();
    return srcType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SrcType1 createSrcType1() {
    SrcType1Impl srcType1 = new SrcType1Impl();
    return srcType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StencilFuncSeparateType createStencilFuncSeparateType() {
    StencilFuncSeparateTypeImpl stencilFuncSeparateType = new StencilFuncSeparateTypeImpl();
    return stencilFuncSeparateType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StencilFuncType createStencilFuncType() {
    StencilFuncTypeImpl stencilFuncType = new StencilFuncTypeImpl();
    return stencilFuncType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StencilFuncType1 createStencilFuncType1() {
    StencilFuncType1Impl stencilFuncType1 = new StencilFuncType1Impl();
    return stencilFuncType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StencilMaskSeparateType createStencilMaskSeparateType() {
    StencilMaskSeparateTypeImpl stencilMaskSeparateType = new StencilMaskSeparateTypeImpl();
    return stencilMaskSeparateType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StencilMaskType createStencilMaskType() {
    StencilMaskTypeImpl stencilMaskType = new StencilMaskTypeImpl();
    return stencilMaskType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StencilMaskType1 createStencilMaskType1() {
    StencilMaskType1Impl stencilMaskType1 = new StencilMaskType1Impl();
    return stencilMaskType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StencilOpSeparateType createStencilOpSeparateType() {
    StencilOpSeparateTypeImpl stencilOpSeparateType = new StencilOpSeparateTypeImpl();
    return stencilOpSeparateType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StencilOpType createStencilOpType() {
    StencilOpTypeImpl stencilOpType = new StencilOpTypeImpl();
    return stencilOpType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StencilOpType1 createStencilOpType1() {
    StencilOpType1Impl stencilOpType1 = new StencilOpType1Impl();
    return stencilOpType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StencilTestEnableType createStencilTestEnableType() {
    StencilTestEnableTypeImpl stencilTestEnableType = new StencilTestEnableTypeImpl();
    return stencilTestEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StencilTestEnableType1 createStencilTestEnableType1() {
    StencilTestEnableType1Impl stencilTestEnableType1 = new StencilTestEnableType1Impl();
    return stencilTestEnableType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SwingConeAndTwistType createSwingConeAndTwistType() {
    SwingConeAndTwistTypeImpl swingConeAndTwistType = new SwingConeAndTwistTypeImpl();
    return swingConeAndTwistType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TaperedCapsuleType createTaperedCapsuleType() {
    TaperedCapsuleTypeImpl taperedCapsuleType = new TaperedCapsuleTypeImpl();
    return taperedCapsuleType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TaperedCylinderType createTaperedCylinderType() {
    TaperedCylinderTypeImpl taperedCylinderType = new TaperedCylinderTypeImpl();
    return taperedCylinderType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat createTargetableFloat() {
    TargetableFloatImpl targetableFloat = new TargetableFloatImpl();
    return targetableFloat;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat3 createTargetableFloat3() {
    TargetableFloat3Impl targetableFloat3 = new TargetableFloat3Impl();
    return targetableFloat3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetsType createTargetsType() {
    TargetsTypeImpl targetsType = new TargetsTypeImpl();
    return targetsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueCommonType createTechniqueCommonType() {
    TechniqueCommonTypeImpl techniqueCommonType = new TechniqueCommonTypeImpl();
    return techniqueCommonType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueCommonType1 createTechniqueCommonType1() {
    TechniqueCommonType1Impl techniqueCommonType1 = new TechniqueCommonType1Impl();
    return techniqueCommonType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueCommonType2 createTechniqueCommonType2() {
    TechniqueCommonType2Impl techniqueCommonType2 = new TechniqueCommonType2Impl();
    return techniqueCommonType2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueCommonType3 createTechniqueCommonType3() {
    TechniqueCommonType3Impl techniqueCommonType3 = new TechniqueCommonType3Impl();
    return techniqueCommonType3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueCommonType4 createTechniqueCommonType4() {
    TechniqueCommonType4Impl techniqueCommonType4 = new TechniqueCommonType4Impl();
    return techniqueCommonType4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueCommonType5 createTechniqueCommonType5() {
    TechniqueCommonType5Impl techniqueCommonType5 = new TechniqueCommonType5Impl();
    return techniqueCommonType5;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueCommonType6 createTechniqueCommonType6() {
    TechniqueCommonType6Impl techniqueCommonType6 = new TechniqueCommonType6Impl();
    return techniqueCommonType6;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueCommonType7 createTechniqueCommonType7() {
    TechniqueCommonType7Impl techniqueCommonType7 = new TechniqueCommonType7Impl();
    return techniqueCommonType7;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueCommonType8 createTechniqueCommonType8() {
    TechniqueCommonType8Impl techniqueCommonType8 = new TechniqueCommonType8Impl();
    return techniqueCommonType8;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueHintType createTechniqueHintType() {
    TechniqueHintTypeImpl techniqueHintType = new TechniqueHintTypeImpl();
    return techniqueHintType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueType createTechniqueType() {
    TechniqueTypeImpl techniqueType = new TechniqueTypeImpl();
    return techniqueType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueType1 createTechniqueType1() {
    TechniqueType1Impl techniqueType1 = new TechniqueType1Impl();
    return techniqueType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueType2 createTechniqueType2() {
    TechniqueType2Impl techniqueType2 = new TechniqueType2Impl();
    return techniqueType2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueType3 createTechniqueType3() {
    TechniqueType3Impl techniqueType3 = new TechniqueType3Impl();
    return techniqueType3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueType4 createTechniqueType4() {
    TechniqueType4Impl techniqueType4 = new TechniqueType4Impl();
    return techniqueType4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TexcoordType createTexcoordType() {
    TexcoordTypeImpl texcoordType = new TexcoordTypeImpl();
    return texcoordType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Texture1DEnableType createTexture1DEnableType() {
    Texture1DEnableTypeImpl texture1DEnableType = new Texture1DEnableTypeImpl();
    return texture1DEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Texture1DType createTexture1DType() {
    Texture1DTypeImpl texture1DType = new Texture1DTypeImpl();
    return texture1DType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Texture2DEnableType createTexture2DEnableType() {
    Texture2DEnableTypeImpl texture2DEnableType = new Texture2DEnableTypeImpl();
    return texture2DEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Texture2DType createTexture2DType() {
    Texture2DTypeImpl texture2DType = new Texture2DTypeImpl();
    return texture2DType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Texture3DEnableType createTexture3DEnableType() {
    Texture3DEnableTypeImpl texture3DEnableType = new Texture3DEnableTypeImpl();
    return texture3DEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Texture3DType createTexture3DType() {
    Texture3DTypeImpl texture3DType = new Texture3DTypeImpl();
    return texture3DType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TextureCUBEEnableType createTextureCUBEEnableType() {
    TextureCUBEEnableTypeImpl textureCUBEEnableType = new TextureCUBEEnableTypeImpl();
    return textureCUBEEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TextureCUBEType createTextureCUBEType() {
    TextureCUBETypeImpl textureCUBEType = new TextureCUBETypeImpl();
    return textureCUBEType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TextureDEPTHEnableType createTextureDEPTHEnableType() {
    TextureDEPTHEnableTypeImpl textureDEPTHEnableType = new TextureDEPTHEnableTypeImpl();
    return textureDEPTHEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TextureDEPTHType createTextureDEPTHType() {
    TextureDEPTHTypeImpl textureDEPTHType = new TextureDEPTHTypeImpl();
    return textureDEPTHType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TextureEnvColorType createTextureEnvColorType() {
    TextureEnvColorTypeImpl textureEnvColorType = new TextureEnvColorTypeImpl();
    return textureEnvColorType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TextureEnvModeType createTextureEnvModeType() {
    TextureEnvModeTypeImpl textureEnvModeType = new TextureEnvModeTypeImpl();
    return textureEnvModeType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TexturePipelineEnableType createTexturePipelineEnableType() {
    TexturePipelineEnableTypeImpl texturePipelineEnableType = new TexturePipelineEnableTypeImpl();
    return texturePipelineEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TexturePipelineType createTexturePipelineType() {
    TexturePipelineTypeImpl texturePipelineType = new TexturePipelineTypeImpl();
    return texturePipelineType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TextureRECTEnableType createTextureRECTEnableType() {
    TextureRECTEnableTypeImpl textureRECTEnableType = new TextureRECTEnableTypeImpl();
    return textureRECTEnableType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TextureRECTType createTextureRECTType() {
    TextureRECTTypeImpl textureRECTType = new TextureRECTTypeImpl();
    return textureRECTType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TextureType createTextureType() {
    TextureTypeImpl textureType = new TextureTypeImpl();
    return textureType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TrianglesType createTrianglesType() {
    TrianglesTypeImpl trianglesType = new TrianglesTypeImpl();
    return trianglesType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TrifansType createTrifansType() {
    TrifansTypeImpl trifansType = new TrifansTypeImpl();
    return trifansType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TristripsType createTristripsType() {
    TristripsTypeImpl tristripsType = new TristripsTypeImpl();
    return tristripsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public UnitType createUnitType() {
    UnitTypeImpl unitType = new UnitTypeImpl();
    return unitType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ValueType createValueType() {
    ValueTypeImpl valueType = new ValueTypeImpl();
    return valueType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ValueType1 createValueType1() {
    ValueType1Impl valueType1 = new ValueType1Impl();
    return valueType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public VertexWeightsType createVertexWeightsType() {
    VertexWeightsTypeImpl vertexWeightsType = new VertexWeightsTypeImpl();
    return vertexWeightsType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public VerticesType createVerticesType() {
    VerticesTypeImpl verticesType = new VerticesTypeImpl();
    return verticesType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public VisualSceneType createVisualSceneType() {
    VisualSceneTypeImpl visualSceneType = new VisualSceneTypeImpl();
    return visualSceneType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ZfailType createZfailType() {
    ZfailTypeImpl zfailType = new ZfailTypeImpl();
    return zfailType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ZfailType1 createZfailType1() {
    ZfailType1Impl zfailType1 = new ZfailType1Impl();
    return zfailType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ZfailType2 createZfailType2() {
    ZfailType2Impl zfailType2 = new ZfailType2Impl();
    return zfailType2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ZpassType createZpassType() {
    ZpassTypeImpl zpassType = new ZpassTypeImpl();
    return zpassType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ZpassType1 createZpassType1() {
    ZpassType1Impl zpassType1 = new ZpassType1Impl();
    return zpassType1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ZpassType2 createZpassType2() {
    ZpassType2Impl zpassType2 = new ZpassType2Impl();
    return zpassType2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgPipelineStage createCgPipelineStageFromString(EDataType eDataType, String initialValue) {
    CgPipelineStage result = CgPipelineStage.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgPipelineStageToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonProfileInput createCommonProfileInputFromString(EDataType eDataType, String initialValue) {
    CommonProfileInput result = CommonProfileInput.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCommonProfileInputToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonProfileParam createCommonProfileParamFromString(EDataType eDataType, String initialValue) {
    CommonProfileParam result = CommonProfileParam.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCommonProfileParamToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxModifierEnumCommon createFxModifierEnumCommonFromString(EDataType eDataType, String initialValue) {
    FxModifierEnumCommon result = FxModifierEnumCommon.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxModifierEnumCommonToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxOpaqueEnum createFxOpaqueEnumFromString(EDataType eDataType, String initialValue) {
    FxOpaqueEnum result = FxOpaqueEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxOpaqueEnumToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxPipelineStageCommon createFxPipelineStageCommonFromString(EDataType eDataType, String initialValue) {
    FxPipelineStageCommon result = FxPipelineStageCommon.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxPipelineStageCommonToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSamplerFilterCommon createFxSamplerFilterCommonFromString(EDataType eDataType, String initialValue) {
    FxSamplerFilterCommon result = FxSamplerFilterCommon.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSamplerFilterCommonToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSamplerWrapCommon createFxSamplerWrapCommonFromString(EDataType eDataType, String initialValue) {
    FxSamplerWrapCommon result = FxSamplerWrapCommon.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSamplerWrapCommonToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFaceEnum createFxSurfaceFaceEnumFromString(EDataType eDataType, String initialValue) {
    FxSurfaceFaceEnum result = FxSurfaceFaceEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSurfaceFaceEnumToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFormatHintChannelsEnum createFxSurfaceFormatHintChannelsEnumFromString(EDataType eDataType, String initialValue) {
    FxSurfaceFormatHintChannelsEnum result = FxSurfaceFormatHintChannelsEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSurfaceFormatHintChannelsEnumToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFormatHintOptionEnum createFxSurfaceFormatHintOptionEnumFromString(EDataType eDataType, String initialValue) {
    FxSurfaceFormatHintOptionEnum result = FxSurfaceFormatHintOptionEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSurfaceFormatHintOptionEnumToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFormatHintPrecisionEnum createFxSurfaceFormatHintPrecisionEnumFromString(EDataType eDataType, String initialValue) {
    FxSurfaceFormatHintPrecisionEnum result = FxSurfaceFormatHintPrecisionEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSurfaceFormatHintPrecisionEnumToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFormatHintRangeEnum createFxSurfaceFormatHintRangeEnumFromString(EDataType eDataType, String initialValue) {
    FxSurfaceFormatHintRangeEnum result = FxSurfaceFormatHintRangeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSurfaceFormatHintRangeEnumToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceTypeEnum createFxSurfaceTypeEnumFromString(EDataType eDataType, String initialValue) {
    FxSurfaceTypeEnum result = FxSurfaceTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSurfaceTypeEnumToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlBlendEquationType createGlBlendEquationTypeFromString(EDataType eDataType, String initialValue) {
    GlBlendEquationType result = GlBlendEquationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlBlendEquationTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlBlendType createGlBlendTypeFromString(EDataType eDataType, String initialValue) {
    GlBlendType result = GlBlendType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlBlendTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesSamplerWrap createGlesSamplerWrapFromString(EDataType eDataType, String initialValue) {
    GlesSamplerWrap result = GlesSamplerWrap.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesSamplerWrapToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesStencilOpType createGlesStencilOpTypeFromString(EDataType eDataType, String initialValue) {
    GlesStencilOpType result = GlesStencilOpType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesStencilOpTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerOperandAlphaEnums createGlesTexcombinerOperandAlphaEnumsFromString(EDataType eDataType, String initialValue) {
    GlesTexcombinerOperandAlphaEnums result = GlesTexcombinerOperandAlphaEnums.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesTexcombinerOperandAlphaEnumsToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerOperandRGBEnums createGlesTexcombinerOperandRGBEnumsFromString(EDataType eDataType, String initialValue) {
    GlesTexcombinerOperandRGBEnums result = GlesTexcombinerOperandRGBEnums.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesTexcombinerOperandRGBEnumsToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerOperatorAlphaEnums createGlesTexcombinerOperatorAlphaEnumsFromString(EDataType eDataType, String initialValue) {
    GlesTexcombinerOperatorAlphaEnums result = GlesTexcombinerOperatorAlphaEnums.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesTexcombinerOperatorAlphaEnumsToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerOperatorRGBEnums createGlesTexcombinerOperatorRGBEnumsFromString(EDataType eDataType, String initialValue) {
    GlesTexcombinerOperatorRGBEnums result = GlesTexcombinerOperatorRGBEnums.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesTexcombinerOperatorRGBEnumsToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerSourceEnums createGlesTexcombinerSourceEnumsFromString(EDataType eDataType, String initialValue) {
    GlesTexcombinerSourceEnums result = GlesTexcombinerSourceEnums.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesTexcombinerSourceEnumsToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexenvModeEnums createGlesTexenvModeEnumsFromString(EDataType eDataType, String initialValue) {
    GlesTexenvModeEnums result = GlesTexenvModeEnums.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesTexenvModeEnumsToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlFaceType createGlFaceTypeFromString(EDataType eDataType, String initialValue) {
    GlFaceType result = GlFaceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlFaceTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlFogCoordSrcType createGlFogCoordSrcTypeFromString(EDataType eDataType, String initialValue) {
    GlFogCoordSrcType result = GlFogCoordSrcType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlFogCoordSrcTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlFogType createGlFogTypeFromString(EDataType eDataType, String initialValue) {
    GlFogType result = GlFogType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlFogTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlFrontFaceType createGlFrontFaceTypeFromString(EDataType eDataType, String initialValue) {
    GlFrontFaceType result = GlFrontFaceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlFrontFaceTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlFuncType createGlFuncTypeFromString(EDataType eDataType, String initialValue) {
    GlFuncType result = GlFuncType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlFuncTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlLightModelColorControlType createGlLightModelColorControlTypeFromString(EDataType eDataType, String initialValue) {
    GlLightModelColorControlType result = GlLightModelColorControlType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlLightModelColorControlTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlLogicOpType createGlLogicOpTypeFromString(EDataType eDataType, String initialValue) {
    GlLogicOpType result = GlLogicOpType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlLogicOpTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlMaterialType createGlMaterialTypeFromString(EDataType eDataType, String initialValue) {
    GlMaterialType result = GlMaterialType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlMaterialTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlPolygonModeType createGlPolygonModeTypeFromString(EDataType eDataType, String initialValue) {
    GlPolygonModeType result = GlPolygonModeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlPolygonModeTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlShadeModelType createGlShadeModelTypeFromString(EDataType eDataType, String initialValue) {
    GlShadeModelType result = GlShadeModelType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlShadeModelTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlslPipelineStage createGlslPipelineStageFromString(EDataType eDataType, String initialValue) {
    GlslPipelineStage result = GlslPipelineStage.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslPipelineStageToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlStencilOpType createGlStencilOpTypeFromString(EDataType eDataType, String initialValue) {
    GlStencilOpType result = GlStencilOpType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlStencilOpTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MorphMethodType createMorphMethodTypeFromString(EDataType eDataType, String initialValue) {
    MorphMethodType result = MorphMethodType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertMorphMethodTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue) {
    NodeType result = NodeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SpringType createSpringTypeFromString(EDataType eDataType, String initialValue) {
    SpringType result = SpringType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertSpringTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public UpAxisType createUpAxisTypeFromString(EDataType eDataType, String initialValue) {
    UpAxisType result = UpAxisType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertUpAxisTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public VersionType createVersionTypeFromString(EDataType eDataType, String initialValue) {
    VersionType result = VersionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Boolean createBoolFromString(EDataType eDataType, String initialValue) {
    return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertBoolToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createBool2FromString(EDataType eDataType, String initialValue) {
    return createListOfBoolsFromString(ColladaPackage.eINSTANCE.getListOfBools(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertBool2ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfBoolsToString(ColladaPackage.eINSTANCE.getListOfBools(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createBool3FromString(EDataType eDataType, String initialValue) {
    return createListOfBoolsFromString(ColladaPackage.eINSTANCE.getListOfBools(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertBool3ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfBoolsToString(ColladaPackage.eINSTANCE.getListOfBools(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createBool4FromString(EDataType eDataType, String initialValue) {
    return createListOfBoolsFromString(ColladaPackage.eINSTANCE.getListOfBools(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertBool4ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfBoolsToString(ColladaPackage.eINSTANCE.getListOfBools(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Boolean createBoolObjectFromString(EDataType eDataType, String initialValue) {
    return createBoolFromString(ColladaPackage.eINSTANCE.getBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertBoolObjectToString(EDataType eDataType, Object instanceValue) {
    return convertBoolToString(ColladaPackage.eINSTANCE.getBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Boolean createCgBoolFromString(EDataType eDataType, String initialValue) {
    return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBoolToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Boolean createCgBool1FromString(EDataType eDataType, String initialValue) {
    return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool1ToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Boolean createCgBool1ObjectFromString(EDataType eDataType, String initialValue) {
    return createCgBool1FromString(ColladaPackage.eINSTANCE.getCgBool1(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool1ObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCgBool1ToString(ColladaPackage.eINSTANCE.getCgBool1(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool1x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool1x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool1x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool1x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool1x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool1x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool1x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool1x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool2x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool2x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool2x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool2x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool2x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool2x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool2x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool2x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool3x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool3x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool3x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool3x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool3x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool3x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool3x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool3x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool4x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool4x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool4x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool4x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool4x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool4x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgBool4x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfBoolFromString(ColladaPackage.eINSTANCE.getCgListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBool4x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfBoolToString(ColladaPackage.eINSTANCE.getCgListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Boolean createCgBoolObjectFromString(EDataType eDataType, String initialValue) {
    return createCgBoolFromString(ColladaPackage.eINSTANCE.getCgBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgBoolObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCgBoolToString(ColladaPackage.eINSTANCE.getCgBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createCgFixedFromString(EDataType eDataType, String initialValue) {
    return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixedToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createCgFixed1FromString(EDataType eDataType, String initialValue) {
    return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed1ToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createCgFixed1ObjectFromString(EDataType eDataType, String initialValue) {
    return createCgFixed1FromString(ColladaPackage.eINSTANCE.getCgFixed1(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed1ObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCgFixed1ToString(ColladaPackage.eINSTANCE.getCgFixed1(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed1x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed1x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed1x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed1x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed1x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed1x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed1x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed1x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed2x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed2x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed2x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed2x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed2x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed2x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed2x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed2x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed3x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed3x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed3x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed3x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed3x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed3x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed3x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed3x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed4x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed4x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed4x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed4x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed4x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed4x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFixed4x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFixedFromString(ColladaPackage.eINSTANCE.getCgListOfFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixed4x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFixedToString(ColladaPackage.eINSTANCE.getCgListOfFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createCgFixedObjectFromString(EDataType eDataType, String initialValue) {
    return createCgFixedFromString(ColladaPackage.eINSTANCE.getCgFixed(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFixedObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCgFixedToString(ColladaPackage.eINSTANCE.getCgFixed(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createCgFloatFromString(EDataType eDataType, String initialValue) {
    return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloatToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createCgFloat1FromString(EDataType eDataType, String initialValue) {
    return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat1ToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createCgFloat1ObjectFromString(EDataType eDataType, String initialValue) {
    return createCgFloat1FromString(ColladaPackage.eINSTANCE.getCgFloat1(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat1ObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCgFloat1ToString(ColladaPackage.eINSTANCE.getCgFloat1(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat1x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat1x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat1x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat1x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat1x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat1x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat1x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat1x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat2x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat2x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat2x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat2x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat2x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat2x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat2x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat2x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat3x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat3x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat3x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat3x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat3x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat3x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat3x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat3x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat4x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat4x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat4x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat4x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat4x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat4x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgFloat4x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfFloatFromString(ColladaPackage.eINSTANCE.getCgListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloat4x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfFloatToString(ColladaPackage.eINSTANCE.getCgListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createCgFloatObjectFromString(EDataType eDataType, String initialValue) {
    return createCgFloatFromString(ColladaPackage.eINSTANCE.getCgFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgFloatObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCgFloatToString(ColladaPackage.eINSTANCE.getCgFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createCgHalfFromString(EDataType eDataType, String initialValue) {
    return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalfToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createCgHalf1FromString(EDataType eDataType, String initialValue) {
    return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf1ToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createCgHalf1ObjectFromString(EDataType eDataType, String initialValue) {
    return createCgHalf1FromString(ColladaPackage.eINSTANCE.getCgHalf1(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf1ObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCgHalf1ToString(ColladaPackage.eINSTANCE.getCgHalf1(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf1x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf1x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf1x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf1x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf1x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf1x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf1x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf1x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf2x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf2x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf2x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf2x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf2x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf2x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf2x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf2x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf3x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf3x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf3x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf3x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf3x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf3x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf3x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf3x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf4x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf4x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf4x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf4x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf4x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf4x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgHalf4x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfHalfFromString(ColladaPackage.eINSTANCE.getCgListOfHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalf4x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfHalfToString(ColladaPackage.eINSTANCE.getCgListOfHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createCgHalfObjectFromString(EDataType eDataType, String initialValue) {
    return createCgHalfFromString(ColladaPackage.eINSTANCE.getCgHalf(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgHalfObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCgHalfToString(ColladaPackage.eINSTANCE.getCgHalf(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String createCgIdentifierFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgIdentifierToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Integer createCgIntFromString(EDataType eDataType, String initialValue) {
    return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgIntToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Integer createCgInt1FromString(EDataType eDataType, String initialValue) {
    return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt1ToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Integer createCgInt1ObjectFromString(EDataType eDataType, String initialValue) {
    return createCgInt1FromString(ColladaPackage.eINSTANCE.getCgInt1(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt1ObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCgInt1ToString(ColladaPackage.eINSTANCE.getCgInt1(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt1x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt1x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt1x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt1x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt1x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt1x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt1x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt1x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt2x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt2x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt2x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt2x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt2x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt2x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt2x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt2x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt3x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt3x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt3x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt3x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt3x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt3x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt3x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt3x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt4x1FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt4x1ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt4x2FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt4x2ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt4x3FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt4x3ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgInt4x4FromString(EDataType eDataType, String initialValue) {
    return createCgListOfIntFromString(ColladaPackage.eINSTANCE.getCgListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgInt4x4ToString(EDataType eDataType, Object instanceValue) {
    return convertCgListOfIntToString(ColladaPackage.eINSTANCE.getCgListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Integer createCgIntObjectFromString(EDataType eDataType, String initialValue) {
    return createCgIntFromString(ColladaPackage.eINSTANCE.getCgInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgIntObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCgIntToString(ColladaPackage.eINSTANCE.getCgInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createCgListOfBoolFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    List<Boolean> result = new ArrayList<Boolean>();
    for (String item : split(initialValue))
    {
      result.add(createCgBoolFromString(ColladaPackage.eINSTANCE.getCgBool(), item));
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgListOfBoolToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(convertCgBoolToString(ColladaPackage.eINSTANCE.getCgBool(), item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgListOfFixedFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    List<Float> result = new ArrayList<Float>();
    for (String item : split(initialValue))
    {
      result.add(createCgFixedFromString(ColladaPackage.eINSTANCE.getCgFixed(), item));
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgListOfFixedToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(convertCgFixedToString(ColladaPackage.eINSTANCE.getCgFixed(), item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgListOfFloatFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    List<Float> result = new ArrayList<Float>();
    for (String item : split(initialValue))
    {
      result.add(createCgFloatFromString(ColladaPackage.eINSTANCE.getCgFloat(), item));
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgListOfFloatToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(convertCgFloatToString(ColladaPackage.eINSTANCE.getCgFloat(), item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createCgListOfHalfFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    List<Float> result = new ArrayList<Float>();
    for (String item : split(initialValue))
    {
      result.add(createCgHalfFromString(ColladaPackage.eINSTANCE.getCgHalf(), item));
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgListOfHalfToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(convertCgHalfToString(ColladaPackage.eINSTANCE.getCgHalf(), item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createCgListOfIntFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    List<Integer> result = new ArrayList<Integer>();
    for (String item : split(initialValue))
    {
      result.add(createCgIntFromString(ColladaPackage.eINSTANCE.getCgInt(), item));
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgListOfIntToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(convertCgIntToString(ColladaPackage.eINSTANCE.getCgInt(), item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CgPipelineStage createCgPipelineStageObjectFromString(EDataType eDataType, String initialValue) {
    return createCgPipelineStageFromString(ColladaPackage.eINSTANCE.getCgPipelineStage(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCgPipelineStageObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCgPipelineStageToString(ColladaPackage.eINSTANCE.getCgPipelineStage(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonProfileInput createCommonProfileInputObjectFromString(EDataType eDataType, String initialValue) {
    return createCommonProfileInputFromString(ColladaPackage.eINSTANCE.getCommonProfileInput(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCommonProfileInputObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCommonProfileInputToString(ColladaPackage.eINSTANCE.getCommonProfileInput(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonProfileParam createCommonProfileParamObjectFromString(EDataType eDataType, String initialValue) {
    return createCommonProfileParamFromString(ColladaPackage.eINSTANCE.getCommonProfileParam(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertCommonProfileParamObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCommonProfileParamToString(ColladaPackage.eINSTANCE.getCommonProfileParam(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public XMLGregorianCalendar createDateTimeFromString(EDataType eDataType, String initialValue) {
    return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertDateTimeToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Double createFloatFromString(EDataType eDataType, String initialValue) {
    return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFloatToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> createFloat2FromString(EDataType eDataType, String initialValue) {
    return createListOfFloatsFromString(ColladaPackage.eINSTANCE.getListOfFloats(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFloat2ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfFloatsToString(ColladaPackage.eINSTANCE.getListOfFloats(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> createFloat2x2FromString(EDataType eDataType, String initialValue) {
    return createListOfFloatsFromString(ColladaPackage.eINSTANCE.getListOfFloats(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFloat2x2ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfFloatsToString(ColladaPackage.eINSTANCE.getListOfFloats(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> createFloat2x3FromString(EDataType eDataType, String initialValue) {
    return createListOfFloatsFromString(ColladaPackage.eINSTANCE.getListOfFloats(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFloat2x3ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfFloatsToString(ColladaPackage.eINSTANCE.getListOfFloats(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> createFloat2x4FromString(EDataType eDataType, String initialValue) {
    return createListOfFloatsFromString(ColladaPackage.eINSTANCE.getListOfFloats(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFloat2x4ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfFloatsToString(ColladaPackage.eINSTANCE.getListOfFloats(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> createFloat3FromString(EDataType eDataType, String initialValue) {
    return createListOfFloatsFromString(ColladaPackage.eINSTANCE.getListOfFloats(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFloat3ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfFloatsToString(ColladaPackage.eINSTANCE.getListOfFloats(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> createFloat3x2FromString(EDataType eDataType, String initialValue) {
    return createListOfFloatsFromString(ColladaPackage.eINSTANCE.getListOfFloats(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFloat3x2ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfFloatsToString(ColladaPackage.eINSTANCE.getListOfFloats(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> createFloat3x3FromString(EDataType eDataType, String initialValue) {
    return createListOfFloatsFromString(ColladaPackage.eINSTANCE.getListOfFloats(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFloat3x3ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfFloatsToString(ColladaPackage.eINSTANCE.getListOfFloats(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> createFloat3x4FromString(EDataType eDataType, String initialValue) {
    return createListOfFloatsFromString(ColladaPackage.eINSTANCE.getListOfFloats(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFloat3x4ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfFloatsToString(ColladaPackage.eINSTANCE.getListOfFloats(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> createFloat4FromString(EDataType eDataType, String initialValue) {
    return createListOfFloatsFromString(ColladaPackage.eINSTANCE.getListOfFloats(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFloat4ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfFloatsToString(ColladaPackage.eINSTANCE.getListOfFloats(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> createFloat4x2FromString(EDataType eDataType, String initialValue) {
    return createListOfFloatsFromString(ColladaPackage.eINSTANCE.getListOfFloats(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFloat4x2ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfFloatsToString(ColladaPackage.eINSTANCE.getListOfFloats(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> createFloat4x3FromString(EDataType eDataType, String initialValue) {
    return createListOfFloatsFromString(ColladaPackage.eINSTANCE.getListOfFloats(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFloat4x3ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfFloatsToString(ColladaPackage.eINSTANCE.getListOfFloats(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> createFloat4x4FromString(EDataType eDataType, String initialValue) {
    return createListOfFloatsFromString(ColladaPackage.eINSTANCE.getListOfFloats(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFloat4x4ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfFloatsToString(ColladaPackage.eINSTANCE.getListOfFloats(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> createFloat7FromString(EDataType eDataType, String initialValue) {
    return createListOfFloatsFromString(ColladaPackage.eINSTANCE.getListOfFloats(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFloat7ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfFloatsToString(ColladaPackage.eINSTANCE.getListOfFloats(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Double createFloatObjectFromString(EDataType eDataType, String initialValue) {
    return createFloatFromString(ColladaPackage.eINSTANCE.getFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFloatObjectToString(EDataType eDataType, Object instanceValue) {
    return convertFloatToString(ColladaPackage.eINSTANCE.getFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> createFxColorCommonFromString(EDataType eDataType, String initialValue) {
    return createFloat4FromString(ColladaPackage.eINSTANCE.getFloat4(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxColorCommonToString(EDataType eDataType, Object instanceValue) {
    return convertFloat4ToString(ColladaPackage.eINSTANCE.getFloat4(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String createFxDrawCommonFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxDrawCommonToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxModifierEnumCommon createFxModifierEnumCommonObjectFromString(EDataType eDataType, String initialValue) {
    return createFxModifierEnumCommonFromString(ColladaPackage.eINSTANCE.getFxModifierEnumCommon(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxModifierEnumCommonObjectToString(EDataType eDataType, Object instanceValue) {
    return convertFxModifierEnumCommonToString(ColladaPackage.eINSTANCE.getFxModifierEnumCommon(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxOpaqueEnum createFxOpaqueEnumObjectFromString(EDataType eDataType, String initialValue) {
    return createFxOpaqueEnumFromString(ColladaPackage.eINSTANCE.getFxOpaqueEnum(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxOpaqueEnumObjectToString(EDataType eDataType, Object instanceValue) {
    return convertFxOpaqueEnumToString(ColladaPackage.eINSTANCE.getFxOpaqueEnum(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxPipelineStageCommon createFxPipelineStageCommonObjectFromString(EDataType eDataType, String initialValue) {
    return createFxPipelineStageCommonFromString(ColladaPackage.eINSTANCE.getFxPipelineStageCommon(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxPipelineStageCommonObjectToString(EDataType eDataType, Object instanceValue) {
    return convertFxPipelineStageCommonToString(ColladaPackage.eINSTANCE.getFxPipelineStageCommon(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSamplerFilterCommon createFxSamplerFilterCommonObjectFromString(EDataType eDataType, String initialValue) {
    return createFxSamplerFilterCommonFromString(ColladaPackage.eINSTANCE.getFxSamplerFilterCommon(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSamplerFilterCommonObjectToString(EDataType eDataType, Object instanceValue) {
    return convertFxSamplerFilterCommonToString(ColladaPackage.eINSTANCE.getFxSamplerFilterCommon(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSamplerWrapCommon createFxSamplerWrapCommonObjectFromString(EDataType eDataType, String initialValue) {
    return createFxSamplerWrapCommonFromString(ColladaPackage.eINSTANCE.getFxSamplerWrapCommon(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSamplerWrapCommonObjectToString(EDataType eDataType, Object instanceValue) {
    return convertFxSamplerWrapCommonToString(ColladaPackage.eINSTANCE.getFxSamplerWrapCommon(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFaceEnum createFxSurfaceFaceEnumObjectFromString(EDataType eDataType, String initialValue) {
    return createFxSurfaceFaceEnumFromString(ColladaPackage.eINSTANCE.getFxSurfaceFaceEnum(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSurfaceFaceEnumObjectToString(EDataType eDataType, Object instanceValue) {
    return convertFxSurfaceFaceEnumToString(ColladaPackage.eINSTANCE.getFxSurfaceFaceEnum(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFormatHintChannelsEnum createFxSurfaceFormatHintChannelsEnumObjectFromString(EDataType eDataType, String initialValue) {
    return createFxSurfaceFormatHintChannelsEnumFromString(ColladaPackage.eINSTANCE.getFxSurfaceFormatHintChannelsEnum(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSurfaceFormatHintChannelsEnumObjectToString(EDataType eDataType, Object instanceValue) {
    return convertFxSurfaceFormatHintChannelsEnumToString(ColladaPackage.eINSTANCE.getFxSurfaceFormatHintChannelsEnum(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFormatHintOptionEnum createFxSurfaceFormatHintOptionEnumObjectFromString(EDataType eDataType, String initialValue) {
    return createFxSurfaceFormatHintOptionEnumFromString(ColladaPackage.eINSTANCE.getFxSurfaceFormatHintOptionEnum(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSurfaceFormatHintOptionEnumObjectToString(EDataType eDataType, Object instanceValue) {
    return convertFxSurfaceFormatHintOptionEnumToString(ColladaPackage.eINSTANCE.getFxSurfaceFormatHintOptionEnum(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFormatHintPrecisionEnum createFxSurfaceFormatHintPrecisionEnumObjectFromString(EDataType eDataType, String initialValue) {
    return createFxSurfaceFormatHintPrecisionEnumFromString(ColladaPackage.eINSTANCE.getFxSurfaceFormatHintPrecisionEnum(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSurfaceFormatHintPrecisionEnumObjectToString(EDataType eDataType, Object instanceValue) {
    return convertFxSurfaceFormatHintPrecisionEnumToString(ColladaPackage.eINSTANCE.getFxSurfaceFormatHintPrecisionEnum(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFormatHintRangeEnum createFxSurfaceFormatHintRangeEnumObjectFromString(EDataType eDataType, String initialValue) {
    return createFxSurfaceFormatHintRangeEnumFromString(ColladaPackage.eINSTANCE.getFxSurfaceFormatHintRangeEnum(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSurfaceFormatHintRangeEnumObjectToString(EDataType eDataType, Object instanceValue) {
    return convertFxSurfaceFormatHintRangeEnumToString(ColladaPackage.eINSTANCE.getFxSurfaceFormatHintRangeEnum(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceTypeEnum createFxSurfaceTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
    return createFxSurfaceTypeEnumFromString(ColladaPackage.eINSTANCE.getFxSurfaceTypeEnum(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFxSurfaceTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
    return convertFxSurfaceTypeEnumToString(ColladaPackage.eINSTANCE.getFxSurfaceTypeEnum(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createGlAlphaValueTypeFromString(EDataType eDataType, String initialValue) {
    return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlAlphaValueTypeToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createGlAlphaValueTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGlAlphaValueTypeFromString(ColladaPackage.eINSTANCE.getGlAlphaValueType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlAlphaValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlAlphaValueTypeToString(ColladaPackage.eINSTANCE.getGlAlphaValueType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlBlendEquationType createGlBlendEquationTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGlBlendEquationTypeFromString(ColladaPackage.eINSTANCE.getGlBlendEquationType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlBlendEquationTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlBlendEquationTypeToString(ColladaPackage.eINSTANCE.getGlBlendEquationType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlBlendType createGlBlendTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGlBlendTypeFromString(ColladaPackage.eINSTANCE.getGlBlendType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlBlendTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlBlendTypeToString(ColladaPackage.eINSTANCE.getGlBlendType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Enumerator createGlEnumerationFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    Enumerator result = null;
    RuntimeException exception = null;
    try
    {
      result = (Enumerator)createGlBlendTypeFromString(ColladaPackage.eINSTANCE.getGlBlendType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlFaceTypeFromString(ColladaPackage.eINSTANCE.getGlFaceType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlBlendEquationTypeFromString(ColladaPackage.eINSTANCE.getGlBlendEquationType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlFuncTypeFromString(ColladaPackage.eINSTANCE.getGlFuncType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlStencilOpTypeFromString(ColladaPackage.eINSTANCE.getGlStencilOpType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlMaterialTypeFromString(ColladaPackage.eINSTANCE.getGlMaterialType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlFogTypeFromString(ColladaPackage.eINSTANCE.getGlFogType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlFogCoordSrcTypeFromString(ColladaPackage.eINSTANCE.getGlFogCoordSrcType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlFrontFaceTypeFromString(ColladaPackage.eINSTANCE.getGlFrontFaceType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlLightModelColorControlTypeFromString(ColladaPackage.eINSTANCE.getGlLightModelColorControlType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlLogicOpTypeFromString(ColladaPackage.eINSTANCE.getGlLogicOpType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlPolygonModeTypeFromString(ColladaPackage.eINSTANCE.getGlPolygonModeType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlShadeModelTypeFromString(ColladaPackage.eINSTANCE.getGlShadeModelType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    if (result != null || exception == null) return result;
    
    throw exception;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlEnumerationToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    if (ColladaPackage.eINSTANCE.getGlBlendType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlBlendTypeToString(ColladaPackage.eINSTANCE.getGlBlendType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlFaceType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlFaceTypeToString(ColladaPackage.eINSTANCE.getGlFaceType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlBlendEquationType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlBlendEquationTypeToString(ColladaPackage.eINSTANCE.getGlBlendEquationType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlFuncType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlFuncTypeToString(ColladaPackage.eINSTANCE.getGlFuncType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlStencilOpType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlStencilOpTypeToString(ColladaPackage.eINSTANCE.getGlStencilOpType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlMaterialType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlMaterialTypeToString(ColladaPackage.eINSTANCE.getGlMaterialType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlFogType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlFogTypeToString(ColladaPackage.eINSTANCE.getGlFogType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlFogCoordSrcType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlFogCoordSrcTypeToString(ColladaPackage.eINSTANCE.getGlFogCoordSrcType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlFrontFaceType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlFrontFaceTypeToString(ColladaPackage.eINSTANCE.getGlFrontFaceType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlLightModelColorControlType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlLightModelColorControlTypeToString(ColladaPackage.eINSTANCE.getGlLightModelColorControlType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlLogicOpType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlLogicOpTypeToString(ColladaPackage.eINSTANCE.getGlLogicOpType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlPolygonModeType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlPolygonModeTypeToString(ColladaPackage.eINSTANCE.getGlPolygonModeType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlShadeModelType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlShadeModelTypeToString(ColladaPackage.eINSTANCE.getGlShadeModelType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Enumerator createGlesEnumerationFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    Enumerator result = null;
    RuntimeException exception = null;
    try
    {
      result = (Enumerator)createGlBlendTypeFromString(ColladaPackage.eINSTANCE.getGlBlendType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlFaceTypeFromString(ColladaPackage.eINSTANCE.getGlFaceType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlFuncTypeFromString(ColladaPackage.eINSTANCE.getGlFuncType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlStencilOpTypeFromString(ColladaPackage.eINSTANCE.getGlStencilOpType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlMaterialTypeFromString(ColladaPackage.eINSTANCE.getGlMaterialType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlFogTypeFromString(ColladaPackage.eINSTANCE.getGlFogType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlFrontFaceTypeFromString(ColladaPackage.eINSTANCE.getGlFrontFaceType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlLightModelColorControlTypeFromString(ColladaPackage.eINSTANCE.getGlLightModelColorControlType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlLogicOpTypeFromString(ColladaPackage.eINSTANCE.getGlLogicOpType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlPolygonModeTypeFromString(ColladaPackage.eINSTANCE.getGlPolygonModeType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = (Enumerator)createGlShadeModelTypeFromString(ColladaPackage.eINSTANCE.getGlShadeModelType(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    if (result != null || exception == null) return result;
    
    throw exception;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesEnumerationToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    if (ColladaPackage.eINSTANCE.getGlBlendType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlBlendTypeToString(ColladaPackage.eINSTANCE.getGlBlendType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlFaceType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlFaceTypeToString(ColladaPackage.eINSTANCE.getGlFaceType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlFuncType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlFuncTypeToString(ColladaPackage.eINSTANCE.getGlFuncType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlStencilOpType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlStencilOpTypeToString(ColladaPackage.eINSTANCE.getGlStencilOpType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlMaterialType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlMaterialTypeToString(ColladaPackage.eINSTANCE.getGlMaterialType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlFogType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlFogTypeToString(ColladaPackage.eINSTANCE.getGlFogType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlFrontFaceType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlFrontFaceTypeToString(ColladaPackage.eINSTANCE.getGlFrontFaceType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlLightModelColorControlType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlLightModelColorControlTypeToString(ColladaPackage.eINSTANCE.getGlLightModelColorControlType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlLogicOpType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlLogicOpTypeToString(ColladaPackage.eINSTANCE.getGlLogicOpType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlPolygonModeType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlPolygonModeTypeToString(ColladaPackage.eINSTANCE.getGlPolygonModeType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (ColladaPackage.eINSTANCE.getGlShadeModelType().isInstance(instanceValue))
    {
      try
      {
        String value = convertGlShadeModelTypeToString(ColladaPackage.eINSTANCE.getGlShadeModelType(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger createGLESMAXCLIPPLANESIndexFromString(EDataType eDataType, String initialValue) {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGLESMAXCLIPPLANESIndexToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger createGLESMAXLIGHTSIndexFromString(EDataType eDataType, String initialValue) {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGLESMAXLIGHTSIndexToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger createGLESMAXTEXTURECOORDSIndexFromString(EDataType eDataType, String initialValue) {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGLESMAXTEXTURECOORDSIndexToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger createGLESMAXTEXTUREIMAGEUNITSIndexFromString(EDataType eDataType, String initialValue) {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGLESMAXTEXTUREIMAGEUNITSIndexToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String createGlesRendertargetCommonFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesRendertargetCommonToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesSamplerWrap createGlesSamplerWrapObjectFromString(EDataType eDataType, String initialValue) {
    return createGlesSamplerWrapFromString(ColladaPackage.eINSTANCE.getGlesSamplerWrap(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesSamplerWrapObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlesSamplerWrapToString(ColladaPackage.eINSTANCE.getGlesSamplerWrap(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesStencilOpType createGlesStencilOpTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGlesStencilOpTypeFromString(ColladaPackage.eINSTANCE.getGlesStencilOpType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesStencilOpTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlesStencilOpTypeToString(ColladaPackage.eINSTANCE.getGlesStencilOpType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger createGlesTexcombinerArgumentIndexTypeFromString(EDataType eDataType, String initialValue) {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesTexcombinerArgumentIndexTypeToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerOperandAlphaEnums createGlesTexcombinerOperandAlphaEnumsObjectFromString(EDataType eDataType, String initialValue) {
    return createGlesTexcombinerOperandAlphaEnumsFromString(ColladaPackage.eINSTANCE.getGlesTexcombinerOperandAlphaEnums(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesTexcombinerOperandAlphaEnumsObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlesTexcombinerOperandAlphaEnumsToString(ColladaPackage.eINSTANCE.getGlesTexcombinerOperandAlphaEnums(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerOperandRGBEnums createGlesTexcombinerOperandRGBEnumsObjectFromString(EDataType eDataType, String initialValue) {
    return createGlesTexcombinerOperandRGBEnumsFromString(ColladaPackage.eINSTANCE.getGlesTexcombinerOperandRGBEnums(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesTexcombinerOperandRGBEnumsObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlesTexcombinerOperandRGBEnumsToString(ColladaPackage.eINSTANCE.getGlesTexcombinerOperandRGBEnums(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerOperatorAlphaEnums createGlesTexcombinerOperatorAlphaEnumsObjectFromString(EDataType eDataType, String initialValue) {
    return createGlesTexcombinerOperatorAlphaEnumsFromString(ColladaPackage.eINSTANCE.getGlesTexcombinerOperatorAlphaEnums(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesTexcombinerOperatorAlphaEnumsObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlesTexcombinerOperatorAlphaEnumsToString(ColladaPackage.eINSTANCE.getGlesTexcombinerOperatorAlphaEnums(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerOperatorRGBEnums createGlesTexcombinerOperatorRGBEnumsObjectFromString(EDataType eDataType, String initialValue) {
    return createGlesTexcombinerOperatorRGBEnumsFromString(ColladaPackage.eINSTANCE.getGlesTexcombinerOperatorRGBEnums(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesTexcombinerOperatorRGBEnumsObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlesTexcombinerOperatorRGBEnumsToString(ColladaPackage.eINSTANCE.getGlesTexcombinerOperatorRGBEnums(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexcombinerSourceEnums createGlesTexcombinerSourceEnumsObjectFromString(EDataType eDataType, String initialValue) {
    return createGlesTexcombinerSourceEnumsFromString(ColladaPackage.eINSTANCE.getGlesTexcombinerSourceEnums(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesTexcombinerSourceEnumsObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlesTexcombinerSourceEnumsToString(ColladaPackage.eINSTANCE.getGlesTexcombinerSourceEnums(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesTexenvModeEnums createGlesTexenvModeEnumsObjectFromString(EDataType eDataType, String initialValue) {
    return createGlesTexenvModeEnumsFromString(ColladaPackage.eINSTANCE.getGlesTexenvModeEnums(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlesTexenvModeEnumsObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlesTexenvModeEnumsToString(ColladaPackage.eINSTANCE.getGlesTexenvModeEnums(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlFaceType createGlFaceTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGlFaceTypeFromString(ColladaPackage.eINSTANCE.getGlFaceType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlFaceTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlFaceTypeToString(ColladaPackage.eINSTANCE.getGlFaceType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlFogCoordSrcType createGlFogCoordSrcTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGlFogCoordSrcTypeFromString(ColladaPackage.eINSTANCE.getGlFogCoordSrcType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlFogCoordSrcTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlFogCoordSrcTypeToString(ColladaPackage.eINSTANCE.getGlFogCoordSrcType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlFogType createGlFogTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGlFogTypeFromString(ColladaPackage.eINSTANCE.getGlFogType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlFogTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlFogTypeToString(ColladaPackage.eINSTANCE.getGlFogType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlFrontFaceType createGlFrontFaceTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGlFrontFaceTypeFromString(ColladaPackage.eINSTANCE.getGlFrontFaceType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlFrontFaceTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlFrontFaceTypeToString(ColladaPackage.eINSTANCE.getGlFrontFaceType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlFuncType createGlFuncTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGlFuncTypeFromString(ColladaPackage.eINSTANCE.getGlFuncType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlFuncTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlFuncTypeToString(ColladaPackage.eINSTANCE.getGlFuncType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlLightModelColorControlType createGlLightModelColorControlTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGlLightModelColorControlTypeFromString(ColladaPackage.eINSTANCE.getGlLightModelColorControlType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlLightModelColorControlTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlLightModelColorControlTypeToString(ColladaPackage.eINSTANCE.getGlLightModelColorControlType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlLogicOpType createGlLogicOpTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGlLogicOpTypeFromString(ColladaPackage.eINSTANCE.getGlLogicOpType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlLogicOpTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlLogicOpTypeToString(ColladaPackage.eINSTANCE.getGlLogicOpType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlMaterialType createGlMaterialTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGlMaterialTypeFromString(ColladaPackage.eINSTANCE.getGlMaterialType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlMaterialTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlMaterialTypeToString(ColladaPackage.eINSTANCE.getGlMaterialType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger createGLMAXCLIPPLANESIndexFromString(EDataType eDataType, String initialValue) {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGLMAXCLIPPLANESIndexToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger createGLMAXLIGHTSIndexFromString(EDataType eDataType, String initialValue) {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGLMAXLIGHTSIndexToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger createGLMAXTEXTUREIMAGEUNITSIndexFromString(EDataType eDataType, String initialValue) {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGLMAXTEXTUREIMAGEUNITSIndexToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlPolygonModeType createGlPolygonModeTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGlPolygonModeTypeFromString(ColladaPackage.eINSTANCE.getGlPolygonModeType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlPolygonModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlPolygonModeTypeToString(ColladaPackage.eINSTANCE.getGlPolygonModeType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlShadeModelType createGlShadeModelTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGlShadeModelTypeFromString(ColladaPackage.eINSTANCE.getGlShadeModelType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlShadeModelTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlShadeModelTypeToString(ColladaPackage.eINSTANCE.getGlShadeModelType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Boolean createGlslBoolFromString(EDataType eDataType, String initialValue) {
    return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslBoolToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createGlslBool2FromString(EDataType eDataType, String initialValue) {
    return createGlslListOfBoolFromString(ColladaPackage.eINSTANCE.getGlslListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslBool2ToString(EDataType eDataType, Object instanceValue) {
    return convertGlslListOfBoolToString(ColladaPackage.eINSTANCE.getGlslListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createGlslBool3FromString(EDataType eDataType, String initialValue) {
    return createGlslListOfBoolFromString(ColladaPackage.eINSTANCE.getGlslListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslBool3ToString(EDataType eDataType, Object instanceValue) {
    return convertGlslListOfBoolToString(ColladaPackage.eINSTANCE.getGlslListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createGlslBool4FromString(EDataType eDataType, String initialValue) {
    return createGlslListOfBoolFromString(ColladaPackage.eINSTANCE.getGlslListOfBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslBool4ToString(EDataType eDataType, Object instanceValue) {
    return convertGlslListOfBoolToString(ColladaPackage.eINSTANCE.getGlslListOfBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Boolean createGlslBoolObjectFromString(EDataType eDataType, String initialValue) {
    return createGlslBoolFromString(ColladaPackage.eINSTANCE.getGlslBool(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslBoolObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlslBoolToString(ColladaPackage.eINSTANCE.getGlslBool(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createGlslFloatFromString(EDataType eDataType, String initialValue) {
    return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslFloatToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createGlslFloat2FromString(EDataType eDataType, String initialValue) {
    return createGlslListOfFloatFromString(ColladaPackage.eINSTANCE.getGlslListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslFloat2ToString(EDataType eDataType, Object instanceValue) {
    return convertGlslListOfFloatToString(ColladaPackage.eINSTANCE.getGlslListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createGlslFloat2x2FromString(EDataType eDataType, String initialValue) {
    return createGlslListOfFloatFromString(ColladaPackage.eINSTANCE.getGlslListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslFloat2x2ToString(EDataType eDataType, Object instanceValue) {
    return convertGlslListOfFloatToString(ColladaPackage.eINSTANCE.getGlslListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createGlslFloat3FromString(EDataType eDataType, String initialValue) {
    return createGlslListOfFloatFromString(ColladaPackage.eINSTANCE.getGlslListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslFloat3ToString(EDataType eDataType, Object instanceValue) {
    return convertGlslListOfFloatToString(ColladaPackage.eINSTANCE.getGlslListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createGlslFloat3x3FromString(EDataType eDataType, String initialValue) {
    return createGlslListOfFloatFromString(ColladaPackage.eINSTANCE.getGlslListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslFloat3x3ToString(EDataType eDataType, Object instanceValue) {
    return convertGlslListOfFloatToString(ColladaPackage.eINSTANCE.getGlslListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createGlslFloat4FromString(EDataType eDataType, String initialValue) {
    return createGlslListOfFloatFromString(ColladaPackage.eINSTANCE.getGlslListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslFloat4ToString(EDataType eDataType, Object instanceValue) {
    return convertGlslListOfFloatToString(ColladaPackage.eINSTANCE.getGlslListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createGlslFloat4x4FromString(EDataType eDataType, String initialValue) {
    return createGlslListOfFloatFromString(ColladaPackage.eINSTANCE.getGlslListOfFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslFloat4x4ToString(EDataType eDataType, Object instanceValue) {
    return convertGlslListOfFloatToString(ColladaPackage.eINSTANCE.getGlslListOfFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Float createGlslFloatObjectFromString(EDataType eDataType, String initialValue) {
    return createGlslFloatFromString(ColladaPackage.eINSTANCE.getGlslFloat(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslFloatObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlslFloatToString(ColladaPackage.eINSTANCE.getGlslFloat(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String createGlslIdentifierFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslIdentifierToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Integer createGlslIntFromString(EDataType eDataType, String initialValue) {
    return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslIntToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createGlslInt2FromString(EDataType eDataType, String initialValue) {
    return createGlslListOfIntFromString(ColladaPackage.eINSTANCE.getGlslListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslInt2ToString(EDataType eDataType, Object instanceValue) {
    return convertGlslListOfIntToString(ColladaPackage.eINSTANCE.getGlslListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createGlslInt3FromString(EDataType eDataType, String initialValue) {
    return createGlslListOfIntFromString(ColladaPackage.eINSTANCE.getGlslListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslInt3ToString(EDataType eDataType, Object instanceValue) {
    return convertGlslListOfIntToString(ColladaPackage.eINSTANCE.getGlslListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createGlslInt4FromString(EDataType eDataType, String initialValue) {
    return createGlslListOfIntFromString(ColladaPackage.eINSTANCE.getGlslListOfInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslInt4ToString(EDataType eDataType, Object instanceValue) {
    return convertGlslListOfIntToString(ColladaPackage.eINSTANCE.getGlslListOfInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Integer createGlslIntObjectFromString(EDataType eDataType, String initialValue) {
    return createGlslIntFromString(ColladaPackage.eINSTANCE.getGlslInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslIntObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlslIntToString(ColladaPackage.eINSTANCE.getGlslInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createGlslListOfBoolFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    List<Boolean> result = new ArrayList<Boolean>();
    for (String item : split(initialValue))
    {
      result.add(createGlslBoolFromString(ColladaPackage.eINSTANCE.getGlslBool(), item));
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslListOfBoolToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(convertGlslBoolToString(ColladaPackage.eINSTANCE.getGlslBool(), item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Float> createGlslListOfFloatFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    List<Float> result = new ArrayList<Float>();
    for (String item : split(initialValue))
    {
      result.add(createGlslFloatFromString(ColladaPackage.eINSTANCE.getGlslFloat(), item));
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslListOfFloatToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(convertGlslFloatToString(ColladaPackage.eINSTANCE.getGlslFloat(), item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Integer> createGlslListOfIntFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    List<Integer> result = new ArrayList<Integer>();
    for (String item : split(initialValue))
    {
      result.add(createGlslIntFromString(ColladaPackage.eINSTANCE.getGlslInt(), item));
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslListOfIntToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(convertGlslIntToString(ColladaPackage.eINSTANCE.getGlslInt(), item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlslPipelineStage createGlslPipelineStageObjectFromString(EDataType eDataType, String initialValue) {
    return createGlslPipelineStageFromString(ColladaPackage.eINSTANCE.getGlslPipelineStage(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlslPipelineStageObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlslPipelineStageToString(ColladaPackage.eINSTANCE.getGlslPipelineStage(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlStencilOpType createGlStencilOpTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGlStencilOpTypeFromString(ColladaPackage.eINSTANCE.getGlStencilOpType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertGlStencilOpTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGlStencilOpTypeToString(ColladaPackage.eINSTANCE.getGlStencilOpType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Long createIntFromString(EDataType eDataType, String initialValue) {
    return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertIntToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Long> createInt2FromString(EDataType eDataType, String initialValue) {
    return createListOfIntsFromString(ColladaPackage.eINSTANCE.getListOfInts(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertInt2ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfIntsToString(ColladaPackage.eINSTANCE.getListOfInts(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Long> createInt2x2FromString(EDataType eDataType, String initialValue) {
    return createListOfIntsFromString(ColladaPackage.eINSTANCE.getListOfInts(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertInt2x2ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfIntsToString(ColladaPackage.eINSTANCE.getListOfInts(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Long> createInt3FromString(EDataType eDataType, String initialValue) {
    return createListOfIntsFromString(ColladaPackage.eINSTANCE.getListOfInts(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertInt3ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfIntsToString(ColladaPackage.eINSTANCE.getListOfInts(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Long> createInt3x3FromString(EDataType eDataType, String initialValue) {
    return createListOfIntsFromString(ColladaPackage.eINSTANCE.getListOfInts(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertInt3x3ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfIntsToString(ColladaPackage.eINSTANCE.getListOfInts(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Long> createInt4FromString(EDataType eDataType, String initialValue) {
    return createListOfIntsFromString(ColladaPackage.eINSTANCE.getListOfInts(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertInt4ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfIntsToString(ColladaPackage.eINSTANCE.getListOfInts(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Long> createInt4x4FromString(EDataType eDataType, String initialValue) {
    return createListOfIntsFromString(ColladaPackage.eINSTANCE.getListOfInts(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertInt4x4ToString(EDataType eDataType, Object instanceValue) {
    return convertListOfIntsToString(ColladaPackage.eINSTANCE.getListOfInts(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Long createIntObjectFromString(EDataType eDataType, String initialValue) {
    return createIntFromString(ColladaPackage.eINSTANCE.getInt(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertIntObjectToString(EDataType eDataType, Object instanceValue) {
    return convertIntToString(ColladaPackage.eINSTANCE.getInt(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Boolean> createListOfBoolsFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    List<Boolean> result = new ArrayList<Boolean>();
    for (String item : split(initialValue))
    {
      result.add(createBoolFromString(ColladaPackage.eINSTANCE.getBool(), item));
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertListOfBoolsToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(convertBoolToString(ColladaPackage.eINSTANCE.getBool(), item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public List<Double> createListOfFloatsFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Double> result = new ArrayList<Double>();
		for (String item : split(initialValue)) {
			if (!item.isEmpty())
				result.add(createFloatFromString(ColladaPackage.eINSTANCE.getFloat(), item));
		}
		return result;
	}

	  protected String [] split(String value)
	  {
	    return value.split("[ \t\n\r\f]+");
	  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertListOfFloatsToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(convertFloatToString(ColladaPackage.eINSTANCE.getFloat(), item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<byte[]> createListOfHexBinaryFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    List<byte[]> result = new ArrayList<byte[]>();
    for (String item : split(initialValue))
    {
      result.add((byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.HEX_BINARY, item));
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertListOfHexBinaryToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.HEX_BINARY, item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public List<Long> createListOfIntsFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Long> result = new ArrayList<Long>();
		for (String item : split(initialValue)) {
			if (!item.isEmpty())
			result.add(createIntFromString(ColladaPackage.eINSTANCE.getInt(), item));
		}
		return result;
	}

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertListOfIntsToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(convertIntToString(ColladaPackage.eINSTANCE.getInt(), item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> createListOfNamesFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			if (!item.isEmpty())
			  result.add(createNameFromString(ColladaPackage.eINSTANCE.getName_(), item));
		}
		return result;
	}

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertListOfNamesToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(convertNameToString(ColladaPackage.eINSTANCE.getName_(), item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<String> createListOfTokensFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    List<String> result = new ArrayList<String>();
    for (String item : split(initialValue))
    {
      result.add(createTokenFromString(ColladaPackage.eINSTANCE.getToken(), item));
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertListOfTokensToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(convertTokenToString(ColladaPackage.eINSTANCE.getToken(), item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public List<BigInteger> createListOfUIntsFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<BigInteger> result = new ArrayList<BigInteger>();
		for (String item : split(initialValue)) {
			if (!item.isEmpty())
				result.add(createUintFromString(ColladaPackage.eINSTANCE.getUint(), item));
		}
		return result;
	}

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertListOfUIntsToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(convertUintToString(ColladaPackage.eINSTANCE.getUint(), item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MorphMethodType createMorphMethodTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createMorphMethodTypeFromString(ColladaPackage.eINSTANCE.getMorphMethodType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertMorphMethodTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertMorphMethodTypeToString(ColladaPackage.eINSTANCE.getMorphMethodType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String createNameFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NAME, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertNameToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NAME, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NodeType createNodeTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createNodeTypeFromString(ColladaPackage.eINSTANCE.getNodeType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertNodeTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertNodeTypeToString(ColladaPackage.eINSTANCE.getNodeType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SpringType createSpringTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createSpringTypeFromString(ColladaPackage.eINSTANCE.getSpringType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertSpringTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertSpringTypeToString(ColladaPackage.eINSTANCE.getSpringType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String createStringFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String createTokenFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertTokenToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger createUintFromString(EDataType eDataType, String initialValue) {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_LONG, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertUintToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.UNSIGNED_LONG, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public UpAxisType createUpAxisTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createUpAxisTypeFromString(ColladaPackage.eINSTANCE.getUpAxisType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertUpAxisTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertUpAxisTypeToString(ColladaPackage.eINSTANCE.getUpAxisType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String createURIFragmentTypeFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertURIFragmentTypeToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public VersionType createVersionTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createVersionTypeFromString(ColladaPackage.eINSTANCE.getVersionType(), initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertVersionTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertVersionTypeToString(ColladaPackage.eINSTANCE.getVersionType(), instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColladaPackage getColladaPackage() {
    return (ColladaPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static ColladaPackage getPackage() {
    return ColladaPackage.eINSTANCE;
  }

} //ColladaFactoryImpl
