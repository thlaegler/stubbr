package templates;

import com.google.common.base.CaseFormat;
import com.google.common.base.Objects;
import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.OverwritePolicy;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.UUID;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Abstract super type for all templates.
 */
@SuppressWarnings("all")
public abstract class AbstractTemplate {
  @Accessors
  private StubbrRegistry stubbr;
  
  @Accessors
  private UUID id;
  
  @Accessors
  private String fileName;
  
  @Accessors
  private FileType fileType;
  
  @Accessors
  private String relativPath;
  
  @Accessors
  private Project project;
  
  @Accessors
  private String header;
  
  @Accessors
  private String content;
  
  @Accessors
  private String footer;
  
  @Accessors
  private HashMap<String, Object> parameters;
  
  @Accessors
  private OverwritePolicy overwritePolicy;
  
  @Accessors
  private String documentation;
  
  @Accessors
  private String version;
  
  @Accessors
  private boolean skipStamping;
  
  /**
   * Set default preferences for all templates.
   */
  public AbstractTemplate(final StubbrRegistry stubbr, final Project project) {
    this.stubbr = stubbr;
    UUID _randomUUID = UUID.randomUUID();
    this.id = _randomUUID;
    this.fileName = "undefined file name";
    this.fileType = FileType.UNDEFINED;
    this.relativPath = "";
    this.project = project;
    this.header = null;
    this.content = null;
    this.footer = null;
    this.parameters = null;
    this.overwritePolicy = OverwritePolicy.OVERWRITE;
    this.documentation = null;
    String _version = null;
    if (project!=null) {
      _version=project.getVersion();
    }
    this.version = _version;
    this.skipStamping = false;
  }
  
  public String getFullPathWithName() {
    StringConcatenation _builder = new StringConcatenation();
    String _relativePath = this.project.getRelativePath();
    _builder.append(_relativePath, "");
    _builder.append("/");
    _builder.append(this.relativPath, "");
    _builder.append("/");
    _builder.append(this.fileName, "");
    _builder.append(".");
    String _extension = this.fileType.getExtension();
    _builder.append(_extension, "");
    return _builder.toString();
  }
  
  protected String getTemplateName() {
    Class<? extends AbstractTemplate> _class = this.getClass();
    return _class.getCanonicalName();
  }
  
