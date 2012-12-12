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
 * A representation of the model object '<em><b>Instance Effect Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.InstanceEffectType#getTechniqueHint <em>Technique Hint</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceEffectType#getSetparam <em>Setparam</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceEffectType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceEffectType#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceEffectType#getSid <em>Sid</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceEffectType#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getInstanceEffectType()
 * @model extendedMetaData="name='instance_effect_._type' kind='elementOnly'"
 * @generated
 */
public interface InstanceEffectType extends EObject {
	/**
   * Returns the value of the '<em><b>Technique Hint</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TechniqueHintType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						Add a hint for a platform of which technique to use in this effect.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Technique Hint</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getInstanceEffectType_TechniqueHint()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='technique_hint' namespace='##targetNamespace'"
   * @generated
   */
	EList<TechniqueHintType> getTechniqueHint();

	/**
   * Returns the value of the '<em><b>Setparam</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SetparamType1}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						Assigns a new value to a previously defined parameter
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Setparam</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getInstanceEffectType_Setparam()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='setparam' namespace='##targetNamespace'"
   * @generated
   */
	EList<SetparamType1> getSetparam();

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
   * @see org.khronos.collada.ColladaPackage#getInstanceEffectType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

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
   * @see org.khronos.collada.ColladaPackage#getInstanceEffectType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstanceEffectType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The sid attribute is a text string value containing the sub-identifier of this element. This 
   * 					value must be unique within the scope of the parent element. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sid</em>' attribute.
   * @see #setSid(String)
   * @see org.khronos.collada.ColladaPackage#getInstanceEffectType_Sid()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstanceEffectType#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

	/**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The url attribute refers to resource.  This may refer to a local resource using a relative URL 
   * 					fragment identifier that begins with the “#” character. The url attribute may refer to an external 
   * 					resource using an absolute or relative URL.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see org.khronos.collada.ColladaPackage#getInstanceEffectType_Url()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
   *        extendedMetaData="kind='attribute' name='url'"
   * @generated
   */
	String getUrl();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstanceEffectType#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
	void setUrl(String value);

} // InstanceEffectType
