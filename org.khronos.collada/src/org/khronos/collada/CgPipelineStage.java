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
 * A representation of the literals of the enumeration '<em><b>Cg Pipeline Stage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getCgPipelineStage()
 * @model extendedMetaData="name='cg_pipeline_stage'"
 * @generated
 */
public enum CgPipelineStage implements Enumerator {
	/**
   * The '<em><b>VERTEX</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #VERTEX_VALUE
   * @generated
   * @ordered
   */
	VERTEX(0, "VERTEX", "VERTEX"),

	/**
   * The '<em><b>FRAGMENT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #FRAGMENT_VALUE
   * @generated
   * @ordered
   */
	FRAGMENT(1, "FRAGMENT", "FRAGMENT");

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
	public static final int VERTEX_VALUE = 0;

	/**
   * The '<em><b>FRAGMENT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FRAGMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #FRAGMENT
   * @model
   * @generated
   * @ordered
   */
	public static final int FRAGMENT_VALUE = 1;

	/**
   * An array of all the '<em><b>Cg Pipeline Stage</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final CgPipelineStage[] VALUES_ARRAY =
		new CgPipelineStage[]
    {
      VERTEX,
      FRAGMENT,
    };

	/**
   * A public read-only list of all the '<em><b>Cg Pipeline Stage</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<CgPipelineStage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Cg Pipeline Stage</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static CgPipelineStage get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CgPipelineStage result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Cg Pipeline Stage</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static CgPipelineStage getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CgPipelineStage result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Cg Pipeline Stage</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static CgPipelineStage get(int value) {
    switch (value)
    {
      case VERTEX_VALUE: return VERTEX;
      case FRAGMENT_VALUE: return FRAGMENT;
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
	private CgPipelineStage(int value, String name, String literal) {
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
	
} //CgPipelineStage
