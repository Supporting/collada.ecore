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
 * A representation of the model object '<em><b>Instance Material Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.InstanceMaterialType#getBind <em>Bind</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceMaterialType#getBindVertexInput <em>Bind Vertex Input</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceMaterialType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceMaterialType#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceMaterialType#getSid <em>Sid</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceMaterialType#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceMaterialType#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getInstanceMaterialType()
 * @model extendedMetaData="name='instance_material_._type' kind='elementOnly'"
 * @generated
 */
public interface InstanceMaterialType extends EObject {
	/**
   * Returns the value of the '<em><b>Bind</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.BindType2}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The bind element binds values to effect parameters upon instantiation.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Bind</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getInstanceMaterialType_Bind()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='bind' namespace='##targetNamespace'"
   * @generated
   */
	EList<BindType2> getBind();

	/**
   * Returns the value of the '<em><b>Bind Vertex Input</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.BindVertexInputType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The bind_vertex_input element binds vertex inputs to effect parameters upon instantiation.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Bind Vertex Input</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getInstanceMaterialType_BindVertexInput()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='bind_vertex_input' namespace='##targetNamespace'"
   * @generated
   */
	EList<BindVertexInputType> getBindVertexInput();

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
   * @see org.khronos.collada.ColladaPackage#getInstanceMaterialType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The name attribute is the text string name of this element. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.khronos.collada.ColladaPackage#getInstanceMaterialType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstanceMaterialType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The sid attribute is a text string value containing the sub-identifier of this element. This 
   * 					value must be unique within the scope of the parent element. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sid</em>' attribute.
   * @see #setSid(String)
   * @see org.khronos.collada.ColladaPackage#getInstanceMaterialType_Sid()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='sid'"
   * @generated
   */
	String getSid();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstanceMaterialType#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
	void setSid(String value);

	/**
   * Returns the value of the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The symbol attribute specifies which symbol defined from within the geometry this material binds to.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Symbol</em>' attribute.
   * @see #setSymbol(String)
   * @see org.khronos.collada.ColladaPackage#getInstanceMaterialType_Symbol()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='symbol'"
   * @generated
   */
	String getSymbol();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstanceMaterialType#getSymbol <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' attribute.
   * @see #getSymbol()
   * @generated
   */
	void setSymbol(String value);

	/**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The target attribute specifies the URL of the location of the object to instantiate.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see org.khronos.collada.ColladaPackage#getInstanceMaterialType_Target()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
   *        extendedMetaData="kind='attribute' name='target'"
   * @generated
   */
	String getTarget();

	/**
   * Sets the value of the '{@link org.khronos.collada.InstanceMaterialType#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
	void setTarget(String value);

} // InstanceMaterialType
