package org.example.stubbr.soap.server;

import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import javax.annotation.Generated;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.ws.rs.core.SecurityContext;

/**
 * SOAP endpoint interface for entity User
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
public interface UserSoap {
  /**
   * Get User with given ID.
   */
  @WebMethod
  public abstract /* UserDto */Object userGet(final boolean gaga, final /* Bar */Object ref, final SecurityContext securityContext);
  
  /**
   * Create new User.
   */
  @WebMethod
  public abstract String userPost(final boolean gaga, final /* Bar */Object ref, final SecurityContext securityContext);
  
  /**
   * Update given User.
   */
  @WebMethod
  public abstract String userPut(final boolean gaga, final /* Bar */Object ref, final SecurityContext securityContext);
  
  /**
   * Delete given User.
   */
  @WebMethod
  public abstract String userDelete(final boolean gaga, final /* Bar */Object ref, final SecurityContext securityContext);
}
