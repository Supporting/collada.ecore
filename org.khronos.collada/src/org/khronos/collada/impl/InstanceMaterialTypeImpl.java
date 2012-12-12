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

import org.khronos.collada.BindType2;
import org.khronos.collada.BindVertexInputType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.InstanceMaterialType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Material Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.InstanceMaterialTypeImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceMaterialTypeImpl#getBindVertexInput <em>Bind Vertex Input</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceMaterialTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceMaterialTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceMaterialTypeImpl#getSid <em>Sid</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceMaterialTypeImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InstanceMaterialTypeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceMaterialTypeImpl extends EObjectImpl implements InstanceMaterialType {
	/**
   * The cached value of the '{@link #getBind() <em>Bind</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBind()
   * @generated
   * @ordered
   */
	protected EList<BindType2> bind;

	/**
   * The cached value of the '{@link #getBindVertexInput() <em>Bind Vertex Input</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBindVertexInput()
   * @generated
   * @ordered
   */
	protected EList<BindVertexInputType> bindVertexInput;

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
   * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
	protected String symbol = SYMBOL_EDEFAULT;

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
	protected InstanceMaterialTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getInstanceMaterialType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<BindType2> getBind() {
    if (bind == null)
    {
      bind = new EObjectContainmentEList<BindType2>(BindType2.class, this, ColladaPackage.INSTANCE_MATERIAL_TYPE__BIND);
    }
    return bind;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<BindVertexInputType> getBindVertexInput() {
    if (bindVertexInput == null)
    {
      bindVertexInput = new EObjectContainmentEList<BindVertexInputType>(BindVertexInputType.class, this, ColladaPackage.INSTANCE_MATERIAL_TYPE__BIND_VERTEX_INPUT);
    }
    return bindVertexInput;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.INSTANCE_MATERIAL_TYPE__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_MATERIAL_TYPE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_MATERIAL_TYPE__SID, oldSid, sid));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSymbol() {
    return symbol;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSymbol(String newSymbol) {
    String oldSymbol = symbol;
    symbol = newSymbol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_MATERIAL_TYPE__SYMBOL, oldSymbol, symbol));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INSTANCE_MATERIAL_TYPE__TARGET, oldTarget, target));
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
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__BIND:
        return ((InternalEList<?>)getBind()).basicRemove(otherEnd, msgs);
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__BIND_VERTEX_INPUT:
        return ((InternalEList<?>)getBindVertexInput()).basicRemove(otherEnd, msgs);
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__EXTRA:
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
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__BIND:
        return getBind();
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__BIND_VERTEX_INPUT:
        return getBindVertexInput();
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__NAME:
        return getName();
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__SID:
        return getSid();
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__SYMBOL:
        return getSymbol();
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__TARGET:
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
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__BIND:
        getBind().clear();
        getBind().addAll((Collection<? extends BindType2>)newValue);
        return;
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__BIND_VERTEX_INPUT:
        getBindVertexInput().clear();
        getBindVertexInput().addAll((Collection<? extends BindVertexInputType>)newValue);
        return;
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__NAME:
        setName((String)newValue);
        return;
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__SID:
        setSid((String)newValue);
        return;
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__SYMBOL:
        setSymbol((String)newValue);
        return;
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__TARGET:
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
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__BIND:
        getBind().clear();
        return;
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__BIND_VERTEX_INPUT:
        getBindVertexInput().clear();
        return;
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__SID:
        setSid(SID_EDEFAULT);
        return;
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__SYMBOL:
        setSymbol(SYMBOL_EDEFAULT);
        return;
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__TARGET:
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
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__BIND:
        return bind != null && !bind.isEmpty();
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__BIND_VERTEX_INPUT:
        return bindVertexInput != null && !bindVertexInput.isEmpty();
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__SID:
        return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__SYMBOL:
        return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
      case ColladaPackage.INSTANCE_MATERIAL_TYPE__TARGET:
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
    result.append(" (name: ");
    result.append(name);
    result.append(", sid: ");
    result.append(sid);
    result.append(", symbol: ");
    result.append(symbol);
    result.append(", target: ");
    result.append(target);
    result.append(')');
    return result.toString();
  }

} //InstanceMaterialTypeImpl
