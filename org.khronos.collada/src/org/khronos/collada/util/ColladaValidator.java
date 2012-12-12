/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.util;

import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.khronos.collada.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage
 * @generated
 */
public class ColladaValidator extends EObjectValidator {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final ColladaValidator INSTANCE = new ColladaValidator();

	/**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
	public static final String DIAGNOSTIC_SOURCE = "org.khronos.collada";

	/**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
   * The cached base package validator.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected XMLTypeValidator xmlTypeValidator;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColladaValidator() {
    super();
    xmlTypeValidator = XMLTypeValidator.INSTANCE;
  }

	/**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EPackage getEPackage() {
    return ColladaPackage.eINSTANCE;
  }

	/**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
    switch (classifierID)
    {
      case ColladaPackage.ACCESSOR_TYPE:
        return validateAccessorType((AccessorType)value, diagnostics, context);
      case ColladaPackage.ALL_TYPE:
        return validateAllType((AllType)value, diagnostics, context);
      case ColladaPackage.ALL_TYPE1:
        return validateAllType1((AllType1)value, diagnostics, context);
      case ColladaPackage.ALL_TYPE2:
        return validateAllType2((AllType2)value, diagnostics, context);
      case ColladaPackage.ALPHA_FUNC_TYPE:
        return validateAlphaFuncType((AlphaFuncType)value, diagnostics, context);
      case ColladaPackage.ALPHA_FUNC_TYPE1:
        return validateAlphaFuncType1((AlphaFuncType1)value, diagnostics, context);
      case ColladaPackage.ALPHA_TEST_ENABLE_TYPE:
        return validateAlphaTestEnableType((AlphaTestEnableType)value, diagnostics, context);
      case ColladaPackage.ALPHA_TEST_ENABLE_TYPE1:
        return validateAlphaTestEnableType1((AlphaTestEnableType1)value, diagnostics, context);
      case ColladaPackage.ALPHA_TYPE:
        return validateAlphaType((AlphaType)value, diagnostics, context);
      case ColladaPackage.AMBIENT_TYPE:
        return validateAmbientType((AmbientType)value, diagnostics, context);
      case ColladaPackage.ANGULAR_TYPE:
        return validateAngularType((AngularType)value, diagnostics, context);
      case ColladaPackage.ANIMATION_CLIP_TYPE:
        return validateAnimationClipType((AnimationClipType)value, diagnostics, context);
      case ColladaPackage.ANIMATION_TYPE:
        return validateAnimationType((AnimationType)value, diagnostics, context);
      case ColladaPackage.ASSET_TYPE:
        return validateAssetType((AssetType)value, diagnostics, context);
      case ColladaPackage.ATTACHMENT_TYPE:
        return validateAttachmentType((AttachmentType)value, diagnostics, context);
      case ColladaPackage.AUTO_NORMAL_ENABLE_TYPE:
        return validateAutoNormalEnableType((AutoNormalEnableType)value, diagnostics, context);
      case ColladaPackage.BACK_TYPE:
        return validateBackType((BackType)value, diagnostics, context);
      case ColladaPackage.BIND_MATERIAL_TYPE:
        return validateBindMaterialType((BindMaterialType)value, diagnostics, context);
      case ColladaPackage.BIND_TYPE:
        return validateBindType((BindType)value, diagnostics, context);
      case ColladaPackage.BIND_TYPE1:
        return validateBindType1((BindType1)value, diagnostics, context);
      case ColladaPackage.BIND_TYPE2:
        return validateBindType2((BindType2)value, diagnostics, context);
      case ColladaPackage.BIND_VERTEX_INPUT_TYPE:
        return validateBindVertexInputType((BindVertexInputType)value, diagnostics, context);
      case ColladaPackage.BLEND_COLOR_TYPE:
        return validateBlendColorType((BlendColorType)value, diagnostics, context);
      case ColladaPackage.BLEND_ENABLE_TYPE:
        return validateBlendEnableType((BlendEnableType)value, diagnostics, context);
      case ColladaPackage.BLEND_ENABLE_TYPE1:
        return validateBlendEnableType1((BlendEnableType1)value, diagnostics, context);
      case ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE:
        return validateBlendEquationSeparateType((BlendEquationSeparateType)value, diagnostics, context);
      case ColladaPackage.BLEND_EQUATION_TYPE:
        return validateBlendEquationType((BlendEquationType)value, diagnostics, context);
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE:
        return validateBlendFuncSeparateType((BlendFuncSeparateType)value, diagnostics, context);
      case ColladaPackage.BLEND_FUNC_TYPE:
        return validateBlendFuncType((BlendFuncType)value, diagnostics, context);
      case ColladaPackage.BLEND_FUNC_TYPE1:
        return validateBlendFuncType1((BlendFuncType1)value, diagnostics, context);
      case ColladaPackage.BLINN_TYPE:
        return validateBlinnType((BlinnType)value, diagnostics, context);
      case ColladaPackage.BOOL_ARRAY_TYPE:
        return validateBoolArrayType((BoolArrayType)value, diagnostics, context);
      case ColladaPackage.BOX_TYPE:
        return validateBoxType((BoxType)value, diagnostics, context);
      case ColladaPackage.CAMERA_TYPE:
        return validateCameraType((CameraType)value, diagnostics, context);
      case ColladaPackage.CAPSULE_TYPE:
        return validateCapsuleType((CapsuleType)value, diagnostics, context);
      case ColladaPackage.CG_CONNECT_PARAM:
        return validateCgConnectParam((CgConnectParam)value, diagnostics, context);
      case ColladaPackage.CG_NEWARRAY_TYPE:
        return validateCgNewarrayType((CgNewarrayType)value, diagnostics, context);
      case ColladaPackage.CG_NEWPARAM:
        return validateCgNewparam((CgNewparam)value, diagnostics, context);
      case ColladaPackage.CG_SAMPLER1_D:
        return validateCgSampler1D((CgSampler1D)value, diagnostics, context);
      case ColladaPackage.CG_SAMPLER2_D:
        return validateCgSampler2D((CgSampler2D)value, diagnostics, context);
      case ColladaPackage.CG_SAMPLER3_D:
        return validateCgSampler3D((CgSampler3D)value, diagnostics, context);
      case ColladaPackage.CG_SAMPLER_CUBE:
        return validateCgSamplerCUBE((CgSamplerCUBE)value, diagnostics, context);
      case ColladaPackage.CG_SAMPLER_DEPTH:
        return validateCgSamplerDEPTH((CgSamplerDEPTH)value, diagnostics, context);
      case ColladaPackage.CG_SAMPLER_RECT:
        return validateCgSamplerRECT((CgSamplerRECT)value, diagnostics, context);
      case ColladaPackage.CG_SETARRAY_TYPE:
        return validateCgSetarrayType((CgSetarrayType)value, diagnostics, context);
      case ColladaPackage.CG_SETPARAM:
        return validateCgSetparam((CgSetparam)value, diagnostics, context);
      case ColladaPackage.CG_SETPARAM_SIMPLE:
        return validateCgSetparamSimple((CgSetparamSimple)value, diagnostics, context);
      case ColladaPackage.CG_SETUSER_TYPE:
        return validateCgSetuserType((CgSetuserType)value, diagnostics, context);
      case ColladaPackage.CG_SURFACE_TYPE:
        return validateCgSurfaceType((CgSurfaceType)value, diagnostics, context);
      case ColladaPackage.CHANNEL_TYPE:
        return validateChannelType((ChannelType)value, diagnostics, context);
      case ColladaPackage.CLEAR_COLOR_TYPE:
        return validateClearColorType((ClearColorType)value, diagnostics, context);
      case ColladaPackage.CLEAR_COLOR_TYPE1:
        return validateClearColorType1((ClearColorType1)value, diagnostics, context);
      case ColladaPackage.CLEAR_DEPTH_TYPE:
        return validateClearDepthType((ClearDepthType)value, diagnostics, context);
      case ColladaPackage.CLEAR_DEPTH_TYPE1:
        return validateClearDepthType1((ClearDepthType1)value, diagnostics, context);
      case ColladaPackage.CLEAR_STENCIL_TYPE:
        return validateClearStencilType((ClearStencilType)value, diagnostics, context);
      case ColladaPackage.CLEAR_STENCIL_TYPE1:
        return validateClearStencilType1((ClearStencilType1)value, diagnostics, context);
      case ColladaPackage.CLIP_PLANE_ENABLE_TYPE:
        return validateClipPlaneEnableType((ClipPlaneEnableType)value, diagnostics, context);
      case ColladaPackage.CLIP_PLANE_ENABLE_TYPE1:
        return validateClipPlaneEnableType1((ClipPlaneEnableType1)value, diagnostics, context);
      case ColladaPackage.CLIP_PLANE_TYPE:
        return validateClipPlaneType((ClipPlaneType)value, diagnostics, context);
      case ColladaPackage.CLIP_PLANE_TYPE1:
        return validateClipPlaneType1((ClipPlaneType1)value, diagnostics, context);
      case ColladaPackage.COLLADA_TYPE:
        return validateCOLLADAType((COLLADAType)value, diagnostics, context);
      case ColladaPackage.COLOR_LOGIC_OP_ENABLE_TYPE:
        return validateColorLogicOpEnableType((ColorLogicOpEnableType)value, diagnostics, context);
      case ColladaPackage.COLOR_LOGIC_OP_ENABLE_TYPE1:
        return validateColorLogicOpEnableType1((ColorLogicOpEnableType1)value, diagnostics, context);
      case ColladaPackage.COLOR_MASK_TYPE:
        return validateColorMaskType((ColorMaskType)value, diagnostics, context);
      case ColladaPackage.COLOR_MASK_TYPE1:
        return validateColorMaskType1((ColorMaskType1)value, diagnostics, context);
      case ColladaPackage.COLOR_MATERIAL_ENABLE_TYPE:
        return validateColorMaterialEnableType((ColorMaterialEnableType)value, diagnostics, context);
      case ColladaPackage.COLOR_MATERIAL_ENABLE_TYPE1:
        return validateColorMaterialEnableType1((ColorMaterialEnableType1)value, diagnostics, context);
      case ColladaPackage.COLOR_MATERIAL_TYPE:
        return validateColorMaterialType((ColorMaterialType)value, diagnostics, context);
      case ColladaPackage.COLOR_TYPE:
        return validateColorType((ColorType)value, diagnostics, context);
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE:
        return validateCommonColorOrTextureType((CommonColorOrTextureType)value, diagnostics, context);
      case ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE:
        return validateCommonFloatOrParamType((CommonFloatOrParamType)value, diagnostics, context);
      case ColladaPackage.COMMON_NEWPARAM_TYPE:
        return validateCommonNewparamType((CommonNewparamType)value, diagnostics, context);
      case ColladaPackage.COMMON_TRANSPARENT_TYPE:
        return validateCommonTransparentType((CommonTransparentType)value, diagnostics, context);
      case ColladaPackage.COMPILER_TARGET_TYPE:
        return validateCompilerTargetType((CompilerTargetType)value, diagnostics, context);
      case ColladaPackage.COMPILER_TARGET_TYPE1:
        return validateCompilerTargetType1((CompilerTargetType1)value, diagnostics, context);
      case ColladaPackage.CONSTANT_TYPE:
        return validateConstantType((ConstantType)value, diagnostics, context);
      case ColladaPackage.CONTRIBUTOR_TYPE:
        return validateContributorType((ContributorType)value, diagnostics, context);
      case ColladaPackage.CONTROLLER_TYPE:
        return validateControllerType((ControllerType)value, diagnostics, context);
      case ColladaPackage.CONTROL_VERTICES_TYPE:
        return validateControlVerticesType((ControlVerticesType)value, diagnostics, context);
      case ColladaPackage.CONVEX_MESH_TYPE:
        return validateConvexMeshType((ConvexMeshType)value, diagnostics, context);
      case ColladaPackage.CULL_FACE_ENABLE_TYPE:
        return validateCullFaceEnableType((CullFaceEnableType)value, diagnostics, context);
      case ColladaPackage.CULL_FACE_ENABLE_TYPE1:
        return validateCullFaceEnableType1((CullFaceEnableType1)value, diagnostics, context);
      case ColladaPackage.CULL_FACE_TYPE:
        return validateCullFaceType((CullFaceType)value, diagnostics, context);
      case ColladaPackage.CULL_FACE_TYPE1:
        return validateCullFaceType1((CullFaceType1)value, diagnostics, context);
      case ColladaPackage.CYLINDER_TYPE:
        return validateCylinderType((CylinderType)value, diagnostics, context);
      case ColladaPackage.DEPTH_BOUNDS_ENABLE_TYPE:
        return validateDepthBoundsEnableType((DepthBoundsEnableType)value, diagnostics, context);
      case ColladaPackage.DEPTH_BOUNDS_TYPE:
        return validateDepthBoundsType((DepthBoundsType)value, diagnostics, context);
      case ColladaPackage.DEPTH_CLAMP_ENABLE_TYPE:
        return validateDepthClampEnableType((DepthClampEnableType)value, diagnostics, context);
      case ColladaPackage.DEPTH_FUNC_TYPE:
        return validateDepthFuncType((DepthFuncType)value, diagnostics, context);
      case ColladaPackage.DEPTH_FUNC_TYPE1:
        return validateDepthFuncType1((DepthFuncType1)value, diagnostics, context);
      case ColladaPackage.DEPTH_MASK_TYPE:
        return validateDepthMaskType((DepthMaskType)value, diagnostics, context);
      case ColladaPackage.DEPTH_MASK_TYPE1:
        return validateDepthMaskType1((DepthMaskType1)value, diagnostics, context);
      case ColladaPackage.DEPTH_RANGE_TYPE:
        return validateDepthRangeType((DepthRangeType)value, diagnostics, context);
      case ColladaPackage.DEPTH_RANGE_TYPE1:
        return validateDepthRangeType1((DepthRangeType1)value, diagnostics, context);
      case ColladaPackage.DEPTH_TEST_ENABLE_TYPE:
        return validateDepthTestEnableType((DepthTestEnableType)value, diagnostics, context);
      case ColladaPackage.DEPTH_TEST_ENABLE_TYPE1:
        return validateDepthTestEnableType1((DepthTestEnableType1)value, diagnostics, context);
      case ColladaPackage.DEST_ALPHA_TYPE:
        return validateDestAlphaType((DestAlphaType)value, diagnostics, context);
      case ColladaPackage.DEST_RGB_TYPE:
        return validateDestRgbType((DestRgbType)value, diagnostics, context);
      case ColladaPackage.DEST_TYPE:
        return validateDestType((DestType)value, diagnostics, context);
      case ColladaPackage.DEST_TYPE1:
        return validateDestType1((DestType1)value, diagnostics, context);
      case ColladaPackage.DIRECTIONAL_TYPE:
        return validateDirectionalType((DirectionalType)value, diagnostics, context);
      case ColladaPackage.DITHER_ENABLE_TYPE:
        return validateDitherEnableType((DitherEnableType)value, diagnostics, context);
      case ColladaPackage.DITHER_ENABLE_TYPE1:
        return validateDitherEnableType1((DitherEnableType1)value, diagnostics, context);
      case ColladaPackage.DOCUMENT_ROOT:
        return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
      case ColladaPackage.DYNAMIC_TYPE:
        return validateDynamicType((DynamicType)value, diagnostics, context);
      case ColladaPackage.DYNAMIC_TYPE1:
        return validateDynamicType1((DynamicType1)value, diagnostics, context);
      case ColladaPackage.EFFECT_TYPE:
        return validateEffectType((EffectType)value, diagnostics, context);
      case ColladaPackage.ELLIPSOID_TYPE:
        return validateEllipsoidType((EllipsoidType)value, diagnostics, context);
      case ColladaPackage.ENABLED_TYPE:
        return validateEnabledType((EnabledType)value, diagnostics, context);
      case ColladaPackage.EVALUATE_SCENE_TYPE:
        return validateEvaluateSceneType((EvaluateSceneType)value, diagnostics, context);
      case ColladaPackage.EXTRA_TYPE:
        return validateExtraType((ExtraType)value, diagnostics, context);
      case ColladaPackage.FACE_TYPE:
        return validateFaceType((FaceType)value, diagnostics, context);
      case ColladaPackage.FACE_TYPE1:
        return validateFaceType1((FaceType1)value, diagnostics, context);
      case ColladaPackage.FACE_TYPE2:
        return validateFaceType2((FaceType2)value, diagnostics, context);
      case ColladaPackage.FACE_TYPE3:
        return validateFaceType3((FaceType3)value, diagnostics, context);
      case ColladaPackage.FACE_TYPE4:
        return validateFaceType4((FaceType4)value, diagnostics, context);
      case ColladaPackage.FAIL_TYPE:
        return validateFailType((FailType)value, diagnostics, context);
      case ColladaPackage.FAIL_TYPE1:
        return validateFailType1((FailType1)value, diagnostics, context);
      case ColladaPackage.FAIL_TYPE2:
        return validateFailType2((FailType2)value, diagnostics, context);
      case ColladaPackage.FLOAT_ARRAY_TYPE:
        return validateFloatArrayType((FloatArrayType)value, diagnostics, context);
      case ColladaPackage.FLOAT_TYPE:
        return validateFloatType((FloatType)value, diagnostics, context);
      case ColladaPackage.FOG_COLOR_TYPE:
        return validateFogColorType((FogColorType)value, diagnostics, context);
      case ColladaPackage.FOG_COLOR_TYPE1:
        return validateFogColorType1((FogColorType1)value, diagnostics, context);
      case ColladaPackage.FOG_COORD_SRC_TYPE:
        return validateFogCoordSrcType((FogCoordSrcType)value, diagnostics, context);
      case ColladaPackage.FOG_DENSITY_TYPE:
        return validateFogDensityType((FogDensityType)value, diagnostics, context);
      case ColladaPackage.FOG_DENSITY_TYPE1:
        return validateFogDensityType1((FogDensityType1)value, diagnostics, context);
      case ColladaPackage.FOG_ENABLE_TYPE:
        return validateFogEnableType((FogEnableType)value, diagnostics, context);
      case ColladaPackage.FOG_ENABLE_TYPE1:
        return validateFogEnableType1((FogEnableType1)value, diagnostics, context);
      case ColladaPackage.FOG_END_TYPE:
        return validateFogEndType((FogEndType)value, diagnostics, context);
      case ColladaPackage.FOG_END_TYPE1:
        return validateFogEndType1((FogEndType1)value, diagnostics, context);
      case ColladaPackage.FOG_MODE_TYPE:
        return validateFogModeType((FogModeType)value, diagnostics, context);
      case ColladaPackage.FOG_MODE_TYPE1:
        return validateFogModeType1((FogModeType1)value, diagnostics, context);
      case ColladaPackage.FOG_START_TYPE:
        return validateFogStartType((FogStartType)value, diagnostics, context);
      case ColladaPackage.FOG_START_TYPE1:
        return validateFogStartType1((FogStartType1)value, diagnostics, context);
      case ColladaPackage.FORCE_FIELD_TYPE:
        return validateForceFieldType((ForceFieldType)value, diagnostics, context);
      case ColladaPackage.FRONT_FACE_TYPE:
        return validateFrontFaceType((FrontFaceType)value, diagnostics, context);
      case ColladaPackage.FRONT_FACE_TYPE1:
        return validateFrontFaceType1((FrontFaceType1)value, diagnostics, context);
      case ColladaPackage.FRONT_TYPE:
        return validateFrontType((FrontType)value, diagnostics, context);
      case ColladaPackage.FUNC_TYPE:
        return validateFuncType((FuncType)value, diagnostics, context);
      case ColladaPackage.FUNC_TYPE1:
        return validateFuncType1((FuncType1)value, diagnostics, context);
      case ColladaPackage.FUNC_TYPE2:
        return validateFuncType2((FuncType2)value, diagnostics, context);
      case ColladaPackage.FUNC_TYPE3:
        return validateFuncType3((FuncType3)value, diagnostics, context);
      case ColladaPackage.FX_ANNOTATE_COMMON:
        return validateFxAnnotateCommon((FxAnnotateCommon)value, diagnostics, context);
      case ColladaPackage.FX_CLEARCOLOR_COMMON:
        return validateFxClearcolorCommon((FxClearcolorCommon)value, diagnostics, context);
      case ColladaPackage.FX_CLEARDEPTH_COMMON:
        return validateFxCleardepthCommon((FxCleardepthCommon)value, diagnostics, context);
      case ColladaPackage.FX_CLEARSTENCIL_COMMON:
        return validateFxClearstencilCommon((FxClearstencilCommon)value, diagnostics, context);
      case ColladaPackage.FX_CODE_PROFILE:
        return validateFxCodeProfile((FxCodeProfile)value, diagnostics, context);
      case ColladaPackage.FX_COLORTARGET_COMMON:
        return validateFxColortargetCommon((FxColortargetCommon)value, diagnostics, context);
      case ColladaPackage.FX_DEPTHTARGET_COMMON:
        return validateFxDepthtargetCommon((FxDepthtargetCommon)value, diagnostics, context);
      case ColladaPackage.FX_INCLUDE_COMMON:
        return validateFxIncludeCommon((FxIncludeCommon)value, diagnostics, context);
      case ColladaPackage.FX_NEWPARAM_COMMON:
        return validateFxNewparamCommon((FxNewparamCommon)value, diagnostics, context);
      case ColladaPackage.FX_SAMPLER1_DCOMMON:
        return validateFxSampler1DCommon((FxSampler1DCommon)value, diagnostics, context);
      case ColladaPackage.FX_SAMPLER2_DCOMMON:
        return validateFxSampler2DCommon((FxSampler2DCommon)value, diagnostics, context);
      case ColladaPackage.FX_SAMPLER3_DCOMMON:
        return validateFxSampler3DCommon((FxSampler3DCommon)value, diagnostics, context);
      case ColladaPackage.FX_SAMPLER_CUBE_COMMON:
        return validateFxSamplerCUBECommon((FxSamplerCUBECommon)value, diagnostics, context);
      case ColladaPackage.FX_SAMPLER_DEPTH_COMMON:
        return validateFxSamplerDEPTHCommon((FxSamplerDEPTHCommon)value, diagnostics, context);
      case ColladaPackage.FX_SAMPLER_RECT_COMMON:
        return validateFxSamplerRECTCommon((FxSamplerRECTCommon)value, diagnostics, context);
      case ColladaPackage.FX_STENCILTARGET_COMMON:
        return validateFxStenciltargetCommon((FxStenciltargetCommon)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_COMMON:
        return validateFxSurfaceCommon((FxSurfaceCommon)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON:
        return validateFxSurfaceFormatHintCommon((FxSurfaceFormatHintCommon)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON:
        return validateFxSurfaceInitCubeCommon((FxSurfaceInitCubeCommon)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON:
        return validateFxSurfaceInitFromCommon((FxSurfaceInitFromCommon)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_INIT_PLANAR_COMMON:
        return validateFxSurfaceInitPlanarCommon((FxSurfaceInitPlanarCommon)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON:
        return validateFxSurfaceInitVolumeCommon((FxSurfaceInitVolumeCommon)value, diagnostics, context);
      case ColladaPackage.GENERATOR_TYPE:
        return validateGeneratorType((GeneratorType)value, diagnostics, context);
      case ColladaPackage.GENERATOR_TYPE1:
        return validateGeneratorType1((GeneratorType1)value, diagnostics, context);
      case ColladaPackage.GEOMETRY_TYPE:
        return validateGeometryType((GeometryType)value, diagnostics, context);
      case ColladaPackage.GLES_NEWPARAM:
        return validateGlesNewparam((GlesNewparam)value, diagnostics, context);
      case ColladaPackage.GLES_SAMPLER_STATE:
        return validateGlesSamplerState((GlesSamplerState)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_ALPHA_TYPE:
        return validateGlesTexcombinerArgumentAlphaType((GlesTexcombinerArgumentAlphaType)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE:
        return validateGlesTexcombinerArgumentRGBType((GlesTexcombinerArgumentRGBType)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_ALPHA_TYPE:
        return validateGlesTexcombinerCommandAlphaType((GlesTexcombinerCommandAlphaType)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE:
        return validateGlesTexcombinerCommandRGBType((GlesTexcombinerCommandRGBType)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE:
        return validateGlesTexcombinerCommandType((GlesTexcombinerCommandType)value, diagnostics, context);
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE:
        return validateGlesTexenvCommandType((GlesTexenvCommandType)value, diagnostics, context);
      case ColladaPackage.GLES_TEXTURE_CONSTANT_TYPE:
        return validateGlesTextureConstantType((GlesTextureConstantType)value, diagnostics, context);
      case ColladaPackage.GLES_TEXTURE_PIPELINE:
        return validateGlesTexturePipeline((GlesTexturePipeline)value, diagnostics, context);
      case ColladaPackage.GLES_TEXTURE_UNIT:
        return validateGlesTextureUnit((GlesTextureUnit)value, diagnostics, context);
      case ColladaPackage.GL_SAMPLER1_D:
        return validateGlSampler1D((GlSampler1D)value, diagnostics, context);
      case ColladaPackage.GL_SAMPLER2_D:
        return validateGlSampler2D((GlSampler2D)value, diagnostics, context);
      case ColladaPackage.GL_SAMPLER3_D:
        return validateGlSampler3D((GlSampler3D)value, diagnostics, context);
      case ColladaPackage.GL_SAMPLER_CUBE:
        return validateGlSamplerCUBE((GlSamplerCUBE)value, diagnostics, context);
      case ColladaPackage.GL_SAMPLER_DEPTH:
        return validateGlSamplerDEPTH((GlSamplerDEPTH)value, diagnostics, context);
      case ColladaPackage.GL_SAMPLER_RECT:
        return validateGlSamplerRECT((GlSamplerRECT)value, diagnostics, context);
      case ColladaPackage.GLSL_NEWARRAY_TYPE:
        return validateGlslNewarrayType((GlslNewarrayType)value, diagnostics, context);
      case ColladaPackage.GLSL_NEWPARAM:
        return validateGlslNewparam((GlslNewparam)value, diagnostics, context);
      case ColladaPackage.GLSL_SETARRAY_TYPE:
        return validateGlslSetarrayType((GlslSetarrayType)value, diagnostics, context);
      case ColladaPackage.GLSL_SETPARAM:
        return validateGlslSetparam((GlslSetparam)value, diagnostics, context);
      case ColladaPackage.GLSL_SETPARAM_SIMPLE:
        return validateGlslSetparamSimple((GlslSetparamSimple)value, diagnostics, context);
      case ColladaPackage.GLSL_SURFACE_TYPE:
        return validateGlslSurfaceType((GlslSurfaceType)value, diagnostics, context);
      case ColladaPackage.HOLLOW_TYPE:
        return validateHollowType((HollowType)value, diagnostics, context);
      case ColladaPackage.HOLLOW_TYPE1:
        return validateHollowType1((HollowType1)value, diagnostics, context);
      case ColladaPackage.IDREF_ARRAY_TYPE:
        return validateIDREFArrayType((IDREFArrayType)value, diagnostics, context);
      case ColladaPackage.IMAGER_TYPE:
        return validateImagerType((ImagerType)value, diagnostics, context);
      case ColladaPackage.IMAGE_TYPE:
        return validateImageType((ImageType)value, diagnostics, context);
      case ColladaPackage.INPUT_GLOBAL:
        return validateInputGlobal((InputGlobal)value, diagnostics, context);
      case ColladaPackage.INPUT_LOCAL:
        return validateInputLocal((InputLocal)value, diagnostics, context);
      case ColladaPackage.INPUT_LOCAL_OFFSET:
        return validateInputLocalOffset((InputLocalOffset)value, diagnostics, context);
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE:
        return validateInstanceControllerType((InstanceControllerType)value, diagnostics, context);
      case ColladaPackage.INSTANCE_EFFECT_TYPE:
        return validateInstanceEffectType((InstanceEffectType)value, diagnostics, context);
      case ColladaPackage.INSTANCE_GEOMETRY_TYPE:
        return validateInstanceGeometryType((InstanceGeometryType)value, diagnostics, context);
      case ColladaPackage.INSTANCE_MATERIAL_TYPE:
        return validateInstanceMaterialType((InstanceMaterialType)value, diagnostics, context);
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE:
        return validateInstancePhysicsModelType((InstancePhysicsModelType)value, diagnostics, context);
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE:
        return validateInstanceRigidBodyType((InstanceRigidBodyType)value, diagnostics, context);
      case ColladaPackage.INSTANCE_RIGID_CONSTRAINT_TYPE:
        return validateInstanceRigidConstraintType((InstanceRigidConstraintType)value, diagnostics, context);
      case ColladaPackage.INSTANCE_WITH_EXTRA:
        return validateInstanceWithExtra((InstanceWithExtra)value, diagnostics, context);
      case ColladaPackage.INT_ARRAY_TYPE:
        return validateIntArrayType((IntArrayType)value, diagnostics, context);
      case ColladaPackage.INTERPENETRATE_TYPE:
        return validateInterpenetrateType((InterpenetrateType)value, diagnostics, context);
      case ColladaPackage.JOINTS_TYPE:
        return validateJointsType((JointsType)value, diagnostics, context);
      case ColladaPackage.LAMBERT_TYPE:
        return validateLambertType((LambertType)value, diagnostics, context);
      case ColladaPackage.LIBRARY_ANIMATION_CLIPS_TYPE:
        return validateLibraryAnimationClipsType((LibraryAnimationClipsType)value, diagnostics, context);
      case ColladaPackage.LIBRARY_ANIMATIONS_TYPE:
        return validateLibraryAnimationsType((LibraryAnimationsType)value, diagnostics, context);
      case ColladaPackage.LIBRARY_CAMERAS_TYPE:
        return validateLibraryCamerasType((LibraryCamerasType)value, diagnostics, context);
      case ColladaPackage.LIBRARY_CONTROLLERS_TYPE:
        return validateLibraryControllersType((LibraryControllersType)value, diagnostics, context);
      case ColladaPackage.LIBRARY_EFFECTS_TYPE:
        return validateLibraryEffectsType((LibraryEffectsType)value, diagnostics, context);
      case ColladaPackage.LIBRARY_FORCE_FIELDS_TYPE:
        return validateLibraryForceFieldsType((LibraryForceFieldsType)value, diagnostics, context);
      case ColladaPackage.LIBRARY_GEOMETRIES_TYPE:
        return validateLibraryGeometriesType((LibraryGeometriesType)value, diagnostics, context);
      case ColladaPackage.LIBRARY_IMAGES_TYPE:
        return validateLibraryImagesType((LibraryImagesType)value, diagnostics, context);
      case ColladaPackage.LIBRARY_LIGHTS_TYPE:
        return validateLibraryLightsType((LibraryLightsType)value, diagnostics, context);
      case ColladaPackage.LIBRARY_MATERIALS_TYPE:
        return validateLibraryMaterialsType((LibraryMaterialsType)value, diagnostics, context);
      case ColladaPackage.LIBRARY_NODES_TYPE:
        return validateLibraryNodesType((LibraryNodesType)value, diagnostics, context);
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE:
        return validateLibraryPhysicsMaterialsType((LibraryPhysicsMaterialsType)value, diagnostics, context);
      case ColladaPackage.LIBRARY_PHYSICS_MODELS_TYPE:
        return validateLibraryPhysicsModelsType((LibraryPhysicsModelsType)value, diagnostics, context);
      case ColladaPackage.LIBRARY_PHYSICS_SCENES_TYPE:
        return validateLibraryPhysicsScenesType((LibraryPhysicsScenesType)value, diagnostics, context);
      case ColladaPackage.LIBRARY_VISUAL_SCENES_TYPE:
        return validateLibraryVisualScenesType((LibraryVisualScenesType)value, diagnostics, context);
      case ColladaPackage.LIGHT_AMBIENT_TYPE:
        return validateLightAmbientType((LightAmbientType)value, diagnostics, context);
      case ColladaPackage.LIGHT_AMBIENT_TYPE1:
        return validateLightAmbientType1((LightAmbientType1)value, diagnostics, context);
      case ColladaPackage.LIGHT_CONSTANT_ATTENUATION_TYPE:
        return validateLightConstantAttenuationType((LightConstantAttenuationType)value, diagnostics, context);
      case ColladaPackage.LIGHT_CONSTANT_ATTENUATION_TYPE1:
        return validateLightConstantAttenuationType1((LightConstantAttenuationType1)value, diagnostics, context);
      case ColladaPackage.LIGHT_DIFFUSE_TYPE:
        return validateLightDiffuseType((LightDiffuseType)value, diagnostics, context);
      case ColladaPackage.LIGHT_DIFFUSE_TYPE1:
        return validateLightDiffuseType1((LightDiffuseType1)value, diagnostics, context);
      case ColladaPackage.LIGHT_ENABLE_TYPE:
        return validateLightEnableType((LightEnableType)value, diagnostics, context);
      case ColladaPackage.LIGHT_ENABLE_TYPE1:
        return validateLightEnableType1((LightEnableType1)value, diagnostics, context);
      case ColladaPackage.LIGHTING_ENABLE_TYPE:
        return validateLightingEnableType((LightingEnableType)value, diagnostics, context);
      case ColladaPackage.LIGHTING_ENABLE_TYPE1:
        return validateLightingEnableType1((LightingEnableType1)value, diagnostics, context);
      case ColladaPackage.LIGHT_LINEAR_ATTENUATION_TYPE:
        return validateLightLinearAttenuationType((LightLinearAttenuationType)value, diagnostics, context);
      case ColladaPackage.LIGHT_LINEAR_ATTENUTATION_TYPE:
        return validateLightLinearAttenutationType((LightLinearAttenutationType)value, diagnostics, context);
      case ColladaPackage.LIGHT_MODEL_AMBIENT_TYPE:
        return validateLightModelAmbientType((LightModelAmbientType)value, diagnostics, context);
      case ColladaPackage.LIGHT_MODEL_AMBIENT_TYPE1:
        return validateLightModelAmbientType1((LightModelAmbientType1)value, diagnostics, context);
      case ColladaPackage.LIGHT_MODEL_COLOR_CONTROL_TYPE:
        return validateLightModelColorControlType((LightModelColorControlType)value, diagnostics, context);
      case ColladaPackage.LIGHT_MODEL_LOCAL_VIEWER_ENABLE_TYPE:
        return validateLightModelLocalViewerEnableType((LightModelLocalViewerEnableType)value, diagnostics, context);
      case ColladaPackage.LIGHT_MODEL_TWO_SIDE_ENABLE_TYPE:
        return validateLightModelTwoSideEnableType((LightModelTwoSideEnableType)value, diagnostics, context);
      case ColladaPackage.LIGHT_MODEL_TWO_SIDE_ENABLE_TYPE1:
        return validateLightModelTwoSideEnableType1((LightModelTwoSideEnableType1)value, diagnostics, context);
      case ColladaPackage.LIGHT_POSITION_TYPE:
        return validateLightPositionType((LightPositionType)value, diagnostics, context);
      case ColladaPackage.LIGHT_POSITION_TYPE1:
        return validateLightPositionType1((LightPositionType1)value, diagnostics, context);
      case ColladaPackage.LIGHT_QUADRATIC_ATTENUATION_TYPE:
        return validateLightQuadraticAttenuationType((LightQuadraticAttenuationType)value, diagnostics, context);
      case ColladaPackage.LIGHT_QUADRATIC_ATTENUATION_TYPE1:
        return validateLightQuadraticAttenuationType1((LightQuadraticAttenuationType1)value, diagnostics, context);
      case ColladaPackage.LIGHT_SPECULAR_TYPE:
        return validateLightSpecularType((LightSpecularType)value, diagnostics, context);
      case ColladaPackage.LIGHT_SPECULAR_TYPE1:
        return validateLightSpecularType1((LightSpecularType1)value, diagnostics, context);
      case ColladaPackage.LIGHT_SPOT_CUTOFF_TYPE:
        return validateLightSpotCutoffType((LightSpotCutoffType)value, diagnostics, context);
      case ColladaPackage.LIGHT_SPOT_CUTOFF_TYPE1:
        return validateLightSpotCutoffType1((LightSpotCutoffType1)value, diagnostics, context);
      case ColladaPackage.LIGHT_SPOT_DIRECTION_TYPE:
        return validateLightSpotDirectionType((LightSpotDirectionType)value, diagnostics, context);
      case ColladaPackage.LIGHT_SPOT_DIRECTION_TYPE1:
        return validateLightSpotDirectionType1((LightSpotDirectionType1)value, diagnostics, context);
      case ColladaPackage.LIGHT_SPOT_EXPONENT_TYPE:
        return validateLightSpotExponentType((LightSpotExponentType)value, diagnostics, context);
      case ColladaPackage.LIGHT_SPOT_EXPONENT_TYPE1:
        return validateLightSpotExponentType1((LightSpotExponentType1)value, diagnostics, context);
      case ColladaPackage.LIGHT_TYPE:
        return validateLightType((LightType)value, diagnostics, context);
      case ColladaPackage.LIMITS_TYPE:
        return validateLimitsType((LimitsType)value, diagnostics, context);
      case ColladaPackage.LINEAR_TYPE:
        return validateLinearType((LinearType)value, diagnostics, context);
      case ColladaPackage.LINEAR_TYPE1:
        return validateLinearType1((LinearType1)value, diagnostics, context);
      case ColladaPackage.LINE_SMOOTH_ENABLE_TYPE:
        return validateLineSmoothEnableType((LineSmoothEnableType)value, diagnostics, context);
      case ColladaPackage.LINE_SMOOTH_ENABLE_TYPE1:
        return validateLineSmoothEnableType1((LineSmoothEnableType1)value, diagnostics, context);
      case ColladaPackage.LINE_STIPPLE_ENABLE_TYPE:
        return validateLineStippleEnableType((LineStippleEnableType)value, diagnostics, context);
      case ColladaPackage.LINE_STIPPLE_TYPE:
        return validateLineStippleType((LineStippleType)value, diagnostics, context);
      case ColladaPackage.LINESTRIPS_TYPE:
        return validateLinestripsType((LinestripsType)value, diagnostics, context);
      case ColladaPackage.LINES_TYPE:
        return validateLinesType((LinesType)value, diagnostics, context);
      case ColladaPackage.LINE_WIDTH_TYPE:
        return validateLineWidthType((LineWidthType)value, diagnostics, context);
      case ColladaPackage.LINE_WIDTH_TYPE1:
        return validateLineWidthType1((LineWidthType1)value, diagnostics, context);
      case ColladaPackage.LOGIC_OP_ENABLE_TYPE:
        return validateLogicOpEnableType((LogicOpEnableType)value, diagnostics, context);
      case ColladaPackage.LOGIC_OP_TYPE:
        return validateLogicOpType((LogicOpType)value, diagnostics, context);
      case ColladaPackage.LOGIC_OP_TYPE1:
        return validateLogicOpType1((LogicOpType1)value, diagnostics, context);
      case ColladaPackage.LOOKAT_TYPE:
        return validateLookatType((LookatType)value, diagnostics, context);
      case ColladaPackage.MASK_TYPE:
        return validateMaskType((MaskType)value, diagnostics, context);
      case ColladaPackage.MASK_TYPE1:
        return validateMaskType1((MaskType1)value, diagnostics, context);
      case ColladaPackage.MASK_TYPE2:
        return validateMaskType2((MaskType2)value, diagnostics, context);
      case ColladaPackage.MASK_TYPE3:
        return validateMaskType3((MaskType3)value, diagnostics, context);
      case ColladaPackage.MASS_FRAME_TYPE:
        return validateMassFrameType((MassFrameType)value, diagnostics, context);
      case ColladaPackage.MASS_FRAME_TYPE1:
        return validateMassFrameType1((MassFrameType1)value, diagnostics, context);
      case ColladaPackage.MATERIAL_AMBIENT_TYPE:
        return validateMaterialAmbientType((MaterialAmbientType)value, diagnostics, context);
      case ColladaPackage.MATERIAL_AMBIENT_TYPE1:
        return validateMaterialAmbientType1((MaterialAmbientType1)value, diagnostics, context);
      case ColladaPackage.MATERIAL_DIFFUSE_TYPE:
        return validateMaterialDiffuseType((MaterialDiffuseType)value, diagnostics, context);
      case ColladaPackage.MATERIAL_DIFFUSE_TYPE1:
        return validateMaterialDiffuseType1((MaterialDiffuseType1)value, diagnostics, context);
      case ColladaPackage.MATERIAL_EMISSION_TYPE:
        return validateMaterialEmissionType((MaterialEmissionType)value, diagnostics, context);
      case ColladaPackage.MATERIAL_EMISSION_TYPE1:
        return validateMaterialEmissionType1((MaterialEmissionType1)value, diagnostics, context);
      case ColladaPackage.MATERIAL_SHININESS_TYPE:
        return validateMaterialShininessType((MaterialShininessType)value, diagnostics, context);
      case ColladaPackage.MATERIAL_SHININESS_TYPE1:
        return validateMaterialShininessType1((MaterialShininessType1)value, diagnostics, context);
      case ColladaPackage.MATERIAL_SPECULAR_TYPE:
        return validateMaterialSpecularType((MaterialSpecularType)value, diagnostics, context);
      case ColladaPackage.MATERIAL_SPECULAR_TYPE1:
        return validateMaterialSpecularType1((MaterialSpecularType1)value, diagnostics, context);
      case ColladaPackage.MATERIAL_TYPE:
        return validateMaterialType((MaterialType)value, diagnostics, context);
      case ColladaPackage.MATRIX_TYPE:
        return validateMatrixType((MatrixType)value, diagnostics, context);
      case ColladaPackage.MESH_TYPE:
        return validateMeshType((MeshType)value, diagnostics, context);
      case ColladaPackage.MODEL_VIEW_MATRIX_TYPE:
        return validateModelViewMatrixType((ModelViewMatrixType)value, diagnostics, context);
      case ColladaPackage.MODEL_VIEW_MATRIX_TYPE1:
        return validateModelViewMatrixType1((ModelViewMatrixType1)value, diagnostics, context);
      case ColladaPackage.MODE_TYPE:
        return validateModeType((ModeType)value, diagnostics, context);
      case ColladaPackage.MODE_TYPE1:
        return validateModeType1((ModeType1)value, diagnostics, context);
      case ColladaPackage.MORPH_TYPE:
        return validateMorphType((MorphType)value, diagnostics, context);
      case ColladaPackage.MULTISAMPLE_ENABLE_TYPE:
        return validateMultisampleEnableType((MultisampleEnableType)value, diagnostics, context);
      case ColladaPackage.MULTISAMPLE_ENABLE_TYPE1:
        return validateMultisampleEnableType1((MultisampleEnableType1)value, diagnostics, context);
      case ColladaPackage.NAME_ARRAY_TYPE:
        return validateNameArrayType((NameArrayType)value, diagnostics, context);
      case ColladaPackage.NAME_TYPE:
        return validateNameType((NameType)value, diagnostics, context);
      case ColladaPackage.NAME_TYPE1:
        return validateNameType1((NameType1)value, diagnostics, context);
      case ColladaPackage.NAME_TYPE2:
        return validateNameType2((NameType2)value, diagnostics, context);
      case ColladaPackage.NAME_TYPE3:
        return validateNameType3((NameType3)value, diagnostics, context);
      case ColladaPackage.NODE_TYPE1:
        return validateNodeType1((NodeType1)value, diagnostics, context);
      case ColladaPackage.NORMALIZE_ENABLE_TYPE:
        return validateNormalizeEnableType((NormalizeEnableType)value, diagnostics, context);
      case ColladaPackage.NORMALIZE_ENABLE_TYPE1:
        return validateNormalizeEnableType1((NormalizeEnableType1)value, diagnostics, context);
      case ColladaPackage.OPTICS_TYPE:
        return validateOpticsType((OpticsType)value, diagnostics, context);
      case ColladaPackage.ORTHOGRAPHIC_TYPE:
        return validateOrthographicType((OrthographicType)value, diagnostics, context);
      case ColladaPackage.PARAM_TYPE:
        return validateParamType((ParamType)value, diagnostics, context);
      case ColladaPackage.PARAM_TYPE1:
        return validateParamType1((ParamType1)value, diagnostics, context);
      case ColladaPackage.PARAM_TYPE2:
        return validateParamType2((ParamType2)value, diagnostics, context);
      case ColladaPackage.PARAM_TYPE3:
        return validateParamType3((ParamType3)value, diagnostics, context);
      case ColladaPackage.PARAM_TYPE4:
        return validateParamType4((ParamType4)value, diagnostics, context);
      case ColladaPackage.PASS_TYPE:
        return validatePassType((PassType)value, diagnostics, context);
      case ColladaPackage.PASS_TYPE1:
        return validatePassType1((PassType1)value, diagnostics, context);
      case ColladaPackage.PASS_TYPE2:
        return validatePassType2((PassType2)value, diagnostics, context);
      case ColladaPackage.PERSPECTIVE_TYPE:
        return validatePerspectiveType((PerspectiveType)value, diagnostics, context);
      case ColladaPackage.PHONG_TYPE:
        return validatePhongType((PhongType)value, diagnostics, context);
      case ColladaPackage.PH_TYPE:
        return validatePhType((PhType)value, diagnostics, context);
      case ColladaPackage.PHYSICS_MATERIAL_TYPE:
        return validatePhysicsMaterialType((PhysicsMaterialType)value, diagnostics, context);
      case ColladaPackage.PHYSICS_MODEL_TYPE:
        return validatePhysicsModelType((PhysicsModelType)value, diagnostics, context);
      case ColladaPackage.PHYSICS_SCENE_TYPE:
        return validatePhysicsSceneType((PhysicsSceneType)value, diagnostics, context);
      case ColladaPackage.PLANE_TYPE:
        return validatePlaneType((PlaneType)value, diagnostics, context);
      case ColladaPackage.POINT_DISTANCE_ATTENUATION_TYPE:
        return validatePointDistanceAttenuationType((PointDistanceAttenuationType)value, diagnostics, context);
      case ColladaPackage.POINT_DISTANCE_ATTENUATION_TYPE1:
        return validatePointDistanceAttenuationType1((PointDistanceAttenuationType1)value, diagnostics, context);
      case ColladaPackage.POINT_FADE_THRESHOLD_SIZE_TYPE:
        return validatePointFadeThresholdSizeType((PointFadeThresholdSizeType)value, diagnostics, context);
      case ColladaPackage.POINT_FADE_THRESHOLD_SIZE_TYPE1:
        return validatePointFadeThresholdSizeType1((PointFadeThresholdSizeType1)value, diagnostics, context);
      case ColladaPackage.POINT_SIZE_MAX_TYPE:
        return validatePointSizeMaxType((PointSizeMaxType)value, diagnostics, context);
      case ColladaPackage.POINT_SIZE_MAX_TYPE1:
        return validatePointSizeMaxType1((PointSizeMaxType1)value, diagnostics, context);
      case ColladaPackage.POINT_SIZE_MIN_TYPE:
        return validatePointSizeMinType((PointSizeMinType)value, diagnostics, context);
      case ColladaPackage.POINT_SIZE_MIN_TYPE1:
        return validatePointSizeMinType1((PointSizeMinType1)value, diagnostics, context);
      case ColladaPackage.POINT_SIZE_TYPE:
        return validatePointSizeType((PointSizeType)value, diagnostics, context);
      case ColladaPackage.POINT_SIZE_TYPE1:
        return validatePointSizeType1((PointSizeType1)value, diagnostics, context);
      case ColladaPackage.POINT_SMOOTH_ENABLE_TYPE:
        return validatePointSmoothEnableType((PointSmoothEnableType)value, diagnostics, context);
      case ColladaPackage.POINT_SMOOTH_ENABLE_TYPE1:
        return validatePointSmoothEnableType1((PointSmoothEnableType1)value, diagnostics, context);
      case ColladaPackage.POINT_TYPE:
        return validatePointType((PointType)value, diagnostics, context);
      case ColladaPackage.POLYGON_MODE_TYPE:
        return validatePolygonModeType((PolygonModeType)value, diagnostics, context);
      case ColladaPackage.POLYGON_OFFSET_FILL_ENABLE_TYPE:
        return validatePolygonOffsetFillEnableType((PolygonOffsetFillEnableType)value, diagnostics, context);
      case ColladaPackage.POLYGON_OFFSET_FILL_ENABLE_TYPE1:
        return validatePolygonOffsetFillEnableType1((PolygonOffsetFillEnableType1)value, diagnostics, context);
      case ColladaPackage.POLYGON_OFFSET_LINE_ENABLE_TYPE:
        return validatePolygonOffsetLineEnableType((PolygonOffsetLineEnableType)value, diagnostics, context);
      case ColladaPackage.POLYGON_OFFSET_POINT_ENABLE_TYPE:
        return validatePolygonOffsetPointEnableType((PolygonOffsetPointEnableType)value, diagnostics, context);
      case ColladaPackage.POLYGON_OFFSET_TYPE:
        return validatePolygonOffsetType((PolygonOffsetType)value, diagnostics, context);
      case ColladaPackage.POLYGON_OFFSET_TYPE1:
        return validatePolygonOffsetType1((PolygonOffsetType1)value, diagnostics, context);
      case ColladaPackage.POLYGON_SMOOTH_ENABLE_TYPE:
        return validatePolygonSmoothEnableType((PolygonSmoothEnableType)value, diagnostics, context);
      case ColladaPackage.POLYGON_STIPPLE_ENABLE_TYPE:
        return validatePolygonStippleEnableType((PolygonStippleEnableType)value, diagnostics, context);
      case ColladaPackage.POLYGONS_TYPE:
        return validatePolygonsType((PolygonsType)value, diagnostics, context);
      case ColladaPackage.POLYLIST_TYPE:
        return validatePolylistType((PolylistType)value, diagnostics, context);
      case ColladaPackage.PRIMARY_TYPE:
        return validatePrimaryType((PrimaryType)value, diagnostics, context);
      case ColladaPackage.PRIMARY_TYPE1:
        return validatePrimaryType1((PrimaryType1)value, diagnostics, context);
      case ColladaPackage.PROFILE_CG_TYPE:
        return validateProfileCGType((ProfileCGType)value, diagnostics, context);
      case ColladaPackage.PROFILE_COMMON_TYPE:
        return validateProfileCOMMONType((ProfileCOMMONType)value, diagnostics, context);
      case ColladaPackage.PROFILE_GLES_TYPE:
        return validateProfileGLESType((ProfileGLESType)value, diagnostics, context);
      case ColladaPackage.PROFILE_GLSL_TYPE:
        return validateProfileGLSLType((ProfileGLSLType)value, diagnostics, context);
      case ColladaPackage.PROJECTION_MATRIX_TYPE:
        return validateProjectionMatrixType((ProjectionMatrixType)value, diagnostics, context);
      case ColladaPackage.PROJECTION_MATRIX_TYPE1:
        return validateProjectionMatrixType1((ProjectionMatrixType1)value, diagnostics, context);
      case ColladaPackage.REF_ATTACHMENT_TYPE:
        return validateRefAttachmentType((RefAttachmentType)value, diagnostics, context);
      case ColladaPackage.REF_TYPE:
        return validateRefType((RefType)value, diagnostics, context);
      case ColladaPackage.REF_TYPE1:
        return validateRefType1((RefType1)value, diagnostics, context);
      case ColladaPackage.REF_TYPE2:
        return validateRefType2((RefType2)value, diagnostics, context);
      case ColladaPackage.RENDER_TYPE:
        return validateRenderType((RenderType)value, diagnostics, context);
      case ColladaPackage.RESCALE_NORMAL_ENABLE_TYPE:
        return validateRescaleNormalEnableType((RescaleNormalEnableType)value, diagnostics, context);
      case ColladaPackage.RESCALE_NORMAL_ENABLE_TYPE1:
        return validateRescaleNormalEnableType1((RescaleNormalEnableType1)value, diagnostics, context);
      case ColladaPackage.RGB_TYPE:
        return validateRgbType((RgbType)value, diagnostics, context);
      case ColladaPackage.RIGID_BODY_TYPE:
        return validateRigidBodyType((RigidBodyType)value, diagnostics, context);
      case ColladaPackage.RIGID_CONSTRAINT_TYPE:
        return validateRigidConstraintType((RigidConstraintType)value, diagnostics, context);
      case ColladaPackage.ROTATE_TYPE:
        return validateRotateType((RotateType)value, diagnostics, context);
      case ColladaPackage.SAMPLE_ALPHA_TO_COVERAGE_ENABLE_TYPE:
        return validateSampleAlphaToCoverageEnableType((SampleAlphaToCoverageEnableType)value, diagnostics, context);
      case ColladaPackage.SAMPLE_ALPHA_TO_COVERAGE_ENABLE_TYPE1:
        return validateSampleAlphaToCoverageEnableType1((SampleAlphaToCoverageEnableType1)value, diagnostics, context);
      case ColladaPackage.SAMPLE_ALPHA_TO_ONE_ENABLE_TYPE:
        return validateSampleAlphaToOneEnableType((SampleAlphaToOneEnableType)value, diagnostics, context);
      case ColladaPackage.SAMPLE_ALPHA_TO_ONE_ENABLE_TYPE1:
        return validateSampleAlphaToOneEnableType1((SampleAlphaToOneEnableType1)value, diagnostics, context);
      case ColladaPackage.SAMPLE_COVERAGE_ENABLE_TYPE:
        return validateSampleCoverageEnableType((SampleCoverageEnableType)value, diagnostics, context);
      case ColladaPackage.SAMPLE_COVERAGE_ENABLE_TYPE1:
        return validateSampleCoverageEnableType1((SampleCoverageEnableType1)value, diagnostics, context);
      case ColladaPackage.SAMPLER_TYPE:
        return validateSamplerType((SamplerType)value, diagnostics, context);
      case ColladaPackage.SCENE_TYPE:
        return validateSceneType((SceneType)value, diagnostics, context);
      case ColladaPackage.SCISSOR_TEST_ENABLE_TYPE:
        return validateScissorTestEnableType((ScissorTestEnableType)value, diagnostics, context);
      case ColladaPackage.SCISSOR_TEST_ENABLE_TYPE1:
        return validateScissorTestEnableType1((ScissorTestEnableType1)value, diagnostics, context);
      case ColladaPackage.SCISSOR_TYPE:
        return validateScissorType((ScissorType)value, diagnostics, context);
      case ColladaPackage.SCISSOR_TYPE1:
        return validateScissorType1((ScissorType1)value, diagnostics, context);
      case ColladaPackage.SETPARAM_TYPE:
        return validateSetparamType((SetparamType)value, diagnostics, context);
      case ColladaPackage.SETPARAM_TYPE1:
        return validateSetparamType1((SetparamType1)value, diagnostics, context);
      case ColladaPackage.SHADE_MODEL_TYPE:
        return validateShadeModelType((ShadeModelType)value, diagnostics, context);
      case ColladaPackage.SHADE_MODEL_TYPE1:
        return validateShadeModelType1((ShadeModelType1)value, diagnostics, context);
      case ColladaPackage.SHADER_TYPE:
        return validateShaderType((ShaderType)value, diagnostics, context);
      case ColladaPackage.SHADER_TYPE1:
        return validateShaderType1((ShaderType1)value, diagnostics, context);
      case ColladaPackage.SHAPE_TYPE:
        return validateShapeType((ShapeType)value, diagnostics, context);
      case ColladaPackage.SHAPE_TYPE1:
        return validateShapeType1((ShapeType1)value, diagnostics, context);
      case ColladaPackage.SKEW_TYPE:
        return validateSkewType((SkewType)value, diagnostics, context);
      case ColladaPackage.SKIN_TYPE:
        return validateSkinType((SkinType)value, diagnostics, context);
      case ColladaPackage.SOURCE_TYPE:
        return validateSourceType((SourceType)value, diagnostics, context);
      case ColladaPackage.SPHERE_TYPE:
        return validateSphereType((SphereType)value, diagnostics, context);
      case ColladaPackage.SPLINE_TYPE:
        return validateSplineType((SplineType)value, diagnostics, context);
      case ColladaPackage.SPOT_TYPE:
        return validateSpotType((SpotType)value, diagnostics, context);
      case ColladaPackage.SPRING_TYPE1:
        return validateSpringType1((SpringType1)value, diagnostics, context);
      case ColladaPackage.SRC_ALPHA_TYPE:
        return validateSrcAlphaType((SrcAlphaType)value, diagnostics, context);
      case ColladaPackage.SRC_RGB_TYPE:
        return validateSrcRgbType((SrcRgbType)value, diagnostics, context);
      case ColladaPackage.SRC_TYPE:
        return validateSrcType((SrcType)value, diagnostics, context);
      case ColladaPackage.SRC_TYPE1:
        return validateSrcType1((SrcType1)value, diagnostics, context);
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE:
        return validateStencilFuncSeparateType((StencilFuncSeparateType)value, diagnostics, context);
      case ColladaPackage.STENCIL_FUNC_TYPE:
        return validateStencilFuncType((StencilFuncType)value, diagnostics, context);
      case ColladaPackage.STENCIL_FUNC_TYPE1:
        return validateStencilFuncType1((StencilFuncType1)value, diagnostics, context);
      case ColladaPackage.STENCIL_MASK_SEPARATE_TYPE:
        return validateStencilMaskSeparateType((StencilMaskSeparateType)value, diagnostics, context);
      case ColladaPackage.STENCIL_MASK_TYPE:
        return validateStencilMaskType((StencilMaskType)value, diagnostics, context);
      case ColladaPackage.STENCIL_MASK_TYPE1:
        return validateStencilMaskType1((StencilMaskType1)value, diagnostics, context);
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE:
        return validateStencilOpSeparateType((StencilOpSeparateType)value, diagnostics, context);
      case ColladaPackage.STENCIL_OP_TYPE:
        return validateStencilOpType((StencilOpType)value, diagnostics, context);
      case ColladaPackage.STENCIL_OP_TYPE1:
        return validateStencilOpType1((StencilOpType1)value, diagnostics, context);
      case ColladaPackage.STENCIL_TEST_ENABLE_TYPE:
        return validateStencilTestEnableType((StencilTestEnableType)value, diagnostics, context);
      case ColladaPackage.STENCIL_TEST_ENABLE_TYPE1:
        return validateStencilTestEnableType1((StencilTestEnableType1)value, diagnostics, context);
      case ColladaPackage.SWING_CONE_AND_TWIST_TYPE:
        return validateSwingConeAndTwistType((SwingConeAndTwistType)value, diagnostics, context);
      case ColladaPackage.TAPERED_CAPSULE_TYPE:
        return validateTaperedCapsuleType((TaperedCapsuleType)value, diagnostics, context);
      case ColladaPackage.TAPERED_CYLINDER_TYPE:
        return validateTaperedCylinderType((TaperedCylinderType)value, diagnostics, context);
      case ColladaPackage.TARGETABLE_FLOAT:
        return validateTargetableFloat((TargetableFloat)value, diagnostics, context);
      case ColladaPackage.TARGETABLE_FLOAT3:
        return validateTargetableFloat3((TargetableFloat3)value, diagnostics, context);
      case ColladaPackage.TARGETS_TYPE:
        return validateTargetsType((TargetsType)value, diagnostics, context);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE:
        return validateTechniqueCommonType((TechniqueCommonType)value, diagnostics, context);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1:
        return validateTechniqueCommonType1((TechniqueCommonType1)value, diagnostics, context);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE2:
        return validateTechniqueCommonType2((TechniqueCommonType2)value, diagnostics, context);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3:
        return validateTechniqueCommonType3((TechniqueCommonType3)value, diagnostics, context);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4:
        return validateTechniqueCommonType4((TechniqueCommonType4)value, diagnostics, context);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE5:
        return validateTechniqueCommonType5((TechniqueCommonType5)value, diagnostics, context);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6:
        return validateTechniqueCommonType6((TechniqueCommonType6)value, diagnostics, context);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE7:
        return validateTechniqueCommonType7((TechniqueCommonType7)value, diagnostics, context);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE8:
        return validateTechniqueCommonType8((TechniqueCommonType8)value, diagnostics, context);
      case ColladaPackage.TECHNIQUE_HINT_TYPE:
        return validateTechniqueHintType((TechniqueHintType)value, diagnostics, context);
      case ColladaPackage.TECHNIQUE_TYPE:
        return validateTechniqueType((TechniqueType)value, diagnostics, context);
      case ColladaPackage.TECHNIQUE_TYPE1:
        return validateTechniqueType1((TechniqueType1)value, diagnostics, context);
      case ColladaPackage.TECHNIQUE_TYPE2:
        return validateTechniqueType2((TechniqueType2)value, diagnostics, context);
      case ColladaPackage.TECHNIQUE_TYPE3:
        return validateTechniqueType3((TechniqueType3)value, diagnostics, context);
      case ColladaPackage.TECHNIQUE_TYPE4:
        return validateTechniqueType4((TechniqueType4)value, diagnostics, context);
      case ColladaPackage.TEXCOORD_TYPE:
        return validateTexcoordType((TexcoordType)value, diagnostics, context);
      case ColladaPackage.TEXTURE1_DENABLE_TYPE:
        return validateTexture1DEnableType((Texture1DEnableType)value, diagnostics, context);
      case ColladaPackage.TEXTURE1_DTYPE:
        return validateTexture1DType((Texture1DType)value, diagnostics, context);
      case ColladaPackage.TEXTURE2_DENABLE_TYPE:
        return validateTexture2DEnableType((Texture2DEnableType)value, diagnostics, context);
      case ColladaPackage.TEXTURE2_DTYPE:
        return validateTexture2DType((Texture2DType)value, diagnostics, context);
      case ColladaPackage.TEXTURE3_DENABLE_TYPE:
        return validateTexture3DEnableType((Texture3DEnableType)value, diagnostics, context);
      case ColladaPackage.TEXTURE3_DTYPE:
        return validateTexture3DType((Texture3DType)value, diagnostics, context);
      case ColladaPackage.TEXTURE_CUBE_ENABLE_TYPE:
        return validateTextureCUBEEnableType((TextureCUBEEnableType)value, diagnostics, context);
      case ColladaPackage.TEXTURE_CUBE_TYPE:
        return validateTextureCUBEType((TextureCUBEType)value, diagnostics, context);
      case ColladaPackage.TEXTURE_DEPTH_ENABLE_TYPE:
        return validateTextureDEPTHEnableType((TextureDEPTHEnableType)value, diagnostics, context);
      case ColladaPackage.TEXTURE_DEPTH_TYPE:
        return validateTextureDEPTHType((TextureDEPTHType)value, diagnostics, context);
      case ColladaPackage.TEXTURE_ENV_COLOR_TYPE:
        return validateTextureEnvColorType((TextureEnvColorType)value, diagnostics, context);
      case ColladaPackage.TEXTURE_ENV_MODE_TYPE:
        return validateTextureEnvModeType((TextureEnvModeType)value, diagnostics, context);
      case ColladaPackage.TEXTURE_PIPELINE_ENABLE_TYPE:
        return validateTexturePipelineEnableType((TexturePipelineEnableType)value, diagnostics, context);
      case ColladaPackage.TEXTURE_PIPELINE_TYPE:
        return validateTexturePipelineType((TexturePipelineType)value, diagnostics, context);
      case ColladaPackage.TEXTURE_RECT_ENABLE_TYPE:
        return validateTextureRECTEnableType((TextureRECTEnableType)value, diagnostics, context);
      case ColladaPackage.TEXTURE_RECT_TYPE:
        return validateTextureRECTType((TextureRECTType)value, diagnostics, context);
      case ColladaPackage.TEXTURE_TYPE:
        return validateTextureType((TextureType)value, diagnostics, context);
      case ColladaPackage.TRIANGLES_TYPE:
        return validateTrianglesType((TrianglesType)value, diagnostics, context);
      case ColladaPackage.TRIFANS_TYPE:
        return validateTrifansType((TrifansType)value, diagnostics, context);
      case ColladaPackage.TRISTRIPS_TYPE:
        return validateTristripsType((TristripsType)value, diagnostics, context);
      case ColladaPackage.UNIT_TYPE:
        return validateUnitType((UnitType)value, diagnostics, context);
      case ColladaPackage.VALUE_TYPE:
        return validateValueType((ValueType)value, diagnostics, context);
      case ColladaPackage.VALUE_TYPE1:
        return validateValueType1((ValueType1)value, diagnostics, context);
      case ColladaPackage.VERTEX_WEIGHTS_TYPE:
        return validateVertexWeightsType((VertexWeightsType)value, diagnostics, context);
      case ColladaPackage.VERTICES_TYPE:
        return validateVerticesType((VerticesType)value, diagnostics, context);
      case ColladaPackage.VISUAL_SCENE_TYPE:
        return validateVisualSceneType((VisualSceneType)value, diagnostics, context);
      case ColladaPackage.ZFAIL_TYPE:
        return validateZfailType((ZfailType)value, diagnostics, context);
      case ColladaPackage.ZFAIL_TYPE1:
        return validateZfailType1((ZfailType1)value, diagnostics, context);
      case ColladaPackage.ZFAIL_TYPE2:
        return validateZfailType2((ZfailType2)value, diagnostics, context);
      case ColladaPackage.ZPASS_TYPE:
        return validateZpassType((ZpassType)value, diagnostics, context);
      case ColladaPackage.ZPASS_TYPE1:
        return validateZpassType1((ZpassType1)value, diagnostics, context);
      case ColladaPackage.ZPASS_TYPE2:
        return validateZpassType2((ZpassType2)value, diagnostics, context);
      case ColladaPackage.CG_PIPELINE_STAGE:
        return validateCgPipelineStage((CgPipelineStage)value, diagnostics, context);
      case ColladaPackage.COMMON_PROFILE_INPUT:
        return validateCommonProfileInput((CommonProfileInput)value, diagnostics, context);
      case ColladaPackage.COMMON_PROFILE_PARAM:
        return validateCommonProfileParam((CommonProfileParam)value, diagnostics, context);
      case ColladaPackage.FX_MODIFIER_ENUM_COMMON:
        return validateFxModifierEnumCommon((FxModifierEnumCommon)value, diagnostics, context);
      case ColladaPackage.FX_OPAQUE_ENUM:
        return validateFxOpaqueEnum((FxOpaqueEnum)value, diagnostics, context);
      case ColladaPackage.FX_PIPELINE_STAGE_COMMON:
        return validateFxPipelineStageCommon((FxPipelineStageCommon)value, diagnostics, context);
      case ColladaPackage.FX_SAMPLER_FILTER_COMMON:
        return validateFxSamplerFilterCommon((FxSamplerFilterCommon)value, diagnostics, context);
      case ColladaPackage.FX_SAMPLER_WRAP_COMMON:
        return validateFxSamplerWrapCommon((FxSamplerWrapCommon)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_FACE_ENUM:
        return validateFxSurfaceFaceEnum((FxSurfaceFaceEnum)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_CHANNELS_ENUM:
        return validateFxSurfaceFormatHintChannelsEnum((FxSurfaceFormatHintChannelsEnum)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_OPTION_ENUM:
        return validateFxSurfaceFormatHintOptionEnum((FxSurfaceFormatHintOptionEnum)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_PRECISION_ENUM:
        return validateFxSurfaceFormatHintPrecisionEnum((FxSurfaceFormatHintPrecisionEnum)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_RANGE_ENUM:
        return validateFxSurfaceFormatHintRangeEnum((FxSurfaceFormatHintRangeEnum)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_TYPE_ENUM:
        return validateFxSurfaceTypeEnum((FxSurfaceTypeEnum)value, diagnostics, context);
      case ColladaPackage.GL_BLEND_EQUATION_TYPE:
        return validateGlBlendEquationType((GlBlendEquationType)value, diagnostics, context);
      case ColladaPackage.GL_BLEND_TYPE:
        return validateGlBlendType((GlBlendType)value, diagnostics, context);
      case ColladaPackage.GLES_SAMPLER_WRAP:
        return validateGlesSamplerWrap((GlesSamplerWrap)value, diagnostics, context);
      case ColladaPackage.GLES_STENCIL_OP_TYPE:
        return validateGlesStencilOpType((GlesStencilOpType)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_OPERAND_ALPHA_ENUMS:
        return validateGlesTexcombinerOperandAlphaEnums((GlesTexcombinerOperandAlphaEnums)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_OPERAND_RGB_ENUMS:
        return validateGlesTexcombinerOperandRGBEnums((GlesTexcombinerOperandRGBEnums)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_OPERATOR_ALPHA_ENUMS:
        return validateGlesTexcombinerOperatorAlphaEnums((GlesTexcombinerOperatorAlphaEnums)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_OPERATOR_RGB_ENUMS:
        return validateGlesTexcombinerOperatorRGBEnums((GlesTexcombinerOperatorRGBEnums)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_SOURCE_ENUMS:
        return validateGlesTexcombinerSourceEnums((GlesTexcombinerSourceEnums)value, diagnostics, context);
      case ColladaPackage.GLES_TEXENV_MODE_ENUMS:
        return validateGlesTexenvModeEnums((GlesTexenvModeEnums)value, diagnostics, context);
      case ColladaPackage.GL_FACE_TYPE:
        return validateGlFaceType((GlFaceType)value, diagnostics, context);
      case ColladaPackage.GL_FOG_COORD_SRC_TYPE:
        return validateGlFogCoordSrcType((GlFogCoordSrcType)value, diagnostics, context);
      case ColladaPackage.GL_FOG_TYPE:
        return validateGlFogType((GlFogType)value, diagnostics, context);
      case ColladaPackage.GL_FRONT_FACE_TYPE:
        return validateGlFrontFaceType((GlFrontFaceType)value, diagnostics, context);
      case ColladaPackage.GL_FUNC_TYPE:
        return validateGlFuncType((GlFuncType)value, diagnostics, context);
      case ColladaPackage.GL_LIGHT_MODEL_COLOR_CONTROL_TYPE:
        return validateGlLightModelColorControlType((GlLightModelColorControlType)value, diagnostics, context);
      case ColladaPackage.GL_LOGIC_OP_TYPE:
        return validateGlLogicOpType((GlLogicOpType)value, diagnostics, context);
      case ColladaPackage.GL_MATERIAL_TYPE:
        return validateGlMaterialType((GlMaterialType)value, diagnostics, context);
      case ColladaPackage.GL_POLYGON_MODE_TYPE:
        return validateGlPolygonModeType((GlPolygonModeType)value, diagnostics, context);
      case ColladaPackage.GL_SHADE_MODEL_TYPE:
        return validateGlShadeModelType((GlShadeModelType)value, diagnostics, context);
      case ColladaPackage.GLSL_PIPELINE_STAGE:
        return validateGlslPipelineStage((GlslPipelineStage)value, diagnostics, context);
      case ColladaPackage.GL_STENCIL_OP_TYPE:
        return validateGlStencilOpType((GlStencilOpType)value, diagnostics, context);
      case ColladaPackage.MORPH_METHOD_TYPE:
        return validateMorphMethodType((MorphMethodType)value, diagnostics, context);
      case ColladaPackage.NODE_TYPE:
        return validateNodeType((NodeType)value, diagnostics, context);
      case ColladaPackage.SPRING_TYPE:
        return validateSpringType((SpringType)value, diagnostics, context);
      case ColladaPackage.UP_AXIS_TYPE:
        return validateUpAxisType((UpAxisType)value, diagnostics, context);
      case ColladaPackage.VERSION_TYPE:
        return validateVersionType((VersionType)value, diagnostics, context);
      case ColladaPackage.BOOL:
        return validateBool((Boolean)value, diagnostics, context);
      case ColladaPackage.BOOL2:
        return validateBool2((List<?>)value, diagnostics, context);
      case ColladaPackage.BOOL3:
        return validateBool3((List<?>)value, diagnostics, context);
      case ColladaPackage.BOOL4:
        return validateBool4((List<?>)value, diagnostics, context);
      case ColladaPackage.BOOL_OBJECT:
        return validateBoolObject((Boolean)value, diagnostics, context);
      case ColladaPackage.CG_BOOL:
        return validateCgBool((Boolean)value, diagnostics, context);
      case ColladaPackage.CG_BOOL1:
        return validateCgBool1((Boolean)value, diagnostics, context);
      case ColladaPackage.CG_BOOL1_OBJECT:
        return validateCgBool1Object((Boolean)value, diagnostics, context);
      case ColladaPackage.CG_BOOL1X1:
        return validateCgBool1x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL1X2:
        return validateCgBool1x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL1X3:
        return validateCgBool1x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL1X4:
        return validateCgBool1x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL2:
        return validateCgBool2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL2X1:
        return validateCgBool2x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL2X2:
        return validateCgBool2x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL2X3:
        return validateCgBool2x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL2X4:
        return validateCgBool2x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL3:
        return validateCgBool3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL3X1:
        return validateCgBool3x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL3X2:
        return validateCgBool3x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL3X3:
        return validateCgBool3x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL3X4:
        return validateCgBool3x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL4:
        return validateCgBool4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL4X1:
        return validateCgBool4x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL4X2:
        return validateCgBool4x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL4X3:
        return validateCgBool4x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL4X4:
        return validateCgBool4x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_BOOL_OBJECT:
        return validateCgBoolObject((Boolean)value, diagnostics, context);
      case ColladaPackage.CG_FIXED:
        return validateCgFixed((Float)value, diagnostics, context);
      case ColladaPackage.CG_FIXED1:
        return validateCgFixed1((Float)value, diagnostics, context);
      case ColladaPackage.CG_FIXED1_OBJECT:
        return validateCgFixed1Object((Float)value, diagnostics, context);
      case ColladaPackage.CG_FIXED1X1:
        return validateCgFixed1x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED1X2:
        return validateCgFixed1x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED1X3:
        return validateCgFixed1x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED1X4:
        return validateCgFixed1x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED2:
        return validateCgFixed2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED2X1:
        return validateCgFixed2x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED2X2:
        return validateCgFixed2x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED2X3:
        return validateCgFixed2x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED2X4:
        return validateCgFixed2x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED3:
        return validateCgFixed3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED3X1:
        return validateCgFixed3x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED3X2:
        return validateCgFixed3x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED3X3:
        return validateCgFixed3x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED3X4:
        return validateCgFixed3x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED4:
        return validateCgFixed4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED4X1:
        return validateCgFixed4x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED4X2:
        return validateCgFixed4x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED4X3:
        return validateCgFixed4x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED4X4:
        return validateCgFixed4x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FIXED_OBJECT:
        return validateCgFixedObject((Float)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT:
        return validateCgFloat((Float)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT1:
        return validateCgFloat1((Float)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT1_OBJECT:
        return validateCgFloat1Object((Float)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT1X1:
        return validateCgFloat1x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT1X2:
        return validateCgFloat1x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT1X3:
        return validateCgFloat1x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT1X4:
        return validateCgFloat1x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT2:
        return validateCgFloat2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT2X1:
        return validateCgFloat2x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT2X2:
        return validateCgFloat2x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT2X3:
        return validateCgFloat2x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT2X4:
        return validateCgFloat2x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT3:
        return validateCgFloat3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT3X1:
        return validateCgFloat3x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT3X2:
        return validateCgFloat3x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT3X3:
        return validateCgFloat3x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT3X4:
        return validateCgFloat3x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT4:
        return validateCgFloat4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT4X1:
        return validateCgFloat4x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT4X2:
        return validateCgFloat4x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT4X3:
        return validateCgFloat4x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT4X4:
        return validateCgFloat4x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_FLOAT_OBJECT:
        return validateCgFloatObject((Float)value, diagnostics, context);
      case ColladaPackage.CG_HALF:
        return validateCgHalf((Float)value, diagnostics, context);
      case ColladaPackage.CG_HALF1:
        return validateCgHalf1((Float)value, diagnostics, context);
      case ColladaPackage.CG_HALF1_OBJECT:
        return validateCgHalf1Object((Float)value, diagnostics, context);
      case ColladaPackage.CG_HALF1X1:
        return validateCgHalf1x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF1X2:
        return validateCgHalf1x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF1X3:
        return validateCgHalf1x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF1X4:
        return validateCgHalf1x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF2:
        return validateCgHalf2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF2X1:
        return validateCgHalf2x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF2X2:
        return validateCgHalf2x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF2X3:
        return validateCgHalf2x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF2X4:
        return validateCgHalf2x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF3:
        return validateCgHalf3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF3X1:
        return validateCgHalf3x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF3X2:
        return validateCgHalf3x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF3X3:
        return validateCgHalf3x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF3X4:
        return validateCgHalf3x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF4:
        return validateCgHalf4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF4X1:
        return validateCgHalf4x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF4X2:
        return validateCgHalf4x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF4X3:
        return validateCgHalf4x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF4X4:
        return validateCgHalf4x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_HALF_OBJECT:
        return validateCgHalfObject((Float)value, diagnostics, context);
      case ColladaPackage.CG_IDENTIFIER:
        return validateCgIdentifier((String)value, diagnostics, context);
      case ColladaPackage.CG_INT:
        return validateCgInt((Integer)value, diagnostics, context);
      case ColladaPackage.CG_INT1:
        return validateCgInt1((Integer)value, diagnostics, context);
      case ColladaPackage.CG_INT1_OBJECT:
        return validateCgInt1Object((Integer)value, diagnostics, context);
      case ColladaPackage.CG_INT1X1:
        return validateCgInt1x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT1X2:
        return validateCgInt1x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT1X3:
        return validateCgInt1x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT1X4:
        return validateCgInt1x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT2:
        return validateCgInt2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT2X1:
        return validateCgInt2x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT2X2:
        return validateCgInt2x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT2X3:
        return validateCgInt2x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT2X4:
        return validateCgInt2x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT3:
        return validateCgInt3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT3X1:
        return validateCgInt3x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT3X2:
        return validateCgInt3x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT3X3:
        return validateCgInt3x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT3X4:
        return validateCgInt3x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT4:
        return validateCgInt4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT4X1:
        return validateCgInt4x1((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT4X2:
        return validateCgInt4x2((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT4X3:
        return validateCgInt4x3((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT4X4:
        return validateCgInt4x4((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_INT_OBJECT:
        return validateCgIntObject((Integer)value, diagnostics, context);
      case ColladaPackage.CG_LIST_OF_BOOL:
        return validateCgListOfBool((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_LIST_OF_FIXED:
        return validateCgListOfFixed((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_LIST_OF_FLOAT:
        return validateCgListOfFloat((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_LIST_OF_HALF:
        return validateCgListOfHalf((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_LIST_OF_INT:
        return validateCgListOfInt((List<?>)value, diagnostics, context);
      case ColladaPackage.CG_PIPELINE_STAGE_OBJECT:
        return validateCgPipelineStageObject((CgPipelineStage)value, diagnostics, context);
      case ColladaPackage.COMMON_PROFILE_INPUT_OBJECT:
        return validateCommonProfileInputObject((CommonProfileInput)value, diagnostics, context);
      case ColladaPackage.COMMON_PROFILE_PARAM_OBJECT:
        return validateCommonProfileParamObject((CommonProfileParam)value, diagnostics, context);
      case ColladaPackage.DATE_TIME:
        return validateDateTime((XMLGregorianCalendar)value, diagnostics, context);
      case ColladaPackage.FLOAT:
        return validateFloat((Double)value, diagnostics, context);
      case ColladaPackage.FLOAT2:
        return validateFloat2((List<?>)value, diagnostics, context);
      case ColladaPackage.FLOAT2X2:
        return validateFloat2x2((List<?>)value, diagnostics, context);
      case ColladaPackage.FLOAT2X3:
        return validateFloat2x3((List<?>)value, diagnostics, context);
      case ColladaPackage.FLOAT2X4:
        return validateFloat2x4((List<?>)value, diagnostics, context);
      case ColladaPackage.FLOAT3:
        return validateFloat3((List<?>)value, diagnostics, context);
      case ColladaPackage.FLOAT3X2:
        return validateFloat3x2((List<?>)value, diagnostics, context);
      case ColladaPackage.FLOAT3X3:
        return validateFloat3x3((List<?>)value, diagnostics, context);
      case ColladaPackage.FLOAT3X4:
        return validateFloat3x4((List<?>)value, diagnostics, context);
      case ColladaPackage.FLOAT4:
        return validateFloat4((List<?>)value, diagnostics, context);
      case ColladaPackage.FLOAT4X2:
        return validateFloat4x2((List<?>)value, diagnostics, context);
      case ColladaPackage.FLOAT4X3:
        return validateFloat4x3((List<?>)value, diagnostics, context);
      case ColladaPackage.FLOAT4X4:
        return validateFloat4x4((List<?>)value, diagnostics, context);
      case ColladaPackage.FLOAT7:
        return validateFloat7((List<?>)value, diagnostics, context);
      case ColladaPackage.FLOAT_OBJECT:
        return validateFloatObject((Double)value, diagnostics, context);
      case ColladaPackage.FX_COLOR_COMMON:
        return validateFxColorCommon((List<?>)value, diagnostics, context);
      case ColladaPackage.FX_DRAW_COMMON:
        return validateFxDrawCommon((String)value, diagnostics, context);
      case ColladaPackage.FX_MODIFIER_ENUM_COMMON_OBJECT:
        return validateFxModifierEnumCommonObject((FxModifierEnumCommon)value, diagnostics, context);
      case ColladaPackage.FX_OPAQUE_ENUM_OBJECT:
        return validateFxOpaqueEnumObject((FxOpaqueEnum)value, diagnostics, context);
      case ColladaPackage.FX_PIPELINE_STAGE_COMMON_OBJECT:
        return validateFxPipelineStageCommonObject((FxPipelineStageCommon)value, diagnostics, context);
      case ColladaPackage.FX_SAMPLER_FILTER_COMMON_OBJECT:
        return validateFxSamplerFilterCommonObject((FxSamplerFilterCommon)value, diagnostics, context);
      case ColladaPackage.FX_SAMPLER_WRAP_COMMON_OBJECT:
        return validateFxSamplerWrapCommonObject((FxSamplerWrapCommon)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_FACE_ENUM_OBJECT:
        return validateFxSurfaceFaceEnumObject((FxSurfaceFaceEnum)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_CHANNELS_ENUM_OBJECT:
        return validateFxSurfaceFormatHintChannelsEnumObject((FxSurfaceFormatHintChannelsEnum)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_OPTION_ENUM_OBJECT:
        return validateFxSurfaceFormatHintOptionEnumObject((FxSurfaceFormatHintOptionEnum)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_PRECISION_ENUM_OBJECT:
        return validateFxSurfaceFormatHintPrecisionEnumObject((FxSurfaceFormatHintPrecisionEnum)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_RANGE_ENUM_OBJECT:
        return validateFxSurfaceFormatHintRangeEnumObject((FxSurfaceFormatHintRangeEnum)value, diagnostics, context);
      case ColladaPackage.FX_SURFACE_TYPE_ENUM_OBJECT:
        return validateFxSurfaceTypeEnumObject((FxSurfaceTypeEnum)value, diagnostics, context);
      case ColladaPackage.GL_ALPHA_VALUE_TYPE:
        return validateGlAlphaValueType((Float)value, diagnostics, context);
      case ColladaPackage.GL_ALPHA_VALUE_TYPE_OBJECT:
        return validateGlAlphaValueTypeObject((Float)value, diagnostics, context);
      case ColladaPackage.GL_BLEND_EQUATION_TYPE_OBJECT:
        return validateGlBlendEquationTypeObject((GlBlendEquationType)value, diagnostics, context);
      case ColladaPackage.GL_BLEND_TYPE_OBJECT:
        return validateGlBlendTypeObject((GlBlendType)value, diagnostics, context);
      case ColladaPackage.GL_ENUMERATION:
        return validateGlEnumeration((Enumerator)value, diagnostics, context);
      case ColladaPackage.GLES_ENUMERATION:
        return validateGlesEnumeration((Enumerator)value, diagnostics, context);
      case ColladaPackage.GLESMAXCLIPPLANES_INDEX:
        return validateGLESMAXCLIPPLANESIndex((BigInteger)value, diagnostics, context);
      case ColladaPackage.GLESMAXLIGHTS_INDEX:
        return validateGLESMAXLIGHTSIndex((BigInteger)value, diagnostics, context);
      case ColladaPackage.GLESMAXTEXTURECOORDS_INDEX:
        return validateGLESMAXTEXTURECOORDSIndex((BigInteger)value, diagnostics, context);
      case ColladaPackage.GLESMAXTEXTUREIMAGEUNITS_INDEX:
        return validateGLESMAXTEXTUREIMAGEUNITSIndex((BigInteger)value, diagnostics, context);
      case ColladaPackage.GLES_RENDERTARGET_COMMON:
        return validateGlesRendertargetCommon((String)value, diagnostics, context);
      case ColladaPackage.GLES_SAMPLER_WRAP_OBJECT:
        return validateGlesSamplerWrapObject((GlesSamplerWrap)value, diagnostics, context);
      case ColladaPackage.GLES_STENCIL_OP_TYPE_OBJECT:
        return validateGlesStencilOpTypeObject((GlesStencilOpType)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_INDEX_TYPE:
        return validateGlesTexcombinerArgumentIndexType((BigInteger)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_OPERAND_ALPHA_ENUMS_OBJECT:
        return validateGlesTexcombinerOperandAlphaEnumsObject((GlesTexcombinerOperandAlphaEnums)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_OPERAND_RGB_ENUMS_OBJECT:
        return validateGlesTexcombinerOperandRGBEnumsObject((GlesTexcombinerOperandRGBEnums)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_OPERATOR_ALPHA_ENUMS_OBJECT:
        return validateGlesTexcombinerOperatorAlphaEnumsObject((GlesTexcombinerOperatorAlphaEnums)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_OPERATOR_RGB_ENUMS_OBJECT:
        return validateGlesTexcombinerOperatorRGBEnumsObject((GlesTexcombinerOperatorRGBEnums)value, diagnostics, context);
      case ColladaPackage.GLES_TEXCOMBINER_SOURCE_ENUMS_OBJECT:
        return validateGlesTexcombinerSourceEnumsObject((GlesTexcombinerSourceEnums)value, diagnostics, context);
      case ColladaPackage.GLES_TEXENV_MODE_ENUMS_OBJECT:
        return validateGlesTexenvModeEnumsObject((GlesTexenvModeEnums)value, diagnostics, context);
      case ColladaPackage.GL_FACE_TYPE_OBJECT:
        return validateGlFaceTypeObject((GlFaceType)value, diagnostics, context);
      case ColladaPackage.GL_FOG_COORD_SRC_TYPE_OBJECT:
        return validateGlFogCoordSrcTypeObject((GlFogCoordSrcType)value, diagnostics, context);
      case ColladaPackage.GL_FOG_TYPE_OBJECT:
        return validateGlFogTypeObject((GlFogType)value, diagnostics, context);
      case ColladaPackage.GL_FRONT_FACE_TYPE_OBJECT:
        return validateGlFrontFaceTypeObject((GlFrontFaceType)value, diagnostics, context);
      case ColladaPackage.GL_FUNC_TYPE_OBJECT:
        return validateGlFuncTypeObject((GlFuncType)value, diagnostics, context);
      case ColladaPackage.GL_LIGHT_MODEL_COLOR_CONTROL_TYPE_OBJECT:
        return validateGlLightModelColorControlTypeObject((GlLightModelColorControlType)value, diagnostics, context);
      case ColladaPackage.GL_LOGIC_OP_TYPE_OBJECT:
        return validateGlLogicOpTypeObject((GlLogicOpType)value, diagnostics, context);
      case ColladaPackage.GL_MATERIAL_TYPE_OBJECT:
        return validateGlMaterialTypeObject((GlMaterialType)value, diagnostics, context);
      case ColladaPackage.GLMAXCLIPPLANES_INDEX:
        return validateGLMAXCLIPPLANESIndex((BigInteger)value, diagnostics, context);
      case ColladaPackage.GLMAXLIGHTS_INDEX:
        return validateGLMAXLIGHTSIndex((BigInteger)value, diagnostics, context);
      case ColladaPackage.GLMAXTEXTUREIMAGEUNITS_INDEX:
        return validateGLMAXTEXTUREIMAGEUNITSIndex((BigInteger)value, diagnostics, context);
      case ColladaPackage.GL_POLYGON_MODE_TYPE_OBJECT:
        return validateGlPolygonModeTypeObject((GlPolygonModeType)value, diagnostics, context);
      case ColladaPackage.GL_SHADE_MODEL_TYPE_OBJECT:
        return validateGlShadeModelTypeObject((GlShadeModelType)value, diagnostics, context);
      case ColladaPackage.GLSL_BOOL:
        return validateGlslBool((Boolean)value, diagnostics, context);
      case ColladaPackage.GLSL_BOOL2:
        return validateGlslBool2((List<?>)value, diagnostics, context);
      case ColladaPackage.GLSL_BOOL3:
        return validateGlslBool3((List<?>)value, diagnostics, context);
      case ColladaPackage.GLSL_BOOL4:
        return validateGlslBool4((List<?>)value, diagnostics, context);
      case ColladaPackage.GLSL_BOOL_OBJECT:
        return validateGlslBoolObject((Boolean)value, diagnostics, context);
      case ColladaPackage.GLSL_FLOAT:
        return validateGlslFloat((Float)value, diagnostics, context);
      case ColladaPackage.GLSL_FLOAT2:
        return validateGlslFloat2((List<?>)value, diagnostics, context);
      case ColladaPackage.GLSL_FLOAT2X2:
        return validateGlslFloat2x2((List<?>)value, diagnostics, context);
      case ColladaPackage.GLSL_FLOAT3:
        return validateGlslFloat3((List<?>)value, diagnostics, context);
      case ColladaPackage.GLSL_FLOAT3X3:
        return validateGlslFloat3x3((List<?>)value, diagnostics, context);
      case ColladaPackage.GLSL_FLOAT4:
        return validateGlslFloat4((List<?>)value, diagnostics, context);
      case ColladaPackage.GLSL_FLOAT4X4:
        return validateGlslFloat4x4((List<?>)value, diagnostics, context);
      case ColladaPackage.GLSL_FLOAT_OBJECT:
        return validateGlslFloatObject((Float)value, diagnostics, context);
      case ColladaPackage.GLSL_IDENTIFIER:
        return validateGlslIdentifier((String)value, diagnostics, context);
      case ColladaPackage.GLSL_INT:
        return validateGlslInt((Integer)value, diagnostics, context);
      case ColladaPackage.GLSL_INT2:
        return validateGlslInt2((List<?>)value, diagnostics, context);
      case ColladaPackage.GLSL_INT3:
        return validateGlslInt3((List<?>)value, diagnostics, context);
      case ColladaPackage.GLSL_INT4:
        return validateGlslInt4((List<?>)value, diagnostics, context);
      case ColladaPackage.GLSL_INT_OBJECT:
        return validateGlslIntObject((Integer)value, diagnostics, context);
      case ColladaPackage.GLSL_LIST_OF_BOOL:
        return validateGlslListOfBool((List<?>)value, diagnostics, context);
      case ColladaPackage.GLSL_LIST_OF_FLOAT:
        return validateGlslListOfFloat((List<?>)value, diagnostics, context);
      case ColladaPackage.GLSL_LIST_OF_INT:
        return validateGlslListOfInt((List<?>)value, diagnostics, context);
      case ColladaPackage.GLSL_PIPELINE_STAGE_OBJECT:
        return validateGlslPipelineStageObject((GlslPipelineStage)value, diagnostics, context);
      case ColladaPackage.GL_STENCIL_OP_TYPE_OBJECT:
        return validateGlStencilOpTypeObject((GlStencilOpType)value, diagnostics, context);
      case ColladaPackage.INT:
        return validateInt((Long)value, diagnostics, context);
      case ColladaPackage.INT2:
        return validateInt2((List<?>)value, diagnostics, context);
      case ColladaPackage.INT2X2:
        return validateInt2x2((List<?>)value, diagnostics, context);
      case ColladaPackage.INT3:
        return validateInt3((List<?>)value, diagnostics, context);
      case ColladaPackage.INT3X3:
        return validateInt3x3((List<?>)value, diagnostics, context);
      case ColladaPackage.INT4:
        return validateInt4((List<?>)value, diagnostics, context);
      case ColladaPackage.INT4X4:
        return validateInt4x4((List<?>)value, diagnostics, context);
      case ColladaPackage.INT_OBJECT:
        return validateIntObject((Long)value, diagnostics, context);
      case ColladaPackage.LIST_OF_BOOLS:
        return validateListOfBools((List<?>)value, diagnostics, context);
      case ColladaPackage.LIST_OF_FLOATS:
        return validateListOfFloats((List<?>)value, diagnostics, context);
      case ColladaPackage.LIST_OF_HEX_BINARY:
        return validateListOfHexBinary((List<?>)value, diagnostics, context);
      case ColladaPackage.LIST_OF_INTS:
        return validateListOfInts((List<?>)value, diagnostics, context);
      case ColladaPackage.LIST_OF_NAMES:
        return validateListOfNames((List<?>)value, diagnostics, context);
      case ColladaPackage.LIST_OF_TOKENS:
        return validateListOfTokens((List<?>)value, diagnostics, context);
      case ColladaPackage.LIST_OF_UINTS:
        return validateListOfUInts((List<?>)value, diagnostics, context);
      case ColladaPackage.MORPH_METHOD_TYPE_OBJECT:
        return validateMorphMethodTypeObject((MorphMethodType)value, diagnostics, context);
      case ColladaPackage.NAME:
        return validateName((String)value, diagnostics, context);
      case ColladaPackage.NODE_TYPE_OBJECT:
        return validateNodeTypeObject((NodeType)value, diagnostics, context);
      case ColladaPackage.SPRING_TYPE_OBJECT:
        return validateSpringTypeObject((SpringType)value, diagnostics, context);
      case ColladaPackage.STRING:
        return validateString((String)value, diagnostics, context);
      case ColladaPackage.TOKEN:
        return validateToken((String)value, diagnostics, context);
      case ColladaPackage.UINT:
        return validateUint((BigInteger)value, diagnostics, context);
      case ColladaPackage.UP_AXIS_TYPE_OBJECT:
        return validateUpAxisTypeObject((UpAxisType)value, diagnostics, context);
      case ColladaPackage.URI_FRAGMENT_TYPE:
        return validateURIFragmentType((String)value, diagnostics, context);
      case ColladaPackage.VERSION_TYPE_OBJECT:
        return validateVersionTypeObject((VersionType)value, diagnostics, context);
      default:
        return true;
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAccessorType(AccessorType accessorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(accessorType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAllType(AllType allType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(allType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAllType1(AllType1 allType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(allType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAllType2(AllType2 allType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(allType2, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAlphaFuncType(AlphaFuncType alphaFuncType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(alphaFuncType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAlphaFuncType1(AlphaFuncType1 alphaFuncType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(alphaFuncType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAlphaTestEnableType(AlphaTestEnableType alphaTestEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(alphaTestEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAlphaTestEnableType1(AlphaTestEnableType1 alphaTestEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(alphaTestEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAlphaType(AlphaType alphaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(alphaType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAmbientType(AmbientType ambientType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(ambientType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAngularType(AngularType angularType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(angularType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAnimationClipType(AnimationClipType animationClipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(animationClipType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAnimationType(AnimationType animationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(animationType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAssetType(AssetType assetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(assetType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAttachmentType(AttachmentType attachmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(attachmentType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAutoNormalEnableType(AutoNormalEnableType autoNormalEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(autoNormalEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBackType(BackType backType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(backType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBindMaterialType(BindMaterialType bindMaterialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(bindMaterialType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBindType(BindType bindType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(bindType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBindType1(BindType1 bindType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(bindType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBindType2(BindType2 bindType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(bindType2, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBindVertexInputType(BindVertexInputType bindVertexInputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(bindVertexInputType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBlendColorType(BlendColorType blendColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(blendColorType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBlendEnableType(BlendEnableType blendEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(blendEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBlendEnableType1(BlendEnableType1 blendEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(blendEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBlendEquationSeparateType(BlendEquationSeparateType blendEquationSeparateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(blendEquationSeparateType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBlendEquationType(BlendEquationType blendEquationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(blendEquationType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBlendFuncSeparateType(BlendFuncSeparateType blendFuncSeparateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(blendFuncSeparateType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBlendFuncType(BlendFuncType blendFuncType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(blendFuncType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBlendFuncType1(BlendFuncType1 blendFuncType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(blendFuncType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBlinnType(BlinnType blinnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(blinnType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBoolArrayType(BoolArrayType boolArrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(boolArrayType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBoxType(BoxType boxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(boxType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCameraType(CameraType cameraType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cameraType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCapsuleType(CapsuleType capsuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(capsuleType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgConnectParam(CgConnectParam cgConnectParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cgConnectParam, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgNewarrayType(CgNewarrayType cgNewarrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cgNewarrayType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgNewparam(CgNewparam cgNewparam, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cgNewparam, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgSampler1D(CgSampler1D cgSampler1D, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cgSampler1D, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgSampler2D(CgSampler2D cgSampler2D, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cgSampler2D, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgSampler3D(CgSampler3D cgSampler3D, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cgSampler3D, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgSamplerCUBE(CgSamplerCUBE cgSamplerCUBE, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cgSamplerCUBE, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgSamplerDEPTH(CgSamplerDEPTH cgSamplerDEPTH, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cgSamplerDEPTH, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgSamplerRECT(CgSamplerRECT cgSamplerRECT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cgSamplerRECT, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgSetarrayType(CgSetarrayType cgSetarrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cgSetarrayType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgSetparam(CgSetparam cgSetparam, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cgSetparam, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgSetparamSimple(CgSetparamSimple cgSetparamSimple, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cgSetparamSimple, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgSetuserType(CgSetuserType cgSetuserType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cgSetuserType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgSurfaceType(CgSurfaceType cgSurfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cgSurfaceType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateChannelType(ChannelType channelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(channelType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClearColorType(ClearColorType clearColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(clearColorType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClearColorType1(ClearColorType1 clearColorType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(clearColorType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClearDepthType(ClearDepthType clearDepthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(clearDepthType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClearDepthType1(ClearDepthType1 clearDepthType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(clearDepthType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClearStencilType(ClearStencilType clearStencilType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(clearStencilType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClearStencilType1(ClearStencilType1 clearStencilType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(clearStencilType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClipPlaneEnableType(ClipPlaneEnableType clipPlaneEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(clipPlaneEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClipPlaneEnableType1(ClipPlaneEnableType1 clipPlaneEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(clipPlaneEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClipPlaneType(ClipPlaneType clipPlaneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(clipPlaneType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClipPlaneType1(ClipPlaneType1 clipPlaneType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(clipPlaneType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCOLLADAType(COLLADAType colladaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(colladaType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateColorLogicOpEnableType(ColorLogicOpEnableType colorLogicOpEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(colorLogicOpEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateColorLogicOpEnableType1(ColorLogicOpEnableType1 colorLogicOpEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(colorLogicOpEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateColorMaskType(ColorMaskType colorMaskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(colorMaskType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateColorMaskType1(ColorMaskType1 colorMaskType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(colorMaskType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateColorMaterialEnableType(ColorMaterialEnableType colorMaterialEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(colorMaterialEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateColorMaterialEnableType1(ColorMaterialEnableType1 colorMaterialEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(colorMaterialEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateColorMaterialType(ColorMaterialType colorMaterialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(colorMaterialType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateColorType(ColorType colorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(colorType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCommonColorOrTextureType(CommonColorOrTextureType commonColorOrTextureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(commonColorOrTextureType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCommonFloatOrParamType(CommonFloatOrParamType commonFloatOrParamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(commonFloatOrParamType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCommonNewparamType(CommonNewparamType commonNewparamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(commonNewparamType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCommonTransparentType(CommonTransparentType commonTransparentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(commonTransparentType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCompilerTargetType(CompilerTargetType compilerTargetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(compilerTargetType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCompilerTargetType1(CompilerTargetType1 compilerTargetType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(compilerTargetType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConstantType(ConstantType constantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(constantType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateContributorType(ContributorType contributorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(contributorType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateControllerType(ControllerType controllerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(controllerType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateControlVerticesType(ControlVerticesType controlVerticesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(controlVerticesType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateConvexMeshType(ConvexMeshType convexMeshType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(convexMeshType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCullFaceEnableType(CullFaceEnableType cullFaceEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cullFaceEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCullFaceEnableType1(CullFaceEnableType1 cullFaceEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cullFaceEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCullFaceType(CullFaceType cullFaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cullFaceType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCullFaceType1(CullFaceType1 cullFaceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cullFaceType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCylinderType(CylinderType cylinderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(cylinderType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDepthBoundsEnableType(DepthBoundsEnableType depthBoundsEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(depthBoundsEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDepthBoundsType(DepthBoundsType depthBoundsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(depthBoundsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDepthClampEnableType(DepthClampEnableType depthClampEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(depthClampEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDepthFuncType(DepthFuncType depthFuncType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(depthFuncType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDepthFuncType1(DepthFuncType1 depthFuncType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(depthFuncType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDepthMaskType(DepthMaskType depthMaskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(depthMaskType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDepthMaskType1(DepthMaskType1 depthMaskType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(depthMaskType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDepthRangeType(DepthRangeType depthRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(depthRangeType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDepthRangeType1(DepthRangeType1 depthRangeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(depthRangeType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDepthTestEnableType(DepthTestEnableType depthTestEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(depthTestEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDepthTestEnableType1(DepthTestEnableType1 depthTestEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(depthTestEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDestAlphaType(DestAlphaType destAlphaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(destAlphaType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDestRgbType(DestRgbType destRgbType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(destRgbType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDestType(DestType destType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(destType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDestType1(DestType1 destType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(destType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDirectionalType(DirectionalType directionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(directionalType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDitherEnableType(DitherEnableType ditherEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(ditherEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDitherEnableType1(DitherEnableType1 ditherEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(ditherEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDynamicType(DynamicType dynamicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(dynamicType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDynamicType1(DynamicType1 dynamicType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(dynamicType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEffectType(EffectType effectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(effectType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEllipsoidType(EllipsoidType ellipsoidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(ellipsoidType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEnabledType(EnabledType enabledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(enabledType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEvaluateSceneType(EvaluateSceneType evaluateSceneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(evaluateSceneType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateExtraType(ExtraType extraType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(extraType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFaceType(FaceType faceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(faceType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFaceType1(FaceType1 faceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(faceType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFaceType2(FaceType2 faceType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(faceType2, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFaceType3(FaceType3 faceType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(faceType3, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFaceType4(FaceType4 faceType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(faceType4, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFailType(FailType failType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(failType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFailType1(FailType1 failType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(failType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFailType2(FailType2 failType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(failType2, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloatArrayType(FloatArrayType floatArrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(floatArrayType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloatType(FloatType floatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(floatType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFogColorType(FogColorType fogColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fogColorType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFogColorType1(FogColorType1 fogColorType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fogColorType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFogCoordSrcType(FogCoordSrcType fogCoordSrcType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fogCoordSrcType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFogDensityType(FogDensityType fogDensityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fogDensityType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFogDensityType1(FogDensityType1 fogDensityType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fogDensityType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFogEnableType(FogEnableType fogEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fogEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFogEnableType1(FogEnableType1 fogEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fogEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFogEndType(FogEndType fogEndType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fogEndType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFogEndType1(FogEndType1 fogEndType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fogEndType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFogModeType(FogModeType fogModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fogModeType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFogModeType1(FogModeType1 fogModeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fogModeType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFogStartType(FogStartType fogStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fogStartType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFogStartType1(FogStartType1 fogStartType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fogStartType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateForceFieldType(ForceFieldType forceFieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(forceFieldType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFrontFaceType(FrontFaceType frontFaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(frontFaceType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFrontFaceType1(FrontFaceType1 frontFaceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(frontFaceType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFrontType(FrontType frontType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(frontType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFuncType(FuncType funcType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(funcType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFuncType1(FuncType1 funcType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(funcType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFuncType2(FuncType2 funcType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(funcType2, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFuncType3(FuncType3 funcType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(funcType3, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxAnnotateCommon(FxAnnotateCommon fxAnnotateCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxAnnotateCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxClearcolorCommon(FxClearcolorCommon fxClearcolorCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxClearcolorCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxCleardepthCommon(FxCleardepthCommon fxCleardepthCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxCleardepthCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxClearstencilCommon(FxClearstencilCommon fxClearstencilCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxClearstencilCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxCodeProfile(FxCodeProfile fxCodeProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxCodeProfile, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxColortargetCommon(FxColortargetCommon fxColortargetCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxColortargetCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxDepthtargetCommon(FxDepthtargetCommon fxDepthtargetCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxDepthtargetCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxIncludeCommon(FxIncludeCommon fxIncludeCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxIncludeCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxNewparamCommon(FxNewparamCommon fxNewparamCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxNewparamCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSampler1DCommon(FxSampler1DCommon fxSampler1DCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxSampler1DCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSampler2DCommon(FxSampler2DCommon fxSampler2DCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxSampler2DCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSampler3DCommon(FxSampler3DCommon fxSampler3DCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxSampler3DCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSamplerCUBECommon(FxSamplerCUBECommon fxSamplerCUBECommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxSamplerCUBECommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSamplerDEPTHCommon(FxSamplerDEPTHCommon fxSamplerDEPTHCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxSamplerDEPTHCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSamplerRECTCommon(FxSamplerRECTCommon fxSamplerRECTCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxSamplerRECTCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxStenciltargetCommon(FxStenciltargetCommon fxStenciltargetCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxStenciltargetCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceCommon(FxSurfaceCommon fxSurfaceCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxSurfaceCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceFormatHintCommon(FxSurfaceFormatHintCommon fxSurfaceFormatHintCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxSurfaceFormatHintCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceInitCubeCommon(FxSurfaceInitCubeCommon fxSurfaceInitCubeCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxSurfaceInitCubeCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceInitFromCommon(FxSurfaceInitFromCommon fxSurfaceInitFromCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxSurfaceInitFromCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceInitPlanarCommon(FxSurfaceInitPlanarCommon fxSurfaceInitPlanarCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxSurfaceInitPlanarCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceInitVolumeCommon(FxSurfaceInitVolumeCommon fxSurfaceInitVolumeCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fxSurfaceInitVolumeCommon, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneratorType(GeneratorType generatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(generatorType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneratorType1(GeneratorType1 generatorType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(generatorType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeometryType(GeometryType geometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(geometryType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesNewparam(GlesNewparam glesNewparam, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glesNewparam, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesSamplerState(GlesSamplerState glesSamplerState, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glesSamplerState, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerArgumentAlphaType(GlesTexcombinerArgumentAlphaType glesTexcombinerArgumentAlphaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glesTexcombinerArgumentAlphaType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerArgumentRGBType(GlesTexcombinerArgumentRGBType glesTexcombinerArgumentRGBType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glesTexcombinerArgumentRGBType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerCommandAlphaType(GlesTexcombinerCommandAlphaType glesTexcombinerCommandAlphaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glesTexcombinerCommandAlphaType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerCommandRGBType(GlesTexcombinerCommandRGBType glesTexcombinerCommandRGBType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glesTexcombinerCommandRGBType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerCommandType(GlesTexcombinerCommandType glesTexcombinerCommandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glesTexcombinerCommandType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexenvCommandType(GlesTexenvCommandType glesTexenvCommandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glesTexenvCommandType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTextureConstantType(GlesTextureConstantType glesTextureConstantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glesTextureConstantType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexturePipeline(GlesTexturePipeline glesTexturePipeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glesTexturePipeline, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTextureUnit(GlesTextureUnit glesTextureUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glesTextureUnit, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlSampler1D(GlSampler1D glSampler1D, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glSampler1D, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlSampler2D(GlSampler2D glSampler2D, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glSampler2D, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlSampler3D(GlSampler3D glSampler3D, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glSampler3D, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlSamplerCUBE(GlSamplerCUBE glSamplerCUBE, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glSamplerCUBE, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlSamplerDEPTH(GlSamplerDEPTH glSamplerDEPTH, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glSamplerDEPTH, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlSamplerRECT(GlSamplerRECT glSamplerRECT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glSamplerRECT, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslNewarrayType(GlslNewarrayType glslNewarrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glslNewarrayType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslNewparam(GlslNewparam glslNewparam, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glslNewparam, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslSetarrayType(GlslSetarrayType glslSetarrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glslSetarrayType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslSetparam(GlslSetparam glslSetparam, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glslSetparam, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslSetparamSimple(GlslSetparamSimple glslSetparamSimple, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glslSetparamSimple, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslSurfaceType(GlslSurfaceType glslSurfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(glslSurfaceType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHollowType(HollowType hollowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(hollowType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHollowType1(HollowType1 hollowType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(hollowType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateIDREFArrayType(IDREFArrayType idrefArrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(idrefArrayType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagerType(ImagerType imagerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(imagerType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImageType(ImageType imageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(imageType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInputGlobal(InputGlobal inputGlobal, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(inputGlobal, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInputLocal(InputLocal inputLocal, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(inputLocal, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInputLocalOffset(InputLocalOffset inputLocalOffset, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(inputLocalOffset, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInstanceControllerType(InstanceControllerType instanceControllerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(instanceControllerType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInstanceEffectType(InstanceEffectType instanceEffectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(instanceEffectType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInstanceGeometryType(InstanceGeometryType instanceGeometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(instanceGeometryType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInstanceMaterialType(InstanceMaterialType instanceMaterialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(instanceMaterialType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInstancePhysicsModelType(InstancePhysicsModelType instancePhysicsModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(instancePhysicsModelType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInstanceRigidBodyType(InstanceRigidBodyType instanceRigidBodyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(instanceRigidBodyType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInstanceRigidConstraintType(InstanceRigidConstraintType instanceRigidConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(instanceRigidConstraintType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInstanceWithExtra(InstanceWithExtra instanceWithExtra, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(instanceWithExtra, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateIntArrayType(IntArrayType intArrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(intArrayType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInterpenetrateType(InterpenetrateType interpenetrateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(interpenetrateType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateJointsType(JointsType jointsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(jointsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLambertType(LambertType lambertType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lambertType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLibraryAnimationClipsType(LibraryAnimationClipsType libraryAnimationClipsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(libraryAnimationClipsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLibraryAnimationsType(LibraryAnimationsType libraryAnimationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(libraryAnimationsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLibraryCamerasType(LibraryCamerasType libraryCamerasType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(libraryCamerasType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLibraryControllersType(LibraryControllersType libraryControllersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(libraryControllersType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLibraryEffectsType(LibraryEffectsType libraryEffectsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(libraryEffectsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLibraryForceFieldsType(LibraryForceFieldsType libraryForceFieldsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(libraryForceFieldsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLibraryGeometriesType(LibraryGeometriesType libraryGeometriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(libraryGeometriesType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLibraryImagesType(LibraryImagesType libraryImagesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(libraryImagesType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLibraryLightsType(LibraryLightsType libraryLightsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(libraryLightsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLibraryMaterialsType(LibraryMaterialsType libraryMaterialsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(libraryMaterialsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLibraryNodesType(LibraryNodesType libraryNodesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(libraryNodesType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLibraryPhysicsMaterialsType(LibraryPhysicsMaterialsType libraryPhysicsMaterialsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(libraryPhysicsMaterialsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLibraryPhysicsModelsType(LibraryPhysicsModelsType libraryPhysicsModelsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(libraryPhysicsModelsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLibraryPhysicsScenesType(LibraryPhysicsScenesType libraryPhysicsScenesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(libraryPhysicsScenesType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLibraryVisualScenesType(LibraryVisualScenesType libraryVisualScenesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(libraryVisualScenesType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightAmbientType(LightAmbientType lightAmbientType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightAmbientType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightAmbientType1(LightAmbientType1 lightAmbientType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightAmbientType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightConstantAttenuationType(LightConstantAttenuationType lightConstantAttenuationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightConstantAttenuationType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightConstantAttenuationType1(LightConstantAttenuationType1 lightConstantAttenuationType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightConstantAttenuationType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightDiffuseType(LightDiffuseType lightDiffuseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightDiffuseType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightDiffuseType1(LightDiffuseType1 lightDiffuseType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightDiffuseType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightEnableType(LightEnableType lightEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightEnableType1(LightEnableType1 lightEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightingEnableType(LightingEnableType lightingEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightingEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightingEnableType1(LightingEnableType1 lightingEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightingEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightLinearAttenuationType(LightLinearAttenuationType lightLinearAttenuationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightLinearAttenuationType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightLinearAttenutationType(LightLinearAttenutationType lightLinearAttenutationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightLinearAttenutationType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightModelAmbientType(LightModelAmbientType lightModelAmbientType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightModelAmbientType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightModelAmbientType1(LightModelAmbientType1 lightModelAmbientType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightModelAmbientType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightModelColorControlType(LightModelColorControlType lightModelColorControlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightModelColorControlType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightModelLocalViewerEnableType(LightModelLocalViewerEnableType lightModelLocalViewerEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightModelLocalViewerEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightModelTwoSideEnableType(LightModelTwoSideEnableType lightModelTwoSideEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightModelTwoSideEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightModelTwoSideEnableType1(LightModelTwoSideEnableType1 lightModelTwoSideEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightModelTwoSideEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightPositionType(LightPositionType lightPositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightPositionType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightPositionType1(LightPositionType1 lightPositionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightPositionType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightQuadraticAttenuationType(LightQuadraticAttenuationType lightQuadraticAttenuationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightQuadraticAttenuationType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightQuadraticAttenuationType1(LightQuadraticAttenuationType1 lightQuadraticAttenuationType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightQuadraticAttenuationType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightSpecularType(LightSpecularType lightSpecularType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightSpecularType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightSpecularType1(LightSpecularType1 lightSpecularType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightSpecularType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightSpotCutoffType(LightSpotCutoffType lightSpotCutoffType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightSpotCutoffType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightSpotCutoffType1(LightSpotCutoffType1 lightSpotCutoffType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightSpotCutoffType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightSpotDirectionType(LightSpotDirectionType lightSpotDirectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightSpotDirectionType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightSpotDirectionType1(LightSpotDirectionType1 lightSpotDirectionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightSpotDirectionType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightSpotExponentType(LightSpotExponentType lightSpotExponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightSpotExponentType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightSpotExponentType1(LightSpotExponentType1 lightSpotExponentType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightSpotExponentType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLightType(LightType lightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lightType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLimitsType(LimitsType limitsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(limitsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLinearType(LinearType linearType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(linearType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLinearType1(LinearType1 linearType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(linearType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLineSmoothEnableType(LineSmoothEnableType lineSmoothEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lineSmoothEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLineSmoothEnableType1(LineSmoothEnableType1 lineSmoothEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lineSmoothEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLineStippleEnableType(LineStippleEnableType lineStippleEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lineStippleEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLineStippleType(LineStippleType lineStippleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lineStippleType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLinestripsType(LinestripsType linestripsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(linestripsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLinesType(LinesType linesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(linesType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLineWidthType(LineWidthType lineWidthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lineWidthType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLineWidthType1(LineWidthType1 lineWidthType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lineWidthType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLogicOpEnableType(LogicOpEnableType logicOpEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(logicOpEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLogicOpType(LogicOpType logicOpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(logicOpType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLogicOpType1(LogicOpType1 logicOpType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(logicOpType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLookatType(LookatType lookatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lookatType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMaskType(MaskType maskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(maskType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMaskType1(MaskType1 maskType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(maskType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMaskType2(MaskType2 maskType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(maskType2, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMaskType3(MaskType3 maskType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(maskType3, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMassFrameType(MassFrameType massFrameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(massFrameType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMassFrameType1(MassFrameType1 massFrameType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(massFrameType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMaterialAmbientType(MaterialAmbientType materialAmbientType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(materialAmbientType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMaterialAmbientType1(MaterialAmbientType1 materialAmbientType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(materialAmbientType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMaterialDiffuseType(MaterialDiffuseType materialDiffuseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(materialDiffuseType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMaterialDiffuseType1(MaterialDiffuseType1 materialDiffuseType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(materialDiffuseType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMaterialEmissionType(MaterialEmissionType materialEmissionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(materialEmissionType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMaterialEmissionType1(MaterialEmissionType1 materialEmissionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(materialEmissionType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMaterialShininessType(MaterialShininessType materialShininessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(materialShininessType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMaterialShininessType1(MaterialShininessType1 materialShininessType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(materialShininessType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMaterialSpecularType(MaterialSpecularType materialSpecularType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(materialSpecularType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMaterialSpecularType1(MaterialSpecularType1 materialSpecularType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(materialSpecularType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMaterialType(MaterialType materialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(materialType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMatrixType(MatrixType matrixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(matrixType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMeshType(MeshType meshType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(meshType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateModelViewMatrixType(ModelViewMatrixType modelViewMatrixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(modelViewMatrixType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateModelViewMatrixType1(ModelViewMatrixType1 modelViewMatrixType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(modelViewMatrixType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateModeType(ModeType modeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(modeType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateModeType1(ModeType1 modeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(modeType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMorphType(MorphType morphType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(morphType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMultisampleEnableType(MultisampleEnableType multisampleEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(multisampleEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMultisampleEnableType1(MultisampleEnableType1 multisampleEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(multisampleEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNameArrayType(NameArrayType nameArrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(nameArrayType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNameType(NameType nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(nameType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNameType1(NameType1 nameType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(nameType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNameType2(NameType2 nameType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(nameType2, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNameType3(NameType3 nameType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(nameType3, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNodeType1(NodeType1 nodeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(nodeType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNormalizeEnableType(NormalizeEnableType normalizeEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(normalizeEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNormalizeEnableType1(NormalizeEnableType1 normalizeEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(normalizeEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOpticsType(OpticsType opticsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(opticsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOrthographicType(OrthographicType orthographicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(orthographicType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateParamType(ParamType paramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(paramType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateParamType1(ParamType1 paramType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(paramType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateParamType2(ParamType2 paramType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(paramType2, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateParamType3(ParamType3 paramType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(paramType3, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateParamType4(ParamType4 paramType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(paramType4, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePassType(PassType passType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(passType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePassType1(PassType1 passType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(passType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePassType2(PassType2 passType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(passType2, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePerspectiveType(PerspectiveType perspectiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(perspectiveType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhongType(PhongType phongType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(phongType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhType(PhType phType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(phType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhysicsMaterialType(PhysicsMaterialType physicsMaterialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(physicsMaterialType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhysicsModelType(PhysicsModelType physicsModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(physicsModelType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhysicsSceneType(PhysicsSceneType physicsSceneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(physicsSceneType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlaneType(PlaneType planeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(planeType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePointDistanceAttenuationType(PointDistanceAttenuationType pointDistanceAttenuationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(pointDistanceAttenuationType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePointDistanceAttenuationType1(PointDistanceAttenuationType1 pointDistanceAttenuationType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(pointDistanceAttenuationType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePointFadeThresholdSizeType(PointFadeThresholdSizeType pointFadeThresholdSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(pointFadeThresholdSizeType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePointFadeThresholdSizeType1(PointFadeThresholdSizeType1 pointFadeThresholdSizeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(pointFadeThresholdSizeType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePointSizeMaxType(PointSizeMaxType pointSizeMaxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(pointSizeMaxType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePointSizeMaxType1(PointSizeMaxType1 pointSizeMaxType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(pointSizeMaxType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePointSizeMinType(PointSizeMinType pointSizeMinType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(pointSizeMinType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePointSizeMinType1(PointSizeMinType1 pointSizeMinType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(pointSizeMinType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePointSizeType(PointSizeType pointSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(pointSizeType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePointSizeType1(PointSizeType1 pointSizeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(pointSizeType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePointSmoothEnableType(PointSmoothEnableType pointSmoothEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(pointSmoothEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePointSmoothEnableType1(PointSmoothEnableType1 pointSmoothEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(pointSmoothEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePointType(PointType pointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(pointType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePolygonModeType(PolygonModeType polygonModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(polygonModeType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePolygonOffsetFillEnableType(PolygonOffsetFillEnableType polygonOffsetFillEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(polygonOffsetFillEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePolygonOffsetFillEnableType1(PolygonOffsetFillEnableType1 polygonOffsetFillEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(polygonOffsetFillEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePolygonOffsetLineEnableType(PolygonOffsetLineEnableType polygonOffsetLineEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(polygonOffsetLineEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePolygonOffsetPointEnableType(PolygonOffsetPointEnableType polygonOffsetPointEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(polygonOffsetPointEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePolygonOffsetType(PolygonOffsetType polygonOffsetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(polygonOffsetType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePolygonOffsetType1(PolygonOffsetType1 polygonOffsetType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(polygonOffsetType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePolygonSmoothEnableType(PolygonSmoothEnableType polygonSmoothEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(polygonSmoothEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePolygonStippleEnableType(PolygonStippleEnableType polygonStippleEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(polygonStippleEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePolygonsType(PolygonsType polygonsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(polygonsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePolylistType(PolylistType polylistType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(polylistType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePrimaryType(PrimaryType primaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(primaryType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePrimaryType1(PrimaryType1 primaryType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(primaryType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProfileCGType(ProfileCGType profileCGType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(profileCGType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProfileCOMMONType(ProfileCOMMONType profileCOMMONType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(profileCOMMONType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProfileGLESType(ProfileGLESType profileGLESType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(profileGLESType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProfileGLSLType(ProfileGLSLType profileGLSLType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(profileGLSLType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProjectionMatrixType(ProjectionMatrixType projectionMatrixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(projectionMatrixType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProjectionMatrixType1(ProjectionMatrixType1 projectionMatrixType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(projectionMatrixType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRefAttachmentType(RefAttachmentType refAttachmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(refAttachmentType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRefType(RefType refType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(refType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRefType1(RefType1 refType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(refType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRefType2(RefType2 refType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(refType2, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRenderType(RenderType renderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(renderType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRescaleNormalEnableType(RescaleNormalEnableType rescaleNormalEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(rescaleNormalEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRescaleNormalEnableType1(RescaleNormalEnableType1 rescaleNormalEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(rescaleNormalEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRgbType(RgbType rgbType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(rgbType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRigidBodyType(RigidBodyType rigidBodyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(rigidBodyType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRigidConstraintType(RigidConstraintType rigidConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(rigidConstraintType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRotateType(RotateType rotateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(rotateType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSampleAlphaToCoverageEnableType(SampleAlphaToCoverageEnableType sampleAlphaToCoverageEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(sampleAlphaToCoverageEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSampleAlphaToCoverageEnableType1(SampleAlphaToCoverageEnableType1 sampleAlphaToCoverageEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(sampleAlphaToCoverageEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSampleAlphaToOneEnableType(SampleAlphaToOneEnableType sampleAlphaToOneEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(sampleAlphaToOneEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSampleAlphaToOneEnableType1(SampleAlphaToOneEnableType1 sampleAlphaToOneEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(sampleAlphaToOneEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSampleCoverageEnableType(SampleCoverageEnableType sampleCoverageEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(sampleCoverageEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSampleCoverageEnableType1(SampleCoverageEnableType1 sampleCoverageEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(sampleCoverageEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSamplerType(SamplerType samplerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(samplerType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSceneType(SceneType sceneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(sceneType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateScissorTestEnableType(ScissorTestEnableType scissorTestEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(scissorTestEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateScissorTestEnableType1(ScissorTestEnableType1 scissorTestEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(scissorTestEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateScissorType(ScissorType scissorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(scissorType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateScissorType1(ScissorType1 scissorType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(scissorType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSetparamType(SetparamType setparamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(setparamType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSetparamType1(SetparamType1 setparamType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(setparamType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateShadeModelType(ShadeModelType shadeModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(shadeModelType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateShadeModelType1(ShadeModelType1 shadeModelType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(shadeModelType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateShaderType(ShaderType shaderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(shaderType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateShaderType1(ShaderType1 shaderType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(shaderType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateShapeType(ShapeType shapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(shapeType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateShapeType1(ShapeType1 shapeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(shapeType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSkewType(SkewType skewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(skewType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSkinType(SkinType skinType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(skinType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSourceType(SourceType sourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(sourceType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSphereType(SphereType sphereType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(sphereType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSplineType(SplineType splineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(splineType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSpotType(SpotType spotType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(spotType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSpringType1(SpringType1 springType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(springType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSrcAlphaType(SrcAlphaType srcAlphaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(srcAlphaType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSrcRgbType(SrcRgbType srcRgbType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(srcRgbType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSrcType(SrcType srcType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(srcType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSrcType1(SrcType1 srcType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(srcType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStencilFuncSeparateType(StencilFuncSeparateType stencilFuncSeparateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(stencilFuncSeparateType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStencilFuncType(StencilFuncType stencilFuncType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(stencilFuncType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStencilFuncType1(StencilFuncType1 stencilFuncType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(stencilFuncType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStencilMaskSeparateType(StencilMaskSeparateType stencilMaskSeparateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(stencilMaskSeparateType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStencilMaskType(StencilMaskType stencilMaskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(stencilMaskType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStencilMaskType1(StencilMaskType1 stencilMaskType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(stencilMaskType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStencilOpSeparateType(StencilOpSeparateType stencilOpSeparateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(stencilOpSeparateType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStencilOpType(StencilOpType stencilOpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(stencilOpType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStencilOpType1(StencilOpType1 stencilOpType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(stencilOpType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStencilTestEnableType(StencilTestEnableType stencilTestEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(stencilTestEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStencilTestEnableType1(StencilTestEnableType1 stencilTestEnableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(stencilTestEnableType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSwingConeAndTwistType(SwingConeAndTwistType swingConeAndTwistType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(swingConeAndTwistType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTaperedCapsuleType(TaperedCapsuleType taperedCapsuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(taperedCapsuleType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTaperedCylinderType(TaperedCylinderType taperedCylinderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(taperedCylinderType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTargetableFloat(TargetableFloat targetableFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(targetableFloat, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTargetableFloat3(TargetableFloat3 targetableFloat3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(targetableFloat3, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTargetsType(TargetsType targetsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(targetsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTechniqueCommonType(TechniqueCommonType techniqueCommonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(techniqueCommonType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTechniqueCommonType1(TechniqueCommonType1 techniqueCommonType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(techniqueCommonType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTechniqueCommonType2(TechniqueCommonType2 techniqueCommonType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(techniqueCommonType2, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTechniqueCommonType3(TechniqueCommonType3 techniqueCommonType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(techniqueCommonType3, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTechniqueCommonType4(TechniqueCommonType4 techniqueCommonType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(techniqueCommonType4, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTechniqueCommonType5(TechniqueCommonType5 techniqueCommonType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(techniqueCommonType5, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTechniqueCommonType6(TechniqueCommonType6 techniqueCommonType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(techniqueCommonType6, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTechniqueCommonType7(TechniqueCommonType7 techniqueCommonType7, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(techniqueCommonType7, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTechniqueCommonType8(TechniqueCommonType8 techniqueCommonType8, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(techniqueCommonType8, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTechniqueHintType(TechniqueHintType techniqueHintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(techniqueHintType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTechniqueType(TechniqueType techniqueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(techniqueType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTechniqueType1(TechniqueType1 techniqueType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(techniqueType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTechniqueType2(TechniqueType2 techniqueType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(techniqueType2, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTechniqueType3(TechniqueType3 techniqueType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(techniqueType3, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTechniqueType4(TechniqueType4 techniqueType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(techniqueType4, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTexcoordType(TexcoordType texcoordType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(texcoordType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTexture1DEnableType(Texture1DEnableType texture1DEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(texture1DEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTexture1DType(Texture1DType texture1DType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(texture1DType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTexture2DEnableType(Texture2DEnableType texture2DEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(texture2DEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTexture2DType(Texture2DType texture2DType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(texture2DType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTexture3DEnableType(Texture3DEnableType texture3DEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(texture3DEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTexture3DType(Texture3DType texture3DType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(texture3DType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTextureCUBEEnableType(TextureCUBEEnableType textureCUBEEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(textureCUBEEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTextureCUBEType(TextureCUBEType textureCUBEType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(textureCUBEType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTextureDEPTHEnableType(TextureDEPTHEnableType textureDEPTHEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(textureDEPTHEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTextureDEPTHType(TextureDEPTHType textureDEPTHType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(textureDEPTHType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTextureEnvColorType(TextureEnvColorType textureEnvColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(textureEnvColorType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTextureEnvModeType(TextureEnvModeType textureEnvModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(textureEnvModeType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTexturePipelineEnableType(TexturePipelineEnableType texturePipelineEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(texturePipelineEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTexturePipelineType(TexturePipelineType texturePipelineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(texturePipelineType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTextureRECTEnableType(TextureRECTEnableType textureRECTEnableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(textureRECTEnableType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTextureRECTType(TextureRECTType textureRECTType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(textureRECTType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTextureType(TextureType textureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(textureType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTrianglesType(TrianglesType trianglesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(trianglesType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTrifansType(TrifansType trifansType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(trifansType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTristripsType(TristripsType tristripsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(tristripsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUnitType(UnitType unitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(unitType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(valueType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateValueType1(ValueType1 valueType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(valueType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVertexWeightsType(VertexWeightsType vertexWeightsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(vertexWeightsType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVerticesType(VerticesType verticesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(verticesType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVisualSceneType(VisualSceneType visualSceneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(visualSceneType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateZfailType(ZfailType zfailType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(zfailType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateZfailType1(ZfailType1 zfailType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(zfailType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateZfailType2(ZfailType2 zfailType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(zfailType2, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateZpassType(ZpassType zpassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(zpassType, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateZpassType1(ZpassType1 zpassType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(zpassType1, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateZpassType2(ZpassType2 zpassType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(zpassType2, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgPipelineStage(CgPipelineStage cgPipelineStage, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCommonProfileInput(CommonProfileInput commonProfileInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCommonProfileParam(CommonProfileParam commonProfileParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxModifierEnumCommon(FxModifierEnumCommon fxModifierEnumCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxOpaqueEnum(FxOpaqueEnum fxOpaqueEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxPipelineStageCommon(FxPipelineStageCommon fxPipelineStageCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSamplerFilterCommon(FxSamplerFilterCommon fxSamplerFilterCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSamplerWrapCommon(FxSamplerWrapCommon fxSamplerWrapCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceFaceEnum(FxSurfaceFaceEnum fxSurfaceFaceEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceFormatHintChannelsEnum(FxSurfaceFormatHintChannelsEnum fxSurfaceFormatHintChannelsEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceFormatHintOptionEnum(FxSurfaceFormatHintOptionEnum fxSurfaceFormatHintOptionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceFormatHintPrecisionEnum(FxSurfaceFormatHintPrecisionEnum fxSurfaceFormatHintPrecisionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceFormatHintRangeEnum(FxSurfaceFormatHintRangeEnum fxSurfaceFormatHintRangeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceTypeEnum(FxSurfaceTypeEnum fxSurfaceTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlBlendEquationType(GlBlendEquationType glBlendEquationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlBlendType(GlBlendType glBlendType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesSamplerWrap(GlesSamplerWrap glesSamplerWrap, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesStencilOpType(GlesStencilOpType glesStencilOpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerOperandAlphaEnums(GlesTexcombinerOperandAlphaEnums glesTexcombinerOperandAlphaEnums, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerOperandRGBEnums(GlesTexcombinerOperandRGBEnums glesTexcombinerOperandRGBEnums, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerOperatorAlphaEnums(GlesTexcombinerOperatorAlphaEnums glesTexcombinerOperatorAlphaEnums, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerOperatorRGBEnums(GlesTexcombinerOperatorRGBEnums glesTexcombinerOperatorRGBEnums, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerSourceEnums(GlesTexcombinerSourceEnums glesTexcombinerSourceEnums, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexenvModeEnums(GlesTexenvModeEnums glesTexenvModeEnums, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlFaceType(GlFaceType glFaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlFogCoordSrcType(GlFogCoordSrcType glFogCoordSrcType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlFogType(GlFogType glFogType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlFrontFaceType(GlFrontFaceType glFrontFaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlFuncType(GlFuncType glFuncType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlLightModelColorControlType(GlLightModelColorControlType glLightModelColorControlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlLogicOpType(GlLogicOpType glLogicOpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlMaterialType(GlMaterialType glMaterialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlPolygonModeType(GlPolygonModeType glPolygonModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlShadeModelType(GlShadeModelType glShadeModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslPipelineStage(GlslPipelineStage glslPipelineStage, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlStencilOpType(GlStencilOpType glStencilOpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMorphMethodType(MorphMethodType morphMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNodeType(NodeType nodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSpringType(SpringType springType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUpAxisType(UpAxisType upAxisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVersionType(VersionType versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBool(boolean bool, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBool2(List<?> bool2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfBools_ItemType(bool2, diagnostics, context);
    if (result || diagnostics != null) result &= validateBool2_MinLength(bool2, diagnostics, context);
    if (result || diagnostics != null) result &= validateBool2_MaxLength(bool2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Bool2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBool2_MinLength(List<?> bool2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = bool2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getBool2(), bool2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Bool2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBool2_MaxLength(List<?> bool2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = bool2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getBool2(), bool2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBool3(List<?> bool3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfBools_ItemType(bool3, diagnostics, context);
    if (result || diagnostics != null) result &= validateBool3_MinLength(bool3, diagnostics, context);
    if (result || diagnostics != null) result &= validateBool3_MaxLength(bool3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Bool3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBool3_MinLength(List<?> bool3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = bool3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getBool3(), bool3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Bool3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBool3_MaxLength(List<?> bool3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = bool3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getBool3(), bool3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBool4(List<?> bool4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfBools_ItemType(bool4, diagnostics, context);
    if (result || diagnostics != null) result &= validateBool4_MinLength(bool4, diagnostics, context);
    if (result || diagnostics != null) result &= validateBool4_MaxLength(bool4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Bool4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBool4_MinLength(List<?> bool4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = bool4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getBool4(), bool4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Bool4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBool4_MaxLength(List<?> bool4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = bool4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getBool4(), bool4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateBoolObject(Boolean boolObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool(boolean cgBool, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool1(boolean cgBool1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool1Object(Boolean cgBool1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool1x1(List<?> cgBool1x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool1x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool1x1_MinLength(cgBool1x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool1x1_MaxLength(cgBool1x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool1x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool1x1_MinLength(List<?> cgBool1x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool1x1.size();
    boolean result = length >= 1;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool1x1(), cgBool1x1, length, 1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool1x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool1x1_MaxLength(List<?> cgBool1x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool1x1.size();
    boolean result = length <= 1;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool1x1(), cgBool1x1, length, 1, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool1x2(List<?> cgBool1x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool1x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool1x2_MinLength(cgBool1x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool1x2_MaxLength(cgBool1x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool1x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool1x2_MinLength(List<?> cgBool1x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool1x2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool1x2(), cgBool1x2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool1x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool1x2_MaxLength(List<?> cgBool1x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool1x2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool1x2(), cgBool1x2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool1x3(List<?> cgBool1x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool1x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool1x3_MinLength(cgBool1x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool1x3_MaxLength(cgBool1x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool1x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool1x3_MinLength(List<?> cgBool1x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool1x3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool1x3(), cgBool1x3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool1x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool1x3_MaxLength(List<?> cgBool1x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool1x3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool1x3(), cgBool1x3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool1x4(List<?> cgBool1x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool1x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool1x4_MinLength(cgBool1x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool1x4_MaxLength(cgBool1x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool1x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool1x4_MinLength(List<?> cgBool1x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool1x4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool1x4(), cgBool1x4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool1x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool1x4_MaxLength(List<?> cgBool1x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool1x4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool1x4(), cgBool1x4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool2(List<?> cgBool2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool2_MinLength(cgBool2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool2_MaxLength(cgBool2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool2_MinLength(List<?> cgBool2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool2(), cgBool2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool2_MaxLength(List<?> cgBool2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool2(), cgBool2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool2x1(List<?> cgBool2x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool2x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool2x1_MinLength(cgBool2x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool2x1_MaxLength(cgBool2x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool2x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool2x1_MinLength(List<?> cgBool2x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool2x1.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool2x1(), cgBool2x1, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool2x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool2x1_MaxLength(List<?> cgBool2x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool2x1.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool2x1(), cgBool2x1, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool2x2(List<?> cgBool2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool2x2_MinLength(cgBool2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool2x2_MaxLength(cgBool2x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool2x2_MinLength(List<?> cgBool2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool2x2.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool2x2(), cgBool2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool2x2_MaxLength(List<?> cgBool2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool2x2.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool2x2(), cgBool2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool2x3(List<?> cgBool2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool2x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool2x3_MinLength(cgBool2x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool2x3_MaxLength(cgBool2x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool2x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool2x3_MinLength(List<?> cgBool2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool2x3.size();
    boolean result = length >= 6;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool2x3(), cgBool2x3, length, 6, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool2x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool2x3_MaxLength(List<?> cgBool2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool2x3.size();
    boolean result = length <= 6;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool2x3(), cgBool2x3, length, 6, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool2x4(List<?> cgBool2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool2x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool2x4_MinLength(cgBool2x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool2x4_MaxLength(cgBool2x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool2x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool2x4_MinLength(List<?> cgBool2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool2x4.size();
    boolean result = length >= 8;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool2x4(), cgBool2x4, length, 8, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool2x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool2x4_MaxLength(List<?> cgBool2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool2x4.size();
    boolean result = length <= 8;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool2x4(), cgBool2x4, length, 8, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool3(List<?> cgBool3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool3_MinLength(cgBool3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool3_MaxLength(cgBool3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool3_MinLength(List<?> cgBool3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool3(), cgBool3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool3_MaxLength(List<?> cgBool3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool3(), cgBool3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool3x1(List<?> cgBool3x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool3x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool3x1_MinLength(cgBool3x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool3x1_MaxLength(cgBool3x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool3x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool3x1_MinLength(List<?> cgBool3x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool3x1.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool3x1(), cgBool3x1, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool3x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool3x1_MaxLength(List<?> cgBool3x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool3x1.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool3x1(), cgBool3x1, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool3x2(List<?> cgBool3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool3x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool3x2_MinLength(cgBool3x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool3x2_MaxLength(cgBool3x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool3x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool3x2_MinLength(List<?> cgBool3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool3x2.size();
    boolean result = length >= 6;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool3x2(), cgBool3x2, length, 6, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool3x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool3x2_MaxLength(List<?> cgBool3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool3x2.size();
    boolean result = length <= 6;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool3x2(), cgBool3x2, length, 6, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool3x3(List<?> cgBool3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool3x3_MinLength(cgBool3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool3x3_MaxLength(cgBool3x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool3x3_MinLength(List<?> cgBool3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool3x3.size();
    boolean result = length >= 9;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool3x3(), cgBool3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool3x3_MaxLength(List<?> cgBool3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool3x3.size();
    boolean result = length <= 9;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool3x3(), cgBool3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool3x4(List<?> cgBool3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool3x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool3x4_MinLength(cgBool3x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool3x4_MaxLength(cgBool3x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool3x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool3x4_MinLength(List<?> cgBool3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool3x4.size();
    boolean result = length >= 12;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool3x4(), cgBool3x4, length, 12, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool3x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool3x4_MaxLength(List<?> cgBool3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool3x4.size();
    boolean result = length <= 12;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool3x4(), cgBool3x4, length, 12, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool4(List<?> cgBool4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool4_MinLength(cgBool4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool4_MaxLength(cgBool4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool4_MinLength(List<?> cgBool4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool4(), cgBool4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool4_MaxLength(List<?> cgBool4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool4(), cgBool4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool4x1(List<?> cgBool4x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool4x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool4x1_MinLength(cgBool4x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool4x1_MaxLength(cgBool4x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool4x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool4x1_MinLength(List<?> cgBool4x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool4x1.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool4x1(), cgBool4x1, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool4x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool4x1_MaxLength(List<?> cgBool4x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool4x1.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool4x1(), cgBool4x1, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool4x2(List<?> cgBool4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool4x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool4x2_MinLength(cgBool4x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool4x2_MaxLength(cgBool4x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool4x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool4x2_MinLength(List<?> cgBool4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool4x2.size();
    boolean result = length >= 8;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool4x2(), cgBool4x2, length, 8, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool4x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool4x2_MaxLength(List<?> cgBool4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool4x2.size();
    boolean result = length <= 8;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool4x2(), cgBool4x2, length, 8, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool4x3(List<?> cgBool4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool4x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool4x3_MinLength(cgBool4x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool4x3_MaxLength(cgBool4x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool4x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool4x3_MinLength(List<?> cgBool4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool4x3.size();
    boolean result = length >= 12;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool4x3(), cgBool4x3, length, 12, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool4x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool4x3_MaxLength(List<?> cgBool4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool4x3.size();
    boolean result = length <= 12;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool4x3(), cgBool4x3, length, 12, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool4x4(List<?> cgBool4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgBool4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool4x4_MinLength(cgBool4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgBool4x4_MaxLength(cgBool4x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Bool4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool4x4_MinLength(List<?> cgBool4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool4x4.size();
    boolean result = length >= 16;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgBool4x4(), cgBool4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Bool4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBool4x4_MaxLength(List<?> cgBool4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgBool4x4.size();
    boolean result = length <= 16;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgBool4x4(), cgBool4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgBoolObject(Boolean cgBoolObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed(float cgFixed, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgFixed_Min(cgFixed, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed_Max(cgFixed, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateCgFixed_Min
   */
	public static final float CG_FIXED__MIN__VALUE = -2.0F;

