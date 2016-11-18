/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.Element#getWidth <em>Width</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.Element#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends UiElement
{
  /**
   * Returns the value of the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' attribute.
   * @see #setWidth(int)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getElement_Width()
   * @model
   * @generated
   */
  int getWidth();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.Element#getWidth <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' attribute.
   * @see #getWidth()
   * @generated
   */
  void setWidth(int value);

  /**
   * Returns the value of the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' attribute.
   * @see #setHeight(int)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getElement_Height()
   * @model
   * @generated
   */
  int getHeight();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.Element#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' attribute.
   * @see #getHeight()
   * @generated
   */
  void setHeight(int value);

} // Element