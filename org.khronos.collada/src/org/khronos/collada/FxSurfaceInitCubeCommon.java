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
 * A representation of the model object '<em><b>Fx Surface Init Cube Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.FxSurfaceInitCubeCommon#getAll <em>All</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceInitCubeCommon#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceInitCubeCommon#getFace <em>Face</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getFxSurfaceInitCubeCommon()
 * @model extendedMetaData="name='fx_surface_init_cube_common' kind='elementOnly'"
 * @generated
 */
public interface FxSurfaceInitCubeCommon extends EObject {
	/**
   * Returns the value of the '<em><b>All</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Init the entire surface with one compound image such as DDS
   * <!-- end-model-doc -->
   * @return the value of the '<em>All</em>' containment reference.
   * @see #setAll(AllType2)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceInitCubeCommon_All()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='all' namespace='##targetNamespace'"
   * @generated
   */
	AllType2 getAll();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceInitCubeCommon#getAll <em>All</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' containment reference.
   * @see #getAll()
   * @generated
   */
	void setAll(AllType2 value);

	/**
   * Returns the value of the '<em><b>Primary</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Init all primary mip level 0 subsurfaces with one compound image such as DDS.  Use of this element expects that the surface has element mip_levels=0 or mipmap_generate.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Primary</em>' containment reference.
   * @see #setPrimary(PrimaryType1)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceInitCubeCommon_Primary()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='primary' namespace='##targetNamespace'"
   * @generated
   */
	PrimaryType1 getPrimary();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceInitCubeCommon#getPrimary <em>Primary</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary</em>' containment reference.
   * @see #getPrimary()
   * @generated
   */
	void setPrimary(PrimaryType1 value);

	/**
   * Returns the value of the '<em><b>Face</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FaceType4}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Init each face mipchain with one compound image such as DDS
   * <!-- end-model-doc -->
   * @return the value of the '<em>Face</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceInitCubeCommon_Face()
   * @model containment="true" upper="6"
   *        extendedMetaData="kind='element' name='face' namespace='##targetNamespace'"
   * @generated
   */
	EList<FaceType4> getFace();

} // FxSurfaceInitCubeCommon
