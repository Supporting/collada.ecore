/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contributor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.ContributorType#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.khronos.collada.ContributorType#getAuthoringTool <em>Authoring Tool</em>}</li>
 *   <li>{@link org.khronos.collada.ContributorType#getComments <em>Comments</em>}</li>
 *   <li>{@link org.khronos.collada.ContributorType#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.khronos.collada.ContributorType#getSourceData <em>Source Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getContributorType()
 * @model extendedMetaData="name='contributor_._type' kind='elementOnly'"
 * @generated
 */
public interface ContributorType extends EObject {
	/**
   * Returns the value of the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The author element contains a string with the author's name.
   * 									There may be only one author element.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Author</em>' attribute.
   * @see #setAuthor(String)
   * @see org.khronos.collada.ColladaPackage#getContributorType_Author()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
   * @generated
   */
	String getAuthor();

	/**
   * Sets the value of the '{@link org.khronos.collada.ContributorType#getAuthor <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author</em>' attribute.
   * @see #getAuthor()
   * @generated
   */
	void setAuthor(String value);

	/**
   * Returns the value of the '<em><b>Authoring Tool</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The authoring_tool element contains a string with the authoring tool's name.
   * 									There may be only one authoring_tool element.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Authoring Tool</em>' attribute.
   * @see #setAuthoringTool(String)
   * @see org.khronos.collada.ColladaPackage#getContributorType_AuthoringTool()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='authoring_tool' namespace='##targetNamespace'"
   * @generated
   */
	String getAuthoringTool();

	/**
   * Sets the value of the '{@link org.khronos.collada.ContributorType#getAuthoringTool <em>Authoring Tool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Authoring Tool</em>' attribute.
   * @see #getAuthoringTool()
   * @generated
   */
	void setAuthoringTool(String value);

	/**
   * Returns the value of the '<em><b>Comments</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The comments element contains a string with comments from this contributor.
   * 									There may be only one comments element.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Comments</em>' attribute.
   * @see #setComments(String)
   * @see org.khronos.collada.ColladaPackage#getContributorType_Comments()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='comments' namespace='##targetNamespace'"
   * @generated
   */
	String getComments();

	/**
   * Sets the value of the '{@link org.khronos.collada.ContributorType#getComments <em>Comments</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comments</em>' attribute.
   * @see #getComments()
   * @generated
   */
	void setComments(String value);

	/**
   * Returns the value of the '<em><b>Copyright</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The copyright element contains a string with copyright information.
   * 									There may be only one copyright element.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Copyright</em>' attribute.
   * @see #setCopyright(String)
   * @see org.khronos.collada.ColladaPackage#getContributorType_Copyright()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
   * @generated
   */
	String getCopyright();

	/**
   * Sets the value of the '{@link org.khronos.collada.ContributorType#getCopyright <em>Copyright</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Copyright</em>' attribute.
   * @see #getCopyright()
   * @generated
   */
	void setCopyright(String value);

	/**
   * Returns the value of the '<em><b>Source Data</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The source_data element contains a URI reference to the source data used for this asset.
   * 									There may be only one source_data element.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source Data</em>' attribute.
   * @see #setSourceData(String)
   * @see org.khronos.collada.ColladaPackage#getContributorType_SourceData()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
   *        extendedMetaData="kind='element' name='source_data' namespace='##targetNamespace'"
   * @generated
   */
	String getSourceData();

	/**
   * Sets the value of the '{@link org.khronos.collada.ContributorType#getSourceData <em>Source Data</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Data</em>' attribute.
   * @see #getSourceData()
   * @generated
   */
	void setSourceData(String value);

} // ContributorType
