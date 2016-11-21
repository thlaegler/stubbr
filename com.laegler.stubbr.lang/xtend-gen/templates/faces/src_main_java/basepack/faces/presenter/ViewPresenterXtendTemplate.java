package templates.faces.src_main_java.basepack.faces.presenter;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import com.laegler.stubbr.lang.stubbrLang.View;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractXtendTemplate;

/**
 * File template for JSF/Faces presenter for view.
 */
@SuppressWarnings("all")
public class ViewPresenterXtendTemplate extends AbstractXtendTemplate {
  private View view;
  
  public ViewPresenterXtendTemplate(final StubbrRegistry stubbr, final Project project, final View view) {
    super(stubbr, project);
    this.view = view;
    StringConcatenation _builder = new StringConcatenation();
    String _name = null;
    if (view!=null) {
      _name=view.getName();
    }
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    _builder.append(_firstUpper, "");
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
    _builder_3.append("JSF/Faces presenter for view ");
    String _name_1 = null;
    if (view!=null) {
      _name_1=view.getName();
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
    {
      EList<Entity> _assocEntities = null;
      if (this.view!=null) {
        _assocEntities=this.view.getAssocEntities();
      }
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(_assocEntities);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
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
        _builder.append(".persistence.service.");
        EList<Entity> _assocEntities_1 = null;
        if (this.view!=null) {
          _assocEntities_1=this.view.getAssocEntities();
        }
        Entity _get = null;
        if (_assocEntities_1!=null) {
          _get=_assocEntities_1.get(0);
        }
        String _name = null;
        if (_get!=null) {
          _name=_get.getName();
        }
        String _firstUpper = null;
        if (_name!=null) {
          _firstUpper=StringExtensions.toFirstUpper(_name);
        }
        _builder.append(_firstUpper, "");
        _builder.append("Service");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import com.google.gson.annotations.Until");
    _builder.newLine();
    _builder.append("import javax.annotation.Generated");
    _builder.newLine();
    _builder.append("import javax.annotation.PostConstruct");
    _builder.newLine();
    _builder.append("import javax.annotation.security.PermitAll");
    _builder.newLine();
    _builder.append("import javax.inject.Inject");
    _builder.newLine();
    _builder.append("import org.slf4j.Logger");
    _builder.newLine();
    _builder.newLine();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" extends AbstractPresenter {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject Logger ");
    String _loggerName = this.getLoggerName();
    _builder.append(_loggerName, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@PostConstruct");
    _builder.newLine();
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
    _builder.append("@PermitAll");
    _builder.newLine();
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
    String _name_1 = null;
    if (this.view!=null) {
      _name_1=this.view.getName();
    }
    String _firstLower = null;
    if (_name_1!=null) {
      _firstLower=StringExtensions.toFirstLower(_name_1);
    }
    _builder.append(_firstLower, "\t\t");
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
    _builder.append(".info(\'managementGoToPrincipalDetails(id={}) called.\', id)");
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
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
