package templates.rest.server.src_main_java.basepack.rest;

import com.google.common.base.Objects;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import io.swagger.models.Info;
import io.swagger.models.Operation;
import io.swagger.models.Swagger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractXtendTemplate;

/**
 * File template for REST endpoint for path.
 */
@SuppressWarnings("all")
public class EntityEndpointResourceXtendTemplate extends AbstractXtendTemplate {
  private Swagger swagger;
  
  public EntityEndpointResourceXtendTemplate(final StubbrRegistry stubbr, final Project project, final Swagger swagger) {
    super(stubbr, project);
    this.swagger = swagger;
    StringConcatenation _builder = new StringConcatenation();
    Info _info = null;
    if (swagger!=null) {
      _info=swagger.getInfo();
    }
    String _title = null;
    if (_info!=null) {
      _title=_info.getTitle();
    }
    String _replaceFirst = null;
    if (_title!=null) {
      _replaceFirst=_title.replaceFirst("[^A-Za-z0-9]", "");
    }
    String _firstUpper = StringExtensions.toFirstUpper(_replaceFirst);
    _builder.append(_firstUpper, "");
    _builder.append("RestEndpoint");
    this.setFileName(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _basePackage = project.getBasePackage();
    _builder_1.append(_basePackage, "");
    _builder_1.append(".resource");
    this.setHeader(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("/src/main/java/");
    String _basePackage_1 = null;
    if (project!=null) {
      _basePackage_1=project.getBasePackage();
    }
    String _path = null;
    if (_basePackage_1!=null) {
      _path=this.toPath(_basePackage_1);
    }
    _builder_2.append(_path, "");
    _builder_2.append("/rest/server/");
    this.setRelativPath(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("REST endpoint for path ");
    Info _info_1 = null;
    if (swagger!=null) {
      _info_1=swagger.getInfo();
    }
    String _title_1 = null;
    if (_info_1!=null) {
      _title_1=_info_1.getTitle();
    }
    String _firstUpper_1 = null;
    if (_title_1!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_title_1);
    }
    _builder_3.append(_firstUpper_1, "");
    _builder_3.append(".");
    this.setDocumentation(_builder_3.toString());
    String _template = this.getTemplate();
    String _withImports = this.withImports(_template);
    this.setContent(_withImports);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    Project _project = this.getProject();
    String _basePackage = _project.getBasePackage();
    _builder.append(_basePackage, "");
    _builder.append(".*");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import javax.ws.rs.GET");
    _builder.newLine();
    _builder.append("import javax.ws.rs.POST");
    _builder.newLine();
    _builder.append("import javax.ws.rs.PUT");
    _builder.newLine();
    _builder.append("import javax.ws.rs.DELETE");
    _builder.newLine();
    _builder.append("import javax.ws.rs.Consumes");
    _builder.newLine();
    _builder.append("import javax.ws.rs.core.Response");
    _builder.newLine();
    _builder.append("import javax.ws.rs.Produces");
    _builder.newLine();
    _builder.append("import javax.ws.rs.core.SecurityContext");
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
    final Map<String, Operation> operations = new HashMap<String, Operation>();
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      Set<Map.Entry<String, Operation>> _entrySet = operations.entrySet();
      for(final Map.Entry<String, Operation> operation : _entrySet) {
        {
          Operation _value = null;
          if (operation!=null) {
            _value=operation.getValue();
          }
          boolean _notEquals = (!Objects.equal(_value, null));
          if (_notEquals) {
            _builder.append("\t");
            _builder.append("@");
            String _key = null;
            if (operation!=null) {
              _key=operation.getKey();
            }
            String _upperCase = null;
            if (_key!=null) {
              _upperCase=_key.toUpperCase();
            }
            _builder.append(_upperCase, "\t");
            _builder.newLineIfNotEmpty();
            {
              Operation _value_1 = null;
              if (operation!=null) {
                _value_1=operation.getValue();
              }
              List<String> _consumes = null;
              if (_value_1!=null) {
                _consumes=_value_1.getConsumes();
              }
              boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(_consumes);
              boolean _not = (!_isNullOrEmpty);
              if (_not) {
                _builder.append("\t");
                _builder.append("@Consumes(#[");
                {
                  Operation _value_2 = null;
                  if (operation!=null) {
                    _value_2=operation.getValue();
                  }
                  List<String> _consumes_1 = null;
                  if (_value_2!=null) {
                    _consumes_1=_value_2.getConsumes();
                  }
                  for(final String consumes : _consumes_1) {
                    _builder.append("\'");
                    _builder.append(consumes, "\t");
                    _builder.append("\', ");
                  }
                }
                _builder.append("\'null/null\'])");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              Operation _value_3 = null;
              if (operation!=null) {
                _value_3=operation.getValue();
              }
              List<String> _produces = null;
              if (_value_3!=null) {
                _produces=_value_3.getProduces();
              }
              boolean _isNullOrEmpty_1 = IterableExtensions.isNullOrEmpty(_produces);
              boolean _not_1 = (!_isNullOrEmpty_1);
              if (_not_1) {
                _builder.append("\t");
                _builder.append("@Produces(#[");
                {
                  Operation _value_4 = null;
                  if (operation!=null) {
                    _value_4=operation.getValue();
                  }
                  List<String> _produces_1 = null;
                  if (_value_4!=null) {
                    _produces_1=_value_4.getProduces();
                  }
                  for(final String produces : _produces_1) {
                    _builder.append("\'");
                    _builder.append(produces, "\t");
                    _builder.append("\', ");
                  }
                }
                _builder.append("\'null/null\'])");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("Response.ok.build");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
