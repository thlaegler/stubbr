/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.InputField#getType <em>Type</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.InputField#getJavaType <em>Java Type</em>}</li>
 * </ul>
 *
 * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getInputField()
 * @model
 * @generated
 */
public interface InputField extends Element
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Entity)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getInputField_Type()
   * @model
   * @generated
   */
  Entity getType();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.InputField#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Entity value);

  /**
   * Returns the value of the '<em><b>Java Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Type</em>' reference.
   * @see #setJavaType(JvmType)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getInputField_JavaType()
   * @model
   * @generated
   */
  JvmType getJavaType();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.InputField#getJavaType <em>Java Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Type</em>' reference.
   * @see #getJavaType()
   * @generated
   */
  void setJavaType(JvmType value);

} // InputField
