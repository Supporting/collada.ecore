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
 * A representation of the model object '<em><b>Gles Texcombiner Command RGB Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			Defines the RGB portion of a texture_pipeline command. This is a combiner-mode texturing operation.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.GlesTexcombinerCommandRGBType#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTexcombinerCommandRGBType#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTexcombinerCommandRGBType#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerCommandRGBType()
 * @model extendedMetaData="name='gles_texcombiner_commandRGB_type' kind='elementOnly'"
 * @generated
 */
public interface GlesTexcombinerCommandRGBType extends EObject {
	/**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.GlesTexcombinerArgumentRGBType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerCommandRGBType_Argument()
   * @model containment="true" required="true" upper="3"
   *        extendedMetaData="kind='element' name='argument' namespace='##targetNamespace'"
   * @generated
   */
	EList<GlesTexcombinerArgumentRGBType> getArgument();

	/**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.khronos.collada.GlesTexcombinerOperatorRGBEnums}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.khronos.collada.GlesTexcombinerOperatorRGBEnums
   * @see #isSetOperator()
   * @see #unsetOperator()
   * @see #setOperator(GlesTexcombinerOperatorRGBEnums)
   * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerCommandRGBType_Operator()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='operator'"
   * @generated
   */
	GlesTexcombinerOperatorRGBEnums getOperator();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTexcombinerCommandRGBType#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.khronos.collada.GlesTexcombinerOperatorRGBEnums
   * @see #isSetOperator()
   * @see #unsetOperator()
   * @see #getOperator()
   * @generated
   */
	void setOperator(GlesTexcombinerOperatorRGBEnums value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.GlesTexcombinerCommandRGBType#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetOperator()
   * @see #getOperator()
   * @see #setOperator(GlesTexcombinerOperatorRGBEnums)
   * @generated
   */
	void unsetOperator();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.GlesTexcombinerCommandRGBType#getOperator <em>Operator</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Operator</em>' attribute is set.
   * @see #unsetOperator()
   * @see #getOperator()
   * @see #setOperator(GlesTexcombinerOperatorRGBEnums)
   * @generated
   */
	boolean isSetOperator();

	/**
   * Returns the value of the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Scale</em>' attribute.
   * @see #isSetScale()
   * @see #unsetScale()
   * @see #setScale(float)
   * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerCommandRGBType_Scale()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
   *        extendedMetaData="kind='attribute' name='scale'"
   * @generated
   */
	float getScale();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTexcombinerCommandRGBType#getScale <em>Scale</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scale</em>' attribute.
   * @see #isSetScale()
   * @see #unsetScale()
   * @see #getScale()
   * @generated
   */
	void setScale(float value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.GlesTexcombinerCommandRGBType#getScale <em>Scale</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetScale()
   * @see #getScale()
   * @see #setScale(float)
   * @generated
   */
	void unsetScale();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.GlesTexcombinerCommandRGBType#getScale <em>Scale</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Scale</em>' attribute is set.
   * @see #unsetScale()
   * @see #getScale()
   * @see #setScale(float)
   * @generated
   */
	boolean isSetScale();

} // GlesTexcombinerCommandRGBType
