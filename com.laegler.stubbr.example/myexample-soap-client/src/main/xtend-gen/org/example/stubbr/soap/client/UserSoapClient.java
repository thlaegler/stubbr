package org.example.stubbr.soap.client;

import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import java.net.URL;
import javax.annotation.Generated;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.example.stubbr.soap.server.UserSoap;

/**
 * SOAP client for entity User
 * 
 * @author Thomas Laegler {@literal <thomas.laeger[at]googlemail.com>}
 * @since 0.0.1-SNAPSHOT
 * @version 0.0.1-SNAPSHOT
 * @generated 16.11.2016 - 15:09:35
 */
@Since(value = 0.01)
@Until(value = 0.01)
@Generated(value = "templates.soap.client.src_main_java.basepack.soap.client.SoapClientXtendTemplate")
@SuppressWarnings("all")
public class UserSoapClient {
  /**
   * Call SOAP Endpoint for Entity User.
   */
  public static void main(final String[] args) throws Exception {
    final UserSoapClient client = new UserSoapClient();
    final UserSoap port = client.getPort();
  }
  
  /**
   * Get the SOAP Service.
   */
  public UserSoap getPort() {
    try {
      final URL url = new URL("http://localhost:9999/ws/user?wsdl");
      final QName qname = new QName("http://www.example.org", "UserSoap");
      final Service service = Service.create(url, qname);
      return service.<UserSoap>getPort(UserSoap.class);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
