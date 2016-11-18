package templates.persistence.src_main_java.basepack.persistence.service;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractXtendTemplate;

/**
 * File template for simple persistence service implementation for managing entity.
 */
@SuppressWarnings("all")
public class EntityServiceInterfaceXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public EntityServiceInterfaceXtendTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
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
    _builder.append("Service");
    this.setFileName(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _basePackage = project.getBasePackage();
    _builder_1.append(_basePackage, "");
    _builder_1.append(".service");
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
    _builder_2.append("/service/");
    this.setRelativPath(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("Simple persistence service for managing entity ");
    String _name_1 = null;
    if (entity!=null) {
      _name_1=entity.getName();
    }
    String _firstUpper_1 = null;
    if (_name_1!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_name_1);
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
    _builder.append(".model.entity.");
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.slf4j.Logger");
    _builder.newLine();
    _builder.append("import org.slf4j.LoggerFactory");
    _builder.newLine();
    _builder.append("import javax.ejb.Stateless");
    _builder.newLine();
    _builder.append("import javax.inject.Inject");
    _builder.newLine();
    _builder.append("import java.util.LinkedList");
    _builder.newLine();
    _builder.append("import java.util.List");
    _builder.newLine();
    _builder.append("import java.util.stream.Collectors");
    _builder.newLine();
    _builder.newLine();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport = this.asImport("javax.ejb.Stateless");
    _builder.append(_asImport, "");
    _builder.newLineIfNotEmpty();
    _builder.append("interface ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Persist entity ");
    String _name_1 = null;
    if (this.entity!=null) {
      _name_1=this.entity.getName();
    }
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param ");
    String _name_2 = null;
    if (this.entity!=null) {
      _name_2=this.entity.getName();
    }
    String _firstLower = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower, "\t ");
    _builder.append(" the entity to be persisted");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* @return the persisted entity");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public def ");
    String _name_3 = null;
    if (this.entity!=null) {
      _name_3=this.entity.getName();
    }
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
    _builder.append(_firstUpper_2, "\t");
    _builder.append(" persist(");
    String _name_4 = null;
    if (this.entity!=null) {
      _name_4=this.entity.getName();
    }
    String _firstUpper_3 = StringExtensions.toFirstUpper(_name_4);
    _builder.append(_firstUpper_3, "\t");
    _builder.append(" ");
    String _name_5 = null;
    if (this.entity!=null) {
      _name_5=this.entity.getName();
    }
    String _firstLower_1 = StringExtensions.toFirstLower(_name_5);
    _builder.append(_firstLower_1, "\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Update entity ");
    String _name_6 = null;
    if (this.entity!=null) {
      _name_6=this.entity.getName();
    }
    String _firstUpper_4 = StringExtensions.toFirstUpper(_name_6);
    _builder.append(_firstUpper_4, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param ");
    String _name_7 = null;
    if (this.entity!=null) {
      _name_7=this.entity.getName();
    }
    String _firstLower_2 = StringExtensions.toFirstLower(_name_7);
    _builder.append(_firstLower_2, "\t ");
    _builder.append(" the entity to be updated");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* @return the persisted entity");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public def ");
    String _name_8 = null;
    if (this.entity!=null) {
      _name_8=this.entity.getName();
    }
    String _firstUpper_5 = StringExtensions.toFirstUpper(_name_8);
    _builder.append(_firstUpper_5, "\t");
    _builder.append(" update(");
    String _name_9 = null;
    if (this.entity!=null) {
      _name_9=this.entity.getName();
    }
    String _firstUpper_6 = StringExtensions.toFirstUpper(_name_9);
    _builder.append(_firstUpper_6, "\t");
    _builder.append(" ");
    String _name_10 = null;
    if (this.entity!=null) {
      _name_10=this.entity.getName();
    }
    String _firstLower_3 = StringExtensions.toFirstLower(_name_10);
    _builder.append(_firstLower_3, "\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Get all of entity ");
    String _name_11 = null;
    if (this.entity!=null) {
      _name_11=this.entity.getName();
    }
    String _firstUpper_7 = null;
    if (_name_11!=null) {
      _firstUpper_7=StringExtensions.toFirstUpper(_name_11);
    }
    _builder.append(_firstUpper_7, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @return the list of entities");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public def List<");
    String _name_12 = null;
    if (this.entity!=null) {
      _name_12=this.entity.getName();
    }
    String _firstUpper_8 = StringExtensions.toFirstUpper(_name_12);
    _builder.append(_firstUpper_8, "\t");
    _builder.append("> findAll()");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Get entity ");
    String _name_13 = null;
    if (this.entity!=null) {
      _name_13=this.entity.getName();
    }
    String _firstLower_4 = StringExtensions.toFirstLower(_name_13);
    _builder.append(_firstLower_4, "\t ");
    _builder.append(" by ID.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param id the ID of the entity to find");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @return the entity");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public def ");
    String _name_14 = null;
    if (this.entity!=null) {
      _name_14=this.entity.getName();
    }
    String _firstUpper_9 = StringExtensions.toFirstUpper(_name_14);
    _builder.append(_firstUpper_9, "\t");
    _builder.append(" findById(");
    String _entityIdType = this.getEntityIdType();
    String _asImport_1 = this.asImport(_entityIdType);
    _builder.append(_asImport_1, "\t");
    _builder.append(" id)");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Remove entity ");
    String _name_15 = null;
    if (this.entity!=null) {
      _name_15=this.entity.getName();
    }
    String _firstUpper_10 = StringExtensions.toFirstUpper(_name_15);
    _builder.append(_firstUpper_10, "\t ");
    _builder.append(" by ID.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param id the ID of the entity to be removed");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public def void remove(");
    String _entityIdType_1 = this.getEntityIdType();
    String _asImport_2 = this.asImport(_entityIdType_1);
    _builder.append(_asImport_2, "\t");
    _builder.append(" id)");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
