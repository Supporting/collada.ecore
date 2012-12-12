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
 * A representation of the model object '<em><b>Texture Env Color Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TextureEnvColorType#getIndex <em>Index</em>}</li>
 *   <li>{@link org.khronos.collada.TextureEnvColorType#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.TextureEnvColorType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTextureEnvColorType()
 * @model extendedMetaData="name='texture_env_color_._type' kind='empty'"
 * @generated
 */
public interface TextureEnvColorType extends EObject {
	/**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getTextureEnvColorType_Index()
   * @model dataType="org.khronos.collada.GLMAXTEXTUREIMAGEUNITSIndex"
   *        extendedMetaData="kind='attribute' name='index'"
   * @generated
   */
	BigInteger getIndex();

	/**
   * Sets the value of the '{@link org.khronos.collada.TextureEnvColorType#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
	void setIndex(BigInteger value);

	/**
   * Returns the value of the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' attribute.
   * @see #setParam(String)
   * @see org.khronos.collada.ColladaPackage#getTextureEnvColorType_Param()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='param'"
   * @generated
   */
	String getParam();

	/**
   * Sets the value of the '{@link org.khronos.collada.TextureEnvColorType#getParam <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' attribute.
   * @see #getParam()
   * @generated
   */
	void setParam(String value);

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
   * @see org.khronos.collada.ColladaPackage#getTextureEnvColorType_Value()
   * @model dataType="org.khronos.collada.Float4" many="false"
   *        extendedMetaData="kind='attribute' name='value'"
   * @generated
   */
	List<Double> getValue();

	/**
   * Sets the value of the '{@link org.khronos.collada.TextureEnvColorType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
	void setValue(List<Double> value);

} // TextureEnvColorType
