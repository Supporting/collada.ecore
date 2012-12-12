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
 * A representation of the model object '<em><b>Pass Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.PassType#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getColorTarget <em>Color Target</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getDepthTarget <em>Depth Target</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getStencilTarget <em>Stencil Target</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getColorClear <em>Color Clear</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getDepthClear <em>Depth Clear</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getStencilClear <em>Stencil Clear</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getDraw <em>Draw</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getGlesPipelineSettings <em>Gles Pipeline Settings</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getAlphaFunc <em>Alpha Func</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getBlendFunc <em>Blend Func</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getClearColor <em>Clear Color</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getClearStencil <em>Clear Stencil</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getClearDepth <em>Clear Depth</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getClipPlane <em>Clip Plane</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getColorMask <em>Color Mask</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getCullFace <em>Cull Face</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getDepthFunc <em>Depth Func</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getDepthMask <em>Depth Mask</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getDepthRange <em>Depth Range</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getFogColor <em>Fog Color</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getFogDensity <em>Fog Density</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getFogMode <em>Fog Mode</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getFogStart <em>Fog Start</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getFogEnd <em>Fog End</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getFrontFace <em>Front Face</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getTexturePipeline <em>Texture Pipeline</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLogicOp <em>Logic Op</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLightAmbient <em>Light Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLightDiffuse <em>Light Diffuse</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLightSpecular <em>Light Specular</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLightPosition <em>Light Position</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLightConstantAttenuation <em>Light Constant Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLightLinearAttenutation <em>Light Linear Attenutation</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLightQuadraticAttenuation <em>Light Quadratic Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLightSpotCutoff <em>Light Spot Cutoff</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLightSpotDirection <em>Light Spot Direction</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLightSpotExponent <em>Light Spot Exponent</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLightModelAmbient <em>Light Model Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getMaterialAmbient <em>Material Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getMaterialDiffuse <em>Material Diffuse</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getMaterialEmission <em>Material Emission</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getMaterialShininess <em>Material Shininess</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getMaterialSpecular <em>Material Specular</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getModelViewMatrix <em>Model View Matrix</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getPointDistanceAttenuation <em>Point Distance Attenuation</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getPointFadeThresholdSize <em>Point Fade Threshold Size</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getPointSize <em>Point Size</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getPointSizeMin <em>Point Size Min</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getPointSizeMax <em>Point Size Max</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getPolygonOffset <em>Polygon Offset</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getProjectionMatrix <em>Projection Matrix</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getScissor <em>Scissor</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getShadeModel <em>Shade Model</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getStencilFunc <em>Stencil Func</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getStencilMask <em>Stencil Mask</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getStencilOp <em>Stencil Op</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getAlphaTestEnable <em>Alpha Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getBlendEnable <em>Blend Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getClipPlaneEnable <em>Clip Plane Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getColorLogicOpEnable <em>Color Logic Op Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getColorMaterialEnable <em>Color Material Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getCullFaceEnable <em>Cull Face Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getDepthTestEnable <em>Depth Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getDitherEnable <em>Dither Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getFogEnable <em>Fog Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getTexturePipelineEnable <em>Texture Pipeline Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLightEnable <em>Light Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLightingEnable <em>Lighting Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLightModelTwoSideEnable <em>Light Model Two Side Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getLineSmoothEnable <em>Line Smooth Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getMultisampleEnable <em>Multisample Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getNormalizeEnable <em>Normalize Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getPointSmoothEnable <em>Point Smooth Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getPolygonOffsetFillEnable <em>Polygon Offset Fill Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getRescaleNormalEnable <em>Rescale Normal Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getSampleAlphaToCoverageEnable <em>Sample Alpha To Coverage Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getSampleAlphaToOneEnable <em>Sample Alpha To One Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getSampleCoverageEnable <em>Sample Coverage Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getScissorTestEnable <em>Scissor Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getStencilTestEnable <em>Stencil Test Enable</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.PassType#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getPassType()
 * @model extendedMetaData="name='pass_._type' kind='elementOnly'"
 * @generated
 */
public interface PassType extends EObject {
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
   * @see org.khronos.collada.ColladaPackage#getPassType_Annotate()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotate' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxAnnotateCommon> getAnnotate();

	/**
   * Returns the value of the '<em><b>Color Target</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Color Target</em>' attribute.
   * @see #setColorTarget(String)
   * @see org.khronos.collada.ColladaPackage#getPassType_ColorTarget()
   * @model dataType="org.khronos.collada.GlesRendertargetCommon"
   *        extendedMetaData="kind='element' name='color_target' namespace='##targetNamespace'"
   * @generated
   */
	String getColorTarget();

