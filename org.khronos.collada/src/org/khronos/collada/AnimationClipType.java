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
 * A representation of the model object '<em><b>Animation Clip Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.AnimationClipType#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationClipType#getInstanceAnimation <em>Instance Animation</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationClipType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationClipType#getEnd <em>End</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationClipType#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationClipType#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.AnimationClipType#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getAnimationClipType()
 * @model extendedMetaData="name='animation_clip_._type' kind='elementOnly'"
 * @generated
 */
public interface AnimationClipType extends EObject {
	/**
   * Returns the value of the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The animation_clip element may contain an asset element.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Asset</em>' containment reference.
   * @see #setAsset(AssetType)
   * @see org.khronos.collada.ColladaPackage#getAnimationClipType_Asset()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
   * @generated
   */
	AssetType getAsset();

	/**
   * Sets the value of the '{@link org.khronos.collada.AnimationClipType#getAsset <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asset</em>' containment reference.
   * @see #getAsset()
   * @generated
   */
	void setAsset(AssetType value);

	/**
   * Returns the value of the '<em><b>Instance Animation</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.InstanceWithExtra}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The animation_clip must instance at least one animation element.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Animation</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getAnimationClipType_InstanceAnimation()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='instance_animation' namespace='##targetNamespace'"
   * @generated
   */
	EList<InstanceWithExtra> getInstanceAnimation();

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
   * @see org.khronos.collada.ColladaPackage#getAnimationClipType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The end attribute is the time in seconds of the end of the clip.  This is used in the 
   * 					same way as the start time.  If end is not specified, the value is taken to be the end 
   * 					time of the longest animation.  Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #isSetEnd()
   * @see #unsetEnd()
   * @see #setEnd(double)
   * @see org.khronos.collada.ColladaPackage#getAnimationClipType_End()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
   *        extendedMetaData="kind='attribute' name='end'"
   * @generated
   */
	double getEnd();

	/**
   * Sets the value of the '{@link org.khronos.collada.AnimationClipType#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #isSetEnd()
   * @see #unsetEnd()
   * @see #getEnd()
   * @generated
   */
	void setEnd(double value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.AnimationClipType#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetEnd()
   * @see #getEnd()
   * @see #setEnd(double)
   * @generated
   */
	void unsetEnd();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.AnimationClipType#getEnd <em>End</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>End</em>' attribute is set.
   * @see #unsetEnd()
   * @see #getEnd()
   * @see #setEnd(double)
   * @generated
   */
	boolean isSetEnd();

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
   * @see org.khronos.collada.ColladaPackage#getAnimationClipType_Id()
   * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.khronos.collada.AnimationClipType#getId <em>Id</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getAnimationClipType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.AnimationClipType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Start</b></em>' attribute.
   * The default value is <code>"0.0"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The start attribute is the time in seconds of the beginning of the clip.  This time is 
   * 					the same as that used in the key-frame data and is used to determine which set of 
   * 					key-frames will be included in the clip.  The start time does not specify when the clip 
   * 					will be played.  If the time falls between two keyframes of a referenced animation, an 
   * 					interpolated value should be used.  The default value is 0.0.  Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Start</em>' attribute.
   * @see #isSetStart()
   * @see #unsetStart()
   * @see #setStart(double)
   * @see org.khronos.collada.ColladaPackage#getAnimationClipType_Start()
   * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
   *        extendedMetaData="kind='attribute' name='start'"
   * @generated
   */
	double getStart();

	/**
   * Sets the value of the '{@link org.khronos.collada.AnimationClipType#getStart <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' attribute.
   * @see #isSetStart()
   * @see #unsetStart()
   * @see #getStart()
   * @generated
   */
	void setStart(double value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.AnimationClipType#getStart <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetStart()
   * @see #getStart()
   * @see #setStart(double)
   * @generated
   */
	void unsetStart();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.AnimationClipType#getStart <em>Start</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Start</em>' attribute is set.
   * @see #unsetStart()
   * @see #getStart()
   * @see #setStart(double)
   * @generated
   */
	boolean isSetStart();

} // AnimationClipType
