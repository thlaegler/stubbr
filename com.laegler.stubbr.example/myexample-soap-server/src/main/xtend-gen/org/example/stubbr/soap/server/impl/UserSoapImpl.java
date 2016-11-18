package org.example.stubbr.soap.server.impl;

import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.ws.rs.core.SecurityContext;
import org.example.stubbr.persistence.service.UserService;
import org.example.stubbr.soap.server.UserSoap;

/**
 * SOAP endpoint implementation for entity User
 * 
 * @author Thomas Laegler {@literal <thomas.laeger[at]googlemail.com>}
 * @since 0.0.1-SNAPSHOT
 * @version 0.0.1-SNAPSHOT
 * @generated 16.11.2016 - 15:09:35
 */
@Since(value = 0.01)
@Until(value = 0.01)
@Generated(value = "templates.soap.server.src_main_java.basepack.soap.server.SoapEndpointImplXtendTemplate")
@WebService(endpointInterface = "org.example.stubbr.soap.server.UserSoap", targetNamespace = "http://www.example.org")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
@SuppressWarnings("all")
public class UserSoapImpl implements UserSoap {
  @Inject
  private UserService userService;
  
  /**
   * Get User with given ID.
   */
  @Override
  public UserDto userGet(final boolean gaga, final /* Bar */Object ref, final SecurityContext securityContext) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from boolean to Long");
  }
  
  /**
   * Create new User.
   */
  @Override
  public String userPost(final boolean gaga, final /* Bar */Object ref, final SecurityContext securityContext) {
    return null;
  }
  
  /**
   * Update given User.
   */
  @Override
  public String userPut(final boolean gaga, final /* Bar */Object ref, final SecurityContext securityContext) {
    return null;
  }
  
  /**
   * Delete given User.
   */
  @Override
  public String userDelete(final boolean gaga, final /* Bar */Object ref, final SecurityContext securityContext) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from boolean to Long");
  }
}
