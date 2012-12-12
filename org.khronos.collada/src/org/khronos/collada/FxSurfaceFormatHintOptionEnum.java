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
 * A representation of the literals of the enumeration '<em><b>Fx Surface Format Hint Option Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Additional hints about data relationships and other things to help the application pick the best format.
 * <!-- end-model-doc -->
 * @see org.khronos.collada.ColladaPackage#getFxSurfaceFormatHintOptionEnum()
 * @model extendedMetaData="name='fx_surface_format_hint_option_enum'"
 * @generated
 */
public enum FxSurfaceFormatHintOptionEnum implements Enumerator {
	/**
   * The '<em><b>SRGBGAMMA</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SRGBGAMMA_VALUE
   * @generated
   * @ordered
   */
	SRGBGAMMA(0, "SRGBGAMMA", "SRGB_GAMMA"),

	/**
   * The '<em><b>NORMALIZED3</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NORMALIZED3_VALUE
   * @generated
   * @ordered
   */
	NORMALIZED3(1, "NORMALIZED3", "NORMALIZED3"),

	/**
   * The '<em><b>NORMALIZED4</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NORMALIZED4_VALUE
   * @generated
   * @ordered
   */
	NORMALIZED4(2, "NORMALIZED4", "NORMALIZED4"),

	/**
   * The '<em><b>COMPRESSABLE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #COMPRESSABLE_VALUE
   * @generated
   * @ordered
   */
	COMPRESSABLE(3, "COMPRESSABLE", "COMPRESSABLE");

	/**
   * The '<em><b>SRGBGAMMA</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * colors are stored with respect to the sRGB 2.2 gamma curve rather than linear
   * <!-- end-model-doc -->
   * @see #SRGBGAMMA
   * @model literal="SRGB_GAMMA"
   * @generated
   * @ordered
   */
	public static final int SRGBGAMMA_VALUE = 0;

	/**
   * The '<em><b>NORMALIZED3</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * the texel's XYZ/RGB should be normalized such as in a normal map.
   * <!-- end-model-doc -->
   * @see #NORMALIZED3
   * @model
   * @generated
   * @ordered
   */
	public static final int NORMALIZED3_VALUE = 1;

	/**
   * The '<em><b>NORMALIZED4</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * the texel's XYZW/RGBA should be normalized such as in a normal map.
   * <!-- end-model-doc -->
   * @see #NORMALIZED4
   * @model
   * @generated
   * @ordered
   */
	public static final int NORMALIZED4_VALUE = 2;

	/**
   * The '<em><b>COMPRESSABLE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The surface may use run-time compression.  Considering the best compression based on desired, channel, range, precision, and options 
   * <!-- end-model-doc -->
   * @see #COMPRESSABLE
   * @model
   * @generated
   * @ordered
   */
	public static final int COMPRESSABLE_VALUE = 3;

	/**
   * An array of all the '<em><b>Fx Surface Format Hint Option Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final FxSurfaceFormatHintOptionEnum[] VALUES_ARRAY =
		new FxSurfaceFormatHintOptionEnum[]
    {
      SRGBGAMMA,
      NORMALIZED3,
      NORMALIZED4,
      COMPRESSABLE,
    };

	/**
   * A public read-only list of all the '<em><b>Fx Surface Format Hint Option Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<FxSurfaceFormatHintOptionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Fx Surface Format Hint Option Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSurfaceFormatHintOptionEnum get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxSurfaceFormatHintOptionEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Surface Format Hint Option Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSurfaceFormatHintOptionEnum getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxSurfaceFormatHintOptionEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Surface Format Hint Option Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSurfaceFormatHintOptionEnum get(int value) {
    switch (value)
    {
      case SRGBGAMMA_VALUE: return SRGBGAMMA;
      case NORMALIZED3_VALUE: return NORMALIZED3;
      case NORMALIZED4_VALUE: return NORMALIZED4;
      case COMPRESSABLE_VALUE: return COMPRESSABLE;
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
	private FxSurfaceFormatHintOptionEnum(int value, String name, String literal) {
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
	
} //FxSurfaceFormatHintOptionEnum
