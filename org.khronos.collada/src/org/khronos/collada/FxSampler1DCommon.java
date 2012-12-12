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
 * A representation of the model object '<em><b>Fx Sampler1 DCommon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			A one-dimensional texture sampler.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.FxSampler1DCommon#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.FxSampler1DCommon#getWrapS <em>Wrap S</em>}</li>
 *   <li>{@link org.khronos.collada.FxSampler1DCommon#getMinfilter <em>Minfilter</em>}</li>
 *   <li>{@link org.khronos.collada.FxSampler1DCommon#getMagfilter <em>Magfilter</em>}</li>
 *   <li>{@link org.khronos.collada.FxSampler1DCommon#getMipfilter <em>Mipfilter</em>}</li>
 *   <li>{@link org.khronos.collada.FxSampler1DCommon#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.khronos.collada.FxSampler1DCommon#getMipmapMaxlevel <em>Mipmap Maxlevel</em>}</li>
 *   <li>{@link org.khronos.collada.FxSampler1DCommon#getMipmapBias <em>Mipmap Bias</em>}</li>
 *   <li>{@link org.khronos.collada.FxSampler1DCommon#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getFxSampler1DCommon()
 * @model extendedMetaData="name='fx_sampler1D_common' kind='elementOnly'"
 * @generated
 */
public interface FxSampler1DCommon extends EObject {
	/**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see org.khronos.collada.ColladaPackage#getFxSampler1DCommon_Source()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
   * @generated
   */
	String getSource();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSampler1DCommon#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
	void setSource(String value);

	/**
   * Returns the value of the '<em><b>Wrap S</b></em>' attribute.
   * The default value is <code>"WRAP"</code>.
   * The literals are from the enumeration {@link org.khronos.collada.FxSamplerWrapCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrap S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Wrap S</em>' attribute.
   * @see org.khronos.collada.FxSamplerWrapCommon
   * @see #isSetWrapS()
   * @see #unsetWrapS()
   * @see #setWrapS(FxSamplerWrapCommon)
   * @see org.khronos.collada.ColladaPackage#getFxSampler1DCommon_WrapS()
   * @model default="WRAP" unsettable="true"
   *        extendedMetaData="kind='element' name='wrap_s' namespace='##targetNamespace'"
   * @generated
   */
	FxSamplerWrapCommon getWrapS();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSampler1DCommon#getWrapS <em>Wrap S</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wrap S</em>' attribute.
   * @see org.khronos.collada.FxSamplerWrapCommon
   * @see #isSetWrapS()
   * @see #unsetWrapS()
   * @see #getWrapS()
   * @generated
   */
	void setWrapS(FxSamplerWrapCommon value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSampler1DCommon#getWrapS <em>Wrap S</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetWrapS()
   * @see #getWrapS()
   * @see #setWrapS(FxSamplerWrapCommon)
   * @generated
   */
	void unsetWrapS();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSampler1DCommon#getWrapS <em>Wrap S</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Wrap S</em>' attribute is set.
   * @see #unsetWrapS()
   * @see #getWrapS()
   * @see #setWrapS(FxSamplerWrapCommon)
   * @generated
   */
	boolean isSetWrapS();

	/**
   * Returns the value of the '<em><b>Minfilter</b></em>' attribute.
   * The default value is <code>"NONE"</code>.
   * The literals are from the enumeration {@link org.khronos.collada.FxSamplerFilterCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minfilter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Minfilter</em>' attribute.
   * @see org.khronos.collada.FxSamplerFilterCommon
   * @see #isSetMinfilter()
   * @see #unsetMinfilter()
   * @see #setMinfilter(FxSamplerFilterCommon)
   * @see org.khronos.collada.ColladaPackage#getFxSampler1DCommon_Minfilter()
   * @model default="NONE" unsettable="true"
   *        extendedMetaData="kind='element' name='minfilter' namespace='##targetNamespace'"
   * @generated
   */
	FxSamplerFilterCommon getMinfilter();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSampler1DCommon#getMinfilter <em>Minfilter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minfilter</em>' attribute.
   * @see org.khronos.collada.FxSamplerFilterCommon
   * @see #isSetMinfilter()
   * @see #unsetMinfilter()
   * @see #getMinfilter()
   * @generated
   */
	void setMinfilter(FxSamplerFilterCommon value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSampler1DCommon#getMinfilter <em>Minfilter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMinfilter()
   * @see #getMinfilter()
   * @see #setMinfilter(FxSamplerFilterCommon)
   * @generated
   */
	void unsetMinfilter();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSampler1DCommon#getMinfilter <em>Minfilter</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Minfilter</em>' attribute is set.
   * @see #unsetMinfilter()
   * @see #getMinfilter()
   * @see #setMinfilter(FxSamplerFilterCommon)
   * @generated
   */
	boolean isSetMinfilter();

	/**
   * Returns the value of the '<em><b>Magfilter</b></em>' attribute.
   * The default value is <code>"NONE"</code>.
   * The literals are from the enumeration {@link org.khronos.collada.FxSamplerFilterCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Magfilter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Magfilter</em>' attribute.
   * @see org.khronos.collada.FxSamplerFilterCommon
   * @see #isSetMagfilter()
   * @see #unsetMagfilter()
   * @see #setMagfilter(FxSamplerFilterCommon)
   * @see org.khronos.collada.ColladaPackage#getFxSampler1DCommon_Magfilter()
   * @model default="NONE" unsettable="true"
   *        extendedMetaData="kind='element' name='magfilter' namespace='##targetNamespace'"
   * @generated
   */
	FxSamplerFilterCommon getMagfilter();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSampler1DCommon#getMagfilter <em>Magfilter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Magfilter</em>' attribute.
   * @see org.khronos.collada.FxSamplerFilterCommon
   * @see #isSetMagfilter()
   * @see #unsetMagfilter()
   * @see #getMagfilter()
   * @generated
   */
	void setMagfilter(FxSamplerFilterCommon value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSampler1DCommon#getMagfilter <em>Magfilter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMagfilter()
   * @see #getMagfilter()
   * @see #setMagfilter(FxSamplerFilterCommon)
   * @generated
   */
	void unsetMagfilter();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSampler1DCommon#getMagfilter <em>Magfilter</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Magfilter</em>' attribute is set.
   * @see #unsetMagfilter()
   * @see #getMagfilter()
   * @see #setMagfilter(FxSamplerFilterCommon)
   * @generated
   */
	boolean isSetMagfilter();

	/**
   * Returns the value of the '<em><b>Mipfilter</b></em>' attribute.
   * The default value is <code>"NONE"</code>.
   * The literals are from the enumeration {@link org.khronos.collada.FxSamplerFilterCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mipfilter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mipfilter</em>' attribute.
   * @see org.khronos.collada.FxSamplerFilterCommon
   * @see #isSetMipfilter()
   * @see #unsetMipfilter()
   * @see #setMipfilter(FxSamplerFilterCommon)
   * @see org.khronos.collada.ColladaPackage#getFxSampler1DCommon_Mipfilter()
   * @model default="NONE" unsettable="true"
   *        extendedMetaData="kind='element' name='mipfilter' namespace='##targetNamespace'"
   * @generated
   */
	FxSamplerFilterCommon getMipfilter();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSampler1DCommon#getMipfilter <em>Mipfilter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mipfilter</em>' attribute.
   * @see org.khronos.collada.FxSamplerFilterCommon
   * @see #isSetMipfilter()
   * @see #unsetMipfilter()
   * @see #getMipfilter()
   * @generated
   */
	void setMipfilter(FxSamplerFilterCommon value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSampler1DCommon#getMipfilter <em>Mipfilter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMipfilter()
   * @see #getMipfilter()
   * @see #setMipfilter(FxSamplerFilterCommon)
   * @generated
   */
	void unsetMipfilter();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSampler1DCommon#getMipfilter <em>Mipfilter</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Mipfilter</em>' attribute is set.
   * @see #unsetMipfilter()
   * @see #getMipfilter()
   * @see #setMipfilter(FxSamplerFilterCommon)
   * @generated
   */
	boolean isSetMipfilter();

	/**
   * Returns the value of the '<em><b>Border Color</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Border Color</em>' attribute.
   * @see #setBorderColor(List)
   * @see org.khronos.collada.ColladaPackage#getFxSampler1DCommon_BorderColor()
   * @model dataType="org.khronos.collada.FxColorCommon" many="false"
   *        extendedMetaData="kind='element' name='border_color' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getBorderColor();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSampler1DCommon#getBorderColor <em>Border Color</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Border Color</em>' attribute.
   * @see #getBorderColor()
   * @generated
   */
	void setBorderColor(List<Double> value);

	/**
   * Returns the value of the '<em><b>Mipmap Maxlevel</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mipmap Maxlevel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mipmap Maxlevel</em>' attribute.
   * @see #isSetMipmapMaxlevel()
   * @see #unsetMipmapMaxlevel()
   * @see #setMipmapMaxlevel(short)
   * @see org.khronos.collada.ColladaPackage#getFxSampler1DCommon_MipmapMaxlevel()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
   *        extendedMetaData="kind='element' name='mipmap_maxlevel' namespace='##targetNamespace'"
   * @generated
   */
	short getMipmapMaxlevel();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSampler1DCommon#getMipmapMaxlevel <em>Mipmap Maxlevel</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mipmap Maxlevel</em>' attribute.
   * @see #isSetMipmapMaxlevel()
   * @see #unsetMipmapMaxlevel()
   * @see #getMipmapMaxlevel()
   * @generated
   */
	void setMipmapMaxlevel(short value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSampler1DCommon#getMipmapMaxlevel <em>Mipmap Maxlevel</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMipmapMaxlevel()
   * @see #getMipmapMaxlevel()
   * @see #setMipmapMaxlevel(short)
   * @generated
   */
	void unsetMipmapMaxlevel();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSampler1DCommon#getMipmapMaxlevel <em>Mipmap Maxlevel</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Mipmap Maxlevel</em>' attribute is set.
   * @see #unsetMipmapMaxlevel()
   * @see #getMipmapMaxlevel()
   * @see #setMipmapMaxlevel(short)
   * @generated
   */
	boolean isSetMipmapMaxlevel();

	/**
   * Returns the value of the '<em><b>Mipmap Bias</b></em>' attribute.
   * The default value is <code>"0.0"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mipmap Bias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mipmap Bias</em>' attribute.
   * @see #isSetMipmapBias()
   * @see #unsetMipmapBias()
   * @see #setMipmapBias(float)
   * @see org.khronos.collada.ColladaPackage#getFxSampler1DCommon_MipmapBias()
   * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
   *        extendedMetaData="kind='element' name='mipmap_bias' namespace='##targetNamespace'"
   * @generated
   */
	float getMipmapBias();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSampler1DCommon#getMipmapBias <em>Mipmap Bias</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mipmap Bias</em>' attribute.
   * @see #isSetMipmapBias()
   * @see #unsetMipmapBias()
   * @see #getMipmapBias()
   * @generated
   */
	void setMipmapBias(float value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSampler1DCommon#getMipmapBias <em>Mipmap Bias</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMipmapBias()
   * @see #getMipmapBias()
   * @see #setMipmapBias(float)
   * @generated
   */
	void unsetMipmapBias();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSampler1DCommon#getMipmapBias <em>Mipmap Bias</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Mipmap Bias</em>' attribute is set.
   * @see #unsetMipmapBias()
   * @see #getMipmapBias()
   * @see #setMipmapBias(float)
   * @generated
   */
	boolean isSetMipmapBias();

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
   * @see org.khronos.collada.ColladaPackage#getFxSampler1DCommon_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

} // FxSampler1DCommon
