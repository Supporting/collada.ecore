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
 * A representation of the literals of the enumeration '<em><b>Gl Blend Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getGlBlendType()
 * @model extendedMetaData="name='gl_blend_type'"
 * @generated
 */
public enum GlBlendType implements Enumerator {
	/**
   * The '<em><b>ZERO</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ZERO_VALUE
   * @generated
   * @ordered
   */
	ZERO(0, "ZERO", "ZERO"),

	/**
   * The '<em><b>ONE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ONE_VALUE
   * @generated
   * @ordered
   */
	ONE(1, "ONE", "ONE"),

	/**
   * The '<em><b>SRCCOLOR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SRCCOLOR_VALUE
   * @generated
   * @ordered
   */
	SRCCOLOR(2, "SRCCOLOR", "SRC_COLOR"),

	/**
   * The '<em><b>ONEMINUSSRCCOLOR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ONEMINUSSRCCOLOR_VALUE
   * @generated
   * @ordered
   */
	ONEMINUSSRCCOLOR(3, "ONEMINUSSRCCOLOR", "ONE_MINUS_SRC_COLOR"),

	/**
   * The '<em><b>DESTCOLOR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #DESTCOLOR_VALUE
   * @generated
   * @ordered
   */
	DESTCOLOR(4, "DESTCOLOR", "DEST_COLOR"),

	/**
   * The '<em><b>ONEMINUSDESTCOLOR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ONEMINUSDESTCOLOR_VALUE
   * @generated
   * @ordered
   */
	ONEMINUSDESTCOLOR(5, "ONEMINUSDESTCOLOR", "ONE_MINUS_DEST_COLOR"),

	/**
   * The '<em><b>SRCALPHA</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SRCALPHA_VALUE
   * @generated
   * @ordered
   */
	SRCALPHA(6, "SRCALPHA", "SRC_ALPHA"),

	/**
   * The '<em><b>ONEMINUSSRCALPHA</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ONEMINUSSRCALPHA_VALUE
   * @generated
   * @ordered
   */
	ONEMINUSSRCALPHA(7, "ONEMINUSSRCALPHA", "ONE_MINUS_SRC_ALPHA"),

	/**
   * The '<em><b>DSTALPHA</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #DSTALPHA_VALUE
   * @generated
   * @ordered
   */
	DSTALPHA(8, "DSTALPHA", "DST_ALPHA"),

	/**
   * The '<em><b>ONEMINUSDSTALPHA</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ONEMINUSDSTALPHA_VALUE
   * @generated
   * @ordered
   */
	ONEMINUSDSTALPHA(9, "ONEMINUSDSTALPHA", "ONE_MINUS_DST_ALPHA"),

	/**
   * The '<em><b>CONSTANTCOLOR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #CONSTANTCOLOR_VALUE
   * @generated
   * @ordered
   */
	CONSTANTCOLOR(10, "CONSTANTCOLOR", "CONSTANT_COLOR"),

	/**
   * The '<em><b>ONEMINUSCONSTANTCOLOR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ONEMINUSCONSTANTCOLOR_VALUE
   * @generated
   * @ordered
   */
	ONEMINUSCONSTANTCOLOR(11, "ONEMINUSCONSTANTCOLOR", "ONE_MINUS_CONSTANT_COLOR"),

	/**
   * The '<em><b>CONSTANTALPHA</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #CONSTANTALPHA_VALUE
   * @generated
   * @ordered
   */
	CONSTANTALPHA(12, "CONSTANTALPHA", "CONSTANT_ALPHA"),

	/**
   * The '<em><b>ONEMINUSCONSTANTALPHA</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ONEMINUSCONSTANTALPHA_VALUE
   * @generated
   * @ordered
   */
	ONEMINUSCONSTANTALPHA(13, "ONEMINUSCONSTANTALPHA", "ONE_MINUS_CONSTANT_ALPHA"),

	/**
   * The '<em><b>SRCALPHASATURATE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SRCALPHASATURATE_VALUE
   * @generated
   * @ordered
   */
	SRCALPHASATURATE(14, "SRCALPHASATURATE", "SRC_ALPHA_SATURATE");

	/**
   * The '<em><b>ZERO</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZERO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ZERO
   * @model
   * @generated
   * @ordered
   */
	public static final int ZERO_VALUE = 0;

	/**
   * The '<em><b>ONE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ONE
   * @model
   * @generated
   * @ordered
   */
	public static final int ONE_VALUE = 1;

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
	public static final int SRCCOLOR_VALUE = 2;

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
	public static final int ONEMINUSSRCCOLOR_VALUE = 3;

	/**
   * The '<em><b>DESTCOLOR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DESTCOLOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #DESTCOLOR
   * @model literal="DEST_COLOR"
   * @generated
   * @ordered
   */
	public static final int DESTCOLOR_VALUE = 4;

