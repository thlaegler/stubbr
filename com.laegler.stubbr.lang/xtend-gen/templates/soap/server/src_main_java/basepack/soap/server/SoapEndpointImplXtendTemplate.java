package templates.soap.server.src_main_java.basepack.soap.server;

import com.google.common.base.Objects;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Attribute;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractXtendTemplate;

/**
 * File template for SOAP endpoint implementation.
 */
@SuppressWarnings("all")
public class SoapEndpointImplXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public SoapEndpointImplXtendTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
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
    _builder.append("SoapImpl");
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
    _builder_1.append("/impl/");
    this.setRelativPath(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("SOAP endpoint implementation for entity ");
    String _name_1 = null;
    if (entity!=null) {
      _name_1=entity.getName();
    }
    String _firstUpper_1 = null;
    if (_name_1!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_name_1);
    }
    _builder_2.append(_firstUpper_1, "");
    this.setDocumentation(_builder_2.toString());
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    Project _project = this.getProject();
    String _basePackage = null;
    if (_project!=null) {
      _basePackage=_project.getBasePackage();
    }
    _builder.append(_basePackage, "");
    _builder.append(".impl");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    Project _project_1 = this.getProject();
    String _basePackage_1 = null;
    if (_project_1!=null) {
      _basePackage_1=_project_1.getBasePackage();
    }
    _builder.append(_basePackage_1, "");
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
    _builder.append(".persistence.service.");
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    _builder.append(_firstUpper, "");
    _builder.append("Service");
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
    _builder.append(".model.entity.");
    String _name_1 = null;
    if (this.entity!=null) {
      _name_1=this.entity.getName();
    }
    String _firstUpper_1 = null;
    if (_name_1!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_name_1);
    }
    _builder.append(_firstUpper_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    StubbrRegistry _stubbr_2 = this.getStubbr();
    Stubb _stubb_2 = null;
    if (_stubbr_2!=null) {
      _stubb_2=_stubbr_2.getStubb();
    }
    String _packageName_2 = null;
    if (_stubb_2!=null) {
      _packageName_2=_stubb_2.getPackageName();
    }
    _builder.append(_packageName_2, "");
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
    _builder.append("Dto");
    _builder.newLineIfNotEmpty();
    _builder.append("import javax.inject.Inject");
    _builder.newLine();
    _builder.append("import javax.jws.WebMethod");
    _builder.newLine();
    _builder.append("import javax.jws.WebService");
    _builder.newLine();
    _builder.append("import javax.jws.soap.SOAPBinding");
    _builder.newLine();
    _builder.append("import javax.jws.soap.SOAPBinding.Style");
    _builder.newLine();
    _builder.append("import javax.ws.rs.core.SecurityContext");
    _builder.newLine();
    _builder.append("import javax.jws.soap.SOAPBinding.Use");
    _builder.newLine();
    _builder.append("import com.google.gson.annotations.Since");
    _builder.newLine();
    _builder.append("import com.google.gson.annotations.Until");
    _builder.newLine();
    _builder.append("import javax.annotation.Generated");
    _builder.newLine();
    _builder.newLine();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@WebService(endpointInterface = \'");
    Project _project_2 = this.getProject();
    String _basePackage_2 = null;
    if (_project_2!=null) {
      _basePackage_2=_project_2.getBasePackage();
    }
    _builder.append(_basePackage_2, "");
    _builder.append(".");
    String _name_3 = null;
    if (this.entity!=null) {
      _name_3=this.entity.getName();
    }
    String _firstUpper_3 = null;
    if (_name_3!=null) {
      _firstUpper_3=StringExtensions.toFirstUpper(_name_3);
    }
    _builder.append(_firstUpper_3, "");
    _builder.append("Soap\', targetNamespace = \'");
    Project _project_3 = this.getProject();
    String _basePackage_3 = null;
    if (_project_3!=null) {
      _basePackage_3=_project_3.getBasePackage();
    }
    String _namespace = null;
    if (_basePackage_3!=null) {
      _namespace=this.toNamespace(_basePackage_3);
    }
    _builder.append(_namespace, "");
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.append("@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)");
    _builder.newLine();
    _builder.append("public class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" implements ");
    String _name_4 = null;
    if (this.entity!=null) {
      _name_4=this.entity.getName();
    }
    String _firstUpper_4 = null;
    if (_name_4!=null) {
      _firstUpper_4=StringExtensions.toFirstUpper(_name_4);
    }
    _builder.append(_firstUpper_4, "");
    _builder.append("Soap {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    String _name_5 = null;
    if (this.entity!=null) {
      _name_5=this.entity.getName();
    }
    String _firstUpper_5 = null;
    if (_name_5!=null) {
      _firstUpper_5=StringExtensions.toFirstUpper(_name_5);
    }
    _builder.append(_firstUpper_5, "\t");
    _builder.append("Service ");
    String _name_6 = null;
    if (this.entity!=null) {
      _name_6=this.entity.getName();
    }
    String _firstLower = null;
    if (_name_6!=null) {
      _firstLower=StringExtensions.toFirstLower(_name_6);
    }
    _builder.append(_firstLower, "\t");
    _builder.append("Service");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Get ");
    String _name_7 = null;
    if (this.entity!=null) {
      _name_7=this.entity.getName();
    }
    String _firstUpper_6 = null;
    if (_name_7!=null) {
      _firstUpper_6=StringExtensions.toFirstUpper(_name_7);
    }
    _builder.append(_firstUpper_6, "\t ");
    _builder.append(" with given ID.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override def ");
    String _name_8 = null;
    if (this.entity!=null) {
      _name_8=this.entity.getName();
    }
    String _firstLower_1 = null;
    if (_name_8!=null) {
      _firstLower_1=StringExtensions.toFirstLower(_name_8);
    }
    _builder.append(_firstLower_1, "\t");
    _builder.append("Get(");
    {
      EList<Attribute> _attributes = null;
      if (this.entity!=null) {
        _attributes=this.entity.getAttributes();
      }
      for(final Attribute attribute : _attributes) {
        {
          JvmTypeReference _javaType = null;
          if (attribute!=null) {
            _javaType=attribute.getJavaType();
          }
          boolean _notEquals = (!Objects.equal(_javaType, null));
          if (_notEquals) {
            JvmTypeReference _javaType_1 = null;
            if (attribute!=null) {
              _javaType_1=attribute.getJavaType();
            }
            String _qualifiedName = null;
            if (_javaType_1!=null) {
              _qualifiedName=_javaType_1.getQualifiedName();
            }
            _builder.append(_qualifiedName, "\t");
          } else {
            Entity _type = null;
            if (attribute!=null) {
              _type=attribute.getType();
            }
            String _name_9 = null;
            if (_type!=null) {
              _name_9=_type.getName();
            }
            _builder.append(_name_9, "\t");
          }
        }
        _builder.append(" ");
        String _name_10 = null;
        if (attribute!=null) {
          _name_10=attribute.getName();
        }
        String _firstLower_2 = null;
        if (_name_10!=null) {
          _firstLower_2=StringExtensions.toFirstLower(_name_10);
        }
        _builder.append(_firstLower_2, "\t");
        _builder.append(", ");
      }
    }
    _builder.append("SecurityContext securityContext) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val ");
    String _name_11 = null;
    if (this.entity!=null) {
      _name_11=this.entity.getName();
    }
    String _firstUpper_7 = StringExtensions.toFirstUpper(_name_11);
    _builder.append(_firstUpper_7, "\t\t");
    _builder.append(" ");
    String _name_12 = null;
    if (this.entity!=null) {
      _name_12=this.entity.getName();
    }
    String _firstLower_3 = StringExtensions.toFirstLower(_name_12);
    _builder.append(_firstLower_3, "\t\t");
    _builder.append("Dto = ");
    String _name_13 = null;
    if (this.entity!=null) {
      _name_13=this.entity.getName();
    }
    String _firstLower_4 = null;
    if (_name_13!=null) {
      _firstLower_4=StringExtensions.toFirstLower(_name_13);
    }
    _builder.append(_firstLower_4, "\t\t");
    _builder.append("Service.findOne(");
    EList<Attribute> _attributes_1 = null;
    if (this.entity!=null) {
      _attributes_1=this.entity.getAttributes();
    }
    Attribute _get = null;
    if (_attributes_1!=null) {
      _get=_attributes_1.get(0);
    }
    String _name_14 = null;
    if (_get!=null) {
      _name_14=_get.getName();
    }
    String _firstLower_5 = null;
    if (_name_14!=null) {
      _firstLower_5=StringExtensions.toFirstLower(_name_14);
    }
    _builder.append(_firstLower_5, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return ");
    String _name_15 = null;
    if (this.entity!=null) {
      _name_15=this.entity.getName();
    }
    String _firstLower_6 = StringExtensions.toFirstLower(_name_15);
    _builder.append(_firstLower_6, "\t\t");
    _builder.append("Dto");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Create new ");
    String _name_16 = null;
    if (this.entity!=null) {
      _name_16=this.entity.getName();
    }
    String _firstUpper_8 = null;
    if (_name_16!=null) {
      _firstUpper_8=StringExtensions.toFirstUpper(_name_16);
    }
    _builder.append(_firstUpper_8, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override def ");
    String _name_17 = null;
    if (this.entity!=null) {
      _name_17=this.entity.getName();
    }
    String _firstLower_7 = null;
    if (_name_17!=null) {
      _firstLower_7=StringExtensions.toFirstLower(_name_17);
    }
    _builder.append(_firstLower_7, "\t");
    _builder.append("Post(");
    {
      EList<Attribute> _attributes_2 = null;
      if (this.entity!=null) {
        _attributes_2=this.entity.getAttributes();
      }
      for(final Attribute attribute_1 : _attributes_2) {
        {
          JvmTypeReference _javaType_2 = null;
          if (attribute_1!=null) {
            _javaType_2=attribute_1.getJavaType();
          }
          boolean _notEquals_1 = (!Objects.equal(_javaType_2, null));
          if (_notEquals_1) {
            JvmTypeReference _javaType_3 = null;
            if (attribute_1!=null) {
              _javaType_3=attribute_1.getJavaType();
            }
            String _qualifiedName_1 = null;
            if (_javaType_3!=null) {
              _qualifiedName_1=_javaType_3.getQualifiedName();
            }
            _builder.append(_qualifiedName_1, "\t");
          } else {
            Entity _type_1 = null;
            if (attribute_1!=null) {
              _type_1=attribute_1.getType();
            }
            String _name_18 = null;
            if (_type_1!=null) {
              _name_18=_type_1.getName();
            }
            _builder.append(_name_18, "\t");
          }
        }
        _builder.append(" ");
        String _name_19 = null;
        if (attribute_1!=null) {
          _name_19=attribute_1.getName();
        }
        String _firstLower_8 = null;
        if (_name_19!=null) {
          _firstLower_8=StringExtensions.toFirstLower(_name_19);
        }
        _builder.append(_firstLower_8, "\t");
        _builder.append(", ");
      }
    }
    _builder.append("SecurityContext securityContext) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Update given ");
    String _name_20 = null;
    if (this.entity!=null) {
      _name_20=this.entity.getName();
    }
    String _firstUpper_9 = null;
    if (_name_20!=null) {
      _firstUpper_9=StringExtensions.toFirstUpper(_name_20);
    }
    _builder.append(_firstUpper_9, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override def ");
    String _name_21 = null;
    if (this.entity!=null) {
      _name_21=this.entity.getName();
    }
    String _firstLower_9 = null;
    if (_name_21!=null) {
      _firstLower_9=StringExtensions.toFirstLower(_name_21);
    }
    _builder.append(_firstLower_9, "\t");
    _builder.append("Put(");
    {
      EList<Attribute> _attributes_3 = null;
      if (this.entity!=null) {
        _attributes_3=this.entity.getAttributes();
      }
      for(final Attribute attribute_2 : _attributes_3) {
        {
          JvmTypeReference _javaType_4 = null;
          if (attribute_2!=null) {
            _javaType_4=attribute_2.getJavaType();
          }
          boolean _notEquals_2 = (!Objects.equal(_javaType_4, null));
          if (_notEquals_2) {
            JvmTypeReference _javaType_5 = null;
            if (attribute_2!=null) {
              _javaType_5=attribute_2.getJavaType();
            }
            String _qualifiedName_2 = null;
            if (_javaType_5!=null) {
              _qualifiedName_2=_javaType_5.getQualifiedName();
            }
            _builder.append(_qualifiedName_2, "\t");
          } else {
            Entity _type_2 = null;
            if (attribute_2!=null) {
              _type_2=attribute_2.getType();
            }
            String _name_22 = null;
            if (_type_2!=null) {
              _name_22=_type_2.getName();
            }
            _builder.append(_name_22, "\t");
          }
        }
        _builder.append(" ");
        String _name_23 = null;
        if (attribute_2!=null) {
          _name_23=attribute_2.getName();
        }
        String _firstLower_10 = null;
        if (_name_23!=null) {
          _firstLower_10=StringExtensions.toFirstLower(_name_23);
        }
        _builder.append(_firstLower_10, "\t");
        _builder.append(", ");
      }
    }
    _builder.append("SecurityContext securityContext) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Delete given ");
    String _name_24 = null;
    if (this.entity!=null) {
      _name_24=this.entity.getName();
    }
    String _firstUpper_10 = null;
    if (_name_24!=null) {
      _firstUpper_10=StringExtensions.toFirstUpper(_name_24);
    }
    _builder.append(_firstUpper_10, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override def ");
    String _name_25 = null;
    if (this.entity!=null) {
      _name_25=this.entity.getName();
    }
    String _firstLower_11 = null;
    if (_name_25!=null) {
      _firstLower_11=StringExtensions.toFirstLower(_name_25);
    }
    _builder.append(_firstLower_11, "\t");
    _builder.append("Delete(");
    {
      EList<Attribute> _attributes_4 = null;
      if (this.entity!=null) {
        _attributes_4=this.entity.getAttributes();
      }
      for(final Attribute attribute_3 : _attributes_4) {
        {
          JvmTypeReference _javaType_6 = null;
          if (attribute_3!=null) {
            _javaType_6=attribute_3.getJavaType();
          }
          boolean _notEquals_3 = (!Objects.equal(_javaType_6, null));
          if (_notEquals_3) {
            JvmTypeReference _javaType_7 = null;
            if (attribute_3!=null) {
              _javaType_7=attribute_3.getJavaType();
            }
            String _qualifiedName_3 = null;
            if (_javaType_7!=null) {
              _qualifiedName_3=_javaType_7.getQualifiedName();
            }
            _builder.append(_qualifiedName_3, "\t");
          } else {
            Entity _type_3 = null;
            if (attribute_3!=null) {
              _type_3=attribute_3.getType();
            }
            String _name_26 = null;
            if (_type_3!=null) {
              _name_26=_type_3.getName();
            }
            _builder.append(_name_26, "\t");
          }
        }
        _builder.append(" ");
        String _name_27 = null;
        if (attribute_3!=null) {
          _name_27=attribute_3.getName();
        }
        String _firstLower_12 = null;
        if (_name_27!=null) {
          _firstLower_12=StringExtensions.toFirstLower(_name_27);
        }
        _builder.append(_firstLower_12, "\t");
        _builder.append(", ");
      }
    }
    _builder.append("SecurityContext securityContext) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_28 = null;
    if (this.entity!=null) {
      _name_28=this.entity.getName();
    }
    String _firstLower_13 = null;
    if (_name_28!=null) {
      _firstLower_13=StringExtensions.toFirstLower(_name_28);
    }
    _builder.append(_firstLower_13, "\t\t");
    _builder.append("Service.delete(");
    EList<Attribute> _attributes_5 = null;
    if (this.entity!=null) {
      _attributes_5=this.entity.getAttributes();
    }
    Attribute _get_1 = null;
    if (_attributes_5!=null) {
      _get_1=_attributes_5.get(0);
    }
    String _name_29 = null;
    if (_get_1!=null) {
      _name_29=_get_1.getName();
    }
    String _firstLower_14 = null;
    if (_name_29!=null) {
      _firstLower_14=StringExtensions.toFirstLower(_name_29);
    }
    _builder.append(_firstLower_14, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return \'removed ");
    String _name_30 = null;
    if (this.entity!=null) {
      _name_30=this.entity.getName();
    }
    String _firstUpper_11 = null;
    if (_name_30!=null) {
      _firstUpper_11=StringExtensions.toFirstUpper(_name_30);
    }
    _builder.append(_firstUpper_11, "\t\t");
    _builder.append("\'");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
