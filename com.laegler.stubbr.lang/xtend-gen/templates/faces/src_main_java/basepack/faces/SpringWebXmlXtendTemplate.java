package templates.faces.src_main_java.basepack.faces;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractXtendTemplate;

/**
 * File template for JSF Spring programmatical web.xml.
 */
@SuppressWarnings("all")
public class SpringWebXmlXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public SpringWebXmlXtendTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.entity = this.entity;
    this.setFileName("ApplicationWebXml");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = project.getBasePackage();
    _builder.append(_basePackage, "");
    this.setHeader(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("/src/main/java/");
    String _basePackage_1 = null;
    if (project!=null) {
      _basePackage_1=project.getBasePackage();
    }
    String _path = null;
    if (_basePackage_1!=null) {
      _path=this.toPath(_basePackage_1);
    }
    _builder_1.append(_path, "");
    _builder_1.append("/");
    this.setRelativPath(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("JSF Spring programmatical web.xml for ");
    String _canonicalName = null;
    if (project!=null) {
      _canonicalName=project.getCanonicalName();
    }
    _builder_2.append(_canonicalName, "");
    this.setDocumentation(_builder_2.toString());
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    Project _project = this.getProject();
    String _basePackage = _project.getBasePackage();
    _builder.append(_basePackage, "");
    _builder.append(".config.DefaultProfileUtil");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.springframework.boot.builder.SpringApplicationBuilder");
    _builder.newLine();
    _builder.append("import org.springframework.boot.web.support.SpringBootServletInitializer");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This is a helper Java class that provides an alternative to creating a web.xml.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This will be invoked only when the application is deployed to a servlet container like Tomcat, Jboss etc.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("class ApplicationWebXml extends SpringBootServletInitializer {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override def SpringApplicationBuilder configure(SpringApplicationBuilder application) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("DefaultProfileUtil.addDefaultProfile(application.application())");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("application.sources(JhipexApp)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
