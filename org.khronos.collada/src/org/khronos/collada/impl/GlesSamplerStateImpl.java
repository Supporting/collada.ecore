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
import org.khronos.collada.FxSamplerFilterCommon;
import org.khronos.collada.GlesSamplerState;
import org.khronos.collada.GlesSamplerWrap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gles Sampler State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.GlesSamplerStateImpl#getWrapS <em>Wrap S</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesSamplerStateImpl#getWrapT <em>Wrap T</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesSamplerStateImpl#getMinfilter <em>Minfilter</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesSamplerStateImpl#getMagfilter <em>Magfilter</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesSamplerStateImpl#getMipfilter <em>Mipfilter</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesSamplerStateImpl#getMipmapMaxlevel <em>Mipmap Maxlevel</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesSamplerStateImpl#getMipmapBias <em>Mipmap Bias</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesSamplerStateImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.GlesSamplerStateImpl#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlesSamplerStateImpl extends EObjectImpl implements GlesSamplerState {
	/**
   * The default value of the '{@link #getWrapS() <em>Wrap S</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWrapS()
   * @generated
   * @ordered
   */
	protected static final GlesSamplerWrap WRAP_S_EDEFAULT = GlesSamplerWrap.REPEAT;

	/**
   * The cached value of the '{@link #getWrapS() <em>Wrap S</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWrapS()
   * @generated
   * @ordered
   */
	protected GlesSamplerWrap wrapS = WRAP_S_EDEFAULT;

	/**
   * This is true if the Wrap S attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean wrapSESet;

	/**
   * The default value of the '{@link #getWrapT() <em>Wrap T</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWrapT()
   * @generated
   * @ordered
   */
	protected static final GlesSamplerWrap WRAP_T_EDEFAULT = GlesSamplerWrap.REPEAT;

	/**
   * The cached value of the '{@link #getWrapT() <em>Wrap T</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWrapT()
   * @generated
   * @ordered
   */
	protected GlesSamplerWrap wrapT = WRAP_T_EDEFAULT;

	/**
   * This is true if the Wrap T attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean wrapTESet;

	/**
   * The default value of the '{@link #getMinfilter() <em>Minfilter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMinfilter()
   * @generated
   * @ordered
   */
	protected static final FxSamplerFilterCommon MINFILTER_EDEFAULT = FxSamplerFilterCommon.NONE;

	/**
   * The cached value of the '{@link #getMinfilter() <em>Minfilter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMinfilter()
   * @generated
   * @ordered
   */
	protected FxSamplerFilterCommon minfilter = MINFILTER_EDEFAULT;

	/**
   * This is true if the Minfilter attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean minfilterESet;

	/**
   * The default value of the '{@link #getMagfilter() <em>Magfilter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMagfilter()
   * @generated
   * @ordered
   */
	protected static final FxSamplerFilterCommon MAGFILTER_EDEFAULT = FxSamplerFilterCommon.NONE;

	/**
   * The cached value of the '{@link #getMagfilter() <em>Magfilter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMagfilter()
   * @generated
   * @ordered
   */
	protected FxSamplerFilterCommon magfilter = MAGFILTER_EDEFAULT;

	/**
   * This is true if the Magfilter attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean magfilterESet;

	/**
   * The default value of the '{@link #getMipfilter() <em>Mipfilter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMipfilter()
   * @generated
   * @ordered
   */
	protected static final FxSamplerFilterCommon MIPFILTER_EDEFAULT = FxSamplerFilterCommon.NONE;

	/**
   * The cached value of the '{@link #getMipfilter() <em>Mipfilter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMipfilter()
   * @generated
   * @ordered
   */
	protected FxSamplerFilterCommon mipfilter = MIPFILTER_EDEFAULT;

	/**
   * This is true if the Mipfilter attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean mipfilterESet;

	/**
   * The default value of the '{@link #getMipmapMaxlevel() <em>Mipmap Maxlevel</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMipmapMaxlevel()
   * @generated
   * @ordered
   */
	protected static final short MIPMAP_MAXLEVEL_EDEFAULT = 255;

	/**
   * The cached value of the '{@link #getMipmapMaxlevel() <em>Mipmap Maxlevel</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMipmapMaxlevel()
   * @generated
   * @ordered
   */
	protected short mipmapMaxlevel = MIPMAP_MAXLEVEL_EDEFAULT;

	/**
   * This is true if the Mipmap Maxlevel attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean mipmapMaxlevelESet;

	/**
   * The default value of the '{@link #getMipmapBias() <em>Mipmap Bias</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMipmapBias()
   * @generated
   * @ordered
   */
	protected static final float MIPMAP_BIAS_EDEFAULT = 0.0F;

	/**
   * The cached value of the '{@link #getMipmapBias() <em>Mipmap Bias</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMipmapBias()
   * @generated
   * @ordered
   */
	protected float mipmapBias = MIPMAP_BIAS_EDEFAULT;

	/**
   * This is true if the Mipmap Bias attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean mipmapBiasESet;

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
	protected GlesSamplerStateImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getGlesSamplerState();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesSamplerWrap getWrapS() {
    return wrapS;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setWrapS(GlesSamplerWrap newWrapS) {
    GlesSamplerWrap oldWrapS = wrapS;
    wrapS = newWrapS == null ? WRAP_S_EDEFAULT : newWrapS;
    boolean oldWrapSESet = wrapSESet;
    wrapSESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_SAMPLER_STATE__WRAP_S, oldWrapS, wrapS, !oldWrapSESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetWrapS() {
    GlesSamplerWrap oldWrapS = wrapS;
    boolean oldWrapSESet = wrapSESet;
    wrapS = WRAP_S_EDEFAULT;
    wrapSESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.GLES_SAMPLER_STATE__WRAP_S, oldWrapS, WRAP_S_EDEFAULT, oldWrapSESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetWrapS() {
    return wrapSESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GlesSamplerWrap getWrapT() {
    return wrapT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setWrapT(GlesSamplerWrap newWrapT) {
    GlesSamplerWrap oldWrapT = wrapT;
    wrapT = newWrapT == null ? WRAP_T_EDEFAULT : newWrapT;
    boolean oldWrapTESet = wrapTESet;
    wrapTESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_SAMPLER_STATE__WRAP_T, oldWrapT, wrapT, !oldWrapTESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetWrapT() {
    GlesSamplerWrap oldWrapT = wrapT;
    boolean oldWrapTESet = wrapTESet;
    wrapT = WRAP_T_EDEFAULT;
    wrapTESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.GLES_SAMPLER_STATE__WRAP_T, oldWrapT, WRAP_T_EDEFAULT, oldWrapTESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetWrapT() {
    return wrapTESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSamplerFilterCommon getMinfilter() {
    return minfilter;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMinfilter(FxSamplerFilterCommon newMinfilter) {
    FxSamplerFilterCommon oldMinfilter = minfilter;
    minfilter = newMinfilter == null ? MINFILTER_EDEFAULT : newMinfilter;
    boolean oldMinfilterESet = minfilterESet;
    minfilterESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_SAMPLER_STATE__MINFILTER, oldMinfilter, minfilter, !oldMinfilterESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMinfilter() {
    FxSamplerFilterCommon oldMinfilter = minfilter;
    boolean oldMinfilterESet = minfilterESet;
    minfilter = MINFILTER_EDEFAULT;
    minfilterESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.GLES_SAMPLER_STATE__MINFILTER, oldMinfilter, MINFILTER_EDEFAULT, oldMinfilterESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMinfilter() {
    return minfilterESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSamplerFilterCommon getMagfilter() {
    return magfilter;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMagfilter(FxSamplerFilterCommon newMagfilter) {
    FxSamplerFilterCommon oldMagfilter = magfilter;
    magfilter = newMagfilter == null ? MAGFILTER_EDEFAULT : newMagfilter;
    boolean oldMagfilterESet = magfilterESet;
    magfilterESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_SAMPLER_STATE__MAGFILTER, oldMagfilter, magfilter, !oldMagfilterESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMagfilter() {
    FxSamplerFilterCommon oldMagfilter = magfilter;
    boolean oldMagfilterESet = magfilterESet;
    magfilter = MAGFILTER_EDEFAULT;
    magfilterESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.GLES_SAMPLER_STATE__MAGFILTER, oldMagfilter, MAGFILTER_EDEFAULT, oldMagfilterESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMagfilter() {
    return magfilterESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSamplerFilterCommon getMipfilter() {
    return mipfilter;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMipfilter(FxSamplerFilterCommon newMipfilter) {
    FxSamplerFilterCommon oldMipfilter = mipfilter;
    mipfilter = newMipfilter == null ? MIPFILTER_EDEFAULT : newMipfilter;
    boolean oldMipfilterESet = mipfilterESet;
    mipfilterESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_SAMPLER_STATE__MIPFILTER, oldMipfilter, mipfilter, !oldMipfilterESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMipfilter() {
    FxSamplerFilterCommon oldMipfilter = mipfilter;
    boolean oldMipfilterESet = mipfilterESet;
    mipfilter = MIPFILTER_EDEFAULT;
    mipfilterESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.GLES_SAMPLER_STATE__MIPFILTER, oldMipfilter, MIPFILTER_EDEFAULT, oldMipfilterESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMipfilter() {
    return mipfilterESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public short getMipmapMaxlevel() {
    return mipmapMaxlevel;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMipmapMaxlevel(short newMipmapMaxlevel) {
    short oldMipmapMaxlevel = mipmapMaxlevel;
    mipmapMaxlevel = newMipmapMaxlevel;
    boolean oldMipmapMaxlevelESet = mipmapMaxlevelESet;
    mipmapMaxlevelESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_SAMPLER_STATE__MIPMAP_MAXLEVEL, oldMipmapMaxlevel, mipmapMaxlevel, !oldMipmapMaxlevelESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMipmapMaxlevel() {
    short oldMipmapMaxlevel = mipmapMaxlevel;
    boolean oldMipmapMaxlevelESet = mipmapMaxlevelESet;
    mipmapMaxlevel = MIPMAP_MAXLEVEL_EDEFAULT;
    mipmapMaxlevelESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.GLES_SAMPLER_STATE__MIPMAP_MAXLEVEL, oldMipmapMaxlevel, MIPMAP_MAXLEVEL_EDEFAULT, oldMipmapMaxlevelESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMipmapMaxlevel() {
    return mipmapMaxlevelESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public float getMipmapBias() {
    return mipmapBias;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMipmapBias(float newMipmapBias) {
    float oldMipmapBias = mipmapBias;
    mipmapBias = newMipmapBias;
    boolean oldMipmapBiasESet = mipmapBiasESet;
    mipmapBiasESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_SAMPLER_STATE__MIPMAP_BIAS, oldMipmapBias, mipmapBias, !oldMipmapBiasESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMipmapBias() {
    float oldMipmapBias = mipmapBias;
    boolean oldMipmapBiasESet = mipmapBiasESet;
    mipmapBias = MIPMAP_BIAS_EDEFAULT;
    mipmapBiasESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.GLES_SAMPLER_STATE__MIPMAP_BIAS, oldMipmapBias, MIPMAP_BIAS_EDEFAULT, oldMipmapBiasESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMipmapBias() {
    return mipmapBiasESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.GLES_SAMPLER_STATE__EXTRA);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.GLES_SAMPLER_STATE__SID, oldSid, sid));
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
      case ColladaPackage.GLES_SAMPLER_STATE__EXTRA:
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
      case ColladaPackage.GLES_SAMPLER_STATE__WRAP_S:
        return getWrapS();
      case ColladaPackage.GLES_SAMPLER_STATE__WRAP_T:
        return getWrapT();
      case ColladaPackage.GLES_SAMPLER_STATE__MINFILTER:
        return getMinfilter();
      case ColladaPackage.GLES_SAMPLER_STATE__MAGFILTER:
        return getMagfilter();
      case ColladaPackage.GLES_SAMPLER_STATE__MIPFILTER:
        return getMipfilter();
      case ColladaPackage.GLES_SAMPLER_STATE__MIPMAP_MAXLEVEL:
        return getMipmapMaxlevel();
      case ColladaPackage.GLES_SAMPLER_STATE__MIPMAP_BIAS:
        return getMipmapBias();
      case ColladaPackage.GLES_SAMPLER_STATE__EXTRA:
        return getExtra();
      case ColladaPackage.GLES_SAMPLER_STATE__SID:
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
      case ColladaPackage.GLES_SAMPLER_STATE__WRAP_S:
        setWrapS((GlesSamplerWrap)newValue);
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__WRAP_T:
        setWrapT((GlesSamplerWrap)newValue);
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__MINFILTER:
        setMinfilter((FxSamplerFilterCommon)newValue);
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__MAGFILTER:
        setMagfilter((FxSamplerFilterCommon)newValue);
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__MIPFILTER:
        setMipfilter((FxSamplerFilterCommon)newValue);
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__MIPMAP_MAXLEVEL:
        setMipmapMaxlevel((Short)newValue);
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__MIPMAP_BIAS:
        setMipmapBias((Float)newValue);
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__SID:
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
      case ColladaPackage.GLES_SAMPLER_STATE__WRAP_S:
        unsetWrapS();
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__WRAP_T:
        unsetWrapT();
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__MINFILTER:
        unsetMinfilter();
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__MAGFILTER:
        unsetMagfilter();
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__MIPFILTER:
        unsetMipfilter();
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__MIPMAP_MAXLEVEL:
        unsetMipmapMaxlevel();
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__MIPMAP_BIAS:
        unsetMipmapBias();
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.GLES_SAMPLER_STATE__SID:
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
      case ColladaPackage.GLES_SAMPLER_STATE__WRAP_S:
        return isSetWrapS();
      case ColladaPackage.GLES_SAMPLER_STATE__WRAP_T:
        return isSetWrapT();
      case ColladaPackage.GLES_SAMPLER_STATE__MINFILTER:
        return isSetMinfilter();
      case ColladaPackage.GLES_SAMPLER_STATE__MAGFILTER:
        return isSetMagfilter();
      case ColladaPackage.GLES_SAMPLER_STATE__MIPFILTER:
        return isSetMipfilter();
      case ColladaPackage.GLES_SAMPLER_STATE__MIPMAP_MAXLEVEL:
        return isSetMipmapMaxlevel();
      case ColladaPackage.GLES_SAMPLER_STATE__MIPMAP_BIAS:
        return isSetMipmapBias();
      case ColladaPackage.GLES_SAMPLER_STATE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.GLES_SAMPLER_STATE__SID:
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
    result.append(" (wrapS: ");
    if (wrapSESet) result.append(wrapS); else result.append("<unset>");
    result.append(", wrapT: ");
    if (wrapTESet) result.append(wrapT); else result.append("<unset>");
    result.append(", minfilter: ");
    if (minfilterESet) result.append(minfilter); else result.append("<unset>");
    result.append(", magfilter: ");
    if (magfilterESet) result.append(magfilter); else result.append("<unset>");
    result.append(", mipfilter: ");
    if (mipfilterESet) result.append(mipfilter); else result.append("<unset>");
    result.append(", mipmapMaxlevel: ");
    if (mipmapMaxlevelESet) result.append(mipmapMaxlevel); else result.append("<unset>");
    result.append(", mipmapBias: ");
    if (mipmapBiasESet) result.append(mipmapBias); else result.append("<unset>");
    result.append(", sid: ");
    result.append(sid);
    result.append(')');
    return result.toString();
  }

} //GlesSamplerStateImpl
