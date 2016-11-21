package templates._common.src_main_webapp.web_inf;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractXmlTemplate;

/**
 * File Generator for Java Faces descriptor.
 */
@SuppressWarnings("all")
public class FacesConfigXmlTemplateBase extends AbstractXmlTemplate {
  public FacesConfigXmlTemplateBase(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("faces-config");
    this.setRelativPath("/src/main/webapp/WEB-INF/");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<faces-config");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns=\"http://xmlns.jcp.org/xml/ns/javaee\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xsi:schemaLocation=\"http://xmlns.jcp.org/xml/ns/javaee");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("http://xmlns.jcp.org/xml/ns/javaee/web-facesconfig_2_2.xsd\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("version=\"2.2\">");
    _builder.newLine();
    this.setHeader(_builder.toString());
    this.setFooter("</faces-config>");
    this.setDocumentation("Java Faces descriptor");
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!-- TODO -->");
    _builder.newLine();
    return _builder.toString();
  }
}
