//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.09.10 um 03:02:03 AM CEST 
//


package com.laegler.stubbr.lang.ext.model.persistence.v2_1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.laegler.stubbr.lang.ext.model.persistence.v2_1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.laegler.stubbr.lang.ext.model.persistence.v2_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Persistence }
     * 
     */
    public Persistence createPersistence() {
        return new Persistence();
    }

    /**
     * Create an instance of {@link Persistence.PersistenceUnit }
     * 
     */
    public Persistence.PersistenceUnit createPersistencePersistenceUnit() {
        return new Persistence.PersistenceUnit();
    }

    /**
     * Create an instance of {@link Persistence.PersistenceUnit.Properties }
     * 
     */
    public Persistence.PersistenceUnit.Properties createPersistencePersistenceUnitProperties() {
        return new Persistence.PersistenceUnit.Properties();
    }

    /**
     * Create an instance of {@link Persistence.PersistenceUnit.Properties.Property }
     * 
     */
    public Persistence.PersistenceUnit.Properties.Property createPersistencePersistenceUnitPropertiesProperty() {
        return new Persistence.PersistenceUnit.Properties.Property();
    }

}
