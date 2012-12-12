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
 * A representation of the model object '<em><b>Convex Mesh Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.ConvexMeshType#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.ConvexMeshType#getVertices <em>Vertices</em>}</li>
 *   <li>{@link org.khronos.collada.ConvexMeshType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.ConvexMeshType#getLines <em>Lines</em>}</li>
 *   <li>{@link org.khronos.collada.ConvexMeshType#getLinestrips <em>Linestrips</em>}</li>
 *   <li>{@link org.khronos.collada.ConvexMeshType#getPolygons <em>Polygons</em>}</li>
 *   <li>{@link org.khronos.collada.ConvexMeshType#getPolylist <em>Polylist</em>}</li>
 *   <li>{@link org.khronos.collada.ConvexMeshType#getTriangles <em>Triangles</em>}</li>
 *   <li>{@link org.khronos.collada.ConvexMeshType#getTrifans <em>Trifans</em>}</li>
 *   <li>{@link org.khronos.collada.ConvexMeshType#getTristrips <em>Tristrips</em>}</li>
 *   <li>{@link org.khronos.collada.ConvexMeshType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.ConvexMeshType#getConvexHullOf <em>Convex Hull Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getConvexMeshType()
 * @model extendedMetaData="name='convex_mesh_._type' kind='elementOnly'"
 * @generated
 */
public interface ConvexMeshType extends EObject {
	/**
   * Returns the value of the '<em><b>Source</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SourceType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The source element declares a data repository that provides values according to the semantics of an 
   * 			input element that refers to it.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getConvexMeshType_Source()
   * @model containment="true"
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
   * 			The vertices element declares the attributes and identity of mesh-vertices. The vertices element
   * 			describes mesh-vertices in a mesh geometry. The mesh-vertices represent the position (identity) 
   * 			of the vertices comprising the mesh and other vertex attributes that are invariant to tessellation.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Vertices</em>' containment reference.
   * @see #setVertices(VerticesType)
   * @see org.khronos.collada.ColladaPackage#getConvexMeshType_Vertices()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='vertices' namespace='##targetNamespace'"
   * @generated
   */
	VerticesType getVertices();

	/**
   * Sets the value of the '{@link org.khronos.collada.ConvexMeshType#getVertices <em>Vertices</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getConvexMeshType_Group()
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
   * 			The lines element provides the information needed to bind vertex attributes together and then 
   * 			organize those vertices into individual lines. Each line described by the mesh has two vertices. 
   * 			The first line is formed from first and second vertices. The second line is formed from the 
   * 			third and fourth vertices and so on.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Lines</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getConvexMeshType_Lines()
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
   * 			The linestrips element provides the information needed to bind vertex attributes together and 
   * 			then organize those vertices into connected line-strips. Each line-strip described by the mesh 
   * 			has an arbitrary number of vertices. Each line segment within the line-strip is formed from the 
   * 			current vertex and the preceding vertex.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Linestrips</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getConvexMeshType_Linestrips()
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
   * 			The polygons element provides the information needed to bind vertex attributes together and 
   * 			then organize those vertices into individual polygons. The polygons described can contain 
   * 			arbitrary numbers of vertices. These polygons may be self intersecting and may also contain holes.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Polygons</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getConvexMeshType_Polygons()
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
   * 			The polylist element provides the information needed to bind vertex attributes together and 
   * 			then organize those vertices into individual polygons. The polygons described in polylist can 
   * 			contain arbitrary numbers of vertices. Unlike the polygons element, the polylist element cannot 
   * 			contain polygons with holes.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Polylist</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getConvexMeshType_Polylist()
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
   * 			The triangles element provides the information needed to bind vertex attributes together and 
   * 			then organize those vertices into individual triangles.	Each triangle described by the mesh has 
   * 			three vertices. The first triangle is formed from the first, second, and third vertices. The 
   * 			second triangle is formed from the fourth, fifth, and sixth vertices, and so on.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Triangles</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getConvexMeshType_Triangles()
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
   * 			The trifans element provides the information needed to bind vertex attributes together and then 
   * 			organize those vertices into connected triangles. Each triangle described by the mesh has three 
   * 			vertices. The first triangle is formed from first, second, and third vertices. Each subsequent 
   * 			triangle is formed from the current vertex, reusing the first and the previous vertices.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Trifans</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getConvexMeshType_Trifans()
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
   * 			The tristrips element provides the information needed to bind vertex attributes together and then 
   * 			organize those vertices into connected triangles. Each triangle described by the mesh has three 
   * 			vertices. The first triangle is formed from first, second, and third vertices. Each subsequent 
   * 			triangle is formed from the current vertex, reusing the previous two vertices.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Tristrips</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getConvexMeshType_Tristrips()
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
   * @see org.khronos.collada.ColladaPackage#getConvexMeshType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Convex Hull Of</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The convex_hull_of attribute is a URI string of geometry to compute the convex hull of. 
   * 					Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Convex Hull Of</em>' attribute.
   * @see #setConvexHullOf(String)
   * @see org.khronos.collada.ColladaPackage#getConvexMeshType_ConvexHullOf()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
   *        extendedMetaData="kind='attribute' name='convex_hull_of'"
   * @generated
   */
	String getConvexHullOf();

	/**
   * Sets the value of the '{@link org.khronos.collada.ConvexMeshType#getConvexHullOf <em>Convex Hull Of</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Convex Hull Of</em>' attribute.
   * @see #getConvexHullOf()
   * @generated
   */
	void setConvexHullOf(String value);

} // ConvexMeshType
