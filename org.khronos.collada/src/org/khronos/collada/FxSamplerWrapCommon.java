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
 * A representation of the literals of the enumeration '<em><b>Fx Sampler Wrap Common</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getFxSamplerWrapCommon()
 * @model extendedMetaData="name='fx_sampler_wrap_common'"
 * @generated
 */
public enum FxSamplerWrapCommon implements Enumerator {
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
   * The '<em><b>WRAP</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #WRAP_VALUE
   * @generated
   * @ordered
   */
	WRAP(1, "WRAP", "WRAP"),

	/**
   * The '<em><b>MIRROR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #MIRROR_VALUE
   * @generated
   * @ordered
   */
	MIRROR(2, "MIRROR", "MIRROR"),

	/**
   * The '<em><b>CLAMP</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #CLAMP_VALUE
   * @generated
   * @ordered
   */
	CLAMP(3, "CLAMP", "CLAMP"),

	/**
   * The '<em><b>BORDER</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #BORDER_VALUE
   * @generated
   * @ordered
   */
	BORDER(4, "BORDER", "BORDER");

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
   * The '<em><b>WRAP</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WRAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #WRAP
   * @model
   * @generated
   * @ordered
   */
	public static final int WRAP_VALUE = 1;

	/**
   * The '<em><b>MIRROR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIRROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #MIRROR
   * @model
   * @generated
   * @ordered
   */
	public static final int MIRROR_VALUE = 2;

	/**
   * The '<em><b>CLAMP</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLAMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #CLAMP
   * @model
   * @generated
   * @ordered
   */
	public static final int CLAMP_VALUE = 3;

	/**
   * The '<em><b>BORDER</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BORDER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #BORDER
   * @model
   * @generated
   * @ordered
   */
	public static final int BORDER_VALUE = 4;

	/**
   * An array of all the '<em><b>Fx Sampler Wrap Common</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final FxSamplerWrapCommon[] VALUES_ARRAY =
		new FxSamplerWrapCommon[]
    {
      NONE,
      WRAP,
      MIRROR,
      CLAMP,
      BORDER,
    };

	/**
   * A public read-only list of all the '<em><b>Fx Sampler Wrap Common</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<FxSamplerWrapCommon> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Fx Sampler Wrap Common</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSamplerWrapCommon get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxSamplerWrapCommon result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Sampler Wrap Common</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSamplerWrapCommon getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxSamplerWrapCommon result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Sampler Wrap Common</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSamplerWrapCommon get(int value) {
    switch (value)
    {
      case NONE_VALUE: return NONE;
      case WRAP_VALUE: return WRAP;
      case MIRROR_VALUE: return MIRROR;
      case CLAMP_VALUE: return CLAMP;
      case BORDER_VALUE: return BORDER;
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
	private FxSamplerWrapCommon(int value, String name, String literal) {
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
	
} //FxSamplerWrapCommon
