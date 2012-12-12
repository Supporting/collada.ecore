/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cg Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			Declares a resource that can be used both as the source for texture samples and as the target of a rendering pass.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.CgSurfaceType#getGenerator <em>Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getCgSurfaceType()
 * @model extendedMetaData="name='cg_surface_type' kind='elementOnly'"
 * @generated
 */
public interface CgSurfaceType extends FxSurfaceCommon {
	/**
   * Returns the value of the '<em><b>Generator</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 							A procedural surface generator for the cg profile.
   * 							
   * <!-- end-model-doc -->
   * @return the value of the '<em>Generator</em>' containment reference.
   * @see #setGenerator(GeneratorType1)
   * @see org.khronos.collada.ColladaPackage#getCgSurfaceType_Generator()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='generator' namespace='##targetNamespace'"
   * @generated
   */
	GeneratorType1 getGenerator();

	/**
   * Sets the value of the '{@link org.khronos.collada.CgSurfaceType#getGenerator <em>Generator</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generator</em>' containment reference.
   * @see #getGenerator()
   * @generated
   */
	void setGenerator(GeneratorType1 value);

} // CgSurfaceType
