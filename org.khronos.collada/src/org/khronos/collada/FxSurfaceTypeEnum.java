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
 * A representation of the literals of the enumeration '<em><b>Fx Surface Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getFxSurfaceTypeEnum()
 * @model extendedMetaData="name='fx_surface_type_enum'"
 * @generated
 */
public enum FxSurfaceTypeEnum implements Enumerator {
	/**
   * The '<em><b>UNTYPED</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #UNTYPED_VALUE
   * @generated
   * @ordered
   */
	UNTYPED(0, "UNTYPED", "UNTYPED"),

	/**
   * The '<em><b>1D</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #_1D_VALUE
   * @generated
   * @ordered
   */
	_1D(1, "_1D", "1D"),

	/**
   * The '<em><b>2D</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #_2D_VALUE
   * @generated
   * @ordered
   */
	_2D(2, "_2D", "2D"),

	/**
   * The '<em><b>3D</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #_3D_VALUE
   * @generated
   * @ordered
   */
	_3D(3, "_3D", "3D"),

	/**
   * The '<em><b>RECT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #RECT_VALUE
   * @generated
   * @ordered
   */
	RECT(4, "RECT", "RECT"),

	/**
   * The '<em><b>CUBE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #CUBE_VALUE
   * @generated
   * @ordered
   */
	CUBE(5, "CUBE", "CUBE"),

	/**
   * The '<em><b>DEPTH</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #DEPTH_VALUE
   * @generated
   * @ordered
   */
	DEPTH(6, "DEPTH", "DEPTH");

	/**
   * The '<em><b>UNTYPED</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 						When a surface's type attribute is set to UNTYPED, its type is initially unknown and established later by the context in which it is used, such as by a texture sampler that references it. A surface of any other type may be changed into an UNTYPED surface at run-time, as if it were created by <newparam>, using <setparam>. If there is a type mismatch between a <setparam> operation and what the run-time decides the type should be, the result is profile- and platform-specific behavior.
   * 					
   * <!-- end-model-doc -->
   * @see #UNTYPED
   * @model
   * @generated
   * @ordered
   */
	public static final int UNTYPED_VALUE = 0;

	/**
   * The '<em><b>1D</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>1D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #_1D
   * @model literal="1D"
   * @generated
   * @ordered
   */
	public static final int _1D_VALUE = 1;

	/**
   * The '<em><b>2D</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>2D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #_2D
   * @model literal="2D"
   * @generated
   * @ordered
   */
	public static final int _2D_VALUE = 2;

	/**
   * The '<em><b>3D</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>3D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #_3D
   * @model literal="3D"
   * @generated
   * @ordered
   */
	public static final int _3D_VALUE = 3;

	/**
   * The '<em><b>RECT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #RECT
   * @model
   * @generated
   * @ordered
   */
	public static final int RECT_VALUE = 4;

	/**
   * The '<em><b>CUBE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUBE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #CUBE
   * @model
   * @generated
   * @ordered
   */
	public static final int CUBE_VALUE = 5;

	/**
   * The '<em><b>DEPTH</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #DEPTH
   * @model
   * @generated
   * @ordered
   */
	public static final int DEPTH_VALUE = 6;

	/**
   * An array of all the '<em><b>Fx Surface Type Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final FxSurfaceTypeEnum[] VALUES_ARRAY =
		new FxSurfaceTypeEnum[]
    {
      UNTYPED,
      _1D,
      _2D,
      _3D,
      RECT,
      CUBE,
      DEPTH,
    };

	/**
   * A public read-only list of all the '<em><b>Fx Surface Type Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<FxSurfaceTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Fx Surface Type Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSurfaceTypeEnum get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxSurfaceTypeEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Surface Type Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSurfaceTypeEnum getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FxSurfaceTypeEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Fx Surface Type Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static FxSurfaceTypeEnum get(int value) {
    switch (value)
    {
      case UNTYPED_VALUE: return UNTYPED;
      case _1D_VALUE: return _1D;
      case _2D_VALUE: return _2D;
      case _3D_VALUE: return _3D;
      case RECT_VALUE: return RECT;
      case CUBE_VALUE: return CUBE;
      case DEPTH_VALUE: return DEPTH;
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
	private FxSurfaceTypeEnum(int value, String name, String literal) {
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
	
} //FxSurfaceTypeEnum
