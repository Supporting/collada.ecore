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
 * A representation of the model object '<em><b>Fx Surface Init Volume Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.FxSurfaceInitVolumeCommon#getAll <em>All</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceInitVolumeCommon#getPrimary <em>Primary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getFxSurfaceInitVolumeCommon()
 * @model extendedMetaData="name='fx_surface_init_volume_common' kind='elementOnly'"
 * @generated
 */
public interface FxSurfaceInitVolumeCommon extends EObject {
	/**
   * Returns the value of the '<em><b>All</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Init the entire surface with one compound image such as DDS
   * <!-- end-model-doc -->
   * @return the value of the '<em>All</em>' containment reference.
   * @see #setAll(AllType)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceInitVolumeCommon_All()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='all' namespace='##targetNamespace'"
   * @generated
   */
	AllType getAll();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceInitVolumeCommon#getAll <em>All</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' containment reference.
   * @see #getAll()
   * @generated
   */
	void setAll(AllType value);

	/**
   * Returns the value of the '<em><b>Primary</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Init mip level 0 of the surface with one compound image such as DDS.  Use of this element expects that the surface has element mip_levels=0 or mipmap_generate.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Primary</em>' containment reference.
   * @see #setPrimary(PrimaryType)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceInitVolumeCommon_Primary()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='primary' namespace='##targetNamespace'"
   * @generated
   */
	PrimaryType getPrimary();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceInitVolumeCommon#getPrimary <em>Primary</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary</em>' containment reference.
   * @see #getPrimary()
   * @generated
   */
	void setPrimary(PrimaryType value);

} // FxSurfaceInitVolumeCommon
