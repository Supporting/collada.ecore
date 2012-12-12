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
import org.khronos.collada.OrthographicType;
import org.khronos.collada.TargetableFloat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orthographic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.OrthographicTypeImpl#getXmag <em>Xmag</em>}</li>
 *   <li>{@link org.khronos.collada.impl.OrthographicTypeImpl#getYmag <em>Ymag</em>}</li>
 *   <li>{@link org.khronos.collada.impl.OrthographicTypeImpl#getAspectRatio <em>Aspect Ratio</em>}</li>
 *   <li>{@link org.khronos.collada.impl.OrthographicTypeImpl#getYmag1 <em>Ymag1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.OrthographicTypeImpl#getAspectRatio1 <em>Aspect Ratio1</em>}</li>
 *   <li>{@link org.khronos.collada.impl.OrthographicTypeImpl#getZnear <em>Znear</em>}</li>
 *   <li>{@link org.khronos.collada.impl.OrthographicTypeImpl#getZfar <em>Zfar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrthographicTypeImpl extends EObjectImpl implements OrthographicType {
	/**
   * The cached value of the '{@link #getXmag() <em>Xmag</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getXmag()
   * @generated
   * @ordered
   */
	protected TargetableFloat xmag;

	/**
   * The cached value of the '{@link #getYmag() <em>Ymag</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getYmag()
   * @generated
   * @ordered
   */
	protected TargetableFloat ymag;

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
   * The cached value of the '{@link #getYmag1() <em>Ymag1</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getYmag1()
   * @generated
   * @ordered
   */
	protected TargetableFloat ymag1;

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
	protected OrthographicTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getOrthographicType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getXmag() {
    return xmag;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetXmag(TargetableFloat newXmag, NotificationChain msgs) {
    TargetableFloat oldXmag = xmag;
    xmag = newXmag;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.ORTHOGRAPHIC_TYPE__XMAG, oldXmag, newXmag);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setXmag(TargetableFloat newXmag) {
    if (newXmag != xmag)
    {
      NotificationChain msgs = null;
      if (xmag != null)
        msgs = ((InternalEObject)xmag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ORTHOGRAPHIC_TYPE__XMAG, null, msgs);
      if (newXmag != null)
        msgs = ((InternalEObject)newXmag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ORTHOGRAPHIC_TYPE__XMAG, null, msgs);
      msgs = basicSetXmag(newXmag, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ORTHOGRAPHIC_TYPE__XMAG, newXmag, newXmag));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getYmag() {
    return ymag;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetYmag(TargetableFloat newYmag, NotificationChain msgs) {
    TargetableFloat oldYmag = ymag;
    ymag = newYmag;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG, oldYmag, newYmag);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setYmag(TargetableFloat newYmag) {
    if (newYmag != ymag)
    {
      NotificationChain msgs = null;
      if (ymag != null)
        msgs = ((InternalEObject)ymag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG, null, msgs);
      if (newYmag != null)
        msgs = ((InternalEObject)newYmag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG, null, msgs);
      msgs = basicSetYmag(newYmag, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG, newYmag, newYmag));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO, oldAspectRatio, newAspectRatio);
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
        msgs = ((InternalEObject)aspectRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO, null, msgs);
      if (newAspectRatio != null)
        msgs = ((InternalEObject)newAspectRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO, null, msgs);
      msgs = basicSetAspectRatio(newAspectRatio, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO, newAspectRatio, newAspectRatio));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getYmag1() {
    return ymag1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetYmag1(TargetableFloat newYmag1, NotificationChain msgs) {
    TargetableFloat oldYmag1 = ymag1;
    ymag1 = newYmag1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG1, oldYmag1, newYmag1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setYmag1(TargetableFloat newYmag1) {
    if (newYmag1 != ymag1)
    {
      NotificationChain msgs = null;
      if (ymag1 != null)
        msgs = ((InternalEObject)ymag1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG1, null, msgs);
      if (newYmag1 != null)
        msgs = ((InternalEObject)newYmag1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG1, null, msgs);
      msgs = basicSetYmag1(newYmag1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG1, newYmag1, newYmag1));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO1, oldAspectRatio1, newAspectRatio1);
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
        msgs = ((InternalEObject)aspectRatio1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO1, null, msgs);
      if (newAspectRatio1 != null)
        msgs = ((InternalEObject)newAspectRatio1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO1, null, msgs);
      msgs = basicSetAspectRatio1(newAspectRatio1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO1, newAspectRatio1, newAspectRatio1));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.ORTHOGRAPHIC_TYPE__ZNEAR, oldZnear, newZnear);
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
        msgs = ((InternalEObject)znear).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ORTHOGRAPHIC_TYPE__ZNEAR, null, msgs);
      if (newZnear != null)
        msgs = ((InternalEObject)newZnear).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ORTHOGRAPHIC_TYPE__ZNEAR, null, msgs);
      msgs = basicSetZnear(newZnear, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ORTHOGRAPHIC_TYPE__ZNEAR, newZnear, newZnear));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.ORTHOGRAPHIC_TYPE__ZFAR, oldZfar, newZfar);
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
        msgs = ((InternalEObject)zfar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ORTHOGRAPHIC_TYPE__ZFAR, null, msgs);
      if (newZfar != null)
        msgs = ((InternalEObject)newZfar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ORTHOGRAPHIC_TYPE__ZFAR, null, msgs);
      msgs = basicSetZfar(newZfar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ORTHOGRAPHIC_TYPE__ZFAR, newZfar, newZfar));
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
      case ColladaPackage.ORTHOGRAPHIC_TYPE__XMAG:
        return basicSetXmag(null, msgs);
      case ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG:
        return basicSetYmag(null, msgs);
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO:
        return basicSetAspectRatio(null, msgs);
      case ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG1:
        return basicSetYmag1(null, msgs);
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO1:
        return basicSetAspectRatio1(null, msgs);
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ZNEAR:
        return basicSetZnear(null, msgs);
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ZFAR:
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
      case ColladaPackage.ORTHOGRAPHIC_TYPE__XMAG:
        return getXmag();
      case ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG:
        return getYmag();
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO:
        return getAspectRatio();
      case ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG1:
        return getYmag1();
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO1:
        return getAspectRatio1();
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ZNEAR:
        return getZnear();
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ZFAR:
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
      case ColladaPackage.ORTHOGRAPHIC_TYPE__XMAG:
        setXmag((TargetableFloat)newValue);
        return;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG:
        setYmag((TargetableFloat)newValue);
        return;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO:
        setAspectRatio((TargetableFloat)newValue);
        return;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG1:
        setYmag1((TargetableFloat)newValue);
        return;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO1:
        setAspectRatio1((TargetableFloat)newValue);
        return;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ZNEAR:
        setZnear((TargetableFloat)newValue);
        return;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ZFAR:
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
      case ColladaPackage.ORTHOGRAPHIC_TYPE__XMAG:
        setXmag((TargetableFloat)null);
        return;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG:
        setYmag((TargetableFloat)null);
        return;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO:
        setAspectRatio((TargetableFloat)null);
        return;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG1:
        setYmag1((TargetableFloat)null);
        return;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO1:
        setAspectRatio1((TargetableFloat)null);
        return;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ZNEAR:
        setZnear((TargetableFloat)null);
        return;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ZFAR:
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
      case ColladaPackage.ORTHOGRAPHIC_TYPE__XMAG:
        return xmag != null;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG:
        return ymag != null;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO:
        return aspectRatio != null;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__YMAG1:
        return ymag1 != null;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ASPECT_RATIO1:
        return aspectRatio1 != null;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ZNEAR:
        return znear != null;
      case ColladaPackage.ORTHOGRAPHIC_TYPE__ZFAR:
        return zfar != null;
    }
    return super.eIsSet(featureID);
  }

} //OrthographicTypeImpl
