package templates.business.src_main_java_basepack.business.object;

import com.google.common.base.Objects;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Attribute;
import com.laegler.stubbr.lang.stubbrLang.ChapterPersistence;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractXtendTemplate;

/**
 * File template for business object.
 */
@SuppressWarnings("all")
public class BusinessObjectXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public BusinessObjectXtendTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
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
    _builder.append("BusinessObject");
    this.setFileName(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _basePackage = project.getBasePackage();
    _builder_1.append(_basePackage, "");
    _builder_1.append(".object");
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
    _builder_2.append("/object/");
    this.setRelativPath(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("Business object for entity ");
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
    String _template = this.getTemplate();
    String _withImports = this.withImports(_template);
    this.setContent(_withImports);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport = this.asImport("org.eclipse.xtend.lib.annotations.Accessors");
    _builder.append(_asImport, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport_1 = this.asImport("javax.xml.bind.annotation.XmlRootElement");
    _builder.append(_asImport_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" implements ");
    String _asImport_2 = this.asImport("java.io.Serializable");
    _builder.append(_asImport_2, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("new(");
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    _builder.append(_firstUpper, "\t");
    _builder.append(" ");
    String _name_1 = null;
    if (this.entity!=null) {
      _name_1=this.entity.getName();
    }
    String _firstLower = null;
    if (_name_1!=null) {
      _firstLower=StringExtensions.toFirstLower(_name_1);
    }
    _builder.append(_firstLower, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      StubbrRegistry _stubbr = this.getStubbr();
      Stubb _stubb = null;
      if (_stubbr!=null) {
        _stubb=_stubbr.getStubb();
      }
      ChapterPersistence _persistence = null;
      if (_stubb!=null) {
        _persistence=_stubb.getPersistence();
      }
      boolean _isCustomIds = _persistence.isCustomIds();
      boolean _not = (!_isCustomIds);
      if (_not) {
        _builder.append("\t\t");
        _builder.append("this.id = ");
        String _name_2 = null;
        if (this.entity!=null) {
          _name_2=this.entity.getName();
        }
        String _firstLower_1 = null;
        if (_name_2!=null) {
          _firstLower_1=StringExtensions.toFirstLower(_name_2);
        }
        _builder.append(_firstLower_1, "\t\t");
        _builder.append(".id");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Attribute> _attributes = null;
      if (this.entity!=null) {
        _attributes=this.entity.getAttributes();
      }
      for(final Attribute attribute : _attributes) {
        _builder.append("\t\t");
        _builder.append("this.");
        String _name_3 = null;
        if (attribute!=null) {
          _name_3=attribute.getName();
        }
        String _firstLower_2 = null;
        if (_name_3!=null) {
          _firstLower_2=StringExtensions.toFirstLower(_name_3);
        }
        _builder.append(_firstLower_2, "\t\t");
        _builder.append(" = ");
        String _name_4 = null;
        if (this.entity!=null) {
          _name_4=this.entity.getName();
        }
        String _firstLower_3 = null;
        if (_name_4!=null) {
          _firstLower_3=StringExtensions.toFirstLower(_name_4);
        }
        _builder.append(_firstLower_3, "\t\t");
        _builder.append(".id");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      StubbrRegistry _stubbr_1 = this.getStubbr();
      Stubb _stubb_1 = null;
      if (_stubbr_1!=null) {
        _stubb_1=_stubbr_1.getStubb();
      }
      ChapterPersistence _persistence_1 = null;
      if (_stubb_1!=null) {
        _persistence_1=_stubb_1.getPersistence();
      }
      boolean _isCustomIds_1 = _persistence_1.isCustomIds();
      boolean _not_1 = (!_isCustomIds_1);
      if (_not_1) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ID / primary key of entity ");
        String _name_5 = null;
        if (this.entity!=null) {
          _name_5=this.entity.getName();
        }
        String _firstUpper_1 = null;
        if (_name_5!=null) {
          _firstUpper_1=StringExtensions.toFirstUpper(_name_5);
        }
        _builder.append(_firstUpper_1, "\t ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("private ");
        StubbrRegistry _stubbr_2 = this.getStubbr();
        Stubb _stubb_2 = null;
        if (_stubbr_2!=null) {
          _stubb_2=_stubbr_2.getStubb();
        }
        ChapterPersistence _persistence_2 = null;
        if (_stubb_2!=null) {
          _persistence_2=_stubb_2.getPersistence();
        }
        JvmTypeReference _javaType = null;
        if (_persistence_2!=null) {
          _javaType=_persistence_2.getJavaType();
        }
        String _qualifiedName = null;
        if (_javaType!=null) {
          _qualifiedName=_javaType.getQualifiedName();
        }
        String _asImport_3 = this.asImport(_qualifiedName);
        _builder.append(_asImport_3, "\t");
        _builder.append(" id");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    {
      EList<Attribute> _attributes_1 = null;
      if (this.entity!=null) {
        _attributes_1=this.entity.getAttributes();
      }
      for(final Attribute attribute_1 : _attributes_1) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        String _documentation = null;
        if (attribute_1!=null) {
          _documentation=attribute_1.getDocumentation();
        }
        _builder.append(_documentation, "\t ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_4 = this.asImport("com.google.gson.annotations.Until");
        _builder.append(_asImport_4, "\t");
        _builder.append("(");
        Project _project = this.getProject();
        String _version = _project.getVersion();
        String _versionDouble = this.toVersionDouble(_version);
        _builder.append(_versionDouble, "\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_5 = this.asImport("com.fasterxml.jackson.annotation.JsonProperty");
        _builder.append(_asImport_5, "\t");
        _builder.append("(\'");
        String _name_6 = null;
        if (attribute_1!=null) {
          _name_6=attribute_1.getName();
        }
        String _firstLower_4 = null;
        if (_name_6!=null) {
          _firstLower_4=StringExtensions.toFirstLower(_name_6);
        }
        _builder.append(_firstLower_4, "\t");
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_6 = this.asImport("javax.xml.bind.annotation.XmlElement");
        _builder.append(_asImport_6, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_7 = this.asImport("com.google.gson.annotations.Expose");
        _builder.append(_asImport_7, "\t");
        _builder.append("(serialize=true, deserialize=true)");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("private ");
        {
          JvmTypeReference _javaType_1 = null;
          if (attribute_1!=null) {
            _javaType_1=attribute_1.getJavaType();
          }
          boolean _notEquals = (!Objects.equal(_javaType_1, null));
          if (_notEquals) {
            JvmTypeReference _javaType_2 = null;
            if (attribute_1!=null) {
              _javaType_2=attribute_1.getJavaType();
            }
            String _qualifiedName_1 = null;
            if (_javaType_2!=null) {
              _qualifiedName_1=_javaType_2.getQualifiedName();
            }
            String _asImport_8 = this.asImport(_qualifiedName_1);
            _builder.append(_asImport_8, "\t");
          } else {
            StubbrRegistry _stubbr_3 = this.getStubbr();
            Stubb _stubb_3 = null;
            if (_stubbr_3!=null) {
              _stubb_3=_stubbr_3.getStubb();
            }
            String _packageName = null;
            if (_stubb_3!=null) {
              _packageName=_stubb_3.getPackageName();
            }
            String _plus = (_packageName + ".model.entity.");
            Entity _type = null;
            if (attribute_1!=null) {
              _type=attribute_1.getType();
            }
            String _name_7 = null;
            if (_type!=null) {
              _name_7=_type.getName();
            }
            String _plus_1 = (_plus + _name_7);
            String _asImport_9 = this.asImport(_plus_1);
            _builder.append(_asImport_9, "\t");
          }
        }
        _builder.append(" ");
        String _name_8 = null;
        if (attribute_1!=null) {
          _name_8=attribute_1.getName();
        }
        String _firstLower_5 = null;
        if (_name_8!=null) {
          _firstLower_5=StringExtensions.toFirstLower(_name_8);
        }
        _builder.append(_firstLower_5, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
