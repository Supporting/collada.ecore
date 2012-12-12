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
 * A representation of the model object '<em><b>Technique Common Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TechniqueCommonType#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType#getInterpenetrate <em>Interpenetrate</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType#getLimits <em>Limits</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType#getSpring <em>Spring</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType()
 * @model extendedMetaData="name='technique_common_._type' kind='elementOnly'"
 * @generated
 */
public interface TechniqueCommonType extends EObject {
	/**
   * Returns the value of the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									If false, the constraint doesn’t exert any force or influence on the rigid bodies.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Enabled</em>' containment reference.
   * @see #setEnabled(EnabledType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType_Enabled()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='enabled' namespace='##targetNamespace'"
   * @generated
   */
	EnabledType getEnabled();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType#getEnabled <em>Enabled</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' containment reference.
   * @see #getEnabled()
   * @generated
   */
	void setEnabled(EnabledType value);

	/**
   * Returns the value of the '<em><b>Interpenetrate</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									Indicates whether the attached rigid bodies may inter-penetrate.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Interpenetrate</em>' containment reference.
   * @see #setInterpenetrate(InterpenetrateType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType_Interpenetrate()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='interpenetrate' namespace='##targetNamespace'"
   * @generated
   */
	InterpenetrateType getInterpenetrate();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType#getInterpenetrate <em>Interpenetrate</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interpenetrate</em>' containment reference.
   * @see #getInterpenetrate()
   * @generated
   */
	void setInterpenetrate(InterpenetrateType value);

	/**
   * Returns the value of the '<em><b>Limits</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The limits element provides a flexible way to specify the constraint limits (degrees of freedom 
   * 									and ranges).
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Limits</em>' containment reference.
   * @see #setLimits(LimitsType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType_Limits()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='limits' namespace='##targetNamespace'"
   * @generated
   */
	LimitsType getLimits();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType#getLimits <em>Limits</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limits</em>' containment reference.
   * @see #getLimits()
   * @generated
   */
	void setLimits(LimitsType value);

	/**
   * Returns the value of the '<em><b>Spring</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									Spring, based on distance (“LINEAR”) or angle (“ANGULAR”). 
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Spring</em>' containment reference.
   * @see #setSpring(SpringType1)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType_Spring()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='spring' namespace='##targetNamespace'"
   * @generated
   */
	SpringType1 getSpring();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType#getSpring <em>Spring</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spring</em>' containment reference.
   * @see #getSpring()
   * @generated
   */
	void setSpring(SpringType1 value);

} // TechniqueCommonType
