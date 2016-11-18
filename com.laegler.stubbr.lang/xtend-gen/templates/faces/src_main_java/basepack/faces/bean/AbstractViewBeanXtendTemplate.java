package templates.faces.src_main_java.basepack.faces.bean;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractXtendTemplate;

/**
 * File template for abstract JSF/Faces view bean for all view beans.
 */
@SuppressWarnings("all")
public class AbstractViewBeanXtendTemplate extends AbstractXtendTemplate {
  public AbstractViewBeanXtendTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("AbstractViewBean");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = null;
    if (project!=null) {
      _basePackage=project.getBasePackage();
    }
    _builder.append(_basePackage, "");
    _builder.append(".bean");
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
    _builder_1.append("/bean/");
    this.setRelativPath(_builder_1.toString());
    this.setDocumentation("Abstract JSF/Faces view bean for all view beans");
    String _template = this.getTemplate();
    String _withImports = this.withImports(_template);
    this.setContent(_withImports);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("abstract class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@");
    String _asImport = this.asImport("javax.inject.Inject");
    _builder.append(_asImport, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("protected ");
    String _loggerType = this.getLoggerType();
    String _asImport_1 = this.asImport(_loggerType);
    _builder.append(_asImport_1, "\t");
    _builder.append(" ");
    String _loggerName = this.getLoggerName();
    _builder.append(_loggerName, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
