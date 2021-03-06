/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang.impl;

import com.laegler.stubbr.lang.stubbrLang.JvmEnum;
import com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.RuntimeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.RuntimeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.RuntimeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.RuntimeImpl#getJdkVersion <em>Jdk Version</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.RuntimeImpl#getJvm <em>Jvm</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.RuntimeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeImpl extends MinimalEObjectImpl.Container implements com.laegler.stubbr.lang.stubbrLang.Runtime
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
   * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected static final String DOCUMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected String documentation = DOCUMENTATION_EDEFAULT;

  /**
   * The default value of the '{@link #getJdkVersion() <em>Jdk Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJdkVersion()
   * @generated
   * @ordered
   */
  protected static final String JDK_VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJdkVersion() <em>Jdk Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJdkVersion()
   * @generated
   * @ordered
   */
  protected String jdkVersion = JDK_VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getJvm() <em>Jvm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJvm()
   * @generated
   * @ordered
   */
  protected static final JvmEnum JVM_EDEFAULT = JvmEnum.JAVA_SE_18;

  /**
   * The cached value of the '{@link #getJvm() <em>Jvm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJvm()
   * @generated
   * @ordered
   */
  protected JvmEnum jvm = JVM_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuntimeImpl()
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
    return StubbrLangPackage.eINSTANCE.getRuntime();
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
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.RUNTIME__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.RUNTIME__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDocumentation()
  {
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocumentation(String newDocumentation)
  {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.RUNTIME__DOCUMENTATION, oldDocumentation, documentation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJdkVersion()
  {
    return jdkVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJdkVersion(String newJdkVersion)
  {
    String oldJdkVersion = jdkVersion;
    jdkVersion = newJdkVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.RUNTIME__JDK_VERSION, oldJdkVersion, jdkVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmEnum getJvm()
  {
    return jvm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJvm(JvmEnum newJvm)
  {
    JvmEnum oldJvm = jvm;
    jvm = newJvm == null ? JVM_EDEFAULT : newJvm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.RUNTIME__JVM, oldJvm, jvm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.RUNTIME__VERSION, oldVersion, version));
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
      case StubbrLangPackage.RUNTIME__NAME:
        return getName();
      case StubbrLangPackage.RUNTIME__LABEL:
        return getLabel();
      case StubbrLangPackage.RUNTIME__DOCUMENTATION:
        return getDocumentation();
      case StubbrLangPackage.RUNTIME__JDK_VERSION:
        return getJdkVersion();
      case StubbrLangPackage.RUNTIME__JVM:
        return getJvm();
      case StubbrLangPackage.RUNTIME__VERSION:
        return getVersion();
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
      case StubbrLangPackage.RUNTIME__NAME:
        setName((String)newValue);
        return;
      case StubbrLangPackage.RUNTIME__LABEL:
        setLabel((String)newValue);
        return;
      case StubbrLangPackage.RUNTIME__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case StubbrLangPackage.RUNTIME__JDK_VERSION:
        setJdkVersion((String)newValue);
        return;
      case StubbrLangPackage.RUNTIME__JVM:
        setJvm((JvmEnum)newValue);
        return;
      case StubbrLangPackage.RUNTIME__VERSION:
        setVersion((String)newValue);
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
      case StubbrLangPackage.RUNTIME__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StubbrLangPackage.RUNTIME__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case StubbrLangPackage.RUNTIME__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case StubbrLangPackage.RUNTIME__JDK_VERSION:
        setJdkVersion(JDK_VERSION_EDEFAULT);
        return;
      case StubbrLangPackage.RUNTIME__JVM:
        setJvm(JVM_EDEFAULT);
        return;
      case StubbrLangPackage.RUNTIME__VERSION:
        setVersion(VERSION_EDEFAULT);
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
      case StubbrLangPackage.RUNTIME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StubbrLangPackage.RUNTIME__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case StubbrLangPackage.RUNTIME__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case StubbrLangPackage.RUNTIME__JDK_VERSION:
        return JDK_VERSION_EDEFAULT == null ? jdkVersion != null : !JDK_VERSION_EDEFAULT.equals(jdkVersion);
      case StubbrLangPackage.RUNTIME__JVM:
        return jvm != JVM_EDEFAULT;
      case StubbrLangPackage.RUNTIME__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
    result.append(", label: ");
    result.append(label);
    result.append(", documentation: ");
    result.append(documentation);
    result.append(", jdkVersion: ");
    result.append(jdkVersion);
    result.append(", jvm: ");
    result.append(jvm);
    result.append(", version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //RuntimeImpl
