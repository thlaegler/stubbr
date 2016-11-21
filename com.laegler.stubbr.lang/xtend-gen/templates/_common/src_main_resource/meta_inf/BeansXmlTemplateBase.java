package templates._common.src_main_resource.meta_inf;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractXmlTemplate;

/**
 * File Generator for EJB descriptor.
 */
@SuppressWarnings("all")
public class BeansXmlTemplateBase extends AbstractXmlTemplate {
  public BeansXmlTemplateBase(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("beans");
    this.setRelativPath("/src/main/resources/META-INF/");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<beans");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns=\"http://xmlns.jcp.org/xml/ns/javaee\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xsi:schemaLocation=\"http://xmlns.jcp.org/xml/ns/javaee");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("http://xmlns.jcp.org/xml/ns/javaee/beans_1_1.xsd\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("version=\"1.1\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("bean-discovery-mode=\"annotated\">");
    _builder.newLine();
    this.setHeader(_builder.toString());
    this.setFooter("</beans>");
    this.setDocumentation("EJB descriptor");
  }
}
