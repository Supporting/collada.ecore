/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technique Type4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TechniqueType4#getAny <em>Any</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueType4#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTechniqueType4()
 * @model extendedMetaData="name='technique_._4_._type' kind='elementOnly'"
 * @generated
 */
public interface TechniqueType4 extends EObject {
	/**
   * Returns the value of the '<em><b>Any</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Any</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getTechniqueType4_Any()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':0' processing='lax'"
   * @generated
   */
	FeatureMap getAny();

	/**
   * Returns the value of the '<em><b>Profile</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The profile attribute indicates the type of profile. This is a vendor defined character 
   * 					string that indicates the platform or capability target for the technique. Required attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Profile</em>' attribute.
   * @see #setProfile(String)
   * @see org.khronos.collada.ColladaPackage#getTechniqueType4_Profile()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
   *        extendedMetaData="kind='attribute' name='profile'"
   * @generated
   */
	String getProfile();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueType4#getProfile <em>Profile</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profile</em>' attribute.
   * @see #getProfile()
   * @generated
   */
	void setProfile(String value);

} // TechniqueType4
