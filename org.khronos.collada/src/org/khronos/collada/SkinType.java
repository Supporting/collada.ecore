/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skin Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.SkinType#getBindShapeMatrix <em>Bind Shape Matrix</em>}</li>
 *   <li>{@link org.khronos.collada.SkinType#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.SkinType#getJoints <em>Joints</em>}</li>
 *   <li>{@link org.khronos.collada.SkinType#getVertexWeights <em>Vertex Weights</em>}</li>
 *   <li>{@link org.khronos.collada.SkinType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.SkinType#getSource1 <em>Source1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getSkinType()
 * @model extendedMetaData="name='skin_._type' kind='elementOnly'"
 * @generated
 */
public interface SkinType extends EObject {
	/**
   * Returns the value of the '<em><b>Bind Shape Matrix</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						This provides extra information about the position and orientation of the base mesh before binding. 
   * 						If bind_shape_matrix is not specified then an identity matrix may be used as the bind_shape_matrix.
   * 						The bind_shape_matrix element may occur zero or one times.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Bind Shape Matrix</em>' attribute.
   * @see #setBindShapeMatrix(List)
   * @see org.khronos.collada.ColladaPackage#getSkinType_BindShapeMatrix()
   * @model dataType="org.khronos.collada.Float4x4" many="false"
   *        extendedMetaData="kind='element' name='bind_shape_matrix' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getBindShapeMatrix();

	/**
   * Sets the value of the '{@link org.khronos.collada.SkinType#getBindShapeMatrix <em>Bind Shape Matrix</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bind Shape Matrix</em>' attribute.
   * @see #getBindShapeMatrix()
   * @generated
   */
	void setBindShapeMatrix(List<Double> value);

	/**
   * Returns the value of the '<em><b>Source</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SourceType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The skin element must contain at least three source elements.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getSkinType_Source()
   * @model containment="true" lower="3"
   *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
   * @generated
   */
	EList<SourceType> getSource();

	/**
   * Returns the value of the '<em><b>Joints</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The joints element associates joint, or skeleton, nodes with attribute data.  
   * 						In COLLADA, this is specified by the inverse bind matrix of each joint (influence) in the skeleton.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Joints</em>' containment reference.
   * @see #setJoints(JointsType)
   * @see org.khronos.collada.ColladaPackage#getSkinType_Joints()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='joints' namespace='##targetNamespace'"
   * @generated
   */
	JointsType getJoints();

	/**
   * Sets the value of the '{@link org.khronos.collada.SkinType#getJoints <em>Joints</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Joints</em>' containment reference.
   * @see #getJoints()
   * @generated
   */
	void setJoints(JointsType value);

	/**
   * Returns the value of the '<em><b>Vertex Weights</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The vertex_weights element associates a set of joint-weight pairs with each vertex in the base mesh.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Vertex Weights</em>' containment reference.
   * @see #setVertexWeights(VertexWeightsType)
   * @see org.khronos.collada.ColladaPackage#getSkinType_VertexWeights()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='vertex_weights' namespace='##targetNamespace'"
   * @generated
   */
	VertexWeightsType getVertexWeights();

	/**
   * Sets the value of the '{@link org.khronos.collada.SkinType#getVertexWeights <em>Vertex Weights</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vertex Weights</em>' containment reference.
   * @see #getVertexWeights()
   * @generated
   */
	void setVertexWeights(VertexWeightsType value);

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ExtraType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The extra element may appear any number of times.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getSkinType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Source1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The source attribute contains a URI reference to the base mesh, (a static mesh or a morphed mesh).
   * 					This also provides the bind-shape of the skinned mesh.  Required attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source1</em>' attribute.
   * @see #setSource1(String)
   * @see org.khronos.collada.ColladaPackage#getSkinType_Source1()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
   *        extendedMetaData="kind='attribute' name='source'"
   * @generated
   */
	String getSource1();

	/**
   * Sets the value of the '{@link org.khronos.collada.SkinType#getSource1 <em>Source1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source1</em>' attribute.
   * @see #getSource1()
   * @generated
   */
	void setSource1(String value);

} // SkinType
