/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.util.List;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pass Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.PassType1#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getColorTarget <em>Color Target</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getDepthTarget <em>Depth Target</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getStencilTarget <em>Stencil Target</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getColorClear <em>Color Clear</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getDepthClear <em>Depth Clear</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getStencilClear <em>Stencil Clear</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getDraw <em>Draw</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getAlphaFunc <em>Alpha Func</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getBlendFunc <em>Blend Func</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getBlendFuncSeparate <em>Blend Func Separate</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getBlendEquation <em>Blend Equation</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getBlendEquationSeparate <em>Blend Equation Separate</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getColorMaterial <em>Color Material</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getCullFace <em>Cull Face</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getDepthFunc <em>Depth Func</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getFogMode <em>Fog Mode</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getFogCoordSrc <em>Fog Coord Src</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getFrontFace <em>Front Face</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightModelColorControl <em>Light Model Color Control</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLogicOp <em>Logic Op</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getPolygonMode <em>Polygon Mode</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getShadeModel <em>Shade Model</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getStencilFunc <em>Stencil Func</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getStencilOp <em>Stencil Op</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getStencilFuncSeparate <em>Stencil Func Separate</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getStencilOpSeparate <em>Stencil Op Separate</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getStencilMaskSeparate <em>Stencil Mask Separate</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightEnable <em>Light Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightAmbient <em>Light Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightDiffuse <em>Light Diffuse</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightSpecular <em>Light Specular</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightPosition <em>Light Position</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightConstantAttenuation <em>Light Constant Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightLinearAttenuation <em>Light Linear Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightQuadraticAttenuation <em>Light Quadratic Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightSpotCutoff <em>Light Spot Cutoff</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightSpotDirection <em>Light Spot Direction</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightSpotExponent <em>Light Spot Exponent</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getTexture1D <em>Texture1 D</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getTexture2D <em>Texture2 D</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getTexture3D <em>Texture3 D</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getTextureCUBE <em>Texture CUBE</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getTextureRECT <em>Texture RECT</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getTextureDEPTH <em>Texture DEPTH</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getTexture1DEnable <em>Texture1 DEnable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getTexture2DEnable <em>Texture2 DEnable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getTexture3DEnable <em>Texture3 DEnable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getTextureCUBEEnable <em>Texture CUBE Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getTextureRECTEnable <em>Texture RECT Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getTextureDEPTHEnable <em>Texture DEPTH Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getTextureEnvColor <em>Texture Env Color</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getTextureEnvMode <em>Texture Env Mode</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getClipPlane <em>Clip Plane</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getClipPlaneEnable <em>Clip Plane Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getBlendColor <em>Blend Color</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getClearColor <em>Clear Color</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getClearStencil <em>Clear Stencil</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getClearDepth <em>Clear Depth</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getColorMask <em>Color Mask</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getDepthBounds <em>Depth Bounds</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getDepthMask <em>Depth Mask</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getDepthRange <em>Depth Range</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getFogDensity <em>Fog Density</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getFogStart <em>Fog Start</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getFogEnd <em>Fog End</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getFogColor <em>Fog Color</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightModelAmbient <em>Light Model Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightingEnable <em>Lighting Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLineStipple <em>Line Stipple</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getMaterialAmbient <em>Material Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getMaterialDiffuse <em>Material Diffuse</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getMaterialEmission <em>Material Emission</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getMaterialShininess <em>Material Shininess</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getMaterialSpecular <em>Material Specular</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getModelViewMatrix <em>Model View Matrix</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getPointDistanceAttenuation <em>Point Distance Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getPointFadeThresholdSize <em>Point Fade Threshold Size</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getPointSize <em>Point Size</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getPointSizeMin <em>Point Size Min</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getPointSizeMax <em>Point Size Max</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getPolygonOffset <em>Polygon Offset</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getProjectionMatrix <em>Projection Matrix</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getScissor <em>Scissor</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getStencilMask <em>Stencil Mask</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getAlphaTestEnable <em>Alpha Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getAutoNormalEnable <em>Auto Normal Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getBlendEnable <em>Blend Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getColorLogicOpEnable <em>Color Logic Op Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getColorMaterialEnable <em>Color Material Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getCullFaceEnable <em>Cull Face Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getDepthBoundsEnable <em>Depth Bounds Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getDepthClampEnable <em>Depth Clamp Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getDepthTestEnable <em>Depth Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getDitherEnable <em>Dither Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getFogEnable <em>Fog Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightModelLocalViewerEnable <em>Light Model Local Viewer Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLightModelTwoSideEnable <em>Light Model Two Side Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLineSmoothEnable <em>Line Smooth Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLineStippleEnable <em>Line Stipple Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getLogicOpEnable <em>Logic Op Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getMultisampleEnable <em>Multisample Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getNormalizeEnable <em>Normalize Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getPointSmoothEnable <em>Point Smooth Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getPolygonOffsetFillEnable <em>Polygon Offset Fill Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getPolygonOffsetLineEnable <em>Polygon Offset Line Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getPolygonOffsetPointEnable <em>Polygon Offset Point Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getPolygonSmoothEnable <em>Polygon Smooth Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getPolygonStippleEnable <em>Polygon Stipple Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getRescaleNormalEnable <em>Rescale Normal Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getSampleAlphaToCoverageEnable <em>Sample Alpha To Coverage Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getSampleAlphaToOneEnable <em>Sample Alpha To One Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getSampleCoverageEnable <em>Sample Coverage Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getScissorTestEnable <em>Scissor Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getStencilTestEnable <em>Stencil Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getGlHookAbstractGroup <em>Gl Hook Abstract Group</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getGlHookAbstract <em>Gl Hook Abstract</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getShader <em>Shader</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.PassType1#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getPassType1()
 * @model extendedMetaData="name='pass_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface PassType1 extends EObject {
	/**
   * Returns the value of the '<em><b>Annotate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxAnnotateCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Annotate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_Annotate()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotate' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxAnnotateCommon> getAnnotate();

	/**
   * Returns the value of the '<em><b>Color Target</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxColortargetCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Color Target</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_ColorTarget()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='color_target' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxColortargetCommon> getColorTarget();

	/**
   * Returns the value of the '<em><b>Depth Target</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxDepthtargetCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Depth Target</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_DepthTarget()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='depth_target' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxDepthtargetCommon> getDepthTarget();

	/**
   * Returns the value of the '<em><b>Stencil Target</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxStenciltargetCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stencil Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stencil Target</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_StencilTarget()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='stencil_target' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxStenciltargetCommon> getStencilTarget();

	/**
   * Returns the value of the '<em><b>Color Clear</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxClearcolorCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Clear</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Color Clear</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_ColorClear()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='color_clear' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxClearcolorCommon> getColorClear();

	/**
   * Returns the value of the '<em><b>Depth Clear</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxCleardepthCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Clear</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Depth Clear</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_DepthClear()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='depth_clear' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxCleardepthCommon> getDepthClear();

	/**
   * Returns the value of the '<em><b>Stencil Clear</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxClearstencilCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stencil Clear</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stencil Clear</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_StencilClear()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='stencil_clear' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxClearstencilCommon> getStencilClear();

	/**
   * Returns the value of the '<em><b>Draw</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Draw</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Draw</em>' attribute.
   * @see #setDraw(String)
   * @see org.khronos.collada.ColladaPackage#getPassType1_Draw()
   * @model dataType="org.khronos.collada.FxDrawCommon"
   *        extendedMetaData="kind='element' name='draw' namespace='##targetNamespace'"
   * @generated
   */
	String getDraw();

	/**
   * Sets the value of the '{@link org.khronos.collada.PassType1#getDraw <em>Draw</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Draw</em>' attribute.
   * @see #getDraw()
   * @generated
   */
	void setDraw(String value);

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
   * @see org.khronos.collada.ColladaPackage#getPassType1_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:8'"
   * @generated
   */
	FeatureMap getGroup();

	/**
   * Returns the value of the '<em><b>Alpha Func</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.AlphaFuncType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha Func</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Alpha Func</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_AlphaFunc()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='alpha_func' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<AlphaFuncType1> getAlphaFunc();

	/**
   * Returns the value of the '<em><b>Blend Func</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.BlendFuncType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blend Func</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Blend Func</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_BlendFunc()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='blend_func' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<BlendFuncType1> getBlendFunc();

	/**
   * Returns the value of the '<em><b>Blend Func Separate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.BlendFuncSeparateType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blend Func Separate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Blend Func Separate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_BlendFuncSeparate()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='blend_func_separate' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<BlendFuncSeparateType> getBlendFuncSeparate();

	/**
   * Returns the value of the '<em><b>Blend Equation</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.BlendEquationType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blend Equation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Blend Equation</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_BlendEquation()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='blend_equation' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<BlendEquationType> getBlendEquation();

	/**
   * Returns the value of the '<em><b>Blend Equation Separate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.BlendEquationSeparateType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blend Equation Separate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Blend Equation Separate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_BlendEquationSeparate()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='blend_equation_separate' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<BlendEquationSeparateType> getBlendEquationSeparate();

	/**
   * Returns the value of the '<em><b>Color Material</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ColorMaterialType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Material</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Color Material</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_ColorMaterial()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='color_material' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<ColorMaterialType> getColorMaterial();

	/**
   * Returns the value of the '<em><b>Cull Face</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CullFaceType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cull Face</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Cull Face</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_CullFace()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='cull_face' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<CullFaceType1> getCullFace();

	/**
   * Returns the value of the '<em><b>Depth Func</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.DepthFuncType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Func</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Depth Func</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_DepthFunc()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='depth_func' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<DepthFuncType1> getDepthFunc();

	/**
   * Returns the value of the '<em><b>Fog Mode</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FogModeType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fog Mode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fog Mode</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_FogMode()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fog_mode' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<FogModeType1> getFogMode();

	/**
   * Returns the value of the '<em><b>Fog Coord Src</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FogCoordSrcType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fog Coord Src</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fog Coord Src</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_FogCoordSrc()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fog_coord_src' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<FogCoordSrcType> getFogCoordSrc();

	/**
   * Returns the value of the '<em><b>Front Face</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FrontFaceType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Front Face</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Front Face</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_FrontFace()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='front_face' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<FrontFaceType1> getFrontFace();

	/**
   * Returns the value of the '<em><b>Light Model Color Control</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightModelColorControlType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Model Color Control</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Model Color Control</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightModelColorControl()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_model_color_control' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightModelColorControlType> getLightModelColorControl();

	/**
   * Returns the value of the '<em><b>Logic Op</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LogicOpType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logic Op</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Logic Op</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LogicOp()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='logic_op' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LogicOpType1> getLogicOp();

	/**
   * Returns the value of the '<em><b>Polygon Mode</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PolygonModeType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Mode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Polygon Mode</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_PolygonMode()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='polygon_mode' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<PolygonModeType> getPolygonMode();

	/**
   * Returns the value of the '<em><b>Shade Model</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ShadeModelType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shade Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Shade Model</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_ShadeModel()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='shade_model' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<ShadeModelType1> getShadeModel();

	/**
   * Returns the value of the '<em><b>Stencil Func</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.StencilFuncType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stencil Func</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stencil Func</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_StencilFunc()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='stencil_func' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<StencilFuncType1> getStencilFunc();

	/**
   * Returns the value of the '<em><b>Stencil Op</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.StencilOpType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stencil Op</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stencil Op</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_StencilOp()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='stencil_op' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<StencilOpType1> getStencilOp();

	/**
   * Returns the value of the '<em><b>Stencil Func Separate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.StencilFuncSeparateType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stencil Func Separate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stencil Func Separate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_StencilFuncSeparate()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='stencil_func_separate' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<StencilFuncSeparateType> getStencilFuncSeparate();

	/**
   * Returns the value of the '<em><b>Stencil Op Separate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.StencilOpSeparateType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stencil Op Separate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stencil Op Separate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_StencilOpSeparate()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='stencil_op_separate' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<StencilOpSeparateType> getStencilOpSeparate();

	/**
   * Returns the value of the '<em><b>Stencil Mask Separate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.StencilMaskSeparateType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stencil Mask Separate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stencil Mask Separate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_StencilMaskSeparate()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='stencil_mask_separate' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<StencilMaskSeparateType> getStencilMaskSeparate();

	/**
   * Returns the value of the '<em><b>Light Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightEnableType1> getLightEnable();

	/**
   * Returns the value of the '<em><b>Light Ambient</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightAmbientType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Ambient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Ambient</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightAmbient()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_ambient' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightAmbientType1> getLightAmbient();

	/**
   * Returns the value of the '<em><b>Light Diffuse</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightDiffuseType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Diffuse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Diffuse</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightDiffuse()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_diffuse' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightDiffuseType1> getLightDiffuse();

	/**
   * Returns the value of the '<em><b>Light Specular</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightSpecularType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Specular</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Specular</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightSpecular()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_specular' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightSpecularType1> getLightSpecular();

	/**
   * Returns the value of the '<em><b>Light Position</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightPositionType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Position</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Position</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightPosition()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_position' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightPositionType1> getLightPosition();

	/**
   * Returns the value of the '<em><b>Light Constant Attenuation</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightConstantAttenuationType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Constant Attenuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Constant Attenuation</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightConstantAttenuation()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_constant_attenuation' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightConstantAttenuationType1> getLightConstantAttenuation();

	/**
   * Returns the value of the '<em><b>Light Linear Attenuation</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightLinearAttenuationType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Linear Attenuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Linear Attenuation</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightLinearAttenuation()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_linear_attenuation' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightLinearAttenuationType> getLightLinearAttenuation();

	/**
   * Returns the value of the '<em><b>Light Quadratic Attenuation</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightQuadraticAttenuationType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Quadratic Attenuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Quadratic Attenuation</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightQuadraticAttenuation()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_quadratic_attenuation' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightQuadraticAttenuationType1> getLightQuadraticAttenuation();

	/**
   * Returns the value of the '<em><b>Light Spot Cutoff</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightSpotCutoffType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Spot Cutoff</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Spot Cutoff</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightSpotCutoff()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_spot_cutoff' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightSpotCutoffType1> getLightSpotCutoff();

	/**
   * Returns the value of the '<em><b>Light Spot Direction</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightSpotDirectionType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Spot Direction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Spot Direction</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightSpotDirection()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_spot_direction' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightSpotDirectionType1> getLightSpotDirection();

	/**
   * Returns the value of the '<em><b>Light Spot Exponent</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightSpotExponentType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Spot Exponent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Spot Exponent</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightSpotExponent()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_spot_exponent' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightSpotExponentType1> getLightSpotExponent();

	/**
   * Returns the value of the '<em><b>Texture1 D</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.Texture1DType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture1 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture1 D</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_Texture1D()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='texture1D' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<Texture1DType> getTexture1D();

	/**
   * Returns the value of the '<em><b>Texture2 D</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.Texture2DType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture2 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture2 D</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_Texture2D()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='texture2D' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<Texture2DType> getTexture2D();

	/**
   * Returns the value of the '<em><b>Texture3 D</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.Texture3DType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture3 D</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_Texture3D()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='texture3D' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<Texture3DType> getTexture3D();

	/**
   * Returns the value of the '<em><b>Texture CUBE</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TextureCUBEType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture CUBE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture CUBE</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_TextureCUBE()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='textureCUBE' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<TextureCUBEType> getTextureCUBE();

	/**
   * Returns the value of the '<em><b>Texture RECT</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TextureRECTType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture RECT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture RECT</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_TextureRECT()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='textureRECT' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<TextureRECTType> getTextureRECT();

	/**
   * Returns the value of the '<em><b>Texture DEPTH</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TextureDEPTHType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture DEPTH</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture DEPTH</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_TextureDEPTH()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='textureDEPTH' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<TextureDEPTHType> getTextureDEPTH();

	/**
   * Returns the value of the '<em><b>Texture1 DEnable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.Texture1DEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture1 DEnable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture1 DEnable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_Texture1DEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='texture1D_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<Texture1DEnableType> getTexture1DEnable();

	/**
   * Returns the value of the '<em><b>Texture2 DEnable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.Texture2DEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture2 DEnable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture2 DEnable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_Texture2DEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='texture2D_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<Texture2DEnableType> getTexture2DEnable();

	/**
   * Returns the value of the '<em><b>Texture3 DEnable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.Texture3DEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture3 DEnable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture3 DEnable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_Texture3DEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='texture3D_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<Texture3DEnableType> getTexture3DEnable();

	/**
   * Returns the value of the '<em><b>Texture CUBE Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TextureCUBEEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture CUBE Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture CUBE Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_TextureCUBEEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='textureCUBE_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<TextureCUBEEnableType> getTextureCUBEEnable();

	/**
   * Returns the value of the '<em><b>Texture RECT Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TextureRECTEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture RECT Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture RECT Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_TextureRECTEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='textureRECT_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<TextureRECTEnableType> getTextureRECTEnable();

	/**
   * Returns the value of the '<em><b>Texture DEPTH Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TextureDEPTHEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture DEPTH Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture DEPTH Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_TextureDEPTHEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='textureDEPTH_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<TextureDEPTHEnableType> getTextureDEPTHEnable();

	/**
   * Returns the value of the '<em><b>Texture Env Color</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TextureEnvColorType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Env Color</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture Env Color</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_TextureEnvColor()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='texture_env_color' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<TextureEnvColorType> getTextureEnvColor();

	/**
   * Returns the value of the '<em><b>Texture Env Mode</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TextureEnvModeType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Env Mode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture Env Mode</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_TextureEnvMode()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='texture_env_mode' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<TextureEnvModeType> getTextureEnvMode();

	/**
   * Returns the value of the '<em><b>Clip Plane</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ClipPlaneType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip Plane</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Clip Plane</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_ClipPlane()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='clip_plane' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<ClipPlaneType1> getClipPlane();

	/**
   * Returns the value of the '<em><b>Clip Plane Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ClipPlaneEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip Plane Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Clip Plane Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_ClipPlaneEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='clip_plane_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<ClipPlaneEnableType1> getClipPlaneEnable();

	/**
   * Returns the value of the '<em><b>Blend Color</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.BlendColorType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blend Color</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Blend Color</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_BlendColor()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='blend_color' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<BlendColorType> getBlendColor();

	/**
   * Returns the value of the '<em><b>Clear Color</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ClearColorType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clear Color</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Clear Color</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_ClearColor()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='clear_color' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<ClearColorType1> getClearColor();

	/**
   * Returns the value of the '<em><b>Clear Stencil</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ClearStencilType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clear Stencil</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Clear Stencil</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_ClearStencil()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='clear_stencil' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<ClearStencilType1> getClearStencil();

	/**
   * Returns the value of the '<em><b>Clear Depth</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ClearDepthType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clear Depth</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Clear Depth</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_ClearDepth()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='clear_depth' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<ClearDepthType1> getClearDepth();

	/**
   * Returns the value of the '<em><b>Color Mask</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ColorMaskType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Mask</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Color Mask</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_ColorMask()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='color_mask' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<ColorMaskType1> getColorMask();

	/**
   * Returns the value of the '<em><b>Depth Bounds</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.DepthBoundsType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Bounds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Depth Bounds</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_DepthBounds()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='depth_bounds' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<DepthBoundsType> getDepthBounds();

	/**
   * Returns the value of the '<em><b>Depth Mask</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.DepthMaskType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Mask</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Depth Mask</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_DepthMask()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='depth_mask' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<DepthMaskType1> getDepthMask();

	/**
   * Returns the value of the '<em><b>Depth Range</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.DepthRangeType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Depth Range</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_DepthRange()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='depth_range' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<DepthRangeType1> getDepthRange();

	/**
   * Returns the value of the '<em><b>Fog Density</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FogDensityType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fog Density</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fog Density</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_FogDensity()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fog_density' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<FogDensityType1> getFogDensity();

	/**
   * Returns the value of the '<em><b>Fog Start</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FogStartType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fog Start</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fog Start</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_FogStart()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fog_start' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<FogStartType1> getFogStart();

	/**
   * Returns the value of the '<em><b>Fog End</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FogEndType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fog End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fog End</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_FogEnd()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fog_end' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<FogEndType1> getFogEnd();

	/**
   * Returns the value of the '<em><b>Fog Color</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FogColorType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fog Color</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fog Color</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_FogColor()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fog_color' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<FogColorType1> getFogColor();

	/**
   * Returns the value of the '<em><b>Light Model Ambient</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightModelAmbientType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Model Ambient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Model Ambient</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightModelAmbient()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_model_ambient' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightModelAmbientType1> getLightModelAmbient();

	/**
   * Returns the value of the '<em><b>Lighting Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightingEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lighting Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Lighting Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightingEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='lighting_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightingEnableType1> getLightingEnable();

	/**
   * Returns the value of the '<em><b>Line Stipple</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LineStippleType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Stipple</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Line Stipple</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LineStipple()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='line_stipple' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LineStippleType> getLineStipple();

	/**
   * Returns the value of the '<em><b>Line Width</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LineWidthType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Width</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Line Width</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LineWidth()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='line_width' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LineWidthType1> getLineWidth();

	/**
   * Returns the value of the '<em><b>Material Ambient</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.MaterialAmbientType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Ambient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Material Ambient</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_MaterialAmbient()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='material_ambient' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<MaterialAmbientType1> getMaterialAmbient();

	/**
   * Returns the value of the '<em><b>Material Diffuse</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.MaterialDiffuseType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Diffuse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Material Diffuse</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_MaterialDiffuse()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='material_diffuse' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<MaterialDiffuseType1> getMaterialDiffuse();

	/**
   * Returns the value of the '<em><b>Material Emission</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.MaterialEmissionType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Emission</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Material Emission</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_MaterialEmission()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='material_emission' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<MaterialEmissionType1> getMaterialEmission();

	/**
   * Returns the value of the '<em><b>Material Shininess</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.MaterialShininessType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Shininess</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Material Shininess</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_MaterialShininess()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='material_shininess' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<MaterialShininessType1> getMaterialShininess();

	/**
   * Returns the value of the '<em><b>Material Specular</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.MaterialSpecularType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Specular</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Material Specular</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_MaterialSpecular()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='material_specular' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<MaterialSpecularType1> getMaterialSpecular();

	/**
   * Returns the value of the '<em><b>Model View Matrix</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ModelViewMatrixType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model View Matrix</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Model View Matrix</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_ModelViewMatrix()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='model_view_matrix' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<ModelViewMatrixType1> getModelViewMatrix();

	/**
   * Returns the value of the '<em><b>Point Distance Attenuation</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PointDistanceAttenuationType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Distance Attenuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Point Distance Attenuation</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_PointDistanceAttenuation()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='point_distance_attenuation' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<PointDistanceAttenuationType1> getPointDistanceAttenuation();

	/**
   * Returns the value of the '<em><b>Point Fade Threshold Size</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PointFadeThresholdSizeType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Fade Threshold Size</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Point Fade Threshold Size</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_PointFadeThresholdSize()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='point_fade_threshold_size' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<PointFadeThresholdSizeType1> getPointFadeThresholdSize();

	/**
   * Returns the value of the '<em><b>Point Size</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PointSizeType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Size</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Point Size</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_PointSize()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='point_size' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<PointSizeType1> getPointSize();

	/**
   * Returns the value of the '<em><b>Point Size Min</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PointSizeMinType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Size Min</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Point Size Min</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_PointSizeMin()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='point_size_min' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<PointSizeMinType1> getPointSizeMin();

	/**
   * Returns the value of the '<em><b>Point Size Max</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PointSizeMaxType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Size Max</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Point Size Max</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_PointSizeMax()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='point_size_max' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<PointSizeMaxType1> getPointSizeMax();

	/**
   * Returns the value of the '<em><b>Polygon Offset</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PolygonOffsetType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Offset</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Polygon Offset</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_PolygonOffset()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='polygon_offset' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<PolygonOffsetType1> getPolygonOffset();

	/**
   * Returns the value of the '<em><b>Projection Matrix</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ProjectionMatrixType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection Matrix</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Projection Matrix</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_ProjectionMatrix()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='projection_matrix' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<ProjectionMatrixType1> getProjectionMatrix();

	/**
   * Returns the value of the '<em><b>Scissor</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ScissorType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scissor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Scissor</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_Scissor()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='scissor' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<ScissorType1> getScissor();

	/**
   * Returns the value of the '<em><b>Stencil Mask</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.StencilMaskType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stencil Mask</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stencil Mask</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_StencilMask()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='stencil_mask' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<StencilMaskType1> getStencilMask();

	/**
   * Returns the value of the '<em><b>Alpha Test Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.AlphaTestEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha Test Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Alpha Test Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_AlphaTestEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='alpha_test_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<AlphaTestEnableType1> getAlphaTestEnable();

	/**
   * Returns the value of the '<em><b>Auto Normal Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.AutoNormalEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Normal Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Auto Normal Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_AutoNormalEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='auto_normal_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<AutoNormalEnableType> getAutoNormalEnable();

	/**
   * Returns the value of the '<em><b>Blend Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.BlendEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blend Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Blend Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_BlendEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='blend_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<BlendEnableType1> getBlendEnable();

	/**
   * Returns the value of the '<em><b>Color Logic Op Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ColorLogicOpEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Logic Op Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Color Logic Op Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_ColorLogicOpEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='color_logic_op_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<ColorLogicOpEnableType1> getColorLogicOpEnable();

	/**
   * Returns the value of the '<em><b>Color Material Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ColorMaterialEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Material Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Color Material Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_ColorMaterialEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='color_material_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<ColorMaterialEnableType1> getColorMaterialEnable();

	/**
   * Returns the value of the '<em><b>Cull Face Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CullFaceEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cull Face Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Cull Face Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_CullFaceEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='cull_face_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<CullFaceEnableType1> getCullFaceEnable();

	/**
   * Returns the value of the '<em><b>Depth Bounds Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.DepthBoundsEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Bounds Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Depth Bounds Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_DepthBoundsEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='depth_bounds_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<DepthBoundsEnableType> getDepthBoundsEnable();

	/**
   * Returns the value of the '<em><b>Depth Clamp Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.DepthClampEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Clamp Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Depth Clamp Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_DepthClampEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='depth_clamp_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<DepthClampEnableType> getDepthClampEnable();

	/**
   * Returns the value of the '<em><b>Depth Test Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.DepthTestEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Test Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Depth Test Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_DepthTestEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='depth_test_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<DepthTestEnableType1> getDepthTestEnable();

	/**
   * Returns the value of the '<em><b>Dither Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.DitherEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dither Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Dither Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_DitherEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='dither_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<DitherEnableType1> getDitherEnable();

	/**
   * Returns the value of the '<em><b>Fog Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FogEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fog Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fog Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_FogEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fog_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<FogEnableType1> getFogEnable();

	/**
   * Returns the value of the '<em><b>Light Model Local Viewer Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightModelLocalViewerEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Model Local Viewer Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Model Local Viewer Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightModelLocalViewerEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_model_local_viewer_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightModelLocalViewerEnableType> getLightModelLocalViewerEnable();

	/**
   * Returns the value of the '<em><b>Light Model Two Side Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightModelTwoSideEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Model Two Side Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Model Two Side Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LightModelTwoSideEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_model_two_side_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LightModelTwoSideEnableType1> getLightModelTwoSideEnable();

	/**
   * Returns the value of the '<em><b>Line Smooth Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LineSmoothEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Smooth Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Line Smooth Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LineSmoothEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='line_smooth_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LineSmoothEnableType1> getLineSmoothEnable();

	/**
   * Returns the value of the '<em><b>Line Stipple Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LineStippleEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Stipple Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Line Stipple Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LineStippleEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='line_stipple_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LineStippleEnableType> getLineStippleEnable();

	/**
   * Returns the value of the '<em><b>Logic Op Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LogicOpEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logic Op Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Logic Op Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_LogicOpEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='logic_op_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<LogicOpEnableType> getLogicOpEnable();

	/**
   * Returns the value of the '<em><b>Multisample Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.MultisampleEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multisample Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Multisample Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_MultisampleEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='multisample_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<MultisampleEnableType1> getMultisampleEnable();

	/**
   * Returns the value of the '<em><b>Normalize Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.NormalizeEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normalize Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Normalize Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_NormalizeEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='normalize_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<NormalizeEnableType1> getNormalizeEnable();

	/**
   * Returns the value of the '<em><b>Point Smooth Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PointSmoothEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Smooth Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Point Smooth Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_PointSmoothEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='point_smooth_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<PointSmoothEnableType1> getPointSmoothEnable();

	/**
   * Returns the value of the '<em><b>Polygon Offset Fill Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PolygonOffsetFillEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Offset Fill Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Polygon Offset Fill Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_PolygonOffsetFillEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='polygon_offset_fill_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<PolygonOffsetFillEnableType1> getPolygonOffsetFillEnable();

	/**
   * Returns the value of the '<em><b>Polygon Offset Line Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PolygonOffsetLineEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Offset Line Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Polygon Offset Line Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_PolygonOffsetLineEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='polygon_offset_line_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<PolygonOffsetLineEnableType> getPolygonOffsetLineEnable();

	/**
   * Returns the value of the '<em><b>Polygon Offset Point Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PolygonOffsetPointEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Offset Point Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Polygon Offset Point Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_PolygonOffsetPointEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='polygon_offset_point_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<PolygonOffsetPointEnableType> getPolygonOffsetPointEnable();

	/**
   * Returns the value of the '<em><b>Polygon Smooth Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PolygonSmoothEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Smooth Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Polygon Smooth Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_PolygonSmoothEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='polygon_smooth_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<PolygonSmoothEnableType> getPolygonSmoothEnable();

	/**
   * Returns the value of the '<em><b>Polygon Stipple Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PolygonStippleEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Stipple Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Polygon Stipple Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_PolygonStippleEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='polygon_stipple_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<PolygonStippleEnableType> getPolygonStippleEnable();

	/**
   * Returns the value of the '<em><b>Rescale Normal Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.RescaleNormalEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rescale Normal Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Rescale Normal Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_RescaleNormalEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='rescale_normal_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<RescaleNormalEnableType1> getRescaleNormalEnable();

	/**
   * Returns the value of the '<em><b>Sample Alpha To Coverage Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SampleAlphaToCoverageEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Alpha To Coverage Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sample Alpha To Coverage Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_SampleAlphaToCoverageEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='sample_alpha_to_coverage_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<SampleAlphaToCoverageEnableType1> getSampleAlphaToCoverageEnable();

	/**
   * Returns the value of the '<em><b>Sample Alpha To One Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SampleAlphaToOneEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Alpha To One Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sample Alpha To One Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_SampleAlphaToOneEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='sample_alpha_to_one_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<SampleAlphaToOneEnableType1> getSampleAlphaToOneEnable();

	/**
   * Returns the value of the '<em><b>Sample Coverage Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SampleCoverageEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Coverage Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sample Coverage Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_SampleCoverageEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='sample_coverage_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<SampleCoverageEnableType1> getSampleCoverageEnable();

	/**
   * Returns the value of the '<em><b>Scissor Test Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ScissorTestEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scissor Test Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Scissor Test Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_ScissorTestEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='scissor_test_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<ScissorTestEnableType1> getScissorTestEnable();

	/**
   * Returns the value of the '<em><b>Stencil Test Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.StencilTestEnableType1}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stencil Test Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stencil Test Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_StencilTestEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='stencil_test_enable' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<StencilTestEnableType1> getStencilTestEnable();

	/**
   * Returns the value of the '<em><b>Gl Hook Abstract Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Hook Abstract Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Gl Hook Abstract Group</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_GlHookAbstractGroup()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='group' name='gl_hook_abstract:group' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	FeatureMap getGlHookAbstractGroup();

	/**
   * Returns the value of the '<em><b>Gl Hook Abstract</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Hook Abstract</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Gl Hook Abstract</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_GlHookAbstract()
   * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='gl_hook_abstract' namespace='##targetNamespace' group='gl_hook_abstract:group'"
   * @generated
   */
	EList<EObject> getGlHookAbstract();

	/**
   * Returns the value of the '<em><b>Shader</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ShaderType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 													Declare and prepare a shader for execution in the rendering pipeline of a pass.
   * 													
   * <!-- end-model-doc -->
   * @return the value of the '<em>Shader</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_Shader()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='shader' namespace='##targetNamespace' group='#group:8'"
   * @generated
   */
	EList<ShaderType> getShader();

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ExtraType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The extra element declares additional information regarding its parent element.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType1_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 											The sid attribute is a text string value containing the sub-identifier of this element. 
   * 											This value must be unique within the scope of the parent element. Optional attribute.
   * 											
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sid</em>' attribute.
   * @see #setSid(String)
   * @see org.khronos.collada.ColladaPackage#getPassType1_Sid()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.PassType1#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

} // PassType1
