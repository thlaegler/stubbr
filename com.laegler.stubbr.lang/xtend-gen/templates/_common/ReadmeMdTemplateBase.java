package templates._common;

import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.ChapterStakeholder;
import com.laegler.stubbr.lang.stubbrLang.Organization;
import com.laegler.stubbr.lang.stubbrLang.Person;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractTemplate;

/**
 * File Generator for github documentation (README.MD)
 */
@SuppressWarnings("all")
public class ReadmeMdTemplateBase extends AbstractTemplate {
  public ReadmeMdTemplateBase(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileType(FileType.MD);
    this.setFileName("README");
    this.setRelativPath("/");
    this.setDocumentation("Github documentation (README.MD)");
    this.setSkipStamping(true);
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    Project _project = this.getProject();
    String _canonicalName = null;
    if (_project!=null) {
      _canonicalName=_project.getCanonicalName();
    }
    _builder.append(_canonicalName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    StubbrRegistry _stubbr = this.getStubbr();
    Stubb _stubb = null;
    if (_stubbr!=null) {
      _stubb=_stubbr.getStubb();
    }
    String _documentation = null;
    if (_stubb!=null) {
      _documentation=_stubb.getDocumentation();
    }
    _builder.append(_documentation, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Stakeholders");
    _builder.newLine();
    _builder.append("## Organizations");
    _builder.newLine();
    {
      StubbrRegistry _stubbr_1 = this.getStubbr();
      Stubb _stubb_1 = null;
      if (_stubbr_1!=null) {
        _stubb_1=_stubbr_1.getStubb();
      }
      ChapterStakeholder _stakeholders = null;
      if (_stubb_1!=null) {
        _stakeholders=_stubb_1.getStakeholders();
      }
      EList<Organization> _organizations = null;
      if (_stakeholders!=null) {
        _organizations=_stakeholders.getOrganizations();
      }
      for(final Organization organization : _organizations) {
        _builder.append("* ");
        String _name = null;
        if (organization!=null) {
          _name=organization.getName();
        }
        _builder.append(_name, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("## Developers");
    _builder.newLine();
    {
      StubbrRegistry _stubbr_2 = this.getStubbr();
      Stubb _stubb_2 = null;
      if (_stubbr_2!=null) {
        _stubb_2=_stubbr_2.getStubb();
      }
      ChapterStakeholder _stakeholders_1 = null;
      if (_stubb_2!=null) {
        _stakeholders_1=_stubb_2.getStakeholders();
      }
      EList<Person> _persons = null;
      if (_stakeholders_1!=null) {
        _persons=_stakeholders_1.getPersons();
      }
      for(final Person person : _persons) {
        _builder.append("* ");
        String _name_1 = null;
        if (person!=null) {
          _name_1=person.getName();
        }
        _builder.append(_name_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
}
