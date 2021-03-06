/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.Scenario#getLabel <em>Label</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.Scenario#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.Scenario#getGivenSteps <em>Given Steps</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.Scenario#getWhenSteps <em>When Steps</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.Scenario#getThenSteps <em>Then Steps</em>}</li>
 * </ul>
 *
 * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getScenario_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.Scenario#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getScenario_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.Scenario#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' attribute.
   * @see #setDocumentation(String)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getScenario_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.Scenario#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

  /**
   * Returns the value of the '<em><b>Given Steps</b></em>' containment reference list.
   * The list contents are of type {@link com.laegler.stubbr.lang.stubbrLang.GivenStep}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Given Steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Given Steps</em>' containment reference list.
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getScenario_GivenSteps()
   * @model containment="true"
   * @generated
   */
  EList<GivenStep> getGivenSteps();

  /**
   * Returns the value of the '<em><b>When Steps</b></em>' containment reference list.
   * The list contents are of type {@link com.laegler.stubbr.lang.stubbrLang.WhenStep}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When Steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When Steps</em>' containment reference list.
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getScenario_WhenSteps()
   * @model containment="true"
   * @generated
   */
  EList<WhenStep> getWhenSteps();

  /**
   * Returns the value of the '<em><b>Then Steps</b></em>' containment reference list.
   * The list contents are of type {@link com.laegler.stubbr.lang.stubbrLang.ThenStep}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Steps</em>' containment reference list.
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getScenario_ThenSteps()
   * @model containment="true"
   * @generated
   */
  EList<ThenStep> getThenSteps();

} // Scenario
