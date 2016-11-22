package templates.parent;

import com.google.common.base.Objects;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.ProjectType;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.ChapterEnvironment;
import com.laegler.stubbr.lang.stubbrLang.ChapterProjectManagement;
import com.laegler.stubbr.lang.stubbrLang.ChapterProjectStructure;
import com.laegler.stubbr.lang.stubbrLang.ChapterStakeholder;
import com.laegler.stubbr.lang.stubbrLang.JvmEnum;
import com.laegler.stubbr.lang.stubbrLang.Level1Attribute;
import com.laegler.stubbr.lang.stubbrLang.Person;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<groupId>");
    Stubb _stubb = this.getStubb();
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
    String _projectName = this.getProjectName();
    _builder.append(_projectName, "");
    _builder.append("</name>");
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
    _builder.append("<description>");
    Project _project_3 = this.getProject();
    String _documentation = null;
    if (_project_3!=null) {
      _documentation=_project_3.getDocumentation();
    }
    _builder.append(_documentation, "");
    _builder.append("</description>");
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
    ChapterEnvironment _chapterEnvironment = this.getChapterEnvironment();
    com.laegler.stubbr.lang.stubbrLang.Runtime _runtime = null;
    if (_chapterEnvironment!=null) {
      _runtime=_chapterEnvironment.getRuntime();
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
    ChapterEnvironment _chapterEnvironment_1 = this.getChapterEnvironment();
    com.laegler.stubbr.lang.stubbrLang.Runtime _runtime_1 = null;
    if (_chapterEnvironment_1!=null) {
      _runtime_1=_chapterEnvironment_1.getRuntime();
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
    _builder.newLine();
    _builder.append("<developers>");
    _builder.newLine();
    {
      ChapterStakeholder _chapterStakeholder = this.getChapterStakeholder();
      EList<Person> _persons = null;
      if (_chapterStakeholder!=null) {
        _persons=_chapterStakeholder.getPersons();
      }
      for(final Person person : _persons) {
        _builder.append("\t");
        _builder.append("<developer>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<name>");
        String _name_1 = null;
        if (person!=null) {
          _name_1=person.getName();
        }
        _builder.append(_name_1, "\t\t");
        _builder.append("</name>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</developer>");
        _builder.newLine();
      }
    }
    _builder.append("</developers>");
    _builder.newLine();
    _builder.newLine();
    {
      ChapterProjectManagement _chapterProjectManagement = this.getChapterProjectManagement();
      EList<Level1Attribute> _issueManagement = null;
      if (_chapterProjectManagement!=null) {
        _issueManagement=_chapterProjectManagement.getIssueManagement();
      }
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(_issueManagement);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("<issueManagement>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<url>");
        ChapterProjectManagement _chapterProjectManagement_1 = this.getChapterProjectManagement();
        EList<Level1Attribute> _issueManagement_1 = null;
        if (_chapterProjectManagement_1!=null) {
          _issueManagement_1=_chapterProjectManagement_1.getIssueManagement();
        }
        String _string = null;
        if (_issueManagement_1!=null) {
          _string=_issueManagement_1.toString();
        }
        _builder.append(_string, "\t");
        _builder.append("</url>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<system>");
        ChapterProjectManagement _chapterProjectManagement_2 = this.getChapterProjectManagement();
        EList<Level1Attribute> _issueManagement_2 = null;
        if (_chapterProjectManagement_2!=null) {
          _issueManagement_2=_chapterProjectManagement_2.getIssueManagement();
        }
        String _string_1 = null;
        if (_issueManagement_2!=null) {
          _string_1=_issueManagement_2.toString();
        }
        _builder.append(_string_1, "\t");
        _builder.append("</system>");
        _builder.newLineIfNotEmpty();
        _builder.append("</issueManagement>");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      ChapterProjectManagement _chapterProjectManagement_3 = this.getChapterProjectManagement();
      EList<Level1Attribute> _scm = null;
      if (_chapterProjectManagement_3!=null) {
        _scm=_chapterProjectManagement_3.getScm();
      }
      boolean _isNullOrEmpty_1 = IterableExtensions.isNullOrEmpty(_scm);
      boolean _not_1 = (!_isNullOrEmpty_1);
      if (_not_1) {
        _builder.append("<scm>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<url>");
        ChapterProjectManagement _chapterProjectManagement_4 = this.getChapterProjectManagement();
        EList<Level1Attribute> _scm_1 = null;
        if (_chapterProjectManagement_4!=null) {
          _scm_1=_chapterProjectManagement_4.getScm();
        }
        String _string_2 = null;
        if (_scm_1!=null) {
          _string_2=_scm_1.toString();
        }
        _builder.append(_string_2, "\t");
        _builder.append("</url>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<connection>");
        ChapterProjectManagement _chapterProjectManagement_5 = this.getChapterProjectManagement();
        EList<Level1Attribute> _scm_2 = null;
        if (_chapterProjectManagement_5!=null) {
          _scm_2=_chapterProjectManagement_5.getScm();
        }
        String _string_3 = null;
        if (_scm_2!=null) {
          _string_3=_scm_2.toString();
        }
        _builder.append(_string_3, "\t");
        _builder.append("</connection>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<developerConnection>");
        ChapterProjectManagement _chapterProjectManagement_6 = this.getChapterProjectManagement();
        EList<Level1Attribute> _scm_3 = null;
        if (_chapterProjectManagement_6!=null) {
          _scm_3=_chapterProjectManagement_6.getScm();
        }
        String _string_4 = null;
        if (_scm_3!=null) {
          _string_4=_scm_3.toString();
        }
        _builder.append(_string_4, "\t");
        _builder.append("</developerConnection>");
        _builder.newLineIfNotEmpty();
        _builder.append("</scm>");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      ChapterProjectManagement _chapterProjectManagement_7 = this.getChapterProjectManagement();
      EList<Level1Attribute> _ci = null;
      if (_chapterProjectManagement_7!=null) {
        _ci=_chapterProjectManagement_7.getCi();
      }
      boolean _isNullOrEmpty_2 = IterableExtensions.isNullOrEmpty(_ci);
      boolean _not_2 = (!_isNullOrEmpty_2);
      if (_not_2) {
        _builder.append("<ciManagement>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<url>");
        ChapterProjectManagement _chapterProjectManagement_8 = this.getChapterProjectManagement();
        EList<Level1Attribute> _ci_1 = null;
        if (_chapterProjectManagement_8!=null) {
          _ci_1=_chapterProjectManagement_8.getCi();
        }
        String _string_5 = null;
        if (_ci_1!=null) {
          _string_5=_ci_1.toString();
        }
        _builder.append(_string_5, "\t");
        _builder.append("</url>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<system>");
        ChapterProjectManagement _chapterProjectManagement_9 = this.getChapterProjectManagement();
        EList<Level1Attribute> _ci_2 = null;
        if (_chapterProjectManagement_9!=null) {
          _ci_2=_chapterProjectManagement_9.getCi();
        }
        String _string_6 = null;
        if (_ci_2!=null) {
          _string_6=_ci_2.toString();
        }
        _builder.append(_string_6, "\t");
        _builder.append("</system>");
        _builder.newLineIfNotEmpty();
        _builder.append("</ciManagement>");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      ChapterProjectManagement _chapterProjectManagement_10 = this.getChapterProjectManagement();
      EList<Level1Attribute> _distroManagement = null;
      if (_chapterProjectManagement_10!=null) {
        _distroManagement=_chapterProjectManagement_10.getDistroManagement();
      }
      boolean _isNullOrEmpty_3 = IterableExtensions.isNullOrEmpty(_distroManagement);
      boolean _not_3 = (!_isNullOrEmpty_3);
      if (_not_3) {
        _builder.append("<distributionManagement>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<site>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<id>");
        ChapterProjectManagement _chapterProjectManagement_11 = this.getChapterProjectManagement();
        EList<Level1Attribute> _distroManagement_1 = null;
        if (_chapterProjectManagement_11!=null) {
          _distroManagement_1=_chapterProjectManagement_11.getDistroManagement();
        }
        String _string_7 = null;
        if (_distroManagement_1!=null) {
          _string_7=_distroManagement_1.toString();
        }
        _builder.append(_string_7, "\t\t");
        _builder.append("</id>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("<name>");
        ChapterProjectManagement _chapterProjectManagement_12 = this.getChapterProjectManagement();
        EList<Level1Attribute> _distroManagement_2 = null;
        if (_chapterProjectManagement_12!=null) {
          _distroManagement_2=_chapterProjectManagement_12.getDistroManagement();
        }
        String _string_8 = null;
        if (_distroManagement_2!=null) {
          _string_8=_distroManagement_2.toString();
        }
        _builder.append(_string_8, "\t\t");
        _builder.append("</name>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("<url>");
        ChapterProjectManagement _chapterProjectManagement_13 = this.getChapterProjectManagement();
        EList<Level1Attribute> _distroManagement_3 = null;
        if (_chapterProjectManagement_13!=null) {
          _distroManagement_3=_chapterProjectManagement_13.getDistroManagement();
        }
        String _string_9 = null;
        if (_distroManagement_3!=null) {
          _string_9=_distroManagement_3.toString();
        }
        _builder.append(_string_9, "\t\t");
        _builder.append("</url>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</site>");
        _builder.newLine();
        _builder.append("</distributionManagement>");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("<modules>");
    _builder.newLine();
    {
      StubbrRegistry _stubbr = this.getStubbr();
      List<Project> _projects = null;
      if (_stubbr!=null) {
        _projects=_stubbr.getProjects();
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
              ChapterProjectStructure _chapterStructure = this.getChapterStructure();
              boolean _isIsNestedParent = _chapterStructure.isIsNestedParent();
              boolean _not_4 = (!_isIsNestedParent);
              if (_not_4) {
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
    _builder.newLine();
    _builder.append("<dependencyManagement>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependencies>");
    _builder.newLine();
    {
      StubbrRegistry _stubbr_1 = this.getStubbr();
      List<Project> _projects_1 = null;
      if (_stubbr_1!=null) {
        _projects_1=_stubbr_1.getProjects();
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
