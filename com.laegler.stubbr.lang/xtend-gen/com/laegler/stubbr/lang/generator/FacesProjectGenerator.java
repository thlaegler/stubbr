package com.laegler.stubbr.lang.generator;

import com.laegler.stubbr.lang.adapter.GherkinAdapter;
import com.laegler.stubbr.lang.generator.AbstractProjectGenerator;
import com.laegler.stubbr.lang.genmodel.FileHelper;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.ProjectType;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * Project Generator for JSF/Faces Project
 */
@SuppressWarnings("all")
public class FacesProjectGenerator extends AbstractProjectGenerator {
  @Inject
  private FileHelper fileHelper;
  
  @Inject
  private GherkinAdapter gherkinAdapter;
  
  private void initProject() {
    boolean _isActive = this.isActive();
    if (_isActive) {
      Project _project = new Project(this.stubbr);
      this.setProject(_project);
      Project _project_1 = this.getProject();
      StringConcatenation _builder = new StringConcatenation();
      Stubb _stubb = null;
      if (this.stubbr!=null) {
        _stubb=this.stubbr.getStubb();
      }
      String _name = null;
      if (_stubb!=null) {
        _name=_stubb.getName();
      }
      String _lowerCase = null;
      if (_name!=null) {
        _lowerCase=_name.toLowerCase();
      }
      _builder.append(_lowerCase, "");
      _builder.append("-faces");
      _project_1.setName(_builder.toString());
      Project _project_2 = this.getProject();
      StringConcatenation _builder_1 = new StringConcatenation();
      Stubb _stubb_1 = null;
      if (this.stubbr!=null) {
        _stubb_1=this.stubbr.getStubb();
      }
      String _packageName = null;
      if (_stubb_1!=null) {
        _packageName=_stubb_1.getPackageName();
      }
      String _lowerCase_1 = null;
      if (_packageName!=null) {
        _lowerCase_1=_packageName.toLowerCase();
      }
      _builder_1.append(_lowerCase_1, "");
      _builder_1.append(".faces");
      _project_2.setBasePackage(_builder_1.toString());
      Project _project_3 = this.getProject();
      _project_3.setProjectType(ProjectType.FACES);
      Project _project_4 = this.getProject();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("/");
      Project _project_5 = this.getProject();
      String _name_1 = null;
      if (_project_5!=null) {
        _name_1=_project_5.getName();
      }
      _builder_2.append(_name_1, "");
      _builder_2.append("/");
      _project_4.setRelativePath(_builder_2.toString());
      Project _project_6 = this.getProject();
      _project_6.setCanonicalName("JSF/Faces project");
      Project _project_7 = this.getProject();
      _project_7.setDocumentation("This project provides JSF/Faces UI layer");
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("Generating Project: ");
      Project _project_8 = this.getProject();
      String _name_2 = null;
      if (_project_8!=null) {
        _name_2=_project_8.getName();
      }
      _builder_3.append(_name_2, "");
      this.log.info(_builder_3.toString());
    }
  }
  
  /**
   * Generate persistence project
   */
  @Override
  public Project prepare() {
    throw new Error("Unresolved compilation problems:"
      + "\nGherkinDocument cannot be resolved to a type."
      + "\nThe method parse(String) from the type GherkinAdapter refers to the missing type GherkinDocument"
      + "\nfeature cannot be resolved"
      + "\nname cannot be resolved"
      + "\nfeature cannot be resolved"
      + "\ndescription cannot be resolved");
  }
  
  private boolean isActive() {
    return true;
  }
}
