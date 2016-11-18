package templates.soap.server.src_main_java.basepack.soap.server;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.ChapterPersistence;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractXtendTemplate;

/**
 * File template for SOAP endpoint publisher.
 */
@SuppressWarnings("all")
public class SoapEndpointPublisherXtendTemplate extends AbstractXtendTemplate {
  public SoapEndpointPublisherXtendTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("SoapEndpointPublisher");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/src/main/java/");
    String _basePackage = null;
    if (project!=null) {
      _basePackage=project.getBasePackage();
    }
    String _path = null;
    if (_basePackage!=null) {
      _path=this.toPath(_basePackage);
    }
    _builder.append(_path, "");
    _builder.append("/");
    this.setRelativPath(_builder.toString());
    this.setDocumentation("SOAP endpoint publisher");
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    Project _project = this.getProject();
    String _basePackage = null;
    if (_project!=null) {
      _basePackage=_project.getBasePackage();
    }
    _builder.append(_basePackage, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    Project _project_1 = this.getProject();
    String _basePackage_1 = null;
    if (_project_1!=null) {
      _basePackage_1=_project_1.getBasePackage();
    }
    _builder.append(_basePackage_1, "");
    _builder.append(".*");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    Project _project_2 = this.getProject();
    String _basePackage_2 = null;
    if (_project_2!=null) {
      _basePackage_2=_project_2.getBasePackage();
    }
    _builder.append(_basePackage_2, "");
    _builder.append(".impl.UserSoapImpl");
    _builder.newLineIfNotEmpty();
    _builder.append("import javax.inject.Inject");
    _builder.newLine();
    _builder.append("import javax.xml.ws.Endpoint");
    _builder.newLine();
    _builder.append("import com.google.gson.annotations.Since");
    _builder.newLine();
    _builder.append("import com.google.gson.annotations.Until");
    _builder.newLine();
    _builder.append("import javax.annotation.Generated");
    _builder.newLine();
    _builder.newLine();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Publish all Endpoints.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static def void main(String[] args) {");
    _builder.newLine();
    {
      StubbrRegistry _stubbr = this.getStubbr();
      Stubb _stubb = _stubbr.getStubb();
      ChapterPersistence _persistence = null;
      if (_stubb!=null) {
        _persistence=_stubb.getPersistence();
      }
      EList<Entity> _entities = null;
      if (_persistence!=null) {
        _entities=_persistence.getEntities();
      }
      for(final Entity entity : _entities) {
        _builder.append("\t\t");
        _builder.append("Endpoint.publish(\'http://localhost:9999/ws/");
        String _name = null;
        if (entity!=null) {
          _name=entity.getName();
        }
        String _lowerCase = null;
        if (_name!=null) {
          _lowerCase=_name.toLowerCase();
        }
        _builder.append(_lowerCase, "\t\t");
        _builder.append("\', new ");
        String _name_1 = null;
        if (entity!=null) {
          _name_1=entity.getName();
        }
        String _firstUpper = null;
        if (_name_1!=null) {
          _firstUpper=StringExtensions.toFirstUpper(_name_1);
        }
        _builder.append(_firstUpper, "\t\t");
        _builder.append("SoapImpl())");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
