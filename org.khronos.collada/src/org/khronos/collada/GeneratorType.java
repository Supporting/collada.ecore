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
 * A representation of the model object '<em><b>Generator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.GeneratorType#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.GeneratorType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.GeneratorType#getCode <em>Code</em>}</li>
 *   <li>{@link org.khronos.collada.GeneratorType#getInclude <em>Include</em>}</li>
 *   <li>{@link org.khronos.collada.GeneratorType#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.GeneratorType#getSetparam <em>Setparam</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getGeneratorType()
 * @model extendedMetaData="name='generator_._type' kind='elementOnly'"
 * @generated
 */
public interface GeneratorType extends EObject {
	/**
   * Returns the value of the '<em><b>Annotate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxAnnotateCommon}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 										The annotate element allows you to specify an annotation for this surface generator.
   * 										
   * <!-- end-model-doc -->
   * @return the value of the '<em>Annotate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGeneratorType_Annotate()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotate' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxAnnotateCommon> getAnnotate();

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
   * @see org.khronos.collada.ColladaPackage#getGeneratorType_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:1'"
   * @generated
   */
	FeatureMap getGroup();

	/**
   * Returns the value of the '<em><b>Code</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxCodeProfile}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 											The code element allows you to embed GLSL code to use for this surface generator.
   * 											
   * <!-- end-model-doc -->
   * @return the value of the '<em>Code</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGeneratorType_Code()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<FxCodeProfile> getCode();

	/**
   * Returns the value of the '<em><b>Include</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxIncludeCommon}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 											The include element allows you to import GLSL code to use for this surface generator.
   * 											
   * <!-- end-model-doc -->
   * @return the value of the '<em>Include</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGeneratorType_Include()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<FxIncludeCommon> getInclude();

	/**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 										The entry symbol for the shader function.
   * 										
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(NameType2)
   * @see org.khronos.collada.ColladaPackage#getGeneratorType_Name()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
   * @generated
   */
	NameType2 getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.GeneratorType#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
	void setName(NameType2 value);

	/**
   * Returns the value of the '<em><b>Setparam</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.GlslSetparamSimple}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 										The setparam element allows you to assign a new value to a previously defined parameter.
   * 										
   * <!-- end-model-doc -->
   * @return the value of the '<em>Setparam</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGeneratorType_Setparam()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='setparam' namespace='##targetNamespace'"
   * @generated
   */
	EList<GlslSetparamSimple> getSetparam();

} // GeneratorType
