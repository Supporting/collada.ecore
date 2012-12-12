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
import org.khronos.collada.ConvexMeshType;
import org.khronos.collada.ExtraType;
import org.khronos.collada.GeometryType;
import org.khronos.collada.MeshType;
import org.khronos.collada.SplineType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.GeometryTypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GeometryTypeImpl#getConvexMesh <em>Convex Mesh</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GeometryTypeImpl#getMesh <em>Mesh</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GeometryTypeImpl#getSpline <em>Spline</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GeometryTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GeometryTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GeometryTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeometryTypeImpl extends EObjectImpl implements GeometryType {
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
   * The cached value of the '{@link #getConvexMesh() <em>Convex Mesh</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConvexMesh()
   * @generated
   * @ordered
   */
	protected ConvexMeshType convexMesh;

	/**
   * The cached value of the '{@link #getMesh() <em>Mesh</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMesh()
   * @generated
   * @ordered
   */
	protected MeshType mesh;

	/**
   * The cached value of the '{@link #getSpline() <em>Spline</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSpline()
   * @generated
   * @ordered
   */
	protected SplineType spline;

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
	protected GeometryTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getGeometryType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GEOMETRY_TYPE__ASSET, oldAsset, newAsset);
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
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GEOMETRY_TYPE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GEOMETRY_TYPE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GEOMETRY_TYPE__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ConvexMeshType getConvexMesh() {
    return convexMesh;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetConvexMesh(ConvexMeshType newConvexMesh, NotificationChain msgs) {
    ConvexMeshType oldConvexMesh = convexMesh;
    convexMesh = newConvexMesh;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GEOMETRY_TYPE__CONVEX_MESH, oldConvexMesh, newConvexMesh);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setConvexMesh(ConvexMeshType newConvexMesh) {
    if (newConvexMesh != convexMesh)
    {
      NotificationChain msgs = null;
      if (convexMesh != null)
        msgs = ((InternalEObject)convexMesh).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GEOMETRY_TYPE__CONVEX_MESH, null, msgs);
      if (newConvexMesh != null)
        msgs = ((InternalEObject)newConvexMesh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GEOMETRY_TYPE__CONVEX_MESH, null, msgs);
      msgs = basicSetConvexMesh(newConvexMesh, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GEOMETRY_TYPE__CONVEX_MESH, newConvexMesh, newConvexMesh));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MeshType getMesh() {
    return mesh;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMesh(MeshType newMesh, NotificationChain msgs) {
    MeshType oldMesh = mesh;
    mesh = newMesh;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GEOMETRY_TYPE__MESH, oldMesh, newMesh);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMesh(MeshType newMesh) {
    if (newMesh != mesh)
    {
      NotificationChain msgs = null;
      if (mesh != null)
        msgs = ((InternalEObject)mesh).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GEOMETRY_TYPE__MESH, null, msgs);
      if (newMesh != null)
        msgs = ((InternalEObject)newMesh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GEOMETRY_TYPE__MESH, null, msgs);
      msgs = basicSetMesh(newMesh, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GEOMETRY_TYPE__MESH, newMesh, newMesh));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SplineType getSpline() {
    return spline;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSpline(SplineType newSpline, NotificationChain msgs) {
    SplineType oldSpline = spline;
    spline = newSpline;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GEOMETRY_TYPE__SPLINE, oldSpline, newSpline);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSpline(SplineType newSpline) {
    if (newSpline != spline)
    {
      NotificationChain msgs = null;
      if (spline != null)
        msgs = ((InternalEObject)spline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GEOMETRY_TYPE__SPLINE, null, msgs);
      if (newSpline != null)
        msgs = ((InternalEObject)newSpline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GEOMETRY_TYPE__SPLINE, null, msgs);
      msgs = basicSetSpline(newSpline, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GEOMETRY_TYPE__SPLINE, newSpline, newSpline));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.GEOMETRY_TYPE__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GEOMETRY_TYPE__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GEOMETRY_TYPE__NAME, oldName, name));
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
      case ColladaPackage.GEOMETRY_TYPE__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.GEOMETRY_TYPE__CONVEX_MESH:
        return basicSetConvexMesh(null, msgs);
      case ColladaPackage.GEOMETRY_TYPE__MESH:
        return basicSetMesh(null, msgs);
      case ColladaPackage.GEOMETRY_TYPE__SPLINE:
        return basicSetSpline(null, msgs);
      case ColladaPackage.GEOMETRY_TYPE__EXTRA:
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
      case ColladaPackage.GEOMETRY_TYPE__ASSET:
        return getAsset();
      case ColladaPackage.GEOMETRY_TYPE__CONVEX_MESH:
        return getConvexMesh();
      case ColladaPackage.GEOMETRY_TYPE__MESH:
        return getMesh();
      case ColladaPackage.GEOMETRY_TYPE__SPLINE:
        return getSpline();
      case ColladaPackage.GEOMETRY_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.GEOMETRY_TYPE__ID:
        return getId();
      case ColladaPackage.GEOMETRY_TYPE__NAME:
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
      case ColladaPackage.GEOMETRY_TYPE__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.GEOMETRY_TYPE__CONVEX_MESH:
        setConvexMesh((ConvexMeshType)newValue);
        return;
      case ColladaPackage.GEOMETRY_TYPE__MESH:
        setMesh((MeshType)newValue);
        return;
      case ColladaPackage.GEOMETRY_TYPE__SPLINE:
        setSpline((SplineType)newValue);
        return;
      case ColladaPackage.GEOMETRY_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.GEOMETRY_TYPE__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.GEOMETRY_TYPE__NAME:
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
      case ColladaPackage.GEOMETRY_TYPE__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.GEOMETRY_TYPE__CONVEX_MESH:
        setConvexMesh((ConvexMeshType)null);
        return;
      case ColladaPackage.GEOMETRY_TYPE__MESH:
        setMesh((MeshType)null);
        return;
      case ColladaPackage.GEOMETRY_TYPE__SPLINE:
        setSpline((SplineType)null);
        return;
      case ColladaPackage.GEOMETRY_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.GEOMETRY_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.GEOMETRY_TYPE__NAME:
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
      case ColladaPackage.GEOMETRY_TYPE__ASSET:
        return asset != null;
      case ColladaPackage.GEOMETRY_TYPE__CONVEX_MESH:
        return convexMesh != null;
      case ColladaPackage.GEOMETRY_TYPE__MESH:
        return mesh != null;
      case ColladaPackage.GEOMETRY_TYPE__SPLINE:
        return spline != null;
      case ColladaPackage.GEOMETRY_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.GEOMETRY_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.GEOMETRY_TYPE__NAME:
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

} //GeometryTypeImpl
