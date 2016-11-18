package org.example.stubbr.soap.client;

import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import java.net.URL;
import javax.annotation.Generated;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.example.stubbr.soap.server.BarSoap;

/**
 * SOAP client for entity Bar
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
public class BarSoapClient {
  /**
   * Call SOAP Endpoint for Entity Bar.
   */
  public static void main(final String[] args) throws Exception {
    final BarSoapClient client = new BarSoapClient();
    final BarSoap port = client.getPort();
  }
  
  /**
   * Get the SOAP Service.
   */
  public BarSoap getPort() {
    try {
      final URL url = new URL("http://localhost:9999/ws/bar?wsdl");
      final QName qname = new QName("http://www.example.org", "BarSoap");
      final Service service = Service.create(url, qname);
      return service.<BarSoap>getPort(BarSoap.class);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
