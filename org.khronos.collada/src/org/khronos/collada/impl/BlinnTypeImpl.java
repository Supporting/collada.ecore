/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.BlinnType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.CommonColorOrTextureType;
import org.khronos.collada.CommonFloatOrParamType;
import org.khronos.collada.CommonTransparentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blinn Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.BlinnTypeImpl#getEmission <em>Emission</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BlinnTypeImpl#getAmbient <em>Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BlinnTypeImpl#getDiffuse <em>Diffuse</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BlinnTypeImpl#getSpecular <em>Specular</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BlinnTypeImpl#getShininess <em>Shininess</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BlinnTypeImpl#getReflective <em>Reflective</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BlinnTypeImpl#getReflectivity <em>Reflectivity</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BlinnTypeImpl#getTransparent <em>Transparent</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BlinnTypeImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link org.khronos.collada.impl.BlinnTypeImpl#getIndexOfRefraction <em>Index Of Refraction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlinnTypeImpl extends EObjectImpl implements BlinnType {
	/**
   * The cached value of the '{@link #getEmission() <em>Emission</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEmission()
   * @generated
   * @ordered
   */
	protected CommonColorOrTextureType emission;

	/**
   * The cached value of the '{@link #getAmbient() <em>Ambient</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAmbient()
   * @generated
   * @ordered
   */
	protected CommonColorOrTextureType ambient;

	/**
   * The cached value of the '{@link #getDiffuse() <em>Diffuse</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDiffuse()
   * @generated
   * @ordered
   */
	protected CommonColorOrTextureType diffuse;

	/**
   * The cached value of the '{@link #getSpecular() <em>Specular</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSpecular()
   * @generated
   * @ordered
   */
	protected CommonColorOrTextureType specular;

	/**
   * The cached value of the '{@link #getShininess() <em>Shininess</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getShininess()
   * @generated
   * @ordered
   */
	protected CommonFloatOrParamType shininess;

	/**
   * The cached value of the '{@link #getReflective() <em>Reflective</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getReflective()
   * @generated
   * @ordered
   */
	protected CommonColorOrTextureType reflective;

	/**
   * The cached value of the '{@link #getReflectivity() <em>Reflectivity</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getReflectivity()
   * @generated
   * @ordered
   */
	protected CommonFloatOrParamType reflectivity;

	/**
   * The cached value of the '{@link #getTransparent() <em>Transparent</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTransparent()
   * @generated
   * @ordered
   */
	protected CommonTransparentType transparent;

	/**
   * The cached value of the '{@link #getTransparency() <em>Transparency</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTransparency()
   * @generated
   * @ordered
   */
	protected CommonFloatOrParamType transparency;

	/**
   * The cached value of the '{@link #getIndexOfRefraction() <em>Index Of Refraction</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIndexOfRefraction()
   * @generated
   * @ordered
   */
	protected CommonFloatOrParamType indexOfRefraction;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected BlinnTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getBlinnType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonColorOrTextureType getEmission() {
    return emission;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetEmission(CommonColorOrTextureType newEmission, NotificationChain msgs) {
    CommonColorOrTextureType oldEmission = emission;
    emission = newEmission;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__EMISSION, oldEmission, newEmission);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setEmission(CommonColorOrTextureType newEmission) {
    if (newEmission != emission)
    {
      NotificationChain msgs = null;
      if (emission != null)
        msgs = ((InternalEObject)emission).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__EMISSION, null, msgs);
      if (newEmission != null)
        msgs = ((InternalEObject)newEmission).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__EMISSION, null, msgs);
      msgs = basicSetEmission(newEmission, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__EMISSION, newEmission, newEmission));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonColorOrTextureType getAmbient() {
    return ambient;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAmbient(CommonColorOrTextureType newAmbient, NotificationChain msgs) {
    CommonColorOrTextureType oldAmbient = ambient;
    ambient = newAmbient;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__AMBIENT, oldAmbient, newAmbient);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAmbient(CommonColorOrTextureType newAmbient) {
    if (newAmbient != ambient)
    {
      NotificationChain msgs = null;
      if (ambient != null)
        msgs = ((InternalEObject)ambient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__AMBIENT, null, msgs);
      if (newAmbient != null)
        msgs = ((InternalEObject)newAmbient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__AMBIENT, null, msgs);
      msgs = basicSetAmbient(newAmbient, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__AMBIENT, newAmbient, newAmbient));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonColorOrTextureType getDiffuse() {
    return diffuse;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDiffuse(CommonColorOrTextureType newDiffuse, NotificationChain msgs) {
    CommonColorOrTextureType oldDiffuse = diffuse;
    diffuse = newDiffuse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__DIFFUSE, oldDiffuse, newDiffuse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDiffuse(CommonColorOrTextureType newDiffuse) {
    if (newDiffuse != diffuse)
    {
      NotificationChain msgs = null;
      if (diffuse != null)
        msgs = ((InternalEObject)diffuse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__DIFFUSE, null, msgs);
      if (newDiffuse != null)
        msgs = ((InternalEObject)newDiffuse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__DIFFUSE, null, msgs);
      msgs = basicSetDiffuse(newDiffuse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__DIFFUSE, newDiffuse, newDiffuse));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonColorOrTextureType getSpecular() {
    return specular;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSpecular(CommonColorOrTextureType newSpecular, NotificationChain msgs) {
    CommonColorOrTextureType oldSpecular = specular;
    specular = newSpecular;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__SPECULAR, oldSpecular, newSpecular);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSpecular(CommonColorOrTextureType newSpecular) {
    if (newSpecular != specular)
    {
      NotificationChain msgs = null;
      if (specular != null)
        msgs = ((InternalEObject)specular).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__SPECULAR, null, msgs);
      if (newSpecular != null)
        msgs = ((InternalEObject)newSpecular).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__SPECULAR, null, msgs);
      msgs = basicSetSpecular(newSpecular, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__SPECULAR, newSpecular, newSpecular));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonFloatOrParamType getShininess() {
    return shininess;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetShininess(CommonFloatOrParamType newShininess, NotificationChain msgs) {
    CommonFloatOrParamType oldShininess = shininess;
    shininess = newShininess;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__SHININESS, oldShininess, newShininess);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setShininess(CommonFloatOrParamType newShininess) {
    if (newShininess != shininess)
    {
      NotificationChain msgs = null;
      if (shininess != null)
        msgs = ((InternalEObject)shininess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__SHININESS, null, msgs);
      if (newShininess != null)
        msgs = ((InternalEObject)newShininess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__SHININESS, null, msgs);
      msgs = basicSetShininess(newShininess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__SHININESS, newShininess, newShininess));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonColorOrTextureType getReflective() {
    return reflective;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetReflective(CommonColorOrTextureType newReflective, NotificationChain msgs) {
    CommonColorOrTextureType oldReflective = reflective;
    reflective = newReflective;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__REFLECTIVE, oldReflective, newReflective);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setReflective(CommonColorOrTextureType newReflective) {
    if (newReflective != reflective)
    {
      NotificationChain msgs = null;
      if (reflective != null)
        msgs = ((InternalEObject)reflective).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__REFLECTIVE, null, msgs);
      if (newReflective != null)
        msgs = ((InternalEObject)newReflective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__REFLECTIVE, null, msgs);
      msgs = basicSetReflective(newReflective, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__REFLECTIVE, newReflective, newReflective));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonFloatOrParamType getReflectivity() {
    return reflectivity;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetReflectivity(CommonFloatOrParamType newReflectivity, NotificationChain msgs) {
    CommonFloatOrParamType oldReflectivity = reflectivity;
    reflectivity = newReflectivity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__REFLECTIVITY, oldReflectivity, newReflectivity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setReflectivity(CommonFloatOrParamType newReflectivity) {
    if (newReflectivity != reflectivity)
    {
      NotificationChain msgs = null;
      if (reflectivity != null)
        msgs = ((InternalEObject)reflectivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__REFLECTIVITY, null, msgs);
      if (newReflectivity != null)
        msgs = ((InternalEObject)newReflectivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__REFLECTIVITY, null, msgs);
      msgs = basicSetReflectivity(newReflectivity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__REFLECTIVITY, newReflectivity, newReflectivity));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonTransparentType getTransparent() {
    return transparent;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTransparent(CommonTransparentType newTransparent, NotificationChain msgs) {
    CommonTransparentType oldTransparent = transparent;
    transparent = newTransparent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__TRANSPARENT, oldTransparent, newTransparent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTransparent(CommonTransparentType newTransparent) {
    if (newTransparent != transparent)
    {
      NotificationChain msgs = null;
      if (transparent != null)
        msgs = ((InternalEObject)transparent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__TRANSPARENT, null, msgs);
      if (newTransparent != null)
        msgs = ((InternalEObject)newTransparent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__TRANSPARENT, null, msgs);
      msgs = basicSetTransparent(newTransparent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__TRANSPARENT, newTransparent, newTransparent));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonFloatOrParamType getTransparency() {
    return transparency;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTransparency(CommonFloatOrParamType newTransparency, NotificationChain msgs) {
    CommonFloatOrParamType oldTransparency = transparency;
    transparency = newTransparency;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__TRANSPARENCY, oldTransparency, newTransparency);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTransparency(CommonFloatOrParamType newTransparency) {
    if (newTransparency != transparency)
    {
      NotificationChain msgs = null;
      if (transparency != null)
        msgs = ((InternalEObject)transparency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__TRANSPARENCY, null, msgs);
      if (newTransparency != null)
        msgs = ((InternalEObject)newTransparency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__TRANSPARENCY, null, msgs);
      msgs = basicSetTransparency(newTransparency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__TRANSPARENCY, newTransparency, newTransparency));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CommonFloatOrParamType getIndexOfRefraction() {
    return indexOfRefraction;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetIndexOfRefraction(CommonFloatOrParamType newIndexOfRefraction, NotificationChain msgs) {
    CommonFloatOrParamType oldIndexOfRefraction = indexOfRefraction;
    indexOfRefraction = newIndexOfRefraction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__INDEX_OF_REFRACTION, oldIndexOfRefraction, newIndexOfRefraction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setIndexOfRefraction(CommonFloatOrParamType newIndexOfRefraction) {
    if (newIndexOfRefraction != indexOfRefraction)
    {
      NotificationChain msgs = null;
      if (indexOfRefraction != null)
        msgs = ((InternalEObject)indexOfRefraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__INDEX_OF_REFRACTION, null, msgs);
      if (newIndexOfRefraction != null)
        msgs = ((InternalEObject)newIndexOfRefraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.BLINN_TYPE__INDEX_OF_REFRACTION, null, msgs);
      msgs = basicSetIndexOfRefraction(newIndexOfRefraction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.BLINN_TYPE__INDEX_OF_REFRACTION, newIndexOfRefraction, newIndexOfRefraction));
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
      case ColladaPackage.BLINN_TYPE__EMISSION:
        return basicSetEmission(null, msgs);
      case ColladaPackage.BLINN_TYPE__AMBIENT:
        return basicSetAmbient(null, msgs);
      case ColladaPackage.BLINN_TYPE__DIFFUSE:
        return basicSetDiffuse(null, msgs);
      case ColladaPackage.BLINN_TYPE__SPECULAR:
        return basicSetSpecular(null, msgs);
      case ColladaPackage.BLINN_TYPE__SHININESS:
        return basicSetShininess(null, msgs);
      case ColladaPackage.BLINN_TYPE__REFLECTIVE:
        return basicSetReflective(null, msgs);
      case ColladaPackage.BLINN_TYPE__REFLECTIVITY:
        return basicSetReflectivity(null, msgs);
      case ColladaPackage.BLINN_TYPE__TRANSPARENT:
        return basicSetTransparent(null, msgs);
      case ColladaPackage.BLINN_TYPE__TRANSPARENCY:
        return basicSetTransparency(null, msgs);
      case ColladaPackage.BLINN_TYPE__INDEX_OF_REFRACTION:
        return basicSetIndexOfRefraction(null, msgs);
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
      case ColladaPackage.BLINN_TYPE__EMISSION:
        return getEmission();
      case ColladaPackage.BLINN_TYPE__AMBIENT:
        return getAmbient();
      case ColladaPackage.BLINN_TYPE__DIFFUSE:
        return getDiffuse();
      case ColladaPackage.BLINN_TYPE__SPECULAR:
        return getSpecular();
      case ColladaPackage.BLINN_TYPE__SHININESS:
        return getShininess();
      case ColladaPackage.BLINN_TYPE__REFLECTIVE:
        return getReflective();
      case ColladaPackage.BLINN_TYPE__REFLECTIVITY:
        return getReflectivity();
      case ColladaPackage.BLINN_TYPE__TRANSPARENT:
        return getTransparent();
      case ColladaPackage.BLINN_TYPE__TRANSPARENCY:
        return getTransparency();
      case ColladaPackage.BLINN_TYPE__INDEX_OF_REFRACTION:
        return getIndexOfRefraction();
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
      case ColladaPackage.BLINN_TYPE__EMISSION:
        setEmission((CommonColorOrTextureType)newValue);
        return;
      case ColladaPackage.BLINN_TYPE__AMBIENT:
        setAmbient((CommonColorOrTextureType)newValue);
        return;
      case ColladaPackage.BLINN_TYPE__DIFFUSE:
        setDiffuse((CommonColorOrTextureType)newValue);
        return;
      case ColladaPackage.BLINN_TYPE__SPECULAR:
        setSpecular((CommonColorOrTextureType)newValue);
        return;
      case ColladaPackage.BLINN_TYPE__SHININESS:
        setShininess((CommonFloatOrParamType)newValue);
        return;
      case ColladaPackage.BLINN_TYPE__REFLECTIVE:
        setReflective((CommonColorOrTextureType)newValue);
        return;
      case ColladaPackage.BLINN_TYPE__REFLECTIVITY:
        setReflectivity((CommonFloatOrParamType)newValue);
        return;
      case ColladaPackage.BLINN_TYPE__TRANSPARENT:
        setTransparent((CommonTransparentType)newValue);
        return;
      case ColladaPackage.BLINN_TYPE__TRANSPARENCY:
        setTransparency((CommonFloatOrParamType)newValue);
        return;
      case ColladaPackage.BLINN_TYPE__INDEX_OF_REFRACTION:
        setIndexOfRefraction((CommonFloatOrParamType)newValue);
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
      case ColladaPackage.BLINN_TYPE__EMISSION:
        setEmission((CommonColorOrTextureType)null);
        return;
      case ColladaPackage.BLINN_TYPE__AMBIENT:
        setAmbient((CommonColorOrTextureType)null);
        return;
      case ColladaPackage.BLINN_TYPE__DIFFUSE:
        setDiffuse((CommonColorOrTextureType)null);
        return;
      case ColladaPackage.BLINN_TYPE__SPECULAR:
        setSpecular((CommonColorOrTextureType)null);
        return;
      case ColladaPackage.BLINN_TYPE__SHININESS:
        setShininess((CommonFloatOrParamType)null);
        return;
      case ColladaPackage.BLINN_TYPE__REFLECTIVE:
        setReflective((CommonColorOrTextureType)null);
        return;
      case ColladaPackage.BLINN_TYPE__REFLECTIVITY:
        setReflectivity((CommonFloatOrParamType)null);
        return;
      case ColladaPackage.BLINN_TYPE__TRANSPARENT:
        setTransparent((CommonTransparentType)null);
        return;
      case ColladaPackage.BLINN_TYPE__TRANSPARENCY:
        setTransparency((CommonFloatOrParamType)null);
        return;
      case ColladaPackage.BLINN_TYPE__INDEX_OF_REFRACTION:
        setIndexOfRefraction((CommonFloatOrParamType)null);
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
      case ColladaPackage.BLINN_TYPE__EMISSION:
        return emission != null;
      case ColladaPackage.BLINN_TYPE__AMBIENT:
        return ambient != null;
      case ColladaPackage.BLINN_TYPE__DIFFUSE:
        return diffuse != null;
      case ColladaPackage.BLINN_TYPE__SPECULAR:
        return specular != null;
      case ColladaPackage.BLINN_TYPE__SHININESS:
        return shininess != null;
      case ColladaPackage.BLINN_TYPE__REFLECTIVE:
        return reflective != null;
      case ColladaPackage.BLINN_TYPE__REFLECTIVITY:
        return reflectivity != null;
      case ColladaPackage.BLINN_TYPE__TRANSPARENT:
        return transparent != null;
      case ColladaPackage.BLINN_TYPE__TRANSPARENCY:
        return transparency != null;
      case ColladaPackage.BLINN_TYPE__INDEX_OF_REFRACTION:
        return indexOfRefraction != null;
    }
    return super.eIsSet(featureID);
  }

} //BlinnTypeImpl