	/**
   * Validates the Min constraint of '<em>Cg Fixed</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed_Min(float cgFixed, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = cgFixed >= CG_FIXED__MIN__VALUE;
    if (!result && diagnostics != null)
      reportMinViolation(ColladaPackage.eINSTANCE.getCgFixed(), cgFixed, CG_FIXED__MIN__VALUE, true, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateCgFixed_Max
   */
	public static final float CG_FIXED__MAX__VALUE = 2.0F;

	/**
   * Validates the Max constraint of '<em>Cg Fixed</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed_Max(float cgFixed, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = cgFixed <= CG_FIXED__MAX__VALUE;
    if (!result && diagnostics != null)
      reportMaxViolation(ColladaPackage.eINSTANCE.getCgFixed(), cgFixed, CG_FIXED__MAX__VALUE, true, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1(float cgFixed1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgFixed1_Min(cgFixed1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed1_Max(cgFixed1, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateCgFixed1_Min
   */
	public static final float CG_FIXED1__MIN__VALUE = -2.0F;

	/**
   * Validates the Min constraint of '<em>Cg Fixed1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1_Min(float cgFixed1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = cgFixed1 >= CG_FIXED1__MIN__VALUE;
    if (!result && diagnostics != null)
      reportMinViolation(ColladaPackage.eINSTANCE.getCgFixed1(), cgFixed1, CG_FIXED1__MIN__VALUE, true, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateCgFixed1_Max
   */
	public static final float CG_FIXED1__MAX__VALUE = 2.0F;

