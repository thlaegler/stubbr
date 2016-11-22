package templates.business.src_main_java_basepack.business.controller;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractXtendTemplate;

/**
 * File template for abstract controller for all controllers.
 */
@SuppressWarnings("all")
public class AbstractControllerXtendTemplate extends AbstractXtendTemplate {
  public AbstractControllerXtendTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("AbstractController");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = project.getBasePackage();
    _builder.append(_basePackage, "");
    _builder.append(".controller");
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
    _builder_1.append("/controller/");
    this.setRelativPath(_builder_1.toString());
    this.setDocumentation("Abstract controller");
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    Project _project = this.getProject();
    String _basePackage = _project.getBasePackage();
    _builder.append(_basePackage, "");
    _builder.append(".*");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.eclipse.xtend.lib.annotations.Accessors");
    _builder.newLine();
    _builder.append("import com.google.gson.annotations.Expose");
    _builder.newLine();
    _builder.newLine();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
