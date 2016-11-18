package templates.business.src_main_java_basepack.business.controller;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractXtendTemplate;

/**
 * File template for controller for entity.
 */
@SuppressWarnings("all")
public class EntityControllerXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public EntityControllerXtendTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
    super(stubbr, project);
    this.entity = entity;
    StringConcatenation _builder = new StringConcatenation();
    String _name = null;
    if (entity!=null) {
      _name=entity.getName();
    }
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    _builder.append(_firstUpper, "");
    _builder.append("Controller");
    this.setFileName(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _basePackage = project.getBasePackage();
    _builder_1.append(_basePackage, "");
    _builder_1.append(".controller");
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
    _builder_2.append("/controller/");
    this.setRelativPath(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("Controller for entity ");
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
    _builder.append("import java.io.Serializable");
    _builder.newLine();
    _builder.append("import javax.persistence.Column");
    _builder.newLine();
    _builder.append("import javax.persistence.Entity");
    _builder.newLine();
    _builder.append("import javax.persistence.Table");
    _builder.newLine();
    _builder.append("import javax.xml.bind.annotation.XmlElement");
    _builder.newLine();
    _builder.append("import javax.xml.bind.annotation.XmlRootElement");
    _builder.newLine();
    _builder.append("import org.eclipse.xtend.lib.annotations.Accessors");
    _builder.newLine();
    _builder.append("import com.google.gson.annotations.Expose");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.example.stubbr.persistence.service.BarService");
    _builder.newLine();
    _builder.append("import org.example.stubbr.business.object.BarBusinessObject");
    _builder.newLine();
    _builder.append("import javax.inject.Inject");
    _builder.newLine();
    _builder.append("import org.example.stubbr.model.entity.Bar");
    _builder.newLine();
    _builder.newLine();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport = this.asImport("javax.ejb.Stateless");
    _builder.append(_asImport, "");
    _builder.newLineIfNotEmpty();
    _builder.append("class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" extends AbstractController {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@");
    String _asImport_1 = this.asImport("javax.inject.Inject");
    _builder.append(_asImport_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private ");
    StubbrRegistry _stubbr = this.getStubbr();
    Stubb _stubb = null;
    if (_stubbr!=null) {
      _stubb=_stubbr.getStubb();
    }
    String _packageName = null;
    if (_stubb!=null) {
      _packageName=_stubb.getPackageName();
    }
    String _plus = (_packageName + ".persistence.service.");
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    String _plus_1 = (_plus + _firstUpper);
    String _plus_2 = (_plus_1 + "Service");
    String _asImport_2 = this.asImport(_plus_2);
    _builder.append(_asImport_2, "\t");
    _builder.append(" ");
    String _name_1 = null;
    if (this.entity!=null) {
      _name_1=this.entity.getName();
    }
    String _firstLower = null;
    if (_name_1!=null) {
      _firstLower=StringExtensions.toFirstLower(_name_1);
    }
    _builder.append(_firstLower, "\t");
    _builder.append("Service");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    StubbrRegistry _stubbr_1 = this.getStubbr();
    Stubb _stubb_1 = null;
    if (_stubbr_1!=null) {
      _stubb_1=_stubbr_1.getStubb();
    }
    String _packageName_1 = null;
    if (_stubb_1!=null) {
      _packageName_1=_stubb_1.getPackageName();
    }
    String _plus_3 = (_packageName_1 + ".business.object.");
    String _name_2 = null;
    if (this.entity!=null) {
      _name_2=this.entity.getName();
    }
    String _firstUpper_1 = null;
    if (_name_2!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_name_2);
    }
    String _plus_4 = (_plus_3 + _firstUpper_1);
    String _plus_5 = (_plus_4 + "BusinessObject");
    String _asImport_3 = this.asImport(_plus_5);
    _builder.append(_asImport_3, "\t");
    _builder.append(" ");
    String _name_3 = null;
    if (this.entity!=null) {
      _name_3=this.entity.getName();
    }
    String _firstLower_1 = null;
    if (_name_3!=null) {
      _firstLower_1=StringExtensions.toFirstLower(_name_3);
    }
    _builder.append(_firstLower_1, "\t");
    _builder.append("BusinessObject");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public def init() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val ");
    StubbrRegistry _stubbr_2 = this.getStubbr();
    Stubb _stubb_2 = null;
    if (_stubbr_2!=null) {
      _stubb_2=_stubbr_2.getStubb();
    }
    String _packageName_2 = null;
    if (_stubb_2!=null) {
      _packageName_2=_stubb_2.getPackageName();
    }
    String _plus_6 = (_packageName_2 + ".model.entity.");
    String _name_4 = null;
    if (this.entity!=null) {
      _name_4=this.entity.getName();
    }
    String _firstUpper_2 = null;
    if (_name_4!=null) {
      _firstUpper_2=StringExtensions.toFirstUpper(_name_4);
    }
    String _plus_7 = (_plus_6 + _firstUpper_2);
    String _asImport_4 = this.asImport(_plus_7);
    _builder.append(_asImport_4, "\t\t");
    _builder.append(" ");
    String _name_5 = null;
    if (this.entity!=null) {
      _name_5=this.entity.getName();
    }
    String _firstLower_2 = null;
    if (_name_5!=null) {
      _firstLower_2=StringExtensions.toFirstLower(_name_5);
    }
    _builder.append(_firstLower_2, "\t\t");
    _builder.append(" = ");
    String _name_6 = null;
    if (this.entity!=null) {
      _name_6=this.entity.getName();
    }
    String _firstLower_3 = null;
    if (_name_6!=null) {
      _firstLower_3=StringExtensions.toFirstLower(_name_6);
    }
    _builder.append(_firstLower_3, "\t\t");
    _builder.append("Service.findById(1)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.");
    String _name_7 = null;
    if (this.entity!=null) {
      _name_7=this.entity.getName();
    }
    String _firstLower_4 = null;
    if (_name_7!=null) {
      _firstLower_4=StringExtensions.toFirstLower(_name_7);
    }
    _builder.append(_firstLower_4, "\t\t");
    _builder.append("BusinessObject = new ");
    String _name_8 = null;
    if (this.entity!=null) {
      _name_8=this.entity.getName();
    }
    String _firstUpper_3 = null;
    if (_name_8!=null) {
      _firstUpper_3=StringExtensions.toFirstUpper(_name_8);
    }
    _builder.append(_firstUpper_3, "\t\t");
    _builder.append("BusinessObject(");
    String _name_9 = null;
    if (this.entity!=null) {
      _name_9=this.entity.getName();
    }
    String _firstLower_5 = null;
    if (_name_9!=null) {
      _firstLower_5=StringExtensions.toFirstLower(_name_9);
    }
    _builder.append(_firstLower_5, "\t\t");
    _builder.append(")");
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
