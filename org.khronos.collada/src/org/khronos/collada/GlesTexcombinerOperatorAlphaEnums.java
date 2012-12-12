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
 * A representation of the literals of the enumeration '<em><b>Gles Texcombiner Operator Alpha Enums</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerOperatorAlphaEnums()
 * @model extendedMetaData="name='gles_texcombiner_operatorAlpha_enums'"
 * @generated
 */
public enum GlesTexcombinerOperatorAlphaEnums implements Enumerator {
	/**
   * The '<em><b>REPLACE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #REPLACE_VALUE
   * @generated
   * @ordered
   */
	REPLACE(0, "REPLACE", "REPLACE"),

	/**
   * The '<em><b>MODULATE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #MODULATE_VALUE
   * @generated
   * @ordered
   */
	MODULATE(1, "MODULATE", "MODULATE"),

	/**
   * The '<em><b>ADD</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ADD_VALUE
   * @generated
   * @ordered
   */
	ADD(2, "ADD", "ADD"),

	/**
   * The '<em><b>ADDSIGNED</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ADDSIGNED_VALUE
   * @generated
   * @ordered
   */
	ADDSIGNED(3, "ADDSIGNED", "ADD_SIGNED"),

	/**
   * The '<em><b>INTERPOLATE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #INTERPOLATE_VALUE
   * @generated
   * @ordered
   */
	INTERPOLATE(4, "INTERPOLATE", "INTERPOLATE"),

	/**
   * The '<em><b>SUBTRACT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SUBTRACT_VALUE
   * @generated
   * @ordered
   */
	SUBTRACT(5, "SUBTRACT", "SUBTRACT");

	/**
   * The '<em><b>REPLACE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REPLACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #REPLACE
   * @model
   * @generated
   * @ordered
   */
	public static final int REPLACE_VALUE = 0;

	/**
   * The '<em><b>MODULATE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODULATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #MODULATE
   * @model
   * @generated
   * @ordered
   */
	public static final int MODULATE_VALUE = 1;

	/**
   * The '<em><b>ADD</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ADD
   * @model
   * @generated
   * @ordered
   */
	public static final int ADD_VALUE = 2;

	/**
   * The '<em><b>ADDSIGNED</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADDSIGNED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ADDSIGNED
   * @model literal="ADD_SIGNED"
   * @generated
   * @ordered
   */
	public static final int ADDSIGNED_VALUE = 3;

	/**
   * The '<em><b>INTERPOLATE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERPOLATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #INTERPOLATE
   * @model
   * @generated
   * @ordered
   */
	public static final int INTERPOLATE_VALUE = 4;

	/**
   * The '<em><b>SUBTRACT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBTRACT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #SUBTRACT
   * @model
   * @generated
   * @ordered
   */
	public static final int SUBTRACT_VALUE = 5;

	/**
   * An array of all the '<em><b>Gles Texcombiner Operator Alpha Enums</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final GlesTexcombinerOperatorAlphaEnums[] VALUES_ARRAY =
		new GlesTexcombinerOperatorAlphaEnums[]
    {
      REPLACE,
      MODULATE,
      ADD,
      ADDSIGNED,
      INTERPOLATE,
      SUBTRACT,
    };

	/**
   * A public read-only list of all the '<em><b>Gles Texcombiner Operator Alpha Enums</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<GlesTexcombinerOperatorAlphaEnums> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Gles Texcombiner Operator Alpha Enums</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesTexcombinerOperatorAlphaEnums get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlesTexcombinerOperatorAlphaEnums result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gles Texcombiner Operator Alpha Enums</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesTexcombinerOperatorAlphaEnums getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlesTexcombinerOperatorAlphaEnums result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gles Texcombiner Operator Alpha Enums</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesTexcombinerOperatorAlphaEnums get(int value) {
    switch (value)
    {
      case REPLACE_VALUE: return REPLACE;
      case MODULATE_VALUE: return MODULATE;
      case ADD_VALUE: return ADD;
      case ADDSIGNED_VALUE: return ADDSIGNED;
      case INTERPOLATE_VALUE: return INTERPOLATE;
      case SUBTRACT_VALUE: return SUBTRACT;
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
	private GlesTexcombinerOperatorAlphaEnums(int value, String name, String literal) {
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
	
} //GlesTexcombinerOperatorAlphaEnums
