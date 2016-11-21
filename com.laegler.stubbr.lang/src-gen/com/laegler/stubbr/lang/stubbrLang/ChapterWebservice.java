/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chapter Webservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.ChapterWebservice#getWebservices <em>Webservices</em>}</li>
 * </ul>
 *
 * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getChapterWebservice()
 * @model
 * @generated
 */
public interface ChapterWebservice extends Chapter
{
  /**
   * Returns the value of the '<em><b>Webservices</b></em>' containment reference list.
   * The list contents are of type {@link com.laegler.stubbr.lang.stubbrLang.Webservice}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Webservices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Webservices</em>' containment reference list.
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getChapterWebservice_Webservices()
   * @model containment="true"
   * @generated
   */
  EList<Webservice> getWebservices();

} // ChapterWebservice
