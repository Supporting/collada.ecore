/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fx Surface Format Hint Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * If the exact format cannot be resolve via other methods then the format_hint will describe the important features of the format so that the application may select a compatable or close format
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.FxSurfaceFormatHintCommon#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceFormatHintCommon#getRange <em>Range</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceFormatHintCommon#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceFormatHintCommon#getOption <em>Option</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceFormatHintCommon#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getFxSurfaceFormatHintCommon()
 * @model extendedMetaData="name='fx_surface_format_hint_common' kind='elementOnly'"
 * @generated
 */
public interface FxSurfaceFormatHintCommon extends EObject {
	/**
   * Returns the value of the '<em><b>Channels</b></em>' attribute.
   * The literals are from the enumeration {@link org.khronos.collada.FxSurfaceFormatHintChannelsEnum}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The per-texel layout of the format.  The length of the string indicate how many channels there are and the letter respresents the name of the channel.  There are typically 0 to 4 channels.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Channels</em>' attribute.
   * @see org.khronos.collada.FxSurfaceFormatHintChannelsEnum
   * @see #isSetChannels()
   * @see #unsetChannels()
   * @see #setChannels(FxSurfaceFormatHintChannelsEnum)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceFormatHintCommon_Channels()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='element' name='channels' namespace='##targetNamespace'"
   * @generated
   */
	FxSurfaceFormatHintChannelsEnum getChannels();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceFormatHintCommon#getChannels <em>Channels</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Channels</em>' attribute.
   * @see org.khronos.collada.FxSurfaceFormatHintChannelsEnum
   * @see #isSetChannels()
   * @see #unsetChannels()
   * @see #getChannels()
   * @generated
   */
	void setChannels(FxSurfaceFormatHintChannelsEnum value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSurfaceFormatHintCommon#getChannels <em>Channels</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetChannels()
   * @see #getChannels()
   * @see #setChannels(FxSurfaceFormatHintChannelsEnum)
   * @generated
   */
	void unsetChannels();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSurfaceFormatHintCommon#getChannels <em>Channels</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Channels</em>' attribute is set.
   * @see #unsetChannels()
   * @see #getChannels()
   * @see #setChannels(FxSurfaceFormatHintChannelsEnum)
   * @generated
   */
	boolean isSetChannels();

	/**
   * Returns the value of the '<em><b>Range</b></em>' attribute.
   * The literals are from the enumeration {@link org.khronos.collada.FxSurfaceFormatHintRangeEnum}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Each channel represents a range of values. Some example ranges are signed or unsigned integers, or between between a clamped range such as 0.0f to 1.0f, or high dynamic range via floating point
   * <!-- end-model-doc -->
   * @return the value of the '<em>Range</em>' attribute.
   * @see org.khronos.collada.FxSurfaceFormatHintRangeEnum
   * @see #isSetRange()
   * @see #unsetRange()
   * @see #setRange(FxSurfaceFormatHintRangeEnum)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceFormatHintCommon_Range()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
   * @generated
   */
	FxSurfaceFormatHintRangeEnum getRange();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceFormatHintCommon#getRange <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' attribute.
   * @see org.khronos.collada.FxSurfaceFormatHintRangeEnum
   * @see #isSetRange()
   * @see #unsetRange()
   * @see #getRange()
   * @generated
   */
	void setRange(FxSurfaceFormatHintRangeEnum value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSurfaceFormatHintCommon#getRange <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetRange()
   * @see #getRange()
   * @see #setRange(FxSurfaceFormatHintRangeEnum)
   * @generated
   */
	void unsetRange();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSurfaceFormatHintCommon#getRange <em>Range</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Range</em>' attribute is set.
   * @see #unsetRange()
   * @see #getRange()
   * @see #setRange(FxSurfaceFormatHintRangeEnum)
   * @generated
   */
	boolean isSetRange();

	/**
   * Returns the value of the '<em><b>Precision</b></em>' attribute.
   * The literals are from the enumeration {@link org.khronos.collada.FxSurfaceFormatHintPrecisionEnum}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Each channel of the texel has a precision.  Typically these are all linked together.  An exact format lay lower the precision of an individual channel but applying a higher precision by linking the channels together may still convey the same information.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Precision</em>' attribute.
   * @see org.khronos.collada.FxSurfaceFormatHintPrecisionEnum
   * @see #isSetPrecision()
   * @see #unsetPrecision()
   * @see #setPrecision(FxSurfaceFormatHintPrecisionEnum)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceFormatHintCommon_Precision()
   * @model unsettable="true"
   *        extendedMetaData="kind='element' name='precision' namespace='##targetNamespace'"
   * @generated
   */
	FxSurfaceFormatHintPrecisionEnum getPrecision();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceFormatHintCommon#getPrecision <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precision</em>' attribute.
   * @see org.khronos.collada.FxSurfaceFormatHintPrecisionEnum
   * @see #isSetPrecision()
   * @see #unsetPrecision()
   * @see #getPrecision()
   * @generated
   */
	void setPrecision(FxSurfaceFormatHintPrecisionEnum value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSurfaceFormatHintCommon#getPrecision <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetPrecision()
   * @see #getPrecision()
   * @see #setPrecision(FxSurfaceFormatHintPrecisionEnum)
   * @generated
   */
	void unsetPrecision();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSurfaceFormatHintCommon#getPrecision <em>Precision</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Precision</em>' attribute is set.
   * @see #unsetPrecision()
   * @see #getPrecision()
   * @see #setPrecision(FxSurfaceFormatHintPrecisionEnum)
   * @generated
   */
	boolean isSetPrecision();

	/**
   * Returns the value of the '<em><b>Option</b></em>' attribute list.
   * The list contents are of type {@link org.khronos.collada.FxSurfaceFormatHintOptionEnum}.
   * The literals are from the enumeration {@link org.khronos.collada.FxSurfaceFormatHintOptionEnum}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Additional hints about data relationships and other things to help the application pick the best format.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Option</em>' attribute list.
   * @see org.khronos.collada.FxSurfaceFormatHintOptionEnum
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceFormatHintCommon_Option()
   * @model unique="false"
   *        extendedMetaData="kind='element' name='option' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxSurfaceFormatHintOptionEnum> getOption();

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
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceFormatHintCommon_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

} // FxSurfaceFormatHintCommon
