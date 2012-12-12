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
 * A representation of the literals of the enumeration '<em><b>Gl Light Model Color Control Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getGlLightModelColorControlType()
 * @model extendedMetaData="name='gl_light_model_color_control_type'"
 * @generated
 */
public enum GlLightModelColorControlType implements Enumerator {
	/**
   * The '<em><b>SINGLECOLOR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SINGLECOLOR_VALUE
   * @generated
   * @ordered
   */
	SINGLECOLOR(0, "SINGLECOLOR", "SINGLE_COLOR"),

	/**
   * The '<em><b>SEPARATESPECULARCOLOR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SEPARATESPECULARCOLOR_VALUE
   * @generated
   * @ordered
   */
	SEPARATESPECULARCOLOR(1, "SEPARATESPECULARCOLOR", "SEPARATE_SPECULAR_COLOR");

	/**
   * The '<em><b>SINGLECOLOR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLECOLOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #SINGLECOLOR
   * @model literal="SINGLE_COLOR"
   * @generated
   * @ordered
   */
	public static final int SINGLECOLOR_VALUE = 0;

	/**
   * The '<em><b>SEPARATESPECULARCOLOR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEPARATESPECULARCOLOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #SEPARATESPECULARCOLOR
   * @model literal="SEPARATE_SPECULAR_COLOR"
   * @generated
   * @ordered
   */
	public static final int SEPARATESPECULARCOLOR_VALUE = 1;

	/**
   * An array of all the '<em><b>Gl Light Model Color Control Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final GlLightModelColorControlType[] VALUES_ARRAY =
		new GlLightModelColorControlType[]
    {
      SINGLECOLOR,
      SEPARATESPECULARCOLOR,
    };

	/**
   * A public read-only list of all the '<em><b>Gl Light Model Color Control Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<GlLightModelColorControlType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Gl Light Model Color Control Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlLightModelColorControlType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlLightModelColorControlType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gl Light Model Color Control Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlLightModelColorControlType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlLightModelColorControlType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gl Light Model Color Control Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlLightModelColorControlType get(int value) {
    switch (value)
    {
      case SINGLECOLOR_VALUE: return SINGLECOLOR;
      case SEPARATESPECULARCOLOR_VALUE: return SEPARATESPECULARCOLOR;
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
	private GlLightModelColorControlType(int value, String name, String literal) {
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
	
} //GlLightModelColorControlType