	/**
   * Validates the Max constraint of '<em>Cg Fixed1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1_Max(float cgFixed1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = cgFixed1 <= CG_FIXED1__MAX__VALUE;
    if (!result && diagnostics != null)
      reportMaxViolation(ColladaPackage.eINSTANCE.getCgFixed1(), cgFixed1, CG_FIXED1__MAX__VALUE, true, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1Object(Float cgFixed1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgFixed1_Min(cgFixed1Object, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed1_Max(cgFixed1Object, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1x1(List<?> cgFixed1x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed1x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed1x1_MinLength(cgFixed1x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed1x1_MaxLength(cgFixed1x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed1x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1x1_MinLength(List<?> cgFixed1x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed1x1.size();
    boolean result = length >= 1;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed1x1(), cgFixed1x1, length, 1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed1x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1x1_MaxLength(List<?> cgFixed1x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed1x1.size();
    boolean result = length <= 1;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed1x1(), cgFixed1x1, length, 1, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1x2(List<?> cgFixed1x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed1x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed1x2_MinLength(cgFixed1x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed1x2_MaxLength(cgFixed1x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed1x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1x2_MinLength(List<?> cgFixed1x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed1x2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed1x2(), cgFixed1x2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed1x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1x2_MaxLength(List<?> cgFixed1x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed1x2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed1x2(), cgFixed1x2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1x3(List<?> cgFixed1x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed1x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed1x3_MinLength(cgFixed1x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed1x3_MaxLength(cgFixed1x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed1x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1x3_MinLength(List<?> cgFixed1x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed1x3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed1x3(), cgFixed1x3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed1x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1x3_MaxLength(List<?> cgFixed1x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed1x3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed1x3(), cgFixed1x3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1x4(List<?> cgFixed1x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed1x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed1x4_MinLength(cgFixed1x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed1x4_MaxLength(cgFixed1x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed1x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1x4_MinLength(List<?> cgFixed1x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed1x4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed1x4(), cgFixed1x4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed1x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed1x4_MaxLength(List<?> cgFixed1x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed1x4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed1x4(), cgFixed1x4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed2(List<?> cgFixed2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed2_MinLength(cgFixed2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed2_MaxLength(cgFixed2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed2_MinLength(List<?> cgFixed2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed2(), cgFixed2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed2_MaxLength(List<?> cgFixed2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed2(), cgFixed2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed2x1(List<?> cgFixed2x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed2x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed2x1_MinLength(cgFixed2x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed2x1_MaxLength(cgFixed2x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed2x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed2x1_MinLength(List<?> cgFixed2x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed2x1.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed2x1(), cgFixed2x1, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed2x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed2x1_MaxLength(List<?> cgFixed2x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed2x1.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed2x1(), cgFixed2x1, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed2x2(List<?> cgFixed2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed2x2_MinLength(cgFixed2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed2x2_MaxLength(cgFixed2x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed2x2_MinLength(List<?> cgFixed2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed2x2.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed2x2(), cgFixed2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed2x2_MaxLength(List<?> cgFixed2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed2x2.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed2x2(), cgFixed2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed2x3(List<?> cgFixed2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed2x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed2x3_MinLength(cgFixed2x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed2x3_MaxLength(cgFixed2x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed2x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed2x3_MinLength(List<?> cgFixed2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed2x3.size();
    boolean result = length >= 6;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed2x3(), cgFixed2x3, length, 6, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed2x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed2x3_MaxLength(List<?> cgFixed2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed2x3.size();
    boolean result = length <= 6;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed2x3(), cgFixed2x3, length, 6, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed2x4(List<?> cgFixed2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed2x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed2x4_MinLength(cgFixed2x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed2x4_MaxLength(cgFixed2x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed2x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed2x4_MinLength(List<?> cgFixed2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed2x4.size();
    boolean result = length >= 8;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed2x4(), cgFixed2x4, length, 8, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed2x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed2x4_MaxLength(List<?> cgFixed2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed2x4.size();
    boolean result = length <= 8;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed2x4(), cgFixed2x4, length, 8, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed3(List<?> cgFixed3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed3_MinLength(cgFixed3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed3_MaxLength(cgFixed3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed3_MinLength(List<?> cgFixed3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed3(), cgFixed3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed3_MaxLength(List<?> cgFixed3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed3(), cgFixed3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed3x1(List<?> cgFixed3x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed3x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed3x1_MinLength(cgFixed3x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed3x1_MaxLength(cgFixed3x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed3x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed3x1_MinLength(List<?> cgFixed3x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed3x1.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed3x1(), cgFixed3x1, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed3x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed3x1_MaxLength(List<?> cgFixed3x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed3x1.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed3x1(), cgFixed3x1, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed3x2(List<?> cgFixed3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed3x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed3x2_MinLength(cgFixed3x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed3x2_MaxLength(cgFixed3x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed3x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed3x2_MinLength(List<?> cgFixed3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed3x2.size();
    boolean result = length >= 6;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed3x2(), cgFixed3x2, length, 6, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed3x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed3x2_MaxLength(List<?> cgFixed3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed3x2.size();
    boolean result = length <= 6;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed3x2(), cgFixed3x2, length, 6, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed3x3(List<?> cgFixed3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed3x3_MinLength(cgFixed3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed3x3_MaxLength(cgFixed3x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed3x3_MinLength(List<?> cgFixed3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed3x3.size();
    boolean result = length >= 9;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed3x3(), cgFixed3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed3x3_MaxLength(List<?> cgFixed3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed3x3.size();
    boolean result = length <= 9;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed3x3(), cgFixed3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed3x4(List<?> cgFixed3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed3x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed3x4_MinLength(cgFixed3x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed3x4_MaxLength(cgFixed3x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed3x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed3x4_MinLength(List<?> cgFixed3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed3x4.size();
    boolean result = length >= 12;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed3x4(), cgFixed3x4, length, 12, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed3x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed3x4_MaxLength(List<?> cgFixed3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed3x4.size();
    boolean result = length <= 12;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed3x4(), cgFixed3x4, length, 12, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed4(List<?> cgFixed4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed4_MinLength(cgFixed4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed4_MaxLength(cgFixed4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed4_MinLength(List<?> cgFixed4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed4(), cgFixed4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed4_MaxLength(List<?> cgFixed4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed4(), cgFixed4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed4x1(List<?> cgFixed4x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed4x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed4x1_MinLength(cgFixed4x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed4x1_MaxLength(cgFixed4x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed4x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed4x1_MinLength(List<?> cgFixed4x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed4x1.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed4x1(), cgFixed4x1, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed4x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed4x1_MaxLength(List<?> cgFixed4x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed4x1.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed4x1(), cgFixed4x1, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed4x2(List<?> cgFixed4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed4x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed4x2_MinLength(cgFixed4x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed4x2_MaxLength(cgFixed4x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed4x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed4x2_MinLength(List<?> cgFixed4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed4x2.size();
    boolean result = length >= 8;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed4x2(), cgFixed4x2, length, 8, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed4x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed4x2_MaxLength(List<?> cgFixed4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed4x2.size();
    boolean result = length <= 8;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed4x2(), cgFixed4x2, length, 8, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed4x3(List<?> cgFixed4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed4x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed4x3_MinLength(cgFixed4x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed4x3_MaxLength(cgFixed4x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed4x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed4x3_MinLength(List<?> cgFixed4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed4x3.size();
    boolean result = length >= 12;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed4x3(), cgFixed4x3, length, 12, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed4x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed4x3_MaxLength(List<?> cgFixed4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed4x3.size();
    boolean result = length <= 12;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed4x3(), cgFixed4x3, length, 12, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed4x4(List<?> cgFixed4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgFixed4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed4x4_MinLength(cgFixed4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed4x4_MaxLength(cgFixed4x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Fixed4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed4x4_MinLength(List<?> cgFixed4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed4x4.size();
    boolean result = length >= 16;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFixed4x4(), cgFixed4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Fixed4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixed4x4_MaxLength(List<?> cgFixed4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFixed4x4.size();
    boolean result = length <= 16;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFixed4x4(), cgFixed4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFixedObject(Float cgFixedObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgFixed_Min(cgFixedObject, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFixed_Max(cgFixedObject, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat(float cgFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat1(float cgFloat1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat1Object(Float cgFloat1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat1x1(List<?> cgFloat1x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat1x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat1x1_MinLength(cgFloat1x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat1x1_MaxLength(cgFloat1x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float1x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat1x1_MinLength(List<?> cgFloat1x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat1x1.size();
    boolean result = length >= 1;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat1x1(), cgFloat1x1, length, 1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float1x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat1x1_MaxLength(List<?> cgFloat1x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat1x1.size();
    boolean result = length <= 1;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat1x1(), cgFloat1x1, length, 1, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat1x2(List<?> cgFloat1x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat1x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat1x2_MinLength(cgFloat1x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat1x2_MaxLength(cgFloat1x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float1x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat1x2_MinLength(List<?> cgFloat1x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat1x2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat1x2(), cgFloat1x2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float1x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat1x2_MaxLength(List<?> cgFloat1x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat1x2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat1x2(), cgFloat1x2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat1x3(List<?> cgFloat1x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat1x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat1x3_MinLength(cgFloat1x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat1x3_MaxLength(cgFloat1x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float1x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat1x3_MinLength(List<?> cgFloat1x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat1x3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat1x3(), cgFloat1x3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float1x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat1x3_MaxLength(List<?> cgFloat1x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat1x3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat1x3(), cgFloat1x3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat1x4(List<?> cgFloat1x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat1x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat1x4_MinLength(cgFloat1x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat1x4_MaxLength(cgFloat1x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float1x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat1x4_MinLength(List<?> cgFloat1x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat1x4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat1x4(), cgFloat1x4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float1x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat1x4_MaxLength(List<?> cgFloat1x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat1x4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat1x4(), cgFloat1x4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat2(List<?> cgFloat2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat2_MinLength(cgFloat2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat2_MaxLength(cgFloat2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat2_MinLength(List<?> cgFloat2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat2(), cgFloat2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat2_MaxLength(List<?> cgFloat2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat2(), cgFloat2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat2x1(List<?> cgFloat2x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat2x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat2x1_MinLength(cgFloat2x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat2x1_MaxLength(cgFloat2x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float2x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat2x1_MinLength(List<?> cgFloat2x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat2x1.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat2x1(), cgFloat2x1, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float2x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat2x1_MaxLength(List<?> cgFloat2x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat2x1.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat2x1(), cgFloat2x1, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat2x2(List<?> cgFloat2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat2x2_MinLength(cgFloat2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat2x2_MaxLength(cgFloat2x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat2x2_MinLength(List<?> cgFloat2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat2x2.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat2x2(), cgFloat2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat2x2_MaxLength(List<?> cgFloat2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat2x2.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat2x2(), cgFloat2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat2x3(List<?> cgFloat2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat2x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat2x3_MinLength(cgFloat2x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat2x3_MaxLength(cgFloat2x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float2x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat2x3_MinLength(List<?> cgFloat2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat2x3.size();
    boolean result = length >= 6;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat2x3(), cgFloat2x3, length, 6, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float2x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat2x3_MaxLength(List<?> cgFloat2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat2x3.size();
    boolean result = length <= 6;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat2x3(), cgFloat2x3, length, 6, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat2x4(List<?> cgFloat2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat2x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat2x4_MinLength(cgFloat2x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat2x4_MaxLength(cgFloat2x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float2x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat2x4_MinLength(List<?> cgFloat2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat2x4.size();
    boolean result = length >= 8;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat2x4(), cgFloat2x4, length, 8, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float2x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat2x4_MaxLength(List<?> cgFloat2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat2x4.size();
    boolean result = length <= 8;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat2x4(), cgFloat2x4, length, 8, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat3(List<?> cgFloat3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat3_MinLength(cgFloat3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat3_MaxLength(cgFloat3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat3_MinLength(List<?> cgFloat3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat3(), cgFloat3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat3_MaxLength(List<?> cgFloat3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat3(), cgFloat3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat3x1(List<?> cgFloat3x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat3x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat3x1_MinLength(cgFloat3x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat3x1_MaxLength(cgFloat3x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float3x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat3x1_MinLength(List<?> cgFloat3x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat3x1.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat3x1(), cgFloat3x1, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float3x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat3x1_MaxLength(List<?> cgFloat3x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat3x1.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat3x1(), cgFloat3x1, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat3x2(List<?> cgFloat3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat3x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat3x2_MinLength(cgFloat3x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat3x2_MaxLength(cgFloat3x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float3x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat3x2_MinLength(List<?> cgFloat3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat3x2.size();
    boolean result = length >= 6;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat3x2(), cgFloat3x2, length, 6, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float3x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat3x2_MaxLength(List<?> cgFloat3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat3x2.size();
    boolean result = length <= 6;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat3x2(), cgFloat3x2, length, 6, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat3x3(List<?> cgFloat3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat3x3_MinLength(cgFloat3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat3x3_MaxLength(cgFloat3x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat3x3_MinLength(List<?> cgFloat3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat3x3.size();
    boolean result = length >= 9;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat3x3(), cgFloat3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat3x3_MaxLength(List<?> cgFloat3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat3x3.size();
    boolean result = length <= 9;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat3x3(), cgFloat3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat3x4(List<?> cgFloat3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat3x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat3x4_MinLength(cgFloat3x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat3x4_MaxLength(cgFloat3x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float3x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat3x4_MinLength(List<?> cgFloat3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat3x4.size();
    boolean result = length >= 12;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat3x4(), cgFloat3x4, length, 12, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float3x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat3x4_MaxLength(List<?> cgFloat3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat3x4.size();
    boolean result = length <= 12;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat3x4(), cgFloat3x4, length, 12, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat4(List<?> cgFloat4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat4_MinLength(cgFloat4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat4_MaxLength(cgFloat4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat4_MinLength(List<?> cgFloat4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat4(), cgFloat4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat4_MaxLength(List<?> cgFloat4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat4(), cgFloat4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat4x1(List<?> cgFloat4x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat4x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat4x1_MinLength(cgFloat4x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat4x1_MaxLength(cgFloat4x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float4x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat4x1_MinLength(List<?> cgFloat4x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat4x1.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat4x1(), cgFloat4x1, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float4x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat4x1_MaxLength(List<?> cgFloat4x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat4x1.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat4x1(), cgFloat4x1, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat4x2(List<?> cgFloat4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat4x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat4x2_MinLength(cgFloat4x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat4x2_MaxLength(cgFloat4x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float4x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat4x2_MinLength(List<?> cgFloat4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat4x2.size();
    boolean result = length >= 8;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat4x2(), cgFloat4x2, length, 8, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float4x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat4x2_MaxLength(List<?> cgFloat4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat4x2.size();
    boolean result = length <= 8;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat4x2(), cgFloat4x2, length, 8, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat4x3(List<?> cgFloat4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat4x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat4x3_MinLength(cgFloat4x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat4x3_MaxLength(cgFloat4x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float4x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat4x3_MinLength(List<?> cgFloat4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat4x3.size();
    boolean result = length >= 12;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat4x3(), cgFloat4x3, length, 12, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float4x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat4x3_MaxLength(List<?> cgFloat4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat4x3.size();
    boolean result = length <= 12;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat4x3(), cgFloat4x3, length, 12, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat4x4(List<?> cgFloat4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgFloat4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat4x4_MinLength(cgFloat4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgFloat4x4_MaxLength(cgFloat4x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Float4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat4x4_MinLength(List<?> cgFloat4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat4x4.size();
    boolean result = length >= 16;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgFloat4x4(), cgFloat4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Float4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloat4x4_MaxLength(List<?> cgFloat4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgFloat4x4.size();
    boolean result = length <= 16;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgFloat4x4(), cgFloat4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgFloatObject(Float cgFloatObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf(float cgHalf, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf1(float cgHalf1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf1Object(Float cgHalf1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf1x1(List<?> cgHalf1x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf1x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf1x1_MinLength(cgHalf1x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf1x1_MaxLength(cgHalf1x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half1x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf1x1_MinLength(List<?> cgHalf1x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf1x1.size();
    boolean result = length >= 1;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf1x1(), cgHalf1x1, length, 1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half1x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf1x1_MaxLength(List<?> cgHalf1x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf1x1.size();
    boolean result = length <= 1;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf1x1(), cgHalf1x1, length, 1, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf1x2(List<?> cgHalf1x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf1x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf1x2_MinLength(cgHalf1x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf1x2_MaxLength(cgHalf1x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half1x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf1x2_MinLength(List<?> cgHalf1x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf1x2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf1x2(), cgHalf1x2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half1x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf1x2_MaxLength(List<?> cgHalf1x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf1x2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf1x2(), cgHalf1x2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf1x3(List<?> cgHalf1x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf1x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf1x3_MinLength(cgHalf1x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf1x3_MaxLength(cgHalf1x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half1x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf1x3_MinLength(List<?> cgHalf1x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf1x3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf1x3(), cgHalf1x3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half1x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf1x3_MaxLength(List<?> cgHalf1x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf1x3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf1x3(), cgHalf1x3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf1x4(List<?> cgHalf1x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf1x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf1x4_MinLength(cgHalf1x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf1x4_MaxLength(cgHalf1x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half1x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf1x4_MinLength(List<?> cgHalf1x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf1x4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf1x4(), cgHalf1x4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half1x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf1x4_MaxLength(List<?> cgHalf1x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf1x4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf1x4(), cgHalf1x4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf2(List<?> cgHalf2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf2_MinLength(cgHalf2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf2_MaxLength(cgHalf2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf2_MinLength(List<?> cgHalf2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf2(), cgHalf2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf2_MaxLength(List<?> cgHalf2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf2(), cgHalf2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf2x1(List<?> cgHalf2x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf2x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf2x1_MinLength(cgHalf2x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf2x1_MaxLength(cgHalf2x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half2x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf2x1_MinLength(List<?> cgHalf2x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf2x1.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf2x1(), cgHalf2x1, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half2x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf2x1_MaxLength(List<?> cgHalf2x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf2x1.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf2x1(), cgHalf2x1, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf2x2(List<?> cgHalf2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf2x2_MinLength(cgHalf2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf2x2_MaxLength(cgHalf2x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf2x2_MinLength(List<?> cgHalf2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf2x2.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf2x2(), cgHalf2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf2x2_MaxLength(List<?> cgHalf2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf2x2.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf2x2(), cgHalf2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf2x3(List<?> cgHalf2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf2x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf2x3_MinLength(cgHalf2x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf2x3_MaxLength(cgHalf2x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half2x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf2x3_MinLength(List<?> cgHalf2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf2x3.size();
    boolean result = length >= 6;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf2x3(), cgHalf2x3, length, 6, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half2x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf2x3_MaxLength(List<?> cgHalf2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf2x3.size();
    boolean result = length <= 6;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf2x3(), cgHalf2x3, length, 6, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf2x4(List<?> cgHalf2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf2x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf2x4_MinLength(cgHalf2x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf2x4_MaxLength(cgHalf2x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half2x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf2x4_MinLength(List<?> cgHalf2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf2x4.size();
    boolean result = length >= 8;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf2x4(), cgHalf2x4, length, 8, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half2x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf2x4_MaxLength(List<?> cgHalf2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf2x4.size();
    boolean result = length <= 8;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf2x4(), cgHalf2x4, length, 8, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf3(List<?> cgHalf3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf3_MinLength(cgHalf3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf3_MaxLength(cgHalf3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf3_MinLength(List<?> cgHalf3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf3(), cgHalf3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf3_MaxLength(List<?> cgHalf3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf3(), cgHalf3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf3x1(List<?> cgHalf3x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf3x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf3x1_MinLength(cgHalf3x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf3x1_MaxLength(cgHalf3x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half3x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf3x1_MinLength(List<?> cgHalf3x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf3x1.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf3x1(), cgHalf3x1, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half3x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf3x1_MaxLength(List<?> cgHalf3x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf3x1.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf3x1(), cgHalf3x1, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf3x2(List<?> cgHalf3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf3x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf3x2_MinLength(cgHalf3x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf3x2_MaxLength(cgHalf3x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half3x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf3x2_MinLength(List<?> cgHalf3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf3x2.size();
    boolean result = length >= 6;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf3x2(), cgHalf3x2, length, 6, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half3x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf3x2_MaxLength(List<?> cgHalf3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf3x2.size();
    boolean result = length <= 6;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf3x2(), cgHalf3x2, length, 6, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf3x3(List<?> cgHalf3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf3x3_MinLength(cgHalf3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf3x3_MaxLength(cgHalf3x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf3x3_MinLength(List<?> cgHalf3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf3x3.size();
    boolean result = length >= 9;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf3x3(), cgHalf3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf3x3_MaxLength(List<?> cgHalf3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf3x3.size();
    boolean result = length <= 9;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf3x3(), cgHalf3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf3x4(List<?> cgHalf3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf3x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf3x4_MinLength(cgHalf3x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf3x4_MaxLength(cgHalf3x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half3x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf3x4_MinLength(List<?> cgHalf3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf3x4.size();
    boolean result = length >= 12;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf3x4(), cgHalf3x4, length, 12, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half3x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf3x4_MaxLength(List<?> cgHalf3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf3x4.size();
    boolean result = length <= 12;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf3x4(), cgHalf3x4, length, 12, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf4(List<?> cgHalf4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf4_MinLength(cgHalf4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf4_MaxLength(cgHalf4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf4_MinLength(List<?> cgHalf4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf4(), cgHalf4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf4_MaxLength(List<?> cgHalf4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf4(), cgHalf4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf4x1(List<?> cgHalf4x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf4x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf4x1_MinLength(cgHalf4x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf4x1_MaxLength(cgHalf4x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half4x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf4x1_MinLength(List<?> cgHalf4x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf4x1.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf4x1(), cgHalf4x1, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half4x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf4x1_MaxLength(List<?> cgHalf4x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf4x1.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf4x1(), cgHalf4x1, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf4x2(List<?> cgHalf4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf4x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf4x2_MinLength(cgHalf4x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf4x2_MaxLength(cgHalf4x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half4x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf4x2_MinLength(List<?> cgHalf4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf4x2.size();
    boolean result = length >= 8;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf4x2(), cgHalf4x2, length, 8, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half4x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf4x2_MaxLength(List<?> cgHalf4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf4x2.size();
    boolean result = length <= 8;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf4x2(), cgHalf4x2, length, 8, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf4x3(List<?> cgHalf4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf4x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf4x3_MinLength(cgHalf4x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf4x3_MaxLength(cgHalf4x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half4x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf4x3_MinLength(List<?> cgHalf4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf4x3.size();
    boolean result = length >= 12;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf4x3(), cgHalf4x3, length, 12, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half4x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf4x3_MaxLength(List<?> cgHalf4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf4x3.size();
    boolean result = length <= 12;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf4x3(), cgHalf4x3, length, 12, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf4x4(List<?> cgHalf4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgHalf4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf4x4_MinLength(cgHalf4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgHalf4x4_MaxLength(cgHalf4x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Half4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf4x4_MinLength(List<?> cgHalf4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf4x4.size();
    boolean result = length >= 16;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgHalf4x4(), cgHalf4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Half4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalf4x4_MaxLength(List<?> cgHalf4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgHalf4x4.size();
    boolean result = length <= 16;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgHalf4x4(), cgHalf4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgHalfObject(Float cgHalfObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgIdentifier(String cgIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt(int cgInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt1(int cgInt1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt1Object(Integer cgInt1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt1x1(List<?> cgInt1x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt1x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt1x1_MinLength(cgInt1x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt1x1_MaxLength(cgInt1x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int1x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt1x1_MinLength(List<?> cgInt1x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt1x1.size();
    boolean result = length >= 1;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt1x1(), cgInt1x1, length, 1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int1x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt1x1_MaxLength(List<?> cgInt1x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt1x1.size();
    boolean result = length <= 1;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt1x1(), cgInt1x1, length, 1, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt1x2(List<?> cgInt1x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt1x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt1x2_MinLength(cgInt1x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt1x2_MaxLength(cgInt1x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int1x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt1x2_MinLength(List<?> cgInt1x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt1x2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt1x2(), cgInt1x2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int1x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt1x2_MaxLength(List<?> cgInt1x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt1x2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt1x2(), cgInt1x2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt1x3(List<?> cgInt1x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt1x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt1x3_MinLength(cgInt1x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt1x3_MaxLength(cgInt1x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int1x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt1x3_MinLength(List<?> cgInt1x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt1x3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt1x3(), cgInt1x3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int1x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt1x3_MaxLength(List<?> cgInt1x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt1x3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt1x3(), cgInt1x3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt1x4(List<?> cgInt1x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt1x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt1x4_MinLength(cgInt1x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt1x4_MaxLength(cgInt1x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int1x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt1x4_MinLength(List<?> cgInt1x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt1x4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt1x4(), cgInt1x4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int1x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt1x4_MaxLength(List<?> cgInt1x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt1x4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt1x4(), cgInt1x4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt2(List<?> cgInt2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt2_MinLength(cgInt2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt2_MaxLength(cgInt2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt2_MinLength(List<?> cgInt2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt2(), cgInt2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt2_MaxLength(List<?> cgInt2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt2(), cgInt2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt2x1(List<?> cgInt2x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt2x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt2x1_MinLength(cgInt2x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt2x1_MaxLength(cgInt2x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int2x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt2x1_MinLength(List<?> cgInt2x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt2x1.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt2x1(), cgInt2x1, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int2x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt2x1_MaxLength(List<?> cgInt2x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt2x1.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt2x1(), cgInt2x1, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt2x2(List<?> cgInt2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt2x2_MinLength(cgInt2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt2x2_MaxLength(cgInt2x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt2x2_MinLength(List<?> cgInt2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt2x2.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt2x2(), cgInt2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt2x2_MaxLength(List<?> cgInt2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt2x2.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt2x2(), cgInt2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt2x3(List<?> cgInt2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt2x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt2x3_MinLength(cgInt2x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt2x3_MaxLength(cgInt2x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int2x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt2x3_MinLength(List<?> cgInt2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt2x3.size();
    boolean result = length >= 6;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt2x3(), cgInt2x3, length, 6, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int2x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt2x3_MaxLength(List<?> cgInt2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt2x3.size();
    boolean result = length <= 6;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt2x3(), cgInt2x3, length, 6, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt2x4(List<?> cgInt2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt2x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt2x4_MinLength(cgInt2x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt2x4_MaxLength(cgInt2x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int2x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt2x4_MinLength(List<?> cgInt2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt2x4.size();
    boolean result = length >= 8;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt2x4(), cgInt2x4, length, 8, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int2x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt2x4_MaxLength(List<?> cgInt2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt2x4.size();
    boolean result = length <= 8;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt2x4(), cgInt2x4, length, 8, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt3(List<?> cgInt3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt3_MinLength(cgInt3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt3_MaxLength(cgInt3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt3_MinLength(List<?> cgInt3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt3(), cgInt3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt3_MaxLength(List<?> cgInt3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt3(), cgInt3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt3x1(List<?> cgInt3x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt3x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt3x1_MinLength(cgInt3x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt3x1_MaxLength(cgInt3x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int3x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt3x1_MinLength(List<?> cgInt3x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt3x1.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt3x1(), cgInt3x1, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int3x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt3x1_MaxLength(List<?> cgInt3x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt3x1.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt3x1(), cgInt3x1, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt3x2(List<?> cgInt3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt3x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt3x2_MinLength(cgInt3x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt3x2_MaxLength(cgInt3x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int3x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt3x2_MinLength(List<?> cgInt3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt3x2.size();
    boolean result = length >= 6;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt3x2(), cgInt3x2, length, 6, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int3x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt3x2_MaxLength(List<?> cgInt3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt3x2.size();
    boolean result = length <= 6;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt3x2(), cgInt3x2, length, 6, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt3x3(List<?> cgInt3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt3x3_MinLength(cgInt3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt3x3_MaxLength(cgInt3x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt3x3_MinLength(List<?> cgInt3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt3x3.size();
    boolean result = length >= 9;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt3x3(), cgInt3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt3x3_MaxLength(List<?> cgInt3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt3x3.size();
    boolean result = length <= 9;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt3x3(), cgInt3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt3x4(List<?> cgInt3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt3x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt3x4_MinLength(cgInt3x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt3x4_MaxLength(cgInt3x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int3x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt3x4_MinLength(List<?> cgInt3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt3x4.size();
    boolean result = length >= 12;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt3x4(), cgInt3x4, length, 12, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int3x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt3x4_MaxLength(List<?> cgInt3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt3x4.size();
    boolean result = length <= 12;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt3x4(), cgInt3x4, length, 12, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt4(List<?> cgInt4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt4_MinLength(cgInt4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt4_MaxLength(cgInt4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt4_MinLength(List<?> cgInt4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt4(), cgInt4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt4_MaxLength(List<?> cgInt4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt4(), cgInt4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt4x1(List<?> cgInt4x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt4x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt4x1_MinLength(cgInt4x1, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt4x1_MaxLength(cgInt4x1, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int4x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt4x1_MinLength(List<?> cgInt4x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt4x1.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt4x1(), cgInt4x1, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int4x1</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt4x1_MaxLength(List<?> cgInt4x1, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt4x1.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt4x1(), cgInt4x1, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt4x2(List<?> cgInt4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt4x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt4x2_MinLength(cgInt4x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt4x2_MaxLength(cgInt4x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int4x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt4x2_MinLength(List<?> cgInt4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt4x2.size();
    boolean result = length >= 8;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt4x2(), cgInt4x2, length, 8, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int4x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt4x2_MaxLength(List<?> cgInt4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt4x2.size();
    boolean result = length <= 8;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt4x2(), cgInt4x2, length, 8, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt4x3(List<?> cgInt4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt4x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt4x3_MinLength(cgInt4x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt4x3_MaxLength(cgInt4x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int4x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt4x3_MinLength(List<?> cgInt4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt4x3.size();
    boolean result = length >= 12;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt4x3(), cgInt4x3, length, 12, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int4x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt4x3_MaxLength(List<?> cgInt4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt4x3.size();
    boolean result = length <= 12;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt4x3(), cgInt4x3, length, 12, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt4x4(List<?> cgInt4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgInt4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt4x4_MinLength(cgInt4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateCgInt4x4_MaxLength(cgInt4x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Cg Int4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt4x4_MinLength(List<?> cgInt4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt4x4.size();
    boolean result = length >= 16;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getCgInt4x4(), cgInt4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Cg Int4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgInt4x4_MaxLength(List<?> cgInt4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = cgInt4x4.size();
    boolean result = length <= 16;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getCgInt4x4(), cgInt4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgIntObject(Integer cgIntObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgListOfBool(List<?> cgListOfBool, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfBool_ItemType(cgListOfBool, diagnostics, context);
    return result;
  }

	/**
   * Validates the ItemType constraint of '<em>Cg List Of Bool</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgListOfBool_ItemType(List<?> cgListOfBool, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = true;
    for (Iterator<?> i = cgListOfBool.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (ColladaPackage.eINSTANCE.getCgBool().isInstance(item))
      {
        result &= validateCgBool((Boolean)item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(ColladaPackage.eINSTANCE.getCgBool(), item, diagnostics, context);
      }
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgListOfFixed(List<?> cgListOfFixed, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFixed_ItemType(cgListOfFixed, diagnostics, context);
    return result;
  }

	/**
   * Validates the ItemType constraint of '<em>Cg List Of Fixed</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgListOfFixed_ItemType(List<?> cgListOfFixed, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = true;
    for (Iterator<?> i = cgListOfFixed.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (ColladaPackage.eINSTANCE.getCgFixed().isInstance(item))
      {
        result &= validateCgFixed((Float)item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(ColladaPackage.eINSTANCE.getCgFixed(), item, diagnostics, context);
      }
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgListOfFloat(List<?> cgListOfFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfFloat_ItemType(cgListOfFloat, diagnostics, context);
    return result;
  }

	/**
   * Validates the ItemType constraint of '<em>Cg List Of Float</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgListOfFloat_ItemType(List<?> cgListOfFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = true;
    for (Iterator<?> i = cgListOfFloat.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (ColladaPackage.eINSTANCE.getCgFloat().isInstance(item))
      {
        result &= validateCgFloat((Float)item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(ColladaPackage.eINSTANCE.getCgFloat(), item, diagnostics, context);
      }
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgListOfHalf(List<?> cgListOfHalf, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfHalf_ItemType(cgListOfHalf, diagnostics, context);
    return result;
  }

	/**
   * Validates the ItemType constraint of '<em>Cg List Of Half</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgListOfHalf_ItemType(List<?> cgListOfHalf, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = true;
    for (Iterator<?> i = cgListOfHalf.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (ColladaPackage.eINSTANCE.getCgHalf().isInstance(item))
      {
        result &= validateCgHalf((Float)item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(ColladaPackage.eINSTANCE.getCgHalf(), item, diagnostics, context);
      }
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgListOfInt(List<?> cgListOfInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCgListOfInt_ItemType(cgListOfInt, diagnostics, context);
    return result;
  }

	/**
   * Validates the ItemType constraint of '<em>Cg List Of Int</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgListOfInt_ItemType(List<?> cgListOfInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = true;
    for (Iterator<?> i = cgListOfInt.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (ColladaPackage.eINSTANCE.getCgInt().isInstance(item))
      {
        result &= validateCgInt((Integer)item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(ColladaPackage.eINSTANCE.getCgInt(), item, diagnostics, context);
      }
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCgPipelineStageObject(CgPipelineStage cgPipelineStageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCommonProfileInputObject(CommonProfileInput commonProfileInputObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCommonProfileParamObject(CommonProfileParam commonProfileParamObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDateTime(XMLGregorianCalendar dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat(double float_, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat2(List<?> float2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfFloats_ItemType(float2, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat2_MinLength(float2, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat2_MaxLength(float2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Float2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat2_MinLength(List<?> float2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getFloat2(), float2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Float2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat2_MaxLength(List<?> float2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getFloat2(), float2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat2x2(List<?> float2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfFloats_ItemType(float2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat2x2_MinLength(float2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat2x2_MaxLength(float2x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Float2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat2x2_MinLength(List<?> float2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float2x2.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getFloat2x2(), float2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Float2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat2x2_MaxLength(List<?> float2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float2x2.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getFloat2x2(), float2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat2x3(List<?> float2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfFloats_ItemType(float2x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat2x3_MinLength(float2x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat2x3_MaxLength(float2x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Float2x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat2x3_MinLength(List<?> float2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float2x3.size();
    boolean result = length >= 6;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getFloat2x3(), float2x3, length, 6, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Float2x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat2x3_MaxLength(List<?> float2x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float2x3.size();
    boolean result = length <= 6;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getFloat2x3(), float2x3, length, 6, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat2x4(List<?> float2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfFloats_ItemType(float2x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat2x4_MinLength(float2x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat2x4_MaxLength(float2x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Float2x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat2x4_MinLength(List<?> float2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float2x4.size();
    boolean result = length >= 8;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getFloat2x4(), float2x4, length, 8, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Float2x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat2x4_MaxLength(List<?> float2x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float2x4.size();
    boolean result = length <= 8;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getFloat2x4(), float2x4, length, 8, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat3(List<?> float3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfFloats_ItemType(float3, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat3_MinLength(float3, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat3_MaxLength(float3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Float3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat3_MinLength(List<?> float3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getFloat3(), float3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Float3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat3_MaxLength(List<?> float3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getFloat3(), float3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat3x2(List<?> float3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfFloats_ItemType(float3x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat3x2_MinLength(float3x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat3x2_MaxLength(float3x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Float3x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat3x2_MinLength(List<?> float3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float3x2.size();
    boolean result = length >= 6;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getFloat3x2(), float3x2, length, 6, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Float3x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat3x2_MaxLength(List<?> float3x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float3x2.size();
    boolean result = length <= 6;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getFloat3x2(), float3x2, length, 6, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat3x3(List<?> float3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfFloats_ItemType(float3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat3x3_MinLength(float3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat3x3_MaxLength(float3x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Float3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat3x3_MinLength(List<?> float3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float3x3.size();
    boolean result = length >= 9;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getFloat3x3(), float3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Float3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat3x3_MaxLength(List<?> float3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float3x3.size();
    boolean result = length <= 9;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getFloat3x3(), float3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat3x4(List<?> float3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfFloats_ItemType(float3x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat3x4_MinLength(float3x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat3x4_MaxLength(float3x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Float3x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat3x4_MinLength(List<?> float3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float3x4.size();
    boolean result = length >= 12;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getFloat3x4(), float3x4, length, 12, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Float3x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat3x4_MaxLength(List<?> float3x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float3x4.size();
    boolean result = length <= 12;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getFloat3x4(), float3x4, length, 12, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat4(List<?> float4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfFloats_ItemType(float4, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat4_MinLength(float4, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat4_MaxLength(float4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Float4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat4_MinLength(List<?> float4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getFloat4(), float4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Float4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat4_MaxLength(List<?> float4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getFloat4(), float4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat4x2(List<?> float4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfFloats_ItemType(float4x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat4x2_MinLength(float4x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat4x2_MaxLength(float4x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Float4x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat4x2_MinLength(List<?> float4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float4x2.size();
    boolean result = length >= 8;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getFloat4x2(), float4x2, length, 8, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Float4x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat4x2_MaxLength(List<?> float4x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float4x2.size();
    boolean result = length <= 8;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getFloat4x2(), float4x2, length, 8, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat4x3(List<?> float4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfFloats_ItemType(float4x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat4x3_MinLength(float4x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat4x3_MaxLength(float4x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Float4x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat4x3_MinLength(List<?> float4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float4x3.size();
    boolean result = length >= 12;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getFloat4x3(), float4x3, length, 12, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Float4x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat4x3_MaxLength(List<?> float4x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float4x3.size();
    boolean result = length <= 12;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getFloat4x3(), float4x3, length, 12, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat4x4(List<?> float4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfFloats_ItemType(float4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat4x4_MinLength(float4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat4x4_MaxLength(float4x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Float4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat4x4_MinLength(List<?> float4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float4x4.size();
    boolean result = length >= 16;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getFloat4x4(), float4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Float4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat4x4_MaxLength(List<?> float4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float4x4.size();
    boolean result = length <= 16;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getFloat4x4(), float4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat7(List<?> float7, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfFloats_ItemType(float7, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat7_MinLength(float7, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat7_MaxLength(float7, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Float7</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat7_MinLength(List<?> float7, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float7.size();
    boolean result = length >= 7;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getFloat7(), float7, length, 7, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Float7</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloat7_MaxLength(List<?> float7, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = float7.size();
    boolean result = length <= 7;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getFloat7(), float7, length, 7, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFloatObject(Double floatObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxColorCommon(List<?> fxColorCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateFloat4_MinLength(fxColorCommon, diagnostics, context);
    if (result || diagnostics != null) result &= validateFloat4_MaxLength(fxColorCommon, diagnostics, context);
    if (result || diagnostics != null) result &= validateListOfFloats_ItemType(fxColorCommon, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxDrawCommon(String fxDrawCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxModifierEnumCommonObject(FxModifierEnumCommon fxModifierEnumCommonObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxOpaqueEnumObject(FxOpaqueEnum fxOpaqueEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxPipelineStageCommonObject(FxPipelineStageCommon fxPipelineStageCommonObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSamplerFilterCommonObject(FxSamplerFilterCommon fxSamplerFilterCommonObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSamplerWrapCommonObject(FxSamplerWrapCommon fxSamplerWrapCommonObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceFaceEnumObject(FxSurfaceFaceEnum fxSurfaceFaceEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceFormatHintChannelsEnumObject(FxSurfaceFormatHintChannelsEnum fxSurfaceFormatHintChannelsEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceFormatHintOptionEnumObject(FxSurfaceFormatHintOptionEnum fxSurfaceFormatHintOptionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceFormatHintPrecisionEnumObject(FxSurfaceFormatHintPrecisionEnum fxSurfaceFormatHintPrecisionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceFormatHintRangeEnumObject(FxSurfaceFormatHintRangeEnum fxSurfaceFormatHintRangeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFxSurfaceTypeEnumObject(FxSurfaceTypeEnum fxSurfaceTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlAlphaValueType(float glAlphaValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlAlphaValueType_Min(glAlphaValueType, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlAlphaValueType_Max(glAlphaValueType, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateGlAlphaValueType_Min
   */
	public static final float GL_ALPHA_VALUE_TYPE__MIN__VALUE = 0.0F;

