/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.GeneratorType;
import org.khronos.collada.GlslSurfaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glsl Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.GlslSurfaceTypeImpl#getGenerator <em>Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlslSurfaceTypeImpl extends FxSurfaceCommonImpl implements GlslSurfaceType {
	/**
   * The cached value of the '{@link #getGenerator() <em>Generator</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGenerator()
   * @generated
   * @ordered
   */
	protected GeneratorType generator;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected GlslSurfaceTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getGlslSurfaceType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GeneratorType getGenerator() {
    return generator;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetGenerator(GeneratorType newGenerator, NotificationChain msgs) {
    GeneratorType oldGenerator = generator;
    generator = newGenerator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SURFACE_TYPE__GENERATOR, oldGenerator, newGenerator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setGenerator(GeneratorType newGenerator) {
    if (newGenerator != generator)
    {
      NotificationChain msgs = null;
      if (generator != null)
        msgs = ((InternalEObject)generator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SURFACE_TYPE__GENERATOR, null, msgs);
      if (newGenerator != null)
        msgs = ((InternalEObject)newGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLSL_SURFACE_TYPE__GENERATOR, null, msgs);
      msgs = basicSetGenerator(newGenerator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLSL_SURFACE_TYPE__GENERATOR, newGenerator, newGenerator));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case ColladaPackage.GLSL_SURFACE_TYPE__GENERATOR:
        return basicSetGenerator(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case ColladaPackage.GLSL_SURFACE_TYPE__GENERATOR:
        return getGenerator();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case ColladaPackage.GLSL_SURFACE_TYPE__GENERATOR:
        setGenerator((GeneratorType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID)
    {
      case ColladaPackage.GLSL_SURFACE_TYPE__GENERATOR:
        setGenerator((GeneratorType)null);
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID)
    {
      case ColladaPackage.GLSL_SURFACE_TYPE__GENERATOR:
        return generator != null;
    }
    return super.eIsSet(featureID);
  }

} //GlslSurfaceTypeImpl
