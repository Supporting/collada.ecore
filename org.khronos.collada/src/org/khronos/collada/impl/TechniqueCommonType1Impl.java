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
import org.khronos.collada.DynamicType1;
import org.khronos.collada.InstanceWithExtra;
import org.khronos.collada.MassFrameType1;
import org.khronos.collada.PhysicsMaterialType;
import org.khronos.collada.ShapeType1;
import org.khronos.collada.TargetableFloat;
import org.khronos.collada.TargetableFloat3;
import org.khronos.collada.TechniqueCommonType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technique Common Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType1Impl#getDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType1Impl#getMass <em>Mass</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType1Impl#getMassFrame <em>Mass Frame</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType1Impl#getInertia <em>Inertia</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType1Impl#getInstancePhysicsMaterial <em>Instance Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType1Impl#getPhysicsMaterial <em>Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.impl.TechniqueCommonType1Impl#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechniqueCommonType1Impl extends EObjectImpl implements TechniqueCommonType1 {
	/**
   * The cached value of the '{@link #getDynamic() <em>Dynamic</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDynamic()
   * @generated
   * @ordered
   */
	protected DynamicType1 dynamic;

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
	protected MassFrameType1 massFrame;

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
	protected EList<ShapeType1> shape;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TechniqueCommonType1Impl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getTechniqueCommonType1();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DynamicType1 getDynamic() {
    return dynamic;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDynamic(DynamicType1 newDynamic, NotificationChain msgs) {
    DynamicType1 oldDynamic = dynamic;
    dynamic = newDynamic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE1__DYNAMIC, oldDynamic, newDynamic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDynamic(DynamicType1 newDynamic) {
    if (newDynamic != dynamic)
    {
      NotificationChain msgs = null;
      if (dynamic != null)
        msgs = ((InternalEObject)dynamic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE1__DYNAMIC, null, msgs);
      if (newDynamic != null)
        msgs = ((InternalEObject)newDynamic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE1__DYNAMIC, null, msgs);
      msgs = basicSetDynamic(newDynamic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE1__DYNAMIC, newDynamic, newDynamic));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS, oldMass, newMass);
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
        msgs = ((InternalEObject)mass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS, null, msgs);
      if (newMass != null)
        msgs = ((InternalEObject)newMass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS, null, msgs);
      msgs = basicSetMass(newMass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS, newMass, newMass));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MassFrameType1 getMassFrame() {
    return massFrame;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMassFrame(MassFrameType1 newMassFrame, NotificationChain msgs) {
    MassFrameType1 oldMassFrame = massFrame;
    massFrame = newMassFrame;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS_FRAME, oldMassFrame, newMassFrame);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMassFrame(MassFrameType1 newMassFrame) {
    if (newMassFrame != massFrame)
    {
      NotificationChain msgs = null;
      if (massFrame != null)
        msgs = ((InternalEObject)massFrame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS_FRAME, null, msgs);
      if (newMassFrame != null)
        msgs = ((InternalEObject)newMassFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS_FRAME, null, msgs);
      msgs = basicSetMassFrame(newMassFrame, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS_FRAME, newMassFrame, newMassFrame));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE1__INERTIA, oldInertia, newInertia);
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
        msgs = ((InternalEObject)inertia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE1__INERTIA, null, msgs);
      if (newInertia != null)
        msgs = ((InternalEObject)newInertia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE1__INERTIA, null, msgs);
      msgs = basicSetInertia(newInertia, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE1__INERTIA, newInertia, newInertia));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE1__INSTANCE_PHYSICS_MATERIAL, oldInstancePhysicsMaterial, newInstancePhysicsMaterial);
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
        msgs = ((InternalEObject)instancePhysicsMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE1__INSTANCE_PHYSICS_MATERIAL, null, msgs);
      if (newInstancePhysicsMaterial != null)
        msgs = ((InternalEObject)newInstancePhysicsMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE1__INSTANCE_PHYSICS_MATERIAL, null, msgs);
      msgs = basicSetInstancePhysicsMaterial(newInstancePhysicsMaterial, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE1__INSTANCE_PHYSICS_MATERIAL, newInstancePhysicsMaterial, newInstancePhysicsMaterial));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE1__PHYSICS_MATERIAL, oldPhysicsMaterial, newPhysicsMaterial);
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
        msgs = ((InternalEObject)physicsMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE1__PHYSICS_MATERIAL, null, msgs);
      if (newPhysicsMaterial != null)
        msgs = ((InternalEObject)newPhysicsMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.TECHNIQUE_COMMON_TYPE1__PHYSICS_MATERIAL, null, msgs);
      msgs = basicSetPhysicsMaterial(newPhysicsMaterial, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.TECHNIQUE_COMMON_TYPE1__PHYSICS_MATERIAL, newPhysicsMaterial, newPhysicsMaterial));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ShapeType1> getShape() {
    if (shape == null)
    {
      shape = new EObjectContainmentEList<ShapeType1>(ShapeType1.class, this, ColladaPackage.TECHNIQUE_COMMON_TYPE1__SHAPE);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__DYNAMIC:
        return basicSetDynamic(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS:
        return basicSetMass(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS_FRAME:
        return basicSetMassFrame(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__INERTIA:
        return basicSetInertia(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__INSTANCE_PHYSICS_MATERIAL:
        return basicSetInstancePhysicsMaterial(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__PHYSICS_MATERIAL:
        return basicSetPhysicsMaterial(null, msgs);
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__SHAPE:
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__DYNAMIC:
        return getDynamic();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS:
        return getMass();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS_FRAME:
        return getMassFrame();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__INERTIA:
        return getInertia();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__INSTANCE_PHYSICS_MATERIAL:
        return getInstancePhysicsMaterial();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__PHYSICS_MATERIAL:
        return getPhysicsMaterial();
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__SHAPE:
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__DYNAMIC:
        setDynamic((DynamicType1)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS:
        setMass((TargetableFloat)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS_FRAME:
        setMassFrame((MassFrameType1)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__INERTIA:
        setInertia((TargetableFloat3)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__INSTANCE_PHYSICS_MATERIAL:
        setInstancePhysicsMaterial((InstanceWithExtra)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__PHYSICS_MATERIAL:
        setPhysicsMaterial((PhysicsMaterialType)newValue);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__SHAPE:
        getShape().clear();
        getShape().addAll((Collection<? extends ShapeType1>)newValue);
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__DYNAMIC:
        setDynamic((DynamicType1)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS:
        setMass((TargetableFloat)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS_FRAME:
        setMassFrame((MassFrameType1)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__INERTIA:
        setInertia((TargetableFloat3)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__INSTANCE_PHYSICS_MATERIAL:
        setInstancePhysicsMaterial((InstanceWithExtra)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__PHYSICS_MATERIAL:
        setPhysicsMaterial((PhysicsMaterialType)null);
        return;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__SHAPE:
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
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__DYNAMIC:
        return dynamic != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS:
        return mass != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__MASS_FRAME:
        return massFrame != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__INERTIA:
        return inertia != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__INSTANCE_PHYSICS_MATERIAL:
        return instancePhysicsMaterial != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__PHYSICS_MATERIAL:
        return physicsMaterial != null;
      case ColladaPackage.TECHNIQUE_COMMON_TYPE1__SHAPE:
        return shape != null && !shape.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TechniqueCommonType1Impl
