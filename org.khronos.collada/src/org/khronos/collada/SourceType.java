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
 * A representation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.SourceType#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.SourceType#getIDREFArray <em>IDREF Array</em>}</li>
 *   <li>{@link org.khronos.collada.SourceType#getNameArray <em>Name Array</em>}</li>
 *   <li>{@link org.khronos.collada.SourceType#getBoolArray <em>Bool Array</em>}</li>
 *   <li>{@link org.khronos.collada.SourceType#getFloatArray <em>Float Array</em>}</li>
 *   <li>{@link org.khronos.collada.SourceType#getIntArray <em>Int Array</em>}</li>
 *   <li>{@link org.khronos.collada.SourceType#getTechniqueCommon <em>Technique Common</em>}</li>
 *   <li>{@link org.khronos.collada.SourceType#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.SourceType#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.SourceType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getSourceType()
 * @model extendedMetaData="name='source_._type' kind='elementOnly'"
 * @generated
 */
public interface SourceType extends EObject {
	/**
   * Returns the value of the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The source element may contain an asset element.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Asset</em>' containment reference.
   * @see #setAsset(AssetType)
   * @see org.khronos.collada.ColladaPackage#getSourceType_Asset()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
   * @generated
   */
	AssetType getAsset();

	/**
   * Sets the value of the '{@link org.khronos.collada.SourceType#getAsset <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asset</em>' containment reference.
   * @see #getAsset()
   * @generated
   */
	void setAsset(AssetType value);

	/**
   * Returns the value of the '<em><b>IDREF Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The source element may contain an IDREF_array.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>IDREF Array</em>' containment reference.
   * @see #setIDREFArray(IDREFArrayType)
   * @see org.khronos.collada.ColladaPackage#getSourceType_IDREFArray()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='IDREF_array' namespace='##targetNamespace'"
   * @generated
   */
	IDREFArrayType getIDREFArray();

	/**
   * Sets the value of the '{@link org.khronos.collada.SourceType#getIDREFArray <em>IDREF Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>IDREF Array</em>' containment reference.
   * @see #getIDREFArray()
   * @generated
   */
	void setIDREFArray(IDREFArrayType value);

	/**
   * Returns the value of the '<em><b>Name Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The source element may contain a Name_array.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name Array</em>' containment reference.
   * @see #setNameArray(NameArrayType)
   * @see org.khronos.collada.ColladaPackage#getSourceType_NameArray()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Name_array' namespace='##targetNamespace'"
   * @generated
   */
	NameArrayType getNameArray();

	/**
   * Sets the value of the '{@link org.khronos.collada.SourceType#getNameArray <em>Name Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Array</em>' containment reference.
   * @see #getNameArray()
   * @generated
   */
	void setNameArray(NameArrayType value);

	/**
   * Returns the value of the '<em><b>Bool Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The source element may contain a bool_array.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Bool Array</em>' containment reference.
   * @see #setBoolArray(BoolArrayType)
   * @see org.khronos.collada.ColladaPackage#getSourceType_BoolArray()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='bool_array' namespace='##targetNamespace'"
   * @generated
   */
	BoolArrayType getBoolArray();

	/**
   * Sets the value of the '{@link org.khronos.collada.SourceType#getBoolArray <em>Bool Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool Array</em>' containment reference.
   * @see #getBoolArray()
   * @generated
   */
	void setBoolArray(BoolArrayType value);

	/**
   * Returns the value of the '<em><b>Float Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The source element may contain a float_array.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Float Array</em>' containment reference.
   * @see #setFloatArray(FloatArrayType)
   * @see org.khronos.collada.ColladaPackage#getSourceType_FloatArray()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='float_array' namespace='##targetNamespace'"
   * @generated
   */
	FloatArrayType getFloatArray();

	/**
   * Sets the value of the '{@link org.khronos.collada.SourceType#getFloatArray <em>Float Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float Array</em>' containment reference.
   * @see #getFloatArray()
   * @generated
   */
	void setFloatArray(FloatArrayType value);

	/**
   * Returns the value of the '<em><b>Int Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The source element may contain an int_array.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Int Array</em>' containment reference.
   * @see #setIntArray(IntArrayType)
   * @see org.khronos.collada.ColladaPackage#getSourceType_IntArray()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='int_array' namespace='##targetNamespace'"
   * @generated
   */
	IntArrayType getIntArray();

	/**
   * Sets the value of the '{@link org.khronos.collada.SourceType#getIntArray <em>Int Array</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Array</em>' containment reference.
   * @see #getIntArray()
   * @generated
   */
	void setIntArray(IntArrayType value);

	/**
   * Returns the value of the '<em><b>Technique Common</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The technique common specifies the common method for accessing this source element's data.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Technique Common</em>' containment reference.
   * @see #setTechniqueCommon(TechniqueCommonType8)
   * @see org.khronos.collada.ColladaPackage#getSourceType_TechniqueCommon()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='technique_common' namespace='##targetNamespace'"
   * @generated
   */
	TechniqueCommonType8 getTechniqueCommon();

	/**
   * Sets the value of the '{@link org.khronos.collada.SourceType#getTechniqueCommon <em>Technique Common</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Technique Common</em>' containment reference.
   * @see #getTechniqueCommon()
   * @generated
   */
	void setTechniqueCommon(TechniqueCommonType8 value);

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
   * @see org.khronos.collada.ColladaPackage#getSourceType_Technique()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='technique' namespace='##targetNamespace'"
   * @generated
   */
	EList<TechniqueType4> getTechnique();

	/**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The id attribute is a text string containing the unique identifier of this element. 
   * 					This value must be unique within the instance document. Required attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.khronos.collada.ColladaPackage#getSourceType_Id()
   * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.khronos.collada.SourceType#getId <em>Id</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getSourceType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.SourceType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // SourceType
