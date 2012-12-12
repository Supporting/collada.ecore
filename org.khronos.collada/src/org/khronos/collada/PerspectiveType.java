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
 * A representation of the model object '<em><b>Perspective Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.PerspectiveType#getXfov <em>Xfov</em>}</li>
 *   <li>{@link org.khronos.collada.PerspectiveType#getYfov <em>Yfov</em>}</li>
 *   <li>{@link org.khronos.collada.PerspectiveType#getAspectRatio <em>Aspect Ratio</em>}</li>
 *   <li>{@link org.khronos.collada.PerspectiveType#getYfov1 <em>Yfov1</em>}</li>
 *   <li>{@link org.khronos.collada.PerspectiveType#getAspectRatio1 <em>Aspect Ratio1</em>}</li>
 *   <li>{@link org.khronos.collada.PerspectiveType#getZnear <em>Znear</em>}</li>
 *   <li>{@link org.khronos.collada.PerspectiveType#getZfar <em>Zfar</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getPerspectiveType()
 * @model extendedMetaData="name='perspective_._type' kind='elementOnly'"
 * @generated
 */
public interface PerspectiveType extends EObject {
	/**
   * Returns the value of the '<em><b>Xfov</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 																	The xfov element contains a floating point number describing the horizontal field of view in degrees.
   * 																	
   * <!-- end-model-doc -->
   * @return the value of the '<em>Xfov</em>' containment reference.
   * @see #setXfov(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getPerspectiveType_Xfov()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='xfov' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getXfov();

	/**
   * Sets the value of the '{@link org.khronos.collada.PerspectiveType#getXfov <em>Xfov</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xfov</em>' containment reference.
   * @see #getXfov()
   * @generated
   */
	void setXfov(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Yfov</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 																		The yfov element contains a floating point number describing the verticle field of view in degrees.
   * 																		
   * <!-- end-model-doc -->
   * @return the value of the '<em>Yfov</em>' containment reference.
   * @see #setYfov(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getPerspectiveType_Yfov()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='yfov' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getYfov();

	/**
   * Sets the value of the '{@link org.khronos.collada.PerspectiveType#getYfov <em>Yfov</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yfov</em>' containment reference.
   * @see #getYfov()
   * @generated
   */
	void setYfov(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Aspect Ratio</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 																		The aspect_ratio element contains a floating point number describing the aspect ratio of the field 
   * 																		of view. If the aspect_ratio element is not present the aspect ratio is to be calculated from the 
   * 																		xfov or yfov elements and the current viewport.
   * 																		
   * <!-- end-model-doc -->
   * @return the value of the '<em>Aspect Ratio</em>' containment reference.
   * @see #setAspectRatio(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getPerspectiveType_AspectRatio()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='aspect_ratio' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getAspectRatio();

	/**
   * Sets the value of the '{@link org.khronos.collada.PerspectiveType#getAspectRatio <em>Aspect Ratio</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aspect Ratio</em>' containment reference.
   * @see #getAspectRatio()
   * @generated
   */
	void setAspectRatio(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Yfov1</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yfov1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Yfov1</em>' containment reference.
   * @see #setYfov1(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getPerspectiveType_Yfov1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='yfov' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getYfov1();

	/**
   * Sets the value of the '{@link org.khronos.collada.PerspectiveType#getYfov1 <em>Yfov1</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yfov1</em>' containment reference.
   * @see #getYfov1()
   * @generated
   */
	void setYfov1(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Aspect Ratio1</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect Ratio1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Aspect Ratio1</em>' containment reference.
   * @see #setAspectRatio1(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getPerspectiveType_AspectRatio1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='aspect_ratio' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getAspectRatio1();

	/**
   * Sets the value of the '{@link org.khronos.collada.PerspectiveType#getAspectRatio1 <em>Aspect Ratio1</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aspect Ratio1</em>' containment reference.
   * @see #getAspectRatio1()
   * @generated
   */
	void setAspectRatio1(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Znear</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 															The znear element contains a floating point number that describes the distance to the near 
   * 															clipping plane. The znear element must occur exactly once.
   * 															
   * <!-- end-model-doc -->
   * @return the value of the '<em>Znear</em>' containment reference.
   * @see #setZnear(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getPerspectiveType_Znear()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='znear' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getZnear();

	/**
   * Sets the value of the '{@link org.khronos.collada.PerspectiveType#getZnear <em>Znear</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Znear</em>' containment reference.
   * @see #getZnear()
   * @generated
   */
	void setZnear(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Zfar</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 															The zfar element contains a floating point number that describes the distance to the far 
   * 															clipping plane. The zfar element must occur exactly once.
   * 															
   * <!-- end-model-doc -->
   * @return the value of the '<em>Zfar</em>' containment reference.
   * @see #setZfar(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getPerspectiveType_Zfar()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='zfar' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getZfar();

	/**
   * Sets the value of the '{@link org.khronos.collada.PerspectiveType#getZfar <em>Zfar</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zfar</em>' containment reference.
   * @see #getZfar()
   * @generated
   */
	void setZfar(TargetableFloat value);

} // PerspectiveType
