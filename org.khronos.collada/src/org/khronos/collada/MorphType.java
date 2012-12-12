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
 * A representation of the model object '<em><b>Morph Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.MorphType#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.MorphType#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.khronos.collada.MorphType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.MorphType#getMethod <em>Method</em>}</li>
 *   <li>{@link org.khronos.collada.MorphType#getSource1 <em>Source1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getMorphType()
 * @model extendedMetaData="name='morph_._type' kind='elementOnly'"
 * @generated
 */
public interface MorphType extends EObject {
	/**
   * Returns the value of the '<em><b>Source</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.SourceType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The morph element must contain at least two source elements.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getMorphType_Source()
   * @model containment="true" lower="2"
   *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
   * @generated
   */
	EList<SourceType> getSource();

	/**
   * Returns the value of the '<em><b>Targets</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The targets element declares the morph targets, their weights and any user defined attributes 
   * 						associated with them.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Targets</em>' containment reference.
   * @see #setTargets(TargetsType)
   * @see org.khronos.collada.ColladaPackage#getMorphType_Targets()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='targets' namespace='##targetNamespace'"
   * @generated
   */
	TargetsType getTargets();

	/**
   * Sets the value of the '{@link org.khronos.collada.MorphType#getTargets <em>Targets</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Targets</em>' containment reference.
   * @see #getTargets()
   * @generated
   */
	void setTargets(TargetsType value);

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
   * @see org.khronos.collada.ColladaPackage#getMorphType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * The default value is <code>"NORMALIZED"</code>.
   * The literals are from the enumeration {@link org.khronos.collada.MorphMethodType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The method attribute specifies the which blending technique to use. The accepted values are 
   * 					NORMALIZED, and RELATIVE. The default value if not specified is NORMALIZED.  Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see org.khronos.collada.MorphMethodType
   * @see #isSetMethod()
   * @see #unsetMethod()
   * @see #setMethod(MorphMethodType)
   * @see org.khronos.collada.ColladaPackage#getMorphType_Method()
   * @model default="NORMALIZED" unsettable="true"
   *        extendedMetaData="kind='attribute' name='method'"
   * @generated
   */
	MorphMethodType getMethod();

	/**
   * Sets the value of the '{@link org.khronos.collada.MorphType#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see org.khronos.collada.MorphMethodType
   * @see #isSetMethod()
   * @see #unsetMethod()
   * @see #getMethod()
   * @generated
   */
	void setMethod(MorphMethodType value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.MorphType#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMethod()
   * @see #getMethod()
   * @see #setMethod(MorphMethodType)
   * @generated
   */
	void unsetMethod();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.MorphType#getMethod <em>Method</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Method</em>' attribute is set.
   * @see #unsetMethod()
   * @see #getMethod()
   * @see #setMethod(MorphMethodType)
   * @generated
   */
	boolean isSetMethod();

	/**
   * Returns the value of the '<em><b>Source1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The source attribute indicates the base mesh. Required attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source1</em>' attribute.
   * @see #setSource1(String)
   * @see org.khronos.collada.ColladaPackage#getMorphType_Source1()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
   *        extendedMetaData="kind='attribute' name='source'"
   * @generated
   */
	String getSource1();

	/**
   * Sets the value of the '{@link org.khronos.collada.MorphType#getSource1 <em>Source1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source1</em>' attribute.
   * @see #getSource1()
   * @generated
   */
	void setSource1(String value);

} // MorphType