	/**
   * Validates the Min constraint of '<em>Gl Alpha Value Type</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlAlphaValueType_Min(float glAlphaValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = glAlphaValueType >= GL_ALPHA_VALUE_TYPE__MIN__VALUE;
    if (!result && diagnostics != null)
      reportMinViolation(ColladaPackage.eINSTANCE.getGlAlphaValueType(), glAlphaValueType, GL_ALPHA_VALUE_TYPE__MIN__VALUE, true, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateGlAlphaValueType_Max
   */
	public static final float GL_ALPHA_VALUE_TYPE__MAX__VALUE = 1.0F;

	/**
   * Validates the Max constraint of '<em>Gl Alpha Value Type</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlAlphaValueType_Max(float glAlphaValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = glAlphaValueType <= GL_ALPHA_VALUE_TYPE__MAX__VALUE;
    if (!result && diagnostics != null)
      reportMaxViolation(ColladaPackage.eINSTANCE.getGlAlphaValueType(), glAlphaValueType, GL_ALPHA_VALUE_TYPE__MAX__VALUE, true, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlAlphaValueTypeObject(Float glAlphaValueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlAlphaValueType_Min(glAlphaValueTypeObject, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlAlphaValueType_Max(glAlphaValueTypeObject, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlBlendEquationTypeObject(GlBlendEquationType glBlendEquationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlBlendTypeObject(GlBlendType glBlendTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlEnumeration(Enumerator glEnumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlEnumeration_MemberTypes(glEnumeration, diagnostics, context);
    return result;
  }

	/**
   * Validates the MemberTypes constraint of '<em>Gl Enumeration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlEnumeration_MemberTypes(Enumerator glEnumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (diagnostics != null)
    {
      BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
      if (ColladaPackage.eINSTANCE.getGlBlendType().isInstance(glEnumeration))
      {
        if (validateGlBlendType((GlBlendType)glEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFaceType().isInstance(glEnumeration))
      {
        if (validateGlFaceType((GlFaceType)glEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlBlendEquationType().isInstance(glEnumeration))
      {
        if (validateGlBlendEquationType((GlBlendEquationType)glEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFuncType().isInstance(glEnumeration))
      {
        if (validateGlFuncType((GlFuncType)glEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlStencilOpType().isInstance(glEnumeration))
      {
        if (validateGlStencilOpType((GlStencilOpType)glEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlMaterialType().isInstance(glEnumeration))
      {
        if (validateGlMaterialType((GlMaterialType)glEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFogType().isInstance(glEnumeration))
      {
        if (validateGlFogType((GlFogType)glEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFogCoordSrcType().isInstance(glEnumeration))
      {
        if (validateGlFogCoordSrcType((GlFogCoordSrcType)glEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFrontFaceType().isInstance(glEnumeration))
      {
        if (validateGlFrontFaceType((GlFrontFaceType)glEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlLightModelColorControlType().isInstance(glEnumeration))
      {
        if (validateGlLightModelColorControlType((GlLightModelColorControlType)glEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlLogicOpType().isInstance(glEnumeration))
      {
        if (validateGlLogicOpType((GlLogicOpType)glEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlPolygonModeType().isInstance(glEnumeration))
      {
        if (validateGlPolygonModeType((GlPolygonModeType)glEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlShadeModelType().isInstance(glEnumeration))
      {
        if (validateGlShadeModelType((GlShadeModelType)glEnumeration, tempDiagnostics, context)) return true;
      }
      for (Diagnostic diagnostic : tempDiagnostics.getChildren())
      {
        diagnostics.add(diagnostic);
      }
    }
    else
    {
      if (ColladaPackage.eINSTANCE.getGlBlendType().isInstance(glEnumeration))
      {
        if (validateGlBlendType((GlBlendType)glEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFaceType().isInstance(glEnumeration))
      {
        if (validateGlFaceType((GlFaceType)glEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlBlendEquationType().isInstance(glEnumeration))
      {
        if (validateGlBlendEquationType((GlBlendEquationType)glEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFuncType().isInstance(glEnumeration))
      {
        if (validateGlFuncType((GlFuncType)glEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlStencilOpType().isInstance(glEnumeration))
      {
        if (validateGlStencilOpType((GlStencilOpType)glEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlMaterialType().isInstance(glEnumeration))
      {
        if (validateGlMaterialType((GlMaterialType)glEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFogType().isInstance(glEnumeration))
      {
        if (validateGlFogType((GlFogType)glEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFogCoordSrcType().isInstance(glEnumeration))
      {
        if (validateGlFogCoordSrcType((GlFogCoordSrcType)glEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFrontFaceType().isInstance(glEnumeration))
      {
        if (validateGlFrontFaceType((GlFrontFaceType)glEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlLightModelColorControlType().isInstance(glEnumeration))
      {
        if (validateGlLightModelColorControlType((GlLightModelColorControlType)glEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlLogicOpType().isInstance(glEnumeration))
      {
        if (validateGlLogicOpType((GlLogicOpType)glEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlPolygonModeType().isInstance(glEnumeration))
      {
        if (validateGlPolygonModeType((GlPolygonModeType)glEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlShadeModelType().isInstance(glEnumeration))
      {
        if (validateGlShadeModelType((GlShadeModelType)glEnumeration, null, context)) return true;
      }
    }
    return false;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesEnumeration(Enumerator glesEnumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlesEnumeration_MemberTypes(glesEnumeration, diagnostics, context);
    return result;
  }

	/**
   * Validates the MemberTypes constraint of '<em>Gles Enumeration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesEnumeration_MemberTypes(Enumerator glesEnumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (diagnostics != null)
    {
      BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
      if (ColladaPackage.eINSTANCE.getGlBlendType().isInstance(glesEnumeration))
      {
        if (validateGlBlendType((GlBlendType)glesEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFaceType().isInstance(glesEnumeration))
      {
        if (validateGlFaceType((GlFaceType)glesEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFuncType().isInstance(glesEnumeration))
      {
        if (validateGlFuncType((GlFuncType)glesEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlStencilOpType().isInstance(glesEnumeration))
      {
        if (validateGlStencilOpType((GlStencilOpType)glesEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlMaterialType().isInstance(glesEnumeration))
      {
        if (validateGlMaterialType((GlMaterialType)glesEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFogType().isInstance(glesEnumeration))
      {
        if (validateGlFogType((GlFogType)glesEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFrontFaceType().isInstance(glesEnumeration))
      {
        if (validateGlFrontFaceType((GlFrontFaceType)glesEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlLightModelColorControlType().isInstance(glesEnumeration))
      {
        if (validateGlLightModelColorControlType((GlLightModelColorControlType)glesEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlLogicOpType().isInstance(glesEnumeration))
      {
        if (validateGlLogicOpType((GlLogicOpType)glesEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlPolygonModeType().isInstance(glesEnumeration))
      {
        if (validateGlPolygonModeType((GlPolygonModeType)glesEnumeration, tempDiagnostics, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlShadeModelType().isInstance(glesEnumeration))
      {
        if (validateGlShadeModelType((GlShadeModelType)glesEnumeration, tempDiagnostics, context)) return true;
      }
      for (Diagnostic diagnostic : tempDiagnostics.getChildren())
      {
        diagnostics.add(diagnostic);
      }
    }
    else
    {
      if (ColladaPackage.eINSTANCE.getGlBlendType().isInstance(glesEnumeration))
      {
        if (validateGlBlendType((GlBlendType)glesEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFaceType().isInstance(glesEnumeration))
      {
        if (validateGlFaceType((GlFaceType)glesEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFuncType().isInstance(glesEnumeration))
      {
        if (validateGlFuncType((GlFuncType)glesEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlStencilOpType().isInstance(glesEnumeration))
      {
        if (validateGlStencilOpType((GlStencilOpType)glesEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlMaterialType().isInstance(glesEnumeration))
      {
        if (validateGlMaterialType((GlMaterialType)glesEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFogType().isInstance(glesEnumeration))
      {
        if (validateGlFogType((GlFogType)glesEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlFrontFaceType().isInstance(glesEnumeration))
      {
        if (validateGlFrontFaceType((GlFrontFaceType)glesEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlLightModelColorControlType().isInstance(glesEnumeration))
      {
        if (validateGlLightModelColorControlType((GlLightModelColorControlType)glesEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlLogicOpType().isInstance(glesEnumeration))
      {
        if (validateGlLogicOpType((GlLogicOpType)glesEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlPolygonModeType().isInstance(glesEnumeration))
      {
        if (validateGlPolygonModeType((GlPolygonModeType)glesEnumeration, null, context)) return true;
      }
      if (ColladaPackage.eINSTANCE.getGlShadeModelType().isInstance(glesEnumeration))
      {
        if (validateGlShadeModelType((GlShadeModelType)glesEnumeration, null, context)) return true;
      }
    }
    return false;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLESMAXCLIPPLANESIndex(BigInteger glesmaxclipplanesIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGLESMAXCLIPPLANESIndex_Min(glesmaxclipplanesIndex, diagnostics, context);
    if (result || diagnostics != null) result &= validateGLESMAXCLIPPLANESIndex_Max(glesmaxclipplanesIndex, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateGLESMAXCLIPPLANESIndex_Min
   */
	public static final BigInteger GLESMAXCLIPPLANES_INDEX__MIN__VALUE = new BigInteger("0");

