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
 * A representation of the literals of the enumeration '<em><b>Gl Material Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getGlMaterialType()
 * @model extendedMetaData="name='gl_material_type'"
 * @generated
 */
public enum GlMaterialType implements Enumerator {
	/**
   * The '<em><b>EMISSION</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #EMISSION_VALUE
   * @generated
   * @ordered
   */
	EMISSION(0, "EMISSION", "EMISSION"),

	/**
   * The '<em><b>AMBIENT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #AMBIENT_VALUE
   * @generated
   * @ordered
   */
	AMBIENT(1, "AMBIENT", "AMBIENT"),

	/**
   * The '<em><b>DIFFUSE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #DIFFUSE_VALUE
   * @generated
   * @ordered
   */
	DIFFUSE(2, "DIFFUSE", "DIFFUSE"),

	/**
   * The '<em><b>SPECULAR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SPECULAR_VALUE
   * @generated
   * @ordered
   */
	SPECULAR(3, "SPECULAR", "SPECULAR"),

	/**
   * The '<em><b>AMBIENTANDDIFFUSE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #AMBIENTANDDIFFUSE_VALUE
   * @generated
   * @ordered
   */
	AMBIENTANDDIFFUSE(4, "AMBIENTANDDIFFUSE", "AMBIENT_AND_DIFFUSE");

	/**
   * The '<em><b>EMISSION</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EMISSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #EMISSION
   * @model
   * @generated
   * @ordered
   */
	public static final int EMISSION_VALUE = 0;

	/**
   * The '<em><b>AMBIENT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AMBIENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #AMBIENT
   * @model
   * @generated
   * @ordered
   */
	public static final int AMBIENT_VALUE = 1;

	/**
   * The '<em><b>DIFFUSE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIFFUSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #DIFFUSE
   * @model
   * @generated
   * @ordered
   */
	public static final int DIFFUSE_VALUE = 2;

	/**
   * The '<em><b>SPECULAR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPECULAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #SPECULAR
   * @model
   * @generated
   * @ordered
   */
	public static final int SPECULAR_VALUE = 3;

	/**
   * The '<em><b>AMBIENTANDDIFFUSE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AMBIENTANDDIFFUSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #AMBIENTANDDIFFUSE
   * @model literal="AMBIENT_AND_DIFFUSE"
   * @generated
   * @ordered
   */
	public static final int AMBIENTANDDIFFUSE_VALUE = 4;

	/**
   * An array of all the '<em><b>Gl Material Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final GlMaterialType[] VALUES_ARRAY =
		new GlMaterialType[]
    {
      EMISSION,
      AMBIENT,
      DIFFUSE,
      SPECULAR,
      AMBIENTANDDIFFUSE,
    };

	/**
   * A public read-only list of all the '<em><b>Gl Material Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<GlMaterialType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Gl Material Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlMaterialType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlMaterialType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gl Material Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlMaterialType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlMaterialType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gl Material Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlMaterialType get(int value) {
    switch (value)
    {
      case EMISSION_VALUE: return EMISSION;
      case AMBIENT_VALUE: return AMBIENT;
      case DIFFUSE_VALUE: return DIFFUSE;
      case SPECULAR_VALUE: return SPECULAR;
      case AMBIENTANDDIFFUSE_VALUE: return AMBIENTANDDIFFUSE;
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
	private GlMaterialType(int value, String name, String literal) {
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
	
} //GlMaterialType
