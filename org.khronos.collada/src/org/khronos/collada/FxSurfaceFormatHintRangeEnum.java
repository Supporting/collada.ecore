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
 * A representation of the literals of the enumeration '<em><b>Fx Surface Format Hint Range Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Each channel represents a range of values. Some example ranges are signed or unsigned integers, or between between a clamped range such as 0.0f to 1.0f, or high dynamic range via floating point
 * <!-- end-model-doc -->
 * @see org.khronos.collada.ColladaPackage#getFxSurfaceFormatHintRangeEnum()
 * @model extendedMetaData="name='fx_surface_format_hint_range_enum'"
 * @generated
 */
public enum FxSurfaceFormatHintRangeEnum implements Enumerator {
	/**
   * The '<em><b>SNORM</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SNORM_VALUE
   * @generated
   * @ordered
   */
	SNORM(0, "SNORM", "SNORM"),

	/**
   * The '<em><b>UNORM</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #UNORM_VALUE
   * @generated
   * @ordered
   */
	UNORM(1, "UNORM", "UNORM"),

	/**
   * The '<em><b>SINT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SINT_VALUE
   * @generated
   * @ordered
   */
	SINT(2, "SINT", "SINT"),

	/**
   * The '<em><b>UINT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #UINT_VALUE
   * @generated
   * @ordered
   */
	UINT(3, "UINT", "UINT"),

	/**
   * The '<em><b>FLOAT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #FLOAT_VALUE
   * @generated
   * @ordered
   */
	FLOAT(4, "FLOAT", "FLOAT");

	/**
   * The '<em><b>SNORM</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Format is representing a decimal value that remains within the -1 to 1 range. Implimentation could be integer-fixedpoint or floats.
   * <!-- end-model-doc -->
   * @see #SNORM
   * @model
   * @generated
   * @ordered
   */
	public static final int SNORM_VALUE = 0;

	/**
   * The '<em><b>UNORM</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Format is representing a decimal value that remains within the 0 to 1 range. Implimentation could be integer-fixedpoint or floats.
   * <!-- end-model-doc -->
   * @see #UNORM
   * @model
   * @generated
   * @ordered
   */
	public static final int UNORM_VALUE = 1;

	/**
   * The '<em><b>SINT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Format is representing signed integer numbers.  (ex. 8bits = -128 to 127)
   * <!-- end-model-doc -->
   * @see #SINT
   * @model
   * @generated
   * @ordered
   */
	public static final int SINT_VALUE = 2;

	/**
   * The '<em><b>UINT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Format is representing unsigned integer numbers.  (ex. 8bits = 0 to 255)
   * <!-- end-model-doc -->
   * @see #UINT
   * @model
   * @generated
   * @ordered
   */
	public static final int UINT_VALUE = 3;

	/**
   * The '<em><b>FLOAT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Format should support full floating point ranges.  High precision is expected to be 32bit. Mid precision may be 16 to 32 bit.  Low precision is expected to be 16 bit.
   * <!-- end-model-doc -->
   * @see #FLOAT
   * @model
   * @generated
   * @ordered
   */
	public static final int FLOAT_VALUE = 4;

	/**
   * An array of all the '<em><b>Fx Surface Format Hint Range Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final FxSurfaceFormatHintRangeEnum[] VALUES_ARRAY =
		new FxSurfaceFormatHintRangeEnum[]
    {
      SNORM,
      UNORM,
      SINT,
      UINT,
      FLOAT,
    };

	/**
   * A public read-only list of all the '<em><b>Fx Surface Format Hint Range Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<FxSurfaceFormatHintRangeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Fx Surface Format Hint Range Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSurfaceFormatHintRangeEnum get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxSurfaceFormatHintRangeEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Surface Format Hint Range Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSurfaceFormatHintRangeEnum getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxSurfaceFormatHintRangeEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Surface Format Hint Range Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSurfaceFormatHintRangeEnum get(int value) {
    switch (value)
    {
      case SNORM_VALUE: return SNORM;
      case UNORM_VALUE: return UNORM;
      case SINT_VALUE: return SINT;
      case UINT_VALUE: return UINT;
      case FLOAT_VALUE: return FLOAT;
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
	private FxSurfaceFormatHintRangeEnum(int value, String name, String literal) {
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
	
} //FxSurfaceFormatHintRangeEnum
