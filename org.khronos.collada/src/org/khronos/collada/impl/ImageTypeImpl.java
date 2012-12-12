/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.math.BigInteger;

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

import org.khronos.collada.AssetType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.ImageType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.ImageTypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ImageTypeImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ImageTypeImpl#getInitFrom <em>Init From</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ImageTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ImageTypeImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ImageTypeImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ImageTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ImageTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ImageTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ImageTypeImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageTypeImpl extends EObjectImpl implements ImageType {
	/**
   * The cached value of the '{@link #getAsset() <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAsset()
   * @generated
   * @ordered
   */
	protected AssetType asset;

	/**
   * The default value of the '{@link #getData() <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
	protected static final List<byte[]> DATA_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
	protected List<byte[]> data = DATA_EDEFAULT;

	/**
   * The default value of the '{@link #getInitFrom() <em>Init From</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInitFrom()
   * @generated
   * @ordered
   */
	protected static final String INIT_FROM_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInitFrom() <em>Init From</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInitFrom()
   * @generated
   * @ordered
   */
	protected String initFrom = INIT_FROM_EDEFAULT;

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
   * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDepth()
   * @generated
   * @ordered
   */
	protected static final BigInteger DEPTH_EDEFAULT = new BigInteger("1");

	/**
   * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDepth()
   * @generated
   * @ordered
   */
	protected BigInteger depth = DEPTH_EDEFAULT;

	/**
   * This is true if the Depth attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean depthESet;

	/**
   * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
	protected static final String FORMAT_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
	protected String format = FORMAT_EDEFAULT;

	/**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
	protected static final BigInteger HEIGHT_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
	protected BigInteger height = HEIGHT_EDEFAULT;

	/**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
	protected static final String ID_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
	protected String id = ID_EDEFAULT;

	/**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected static final String NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected String name = NAME_EDEFAULT;

	/**
   * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
	protected static final BigInteger WIDTH_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
	protected BigInteger width = WIDTH_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ImageTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getImageType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AssetType getAsset() {
    return asset;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAsset(AssetType newAsset, NotificationChain msgs) {
    AssetType oldAsset = asset;
    asset = newAsset;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.IMAGE_TYPE__ASSET, oldAsset, newAsset);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAsset(AssetType newAsset) {
    if (newAsset != asset)
    {
      NotificationChain msgs = null;
      if (asset != null)
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.IMAGE_TYPE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.IMAGE_TYPE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.IMAGE_TYPE__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<byte[]> getData() {
    return data;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setData(List<byte[]> newData) {
    List<byte[]> oldData = data;
    data = newData;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.IMAGE_TYPE__DATA, oldData, data));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getInitFrom() {
    return initFrom;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInitFrom(String newInitFrom) {
    String oldInitFrom = initFrom;
    initFrom = newInitFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.IMAGE_TYPE__INIT_FROM, oldInitFrom, initFrom));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.IMAGE_TYPE__EXTRA);
    }
    return extra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getDepth() {
    return depth;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDepth(BigInteger newDepth) {
    BigInteger oldDepth = depth;
    depth = newDepth;
    boolean oldDepthESet = depthESet;
    depthESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.IMAGE_TYPE__DEPTH, oldDepth, depth, !oldDepthESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetDepth() {
    BigInteger oldDepth = depth;
    boolean oldDepthESet = depthESet;
    depth = DEPTH_EDEFAULT;
    depthESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.IMAGE_TYPE__DEPTH, oldDepth, DEPTH_EDEFAULT, oldDepthESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetDepth() {
    return depthESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getFormat() {
    return format;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFormat(String newFormat) {
    String oldFormat = format;
    format = newFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.IMAGE_TYPE__FORMAT, oldFormat, format));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getHeight() {
    return height;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHeight(BigInteger newHeight) {
    BigInteger oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.IMAGE_TYPE__HEIGHT, oldHeight, height));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getId() {
    return id;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setId(String newId) {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.IMAGE_TYPE__ID, oldId, id));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.IMAGE_TYPE__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getWidth() {
    return width;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setWidth(BigInteger newWidth) {
    BigInteger oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.IMAGE_TYPE__WIDTH, oldWidth, width));
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
      case ColladaPackage.IMAGE_TYPE__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.IMAGE_TYPE__EXTRA:
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
      case ColladaPackage.IMAGE_TYPE__ASSET:
        return getAsset();
      case ColladaPackage.IMAGE_TYPE__DATA:
        return getData();
      case ColladaPackage.IMAGE_TYPE__INIT_FROM:
        return getInitFrom();
      case ColladaPackage.IMAGE_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.IMAGE_TYPE__DEPTH:
        return getDepth();
      case ColladaPackage.IMAGE_TYPE__FORMAT:
        return getFormat();
      case ColladaPackage.IMAGE_TYPE__HEIGHT:
        return getHeight();
      case ColladaPackage.IMAGE_TYPE__ID:
        return getId();
      case ColladaPackage.IMAGE_TYPE__NAME:
        return getName();
      case ColladaPackage.IMAGE_TYPE__WIDTH:
        return getWidth();
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
      case ColladaPackage.IMAGE_TYPE__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.IMAGE_TYPE__DATA:
        setData((List<byte[]>)newValue);
        return;
      case ColladaPackage.IMAGE_TYPE__INIT_FROM:
        setInitFrom((String)newValue);
        return;
      case ColladaPackage.IMAGE_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.IMAGE_TYPE__DEPTH:
        setDepth((BigInteger)newValue);
        return;
      case ColladaPackage.IMAGE_TYPE__FORMAT:
        setFormat((String)newValue);
        return;
      case ColladaPackage.IMAGE_TYPE__HEIGHT:
        setHeight((BigInteger)newValue);
        return;
      case ColladaPackage.IMAGE_TYPE__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.IMAGE_TYPE__NAME:
        setName((String)newValue);
        return;
      case ColladaPackage.IMAGE_TYPE__WIDTH:
        setWidth((BigInteger)newValue);
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
      case ColladaPackage.IMAGE_TYPE__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.IMAGE_TYPE__DATA:
        setData(DATA_EDEFAULT);
        return;
      case ColladaPackage.IMAGE_TYPE__INIT_FROM:
        setInitFrom(INIT_FROM_EDEFAULT);
        return;
      case ColladaPackage.IMAGE_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.IMAGE_TYPE__DEPTH:
        unsetDepth();
        return;
      case ColladaPackage.IMAGE_TYPE__FORMAT:
        setFormat(FORMAT_EDEFAULT);
        return;
      case ColladaPackage.IMAGE_TYPE__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case ColladaPackage.IMAGE_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.IMAGE_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ColladaPackage.IMAGE_TYPE__WIDTH:
        setWidth(WIDTH_EDEFAULT);
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
      case ColladaPackage.IMAGE_TYPE__ASSET:
        return asset != null;
      case ColladaPackage.IMAGE_TYPE__DATA:
        return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
      case ColladaPackage.IMAGE_TYPE__INIT_FROM:
        return INIT_FROM_EDEFAULT == null ? initFrom != null : !INIT_FROM_EDEFAULT.equals(initFrom);
      case ColladaPackage.IMAGE_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.IMAGE_TYPE__DEPTH:
        return isSetDepth();
      case ColladaPackage.IMAGE_TYPE__FORMAT:
        return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
      case ColladaPackage.IMAGE_TYPE__HEIGHT:
        return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
      case ColladaPackage.IMAGE_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.IMAGE_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ColladaPackage.IMAGE_TYPE__WIDTH:
        return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
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
    result.append(" (data: ");
    result.append(data);
    result.append(", initFrom: ");
    result.append(initFrom);
    result.append(", depth: ");
    if (depthESet) result.append(depth); else result.append("<unset>");
    result.append(", format: ");
    result.append(format);
    result.append(", height: ");
    result.append(height);
    result.append(", id: ");
    result.append(id);
    result.append(", name: ");
    result.append(name);
    result.append(", width: ");
    result.append(width);
    result.append(')');
    return result.toString();
  }

} //ImageTypeImpl
