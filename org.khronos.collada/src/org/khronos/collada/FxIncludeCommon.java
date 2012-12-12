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
 * A representation of the model object '<em><b>Fx Include Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			The include element is used to import source code or precompiled binary shaders into the FX Runtime by referencing an external resource.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.FxIncludeCommon#getSid <em>Sid</em>}</li>
 *   <li>{@link org.khronos.collada.FxIncludeCommon#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getFxIncludeCommon()
 * @model extendedMetaData="name='fx_include_common' kind='empty'"
 * @generated
 */
public interface FxIncludeCommon extends EObject {
	/**
   * Returns the value of the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The sid attribute is a text string value containing the sub-identifier of this element. 
   * 					This value must be unique within the scope of the parent element. Optional attribute.
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sid</em>' attribute.
   * @see #setSid(String)
   * @see org.khronos.collada.ColladaPackage#getFxIncludeCommon_Sid()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxIncludeCommon#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

	/**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The url attribute refers to resource.  This may refer to a local resource using a relative URL 
   * 					fragment identifier that begins with the “#” character. The url attribute may refer to an external 
   * 					resource using an absolute or relative URL.
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see org.khronos.collada.ColladaPackage#getFxIncludeCommon_Url()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
   *        extendedMetaData="kind='attribute' name='url'"
   * @generated
   */
	String getUrl();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxIncludeCommon#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
	void setUrl(String value);

} // FxIncludeCommon
