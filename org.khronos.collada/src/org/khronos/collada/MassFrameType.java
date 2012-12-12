/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mass Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.MassFrameType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.MassFrameType#getTranslate <em>Translate</em>}</li>
 *   <li>{@link org.khronos.collada.MassFrameType#getRotate <em>Rotate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getMassFrameType()
 * @model extendedMetaData="name='mass_frame_._type' kind='elementOnly'"
 * @generated
 */
public interface MassFrameType extends EObject {
	/**
   * Returns the value of the '<em><b>Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getMassFrameType_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:0'"
   * @generated
   */
	FeatureMap getGroup();

	/**
   * Returns the value of the '<em><b>Translate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TargetableFloat3}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The translate element contains a mathematical vector that represents the distance along the 
   * 			X, Y and Z-axes.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Translate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getMassFrameType_Translate()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='translate' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<TargetableFloat3> getTranslate();

	/**
   * Returns the value of the '<em><b>Rotate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.RotateType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The rotate element contains an angle and a mathematical vector that represents the axis of rotation.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Rotate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getMassFrameType_Rotate()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='rotate' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<RotateType> getRotate();

} // MassFrameType
