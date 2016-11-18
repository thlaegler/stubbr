package templates.persistence.src_main_resources.meta_inf;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Attribute;
import com.laegler.stubbr.lang.stubbrLang.ChapterPersistence;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import templates.AbstractSqlTemplate;

/**
 * File template for SQL create-script.
 */
@SuppressWarnings("all")
public class CreateScriptSqlTemplate extends AbstractSqlTemplate {
  public CreateScriptSqlTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("create");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/src/main/resources/META_INF/");
    this.setRelativPath(_builder.toString());
    this.setDocumentation("SQL create-script");
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE USER \'");
    StubbrRegistry _stubbr = this.getStubbr();
    Stubb _stubb = null;
    if (_stubbr!=null) {
      _stubb=_stubbr.getStubb();
    }
    String _name = null;
    if (_stubb!=null) {
      _name=_stubb.getName();
    }
    _builder.append(_name, "");
    _builder.append("\'@\'%\' IDENTIFIED BY \'***\';");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("GRANT USAGE ON * . * TO \'");
    StubbrRegistry _stubbr_1 = this.getStubbr();
    Stubb _stubb_1 = null;
    if (_stubbr_1!=null) {
      _stubb_1=_stubbr_1.getStubb();
    }
    String _name_1 = null;
    if (_stubb_1!=null) {
      _name_1=_stubb_1.getName();
    }
    _builder.append(_name_1, "");
    _builder.append("\'@\'%\' IDENTIFIED BY \'***\' WITH MAX_QUERIES_PER_HOUR 0 MAX_CONNECTIONS_PER_HOUR 0 MAX_UPDATES_PER_HOUR 0 MAX_USER_CONNECTIONS 0 ;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("CREATE DATABASE IF NOT EXISTS `");
    StubbrRegistry _stubbr_2 = this.getStubbr();
    Stubb _stubb_2 = null;
    if (_stubbr_2!=null) {
      _stubb_2=_stubbr_2.getStubb();
    }
    String _name_2 = null;
    if (_stubb_2!=null) {
      _name_2=_stubb_2.getName();
    }
    _builder.append(_name_2, "");
    _builder.append("` ;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("GRANT ALL PRIVILEGES ON `");
    StubbrRegistry _stubbr_3 = this.getStubbr();
    Stubb _stubb_3 = null;
    if (_stubbr_3!=null) {
      _stubb_3=_stubbr_3.getStubb();
    }
    String _name_3 = null;
    if (_stubb_3!=null) {
      _name_3=_stubb_3.getName();
    }
    _builder.append(_name_3, "");
    _builder.append("` . * TO \'citysquire\'@\'%\';");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("GRANT ALL PRIVILEGES ON `");
    StubbrRegistry _stubbr_4 = this.getStubbr();
    Stubb _stubb_4 = null;
    if (_stubbr_4!=null) {
      _stubb_4=_stubbr_4.getStubb();
    }
    String _name_4 = null;
    if (_stubb_4!=null) {
      _name_4=_stubb_4.getName();
    }
    _builder.append(_name_4, "");
    _builder.append("\\_%` . * TO \'citysquire\'@\'%\';");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      StubbrRegistry _stubbr_5 = this.getStubbr();
      Stubb _stubb_5 = null;
      if (_stubbr_5!=null) {
        _stubb_5=_stubbr_5.getStubb();
      }
      ChapterPersistence _persistence = null;
      if (_stubb_5!=null) {
        _persistence=_stubb_5.getPersistence();
      }
      EList<Entity> _entities = null;
      if (_persistence!=null) {
        _entities=_persistence.getEntities();
      }
      for(final Entity entity : _entities) {
        _builder.append("CREATE TABLE IF NOT EXISTS ");
        String _name_5 = null;
        if (entity!=null) {
          _name_5=entity.getName();
        }
        String _lowerCase = null;
        if (_name_5!=null) {
          _lowerCase=_name_5.toLowerCase();
        }
        _builder.append(_lowerCase, "");
        _builder.append(" (");
        _builder.newLineIfNotEmpty();
        {
          EList<Attribute> _attributes = null;
          if (entity!=null) {
            _attributes=entity.getAttributes();
          }
          for(final Attribute attribute : _attributes) {
            _builder.append("\t");
            String _name_6 = null;
            if (attribute!=null) {
              _name_6=attribute.getName();
            }
            _builder.append(_name_6, "\t");
            _builder.append(" ");
            JvmTypeReference _javaType = null;
            if (attribute!=null) {
              _javaType=attribute.getJavaType();
            }
            String _qualifiedName = null;
            if (_javaType!=null) {
              _qualifiedName=_javaType.getQualifiedName();
            }
            String _sqlType = null;
            if (_qualifiedName!=null) {
              _sqlType=this.toSqlType(_qualifiedName);
            }
            _builder.append(_sqlType, "\t");
            _builder.append(" not null,");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("primary key (activity_id)");
        _builder.newLine();
        _builder.append(") ENGINE=InnoDB;");
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
}
