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
 * A representation of the model object '<em><b>Ph Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.PhType#getP <em>P</em>}</li>
 *   <li>{@link org.khronos.collada.PhType#getH <em>H</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getPhType()
 * @model extendedMetaData="name='ph_._type' kind='elementOnly'"
 * @generated
 */
public interface PhType extends EObject {
	/**
   * Returns the value of the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 										Theere may only be one p element.
   * 										
   * <!-- end-model-doc -->
   * @return the value of the '<em>P</em>' attribute.
   * @see #setP(List)
   * @see org.khronos.collada.ColladaPackage#getPhType_P()
   * @model dataType="org.khronos.collada.ListOfUInts" required="true" many="false"
   *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace'"
   * @generated
   */
	List<BigInteger> getP();

	/**
   * Sets the value of the '{@link org.khronos.collada.PhType#getP <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' attribute.
   * @see #getP()
   * @generated
   */
	void setP(List<BigInteger> value);

	/**
   * Returns the value of the '<em><b>H</b></em>' attribute list.
   * The list contents are of type {@link java.util.List}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 										The h element represents a hole in the polygon specified. There must be at least one h element.
   * 										
   * <!-- end-model-doc -->
   * @return the value of the '<em>H</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getPhType_H()
   * @model unique="false" dataType="org.khronos.collada.ListOfUInts" required="true"
   *        extendedMetaData="kind='element' name='h' namespace='##targetNamespace'"
   * @generated
   */
	EList<List> getH();

} // PhType
