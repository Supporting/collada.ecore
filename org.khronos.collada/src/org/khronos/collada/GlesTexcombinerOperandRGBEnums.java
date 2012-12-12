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
 * A representation of the literals of the enumeration '<em><b>Gles Texcombiner Operand RGB Enums</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerOperandRGBEnums()
 * @model extendedMetaData="name='gles_texcombiner_operandRGB_enums'"
 * @generated
 */
public enum GlesTexcombinerOperandRGBEnums implements Enumerator {
	/**
   * The '<em><b>SRCCOLOR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SRCCOLOR_VALUE
   * @generated
   * @ordered
   */
	SRCCOLOR(0, "SRCCOLOR", "SRC_COLOR"),

	/**
   * The '<em><b>ONEMINUSSRCCOLOR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ONEMINUSSRCCOLOR_VALUE
   * @generated
   * @ordered
   */
	ONEMINUSSRCCOLOR(1, "ONEMINUSSRCCOLOR", "ONE_MINUS_SRC_COLOR"),

	/**
   * The '<em><b>SRCALPHA</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SRCALPHA_VALUE
   * @generated
   * @ordered
   */
	SRCALPHA(2, "SRCALPHA", "SRC_ALPHA"),

	/**
   * The '<em><b>ONEMINUSSRCALPHA</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ONEMINUSSRCALPHA_VALUE
   * @generated
   * @ordered
   */
	ONEMINUSSRCALPHA(3, "ONEMINUSSRCALPHA", "ONE_MINUS_SRC_ALPHA");

	/**
   * The '<em><b>SRCCOLOR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SRCCOLOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #SRCCOLOR
   * @model literal="SRC_COLOR"
   * @generated
   * @ordered
   */
	public static final int SRCCOLOR_VALUE = 0;

	/**
   * The '<em><b>ONEMINUSSRCCOLOR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONEMINUSSRCCOLOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ONEMINUSSRCCOLOR
   * @model literal="ONE_MINUS_SRC_COLOR"
   * @generated
   * @ordered
   */
	public static final int ONEMINUSSRCCOLOR_VALUE = 1;

	/**
   * The '<em><b>SRCALPHA</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SRCALPHA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #SRCALPHA
   * @model literal="SRC_ALPHA"
   * @generated
   * @ordered
   */
	public static final int SRCALPHA_VALUE = 2;

	/**
   * The '<em><b>ONEMINUSSRCALPHA</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONEMINUSSRCALPHA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ONEMINUSSRCALPHA
   * @model literal="ONE_MINUS_SRC_ALPHA"
   * @generated
   * @ordered
   */
	public static final int ONEMINUSSRCALPHA_VALUE = 3;

	/**
   * An array of all the '<em><b>Gles Texcombiner Operand RGB Enums</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final GlesTexcombinerOperandRGBEnums[] VALUES_ARRAY =
		new GlesTexcombinerOperandRGBEnums[]
    {
      SRCCOLOR,
      ONEMINUSSRCCOLOR,
      SRCALPHA,
      ONEMINUSSRCALPHA,
    };

	/**
   * A public read-only list of all the '<em><b>Gles Texcombiner Operand RGB Enums</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<GlesTexcombinerOperandRGBEnums> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Gles Texcombiner Operand RGB Enums</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesTexcombinerOperandRGBEnums get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlesTexcombinerOperandRGBEnums result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gles Texcombiner Operand RGB Enums</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesTexcombinerOperandRGBEnums getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlesTexcombinerOperandRGBEnums result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gles Texcombiner Operand RGB Enums</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesTexcombinerOperandRGBEnums get(int value) {
    switch (value)
    {
      case SRCCOLOR_VALUE: return SRCCOLOR;
      case ONEMINUSSRCCOLOR_VALUE: return ONEMINUSSRCCOLOR;
      case SRCALPHA_VALUE: return SRCALPHA;
      case ONEMINUSSRCALPHA_VALUE: return ONEMINUSSRCALPHA;
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
	private GlesTexcombinerOperandRGBEnums(int value, String name, String literal) {
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
	
} //GlesTexcombinerOperandRGBEnums
