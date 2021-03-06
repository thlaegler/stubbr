/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang.impl;

import com.laegler.stubbr.lang.stubbrLang.ChapterWebservice;
import com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage;
import com.laegler.stubbr.lang.stubbrLang.Webservice;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chapter Webservice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterWebserviceImpl#getWebservices <em>Webservices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChapterWebserviceImpl extends ChapterImpl implements ChapterWebservice
{
  /**
   * The cached value of the '{@link #getWebservices() <em>Webservices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWebservices()
   * @generated
   * @ordered
   */
  protected EList<Webservice> webservices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChapterWebserviceImpl()
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
    return StubbrLangPackage.eINSTANCE.getChapterWebservice();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Webservice> getWebservices()
  {
    if (webservices == null)
    {
      webservices = new EObjectContainmentEList<Webservice>(Webservice.class, this, StubbrLangPackage.CHAPTER_WEBSERVICE__WEBSERVICES);
    }
    return webservices;
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
      case StubbrLangPackage.CHAPTER_WEBSERVICE__WEBSERVICES:
        return ((InternalEList<?>)getWebservices()).basicRemove(otherEnd, msgs);
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
      case StubbrLangPackage.CHAPTER_WEBSERVICE__WEBSERVICES:
        return getWebservices();
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
      case StubbrLangPackage.CHAPTER_WEBSERVICE__WEBSERVICES:
        getWebservices().clear();
        getWebservices().addAll((Collection<? extends Webservice>)newValue);
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
      case StubbrLangPackage.CHAPTER_WEBSERVICE__WEBSERVICES:
        getWebservices().clear();
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
      case StubbrLangPackage.CHAPTER_WEBSERVICE__WEBSERVICES:
        return webservices != null && !webservices.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ChapterWebserviceImpl
