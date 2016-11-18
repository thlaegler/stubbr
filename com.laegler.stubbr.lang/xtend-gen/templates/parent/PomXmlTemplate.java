package templates.parent;

import com.google.common.base.Objects;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.ProjectType;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.ChapterEnvironment;
import com.laegler.stubbr.lang.stubbrLang.ChapterProjectStructure;
import com.laegler.stubbr.lang.stubbrLang.JvmEnum;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates._common.PomXmlTemplateBase;

/**
 * File Generator for Maven project object model (pom.xml) for parent project.
 */
@SuppressWarnings("all")
public class PomXmlTemplate extends PomXmlTemplateBase {
  public PomXmlTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    StringConcatenation _builder = new StringConcatenation();
    String _documentation = this.getDocumentation();
    _builder.append(_documentation, "");
    _builder.append(" for parent project");
    this.setDocumentation(_builder.toString());
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<groupId>");
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
    _builder.append("</groupId>");
    _builder.newLineIfNotEmpty();
    _builder.append("<artifactId>");
    Project _project = this.getProject();
    String _name = null;
    if (_project!=null) {
      _name=_project.getName();
    }
    _builder.append(_name, "");
    _builder.append("</artifactId>");
    _builder.newLineIfNotEmpty();
    _builder.append("<version>");
    Project _project_1 = this.getProject();
    String _version = null;
    if (_project_1!=null) {
      _version=_project_1.getVersion();
    }
    _builder.append(_version, "");
    _builder.append("</version>");
    _builder.newLineIfNotEmpty();
    _builder.append("<name>");
    StubbrRegistry _stubbr_1 = this.getStubbr();
    Stubb _stubb_1 = null;
    if (_stubbr_1!=null) {
      _stubb_1=_stubbr_1.getStubb();
    }
    String _name_1 = null;
    if (_stubb_1!=null) {
      _name_1=_stubb_1.getName();
    }
    String _firstUpper = null;
    if (_name_1!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name_1);
    }
    _builder.append(_firstUpper, "");
    _builder.append(" Parent Project</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("<packaging>");
    Project _project_2 = this.getProject();
    String _packaging = null;
    if (_project_2!=null) {
      _packaging=_project_2.getPackaging();
    }
    _builder.append(_packaging, "");
    _builder.append("</packaging>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<properties>");
    _builder.newLine();
    {
      Map<String, String> _properties = this.getProperties();
      Set<Map.Entry<String, String>> _entrySet = null;
      if (_properties!=null) {
        _entrySet=_properties.entrySet();
      }
      for(final Object entry : _entrySet) {
        {
          if ((entry instanceof Map.Entry<?, ?>)) {
            _builder.append("\t");
            _builder.append("<");
            Object _key = ((Map.Entry<?, ?>)entry).getKey();
            _builder.append(_key, "\t");
            _builder.append(">");
            Object _value = ((Map.Entry<?, ?>)entry).getValue();
            _builder.append(_value, "\t");
            _builder.append("</");
            Object _key_1 = ((Map.Entry<?, ?>)entry).getKey();
            _builder.append(_key_1, "\t");
            _builder.append(">");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("<compiler.source.version>");
    StubbrRegistry _stubbr_2 = this.getStubbr();
    Stubb _stubb_2 = null;
    if (_stubbr_2!=null) {
      _stubb_2=_stubbr_2.getStubb();
    }
    ChapterEnvironment _environment = null;
    if (_stubb_2!=null) {
      _environment=_stubb_2.getEnvironment();
    }
    com.laegler.stubbr.lang.stubbrLang.Runtime _runtime = null;
    if (_environment!=null) {
      _runtime=_environment.getRuntime();
    }
    JvmEnum _jvm = null;
    if (_runtime!=null) {
      _jvm=_runtime.getJvm();
    }
    String _literal = null;
    if (_jvm!=null) {
      _literal=_jvm.getLiteral();
    }
    _builder.append(_literal, "\t");
    _builder.append("</compiler.source.version>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<compiler.target.version>");
    StubbrRegistry _stubbr_3 = this.getStubbr();
    Stubb _stubb_3 = null;
    if (_stubbr_3!=null) {
      _stubb_3=_stubbr_3.getStubb();
    }
    ChapterEnvironment _environment_1 = null;
    if (_stubb_3!=null) {
      _environment_1=_stubb_3.getEnvironment();
    }
    com.laegler.stubbr.lang.stubbrLang.Runtime _runtime_1 = null;
    if (_environment_1!=null) {
      _runtime_1=_environment_1.getRuntime();
    }
    JvmEnum _jvm_1 = null;
    if (_runtime_1!=null) {
      _jvm_1=_runtime_1.getJvm();
    }
    String _literal_1 = null;
    if (_jvm_1!=null) {
      _literal_1=_jvm_1.getLiteral();
    }
    _builder.append(_literal_1, "\t");
    _builder.append("</compiler.target.version>");
    _builder.newLineIfNotEmpty();
    _builder.append("</properties>");
    _builder.newLine();
    _builder.append("<modules>");
    _builder.newLine();
    {
      StubbrRegistry _stubbr_4 = this.getStubbr();
      List<Project> _projects = null;
      if (_stubbr_4!=null) {
        _projects=_stubbr_4.getProjects();
      }
      for(final Project project : _projects) {
        {
          boolean _and = false;
          if (!((!Objects.equal(project, null)) && (!StringExtensions.isNullOrEmpty(project.getName())))) {
            _and = false;
          } else {
            ProjectType _projectType = null;
            if (project!=null) {
              _projectType=project.getProjectType();
            }
            boolean _notEquals = (!Objects.equal(_projectType, ProjectType.PARENT));
            _and = _notEquals;
          }
          if (_and) {
            _builder.append("\t");
            _builder.append("<module>");
            {
              StubbrRegistry _stubbr_5 = this.getStubbr();
              Stubb _stubb_4 = null;
              if (_stubbr_5!=null) {
                _stubb_4=_stubbr_5.getStubb();
              }
              ChapterProjectStructure _structure = null;
              if (_stubb_4!=null) {
                _structure=_stubb_4.getStructure();
              }
              boolean _isIsNestedParent = _structure.isIsNestedParent();
              boolean _not = (!_isIsNestedParent);
              if (_not) {
                _builder.append("../");
              }
            }
            String _name_2 = null;
            if (project!=null) {
              _name_2=project.getName();
            }
            _builder.append(_name_2, "\t");
            _builder.append("</module>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("</modules>");
    _builder.newLine();
    _builder.append("<dependencyManagement>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependencies>");
    _builder.newLine();
    {
      StubbrRegistry _stubbr_6 = this.getStubbr();
      List<Project> _projects_1 = null;
      if (_stubbr_6!=null) {
        _projects_1=_stubbr_6.getProjects();
      }
      for(final Project project_1 : _projects_1) {
        {
          boolean _and_1 = false;
          if (!((!Objects.equal(project_1, null)) && (!StringExtensions.isNullOrEmpty(project_1.getName())))) {
            _and_1 = false;
          } else {
            ProjectType _projectType_1 = null;
            if (project_1!=null) {
              _projectType_1=project_1.getProjectType();
            }
            boolean _notEquals_1 = (!Objects.equal(_projectType_1, ProjectType.PARENT));
            _and_1 = _notEquals_1;
          }
          if (_and_1) {
            _builder.append("\t\t");
            _builder.append("<dependency>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<groupId>${project.groupId}</groupId>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<artifactId>");
            String _name_3 = null;
            if (project_1!=null) {
              _name_3=project_1.getName();
            }
            _builder.append(_name_3, "\t\t\t");
            _builder.append("</artifactId>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<version>${project.version}</version>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<type>");
            String _packaging_1 = null;
            if (project_1!=null) {
              _packaging_1=project_1.getPackaging();
            }
            _builder.append(_packaging_1, "\t\t\t");
            _builder.append("</type>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("</dependency>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.wildfly.bom</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>wildfly-javaee7-with-tools</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${wildfly.bom.version}</version>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<type>pom</type>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<scope>import</scope>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>javax.enterprise</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>cdi-api</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${cdi.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.jboss.spec.javax.ejb</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>jboss-ejb-api_3.2_spec</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>1.0.0.Final</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.jboss.spec.javax.faces</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>jboss-jsf-api_2.2_spec</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>2.2.13</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.jboss.spec.javax.servlet</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>jboss-servlet-api_3.1_spec</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>1.0.0.Final</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.jboss.spec.javax.annotation</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>jboss-annotations-api_1.2_spec</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>1.0.0.Final</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.eclipse.xtend</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>org.eclipse.xtend.lib</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${xtend.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>joda-time</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>joda-time</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${joda.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.slf4j</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>slf4j-api</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${slf4j.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>com.google.code.gson</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>gson</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${gson.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("<groupId>com.fasterxml.jackson.core</groupId>");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("<artifactId>jackson-annotations</artifactId>");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("<version>${jackson.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>junit</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>junit</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${junit.version}</version>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.mockito</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>mockito-all</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${mockito.version}</version>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.powermock</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>powermock-api-mockito</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${powermock.version}</version>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>info.cukes</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>cucumber-core</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${cucumber.version}</version>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>info.cukes</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>cucumber-java</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${cucumber.version}</version>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>info.cukes</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>cucumber-junit</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${cucumber.version}</version>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>info.cukes</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>gherkin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${gherkin.version}</version>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependencies>");
    _builder.newLine();
    _builder.append("</dependencyManagement>");
    _builder.newLine();
    _builder.append("<build>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<finalName>${project.artifactId}</finalName>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<plugins>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.apache.maven.plugins</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>maven-compiler-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>3.5.1</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.wildfly.plugins</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>wildfly-maven-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${wildfly.plugin.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.apache.maven</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>maven-jar-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${jar.plugin.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.apache.maven</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>maven-ejb-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${ejb.plugin.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.apache.maven</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>maven-war-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${war.plugin.version}</version>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<configuration>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<failOnMissingWebXml>false</failOnMissingWebXml>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</configuration>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.apache.maven.plugins</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>maven-failsafe-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${failsafe.plugin.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.apache.maven</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>maven-plugin-api</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${api.plugin.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.apache.maven.plugins</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>maven-surefire-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${surefire.plugin.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.apache.maven.plugins</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>maven-source-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${source.plugin.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.apache.maven.plugins</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>maven-javadoc-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${javadoc.plugin.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.apache.maven.plugins</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>maven-site-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${site.plugin.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</plugins>");
    _builder.newLine();
    _builder.append("</build>");
    _builder.newLine();
    return _builder.toString();
  }
  
  private Map<String, String> getProperties() {
    HashMap<String, String> _hashMap = new HashMap<String, String>();
    final Procedure1<HashMap<String, String>> _function = (HashMap<String, String> it) -> {
      it.put("wildfly.bom.version", "10.1.0.Final");
      it.put("tuckey.version", "4.0.3");
      it.put("cdi.version", "1.2");
      it.put("xtend.version", "2.10.0");
      it.put("joda.version", "2.9.4");
      it.put("slf4j.version", "1.7.21");
      it.put("gson.version", "2.7");
      it.put("jackson.version", "2.8.4");
      it.put("cdi.version", "1.2");
      it.put("junit.version", "4.12");
      it.put("mockito.version", "2.0.2-beta");
      it.put("powermock.version", "1.6.5");
      it.put("cucumber.version", "1.2.4");
      it.put("gherkin.version", "2.12.2");
      it.put("compiler.plugin.version", "3.3");
      it.put("jar.plugin.version", "3.0.2");
      it.put("ejb.plugin.version", "2.5.1");
      it.put("war.plugin.version", "3.0.0");
      it.put("ear.plugin.version", "2.10.1");
      it.put("wildfly.plugin.version", "1.0.2.Final");
      it.put("source.plugin.version", "2.10.4");
      it.put("api.plugin.version", "2.10.4");
      it.put("dependency.plugin.version", "2.10.4");
      it.put("failsafe.plugin.version", "2.19.1");
      it.put("checkstyle.plugin.version", "2.17");
      it.put("surefire.plugin.version", "2.19.1");
      it.put("javadoc.plugin.version", "2.10.4");
      it.put("site.plugin.version", "3.4");
    };
    return ObjectExtensions.<HashMap<String, String>>operator_doubleArrow(_hashMap, _function);
  }
}
