/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang.impl;

import com.laegler.stubbr.lang.stubbrLang.ChapterGlobals;
import com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chapter Globals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterGlobalsImpl#getLoggerName <em>Logger Name</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterGlobalsImpl#getLoggerType <em>Logger Type</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterGlobalsImpl#isUseSpringMVC <em>Use Spring MVC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChapterGlobalsImpl extends ChapterImpl implements ChapterGlobals
{
  /**
   * The default value of the '{@link #getLoggerName() <em>Logger Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoggerName()
   * @generated
   * @ordered
   */
  protected static final String LOGGER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLoggerName() <em>Logger Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoggerName()
   * @generated
   * @ordered
   */
  protected String loggerName = LOGGER_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLoggerType() <em>Logger Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoggerType()
   * @generated
   * @ordered
   */
  protected static final String LOGGER_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLoggerType() <em>Logger Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoggerType()
   * @generated
   * @ordered
   */
  protected String loggerType = LOGGER_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isUseSpringMVC() <em>Use Spring MVC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUseSpringMVC()
   * @generated
   * @ordered
   */
  protected static final boolean USE_SPRING_MVC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUseSpringMVC() <em>Use Spring MVC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUseSpringMVC()
   * @generated
   * @ordered
   */
  protected boolean useSpringMVC = USE_SPRING_MVC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChapterGlobalsImpl()
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
    return StubbrLangPackage.eINSTANCE.getChapterGlobals();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLoggerName()
  {
    return loggerName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoggerName(String newLoggerName)
  {
    String oldLoggerName = loggerName;
    loggerName = newLoggerName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.CHAPTER_GLOBALS__LOGGER_NAME, oldLoggerName, loggerName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLoggerType()
  {
    return loggerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoggerType(String newLoggerType)
  {
    String oldLoggerType = loggerType;
    loggerType = newLoggerType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.CHAPTER_GLOBALS__LOGGER_TYPE, oldLoggerType, loggerType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUseSpringMVC()
  {
    return useSpringMVC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUseSpringMVC(boolean newUseSpringMVC)
  {
    boolean oldUseSpringMVC = useSpringMVC;
    useSpringMVC = newUseSpringMVC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.CHAPTER_GLOBALS__USE_SPRING_MVC, oldUseSpringMVC, useSpringMVC));
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
      case StubbrLangPackage.CHAPTER_GLOBALS__LOGGER_NAME:
        return getLoggerName();
      case StubbrLangPackage.CHAPTER_GLOBALS__LOGGER_TYPE:
        return getLoggerType();
      case StubbrLangPackage.CHAPTER_GLOBALS__USE_SPRING_MVC:
        return isUseSpringMVC();
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
      case StubbrLangPackage.CHAPTER_GLOBALS__LOGGER_NAME:
        setLoggerName((String)newValue);
        return;
      case StubbrLangPackage.CHAPTER_GLOBALS__LOGGER_TYPE:
        setLoggerType((String)newValue);
        return;
      case StubbrLangPackage.CHAPTER_GLOBALS__USE_SPRING_MVC:
        setUseSpringMVC((Boolean)newValue);
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
      case StubbrLangPackage.CHAPTER_GLOBALS__LOGGER_NAME:
        setLoggerName(LOGGER_NAME_EDEFAULT);
        return;
      case StubbrLangPackage.CHAPTER_GLOBALS__LOGGER_TYPE:
        setLoggerType(LOGGER_TYPE_EDEFAULT);
        return;
      case StubbrLangPackage.CHAPTER_GLOBALS__USE_SPRING_MVC:
        setUseSpringMVC(USE_SPRING_MVC_EDEFAULT);
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
      case StubbrLangPackage.CHAPTER_GLOBALS__LOGGER_NAME:
        return LOGGER_NAME_EDEFAULT == null ? loggerName != null : !LOGGER_NAME_EDEFAULT.equals(loggerName);
      case StubbrLangPackage.CHAPTER_GLOBALS__LOGGER_TYPE:
        return LOGGER_TYPE_EDEFAULT == null ? loggerType != null : !LOGGER_TYPE_EDEFAULT.equals(loggerType);
      case StubbrLangPackage.CHAPTER_GLOBALS__USE_SPRING_MVC:
        return useSpringMVC != USE_SPRING_MVC_EDEFAULT;
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
    result.append(" (loggerName: ");
    result.append(loggerName);
    result.append(", loggerType: ");
    result.append(loggerType);
    result.append(", useSpringMVC: ");
    result.append(useSpringMVC);
    result.append(')');
    return result.toString();
  }

} //ChapterGlobalsImpl