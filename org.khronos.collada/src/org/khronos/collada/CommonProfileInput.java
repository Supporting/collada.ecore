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
 * A representation of the literals of the enumeration '<em><b>Common Profile Input</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getCommonProfileInput()
 * @model extendedMetaData="name='Common_profile_input'"
 * @generated
 */
public enum CommonProfileInput implements Enumerator {
	/**
   * The '<em><b>BINORMAL</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #BINORMAL_VALUE
   * @generated
   * @ordered
   */
	BINORMAL(0, "BINORMAL", "BINORMAL"),

	/**
   * The '<em><b>COLOR</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #COLOR_VALUE
   * @generated
   * @ordered
   */
	COLOR(1, "COLOR", "COLOR"),

	/**
   * The '<em><b>CONTINUITY</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #CONTINUITY_VALUE
   * @generated
   * @ordered
   */
	CONTINUITY(2, "CONTINUITY", "CONTINUITY"),

	/**
   * The '<em><b>IMAGE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #IMAGE_VALUE
   * @generated
   * @ordered
   */
	IMAGE(3, "IMAGE", "IMAGE"),

	/**
   * The '<em><b>INTANGENT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #INTANGENT_VALUE
   * @generated
   * @ordered
   */
	INTANGENT(4, "INTANGENT", "IN_TANGENT"),

	/**
   * The '<em><b>INPUT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #INPUT_VALUE
   * @generated
   * @ordered
   */
	INPUT(5, "INPUT", "INPUT"),

	/**
   * The '<em><b>INTERPOLATION</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #INTERPOLATION_VALUE
   * @generated
   * @ordered
   */
	INTERPOLATION(6, "INTERPOLATION", "INTERPOLATION"),

	/**
   * The '<em><b>INVBINDMATRIX</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #INVBINDMATRIX_VALUE
   * @generated
   * @ordered
   */
	INVBINDMATRIX(7, "INVBINDMATRIX", "INV_BIND_MATRIX"),

	/**
   * The '<em><b>JOINT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #JOINT_VALUE
   * @generated
   * @ordered
   */
	JOINT(8, "JOINT", "JOINT"),

	/**
   * The '<em><b>LINEARSTEPS</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #LINEARSTEPS_VALUE
   * @generated
   * @ordered
   */
	LINEARSTEPS(9, "LINEARSTEPS", "LINEAR_STEPS"),

	/**
   * The '<em><b>MORPHTARGET</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #MORPHTARGET_VALUE
   * @generated
   * @ordered
   */
	MORPHTARGET(10, "MORPHTARGET", "MORPH_TARGET"),

	/**
   * The '<em><b>MORPHWEIGHT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #MORPHWEIGHT_VALUE
   * @generated
   * @ordered
   */
	MORPHWEIGHT(11, "MORPHWEIGHT", "MORPH_WEIGHT"),

	/**
   * The '<em><b>NORMAL</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NORMAL_VALUE
   * @generated
   * @ordered
   */
	NORMAL(12, "NORMAL", "NORMAL"),

	/**
   * The '<em><b>OUTPUT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #OUTPUT_VALUE
   * @generated
   * @ordered
   */
	OUTPUT(13, "OUTPUT", "OUTPUT"),

	/**
   * The '<em><b>OUTTANGENT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #OUTTANGENT_VALUE
   * @generated
   * @ordered
   */
	OUTTANGENT(14, "OUTTANGENT", "OUT_TANGENT"),

	/**
   * The '<em><b>POSITION</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #POSITION_VALUE
   * @generated
   * @ordered
   */
	POSITION(15, "POSITION", "POSITION"),

	/**
   * The '<em><b>TANGENT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #TANGENT_VALUE
   * @generated
   * @ordered
   */
	TANGENT(16, "TANGENT", "TANGENT"),

	/**
   * The '<em><b>TEXBINORMAL</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #TEXBINORMAL_VALUE
   * @generated
   * @ordered
   */
	TEXBINORMAL(17, "TEXBINORMAL", "TEXBINORMAL"),

