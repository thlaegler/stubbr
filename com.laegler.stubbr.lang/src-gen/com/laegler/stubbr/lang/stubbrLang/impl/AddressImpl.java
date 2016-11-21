/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang.impl;

import com.laegler.stubbr.lang.stubbrLang.Address;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.AddressImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.AddressImpl#getJavaType <em>Java Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressImpl extends ElementImpl implements Address
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Entity type;

  /**
   * The cached value of the '{@link #getJavaType() <em>Java Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaType()
   * @generated
   * @ordered
   */
  protected JvmType javaType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddressImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StubbrLangPackage.eINSTANCE.getAddress();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Entity)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StubbrLangPackage.ADDRESS__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Entity newType)
  {
    Entity oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.ADDRESS__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getJavaType()
  {
    if (javaType != null && javaType.eIsProxy())
    {
      InternalEObject oldJavaType = (InternalEObject)javaType;
      javaType = (JvmType)eResolveProxy(oldJavaType);
      if (javaType != oldJavaType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StubbrLangPackage.ADDRESS__JAVA_TYPE, oldJavaType, javaType));
      }
    }
    return javaType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetJavaType()
  {
    return javaType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaType(JvmType newJavaType)
  {
    JvmType oldJavaType = javaType;
    javaType = newJavaType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.ADDRESS__JAVA_TYPE, oldJavaType, javaType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StubbrLangPackage.ADDRESS__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case StubbrLangPackage.ADDRESS__JAVA_TYPE:
        if (resolve) return getJavaType();
        return basicGetJavaType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StubbrLangPackage.ADDRESS__TYPE:
        setType((Entity)newValue);
        return;
      case StubbrLangPackage.ADDRESS__JAVA_TYPE:
        setJavaType((JvmType)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StubbrLangPackage.ADDRESS__TYPE:
        setType((Entity)null);
        return;
      case StubbrLangPackage.ADDRESS__JAVA_TYPE:
        setJavaType((JvmType)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StubbrLangPackage.ADDRESS__TYPE:
        return type != null;
      case StubbrLangPackage.ADDRESS__JAVA_TYPE:
        return javaType != null;
    }
    return super.eIsSet(featureID);
  }

} //AddressImpl
