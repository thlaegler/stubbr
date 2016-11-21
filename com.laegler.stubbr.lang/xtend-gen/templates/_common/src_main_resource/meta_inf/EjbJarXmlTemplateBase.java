package templates._common.src_main_resource.meta_inf;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractXmlTemplate;

/**
 * File Generator for EJB descriptor (ejb-jar.xml)
 */
@SuppressWarnings("all")
public class EjbJarXmlTemplateBase extends AbstractXmlTemplate {
  public EjbJarXmlTemplateBase(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("ejb-jar");
    this.setRelativPath("/src/main/resources/META-INF/");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<ejb-jar");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("version=\"3.0\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns=\"http://java.sun.com/xml/ns/javaee\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("http://java.sun.com/xml/ns/javaee/ejb-jar_3_0.xsd\">");
    _builder.newLine();
    this.setHeader(_builder.toString());
    this.setFooter("</ejb-jar>");
    this.setDocumentation("EJB descriptor");
  }
}
