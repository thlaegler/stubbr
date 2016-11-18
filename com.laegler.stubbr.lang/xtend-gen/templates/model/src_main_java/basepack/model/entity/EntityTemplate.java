package templates.model.src_main_java.basepack.model.entity;

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
 * File template for entity.
 */
@SuppressWarnings("all")
public class EntityTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public EntityTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
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
    _builder_1.append("/entity/");
    this.setRelativPath(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("package ");
    String _basePackage_1 = project.getBasePackage();
    _builder_2.append(_basePackage_1, "");
    _builder_2.append(".entity");
    this.setHeader(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("Entity ");
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
    String _asImport_1 = this.asImport("javax.persistence.Entity");
    _builder.append(_asImport_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport_2 = this.asImport("javax.persistence.Table");
    _builder.append(_asImport_2, "");
    _builder.append("(name = \"");
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _lowerUnderscore = null;
    if (_name!=null) {
      _lowerUnderscore=this.toLowerUnderscore(_name);
    }
    _builder.append(_lowerUnderscore, "");
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport_3 = this.asImport("javax.xml.bind.annotation.XmlRootElement");
    _builder.append(_asImport_3, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport_4 = this.asImport("org.hibernate.annotations.Cache");
    _builder.append(_asImport_4, "");
    _builder.append("(usage = ");
    String _asImport_5 = this.asImport("org.hibernate.annotations.CacheConcurrencyStrategy");
    _builder.append(_asImport_5, "");
    _builder.append(".NONSTRICT_READ_WRITE)");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport_6 = this.asImport("javax.persistence.NamedQueries");
    _builder.append(_asImport_6, "");
    _builder.append("(#[");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("@");
    String _asImport_7 = this.asImport("javax.persistence.NamedQuery");
    _builder.append(_asImport_7, "\t");
    _builder.append("(name = \'");
    String _name_1 = null;
    if (this.entity!=null) {
      _name_1=this.entity.getName();
    }
    String _firstUpper = null;
    if (_name_1!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name_1);
    }
    _builder.append(_firstUpper, "\t");
    _builder.append(".findAll\', query = \'SELECT e FROM ");
    String _name_2 = null;
    if (this.entity!=null) {
      _name_2=this.entity.getName();
    }
    String _lowerCase = null;
    if (_name_2!=null) {
      _lowerCase=_name_2.toLowerCase();
    }
    _builder.append(_lowerCase, "\t");
    _builder.append(" e\'),");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("@");
    String _asImport_8 = this.asImport("javax.persistence.NamedQuery");
    _builder.append(_asImport_8, "\t");
    _builder.append("(name = \'");
    String _name_3 = null;
    if (this.entity!=null) {
      _name_3=this.entity.getName();
    }
    String _firstUpper_1 = null;
    if (_name_3!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_name_3);
    }
    _builder.append(_firstUpper_1, "\t");
    _builder.append(".findById\', query = \'SELECT e FROM ");
    String _name_4 = null;
    if (this.entity!=null) {
      _name_4=this.entity.getName();
    }
    String _lowerCase_1 = null;
    if (_name_4!=null) {
      _lowerCase_1=_name_4.toLowerCase();
    }
    _builder.append(_lowerCase_1, "\t");
    _builder.append(" e WHERE e.id = :id\')");
    _builder.newLineIfNotEmpty();
    _builder.append("])");
    _builder.newLine();
    _builder.append("class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" implements ");
    String _asImport_9 = this.asImport("java.io.Serializable");
    _builder.append(_asImport_9, "");
    _builder.append(" {");
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
        _builder.append("\t");
        _builder.newLine();
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
        String _firstUpper_2 = null;
        if (_name_5!=null) {
          _firstUpper_2=StringExtensions.toFirstUpper(_name_5);
        }
        _builder.append(_firstUpper_2, "\t ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_10 = this.asImport("javax.persistence.Id");
        _builder.append(_asImport_10, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_11 = this.asImport("javax.persistence.GeneratedValue");
        _builder.append(_asImport_11, "\t");
        _builder.append("(strategy = ");
        String _asImport_12 = this.asImport("javax.persistence.GenerationType");
        _builder.append(_asImport_12, "\t");
        _builder.append(".AUTO)");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("private ");
        StubbrRegistry _stubbr_1 = this.getStubbr();
        Stubb _stubb_1 = null;
        if (_stubbr_1!=null) {
          _stubb_1=_stubbr_1.getStubb();
        }
        ChapterPersistence _persistence_1 = null;
        if (_stubb_1!=null) {
          _persistence_1=_stubb_1.getPersistence();
        }
        JvmTypeReference _javaType = null;
        if (_persistence_1!=null) {
          _javaType=_persistence_1.getJavaType();
        }
        String _qualifiedName = null;
        if (_javaType!=null) {
          _qualifiedName=_javaType.getQualifiedName();
        }
        String _asImport_13 = this.asImport(_qualifiedName);
        _builder.append(_asImport_13, "\t");
        _builder.append(" id");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Attribute> _attributes = null;
      if (this.entity!=null) {
        _attributes=this.entity.getAttributes();
      }
      for(final Attribute attribute : _attributes) {
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        String _documentation = null;
        if (attribute!=null) {
          _documentation=attribute.getDocumentation();
        }
        _builder.append(_documentation, "\t ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        {
          boolean _isPrimaryKey = attribute.isPrimaryKey();
          if (_isPrimaryKey) {
            _builder.append("\t");
            _builder.append("@");
            String _asImport_14 = this.asImport("javax.persistence.Id");
            _builder.append(_asImport_14, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("@");
            String _asImport_15 = this.asImport("javax.persistence.GeneratedValue");
            _builder.append(_asImport_15, "\t");
            _builder.append("(strategy = ");
            String _asImport_16 = this.asImport("javax.persistence.GenerationType");
            _builder.append(_asImport_16, "\t");
            _builder.append(".AUTO)");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("@");
        String _asImport_17 = this.asImport("javax.persistence.Column");
        _builder.append(_asImport_17, "\t");
        _builder.append("(name=\'");
        String _name_6 = null;
        if (attribute!=null) {
          _name_6=attribute.getName();
        }
        String _lowerUnderscore_1 = null;
        if (_name_6!=null) {
          _lowerUnderscore_1=this.toLowerUnderscore(_name_6);
        }
        _builder.append(_lowerUnderscore_1, "\t");
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_18 = this.asImport("com.google.gson.annotations.Until");
        _builder.append(_asImport_18, "\t");
        _builder.append("(");
        Project _project = this.getProject();
        String _version = _project.getVersion();
        String _versionDouble = this.toVersionDouble(_version);
        _builder.append(_versionDouble, "\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_19 = this.asImport("com.fasterxml.jackson.annotation.JsonProperty");
        _builder.append(_asImport_19, "\t");
        _builder.append("(\'");
        String _name_7 = null;
        if (attribute!=null) {
          _name_7=attribute.getName();
        }
        String _firstLower = null;
        if (_name_7!=null) {
          _firstLower=StringExtensions.toFirstLower(_name_7);
        }
        _builder.append(_firstLower, "\t");
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_20 = this.asImport("javax.xml.bind.annotation.XmlElement");
        _builder.append(_asImport_20, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_21 = this.asImport("com.google.gson.annotations.Expose");
        _builder.append(_asImport_21, "\t");
        _builder.append("(serialize=true, deserialize=true)");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("private ");
        {
          JvmTypeReference _javaType_1 = null;
          if (attribute!=null) {
            _javaType_1=attribute.getJavaType();
          }
          boolean _notEquals = (!Objects.equal(_javaType_1, null));
          if (_notEquals) {
            JvmTypeReference _javaType_2 = null;
            if (attribute!=null) {
              _javaType_2=attribute.getJavaType();
            }
            String _qualifiedName_1 = null;
            if (_javaType_2!=null) {
              _qualifiedName_1=_javaType_2.getQualifiedName();
            }
            String _asImport_22 = this.asImport(_qualifiedName_1);
            _builder.append(_asImport_22, "\t");
          } else {
            Project _project_1 = this.getProject();
            String _basePackage = _project_1.getBasePackage();
            String _plus = (_basePackage + ".entity.");
            Entity _type = null;
            if (attribute!=null) {
              _type=attribute.getType();
            }
            String _name_8 = null;
            if (_type!=null) {
              _name_8=_type.getName();
            }
            String _plus_1 = (_plus + _name_8);
            String _asImport_23 = this.asImport(_plus_1);
            _builder.append(_asImport_23, "\t");
          }
        }
        _builder.append(" ");
        String _name_9 = null;
        if (attribute!=null) {
          _name_9=attribute.getName();
        }
        String _firstLower_1 = null;
        if (_name_9!=null) {
          _firstLower_1=StringExtensions.toFirstLower(_name_9);
        }
        _builder.append(_firstLower_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
