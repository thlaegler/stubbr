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
 * 
 *         Declares the handler for a port-component, service-ref. Handlers can
 *         access the init-param name/value pairs using the HandlerInfo interface.
 *         
 *         Used in: port-component, service-ref
 *         
 *       
 * 
 * <p>Java-Klasse für handlerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="handlerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://xmlns.jcp.org/xml/ns/javaee}descriptionGroup"/>
 *         &lt;element name="handler-name" type="{http://xmlns.jcp.org/xml/ns/javaee}string"/>
 *         &lt;element name="handler-class" type="{http://xmlns.jcp.org/xml/ns/javaee}fully-qualified-classType"/>
 *         &lt;element name="init-param" type="{http://xmlns.jcp.org/xml/ns/javaee}param-valueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="soap-header" type="{http://xmlns.jcp.org/xml/ns/javaee}xsdQNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="soap-role" type="{http://xmlns.jcp.org/xml/ns/javaee}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="port-name" type="{http://xmlns.jcp.org/xml/ns/javaee}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "handlerType", propOrder = {
    "description",
    "displayName",
    "icon",
    "handlerName",
    "handlerClass",
    "initParam",
    "soapHeader",
    "soapRole",
    "portName"
})
public class HandlerType {

    protected List<DescriptionType> description;
    @XmlElement(name = "display-name")
    protected List<DisplayNameType> displayName;
    protected List<IconType> icon;
    @XmlElement(name = "handler-name", required = true)
    protected com.laegler.stubbr.lang.ext.model.javaee.v7.String handlerName;
    @XmlElement(name = "handler-class", required = true)
    protected FullyQualifiedClassType handlerClass;
    @XmlElement(name = "init-param")
    protected List<ParamValueType> initParam;
    @XmlElement(name = "soap-header")
    protected List<XsdQNameType> soapHeader;
    @XmlElement(name = "soap-role")
    protected List<com.laegler.stubbr.lang.ext.model.javaee.v7.String> soapRole;
    @XmlElement(name = "port-name")
    protected List<com.laegler.stubbr.lang.ext.model.javaee.v7.String> portName;
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
     * Gets the value of the displayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayNameType }
     * 
     * 
     */
    public List<DisplayNameType> getDisplayName() {
        if (displayName == null) {
            displayName = new ArrayList<DisplayNameType>();
        }
        return this.displayName;
    }

    /**
     * Gets the value of the icon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIcon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IconType }
     * 
     * 
     */
    public List<IconType> getIcon() {
        if (icon == null) {
            icon = new ArrayList<IconType>();
        }
        return this.icon;
    }

    /**
     * Ruft den Wert der handlerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link com.laegler.stubbr.lang.ext.model.javaee.v7.String }
     *     
     */
    public com.laegler.stubbr.lang.ext.model.javaee.v7.String getHandlerName() {
        return handlerName;
    }

    /**
     * Legt den Wert der handlerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link com.laegler.stubbr.lang.ext.model.javaee.v7.String }
     *     
     */
    public void setHandlerName(com.laegler.stubbr.lang.ext.model.javaee.v7.String value) {
        this.handlerName = value;
    }

    /**
     * Ruft den Wert der handlerClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public FullyQualifiedClassType getHandlerClass() {
        return handlerClass;
    }

    /**
     * Legt den Wert der handlerClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public void setHandlerClass(FullyQualifiedClassType value) {
        this.handlerClass = value;
    }

    /**
     * Gets the value of the initParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamValueType }
     * 
     * 
     */
    public List<ParamValueType> getInitParam() {
        if (initParam == null) {
            initParam = new ArrayList<ParamValueType>();
        }
        return this.initParam;
    }

    /**
     * Gets the value of the soapHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soapHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoapHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XsdQNameType }
     * 
     * 
     */
    public List<XsdQNameType> getSoapHeader() {
        if (soapHeader == null) {
            soapHeader = new ArrayList<XsdQNameType>();
        }
        return this.soapHeader;
    }

    /**
     * Gets the value of the soapRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soapRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoapRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.laegler.stubbr.lang.ext.model.javaee.v7.String }
     * 
     * 
     */
    public List<com.laegler.stubbr.lang.ext.model.javaee.v7.String> getSoapRole() {
        if (soapRole == null) {
            soapRole = new ArrayList<com.laegler.stubbr.lang.ext.model.javaee.v7.String>();
        }
        return this.soapRole;
    }

    /**
     * Gets the value of the portName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.laegler.stubbr.lang.ext.model.javaee.v7.String }
     * 
     * 
     */
    public List<com.laegler.stubbr.lang.ext.model.javaee.v7.String> getPortName() {
        if (portName == null) {
            portName = new ArrayList<com.laegler.stubbr.lang.ext.model.javaee.v7.String>();
        }
        return this.portName;
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
