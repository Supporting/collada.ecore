/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Float Or Param Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.CommonFloatOrParamType#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.CommonFloatOrParamType#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getCommonFloatOrParamType()
 * @model extendedMetaData="name='common_float_or_param_type' kind='elementOnly'"
 * @generated
 */
public interface CommonFloatOrParamType extends EObject {
	/**
   * Returns the value of the '<em><b>Float</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float</em>' containment reference.
   * @see #setFloat(FloatType)
   * @see org.khronos.collada.ColladaPackage#getCommonFloatOrParamType_Float()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='float' namespace='##targetNamespace'"
   * @generated
   */
	FloatType getFloat();

	/**
   * Sets the value of the '{@link org.khronos.collada.CommonFloatOrParamType#getFloat <em>Float</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float</em>' containment reference.
   * @see #getFloat()
   * @generated
   */
	void setFloat(FloatType value);

	/**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(ParamType2)
   * @see org.khronos.collada.ColladaPackage#getCommonFloatOrParamType_Param()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
   * @generated
   */
	ParamType2 getParam();

	/**
   * Sets the value of the '{@link org.khronos.collada.CommonFloatOrParamType#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
   * @see #getParam()
   * @generated
   */
	void setParam(ParamType2 value);

} // CommonFloatOrParamType