	/**
   * The '<em><b>TEXCOORD</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #TEXCOORD_VALUE
   * @generated
   * @ordered
   */
	TEXCOORD(18, "TEXCOORD", "TEXCOORD"),

	/**
   * The '<em><b>TEXTANGENT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #TEXTANGENT_VALUE
   * @generated
   * @ordered
   */
	TEXTANGENT(19, "TEXTANGENT", "TEXTANGENT"),

	/**
   * The '<em><b>UV</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #UV_VALUE
   * @generated
   * @ordered
   */
	UV(20, "UV", "UV"),

	/**
   * The '<em><b>VERTEX</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #VERTEX_VALUE
   * @generated
   * @ordered
   */
	VERTEX(21, "VERTEX", "VERTEX"),

	/**
   * The '<em><b>WEIGHT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #WEIGHT_VALUE
   * @generated
   * @ordered
   */
	WEIGHT(22, "WEIGHT", "WEIGHT");

	/**
   * The '<em><b>BINORMAL</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BINORMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #BINORMAL
   * @model
   * @generated
   * @ordered
   */
	public static final int BINORMAL_VALUE = 0;

	/**
   * The '<em><b>COLOR</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #COLOR
   * @model
   * @generated
   * @ordered
   */
	public static final int COLOR_VALUE = 1;

	/**
   * The '<em><b>CONTINUITY</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTINUITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #CONTINUITY
   * @model
   * @generated
   * @ordered
   */
	public static final int CONTINUITY_VALUE = 2;

	/**
   * The '<em><b>IMAGE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #IMAGE
   * @model
   * @generated
   * @ordered
   */
	public static final int IMAGE_VALUE = 3;

	/**
   * The '<em><b>INTANGENT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTANGENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #INTANGENT
   * @model literal="IN_TANGENT"
   * @generated
   * @ordered
   */
	public static final int INTANGENT_VALUE = 4;

	/**
   * The '<em><b>INPUT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INPUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #INPUT
   * @model
   * @generated
   * @ordered
   */
	public static final int INPUT_VALUE = 5;

	/**
   * The '<em><b>INTERPOLATION</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERPOLATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #INTERPOLATION
   * @model
   * @generated
   * @ordered
   */
	public static final int INTERPOLATION_VALUE = 6;

	/**
   * The '<em><b>INVBINDMATRIX</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INVBINDMATRIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #INVBINDMATRIX
   * @model literal="INV_BIND_MATRIX"
   * @generated
   * @ordered
   */
	public static final int INVBINDMATRIX_VALUE = 7;

	/**
   * The '<em><b>JOINT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #JOINT
   * @model
   * @generated
   * @ordered
   */
	public static final int JOINT_VALUE = 8;

	/**
   * The '<em><b>LINEARSTEPS</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINEARSTEPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #LINEARSTEPS
   * @model literal="LINEAR_STEPS"
   * @generated
   * @ordered
   */
	public static final int LINEARSTEPS_VALUE = 9;

	/**
   * The '<em><b>MORPHTARGET</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MORPHTARGET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #MORPHTARGET
   * @model literal="MORPH_TARGET"
   * @generated
   * @ordered
   */
	public static final int MORPHTARGET_VALUE = 10;

	/**
   * The '<em><b>MORPHWEIGHT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MORPHWEIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #MORPHWEIGHT
   * @model literal="MORPH_WEIGHT"
   * @generated
   * @ordered
   */
	public static final int MORPHWEIGHT_VALUE = 11;

	/**
   * The '<em><b>NORMAL</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #NORMAL
   * @model
   * @generated
   * @ordered
   */
	public static final int NORMAL_VALUE = 12;

	/**
   * The '<em><b>OUTPUT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OUTPUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #OUTPUT
   * @model
   * @generated
   * @ordered
   */
	public static final int OUTPUT_VALUE = 13;

	/**
   * The '<em><b>OUTTANGENT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OUTTANGENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #OUTTANGENT
   * @model literal="OUT_TANGENT"
   * @generated
   * @ordered
   */
	public static final int OUTTANGENT_VALUE = 14;

