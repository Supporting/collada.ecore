/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.MassFrameType;
import org.khronos.collada.RotateType;
import org.khronos.collada.TargetableFloat3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mass Frame Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.MassFrameTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MassFrameTypeImpl#getTranslate <em>Translate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MassFrameTypeImpl#getRotate <em>Rotate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MassFrameTypeImpl extends EObjectImpl implements MassFrameType {
	/**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
	protected FeatureMap group;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MassFrameTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getMassFrameType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null)
    {
      group = new BasicFeatureMap(this, ColladaPackage.MASS_FRAME_TYPE__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TargetableFloat3> getTranslate() {
    return getGroup().list(ColladaPackage.eINSTANCE.getMassFrameType_Translate());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<RotateType> getRotate() {
    return getGroup().list(ColladaPackage.eINSTANCE.getMassFrameType_Rotate());
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
      case ColladaPackage.MASS_FRAME_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.MASS_FRAME_TYPE__TRANSLATE:
        return ((InternalEList<?>)getTranslate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.MASS_FRAME_TYPE__ROTATE:
        return ((InternalEList<?>)getRotate()).basicRemove(otherEnd, msgs);
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
      case ColladaPackage.MASS_FRAME_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.MASS_FRAME_TYPE__TRANSLATE:
        return getTranslate();
      case ColladaPackage.MASS_FRAME_TYPE__ROTATE:
        return getRotate();
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
      case ColladaPackage.MASS_FRAME_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.MASS_FRAME_TYPE__TRANSLATE:
        getTranslate().clear();
        getTranslate().addAll((Collection<? extends TargetableFloat3>)newValue);
        return;
      case ColladaPackage.MASS_FRAME_TYPE__ROTATE:
        getRotate().clear();
        getRotate().addAll((Collection<? extends RotateType>)newValue);
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
      case ColladaPackage.MASS_FRAME_TYPE__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.MASS_FRAME_TYPE__TRANSLATE:
        getTranslate().clear();
        return;
      case ColladaPackage.MASS_FRAME_TYPE__ROTATE:
        getRotate().clear();
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
      case ColladaPackage.MASS_FRAME_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.MASS_FRAME_TYPE__TRANSLATE:
        return !getTranslate().isEmpty();
      case ColladaPackage.MASS_FRAME_TYPE__ROTATE:
        return !getRotate().isEmpty();
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (group: ");
    result.append(group);
    result.append(')');
    return result.toString();
  }

} //MassFrameTypeImpl
