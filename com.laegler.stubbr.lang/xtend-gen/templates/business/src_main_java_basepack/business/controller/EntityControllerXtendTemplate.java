package templates.business.src_main_java_basepack.business.controller;

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
 * File template for controller for entity.
 */
@SuppressWarnings("all")
public class EntityControllerXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public EntityControllerXtendTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
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
    _builder.append("Controller");
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
    _builder_1.append("/controller/");
    this.setRelativPath(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("Controller for entity ");
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
    String _withImports = this.withImports(_template);
    this.setContent(_withImports);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    Project _project = this.getProject();
    String _basePackage = _project.getBasePackage();
    _builder.append(_basePackage, "");
    _builder.append(".controller");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    Project _project_1 = this.getProject();
    String _basePackage_1 = _project_1.getBasePackage();
    _builder.append(_basePackage_1, "");
    _builder.append(".*");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.io.Serializable");
    _builder.newLine();
    _builder.append("import javax.persistence.Column");
    _builder.newLine();
    _builder.append("import javax.persistence.Entity");
    _builder.newLine();
    _builder.append("import javax.persistence.Table");
    _builder.newLine();
    _builder.append("import javax.xml.bind.annotation.XmlElement");
    _builder.newLine();
    _builder.append("import javax.xml.bind.annotation.XmlRootElement");
    _builder.newLine();
    _builder.append("import org.eclipse.xtend.lib.annotations.Accessors");
    _builder.newLine();
    _builder.append("import com.google.gson.annotations.Expose");
    _builder.newLine();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport = this.asImport("org.hibernate.annotations.Cache");
    _builder.append(_asImport, "");
    _builder.append("(usage = ");
    String _asImport_1 = this.asImport("org.hibernate.annotations.CacheConcurrencyStrategy");
    _builder.append(_asImport_1, "");
    _builder.append(".NONSTRICT_READ_WRITE)");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport_2 = this.asImport("javax.ejb.Stateless");
    _builder.append(_asImport_2, "");
    _builder.newLineIfNotEmpty();
    _builder.append("class ");
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
            String _asImport_3 = this.asImport("javax.persistence.Id");
            _builder.append(_asImport_3, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("@");
            String _asImport_4 = this.asImport("javax.persistence.GeneratedValue");
            _builder.append(_asImport_4, "\t");
            _builder.append("(strategy = ");
            String _asImport_5 = this.asImport("javax.persistence.GenerationType");
            _builder.append(_asImport_5, "\t");
            _builder.append(".AUTO)");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("@Column(name=\'");
        String _name = null;
        if (attribute!=null) {
          _name=attribute.getName();
        }
        String _lowerUnderscore = null;
        if (_name!=null) {
          _lowerUnderscore=this.toLowerUnderscore(_name);
        }
        _builder.append(_lowerUnderscore, "\t");
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("//@Since(");
        StubbrRegistry _stubbr = this.getStubbr();
        Stubb _stubb = null;
        if (_stubbr!=null) {
          _stubb=_stubbr.getStubb();
        }
        String _version = null;
        if (_stubb!=null) {
          _version=_stubb.getVersion();
        }
        _builder.append(_version, "\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@Until(0.0)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("//@JsonProperty(\'");
        String _name_1 = null;
        if (attribute!=null) {
          _name_1=attribute.getName();
        }
        String _firstLower = null;
        if (_name_1!=null) {
          _firstLower=StringExtensions.toFirstLower(_name_1);
        }
        _builder.append(_firstLower, "\t");
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@XmlElement");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Expose(serialize=true, deserialize=true)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Accessors(PUBLIC_GETTER, PUBLIC_SETTER)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("private ");
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
            String _name_2 = null;
            if (_type!=null) {
              _name_2=_type.getName();
            }
            _builder.append(_name_2, "\t");
          }
        }
        _builder.append(" ");
        String _name_3 = null;
        if (attribute!=null) {
          _name_3=attribute.getName();
        }
        String _firstLower_1 = null;
        if (_name_3!=null) {
          _firstLower_1=StringExtensions.toFirstLower(_name_3);
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