	/**
   * Sets the value of the '{@link org.khronos.collada.PassType#getColorTarget <em>Color Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color Target</em>' attribute.
   * @see #getColorTarget()
   * @generated
   */
	void setColorTarget(String value);

	/**
   * Returns the value of the '<em><b>Depth Target</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Depth Target</em>' attribute.
   * @see #setDepthTarget(String)
   * @see org.khronos.collada.ColladaPackage#getPassType_DepthTarget()
   * @model dataType="org.khronos.collada.GlesRendertargetCommon"
   *        extendedMetaData="kind='element' name='depth_target' namespace='##targetNamespace'"
   * @generated
   */
	String getDepthTarget();

	/**
   * Sets the value of the '{@link org.khronos.collada.PassType#getDepthTarget <em>Depth Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Depth Target</em>' attribute.
   * @see #getDepthTarget()
   * @generated
   */
	void setDepthTarget(String value);

	/**
   * Returns the value of the '<em><b>Stencil Target</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stencil Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stencil Target</em>' attribute.
   * @see #setStencilTarget(String)
   * @see org.khronos.collada.ColladaPackage#getPassType_StencilTarget()
   * @model dataType="org.khronos.collada.GlesRendertargetCommon"
   *        extendedMetaData="kind='element' name='stencil_target' namespace='##targetNamespace'"
   * @generated
   */
	String getStencilTarget();

	/**
   * Sets the value of the '{@link org.khronos.collada.PassType#getStencilTarget <em>Stencil Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stencil Target</em>' attribute.
   * @see #getStencilTarget()
   * @generated
   */
	void setStencilTarget(String value);

	/**
   * Returns the value of the '<em><b>Color Clear</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Clear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Color Clear</em>' attribute.
   * @see #setColorClear(List)
   * @see org.khronos.collada.ColladaPackage#getPassType_ColorClear()
   * @model dataType="org.khronos.collada.FxColorCommon" many="false"
   *        extendedMetaData="kind='element' name='color_clear' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getColorClear();

	/**
   * Sets the value of the '{@link org.khronos.collada.PassType#getColorClear <em>Color Clear</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color Clear</em>' attribute.
   * @see #getColorClear()
   * @generated
   */
	void setColorClear(List<Double> value);

	/**
   * Returns the value of the '<em><b>Depth Clear</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Clear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Depth Clear</em>' attribute.
   * @see #isSetDepthClear()
   * @see #unsetDepthClear()
   * @see #setDepthClear(double)
   * @see org.khronos.collada.ColladaPackage#getPassType_DepthClear()
   * @model unsettable="true" dataType="org.khronos.collada.Float"
   *        extendedMetaData="kind='element' name='depth_clear' namespace='##targetNamespace'"
   * @generated
   */
	double getDepthClear();

