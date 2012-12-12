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

import org.khronos.collada.AssetType;
import org.khronos.collada.COLLADAType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.LibraryAnimationClipsType;
import org.khronos.collada.LibraryAnimationsType;
import org.khronos.collada.LibraryCamerasType;
import org.khronos.collada.LibraryControllersType;
import org.khronos.collada.LibraryEffectsType;
import org.khronos.collada.LibraryForceFieldsType;
import org.khronos.collada.LibraryGeometriesType;
import org.khronos.collada.LibraryImagesType;
import org.khronos.collada.LibraryLightsType;
import org.khronos.collada.LibraryMaterialsType;
import org.khronos.collada.LibraryNodesType;
import org.khronos.collada.LibraryPhysicsMaterialsType;
import org.khronos.collada.LibraryPhysicsModelsType;
import org.khronos.collada.LibraryPhysicsScenesType;
import org.khronos.collada.LibraryVisualScenesType;
import org.khronos.collada.SceneType;
import org.khronos.collada.VersionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COLLADA Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getLibraryAnimations <em>Library Animations</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getLibraryAnimationClips <em>Library Animation Clips</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getLibraryCameras <em>Library Cameras</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getLibraryControllers <em>Library Controllers</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getLibraryGeometries <em>Library Geometries</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getLibraryEffects <em>Library Effects</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getLibraryForceFields <em>Library Force Fields</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getLibraryImages <em>Library Images</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getLibraryLights <em>Library Lights</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getLibraryMaterials <em>Library Materials</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getLibraryNodes <em>Library Nodes</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getLibraryPhysicsMaterials <em>Library Physics Materials</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getLibraryPhysicsModels <em>Library Physics Models</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getLibraryPhysicsScenes <em>Library Physics Scenes</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getLibraryVisualScenes <em>Library Visual Scenes</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.khronos.collada.impl.COLLADATypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class COLLADATypeImpl extends EObjectImpl implements COLLADAType {
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
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
	protected FeatureMap group;

	/**
   * The cached value of the '{@link #getScene() <em>Scene</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getScene()
   * @generated
   * @ordered
   */
	protected SceneType scene;

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
   * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
	protected static final String BASE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
	protected String base = BASE_EDEFAULT;

	/**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
	protected static final VersionType VERSION_EDEFAULT = VersionType._140;

	/**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
	protected VersionType version = VERSION_EDEFAULT;

	/**
   * This is true if the Version attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean versionESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected COLLADATypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getCOLLADAType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.COLLADA_TYPE__ASSET, oldAsset, newAsset);
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
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COLLADA_TYPE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COLLADA_TYPE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COLLADA_TYPE__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null)
    {
      group = new BasicFeatureMap(this, ColladaPackage.COLLADA_TYPE__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LibraryAnimationsType> getLibraryAnimations() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCOLLADAType_LibraryAnimations());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LibraryAnimationClipsType> getLibraryAnimationClips() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCOLLADAType_LibraryAnimationClips());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LibraryCamerasType> getLibraryCameras() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCOLLADAType_LibraryCameras());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LibraryControllersType> getLibraryControllers() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCOLLADAType_LibraryControllers());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LibraryGeometriesType> getLibraryGeometries() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCOLLADAType_LibraryGeometries());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LibraryEffectsType> getLibraryEffects() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCOLLADAType_LibraryEffects());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LibraryForceFieldsType> getLibraryForceFields() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCOLLADAType_LibraryForceFields());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LibraryImagesType> getLibraryImages() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCOLLADAType_LibraryImages());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LibraryLightsType> getLibraryLights() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCOLLADAType_LibraryLights());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LibraryMaterialsType> getLibraryMaterials() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCOLLADAType_LibraryMaterials());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LibraryNodesType> getLibraryNodes() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCOLLADAType_LibraryNodes());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LibraryPhysicsMaterialsType> getLibraryPhysicsMaterials() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCOLLADAType_LibraryPhysicsMaterials());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LibraryPhysicsModelsType> getLibraryPhysicsModels() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCOLLADAType_LibraryPhysicsModels());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LibraryPhysicsScenesType> getLibraryPhysicsScenes() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCOLLADAType_LibraryPhysicsScenes());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<LibraryVisualScenesType> getLibraryVisualScenes() {
    return getGroup().list(ColladaPackage.eINSTANCE.getCOLLADAType_LibraryVisualScenes());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SceneType getScene() {
    return scene;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetScene(SceneType newScene, NotificationChain msgs) {
    SceneType oldScene = scene;
    scene = newScene;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.COLLADA_TYPE__SCENE, oldScene, newScene);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setScene(SceneType newScene) {
    if (newScene != scene)
    {
      NotificationChain msgs = null;
      if (scene != null)
        msgs = ((InternalEObject)scene).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COLLADA_TYPE__SCENE, null, msgs);
      if (newScene != null)
        msgs = ((InternalEObject)newScene).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.COLLADA_TYPE__SCENE, null, msgs);
      msgs = basicSetScene(newScene, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COLLADA_TYPE__SCENE, newScene, newScene));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.COLLADA_TYPE__EXTRA);
    }
    return extra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getBase() {
    return base;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBase(String newBase) {
    String oldBase = base;
    base = newBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COLLADA_TYPE__BASE, oldBase, base));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public VersionType getVersion() {
    return version;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setVersion(VersionType newVersion) {
    VersionType oldVersion = version;
    version = newVersion == null ? VERSION_EDEFAULT : newVersion;
    boolean oldVersionESet = versionESet;
    versionESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.COLLADA_TYPE__VERSION, oldVersion, version, !oldVersionESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetVersion() {
    VersionType oldVersion = version;
    boolean oldVersionESet = versionESet;
    version = VERSION_EDEFAULT;
    versionESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.COLLADA_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetVersion() {
    return versionESet;
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
      case ColladaPackage.COLLADA_TYPE__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.COLLADA_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__LIBRARY_ANIMATIONS:
        return ((InternalEList<?>)getLibraryAnimations()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__LIBRARY_ANIMATION_CLIPS:
        return ((InternalEList<?>)getLibraryAnimationClips()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__LIBRARY_CAMERAS:
        return ((InternalEList<?>)getLibraryCameras()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__LIBRARY_CONTROLLERS:
        return ((InternalEList<?>)getLibraryControllers()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__LIBRARY_GEOMETRIES:
        return ((InternalEList<?>)getLibraryGeometries()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__LIBRARY_EFFECTS:
        return ((InternalEList<?>)getLibraryEffects()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__LIBRARY_FORCE_FIELDS:
        return ((InternalEList<?>)getLibraryForceFields()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__LIBRARY_IMAGES:
        return ((InternalEList<?>)getLibraryImages()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__LIBRARY_LIGHTS:
        return ((InternalEList<?>)getLibraryLights()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__LIBRARY_MATERIALS:
        return ((InternalEList<?>)getLibraryMaterials()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__LIBRARY_NODES:
        return ((InternalEList<?>)getLibraryNodes()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__LIBRARY_PHYSICS_MATERIALS:
        return ((InternalEList<?>)getLibraryPhysicsMaterials()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__LIBRARY_PHYSICS_MODELS:
        return ((InternalEList<?>)getLibraryPhysicsModels()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__LIBRARY_PHYSICS_SCENES:
        return ((InternalEList<?>)getLibraryPhysicsScenes()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__LIBRARY_VISUAL_SCENES:
        return ((InternalEList<?>)getLibraryVisualScenes()).basicRemove(otherEnd, msgs);
      case ColladaPackage.COLLADA_TYPE__SCENE:
        return basicSetScene(null, msgs);
      case ColladaPackage.COLLADA_TYPE__EXTRA:
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
      case ColladaPackage.COLLADA_TYPE__ASSET:
        return getAsset();
      case ColladaPackage.COLLADA_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_ANIMATIONS:
        return getLibraryAnimations();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_ANIMATION_CLIPS:
        return getLibraryAnimationClips();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_CAMERAS:
        return getLibraryCameras();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_CONTROLLERS:
        return getLibraryControllers();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_GEOMETRIES:
        return getLibraryGeometries();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_EFFECTS:
        return getLibraryEffects();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_FORCE_FIELDS:
        return getLibraryForceFields();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_IMAGES:
        return getLibraryImages();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_LIGHTS:
        return getLibraryLights();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_MATERIALS:
        return getLibraryMaterials();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_NODES:
        return getLibraryNodes();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_PHYSICS_MATERIALS:
        return getLibraryPhysicsMaterials();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_PHYSICS_MODELS:
        return getLibraryPhysicsModels();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_PHYSICS_SCENES:
        return getLibraryPhysicsScenes();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_VISUAL_SCENES:
        return getLibraryVisualScenes();
      case ColladaPackage.COLLADA_TYPE__SCENE:
        return getScene();
      case ColladaPackage.COLLADA_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.COLLADA_TYPE__BASE:
        return getBase();
      case ColladaPackage.COLLADA_TYPE__VERSION:
        return getVersion();
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
      case ColladaPackage.COLLADA_TYPE__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_ANIMATIONS:
        getLibraryAnimations().clear();
        getLibraryAnimations().addAll((Collection<? extends LibraryAnimationsType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_ANIMATION_CLIPS:
        getLibraryAnimationClips().clear();
        getLibraryAnimationClips().addAll((Collection<? extends LibraryAnimationClipsType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_CAMERAS:
        getLibraryCameras().clear();
        getLibraryCameras().addAll((Collection<? extends LibraryCamerasType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_CONTROLLERS:
        getLibraryControllers().clear();
        getLibraryControllers().addAll((Collection<? extends LibraryControllersType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_GEOMETRIES:
        getLibraryGeometries().clear();
        getLibraryGeometries().addAll((Collection<? extends LibraryGeometriesType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_EFFECTS:
        getLibraryEffects().clear();
        getLibraryEffects().addAll((Collection<? extends LibraryEffectsType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_FORCE_FIELDS:
        getLibraryForceFields().clear();
        getLibraryForceFields().addAll((Collection<? extends LibraryForceFieldsType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_IMAGES:
        getLibraryImages().clear();
        getLibraryImages().addAll((Collection<? extends LibraryImagesType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_LIGHTS:
        getLibraryLights().clear();
        getLibraryLights().addAll((Collection<? extends LibraryLightsType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_MATERIALS:
        getLibraryMaterials().clear();
        getLibraryMaterials().addAll((Collection<? extends LibraryMaterialsType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_NODES:
        getLibraryNodes().clear();
        getLibraryNodes().addAll((Collection<? extends LibraryNodesType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_PHYSICS_MATERIALS:
        getLibraryPhysicsMaterials().clear();
        getLibraryPhysicsMaterials().addAll((Collection<? extends LibraryPhysicsMaterialsType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_PHYSICS_MODELS:
        getLibraryPhysicsModels().clear();
        getLibraryPhysicsModels().addAll((Collection<? extends LibraryPhysicsModelsType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_PHYSICS_SCENES:
        getLibraryPhysicsScenes().clear();
        getLibraryPhysicsScenes().addAll((Collection<? extends LibraryPhysicsScenesType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_VISUAL_SCENES:
        getLibraryVisualScenes().clear();
        getLibraryVisualScenes().addAll((Collection<? extends LibraryVisualScenesType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__SCENE:
        setScene((SceneType)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__BASE:
        setBase((String)newValue);
        return;
      case ColladaPackage.COLLADA_TYPE__VERSION:
        setVersion((VersionType)newValue);
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
      case ColladaPackage.COLLADA_TYPE__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.COLLADA_TYPE__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_ANIMATIONS:
        getLibraryAnimations().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_ANIMATION_CLIPS:
        getLibraryAnimationClips().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_CAMERAS:
        getLibraryCameras().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_CONTROLLERS:
        getLibraryControllers().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_GEOMETRIES:
        getLibraryGeometries().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_EFFECTS:
        getLibraryEffects().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_FORCE_FIELDS:
        getLibraryForceFields().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_IMAGES:
        getLibraryImages().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_LIGHTS:
        getLibraryLights().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_MATERIALS:
        getLibraryMaterials().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_NODES:
        getLibraryNodes().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_PHYSICS_MATERIALS:
        getLibraryPhysicsMaterials().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_PHYSICS_MODELS:
        getLibraryPhysicsModels().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_PHYSICS_SCENES:
        getLibraryPhysicsScenes().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__LIBRARY_VISUAL_SCENES:
        getLibraryVisualScenes().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__SCENE:
        setScene((SceneType)null);
        return;
      case ColladaPackage.COLLADA_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.COLLADA_TYPE__BASE:
        setBase(BASE_EDEFAULT);
        return;
      case ColladaPackage.COLLADA_TYPE__VERSION:
        unsetVersion();
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
      case ColladaPackage.COLLADA_TYPE__ASSET:
        return asset != null;
      case ColladaPackage.COLLADA_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_ANIMATIONS:
        return !getLibraryAnimations().isEmpty();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_ANIMATION_CLIPS:
        return !getLibraryAnimationClips().isEmpty();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_CAMERAS:
        return !getLibraryCameras().isEmpty();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_CONTROLLERS:
        return !getLibraryControllers().isEmpty();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_GEOMETRIES:
        return !getLibraryGeometries().isEmpty();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_EFFECTS:
        return !getLibraryEffects().isEmpty();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_FORCE_FIELDS:
        return !getLibraryForceFields().isEmpty();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_IMAGES:
        return !getLibraryImages().isEmpty();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_LIGHTS:
        return !getLibraryLights().isEmpty();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_MATERIALS:
        return !getLibraryMaterials().isEmpty();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_NODES:
        return !getLibraryNodes().isEmpty();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_PHYSICS_MATERIALS:
        return !getLibraryPhysicsMaterials().isEmpty();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_PHYSICS_MODELS:
        return !getLibraryPhysicsModels().isEmpty();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_PHYSICS_SCENES:
        return !getLibraryPhysicsScenes().isEmpty();
      case ColladaPackage.COLLADA_TYPE__LIBRARY_VISUAL_SCENES:
        return !getLibraryVisualScenes().isEmpty();
      case ColladaPackage.COLLADA_TYPE__SCENE:
        return scene != null;
      case ColladaPackage.COLLADA_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.COLLADA_TYPE__BASE:
        return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
      case ColladaPackage.COLLADA_TYPE__VERSION:
        return isSetVersion();
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
    result.append(", base: ");
    result.append(base);
    result.append(", version: ");
    if (versionESet) result.append(version); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //COLLADATypeImpl
