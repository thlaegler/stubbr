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
 * A representation of the literals of the enumeration '<em><b>Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getEventType()
 * @model
 * @generated
 */
public enum EventType implements Enumerator
{
  /**
   * The '<em><b>EVENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EVENT_VALUE
   * @generated
   * @ordered
   */
  EVENT(0, "EVENT", "event"),

  /**
   * The '<em><b>START</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #START_VALUE
   * @generated
   * @ordered
   */
  START(1, "START", "start event"),

  /**
   * The '<em><b>THROW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #THROW_VALUE
   * @generated
   * @ordered
   */
  THROW(2, "THROW", "throwing event"),

  /**
   * The '<em><b>CATCH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CATCH_VALUE
   * @generated
   * @ordered
   */
  CATCH(3, "CATCH", "catching event"),

  /**
   * The '<em><b>INTERMEDIATE CATCH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTERMEDIATE_CATCH_VALUE
   * @generated
   * @ordered
   */
  INTERMEDIATE_CATCH(4, "INTERMEDIATE_CATCH", "intermediate catching event"),

  /**
   * The '<em><b>INTERMEDIATE THROW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTERMEDIATE_THROW_VALUE
   * @generated
   * @ordered
   */
  INTERMEDIATE_THROW(5, "INTERMEDIATE_THROW", "intermediate throwing event"),

  /**
   * The '<em><b>END</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #END_VALUE
   * @generated
   * @ordered
   */
  END(6, "END", "end event");

  /**
   * The '<em><b>EVENT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EVENT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EVENT
   * @model literal="event"
   * @generated
   * @ordered
   */
  public static final int EVENT_VALUE = 0;

  /**
   * The '<em><b>START</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>START</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #START
   * @model literal="start event"
   * @generated
   * @ordered
   */
  public static final int START_VALUE = 1;

  /**
   * The '<em><b>THROW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>THROW</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #THROW
   * @model literal="throwing event"
   * @generated
   * @ordered
   */
  public static final int THROW_VALUE = 2;

  /**
   * The '<em><b>CATCH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CATCH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CATCH
   * @model literal="catching event"
   * @generated
   * @ordered
   */
  public static final int CATCH_VALUE = 3;

  /**
   * The '<em><b>INTERMEDIATE CATCH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INTERMEDIATE CATCH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTERMEDIATE_CATCH
   * @model literal="intermediate catching event"
   * @generated
   * @ordered
   */
  public static final int INTERMEDIATE_CATCH_VALUE = 4;

  /**
   * The '<em><b>INTERMEDIATE THROW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INTERMEDIATE THROW</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTERMEDIATE_THROW
   * @model literal="intermediate throwing event"
   * @generated
   * @ordered
   */
  public static final int INTERMEDIATE_THROW_VALUE = 5;

  /**
   * The '<em><b>END</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>END</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #END
   * @model literal="end event"
   * @generated
   * @ordered
   */
  public static final int END_VALUE = 6;

  /**
   * An array of all the '<em><b>Event Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EventType[] VALUES_ARRAY =
    new EventType[]
    {
      EVENT,
      START,
      THROW,
      CATCH,
      INTERMEDIATE_CATCH,
      INTERMEDIATE_THROW,
      END,
    };

  /**
   * A public read-only list of all the '<em><b>Event Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Event Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EventType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EventType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Event Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EventType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EventType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Event Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EventType get(int value)
  {
    switch (value)
    {
      case EVENT_VALUE: return EVENT;
      case START_VALUE: return START;
      case THROW_VALUE: return THROW;
      case CATCH_VALUE: return CATCH;
      case INTERMEDIATE_CATCH_VALUE: return INTERMEDIATE_CATCH;
      case INTERMEDIATE_THROW_VALUE: return INTERMEDIATE_THROW;
      case END_VALUE: return END;
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
  private EventType(int value, String name, String literal)
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
  
} //EventType
