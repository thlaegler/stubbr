//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.09.10 um 03:14:29 AM CEST 
//


package com.laegler.stubbr.lang.ext.model.javaee.v7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         [
 *         The persistence-unit-ref element contains a declaration
 *         of Deployment Component's reference to a persistence unit
 *         associated within a Deployment Component's
 *         environment. It consists of:
 *         
 *         - an optional description
 *         - the persistence unit reference name
 *         - an optional persistence unit name.  If not specified,
 *         the default persistence unit is assumed.
 *         - optional injection targets
 *         
 *         Examples:
 *         
 *         <persistence-unit-ref>
 *         <persistence-unit-ref-name>myPersistenceUnit
 *         </persistence-unit-ref-name>
 *         </persistence-unit-ref>
 *         
 *         <persistence-unit-ref>
 *         <persistence-unit-ref-name>myPersistenceUnit
 *         </persistence-unit-ref-name>
 *         <persistence-unit-name>PersistenceUnit1
 *         </persistence-unit-name>
 *         </persistence-unit-ref>
 *         
 *         
 *       
 * 
 * <p>Java-Klasse für persistence-unit-refType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="persistence-unit-refType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://xmlns.jcp.org/xml/ns/javaee}descriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="persistence-unit-ref-name" type="{http://xmlns.jcp.org/xml/ns/javaee}jndi-nameType"/>
 *         &lt;element name="persistence-unit-name" type="{http://xmlns.jcp.org/xml/ns/javaee}string" minOccurs="0"/>
 *         &lt;group ref="{http://xmlns.jcp.org/xml/ns/javaee}resourceBaseGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistence-unit-refType", propOrder = {
    "description",
    "persistenceUnitRefName",
    "persistenceUnitName",
    "mappedName",
    "injectionTarget"
})
public class PersistenceUnitRefType {

    protected List<DescriptionType> description;
    @XmlElement(name = "persistence-unit-ref-name", required = true)
    protected JndiNameType persistenceUnitRefName;
    @XmlElement(name = "persistence-unit-name")
    protected com.laegler.stubbr.lang.ext.model.javaee.v7.String persistenceUnitName;
    @XmlElement(name = "mapped-name")
    protected XsdStringType mappedName;
    @XmlElement(name = "injection-target")
    protected List<InjectionTargetType> injectionTarget;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Ruft den Wert der persistenceUnitRefName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JndiNameType }
     *     
     */
    public JndiNameType getPersistenceUnitRefName() {
        return persistenceUnitRefName;
    }

    /**
     * Legt den Wert der persistenceUnitRefName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JndiNameType }
     *     
     */
    public void setPersistenceUnitRefName(JndiNameType value) {
        this.persistenceUnitRefName = value;
    }

    /**
     * Ruft den Wert der persistenceUnitName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link com.laegler.stubbr.lang.ext.model.javaee.v7.String }
     *     
     */
    public com.laegler.stubbr.lang.ext.model.javaee.v7.String getPersistenceUnitName() {
        return persistenceUnitName;
    }

    /**
     * Legt den Wert der persistenceUnitName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link com.laegler.stubbr.lang.ext.model.javaee.v7.String }
     *     
     */
    public void setPersistenceUnitName(com.laegler.stubbr.lang.ext.model.javaee.v7.String value) {
        this.persistenceUnitName = value;
    }

    /**
     * Ruft den Wert der mappedName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XsdStringType }
     *     
     */
    public XsdStringType getMappedName() {
        return mappedName;
    }

    /**
     * Legt den Wert der mappedName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XsdStringType }
     *     
     */
    public void setMappedName(XsdStringType value) {
        this.mappedName = value;
    }

    /**
     * Gets the value of the injectionTarget property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the injectionTarget property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInjectionTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InjectionTargetType }
     * 
     * 
     */
    public List<InjectionTargetType> getInjectionTarget() {
        if (injectionTarget == null) {
            injectionTarget = new ArrayList<InjectionTargetType>();
        }
        return this.injectionTarget;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}
