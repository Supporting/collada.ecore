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

import org.khronos.collada.AssetType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.EvaluateSceneType;
import org.khronos.collada.ExtraType;
import org.khronos.collada.NodeType1;
import org.khronos.collada.VisualSceneType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Scene Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.VisualSceneTypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.VisualSceneTypeImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.khronos.collada.impl.VisualSceneTypeImpl#getEvaluateScene <em>Evaluate Scene</em>}</li>
 *   <li>{@link org.khronos.collada.impl.VisualSceneTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.VisualSceneTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.VisualSceneTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisualSceneTypeImpl extends EObjectImpl implements VisualSceneType {
	/**
   * The cached value of the '{@link #getAsset() <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAsset()
   * @generated
   * @ordered
   */
	protected AssetType asset;

	/**
   * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
	protected EList<NodeType1> node;

	/**
   * The cached value of the '{@link #getEvaluateScene() <em>Evaluate Scene</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEvaluateScene()
   * @generated
   * @ordered
   */
	protected EList<EvaluateSceneType> evaluateScene;

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
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
	protected static final String ID_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
	protected String id = ID_EDEFAULT;

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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected VisualSceneTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getVisualSceneType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AssetType getAsset() {
    return asset;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAsset(AssetType newAsset, NotificationChain msgs) {
    AssetType oldAsset = asset;
    asset = newAsset;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.VISUAL_SCENE_TYPE__ASSET, oldAsset, newAsset);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAsset(AssetType newAsset) {
    if (newAsset != asset)
    {
      NotificationChain msgs = null;
      if (asset != null)
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.VISUAL_SCENE_TYPE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.VISUAL_SCENE_TYPE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.VISUAL_SCENE_TYPE__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<NodeType1> getNode() {
    if (node == null)
    {
      node = new EObjectContainmentEList<NodeType1>(NodeType1.class, this, ColladaPackage.VISUAL_SCENE_TYPE__NODE);
    }
    return node;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<EvaluateSceneType> getEvaluateScene() {
    if (evaluateScene == null)
    {
      evaluateScene = new EObjectContainmentEList<EvaluateSceneType>(EvaluateSceneType.class, this, ColladaPackage.VISUAL_SCENE_TYPE__EVALUATE_SCENE);
    }
    return evaluateScene;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.VISUAL_SCENE_TYPE__EXTRA);
    }
    return extra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getId() {
    return id;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setId(String newId) {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.VISUAL_SCENE_TYPE__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.VISUAL_SCENE_TYPE__NAME, oldName, name));
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
      case ColladaPackage.VISUAL_SCENE_TYPE__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.VISUAL_SCENE_TYPE__NODE:
        return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
      case ColladaPackage.VISUAL_SCENE_TYPE__EVALUATE_SCENE:
        return ((InternalEList<?>)getEvaluateScene()).basicRemove(otherEnd, msgs);
      case ColladaPackage.VISUAL_SCENE_TYPE__EXTRA:
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
      case ColladaPackage.VISUAL_SCENE_TYPE__ASSET:
        return getAsset();
      case ColladaPackage.VISUAL_SCENE_TYPE__NODE:
        return getNode();
      case ColladaPackage.VISUAL_SCENE_TYPE__EVALUATE_SCENE:
        return getEvaluateScene();
      case ColladaPackage.VISUAL_SCENE_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.VISUAL_SCENE_TYPE__ID:
        return getId();
      case ColladaPackage.VISUAL_SCENE_TYPE__NAME:
        return getName();
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
      case ColladaPackage.VISUAL_SCENE_TYPE__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.VISUAL_SCENE_TYPE__NODE:
        getNode().clear();
        getNode().addAll((Collection<? extends NodeType1>)newValue);
        return;
      case ColladaPackage.VISUAL_SCENE_TYPE__EVALUATE_SCENE:
        getEvaluateScene().clear();
        getEvaluateScene().addAll((Collection<? extends EvaluateSceneType>)newValue);
        return;
      case ColladaPackage.VISUAL_SCENE_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.VISUAL_SCENE_TYPE__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.VISUAL_SCENE_TYPE__NAME:
        setName((String)newValue);
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
      case ColladaPackage.VISUAL_SCENE_TYPE__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.VISUAL_SCENE_TYPE__NODE:
        getNode().clear();
        return;
      case ColladaPackage.VISUAL_SCENE_TYPE__EVALUATE_SCENE:
        getEvaluateScene().clear();
        return;
      case ColladaPackage.VISUAL_SCENE_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.VISUAL_SCENE_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.VISUAL_SCENE_TYPE__NAME:
        setName(NAME_EDEFAULT);
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
      case ColladaPackage.VISUAL_SCENE_TYPE__ASSET:
        return asset != null;
      case ColladaPackage.VISUAL_SCENE_TYPE__NODE:
        return node != null && !node.isEmpty();
      case ColladaPackage.VISUAL_SCENE_TYPE__EVALUATE_SCENE:
        return evaluateScene != null && !evaluateScene.isEmpty();
      case ColladaPackage.VISUAL_SCENE_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.VISUAL_SCENE_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.VISUAL_SCENE_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (id: ");
    result.append(id);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VisualSceneTypeImpl
