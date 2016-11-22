package templates.soap.client.src_main_java.basepack.soap.client;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractXtendTemplate;

/**
 * File template for SOAP client.
 */
@SuppressWarnings("all")
public class SoapClientXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public SoapClientXtendTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
    super(stubbr, project);
    this.entity = entity;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = null;
    if (project!=null) {
      _basePackage=project.getBasePackage();
    }
    _builder.append(_basePackage, "");
    this.setHeader(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    String _name = null;
    if (entity!=null) {
      _name=entity.getName();
    }
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    _builder_1.append(_firstUpper, "");
    _builder_1.append("SoapClient");
    this.setFileName(_builder_1.toString());
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
    _builder_2.append("/");
    this.setRelativPath(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("SOAP client for entity ");
    String _name_1 = null;
    if (entity!=null) {
      _name_1=entity.getName();
    }
    String _firstUpper_1 = null;
    if (_name_1!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_name_1);
    }
    _builder_3.append(_firstUpper_1, "");
    this.setDocumentation(_builder_3.toString());
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    Project _project = this.getProject();
    String _basePackage = null;
    if (_project!=null) {
      _basePackage=_project.getBasePackage();
    }
    _builder.append(_basePackage, "");
    _builder.append(".*");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    StubbrRegistry _stubbr = this.getStubbr();
    Stubb _stubb = null;
    if (_stubbr!=null) {
      _stubb=_stubbr.getStubb();
    }
    String _packageName = null;
    if (_stubb!=null) {
      _packageName=_stubb.getPackageName();
    }
    _builder.append(_packageName, "");
    _builder.append(".soap.server.*");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.net.URL");
    _builder.newLine();
    _builder.append("import javax.xml.namespace.QName");
    _builder.newLine();
    _builder.append("import javax.xml.ws.Service");
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
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Call SOAP Endpoint for Entity ");
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    _builder.append(_firstUpper, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public def static void main(String[] args) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val ");
    String _fileName_1 = this.getFileName();
    _builder.append(_fileName_1, "\t\t");
    _builder.append(" client = new ");
    String _fileName_2 = this.getFileName();
    _builder.append(_fileName_2, "\t\t");
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val ");
    String _name_1 = null;
    if (this.entity!=null) {
      _name_1=this.entity.getName();
    }
    String _firstUpper_1 = null;
    if (_name_1!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_name_1);
    }
    _builder.append(_firstUpper_1, "\t\t");
    _builder.append("Soap port = client.getPort()");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Get the SOAP Service.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public def ");
    String _name_2 = null;
    if (this.entity!=null) {
      _name_2=this.entity.getName();
    }
    String _firstUpper_2 = null;
    if (_name_2!=null) {
      _firstUpper_2=StringExtensions.toFirstUpper(_name_2);
    }
    _builder.append(_firstUpper_2, "\t");
    _builder.append("Soap getPort() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val URL url = new URL(\'http://localhost:9999/ws/");
    String _name_3 = null;
    if (this.entity!=null) {
      _name_3=this.entity.getName();
    }
    String _lowerCase = null;
    if (_name_3!=null) {
      _lowerCase=_name_3.toLowerCase();
    }
    _builder.append(_lowerCase, "\t\t");
    _builder.append("?wsdl\')");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val QName qname = new QName(\'");
    StubbrRegistry _stubbr_1 = this.getStubbr();
    Stubb _stubb_1 = null;
    if (_stubbr_1!=null) {
      _stubb_1=_stubbr_1.getStubb();
    }
    String _packageName_1 = null;
    if (_stubb_1!=null) {
      _packageName_1=_stubb_1.getPackageName();
    }
    String _plus = (_packageName_1 + ".");
    String _name_4 = null;
    if (this.entity!=null) {
      _name_4=this.entity.getName();
    }
    String _plus_1 = (_plus + _name_4);
    String _namespace = this.toNamespace(_plus_1);
    _builder.append(_namespace, "\t\t");
    _builder.append("\', \'");
    String _name_5 = null;
    if (this.entity!=null) {
      _name_5=this.entity.getName();
    }
    String _firstUpper_3 = null;
    if (_name_5!=null) {
      _firstUpper_3=StringExtensions.toFirstUpper(_name_5);
    }
    _builder.append(_firstUpper_3, "\t\t");
    _builder.append("Soap\')");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val Service service = Service.create(url, qname)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return service.getPort(");
    String _name_6 = null;
    if (this.entity!=null) {
      _name_6=this.entity.getName();
    }
    String _firstUpper_4 = null;
    if (_name_6!=null) {
      _firstUpper_4=StringExtensions.toFirstUpper(_name_6);
    }
    _builder.append(_firstUpper_4, "\t\t");
    _builder.append("Soap)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
