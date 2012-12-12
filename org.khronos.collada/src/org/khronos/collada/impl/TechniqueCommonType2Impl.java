/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.khronos.collada.ColladaFactory;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.DynamicType;
import org.khronos.collada.InstanceWithExtra;
import org.khronos.collada.MassFrameType;
import org.khronos.collada.PhysicsMaterialType;
import org.khronos.collada.ShapeType;
import org.khronos.collada.TargetableFloat;
import org.khronos.collada.TargetableFloat3;
import org.khronos.collada.OrthographicType;
import org.khronos.collada.PerspectiveType;
import org.khronos.collada.TechniqueCommonType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technique Common Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType2Impl#getOrthographic <em>Orthographic</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType2Impl#getPerspective <em>Perspective</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechniqueCommonType2Impl extends EObjectImpl implements TechniqueCommonType2 {
	/**
   * The cached value of the '{@link #getOrthographic() <em>Orthographic</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOrthographic()
   * @generated
   * @ordered
   */
	protected OrthographicType orthographic;

	/**
   * The cached value of the '{@link #getPerspective() <em>Perspective</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPerspective()
   * @generated
   * @ordered
   */
	protected PerspectiveType perspective;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TechniqueCommonType2Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTechniqueCommonType2();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public OrthographicType getOrthographic() {
    return orthographic;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetOrthographic(OrthographicType newOrthographic, NotificationChain msgs) {
    OrthographicType oldOrthographic = orthographic;
    orthographic = newOrthographic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE2__ORTHOGRAPHIC, oldOrthographic, newOrthographic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setOrthographic(OrthographicType newOrthographic) {
    if (newOrthographic != orthographic)
    {
      NotificationChain msgs = null;
      if (orthographic != null)
        msgs = ((InternalEObject)orthographic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE2__ORTHOGRAPHIC, null, msgs);
      if (newOrthographic != null)
        msgs = ((InternalEObject)newOrthographic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE2__ORTHOGRAPHIC, null, msgs);
      msgs = basicSetOrthographic(newOrthographic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE2__ORTHOGRAPHIC, newOrthographic, newOrthographic));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PerspectiveType getPerspective() {
    return perspective;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPerspective(PerspectiveType newPerspective, NotificationChain msgs) {
    PerspectiveType oldPerspective = perspective;
    perspective = newPerspective;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE2__PERSPECTIVE, oldPerspective, newPerspective);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPerspective(PerspectiveType newPerspective) {
    if (newPerspective != perspective)
    {
      NotificationChain msgs = null;
      if (perspective != null)
        msgs = ((InternalEObject)perspective).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE2__PERSPECTIVE, null, msgs);
      if (newPerspective != null)
        msgs = ((InternalEObject)newPerspective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE2__PERSPECTIVE, null, msgs);
      msgs = basicSetPerspective(newPerspective, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE2__PERSPECTIVE, newPerspective, newPerspective));
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE2__ORTHOGRAPHIC:
        return basicSetOrthographic(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE2__PERSPECTIVE:
        return basicSetPerspective(null, msgs);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE2__ORTHOGRAPHIC:
        return getOrthographic();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE2__PERSPECTIVE:
        return getPerspective();
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE2__ORTHOGRAPHIC:
        setOrthographic((OrthographicType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE2__PERSPECTIVE:
        setPerspective((PerspectiveType)newValue);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE2__ORTHOGRAPHIC:
        setOrthographic((OrthographicType)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE2__PERSPECTIVE:
        setPerspective((PerspectiveType)null);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE2__ORTHOGRAPHIC:
        return orthographic != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE2__PERSPECTIVE:
        return perspective != null;
    }
    return super.eIsSet(featureID);
  }

} //TechniqueCommonType2Impl
