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
 * A representation of the model object '<em><b>Technique Common Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.TechniqueCommonType3#getAmbient <em>Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType3#getDirectional <em>Directional</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType3#getPoint <em>Point</em>}</li>
 *   <li>{@link org.khronos.collada.TechniqueCommonType3#getSpot <em>Spot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType3()
 * @model extendedMetaData="name='technique_common_._3_._type' kind='elementOnly'"
 * @generated
 */
public interface TechniqueCommonType3 extends EObject {
	/**
   * Returns the value of the '<em><b>Ambient</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The ambient element declares the parameters required to describe an ambient light source.  
   * 									An ambient light is one that lights everything evenly, regardless of location or orientation.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Ambient</em>' containment reference.
   * @see #setAmbient(AmbientType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType3_Ambient()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ambient' namespace='##targetNamespace'"
   * @generated
   */
	AmbientType getAmbient();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType3#getAmbient <em>Ambient</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ambient</em>' containment reference.
   * @see #getAmbient()
   * @generated
   */
	void setAmbient(AmbientType value);

	/**
   * Returns the value of the '<em><b>Directional</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The directional element declares the parameters required to describe a directional light source.  
   * 									A directional light is one that lights everything from the same direction, regardless of location.  
   * 									The light’s default direction vector in local coordinates is [0,0,-1], pointing down the -Z axis. 
   * 									The actual direction of the light is defined by the transform of the node where the light is 
   * 									instantiated.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Directional</em>' containment reference.
   * @see #setDirectional(DirectionalType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType3_Directional()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='directional' namespace='##targetNamespace'"
   * @generated
   */
	DirectionalType getDirectional();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType3#getDirectional <em>Directional</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Directional</em>' containment reference.
   * @see #getDirectional()
   * @generated
   */
	void setDirectional(DirectionalType value);

	/**
   * Returns the value of the '<em><b>Point</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The point element declares the parameters required to describe a point light source.  A point light 
   * 									source radiates light in all directions from a known location in space. The intensity of a point 
   * 									light source is attenuated as the distance to the light source increases. The position of the light 
   * 									is defined by the transform of the node in which it is instantiated.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Point</em>' containment reference.
   * @see #setPoint(PointType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType3_Point()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='point' namespace='##targetNamespace'"
   * @generated
   */
	PointType getPoint();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType3#getPoint <em>Point</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Point</em>' containment reference.
   * @see #getPoint()
   * @generated
   */
	void setPoint(PointType value);

	/**
   * Returns the value of the '<em><b>Spot</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 									The spot element declares the parameters required to describe a spot light source.  A spot light 
   * 									source radiates light in one direction from a known location in space. The light radiates from 
   * 									the spot light source in a cone shape. The intensity of the light is attenuated as the radiation 
   * 									angle increases away from the direction of the light source. The intensity of a spot light source 
   * 									is also attenuated as the distance to the light source increases. The position of the light is 
   * 									defined by the transform of the node in which it is instantiated. The light’s default direction 
   * 									vector in local coordinates is [0,0,-1], pointing down the -Z axis. The actual direction of the 
   * 									light is defined by the transform of the node where the light is instantiated.
   * 									
   * <!-- end-model-doc -->
   * @return the value of the '<em>Spot</em>' containment reference.
   * @see #setSpot(SpotType)
   * @see org.khronos.collada.ColladaPackage#getTechniqueCommonType3_Spot()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='spot' namespace='##targetNamespace'"
   * @generated
   */
	SpotType getSpot();

	/**
   * Sets the value of the '{@link org.khronos.collada.TechniqueCommonType3#getSpot <em>Spot</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spot</em>' containment reference.
   * @see #getSpot()
   * @generated
   */
	void setSpot(SpotType value);

} // TechniqueCommonType3
