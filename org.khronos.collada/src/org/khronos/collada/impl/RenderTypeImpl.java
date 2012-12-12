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

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.InstanceEffectType;
import org.khronos.collada.RenderType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Render Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.RenderTypeImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.khronos.collada.impl.RenderTypeImpl#getInstanceEffect <em>Instance Effect</em>}</li>
 *   <li>{@link org.khronos.collada.impl.RenderTypeImpl#getCameraNode <em>Camera Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenderTypeImpl extends EObjectImpl implements RenderType {
	/**
   * The cached value of the '{@link #getLayer() <em>Layer</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLayer()
   * @generated
   * @ordered
   */
	protected EList<String> layer;

	/**
   * The cached value of the '{@link #getInstanceEffect() <em>Instance Effect</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstanceEffect()
   * @generated
   * @ordered
   */
	protected InstanceEffectType instanceEffect;

	/**
   * The default value of the '{@link #getCameraNode() <em>Camera Node</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCameraNode()
   * @generated
   * @ordered
   */
	protected static final String CAMERA_NODE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getCameraNode() <em>Camera Node</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCameraNode()
   * @generated
   * @ordered
   */
	protected String cameraNode = CAMERA_NODE_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected RenderTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getRenderType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<String> getLayer() {
    if (layer == null)
    {
      layer = new EDataTypeEList<String>(String.class, this, ColladaPackage.RENDER_TYPE__LAYER);
    }
    return layer;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceEffectType getInstanceEffect() {
    return instanceEffect;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstanceEffect(InstanceEffectType newInstanceEffect, NotificationChain msgs) {
    InstanceEffectType oldInstanceEffect = instanceEffect;
    instanceEffect = newInstanceEffect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.RENDER_TYPE__INSTANCE_EFFECT, oldInstanceEffect, newInstanceEffect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstanceEffect(InstanceEffectType newInstanceEffect) {
    if (newInstanceEffect != instanceEffect)
    {
      NotificationChain msgs = null;
      if (instanceEffect != null)
        msgs = ((InternalEObject)instanceEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.RENDER_TYPE__INSTANCE_EFFECT, null, msgs);
      if (newInstanceEffect != null)
        msgs = ((InternalEObject)newInstanceEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.RENDER_TYPE__INSTANCE_EFFECT, null, msgs);
      msgs = basicSetInstanceEffect(newInstanceEffect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.RENDER_TYPE__INSTANCE_EFFECT, newInstanceEffect, newInstanceEffect));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getCameraNode() {
    return cameraNode;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCameraNode(String newCameraNode) {
    String oldCameraNode = cameraNode;
    cameraNode = newCameraNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.RENDER_TYPE__CAMERA_NODE, oldCameraNode, cameraNode));
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
      case ColladaPackage.RENDER_TYPE__INSTANCE_EFFECT:
        return basicSetInstanceEffect(null, msgs);
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
      case ColladaPackage.RENDER_TYPE__LAYER:
        return getLayer();
      case ColladaPackage.RENDER_TYPE__INSTANCE_EFFECT:
        return getInstanceEffect();
      case ColladaPackage.RENDER_TYPE__CAMERA_NODE:
        return getCameraNode();
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
      case ColladaPackage.RENDER_TYPE__LAYER:
        getLayer().clear();
        getLayer().addAll((Collection<? extends String>)newValue);
        return;
      case ColladaPackage.RENDER_TYPE__INSTANCE_EFFECT:
        setInstanceEffect((InstanceEffectType)newValue);
        return;
      case ColladaPackage.RENDER_TYPE__CAMERA_NODE:
        setCameraNode((String)newValue);
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
      case ColladaPackage.RENDER_TYPE__LAYER:
        getLayer().clear();
        return;
      case ColladaPackage.RENDER_TYPE__INSTANCE_EFFECT:
        setInstanceEffect((InstanceEffectType)null);
        return;
      case ColladaPackage.RENDER_TYPE__CAMERA_NODE:
        setCameraNode(CAMERA_NODE_EDEFAULT);
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
      case ColladaPackage.RENDER_TYPE__LAYER:
        return layer != null && !layer.isEmpty();
      case ColladaPackage.RENDER_TYPE__INSTANCE_EFFECT:
        return instanceEffect != null;
      case ColladaPackage.RENDER_TYPE__CAMERA_NODE:
        return CAMERA_NODE_EDEFAULT == null ? cameraNode != null : !CAMERA_NODE_EDEFAULT.equals(cameraNode);
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
    result.append(" (layer: ");
    result.append(layer);
    result.append(", cameraNode: ");
    result.append(cameraNode);
    result.append(')');
    return result.toString();
  }

} //RenderTypeImpl
