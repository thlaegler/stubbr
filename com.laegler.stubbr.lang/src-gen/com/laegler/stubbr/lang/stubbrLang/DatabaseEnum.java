/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Database Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getDatabaseEnum()
 * @model
 * @generated
 */
public enum DatabaseEnum implements Enumerator
{
  /**
   * The '<em><b>MYSQL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MYSQL_VALUE
   * @generated
   * @ordered
   */
  MYSQL(0, "MYSQL", "mySql"),

  /**
   * The '<em><b>MONGO DB</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MONGO_DB_VALUE
   * @generated
   * @ordered
   */
  MONGO_DB(1, "MONGO_DB", "mongoDb"),

  /**
   * The '<em><b>ORACLE DB</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ORACLE_DB_VALUE
   * @generated
   * @ordered
   */
  ORACLE_DB(2, "ORACLE_DB", "oracleDb"),

  /**
   * The '<em><b>H2</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #H2_VALUE
   * @generated
   * @ordered
   */
  H2(3, "H2", "h2");

  /**
   * The '<em><b>MYSQL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MYSQL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MYSQL
   * @model literal="mySql"
   * @generated
   * @ordered
   */
  public static final int MYSQL_VALUE = 0;

  /**
   * The '<em><b>MONGO DB</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MONGO DB</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MONGO_DB
   * @model literal="mongoDb"
   * @generated
   * @ordered
   */
  public static final int MONGO_DB_VALUE = 1;

  /**
   * The '<em><b>ORACLE DB</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ORACLE DB</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ORACLE_DB
   * @model literal="oracleDb"
   * @generated
   * @ordered
   */
  public static final int ORACLE_DB_VALUE = 2;

  /**
   * The '<em><b>H2</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>H2</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #H2
   * @model literal="h2"
   * @generated
   * @ordered
   */
  public static final int H2_VALUE = 3;

  /**
   * An array of all the '<em><b>Database Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DatabaseEnum[] VALUES_ARRAY =
    new DatabaseEnum[]
    {
      MYSQL,
      MONGO_DB,
      ORACLE_DB,
      H2,
    };

  /**
   * A public read-only list of all the '<em><b>Database Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DatabaseEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Database Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DatabaseEnum get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DatabaseEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Database Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DatabaseEnum getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DatabaseEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Database Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DatabaseEnum get(int value)
  {
    switch (value)
    {
      case MYSQL_VALUE: return MYSQL;
      case MONGO_DB_VALUE: return MONGO_DB;
      case ORACLE_DB_VALUE: return ORACLE_DB;
      case H2_VALUE: return H2;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private DatabaseEnum(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DatabaseEnum