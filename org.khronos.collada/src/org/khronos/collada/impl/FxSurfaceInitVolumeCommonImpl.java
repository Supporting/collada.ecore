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

import org.khronos.collada.AllType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.FxSurfaceInitVolumeCommon;
import org.khronos.collada.PrimaryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fx Surface Init Volume Common</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceInitVolumeCommonImpl#getAll <em>All</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceInitVolumeCommonImpl#getPrimary <em>Primary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FxSurfaceInitVolumeCommonImpl extends EObjectImpl implements FxSurfaceInitVolumeCommon {
	/**
   * The cached value of the '{@link #getAll() <em>All</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAll()
   * @generated
   * @ordered
   */
	protected AllType all;

	/**
   * The cached value of the '{@link #getPrimary() <em>Primary</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPrimary()
   * @generated
   * @ordered
   */
	protected PrimaryType primary;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected FxSurfaceInitVolumeCommonImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getFxSurfaceInitVolumeCommon();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AllType getAll() {
    return all;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAll(AllType newAll, NotificationChain msgs) {
    AllType oldAll = all;
    all = newAll;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__ALL, oldAll, newAll);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAll(AllType newAll) {
    if (newAll != all)
    {
      NotificationChain msgs = null;
      if (all != null)
        msgs = ((InternalEObject)all).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__ALL, null, msgs);
      if (newAll != null)
        msgs = ((InternalEObject)newAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__ALL, null, msgs);
      msgs = basicSetAll(newAll, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__ALL, newAll, newAll));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PrimaryType getPrimary() {
    return primary;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPrimary(PrimaryType newPrimary, NotificationChain msgs) {
    PrimaryType oldPrimary = primary;
    primary = newPrimary;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__PRIMARY, oldPrimary, newPrimary);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPrimary(PrimaryType newPrimary) {
    if (newPrimary != primary)
    {
      NotificationChain msgs = null;
      if (primary != null)
        msgs = ((InternalEObject)primary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__PRIMARY, null, msgs);
      if (newPrimary != null)
        msgs = ((InternalEObject)newPrimary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__PRIMARY, null, msgs);
      msgs = basicSetPrimary(newPrimary, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__PRIMARY, newPrimary, newPrimary));
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
      case ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__ALL:
        return basicSetAll(null, msgs);
      case ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__PRIMARY:
        return basicSetPrimary(null, msgs);
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
      case ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__ALL:
        return getAll();
      case ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__PRIMARY:
        return getPrimary();
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
      case ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__ALL:
        setAll((AllType)newValue);
        return;
      case ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__PRIMARY:
        setPrimary((PrimaryType)newValue);
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
      case ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__ALL:
        setAll((AllType)null);
        return;
      case ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__PRIMARY:
        setPrimary((PrimaryType)null);
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
      case ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__ALL:
        return all != null;
      case ColladaPackage.FX_SURFACE_INIT_VOLUME_COMMON__PRIMARY:
        return primary != null;
    }
    return super.eIsSet(featureID);
  }

} //FxSurfaceInitVolumeCommonImpl
