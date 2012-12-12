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
import org.khronos.collada.FxSampler2DCommon;
import org.khronos.collada.FxSamplerFilterCommon;
import org.khronos.collada.FxSamplerWrapCommon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fx Sampler2 DCommon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.FxSampler2DCommonImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSampler2DCommonImpl#getWrapS <em>Wrap S</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSampler2DCommonImpl#getWrapT <em>Wrap T</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSampler2DCommonImpl#getMinfilter <em>Minfilter</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSampler2DCommonImpl#getMagfilter <em>Magfilter</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSampler2DCommonImpl#getMipfilter <em>Mipfilter</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSampler2DCommonImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSampler2DCommonImpl#getMipmapMaxlevel <em>Mipmap Maxlevel</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSampler2DCommonImpl#getMipmapBias <em>Mipmap Bias</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSampler2DCommonImpl#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FxSampler2DCommonImpl extends EObjectImpl implements FxSampler2DCommon {
	/**
   * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
	protected static final String SOURCE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
	protected String source = SOURCE_EDEFAULT;

	/**
   * The default value of the '{@link #getWrapS() <em>Wrap S</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWrapS()
   * @generated
   * @ordered
   */
	protected static final FxSamplerWrapCommon WRAP_S_EDEFAULT = FxSamplerWrapCommon.WRAP;

	/**
   * The cached value of the '{@link #getWrapS() <em>Wrap S</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWrapS()
   * @generated
   * @ordered
   */
	protected FxSamplerWrapCommon wrapS = WRAP_S_EDEFAULT;

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
	protected static final FxSamplerWrapCommon WRAP_T_EDEFAULT = FxSamplerWrapCommon.WRAP;

	/**
   * The cached value of the '{@link #getWrapT() <em>Wrap T</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWrapT()
   * @generated
   * @ordered
   */
	protected FxSamplerWrapCommon wrapT = WRAP_T_EDEFAULT;

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
   * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBorderColor()
   * @generated
   * @ordered
   */
	protected static final List<Double> BORDER_COLOR_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBorderColor()
   * @generated
   * @ordered
   */
	protected List<Double> borderColor = BORDER_COLOR_EDEFAULT;

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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected FxSampler2DCommonImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getFxSampler2DCommon();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSource() {
    return source;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSource(String newSource) {
    String oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SAMPLER2_DCOMMON__SOURCE, oldSource, source));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSamplerWrapCommon getWrapS() {
    return wrapS;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setWrapS(FxSamplerWrapCommon newWrapS) {
    FxSamplerWrapCommon oldWrapS = wrapS;
    wrapS = newWrapS == null ? WRAP_S_EDEFAULT : newWrapS;
    boolean oldWrapSESet = wrapSESet;
    wrapSESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SAMPLER2_DCOMMON__WRAP_S, oldWrapS, wrapS, !oldWrapSESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetWrapS() {
    FxSamplerWrapCommon oldWrapS = wrapS;
    boolean oldWrapSESet = wrapSESet;
    wrapS = WRAP_S_EDEFAULT;
    wrapSESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SAMPLER2_DCOMMON__WRAP_S, oldWrapS, WRAP_S_EDEFAULT, oldWrapSESet));
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
	public FxSamplerWrapCommon getWrapT() {
    return wrapT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setWrapT(FxSamplerWrapCommon newWrapT) {
    FxSamplerWrapCommon oldWrapT = wrapT;
    wrapT = newWrapT == null ? WRAP_T_EDEFAULT : newWrapT;
    boolean oldWrapTESet = wrapTESet;
    wrapTESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SAMPLER2_DCOMMON__WRAP_T, oldWrapT, wrapT, !oldWrapTESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetWrapT() {
    FxSamplerWrapCommon oldWrapT = wrapT;
    boolean oldWrapTESet = wrapTESet;
    wrapT = WRAP_T_EDEFAULT;
    wrapTESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SAMPLER2_DCOMMON__WRAP_T, oldWrapT, WRAP_T_EDEFAULT, oldWrapTESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SAMPLER2_DCOMMON__MINFILTER, oldMinfilter, minfilter, !oldMinfilterESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SAMPLER2_DCOMMON__MINFILTER, oldMinfilter, MINFILTER_EDEFAULT, oldMinfilterESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SAMPLER2_DCOMMON__MAGFILTER, oldMagfilter, magfilter, !oldMagfilterESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SAMPLER2_DCOMMON__MAGFILTER, oldMagfilter, MAGFILTER_EDEFAULT, oldMagfilterESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SAMPLER2_DCOMMON__MIPFILTER, oldMipfilter, mipfilter, !oldMipfilterESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SAMPLER2_DCOMMON__MIPFILTER, oldMipfilter, MIPFILTER_EDEFAULT, oldMipfilterESet));
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
	public List<Double> getBorderColor() {
    return borderColor;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBorderColor(List<Double> newBorderColor) {
    List<Double> oldBorderColor = borderColor;
    borderColor = newBorderColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SAMPLER2_DCOMMON__BORDER_COLOR, oldBorderColor, borderColor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SAMPLER2_DCOMMON__MIPMAP_MAXLEVEL, oldMipmapMaxlevel, mipmapMaxlevel, !oldMipmapMaxlevelESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SAMPLER2_DCOMMON__MIPMAP_MAXLEVEL, oldMipmapMaxlevel, MIPMAP_MAXLEVEL_EDEFAULT, oldMipmapMaxlevelESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SAMPLER2_DCOMMON__MIPMAP_BIAS, oldMipmapBias, mipmapBias, !oldMipmapBiasESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SAMPLER2_DCOMMON__MIPMAP_BIAS, oldMipmapBias, MIPMAP_BIAS_EDEFAULT, oldMipmapBiasESet));
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
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.FX_SAMPLER2_DCOMMON__EXTRA);
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
      case ColladaPackage.FX_SAMPLER2_DCOMMON__EXTRA:
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
      case ColladaPackage.FX_SAMPLER2_DCOMMON__SOURCE:
        return getSource();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__WRAP_S:
        return getWrapS();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__WRAP_T:
        return getWrapT();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MINFILTER:
        return getMinfilter();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MAGFILTER:
        return getMagfilter();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MIPFILTER:
        return getMipfilter();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__BORDER_COLOR:
        return getBorderColor();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MIPMAP_MAXLEVEL:
        return getMipmapMaxlevel();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MIPMAP_BIAS:
        return getMipmapBias();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__EXTRA:
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
      case ColladaPackage.FX_SAMPLER2_DCOMMON__SOURCE:
        setSource((String)newValue);
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__WRAP_S:
        setWrapS((FxSamplerWrapCommon)newValue);
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__WRAP_T:
        setWrapT((FxSamplerWrapCommon)newValue);
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MINFILTER:
        setMinfilter((FxSamplerFilterCommon)newValue);
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MAGFILTER:
        setMagfilter((FxSamplerFilterCommon)newValue);
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MIPFILTER:
        setMipfilter((FxSamplerFilterCommon)newValue);
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__BORDER_COLOR:
        setBorderColor((List<Double>)newValue);
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MIPMAP_MAXLEVEL:
        setMipmapMaxlevel((Short)newValue);
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MIPMAP_BIAS:
        setMipmapBias((Float)newValue);
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__EXTRA:
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
      case ColladaPackage.FX_SAMPLER2_DCOMMON__SOURCE:
        setSource(SOURCE_EDEFAULT);
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__WRAP_S:
        unsetWrapS();
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__WRAP_T:
        unsetWrapT();
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MINFILTER:
        unsetMinfilter();
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MAGFILTER:
        unsetMagfilter();
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MIPFILTER:
        unsetMipfilter();
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__BORDER_COLOR:
        setBorderColor(BORDER_COLOR_EDEFAULT);
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MIPMAP_MAXLEVEL:
        unsetMipmapMaxlevel();
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MIPMAP_BIAS:
        unsetMipmapBias();
        return;
      case ColladaPackage.FX_SAMPLER2_DCOMMON__EXTRA:
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
      case ColladaPackage.FX_SAMPLER2_DCOMMON__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
      case ColladaPackage.FX_SAMPLER2_DCOMMON__WRAP_S:
        return isSetWrapS();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__WRAP_T:
        return isSetWrapT();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MINFILTER:
        return isSetMinfilter();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MAGFILTER:
        return isSetMagfilter();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MIPFILTER:
        return isSetMipfilter();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__BORDER_COLOR:
        return BORDER_COLOR_EDEFAULT == null ? borderColor != null : !BORDER_COLOR_EDEFAULT.equals(borderColor);
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MIPMAP_MAXLEVEL:
        return isSetMipmapMaxlevel();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__MIPMAP_BIAS:
        return isSetMipmapBias();
      case ColladaPackage.FX_SAMPLER2_DCOMMON__EXTRA:
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
    result.append(" (source: ");
    result.append(source);
    result.append(", wrapS: ");
    if (wrapSESet) result.append(wrapS); else result.append("<unset>");
    result.append(", wrapT: ");
    if (wrapTESet) result.append(wrapT); else result.append("<unset>");
    result.append(", minfilter: ");
    if (minfilterESet) result.append(minfilter); else result.append("<unset>");
    result.append(", magfilter: ");
    if (magfilterESet) result.append(magfilter); else result.append("<unset>");
    result.append(", mipfilter: ");
    if (mipfilterESet) result.append(mipfilter); else result.append("<unset>");
    result.append(", borderColor: ");
    result.append(borderColor);
    result.append(", mipmapMaxlevel: ");
    if (mipmapMaxlevelESet) result.append(mipmapMaxlevel); else result.append("<unset>");
    result.append(", mipmapBias: ");
    if (mipmapBiasESet) result.append(mipmapBias); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //FxSampler2DCommonImpl
