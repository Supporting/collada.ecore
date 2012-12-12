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
 * A representation of the model object '<em><b>Gles Texenv Command Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.GlesTexenvCommandType#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTexenvCommandType#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTexenvCommandType#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getGlesTexenvCommandType()
 * @model extendedMetaData="name='gles_texenv_command_type' kind='elementOnly'"
 * @generated
 */
public interface GlesTexenvCommandType extends EObject {
	/**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference.
   * @see #setConstant(GlesTextureConstantType)
   * @see org.khronos.collada.ColladaPackage#getGlesTexenvCommandType_Constant()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='constant' namespace='##targetNamespace'"
   * @generated
   */
	GlesTextureConstantType getConstant();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTexenvCommandType#getConstant <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' containment reference.
   * @see #getConstant()
   * @generated
   */
	void setConstant(GlesTextureConstantType value);

	/**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.khronos.collada.GlesTexenvModeEnums}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.khronos.collada.GlesTexenvModeEnums
   * @see #isSetOperator()
   * @see #unsetOperator()
   * @see #setOperator(GlesTexenvModeEnums)
   * @see org.khronos.collada.ColladaPackage#getGlesTexenvCommandType_Operator()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='operator'"
   * @generated
   */
	GlesTexenvModeEnums getOperator();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTexenvCommandType#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.khronos.collada.GlesTexenvModeEnums
   * @see #isSetOperator()
   * @see #unsetOperator()
   * @see #getOperator()
   * @generated
   */
	void setOperator(GlesTexenvModeEnums value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.GlesTexenvCommandType#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetOperator()
   * @see #getOperator()
   * @see #setOperator(GlesTexenvModeEnums)
   * @generated
   */
	void unsetOperator();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.GlesTexenvCommandType#getOperator <em>Operator</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Operator</em>' attribute is set.
   * @see #unsetOperator()
   * @see #getOperator()
   * @see #setOperator(GlesTexenvModeEnums)
   * @generated
   */
	boolean isSetOperator();

	/**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see #setUnit(String)
   * @see org.khronos.collada.ColladaPackage#getGlesTexenvCommandType_Unit()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='unit'"
   * @generated
   */
	String getUnit();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTexenvCommandType#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see #getUnit()
   * @generated
   */
	void setUnit(String value);

} // GlesTexenvCommandType
