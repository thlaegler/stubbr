/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang.impl;

import com.laegler.stubbr.lang.stubbrLang.Attachment;
import com.laegler.stubbr.lang.stubbrLang.Gateway;
import com.laegler.stubbr.lang.stubbrLang.GatewayType;
import com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.GatewayImpl#getGatewayType <em>Gateway Type</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.GatewayImpl#getAttachments <em>Attachments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GatewayImpl extends FlowNodeImpl implements Gateway
{
  /**
   * The default value of the '{@link #getGatewayType() <em>Gateway Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGatewayType()
   * @generated
   * @ordered
   */
  protected static final GatewayType GATEWAY_TYPE_EDEFAULT = GatewayType.BLANK;

  /**
   * The cached value of the '{@link #getGatewayType() <em>Gateway Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGatewayType()
   * @generated
   * @ordered
   */
  protected GatewayType gatewayType = GATEWAY_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttachments() <em>Attachments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttachments()
   * @generated
   * @ordered
   */
  protected EList<Attachment> attachments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GatewayImpl()
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
    return StubbrLangPackage.eINSTANCE.getGateway();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GatewayType getGatewayType()
  {
    return gatewayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGatewayType(GatewayType newGatewayType)
  {
    GatewayType oldGatewayType = gatewayType;
    gatewayType = newGatewayType == null ? GATEWAY_TYPE_EDEFAULT : newGatewayType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.GATEWAY__GATEWAY_TYPE, oldGatewayType, gatewayType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attachment> getAttachments()
  {
    if (attachments == null)
    {
      attachments = new EObjectContainmentEList<Attachment>(Attachment.class, this, StubbrLangPackage.GATEWAY__ATTACHMENTS);
    }
    return attachments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StubbrLangPackage.GATEWAY__ATTACHMENTS:
        return ((InternalEList<?>)getAttachments()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case StubbrLangPackage.GATEWAY__GATEWAY_TYPE:
        return getGatewayType();
      case StubbrLangPackage.GATEWAY__ATTACHMENTS:
        return getAttachments();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StubbrLangPackage.GATEWAY__GATEWAY_TYPE:
        setGatewayType((GatewayType)newValue);
        return;
      case StubbrLangPackage.GATEWAY__ATTACHMENTS:
        getAttachments().clear();
        getAttachments().addAll((Collection<? extends Attachment>)newValue);
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
      case StubbrLangPackage.GATEWAY__GATEWAY_TYPE:
        setGatewayType(GATEWAY_TYPE_EDEFAULT);
        return;
      case StubbrLangPackage.GATEWAY__ATTACHMENTS:
        getAttachments().clear();
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
      case StubbrLangPackage.GATEWAY__GATEWAY_TYPE:
        return gatewayType != GATEWAY_TYPE_EDEFAULT;
      case StubbrLangPackage.GATEWAY__ATTACHMENTS:
        return attachments != null && !attachments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (gatewayType: ");
    result.append(gatewayType);
    result.append(')');
    return result.toString();
  }

} //GatewayImpl
