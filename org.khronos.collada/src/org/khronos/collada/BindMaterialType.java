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
 * A representation of the model object '<em><b>Bind Material Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.BindMaterialType#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.BindMaterialType#getTechniqueCommon <em>Technique Common</em>}</li>
 *   <li>{@link org.khronos.collada.BindMaterialType#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.BindMaterialType#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getBindMaterialType()
 * @model extendedMetaData="name='bind_material_._type' kind='elementOnly'"
 * @generated
 */
public interface BindMaterialType extends EObject {
	/**
   * Returns the value of the '<em><b>Param</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ParamType4}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The bind_material element may contain any number of param elements.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Param</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getBindMaterialType_Param()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
   * @generated
   */
	EList<ParamType4> getParam();

	/**
   * Returns the value of the '<em><b>Technique Common</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The technique_common element specifies the bind_material information for the common 
   * 						profile which all COLLADA implementations need to support.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Technique Common</em>' containment reference.
   * @see #setTechniqueCommon(TechniqueCommonType5)
   * @see org.khronos.collada.ColladaPackage#getBindMaterialType_TechniqueCommon()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='technique_common' namespace='##targetNamespace'"
   * @generated
   */
	TechniqueCommonType5 getTechniqueCommon();

	/**
   * Sets the value of the '{@link org.khronos.collada.BindMaterialType#getTechniqueCommon <em>Technique Common</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Technique Common</em>' containment reference.
   * @see #getTechniqueCommon()
   * @generated
   */
	void setTechniqueCommon(TechniqueCommonType5 value);

	/**
   * Returns the value of the '<em><b>Technique</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TechniqueType4}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						This element may contain any number of non-common profile techniques.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Technique</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getBindMaterialType_Technique()
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
   * 						The extra element may appear any number of times.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getBindMaterialType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

} // BindMaterialType
