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
 * A representation of the literals of the enumeration '<em><b>Fx Sampler Filter Common</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getFxSamplerFilterCommon()
 * @model extendedMetaData="name='fx_sampler_filter_common'"
 * @generated
 */
public enum FxSamplerFilterCommon implements Enumerator {
	/**
   * The '<em><b>NONE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NONE_VALUE
   * @generated
   * @ordered
   */
	NONE(0, "NONE", "NONE"),

	/**
   * The '<em><b>NEAREST</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NEAREST_VALUE
   * @generated
   * @ordered
   */
	NEAREST(1, "NEAREST", "NEAREST"),

	/**
   * The '<em><b>LINEAR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #LINEAR_VALUE
   * @generated
   * @ordered
   */
	LINEAR(2, "LINEAR", "LINEAR"),

	/**
   * The '<em><b>NEARESTMIPMAPNEAREST</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NEARESTMIPMAPNEAREST_VALUE
   * @generated
   * @ordered
   */
	NEARESTMIPMAPNEAREST(3, "NEARESTMIPMAPNEAREST", "NEAREST_MIPMAP_NEAREST"),

	/**
   * The '<em><b>LINEARMIPMAPNEAREST</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #LINEARMIPMAPNEAREST_VALUE
   * @generated
   * @ordered
   */
	LINEARMIPMAPNEAREST(4, "LINEARMIPMAPNEAREST", "LINEAR_MIPMAP_NEAREST"),

	/**
   * The '<em><b>NEARESTMIPMAPLINEAR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NEARESTMIPMAPLINEAR_VALUE
   * @generated
   * @ordered
   */
	NEARESTMIPMAPLINEAR(5, "NEARESTMIPMAPLINEAR", "NEAREST_MIPMAP_LINEAR"),

	/**
   * The '<em><b>LINEARMIPMAPLINEAR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #LINEARMIPMAPLINEAR_VALUE
   * @generated
   * @ordered
   */
	LINEARMIPMAPLINEAR(6, "LINEARMIPMAPLINEAR", "LINEAR_MIPMAP_LINEAR");

	/**
   * The '<em><b>NONE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #NONE
   * @model
   * @generated
   * @ordered
   */
	public static final int NONE_VALUE = 0;

	/**
   * The '<em><b>NEAREST</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEAREST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #NEAREST
   * @model
   * @generated
   * @ordered
   */
	public static final int NEAREST_VALUE = 1;

	/**
   * The '<em><b>LINEAR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINEAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #LINEAR
   * @model
   * @generated
   * @ordered
   */
	public static final int LINEAR_VALUE = 2;

	/**
   * The '<em><b>NEARESTMIPMAPNEAREST</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEARESTMIPMAPNEAREST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #NEARESTMIPMAPNEAREST
   * @model literal="NEAREST_MIPMAP_NEAREST"
   * @generated
   * @ordered
   */
	public static final int NEARESTMIPMAPNEAREST_VALUE = 3;

	/**
   * The '<em><b>LINEARMIPMAPNEAREST</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINEARMIPMAPNEAREST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #LINEARMIPMAPNEAREST
   * @model literal="LINEAR_MIPMAP_NEAREST"
   * @generated
   * @ordered
   */
	public static final int LINEARMIPMAPNEAREST_VALUE = 4;

	/**
   * The '<em><b>NEARESTMIPMAPLINEAR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEARESTMIPMAPLINEAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #NEARESTMIPMAPLINEAR
   * @model literal="NEAREST_MIPMAP_LINEAR"
   * @generated
   * @ordered
   */
	public static final int NEARESTMIPMAPLINEAR_VALUE = 5;

	/**
   * The '<em><b>LINEARMIPMAPLINEAR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINEARMIPMAPLINEAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #LINEARMIPMAPLINEAR
   * @model literal="LINEAR_MIPMAP_LINEAR"
   * @generated
   * @ordered
   */
	public static final int LINEARMIPMAPLINEAR_VALUE = 6;

	/**
   * An array of all the '<em><b>Fx Sampler Filter Common</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final FxSamplerFilterCommon[] VALUES_ARRAY =
		new FxSamplerFilterCommon[]
    {
      NONE,
      NEAREST,
      LINEAR,
      NEARESTMIPMAPNEAREST,
      LINEARMIPMAPNEAREST,
      NEARESTMIPMAPLINEAR,
      LINEARMIPMAPLINEAR,
    };

	/**
   * A public read-only list of all the '<em><b>Fx Sampler Filter Common</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<FxSamplerFilterCommon> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Fx Sampler Filter Common</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSamplerFilterCommon get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxSamplerFilterCommon result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Sampler Filter Common</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSamplerFilterCommon getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxSamplerFilterCommon result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Sampler Filter Common</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSamplerFilterCommon get(int value) {
    switch (value)
    {
      case NONE_VALUE: return NONE;
      case NEAREST_VALUE: return NEAREST;
      case LINEAR_VALUE: return LINEAR;
      case NEARESTMIPMAPNEAREST_VALUE: return NEARESTMIPMAPNEAREST;
      case LINEARMIPMAPNEAREST_VALUE: return LINEARMIPMAPNEAREST;
      case NEARESTMIPMAPLINEAR_VALUE: return NEARESTMIPMAPLINEAR;
      case LINEARMIPMAPLINEAR_VALUE: return LINEARMIPMAPLINEAR;
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
	private FxSamplerFilterCommon(int value, String name, String literal) {
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
	
} //FxSamplerFilterCommon
