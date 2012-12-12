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

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ControlVerticesType;
import org.khronos.collada.ExtraType;
import org.khronos.collada.SourceType;
import org.khronos.collada.SplineType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spline Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.SplineTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SplineTypeImpl#getControlVertices <em>Control Vertices</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SplineTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SplineTypeImpl#isClosed <em>Closed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SplineTypeImpl extends EObjectImpl implements SplineType {
	/**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
	protected EList<SourceType> source;

	/**
   * The cached value of the '{@link #getControlVertices() <em>Control Vertices</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getControlVertices()
   * @generated
   * @ordered
   */
	protected ControlVerticesType controlVertices;

	/**
   * The cached value of the '{@link #getExtra() <em>Extra</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getExtra()
   * @generated
   * @ordered
   */
	protected EList<ExtraType> extra;

	/**
   * The default value of the '{@link #isClosed() <em>Closed</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isClosed()
   * @generated
   * @ordered
   */
	protected static final boolean CLOSED_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isClosed() <em>Closed</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isClosed()
   * @generated
   * @ordered
   */
	protected boolean closed = CLOSED_EDEFAULT;

	/**
   * This is true if the Closed attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean closedESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SplineTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getSplineType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SourceType> getSource() {
    if (source == null)
    {
      source = new EObjectContainmentEList<SourceType>(SourceType.class, this, ColladaPackage.SPLINE_TYPE__SOURCE);
    }
    return source;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ControlVerticesType getControlVertices() {
    return controlVertices;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetControlVertices(ControlVerticesType newControlVertices, NotificationChain msgs) {
    ControlVerticesType oldControlVertices = controlVertices;
    controlVertices = newControlVertices;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SPLINE_TYPE__CONTROL_VERTICES, oldControlVertices, newControlVertices);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setControlVertices(ControlVerticesType newControlVertices) {
    if (newControlVertices != controlVertices)
    {
      NotificationChain msgs = null;
      if (controlVertices != null)
        msgs = ((InternalEObject)controlVertices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPLINE_TYPE__CONTROL_VERTICES, null, msgs);
      if (newControlVertices != null)
        msgs = ((InternalEObject)newControlVertices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SPLINE_TYPE__CONTROL_VERTICES, null, msgs);
      msgs = basicSetControlVertices(newControlVertices, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SPLINE_TYPE__CONTROL_VERTICES, newControlVertices, newControlVertices));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.SPLINE_TYPE__EXTRA);
    }
    return extra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isClosed() {
    return closed;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setClosed(boolean newClosed) {
    boolean oldClosed = closed;
    closed = newClosed;
    boolean oldClosedESet = closedESet;
    closedESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SPLINE_TYPE__CLOSED, oldClosed, closed, !oldClosedESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetClosed() {
    boolean oldClosed = closed;
    boolean oldClosedESet = closedESet;
    closed = CLOSED_EDEFAULT;
    closedESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.SPLINE_TYPE__CLOSED, oldClosed, CLOSED_EDEFAULT, oldClosedESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetClosed() {
    return closedESet;
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
      case ColladaPackage.SPLINE_TYPE__SOURCE:
        return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
      case ColladaPackage.SPLINE_TYPE__CONTROL_VERTICES:
        return basicSetControlVertices(null, msgs);
      case ColladaPackage.SPLINE_TYPE__EXTRA:
        return ((InternalEList<?>)getExtra()).basicRemove(otherEnd, msgs);
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
      case ColladaPackage.SPLINE_TYPE__SOURCE:
        return getSource();
      case ColladaPackage.SPLINE_TYPE__CONTROL_VERTICES:
        return getControlVertices();
      case ColladaPackage.SPLINE_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.SPLINE_TYPE__CLOSED:
        return isClosed();
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
      case ColladaPackage.SPLINE_TYPE__SOURCE:
        getSource().clear();
        getSource().addAll((Collection<? extends SourceType>)newValue);
        return;
      case ColladaPackage.SPLINE_TYPE__CONTROL_VERTICES:
        setControlVertices((ControlVerticesType)newValue);
        return;
      case ColladaPackage.SPLINE_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.SPLINE_TYPE__CLOSED:
        setClosed((Boolean)newValue);
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
      case ColladaPackage.SPLINE_TYPE__SOURCE:
        getSource().clear();
        return;
      case ColladaPackage.SPLINE_TYPE__CONTROL_VERTICES:
        setControlVertices((ControlVerticesType)null);
        return;
      case ColladaPackage.SPLINE_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.SPLINE_TYPE__CLOSED:
        unsetClosed();
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
      case ColladaPackage.SPLINE_TYPE__SOURCE:
        return source != null && !source.isEmpty();
      case ColladaPackage.SPLINE_TYPE__CONTROL_VERTICES:
        return controlVertices != null;
      case ColladaPackage.SPLINE_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.SPLINE_TYPE__CLOSED:
        return isSetClosed();
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
    result.append(" (closed: ");
    if (closedESet) result.append(closed); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //SplineTypeImpl
