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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.JointsType;
import org.khronos.collada.SkinType;
import org.khronos.collada.SourceType;
import org.khronos.collada.VertexWeightsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skin Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.SkinTypeImpl#getBindShapeMatrix <em>Bind Shape Matrix</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SkinTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SkinTypeImpl#getJoints <em>Joints</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SkinTypeImpl#getVertexWeights <em>Vertex Weights</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SkinTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.SkinTypeImpl#getSource1 <em>Source1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SkinTypeImpl extends EObjectImpl implements SkinType {
	/**
   * The default value of the '{@link #getBindShapeMatrix() <em>Bind Shape Matrix</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBindShapeMatrix()
   * @generated
   * @ordered
   */
	protected static final List<Double> BIND_SHAPE_MATRIX_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBindShapeMatrix() <em>Bind Shape Matrix</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBindShapeMatrix()
   * @generated
   * @ordered
   */
	protected List<Double> bindShapeMatrix = BIND_SHAPE_MATRIX_EDEFAULT;

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
   * The cached value of the '{@link #getJoints() <em>Joints</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getJoints()
   * @generated
   * @ordered
   */
	protected JointsType joints;

	/**
   * The cached value of the '{@link #getVertexWeights() <em>Vertex Weights</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVertexWeights()
   * @generated
   * @ordered
   */
	protected VertexWeightsType vertexWeights;

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
   * The default value of the '{@link #getSource1() <em>Source1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource1()
   * @generated
   * @ordered
   */
	protected static final String SOURCE1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSource1() <em>Source1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource1()
   * @generated
   * @ordered
   */
	protected String source1 = SOURCE1_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SkinTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getSkinType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getBindShapeMatrix() {
    return bindShapeMatrix;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBindShapeMatrix(List<Double> newBindShapeMatrix) {
    List<Double> oldBindShapeMatrix = bindShapeMatrix;
    bindShapeMatrix = newBindShapeMatrix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SKIN_TYPE__BIND_SHAPE_MATRIX, oldBindShapeMatrix, bindShapeMatrix));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SourceType> getSource() {
    if (source == null)
    {
      source = new EObjectContainmentEList<SourceType>(SourceType.class, this, ColladaPackage.SKIN_TYPE__SOURCE);
    }
    return source;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public JointsType getJoints() {
    return joints;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetJoints(JointsType newJoints, NotificationChain msgs) {
    JointsType oldJoints = joints;
    joints = newJoints;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SKIN_TYPE__JOINTS, oldJoints, newJoints);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setJoints(JointsType newJoints) {
    if (newJoints != joints)
    {
      NotificationChain msgs = null;
      if (joints != null)
        msgs = ((InternalEObject)joints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SKIN_TYPE__JOINTS, null, msgs);
      if (newJoints != null)
        msgs = ((InternalEObject)newJoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SKIN_TYPE__JOINTS, null, msgs);
      msgs = basicSetJoints(newJoints, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SKIN_TYPE__JOINTS, newJoints, newJoints));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public VertexWeightsType getVertexWeights() {
    return vertexWeights;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetVertexWeights(VertexWeightsType newVertexWeights, NotificationChain msgs) {
    VertexWeightsType oldVertexWeights = vertexWeights;
    vertexWeights = newVertexWeights;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SKIN_TYPE__VERTEX_WEIGHTS, oldVertexWeights, newVertexWeights);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setVertexWeights(VertexWeightsType newVertexWeights) {
    if (newVertexWeights != vertexWeights)
    {
      NotificationChain msgs = null;
      if (vertexWeights != null)
        msgs = ((InternalEObject)vertexWeights).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SKIN_TYPE__VERTEX_WEIGHTS, null, msgs);
      if (newVertexWeights != null)
        msgs = ((InternalEObject)newVertexWeights).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SKIN_TYPE__VERTEX_WEIGHTS, null, msgs);
      msgs = basicSetVertexWeights(newVertexWeights, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SKIN_TYPE__VERTEX_WEIGHTS, newVertexWeights, newVertexWeights));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.SKIN_TYPE__EXTRA);
    }
    return extra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSource1() {
    return source1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSource1(String newSource1) {
    String oldSource1 = source1;
    source1 = newSource1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SKIN_TYPE__SOURCE1, oldSource1, source1));
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
      case ColladaPackage.SKIN_TYPE__SOURCE:
        return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
      case ColladaPackage.SKIN_TYPE__JOINTS:
        return basicSetJoints(null, msgs);
      case ColladaPackage.SKIN_TYPE__VERTEX_WEIGHTS:
        return basicSetVertexWeights(null, msgs);
      case ColladaPackage.SKIN_TYPE__EXTRA:
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
      case ColladaPackage.SKIN_TYPE__BIND_SHAPE_MATRIX:
        return getBindShapeMatrix();
      case ColladaPackage.SKIN_TYPE__SOURCE:
        return getSource();
      case ColladaPackage.SKIN_TYPE__JOINTS:
        return getJoints();
      case ColladaPackage.SKIN_TYPE__VERTEX_WEIGHTS:
        return getVertexWeights();
      case ColladaPackage.SKIN_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.SKIN_TYPE__SOURCE1:
        return getSource1();
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
      case ColladaPackage.SKIN_TYPE__BIND_SHAPE_MATRIX:
        setBindShapeMatrix((List<Double>)newValue);
        return;
      case ColladaPackage.SKIN_TYPE__SOURCE:
        getSource().clear();
        getSource().addAll((Collection<? extends SourceType>)newValue);
        return;
      case ColladaPackage.SKIN_TYPE__JOINTS:
        setJoints((JointsType)newValue);
        return;
      case ColladaPackage.SKIN_TYPE__VERTEX_WEIGHTS:
        setVertexWeights((VertexWeightsType)newValue);
        return;
      case ColladaPackage.SKIN_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.SKIN_TYPE__SOURCE1:
        setSource1((String)newValue);
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
      case ColladaPackage.SKIN_TYPE__BIND_SHAPE_MATRIX:
        setBindShapeMatrix(BIND_SHAPE_MATRIX_EDEFAULT);
        return;
      case ColladaPackage.SKIN_TYPE__SOURCE:
        getSource().clear();
        return;
      case ColladaPackage.SKIN_TYPE__JOINTS:
        setJoints((JointsType)null);
        return;
      case ColladaPackage.SKIN_TYPE__VERTEX_WEIGHTS:
        setVertexWeights((VertexWeightsType)null);
        return;
      case ColladaPackage.SKIN_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.SKIN_TYPE__SOURCE1:
        setSource1(SOURCE1_EDEFAULT);
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
      case ColladaPackage.SKIN_TYPE__BIND_SHAPE_MATRIX:
        return BIND_SHAPE_MATRIX_EDEFAULT == null ? bindShapeMatrix != null : !BIND_SHAPE_MATRIX_EDEFAULT.equals(bindShapeMatrix);
      case ColladaPackage.SKIN_TYPE__SOURCE:
        return source != null && !source.isEmpty();
      case ColladaPackage.SKIN_TYPE__JOINTS:
        return joints != null;
      case ColladaPackage.SKIN_TYPE__VERTEX_WEIGHTS:
        return vertexWeights != null;
      case ColladaPackage.SKIN_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.SKIN_TYPE__SOURCE1:
        return SOURCE1_EDEFAULT == null ? source1 != null : !SOURCE1_EDEFAULT.equals(source1);
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
    result.append(" (bindShapeMatrix: ");
    result.append(bindShapeMatrix);
    result.append(", source1: ");
    result.append(source1);
    result.append(')');
    return result.toString();
  }

} //SkinTypeImpl
