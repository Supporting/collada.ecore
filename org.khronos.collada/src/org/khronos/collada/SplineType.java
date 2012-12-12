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
 * A representation of the model object '<em><b>Spline Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.SplineType#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.SplineType#getControlVertices <em>Control Vertices</em>}</li>
 *   <li>{@link org.khronos.collada.SplineType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.SplineType#isClosed <em>Closed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getSplineType()
 * @model extendedMetaData="name='spline_._type' kind='elementOnly'"
 * @generated
 */
public interface SplineType extends EObject {
	/**
   * Returns the value of the '<em><b>Source</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SourceType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The mesh element must contain one or more source elements.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getSplineType_Source()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
   * @generated
   */
	EList<SourceType> getSource();

	/**
   * Returns the value of the '<em><b>Control Vertices</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The control vertices element  must occur  exactly one time. It is used to describe the CVs of the spline.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Control Vertices</em>' containment reference.
   * @see #setControlVertices(ControlVerticesType)
   * @see org.khronos.collada.ColladaPackage#getSplineType_ControlVertices()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='control_vertices' namespace='##targetNamespace'"
   * @generated
   */
	ControlVerticesType getControlVertices();

	/**
   * Sets the value of the '{@link org.khronos.collada.SplineType#getControlVertices <em>Control Vertices</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control Vertices</em>' containment reference.
   * @see #getControlVertices()
   * @generated
   */
	void setControlVertices(ControlVerticesType value);

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
   * @see org.khronos.collada.ColladaPackage#getSplineType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Closed</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Closed</em>' attribute.
   * @see #isSetClosed()
   * @see #unsetClosed()
   * @see #setClosed(boolean)
   * @see org.khronos.collada.ColladaPackage#getSplineType_Closed()
   * @model default="false" unsettable="true" dataType="org.khronos.collada.Bool"
   *        extendedMetaData="kind='attribute' name='closed'"
   * @generated
   */
	boolean isClosed();

	/**
   * Sets the value of the '{@link org.khronos.collada.SplineType#isClosed <em>Closed</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Closed</em>' attribute.
   * @see #isSetClosed()
   * @see #unsetClosed()
   * @see #isClosed()
   * @generated
   */
	void setClosed(boolean value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.SplineType#isClosed <em>Closed</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetClosed()
   * @see #isClosed()
   * @see #setClosed(boolean)
   * @generated
   */
	void unsetClosed();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.SplineType#isClosed <em>Closed</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Closed</em>' attribute is set.
   * @see #unsetClosed()
   * @see #isClosed()
   * @see #setClosed(boolean)
   * @generated
   */
	boolean isSetClosed();

} // SplineType