  /**
   * Assemble file content with header, footer and generation-stamp.
   */
  public String getFileContent() {
    if (((!StringExtensions.isNullOrEmpty(this.header)) && (!StringExtensions.isNullOrEmpty(this.footer)))) {
      if ((this.header.contains("xmlns") || this.header.startsWith("/</?xml"))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(this.header, "");
        _builder.newLineIfNotEmpty();
        String _stamp = this.getStamp();
        _builder.append(_stamp, "");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(this.content, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append(this.footer, "");
        _builder.newLineIfNotEmpty();
        return _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        String _stamp_1 = this.getStamp();
        _builder_1.append(_stamp_1, "");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append(this.header, "");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append(this.content, "\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append(this.footer, "");
        _builder_1.newLineIfNotEmpty();
        return _builder_1.toString();
      }
    } else {
      StringConcatenation _builder_2 = new StringConcatenation();
      String _stamp_2 = this.getStamp();
      _builder_2.append(_stamp_2, "");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append(this.content, "");
      _builder_2.newLineIfNotEmpty();
      return _builder_2.toString();
    }
  }
  
  public String getStamp() {
    if ((this.skipStamping == false)) {
      String _lineComment = this.fileType.getLineComment();
      boolean _notEquals = (!Objects.equal(_lineComment, null));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        String _lineComment_1 = this.fileType.getLineComment();
        _builder.append(_lineComment_1, "");
        _builder.append("Generated with Stubbr");
        _builder.newLineIfNotEmpty();
        String _lineComment_2 = this.fileType.getLineComment();
        _builder.append(_lineComment_2, "");
        _builder.append(this.documentation, "");
        _builder.newLineIfNotEmpty();
        String _lineComment_3 = this.fileType.getLineComment();
        _builder.append(_lineComment_3, "");
        _builder.append("{{{Version: ");
        _builder.append(this.version, "");
        _builder.append("}}}");
        _builder.newLineIfNotEmpty();
        String _lineComment_4 = this.fileType.getLineComment();
        _builder.append(_lineComment_4, "");
        _builder.append("{{{Date: ");
        String _currentDate = this.getCurrentDate();
        _builder.append(_currentDate, "");
        _builder.append("}}}");
        _builder.newLineIfNotEmpty();
        return _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        String _beginComment = this.fileType.getBeginComment();
        _builder_1.append(_beginComment, "");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("Generated with Stubbr");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append(this.documentation, "\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("{{{Version: ");
        _builder_1.append(this.version, "\t");
        _builder_1.append("}}}");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("{{{Date: ");
        String _currentDate_1 = this.getCurrentDate();
        _builder_1.append(_currentDate_1, "\t");
        _builder_1.append("}}}");
        _builder_1.newLineIfNotEmpty();
        String _endComment = this.fileType.getEndComment();
        _builder_1.append(_endComment, "");
        _builder_1.newLineIfNotEmpty();
        return _builder_1.toString();
      }
    }
    return null;
  }
  
  protected String getCurrentDate() {
    String _xblockexpression = null;
    {
      final DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy - HH:mm:ss");
      final GregorianCalendar calendar = new GregorianCalendar();
      Date _time = calendar.getTime();
      _xblockexpression = sdf.format(_time);
    }
    return _xblockexpression;
  }
  
  /**
   * Transform a String (version) into Double compatible String.
   * 
   * Note: This is so stupid!
   */
  protected String toVersionDouble(final String version) {
    String _replaceFirst = version.replaceFirst("v", "");
    String _replaceFirst_1 = _replaceFirst.replaceFirst("\\.", "987654321");
    String _replaceAll = _replaceFirst_1.replaceAll("\\D", "");
    return _replaceAll.replaceFirst("987654321", 
      ".");
  }
  
  /**
   * Transform a String (package name) into file system compatible path.
   * e.g. 'org.example.foo' will be transformed into 'com/example/foo'
   */
  protected String toPath(final String packageName) {
    return packageName.replace(".", "/");
  }
  
  /**
   * Transform a (camelCased) String into lowercase with underscore.
   * e.g. 'myExampleName' will be transformed into 'my_example_name'
   */
  protected String toLowerUnderscore(final String input) {
    return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, input);
  }
  
  /**
   * Transform a String (package name) into valid namespace value.
   * e.g. 'org.example.foo' will be transformed into 'http://www.example.org/foo'
   */
  protected String toNamespace(final String input) {
    String _xblockexpression = null;
    {
      String _lowerCase = null;
      if (input!=null) {
        _lowerCase=input.toLowerCase();
      }
      String[] _split = null;
      if (_lowerCase!=null) {
        _split=_lowerCase.split("\\.");
      }
      final String[] parts = _split;
      String _replaceAll = null;
      if (input!=null) {
        String _get = parts[0];
        String _plus = (_get + ".");
        _replaceAll=input.replaceAll(_plus, "");
      }
      String _replaceAll_1 = null;
      if (_replaceAll!=null) {
        String _get_1 = parts[1];
        String _plus_1 = (_get_1 + ".");
        _replaceAll_1=_replaceAll.replaceAll(_plus_1, "");
      }
      String _lowerCase_1 = null;
      if (_replaceAll_1!=null) {
        _lowerCase_1=_replaceAll_1.toLowerCase();
      }
      String[] _split_1 = null;
      if (_lowerCase_1!=null) {
        _split_1=_lowerCase_1.split(".");
      }
      final String[] lastParts = _split_1;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("http://www.");
      String _get_2 = parts[1];
      _builder.append(_get_2, "");
      _builder.append(".");
      String _get_3 = parts[0];
      _builder.append(_get_3, "");
      {
        for(final String part : lastParts) {
          _builder.append("/");
          _builder.append(part, "");
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  @Deprecated
  protected <T extends Object> String marshal(final JAXBElement<T> model, final Class<T> clazz) {
    try {
      final StringWriter writer = new StringWriter();
      final JAXBContext context = JAXBContext.newInstance(clazz);
      final Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.valueOf(true));
      marshaller.marshal(model, writer);
      return writer.toString();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Pure
  public StubbrRegistry getStubbr() {
    return this.stubbr;
  }
  
  public void setStubbr(final StubbrRegistry stubbr) {
    this.stubbr = stubbr;
  }
  
  @Pure
  public UUID getId() {
    return this.id;
  }
  
  public void setId(final UUID id) {
    this.id = id;
  }
  
  @Pure
  public String getFileName() {
    return this.fileName;
  }
  
  public void setFileName(final String fileName) {
    this.fileName = fileName;
  }
  
  @Pure
  public FileType getFileType() {
    return this.fileType;
  }
  
  public void setFileType(final FileType fileType) {
    this.fileType = fileType;
  }
  
  @Pure
  public String getRelativPath() {
    return this.relativPath;
  }
  
  public void setRelativPath(final String relativPath) {
    this.relativPath = relativPath;
  }
  
  @Pure
  public Project getProject() {
    return this.project;
  }
  
  public void setProject(final Project project) {
    this.project = project;
  }
  
  @Pure
  public String getHeader() {
    return this.header;
  }
  
  public void setHeader(final String header) {
    this.header = header;
  }
  
  @Pure
  public String getContent() {
    return this.content;
  }
  
  public void setContent(final String content) {
    this.content = content;
  }
  
  @Pure
  public String getFooter() {
    return this.footer;
  }
  
  public void setFooter(final String footer) {
    this.footer = footer;
  }
  
  @Pure
  public HashMap<String, Object> getParameters() {
    return this.parameters;
  }
  
  public void setParameters(final HashMap<String, Object> parameters) {
    this.parameters = parameters;
  }
  
  @Pure
  public OverwritePolicy getOverwritePolicy() {
    return this.overwritePolicy;
  }
  
  public void setOverwritePolicy(final OverwritePolicy overwritePolicy) {
    this.overwritePolicy = overwritePolicy;
  }
  
  @Pure
  public String getDocumentation() {
    return this.documentation;
  }
  
  public void setDocumentation(final String documentation) {
    this.documentation = documentation;
  }
  
  @Pure
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(final String version) {
    this.version = version;
  }
  
  @Pure
  public boolean isSkipStamping() {
    return this.skipStamping;
  }
  
  public void setSkipStamping(final boolean skipStamping) {
    this.skipStamping = skipStamping;
  }
}
