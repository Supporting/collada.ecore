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
 * A representation of the literals of the enumeration '<em><b>Gles Texcombiner Source Enums</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getGlesTexcombinerSourceEnums()
 * @model extendedMetaData="name='gles_texcombiner_source_enums'"
 * @generated
 */
public enum GlesTexcombinerSourceEnums implements Enumerator {
	/**
   * The '<em><b>TEXTURE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #TEXTURE_VALUE
   * @generated
   * @ordered
   */
	TEXTURE(0, "TEXTURE", "TEXTURE"),

	/**
   * The '<em><b>CONSTANT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #CONSTANT_VALUE
   * @generated
   * @ordered
   */
	CONSTANT(1, "CONSTANT", "CONSTANT"),

	/**
   * The '<em><b>PRIMARY</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #PRIMARY_VALUE
   * @generated
   * @ordered
   */
	PRIMARY(2, "PRIMARY", "PRIMARY"),

	/**
   * The '<em><b>PREVIOUS</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #PREVIOUS_VALUE
   * @generated
   * @ordered
   */
	PREVIOUS(3, "PREVIOUS", "PREVIOUS");

	/**
   * The '<em><b>TEXTURE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXTURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #TEXTURE
   * @model
   * @generated
   * @ordered
   */
	public static final int TEXTURE_VALUE = 0;

	/**
   * The '<em><b>CONSTANT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONSTANT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #CONSTANT
   * @model
   * @generated
   * @ordered
   */
	public static final int CONSTANT_VALUE = 1;

	/**
   * The '<em><b>PRIMARY</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRIMARY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #PRIMARY
   * @model
   * @generated
   * @ordered
   */
	public static final int PRIMARY_VALUE = 2;

	/**
   * The '<em><b>PREVIOUS</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PREVIOUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #PREVIOUS
   * @model
   * @generated
   * @ordered
   */
	public static final int PREVIOUS_VALUE = 3;

	/**
   * An array of all the '<em><b>Gles Texcombiner Source Enums</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final GlesTexcombinerSourceEnums[] VALUES_ARRAY =
		new GlesTexcombinerSourceEnums[]
    {
      TEXTURE,
      CONSTANT,
      PRIMARY,
      PREVIOUS,
    };

	/**
   * A public read-only list of all the '<em><b>Gles Texcombiner Source Enums</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<GlesTexcombinerSourceEnums> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Gles Texcombiner Source Enums</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesTexcombinerSourceEnums get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlesTexcombinerSourceEnums result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gles Texcombiner Source Enums</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesTexcombinerSourceEnums getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlesTexcombinerSourceEnums result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gles Texcombiner Source Enums</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesTexcombinerSourceEnums get(int value) {
    switch (value)
    {
      case TEXTURE_VALUE: return TEXTURE;
      case CONSTANT_VALUE: return CONSTANT;
      case PRIMARY_VALUE: return PRIMARY;
      case PREVIOUS_VALUE: return PREVIOUS;
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
	private GlesTexcombinerSourceEnums(int value, String name, String literal) {
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
	
} //GlesTexcombinerSourceEnums
