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

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.GlesTexcombinerCommandType;
import org.khronos.collada.GlesTexenvCommandType;
import org.khronos.collada.GlesTexturePipeline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gles Texture Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.GlesTexturePipelineImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTexturePipelineImpl#getTexcombiner <em>Texcombiner</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTexturePipelineImpl#getTexenv <em>Texenv</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTexturePipelineImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTexturePipelineImpl#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlesTexturePipelineImpl extends EObjectImpl implements GlesTexturePipeline {
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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected GlesTexturePipelineImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getGlesTexturePipeline();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null)
    {
      group = new BasicFeatureMap(this, ColladaPackage.GLES_TEXTURE_PIPELINE__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<GlesTexcombinerCommandType> getTexcombiner() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlesTexturePipeline_Texcombiner());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<GlesTexenvCommandType> getTexenv() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlesTexturePipeline_Texenv());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGlesTexturePipeline_Extra());
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXTURE_PIPELINE__SID, oldSid, sid));
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
      case ColladaPackage.GLES_TEXTURE_PIPELINE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GLES_TEXTURE_PIPELINE__TEXCOMBINER:
        return ((InternalEList<?>)getTexcombiner()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GLES_TEXTURE_PIPELINE__TEXENV:
        return ((InternalEList<?>)getTexenv()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GLES_TEXTURE_PIPELINE__EXTRA:
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
      case ColladaPackage.GLES_TEXTURE_PIPELINE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.GLES_TEXTURE_PIPELINE__TEXCOMBINER:
        return getTexcombiner();
      case ColladaPackage.GLES_TEXTURE_PIPELINE__TEXENV:
        return getTexenv();
      case ColladaPackage.GLES_TEXTURE_PIPELINE__EXTRA:
        return getExtra();
      case ColladaPackage.GLES_TEXTURE_PIPELINE__SID:
        return getSid();
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
      case ColladaPackage.GLES_TEXTURE_PIPELINE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.GLES_TEXTURE_PIPELINE__TEXCOMBINER:
        getTexcombiner().clear();
        getTexcombiner().addAll((Collection<? extends GlesTexcombinerCommandType>)newValue);
        return;
      case ColladaPackage.GLES_TEXTURE_PIPELINE__TEXENV:
        getTexenv().clear();
        getTexenv().addAll((Collection<? extends GlesTexenvCommandType>)newValue);
        return;
      case ColladaPackage.GLES_TEXTURE_PIPELINE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.GLES_TEXTURE_PIPELINE__SID:
        setSid((String)newValue);
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
      case ColladaPackage.GLES_TEXTURE_PIPELINE__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.GLES_TEXTURE_PIPELINE__TEXCOMBINER:
        getTexcombiner().clear();
        return;
      case ColladaPackage.GLES_TEXTURE_PIPELINE__TEXENV:
        getTexenv().clear();
        return;
      case ColladaPackage.GLES_TEXTURE_PIPELINE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.GLES_TEXTURE_PIPELINE__SID:
        setSid(SID_EDEFAULT);
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
      case ColladaPackage.GLES_TEXTURE_PIPELINE__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.GLES_TEXTURE_PIPELINE__TEXCOMBINER:
        return !getTexcombiner().isEmpty();
      case ColladaPackage.GLES_TEXTURE_PIPELINE__TEXENV:
        return !getTexenv().isEmpty();
      case ColladaPackage.GLES_TEXTURE_PIPELINE__EXTRA:
        return !getExtra().isEmpty();
      case ColladaPackage.GLES_TEXTURE_PIPELINE__SID:
        return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
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
    result.append(", sid: ");
    result.append(sid);
    result.append(')');
    return result.toString();
  }

} //GlesTexturePipelineImpl
