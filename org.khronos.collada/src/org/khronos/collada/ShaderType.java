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
 * A representation of the model object '<em><b>Shader Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.ShaderType#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.ShaderType#getCompilerTarget <em>Compiler Target</em>}</li>
 *   <li>{@link org.khronos.collada.ShaderType#getCompilerOptions <em>Compiler Options</em>}</li>
 *   <li>{@link org.khronos.collada.ShaderType#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.ShaderType#getBind <em>Bind</em>}</li>
 *   <li>{@link org.khronos.collada.ShaderType#getStage <em>Stage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getShaderType()
 * @model extendedMetaData="name='shader_._type' kind='elementOnly'"
 * @generated
 */
public interface ShaderType extends EObject {
	/**
   * Returns the value of the '<em><b>Annotate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxAnnotateCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Annotate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getShaderType_Annotate()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotate' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxAnnotateCommon> getAnnotate();

	/**
   * Returns the value of the '<em><b>Compiler Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 																	A string declaring which profile or platform the compiler is targeting this shader for.
   * 																	
   * <!-- end-model-doc -->
   * @return the value of the '<em>Compiler Target</em>' containment reference.
   * @see #setCompilerTarget(CompilerTargetType)
   * @see org.khronos.collada.ColladaPackage#getShaderType_CompilerTarget()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='compiler_target' namespace='##targetNamespace'"
   * @generated
   */
	CompilerTargetType getCompilerTarget();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShaderType#getCompilerTarget <em>Compiler Target</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compiler Target</em>' containment reference.
   * @see #getCompilerTarget()
   * @generated
   */
	void setCompilerTarget(CompilerTargetType value);

	/**
   * Returns the value of the '<em><b>Compiler Options</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 																	A string containing command-line operations for the shader compiler.
   * 																	
   * <!-- end-model-doc -->
   * @return the value of the '<em>Compiler Options</em>' attribute.
   * @see #setCompilerOptions(String)
   * @see org.khronos.collada.ColladaPackage#getShaderType_CompilerOptions()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='compiler_options' namespace='##targetNamespace'"
   * @generated
   */
	String getCompilerOptions();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShaderType#getCompilerOptions <em>Compiler Options</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compiler Options</em>' attribute.
   * @see #getCompilerOptions()
   * @generated
   */
	void setCompilerOptions(String value);

	/**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 																The entry symbol for the shader function.
   * 																
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(NameType1)
   * @see org.khronos.collada.ColladaPackage#getShaderType_Name()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
   * @generated
   */
	NameType1 getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShaderType#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
	void setName(NameType1 value);

	/**
   * Returns the value of the '<em><b>Bind</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.BindType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 																Binds values to uniform inputs of a shader.
   * 																
   * <!-- end-model-doc -->
   * @return the value of the '<em>Bind</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getShaderType_Bind()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='bind' namespace='##targetNamespace'"
   * @generated
   */
	EList<BindType> getBind();

	/**
   * Returns the value of the '<em><b>Stage</b></em>' attribute.
   * The literals are from the enumeration {@link org.khronos.collada.GlslPipelineStage}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 															In which pipeline stage this programmable shader is designed to execute, for example, VERTEX, FRAGMENT, etc.
   * 															
   * <!-- end-model-doc -->
   * @return the value of the '<em>Stage</em>' attribute.
   * @see org.khronos.collada.GlslPipelineStage
   * @see #isSetStage()
   * @see #unsetStage()
   * @see #setStage(GlslPipelineStage)
   * @see org.khronos.collada.ColladaPackage#getShaderType_Stage()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='stage'"
   * @generated
   */
	GlslPipelineStage getStage();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShaderType#getStage <em>Stage</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stage</em>' attribute.
   * @see org.khronos.collada.GlslPipelineStage
   * @see #isSetStage()
   * @see #unsetStage()
   * @see #getStage()
   * @generated
   */
	void setStage(GlslPipelineStage value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.ShaderType#getStage <em>Stage</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetStage()
   * @see #getStage()
   * @see #setStage(GlslPipelineStage)
   * @generated
   */
	void unsetStage();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.ShaderType#getStage <em>Stage</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Stage</em>' attribute is set.
   * @see #unsetStage()
   * @see #getStage()
   * @see #setStage(GlslPipelineStage)
   * @generated
   */
	boolean isSetStage();

} // ShaderType