	/**
   * Validates the Min constraint of '<em>GLESMAXCLIPPLANES Index</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLESMAXCLIPPLANESIndex_Min(BigInteger glesmaxclipplanesIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = glesmaxclipplanesIndex.compareTo(GLESMAXCLIPPLANES_INDEX__MIN__VALUE) >= 0;
    if (!result && diagnostics != null)
      reportMinViolation(ColladaPackage.eINSTANCE.getGLESMAXCLIPPLANESIndex(), glesmaxclipplanesIndex, GLESMAXCLIPPLANES_INDEX__MIN__VALUE, true, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateGLESMAXCLIPPLANESIndex_Max
   */
	public static final BigInteger GLESMAXCLIPPLANES_INDEX__MAX__VALUE = new BigInteger("5");

	/**
   * Validates the Max constraint of '<em>GLESMAXCLIPPLANES Index</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLESMAXCLIPPLANESIndex_Max(BigInteger glesmaxclipplanesIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = glesmaxclipplanesIndex.compareTo(GLESMAXCLIPPLANES_INDEX__MAX__VALUE) < 0;
    if (!result && diagnostics != null)
      reportMaxViolation(ColladaPackage.eINSTANCE.getGLESMAXCLIPPLANESIndex(), glesmaxclipplanesIndex, GLESMAXCLIPPLANES_INDEX__MAX__VALUE, false, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLESMAXLIGHTSIndex(BigInteger glesmaxlightsIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGLESMAXLIGHTSIndex_Min(glesmaxlightsIndex, diagnostics, context);
    if (result || diagnostics != null) result &= validateGLESMAXLIGHTSIndex_Max(glesmaxlightsIndex, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateGLESMAXLIGHTSIndex_Min
   */
	public static final BigInteger GLESMAXLIGHTS_INDEX__MIN__VALUE = new BigInteger("0");

