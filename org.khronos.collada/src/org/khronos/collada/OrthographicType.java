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
 * A representation of the model object '<em><b>Orthographic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.OrthographicType#getXmag <em>Xmag</em>}</li>
 *   <li>{@link org.khronos.collada.OrthographicType#getYmag <em>Ymag</em>}</li>
 *   <li>{@link org.khronos.collada.OrthographicType#getAspectRatio <em>Aspect Ratio</em>}</li>
 *   <li>{@link org.khronos.collada.OrthographicType#getYmag1 <em>Ymag1</em>}</li>
 *   <li>{@link org.khronos.collada.OrthographicType#getAspectRatio1 <em>Aspect Ratio1</em>}</li>
 *   <li>{@link org.khronos.collada.OrthographicType#getZnear <em>Znear</em>}</li>
 *   <li>{@link org.khronos.collada.OrthographicType#getZfar <em>Zfar</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getOrthographicType()
 * @model extendedMetaData="name='orthographic_._type' kind='elementOnly'"
 * @generated
 */
public interface OrthographicType extends EObject {
	/**
   * Returns the value of the '<em><b>Xmag</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 																	The xmag element contains a floating point number describing the horizontal 
   * 																	magnification of the view.
   * 																	
   * <!-- end-model-doc -->
   * @return the value of the '<em>Xmag</em>' containment reference.
   * @see #setXmag(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getOrthographicType_Xmag()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='xmag' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getXmag();

	/**
   * Sets the value of the '{@link org.khronos.collada.OrthographicType#getXmag <em>Xmag</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xmag</em>' containment reference.
   * @see #getXmag()
   * @generated
   */
	void setXmag(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Ymag</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 																		The ymag element contains a floating point number describing the vertical 
   * 																		magnification of the view.  It can also have a sid.
   * 																		
   * <!-- end-model-doc -->
   * @return the value of the '<em>Ymag</em>' containment reference.
   * @see #setYmag(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getOrthographicType_Ymag()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ymag' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getYmag();

	/**
   * Sets the value of the '{@link org.khronos.collada.OrthographicType#getYmag <em>Ymag</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ymag</em>' containment reference.
   * @see #getYmag()
   * @generated
   */
	void setYmag(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Aspect Ratio</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 																		The aspect_ratio element contains a floating point number describing the aspect ratio of 
   * 																		the field of view. If the aspect_ratio element is not present the aspect ratio is to be 
   * 																		calculated from the xmag or ymag elements and the current viewport.
   * 																		
   * <!-- end-model-doc -->
   * @return the value of the '<em>Aspect Ratio</em>' containment reference.
   * @see #setAspectRatio(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getOrthographicType_AspectRatio()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='aspect_ratio' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getAspectRatio();

	/**
   * Sets the value of the '{@link org.khronos.collada.OrthographicType#getAspectRatio <em>Aspect Ratio</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aspect Ratio</em>' containment reference.
   * @see #getAspectRatio()
   * @generated
   */
	void setAspectRatio(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Ymag1</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ymag1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Ymag1</em>' containment reference.
   * @see #setYmag1(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getOrthographicType_Ymag1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ymag' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getYmag1();

	/**
   * Sets the value of the '{@link org.khronos.collada.OrthographicType#getYmag1 <em>Ymag1</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ymag1</em>' containment reference.
   * @see #getYmag1()
   * @generated
   */
	void setYmag1(TargetableFloat value);

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
   * @see org.khronos.collada.ColladaPackage#getOrthographicType_AspectRatio1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='aspect_ratio' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getAspectRatio1();

	/**
   * Sets the value of the '{@link org.khronos.collada.OrthographicType#getAspectRatio1 <em>Aspect Ratio1</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getOrthographicType_Znear()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='znear' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getZnear();

	/**
   * Sets the value of the '{@link org.khronos.collada.OrthographicType#getZnear <em>Znear</em>}' containment reference.
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
   * @see org.khronos.collada.ColladaPackage#getOrthographicType_Zfar()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='zfar' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getZfar();

	/**
   * Sets the value of the '{@link org.khronos.collada.OrthographicType#getZfar <em>Zfar</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zfar</em>' containment reference.
   * @see #getZfar()
   * @generated
   */
	void setZfar(TargetableFloat value);

} // OrthographicType
