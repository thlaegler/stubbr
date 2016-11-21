/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang.impl;

import com.laegler.stubbr.lang.stubbrLang.ChapterPersistence;
import com.laegler.stubbr.lang.stubbrLang.Database;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Enumeration;
import com.laegler.stubbr.lang.stubbrLang.Level1Attribute;
import com.laegler.stubbr.lang.stubbrLang.Relationship;
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

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chapter Persistence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterPersistenceImpl#getDatabases <em>Databases</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterPersistenceImpl#getDatasources <em>Datasources</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterPersistenceImpl#getPersistenceUnits <em>Persistence Units</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterPersistenceImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterPersistenceImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterPersistenceImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterPersistenceImpl#isCustomIds <em>Custom Ids</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterPersistenceImpl#getJavaType <em>Java Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChapterPersistenceImpl extends ChapterImpl implements ChapterPersistence
{
  /**
   * The cached value of the '{@link #getDatabases() <em>Databases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabases()
   * @generated
   * @ordered
   */
  protected EList<Database> databases;

  /**
   * The cached value of the '{@link #getDatasources() <em>Datasources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatasources()
   * @generated
   * @ordered
   */
  protected EList<Level1Attribute> datasources;

  /**
   * The cached value of the '{@link #getPersistenceUnits() <em>Persistence Units</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersistenceUnits()
   * @generated
   * @ordered
   */
  protected EList<Level1Attribute> persistenceUnits;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<Entity> entities;

  /**
   * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumerations()
   * @generated
   * @ordered
   */
  protected EList<Enumeration> enumerations;

  /**
   * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationships()
   * @generated
   * @ordered
   */
  protected EList<Relationship> relationships;

  /**
   * The default value of the '{@link #isCustomIds() <em>Custom Ids</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCustomIds()
   * @generated
   * @ordered
   */
  protected static final boolean CUSTOM_IDS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCustomIds() <em>Custom Ids</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCustomIds()
   * @generated
   * @ordered
   */
  protected boolean customIds = CUSTOM_IDS_EDEFAULT;

  /**
   * The cached value of the '{@link #getJavaType() <em>Java Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference javaType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChapterPersistenceImpl()
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
    return StubbrLangPackage.eINSTANCE.getChapterPersistence();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Database> getDatabases()
  {
    if (databases == null)
    {
      databases = new EObjectContainmentEList<Database>(Database.class, this, StubbrLangPackage.CHAPTER_PERSISTENCE__DATABASES);
    }
    return databases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Level1Attribute> getDatasources()
  {
    if (datasources == null)
    {
      datasources = new EObjectContainmentEList<Level1Attribute>(Level1Attribute.class, this, StubbrLangPackage.CHAPTER_PERSISTENCE__DATASOURCES);
    }
    return datasources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Level1Attribute> getPersistenceUnits()
  {
    if (persistenceUnits == null)
    {
      persistenceUnits = new EObjectContainmentEList<Level1Attribute>(Level1Attribute.class, this, StubbrLangPackage.CHAPTER_PERSISTENCE__PERSISTENCE_UNITS);
    }
    return persistenceUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<Entity>(Entity.class, this, StubbrLangPackage.CHAPTER_PERSISTENCE__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Enumeration> getEnumerations()
  {
    if (enumerations == null)
    {
      enumerations = new EObjectContainmentEList<Enumeration>(Enumeration.class, this, StubbrLangPackage.CHAPTER_PERSISTENCE__ENUMERATIONS);
    }
    return enumerations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relationship> getRelationships()
  {
    if (relationships == null)
    {
      relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, StubbrLangPackage.CHAPTER_PERSISTENCE__RELATIONSHIPS);
    }
    return relationships;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCustomIds()
  {
    return customIds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustomIds(boolean newCustomIds)
  {
    boolean oldCustomIds = customIds;
    customIds = newCustomIds;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.CHAPTER_PERSISTENCE__CUSTOM_IDS, oldCustomIds, customIds));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getJavaType()
  {
    return javaType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJavaType(JvmTypeReference newJavaType, NotificationChain msgs)
  {
    JvmTypeReference oldJavaType = javaType;
    javaType = newJavaType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StubbrLangPackage.CHAPTER_PERSISTENCE__JAVA_TYPE, oldJavaType, newJavaType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaType(JvmTypeReference newJavaType)
  {
    if (newJavaType != javaType)
    {
      NotificationChain msgs = null;
      if (javaType != null)
        msgs = ((InternalEObject)javaType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StubbrLangPackage.CHAPTER_PERSISTENCE__JAVA_TYPE, null, msgs);
      if (newJavaType != null)
        msgs = ((InternalEObject)newJavaType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StubbrLangPackage.CHAPTER_PERSISTENCE__JAVA_TYPE, null, msgs);
      msgs = basicSetJavaType(newJavaType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.CHAPTER_PERSISTENCE__JAVA_TYPE, newJavaType, newJavaType));
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
      case StubbrLangPackage.CHAPTER_PERSISTENCE__DATABASES:
        return ((InternalEList<?>)getDatabases()).basicRemove(otherEnd, msgs);
      case StubbrLangPackage.CHAPTER_PERSISTENCE__DATASOURCES:
        return ((InternalEList<?>)getDatasources()).basicRemove(otherEnd, msgs);
      case StubbrLangPackage.CHAPTER_PERSISTENCE__PERSISTENCE_UNITS:
        return ((InternalEList<?>)getPersistenceUnits()).basicRemove(otherEnd, msgs);
      case StubbrLangPackage.CHAPTER_PERSISTENCE__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
      case StubbrLangPackage.CHAPTER_PERSISTENCE__ENUMERATIONS:
        return ((InternalEList<?>)getEnumerations()).basicRemove(otherEnd, msgs);
      case StubbrLangPackage.CHAPTER_PERSISTENCE__RELATIONSHIPS:
        return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
      case StubbrLangPackage.CHAPTER_PERSISTENCE__JAVA_TYPE:
        return basicSetJavaType(null, msgs);
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
      case StubbrLangPackage.CHAPTER_PERSISTENCE__DATABASES:
        return getDatabases();
      case StubbrLangPackage.CHAPTER_PERSISTENCE__DATASOURCES:
        return getDatasources();
      case StubbrLangPackage.CHAPTER_PERSISTENCE__PERSISTENCE_UNITS:
        return getPersistenceUnits();
      case StubbrLangPackage.CHAPTER_PERSISTENCE__ENTITIES:
        return getEntities();
      case StubbrLangPackage.CHAPTER_PERSISTENCE__ENUMERATIONS:
        return getEnumerations();
      case StubbrLangPackage.CHAPTER_PERSISTENCE__RELATIONSHIPS:
        return getRelationships();
      case StubbrLangPackage.CHAPTER_PERSISTENCE__CUSTOM_IDS:
        return isCustomIds();
      case StubbrLangPackage.CHAPTER_PERSISTENCE__JAVA_TYPE:
        return getJavaType();
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
      case StubbrLangPackage.CHAPTER_PERSISTENCE__DATABASES:
        getDatabases().clear();
        getDatabases().addAll((Collection<? extends Database>)newValue);
        return;
      case StubbrLangPackage.CHAPTER_PERSISTENCE__DATASOURCES:
        getDatasources().clear();
        getDatasources().addAll((Collection<? extends Level1Attribute>)newValue);
        return;
      case StubbrLangPackage.CHAPTER_PERSISTENCE__PERSISTENCE_UNITS:
        getPersistenceUnits().clear();
        getPersistenceUnits().addAll((Collection<? extends Level1Attribute>)newValue);
        return;
      case StubbrLangPackage.CHAPTER_PERSISTENCE__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entity>)newValue);
        return;
      case StubbrLangPackage.CHAPTER_PERSISTENCE__ENUMERATIONS:
        getEnumerations().clear();
        getEnumerations().addAll((Collection<? extends Enumeration>)newValue);
        return;
      case StubbrLangPackage.CHAPTER_PERSISTENCE__RELATIONSHIPS:
        getRelationships().clear();
        getRelationships().addAll((Collection<? extends Relationship>)newValue);
        return;
      case StubbrLangPackage.CHAPTER_PERSISTENCE__CUSTOM_IDS:
        setCustomIds((Boolean)newValue);
        return;
      case StubbrLangPackage.CHAPTER_PERSISTENCE__JAVA_TYPE:
        setJavaType((JvmTypeReference)newValue);
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
      case StubbrLangPackage.CHAPTER_PERSISTENCE__DATABASES:
        getDatabases().clear();
        return;
      case StubbrLangPackage.CHAPTER_PERSISTENCE__DATASOURCES:
        getDatasources().clear();
        return;
      case StubbrLangPackage.CHAPTER_PERSISTENCE__PERSISTENCE_UNITS:
        getPersistenceUnits().clear();
        return;
      case StubbrLangPackage.CHAPTER_PERSISTENCE__ENTITIES:
        getEntities().clear();
        return;
      case StubbrLangPackage.CHAPTER_PERSISTENCE__ENUMERATIONS:
        getEnumerations().clear();
        return;
      case StubbrLangPackage.CHAPTER_PERSISTENCE__RELATIONSHIPS:
        getRelationships().clear();
        return;
      case StubbrLangPackage.CHAPTER_PERSISTENCE__CUSTOM_IDS:
        setCustomIds(CUSTOM_IDS_EDEFAULT);
        return;
      case StubbrLangPackage.CHAPTER_PERSISTENCE__JAVA_TYPE:
        setJavaType((JvmTypeReference)null);
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
      case StubbrLangPackage.CHAPTER_PERSISTENCE__DATABASES:
        return databases != null && !databases.isEmpty();
      case StubbrLangPackage.CHAPTER_PERSISTENCE__DATASOURCES:
        return datasources != null && !datasources.isEmpty();
      case StubbrLangPackage.CHAPTER_PERSISTENCE__PERSISTENCE_UNITS:
        return persistenceUnits != null && !persistenceUnits.isEmpty();
      case StubbrLangPackage.CHAPTER_PERSISTENCE__ENTITIES:
        return entities != null && !entities.isEmpty();
      case StubbrLangPackage.CHAPTER_PERSISTENCE__ENUMERATIONS:
        return enumerations != null && !enumerations.isEmpty();
      case StubbrLangPackage.CHAPTER_PERSISTENCE__RELATIONSHIPS:
        return relationships != null && !relationships.isEmpty();
      case StubbrLangPackage.CHAPTER_PERSISTENCE__CUSTOM_IDS:
        return customIds != CUSTOM_IDS_EDEFAULT;
      case StubbrLangPackage.CHAPTER_PERSISTENCE__JAVA_TYPE:
        return javaType != null;
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
    result.append(" (customIds: ");
    result.append(customIds);
    result.append(')');
    return result.toString();
  }

} //ChapterPersistenceImpl
