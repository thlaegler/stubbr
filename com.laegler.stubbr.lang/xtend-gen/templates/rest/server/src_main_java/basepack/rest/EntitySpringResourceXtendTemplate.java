package templates.rest.server.src_main_java.basepack.rest;

import com.google.common.base.Objects;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractXtendTemplate;

/**
 * File template for Spring REST controller for managing entity.
 */
@SuppressWarnings("all")
public class EntitySpringResourceXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public EntitySpringResourceXtendTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
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
    _builder.append("RestResource");
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
    _builder_2.append("/resource/");
    this.setRelativPath(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("Spring REST controller for managing entity ");
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
    _builder.append("import com.google.gson.annotations.Until");
    _builder.newLine();
    _builder.append("import javax.annotation.Generated");
    _builder.newLine();
    _builder.append("import org.slf4j.Logger");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.google.gson.annotations.Until");
    _builder.newLine();
    _builder.append("import com.codahale.metrics.annotation.Timed");
    _builder.newLine();
    _builder.append("import ");
    Stubb _stubb = this.getStubb();
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
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    _builder.append(_firstUpper, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    Stubb _stubb_1 = this.getStubb();
    String _packageName_1 = null;
    if (_stubb_1!=null) {
      _packageName_1=_stubb_1.getPackageName();
    }
    _builder.append(_packageName_1, "");
    _builder.append(".persistence.repository.");
    String _name_1 = null;
    if (this.entity!=null) {
      _name_1=this.entity.getName();
    }
    String _firstUpper_1 = null;
    if (_name_1!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_name_1);
    }
    _builder.append(_firstUpper_1, "");
    _builder.append("Repository");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    Stubb _stubb_2 = this.getStubb();
    String _packageName_2 = null;
    if (_stubb_2!=null) {
      _packageName_2=_stubb_2.getPackageName();
    }
    _builder.append(_packageName_2, "");
    _builder.append(".rest.util.HeaderUtil");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    Stubb _stubb_3 = this.getStubb();
    String _packageName_3 = null;
    if (_stubb_3!=null) {
      _packageName_3=_stubb_3.getPackageName();
    }
    _builder.append(_packageName_3, "");
    _builder.append(".rest.util.PaginationUtil");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    Stubb _stubb_4 = this.getStubb();
    String _packageName_4 = null;
    if (_stubb_4!=null) {
      _packageName_4=_stubb_4.getPackageName();
    }
    _builder.append(_packageName_4, "");
    _builder.append(".persistence.dto.");
    String _name_2 = null;
    if (this.entity!=null) {
      _name_2=this.entity.getName();
    }
    String _firstUpper_2 = null;
    if (_name_2!=null) {
      _firstUpper_2=StringExtensions.toFirstUpper(_name_2);
    }
    _builder.append(_firstUpper_2, "");
    _builder.append("DTO");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    Stubb _stubb_5 = this.getStubb();
    String _packageName_5 = null;
    if (_stubb_5!=null) {
      _packageName_5=_stubb_5.getPackageName();
    }
    _builder.append(_packageName_5, "");
    _builder.append(".persistence.mapper.");
    String _name_3 = null;
    if (this.entity!=null) {
      _name_3=this.entity.getName();
    }
    String _firstUpper_3 = null;
    if (_name_3!=null) {
      _firstUpper_3=StringExtensions.toFirstUpper(_name_3);
    }
    _builder.append(_firstUpper_3, "");
    _builder.append("Mapper");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.slf4j.Logger");
    _builder.newLine();
    {
      boolean _notEquals = (!Objects.equal("spring", "spring"));
      if (_notEquals) {
        _builder.append("import com.codahale.metrics.annotation.Timed");
        _builder.newLine();
        _builder.append("import org.springframework.data.domain.Page");
        _builder.newLine();
        _builder.append("import org.springframework.data.domain.Pageable");
        _builder.newLine();
        _builder.append("import org.springframework.http.HttpHeaders");
        _builder.newLine();
        _builder.append("import org.springframework.http.HttpStatus");
        _builder.newLine();
        _builder.append("import org.springframework.http.MediaType");
        _builder.newLine();
        _builder.append("import org.springframework.http.ResponseEntity");
        _builder.newLine();
        _builder.append("import org.springframework.web.bind.annotation.*");
        _builder.newLine();
      } else {
        _builder.append("import javax.ws.rs.POST");
        _builder.newLine();
        _builder.append("import javax.ws.rs.PUT");
        _builder.newLine();
        _builder.append("import javax.ws.rs.GET");
        _builder.newLine();
        _builder.append("import javax.ws.rs.DELETE");
        _builder.newLine();
        _builder.append("import javax.ws.rs.Path");
        _builder.newLine();
        _builder.append("import javax.ws.rs.Produces");
        _builder.newLine();
        _builder.append("import javax.ws.rs.core.MediaType");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("import javax.inject.Inject");
    _builder.newLine();
    _builder.append("import java.net.URI");
    _builder.newLine();
    _builder.append("import java.net.URISyntaxException");
    _builder.newLine();
    _builder.append("import java.util.LinkedList");
    _builder.newLine();
    _builder.append("import java.util.List");
    _builder.newLine();
    _builder.append("import java.util.Optional");
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
        _builder.append("@RestController");
        _builder.newLine();
        _builder.append("@RequestMapping(\'/api\')");
        _builder.newLine();
      }
    }
    _builder.append("@");
    String _asImport = this.asImport("javax.enterprise.context.RequestScoped");
    _builder.append(_asImport, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport_1 = this.asImport("javax.inject.Named");
    _builder.append(_asImport_1, "");
    _builder.append("(value = \'rest.resource.");
    String _name_4 = null;
    if (this.entity!=null) {
      _name_4=this.entity.getName();
    }
    String _lowerCase = null;
    if (_name_4!=null) {
      _lowerCase=_name_4.toLowerCase();
    }
    _builder.append(_lowerCase, "");
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.append("class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Logger log");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("\t");
    String _name_5 = null;
    if (this.entity!=null) {
      _name_5=this.entity.getName();
    }
    String _firstUpper_4 = null;
    if (_name_5!=null) {
      _firstUpper_4=StringExtensions.toFirstUpper(_name_5);
    }
    _builder.append(_firstUpper_4, "\t");
    _builder.append("Repository ");
    String _name_6 = null;
    if (this.entity!=null) {
      _name_6=this.entity.getName();
    }
    String _firstLower = null;
    if (_name_6!=null) {
      _firstLower=StringExtensions.toFirstLower(_name_6);
    }
    _builder.append(_firstLower, "\t");
    _builder.append("Repository");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("\t");
    String _name_7 = null;
    if (this.entity!=null) {
      _name_7=this.entity.getName();
    }
    String _firstUpper_5 = null;
    if (_name_7!=null) {
      _firstUpper_5=StringExtensions.toFirstUpper(_name_7);
    }
    _builder.append(_firstUpper_5, "\t");
    _builder.append("Mapper ");
    String _name_8 = null;
    if (this.entity!=null) {
      _name_8=this.entity.getName();
    }
    String _firstLower_1 = null;
    if (_name_8!=null) {
      _firstLower_1=StringExtensions.toFirstLower(_name_8);
    }
    _builder.append(_firstLower_1, "\t");
    _builder.append("Mapper");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* POST  /");
    String _name_9 = null;
    if (this.entity!=null) {
      _name_9=this.entity.getName();
    }
    String _firstLower_2 = null;
    if (_name_9!=null) {
      _firstLower_2=StringExtensions.toFirstLower(_name_9);
    }
    _builder.append(_firstLower_2, "\t ");
    _builder.append("s : Create a new ");
    String _name_10 = null;
    if (this.entity!=null) {
      _name_10=this.entity.getName();
    }
    String _firstLower_3 = null;
    if (_name_10!=null) {
      _firstLower_3=StringExtensions.toFirstLower(_name_10);
    }
    _builder.append(_firstLower_3, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param ");
    String _name_11 = null;
    if (this.entity!=null) {
      _name_11=this.entity.getName();
    }
    String _firstLower_4 = null;
    if (_name_11!=null) {
      _firstLower_4=StringExtensions.toFirstLower(_name_11);
    }
    _builder.append(_firstLower_4, "\t ");
    _builder.append("DTO the ");
    String _name_12 = null;
    if (this.entity!=null) {
      _name_12=this.entity.getName();
    }
    String _firstLower_5 = null;
    if (_name_12!=null) {
      _firstLower_5=StringExtensions.toFirstLower(_name_12);
    }
    _builder.append(_firstLower_5, "\t ");
    _builder.append("DTO to create");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* @return the ResponseEntity with status 201 (Created) and with body the new ");
    String _name_13 = null;
    if (this.entity!=null) {
      _name_13=this.entity.getName();
    }
    String _firstLower_6 = null;
    if (_name_13!=null) {
      _firstLower_6=StringExtensions.toFirstLower(_name_13);
    }
    _builder.append(_firstLower_6, "\t ");
    _builder.append("DTO, or with status 400 (Bad Request) if the ");
    String _name_14 = null;
    if (this.entity!=null) {
      _name_14=this.entity.getName();
    }
    String _firstLower_7 = null;
    if (_name_14!=null) {
      _firstLower_7=StringExtensions.toFirstLower(_name_14);
    }
    _builder.append(_firstLower_7, "\t ");
    _builder.append(" has already an ID");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* @throws URISyntaxException if the Location URI syntax is incorrect");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    {
      boolean _notEquals_2 = (!Objects.equal("spring", "spring"));
      if (_notEquals_2) {
        _builder.append("\t");
        _builder.append("@RequestMapping(value = \'/");
        String _name_15 = null;
        if (this.entity!=null) {
          _name_15=this.entity.getName();
        }
        String _firstLower_8 = null;
        if (_name_15!=null) {
          _firstLower_8=StringExtensions.toFirstLower(_name_15);
        }
        _builder.append(_firstLower_8, "\t");
        _builder.append("s\',");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("method = RequestMethod.POST,");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("produces = MediaType.APPLICATION_JSON_VALUE)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Timed");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("@POST");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Path(\'/");
        String _name_16 = null;
        if (this.entity!=null) {
          _name_16=this.entity.getName();
        }
        String _firstLower_9 = null;
        if (_name_16!=null) {
          _firstLower_9=StringExtensions.toFirstLower(_name_16);
        }
        _builder.append(_firstLower_9, "\t");
        _builder.append("s\')");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@Produces(MediaType.APPLICATION_JSON)");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("public def ResponseEntity<");
    String _name_17 = null;
    if (this.entity!=null) {
      _name_17=this.entity.getName();
    }
    String _firstUpper_6 = null;
    if (_name_17!=null) {
      _firstUpper_6=StringExtensions.toFirstUpper(_name_17);
    }
    _builder.append(_firstUpper_6, "\t");
    _builder.append("DTO> create");
    String _name_18 = null;
    if (this.entity!=null) {
      _name_18=this.entity.getName();
    }
    String _firstUpper_7 = null;
    if (_name_18!=null) {
      _firstUpper_7=StringExtensions.toFirstUpper(_name_18);
    }
    _builder.append(_firstUpper_7, "\t");
    _builder.append("(@RequestBody ");
    String _name_19 = null;
    if (this.entity!=null) {
      _name_19=this.entity.getName();
    }
    String _firstUpper_8 = null;
    if (_name_19!=null) {
      _firstUpper_8=StringExtensions.toFirstUpper(_name_19);
    }
    _builder.append(_firstUpper_8, "\t");
    _builder.append("DTO ");
    String _name_20 = null;
    if (this.entity!=null) {
      _name_20=this.entity.getName();
    }
    String _firstLower_10 = null;
    if (_name_20!=null) {
      _firstLower_10=StringExtensions.toFirstLower(_name_20);
    }
    _builder.append(_firstLower_10, "\t");
    _builder.append("DTO) throws URISyntaxException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("log.debug(\'REST request to save ");
    String _name_21 = null;
    if (this.entity!=null) {
      _name_21=this.entity.getName();
    }
    String _firstUpper_9 = null;
    if (_name_21!=null) {
      _firstUpper_9=StringExtensions.toFirstUpper(_name_21);
    }
    _builder.append(_firstUpper_9, "\t\t");
    _builder.append(" : {}\', ");
    String _name_22 = null;
    if (this.entity!=null) {
      _name_22=this.entity.getName();
    }
    String _firstLower_11 = null;
    if (_name_22!=null) {
      _firstLower_11=StringExtensions.toFirstLower(_name_22);
    }
    _builder.append(_firstLower_11, "\t\t");
    _builder.append("DTO)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (");
    String _name_23 = null;
    if (this.entity!=null) {
      _name_23=this.entity.getName();
    }
    String _firstLower_12 = null;
    if (_name_23!=null) {
      _firstLower_12=StringExtensions.toFirstLower(_name_23);
    }
    _builder.append(_firstLower_12, "\t\t");
    _builder.append("DTO.id != null) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return ResponseEntity.badRequest().headers(HeaderUtil.createFailureAlert(\'");
    String _name_24 = null;
    if (this.entity!=null) {
      _name_24=this.entity.getName();
    }
    String _firstLower_13 = null;
    if (_name_24!=null) {
      _firstLower_13=StringExtensions.toFirstLower(_name_24);
    }
    _builder.append(_firstLower_13, "\t\t\t");
    _builder.append("\', \'idexists\', \'A new ");
    String _name_25 = null;
    if (this.entity!=null) {
      _name_25=this.entity.getName();
    }
    String _firstLower_14 = null;
    if (_name_25!=null) {
      _firstLower_14=StringExtensions.toFirstLower(_name_25);
    }
    _builder.append(_firstLower_14, "\t\t\t");
    _builder.append(" cannot already have an ID\')).body(null)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("var ");
    String _name_26 = null;
    if (this.entity!=null) {
      _name_26=this.entity.getName();
    }
    String _firstUpper_10 = null;
    if (_name_26!=null) {
      _firstUpper_10=StringExtensions.toFirstUpper(_name_26);
    }
    _builder.append(_firstUpper_10, "\t\t");
    _builder.append(" ");
    String _name_27 = null;
    if (this.entity!=null) {
      _name_27=this.entity.getName();
    }
    String _firstLower_15 = null;
    if (_name_27!=null) {
      _firstLower_15=StringExtensions.toFirstLower(_name_27);
    }
    _builder.append(_firstLower_15, "\t\t");
    _builder.append(" = ");
    String _name_28 = null;
    if (this.entity!=null) {
      _name_28=this.entity.getName();
    }
    String _firstLower_16 = null;
    if (_name_28!=null) {
      _firstLower_16=StringExtensions.toFirstLower(_name_28);
    }
    _builder.append(_firstLower_16, "\t\t");
    _builder.append("Mapper.");
    String _name_29 = null;
    if (this.entity!=null) {
      _name_29=this.entity.getName();
    }
    String _firstLower_17 = null;
    if (_name_29!=null) {
      _firstLower_17=StringExtensions.toFirstLower(_name_29);
    }
    _builder.append(_firstLower_17, "\t\t");
    _builder.append("DTOTo");
    String _name_30 = null;
    if (this.entity!=null) {
      _name_30=this.entity.getName();
    }
    String _firstUpper_11 = null;
    if (_name_30!=null) {
      _firstUpper_11=StringExtensions.toFirstUpper(_name_30);
    }
    _builder.append(_firstUpper_11, "\t\t");
    _builder.append("(");
    String _name_31 = null;
    if (this.entity!=null) {
      _name_31=this.entity.getName();
    }
    String _firstLower_18 = null;
    if (_name_31!=null) {
      _firstLower_18=StringExtensions.toFirstLower(_name_31);
    }
    _builder.append(_firstLower_18, "\t\t");
    _builder.append("DTO)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_32 = null;
    if (this.entity!=null) {
      _name_32=this.entity.getName();
    }
    String _firstLower_19 = null;
    if (_name_32!=null) {
      _firstLower_19=StringExtensions.toFirstLower(_name_32);
    }
    _builder.append(_firstLower_19, "\t\t");
    _builder.append(" = ");
    String _name_33 = null;
    if (this.entity!=null) {
      _name_33=this.entity.getName();
    }
    String _firstLower_20 = null;
    if (_name_33!=null) {
      _firstLower_20=StringExtensions.toFirstLower(_name_33);
    }
    _builder.append(_firstLower_20, "\t\t");
    _builder.append("Repository.save(");
    String _name_34 = null;
    if (this.entity!=null) {
      _name_34=this.entity.getName();
    }
    String _firstLower_21 = null;
    if (_name_34!=null) {
      _firstLower_21=StringExtensions.toFirstLower(_name_34);
    }
    _builder.append(_firstLower_21, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val ");
    String _name_35 = null;
    if (this.entity!=null) {
      _name_35=this.entity.getName();
    }
    String _firstUpper_12 = null;
    if (_name_35!=null) {
      _firstUpper_12=StringExtensions.toFirstUpper(_name_35);
    }
    _builder.append(_firstUpper_12, "\t\t");
    _builder.append("DTO result = ");
    String _name_36 = null;
    if (this.entity!=null) {
      _name_36=this.entity.getName();
    }
    String _firstLower_22 = null;
    if (_name_36!=null) {
      _firstLower_22=StringExtensions.toFirstLower(_name_36);
    }
    _builder.append(_firstLower_22, "\t\t");
    _builder.append("Mapper.");
    String _name_37 = null;
    if (this.entity!=null) {
      _name_37=this.entity.getName();
    }
    String _firstLower_23 = null;
    if (_name_37!=null) {
      _firstLower_23=StringExtensions.toFirstLower(_name_37);
    }
    _builder.append(_firstLower_23, "\t\t");
    _builder.append("To");
    String _name_38 = null;
    if (this.entity!=null) {
      _name_38=this.entity.getName();
    }
    String _firstUpper_13 = null;
    if (_name_38!=null) {
      _firstUpper_13=StringExtensions.toFirstUpper(_name_38);
    }
    _builder.append(_firstUpper_13, "\t\t");
    _builder.append("DTO(");
    String _name_39 = null;
    if (this.entity!=null) {
      _name_39=this.entity.getName();
    }
    String _firstLower_24 = null;
    if (_name_39!=null) {
      _firstLower_24=StringExtensions.toFirstLower(_name_39);
    }
    _builder.append(_firstLower_24, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return ResponseEntity.created(new URI(\'/api/");
    String _name_40 = null;
    if (this.entity!=null) {
      _name_40=this.entity.getName();
    }
    String _firstLower_25 = null;
    if (_name_40!=null) {
      _firstLower_25=StringExtensions.toFirstLower(_name_40);
    }
    _builder.append(_firstLower_25, "\t\t");
    _builder.append("s/\' + result.id))");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append(".headers(HeaderUtil.createEntityCreationAlert(\'");
    String _name_41 = null;
    if (this.entity!=null) {
      _name_41=this.entity.getName();
    }
    String _firstLower_26 = null;
    if (_name_41!=null) {
      _firstLower_26=StringExtensions.toFirstLower(_name_41);
    }
    _builder.append(_firstLower_26, "\t\t\t");
    _builder.append("\', result.id.toString))");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append(".body(result);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* PUT  /");
    String _name_42 = null;
    if (this.entity!=null) {
      _name_42=this.entity.getName();
    }
    String _firstLower_27 = null;
    if (_name_42!=null) {
      _firstLower_27=StringExtensions.toFirstLower(_name_42);
    }
    _builder.append(_firstLower_27, "\t ");
    _builder.append("s : Updates an existing ");
    String _name_43 = null;
    if (this.entity!=null) {
      _name_43=this.entity.getName();
    }
    String _firstLower_28 = null;
    if (_name_43!=null) {
      _firstLower_28=StringExtensions.toFirstLower(_name_43);
    }
    _builder.append(_firstLower_28, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param ");
    String _name_44 = null;
    if (this.entity!=null) {
      _name_44=this.entity.getName();
    }
    String _firstLower_29 = null;
    if (_name_44!=null) {
      _firstLower_29=StringExtensions.toFirstLower(_name_44);
    }
    _builder.append(_firstLower_29, "\t ");
    _builder.append("DTO the ");
    String _name_45 = null;
    if (this.entity!=null) {
      _name_45=this.entity.getName();
    }
    String _firstLower_30 = null;
    if (_name_45!=null) {
      _firstLower_30=StringExtensions.toFirstLower(_name_45);
    }
    _builder.append(_firstLower_30, "\t ");
    _builder.append("DTO to update");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* @return the ResponseEntity with status 200 (OK) and with body the updated ");
    String _name_46 = null;
    if (this.entity!=null) {
      _name_46=this.entity.getName();
    }
    String _firstLower_31 = null;
    if (_name_46!=null) {
      _firstLower_31=StringExtensions.toFirstLower(_name_46);
    }
    _builder.append(_firstLower_31, "\t ");
    _builder.append("DTO,");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* or with status 400 (Bad Request) if the ");
    String _name_47 = null;
    if (this.entity!=null) {
      _name_47=this.entity.getName();
    }
    String _firstLower_32 = null;
    if (_name_47!=null) {
      _firstLower_32=StringExtensions.toFirstLower(_name_47);
    }
    _builder.append(_firstLower_32, "\t ");
    _builder.append("DTO is not valid,");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* or with status 500 (Internal Server Error) if the ");
    String _name_48 = null;
    if (this.entity!=null) {
      _name_48=this.entity.getName();
    }
    String _firstLower_33 = null;
    if (_name_48!=null) {
      _firstLower_33=StringExtensions.toFirstLower(_name_48);
    }
    _builder.append(_firstLower_33, "\t ");
    _builder.append("DTO couldnt be updated");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* @throws URISyntaxException if the Location URI syntax is incorrect");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    {
      boolean _notEquals_3 = (!Objects.equal("spring", "spring"));
      if (_notEquals_3) {
        _builder.append("\t");
        _builder.append("@RequestMapping(value = \'/");
        String _name_49 = null;
        if (this.entity!=null) {
          _name_49=this.entity.getName();
        }
        String _firstLower_34 = null;
        if (_name_49!=null) {
          _firstLower_34=StringExtensions.toFirstLower(_name_49);
        }
        _builder.append(_firstLower_34, "\t");
        _builder.append("s\',");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("method = RequestMethod.PUT,");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("produces = MediaType.APPLICATION_JSON_VALUE)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Timed");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("@PUT");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Path(\'/");
        String _name_50 = null;
        if (this.entity!=null) {
          _name_50=this.entity.getName();
        }
        String _firstLower_35 = null;
        if (_name_50!=null) {
          _firstLower_35=StringExtensions.toFirstLower(_name_50);
        }
        _builder.append(_firstLower_35, "\t");
        _builder.append("s\')");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@Produces(MediaType.APPLICATION_JSON)");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("public def ResponseEntity<");
    String _name_51 = null;
    if (this.entity!=null) {
      _name_51=this.entity.getName();
    }
    String _firstUpper_14 = null;
    if (_name_51!=null) {
      _firstUpper_14=StringExtensions.toFirstUpper(_name_51);
    }
    _builder.append(_firstUpper_14, "\t");
    _builder.append("DTO> update");
    String _name_52 = null;
    if (this.entity!=null) {
      _name_52=this.entity.getName();
    }
    String _firstUpper_15 = null;
    if (_name_52!=null) {
      _firstUpper_15=StringExtensions.toFirstUpper(_name_52);
    }
    _builder.append(_firstUpper_15, "\t");
    _builder.append("(@RequestBody ");
    String _name_53 = null;
    if (this.entity!=null) {
      _name_53=this.entity.getName();
    }
    String _firstUpper_16 = null;
    if (_name_53!=null) {
      _firstUpper_16=StringExtensions.toFirstUpper(_name_53);
    }
    _builder.append(_firstUpper_16, "\t");
    _builder.append("DTO ");
    String _name_54 = null;
    if (this.entity!=null) {
      _name_54=this.entity.getName();
    }
    String _firstLower_36 = null;
    if (_name_54!=null) {
      _firstLower_36=StringExtensions.toFirstLower(_name_54);
    }
    _builder.append(_firstLower_36, "\t");
    _builder.append("DTO) throws URISyntaxException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("log.debug(\'REST request to update ");
    String _name_55 = null;
    if (this.entity!=null) {
      _name_55=this.entity.getName();
    }
    String _firstUpper_17 = null;
    if (_name_55!=null) {
      _firstUpper_17=StringExtensions.toFirstUpper(_name_55);
    }
    _builder.append(_firstUpper_17, "\t\t");
    _builder.append(" : {}\', ");
    String _name_56 = null;
    if (this.entity!=null) {
      _name_56=this.entity.getName();
    }
    String _firstLower_37 = null;
    if (_name_56!=null) {
      _firstLower_37=StringExtensions.toFirstLower(_name_56);
    }
    _builder.append(_firstLower_37, "\t\t");
    _builder.append("DTO)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (");
    String _name_57 = null;
    if (this.entity!=null) {
      _name_57=this.entity.getName();
    }
    String _firstLower_38 = null;
    if (_name_57!=null) {
      _firstLower_38=StringExtensions.toFirstLower(_name_57);
    }
    _builder.append(_firstLower_38, "\t\t");
    _builder.append("DTO.getId() == null) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return create");
    String _name_58 = null;
    if (this.entity!=null) {
      _name_58=this.entity.getName();
    }
    String _firstUpper_18 = null;
    if (_name_58!=null) {
      _firstUpper_18=StringExtensions.toFirstUpper(_name_58);
    }
    _builder.append(_firstUpper_18, "\t\t\t");
    _builder.append("(");
    String _name_59 = null;
    if (this.entity!=null) {
      _name_59=this.entity.getName();
    }
    String _firstLower_39 = null;
    if (_name_59!=null) {
      _firstLower_39=StringExtensions.toFirstLower(_name_59);
    }
    _builder.append(_firstLower_39, "\t\t\t");
    _builder.append("DTO);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("var ");
    String _name_60 = null;
    if (this.entity!=null) {
      _name_60=this.entity.getName();
    }
    String _firstUpper_19 = null;
    if (_name_60!=null) {
      _firstUpper_19=StringExtensions.toFirstUpper(_name_60);
    }
    _builder.append(_firstUpper_19, "\t\t");
    _builder.append(" ");
    String _name_61 = null;
    if (this.entity!=null) {
      _name_61=this.entity.getName();
    }
    String _firstLower_40 = null;
    if (_name_61!=null) {
      _firstLower_40=StringExtensions.toFirstLower(_name_61);
    }
    _builder.append(_firstLower_40, "\t\t");
    _builder.append(" = ");
    String _name_62 = null;
    if (this.entity!=null) {
      _name_62=this.entity.getName();
    }
    String _firstLower_41 = null;
    if (_name_62!=null) {
      _firstLower_41=StringExtensions.toFirstLower(_name_62);
    }
    _builder.append(_firstLower_41, "\t\t");
    _builder.append("Mapper.");
    String _name_63 = null;
    if (this.entity!=null) {
      _name_63=this.entity.getName();
    }
    String _firstLower_42 = null;
    if (_name_63!=null) {
      _firstLower_42=StringExtensions.toFirstLower(_name_63);
    }
    _builder.append(_firstLower_42, "\t\t");
    _builder.append("DTOTo");
    String _name_64 = null;
    if (this.entity!=null) {
      _name_64=this.entity.getName();
    }
    String _firstUpper_20 = null;
    if (_name_64!=null) {
      _firstUpper_20=StringExtensions.toFirstUpper(_name_64);
    }
    _builder.append(_firstUpper_20, "\t\t");
    _builder.append("(");
    String _name_65 = null;
    if (this.entity!=null) {
      _name_65=this.entity.getName();
    }
    String _firstLower_43 = null;
    if (_name_65!=null) {
      _firstLower_43=StringExtensions.toFirstLower(_name_65);
    }
    _builder.append(_firstLower_43, "\t\t");
    _builder.append("DTO);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_66 = null;
    if (this.entity!=null) {
      _name_66=this.entity.getName();
    }
    String _firstLower_44 = null;
    if (_name_66!=null) {
      _firstLower_44=StringExtensions.toFirstLower(_name_66);
    }
    _builder.append(_firstLower_44, "\t\t");
    _builder.append(" = ");
    String _name_67 = null;
    if (this.entity!=null) {
      _name_67=this.entity.getName();
    }
    String _firstLower_45 = null;
    if (_name_67!=null) {
      _firstLower_45=StringExtensions.toFirstLower(_name_67);
    }
    _builder.append(_firstLower_45, "\t\t");
    _builder.append("Repository.save(");
    String _name_68 = null;
    if (this.entity!=null) {
      _name_68=this.entity.getName();
    }
    String _firstLower_46 = null;
    if (_name_68!=null) {
      _firstLower_46=StringExtensions.toFirstLower(_name_68);
    }
    _builder.append(_firstLower_46, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val ");
    String _name_69 = null;
    if (this.entity!=null) {
      _name_69=this.entity.getName();
    }
    String _firstUpper_21 = null;
    if (_name_69!=null) {
      _firstUpper_21=StringExtensions.toFirstUpper(_name_69);
    }
    _builder.append(_firstUpper_21, "\t\t");
    _builder.append("DTO result = ");
    String _name_70 = null;
    if (this.entity!=null) {
      _name_70=this.entity.getName();
    }
    String _firstLower_47 = null;
    if (_name_70!=null) {
      _firstLower_47=StringExtensions.toFirstLower(_name_70);
    }
    _builder.append(_firstLower_47, "\t\t");
    _builder.append("Mapper.");
    String _name_71 = null;
    if (this.entity!=null) {
      _name_71=this.entity.getName();
    }
    String _firstLower_48 = null;
    if (_name_71!=null) {
      _firstLower_48=StringExtensions.toFirstLower(_name_71);
    }
    _builder.append(_firstLower_48, "\t\t");
    _builder.append("To");
    String _name_72 = null;
    if (this.entity!=null) {
      _name_72=this.entity.getName();
    }
    String _firstUpper_22 = null;
    if (_name_72!=null) {
      _firstUpper_22=StringExtensions.toFirstUpper(_name_72);
    }
    _builder.append(_firstUpper_22, "\t\t");
    _builder.append("DTO(");
    String _name_73 = null;
    if (this.entity!=null) {
      _name_73=this.entity.getName();
    }
    String _firstLower_49 = null;
    if (_name_73!=null) {
      _firstLower_49=StringExtensions.toFirstLower(_name_73);
    }
    _builder.append(_firstLower_49, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return ResponseEntity.ok");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".headers(HeaderUtil.createEntityUpdateAlert(\'");
    String _name_74 = null;
    if (this.entity!=null) {
      _name_74=this.entity.getName();
    }
    String _firstLower_50 = null;
    if (_name_74!=null) {
      _firstLower_50=StringExtensions.toFirstLower(_name_74);
    }
    _builder.append(_firstLower_50, "\t\t\t");
    _builder.append("\', ");
    String _name_75 = null;
    if (this.entity!=null) {
      _name_75=this.entity.getName();
    }
    String _firstLower_51 = null;
    if (_name_75!=null) {
      _firstLower_51=StringExtensions.toFirstLower(_name_75);
    }
    _builder.append(_firstLower_51, "\t\t\t");
    _builder.append("DTO.id.toString))");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append(".body(result)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* GET  /");
    String _name_76 = null;
    if (this.entity!=null) {
      _name_76=this.entity.getName();
    }
    String _firstLower_52 = null;
    if (_name_76!=null) {
      _firstLower_52=StringExtensions.toFirstLower(_name_76);
    }
    _builder.append(_firstLower_52, "\t ");
    _builder.append("s : get all the ");
    String _name_77 = null;
    if (this.entity!=null) {
      _name_77=this.entity.getName();
    }
    String _firstLower_53 = null;
    if (_name_77!=null) {
      _firstLower_53=StringExtensions.toFirstLower(_name_77);
    }
    _builder.append(_firstLower_53, "\t ");
    _builder.append("s.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param pageable the pagination information");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @return the ResponseEntity with status 200 (OK) and the list of ");
    String _name_78 = null;
    if (this.entity!=null) {
      _name_78=this.entity.getName();
    }
    String _firstLower_54 = null;
    if (_name_78!=null) {
      _firstLower_54=StringExtensions.toFirstLower(_name_78);
    }
    _builder.append(_firstLower_54, "\t ");
    _builder.append("s in body");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* @throws URISyntaxException if there is an error to generate the pagination HTTP headers");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    {
      boolean _notEquals_4 = (!Objects.equal("spring", "spring"));
      if (_notEquals_4) {
        _builder.append("\t");
        _builder.append("@RequestMapping(value = \'/");
        String _name_79 = null;
        if (this.entity!=null) {
          _name_79=this.entity.getName();
        }
        String _firstLower_55 = null;
        if (_name_79!=null) {
          _firstLower_55=StringExtensions.toFirstLower(_name_79);
        }
        _builder.append(_firstLower_55, "\t");
        _builder.append("s\',");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("method = RequestMethod.GET,");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("produces = MediaType.APPLICATION_JSON_VALUE)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Timed");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("@GET");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Path(\'/");
        String _name_80 = null;
        if (this.entity!=null) {
          _name_80=this.entity.getName();
        }
        String _firstLower_56 = null;
        if (_name_80!=null) {
          _firstLower_56=StringExtensions.toFirstLower(_name_80);
        }
        _builder.append(_firstLower_56, "\t");
        _builder.append("s\')");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@Produces(MediaType.APPLICATION_JSON)");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("public def ResponseEntity<List<");
    String _name_81 = null;
    if (this.entity!=null) {
      _name_81=this.entity.getName();
    }
    String _firstUpper_23 = null;
    if (_name_81!=null) {
      _firstUpper_23=StringExtensions.toFirstUpper(_name_81);
    }
    _builder.append(_firstUpper_23, "\t");
    _builder.append("DTO>> getAll");
    String _name_82 = null;
    if (this.entity!=null) {
      _name_82=this.entity.getName();
    }
    String _firstUpper_24 = null;
    if (_name_82!=null) {
      _firstUpper_24=StringExtensions.toFirstUpper(_name_82);
    }
    _builder.append(_firstUpper_24, "\t");
    _builder.append("s(Pageable pageable) throws URISyntaxException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("log.debug(\'REST request to get a page of ");
    String _name_83 = null;
    if (this.entity!=null) {
      _name_83=this.entity.getName();
    }
    String _firstUpper_25 = null;
    if (_name_83!=null) {
      _firstUpper_25=StringExtensions.toFirstUpper(_name_83);
    }
    _builder.append(_firstUpper_25, "\t\t");
    _builder.append("s\')");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val Page<");
    String _name_84 = null;
    if (this.entity!=null) {
      _name_84=this.entity.getName();
    }
    String _firstUpper_26 = null;
    if (_name_84!=null) {
      _firstUpper_26=StringExtensions.toFirstUpper(_name_84);
    }
    _builder.append(_firstUpper_26, "\t\t");
    _builder.append("> page = ");
    String _name_85 = null;
    if (this.entity!=null) {
      _name_85=this.entity.getName();
    }
    String _firstLower_57 = null;
    if (_name_85!=null) {
      _firstLower_57=StringExtensions.toFirstLower(_name_85);
    }
    _builder.append(_firstLower_57, "\t\t");
    _builder.append("Repository.findAll(pageable)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, \'/api/");
    String _name_86 = null;
    if (this.entity!=null) {
      _name_86=this.entity.getName();
    }
    String _firstLower_58 = null;
    if (_name_86!=null) {
      _firstLower_58=StringExtensions.toFirstLower(_name_86);
    }
    _builder.append(_firstLower_58, "\t\t");
    _builder.append("s\')");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("new ResponseEntity<>(");
    String _name_87 = null;
    if (this.entity!=null) {
      _name_87=this.entity.getName();
    }
    String _firstLower_59 = null;
    if (_name_87!=null) {
      _firstLower_59=StringExtensions.toFirstLower(_name_87);
    }
    _builder.append(_firstLower_59, "\t\t");
    _builder.append("Mapper.");
    String _name_88 = null;
    if (this.entity!=null) {
      _name_88=this.entity.getName();
    }
    String _firstLower_60 = null;
    if (_name_88!=null) {
      _firstLower_60=StringExtensions.toFirstLower(_name_88);
    }
    _builder.append(_firstLower_60, "\t\t");
    _builder.append("sTo");
    String _name_89 = null;
    if (this.entity!=null) {
      _name_89=this.entity.getName();
    }
    String _firstUpper_27 = null;
    if (_name_89!=null) {
      _firstUpper_27=StringExtensions.toFirstUpper(_name_89);
    }
    _builder.append(_firstUpper_27, "\t\t");
    _builder.append("DTOs(page.content), headers, HttpStatus.OK)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* GET  /");
    String _name_90 = null;
    if (this.entity!=null) {
      _name_90=this.entity.getName();
    }
    String _firstLower_61 = null;
    if (_name_90!=null) {
      _firstLower_61=StringExtensions.toFirstLower(_name_90);
    }
    _builder.append(_firstLower_61, "\t ");
    _builder.append("s/:id : get the \'id\' ");
    String _name_91 = null;
    if (this.entity!=null) {
      _name_91=this.entity.getName();
    }
    String _firstLower_62 = null;
    if (_name_91!=null) {
      _firstLower_62=StringExtensions.toFirstLower(_name_91);
    }
    _builder.append(_firstLower_62, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param id the id of the ");
    String _name_92 = null;
    if (this.entity!=null) {
      _name_92=this.entity.getName();
    }
    String _firstLower_63 = null;
    if (_name_92!=null) {
      _firstLower_63=StringExtensions.toFirstLower(_name_92);
    }
    _builder.append(_firstLower_63, "\t ");
    _builder.append("DTO to retrieve");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* @return the ResponseEntity with status 200 (OK) and with body the ");
    String _name_93 = null;
    if (this.entity!=null) {
      _name_93=this.entity.getName();
    }
    String _firstLower_64 = null;
    if (_name_93!=null) {
      _firstLower_64=StringExtensions.toFirstLower(_name_93);
    }
    _builder.append(_firstLower_64, "\t ");
    _builder.append("DTO, or with status 404 (Not Found)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    {
      boolean _notEquals_5 = (!Objects.equal("spring", "spring"));
      if (_notEquals_5) {
        _builder.append("\t");
        _builder.append("@RequestMapping(value = \'/");
        String _name_94 = null;
        if (this.entity!=null) {
          _name_94=this.entity.getName();
        }
        String _firstLower_65 = null;
        if (_name_94!=null) {
          _firstLower_65=StringExtensions.toFirstLower(_name_94);
        }
        _builder.append(_firstLower_65, "\t");
        _builder.append("s/{id}\',");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("method = RequestMethod.GET,");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("produces = MediaType.APPLICATION_JSON_VALUE)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Timed");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("@GET");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Path(\'/");
        String _name_95 = null;
        if (this.entity!=null) {
          _name_95=this.entity.getName();
        }
        String _firstLower_66 = null;
        if (_name_95!=null) {
          _firstLower_66=StringExtensions.toFirstLower(_name_95);
        }
        _builder.append(_firstLower_66, "\t");
        _builder.append("s/{id}\')");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@Produces(MediaType.APPLICATION_JSON)");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("public def ResponseEntity<");
    String _name_96 = null;
    if (this.entity!=null) {
      _name_96=this.entity.getName();
    }
    String _firstUpper_28 = null;
    if (_name_96!=null) {
      _firstUpper_28=StringExtensions.toFirstUpper(_name_96);
    }
    _builder.append(_firstUpper_28, "\t");
    _builder.append("DTO> get");
    String _name_97 = null;
    if (this.entity!=null) {
      _name_97=this.entity.getName();
    }
    String _firstUpper_29 = null;
    if (_name_97!=null) {
      _firstUpper_29=StringExtensions.toFirstUpper(_name_97);
    }
    _builder.append(_firstUpper_29, "\t");
    _builder.append("(@PathVariable Long id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("log.debug(\'REST request to get ");
    String _name_98 = null;
    if (this.entity!=null) {
      _name_98=this.entity.getName();
    }
    String _firstUpper_30 = null;
    if (_name_98!=null) {
      _firstUpper_30=StringExtensions.toFirstUpper(_name_98);
    }
    _builder.append(_firstUpper_30, "\t\t");
    _builder.append(" : {}\', id);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val ");
    String _name_99 = null;
    if (this.entity!=null) {
      _name_99=this.entity.getName();
    }
    String _firstUpper_31 = null;
    if (_name_99!=null) {
      _firstUpper_31=StringExtensions.toFirstUpper(_name_99);
    }
    _builder.append(_firstUpper_31, "\t\t");
    _builder.append(" ");
    String _name_100 = null;
    if (this.entity!=null) {
      _name_100=this.entity.getName();
    }
    String _firstLower_67 = null;
    if (_name_100!=null) {
      _firstLower_67=StringExtensions.toFirstLower(_name_100);
    }
    _builder.append(_firstLower_67, "\t\t");
    _builder.append(" = ");
    String _name_101 = null;
    if (this.entity!=null) {
      _name_101=this.entity.getName();
    }
    String _firstLower_68 = null;
    if (_name_101!=null) {
      _firstLower_68=StringExtensions.toFirstLower(_name_101);
    }
    _builder.append(_firstLower_68, "\t\t");
    _builder.append("Repository.findOne(id);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val ");
    String _name_102 = null;
    if (this.entity!=null) {
      _name_102=this.entity.getName();
    }
    String _firstUpper_32 = null;
    if (_name_102!=null) {
      _firstUpper_32=StringExtensions.toFirstUpper(_name_102);
    }
    _builder.append(_firstUpper_32, "\t\t");
    _builder.append("DTO ");
    String _name_103 = null;
    if (this.entity!=null) {
      _name_103=this.entity.getName();
    }
    String _firstLower_69 = null;
    if (_name_103!=null) {
      _firstLower_69=StringExtensions.toFirstLower(_name_103);
    }
    _builder.append(_firstLower_69, "\t\t");
    _builder.append("DTO = ");
    String _name_104 = null;
    if (this.entity!=null) {
      _name_104=this.entity.getName();
    }
    String _firstLower_70 = null;
    if (_name_104!=null) {
      _firstLower_70=StringExtensions.toFirstLower(_name_104);
    }
    _builder.append(_firstLower_70, "\t\t");
    _builder.append("Mapper.");
    String _name_105 = null;
    if (this.entity!=null) {
      _name_105=this.entity.getName();
    }
    String _firstLower_71 = null;
    if (_name_105!=null) {
      _firstLower_71=StringExtensions.toFirstLower(_name_105);
    }
    _builder.append(_firstLower_71, "\t\t");
    _builder.append("To");
    String _name_106 = null;
    if (this.entity!=null) {
      _name_106=this.entity.getName();
    }
    String _firstUpper_33 = null;
    if (_name_106!=null) {
      _firstUpper_33=StringExtensions.toFirstUpper(_name_106);
    }
    _builder.append(_firstUpper_33, "\t\t");
    _builder.append("DTO(");
    String _name_107 = null;
    if (this.entity!=null) {
      _name_107=this.entity.getName();
    }
    String _firstLower_72 = null;
    if (_name_107!=null) {
      _firstLower_72=StringExtensions.toFirstLower(_name_107);
    }
    _builder.append(_firstLower_72, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Optional.ofNullable(");
    String _name_108 = null;
    if (this.entity!=null) {
      _name_108=this.entity.getName();
    }
    String _firstLower_73 = null;
    if (_name_108!=null) {
      _firstLower_73=StringExtensions.toFirstLower(_name_108);
    }
    _builder.append(_firstLower_73, "\t\t");
    _builder.append("DTO)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append(".map(result -> new ResponseEntity<>(");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("result,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("HttpStatus.OK))");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND))");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* DELETE  /");
    String _name_109 = null;
    if (this.entity!=null) {
      _name_109=this.entity.getName();
    }
    String _firstLower_74 = null;
    if (_name_109!=null) {
      _firstLower_74=StringExtensions.toFirstLower(_name_109);
    }
    _builder.append(_firstLower_74, "\t ");
    _builder.append("s/:id : delete the \'id\' ");
    String _name_110 = null;
    if (this.entity!=null) {
      _name_110=this.entity.getName();
    }
    String _firstLower_75 = null;
    if (_name_110!=null) {
      _firstLower_75=StringExtensions.toFirstLower(_name_110);
    }
    _builder.append(_firstLower_75, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param id the id of the ");
    String _name_111 = null;
    if (this.entity!=null) {
      _name_111=this.entity.getName();
    }
    String _firstLower_76 = null;
    if (_name_111!=null) {
      _firstLower_76=StringExtensions.toFirstLower(_name_111);
    }
    _builder.append(_firstLower_76, "\t ");
    _builder.append("DTO to delete");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* @return the ResponseEntity with status 200 (OK)");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    {
      boolean _notEquals_6 = (!Objects.equal("spring", "spring"));
      if (_notEquals_6) {
        _builder.append("\t");
        _builder.append("@RequestMapping(value = \'/");
        String _name_112 = null;
        if (this.entity!=null) {
          _name_112=this.entity.getName();
        }
        String _firstLower_77 = null;
        if (_name_112!=null) {
          _firstLower_77=StringExtensions.toFirstLower(_name_112);
        }
        _builder.append(_firstLower_77, "\t");
        _builder.append("s/{id}\',");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("method = RequestMethod.DELETE,");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("produces = MediaType.APPLICATION_JSON_VALUE)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Timed");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("@DELETE");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Path(\'/");
        String _name_113 = null;
        if (this.entity!=null) {
          _name_113=this.entity.getName();
        }
        String _firstLower_78 = null;
        if (_name_113!=null) {
          _firstLower_78=StringExtensions.toFirstLower(_name_113);
        }
        _builder.append(_firstLower_78, "\t");
        _builder.append("s\')");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@Produces(MediaType.APPLICATION_JSON)");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("public def ResponseEntity<Void> delete");
    String _name_114 = null;
    if (this.entity!=null) {
      _name_114=this.entity.getName();
    }
    String _firstUpper_34 = null;
    if (_name_114!=null) {
      _firstUpper_34=StringExtensions.toFirstUpper(_name_114);
    }
    _builder.append(_firstUpper_34, "\t");
    _builder.append("(@PathVariable Long id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("log.debug(\'REST request to delete ");
    String _name_115 = null;
    if (this.entity!=null) {
      _name_115=this.entity.getName();
    }
    String _firstUpper_35 = null;
    if (_name_115!=null) {
      _firstUpper_35=StringExtensions.toFirstUpper(_name_115);
    }
    _builder.append(_firstUpper_35, "\t\t");
    _builder.append(" : {}\', id)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_116 = null;
    if (this.entity!=null) {
      _name_116=this.entity.getName();
    }
    String _firstLower_79 = null;
    if (_name_116!=null) {
      _firstLower_79=StringExtensions.toFirstLower(_name_116);
    }
    _builder.append(_firstLower_79, "\t\t");
    _builder.append("Repository.delete(id)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return ResponseEntity.ok.headers(HeaderUtil.createEntityDeletionAlert(\'");
    String _name_117 = null;
    if (this.entity!=null) {
      _name_117=this.entity.getName();
    }
    String _firstLower_80 = null;
    if (_name_117!=null) {
      _firstLower_80=StringExtensions.toFirstLower(_name_117);
    }
    _builder.append(_firstLower_80, "\t\t");
    _builder.append("\', id.toString)).build");
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
