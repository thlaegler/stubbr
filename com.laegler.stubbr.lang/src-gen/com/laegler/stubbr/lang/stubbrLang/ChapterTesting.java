/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chapter Testing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.ChapterTesting#getTestMethods <em>Test Methods</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.ChapterTesting#getTestCases <em>Test Cases</em>}</li>
 * </ul>
 *
 * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getChapterTesting()
 * @model
 * @generated
 */
public interface ChapterTesting extends Chapter
{
  /**
   * Returns the value of the '<em><b>Test Methods</b></em>' containment reference list.
   * The list contents are of type {@link com.laegler.stubbr.lang.stubbrLang.Level1Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Methods</em>' containment reference list.
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getChapterTesting_TestMethods()
   * @model containment="true"
   * @generated
   */
  EList<Level1Attribute> getTestMethods();

  /**
   * Returns the value of the '<em><b>Test Cases</b></em>' containment reference list.
   * The list contents are of type {@link com.laegler.stubbr.lang.stubbrLang.Level1Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Cases</em>' containment reference list.
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getChapterTesting_TestCases()
   * @model containment="true"
   * @generated
   */
  EList<Level1Attribute> getTestCases();

} // ChapterTesting