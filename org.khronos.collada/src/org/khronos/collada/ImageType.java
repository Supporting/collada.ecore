/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.ImageType#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.ImageType#getData <em>Data</em>}</li>
 *   <li>{@link org.khronos.collada.ImageType#getInitFrom <em>Init From</em>}</li>
 *   <li>{@link org.khronos.collada.ImageType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.ImageType#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.khronos.collada.ImageType#getFormat <em>Format</em>}</li>
 *   <li>{@link org.khronos.collada.ImageType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.khronos.collada.ImageType#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.ImageType#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.ImageType#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getImageType()
 * @model extendedMetaData="name='image_._type' kind='elementOnly'"
 * @generated
 */
public interface ImageType extends EObject {
	/**
   * Returns the value of the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The image element may contain an asset element.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Asset</em>' containment reference.
   * @see #setAsset(AssetType)
   * @see org.khronos.collada.ColladaPackage#getImageType_Asset()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
   * @generated
   */
	AssetType getAsset();

	/**
   * Sets the value of the '{@link org.khronos.collada.ImageType#getAsset <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asset</em>' containment reference.
   * @see #getAsset()
   * @generated
   */
	void setAsset(AssetType value);

	/**
   * Returns the value of the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The data child element contains a sequence of hexadecimal encoded  binary octets representing 
   * 							the embedded image data.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Data</em>' attribute.
   * @see #setData(List)
   * @see org.khronos.collada.ColladaPackage#getImageType_Data()
   * @model dataType="org.khronos.collada.ListOfHexBinary" many="false"
   *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
   * @generated
   */
	List<byte[]> getData();

	/**
   * Sets the value of the '{@link org.khronos.collada.ImageType#getData <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' attribute.
   * @see #getData()
   * @generated
   */
	void setData(List<byte[]> value);

	/**
   * Returns the value of the '<em><b>Init From</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							The init_from element allows you to specify an external image file to use for the image element.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Init From</em>' attribute.
   * @see #setInitFrom(String)
   * @see org.khronos.collada.ColladaPackage#getImageType_InitFrom()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
   *        extendedMetaData="kind='element' name='init_from' namespace='##targetNamespace'"
   * @generated
   */
	String getInitFrom();

	/**
   * Sets the value of the '{@link org.khronos.collada.ImageType#getInitFrom <em>Init From</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init From</em>' attribute.
   * @see #getInitFrom()
   * @generated
   */
	void setInitFrom(String value);

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
   * @see org.khronos.collada.ColladaPackage#getImageType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Depth</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The depth attribute is an integer value that indicates the depth of the image in pixel units. 
   * 					A 2-D image has a depth of 1, which is also the default value. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Depth</em>' attribute.
   * @see #isSetDepth()
   * @see #unsetDepth()
   * @see #setDepth(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getImageType_Depth()
   * @model default="1" unsettable="true" dataType="org.khronos.collada.Uint"
   *        extendedMetaData="kind='attribute' name='depth'"
   * @generated
   */
	BigInteger getDepth();

	/**
   * Sets the value of the '{@link org.khronos.collada.ImageType#getDepth <em>Depth</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Depth</em>' attribute.
   * @see #isSetDepth()
   * @see #unsetDepth()
   * @see #getDepth()
   * @generated
   */
	void setDepth(BigInteger value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.ImageType#getDepth <em>Depth</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetDepth()
   * @see #getDepth()
   * @see #setDepth(BigInteger)
   * @generated
   */
	void unsetDepth();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.ImageType#getDepth <em>Depth</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Depth</em>' attribute is set.
   * @see #unsetDepth()
   * @see #getDepth()
   * @see #setDepth(BigInteger)
   * @generated
   */
	boolean isSetDepth();

	/**
   * Returns the value of the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The format attribute is a text string value that indicates the image format. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Format</em>' attribute.
   * @see #setFormat(String)
   * @see org.khronos.collada.ColladaPackage#getImageType_Format()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='format'"
   * @generated
   */
	String getFormat();

	/**
   * Sets the value of the '{@link org.khronos.collada.ImageType#getFormat <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' attribute.
   * @see #getFormat()
   * @generated
   */
	void setFormat(String value);

	/**
   * Returns the value of the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The height attribute is an integer value that indicates the height of the image in pixel 
   * 					units. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Height</em>' attribute.
   * @see #setHeight(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getImageType_Height()
   * @model dataType="org.khronos.collada.Uint"
   *        extendedMetaData="kind='attribute' name='height'"
   * @generated
   */
	BigInteger getHeight();

	/**
   * Sets the value of the '{@link org.khronos.collada.ImageType#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' attribute.
   * @see #getHeight()
   * @generated
   */
	void setHeight(BigInteger value);

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
   * @see org.khronos.collada.ColladaPackage#getImageType_Id()
   * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.khronos.collada.ImageType#getId <em>Id</em>}' attribute.
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
   * @see org.khronos.collada.ColladaPackage#getImageType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.ImageType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The width attribute is an integer value that indicates the width of the image in pixel units. 
   * 					Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Width</em>' attribute.
   * @see #setWidth(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getImageType_Width()
   * @model dataType="org.khronos.collada.Uint"
   *        extendedMetaData="kind='attribute' name='width'"
   * @generated
   */
	BigInteger getWidth();

	/**
   * Sets the value of the '{@link org.khronos.collada.ImageType#getWidth <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' attribute.
   * @see #getWidth()
   * @generated
   */
	void setWidth(BigInteger value);

} // ImageType
