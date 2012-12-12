/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polylist Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.PolylistType#getInput <em>Input</em>}</li>
 *   <li>{@link org.khronos.collada.PolylistType#getVcount <em>Vcount</em>}</li>
 *   <li>{@link org.khronos.collada.PolylistType#getP <em>P</em>}</li>
 *   <li>{@link org.khronos.collada.PolylistType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.PolylistType#getCount <em>Count</em>}</li>
 *   <li>{@link org.khronos.collada.PolylistType#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.khronos.collada.PolylistType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getPolylistType()
 * @model extendedMetaData="name='polylist_._type' kind='elementOnly'"
 * @generated
 */
public interface PolylistType extends EObject {
	/**
   * Returns the value of the '<em><b>Input</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.InputLocalOffset}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The input element may occur any number of times. This input is a local input with the 
   * 						offset and set attributes.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Input</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getPolylistType_Input()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
   * @generated
   */
	EList<InputLocalOffset> getInput();

	/**
   * Returns the value of the '<em><b>Vcount</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The vcount element contains a list of integers describing the number of sides for each polygon 
   * 						described by the polylist element. The vcount element may occur once.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Vcount</em>' attribute.
   * @see #setVcount(List)
   * @see org.khronos.collada.ColladaPackage#getPolylistType_Vcount()
   * @model dataType="org.khronos.collada.ListOfUInts" many="false"
   *        extendedMetaData="kind='element' name='vcount' namespace='##targetNamespace'"
   * @generated
   */
	List<BigInteger> getVcount();

	/**
   * Sets the value of the '{@link org.khronos.collada.PolylistType#getVcount <em>Vcount</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vcount</em>' attribute.
   * @see #getVcount()
   * @generated
   */
	void setVcount(List<BigInteger> value);

	/**
   * Returns the value of the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						The p element may occur once.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>P</em>' attribute.
   * @see #setP(List)
   * @see org.khronos.collada.ColladaPackage#getPolylistType_P()
   * @model dataType="org.khronos.collada.ListOfUInts" many="false"
   *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace'"
   * @generated
   */
	List<BigInteger> getP();

	/**
   * Sets the value of the '{@link org.khronos.collada.PolylistType#getP <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' attribute.
   * @see #getP()
   * @generated
   */
	void setP(List<BigInteger> value);

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
   * @see org.khronos.collada.ColladaPackage#getPolylistType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

	/**
   * Returns the value of the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The count attribute indicates the number of polygon primitives. Required attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Count</em>' attribute.
   * @see #setCount(BigInteger)
   * @see org.khronos.collada.ColladaPackage#getPolylistType_Count()
   * @model dataType="org.khronos.collada.Uint" required="true"
   *        extendedMetaData="kind='attribute' name='count'"
   * @generated
   */
	BigInteger getCount();

	/**
   * Sets the value of the '{@link org.khronos.collada.PolylistType#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #getCount()
   * @generated
   */
	void setCount(BigInteger value);

	/**
   * Returns the value of the '<em><b>Material</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					The material attribute declares a symbol for a material. This symbol is bound to a material at 
   * 					the time of instantiation. If the material attribute is not specified then the lighting and 
   * 					shading results are application defined. Optional attribute.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Material</em>' attribute.
   * @see #setMaterial(String)
   * @see org.khronos.collada.ColladaPackage#getPolylistType_Material()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='material'"
   * @generated
   */
	String getMaterial();

	/**
   * Sets the value of the '{@link org.khronos.collada.PolylistType#getMaterial <em>Material</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Material</em>' attribute.
   * @see #getMaterial()
   * @generated
   */
	void setMaterial(String value);

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
   * @see org.khronos.collada.ColladaPackage#getPolylistType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.khronos.collada.PolylistType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // PolylistType
