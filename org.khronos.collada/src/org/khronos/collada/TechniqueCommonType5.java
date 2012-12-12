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
 * A representation of the model object '<em><b>Technique Common Type5</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TechniqueCommonType5#getInstanceMaterial <em>Instance Material</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType5()
 * @model extendedMetaData="name='technique_common_._5_._type' kind='elementOnly'"
 * @generated
 */
public interface TechniqueCommonType5 extends EObject {
	/**
   * Returns the value of the '<em><b>Instance Material</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.InstanceMaterialType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The instance_material element specifies the information needed to bind a geometry
   * 									to a material. This element must appear at least once.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Material</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType5_InstanceMaterial()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='instance_material' namespace='##targetNamespace'"
   * @generated
   */
	EList<InstanceMaterialType> getInstanceMaterial();

} // TechniqueCommonType5
