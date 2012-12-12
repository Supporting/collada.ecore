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
 * A representation of the model object '<em><b>Alpha Func Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.AlphaFuncType#getFunc <em>Func</em>}</li>
 *   <li>{@link org.khronos.collada.AlphaFuncType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getAlphaFuncType()
 * @model extendedMetaData="name='alpha_func_._type' kind='elementOnly'"
 * @generated
 */
public interface AlphaFuncType extends EObject {
	/**
   * Returns the value of the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Func</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' containment reference.
   * @see #setFunc(FuncType1)
   * @see org.khronos.collada.ColladaPackage#getAlphaFuncType_Func()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='func' namespace='##targetNamespace'"
   * @generated
   */
	FuncType1 getFunc();

	/**
   * Sets the value of the '{@link org.khronos.collada.AlphaFuncType#getFunc <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' containment reference.
   * @see #getFunc()
   * @generated
   */
	void setFunc(FuncType1 value);

	/**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ValueType)
   * @see org.khronos.collada.ColladaPackage#getAlphaFuncType_Value()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
   * @generated
   */
	ValueType getValue();

	/**
   * Sets the value of the '{@link org.khronos.collada.AlphaFuncType#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
	void setValue(ValueType value);

} // AlphaFuncType
