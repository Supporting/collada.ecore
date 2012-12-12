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
 * A representation of the model object '<em><b>Compiler Target Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.CompilerTargetType1#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getCompilerTargetType1()
 * @model extendedMetaData="name='compiler_target_._1_._type' kind='simple'"
 * @generated
 */
public interface CompilerTargetType1 extends EObject {
	/**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.khronos.collada.ColladaPackage#getCompilerTargetType1_Value()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
   *        extendedMetaData="name=':0' kind='simple'"
   * @generated
   */
	String getValue();

	/**
   * Sets the value of the '{@link org.khronos.collada.CompilerTargetType1#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
	void setValue(String value);

} // CompilerTargetType1
