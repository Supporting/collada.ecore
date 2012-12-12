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
 * A representation of the model object '<em><b>Technique Common Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TechniqueCommonType2#getOrthographic <em>Orthographic</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType2#getPerspective <em>Perspective</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType2()
 * @model extendedMetaData="name='technique_common_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface TechniqueCommonType2 extends EObject {
	/**
   * Returns the value of the '<em><b>Orthographic</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 												The orthographic element describes the field of view of an orthographic camera.
   * 												
   * <!-- end-model-doc -->
   * @return the value of the '<em>Orthographic</em>' containment reference.
   * @see #setOrthographic(OrthographicType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType2_Orthographic()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='orthographic' namespace='##targetNamespace'"
   * @generated
   */
	OrthographicType getOrthographic();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType2#getOrthographic <em>Orthographic</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orthographic</em>' containment reference.
   * @see #getOrthographic()
   * @generated
   */
	void setOrthographic(OrthographicType value);

	/**
   * Returns the value of the '<em><b>Perspective</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 												The perspective element describes the optics of a perspective camera.
   * 												
   * <!-- end-model-doc -->
   * @return the value of the '<em>Perspective</em>' containment reference.
   * @see #setPerspective(PerspectiveType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType2_Perspective()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='perspective' namespace='##targetNamespace'"
   * @generated
   */
	PerspectiveType getPerspective();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType2#getPerspective <em>Perspective</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Perspective</em>' containment reference.
   * @see #getPerspective()
   * @generated
   */
	void setPerspective(PerspectiveType value);

} // TechniqueCommonType2
