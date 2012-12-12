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
import org.khronos.collada.FxAnnotateCommon;
import org.khronos.collada.FxCodeProfile;
import org.khronos.collada.FxIncludeCommon;
import org.khronos.collada.GeneratorType;
import org.khronos.collada.GlslSetparamSimple;
import org.khronos.collada.NameType;
import org.khronos.collada.NameType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.GeneratorTypeImpl#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GeneratorTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GeneratorTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GeneratorTypeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GeneratorTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GeneratorTypeImpl#getSetparam <em>Setparam</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorTypeImpl extends EObjectImpl implements GeneratorType {
	/**
   * The cached value of the '{@link #getAnnotate() <em>Annotate</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnnotate()
   * @generated
   * @ordered
   */
	protected EList<FxAnnotateCommon> annotate;

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
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected NameType2 name;

	/**
   * The cached value of the '{@link #getSetparam() <em>Setparam</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSetparam()
   * @generated
   * @ordered
   */
	protected EList<GlslSetparamSimple> setparam;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected GeneratorTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getGeneratorType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxAnnotateCommon> getAnnotate() {
    if (annotate == null)
    {
      annotate = new EObjectContainmentEList<FxAnnotateCommon>(FxAnnotateCommon.class, this, ColladaPackage.GENERATOR_TYPE__ANNOTATE);
    }
    return annotate;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null)
    {
      group = new BasicFeatureMap(this, ColladaPackage.GENERATOR_TYPE__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxCodeProfile> getCode() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGeneratorType_Code());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxIncludeCommon> getInclude() {
    return getGroup().list(ColladaPackage.eINSTANCE.getGeneratorType_Include());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NameType2 getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetName(NameType2 newName, NotificationChain msgs) {
    NameType2 oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GENERATOR_TYPE__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setName(NameType2 newName) {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GENERATOR_TYPE__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GENERATOR_TYPE__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GENERATOR_TYPE__NAME, newName, newName));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<GlslSetparamSimple> getSetparam() {
    if (setparam == null)
    {
      setparam = new EObjectContainmentEList<GlslSetparamSimple>(GlslSetparamSimple.class, this, ColladaPackage.GENERATOR_TYPE__SETPARAM);
    }
    return setparam;
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
      case ColladaPackage.GENERATOR_TYPE__ANNOTATE:
        return ((InternalEList<?>)getAnnotate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GENERATOR_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GENERATOR_TYPE__CODE:
        return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GENERATOR_TYPE__INCLUDE:
        return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
      case ColladaPackage.GENERATOR_TYPE__NAME:
        return basicSetName(null, msgs);
      case ColladaPackage.GENERATOR_TYPE__SETPARAM:
        return ((InternalEList<?>)getSetparam()).basicRemove(otherEnd, msgs);
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
      case ColladaPackage.GENERATOR_TYPE__ANNOTATE:
        return getAnnotate();
      case ColladaPackage.GENERATOR_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.GENERATOR_TYPE__CODE:
        return getCode();
      case ColladaPackage.GENERATOR_TYPE__INCLUDE:
        return getInclude();
      case ColladaPackage.GENERATOR_TYPE__NAME:
        return getName();
      case ColladaPackage.GENERATOR_TYPE__SETPARAM:
        return getSetparam();
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
      case ColladaPackage.GENERATOR_TYPE__ANNOTATE:
        getAnnotate().clear();
        getAnnotate().addAll((Collection<? extends FxAnnotateCommon>)newValue);
        return;
      case ColladaPackage.GENERATOR_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.GENERATOR_TYPE__CODE:
        getCode().clear();
        getCode().addAll((Collection<? extends FxCodeProfile>)newValue);
        return;
      case ColladaPackage.GENERATOR_TYPE__INCLUDE:
        getInclude().clear();
        getInclude().addAll((Collection<? extends FxIncludeCommon>)newValue);
        return;
      case ColladaPackage.GENERATOR_TYPE__NAME:
        setName((NameType2)newValue);
        return;
      case ColladaPackage.GENERATOR_TYPE__SETPARAM:
        getSetparam().clear();
        getSetparam().addAll((Collection<? extends GlslSetparamSimple>)newValue);
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
      case ColladaPackage.GENERATOR_TYPE__ANNOTATE:
        getAnnotate().clear();
        return;
      case ColladaPackage.GENERATOR_TYPE__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.GENERATOR_TYPE__CODE:
        getCode().clear();
        return;
      case ColladaPackage.GENERATOR_TYPE__INCLUDE:
        getInclude().clear();
        return;
      case ColladaPackage.GENERATOR_TYPE__NAME:
        setName((NameType2)null);
        return;
      case ColladaPackage.GENERATOR_TYPE__SETPARAM:
        getSetparam().clear();
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
      case ColladaPackage.GENERATOR_TYPE__ANNOTATE:
        return annotate != null && !annotate.isEmpty();
      case ColladaPackage.GENERATOR_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.GENERATOR_TYPE__CODE:
        return !getCode().isEmpty();
      case ColladaPackage.GENERATOR_TYPE__INCLUDE:
        return !getInclude().isEmpty();
      case ColladaPackage.GENERATOR_TYPE__NAME:
        return name != null;
      case ColladaPackage.GENERATOR_TYPE__SETPARAM:
        return setparam != null && !setparam.isEmpty();
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

} //GeneratorTypeImpl
