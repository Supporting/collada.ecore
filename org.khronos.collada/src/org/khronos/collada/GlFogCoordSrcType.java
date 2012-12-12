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
 * A representation of the literals of the enumeration '<em><b>Gl Fog Coord Src Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getGlFogCoordSrcType()
 * @model extendedMetaData="name='gl_fog_coord_src_type'"
 * @generated
 */
public enum GlFogCoordSrcType implements Enumerator {
	/**
   * The '<em><b>FOGCOORDINATE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #FOGCOORDINATE_VALUE
   * @generated
   * @ordered
   */
	FOGCOORDINATE(0, "FOGCOORDINATE", "FOG_COORDINATE"),

	/**
   * The '<em><b>FRAGMENTDEPTH</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #FRAGMENTDEPTH_VALUE
   * @generated
   * @ordered
   */
	FRAGMENTDEPTH(1, "FRAGMENTDEPTH", "FRAGMENT_DEPTH");

	/**
   * The '<em><b>FOGCOORDINATE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FOGCOORDINATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #FOGCOORDINATE
   * @model literal="FOG_COORDINATE"
   * @generated
   * @ordered
   */
	public static final int FOGCOORDINATE_VALUE = 0;

	/**
   * The '<em><b>FRAGMENTDEPTH</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FRAGMENTDEPTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #FRAGMENTDEPTH
   * @model literal="FRAGMENT_DEPTH"
   * @generated
   * @ordered
   */
	public static final int FRAGMENTDEPTH_VALUE = 1;

	/**
   * An array of all the '<em><b>Gl Fog Coord Src Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final GlFogCoordSrcType[] VALUES_ARRAY =
		new GlFogCoordSrcType[]
    {
      FOGCOORDINATE,
      FRAGMENTDEPTH,
    };

	/**
   * A public read-only list of all the '<em><b>Gl Fog Coord Src Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<GlFogCoordSrcType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Gl Fog Coord Src Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlFogCoordSrcType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlFogCoordSrcType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gl Fog Coord Src Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlFogCoordSrcType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlFogCoordSrcType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gl Fog Coord Src Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlFogCoordSrcType get(int value) {
    switch (value)
    {
      case FOGCOORDINATE_VALUE: return FOGCOORDINATE;
      case FRAGMENTDEPTH_VALUE: return FRAGMENTDEPTH;
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
	private GlFogCoordSrcType(int value, String name, String literal) {
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
	
} //GlFogCoordSrcType
