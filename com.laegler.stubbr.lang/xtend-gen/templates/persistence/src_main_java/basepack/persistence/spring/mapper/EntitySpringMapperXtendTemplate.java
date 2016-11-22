package templates.persistence.src_main_java.basepack.persistence.spring.mapper;

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
 * File template for SpringMVC-based DTO-mapper for managing entity.
 */
@SuppressWarnings("all")
public class EntitySpringMapperXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public EntitySpringMapperXtendTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
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
    _builder.append("SpringMapper");
    this.setFileName(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _basePackage = project.getBasePackage();
    _builder_1.append(_basePackage, "");
    _builder_1.append(".spring.mapper");
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
    _builder_2.append("/spring/mapper/");
    this.setRelativPath(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("SpringMVC-based DTO-mapper for managing entity ");
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
    _builder.append("import ");
    StubbrRegistry _stubbr_1 = this.getStubbr();
    Stubb _stubb_1 = null;
    if (_stubbr_1!=null) {
      _stubb_1=_stubbr_1.getStubb();
    }
    String _packageName_1 = null;
    if (_stubb_1!=null) {
      _packageName_1=_stubb_1.getPackageName();
    }
    _builder.append(_packageName_1, "");
    _builder.append(".persistence.dto.");
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    _builder.append(_firstUpper, "");
    _builder.append("Dto");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.mapstruct.*");
    _builder.newLine();
    _builder.append("import java.util.List");
    _builder.newLine();
    _builder.newLine();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@Mapper(componentModel = \'spring\', uses = {})");
    _builder.newLine();
    _builder.append("public interface ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Attribute> _attributes = null;
      if (this.entity!=null) {
        _attributes=this.entity.getAttributes();
      }
      for(final Attribute attribute : _attributes) {
        _builder.append("\t");
        _builder.append("@Mapping(source = \'department.id\', target = \'departmentId\')");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Mapping(source = \'manager.id\', target = \'managerId\')");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    String _name_1 = null;
    if (this.entity!=null) {
      _name_1=this.entity.getName();
    }
    String _firstUpper_1 = null;
    if (_name_1!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_name_1);
    }
    _builder.append(_firstUpper_1, "\t");
    _builder.append("SpringDto ");
    String _name_2 = null;
    if (this.entity!=null) {
      _name_2=this.entity.getName();
    }
    String _firstLower = null;
    if (_name_2!=null) {
      _firstLower=StringExtensions.toFirstLower(_name_2);
    }
    _builder.append(_firstLower, "\t");
    _builder.append("To");
    String _name_3 = null;
    if (this.entity!=null) {
      _name_3=this.entity.getName();
    }
    String _firstUpper_2 = null;
    if (_name_3!=null) {
      _firstUpper_2=StringExtensions.toFirstUpper(_name_3);
    }
    _builder.append(_firstUpper_2, "\t");
    _builder.append("Dto(");
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
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public def List<");
    String _name_6 = null;
    if (this.entity!=null) {
      _name_6=this.entity.getName();
    }
    String _firstUpper_4 = null;
    if (_name_6!=null) {
      _firstUpper_4=StringExtensions.toFirstUpper(_name_6);
    }
    _builder.append(_firstUpper_4, "\t");
    _builder.append("Dto> ");
    String _name_7 = null;
    if (this.entity!=null) {
      _name_7=this.entity.getName();
    }
    String _firstLower_2 = null;
    if (_name_7!=null) {
      _firstLower_2=StringExtensions.toFirstLower(_name_7);
    }
    _builder.append(_firstLower_2, "\t");
    _builder.append("sTo");
    String _name_8 = null;
    if (this.entity!=null) {
      _name_8=this.entity.getName();
    }
    String _firstUpper_5 = null;
    if (_name_8!=null) {
      _firstUpper_5=StringExtensions.toFirstUpper(_name_8);
    }
    _builder.append(_firstUpper_5, "\t");
    _builder.append("Dtos(List<");
    String _name_9 = null;
    if (this.entity!=null) {
      _name_9=this.entity.getName();
    }
    String _firstUpper_6 = null;
    if (_name_9!=null) {
      _firstUpper_6=StringExtensions.toFirstUpper(_name_9);
    }
    _builder.append(_firstUpper_6, "\t");
    _builder.append("> ");
    String _name_10 = null;
    if (this.entity!=null) {
      _name_10=this.entity.getName();
    }
    String _firstLower_3 = null;
    if (_name_10!=null) {
      _firstLower_3=StringExtensions.toFirstLower(_name_10);
    }
    _builder.append(_firstLower_3, "\t");
    _builder.append("s)");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Attribute> _attributes_1 = null;
      if (this.entity!=null) {
        _attributes_1=this.entity.getAttributes();
      }
      for(final Attribute attribute_1 : _attributes_1) {
        _builder.append("\t");
        _builder.append("@Mapping(source = \'departmentId\', target = \'department\')");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Mapping(target = \'jobs\', ignore = true)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Mapping(source = \'managerId\', target = \'manager\')");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("public def ");
    String _name_11 = null;
    if (this.entity!=null) {
      _name_11=this.entity.getName();
    }
    String _firstUpper_7 = null;
    if (_name_11!=null) {
      _firstUpper_7=StringExtensions.toFirstUpper(_name_11);
    }
    _builder.append(_firstUpper_7, "\t");
    _builder.append(" ");
    String _name_12 = null;
    if (this.entity!=null) {
      _name_12=this.entity.getName();
    }
    String _firstLower_4 = null;
    if (_name_12!=null) {
      _firstLower_4=StringExtensions.toFirstLower(_name_12);
    }
    _builder.append(_firstLower_4, "\t");
    _builder.append("DtoTo");
    String _name_13 = null;
    if (this.entity!=null) {
      _name_13=this.entity.getName();
    }
    String _firstUpper_8 = null;
    if (_name_13!=null) {
      _firstUpper_8=StringExtensions.toFirstUpper(_name_13);
    }
    _builder.append(_firstUpper_8, "\t");
    _builder.append("(");
    String _name_14 = null;
    if (this.entity!=null) {
      _name_14=this.entity.getName();
    }
    String _firstUpper_9 = null;
    if (_name_14!=null) {
      _firstUpper_9=StringExtensions.toFirstUpper(_name_14);
    }
    _builder.append(_firstUpper_9, "\t");
    _builder.append("Dto ");
    String _name_15 = null;
    if (this.entity!=null) {
      _name_15=this.entity.getName();
    }
    String _firstLower_5 = null;
    if (_name_15!=null) {
      _firstLower_5=StringExtensions.toFirstLower(_name_15);
    }
    _builder.append(_firstLower_5, "\t");
    _builder.append("Dto)");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public def List<");
    String _name_16 = null;
    if (this.entity!=null) {
      _name_16=this.entity.getName();
    }
    String _firstUpper_10 = null;
    if (_name_16!=null) {
      _firstUpper_10=StringExtensions.toFirstUpper(_name_16);
    }
    _builder.append(_firstUpper_10, "\t");
    _builder.append("> ");
    String _name_17 = null;
    if (this.entity!=null) {
      _name_17=this.entity.getName();
    }
    String _firstLower_6 = null;
    if (_name_17!=null) {
      _firstLower_6=StringExtensions.toFirstLower(_name_17);
    }
    _builder.append(_firstLower_6, "\t");
    _builder.append("DtosTo");
    String _name_18 = null;
    if (this.entity!=null) {
      _name_18=this.entity.getName();
    }
    String _firstUpper_11 = null;
    if (_name_18!=null) {
      _firstUpper_11=StringExtensions.toFirstUpper(_name_18);
    }
    _builder.append(_firstUpper_11, "\t");
    _builder.append("s(List<");
    String _name_19 = null;
    if (this.entity!=null) {
      _name_19=this.entity.getName();
    }
    String _firstUpper_12 = null;
    if (_name_19!=null) {
      _firstUpper_12=StringExtensions.toFirstUpper(_name_19);
    }
    _builder.append(_firstUpper_12, "\t");
    _builder.append("Dto> ");
    String _name_20 = null;
    if (this.entity!=null) {
      _name_20=this.entity.getName();
    }
    String _firstLower_7 = null;
    if (_name_20!=null) {
      _firstLower_7=StringExtensions.toFirstLower(_name_20);
    }
    _builder.append(_firstLower_7, "\t");
    _builder.append("Dtos)");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//default Department departmentFromId(Long _id) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//\tnew Department => [id = _id]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("default ");
    String _name_21 = null;
    if (this.entity!=null) {
      _name_21=this.entity.getName();
    }
    String _firstUpper_13 = null;
    if (_name_21!=null) {
      _firstUpper_13=StringExtensions.toFirstUpper(_name_21);
    }
    _builder.append(_firstUpper_13, "\t");
    _builder.append(" ");
    String _name_22 = null;
    if (this.entity!=null) {
      _name_22=this.entity.getName();
    }
    String _firstLower_8 = null;
    if (_name_22!=null) {
      _firstLower_8=StringExtensions.toFirstLower(_name_22);
    }
    _builder.append(_firstLower_8, "\t");
    _builder.append("FromId(Long _id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("new ");
    String _name_23 = null;
    if (this.entity!=null) {
      _name_23=this.entity.getName();
    }
    String _firstUpper_14 = null;
    if (_name_23!=null) {
      _firstUpper_14=StringExtensions.toFirstUpper(_name_23);
    }
    _builder.append(_firstUpper_14, "\t\t");
    _builder.append(" => [id = _id]");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
