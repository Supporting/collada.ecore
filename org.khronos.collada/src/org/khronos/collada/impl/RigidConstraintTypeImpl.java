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

import org.khronos.collada.AttachmentType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.RefAttachmentType;
import org.khronos.collada.RigidConstraintType;
import org.khronos.collada.TechniqueCommonType3;
import org.khronos.collada.TechniqueCommonType;
import org.khronos.collada.TechniqueType4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rigid Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.RigidConstraintTypeImpl#getRefAttachment <em>Ref Attachment</em>}</li>
 *   <li>{@link org.khronos.collada.impl.RigidConstraintTypeImpl#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link org.khronos.collada.impl.RigidConstraintTypeImpl#getTechniqueCommon <em>Technique Common</em>}</li>
 *   <li>{@link org.khronos.collada.impl.RigidConstraintTypeImpl#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.impl.RigidConstraintTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.RigidConstraintTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.impl.RigidConstraintTypeImpl#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RigidConstraintTypeImpl extends EObjectImpl implements RigidConstraintType {
	/**
   * The cached value of the '{@link #getRefAttachment() <em>Ref Attachment</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRefAttachment()
   * @generated
   * @ordered
   */
	protected RefAttachmentType refAttachment;

	/**
   * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAttachment()
   * @generated
   * @ordered
   */
	protected AttachmentType attachment;

	/**
   * The cached value of the '{@link #getTechniqueCommon() <em>Technique Common</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTechniqueCommon()
   * @generated
   * @ordered
   */
	protected TechniqueCommonType techniqueCommon;

	/**
   * The cached value of the '{@link #getTechnique() <em>Technique</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTechnique()
   * @generated
   * @ordered
   */
	protected EList<TechniqueType4> technique;

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
	protected RigidConstraintTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getRigidConstraintType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RefAttachmentType getRefAttachment() {
    return refAttachment;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRefAttachment(RefAttachmentType newRefAttachment, NotificationChain msgs) {
    RefAttachmentType oldRefAttachment = refAttachment;
    refAttachment = newRefAttachment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.RIGID_CONSTRAINT_TYPE__REF_ATTACHMENT, oldRefAttachment, newRefAttachment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRefAttachment(RefAttachmentType newRefAttachment) {
    if (newRefAttachment != refAttachment)
    {
      NotificationChain msgs = null;
      if (refAttachment != null)
        msgs = ((InternalEObject)refAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.RIGID_CONSTRAINT_TYPE__REF_ATTACHMENT, null, msgs);
      if (newRefAttachment != null)
        msgs = ((InternalEObject)newRefAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.RIGID_CONSTRAINT_TYPE__REF_ATTACHMENT, null, msgs);
      msgs = basicSetRefAttachment(newRefAttachment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.RIGID_CONSTRAINT_TYPE__REF_ATTACHMENT, newRefAttachment, newRefAttachment));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AttachmentType getAttachment() {
    return attachment;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAttachment(AttachmentType newAttachment, NotificationChain msgs) {
    AttachmentType oldAttachment = attachment;
    attachment = newAttachment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.RIGID_CONSTRAINT_TYPE__ATTACHMENT, oldAttachment, newAttachment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAttachment(AttachmentType newAttachment) {
    if (newAttachment != attachment)
    {
      NotificationChain msgs = null;
      if (attachment != null)
        msgs = ((InternalEObject)attachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.RIGID_CONSTRAINT_TYPE__ATTACHMENT, null, msgs);
      if (newAttachment != null)
        msgs = ((InternalEObject)newAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.RIGID_CONSTRAINT_TYPE__ATTACHMENT, null, msgs);
      msgs = basicSetAttachment(newAttachment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.RIGID_CONSTRAINT_TYPE__ATTACHMENT, newAttachment, newAttachment));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TechniqueCommonType getTechniqueCommon() {
    return techniqueCommon;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTechniqueCommon(TechniqueCommonType newTechniqueCommon, NotificationChain msgs) {
    TechniqueCommonType oldTechniqueCommon = techniqueCommon;
    techniqueCommon = newTechniqueCommon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.RIGID_CONSTRAINT_TYPE__TECHNIQUE_COMMON, oldTechniqueCommon, newTechniqueCommon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTechniqueCommon(TechniqueCommonType newTechniqueCommon) {
    if (newTechniqueCommon != techniqueCommon)
    {
      NotificationChain msgs = null;
      if (techniqueCommon != null)
        msgs = ((InternalEObject)techniqueCommon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.RIGID_CONSTRAINT_TYPE__TECHNIQUE_COMMON, null, msgs);
      if (newTechniqueCommon != null)
        msgs = ((InternalEObject)newTechniqueCommon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.RIGID_CONSTRAINT_TYPE__TECHNIQUE_COMMON, null, msgs);
      msgs = basicSetTechniqueCommon(newTechniqueCommon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.RIGID_CONSTRAINT_TYPE__TECHNIQUE_COMMON, newTechniqueCommon, newTechniqueCommon));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<TechniqueType4> getTechnique() {
    if (technique == null)
    {
      technique = new EObjectContainmentEList<TechniqueType4>(TechniqueType4.class, this, ColladaPackage.RIGID_CONSTRAINT_TYPE__TECHNIQUE);
    }
    return technique;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.RIGID_CONSTRAINT_TYPE__EXTRA);
    }
    return extra;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.RIGID_CONSTRAINT_TYPE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.RIGID_CONSTRAINT_TYPE__SID, oldSid, sid));
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
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__REF_ATTACHMENT:
        return basicSetRefAttachment(null, msgs);
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__ATTACHMENT:
        return basicSetAttachment(null, msgs);
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__TECHNIQUE_COMMON:
        return basicSetTechniqueCommon(null, msgs);
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__TECHNIQUE:
        return ((InternalEList<?>)getTechnique()).basicRemove(otherEnd, msgs);
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__EXTRA:
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
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__REF_ATTACHMENT:
        return getRefAttachment();
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__ATTACHMENT:
        return getAttachment();
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__TECHNIQUE_COMMON:
        return getTechniqueCommon();
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__TECHNIQUE:
        return getTechnique();
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__NAME:
        return getName();
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__SID:
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
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__REF_ATTACHMENT:
        setRefAttachment((RefAttachmentType)newValue);
        return;
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__ATTACHMENT:
        setAttachment((AttachmentType)newValue);
        return;
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__TECHNIQUE_COMMON:
        setTechniqueCommon((TechniqueCommonType)newValue);
        return;
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__TECHNIQUE:
        getTechnique().clear();
        getTechnique().addAll((Collection<? extends TechniqueType4>)newValue);
        return;
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__NAME:
        setName((String)newValue);
        return;
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__SID:
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
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__REF_ATTACHMENT:
        setRefAttachment((RefAttachmentType)null);
        return;
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__ATTACHMENT:
        setAttachment((AttachmentType)null);
        return;
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__TECHNIQUE_COMMON:
        setTechniqueCommon((TechniqueCommonType)null);
        return;
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__TECHNIQUE:
        getTechnique().clear();
        return;
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__SID:
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
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__REF_ATTACHMENT:
        return refAttachment != null;
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__ATTACHMENT:
        return attachment != null;
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__TECHNIQUE_COMMON:
        return techniqueCommon != null;
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__TECHNIQUE:
        return technique != null && !technique.isEmpty();
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ColladaPackage.RIGID_CONSTRAINT_TYPE__SID:
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
    result.append(" (name: ");
    result.append(name);
    result.append(", sid: ");
    result.append(sid);
    result.append(')');
    return result.toString();
  }

} //RigidConstraintTypeImpl
