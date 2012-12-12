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
 * A representation of the model object '<em><b>Cg Connect Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			Creates a symbolic connection between two previously defined parameters.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.CgConnectParam#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getCgConnectParam()
 * @model extendedMetaData="name='cg_connect_param' kind='empty'"
 * @generated
 */
public interface CgConnectParam extends EObject {
	/**
   * Returns the value of the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' attribute.
   * @see #setRef(String)
   * @see org.khronos.collada.ColladaPackage#getCgConnectParam_Ref()
   * @model dataType="org.khronos.collada.CgIdentifier" required="true"
   *        extendedMetaData="kind='attribute' name='ref'"
   * @generated
   */
	String getRef();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgConnectParam#getRef <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' attribute.
   * @see #getRef()
   * @generated
   */
	void setRef(String value);

} // CgConnectParam
