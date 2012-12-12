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
 * A representation of the model object '<em><b>Technique Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TechniqueType3#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType3#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType3#getCode <em>Code</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType3#getInclude <em>Include</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType3#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType3#getImage <em>Image</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType3#getNewparam <em>Newparam</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType3#getSetparam <em>Setparam</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType3#getPass <em>Pass</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType3#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType3#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType3#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTechniqueType3()
 * @model extendedMetaData="name='technique_._3_._type' kind='elementOnly'"
 * @generated
 */
public interface TechniqueType3 extends EObject {
	/**
   * Returns the value of the '<em><b>Annotate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxAnnotateCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Annotate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getTechniqueType3_Annotate()
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
   * @see org.khronos.collada.ColladaPackage#getTechniqueType3_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:1'"
   * @generated
   */
	FeatureMap getGroup();

	/**
   * Returns the value of the '<em><b>Code</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxCodeProfile}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getTechniqueType3_Code()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<FxCodeProfile> getCode();

	/**
   * Returns the value of the '<em><b>Include</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxIncludeCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Include</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getTechniqueType3_Include()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<FxIncludeCommon> getInclude();

	/**
   * Returns the value of the '<em><b>Group1</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Group1</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getTechniqueType3_Group1()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:4'"
   * @generated
   */
	FeatureMap getGroup1();

	/**
   * Returns the value of the '<em><b>Image</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ImageType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The image element declares the storage for the graphical representation of an object. 
   * 			The image element best describes raster image data, but can conceivably handle other 
   * 			forms of imagery. The image elements allows for specifying an external image file with 
   * 			the init_from element or embed image data with the data element.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Image</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getTechniqueType3_Image()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace' group='#group:4'"
   * @generated
   */
	EList<ImageType> getImage();

	/**
   * Returns the value of the '<em><b>Newparam</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.GlslNewparam}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newparam</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Newparam</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getTechniqueType3_Newparam()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='newparam' namespace='##targetNamespace' group='#group:4'"
   * @generated
   */
	EList<GlslNewparam> getNewparam();

	/**
   * Returns the value of the '<em><b>Setparam</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.GlslSetparam}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setparam</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Setparam</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getTechniqueType3_Setparam()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='setparam' namespace='##targetNamespace' group='#group:4'"
   * @generated
   */
	EList<GlslSetparam> getSetparam();

	/**
   * Returns the value of the '<em><b>Pass</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.PassType1}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									A static declaration of all the render states, shaders, and settings for one rendering pipeline.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Pass</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getTechniqueType3_Pass()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='pass' namespace='##targetNamespace'"
   * @generated
   */
	EList<PassType1> getPass();

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ExtraType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The extra element declares additional information regarding its parent element.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getTechniqueType3_Extra()
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
   * 								The id attribute is a text string containing the unique identifier of this element. 
   * 								This value must be unique within the instance document. Optional attribute.
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.khronos.collada.ColladaPackage#getTechniqueType3_Id()
   * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueType3#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
	void setId(String value);

	/**
   * Returns the value of the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 								The sid attribute is a text string value containing the sub-identifier of this element. 
   * 								This value must be unique within the scope of the parent element. Optional attribute.
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sid</em>' attribute.
   * @see #setSid(String)
   * @see org.khronos.collada.ColladaPackage#getTechniqueType3_Sid()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueType3#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

} // TechniqueType3