	/**
   * Sets the value of the '{@link org.khronos.collada.PassType#getDepthClear <em>Depth Clear</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Depth Clear</em>' attribute.
   * @see #isSetDepthClear()
   * @see #unsetDepthClear()
   * @see #getDepthClear()
   * @generated
   */
	void setDepthClear(double value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.PassType#getDepthClear <em>Depth Clear</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetDepthClear()
   * @see #getDepthClear()
   * @see #setDepthClear(double)
   * @generated
   */
	void unsetDepthClear();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.PassType#getDepthClear <em>Depth Clear</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Depth Clear</em>' attribute is set.
   * @see #unsetDepthClear()
   * @see #getDepthClear()
   * @see #setDepthClear(double)
   * @generated
   */
	boolean isSetDepthClear();

	/**
   * Returns the value of the '<em><b>Stencil Clear</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stencil Clear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stencil Clear</em>' attribute.
   * @see #isSetStencilClear()
   * @see #unsetStencilClear()
   * @see #setStencilClear(byte)
   * @see org.khronos.collada.ColladaPackage#getPassType_StencilClear()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
   *        extendedMetaData="kind='element' name='stencil_clear' namespace='##targetNamespace'"
   * @generated
   */
	byte getStencilClear();

	/**
   * Sets the value of the '{@link org.khronos.collada.PassType#getStencilClear <em>Stencil Clear</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stencil Clear</em>' attribute.
   * @see #isSetStencilClear()
   * @see #unsetStencilClear()
   * @see #getStencilClear()
   * @generated
   */
	void setStencilClear(byte value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.PassType#getStencilClear <em>Stencil Clear</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetStencilClear()
   * @see #getStencilClear()
   * @see #setStencilClear(byte)
   * @generated
   */
	void unsetStencilClear();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.PassType#getStencilClear <em>Stencil Clear</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Stencil Clear</em>' attribute is set.
   * @see #unsetStencilClear()
   * @see #getStencilClear()
   * @see #setStencilClear(byte)
   * @generated
   */
	boolean isSetStencilClear();

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
   * @see org.khronos.collada.ColladaPackage#getPassType_Draw()
   * @model dataType="org.khronos.collada.FxDrawCommon"
   *        extendedMetaData="kind='element' name='draw' namespace='##targetNamespace'"
   * @generated
   */
	String getDraw();

	/**
   * Sets the value of the '{@link org.khronos.collada.PassType#getDraw <em>Draw</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Draw</em>' attribute.
   * @see #getDraw()
   * @generated
   */
	void setDraw(String value);

	/**
   * Returns the value of the '<em><b>Gles Pipeline Settings</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gles Pipeline Settings</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Gles Pipeline Settings</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getPassType_GlesPipelineSettings()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='GlesPipelineSettings:8'"
   * @generated
   */
	FeatureMap getGlesPipelineSettings();

	/**
   * Returns the value of the '<em><b>Alpha Func</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.AlphaFuncType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha Func</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Alpha Func</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_AlphaFunc()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='alpha_func' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<AlphaFuncType> getAlphaFunc();

	/**
   * Returns the value of the '<em><b>Blend Func</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.BlendFuncType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blend Func</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Blend Func</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_BlendFunc()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='blend_func' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<BlendFuncType> getBlendFunc();

	/**
   * Returns the value of the '<em><b>Clear Color</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ClearColorType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clear Color</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Clear Color</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_ClearColor()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='clear_color' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<ClearColorType> getClearColor();

	/**
   * Returns the value of the '<em><b>Clear Stencil</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ClearStencilType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clear Stencil</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Clear Stencil</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_ClearStencil()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='clear_stencil' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<ClearStencilType> getClearStencil();

	/**
   * Returns the value of the '<em><b>Clear Depth</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ClearDepthType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clear Depth</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Clear Depth</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_ClearDepth()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='clear_depth' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<ClearDepthType> getClearDepth();

	/**
   * Returns the value of the '<em><b>Clip Plane</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ClipPlaneType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip Plane</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Clip Plane</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_ClipPlane()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='clip_plane' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<ClipPlaneType> getClipPlane();

	/**
   * Returns the value of the '<em><b>Color Mask</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ColorMaskType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Mask</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Color Mask</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_ColorMask()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='color_mask' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<ColorMaskType> getColorMask();

	/**
   * Returns the value of the '<em><b>Cull Face</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CullFaceType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cull Face</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Cull Face</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_CullFace()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='cull_face' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<CullFaceType> getCullFace();

	/**
   * Returns the value of the '<em><b>Depth Func</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.DepthFuncType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Func</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Depth Func</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_DepthFunc()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='depth_func' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<DepthFuncType> getDepthFunc();

	/**
   * Returns the value of the '<em><b>Depth Mask</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.DepthMaskType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Mask</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Depth Mask</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_DepthMask()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='depth_mask' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<DepthMaskType> getDepthMask();

	/**
   * Returns the value of the '<em><b>Depth Range</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.DepthRangeType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Depth Range</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_DepthRange()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='depth_range' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<DepthRangeType> getDepthRange();

	/**
   * Returns the value of the '<em><b>Fog Color</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FogColorType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fog Color</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fog Color</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_FogColor()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fog_color' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<FogColorType> getFogColor();

	/**
   * Returns the value of the '<em><b>Fog Density</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FogDensityType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fog Density</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fog Density</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_FogDensity()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fog_density' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<FogDensityType> getFogDensity();

	/**
   * Returns the value of the '<em><b>Fog Mode</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FogModeType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fog Mode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fog Mode</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_FogMode()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fog_mode' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<FogModeType> getFogMode();

	/**
   * Returns the value of the '<em><b>Fog Start</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FogStartType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fog Start</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fog Start</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_FogStart()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fog_start' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<FogStartType> getFogStart();

	/**
   * Returns the value of the '<em><b>Fog End</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FogEndType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fog End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fog End</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_FogEnd()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fog_end' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<FogEndType> getFogEnd();

	/**
   * Returns the value of the '<em><b>Front Face</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FrontFaceType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Front Face</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Front Face</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_FrontFace()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='front_face' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<FrontFaceType> getFrontFace();

	/**
   * Returns the value of the '<em><b>Texture Pipeline</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TexturePipelineType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Pipeline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture Pipeline</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_TexturePipeline()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='texture_pipeline' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<TexturePipelineType> getTexturePipeline();

	/**
   * Returns the value of the '<em><b>Logic Op</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LogicOpType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logic Op</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Logic Op</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LogicOp()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='logic_op' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LogicOpType> getLogicOp();

	/**
   * Returns the value of the '<em><b>Light Ambient</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightAmbientType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Ambient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Ambient</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LightAmbient()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_ambient' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LightAmbientType> getLightAmbient();

	/**
   * Returns the value of the '<em><b>Light Diffuse</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightDiffuseType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Diffuse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Diffuse</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LightDiffuse()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_diffuse' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LightDiffuseType> getLightDiffuse();

	/**
   * Returns the value of the '<em><b>Light Specular</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightSpecularType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Specular</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Specular</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LightSpecular()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_specular' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LightSpecularType> getLightSpecular();

	/**
   * Returns the value of the '<em><b>Light Position</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightPositionType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Position</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Position</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LightPosition()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_position' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LightPositionType> getLightPosition();

	/**
   * Returns the value of the '<em><b>Light Constant Attenuation</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightConstantAttenuationType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Constant Attenuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Constant Attenuation</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LightConstantAttenuation()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_constant_attenuation' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LightConstantAttenuationType> getLightConstantAttenuation();

	/**
   * Returns the value of the '<em><b>Light Linear Attenutation</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightLinearAttenutationType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Linear Attenutation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Linear Attenutation</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LightLinearAttenutation()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_linear_attenutation' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LightLinearAttenutationType> getLightLinearAttenutation();

	/**
   * Returns the value of the '<em><b>Light Quadratic Attenuation</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightQuadraticAttenuationType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Quadratic Attenuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Quadratic Attenuation</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LightQuadraticAttenuation()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_quadratic_attenuation' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LightQuadraticAttenuationType> getLightQuadraticAttenuation();

	/**
   * Returns the value of the '<em><b>Light Spot Cutoff</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightSpotCutoffType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Spot Cutoff</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Spot Cutoff</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LightSpotCutoff()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_spot_cutoff' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LightSpotCutoffType> getLightSpotCutoff();

	/**
   * Returns the value of the '<em><b>Light Spot Direction</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightSpotDirectionType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Spot Direction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Spot Direction</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LightSpotDirection()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_spot_direction' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LightSpotDirectionType> getLightSpotDirection();

	/**
   * Returns the value of the '<em><b>Light Spot Exponent</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightSpotExponentType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Spot Exponent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Spot Exponent</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LightSpotExponent()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_spot_exponent' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LightSpotExponentType> getLightSpotExponent();

	/**
   * Returns the value of the '<em><b>Light Model Ambient</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightModelAmbientType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Model Ambient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Model Ambient</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LightModelAmbient()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_model_ambient' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LightModelAmbientType> getLightModelAmbient();

	/**
   * Returns the value of the '<em><b>Line Width</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LineWidthType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Width</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Line Width</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LineWidth()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='line_width' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LineWidthType> getLineWidth();

	/**
   * Returns the value of the '<em><b>Material Ambient</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.MaterialAmbientType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Ambient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Material Ambient</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_MaterialAmbient()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='material_ambient' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<MaterialAmbientType> getMaterialAmbient();

	/**
   * Returns the value of the '<em><b>Material Diffuse</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.MaterialDiffuseType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Diffuse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Material Diffuse</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_MaterialDiffuse()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='material_diffuse' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<MaterialDiffuseType> getMaterialDiffuse();

	/**
   * Returns the value of the '<em><b>Material Emission</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.MaterialEmissionType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Emission</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Material Emission</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_MaterialEmission()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='material_emission' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<MaterialEmissionType> getMaterialEmission();

	/**
   * Returns the value of the '<em><b>Material Shininess</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.MaterialShininessType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Shininess</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Material Shininess</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_MaterialShininess()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='material_shininess' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<MaterialShininessType> getMaterialShininess();

	/**
   * Returns the value of the '<em><b>Material Specular</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.MaterialSpecularType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Specular</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Material Specular</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_MaterialSpecular()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='material_specular' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<MaterialSpecularType> getMaterialSpecular();

	/**
   * Returns the value of the '<em><b>Model View Matrix</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ModelViewMatrixType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model View Matrix</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Model View Matrix</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_ModelViewMatrix()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='model_view_matrix' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<ModelViewMatrixType> getModelViewMatrix();

	/**
   * Returns the value of the '<em><b>Point Distance Attenuation</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PointDistanceAttenuationType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Distance Attenuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Point Distance Attenuation</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_PointDistanceAttenuation()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='point_distance_attenuation' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<PointDistanceAttenuationType> getPointDistanceAttenuation();

	/**
   * Returns the value of the '<em><b>Point Fade Threshold Size</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PointFadeThresholdSizeType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Fade Threshold Size</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Point Fade Threshold Size</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_PointFadeThresholdSize()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='point_fade_threshold_size' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<PointFadeThresholdSizeType> getPointFadeThresholdSize();

	/**
   * Returns the value of the '<em><b>Point Size</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PointSizeType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Size</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Point Size</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_PointSize()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='point_size' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<PointSizeType> getPointSize();

	/**
   * Returns the value of the '<em><b>Point Size Min</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PointSizeMinType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Size Min</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Point Size Min</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_PointSizeMin()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='point_size_min' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<PointSizeMinType> getPointSizeMin();

	/**
   * Returns the value of the '<em><b>Point Size Max</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PointSizeMaxType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Size Max</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Point Size Max</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_PointSizeMax()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='point_size_max' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<PointSizeMaxType> getPointSizeMax();

	/**
   * Returns the value of the '<em><b>Polygon Offset</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PolygonOffsetType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Offset</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Polygon Offset</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_PolygonOffset()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='polygon_offset' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<PolygonOffsetType> getPolygonOffset();

	/**
   * Returns the value of the '<em><b>Projection Matrix</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ProjectionMatrixType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection Matrix</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Projection Matrix</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_ProjectionMatrix()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='projection_matrix' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<ProjectionMatrixType> getProjectionMatrix();

	/**
   * Returns the value of the '<em><b>Scissor</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ScissorType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scissor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Scissor</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_Scissor()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='scissor' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<ScissorType> getScissor();

	/**
   * Returns the value of the '<em><b>Shade Model</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ShadeModelType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shade Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Shade Model</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_ShadeModel()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='shade_model' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<ShadeModelType> getShadeModel();

	/**
   * Returns the value of the '<em><b>Stencil Func</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.StencilFuncType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stencil Func</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stencil Func</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_StencilFunc()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='stencil_func' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<StencilFuncType> getStencilFunc();

	/**
   * Returns the value of the '<em><b>Stencil Mask</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.StencilMaskType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stencil Mask</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stencil Mask</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_StencilMask()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='stencil_mask' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<StencilMaskType> getStencilMask();

	/**
   * Returns the value of the '<em><b>Stencil Op</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.StencilOpType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stencil Op</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stencil Op</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_StencilOp()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='stencil_op' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<StencilOpType> getStencilOp();

	/**
   * Returns the value of the '<em><b>Alpha Test Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.AlphaTestEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha Test Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Alpha Test Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_AlphaTestEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='alpha_test_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<AlphaTestEnableType> getAlphaTestEnable();

	/**
   * Returns the value of the '<em><b>Blend Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.BlendEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blend Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Blend Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_BlendEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='blend_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<BlendEnableType> getBlendEnable();

	/**
   * Returns the value of the '<em><b>Clip Plane Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ClipPlaneEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip Plane Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Clip Plane Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_ClipPlaneEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='clip_plane_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<ClipPlaneEnableType> getClipPlaneEnable();

	/**
   * Returns the value of the '<em><b>Color Logic Op Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ColorLogicOpEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Logic Op Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Color Logic Op Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_ColorLogicOpEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='color_logic_op_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<ColorLogicOpEnableType> getColorLogicOpEnable();

	/**
   * Returns the value of the '<em><b>Color Material Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ColorMaterialEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Material Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Color Material Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_ColorMaterialEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='color_material_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<ColorMaterialEnableType> getColorMaterialEnable();

	/**
   * Returns the value of the '<em><b>Cull Face Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CullFaceEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cull Face Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Cull Face Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_CullFaceEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='cull_face_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<CullFaceEnableType> getCullFaceEnable();

	/**
   * Returns the value of the '<em><b>Depth Test Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.DepthTestEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Test Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Depth Test Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_DepthTestEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='depth_test_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<DepthTestEnableType> getDepthTestEnable();

	/**
   * Returns the value of the '<em><b>Dither Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.DitherEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dither Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Dither Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_DitherEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='dither_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<DitherEnableType> getDitherEnable();

	/**
   * Returns the value of the '<em><b>Fog Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FogEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fog Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fog Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_FogEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fog_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<FogEnableType> getFogEnable();

	/**
   * Returns the value of the '<em><b>Texture Pipeline Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TexturePipelineEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Pipeline Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture Pipeline Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_TexturePipelineEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='texture_pipeline_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<TexturePipelineEnableType> getTexturePipelineEnable();

	/**
   * Returns the value of the '<em><b>Light Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LightEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LightEnableType> getLightEnable();

	/**
   * Returns the value of the '<em><b>Lighting Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightingEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lighting Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Lighting Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LightingEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='lighting_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LightingEnableType> getLightingEnable();

	/**
   * Returns the value of the '<em><b>Light Model Two Side Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LightModelTwoSideEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Model Two Side Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Light Model Two Side Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LightModelTwoSideEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='light_model_two_side_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LightModelTwoSideEnableType> getLightModelTwoSideEnable();

	/**
   * Returns the value of the '<em><b>Line Smooth Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LineSmoothEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Smooth Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Line Smooth Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_LineSmoothEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='line_smooth_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<LineSmoothEnableType> getLineSmoothEnable();

	/**
   * Returns the value of the '<em><b>Multisample Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.MultisampleEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multisample Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Multisample Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_MultisampleEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='multisample_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<MultisampleEnableType> getMultisampleEnable();

	/**
   * Returns the value of the '<em><b>Normalize Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.NormalizeEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normalize Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Normalize Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_NormalizeEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='normalize_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<NormalizeEnableType> getNormalizeEnable();

	/**
   * Returns the value of the '<em><b>Point Smooth Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PointSmoothEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Smooth Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Point Smooth Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_PointSmoothEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='point_smooth_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<PointSmoothEnableType> getPointSmoothEnable();

	/**
   * Returns the value of the '<em><b>Polygon Offset Fill Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PolygonOffsetFillEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Offset Fill Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Polygon Offset Fill Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_PolygonOffsetFillEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='polygon_offset_fill_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<PolygonOffsetFillEnableType> getPolygonOffsetFillEnable();

	/**
   * Returns the value of the '<em><b>Rescale Normal Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.RescaleNormalEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rescale Normal Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Rescale Normal Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_RescaleNormalEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='rescale_normal_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<RescaleNormalEnableType> getRescaleNormalEnable();

	/**
   * Returns the value of the '<em><b>Sample Alpha To Coverage Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SampleAlphaToCoverageEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Alpha To Coverage Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sample Alpha To Coverage Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_SampleAlphaToCoverageEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='sample_alpha_to_coverage_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<SampleAlphaToCoverageEnableType> getSampleAlphaToCoverageEnable();

	/**
   * Returns the value of the '<em><b>Sample Alpha To One Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SampleAlphaToOneEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Alpha To One Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sample Alpha To One Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_SampleAlphaToOneEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='sample_alpha_to_one_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<SampleAlphaToOneEnableType> getSampleAlphaToOneEnable();

	/**
   * Returns the value of the '<em><b>Sample Coverage Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SampleCoverageEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Coverage Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sample Coverage Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_SampleCoverageEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='sample_coverage_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<SampleCoverageEnableType> getSampleCoverageEnable();

	/**
   * Returns the value of the '<em><b>Scissor Test Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ScissorTestEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scissor Test Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Scissor Test Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_ScissorTestEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='scissor_test_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<ScissorTestEnableType> getScissorTestEnable();

	/**
   * Returns the value of the '<em><b>Stencil Test Enable</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.StencilTestEnableType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stencil Test Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stencil Test Enable</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPassType_StencilTestEnable()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='stencil_test_enable' namespace='##targetNamespace' group='#GlesPipelineSettings:8'"
   * @generated
   */
	EList<StencilTestEnableType> getStencilTestEnable();

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
   * @see org.khronos.collada.ColladaPackage#getPassType_Extra()
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
   * @see org.khronos.collada.ColladaPackage#getPassType_Sid()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.PassType#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

} // PassType
