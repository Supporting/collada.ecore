/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glsl Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			A surface type for the GLSL profile. This surface inherits from the fx_surface_common type and adds the
 * 			ability to programmatically generate textures.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.GlslSurfaceType#getGenerator <em>Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getGlslSurfaceType()
 * @model extendedMetaData="name='glsl_surface_type' kind='elementOnly'"
 * @generated
 */
public interface GlslSurfaceType extends FxSurfaceCommon {
	/**
   * Returns the value of the '<em><b>Generator</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							A procedural surface generator.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Generator</em>' containment reference.
   * @see #setGenerator(GeneratorType)
   * @see org.khronos.collada.ColladaPackage#getGlslSurfaceType_Generator()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='generator' namespace='##targetNamespace'"
   * @generated
   */
	GeneratorType getGenerator();

	/**
   * Sets the value of the '{@link org.khronos.collada.GlslSurfaceType#getGenerator <em>Generator</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generator</em>' containment reference.
   * @see #getGenerator()
   * @generated
   */
	void setGenerator(GeneratorType value);

} // GlslSurfaceType
