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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.ColladaFactory;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.FxSurfaceCommon;
import org.khronos.collada.FxSurfaceFormatHintCommon;
import org.khronos.collada.FxSurfaceInitCubeCommon;
import org.khronos.collada.FxSurfaceInitFromCommon;
import org.khronos.collada.FxSurfaceInitPlanarCommon;
import org.khronos.collada.FxSurfaceInitVolumeCommon;
import org.khronos.collada.FxSurfaceTypeEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fx Surface Common</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceCommonImpl#getInitAsNull <em>Init As Null</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceCommonImpl#getInitAsTarget <em>Init As Target</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceCommonImpl#getInitCube <em>Init Cube</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceCommonImpl#getInitVolume <em>Init Volume</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceCommonImpl#getInitPlanar <em>Init Planar</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceCommonImpl#getInitFrom <em>Init From</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceCommonImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceCommonImpl#getFormatHint <em>Format Hint</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceCommonImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceCommonImpl#getViewportRatio <em>Viewport Ratio</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceCommonImpl#getMipLevels <em>Mip Levels</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceCommonImpl#isMipmapGenerate <em>Mipmap Generate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceCommonImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.FxSurfaceCommonImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FxSurfaceCommonImpl extends EObjectImpl implements FxSurfaceCommon {
	/**
   * The cached value of the '{@link #getInitAsNull() <em>Init As Null</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInitAsNull()
   * @generated
   * @ordered
   */
	protected EObject initAsNull;

	/**
   * The cached value of the '{@link #getInitAsTarget() <em>Init As Target</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInitAsTarget()
   * @generated
   * @ordered
   */
	protected EObject initAsTarget;

	/**
   * The cached value of the '{@link #getInitCube() <em>Init Cube</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInitCube()
   * @generated
   * @ordered
   */
	protected FxSurfaceInitCubeCommon initCube;

	/**
   * The cached value of the '{@link #getInitVolume() <em>Init Volume</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInitVolume()
   * @generated
   * @ordered
   */
	protected FxSurfaceInitVolumeCommon initVolume;

	/**
   * The cached value of the '{@link #getInitPlanar() <em>Init Planar</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInitPlanar()
   * @generated
   * @ordered
   */
	protected FxSurfaceInitPlanarCommon initPlanar;

	/**
   * The cached value of the '{@link #getInitFrom() <em>Init From</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInitFrom()
   * @generated
   * @ordered
   */
	protected EList<FxSurfaceInitFromCommon> initFrom;

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
   * The cached value of the '{@link #getFormatHint() <em>Format Hint</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFormatHint()
   * @generated
   * @ordered
   */
	protected FxSurfaceFormatHintCommon formatHint;

	/**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
	@SuppressWarnings("unchecked")
	protected static final List<Long> SIZE_EDEFAULT = (List<Long>)ColladaFactory.eINSTANCE.createFromString(ColladaPackage.eINSTANCE.getInt3(), "0 0 0");

	/**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
	protected List<Long> size = SIZE_EDEFAULT;

	/**
   * This is true if the Size attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean sizeESet;

	/**
   * The default value of the '{@link #getViewportRatio() <em>Viewport Ratio</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getViewportRatio()
   * @generated
   * @ordered
   */
	@SuppressWarnings("unchecked")
	protected static final List<Double> VIEWPORT_RATIO_EDEFAULT = (List<Double>)ColladaFactory.eINSTANCE.createFromString(ColladaPackage.eINSTANCE.getFloat2(), "1 1");

	/**
   * The cached value of the '{@link #getViewportRatio() <em>Viewport Ratio</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getViewportRatio()
   * @generated
   * @ordered
   */
	protected List<Double> viewportRatio = VIEWPORT_RATIO_EDEFAULT;

	/**
   * This is true if the Viewport Ratio attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean viewportRatioESet;

	/**
   * The default value of the '{@link #getMipLevels() <em>Mip Levels</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMipLevels()
   * @generated
   * @ordered
   */
	protected static final long MIP_LEVELS_EDEFAULT = 0L;

	/**
   * The cached value of the '{@link #getMipLevels() <em>Mip Levels</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMipLevels()
   * @generated
   * @ordered
   */
	protected long mipLevels = MIP_LEVELS_EDEFAULT;

	/**
   * This is true if the Mip Levels attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean mipLevelsESet;

	/**
   * The default value of the '{@link #isMipmapGenerate() <em>Mipmap Generate</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isMipmapGenerate()
   * @generated
   * @ordered
   */
	protected static final boolean MIPMAP_GENERATE_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isMipmapGenerate() <em>Mipmap Generate</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isMipmapGenerate()
   * @generated
   * @ordered
   */
	protected boolean mipmapGenerate = MIPMAP_GENERATE_EDEFAULT;

	/**
   * This is true if the Mipmap Generate attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean mipmapGenerateESet;

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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
	protected static final FxSurfaceTypeEnum TYPE_EDEFAULT = FxSurfaceTypeEnum.UNTYPED;

	/**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
	protected FxSurfaceTypeEnum type = TYPE_EDEFAULT;

	/**
   * This is true if the Type attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean typeESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected FxSurfaceCommonImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getFxSurfaceCommon();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EObject getInitAsNull() {
    return initAsNull;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInitAsNull(EObject newInitAsNull, NotificationChain msgs) {
    EObject oldInitAsNull = initAsNull;
    initAsNull = newInitAsNull;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__INIT_AS_NULL, oldInitAsNull, newInitAsNull);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInitAsNull(EObject newInitAsNull) {
    if (newInitAsNull != initAsNull)
    {
      NotificationChain msgs = null;
      if (initAsNull != null)
        msgs = ((InternalEObject)initAsNull).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_COMMON__INIT_AS_NULL, null, msgs);
      if (newInitAsNull != null)
        msgs = ((InternalEObject)newInitAsNull).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_COMMON__INIT_AS_NULL, null, msgs);
      msgs = basicSetInitAsNull(newInitAsNull, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__INIT_AS_NULL, newInitAsNull, newInitAsNull));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EObject getInitAsTarget() {
    return initAsTarget;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInitAsTarget(EObject newInitAsTarget, NotificationChain msgs) {
    EObject oldInitAsTarget = initAsTarget;
    initAsTarget = newInitAsTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__INIT_AS_TARGET, oldInitAsTarget, newInitAsTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInitAsTarget(EObject newInitAsTarget) {
    if (newInitAsTarget != initAsTarget)
    {
      NotificationChain msgs = null;
      if (initAsTarget != null)
        msgs = ((InternalEObject)initAsTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_COMMON__INIT_AS_TARGET, null, msgs);
      if (newInitAsTarget != null)
        msgs = ((InternalEObject)newInitAsTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_COMMON__INIT_AS_TARGET, null, msgs);
      msgs = basicSetInitAsTarget(newInitAsTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__INIT_AS_TARGET, newInitAsTarget, newInitAsTarget));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceInitCubeCommon getInitCube() {
    return initCube;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInitCube(FxSurfaceInitCubeCommon newInitCube, NotificationChain msgs) {
    FxSurfaceInitCubeCommon oldInitCube = initCube;
    initCube = newInitCube;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__INIT_CUBE, oldInitCube, newInitCube);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInitCube(FxSurfaceInitCubeCommon newInitCube) {
    if (newInitCube != initCube)
    {
      NotificationChain msgs = null;
      if (initCube != null)
        msgs = ((InternalEObject)initCube).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_COMMON__INIT_CUBE, null, msgs);
      if (newInitCube != null)
        msgs = ((InternalEObject)newInitCube).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_COMMON__INIT_CUBE, null, msgs);
      msgs = basicSetInitCube(newInitCube, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__INIT_CUBE, newInitCube, newInitCube));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceInitVolumeCommon getInitVolume() {
    return initVolume;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInitVolume(FxSurfaceInitVolumeCommon newInitVolume, NotificationChain msgs) {
    FxSurfaceInitVolumeCommon oldInitVolume = initVolume;
    initVolume = newInitVolume;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__INIT_VOLUME, oldInitVolume, newInitVolume);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInitVolume(FxSurfaceInitVolumeCommon newInitVolume) {
    if (newInitVolume != initVolume)
    {
      NotificationChain msgs = null;
      if (initVolume != null)
        msgs = ((InternalEObject)initVolume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_COMMON__INIT_VOLUME, null, msgs);
      if (newInitVolume != null)
        msgs = ((InternalEObject)newInitVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_COMMON__INIT_VOLUME, null, msgs);
      msgs = basicSetInitVolume(newInitVolume, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__INIT_VOLUME, newInitVolume, newInitVolume));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceInitPlanarCommon getInitPlanar() {
    return initPlanar;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInitPlanar(FxSurfaceInitPlanarCommon newInitPlanar, NotificationChain msgs) {
    FxSurfaceInitPlanarCommon oldInitPlanar = initPlanar;
    initPlanar = newInitPlanar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__INIT_PLANAR, oldInitPlanar, newInitPlanar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInitPlanar(FxSurfaceInitPlanarCommon newInitPlanar) {
    if (newInitPlanar != initPlanar)
    {
      NotificationChain msgs = null;
      if (initPlanar != null)
        msgs = ((InternalEObject)initPlanar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_COMMON__INIT_PLANAR, null, msgs);
      if (newInitPlanar != null)
        msgs = ((InternalEObject)newInitPlanar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_COMMON__INIT_PLANAR, null, msgs);
      msgs = basicSetInitPlanar(newInitPlanar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__INIT_PLANAR, newInitPlanar, newInitPlanar));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FxSurfaceInitFromCommon> getInitFrom() {
    if (initFrom == null)
    {
      initFrom = new EObjectContainmentEList<FxSurfaceInitFromCommon>(FxSurfaceInitFromCommon.class, this, ColladaPackage.FX_SURFACE_COMMON__INIT_FROM);
    }
    return initFrom;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__FORMAT, oldFormat, format));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceFormatHintCommon getFormatHint() {
    return formatHint;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFormatHint(FxSurfaceFormatHintCommon newFormatHint, NotificationChain msgs) {
    FxSurfaceFormatHintCommon oldFormatHint = formatHint;
    formatHint = newFormatHint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__FORMAT_HINT, oldFormatHint, newFormatHint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFormatHint(FxSurfaceFormatHintCommon newFormatHint) {
    if (newFormatHint != formatHint)
    {
      NotificationChain msgs = null;
      if (formatHint != null)
        msgs = ((InternalEObject)formatHint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_COMMON__FORMAT_HINT, null, msgs);
      if (newFormatHint != null)
        msgs = ((InternalEObject)newFormatHint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.FX_SURFACE_COMMON__FORMAT_HINT, null, msgs);
      msgs = basicSetFormatHint(newFormatHint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__FORMAT_HINT, newFormatHint, newFormatHint));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Long> getSize() {
    return size;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSize(List<Long> newSize) {
    List<Long> oldSize = size;
    size = newSize;
    boolean oldSizeESet = sizeESet;
    sizeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__SIZE, oldSize, size, !oldSizeESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetSize() {
    List<Long> oldSize = size;
    boolean oldSizeESet = sizeESet;
    size = SIZE_EDEFAULT;
    sizeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SURFACE_COMMON__SIZE, oldSize, SIZE_EDEFAULT, oldSizeESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetSize() {
    return sizeESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getViewportRatio() {
    return viewportRatio;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setViewportRatio(List<Double> newViewportRatio) {
    List<Double> oldViewportRatio = viewportRatio;
    viewportRatio = newViewportRatio;
    boolean oldViewportRatioESet = viewportRatioESet;
    viewportRatioESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__VIEWPORT_RATIO, oldViewportRatio, viewportRatio, !oldViewportRatioESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetViewportRatio() {
    List<Double> oldViewportRatio = viewportRatio;
    boolean oldViewportRatioESet = viewportRatioESet;
    viewportRatio = VIEWPORT_RATIO_EDEFAULT;
    viewportRatioESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SURFACE_COMMON__VIEWPORT_RATIO, oldViewportRatio, VIEWPORT_RATIO_EDEFAULT, oldViewportRatioESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetViewportRatio() {
    return viewportRatioESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public long getMipLevels() {
    return mipLevels;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMipLevels(long newMipLevels) {
    long oldMipLevels = mipLevels;
    mipLevels = newMipLevels;
    boolean oldMipLevelsESet = mipLevelsESet;
    mipLevelsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__MIP_LEVELS, oldMipLevels, mipLevels, !oldMipLevelsESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMipLevels() {
    long oldMipLevels = mipLevels;
    boolean oldMipLevelsESet = mipLevelsESet;
    mipLevels = MIP_LEVELS_EDEFAULT;
    mipLevelsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SURFACE_COMMON__MIP_LEVELS, oldMipLevels, MIP_LEVELS_EDEFAULT, oldMipLevelsESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMipLevels() {
    return mipLevelsESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isMipmapGenerate() {
    return mipmapGenerate;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMipmapGenerate(boolean newMipmapGenerate) {
    boolean oldMipmapGenerate = mipmapGenerate;
    mipmapGenerate = newMipmapGenerate;
    boolean oldMipmapGenerateESet = mipmapGenerateESet;
    mipmapGenerateESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__MIPMAP_GENERATE, oldMipmapGenerate, mipmapGenerate, !oldMipmapGenerateESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMipmapGenerate() {
    boolean oldMipmapGenerate = mipmapGenerate;
    boolean oldMipmapGenerateESet = mipmapGenerateESet;
    mipmapGenerate = MIPMAP_GENERATE_EDEFAULT;
    mipmapGenerateESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SURFACE_COMMON__MIPMAP_GENERATE, oldMipmapGenerate, MIPMAP_GENERATE_EDEFAULT, oldMipmapGenerateESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMipmapGenerate() {
    return mipmapGenerateESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.FX_SURFACE_COMMON__EXTRA);
    }
    return extra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FxSurfaceTypeEnum getType() {
    return type;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setType(FxSurfaceTypeEnum newType) {
    FxSurfaceTypeEnum oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    boolean oldTypeESet = typeESet;
    typeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.FX_SURFACE_COMMON__TYPE, oldType, type, !oldTypeESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetType() {
    FxSurfaceTypeEnum oldType = type;
    boolean oldTypeESet = typeESet;
    type = TYPE_EDEFAULT;
    typeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.FX_SURFACE_COMMON__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetType() {
    return typeESet;
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
      case ColladaPackage.FX_SURFACE_COMMON__INIT_AS_NULL:
        return basicSetInitAsNull(null, msgs);
      case ColladaPackage.FX_SURFACE_COMMON__INIT_AS_TARGET:
        return basicSetInitAsTarget(null, msgs);
      case ColladaPackage.FX_SURFACE_COMMON__INIT_CUBE:
        return basicSetInitCube(null, msgs);
      case ColladaPackage.FX_SURFACE_COMMON__INIT_VOLUME:
        return basicSetInitVolume(null, msgs);
      case ColladaPackage.FX_SURFACE_COMMON__INIT_PLANAR:
        return basicSetInitPlanar(null, msgs);
      case ColladaPackage.FX_SURFACE_COMMON__INIT_FROM:
        return ((InternalEList<?>)getInitFrom()).basicRemove(otherEnd, msgs);
      case ColladaPackage.FX_SURFACE_COMMON__FORMAT_HINT:
        return basicSetFormatHint(null, msgs);
      case ColladaPackage.FX_SURFACE_COMMON__EXTRA:
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
      case ColladaPackage.FX_SURFACE_COMMON__INIT_AS_NULL:
        return getInitAsNull();
      case ColladaPackage.FX_SURFACE_COMMON__INIT_AS_TARGET:
        return getInitAsTarget();
      case ColladaPackage.FX_SURFACE_COMMON__INIT_CUBE:
        return getInitCube();
      case ColladaPackage.FX_SURFACE_COMMON__INIT_VOLUME:
        return getInitVolume();
      case ColladaPackage.FX_SURFACE_COMMON__INIT_PLANAR:
        return getInitPlanar();
      case ColladaPackage.FX_SURFACE_COMMON__INIT_FROM:
        return getInitFrom();
      case ColladaPackage.FX_SURFACE_COMMON__FORMAT:
        return getFormat();
      case ColladaPackage.FX_SURFACE_COMMON__FORMAT_HINT:
        return getFormatHint();
      case ColladaPackage.FX_SURFACE_COMMON__SIZE:
        return getSize();
      case ColladaPackage.FX_SURFACE_COMMON__VIEWPORT_RATIO:
        return getViewportRatio();
      case ColladaPackage.FX_SURFACE_COMMON__MIP_LEVELS:
        return getMipLevels();
      case ColladaPackage.FX_SURFACE_COMMON__MIPMAP_GENERATE:
        return isMipmapGenerate();
      case ColladaPackage.FX_SURFACE_COMMON__EXTRA:
        return getExtra();
      case ColladaPackage.FX_SURFACE_COMMON__TYPE:
        return getType();
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
      case ColladaPackage.FX_SURFACE_COMMON__INIT_AS_NULL:
        setInitAsNull((EObject)newValue);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__INIT_AS_TARGET:
        setInitAsTarget((EObject)newValue);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__INIT_CUBE:
        setInitCube((FxSurfaceInitCubeCommon)newValue);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__INIT_VOLUME:
        setInitVolume((FxSurfaceInitVolumeCommon)newValue);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__INIT_PLANAR:
        setInitPlanar((FxSurfaceInitPlanarCommon)newValue);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__INIT_FROM:
        getInitFrom().clear();
        getInitFrom().addAll((Collection<? extends FxSurfaceInitFromCommon>)newValue);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__FORMAT:
        setFormat((String)newValue);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__FORMAT_HINT:
        setFormatHint((FxSurfaceFormatHintCommon)newValue);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__SIZE:
        setSize((List<Long>)newValue);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__VIEWPORT_RATIO:
        setViewportRatio((List<Double>)newValue);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__MIP_LEVELS:
        setMipLevels((Long)newValue);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__MIPMAP_GENERATE:
        setMipmapGenerate((Boolean)newValue);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__TYPE:
        setType((FxSurfaceTypeEnum)newValue);
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
      case ColladaPackage.FX_SURFACE_COMMON__INIT_AS_NULL:
        setInitAsNull((EObject)null);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__INIT_AS_TARGET:
        setInitAsTarget((EObject)null);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__INIT_CUBE:
        setInitCube((FxSurfaceInitCubeCommon)null);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__INIT_VOLUME:
        setInitVolume((FxSurfaceInitVolumeCommon)null);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__INIT_PLANAR:
        setInitPlanar((FxSurfaceInitPlanarCommon)null);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__INIT_FROM:
        getInitFrom().clear();
        return;
      case ColladaPackage.FX_SURFACE_COMMON__FORMAT:
        setFormat(FORMAT_EDEFAULT);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__FORMAT_HINT:
        setFormatHint((FxSurfaceFormatHintCommon)null);
        return;
      case ColladaPackage.FX_SURFACE_COMMON__SIZE:
        unsetSize();
        return;
      case ColladaPackage.FX_SURFACE_COMMON__VIEWPORT_RATIO:
        unsetViewportRatio();
        return;
      case ColladaPackage.FX_SURFACE_COMMON__MIP_LEVELS:
        unsetMipLevels();
        return;
      case ColladaPackage.FX_SURFACE_COMMON__MIPMAP_GENERATE:
        unsetMipmapGenerate();
        return;
      case ColladaPackage.FX_SURFACE_COMMON__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.FX_SURFACE_COMMON__TYPE:
        unsetType();
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
      case ColladaPackage.FX_SURFACE_COMMON__INIT_AS_NULL:
        return initAsNull != null;
      case ColladaPackage.FX_SURFACE_COMMON__INIT_AS_TARGET:
        return initAsTarget != null;
      case ColladaPackage.FX_SURFACE_COMMON__INIT_CUBE:
        return initCube != null;
      case ColladaPackage.FX_SURFACE_COMMON__INIT_VOLUME:
        return initVolume != null;
      case ColladaPackage.FX_SURFACE_COMMON__INIT_PLANAR:
        return initPlanar != null;
      case ColladaPackage.FX_SURFACE_COMMON__INIT_FROM:
        return initFrom != null && !initFrom.isEmpty();
      case ColladaPackage.FX_SURFACE_COMMON__FORMAT:
        return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
      case ColladaPackage.FX_SURFACE_COMMON__FORMAT_HINT:
        return formatHint != null;
      case ColladaPackage.FX_SURFACE_COMMON__SIZE:
        return isSetSize();
      case ColladaPackage.FX_SURFACE_COMMON__VIEWPORT_RATIO:
        return isSetViewportRatio();
      case ColladaPackage.FX_SURFACE_COMMON__MIP_LEVELS:
        return isSetMipLevels();
      case ColladaPackage.FX_SURFACE_COMMON__MIPMAP_GENERATE:
        return isSetMipmapGenerate();
      case ColladaPackage.FX_SURFACE_COMMON__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.FX_SURFACE_COMMON__TYPE:
        return isSetType();
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
    result.append(" (format: ");
    result.append(format);
    result.append(", size: ");
    if (sizeESet) result.append(size); else result.append("<unset>");
    result.append(", viewportRatio: ");
    if (viewportRatioESet) result.append(viewportRatio); else result.append("<unset>");
    result.append(", mipLevels: ");
    if (mipLevelsESet) result.append(mipLevels); else result.append("<unset>");
    result.append(", mipmapGenerate: ");
    if (mipmapGenerateESet) result.append(mipmapGenerate); else result.append("<unset>");
    result.append(", type: ");
    if (typeESet) result.append(type); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //FxSurfaceCommonImpl
