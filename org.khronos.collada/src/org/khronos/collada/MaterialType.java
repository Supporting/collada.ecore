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
 * A representation of the model object '<em><b>Material Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.MaterialType#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.MaterialType#getInstanceEffect <em>Instance Effect</em>}</li>
 *   <li>{@link org.khronos.collada.MaterialType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.MaterialType#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.MaterialType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getMaterialType()
 * @model extendedMetaData="name='material_._type' kind='elementOnly'"
 * @generated
 */
public interface MaterialType extends EObject {
	/**
   * Returns the value of the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The material element may contain an asset element.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Asset</em>' containment reference.
   * @see #setAsset(AssetType)
   * @see org.khronos.collada.ColladaPackage#getMaterialType_Asset()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
   * @generated
   */
	AssetType getAsset();

	/**
   * Sets the value of the '{@link org.khronos.collada.MaterialType#getAsset <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asset</em>' containment reference.
   * @see #getAsset()
   * @generated
   */
	void setAsset(AssetType value);

	/**
   * Returns the value of the '<em><b>Instance Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The material must instance an effect.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Effect</em>' containment reference.
   * @see #setInstanceEffect(InstanceEffectType)
   * @see org.khronos.collada.ColladaPackage#getMaterialType_InstanceEffect()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='instance_effect' namespace='##targetNamespace'"
   * @generated
   */
	InstanceEffectType getInstanceEffect();

	/**
   * Sets the value of the '{@link org.khronos.collada.MaterialType#getInstanceEffect <em>Instance Effect</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Effect</em>' containment reference.
   * @see #getInstanceEffect()
   * @generated
   */
	void setInstanceEffect(InstanceEffectType value);

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
   * @see org.khronos.collada.ColladaPackage#getMaterialType_Extra()
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
   * 					The id attribute is a text string containing the unique identifier of this element. This value 
   * 					must be unique within the instance document. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.khronos.collada.ColladaPackage#getMaterialType_Id()
   * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.khronos.collada.MaterialType#getId <em>Id</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getMaterialType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.MaterialType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // MaterialType
