package templates.faces.src_main_java.basepack.faces.bean;

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
 * File template for JSF/Faces view bean for entity.
 */
@SuppressWarnings("all")
public class EntityViewBeanXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public EntityViewBeanXtendTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
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
    _builder.append("ViewBean");
    this.setFileName(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _basePackage = project.getBasePackage();
    _builder_1.append(_basePackage, "");
    _builder_1.append(".bean");
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
    _builder_2.append("/bean/");
    this.setRelativPath(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("JSF/Faces view bean for entity ");
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
    _builder.append("import com.google.gson.annotations.Until");
    _builder.newLine();
    _builder.append("import javax.annotation.Generated");
    _builder.newLine();
    _builder.append("import javax.annotation.security.PermitAll");
    _builder.newLine();
    _builder.append("import org.slf4j.Logger");
    _builder.newLine();
    _builder.append("import javax.enterprise.context.RequestScoped");
    _builder.newLine();
    _builder.newLine();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@RequestScoped");
    _builder.newLine();
    _builder.append("class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" implements ");
    String _asImport = this.asImport("java.io.Serializable");
    _builder.append(_asImport, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      StubbrRegistry _stubbr_1 = this.getStubbr();
      Stubb _stubb_1 = null;
      if (_stubbr_1!=null) {
        _stubb_1=_stubbr_1.getStubb();
      }
      ChapterPersistence _persistence = null;
      if (_stubb_1!=null) {
        _persistence=_stubb_1.getPersistence();
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
        String _name = null;
        if (this.entity!=null) {
          _name=this.entity.getName();
        }
        String _firstUpper = null;
        if (_name!=null) {
          _firstUpper=StringExtensions.toFirstUpper(_name);
        }
        _builder.append(_firstUpper, "\t ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_1 = this.asImport("javax.persistence.Id");
        _builder.append(_asImport_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_2 = this.asImport("javax.persistence.GeneratedValue");
        _builder.append(_asImport_2, "\t");
        _builder.append("(strategy = ");
        String _asImport_3 = this.asImport("javax.persistence.GenerationType");
        _builder.append(_asImport_3, "\t");
        _builder.append(".AUTO)");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("private ");
        StubbrRegistry _stubbr_2 = this.getStubbr();
        Stubb _stubb_2 = null;
        if (_stubbr_2!=null) {
          _stubb_2=_stubbr_2.getStubb();
        }
        ChapterPersistence _persistence_1 = null;
        if (_stubb_2!=null) {
          _persistence_1=_stubb_2.getPersistence();
        }
        JvmTypeReference _javaType = null;
        if (_persistence_1!=null) {
          _javaType=_persistence_1.getJavaType();
        }
        String _qualifiedName = null;
        if (_javaType!=null) {
          _qualifiedName=_javaType.getQualifiedName();
        }
        String _asImport_4 = this.asImport(_qualifiedName);
        _builder.append(_asImport_4, "\t");
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
            String _asImport_5 = this.asImport("javax.persistence.Id");
            _builder.append(_asImport_5, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("@");
            String _asImport_6 = this.asImport("javax.persistence.GeneratedValue");
            _builder.append(_asImport_6, "\t");
            _builder.append("(strategy = ");
            String _asImport_7 = this.asImport("javax.persistence.GenerationType");
            _builder.append(_asImport_7, "\t");
            _builder.append(".AUTO)");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("@");
        String _asImport_8 = this.asImport("javax.persistence.Column");
        _builder.append(_asImport_8, "\t");
        _builder.append("(name=\'");
        String _name_1 = null;
        if (attribute!=null) {
          _name_1=attribute.getName();
        }
        String _lowerUnderscore = null;
        if (_name_1!=null) {
          _lowerUnderscore=this.toLowerUnderscore(_name_1);
        }
        _builder.append(_lowerUnderscore, "\t");
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_9 = this.asImport("com.google.gson.annotations.Until");
        _builder.append(_asImport_9, "\t");
        _builder.append("(");
        Project _project_1 = this.getProject();
        String _version = _project_1.getVersion();
        String _versionDouble = this.toVersionDouble(_version);
        _builder.append(_versionDouble, "\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_10 = this.asImport("com.fasterxml.jackson.annotation.JsonProperty");
        _builder.append(_asImport_10, "\t");
        _builder.append("(\'");
        String _name_2 = null;
        if (attribute!=null) {
          _name_2=attribute.getName();
        }
        String _firstLower = null;
        if (_name_2!=null) {
          _firstLower=StringExtensions.toFirstLower(_name_2);
        }
        _builder.append(_firstLower, "\t");
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_11 = this.asImport("javax.xml.bind.annotation.XmlElement");
        _builder.append(_asImport_11, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@");
        String _asImport_12 = this.asImport("com.google.gson.annotations.Expose");
        _builder.append(_asImport_12, "\t");
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
            String _asImport_13 = this.asImport(_qualifiedName_1);
            _builder.append(_asImport_13, "\t");
          } else {
            StubbrRegistry _stubbr_3 = this.getStubbr();
            Stubb _stubb_3 = null;
            if (_stubbr_3!=null) {
              _stubb_3=_stubbr_3.getStubb();
            }
            String _packageName_1 = null;
            if (_stubb_3!=null) {
              _packageName_1=_stubb_3.getPackageName();
            }
            String _plus = (_packageName_1 + ".model.entity.");
            Entity _type = null;
            if (attribute!=null) {
              _type=attribute.getType();
            }
            String _name_3 = null;
            if (_type!=null) {
              _name_3=_type.getName();
            }
            String _plus_1 = (_plus + _name_3);
            String _asImport_14 = this.asImport(_plus_1);
            _builder.append(_asImport_14, "\t");
          }
        }
        _builder.append(" ");
        String _name_4 = null;
        if (attribute!=null) {
          _name_4=attribute.getName();
        }
        String _firstLower_1 = null;
        if (_name_4!=null) {
          _firstLower_1=StringExtensions.toFirstLower(_name_4);
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
