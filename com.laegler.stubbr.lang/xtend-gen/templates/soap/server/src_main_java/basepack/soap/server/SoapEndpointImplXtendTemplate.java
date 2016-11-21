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
    String _entityUpper = this.getEntityUpper();
    _builder.append(_entityUpper, "");
    _builder.append("SoapImpl");
    this.setFileName(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _basePackage = null;
    if (project!=null) {
      _basePackage=project.getBasePackage();
    }
    _builder_1.append(_basePackage, "");
    _builder_1.append(".impl");
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
    _builder_2.append("/impl/");
    this.setRelativPath(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("SOAP endpoint implementation for entity ");
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
    String _basePackage = null;
    if (_project!=null) {
      _basePackage=_project.getBasePackage();
    }
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
    _builder.append(".persistence.service.");
    String _entityUpper = this.getEntityUpper();
    _builder.append(_entityUpper, "");
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
    _builder.append(".model.entity.*");
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
    _builder.append(".model.entity.");
    String _entityUpper_1 = this.getEntityUpper();
    _builder.append(_entityUpper_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    StubbrRegistry _stubbr_3 = this.getStubbr();
    Stubb _stubb_3 = null;
    if (_stubbr_3!=null) {
      _stubb_3=_stubbr_3.getStubb();
    }
    String _packageName_3 = null;
    if (_stubb_3!=null) {
      _packageName_3=_stubb_3.getPackageName();
    }
    _builder.append(_packageName_3, "");
    _builder.append(".business.controller.");
    String _entityUpper_2 = this.getEntityUpper();
    _builder.append(_entityUpper_2, "");
    _builder.append("Controller");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    StubbrRegistry _stubbr_4 = this.getStubbr();
    Stubb _stubb_4 = null;
    if (_stubbr_4!=null) {
      _stubb_4=_stubbr_4.getStubb();
    }
    String _packageName_4 = null;
    if (_stubb_4!=null) {
      _packageName_4=_stubb_4.getPackageName();
    }
    _builder.append(_packageName_4, "");
    _builder.append(".business.object.");
    String _entityUpper_3 = this.getEntityUpper();
    _builder.append(_entityUpper_3, "");
    _builder.append("BusinessObject");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    StubbrRegistry _stubbr_5 = this.getStubbr();
    Stubb _stubb_5 = null;
    if (_stubbr_5!=null) {
      _stubb_5=_stubbr_5.getStubb();
    }
    String _packageName_5 = null;
    if (_stubb_5!=null) {
      _packageName_5=_stubb_5.getPackageName();
    }
    _builder.append(_packageName_5, "");
    _builder.append(".soap.server.");
    String _entityUpper_4 = this.getEntityUpper();
    _builder.append(_entityUpper_4, "");
    _builder.append("Soap");
    _builder.newLineIfNotEmpty();
    _builder.append("import javax.inject.Inject");
    _builder.newLine();
    _builder.append("import javax.jws.WebMethod");
    _builder.newLine();
    _builder.append("import javax.ws.rs.core.SecurityContext");
    _builder.newLine();
    _builder.newLine();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport = this.asImport("javax.jws.WebService");
    _builder.append(_asImport, "");
    _builder.append("(endpointInterface = \'");
    Project _project_1 = this.getProject();
    String _basePackage_1 = null;
    if (_project_1!=null) {
      _basePackage_1=_project_1.getBasePackage();
    }
    _builder.append(_basePackage_1, "");
    _builder.append(".");
    String _entityUpper_5 = this.getEntityUpper();
    _builder.append(_entityUpper_5, "");
    _builder.append("Soap\', targetNamespace = \'");
    Project _project_2 = this.getProject();
    String _basePackage_2 = null;
    if (_project_2!=null) {
      _basePackage_2=_project_2.getBasePackage();
    }
    String _namespace = null;
    if (_basePackage_2!=null) {
      _namespace=this.toNamespace(_basePackage_2);
    }
    _builder.append(_namespace, "");
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport_1 = this.asImport("javax.jws.soap.SOAPBinding");
    _builder.append(_asImport_1, "");
    _builder.append("(style = ");
    String _asImport_2 = this.asImport("javax.jws.soap.SOAPBinding.Style");
    _builder.append(_asImport_2, "");
    _builder.append(".DOCUMENT, use=");
    String _asImport_3 = this.asImport("javax.jws.soap.SOAPBinding.Use");
    _builder.append(_asImport_3, "");
    _builder.append(".LITERAL)");
    _builder.newLineIfNotEmpty();
    _builder.append("class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" implements ");
    String _entityUpper_6 = this.getEntityUpper();
    _builder.append(_entityUpper_6, "");
    _builder.append("Soap {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    String _entityUpper_7 = this.getEntityUpper();
    _builder.append(_entityUpper_7, "\t");
    _builder.append("Controller ");
    String _entityLower = this.getEntityLower();
    _builder.append(_entityLower, "\t");
    _builder.append("Controller ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Get ");
    String _entityUpper_8 = this.getEntityUpper();
    _builder.append(_entityUpper_8, "\t ");
    _builder.append(" with given ID.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override def get(");
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
            String _name = null;
            if (_type!=null) {
              _name=_type.getName();
            }
            _builder.append(_name, "\t");
          }
        }
        _builder.append(" ");
        String _name_1 = null;
        if (attribute!=null) {
          _name_1=attribute.getName();
        }
        String _firstLower = null;
        if (_name_1!=null) {
          _firstLower=StringExtensions.toFirstLower(_name_1);
        }
        _builder.append(_firstLower, "\t");
        _builder.append(", ");
      }
    }
    _builder.append("SecurityContext securityContext) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val ");
    String _name_2 = null;
    if (this.entity!=null) {
      _name_2=this.entity.getName();
    }
    String _firstUpper = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper, "\t\t");
    _builder.append("BusinessObject ");
    String _name_3 = null;
    if (this.entity!=null) {
      _name_3=this.entity.getName();
    }
    String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
    _builder.append(_firstLower_1, "\t\t");
    _builder.append("BusinessObject = ");
    String _entityLower_1 = this.getEntityLower();
    _builder.append(_entityLower_1, "\t\t");
    _builder.append("Controller.findById(1)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return ");
    String _name_4 = null;
    if (this.entity!=null) {
      _name_4=this.entity.getName();
    }
    String _firstLower_2 = StringExtensions.toFirstLower(_name_4);
    _builder.append(_firstLower_2, "\t\t");
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
    _builder.append("* Create new ");
    String _entityUpper_9 = this.getEntityUpper();
    _builder.append(_entityUpper_9, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override def create(");
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
            String _name_5 = null;
            if (_type_1!=null) {
              _name_5=_type_1.getName();
            }
            _builder.append(_name_5, "\t");
          }
        }
        _builder.append(" ");
        String _name_6 = null;
        if (attribute_1!=null) {
          _name_6=attribute_1.getName();
        }
        String _firstLower_3 = null;
        if (_name_6!=null) {
          _firstLower_3=StringExtensions.toFirstLower(_name_6);
        }
        _builder.append(_firstLower_3, "\t");
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
    String _entityUpper_10 = this.getEntityUpper();
    _builder.append(_entityUpper_10, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override def update(");
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
            String _name_7 = null;
            if (_type_2!=null) {
              _name_7=_type_2.getName();
            }
            _builder.append(_name_7, "\t");
          }
        }
        _builder.append(" ");
        String _name_8 = null;
        if (attribute_2!=null) {
          _name_8=attribute_2.getName();
        }
        String _firstLower_4 = null;
        if (_name_8!=null) {
          _firstLower_4=StringExtensions.toFirstLower(_name_8);
        }
        _builder.append(_firstLower_4, "\t");
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
    String _entityUpper_11 = this.getEntityUpper();
    _builder.append(_entityUpper_11, "\t ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override def delete(");
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
            String _name_9 = null;
            if (_type_3!=null) {
              _name_9=_type_3.getName();
            }
            _builder.append(_name_9, "\t");
          }
        }
        _builder.append(" ");
        String _name_10 = null;
        if (attribute_3!=null) {
          _name_10=attribute_3.getName();
        }
        String _firstLower_5 = null;
        if (_name_10!=null) {
          _firstLower_5=StringExtensions.toFirstLower(_name_10);
        }
        _builder.append(_firstLower_5, "\t");
        _builder.append(", ");
      }
    }
    _builder.append("SecurityContext securityContext) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _entityLower_2 = this.getEntityLower();
    _builder.append(_entityLower_2, "\t\t");
    _builder.append("Controller.remove(1)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return \'removed ");
    String _entityUpper_12 = this.getEntityUpper();
    _builder.append(_entityUpper_12, "\t\t");
    _builder.append("\'");
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
