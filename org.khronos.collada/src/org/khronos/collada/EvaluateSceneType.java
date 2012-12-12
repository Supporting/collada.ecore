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
 * A representation of the model object '<em><b>Evaluate Scene Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.EvaluateSceneType#getRender <em>Render</em>}</li>
 *   <li>{@link org.khronos.collada.EvaluateSceneType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getEvaluateSceneType()
 * @model extendedMetaData="name='evaluate_scene_._type' kind='elementOnly'"
 * @generated
 */
public interface EvaluateSceneType extends EObject {
	/**
   * Returns the value of the '<em><b>Render</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.RenderType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The render element describes one effect pass to evaluate the scene.
   * 									There must be at least one render element.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Render</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getEvaluateSceneType_Render()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='render' namespace='##targetNamespace'"
   * @generated
   */
	EList<RenderType> getRender();

	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 								The name attribute is the text string name of this element. Optional attribute.
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.khronos.collada.ColladaPackage#getEvaluateSceneType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.EvaluateSceneType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // EvaluateSceneType
