package templates.rest.server.src_main_webapp.web_inf;

import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * File Generator for web.xml
 */
@SuppressWarnings("all")
public class WebXmlFile /* implements XmlTemplateFile<Entity>  */{
  @Inject
  @Extension
  private StubbrRegistry _stubbrRegistry;
  
  @Override
  public CharSequence getDocumentation() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("The Web Project Description File");
    return _builder;
  }
  
  @Override
  public CharSequence getTemplateName() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field class is undefined for the type WebXmlFile"
      + "\nname cannot be resolved");
  }
  
  @Override
  public CharSequence getFileName() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("web");
    return _builder;
  }
  
  @Override
  public CharSequence getPath() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field parentDir is undefined"
      + "\nThe method getProject() from the type WebXmlFile refers to the missing type ProjectType"
      + "\ngetName cannot be resolved");
  }
  
  @Override
  public /* ProjectType */Object getProject() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ProjectType is undefined"
      + "\nREST_SERVER cannot be resolved");
  }
  
  @Override
  public CharSequence getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    String _header = this.getHeader();
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<display-name>pmbok-web</display-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>The Rest Project</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<servlet>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<description>JAX-RS Tools Generated - Do not modify</description>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<servlet-name>JAX-RS Servlet</servlet-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<load-on-startup>1</load-on-startup>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</servlet>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<servlet-mapping>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<servlet-name>JAX-RS Servlet</servlet-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<url-pattern>/jaxrs/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</servlet-mapping>");
    _builder.newLine();
    String _footer = this.getFooter();
    _builder.append(_footer, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  protected String getHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<web-app xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns=\"http://java.sun.com/xml/ns/javaee\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("version=\"3.0\">");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  protected String getPlainText(final String text) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(text, "");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  protected String getFooter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</web-app>");
    _builder.newLine();
    return _builder.toString();
  }
}
