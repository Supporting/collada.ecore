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
import org.khronos.collada.PerspectiveType;
import org.khronos.collada.TargetableFloat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perspective Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.PerspectiveTypeImpl#getXfov <em>Xfov</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PerspectiveTypeImpl#getYfov <em>Yfov</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PerspectiveTypeImpl#getAspectRatio <em>Aspect Ratio</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PerspectiveTypeImpl#getYfov1 <em>Yfov1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PerspectiveTypeImpl#getAspectRatio1 <em>Aspect Ratio1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PerspectiveTypeImpl#getZnear <em>Znear</em>}</li>
 *   <li>{@link org.khronos.collada.impl.PerspectiveTypeImpl#getZfar <em>Zfar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerspectiveTypeImpl extends EObjectImpl implements PerspectiveType {
	/**
   * The cached value of the '{@link #getXfov() <em>Xfov</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getXfov()
   * @generated
   * @ordered
   */
	protected TargetableFloat xfov;

	/**
   * The cached value of the '{@link #getYfov() <em>Yfov</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getYfov()
   * @generated
   * @ordered
   */
	protected TargetableFloat yfov;

	/**
   * The cached value of the '{@link #getAspectRatio() <em>Aspect Ratio</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAspectRatio()
   * @generated
   * @ordered
   */
	protected TargetableFloat aspectRatio;

	/**
   * The cached value of the '{@link #getYfov1() <em>Yfov1</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getYfov1()
   * @generated
   * @ordered
   */
	protected TargetableFloat yfov1;

	/**
   * The cached value of the '{@link #getAspectRatio1() <em>Aspect Ratio1</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAspectRatio1()
   * @generated
   * @ordered
   */
	protected TargetableFloat aspectRatio1;

	/**
   * The cached value of the '{@link #getZnear() <em>Znear</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getZnear()
   * @generated
   * @ordered
   */
	protected TargetableFloat znear;

	/**
   * The cached value of the '{@link #getZfar() <em>Zfar</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getZfar()
   * @generated
   * @ordered
   */
	protected TargetableFloat zfar;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PerspectiveTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getPerspectiveType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getXfov() {
    return xfov;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetXfov(TargetableFloat newXfov, NotificationChain msgs) {
    TargetableFloat oldXfov = xfov;
    xfov = newXfov;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.PERSPECTIVE_TYPE__XFOV, oldXfov, newXfov);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setXfov(TargetableFloat newXfov) {
    if (newXfov != xfov)
    {
      NotificationChain msgs = null;
      if (xfov != null)
        msgs = ((InternalEObject)xfov).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PERSPECTIVE_TYPE__XFOV, null, msgs);
      if (newXfov != null)
        msgs = ((InternalEObject)newXfov).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PERSPECTIVE_TYPE__XFOV, null, msgs);
      msgs = basicSetXfov(newXfov, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PERSPECTIVE_TYPE__XFOV, newXfov, newXfov));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getYfov() {
    return yfov;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetYfov(TargetableFloat newYfov, NotificationChain msgs) {
    TargetableFloat oldYfov = yfov;
    yfov = newYfov;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.PERSPECTIVE_TYPE__YFOV, oldYfov, newYfov);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setYfov(TargetableFloat newYfov) {
    if (newYfov != yfov)
    {
      NotificationChain msgs = null;
      if (yfov != null)
        msgs = ((InternalEObject)yfov).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PERSPECTIVE_TYPE__YFOV, null, msgs);
      if (newYfov != null)
        msgs = ((InternalEObject)newYfov).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PERSPECTIVE_TYPE__YFOV, null, msgs);
      msgs = basicSetYfov(newYfov, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PERSPECTIVE_TYPE__YFOV, newYfov, newYfov));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getAspectRatio() {
    return aspectRatio;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAspectRatio(TargetableFloat newAspectRatio, NotificationChain msgs) {
    TargetableFloat oldAspectRatio = aspectRatio;
    aspectRatio = newAspectRatio;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO, oldAspectRatio, newAspectRatio);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAspectRatio(TargetableFloat newAspectRatio) {
    if (newAspectRatio != aspectRatio)
    {
      NotificationChain msgs = null;
      if (aspectRatio != null)
        msgs = ((InternalEObject)aspectRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO, null, msgs);
      if (newAspectRatio != null)
        msgs = ((InternalEObject)newAspectRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO, null, msgs);
      msgs = basicSetAspectRatio(newAspectRatio, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO, newAspectRatio, newAspectRatio));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getYfov1() {
    return yfov1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetYfov1(TargetableFloat newYfov1, NotificationChain msgs) {
    TargetableFloat oldYfov1 = yfov1;
    yfov1 = newYfov1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.PERSPECTIVE_TYPE__YFOV1, oldYfov1, newYfov1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setYfov1(TargetableFloat newYfov1) {
    if (newYfov1 != yfov1)
    {
      NotificationChain msgs = null;
      if (yfov1 != null)
        msgs = ((InternalEObject)yfov1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PERSPECTIVE_TYPE__YFOV1, null, msgs);
      if (newYfov1 != null)
        msgs = ((InternalEObject)newYfov1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PERSPECTIVE_TYPE__YFOV1, null, msgs);
      msgs = basicSetYfov1(newYfov1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PERSPECTIVE_TYPE__YFOV1, newYfov1, newYfov1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getAspectRatio1() {
    return aspectRatio1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAspectRatio1(TargetableFloat newAspectRatio1, NotificationChain msgs) {
    TargetableFloat oldAspectRatio1 = aspectRatio1;
    aspectRatio1 = newAspectRatio1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO1, oldAspectRatio1, newAspectRatio1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAspectRatio1(TargetableFloat newAspectRatio1) {
    if (newAspectRatio1 != aspectRatio1)
    {
      NotificationChain msgs = null;
      if (aspectRatio1 != null)
        msgs = ((InternalEObject)aspectRatio1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO1, null, msgs);
      if (newAspectRatio1 != null)
        msgs = ((InternalEObject)newAspectRatio1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO1, null, msgs);
      msgs = basicSetAspectRatio1(newAspectRatio1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO1, newAspectRatio1, newAspectRatio1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getZnear() {
    return znear;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetZnear(TargetableFloat newZnear, NotificationChain msgs) {
    TargetableFloat oldZnear = znear;
    znear = newZnear;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.PERSPECTIVE_TYPE__ZNEAR, oldZnear, newZnear);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setZnear(TargetableFloat newZnear) {
    if (newZnear != znear)
    {
      NotificationChain msgs = null;
      if (znear != null)
        msgs = ((InternalEObject)znear).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PERSPECTIVE_TYPE__ZNEAR, null, msgs);
      if (newZnear != null)
        msgs = ((InternalEObject)newZnear).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PERSPECTIVE_TYPE__ZNEAR, null, msgs);
      msgs = basicSetZnear(newZnear, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PERSPECTIVE_TYPE__ZNEAR, newZnear, newZnear));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getZfar() {
    return zfar;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetZfar(TargetableFloat newZfar, NotificationChain msgs) {
    TargetableFloat oldZfar = zfar;
    zfar = newZfar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.PERSPECTIVE_TYPE__ZFAR, oldZfar, newZfar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setZfar(TargetableFloat newZfar) {
    if (newZfar != zfar)
    {
      NotificationChain msgs = null;
      if (zfar != null)
        msgs = ((InternalEObject)zfar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PERSPECTIVE_TYPE__ZFAR, null, msgs);
      if (newZfar != null)
        msgs = ((InternalEObject)newZfar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.PERSPECTIVE_TYPE__ZFAR, null, msgs);
      msgs = basicSetZfar(newZfar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PERSPECTIVE_TYPE__ZFAR, newZfar, newZfar));
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
      case ColladaPackage.PERSPECTIVE_TYPE__XFOV:
        return basicSetXfov(null, msgs);
      case ColladaPackage.PERSPECTIVE_TYPE__YFOV:
        return basicSetYfov(null, msgs);
      case ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO:
        return basicSetAspectRatio(null, msgs);
      case ColladaPackage.PERSPECTIVE_TYPE__YFOV1:
        return basicSetYfov1(null, msgs);
      case ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO1:
        return basicSetAspectRatio1(null, msgs);
      case ColladaPackage.PERSPECTIVE_TYPE__ZNEAR:
        return basicSetZnear(null, msgs);
      case ColladaPackage.PERSPECTIVE_TYPE__ZFAR:
        return basicSetZfar(null, msgs);
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
      case ColladaPackage.PERSPECTIVE_TYPE__XFOV:
        return getXfov();
      case ColladaPackage.PERSPECTIVE_TYPE__YFOV:
        return getYfov();
      case ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO:
        return getAspectRatio();
      case ColladaPackage.PERSPECTIVE_TYPE__YFOV1:
        return getYfov1();
      case ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO1:
        return getAspectRatio1();
      case ColladaPackage.PERSPECTIVE_TYPE__ZNEAR:
        return getZnear();
      case ColladaPackage.PERSPECTIVE_TYPE__ZFAR:
        return getZfar();
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
      case ColladaPackage.PERSPECTIVE_TYPE__XFOV:
        setXfov((TargetableFloat)newValue);
        return;
      case ColladaPackage.PERSPECTIVE_TYPE__YFOV:
        setYfov((TargetableFloat)newValue);
        return;
      case ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO:
        setAspectRatio((TargetableFloat)newValue);
        return;
      case ColladaPackage.PERSPECTIVE_TYPE__YFOV1:
        setYfov1((TargetableFloat)newValue);
        return;
      case ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO1:
        setAspectRatio1((TargetableFloat)newValue);
        return;
      case ColladaPackage.PERSPECTIVE_TYPE__ZNEAR:
        setZnear((TargetableFloat)newValue);
        return;
      case ColladaPackage.PERSPECTIVE_TYPE__ZFAR:
        setZfar((TargetableFloat)newValue);
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
      case ColladaPackage.PERSPECTIVE_TYPE__XFOV:
        setXfov((TargetableFloat)null);
        return;
      case ColladaPackage.PERSPECTIVE_TYPE__YFOV:
        setYfov((TargetableFloat)null);
        return;
      case ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO:
        setAspectRatio((TargetableFloat)null);
        return;
      case ColladaPackage.PERSPECTIVE_TYPE__YFOV1:
        setYfov1((TargetableFloat)null);
        return;
      case ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO1:
        setAspectRatio1((TargetableFloat)null);
        return;
      case ColladaPackage.PERSPECTIVE_TYPE__ZNEAR:
        setZnear((TargetableFloat)null);
        return;
      case ColladaPackage.PERSPECTIVE_TYPE__ZFAR:
        setZfar((TargetableFloat)null);
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
      case ColladaPackage.PERSPECTIVE_TYPE__XFOV:
        return xfov != null;
      case ColladaPackage.PERSPECTIVE_TYPE__YFOV:
        return yfov != null;
      case ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO:
        return aspectRatio != null;
      case ColladaPackage.PERSPECTIVE_TYPE__YFOV1:
        return yfov1 != null;
      case ColladaPackage.PERSPECTIVE_TYPE__ASPECT_RATIO1:
        return aspectRatio1 != null;
      case ColladaPackage.PERSPECTIVE_TYPE__ZNEAR:
        return znear != null;
      case ColladaPackage.PERSPECTIVE_TYPE__ZFAR:
        return zfar != null;
    }
    return super.eIsSet(featureID);
  }

} //PerspectiveTypeImpl
