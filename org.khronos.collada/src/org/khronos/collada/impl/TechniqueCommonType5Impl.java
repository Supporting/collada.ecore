/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import org.eclipse.emf.common.notify.Notification;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.AmbientType;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.DirectionalType;
import org.khronos.collada.PointType;
import org.khronos.collada.SpotType;
import org.khronos.collada.InstanceMaterialType;
import org.khronos.collada.TechniqueCommonType5;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technique Common Type5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType5Impl#getInstanceMaterial <em>Instance Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechniqueCommonType5Impl extends EObjectImpl implements TechniqueCommonType5 {
	/**
   * The cached value of the '{@link #getInstanceMaterial() <em>Instance Material</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstanceMaterial()
   * @generated
   * @ordered
   */
	protected EList<InstanceMaterialType> instanceMaterial;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TechniqueCommonType5Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTechniqueCommonType5();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<InstanceMaterialType> getInstanceMaterial() {
    if (instanceMaterial == null)
    {
      instanceMaterial = new EObjectContainmentEList<InstanceMaterialType>(InstanceMaterialType.class, this, ColladaPackage.TECHNIQUE_COMMON_TYPE5__INSTANCE_MATERIAL);
    }
    return instanceMaterial;
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE5__INSTANCE_MATERIAL:
        return ((InternalEList<?>)getInstanceMaterial()).basicRemove(otherEnd, msgs);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE5__INSTANCE_MATERIAL:
        return getInstanceMaterial();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case ColladaPackage.TECHNIQUE_COMMON_TYPE5__INSTANCE_MATERIAL:
        getInstanceMaterial().clear();
        getInstanceMaterial().addAll((Collection<? extends InstanceMaterialType>)newValue);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE5__INSTANCE_MATERIAL:
        getInstanceMaterial().clear();
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE5__INSTANCE_MATERIAL:
        return instanceMaterial != null && !instanceMaterial.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TechniqueCommonType5Impl
