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
 * A representation of the model object '<em><b>Shader Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.ShaderType1#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.ShaderType1#getCompilerTarget <em>Compiler Target</em>}</li>
 *   <li>{@link org.khronos.collada.ShaderType1#getCompilerOptions <em>Compiler Options</em>}</li>
 *   <li>{@link org.khronos.collada.ShaderType1#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.ShaderType1#getBind <em>Bind</em>}</li>
 *   <li>{@link org.khronos.collada.ShaderType1#getStage <em>Stage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getShaderType1()
 * @model extendedMetaData="name='shader_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ShaderType1 extends EObject {
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
   * @see org.khronos.collada.ColladaPackage#getShaderType1_Annotate()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotate' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxAnnotateCommon> getAnnotate();

	/**
   * Returns the value of the '<em><b>Compiler Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compiler Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Compiler Target</em>' containment reference.
   * @see #setCompilerTarget(CompilerTargetType1)
   * @see org.khronos.collada.ColladaPackage#getShaderType1_CompilerTarget()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='compiler_target' namespace='##targetNamespace'"
   * @generated
   */
	CompilerTargetType1 getCompilerTarget();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShaderType1#getCompilerTarget <em>Compiler Target</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compiler Target</em>' containment reference.
   * @see #getCompilerTarget()
   * @generated
   */
	void setCompilerTarget(CompilerTargetType1 value);

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
   * @see org.khronos.collada.ColladaPackage#getShaderType1_CompilerOptions()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='compiler_options' namespace='##targetNamespace'"
   * @generated
   */
	String getCompilerOptions();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShaderType1#getCompilerOptions <em>Compiler Options</em>}' attribute.
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
   * @see #setName(NameType)
   * @see org.khronos.collada.ColladaPackage#getShaderType1_Name()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
   * @generated
   */
	NameType getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShaderType1#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
	void setName(NameType value);

	/**
   * Returns the value of the '<em><b>Bind</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.BindType1}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 																Binds values to uniform inputs of a shader.
   * 																
   * <!-- end-model-doc -->
   * @return the value of the '<em>Bind</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getShaderType1_Bind()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='bind' namespace='##targetNamespace'"
   * @generated
   */
	EList<BindType1> getBind();

	/**
   * Returns the value of the '<em><b>Stage</b></em>' attribute.
   * The literals are from the enumeration {@link org.khronos.collada.CgPipelineStage}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 															In which pipeline stage this programmable shader is designed to execute, for example, VERTEX, FRAGMENT, etc.
   * 															
   * <!-- end-model-doc -->
   * @return the value of the '<em>Stage</em>' attribute.
   * @see org.khronos.collada.CgPipelineStage
   * @see #isSetStage()
   * @see #unsetStage()
   * @see #setStage(CgPipelineStage)
   * @see org.khronos.collada.ColladaPackage#getShaderType1_Stage()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='stage'"
   * @generated
   */
	CgPipelineStage getStage();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShaderType1#getStage <em>Stage</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stage</em>' attribute.
   * @see org.khronos.collada.CgPipelineStage
   * @see #isSetStage()
   * @see #unsetStage()
   * @see #getStage()
   * @generated
   */
	void setStage(CgPipelineStage value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.ShaderType1#getStage <em>Stage</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetStage()
   * @see #getStage()
   * @see #setStage(CgPipelineStage)
   * @generated
   */
	void unsetStage();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.ShaderType1#getStage <em>Stage</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Stage</em>' attribute is set.
   * @see #unsetStage()
   * @see #getStage()
   * @see #setStage(CgPipelineStage)
   * @generated
   */
	boolean isSetStage();

} // ShaderType1
