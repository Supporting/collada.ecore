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
 * A representation of the literals of the enumeration '<em><b>Fx Surface Format Hint Channels Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The per-texel layout of the format.  The length of the string indicate how many channels there are and the letter respresents the name of the channel.  There are typically 0 to 4 channels.
 * <!-- end-model-doc -->
 * @see org.khronos.collada.ColladaPackage#getFxSurfaceFormatHintChannelsEnum()
 * @model extendedMetaData="name='fx_surface_format_hint_channels_enum'"
 * @generated
 */
public enum FxSurfaceFormatHintChannelsEnum implements Enumerator {
	/**
   * The '<em><b>RGB</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #RGB_VALUE
   * @generated
   * @ordered
   */
	RGB(0, "RGB", "RGB"),

	/**
   * The '<em><b>RGBA</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #RGBA_VALUE
   * @generated
   * @ordered
   */
	RGBA(1, "RGBA", "RGBA"),

	/**
   * The '<em><b>L</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #L_VALUE
   * @generated
   * @ordered
   */
	L(2, "L", "L"),

	/**
   * The '<em><b>LA</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #LA_VALUE
   * @generated
   * @ordered
   */
	LA(3, "LA", "LA"),

	/**
   * The '<em><b>D</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #D_VALUE
   * @generated
   * @ordered
   */
	D(4, "D", "D"),

	/**
   * The '<em><b>XYZ</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #XYZ_VALUE
   * @generated
   * @ordered
   */
	XYZ(5, "XYZ", "XYZ"),

	/**
   * The '<em><b>XYZW</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #XYZW_VALUE
   * @generated
   * @ordered
   */
	XYZW(6, "XYZW", "XYZW");

	/**
   * The '<em><b>RGB</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * RGB color  map
   * <!-- end-model-doc -->
   * @see #RGB
   * @model
   * @generated
   * @ordered
   */
	public static final int RGB_VALUE = 0;

	/**
   * The '<em><b>RGBA</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * RGB color + Alpha map often used for color + transparency or other things packed into channel A like specular power 
   * <!-- end-model-doc -->
   * @see #RGBA
   * @model
   * @generated
   * @ordered
   */
	public static final int RGBA_VALUE = 1;

	/**
   * The '<em><b>L</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Luminance map often used for light mapping 
   * <!-- end-model-doc -->
   * @see #L
   * @model
   * @generated
   * @ordered
   */
	public static final int L_VALUE = 2;

	/**
   * The '<em><b>LA</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Luminance+Alpha map often used for light mapping 
   * <!-- end-model-doc -->
   * @see #LA
   * @model
   * @generated
   * @ordered
   */
	public static final int LA_VALUE = 3;

	/**
   * The '<em><b>D</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Depth map often used for displacement, parellax, relief, or shadow mapping 
   * <!-- end-model-doc -->
   * @see #D
   * @model
   * @generated
   * @ordered
   */
	public static final int D_VALUE = 4;

	/**
   * The '<em><b>XYZ</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Typically used for normal maps or 3component displacement maps.
   * <!-- end-model-doc -->
   * @see #XYZ
   * @model
   * @generated
   * @ordered
   */
	public static final int XYZ_VALUE = 5;

	/**
   * The '<em><b>XYZW</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Typically used for normal maps where W is the depth for relief or parrallax mapping 
   * <!-- end-model-doc -->
   * @see #XYZW
   * @model
   * @generated
   * @ordered
   */
	public static final int XYZW_VALUE = 6;

	/**
   * An array of all the '<em><b>Fx Surface Format Hint Channels Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final FxSurfaceFormatHintChannelsEnum[] VALUES_ARRAY =
		new FxSurfaceFormatHintChannelsEnum[]
    {
      RGB,
      RGBA,
      L,
      LA,
      D,
      XYZ,
      XYZW,
    };

	/**
   * A public read-only list of all the '<em><b>Fx Surface Format Hint Channels Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<FxSurfaceFormatHintChannelsEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Fx Surface Format Hint Channels Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSurfaceFormatHintChannelsEnum get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxSurfaceFormatHintChannelsEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Surface Format Hint Channels Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSurfaceFormatHintChannelsEnum getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxSurfaceFormatHintChannelsEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Surface Format Hint Channels Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSurfaceFormatHintChannelsEnum get(int value) {
    switch (value)
    {
      case RGB_VALUE: return RGB;
      case RGBA_VALUE: return RGBA;
      case L_VALUE: return L;
      case LA_VALUE: return LA;
      case D_VALUE: return D;
      case XYZ_VALUE: return XYZ;
      case XYZW_VALUE: return XYZW;
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
	private FxSurfaceFormatHintChannelsEnum(int value, String name, String literal) {
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
	
} //FxSurfaceFormatHintChannelsEnum
