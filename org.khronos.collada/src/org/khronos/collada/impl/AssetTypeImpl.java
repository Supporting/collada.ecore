/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

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
import org.khronos.collada.ContributorType;
import org.khronos.collada.UnitType;
import org.khronos.collada.UpAxisType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.AssetTypeImpl#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AssetTypeImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AssetTypeImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AssetTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AssetTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AssetTypeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AssetTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AssetTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AssetTypeImpl#getUpAxis <em>Up Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssetTypeImpl extends EObjectImpl implements AssetType {
	/**
   * The cached value of the '{@link #getContributor() <em>Contributor</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getContributor()
   * @generated
   * @ordered
   */
	protected EList<ContributorType> contributor;

	/**
   * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCreated()
   * @generated
   * @ordered
   */
	protected static final XMLGregorianCalendar CREATED_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCreated()
   * @generated
   * @ordered
   */
	protected XMLGregorianCalendar created = CREATED_EDEFAULT;

	/**
   * The default value of the '{@link #getKeywords() <em>Keywords</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getKeywords()
   * @generated
   * @ordered
   */
	protected static final String KEYWORDS_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getKeywords()
   * @generated
   * @ordered
   */
	protected String keywords = KEYWORDS_EDEFAULT;

	/**
   * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getModified()
   * @generated
   * @ordered
   */
	protected static final XMLGregorianCalendar MODIFIED_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getModified()
   * @generated
   * @ordered
   */
	protected XMLGregorianCalendar modified = MODIFIED_EDEFAULT;

	/**
   * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRevision()
   * @generated
   * @ordered
   */
	protected static final String REVISION_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRevision()
   * @generated
   * @ordered
   */
	protected String revision = REVISION_EDEFAULT;

	/**
   * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSubject()
   * @generated
   * @ordered
   */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSubject()
   * @generated
   * @ordered
   */
	protected String subject = SUBJECT_EDEFAULT;

	/**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
	protected static final String TITLE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
	protected String title = TITLE_EDEFAULT;

	/**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
	protected UnitType unit;

	/**
   * The default value of the '{@link #getUpAxis() <em>Up Axis</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUpAxis()
   * @generated
   * @ordered
   */
	protected static final UpAxisType UP_AXIS_EDEFAULT = UpAxisType.YUP;

	/**
   * The cached value of the '{@link #getUpAxis() <em>Up Axis</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUpAxis()
   * @generated
   * @ordered
   */
	protected UpAxisType upAxis = UP_AXIS_EDEFAULT;

	/**
   * This is true if the Up Axis attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean upAxisESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AssetTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getAssetType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ContributorType> getContributor() {
    if (contributor == null)
    {
      contributor = new EObjectContainmentEList<ContributorType>(ContributorType.class, this, ColladaPackage.ASSET_TYPE__CONTRIBUTOR);
    }
    return contributor;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public XMLGregorianCalendar getCreated() {
    return created;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCreated(XMLGregorianCalendar newCreated) {
    XMLGregorianCalendar oldCreated = created;
    created = newCreated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ASSET_TYPE__CREATED, oldCreated, created));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getKeywords() {
    return keywords;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setKeywords(String newKeywords) {
    String oldKeywords = keywords;
    keywords = newKeywords;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ASSET_TYPE__KEYWORDS, oldKeywords, keywords));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public XMLGregorianCalendar getModified() {
    return modified;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setModified(XMLGregorianCalendar newModified) {
    XMLGregorianCalendar oldModified = modified;
    modified = newModified;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ASSET_TYPE__MODIFIED, oldModified, modified));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getRevision() {
    return revision;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRevision(String newRevision) {
    String oldRevision = revision;
    revision = newRevision;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ASSET_TYPE__REVISION, oldRevision, revision));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSubject() {
    return subject;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSubject(String newSubject) {
    String oldSubject = subject;
    subject = newSubject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ASSET_TYPE__SUBJECT, oldSubject, subject));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getTitle() {
    return title;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTitle(String newTitle) {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ASSET_TYPE__TITLE, oldTitle, title));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public UnitType getUnit() {
    return unit;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetUnit(UnitType newUnit, NotificationChain msgs) {
    UnitType oldUnit = unit;
    unit = newUnit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.ASSET_TYPE__UNIT, oldUnit, newUnit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUnit(UnitType newUnit) {
    if (newUnit != unit)
    {
      NotificationChain msgs = null;
      if (unit != null)
        msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ASSET_TYPE__UNIT, null, msgs);
      if (newUnit != null)
        msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ASSET_TYPE__UNIT, null, msgs);
      msgs = basicSetUnit(newUnit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ASSET_TYPE__UNIT, newUnit, newUnit));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public UpAxisType getUpAxis() {
    return upAxis;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUpAxis(UpAxisType newUpAxis) {
    UpAxisType oldUpAxis = upAxis;
    upAxis = newUpAxis == null ? UP_AXIS_EDEFAULT : newUpAxis;
    boolean oldUpAxisESet = upAxisESet;
    upAxisESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ASSET_TYPE__UP_AXIS, oldUpAxis, upAxis, !oldUpAxisESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetUpAxis() {
    UpAxisType oldUpAxis = upAxis;
    boolean oldUpAxisESet = upAxisESet;
    upAxis = UP_AXIS_EDEFAULT;
    upAxisESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ColladaPackage.ASSET_TYPE__UP_AXIS, oldUpAxis, UP_AXIS_EDEFAULT, oldUpAxisESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetUpAxis() {
    return upAxisESet;
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
      case ColladaPackage.ASSET_TYPE__CONTRIBUTOR:
        return ((InternalEList<?>)getContributor()).basicRemove(otherEnd, msgs);
      case ColladaPackage.ASSET_TYPE__UNIT:
        return basicSetUnit(null, msgs);
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
      case ColladaPackage.ASSET_TYPE__CONTRIBUTOR:
        return getContributor();
      case ColladaPackage.ASSET_TYPE__CREATED:
        return getCreated();
      case ColladaPackage.ASSET_TYPE__KEYWORDS:
        return getKeywords();
      case ColladaPackage.ASSET_TYPE__MODIFIED:
        return getModified();
      case ColladaPackage.ASSET_TYPE__REVISION:
        return getRevision();
      case ColladaPackage.ASSET_TYPE__SUBJECT:
        return getSubject();
      case ColladaPackage.ASSET_TYPE__TITLE:
        return getTitle();
      case ColladaPackage.ASSET_TYPE__UNIT:
        return getUnit();
      case ColladaPackage.ASSET_TYPE__UP_AXIS:
        return getUpAxis();
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
      case ColladaPackage.ASSET_TYPE__CONTRIBUTOR:
        getContributor().clear();
        getContributor().addAll((Collection<? extends ContributorType>)newValue);
        return;
      case ColladaPackage.ASSET_TYPE__CREATED:
        setCreated((XMLGregorianCalendar)newValue);
        return;
      case ColladaPackage.ASSET_TYPE__KEYWORDS:
        setKeywords((String)newValue);
        return;
      case ColladaPackage.ASSET_TYPE__MODIFIED:
        setModified((XMLGregorianCalendar)newValue);
        return;
      case ColladaPackage.ASSET_TYPE__REVISION:
        setRevision((String)newValue);
        return;
      case ColladaPackage.ASSET_TYPE__SUBJECT:
        setSubject((String)newValue);
        return;
      case ColladaPackage.ASSET_TYPE__TITLE:
        setTitle((String)newValue);
        return;
      case ColladaPackage.ASSET_TYPE__UNIT:
        setUnit((UnitType)newValue);
        return;
      case ColladaPackage.ASSET_TYPE__UP_AXIS:
        setUpAxis((UpAxisType)newValue);
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
      case ColladaPackage.ASSET_TYPE__CONTRIBUTOR:
        getContributor().clear();
        return;
      case ColladaPackage.ASSET_TYPE__CREATED:
        setCreated(CREATED_EDEFAULT);
        return;
      case ColladaPackage.ASSET_TYPE__KEYWORDS:
        setKeywords(KEYWORDS_EDEFAULT);
        return;
      case ColladaPackage.ASSET_TYPE__MODIFIED:
        setModified(MODIFIED_EDEFAULT);
        return;
      case ColladaPackage.ASSET_TYPE__REVISION:
        setRevision(REVISION_EDEFAULT);
        return;
      case ColladaPackage.ASSET_TYPE__SUBJECT:
        setSubject(SUBJECT_EDEFAULT);
        return;
      case ColladaPackage.ASSET_TYPE__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case ColladaPackage.ASSET_TYPE__UNIT:
        setUnit((UnitType)null);
        return;
      case ColladaPackage.ASSET_TYPE__UP_AXIS:
        unsetUpAxis();
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
      case ColladaPackage.ASSET_TYPE__CONTRIBUTOR:
        return contributor != null && !contributor.isEmpty();
      case ColladaPackage.ASSET_TYPE__CREATED:
        return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
      case ColladaPackage.ASSET_TYPE__KEYWORDS:
        return KEYWORDS_EDEFAULT == null ? keywords != null : !KEYWORDS_EDEFAULT.equals(keywords);
      case ColladaPackage.ASSET_TYPE__MODIFIED:
        return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
      case ColladaPackage.ASSET_TYPE__REVISION:
        return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
      case ColladaPackage.ASSET_TYPE__SUBJECT:
        return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
      case ColladaPackage.ASSET_TYPE__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case ColladaPackage.ASSET_TYPE__UNIT:
        return unit != null;
      case ColladaPackage.ASSET_TYPE__UP_AXIS:
        return isSetUpAxis();
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
    result.append(" (created: ");
    result.append(created);
    result.append(", keywords: ");
    result.append(keywords);
    result.append(", modified: ");
    result.append(modified);
    result.append(", revision: ");
    result.append(revision);
    result.append(", subject: ");
    result.append(subject);
    result.append(", title: ");
    result.append(title);
    result.append(", upAxis: ");
    if (upAxisESet) result.append(upAxis); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //AssetTypeImpl
