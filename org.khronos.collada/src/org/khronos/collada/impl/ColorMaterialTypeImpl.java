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
import org.khronos.collada.ColorMaterialType;
import org.khronos.collada.FaceType3;
import org.khronos.collada.ModeType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Material Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.ColorMaterialTypeImpl#getFace <em>Face</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ColorMaterialTypeImpl#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorMaterialTypeImpl extends EObjectImpl implements ColorMaterialType {
	/**
   * The cached value of the '{@link #getFace() <em>Face</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFace()
   * @generated
   * @ordered
   */
	protected FaceType3 face;

	/**
   * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
	protected ModeType1 mode;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ColorMaterialTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getColorMaterialType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FaceType3 getFace() {
    return face;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFace(FaceType3 newFace, NotificationChain msgs) {
    FaceType3 oldFace = face;
    face = newFace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.COLOR_MATERIAL_TYPE__FACE, oldFace, newFace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFace(FaceType3 newFace) {
    if (newFace != face)
    {
      NotificationChain msgs = null;
      if (face != null)
        msgs = ((InternalEObject)face).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COLOR_MATERIAL_TYPE__FACE, null, msgs);
      if (newFace != null)
        msgs = ((InternalEObject)newFace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COLOR_MATERIAL_TYPE__FACE, null, msgs);
      msgs = basicSetFace(newFace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COLOR_MATERIAL_TYPE__FACE, newFace, newFace));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ModeType1 getMode() {
    return mode;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMode(ModeType1 newMode, NotificationChain msgs) {
    ModeType1 oldMode = mode;
    mode = newMode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.COLOR_MATERIAL_TYPE__MODE, oldMode, newMode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMode(ModeType1 newMode) {
    if (newMode != mode)
    {
      NotificationChain msgs = null;
      if (mode != null)
        msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COLOR_MATERIAL_TYPE__MODE, null, msgs);
      if (newMode != null)
        msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COLOR_MATERIAL_TYPE__MODE, null, msgs);
      msgs = basicSetMode(newMode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COLOR_MATERIAL_TYPE__MODE, newMode, newMode));
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
      case ColladaPackage.COLOR_MATERIAL_TYPE__FACE:
        return basicSetFace(null, msgs);
      case ColladaPackage.COLOR_MATERIAL_TYPE__MODE:
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
      case ColladaPackage.COLOR_MATERIAL_TYPE__FACE:
        return getFace();
      case ColladaPackage.COLOR_MATERIAL_TYPE__MODE:
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
      case ColladaPackage.COLOR_MATERIAL_TYPE__FACE:
        setFace((FaceType3)newValue);
        return;
      case ColladaPackage.COLOR_MATERIAL_TYPE__MODE:
        setMode((ModeType1)newValue);
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
      case ColladaPackage.COLOR_MATERIAL_TYPE__FACE:
        setFace((FaceType3)null);
        return;
      case ColladaPackage.COLOR_MATERIAL_TYPE__MODE:
        setMode((ModeType1)null);
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
      case ColladaPackage.COLOR_MATERIAL_TYPE__FACE:
        return face != null;
      case ColladaPackage.COLOR_MATERIAL_TYPE__MODE:
        return mode != null;
    }
    return super.eIsSet(featureID);
  }

} //ColorMaterialTypeImpl
