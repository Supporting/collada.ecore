/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ParamType4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Type4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.ParamType4Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ParamType4Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ParamType4Impl#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ParamType4Impl#getSid <em>Sid</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ParamType4Impl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamType4Impl extends EObjectImpl implements ParamType4 {
	/**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected static final String VALUE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected String value = VALUE_EDEFAULT;

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
   * The default value of the '{@link #getSemantic() <em>Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSemantic()
   * @generated
   * @ordered
   */
	protected static final String SEMANTIC_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSemantic() <em>Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSemantic()
   * @generated
   * @ordered
   */
	protected String semantic = SEMANTIC_EDEFAULT;

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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
	protected static final String TYPE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
	protected String type = TYPE_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ParamType4Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getParamType4();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setValue(String newValue) {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PARAM_TYPE4__VALUE, oldValue, value));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PARAM_TYPE4__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSemantic() {
    return semantic;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSemantic(String newSemantic) {
    String oldSemantic = semantic;
    semantic = newSemantic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PARAM_TYPE4__SEMANTIC, oldSemantic, semantic));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PARAM_TYPE4__SID, oldSid, sid));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getType() {
    return type;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setType(String newType) {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.PARAM_TYPE4__TYPE, oldType, type));
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
      case ColladaPackage.PARAM_TYPE4__VALUE:
        return getValue();
      case ColladaPackage.PARAM_TYPE4__NAME:
        return getName();
      case ColladaPackage.PARAM_TYPE4__SEMANTIC:
        return getSemantic();
      case ColladaPackage.PARAM_TYPE4__SID:
        return getSid();
      case ColladaPackage.PARAM_TYPE4__TYPE:
        return getType();
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
      case ColladaPackage.PARAM_TYPE4__VALUE:
        setValue((String)newValue);
        return;
      case ColladaPackage.PARAM_TYPE4__NAME:
        setName((String)newValue);
        return;
      case ColladaPackage.PARAM_TYPE4__SEMANTIC:
        setSemantic((String)newValue);
        return;
      case ColladaPackage.PARAM_TYPE4__SID:
        setSid((String)newValue);
        return;
      case ColladaPackage.PARAM_TYPE4__TYPE:
        setType((String)newValue);
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
      case ColladaPackage.PARAM_TYPE4__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case ColladaPackage.PARAM_TYPE4__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ColladaPackage.PARAM_TYPE4__SEMANTIC:
        setSemantic(SEMANTIC_EDEFAULT);
        return;
      case ColladaPackage.PARAM_TYPE4__SID:
        setSid(SID_EDEFAULT);
        return;
      case ColladaPackage.PARAM_TYPE4__TYPE:
        setType(TYPE_EDEFAULT);
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
      case ColladaPackage.PARAM_TYPE4__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case ColladaPackage.PARAM_TYPE4__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ColladaPackage.PARAM_TYPE4__SEMANTIC:
        return SEMANTIC_EDEFAULT == null ? semantic != null : !SEMANTIC_EDEFAULT.equals(semantic);
      case ColladaPackage.PARAM_TYPE4__SID:
        return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
      case ColladaPackage.PARAM_TYPE4__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
    result.append(" (value: ");
    result.append(value);
    result.append(", name: ");
    result.append(name);
    result.append(", semantic: ");
    result.append(semantic);
    result.append(", sid: ");
    result.append(sid);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ParamType4Impl
