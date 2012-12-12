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
import org.khronos.collada.InstanceWithExtra;
import org.khronos.collada.SceneType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scene Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.SceneTypeImpl#getInstancePhysicsScene <em>Instance Physics Scene</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SceneTypeImpl#getInstanceVisualScene <em>Instance Visual Scene</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SceneTypeImpl#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SceneTypeImpl extends EObjectImpl implements SceneType {
	/**
   * The cached value of the '{@link #getInstancePhysicsScene() <em>Instance Physics Scene</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstancePhysicsScene()
   * @generated
   * @ordered
   */
	protected EList<InstanceWithExtra> instancePhysicsScene;

	/**
   * The cached value of the '{@link #getInstanceVisualScene() <em>Instance Visual Scene</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstanceVisualScene()
   * @generated
   * @ordered
   */
	protected InstanceWithExtra instanceVisualScene;

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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SceneTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getSceneType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<InstanceWithExtra> getInstancePhysicsScene() {
    if (instancePhysicsScene == null)
    {
      instancePhysicsScene = new EObjectContainmentEList<InstanceWithExtra>(InstanceWithExtra.class, this, ColladaPackage.SCENE_TYPE__INSTANCE_PHYSICS_SCENE);
    }
    return instancePhysicsScene;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceWithExtra getInstanceVisualScene() {
    return instanceVisualScene;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstanceVisualScene(InstanceWithExtra newInstanceVisualScene, NotificationChain msgs) {
    InstanceWithExtra oldInstanceVisualScene = instanceVisualScene;
    instanceVisualScene = newInstanceVisualScene;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SCENE_TYPE__INSTANCE_VISUAL_SCENE, oldInstanceVisualScene, newInstanceVisualScene);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstanceVisualScene(InstanceWithExtra newInstanceVisualScene) {
    if (newInstanceVisualScene != instanceVisualScene)
    {
      NotificationChain msgs = null;
      if (instanceVisualScene != null)
        msgs = ((InternalEObject)instanceVisualScene).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SCENE_TYPE__INSTANCE_VISUAL_SCENE, null, msgs);
      if (newInstanceVisualScene != null)
        msgs = ((InternalEObject)newInstanceVisualScene).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SCENE_TYPE__INSTANCE_VISUAL_SCENE, null, msgs);
      msgs = basicSetInstanceVisualScene(newInstanceVisualScene, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SCENE_TYPE__INSTANCE_VISUAL_SCENE, newInstanceVisualScene, newInstanceVisualScene));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.SCENE_TYPE__EXTRA);
    }
    return extra;
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
      case ColladaPackage.SCENE_TYPE__INSTANCE_PHYSICS_SCENE:
        return ((InternalEList<?>)getInstancePhysicsScene()).basicRemove(otherEnd, msgs);
      case ColladaPackage.SCENE_TYPE__INSTANCE_VISUAL_SCENE:
        return basicSetInstanceVisualScene(null, msgs);
      case ColladaPackage.SCENE_TYPE__EXTRA:
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
      case ColladaPackage.SCENE_TYPE__INSTANCE_PHYSICS_SCENE:
        return getInstancePhysicsScene();
      case ColladaPackage.SCENE_TYPE__INSTANCE_VISUAL_SCENE:
        return getInstanceVisualScene();
      case ColladaPackage.SCENE_TYPE__EXTRA:
        return getExtra();
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
      case ColladaPackage.SCENE_TYPE__INSTANCE_PHYSICS_SCENE:
        getInstancePhysicsScene().clear();
        getInstancePhysicsScene().addAll((Collection<? extends InstanceWithExtra>)newValue);
        return;
      case ColladaPackage.SCENE_TYPE__INSTANCE_VISUAL_SCENE:
        setInstanceVisualScene((InstanceWithExtra)newValue);
        return;
      case ColladaPackage.SCENE_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
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
      case ColladaPackage.SCENE_TYPE__INSTANCE_PHYSICS_SCENE:
        getInstancePhysicsScene().clear();
        return;
      case ColladaPackage.SCENE_TYPE__INSTANCE_VISUAL_SCENE:
        setInstanceVisualScene((InstanceWithExtra)null);
        return;
      case ColladaPackage.SCENE_TYPE__EXTRA:
        getExtra().clear();
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
      case ColladaPackage.SCENE_TYPE__INSTANCE_PHYSICS_SCENE:
        return instancePhysicsScene != null && !instancePhysicsScene.isEmpty();
      case ColladaPackage.SCENE_TYPE__INSTANCE_VISUAL_SCENE:
        return instanceVisualScene != null;
      case ColladaPackage.SCENE_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SceneTypeImpl
