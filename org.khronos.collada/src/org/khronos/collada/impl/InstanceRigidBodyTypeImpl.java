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
import org.khronos.collada.InstanceRigidBodyType;
import org.khronos.collada.TechniqueCommonType2;
import org.khronos.collada.TechniqueCommonType6;
import org.khronos.collada.TechniqueType4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Rigid Body Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.InstanceRigidBodyTypeImpl#getTechniqueCommon <em>Technique Common</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceRigidBodyTypeImpl#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceRigidBodyTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceRigidBodyTypeImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceRigidBodyTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceRigidBodyTypeImpl#getSid <em>Sid</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceRigidBodyTypeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceRigidBodyTypeImpl extends EObjectImpl implements InstanceRigidBodyType {
	/**
   * The cached value of the '{@link #getTechniqueCommon() <em>Technique Common</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTechniqueCommon()
   * @generated
   * @ordered
   */
	protected TechniqueCommonType6 techniqueCommon;

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
   * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
	protected static final String BODY_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
	protected String body = BODY_EDEFAULT;

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
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
	protected static final String TARGET_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
	protected String target = TARGET_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected InstanceRigidBodyTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getInstanceRigidBodyType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueCommonType6 getTechniqueCommon() {
    return techniqueCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTechniqueCommon(TechniqueCommonType6 newTechniqueCommon, NotificationChain msgs) {
    TechniqueCommonType6 oldTechniqueCommon = techniqueCommon;
    techniqueCommon = newTechniqueCommon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TECHNIQUE_COMMON, oldTechniqueCommon, newTechniqueCommon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTechniqueCommon(TechniqueCommonType6 newTechniqueCommon) {
    if (newTechniqueCommon != techniqueCommon)
    {
      NotificationChain msgs = null;
      if (techniqueCommon != null)
        msgs = ((InternalEObject)techniqueCommon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TECHNIQUE_COMMON, null, msgs);
      if (newTechniqueCommon != null)
        msgs = ((InternalEObject)newTechniqueCommon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TECHNIQUE_COMMON, null, msgs);
      msgs = basicSetTechniqueCommon(newTechniqueCommon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TECHNIQUE_COMMON, newTechniqueCommon, newTechniqueCommon));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TechniqueType4> getTechnique() {
    if (technique == null)
    {
      technique = new EObjectContainmentEList<TechniqueType4>(TechniqueType4.class, this, ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TECHNIQUE);
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
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.INSTANCE_RIGID_BODY_TYPE__EXTRA);
    }
    return extra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getBody() {
    return body;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBody(String newBody) {
    String oldBody = body;
    body = newBody;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_RIGID_BODY_TYPE__BODY, oldBody, body));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_RIGID_BODY_TYPE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_RIGID_BODY_TYPE__SID, oldSid, sid));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getTarget() {
    return target;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTarget(String newTarget) {
    String oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TARGET, oldTarget, target));
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
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TECHNIQUE_COMMON:
        return basicSetTechniqueCommon(null, msgs);
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TECHNIQUE:
        return ((InternalEList<?>)getTechnique()).basicRemove(otherEnd, msgs);
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__EXTRA:
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
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TECHNIQUE_COMMON:
        return getTechniqueCommon();
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TECHNIQUE:
        return getTechnique();
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__BODY:
        return getBody();
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__NAME:
        return getName();
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__SID:
        return getSid();
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TARGET:
        return getTarget();
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
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TECHNIQUE_COMMON:
        setTechniqueCommon((TechniqueCommonType6)newValue);
        return;
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TECHNIQUE:
        getTechnique().clear();
        getTechnique().addAll((Collection<? extends TechniqueType4>)newValue);
        return;
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__BODY:
        setBody((String)newValue);
        return;
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__NAME:
        setName((String)newValue);
        return;
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__SID:
        setSid((String)newValue);
        return;
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TARGET:
        setTarget((String)newValue);
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
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TECHNIQUE_COMMON:
        setTechniqueCommon((TechniqueCommonType6)null);
        return;
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TECHNIQUE:
        getTechnique().clear();
        return;
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__BODY:
        setBody(BODY_EDEFAULT);
        return;
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__SID:
        setSid(SID_EDEFAULT);
        return;
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TARGET:
        setTarget(TARGET_EDEFAULT);
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
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TECHNIQUE_COMMON:
        return techniqueCommon != null;
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TECHNIQUE:
        return technique != null && !technique.isEmpty();
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__BODY:
        return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__SID:
        return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
      case ColladaPackage.INSTANCE_RIGID_BODY_TYPE__TARGET:
        return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
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
    result.append(" (body: ");
    result.append(body);
    result.append(", name: ");
    result.append(name);
    result.append(", sid: ");
    result.append(sid);
    result.append(", target: ");
    result.append(target);
    result.append(')');
    return result.toString();
  }

} //InstanceRigidBodyTypeImpl
