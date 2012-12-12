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
 * A representation of the literals of the enumeration '<em><b>Fx Modifier Enum Common</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getFxModifierEnumCommon()
 * @model extendedMetaData="name='fx_modifier_enum_common'"
 * @generated
 */
public enum FxModifierEnumCommon implements Enumerator {
	/**
   * The '<em><b>CONST</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #CONST_VALUE
   * @generated
   * @ordered
   */
	CONST(0, "CONST", "CONST"),

	/**
   * The '<em><b>UNIFORM</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #UNIFORM_VALUE
   * @generated
   * @ordered
   */
	UNIFORM(1, "UNIFORM", "UNIFORM"),

	/**
   * The '<em><b>VARYING</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #VARYING_VALUE
   * @generated
   * @ordered
   */
	VARYING(2, "VARYING", "VARYING"),

	/**
   * The '<em><b>STATIC</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #STATIC_VALUE
   * @generated
   * @ordered
   */
	STATIC(3, "STATIC", "STATIC"),

	/**
   * The '<em><b>VOLATILE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #VOLATILE_VALUE
   * @generated
   * @ordered
   */
	VOLATILE(4, "VOLATILE", "VOLATILE"),

	/**
   * The '<em><b>EXTERN</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #EXTERN_VALUE
   * @generated
   * @ordered
   */
	EXTERN(5, "EXTERN", "EXTERN"),

	/**
   * The '<em><b>SHARED</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SHARED_VALUE
   * @generated
   * @ordered
   */
	SHARED(6, "SHARED", "SHARED");

	/**
   * The '<em><b>CONST</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #CONST
   * @model
   * @generated
   * @ordered
   */
	public static final int CONST_VALUE = 0;

	/**
   * The '<em><b>UNIFORM</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNIFORM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #UNIFORM
   * @model
   * @generated
   * @ordered
   */
	public static final int UNIFORM_VALUE = 1;

	/**
   * The '<em><b>VARYING</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VARYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #VARYING
   * @model
   * @generated
   * @ordered
   */
	public static final int VARYING_VALUE = 2;

	/**
   * The '<em><b>STATIC</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STATIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #STATIC
   * @model
   * @generated
   * @ordered
   */
	public static final int STATIC_VALUE = 3;

	/**
   * The '<em><b>VOLATILE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VOLATILE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #VOLATILE
   * @model
   * @generated
   * @ordered
   */
	public static final int VOLATILE_VALUE = 4;

	/**
   * The '<em><b>EXTERN</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXTERN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #EXTERN
   * @model
   * @generated
   * @ordered
   */
	public static final int EXTERN_VALUE = 5;

	/**
   * The '<em><b>SHARED</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHARED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #SHARED
   * @model
   * @generated
   * @ordered
   */
	public static final int SHARED_VALUE = 6;

	/**
   * An array of all the '<em><b>Fx Modifier Enum Common</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final FxModifierEnumCommon[] VALUES_ARRAY =
		new FxModifierEnumCommon[]
    {
      CONST,
      UNIFORM,
      VARYING,
      STATIC,
      VOLATILE,
      EXTERN,
      SHARED,
    };

	/**
   * A public read-only list of all the '<em><b>Fx Modifier Enum Common</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<FxModifierEnumCommon> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Fx Modifier Enum Common</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxModifierEnumCommon get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxModifierEnumCommon result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Modifier Enum Common</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxModifierEnumCommon getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxModifierEnumCommon result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Modifier Enum Common</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxModifierEnumCommon get(int value) {
    switch (value)
    {
      case CONST_VALUE: return CONST;
      case UNIFORM_VALUE: return UNIFORM;
      case VARYING_VALUE: return VARYING;
      case STATIC_VALUE: return STATIC;
      case VOLATILE_VALUE: return VOLATILE;
      case EXTERN_VALUE: return EXTERN;
      case SHARED_VALUE: return SHARED;
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
	private FxModifierEnumCommon(int value, String name, String literal) {
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
	
} //FxModifierEnumCommon
