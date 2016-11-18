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
 * File template for SOAP endpoint interface.
 */
@SuppressWarnings("all")
public class SoapEndpointInterfaceXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public SoapEndpointInterfaceXtendTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
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
    _builder.append("Soap");
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
    _builder_1.append("/");
    this.setRelativPath(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("SOAP endpoint interface for entity ");
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
    _builder.append(".persistence.dto.");
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("Dto");
    _builder.newLineIfNotEmpty();
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
    _builder.newLine();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@WebService");
    _builder.newLine();
    _builder.append("@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)");
    _builder.newLine();
    _builder.append("public interface ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Get ");
    String _name_1 = null;
    if (this.entity!=null) {
      _name_1=this.entity.getName();
    }
    String _firstUpper_1 = null;
    if (_name_1!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_name_1);
    }
    _builder.append(_firstUpper_1, "\t ");
    _builder.append(" with given ID.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@WebMethod");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def public ");
    String _name_2 = null;
    if (this.entity!=null) {
      _name_2=this.entity.getName();
    }
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_2, "\t");
    _builder.append("Dto ");
    String _name_3 = null;
    if (this.entity!=null) {
      _name_3=this.entity.getName();
    }
    String _firstLower = null;
    if (_name_3!=null) {
      _firstLower=StringExtensions.toFirstLower(_name_3);
    }
    _builder.append(_firstLower, "\t");
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
            String _name_4 = null;
            if (_type!=null) {
              _name_4=_type.getName();
            }
            _builder.append(_name_4, "\t");
          }
        }
        _builder.append(" ");
        String _name_5 = null;
        if (attribute!=null) {
          _name_5=attribute.getName();
        }
        String _firstLower_1 = null;
        if (_name_5!=null) {
          _firstLower_1=StringExtensions.toFirstLower(_name_5);
        }
        _builder.append(_firstLower_1, "\t");
        _builder.append(", ");
      }
    }
    _builder.append("SecurityContext securityContext)");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Create new ");
    String _name_6 = null;
    if (this.entity!=null) {
      _name_6=this.entity.getName();
    }
    String _firstUpper_3 = null;
    if (_name_6!=null) {
      _firstUpper_3=StringExtensions.toFirstUpper(_name_6);
    }
    _builder.append(_firstUpper_3, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@WebMethod");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def public String ");
    String _name_7 = null;
    if (this.entity!=null) {
      _name_7=this.entity.getName();
    }
    String _firstLower_2 = null;
    if (_name_7!=null) {
      _firstLower_2=StringExtensions.toFirstLower(_name_7);
    }
    _builder.append(_firstLower_2, "\t");
    _builder.append("Post(");
    {
      EList<Attribute> _attributes_1 = null;
      if (this.entity!=null) {
        _attributes_1=this.entity.getAttributes();
      }
      for(final Attribute attribute_1 : _attributes_1) {
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
            String _name_8 = null;
            if (_type_1!=null) {
              _name_8=_type_1.getName();
            }
            _builder.append(_name_8, "\t");
          }
        }
        _builder.append(" ");
        String _name_9 = null;
        if (attribute_1!=null) {
          _name_9=attribute_1.getName();
        }
        String _firstLower_3 = null;
        if (_name_9!=null) {
          _firstLower_3=StringExtensions.toFirstLower(_name_9);
        }
        _builder.append(_firstLower_3, "\t");
        _builder.append(", ");
      }
    }
    _builder.append("SecurityContext securityContext)");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Update given ");
    String _name_10 = null;
    if (this.entity!=null) {
      _name_10=this.entity.getName();
    }
    String _firstUpper_4 = null;
    if (_name_10!=null) {
      _firstUpper_4=StringExtensions.toFirstUpper(_name_10);
    }
    _builder.append(_firstUpper_4, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@WebMethod");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def public String ");
    String _name_11 = null;
    if (this.entity!=null) {
      _name_11=this.entity.getName();
    }
    String _firstLower_4 = null;
    if (_name_11!=null) {
      _firstLower_4=StringExtensions.toFirstLower(_name_11);
    }
    _builder.append(_firstLower_4, "\t");
    _builder.append("Put(");
    {
      EList<Attribute> _attributes_2 = null;
      if (this.entity!=null) {
        _attributes_2=this.entity.getAttributes();
      }
      for(final Attribute attribute_2 : _attributes_2) {
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
            String _name_12 = null;
            if (_type_2!=null) {
              _name_12=_type_2.getName();
            }
            _builder.append(_name_12, "\t");
          }
        }
        _builder.append(" ");
        String _name_13 = null;
        if (attribute_2!=null) {
          _name_13=attribute_2.getName();
        }
        String _firstLower_5 = null;
        if (_name_13!=null) {
          _firstLower_5=StringExtensions.toFirstLower(_name_13);
        }
        _builder.append(_firstLower_5, "\t");
        _builder.append(", ");
      }
    }
    _builder.append("SecurityContext securityContext)");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Delete given ");
    String _name_14 = null;
    if (this.entity!=null) {
      _name_14=this.entity.getName();
    }
    String _firstUpper_5 = null;
    if (_name_14!=null) {
      _firstUpper_5=StringExtensions.toFirstUpper(_name_14);
    }
    _builder.append(_firstUpper_5, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@WebMethod");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def public String ");
    String _name_15 = null;
    if (this.entity!=null) {
      _name_15=this.entity.getName();
    }
    String _firstLower_6 = null;
    if (_name_15!=null) {
      _firstLower_6=StringExtensions.toFirstLower(_name_15);
    }
    _builder.append(_firstLower_6, "\t");
    _builder.append("Delete(");
    {
      EList<Attribute> _attributes_3 = null;
      if (this.entity!=null) {
        _attributes_3=this.entity.getAttributes();
      }
      for(final Attribute attribute_3 : _attributes_3) {
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
            String _name_16 = null;
            if (_type_3!=null) {
              _name_16=_type_3.getName();
            }
            _builder.append(_name_16, "\t");
          }
        }
        _builder.append(" ");
        String _name_17 = null;
        if (attribute_3!=null) {
          _name_17=attribute_3.getName();
        }
        String _firstLower_7 = null;
        if (_name_17!=null) {
          _firstLower_7=StringExtensions.toFirstLower(_name_17);
        }
        _builder.append(_firstLower_7, "\t");
        _builder.append(", ");
      }
    }
    _builder.append("SecurityContext securityContext)");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
