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

import org.khronos.collada.BlendFuncType1;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.DestType1;
import org.khronos.collada.SrcType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blend Func Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.BlendFuncType1Impl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BlendFuncType1Impl#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlendFuncType1Impl extends EObjectImpl implements BlendFuncType1 {
	/**
   * The cached value of the '{@link #getSrc() <em>Src</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSrc()
   * @generated
   * @ordered
   */
	protected SrcType1 src;

	/**
   * The cached value of the '{@link #getDest() <em>Dest</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDest()
   * @generated
   * @ordered
   */
	protected DestType1 dest;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected BlendFuncType1Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getBlendFuncType1();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SrcType1 getSrc() {
    return src;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSrc(SrcType1 newSrc, NotificationChain msgs) {
    SrcType1 oldSrc = src;
    src = newSrc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_FUNC_TYPE1__SRC, oldSrc, newSrc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSrc(SrcType1 newSrc) {
    if (newSrc != src)
    {
      NotificationChain msgs = null;
      if (src != null)
        msgs = ((InternalEObject)src).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_FUNC_TYPE1__SRC, null, msgs);
      if (newSrc != null)
        msgs = ((InternalEObject)newSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_FUNC_TYPE1__SRC, null, msgs);
      msgs = basicSetSrc(newSrc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_FUNC_TYPE1__SRC, newSrc, newSrc));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DestType1 getDest() {
    return dest;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDest(DestType1 newDest, NotificationChain msgs) {
    DestType1 oldDest = dest;
    dest = newDest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_FUNC_TYPE1__DEST, oldDest, newDest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDest(DestType1 newDest) {
    if (newDest != dest)
    {
      NotificationChain msgs = null;
      if (dest != null)
        msgs = ((InternalEObject)dest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_FUNC_TYPE1__DEST, null, msgs);
      if (newDest != null)
        msgs = ((InternalEObject)newDest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLEND_FUNC_TYPE1__DEST, null, msgs);
      msgs = basicSetDest(newDest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLEND_FUNC_TYPE1__DEST, newDest, newDest));
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
      case ColladaPackage.BLEND_FUNC_TYPE1__SRC:
        return basicSetSrc(null, msgs);
      case ColladaPackage.BLEND_FUNC_TYPE1__DEST:
        return basicSetDest(null, msgs);
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
      case ColladaPackage.BLEND_FUNC_TYPE1__SRC:
        return getSrc();
      case ColladaPackage.BLEND_FUNC_TYPE1__DEST:
        return getDest();
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
      case ColladaPackage.BLEND_FUNC_TYPE1__SRC:
        setSrc((SrcType1)newValue);
        return;
      case ColladaPackage.BLEND_FUNC_TYPE1__DEST:
        setDest((DestType1)newValue);
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
      case ColladaPackage.BLEND_FUNC_TYPE1__SRC:
        setSrc((SrcType1)null);
        return;
      case ColladaPackage.BLEND_FUNC_TYPE1__DEST:
        setDest((DestType1)null);
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
      case ColladaPackage.BLEND_FUNC_TYPE1__SRC:
        return src != null;
      case ColladaPackage.BLEND_FUNC_TYPE1__DEST:
        return dest != null;
    }
    return super.eIsSet(featureID);
  }

} //BlendFuncType1Impl
