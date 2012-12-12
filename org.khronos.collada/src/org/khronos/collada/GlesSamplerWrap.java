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
 * A representation of the literals of the enumeration '<em><b>Gles Sampler Wrap</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getGlesSamplerWrap()
 * @model extendedMetaData="name='gles_sampler_wrap'"
 * @generated
 */
public enum GlesSamplerWrap implements Enumerator {
	/**
   * The '<em><b>REPEAT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #REPEAT_VALUE
   * @generated
   * @ordered
   */
	REPEAT(0, "REPEAT", "REPEAT"),

	/**
   * The '<em><b>CLAMP</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #CLAMP_VALUE
   * @generated
   * @ordered
   */
	CLAMP(1, "CLAMP", "CLAMP"),

	/**
   * The '<em><b>CLAMPTOEDGE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #CLAMPTOEDGE_VALUE
   * @generated
   * @ordered
   */
	CLAMPTOEDGE(2, "CLAMPTOEDGE", "CLAMP_TO_EDGE"),

	/**
   * The '<em><b>MIRROREDREPEAT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #MIRROREDREPEAT_VALUE
   * @generated
   * @ordered
   */
	MIRROREDREPEAT(3, "MIRROREDREPEAT", "MIRRORED_REPEAT");

	/**
   * The '<em><b>REPEAT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REPEAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #REPEAT
   * @model
   * @generated
   * @ordered
   */
	public static final int REPEAT_VALUE = 0;

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
	public static final int CLAMP_VALUE = 1;

	/**
   * The '<em><b>CLAMPTOEDGE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLAMPTOEDGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #CLAMPTOEDGE
   * @model literal="CLAMP_TO_EDGE"
   * @generated
   * @ordered
   */
	public static final int CLAMPTOEDGE_VALUE = 2;

	/**
   * The '<em><b>MIRROREDREPEAT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 					supported by GLES 1.1 only
   * 					
   * <!-- end-model-doc -->
   * @see #MIRROREDREPEAT
   * @model literal="MIRRORED_REPEAT"
   * @generated
   * @ordered
   */
	public static final int MIRROREDREPEAT_VALUE = 3;

	/**
   * An array of all the '<em><b>Gles Sampler Wrap</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final GlesSamplerWrap[] VALUES_ARRAY =
		new GlesSamplerWrap[]
    {
      REPEAT,
      CLAMP,
      CLAMPTOEDGE,
      MIRROREDREPEAT,
    };

	/**
   * A public read-only list of all the '<em><b>Gles Sampler Wrap</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<GlesSamplerWrap> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Gles Sampler Wrap</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesSamplerWrap get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlesSamplerWrap result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gles Sampler Wrap</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesSamplerWrap getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlesSamplerWrap result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Gles Sampler Wrap</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlesSamplerWrap get(int value) {
    switch (value)
    {
      case REPEAT_VALUE: return REPEAT;
      case CLAMP_VALUE: return CLAMP;
      case CLAMPTOEDGE_VALUE: return CLAMPTOEDGE;
      case MIRROREDREPEAT_VALUE: return MIRROREDREPEAT;
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
	private GlesSamplerWrap(int value, String name, String literal) {
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
	
} //GlesSamplerWrap
