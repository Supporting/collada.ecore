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
 * A representation of the model object '<em><b>Cylinder Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.CylinderType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.khronos.collada.CylinderType#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.khronos.collada.CylinderType#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getCylinderType()
 * @model extendedMetaData="name='cylinder_._type' kind='elementOnly'"
 * @generated
 */
public interface CylinderType extends EObject {
	/**
   * Returns the value of the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						A float value that represents the length of the cylinder along the Y axis.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Height</em>' attribute.
   * @see #isSetHeight()
   * @see #unsetHeight()
   * @see #setHeight(double)
   * @see org.khronos.collada.ColladaPackage#getCylinderType_Height()
   * @model unsettable="true" dataType="org.khronos.collada.Float" required="true"
   *        extendedMetaData="kind='element' name='height' namespace='##targetNamespace'"
   * @generated
   */
	double getHeight();

	/**
   * Sets the value of the '{@link org.khronos.collada.CylinderType#getHeight <em>Height</em>}' attribute.
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
   * Unsets the value of the '{@link org.khronos.collada.CylinderType#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetHeight()
   * @see #getHeight()
   * @see #setHeight(double)
   * @generated
   */
	void unsetHeight();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.CylinderType#getHeight <em>Height</em>}' attribute is set.
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
   * Returns the value of the '<em><b>Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						float2 values that represent the radii of the cylinder.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Radius</em>' attribute.
   * @see #setRadius(List)
   * @see org.khronos.collada.ColladaPackage#getCylinderType_Radius()
   * @model dataType="org.khronos.collada.Float2" required="true" many="false"
   *        extendedMetaData="kind='element' name='radius' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getRadius();

	/**
   * Sets the value of the '{@link org.khronos.collada.CylinderType#getRadius <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Radius</em>' attribute.
   * @see #getRadius()
   * @generated
   */
	void setRadius(List<Double> value);

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
   * @see org.khronos.collada.ColladaPackage#getCylinderType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

} // CylinderType
