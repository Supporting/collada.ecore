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
 * A representation of the model object '<em><b>Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.UnitType#getMeter <em>Meter</em>}</li>
 *   <li>{@link org.khronos.collada.UnitType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getUnitType()
 * @model extendedMetaData="name='unit_._type' kind='empty'"
 * @generated
 */
public interface UnitType extends EObject {
	/**
   * Returns the value of the '<em><b>Meter</b></em>' attribute.
   * The default value is <code>"1.0"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 								The meter attribute specifies the measurement with respect to the meter. The default 
   * 								value for the meter attribute is “1.0”.
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Meter</em>' attribute.
   * @see #isSetMeter()
   * @see #unsetMeter()
   * @see #setMeter(double)
   * @see org.khronos.collada.ColladaPackage#getUnitType_Meter()
   * @model default="1.0" unsettable="true" dataType="org.khronos.collada.Float"
   *        extendedMetaData="kind='attribute' name='meter'"
   * @generated
   */
	double getMeter();

	/**
   * Sets the value of the '{@link org.khronos.collada.UnitType#getMeter <em>Meter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meter</em>' attribute.
   * @see #isSetMeter()
   * @see #unsetMeter()
   * @see #getMeter()
   * @generated
   */
	void setMeter(double value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.UnitType#getMeter <em>Meter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMeter()
   * @see #getMeter()
   * @see #setMeter(double)
   * @generated
   */
	void unsetMeter();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.UnitType#getMeter <em>Meter</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Meter</em>' attribute is set.
   * @see #unsetMeter()
   * @see #getMeter()
   * @see #setMeter(double)
   * @generated
   */
	boolean isSetMeter();

	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>"meter"</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 								The name attribute specifies the name of the unit. The default value for the name 
   * 								attribute is “meter”.
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #isSetName()
   * @see #unsetName()
   * @see #setName(String)
   * @see org.khronos.collada.ColladaPackage#getUnitType_Name()
   * @model default="meter" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.UnitType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #isSetName()
   * @see #unsetName()
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.UnitType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetName()
   * @see #getName()
   * @see #setName(String)
   * @generated
   */
	void unsetName();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.UnitType#getName <em>Name</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Name</em>' attribute is set.
   * @see #unsetName()
   * @see #getName()
   * @see #setName(String)
   * @generated
   */
	boolean isSetName();

} // UnitType
