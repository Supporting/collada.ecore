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

import org.khronos.collada.BindMaterialType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.ParamType4;
import org.khronos.collada.TechniqueCommonType7;
import org.khronos.collada.TechniqueCommonType5;
import org.khronos.collada.TechniqueType4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bind Material Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.BindMaterialTypeImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BindMaterialTypeImpl#getTechniqueCommon <em>Technique Common</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BindMaterialTypeImpl#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BindMaterialTypeImpl#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindMaterialTypeImpl extends EObjectImpl implements BindMaterialType {
	/**
   * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
	protected EList<ParamType4> param;

	/**
   * The cached value of the '{@link #getTechniqueCommon() <em>Technique Common</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTechniqueCommon()
   * @generated
   * @ordered
   */
	protected TechniqueCommonType5 techniqueCommon;

	/**
   * The cached value of the '{@link #getTechnique() <em>Technique</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTechnique()
   * @generated
   * @ordered
   */
	protected EList<TechniqueType4> technique;

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
	protected BindMaterialTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getBindMaterialType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ParamType4> getParam() {
    if (param == null)
    {
      param = new EObjectContainmentEList<ParamType4>(ParamType4.class, this, ColladaPackage.BIND_MATERIAL_TYPE__PARAM);
    }
    return param;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueCommonType5 getTechniqueCommon() {
    return techniqueCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTechniqueCommon(TechniqueCommonType5 newTechniqueCommon, NotificationChain msgs) {
    TechniqueCommonType5 oldTechniqueCommon = techniqueCommon;
    techniqueCommon = newTechniqueCommon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BIND_MATERIAL_TYPE__TECHNIQUE_COMMON, oldTechniqueCommon, newTechniqueCommon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTechniqueCommon(TechniqueCommonType5 newTechniqueCommon) {
    if (newTechniqueCommon != techniqueCommon)
    {
      NotificationChain msgs = null;
      if (techniqueCommon != null)
        msgs = ((InternalEObject)techniqueCommon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BIND_MATERIAL_TYPE__TECHNIQUE_COMMON, null, msgs);
      if (newTechniqueCommon != null)
        msgs = ((InternalEObject)newTechniqueCommon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BIND_MATERIAL_TYPE__TECHNIQUE_COMMON, null, msgs);
      msgs = basicSetTechniqueCommon(newTechniqueCommon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BIND_MATERIAL_TYPE__TECHNIQUE_COMMON, newTechniqueCommon, newTechniqueCommon));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TechniqueType4> getTechnique() {
    if (technique == null)
    {
      technique = new EObjectContainmentEList<TechniqueType4>(TechniqueType4.class, this, ColladaPackage.BIND_MATERIAL_TYPE__TECHNIQUE);
    }
    return technique;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.BIND_MATERIAL_TYPE__EXTRA);
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
      case ColladaPackage.BIND_MATERIAL_TYPE__PARAM:
        return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
      case ColladaPackage.BIND_MATERIAL_TYPE__TECHNIQUE_COMMON:
        return basicSetTechniqueCommon(null, msgs);
      case ColladaPackage.BIND_MATERIAL_TYPE__TECHNIQUE:
        return ((InternalEList<?>)getTechnique()).basicRemove(otherEnd, msgs);
      case ColladaPackage.BIND_MATERIAL_TYPE__EXTRA:
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
      case ColladaPackage.BIND_MATERIAL_TYPE__PARAM:
        return getParam();
      case ColladaPackage.BIND_MATERIAL_TYPE__TECHNIQUE_COMMON:
        return getTechniqueCommon();
      case ColladaPackage.BIND_MATERIAL_TYPE__TECHNIQUE:
        return getTechnique();
      case ColladaPackage.BIND_MATERIAL_TYPE__EXTRA:
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
      case ColladaPackage.BIND_MATERIAL_TYPE__PARAM:
        getParam().clear();
        getParam().addAll((Collection<? extends ParamType4>)newValue);
        return;
      case ColladaPackage.BIND_MATERIAL_TYPE__TECHNIQUE_COMMON:
        setTechniqueCommon((TechniqueCommonType5)newValue);
        return;
      case ColladaPackage.BIND_MATERIAL_TYPE__TECHNIQUE:
        getTechnique().clear();
        getTechnique().addAll((Collection<? extends TechniqueType4>)newValue);
        return;
      case ColladaPackage.BIND_MATERIAL_TYPE__EXTRA:
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
      case ColladaPackage.BIND_MATERIAL_TYPE__PARAM:
        getParam().clear();
        return;
      case ColladaPackage.BIND_MATERIAL_TYPE__TECHNIQUE_COMMON:
        setTechniqueCommon((TechniqueCommonType5)null);
        return;
      case ColladaPackage.BIND_MATERIAL_TYPE__TECHNIQUE:
        getTechnique().clear();
        return;
      case ColladaPackage.BIND_MATERIAL_TYPE__EXTRA:
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
      case ColladaPackage.BIND_MATERIAL_TYPE__PARAM:
        return param != null && !param.isEmpty();
      case ColladaPackage.BIND_MATERIAL_TYPE__TECHNIQUE_COMMON:
        return techniqueCommon != null;
      case ColladaPackage.BIND_MATERIAL_TYPE__TECHNIQUE:
        return technique != null && !technique.isEmpty();
      case ColladaPackage.BIND_MATERIAL_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BindMaterialTypeImpl
