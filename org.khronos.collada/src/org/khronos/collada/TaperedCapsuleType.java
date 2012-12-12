/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tapered Capsule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TaperedCapsuleType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.khronos.collada.TaperedCapsuleType#getRadius1 <em>Radius1</em>}</li>
 *   <li>{@link org.khronos.collada.TaperedCapsuleType#getRadius2 <em>Radius2</em>}</li>
 *   <li>{@link org.khronos.collada.TaperedCapsuleType#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTaperedCapsuleType()
 * @model extendedMetaData="name='tapered_capsule_._type' kind='elementOnly'"
 * @generated
 */
public interface TaperedCapsuleType extends EObject {
	/**
   * Returns the value of the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						A float value that represents the length of the line segment connecting the centers of the 
   * 						capping hemispheres.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Height</em>' attribute.
   * @see #isSetHeight()
   * @see #unsetHeight()
   * @see #setHeight(double)
   * @see org.khronos.collada.ColladaPackage#getTaperedCapsuleType_Height()
   * @model unsettable="true" dataType="org.khronos.collada.Float" required="true"
   *        extendedMetaData="kind='element' name='height' namespace='##targetNamespace'"
   * @generated
   */
	double getHeight();

	/**
   * Sets the value of the '{@link org.khronos.collada.TaperedCapsuleType#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' attribute.
   * @see #isSetHeight()
   * @see #unsetHeight()
   * @see #getHeight()
   * @generated
   */
	void setHeight(double value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.TaperedCapsuleType#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetHeight()
   * @see #getHeight()
   * @see #setHeight(double)
   * @generated
   */
	void unsetHeight();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.TaperedCapsuleType#getHeight <em>Height</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Height</em>' attribute is set.
   * @see #unsetHeight()
   * @see #getHeight()
   * @see #setHeight(double)
   * @generated
   */
	boolean isSetHeight();

	/**
   * Returns the value of the '<em><b>Radius1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						Two float values that represent the radii of the tapered capsule at the positive (height/2) 
   * 						Y value.Both ends of the tapered capsule may be elliptical.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Radius1</em>' attribute.
   * @see #setRadius1(List)
   * @see org.khronos.collada.ColladaPackage#getTaperedCapsuleType_Radius1()
   * @model dataType="org.khronos.collada.Float2" required="true" many="false"
   *        extendedMetaData="kind='element' name='radius1' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getRadius1();

	/**
   * Sets the value of the '{@link org.khronos.collada.TaperedCapsuleType#getRadius1 <em>Radius1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Radius1</em>' attribute.
   * @see #getRadius1()
   * @generated
   */
	void setRadius1(List<Double> value);

	/**
   * Returns the value of the '<em><b>Radius2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						Two float values that represent the radii of the tapered capsule at the negative (height/2) 
   * 						Y value.Both ends of the tapered capsule may be elliptical.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Radius2</em>' attribute.
   * @see #setRadius2(List)
   * @see org.khronos.collada.ColladaPackage#getTaperedCapsuleType_Radius2()
   * @model dataType="org.khronos.collada.Float2" required="true" many="false"
   *        extendedMetaData="kind='element' name='radius2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getRadius2();

	/**
   * Sets the value of the '{@link org.khronos.collada.TaperedCapsuleType#getRadius2 <em>Radius2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Radius2</em>' attribute.
   * @see #getRadius2()
   * @generated
   */
	void setRadius2(List<Double> value);

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ExtraType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The extra element may appear any number of times.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getTaperedCapsuleType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

} // TaperedCapsuleType
