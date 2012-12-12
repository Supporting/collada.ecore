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
 * A representation of the literals of the enumeration '<em><b>Gl Func Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getGlFuncType()
 * @model extendedMetaData="name='gl_func_type'"
 * @generated
 */
public enum GlFuncType implements Enumerator {
	/**
   * The '<em><b>NEVER</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NEVER_VALUE
   * @generated
   * @ordered
   */
	NEVER(0, "NEVER", "NEVER"),

	/**
   * The '<em><b>LESS</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #LESS_VALUE
   * @generated
   * @ordered
   */
	LESS(1, "LESS", "LESS"),

	/**
   * The '<em><b>LEQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #LEQUAL_VALUE
   * @generated
   * @ordered
   */
	LEQUAL(2, "LEQUAL", "LEQUAL"),

	/**
   * The '<em><b>EQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #EQUAL_VALUE
   * @generated
   * @ordered
   */
	EQUAL(3, "EQUAL", "EQUAL"),

	/**
   * The '<em><b>GREATER</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #GREATER_VALUE
   * @generated
   * @ordered
   */
	GREATER(4, "GREATER", "GREATER"),

	/**
   * The '<em><b>NOTEQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NOTEQUAL_VALUE
   * @generated
   * @ordered
   */
	NOTEQUAL(5, "NOTEQUAL", "NOTEQUAL"),

	/**
   * The '<em><b>GEQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #GEQUAL_VALUE
   * @generated
   * @ordered
   */
	GEQUAL(6, "GEQUAL", "GEQUAL"),

	/**
   * The '<em><b>ALWAYS</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ALWAYS_VALUE
   * @generated
   * @ordered
   */
	ALWAYS(7, "ALWAYS", "ALWAYS");

	/**
   * The '<em><b>NEVER</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #NEVER
   * @model
   * @generated
   * @ordered
   */
	public static final int NEVER_VALUE = 0;

	/**
   * The '<em><b>LESS</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #LESS
   * @model
   * @generated
   * @ordered
   */
	public static final int LESS_VALUE = 1;

	/**
   * The '<em><b>LEQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEQUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #LEQUAL
   * @model
   * @generated
   * @ordered
   */
	public static final int LEQUAL_VALUE = 2;

	/**
   * The '<em><b>EQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #EQUAL
   * @model
   * @generated
   * @ordered
   */
	public static final int EQUAL_VALUE = 3;

	/**
   * The '<em><b>GREATER</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREATER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #GREATER
   * @model
   * @generated
   * @ordered
   */
	public static final int GREATER_VALUE = 4;

	/**
   * The '<em><b>NOTEQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTEQUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #NOTEQUAL
   * @model
   * @generated
   * @ordered
   */
	public static final int NOTEQUAL_VALUE = 5;

	/**
   * The '<em><b>GEQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GEQUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #GEQUAL
   * @model
   * @generated
   * @ordered
   */
	public static final int GEQUAL_VALUE = 6;

	/**
   * The '<em><b>ALWAYS</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALWAYS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ALWAYS
   * @model
   * @generated
   * @ordered
   */
	public static final int ALWAYS_VALUE = 7;

	/**
   * An array of all the '<em><b>Gl Func Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final GlFuncType[] VALUES_ARRAY =
		new GlFuncType[]
    {
      NEVER,
      LESS,
      LEQUAL,
      EQUAL,
      GREATER,
      NOTEQUAL,
      GEQUAL,
      ALWAYS,
    };

	/**
   * A public read-only list of all the '<em><b>Gl Func Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<GlFuncType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Gl Func Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlFuncType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlFuncType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gl Func Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlFuncType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlFuncType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gl Func Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlFuncType get(int value) {
    switch (value)
    {
      case NEVER_VALUE: return NEVER;
      case LESS_VALUE: return LESS;
      case LEQUAL_VALUE: return LEQUAL;
      case EQUAL_VALUE: return EQUAL;
      case GREATER_VALUE: return GREATER;
      case NOTEQUAL_VALUE: return NOTEQUAL;
      case GEQUAL_VALUE: return GEQUAL;
      case ALWAYS_VALUE: return ALWAYS;
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
	private GlFuncType(int value, String name, String literal) {
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
	
} //GlFuncType