	/**
   * Validates the Min constraint of '<em>GLESMAXLIGHTS Index</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLESMAXLIGHTSIndex_Min(BigInteger glesmaxlightsIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = glesmaxlightsIndex.compareTo(GLESMAXLIGHTS_INDEX__MIN__VALUE) >= 0;
    if (!result && diagnostics != null)
      reportMinViolation(ColladaPackage.eINSTANCE.getGLESMAXLIGHTSIndex(), glesmaxlightsIndex, GLESMAXLIGHTS_INDEX__MIN__VALUE, true, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateGLESMAXLIGHTSIndex_Max
   */
	public static final BigInteger GLESMAXLIGHTS_INDEX__MAX__VALUE = new BigInteger("7");

	/**
   * Validates the Max constraint of '<em>GLESMAXLIGHTS Index</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLESMAXLIGHTSIndex_Max(BigInteger glesmaxlightsIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = glesmaxlightsIndex.compareTo(GLESMAXLIGHTS_INDEX__MAX__VALUE) < 0;
    if (!result && diagnostics != null)
      reportMaxViolation(ColladaPackage.eINSTANCE.getGLESMAXLIGHTSIndex(), glesmaxlightsIndex, GLESMAXLIGHTS_INDEX__MAX__VALUE, false, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLESMAXTEXTURECOORDSIndex(BigInteger glesmaxtexturecoordsIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGLESMAXTEXTURECOORDSIndex_Min(glesmaxtexturecoordsIndex, diagnostics, context);
    if (result || diagnostics != null) result &= validateGLESMAXTEXTURECOORDSIndex_Max(glesmaxtexturecoordsIndex, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateGLESMAXTEXTURECOORDSIndex_Min
   */
	public static final BigInteger GLESMAXTEXTURECOORDS_INDEX__MIN__VALUE = new BigInteger("0");

