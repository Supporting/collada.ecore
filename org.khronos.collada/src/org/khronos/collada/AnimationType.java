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
 * A representation of the model object '<em><b>Animation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.AnimationType#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationType#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationType#getSampler <em>Sampler</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationType#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationType#getAnimation <em>Animation</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationType#getAnimation1 <em>Animation1</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationType#getSampler1 <em>Sampler1</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationType#getChannel1 <em>Channel1</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationType#getAnimation2 <em>Animation2</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationType#getAnimation3 <em>Animation3</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationType#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getAnimationType()
 * @model extendedMetaData="name='animation_._type' kind='elementOnly'"
 * @generated
 */
public interface AnimationType extends EObject {
	/**
   * Returns the value of the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The animation element may contain an asset element.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Asset</em>' containment reference.
   * @see #setAsset(AssetType)
   * @see org.khronos.collada.ColladaPackage#getAnimationType_Asset()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
   * @generated
   */
	AssetType getAsset();

	/**
   * Sets the value of the '{@link org.khronos.collada.AnimationType#getAsset <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asset</em>' containment reference.
   * @see #getAsset()
   * @generated
   */
	void setAsset(AssetType value);

	/**
   * Returns the value of the '<em><b>Source</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SourceType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 								The animation element may contain any number of source elements.
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getAnimationType_Source()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
   * @generated
   */
	EList<SourceType> getSource();

	/**
   * Returns the value of the '<em><b>Sampler</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SamplerType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 										The animation element may contain any number of sampler elements.
   * 										
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sampler</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getAnimationType_Sampler()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sampler' namespace='##targetNamespace'"
   * @generated
   */
	EList<SamplerType> getSampler();

	/**
   * Returns the value of the '<em><b>Channel</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ChannelType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 										The animation element may contain any number of channel elements.
   * 										
   * <!-- end-model-doc -->
   * @return the value of the '<em>Channel</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getAnimationType_Channel()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='channel' namespace='##targetNamespace'"
   * @generated
   */
	EList<ChannelType> getChannel();

	/**
   * Returns the value of the '<em><b>Animation</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.AnimationType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 										The animation may be hierarchical and may contain any number of other animation elements.
   * 										
   * <!-- end-model-doc -->
   * @return the value of the '<em>Animation</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getAnimationType_Animation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='animation' namespace='##targetNamespace'"
   * @generated
   */
	EList<AnimationType> getAnimation();

	/**
   * Returns the value of the '<em><b>Animation1</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.AnimationType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The animation element categorizes the declaration of animation information. The animation 
   * 			hierarchy contains elements that describe the animation’s key-frame data and sampler functions, 
   * 			ordered in such a way to group together animations that should be executed together.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Animation1</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getAnimationType_Animation1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='animation' namespace='##targetNamespace'"
   * @generated
   */
	EList<AnimationType> getAnimation1();

	/**
   * Returns the value of the '<em><b>Sampler1</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SamplerType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The sampler element declares an N-dimensional function used for animation. Animation function curves 
   * 			are represented by 1-D sampler elements in COLLADA. The sampler defines sampling points and how to 
   * 			interpolate between them.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sampler1</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getAnimationType_Sampler1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sampler' namespace='##targetNamespace'"
   * @generated
   */
	EList<SamplerType> getSampler1();

	/**
   * Returns the value of the '<em><b>Channel1</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ChannelType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The channel element declares an output channel of an animation.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Channel1</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getAnimationType_Channel1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='channel' namespace='##targetNamespace'"
   * @generated
   */
	EList<ChannelType> getChannel1();

	/**
   * Returns the value of the '<em><b>Animation2</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.AnimationType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The animation element categorizes the declaration of animation information. The animation 
   * 			hierarchy contains elements that describe the animation’s key-frame data and sampler functions, 
   * 			ordered in such a way to group together animations that should be executed together.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Animation2</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getAnimationType_Animation2()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='animation' namespace='##targetNamespace'"
   * @generated
   */
	EList<AnimationType> getAnimation2();

	/**
   * Returns the value of the '<em><b>Animation3</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.AnimationType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The animation element categorizes the declaration of animation information. The animation 
   * 			hierarchy contains elements that describe the animation’s key-frame data and sampler functions, 
   * 			ordered in such a way to group together animations that should be executed together.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Animation3</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getAnimationType_Animation3()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='animation' namespace='##targetNamespace'"
   * @generated
   */
	EList<AnimationType> getAnimation3();

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
   * @see org.khronos.collada.ColladaPackage#getAnimationType_Extra()
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
   * @see org.khronos.collada.ColladaPackage#getAnimationType_Id()
   * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.khronos.collada.AnimationType#getId <em>Id</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getAnimationType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.AnimationType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // AnimationType
