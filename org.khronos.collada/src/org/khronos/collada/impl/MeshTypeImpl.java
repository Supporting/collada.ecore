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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.LinesType;
import org.khronos.collada.LinestripsType;
import org.khronos.collada.MeshType;
import org.khronos.collada.PolygonsType;
import org.khronos.collada.PolylistType;
import org.khronos.collada.SourceType;
import org.khronos.collada.TrianglesType;
import org.khronos.collada.TrifansType;
import org.khronos.collada.TristripsType;
import org.khronos.collada.VerticesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mesh Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.MeshTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MeshTypeImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MeshTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MeshTypeImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MeshTypeImpl#getLinestrips <em>Linestrips</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MeshTypeImpl#getPolygons <em>Polygons</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MeshTypeImpl#getPolylist <em>Polylist</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MeshTypeImpl#getTriangles <em>Triangles</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MeshTypeImpl#getTrifans <em>Trifans</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MeshTypeImpl#getTristrips <em>Tristrips</em>}</li>
 *   <li>{@link org.khronos.collada.impl.MeshTypeImpl#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeshTypeImpl extends EObjectImpl implements MeshType {
	/**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
	protected EList<SourceType> source;

	/**
   * The cached value of the '{@link #getVertices() <em>Vertices</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVertices()
   * @generated
   * @ordered
   */
	protected VerticesType vertices;

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
	protected MeshTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getMeshType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SourceType> getSource() {
    if (source == null)
    {
      source = new EObjectContainmentEList<SourceType>(SourceType.class, this, ColladaPackage.MESH_TYPE__SOURCE);
    }
    return source;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public VerticesType getVertices() {
    return vertices;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetVertices(VerticesType newVertices, NotificationChain msgs) {
    VerticesType oldVertices = vertices;
    vertices = newVertices;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.MESH_TYPE__VERTICES, oldVertices, newVertices);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setVertices(VerticesType newVertices) {
    if (newVertices != vertices)
    {
      NotificationChain msgs = null;
      if (vertices != null)
        msgs = ((InternalEObject)vertices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.MESH_TYPE__VERTICES, null, msgs);
      if (newVertices != null)
        msgs = ((InternalEObject)newVertices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.MESH_TYPE__VERTICES, null, msgs);
      msgs = basicSetVertices(newVertices, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.MESH_TYPE__VERTICES, newVertices, newVertices));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null)
    {
      group = new BasicFeatureMap(this, ColladaPackage.MESH_TYPE__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LinesType> getLines() {
    return getGroup().list(ColladaPackage.eINSTANCE.getMeshType_Lines());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LinestripsType> getLinestrips() {
    return getGroup().list(ColladaPackage.eINSTANCE.getMeshType_Linestrips());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PolygonsType> getPolygons() {
    return getGroup().list(ColladaPackage.eINSTANCE.getMeshType_Polygons());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PolylistType> getPolylist() {
    return getGroup().list(ColladaPackage.eINSTANCE.getMeshType_Polylist());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TrianglesType> getTriangles() {
    return getGroup().list(ColladaPackage.eINSTANCE.getMeshType_Triangles());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TrifansType> getTrifans() {
    return getGroup().list(ColladaPackage.eINSTANCE.getMeshType_Trifans());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TristripsType> getTristrips() {
    return getGroup().list(ColladaPackage.eINSTANCE.getMeshType_Tristrips());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.MESH_TYPE__EXTRA);
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
      case ColladaPackage.MESH_TYPE__SOURCE:
        return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
      case ColladaPackage.MESH_TYPE__VERTICES:
        return basicSetVertices(null, msgs);
      case ColladaPackage.MESH_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.MESH_TYPE__LINES:
        return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
      case ColladaPackage.MESH_TYPE__LINESTRIPS:
        return ((InternalEList<?>)getLinestrips()).basicRemove(otherEnd, msgs);
      case ColladaPackage.MESH_TYPE__POLYGONS:
        return ((InternalEList<?>)getPolygons()).basicRemove(otherEnd, msgs);
      case ColladaPackage.MESH_TYPE__POLYLIST:
        return ((InternalEList<?>)getPolylist()).basicRemove(otherEnd, msgs);
      case ColladaPackage.MESH_TYPE__TRIANGLES:
        return ((InternalEList<?>)getTriangles()).basicRemove(otherEnd, msgs);
      case ColladaPackage.MESH_TYPE__TRIFANS:
        return ((InternalEList<?>)getTrifans()).basicRemove(otherEnd, msgs);
      case ColladaPackage.MESH_TYPE__TRISTRIPS:
        return ((InternalEList<?>)getTristrips()).basicRemove(otherEnd, msgs);
      case ColladaPackage.MESH_TYPE__EXTRA:
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
      case ColladaPackage.MESH_TYPE__SOURCE:
        return getSource();
      case ColladaPackage.MESH_TYPE__VERTICES:
        return getVertices();
      case ColladaPackage.MESH_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.MESH_TYPE__LINES:
        return getLines();
      case ColladaPackage.MESH_TYPE__LINESTRIPS:
        return getLinestrips();
      case ColladaPackage.MESH_TYPE__POLYGONS:
        return getPolygons();
      case ColladaPackage.MESH_TYPE__POLYLIST:
        return getPolylist();
      case ColladaPackage.MESH_TYPE__TRIANGLES:
        return getTriangles();
      case ColladaPackage.MESH_TYPE__TRIFANS:
        return getTrifans();
      case ColladaPackage.MESH_TYPE__TRISTRIPS:
        return getTristrips();
      case ColladaPackage.MESH_TYPE__EXTRA:
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
      case ColladaPackage.MESH_TYPE__SOURCE:
        getSource().clear();
        getSource().addAll((Collection<? extends SourceType>)newValue);
        return;
      case ColladaPackage.MESH_TYPE__VERTICES:
        setVertices((VerticesType)newValue);
        return;
      case ColladaPackage.MESH_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.MESH_TYPE__LINES:
        getLines().clear();
        getLines().addAll((Collection<? extends LinesType>)newValue);
        return;
      case ColladaPackage.MESH_TYPE__LINESTRIPS:
        getLinestrips().clear();
        getLinestrips().addAll((Collection<? extends LinestripsType>)newValue);
        return;
      case ColladaPackage.MESH_TYPE__POLYGONS:
        getPolygons().clear();
        getPolygons().addAll((Collection<? extends PolygonsType>)newValue);
        return;
      case ColladaPackage.MESH_TYPE__POLYLIST:
        getPolylist().clear();
        getPolylist().addAll((Collection<? extends PolylistType>)newValue);
        return;
      case ColladaPackage.MESH_TYPE__TRIANGLES:
        getTriangles().clear();
        getTriangles().addAll((Collection<? extends TrianglesType>)newValue);
        return;
      case ColladaPackage.MESH_TYPE__TRIFANS:
        getTrifans().clear();
        getTrifans().addAll((Collection<? extends TrifansType>)newValue);
        return;
      case ColladaPackage.MESH_TYPE__TRISTRIPS:
        getTristrips().clear();
        getTristrips().addAll((Collection<? extends TristripsType>)newValue);
        return;
      case ColladaPackage.MESH_TYPE__EXTRA:
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
      case ColladaPackage.MESH_TYPE__SOURCE:
        getSource().clear();
        return;
      case ColladaPackage.MESH_TYPE__VERTICES:
        setVertices((VerticesType)null);
        return;
      case ColladaPackage.MESH_TYPE__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.MESH_TYPE__LINES:
        getLines().clear();
        return;
      case ColladaPackage.MESH_TYPE__LINESTRIPS:
        getLinestrips().clear();
        return;
      case ColladaPackage.MESH_TYPE__POLYGONS:
        getPolygons().clear();
        return;
      case ColladaPackage.MESH_TYPE__POLYLIST:
        getPolylist().clear();
        return;
      case ColladaPackage.MESH_TYPE__TRIANGLES:
        getTriangles().clear();
        return;
      case ColladaPackage.MESH_TYPE__TRIFANS:
        getTrifans().clear();
        return;
      case ColladaPackage.MESH_TYPE__TRISTRIPS:
        getTristrips().clear();
        return;
      case ColladaPackage.MESH_TYPE__EXTRA:
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
      case ColladaPackage.MESH_TYPE__SOURCE:
        return source != null && !source.isEmpty();
      case ColladaPackage.MESH_TYPE__VERTICES:
        return vertices != null;
      case ColladaPackage.MESH_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.MESH_TYPE__LINES:
        return !getLines().isEmpty();
      case ColladaPackage.MESH_TYPE__LINESTRIPS:
        return !getLinestrips().isEmpty();
      case ColladaPackage.MESH_TYPE__POLYGONS:
        return !getPolygons().isEmpty();
      case ColladaPackage.MESH_TYPE__POLYLIST:
        return !getPolylist().isEmpty();
      case ColladaPackage.MESH_TYPE__TRIANGLES:
        return !getTriangles().isEmpty();
      case ColladaPackage.MESH_TYPE__TRIFANS:
        return !getTrifans().isEmpty();
      case ColladaPackage.MESH_TYPE__TRISTRIPS:
        return !getTristrips().isEmpty();
      case ColladaPackage.MESH_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //MeshTypeImpl
