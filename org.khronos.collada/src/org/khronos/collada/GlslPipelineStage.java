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
 * A representation of the literals of the enumeration '<em><b>Glsl Pipeline Stage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getGlslPipelineStage()
 * @model extendedMetaData="name='glsl_pipeline_stage'"
 * @generated
 */
public enum GlslPipelineStage implements Enumerator {
	/**
   * The '<em><b>VERTEXPROGRAM</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #VERTEXPROGRAM_VALUE
   * @generated
   * @ordered
   */
	VERTEXPROGRAM(0, "VERTEXPROGRAM", "VERTEXPROGRAM"),

	/**
   * The '<em><b>FRAGMENTPROGRAM</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #FRAGMENTPROGRAM_VALUE
   * @generated
   * @ordered
   */
	FRAGMENTPROGRAM(1, "FRAGMENTPROGRAM", "FRAGMENTPROGRAM");

	/**
   * The '<em><b>VERTEXPROGRAM</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VERTEXPROGRAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #VERTEXPROGRAM
   * @model
   * @generated
   * @ordered
   */
	public static final int VERTEXPROGRAM_VALUE = 0;

	/**
   * The '<em><b>FRAGMENTPROGRAM</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FRAGMENTPROGRAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #FRAGMENTPROGRAM
   * @model
   * @generated
   * @ordered
   */
	public static final int FRAGMENTPROGRAM_VALUE = 1;

	/**
   * An array of all the '<em><b>Glsl Pipeline Stage</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final GlslPipelineStage[] VALUES_ARRAY =
		new GlslPipelineStage[]
    {
      VERTEXPROGRAM,
      FRAGMENTPROGRAM,
    };

	/**
   * A public read-only list of all the '<em><b>Glsl Pipeline Stage</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<GlslPipelineStage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Glsl Pipeline Stage</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlslPipelineStage get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlslPipelineStage result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Glsl Pipeline Stage</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlslPipelineStage getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GlslPipelineStage result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Glsl Pipeline Stage</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static GlslPipelineStage get(int value) {
    switch (value)
    {
      case VERTEXPROGRAM_VALUE: return VERTEXPROGRAM;
      case FRAGMENTPROGRAM_VALUE: return FRAGMENTPROGRAM;
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
	private GlslPipelineStage(int value, String name, String literal) {
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
	
} //GlslPipelineStage
