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

import org.khronos.collada.BoxType;
import org.khronos.collada.CapsuleType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.CylinderType;
import org.khronos.collada.ExtraType;
import org.khronos.collada.HollowType1;
import org.khronos.collada.InstanceGeometryType;
import org.khronos.collada.InstanceWithExtra;
import org.khronos.collada.PhysicsMaterialType;
import org.khronos.collada.PlaneType;
import org.khronos.collada.RotateType;
import org.khronos.collada.ShapeType1;
import org.khronos.collada.SphereType;
import org.khronos.collada.TaperedCapsuleType;
import org.khronos.collada.TaperedCylinderType;
import org.khronos.collada.TargetableFloat;
import org.khronos.collada.TargetableFloat3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getHollow <em>Hollow</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getMass <em>Mass</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getDensity <em>Density</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getInstancePhysicsMaterial <em>Instance Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getPhysicsMaterial <em>Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getInstanceGeometry <em>Instance Geometry</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getBox <em>Box</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getSphere <em>Sphere</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getTaperedCylinder <em>Tapered Cylinder</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getCapsule <em>Capsule</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getTaperedCapsule <em>Tapered Capsule</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getTranslate <em>Translate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getRotate <em>Rotate</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ShapeType1Impl#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeType1Impl extends EObjectImpl implements ShapeType1 {
	/**
   * The cached value of the '{@link #getHollow() <em>Hollow</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHollow()
   * @generated
   * @ordered
   */
	protected HollowType1 hollow;

	/**
   * The cached value of the '{@link #getMass() <em>Mass</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMass()
   * @generated
   * @ordered
   */
	protected TargetableFloat mass;

	/**
   * The cached value of the '{@link #getDensity() <em>Density</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDensity()
   * @generated
   * @ordered
   */
	protected TargetableFloat density;

	/**
   * The cached value of the '{@link #getInstancePhysicsMaterial() <em>Instance Physics Material</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstancePhysicsMaterial()
   * @generated
   * @ordered
   */
	protected InstanceWithExtra instancePhysicsMaterial;

	/**
   * The cached value of the '{@link #getPhysicsMaterial() <em>Physics Material</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPhysicsMaterial()
   * @generated
   * @ordered
   */
	protected PhysicsMaterialType physicsMaterial;

	/**
   * The cached value of the '{@link #getInstanceGeometry() <em>Instance Geometry</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstanceGeometry()
   * @generated
   * @ordered
   */
	protected InstanceGeometryType instanceGeometry;

	/**
   * The cached value of the '{@link #getPlane() <em>Plane</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPlane()
   * @generated
   * @ordered
   */
	protected PlaneType plane;

	/**
   * The cached value of the '{@link #getBox() <em>Box</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBox()
   * @generated
   * @ordered
   */
	protected BoxType box;

	/**
   * The cached value of the '{@link #getSphere() <em>Sphere</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSphere()
   * @generated
   * @ordered
   */
	protected SphereType sphere;

	/**
   * The cached value of the '{@link #getCylinder() <em>Cylinder</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCylinder()
   * @generated
   * @ordered
   */
	protected CylinderType cylinder;

	/**
   * The cached value of the '{@link #getTaperedCylinder() <em>Tapered Cylinder</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTaperedCylinder()
   * @generated
   * @ordered
   */
	protected TaperedCylinderType taperedCylinder;

	/**
   * The cached value of the '{@link #getCapsule() <em>Capsule</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCapsule()
   * @generated
   * @ordered
   */
	protected CapsuleType capsule;

	/**
   * The cached value of the '{@link #getTaperedCapsule() <em>Tapered Capsule</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTaperedCapsule()
   * @generated
   * @ordered
   */
	protected TaperedCapsuleType taperedCapsule;

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
	protected ShapeType1Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getShapeType1();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HollowType1 getHollow() {
    return hollow;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetHollow(HollowType1 newHollow, NotificationChain msgs) {
    HollowType1 oldHollow = hollow;
    hollow = newHollow;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__HOLLOW, oldHollow, newHollow);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHollow(HollowType1 newHollow) {
    if (newHollow != hollow)
    {
      NotificationChain msgs = null;
      if (hollow != null)
        msgs = ((InternalEObject)hollow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__HOLLOW, null, msgs);
      if (newHollow != null)
        msgs = ((InternalEObject)newHollow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__HOLLOW, null, msgs);
      msgs = basicSetHollow(newHollow, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__HOLLOW, newHollow, newHollow));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getMass() {
    return mass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMass(TargetableFloat newMass, NotificationChain msgs) {
    TargetableFloat oldMass = mass;
    mass = newMass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__MASS, oldMass, newMass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMass(TargetableFloat newMass) {
    if (newMass != mass)
    {
      NotificationChain msgs = null;
      if (mass != null)
        msgs = ((InternalEObject)mass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__MASS, null, msgs);
      if (newMass != null)
        msgs = ((InternalEObject)newMass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__MASS, null, msgs);
      msgs = basicSetMass(newMass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__MASS, newMass, newMass));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat getDensity() {
    return density;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDensity(TargetableFloat newDensity, NotificationChain msgs) {
    TargetableFloat oldDensity = density;
    density = newDensity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__DENSITY, oldDensity, newDensity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDensity(TargetableFloat newDensity) {
    if (newDensity != density)
    {
      NotificationChain msgs = null;
      if (density != null)
        msgs = ((InternalEObject)density).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__DENSITY, null, msgs);
      if (newDensity != null)
        msgs = ((InternalEObject)newDensity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__DENSITY, null, msgs);
      msgs = basicSetDensity(newDensity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__DENSITY, newDensity, newDensity));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceWithExtra getInstancePhysicsMaterial() {
    return instancePhysicsMaterial;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstancePhysicsMaterial(InstanceWithExtra newInstancePhysicsMaterial, NotificationChain msgs) {
    InstanceWithExtra oldInstancePhysicsMaterial = instancePhysicsMaterial;
    instancePhysicsMaterial = newInstancePhysicsMaterial;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__INSTANCE_PHYSICS_MATERIAL, oldInstancePhysicsMaterial, newInstancePhysicsMaterial);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstancePhysicsMaterial(InstanceWithExtra newInstancePhysicsMaterial) {
    if (newInstancePhysicsMaterial != instancePhysicsMaterial)
    {
      NotificationChain msgs = null;
      if (instancePhysicsMaterial != null)
        msgs = ((InternalEObject)instancePhysicsMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__INSTANCE_PHYSICS_MATERIAL, null, msgs);
      if (newInstancePhysicsMaterial != null)
        msgs = ((InternalEObject)newInstancePhysicsMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__INSTANCE_PHYSICS_MATERIAL, null, msgs);
      msgs = basicSetInstancePhysicsMaterial(newInstancePhysicsMaterial, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__INSTANCE_PHYSICS_MATERIAL, newInstancePhysicsMaterial, newInstancePhysicsMaterial));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhysicsMaterialType getPhysicsMaterial() {
    return physicsMaterial;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPhysicsMaterial(PhysicsMaterialType newPhysicsMaterial, NotificationChain msgs) {
    PhysicsMaterialType oldPhysicsMaterial = physicsMaterial;
    physicsMaterial = newPhysicsMaterial;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__PHYSICS_MATERIAL, oldPhysicsMaterial, newPhysicsMaterial);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPhysicsMaterial(PhysicsMaterialType newPhysicsMaterial) {
    if (newPhysicsMaterial != physicsMaterial)
    {
      NotificationChain msgs = null;
      if (physicsMaterial != null)
        msgs = ((InternalEObject)physicsMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__PHYSICS_MATERIAL, null, msgs);
      if (newPhysicsMaterial != null)
        msgs = ((InternalEObject)newPhysicsMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__PHYSICS_MATERIAL, null, msgs);
      msgs = basicSetPhysicsMaterial(newPhysicsMaterial, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__PHYSICS_MATERIAL, newPhysicsMaterial, newPhysicsMaterial));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InstanceGeometryType getInstanceGeometry() {
    return instanceGeometry;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInstanceGeometry(InstanceGeometryType newInstanceGeometry, NotificationChain msgs) {
    InstanceGeometryType oldInstanceGeometry = instanceGeometry;
    instanceGeometry = newInstanceGeometry;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__INSTANCE_GEOMETRY, oldInstanceGeometry, newInstanceGeometry);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInstanceGeometry(InstanceGeometryType newInstanceGeometry) {
    if (newInstanceGeometry != instanceGeometry)
    {
      NotificationChain msgs = null;
      if (instanceGeometry != null)
        msgs = ((InternalEObject)instanceGeometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__INSTANCE_GEOMETRY, null, msgs);
      if (newInstanceGeometry != null)
        msgs = ((InternalEObject)newInstanceGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__INSTANCE_GEOMETRY, null, msgs);
      msgs = basicSetInstanceGeometry(newInstanceGeometry, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__INSTANCE_GEOMETRY, newInstanceGeometry, newInstanceGeometry));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PlaneType getPlane() {
    return plane;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetPlane(PlaneType newPlane, NotificationChain msgs) {
    PlaneType oldPlane = plane;
    plane = newPlane;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__PLANE, oldPlane, newPlane);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPlane(PlaneType newPlane) {
    if (newPlane != plane)
    {
      NotificationChain msgs = null;
      if (plane != null)
        msgs = ((InternalEObject)plane).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__PLANE, null, msgs);
      if (newPlane != null)
        msgs = ((InternalEObject)newPlane).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__PLANE, null, msgs);
      msgs = basicSetPlane(newPlane, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__PLANE, newPlane, newPlane));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BoxType getBox() {
    return box;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetBox(BoxType newBox, NotificationChain msgs) {
    BoxType oldBox = box;
    box = newBox;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__BOX, oldBox, newBox);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBox(BoxType newBox) {
    if (newBox != box)
    {
      NotificationChain msgs = null;
      if (box != null)
        msgs = ((InternalEObject)box).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__BOX, null, msgs);
      if (newBox != null)
        msgs = ((InternalEObject)newBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__BOX, null, msgs);
      msgs = basicSetBox(newBox, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__BOX, newBox, newBox));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SphereType getSphere() {
    return sphere;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSphere(SphereType newSphere, NotificationChain msgs) {
    SphereType oldSphere = sphere;
    sphere = newSphere;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__SPHERE, oldSphere, newSphere);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSphere(SphereType newSphere) {
    if (newSphere != sphere)
    {
      NotificationChain msgs = null;
      if (sphere != null)
        msgs = ((InternalEObject)sphere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__SPHERE, null, msgs);
      if (newSphere != null)
        msgs = ((InternalEObject)newSphere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__SPHERE, null, msgs);
      msgs = basicSetSphere(newSphere, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__SPHERE, newSphere, newSphere));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CylinderType getCylinder() {
    return cylinder;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetCylinder(CylinderType newCylinder, NotificationChain msgs) {
    CylinderType oldCylinder = cylinder;
    cylinder = newCylinder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__CYLINDER, oldCylinder, newCylinder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCylinder(CylinderType newCylinder) {
    if (newCylinder != cylinder)
    {
      NotificationChain msgs = null;
      if (cylinder != null)
        msgs = ((InternalEObject)cylinder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__CYLINDER, null, msgs);
      if (newCylinder != null)
        msgs = ((InternalEObject)newCylinder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__CYLINDER, null, msgs);
      msgs = basicSetCylinder(newCylinder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__CYLINDER, newCylinder, newCylinder));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TaperedCylinderType getTaperedCylinder() {
    return taperedCylinder;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTaperedCylinder(TaperedCylinderType newTaperedCylinder, NotificationChain msgs) {
    TaperedCylinderType oldTaperedCylinder = taperedCylinder;
    taperedCylinder = newTaperedCylinder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__TAPERED_CYLINDER, oldTaperedCylinder, newTaperedCylinder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTaperedCylinder(TaperedCylinderType newTaperedCylinder) {
    if (newTaperedCylinder != taperedCylinder)
    {
      NotificationChain msgs = null;
      if (taperedCylinder != null)
        msgs = ((InternalEObject)taperedCylinder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__TAPERED_CYLINDER, null, msgs);
      if (newTaperedCylinder != null)
        msgs = ((InternalEObject)newTaperedCylinder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__TAPERED_CYLINDER, null, msgs);
      msgs = basicSetTaperedCylinder(newTaperedCylinder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__TAPERED_CYLINDER, newTaperedCylinder, newTaperedCylinder));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CapsuleType getCapsule() {
    return capsule;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetCapsule(CapsuleType newCapsule, NotificationChain msgs) {
    CapsuleType oldCapsule = capsule;
    capsule = newCapsule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__CAPSULE, oldCapsule, newCapsule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCapsule(CapsuleType newCapsule) {
    if (newCapsule != capsule)
    {
      NotificationChain msgs = null;
      if (capsule != null)
        msgs = ((InternalEObject)capsule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__CAPSULE, null, msgs);
      if (newCapsule != null)
        msgs = ((InternalEObject)newCapsule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__CAPSULE, null, msgs);
      msgs = basicSetCapsule(newCapsule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__CAPSULE, newCapsule, newCapsule));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TaperedCapsuleType getTaperedCapsule() {
    return taperedCapsule;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTaperedCapsule(TaperedCapsuleType newTaperedCapsule, NotificationChain msgs) {
    TaperedCapsuleType oldTaperedCapsule = taperedCapsule;
    taperedCapsule = newTaperedCapsule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__TAPERED_CAPSULE, oldTaperedCapsule, newTaperedCapsule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTaperedCapsule(TaperedCapsuleType newTaperedCapsule) {
    if (newTaperedCapsule != taperedCapsule)
    {
      NotificationChain msgs = null;
      if (taperedCapsule != null)
        msgs = ((InternalEObject)taperedCapsule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__TAPERED_CAPSULE, null, msgs);
      if (newTaperedCapsule != null)
        msgs = ((InternalEObject)newTaperedCapsule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.SHAPE_TYPE1__TAPERED_CAPSULE, null, msgs);
      msgs = basicSetTaperedCapsule(newTaperedCapsule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.SHAPE_TYPE1__TAPERED_CAPSULE, newTaperedCapsule, newTaperedCapsule));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getGroup() {
    if (group == null)
    {
      group = new BasicFeatureMap(this, ColladaPackage.SHAPE_TYPE1__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TargetableFloat3> getTranslate() {
    return getGroup().list(ColladaPackage.eINSTANCE.getShapeType1_Translate());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<RotateType> getRotate() {
    return getGroup().list(ColladaPackage.eINSTANCE.getShapeType1_Rotate());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.SHAPE_TYPE1__EXTRA);
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
      case ColladaPackage.SHAPE_TYPE1__HOLLOW:
        return basicSetHollow(null, msgs);
      case ColladaPackage.SHAPE_TYPE1__MASS:
        return basicSetMass(null, msgs);
      case ColladaPackage.SHAPE_TYPE1__DENSITY:
        return basicSetDensity(null, msgs);
      case ColladaPackage.SHAPE_TYPE1__INSTANCE_PHYSICS_MATERIAL:
        return basicSetInstancePhysicsMaterial(null, msgs);
      case ColladaPackage.SHAPE_TYPE1__PHYSICS_MATERIAL:
        return basicSetPhysicsMaterial(null, msgs);
      case ColladaPackage.SHAPE_TYPE1__INSTANCE_GEOMETRY:
        return basicSetInstanceGeometry(null, msgs);
      case ColladaPackage.SHAPE_TYPE1__PLANE:
        return basicSetPlane(null, msgs);
      case ColladaPackage.SHAPE_TYPE1__BOX:
        return basicSetBox(null, msgs);
      case ColladaPackage.SHAPE_TYPE1__SPHERE:
        return basicSetSphere(null, msgs);
      case ColladaPackage.SHAPE_TYPE1__CYLINDER:
        return basicSetCylinder(null, msgs);
      case ColladaPackage.SHAPE_TYPE1__TAPERED_CYLINDER:
        return basicSetTaperedCylinder(null, msgs);
      case ColladaPackage.SHAPE_TYPE1__CAPSULE:
        return basicSetCapsule(null, msgs);
      case ColladaPackage.SHAPE_TYPE1__TAPERED_CAPSULE:
        return basicSetTaperedCapsule(null, msgs);
      case ColladaPackage.SHAPE_TYPE1__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ColladaPackage.SHAPE_TYPE1__TRANSLATE:
        return ((InternalEList<?>)getTranslate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.SHAPE_TYPE1__ROTATE:
        return ((InternalEList<?>)getRotate()).basicRemove(otherEnd, msgs);
      case ColladaPackage.SHAPE_TYPE1__EXTRA:
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
      case ColladaPackage.SHAPE_TYPE1__HOLLOW:
        return getHollow();
      case ColladaPackage.SHAPE_TYPE1__MASS:
        return getMass();
      case ColladaPackage.SHAPE_TYPE1__DENSITY:
        return getDensity();
      case ColladaPackage.SHAPE_TYPE1__INSTANCE_PHYSICS_MATERIAL:
        return getInstancePhysicsMaterial();
      case ColladaPackage.SHAPE_TYPE1__PHYSICS_MATERIAL:
        return getPhysicsMaterial();
      case ColladaPackage.SHAPE_TYPE1__INSTANCE_GEOMETRY:
        return getInstanceGeometry();
      case ColladaPackage.SHAPE_TYPE1__PLANE:
        return getPlane();
      case ColladaPackage.SHAPE_TYPE1__BOX:
        return getBox();
      case ColladaPackage.SHAPE_TYPE1__SPHERE:
        return getSphere();
      case ColladaPackage.SHAPE_TYPE1__CYLINDER:
        return getCylinder();
      case ColladaPackage.SHAPE_TYPE1__TAPERED_CYLINDER:
        return getTaperedCylinder();
      case ColladaPackage.SHAPE_TYPE1__CAPSULE:
        return getCapsule();
      case ColladaPackage.SHAPE_TYPE1__TAPERED_CAPSULE:
        return getTaperedCapsule();
      case ColladaPackage.SHAPE_TYPE1__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ColladaPackage.SHAPE_TYPE1__TRANSLATE:
        return getTranslate();
      case ColladaPackage.SHAPE_TYPE1__ROTATE:
        return getRotate();
      case ColladaPackage.SHAPE_TYPE1__EXTRA:
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
      case ColladaPackage.SHAPE_TYPE1__HOLLOW:
        setHollow((HollowType1)newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__MASS:
        setMass((TargetableFloat)newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__DENSITY:
        setDensity((TargetableFloat)newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__INSTANCE_PHYSICS_MATERIAL:
        setInstancePhysicsMaterial((InstanceWithExtra)newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__PHYSICS_MATERIAL:
        setPhysicsMaterial((PhysicsMaterialType)newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__INSTANCE_GEOMETRY:
        setInstanceGeometry((InstanceGeometryType)newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__PLANE:
        setPlane((PlaneType)newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__BOX:
        setBox((BoxType)newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__SPHERE:
        setSphere((SphereType)newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__CYLINDER:
        setCylinder((CylinderType)newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__TAPERED_CYLINDER:
        setTaperedCylinder((TaperedCylinderType)newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__CAPSULE:
        setCapsule((CapsuleType)newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__TAPERED_CAPSULE:
        setTaperedCapsule((TaperedCapsuleType)newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__TRANSLATE:
        getTranslate().clear();
        getTranslate().addAll((Collection<? extends TargetableFloat3>)newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__ROTATE:
        getRotate().clear();
        getRotate().addAll((Collection<? extends RotateType>)newValue);
        return;
      case ColladaPackage.SHAPE_TYPE1__EXTRA:
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
      case ColladaPackage.SHAPE_TYPE1__HOLLOW:
        setHollow((HollowType1)null);
        return;
      case ColladaPackage.SHAPE_TYPE1__MASS:
        setMass((TargetableFloat)null);
        return;
      case ColladaPackage.SHAPE_TYPE1__DENSITY:
        setDensity((TargetableFloat)null);
        return;
      case ColladaPackage.SHAPE_TYPE1__INSTANCE_PHYSICS_MATERIAL:
        setInstancePhysicsMaterial((InstanceWithExtra)null);
        return;
      case ColladaPackage.SHAPE_TYPE1__PHYSICS_MATERIAL:
        setPhysicsMaterial((PhysicsMaterialType)null);
        return;
      case ColladaPackage.SHAPE_TYPE1__INSTANCE_GEOMETRY:
        setInstanceGeometry((InstanceGeometryType)null);
        return;
      case ColladaPackage.SHAPE_TYPE1__PLANE:
        setPlane((PlaneType)null);
        return;
      case ColladaPackage.SHAPE_TYPE1__BOX:
        setBox((BoxType)null);
        return;
      case ColladaPackage.SHAPE_TYPE1__SPHERE:
        setSphere((SphereType)null);
        return;
      case ColladaPackage.SHAPE_TYPE1__CYLINDER:
        setCylinder((CylinderType)null);
        return;
      case ColladaPackage.SHAPE_TYPE1__TAPERED_CYLINDER:
        setTaperedCylinder((TaperedCylinderType)null);
        return;
      case ColladaPackage.SHAPE_TYPE1__CAPSULE:
        setCapsule((CapsuleType)null);
        return;
      case ColladaPackage.SHAPE_TYPE1__TAPERED_CAPSULE:
        setTaperedCapsule((TaperedCapsuleType)null);
        return;
      case ColladaPackage.SHAPE_TYPE1__GROUP:
        getGroup().clear();
        return;
      case ColladaPackage.SHAPE_TYPE1__TRANSLATE:
        getTranslate().clear();
        return;
      case ColladaPackage.SHAPE_TYPE1__ROTATE:
        getRotate().clear();
        return;
      case ColladaPackage.SHAPE_TYPE1__EXTRA:
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
      case ColladaPackage.SHAPE_TYPE1__HOLLOW:
        return hollow != null;
      case ColladaPackage.SHAPE_TYPE1__MASS:
        return mass != null;
      case ColladaPackage.SHAPE_TYPE1__DENSITY:
        return density != null;
      case ColladaPackage.SHAPE_TYPE1__INSTANCE_PHYSICS_MATERIAL:
        return instancePhysicsMaterial != null;
      case ColladaPackage.SHAPE_TYPE1__PHYSICS_MATERIAL:
        return physicsMaterial != null;
      case ColladaPackage.SHAPE_TYPE1__INSTANCE_GEOMETRY:
        return instanceGeometry != null;
      case ColladaPackage.SHAPE_TYPE1__PLANE:
        return plane != null;
      case ColladaPackage.SHAPE_TYPE1__BOX:
        return box != null;
      case ColladaPackage.SHAPE_TYPE1__SPHERE:
        return sphere != null;
      case ColladaPackage.SHAPE_TYPE1__CYLINDER:
        return cylinder != null;
      case ColladaPackage.SHAPE_TYPE1__TAPERED_CYLINDER:
        return taperedCylinder != null;
      case ColladaPackage.SHAPE_TYPE1__CAPSULE:
        return capsule != null;
      case ColladaPackage.SHAPE_TYPE1__TAPERED_CAPSULE:
        return taperedCapsule != null;
      case ColladaPackage.SHAPE_TYPE1__GROUP:
        return group != null && !group.isEmpty();
      case ColladaPackage.SHAPE_TYPE1__TRANSLATE:
        return !getTranslate().isEmpty();
      case ColladaPackage.SHAPE_TYPE1__ROTATE:
        return !getRotate().isEmpty();
      case ColladaPackage.SHAPE_TYPE1__EXTRA:
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
    result.append(" (group: ");
    result.append(group);
    result.append(')');
    return result.toString();
  }

} //ShapeType1Impl