	/**
   * The '<em><b>ONEMINUSDESTCOLOR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONEMINUSDESTCOLOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ONEMINUSDESTCOLOR
   * @model literal="ONE_MINUS_DEST_COLOR"
   * @generated
   * @ordered
   */
	public static final int ONEMINUSDESTCOLOR_VALUE = 5;

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
	public static final int SRCALPHA_VALUE = 6;

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
	public static final int ONEMINUSSRCALPHA_VALUE = 7;

	/**
   * The '<em><b>DSTALPHA</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DSTALPHA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #DSTALPHA
   * @model literal="DST_ALPHA"
   * @generated
   * @ordered
   */
	public static final int DSTALPHA_VALUE = 8;

	/**
   * The '<em><b>ONEMINUSDSTALPHA</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONEMINUSDSTALPHA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ONEMINUSDSTALPHA
   * @model literal="ONE_MINUS_DST_ALPHA"
   * @generated
   * @ordered
   */
	public static final int ONEMINUSDSTALPHA_VALUE = 9;

	/**
   * The '<em><b>CONSTANTCOLOR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONSTANTCOLOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #CONSTANTCOLOR
   * @model literal="CONSTANT_COLOR"
   * @generated
   * @ordered
   */
	public static final int CONSTANTCOLOR_VALUE = 10;

	/**
   * The '<em><b>ONEMINUSCONSTANTCOLOR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONEMINUSCONSTANTCOLOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ONEMINUSCONSTANTCOLOR
   * @model literal="ONE_MINUS_CONSTANT_COLOR"
   * @generated
   * @ordered
   */
	public static final int ONEMINUSCONSTANTCOLOR_VALUE = 11;

	/**
   * The '<em><b>CONSTANTALPHA</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONSTANTALPHA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #CONSTANTALPHA
   * @model literal="CONSTANT_ALPHA"
   * @generated
   * @ordered
   */
	public static final int CONSTANTALPHA_VALUE = 12;

	/**
   * The '<em><b>ONEMINUSCONSTANTALPHA</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONEMINUSCONSTANTALPHA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ONEMINUSCONSTANTALPHA
   * @model literal="ONE_MINUS_CONSTANT_ALPHA"
   * @generated
   * @ordered
   */
	public static final int ONEMINUSCONSTANTALPHA_VALUE = 13;

	/**
   * The '<em><b>SRCALPHASATURATE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SRCALPHASATURATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #SRCALPHASATURATE
   * @model literal="SRC_ALPHA_SATURATE"
   * @generated
   * @ordered
   */
	public static final int SRCALPHASATURATE_VALUE = 14;

	/**
   * An array of all the '<em><b>Gl Blend Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final GlBlendType[] VALUES_ARRAY =
		new GlBlendType[]
    {
      ZERO,
      ONE,
      SRCCOLOR,
      ONEMINUSSRCCOLOR,
      DESTCOLOR,
      ONEMINUSDESTCOLOR,
      SRCALPHA,
      ONEMINUSSRCALPHA,
      DSTALPHA,
      ONEMINUSDSTALPHA,
      CONSTANTCOLOR,
      ONEMINUSCONSTANTCOLOR,
      CONSTANTALPHA,
      ONEMINUSCONSTANTALPHA,
      SRCALPHASATURATE,
    };

	/**
   * A public read-only list of all the '<em><b>Gl Blend Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<GlBlendType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Gl Blend Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlBlendType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlBlendType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gl Blend Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlBlendType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlBlendType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gl Blend Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlBlendType get(int value) {
    switch (value)
    {
      case ZERO_VALUE: return ZERO;
      case ONE_VALUE: return ONE;
      case SRCCOLOR_VALUE: return SRCCOLOR;
      case ONEMINUSSRCCOLOR_VALUE: return ONEMINUSSRCCOLOR;
      case DESTCOLOR_VALUE: return DESTCOLOR;
      case ONEMINUSDESTCOLOR_VALUE: return ONEMINUSDESTCOLOR;
      case SRCALPHA_VALUE: return SRCALPHA;
      case ONEMINUSSRCALPHA_VALUE: return ONEMINUSSRCALPHA;
      case DSTALPHA_VALUE: return DSTALPHA;
      case ONEMINUSDSTALPHA_VALUE: return ONEMINUSDSTALPHA;
      case CONSTANTCOLOR_VALUE: return CONSTANTCOLOR;
      case ONEMINUSCONSTANTCOLOR_VALUE: return ONEMINUSCONSTANTCOLOR;
      case CONSTANTALPHA_VALUE: return CONSTANTALPHA;
      case ONEMINUSCONSTANTALPHA_VALUE: return ONEMINUSCONSTANTALPHA;
      case SRCALPHASATURATE_VALUE: return SRCALPHASATURATE;
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
	private GlBlendType(int value, String name, String literal) {
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
	
} //GlBlendType
