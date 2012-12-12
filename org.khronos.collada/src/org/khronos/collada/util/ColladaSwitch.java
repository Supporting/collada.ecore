/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.khronos.collada.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage
 * @generated
 */
public class ColladaSwitch<T> extends Switch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static ColladaPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColladaSwitch() {
    if (modelPackage == null)
    {
      modelPackage = ColladaPackage.eINSTANCE;
    }
  }

	/**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID)
    {
      case ColladaPackage.ACCESSOR_TYPE:
      {
        AccessorType accessorType = (AccessorType)theEObject;
        T result = caseAccessorType(accessorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ALL_TYPE:
      {
        AllType allType = (AllType)theEObject;
        T result = caseAllType(allType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ALL_TYPE1:
      {
        AllType1 allType1 = (AllType1)theEObject;
        T result = caseAllType1(allType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ALL_TYPE2:
      {
        AllType2 allType2 = (AllType2)theEObject;
        T result = caseAllType2(allType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ALPHA_FUNC_TYPE:
      {
        AlphaFuncType alphaFuncType = (AlphaFuncType)theEObject;
        T result = caseAlphaFuncType(alphaFuncType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ALPHA_FUNC_TYPE1:
      {
        AlphaFuncType1 alphaFuncType1 = (AlphaFuncType1)theEObject;
        T result = caseAlphaFuncType1(alphaFuncType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ALPHA_TEST_ENABLE_TYPE:
      {
        AlphaTestEnableType alphaTestEnableType = (AlphaTestEnableType)theEObject;
        T result = caseAlphaTestEnableType(alphaTestEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ALPHA_TEST_ENABLE_TYPE1:
      {
        AlphaTestEnableType1 alphaTestEnableType1 = (AlphaTestEnableType1)theEObject;
        T result = caseAlphaTestEnableType1(alphaTestEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ALPHA_TYPE:
      {
        AlphaType alphaType = (AlphaType)theEObject;
        T result = caseAlphaType(alphaType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.AMBIENT_TYPE:
      {
        AmbientType ambientType = (AmbientType)theEObject;
        T result = caseAmbientType(ambientType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ANGULAR_TYPE:
      {
        AngularType angularType = (AngularType)theEObject;
        T result = caseAngularType(angularType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ANIMATION_CLIP_TYPE:
      {
        AnimationClipType animationClipType = (AnimationClipType)theEObject;
        T result = caseAnimationClipType(animationClipType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ANIMATION_TYPE:
      {
        AnimationType animationType = (AnimationType)theEObject;
        T result = caseAnimationType(animationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ASSET_TYPE:
      {
        AssetType assetType = (AssetType)theEObject;
        T result = caseAssetType(assetType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ATTACHMENT_TYPE:
      {
        AttachmentType attachmentType = (AttachmentType)theEObject;
        T result = caseAttachmentType(attachmentType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.AUTO_NORMAL_ENABLE_TYPE:
      {
        AutoNormalEnableType autoNormalEnableType = (AutoNormalEnableType)theEObject;
        T result = caseAutoNormalEnableType(autoNormalEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BACK_TYPE:
      {
        BackType backType = (BackType)theEObject;
        T result = caseBackType(backType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BIND_MATERIAL_TYPE:
      {
        BindMaterialType bindMaterialType = (BindMaterialType)theEObject;
        T result = caseBindMaterialType(bindMaterialType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BIND_TYPE:
      {
        BindType bindType = (BindType)theEObject;
        T result = caseBindType(bindType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BIND_TYPE1:
      {
        BindType1 bindType1 = (BindType1)theEObject;
        T result = caseBindType1(bindType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BIND_TYPE2:
      {
        BindType2 bindType2 = (BindType2)theEObject;
        T result = caseBindType2(bindType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BIND_VERTEX_INPUT_TYPE:
      {
        BindVertexInputType bindVertexInputType = (BindVertexInputType)theEObject;
        T result = caseBindVertexInputType(bindVertexInputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BLEND_COLOR_TYPE:
      {
        BlendColorType blendColorType = (BlendColorType)theEObject;
        T result = caseBlendColorType(blendColorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BLEND_ENABLE_TYPE:
      {
        BlendEnableType blendEnableType = (BlendEnableType)theEObject;
        T result = caseBlendEnableType(blendEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BLEND_ENABLE_TYPE1:
      {
        BlendEnableType1 blendEnableType1 = (BlendEnableType1)theEObject;
        T result = caseBlendEnableType1(blendEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BLEND_EQUATION_SEPARATE_TYPE:
      {
        BlendEquationSeparateType blendEquationSeparateType = (BlendEquationSeparateType)theEObject;
        T result = caseBlendEquationSeparateType(blendEquationSeparateType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BLEND_EQUATION_TYPE:
      {
        BlendEquationType blendEquationType = (BlendEquationType)theEObject;
        T result = caseBlendEquationType(blendEquationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BLEND_FUNC_SEPARATE_TYPE:
      {
        BlendFuncSeparateType blendFuncSeparateType = (BlendFuncSeparateType)theEObject;
        T result = caseBlendFuncSeparateType(blendFuncSeparateType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BLEND_FUNC_TYPE:
      {
        BlendFuncType blendFuncType = (BlendFuncType)theEObject;
        T result = caseBlendFuncType(blendFuncType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BLEND_FUNC_TYPE1:
      {
        BlendFuncType1 blendFuncType1 = (BlendFuncType1)theEObject;
        T result = caseBlendFuncType1(blendFuncType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BLINN_TYPE:
      {
        BlinnType blinnType = (BlinnType)theEObject;
        T result = caseBlinnType(blinnType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BOOL_ARRAY_TYPE:
      {
        BoolArrayType boolArrayType = (BoolArrayType)theEObject;
        T result = caseBoolArrayType(boolArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.BOX_TYPE:
      {
        BoxType boxType = (BoxType)theEObject;
        T result = caseBoxType(boxType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CAMERA_TYPE:
      {
        CameraType cameraType = (CameraType)theEObject;
        T result = caseCameraType(cameraType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CAPSULE_TYPE:
      {
        CapsuleType capsuleType = (CapsuleType)theEObject;
        T result = caseCapsuleType(capsuleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CG_CONNECT_PARAM:
      {
        CgConnectParam cgConnectParam = (CgConnectParam)theEObject;
        T result = caseCgConnectParam(cgConnectParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CG_NEWARRAY_TYPE:
      {
        CgNewarrayType cgNewarrayType = (CgNewarrayType)theEObject;
        T result = caseCgNewarrayType(cgNewarrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CG_NEWPARAM:
      {
        CgNewparam cgNewparam = (CgNewparam)theEObject;
        T result = caseCgNewparam(cgNewparam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CG_SAMPLER1_D:
      {
        CgSampler1D cgSampler1D = (CgSampler1D)theEObject;
        T result = caseCgSampler1D(cgSampler1D);
        if (result == null) result = caseFxSampler1DCommon(cgSampler1D);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CG_SAMPLER2_D:
      {
        CgSampler2D cgSampler2D = (CgSampler2D)theEObject;
        T result = caseCgSampler2D(cgSampler2D);
        if (result == null) result = caseFxSampler2DCommon(cgSampler2D);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CG_SAMPLER3_D:
      {
        CgSampler3D cgSampler3D = (CgSampler3D)theEObject;
        T result = caseCgSampler3D(cgSampler3D);
        if (result == null) result = caseFxSampler3DCommon(cgSampler3D);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CG_SAMPLER_CUBE:
      {
        CgSamplerCUBE cgSamplerCUBE = (CgSamplerCUBE)theEObject;
        T result = caseCgSamplerCUBE(cgSamplerCUBE);
        if (result == null) result = caseFxSamplerCUBECommon(cgSamplerCUBE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CG_SAMPLER_DEPTH:
      {
        CgSamplerDEPTH cgSamplerDEPTH = (CgSamplerDEPTH)theEObject;
        T result = caseCgSamplerDEPTH(cgSamplerDEPTH);
        if (result == null) result = caseFxSamplerDEPTHCommon(cgSamplerDEPTH);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CG_SAMPLER_RECT:
      {
        CgSamplerRECT cgSamplerRECT = (CgSamplerRECT)theEObject;
        T result = caseCgSamplerRECT(cgSamplerRECT);
        if (result == null) result = caseFxSamplerRECTCommon(cgSamplerRECT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CG_SETARRAY_TYPE:
      {
        CgSetarrayType cgSetarrayType = (CgSetarrayType)theEObject;
        T result = caseCgSetarrayType(cgSetarrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CG_SETPARAM:
      {
        CgSetparam cgSetparam = (CgSetparam)theEObject;
        T result = caseCgSetparam(cgSetparam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CG_SETPARAM_SIMPLE:
      {
        CgSetparamSimple cgSetparamSimple = (CgSetparamSimple)theEObject;
        T result = caseCgSetparamSimple(cgSetparamSimple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CG_SETUSER_TYPE:
      {
        CgSetuserType cgSetuserType = (CgSetuserType)theEObject;
        T result = caseCgSetuserType(cgSetuserType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CG_SURFACE_TYPE:
      {
        CgSurfaceType cgSurfaceType = (CgSurfaceType)theEObject;
        T result = caseCgSurfaceType(cgSurfaceType);
        if (result == null) result = caseFxSurfaceCommon(cgSurfaceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CHANNEL_TYPE:
      {
        ChannelType channelType = (ChannelType)theEObject;
        T result = caseChannelType(channelType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CLEAR_COLOR_TYPE:
      {
        ClearColorType clearColorType = (ClearColorType)theEObject;
        T result = caseClearColorType(clearColorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CLEAR_COLOR_TYPE1:
      {
        ClearColorType1 clearColorType1 = (ClearColorType1)theEObject;
        T result = caseClearColorType1(clearColorType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CLEAR_DEPTH_TYPE:
      {
        ClearDepthType clearDepthType = (ClearDepthType)theEObject;
        T result = caseClearDepthType(clearDepthType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CLEAR_DEPTH_TYPE1:
      {
        ClearDepthType1 clearDepthType1 = (ClearDepthType1)theEObject;
        T result = caseClearDepthType1(clearDepthType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CLEAR_STENCIL_TYPE:
      {
        ClearStencilType clearStencilType = (ClearStencilType)theEObject;
        T result = caseClearStencilType(clearStencilType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CLEAR_STENCIL_TYPE1:
      {
        ClearStencilType1 clearStencilType1 = (ClearStencilType1)theEObject;
        T result = caseClearStencilType1(clearStencilType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CLIP_PLANE_ENABLE_TYPE:
      {
        ClipPlaneEnableType clipPlaneEnableType = (ClipPlaneEnableType)theEObject;
        T result = caseClipPlaneEnableType(clipPlaneEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CLIP_PLANE_ENABLE_TYPE1:
      {
        ClipPlaneEnableType1 clipPlaneEnableType1 = (ClipPlaneEnableType1)theEObject;
        T result = caseClipPlaneEnableType1(clipPlaneEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CLIP_PLANE_TYPE:
      {
        ClipPlaneType clipPlaneType = (ClipPlaneType)theEObject;
        T result = caseClipPlaneType(clipPlaneType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CLIP_PLANE_TYPE1:
      {
        ClipPlaneType1 clipPlaneType1 = (ClipPlaneType1)theEObject;
        T result = caseClipPlaneType1(clipPlaneType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.COLLADA_TYPE:
      {
        COLLADAType colladaType = (COLLADAType)theEObject;
        T result = caseCOLLADAType(colladaType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.COLOR_LOGIC_OP_ENABLE_TYPE:
      {
        ColorLogicOpEnableType colorLogicOpEnableType = (ColorLogicOpEnableType)theEObject;
        T result = caseColorLogicOpEnableType(colorLogicOpEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.COLOR_LOGIC_OP_ENABLE_TYPE1:
      {
        ColorLogicOpEnableType1 colorLogicOpEnableType1 = (ColorLogicOpEnableType1)theEObject;
        T result = caseColorLogicOpEnableType1(colorLogicOpEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.COLOR_MASK_TYPE:
      {
        ColorMaskType colorMaskType = (ColorMaskType)theEObject;
        T result = caseColorMaskType(colorMaskType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.COLOR_MASK_TYPE1:
      {
        ColorMaskType1 colorMaskType1 = (ColorMaskType1)theEObject;
        T result = caseColorMaskType1(colorMaskType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.COLOR_MATERIAL_ENABLE_TYPE:
      {
        ColorMaterialEnableType colorMaterialEnableType = (ColorMaterialEnableType)theEObject;
        T result = caseColorMaterialEnableType(colorMaterialEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.COLOR_MATERIAL_ENABLE_TYPE1:
      {
        ColorMaterialEnableType1 colorMaterialEnableType1 = (ColorMaterialEnableType1)theEObject;
        T result = caseColorMaterialEnableType1(colorMaterialEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.COLOR_MATERIAL_TYPE:
      {
        ColorMaterialType colorMaterialType = (ColorMaterialType)theEObject;
        T result = caseColorMaterialType(colorMaterialType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.COLOR_TYPE:
      {
        ColorType colorType = (ColorType)theEObject;
        T result = caseColorType(colorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.COMMON_COLOR_OR_TEXTURE_TYPE:
      {
        CommonColorOrTextureType commonColorOrTextureType = (CommonColorOrTextureType)theEObject;
        T result = caseCommonColorOrTextureType(commonColorOrTextureType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.COMMON_FLOAT_OR_PARAM_TYPE:
      {
        CommonFloatOrParamType commonFloatOrParamType = (CommonFloatOrParamType)theEObject;
        T result = caseCommonFloatOrParamType(commonFloatOrParamType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.COMMON_NEWPARAM_TYPE:
      {
        CommonNewparamType commonNewparamType = (CommonNewparamType)theEObject;
        T result = caseCommonNewparamType(commonNewparamType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.COMMON_TRANSPARENT_TYPE:
      {
        CommonTransparentType commonTransparentType = (CommonTransparentType)theEObject;
        T result = caseCommonTransparentType(commonTransparentType);
        if (result == null) result = caseCommonColorOrTextureType(commonTransparentType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.COMPILER_TARGET_TYPE:
      {
        CompilerTargetType compilerTargetType = (CompilerTargetType)theEObject;
        T result = caseCompilerTargetType(compilerTargetType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.COMPILER_TARGET_TYPE1:
      {
        CompilerTargetType1 compilerTargetType1 = (CompilerTargetType1)theEObject;
        T result = caseCompilerTargetType1(compilerTargetType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CONSTANT_TYPE:
      {
        ConstantType constantType = (ConstantType)theEObject;
        T result = caseConstantType(constantType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CONTRIBUTOR_TYPE:
      {
        ContributorType contributorType = (ContributorType)theEObject;
        T result = caseContributorType(contributorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CONTROLLER_TYPE:
      {
        ControllerType controllerType = (ControllerType)theEObject;
        T result = caseControllerType(controllerType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CONTROL_VERTICES_TYPE:
      {
        ControlVerticesType controlVerticesType = (ControlVerticesType)theEObject;
        T result = caseControlVerticesType(controlVerticesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CONVEX_MESH_TYPE:
      {
        ConvexMeshType convexMeshType = (ConvexMeshType)theEObject;
        T result = caseConvexMeshType(convexMeshType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CULL_FACE_ENABLE_TYPE:
      {
        CullFaceEnableType cullFaceEnableType = (CullFaceEnableType)theEObject;
        T result = caseCullFaceEnableType(cullFaceEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CULL_FACE_ENABLE_TYPE1:
      {
        CullFaceEnableType1 cullFaceEnableType1 = (CullFaceEnableType1)theEObject;
        T result = caseCullFaceEnableType1(cullFaceEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CULL_FACE_TYPE:
      {
        CullFaceType cullFaceType = (CullFaceType)theEObject;
        T result = caseCullFaceType(cullFaceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CULL_FACE_TYPE1:
      {
        CullFaceType1 cullFaceType1 = (CullFaceType1)theEObject;
        T result = caseCullFaceType1(cullFaceType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.CYLINDER_TYPE:
      {
        CylinderType cylinderType = (CylinderType)theEObject;
        T result = caseCylinderType(cylinderType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DEPTH_BOUNDS_ENABLE_TYPE:
      {
        DepthBoundsEnableType depthBoundsEnableType = (DepthBoundsEnableType)theEObject;
        T result = caseDepthBoundsEnableType(depthBoundsEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DEPTH_BOUNDS_TYPE:
      {
        DepthBoundsType depthBoundsType = (DepthBoundsType)theEObject;
        T result = caseDepthBoundsType(depthBoundsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DEPTH_CLAMP_ENABLE_TYPE:
      {
        DepthClampEnableType depthClampEnableType = (DepthClampEnableType)theEObject;
        T result = caseDepthClampEnableType(depthClampEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DEPTH_FUNC_TYPE:
      {
        DepthFuncType depthFuncType = (DepthFuncType)theEObject;
        T result = caseDepthFuncType(depthFuncType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DEPTH_FUNC_TYPE1:
      {
        DepthFuncType1 depthFuncType1 = (DepthFuncType1)theEObject;
        T result = caseDepthFuncType1(depthFuncType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DEPTH_MASK_TYPE:
      {
        DepthMaskType depthMaskType = (DepthMaskType)theEObject;
        T result = caseDepthMaskType(depthMaskType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DEPTH_MASK_TYPE1:
      {
        DepthMaskType1 depthMaskType1 = (DepthMaskType1)theEObject;
        T result = caseDepthMaskType1(depthMaskType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DEPTH_RANGE_TYPE:
      {
        DepthRangeType depthRangeType = (DepthRangeType)theEObject;
        T result = caseDepthRangeType(depthRangeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DEPTH_RANGE_TYPE1:
      {
        DepthRangeType1 depthRangeType1 = (DepthRangeType1)theEObject;
        T result = caseDepthRangeType1(depthRangeType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DEPTH_TEST_ENABLE_TYPE:
      {
        DepthTestEnableType depthTestEnableType = (DepthTestEnableType)theEObject;
        T result = caseDepthTestEnableType(depthTestEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DEPTH_TEST_ENABLE_TYPE1:
      {
        DepthTestEnableType1 depthTestEnableType1 = (DepthTestEnableType1)theEObject;
        T result = caseDepthTestEnableType1(depthTestEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DEST_ALPHA_TYPE:
      {
        DestAlphaType destAlphaType = (DestAlphaType)theEObject;
        T result = caseDestAlphaType(destAlphaType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DEST_RGB_TYPE:
      {
        DestRgbType destRgbType = (DestRgbType)theEObject;
        T result = caseDestRgbType(destRgbType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DEST_TYPE:
      {
        DestType destType = (DestType)theEObject;
        T result = caseDestType(destType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DEST_TYPE1:
      {
        DestType1 destType1 = (DestType1)theEObject;
        T result = caseDestType1(destType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DIRECTIONAL_TYPE:
      {
        DirectionalType directionalType = (DirectionalType)theEObject;
        T result = caseDirectionalType(directionalType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DITHER_ENABLE_TYPE:
      {
        DitherEnableType ditherEnableType = (DitherEnableType)theEObject;
        T result = caseDitherEnableType(ditherEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DITHER_ENABLE_TYPE1:
      {
        DitherEnableType1 ditherEnableType1 = (DitherEnableType1)theEObject;
        T result = caseDitherEnableType1(ditherEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DOCUMENT_ROOT:
      {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DYNAMIC_TYPE:
      {
        DynamicType dynamicType = (DynamicType)theEObject;
        T result = caseDynamicType(dynamicType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.DYNAMIC_TYPE1:
      {
        DynamicType1 dynamicType1 = (DynamicType1)theEObject;
        T result = caseDynamicType1(dynamicType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.EFFECT_TYPE:
      {
        EffectType effectType = (EffectType)theEObject;
        T result = caseEffectType(effectType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ELLIPSOID_TYPE:
      {
        EllipsoidType ellipsoidType = (EllipsoidType)theEObject;
        T result = caseEllipsoidType(ellipsoidType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ENABLED_TYPE:
      {
        EnabledType enabledType = (EnabledType)theEObject;
        T result = caseEnabledType(enabledType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.EVALUATE_SCENE_TYPE:
      {
        EvaluateSceneType evaluateSceneType = (EvaluateSceneType)theEObject;
        T result = caseEvaluateSceneType(evaluateSceneType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.EXTRA_TYPE:
      {
        ExtraType extraType = (ExtraType)theEObject;
        T result = caseExtraType(extraType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FACE_TYPE:
      {
        FaceType faceType = (FaceType)theEObject;
        T result = caseFaceType(faceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FACE_TYPE1:
      {
        FaceType1 faceType1 = (FaceType1)theEObject;
        T result = caseFaceType1(faceType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FACE_TYPE2:
      {
        FaceType2 faceType2 = (FaceType2)theEObject;
        T result = caseFaceType2(faceType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FACE_TYPE3:
      {
        FaceType3 faceType3 = (FaceType3)theEObject;
        T result = caseFaceType3(faceType3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FACE_TYPE4:
      {
        FaceType4 faceType4 = (FaceType4)theEObject;
        T result = caseFaceType4(faceType4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FAIL_TYPE:
      {
        FailType failType = (FailType)theEObject;
        T result = caseFailType(failType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FAIL_TYPE1:
      {
        FailType1 failType1 = (FailType1)theEObject;
        T result = caseFailType1(failType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FAIL_TYPE2:
      {
        FailType2 failType2 = (FailType2)theEObject;
        T result = caseFailType2(failType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FLOAT_ARRAY_TYPE:
      {
        FloatArrayType floatArrayType = (FloatArrayType)theEObject;
        T result = caseFloatArrayType(floatArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FLOAT_TYPE:
      {
        FloatType floatType = (FloatType)theEObject;
        T result = caseFloatType(floatType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FOG_COLOR_TYPE:
      {
        FogColorType fogColorType = (FogColorType)theEObject;
        T result = caseFogColorType(fogColorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FOG_COLOR_TYPE1:
      {
        FogColorType1 fogColorType1 = (FogColorType1)theEObject;
        T result = caseFogColorType1(fogColorType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FOG_COORD_SRC_TYPE:
      {
        FogCoordSrcType fogCoordSrcType = (FogCoordSrcType)theEObject;
        T result = caseFogCoordSrcType(fogCoordSrcType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FOG_DENSITY_TYPE:
      {
        FogDensityType fogDensityType = (FogDensityType)theEObject;
        T result = caseFogDensityType(fogDensityType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FOG_DENSITY_TYPE1:
      {
        FogDensityType1 fogDensityType1 = (FogDensityType1)theEObject;
        T result = caseFogDensityType1(fogDensityType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FOG_ENABLE_TYPE:
      {
        FogEnableType fogEnableType = (FogEnableType)theEObject;
        T result = caseFogEnableType(fogEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FOG_ENABLE_TYPE1:
      {
        FogEnableType1 fogEnableType1 = (FogEnableType1)theEObject;
        T result = caseFogEnableType1(fogEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FOG_END_TYPE:
      {
        FogEndType fogEndType = (FogEndType)theEObject;
        T result = caseFogEndType(fogEndType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FOG_END_TYPE1:
      {
        FogEndType1 fogEndType1 = (FogEndType1)theEObject;
        T result = caseFogEndType1(fogEndType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FOG_MODE_TYPE:
      {
        FogModeType fogModeType = (FogModeType)theEObject;
        T result = caseFogModeType(fogModeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FOG_MODE_TYPE1:
      {
        FogModeType1 fogModeType1 = (FogModeType1)theEObject;
        T result = caseFogModeType1(fogModeType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FOG_START_TYPE:
      {
        FogStartType fogStartType = (FogStartType)theEObject;
        T result = caseFogStartType(fogStartType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FOG_START_TYPE1:
      {
        FogStartType1 fogStartType1 = (FogStartType1)theEObject;
        T result = caseFogStartType1(fogStartType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FORCE_FIELD_TYPE:
      {
        ForceFieldType forceFieldType = (ForceFieldType)theEObject;
        T result = caseForceFieldType(forceFieldType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FRONT_FACE_TYPE:
      {
        FrontFaceType frontFaceType = (FrontFaceType)theEObject;
        T result = caseFrontFaceType(frontFaceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FRONT_FACE_TYPE1:
      {
        FrontFaceType1 frontFaceType1 = (FrontFaceType1)theEObject;
        T result = caseFrontFaceType1(frontFaceType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FRONT_TYPE:
      {
        FrontType frontType = (FrontType)theEObject;
        T result = caseFrontType(frontType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FUNC_TYPE:
      {
        FuncType funcType = (FuncType)theEObject;
        T result = caseFuncType(funcType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FUNC_TYPE1:
      {
        FuncType1 funcType1 = (FuncType1)theEObject;
        T result = caseFuncType1(funcType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FUNC_TYPE2:
      {
        FuncType2 funcType2 = (FuncType2)theEObject;
        T result = caseFuncType2(funcType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FUNC_TYPE3:
      {
        FuncType3 funcType3 = (FuncType3)theEObject;
        T result = caseFuncType3(funcType3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_ANNOTATE_COMMON:
      {
        FxAnnotateCommon fxAnnotateCommon = (FxAnnotateCommon)theEObject;
        T result = caseFxAnnotateCommon(fxAnnotateCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_CLEARCOLOR_COMMON:
      {
        FxClearcolorCommon fxClearcolorCommon = (FxClearcolorCommon)theEObject;
        T result = caseFxClearcolorCommon(fxClearcolorCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_CLEARDEPTH_COMMON:
      {
        FxCleardepthCommon fxCleardepthCommon = (FxCleardepthCommon)theEObject;
        T result = caseFxCleardepthCommon(fxCleardepthCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_CLEARSTENCIL_COMMON:
      {
        FxClearstencilCommon fxClearstencilCommon = (FxClearstencilCommon)theEObject;
        T result = caseFxClearstencilCommon(fxClearstencilCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_CODE_PROFILE:
      {
        FxCodeProfile fxCodeProfile = (FxCodeProfile)theEObject;
        T result = caseFxCodeProfile(fxCodeProfile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_COLORTARGET_COMMON:
      {
        FxColortargetCommon fxColortargetCommon = (FxColortargetCommon)theEObject;
        T result = caseFxColortargetCommon(fxColortargetCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_DEPTHTARGET_COMMON:
      {
        FxDepthtargetCommon fxDepthtargetCommon = (FxDepthtargetCommon)theEObject;
        T result = caseFxDepthtargetCommon(fxDepthtargetCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_INCLUDE_COMMON:
      {
        FxIncludeCommon fxIncludeCommon = (FxIncludeCommon)theEObject;
        T result = caseFxIncludeCommon(fxIncludeCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_NEWPARAM_COMMON:
      {
        FxNewparamCommon fxNewparamCommon = (FxNewparamCommon)theEObject;
        T result = caseFxNewparamCommon(fxNewparamCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_SAMPLER1_DCOMMON:
      {
        FxSampler1DCommon fxSampler1DCommon = (FxSampler1DCommon)theEObject;
        T result = caseFxSampler1DCommon(fxSampler1DCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_SAMPLER2_DCOMMON:
      {
        FxSampler2DCommon fxSampler2DCommon = (FxSampler2DCommon)theEObject;
        T result = caseFxSampler2DCommon(fxSampler2DCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_SAMPLER3_DCOMMON:
      {
        FxSampler3DCommon fxSampler3DCommon = (FxSampler3DCommon)theEObject;
        T result = caseFxSampler3DCommon(fxSampler3DCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_SAMPLER_CUBE_COMMON:
      {
        FxSamplerCUBECommon fxSamplerCUBECommon = (FxSamplerCUBECommon)theEObject;
        T result = caseFxSamplerCUBECommon(fxSamplerCUBECommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_SAMPLER_DEPTH_COMMON:
      {
        FxSamplerDEPTHCommon fxSamplerDEPTHCommon = (FxSamplerDEPTHCommon)theEObject;
        T result = caseFxSamplerDEPTHCommon(fxSamplerDEPTHCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_SAMPLER_RECT_COMMON:
      {
        FxSamplerRECTCommon fxSamplerRECTCommon = (FxSamplerRECTCommon)theEObject;
        T result = caseFxSamplerRECTCommon(fxSamplerRECTCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_STENCILTARGET_COMMON:
      {
        FxStenciltargetCommon fxStenciltargetCommon = (FxStenciltargetCommon)theEObject;
        T result = caseFxStenciltargetCommon(fxStenciltargetCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_SURFACE_COMMON:
      {
        FxSurfaceCommon fxSurfaceCommon = (FxSurfaceCommon)theEObject;
        T result = caseFxSurfaceCommon(fxSurfaceCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON:
      {
        FxSurfaceFormatHintCommon fxSurfaceFormatHintCommon = (FxSurfaceFormatHintCommon)theEObject;
        T result = caseFxSurfaceFormatHintCommon(fxSurfaceFormatHintCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON:
      {
        FxSurfaceInitCubeCommon fxSurfaceInitCubeCommon = (FxSurfaceInitCubeCommon)theEObject;
        T result = caseFxSurfaceInitCubeCommon(fxSurfaceInitCubeCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_SURFACE_INIT_FROM_COMMON:
      {
        FxSurfaceInitFromCommon fxSurfaceInitFromCommon = (FxSurfaceInitFromCommon)theEObject;
        T result = caseFxSurfaceInitFromCommon(fxSurfaceInitFromCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_SURFACE_INIT_PLANAR_COMMON:
      {
        FxSurfaceInitPlanarCommon fxSurfaceInitPlanarCommon = (FxSurfaceInitPlanarCommon)theEObject;
        T result = caseFxSurfaceInitPlanarCommon(fxSurfaceInitPlanarCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON:
      {
        FxSurfaceInitVolumeCommon fxSurfaceInitVolumeCommon = (FxSurfaceInitVolumeCommon)theEObject;
        T result = caseFxSurfaceInitVolumeCommon(fxSurfaceInitVolumeCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GENERATOR_TYPE:
      {
        GeneratorType generatorType = (GeneratorType)theEObject;
        T result = caseGeneratorType(generatorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GENERATOR_TYPE1:
      {
        GeneratorType1 generatorType1 = (GeneratorType1)theEObject;
        T result = caseGeneratorType1(generatorType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GEOMETRY_TYPE:
      {
        GeometryType geometryType = (GeometryType)theEObject;
        T result = caseGeometryType(geometryType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLES_NEWPARAM:
      {
        GlesNewparam glesNewparam = (GlesNewparam)theEObject;
        T result = caseGlesNewparam(glesNewparam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLES_SAMPLER_STATE:
      {
        GlesSamplerState glesSamplerState = (GlesSamplerState)theEObject;
        T result = caseGlesSamplerState(glesSamplerState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_ALPHA_TYPE:
      {
        GlesTexcombinerArgumentAlphaType glesTexcombinerArgumentAlphaType = (GlesTexcombinerArgumentAlphaType)theEObject;
        T result = caseGlesTexcombinerArgumentAlphaType(glesTexcombinerArgumentAlphaType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLES_TEXCOMBINER_ARGUMENT_RGB_TYPE:
      {
        GlesTexcombinerArgumentRGBType glesTexcombinerArgumentRGBType = (GlesTexcombinerArgumentRGBType)theEObject;
        T result = caseGlesTexcombinerArgumentRGBType(glesTexcombinerArgumentRGBType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_ALPHA_TYPE:
      {
        GlesTexcombinerCommandAlphaType glesTexcombinerCommandAlphaType = (GlesTexcombinerCommandAlphaType)theEObject;
        T result = caseGlesTexcombinerCommandAlphaType(glesTexcombinerCommandAlphaType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_RGB_TYPE:
      {
        GlesTexcombinerCommandRGBType glesTexcombinerCommandRGBType = (GlesTexcombinerCommandRGBType)theEObject;
        T result = caseGlesTexcombinerCommandRGBType(glesTexcombinerCommandRGBType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLES_TEXCOMBINER_COMMAND_TYPE:
      {
        GlesTexcombinerCommandType glesTexcombinerCommandType = (GlesTexcombinerCommandType)theEObject;
        T result = caseGlesTexcombinerCommandType(glesTexcombinerCommandType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLES_TEXENV_COMMAND_TYPE:
      {
        GlesTexenvCommandType glesTexenvCommandType = (GlesTexenvCommandType)theEObject;
        T result = caseGlesTexenvCommandType(glesTexenvCommandType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLES_TEXTURE_CONSTANT_TYPE:
      {
        GlesTextureConstantType glesTextureConstantType = (GlesTextureConstantType)theEObject;
        T result = caseGlesTextureConstantType(glesTextureConstantType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLES_TEXTURE_PIPELINE:
      {
        GlesTexturePipeline glesTexturePipeline = (GlesTexturePipeline)theEObject;
        T result = caseGlesTexturePipeline(glesTexturePipeline);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLES_TEXTURE_UNIT:
      {
        GlesTextureUnit glesTextureUnit = (GlesTextureUnit)theEObject;
        T result = caseGlesTextureUnit(glesTextureUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GL_SAMPLER1_D:
      {
        GlSampler1D glSampler1D = (GlSampler1D)theEObject;
        T result = caseGlSampler1D(glSampler1D);
        if (result == null) result = caseFxSampler1DCommon(glSampler1D);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GL_SAMPLER2_D:
      {
        GlSampler2D glSampler2D = (GlSampler2D)theEObject;
        T result = caseGlSampler2D(glSampler2D);
        if (result == null) result = caseFxSampler2DCommon(glSampler2D);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GL_SAMPLER3_D:
      {
        GlSampler3D glSampler3D = (GlSampler3D)theEObject;
        T result = caseGlSampler3D(glSampler3D);
        if (result == null) result = caseFxSampler3DCommon(glSampler3D);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GL_SAMPLER_CUBE:
      {
        GlSamplerCUBE glSamplerCUBE = (GlSamplerCUBE)theEObject;
        T result = caseGlSamplerCUBE(glSamplerCUBE);
        if (result == null) result = caseFxSamplerCUBECommon(glSamplerCUBE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GL_SAMPLER_DEPTH:
      {
        GlSamplerDEPTH glSamplerDEPTH = (GlSamplerDEPTH)theEObject;
        T result = caseGlSamplerDEPTH(glSamplerDEPTH);
        if (result == null) result = caseFxSamplerDEPTHCommon(glSamplerDEPTH);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GL_SAMPLER_RECT:
      {
        GlSamplerRECT glSamplerRECT = (GlSamplerRECT)theEObject;
        T result = caseGlSamplerRECT(glSamplerRECT);
        if (result == null) result = caseFxSamplerRECTCommon(glSamplerRECT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLSL_NEWARRAY_TYPE:
      {
        GlslNewarrayType glslNewarrayType = (GlslNewarrayType)theEObject;
        T result = caseGlslNewarrayType(glslNewarrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLSL_NEWPARAM:
      {
        GlslNewparam glslNewparam = (GlslNewparam)theEObject;
        T result = caseGlslNewparam(glslNewparam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLSL_SETARRAY_TYPE:
      {
        GlslSetarrayType glslSetarrayType = (GlslSetarrayType)theEObject;
        T result = caseGlslSetarrayType(glslSetarrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLSL_SETPARAM:
      {
        GlslSetparam glslSetparam = (GlslSetparam)theEObject;
        T result = caseGlslSetparam(glslSetparam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLSL_SETPARAM_SIMPLE:
      {
        GlslSetparamSimple glslSetparamSimple = (GlslSetparamSimple)theEObject;
        T result = caseGlslSetparamSimple(glslSetparamSimple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.GLSL_SURFACE_TYPE:
      {
        GlslSurfaceType glslSurfaceType = (GlslSurfaceType)theEObject;
        T result = caseGlslSurfaceType(glslSurfaceType);
        if (result == null) result = caseFxSurfaceCommon(glslSurfaceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.HOLLOW_TYPE:
      {
        HollowType hollowType = (HollowType)theEObject;
        T result = caseHollowType(hollowType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.HOLLOW_TYPE1:
      {
        HollowType1 hollowType1 = (HollowType1)theEObject;
        T result = caseHollowType1(hollowType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.IDREF_ARRAY_TYPE:
      {
        IDREFArrayType idrefArrayType = (IDREFArrayType)theEObject;
        T result = caseIDREFArrayType(idrefArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.IMAGER_TYPE:
      {
        ImagerType imagerType = (ImagerType)theEObject;
        T result = caseImagerType(imagerType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.IMAGE_TYPE:
      {
        ImageType imageType = (ImageType)theEObject;
        T result = caseImageType(imageType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.INPUT_GLOBAL:
      {
        InputGlobal inputGlobal = (InputGlobal)theEObject;
        T result = caseInputGlobal(inputGlobal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.INPUT_LOCAL:
      {
        InputLocal inputLocal = (InputLocal)theEObject;
        T result = caseInputLocal(inputLocal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.INPUT_LOCAL_OFFSET:
      {
        InputLocalOffset inputLocalOffset = (InputLocalOffset)theEObject;
        T result = caseInputLocalOffset(inputLocalOffset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE:
      {
        InstanceControllerType instanceControllerType = (InstanceControllerType)theEObject;
        T result = caseInstanceControllerType(instanceControllerType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.INSTANCE_EFFECT_TYPE:
      {
        InstanceEffectType instanceEffectType = (InstanceEffectType)theEObject;
        T result = caseInstanceEffectType(instanceEffectType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.INSTANCE_GEOMETRY_TYPE:
      {
        InstanceGeometryType instanceGeometryType = (InstanceGeometryType)theEObject;
        T result = caseInstanceGeometryType(instanceGeometryType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.INSTANCE_MATERIAL_TYPE:
      {
        InstanceMaterialType instanceMaterialType = (InstanceMaterialType)theEObject;
        T result = caseInstanceMaterialType(instanceMaterialType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE:
      {
        InstancePhysicsModelType instancePhysicsModelType = (InstancePhysicsModelType)theEObject;
        T result = caseInstancePhysicsModelType(instancePhysicsModelType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE:
      {
        InstanceRigidBodyType instanceRigidBodyType = (InstanceRigidBodyType)theEObject;
        T result = caseInstanceRigidBodyType(instanceRigidBodyType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.INSTANCE_RIGID_CONSTRAINT_TYPE:
      {
        InstanceRigidConstraintType instanceRigidConstraintType = (InstanceRigidConstraintType)theEObject;
        T result = caseInstanceRigidConstraintType(instanceRigidConstraintType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.INSTANCE_WITH_EXTRA:
      {
        InstanceWithExtra instanceWithExtra = (InstanceWithExtra)theEObject;
        T result = caseInstanceWithExtra(instanceWithExtra);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.INT_ARRAY_TYPE:
      {
        IntArrayType intArrayType = (IntArrayType)theEObject;
        T result = caseIntArrayType(intArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.INTERPENETRATE_TYPE:
      {
        InterpenetrateType interpenetrateType = (InterpenetrateType)theEObject;
        T result = caseInterpenetrateType(interpenetrateType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.JOINTS_TYPE:
      {
        JointsType jointsType = (JointsType)theEObject;
        T result = caseJointsType(jointsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LAMBERT_TYPE:
      {
        LambertType lambertType = (LambertType)theEObject;
        T result = caseLambertType(lambertType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIBRARY_ANIMATION_CLIPS_TYPE:
      {
        LibraryAnimationClipsType libraryAnimationClipsType = (LibraryAnimationClipsType)theEObject;
        T result = caseLibraryAnimationClipsType(libraryAnimationClipsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIBRARY_ANIMATIONS_TYPE:
      {
        LibraryAnimationsType libraryAnimationsType = (LibraryAnimationsType)theEObject;
        T result = caseLibraryAnimationsType(libraryAnimationsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIBRARY_CAMERAS_TYPE:
      {
        LibraryCamerasType libraryCamerasType = (LibraryCamerasType)theEObject;
        T result = caseLibraryCamerasType(libraryCamerasType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIBRARY_CONTROLLERS_TYPE:
      {
        LibraryControllersType libraryControllersType = (LibraryControllersType)theEObject;
        T result = caseLibraryControllersType(libraryControllersType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIBRARY_EFFECTS_TYPE:
      {
        LibraryEffectsType libraryEffectsType = (LibraryEffectsType)theEObject;
        T result = caseLibraryEffectsType(libraryEffectsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIBRARY_FORCE_FIELDS_TYPE:
      {
        LibraryForceFieldsType libraryForceFieldsType = (LibraryForceFieldsType)theEObject;
        T result = caseLibraryForceFieldsType(libraryForceFieldsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIBRARY_GEOMETRIES_TYPE:
      {
        LibraryGeometriesType libraryGeometriesType = (LibraryGeometriesType)theEObject;
        T result = caseLibraryGeometriesType(libraryGeometriesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIBRARY_IMAGES_TYPE:
      {
        LibraryImagesType libraryImagesType = (LibraryImagesType)theEObject;
        T result = caseLibraryImagesType(libraryImagesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIBRARY_LIGHTS_TYPE:
      {
        LibraryLightsType libraryLightsType = (LibraryLightsType)theEObject;
        T result = caseLibraryLightsType(libraryLightsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIBRARY_MATERIALS_TYPE:
      {
        LibraryMaterialsType libraryMaterialsType = (LibraryMaterialsType)theEObject;
        T result = caseLibraryMaterialsType(libraryMaterialsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIBRARY_NODES_TYPE:
      {
        LibraryNodesType libraryNodesType = (LibraryNodesType)theEObject;
        T result = caseLibraryNodesType(libraryNodesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE:
      {
        LibraryPhysicsMaterialsType libraryPhysicsMaterialsType = (LibraryPhysicsMaterialsType)theEObject;
        T result = caseLibraryPhysicsMaterialsType(libraryPhysicsMaterialsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIBRARY_PHYSICS_MODELS_TYPE:
      {
        LibraryPhysicsModelsType libraryPhysicsModelsType = (LibraryPhysicsModelsType)theEObject;
        T result = caseLibraryPhysicsModelsType(libraryPhysicsModelsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIBRARY_PHYSICS_SCENES_TYPE:
      {
        LibraryPhysicsScenesType libraryPhysicsScenesType = (LibraryPhysicsScenesType)theEObject;
        T result = caseLibraryPhysicsScenesType(libraryPhysicsScenesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIBRARY_VISUAL_SCENES_TYPE:
      {
        LibraryVisualScenesType libraryVisualScenesType = (LibraryVisualScenesType)theEObject;
        T result = caseLibraryVisualScenesType(libraryVisualScenesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_AMBIENT_TYPE:
      {
        LightAmbientType lightAmbientType = (LightAmbientType)theEObject;
        T result = caseLightAmbientType(lightAmbientType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_AMBIENT_TYPE1:
      {
        LightAmbientType1 lightAmbientType1 = (LightAmbientType1)theEObject;
        T result = caseLightAmbientType1(lightAmbientType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_CONSTANT_ATTENUATION_TYPE:
      {
        LightConstantAttenuationType lightConstantAttenuationType = (LightConstantAttenuationType)theEObject;
        T result = caseLightConstantAttenuationType(lightConstantAttenuationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_CONSTANT_ATTENUATION_TYPE1:
      {
        LightConstantAttenuationType1 lightConstantAttenuationType1 = (LightConstantAttenuationType1)theEObject;
        T result = caseLightConstantAttenuationType1(lightConstantAttenuationType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_DIFFUSE_TYPE:
      {
        LightDiffuseType lightDiffuseType = (LightDiffuseType)theEObject;
        T result = caseLightDiffuseType(lightDiffuseType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_DIFFUSE_TYPE1:
      {
        LightDiffuseType1 lightDiffuseType1 = (LightDiffuseType1)theEObject;
        T result = caseLightDiffuseType1(lightDiffuseType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_ENABLE_TYPE:
      {
        LightEnableType lightEnableType = (LightEnableType)theEObject;
        T result = caseLightEnableType(lightEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_ENABLE_TYPE1:
      {
        LightEnableType1 lightEnableType1 = (LightEnableType1)theEObject;
        T result = caseLightEnableType1(lightEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHTING_ENABLE_TYPE:
      {
        LightingEnableType lightingEnableType = (LightingEnableType)theEObject;
        T result = caseLightingEnableType(lightingEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHTING_ENABLE_TYPE1:
      {
        LightingEnableType1 lightingEnableType1 = (LightingEnableType1)theEObject;
        T result = caseLightingEnableType1(lightingEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_LINEAR_ATTENUATION_TYPE:
      {
        LightLinearAttenuationType lightLinearAttenuationType = (LightLinearAttenuationType)theEObject;
        T result = caseLightLinearAttenuationType(lightLinearAttenuationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_LINEAR_ATTENUTATION_TYPE:
      {
        LightLinearAttenutationType lightLinearAttenutationType = (LightLinearAttenutationType)theEObject;
        T result = caseLightLinearAttenutationType(lightLinearAttenutationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_MODEL_AMBIENT_TYPE:
      {
        LightModelAmbientType lightModelAmbientType = (LightModelAmbientType)theEObject;
        T result = caseLightModelAmbientType(lightModelAmbientType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_MODEL_AMBIENT_TYPE1:
      {
        LightModelAmbientType1 lightModelAmbientType1 = (LightModelAmbientType1)theEObject;
        T result = caseLightModelAmbientType1(lightModelAmbientType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_MODEL_COLOR_CONTROL_TYPE:
      {
        LightModelColorControlType lightModelColorControlType = (LightModelColorControlType)theEObject;
        T result = caseLightModelColorControlType(lightModelColorControlType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_MODEL_LOCAL_VIEWER_ENABLE_TYPE:
      {
        LightModelLocalViewerEnableType lightModelLocalViewerEnableType = (LightModelLocalViewerEnableType)theEObject;
        T result = caseLightModelLocalViewerEnableType(lightModelLocalViewerEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_MODEL_TWO_SIDE_ENABLE_TYPE:
      {
        LightModelTwoSideEnableType lightModelTwoSideEnableType = (LightModelTwoSideEnableType)theEObject;
        T result = caseLightModelTwoSideEnableType(lightModelTwoSideEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_MODEL_TWO_SIDE_ENABLE_TYPE1:
      {
        LightModelTwoSideEnableType1 lightModelTwoSideEnableType1 = (LightModelTwoSideEnableType1)theEObject;
        T result = caseLightModelTwoSideEnableType1(lightModelTwoSideEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_POSITION_TYPE:
      {
        LightPositionType lightPositionType = (LightPositionType)theEObject;
        T result = caseLightPositionType(lightPositionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_POSITION_TYPE1:
      {
        LightPositionType1 lightPositionType1 = (LightPositionType1)theEObject;
        T result = caseLightPositionType1(lightPositionType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_QUADRATIC_ATTENUATION_TYPE:
      {
        LightQuadraticAttenuationType lightQuadraticAttenuationType = (LightQuadraticAttenuationType)theEObject;
        T result = caseLightQuadraticAttenuationType(lightQuadraticAttenuationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_QUADRATIC_ATTENUATION_TYPE1:
      {
        LightQuadraticAttenuationType1 lightQuadraticAttenuationType1 = (LightQuadraticAttenuationType1)theEObject;
        T result = caseLightQuadraticAttenuationType1(lightQuadraticAttenuationType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_SPECULAR_TYPE:
      {
        LightSpecularType lightSpecularType = (LightSpecularType)theEObject;
        T result = caseLightSpecularType(lightSpecularType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_SPECULAR_TYPE1:
      {
        LightSpecularType1 lightSpecularType1 = (LightSpecularType1)theEObject;
        T result = caseLightSpecularType1(lightSpecularType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_SPOT_CUTOFF_TYPE:
      {
        LightSpotCutoffType lightSpotCutoffType = (LightSpotCutoffType)theEObject;
        T result = caseLightSpotCutoffType(lightSpotCutoffType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_SPOT_CUTOFF_TYPE1:
      {
        LightSpotCutoffType1 lightSpotCutoffType1 = (LightSpotCutoffType1)theEObject;
        T result = caseLightSpotCutoffType1(lightSpotCutoffType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_SPOT_DIRECTION_TYPE:
      {
        LightSpotDirectionType lightSpotDirectionType = (LightSpotDirectionType)theEObject;
        T result = caseLightSpotDirectionType(lightSpotDirectionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_SPOT_DIRECTION_TYPE1:
      {
        LightSpotDirectionType1 lightSpotDirectionType1 = (LightSpotDirectionType1)theEObject;
        T result = caseLightSpotDirectionType1(lightSpotDirectionType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_SPOT_EXPONENT_TYPE:
      {
        LightSpotExponentType lightSpotExponentType = (LightSpotExponentType)theEObject;
        T result = caseLightSpotExponentType(lightSpotExponentType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_SPOT_EXPONENT_TYPE1:
      {
        LightSpotExponentType1 lightSpotExponentType1 = (LightSpotExponentType1)theEObject;
        T result = caseLightSpotExponentType1(lightSpotExponentType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIGHT_TYPE:
      {
        LightType lightType = (LightType)theEObject;
        T result = caseLightType(lightType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LIMITS_TYPE:
      {
        LimitsType limitsType = (LimitsType)theEObject;
        T result = caseLimitsType(limitsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LINEAR_TYPE:
      {
        LinearType linearType = (LinearType)theEObject;
        T result = caseLinearType(linearType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LINEAR_TYPE1:
      {
        LinearType1 linearType1 = (LinearType1)theEObject;
        T result = caseLinearType1(linearType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LINE_SMOOTH_ENABLE_TYPE:
      {
        LineSmoothEnableType lineSmoothEnableType = (LineSmoothEnableType)theEObject;
        T result = caseLineSmoothEnableType(lineSmoothEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LINE_SMOOTH_ENABLE_TYPE1:
      {
        LineSmoothEnableType1 lineSmoothEnableType1 = (LineSmoothEnableType1)theEObject;
        T result = caseLineSmoothEnableType1(lineSmoothEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LINE_STIPPLE_ENABLE_TYPE:
      {
        LineStippleEnableType lineStippleEnableType = (LineStippleEnableType)theEObject;
        T result = caseLineStippleEnableType(lineStippleEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LINE_STIPPLE_TYPE:
      {
        LineStippleType lineStippleType = (LineStippleType)theEObject;
        T result = caseLineStippleType(lineStippleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LINESTRIPS_TYPE:
      {
        LinestripsType linestripsType = (LinestripsType)theEObject;
        T result = caseLinestripsType(linestripsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LINES_TYPE:
      {
        LinesType linesType = (LinesType)theEObject;
        T result = caseLinesType(linesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LINE_WIDTH_TYPE:
      {
        LineWidthType lineWidthType = (LineWidthType)theEObject;
        T result = caseLineWidthType(lineWidthType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LINE_WIDTH_TYPE1:
      {
        LineWidthType1 lineWidthType1 = (LineWidthType1)theEObject;
        T result = caseLineWidthType1(lineWidthType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LOGIC_OP_ENABLE_TYPE:
      {
        LogicOpEnableType logicOpEnableType = (LogicOpEnableType)theEObject;
        T result = caseLogicOpEnableType(logicOpEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LOGIC_OP_TYPE:
      {
        LogicOpType logicOpType = (LogicOpType)theEObject;
        T result = caseLogicOpType(logicOpType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LOGIC_OP_TYPE1:
      {
        LogicOpType1 logicOpType1 = (LogicOpType1)theEObject;
        T result = caseLogicOpType1(logicOpType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.LOOKAT_TYPE:
      {
        LookatType lookatType = (LookatType)theEObject;
        T result = caseLookatType(lookatType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MASK_TYPE:
      {
        MaskType maskType = (MaskType)theEObject;
        T result = caseMaskType(maskType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MASK_TYPE1:
      {
        MaskType1 maskType1 = (MaskType1)theEObject;
        T result = caseMaskType1(maskType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MASK_TYPE2:
      {
        MaskType2 maskType2 = (MaskType2)theEObject;
        T result = caseMaskType2(maskType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MASK_TYPE3:
      {
        MaskType3 maskType3 = (MaskType3)theEObject;
        T result = caseMaskType3(maskType3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MASS_FRAME_TYPE:
      {
        MassFrameType massFrameType = (MassFrameType)theEObject;
        T result = caseMassFrameType(massFrameType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MASS_FRAME_TYPE1:
      {
        MassFrameType1 massFrameType1 = (MassFrameType1)theEObject;
        T result = caseMassFrameType1(massFrameType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MATERIAL_AMBIENT_TYPE:
      {
        MaterialAmbientType materialAmbientType = (MaterialAmbientType)theEObject;
        T result = caseMaterialAmbientType(materialAmbientType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MATERIAL_AMBIENT_TYPE1:
      {
        MaterialAmbientType1 materialAmbientType1 = (MaterialAmbientType1)theEObject;
        T result = caseMaterialAmbientType1(materialAmbientType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MATERIAL_DIFFUSE_TYPE:
      {
        MaterialDiffuseType materialDiffuseType = (MaterialDiffuseType)theEObject;
        T result = caseMaterialDiffuseType(materialDiffuseType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MATERIAL_DIFFUSE_TYPE1:
      {
        MaterialDiffuseType1 materialDiffuseType1 = (MaterialDiffuseType1)theEObject;
        T result = caseMaterialDiffuseType1(materialDiffuseType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MATERIAL_EMISSION_TYPE:
      {
        MaterialEmissionType materialEmissionType = (MaterialEmissionType)theEObject;
        T result = caseMaterialEmissionType(materialEmissionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MATERIAL_EMISSION_TYPE1:
      {
        MaterialEmissionType1 materialEmissionType1 = (MaterialEmissionType1)theEObject;
        T result = caseMaterialEmissionType1(materialEmissionType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MATERIAL_SHININESS_TYPE:
      {
        MaterialShininessType materialShininessType = (MaterialShininessType)theEObject;
        T result = caseMaterialShininessType(materialShininessType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MATERIAL_SHININESS_TYPE1:
      {
        MaterialShininessType1 materialShininessType1 = (MaterialShininessType1)theEObject;
        T result = caseMaterialShininessType1(materialShininessType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MATERIAL_SPECULAR_TYPE:
      {
        MaterialSpecularType materialSpecularType = (MaterialSpecularType)theEObject;
        T result = caseMaterialSpecularType(materialSpecularType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MATERIAL_SPECULAR_TYPE1:
      {
        MaterialSpecularType1 materialSpecularType1 = (MaterialSpecularType1)theEObject;
        T result = caseMaterialSpecularType1(materialSpecularType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MATERIAL_TYPE:
      {
        MaterialType materialType = (MaterialType)theEObject;
        T result = caseMaterialType(materialType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MATRIX_TYPE:
      {
        MatrixType matrixType = (MatrixType)theEObject;
        T result = caseMatrixType(matrixType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MESH_TYPE:
      {
        MeshType meshType = (MeshType)theEObject;
        T result = caseMeshType(meshType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MODEL_VIEW_MATRIX_TYPE:
      {
        ModelViewMatrixType modelViewMatrixType = (ModelViewMatrixType)theEObject;
        T result = caseModelViewMatrixType(modelViewMatrixType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MODEL_VIEW_MATRIX_TYPE1:
      {
        ModelViewMatrixType1 modelViewMatrixType1 = (ModelViewMatrixType1)theEObject;
        T result = caseModelViewMatrixType1(modelViewMatrixType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MODE_TYPE:
      {
        ModeType modeType = (ModeType)theEObject;
        T result = caseModeType(modeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MODE_TYPE1:
      {
        ModeType1 modeType1 = (ModeType1)theEObject;
        T result = caseModeType1(modeType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MORPH_TYPE:
      {
        MorphType morphType = (MorphType)theEObject;
        T result = caseMorphType(morphType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MULTISAMPLE_ENABLE_TYPE:
      {
        MultisampleEnableType multisampleEnableType = (MultisampleEnableType)theEObject;
        T result = caseMultisampleEnableType(multisampleEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.MULTISAMPLE_ENABLE_TYPE1:
      {
        MultisampleEnableType1 multisampleEnableType1 = (MultisampleEnableType1)theEObject;
        T result = caseMultisampleEnableType1(multisampleEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.NAME_ARRAY_TYPE:
      {
        NameArrayType nameArrayType = (NameArrayType)theEObject;
        T result = caseNameArrayType(nameArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.NAME_TYPE:
      {
        NameType nameType = (NameType)theEObject;
        T result = caseNameType(nameType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.NAME_TYPE1:
      {
        NameType1 nameType1 = (NameType1)theEObject;
        T result = caseNameType1(nameType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.NAME_TYPE2:
      {
        NameType2 nameType2 = (NameType2)theEObject;
        T result = caseNameType2(nameType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.NAME_TYPE3:
      {
        NameType3 nameType3 = (NameType3)theEObject;
        T result = caseNameType3(nameType3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.NODE_TYPE1:
      {
        NodeType1 nodeType1 = (NodeType1)theEObject;
        T result = caseNodeType1(nodeType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.NORMALIZE_ENABLE_TYPE:
      {
        NormalizeEnableType normalizeEnableType = (NormalizeEnableType)theEObject;
        T result = caseNormalizeEnableType(normalizeEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.NORMALIZE_ENABLE_TYPE1:
      {
        NormalizeEnableType1 normalizeEnableType1 = (NormalizeEnableType1)theEObject;
        T result = caseNormalizeEnableType1(normalizeEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.OPTICS_TYPE:
      {
        OpticsType opticsType = (OpticsType)theEObject;
        T result = caseOpticsType(opticsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ORTHOGRAPHIC_TYPE:
      {
        OrthographicType orthographicType = (OrthographicType)theEObject;
        T result = caseOrthographicType(orthographicType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PARAM_TYPE:
      {
        ParamType paramType = (ParamType)theEObject;
        T result = caseParamType(paramType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PARAM_TYPE1:
      {
        ParamType1 paramType1 = (ParamType1)theEObject;
        T result = caseParamType1(paramType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PARAM_TYPE2:
      {
        ParamType2 paramType2 = (ParamType2)theEObject;
        T result = caseParamType2(paramType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PARAM_TYPE3:
      {
        ParamType3 paramType3 = (ParamType3)theEObject;
        T result = caseParamType3(paramType3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PARAM_TYPE4:
      {
        ParamType4 paramType4 = (ParamType4)theEObject;
        T result = caseParamType4(paramType4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PASS_TYPE:
      {
        PassType passType = (PassType)theEObject;
        T result = casePassType(passType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PASS_TYPE1:
      {
        PassType1 passType1 = (PassType1)theEObject;
        T result = casePassType1(passType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PASS_TYPE2:
      {
        PassType2 passType2 = (PassType2)theEObject;
        T result = casePassType2(passType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PERSPECTIVE_TYPE:
      {
        PerspectiveType perspectiveType = (PerspectiveType)theEObject;
        T result = casePerspectiveType(perspectiveType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PHONG_TYPE:
      {
        PhongType phongType = (PhongType)theEObject;
        T result = casePhongType(phongType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PH_TYPE:
      {
        PhType phType = (PhType)theEObject;
        T result = casePhType(phType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PHYSICS_MATERIAL_TYPE:
      {
        PhysicsMaterialType physicsMaterialType = (PhysicsMaterialType)theEObject;
        T result = casePhysicsMaterialType(physicsMaterialType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PHYSICS_MODEL_TYPE:
      {
        PhysicsModelType physicsModelType = (PhysicsModelType)theEObject;
        T result = casePhysicsModelType(physicsModelType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PHYSICS_SCENE_TYPE:
      {
        PhysicsSceneType physicsSceneType = (PhysicsSceneType)theEObject;
        T result = casePhysicsSceneType(physicsSceneType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PLANE_TYPE:
      {
        PlaneType planeType = (PlaneType)theEObject;
        T result = casePlaneType(planeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POINT_DISTANCE_ATTENUATION_TYPE:
      {
        PointDistanceAttenuationType pointDistanceAttenuationType = (PointDistanceAttenuationType)theEObject;
        T result = casePointDistanceAttenuationType(pointDistanceAttenuationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POINT_DISTANCE_ATTENUATION_TYPE1:
      {
        PointDistanceAttenuationType1 pointDistanceAttenuationType1 = (PointDistanceAttenuationType1)theEObject;
        T result = casePointDistanceAttenuationType1(pointDistanceAttenuationType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POINT_FADE_THRESHOLD_SIZE_TYPE:
      {
        PointFadeThresholdSizeType pointFadeThresholdSizeType = (PointFadeThresholdSizeType)theEObject;
        T result = casePointFadeThresholdSizeType(pointFadeThresholdSizeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POINT_FADE_THRESHOLD_SIZE_TYPE1:
      {
        PointFadeThresholdSizeType1 pointFadeThresholdSizeType1 = (PointFadeThresholdSizeType1)theEObject;
        T result = casePointFadeThresholdSizeType1(pointFadeThresholdSizeType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POINT_SIZE_MAX_TYPE:
      {
        PointSizeMaxType pointSizeMaxType = (PointSizeMaxType)theEObject;
        T result = casePointSizeMaxType(pointSizeMaxType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POINT_SIZE_MAX_TYPE1:
      {
        PointSizeMaxType1 pointSizeMaxType1 = (PointSizeMaxType1)theEObject;
        T result = casePointSizeMaxType1(pointSizeMaxType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POINT_SIZE_MIN_TYPE:
      {
        PointSizeMinType pointSizeMinType = (PointSizeMinType)theEObject;
        T result = casePointSizeMinType(pointSizeMinType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POINT_SIZE_MIN_TYPE1:
      {
        PointSizeMinType1 pointSizeMinType1 = (PointSizeMinType1)theEObject;
        T result = casePointSizeMinType1(pointSizeMinType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POINT_SIZE_TYPE:
      {
        PointSizeType pointSizeType = (PointSizeType)theEObject;
        T result = casePointSizeType(pointSizeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POINT_SIZE_TYPE1:
      {
        PointSizeType1 pointSizeType1 = (PointSizeType1)theEObject;
        T result = casePointSizeType1(pointSizeType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POINT_SMOOTH_ENABLE_TYPE:
      {
        PointSmoothEnableType pointSmoothEnableType = (PointSmoothEnableType)theEObject;
        T result = casePointSmoothEnableType(pointSmoothEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POINT_SMOOTH_ENABLE_TYPE1:
      {
        PointSmoothEnableType1 pointSmoothEnableType1 = (PointSmoothEnableType1)theEObject;
        T result = casePointSmoothEnableType1(pointSmoothEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POINT_TYPE:
      {
        PointType pointType = (PointType)theEObject;
        T result = casePointType(pointType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POLYGON_MODE_TYPE:
      {
        PolygonModeType polygonModeType = (PolygonModeType)theEObject;
        T result = casePolygonModeType(polygonModeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POLYGON_OFFSET_FILL_ENABLE_TYPE:
      {
        PolygonOffsetFillEnableType polygonOffsetFillEnableType = (PolygonOffsetFillEnableType)theEObject;
        T result = casePolygonOffsetFillEnableType(polygonOffsetFillEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POLYGON_OFFSET_FILL_ENABLE_TYPE1:
      {
        PolygonOffsetFillEnableType1 polygonOffsetFillEnableType1 = (PolygonOffsetFillEnableType1)theEObject;
        T result = casePolygonOffsetFillEnableType1(polygonOffsetFillEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POLYGON_OFFSET_LINE_ENABLE_TYPE:
      {
        PolygonOffsetLineEnableType polygonOffsetLineEnableType = (PolygonOffsetLineEnableType)theEObject;
        T result = casePolygonOffsetLineEnableType(polygonOffsetLineEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POLYGON_OFFSET_POINT_ENABLE_TYPE:
      {
        PolygonOffsetPointEnableType polygonOffsetPointEnableType = (PolygonOffsetPointEnableType)theEObject;
        T result = casePolygonOffsetPointEnableType(polygonOffsetPointEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POLYGON_OFFSET_TYPE:
      {
        PolygonOffsetType polygonOffsetType = (PolygonOffsetType)theEObject;
        T result = casePolygonOffsetType(polygonOffsetType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POLYGON_OFFSET_TYPE1:
      {
        PolygonOffsetType1 polygonOffsetType1 = (PolygonOffsetType1)theEObject;
        T result = casePolygonOffsetType1(polygonOffsetType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POLYGON_SMOOTH_ENABLE_TYPE:
      {
        PolygonSmoothEnableType polygonSmoothEnableType = (PolygonSmoothEnableType)theEObject;
        T result = casePolygonSmoothEnableType(polygonSmoothEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POLYGON_STIPPLE_ENABLE_TYPE:
      {
        PolygonStippleEnableType polygonStippleEnableType = (PolygonStippleEnableType)theEObject;
        T result = casePolygonStippleEnableType(polygonStippleEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POLYGONS_TYPE:
      {
        PolygonsType polygonsType = (PolygonsType)theEObject;
        T result = casePolygonsType(polygonsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.POLYLIST_TYPE:
      {
        PolylistType polylistType = (PolylistType)theEObject;
        T result = casePolylistType(polylistType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PRIMARY_TYPE:
      {
        PrimaryType primaryType = (PrimaryType)theEObject;
        T result = casePrimaryType(primaryType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PRIMARY_TYPE1:
      {
        PrimaryType1 primaryType1 = (PrimaryType1)theEObject;
        T result = casePrimaryType1(primaryType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PROFILE_CG_TYPE:
      {
        ProfileCGType profileCGType = (ProfileCGType)theEObject;
        T result = caseProfileCGType(profileCGType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PROFILE_COMMON_TYPE:
      {
        ProfileCOMMONType profileCOMMONType = (ProfileCOMMONType)theEObject;
        T result = caseProfileCOMMONType(profileCOMMONType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PROFILE_GLES_TYPE:
      {
        ProfileGLESType profileGLESType = (ProfileGLESType)theEObject;
        T result = caseProfileGLESType(profileGLESType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PROFILE_GLSL_TYPE:
      {
        ProfileGLSLType profileGLSLType = (ProfileGLSLType)theEObject;
        T result = caseProfileGLSLType(profileGLSLType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PROJECTION_MATRIX_TYPE:
      {
        ProjectionMatrixType projectionMatrixType = (ProjectionMatrixType)theEObject;
        T result = caseProjectionMatrixType(projectionMatrixType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.PROJECTION_MATRIX_TYPE1:
      {
        ProjectionMatrixType1 projectionMatrixType1 = (ProjectionMatrixType1)theEObject;
        T result = caseProjectionMatrixType1(projectionMatrixType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.REF_ATTACHMENT_TYPE:
      {
        RefAttachmentType refAttachmentType = (RefAttachmentType)theEObject;
        T result = caseRefAttachmentType(refAttachmentType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.REF_TYPE:
      {
        RefType refType = (RefType)theEObject;
        T result = caseRefType(refType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.REF_TYPE1:
      {
        RefType1 refType1 = (RefType1)theEObject;
        T result = caseRefType1(refType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.REF_TYPE2:
      {
        RefType2 refType2 = (RefType2)theEObject;
        T result = caseRefType2(refType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.RENDER_TYPE:
      {
        RenderType renderType = (RenderType)theEObject;
        T result = caseRenderType(renderType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.RESCALE_NORMAL_ENABLE_TYPE:
      {
        RescaleNormalEnableType rescaleNormalEnableType = (RescaleNormalEnableType)theEObject;
        T result = caseRescaleNormalEnableType(rescaleNormalEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.RESCALE_NORMAL_ENABLE_TYPE1:
      {
        RescaleNormalEnableType1 rescaleNormalEnableType1 = (RescaleNormalEnableType1)theEObject;
        T result = caseRescaleNormalEnableType1(rescaleNormalEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.RGB_TYPE:
      {
        RgbType rgbType = (RgbType)theEObject;
        T result = caseRgbType(rgbType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.RIGID_BODY_TYPE:
      {
        RigidBodyType rigidBodyType = (RigidBodyType)theEObject;
        T result = caseRigidBodyType(rigidBodyType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.RIGID_CONSTRAINT_TYPE:
      {
        RigidConstraintType rigidConstraintType = (RigidConstraintType)theEObject;
        T result = caseRigidConstraintType(rigidConstraintType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ROTATE_TYPE:
      {
        RotateType rotateType = (RotateType)theEObject;
        T result = caseRotateType(rotateType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SAMPLE_ALPHA_TO_COVERAGE_ENABLE_TYPE:
      {
        SampleAlphaToCoverageEnableType sampleAlphaToCoverageEnableType = (SampleAlphaToCoverageEnableType)theEObject;
        T result = caseSampleAlphaToCoverageEnableType(sampleAlphaToCoverageEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SAMPLE_ALPHA_TO_COVERAGE_ENABLE_TYPE1:
      {
        SampleAlphaToCoverageEnableType1 sampleAlphaToCoverageEnableType1 = (SampleAlphaToCoverageEnableType1)theEObject;
        T result = caseSampleAlphaToCoverageEnableType1(sampleAlphaToCoverageEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SAMPLE_ALPHA_TO_ONE_ENABLE_TYPE:
      {
        SampleAlphaToOneEnableType sampleAlphaToOneEnableType = (SampleAlphaToOneEnableType)theEObject;
        T result = caseSampleAlphaToOneEnableType(sampleAlphaToOneEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SAMPLE_ALPHA_TO_ONE_ENABLE_TYPE1:
      {
        SampleAlphaToOneEnableType1 sampleAlphaToOneEnableType1 = (SampleAlphaToOneEnableType1)theEObject;
        T result = caseSampleAlphaToOneEnableType1(sampleAlphaToOneEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SAMPLE_COVERAGE_ENABLE_TYPE:
      {
        SampleCoverageEnableType sampleCoverageEnableType = (SampleCoverageEnableType)theEObject;
        T result = caseSampleCoverageEnableType(sampleCoverageEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SAMPLE_COVERAGE_ENABLE_TYPE1:
      {
        SampleCoverageEnableType1 sampleCoverageEnableType1 = (SampleCoverageEnableType1)theEObject;
        T result = caseSampleCoverageEnableType1(sampleCoverageEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SAMPLER_TYPE:
      {
        SamplerType samplerType = (SamplerType)theEObject;
        T result = caseSamplerType(samplerType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SCENE_TYPE:
      {
        SceneType sceneType = (SceneType)theEObject;
        T result = caseSceneType(sceneType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SCISSOR_TEST_ENABLE_TYPE:
      {
        ScissorTestEnableType scissorTestEnableType = (ScissorTestEnableType)theEObject;
        T result = caseScissorTestEnableType(scissorTestEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SCISSOR_TEST_ENABLE_TYPE1:
      {
        ScissorTestEnableType1 scissorTestEnableType1 = (ScissorTestEnableType1)theEObject;
        T result = caseScissorTestEnableType1(scissorTestEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SCISSOR_TYPE:
      {
        ScissorType scissorType = (ScissorType)theEObject;
        T result = caseScissorType(scissorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SCISSOR_TYPE1:
      {
        ScissorType1 scissorType1 = (ScissorType1)theEObject;
        T result = caseScissorType1(scissorType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SETPARAM_TYPE:
      {
        SetparamType setparamType = (SetparamType)theEObject;
        T result = caseSetparamType(setparamType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SETPARAM_TYPE1:
      {
        SetparamType1 setparamType1 = (SetparamType1)theEObject;
        T result = caseSetparamType1(setparamType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SHADE_MODEL_TYPE:
      {
        ShadeModelType shadeModelType = (ShadeModelType)theEObject;
        T result = caseShadeModelType(shadeModelType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SHADE_MODEL_TYPE1:
      {
        ShadeModelType1 shadeModelType1 = (ShadeModelType1)theEObject;
        T result = caseShadeModelType1(shadeModelType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SHADER_TYPE:
      {
        ShaderType shaderType = (ShaderType)theEObject;
        T result = caseShaderType(shaderType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SHADER_TYPE1:
      {
        ShaderType1 shaderType1 = (ShaderType1)theEObject;
        T result = caseShaderType1(shaderType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SHAPE_TYPE:
      {
        ShapeType shapeType = (ShapeType)theEObject;
        T result = caseShapeType(shapeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SHAPE_TYPE1:
      {
        ShapeType1 shapeType1 = (ShapeType1)theEObject;
        T result = caseShapeType1(shapeType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SKEW_TYPE:
      {
        SkewType skewType = (SkewType)theEObject;
        T result = caseSkewType(skewType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SKIN_TYPE:
      {
        SkinType skinType = (SkinType)theEObject;
        T result = caseSkinType(skinType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SOURCE_TYPE:
      {
        SourceType sourceType = (SourceType)theEObject;
        T result = caseSourceType(sourceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SPHERE_TYPE:
      {
        SphereType sphereType = (SphereType)theEObject;
        T result = caseSphereType(sphereType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SPLINE_TYPE:
      {
        SplineType splineType = (SplineType)theEObject;
        T result = caseSplineType(splineType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SPOT_TYPE:
      {
        SpotType spotType = (SpotType)theEObject;
        T result = caseSpotType(spotType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SPRING_TYPE1:
      {
        SpringType1 springType1 = (SpringType1)theEObject;
        T result = caseSpringType1(springType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SRC_ALPHA_TYPE:
      {
        SrcAlphaType srcAlphaType = (SrcAlphaType)theEObject;
        T result = caseSrcAlphaType(srcAlphaType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SRC_RGB_TYPE:
      {
        SrcRgbType srcRgbType = (SrcRgbType)theEObject;
        T result = caseSrcRgbType(srcRgbType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SRC_TYPE:
      {
        SrcType srcType = (SrcType)theEObject;
        T result = caseSrcType(srcType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SRC_TYPE1:
      {
        SrcType1 srcType1 = (SrcType1)theEObject;
        T result = caseSrcType1(srcType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.STENCIL_FUNC_SEPARATE_TYPE:
      {
        StencilFuncSeparateType stencilFuncSeparateType = (StencilFuncSeparateType)theEObject;
        T result = caseStencilFuncSeparateType(stencilFuncSeparateType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.STENCIL_FUNC_TYPE:
      {
        StencilFuncType stencilFuncType = (StencilFuncType)theEObject;
        T result = caseStencilFuncType(stencilFuncType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.STENCIL_FUNC_TYPE1:
      {
        StencilFuncType1 stencilFuncType1 = (StencilFuncType1)theEObject;
        T result = caseStencilFuncType1(stencilFuncType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.STENCIL_MASK_SEPARATE_TYPE:
      {
        StencilMaskSeparateType stencilMaskSeparateType = (StencilMaskSeparateType)theEObject;
        T result = caseStencilMaskSeparateType(stencilMaskSeparateType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.STENCIL_MASK_TYPE:
      {
        StencilMaskType stencilMaskType = (StencilMaskType)theEObject;
        T result = caseStencilMaskType(stencilMaskType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.STENCIL_MASK_TYPE1:
      {
        StencilMaskType1 stencilMaskType1 = (StencilMaskType1)theEObject;
        T result = caseStencilMaskType1(stencilMaskType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.STENCIL_OP_SEPARATE_TYPE:
      {
        StencilOpSeparateType stencilOpSeparateType = (StencilOpSeparateType)theEObject;
        T result = caseStencilOpSeparateType(stencilOpSeparateType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.STENCIL_OP_TYPE:
      {
        StencilOpType stencilOpType = (StencilOpType)theEObject;
        T result = caseStencilOpType(stencilOpType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.STENCIL_OP_TYPE1:
      {
        StencilOpType1 stencilOpType1 = (StencilOpType1)theEObject;
        T result = caseStencilOpType1(stencilOpType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.STENCIL_TEST_ENABLE_TYPE:
      {
        StencilTestEnableType stencilTestEnableType = (StencilTestEnableType)theEObject;
        T result = caseStencilTestEnableType(stencilTestEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.STENCIL_TEST_ENABLE_TYPE1:
      {
        StencilTestEnableType1 stencilTestEnableType1 = (StencilTestEnableType1)theEObject;
        T result = caseStencilTestEnableType1(stencilTestEnableType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.SWING_CONE_AND_TWIST_TYPE:
      {
        SwingConeAndTwistType swingConeAndTwistType = (SwingConeAndTwistType)theEObject;
        T result = caseSwingConeAndTwistType(swingConeAndTwistType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TAPERED_CAPSULE_TYPE:
      {
        TaperedCapsuleType taperedCapsuleType = (TaperedCapsuleType)theEObject;
        T result = caseTaperedCapsuleType(taperedCapsuleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TAPERED_CYLINDER_TYPE:
      {
        TaperedCylinderType taperedCylinderType = (TaperedCylinderType)theEObject;
        T result = caseTaperedCylinderType(taperedCylinderType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TARGETABLE_FLOAT:
      {
        TargetableFloat targetableFloat = (TargetableFloat)theEObject;
        T result = caseTargetableFloat(targetableFloat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TARGETABLE_FLOAT3:
      {
        TargetableFloat3 targetableFloat3 = (TargetableFloat3)theEObject;
        T result = caseTargetableFloat3(targetableFloat3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TARGETS_TYPE:
      {
        TargetsType targetsType = (TargetsType)theEObject;
        T result = caseTargetsType(targetsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TECHNIQUE_COMMON_TYPE:
      {
        TechniqueCommonType techniqueCommonType = (TechniqueCommonType)theEObject;
        T result = caseTechniqueCommonType(techniqueCommonType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1:
      {
        TechniqueCommonType1 techniqueCommonType1 = (TechniqueCommonType1)theEObject;
        T result = caseTechniqueCommonType1(techniqueCommonType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TECHNIQUE_COMMON_TYPE2:
      {
        TechniqueCommonType2 techniqueCommonType2 = (TechniqueCommonType2)theEObject;
        T result = caseTechniqueCommonType2(techniqueCommonType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TECHNIQUE_COMMON_TYPE3:
      {
        TechniqueCommonType3 techniqueCommonType3 = (TechniqueCommonType3)theEObject;
        T result = caseTechniqueCommonType3(techniqueCommonType3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TECHNIQUE_COMMON_TYPE4:
      {
        TechniqueCommonType4 techniqueCommonType4 = (TechniqueCommonType4)theEObject;
        T result = caseTechniqueCommonType4(techniqueCommonType4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TECHNIQUE_COMMON_TYPE5:
      {
        TechniqueCommonType5 techniqueCommonType5 = (TechniqueCommonType5)theEObject;
        T result = caseTechniqueCommonType5(techniqueCommonType5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6:
      {
        TechniqueCommonType6 techniqueCommonType6 = (TechniqueCommonType6)theEObject;
        T result = caseTechniqueCommonType6(techniqueCommonType6);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TECHNIQUE_COMMON_TYPE7:
      {
        TechniqueCommonType7 techniqueCommonType7 = (TechniqueCommonType7)theEObject;
        T result = caseTechniqueCommonType7(techniqueCommonType7);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TECHNIQUE_COMMON_TYPE8:
      {
        TechniqueCommonType8 techniqueCommonType8 = (TechniqueCommonType8)theEObject;
        T result = caseTechniqueCommonType8(techniqueCommonType8);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TECHNIQUE_HINT_TYPE:
      {
        TechniqueHintType techniqueHintType = (TechniqueHintType)theEObject;
        T result = caseTechniqueHintType(techniqueHintType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TECHNIQUE_TYPE:
      {
        TechniqueType techniqueType = (TechniqueType)theEObject;
        T result = caseTechniqueType(techniqueType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TECHNIQUE_TYPE1:
      {
        TechniqueType1 techniqueType1 = (TechniqueType1)theEObject;
        T result = caseTechniqueType1(techniqueType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TECHNIQUE_TYPE2:
      {
        TechniqueType2 techniqueType2 = (TechniqueType2)theEObject;
        T result = caseTechniqueType2(techniqueType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TECHNIQUE_TYPE3:
      {
        TechniqueType3 techniqueType3 = (TechniqueType3)theEObject;
        T result = caseTechniqueType3(techniqueType3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TECHNIQUE_TYPE4:
      {
        TechniqueType4 techniqueType4 = (TechniqueType4)theEObject;
        T result = caseTechniqueType4(techniqueType4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXCOORD_TYPE:
      {
        TexcoordType texcoordType = (TexcoordType)theEObject;
        T result = caseTexcoordType(texcoordType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE1_DENABLE_TYPE:
      {
        Texture1DEnableType texture1DEnableType = (Texture1DEnableType)theEObject;
        T result = caseTexture1DEnableType(texture1DEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE1_DTYPE:
      {
        Texture1DType texture1DType = (Texture1DType)theEObject;
        T result = caseTexture1DType(texture1DType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE2_DENABLE_TYPE:
      {
        Texture2DEnableType texture2DEnableType = (Texture2DEnableType)theEObject;
        T result = caseTexture2DEnableType(texture2DEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE2_DTYPE:
      {
        Texture2DType texture2DType = (Texture2DType)theEObject;
        T result = caseTexture2DType(texture2DType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE3_DENABLE_TYPE:
      {
        Texture3DEnableType texture3DEnableType = (Texture3DEnableType)theEObject;
        T result = caseTexture3DEnableType(texture3DEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE3_DTYPE:
      {
        Texture3DType texture3DType = (Texture3DType)theEObject;
        T result = caseTexture3DType(texture3DType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE_CUBE_ENABLE_TYPE:
      {
        TextureCUBEEnableType textureCUBEEnableType = (TextureCUBEEnableType)theEObject;
        T result = caseTextureCUBEEnableType(textureCUBEEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE_CUBE_TYPE:
      {
        TextureCUBEType textureCUBEType = (TextureCUBEType)theEObject;
        T result = caseTextureCUBEType(textureCUBEType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE_DEPTH_ENABLE_TYPE:
      {
        TextureDEPTHEnableType textureDEPTHEnableType = (TextureDEPTHEnableType)theEObject;
        T result = caseTextureDEPTHEnableType(textureDEPTHEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE_DEPTH_TYPE:
      {
        TextureDEPTHType textureDEPTHType = (TextureDEPTHType)theEObject;
        T result = caseTextureDEPTHType(textureDEPTHType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE_ENV_COLOR_TYPE:
      {
        TextureEnvColorType textureEnvColorType = (TextureEnvColorType)theEObject;
        T result = caseTextureEnvColorType(textureEnvColorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE_ENV_MODE_TYPE:
      {
        TextureEnvModeType textureEnvModeType = (TextureEnvModeType)theEObject;
        T result = caseTextureEnvModeType(textureEnvModeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE_PIPELINE_ENABLE_TYPE:
      {
        TexturePipelineEnableType texturePipelineEnableType = (TexturePipelineEnableType)theEObject;
        T result = caseTexturePipelineEnableType(texturePipelineEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE_PIPELINE_TYPE:
      {
        TexturePipelineType texturePipelineType = (TexturePipelineType)theEObject;
        T result = caseTexturePipelineType(texturePipelineType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE_RECT_ENABLE_TYPE:
      {
        TextureRECTEnableType textureRECTEnableType = (TextureRECTEnableType)theEObject;
        T result = caseTextureRECTEnableType(textureRECTEnableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE_RECT_TYPE:
      {
        TextureRECTType textureRECTType = (TextureRECTType)theEObject;
        T result = caseTextureRECTType(textureRECTType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TEXTURE_TYPE:
      {
        TextureType textureType = (TextureType)theEObject;
        T result = caseTextureType(textureType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TRIANGLES_TYPE:
      {
        TrianglesType trianglesType = (TrianglesType)theEObject;
        T result = caseTrianglesType(trianglesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TRIFANS_TYPE:
      {
        TrifansType trifansType = (TrifansType)theEObject;
        T result = caseTrifansType(trifansType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.TRISTRIPS_TYPE:
      {
        TristripsType tristripsType = (TristripsType)theEObject;
        T result = caseTristripsType(tristripsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.UNIT_TYPE:
      {
        UnitType unitType = (UnitType)theEObject;
        T result = caseUnitType(unitType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.VALUE_TYPE:
      {
        ValueType valueType = (ValueType)theEObject;
        T result = caseValueType(valueType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.VALUE_TYPE1:
      {
        ValueType1 valueType1 = (ValueType1)theEObject;
        T result = caseValueType1(valueType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.VERTEX_WEIGHTS_TYPE:
      {
        VertexWeightsType vertexWeightsType = (VertexWeightsType)theEObject;
        T result = caseVertexWeightsType(vertexWeightsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.VERTICES_TYPE:
      {
        VerticesType verticesType = (VerticesType)theEObject;
        T result = caseVerticesType(verticesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.VISUAL_SCENE_TYPE:
      {
        VisualSceneType visualSceneType = (VisualSceneType)theEObject;
        T result = caseVisualSceneType(visualSceneType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ZFAIL_TYPE:
      {
        ZfailType zfailType = (ZfailType)theEObject;
        T result = caseZfailType(zfailType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ZFAIL_TYPE1:
      {
        ZfailType1 zfailType1 = (ZfailType1)theEObject;
        T result = caseZfailType1(zfailType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ZFAIL_TYPE2:
      {
        ZfailType2 zfailType2 = (ZfailType2)theEObject;
        T result = caseZfailType2(zfailType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ZPASS_TYPE:
      {
        ZpassType zpassType = (ZpassType)theEObject;
        T result = caseZpassType(zpassType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ZPASS_TYPE1:
      {
        ZpassType1 zpassType1 = (ZpassType1)theEObject;
        T result = caseZpassType1(zpassType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ColladaPackage.ZPASS_TYPE2:
      {
        ZpassType2 zpassType2 = (ZpassType2)theEObject;
        T result = caseZpassType2(zpassType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Accessor Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accessor Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAccessorType(AccessorType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>All Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>All Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAllType(AllType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>All Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>All Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAllType1(AllType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>All Type2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>All Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAllType2(AllType2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Alpha Func Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alpha Func Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAlphaFuncType(AlphaFuncType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Alpha Func Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alpha Func Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAlphaFuncType1(AlphaFuncType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Alpha Test Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alpha Test Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAlphaTestEnableType(AlphaTestEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Alpha Test Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alpha Test Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAlphaTestEnableType1(AlphaTestEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Alpha Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alpha Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAlphaType(AlphaType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Ambient Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ambient Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAmbientType(AmbientType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Angular Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Angular Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAngularType(AngularType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Animation Clip Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Animation Clip Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAnimationClipType(AnimationClipType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Animation Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Animation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAnimationType(AnimationType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Asset Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Asset Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAssetType(AssetType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Attachment Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attachment Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAttachmentType(AttachmentType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Auto Normal Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Auto Normal Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAutoNormalEnableType(AutoNormalEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Back Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Back Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBackType(BackType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Bind Material Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bind Material Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBindMaterialType(BindMaterialType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Bind Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bind Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBindType(BindType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Bind Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bind Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBindType1(BindType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Bind Type2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bind Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBindType2(BindType2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Bind Vertex Input Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bind Vertex Input Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBindVertexInputType(BindVertexInputType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Blend Color Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blend Color Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBlendColorType(BlendColorType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Blend Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blend Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBlendEnableType(BlendEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Blend Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blend Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBlendEnableType1(BlendEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Blend Equation Separate Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blend Equation Separate Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBlendEquationSeparateType(BlendEquationSeparateType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Blend Equation Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blend Equation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBlendEquationType(BlendEquationType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Blend Func Separate Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blend Func Separate Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBlendFuncSeparateType(BlendFuncSeparateType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Blend Func Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blend Func Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBlendFuncType(BlendFuncType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Blend Func Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blend Func Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBlendFuncType1(BlendFuncType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Blinn Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blinn Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBlinnType(BlinnType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Bool Array Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBoolArrayType(BoolArrayType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Box Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Box Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBoxType(BoxType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Camera Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Camera Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCameraType(CameraType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Capsule Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Capsule Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCapsuleType(CapsuleType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cg Connect Param</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cg Connect Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCgConnectParam(CgConnectParam object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cg Newarray Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cg Newarray Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCgNewarrayType(CgNewarrayType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cg Newparam</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cg Newparam</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCgNewparam(CgNewparam object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cg Sampler1 D</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cg Sampler1 D</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCgSampler1D(CgSampler1D object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cg Sampler2 D</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cg Sampler2 D</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCgSampler2D(CgSampler2D object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cg Sampler3 D</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cg Sampler3 D</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCgSampler3D(CgSampler3D object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cg Sampler CUBE</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cg Sampler CUBE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCgSamplerCUBE(CgSamplerCUBE object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cg Sampler DEPTH</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cg Sampler DEPTH</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCgSamplerDEPTH(CgSamplerDEPTH object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cg Sampler RECT</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cg Sampler RECT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCgSamplerRECT(CgSamplerRECT object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cg Setarray Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cg Setarray Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCgSetarrayType(CgSetarrayType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cg Setparam</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cg Setparam</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCgSetparam(CgSetparam object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cg Setparam Simple</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cg Setparam Simple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCgSetparamSimple(CgSetparamSimple object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cg Setuser Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cg Setuser Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCgSetuserType(CgSetuserType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cg Surface Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cg Surface Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCgSurfaceType(CgSurfaceType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Channel Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Channel Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseChannelType(ChannelType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Clear Color Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clear Color Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClearColorType(ClearColorType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Clear Color Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clear Color Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClearColorType1(ClearColorType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Clear Depth Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clear Depth Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClearDepthType(ClearDepthType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Clear Depth Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clear Depth Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClearDepthType1(ClearDepthType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Clear Stencil Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clear Stencil Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClearStencilType(ClearStencilType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Clear Stencil Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clear Stencil Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClearStencilType1(ClearStencilType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Clip Plane Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clip Plane Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClipPlaneEnableType(ClipPlaneEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Clip Plane Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clip Plane Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClipPlaneEnableType1(ClipPlaneEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Clip Plane Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clip Plane Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClipPlaneType(ClipPlaneType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Clip Plane Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clip Plane Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClipPlaneType1(ClipPlaneType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>COLLADA Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>COLLADA Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCOLLADAType(COLLADAType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Color Logic Op Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Logic Op Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseColorLogicOpEnableType(ColorLogicOpEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Color Logic Op Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Logic Op Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseColorLogicOpEnableType1(ColorLogicOpEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Color Mask Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Mask Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseColorMaskType(ColorMaskType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Color Mask Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Mask Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseColorMaskType1(ColorMaskType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Color Material Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Material Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseColorMaterialEnableType(ColorMaterialEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Color Material Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Material Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseColorMaterialEnableType1(ColorMaterialEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Color Material Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Material Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseColorMaterialType(ColorMaterialType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Color Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseColorType(ColorType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Common Color Or Texture Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Common Color Or Texture Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCommonColorOrTextureType(CommonColorOrTextureType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Common Float Or Param Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Common Float Or Param Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCommonFloatOrParamType(CommonFloatOrParamType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Common Newparam Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Common Newparam Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCommonNewparamType(CommonNewparamType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Common Transparent Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Common Transparent Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCommonTransparentType(CommonTransparentType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Compiler Target Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compiler Target Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCompilerTargetType(CompilerTargetType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Compiler Target Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compiler Target Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCompilerTargetType1(CompilerTargetType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Constant Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseConstantType(ConstantType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Contributor Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contributor Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseContributorType(ContributorType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Controller Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Controller Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseControllerType(ControllerType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Control Vertices Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Vertices Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseControlVerticesType(ControlVerticesType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Convex Mesh Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Convex Mesh Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseConvexMeshType(ConvexMeshType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cull Face Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cull Face Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCullFaceEnableType(CullFaceEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cull Face Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cull Face Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCullFaceEnableType1(CullFaceEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cull Face Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cull Face Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCullFaceType(CullFaceType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cull Face Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cull Face Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCullFaceType1(CullFaceType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cylinder Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cylinder Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCylinderType(CylinderType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Depth Bounds Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Depth Bounds Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDepthBoundsEnableType(DepthBoundsEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Depth Bounds Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Depth Bounds Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDepthBoundsType(DepthBoundsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Depth Clamp Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Depth Clamp Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDepthClampEnableType(DepthClampEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Depth Func Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Depth Func Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDepthFuncType(DepthFuncType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Depth Func Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Depth Func Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDepthFuncType1(DepthFuncType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Depth Mask Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Depth Mask Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDepthMaskType(DepthMaskType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Depth Mask Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Depth Mask Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDepthMaskType1(DepthMaskType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Depth Range Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Depth Range Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDepthRangeType(DepthRangeType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Depth Range Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Depth Range Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDepthRangeType1(DepthRangeType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Depth Test Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Depth Test Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDepthTestEnableType(DepthTestEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Depth Test Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Depth Test Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDepthTestEnableType1(DepthTestEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dest Alpha Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dest Alpha Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDestAlphaType(DestAlphaType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dest Rgb Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dest Rgb Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDestRgbType(DestRgbType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dest Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dest Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDestType(DestType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dest Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dest Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDestType1(DestType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Directional Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Directional Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDirectionalType(DirectionalType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dither Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dither Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDitherEnableType(DitherEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dither Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dither Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDitherEnableType1(DitherEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDocumentRoot(DocumentRoot object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dynamic Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dynamic Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDynamicType(DynamicType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dynamic Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dynamic Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDynamicType1(DynamicType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Effect Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseEffectType(EffectType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Ellipsoid Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ellipsoid Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseEllipsoidType(EllipsoidType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Enabled Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enabled Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseEnabledType(EnabledType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Evaluate Scene Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evaluate Scene Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseEvaluateSceneType(EvaluateSceneType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Extra Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extra Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseExtraType(ExtraType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Face Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Face Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFaceType(FaceType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Face Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Face Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFaceType1(FaceType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Face Type2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Face Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFaceType2(FaceType2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Face Type3</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Face Type3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFaceType3(FaceType3 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Face Type4</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Face Type4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFaceType4(FaceType4 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fail Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fail Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFailType(FailType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fail Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fail Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFailType1(FailType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fail Type2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fail Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFailType2(FailType2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Float Array Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFloatArrayType(FloatArrayType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Float Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFloatType(FloatType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fog Color Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fog Color Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFogColorType(FogColorType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fog Color Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fog Color Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFogColorType1(FogColorType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fog Coord Src Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fog Coord Src Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFogCoordSrcType(FogCoordSrcType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fog Density Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fog Density Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFogDensityType(FogDensityType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fog Density Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fog Density Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFogDensityType1(FogDensityType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fog Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fog Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFogEnableType(FogEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fog Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fog Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFogEnableType1(FogEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fog End Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fog End Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFogEndType(FogEndType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fog End Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fog End Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFogEndType1(FogEndType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fog Mode Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fog Mode Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFogModeType(FogModeType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fog Mode Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fog Mode Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFogModeType1(FogModeType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fog Start Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fog Start Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFogStartType(FogStartType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fog Start Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fog Start Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFogStartType1(FogStartType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Force Field Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Force Field Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseForceFieldType(ForceFieldType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Front Face Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Front Face Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFrontFaceType(FrontFaceType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Front Face Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Front Face Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFrontFaceType1(FrontFaceType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Front Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Front Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFrontType(FrontType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Func Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFuncType(FuncType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Func Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFuncType1(FuncType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Func Type2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFuncType2(FuncType2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Func Type3</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Type3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFuncType3(FuncType3 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Annotate Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Annotate Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxAnnotateCommon(FxAnnotateCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Clearcolor Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Clearcolor Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxClearcolorCommon(FxClearcolorCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Cleardepth Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Cleardepth Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxCleardepthCommon(FxCleardepthCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Clearstencil Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Clearstencil Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxClearstencilCommon(FxClearstencilCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Code Profile</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Code Profile</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxCodeProfile(FxCodeProfile object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Colortarget Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Colortarget Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxColortargetCommon(FxColortargetCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Depthtarget Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Depthtarget Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxDepthtargetCommon(FxDepthtargetCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Include Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Include Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxIncludeCommon(FxIncludeCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Newparam Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Newparam Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxNewparamCommon(FxNewparamCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Sampler1 DCommon</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Sampler1 DCommon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxSampler1DCommon(FxSampler1DCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Sampler2 DCommon</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Sampler2 DCommon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxSampler2DCommon(FxSampler2DCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Sampler3 DCommon</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Sampler3 DCommon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxSampler3DCommon(FxSampler3DCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Sampler CUBE Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Sampler CUBE Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxSamplerCUBECommon(FxSamplerCUBECommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Sampler DEPTH Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Sampler DEPTH Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxSamplerDEPTHCommon(FxSamplerDEPTHCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Sampler RECT Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Sampler RECT Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxSamplerRECTCommon(FxSamplerRECTCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Stenciltarget Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Stenciltarget Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxStenciltargetCommon(FxStenciltargetCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Surface Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Surface Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxSurfaceCommon(FxSurfaceCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Surface Format Hint Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Surface Format Hint Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxSurfaceFormatHintCommon(FxSurfaceFormatHintCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Surface Init Cube Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Surface Init Cube Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxSurfaceInitCubeCommon(FxSurfaceInitCubeCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Surface Init From Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Surface Init From Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxSurfaceInitFromCommon(FxSurfaceInitFromCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Surface Init Planar Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Surface Init Planar Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxSurfaceInitPlanarCommon(FxSurfaceInitPlanarCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fx Surface Init Volume Common</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fx Surface Init Volume Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFxSurfaceInitVolumeCommon(FxSurfaceInitVolumeCommon object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Generator Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generator Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGeneratorType(GeneratorType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Generator Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generator Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGeneratorType1(GeneratorType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Geometry Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geometry Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGeometryType(GeometryType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gles Newparam</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gles Newparam</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlesNewparam(GlesNewparam object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gles Sampler State</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gles Sampler State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlesSamplerState(GlesSamplerState object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gles Texcombiner Argument Alpha Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gles Texcombiner Argument Alpha Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlesTexcombinerArgumentAlphaType(GlesTexcombinerArgumentAlphaType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gles Texcombiner Argument RGB Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gles Texcombiner Argument RGB Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlesTexcombinerArgumentRGBType(GlesTexcombinerArgumentRGBType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gles Texcombiner Command Alpha Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gles Texcombiner Command Alpha Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlesTexcombinerCommandAlphaType(GlesTexcombinerCommandAlphaType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gles Texcombiner Command RGB Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gles Texcombiner Command RGB Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlesTexcombinerCommandRGBType(GlesTexcombinerCommandRGBType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gles Texcombiner Command Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gles Texcombiner Command Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlesTexcombinerCommandType(GlesTexcombinerCommandType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gles Texenv Command Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gles Texenv Command Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlesTexenvCommandType(GlesTexenvCommandType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gles Texture Constant Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gles Texture Constant Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlesTextureConstantType(GlesTextureConstantType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gles Texture Pipeline</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gles Texture Pipeline</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlesTexturePipeline(GlesTexturePipeline object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gles Texture Unit</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gles Texture Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlesTextureUnit(GlesTextureUnit object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gl Sampler1 D</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gl Sampler1 D</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlSampler1D(GlSampler1D object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gl Sampler2 D</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gl Sampler2 D</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlSampler2D(GlSampler2D object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gl Sampler3 D</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gl Sampler3 D</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlSampler3D(GlSampler3D object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gl Sampler CUBE</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gl Sampler CUBE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlSamplerCUBE(GlSamplerCUBE object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gl Sampler DEPTH</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gl Sampler DEPTH</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlSamplerDEPTH(GlSamplerDEPTH object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Gl Sampler RECT</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gl Sampler RECT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlSamplerRECT(GlSamplerRECT object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Glsl Newarray Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Glsl Newarray Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlslNewarrayType(GlslNewarrayType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Glsl Newparam</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Glsl Newparam</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlslNewparam(GlslNewparam object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Glsl Setarray Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Glsl Setarray Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlslSetarrayType(GlslSetarrayType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Glsl Setparam</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Glsl Setparam</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlslSetparam(GlslSetparam object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Glsl Setparam Simple</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Glsl Setparam Simple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlslSetparamSimple(GlslSetparamSimple object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Glsl Surface Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Glsl Surface Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGlslSurfaceType(GlslSurfaceType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Hollow Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hollow Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseHollowType(HollowType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Hollow Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hollow Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseHollowType1(HollowType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>IDREF Array Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IDREF Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseIDREFArrayType(IDREFArrayType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Imager Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imager Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseImagerType(ImagerType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Image Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseImageType(ImageType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Input Global</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Global</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInputGlobal(InputGlobal object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Input Local</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Local</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInputLocal(InputLocal object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Input Local Offset</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Local Offset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInputLocalOffset(InputLocalOffset object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Instance Controller Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Controller Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInstanceControllerType(InstanceControllerType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Instance Effect Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Effect Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInstanceEffectType(InstanceEffectType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Instance Geometry Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Geometry Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInstanceGeometryType(InstanceGeometryType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Instance Material Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Material Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInstanceMaterialType(InstanceMaterialType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Instance Physics Model Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Physics Model Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInstancePhysicsModelType(InstancePhysicsModelType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Instance Rigid Body Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Rigid Body Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInstanceRigidBodyType(InstanceRigidBodyType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Instance Rigid Constraint Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Rigid Constraint Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInstanceRigidConstraintType(InstanceRigidConstraintType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Instance With Extra</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance With Extra</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInstanceWithExtra(InstanceWithExtra object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Int Array Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseIntArrayType(IntArrayType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Interpenetrate Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interpenetrate Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInterpenetrateType(InterpenetrateType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Joints Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joints Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseJointsType(JointsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Lambert Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lambert Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLambertType(LambertType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Library Animation Clips Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Animation Clips Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLibraryAnimationClipsType(LibraryAnimationClipsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Library Animations Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Animations Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLibraryAnimationsType(LibraryAnimationsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Library Cameras Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Cameras Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLibraryCamerasType(LibraryCamerasType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Library Controllers Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Controllers Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLibraryControllersType(LibraryControllersType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Library Effects Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Effects Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLibraryEffectsType(LibraryEffectsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Library Force Fields Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Force Fields Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLibraryForceFieldsType(LibraryForceFieldsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Library Geometries Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Geometries Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLibraryGeometriesType(LibraryGeometriesType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Library Images Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Images Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLibraryImagesType(LibraryImagesType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Library Lights Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Lights Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLibraryLightsType(LibraryLightsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Library Materials Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Materials Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLibraryMaterialsType(LibraryMaterialsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Library Nodes Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Nodes Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLibraryNodesType(LibraryNodesType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Library Physics Materials Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Physics Materials Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLibraryPhysicsMaterialsType(LibraryPhysicsMaterialsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Library Physics Models Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Physics Models Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLibraryPhysicsModelsType(LibraryPhysicsModelsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Library Physics Scenes Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Physics Scenes Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLibraryPhysicsScenesType(LibraryPhysicsScenesType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Library Visual Scenes Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Visual Scenes Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLibraryVisualScenesType(LibraryVisualScenesType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Ambient Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Ambient Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightAmbientType(LightAmbientType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Ambient Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Ambient Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightAmbientType1(LightAmbientType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Constant Attenuation Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Constant Attenuation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightConstantAttenuationType(LightConstantAttenuationType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Constant Attenuation Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Constant Attenuation Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightConstantAttenuationType1(LightConstantAttenuationType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Diffuse Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Diffuse Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightDiffuseType(LightDiffuseType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Diffuse Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Diffuse Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightDiffuseType1(LightDiffuseType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightEnableType(LightEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightEnableType1(LightEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Lighting Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lighting Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightingEnableType(LightingEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Lighting Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lighting Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightingEnableType1(LightingEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Linear Attenuation Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Linear Attenuation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightLinearAttenuationType(LightLinearAttenuationType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Linear Attenutation Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Linear Attenutation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightLinearAttenutationType(LightLinearAttenutationType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Model Ambient Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Model Ambient Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightModelAmbientType(LightModelAmbientType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Model Ambient Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Model Ambient Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightModelAmbientType1(LightModelAmbientType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Model Color Control Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Model Color Control Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightModelColorControlType(LightModelColorControlType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Model Local Viewer Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Model Local Viewer Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightModelLocalViewerEnableType(LightModelLocalViewerEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Model Two Side Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Model Two Side Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightModelTwoSideEnableType(LightModelTwoSideEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Model Two Side Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Model Two Side Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightModelTwoSideEnableType1(LightModelTwoSideEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Position Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Position Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightPositionType(LightPositionType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Position Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Position Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightPositionType1(LightPositionType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Quadratic Attenuation Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Quadratic Attenuation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightQuadraticAttenuationType(LightQuadraticAttenuationType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Quadratic Attenuation Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Quadratic Attenuation Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightQuadraticAttenuationType1(LightQuadraticAttenuationType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Specular Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Specular Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightSpecularType(LightSpecularType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Specular Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Specular Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightSpecularType1(LightSpecularType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Spot Cutoff Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Spot Cutoff Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightSpotCutoffType(LightSpotCutoffType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Spot Cutoff Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Spot Cutoff Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightSpotCutoffType1(LightSpotCutoffType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Spot Direction Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Spot Direction Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightSpotDirectionType(LightSpotDirectionType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Spot Direction Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Spot Direction Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightSpotDirectionType1(LightSpotDirectionType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Spot Exponent Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Spot Exponent Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightSpotExponentType(LightSpotExponentType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Spot Exponent Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Spot Exponent Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightSpotExponentType1(LightSpotExponentType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Light Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLightType(LightType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Limits Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Limits Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLimitsType(LimitsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Linear Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linear Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLinearType(LinearType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Linear Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linear Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLinearType1(LinearType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Line Smooth Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Smooth Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLineSmoothEnableType(LineSmoothEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Line Smooth Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Smooth Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLineSmoothEnableType1(LineSmoothEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Line Stipple Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Stipple Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLineStippleEnableType(LineStippleEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Line Stipple Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Stipple Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLineStippleType(LineStippleType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Linestrips Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linestrips Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLinestripsType(LinestripsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Lines Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lines Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLinesType(LinesType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Line Width Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Width Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLineWidthType(LineWidthType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Line Width Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Width Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLineWidthType1(LineWidthType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Logic Op Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logic Op Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLogicOpEnableType(LogicOpEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Logic Op Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logic Op Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLogicOpType(LogicOpType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Logic Op Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logic Op Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLogicOpType1(LogicOpType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Lookat Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lookat Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLookatType(LookatType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Mask Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mask Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaskType(MaskType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Mask Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mask Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaskType1(MaskType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Mask Type2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mask Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaskType2(MaskType2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Mask Type3</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mask Type3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaskType3(MaskType3 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Mass Frame Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mass Frame Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMassFrameType(MassFrameType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Mass Frame Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mass Frame Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMassFrameType1(MassFrameType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Material Ambient Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Material Ambient Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaterialAmbientType(MaterialAmbientType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Material Ambient Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Material Ambient Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaterialAmbientType1(MaterialAmbientType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Material Diffuse Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Material Diffuse Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaterialDiffuseType(MaterialDiffuseType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Material Diffuse Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Material Diffuse Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaterialDiffuseType1(MaterialDiffuseType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Material Emission Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Material Emission Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaterialEmissionType(MaterialEmissionType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Material Emission Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Material Emission Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaterialEmissionType1(MaterialEmissionType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Material Shininess Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Material Shininess Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaterialShininessType(MaterialShininessType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Material Shininess Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Material Shininess Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaterialShininessType1(MaterialShininessType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Material Specular Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Material Specular Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaterialSpecularType(MaterialSpecularType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Material Specular Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Material Specular Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaterialSpecularType1(MaterialSpecularType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Material Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Material Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaterialType(MaterialType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Matrix Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matrix Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMatrixType(MatrixType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Mesh Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mesh Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMeshType(MeshType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Model View Matrix Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model View Matrix Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseModelViewMatrixType(ModelViewMatrixType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Model View Matrix Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model View Matrix Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseModelViewMatrixType1(ModelViewMatrixType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Mode Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mode Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseModeType(ModeType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Mode Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mode Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseModeType1(ModeType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Morph Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Morph Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMorphType(MorphType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Multisample Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multisample Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMultisampleEnableType(MultisampleEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Multisample Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multisample Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMultisampleEnableType1(MultisampleEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Name Array Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNameArrayType(NameArrayType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Name Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNameType(NameType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Name Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNameType1(NameType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Name Type2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNameType2(NameType2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Name Type3</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Type3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNameType3(NameType3 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Node Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNodeType1(NodeType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Normalize Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Normalize Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNormalizeEnableType(NormalizeEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Normalize Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Normalize Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNormalizeEnableType1(NormalizeEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Optics Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Optics Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseOpticsType(OpticsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Orthographic Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Orthographic Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseOrthographicType(OrthographicType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Param Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseParamType(ParamType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Param Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseParamType1(ParamType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Param Type2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseParamType2(ParamType2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Param Type3</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Type3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseParamType3(ParamType3 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Param Type4</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Type4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseParamType4(ParamType4 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Pass Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pass Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePassType(PassType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Pass Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pass Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePassType1(PassType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Pass Type2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pass Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePassType2(PassType2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Perspective Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Perspective Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePerspectiveType(PerspectiveType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Phong Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phong Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePhongType(PhongType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Ph Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ph Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePhType(PhType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Physics Material Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Physics Material Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePhysicsMaterialType(PhysicsMaterialType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Physics Model Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Physics Model Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePhysicsModelType(PhysicsModelType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Physics Scene Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Physics Scene Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePhysicsSceneType(PhysicsSceneType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Plane Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plane Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePlaneType(PlaneType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Point Distance Attenuation Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Distance Attenuation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePointDistanceAttenuationType(PointDistanceAttenuationType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Point Distance Attenuation Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Distance Attenuation Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePointDistanceAttenuationType1(PointDistanceAttenuationType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Point Fade Threshold Size Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Fade Threshold Size Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePointFadeThresholdSizeType(PointFadeThresholdSizeType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Point Fade Threshold Size Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Fade Threshold Size Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePointFadeThresholdSizeType1(PointFadeThresholdSizeType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Point Size Max Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Size Max Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePointSizeMaxType(PointSizeMaxType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Point Size Max Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Size Max Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePointSizeMaxType1(PointSizeMaxType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Point Size Min Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Size Min Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePointSizeMinType(PointSizeMinType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Point Size Min Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Size Min Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePointSizeMinType1(PointSizeMinType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Point Size Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Size Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePointSizeType(PointSizeType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Point Size Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Size Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePointSizeType1(PointSizeType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Point Smooth Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Smooth Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePointSmoothEnableType(PointSmoothEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Point Smooth Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Smooth Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePointSmoothEnableType1(PointSmoothEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Point Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePointType(PointType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Polygon Mode Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polygon Mode Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePolygonModeType(PolygonModeType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Polygon Offset Fill Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polygon Offset Fill Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePolygonOffsetFillEnableType(PolygonOffsetFillEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Polygon Offset Fill Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polygon Offset Fill Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePolygonOffsetFillEnableType1(PolygonOffsetFillEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Polygon Offset Line Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polygon Offset Line Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePolygonOffsetLineEnableType(PolygonOffsetLineEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Polygon Offset Point Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polygon Offset Point Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePolygonOffsetPointEnableType(PolygonOffsetPointEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Polygon Offset Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polygon Offset Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePolygonOffsetType(PolygonOffsetType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Polygon Offset Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polygon Offset Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePolygonOffsetType1(PolygonOffsetType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Polygon Smooth Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polygon Smooth Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePolygonSmoothEnableType(PolygonSmoothEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Polygon Stipple Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polygon Stipple Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePolygonStippleEnableType(PolygonStippleEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Polygons Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polygons Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePolygonsType(PolygonsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Polylist Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polylist Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePolylistType(PolylistType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Primary Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePrimaryType(PrimaryType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Primary Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePrimaryType1(PrimaryType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Profile CG Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Profile CG Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseProfileCGType(ProfileCGType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Profile COMMON Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Profile COMMON Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseProfileCOMMONType(ProfileCOMMONType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Profile GLES Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Profile GLES Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseProfileGLESType(ProfileGLESType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Profile GLSL Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Profile GLSL Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseProfileGLSLType(ProfileGLSLType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Projection Matrix Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Projection Matrix Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseProjectionMatrixType(ProjectionMatrixType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Projection Matrix Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Projection Matrix Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseProjectionMatrixType1(ProjectionMatrixType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Ref Attachment Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Attachment Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRefAttachmentType(RefAttachmentType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Ref Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRefType(RefType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Ref Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRefType1(RefType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Ref Type2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRefType2(RefType2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Render Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Render Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRenderType(RenderType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Rescale Normal Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rescale Normal Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRescaleNormalEnableType(RescaleNormalEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Rescale Normal Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rescale Normal Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRescaleNormalEnableType1(RescaleNormalEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Rgb Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rgb Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRgbType(RgbType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Rigid Body Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rigid Body Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRigidBodyType(RigidBodyType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Rigid Constraint Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rigid Constraint Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRigidConstraintType(RigidConstraintType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Rotate Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rotate Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRotateType(RotateType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Sample Alpha To Coverage Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sample Alpha To Coverage Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSampleAlphaToCoverageEnableType(SampleAlphaToCoverageEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Sample Alpha To Coverage Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sample Alpha To Coverage Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSampleAlphaToCoverageEnableType1(SampleAlphaToCoverageEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Sample Alpha To One Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sample Alpha To One Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSampleAlphaToOneEnableType(SampleAlphaToOneEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Sample Alpha To One Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sample Alpha To One Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSampleAlphaToOneEnableType1(SampleAlphaToOneEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Sample Coverage Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sample Coverage Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSampleCoverageEnableType(SampleCoverageEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Sample Coverage Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sample Coverage Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSampleCoverageEnableType1(SampleCoverageEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Sampler Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sampler Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSamplerType(SamplerType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Scene Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scene Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSceneType(SceneType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Scissor Test Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scissor Test Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseScissorTestEnableType(ScissorTestEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Scissor Test Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scissor Test Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseScissorTestEnableType1(ScissorTestEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Scissor Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scissor Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseScissorType(ScissorType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Scissor Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scissor Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseScissorType1(ScissorType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Setparam Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Setparam Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSetparamType(SetparamType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Setparam Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Setparam Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSetparamType1(SetparamType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Shade Model Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shade Model Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseShadeModelType(ShadeModelType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Shade Model Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shade Model Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseShadeModelType1(ShadeModelType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Shader Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shader Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseShaderType(ShaderType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Shader Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shader Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseShaderType1(ShaderType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Shape Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseShapeType(ShapeType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Shape Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseShapeType1(ShapeType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Skew Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Skew Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSkewType(SkewType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Skin Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Skin Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSkinType(SkinType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Source Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Source Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSourceType(SourceType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Sphere Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sphere Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSphereType(SphereType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Spline Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spline Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSplineType(SplineType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Spot Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spot Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSpotType(SpotType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Spring Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spring Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSpringType1(SpringType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Src Alpha Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Src Alpha Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSrcAlphaType(SrcAlphaType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Src Rgb Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Src Rgb Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSrcRgbType(SrcRgbType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Src Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Src Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSrcType(SrcType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Src Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Src Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSrcType1(SrcType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Stencil Func Separate Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stencil Func Separate Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseStencilFuncSeparateType(StencilFuncSeparateType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Stencil Func Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stencil Func Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseStencilFuncType(StencilFuncType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Stencil Func Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stencil Func Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseStencilFuncType1(StencilFuncType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Stencil Mask Separate Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stencil Mask Separate Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseStencilMaskSeparateType(StencilMaskSeparateType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Stencil Mask Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stencil Mask Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseStencilMaskType(StencilMaskType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Stencil Mask Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stencil Mask Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseStencilMaskType1(StencilMaskType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Stencil Op Separate Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stencil Op Separate Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseStencilOpSeparateType(StencilOpSeparateType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Stencil Op Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stencil Op Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseStencilOpType(StencilOpType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Stencil Op Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stencil Op Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseStencilOpType1(StencilOpType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Stencil Test Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stencil Test Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseStencilTestEnableType(StencilTestEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Stencil Test Enable Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stencil Test Enable Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseStencilTestEnableType1(StencilTestEnableType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Swing Cone And Twist Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Swing Cone And Twist Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSwingConeAndTwistType(SwingConeAndTwistType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Tapered Capsule Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tapered Capsule Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTaperedCapsuleType(TaperedCapsuleType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Tapered Cylinder Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tapered Cylinder Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTaperedCylinderType(TaperedCylinderType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Targetable Float</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Targetable Float</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTargetableFloat(TargetableFloat object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Targetable Float3</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Targetable Float3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTargetableFloat3(TargetableFloat3 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Targets Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Targets Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTargetsType(TargetsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Technique Common Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technique Common Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTechniqueCommonType(TechniqueCommonType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Technique Common Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technique Common Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTechniqueCommonType1(TechniqueCommonType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Technique Common Type2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technique Common Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTechniqueCommonType2(TechniqueCommonType2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Technique Common Type3</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technique Common Type3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTechniqueCommonType3(TechniqueCommonType3 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Technique Common Type4</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technique Common Type4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTechniqueCommonType4(TechniqueCommonType4 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Technique Common Type5</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technique Common Type5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTechniqueCommonType5(TechniqueCommonType5 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Technique Common Type6</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technique Common Type6</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTechniqueCommonType6(TechniqueCommonType6 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Technique Common Type7</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technique Common Type7</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTechniqueCommonType7(TechniqueCommonType7 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Technique Common Type8</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technique Common Type8</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTechniqueCommonType8(TechniqueCommonType8 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Technique Hint Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technique Hint Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTechniqueHintType(TechniqueHintType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Technique Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technique Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTechniqueType(TechniqueType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Technique Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technique Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTechniqueType1(TechniqueType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Technique Type2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technique Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTechniqueType2(TechniqueType2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Technique Type3</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technique Type3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTechniqueType3(TechniqueType3 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Technique Type4</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technique Type4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTechniqueType4(TechniqueType4 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texcoord Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texcoord Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTexcoordType(TexcoordType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture1 DEnable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture1 DEnable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTexture1DEnableType(Texture1DEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture1 DType</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture1 DType</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTexture1DType(Texture1DType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture2 DEnable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture2 DEnable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTexture2DEnableType(Texture2DEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture2 DType</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture2 DType</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTexture2DType(Texture2DType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture3 DEnable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture3 DEnable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTexture3DEnableType(Texture3DEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture3 DType</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture3 DType</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTexture3DType(Texture3DType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture CUBE Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture CUBE Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTextureCUBEEnableType(TextureCUBEEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture CUBE Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture CUBE Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTextureCUBEType(TextureCUBEType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture DEPTH Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture DEPTH Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTextureDEPTHEnableType(TextureDEPTHEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture DEPTH Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture DEPTH Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTextureDEPTHType(TextureDEPTHType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture Env Color Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture Env Color Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTextureEnvColorType(TextureEnvColorType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture Env Mode Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture Env Mode Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTextureEnvModeType(TextureEnvModeType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture Pipeline Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture Pipeline Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTexturePipelineEnableType(TexturePipelineEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture Pipeline Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture Pipeline Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTexturePipelineType(TexturePipelineType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture RECT Enable Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture RECT Enable Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTextureRECTEnableType(TextureRECTEnableType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture RECT Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture RECT Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTextureRECTType(TextureRECTType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Texture Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTextureType(TextureType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Triangles Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Triangles Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTrianglesType(TrianglesType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Trifans Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trifans Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTrifansType(TrifansType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Tristrips Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tristrips Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTristripsType(TristripsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Unit Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseUnitType(UnitType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseValueType(ValueType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Value Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseValueType1(ValueType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Vertex Weights Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vertex Weights Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseVertexWeightsType(VertexWeightsType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Vertices Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vertices Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseVerticesType(VerticesType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Visual Scene Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visual Scene Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseVisualSceneType(VisualSceneType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Zfail Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Zfail Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseZfailType(ZfailType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Zfail Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Zfail Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseZfailType1(ZfailType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Zfail Type2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Zfail Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseZfailType2(ZfailType2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Zpass Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Zpass Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseZpassType(ZpassType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Zpass Type1</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Zpass Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseZpassType1(ZpassType1 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Zpass Type2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Zpass Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseZpassType2(ZpassType2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
	@Override
	public T defaultCase(EObject object) {
    return null;
  }

} //ColladaSwitch
