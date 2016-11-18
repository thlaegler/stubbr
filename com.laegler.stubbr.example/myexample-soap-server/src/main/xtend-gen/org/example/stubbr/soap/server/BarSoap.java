package org.example.stubbr.soap.server;

import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import javax.annotation.Generated;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.ws.rs.core.SecurityContext;

/**
 * SOAP endpoint interface for entity Bar
 * 
 * @author Thomas Laegler {@literal <thomas.laeger[at]googlemail.com>}
 * @since 0.0.1-SNAPSHOT
 * @version 0.0.1-SNAPSHOT
 * @generated 16.11.2016 - 15:09:35
 */
@Since(value = 0.01)
@Until(value = 0.01)
@Generated(value = "templates.soap.server.src_main_java.basepack.soap.server.SoapEndpointInterfaceXtendTemplate")
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
@SuppressWarnings("all")
public interface BarSoap {
  /**
   * Get Bar with given ID.
   */
  @WebMethod
  public abstract /* BarDto */Object barGet(final long account, final SecurityContext securityContext);
  
  /**
   * Create new Bar.
   */
  @WebMethod
  public abstract String barPost(final long account, final SecurityContext securityContext);
  
  /**
   * Update given Bar.
   */
  @WebMethod
  public abstract String barPut(final long account, final SecurityContext securityContext);
  
  /**
   * Delete given Bar.
   */
  @WebMethod
  public abstract String barDelete(final long account, final SecurityContext securityContext);
}
