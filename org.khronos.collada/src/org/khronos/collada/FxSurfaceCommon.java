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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fx Surface Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			The fx_surface_common type is used to declare a resource that can be used both as the source for texture samples and as the target of a rendering pass.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.FxSurfaceCommon#getInitAsNull <em>Init As Null</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceCommon#getInitAsTarget <em>Init As Target</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceCommon#getInitCube <em>Init Cube</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceCommon#getInitVolume <em>Init Volume</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceCommon#getInitPlanar <em>Init Planar</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceCommon#getInitFrom <em>Init From</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceCommon#getFormat <em>Format</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceCommon#getFormatHint <em>Format Hint</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceCommon#getSize <em>Size</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceCommon#getViewportRatio <em>Viewport Ratio</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceCommon#getMipLevels <em>Mip Levels</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceCommon#isMipmapGenerate <em>Mipmap Generate</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceCommon#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceCommon#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getFxSurfaceCommon()
 * @model extendedMetaData="name='fx_surface_common' kind='elementOnly'"
 * @generated
 */
public interface FxSurfaceCommon extends EObject {
	/**
   * Returns the value of the '<em><b>Init As Null</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * This surface is intended to be initialized later externally by a "setparam" element.  If it is used before being initialized there is profile and platform specific behavior.  Most elements on the surface element containing this will be ignored including mip_levels, mipmap_generate, size, viewport_ratio, and format.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Init As Null</em>' containment reference.
   * @see #setInitAsNull(EObject)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceCommon_InitAsNull()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='init_as_null' namespace='##targetNamespace'"
   * @generated
   */
	EObject getInitAsNull();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceCommon#getInitAsNull <em>Init As Null</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init As Null</em>' containment reference.
   * @see #getInitAsNull()
   * @generated
   */
	void setInitAsNull(EObject value);

	/**
   * Returns the value of the '<em><b>Init As Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Init as a target for depth, stencil, or color.  It does not need image data. Surface should not have mipmap_generate when using this.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Init As Target</em>' containment reference.
   * @see #setInitAsTarget(EObject)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceCommon_InitAsTarget()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='init_as_target' namespace='##targetNamespace'"
   * @generated
   */
	EObject getInitAsTarget();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceCommon#getInitAsTarget <em>Init As Target</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init As Target</em>' containment reference.
   * @see #getInitAsTarget()
   * @generated
   */
	void setInitAsTarget(EObject value);

	/**
   * Returns the value of the '<em><b>Init Cube</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Init a CUBE from a compound image such as DDS
   * <!-- end-model-doc -->
   * @return the value of the '<em>Init Cube</em>' containment reference.
   * @see #setInitCube(FxSurfaceInitCubeCommon)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceCommon_InitCube()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='init_cube' namespace='##targetNamespace'"
   * @generated
   */
	FxSurfaceInitCubeCommon getInitCube();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceCommon#getInitCube <em>Init Cube</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Cube</em>' containment reference.
   * @see #getInitCube()
   * @generated
   */
	void setInitCube(FxSurfaceInitCubeCommon value);

	/**
   * Returns the value of the '<em><b>Init Volume</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Init a 3D from a compound image such as DDS
   * <!-- end-model-doc -->
   * @return the value of the '<em>Init Volume</em>' containment reference.
   * @see #setInitVolume(FxSurfaceInitVolumeCommon)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceCommon_InitVolume()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='init_volume' namespace='##targetNamespace'"
   * @generated
   */
	FxSurfaceInitVolumeCommon getInitVolume();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceCommon#getInitVolume <em>Init Volume</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Volume</em>' containment reference.
   * @see #getInitVolume()
   * @generated
   */
	void setInitVolume(FxSurfaceInitVolumeCommon value);

	/**
   * Returns the value of the '<em><b>Init Planar</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Init a 1D,2D,RECT,DEPTH from a compound image such as DDS
   * <!-- end-model-doc -->
   * @return the value of the '<em>Init Planar</em>' containment reference.
   * @see #setInitPlanar(FxSurfaceInitPlanarCommon)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceCommon_InitPlanar()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='init_planar' namespace='##targetNamespace'"
   * @generated
   */
	FxSurfaceInitPlanarCommon getInitPlanar();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceCommon#getInitPlanar <em>Init Planar</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Planar</em>' containment reference.
   * @see #getInitPlanar()
   * @generated
   */
	void setInitPlanar(FxSurfaceInitPlanarCommon value);

