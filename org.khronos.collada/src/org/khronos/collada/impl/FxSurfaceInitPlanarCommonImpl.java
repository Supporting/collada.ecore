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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.AllType1;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.FxSurfaceInitPlanarCommon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fx Surface Init Planar Common</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceInitPlanarCommonImpl#getAll <em>All</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FxSurfaceInitPlanarCommonImpl extends EObjectImpl implements FxSurfaceInitPlanarCommon {
	/**
   * The cached value of the '{@link #getAll() <em>All</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAll()
   * @generated
   * @ordered
   */
	protected AllType1 all;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected FxSurfaceInitPlanarCommonImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getFxSurfaceInitPlanarCommon();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AllType1 getAll() {
    return all;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAll(AllType1 newAll, NotificationChain msgs) {
    AllType1 oldAll = all;
    all = newAll;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_INIT_PLANAR_COMMON__ALL, oldAll, newAll);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAll(AllType1 newAll) {
    if (newAll != all)
    {
      NotificationChain msgs = null;
      if (all != null)
        msgs = ((InternalEObject)all).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_INIT_PLANAR_COMMON__ALL, null, msgs);
      if (newAll != null)
        msgs = ((InternalEObject)newAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_INIT_PLANAR_COMMON__ALL, null, msgs);
      msgs = basicSetAll(newAll, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_INIT_PLANAR_COMMON__ALL, newAll, newAll));
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
      case ColladaPackage.FX_SURFACE_INIT_PLANAR_COMMON__ALL:
        return basicSetAll(null, msgs);
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
      case ColladaPackage.FX_SURFACE_INIT_PLANAR_COMMON__ALL:
        return getAll();
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
      case ColladaPackage.FX_SURFACE_INIT_PLANAR_COMMON__ALL:
        setAll((AllType1)newValue);
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
      case ColladaPackage.FX_SURFACE_INIT_PLANAR_COMMON__ALL:
        setAll((AllType1)null);
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
      case ColladaPackage.FX_SURFACE_INIT_PLANAR_COMMON__ALL:
        return all != null;
    }
    return super.eIsSet(featureID);
  }

} //FxSurfaceInitPlanarCommonImpl
