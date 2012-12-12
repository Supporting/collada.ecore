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
 * A representation of the model object '<em><b>Technique Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TechniqueType2#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType2#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType2#getImage <em>Image</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType2#getNewparam <em>Newparam</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType2#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType2#getLambert <em>Lambert</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType2#getPhong <em>Phong</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType2#getBlinn <em>Blinn</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType2#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType2#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType2#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTechniqueType2()
 * @model extendedMetaData="name='technique_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface TechniqueType2 extends EObject {
	/**
   * Returns the value of the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The technique element may contain an asset element.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Asset</em>' containment reference.
   * @see #setAsset(AssetType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueType2_Asset()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
   * @generated
   */
	AssetType getAsset();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueType2#getAsset <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asset</em>' containment reference.
   * @see #getAsset()
   * @generated
   */
	void setAsset(AssetType value);

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
   * @see org.khronos.collada.ColladaPackage#getTechniqueType2_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:1'"
   * @generated
   */
	FeatureMap getGroup();

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
   * @see org.khronos.collada.ColladaPackage#getTechniqueType2_Image()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<ImageType> getImage();

	/**
   * Returns the value of the '<em><b>Newparam</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.CommonNewparamType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newparam</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Newparam</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getTechniqueType2_Newparam()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='newparam' namespace='##targetNamespace' group='#group:1'"
   * @generated
   */
	EList<CommonNewparamType> getNewparam();

	/**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference.
   * @see #setConstant(ConstantType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueType2_Constant()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='constant' namespace='##targetNamespace'"
   * @generated
   */
	ConstantType getConstant();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueType2#getConstant <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' containment reference.
   * @see #getConstant()
   * @generated
   */
	void setConstant(ConstantType value);

	/**
   * Returns the value of the '<em><b>Lambert</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lambert</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Lambert</em>' containment reference.
   * @see #setLambert(LambertType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueType2_Lambert()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='lambert' namespace='##targetNamespace'"
   * @generated
   */
	LambertType getLambert();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueType2#getLambert <em>Lambert</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lambert</em>' containment reference.
   * @see #getLambert()
   * @generated
   */
	void setLambert(LambertType value);

	/**
   * Returns the value of the '<em><b>Phong</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phong</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Phong</em>' containment reference.
   * @see #setPhong(PhongType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueType2_Phong()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='phong' namespace='##targetNamespace'"
   * @generated
   */
	PhongType getPhong();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueType2#getPhong <em>Phong</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Phong</em>' containment reference.
   * @see #getPhong()
   * @generated
   */
	void setPhong(PhongType value);

	/**
   * Returns the value of the '<em><b>Blinn</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blinn</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Blinn</em>' containment reference.
   * @see #setBlinn(BlinnType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueType2_Blinn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='blinn' namespace='##targetNamespace'"
   * @generated
   */
	BlinnType getBlinn();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueType2#getBlinn <em>Blinn</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Blinn</em>' containment reference.
   * @see #getBlinn()
   * @generated
   */
	void setBlinn(BlinnType value);

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
   * @see org.khronos.collada.ColladaPackage#getTechniqueType2_Extra()
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
   * @see org.khronos.collada.ColladaPackage#getTechniqueType2_Id()
   * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueType2#getId <em>Id</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getTechniqueType2_Sid()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueType2#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

} // TechniqueType2
