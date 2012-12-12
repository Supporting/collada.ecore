/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.AllType2;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.FaceType4;
import org.khronos.collada.FxSurfaceInitCubeCommon;
import org.khronos.collada.PrimaryType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fx Surface Init Cube Common</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceInitCubeCommonImpl#getAll <em>All</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceInitCubeCommonImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceInitCubeCommonImpl#getFace <em>Face</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FxSurfaceInitCubeCommonImpl extends EObjectImpl implements FxSurfaceInitCubeCommon {
	/**
   * The cached value of the '{@link #getAll() <em>All</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAll()
   * @generated
   * @ordered
   */
	protected AllType2 all;

	/**
   * The cached value of the '{@link #getPrimary() <em>Primary</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPrimary()
   * @generated
   * @ordered
   */
	protected PrimaryType1 primary;

	/**
   * The cached value of the '{@link #getFace() <em>Face</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFace()
   * @generated
   * @ordered
   */
	protected EList<FaceType4> face;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected FxSurfaceInitCubeCommonImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getFxSurfaceInitCubeCommon();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AllType2 getAll() {
    return all;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAll(AllType2 newAll, NotificationChain msgs) {
    AllType2 oldAll = all;
    all = newAll;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__ALL, oldAll, newAll);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAll(AllType2 newAll) {
    if (newAll != all)
    {
      NotificationChain msgs = null;
      if (all != null)
        msgs = ((InternalEObject)all).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__ALL, null, msgs);
      if (newAll != null)
        msgs = ((InternalEObject)newAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__ALL, null, msgs);
      msgs = basicSetAll(newAll, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__ALL, newAll, newAll));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PrimaryType1 getPrimary() {
    return primary;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPrimary(PrimaryType1 newPrimary, NotificationChain msgs) {
    PrimaryType1 oldPrimary = primary;
    primary = newPrimary;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__PRIMARY, oldPrimary, newPrimary);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPrimary(PrimaryType1 newPrimary) {
    if (newPrimary != primary)
    {
      NotificationChain msgs = null;
      if (primary != null)
        msgs = ((InternalEObject)primary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__PRIMARY, null, msgs);
      if (newPrimary != null)
        msgs = ((InternalEObject)newPrimary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__PRIMARY, null, msgs);
      msgs = basicSetPrimary(newPrimary, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__PRIMARY, newPrimary, newPrimary));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FaceType4> getFace() {
    if (face == null)
    {
      face = new EObjectContainmentEList<FaceType4>(FaceType4.class, this, ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__FACE);
    }
    return face;
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
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__ALL:
        return basicSetAll(null, msgs);
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__PRIMARY:
        return basicSetPrimary(null, msgs);
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__FACE:
        return ((InternalEList<?>)getFace()).basicRemove(otherEnd, msgs);
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
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__ALL:
        return getAll();
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__PRIMARY:
        return getPrimary();
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__FACE:
        return getFace();
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
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__ALL:
        setAll((AllType2)newValue);
        return;
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__PRIMARY:
        setPrimary((PrimaryType1)newValue);
        return;
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__FACE:
        getFace().clear();
        getFace().addAll((Collection<? extends FaceType4>)newValue);
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
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__ALL:
        setAll((AllType2)null);
        return;
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__PRIMARY:
        setPrimary((PrimaryType1)null);
        return;
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__FACE:
        getFace().clear();
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
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__ALL:
        return all != null;
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__PRIMARY:
        return primary != null;
      case ColladaPackage.FX_SURFACE_INIT_CUBE_COMMON__FACE:
        return face != null && !face.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FxSurfaceInitCubeCommonImpl
