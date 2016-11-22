package templates._common.src_main_resource.meta_inf;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.ChapterPersistence;
import com.laegler.stubbr.lang.stubbrLang.Database;
import com.laegler.stubbr.lang.stubbrLang.DatabaseEnum;
import com.laegler.stubbr.lang.stubbrLang.Level1Attribute;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractXmlTemplate;

/**
 * File Generator for JPA descriptor (persistence.xml)
 */
@SuppressWarnings("all")
public class PersistenceXmlTemplateBase extends AbstractXmlTemplate {
  public PersistenceXmlTemplateBase(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("persistence");
    this.setRelativPath("/src/main/resources/META-INF/");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<persistence");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("version=\"2.1\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns=\"http://xmlns.jcp.org/xml/ns/persistence\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xsi:schemaLocation=\"http://xmlns.jcp.org/xml/ns/persistence");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd\">");
    _builder.newLine();
    this.setHeader(_builder.toString());
    this.setFooter("</persistence>");
    this.setDocumentation("JPA descriptor");
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
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
      EList<Level1Attribute> _persistenceUnits = null;
      if (_persistence!=null) {
        _persistenceUnits=_persistence.getPersistenceUnits();
      }
      for(final Level1Attribute persistenceUnit : _persistenceUnits) {
        _builder.append("<persistence-unit name=\"");
        String _name = null;
        if (persistenceUnit!=null) {
          _name=persistenceUnit.getName();
        }
        _builder.append(_name, "");
        _builder.append("\" transaction-type=\"JTA\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<jta-data-source>java:jboss/datasources/");
        StubbrRegistry _stubbr_1 = this.getStubbr();
        Stubb _stubb_1 = null;
        if (_stubbr_1!=null) {
          _stubb_1=_stubbr_1.getStubb();
        }
        ChapterPersistence _persistence_1 = null;
        if (_stubb_1!=null) {
          _persistence_1=_stubb_1.getPersistence();
        }
        EList<Level1Attribute> _datasources = null;
        if (_persistence_1!=null) {
          _datasources=_persistence_1.getDatasources();
        }
        Level1Attribute _get = null;
        if (_datasources!=null) {
          _get=_datasources.get(0);
        }
        String _name_1 = null;
        if (_get!=null) {
          _name_1=_get.getName();
        }
        _builder.append(_name_1, "\t");
        _builder.append("</jta-data-source>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<properties>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<property name=\"hibernate.show_sql\" value=\"true\" />");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<property name=\"hibernate.format_sql\" value=\"true\" />");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<property name=\"hibernate.hbm2ddl.auto\" value=\"validate\" />");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<!-- <property name=\"hibernate.hbm2ddl.auto\" value=\"create-drop\" /> -->");
        _builder.newLine();
        _builder.append("\t\t         ");
        _builder.append("<!-- <property name=\"hibernate.hbm2ddl.import_files\" value=\"import.sql\" /> -->");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<property name=\"hibernate.dialect\"");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("value=\"de.citysquire.model.database.");
        StubbrRegistry _stubbr_2 = this.getStubbr();
        Stubb _stubb_2 = null;
        if (_stubbr_2!=null) {
          _stubb_2=_stubbr_2.getStubb();
        }
        String _prefix = null;
        if (_stubb_2!=null) {
          _prefix=_stubb_2.getPrefix();
        }
        _builder.append(_prefix, "\t\t\t");
        StubbrRegistry _stubbr_3 = this.getStubbr();
        Stubb _stubb_3 = null;
        if (_stubbr_3!=null) {
          _stubb_3=_stubbr_3.getStubb();
        }
        ChapterPersistence _persistence_2 = null;
        if (_stubb_3!=null) {
          _persistence_2=_stubb_3.getPersistence();
        }
        EList<Database> _databases = null;
        if (_persistence_2!=null) {
          _databases=_persistence_2.getDatabases();
        }
        Database _get_1 = null;
        if (_databases!=null) {
          _get_1=_databases.get(0);
        }
        DatabaseEnum _type = null;
        if (_get_1!=null) {
          _type=_get_1.getType();
        }
        String _literal = _type.getLiteral();
        _builder.append(_literal, "\t\t\t");
        _builder.append("5InnoDBDialect\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("<property name=\"jadira.usertype.autoRegisterUserTypes\"");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("value=\"true\" />");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</properties>");
        _builder.newLine();
        _builder.append("</persistence-unit>");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
}
