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

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.GlesTextureUnit;
import org.khronos.collada.TexcoordType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gles Texture Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.GlesTextureUnitImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTextureUnitImpl#getSamplerState <em>Sampler State</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTextureUnitImpl#getTexcoord <em>Texcoord</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTextureUnitImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesTextureUnitImpl#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlesTextureUnitImpl extends EObjectImpl implements GlesTextureUnit {
	/**
   * The default value of the '{@link #getSurface() <em>Surface</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSurface()
   * @generated
   * @ordered
   */
	protected static final String SURFACE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSurface() <em>Surface</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSurface()
   * @generated
   * @ordered
   */
	protected String surface = SURFACE_EDEFAULT;

	/**
   * The default value of the '{@link #getSamplerState() <em>Sampler State</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSamplerState()
   * @generated
   * @ordered
   */
	protected static final String SAMPLER_STATE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSamplerState() <em>Sampler State</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSamplerState()
   * @generated
   * @ordered
   */
	protected String samplerState = SAMPLER_STATE_EDEFAULT;

	/**
   * The cached value of the '{@link #getTexcoord() <em>Texcoord</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTexcoord()
   * @generated
   * @ordered
   */
	protected TexcoordType texcoord;

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
	protected GlesTextureUnitImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getGlesTextureUnit();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSurface() {
    return surface;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSurface(String newSurface) {
    String oldSurface = surface;
    surface = newSurface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXTURE_UNIT__SURFACE, oldSurface, surface));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSamplerState() {
    return samplerState;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSamplerState(String newSamplerState) {
    String oldSamplerState = samplerState;
    samplerState = newSamplerState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXTURE_UNIT__SAMPLER_STATE, oldSamplerState, samplerState));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TexcoordType getTexcoord() {
    return texcoord;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTexcoord(TexcoordType newTexcoord, NotificationChain msgs) {
    TexcoordType oldTexcoord = texcoord;
    texcoord = newTexcoord;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXTURE_UNIT__TEXCOORD, oldTexcoord, newTexcoord);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTexcoord(TexcoordType newTexcoord) {
    if (newTexcoord != texcoord)
    {
      NotificationChain msgs = null;
      if (texcoord != null)
        msgs = ((InternalEObject)texcoord).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLES_TEXTURE_UNIT__TEXCOORD, null, msgs);
      if (newTexcoord != null)
        msgs = ((InternalEObject)newTexcoord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.GLES_TEXTURE_UNIT__TEXCOORD, null, msgs);
      msgs = basicSetTexcoord(newTexcoord, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXTURE_UNIT__TEXCOORD, newTexcoord, newTexcoord));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.GLES_TEXTURE_UNIT__EXTRA);
    }
    return extra;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_TEXTURE_UNIT__SID, oldSid, sid));
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
      case ColladaPackage.GLES_TEXTURE_UNIT__TEXCOORD:
        return basicSetTexcoord(null, msgs);
      case ColladaPackage.GLES_TEXTURE_UNIT__EXTRA:
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
      case ColladaPackage.GLES_TEXTURE_UNIT__SURFACE:
        return getSurface();
      case ColladaPackage.GLES_TEXTURE_UNIT__SAMPLER_STATE:
        return getSamplerState();
      case ColladaPackage.GLES_TEXTURE_UNIT__TEXCOORD:
        return getTexcoord();
      case ColladaPackage.GLES_TEXTURE_UNIT__EXTRA:
        return getExtra();
      case ColladaPackage.GLES_TEXTURE_UNIT__SID:
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
      case ColladaPackage.GLES_TEXTURE_UNIT__SURFACE:
        setSurface((String)newValue);
        return;
      case ColladaPackage.GLES_TEXTURE_UNIT__SAMPLER_STATE:
        setSamplerState((String)newValue);
        return;
      case ColladaPackage.GLES_TEXTURE_UNIT__TEXCOORD:
        setTexcoord((TexcoordType)newValue);
        return;
      case ColladaPackage.GLES_TEXTURE_UNIT__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.GLES_TEXTURE_UNIT__SID:
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
      case ColladaPackage.GLES_TEXTURE_UNIT__SURFACE:
        setSurface(SURFACE_EDEFAULT);
        return;
      case ColladaPackage.GLES_TEXTURE_UNIT__SAMPLER_STATE:
        setSamplerState(SAMPLER_STATE_EDEFAULT);
        return;
      case ColladaPackage.GLES_TEXTURE_UNIT__TEXCOORD:
        setTexcoord((TexcoordType)null);
        return;
      case ColladaPackage.GLES_TEXTURE_UNIT__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.GLES_TEXTURE_UNIT__SID:
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
      case ColladaPackage.GLES_TEXTURE_UNIT__SURFACE:
        return SURFACE_EDEFAULT == null ? surface != null : !SURFACE_EDEFAULT.equals(surface);
      case ColladaPackage.GLES_TEXTURE_UNIT__SAMPLER_STATE:
        return SAMPLER_STATE_EDEFAULT == null ? samplerState != null : !SAMPLER_STATE_EDEFAULT.equals(samplerState);
      case ColladaPackage.GLES_TEXTURE_UNIT__TEXCOORD:
        return texcoord != null;
      case ColladaPackage.GLES_TEXTURE_UNIT__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.GLES_TEXTURE_UNIT__SID:
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
    result.append(" (surface: ");
    result.append(surface);
    result.append(", samplerState: ");
    result.append(samplerState);
    result.append(", sid: ");
    result.append(sid);
    result.append(')');
    return result.toString();
  }

} //GlesTextureUnitImpl
