package templates;

import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractTemplate;

/**
 * Abstract super type for all Java files.
 */
@SuppressWarnings("all")
public abstract class AbstractJavaTemplate extends AbstractTemplate {
  private List<String> imports;
  
  public AbstractJavaTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileType(FileType.JAVA);
  }
  
  /**
   * Use this to generate import section.
   */
  protected String withImport(final String template) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    Project _project = this.getProject();
    String _basePackage = _project.getBasePackage();
    _builder.append(_basePackage, "");
    _builder.append(".*;");
    _builder.newLineIfNotEmpty();
    {
      for(final String import1 : this.imports) {
        _builder.append("import ");
        _builder.append(import1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(template, "");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  /**
   * Use this to declare to be imported type as fully qualified name. It will then store the import for generating import section later and return the Not fully qualified name.
   */
  protected String asImport(final String fqnImport) {
    String _xblockexpression = null;
    {
      this.imports.add(fqnImport);
      final int lastDot = fqnImport.lastIndexOf("//.");
      int _length = fqnImport.length();
      _xblockexpression = fqnImport.substring(lastDot, _length);
    }
    return _xblockexpression;
  }
  
  /**
   * Template part for type-specific javadoc.
   */
  protected String getJavaDocType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import javax.annotation.Generated;");
    _builder.newLine();
    _builder.append("import com.google.gson.annotations.Until;");
    _builder.newLine();
    _builder.append("import com.google.gson.annotations.Since;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    String _documentation = this.getDocumentation();
    _builder.append(_documentation, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @author ");
    StubbrRegistry _stubbr = this.getStubbr();
    Stubb _stubb = _stubbr.getStubb();
    String _author = _stubb.getAuthor();
    String _replaceAll = null;
    if (_author!=null) {
      _replaceAll=_author.replaceAll("\"", "");
    }
    _builder.append(_replaceAll, " ");
    _builder.append(" {@literal <");
    StubbrRegistry _stubbr_1 = this.getStubbr();
    Stubb _stubb_1 = _stubbr_1.getStubb();
    String _email = _stubb_1.getEmail();
    String _replace = null;
    if (_email!=null) {
      _replace=_email.replace("@", "[at]");
    }
    String _replaceAll_1 = _replace.replaceAll("\"", "");
    _builder.append(_replaceAll_1, " ");
    _builder.append(">} ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* @since ");
    String _version = this.getVersion();
    _builder.append(_version, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* @version ");
    String _version_1 = this.getVersion();
    _builder.append(_version_1, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* @generated ");
    String _currentDate = this.getCurrentDate();
    _builder.append(_currentDate, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("//@Since(");
    String _version_2 = this.getVersion();
    _builder.append(_version_2, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("@Until(0.0)");
    _builder.newLine();
    _builder.append("@Generated(value = \'");
    String _templateName = this.getTemplateName();
    _builder.append(_templateName, "");
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  /**
   * Template part for method-specific javadoc.
   */
  protected String getJavaDocMethod() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    String _documentation = this.getDocumentation();
    _builder.append(_documentation, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @author ");
    StubbrRegistry _stubbr = this.getStubbr();
    Stubb _stubb = _stubbr.getStubb();
    String _author = _stubb.getAuthor();
    String _replaceAll = null;
    if (_author!=null) {
      _replaceAll=_author.replaceAll("\"", "");
    }
    _builder.append(_replaceAll, " ");
    _builder.append(" {@literal <");
    StubbrRegistry _stubbr_1 = this.getStubbr();
    Stubb _stubb_1 = _stubbr_1.getStubb();
    String _email = _stubb_1.getEmail();
    String _replace = null;
    if (_email!=null) {
      _replace=_email.replace("@", "[at]");
    }
    String _replaceAll_1 = _replace.replaceAll("\"", "");
    _builder.append(_replaceAll_1, " ");
    _builder.append(">} ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* @since ");
    String _version = this.getVersion();
    _builder.append(_version, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* @version ");
    String _version_1 = this.getVersion();
    _builder.append(_version_1, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* @generated ");
    String _currentDate = this.getCurrentDate();
    _builder.append(_currentDate, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("//@Since(");
    String _version_2 = this.getVersion();
    _builder.append(_version_2, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("@Until(0.0)");
    _builder.newLine();
    return _builder.toString();
  }
}