	/**
   * Validates the Min constraint of '<em>GLESMAXTEXTURECOORDS Index</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLESMAXTEXTURECOORDSIndex_Min(BigInteger glesmaxtexturecoordsIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = glesmaxtexturecoordsIndex.compareTo(GLESMAXTEXTURECOORDS_INDEX__MIN__VALUE) >= 0;
    if (!result && diagnostics != null)
      reportMinViolation(ColladaPackage.eINSTANCE.getGLESMAXTEXTURECOORDSIndex(), glesmaxtexturecoordsIndex, GLESMAXTEXTURECOORDS_INDEX__MIN__VALUE, true, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateGLESMAXTEXTURECOORDSIndex_Max
   */
	public static final BigInteger GLESMAXTEXTURECOORDS_INDEX__MAX__VALUE = new BigInteger("8");

	/**
   * Validates the Max constraint of '<em>GLESMAXTEXTURECOORDS Index</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLESMAXTEXTURECOORDSIndex_Max(BigInteger glesmaxtexturecoordsIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = glesmaxtexturecoordsIndex.compareTo(GLESMAXTEXTURECOORDS_INDEX__MAX__VALUE) < 0;
    if (!result && diagnostics != null)
      reportMaxViolation(ColladaPackage.eINSTANCE.getGLESMAXTEXTURECOORDSIndex(), glesmaxtexturecoordsIndex, GLESMAXTEXTURECOORDS_INDEX__MAX__VALUE, false, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLESMAXTEXTUREIMAGEUNITSIndex(BigInteger glesmaxtextureimageunitsIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGLESMAXTEXTUREIMAGEUNITSIndex_Min(glesmaxtextureimageunitsIndex, diagnostics, context);
    if (result || diagnostics != null) result &= validateGLESMAXTEXTUREIMAGEUNITSIndex_Max(glesmaxtextureimageunitsIndex, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateGLESMAXTEXTUREIMAGEUNITSIndex_Min
   */
	public static final BigInteger GLESMAXTEXTUREIMAGEUNITS_INDEX__MIN__VALUE = new BigInteger("0");

