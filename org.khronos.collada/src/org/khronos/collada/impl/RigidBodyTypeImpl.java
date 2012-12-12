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
import org.khronos.collada.RigidBodyType;
import org.khronos.collada.TechniqueCommonType4;
import org.khronos.collada.TechniqueCommonType1;
import org.khronos.collada.TechniqueType4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rigid Body Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.RigidBodyTypeImpl#getTechniqueCommon <em>Technique Common</em>}</li>
 *   <li>{@link org.khronos.collada.impl.RigidBodyTypeImpl#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.impl.RigidBodyTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.RigidBodyTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.impl.RigidBodyTypeImpl#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RigidBodyTypeImpl extends EObjectImpl implements RigidBodyType {
	/**
   * The cached value of the '{@link #getTechniqueCommon() <em>Technique Common</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTechniqueCommon()
   * @generated
   * @ordered
   */
	protected TechniqueCommonType1 techniqueCommon;

	/**
   * The cached value of the '{@link #getTechnique() <em>Technique</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTechnique()
   * @generated
   * @ordered
   */
	protected EList<TechniqueType4> technique;

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
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected static final String NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected String name = NAME_EDEFAULT;

	/**
   * The default value of the '{@link #getSid() <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSid()
   * @generated
   * @ordered
   */
	protected static final String SID_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSid() <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSid()
   * @generated
   * @ordered
   */
	protected String sid = SID_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected RigidBodyTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getRigidBodyType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueCommonType1 getTechniqueCommon() {
    return techniqueCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTechniqueCommon(TechniqueCommonType1 newTechniqueCommon, NotificationChain msgs) {
    TechniqueCommonType1 oldTechniqueCommon = techniqueCommon;
    techniqueCommon = newTechniqueCommon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.RIGID_BODY_TYPE__TECHNIQUE_COMMON, oldTechniqueCommon, newTechniqueCommon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTechniqueCommon(TechniqueCommonType1 newTechniqueCommon) {
    if (newTechniqueCommon != techniqueCommon)
    {
      NotificationChain msgs = null;
      if (techniqueCommon != null)
        msgs = ((InternalEObject)techniqueCommon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.RIGID_BODY_TYPE__TECHNIQUE_COMMON, null, msgs);
      if (newTechniqueCommon != null)
        msgs = ((InternalEObject)newTechniqueCommon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.RIGID_BODY_TYPE__TECHNIQUE_COMMON, null, msgs);
      msgs = basicSetTechniqueCommon(newTechniqueCommon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.RIGID_BODY_TYPE__TECHNIQUE_COMMON, newTechniqueCommon, newTechniqueCommon));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TechniqueType4> getTechnique() {
    if (technique == null)
    {
      technique = new EObjectContainmentEList<TechniqueType4>(TechniqueType4.class, this, ColladaPackage.RIGID_BODY_TYPE__TECHNIQUE);
    }
    return technique;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.RIGID_BODY_TYPE__EXTRA);
    }
    return extra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.RIGID_BODY_TYPE__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSid() {
    return sid;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSid(String newSid) {
    String oldSid = sid;
    sid = newSid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.RIGID_BODY_TYPE__SID, oldSid, sid));
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
      case ColladaPackage.RIGID_BODY_TYPE__TECHNIQUE_COMMON:
        return basicSetTechniqueCommon(null, msgs);
      case ColladaPackage.RIGID_BODY_TYPE__TECHNIQUE:
        return ((InternalEList<?>)getTechnique()).basicRemove(otherEnd, msgs);
      case ColladaPackage.RIGID_BODY_TYPE__EXTRA:
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
      case ColladaPackage.RIGID_BODY_TYPE__TECHNIQUE_COMMON:
        return getTechniqueCommon();
      case ColladaPackage.RIGID_BODY_TYPE__TECHNIQUE:
        return getTechnique();
      case ColladaPackage.RIGID_BODY_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.RIGID_BODY_TYPE__NAME:
        return getName();
      case ColladaPackage.RIGID_BODY_TYPE__SID:
        return getSid();
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
      case ColladaPackage.RIGID_BODY_TYPE__TECHNIQUE_COMMON:
        setTechniqueCommon((TechniqueCommonType1)newValue);
        return;
      case ColladaPackage.RIGID_BODY_TYPE__TECHNIQUE:
        getTechnique().clear();
        getTechnique().addAll((Collection<? extends TechniqueType4>)newValue);
        return;
      case ColladaPackage.RIGID_BODY_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.RIGID_BODY_TYPE__NAME:
        setName((String)newValue);
        return;
      case ColladaPackage.RIGID_BODY_TYPE__SID:
        setSid((String)newValue);
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
      case ColladaPackage.RIGID_BODY_TYPE__TECHNIQUE_COMMON:
        setTechniqueCommon((TechniqueCommonType1)null);
        return;
      case ColladaPackage.RIGID_BODY_TYPE__TECHNIQUE:
        getTechnique().clear();
        return;
      case ColladaPackage.RIGID_BODY_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.RIGID_BODY_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ColladaPackage.RIGID_BODY_TYPE__SID:
        setSid(SID_EDEFAULT);
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
      case ColladaPackage.RIGID_BODY_TYPE__TECHNIQUE_COMMON:
        return techniqueCommon != null;
      case ColladaPackage.RIGID_BODY_TYPE__TECHNIQUE:
        return technique != null && !technique.isEmpty();
      case ColladaPackage.RIGID_BODY_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.RIGID_BODY_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ColladaPackage.RIGID_BODY_TYPE__SID:
        return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", sid: ");
    result.append(sid);
    result.append(')');
    return result.toString();
  }

} //RigidBodyTypeImpl
