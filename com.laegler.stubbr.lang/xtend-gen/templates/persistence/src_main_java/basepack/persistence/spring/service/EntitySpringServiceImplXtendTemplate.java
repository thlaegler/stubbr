package templates.persistence.src_main_java.basepack.persistence.spring.service;

import com.google.common.base.Objects;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractXtendTemplate;

/**
 * File template for SpringMVC-based persistence service implementation for managing entity.
 */
@SuppressWarnings("all")
public class EntitySpringServiceImplXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public EntitySpringServiceImplXtendTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
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
    _builder.append("SpringServiceImpl");
    this.setFileName(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("/src/main/java/");
    String _basePackage = null;
    if (project!=null) {
      _basePackage=project.getBasePackage();
    }
    String _path = null;
    if (_basePackage!=null) {
      _path=this.toPath(_basePackage);
    }
    _builder_1.append(_path, "");
    _builder_1.append("/spring/service/");
    this.setRelativPath(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("package ");
    String _basePackage_1 = project.getBasePackage();
    _builder_2.append(_basePackage_1, "");
    _builder_2.append(".spring.service");
    this.setHeader(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("SpringMVC-based persistence service implementation for managing entity ");
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
    _builder.append("import org.slf4j.Logger");
    _builder.newLine();
    _builder.append("import org.slf4j.LoggerFactory");
    _builder.newLine();
    {
      boolean _notEquals = (!Objects.equal("spring", "spring"));
      if (_notEquals) {
        _builder.append("import org.springframework.transaction.annotation.Transactional");
        _builder.newLine();
        _builder.append("import org.springframework.stereotype.Service");
        _builder.newLine();
      }
    }
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
    {
      boolean _notEquals_1 = (!Objects.equal("spring", "spring"));
      if (_notEquals_1) {
        _builder.append("@Service");
        _builder.newLine();
        _builder.append("@Transactional");
        _builder.newLine();
      }
    }
    _builder.append("@Stateless");
    _builder.newLine();
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
    _builder.append("SpringService {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected Logger log");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected ");
    String _name_1 = null;
    if (this.entity!=null) {
      _name_1=this.entity.getName();
    }
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "    ");
    _builder.append("SpringRepository ");
    String _name_2 = null;
    if (this.entity!=null) {
      _name_2=this.entity.getName();
    }
    String _firstLower = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower, "    ");
    _builder.append("Repository");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected ");
    String _name_3 = null;
    if (this.entity!=null) {
      _name_3=this.entity.getName();
    }
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
    _builder.append(_firstUpper_2, "    ");
    _builder.append("SpringMapper ");
    String _name_4 = null;
    if (this.entity!=null) {
      _name_4=this.entity.getName();
    }
    String _firstLower_1 = StringExtensions.toFirstLower(_name_4);
    _builder.append(_firstLower_1, "    ");
    _builder.append("Mapper");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Create a custom persistence operation");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public def void customOperation() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Save a ");
    String _name_5 = null;
    if (this.entity!=null) {
      _name_5=this.entity.getName();
    }
    String _firstLower_2 = StringExtensions.toFirstLower(_name_5);
    _builder.append(_firstLower_2, "     ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param ");
    String _name_6 = null;
    if (this.entity!=null) {
      _name_6=this.entity.getName();
    }
    String _firstLower_3 = StringExtensions.toFirstLower(_name_6);
    _builder.append(_firstLower_3, "     ");
    _builder.append("Dto the entity to save");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("* @return the persisted entity");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("override public ");
    String _name_7 = null;
    if (this.entity!=null) {
      _name_7=this.entity.getName();
    }
    String _firstUpper_3 = StringExtensions.toFirstUpper(_name_7);
    _builder.append(_firstUpper_3, "    ");
    _builder.append("Dto save(");
    String _name_8 = null;
    if (this.entity!=null) {
      _name_8=this.entity.getName();
    }
    String _firstUpper_4 = StringExtensions.toFirstUpper(_name_8);
    _builder.append(_firstUpper_4, "    ");
    _builder.append("Dto ");
    String _name_9 = null;
    if (this.entity!=null) {
      _name_9=this.entity.getName();
    }
    String _firstLower_4 = StringExtensions.toFirstLower(_name_9);
    _builder.append(_firstLower_4, "    ");
    _builder.append("Dto) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("log.debug(\'Request to save ");
    String _name_10 = null;
    if (this.entity!=null) {
      _name_10=this.entity.getName();
    }
    String _firstUpper_5 = StringExtensions.toFirstUpper(_name_10);
    _builder.append(_firstUpper_5, "        ");
    _builder.append(" : {}\', ");
    String _name_11 = null;
    if (this.entity!=null) {
      _name_11=this.entity.getName();
    }
    String _firstLower_5 = StringExtensions.toFirstLower(_name_11);
    _builder.append(_firstLower_5, "        ");
    _builder.append("Dto)");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("var ");
    String _name_12 = null;
    if (this.entity!=null) {
      _name_12=this.entity.getName();
    }
    String _firstUpper_6 = StringExtensions.toFirstUpper(_name_12);
    _builder.append(_firstUpper_6, "        ");
    _builder.append(" ");
    String _name_13 = null;
    if (this.entity!=null) {
      _name_13=this.entity.getName();
    }
    String _firstLower_6 = StringExtensions.toFirstLower(_name_13);
    _builder.append(_firstLower_6, "        ");
    _builder.append(" = ");
    String _name_14 = null;
    if (this.entity!=null) {
      _name_14=this.entity.getName();
    }
    String _firstLower_7 = StringExtensions.toFirstLower(_name_14);
    _builder.append(_firstLower_7, "        ");
    _builder.append("Mapper.");
    String _name_15 = null;
    if (this.entity!=null) {
      _name_15=this.entity.getName();
    }
    String _firstLower_8 = StringExtensions.toFirstLower(_name_15);
    _builder.append(_firstLower_8, "        ");
    _builder.append("DtoTo");
    String _name_16 = null;
    if (this.entity!=null) {
      _name_16=this.entity.getName();
    }
    String _firstUpper_7 = StringExtensions.toFirstUpper(_name_16);
    _builder.append(_firstUpper_7, "        ");
    _builder.append("(");
    String _name_17 = null;
    if (this.entity!=null) {
      _name_17=this.entity.getName();
    }
    String _firstLower_9 = StringExtensions.toFirstLower(_name_17);
    _builder.append(_firstLower_9, "        ");
    _builder.append("Dto)");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    String _name_18 = null;
    if (this.entity!=null) {
      _name_18=this.entity.getName();
    }
    String _firstLower_10 = StringExtensions.toFirstLower(_name_18);
    _builder.append(_firstLower_10, "        ");
    _builder.append(" = ");
    String _name_19 = null;
    if (this.entity!=null) {
      _name_19=this.entity.getName();
    }
    String _firstLower_11 = StringExtensions.toFirstLower(_name_19);
    _builder.append(_firstLower_11, "        ");
    _builder.append("Repository.save(");
    String _name_20 = null;
    if (this.entity!=null) {
      _name_20=this.entity.getName();
    }
    String _firstLower_12 = StringExtensions.toFirstLower(_name_20);
    _builder.append(_firstLower_12, "        ");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    String _name_21 = null;
    if (this.entity!=null) {
      _name_21=this.entity.getName();
    }
    String _firstUpper_8 = StringExtensions.toFirstUpper(_name_21);
    _builder.append(_firstUpper_8, "        ");
    _builder.append("Dto result = ");
    String _name_22 = null;
    if (this.entity!=null) {
      _name_22=this.entity.getName();
    }
    String _firstLower_13 = StringExtensions.toFirstLower(_name_22);
    _builder.append(_firstLower_13, "        ");
    _builder.append("Mapper.");
    String _name_23 = null;
    if (this.entity!=null) {
      _name_23=this.entity.getName();
    }
    String _firstLower_14 = StringExtensions.toFirstLower(_name_23);
    _builder.append(_firstLower_14, "        ");
    _builder.append("To");
    String _name_24 = null;
    if (this.entity!=null) {
      _name_24=this.entity.getName();
    }
    String _firstUpper_9 = StringExtensions.toFirstUpper(_name_24);
    _builder.append(_firstUpper_9, "        ");
    _builder.append("Dto(");
    String _name_25 = null;
    if (this.entity!=null) {
      _name_25=this.entity.getName();
    }
    String _firstLower_15 = StringExtensions.toFirstLower(_name_25);
    _builder.append(_firstLower_15, "        ");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("result");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*  Get all the ");
    String _name_26 = null;
    if (this.entity!=null) {
      _name_26=this.entity.getName();
    }
    String _firstLower_16 = StringExtensions.toFirstLower(_name_26);
    _builder.append(_firstLower_16, "     ");
    _builder.append("s.");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("*  ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*  @return the list of entities");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Transactional(readOnly = true) ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("override public List<");
    String _name_27 = null;
    if (this.entity!=null) {
      _name_27=this.entity.getName();
    }
    String _firstUpper_10 = StringExtensions.toFirstUpper(_name_27);
    _builder.append(_firstUpper_10, "    ");
    _builder.append("Dto> findAll() {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("log.debug(\'Request to get all ");
    String _name_28 = null;
    if (this.entity!=null) {
      _name_28=this.entity.getName();
    }
    String _firstUpper_11 = StringExtensions.toFirstUpper(_name_28);
    _builder.append(_firstUpper_11, "        ");
    _builder.append("s\')");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("val List<");
    String _name_29 = null;
    if (this.entity!=null) {
      _name_29=this.entity.getName();
    }
    String _firstUpper_12 = StringExtensions.toFirstUpper(_name_29);
    _builder.append(_firstUpper_12, "        ");
    _builder.append("Dto> result = ");
    String _name_30 = null;
    if (this.entity!=null) {
      _name_30=this.entity.getName();
    }
    String _firstLower_17 = StringExtensions.toFirstLower(_name_30);
    _builder.append(_firstLower_17, "        ");
    _builder.append("Repository.findAll.stream");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append(".map(");
    String _name_31 = null;
    if (this.entity!=null) {
      _name_31=this.entity.getName();
    }
    String _firstLower_18 = StringExtensions.toFirstLower(_name_31);
    _builder.append(_firstLower_18, "            ");
    _builder.append("Mapper::");
    String _name_32 = null;
    if (this.entity!=null) {
      _name_32=this.entity.getName();
    }
    String _firstLower_19 = StringExtensions.toFirstLower(_name_32);
    _builder.append(_firstLower_19, "            ");
    _builder.append("To");
    String _name_33 = null;
    if (this.entity!=null) {
      _name_33=this.entity.getName();
    }
    String _firstUpper_13 = StringExtensions.toFirstUpper(_name_33);
    _builder.append(_firstUpper_13, "            ");
    _builder.append("Dto)");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append(".collect(Collectors.toCollection(LinkedList::new))");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("result");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*  Get one ");
    String _name_34 = null;
    if (this.entity!=null) {
      _name_34=this.entity.getName();
    }
    String _firstLower_20 = StringExtensions.toFirstLower(_name_34);
    _builder.append(_firstLower_20, "     ");
    _builder.append(" by id.");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*  @param id the id of the entity");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*  @return the entity");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Transactional(readOnly = true) ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("override public ");
    String _name_35 = null;
    if (this.entity!=null) {
      _name_35=this.entity.getName();
    }
    String _firstUpper_14 = StringExtensions.toFirstUpper(_name_35);
    _builder.append(_firstUpper_14, "    ");
    _builder.append("Dto findOne(Long id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("log.debug(\'Request to get ");
    String _name_36 = null;
    if (this.entity!=null) {
      _name_36=this.entity.getName();
    }
    String _firstUpper_15 = StringExtensions.toFirstUpper(_name_36);
    _builder.append(_firstUpper_15, "        ");
    _builder.append(" : {}\', id)");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("val ");
    String _name_37 = null;
    if (this.entity!=null) {
      _name_37=this.entity.getName();
    }
    String _firstUpper_16 = StringExtensions.toFirstUpper(_name_37);
    _builder.append(_firstUpper_16, "        ");
    _builder.append(" ");
    String _name_38 = null;
    if (this.entity!=null) {
      _name_38=this.entity.getName();
    }
    String _firstLower_21 = StringExtensions.toFirstLower(_name_38);
    _builder.append(_firstLower_21, "        ");
    _builder.append(" = ");
    String _name_39 = null;
    if (this.entity!=null) {
      _name_39=this.entity.getName();
    }
    String _firstLower_22 = StringExtensions.toFirstLower(_name_39);
    _builder.append(_firstLower_22, "        ");
    _builder.append("Repository.findOne(id)");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("val ");
    String _name_40 = null;
    if (this.entity!=null) {
      _name_40=this.entity.getName();
    }
    String _firstUpper_17 = StringExtensions.toFirstUpper(_name_40);
    _builder.append(_firstUpper_17, "        ");
    _builder.append("Dto ");
    String _name_41 = null;
    if (this.entity!=null) {
      _name_41=this.entity.getName();
    }
    String _firstLower_23 = StringExtensions.toFirstLower(_name_41);
    _builder.append(_firstLower_23, "        ");
    _builder.append("Dto = ");
    String _name_42 = null;
    if (this.entity!=null) {
      _name_42=this.entity.getName();
    }
    String _firstLower_24 = StringExtensions.toFirstLower(_name_42);
    _builder.append(_firstLower_24, "        ");
    _builder.append("Mapper.");
    String _name_43 = null;
    if (this.entity!=null) {
      _name_43=this.entity.getName();
    }
    String _firstLower_25 = StringExtensions.toFirstLower(_name_43);
    _builder.append(_firstLower_25, "        ");
    _builder.append("To");
    String _name_44 = null;
    if (this.entity!=null) {
      _name_44=this.entity.getName();
    }
    String _firstUpper_18 = StringExtensions.toFirstUpper(_name_44);
    _builder.append(_firstUpper_18, "        ");
    _builder.append("Dto(");
    String _name_45 = null;
    if (this.entity!=null) {
      _name_45=this.entity.getName();
    }
    String _firstLower_26 = StringExtensions.toFirstLower(_name_45);
    _builder.append(_firstLower_26, "        ");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return ");
    String _name_46 = null;
    if (this.entity!=null) {
      _name_46=this.entity.getName();
    }
    String _firstLower_27 = StringExtensions.toFirstLower(_name_46);
    _builder.append(_firstLower_27, "        ");
    _builder.append("Dto");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*  Delete the  ");
    String _name_47 = null;
    if (this.entity!=null) {
      _name_47=this.entity.getName();
    }
    String _firstUpper_19 = StringExtensions.toFirstUpper(_name_47);
    _builder.append(_firstUpper_19, "     ");
    _builder.append(" by id.");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*  @param id the id of the entity");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("override public void delete(Long id) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("log.debug(\'Request to delete ");
    String _name_48 = null;
    if (this.entity!=null) {
      _name_48=this.entity.getName();
    }
    String _firstUpper_20 = StringExtensions.toFirstUpper(_name_48);
    _builder.append(_firstUpper_20, "        ");
    _builder.append(" : {}\', id)");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    String _name_49 = null;
    if (this.entity!=null) {
      _name_49=this.entity.getName();
    }
    String _firstLower_28 = StringExtensions.toFirstLower(_name_49);
    _builder.append(_firstLower_28, "        ");
    _builder.append("Repository.delete(id)");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
