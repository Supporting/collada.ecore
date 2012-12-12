/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ContributorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contributor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.ContributorTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ContributorTypeImpl#getAuthoringTool <em>Authoring Tool</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ContributorTypeImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ContributorTypeImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.khronos.collada.impl.ContributorTypeImpl#getSourceData <em>Source Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContributorTypeImpl extends EObjectImpl implements ContributorType {
	/**
   * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
	protected String author = AUTHOR_EDEFAULT;

	/**
   * The default value of the '{@link #getAuthoringTool() <em>Authoring Tool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAuthoringTool()
   * @generated
   * @ordered
   */
	protected static final String AUTHORING_TOOL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getAuthoringTool() <em>Authoring Tool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAuthoringTool()
   * @generated
   * @ordered
   */
	protected String authoringTool = AUTHORING_TOOL_EDEFAULT;

	/**
   * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
	protected String comments = COMMENTS_EDEFAULT;

	/**
   * The default value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCopyright()
   * @generated
   * @ordered
   */
	protected static final String COPYRIGHT_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCopyright()
   * @generated
   * @ordered
   */
	protected String copyright = COPYRIGHT_EDEFAULT;

	/**
   * The default value of the '{@link #getSourceData() <em>Source Data</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSourceData()
   * @generated
   * @ordered
   */
	protected static final String SOURCE_DATA_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSourceData() <em>Source Data</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSourceData()
   * @generated
   * @ordered
   */
	protected String sourceData = SOURCE_DATA_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ContributorTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getContributorType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getAuthor() {
    return author;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAuthor(String newAuthor) {
    String oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CONTRIBUTOR_TYPE__AUTHOR, oldAuthor, author));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getAuthoringTool() {
    return authoringTool;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAuthoringTool(String newAuthoringTool) {
    String oldAuthoringTool = authoringTool;
    authoringTool = newAuthoringTool;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CONTRIBUTOR_TYPE__AUTHORING_TOOL, oldAuthoringTool, authoringTool));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getComments() {
    return comments;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setComments(String newComments) {
    String oldComments = comments;
    comments = newComments;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CONTRIBUTOR_TYPE__COMMENTS, oldComments, comments));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getCopyright() {
    return copyright;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCopyright(String newCopyright) {
    String oldCopyright = copyright;
    copyright = newCopyright;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CONTRIBUTOR_TYPE__COPYRIGHT, oldCopyright, copyright));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSourceData() {
    return sourceData;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSourceData(String newSourceData) {
    String oldSourceData = sourceData;
    sourceData = newSourceData;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.CONTRIBUTOR_TYPE__SOURCE_DATA, oldSourceData, sourceData));
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
      case ColladaPackage.CONTRIBUTOR_TYPE__AUTHOR:
        return getAuthor();
      case ColladaPackage.CONTRIBUTOR_TYPE__AUTHORING_TOOL:
        return getAuthoringTool();
      case ColladaPackage.CONTRIBUTOR_TYPE__COMMENTS:
        return getComments();
      case ColladaPackage.CONTRIBUTOR_TYPE__COPYRIGHT:
        return getCopyright();
      case ColladaPackage.CONTRIBUTOR_TYPE__SOURCE_DATA:
        return getSourceData();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case ColladaPackage.CONTRIBUTOR_TYPE__AUTHOR:
        setAuthor((String)newValue);
        return;
      case ColladaPackage.CONTRIBUTOR_TYPE__AUTHORING_TOOL:
        setAuthoringTool((String)newValue);
        return;
      case ColladaPackage.CONTRIBUTOR_TYPE__COMMENTS:
        setComments((String)newValue);
        return;
      case ColladaPackage.CONTRIBUTOR_TYPE__COPYRIGHT:
        setCopyright((String)newValue);
        return;
      case ColladaPackage.CONTRIBUTOR_TYPE__SOURCE_DATA:
        setSourceData((String)newValue);
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
      case ColladaPackage.CONTRIBUTOR_TYPE__AUTHOR:
        setAuthor(AUTHOR_EDEFAULT);
        return;
      case ColladaPackage.CONTRIBUTOR_TYPE__AUTHORING_TOOL:
        setAuthoringTool(AUTHORING_TOOL_EDEFAULT);
        return;
      case ColladaPackage.CONTRIBUTOR_TYPE__COMMENTS:
        setComments(COMMENTS_EDEFAULT);
        return;
      case ColladaPackage.CONTRIBUTOR_TYPE__COPYRIGHT:
        setCopyright(COPYRIGHT_EDEFAULT);
        return;
      case ColladaPackage.CONTRIBUTOR_TYPE__SOURCE_DATA:
        setSourceData(SOURCE_DATA_EDEFAULT);
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
      case ColladaPackage.CONTRIBUTOR_TYPE__AUTHOR:
        return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
      case ColladaPackage.CONTRIBUTOR_TYPE__AUTHORING_TOOL:
        return AUTHORING_TOOL_EDEFAULT == null ? authoringTool != null : !AUTHORING_TOOL_EDEFAULT.equals(authoringTool);
      case ColladaPackage.CONTRIBUTOR_TYPE__COMMENTS:
        return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
      case ColladaPackage.CONTRIBUTOR_TYPE__COPYRIGHT:
        return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
      case ColladaPackage.CONTRIBUTOR_TYPE__SOURCE_DATA:
        return SOURCE_DATA_EDEFAULT == null ? sourceData != null : !SOURCE_DATA_EDEFAULT.equals(sourceData);
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
    result.append(" (author: ");
    result.append(author);
    result.append(", authoringTool: ");
    result.append(authoringTool);
    result.append(", comments: ");
    result.append(comments);
    result.append(", copyright: ");
    result.append(copyright);
    result.append(", sourceData: ");
    result.append(sourceData);
    result.append(')');
    return result.toString();
  }

} //ContributorTypeImpl
