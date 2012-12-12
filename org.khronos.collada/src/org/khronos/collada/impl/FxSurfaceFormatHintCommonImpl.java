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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.FxSurfaceFormatHintChannelsEnum;
import org.khronos.collada.FxSurfaceFormatHintCommon;
import org.khronos.collada.FxSurfaceFormatHintOptionEnum;
import org.khronos.collada.FxSurfaceFormatHintPrecisionEnum;
import org.khronos.collada.FxSurfaceFormatHintRangeEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fx Surface Format Hint Common</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceFormatHintCommonImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceFormatHintCommonImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceFormatHintCommonImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceFormatHintCommonImpl#getOption <em>Option</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceFormatHintCommonImpl#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FxSurfaceFormatHintCommonImpl extends EObjectImpl implements FxSurfaceFormatHintCommon {
	/**
   * The default value of the '{@link #getChannels() <em>Channels</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChannels()
   * @generated
   * @ordered
   */
	protected static final FxSurfaceFormatHintChannelsEnum CHANNELS_EDEFAULT = FxSurfaceFormatHintChannelsEnum.RGB;

	/**
   * The cached value of the '{@link #getChannels() <em>Channels</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChannels()
   * @generated
   * @ordered
   */
	protected FxSurfaceFormatHintChannelsEnum channels = CHANNELS_EDEFAULT;

	/**
   * This is true if the Channels attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean channelsESet;

	/**
   * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
	protected static final FxSurfaceFormatHintRangeEnum RANGE_EDEFAULT = FxSurfaceFormatHintRangeEnum.SNORM;

	/**
   * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
	protected FxSurfaceFormatHintRangeEnum range = RANGE_EDEFAULT;

	/**
   * This is true if the Range attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean rangeESet;

	/**
   * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPrecision()
   * @generated
   * @ordered
   */
	protected static final FxSurfaceFormatHintPrecisionEnum PRECISION_EDEFAULT = FxSurfaceFormatHintPrecisionEnum.LOW;

	/**
   * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPrecision()
   * @generated
   * @ordered
   */
	protected FxSurfaceFormatHintPrecisionEnum precision = PRECISION_EDEFAULT;

	/**
   * This is true if the Precision attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean precisionESet;

	/**
   * The cached value of the '{@link #getOption() <em>Option</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
	protected EList<FxSurfaceFormatHintOptionEnum> option;

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
	protected FxSurfaceFormatHintCommonImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getFxSurfaceFormatHintCommon();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFormatHintChannelsEnum getChannels() {
    return channels;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setChannels(FxSurfaceFormatHintChannelsEnum newChannels) {
    FxSurfaceFormatHintChannelsEnum oldChannels = channels;
    channels = newChannels == null ? CHANNELS_EDEFAULT : newChannels;
    boolean oldChannelsESet = channelsESet;
    channelsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__CHANNELS, oldChannels, channels, !oldChannelsESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetChannels() {
    FxSurfaceFormatHintChannelsEnum oldChannels = channels;
    boolean oldChannelsESet = channelsESet;
    channels = CHANNELS_EDEFAULT;
    channelsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__CHANNELS, oldChannels, CHANNELS_EDEFAULT, oldChannelsESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetChannels() {
    return channelsESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFormatHintRangeEnum getRange() {
    return range;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRange(FxSurfaceFormatHintRangeEnum newRange) {
    FxSurfaceFormatHintRangeEnum oldRange = range;
    range = newRange == null ? RANGE_EDEFAULT : newRange;
    boolean oldRangeESet = rangeESet;
    rangeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__RANGE, oldRange, range, !oldRangeESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetRange() {
    FxSurfaceFormatHintRangeEnum oldRange = range;
    boolean oldRangeESet = rangeESet;
    range = RANGE_EDEFAULT;
    rangeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__RANGE, oldRange, RANGE_EDEFAULT, oldRangeESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetRange() {
    return rangeESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFormatHintPrecisionEnum getPrecision() {
    return precision;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPrecision(FxSurfaceFormatHintPrecisionEnum newPrecision) {
    FxSurfaceFormatHintPrecisionEnum oldPrecision = precision;
    precision = newPrecision == null ? PRECISION_EDEFAULT : newPrecision;
    boolean oldPrecisionESet = precisionESet;
    precisionESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__PRECISION, oldPrecision, precision, !oldPrecisionESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetPrecision() {
    FxSurfaceFormatHintPrecisionEnum oldPrecision = precision;
    boolean oldPrecisionESet = precisionESet;
    precision = PRECISION_EDEFAULT;
    precisionESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__PRECISION, oldPrecision, PRECISION_EDEFAULT, oldPrecisionESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetPrecision() {
    return precisionESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxSurfaceFormatHintOptionEnum> getOption() {
    if (option == null)
    {
      option = new EDataTypeEList<FxSurfaceFormatHintOptionEnum>(FxSurfaceFormatHintOptionEnum.class, this, ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__OPTION);
    }
    return option;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__EXTRA);
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
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__EXTRA:
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
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__CHANNELS:
        return getChannels();
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__RANGE:
        return getRange();
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__PRECISION:
        return getPrecision();
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__OPTION:
        return getOption();
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__EXTRA:
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
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__CHANNELS:
        setChannels((FxSurfaceFormatHintChannelsEnum)newValue);
        return;
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__RANGE:
        setRange((FxSurfaceFormatHintRangeEnum)newValue);
        return;
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__PRECISION:
        setPrecision((FxSurfaceFormatHintPrecisionEnum)newValue);
        return;
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__OPTION:
        getOption().clear();
        getOption().addAll((Collection<? extends FxSurfaceFormatHintOptionEnum>)newValue);
        return;
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__EXTRA:
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
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__CHANNELS:
        unsetChannels();
        return;
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__RANGE:
        unsetRange();
        return;
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__PRECISION:
        unsetPrecision();
        return;
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__OPTION:
        getOption().clear();
        return;
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__EXTRA:
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
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__CHANNELS:
        return isSetChannels();
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__RANGE:
        return isSetRange();
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__PRECISION:
        return isSetPrecision();
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__OPTION:
        return option != null && !option.isEmpty();
      case ColladaPackage.FX_SURFACE_FORMAT_HINT_COMMON__EXTRA:
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
    result.append(" (channels: ");
    if (channelsESet) result.append(channels); else result.append("<unset>");
    result.append(", range: ");
    if (rangeESet) result.append(range); else result.append("<unset>");
    result.append(", precision: ");
    if (precisionESet) result.append(precision); else result.append("<unset>");
    result.append(", option: ");
    result.append(option);
    result.append(')');
    return result.toString();
  }

} //FxSurfaceFormatHintCommonImpl
