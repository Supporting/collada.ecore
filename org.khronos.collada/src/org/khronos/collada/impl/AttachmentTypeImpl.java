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
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.AttachmentType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.RotateType;
import org.khronos.collada.TargetableFloat3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.AttachmentTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AttachmentTypeImpl#getTranslate <em>Translate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AttachmentTypeImpl#getRotate <em>Rotate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AttachmentTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AttachmentTypeImpl#getRigidBody <em>Rigid Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttachmentTypeImpl extends EObjectImpl implements AttachmentType {
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
   * The default value of the '{@link #getRigidBody() <em>Rigid Body</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRigidBody()
   * @generated
   * @ordered
   */
	protected static final String RIGID_BODY_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getRigidBody() <em>Rigid Body</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRigidBody()
   * @generated
   * @ordered
   */
	protected String rigidBody = RIGID_BODY_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AttachmentTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getAttachmentType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null)
    {
      group = new BasicFeatureMap(this, ColladaPackage.ATTACHMENT_TYPE__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TargetableFloat3> getTranslate() {
    return getGroup().list(ColladaPackage.eINSTANCE.getAttachmentType_Translate());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<RotateType> getRotate() {
    return getGroup().list(ColladaPackage.eINSTANCE.getAttachmentType_Rotate());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    return getGroup().list(ColladaPackage.eINSTANCE.getAttachmentType_Extra());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getRigidBody() {
    return rigidBody;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRigidBody(String newRigidBody) {
    String oldRigidBody = rigidBody;
    rigidBody = newRigidBody;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ATTACHMENT_TYPE__RIGID_BODY, oldRigidBody, rigidBody));
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
      case ColladaPackage.ATTACHMENT_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.ATTACHMENT_TYPE__TRANSLATE:
        return ((InternalEList<?>)getTranslate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.ATTACHMENT_TYPE__ROTATE:
        return ((InternalEList<?>)getRotate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.ATTACHMENT_TYPE__EXTRA:
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
      case ColladaPackage.ATTACHMENT_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.ATTACHMENT_TYPE__TRANSLATE:
        return getTranslate();
      case ColladaPackage.ATTACHMENT_TYPE__ROTATE:
        return getRotate();
      case ColladaPackage.ATTACHMENT_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.ATTACHMENT_TYPE__RIGID_BODY:
        return getRigidBody();
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
      case ColladaPackage.ATTACHMENT_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.ATTACHMENT_TYPE__TRANSLATE:
        getTranslate().clear();
        getTranslate().addAll((Collection<? extends TargetableFloat3>)newValue);
        return;
      case ColladaPackage.ATTACHMENT_TYPE__ROTATE:
        getRotate().clear();
        getRotate().addAll((Collection<? extends RotateType>)newValue);
        return;
      case ColladaPackage.ATTACHMENT_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.ATTACHMENT_TYPE__RIGID_BODY:
        setRigidBody((String)newValue);
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
      case ColladaPackage.ATTACHMENT_TYPE__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.ATTACHMENT_TYPE__TRANSLATE:
        getTranslate().clear();
        return;
      case ColladaPackage.ATTACHMENT_TYPE__ROTATE:
        getRotate().clear();
        return;
      case ColladaPackage.ATTACHMENT_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.ATTACHMENT_TYPE__RIGID_BODY:
        setRigidBody(RIGID_BODY_EDEFAULT);
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
      case ColladaPackage.ATTACHMENT_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.ATTACHMENT_TYPE__TRANSLATE:
        return !getTranslate().isEmpty();
      case ColladaPackage.ATTACHMENT_TYPE__ROTATE:
        return !getRotate().isEmpty();
      case ColladaPackage.ATTACHMENT_TYPE__EXTRA:
        return !getExtra().isEmpty();
      case ColladaPackage.ATTACHMENT_TYPE__RIGID_BODY:
        return RIGID_BODY_EDEFAULT == null ? rigidBody != null : !RIGID_BODY_EDEFAULT.equals(rigidBody);
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
    result.append(", rigidBody: ");
    result.append(rigidBody);
    result.append(')');
    return result.toString();
  }

} //AttachmentTypeImpl
