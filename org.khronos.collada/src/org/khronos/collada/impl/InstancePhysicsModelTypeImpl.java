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
import org.khronos.collada.InstancePhysicsModelType;
import org.khronos.collada.InstanceRigidBodyType;
import org.khronos.collada.InstanceRigidConstraintType;
import org.khronos.collada.InstanceWithExtra;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Physics Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.InstancePhysicsModelTypeImpl#getInstanceForceField <em>Instance Force Field</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstancePhysicsModelTypeImpl#getInstanceRigidBody <em>Instance Rigid Body</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstancePhysicsModelTypeImpl#getInstanceRigidConstraint <em>Instance Rigid Constraint</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstancePhysicsModelTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstancePhysicsModelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstancePhysicsModelTypeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstancePhysicsModelTypeImpl#getSid <em>Sid</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstancePhysicsModelTypeImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstancePhysicsModelTypeImpl extends EObjectImpl implements InstancePhysicsModelType {
	/**
   * The cached value of the '{@link #getInstanceForceField() <em>Instance Force Field</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstanceForceField()
   * @generated
   * @ordered
   */
	protected EList<InstanceWithExtra> instanceForceField;

	/**
   * The cached value of the '{@link #getInstanceRigidBody() <em>Instance Rigid Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstanceRigidBody()
   * @generated
   * @ordered
   */
	protected EList<InstanceRigidBodyType> instanceRigidBody;

	/**
   * The cached value of the '{@link #getInstanceRigidConstraint() <em>Instance Rigid Constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstanceRigidConstraint()
   * @generated
   * @ordered
   */
	protected EList<InstanceRigidConstraintType> instanceRigidConstraint;

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
   * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
	protected static final String PARENT_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
	protected String parent = PARENT_EDEFAULT;

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
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
	protected static final String URL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
	protected String url = URL_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected InstancePhysicsModelTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getInstancePhysicsModelType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<InstanceWithExtra> getInstanceForceField() {
    if (instanceForceField == null)
    {
      instanceForceField = new EObjectContainmentEList<InstanceWithExtra>(InstanceWithExtra.class, this, ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_FORCE_FIELD);
    }
    return instanceForceField;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<InstanceRigidBodyType> getInstanceRigidBody() {
    if (instanceRigidBody == null)
    {
      instanceRigidBody = new EObjectContainmentEList<InstanceRigidBodyType>(InstanceRigidBodyType.class, this, ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_RIGID_BODY);
    }
    return instanceRigidBody;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<InstanceRigidConstraintType> getInstanceRigidConstraint() {
    if (instanceRigidConstraint == null)
    {
      instanceRigidConstraint = new EObjectContainmentEList<InstanceRigidConstraintType>(InstanceRigidConstraintType.class, this, ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_RIGID_CONSTRAINT);
    }
    return instanceRigidConstraint;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getParent() {
    return parent;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setParent(String newParent) {
    String oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__PARENT, oldParent, parent));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__SID, oldSid, sid));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getUrl() {
    return url;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUrl(String newUrl) {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__URL, oldUrl, url));
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
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_FORCE_FIELD:
        return ((InternalEList<?>)getInstanceForceField()).basicRemove(otherEnd, msgs);
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_RIGID_BODY:
        return ((InternalEList<?>)getInstanceRigidBody()).basicRemove(otherEnd, msgs);
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_RIGID_CONSTRAINT:
        return ((InternalEList<?>)getInstanceRigidConstraint()).basicRemove(otherEnd, msgs);
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__EXTRA:
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
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_FORCE_FIELD:
        return getInstanceForceField();
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_RIGID_BODY:
        return getInstanceRigidBody();
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_RIGID_CONSTRAINT:
        return getInstanceRigidConstraint();
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__NAME:
        return getName();
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__PARENT:
        return getParent();
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__SID:
        return getSid();
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__URL:
        return getUrl();
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
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_FORCE_FIELD:
        getInstanceForceField().clear();
        getInstanceForceField().addAll((Collection<? extends InstanceWithExtra>)newValue);
        return;
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_RIGID_BODY:
        getInstanceRigidBody().clear();
        getInstanceRigidBody().addAll((Collection<? extends InstanceRigidBodyType>)newValue);
        return;
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_RIGID_CONSTRAINT:
        getInstanceRigidConstraint().clear();
        getInstanceRigidConstraint().addAll((Collection<? extends InstanceRigidConstraintType>)newValue);
        return;
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__NAME:
        setName((String)newValue);
        return;
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__PARENT:
        setParent((String)newValue);
        return;
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__SID:
        setSid((String)newValue);
        return;
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__URL:
        setUrl((String)newValue);
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
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_FORCE_FIELD:
        getInstanceForceField().clear();
        return;
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_RIGID_BODY:
        getInstanceRigidBody().clear();
        return;
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_RIGID_CONSTRAINT:
        getInstanceRigidConstraint().clear();
        return;
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__PARENT:
        setParent(PARENT_EDEFAULT);
        return;
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__SID:
        setSid(SID_EDEFAULT);
        return;
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__URL:
        setUrl(URL_EDEFAULT);
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
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_FORCE_FIELD:
        return instanceForceField != null && !instanceForceField.isEmpty();
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_RIGID_BODY:
        return instanceRigidBody != null && !instanceRigidBody.isEmpty();
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__INSTANCE_RIGID_CONSTRAINT:
        return instanceRigidConstraint != null && !instanceRigidConstraint.isEmpty();
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__PARENT:
        return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT.equals(parent);
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__SID:
        return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
      case ColladaPackage.INSTANCE_PHYSICS_MODEL_TYPE__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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
    result.append(", parent: ");
    result.append(parent);
    result.append(", sid: ");
    result.append(sid);
    result.append(", url: ");
    result.append(url);
    result.append(')');
    return result.toString();
  }

} //InstancePhysicsModelTypeImpl
