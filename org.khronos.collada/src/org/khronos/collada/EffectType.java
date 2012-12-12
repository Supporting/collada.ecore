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
 * A representation of the model object '<em><b>Effect Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.EffectType#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.EffectType#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.EffectType#getImage <em>Image</em>}</li>
 *   <li>{@link org.khronos.collada.EffectType#getNewparam <em>Newparam</em>}</li>
 *   <li>{@link org.khronos.collada.EffectType#getFxProfileAbstractGroup <em>Fx Profile Abstract Group</em>}</li>
 *   <li>{@link org.khronos.collada.EffectType#getFxProfileAbstract <em>Fx Profile Abstract</em>}</li>
 *   <li>{@link org.khronos.collada.EffectType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.EffectType#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.EffectType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getEffectType()
 * @model extendedMetaData="name='effect_._type' kind='elementOnly'"
 * @generated
 */
public interface EffectType extends EObject {
	/**
   * Returns the value of the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The effect element may contain an asset element.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Asset</em>' containment reference.
   * @see #setAsset(AssetType)
   * @see org.khronos.collada.ColladaPackage#getEffectType_Asset()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
   * @generated
   */
	AssetType getAsset();

	/**
   * Sets the value of the '{@link org.khronos.collada.EffectType#getAsset <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asset</em>' containment reference.
   * @see #getAsset()
   * @generated
   */
	void setAsset(AssetType value);

	/**
   * Returns the value of the '<em><b>Annotate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxAnnotateCommon}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The annotate element allows you to specify an annotation on this effect.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Annotate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getEffectType_Annotate()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotate' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxAnnotateCommon> getAnnotate();

	/**
   * Returns the value of the '<em><b>Image</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ImageType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The image element allows you to create image resources which can be shared by multipe profiles.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Image</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getEffectType_Image()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace'"
   * @generated
   */
	EList<ImageType> getImage();

	/**
   * Returns the value of the '<em><b>Newparam</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxNewparamCommon}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The newparam element allows you to create new effect parameters which can be shared by multipe profiles.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Newparam</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getEffectType_Newparam()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='newparam' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxNewparamCommon> getNewparam();

	/**
   * Returns the value of the '<em><b>Fx Profile Abstract Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						This is the substituion group hook which allows you to swap in other COLLADA FX profiles.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Fx Profile Abstract Group</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getEffectType_FxProfileAbstractGroup()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true"
   *        extendedMetaData="kind='group' name='fx_profile_abstract:group' namespace='##targetNamespace'"
   * @generated
   */
	FeatureMap getFxProfileAbstractGroup();

	/**
   * Returns the value of the '<em><b>Fx Profile Abstract</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						This is the substituion group hook which allows you to swap in other COLLADA FX profiles.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Fx Profile Abstract</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getEffectType_FxProfileAbstract()
   * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fx_profile_abstract' namespace='##targetNamespace' group='fx_profile_abstract:group'"
   * @generated
   */
	EList<EObject> getFxProfileAbstract();

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
   * @see org.khronos.collada.ColladaPackage#getEffectType_Extra()
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
   * 					The id attribute is a text string containing the unique identifier of this element. 
   * 					This value must be unique within the instance document. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.khronos.collada.ColladaPackage#getEffectType_Id()
   * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.khronos.collada.EffectType#getId <em>Id</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getEffectType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.EffectType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // EffectType
