package templates;

import com.google.common.base.Objects;
import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.ChapterGlobals;
import com.laegler.stubbr.lang.stubbrLang.ChapterPersistence;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import templates.AbstractTemplate;

/**
 * Abstract super type for all Xtend files.
 */
@SuppressWarnings("all")
public abstract class AbstractXtendTemplate extends AbstractTemplate {
  private List<String> imports = new ArrayList<String>();
  
  public AbstractXtendTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileType(FileType.XTEND);
  }
  
  /**
   * Assemble file content with header, footer and generation-stamp.
   */
  @Override
  public String getFileContent() {
    StringConcatenation _builder = new StringConcatenation();
    String _stamp = this.getStamp();
    _builder.append(_stamp, "");
    _builder.newLineIfNotEmpty();
    String _header = this.getHeader();
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _template = this.getTemplate();
    String _withImports = this.withImports(_template);
    _builder.append(_withImports, "");
    _builder.newLineIfNotEmpty();
    String _footer = this.getFooter();
    _builder.append(_footer, "");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  /**
   * Use this to generate import section.
   */
  protected String withImports(final String template) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    Project _project = this.getProject();
    String _basePackage = _project.getBasePackage();
    _builder.append(_basePackage, "");
    _builder.append(".*");
    _builder.newLineIfNotEmpty();
    {
      for(final String import1 : this.imports) {
        _builder.append("import ");
        _builder.append(import1, "");
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
    boolean _contains = this.imports.contains(fqnImport);
    boolean _not = (!_contains);
    if (_not) {
      if ((((((((!fqnImport.equalsIgnoreCase("long")) && (!fqnImport.equalsIgnoreCase("boolean"))) && 
        (!fqnImport.equalsIgnoreCase("string"))) && (!fqnImport.equalsIgnoreCase("int"))) && 
        (!fqnImport.equalsIgnoreCase("integer"))) && (!fqnImport.equalsIgnoreCase("double"))) && 
        (!fqnImport.equalsIgnoreCase("float")))) {
        this.imports.add(fqnImport);
      }
    }
    final int lastDot = fqnImport.lastIndexOf(".");
    if ((lastDot != (-1))) {
      int _length = fqnImport.length();
      return fqnImport.substring((lastDot + 1), _length);
    } else {
      return fqnImport;
    }
  }
  
  /**
   * Template part for type-specific javadoc.
   */
  protected String getJavaDocType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import com.google.gson.annotations.Since");
    _builder.newLine();
    _builder.append("import com.google.gson.annotations.Until");
    _builder.newLine();
    _builder.append("import javax.annotation.Generated");
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
    Stubb _stubb = this.getStubb();
    String _author = null;
    if (_stubb!=null) {
      _author=_stubb.getAuthor();
    }
    String _replaceAll = null;
    if (_author!=null) {
      _replaceAll=_author.replaceAll("\"", "");
    }
    _builder.append(_replaceAll, " ");
    _builder.append(" {@literal <");
    Stubb _stubb_1 = this.getStubb();
    String _email = null;
    if (_stubb_1!=null) {
      _email=_stubb_1.getEmail();
    }
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
    String _replaceFirst = null;
    if (_version!=null) {
      _replaceFirst=_version.replaceFirst("v", "");
    }
    _builder.append(_replaceFirst, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* @version ");
    String _version_1 = this.getVersion();
    String _replaceFirst_1 = null;
    if (_version_1!=null) {
      _replaceFirst_1=_version_1.replaceFirst("v", "");
    }
    _builder.append(_replaceFirst_1, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* @generated ");
    String _currentDate = this.getCurrentDate();
    _builder.append(_currentDate, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("@");
    String _asImport = this.asImport("com.google.gson.annotations.Since");
    _builder.append(_asImport, "");
    _builder.append("(value = ");
    String _version_2 = this.getVersion();
    String _versionDouble = null;
    if (_version_2!=null) {
      _versionDouble=this.toVersionDouble(_version_2);
    }
    _builder.append(_versionDouble, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport_1 = this.asImport("com.google.gson.annotations.Until");
    _builder.append(_asImport_1, "");
    _builder.append("(value = ");
    String _version_3 = this.getVersion();
    String _versionDouble_1 = null;
    if (_version_3!=null) {
      _versionDouble_1=this.toVersionDouble(_version_3);
    }
    _builder.append(_versionDouble_1, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport_2 = this.asImport("javax.annotation.Generated");
    _builder.append(_asImport_2, "");
    _builder.append("(value = \'");
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
    Stubb _stubb = this.getStubb();
    String _author = null;
    if (_stubb!=null) {
      _author=_stubb.getAuthor();
    }
    String _replaceAll = null;
    if (_author!=null) {
      _replaceAll=_author.replaceAll("\"", "");
    }
    _builder.append(_replaceAll, " ");
    _builder.append(" {@literal <");
    Stubb _stubb_1 = this.getStubb();
    String _email = null;
    if (_stubb_1!=null) {
      _email=_stubb_1.getEmail();
    }
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
    String _replaceFirst = null;
    if (_version!=null) {
      _replaceFirst=_version.replaceFirst("v", "");
    }
    _builder.append(_replaceFirst, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* @version ");
    String _version_1 = this.getVersion();
    String _replaceFirst_1 = null;
    if (_version_1!=null) {
      _replaceFirst_1=_version_1.replaceFirst("v", "");
    }
    _builder.append(_replaceFirst_1, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* @generated ");
    String _currentDate = this.getCurrentDate();
    _builder.append(_currentDate, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("@");
    String _asImport = this.asImport("com.google.gson.annotations.Since");
    _builder.append(_asImport, "");
    _builder.append("(value = ");
    String _version_2 = this.getVersion();
    String _versionDouble = null;
    if (_version_2!=null) {
      _versionDouble=this.toVersionDouble(_version_2);
    }
    _builder.append(_versionDouble, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport_1 = this.asImport("com.google.gson.annotations.Until");
    _builder.append(_asImport_1, "");
    _builder.append("(value = ");
    String _version_3 = this.getVersion();
    String _versionDouble_1 = null;
    if (_version_3!=null) {
      _versionDouble_1=this.toVersionDouble(_version_3);
    }
    _builder.append(_versionDouble_1, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport_2 = this.asImport("javax.annotation.Generated");
    _builder.append(_asImport_2, "");
    _builder.append("(value = \'");
    String _templateName = this.getTemplateName();
    _builder.append(_templateName, "");
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String getLoggerName() {
    ChapterGlobals _chapterGlobals = this.getChapterGlobals();
    String _loggerName = null;
    if (_chapterGlobals!=null) {
      _loggerName=_chapterGlobals.getLoggerName();
    }
    boolean _notEquals = (!Objects.equal(_loggerName, null));
    if (_notEquals) {
      ChapterGlobals _chapterGlobals_1 = this.getChapterGlobals();
      String _loggerName_1 = null;
      if (_chapterGlobals_1!=null) {
        _loggerName_1=_chapterGlobals_1.getLoggerName();
      }
      return _loggerName_1;
    } else {
      return "log";
    }
  }
  
  protected String getLoggerType() {
    ChapterGlobals _chapterGlobals = this.getChapterGlobals();
    String _loggerType = null;
    if (_chapterGlobals!=null) {
      _loggerType=_chapterGlobals.getLoggerType();
    }
    boolean _notEquals = (!Objects.equal(_loggerType, null));
    if (_notEquals) {
      ChapterGlobals _chapterGlobals_1 = this.getChapterGlobals();
      String _loggerType_1 = null;
      if (_chapterGlobals_1!=null) {
        _loggerType_1=_chapterGlobals_1.getLoggerType();
      }
      return _loggerType_1;
    } else {
      return "org.slf4j.Logger";
    }
  }
  
  protected String getEntityIdType() {
    ChapterPersistence _chapterPersistence = this.getChapterPersistence();
    JvmTypeReference _javaType = null;
    if (_chapterPersistence!=null) {
      _javaType=_chapterPersistence.getJavaType();
    }
    boolean _notEquals = (!Objects.equal(_javaType, null));
    if (_notEquals) {
      ChapterPersistence _chapterPersistence_1 = this.getChapterPersistence();
      JvmTypeReference _javaType_1 = null;
      if (_chapterPersistence_1!=null) {
        _javaType_1=_chapterPersistence_1.getJavaType();
      }
      return _javaType_1.getQualifiedName();
    } else {
      return "long";
    }
  }
}
