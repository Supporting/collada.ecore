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
 * A representation of the literals of the enumeration '<em><b>Gl Blend Equation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getGlBlendEquationType()
 * @model extendedMetaData="name='gl_blend_equation_type'"
 * @generated
 */
public enum GlBlendEquationType implements Enumerator {
	/**
   * The '<em><b>FUNCADD</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #FUNCADD_VALUE
   * @generated
   * @ordered
   */
	FUNCADD(0, "FUNCADD", "FUNC_ADD"),

	/**
   * The '<em><b>FUNCSUBTRACT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #FUNCSUBTRACT_VALUE
   * @generated
   * @ordered
   */
	FUNCSUBTRACT(1, "FUNCSUBTRACT", "FUNC_SUBTRACT"),

	/**
   * The '<em><b>FUNCREVERSESUBTRACT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #FUNCREVERSESUBTRACT_VALUE
   * @generated
   * @ordered
   */
	FUNCREVERSESUBTRACT(2, "FUNCREVERSESUBTRACT", "FUNC_REVERSE_SUBTRACT"),

	/**
   * The '<em><b>MIN</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #MIN_VALUE
   * @generated
   * @ordered
   */
	MIN(3, "MIN", "MIN"),

	/**
   * The '<em><b>MAX</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #MAX_VALUE
   * @generated
   * @ordered
   */
	MAX(4, "MAX", "MAX");

	/**
   * The '<em><b>FUNCADD</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUNCADD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #FUNCADD
   * @model literal="FUNC_ADD"
   * @generated
   * @ordered
   */
	public static final int FUNCADD_VALUE = 0;

	/**
   * The '<em><b>FUNCSUBTRACT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUNCSUBTRACT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #FUNCSUBTRACT
   * @model literal="FUNC_SUBTRACT"
   * @generated
   * @ordered
   */
	public static final int FUNCSUBTRACT_VALUE = 1;

	/**
   * The '<em><b>FUNCREVERSESUBTRACT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUNCREVERSESUBTRACT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #FUNCREVERSESUBTRACT
   * @model literal="FUNC_REVERSE_SUBTRACT"
   * @generated
   * @ordered
   */
	public static final int FUNCREVERSESUBTRACT_VALUE = 2;

	/**
   * The '<em><b>MIN</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #MIN
   * @model
   * @generated
   * @ordered
   */
	public static final int MIN_VALUE = 3;

	/**
   * The '<em><b>MAX</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #MAX
   * @model
   * @generated
   * @ordered
   */
	public static final int MAX_VALUE = 4;

	/**
   * An array of all the '<em><b>Gl Blend Equation Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final GlBlendEquationType[] VALUES_ARRAY =
		new GlBlendEquationType[]
    {
      FUNCADD,
      FUNCSUBTRACT,
      FUNCREVERSESUBTRACT,
      MIN,
      MAX,
    };

	/**
   * A public read-only list of all the '<em><b>Gl Blend Equation Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<GlBlendEquationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Gl Blend Equation Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlBlendEquationType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlBlendEquationType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gl Blend Equation Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlBlendEquationType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlBlendEquationType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gl Blend Equation Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlBlendEquationType get(int value) {
    switch (value)
    {
      case FUNCADD_VALUE: return FUNCADD;
      case FUNCSUBTRACT_VALUE: return FUNCSUBTRACT;
      case FUNCREVERSESUBTRACT_VALUE: return FUNCREVERSESUBTRACT;
      case MIN_VALUE: return MIN;
      case MAX_VALUE: return MAX;
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
	private GlBlendEquationType(int value, String name, String literal) {
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
	
} //GlBlendEquationType
