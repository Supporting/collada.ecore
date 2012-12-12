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
 * A representation of the model object '<em><b>Mesh Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.MeshType#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.MeshType#getVertices <em>Vertices</em>}</li>
 *   <li>{@link org.khronos.collada.MeshType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.MeshType#getLines <em>Lines</em>}</li>
 *   <li>{@link org.khronos.collada.MeshType#getLinestrips <em>Linestrips</em>}</li>
 *   <li>{@link org.khronos.collada.MeshType#getPolygons <em>Polygons</em>}</li>
 *   <li>{@link org.khronos.collada.MeshType#getPolylist <em>Polylist</em>}</li>
 *   <li>{@link org.khronos.collada.MeshType#getTriangles <em>Triangles</em>}</li>
 *   <li>{@link org.khronos.collada.MeshType#getTrifans <em>Trifans</em>}</li>
 *   <li>{@link org.khronos.collada.MeshType#getTristrips <em>Tristrips</em>}</li>
 *   <li>{@link org.khronos.collada.MeshType#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getMeshType()
 * @model extendedMetaData="name='mesh_._type' kind='elementOnly'"
 * @generated
 */
public interface MeshType extends EObject {
	/**
   * Returns the value of the '<em><b>Source</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SourceType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The mesh element must contain one or more source elements.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getMeshType_Source()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
   * @generated
   */
	EList<SourceType> getSource();

	/**
   * Returns the value of the '<em><b>Vertices</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The mesh element must contain one vertices element.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Vertices</em>' containment reference.
   * @see #setVertices(VerticesType)
   * @see org.khronos.collada.ColladaPackage#getMeshType_Vertices()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='vertices' namespace='##targetNamespace'"
   * @generated
   */
	VerticesType getVertices();

	/**
   * Sets the value of the '{@link org.khronos.collada.MeshType#getVertices <em>Vertices</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vertices</em>' containment reference.
   * @see #getVertices()
   * @generated
   */
	void setVertices(VerticesType value);

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
   * @see org.khronos.collada.ColladaPackage#getMeshType_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:2'"
   * @generated
   */
	FeatureMap getGroup();

	/**
   * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LinesType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The mesh element may contain any number of lines elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Lines</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getMeshType_Lines()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='lines' namespace='##targetNamespace' group='#group:2'"
   * @generated
   */
	EList<LinesType> getLines();

	/**
   * Returns the value of the '<em><b>Linestrips</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.LinestripsType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The mesh element may contain any number of linestrips elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Linestrips</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getMeshType_Linestrips()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='linestrips' namespace='##targetNamespace' group='#group:2'"
   * @generated
   */
	EList<LinestripsType> getLinestrips();

	/**
   * Returns the value of the '<em><b>Polygons</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PolygonsType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The mesh element may contain any number of polygons elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Polygons</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getMeshType_Polygons()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='polygons' namespace='##targetNamespace' group='#group:2'"
   * @generated
   */
	EList<PolygonsType> getPolygons();

	/**
   * Returns the value of the '<em><b>Polylist</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PolylistType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The mesh element may contain any number of polylist elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Polylist</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getMeshType_Polylist()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='polylist' namespace='##targetNamespace' group='#group:2'"
   * @generated
   */
	EList<PolylistType> getPolylist();

	/**
   * Returns the value of the '<em><b>Triangles</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TrianglesType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The mesh element may contain any number of triangles elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Triangles</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getMeshType_Triangles()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='triangles' namespace='##targetNamespace' group='#group:2'"
   * @generated
   */
	EList<TrianglesType> getTriangles();

	/**
   * Returns the value of the '<em><b>Trifans</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TrifansType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The mesh element may contain any number of trifans elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Trifans</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getMeshType_Trifans()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='trifans' namespace='##targetNamespace' group='#group:2'"
   * @generated
   */
	EList<TrifansType> getTrifans();

	/**
   * Returns the value of the '<em><b>Tristrips</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TristripsType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The mesh element may contain any number of tristrips elements.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Tristrips</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getMeshType_Tristrips()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='tristrips' namespace='##targetNamespace' group='#group:2'"
   * @generated
   */
	EList<TristripsType> getTristrips();

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
   * @see org.khronos.collada.ColladaPackage#getMeshType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

} // MeshType
