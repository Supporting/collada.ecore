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
 * A representation of the literals of the enumeration '<em><b>Fx Opaque Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getFxOpaqueEnum()
 * @model extendedMetaData="name='fx_opaque_enum'"
 * @generated
 */
public enum FxOpaqueEnum implements Enumerator {
	/**
   * The '<em><b>AONE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #AONE_VALUE
   * @generated
   * @ordered
   */
	AONE(0, "AONE", "A_ONE"),

	/**
   * The '<em><b>RGBZERO</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #RGBZERO_VALUE
   * @generated
   * @ordered
   */
	RGBZERO(1, "RGBZERO", "RGB_ZERO");

	/**
   * The '<em><b>AONE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						When a transparent opaque attribute is set to A_ONE, it means the transparency information will be taken from the alpha channel of the color, texture, or parameter supplying the value. The value of 1.0 is opaque in this mode.
   * 					
   * <!-- end-model-doc -->
   * @see #AONE
   * @model literal="A_ONE"
   * @generated
   * @ordered
   */
	public static final int AONE_VALUE = 0;

	/**
   * The '<em><b>RGBZERO</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						When a transparent opaque attribute is set to RGB_ZERO, it means the transparency information will be taken from the red, green, and blue channels of the color, texture, or parameter supplying the value. Each channel is modulated independently. The value of 0.0 is opaque in this mode.
   * 					
   * <!-- end-model-doc -->
   * @see #RGBZERO
   * @model literal="RGB_ZERO"
   * @generated
   * @ordered
   */
	public static final int RGBZERO_VALUE = 1;

	/**
   * An array of all the '<em><b>Fx Opaque Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final FxOpaqueEnum[] VALUES_ARRAY =
		new FxOpaqueEnum[]
    {
      AONE,
      RGBZERO,
    };

	/**
   * A public read-only list of all the '<em><b>Fx Opaque Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<FxOpaqueEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Fx Opaque Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxOpaqueEnum get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxOpaqueEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Opaque Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxOpaqueEnum getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxOpaqueEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Opaque Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxOpaqueEnum get(int value) {
    switch (value)
    {
      case AONE_VALUE: return AONE;
      case RGBZERO_VALUE: return RGBZERO;
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
	private FxOpaqueEnum(int value, String name, String literal) {
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
	
} //FxOpaqueEnum
