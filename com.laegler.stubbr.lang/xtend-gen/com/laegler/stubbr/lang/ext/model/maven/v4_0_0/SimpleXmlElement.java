package com.laegler.stubbr.lang.ext.model.maven.v4_0_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleElement")
@SuppressWarnings("all")
public class SimpleXmlElement extends JAXBElement<String> {
  public SimpleXmlElement(final String name, final String value) {
    super(new QName(null, name), String.class, value);
  }
  
  public SimpleXmlElement(final QName name, final Class<String> declaredType, final String value) {
    super(name, declaredType, value);
  }
  
  public SimpleXmlElement(final QName name, final Class<String> declaredType, final Class scope, final String value) {
    super(name, declaredType, scope, value);
  }
}
