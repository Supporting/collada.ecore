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
import org.khronos.collada.AlphaFuncType;
import org.khronos.collada.AlphaTestEnableType;
import org.khronos.collada.BlendEnableType;
import org.khronos.collada.BlendFuncType;
import org.khronos.collada.ClearColorType;
import org.khronos.collada.ClearDepthType;
import org.khronos.collada.ClearStencilType;
import org.khronos.collada.ClipPlaneEnableType;
import org.khronos.collada.ClipPlaneType;
import org.khronos.collada.ColladaPackage;
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
import org.khronos.collada.ExtraType;
import org.khronos.collada.FogColorType1;
import org.khronos.collada.FogCoordSrcType;
import org.khronos.collada.FogDensityType1;
import org.khronos.collada.FogEnableType1;
import org.khronos.collada.FogEndType1;
import org.khronos.collada.FogModeType1;
import org.khronos.collada.FogStartType1;
import org.khronos.collada.FrontFaceType1;
import org.khronos.collada.FogColorType;
import org.khronos.collada.FogDensityType;
import org.khronos.collada.FogEnableType;
import org.khronos.collada.FogEndType;
import org.khronos.collada.FogModeType;
import org.khronos.collada.FogStartType;
import org.khronos.collada.FrontFaceType;
import org.khronos.collada.FxAnnotateCommon;
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
import org.khronos.collada.PassType;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pass Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getColorTarget <em>Color Target</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getDepthTarget <em>Depth Target</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getStencilTarget <em>Stencil Target</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getColorClear <em>Color Clear</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getDepthClear <em>Depth Clear</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getStencilClear <em>Stencil Clear</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getDraw <em>Draw</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getGlesPipelineSettings <em>Gles Pipeline Settings</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getAlphaFunc <em>Alpha Func</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getBlendFunc <em>Blend Func</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getClearColor <em>Clear Color</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getClearStencil <em>Clear Stencil</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getClearDepth <em>Clear Depth</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getClipPlane <em>Clip Plane</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getColorMask <em>Color Mask</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getCullFace <em>Cull Face</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getDepthFunc <em>Depth Func</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getDepthMask <em>Depth Mask</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getDepthRange <em>Depth Range</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getFogColor <em>Fog Color</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getFogDensity <em>Fog Density</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getFogMode <em>Fog Mode</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getFogStart <em>Fog Start</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getFogEnd <em>Fog End</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getFrontFace <em>Front Face</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getTexturePipeline <em>Texture Pipeline</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLogicOp <em>Logic Op</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLightAmbient <em>Light Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLightDiffuse <em>Light Diffuse</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLightSpecular <em>Light Specular</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLightPosition <em>Light Position</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLightConstantAttenuation <em>Light Constant Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLightLinearAttenutation <em>Light Linear Attenutation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLightQuadraticAttenuation <em>Light Quadratic Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLightSpotCutoff <em>Light Spot Cutoff</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLightSpotDirection <em>Light Spot Direction</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLightSpotExponent <em>Light Spot Exponent</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLightModelAmbient <em>Light Model Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getMaterialAmbient <em>Material Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getMaterialDiffuse <em>Material Diffuse</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getMaterialEmission <em>Material Emission</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getMaterialShininess <em>Material Shininess</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getMaterialSpecular <em>Material Specular</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getModelViewMatrix <em>Model View Matrix</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getPointDistanceAttenuation <em>Point Distance Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getPointFadeThresholdSize <em>Point Fade Threshold Size</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getPointSize <em>Point Size</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getPointSizeMin <em>Point Size Min</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getPointSizeMax <em>Point Size Max</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getPolygonOffset <em>Polygon Offset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getProjectionMatrix <em>Projection Matrix</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getScissor <em>Scissor</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getShadeModel <em>Shade Model</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getStencilFunc <em>Stencil Func</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getStencilMask <em>Stencil Mask</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getStencilOp <em>Stencil Op</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getAlphaTestEnable <em>Alpha Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getBlendEnable <em>Blend Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getClipPlaneEnable <em>Clip Plane Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getColorLogicOpEnable <em>Color Logic Op Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getColorMaterialEnable <em>Color Material Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getCullFaceEnable <em>Cull Face Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getDepthTestEnable <em>Depth Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getDitherEnable <em>Dither Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getFogEnable <em>Fog Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getTexturePipelineEnable <em>Texture Pipeline Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLightEnable <em>Light Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLightingEnable <em>Lighting Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLightModelTwoSideEnable <em>Light Model Two Side Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getLineSmoothEnable <em>Line Smooth Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getMultisampleEnable <em>Multisample Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getNormalizeEnable <em>Normalize Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getPointSmoothEnable <em>Point Smooth Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getPolygonOffsetFillEnable <em>Polygon Offset Fill Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getRescaleNormalEnable <em>Rescale Normal Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getSampleAlphaToCoverageEnable <em>Sample Alpha To Coverage Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getSampleAlphaToOneEnable <em>Sample Alpha To One Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getSampleCoverageEnable <em>Sample Coverage Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getScissorTestEnable <em>Scissor Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getStencilTestEnable <em>Stencil Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PassTypeImpl#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PassTypeImpl extends EObjectImpl implements PassType {
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
   * The default value of the '{@link #getColorTarget() <em>Color Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getColorTarget()
   * @generated
   * @ordered
   */
	protected static final String COLOR_TARGET_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getColorTarget() <em>Color Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getColorTarget()
   * @generated
   * @ordered
   */
	protected String colorTarget = COLOR_TARGET_EDEFAULT;

	/**
   * The default value of the '{@link #getDepthTarget() <em>Depth Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDepthTarget()
   * @generated
   * @ordered
   */
	protected static final String DEPTH_TARGET_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getDepthTarget() <em>Depth Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDepthTarget()
   * @generated
   * @ordered
   */
	protected String depthTarget = DEPTH_TARGET_EDEFAULT;

	/**
   * The default value of the '{@link #getStencilTarget() <em>Stencil Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStencilTarget()
   * @generated
   * @ordered
   */
	protected static final String STENCIL_TARGET_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getStencilTarget() <em>Stencil Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStencilTarget()
   * @generated
   * @ordered
   */
	protected String stencilTarget = STENCIL_TARGET_EDEFAULT;

	/**
   * The default value of the '{@link #getColorClear() <em>Color Clear</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getColorClear()
   * @generated
   * @ordered
   */
	protected static final List<Double> COLOR_CLEAR_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getColorClear() <em>Color Clear</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getColorClear()
   * @generated
   * @ordered
   */
	protected List<Double> colorClear = COLOR_CLEAR_EDEFAULT;

	/**
   * The default value of the '{@link #getDepthClear() <em>Depth Clear</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDepthClear()
   * @generated
   * @ordered
   */
	protected static final double DEPTH_CLEAR_EDEFAULT = 0.0;

	/**
   * The cached value of the '{@link #getDepthClear() <em>Depth Clear</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDepthClear()
   * @generated
   * @ordered
   */
	protected double depthClear = DEPTH_CLEAR_EDEFAULT;

	/**
   * This is true if the Depth Clear attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean depthClearESet;

	/**
   * The default value of the '{@link #getStencilClear() <em>Stencil Clear</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStencilClear()
   * @generated
   * @ordered
   */
	protected static final byte STENCIL_CLEAR_EDEFAULT = 0x00;

	/**
   * The cached value of the '{@link #getStencilClear() <em>Stencil Clear</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStencilClear()
   * @generated
   * @ordered
   */
	protected byte stencilClear = STENCIL_CLEAR_EDEFAULT;

	/**
   * This is true if the Stencil Clear attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean stencilClearESet;

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
   * The cached value of the '{@link #getGlesPipelineSettings() <em>Gles Pipeline Settings</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGlesPipelineSettings()
   * @generated
   * @ordered
   */
	protected FeatureMap glesPipelineSettings;

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
	protected PassTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getPassType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxAnnotateCommon> getAnnotate() {
    if (annotate == null)
    {
      annotate = new EObjectContainmentEList<FxAnnotateCommon>(FxAnnotateCommon.class, this, ColladaPackage.PASS_TYPE__ANNOTATE);
    }
    return annotate;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getColorTarget() {
    return colorTarget;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setColorTarget(String newColorTarget) {
    String oldColorTarget = colorTarget;
    colorTarget = newColorTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PASS_TYPE__COLOR_TARGET, oldColorTarget, colorTarget));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getDepthTarget() {
    return depthTarget;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDepthTarget(String newDepthTarget) {
    String oldDepthTarget = depthTarget;
    depthTarget = newDepthTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PASS_TYPE__DEPTH_TARGET, oldDepthTarget, depthTarget));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getStencilTarget() {
    return stencilTarget;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setStencilTarget(String newStencilTarget) {
    String oldStencilTarget = stencilTarget;
    stencilTarget = newStencilTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PASS_TYPE__STENCIL_TARGET, oldStencilTarget, stencilTarget));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getColorClear() {
    return colorClear;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setColorClear(List<Double> newColorClear) {
    List<Double> oldColorClear = colorClear;
    colorClear = newColorClear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PASS_TYPE__COLOR_CLEAR, oldColorClear, colorClear));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public double getDepthClear() {
    return depthClear;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDepthClear(double newDepthClear) {
    double oldDepthClear = depthClear;
    depthClear = newDepthClear;
    boolean oldDepthClearESet = depthClearESet;
    depthClearESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PASS_TYPE__DEPTH_CLEAR, oldDepthClear, depthClear, !oldDepthClearESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetDepthClear() {
    double oldDepthClear = depthClear;
    boolean oldDepthClearESet = depthClearESet;
    depthClear = DEPTH_CLEAR_EDEFAULT;
    depthClearESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.PASS_TYPE__DEPTH_CLEAR, oldDepthClear, DEPTH_CLEAR_EDEFAULT, oldDepthClearESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetDepthClear() {
    return depthClearESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public byte getStencilClear() {
    return stencilClear;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setStencilClear(byte newStencilClear) {
    byte oldStencilClear = stencilClear;
    stencilClear = newStencilClear;
    boolean oldStencilClearESet = stencilClearESet;
    stencilClearESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PASS_TYPE__STENCIL_CLEAR, oldStencilClear, stencilClear, !oldStencilClearESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetStencilClear() {
    byte oldStencilClear = stencilClear;
    boolean oldStencilClearESet = stencilClearESet;
    stencilClear = STENCIL_CLEAR_EDEFAULT;
    stencilClearESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.PASS_TYPE__STENCIL_CLEAR, oldStencilClear, STENCIL_CLEAR_EDEFAULT, oldStencilClearESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetStencilClear() {
    return stencilClearESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PASS_TYPE__DRAW, oldDraw, draw));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGlesPipelineSettings() {
    if (glesPipelineSettings == null)
    {
      glesPipelineSettings = new BasicFeatureMap(this, ColladaPackage.PASS_TYPE__GLES_PIPELINE_SETTINGS);
    }
    return glesPipelineSettings;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<AlphaFuncType> getAlphaFunc() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_AlphaFunc());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<BlendFuncType> getBlendFunc() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_BlendFunc());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ClearColorType> getClearColor() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_ClearColor());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ClearStencilType> getClearStencil() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_ClearStencil());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ClearDepthType> getClearDepth() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_ClearDepth());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ClipPlaneType> getClipPlane() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_ClipPlane());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ColorMaskType> getColorMask() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_ColorMask());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CullFaceType> getCullFace() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_CullFace());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<DepthFuncType> getDepthFunc() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_DepthFunc());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<DepthMaskType> getDepthMask() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_DepthMask());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<DepthRangeType> getDepthRange() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_DepthRange());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FogColorType> getFogColor() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_FogColor());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FogDensityType> getFogDensity() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_FogDensity());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FogModeType> getFogMode() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_FogMode());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FogStartType> getFogStart() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_FogStart());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FogEndType> getFogEnd() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_FogEnd());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FrontFaceType> getFrontFace() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_FrontFace());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TexturePipelineType> getTexturePipeline() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_TexturePipeline());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LogicOpType> getLogicOp() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LogicOp());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightAmbientType> getLightAmbient() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LightAmbient());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightDiffuseType> getLightDiffuse() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LightDiffuse());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightSpecularType> getLightSpecular() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LightSpecular());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightPositionType> getLightPosition() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LightPosition());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightConstantAttenuationType> getLightConstantAttenuation() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LightConstantAttenuation());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightLinearAttenutationType> getLightLinearAttenutation() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LightLinearAttenutation());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightQuadraticAttenuationType> getLightQuadraticAttenuation() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LightQuadraticAttenuation());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightSpotCutoffType> getLightSpotCutoff() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LightSpotCutoff());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightSpotDirectionType> getLightSpotDirection() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LightSpotDirection());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightSpotExponentType> getLightSpotExponent() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LightSpotExponent());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightModelAmbientType> getLightModelAmbient() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LightModelAmbient());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LineWidthType> getLineWidth() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LineWidth());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<MaterialAmbientType> getMaterialAmbient() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_MaterialAmbient());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<MaterialDiffuseType> getMaterialDiffuse() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_MaterialDiffuse());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<MaterialEmissionType> getMaterialEmission() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_MaterialEmission());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<MaterialShininessType> getMaterialShininess() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_MaterialShininess());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<MaterialSpecularType> getMaterialSpecular() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_MaterialSpecular());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ModelViewMatrixType> getModelViewMatrix() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_ModelViewMatrix());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PointDistanceAttenuationType> getPointDistanceAttenuation() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_PointDistanceAttenuation());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PointFadeThresholdSizeType> getPointFadeThresholdSize() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_PointFadeThresholdSize());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PointSizeType> getPointSize() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_PointSize());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PointSizeMinType> getPointSizeMin() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_PointSizeMin());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PointSizeMaxType> getPointSizeMax() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_PointSizeMax());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PolygonOffsetType> getPolygonOffset() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_PolygonOffset());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ProjectionMatrixType> getProjectionMatrix() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_ProjectionMatrix());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ScissorType> getScissor() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_Scissor());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ShadeModelType> getShadeModel() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_ShadeModel());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<StencilFuncType> getStencilFunc() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_StencilFunc());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<StencilMaskType> getStencilMask() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_StencilMask());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<StencilOpType> getStencilOp() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_StencilOp());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<AlphaTestEnableType> getAlphaTestEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_AlphaTestEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<BlendEnableType> getBlendEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_BlendEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ClipPlaneEnableType> getClipPlaneEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_ClipPlaneEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ColorLogicOpEnableType> getColorLogicOpEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_ColorLogicOpEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ColorMaterialEnableType> getColorMaterialEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_ColorMaterialEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CullFaceEnableType> getCullFaceEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_CullFaceEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<DepthTestEnableType> getDepthTestEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_DepthTestEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<DitherEnableType> getDitherEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_DitherEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FogEnableType> getFogEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_FogEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TexturePipelineEnableType> getTexturePipelineEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_TexturePipelineEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightEnableType> getLightEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LightEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightingEnableType> getLightingEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LightingEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LightModelTwoSideEnableType> getLightModelTwoSideEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LightModelTwoSideEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LineSmoothEnableType> getLineSmoothEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_LineSmoothEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<MultisampleEnableType> getMultisampleEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_MultisampleEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<NormalizeEnableType> getNormalizeEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_NormalizeEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PointSmoothEnableType> getPointSmoothEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_PointSmoothEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PolygonOffsetFillEnableType> getPolygonOffsetFillEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_PolygonOffsetFillEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<RescaleNormalEnableType> getRescaleNormalEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_RescaleNormalEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SampleAlphaToCoverageEnableType> getSampleAlphaToCoverageEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_SampleAlphaToCoverageEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SampleAlphaToOneEnableType> getSampleAlphaToOneEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_SampleAlphaToOneEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SampleCoverageEnableType> getSampleCoverageEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_SampleCoverageEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ScissorTestEnableType> getScissorTestEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_ScissorTestEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<StencilTestEnableType> getStencilTestEnable() {
    return getGlesPipelineSettings().list(ColladaPackage.eINSTANCE.getPassType_StencilTestEnable());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.PASS_TYPE__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PASS_TYPE__SID, oldSid, sid));
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
      case ColladaPackage.PASS_TYPE__ANNOTATE:
        return ((InternalEList<?>)getAnnotate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__GLES_PIPELINE_SETTINGS:
        return ((InternalEList<?>)getGlesPipelineSettings()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__ALPHA_FUNC:
        return ((InternalEList<?>)getAlphaFunc()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__BLEND_FUNC:
        return ((InternalEList<?>)getBlendFunc()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__CLEAR_COLOR:
        return ((InternalEList<?>)getClearColor()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__CLEAR_STENCIL:
        return ((InternalEList<?>)getClearStencil()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__CLEAR_DEPTH:
        return ((InternalEList<?>)getClearDepth()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__CLIP_PLANE:
        return ((InternalEList<?>)getClipPlane()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__COLOR_MASK:
        return ((InternalEList<?>)getColorMask()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__CULL_FACE:
        return ((InternalEList<?>)getCullFace()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__DEPTH_FUNC:
        return ((InternalEList<?>)getDepthFunc()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__DEPTH_MASK:
        return ((InternalEList<?>)getDepthMask()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__DEPTH_RANGE:
        return ((InternalEList<?>)getDepthRange()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__FOG_COLOR:
        return ((InternalEList<?>)getFogColor()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__FOG_DENSITY:
        return ((InternalEList<?>)getFogDensity()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__FOG_MODE:
        return ((InternalEList<?>)getFogMode()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__FOG_START:
        return ((InternalEList<?>)getFogStart()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__FOG_END:
        return ((InternalEList<?>)getFogEnd()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__FRONT_FACE:
        return ((InternalEList<?>)getFrontFace()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__TEXTURE_PIPELINE:
        return ((InternalEList<?>)getTexturePipeline()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LOGIC_OP:
        return ((InternalEList<?>)getLogicOp()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LIGHT_AMBIENT:
        return ((InternalEList<?>)getLightAmbient()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LIGHT_DIFFUSE:
        return ((InternalEList<?>)getLightDiffuse()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LIGHT_SPECULAR:
        return ((InternalEList<?>)getLightSpecular()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LIGHT_POSITION:
        return ((InternalEList<?>)getLightPosition()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LIGHT_CONSTANT_ATTENUATION:
        return ((InternalEList<?>)getLightConstantAttenuation()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LIGHT_LINEAR_ATTENUTATION:
        return ((InternalEList<?>)getLightLinearAttenutation()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LIGHT_QUADRATIC_ATTENUATION:
        return ((InternalEList<?>)getLightQuadraticAttenuation()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LIGHT_SPOT_CUTOFF:
        return ((InternalEList<?>)getLightSpotCutoff()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LIGHT_SPOT_DIRECTION:
        return ((InternalEList<?>)getLightSpotDirection()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LIGHT_SPOT_EXPONENT:
        return ((InternalEList<?>)getLightSpotExponent()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LIGHT_MODEL_AMBIENT:
        return ((InternalEList<?>)getLightModelAmbient()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LINE_WIDTH:
        return ((InternalEList<?>)getLineWidth()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__MATERIAL_AMBIENT:
        return ((InternalEList<?>)getMaterialAmbient()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__MATERIAL_DIFFUSE:
        return ((InternalEList<?>)getMaterialDiffuse()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__MATERIAL_EMISSION:
        return ((InternalEList<?>)getMaterialEmission()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__MATERIAL_SHININESS:
        return ((InternalEList<?>)getMaterialShininess()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__MATERIAL_SPECULAR:
        return ((InternalEList<?>)getMaterialSpecular()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__MODEL_VIEW_MATRIX:
        return ((InternalEList<?>)getModelViewMatrix()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__POINT_DISTANCE_ATTENUATION:
        return ((InternalEList<?>)getPointDistanceAttenuation()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__POINT_FADE_THRESHOLD_SIZE:
        return ((InternalEList<?>)getPointFadeThresholdSize()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__POINT_SIZE:
        return ((InternalEList<?>)getPointSize()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__POINT_SIZE_MIN:
        return ((InternalEList<?>)getPointSizeMin()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__POINT_SIZE_MAX:
        return ((InternalEList<?>)getPointSizeMax()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__POLYGON_OFFSET:
        return ((InternalEList<?>)getPolygonOffset()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__PROJECTION_MATRIX:
        return ((InternalEList<?>)getProjectionMatrix()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__SCISSOR:
        return ((InternalEList<?>)getScissor()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__SHADE_MODEL:
        return ((InternalEList<?>)getShadeModel()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__STENCIL_FUNC:
        return ((InternalEList<?>)getStencilFunc()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__STENCIL_MASK:
        return ((InternalEList<?>)getStencilMask()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__STENCIL_OP:
        return ((InternalEList<?>)getStencilOp()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__ALPHA_TEST_ENABLE:
        return ((InternalEList<?>)getAlphaTestEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__BLEND_ENABLE:
        return ((InternalEList<?>)getBlendEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__CLIP_PLANE_ENABLE:
        return ((InternalEList<?>)getClipPlaneEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__COLOR_LOGIC_OP_ENABLE:
        return ((InternalEList<?>)getColorLogicOpEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__COLOR_MATERIAL_ENABLE:
        return ((InternalEList<?>)getColorMaterialEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__CULL_FACE_ENABLE:
        return ((InternalEList<?>)getCullFaceEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__DEPTH_TEST_ENABLE:
        return ((InternalEList<?>)getDepthTestEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__DITHER_ENABLE:
        return ((InternalEList<?>)getDitherEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__FOG_ENABLE:
        return ((InternalEList<?>)getFogEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__TEXTURE_PIPELINE_ENABLE:
        return ((InternalEList<?>)getTexturePipelineEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LIGHT_ENABLE:
        return ((InternalEList<?>)getLightEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LIGHTING_ENABLE:
        return ((InternalEList<?>)getLightingEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LIGHT_MODEL_TWO_SIDE_ENABLE:
        return ((InternalEList<?>)getLightModelTwoSideEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__LINE_SMOOTH_ENABLE:
        return ((InternalEList<?>)getLineSmoothEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__MULTISAMPLE_ENABLE:
        return ((InternalEList<?>)getMultisampleEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__NORMALIZE_ENABLE:
        return ((InternalEList<?>)getNormalizeEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__POINT_SMOOTH_ENABLE:
        return ((InternalEList<?>)getPointSmoothEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__POLYGON_OFFSET_FILL_ENABLE:
        return ((InternalEList<?>)getPolygonOffsetFillEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__RESCALE_NORMAL_ENABLE:
        return ((InternalEList<?>)getRescaleNormalEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__SAMPLE_ALPHA_TO_COVERAGE_ENABLE:
        return ((InternalEList<?>)getSampleAlphaToCoverageEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__SAMPLE_ALPHA_TO_ONE_ENABLE:
        return ((InternalEList<?>)getSampleAlphaToOneEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__SAMPLE_COVERAGE_ENABLE:
        return ((InternalEList<?>)getSampleCoverageEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__SCISSOR_TEST_ENABLE:
        return ((InternalEList<?>)getScissorTestEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__STENCIL_TEST_ENABLE:
        return ((InternalEList<?>)getStencilTestEnable()).basicRemove(otherEnd, msgs);
      case ColladaPackage.PASS_TYPE__EXTRA:
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
      case ColladaPackage.PASS_TYPE__ANNOTATE:
        return getAnnotate();
      case ColladaPackage.PASS_TYPE__COLOR_TARGET:
        return getColorTarget();
      case ColladaPackage.PASS_TYPE__DEPTH_TARGET:
        return getDepthTarget();
      case ColladaPackage.PASS_TYPE__STENCIL_TARGET:
        return getStencilTarget();
      case ColladaPackage.PASS_TYPE__COLOR_CLEAR:
        return getColorClear();
      case ColladaPackage.PASS_TYPE__DEPTH_CLEAR:
        return getDepthClear();
      case ColladaPackage.PASS_TYPE__STENCIL_CLEAR:
        return getStencilClear();
      case ColladaPackage.PASS_TYPE__DRAW:
        return getDraw();
      case ColladaPackage.PASS_TYPE__GLES_PIPELINE_SETTINGS:
        if (coreType) return getGlesPipelineSettings();
        return ((FeatureMap.Internal)getGlesPipelineSettings()).getWrapper();
      case ColladaPackage.PASS_TYPE__ALPHA_FUNC:
        return getAlphaFunc();
      case ColladaPackage.PASS_TYPE__BLEND_FUNC:
        return getBlendFunc();
      case ColladaPackage.PASS_TYPE__CLEAR_COLOR:
        return getClearColor();
      case ColladaPackage.PASS_TYPE__CLEAR_STENCIL:
        return getClearStencil();
      case ColladaPackage.PASS_TYPE__CLEAR_DEPTH:
        return getClearDepth();
      case ColladaPackage.PASS_TYPE__CLIP_PLANE:
        return getClipPlane();
      case ColladaPackage.PASS_TYPE__COLOR_MASK:
        return getColorMask();
      case ColladaPackage.PASS_TYPE__CULL_FACE:
        return getCullFace();
      case ColladaPackage.PASS_TYPE__DEPTH_FUNC:
        return getDepthFunc();
      case ColladaPackage.PASS_TYPE__DEPTH_MASK:
        return getDepthMask();
      case ColladaPackage.PASS_TYPE__DEPTH_RANGE:
        return getDepthRange();
      case ColladaPackage.PASS_TYPE__FOG_COLOR:
        return getFogColor();
      case ColladaPackage.PASS_TYPE__FOG_DENSITY:
        return getFogDensity();
      case ColladaPackage.PASS_TYPE__FOG_MODE:
        return getFogMode();
      case ColladaPackage.PASS_TYPE__FOG_START:
        return getFogStart();
      case ColladaPackage.PASS_TYPE__FOG_END:
        return getFogEnd();
      case ColladaPackage.PASS_TYPE__FRONT_FACE:
        return getFrontFace();
      case ColladaPackage.PASS_TYPE__TEXTURE_PIPELINE:
        return getTexturePipeline();
      case ColladaPackage.PASS_TYPE__LOGIC_OP:
        return getLogicOp();
      case ColladaPackage.PASS_TYPE__LIGHT_AMBIENT:
        return getLightAmbient();
      case ColladaPackage.PASS_TYPE__LIGHT_DIFFUSE:
        return getLightDiffuse();
      case ColladaPackage.PASS_TYPE__LIGHT_SPECULAR:
        return getLightSpecular();
      case ColladaPackage.PASS_TYPE__LIGHT_POSITION:
        return getLightPosition();
      case ColladaPackage.PASS_TYPE__LIGHT_CONSTANT_ATTENUATION:
        return getLightConstantAttenuation();
      case ColladaPackage.PASS_TYPE__LIGHT_LINEAR_ATTENUTATION:
        return getLightLinearAttenutation();
      case ColladaPackage.PASS_TYPE__LIGHT_QUADRATIC_ATTENUATION:
        return getLightQuadraticAttenuation();
      case ColladaPackage.PASS_TYPE__LIGHT_SPOT_CUTOFF:
        return getLightSpotCutoff();
      case ColladaPackage.PASS_TYPE__LIGHT_SPOT_DIRECTION:
        return getLightSpotDirection();
      case ColladaPackage.PASS_TYPE__LIGHT_SPOT_EXPONENT:
        return getLightSpotExponent();
      case ColladaPackage.PASS_TYPE__LIGHT_MODEL_AMBIENT:
        return getLightModelAmbient();
      case ColladaPackage.PASS_TYPE__LINE_WIDTH:
        return getLineWidth();
      case ColladaPackage.PASS_TYPE__MATERIAL_AMBIENT:
        return getMaterialAmbient();
      case ColladaPackage.PASS_TYPE__MATERIAL_DIFFUSE:
        return getMaterialDiffuse();
      case ColladaPackage.PASS_TYPE__MATERIAL_EMISSION:
        return getMaterialEmission();
      case ColladaPackage.PASS_TYPE__MATERIAL_SHININESS:
        return getMaterialShininess();
      case ColladaPackage.PASS_TYPE__MATERIAL_SPECULAR:
        return getMaterialSpecular();
      case ColladaPackage.PASS_TYPE__MODEL_VIEW_MATRIX:
        return getModelViewMatrix();
      case ColladaPackage.PASS_TYPE__POINT_DISTANCE_ATTENUATION:
        return getPointDistanceAttenuation();
      case ColladaPackage.PASS_TYPE__POINT_FADE_THRESHOLD_SIZE:
        return getPointFadeThresholdSize();
      case ColladaPackage.PASS_TYPE__POINT_SIZE:
        return getPointSize();
      case ColladaPackage.PASS_TYPE__POINT_SIZE_MIN:
        return getPointSizeMin();
      case ColladaPackage.PASS_TYPE__POINT_SIZE_MAX:
        return getPointSizeMax();
      case ColladaPackage.PASS_TYPE__POLYGON_OFFSET:
        return getPolygonOffset();
      case ColladaPackage.PASS_TYPE__PROJECTION_MATRIX:
        return getProjectionMatrix();
      case ColladaPackage.PASS_TYPE__SCISSOR:
        return getScissor();
      case ColladaPackage.PASS_TYPE__SHADE_MODEL:
        return getShadeModel();
      case ColladaPackage.PASS_TYPE__STENCIL_FUNC:
        return getStencilFunc();
      case ColladaPackage.PASS_TYPE__STENCIL_MASK:
        return getStencilMask();
      case ColladaPackage.PASS_TYPE__STENCIL_OP:
        return getStencilOp();
      case ColladaPackage.PASS_TYPE__ALPHA_TEST_ENABLE:
        return getAlphaTestEnable();
      case ColladaPackage.PASS_TYPE__BLEND_ENABLE:
        return getBlendEnable();
      case ColladaPackage.PASS_TYPE__CLIP_PLANE_ENABLE:
        return getClipPlaneEnable();
      case ColladaPackage.PASS_TYPE__COLOR_LOGIC_OP_ENABLE:
        return getColorLogicOpEnable();
      case ColladaPackage.PASS_TYPE__COLOR_MATERIAL_ENABLE:
        return getColorMaterialEnable();
      case ColladaPackage.PASS_TYPE__CULL_FACE_ENABLE:
        return getCullFaceEnable();
      case ColladaPackage.PASS_TYPE__DEPTH_TEST_ENABLE:
        return getDepthTestEnable();
      case ColladaPackage.PASS_TYPE__DITHER_ENABLE:
        return getDitherEnable();
      case ColladaPackage.PASS_TYPE__FOG_ENABLE:
        return getFogEnable();
      case ColladaPackage.PASS_TYPE__TEXTURE_PIPELINE_ENABLE:
        return getTexturePipelineEnable();
      case ColladaPackage.PASS_TYPE__LIGHT_ENABLE:
        return getLightEnable();
      case ColladaPackage.PASS_TYPE__LIGHTING_ENABLE:
        return getLightingEnable();
      case ColladaPackage.PASS_TYPE__LIGHT_MODEL_TWO_SIDE_ENABLE:
        return getLightModelTwoSideEnable();
      case ColladaPackage.PASS_TYPE__LINE_SMOOTH_ENABLE:
        return getLineSmoothEnable();
      case ColladaPackage.PASS_TYPE__MULTISAMPLE_ENABLE:
        return getMultisampleEnable();
      case ColladaPackage.PASS_TYPE__NORMALIZE_ENABLE:
        return getNormalizeEnable();
      case ColladaPackage.PASS_TYPE__POINT_SMOOTH_ENABLE:
        return getPointSmoothEnable();
      case ColladaPackage.PASS_TYPE__POLYGON_OFFSET_FILL_ENABLE:
        return getPolygonOffsetFillEnable();
      case ColladaPackage.PASS_TYPE__RESCALE_NORMAL_ENABLE:
        return getRescaleNormalEnable();
      case ColladaPackage.PASS_TYPE__SAMPLE_ALPHA_TO_COVERAGE_ENABLE:
        return getSampleAlphaToCoverageEnable();
      case ColladaPackage.PASS_TYPE__SAMPLE_ALPHA_TO_ONE_ENABLE:
        return getSampleAlphaToOneEnable();
      case ColladaPackage.PASS_TYPE__SAMPLE_COVERAGE_ENABLE:
        return getSampleCoverageEnable();
      case ColladaPackage.PASS_TYPE__SCISSOR_TEST_ENABLE:
        return getScissorTestEnable();
      case ColladaPackage.PASS_TYPE__STENCIL_TEST_ENABLE:
        return getStencilTestEnable();
      case ColladaPackage.PASS_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.PASS_TYPE__SID:
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
      case ColladaPackage.PASS_TYPE__ANNOTATE:
        getAnnotate().clear();
        getAnnotate().addAll((Collection<? extends FxAnnotateCommon>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__COLOR_TARGET:
        setColorTarget((String)newValue);
        return;
      case ColladaPackage.PASS_TYPE__DEPTH_TARGET:
        setDepthTarget((String)newValue);
        return;
      case ColladaPackage.PASS_TYPE__STENCIL_TARGET:
        setStencilTarget((String)newValue);
        return;
      case ColladaPackage.PASS_TYPE__COLOR_CLEAR:
        setColorClear((List<Double>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__DEPTH_CLEAR:
        setDepthClear((Double)newValue);
        return;
      case ColladaPackage.PASS_TYPE__STENCIL_CLEAR:
        setStencilClear((Byte)newValue);
        return;
      case ColladaPackage.PASS_TYPE__DRAW:
        setDraw((String)newValue);
        return;
      case ColladaPackage.PASS_TYPE__GLES_PIPELINE_SETTINGS:
        ((FeatureMap.Internal)getGlesPipelineSettings()).set(newValue);
        return;
      case ColladaPackage.PASS_TYPE__ALPHA_FUNC:
        getAlphaFunc().clear();
        getAlphaFunc().addAll((Collection<? extends AlphaFuncType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__BLEND_FUNC:
        getBlendFunc().clear();
        getBlendFunc().addAll((Collection<? extends BlendFuncType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__CLEAR_COLOR:
        getClearColor().clear();
        getClearColor().addAll((Collection<? extends ClearColorType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__CLEAR_STENCIL:
        getClearStencil().clear();
        getClearStencil().addAll((Collection<? extends ClearStencilType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__CLEAR_DEPTH:
        getClearDepth().clear();
        getClearDepth().addAll((Collection<? extends ClearDepthType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__CLIP_PLANE:
        getClipPlane().clear();
        getClipPlane().addAll((Collection<? extends ClipPlaneType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__COLOR_MASK:
        getColorMask().clear();
        getColorMask().addAll((Collection<? extends ColorMaskType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__CULL_FACE:
        getCullFace().clear();
        getCullFace().addAll((Collection<? extends CullFaceType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__DEPTH_FUNC:
        getDepthFunc().clear();
        getDepthFunc().addAll((Collection<? extends DepthFuncType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__DEPTH_MASK:
        getDepthMask().clear();
        getDepthMask().addAll((Collection<? extends DepthMaskType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__DEPTH_RANGE:
        getDepthRange().clear();
        getDepthRange().addAll((Collection<? extends DepthRangeType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__FOG_COLOR:
        getFogColor().clear();
        getFogColor().addAll((Collection<? extends FogColorType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__FOG_DENSITY:
        getFogDensity().clear();
        getFogDensity().addAll((Collection<? extends FogDensityType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__FOG_MODE:
        getFogMode().clear();
        getFogMode().addAll((Collection<? extends FogModeType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__FOG_START:
        getFogStart().clear();
        getFogStart().addAll((Collection<? extends FogStartType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__FOG_END:
        getFogEnd().clear();
        getFogEnd().addAll((Collection<? extends FogEndType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__FRONT_FACE:
        getFrontFace().clear();
        getFrontFace().addAll((Collection<? extends FrontFaceType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__TEXTURE_PIPELINE:
        getTexturePipeline().clear();
        getTexturePipeline().addAll((Collection<? extends TexturePipelineType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LOGIC_OP:
        getLogicOp().clear();
        getLogicOp().addAll((Collection<? extends LogicOpType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_AMBIENT:
        getLightAmbient().clear();
        getLightAmbient().addAll((Collection<? extends LightAmbientType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_DIFFUSE:
        getLightDiffuse().clear();
        getLightDiffuse().addAll((Collection<? extends LightDiffuseType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_SPECULAR:
        getLightSpecular().clear();
        getLightSpecular().addAll((Collection<? extends LightSpecularType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_POSITION:
        getLightPosition().clear();
        getLightPosition().addAll((Collection<? extends LightPositionType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_CONSTANT_ATTENUATION:
        getLightConstantAttenuation().clear();
        getLightConstantAttenuation().addAll((Collection<? extends LightConstantAttenuationType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_LINEAR_ATTENUTATION:
        getLightLinearAttenutation().clear();
        getLightLinearAttenutation().addAll((Collection<? extends LightLinearAttenutationType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_QUADRATIC_ATTENUATION:
        getLightQuadraticAttenuation().clear();
        getLightQuadraticAttenuation().addAll((Collection<? extends LightQuadraticAttenuationType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_SPOT_CUTOFF:
        getLightSpotCutoff().clear();
        getLightSpotCutoff().addAll((Collection<? extends LightSpotCutoffType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_SPOT_DIRECTION:
        getLightSpotDirection().clear();
        getLightSpotDirection().addAll((Collection<? extends LightSpotDirectionType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_SPOT_EXPONENT:
        getLightSpotExponent().clear();
        getLightSpotExponent().addAll((Collection<? extends LightSpotExponentType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_MODEL_AMBIENT:
        getLightModelAmbient().clear();
        getLightModelAmbient().addAll((Collection<? extends LightModelAmbientType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LINE_WIDTH:
        getLineWidth().clear();
        getLineWidth().addAll((Collection<? extends LineWidthType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__MATERIAL_AMBIENT:
        getMaterialAmbient().clear();
        getMaterialAmbient().addAll((Collection<? extends MaterialAmbientType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__MATERIAL_DIFFUSE:
        getMaterialDiffuse().clear();
        getMaterialDiffuse().addAll((Collection<? extends MaterialDiffuseType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__MATERIAL_EMISSION:
        getMaterialEmission().clear();
        getMaterialEmission().addAll((Collection<? extends MaterialEmissionType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__MATERIAL_SHININESS:
        getMaterialShininess().clear();
        getMaterialShininess().addAll((Collection<? extends MaterialShininessType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__MATERIAL_SPECULAR:
        getMaterialSpecular().clear();
        getMaterialSpecular().addAll((Collection<? extends MaterialSpecularType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__MODEL_VIEW_MATRIX:
        getModelViewMatrix().clear();
        getModelViewMatrix().addAll((Collection<? extends ModelViewMatrixType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__POINT_DISTANCE_ATTENUATION:
        getPointDistanceAttenuation().clear();
        getPointDistanceAttenuation().addAll((Collection<? extends PointDistanceAttenuationType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__POINT_FADE_THRESHOLD_SIZE:
        getPointFadeThresholdSize().clear();
        getPointFadeThresholdSize().addAll((Collection<? extends PointFadeThresholdSizeType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__POINT_SIZE:
        getPointSize().clear();
        getPointSize().addAll((Collection<? extends PointSizeType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__POINT_SIZE_MIN:
        getPointSizeMin().clear();
        getPointSizeMin().addAll((Collection<? extends PointSizeMinType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__POINT_SIZE_MAX:
        getPointSizeMax().clear();
        getPointSizeMax().addAll((Collection<? extends PointSizeMaxType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__POLYGON_OFFSET:
        getPolygonOffset().clear();
        getPolygonOffset().addAll((Collection<? extends PolygonOffsetType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__PROJECTION_MATRIX:
        getProjectionMatrix().clear();
        getProjectionMatrix().addAll((Collection<? extends ProjectionMatrixType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__SCISSOR:
        getScissor().clear();
        getScissor().addAll((Collection<? extends ScissorType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__SHADE_MODEL:
        getShadeModel().clear();
        getShadeModel().addAll((Collection<? extends ShadeModelType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__STENCIL_FUNC:
        getStencilFunc().clear();
        getStencilFunc().addAll((Collection<? extends StencilFuncType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__STENCIL_MASK:
        getStencilMask().clear();
        getStencilMask().addAll((Collection<? extends StencilMaskType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__STENCIL_OP:
        getStencilOp().clear();
        getStencilOp().addAll((Collection<? extends StencilOpType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__ALPHA_TEST_ENABLE:
        getAlphaTestEnable().clear();
        getAlphaTestEnable().addAll((Collection<? extends AlphaTestEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__BLEND_ENABLE:
        getBlendEnable().clear();
        getBlendEnable().addAll((Collection<? extends BlendEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__CLIP_PLANE_ENABLE:
        getClipPlaneEnable().clear();
        getClipPlaneEnable().addAll((Collection<? extends ClipPlaneEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__COLOR_LOGIC_OP_ENABLE:
        getColorLogicOpEnable().clear();
        getColorLogicOpEnable().addAll((Collection<? extends ColorLogicOpEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__COLOR_MATERIAL_ENABLE:
        getColorMaterialEnable().clear();
        getColorMaterialEnable().addAll((Collection<? extends ColorMaterialEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__CULL_FACE_ENABLE:
        getCullFaceEnable().clear();
        getCullFaceEnable().addAll((Collection<? extends CullFaceEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__DEPTH_TEST_ENABLE:
        getDepthTestEnable().clear();
        getDepthTestEnable().addAll((Collection<? extends DepthTestEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__DITHER_ENABLE:
        getDitherEnable().clear();
        getDitherEnable().addAll((Collection<? extends DitherEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__FOG_ENABLE:
        getFogEnable().clear();
        getFogEnable().addAll((Collection<? extends FogEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__TEXTURE_PIPELINE_ENABLE:
        getTexturePipelineEnable().clear();
        getTexturePipelineEnable().addAll((Collection<? extends TexturePipelineEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_ENABLE:
        getLightEnable().clear();
        getLightEnable().addAll((Collection<? extends LightEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LIGHTING_ENABLE:
        getLightingEnable().clear();
        getLightingEnable().addAll((Collection<? extends LightingEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_MODEL_TWO_SIDE_ENABLE:
        getLightModelTwoSideEnable().clear();
        getLightModelTwoSideEnable().addAll((Collection<? extends LightModelTwoSideEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__LINE_SMOOTH_ENABLE:
        getLineSmoothEnable().clear();
        getLineSmoothEnable().addAll((Collection<? extends LineSmoothEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__MULTISAMPLE_ENABLE:
        getMultisampleEnable().clear();
        getMultisampleEnable().addAll((Collection<? extends MultisampleEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__NORMALIZE_ENABLE:
        getNormalizeEnable().clear();
        getNormalizeEnable().addAll((Collection<? extends NormalizeEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__POINT_SMOOTH_ENABLE:
        getPointSmoothEnable().clear();
        getPointSmoothEnable().addAll((Collection<? extends PointSmoothEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__POLYGON_OFFSET_FILL_ENABLE:
        getPolygonOffsetFillEnable().clear();
        getPolygonOffsetFillEnable().addAll((Collection<? extends PolygonOffsetFillEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__RESCALE_NORMAL_ENABLE:
        getRescaleNormalEnable().clear();
        getRescaleNormalEnable().addAll((Collection<? extends RescaleNormalEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__SAMPLE_ALPHA_TO_COVERAGE_ENABLE:
        getSampleAlphaToCoverageEnable().clear();
        getSampleAlphaToCoverageEnable().addAll((Collection<? extends SampleAlphaToCoverageEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__SAMPLE_ALPHA_TO_ONE_ENABLE:
        getSampleAlphaToOneEnable().clear();
        getSampleAlphaToOneEnable().addAll((Collection<? extends SampleAlphaToOneEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__SAMPLE_COVERAGE_ENABLE:
        getSampleCoverageEnable().clear();
        getSampleCoverageEnable().addAll((Collection<? extends SampleCoverageEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__SCISSOR_TEST_ENABLE:
        getScissorTestEnable().clear();
        getScissorTestEnable().addAll((Collection<? extends ScissorTestEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__STENCIL_TEST_ENABLE:
        getStencilTestEnable().clear();
        getStencilTestEnable().addAll((Collection<? extends StencilTestEnableType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.PASS_TYPE__SID:
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
      case ColladaPackage.PASS_TYPE__ANNOTATE:
        getAnnotate().clear();
        return;
      case ColladaPackage.PASS_TYPE__COLOR_TARGET:
        setColorTarget(COLOR_TARGET_EDEFAULT);
        return;
      case ColladaPackage.PASS_TYPE__DEPTH_TARGET:
        setDepthTarget(DEPTH_TARGET_EDEFAULT);
        return;
      case ColladaPackage.PASS_TYPE__STENCIL_TARGET:
        setStencilTarget(STENCIL_TARGET_EDEFAULT);
        return;
      case ColladaPackage.PASS_TYPE__COLOR_CLEAR:
        setColorClear(COLOR_CLEAR_EDEFAULT);
        return;
      case ColladaPackage.PASS_TYPE__DEPTH_CLEAR:
        unsetDepthClear();
        return;
      case ColladaPackage.PASS_TYPE__STENCIL_CLEAR:
        unsetStencilClear();
        return;
      case ColladaPackage.PASS_TYPE__DRAW:
        setDraw(DRAW_EDEFAULT);
        return;
      case ColladaPackage.PASS_TYPE__GLES_PIPELINE_SETTINGS:
        getGlesPipelineSettings().clear();
        return;
      case ColladaPackage.PASS_TYPE__ALPHA_FUNC:
        getAlphaFunc().clear();
        return;
      case ColladaPackage.PASS_TYPE__BLEND_FUNC:
        getBlendFunc().clear();
        return;
      case ColladaPackage.PASS_TYPE__CLEAR_COLOR:
        getClearColor().clear();
        return;
      case ColladaPackage.PASS_TYPE__CLEAR_STENCIL:
        getClearStencil().clear();
        return;
      case ColladaPackage.PASS_TYPE__CLEAR_DEPTH:
        getClearDepth().clear();
        return;
      case ColladaPackage.PASS_TYPE__CLIP_PLANE:
        getClipPlane().clear();
        return;
      case ColladaPackage.PASS_TYPE__COLOR_MASK:
        getColorMask().clear();
        return;
      case ColladaPackage.PASS_TYPE__CULL_FACE:
        getCullFace().clear();
        return;
      case ColladaPackage.PASS_TYPE__DEPTH_FUNC:
        getDepthFunc().clear();
        return;
      case ColladaPackage.PASS_TYPE__DEPTH_MASK:
        getDepthMask().clear();
        return;
      case ColladaPackage.PASS_TYPE__DEPTH_RANGE:
        getDepthRange().clear();
        return;
      case ColladaPackage.PASS_TYPE__FOG_COLOR:
        getFogColor().clear();
        return;
      case ColladaPackage.PASS_TYPE__FOG_DENSITY:
        getFogDensity().clear();
        return;
      case ColladaPackage.PASS_TYPE__FOG_MODE:
        getFogMode().clear();
        return;
      case ColladaPackage.PASS_TYPE__FOG_START:
        getFogStart().clear();
        return;
      case ColladaPackage.PASS_TYPE__FOG_END:
        getFogEnd().clear();
        return;
      case ColladaPackage.PASS_TYPE__FRONT_FACE:
        getFrontFace().clear();
        return;
      case ColladaPackage.PASS_TYPE__TEXTURE_PIPELINE:
        getTexturePipeline().clear();
        return;
      case ColladaPackage.PASS_TYPE__LOGIC_OP:
        getLogicOp().clear();
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_AMBIENT:
        getLightAmbient().clear();
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_DIFFUSE:
        getLightDiffuse().clear();
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_SPECULAR:
        getLightSpecular().clear();
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_POSITION:
        getLightPosition().clear();
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_CONSTANT_ATTENUATION:
        getLightConstantAttenuation().clear();
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_LINEAR_ATTENUTATION:
        getLightLinearAttenutation().clear();
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_QUADRATIC_ATTENUATION:
        getLightQuadraticAttenuation().clear();
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_SPOT_CUTOFF:
        getLightSpotCutoff().clear();
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_SPOT_DIRECTION:
        getLightSpotDirection().clear();
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_SPOT_EXPONENT:
        getLightSpotExponent().clear();
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_MODEL_AMBIENT:
        getLightModelAmbient().clear();
        return;
      case ColladaPackage.PASS_TYPE__LINE_WIDTH:
        getLineWidth().clear();
        return;
      case ColladaPackage.PASS_TYPE__MATERIAL_AMBIENT:
        getMaterialAmbient().clear();
        return;
      case ColladaPackage.PASS_TYPE__MATERIAL_DIFFUSE:
        getMaterialDiffuse().clear();
        return;
      case ColladaPackage.PASS_TYPE__MATERIAL_EMISSION:
        getMaterialEmission().clear();
        return;
      case ColladaPackage.PASS_TYPE__MATERIAL_SHININESS:
        getMaterialShininess().clear();
        return;
      case ColladaPackage.PASS_TYPE__MATERIAL_SPECULAR:
        getMaterialSpecular().clear();
        return;
      case ColladaPackage.PASS_TYPE__MODEL_VIEW_MATRIX:
        getModelViewMatrix().clear();
        return;
      case ColladaPackage.PASS_TYPE__POINT_DISTANCE_ATTENUATION:
        getPointDistanceAttenuation().clear();
        return;
      case ColladaPackage.PASS_TYPE__POINT_FADE_THRESHOLD_SIZE:
        getPointFadeThresholdSize().clear();
        return;
      case ColladaPackage.PASS_TYPE__POINT_SIZE:
        getPointSize().clear();
        return;
      case ColladaPackage.PASS_TYPE__POINT_SIZE_MIN:
        getPointSizeMin().clear();
        return;
      case ColladaPackage.PASS_TYPE__POINT_SIZE_MAX:
        getPointSizeMax().clear();
        return;
      case ColladaPackage.PASS_TYPE__POLYGON_OFFSET:
        getPolygonOffset().clear();
        return;
      case ColladaPackage.PASS_TYPE__PROJECTION_MATRIX:
        getProjectionMatrix().clear();
        return;
      case ColladaPackage.PASS_TYPE__SCISSOR:
        getScissor().clear();
        return;
      case ColladaPackage.PASS_TYPE__SHADE_MODEL:
        getShadeModel().clear();
        return;
      case ColladaPackage.PASS_TYPE__STENCIL_FUNC:
        getStencilFunc().clear();
        return;
      case ColladaPackage.PASS_TYPE__STENCIL_MASK:
        getStencilMask().clear();
        return;
      case ColladaPackage.PASS_TYPE__STENCIL_OP:
        getStencilOp().clear();
        return;
      case ColladaPackage.PASS_TYPE__ALPHA_TEST_ENABLE:
        getAlphaTestEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__BLEND_ENABLE:
        getBlendEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__CLIP_PLANE_ENABLE:
        getClipPlaneEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__COLOR_LOGIC_OP_ENABLE:
        getColorLogicOpEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__COLOR_MATERIAL_ENABLE:
        getColorMaterialEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__CULL_FACE_ENABLE:
        getCullFaceEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__DEPTH_TEST_ENABLE:
        getDepthTestEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__DITHER_ENABLE:
        getDitherEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__FOG_ENABLE:
        getFogEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__TEXTURE_PIPELINE_ENABLE:
        getTexturePipelineEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_ENABLE:
        getLightEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__LIGHTING_ENABLE:
        getLightingEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__LIGHT_MODEL_TWO_SIDE_ENABLE:
        getLightModelTwoSideEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__LINE_SMOOTH_ENABLE:
        getLineSmoothEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__MULTISAMPLE_ENABLE:
        getMultisampleEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__NORMALIZE_ENABLE:
        getNormalizeEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__POINT_SMOOTH_ENABLE:
        getPointSmoothEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__POLYGON_OFFSET_FILL_ENABLE:
        getPolygonOffsetFillEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__RESCALE_NORMAL_ENABLE:
        getRescaleNormalEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__SAMPLE_ALPHA_TO_COVERAGE_ENABLE:
        getSampleAlphaToCoverageEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__SAMPLE_ALPHA_TO_ONE_ENABLE:
        getSampleAlphaToOneEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__SAMPLE_COVERAGE_ENABLE:
        getSampleCoverageEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__SCISSOR_TEST_ENABLE:
        getScissorTestEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__STENCIL_TEST_ENABLE:
        getStencilTestEnable().clear();
        return;
      case ColladaPackage.PASS_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.PASS_TYPE__SID:
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
      case ColladaPackage.PASS_TYPE__ANNOTATE:
        return annotate != null && !annotate.isEmpty();
      case ColladaPackage.PASS_TYPE__COLOR_TARGET:
        return COLOR_TARGET_EDEFAULT == null ? colorTarget != null : !COLOR_TARGET_EDEFAULT.equals(colorTarget);
      case ColladaPackage.PASS_TYPE__DEPTH_TARGET:
        return DEPTH_TARGET_EDEFAULT == null ? depthTarget != null : !DEPTH_TARGET_EDEFAULT.equals(depthTarget);
      case ColladaPackage.PASS_TYPE__STENCIL_TARGET:
        return STENCIL_TARGET_EDEFAULT == null ? stencilTarget != null : !STENCIL_TARGET_EDEFAULT.equals(stencilTarget);
      case ColladaPackage.PASS_TYPE__COLOR_CLEAR:
        return COLOR_CLEAR_EDEFAULT == null ? colorClear != null : !COLOR_CLEAR_EDEFAULT.equals(colorClear);
      case ColladaPackage.PASS_TYPE__DEPTH_CLEAR:
        return isSetDepthClear();
      case ColladaPackage.PASS_TYPE__STENCIL_CLEAR:
        return isSetStencilClear();
      case ColladaPackage.PASS_TYPE__DRAW:
        return DRAW_EDEFAULT == null ? draw != null : !DRAW_EDEFAULT.equals(draw);
      case ColladaPackage.PASS_TYPE__GLES_PIPELINE_SETTINGS:
        return glesPipelineSettings != null && !glesPipelineSettings.isEmpty();
      case ColladaPackage.PASS_TYPE__ALPHA_FUNC:
        return !getAlphaFunc().isEmpty();
      case ColladaPackage.PASS_TYPE__BLEND_FUNC:
        return !getBlendFunc().isEmpty();
      case ColladaPackage.PASS_TYPE__CLEAR_COLOR:
        return !getClearColor().isEmpty();
      case ColladaPackage.PASS_TYPE__CLEAR_STENCIL:
        return !getClearStencil().isEmpty();
      case ColladaPackage.PASS_TYPE__CLEAR_DEPTH:
        return !getClearDepth().isEmpty();
      case ColladaPackage.PASS_TYPE__CLIP_PLANE:
        return !getClipPlane().isEmpty();
      case ColladaPackage.PASS_TYPE__COLOR_MASK:
        return !getColorMask().isEmpty();
      case ColladaPackage.PASS_TYPE__CULL_FACE:
        return !getCullFace().isEmpty();
      case ColladaPackage.PASS_TYPE__DEPTH_FUNC:
        return !getDepthFunc().isEmpty();
      case ColladaPackage.PASS_TYPE__DEPTH_MASK:
        return !getDepthMask().isEmpty();
      case ColladaPackage.PASS_TYPE__DEPTH_RANGE:
        return !getDepthRange().isEmpty();
      case ColladaPackage.PASS_TYPE__FOG_COLOR:
        return !getFogColor().isEmpty();
      case ColladaPackage.PASS_TYPE__FOG_DENSITY:
        return !getFogDensity().isEmpty();
      case ColladaPackage.PASS_TYPE__FOG_MODE:
        return !getFogMode().isEmpty();
      case ColladaPackage.PASS_TYPE__FOG_START:
        return !getFogStart().isEmpty();
      case ColladaPackage.PASS_TYPE__FOG_END:
        return !getFogEnd().isEmpty();
      case ColladaPackage.PASS_TYPE__FRONT_FACE:
        return !getFrontFace().isEmpty();
      case ColladaPackage.PASS_TYPE__TEXTURE_PIPELINE:
        return !getTexturePipeline().isEmpty();
      case ColladaPackage.PASS_TYPE__LOGIC_OP:
        return !getLogicOp().isEmpty();
      case ColladaPackage.PASS_TYPE__LIGHT_AMBIENT:
        return !getLightAmbient().isEmpty();
      case ColladaPackage.PASS_TYPE__LIGHT_DIFFUSE:
        return !getLightDiffuse().isEmpty();
      case ColladaPackage.PASS_TYPE__LIGHT_SPECULAR:
        return !getLightSpecular().isEmpty();
      case ColladaPackage.PASS_TYPE__LIGHT_POSITION:
        return !getLightPosition().isEmpty();
      case ColladaPackage.PASS_TYPE__LIGHT_CONSTANT_ATTENUATION:
        return !getLightConstantAttenuation().isEmpty();
      case ColladaPackage.PASS_TYPE__LIGHT_LINEAR_ATTENUTATION:
        return !getLightLinearAttenutation().isEmpty();
      case ColladaPackage.PASS_TYPE__LIGHT_QUADRATIC_ATTENUATION:
        return !getLightQuadraticAttenuation().isEmpty();
      case ColladaPackage.PASS_TYPE__LIGHT_SPOT_CUTOFF:
        return !getLightSpotCutoff().isEmpty();
      case ColladaPackage.PASS_TYPE__LIGHT_SPOT_DIRECTION:
        return !getLightSpotDirection().isEmpty();
      case ColladaPackage.PASS_TYPE__LIGHT_SPOT_EXPONENT:
        return !getLightSpotExponent().isEmpty();
      case ColladaPackage.PASS_TYPE__LIGHT_MODEL_AMBIENT:
        return !getLightModelAmbient().isEmpty();
      case ColladaPackage.PASS_TYPE__LINE_WIDTH:
        return !getLineWidth().isEmpty();
      case ColladaPackage.PASS_TYPE__MATERIAL_AMBIENT:
        return !getMaterialAmbient().isEmpty();
      case ColladaPackage.PASS_TYPE__MATERIAL_DIFFUSE:
        return !getMaterialDiffuse().isEmpty();
      case ColladaPackage.PASS_TYPE__MATERIAL_EMISSION:
        return !getMaterialEmission().isEmpty();
      case ColladaPackage.PASS_TYPE__MATERIAL_SHININESS:
        return !getMaterialShininess().isEmpty();
      case ColladaPackage.PASS_TYPE__MATERIAL_SPECULAR:
        return !getMaterialSpecular().isEmpty();
      case ColladaPackage.PASS_TYPE__MODEL_VIEW_MATRIX:
        return !getModelViewMatrix().isEmpty();
      case ColladaPackage.PASS_TYPE__POINT_DISTANCE_ATTENUATION:
        return !getPointDistanceAttenuation().isEmpty();
      case ColladaPackage.PASS_TYPE__POINT_FADE_THRESHOLD_SIZE:
        return !getPointFadeThresholdSize().isEmpty();
      case ColladaPackage.PASS_TYPE__POINT_SIZE:
        return !getPointSize().isEmpty();
      case ColladaPackage.PASS_TYPE__POINT_SIZE_MIN:
        return !getPointSizeMin().isEmpty();
      case ColladaPackage.PASS_TYPE__POINT_SIZE_MAX:
        return !getPointSizeMax().isEmpty();
      case ColladaPackage.PASS_TYPE__POLYGON_OFFSET:
        return !getPolygonOffset().isEmpty();
      case ColladaPackage.PASS_TYPE__PROJECTION_MATRIX:
        return !getProjectionMatrix().isEmpty();
      case ColladaPackage.PASS_TYPE__SCISSOR:
        return !getScissor().isEmpty();
      case ColladaPackage.PASS_TYPE__SHADE_MODEL:
        return !getShadeModel().isEmpty();
      case ColladaPackage.PASS_TYPE__STENCIL_FUNC:
        return !getStencilFunc().isEmpty();
      case ColladaPackage.PASS_TYPE__STENCIL_MASK:
        return !getStencilMask().isEmpty();
      case ColladaPackage.PASS_TYPE__STENCIL_OP:
        return !getStencilOp().isEmpty();
      case ColladaPackage.PASS_TYPE__ALPHA_TEST_ENABLE:
        return !getAlphaTestEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__BLEND_ENABLE:
        return !getBlendEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__CLIP_PLANE_ENABLE:
        return !getClipPlaneEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__COLOR_LOGIC_OP_ENABLE:
        return !getColorLogicOpEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__COLOR_MATERIAL_ENABLE:
        return !getColorMaterialEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__CULL_FACE_ENABLE:
        return !getCullFaceEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__DEPTH_TEST_ENABLE:
        return !getDepthTestEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__DITHER_ENABLE:
        return !getDitherEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__FOG_ENABLE:
        return !getFogEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__TEXTURE_PIPELINE_ENABLE:
        return !getTexturePipelineEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__LIGHT_ENABLE:
        return !getLightEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__LIGHTING_ENABLE:
        return !getLightingEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__LIGHT_MODEL_TWO_SIDE_ENABLE:
        return !getLightModelTwoSideEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__LINE_SMOOTH_ENABLE:
        return !getLineSmoothEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__MULTISAMPLE_ENABLE:
        return !getMultisampleEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__NORMALIZE_ENABLE:
        return !getNormalizeEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__POINT_SMOOTH_ENABLE:
        return !getPointSmoothEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__POLYGON_OFFSET_FILL_ENABLE:
        return !getPolygonOffsetFillEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__RESCALE_NORMAL_ENABLE:
        return !getRescaleNormalEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__SAMPLE_ALPHA_TO_COVERAGE_ENABLE:
        return !getSampleAlphaToCoverageEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__SAMPLE_ALPHA_TO_ONE_ENABLE:
        return !getSampleAlphaToOneEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__SAMPLE_COVERAGE_ENABLE:
        return !getSampleCoverageEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__SCISSOR_TEST_ENABLE:
        return !getScissorTestEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__STENCIL_TEST_ENABLE:
        return !getStencilTestEnable().isEmpty();
      case ColladaPackage.PASS_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.PASS_TYPE__SID:
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
    result.append(" (colorTarget: ");
    result.append(colorTarget);
    result.append(", depthTarget: ");
    result.append(depthTarget);
    result.append(", stencilTarget: ");
    result.append(stencilTarget);
    result.append(", colorClear: ");
    result.append(colorClear);
    result.append(", depthClear: ");
    if (depthClearESet) result.append(depthClear); else result.append("<unset>");
    result.append(", stencilClear: ");
    if (stencilClearESet) result.append(stencilClear); else result.append("<unset>");
    result.append(", draw: ");
    result.append(draw);
    result.append(", glesPipelineSettings: ");
    result.append(glesPipelineSettings);
    result.append(", sid: ");
    result.append(sid);
    result.append(')');
    return result.toString();
  }

} //PassTypeImpl
