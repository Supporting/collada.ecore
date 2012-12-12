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
 * A representation of the model object '<em><b>Gles Texcombiner Argument Alpha Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.GlesTexcombinerArgumentAlphaType#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTexcombinerArgumentAlphaType#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTexcombinerArgumentAlphaType#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerArgumentAlphaType()
 * @model extendedMetaData="name='gles_texcombiner_argumentAlpha_type' kind='empty'"
 * @generated
 */
public interface GlesTexcombinerArgumentAlphaType extends EObject {
	/**
   * Returns the value of the '<em><b>Operand</b></em>' attribute.
   * The default value is <code>"SRC_ALPHA"</code>.
   * The literals are from the enumeration {@link org.khronos.collada.GlesTexcombinerOperandAlphaEnums}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Operand</em>' attribute.
   * @see org.khronos.collada.GlesTexcombinerOperandAlphaEnums
   * @see #isSetOperand()
   * @see #unsetOperand()
   * @see #setOperand(GlesTexcombinerOperandAlphaEnums)
   * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerArgumentAlphaType_Operand()
   * @model default="SRC_ALPHA" unsettable="true"
   *        extendedMetaData="kind='attribute' name='operand'"
   * @generated
   */
	GlesTexcombinerOperandAlphaEnums getOperand();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTexcombinerArgumentAlphaType#getOperand <em>Operand</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand</em>' attribute.
   * @see org.khronos.collada.GlesTexcombinerOperandAlphaEnums
   * @see #isSetOperand()
   * @see #unsetOperand()
   * @see #getOperand()
   * @generated
   */
	void setOperand(GlesTexcombinerOperandAlphaEnums value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.GlesTexcombinerArgumentAlphaType#getOperand <em>Operand</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetOperand()
   * @see #getOperand()
   * @see #setOperand(GlesTexcombinerOperandAlphaEnums)
   * @generated
   */
	void unsetOperand();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.GlesTexcombinerArgumentAlphaType#getOperand <em>Operand</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Operand</em>' attribute is set.
   * @see #unsetOperand()
   * @see #getOperand()
   * @see #setOperand(GlesTexcombinerOperandAlphaEnums)
   * @generated
   */
	boolean isSetOperand();

	/**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * The literals are from the enumeration {@link org.khronos.collada.GlesTexcombinerSourceEnums}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see org.khronos.collada.GlesTexcombinerSourceEnums
   * @see #isSetSource()
   * @see #unsetSource()
   * @see #setSource(GlesTexcombinerSourceEnums)
   * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerArgumentAlphaType_Source()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='source'"
   * @generated
   */
	GlesTexcombinerSourceEnums getSource();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTexcombinerArgumentAlphaType#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see org.khronos.collada.GlesTexcombinerSourceEnums
   * @see #isSetSource()
   * @see #unsetSource()
   * @see #getSource()
   * @generated
   */
	void setSource(GlesTexcombinerSourceEnums value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.GlesTexcombinerArgumentAlphaType#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetSource()
   * @see #getSource()
   * @see #setSource(GlesTexcombinerSourceEnums)
   * @generated
   */
	void unsetSource();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.GlesTexcombinerArgumentAlphaType#getSource <em>Source</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Source</em>' attribute is set.
   * @see #unsetSource()
   * @see #getSource()
   * @see #setSource(GlesTexcombinerSourceEnums)
   * @generated
   */
	boolean isSetSource();

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
   * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerArgumentAlphaType_Unit()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='unit'"
   * @generated
   */
	String getUnit();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTexcombinerArgumentAlphaType#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see #getUnit()
   * @generated
   */
	void setUnit(String value);

} // GlesTexcombinerArgumentAlphaType
