/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fx Surface Init From Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				This element is an IDREF which specifies the image to use to initialize a specific mip of a 1D or 2D surface, 3D slice, or Cube face.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.FxSurfaceInitFromCommon#getValue <em>Value</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceInitFromCommon#getFace <em>Face</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceInitFromCommon#getMip <em>Mip</em>}</li>
 *   <li>{@link org.khronos.collada.FxSurfaceInitFromCommon#getSlice <em>Slice</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getFxSurfaceInitFromCommon()
 * @model extendedMetaData="name='fx_surface_init_from_common' kind='simple'"
 * @generated
 */
public interface FxSurfaceInitFromCommon extends EObject {
	/**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceInitFromCommon_Value()
   * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
   *        extendedMetaData="name=':0' kind='simple'"
   * @generated
   */
	String getValue();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceInitFromCommon#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
	void setValue(String value);

	/**
   * Returns the value of the '<em><b>Face</b></em>' attribute.
   * The default value is <code>"POSITIVE_X"</code>.
   * The literals are from the enumeration {@link org.khronos.collada.FxSurfaceFaceEnum}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Face</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Face</em>' attribute.
   * @see org.khronos.collada.FxSurfaceFaceEnum
   * @see #isSetFace()
   * @see #unsetFace()
   * @see #setFace(FxSurfaceFaceEnum)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceInitFromCommon_Face()
   * @model default="POSITIVE_X" unsettable="true"
   *        extendedMetaData="kind='attribute' name='face'"
   * @generated
   */
	FxSurfaceFaceEnum getFace();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceInitFromCommon#getFace <em>Face</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Face</em>' attribute.
   * @see org.khronos.collada.FxSurfaceFaceEnum
   * @see #isSetFace()
   * @see #unsetFace()
   * @see #getFace()
   * @generated
   */
	void setFace(FxSurfaceFaceEnum value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSurfaceInitFromCommon#getFace <em>Face</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetFace()
   * @see #getFace()
   * @see #setFace(FxSurfaceFaceEnum)
   * @generated
   */
	void unsetFace();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSurfaceInitFromCommon#getFace <em>Face</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Face</em>' attribute is set.
   * @see #unsetFace()
   * @see #getFace()
   * @see #setFace(FxSurfaceFaceEnum)
   * @generated
   */
	boolean isSetFace();

	/**
   * Returns the value of the '<em><b>Mip</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mip</em>' attribute.
   * @see #isSetMip()
   * @see #unsetMip()
   * @see #setMip(long)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceInitFromCommon_Mip()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
   *        extendedMetaData="kind='attribute' name='mip'"
   * @generated
   */
	long getMip();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceInitFromCommon#getMip <em>Mip</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mip</em>' attribute.
   * @see #isSetMip()
   * @see #unsetMip()
   * @see #getMip()
   * @generated
   */
	void setMip(long value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSurfaceInitFromCommon#getMip <em>Mip</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMip()
   * @see #getMip()
   * @see #setMip(long)
   * @generated
   */
	void unsetMip();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSurfaceInitFromCommon#getMip <em>Mip</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Mip</em>' attribute is set.
   * @see #unsetMip()
   * @see #getMip()
   * @see #setMip(long)
   * @generated
   */
	boolean isSetMip();

	/**
   * Returns the value of the '<em><b>Slice</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Slice</em>' attribute.
   * @see #isSetSlice()
   * @see #unsetSlice()
   * @see #setSlice(long)
   * @see org.khronos.collada.ColladaPackage#getFxSurfaceInitFromCommon_Slice()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
   *        extendedMetaData="kind='attribute' name='slice'"
   * @generated
   */
	long getSlice();

	/**
   * Sets the value of the '{@link org.khronos.collada.FxSurfaceInitFromCommon#getSlice <em>Slice</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Slice</em>' attribute.
   * @see #isSetSlice()
   * @see #unsetSlice()
   * @see #getSlice()
   * @generated
   */
	void setSlice(long value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.FxSurfaceInitFromCommon#getSlice <em>Slice</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetSlice()
   * @see #getSlice()
   * @see #setSlice(long)
   * @generated
   */
	void unsetSlice();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.FxSurfaceInitFromCommon#getSlice <em>Slice</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Slice</em>' attribute is set.
   * @see #unsetSlice()
   * @see #getSlice()
   * @see #setSlice(long)
   * @generated
   */
	boolean isSetSlice();

} // FxSurfaceInitFromCommon
