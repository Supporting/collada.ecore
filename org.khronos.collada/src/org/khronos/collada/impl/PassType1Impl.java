/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.AlphaFuncType;
import org.khronos.collada.AlphaTestEnableType;
import org.khronos.collada.BlendEnableType;
import org.khronos.collada.BlendFuncType;
import org.khronos.collada.ClearColorType;
import org.khronos.collada.ClearDepthType;
import org.khronos.collada.ClearStencilType;
import org.khronos.collada.ClipPlaneEnableType;
import org.khronos.collada.ClipPlaneType;
import org.khronos.collada.AlphaFuncType1;
import org.khronos.collada.AlphaTestEnableType1;
import org.khronos.collada.AutoNormalEnableType;
import org.khronos.collada.BlendColorType;
import org.khronos.collada.BlendEnableType1;
import org.khronos.collada.BlendEquationSeparateType;
import org.khronos.collada.BlendEquationType;
import org.khronos.collada.BlendFuncSeparateType;
import org.khronos.collada.BlendFuncType1;
import org.khronos.collada.ClearColorType1;
import org.khronos.collada.ClearDepthType1;
import org.khronos.collada.ClearStencilType1;
import org.khronos.collada.ClipPlaneEnableType1;
import org.khronos.collada.ClipPlaneType1;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ColorLogicOpEnableType;
import org.khronos.collada.ColorMaskType;
import org.khronos.collada.ColorMaterialEnableType;
import org.khronos.collada.CullFaceEnableType;
import org.khronos.collada.CullFaceType;
import org.khronos.collada.DepthFuncType;
import org.khronos.collada.DepthMaskType;
import org.khronos.collada.DepthRangeType;
import org.khronos.collada.DepthTestEnableType;
import org.khronos.collada.DitherEnableType;
import org.khronos.collada.ColorLogicOpEnableType1;
import org.khronos.collada.ColorMaskType1;
import org.khronos.collada.ColorMaterialEnableType1;
import org.khronos.collada.ColorMaterialType;
import org.khronos.collada.CullFaceEnableType1;
import org.khronos.collada.CullFaceType1;
import org.khronos.collada.DepthBoundsEnableType;
import org.khronos.collada.DepthBoundsType;
import org.khronos.collada.DepthClampEnableType;
import org.khronos.collada.DepthFuncType1;
import org.khronos.collada.DepthMaskType1;
import org.khronos.collada.DepthRangeType1;
import org.khronos.collada.DepthTestEnableType1;
import org.khronos.collada.DitherEnableType1;
import org.khronos.collada.ExtraType;
import org.khronos.collada.FogColorType;
import org.khronos.collada.FogDensityType;
import org.khronos.collada.FogEnableType;
import org.khronos.collada.FogEndType;
import org.khronos.collada.FogModeType;
import org.khronos.collada.FogStartType;
import org.khronos.collada.FrontFaceType;
import org.khronos.collada.FogColorType1;
import org.khronos.collada.FogCoordSrcType;
import org.khronos.collada.FogDensityType1;
import org.khronos.collada.FogEnableType1;
import org.khronos.collada.FogEndType1;
import org.khronos.collada.FogModeType1;
import org.khronos.collada.FogStartType1;
import org.khronos.collada.FrontFaceType1;
import org.khronos.collada.FxAnnotateCommon;
import org.khronos.collada.LightAmbientType;
import org.khronos.collada.LightConstantAttenuationType;
import org.khronos.collada.LightDiffuseType;
import org.khronos.collada.LightEnableType;
import org.khronos.collada.LightLinearAttenutationType;
import org.khronos.collada.LightModelAmbientType;
import org.khronos.collada.LightModelTwoSideEnableType;
import org.khronos.collada.LightPositionType;
import org.khronos.collada.LightQuadraticAttenuationType;
import org.khronos.collada.LightSpecularType;
import org.khronos.collada.LightSpotCutoffType;
import org.khronos.collada.LightSpotDirectionType;
import org.khronos.collada.LightSpotExponentType;
import org.khronos.collada.LightingEnableType;
import org.khronos.collada.LineSmoothEnableType;
import org.khronos.collada.LineWidthType;
import org.khronos.collada.LogicOpType;
import org.khronos.collada.MaterialAmbientType;
import org.khronos.collada.MaterialDiffuseType;
import org.khronos.collada.MaterialEmissionType;
import org.khronos.collada.MaterialShininessType;
import org.khronos.collada.MaterialSpecularType;
import org.khronos.collada.ModelViewMatrixType;
import org.khronos.collada.MultisampleEnableType;
import org.khronos.collada.NormalizeEnableType;
import org.khronos.collada.FxClearcolorCommon;
import org.khronos.collada.FxCleardepthCommon;
import org.khronos.collada.FxClearstencilCommon;
import org.khronos.collada.FxColortargetCommon;
import org.khronos.collada.FxDepthtargetCommon;
import org.khronos.collada.FxStenciltargetCommon;
import org.khronos.collada.LightAmbientType1;
import org.khronos.collada.LightConstantAttenuationType1;
import org.khronos.collada.LightDiffuseType1;
import org.khronos.collada.LightEnableType1;
import org.khronos.collada.LightLinearAttenuationType;
import org.khronos.collada.LightModelAmbientType1;
import org.khronos.collada.LightModelColorControlType;
import org.khronos.collada.LightModelLocalViewerEnableType;
import org.khronos.collada.LightModelTwoSideEnableType1;
import org.khronos.collada.LightPositionType1;
import org.khronos.collada.LightQuadraticAttenuationType1;
import org.khronos.collada.LightSpecularType1;
import org.khronos.collada.LightSpotCutoffType1;
import org.khronos.collada.LightSpotDirectionType1;
import org.khronos.collada.LightSpotExponentType1;
import org.khronos.collada.LightingEnableType1;
import org.khronos.collada.LineSmoothEnableType1;
import org.khronos.collada.LineStippleEnableType;
import org.khronos.collada.LineStippleType;
import org.khronos.collada.LineWidthType1;
import org.khronos.collada.LogicOpEnableType;
import org.khronos.collada.LogicOpType1;
import org.khronos.collada.MaterialAmbientType1;
import org.khronos.collada.MaterialDiffuseType1;
import org.khronos.collada.MaterialEmissionType1;
import org.khronos.collada.MaterialShininessType1;
import org.khronos.collada.MaterialSpecularType1;
import org.khronos.collada.ModelViewMatrixType1;
import org.khronos.collada.MultisampleEnableType1;
import org.khronos.collada.NormalizeEnableType1;
import org.khronos.collada.PassType1;
import org.khronos.collada.PointDistanceAttenuationType;
import org.khronos.collada.PointFadeThresholdSizeType;
import org.khronos.collada.PointSizeMaxType;
import org.khronos.collada.PointSizeMinType;
import org.khronos.collada.PointSizeType;
import org.khronos.collada.PointSmoothEnableType;
import org.khronos.collada.PolygonOffsetFillEnableType;
import org.khronos.collada.PolygonOffsetType;
import org.khronos.collada.ProjectionMatrixType;
import org.khronos.collada.RescaleNormalEnableType;
import org.khronos.collada.SampleAlphaToCoverageEnableType;
import org.khronos.collada.SampleAlphaToOneEnableType;
import org.khronos.collada.SampleCoverageEnableType;
import org.khronos.collada.ScissorTestEnableType;
import org.khronos.collada.ScissorType;
import org.khronos.collada.ShadeModelType;
import org.khronos.collada.StencilFuncType;
import org.khronos.collada.StencilMaskType;
import org.khronos.collada.StencilOpType;
import org.khronos.collada.StencilTestEnableType;
import org.khronos.collada.TexturePipelineEnableType;
import org.khronos.collada.TexturePipelineType;
import org.khronos.collada.PointDistanceAttenuationType1;
import org.khronos.collada.PointFadeThresholdSizeType1;
import org.khronos.collada.PointSizeMaxType1;
import org.khronos.collada.PointSizeMinType1;
import org.khronos.collada.PointSizeType1;
import org.khronos.collada.PointSmoothEnableType1;
import org.khronos.collada.PolygonModeType;
import org.khronos.collada.PolygonOffsetFillEnableType1;
import org.khronos.collada.PolygonOffsetLineEnableType;
import org.khronos.collada.PolygonOffsetPointEnableType;
import org.khronos.collada.PolygonOffsetType1;
import org.khronos.collada.PolygonSmoothEnableType;
import org.khronos.collada.PolygonStippleEnableType;
import org.khronos.collada.ProjectionMatrixType1;
import org.khronos.collada.RescaleNormalEnableType1;
import org.khronos.collada.SampleAlphaToCoverageEnableType1;
import org.khronos.collada.SampleAlphaToOneEnableType1;
import org.khronos.collada.SampleCoverageEnableType1;
import org.khronos.collada.ScissorTestEnableType1;
import org.khronos.collada.ScissorType1;
import org.khronos.collada.ShadeModelType1;
import org.khronos.collada.ShaderType;
import org.khronos.collada.StencilFuncSeparateType;
import org.khronos.collada.StencilFuncType1;
import org.khronos.collada.StencilMaskSeparateType;
import org.khronos.collada.StencilMaskType1;
import org.khronos.collada.StencilOpSeparateType;
import org.khronos.collada.StencilOpType1;
import org.khronos.collada.StencilTestEnableType1;
import org.khronos.collada.Texture1DEnableType;
import org.khronos.collada.Texture1DType;
import org.khronos.collada.Texture2DEnableType;
import org.khronos.collada.Texture2DType;
import org.khronos.collada.Texture3DEnableType;
import org.khronos.collada.Texture3DType;
import org.khronos.collada.TextureCUBEEnableType;
import org.khronos.collada.TextureCUBEType;
import org.khronos.collada.TextureDEPTHEnableType;
import org.khronos.collada.TextureDEPTHType;
import org.khronos.collada.TextureEnvColorType;
import org.khronos.collada.TextureEnvModeType;
import org.khronos.collada.TextureRECTEnableType;
import org.khronos.collada.TextureRECTType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pass Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getColorTarget <em>Color Target</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getDepthTarget <em>Depth Target</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getStencilTarget <em>Stencil Target</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getColorClear <em>Color Clear</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getDepthClear <em>Depth Clear</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getStencilClear <em>Stencil Clear</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getDraw <em>Draw</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getAlphaFunc <em>Alpha Func</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getBlendFunc <em>Blend Func</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getBlendFuncSeparate <em>Blend Func Separate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getBlendEquation <em>Blend Equation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getBlendEquationSeparate <em>Blend Equation Separate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getColorMaterial <em>Color Material</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getCullFace <em>Cull Face</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getDepthFunc <em>Depth Func</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getFogMode <em>Fog Mode</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getFogCoordSrc <em>Fog Coord Src</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getFrontFace <em>Front Face</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightModelColorControl <em>Light Model Color Control</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLogicOp <em>Logic Op</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getPolygonMode <em>Polygon Mode</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getShadeModel <em>Shade Model</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getStencilFunc <em>Stencil Func</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getStencilOp <em>Stencil Op</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getStencilFuncSeparate <em>Stencil Func Separate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getStencilOpSeparate <em>Stencil Op Separate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getStencilMaskSeparate <em>Stencil Mask Separate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightEnable <em>Light Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightAmbient <em>Light Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightDiffuse <em>Light Diffuse</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightSpecular <em>Light Specular</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightPosition <em>Light Position</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightConstantAttenuation <em>Light Constant Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightLinearAttenuation <em>Light Linear Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightQuadraticAttenuation <em>Light Quadratic Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightSpotCutoff <em>Light Spot Cutoff</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightSpotDirection <em>Light Spot Direction</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightSpotExponent <em>Light Spot Exponent</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getTexture1D <em>Texture1 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getTexture2D <em>Texture2 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getTexture3D <em>Texture3 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getTextureCUBE <em>Texture CUBE</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getTextureRECT <em>Texture RECT</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getTextureDEPTH <em>Texture DEPTH</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getTexture1DEnable <em>Texture1 DEnable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getTexture2DEnable <em>Texture2 DEnable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getTexture3DEnable <em>Texture3 DEnable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getTextureCUBEEnable <em>Texture CUBE Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getTextureRECTEnable <em>Texture RECT Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getTextureDEPTHEnable <em>Texture DEPTH Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getTextureEnvColor <em>Texture Env Color</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getTextureEnvMode <em>Texture Env Mode</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getClipPlane <em>Clip Plane</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getClipPlaneEnable <em>Clip Plane Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getBlendColor <em>Blend Color</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getClearColor <em>Clear Color</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getClearStencil <em>Clear Stencil</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getClearDepth <em>Clear Depth</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getColorMask <em>Color Mask</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getDepthBounds <em>Depth Bounds</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getDepthMask <em>Depth Mask</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getDepthRange <em>Depth Range</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getFogDensity <em>Fog Density</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getFogStart <em>Fog Start</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getFogEnd <em>Fog End</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getFogColor <em>Fog Color</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightModelAmbient <em>Light Model Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightingEnable <em>Lighting Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLineStipple <em>Line Stipple</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getMaterialAmbient <em>Material Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getMaterialDiffuse <em>Material Diffuse</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getMaterialEmission <em>Material Emission</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getMaterialShininess <em>Material Shininess</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getMaterialSpecular <em>Material Specular</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getModelViewMatrix <em>Model View Matrix</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getPointDistanceAttenuation <em>Point Distance Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getPointFadeThresholdSize <em>Point Fade Threshold Size</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getPointSize <em>Point Size</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getPointSizeMin <em>Point Size Min</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getPointSizeMax <em>Point Size Max</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getPolygonOffset <em>Polygon Offset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getProjectionMatrix <em>Projection Matrix</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getScissor <em>Scissor</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getStencilMask <em>Stencil Mask</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getAlphaTestEnable <em>Alpha Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getAutoNormalEnable <em>Auto Normal Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getBlendEnable <em>Blend Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getColorLogicOpEnable <em>Color Logic Op Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getColorMaterialEnable <em>Color Material Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getCullFaceEnable <em>Cull Face Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getDepthBoundsEnable <em>Depth Bounds Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getDepthClampEnable <em>Depth Clamp Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getDepthTestEnable <em>Depth Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getDitherEnable <em>Dither Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getFogEnable <em>Fog Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightModelLocalViewerEnable <em>Light Model Local Viewer Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLightModelTwoSideEnable <em>Light Model Two Side Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLineSmoothEnable <em>Line Smooth Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLineStippleEnable <em>Line Stipple Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getLogicOpEnable <em>Logic Op Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getMultisampleEnable <em>Multisample Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getNormalizeEnable <em>Normalize Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getPointSmoothEnable <em>Point Smooth Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getPolygonOffsetFillEnable <em>Polygon Offset Fill Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getPolygonOffsetLineEnable <em>Polygon Offset Line Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getPolygonOffsetPointEnable <em>Polygon Offset Point Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getPolygonSmoothEnable <em>Polygon Smooth Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getPolygonStippleEnable <em>Polygon Stipple Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getRescaleNormalEnable <em>Rescale Normal Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getSampleAlphaToCoverageEnable <em>Sample Alpha To Coverage Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getSampleAlphaToOneEnable <em>Sample Alpha To One Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getSampleCoverageEnable <em>Sample Coverage Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getScissorTestEnable <em>Scissor Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getStencilTestEnable <em>Stencil Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getGlHookAbstractGroup <em>Gl Hook Abstract Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getGlHookAbstract <em>Gl Hook Abstract</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getShader <em>Shader</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassType1Impl#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PassType1Impl extends EObjectImpl implements PassType1 {
	/**
   * The cached value of the '{@link #getAnnotate() <em>Annotate</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnnotate()
   * @generated
   * @ordered
   */
	protected EList<FxAnnotateCommon> annotate;

	/**
   * The cached value of the '{@link #getColorTarget() <em>Color Target</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getColorTarget()
   * @generated
   * @ordered
   */
	protected EList<FxColortargetCommon> colorTarget;

	/**
   * The cached value of the '{@link #getDepthTarget() <em>Depth Target</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDepthTarget()
   * @generated
   * @ordered
   */
	protected EList<FxDepthtargetCommon> depthTarget;

	/**
   * The cached value of the '{@link #getStencilTarget() <em>Stencil Target</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStencilTarget()
   * @generated
   * @ordered
   */
	protected EList<FxStenciltargetCommon> stencilTarget;

	/**
   * The cached value of the '{@link #getColorClear() <em>Color Clear</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getColorClear()
   * @generated
   * @ordered
   */
	protected EList<FxClearcolorCommon> colorClear;

	/**
   * The cached value of the '{@link #getDepthClear() <em>Depth Clear</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDepthClear()
   * @generated
   * @ordered
   */
	protected EList<FxCleardepthCommon> depthClear;

	/**
   * The cached value of the '{@link #getStencilClear() <em>Stencil Clear</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStencilClear()
   * @generated
   * @ordered
   */
	protected EList<FxClearstencilCommon> stencilClear;

	/**
   * The default value of the '{@link #getDraw() <em>Draw</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDraw()
   * @generated
   * @ordered
   */
	protected static final String DRAW_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getDraw() <em>Draw</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDraw()
   * @generated
   * @ordered
   */
	protected String draw = DRAW_EDEFAULT;

	/**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
	protected FeatureMap group;

	/**
   * The cached value of the '{@link #getExtra() <em>Extra</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getExtra()
   * @generated
   * @ordered
   */
	protected EList<ExtraType> extra;

	/**
   * The default value of the '{@link #getSid() <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSid()
   * @generated
   * @ordered
   */
	protected static final String SID_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSid() <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSid()
   * @generated
   * @ordered
   */
	protected String sid = SID_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PassType1Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getPassType1();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxAnnotateCommon> getAnnotate() {
    if (annotate == null)
    {
      annotate = new EObjectContainmentEList<FxAnnotateCommon>(FxAnnotateCommon.class, this, ColladaPackage.PASS_TYPE1__ANNOTATE);
    }
    return annotate;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxColortargetCommon> getColorTarget() {
    if (colorTarget == null)
    {
      colorTarget = new EObjectContainmentEList<FxColortargetCommon>(FxColortargetCommon.class, this, ColladaPackage.PASS_TYPE1__COLOR_TARGET);
    }
    return colorTarget;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxDepthtargetCommon> getDepthTarget() {
    if (depthTarget == null)
    {
      depthTarget = new EObjectContainmentEList<FxDepthtargetCommon>(FxDepthtargetCommon.class, this, ColladaPackage.PASS_TYPE1__DEPTH_TARGET);
    }
    return depthTarget;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxStenciltargetCommon> getStencilTarget() {
    if (stencilTarget == null)
    {
      stencilTarget = new EObjectContainmentEList<FxStenciltargetCommon>(FxStenciltargetCommon.class, this, ColladaPackage.PASS_TYPE1__STENCIL_TARGET);
    }
    return stencilTarget;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxClearcolorCommon> getColorClear() {
    if (colorClear == null)
    {
      colorClear = new EObjectContainmentEList<FxClearcolorCommon>(FxClearcolorCommon.class, this, ColladaPackage.PASS_TYPE1__COLOR_CLEAR);
    }
    return colorClear;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxCleardepthCommon> getDepthClear() {
    if (depthClear == null)
    {
      depthClear = new EObjectContainmentEList<FxCleardepthCommon>(FxCleardepthCommon.class, this, ColladaPackage.PASS_TYPE1__DEPTH_CLEAR);
    }
    return depthClear;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxClearstencilCommon> getStencilClear() {
    if (stencilClear == null)
    {
      stencilClear = new EObjectContainmentEList<FxClearstencilCommon>(FxClearstencilCommon.class, this, ColladaPackage.PASS_TYPE1__STENCIL_CLEAR);
    }
    return stencilClear;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getDraw() {
    return draw;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDraw(String newDraw) {
    String oldDraw = draw;
    draw = newDraw;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PASS_TYPE1__DRAW, oldDraw, draw));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null)
    {
      group = new BasicFeatureMap(this, ColladaPackage.PASS_TYPE1__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<AlphaFuncType1> getAlphaFunc() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_AlphaFunc());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<BlendFuncType1> getBlendFunc() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_BlendFunc());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<BlendFuncSeparateType> getBlendFuncSeparate() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_BlendFuncSeparate());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<BlendEquationType> getBlendEquation() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_BlendEquation());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<BlendEquationSeparateType> getBlendEquationSeparate() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_BlendEquationSeparate());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ColorMaterialType> getColorMaterial() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_ColorMaterial());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CullFaceType1> getCullFace() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_CullFace());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<DepthFuncType1> getDepthFunc() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_DepthFunc());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FogModeType1> getFogMode() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_FogMode());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FogCoordSrcType> getFogCoordSrc() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_FogCoordSrc());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FrontFaceType1> getFrontFace() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_FrontFace());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightModelColorControlType> getLightModelColorControl() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightModelColorControl());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LogicOpType1> getLogicOp() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LogicOp());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PolygonModeType> getPolygonMode() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_PolygonMode());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ShadeModelType1> getShadeModel() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_ShadeModel());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<StencilFuncType1> getStencilFunc() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_StencilFunc());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<StencilOpType1> getStencilOp() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_StencilOp());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<StencilFuncSeparateType> getStencilFuncSeparate() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_StencilFuncSeparate());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<StencilOpSeparateType> getStencilOpSeparate() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_StencilOpSeparate());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<StencilMaskSeparateType> getStencilMaskSeparate() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_StencilMaskSeparate());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightEnableType1> getLightEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightAmbientType1> getLightAmbient() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightAmbient());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightDiffuseType1> getLightDiffuse() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightDiffuse());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightSpecularType1> getLightSpecular() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightSpecular());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightPositionType1> getLightPosition() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightPosition());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightConstantAttenuationType1> getLightConstantAttenuation() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightConstantAttenuation());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightLinearAttenuationType> getLightLinearAttenuation() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightLinearAttenuation());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightQuadraticAttenuationType1> getLightQuadraticAttenuation() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightQuadraticAttenuation());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightSpotCutoffType1> getLightSpotCutoff() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightSpotCutoff());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightSpotDirectionType1> getLightSpotDirection() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightSpotDirection());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightSpotExponentType1> getLightSpotExponent() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightSpotExponent());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Texture1DType> getTexture1D() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_Texture1D());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Texture2DType> getTexture2D() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_Texture2D());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Texture3DType> getTexture3D() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_Texture3D());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TextureCUBEType> getTextureCUBE() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_TextureCUBE());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TextureRECTType> getTextureRECT() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_TextureRECT());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TextureDEPTHType> getTextureDEPTH() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_TextureDEPTH());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Texture1DEnableType> getTexture1DEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_Texture1DEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Texture2DEnableType> getTexture2DEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_Texture2DEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Texture3DEnableType> getTexture3DEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_Texture3DEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TextureCUBEEnableType> getTextureCUBEEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_TextureCUBEEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TextureRECTEnableType> getTextureRECTEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_TextureRECTEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TextureDEPTHEnableType> getTextureDEPTHEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_TextureDEPTHEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TextureEnvColorType> getTextureEnvColor() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_TextureEnvColor());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TextureEnvModeType> getTextureEnvMode() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_TextureEnvMode());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ClipPlaneType1> getClipPlane() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_ClipPlane());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ClipPlaneEnableType1> getClipPlaneEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_ClipPlaneEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<BlendColorType> getBlendColor() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_BlendColor());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ClearColorType1> getClearColor() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_ClearColor());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ClearStencilType1> getClearStencil() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_ClearStencil());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ClearDepthType1> getClearDepth() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_ClearDepth());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ColorMaskType1> getColorMask() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_ColorMask());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<DepthBoundsType> getDepthBounds() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_DepthBounds());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<DepthMaskType1> getDepthMask() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_DepthMask());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<DepthRangeType1> getDepthRange() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_DepthRange());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FogDensityType1> getFogDensity() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_FogDensity());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FogStartType1> getFogStart() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_FogStart());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FogEndType1> getFogEnd() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_FogEnd());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FogColorType1> getFogColor() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_FogColor());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightModelAmbientType1> getLightModelAmbient() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightModelAmbient());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightingEnableType1> getLightingEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightingEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LineStippleType> getLineStipple() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LineStipple());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LineWidthType1> getLineWidth() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LineWidth());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<MaterialAmbientType1> getMaterialAmbient() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_MaterialAmbient());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<MaterialDiffuseType1> getMaterialDiffuse() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_MaterialDiffuse());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<MaterialEmissionType1> getMaterialEmission() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_MaterialEmission());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<MaterialShininessType1> getMaterialShininess() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_MaterialShininess());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<MaterialSpecularType1> getMaterialSpecular() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_MaterialSpecular());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ModelViewMatrixType1> getModelViewMatrix() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_ModelViewMatrix());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PointDistanceAttenuationType1> getPointDistanceAttenuation() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_PointDistanceAttenuation());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PointFadeThresholdSizeType1> getPointFadeThresholdSize() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_PointFadeThresholdSize());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PointSizeType1> getPointSize() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_PointSize());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PointSizeMinType1> getPointSizeMin() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_PointSizeMin());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PointSizeMaxType1> getPointSizeMax() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_PointSizeMax());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PolygonOffsetType1> getPolygonOffset() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_PolygonOffset());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ProjectionMatrixType1> getProjectionMatrix() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_ProjectionMatrix());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ScissorType1> getScissor() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_Scissor());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<StencilMaskType1> getStencilMask() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_StencilMask());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<AlphaTestEnableType1> getAlphaTestEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_AlphaTestEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<AutoNormalEnableType> getAutoNormalEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_AutoNormalEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<BlendEnableType1> getBlendEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_BlendEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ColorLogicOpEnableType1> getColorLogicOpEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_ColorLogicOpEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ColorMaterialEnableType1> getColorMaterialEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_ColorMaterialEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CullFaceEnableType1> getCullFaceEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_CullFaceEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<DepthBoundsEnableType> getDepthBoundsEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_DepthBoundsEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<DepthClampEnableType> getDepthClampEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_DepthClampEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<DepthTestEnableType1> getDepthTestEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_DepthTestEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<DitherEnableType1> getDitherEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_DitherEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FogEnableType1> getFogEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_FogEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightModelLocalViewerEnableType> getLightModelLocalViewerEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightModelLocalViewerEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightModelTwoSideEnableType1> getLightModelTwoSideEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LightModelTwoSideEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LineSmoothEnableType1> getLineSmoothEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LineSmoothEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LineStippleEnableType> getLineStippleEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LineStippleEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LogicOpEnableType> getLogicOpEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_LogicOpEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<MultisampleEnableType1> getMultisampleEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_MultisampleEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<NormalizeEnableType1> getNormalizeEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_NormalizeEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PointSmoothEnableType1> getPointSmoothEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_PointSmoothEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PolygonOffsetFillEnableType1> getPolygonOffsetFillEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_PolygonOffsetFillEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PolygonOffsetLineEnableType> getPolygonOffsetLineEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_PolygonOffsetLineEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PolygonOffsetPointEnableType> getPolygonOffsetPointEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_PolygonOffsetPointEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PolygonSmoothEnableType> getPolygonSmoothEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_PolygonSmoothEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PolygonStippleEnableType> getPolygonStippleEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_PolygonStippleEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<RescaleNormalEnableType1> getRescaleNormalEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_RescaleNormalEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SampleAlphaToCoverageEnableType1> getSampleAlphaToCoverageEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_SampleAlphaToCoverageEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SampleAlphaToOneEnableType1> getSampleAlphaToOneEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_SampleAlphaToOneEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SampleCoverageEnableType1> getSampleCoverageEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_SampleCoverageEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ScissorTestEnableType1> getScissorTestEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_ScissorTestEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<StencilTestEnableType1> getStencilTestEnable() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_StencilTestEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGlHookAbstractGroup() {
    return (FeatureMap)getGroup().<FeatureMap.Entry>list(ColladaPackage.eINSTANCE.getPassType1_GlHookAbstractGroup());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<EObject> getGlHookAbstract() {
    return getGlHookAbstractGroup().list(ColladaPackage.eINSTANCE.getPassType1_GlHookAbstract());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ShaderType> getShader() {
    return getGroup().list(ColladaPackage.eINSTANCE.getPassType1_Shader());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.PASS_TYPE1__EXTRA);
    }
    return extra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSid() {
    return sid;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSid(String newSid) {
    String oldSid = sid;
    sid = newSid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PASS_TYPE1__SID, oldSid, sid));
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
      case ColladaPackage.PASS_TYPE1__ANNOTATE:
        return ((InternalEList<?>)getAnnotate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__COLOR_TARGET:
        return ((InternalEList<?>)getColorTarget()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__DEPTH_TARGET:
        return ((InternalEList<?>)getDepthTarget()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__STENCIL_TARGET:
        return ((InternalEList<?>)getStencilTarget()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__COLOR_CLEAR:
        return ((InternalEList<?>)getColorClear()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__DEPTH_CLEAR:
        return ((InternalEList<?>)getDepthClear()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__STENCIL_CLEAR:
        return ((InternalEList<?>)getStencilClear()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__ALPHA_FUNC:
        return ((InternalEList<?>)getAlphaFunc()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__BLEND_FUNC:
        return ((InternalEList<?>)getBlendFunc()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__BLEND_FUNC_SEPARATE:
        return ((InternalEList<?>)getBlendFuncSeparate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__BLEND_EQUATION:
        return ((InternalEList<?>)getBlendEquation()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__BLEND_EQUATION_SEPARATE:
        return ((InternalEList<?>)getBlendEquationSeparate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__COLOR_MATERIAL:
        return ((InternalEList<?>)getColorMaterial()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__CULL_FACE:
        return ((InternalEList<?>)getCullFace()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__DEPTH_FUNC:
        return ((InternalEList<?>)getDepthFunc()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__FOG_MODE:
        return ((InternalEList<?>)getFogMode()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__FOG_COORD_SRC:
        return ((InternalEList<?>)getFogCoordSrc()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__FRONT_FACE:
        return ((InternalEList<?>)getFrontFace()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_COLOR_CONTROL:
        return ((InternalEList<?>)getLightModelColorControl()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LOGIC_OP:
        return ((InternalEList<?>)getLogicOp()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__POLYGON_MODE:
        return ((InternalEList<?>)getPolygonMode()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__SHADE_MODEL:
        return ((InternalEList<?>)getShadeModel()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__STENCIL_FUNC:
        return ((InternalEList<?>)getStencilFunc()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__STENCIL_OP:
        return ((InternalEList<?>)getStencilOp()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__STENCIL_FUNC_SEPARATE:
        return ((InternalEList<?>)getStencilFuncSeparate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__STENCIL_OP_SEPARATE:
        return ((InternalEList<?>)getStencilOpSeparate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__STENCIL_MASK_SEPARATE:
        return ((InternalEList<?>)getStencilMaskSeparate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHT_ENABLE:
        return ((InternalEList<?>)getLightEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHT_AMBIENT:
        return ((InternalEList<?>)getLightAmbient()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHT_DIFFUSE:
        return ((InternalEList<?>)getLightDiffuse()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHT_SPECULAR:
        return ((InternalEList<?>)getLightSpecular()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHT_POSITION:
        return ((InternalEList<?>)getLightPosition()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHT_CONSTANT_ATTENUATION:
        return ((InternalEList<?>)getLightConstantAttenuation()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHT_LINEAR_ATTENUATION:
        return ((InternalEList<?>)getLightLinearAttenuation()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHT_QUADRATIC_ATTENUATION:
        return ((InternalEList<?>)getLightQuadraticAttenuation()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHT_SPOT_CUTOFF:
        return ((InternalEList<?>)getLightSpotCutoff()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHT_SPOT_DIRECTION:
        return ((InternalEList<?>)getLightSpotDirection()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHT_SPOT_EXPONENT:
        return ((InternalEList<?>)getLightSpotExponent()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__TEXTURE1_D:
        return ((InternalEList<?>)getTexture1D()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__TEXTURE2_D:
        return ((InternalEList<?>)getTexture2D()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__TEXTURE3_D:
        return ((InternalEList<?>)getTexture3D()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__TEXTURE_CUBE:
        return ((InternalEList<?>)getTextureCUBE()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__TEXTURE_RECT:
        return ((InternalEList<?>)getTextureRECT()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__TEXTURE_DEPTH:
        return ((InternalEList<?>)getTextureDEPTH()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__TEXTURE1_DENABLE:
        return ((InternalEList<?>)getTexture1DEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__TEXTURE2_DENABLE:
        return ((InternalEList<?>)getTexture2DEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__TEXTURE3_DENABLE:
        return ((InternalEList<?>)getTexture3DEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__TEXTURE_CUBE_ENABLE:
        return ((InternalEList<?>)getTextureCUBEEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__TEXTURE_RECT_ENABLE:
        return ((InternalEList<?>)getTextureRECTEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__TEXTURE_DEPTH_ENABLE:
        return ((InternalEList<?>)getTextureDEPTHEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__TEXTURE_ENV_COLOR:
        return ((InternalEList<?>)getTextureEnvColor()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__TEXTURE_ENV_MODE:
        return ((InternalEList<?>)getTextureEnvMode()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__CLIP_PLANE:
        return ((InternalEList<?>)getClipPlane()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__CLIP_PLANE_ENABLE:
        return ((InternalEList<?>)getClipPlaneEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__BLEND_COLOR:
        return ((InternalEList<?>)getBlendColor()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__CLEAR_COLOR:
        return ((InternalEList<?>)getClearColor()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__CLEAR_STENCIL:
        return ((InternalEList<?>)getClearStencil()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__CLEAR_DEPTH:
        return ((InternalEList<?>)getClearDepth()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__COLOR_MASK:
        return ((InternalEList<?>)getColorMask()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__DEPTH_BOUNDS:
        return ((InternalEList<?>)getDepthBounds()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__DEPTH_MASK:
        return ((InternalEList<?>)getDepthMask()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__DEPTH_RANGE:
        return ((InternalEList<?>)getDepthRange()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__FOG_DENSITY:
        return ((InternalEList<?>)getFogDensity()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__FOG_START:
        return ((InternalEList<?>)getFogStart()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__FOG_END:
        return ((InternalEList<?>)getFogEnd()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__FOG_COLOR:
        return ((InternalEList<?>)getFogColor()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_AMBIENT:
        return ((InternalEList<?>)getLightModelAmbient()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHTING_ENABLE:
        return ((InternalEList<?>)getLightingEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LINE_STIPPLE:
        return ((InternalEList<?>)getLineStipple()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LINE_WIDTH:
        return ((InternalEList<?>)getLineWidth()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__MATERIAL_AMBIENT:
        return ((InternalEList<?>)getMaterialAmbient()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__MATERIAL_DIFFUSE:
        return ((InternalEList<?>)getMaterialDiffuse()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__MATERIAL_EMISSION:
        return ((InternalEList<?>)getMaterialEmission()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__MATERIAL_SHININESS:
        return ((InternalEList<?>)getMaterialShininess()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__MATERIAL_SPECULAR:
        return ((InternalEList<?>)getMaterialSpecular()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__MODEL_VIEW_MATRIX:
        return ((InternalEList<?>)getModelViewMatrix()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__POINT_DISTANCE_ATTENUATION:
        return ((InternalEList<?>)getPointDistanceAttenuation()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__POINT_FADE_THRESHOLD_SIZE:
        return ((InternalEList<?>)getPointFadeThresholdSize()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__POINT_SIZE:
        return ((InternalEList<?>)getPointSize()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__POINT_SIZE_MIN:
        return ((InternalEList<?>)getPointSizeMin()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__POINT_SIZE_MAX:
        return ((InternalEList<?>)getPointSizeMax()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET:
        return ((InternalEList<?>)getPolygonOffset()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__PROJECTION_MATRIX:
        return ((InternalEList<?>)getProjectionMatrix()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__SCISSOR:
        return ((InternalEList<?>)getScissor()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__STENCIL_MASK:
        return ((InternalEList<?>)getStencilMask()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__ALPHA_TEST_ENABLE:
        return ((InternalEList<?>)getAlphaTestEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__AUTO_NORMAL_ENABLE:
        return ((InternalEList<?>)getAutoNormalEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__BLEND_ENABLE:
        return ((InternalEList<?>)getBlendEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__COLOR_LOGIC_OP_ENABLE:
        return ((InternalEList<?>)getColorLogicOpEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__COLOR_MATERIAL_ENABLE:
        return ((InternalEList<?>)getColorMaterialEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__CULL_FACE_ENABLE:
        return ((InternalEList<?>)getCullFaceEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__DEPTH_BOUNDS_ENABLE:
        return ((InternalEList<?>)getDepthBoundsEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__DEPTH_CLAMP_ENABLE:
        return ((InternalEList<?>)getDepthClampEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__DEPTH_TEST_ENABLE:
        return ((InternalEList<?>)getDepthTestEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__DITHER_ENABLE:
        return ((InternalEList<?>)getDitherEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__FOG_ENABLE:
        return ((InternalEList<?>)getFogEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_LOCAL_VIEWER_ENABLE:
        return ((InternalEList<?>)getLightModelLocalViewerEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_TWO_SIDE_ENABLE:
        return ((InternalEList<?>)getLightModelTwoSideEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LINE_SMOOTH_ENABLE:
        return ((InternalEList<?>)getLineSmoothEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LINE_STIPPLE_ENABLE:
        return ((InternalEList<?>)getLineStippleEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__LOGIC_OP_ENABLE:
        return ((InternalEList<?>)getLogicOpEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__MULTISAMPLE_ENABLE:
        return ((InternalEList<?>)getMultisampleEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__NORMALIZE_ENABLE:
        return ((InternalEList<?>)getNormalizeEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__POINT_SMOOTH_ENABLE:
        return ((InternalEList<?>)getPointSmoothEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET_FILL_ENABLE:
        return ((InternalEList<?>)getPolygonOffsetFillEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET_LINE_ENABLE:
        return ((InternalEList<?>)getPolygonOffsetLineEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET_POINT_ENABLE:
        return ((InternalEList<?>)getPolygonOffsetPointEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__POLYGON_SMOOTH_ENABLE:
        return ((InternalEList<?>)getPolygonSmoothEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__POLYGON_STIPPLE_ENABLE:
        return ((InternalEList<?>)getPolygonStippleEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__RESCALE_NORMAL_ENABLE:
        return ((InternalEList<?>)getRescaleNormalEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__SAMPLE_ALPHA_TO_COVERAGE_ENABLE:
        return ((InternalEList<?>)getSampleAlphaToCoverageEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__SAMPLE_ALPHA_TO_ONE_ENABLE:
        return ((InternalEList<?>)getSampleAlphaToOneEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__SAMPLE_COVERAGE_ENABLE:
        return ((InternalEList<?>)getSampleCoverageEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__SCISSOR_TEST_ENABLE:
        return ((InternalEList<?>)getScissorTestEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__STENCIL_TEST_ENABLE:
        return ((InternalEList<?>)getStencilTestEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__GL_HOOK_ABSTRACT_GROUP:
        return ((InternalEList<?>)getGlHookAbstractGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__GL_HOOK_ABSTRACT:
        return ((InternalEList<?>)getGlHookAbstract()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__SHADER:
        return ((InternalEList<?>)getShader()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE1__EXTRA:
        return ((InternalEList<?>)getExtra()).basicRemove(otherEnd, msgs);
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
      case ColladaPackage.PASS_TYPE1__ANNOTATE:
        return getAnnotate();
      case ColladaPackage.PASS_TYPE1__COLOR_TARGET:
        return getColorTarget();
      case ColladaPackage.PASS_TYPE1__DEPTH_TARGET:
        return getDepthTarget();
      case ColladaPackage.PASS_TYPE1__STENCIL_TARGET:
        return getStencilTarget();
      case ColladaPackage.PASS_TYPE1__COLOR_CLEAR:
        return getColorClear();
      case ColladaPackage.PASS_TYPE1__DEPTH_CLEAR:
        return getDepthClear();
      case ColladaPackage.PASS_TYPE1__STENCIL_CLEAR:
        return getStencilClear();
      case ColladaPackage.PASS_TYPE1__DRAW:
        return getDraw();
      case ColladaPackage.PASS_TYPE1__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.PASS_TYPE1__ALPHA_FUNC:
        return getAlphaFunc();
      case ColladaPackage.PASS_TYPE1__BLEND_FUNC:
        return getBlendFunc();
      case ColladaPackage.PASS_TYPE1__BLEND_FUNC_SEPARATE:
        return getBlendFuncSeparate();
      case ColladaPackage.PASS_TYPE1__BLEND_EQUATION:
        return getBlendEquation();
      case ColladaPackage.PASS_TYPE1__BLEND_EQUATION_SEPARATE:
        return getBlendEquationSeparate();
      case ColladaPackage.PASS_TYPE1__COLOR_MATERIAL:
        return getColorMaterial();
      case ColladaPackage.PASS_TYPE1__CULL_FACE:
        return getCullFace();
      case ColladaPackage.PASS_TYPE1__DEPTH_FUNC:
        return getDepthFunc();
      case ColladaPackage.PASS_TYPE1__FOG_MODE:
        return getFogMode();
      case ColladaPackage.PASS_TYPE1__FOG_COORD_SRC:
        return getFogCoordSrc();
      case ColladaPackage.PASS_TYPE1__FRONT_FACE:
        return getFrontFace();
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_COLOR_CONTROL:
        return getLightModelColorControl();
      case ColladaPackage.PASS_TYPE1__LOGIC_OP:
        return getLogicOp();
      case ColladaPackage.PASS_TYPE1__POLYGON_MODE:
        return getPolygonMode();
      case ColladaPackage.PASS_TYPE1__SHADE_MODEL:
        return getShadeModel();
      case ColladaPackage.PASS_TYPE1__STENCIL_FUNC:
        return getStencilFunc();
      case ColladaPackage.PASS_TYPE1__STENCIL_OP:
        return getStencilOp();
      case ColladaPackage.PASS_TYPE1__STENCIL_FUNC_SEPARATE:
        return getStencilFuncSeparate();
      case ColladaPackage.PASS_TYPE1__STENCIL_OP_SEPARATE:
        return getStencilOpSeparate();
      case ColladaPackage.PASS_TYPE1__STENCIL_MASK_SEPARATE:
        return getStencilMaskSeparate();
      case ColladaPackage.PASS_TYPE1__LIGHT_ENABLE:
        return getLightEnable();
      case ColladaPackage.PASS_TYPE1__LIGHT_AMBIENT:
        return getLightAmbient();
      case ColladaPackage.PASS_TYPE1__LIGHT_DIFFUSE:
        return getLightDiffuse();
      case ColladaPackage.PASS_TYPE1__LIGHT_SPECULAR:
        return getLightSpecular();
      case ColladaPackage.PASS_TYPE1__LIGHT_POSITION:
        return getLightPosition();
      case ColladaPackage.PASS_TYPE1__LIGHT_CONSTANT_ATTENUATION:
        return getLightConstantAttenuation();
      case ColladaPackage.PASS_TYPE1__LIGHT_LINEAR_ATTENUATION:
        return getLightLinearAttenuation();
      case ColladaPackage.PASS_TYPE1__LIGHT_QUADRATIC_ATTENUATION:
        return getLightQuadraticAttenuation();
      case ColladaPackage.PASS_TYPE1__LIGHT_SPOT_CUTOFF:
        return getLightSpotCutoff();
      case ColladaPackage.PASS_TYPE1__LIGHT_SPOT_DIRECTION:
        return getLightSpotDirection();
      case ColladaPackage.PASS_TYPE1__LIGHT_SPOT_EXPONENT:
        return getLightSpotExponent();
      case ColladaPackage.PASS_TYPE1__TEXTURE1_D:
        return getTexture1D();
      case ColladaPackage.PASS_TYPE1__TEXTURE2_D:
        return getTexture2D();
      case ColladaPackage.PASS_TYPE1__TEXTURE3_D:
        return getTexture3D();
      case ColladaPackage.PASS_TYPE1__TEXTURE_CUBE:
        return getTextureCUBE();
      case ColladaPackage.PASS_TYPE1__TEXTURE_RECT:
        return getTextureRECT();
      case ColladaPackage.PASS_TYPE1__TEXTURE_DEPTH:
        return getTextureDEPTH();
      case ColladaPackage.PASS_TYPE1__TEXTURE1_DENABLE:
        return getTexture1DEnable();
      case ColladaPackage.PASS_TYPE1__TEXTURE2_DENABLE:
        return getTexture2DEnable();
      case ColladaPackage.PASS_TYPE1__TEXTURE3_DENABLE:
        return getTexture3DEnable();
      case ColladaPackage.PASS_TYPE1__TEXTURE_CUBE_ENABLE:
        return getTextureCUBEEnable();
      case ColladaPackage.PASS_TYPE1__TEXTURE_RECT_ENABLE:
        return getTextureRECTEnable();
      case ColladaPackage.PASS_TYPE1__TEXTURE_DEPTH_ENABLE:
        return getTextureDEPTHEnable();
      case ColladaPackage.PASS_TYPE1__TEXTURE_ENV_COLOR:
        return getTextureEnvColor();
      case ColladaPackage.PASS_TYPE1__TEXTURE_ENV_MODE:
        return getTextureEnvMode();
      case ColladaPackage.PASS_TYPE1__CLIP_PLANE:
        return getClipPlane();
      case ColladaPackage.PASS_TYPE1__CLIP_PLANE_ENABLE:
        return getClipPlaneEnable();
      case ColladaPackage.PASS_TYPE1__BLEND_COLOR:
        return getBlendColor();
      case ColladaPackage.PASS_TYPE1__CLEAR_COLOR:
        return getClearColor();
      case ColladaPackage.PASS_TYPE1__CLEAR_STENCIL:
        return getClearStencil();
      case ColladaPackage.PASS_TYPE1__CLEAR_DEPTH:
        return getClearDepth();
      case ColladaPackage.PASS_TYPE1__COLOR_MASK:
        return getColorMask();
      case ColladaPackage.PASS_TYPE1__DEPTH_BOUNDS:
        return getDepthBounds();
      case ColladaPackage.PASS_TYPE1__DEPTH_MASK:
        return getDepthMask();
      case ColladaPackage.PASS_TYPE1__DEPTH_RANGE:
        return getDepthRange();
      case ColladaPackage.PASS_TYPE1__FOG_DENSITY:
        return getFogDensity();
      case ColladaPackage.PASS_TYPE1__FOG_START:
        return getFogStart();
      case ColladaPackage.PASS_TYPE1__FOG_END:
        return getFogEnd();
      case ColladaPackage.PASS_TYPE1__FOG_COLOR:
        return getFogColor();
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_AMBIENT:
        return getLightModelAmbient();
      case ColladaPackage.PASS_TYPE1__LIGHTING_ENABLE:
        return getLightingEnable();
      case ColladaPackage.PASS_TYPE1__LINE_STIPPLE:
        return getLineStipple();
      case ColladaPackage.PASS_TYPE1__LINE_WIDTH:
        return getLineWidth();
      case ColladaPackage.PASS_TYPE1__MATERIAL_AMBIENT:
        return getMaterialAmbient();
      case ColladaPackage.PASS_TYPE1__MATERIAL_DIFFUSE:
        return getMaterialDiffuse();
      case ColladaPackage.PASS_TYPE1__MATERIAL_EMISSION:
        return getMaterialEmission();
      case ColladaPackage.PASS_TYPE1__MATERIAL_SHININESS:
        return getMaterialShininess();
      case ColladaPackage.PASS_TYPE1__MATERIAL_SPECULAR:
        return getMaterialSpecular();
      case ColladaPackage.PASS_TYPE1__MODEL_VIEW_MATRIX:
        return getModelViewMatrix();
      case ColladaPackage.PASS_TYPE1__POINT_DISTANCE_ATTENUATION:
        return getPointDistanceAttenuation();
      case ColladaPackage.PASS_TYPE1__POINT_FADE_THRESHOLD_SIZE:
        return getPointFadeThresholdSize();
      case ColladaPackage.PASS_TYPE1__POINT_SIZE:
        return getPointSize();
      case ColladaPackage.PASS_TYPE1__POINT_SIZE_MIN:
        return getPointSizeMin();
      case ColladaPackage.PASS_TYPE1__POINT_SIZE_MAX:
        return getPointSizeMax();
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET:
        return getPolygonOffset();
      case ColladaPackage.PASS_TYPE1__PROJECTION_MATRIX:
        return getProjectionMatrix();
      case ColladaPackage.PASS_TYPE1__SCISSOR:
        return getScissor();
      case ColladaPackage.PASS_TYPE1__STENCIL_MASK:
        return getStencilMask();
      case ColladaPackage.PASS_TYPE1__ALPHA_TEST_ENABLE:
        return getAlphaTestEnable();
      case ColladaPackage.PASS_TYPE1__AUTO_NORMAL_ENABLE:
        return getAutoNormalEnable();
      case ColladaPackage.PASS_TYPE1__BLEND_ENABLE:
        return getBlendEnable();
      case ColladaPackage.PASS_TYPE1__COLOR_LOGIC_OP_ENABLE:
        return getColorLogicOpEnable();
      case ColladaPackage.PASS_TYPE1__COLOR_MATERIAL_ENABLE:
        return getColorMaterialEnable();
      case ColladaPackage.PASS_TYPE1__CULL_FACE_ENABLE:
        return getCullFaceEnable();
      case ColladaPackage.PASS_TYPE1__DEPTH_BOUNDS_ENABLE:
        return getDepthBoundsEnable();
      case ColladaPackage.PASS_TYPE1__DEPTH_CLAMP_ENABLE:
        return getDepthClampEnable();
      case ColladaPackage.PASS_TYPE1__DEPTH_TEST_ENABLE:
        return getDepthTestEnable();
      case ColladaPackage.PASS_TYPE1__DITHER_ENABLE:
        return getDitherEnable();
      case ColladaPackage.PASS_TYPE1__FOG_ENABLE:
        return getFogEnable();
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_LOCAL_VIEWER_ENABLE:
        return getLightModelLocalViewerEnable();
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_TWO_SIDE_ENABLE:
        return getLightModelTwoSideEnable();
      case ColladaPackage.PASS_TYPE1__LINE_SMOOTH_ENABLE:
        return getLineSmoothEnable();
      case ColladaPackage.PASS_TYPE1__LINE_STIPPLE_ENABLE:
        return getLineStippleEnable();
      case ColladaPackage.PASS_TYPE1__LOGIC_OP_ENABLE:
        return getLogicOpEnable();
      case ColladaPackage.PASS_TYPE1__MULTISAMPLE_ENABLE:
        return getMultisampleEnable();
      case ColladaPackage.PASS_TYPE1__NORMALIZE_ENABLE:
        return getNormalizeEnable();
      case ColladaPackage.PASS_TYPE1__POINT_SMOOTH_ENABLE:
        return getPointSmoothEnable();
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET_FILL_ENABLE:
        return getPolygonOffsetFillEnable();
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET_LINE_ENABLE:
        return getPolygonOffsetLineEnable();
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET_POINT_ENABLE:
        return getPolygonOffsetPointEnable();
      case ColladaPackage.PASS_TYPE1__POLYGON_SMOOTH_ENABLE:
        return getPolygonSmoothEnable();
      case ColladaPackage.PASS_TYPE1__POLYGON_STIPPLE_ENABLE:
        return getPolygonStippleEnable();
      case ColladaPackage.PASS_TYPE1__RESCALE_NORMAL_ENABLE:
        return getRescaleNormalEnable();
      case ColladaPackage.PASS_TYPE1__SAMPLE_ALPHA_TO_COVERAGE_ENABLE:
        return getSampleAlphaToCoverageEnable();
      case ColladaPackage.PASS_TYPE1__SAMPLE_ALPHA_TO_ONE_ENABLE:
        return getSampleAlphaToOneEnable();
      case ColladaPackage.PASS_TYPE1__SAMPLE_COVERAGE_ENABLE:
        return getSampleCoverageEnable();
      case ColladaPackage.PASS_TYPE1__SCISSOR_TEST_ENABLE:
        return getScissorTestEnable();
      case ColladaPackage.PASS_TYPE1__STENCIL_TEST_ENABLE:
        return getStencilTestEnable();
      case ColladaPackage.PASS_TYPE1__GL_HOOK_ABSTRACT_GROUP:
        if (coreType) return getGlHookAbstractGroup();
        return ((FeatureMap.Internal)getGlHookAbstractGroup()).getWrapper();
      case ColladaPackage.PASS_TYPE1__GL_HOOK_ABSTRACT:
        return getGlHookAbstract();
      case ColladaPackage.PASS_TYPE1__SHADER:
        return getShader();
      case ColladaPackage.PASS_TYPE1__EXTRA:
        return getExtra();
      case ColladaPackage.PASS_TYPE1__SID:
        return getSid();
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
      case ColladaPackage.PASS_TYPE1__ANNOTATE:
        getAnnotate().clear();
        getAnnotate().addAll((Collection<? extends FxAnnotateCommon>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__COLOR_TARGET:
        getColorTarget().clear();
        getColorTarget().addAll((Collection<? extends FxColortargetCommon>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_TARGET:
        getDepthTarget().clear();
        getDepthTarget().addAll((Collection<? extends FxDepthtargetCommon>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_TARGET:
        getStencilTarget().clear();
        getStencilTarget().addAll((Collection<? extends FxStenciltargetCommon>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__COLOR_CLEAR:
        getColorClear().clear();
        getColorClear().addAll((Collection<? extends FxClearcolorCommon>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_CLEAR:
        getDepthClear().clear();
        getDepthClear().addAll((Collection<? extends FxCleardepthCommon>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_CLEAR:
        getStencilClear().clear();
        getStencilClear().addAll((Collection<? extends FxClearstencilCommon>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__DRAW:
        setDraw((String)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.PASS_TYPE1__ALPHA_FUNC:
        getAlphaFunc().clear();
        getAlphaFunc().addAll((Collection<? extends AlphaFuncType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__BLEND_FUNC:
        getBlendFunc().clear();
        getBlendFunc().addAll((Collection<? extends BlendFuncType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__BLEND_FUNC_SEPARATE:
        getBlendFuncSeparate().clear();
        getBlendFuncSeparate().addAll((Collection<? extends BlendFuncSeparateType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__BLEND_EQUATION:
        getBlendEquation().clear();
        getBlendEquation().addAll((Collection<? extends BlendEquationType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__BLEND_EQUATION_SEPARATE:
        getBlendEquationSeparate().clear();
        getBlendEquationSeparate().addAll((Collection<? extends BlendEquationSeparateType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__COLOR_MATERIAL:
        getColorMaterial().clear();
        getColorMaterial().addAll((Collection<? extends ColorMaterialType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__CULL_FACE:
        getCullFace().clear();
        getCullFace().addAll((Collection<? extends CullFaceType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_FUNC:
        getDepthFunc().clear();
        getDepthFunc().addAll((Collection<? extends DepthFuncType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__FOG_MODE:
        getFogMode().clear();
        getFogMode().addAll((Collection<? extends FogModeType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__FOG_COORD_SRC:
        getFogCoordSrc().clear();
        getFogCoordSrc().addAll((Collection<? extends FogCoordSrcType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__FRONT_FACE:
        getFrontFace().clear();
        getFrontFace().addAll((Collection<? extends FrontFaceType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_COLOR_CONTROL:
        getLightModelColorControl().clear();
        getLightModelColorControl().addAll((Collection<? extends LightModelColorControlType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LOGIC_OP:
        getLogicOp().clear();
        getLogicOp().addAll((Collection<? extends LogicOpType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__POLYGON_MODE:
        getPolygonMode().clear();
        getPolygonMode().addAll((Collection<? extends PolygonModeType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__SHADE_MODEL:
        getShadeModel().clear();
        getShadeModel().addAll((Collection<? extends ShadeModelType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_FUNC:
        getStencilFunc().clear();
        getStencilFunc().addAll((Collection<? extends StencilFuncType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_OP:
        getStencilOp().clear();
        getStencilOp().addAll((Collection<? extends StencilOpType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_FUNC_SEPARATE:
        getStencilFuncSeparate().clear();
        getStencilFuncSeparate().addAll((Collection<? extends StencilFuncSeparateType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_OP_SEPARATE:
        getStencilOpSeparate().clear();
        getStencilOpSeparate().addAll((Collection<? extends StencilOpSeparateType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_MASK_SEPARATE:
        getStencilMaskSeparate().clear();
        getStencilMaskSeparate().addAll((Collection<? extends StencilMaskSeparateType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_ENABLE:
        getLightEnable().clear();
        getLightEnable().addAll((Collection<? extends LightEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_AMBIENT:
        getLightAmbient().clear();
        getLightAmbient().addAll((Collection<? extends LightAmbientType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_DIFFUSE:
        getLightDiffuse().clear();
        getLightDiffuse().addAll((Collection<? extends LightDiffuseType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_SPECULAR:
        getLightSpecular().clear();
        getLightSpecular().addAll((Collection<? extends LightSpecularType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_POSITION:
        getLightPosition().clear();
        getLightPosition().addAll((Collection<? extends LightPositionType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_CONSTANT_ATTENUATION:
        getLightConstantAttenuation().clear();
        getLightConstantAttenuation().addAll((Collection<? extends LightConstantAttenuationType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_LINEAR_ATTENUATION:
        getLightLinearAttenuation().clear();
        getLightLinearAttenuation().addAll((Collection<? extends LightLinearAttenuationType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_QUADRATIC_ATTENUATION:
        getLightQuadraticAttenuation().clear();
        getLightQuadraticAttenuation().addAll((Collection<? extends LightQuadraticAttenuationType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_SPOT_CUTOFF:
        getLightSpotCutoff().clear();
        getLightSpotCutoff().addAll((Collection<? extends LightSpotCutoffType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_SPOT_DIRECTION:
        getLightSpotDirection().clear();
        getLightSpotDirection().addAll((Collection<? extends LightSpotDirectionType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_SPOT_EXPONENT:
        getLightSpotExponent().clear();
        getLightSpotExponent().addAll((Collection<? extends LightSpotExponentType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE1_D:
        getTexture1D().clear();
        getTexture1D().addAll((Collection<? extends Texture1DType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE2_D:
        getTexture2D().clear();
        getTexture2D().addAll((Collection<? extends Texture2DType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE3_D:
        getTexture3D().clear();
        getTexture3D().addAll((Collection<? extends Texture3DType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_CUBE:
        getTextureCUBE().clear();
        getTextureCUBE().addAll((Collection<? extends TextureCUBEType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_RECT:
        getTextureRECT().clear();
        getTextureRECT().addAll((Collection<? extends TextureRECTType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_DEPTH:
        getTextureDEPTH().clear();
        getTextureDEPTH().addAll((Collection<? extends TextureDEPTHType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE1_DENABLE:
        getTexture1DEnable().clear();
        getTexture1DEnable().addAll((Collection<? extends Texture1DEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE2_DENABLE:
        getTexture2DEnable().clear();
        getTexture2DEnable().addAll((Collection<? extends Texture2DEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE3_DENABLE:
        getTexture3DEnable().clear();
        getTexture3DEnable().addAll((Collection<? extends Texture3DEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_CUBE_ENABLE:
        getTextureCUBEEnable().clear();
        getTextureCUBEEnable().addAll((Collection<? extends TextureCUBEEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_RECT_ENABLE:
        getTextureRECTEnable().clear();
        getTextureRECTEnable().addAll((Collection<? extends TextureRECTEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_DEPTH_ENABLE:
        getTextureDEPTHEnable().clear();
        getTextureDEPTHEnable().addAll((Collection<? extends TextureDEPTHEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_ENV_COLOR:
        getTextureEnvColor().clear();
        getTextureEnvColor().addAll((Collection<? extends TextureEnvColorType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_ENV_MODE:
        getTextureEnvMode().clear();
        getTextureEnvMode().addAll((Collection<? extends TextureEnvModeType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__CLIP_PLANE:
        getClipPlane().clear();
        getClipPlane().addAll((Collection<? extends ClipPlaneType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__CLIP_PLANE_ENABLE:
        getClipPlaneEnable().clear();
        getClipPlaneEnable().addAll((Collection<? extends ClipPlaneEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__BLEND_COLOR:
        getBlendColor().clear();
        getBlendColor().addAll((Collection<? extends BlendColorType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__CLEAR_COLOR:
        getClearColor().clear();
        getClearColor().addAll((Collection<? extends ClearColorType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__CLEAR_STENCIL:
        getClearStencil().clear();
        getClearStencil().addAll((Collection<? extends ClearStencilType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__CLEAR_DEPTH:
        getClearDepth().clear();
        getClearDepth().addAll((Collection<? extends ClearDepthType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__COLOR_MASK:
        getColorMask().clear();
        getColorMask().addAll((Collection<? extends ColorMaskType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_BOUNDS:
        getDepthBounds().clear();
        getDepthBounds().addAll((Collection<? extends DepthBoundsType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_MASK:
        getDepthMask().clear();
        getDepthMask().addAll((Collection<? extends DepthMaskType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_RANGE:
        getDepthRange().clear();
        getDepthRange().addAll((Collection<? extends DepthRangeType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__FOG_DENSITY:
        getFogDensity().clear();
        getFogDensity().addAll((Collection<? extends FogDensityType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__FOG_START:
        getFogStart().clear();
        getFogStart().addAll((Collection<? extends FogStartType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__FOG_END:
        getFogEnd().clear();
        getFogEnd().addAll((Collection<? extends FogEndType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__FOG_COLOR:
        getFogColor().clear();
        getFogColor().addAll((Collection<? extends FogColorType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_AMBIENT:
        getLightModelAmbient().clear();
        getLightModelAmbient().addAll((Collection<? extends LightModelAmbientType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHTING_ENABLE:
        getLightingEnable().clear();
        getLightingEnable().addAll((Collection<? extends LightingEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LINE_STIPPLE:
        getLineStipple().clear();
        getLineStipple().addAll((Collection<? extends LineStippleType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LINE_WIDTH:
        getLineWidth().clear();
        getLineWidth().addAll((Collection<? extends LineWidthType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__MATERIAL_AMBIENT:
        getMaterialAmbient().clear();
        getMaterialAmbient().addAll((Collection<? extends MaterialAmbientType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__MATERIAL_DIFFUSE:
        getMaterialDiffuse().clear();
        getMaterialDiffuse().addAll((Collection<? extends MaterialDiffuseType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__MATERIAL_EMISSION:
        getMaterialEmission().clear();
        getMaterialEmission().addAll((Collection<? extends MaterialEmissionType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__MATERIAL_SHININESS:
        getMaterialShininess().clear();
        getMaterialShininess().addAll((Collection<? extends MaterialShininessType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__MATERIAL_SPECULAR:
        getMaterialSpecular().clear();
        getMaterialSpecular().addAll((Collection<? extends MaterialSpecularType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__MODEL_VIEW_MATRIX:
        getModelViewMatrix().clear();
        getModelViewMatrix().addAll((Collection<? extends ModelViewMatrixType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__POINT_DISTANCE_ATTENUATION:
        getPointDistanceAttenuation().clear();
        getPointDistanceAttenuation().addAll((Collection<? extends PointDistanceAttenuationType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__POINT_FADE_THRESHOLD_SIZE:
        getPointFadeThresholdSize().clear();
        getPointFadeThresholdSize().addAll((Collection<? extends PointFadeThresholdSizeType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__POINT_SIZE:
        getPointSize().clear();
        getPointSize().addAll((Collection<? extends PointSizeType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__POINT_SIZE_MIN:
        getPointSizeMin().clear();
        getPointSizeMin().addAll((Collection<? extends PointSizeMinType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__POINT_SIZE_MAX:
        getPointSizeMax().clear();
        getPointSizeMax().addAll((Collection<? extends PointSizeMaxType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET:
        getPolygonOffset().clear();
        getPolygonOffset().addAll((Collection<? extends PolygonOffsetType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__PROJECTION_MATRIX:
        getProjectionMatrix().clear();
        getProjectionMatrix().addAll((Collection<? extends ProjectionMatrixType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__SCISSOR:
        getScissor().clear();
        getScissor().addAll((Collection<? extends ScissorType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_MASK:
        getStencilMask().clear();
        getStencilMask().addAll((Collection<? extends StencilMaskType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__ALPHA_TEST_ENABLE:
        getAlphaTestEnable().clear();
        getAlphaTestEnable().addAll((Collection<? extends AlphaTestEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__AUTO_NORMAL_ENABLE:
        getAutoNormalEnable().clear();
        getAutoNormalEnable().addAll((Collection<? extends AutoNormalEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__BLEND_ENABLE:
        getBlendEnable().clear();
        getBlendEnable().addAll((Collection<? extends BlendEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__COLOR_LOGIC_OP_ENABLE:
        getColorLogicOpEnable().clear();
        getColorLogicOpEnable().addAll((Collection<? extends ColorLogicOpEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__COLOR_MATERIAL_ENABLE:
        getColorMaterialEnable().clear();
        getColorMaterialEnable().addAll((Collection<? extends ColorMaterialEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__CULL_FACE_ENABLE:
        getCullFaceEnable().clear();
        getCullFaceEnable().addAll((Collection<? extends CullFaceEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_BOUNDS_ENABLE:
        getDepthBoundsEnable().clear();
        getDepthBoundsEnable().addAll((Collection<? extends DepthBoundsEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_CLAMP_ENABLE:
        getDepthClampEnable().clear();
        getDepthClampEnable().addAll((Collection<? extends DepthClampEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_TEST_ENABLE:
        getDepthTestEnable().clear();
        getDepthTestEnable().addAll((Collection<? extends DepthTestEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__DITHER_ENABLE:
        getDitherEnable().clear();
        getDitherEnable().addAll((Collection<? extends DitherEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__FOG_ENABLE:
        getFogEnable().clear();
        getFogEnable().addAll((Collection<? extends FogEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_LOCAL_VIEWER_ENABLE:
        getLightModelLocalViewerEnable().clear();
        getLightModelLocalViewerEnable().addAll((Collection<? extends LightModelLocalViewerEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_TWO_SIDE_ENABLE:
        getLightModelTwoSideEnable().clear();
        getLightModelTwoSideEnable().addAll((Collection<? extends LightModelTwoSideEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LINE_SMOOTH_ENABLE:
        getLineSmoothEnable().clear();
        getLineSmoothEnable().addAll((Collection<? extends LineSmoothEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LINE_STIPPLE_ENABLE:
        getLineStippleEnable().clear();
        getLineStippleEnable().addAll((Collection<? extends LineStippleEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__LOGIC_OP_ENABLE:
        getLogicOpEnable().clear();
        getLogicOpEnable().addAll((Collection<? extends LogicOpEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__MULTISAMPLE_ENABLE:
        getMultisampleEnable().clear();
        getMultisampleEnable().addAll((Collection<? extends MultisampleEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__NORMALIZE_ENABLE:
        getNormalizeEnable().clear();
        getNormalizeEnable().addAll((Collection<? extends NormalizeEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__POINT_SMOOTH_ENABLE:
        getPointSmoothEnable().clear();
        getPointSmoothEnable().addAll((Collection<? extends PointSmoothEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET_FILL_ENABLE:
        getPolygonOffsetFillEnable().clear();
        getPolygonOffsetFillEnable().addAll((Collection<? extends PolygonOffsetFillEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET_LINE_ENABLE:
        getPolygonOffsetLineEnable().clear();
        getPolygonOffsetLineEnable().addAll((Collection<? extends PolygonOffsetLineEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET_POINT_ENABLE:
        getPolygonOffsetPointEnable().clear();
        getPolygonOffsetPointEnable().addAll((Collection<? extends PolygonOffsetPointEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__POLYGON_SMOOTH_ENABLE:
        getPolygonSmoothEnable().clear();
        getPolygonSmoothEnable().addAll((Collection<? extends PolygonSmoothEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__POLYGON_STIPPLE_ENABLE:
        getPolygonStippleEnable().clear();
        getPolygonStippleEnable().addAll((Collection<? extends PolygonStippleEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__RESCALE_NORMAL_ENABLE:
        getRescaleNormalEnable().clear();
        getRescaleNormalEnable().addAll((Collection<? extends RescaleNormalEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__SAMPLE_ALPHA_TO_COVERAGE_ENABLE:
        getSampleAlphaToCoverageEnable().clear();
        getSampleAlphaToCoverageEnable().addAll((Collection<? extends SampleAlphaToCoverageEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__SAMPLE_ALPHA_TO_ONE_ENABLE:
        getSampleAlphaToOneEnable().clear();
        getSampleAlphaToOneEnable().addAll((Collection<? extends SampleAlphaToOneEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__SAMPLE_COVERAGE_ENABLE:
        getSampleCoverageEnable().clear();
        getSampleCoverageEnable().addAll((Collection<? extends SampleCoverageEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__SCISSOR_TEST_ENABLE:
        getScissorTestEnable().clear();
        getScissorTestEnable().addAll((Collection<? extends ScissorTestEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_TEST_ENABLE:
        getStencilTestEnable().clear();
        getStencilTestEnable().addAll((Collection<? extends StencilTestEnableType1>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__GL_HOOK_ABSTRACT_GROUP:
        ((FeatureMap.Internal)getGlHookAbstractGroup()).set(newValue);
        return;
      case ColladaPackage.PASS_TYPE1__SHADER:
        getShader().clear();
        getShader().addAll((Collection<? extends ShaderType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE1__SID:
        setSid((String)newValue);
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
      case ColladaPackage.PASS_TYPE1__ANNOTATE:
        getAnnotate().clear();
        return;
      case ColladaPackage.PASS_TYPE1__COLOR_TARGET:
        getColorTarget().clear();
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_TARGET:
        getDepthTarget().clear();
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_TARGET:
        getStencilTarget().clear();
        return;
      case ColladaPackage.PASS_TYPE1__COLOR_CLEAR:
        getColorClear().clear();
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_CLEAR:
        getDepthClear().clear();
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_CLEAR:
        getStencilClear().clear();
        return;
      case ColladaPackage.PASS_TYPE1__DRAW:
        setDraw(DRAW_EDEFAULT);
        return;
      case ColladaPackage.PASS_TYPE1__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.PASS_TYPE1__ALPHA_FUNC:
        getAlphaFunc().clear();
        return;
      case ColladaPackage.PASS_TYPE1__BLEND_FUNC:
        getBlendFunc().clear();
        return;
      case ColladaPackage.PASS_TYPE1__BLEND_FUNC_SEPARATE:
        getBlendFuncSeparate().clear();
        return;
      case ColladaPackage.PASS_TYPE1__BLEND_EQUATION:
        getBlendEquation().clear();
        return;
      case ColladaPackage.PASS_TYPE1__BLEND_EQUATION_SEPARATE:
        getBlendEquationSeparate().clear();
        return;
      case ColladaPackage.PASS_TYPE1__COLOR_MATERIAL:
        getColorMaterial().clear();
        return;
      case ColladaPackage.PASS_TYPE1__CULL_FACE:
        getCullFace().clear();
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_FUNC:
        getDepthFunc().clear();
        return;
      case ColladaPackage.PASS_TYPE1__FOG_MODE:
        getFogMode().clear();
        return;
      case ColladaPackage.PASS_TYPE1__FOG_COORD_SRC:
        getFogCoordSrc().clear();
        return;
      case ColladaPackage.PASS_TYPE1__FRONT_FACE:
        getFrontFace().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_COLOR_CONTROL:
        getLightModelColorControl().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LOGIC_OP:
        getLogicOp().clear();
        return;
      case ColladaPackage.PASS_TYPE1__POLYGON_MODE:
        getPolygonMode().clear();
        return;
      case ColladaPackage.PASS_TYPE1__SHADE_MODEL:
        getShadeModel().clear();
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_FUNC:
        getStencilFunc().clear();
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_OP:
        getStencilOp().clear();
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_FUNC_SEPARATE:
        getStencilFuncSeparate().clear();
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_OP_SEPARATE:
        getStencilOpSeparate().clear();
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_MASK_SEPARATE:
        getStencilMaskSeparate().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_ENABLE:
        getLightEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_AMBIENT:
        getLightAmbient().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_DIFFUSE:
        getLightDiffuse().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_SPECULAR:
        getLightSpecular().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_POSITION:
        getLightPosition().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_CONSTANT_ATTENUATION:
        getLightConstantAttenuation().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_LINEAR_ATTENUATION:
        getLightLinearAttenuation().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_QUADRATIC_ATTENUATION:
        getLightQuadraticAttenuation().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_SPOT_CUTOFF:
        getLightSpotCutoff().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_SPOT_DIRECTION:
        getLightSpotDirection().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_SPOT_EXPONENT:
        getLightSpotExponent().clear();
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE1_D:
        getTexture1D().clear();
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE2_D:
        getTexture2D().clear();
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE3_D:
        getTexture3D().clear();
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_CUBE:
        getTextureCUBE().clear();
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_RECT:
        getTextureRECT().clear();
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_DEPTH:
        getTextureDEPTH().clear();
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE1_DENABLE:
        getTexture1DEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE2_DENABLE:
        getTexture2DEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE3_DENABLE:
        getTexture3DEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_CUBE_ENABLE:
        getTextureCUBEEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_RECT_ENABLE:
        getTextureRECTEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_DEPTH_ENABLE:
        getTextureDEPTHEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_ENV_COLOR:
        getTextureEnvColor().clear();
        return;
      case ColladaPackage.PASS_TYPE1__TEXTURE_ENV_MODE:
        getTextureEnvMode().clear();
        return;
      case ColladaPackage.PASS_TYPE1__CLIP_PLANE:
        getClipPlane().clear();
        return;
      case ColladaPackage.PASS_TYPE1__CLIP_PLANE_ENABLE:
        getClipPlaneEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__BLEND_COLOR:
        getBlendColor().clear();
        return;
      case ColladaPackage.PASS_TYPE1__CLEAR_COLOR:
        getClearColor().clear();
        return;
      case ColladaPackage.PASS_TYPE1__CLEAR_STENCIL:
        getClearStencil().clear();
        return;
      case ColladaPackage.PASS_TYPE1__CLEAR_DEPTH:
        getClearDepth().clear();
        return;
      case ColladaPackage.PASS_TYPE1__COLOR_MASK:
        getColorMask().clear();
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_BOUNDS:
        getDepthBounds().clear();
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_MASK:
        getDepthMask().clear();
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_RANGE:
        getDepthRange().clear();
        return;
      case ColladaPackage.PASS_TYPE1__FOG_DENSITY:
        getFogDensity().clear();
        return;
      case ColladaPackage.PASS_TYPE1__FOG_START:
        getFogStart().clear();
        return;
      case ColladaPackage.PASS_TYPE1__FOG_END:
        getFogEnd().clear();
        return;
      case ColladaPackage.PASS_TYPE1__FOG_COLOR:
        getFogColor().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_AMBIENT:
        getLightModelAmbient().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHTING_ENABLE:
        getLightingEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LINE_STIPPLE:
        getLineStipple().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LINE_WIDTH:
        getLineWidth().clear();
        return;
      case ColladaPackage.PASS_TYPE1__MATERIAL_AMBIENT:
        getMaterialAmbient().clear();
        return;
      case ColladaPackage.PASS_TYPE1__MATERIAL_DIFFUSE:
        getMaterialDiffuse().clear();
        return;
      case ColladaPackage.PASS_TYPE1__MATERIAL_EMISSION:
        getMaterialEmission().clear();
        return;
      case ColladaPackage.PASS_TYPE1__MATERIAL_SHININESS:
        getMaterialShininess().clear();
        return;
      case ColladaPackage.PASS_TYPE1__MATERIAL_SPECULAR:
        getMaterialSpecular().clear();
        return;
      case ColladaPackage.PASS_TYPE1__MODEL_VIEW_MATRIX:
        getModelViewMatrix().clear();
        return;
      case ColladaPackage.PASS_TYPE1__POINT_DISTANCE_ATTENUATION:
        getPointDistanceAttenuation().clear();
        return;
      case ColladaPackage.PASS_TYPE1__POINT_FADE_THRESHOLD_SIZE:
        getPointFadeThresholdSize().clear();
        return;
      case ColladaPackage.PASS_TYPE1__POINT_SIZE:
        getPointSize().clear();
        return;
      case ColladaPackage.PASS_TYPE1__POINT_SIZE_MIN:
        getPointSizeMin().clear();
        return;
      case ColladaPackage.PASS_TYPE1__POINT_SIZE_MAX:
        getPointSizeMax().clear();
        return;
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET:
        getPolygonOffset().clear();
        return;
      case ColladaPackage.PASS_TYPE1__PROJECTION_MATRIX:
        getProjectionMatrix().clear();
        return;
      case ColladaPackage.PASS_TYPE1__SCISSOR:
        getScissor().clear();
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_MASK:
        getStencilMask().clear();
        return;
      case ColladaPackage.PASS_TYPE1__ALPHA_TEST_ENABLE:
        getAlphaTestEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__AUTO_NORMAL_ENABLE:
        getAutoNormalEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__BLEND_ENABLE:
        getBlendEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__COLOR_LOGIC_OP_ENABLE:
        getColorLogicOpEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__COLOR_MATERIAL_ENABLE:
        getColorMaterialEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__CULL_FACE_ENABLE:
        getCullFaceEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_BOUNDS_ENABLE:
        getDepthBoundsEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_CLAMP_ENABLE:
        getDepthClampEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__DEPTH_TEST_ENABLE:
        getDepthTestEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__DITHER_ENABLE:
        getDitherEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__FOG_ENABLE:
        getFogEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_LOCAL_VIEWER_ENABLE:
        getLightModelLocalViewerEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_TWO_SIDE_ENABLE:
        getLightModelTwoSideEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LINE_SMOOTH_ENABLE:
        getLineSmoothEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LINE_STIPPLE_ENABLE:
        getLineStippleEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__LOGIC_OP_ENABLE:
        getLogicOpEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__MULTISAMPLE_ENABLE:
        getMultisampleEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__NORMALIZE_ENABLE:
        getNormalizeEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__POINT_SMOOTH_ENABLE:
        getPointSmoothEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET_FILL_ENABLE:
        getPolygonOffsetFillEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET_LINE_ENABLE:
        getPolygonOffsetLineEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET_POINT_ENABLE:
        getPolygonOffsetPointEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__POLYGON_SMOOTH_ENABLE:
        getPolygonSmoothEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__POLYGON_STIPPLE_ENABLE:
        getPolygonStippleEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__RESCALE_NORMAL_ENABLE:
        getRescaleNormalEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__SAMPLE_ALPHA_TO_COVERAGE_ENABLE:
        getSampleAlphaToCoverageEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__SAMPLE_ALPHA_TO_ONE_ENABLE:
        getSampleAlphaToOneEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__SAMPLE_COVERAGE_ENABLE:
        getSampleCoverageEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__SCISSOR_TEST_ENABLE:
        getScissorTestEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__STENCIL_TEST_ENABLE:
        getStencilTestEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE1__GL_HOOK_ABSTRACT_GROUP:
        getGlHookAbstractGroup().clear();
        return;
      case ColladaPackage.PASS_TYPE1__SHADER:
        getShader().clear();
        return;
      case ColladaPackage.PASS_TYPE1__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.PASS_TYPE1__SID:
        setSid(SID_EDEFAULT);
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
      case ColladaPackage.PASS_TYPE1__ANNOTATE:
        return annotate != null && !annotate.isEmpty();
      case ColladaPackage.PASS_TYPE1__COLOR_TARGET:
        return colorTarget != null && !colorTarget.isEmpty();
      case ColladaPackage.PASS_TYPE1__DEPTH_TARGET:
        return depthTarget != null && !depthTarget.isEmpty();
      case ColladaPackage.PASS_TYPE1__STENCIL_TARGET:
        return stencilTarget != null && !stencilTarget.isEmpty();
      case ColladaPackage.PASS_TYPE1__COLOR_CLEAR:
        return colorClear != null && !colorClear.isEmpty();
      case ColladaPackage.PASS_TYPE1__DEPTH_CLEAR:
        return depthClear != null && !depthClear.isEmpty();
      case ColladaPackage.PASS_TYPE1__STENCIL_CLEAR:
        return stencilClear != null && !stencilClear.isEmpty();
      case ColladaPackage.PASS_TYPE1__DRAW:
        return DRAW_EDEFAULT == null ? draw != null : !DRAW_EDEFAULT.equals(draw);
      case ColladaPackage.PASS_TYPE1__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.PASS_TYPE1__ALPHA_FUNC:
        return !getAlphaFunc().isEmpty();
      case ColladaPackage.PASS_TYPE1__BLEND_FUNC:
        return !getBlendFunc().isEmpty();
      case ColladaPackage.PASS_TYPE1__BLEND_FUNC_SEPARATE:
        return !getBlendFuncSeparate().isEmpty();
      case ColladaPackage.PASS_TYPE1__BLEND_EQUATION:
        return !getBlendEquation().isEmpty();
      case ColladaPackage.PASS_TYPE1__BLEND_EQUATION_SEPARATE:
        return !getBlendEquationSeparate().isEmpty();
      case ColladaPackage.PASS_TYPE1__COLOR_MATERIAL:
        return !getColorMaterial().isEmpty();
      case ColladaPackage.PASS_TYPE1__CULL_FACE:
        return !getCullFace().isEmpty();
      case ColladaPackage.PASS_TYPE1__DEPTH_FUNC:
        return !getDepthFunc().isEmpty();
      case ColladaPackage.PASS_TYPE1__FOG_MODE:
        return !getFogMode().isEmpty();
      case ColladaPackage.PASS_TYPE1__FOG_COORD_SRC:
        return !getFogCoordSrc().isEmpty();
      case ColladaPackage.PASS_TYPE1__FRONT_FACE:
        return !getFrontFace().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_COLOR_CONTROL:
        return !getLightModelColorControl().isEmpty();
      case ColladaPackage.PASS_TYPE1__LOGIC_OP:
        return !getLogicOp().isEmpty();
      case ColladaPackage.PASS_TYPE1__POLYGON_MODE:
        return !getPolygonMode().isEmpty();
      case ColladaPackage.PASS_TYPE1__SHADE_MODEL:
        return !getShadeModel().isEmpty();
      case ColladaPackage.PASS_TYPE1__STENCIL_FUNC:
        return !getStencilFunc().isEmpty();
      case ColladaPackage.PASS_TYPE1__STENCIL_OP:
        return !getStencilOp().isEmpty();
      case ColladaPackage.PASS_TYPE1__STENCIL_FUNC_SEPARATE:
        return !getStencilFuncSeparate().isEmpty();
      case ColladaPackage.PASS_TYPE1__STENCIL_OP_SEPARATE:
        return !getStencilOpSeparate().isEmpty();
      case ColladaPackage.PASS_TYPE1__STENCIL_MASK_SEPARATE:
        return !getStencilMaskSeparate().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHT_ENABLE:
        return !getLightEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHT_AMBIENT:
        return !getLightAmbient().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHT_DIFFUSE:
        return !getLightDiffuse().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHT_SPECULAR:
        return !getLightSpecular().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHT_POSITION:
        return !getLightPosition().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHT_CONSTANT_ATTENUATION:
        return !getLightConstantAttenuation().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHT_LINEAR_ATTENUATION:
        return !getLightLinearAttenuation().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHT_QUADRATIC_ATTENUATION:
        return !getLightQuadraticAttenuation().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHT_SPOT_CUTOFF:
        return !getLightSpotCutoff().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHT_SPOT_DIRECTION:
        return !getLightSpotDirection().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHT_SPOT_EXPONENT:
        return !getLightSpotExponent().isEmpty();
      case ColladaPackage.PASS_TYPE1__TEXTURE1_D:
        return !getTexture1D().isEmpty();
      case ColladaPackage.PASS_TYPE1__TEXTURE2_D:
        return !getTexture2D().isEmpty();
      case ColladaPackage.PASS_TYPE1__TEXTURE3_D:
        return !getTexture3D().isEmpty();
      case ColladaPackage.PASS_TYPE1__TEXTURE_CUBE:
        return !getTextureCUBE().isEmpty();
      case ColladaPackage.PASS_TYPE1__TEXTURE_RECT:
        return !getTextureRECT().isEmpty();
      case ColladaPackage.PASS_TYPE1__TEXTURE_DEPTH:
        return !getTextureDEPTH().isEmpty();
      case ColladaPackage.PASS_TYPE1__TEXTURE1_DENABLE:
        return !getTexture1DEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__TEXTURE2_DENABLE:
        return !getTexture2DEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__TEXTURE3_DENABLE:
        return !getTexture3DEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__TEXTURE_CUBE_ENABLE:
        return !getTextureCUBEEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__TEXTURE_RECT_ENABLE:
        return !getTextureRECTEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__TEXTURE_DEPTH_ENABLE:
        return !getTextureDEPTHEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__TEXTURE_ENV_COLOR:
        return !getTextureEnvColor().isEmpty();
      case ColladaPackage.PASS_TYPE1__TEXTURE_ENV_MODE:
        return !getTextureEnvMode().isEmpty();
      case ColladaPackage.PASS_TYPE1__CLIP_PLANE:
        return !getClipPlane().isEmpty();
      case ColladaPackage.PASS_TYPE1__CLIP_PLANE_ENABLE:
        return !getClipPlaneEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__BLEND_COLOR:
        return !getBlendColor().isEmpty();
      case ColladaPackage.PASS_TYPE1__CLEAR_COLOR:
        return !getClearColor().isEmpty();
      case ColladaPackage.PASS_TYPE1__CLEAR_STENCIL:
        return !getClearStencil().isEmpty();
      case ColladaPackage.PASS_TYPE1__CLEAR_DEPTH:
        return !getClearDepth().isEmpty();
      case ColladaPackage.PASS_TYPE1__COLOR_MASK:
        return !getColorMask().isEmpty();
      case ColladaPackage.PASS_TYPE1__DEPTH_BOUNDS:
        return !getDepthBounds().isEmpty();
      case ColladaPackage.PASS_TYPE1__DEPTH_MASK:
        return !getDepthMask().isEmpty();
      case ColladaPackage.PASS_TYPE1__DEPTH_RANGE:
        return !getDepthRange().isEmpty();
      case ColladaPackage.PASS_TYPE1__FOG_DENSITY:
        return !getFogDensity().isEmpty();
      case ColladaPackage.PASS_TYPE1__FOG_START:
        return !getFogStart().isEmpty();
      case ColladaPackage.PASS_TYPE1__FOG_END:
        return !getFogEnd().isEmpty();
      case ColladaPackage.PASS_TYPE1__FOG_COLOR:
        return !getFogColor().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_AMBIENT:
        return !getLightModelAmbient().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHTING_ENABLE:
        return !getLightingEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__LINE_STIPPLE:
        return !getLineStipple().isEmpty();
      case ColladaPackage.PASS_TYPE1__LINE_WIDTH:
        return !getLineWidth().isEmpty();
      case ColladaPackage.PASS_TYPE1__MATERIAL_AMBIENT:
        return !getMaterialAmbient().isEmpty();
      case ColladaPackage.PASS_TYPE1__MATERIAL_DIFFUSE:
        return !getMaterialDiffuse().isEmpty();
      case ColladaPackage.PASS_TYPE1__MATERIAL_EMISSION:
        return !getMaterialEmission().isEmpty();
      case ColladaPackage.PASS_TYPE1__MATERIAL_SHININESS:
        return !getMaterialShininess().isEmpty();
      case ColladaPackage.PASS_TYPE1__MATERIAL_SPECULAR:
        return !getMaterialSpecular().isEmpty();
      case ColladaPackage.PASS_TYPE1__MODEL_VIEW_MATRIX:
        return !getModelViewMatrix().isEmpty();
      case ColladaPackage.PASS_TYPE1__POINT_DISTANCE_ATTENUATION:
        return !getPointDistanceAttenuation().isEmpty();
      case ColladaPackage.PASS_TYPE1__POINT_FADE_THRESHOLD_SIZE:
        return !getPointFadeThresholdSize().isEmpty();
      case ColladaPackage.PASS_TYPE1__POINT_SIZE:
        return !getPointSize().isEmpty();
      case ColladaPackage.PASS_TYPE1__POINT_SIZE_MIN:
        return !getPointSizeMin().isEmpty();
      case ColladaPackage.PASS_TYPE1__POINT_SIZE_MAX:
        return !getPointSizeMax().isEmpty();
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET:
        return !getPolygonOffset().isEmpty();
      case ColladaPackage.PASS_TYPE1__PROJECTION_MATRIX:
        return !getProjectionMatrix().isEmpty();
      case ColladaPackage.PASS_TYPE1__SCISSOR:
        return !getScissor().isEmpty();
      case ColladaPackage.PASS_TYPE1__STENCIL_MASK:
        return !getStencilMask().isEmpty();
      case ColladaPackage.PASS_TYPE1__ALPHA_TEST_ENABLE:
        return !getAlphaTestEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__AUTO_NORMAL_ENABLE:
        return !getAutoNormalEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__BLEND_ENABLE:
        return !getBlendEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__COLOR_LOGIC_OP_ENABLE:
        return !getColorLogicOpEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__COLOR_MATERIAL_ENABLE:
        return !getColorMaterialEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__CULL_FACE_ENABLE:
        return !getCullFaceEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__DEPTH_BOUNDS_ENABLE:
        return !getDepthBoundsEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__DEPTH_CLAMP_ENABLE:
        return !getDepthClampEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__DEPTH_TEST_ENABLE:
        return !getDepthTestEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__DITHER_ENABLE:
        return !getDitherEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__FOG_ENABLE:
        return !getFogEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_LOCAL_VIEWER_ENABLE:
        return !getLightModelLocalViewerEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__LIGHT_MODEL_TWO_SIDE_ENABLE:
        return !getLightModelTwoSideEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__LINE_SMOOTH_ENABLE:
        return !getLineSmoothEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__LINE_STIPPLE_ENABLE:
        return !getLineStippleEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__LOGIC_OP_ENABLE:
        return !getLogicOpEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__MULTISAMPLE_ENABLE:
        return !getMultisampleEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__NORMALIZE_ENABLE:
        return !getNormalizeEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__POINT_SMOOTH_ENABLE:
        return !getPointSmoothEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET_FILL_ENABLE:
        return !getPolygonOffsetFillEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET_LINE_ENABLE:
        return !getPolygonOffsetLineEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__POLYGON_OFFSET_POINT_ENABLE:
        return !getPolygonOffsetPointEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__POLYGON_SMOOTH_ENABLE:
        return !getPolygonSmoothEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__POLYGON_STIPPLE_ENABLE:
        return !getPolygonStippleEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__RESCALE_NORMAL_ENABLE:
        return !getRescaleNormalEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__SAMPLE_ALPHA_TO_COVERAGE_ENABLE:
        return !getSampleAlphaToCoverageEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__SAMPLE_ALPHA_TO_ONE_ENABLE:
        return !getSampleAlphaToOneEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__SAMPLE_COVERAGE_ENABLE:
        return !getSampleCoverageEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__SCISSOR_TEST_ENABLE:
        return !getScissorTestEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__STENCIL_TEST_ENABLE:
        return !getStencilTestEnable().isEmpty();
      case ColladaPackage.PASS_TYPE1__GL_HOOK_ABSTRACT_GROUP:
        return !getGlHookAbstractGroup().isEmpty();
      case ColladaPackage.PASS_TYPE1__GL_HOOK_ABSTRACT:
        return !getGlHookAbstract().isEmpty();
      case ColladaPackage.PASS_TYPE1__SHADER:
        return !getShader().isEmpty();
      case ColladaPackage.PASS_TYPE1__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.PASS_TYPE1__SID:
        return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
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
    result.append(" (draw: ");
    result.append(draw);
    result.append(", group: ");
    result.append(group);
    result.append(", sid: ");
    result.append(sid);
    result.append(')');
    return result.toString();
  }

} //PassType1Impl
