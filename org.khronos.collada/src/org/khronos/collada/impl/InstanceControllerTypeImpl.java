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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.BindMaterialType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.InstanceControllerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Controller Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.InstanceControllerTypeImpl#getSkeleton <em>Skeleton</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceControllerTypeImpl#getBindMaterial <em>Bind Material</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceControllerTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceControllerTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceControllerTypeImpl#getSid <em>Sid</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceControllerTypeImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceControllerTypeImpl extends EObjectImpl implements InstanceControllerType {
	/**
   * The cached value of the '{@link #getSkeleton() <em>Skeleton</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSkeleton()
   * @generated
   * @ordered
   */
	protected EList<String> skeleton;

	/**
   * The cached value of the '{@link #getBindMaterial() <em>Bind Material</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBindMaterial()
   * @generated
   * @ordered
   */
	protected BindMaterialType bindMaterial;

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
	protected InstanceControllerTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getInstanceControllerType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<String> getSkeleton() {
    if (skeleton == null)
    {
      skeleton = new EDataTypeEList<String>(String.class, this, ColladaPackage.INSTANCE_CONTROLLER_TYPE__SKELETON);
    }
    return skeleton;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BindMaterialType getBindMaterial() {
    return bindMaterial;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetBindMaterial(BindMaterialType newBindMaterial, NotificationChain msgs) {
    BindMaterialType oldBindMaterial = bindMaterial;
    bindMaterial = newBindMaterial;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_CONTROLLER_TYPE__BIND_MATERIAL, oldBindMaterial, newBindMaterial);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBindMaterial(BindMaterialType newBindMaterial) {
    if (newBindMaterial != bindMaterial)
    {
      NotificationChain msgs = null;
      if (bindMaterial != null)
        msgs = ((InternalEObject)bindMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.INSTANCE_CONTROLLER_TYPE__BIND_MATERIAL, null, msgs);
      if (newBindMaterial != null)
        msgs = ((InternalEObject)newBindMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.INSTANCE_CONTROLLER_TYPE__BIND_MATERIAL, null, msgs);
      msgs = basicSetBindMaterial(newBindMaterial, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_CONTROLLER_TYPE__BIND_MATERIAL, newBindMaterial, newBindMaterial));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.INSTANCE_CONTROLLER_TYPE__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_CONTROLLER_TYPE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_CONTROLLER_TYPE__SID, oldSid, sid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_CONTROLLER_TYPE__URL, oldUrl, url));
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
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__BIND_MATERIAL:
        return basicSetBindMaterial(null, msgs);
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__EXTRA:
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
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__SKELETON:
        return getSkeleton();
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__BIND_MATERIAL:
        return getBindMaterial();
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__NAME:
        return getName();
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__SID:
        return getSid();
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__URL:
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
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__SKELETON:
        getSkeleton().clear();
        getSkeleton().addAll((Collection<? extends String>)newValue);
        return;
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__BIND_MATERIAL:
        setBindMaterial((BindMaterialType)newValue);
        return;
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__NAME:
        setName((String)newValue);
        return;
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__SID:
        setSid((String)newValue);
        return;
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__URL:
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
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__SKELETON:
        getSkeleton().clear();
        return;
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__BIND_MATERIAL:
        setBindMaterial((BindMaterialType)null);
        return;
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__SID:
        setSid(SID_EDEFAULT);
        return;
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__URL:
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
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__SKELETON:
        return skeleton != null && !skeleton.isEmpty();
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__BIND_MATERIAL:
        return bindMaterial != null;
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__SID:
        return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
      case ColladaPackage.INSTANCE_CONTROLLER_TYPE__URL:
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
    result.append(" (skeleton: ");
    result.append(skeleton);
    result.append(", name: ");
    result.append(name);
    result.append(", sid: ");
    result.append(sid);
    result.append(", url: ");
    result.append(url);
    result.append(')');
    return result.toString();
  }

} //InstanceControllerTypeImpl
