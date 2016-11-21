package com.laegler.stubbr.lang.generator;

import com.laegler.stubbr.lang.generator.AbstractProjectGenerator;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.ProjectType;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import templates.AbstractTemplate;
import templates._common.DotGitignoreTemplateBase;
import templates._common.EclipseDotClasspathTemplateBase;
import templates._common.GitKeepTemplateBase;
import templates._common.IntellijProjectImlFileBase;
import templates._common.ReadmeMdTemplateBase;
import templates._common.settings.EclipseCoreResourcesPrefsTemplateBase;
import templates._common.settings.EclipseJdtCorePrefsTemplateBase;
import templates._common.settings.EclipseM2eCorePrefsTemplateBase;
import templates._common.src_main_resource.meta_inf.ManifestMfTemplateBase;
import templates.common.EclipseDotProjectTemplate;
import templates.common.PomXmlTemplate;
import templates.common.settings.EclipseWstCommonComponentTemplate;
import templates.common.settings.EclipseWstProjectFacetCoreXmlTemplate;

/**
 * Project Generator for Common Project
 */
@SuppressWarnings("all")
public class CommonProjectGenerator extends AbstractProjectGenerator {
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
      _builder.append("-common");
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
      _builder_1.append(".common");
      _project_2.setBasePackage(_builder_1.toString());
      Project _project_3 = this.getProject();
      _project_3.setProjectType(ProjectType.COMMON);
      Project _project_4 = this.getProject();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("/");
      Project _project_5 = this.getProject();
      String _name_1 = _project_5.getName();
      _builder_2.append(_name_1, "");
      _builder_2.append("/");
      _project_4.setRelativePath(_builder_2.toString());
      Project _project_6 = this.getProject();
      _project_6.setCanonicalName("Common project");
      Project _project_7 = this.getProject();
      _project_7.setDocumentation("This project keeps common utilities and settings for all other projects");
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("Generating Project: ");
      Project _project_8 = this.getProject();
      String _name_2 = _project_8.getName();
      _builder_3.append(_name_2, "");
      this.log.info(_builder_3.toString());
    }
  }
  
  /**
   * Generate persistence project
   */
  @Override
  public Project prepare() {
    Project _xblockexpression = null;
    {
      this.initProject();
      Project _project = this.getProject();
      List<AbstractTemplate> _files = null;
      if (_project!=null) {
        _files=_project.getFiles();
      }
      if (_files!=null) {
        Project _project_1 = this.getProject();
        ReadmeMdTemplateBase _readmeMdTemplateBase = new ReadmeMdTemplateBase(this.stubbr, _project_1);
        Project _project_2 = this.getProject();
        IntellijProjectImlFileBase _intellijProjectImlFileBase = new IntellijProjectImlFileBase(this.stubbr, _project_2);
        Project _project_3 = this.getProject();
        DotGitignoreTemplateBase _dotGitignoreTemplateBase = new DotGitignoreTemplateBase(this.stubbr, _project_3);
        Project _project_4 = this.getProject();
        EclipseDotClasspathTemplateBase _eclipseDotClasspathTemplateBase = new EclipseDotClasspathTemplateBase(this.stubbr, _project_4);
        Project _project_5 = this.getProject();
        ManifestMfTemplateBase _manifestMfTemplateBase = new ManifestMfTemplateBase(this.stubbr, _project_5);
        Project _project_6 = this.getProject();
        EclipseCoreResourcesPrefsTemplateBase _eclipseCoreResourcesPrefsTemplateBase = new EclipseCoreResourcesPrefsTemplateBase(this.stubbr, _project_6);
        Project _project_7 = this.getProject();
        EclipseJdtCorePrefsTemplateBase _eclipseJdtCorePrefsTemplateBase = new EclipseJdtCorePrefsTemplateBase(this.stubbr, _project_7);
        Project _project_8 = this.getProject();
        EclipseM2eCorePrefsTemplateBase _eclipseM2eCorePrefsTemplateBase = new EclipseM2eCorePrefsTemplateBase(this.stubbr, _project_8);
        Project _project_9 = this.getProject();
        EclipseWstProjectFacetCoreXmlTemplate _eclipseWstProjectFacetCoreXmlTemplate = new EclipseWstProjectFacetCoreXmlTemplate(this.stubbr, _project_9);
        Project _project_10 = this.getProject();
        EclipseWstCommonComponentTemplate _eclipseWstCommonComponentTemplate = new EclipseWstCommonComponentTemplate(this.stubbr, _project_10);
        Project _project_11 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase = new GitKeepTemplateBase(this.stubbr, _project_11, "/src/main/java/");
        Project _project_12 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_1 = new GitKeepTemplateBase(this.stubbr, _project_12, "/src/main/src-gen/");
        Project _project_13 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_2 = new GitKeepTemplateBase(this.stubbr, _project_13, "/src/main/xtend-gen/");
        Project _project_14 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_3 = new GitKeepTemplateBase(this.stubbr, _project_14, "/src/main/resources/");
        Project _project_15 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_4 = new GitKeepTemplateBase(this.stubbr, _project_15, "/src/test/java/");
        Project _project_16 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_5 = new GitKeepTemplateBase(this.stubbr, _project_16, "/src/test/src-gen/");
        Project _project_17 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_6 = new GitKeepTemplateBase(this.stubbr, _project_17, "/src/test/xtend-gen/");
        Project _project_18 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_7 = new GitKeepTemplateBase(this.stubbr, _project_18, "/src/test/resources/");
        Project _project_19 = this.getProject();
        PomXmlTemplate _pomXmlTemplate = new PomXmlTemplate(this.stubbr, _project_19);
        Project _project_20 = this.getProject();
        EclipseDotProjectTemplate _eclipseDotProjectTemplate = new EclipseDotProjectTemplate(this.stubbr, _project_20);
        _files.addAll(
          Collections.<AbstractTemplate>unmodifiableList(CollectionLiterals.<AbstractTemplate>newArrayList(_readmeMdTemplateBase, _intellijProjectImlFileBase, _dotGitignoreTemplateBase, _eclipseDotClasspathTemplateBase, _manifestMfTemplateBase, _eclipseCoreResourcesPrefsTemplateBase, _eclipseJdtCorePrefsTemplateBase, _eclipseM2eCorePrefsTemplateBase, _eclipseWstProjectFacetCoreXmlTemplate, _eclipseWstCommonComponentTemplate, _gitKeepTemplateBase, _gitKeepTemplateBase_1, _gitKeepTemplateBase_2, _gitKeepTemplateBase_3, _gitKeepTemplateBase_4, _gitKeepTemplateBase_5, _gitKeepTemplateBase_6, _gitKeepTemplateBase_7, _pomXmlTemplate, _eclipseDotProjectTemplate)));
      }
      _xblockexpression = this.getProject();
    }
    return _xblockexpression;
  }
  
  private boolean isActive() {
    return true;
  }
}
