/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fx Clearcolor Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.FxClearcolorCommon#getValue <em>Value</em>}</li>
 *   <li>{@link org.khronos.collada.FxClearcolorCommon#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getFxClearcolorCommon()
 * @model extendedMetaData="name='fx_clearcolor_common' kind='simple'"
 * @generated
 */
public interface FxClearcolorCommon extends EObject {
	/**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(List)
   * @see org.khronos.collada.ColladaPackage#getFxClearcolorCommon_Value()
   * @model dataType="org.khronos.collada.FxColorCommon" many="false"
   *        extendedMetaData="name=':0' kind='simple'"
   * @generated
   */
	List<Double> getValue();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxClearcolorCommon#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
	void setValue(List<Double> value);

	/**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #isSetIndex()
   * @see #unsetIndex()
   * @see #setIndex(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getFxClearcolorCommon_Index()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
   *        extendedMetaData="kind='attribute' name='index'"
   * @generated
   */
	BigInteger getIndex();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxClearcolorCommon#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #isSetIndex()
   * @see #unsetIndex()
   * @see #getIndex()
   * @generated
   */
	void setIndex(BigInteger value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxClearcolorCommon#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetIndex()
   * @see #getIndex()
   * @see #setIndex(BigInteger)
   * @generated
   */
	void unsetIndex();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxClearcolorCommon#getIndex <em>Index</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Index</em>' attribute is set.
   * @see #unsetIndex()
   * @see #getIndex()
   * @see #setIndex(BigInteger)
   * @generated
   */
	boolean isSetIndex();

} // FxClearcolorCommon
