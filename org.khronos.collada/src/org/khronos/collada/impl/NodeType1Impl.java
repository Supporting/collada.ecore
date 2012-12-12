/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.AssetType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.InstanceControllerType;
import org.khronos.collada.InstanceGeometryType;
import org.khronos.collada.InstanceWithExtra;
import org.khronos.collada.LookatType;
import org.khronos.collada.MatrixType;
import org.khronos.collada.NodeType;
import org.khronos.collada.NodeType1;
import org.khronos.collada.RotateType;
import org.khronos.collada.SkewType;
import org.khronos.collada.TargetableFloat3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getLookat <em>Lookat</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getRotate <em>Rotate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getSkew <em>Skew</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getTranslate <em>Translate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getInstanceCamera <em>Instance Camera</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getInstanceController <em>Instance Controller</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getInstanceGeometry <em>Instance Geometry</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getInstanceLight <em>Instance Light</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getInstanceNode <em>Instance Node</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getNode <em>Node</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getSid <em>Sid</em>}</li>
 *   <li>{@link org.khronos.collada.impl.NodeType1Impl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeType1Impl extends EObjectImpl implements NodeType1 {
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
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
	protected FeatureMap group;

	/**
   * The cached value of the '{@link #getInstanceCamera() <em>Instance Camera</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstanceCamera()
   * @generated
   * @ordered
   */
	protected EList<InstanceWithExtra> instanceCamera;

	/**
   * The cached value of the '{@link #getInstanceController() <em>Instance Controller</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstanceController()
   * @generated
   * @ordered
   */
	protected EList<InstanceControllerType> instanceController;

	/**
   * The cached value of the '{@link #getInstanceGeometry() <em>Instance Geometry</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstanceGeometry()
   * @generated
   * @ordered
   */
	protected EList<InstanceGeometryType> instanceGeometry;

	/**
   * The cached value of the '{@link #getInstanceLight() <em>Instance Light</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstanceLight()
   * @generated
   * @ordered
   */
	protected EList<InstanceWithExtra> instanceLight;

	/**
   * The cached value of the '{@link #getInstanceNode() <em>Instance Node</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstanceNode()
   * @generated
   * @ordered
   */
	protected EList<InstanceWithExtra> instanceNode;

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
   * The default value of the '{@link #getLayer() <em>Layer</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLayer()
   * @generated
   * @ordered
   */
	protected static final List<String> LAYER_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getLayer() <em>Layer</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLayer()
   * @generated
   * @ordered
   */
	protected List<String> layer = LAYER_EDEFAULT;

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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
	protected static final NodeType TYPE_EDEFAULT = NodeType.NODE;

	/**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
	protected NodeType type = TYPE_EDEFAULT;

	/**
   * This is true if the Type attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean typeESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected NodeType1Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getNodeType1();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.NODE_TYPE1__ASSET, oldAsset, newAsset);
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
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.NODE_TYPE1__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.NODE_TYPE1__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.NODE_TYPE1__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null)
    {
      group = new BasicFeatureMap(this, ColladaPackage.NODE_TYPE1__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LookatType> getLookat() {
    return getGroup().list(ColladaPackage.eINSTANCE.getNodeType1_Lookat());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<MatrixType> getMatrix() {
    return getGroup().list(ColladaPackage.eINSTANCE.getNodeType1_Matrix());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<RotateType> getRotate() {
    return getGroup().list(ColladaPackage.eINSTANCE.getNodeType1_Rotate());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TargetableFloat3> getScale() {
    return getGroup().list(ColladaPackage.eINSTANCE.getNodeType1_Scale());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SkewType> getSkew() {
    return getGroup().list(ColladaPackage.eINSTANCE.getNodeType1_Skew());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TargetableFloat3> getTranslate() {
    return getGroup().list(ColladaPackage.eINSTANCE.getNodeType1_Translate());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<InstanceWithExtra> getInstanceCamera() {
    if (instanceCamera == null)
    {
      instanceCamera = new EObjectContainmentEList<InstanceWithExtra>(InstanceWithExtra.class, this, ColladaPackage.NODE_TYPE1__INSTANCE_CAMERA);
    }
    return instanceCamera;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<InstanceControllerType> getInstanceController() {
    if (instanceController == null)
    {
      instanceController = new EObjectContainmentEList<InstanceControllerType>(InstanceControllerType.class, this, ColladaPackage.NODE_TYPE1__INSTANCE_CONTROLLER);
    }
    return instanceController;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<InstanceGeometryType> getInstanceGeometry() {
    if (instanceGeometry == null)
    {
      instanceGeometry = new EObjectContainmentEList<InstanceGeometryType>(InstanceGeometryType.class, this, ColladaPackage.NODE_TYPE1__INSTANCE_GEOMETRY);
    }
    return instanceGeometry;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<InstanceWithExtra> getInstanceLight() {
    if (instanceLight == null)
    {
      instanceLight = new EObjectContainmentEList<InstanceWithExtra>(InstanceWithExtra.class, this, ColladaPackage.NODE_TYPE1__INSTANCE_LIGHT);
    }
    return instanceLight;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<InstanceWithExtra> getInstanceNode() {
    if (instanceNode == null)
    {
      instanceNode = new EObjectContainmentEList<InstanceWithExtra>(InstanceWithExtra.class, this, ColladaPackage.NODE_TYPE1__INSTANCE_NODE);
    }
    return instanceNode;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<NodeType1> getNode() {
    if (node == null)
    {
      node = new EObjectContainmentEList<NodeType1>(NodeType1.class, this, ColladaPackage.NODE_TYPE1__NODE);
    }
    return node;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.NODE_TYPE1__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.NODE_TYPE1__ID, oldId, id));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<String> getLayer() {
    return layer;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLayer(List<String> newLayer) {
    List<String> oldLayer = layer;
    layer = newLayer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.NODE_TYPE1__LAYER, oldLayer, layer));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.NODE_TYPE1__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.NODE_TYPE1__SID, oldSid, sid));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NodeType getType() {
    return type;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setType(NodeType newType) {
    NodeType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    boolean oldTypeESet = typeESet;
    typeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.NODE_TYPE1__TYPE, oldType, type, !oldTypeESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetType() {
    NodeType oldType = type;
    boolean oldTypeESet = typeESet;
    type = TYPE_EDEFAULT;
    typeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.NODE_TYPE1__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetType() {
    return typeESet;
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
      case ColladaPackage.NODE_TYPE1__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.NODE_TYPE1__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.NODE_TYPE1__LOOKAT:
        return ((InternalEList<?>)getLookat()).basicRemove(otherEnd, msgs);
      case ColladaPackage.NODE_TYPE1__MATRIX:
        return ((InternalEList<?>)getMatrix()).basicRemove(otherEnd, msgs);
      case ColladaPackage.NODE_TYPE1__ROTATE:
        return ((InternalEList<?>)getRotate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.NODE_TYPE1__SCALE:
        return ((InternalEList<?>)getScale()).basicRemove(otherEnd, msgs);
      case ColladaPackage.NODE_TYPE1__SKEW:
        return ((InternalEList<?>)getSkew()).basicRemove(otherEnd, msgs);
      case ColladaPackage.NODE_TYPE1__TRANSLATE:
        return ((InternalEList<?>)getTranslate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.NODE_TYPE1__INSTANCE_CAMERA:
        return ((InternalEList<?>)getInstanceCamera()).basicRemove(otherEnd, msgs);
      case ColladaPackage.NODE_TYPE1__INSTANCE_CONTROLLER:
        return ((InternalEList<?>)getInstanceController()).basicRemove(otherEnd, msgs);
      case ColladaPackage.NODE_TYPE1__INSTANCE_GEOMETRY:
        return ((InternalEList<?>)getInstanceGeometry()).basicRemove(otherEnd, msgs);
      case ColladaPackage.NODE_TYPE1__INSTANCE_LIGHT:
        return ((InternalEList<?>)getInstanceLight()).basicRemove(otherEnd, msgs);
      case ColladaPackage.NODE_TYPE1__INSTANCE_NODE:
        return ((InternalEList<?>)getInstanceNode()).basicRemove(otherEnd, msgs);
      case ColladaPackage.NODE_TYPE1__NODE:
        return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
      case ColladaPackage.NODE_TYPE1__EXTRA:
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
      case ColladaPackage.NODE_TYPE1__ASSET:
        return getAsset();
      case ColladaPackage.NODE_TYPE1__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.NODE_TYPE1__LOOKAT:
        return getLookat();
      case ColladaPackage.NODE_TYPE1__MATRIX:
        return getMatrix();
      case ColladaPackage.NODE_TYPE1__ROTATE:
        return getRotate();
      case ColladaPackage.NODE_TYPE1__SCALE:
        return getScale();
      case ColladaPackage.NODE_TYPE1__SKEW:
        return getSkew();
      case ColladaPackage.NODE_TYPE1__TRANSLATE:
        return getTranslate();
      case ColladaPackage.NODE_TYPE1__INSTANCE_CAMERA:
        return getInstanceCamera();
      case ColladaPackage.NODE_TYPE1__INSTANCE_CONTROLLER:
        return getInstanceController();
      case ColladaPackage.NODE_TYPE1__INSTANCE_GEOMETRY:
        return getInstanceGeometry();
      case ColladaPackage.NODE_TYPE1__INSTANCE_LIGHT:
        return getInstanceLight();
      case ColladaPackage.NODE_TYPE1__INSTANCE_NODE:
        return getInstanceNode();
      case ColladaPackage.NODE_TYPE1__NODE:
        return getNode();
      case ColladaPackage.NODE_TYPE1__EXTRA:
        return getExtra();
      case ColladaPackage.NODE_TYPE1__ID:
        return getId();
      case ColladaPackage.NODE_TYPE1__LAYER:
        return getLayer();
      case ColladaPackage.NODE_TYPE1__NAME:
        return getName();
      case ColladaPackage.NODE_TYPE1__SID:
        return getSid();
      case ColladaPackage.NODE_TYPE1__TYPE:
        return getType();
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
      case ColladaPackage.NODE_TYPE1__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.NODE_TYPE1__LOOKAT:
        getLookat().clear();
        getLookat().addAll((Collection<? extends LookatType>)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__MATRIX:
        getMatrix().clear();
        getMatrix().addAll((Collection<? extends MatrixType>)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__ROTATE:
        getRotate().clear();
        getRotate().addAll((Collection<? extends RotateType>)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__SCALE:
        getScale().clear();
        getScale().addAll((Collection<? extends TargetableFloat3>)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__SKEW:
        getSkew().clear();
        getSkew().addAll((Collection<? extends SkewType>)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__TRANSLATE:
        getTranslate().clear();
        getTranslate().addAll((Collection<? extends TargetableFloat3>)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__INSTANCE_CAMERA:
        getInstanceCamera().clear();
        getInstanceCamera().addAll((Collection<? extends InstanceWithExtra>)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__INSTANCE_CONTROLLER:
        getInstanceController().clear();
        getInstanceController().addAll((Collection<? extends InstanceControllerType>)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__INSTANCE_GEOMETRY:
        getInstanceGeometry().clear();
        getInstanceGeometry().addAll((Collection<? extends InstanceGeometryType>)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__INSTANCE_LIGHT:
        getInstanceLight().clear();
        getInstanceLight().addAll((Collection<? extends InstanceWithExtra>)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__INSTANCE_NODE:
        getInstanceNode().clear();
        getInstanceNode().addAll((Collection<? extends InstanceWithExtra>)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__NODE:
        getNode().clear();
        getNode().addAll((Collection<? extends NodeType1>)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__LAYER:
        setLayer((List<String>)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__NAME:
        setName((String)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__SID:
        setSid((String)newValue);
        return;
      case ColladaPackage.NODE_TYPE1__TYPE:
        setType((NodeType)newValue);
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
      case ColladaPackage.NODE_TYPE1__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.NODE_TYPE1__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.NODE_TYPE1__LOOKAT:
        getLookat().clear();
        return;
      case ColladaPackage.NODE_TYPE1__MATRIX:
        getMatrix().clear();
        return;
      case ColladaPackage.NODE_TYPE1__ROTATE:
        getRotate().clear();
        return;
      case ColladaPackage.NODE_TYPE1__SCALE:
        getScale().clear();
        return;
      case ColladaPackage.NODE_TYPE1__SKEW:
        getSkew().clear();
        return;
      case ColladaPackage.NODE_TYPE1__TRANSLATE:
        getTranslate().clear();
        return;
      case ColladaPackage.NODE_TYPE1__INSTANCE_CAMERA:
        getInstanceCamera().clear();
        return;
      case ColladaPackage.NODE_TYPE1__INSTANCE_CONTROLLER:
        getInstanceController().clear();
        return;
      case ColladaPackage.NODE_TYPE1__INSTANCE_GEOMETRY:
        getInstanceGeometry().clear();
        return;
      case ColladaPackage.NODE_TYPE1__INSTANCE_LIGHT:
        getInstanceLight().clear();
        return;
      case ColladaPackage.NODE_TYPE1__INSTANCE_NODE:
        getInstanceNode().clear();
        return;
      case ColladaPackage.NODE_TYPE1__NODE:
        getNode().clear();
        return;
      case ColladaPackage.NODE_TYPE1__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.NODE_TYPE1__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.NODE_TYPE1__LAYER:
        setLayer(LAYER_EDEFAULT);
        return;
      case ColladaPackage.NODE_TYPE1__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ColladaPackage.NODE_TYPE1__SID:
        setSid(SID_EDEFAULT);
        return;
      case ColladaPackage.NODE_TYPE1__TYPE:
        unsetType();
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
      case ColladaPackage.NODE_TYPE1__ASSET:
        return asset != null;
      case ColladaPackage.NODE_TYPE1__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.NODE_TYPE1__LOOKAT:
        return !getLookat().isEmpty();
      case ColladaPackage.NODE_TYPE1__MATRIX:
        return !getMatrix().isEmpty();
      case ColladaPackage.NODE_TYPE1__ROTATE:
        return !getRotate().isEmpty();
      case ColladaPackage.NODE_TYPE1__SCALE:
        return !getScale().isEmpty();
      case ColladaPackage.NODE_TYPE1__SKEW:
        return !getSkew().isEmpty();
      case ColladaPackage.NODE_TYPE1__TRANSLATE:
        return !getTranslate().isEmpty();
      case ColladaPackage.NODE_TYPE1__INSTANCE_CAMERA:
        return instanceCamera != null && !instanceCamera.isEmpty();
      case ColladaPackage.NODE_TYPE1__INSTANCE_CONTROLLER:
        return instanceController != null && !instanceController.isEmpty();
      case ColladaPackage.NODE_TYPE1__INSTANCE_GEOMETRY:
        return instanceGeometry != null && !instanceGeometry.isEmpty();
      case ColladaPackage.NODE_TYPE1__INSTANCE_LIGHT:
        return instanceLight != null && !instanceLight.isEmpty();
      case ColladaPackage.NODE_TYPE1__INSTANCE_NODE:
        return instanceNode != null && !instanceNode.isEmpty();
      case ColladaPackage.NODE_TYPE1__NODE:
        return node != null && !node.isEmpty();
      case ColladaPackage.NODE_TYPE1__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.NODE_TYPE1__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.NODE_TYPE1__LAYER:
        return LAYER_EDEFAULT == null ? layer != null : !LAYER_EDEFAULT.equals(layer);
      case ColladaPackage.NODE_TYPE1__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ColladaPackage.NODE_TYPE1__SID:
        return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
      case ColladaPackage.NODE_TYPE1__TYPE:
        return isSetType();
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
    result.append(" (group: ");
    result.append(group);
    result.append(", id: ");
    result.append(id);
    result.append(", layer: ");
    result.append(layer);
    result.append(", name: ");
    result.append(name);
    result.append(", sid: ");
    result.append(sid);
    result.append(", type: ");
    if (typeESet) result.append(type); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //NodeType1Impl
