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

import org.khronos.collada.ColladaFactory;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.OrthographicType;
import org.khronos.collada.PerspectiveType;
import org.khronos.collada.DynamicType;
import org.khronos.collada.InstanceWithExtra;
import org.khronos.collada.MassFrameType;
import org.khronos.collada.PhysicsMaterialType;
import org.khronos.collada.ShapeType;
import org.khronos.collada.TargetableFloat;
import org.khronos.collada.TargetableFloat3;
import org.khronos.collada.TechniqueCommonType6;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technique Common Type6</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType6Impl#getAngularVelocity <em>Angular Velocity</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType6Impl#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType6Impl#getDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType6Impl#getMass <em>Mass</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType6Impl#getMassFrame <em>Mass Frame</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType6Impl#getInertia <em>Inertia</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType6Impl#getInstancePhysicsMaterial <em>Instance Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType6Impl#getPhysicsMaterial <em>Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType6Impl#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechniqueCommonType6Impl extends EObjectImpl implements TechniqueCommonType6 {
	/**
   * The default value of the '{@link #getAngularVelocity() <em>Angular Velocity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAngularVelocity()
   * @generated
   * @ordered
   */
	@SuppressWarnings("unchecked")
	protected static final List<Double> ANGULAR_VELOCITY_EDEFAULT = (List<Double>)ColladaFactory.eINSTANCE.createFromString(ColladaPackage.eINSTANCE.getFloat3(), "0.0 0.0 0.0");

	/**
   * The cached value of the '{@link #getAngularVelocity() <em>Angular Velocity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAngularVelocity()
   * @generated
   * @ordered
   */
	protected List<Double> angularVelocity = ANGULAR_VELOCITY_EDEFAULT;

	/**
   * This is true if the Angular Velocity attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean angularVelocityESet;

	/**
   * The default value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVelocity()
   * @generated
   * @ordered
   */
	@SuppressWarnings("unchecked")
	protected static final List<Double> VELOCITY_EDEFAULT = (List<Double>)ColladaFactory.eINSTANCE.createFromString(ColladaPackage.eINSTANCE.getFloat3(), "0.0 0.0 0.0");

	/**
   * The cached value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVelocity()
   * @generated
   * @ordered
   */
	protected List<Double> velocity = VELOCITY_EDEFAULT;

	/**
   * This is true if the Velocity attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean velocityESet;

	/**
   * The cached value of the '{@link #getDynamic() <em>Dynamic</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDynamic()
   * @generated
   * @ordered
   */
	protected DynamicType dynamic;

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
   * The cached value of the '{@link #getMassFrame() <em>Mass Frame</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMassFrame()
   * @generated
   * @ordered
   */
	protected MassFrameType massFrame;

	/**
   * The cached value of the '{@link #getInertia() <em>Inertia</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInertia()
   * @generated
   * @ordered
   */
	protected TargetableFloat3 inertia;

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
   * The cached value of the '{@link #getShape() <em>Shape</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
	protected EList<ShapeType> shape;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TechniqueCommonType6Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTechniqueCommonType6();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getAngularVelocity() {
    return angularVelocity;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAngularVelocity(List<Double> newAngularVelocity) {
    List<Double> oldAngularVelocity = angularVelocity;
    angularVelocity = newAngularVelocity;
    boolean oldAngularVelocityESet = angularVelocityESet;
    angularVelocityESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__ANGULAR_VELOCITY, oldAngularVelocity, angularVelocity, !oldAngularVelocityESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetAngularVelocity() {
    List<Double> oldAngularVelocity = angularVelocity;
    boolean oldAngularVelocityESet = angularVelocityESet;
    angularVelocity = ANGULAR_VELOCITY_EDEFAULT;
    angularVelocityESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__ANGULAR_VELOCITY, oldAngularVelocity, ANGULAR_VELOCITY_EDEFAULT, oldAngularVelocityESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetAngularVelocity() {
    return angularVelocityESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<Double> getVelocity() {
    return velocity;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setVelocity(List<Double> newVelocity) {
    List<Double> oldVelocity = velocity;
    velocity = newVelocity;
    boolean oldVelocityESet = velocityESet;
    velocityESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__VELOCITY, oldVelocity, velocity, !oldVelocityESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetVelocity() {
    List<Double> oldVelocity = velocity;
    boolean oldVelocityESet = velocityESet;
    velocity = VELOCITY_EDEFAULT;
    velocityESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__VELOCITY, oldVelocity, VELOCITY_EDEFAULT, oldVelocityESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetVelocity() {
    return velocityESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DynamicType getDynamic() {
    return dynamic;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDynamic(DynamicType newDynamic, NotificationChain msgs) {
    DynamicType oldDynamic = dynamic;
    dynamic = newDynamic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__DYNAMIC, oldDynamic, newDynamic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDynamic(DynamicType newDynamic) {
    if (newDynamic != dynamic)
    {
      NotificationChain msgs = null;
      if (dynamic != null)
        msgs = ((InternalEObject)dynamic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE6__DYNAMIC, null, msgs);
      if (newDynamic != null)
        msgs = ((InternalEObject)newDynamic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE6__DYNAMIC, null, msgs);
      msgs = basicSetDynamic(newDynamic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__DYNAMIC, newDynamic, newDynamic));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS, oldMass, newMass);
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
        msgs = ((InternalEObject)mass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS, null, msgs);
      if (newMass != null)
        msgs = ((InternalEObject)newMass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS, null, msgs);
      msgs = basicSetMass(newMass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS, newMass, newMass));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MassFrameType getMassFrame() {
    return massFrame;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMassFrame(MassFrameType newMassFrame, NotificationChain msgs) {
    MassFrameType oldMassFrame = massFrame;
    massFrame = newMassFrame;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS_FRAME, oldMassFrame, newMassFrame);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMassFrame(MassFrameType newMassFrame) {
    if (newMassFrame != massFrame)
    {
      NotificationChain msgs = null;
      if (massFrame != null)
        msgs = ((InternalEObject)massFrame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS_FRAME, null, msgs);
      if (newMassFrame != null)
        msgs = ((InternalEObject)newMassFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS_FRAME, null, msgs);
      msgs = basicSetMassFrame(newMassFrame, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS_FRAME, newMassFrame, newMassFrame));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TargetableFloat3 getInertia() {
    return inertia;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetInertia(TargetableFloat3 newInertia, NotificationChain msgs) {
    TargetableFloat3 oldInertia = inertia;
    inertia = newInertia;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__INERTIA, oldInertia, newInertia);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInertia(TargetableFloat3 newInertia) {
    if (newInertia != inertia)
    {
      NotificationChain msgs = null;
      if (inertia != null)
        msgs = ((InternalEObject)inertia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE6__INERTIA, null, msgs);
      if (newInertia != null)
        msgs = ((InternalEObject)newInertia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE6__INERTIA, null, msgs);
      msgs = basicSetInertia(newInertia, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__INERTIA, newInertia, newInertia));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__INSTANCE_PHYSICS_MATERIAL, oldInstancePhysicsMaterial, newInstancePhysicsMaterial);
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
        msgs = ((InternalEObject)instancePhysicsMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE6__INSTANCE_PHYSICS_MATERIAL, null, msgs);
      if (newInstancePhysicsMaterial != null)
        msgs = ((InternalEObject)newInstancePhysicsMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE6__INSTANCE_PHYSICS_MATERIAL, null, msgs);
      msgs = basicSetInstancePhysicsMaterial(newInstancePhysicsMaterial, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__INSTANCE_PHYSICS_MATERIAL, newInstancePhysicsMaterial, newInstancePhysicsMaterial));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__PHYSICS_MATERIAL, oldPhysicsMaterial, newPhysicsMaterial);
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
        msgs = ((InternalEObject)physicsMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE6__PHYSICS_MATERIAL, null, msgs);
      if (newPhysicsMaterial != null)
        msgs = ((InternalEObject)newPhysicsMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE6__PHYSICS_MATERIAL, null, msgs);
      msgs = basicSetPhysicsMaterial(newPhysicsMaterial, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE6__PHYSICS_MATERIAL, newPhysicsMaterial, newPhysicsMaterial));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ShapeType> getShape() {
    if (shape == null)
    {
      shape = new EObjectContainmentEList<ShapeType>(ShapeType.class, this, ColladaPackage.TECHNIQUE_COMMON_TYPE6__SHAPE);
    }
    return shape;
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__DYNAMIC:
        return basicSetDynamic(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS:
        return basicSetMass(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS_FRAME:
        return basicSetMassFrame(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__INERTIA:
        return basicSetInertia(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__INSTANCE_PHYSICS_MATERIAL:
        return basicSetInstancePhysicsMaterial(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__PHYSICS_MATERIAL:
        return basicSetPhysicsMaterial(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__SHAPE:
        return ((InternalEList<?>)getShape()).basicRemove(otherEnd, msgs);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__ANGULAR_VELOCITY:
        return getAngularVelocity();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__VELOCITY:
        return getVelocity();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__DYNAMIC:
        return getDynamic();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS:
        return getMass();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS_FRAME:
        return getMassFrame();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__INERTIA:
        return getInertia();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__INSTANCE_PHYSICS_MATERIAL:
        return getInstancePhysicsMaterial();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__PHYSICS_MATERIAL:
        return getPhysicsMaterial();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__SHAPE:
        return getShape();
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__ANGULAR_VELOCITY:
        setAngularVelocity((List<Double>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__VELOCITY:
        setVelocity((List<Double>)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__DYNAMIC:
        setDynamic((DynamicType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS:
        setMass((TargetableFloat)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS_FRAME:
        setMassFrame((MassFrameType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__INERTIA:
        setInertia((TargetableFloat3)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__INSTANCE_PHYSICS_MATERIAL:
        setInstancePhysicsMaterial((InstanceWithExtra)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__PHYSICS_MATERIAL:
        setPhysicsMaterial((PhysicsMaterialType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__SHAPE:
        getShape().clear();
        getShape().addAll((Collection<? extends ShapeType>)newValue);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__ANGULAR_VELOCITY:
        unsetAngularVelocity();
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__VELOCITY:
        unsetVelocity();
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__DYNAMIC:
        setDynamic((DynamicType)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS:
        setMass((TargetableFloat)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS_FRAME:
        setMassFrame((MassFrameType)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__INERTIA:
        setInertia((TargetableFloat3)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__INSTANCE_PHYSICS_MATERIAL:
        setInstancePhysicsMaterial((InstanceWithExtra)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__PHYSICS_MATERIAL:
        setPhysicsMaterial((PhysicsMaterialType)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__SHAPE:
        getShape().clear();
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__ANGULAR_VELOCITY:
        return isSetAngularVelocity();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__VELOCITY:
        return isSetVelocity();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__DYNAMIC:
        return dynamic != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS:
        return mass != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__MASS_FRAME:
        return massFrame != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__INERTIA:
        return inertia != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__INSTANCE_PHYSICS_MATERIAL:
        return instancePhysicsMaterial != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__PHYSICS_MATERIAL:
        return physicsMaterial != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE6__SHAPE:
        return shape != null && !shape.isEmpty();
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
    result.append(" (angularVelocity: ");
    if (angularVelocityESet) result.append(angularVelocity); else result.append("<unset>");
    result.append(", velocity: ");
    if (velocityESet) result.append(velocity); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //TechniqueCommonType6Impl
