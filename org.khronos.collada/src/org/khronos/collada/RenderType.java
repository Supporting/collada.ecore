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
 * A representation of the model object '<em><b>Render Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.RenderType#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.khronos.collada.RenderType#getInstanceEffect <em>Instance Effect</em>}</li>
 *   <li>{@link org.khronos.collada.RenderType#getCameraNode <em>Camera Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getRenderType()
 * @model extendedMetaData="name='render_._type' kind='elementOnly'"
 * @generated
 */
public interface RenderType extends EObject {
	/**
   * Returns the value of the '<em><b>Layer</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 												The layer element specifies which layer to render in this compositing step 
   * 												while evaluating the scene. You may specify any number of layers.
   * 												
   * <!-- end-model-doc -->
   * @return the value of the '<em>Layer</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getRenderType_Layer()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='element' name='layer' namespace='##targetNamespace'"
   * @generated
   */
	EList<String> getLayer();

	/**
   * Returns the value of the '<em><b>Instance Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 												The instance_effect element specifies which effect to render in this compositing step 
   * 												while evaluating the scene.
   * 												
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Effect</em>' containment reference.
   * @see #setInstanceEffect(InstanceEffectType)
   * @see org.khronos.collada.ColladaPackage#getRenderType_InstanceEffect()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_effect' namespace='##targetNamespace'"
   * @generated
   */
	InstanceEffectType getInstanceEffect();

	/**
   * Sets the value of the '{@link org.khronos.collada.RenderType#getInstanceEffect <em>Instance Effect</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Effect</em>' containment reference.
   * @see #getInstanceEffect()
   * @generated
   */
	void setInstanceEffect(InstanceEffectType value);

	/**
   * Returns the value of the '<em><b>Camera Node</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 											The camera_node attribute refers to a node that contains a camera describing the viewpoint to 
   * 											render this compositing step from.
   * 											
   * <!-- end-model-doc -->
   * @return the value of the '<em>Camera Node</em>' attribute.
   * @see #setCameraNode(String)
   * @see org.khronos.collada.ColladaPackage#getRenderType_CameraNode()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
   *        extendedMetaData="kind='attribute' name='camera_node'"
   * @generated
   */
	String getCameraNode();

	/**
   * Sets the value of the '{@link org.khronos.collada.RenderType#getCameraNode <em>Camera Node</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Camera Node</em>' attribute.
   * @see #getCameraNode()
   * @generated
   */
	void setCameraNode(String value);

} // RenderType