	/**
   * Validates the Min constraint of '<em>GLESMAXTEXTUREIMAGEUNITS Index</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLESMAXTEXTUREIMAGEUNITSIndex_Min(BigInteger glesmaxtextureimageunitsIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = glesmaxtextureimageunitsIndex.compareTo(GLESMAXTEXTUREIMAGEUNITS_INDEX__MIN__VALUE) >= 0;
    if (!result && diagnostics != null)
      reportMinViolation(ColladaPackage.eINSTANCE.getGLESMAXTEXTUREIMAGEUNITSIndex(), glesmaxtextureimageunitsIndex, GLESMAXTEXTUREIMAGEUNITS_INDEX__MIN__VALUE, true, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateGLESMAXTEXTUREIMAGEUNITSIndex_Max
   */
	public static final BigInteger GLESMAXTEXTUREIMAGEUNITS_INDEX__MAX__VALUE = new BigInteger("31");

	/**
   * Validates the Max constraint of '<em>GLESMAXTEXTUREIMAGEUNITS Index</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLESMAXTEXTUREIMAGEUNITSIndex_Max(BigInteger glesmaxtextureimageunitsIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = glesmaxtextureimageunitsIndex.compareTo(GLESMAXTEXTUREIMAGEUNITS_INDEX__MAX__VALUE) < 0;
    if (!result && diagnostics != null)
      reportMaxViolation(ColladaPackage.eINSTANCE.getGLESMAXTEXTUREIMAGEUNITSIndex(), glesmaxtextureimageunitsIndex, GLESMAXTEXTUREIMAGEUNITS_INDEX__MAX__VALUE, false, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesRendertargetCommon(String glesRendertargetCommon, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = xmlTypeValidator.validateNCName_Pattern(glesRendertargetCommon, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesSamplerWrapObject(GlesSamplerWrap glesSamplerWrapObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesStencilOpTypeObject(GlesStencilOpType glesStencilOpTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerArgumentIndexType(BigInteger glesTexcombinerArgumentIndexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlesTexcombinerArgumentIndexType_Min(glesTexcombinerArgumentIndexType, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlesTexcombinerArgumentIndexType_Max(glesTexcombinerArgumentIndexType, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateGlesTexcombinerArgumentIndexType_Min
   */
	public static final BigInteger GLES_TEXCOMBINER_ARGUMENT_INDEX_TYPE__MIN__VALUE = new BigInteger("0");

	/**
   * Validates the Min constraint of '<em>Gles Texcombiner Argument Index Type</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerArgumentIndexType_Min(BigInteger glesTexcombinerArgumentIndexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = glesTexcombinerArgumentIndexType.compareTo(GLES_TEXCOMBINER_ARGUMENT_INDEX_TYPE__MIN__VALUE) >= 0;
    if (!result && diagnostics != null)
      reportMinViolation(ColladaPackage.eINSTANCE.getGlesTexcombinerArgumentIndexType(), glesTexcombinerArgumentIndexType, GLES_TEXCOMBINER_ARGUMENT_INDEX_TYPE__MIN__VALUE, true, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateGlesTexcombinerArgumentIndexType_Max
   */
	public static final BigInteger GLES_TEXCOMBINER_ARGUMENT_INDEX_TYPE__MAX__VALUE = new BigInteger("2");

	/**
   * Validates the Max constraint of '<em>Gles Texcombiner Argument Index Type</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerArgumentIndexType_Max(BigInteger glesTexcombinerArgumentIndexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = glesTexcombinerArgumentIndexType.compareTo(GLES_TEXCOMBINER_ARGUMENT_INDEX_TYPE__MAX__VALUE) <= 0;
    if (!result && diagnostics != null)
      reportMaxViolation(ColladaPackage.eINSTANCE.getGlesTexcombinerArgumentIndexType(), glesTexcombinerArgumentIndexType, GLES_TEXCOMBINER_ARGUMENT_INDEX_TYPE__MAX__VALUE, true, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerOperandAlphaEnumsObject(GlesTexcombinerOperandAlphaEnums glesTexcombinerOperandAlphaEnumsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerOperandRGBEnumsObject(GlesTexcombinerOperandRGBEnums glesTexcombinerOperandRGBEnumsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerOperatorAlphaEnumsObject(GlesTexcombinerOperatorAlphaEnums glesTexcombinerOperatorAlphaEnumsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerOperatorRGBEnumsObject(GlesTexcombinerOperatorRGBEnums glesTexcombinerOperatorRGBEnumsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexcombinerSourceEnumsObject(GlesTexcombinerSourceEnums glesTexcombinerSourceEnumsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlesTexenvModeEnumsObject(GlesTexenvModeEnums glesTexenvModeEnumsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlFaceTypeObject(GlFaceType glFaceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlFogCoordSrcTypeObject(GlFogCoordSrcType glFogCoordSrcTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlFogTypeObject(GlFogType glFogTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlFrontFaceTypeObject(GlFrontFaceType glFrontFaceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlFuncTypeObject(GlFuncType glFuncTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlLightModelColorControlTypeObject(GlLightModelColorControlType glLightModelColorControlTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlLogicOpTypeObject(GlLogicOpType glLogicOpTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlMaterialTypeObject(GlMaterialType glMaterialTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLMAXCLIPPLANESIndex(BigInteger glmaxclipplanesIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGLMAXCLIPPLANESIndex_Min(glmaxclipplanesIndex, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateGLMAXCLIPPLANESIndex_Min
   */
	public static final BigInteger GLMAXCLIPPLANES_INDEX__MIN__VALUE = new BigInteger("0");

	/**
   * Validates the Min constraint of '<em>GLMAXCLIPPLANES Index</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLMAXCLIPPLANESIndex_Min(BigInteger glmaxclipplanesIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = glmaxclipplanesIndex.compareTo(GLMAXCLIPPLANES_INDEX__MIN__VALUE) >= 0;
    if (!result && diagnostics != null)
      reportMinViolation(ColladaPackage.eINSTANCE.getGLMAXCLIPPLANESIndex(), glmaxclipplanesIndex, GLMAXCLIPPLANES_INDEX__MIN__VALUE, true, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLMAXLIGHTSIndex(BigInteger glmaxlightsIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGLMAXLIGHTSIndex_Min(glmaxlightsIndex, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateGLMAXLIGHTSIndex_Min
   */
	public static final BigInteger GLMAXLIGHTS_INDEX__MIN__VALUE = new BigInteger("0");

	/**
   * Validates the Min constraint of '<em>GLMAXLIGHTS Index</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLMAXLIGHTSIndex_Min(BigInteger glmaxlightsIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = glmaxlightsIndex.compareTo(GLMAXLIGHTS_INDEX__MIN__VALUE) >= 0;
    if (!result && diagnostics != null)
      reportMinViolation(ColladaPackage.eINSTANCE.getGLMAXLIGHTSIndex(), glmaxlightsIndex, GLMAXLIGHTS_INDEX__MIN__VALUE, true, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLMAXTEXTUREIMAGEUNITSIndex(BigInteger glmaxtextureimageunitsIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGLMAXTEXTUREIMAGEUNITSIndex_Min(glmaxtextureimageunitsIndex, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateGLMAXTEXTUREIMAGEUNITSIndex_Min
   */
	public static final BigInteger GLMAXTEXTUREIMAGEUNITS_INDEX__MIN__VALUE = new BigInteger("0");

	/**
   * Validates the Min constraint of '<em>GLMAXTEXTUREIMAGEUNITS Index</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGLMAXTEXTUREIMAGEUNITSIndex_Min(BigInteger glmaxtextureimageunitsIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = glmaxtextureimageunitsIndex.compareTo(GLMAXTEXTUREIMAGEUNITS_INDEX__MIN__VALUE) >= 0;
    if (!result && diagnostics != null)
      reportMinViolation(ColladaPackage.eINSTANCE.getGLMAXTEXTUREIMAGEUNITSIndex(), glmaxtextureimageunitsIndex, GLMAXTEXTUREIMAGEUNITS_INDEX__MIN__VALUE, true, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlPolygonModeTypeObject(GlPolygonModeType glPolygonModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlShadeModelTypeObject(GlShadeModelType glShadeModelTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslBool(boolean glslBool, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslBool2(List<?> glslBool2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlslListOfBool_ItemType(glslBool2, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslBool2_MinLength(glslBool2, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslBool2_MaxLength(glslBool2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Glsl Bool2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslBool2_MinLength(List<?> glslBool2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslBool2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getGlslBool2(), glslBool2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Glsl Bool2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslBool2_MaxLength(List<?> glslBool2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslBool2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getGlslBool2(), glslBool2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslBool3(List<?> glslBool3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlslListOfBool_ItemType(glslBool3, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslBool3_MinLength(glslBool3, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslBool3_MaxLength(glslBool3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Glsl Bool3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslBool3_MinLength(List<?> glslBool3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslBool3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getGlslBool3(), glslBool3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Glsl Bool3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslBool3_MaxLength(List<?> glslBool3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslBool3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getGlslBool3(), glslBool3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslBool4(List<?> glslBool4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlslListOfBool_ItemType(glslBool4, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslBool4_MinLength(glslBool4, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslBool4_MaxLength(glslBool4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Glsl Bool4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslBool4_MinLength(List<?> glslBool4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslBool4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getGlslBool4(), glslBool4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Glsl Bool4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslBool4_MaxLength(List<?> glslBool4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslBool4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getGlslBool4(), glslBool4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslBoolObject(Boolean glslBoolObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat(float glslFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat2(List<?> glslFloat2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlslListOfFloat_ItemType(glslFloat2, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslFloat2_MinLength(glslFloat2, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslFloat2_MaxLength(glslFloat2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Glsl Float2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat2_MinLength(List<?> glslFloat2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslFloat2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getGlslFloat2(), glslFloat2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Glsl Float2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat2_MaxLength(List<?> glslFloat2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslFloat2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getGlslFloat2(), glslFloat2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat2x2(List<?> glslFloat2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlslListOfFloat_ItemType(glslFloat2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslFloat2x2_MinLength(glslFloat2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslFloat2x2_MaxLength(glslFloat2x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Glsl Float2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat2x2_MinLength(List<?> glslFloat2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslFloat2x2.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getGlslFloat2x2(), glslFloat2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Glsl Float2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat2x2_MaxLength(List<?> glslFloat2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslFloat2x2.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getGlslFloat2x2(), glslFloat2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat3(List<?> glslFloat3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlslListOfFloat_ItemType(glslFloat3, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslFloat3_MinLength(glslFloat3, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslFloat3_MaxLength(glslFloat3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Glsl Float3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat3_MinLength(List<?> glslFloat3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslFloat3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getGlslFloat3(), glslFloat3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Glsl Float3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat3_MaxLength(List<?> glslFloat3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslFloat3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getGlslFloat3(), glslFloat3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat3x3(List<?> glslFloat3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlslListOfFloat_ItemType(glslFloat3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslFloat3x3_MinLength(glslFloat3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslFloat3x3_MaxLength(glslFloat3x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Glsl Float3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat3x3_MinLength(List<?> glslFloat3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslFloat3x3.size();
    boolean result = length >= 9;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getGlslFloat3x3(), glslFloat3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Glsl Float3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat3x3_MaxLength(List<?> glslFloat3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslFloat3x3.size();
    boolean result = length <= 9;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getGlslFloat3x3(), glslFloat3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat4(List<?> glslFloat4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlslListOfFloat_ItemType(glslFloat4, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslFloat4_MinLength(glslFloat4, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslFloat4_MaxLength(glslFloat4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Glsl Float4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat4_MinLength(List<?> glslFloat4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslFloat4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getGlslFloat4(), glslFloat4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Glsl Float4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat4_MaxLength(List<?> glslFloat4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslFloat4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getGlslFloat4(), glslFloat4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat4x4(List<?> glslFloat4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlslListOfFloat_ItemType(glslFloat4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslFloat4x4_MinLength(glslFloat4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslFloat4x4_MaxLength(glslFloat4x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Glsl Float4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat4x4_MinLength(List<?> glslFloat4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslFloat4x4.size();
    boolean result = length >= 16;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getGlslFloat4x4(), glslFloat4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Glsl Float4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloat4x4_MaxLength(List<?> glslFloat4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslFloat4x4.size();
    boolean result = length <= 16;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getGlslFloat4x4(), glslFloat4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslFloatObject(Float glslFloatObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslIdentifier(String glslIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslInt(int glslInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslInt2(List<?> glslInt2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlslListOfInt_ItemType(glslInt2, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslInt2_MinLength(glslInt2, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslInt2_MaxLength(glslInt2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Glsl Int2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslInt2_MinLength(List<?> glslInt2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslInt2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getGlslInt2(), glslInt2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Glsl Int2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslInt2_MaxLength(List<?> glslInt2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslInt2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getGlslInt2(), glslInt2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslInt3(List<?> glslInt3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlslListOfInt_ItemType(glslInt3, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslInt3_MinLength(glslInt3, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslInt3_MaxLength(glslInt3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Glsl Int3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslInt3_MinLength(List<?> glslInt3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslInt3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getGlslInt3(), glslInt3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Glsl Int3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslInt3_MaxLength(List<?> glslInt3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslInt3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getGlslInt3(), glslInt3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslInt4(List<?> glslInt4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlslListOfInt_ItemType(glslInt4, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslInt4_MinLength(glslInt4, diagnostics, context);
    if (result || diagnostics != null) result &= validateGlslInt4_MaxLength(glslInt4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Glsl Int4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslInt4_MinLength(List<?> glslInt4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslInt4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getGlslInt4(), glslInt4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Glsl Int4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslInt4_MaxLength(List<?> glslInt4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = glslInt4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getGlslInt4(), glslInt4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslIntObject(Integer glslIntObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslListOfBool(List<?> glslListOfBool, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlslListOfBool_ItemType(glslListOfBool, diagnostics, context);
    return result;
  }

	/**
   * Validates the ItemType constraint of '<em>Glsl List Of Bool</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslListOfBool_ItemType(List<?> glslListOfBool, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = true;
    for (Iterator<?> i = glslListOfBool.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (ColladaPackage.eINSTANCE.getGlslBool().isInstance(item))
      {
        result &= validateGlslBool((Boolean)item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(ColladaPackage.eINSTANCE.getGlslBool(), item, diagnostics, context);
      }
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslListOfFloat(List<?> glslListOfFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlslListOfFloat_ItemType(glslListOfFloat, diagnostics, context);
    return result;
  }

	/**
   * Validates the ItemType constraint of '<em>Glsl List Of Float</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslListOfFloat_ItemType(List<?> glslListOfFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = true;
    for (Iterator<?> i = glslListOfFloat.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (ColladaPackage.eINSTANCE.getGlslFloat().isInstance(item))
      {
        result &= validateGlslFloat((Float)item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(ColladaPackage.eINSTANCE.getGlslFloat(), item, diagnostics, context);
      }
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslListOfInt(List<?> glslListOfInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateGlslListOfInt_ItemType(glslListOfInt, diagnostics, context);
    return result;
  }

	/**
   * Validates the ItemType constraint of '<em>Glsl List Of Int</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslListOfInt_ItemType(List<?> glslListOfInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = true;
    for (Iterator<?> i = glslListOfInt.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (ColladaPackage.eINSTANCE.getGlslInt().isInstance(item))
      {
        result &= validateGlslInt((Integer)item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(ColladaPackage.eINSTANCE.getGlslInt(), item, diagnostics, context);
      }
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlslPipelineStageObject(GlslPipelineStage glslPipelineStageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGlStencilOpTypeObject(GlStencilOpType glStencilOpTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt(long int_, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt2(List<?> int2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfInts_ItemType(int2, diagnostics, context);
    if (result || diagnostics != null) result &= validateInt2_MinLength(int2, diagnostics, context);
    if (result || diagnostics != null) result &= validateInt2_MaxLength(int2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Int2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt2_MinLength(List<?> int2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = int2.size();
    boolean result = length >= 2;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getInt2(), int2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Int2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt2_MaxLength(List<?> int2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = int2.size();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getInt2(), int2, length, 2, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt2x2(List<?> int2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfInts_ItemType(int2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateInt2x2_MinLength(int2x2, diagnostics, context);
    if (result || diagnostics != null) result &= validateInt2x2_MaxLength(int2x2, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Int2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt2x2_MinLength(List<?> int2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = int2x2.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getInt2x2(), int2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Int2x2</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt2x2_MaxLength(List<?> int2x2, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = int2x2.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getInt2x2(), int2x2, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt3(List<?> int3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfInts_ItemType(int3, diagnostics, context);
    if (result || diagnostics != null) result &= validateInt3_MinLength(int3, diagnostics, context);
    if (result || diagnostics != null) result &= validateInt3_MaxLength(int3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Int3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt3_MinLength(List<?> int3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = int3.size();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getInt3(), int3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Int3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt3_MaxLength(List<?> int3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = int3.size();
    boolean result = length <= 3;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getInt3(), int3, length, 3, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt3x3(List<?> int3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfInts_ItemType(int3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateInt3x3_MinLength(int3x3, diagnostics, context);
    if (result || diagnostics != null) result &= validateInt3x3_MaxLength(int3x3, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Int3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt3x3_MinLength(List<?> int3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = int3x3.size();
    boolean result = length >= 9;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getInt3x3(), int3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Int3x3</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt3x3_MaxLength(List<?> int3x3, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = int3x3.size();
    boolean result = length <= 9;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getInt3x3(), int3x3, length, 9, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt4(List<?> int4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfInts_ItemType(int4, diagnostics, context);
    if (result || diagnostics != null) result &= validateInt4_MinLength(int4, diagnostics, context);
    if (result || diagnostics != null) result &= validateInt4_MaxLength(int4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Int4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt4_MinLength(List<?> int4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = int4.size();
    boolean result = length >= 4;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getInt4(), int4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Int4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt4_MaxLength(List<?> int4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = int4.size();
    boolean result = length <= 4;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getInt4(), int4, length, 4, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt4x4(List<?> int4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfInts_ItemType(int4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateInt4x4_MinLength(int4x4, diagnostics, context);
    if (result || diagnostics != null) result &= validateInt4x4_MaxLength(int4x4, diagnostics, context);
    return result;
  }

	/**
   * Validates the MinLength constraint of '<em>Int4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt4x4_MinLength(List<?> int4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = int4x4.size();
    boolean result = length >= 16;
    if (!result && diagnostics != null)
      reportMinLengthViolation(ColladaPackage.eINSTANCE.getInt4x4(), int4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * Validates the MaxLength constraint of '<em>Int4x4</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateInt4x4_MaxLength(List<?> int4x4, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = int4x4.size();
    boolean result = length <= 16;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ColladaPackage.eINSTANCE.getInt4x4(), int4x4, length, 16, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateIntObject(Long intObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateListOfBools(List<?> listOfBools, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfBools_ItemType(listOfBools, diagnostics, context);
    return result;
  }

	/**
   * Validates the ItemType constraint of '<em>List Of Bools</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateListOfBools_ItemType(List<?> listOfBools, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = true;
    for (Iterator<?> i = listOfBools.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (ColladaPackage.eINSTANCE.getBool().isInstance(item))
      {
        result &= validateBool((Boolean)item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(ColladaPackage.eINSTANCE.getBool(), item, diagnostics, context);
      }
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateListOfFloats(List<?> listOfFloats, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfFloats_ItemType(listOfFloats, diagnostics, context);
    return result;
  }

	/**
   * Validates the ItemType constraint of '<em>List Of Floats</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateListOfFloats_ItemType(List<?> listOfFloats, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = true;
    for (Iterator<?> i = listOfFloats.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (ColladaPackage.eINSTANCE.getFloat().isInstance(item))
      {
        result &= validateFloat((Double)item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(ColladaPackage.eINSTANCE.getFloat(), item, diagnostics, context);
      }
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateListOfHexBinary(List<?> listOfHexBinary, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfHexBinary_ItemType(listOfHexBinary, diagnostics, context);
    return result;
  }

	/**
   * Validates the ItemType constraint of '<em>List Of Hex Binary</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateListOfHexBinary_ItemType(List<?> listOfHexBinary, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = true;
    for (Iterator<?> i = listOfHexBinary.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (XMLTypePackage.Literals.HEX_BINARY.isInstance(item))
      {
        result &= xmlTypeValidator.validateHexBinary((byte[])item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(XMLTypePackage.Literals.HEX_BINARY, item, diagnostics, context);
      }
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateListOfInts(List<?> listOfInts, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfInts_ItemType(listOfInts, diagnostics, context);
    return result;
  }

	/**
   * Validates the ItemType constraint of '<em>List Of Ints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateListOfInts_ItemType(List<?> listOfInts, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = true;
    for (Iterator<?> i = listOfInts.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (ColladaPackage.eINSTANCE.getInt().isInstance(item))
      {
        result &= validateInt((Long)item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(ColladaPackage.eINSTANCE.getInt(), item, diagnostics, context);
      }
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateListOfNames(List<?> listOfNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfNames_ItemType(listOfNames, diagnostics, context);
    return result;
  }

	/**
   * Validates the ItemType constraint of '<em>List Of Names</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateListOfNames_ItemType(List<?> listOfNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = true;
    for (Iterator<?> i = listOfNames.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (ColladaPackage.eINSTANCE.getName_().isInstance(item))
      {
        result &= validateName((String)item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(ColladaPackage.eINSTANCE.getName_(), item, diagnostics, context);
      }
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateListOfTokens(List<?> listOfTokens, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfTokens_ItemType(listOfTokens, diagnostics, context);
    return result;
  }

	/**
   * Validates the ItemType constraint of '<em>List Of Tokens</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateListOfTokens_ItemType(List<?> listOfTokens, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = true;
    for (Iterator<?> i = listOfTokens.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (ColladaPackage.eINSTANCE.getToken().isInstance(item))
      {
        result &= validateToken((String)item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(ColladaPackage.eINSTANCE.getToken(), item, diagnostics, context);
      }
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateListOfUInts(List<?> listOfUInts, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateListOfUInts_ItemType(listOfUInts, diagnostics, context);
    return result;
  }

	/**
   * Validates the ItemType constraint of '<em>List Of UInts</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateListOfUInts_ItemType(List<?> listOfUInts, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = true;
    for (Iterator<?> i = listOfUInts.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (ColladaPackage.eINSTANCE.getUint().isInstance(item))
      {
        result &= validateUint((BigInteger)item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(ColladaPackage.eINSTANCE.getUint(), item, diagnostics, context);
      }
    }
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMorphMethodTypeObject(MorphMethodType morphMethodTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateName(String name, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = xmlTypeValidator.validateName_Pattern(name, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNodeTypeObject(NodeType nodeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSpringTypeObject(SpringType springTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateString(String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateToken(String token, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUint(BigInteger uint, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = xmlTypeValidator.validateUnsignedLong_Min(uint, diagnostics, context);
    if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedLong_Max(uint, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateUpAxisTypeObject(UpAxisType upAxisTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateURIFragmentType(String uriFragmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateURIFragmentType_Pattern(uriFragmentType, diagnostics, context);
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @see #validateURIFragmentType_Pattern
   */
	public static final  PatternMatcher [][] URI_FRAGMENT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][]
    {
      new PatternMatcher []
      {
        XMLTypeUtil.createPatternMatcher("(#(.*))")
      }
    };

	/**
   * Validates the Pattern constraint of '<em>URI Fragment Type</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateURIFragmentType_Pattern(String uriFragmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validatePattern(ColladaPackage.eINSTANCE.getURIFragmentType(), uriFragmentType, URI_FRAGMENT_TYPE__PATTERN__VALUES, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVersionTypeObject(VersionType versionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

	/**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ResourceLocator getResourceLocator() {
    // TODO
    // Specialize this to return a resource locator for messages specific to this validator.
    // Ensure that you remove @generated or mark it @generated NOT
    return super.getResourceLocator();
  }

} //ColladaValidator
