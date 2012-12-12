/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.AssetType#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.khronos.collada.AssetType#getCreated <em>Created</em>}</li>
 *   <li>{@link org.khronos.collada.AssetType#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.khronos.collada.AssetType#getModified <em>Modified</em>}</li>
 *   <li>{@link org.khronos.collada.AssetType#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.khronos.collada.AssetType#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.khronos.collada.AssetType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.khronos.collada.AssetType#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.khronos.collada.AssetType#getUpAxis <em>Up Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getAssetType()
 * @model extendedMetaData="name='asset_._type' kind='elementOnly'"
 * @generated
 */
public interface AssetType extends EObject {
	/**
   * Returns the value of the '<em><b>Contributor</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ContributorType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The contributor element defines authoring information for asset management
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Contributor</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getAssetType_Contributor()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='contributor' namespace='##targetNamespace'"
   * @generated
   */
	EList<ContributorType> getContributor();

	/**
   * Returns the value of the '<em><b>Created</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The created element contains the date and time that the parent element was created and is 
   * 						represented in an ISO 8601 format.  The created element may appear zero or one time.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Created</em>' attribute.
   * @see #setCreated(XMLGregorianCalendar)
   * @see org.khronos.collada.ColladaPackage#getAssetType_Created()
   * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
   *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
   * @generated
   */
	XMLGregorianCalendar getCreated();

	/**
   * Sets the value of the '{@link org.khronos.collada.AssetType#getCreated <em>Created</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Created</em>' attribute.
   * @see #getCreated()
   * @generated
   */
	void setCreated(XMLGregorianCalendar value);

	/**
   * Returns the value of the '<em><b>Keywords</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The keywords element contains a list of words used as search criteria for the parent element. 
   * 						The keywords element may appear zero or more times.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Keywords</em>' attribute.
   * @see #setKeywords(String)
   * @see org.khronos.collada.ColladaPackage#getAssetType_Keywords()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='keywords' namespace='##targetNamespace'"
   * @generated
   */
	String getKeywords();

	/**
   * Sets the value of the '{@link org.khronos.collada.AssetType#getKeywords <em>Keywords</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keywords</em>' attribute.
   * @see #getKeywords()
   * @generated
   */
	void setKeywords(String value);

	/**
   * Returns the value of the '<em><b>Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The modified element contains the date and time that the parent element was last modified and 
   * 						represented in an ISO 8601 format. The modified element may appear zero or one time.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Modified</em>' attribute.
   * @see #setModified(XMLGregorianCalendar)
   * @see org.khronos.collada.ColladaPackage#getAssetType_Modified()
   * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
   *        extendedMetaData="kind='element' name='modified' namespace='##targetNamespace'"
   * @generated
   */
	XMLGregorianCalendar getModified();

	/**
   * Sets the value of the '{@link org.khronos.collada.AssetType#getModified <em>Modified</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modified</em>' attribute.
   * @see #getModified()
   * @generated
   */
	void setModified(XMLGregorianCalendar value);

	/**
   * Returns the value of the '<em><b>Revision</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The revision element contains the revision information for the parent element. The revision 
   * 						element may appear zero or one time.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Revision</em>' attribute.
   * @see #setRevision(String)
   * @see org.khronos.collada.ColladaPackage#getAssetType_Revision()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='revision' namespace='##targetNamespace'"
   * @generated
   */
	String getRevision();

	/**
   * Sets the value of the '{@link org.khronos.collada.AssetType#getRevision <em>Revision</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Revision</em>' attribute.
   * @see #getRevision()
   * @generated
   */
	void setRevision(String value);

	/**
   * Returns the value of the '<em><b>Subject</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The subject element contains a description of the topical subject of the parent element. The 
   * 						subject element may appear zero or one time.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Subject</em>' attribute.
   * @see #setSubject(String)
   * @see org.khronos.collada.ColladaPackage#getAssetType_Subject()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
   * @generated
   */
	String getSubject();

	/**
   * Sets the value of the '{@link org.khronos.collada.AssetType#getSubject <em>Subject</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subject</em>' attribute.
   * @see #getSubject()
   * @generated
   */
	void setSubject(String value);

	/**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The title element contains the title information for the parent element. The title element may 
   * 						appear zero or one time.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.khronos.collada.ColladaPackage#getAssetType_Title()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
   * @generated
   */
	String getTitle();

	/**
   * Sets the value of the '{@link org.khronos.collada.AssetType#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
	void setTitle(String value);

	/**
   * Returns the value of the '<em><b>Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The unit element contains descriptive information about unit of measure. It has attributes for 
   * 						the name of the unit and the measurement with respect to the meter. The unit element may appear 
   * 						zero or one time.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Unit</em>' containment reference.
   * @see #setUnit(UnitType)
   * @see org.khronos.collada.ColladaPackage#getAssetType_Unit()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
   * @generated
   */
	UnitType getUnit();

	/**
   * Sets the value of the '{@link org.khronos.collada.AssetType#getUnit <em>Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' containment reference.
   * @see #getUnit()
   * @generated
   */
	void setUnit(UnitType value);

	/**
   * Returns the value of the '<em><b>Up Axis</b></em>' attribute.
   * The default value is <code>"Y_UP"</code>.
   * The literals are from the enumeration {@link org.khronos.collada.UpAxisType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The up_axis element contains descriptive information about coordinate system of the geometric 
   * 						data. All coordinates are right-handed by definition. This element specifies which axis is 
   * 						considered up. The default is the Y-axis. The up_axis element may appear zero or one time.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Up Axis</em>' attribute.
   * @see org.khronos.collada.UpAxisType
   * @see #isSetUpAxis()
   * @see #unsetUpAxis()
   * @see #setUpAxis(UpAxisType)
   * @see org.khronos.collada.ColladaPackage#getAssetType_UpAxis()
   * @model default="Y_UP" unsettable="true"
   *        extendedMetaData="kind='element' name='up_axis' namespace='##targetNamespace'"
   * @generated
   */
	UpAxisType getUpAxis();

	/**
   * Sets the value of the '{@link org.khronos.collada.AssetType#getUpAxis <em>Up Axis</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Up Axis</em>' attribute.
   * @see org.khronos.collada.UpAxisType
   * @see #isSetUpAxis()
   * @see #unsetUpAxis()
   * @see #getUpAxis()
   * @generated
   */
	void setUpAxis(UpAxisType value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.AssetType#getUpAxis <em>Up Axis</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetUpAxis()
   * @see #getUpAxis()
   * @see #setUpAxis(UpAxisType)
   * @generated
   */
	void unsetUpAxis();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.AssetType#getUpAxis <em>Up Axis</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Up Axis</em>' attribute is set.
   * @see #unsetUpAxis()
   * @see #getUpAxis()
   * @see #setUpAxis(UpAxisType)
   * @generated
   */
	boolean isSetUpAxis();

} // AssetType
