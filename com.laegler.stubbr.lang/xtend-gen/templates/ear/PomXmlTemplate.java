package templates.ear;

import com.google.common.base.Objects;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.ProjectType;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates._common.PomXmlTemplateBase;

/**
 * File Generator for Maven project object model (pom.xml) for EAR project.
 */
@SuppressWarnings("all")
public class PomXmlTemplate extends PomXmlTemplateBase {
  public PomXmlTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    StringConcatenation _builder = new StringConcatenation();
    String _documentation = this.getDocumentation();
    _builder.append(_documentation, "");
    _builder.append(" for EAR project");
    this.setDocumentation(_builder.toString());
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    String _parentSection = this.getParentSection();
    _builder.append(_parentSection, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<artifactId>");
    Project _project = this.getProject();
    String _name = _project.getName();
    _builder.append(_name, "\t");
    _builder.append("</artifactId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<name>");
    StubbrRegistry _stubbr = this.getStubbr();
    Stubb _stubb = _stubbr.getStubb();
    String _name_1 = null;
    if (_stubb!=null) {
      _name_1=_stubb.getName();
    }
    String _firstUpper = null;
    if (_name_1!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name_1);
    }
    _builder.append(_firstUpper, "\t");
    _builder.append(" EAR Project</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<packaging>");
    Project _project_1 = this.getProject();
    String _packaging = _project_1.getPackaging();
    _builder.append(_packaging, "\t");
    _builder.append("</packaging>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependencies>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<!-- Project internal -->");
    _builder.newLine();
    {
      StubbrRegistry _stubbr_1 = this.getStubbr();
      List<Project> _projects = null;
      if (_stubbr_1!=null) {
        _projects=_stubbr_1.getProjects();
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
            String _name_2 = null;
            if (project!=null) {
              _name_2=project.getName();
            }
            _builder.append(_name_2, "\t\t\t");
            _builder.append("</artifactId>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<version>${project.version}</version>");
            _builder.newLine();
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
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependencies>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<build>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<finalName>${project.artifactId}</finalName>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugins>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>org.apache.maven</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>maven-ear-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<version>${ear.plugin.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<configuration>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<defaultLibBundleDir>lib/</defaultLibBundleDir>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<fileNameMapping>no-version</fileNameMapping>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<skinnyWars>true</skinnyWars>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>7</version>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<includeInApplicationXml>true</includeInApplicationXml>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<archive>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<manifest>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<addClasspath>true</addClasspath>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</manifest>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</archive>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<modules>");
    _builder.newLine();
    {
      StubbrRegistry _stubbr_2 = this.getStubbr();
      List<Project> _projects_1 = null;
      if (_stubbr_2!=null) {
        _projects_1=_stubbr_2.getProjects();
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
            {
              String _packaging_1 = null;
              if (project_1!=null) {
                _packaging_1=project_1.getPackaging();
              }
              boolean _equals = _packaging_1.equals("jar");
              if (_equals) {
                _builder.append("\t\t\t\t");
                _builder.append("<jarModule>");
                _builder.newLine();
                _builder.append("\t\t\t\t");
                _builder.append("\t");
                _builder.append("<groupId>${project.groupId}</groupId>");
                _builder.newLine();
                _builder.append("\t\t\t\t");
                _builder.append("\t");
                _builder.append("<artifactId>");
                String _name_3 = null;
                if (project_1!=null) {
                  _name_3=project_1.getName();
                }
                _builder.append(_name_3, "\t\t\t\t\t");
                _builder.append("</artifactId>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t\t\t");
                _builder.append("</jarModule>");
                _builder.newLine();
              } else {
                String _packaging_2 = null;
                if (project_1!=null) {
                  _packaging_2=project_1.getPackaging();
                }
                boolean _equals_1 = _packaging_2.equals("ejb");
                if (_equals_1) {
                  _builder.append("\t\t\t\t");
                  _builder.append("<ejbModule>");
                  _builder.newLine();
                  _builder.append("\t\t\t\t");
                  _builder.append("\t");
                  _builder.append("<groupId>${project.groupId}</groupId>");
                  _builder.newLine();
                  _builder.append("\t\t\t\t");
                  _builder.append("\t");
                  _builder.append("<artifactId>");
                  String _name_4 = null;
                  if (project_1!=null) {
                    _name_4=project_1.getName();
                  }
                  _builder.append(_name_4, "\t\t\t\t\t");
                  _builder.append("</artifactId>");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t\t");
                  _builder.append("\t");
                  _builder.append("<bundleDir>/</bundleDir>");
                  _builder.newLine();
                  _builder.append("\t\t\t\t");
                  _builder.append("</ejbModule>");
                  _builder.newLine();
                } else {
                  String _packaging_3 = null;
                  if (project_1!=null) {
                    _packaging_3=project_1.getPackaging();
                  }
                  boolean _equals_2 = _packaging_3.equals("war");
                  if (_equals_2) {
                    _builder.append("\t\t\t\t");
                    _builder.append("<webModule>");
                    _builder.newLine();
                    _builder.append("\t\t\t\t");
                    _builder.append("\t");
                    _builder.append("<groupId>${project.groupId}</groupId>");
                    _builder.newLine();
                    _builder.append("\t\t\t\t");
                    _builder.append("\t");
                    _builder.append("<artifactId>");
                    String _name_5 = null;
                    if (project_1!=null) {
                      _name_5=project_1.getName();
                    }
                    _builder.append(_name_5, "\t\t\t\t\t");
                    _builder.append("</artifactId>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t\t");
                    _builder.append("\t");
                    _builder.append("<contextRoot>/</contextRoot>");
                    _builder.newLine();
                    _builder.append("\t\t\t\t");
                    _builder.append("</webModule>");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append("\t\t\t");
    _builder.append("</modules>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</configuration>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugins>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</build>");
    _builder.newLine();
    return _builder.toString();
  }
}
