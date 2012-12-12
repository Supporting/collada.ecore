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
 * A representation of the literals of the enumeration '<em><b>Fx Surface Face Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getFxSurfaceFaceEnum()
 * @model extendedMetaData="name='fx_surface_face_enum'"
 * @generated
 */
public enum FxSurfaceFaceEnum implements Enumerator {
	/**
   * The '<em><b>POSITIVEX</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #POSITIVEX_VALUE
   * @generated
   * @ordered
   */
	POSITIVEX(0, "POSITIVEX", "POSITIVE_X"),

	/**
   * The '<em><b>NEGATIVEX</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NEGATIVEX_VALUE
   * @generated
   * @ordered
   */
	NEGATIVEX(1, "NEGATIVEX", "NEGATIVE_X"),

	/**
   * The '<em><b>POSITIVEY</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #POSITIVEY_VALUE
   * @generated
   * @ordered
   */
	POSITIVEY(2, "POSITIVEY", "POSITIVE_Y"),

	/**
   * The '<em><b>NEGATIVEY</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NEGATIVEY_VALUE
   * @generated
   * @ordered
   */
	NEGATIVEY(3, "NEGATIVEY", "NEGATIVE_Y"),

	/**
   * The '<em><b>POSITIVEZ</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #POSITIVEZ_VALUE
   * @generated
   * @ordered
   */
	POSITIVEZ(4, "POSITIVEZ", "POSITIVE_Z"),

	/**
   * The '<em><b>NEGATIVEZ</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NEGATIVEZ_VALUE
   * @generated
   * @ordered
   */
	NEGATIVEZ(5, "NEGATIVEZ", "NEGATIVE_Z");

	/**
   * The '<em><b>POSITIVEX</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSITIVEX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #POSITIVEX
   * @model literal="POSITIVE_X"
   * @generated
   * @ordered
   */
	public static final int POSITIVEX_VALUE = 0;

	/**
   * The '<em><b>NEGATIVEX</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEGATIVEX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #NEGATIVEX
   * @model literal="NEGATIVE_X"
   * @generated
   * @ordered
   */
	public static final int NEGATIVEX_VALUE = 1;

	/**
   * The '<em><b>POSITIVEY</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSITIVEY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #POSITIVEY
   * @model literal="POSITIVE_Y"
   * @generated
   * @ordered
   */
	public static final int POSITIVEY_VALUE = 2;

	/**
   * The '<em><b>NEGATIVEY</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEGATIVEY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #NEGATIVEY
   * @model literal="NEGATIVE_Y"
   * @generated
   * @ordered
   */
	public static final int NEGATIVEY_VALUE = 3;

	/**
   * The '<em><b>POSITIVEZ</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSITIVEZ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #POSITIVEZ
   * @model literal="POSITIVE_Z"
   * @generated
   * @ordered
   */
	public static final int POSITIVEZ_VALUE = 4;

	/**
   * The '<em><b>NEGATIVEZ</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEGATIVEZ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #NEGATIVEZ
   * @model literal="NEGATIVE_Z"
   * @generated
   * @ordered
   */
	public static final int NEGATIVEZ_VALUE = 5;

	/**
   * An array of all the '<em><b>Fx Surface Face Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final FxSurfaceFaceEnum[] VALUES_ARRAY =
		new FxSurfaceFaceEnum[]
    {
      POSITIVEX,
      NEGATIVEX,
      POSITIVEY,
      NEGATIVEY,
      POSITIVEZ,
      NEGATIVEZ,
    };

	/**
   * A public read-only list of all the '<em><b>Fx Surface Face Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<FxSurfaceFaceEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Fx Surface Face Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSurfaceFaceEnum get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxSurfaceFaceEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Surface Face Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSurfaceFaceEnum getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxSurfaceFaceEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Surface Face Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSurfaceFaceEnum get(int value) {
    switch (value)
    {
      case POSITIVEX_VALUE: return POSITIVEX;
      case NEGATIVEX_VALUE: return NEGATIVEX;
      case POSITIVEY_VALUE: return POSITIVEY;
      case NEGATIVEY_VALUE: return NEGATIVEY;
      case POSITIVEZ_VALUE: return POSITIVEZ;
      case NEGATIVEZ_VALUE: return NEGATIVEZ;
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
	private FxSurfaceFaceEnum(int value, String name, String literal) {
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
	
} //FxSurfaceFaceEnum
