/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang.impl;

import com.laegler.stubbr.lang.stubbrLang.DevProject;
import com.laegler.stubbr.lang.stubbrLang.DevProjectType;
import com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dev Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.DevProjectImpl#getProject <em>Project</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.DevProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.DevProjectImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.DevProjectImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.DevProjectImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DevProjectImpl extends MinimalEObjectImpl.Container implements DevProject
{
  /**
   * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProject()
   * @generated
   * @ordered
   */
  protected static final DevProjectType PROJECT_EDEFAULT = DevProjectType.PARENT;

  /**
   * The cached value of the '{@link #getProject() <em>Project</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProject()
   * @generated
   * @ordered
   */
  protected DevProjectType project = PROJECT_EDEFAULT;

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
   * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuffix()
   * @generated
   * @ordered
   */
  protected static final String SUFFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuffix()
   * @generated
   * @ordered
   */
  protected String suffix = SUFFIX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DevProjectImpl()
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
    return StubbrLangPackage.eINSTANCE.getDevProject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DevProjectType getProject()
  {
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProject(DevProjectType newProject)
  {
    DevProjectType oldProject = project;
    project = newProject == null ? PROJECT_EDEFAULT : newProject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.DEV_PROJECT__PROJECT, oldProject, project));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.DEV_PROJECT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.DEV_PROJECT__LABEL, oldLabel, label));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.DEV_PROJECT__DOCUMENTATION, oldDocumentation, documentation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSuffix()
  {
    return suffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuffix(String newSuffix)
  {
    String oldSuffix = suffix;
    suffix = newSuffix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.DEV_PROJECT__SUFFIX, oldSuffix, suffix));
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
      case StubbrLangPackage.DEV_PROJECT__PROJECT:
        return getProject();
      case StubbrLangPackage.DEV_PROJECT__NAME:
        return getName();
      case StubbrLangPackage.DEV_PROJECT__LABEL:
        return getLabel();
      case StubbrLangPackage.DEV_PROJECT__DOCUMENTATION:
        return getDocumentation();
      case StubbrLangPackage.DEV_PROJECT__SUFFIX:
        return getSuffix();
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
      case StubbrLangPackage.DEV_PROJECT__PROJECT:
        setProject((DevProjectType)newValue);
        return;
      case StubbrLangPackage.DEV_PROJECT__NAME:
        setName((String)newValue);
        return;
      case StubbrLangPackage.DEV_PROJECT__LABEL:
        setLabel((String)newValue);
        return;
      case StubbrLangPackage.DEV_PROJECT__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case StubbrLangPackage.DEV_PROJECT__SUFFIX:
        setSuffix((String)newValue);
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
      case StubbrLangPackage.DEV_PROJECT__PROJECT:
        setProject(PROJECT_EDEFAULT);
        return;
      case StubbrLangPackage.DEV_PROJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StubbrLangPackage.DEV_PROJECT__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case StubbrLangPackage.DEV_PROJECT__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case StubbrLangPackage.DEV_PROJECT__SUFFIX:
        setSuffix(SUFFIX_EDEFAULT);
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
      case StubbrLangPackage.DEV_PROJECT__PROJECT:
        return project != PROJECT_EDEFAULT;
      case StubbrLangPackage.DEV_PROJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StubbrLangPackage.DEV_PROJECT__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case StubbrLangPackage.DEV_PROJECT__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case StubbrLangPackage.DEV_PROJECT__SUFFIX:
        return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
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
    result.append(" (project: ");
    result.append(project);
    result.append(", name: ");
    result.append(name);
    result.append(", label: ");
    result.append(label);
    result.append(", documentation: ");
    result.append(documentation);
    result.append(", suffix: ");
    result.append(suffix);
    result.append(')');
    return result.toString();
  }

} //DevProjectImpl
