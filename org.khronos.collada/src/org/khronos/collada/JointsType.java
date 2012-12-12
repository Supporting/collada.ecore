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
 * A representation of the model object '<em><b>Joints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.JointsType#getInput <em>Input</em>}</li>
 *   <li>{@link org.khronos.collada.JointsType#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getJointsType()
 * @model extendedMetaData="name='joints_._type' kind='elementOnly'"
 * @generated
 */
public interface JointsType extends EObject {
	/**
   * Returns the value of the '<em><b>Input</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.InputLocal}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The input element must occur at least twice. These inputs are local inputs.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Input</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getJointsType_Input()
   * @model containment="true" lower="2"
   *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
   * @generated
   */
	EList<InputLocal> getInput();

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ExtraType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The extra element may appear any number of times.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getJointsType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

} // JointsType
