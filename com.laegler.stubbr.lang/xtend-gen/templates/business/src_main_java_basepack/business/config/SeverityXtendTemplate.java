package templates.business.src_main_java_basepack.business.config;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractXtendTemplate;

/**
 * File template for general severity of status messages.
 */
@SuppressWarnings("all")
public class SeverityXtendTemplate extends AbstractXtendTemplate {
  public SeverityXtendTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("Severity");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = project.getBasePackage();
    _builder.append(_basePackage, "");
    _builder.append(".config");
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
    _builder_1.append("/config/");
    this.setRelativPath(_builder_1.toString());
    this.setDocumentation("General severity of status messages.");
    String _template = this.getTemplate();
    String _withImports = this.withImports(_template);
    this.setContent(_withImports);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("enum ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("MESSAGE, INFO, WARNING, ERROR;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
