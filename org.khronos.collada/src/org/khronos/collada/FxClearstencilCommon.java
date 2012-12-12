/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fx Clearstencil Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.FxClearstencilCommon#getValue <em>Value</em>}</li>
 *   <li>{@link org.khronos.collada.FxClearstencilCommon#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getFxClearstencilCommon()
 * @model extendedMetaData="name='fx_clearstencil_common' kind='simple'"
 * @generated
 */
public interface FxClearstencilCommon extends EObject {
	/**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #isSetValue()
   * @see #unsetValue()
   * @see #setValue(byte)
   * @see org.khronos.collada.ColladaPackage#getFxClearstencilCommon_Value()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
   *        extendedMetaData="name=':0' kind='simple'"
   * @generated
   */
	byte getValue();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxClearstencilCommon#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #isSetValue()
   * @see #unsetValue()
   * @see #getValue()
   * @generated
   */
	void setValue(byte value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxClearstencilCommon#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetValue()
   * @see #getValue()
   * @see #setValue(byte)
   * @generated
   */
	void unsetValue();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxClearstencilCommon#getValue <em>Value</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Value</em>' attribute is set.
   * @see #unsetValue()
   * @see #getValue()
   * @see #setValue(byte)
   * @generated
   */
	boolean isSetValue();

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
   * @see org.khronos.collada.ColladaPackage#getFxClearstencilCommon_Index()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
   *        extendedMetaData="kind='attribute' name='index'"
   * @generated
   */
	BigInteger getIndex();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxClearstencilCommon#getIndex <em>Index</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.FxClearstencilCommon#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetIndex()
   * @see #getIndex()
   * @see #setIndex(BigInteger)
   * @generated
   */
	void unsetIndex();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxClearstencilCommon#getIndex <em>Index</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Index</em>' attribute is set.
   * @see #unsetIndex()
   * @see #getIndex()
   * @see #setIndex(BigInteger)
   * @generated
   */
	boolean isSetIndex();

} // FxClearstencilCommon
