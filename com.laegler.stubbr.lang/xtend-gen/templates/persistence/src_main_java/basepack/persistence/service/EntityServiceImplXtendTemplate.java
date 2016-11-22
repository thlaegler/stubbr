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
public class EntityServiceImplXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public EntityServiceImplXtendTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
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
    _builder.append("ServiceImpl");
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
    _builder_3.append("Simple persistence service implementation for managing entity ");
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
  }
  
  @Override
  public String getTemplate() {
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
    _builder.append(".model.entity.*");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.util.List");
    _builder.newLine();
    _builder.newLine();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport = this.asImport("javax.ejb.Stateless");
    _builder.append(_asImport, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport_1 = this.asImport("javax.annotation.security.PermitAll");
    _builder.append(_asImport_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport_2 = this.asImport("javax.ejb.Local");
    _builder.append(_asImport_2, "");
    _builder.newLineIfNotEmpty();
    _builder.append("class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" implements ");
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    _builder.append(_firstUpper, "");
    _builder.append("Service {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@");
    String _asImport_3 = this.asImport("javax.inject.Inject");
    _builder.append(_asImport_3, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _asImport_4 = this.asImport("org.slf4j.Logger");
    _builder.append(_asImport_4, "\t");
    _builder.append(" ");
    String _loggerName = this.getLoggerName();
    _builder.append(_loggerName, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@");
    String _asImport_5 = this.asImport("javax.persistence.PersistenceContext");
    _builder.append(_asImport_5, "\t");
    _builder.append("(unitName = \'unitName\')");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _asImport_6 = this.asImport("javax.persistence.EntityManager");
    _builder.append(_asImport_6, "\t");
    _builder.append(" em");
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
    String _firstUpper_1 = null;
    if (_name_1!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_name_1);
    }
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
    String _firstLower = null;
    if (_name_2!=null) {
      _firstLower=StringExtensions.toFirstLower(_name_2);
    }
    _builder.append(_firstLower, "\t ");
    _builder.append(" the entity to be persisted.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* @return the persisted entity");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override public ");
    String _name_3 = null;
    if (this.entity!=null) {
      _name_3=this.entity.getName();
    }
    String _firstUpper_2 = null;
    if (_name_3!=null) {
      _firstUpper_2=StringExtensions.toFirstUpper(_name_3);
    }
    _builder.append(_firstUpper_2, "\t");
    _builder.append(" persist(");
    String _name_4 = null;
    if (this.entity!=null) {
      _name_4=this.entity.getName();
    }
    String _firstUpper_3 = null;
    if (_name_4!=null) {
      _firstUpper_3=StringExtensions.toFirstUpper(_name_4);
    }
    _builder.append(_firstUpper_3, "\t");
    _builder.append(" ");
    String _name_5 = null;
    if (this.entity!=null) {
      _name_5=this.entity.getName();
    }
    String _firstLower_1 = null;
    if (_name_5!=null) {
      _firstLower_1=StringExtensions.toFirstLower(_name_5);
    }
    _builder.append(_firstLower_1, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _loggerName_1 = this.getLoggerName();
    _builder.append(_loggerName_1, "\t\t");
    _builder.append(".debug(\'Try to persist entity ");
    String _name_6 = null;
    if (this.entity!=null) {
      _name_6=this.entity.getName();
    }
    String _firstUpper_4 = null;
    if (_name_6!=null) {
      _firstUpper_4=StringExtensions.toFirstUpper(_name_6);
    }
    _builder.append(_firstUpper_4, "\t\t");
    _builder.append(" : {}\', ");
    String _name_7 = null;
    if (this.entity!=null) {
      _name_7=this.entity.getName();
    }
    String _firstLower_2 = null;
    if (_name_7!=null) {
      _firstLower_2=StringExtensions.toFirstLower(_name_7);
    }
    _builder.append(_firstLower_2, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (");
    String _name_8 = null;
    if (this.entity!=null) {
      _name_8=this.entity.getName();
    }
    String _firstLower_3 = null;
    if (_name_8!=null) {
      _firstLower_3=StringExtensions.toFirstLower(_name_8);
    }
    _builder.append(_firstLower_3, "\t\t");
    _builder.append(" != null) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("//em.transaction.begin");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("em.persist(");
    String _name_9 = null;
    if (this.entity!=null) {
      _name_9=this.entity.getName();
    }
    String _firstLower_4 = null;
    if (_name_9!=null) {
      _firstLower_4=StringExtensions.toFirstLower(_name_9);
    }
    _builder.append(_firstLower_4, "\t\t\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("//em.transaction.commit");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("em.flush");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    String _loggerName_2 = this.getLoggerName();
    _builder.append(_loggerName_2, "\t\t\t\t");
    _builder.append(".info(\'persist(entity={}) Entity ");
    String _name_10 = null;
    if (this.entity!=null) {
      _name_10=this.entity.getName();
    }
    String _firstUpper_5 = null;
    if (_name_10!=null) {
      _firstUpper_5=StringExtensions.toFirstUpper(_name_10);
    }
    _builder.append(_firstUpper_5, "\t\t\t\t");
    _builder.append(" persisted.\', ");
    String _name_11 = null;
    if (this.entity!=null) {
      _name_11=this.entity.getName();
    }
    String _firstLower_5 = null;
    if (_name_11!=null) {
      _firstLower_5=StringExtensions.toFirstLower(_name_11);
    }
    _builder.append(_firstLower_5, "\t\t\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("return findById(");
    String _name_12 = null;
    if (this.entity!=null) {
      _name_12=this.entity.getName();
    }
    String _firstLower_6 = null;
    if (_name_12!=null) {
      _firstLower_6=StringExtensions.toFirstLower(_name_12);
    }
    _builder.append(_firstLower_6, "\t\t\t\t");
    _builder.append(".id)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("} catch (Exception e) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    String _loggerName_3 = this.getLoggerName();
    _builder.append(_loggerName_3, "\t\t\t\t");
    _builder.append(".error(\'persist(entity={}) Failed to persist entity ");
    String _name_13 = null;
    if (this.entity!=null) {
      _name_13=this.entity.getName();
    }
    String _firstUpper_6 = null;
    if (_name_13!=null) {
      _firstUpper_6=StringExtensions.toFirstUpper(_name_13);
    }
    _builder.append(_firstUpper_6, "\t\t\t\t");
    _builder.append(".\', ");
    String _name_14 = null;
    if (this.entity!=null) {
      _name_14=this.entity.getName();
    }
    String _firstLower_7 = null;
    if (_name_14!=null) {
      _firstLower_7=StringExtensions.toFirstLower(_name_14);
    }
    _builder.append(_firstLower_7, "\t\t\t\t");
    _builder.append(", e)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("return null");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    String _loggerName_4 = this.getLoggerName();
    _builder.append(_loggerName_4, "\t\t");
    _builder.append(".warn(\'persist(entity={}) Cannot persist null entity\')");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return null");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Update entity ");
    String _name_15 = null;
    if (this.entity!=null) {
      _name_15=this.entity.getName();
    }
    String _firstUpper_7 = null;
    if (_name_15!=null) {
      _firstUpper_7=StringExtensions.toFirstUpper(_name_15);
    }
    _builder.append(_firstUpper_7, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param ");
    String _name_16 = null;
    if (this.entity!=null) {
      _name_16=this.entity.getName();
    }
    String _firstLower_8 = null;
    if (_name_16!=null) {
      _firstLower_8=StringExtensions.toFirstLower(_name_16);
    }
    _builder.append(_firstLower_8, "\t ");
    _builder.append(" the entity to be updated.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* @return the updated entity");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override public ");
    String _name_17 = null;
    if (this.entity!=null) {
      _name_17=this.entity.getName();
    }
    String _firstUpper_8 = null;
    if (_name_17!=null) {
      _firstUpper_8=StringExtensions.toFirstUpper(_name_17);
    }
    _builder.append(_firstUpper_8, "\t");
    _builder.append(" update(");
    String _name_18 = null;
    if (this.entity!=null) {
      _name_18=this.entity.getName();
    }
    String _firstUpper_9 = null;
    if (_name_18!=null) {
      _firstUpper_9=StringExtensions.toFirstUpper(_name_18);
    }
    _builder.append(_firstUpper_9, "\t");
    _builder.append(" ");
    String _name_19 = null;
    if (this.entity!=null) {
      _name_19=this.entity.getName();
    }
    String _firstLower_9 = null;
    if (_name_19!=null) {
      _firstLower_9=StringExtensions.toFirstLower(_name_19);
    }
    _builder.append(_firstLower_9, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _loggerName_5 = this.getLoggerName();
    _builder.append(_loggerName_5, "\t\t");
    _builder.append(".debug(\'update(entity={}) Try to update entity ");
    String _name_20 = null;
    if (this.entity!=null) {
      _name_20=this.entity.getName();
    }
    String _firstUpper_10 = null;
    if (_name_20!=null) {
      _firstUpper_10=StringExtensions.toFirstUpper(_name_20);
    }
    _builder.append(_firstUpper_10, "\t\t");
    _builder.append(" : {}\', ");
    String _name_21 = null;
    if (this.entity!=null) {
      _name_21=this.entity.getName();
    }
    String _firstLower_10 = null;
    if (_name_21!=null) {
      _firstLower_10=StringExtensions.toFirstLower(_name_21);
    }
    _builder.append(_firstLower_10, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (");
    String _name_22 = null;
    if (this.entity!=null) {
      _name_22=this.entity.getName();
    }
    String _firstLower_11 = null;
    if (_name_22!=null) {
      _firstLower_11=StringExtensions.toFirstLower(_name_22);
    }
    _builder.append(_firstLower_11, "\t\t");
    _builder.append(" != null) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("//em.transaction.begin");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("em.persist(");
    String _name_23 = null;
    if (this.entity!=null) {
      _name_23=this.entity.getName();
    }
    String _firstLower_12 = null;
    if (_name_23!=null) {
      _firstLower_12=StringExtensions.toFirstLower(_name_23);
    }
    _builder.append(_firstLower_12, "\t\t\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("//em.transaction.commit");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("em.flush");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    String _loggerName_6 = this.getLoggerName();
    _builder.append(_loggerName_6, "\t\t\t\t");
    _builder.append(".info(\'update(entity={}) Entity ");
    String _name_24 = null;
    if (this.entity!=null) {
      _name_24=this.entity.getName();
    }
    String _firstUpper_11 = null;
    if (_name_24!=null) {
      _firstUpper_11=StringExtensions.toFirstUpper(_name_24);
    }
    _builder.append(_firstUpper_11, "\t\t\t\t");
    _builder.append(" updated.\', ");
    String _name_25 = null;
    if (this.entity!=null) {
      _name_25=this.entity.getName();
    }
    String _firstLower_13 = null;
    if (_name_25!=null) {
      _firstLower_13=StringExtensions.toFirstLower(_name_25);
    }
    _builder.append(_firstLower_13, "\t\t\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("return findById(");
    String _name_26 = null;
    if (this.entity!=null) {
      _name_26=this.entity.getName();
    }
    String _firstLower_14 = null;
    if (_name_26!=null) {
      _firstLower_14=StringExtensions.toFirstLower(_name_26);
    }
    _builder.append(_firstLower_14, "\t\t\t\t");
    _builder.append(".id)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("} catch (Exception e) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    String _loggerName_7 = this.getLoggerName();
    _builder.append(_loggerName_7, "\t\t\t\t");
    _builder.append(".error(\'update(entity={}) Failed to update entity ");
    String _name_27 = null;
    if (this.entity!=null) {
      _name_27=this.entity.getName();
    }
    String _firstUpper_12 = null;
    if (_name_27!=null) {
      _firstUpper_12=StringExtensions.toFirstUpper(_name_27);
    }
    _builder.append(_firstUpper_12, "\t\t\t\t");
    _builder.append(".\', ");
    String _name_28 = null;
    if (this.entity!=null) {
      _name_28=this.entity.getName();
    }
    String _firstLower_15 = null;
    if (_name_28!=null) {
      _firstLower_15=StringExtensions.toFirstLower(_name_28);
    }
    _builder.append(_firstLower_15, "\t\t\t\t");
    _builder.append(", e)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("return null");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    String _loggerName_8 = this.getLoggerName();
    _builder.append(_loggerName_8, "\t\t");
    _builder.append(".warn(\'update(entity={}) Cannot update null entity\')");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return null");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Get all of entity ");
    String _name_29 = null;
    if (this.entity!=null) {
      _name_29=this.entity.getName();
    }
    String _firstUpper_13 = null;
    if (_name_29!=null) {
      _firstUpper_13=StringExtensions.toFirstUpper(_name_29);
    }
    _builder.append(_firstUpper_13, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @return the list of all entities");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override public ");
    String _asImport_7 = this.asImport("java.util.List");
    _builder.append(_asImport_7, "\t");
    _builder.append("<");
    String _name_30 = null;
    if (this.entity!=null) {
      _name_30=this.entity.getName();
    }
    String _firstUpper_14 = null;
    if (_name_30!=null) {
      _firstUpper_14=StringExtensions.toFirstUpper(_name_30);
    }
    _builder.append(_firstUpper_14, "\t");
    _builder.append("> findAll() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _loggerName_9 = this.getLoggerName();
    _builder.append(_loggerName_9, "\t\t");
    _builder.append(".debug(\'findAll() Try to get all of entity ");
    String _name_31 = null;
    if (this.entity!=null) {
      _name_31=this.entity.getName();
    }
    String _firstUpper_15 = null;
    if (_name_31!=null) {
      _firstUpper_15=StringExtensions.toFirstUpper(_name_31);
    }
    _builder.append(_firstUpper_15, "\t\t");
    _builder.append(".\')");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("val ");
    String _asImport_8 = this.asImport("javax.persistence.Query");
    _builder.append(_asImport_8, "\t\t\t");
    _builder.append(" query = em.createNamedQuery(\'");
    String _name_32 = null;
    if (this.entity!=null) {
      _name_32=this.entity.getName();
    }
    String _firstUpper_16 = null;
    if (_name_32!=null) {
      _firstUpper_16=StringExtensions.toFirstUpper(_name_32);
    }
    _builder.append(_firstUpper_16, "\t\t\t");
    _builder.append(".findAll\')");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("val ");
    String _asImport_9 = this.asImport("java.util.List");
    _builder.append(_asImport_9, "\t\t\t");
    _builder.append("<");
    String _name_33 = null;
    if (this.entity!=null) {
      _name_33=this.entity.getName();
    }
    String _firstUpper_17 = null;
    if (_name_33!=null) {
      _firstUpper_17=StringExtensions.toFirstUpper(_name_33);
    }
    _builder.append(_firstUpper_17, "\t\t\t");
    _builder.append("> result = query.resultList");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _loggerName_10 = this.getLoggerName();
    _builder.append(_loggerName_10, "\t\t\t");
    _builder.append(".info(\'findAll() Got all of entity ");
    String _name_34 = null;
    if (this.entity!=null) {
      _name_34=this.entity.getName();
    }
    String _firstUpper_18 = null;
    if (_name_34!=null) {
      _firstUpper_18=StringExtensions.toFirstUpper(_name_34);
    }
    _builder.append(_firstUpper_18, "\t\t\t");
    _builder.append(".\')");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return result");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} catch (Exception e) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _loggerName_11 = this.getLoggerName();
    _builder.append(_loggerName_11, "\t\t\t");
    _builder.append(".error(\'findAll() Failed to get all of entity ");
    String _name_35 = null;
    if (this.entity!=null) {
      _name_35=this.entity.getName();
    }
    String _firstUpper_19 = null;
    if (_name_35!=null) {
      _firstUpper_19=StringExtensions.toFirstUpper(_name_35);
    }
    _builder.append(_firstUpper_19, "\t\t\t");
    _builder.append(".\', e)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return ");
    String _asImport_10 = this.asImport("java.util.Collections");
    _builder.append(_asImport_10, "\t\t\t");
    _builder.append(".emptyList");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Get entity ");
    String _name_36 = null;
    if (this.entity!=null) {
      _name_36=this.entity.getName();
    }
    String _firstUpper_20 = null;
    if (_name_36!=null) {
      _firstUpper_20=StringExtensions.toFirstUpper(_name_36);
    }
    _builder.append(_firstUpper_20, "\t ");
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
    _builder.append("override public ");
    String _name_37 = null;
    if (this.entity!=null) {
      _name_37=this.entity.getName();
    }
    String _firstUpper_21 = null;
    if (_name_37!=null) {
      _firstUpper_21=StringExtensions.toFirstUpper(_name_37);
    }
    _builder.append(_firstUpper_21, "\t");
    _builder.append(" findById(");
    String _entityIdType = this.getEntityIdType();
    String _asImport_11 = this.asImport(_entityIdType);
    _builder.append(_asImport_11, "\t");
    _builder.append(" id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _loggerName_12 = this.getLoggerName();
    _builder.append(_loggerName_12, "\t\t");
    _builder.append(".debug(\'findById(id={}) Try to get entity by ID.\', id)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//val String queryString = \'SELECT e FROM ");
    String _name_38 = null;
    if (this.entity!=null) {
      _name_38=this.entity.getName();
    }
    String _lowerCase = null;
    if (_name_38!=null) {
      _lowerCase=_name_38.toLowerCase();
    }
    _builder.append(_lowerCase, "\t\t");
    _builder.append(" e WHERE e.id = :id\'");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("//val TypedQuery<");
    String _name_39 = null;
    if (this.entity!=null) {
      _name_39=this.entity.getName();
    }
    String _firstUpper_22 = null;
    if (_name_39!=null) {
      _firstUpper_22=StringExtensions.toFirstUpper(_name_39);
    }
    _builder.append(_firstUpper_22, "\t\t\t");
    _builder.append("> query = em.createNamedQuery(");
    String _name_40 = null;
    if (this.entity!=null) {
      _name_40=this.entity.getName();
    }
    String _firstUpper_23 = null;
    if (_name_40!=null) {
      _firstUpper_23=StringExtensions.toFirstUpper(_name_40);
    }
    _builder.append(_firstUpper_23, "\t\t\t");
    _builder.append(".findById, ");
    String _name_41 = null;
    if (this.entity!=null) {
      _name_41=this.entity.getName();
    }
    String _firstUpper_24 = null;
    if (_name_41!=null) {
      _firstUpper_24=StringExtensions.toFirstUpper(_name_41);
    }
    _builder.append(_firstUpper_24, "\t\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("//query.setParameter(\'id\', id);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("//val ");
    String _name_42 = null;
    if (this.entity!=null) {
      _name_42=this.entity.getName();
    }
    String _firstUpper_25 = null;
    if (_name_42!=null) {
      _firstUpper_25=StringExtensions.toFirstUpper(_name_42);
    }
    _builder.append(_firstUpper_25, "\t\t\t");
    _builder.append(" ");
    String _name_43 = null;
    if (this.entity!=null) {
      _name_43=this.entity.getName();
    }
    String _firstLower_16 = null;
    if (_name_43!=null) {
      _firstLower_16=StringExtensions.toFirstLower(_name_43);
    }
    _builder.append(_firstLower_16, "\t\t\t");
    _builder.append(" = query.singleResult");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("val ");
    String _name_44 = null;
    if (this.entity!=null) {
      _name_44=this.entity.getName();
    }
    String _firstUpper_26 = null;
    if (_name_44!=null) {
      _firstUpper_26=StringExtensions.toFirstUpper(_name_44);
    }
    _builder.append(_firstUpper_26, "\t\t\t");
    _builder.append(" ");
    String _name_45 = null;
    if (this.entity!=null) {
      _name_45=this.entity.getName();
    }
    String _firstLower_17 = null;
    if (_name_45!=null) {
      _firstLower_17=StringExtensions.toFirstLower(_name_45);
    }
    _builder.append(_firstLower_17, "\t\t\t");
    _builder.append(" = em.find(");
    String _name_46 = null;
    if (this.entity!=null) {
      _name_46=this.entity.getName();
    }
    String _firstUpper_27 = null;
    if (_name_46!=null) {
      _firstUpper_27=StringExtensions.toFirstUpper(_name_46);
    }
    _builder.append(_firstUpper_27, "\t\t\t");
    _builder.append(", id);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _loggerName_13 = this.getLoggerName();
    _builder.append(_loggerName_13, "\t\t\t");
    _builder.append(".info(\'findById(id={}) Got entity by ID.\', id)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return ");
    String _name_47 = null;
    if (this.entity!=null) {
      _name_47=this.entity.getName();
    }
    String _firstLower_18 = null;
    if (_name_47!=null) {
      _firstLower_18=StringExtensions.toFirstLower(_name_47);
    }
    _builder.append(_firstLower_18, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("} catch (Exception e) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _loggerName_14 = this.getLoggerName();
    _builder.append(_loggerName_14, "\t\t\t");
    _builder.append(".error(\'findById(id={}) Failed to get entity by ID.\', id)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return null");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Remove entity ");
    String _name_48 = null;
    if (this.entity!=null) {
      _name_48=this.entity.getName();
    }
    String _firstUpper_28 = null;
    if (_name_48!=null) {
      _firstUpper_28=StringExtensions.toFirstUpper(_name_48);
    }
    _builder.append(_firstUpper_28, "\t ");
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
    _builder.append("override public void remove(");
    String _entityIdType_1 = this.getEntityIdType();
    String _asImport_12 = this.asImport(_entityIdType_1);
    _builder.append(_asImport_12, "\t");
    _builder.append(" id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _loggerName_15 = this.getLoggerName();
    _builder.append(_loggerName_15, "\t\t");
    _builder.append(".debug(\'remove(id={}) Try to remove entity by ID {}.\', id, id)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("val ");
    String _name_49 = null;
    if (this.entity!=null) {
      _name_49=this.entity.getName();
    }
    String _firstUpper_29 = null;
    if (_name_49!=null) {
      _firstUpper_29=StringExtensions.toFirstUpper(_name_49);
    }
    _builder.append(_firstUpper_29, "\t\t\t");
    _builder.append(" ");
    String _name_50 = null;
    if (this.entity!=null) {
      _name_50=this.entity.getName();
    }
    String _firstLower_19 = null;
    if (_name_50!=null) {
      _firstLower_19=StringExtensions.toFirstLower(_name_50);
    }
    _builder.append(_firstLower_19, "\t\t\t");
    _builder.append(" = findById(id)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("em.remove(");
    String _name_51 = null;
    if (this.entity!=null) {
      _name_51=this.entity.getName();
    }
    String _firstLower_20 = null;
    if (_name_51!=null) {
      _firstLower_20=StringExtensions.toFirstLower(_name_51);
    }
    _builder.append(_firstLower_20, "\t\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _loggerName_16 = this.getLoggerName();
    _builder.append(_loggerName_16, "\t\t\t");
    _builder.append(".info(\'remove(id={}) Removed entity by ID {}.\', id, id)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("} catch (Exception e) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _loggerName_17 = this.getLoggerName();
    _builder.append(_loggerName_17, "\t\t\t");
    _builder.append(".error(\'remove(id={}) Failed to remove entity by ID {}.\', id, id)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
