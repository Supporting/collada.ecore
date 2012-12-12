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
 * A representation of the literals of the enumeration '<em><b>Gles Texcombiner Operator RGB Enums</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerOperatorRGBEnums()
 * @model extendedMetaData="name='gles_texcombiner_operatorRGB_enums'"
 * @generated
 */
public enum GlesTexcombinerOperatorRGBEnums implements Enumerator {
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
	SUBTRACT(5, "SUBTRACT", "SUBTRACT"),

	/**
   * The '<em><b>DOT3RGB</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #DOT3RGB_VALUE
   * @generated
   * @ordered
   */
	DOT3RGB(6, "DOT3RGB", "DOT3_RGB"),

	/**
   * The '<em><b>DOT3RGBA</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #DOT3RGBA_VALUE
   * @generated
   * @ordered
   */
	DOT3RGBA(7, "DOT3RGBA", "DOT3_RGBA");

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
   * The '<em><b>DOT3RGB</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOT3RGB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #DOT3RGB
   * @model literal="DOT3_RGB"
   * @generated
   * @ordered
   */
	public static final int DOT3RGB_VALUE = 6;

	/**
   * The '<em><b>DOT3RGBA</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOT3RGBA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #DOT3RGBA
   * @model literal="DOT3_RGBA"
   * @generated
   * @ordered
   */
	public static final int DOT3RGBA_VALUE = 7;

	/**
   * An array of all the '<em><b>Gles Texcombiner Operator RGB Enums</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final GlesTexcombinerOperatorRGBEnums[] VALUES_ARRAY =
		new GlesTexcombinerOperatorRGBEnums[]
    {
      REPLACE,
      MODULATE,
      ADD,
      ADDSIGNED,
      INTERPOLATE,
      SUBTRACT,
      DOT3RGB,
      DOT3RGBA,
    };

	/**
   * A public read-only list of all the '<em><b>Gles Texcombiner Operator RGB Enums</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<GlesTexcombinerOperatorRGBEnums> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Gles Texcombiner Operator RGB Enums</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesTexcombinerOperatorRGBEnums get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlesTexcombinerOperatorRGBEnums result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gles Texcombiner Operator RGB Enums</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesTexcombinerOperatorRGBEnums getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlesTexcombinerOperatorRGBEnums result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gles Texcombiner Operator RGB Enums</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesTexcombinerOperatorRGBEnums get(int value) {
    switch (value)
    {
      case REPLACE_VALUE: return REPLACE;
      case MODULATE_VALUE: return MODULATE;
      case ADD_VALUE: return ADD;
      case ADDSIGNED_VALUE: return ADDSIGNED;
      case INTERPOLATE_VALUE: return INTERPOLATE;
      case SUBTRACT_VALUE: return SUBTRACT;
      case DOT3RGB_VALUE: return DOT3RGB;
      case DOT3RGBA_VALUE: return DOT3RGBA;
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
	private GlesTexcombinerOperatorRGBEnums(int value, String name, String literal) {
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
	
} //GlesTexcombinerOperatorRGBEnums
