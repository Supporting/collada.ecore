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
 * A representation of the literals of the enumeration '<em><b>Gl Logic Op Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getGlLogicOpType()
 * @model extendedMetaData="name='gl_logic_op_type'"
 * @generated
 */
public enum GlLogicOpType implements Enumerator {
	/**
   * The '<em><b>CLEAR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #CLEAR_VALUE
   * @generated
   * @ordered
   */
	CLEAR(0, "CLEAR", "CLEAR"),

	/**
   * The '<em><b>AND</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #AND_VALUE
   * @generated
   * @ordered
   */
	AND(1, "AND", "AND"),

	/**
   * The '<em><b>ANDREVERSE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ANDREVERSE_VALUE
   * @generated
   * @ordered
   */
	ANDREVERSE(2, "ANDREVERSE", "AND_REVERSE"),

	/**
   * The '<em><b>COPY</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #COPY_VALUE
   * @generated
   * @ordered
   */
	COPY(3, "COPY", "COPY"),

	/**
   * The '<em><b>ANDINVERTED</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ANDINVERTED_VALUE
   * @generated
   * @ordered
   */
	ANDINVERTED(4, "ANDINVERTED", "AND_INVERTED"),

	/**
   * The '<em><b>NOOP</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NOOP_VALUE
   * @generated
   * @ordered
   */
	NOOP(5, "NOOP", "NOOP"),

	/**
   * The '<em><b>XOR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #XOR_VALUE
   * @generated
   * @ordered
   */
	XOR(6, "XOR", "XOR"),

	/**
   * The '<em><b>OR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #OR_VALUE
   * @generated
   * @ordered
   */
	OR(7, "OR", "OR"),

	/**
   * The '<em><b>NOR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NOR_VALUE
   * @generated
   * @ordered
   */
	NOR(8, "NOR", "NOR"),

	/**
   * The '<em><b>EQUIV</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #EQUIV_VALUE
   * @generated
   * @ordered
   */
	EQUIV(9, "EQUIV", "EQUIV"),

	/**
   * The '<em><b>INVERT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #INVERT_VALUE
   * @generated
   * @ordered
   */
	INVERT(10, "INVERT", "INVERT"),

	/**
   * The '<em><b>ORREVERSE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ORREVERSE_VALUE
   * @generated
   * @ordered
   */
	ORREVERSE(11, "ORREVERSE", "OR_REVERSE"),

	/**
   * The '<em><b>COPYINVERTED</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #COPYINVERTED_VALUE
   * @generated
   * @ordered
   */
	COPYINVERTED(12, "COPYINVERTED", "COPY_INVERTED"),

	/**
   * The '<em><b>NAND</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NAND_VALUE
   * @generated
   * @ordered
   */
	NAND(13, "NAND", "NAND"),

	/**
   * The '<em><b>SET</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SET_VALUE
   * @generated
   * @ordered
   */
	SET(14, "SET", "SET");

	/**
   * The '<em><b>CLEAR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLEAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #CLEAR
   * @model
   * @generated
   * @ordered
   */
	public static final int CLEAR_VALUE = 0;

	/**
   * The '<em><b>AND</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #AND
   * @model
   * @generated
   * @ordered
   */
	public static final int AND_VALUE = 1;

	/**
   * The '<em><b>ANDREVERSE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANDREVERSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ANDREVERSE
   * @model literal="AND_REVERSE"
   * @generated
   * @ordered
   */
	public static final int ANDREVERSE_VALUE = 2;

	/**
   * The '<em><b>COPY</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COPY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #COPY
   * @model
   * @generated
   * @ordered
   */
	public static final int COPY_VALUE = 3;

	/**
   * The '<em><b>ANDINVERTED</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANDINVERTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ANDINVERTED
   * @model literal="AND_INVERTED"
   * @generated
   * @ordered
   */
	public static final int ANDINVERTED_VALUE = 4;

	/**
   * The '<em><b>NOOP</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #NOOP
   * @model
   * @generated
   * @ordered
   */
	public static final int NOOP_VALUE = 5;

	/**
   * The '<em><b>XOR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #XOR
   * @model
   * @generated
   * @ordered
   */
	public static final int XOR_VALUE = 6;

	/**
   * The '<em><b>OR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #OR
   * @model
   * @generated
   * @ordered
   */
	public static final int OR_VALUE = 7;

	/**
   * The '<em><b>NOR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #NOR
   * @model
   * @generated
   * @ordered
   */
	public static final int NOR_VALUE = 8;

	/**
   * The '<em><b>EQUIV</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQUIV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #EQUIV
   * @model
   * @generated
   * @ordered
   */
	public static final int EQUIV_VALUE = 9;

	/**
   * The '<em><b>INVERT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INVERT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #INVERT
   * @model
   * @generated
   * @ordered
   */
	public static final int INVERT_VALUE = 10;

	/**
   * The '<em><b>ORREVERSE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORREVERSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ORREVERSE
   * @model literal="OR_REVERSE"
   * @generated
   * @ordered
   */
	public static final int ORREVERSE_VALUE = 11;

	/**
   * The '<em><b>COPYINVERTED</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COPYINVERTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #COPYINVERTED
   * @model literal="COPY_INVERTED"
   * @generated
   * @ordered
   */
	public static final int COPYINVERTED_VALUE = 12;

	/**
   * The '<em><b>NAND</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #NAND
   * @model
   * @generated
   * @ordered
   */
	public static final int NAND_VALUE = 13;

	/**
   * The '<em><b>SET</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #SET
   * @model
   * @generated
   * @ordered
   */
	public static final int SET_VALUE = 14;

	/**
   * An array of all the '<em><b>Gl Logic Op Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final GlLogicOpType[] VALUES_ARRAY =
		new GlLogicOpType[]
    {
      CLEAR,
      AND,
      ANDREVERSE,
      COPY,
      ANDINVERTED,
      NOOP,
      XOR,
      OR,
      NOR,
      EQUIV,
      INVERT,
      ORREVERSE,
      COPYINVERTED,
      NAND,
      SET,
    };

	/**
   * A public read-only list of all the '<em><b>Gl Logic Op Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<GlLogicOpType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Gl Logic Op Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlLogicOpType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlLogicOpType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gl Logic Op Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlLogicOpType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlLogicOpType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gl Logic Op Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlLogicOpType get(int value) {
    switch (value)
    {
      case CLEAR_VALUE: return CLEAR;
      case AND_VALUE: return AND;
      case ANDREVERSE_VALUE: return ANDREVERSE;
      case COPY_VALUE: return COPY;
      case ANDINVERTED_VALUE: return ANDINVERTED;
      case NOOP_VALUE: return NOOP;
      case XOR_VALUE: return XOR;
      case OR_VALUE: return OR;
      case NOR_VALUE: return NOR;
      case EQUIV_VALUE: return EQUIV;
      case INVERT_VALUE: return INVERT;
      case ORREVERSE_VALUE: return ORREVERSE;
      case COPYINVERTED_VALUE: return COPYINVERTED;
      case NAND_VALUE: return NAND;
      case SET_VALUE: return SET;
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
	private GlLogicOpType(int value, String name, String literal) {
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
	
} //GlLogicOpType
