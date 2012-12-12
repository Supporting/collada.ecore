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

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.FaceType1;
import org.khronos.collada.FaceType;
import org.khronos.collada.ModeType;
import org.khronos.collada.PolygonModeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon Mode Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.PolygonModeTypeImpl#getFace <em>Face</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PolygonModeTypeImpl#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolygonModeTypeImpl extends EObjectImpl implements PolygonModeType {
	/**
   * The cached value of the '{@link #getFace() <em>Face</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFace()
   * @generated
   * @ordered
   */
	protected FaceType face;

	/**
   * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
	protected ModeType mode;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PolygonModeTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getPolygonModeType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FaceType getFace() {
    return face;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFace(FaceType newFace, NotificationChain msgs) {
    FaceType oldFace = face;
    face = newFace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.POLYGON_MODE_TYPE__FACE, oldFace, newFace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFace(FaceType newFace) {
    if (newFace != face)
    {
      NotificationChain msgs = null;
      if (face != null)
        msgs = ((InternalEObject)face).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.POLYGON_MODE_TYPE__FACE, null, msgs);
      if (newFace != null)
        msgs = ((InternalEObject)newFace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.POLYGON_MODE_TYPE__FACE, null, msgs);
      msgs = basicSetFace(newFace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.POLYGON_MODE_TYPE__FACE, newFace, newFace));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ModeType getMode() {
    return mode;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMode(ModeType newMode, NotificationChain msgs) {
    ModeType oldMode = mode;
    mode = newMode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.POLYGON_MODE_TYPE__MODE, oldMode, newMode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMode(ModeType newMode) {
    if (newMode != mode)
    {
      NotificationChain msgs = null;
      if (mode != null)
        msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.POLYGON_MODE_TYPE__MODE, null, msgs);
      if (newMode != null)
        msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.POLYGON_MODE_TYPE__MODE, null, msgs);
      msgs = basicSetMode(newMode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.POLYGON_MODE_TYPE__MODE, newMode, newMode));
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
      case ColladaPackage.POLYGON_MODE_TYPE__FACE:
        return basicSetFace(null, msgs);
      case ColladaPackage.POLYGON_MODE_TYPE__MODE:
        return basicSetMode(null, msgs);
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
      case ColladaPackage.POLYGON_MODE_TYPE__FACE:
        return getFace();
      case ColladaPackage.POLYGON_MODE_TYPE__MODE:
        return getMode();
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
      case ColladaPackage.POLYGON_MODE_TYPE__FACE:
        setFace((FaceType)newValue);
        return;
      case ColladaPackage.POLYGON_MODE_TYPE__MODE:
        setMode((ModeType)newValue);
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
      case ColladaPackage.POLYGON_MODE_TYPE__FACE:
        setFace((FaceType)null);
        return;
      case ColladaPackage.POLYGON_MODE_TYPE__MODE:
        setMode((ModeType)null);
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
      case ColladaPackage.POLYGON_MODE_TYPE__FACE:
        return face != null;
      case ColladaPackage.POLYGON_MODE_TYPE__MODE:
        return mode != null;
    }
    return super.eIsSet(featureID);
  }

} //PolygonModeTypeImpl
