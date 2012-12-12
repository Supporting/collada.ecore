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
 * A representation of the model object '<em><b>Gles Texture Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			Defines a set of texturing commands that will be converted into multitexturing operations using glTexEnv in regular and combiner mode.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.GlesTexturePipeline#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTexturePipeline#getTexcombiner <em>Texcombiner</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTexturePipeline#getTexenv <em>Texenv</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTexturePipeline#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.GlesTexturePipeline#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getGlesTexturePipeline()
 * @model extendedMetaData="name='gles_texture_pipeline' kind='elementOnly'"
 * @generated
 */
public interface GlesTexturePipeline extends EObject {
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
   * @see org.khronos.collada.ColladaPackage#getGlesTexturePipeline_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:0'"
   * @generated
   */
	FeatureMap getGroup();

	/**
   * Returns the value of the '<em><b>Texcombiner</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.GlesTexcombinerCommandType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					Defines a texture_pipeline command. This is a combiner-mode texturing operation.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Texcombiner</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGlesTexturePipeline_Texcombiner()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='texcombiner' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<GlesTexcombinerCommandType> getTexcombiner();

	/**
   * Returns the value of the '<em><b>Texenv</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.GlesTexenvCommandType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					Defines a texture_pipeline command. It is a simple noncombiner mode of texturing operations.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Texenv</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGlesTexturePipeline_Texenv()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='texenv' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<GlesTexenvCommandType> getTexenv();

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ExtraType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The extra element may appear any number of times.
   * 					OpenGL ES extensions may be used here.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getGlesTexturePipeline_Extra()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 				The sid attribute is a text string value containing the sub-identifier of this element. 
   * 				This value must be unique within the scope of the parent element. Optional attribute.
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sid</em>' attribute.
   * @see #setSid(String)
   * @see org.khronos.collada.ColladaPackage#getGlesTexturePipeline_Sid()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlesTexturePipeline#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

} // GlesTexturePipeline
