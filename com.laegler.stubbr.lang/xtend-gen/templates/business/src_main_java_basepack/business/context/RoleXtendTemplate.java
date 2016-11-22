package templates.business.src_main_java_basepack.business.context;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractXtendTemplate;

/**
 * File template for user roles.
 */
@SuppressWarnings("all")
public class RoleXtendTemplate extends AbstractXtendTemplate {
  public RoleXtendTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("Role");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = project.getBasePackage();
    _builder.append(_basePackage, "");
    _builder.append(".context");
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
    _builder_1.append("/context/");
    this.setRelativPath(_builder_1.toString());
    this.setDocumentation("User roles");
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("enum ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("SUPERUSER, ADMIN, PROVIDER, CUSTOMER, GUEST");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
