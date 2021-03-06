/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang.impl;

import com.laegler.stubbr.lang.stubbrLang.BusinessProcess;
import com.laegler.stubbr.lang.stubbrLang.CallActivity;
import com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.CallActivityImpl#getCalledElement <em>Called Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallActivityImpl extends ActivityImpl implements CallActivity
{
  /**
   * The cached value of the '{@link #getCalledElement() <em>Called Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalledElement()
   * @generated
   * @ordered
   */
  protected BusinessProcess calledElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallActivityImpl()
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
    return StubbrLangPackage.eINSTANCE.getCallActivity();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessProcess getCalledElement()
  {
    if (calledElement != null && calledElement.eIsProxy())
    {
      InternalEObject oldCalledElement = (InternalEObject)calledElement;
      calledElement = (BusinessProcess)eResolveProxy(oldCalledElement);
      if (calledElement != oldCalledElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StubbrLangPackage.CALL_ACTIVITY__CALLED_ELEMENT, oldCalledElement, calledElement));
      }
    }
    return calledElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessProcess basicGetCalledElement()
  {
    return calledElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCalledElement(BusinessProcess newCalledElement)
  {
    BusinessProcess oldCalledElement = calledElement;
    calledElement = newCalledElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.CALL_ACTIVITY__CALLED_ELEMENT, oldCalledElement, calledElement));
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
      case StubbrLangPackage.CALL_ACTIVITY__CALLED_ELEMENT:
        if (resolve) return getCalledElement();
        return basicGetCalledElement();
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
      case StubbrLangPackage.CALL_ACTIVITY__CALLED_ELEMENT:
        setCalledElement((BusinessProcess)newValue);
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
      case StubbrLangPackage.CALL_ACTIVITY__CALLED_ELEMENT:
        setCalledElement((BusinessProcess)null);
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
      case StubbrLangPackage.CALL_ACTIVITY__CALLED_ELEMENT:
        return calledElement != null;
    }
    return super.eIsSet(featureID);
  }

} //CallActivityImpl
