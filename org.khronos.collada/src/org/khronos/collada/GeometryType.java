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
 * A representation of the model object '<em><b>Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.GeometryType#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.GeometryType#getConvexMesh <em>Convex Mesh</em>}</li>
 *   <li>{@link org.khronos.collada.GeometryType#getMesh <em>Mesh</em>}</li>
 *   <li>{@link org.khronos.collada.GeometryType#getSpline <em>Spline</em>}</li>
 *   <li>{@link org.khronos.collada.GeometryType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.GeometryType#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.GeometryType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getGeometryType()
 * @model extendedMetaData="name='geometry_._type' kind='elementOnly'"
 * @generated
 */
public interface GeometryType extends EObject {
	/**
   * Returns the value of the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The geometry element may contain an asset element.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Asset</em>' containment reference.
   * @see #setAsset(AssetType)
   * @see org.khronos.collada.ColladaPackage#getGeometryType_Asset()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
   * @generated
   */
	AssetType getAsset();

	/**
   * Sets the value of the '{@link org.khronos.collada.GeometryType#getAsset <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asset</em>' containment reference.
   * @see #getAsset()
   * @generated
   */
	void setAsset(AssetType value);

	/**
   * Returns the value of the '<em><b>Convex Mesh</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The geometry element may contain only one mesh or convex_mesh.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Convex Mesh</em>' containment reference.
   * @see #setConvexMesh(ConvexMeshType)
   * @see org.khronos.collada.ColladaPackage#getGeometryType_ConvexMesh()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='convex_mesh' namespace='##targetNamespace'"
   * @generated
   */
	ConvexMeshType getConvexMesh();

	/**
   * Sets the value of the '{@link org.khronos.collada.GeometryType#getConvexMesh <em>Convex Mesh</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Convex Mesh</em>' containment reference.
   * @see #getConvexMesh()
   * @generated
   */
	void setConvexMesh(ConvexMeshType value);

	/**
   * Returns the value of the '<em><b>Mesh</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The geometry element may contain only one mesh or convex_mesh.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Mesh</em>' containment reference.
   * @see #setMesh(MeshType)
   * @see org.khronos.collada.ColladaPackage#getGeometryType_Mesh()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='mesh' namespace='##targetNamespace'"
   * @generated
   */
	MeshType getMesh();

	/**
   * Sets the value of the '{@link org.khronos.collada.GeometryType#getMesh <em>Mesh</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mesh</em>' containment reference.
   * @see #getMesh()
   * @generated
   */
	void setMesh(MeshType value);

	/**
   * Returns the value of the '<em><b>Spline</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The spline element contains control vertex information sufficient to describe basic splines.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Spline</em>' containment reference.
   * @see #setSpline(SplineType)
   * @see org.khronos.collada.ColladaPackage#getGeometryType_Spline()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='spline' namespace='##targetNamespace'"
   * @generated
   */
	SplineType getSpline();

	/**
   * Sets the value of the '{@link org.khronos.collada.GeometryType#getSpline <em>Spline</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spline</em>' containment reference.
   * @see #getSpline()
   * @generated
   */
	void setSpline(SplineType value);

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
   * @see org.khronos.collada.ColladaPackage#getGeometryType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The id attribute is a text string containing the unique identifier of this element. 
   * 					This value must be unique within the instance document. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.khronos.collada.ColladaPackage#getGeometryType_Id()
   * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.khronos.collada.GeometryType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
	void setId(String value);

	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The name attribute is the text string name of this element. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.khronos.collada.ColladaPackage#getGeometryType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.GeometryType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // GeometryType
