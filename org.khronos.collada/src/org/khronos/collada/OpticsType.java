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
 * A representation of the model object '<em><b>Optics Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.OpticsType#getTechniqueCommon <em>Technique Common</em>}</li>
 *   <li>{@link org.khronos.collada.OpticsType#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.OpticsType#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getOpticsType()
 * @model extendedMetaData="name='optics_._type' kind='elementOnly'"
 * @generated
 */
public interface OpticsType extends EObject {
	/**
   * Returns the value of the '<em><b>Technique Common</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The technique_common element specifies the optics information for the common profile 
   * 									which all COLLADA implementations need to support.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Technique Common</em>' containment reference.
   * @see #setTechniqueCommon(TechniqueCommonType2)
   * @see org.khronos.collada.ColladaPackage#getOpticsType_TechniqueCommon()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='technique_common' namespace='##targetNamespace'"
   * @generated
   */
	TechniqueCommonType2 getTechniqueCommon();

	/**
   * Sets the value of the '{@link org.khronos.collada.OpticsType#getTechniqueCommon <em>Technique Common</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Technique Common</em>' containment reference.
   * @see #getTechniqueCommon()
   * @generated
   */
	void setTechniqueCommon(TechniqueCommonType2 value);

	/**
   * Returns the value of the '<em><b>Technique</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TechniqueType4}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									This element may contain any number of non-common profile techniques.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Technique</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getOpticsType_Technique()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='technique' namespace='##targetNamespace'"
   * @generated
   */
	EList<TechniqueType4> getTechnique();

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ExtraType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The extra element may appear any number of times.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getOpticsType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

} // OpticsType