	/**
   * Returns the value of the '<em><b>Init From</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxSurfaceInitFromCommon}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Initialize the surface one sub-surface at a time by specifying combinations of mip, face, and slice which make sense for a particular surface type.  Each sub-surface is initialized by a common 2D image, not a complex compound image such as DDS. If not all subsurfaces are initialized, it is invalid and will result in profile and platform specific behavior unless mipmap_generate is responsible for initializing the remainder of the sub-surfaces
   * <!-- end-model-doc -->
   * @return the value of the '<em>Init From</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceCommon_InitFrom()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='init_from' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxSurfaceInitFromCommon> getInitFrom();

	/**
   * Returns the value of the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Contains a string representing the profile and platform specific texel format that the author would like this surface to use.  If this element is not specified then the application will use a common format R8G8B8A8 with linear color gradient, not  sRGB.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Format</em>' attribute.
   * @see #setFormat(String)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceCommon_Format()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace'"
   * @generated
   */
	String getFormat();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceCommon#getFormat <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' attribute.
   * @see #getFormat()
   * @generated
   */
	void setFormat(String value);

	/**
   * Returns the value of the '<em><b>Format Hint</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * If the exact format cannot be resolved via the "format" element then the format_hint will describe the important features of the format so that the application may select a compatable or close format
   * <!-- end-model-doc -->
   * @return the value of the '<em>Format Hint</em>' containment reference.
   * @see #setFormatHint(FxSurfaceFormatHintCommon)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceCommon_FormatHint()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='format_hint' namespace='##targetNamespace'"
   * @generated
   */
	FxSurfaceFormatHintCommon getFormatHint();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceCommon#getFormatHint <em>Format Hint</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format Hint</em>' containment reference.
   * @see #getFormatHint()
   * @generated
   */
	void setFormatHint(FxSurfaceFormatHintCommon value);

