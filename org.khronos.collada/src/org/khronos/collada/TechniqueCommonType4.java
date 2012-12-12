/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technique Common Type4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TechniqueCommonType4#getDynamicFriction <em>Dynamic Friction</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType4#getRestitution <em>Restitution</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType4#getStaticFriction <em>Static Friction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType4()
 * @model extendedMetaData="name='technique_common_._4_._type' kind='elementOnly'"
 * @generated
 */
public interface TechniqueCommonType4 extends EObject {
	/**
   * Returns the value of the '<em><b>Dynamic Friction</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									Dynamic friction coefficient
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Dynamic Friction</em>' containment reference.
   * @see #setDynamicFriction(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType4_DynamicFriction()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='dynamic_friction' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getDynamicFriction();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType4#getDynamicFriction <em>Dynamic Friction</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dynamic Friction</em>' containment reference.
   * @see #getDynamicFriction()
   * @generated
   */
	void setDynamicFriction(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Restitution</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The proportion of the kinetic energy preserved in the impact (typically ranges from 0.0 to 1.0)
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Restitution</em>' containment reference.
   * @see #setRestitution(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType4_Restitution()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='restitution' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getRestitution();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType4#getRestitution <em>Restitution</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Restitution</em>' containment reference.
   * @see #getRestitution()
   * @generated
   */
	void setRestitution(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Static Friction</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									Static friction coefficient
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Static Friction</em>' containment reference.
   * @see #setStaticFriction(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType4_StaticFriction()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='static_friction' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getStaticFriction();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType4#getStaticFriction <em>Static Friction</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static Friction</em>' containment reference.
   * @see #getStaticFriction()
   * @generated
   */
	void setStaticFriction(TargetableFloat value);

} // TechniqueCommonType4