	/**
   * The '<em><b>POSITION</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #POSITION
   * @model
   * @generated
   * @ordered
   */
	public static final int POSITION_VALUE = 15;

	/**
   * The '<em><b>TANGENT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TANGENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #TANGENT
   * @model
   * @generated
   * @ordered
   */
	public static final int TANGENT_VALUE = 16;

	/**
   * The '<em><b>TEXBINORMAL</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXBINORMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #TEXBINORMAL
   * @model
   * @generated
   * @ordered
   */
	public static final int TEXBINORMAL_VALUE = 17;

	/**
   * The '<em><b>TEXCOORD</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXCOORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #TEXCOORD
   * @model
   * @generated
   * @ordered
   */
	public static final int TEXCOORD_VALUE = 18;

	/**
   * The '<em><b>TEXTANGENT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXTANGENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #TEXTANGENT
   * @model
   * @generated
   * @ordered
   */
	public static final int TEXTANGENT_VALUE = 19;

	/**
   * The '<em><b>UV</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #UV
   * @model
   * @generated
   * @ordered
   */
	public static final int UV_VALUE = 20;

	/**
   * The '<em><b>VERTEX</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VERTEX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #VERTEX
   * @model
   * @generated
   * @ordered
   */
	public static final int VERTEX_VALUE = 21;

	/**
   * The '<em><b>WEIGHT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #WEIGHT
   * @model
   * @generated
   * @ordered
   */
	public static final int WEIGHT_VALUE = 22;

	/**
   * An array of all the '<em><b>Common Profile Input</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final CommonProfileInput[] VALUES_ARRAY =
		new CommonProfileInput[]
    {
      BINORMAL,
      COLOR,
      CONTINUITY,
      IMAGE,
      INTANGENT,
      INPUT,
      INTERPOLATION,
      INVBINDMATRIX,
      JOINT,
      LINEARSTEPS,
      MORPHTARGET,
      MORPHWEIGHT,
      NORMAL,
      OUTPUT,
      OUTTANGENT,
      POSITION,
      TANGENT,
      TEXBINORMAL,
      TEXCOORD,
      TEXTANGENT,
      UV,
      VERTEX,
      WEIGHT,
    };

	/**
   * A public read-only list of all the '<em><b>Common Profile Input</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<CommonProfileInput> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Common Profile Input</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static CommonProfileInput get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CommonProfileInput result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Common Profile Input</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static CommonProfileInput getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CommonProfileInput result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Common Profile Input</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static CommonProfileInput get(int value) {
    switch (value)
    {
      case BINORMAL_VALUE: return BINORMAL;
      case COLOR_VALUE: return COLOR;
      case CONTINUITY_VALUE: return CONTINUITY;
      case IMAGE_VALUE: return IMAGE;
      case INTANGENT_VALUE: return INTANGENT;
      case INPUT_VALUE: return INPUT;
      case INTERPOLATION_VALUE: return INTERPOLATION;
      case INVBINDMATRIX_VALUE: return INVBINDMATRIX;
      case JOINT_VALUE: return JOINT;
      case LINEARSTEPS_VALUE: return LINEARSTEPS;
      case MORPHTARGET_VALUE: return MORPHTARGET;
      case MORPHWEIGHT_VALUE: return MORPHWEIGHT;
      case NORMAL_VALUE: return NORMAL;
      case OUTPUT_VALUE: return OUTPUT;
      case OUTTANGENT_VALUE: return OUTTANGENT;
      case POSITION_VALUE: return POSITION;
      case TANGENT_VALUE: return TANGENT;
      case TEXBINORMAL_VALUE: return TEXBINORMAL;
      case TEXCOORD_VALUE: return TEXCOORD;
      case TEXTANGENT_VALUE: return TEXTANGENT;
      case UV_VALUE: return UV;
      case VERTEX_VALUE: return VERTEX;
      case WEIGHT_VALUE: return WEIGHT;
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
	private CommonProfileInput(int value, String name, String literal) {
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
	
} //CommonProfileInput
