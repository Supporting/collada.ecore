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
 * A representation of the model object '<em><b>Technique Common Type8</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TechniqueCommonType8#getAccessor <em>Accessor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType8()
 * @model extendedMetaData="name='technique_common_._8_._type' kind='elementOnly'"
 * @generated
 */
public interface TechniqueCommonType8 extends EObject {
	/**
   * Returns the value of the '<em><b>Accessor</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The source's technique_common must have one and only one accessor.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Accessor</em>' containment reference.
   * @see #setAccessor(AccessorType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType8_Accessor()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='accessor' namespace='##targetNamespace'"
   * @generated
   */
	AccessorType getAccessor();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType8#getAccessor <em>Accessor</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accessor</em>' containment reference.
   * @see #getAccessor()
   * @generated
   */
	void setAccessor(AccessorType value);

} // TechniqueCommonType8
