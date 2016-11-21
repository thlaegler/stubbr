/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang.impl;

import com.laegler.stubbr.lang.stubbrLang.InteractionNode;
import com.laegler.stubbr.lang.stubbrLang.SendMessage;
import com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.SendMessageImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.SendMessageImpl#getReceivingElement <em>Receiving Element</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.SendMessageImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendMessageImpl extends AttachmentImpl implements SendMessage
{
  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getReceivingElement() <em>Receiving Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceivingElement()
   * @generated
   * @ordered
   */
  protected InteractionNode receivingElement;

  /**
   * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference dataType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SendMessageImpl()
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
    return StubbrLangPackage.eINSTANCE.getSendMessage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.SEND_MESSAGE__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionNode getReceivingElement()
  {
    if (receivingElement != null && receivingElement.eIsProxy())
    {
      InternalEObject oldReceivingElement = (InternalEObject)receivingElement;
      receivingElement = (InteractionNode)eResolveProxy(oldReceivingElement);
      if (receivingElement != oldReceivingElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StubbrLangPackage.SEND_MESSAGE__RECEIVING_ELEMENT, oldReceivingElement, receivingElement));
      }
    }
    return receivingElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionNode basicGetReceivingElement()
  {
    return receivingElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceivingElement(InteractionNode newReceivingElement)
  {
    InteractionNode oldReceivingElement = receivingElement;
    receivingElement = newReceivingElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.SEND_MESSAGE__RECEIVING_ELEMENT, oldReceivingElement, receivingElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getDataType()
  {
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataType(JvmTypeReference newDataType, NotificationChain msgs)
  {
    JvmTypeReference oldDataType = dataType;
    dataType = newDataType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StubbrLangPackage.SEND_MESSAGE__DATA_TYPE, oldDataType, newDataType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataType(JvmTypeReference newDataType)
  {
    if (newDataType != dataType)
    {
      NotificationChain msgs = null;
      if (dataType != null)
        msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StubbrLangPackage.SEND_MESSAGE__DATA_TYPE, null, msgs);
      if (newDataType != null)
        msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StubbrLangPackage.SEND_MESSAGE__DATA_TYPE, null, msgs);
      msgs = basicSetDataType(newDataType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.SEND_MESSAGE__DATA_TYPE, newDataType, newDataType));
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
      case StubbrLangPackage.SEND_MESSAGE__DATA_TYPE:
        return basicSetDataType(null, msgs);
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
      case StubbrLangPackage.SEND_MESSAGE__LABEL:
        return getLabel();
      case StubbrLangPackage.SEND_MESSAGE__RECEIVING_ELEMENT:
        if (resolve) return getReceivingElement();
        return basicGetReceivingElement();
      case StubbrLangPackage.SEND_MESSAGE__DATA_TYPE:
        return getDataType();
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
      case StubbrLangPackage.SEND_MESSAGE__LABEL:
        setLabel((String)newValue);
        return;
      case StubbrLangPackage.SEND_MESSAGE__RECEIVING_ELEMENT:
        setReceivingElement((InteractionNode)newValue);
        return;
      case StubbrLangPackage.SEND_MESSAGE__DATA_TYPE:
        setDataType((JvmTypeReference)newValue);
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
      case StubbrLangPackage.SEND_MESSAGE__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case StubbrLangPackage.SEND_MESSAGE__RECEIVING_ELEMENT:
        setReceivingElement((InteractionNode)null);
        return;
      case StubbrLangPackage.SEND_MESSAGE__DATA_TYPE:
        setDataType((JvmTypeReference)null);
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
      case StubbrLangPackage.SEND_MESSAGE__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case StubbrLangPackage.SEND_MESSAGE__RECEIVING_ELEMENT:
        return receivingElement != null;
      case StubbrLangPackage.SEND_MESSAGE__DATA_TYPE:
        return dataType != null;
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
    result.append(" (label: ");
    result.append(label);
    result.append(')');
    return result.toString();
  }

} //SendMessageImpl
