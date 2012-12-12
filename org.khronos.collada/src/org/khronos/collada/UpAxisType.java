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
 * A representation of the literals of the enumeration '<em><b>Up Axis Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * 			An enumerated type specifying the acceptable up-axis values.
 * 			
 * <!-- end-model-doc -->
 * @see org.khronos.collada.ColladaPackage#getUpAxisType()
 * @model extendedMetaData="name='UpAxisType'"
 * @generated
 */
public enum UpAxisType implements Enumerator {
	/**
   * The '<em><b>XUP</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #XUP_VALUE
   * @generated
   * @ordered
   */
	XUP(0, "XUP", "X_UP"),

	/**
   * The '<em><b>YUP</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #YUP_VALUE
   * @generated
   * @ordered
   */
	YUP(1, "YUP", "Y_UP"),

	/**
   * The '<em><b>ZUP</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ZUP_VALUE
   * @generated
   * @ordered
   */
	ZUP(2, "ZUP", "Z_UP");

	/**
   * The '<em><b>XUP</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XUP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #XUP
   * @model literal="X_UP"
   * @generated
   * @ordered
   */
	public static final int XUP_VALUE = 0;

	/**
   * The '<em><b>YUP</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YUP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #YUP
   * @model literal="Y_UP"
   * @generated
   * @ordered
   */
	public static final int YUP_VALUE = 1;

	/**
   * The '<em><b>ZUP</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZUP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ZUP
   * @model literal="Z_UP"
   * @generated
   * @ordered
   */
	public static final int ZUP_VALUE = 2;

	/**
   * An array of all the '<em><b>Up Axis Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final UpAxisType[] VALUES_ARRAY =
		new UpAxisType[]
    {
      XUP,
      YUP,
      ZUP,
    };

	/**
   * A public read-only list of all the '<em><b>Up Axis Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<UpAxisType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Up Axis Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static UpAxisType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      UpAxisType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Up Axis Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static UpAxisType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      UpAxisType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Up Axis Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static UpAxisType get(int value) {
    switch (value)
    {
      case XUP_VALUE: return XUP;
      case YUP_VALUE: return YUP;
      case ZUP_VALUE: return ZUP;
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
	private UpAxisType(int value, String name, String literal) {
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
	
} //UpAxisType
