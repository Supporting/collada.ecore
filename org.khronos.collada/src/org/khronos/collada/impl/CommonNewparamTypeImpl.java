/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.CommonNewparamType;
import org.khronos.collada.FxSampler2DCommon;
import org.khronos.collada.FxSurfaceCommon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Newparam Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.CommonNewparamTypeImpl#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CommonNewparamTypeImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CommonNewparamTypeImpl#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CommonNewparamTypeImpl#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CommonNewparamTypeImpl#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CommonNewparamTypeImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CommonNewparamTypeImpl#getSampler2D <em>Sampler2 D</em>}</li>
 *   <li>{@link org.khronos.collada.impl.CommonNewparamTypeImpl#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommonNewparamTypeImpl extends EObjectImpl implements CommonNewparamType {
	/**
   * The default value of the '{@link #getSemantic() <em>Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSemantic()
   * @generated
   * @ordered
   */
	protected static final String SEMANTIC_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSemantic() <em>Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSemantic()
   * @generated
   * @ordered
   */
	protected String semantic = SEMANTIC_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat() <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat()
   * @generated
   * @ordered
   */
	protected static final double FLOAT_EDEFAULT = 0.0;

	/**
   * The cached value of the '{@link #getFloat() <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat()
   * @generated
   * @ordered
   */
	protected double float_ = FLOAT_EDEFAULT;

	/**
   * This is true if the Float attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean floatESet;

	/**
   * The default value of the '{@link #getFloat2() <em>Float2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT2_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat2() <em>Float2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat2()
   * @generated
   * @ordered
   */
	protected List<Double> float2 = FLOAT2_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat3() <em>Float3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT3_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat3() <em>Float3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat3()
   * @generated
   * @ordered
   */
	protected List<Double> float3 = FLOAT3_EDEFAULT;

	/**
   * The default value of the '{@link #getFloat4() <em>Float4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4()
   * @generated
   * @ordered
   */
	protected static final List<Double> FLOAT4_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFloat4() <em>Float4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFloat4()
   * @generated
   * @ordered
   */
	protected List<Double> float4 = FLOAT4_EDEFAULT;

	/**
   * The cached value of the '{@link #getSurface() <em>Surface</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSurface()
   * @generated
   * @ordered
   */
	protected FxSurfaceCommon surface;

	/**
   * The cached value of the '{@link #getSampler2D() <em>Sampler2 D</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSampler2D()
   * @generated
   * @ordered
   */
	protected FxSampler2DCommon sampler2D;

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
	protected CommonNewparamTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getCommonNewparamType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSemantic() {
    return semantic;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSemantic(String newSemantic) {
    String oldSemantic = semantic;
    semantic = newSemantic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_NEWPARAM_TYPE__SEMANTIC, oldSemantic, semantic));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public double getFloat() {
    return float_;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat(double newFloat) {
    double oldFloat = float_;
    float_ = newFloat;
    boolean oldFloatESet = floatESet;
    floatESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT, oldFloat, float_, !oldFloatESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetFloat() {
    double oldFloat = float_;
    boolean oldFloatESet = floatESet;
    float_ = FLOAT_EDEFAULT;
    floatESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT, oldFloat, FLOAT_EDEFAULT, oldFloatESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetFloat() {
    return floatESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat2() {
    return float2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat2(List<Double> newFloat2) {
    List<Double> oldFloat2 = float2;
    float2 = newFloat2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT2, oldFloat2, float2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat3() {
    return float3;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat3(List<Double> newFloat3) {
    List<Double> oldFloat3 = float3;
    float3 = newFloat3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT3, oldFloat3, float3));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getFloat4() {
    return float4;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFloat4(List<Double> newFloat4) {
    List<Double> oldFloat4 = float4;
    float4 = newFloat4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT4, oldFloat4, float4));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceCommon getSurface() {
    return surface;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSurface(FxSurfaceCommon newSurface, NotificationChain msgs) {
    FxSurfaceCommon oldSurface = surface;
    surface = newSurface;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_NEWPARAM_TYPE__SURFACE, oldSurface, newSurface);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSurface(FxSurfaceCommon newSurface) {
    if (newSurface != surface)
    {
      NotificationChain msgs = null;
      if (surface != null)
        msgs = ((InternalEObject)surface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COMMON_NEWPARAM_TYPE__SURFACE, null, msgs);
      if (newSurface != null)
        msgs = ((InternalEObject)newSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COMMON_NEWPARAM_TYPE__SURFACE, null, msgs);
      msgs = basicSetSurface(newSurface, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_NEWPARAM_TYPE__SURFACE, newSurface, newSurface));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSampler2DCommon getSampler2D() {
    return sampler2D;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSampler2D(FxSampler2DCommon newSampler2D, NotificationChain msgs) {
    FxSampler2DCommon oldSampler2D = sampler2D;
    sampler2D = newSampler2D;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_NEWPARAM_TYPE__SAMPLER2_D, oldSampler2D, newSampler2D);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSampler2D(FxSampler2DCommon newSampler2D) {
    if (newSampler2D != sampler2D)
    {
      NotificationChain msgs = null;
      if (sampler2D != null)
        msgs = ((InternalEObject)sampler2D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COMMON_NEWPARAM_TYPE__SAMPLER2_D, null, msgs);
      if (newSampler2D != null)
        msgs = ((InternalEObject)newSampler2D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COMMON_NEWPARAM_TYPE__SAMPLER2_D, null, msgs);
      msgs = basicSetSampler2D(newSampler2D, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_NEWPARAM_TYPE__SAMPLER2_D, newSampler2D, newSampler2D));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COMMON_NEWPARAM_TYPE__SID, oldSid, sid));
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
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SURFACE:
        return basicSetSurface(null, msgs);
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SAMPLER2_D:
        return basicSetSampler2D(null, msgs);
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
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SEMANTIC:
        return getSemantic();
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT:
        return getFloat();
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT2:
        return getFloat2();
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT3:
        return getFloat3();
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT4:
        return getFloat4();
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SURFACE:
        return getSurface();
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SAMPLER2_D:
        return getSampler2D();
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SID:
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
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SEMANTIC:
        setSemantic((String)newValue);
        return;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT:
        setFloat((Double)newValue);
        return;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT2:
        setFloat2((List<Double>)newValue);
        return;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT3:
        setFloat3((List<Double>)newValue);
        return;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT4:
        setFloat4((List<Double>)newValue);
        return;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SURFACE:
        setSurface((FxSurfaceCommon)newValue);
        return;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SAMPLER2_D:
        setSampler2D((FxSampler2DCommon)newValue);
        return;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SID:
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
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SEMANTIC:
        setSemantic(SEMANTIC_EDEFAULT);
        return;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT:
        unsetFloat();
        return;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT2:
        setFloat2(FLOAT2_EDEFAULT);
        return;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT3:
        setFloat3(FLOAT3_EDEFAULT);
        return;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT4:
        setFloat4(FLOAT4_EDEFAULT);
        return;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SURFACE:
        setSurface((FxSurfaceCommon)null);
        return;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SAMPLER2_D:
        setSampler2D((FxSampler2DCommon)null);
        return;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SID:
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
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SEMANTIC:
        return SEMANTIC_EDEFAULT == null ? semantic != null : !SEMANTIC_EDEFAULT.equals(semantic);
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT:
        return isSetFloat();
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT2:
        return FLOAT2_EDEFAULT == null ? float2 != null : !FLOAT2_EDEFAULT.equals(float2);
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT3:
        return FLOAT3_EDEFAULT == null ? float3 != null : !FLOAT3_EDEFAULT.equals(float3);
      case ColladaPackage.COMMON_NEWPARAM_TYPE__FLOAT4:
        return FLOAT4_EDEFAULT == null ? float4 != null : !FLOAT4_EDEFAULT.equals(float4);
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SURFACE:
        return surface != null;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SAMPLER2_D:
        return sampler2D != null;
      case ColladaPackage.COMMON_NEWPARAM_TYPE__SID:
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
    result.append(" (semantic: ");
    result.append(semantic);
    result.append(", float: ");
    if (floatESet) result.append(float_); else result.append("<unset>");
    result.append(", float2: ");
    result.append(float2);
    result.append(", float3: ");
    result.append(float3);
    result.append(", float4: ");
    result.append(float4);
    result.append(", sid: ");
    result.append(sid);
    result.append(')');
    return result.toString();
  }

} //CommonNewparamTypeImpl
