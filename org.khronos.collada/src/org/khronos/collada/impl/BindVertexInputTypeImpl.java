/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.BindVertexInputType;
import org.khronos.collada.ColladaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bind Vertex Input Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.BindVertexInputTypeImpl#getInputSemantic <em>Input Semantic</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BindVertexInputTypeImpl#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BindVertexInputTypeImpl#getSemantic <em>Semantic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindVertexInputTypeImpl extends EObjectImpl implements BindVertexInputType {
	/**
   * The default value of the '{@link #getInputSemantic() <em>Input Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInputSemantic()
   * @generated
   * @ordered
   */
	protected static final String INPUT_SEMANTIC_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInputSemantic() <em>Input Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInputSemantic()
   * @generated
   * @ordered
   */
	protected String inputSemantic = INPUT_SEMANTIC_EDEFAULT;

	/**
   * The default value of the '{@link #getInputSet() <em>Input Set</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInputSet()
   * @generated
   * @ordered
   */
	protected static final BigInteger INPUT_SET_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getInputSet() <em>Input Set</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInputSet()
   * @generated
   * @ordered
   */
	protected BigInteger inputSet = INPUT_SET_EDEFAULT;

	/**
   * The default value of the '{@link #getSemantic() <em>Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSemantic()
   * @generated
   * @ordered
   */
	protected static final String SEMANTIC_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSemantic() <em>Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSemantic()
   * @generated
   * @ordered
   */
	protected String semantic = SEMANTIC_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected BindVertexInputTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getBindVertexInputType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getInputSemantic() {
    return inputSemantic;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInputSemantic(String newInputSemantic) {
    String oldInputSemantic = inputSemantic;
    inputSemantic = newInputSemantic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BIND_VERTEX_INPUT_TYPE__INPUT_SEMANTIC, oldInputSemantic, inputSemantic));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BigInteger getInputSet() {
    return inputSet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setInputSet(BigInteger newInputSet) {
    BigInteger oldInputSet = inputSet;
    inputSet = newInputSet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BIND_VERTEX_INPUT_TYPE__INPUT_SET, oldInputSet, inputSet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSemantic() {
    return semantic;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSemantic(String newSemantic) {
    String oldSemantic = semantic;
    semantic = newSemantic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BIND_VERTEX_INPUT_TYPE__SEMANTIC, oldSemantic, semantic));
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
      case ColladaPackage.BIND_VERTEX_INPUT_TYPE__INPUT_SEMANTIC:
        return getInputSemantic();
      case ColladaPackage.BIND_VERTEX_INPUT_TYPE__INPUT_SET:
        return getInputSet();
      case ColladaPackage.BIND_VERTEX_INPUT_TYPE__SEMANTIC:
        return getSemantic();
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
      case ColladaPackage.BIND_VERTEX_INPUT_TYPE__INPUT_SEMANTIC:
        setInputSemantic((String)newValue);
        return;
      case ColladaPackage.BIND_VERTEX_INPUT_TYPE__INPUT_SET:
        setInputSet((BigInteger)newValue);
        return;
      case ColladaPackage.BIND_VERTEX_INPUT_TYPE__SEMANTIC:
        setSemantic((String)newValue);
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
      case ColladaPackage.BIND_VERTEX_INPUT_TYPE__INPUT_SEMANTIC:
        setInputSemantic(INPUT_SEMANTIC_EDEFAULT);
        return;
      case ColladaPackage.BIND_VERTEX_INPUT_TYPE__INPUT_SET:
        setInputSet(INPUT_SET_EDEFAULT);
        return;
      case ColladaPackage.BIND_VERTEX_INPUT_TYPE__SEMANTIC:
        setSemantic(SEMANTIC_EDEFAULT);
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
      case ColladaPackage.BIND_VERTEX_INPUT_TYPE__INPUT_SEMANTIC:
        return INPUT_SEMANTIC_EDEFAULT == null ? inputSemantic != null : !INPUT_SEMANTIC_EDEFAULT.equals(inputSemantic);
      case ColladaPackage.BIND_VERTEX_INPUT_TYPE__INPUT_SET:
        return INPUT_SET_EDEFAULT == null ? inputSet != null : !INPUT_SET_EDEFAULT.equals(inputSet);
      case ColladaPackage.BIND_VERTEX_INPUT_TYPE__SEMANTIC:
        return SEMANTIC_EDEFAULT == null ? semantic != null : !SEMANTIC_EDEFAULT.equals(semantic);
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
    result.append(" (inputSemantic: ");
    result.append(inputSemantic);
    result.append(", inputSet: ");
    result.append(inputSet);
    result.append(", semantic: ");
    result.append(semantic);
    result.append(')');
    return result.toString();
  }

} //BindVertexInputTypeImpl
