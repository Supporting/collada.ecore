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
import org.khronos.collada.InstanceEffectType;
import org.khronos.collada.SetparamType1;
import org.khronos.collada.TechniqueHintType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Effect Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.InstanceEffectTypeImpl#getTechniqueHint <em>Technique Hint</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceEffectTypeImpl#getSetparam <em>Setparam</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceEffectTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceEffectTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceEffectTypeImpl#getSid <em>Sid</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceEffectTypeImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceEffectTypeImpl extends EObjectImpl implements InstanceEffectType {
	/**
   * The cached value of the '{@link #getTechniqueHint() <em>Technique Hint</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTechniqueHint()
   * @generated
   * @ordered
   */
	protected EList<TechniqueHintType> techniqueHint;

	/**
   * The cached value of the '{@link #getSetparam() <em>Setparam</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSetparam()
   * @generated
   * @ordered
   */
	protected EList<SetparamType1> setparam;

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
	protected InstanceEffectTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getInstanceEffectType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TechniqueHintType> getTechniqueHint() {
    if (techniqueHint == null)
    {
      techniqueHint = new EObjectContainmentEList<TechniqueHintType>(TechniqueHintType.class, this, ColladaPackage.INSTANCE_EFFECT_TYPE__TECHNIQUE_HINT);
    }
    return techniqueHint;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SetparamType1> getSetparam() {
    if (setparam == null)
    {
      setparam = new EObjectContainmentEList<SetparamType1>(SetparamType1.class, this, ColladaPackage.INSTANCE_EFFECT_TYPE__SETPARAM);
    }
    return setparam;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.INSTANCE_EFFECT_TYPE__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_EFFECT_TYPE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_EFFECT_TYPE__SID, oldSid, sid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_EFFECT_TYPE__URL, oldUrl, url));
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
      case ColladaPackage.INSTANCE_EFFECT_TYPE__TECHNIQUE_HINT:
        return ((InternalEList<?>)getTechniqueHint()).basicRemove(otherEnd, msgs);
      case ColladaPackage.INSTANCE_EFFECT_TYPE__SETPARAM:
        return ((InternalEList<?>)getSetparam()).basicRemove(otherEnd, msgs);
      case ColladaPackage.INSTANCE_EFFECT_TYPE__EXTRA:
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
      case ColladaPackage.INSTANCE_EFFECT_TYPE__TECHNIQUE_HINT:
        return getTechniqueHint();
      case ColladaPackage.INSTANCE_EFFECT_TYPE__SETPARAM:
        return getSetparam();
      case ColladaPackage.INSTANCE_EFFECT_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.INSTANCE_EFFECT_TYPE__NAME:
        return getName();
      case ColladaPackage.INSTANCE_EFFECT_TYPE__SID:
        return getSid();
      case ColladaPackage.INSTANCE_EFFECT_TYPE__URL:
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
      case ColladaPackage.INSTANCE_EFFECT_TYPE__TECHNIQUE_HINT:
        getTechniqueHint().clear();
        getTechniqueHint().addAll((Collection<? extends TechniqueHintType>)newValue);
        return;
      case ColladaPackage.INSTANCE_EFFECT_TYPE__SETPARAM:
        getSetparam().clear();
        getSetparam().addAll((Collection<? extends SetparamType1>)newValue);
        return;
      case ColladaPackage.INSTANCE_EFFECT_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.INSTANCE_EFFECT_TYPE__NAME:
        setName((String)newValue);
        return;
      case ColladaPackage.INSTANCE_EFFECT_TYPE__SID:
        setSid((String)newValue);
        return;
      case ColladaPackage.INSTANCE_EFFECT_TYPE__URL:
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
      case ColladaPackage.INSTANCE_EFFECT_TYPE__TECHNIQUE_HINT:
        getTechniqueHint().clear();
        return;
      case ColladaPackage.INSTANCE_EFFECT_TYPE__SETPARAM:
        getSetparam().clear();
        return;
      case ColladaPackage.INSTANCE_EFFECT_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.INSTANCE_EFFECT_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ColladaPackage.INSTANCE_EFFECT_TYPE__SID:
        setSid(SID_EDEFAULT);
        return;
      case ColladaPackage.INSTANCE_EFFECT_TYPE__URL:
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
      case ColladaPackage.INSTANCE_EFFECT_TYPE__TECHNIQUE_HINT:
        return techniqueHint != null && !techniqueHint.isEmpty();
      case ColladaPackage.INSTANCE_EFFECT_TYPE__SETPARAM:
        return setparam != null && !setparam.isEmpty();
      case ColladaPackage.INSTANCE_EFFECT_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.INSTANCE_EFFECT_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ColladaPackage.INSTANCE_EFFECT_TYPE__SID:
        return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
      case ColladaPackage.INSTANCE_EFFECT_TYPE__URL:
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
    result.append(", sid: ");
    result.append(sid);
    result.append(", url: ");
    result.append(url);
    result.append(')');
    return result.toString();
  }

} //InstanceEffectTypeImpl
