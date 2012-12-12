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
 * A representation of the literals of the enumeration '<em><b>Gles Texenv Mode Enums</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getGlesTexenvModeEnums()
 * @model extendedMetaData="name='gles_texenv_mode_enums'"
 * @generated
 */
public enum GlesTexenvModeEnums implements Enumerator {
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
   * The '<em><b>DECAL</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #DECAL_VALUE
   * @generated
   * @ordered
   */
	DECAL(2, "DECAL", "DECAL"),

	/**
   * The '<em><b>BLEND</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #BLEND_VALUE
   * @generated
   * @ordered
   */
	BLEND(3, "BLEND", "BLEND"),

	/**
   * The '<em><b>ADD</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ADD_VALUE
   * @generated
   * @ordered
   */
	ADD(4, "ADD", "ADD");

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
   * The '<em><b>DECAL</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DECAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #DECAL
   * @model
   * @generated
   * @ordered
   */
	public static final int DECAL_VALUE = 2;

	/**
   * The '<em><b>BLEND</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLEND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #BLEND
   * @model
   * @generated
   * @ordered
   */
	public static final int BLEND_VALUE = 3;

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
	public static final int ADD_VALUE = 4;

	/**
   * An array of all the '<em><b>Gles Texenv Mode Enums</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final GlesTexenvModeEnums[] VALUES_ARRAY =
		new GlesTexenvModeEnums[]
    {
      REPLACE,
      MODULATE,
      DECAL,
      BLEND,
      ADD,
    };

	/**
   * A public read-only list of all the '<em><b>Gles Texenv Mode Enums</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<GlesTexenvModeEnums> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Gles Texenv Mode Enums</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesTexenvModeEnums get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlesTexenvModeEnums result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gles Texenv Mode Enums</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesTexenvModeEnums getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlesTexenvModeEnums result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gles Texenv Mode Enums</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesTexenvModeEnums get(int value) {
    switch (value)
    {
      case REPLACE_VALUE: return REPLACE;
      case MODULATE_VALUE: return MODULATE;
      case DECAL_VALUE: return DECAL;
      case BLEND_VALUE: return BLEND;
      case ADD_VALUE: return ADD;
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
	private GlesTexenvModeEnums(int value, String name, String literal) {
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
	
} //GlesTexenvModeEnums
