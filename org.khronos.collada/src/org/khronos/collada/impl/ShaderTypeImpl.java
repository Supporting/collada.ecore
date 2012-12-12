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

import org.khronos.collada.BindType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.CompilerTargetType;
import org.khronos.collada.FxAnnotateCommon;
import org.khronos.collada.GlslPipelineStage;
import org.khronos.collada.NameType1;
import org.khronos.collada.ShaderType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shader Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.ShaderTypeImpl#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShaderTypeImpl#getCompilerTarget <em>Compiler Target</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShaderTypeImpl#getCompilerOptions <em>Compiler Options</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShaderTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShaderTypeImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShaderTypeImpl#getStage <em>Stage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShaderTypeImpl extends EObjectImpl implements ShaderType {
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
   * The cached value of the '{@link #getCompilerTarget() <em>Compiler Target</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCompilerTarget()
   * @generated
   * @ordered
   */
	protected CompilerTargetType compilerTarget;

	/**
   * The default value of the '{@link #getCompilerOptions() <em>Compiler Options</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCompilerOptions()
   * @generated
   * @ordered
   */
	protected static final String COMPILER_OPTIONS_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getCompilerOptions() <em>Compiler Options</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCompilerOptions()
   * @generated
   * @ordered
   */
	protected String compilerOptions = COMPILER_OPTIONS_EDEFAULT;

	/**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected NameType1 name;

	/**
   * The cached value of the '{@link #getBind() <em>Bind</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBind()
   * @generated
   * @ordered
   */
	protected EList<BindType> bind;

	/**
   * The default value of the '{@link #getStage() <em>Stage</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStage()
   * @generated
   * @ordered
   */
	protected static final GlslPipelineStage STAGE_EDEFAULT = GlslPipelineStage.VERTEXPROGRAM;

	/**
   * The cached value of the '{@link #getStage() <em>Stage</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStage()
   * @generated
   * @ordered
   */
	protected GlslPipelineStage stage = STAGE_EDEFAULT;

	/**
   * This is true if the Stage attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean stageESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ShaderTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getShaderType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxAnnotateCommon> getAnnotate() {
    if (annotate == null)
    {
      annotate = new EObjectContainmentEList<FxAnnotateCommon>(FxAnnotateCommon.class, this, ColladaPackage.SHADER_TYPE__ANNOTATE);
    }
    return annotate;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CompilerTargetType getCompilerTarget() {
    return compilerTarget;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetCompilerTarget(CompilerTargetType newCompilerTarget, NotificationChain msgs) {
    CompilerTargetType oldCompilerTarget = compilerTarget;
    compilerTarget = newCompilerTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SHADER_TYPE__COMPILER_TARGET, oldCompilerTarget, newCompilerTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCompilerTarget(CompilerTargetType newCompilerTarget) {
    if (newCompilerTarget != compilerTarget)
    {
      NotificationChain msgs = null;
      if (compilerTarget != null)
        msgs = ((InternalEObject)compilerTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHADER_TYPE__COMPILER_TARGET, null, msgs);
      if (newCompilerTarget != null)
        msgs = ((InternalEObject)newCompilerTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHADER_TYPE__COMPILER_TARGET, null, msgs);
      msgs = basicSetCompilerTarget(newCompilerTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHADER_TYPE__COMPILER_TARGET, newCompilerTarget, newCompilerTarget));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getCompilerOptions() {
    return compilerOptions;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCompilerOptions(String newCompilerOptions) {
    String oldCompilerOptions = compilerOptions;
    compilerOptions = newCompilerOptions;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHADER_TYPE__COMPILER_OPTIONS, oldCompilerOptions, compilerOptions));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NameType1 getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetName(NameType1 newName, NotificationChain msgs) {
    NameType1 oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SHADER_TYPE__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setName(NameType1 newName) {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHADER_TYPE__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHADER_TYPE__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHADER_TYPE__NAME, newName, newName));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<BindType> getBind() {
    if (bind == null)
    {
      bind = new EObjectContainmentEList<BindType>(BindType.class, this, ColladaPackage.SHADER_TYPE__BIND);
    }
    return bind;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlslPipelineStage getStage() {
    return stage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setStage(GlslPipelineStage newStage) {
    GlslPipelineStage oldStage = stage;
    stage = newStage == null ? STAGE_EDEFAULT : newStage;
    boolean oldStageESet = stageESet;
    stageESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHADER_TYPE__STAGE, oldStage, stage, !oldStageESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetStage() {
    GlslPipelineStage oldStage = stage;
    boolean oldStageESet = stageESet;
    stage = STAGE_EDEFAULT;
    stageESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.SHADER_TYPE__STAGE, oldStage, STAGE_EDEFAULT, oldStageESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetStage() {
    return stageESet;
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
      case ColladaPackage.SHADER_TYPE__ANNOTATE:
        return ((InternalEList<?>)getAnnotate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.SHADER_TYPE__COMPILER_TARGET:
        return basicSetCompilerTarget(null, msgs);
      case ColladaPackage.SHADER_TYPE__NAME:
        return basicSetName(null, msgs);
      case ColladaPackage.SHADER_TYPE__BIND:
        return ((InternalEList<?>)getBind()).basicRemove(otherEnd, msgs);
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
      case ColladaPackage.SHADER_TYPE__ANNOTATE:
        return getAnnotate();
      case ColladaPackage.SHADER_TYPE__COMPILER_TARGET:
        return getCompilerTarget();
      case ColladaPackage.SHADER_TYPE__COMPILER_OPTIONS:
        return getCompilerOptions();
      case ColladaPackage.SHADER_TYPE__NAME:
        return getName();
      case ColladaPackage.SHADER_TYPE__BIND:
        return getBind();
      case ColladaPackage.SHADER_TYPE__STAGE:
        return getStage();
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
      case ColladaPackage.SHADER_TYPE__ANNOTATE:
        getAnnotate().clear();
        getAnnotate().addAll((Collection<? extends FxAnnotateCommon>)newValue);
        return;
      case ColladaPackage.SHADER_TYPE__COMPILER_TARGET:
        setCompilerTarget((CompilerTargetType)newValue);
        return;
      case ColladaPackage.SHADER_TYPE__COMPILER_OPTIONS:
        setCompilerOptions((String)newValue);
        return;
      case ColladaPackage.SHADER_TYPE__NAME:
        setName((NameType1)newValue);
        return;
      case ColladaPackage.SHADER_TYPE__BIND:
        getBind().clear();
        getBind().addAll((Collection<? extends BindType>)newValue);
        return;
      case ColladaPackage.SHADER_TYPE__STAGE:
        setStage((GlslPipelineStage)newValue);
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
      case ColladaPackage.SHADER_TYPE__ANNOTATE:
        getAnnotate().clear();
        return;
      case ColladaPackage.SHADER_TYPE__COMPILER_TARGET:
        setCompilerTarget((CompilerTargetType)null);
        return;
      case ColladaPackage.SHADER_TYPE__COMPILER_OPTIONS:
        setCompilerOptions(COMPILER_OPTIONS_EDEFAULT);
        return;
      case ColladaPackage.SHADER_TYPE__NAME:
        setName((NameType1)null);
        return;
      case ColladaPackage.SHADER_TYPE__BIND:
        getBind().clear();
        return;
      case ColladaPackage.SHADER_TYPE__STAGE:
        unsetStage();
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
      case ColladaPackage.SHADER_TYPE__ANNOTATE:
        return annotate != null && !annotate.isEmpty();
      case ColladaPackage.SHADER_TYPE__COMPILER_TARGET:
        return compilerTarget != null;
      case ColladaPackage.SHADER_TYPE__COMPILER_OPTIONS:
        return COMPILER_OPTIONS_EDEFAULT == null ? compilerOptions != null : !COMPILER_OPTIONS_EDEFAULT.equals(compilerOptions);
      case ColladaPackage.SHADER_TYPE__NAME:
        return name != null;
      case ColladaPackage.SHADER_TYPE__BIND:
        return bind != null && !bind.isEmpty();
      case ColladaPackage.SHADER_TYPE__STAGE:
        return isSetStage();
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
    result.append(" (compilerOptions: ");
    result.append(compilerOptions);
    result.append(", stage: ");
    if (stageESet) result.append(stage); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //ShaderTypeImpl
