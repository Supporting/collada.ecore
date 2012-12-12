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
 * A representation of the model object '<em><b>Fx Sampler DEPTH Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			A texture sampler for depth maps.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.FxSamplerDEPTHCommon#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.FxSamplerDEPTHCommon#getWrapS <em>Wrap S</em>}</li>
 *   <li>{@link org.khronos.collada.FxSamplerDEPTHCommon#getWrapT <em>Wrap T</em>}</li>
 *   <li>{@link org.khronos.collada.FxSamplerDEPTHCommon#getMinfilter <em>Minfilter</em>}</li>
 *   <li>{@link org.khronos.collada.FxSamplerDEPTHCommon#getMagfilter <em>Magfilter</em>}</li>
 *   <li>{@link org.khronos.collada.FxSamplerDEPTHCommon#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getFxSamplerDEPTHCommon()
 * @model extendedMetaData="name='fx_samplerDEPTH_common' kind='elementOnly'"
 * @generated
 */
public interface FxSamplerDEPTHCommon extends EObject {
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
   * @see org.khronos.collada.ColladaPackage#getFxSamplerDEPTHCommon_Source()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
   * @generated
   */
	String getSource();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSamplerDEPTHCommon#getSource <em>Source</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getFxSamplerDEPTHCommon_WrapS()
   * @model default="WRAP" unsettable="true"
   *        extendedMetaData="kind='element' name='wrap_s' namespace='##targetNamespace'"
   * @generated
   */
	FxSamplerWrapCommon getWrapS();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSamplerDEPTHCommon#getWrapS <em>Wrap S</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.FxSamplerDEPTHCommon#getWrapS <em>Wrap S</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetWrapS()
   * @see #getWrapS()
   * @see #setWrapS(FxSamplerWrapCommon)
   * @generated
   */
	void unsetWrapS();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSamplerDEPTHCommon#getWrapS <em>Wrap S</em>}' attribute is set.
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
   * Returns the value of the '<em><b>Wrap T</b></em>' attribute.
   * The default value is <code>"WRAP"</code>.
   * The literals are from the enumeration {@link org.khronos.collada.FxSamplerWrapCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrap T</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Wrap T</em>' attribute.
   * @see org.khronos.collada.FxSamplerWrapCommon
   * @see #isSetWrapT()
   * @see #unsetWrapT()
   * @see #setWrapT(FxSamplerWrapCommon)
   * @see org.khronos.collada.ColladaPackage#getFxSamplerDEPTHCommon_WrapT()
   * @model default="WRAP" unsettable="true"
   *        extendedMetaData="kind='element' name='wrap_t' namespace='##targetNamespace'"
   * @generated
   */
	FxSamplerWrapCommon getWrapT();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSamplerDEPTHCommon#getWrapT <em>Wrap T</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wrap T</em>' attribute.
   * @see org.khronos.collada.FxSamplerWrapCommon
   * @see #isSetWrapT()
   * @see #unsetWrapT()
   * @see #getWrapT()
   * @generated
   */
	void setWrapT(FxSamplerWrapCommon value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSamplerDEPTHCommon#getWrapT <em>Wrap T</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetWrapT()
   * @see #getWrapT()
   * @see #setWrapT(FxSamplerWrapCommon)
   * @generated
   */
	void unsetWrapT();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSamplerDEPTHCommon#getWrapT <em>Wrap T</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Wrap T</em>' attribute is set.
   * @see #unsetWrapT()
   * @see #getWrapT()
   * @see #setWrapT(FxSamplerWrapCommon)
   * @generated
   */
	boolean isSetWrapT();

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
   * @see org.khronos.collada.ColladaPackage#getFxSamplerDEPTHCommon_Minfilter()
   * @model default="NONE" unsettable="true"
   *        extendedMetaData="kind='element' name='minfilter' namespace='##targetNamespace'"
   * @generated
   */
	FxSamplerFilterCommon getMinfilter();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSamplerDEPTHCommon#getMinfilter <em>Minfilter</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.FxSamplerDEPTHCommon#getMinfilter <em>Minfilter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMinfilter()
   * @see #getMinfilter()
   * @see #setMinfilter(FxSamplerFilterCommon)
   * @generated
   */
	void unsetMinfilter();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSamplerDEPTHCommon#getMinfilter <em>Minfilter</em>}' attribute is set.
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
   * @see org.khronos.collada.ColladaPackage#getFxSamplerDEPTHCommon_Magfilter()
   * @model default="NONE" unsettable="true"
   *        extendedMetaData="kind='element' name='magfilter' namespace='##targetNamespace'"
   * @generated
   */
	FxSamplerFilterCommon getMagfilter();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSamplerDEPTHCommon#getMagfilter <em>Magfilter</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.FxSamplerDEPTHCommon#getMagfilter <em>Magfilter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMagfilter()
   * @see #getMagfilter()
   * @see #setMagfilter(FxSamplerFilterCommon)
   * @generated
   */
	void unsetMagfilter();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSamplerDEPTHCommon#getMagfilter <em>Magfilter</em>}' attribute is set.
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
   * @see org.khronos.collada.ColladaPackage#getFxSamplerDEPTHCommon_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

} // FxSamplerDEPTHCommon
