/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fx Surface Init Planar Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * For 1D, 2D, RECT surface types
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.FxSurfaceInitPlanarCommon#getAll <em>All</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getFxSurfaceInitPlanarCommon()
 * @model extendedMetaData="name='fx_surface_init_planar_common' kind='elementOnly'"
 * @generated
 */
public interface FxSurfaceInitPlanarCommon extends EObject {
	/**
   * Returns the value of the '<em><b>All</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Init the entire surface with one compound image such as DDS
   * <!-- end-model-doc -->
   * @return the value of the '<em>All</em>' containment reference.
   * @see #setAll(AllType1)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceInitPlanarCommon_All()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='all' namespace='##targetNamespace'"
   * @generated
   */
	AllType1 getAll();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceInitPlanarCommon#getAll <em>All</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' containment reference.
   * @see #getAll()
   * @generated
   */
	void setAll(AllType1 value);

} // FxSurfaceInitPlanarCommon