	/**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * The default value is <code>"0 0 0"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The surface should be sized to these exact dimensions
   * <!-- end-model-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #isSetSize()
   * @see #unsetSize()
   * @see #setSize(List)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceCommon_Size()
   * @model default="0 0 0" unsettable="true" dataType="org.khronos.collada.Int3" many="false"
   *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
   * @generated
   */
	List<Long> getSize();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceCommon#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #isSetSize()
   * @see #unsetSize()
   * @see #getSize()
   * @generated
   */
	void setSize(List<Long> value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSurfaceCommon#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetSize()
   * @see #getSize()
   * @see #setSize(List)
   * @generated
   */
	void unsetSize();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSurfaceCommon#getSize <em>Size</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Size</em>' attribute is set.
   * @see #unsetSize()
   * @see #getSize()
   * @see #setSize(List)
   * @generated
   */
	boolean isSetSize();

	/**
   * Returns the value of the '<em><b>Viewport Ratio</b></em>' attribute.
   * The default value is <code>"1 1"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The surface should be sized to a dimension based on this ratio of the viewport's dimensions in pixels
   * <!-- end-model-doc -->
   * @return the value of the '<em>Viewport Ratio</em>' attribute.
   * @see #isSetViewportRatio()
   * @see #unsetViewportRatio()
   * @see #setViewportRatio(List)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceCommon_ViewportRatio()
   * @model default="1 1" unsettable="true" dataType="org.khronos.collada.Float2" many="false"
   *        extendedMetaData="kind='element' name='viewport_ratio' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getViewportRatio();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceCommon#getViewportRatio <em>Viewport Ratio</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Viewport Ratio</em>' attribute.
   * @see #isSetViewportRatio()
   * @see #unsetViewportRatio()
   * @see #getViewportRatio()
   * @generated
   */
	void setViewportRatio(List<Double> value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSurfaceCommon#getViewportRatio <em>Viewport Ratio</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetViewportRatio()
   * @see #getViewportRatio()
   * @see #setViewportRatio(List)
   * @generated
   */
	void unsetViewportRatio();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSurfaceCommon#getViewportRatio <em>Viewport Ratio</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Viewport Ratio</em>' attribute is set.
   * @see #unsetViewportRatio()
   * @see #getViewportRatio()
   * @see #setViewportRatio(List)
   * @generated
   */
	boolean isSetViewportRatio();

	/**
   * Returns the value of the '<em><b>Mip Levels</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * the surface should contain the following number of MIP levels.  If this element is not present it is assumed that all miplevels exist until a dimension becomes 1 texel.  To create a surface that has only one level of mip maps (mip=0) set this to 1.  If the value is 0 the result is the same as if mip_levels was unspecified, all possible mip_levels will exist.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Mip Levels</em>' attribute.
   * @see #isSetMipLevels()
   * @see #unsetMipLevels()
   * @see #setMipLevels(long)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceCommon_MipLevels()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
   *        extendedMetaData="kind='element' name='mip_levels' namespace='##targetNamespace'"
   * @generated
   */
	long getMipLevels();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceCommon#getMipLevels <em>Mip Levels</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mip Levels</em>' attribute.
   * @see #isSetMipLevels()
   * @see #unsetMipLevels()
   * @see #getMipLevels()
   * @generated
   */
	void setMipLevels(long value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSurfaceCommon#getMipLevels <em>Mip Levels</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMipLevels()
   * @see #getMipLevels()
   * @see #setMipLevels(long)
   * @generated
   */
	void unsetMipLevels();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSurfaceCommon#getMipLevels <em>Mip Levels</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Mip Levels</em>' attribute is set.
   * @see #unsetMipLevels()
   * @see #getMipLevels()
   * @see #setMipLevels(long)
   * @generated
   */
	boolean isSetMipLevels();

	/**
   * Returns the value of the '<em><b>Mipmap Generate</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * By default it is assumed that mipmaps are supplied by the author so, if not all subsurfaces are initialized, it is invalid and will result in profile and platform specific behavior unless mipmap_generate is responsible for initializing the remainder of the sub-surfaces
   * <!-- end-model-doc -->
   * @return the value of the '<em>Mipmap Generate</em>' attribute.
   * @see #isSetMipmapGenerate()
   * @see #unsetMipmapGenerate()
   * @see #setMipmapGenerate(boolean)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceCommon_MipmapGenerate()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='element' name='mipmap_generate' namespace='##targetNamespace'"
   * @generated
   */
	boolean isMipmapGenerate();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceCommon#isMipmapGenerate <em>Mipmap Generate</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mipmap Generate</em>' attribute.
   * @see #isSetMipmapGenerate()
   * @see #unsetMipmapGenerate()
   * @see #isMipmapGenerate()
   * @generated
   */
	void setMipmapGenerate(boolean value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSurfaceCommon#isMipmapGenerate <em>Mipmap Generate</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMipmapGenerate()
   * @see #isMipmapGenerate()
   * @see #setMipmapGenerate(boolean)
   * @generated
   */
	void unsetMipmapGenerate();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSurfaceCommon#isMipmapGenerate <em>Mipmap Generate</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Mipmap Generate</em>' attribute is set.
   * @see #unsetMipmapGenerate()
   * @see #isMipmapGenerate()
   * @see #setMipmapGenerate(boolean)
   * @generated
   */
	boolean isSetMipmapGenerate();

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
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceCommon_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.khronos.collada.FxSurfaceTypeEnum}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifying the type of a surface is mandatory though the type may be "UNTYPED".  When a surface is typed as UNTYPED, it is said to be temporarily untyped and instead will be typed later by the context it is used in such as which samplers reference it in that are used in a particular technique or pass.   If there is a type mismatch between what is set into it later and what the runtime decides the type should be the result in profile and platform specific behavior.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.khronos.collada.FxSurfaceTypeEnum
   * @see #isSetType()
   * @see #unsetType()
   * @see #setType(FxSurfaceTypeEnum)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceCommon_Type()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='attribute' name='type'"
   * @generated
   */
	FxSurfaceTypeEnum getType();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceCommon#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.khronos.collada.FxSurfaceTypeEnum
   * @see #isSetType()
   * @see #unsetType()
   * @see #getType()
   * @generated
   */
	void setType(FxSurfaceTypeEnum value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSurfaceCommon#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetType()
   * @see #getType()
   * @see #setType(FxSurfaceTypeEnum)
   * @generated
   */
	void unsetType();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSurfaceCommon#getType <em>Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Type</em>' attribute is set.
   * @see #unsetType()
   * @see #getType()
   * @see #setType(FxSurfaceTypeEnum)
   * @generated
   */
	boolean isSetType();

} // FxSurfaceCommon
