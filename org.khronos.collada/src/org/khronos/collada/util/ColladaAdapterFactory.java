/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.khronos.collada.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage
 * @generated
 */
public class ColladaAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static ColladaPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColladaAdapterFactory() {
    if (modelPackage == null)
    {
      modelPackage = ColladaPackage.eINSTANCE;
    }
  }

	/**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
	@Override
	public boolean isFactoryForType(Object object) {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

	/**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ColladaSwitch<Adapter> modelSwitch =
		new ColladaSwitch<Adapter>()
    {
      @Override
      public Adapter caseAccessorType(AccessorType object)
      {
        return createAccessorTypeAdapter();
      }
      @Override
      public Adapter caseAllType(AllType object)
      {
        return createAllTypeAdapter();
      }
      @Override
      public Adapter caseAllType1(AllType1 object)
      {
        return createAllType1Adapter();
      }
      @Override
      public Adapter caseAllType2(AllType2 object)
      {
        return createAllType2Adapter();
      }
      @Override
      public Adapter caseAlphaFuncType(AlphaFuncType object)
      {
        return createAlphaFuncTypeAdapter();
      }
      @Override
      public Adapter caseAlphaFuncType1(AlphaFuncType1 object)
      {
        return createAlphaFuncType1Adapter();
      }
      @Override
      public Adapter caseAlphaTestEnableType(AlphaTestEnableType object)
      {
        return createAlphaTestEnableTypeAdapter();
      }
      @Override
      public Adapter caseAlphaTestEnableType1(AlphaTestEnableType1 object)
      {
        return createAlphaTestEnableType1Adapter();
      }
      @Override
      public Adapter caseAlphaType(AlphaType object)
      {
        return createAlphaTypeAdapter();
      }
      @Override
      public Adapter caseAmbientType(AmbientType object)
      {
        return createAmbientTypeAdapter();
      }
      @Override
      public Adapter caseAngularType(AngularType object)
      {
        return createAngularTypeAdapter();
      }
      @Override
      public Adapter caseAnimationClipType(AnimationClipType object)
      {
        return createAnimationClipTypeAdapter();
      }
      @Override
      public Adapter caseAnimationType(AnimationType object)
      {
        return createAnimationTypeAdapter();
      }
      @Override
      public Adapter caseAssetType(AssetType object)
      {
        return createAssetTypeAdapter();
      }
      @Override
      public Adapter caseAttachmentType(AttachmentType object)
      {
        return createAttachmentTypeAdapter();
      }
      @Override
      public Adapter caseAutoNormalEnableType(AutoNormalEnableType object)
      {
        return createAutoNormalEnableTypeAdapter();
      }
      @Override
      public Adapter caseBackType(BackType object)
      {
        return createBackTypeAdapter();
      }
      @Override
      public Adapter caseBindMaterialType(BindMaterialType object)
      {
        return createBindMaterialTypeAdapter();
      }
      @Override
      public Adapter caseBindType(BindType object)
      {
        return createBindTypeAdapter();
      }
      @Override
      public Adapter caseBindType1(BindType1 object)
      {
        return createBindType1Adapter();
      }
      @Override
      public Adapter caseBindType2(BindType2 object)
      {
        return createBindType2Adapter();
      }
      @Override
      public Adapter caseBindVertexInputType(BindVertexInputType object)
      {
        return createBindVertexInputTypeAdapter();
      }
      @Override
      public Adapter caseBlendColorType(BlendColorType object)
      {
        return createBlendColorTypeAdapter();
      }
      @Override
      public Adapter caseBlendEnableType(BlendEnableType object)
      {
        return createBlendEnableTypeAdapter();
      }
      @Override
      public Adapter caseBlendEnableType1(BlendEnableType1 object)
      {
        return createBlendEnableType1Adapter();
      }
      @Override
      public Adapter caseBlendEquationSeparateType(BlendEquationSeparateType object)
      {
        return createBlendEquationSeparateTypeAdapter();
      }
      @Override
      public Adapter caseBlendEquationType(BlendEquationType object)
      {
        return createBlendEquationTypeAdapter();
      }
      @Override
      public Adapter caseBlendFuncSeparateType(BlendFuncSeparateType object)
      {
        return createBlendFuncSeparateTypeAdapter();
      }
      @Override
      public Adapter caseBlendFuncType(BlendFuncType object)
      {
        return createBlendFuncTypeAdapter();
      }
      @Override
      public Adapter caseBlendFuncType1(BlendFuncType1 object)
      {
        return createBlendFuncType1Adapter();
      }
      @Override
      public Adapter caseBlinnType(BlinnType object)
      {
        return createBlinnTypeAdapter();
      }
      @Override
      public Adapter caseBoolArrayType(BoolArrayType object)
      {
        return createBoolArrayTypeAdapter();
      }
      @Override
      public Adapter caseBoxType(BoxType object)
      {
        return createBoxTypeAdapter();
      }
      @Override
      public Adapter caseCameraType(CameraType object)
      {
        return createCameraTypeAdapter();
      }
      @Override
      public Adapter caseCapsuleType(CapsuleType object)
      {
        return createCapsuleTypeAdapter();
      }
      @Override
      public Adapter caseCgConnectParam(CgConnectParam object)
      {
        return createCgConnectParamAdapter();
      }
      @Override
      public Adapter caseCgNewarrayType(CgNewarrayType object)
      {
        return createCgNewarrayTypeAdapter();
      }
      @Override
      public Adapter caseCgNewparam(CgNewparam object)
      {
        return createCgNewparamAdapter();
      }
      @Override
      public Adapter caseCgSampler1D(CgSampler1D object)
      {
        return createCgSampler1DAdapter();
      }
      @Override
      public Adapter caseCgSampler2D(CgSampler2D object)
      {
        return createCgSampler2DAdapter();
      }
      @Override
      public Adapter caseCgSampler3D(CgSampler3D object)
      {
        return createCgSampler3DAdapter();
      }
      @Override
      public Adapter caseCgSamplerCUBE(CgSamplerCUBE object)
      {
        return createCgSamplerCUBEAdapter();
      }
      @Override
      public Adapter caseCgSamplerDEPTH(CgSamplerDEPTH object)
      {
        return createCgSamplerDEPTHAdapter();
      }
      @Override
      public Adapter caseCgSamplerRECT(CgSamplerRECT object)
      {
        return createCgSamplerRECTAdapter();
      }
      @Override
      public Adapter caseCgSetarrayType(CgSetarrayType object)
      {
        return createCgSetarrayTypeAdapter();
      }
      @Override
      public Adapter caseCgSetparam(CgSetparam object)
      {
        return createCgSetparamAdapter();
      }
      @Override
      public Adapter caseCgSetparamSimple(CgSetparamSimple object)
      {
        return createCgSetparamSimpleAdapter();
      }
      @Override
      public Adapter caseCgSetuserType(CgSetuserType object)
      {
        return createCgSetuserTypeAdapter();
      }
      @Override
      public Adapter caseCgSurfaceType(CgSurfaceType object)
      {
        return createCgSurfaceTypeAdapter();
      }
      @Override
      public Adapter caseChannelType(ChannelType object)
      {
        return createChannelTypeAdapter();
      }
      @Override
      public Adapter caseClearColorType(ClearColorType object)
      {
        return createClearColorTypeAdapter();
      }
      @Override
      public Adapter caseClearColorType1(ClearColorType1 object)
      {
        return createClearColorType1Adapter();
      }
      @Override
      public Adapter caseClearDepthType(ClearDepthType object)
      {
        return createClearDepthTypeAdapter();
      }
      @Override
      public Adapter caseClearDepthType1(ClearDepthType1 object)
      {
        return createClearDepthType1Adapter();
      }
      @Override
      public Adapter caseClearStencilType(ClearStencilType object)
      {
        return createClearStencilTypeAdapter();
      }
      @Override
      public Adapter caseClearStencilType1(ClearStencilType1 object)
      {
        return createClearStencilType1Adapter();
      }
      @Override
      public Adapter caseClipPlaneEnableType(ClipPlaneEnableType object)
      {
        return createClipPlaneEnableTypeAdapter();
      }
      @Override
      public Adapter caseClipPlaneEnableType1(ClipPlaneEnableType1 object)
      {
        return createClipPlaneEnableType1Adapter();
      }
      @Override
      public Adapter caseClipPlaneType(ClipPlaneType object)
      {
        return createClipPlaneTypeAdapter();
      }
      @Override
      public Adapter caseClipPlaneType1(ClipPlaneType1 object)
      {
        return createClipPlaneType1Adapter();
      }
      @Override
      public Adapter caseCOLLADAType(COLLADAType object)
      {
        return createCOLLADATypeAdapter();
      }
      @Override
      public Adapter caseColorLogicOpEnableType(ColorLogicOpEnableType object)
      {
        return createColorLogicOpEnableTypeAdapter();
      }
      @Override
      public Adapter caseColorLogicOpEnableType1(ColorLogicOpEnableType1 object)
      {
        return createColorLogicOpEnableType1Adapter();
      }
      @Override
      public Adapter caseColorMaskType(ColorMaskType object)
      {
        return createColorMaskTypeAdapter();
      }
      @Override
      public Adapter caseColorMaskType1(ColorMaskType1 object)
      {
        return createColorMaskType1Adapter();
      }
      @Override
      public Adapter caseColorMaterialEnableType(ColorMaterialEnableType object)
      {
        return createColorMaterialEnableTypeAdapter();
      }
      @Override
      public Adapter caseColorMaterialEnableType1(ColorMaterialEnableType1 object)
      {
        return createColorMaterialEnableType1Adapter();
      }
      @Override
      public Adapter caseColorMaterialType(ColorMaterialType object)
      {
        return createColorMaterialTypeAdapter();
      }
      @Override
      public Adapter caseColorType(ColorType object)
      {
        return createColorTypeAdapter();
      }
      @Override
      public Adapter caseCommonColorOrTextureType(CommonColorOrTextureType object)
      {
        return createCommonColorOrTextureTypeAdapter();
      }
      @Override
      public Adapter caseCommonFloatOrParamType(CommonFloatOrParamType object)
      {
        return createCommonFloatOrParamTypeAdapter();
      }
      @Override
      public Adapter caseCommonNewparamType(CommonNewparamType object)
      {
        return createCommonNewparamTypeAdapter();
      }
      @Override
      public Adapter caseCommonTransparentType(CommonTransparentType object)
      {
        return createCommonTransparentTypeAdapter();
      }
      @Override
      public Adapter caseCompilerTargetType(CompilerTargetType object)
      {
        return createCompilerTargetTypeAdapter();
      }
      @Override
      public Adapter caseCompilerTargetType1(CompilerTargetType1 object)
      {
        return createCompilerTargetType1Adapter();
      }
      @Override
      public Adapter caseConstantType(ConstantType object)
      {
        return createConstantTypeAdapter();
      }
      @Override
      public Adapter caseContributorType(ContributorType object)
      {
        return createContributorTypeAdapter();
      }
      @Override
      public Adapter caseControllerType(ControllerType object)
      {
        return createControllerTypeAdapter();
      }
      @Override
      public Adapter caseControlVerticesType(ControlVerticesType object)
      {
        return createControlVerticesTypeAdapter();
      }
      @Override
      public Adapter caseConvexMeshType(ConvexMeshType object)
      {
        return createConvexMeshTypeAdapter();
      }
      @Override
      public Adapter caseCullFaceEnableType(CullFaceEnableType object)
      {
        return createCullFaceEnableTypeAdapter();
      }
      @Override
      public Adapter caseCullFaceEnableType1(CullFaceEnableType1 object)
      {
        return createCullFaceEnableType1Adapter();
      }
      @Override
      public Adapter caseCullFaceType(CullFaceType object)
      {
        return createCullFaceTypeAdapter();
      }
      @Override
      public Adapter caseCullFaceType1(CullFaceType1 object)
      {
        return createCullFaceType1Adapter();
      }
      @Override
      public Adapter caseCylinderType(CylinderType object)
      {
        return createCylinderTypeAdapter();
      }
      @Override
      public Adapter caseDepthBoundsEnableType(DepthBoundsEnableType object)
      {
        return createDepthBoundsEnableTypeAdapter();
      }
      @Override
      public Adapter caseDepthBoundsType(DepthBoundsType object)
      {
        return createDepthBoundsTypeAdapter();
      }
      @Override
      public Adapter caseDepthClampEnableType(DepthClampEnableType object)
      {
        return createDepthClampEnableTypeAdapter();
      }
      @Override
      public Adapter caseDepthFuncType(DepthFuncType object)
      {
        return createDepthFuncTypeAdapter();
      }
      @Override
      public Adapter caseDepthFuncType1(DepthFuncType1 object)
      {
        return createDepthFuncType1Adapter();
      }
      @Override
      public Adapter caseDepthMaskType(DepthMaskType object)
      {
        return createDepthMaskTypeAdapter();
      }
      @Override
      public Adapter caseDepthMaskType1(DepthMaskType1 object)
      {
        return createDepthMaskType1Adapter();
      }
      @Override
      public Adapter caseDepthRangeType(DepthRangeType object)
      {
        return createDepthRangeTypeAdapter();
      }
      @Override
      public Adapter caseDepthRangeType1(DepthRangeType1 object)
      {
        return createDepthRangeType1Adapter();
      }
      @Override
      public Adapter caseDepthTestEnableType(DepthTestEnableType object)
      {
        return createDepthTestEnableTypeAdapter();
      }
      @Override
      public Adapter caseDepthTestEnableType1(DepthTestEnableType1 object)
      {
        return createDepthTestEnableType1Adapter();
      }
      @Override
      public Adapter caseDestAlphaType(DestAlphaType object)
      {
        return createDestAlphaTypeAdapter();
      }
      @Override
      public Adapter caseDestRgbType(DestRgbType object)
      {
        return createDestRgbTypeAdapter();
      }
      @Override
      public Adapter caseDestType(DestType object)
      {
        return createDestTypeAdapter();
      }
      @Override
      public Adapter caseDestType1(DestType1 object)
      {
        return createDestType1Adapter();
      }
      @Override
      public Adapter caseDirectionalType(DirectionalType object)
      {
        return createDirectionalTypeAdapter();
      }
      @Override
      public Adapter caseDitherEnableType(DitherEnableType object)
      {
        return createDitherEnableTypeAdapter();
      }
      @Override
      public Adapter caseDitherEnableType1(DitherEnableType1 object)
      {
        return createDitherEnableType1Adapter();
      }
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object)
      {
        return createDocumentRootAdapter();
      }
      @Override
      public Adapter caseDynamicType(DynamicType object)
      {
        return createDynamicTypeAdapter();
      }
      @Override
      public Adapter caseDynamicType1(DynamicType1 object)
      {
        return createDynamicType1Adapter();
      }
      @Override
      public Adapter caseEffectType(EffectType object)
      {
        return createEffectTypeAdapter();
      }
      @Override
      public Adapter caseEllipsoidType(EllipsoidType object)
      {
        return createEllipsoidTypeAdapter();
      }
      @Override
      public Adapter caseEnabledType(EnabledType object)
      {
        return createEnabledTypeAdapter();
      }
      @Override
      public Adapter caseEvaluateSceneType(EvaluateSceneType object)
      {
        return createEvaluateSceneTypeAdapter();
      }
      @Override
      public Adapter caseExtraType(ExtraType object)
      {
        return createExtraTypeAdapter();
      }
      @Override
      public Adapter caseFaceType(FaceType object)
      {
        return createFaceTypeAdapter();
      }
      @Override
      public Adapter caseFaceType1(FaceType1 object)
      {
        return createFaceType1Adapter();
      }
      @Override
      public Adapter caseFaceType2(FaceType2 object)
      {
        return createFaceType2Adapter();
      }
      @Override
      public Adapter caseFaceType3(FaceType3 object)
      {
        return createFaceType3Adapter();
      }
      @Override
      public Adapter caseFaceType4(FaceType4 object)
      {
        return createFaceType4Adapter();
      }
      @Override
      public Adapter caseFailType(FailType object)
      {
        return createFailTypeAdapter();
      }
      @Override
      public Adapter caseFailType1(FailType1 object)
      {
        return createFailType1Adapter();
      }
      @Override
      public Adapter caseFailType2(FailType2 object)
      {
        return createFailType2Adapter();
      }
      @Override
      public Adapter caseFloatArrayType(FloatArrayType object)
      {
        return createFloatArrayTypeAdapter();
      }
      @Override
      public Adapter caseFloatType(FloatType object)
      {
        return createFloatTypeAdapter();
      }
      @Override
      public Adapter caseFogColorType(FogColorType object)
      {
        return createFogColorTypeAdapter();
      }
      @Override
      public Adapter caseFogColorType1(FogColorType1 object)
      {
        return createFogColorType1Adapter();
      }
      @Override
      public Adapter caseFogCoordSrcType(FogCoordSrcType object)
      {
        return createFogCoordSrcTypeAdapter();
      }
      @Override
      public Adapter caseFogDensityType(FogDensityType object)
      {
        return createFogDensityTypeAdapter();
      }
      @Override
      public Adapter caseFogDensityType1(FogDensityType1 object)
      {
        return createFogDensityType1Adapter();
      }
      @Override
      public Adapter caseFogEnableType(FogEnableType object)
      {
        return createFogEnableTypeAdapter();
      }
      @Override
      public Adapter caseFogEnableType1(FogEnableType1 object)
      {
        return createFogEnableType1Adapter();
      }
      @Override
      public Adapter caseFogEndType(FogEndType object)
      {
        return createFogEndTypeAdapter();
      }
      @Override
      public Adapter caseFogEndType1(FogEndType1 object)
      {
        return createFogEndType1Adapter();
      }
      @Override
      public Adapter caseFogModeType(FogModeType object)
      {
        return createFogModeTypeAdapter();
      }
      @Override
      public Adapter caseFogModeType1(FogModeType1 object)
      {
        return createFogModeType1Adapter();
      }
      @Override
      public Adapter caseFogStartType(FogStartType object)
      {
        return createFogStartTypeAdapter();
      }
      @Override
      public Adapter caseFogStartType1(FogStartType1 object)
      {
        return createFogStartType1Adapter();
      }
      @Override
      public Adapter caseForceFieldType(ForceFieldType object)
      {
        return createForceFieldTypeAdapter();
      }
      @Override
      public Adapter caseFrontFaceType(FrontFaceType object)
      {
        return createFrontFaceTypeAdapter();
      }
      @Override
      public Adapter caseFrontFaceType1(FrontFaceType1 object)
      {
        return createFrontFaceType1Adapter();
      }
      @Override
      public Adapter caseFrontType(FrontType object)
      {
        return createFrontTypeAdapter();
      }
      @Override
      public Adapter caseFuncType(FuncType object)
      {
        return createFuncTypeAdapter();
      }
      @Override
      public Adapter caseFuncType1(FuncType1 object)
      {
        return createFuncType1Adapter();
      }
      @Override
      public Adapter caseFuncType2(FuncType2 object)
      {
        return createFuncType2Adapter();
      }
      @Override
      public Adapter caseFuncType3(FuncType3 object)
      {
        return createFuncType3Adapter();
      }
      @Override
      public Adapter caseFxAnnotateCommon(FxAnnotateCommon object)
      {
        return createFxAnnotateCommonAdapter();
      }
      @Override
      public Adapter caseFxClearcolorCommon(FxClearcolorCommon object)
      {
        return createFxClearcolorCommonAdapter();
      }
      @Override
      public Adapter caseFxCleardepthCommon(FxCleardepthCommon object)
      {
        return createFxCleardepthCommonAdapter();
      }
      @Override
      public Adapter caseFxClearstencilCommon(FxClearstencilCommon object)
      {
        return createFxClearstencilCommonAdapter();
      }
      @Override
      public Adapter caseFxCodeProfile(FxCodeProfile object)
      {
        return createFxCodeProfileAdapter();
      }
      @Override
      public Adapter caseFxColortargetCommon(FxColortargetCommon object)
      {
        return createFxColortargetCommonAdapter();
      }
      @Override
      public Adapter caseFxDepthtargetCommon(FxDepthtargetCommon object)
      {
        return createFxDepthtargetCommonAdapter();
      }
      @Override
      public Adapter caseFxIncludeCommon(FxIncludeCommon object)
      {
        return createFxIncludeCommonAdapter();
      }
      @Override
      public Adapter caseFxNewparamCommon(FxNewparamCommon object)
      {
        return createFxNewparamCommonAdapter();
      }
      @Override
      public Adapter caseFxSampler1DCommon(FxSampler1DCommon object)
      {
        return createFxSampler1DCommonAdapter();
      }
      @Override
      public Adapter caseFxSampler2DCommon(FxSampler2DCommon object)
      {
        return createFxSampler2DCommonAdapter();
      }
      @Override
      public Adapter caseFxSampler3DCommon(FxSampler3DCommon object)
      {
        return createFxSampler3DCommonAdapter();
      }
      @Override
      public Adapter caseFxSamplerCUBECommon(FxSamplerCUBECommon object)
      {
        return createFxSamplerCUBECommonAdapter();
      }
      @Override
      public Adapter caseFxSamplerDEPTHCommon(FxSamplerDEPTHCommon object)
      {
        return createFxSamplerDEPTHCommonAdapter();
      }
      @Override
      public Adapter caseFxSamplerRECTCommon(FxSamplerRECTCommon object)
      {
        return createFxSamplerRECTCommonAdapter();
      }
      @Override
      public Adapter caseFxStenciltargetCommon(FxStenciltargetCommon object)
      {
        return createFxStenciltargetCommonAdapter();
      }
      @Override
      public Adapter caseFxSurfaceCommon(FxSurfaceCommon object)
      {
        return createFxSurfaceCommonAdapter();
      }
      @Override
      public Adapter caseFxSurfaceFormatHintCommon(FxSurfaceFormatHintCommon object)
      {
        return createFxSurfaceFormatHintCommonAdapter();
      }
      @Override
      public Adapter caseFxSurfaceInitCubeCommon(FxSurfaceInitCubeCommon object)
      {
        return createFxSurfaceInitCubeCommonAdapter();
      }
      @Override
      public Adapter caseFxSurfaceInitFromCommon(FxSurfaceInitFromCommon object)
      {
        return createFxSurfaceInitFromCommonAdapter();
      }
      @Override
      public Adapter caseFxSurfaceInitPlanarCommon(FxSurfaceInitPlanarCommon object)
      {
        return createFxSurfaceInitPlanarCommonAdapter();
      }
      @Override
      public Adapter caseFxSurfaceInitVolumeCommon(FxSurfaceInitVolumeCommon object)
      {
        return createFxSurfaceInitVolumeCommonAdapter();
      }
      @Override
      public Adapter caseGeneratorType(GeneratorType object)
      {
        return createGeneratorTypeAdapter();
      }
      @Override
      public Adapter caseGeneratorType1(GeneratorType1 object)
      {
        return createGeneratorType1Adapter();
      }
      @Override
      public Adapter caseGeometryType(GeometryType object)
      {
        return createGeometryTypeAdapter();
      }
      @Override
      public Adapter caseGlesNewparam(GlesNewparam object)
      {
        return createGlesNewparamAdapter();
      }
      @Override
      public Adapter caseGlesSamplerState(GlesSamplerState object)
      {
        return createGlesSamplerStateAdapter();
      }
      @Override
      public Adapter caseGlesTexcombinerArgumentAlphaType(GlesTexcombinerArgumentAlphaType object)
      {
        return createGlesTexcombinerArgumentAlphaTypeAdapter();
      }
      @Override
      public Adapter caseGlesTexcombinerArgumentRGBType(GlesTexcombinerArgumentRGBType object)
      {
        return createGlesTexcombinerArgumentRGBTypeAdapter();
      }
      @Override
      public Adapter caseGlesTexcombinerCommandAlphaType(GlesTexcombinerCommandAlphaType object)
      {
        return createGlesTexcombinerCommandAlphaTypeAdapter();
      }
      @Override
      public Adapter caseGlesTexcombinerCommandRGBType(GlesTexcombinerCommandRGBType object)
      {
        return createGlesTexcombinerCommandRGBTypeAdapter();
      }
      @Override
      public Adapter caseGlesTexcombinerCommandType(GlesTexcombinerCommandType object)
      {
        return createGlesTexcombinerCommandTypeAdapter();
      }
      @Override
      public Adapter caseGlesTexenvCommandType(GlesTexenvCommandType object)
      {
        return createGlesTexenvCommandTypeAdapter();
      }
      @Override
      public Adapter caseGlesTextureConstantType(GlesTextureConstantType object)
      {
        return createGlesTextureConstantTypeAdapter();
      }
      @Override
      public Adapter caseGlesTexturePipeline(GlesTexturePipeline object)
      {
        return createGlesTexturePipelineAdapter();
      }
      @Override
      public Adapter caseGlesTextureUnit(GlesTextureUnit object)
      {
        return createGlesTextureUnitAdapter();
      }
      @Override
      public Adapter caseGlSampler1D(GlSampler1D object)
      {
        return createGlSampler1DAdapter();
      }
      @Override
      public Adapter caseGlSampler2D(GlSampler2D object)
      {
        return createGlSampler2DAdapter();
      }
      @Override
      public Adapter caseGlSampler3D(GlSampler3D object)
      {
        return createGlSampler3DAdapter();
      }
      @Override
      public Adapter caseGlSamplerCUBE(GlSamplerCUBE object)
      {
        return createGlSamplerCUBEAdapter();
      }
      @Override
      public Adapter caseGlSamplerDEPTH(GlSamplerDEPTH object)
      {
        return createGlSamplerDEPTHAdapter();
      }
      @Override
      public Adapter caseGlSamplerRECT(GlSamplerRECT object)
      {
        return createGlSamplerRECTAdapter();
      }
      @Override
      public Adapter caseGlslNewarrayType(GlslNewarrayType object)
      {
        return createGlslNewarrayTypeAdapter();
      }
      @Override
      public Adapter caseGlslNewparam(GlslNewparam object)
      {
        return createGlslNewparamAdapter();
      }
      @Override
      public Adapter caseGlslSetarrayType(GlslSetarrayType object)
      {
        return createGlslSetarrayTypeAdapter();
      }
      @Override
      public Adapter caseGlslSetparam(GlslSetparam object)
      {
        return createGlslSetparamAdapter();
      }
      @Override
      public Adapter caseGlslSetparamSimple(GlslSetparamSimple object)
      {
        return createGlslSetparamSimpleAdapter();
      }
      @Override
      public Adapter caseGlslSurfaceType(GlslSurfaceType object)
      {
        return createGlslSurfaceTypeAdapter();
      }
      @Override
      public Adapter caseHollowType(HollowType object)
      {
        return createHollowTypeAdapter();
      }
      @Override
      public Adapter caseHollowType1(HollowType1 object)
      {
        return createHollowType1Adapter();
      }
      @Override
      public Adapter caseIDREFArrayType(IDREFArrayType object)
      {
        return createIDREFArrayTypeAdapter();
      }
      @Override
      public Adapter caseImagerType(ImagerType object)
      {
        return createImagerTypeAdapter();
      }
      @Override
      public Adapter caseImageType(ImageType object)
      {
        return createImageTypeAdapter();
      }
      @Override
      public Adapter caseInputGlobal(InputGlobal object)
      {
        return createInputGlobalAdapter();
      }
      @Override
      public Adapter caseInputLocal(InputLocal object)
      {
        return createInputLocalAdapter();
      }
      @Override
      public Adapter caseInputLocalOffset(InputLocalOffset object)
      {
        return createInputLocalOffsetAdapter();
      }
      @Override
      public Adapter caseInstanceControllerType(InstanceControllerType object)
      {
        return createInstanceControllerTypeAdapter();
      }
      @Override
      public Adapter caseInstanceEffectType(InstanceEffectType object)
      {
        return createInstanceEffectTypeAdapter();
      }
      @Override
      public Adapter caseInstanceGeometryType(InstanceGeometryType object)
      {
        return createInstanceGeometryTypeAdapter();
      }
      @Override
      public Adapter caseInstanceMaterialType(InstanceMaterialType object)
      {
        return createInstanceMaterialTypeAdapter();
      }
      @Override
      public Adapter caseInstancePhysicsModelType(InstancePhysicsModelType object)
      {
        return createInstancePhysicsModelTypeAdapter();
      }
      @Override
      public Adapter caseInstanceRigidBodyType(InstanceRigidBodyType object)
      {
        return createInstanceRigidBodyTypeAdapter();
      }
      @Override
      public Adapter caseInstanceRigidConstraintType(InstanceRigidConstraintType object)
      {
        return createInstanceRigidConstraintTypeAdapter();
      }
      @Override
      public Adapter caseInstanceWithExtra(InstanceWithExtra object)
      {
        return createInstanceWithExtraAdapter();
      }
      @Override
      public Adapter caseIntArrayType(IntArrayType object)
      {
        return createIntArrayTypeAdapter();
      }
      @Override
      public Adapter caseInterpenetrateType(InterpenetrateType object)
      {
        return createInterpenetrateTypeAdapter();
      }
      @Override
      public Adapter caseJointsType(JointsType object)
      {
        return createJointsTypeAdapter();
      }
      @Override
      public Adapter caseLambertType(LambertType object)
      {
        return createLambertTypeAdapter();
      }
      @Override
      public Adapter caseLibraryAnimationClipsType(LibraryAnimationClipsType object)
      {
        return createLibraryAnimationClipsTypeAdapter();
      }
      @Override
      public Adapter caseLibraryAnimationsType(LibraryAnimationsType object)
      {
        return createLibraryAnimationsTypeAdapter();
      }
      @Override
      public Adapter caseLibraryCamerasType(LibraryCamerasType object)
      {
        return createLibraryCamerasTypeAdapter();
      }
      @Override
      public Adapter caseLibraryControllersType(LibraryControllersType object)
      {
        return createLibraryControllersTypeAdapter();
      }
      @Override
      public Adapter caseLibraryEffectsType(LibraryEffectsType object)
      {
        return createLibraryEffectsTypeAdapter();
      }
      @Override
      public Adapter caseLibraryForceFieldsType(LibraryForceFieldsType object)
      {
        return createLibraryForceFieldsTypeAdapter();
      }
      @Override
      public Adapter caseLibraryGeometriesType(LibraryGeometriesType object)
      {
        return createLibraryGeometriesTypeAdapter();
      }
      @Override
      public Adapter caseLibraryImagesType(LibraryImagesType object)
      {
        return createLibraryImagesTypeAdapter();
      }
      @Override
      public Adapter caseLibraryLightsType(LibraryLightsType object)
      {
        return createLibraryLightsTypeAdapter();
      }
      @Override
      public Adapter caseLibraryMaterialsType(LibraryMaterialsType object)
      {
        return createLibraryMaterialsTypeAdapter();
      }
      @Override
      public Adapter caseLibraryNodesType(LibraryNodesType object)
      {
        return createLibraryNodesTypeAdapter();
      }
      @Override
      public Adapter caseLibraryPhysicsMaterialsType(LibraryPhysicsMaterialsType object)
      {
        return createLibraryPhysicsMaterialsTypeAdapter();
      }
      @Override
      public Adapter caseLibraryPhysicsModelsType(LibraryPhysicsModelsType object)
      {
        return createLibraryPhysicsModelsTypeAdapter();
      }
      @Override
      public Adapter caseLibraryPhysicsScenesType(LibraryPhysicsScenesType object)
      {
        return createLibraryPhysicsScenesTypeAdapter();
      }
      @Override
      public Adapter caseLibraryVisualScenesType(LibraryVisualScenesType object)
      {
        return createLibraryVisualScenesTypeAdapter();
      }
      @Override
      public Adapter caseLightAmbientType(LightAmbientType object)
      {
        return createLightAmbientTypeAdapter();
      }
      @Override
      public Adapter caseLightAmbientType1(LightAmbientType1 object)
      {
        return createLightAmbientType1Adapter();
      }
      @Override
      public Adapter caseLightConstantAttenuationType(LightConstantAttenuationType object)
      {
        return createLightConstantAttenuationTypeAdapter();
      }
      @Override
      public Adapter caseLightConstantAttenuationType1(LightConstantAttenuationType1 object)
      {
        return createLightConstantAttenuationType1Adapter();
      }
      @Override
      public Adapter caseLightDiffuseType(LightDiffuseType object)
      {
        return createLightDiffuseTypeAdapter();
      }
      @Override
      public Adapter caseLightDiffuseType1(LightDiffuseType1 object)
      {
        return createLightDiffuseType1Adapter();
      }
      @Override
      public Adapter caseLightEnableType(LightEnableType object)
      {
        return createLightEnableTypeAdapter();
      }
      @Override
      public Adapter caseLightEnableType1(LightEnableType1 object)
      {
        return createLightEnableType1Adapter();
      }
      @Override
      public Adapter caseLightingEnableType(LightingEnableType object)
      {
        return createLightingEnableTypeAdapter();
      }
      @Override
      public Adapter caseLightingEnableType1(LightingEnableType1 object)
      {
        return createLightingEnableType1Adapter();
      }
      @Override
      public Adapter caseLightLinearAttenuationType(LightLinearAttenuationType object)
      {
        return createLightLinearAttenuationTypeAdapter();
      }
      @Override
      public Adapter caseLightLinearAttenutationType(LightLinearAttenutationType object)
      {
        return createLightLinearAttenutationTypeAdapter();
      }
      @Override
      public Adapter caseLightModelAmbientType(LightModelAmbientType object)
      {
        return createLightModelAmbientTypeAdapter();
      }
      @Override
      public Adapter caseLightModelAmbientType1(LightModelAmbientType1 object)
      {
        return createLightModelAmbientType1Adapter();
      }
      @Override
      public Adapter caseLightModelColorControlType(LightModelColorControlType object)
      {
        return createLightModelColorControlTypeAdapter();
      }
      @Override
      public Adapter caseLightModelLocalViewerEnableType(LightModelLocalViewerEnableType object)
      {
        return createLightModelLocalViewerEnableTypeAdapter();
      }
      @Override
      public Adapter caseLightModelTwoSideEnableType(LightModelTwoSideEnableType object)
      {
        return createLightModelTwoSideEnableTypeAdapter();
      }
      @Override
      public Adapter caseLightModelTwoSideEnableType1(LightModelTwoSideEnableType1 object)
      {
        return createLightModelTwoSideEnableType1Adapter();
      }
      @Override
      public Adapter caseLightPositionType(LightPositionType object)
      {
        return createLightPositionTypeAdapter();
      }
      @Override
      public Adapter caseLightPositionType1(LightPositionType1 object)
      {
        return createLightPositionType1Adapter();
      }
      @Override
      public Adapter caseLightQuadraticAttenuationType(LightQuadraticAttenuationType object)
      {
        return createLightQuadraticAttenuationTypeAdapter();
      }
      @Override
      public Adapter caseLightQuadraticAttenuationType1(LightQuadraticAttenuationType1 object)
      {
        return createLightQuadraticAttenuationType1Adapter();
      }
      @Override
      public Adapter caseLightSpecularType(LightSpecularType object)
      {
        return createLightSpecularTypeAdapter();
      }
      @Override
      public Adapter caseLightSpecularType1(LightSpecularType1 object)
      {
        return createLightSpecularType1Adapter();
      }
      @Override
      public Adapter caseLightSpotCutoffType(LightSpotCutoffType object)
      {
        return createLightSpotCutoffTypeAdapter();
      }
      @Override
      public Adapter caseLightSpotCutoffType1(LightSpotCutoffType1 object)
      {
        return createLightSpotCutoffType1Adapter();
      }
      @Override
      public Adapter caseLightSpotDirectionType(LightSpotDirectionType object)
      {
        return createLightSpotDirectionTypeAdapter();
      }
      @Override
      public Adapter caseLightSpotDirectionType1(LightSpotDirectionType1 object)
      {
        return createLightSpotDirectionType1Adapter();
      }
      @Override
      public Adapter caseLightSpotExponentType(LightSpotExponentType object)
      {
        return createLightSpotExponentTypeAdapter();
      }
      @Override
      public Adapter caseLightSpotExponentType1(LightSpotExponentType1 object)
      {
        return createLightSpotExponentType1Adapter();
      }
      @Override
      public Adapter caseLightType(LightType object)
      {
        return createLightTypeAdapter();
      }
      @Override
      public Adapter caseLimitsType(LimitsType object)
      {
        return createLimitsTypeAdapter();
      }
      @Override
      public Adapter caseLinearType(LinearType object)
      {
        return createLinearTypeAdapter();
      }
      @Override
      public Adapter caseLinearType1(LinearType1 object)
      {
        return createLinearType1Adapter();
      }
      @Override
      public Adapter caseLineSmoothEnableType(LineSmoothEnableType object)
      {
        return createLineSmoothEnableTypeAdapter();
      }
      @Override
      public Adapter caseLineSmoothEnableType1(LineSmoothEnableType1 object)
      {
        return createLineSmoothEnableType1Adapter();
      }
      @Override
      public Adapter caseLineStippleEnableType(LineStippleEnableType object)
      {
        return createLineStippleEnableTypeAdapter();
      }
      @Override
      public Adapter caseLineStippleType(LineStippleType object)
      {
        return createLineStippleTypeAdapter();
      }
      @Override
      public Adapter caseLinestripsType(LinestripsType object)
      {
        return createLinestripsTypeAdapter();
      }
      @Override
      public Adapter caseLinesType(LinesType object)
      {
        return createLinesTypeAdapter();
      }
      @Override
      public Adapter caseLineWidthType(LineWidthType object)
      {
        return createLineWidthTypeAdapter();
      }
      @Override
      public Adapter caseLineWidthType1(LineWidthType1 object)
      {
        return createLineWidthType1Adapter();
      }
      @Override
      public Adapter caseLogicOpEnableType(LogicOpEnableType object)
      {
        return createLogicOpEnableTypeAdapter();
      }
      @Override
      public Adapter caseLogicOpType(LogicOpType object)
      {
        return createLogicOpTypeAdapter();
      }
      @Override
      public Adapter caseLogicOpType1(LogicOpType1 object)
      {
        return createLogicOpType1Adapter();
      }
      @Override
      public Adapter caseLookatType(LookatType object)
      {
        return createLookatTypeAdapter();
      }
      @Override
      public Adapter caseMaskType(MaskType object)
      {
        return createMaskTypeAdapter();
      }
      @Override
      public Adapter caseMaskType1(MaskType1 object)
      {
        return createMaskType1Adapter();
      }
      @Override
      public Adapter caseMaskType2(MaskType2 object)
      {
        return createMaskType2Adapter();
      }
      @Override
      public Adapter caseMaskType3(MaskType3 object)
      {
        return createMaskType3Adapter();
      }
      @Override
      public Adapter caseMassFrameType(MassFrameType object)
      {
        return createMassFrameTypeAdapter();
      }
      @Override
      public Adapter caseMassFrameType1(MassFrameType1 object)
      {
        return createMassFrameType1Adapter();
      }
      @Override
      public Adapter caseMaterialAmbientType(MaterialAmbientType object)
      {
        return createMaterialAmbientTypeAdapter();
      }
      @Override
      public Adapter caseMaterialAmbientType1(MaterialAmbientType1 object)
      {
        return createMaterialAmbientType1Adapter();
      }
      @Override
      public Adapter caseMaterialDiffuseType(MaterialDiffuseType object)
      {
        return createMaterialDiffuseTypeAdapter();
      }
      @Override
      public Adapter caseMaterialDiffuseType1(MaterialDiffuseType1 object)
      {
        return createMaterialDiffuseType1Adapter();
      }
      @Override
      public Adapter caseMaterialEmissionType(MaterialEmissionType object)
      {
        return createMaterialEmissionTypeAdapter();
      }
      @Override
      public Adapter caseMaterialEmissionType1(MaterialEmissionType1 object)
      {
        return createMaterialEmissionType1Adapter();
      }
      @Override
      public Adapter caseMaterialShininessType(MaterialShininessType object)
      {
        return createMaterialShininessTypeAdapter();
      }
      @Override
      public Adapter caseMaterialShininessType1(MaterialShininessType1 object)
      {
        return createMaterialShininessType1Adapter();
      }
      @Override
      public Adapter caseMaterialSpecularType(MaterialSpecularType object)
      {
        return createMaterialSpecularTypeAdapter();
      }
      @Override
      public Adapter caseMaterialSpecularType1(MaterialSpecularType1 object)
      {
        return createMaterialSpecularType1Adapter();
      }
      @Override
      public Adapter caseMaterialType(MaterialType object)
      {
        return createMaterialTypeAdapter();
      }
      @Override
      public Adapter caseMatrixType(MatrixType object)
      {
        return createMatrixTypeAdapter();
      }
      @Override
      public Adapter caseMeshType(MeshType object)
      {
        return createMeshTypeAdapter();
      }
      @Override
      public Adapter caseModelViewMatrixType(ModelViewMatrixType object)
      {
        return createModelViewMatrixTypeAdapter();
      }
      @Override
      public Adapter caseModelViewMatrixType1(ModelViewMatrixType1 object)
      {
        return createModelViewMatrixType1Adapter();
      }
      @Override
      public Adapter caseModeType(ModeType object)
      {
        return createModeTypeAdapter();
      }
      @Override
      public Adapter caseModeType1(ModeType1 object)
      {
        return createModeType1Adapter();
      }
      @Override
      public Adapter caseMorphType(MorphType object)
      {
        return createMorphTypeAdapter();
      }
      @Override
      public Adapter caseMultisampleEnableType(MultisampleEnableType object)
      {
        return createMultisampleEnableTypeAdapter();
      }
      @Override
      public Adapter caseMultisampleEnableType1(MultisampleEnableType1 object)
      {
        return createMultisampleEnableType1Adapter();
      }
      @Override
      public Adapter caseNameArrayType(NameArrayType object)
      {
        return createNameArrayTypeAdapter();
      }
      @Override
      public Adapter caseNameType(NameType object)
      {
        return createNameTypeAdapter();
      }
      @Override
      public Adapter caseNameType1(NameType1 object)
      {
        return createNameType1Adapter();
      }
      @Override
      public Adapter caseNameType2(NameType2 object)
      {
        return createNameType2Adapter();
      }
      @Override
      public Adapter caseNameType3(NameType3 object)
      {
        return createNameType3Adapter();
      }
      @Override
      public Adapter caseNodeType1(NodeType1 object)
      {
        return createNodeType1Adapter();
      }
      @Override
      public Adapter caseNormalizeEnableType(NormalizeEnableType object)
      {
        return createNormalizeEnableTypeAdapter();
      }
      @Override
      public Adapter caseNormalizeEnableType1(NormalizeEnableType1 object)
      {
        return createNormalizeEnableType1Adapter();
      }
      @Override
      public Adapter caseOpticsType(OpticsType object)
      {
        return createOpticsTypeAdapter();
      }
      @Override
      public Adapter caseOrthographicType(OrthographicType object)
      {
        return createOrthographicTypeAdapter();
      }
      @Override
      public Adapter caseParamType(ParamType object)
      {
        return createParamTypeAdapter();
      }
      @Override
      public Adapter caseParamType1(ParamType1 object)
      {
        return createParamType1Adapter();
      }
      @Override
      public Adapter caseParamType2(ParamType2 object)
      {
        return createParamType2Adapter();
      }
      @Override
      public Adapter caseParamType3(ParamType3 object)
      {
        return createParamType3Adapter();
      }
      @Override
      public Adapter caseParamType4(ParamType4 object)
      {
        return createParamType4Adapter();
      }
      @Override
      public Adapter casePassType(PassType object)
      {
        return createPassTypeAdapter();
      }
      @Override
      public Adapter casePassType1(PassType1 object)
      {
        return createPassType1Adapter();
      }
      @Override
      public Adapter casePassType2(PassType2 object)
      {
        return createPassType2Adapter();
      }
      @Override
      public Adapter casePerspectiveType(PerspectiveType object)
      {
        return createPerspectiveTypeAdapter();
      }
      @Override
      public Adapter casePhongType(PhongType object)
      {
        return createPhongTypeAdapter();
      }
      @Override
      public Adapter casePhType(PhType object)
      {
        return createPhTypeAdapter();
      }
      @Override
      public Adapter casePhysicsMaterialType(PhysicsMaterialType object)
      {
        return createPhysicsMaterialTypeAdapter();
      }
      @Override
      public Adapter casePhysicsModelType(PhysicsModelType object)
      {
        return createPhysicsModelTypeAdapter();
      }
      @Override
      public Adapter casePhysicsSceneType(PhysicsSceneType object)
      {
        return createPhysicsSceneTypeAdapter();
      }
      @Override
      public Adapter casePlaneType(PlaneType object)
      {
        return createPlaneTypeAdapter();
      }
      @Override
      public Adapter casePointDistanceAttenuationType(PointDistanceAttenuationType object)
      {
        return createPointDistanceAttenuationTypeAdapter();
      }
      @Override
      public Adapter casePointDistanceAttenuationType1(PointDistanceAttenuationType1 object)
      {
        return createPointDistanceAttenuationType1Adapter();
      }
      @Override
      public Adapter casePointFadeThresholdSizeType(PointFadeThresholdSizeType object)
      {
        return createPointFadeThresholdSizeTypeAdapter();
      }
      @Override
      public Adapter casePointFadeThresholdSizeType1(PointFadeThresholdSizeType1 object)
      {
        return createPointFadeThresholdSizeType1Adapter();
      }
      @Override
      public Adapter casePointSizeMaxType(PointSizeMaxType object)
      {
        return createPointSizeMaxTypeAdapter();
      }
      @Override
      public Adapter casePointSizeMaxType1(PointSizeMaxType1 object)
      {
        return createPointSizeMaxType1Adapter();
      }
      @Override
      public Adapter casePointSizeMinType(PointSizeMinType object)
      {
        return createPointSizeMinTypeAdapter();
      }
      @Override
      public Adapter casePointSizeMinType1(PointSizeMinType1 object)
      {
        return createPointSizeMinType1Adapter();
      }
      @Override
      public Adapter casePointSizeType(PointSizeType object)
      {
        return createPointSizeTypeAdapter();
      }
      @Override
      public Adapter casePointSizeType1(PointSizeType1 object)
      {
        return createPointSizeType1Adapter();
      }
      @Override
      public Adapter casePointSmoothEnableType(PointSmoothEnableType object)
      {
        return createPointSmoothEnableTypeAdapter();
      }
      @Override
      public Adapter casePointSmoothEnableType1(PointSmoothEnableType1 object)
      {
        return createPointSmoothEnableType1Adapter();
      }
      @Override
      public Adapter casePointType(PointType object)
      {
        return createPointTypeAdapter();
      }
      @Override
      public Adapter casePolygonModeType(PolygonModeType object)
      {
        return createPolygonModeTypeAdapter();
      }
      @Override
      public Adapter casePolygonOffsetFillEnableType(PolygonOffsetFillEnableType object)
      {
        return createPolygonOffsetFillEnableTypeAdapter();
      }
      @Override
      public Adapter casePolygonOffsetFillEnableType1(PolygonOffsetFillEnableType1 object)
      {
        return createPolygonOffsetFillEnableType1Adapter();
      }
      @Override
      public Adapter casePolygonOffsetLineEnableType(PolygonOffsetLineEnableType object)
      {
        return createPolygonOffsetLineEnableTypeAdapter();
      }
      @Override
      public Adapter casePolygonOffsetPointEnableType(PolygonOffsetPointEnableType object)
      {
        return createPolygonOffsetPointEnableTypeAdapter();
      }
      @Override
      public Adapter casePolygonOffsetType(PolygonOffsetType object)
      {
        return createPolygonOffsetTypeAdapter();
      }
      @Override
      public Adapter casePolygonOffsetType1(PolygonOffsetType1 object)
      {
        return createPolygonOffsetType1Adapter();
      }
      @Override
      public Adapter casePolygonSmoothEnableType(PolygonSmoothEnableType object)
      {
        return createPolygonSmoothEnableTypeAdapter();
      }
      @Override
      public Adapter casePolygonStippleEnableType(PolygonStippleEnableType object)
      {
        return createPolygonStippleEnableTypeAdapter();
      }
      @Override
      public Adapter casePolygonsType(PolygonsType object)
      {
        return createPolygonsTypeAdapter();
      }
      @Override
      public Adapter casePolylistType(PolylistType object)
      {
        return createPolylistTypeAdapter();
      }
      @Override
      public Adapter casePrimaryType(PrimaryType object)
      {
        return createPrimaryTypeAdapter();
      }
      @Override
      public Adapter casePrimaryType1(PrimaryType1 object)
      {
        return createPrimaryType1Adapter();
      }
      @Override
      public Adapter caseProfileCGType(ProfileCGType object)
      {
        return createProfileCGTypeAdapter();
      }
      @Override
      public Adapter caseProfileCOMMONType(ProfileCOMMONType object)
      {
        return createProfileCOMMONTypeAdapter();
      }
      @Override
      public Adapter caseProfileGLESType(ProfileGLESType object)
      {
        return createProfileGLESTypeAdapter();
      }
      @Override
      public Adapter caseProfileGLSLType(ProfileGLSLType object)
      {
        return createProfileGLSLTypeAdapter();
      }
      @Override
      public Adapter caseProjectionMatrixType(ProjectionMatrixType object)
      {
        return createProjectionMatrixTypeAdapter();
      }
      @Override
      public Adapter caseProjectionMatrixType1(ProjectionMatrixType1 object)
      {
        return createProjectionMatrixType1Adapter();
      }
      @Override
      public Adapter caseRefAttachmentType(RefAttachmentType object)
      {
        return createRefAttachmentTypeAdapter();
      }
      @Override
      public Adapter caseRefType(RefType object)
      {
        return createRefTypeAdapter();
      }
      @Override
      public Adapter caseRefType1(RefType1 object)
      {
        return createRefType1Adapter();
      }
      @Override
      public Adapter caseRefType2(RefType2 object)
      {
        return createRefType2Adapter();
      }
      @Override
      public Adapter caseRenderType(RenderType object)
      {
        return createRenderTypeAdapter();
      }
      @Override
      public Adapter caseRescaleNormalEnableType(RescaleNormalEnableType object)
      {
        return createRescaleNormalEnableTypeAdapter();
      }
      @Override
      public Adapter caseRescaleNormalEnableType1(RescaleNormalEnableType1 object)
      {
        return createRescaleNormalEnableType1Adapter();
      }
      @Override
      public Adapter caseRgbType(RgbType object)
      {
        return createRgbTypeAdapter();
      }
      @Override
      public Adapter caseRigidBodyType(RigidBodyType object)
      {
        return createRigidBodyTypeAdapter();
      }
      @Override
      public Adapter caseRigidConstraintType(RigidConstraintType object)
      {
        return createRigidConstraintTypeAdapter();
      }
      @Override
      public Adapter caseRotateType(RotateType object)
      {
        return createRotateTypeAdapter();
      }
      @Override
      public Adapter caseSampleAlphaToCoverageEnableType(SampleAlphaToCoverageEnableType object)
      {
        return createSampleAlphaToCoverageEnableTypeAdapter();
      }
      @Override
      public Adapter caseSampleAlphaToCoverageEnableType1(SampleAlphaToCoverageEnableType1 object)
      {
        return createSampleAlphaToCoverageEnableType1Adapter();
      }
      @Override
      public Adapter caseSampleAlphaToOneEnableType(SampleAlphaToOneEnableType object)
      {
        return createSampleAlphaToOneEnableTypeAdapter();
      }
      @Override
      public Adapter caseSampleAlphaToOneEnableType1(SampleAlphaToOneEnableType1 object)
      {
        return createSampleAlphaToOneEnableType1Adapter();
      }
      @Override
      public Adapter caseSampleCoverageEnableType(SampleCoverageEnableType object)
      {
        return createSampleCoverageEnableTypeAdapter();
      }
      @Override
      public Adapter caseSampleCoverageEnableType1(SampleCoverageEnableType1 object)
      {
        return createSampleCoverageEnableType1Adapter();
      }
      @Override
      public Adapter caseSamplerType(SamplerType object)
      {
        return createSamplerTypeAdapter();
      }
      @Override
      public Adapter caseSceneType(SceneType object)
      {
        return createSceneTypeAdapter();
      }
      @Override
      public Adapter caseScissorTestEnableType(ScissorTestEnableType object)
      {
        return createScissorTestEnableTypeAdapter();
      }
      @Override
      public Adapter caseScissorTestEnableType1(ScissorTestEnableType1 object)
      {
        return createScissorTestEnableType1Adapter();
      }
      @Override
      public Adapter caseScissorType(ScissorType object)
      {
        return createScissorTypeAdapter();
      }
      @Override
      public Adapter caseScissorType1(ScissorType1 object)
      {
        return createScissorType1Adapter();
      }
      @Override
      public Adapter caseSetparamType(SetparamType object)
      {
        return createSetparamTypeAdapter();
      }
      @Override
      public Adapter caseSetparamType1(SetparamType1 object)
      {
        return createSetparamType1Adapter();
      }
      @Override
      public Adapter caseShadeModelType(ShadeModelType object)
      {
        return createShadeModelTypeAdapter();
      }
      @Override
      public Adapter caseShadeModelType1(ShadeModelType1 object)
      {
        return createShadeModelType1Adapter();
      }
      @Override
      public Adapter caseShaderType(ShaderType object)
      {
        return createShaderTypeAdapter();
      }
      @Override
      public Adapter caseShaderType1(ShaderType1 object)
      {
        return createShaderType1Adapter();
      }
      @Override
      public Adapter caseShapeType(ShapeType object)
      {
        return createShapeTypeAdapter();
      }
      @Override
      public Adapter caseShapeType1(ShapeType1 object)
      {
        return createShapeType1Adapter();
      }
      @Override
      public Adapter caseSkewType(SkewType object)
      {
        return createSkewTypeAdapter();
      }
      @Override
      public Adapter caseSkinType(SkinType object)
      {
        return createSkinTypeAdapter();
      }
      @Override
      public Adapter caseSourceType(SourceType object)
      {
        return createSourceTypeAdapter();
      }
      @Override
      public Adapter caseSphereType(SphereType object)
      {
        return createSphereTypeAdapter();
      }
      @Override
      public Adapter caseSplineType(SplineType object)
      {
        return createSplineTypeAdapter();
      }
      @Override
      public Adapter caseSpotType(SpotType object)
      {
        return createSpotTypeAdapter();
      }
      @Override
      public Adapter caseSpringType1(SpringType1 object)
      {
        return createSpringType1Adapter();
      }
      @Override
      public Adapter caseSrcAlphaType(SrcAlphaType object)
      {
        return createSrcAlphaTypeAdapter();
      }
      @Override
      public Adapter caseSrcRgbType(SrcRgbType object)
      {
        return createSrcRgbTypeAdapter();
      }
      @Override
      public Adapter caseSrcType(SrcType object)
      {
        return createSrcTypeAdapter();
      }
      @Override
      public Adapter caseSrcType1(SrcType1 object)
      {
        return createSrcType1Adapter();
      }
      @Override
      public Adapter caseStencilFuncSeparateType(StencilFuncSeparateType object)
      {
        return createStencilFuncSeparateTypeAdapter();
      }
      @Override
      public Adapter caseStencilFuncType(StencilFuncType object)
      {
        return createStencilFuncTypeAdapter();
      }
      @Override
      public Adapter caseStencilFuncType1(StencilFuncType1 object)
      {
        return createStencilFuncType1Adapter();
      }
      @Override
      public Adapter caseStencilMaskSeparateType(StencilMaskSeparateType object)
      {
        return createStencilMaskSeparateTypeAdapter();
      }
      @Override
      public Adapter caseStencilMaskType(StencilMaskType object)
      {
        return createStencilMaskTypeAdapter();
      }
      @Override
      public Adapter caseStencilMaskType1(StencilMaskType1 object)
      {
        return createStencilMaskType1Adapter();
      }
      @Override
      public Adapter caseStencilOpSeparateType(StencilOpSeparateType object)
      {
        return createStencilOpSeparateTypeAdapter();
      }
      @Override
      public Adapter caseStencilOpType(StencilOpType object)
      {
        return createStencilOpTypeAdapter();
      }
      @Override
      public Adapter caseStencilOpType1(StencilOpType1 object)
      {
        return createStencilOpType1Adapter();
      }
      @Override
      public Adapter caseStencilTestEnableType(StencilTestEnableType object)
      {
        return createStencilTestEnableTypeAdapter();
      }
      @Override
      public Adapter caseStencilTestEnableType1(StencilTestEnableType1 object)
      {
        return createStencilTestEnableType1Adapter();
      }
      @Override
      public Adapter caseSwingConeAndTwistType(SwingConeAndTwistType object)
      {
        return createSwingConeAndTwistTypeAdapter();
      }
      @Override
      public Adapter caseTaperedCapsuleType(TaperedCapsuleType object)
      {
        return createTaperedCapsuleTypeAdapter();
      }
      @Override
      public Adapter caseTaperedCylinderType(TaperedCylinderType object)
      {
        return createTaperedCylinderTypeAdapter();
      }
      @Override
      public Adapter caseTargetableFloat(TargetableFloat object)
      {
        return createTargetableFloatAdapter();
      }
      @Override
      public Adapter caseTargetableFloat3(TargetableFloat3 object)
      {
        return createTargetableFloat3Adapter();
      }
      @Override
      public Adapter caseTargetsType(TargetsType object)
      {
        return createTargetsTypeAdapter();
      }
      @Override
      public Adapter caseTechniqueCommonType(TechniqueCommonType object)
      {
        return createTechniqueCommonTypeAdapter();
      }
      @Override
      public Adapter caseTechniqueCommonType1(TechniqueCommonType1 object)
      {
        return createTechniqueCommonType1Adapter();
      }
      @Override
      public Adapter caseTechniqueCommonType2(TechniqueCommonType2 object)
      {
        return createTechniqueCommonType2Adapter();
      }
      @Override
      public Adapter caseTechniqueCommonType3(TechniqueCommonType3 object)
      {
        return createTechniqueCommonType3Adapter();
      }
      @Override
      public Adapter caseTechniqueCommonType4(TechniqueCommonType4 object)
      {
        return createTechniqueCommonType4Adapter();
      }
      @Override
      public Adapter caseTechniqueCommonType5(TechniqueCommonType5 object)
      {
        return createTechniqueCommonType5Adapter();
      }
      @Override
      public Adapter caseTechniqueCommonType6(TechniqueCommonType6 object)
      {
        return createTechniqueCommonType6Adapter();
      }
      @Override
      public Adapter caseTechniqueCommonType7(TechniqueCommonType7 object)
      {
        return createTechniqueCommonType7Adapter();
      }
      @Override
      public Adapter caseTechniqueCommonType8(TechniqueCommonType8 object)
      {
        return createTechniqueCommonType8Adapter();
      }
      @Override
      public Adapter caseTechniqueHintType(TechniqueHintType object)
      {
        return createTechniqueHintTypeAdapter();
      }
      @Override
      public Adapter caseTechniqueType(TechniqueType object)
      {
        return createTechniqueTypeAdapter();
      }
      @Override
      public Adapter caseTechniqueType1(TechniqueType1 object)
      {
        return createTechniqueType1Adapter();
      }
      @Override
      public Adapter caseTechniqueType2(TechniqueType2 object)
      {
        return createTechniqueType2Adapter();
      }
      @Override
      public Adapter caseTechniqueType3(TechniqueType3 object)
      {
        return createTechniqueType3Adapter();
      }
      @Override
      public Adapter caseTechniqueType4(TechniqueType4 object)
      {
        return createTechniqueType4Adapter();
      }
      @Override
      public Adapter caseTexcoordType(TexcoordType object)
      {
        return createTexcoordTypeAdapter();
      }
      @Override
      public Adapter caseTexture1DEnableType(Texture1DEnableType object)
      {
        return createTexture1DEnableTypeAdapter();
      }
      @Override
      public Adapter caseTexture1DType(Texture1DType object)
      {
        return createTexture1DTypeAdapter();
      }
      @Override
      public Adapter caseTexture2DEnableType(Texture2DEnableType object)
      {
        return createTexture2DEnableTypeAdapter();
      }
      @Override
      public Adapter caseTexture2DType(Texture2DType object)
      {
        return createTexture2DTypeAdapter();
      }
      @Override
      public Adapter caseTexture3DEnableType(Texture3DEnableType object)
      {
        return createTexture3DEnableTypeAdapter();
      }
      @Override
      public Adapter caseTexture3DType(Texture3DType object)
      {
        return createTexture3DTypeAdapter();
      }
      @Override
      public Adapter caseTextureCUBEEnableType(TextureCUBEEnableType object)
      {
        return createTextureCUBEEnableTypeAdapter();
      }
      @Override
      public Adapter caseTextureCUBEType(TextureCUBEType object)
      {
        return createTextureCUBETypeAdapter();
      }
      @Override
      public Adapter caseTextureDEPTHEnableType(TextureDEPTHEnableType object)
      {
        return createTextureDEPTHEnableTypeAdapter();
      }
      @Override
      public Adapter caseTextureDEPTHType(TextureDEPTHType object)
      {
        return createTextureDEPTHTypeAdapter();
      }
      @Override
      public Adapter caseTextureEnvColorType(TextureEnvColorType object)
      {
        return createTextureEnvColorTypeAdapter();
      }
      @Override
      public Adapter caseTextureEnvModeType(TextureEnvModeType object)
      {
        return createTextureEnvModeTypeAdapter();
      }
      @Override
      public Adapter caseTexturePipelineEnableType(TexturePipelineEnableType object)
      {
        return createTexturePipelineEnableTypeAdapter();
      }
      @Override
      public Adapter caseTexturePipelineType(TexturePipelineType object)
      {
        return createTexturePipelineTypeAdapter();
      }
      @Override
      public Adapter caseTextureRECTEnableType(TextureRECTEnableType object)
      {
        return createTextureRECTEnableTypeAdapter();
      }
      @Override
      public Adapter caseTextureRECTType(TextureRECTType object)
      {
        return createTextureRECTTypeAdapter();
      }
      @Override
      public Adapter caseTextureType(TextureType object)
      {
        return createTextureTypeAdapter();
      }
      @Override
      public Adapter caseTrianglesType(TrianglesType object)
      {
        return createTrianglesTypeAdapter();
      }
      @Override
      public Adapter caseTrifansType(TrifansType object)
      {
        return createTrifansTypeAdapter();
      }
      @Override
      public Adapter caseTristripsType(TristripsType object)
      {
        return createTristripsTypeAdapter();
      }
      @Override
      public Adapter caseUnitType(UnitType object)
      {
        return createUnitTypeAdapter();
      }
      @Override
      public Adapter caseValueType(ValueType object)
      {
        return createValueTypeAdapter();
      }
      @Override
      public Adapter caseValueType1(ValueType1 object)
      {
        return createValueType1Adapter();
      }
      @Override
      public Adapter caseVertexWeightsType(VertexWeightsType object)
      {
        return createVertexWeightsTypeAdapter();
      }
      @Override
      public Adapter caseVerticesType(VerticesType object)
      {
        return createVerticesTypeAdapter();
      }
      @Override
      public Adapter caseVisualSceneType(VisualSceneType object)
      {
        return createVisualSceneTypeAdapter();
      }
      @Override
      public Adapter caseZfailType(ZfailType object)
      {
        return createZfailTypeAdapter();
      }
      @Override
      public Adapter caseZfailType1(ZfailType1 object)
      {
        return createZfailType1Adapter();
      }
      @Override
      public Adapter caseZfailType2(ZfailType2 object)
      {
        return createZfailType2Adapter();
      }
      @Override
      public Adapter caseZpassType(ZpassType object)
      {
        return createZpassTypeAdapter();
      }
      @Override
      public Adapter caseZpassType1(ZpassType1 object)
      {
        return createZpassType1Adapter();
      }
      @Override
      public Adapter caseZpassType2(ZpassType2 object)
      {
        return createZpassType2Adapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

	/**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
	@Override
	public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AccessorType <em>Accessor Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AccessorType
   * @generated
   */
	public Adapter createAccessorTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AllType <em>All Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AllType
   * @generated
   */
	public Adapter createAllTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AllType1 <em>All Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AllType1
   * @generated
   */
	public Adapter createAllType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AllType2 <em>All Type2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AllType2
   * @generated
   */
	public Adapter createAllType2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AlphaFuncType <em>Alpha Func Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AlphaFuncType
   * @generated
   */
	public Adapter createAlphaFuncTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AlphaFuncType1 <em>Alpha Func Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AlphaFuncType1
   * @generated
   */
	public Adapter createAlphaFuncType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AlphaTestEnableType <em>Alpha Test Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AlphaTestEnableType
   * @generated
   */
	public Adapter createAlphaTestEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AlphaTestEnableType1 <em>Alpha Test Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AlphaTestEnableType1
   * @generated
   */
	public Adapter createAlphaTestEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AlphaType <em>Alpha Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AlphaType
   * @generated
   */
	public Adapter createAlphaTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AmbientType <em>Ambient Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AmbientType
   * @generated
   */
	public Adapter createAmbientTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AngularType <em>Angular Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AngularType
   * @generated
   */
	public Adapter createAngularTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AnimationClipType <em>Animation Clip Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AnimationClipType
   * @generated
   */
	public Adapter createAnimationClipTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AnimationType <em>Animation Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AnimationType
   * @generated
   */
	public Adapter createAnimationTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AssetType <em>Asset Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AssetType
   * @generated
   */
	public Adapter createAssetTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AttachmentType <em>Attachment Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AttachmentType
   * @generated
   */
	public Adapter createAttachmentTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.AutoNormalEnableType <em>Auto Normal Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.AutoNormalEnableType
   * @generated
   */
	public Adapter createAutoNormalEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BackType <em>Back Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BackType
   * @generated
   */
	public Adapter createBackTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BindMaterialType <em>Bind Material Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BindMaterialType
   * @generated
   */
	public Adapter createBindMaterialTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BindType <em>Bind Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BindType
   * @generated
   */
	public Adapter createBindTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BindType1 <em>Bind Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BindType1
   * @generated
   */
	public Adapter createBindType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BindType2 <em>Bind Type2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BindType2
   * @generated
   */
	public Adapter createBindType2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BindVertexInputType <em>Bind Vertex Input Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BindVertexInputType
   * @generated
   */
	public Adapter createBindVertexInputTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BlendColorType <em>Blend Color Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BlendColorType
   * @generated
   */
	public Adapter createBlendColorTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BlendEnableType <em>Blend Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BlendEnableType
   * @generated
   */
	public Adapter createBlendEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BlendEnableType1 <em>Blend Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BlendEnableType1
   * @generated
   */
	public Adapter createBlendEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BlendEquationSeparateType <em>Blend Equation Separate Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BlendEquationSeparateType
   * @generated
   */
	public Adapter createBlendEquationSeparateTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BlendEquationType <em>Blend Equation Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BlendEquationType
   * @generated
   */
	public Adapter createBlendEquationTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BlendFuncSeparateType <em>Blend Func Separate Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BlendFuncSeparateType
   * @generated
   */
	public Adapter createBlendFuncSeparateTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BlendFuncType <em>Blend Func Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BlendFuncType
   * @generated
   */
	public Adapter createBlendFuncTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BlendFuncType1 <em>Blend Func Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BlendFuncType1
   * @generated
   */
	public Adapter createBlendFuncType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BlinnType <em>Blinn Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BlinnType
   * @generated
   */
	public Adapter createBlinnTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BoolArrayType <em>Bool Array Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BoolArrayType
   * @generated
   */
	public Adapter createBoolArrayTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.BoxType <em>Box Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.BoxType
   * @generated
   */
	public Adapter createBoxTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CameraType <em>Camera Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CameraType
   * @generated
   */
	public Adapter createCameraTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CapsuleType <em>Capsule Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CapsuleType
   * @generated
   */
	public Adapter createCapsuleTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CgConnectParam <em>Cg Connect Param</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CgConnectParam
   * @generated
   */
	public Adapter createCgConnectParamAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CgNewarrayType <em>Cg Newarray Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CgNewarrayType
   * @generated
   */
	public Adapter createCgNewarrayTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CgNewparam <em>Cg Newparam</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CgNewparam
   * @generated
   */
	public Adapter createCgNewparamAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CgSampler1D <em>Cg Sampler1 D</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CgSampler1D
   * @generated
   */
	public Adapter createCgSampler1DAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CgSampler2D <em>Cg Sampler2 D</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CgSampler2D
   * @generated
   */
	public Adapter createCgSampler2DAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CgSampler3D <em>Cg Sampler3 D</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CgSampler3D
   * @generated
   */
	public Adapter createCgSampler3DAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CgSamplerCUBE <em>Cg Sampler CUBE</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CgSamplerCUBE
   * @generated
   */
	public Adapter createCgSamplerCUBEAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CgSamplerDEPTH <em>Cg Sampler DEPTH</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CgSamplerDEPTH
   * @generated
   */
	public Adapter createCgSamplerDEPTHAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CgSamplerRECT <em>Cg Sampler RECT</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CgSamplerRECT
   * @generated
   */
	public Adapter createCgSamplerRECTAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CgSetarrayType <em>Cg Setarray Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CgSetarrayType
   * @generated
   */
	public Adapter createCgSetarrayTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CgSetparam <em>Cg Setparam</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CgSetparam
   * @generated
   */
	public Adapter createCgSetparamAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CgSetparamSimple <em>Cg Setparam Simple</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CgSetparamSimple
   * @generated
   */
	public Adapter createCgSetparamSimpleAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CgSetuserType <em>Cg Setuser Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CgSetuserType
   * @generated
   */
	public Adapter createCgSetuserTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CgSurfaceType <em>Cg Surface Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CgSurfaceType
   * @generated
   */
	public Adapter createCgSurfaceTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ChannelType <em>Channel Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ChannelType
   * @generated
   */
	public Adapter createChannelTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ClearColorType <em>Clear Color Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ClearColorType
   * @generated
   */
	public Adapter createClearColorTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ClearColorType1 <em>Clear Color Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ClearColorType1
   * @generated
   */
	public Adapter createClearColorType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ClearDepthType <em>Clear Depth Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ClearDepthType
   * @generated
   */
	public Adapter createClearDepthTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ClearDepthType1 <em>Clear Depth Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ClearDepthType1
   * @generated
   */
	public Adapter createClearDepthType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ClearStencilType <em>Clear Stencil Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ClearStencilType
   * @generated
   */
	public Adapter createClearStencilTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ClearStencilType1 <em>Clear Stencil Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ClearStencilType1
   * @generated
   */
	public Adapter createClearStencilType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ClipPlaneEnableType <em>Clip Plane Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ClipPlaneEnableType
   * @generated
   */
	public Adapter createClipPlaneEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ClipPlaneEnableType1 <em>Clip Plane Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ClipPlaneEnableType1
   * @generated
   */
	public Adapter createClipPlaneEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ClipPlaneType <em>Clip Plane Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ClipPlaneType
   * @generated
   */
	public Adapter createClipPlaneTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ClipPlaneType1 <em>Clip Plane Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ClipPlaneType1
   * @generated
   */
	public Adapter createClipPlaneType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.COLLADAType <em>COLLADA Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.COLLADAType
   * @generated
   */
	public Adapter createCOLLADATypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ColorLogicOpEnableType <em>Color Logic Op Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ColorLogicOpEnableType
   * @generated
   */
	public Adapter createColorLogicOpEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ColorLogicOpEnableType1 <em>Color Logic Op Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ColorLogicOpEnableType1
   * @generated
   */
	public Adapter createColorLogicOpEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ColorMaskType <em>Color Mask Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ColorMaskType
   * @generated
   */
	public Adapter createColorMaskTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ColorMaskType1 <em>Color Mask Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ColorMaskType1
   * @generated
   */
	public Adapter createColorMaskType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ColorMaterialEnableType <em>Color Material Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ColorMaterialEnableType
   * @generated
   */
	public Adapter createColorMaterialEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ColorMaterialEnableType1 <em>Color Material Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ColorMaterialEnableType1
   * @generated
   */
	public Adapter createColorMaterialEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ColorMaterialType <em>Color Material Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ColorMaterialType
   * @generated
   */
	public Adapter createColorMaterialTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ColorType <em>Color Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ColorType
   * @generated
   */
	public Adapter createColorTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CommonColorOrTextureType <em>Common Color Or Texture Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CommonColorOrTextureType
   * @generated
   */
	public Adapter createCommonColorOrTextureTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CommonFloatOrParamType <em>Common Float Or Param Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CommonFloatOrParamType
   * @generated
   */
	public Adapter createCommonFloatOrParamTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CommonNewparamType <em>Common Newparam Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CommonNewparamType
   * @generated
   */
	public Adapter createCommonNewparamTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CommonTransparentType <em>Common Transparent Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CommonTransparentType
   * @generated
   */
	public Adapter createCommonTransparentTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CompilerTargetType <em>Compiler Target Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CompilerTargetType
   * @generated
   */
	public Adapter createCompilerTargetTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CompilerTargetType1 <em>Compiler Target Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CompilerTargetType1
   * @generated
   */
	public Adapter createCompilerTargetType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ConstantType <em>Constant Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ConstantType
   * @generated
   */
	public Adapter createConstantTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ContributorType <em>Contributor Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ContributorType
   * @generated
   */
	public Adapter createContributorTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ControllerType <em>Controller Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ControllerType
   * @generated
   */
	public Adapter createControllerTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ControlVerticesType <em>Control Vertices Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ControlVerticesType
   * @generated
   */
	public Adapter createControlVerticesTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ConvexMeshType <em>Convex Mesh Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ConvexMeshType
   * @generated
   */
	public Adapter createConvexMeshTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CullFaceEnableType <em>Cull Face Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CullFaceEnableType
   * @generated
   */
	public Adapter createCullFaceEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CullFaceEnableType1 <em>Cull Face Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CullFaceEnableType1
   * @generated
   */
	public Adapter createCullFaceEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CullFaceType <em>Cull Face Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CullFaceType
   * @generated
   */
	public Adapter createCullFaceTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CullFaceType1 <em>Cull Face Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CullFaceType1
   * @generated
   */
	public Adapter createCullFaceType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.CylinderType <em>Cylinder Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.CylinderType
   * @generated
   */
	public Adapter createCylinderTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DepthBoundsEnableType <em>Depth Bounds Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DepthBoundsEnableType
   * @generated
   */
	public Adapter createDepthBoundsEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DepthBoundsType <em>Depth Bounds Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DepthBoundsType
   * @generated
   */
	public Adapter createDepthBoundsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DepthClampEnableType <em>Depth Clamp Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DepthClampEnableType
   * @generated
   */
	public Adapter createDepthClampEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DepthFuncType <em>Depth Func Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DepthFuncType
   * @generated
   */
	public Adapter createDepthFuncTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DepthFuncType1 <em>Depth Func Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DepthFuncType1
   * @generated
   */
	public Adapter createDepthFuncType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DepthMaskType <em>Depth Mask Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DepthMaskType
   * @generated
   */
	public Adapter createDepthMaskTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DepthMaskType1 <em>Depth Mask Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DepthMaskType1
   * @generated
   */
	public Adapter createDepthMaskType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DepthRangeType <em>Depth Range Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DepthRangeType
   * @generated
   */
	public Adapter createDepthRangeTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DepthRangeType1 <em>Depth Range Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DepthRangeType1
   * @generated
   */
	public Adapter createDepthRangeType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DepthTestEnableType <em>Depth Test Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DepthTestEnableType
   * @generated
   */
	public Adapter createDepthTestEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DepthTestEnableType1 <em>Depth Test Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DepthTestEnableType1
   * @generated
   */
	public Adapter createDepthTestEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DestAlphaType <em>Dest Alpha Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DestAlphaType
   * @generated
   */
	public Adapter createDestAlphaTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DestRgbType <em>Dest Rgb Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DestRgbType
   * @generated
   */
	public Adapter createDestRgbTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DestType <em>Dest Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DestType
   * @generated
   */
	public Adapter createDestTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DestType1 <em>Dest Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DestType1
   * @generated
   */
	public Adapter createDestType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DirectionalType <em>Directional Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DirectionalType
   * @generated
   */
	public Adapter createDirectionalTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DitherEnableType <em>Dither Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DitherEnableType
   * @generated
   */
	public Adapter createDitherEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DitherEnableType1 <em>Dither Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DitherEnableType1
   * @generated
   */
	public Adapter createDitherEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DocumentRoot
   * @generated
   */
	public Adapter createDocumentRootAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DynamicType <em>Dynamic Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DynamicType
   * @generated
   */
	public Adapter createDynamicTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.DynamicType1 <em>Dynamic Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.DynamicType1
   * @generated
   */
	public Adapter createDynamicType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.EffectType <em>Effect Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.EffectType
   * @generated
   */
	public Adapter createEffectTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.EllipsoidType <em>Ellipsoid Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.EllipsoidType
   * @generated
   */
	public Adapter createEllipsoidTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.EnabledType <em>Enabled Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.EnabledType
   * @generated
   */
	public Adapter createEnabledTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.EvaluateSceneType <em>Evaluate Scene Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.EvaluateSceneType
   * @generated
   */
	public Adapter createEvaluateSceneTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ExtraType <em>Extra Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ExtraType
   * @generated
   */
	public Adapter createExtraTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FaceType <em>Face Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FaceType
   * @generated
   */
	public Adapter createFaceTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FaceType1 <em>Face Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FaceType1
   * @generated
   */
	public Adapter createFaceType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FaceType2 <em>Face Type2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FaceType2
   * @generated
   */
	public Adapter createFaceType2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FaceType3 <em>Face Type3</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FaceType3
   * @generated
   */
	public Adapter createFaceType3Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FaceType4 <em>Face Type4</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FaceType4
   * @generated
   */
	public Adapter createFaceType4Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FailType <em>Fail Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FailType
   * @generated
   */
	public Adapter createFailTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FailType1 <em>Fail Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FailType1
   * @generated
   */
	public Adapter createFailType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FailType2 <em>Fail Type2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FailType2
   * @generated
   */
	public Adapter createFailType2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FloatArrayType <em>Float Array Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FloatArrayType
   * @generated
   */
	public Adapter createFloatArrayTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FloatType <em>Float Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FloatType
   * @generated
   */
	public Adapter createFloatTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FogColorType <em>Fog Color Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FogColorType
   * @generated
   */
	public Adapter createFogColorTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FogColorType1 <em>Fog Color Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FogColorType1
   * @generated
   */
	public Adapter createFogColorType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FogCoordSrcType <em>Fog Coord Src Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FogCoordSrcType
   * @generated
   */
	public Adapter createFogCoordSrcTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FogDensityType <em>Fog Density Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FogDensityType
   * @generated
   */
	public Adapter createFogDensityTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FogDensityType1 <em>Fog Density Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FogDensityType1
   * @generated
   */
	public Adapter createFogDensityType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FogEnableType <em>Fog Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FogEnableType
   * @generated
   */
	public Adapter createFogEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FogEnableType1 <em>Fog Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FogEnableType1
   * @generated
   */
	public Adapter createFogEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FogEndType <em>Fog End Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FogEndType
   * @generated
   */
	public Adapter createFogEndTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FogEndType1 <em>Fog End Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FogEndType1
   * @generated
   */
	public Adapter createFogEndType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FogModeType <em>Fog Mode Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FogModeType
   * @generated
   */
	public Adapter createFogModeTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FogModeType1 <em>Fog Mode Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FogModeType1
   * @generated
   */
	public Adapter createFogModeType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FogStartType <em>Fog Start Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FogStartType
   * @generated
   */
	public Adapter createFogStartTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FogStartType1 <em>Fog Start Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FogStartType1
   * @generated
   */
	public Adapter createFogStartType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ForceFieldType <em>Force Field Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ForceFieldType
   * @generated
   */
	public Adapter createForceFieldTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FrontFaceType <em>Front Face Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FrontFaceType
   * @generated
   */
	public Adapter createFrontFaceTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FrontFaceType1 <em>Front Face Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FrontFaceType1
   * @generated
   */
	public Adapter createFrontFaceType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FrontType <em>Front Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FrontType
   * @generated
   */
	public Adapter createFrontTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FuncType <em>Func Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FuncType
   * @generated
   */
	public Adapter createFuncTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FuncType1 <em>Func Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FuncType1
   * @generated
   */
	public Adapter createFuncType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FuncType2 <em>Func Type2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FuncType2
   * @generated
   */
	public Adapter createFuncType2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FuncType3 <em>Func Type3</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FuncType3
   * @generated
   */
	public Adapter createFuncType3Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxAnnotateCommon <em>Fx Annotate Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxAnnotateCommon
   * @generated
   */
	public Adapter createFxAnnotateCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxClearcolorCommon <em>Fx Clearcolor Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxClearcolorCommon
   * @generated
   */
	public Adapter createFxClearcolorCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxCleardepthCommon <em>Fx Cleardepth Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxCleardepthCommon
   * @generated
   */
	public Adapter createFxCleardepthCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxClearstencilCommon <em>Fx Clearstencil Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxClearstencilCommon
   * @generated
   */
	public Adapter createFxClearstencilCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxCodeProfile <em>Fx Code Profile</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxCodeProfile
   * @generated
   */
	public Adapter createFxCodeProfileAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxColortargetCommon <em>Fx Colortarget Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxColortargetCommon
   * @generated
   */
	public Adapter createFxColortargetCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxDepthtargetCommon <em>Fx Depthtarget Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxDepthtargetCommon
   * @generated
   */
	public Adapter createFxDepthtargetCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxIncludeCommon <em>Fx Include Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxIncludeCommon
   * @generated
   */
	public Adapter createFxIncludeCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxNewparamCommon <em>Fx Newparam Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxNewparamCommon
   * @generated
   */
	public Adapter createFxNewparamCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxSampler1DCommon <em>Fx Sampler1 DCommon</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxSampler1DCommon
   * @generated
   */
	public Adapter createFxSampler1DCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxSampler2DCommon <em>Fx Sampler2 DCommon</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxSampler2DCommon
   * @generated
   */
	public Adapter createFxSampler2DCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxSampler3DCommon <em>Fx Sampler3 DCommon</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxSampler3DCommon
   * @generated
   */
	public Adapter createFxSampler3DCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxSamplerCUBECommon <em>Fx Sampler CUBE Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxSamplerCUBECommon
   * @generated
   */
	public Adapter createFxSamplerCUBECommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxSamplerDEPTHCommon <em>Fx Sampler DEPTH Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxSamplerDEPTHCommon
   * @generated
   */
	public Adapter createFxSamplerDEPTHCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxSamplerRECTCommon <em>Fx Sampler RECT Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxSamplerRECTCommon
   * @generated
   */
	public Adapter createFxSamplerRECTCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxStenciltargetCommon <em>Fx Stenciltarget Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxStenciltargetCommon
   * @generated
   */
	public Adapter createFxStenciltargetCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxSurfaceCommon <em>Fx Surface Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxSurfaceCommon
   * @generated
   */
	public Adapter createFxSurfaceCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxSurfaceFormatHintCommon <em>Fx Surface Format Hint Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxSurfaceFormatHintCommon
   * @generated
   */
	public Adapter createFxSurfaceFormatHintCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxSurfaceInitCubeCommon <em>Fx Surface Init Cube Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxSurfaceInitCubeCommon
   * @generated
   */
	public Adapter createFxSurfaceInitCubeCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxSurfaceInitFromCommon <em>Fx Surface Init From Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxSurfaceInitFromCommon
   * @generated
   */
	public Adapter createFxSurfaceInitFromCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxSurfaceInitPlanarCommon <em>Fx Surface Init Planar Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxSurfaceInitPlanarCommon
   * @generated
   */
	public Adapter createFxSurfaceInitPlanarCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.FxSurfaceInitVolumeCommon <em>Fx Surface Init Volume Common</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.FxSurfaceInitVolumeCommon
   * @generated
   */
	public Adapter createFxSurfaceInitVolumeCommonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GeneratorType <em>Generator Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GeneratorType
   * @generated
   */
	public Adapter createGeneratorTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GeneratorType1 <em>Generator Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GeneratorType1
   * @generated
   */
	public Adapter createGeneratorType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GeometryType <em>Geometry Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GeometryType
   * @generated
   */
	public Adapter createGeometryTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlesNewparam <em>Gles Newparam</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlesNewparam
   * @generated
   */
	public Adapter createGlesNewparamAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlesSamplerState <em>Gles Sampler State</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlesSamplerState
   * @generated
   */
	public Adapter createGlesSamplerStateAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlesTexcombinerArgumentAlphaType <em>Gles Texcombiner Argument Alpha Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlesTexcombinerArgumentAlphaType
   * @generated
   */
	public Adapter createGlesTexcombinerArgumentAlphaTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlesTexcombinerArgumentRGBType <em>Gles Texcombiner Argument RGB Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlesTexcombinerArgumentRGBType
   * @generated
   */
	public Adapter createGlesTexcombinerArgumentRGBTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlesTexcombinerCommandAlphaType <em>Gles Texcombiner Command Alpha Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlesTexcombinerCommandAlphaType
   * @generated
   */
	public Adapter createGlesTexcombinerCommandAlphaTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlesTexcombinerCommandRGBType <em>Gles Texcombiner Command RGB Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlesTexcombinerCommandRGBType
   * @generated
   */
	public Adapter createGlesTexcombinerCommandRGBTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlesTexcombinerCommandType <em>Gles Texcombiner Command Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlesTexcombinerCommandType
   * @generated
   */
	public Adapter createGlesTexcombinerCommandTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlesTexenvCommandType <em>Gles Texenv Command Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlesTexenvCommandType
   * @generated
   */
	public Adapter createGlesTexenvCommandTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlesTextureConstantType <em>Gles Texture Constant Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlesTextureConstantType
   * @generated
   */
	public Adapter createGlesTextureConstantTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlesTexturePipeline <em>Gles Texture Pipeline</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlesTexturePipeline
   * @generated
   */
	public Adapter createGlesTexturePipelineAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlesTextureUnit <em>Gles Texture Unit</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlesTextureUnit
   * @generated
   */
	public Adapter createGlesTextureUnitAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlSampler1D <em>Gl Sampler1 D</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlSampler1D
   * @generated
   */
	public Adapter createGlSampler1DAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlSampler2D <em>Gl Sampler2 D</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlSampler2D
   * @generated
   */
	public Adapter createGlSampler2DAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlSampler3D <em>Gl Sampler3 D</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlSampler3D
   * @generated
   */
	public Adapter createGlSampler3DAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlSamplerCUBE <em>Gl Sampler CUBE</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlSamplerCUBE
   * @generated
   */
	public Adapter createGlSamplerCUBEAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlSamplerDEPTH <em>Gl Sampler DEPTH</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlSamplerDEPTH
   * @generated
   */
	public Adapter createGlSamplerDEPTHAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlSamplerRECT <em>Gl Sampler RECT</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlSamplerRECT
   * @generated
   */
	public Adapter createGlSamplerRECTAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlslNewarrayType <em>Glsl Newarray Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlslNewarrayType
   * @generated
   */
	public Adapter createGlslNewarrayTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlslNewparam <em>Glsl Newparam</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlslNewparam
   * @generated
   */
	public Adapter createGlslNewparamAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlslSetarrayType <em>Glsl Setarray Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlslSetarrayType
   * @generated
   */
	public Adapter createGlslSetarrayTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlslSetparam <em>Glsl Setparam</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlslSetparam
   * @generated
   */
	public Adapter createGlslSetparamAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlslSetparamSimple <em>Glsl Setparam Simple</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlslSetparamSimple
   * @generated
   */
	public Adapter createGlslSetparamSimpleAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.GlslSurfaceType <em>Glsl Surface Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.GlslSurfaceType
   * @generated
   */
	public Adapter createGlslSurfaceTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.HollowType <em>Hollow Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.HollowType
   * @generated
   */
	public Adapter createHollowTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.HollowType1 <em>Hollow Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.HollowType1
   * @generated
   */
	public Adapter createHollowType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.IDREFArrayType <em>IDREF Array Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.IDREFArrayType
   * @generated
   */
	public Adapter createIDREFArrayTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ImagerType <em>Imager Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ImagerType
   * @generated
   */
	public Adapter createImagerTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ImageType <em>Image Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ImageType
   * @generated
   */
	public Adapter createImageTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.InputGlobal <em>Input Global</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.InputGlobal
   * @generated
   */
	public Adapter createInputGlobalAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.InputLocal <em>Input Local</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.InputLocal
   * @generated
   */
	public Adapter createInputLocalAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.InputLocalOffset <em>Input Local Offset</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.InputLocalOffset
   * @generated
   */
	public Adapter createInputLocalOffsetAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.InstanceControllerType <em>Instance Controller Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.InstanceControllerType
   * @generated
   */
	public Adapter createInstanceControllerTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.InstanceEffectType <em>Instance Effect Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.InstanceEffectType
   * @generated
   */
	public Adapter createInstanceEffectTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.InstanceGeometryType <em>Instance Geometry Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.InstanceGeometryType
   * @generated
   */
	public Adapter createInstanceGeometryTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.InstanceMaterialType <em>Instance Material Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.InstanceMaterialType
   * @generated
   */
	public Adapter createInstanceMaterialTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.InstancePhysicsModelType <em>Instance Physics Model Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.InstancePhysicsModelType
   * @generated
   */
	public Adapter createInstancePhysicsModelTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.InstanceRigidBodyType <em>Instance Rigid Body Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.InstanceRigidBodyType
   * @generated
   */
	public Adapter createInstanceRigidBodyTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.InstanceRigidConstraintType <em>Instance Rigid Constraint Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.InstanceRigidConstraintType
   * @generated
   */
	public Adapter createInstanceRigidConstraintTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.InstanceWithExtra <em>Instance With Extra</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.InstanceWithExtra
   * @generated
   */
	public Adapter createInstanceWithExtraAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.IntArrayType <em>Int Array Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.IntArrayType
   * @generated
   */
	public Adapter createIntArrayTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.InterpenetrateType <em>Interpenetrate Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.InterpenetrateType
   * @generated
   */
	public Adapter createInterpenetrateTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.JointsType <em>Joints Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.JointsType
   * @generated
   */
	public Adapter createJointsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LambertType <em>Lambert Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LambertType
   * @generated
   */
	public Adapter createLambertTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LibraryAnimationClipsType <em>Library Animation Clips Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LibraryAnimationClipsType
   * @generated
   */
	public Adapter createLibraryAnimationClipsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LibraryAnimationsType <em>Library Animations Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LibraryAnimationsType
   * @generated
   */
	public Adapter createLibraryAnimationsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LibraryCamerasType <em>Library Cameras Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LibraryCamerasType
   * @generated
   */
	public Adapter createLibraryCamerasTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LibraryControllersType <em>Library Controllers Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LibraryControllersType
   * @generated
   */
	public Adapter createLibraryControllersTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LibraryEffectsType <em>Library Effects Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LibraryEffectsType
   * @generated
   */
	public Adapter createLibraryEffectsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LibraryForceFieldsType <em>Library Force Fields Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LibraryForceFieldsType
   * @generated
   */
	public Adapter createLibraryForceFieldsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LibraryGeometriesType <em>Library Geometries Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LibraryGeometriesType
   * @generated
   */
	public Adapter createLibraryGeometriesTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LibraryImagesType <em>Library Images Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LibraryImagesType
   * @generated
   */
	public Adapter createLibraryImagesTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LibraryLightsType <em>Library Lights Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LibraryLightsType
   * @generated
   */
	public Adapter createLibraryLightsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LibraryMaterialsType <em>Library Materials Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LibraryMaterialsType
   * @generated
   */
	public Adapter createLibraryMaterialsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LibraryNodesType <em>Library Nodes Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LibraryNodesType
   * @generated
   */
	public Adapter createLibraryNodesTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LibraryPhysicsMaterialsType <em>Library Physics Materials Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LibraryPhysicsMaterialsType
   * @generated
   */
	public Adapter createLibraryPhysicsMaterialsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LibraryPhysicsModelsType <em>Library Physics Models Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LibraryPhysicsModelsType
   * @generated
   */
	public Adapter createLibraryPhysicsModelsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LibraryPhysicsScenesType <em>Library Physics Scenes Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LibraryPhysicsScenesType
   * @generated
   */
	public Adapter createLibraryPhysicsScenesTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LibraryVisualScenesType <em>Library Visual Scenes Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LibraryVisualScenesType
   * @generated
   */
	public Adapter createLibraryVisualScenesTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightAmbientType <em>Light Ambient Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightAmbientType
   * @generated
   */
	public Adapter createLightAmbientTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightAmbientType1 <em>Light Ambient Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightAmbientType1
   * @generated
   */
	public Adapter createLightAmbientType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightConstantAttenuationType <em>Light Constant Attenuation Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightConstantAttenuationType
   * @generated
   */
	public Adapter createLightConstantAttenuationTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightConstantAttenuationType1 <em>Light Constant Attenuation Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightConstantAttenuationType1
   * @generated
   */
	public Adapter createLightConstantAttenuationType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightDiffuseType <em>Light Diffuse Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightDiffuseType
   * @generated
   */
	public Adapter createLightDiffuseTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightDiffuseType1 <em>Light Diffuse Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightDiffuseType1
   * @generated
   */
	public Adapter createLightDiffuseType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightEnableType <em>Light Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightEnableType
   * @generated
   */
	public Adapter createLightEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightEnableType1 <em>Light Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightEnableType1
   * @generated
   */
	public Adapter createLightEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightingEnableType <em>Lighting Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightingEnableType
   * @generated
   */
	public Adapter createLightingEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightingEnableType1 <em>Lighting Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightingEnableType1
   * @generated
   */
	public Adapter createLightingEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightLinearAttenuationType <em>Light Linear Attenuation Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightLinearAttenuationType
   * @generated
   */
	public Adapter createLightLinearAttenuationTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightLinearAttenutationType <em>Light Linear Attenutation Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightLinearAttenutationType
   * @generated
   */
	public Adapter createLightLinearAttenutationTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightModelAmbientType <em>Light Model Ambient Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightModelAmbientType
   * @generated
   */
	public Adapter createLightModelAmbientTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightModelAmbientType1 <em>Light Model Ambient Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightModelAmbientType1
   * @generated
   */
	public Adapter createLightModelAmbientType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightModelColorControlType <em>Light Model Color Control Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightModelColorControlType
   * @generated
   */
	public Adapter createLightModelColorControlTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightModelLocalViewerEnableType <em>Light Model Local Viewer Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightModelLocalViewerEnableType
   * @generated
   */
	public Adapter createLightModelLocalViewerEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightModelTwoSideEnableType <em>Light Model Two Side Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightModelTwoSideEnableType
   * @generated
   */
	public Adapter createLightModelTwoSideEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightModelTwoSideEnableType1 <em>Light Model Two Side Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightModelTwoSideEnableType1
   * @generated
   */
	public Adapter createLightModelTwoSideEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightPositionType <em>Light Position Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightPositionType
   * @generated
   */
	public Adapter createLightPositionTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightPositionType1 <em>Light Position Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightPositionType1
   * @generated
   */
	public Adapter createLightPositionType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightQuadraticAttenuationType <em>Light Quadratic Attenuation Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightQuadraticAttenuationType
   * @generated
   */
	public Adapter createLightQuadraticAttenuationTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightQuadraticAttenuationType1 <em>Light Quadratic Attenuation Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightQuadraticAttenuationType1
   * @generated
   */
	public Adapter createLightQuadraticAttenuationType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightSpecularType <em>Light Specular Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightSpecularType
   * @generated
   */
	public Adapter createLightSpecularTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightSpecularType1 <em>Light Specular Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightSpecularType1
   * @generated
   */
	public Adapter createLightSpecularType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightSpotCutoffType <em>Light Spot Cutoff Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightSpotCutoffType
   * @generated
   */
	public Adapter createLightSpotCutoffTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightSpotCutoffType1 <em>Light Spot Cutoff Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightSpotCutoffType1
   * @generated
   */
	public Adapter createLightSpotCutoffType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightSpotDirectionType <em>Light Spot Direction Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightSpotDirectionType
   * @generated
   */
	public Adapter createLightSpotDirectionTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightSpotDirectionType1 <em>Light Spot Direction Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightSpotDirectionType1
   * @generated
   */
	public Adapter createLightSpotDirectionType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightSpotExponentType <em>Light Spot Exponent Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightSpotExponentType
   * @generated
   */
	public Adapter createLightSpotExponentTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightSpotExponentType1 <em>Light Spot Exponent Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightSpotExponentType1
   * @generated
   */
	public Adapter createLightSpotExponentType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LightType <em>Light Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LightType
   * @generated
   */
	public Adapter createLightTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LimitsType <em>Limits Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LimitsType
   * @generated
   */
	public Adapter createLimitsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LinearType <em>Linear Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LinearType
   * @generated
   */
	public Adapter createLinearTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LinearType1 <em>Linear Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LinearType1
   * @generated
   */
	public Adapter createLinearType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LineSmoothEnableType <em>Line Smooth Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LineSmoothEnableType
   * @generated
   */
	public Adapter createLineSmoothEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LineSmoothEnableType1 <em>Line Smooth Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LineSmoothEnableType1
   * @generated
   */
	public Adapter createLineSmoothEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LineStippleEnableType <em>Line Stipple Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LineStippleEnableType
   * @generated
   */
	public Adapter createLineStippleEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LineStippleType <em>Line Stipple Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LineStippleType
   * @generated
   */
	public Adapter createLineStippleTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LinestripsType <em>Linestrips Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LinestripsType
   * @generated
   */
	public Adapter createLinestripsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LinesType <em>Lines Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LinesType
   * @generated
   */
	public Adapter createLinesTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LineWidthType <em>Line Width Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LineWidthType
   * @generated
   */
	public Adapter createLineWidthTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LineWidthType1 <em>Line Width Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LineWidthType1
   * @generated
   */
	public Adapter createLineWidthType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LogicOpEnableType <em>Logic Op Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LogicOpEnableType
   * @generated
   */
	public Adapter createLogicOpEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LogicOpType <em>Logic Op Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LogicOpType
   * @generated
   */
	public Adapter createLogicOpTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LogicOpType1 <em>Logic Op Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LogicOpType1
   * @generated
   */
	public Adapter createLogicOpType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.LookatType <em>Lookat Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.LookatType
   * @generated
   */
	public Adapter createLookatTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MaskType <em>Mask Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MaskType
   * @generated
   */
	public Adapter createMaskTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MaskType1 <em>Mask Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MaskType1
   * @generated
   */
	public Adapter createMaskType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MaskType2 <em>Mask Type2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MaskType2
   * @generated
   */
	public Adapter createMaskType2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MaskType3 <em>Mask Type3</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MaskType3
   * @generated
   */
	public Adapter createMaskType3Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MassFrameType <em>Mass Frame Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MassFrameType
   * @generated
   */
	public Adapter createMassFrameTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MassFrameType1 <em>Mass Frame Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MassFrameType1
   * @generated
   */
	public Adapter createMassFrameType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MaterialAmbientType <em>Material Ambient Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MaterialAmbientType
   * @generated
   */
	public Adapter createMaterialAmbientTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MaterialAmbientType1 <em>Material Ambient Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MaterialAmbientType1
   * @generated
   */
	public Adapter createMaterialAmbientType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MaterialDiffuseType <em>Material Diffuse Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MaterialDiffuseType
   * @generated
   */
	public Adapter createMaterialDiffuseTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MaterialDiffuseType1 <em>Material Diffuse Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MaterialDiffuseType1
   * @generated
   */
	public Adapter createMaterialDiffuseType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MaterialEmissionType <em>Material Emission Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MaterialEmissionType
   * @generated
   */
	public Adapter createMaterialEmissionTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MaterialEmissionType1 <em>Material Emission Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MaterialEmissionType1
   * @generated
   */
	public Adapter createMaterialEmissionType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MaterialShininessType <em>Material Shininess Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MaterialShininessType
   * @generated
   */
	public Adapter createMaterialShininessTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MaterialShininessType1 <em>Material Shininess Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MaterialShininessType1
   * @generated
   */
	public Adapter createMaterialShininessType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MaterialSpecularType <em>Material Specular Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MaterialSpecularType
   * @generated
   */
	public Adapter createMaterialSpecularTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MaterialSpecularType1 <em>Material Specular Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MaterialSpecularType1
   * @generated
   */
	public Adapter createMaterialSpecularType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MaterialType <em>Material Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MaterialType
   * @generated
   */
	public Adapter createMaterialTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MatrixType <em>Matrix Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MatrixType
   * @generated
   */
	public Adapter createMatrixTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MeshType <em>Mesh Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MeshType
   * @generated
   */
	public Adapter createMeshTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ModelViewMatrixType <em>Model View Matrix Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ModelViewMatrixType
   * @generated
   */
	public Adapter createModelViewMatrixTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ModelViewMatrixType1 <em>Model View Matrix Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ModelViewMatrixType1
   * @generated
   */
	public Adapter createModelViewMatrixType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ModeType <em>Mode Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ModeType
   * @generated
   */
	public Adapter createModeTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ModeType1 <em>Mode Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ModeType1
   * @generated
   */
	public Adapter createModeType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MorphType <em>Morph Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MorphType
   * @generated
   */
	public Adapter createMorphTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MultisampleEnableType <em>Multisample Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MultisampleEnableType
   * @generated
   */
	public Adapter createMultisampleEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.MultisampleEnableType1 <em>Multisample Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.MultisampleEnableType1
   * @generated
   */
	public Adapter createMultisampleEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.NameArrayType <em>Name Array Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.NameArrayType
   * @generated
   */
	public Adapter createNameArrayTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.NameType <em>Name Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.NameType
   * @generated
   */
	public Adapter createNameTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.NameType1 <em>Name Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.NameType1
   * @generated
   */
	public Adapter createNameType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.NameType2 <em>Name Type2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.NameType2
   * @generated
   */
	public Adapter createNameType2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.NameType3 <em>Name Type3</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.NameType3
   * @generated
   */
	public Adapter createNameType3Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.NodeType1 <em>Node Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.NodeType1
   * @generated
   */
	public Adapter createNodeType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.NormalizeEnableType <em>Normalize Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.NormalizeEnableType
   * @generated
   */
	public Adapter createNormalizeEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.NormalizeEnableType1 <em>Normalize Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.NormalizeEnableType1
   * @generated
   */
	public Adapter createNormalizeEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.OpticsType <em>Optics Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.OpticsType
   * @generated
   */
	public Adapter createOpticsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.OrthographicType <em>Orthographic Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.OrthographicType
   * @generated
   */
	public Adapter createOrthographicTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ParamType <em>Param Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ParamType
   * @generated
   */
	public Adapter createParamTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ParamType1 <em>Param Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ParamType1
   * @generated
   */
	public Adapter createParamType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ParamType2 <em>Param Type2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ParamType2
   * @generated
   */
	public Adapter createParamType2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ParamType3 <em>Param Type3</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ParamType3
   * @generated
   */
	public Adapter createParamType3Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ParamType4 <em>Param Type4</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ParamType4
   * @generated
   */
	public Adapter createParamType4Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PassType <em>Pass Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PassType
   * @generated
   */
	public Adapter createPassTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PassType1 <em>Pass Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PassType1
   * @generated
   */
	public Adapter createPassType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PassType2 <em>Pass Type2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PassType2
   * @generated
   */
	public Adapter createPassType2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PerspectiveType <em>Perspective Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PerspectiveType
   * @generated
   */
	public Adapter createPerspectiveTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PhongType <em>Phong Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PhongType
   * @generated
   */
	public Adapter createPhongTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PhType <em>Ph Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PhType
   * @generated
   */
	public Adapter createPhTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PhysicsMaterialType <em>Physics Material Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PhysicsMaterialType
   * @generated
   */
	public Adapter createPhysicsMaterialTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PhysicsModelType <em>Physics Model Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PhysicsModelType
   * @generated
   */
	public Adapter createPhysicsModelTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PhysicsSceneType <em>Physics Scene Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PhysicsSceneType
   * @generated
   */
	public Adapter createPhysicsSceneTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PlaneType <em>Plane Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PlaneType
   * @generated
   */
	public Adapter createPlaneTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PointDistanceAttenuationType <em>Point Distance Attenuation Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PointDistanceAttenuationType
   * @generated
   */
	public Adapter createPointDistanceAttenuationTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PointDistanceAttenuationType1 <em>Point Distance Attenuation Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PointDistanceAttenuationType1
   * @generated
   */
	public Adapter createPointDistanceAttenuationType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PointFadeThresholdSizeType <em>Point Fade Threshold Size Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PointFadeThresholdSizeType
   * @generated
   */
	public Adapter createPointFadeThresholdSizeTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PointFadeThresholdSizeType1 <em>Point Fade Threshold Size Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PointFadeThresholdSizeType1
   * @generated
   */
	public Adapter createPointFadeThresholdSizeType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PointSizeMaxType <em>Point Size Max Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PointSizeMaxType
   * @generated
   */
	public Adapter createPointSizeMaxTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PointSizeMaxType1 <em>Point Size Max Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PointSizeMaxType1
   * @generated
   */
	public Adapter createPointSizeMaxType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PointSizeMinType <em>Point Size Min Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PointSizeMinType
   * @generated
   */
	public Adapter createPointSizeMinTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PointSizeMinType1 <em>Point Size Min Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PointSizeMinType1
   * @generated
   */
	public Adapter createPointSizeMinType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PointSizeType <em>Point Size Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PointSizeType
   * @generated
   */
	public Adapter createPointSizeTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PointSizeType1 <em>Point Size Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PointSizeType1
   * @generated
   */
	public Adapter createPointSizeType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PointSmoothEnableType <em>Point Smooth Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PointSmoothEnableType
   * @generated
   */
	public Adapter createPointSmoothEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PointSmoothEnableType1 <em>Point Smooth Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PointSmoothEnableType1
   * @generated
   */
	public Adapter createPointSmoothEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PointType <em>Point Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PointType
   * @generated
   */
	public Adapter createPointTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PolygonModeType <em>Polygon Mode Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PolygonModeType
   * @generated
   */
	public Adapter createPolygonModeTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PolygonOffsetFillEnableType <em>Polygon Offset Fill Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PolygonOffsetFillEnableType
   * @generated
   */
	public Adapter createPolygonOffsetFillEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PolygonOffsetFillEnableType1 <em>Polygon Offset Fill Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PolygonOffsetFillEnableType1
   * @generated
   */
	public Adapter createPolygonOffsetFillEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PolygonOffsetLineEnableType <em>Polygon Offset Line Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PolygonOffsetLineEnableType
   * @generated
   */
	public Adapter createPolygonOffsetLineEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PolygonOffsetPointEnableType <em>Polygon Offset Point Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PolygonOffsetPointEnableType
   * @generated
   */
	public Adapter createPolygonOffsetPointEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PolygonOffsetType <em>Polygon Offset Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PolygonOffsetType
   * @generated
   */
	public Adapter createPolygonOffsetTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PolygonOffsetType1 <em>Polygon Offset Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PolygonOffsetType1
   * @generated
   */
	public Adapter createPolygonOffsetType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PolygonSmoothEnableType <em>Polygon Smooth Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PolygonSmoothEnableType
   * @generated
   */
	public Adapter createPolygonSmoothEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PolygonStippleEnableType <em>Polygon Stipple Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PolygonStippleEnableType
   * @generated
   */
	public Adapter createPolygonStippleEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PolygonsType <em>Polygons Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PolygonsType
   * @generated
   */
	public Adapter createPolygonsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PolylistType <em>Polylist Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PolylistType
   * @generated
   */
	public Adapter createPolylistTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PrimaryType <em>Primary Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PrimaryType
   * @generated
   */
	public Adapter createPrimaryTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.PrimaryType1 <em>Primary Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.PrimaryType1
   * @generated
   */
	public Adapter createPrimaryType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ProfileCGType <em>Profile CG Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ProfileCGType
   * @generated
   */
	public Adapter createProfileCGTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ProfileCOMMONType <em>Profile COMMON Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ProfileCOMMONType
   * @generated
   */
	public Adapter createProfileCOMMONTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ProfileGLESType <em>Profile GLES Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ProfileGLESType
   * @generated
   */
	public Adapter createProfileGLESTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ProfileGLSLType <em>Profile GLSL Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ProfileGLSLType
   * @generated
   */
	public Adapter createProfileGLSLTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ProjectionMatrixType <em>Projection Matrix Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ProjectionMatrixType
   * @generated
   */
	public Adapter createProjectionMatrixTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ProjectionMatrixType1 <em>Projection Matrix Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ProjectionMatrixType1
   * @generated
   */
	public Adapter createProjectionMatrixType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.RefAttachmentType <em>Ref Attachment Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.RefAttachmentType
   * @generated
   */
	public Adapter createRefAttachmentTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.RefType <em>Ref Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.RefType
   * @generated
   */
	public Adapter createRefTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.RefType1 <em>Ref Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.RefType1
   * @generated
   */
	public Adapter createRefType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.RefType2 <em>Ref Type2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.RefType2
   * @generated
   */
	public Adapter createRefType2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.RenderType <em>Render Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.RenderType
   * @generated
   */
	public Adapter createRenderTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.RescaleNormalEnableType <em>Rescale Normal Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.RescaleNormalEnableType
   * @generated
   */
	public Adapter createRescaleNormalEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.RescaleNormalEnableType1 <em>Rescale Normal Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.RescaleNormalEnableType1
   * @generated
   */
	public Adapter createRescaleNormalEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.RgbType <em>Rgb Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.RgbType
   * @generated
   */
	public Adapter createRgbTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.RigidBodyType <em>Rigid Body Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.RigidBodyType
   * @generated
   */
	public Adapter createRigidBodyTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.RigidConstraintType <em>Rigid Constraint Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.RigidConstraintType
   * @generated
   */
	public Adapter createRigidConstraintTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.RotateType <em>Rotate Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.RotateType
   * @generated
   */
	public Adapter createRotateTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SampleAlphaToCoverageEnableType <em>Sample Alpha To Coverage Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SampleAlphaToCoverageEnableType
   * @generated
   */
	public Adapter createSampleAlphaToCoverageEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SampleAlphaToCoverageEnableType1 <em>Sample Alpha To Coverage Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SampleAlphaToCoverageEnableType1
   * @generated
   */
	public Adapter createSampleAlphaToCoverageEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SampleAlphaToOneEnableType <em>Sample Alpha To One Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SampleAlphaToOneEnableType
   * @generated
   */
	public Adapter createSampleAlphaToOneEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SampleAlphaToOneEnableType1 <em>Sample Alpha To One Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SampleAlphaToOneEnableType1
   * @generated
   */
	public Adapter createSampleAlphaToOneEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SampleCoverageEnableType <em>Sample Coverage Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SampleCoverageEnableType
   * @generated
   */
	public Adapter createSampleCoverageEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SampleCoverageEnableType1 <em>Sample Coverage Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SampleCoverageEnableType1
   * @generated
   */
	public Adapter createSampleCoverageEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SamplerType <em>Sampler Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SamplerType
   * @generated
   */
	public Adapter createSamplerTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SceneType <em>Scene Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SceneType
   * @generated
   */
	public Adapter createSceneTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ScissorTestEnableType <em>Scissor Test Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ScissorTestEnableType
   * @generated
   */
	public Adapter createScissorTestEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ScissorTestEnableType1 <em>Scissor Test Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ScissorTestEnableType1
   * @generated
   */
	public Adapter createScissorTestEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ScissorType <em>Scissor Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ScissorType
   * @generated
   */
	public Adapter createScissorTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ScissorType1 <em>Scissor Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ScissorType1
   * @generated
   */
	public Adapter createScissorType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SetparamType <em>Setparam Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SetparamType
   * @generated
   */
	public Adapter createSetparamTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SetparamType1 <em>Setparam Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SetparamType1
   * @generated
   */
	public Adapter createSetparamType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ShadeModelType <em>Shade Model Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ShadeModelType
   * @generated
   */
	public Adapter createShadeModelTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ShadeModelType1 <em>Shade Model Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ShadeModelType1
   * @generated
   */
	public Adapter createShadeModelType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ShaderType <em>Shader Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ShaderType
   * @generated
   */
	public Adapter createShaderTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ShaderType1 <em>Shader Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ShaderType1
   * @generated
   */
	public Adapter createShaderType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ShapeType <em>Shape Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ShapeType
   * @generated
   */
	public Adapter createShapeTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ShapeType1 <em>Shape Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ShapeType1
   * @generated
   */
	public Adapter createShapeType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SkewType <em>Skew Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SkewType
   * @generated
   */
	public Adapter createSkewTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SkinType <em>Skin Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SkinType
   * @generated
   */
	public Adapter createSkinTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SourceType <em>Source Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SourceType
   * @generated
   */
	public Adapter createSourceTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SphereType <em>Sphere Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SphereType
   * @generated
   */
	public Adapter createSphereTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SplineType <em>Spline Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SplineType
   * @generated
   */
	public Adapter createSplineTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SpotType <em>Spot Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SpotType
   * @generated
   */
	public Adapter createSpotTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SpringType1 <em>Spring Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SpringType1
   * @generated
   */
	public Adapter createSpringType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SrcAlphaType <em>Src Alpha Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SrcAlphaType
   * @generated
   */
	public Adapter createSrcAlphaTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SrcRgbType <em>Src Rgb Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SrcRgbType
   * @generated
   */
	public Adapter createSrcRgbTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SrcType <em>Src Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SrcType
   * @generated
   */
	public Adapter createSrcTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SrcType1 <em>Src Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SrcType1
   * @generated
   */
	public Adapter createSrcType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.StencilFuncSeparateType <em>Stencil Func Separate Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.StencilFuncSeparateType
   * @generated
   */
	public Adapter createStencilFuncSeparateTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.StencilFuncType <em>Stencil Func Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.StencilFuncType
   * @generated
   */
	public Adapter createStencilFuncTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.StencilFuncType1 <em>Stencil Func Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.StencilFuncType1
   * @generated
   */
	public Adapter createStencilFuncType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.StencilMaskSeparateType <em>Stencil Mask Separate Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.StencilMaskSeparateType
   * @generated
   */
	public Adapter createStencilMaskSeparateTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.StencilMaskType <em>Stencil Mask Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.StencilMaskType
   * @generated
   */
	public Adapter createStencilMaskTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.StencilMaskType1 <em>Stencil Mask Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.StencilMaskType1
   * @generated
   */
	public Adapter createStencilMaskType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.StencilOpSeparateType <em>Stencil Op Separate Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.StencilOpSeparateType
   * @generated
   */
	public Adapter createStencilOpSeparateTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.StencilOpType <em>Stencil Op Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.StencilOpType
   * @generated
   */
	public Adapter createStencilOpTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.StencilOpType1 <em>Stencil Op Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.StencilOpType1
   * @generated
   */
	public Adapter createStencilOpType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.StencilTestEnableType <em>Stencil Test Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.StencilTestEnableType
   * @generated
   */
	public Adapter createStencilTestEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.StencilTestEnableType1 <em>Stencil Test Enable Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.StencilTestEnableType1
   * @generated
   */
	public Adapter createStencilTestEnableType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.SwingConeAndTwistType <em>Swing Cone And Twist Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.SwingConeAndTwistType
   * @generated
   */
	public Adapter createSwingConeAndTwistTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TaperedCapsuleType <em>Tapered Capsule Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TaperedCapsuleType
   * @generated
   */
	public Adapter createTaperedCapsuleTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TaperedCylinderType <em>Tapered Cylinder Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TaperedCylinderType
   * @generated
   */
	public Adapter createTaperedCylinderTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TargetableFloat <em>Targetable Float</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TargetableFloat
   * @generated
   */
	public Adapter createTargetableFloatAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TargetableFloat3 <em>Targetable Float3</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TargetableFloat3
   * @generated
   */
	public Adapter createTargetableFloat3Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TargetsType <em>Targets Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TargetsType
   * @generated
   */
	public Adapter createTargetsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TechniqueCommonType <em>Technique Common Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TechniqueCommonType
   * @generated
   */
	public Adapter createTechniqueCommonTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TechniqueCommonType1 <em>Technique Common Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TechniqueCommonType1
   * @generated
   */
	public Adapter createTechniqueCommonType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TechniqueCommonType2 <em>Technique Common Type2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TechniqueCommonType2
   * @generated
   */
	public Adapter createTechniqueCommonType2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TechniqueCommonType3 <em>Technique Common Type3</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TechniqueCommonType3
   * @generated
   */
	public Adapter createTechniqueCommonType3Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TechniqueCommonType4 <em>Technique Common Type4</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TechniqueCommonType4
   * @generated
   */
	public Adapter createTechniqueCommonType4Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TechniqueCommonType5 <em>Technique Common Type5</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TechniqueCommonType5
   * @generated
   */
	public Adapter createTechniqueCommonType5Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TechniqueCommonType6 <em>Technique Common Type6</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TechniqueCommonType6
   * @generated
   */
	public Adapter createTechniqueCommonType6Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TechniqueCommonType7 <em>Technique Common Type7</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TechniqueCommonType7
   * @generated
   */
	public Adapter createTechniqueCommonType7Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TechniqueCommonType8 <em>Technique Common Type8</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TechniqueCommonType8
   * @generated
   */
	public Adapter createTechniqueCommonType8Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TechniqueHintType <em>Technique Hint Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TechniqueHintType
   * @generated
   */
	public Adapter createTechniqueHintTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TechniqueType <em>Technique Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TechniqueType
   * @generated
   */
	public Adapter createTechniqueTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TechniqueType1 <em>Technique Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TechniqueType1
   * @generated
   */
	public Adapter createTechniqueType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TechniqueType2 <em>Technique Type2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TechniqueType2
   * @generated
   */
	public Adapter createTechniqueType2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TechniqueType3 <em>Technique Type3</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TechniqueType3
   * @generated
   */
	public Adapter createTechniqueType3Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TechniqueType4 <em>Technique Type4</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TechniqueType4
   * @generated
   */
	public Adapter createTechniqueType4Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TexcoordType <em>Texcoord Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TexcoordType
   * @generated
   */
	public Adapter createTexcoordTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.Texture1DEnableType <em>Texture1 DEnable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.Texture1DEnableType
   * @generated
   */
	public Adapter createTexture1DEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.Texture1DType <em>Texture1 DType</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.Texture1DType
   * @generated
   */
	public Adapter createTexture1DTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.Texture2DEnableType <em>Texture2 DEnable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.Texture2DEnableType
   * @generated
   */
	public Adapter createTexture2DEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.Texture2DType <em>Texture2 DType</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.Texture2DType
   * @generated
   */
	public Adapter createTexture2DTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.Texture3DEnableType <em>Texture3 DEnable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.Texture3DEnableType
   * @generated
   */
	public Adapter createTexture3DEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.Texture3DType <em>Texture3 DType</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.Texture3DType
   * @generated
   */
	public Adapter createTexture3DTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TextureCUBEEnableType <em>Texture CUBE Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TextureCUBEEnableType
   * @generated
   */
	public Adapter createTextureCUBEEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TextureCUBEType <em>Texture CUBE Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TextureCUBEType
   * @generated
   */
	public Adapter createTextureCUBETypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TextureDEPTHEnableType <em>Texture DEPTH Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TextureDEPTHEnableType
   * @generated
   */
	public Adapter createTextureDEPTHEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TextureDEPTHType <em>Texture DEPTH Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TextureDEPTHType
   * @generated
   */
	public Adapter createTextureDEPTHTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TextureEnvColorType <em>Texture Env Color Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TextureEnvColorType
   * @generated
   */
	public Adapter createTextureEnvColorTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TextureEnvModeType <em>Texture Env Mode Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TextureEnvModeType
   * @generated
   */
	public Adapter createTextureEnvModeTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TexturePipelineEnableType <em>Texture Pipeline Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TexturePipelineEnableType
   * @generated
   */
	public Adapter createTexturePipelineEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TexturePipelineType <em>Texture Pipeline Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TexturePipelineType
   * @generated
   */
	public Adapter createTexturePipelineTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TextureRECTEnableType <em>Texture RECT Enable Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TextureRECTEnableType
   * @generated
   */
	public Adapter createTextureRECTEnableTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TextureRECTType <em>Texture RECT Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TextureRECTType
   * @generated
   */
	public Adapter createTextureRECTTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TextureType <em>Texture Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TextureType
   * @generated
   */
	public Adapter createTextureTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TrianglesType <em>Triangles Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TrianglesType
   * @generated
   */
	public Adapter createTrianglesTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TrifansType <em>Trifans Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TrifansType
   * @generated
   */
	public Adapter createTrifansTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.TristripsType <em>Tristrips Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.TristripsType
   * @generated
   */
	public Adapter createTristripsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.UnitType <em>Unit Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.UnitType
   * @generated
   */
	public Adapter createUnitTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ValueType
   * @generated
   */
	public Adapter createValueTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ValueType1 <em>Value Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ValueType1
   * @generated
   */
	public Adapter createValueType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.VertexWeightsType <em>Vertex Weights Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.VertexWeightsType
   * @generated
   */
	public Adapter createVertexWeightsTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.VerticesType <em>Vertices Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.VerticesType
   * @generated
   */
	public Adapter createVerticesTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.VisualSceneType <em>Visual Scene Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.VisualSceneType
   * @generated
   */
	public Adapter createVisualSceneTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ZfailType <em>Zfail Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ZfailType
   * @generated
   */
	public Adapter createZfailTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ZfailType1 <em>Zfail Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ZfailType1
   * @generated
   */
	public Adapter createZfailType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ZfailType2 <em>Zfail Type2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ZfailType2
   * @generated
   */
	public Adapter createZfailType2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ZpassType <em>Zpass Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ZpassType
   * @generated
   */
	public Adapter createZpassTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ZpassType1 <em>Zpass Type1</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ZpassType1
   * @generated
   */
	public Adapter createZpassType1Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.khronos.collada.ZpassType2 <em>Zpass Type2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.khronos.collada.ZpassType2
   * @generated
   */
	public Adapter createZpassType2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
	public Adapter createEObjectAdapter() {
    return null;
  }

} //ColladaAdapterFactory
