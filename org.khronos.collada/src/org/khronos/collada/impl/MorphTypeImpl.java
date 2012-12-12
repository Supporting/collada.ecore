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
import org.khronos.collada.ExtraType;
import org.khronos.collada.MorphMethodType;
import org.khronos.collada.MorphType;
import org.khronos.collada.SourceType;
import org.khronos.collada.TargetsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Morph Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.MorphTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MorphTypeImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MorphTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MorphTypeImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MorphTypeImpl#getSource1 <em>Source1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MorphTypeImpl extends EObjectImpl implements MorphType {
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
   * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTargets()
   * @generated
   * @ordered
   */
	protected TargetsType targets;

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
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
	protected static final MorphMethodType METHOD_EDEFAULT = MorphMethodType.NORMALIZED;

	/**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
	protected MorphMethodType method = METHOD_EDEFAULT;

	/**
   * This is true if the Method attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean methodESet;

	/**
   * The default value of the '{@link #getSource1() <em>Source1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource1()
   * @generated
   * @ordered
   */
	protected static final String SOURCE1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSource1() <em>Source1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource1()
   * @generated
   * @ordered
   */
	protected String source1 = SOURCE1_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MorphTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getMorphType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SourceType> getSource() {
    if (source == null)
    {
      source = new EObjectContainmentEList<SourceType>(SourceType.class, this, ColladaPackage.MORPH_TYPE__SOURCE);
    }
    return source;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetsType getTargets() {
    return targets;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTargets(TargetsType newTargets, NotificationChain msgs) {
    TargetsType oldTargets = targets;
    targets = newTargets;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.MORPH_TYPE__TARGETS, oldTargets, newTargets);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTargets(TargetsType newTargets) {
    if (newTargets != targets)
    {
      NotificationChain msgs = null;
      if (targets != null)
        msgs = ((InternalEObject)targets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.MORPH_TYPE__TARGETS, null, msgs);
      if (newTargets != null)
        msgs = ((InternalEObject)newTargets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.MORPH_TYPE__TARGETS, null, msgs);
      msgs = basicSetTargets(newTargets, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.MORPH_TYPE__TARGETS, newTargets, newTargets));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.MORPH_TYPE__EXTRA);
    }
    return extra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MorphMethodType getMethod() {
    return method;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMethod(MorphMethodType newMethod) {
    MorphMethodType oldMethod = method;
    method = newMethod == null ? METHOD_EDEFAULT : newMethod;
    boolean oldMethodESet = methodESet;
    methodESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.MORPH_TYPE__METHOD, oldMethod, method, !oldMethodESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMethod() {
    MorphMethodType oldMethod = method;
    boolean oldMethodESet = methodESet;
    method = METHOD_EDEFAULT;
    methodESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.MORPH_TYPE__METHOD, oldMethod, METHOD_EDEFAULT, oldMethodESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMethod() {
    return methodESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSource1() {
    return source1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSource1(String newSource1) {
    String oldSource1 = source1;
    source1 = newSource1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.MORPH_TYPE__SOURCE1, oldSource1, source1));
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
      case ColladaPackage.MORPH_TYPE__SOURCE:
        return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
      case ColladaPackage.MORPH_TYPE__TARGETS:
        return basicSetTargets(null, msgs);
      case ColladaPackage.MORPH_TYPE__EXTRA:
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
      case ColladaPackage.MORPH_TYPE__SOURCE:
        return getSource();
      case ColladaPackage.MORPH_TYPE__TARGETS:
        return getTargets();
      case ColladaPackage.MORPH_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.MORPH_TYPE__METHOD:
        return getMethod();
      case ColladaPackage.MORPH_TYPE__SOURCE1:
        return getSource1();
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
      case ColladaPackage.MORPH_TYPE__SOURCE:
        getSource().clear();
        getSource().addAll((Collection<? extends SourceType>)newValue);
        return;
      case ColladaPackage.MORPH_TYPE__TARGETS:
        setTargets((TargetsType)newValue);
        return;
      case ColladaPackage.MORPH_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.MORPH_TYPE__METHOD:
        setMethod((MorphMethodType)newValue);
        return;
      case ColladaPackage.MORPH_TYPE__SOURCE1:
        setSource1((String)newValue);
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
      case ColladaPackage.MORPH_TYPE__SOURCE:
        getSource().clear();
        return;
      case ColladaPackage.MORPH_TYPE__TARGETS:
        setTargets((TargetsType)null);
        return;
      case ColladaPackage.MORPH_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.MORPH_TYPE__METHOD:
        unsetMethod();
        return;
      case ColladaPackage.MORPH_TYPE__SOURCE1:
        setSource1(SOURCE1_EDEFAULT);
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
      case ColladaPackage.MORPH_TYPE__SOURCE:
        return source != null && !source.isEmpty();
      case ColladaPackage.MORPH_TYPE__TARGETS:
        return targets != null;
      case ColladaPackage.MORPH_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.MORPH_TYPE__METHOD:
        return isSetMethod();
      case ColladaPackage.MORPH_TYPE__SOURCE1:
        return SOURCE1_EDEFAULT == null ? source1 != null : !SOURCE1_EDEFAULT.equals(source1);
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
    result.append(" (method: ");
    if (methodESet) result.append(method); else result.append("<unset>");
    result.append(", source1: ");
    result.append(source1);
    result.append(')');
    return result.toString();
  }

} //MorphTypeImpl
