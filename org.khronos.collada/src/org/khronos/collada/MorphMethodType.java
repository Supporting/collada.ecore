/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Morph Method Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * 			An enumuerated type specifying the acceptable morph methods.
 * 			
 * <!-- end-model-doc -->
 * @see org.khronos.collada.ColladaPackage#getMorphMethodType()
 * @model extendedMetaData="name='MorphMethodType'"
 * @generated
 */
public enum MorphMethodType implements Enumerator {
	/**
   * The '<em><b>NORMALIZED</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NORMALIZED_VALUE
   * @generated
   * @ordered
   */
	NORMALIZED(0, "NORMALIZED", "NORMALIZED"),

	/**
   * The '<em><b>RELATIVE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #RELATIVE_VALUE
   * @generated
   * @ordered
   */
	RELATIVE(1, "RELATIVE", "RELATIVE");

	/**
   * The '<em><b>NORMALIZED</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORMALIZED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #NORMALIZED
   * @model
   * @generated
   * @ordered
   */
	public static final int NORMALIZED_VALUE = 0;

	/**
   * The '<em><b>RELATIVE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RELATIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #RELATIVE
   * @model
   * @generated
   * @ordered
   */
	public static final int RELATIVE_VALUE = 1;

	/**
   * An array of all the '<em><b>Morph Method Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final MorphMethodType[] VALUES_ARRAY =
		new MorphMethodType[]
    {
      NORMALIZED,
      RELATIVE,
    };

	/**
   * A public read-only list of all the '<em><b>Morph Method Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<MorphMethodType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Morph Method Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static MorphMethodType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MorphMethodType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Morph Method Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static MorphMethodType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MorphMethodType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Morph Method Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static MorphMethodType get(int value) {
    switch (value)
    {
      case NORMALIZED_VALUE: return NORMALIZED;
      case RELATIVE_VALUE: return RELATIVE;
    }
    return null;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final int value;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final String name;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final String literal;

	/**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private MorphMethodType(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getLiteral() {
    return literal;
  }

	/**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    return literal;
  }
	
} //MorphMethodType
