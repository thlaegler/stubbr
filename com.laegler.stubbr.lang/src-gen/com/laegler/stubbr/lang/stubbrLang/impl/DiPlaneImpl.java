/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang.impl;

import com.laegler.stubbr.lang.stubbrLang.BusinessProcess;
import com.laegler.stubbr.lang.stubbrLang.DiPlane;
import com.laegler.stubbr.lang.stubbrLang.DiPlaneElement;
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
 * An implementation of the model object '<em><b>Di Plane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.DiPlaneImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.DiPlaneImpl#getBpmnElement <em>Bpmn Element</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.DiPlaneImpl#getPlaneElements <em>Plane Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiPlaneImpl extends DiDiagramElementImpl implements DiPlane
{
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
   * The cached value of the '{@link #getBpmnElement() <em>Bpmn Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBpmnElement()
   * @generated
   * @ordered
   */
  protected BusinessProcess bpmnElement;

  /**
   * The cached value of the '{@link #getPlaneElements() <em>Plane Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlaneElements()
   * @generated
   * @ordered
   */
  protected EList<DiPlaneElement> planeElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiPlaneImpl()
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
    return StubbrLangPackage.eINSTANCE.getDiPlane();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.DI_PLANE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessProcess getBpmnElement()
  {
    if (bpmnElement != null && bpmnElement.eIsProxy())
    {
      InternalEObject oldBpmnElement = (InternalEObject)bpmnElement;
      bpmnElement = (BusinessProcess)eResolveProxy(oldBpmnElement);
      if (bpmnElement != oldBpmnElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StubbrLangPackage.DI_PLANE__BPMN_ELEMENT, oldBpmnElement, bpmnElement));
      }
    }
    return bpmnElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessProcess basicGetBpmnElement()
  {
    return bpmnElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBpmnElement(BusinessProcess newBpmnElement)
  {
    BusinessProcess oldBpmnElement = bpmnElement;
    bpmnElement = newBpmnElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.DI_PLANE__BPMN_ELEMENT, oldBpmnElement, bpmnElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DiPlaneElement> getPlaneElements()
  {
    if (planeElements == null)
    {
      planeElements = new EObjectContainmentEList<DiPlaneElement>(DiPlaneElement.class, this, StubbrLangPackage.DI_PLANE__PLANE_ELEMENTS);
    }
    return planeElements;
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
      case StubbrLangPackage.DI_PLANE__PLANE_ELEMENTS:
        return ((InternalEList<?>)getPlaneElements()).basicRemove(otherEnd, msgs);
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
      case StubbrLangPackage.DI_PLANE__NAME:
        return getName();
      case StubbrLangPackage.DI_PLANE__BPMN_ELEMENT:
        if (resolve) return getBpmnElement();
        return basicGetBpmnElement();
      case StubbrLangPackage.DI_PLANE__PLANE_ELEMENTS:
        return getPlaneElements();
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
      case StubbrLangPackage.DI_PLANE__NAME:
        setName((String)newValue);
        return;
      case StubbrLangPackage.DI_PLANE__BPMN_ELEMENT:
        setBpmnElement((BusinessProcess)newValue);
        return;
      case StubbrLangPackage.DI_PLANE__PLANE_ELEMENTS:
        getPlaneElements().clear();
        getPlaneElements().addAll((Collection<? extends DiPlaneElement>)newValue);
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
      case StubbrLangPackage.DI_PLANE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StubbrLangPackage.DI_PLANE__BPMN_ELEMENT:
        setBpmnElement((BusinessProcess)null);
        return;
      case StubbrLangPackage.DI_PLANE__PLANE_ELEMENTS:
        getPlaneElements().clear();
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
      case StubbrLangPackage.DI_PLANE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StubbrLangPackage.DI_PLANE__BPMN_ELEMENT:
        return bpmnElement != null;
      case StubbrLangPackage.DI_PLANE__PLANE_ELEMENTS:
        return planeElements != null && !planeElements.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DiPlaneImpl
