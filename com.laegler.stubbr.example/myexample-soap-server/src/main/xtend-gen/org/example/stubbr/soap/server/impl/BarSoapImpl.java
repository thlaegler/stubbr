package org.example.stubbr.soap.server.impl;

import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.ws.rs.core.SecurityContext;
import org.example.stubbr.persistence.service.BarService;
import org.example.stubbr.soap.server.BarSoap;

/**
 * SOAP endpoint implementation for entity Bar
 * 
 * @author Thomas Laegler {@literal <thomas.laeger[at]googlemail.com>}
 * @since 0.0.1-SNAPSHOT
 * @version 0.0.1-SNAPSHOT
 * @generated 16.11.2016 - 15:09:35
 */
@Since(value = 0.01)
@Until(value = 0.01)
@Generated(value = "templates.soap.server.src_main_java.basepack.soap.server.SoapEndpointImplXtendTemplate")
@WebService(endpointInterface = "org.example.stubbr.soap.server.BarSoap", targetNamespace = "http://www.example.org")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
@SuppressWarnings("all")
public class BarSoapImpl implements BarSoap {
  @Inject
  private BarService barService;
  
  /**
   * Get Bar with given ID.
   */
  @Override
  public BarDto barGet(final long account, final SecurityContext securityContext) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method findOne(long) is undefined for the type BarService");
  }
  
  /**
   * Create new Bar.
   */
  @Override
  public String barPost(final long account, final SecurityContext securityContext) {
    return null;
  }
  
  /**
   * Update given Bar.
   */
  @Override
  public String barPut(final long account, final SecurityContext securityContext) {
    return null;
  }
  
  /**
   * Delete given Bar.
   */
  @Override
  public String barDelete(final long account, final SecurityContext securityContext) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method delete(long) is undefined for the type BarService");
  }
}
