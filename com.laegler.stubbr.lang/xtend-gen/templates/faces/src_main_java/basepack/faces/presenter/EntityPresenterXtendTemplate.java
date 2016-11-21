package templates.faces.src_main_java.basepack.faces.presenter;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Attribute;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractXtendTemplate;

/**
 * File template for JSF/Faces presenter for managing entity.
 */
@SuppressWarnings("all")
public class EntityPresenterXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public EntityPresenterXtendTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
    super(stubbr, project);
    this.entity = entity;
    StringConcatenation _builder = new StringConcatenation();
    String _entityUpper = this.getEntityUpper();
    _builder.append(_entityUpper, "");
    _builder.append("Presenter");
    this.setFileName(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _basePackage = project.getBasePackage();
    _builder_1.append(_basePackage, "");
    _builder_1.append(".presenter");
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
    _builder_2.append("/presenter/");
    this.setRelativPath(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("JSF/Faces presenter for managing entity ");
    String _entityUpper_1 = this.getEntityUpper();
    _builder_3.append(_entityUpper_1, "");
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
    _builder.append("import com.google.gson.annotations.Until");
    _builder.newLine();
    _builder.append("import javax.annotation.Generated");
    _builder.newLine();
    _builder.append("import org.slf4j.Logger");
    _builder.newLine();
    _builder.newLine();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport = this.asImport("javax.enterprise.context.RequestScoped");
    _builder.append(_asImport, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport_1 = this.asImport("javax.inject.Named");
    _builder.append(_asImport_1, "");
    _builder.append("(value = \'presenter.");
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _lowerCase = null;
    if (_name!=null) {
      _lowerCase=_name.toLowerCase();
    }
    _builder.append(_lowerCase, "");
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.append("class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" extends AbstractPresenter {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@");
    String _asImport_2 = this.asImport("javax.inject.Inject");
    _builder.append(_asImport_2, "\t");
    _builder.append(" ");
    String _loggerType = this.getLoggerType();
    String _asImport_3 = this.asImport(_loggerType);
    _builder.append(_asImport_3, "\t");
    _builder.append(" ");
    String _loggerName = this.getLoggerName();
    _builder.append(_loggerName, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@");
    String _asImport_4 = this.asImport("javax.inject.Inject");
    _builder.append(_asImport_4, "\t");
    _builder.append(" ");
    Stubb _stubb = this.getStubb();
    String _packageName = null;
    if (_stubb!=null) {
      _packageName=_stubb.getPackageName();
    }
    String _plus = (_packageName + ".business.controller.");
    String _entityUpper = this.getEntityUpper();
    String _plus_1 = (_plus + _entityUpper);
    String _plus_2 = (_plus_1 + "Controller");
    String _asImport_5 = this.asImport(_plus_2);
    _builder.append(_asImport_5, "\t");
    _builder.append(" ");
    String _entityLower = this.getEntityLower();
    _builder.append(_entityLower, "\t");
    _builder.append("Controller");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@");
    String _asImport_6 = this.asImport("javax.annotation.PostConstruct");
    _builder.append(_asImport_6, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public override void init() {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override initView() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("throw new UnsupportedOperationException(\"TODO: auto-generated method stub\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override getBean() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("throw new UnsupportedOperationException(\"TODO: auto-generated method stub\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @return");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@");
    String _asImport_7 = this.asImport("javax.annotation.security.PermitAll");
    _builder.append(_asImport_7, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("def String submitSave() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val long id = getHttpPostParam(\'id\')");
    _builder.newLine();
    _builder.append("\t\t");
    String _loggerName_1 = this.getLoggerName();
    _builder.append(_loggerName_1, "\t\t");
    _builder.append(".info(\'submitSave(id={}) called.\', id)");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val ");
    String _entityUpper_1 = this.getEntityUpper();
    _builder.append(_entityUpper_1, "\t\t");
    _builder.append("BusinessObject ");
    String _entityLower_1 = this.getEntityLower();
    _builder.append(_entityLower_1, "\t\t");
    _builder.append("BusinessObject = new ");
    String _entityUpper_2 = this.getEntityUpper();
    _builder.append(_entityUpper_2, "\t\t");
    _builder.append("BusinessObject()");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _entityLower_2 = this.getEntityLower();
    _builder.append(_entityLower_2, "\t\t");
    _builder.append("Controller.save(");
    String _entityLower_3 = this.getEntityLower();
    _builder.append(_entityLower_3, "\t\t");
    _builder.append("BusinessObject)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//");
    String _entityLower_4 = this.getEntityLower();
    _builder.append(_entityLower_4, "\t\t");
    _builder.append("Controller.update()");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("//bean.principal = principalService.update(bean.principal)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//if (bean.principal != null) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//\tfacesContext.addMessage(null,");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//\t\tnew FacesMessage(FacesMessage.SEVERITY_INFO, \'Änderungen am Mitarbeiter wurden gespeichert!\',");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//\t\t\t\'Änderungen am Mitarbeiter wurden gespeichert!\'))");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//} else {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//\tfacesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, \'Fehler!\', \'Fehler!\'))");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\'/mobile/");
    String _entityLower_5 = this.getEntityLower();
    _builder.append(_entityLower_5, "\t\t");
    _builder.append(".xhtml\'");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @return");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def String goToDetails(long id) {");
    _builder.newLine();
    _builder.append("\t\t");
    String _loggerName_2 = this.getLoggerName();
    _builder.append(_loggerName_2, "\t\t");
    _builder.append(".info(\'goToDetails(id={}) called.\', id)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\'\'");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//bean.principal = principalService.find(id)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//initPrincipal");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//getOutcomePage(\'management-principal-details\')");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private def ");
    String _entityUpper_3 = this.getEntityUpper();
    _builder.append(_entityUpper_3, "\t");
    _builder.append("BusinessObject viewBean2BusinessObject(");
    Stubb _stubb_1 = this.getStubb();
    String _packageName_1 = null;
    if (_stubb_1!=null) {
      _packageName_1=_stubb_1.getPackageName();
    }
    String _plus_3 = (_packageName_1 + ".faces.bean.");
    String _entityUpper_4 = this.getEntityUpper();
    String _plus_4 = (_plus_3 + _entityUpper_4);
    String _plus_5 = (_plus_4 + "ViewBean");
    String _asImport_8 = this.asImport(_plus_5);
    _builder.append(_asImport_8, "\t");
    _builder.append(" ");
    String _entityLower_6 = this.getEntityLower();
    _builder.append(_entityLower_6, "\t");
    _builder.append("ViewBean) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val ");
    String _entityUpper_5 = this.getEntityUpper();
    _builder.append(_entityUpper_5, "\t\t");
    _builder.append("BusinessObject ");
    String _entityLower_7 = this.getEntityLower();
    _builder.append(_entityLower_7, "\t\t");
    _builder.append("BusinessObject = new ");
    String _entityUpper_6 = this.getEntityUpper();
    _builder.append(_entityUpper_6, "\t\t");
    _builder.append("BusinessObject()");
    _builder.newLineIfNotEmpty();
    {
      EList<Attribute> _attributes = null;
      if (this.entity!=null) {
        _attributes=this.entity.getAttributes();
      }
      for(final Attribute attribute : _attributes) {
        _builder.append("\t\t");
        String _entityLower_8 = this.getEntityLower();
        _builder.append(_entityLower_8, "\t\t");
        _builder.append("BusinessObject.");
        String _name_1 = null;
        if (attribute!=null) {
          _name_1=attribute.getName();
        }
        String _firstLower = null;
        if (_name_1!=null) {
          _firstLower=StringExtensions.toFirstLower(_name_1);
        }
        _builder.append(_firstLower, "\t\t");
        _builder.append(" = ");
        String _entityLower_9 = this.getEntityLower();
        _builder.append(_entityLower_9, "\t\t");
        _builder.append("ViewBean.");
        String _name_2 = null;
        if (attribute!=null) {
          _name_2=attribute.getName();
        }
        String _firstLower_1 = null;
        if (_name_2!=null) {
          _firstLower_1=StringExtensions.toFirstLower(_name_2);
        }
        _builder.append(_firstLower_1, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("return ");
    String _entityLower_10 = this.getEntityLower();
    _builder.append(_entityLower_10, "\t\t");
    _builder.append("BusinessObject");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private def ");
    Stubb _stubb_2 = this.getStubb();
    String _packageName_2 = null;
    if (_stubb_2!=null) {
      _packageName_2=_stubb_2.getPackageName();
    }
    String _plus_6 = (_packageName_2 + ".faces.bean.");
    String _entityUpper_7 = this.getEntityUpper();
    String _plus_7 = (_plus_6 + _entityUpper_7);
    String _plus_8 = (_plus_7 + "ViewBean");
    String _asImport_9 = this.asImport(_plus_8);
    _builder.append(_asImport_9, "\t");
    _builder.append(" businessObject2ViewBean(");
    Stubb _stubb_3 = this.getStubb();
    String _packageName_3 = null;
    if (_stubb_3!=null) {
      _packageName_3=_stubb_3.getPackageName();
    }
    String _plus_9 = (_packageName_3 + ".business.object.");
    String _entityUpper_8 = this.getEntityUpper();
    String _plus_10 = (_plus_9 + _entityUpper_8);
    String _plus_11 = (_plus_10 + "BusinessObject");
    String _asImport_10 = this.asImport(_plus_11);
    _builder.append(_asImport_10, "\t");
    _builder.append(" ");
    String _entityLower_11 = this.getEntityLower();
    _builder.append(_entityLower_11, "\t");
    _builder.append("BusinessObject) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val ");
    String _entityUpper_9 = this.getEntityUpper();
    _builder.append(_entityUpper_9, "\t\t");
    _builder.append("ViewBean ");
    String _entityLower_12 = this.getEntityLower();
    _builder.append(_entityLower_12, "\t\t");
    _builder.append("ViewBean = new ");
    String _entityUpper_10 = this.getEntityUpper();
    _builder.append(_entityUpper_10, "\t\t");
    _builder.append("ViewBean()");
    _builder.newLineIfNotEmpty();
    {
      EList<Attribute> _attributes_1 = null;
      if (this.entity!=null) {
        _attributes_1=this.entity.getAttributes();
      }
      for(final Attribute attribute_1 : _attributes_1) {
        _builder.append("\t\t");
        String _entityLower_13 = this.getEntityLower();
        _builder.append(_entityLower_13, "\t\t");
        _builder.append("ViewBean.");
        String _name_3 = null;
        if (attribute_1!=null) {
          _name_3=attribute_1.getName();
        }
        String _firstLower_2 = null;
        if (_name_3!=null) {
          _firstLower_2=StringExtensions.toFirstLower(_name_3);
        }
        _builder.append(_firstLower_2, "\t\t");
        _builder.append(" = ");
        String _entityLower_14 = this.getEntityLower();
        _builder.append(_entityLower_14, "\t\t");
        _builder.append("BusinessObject.");
        String _name_4 = null;
        if (attribute_1!=null) {
          _name_4=attribute_1.getName();
        }
        String _firstLower_3 = null;
        if (_name_4!=null) {
          _firstLower_3=StringExtensions.toFirstLower(_name_4);
        }
        _builder.append(_firstLower_3, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("return ");
    String _entityLower_15 = this.getEntityLower();
    _builder.append(_entityLower_15, "\t\t");
    _builder.append("ViewBean");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String getEntityLower() {
    StringConcatenation _builder = new StringConcatenation();
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _firstLower = null;
    if (_name!=null) {
      _firstLower=StringExtensions.toFirstLower(_name);
    }
    _builder.append(_firstLower, "");
    return _builder.toString();
  }
  
  private String getEntityUpper() {
    StringConcatenation _builder = new StringConcatenation();
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    _builder.append(_firstUpper, "");
    return _builder.toString();
  }
}
