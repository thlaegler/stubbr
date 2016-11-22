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
import org.eclipse.xtext.xbase.lib.StringExtensions;
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
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# ");
    Stubb _stubb = this.getStubb();
    String _name = null;
    if (_stubb!=null) {
      _name=_stubb.getName();
    }
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    _builder.append(_firstUpper, "");
    _builder.append(" - ");
    Project _project = this.getProject();
    String _canonicalName = null;
    if (_project!=null) {
      _canonicalName=_project.getCanonicalName();
    }
    _builder.append(_canonicalName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    Stubb _stubb_1 = this.getStubb();
    String _documentation = null;
    if (_stubb_1!=null) {
      _documentation=_stubb_1.getDocumentation();
    }
    _builder.append(_documentation, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("## Stakeholders");
    _builder.newLine();
    _builder.append("### Organizations");
    _builder.newLine();
    {
      ChapterStakeholder _chapterStakeholder = this.getChapterStakeholder();
      EList<Organization> _organizations = null;
      if (_chapterStakeholder!=null) {
        _organizations=_chapterStakeholder.getOrganizations();
      }
      for(final Organization organization : _organizations) {
        _builder.append("* ");
        String _name_1 = null;
        if (organization!=null) {
          _name_1=organization.getName();
        }
        _builder.append(_name_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("### Developers");
    _builder.newLine();
    {
      ChapterStakeholder _chapterStakeholder_1 = this.getChapterStakeholder();
      EList<Person> _persons = null;
      if (_chapterStakeholder_1!=null) {
        _persons=_chapterStakeholder_1.getPersons();
      }
      for(final Person person : _persons) {
        _builder.append("* ");
        String _name_2 = null;
        if (person!=null) {
          _name_2=person.getName();
        }
        _builder.append(_name_2, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
}
