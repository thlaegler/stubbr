package com.laegler.stubbr.lang.generator;

import com.laegler.stubbr.lang.adapter.GherkinAdapter;
import com.laegler.stubbr.lang.generator.AbstractProjectGenerator;
import com.laegler.stubbr.lang.genmodel.FileHelper;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.ProjectType;
import com.laegler.stubbr.lang.stubbrLang.ChapterBehavior;
import com.laegler.stubbr.lang.stubbrLang.ChapterGlobals;
import com.laegler.stubbr.lang.stubbrLang.ChapterPersistence;
import com.laegler.stubbr.lang.stubbrLang.ChapterPresentation;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Feature;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import com.laegler.stubbr.lang.stubbrLang.View;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import templates.AbstractTemplate;
import templates._common.DotGitignoreTemplateBase;
import templates._common.EclipseDotClasspathTemplateBase;
import templates._common.EclipseDotProjectTemplateBase;
import templates._common.GitKeepTemplateBase;
import templates._common.IntellijProjectImlFileBase;
import templates._common.ReadmeMdTemplateBase;
import templates._common.settings.EclipseCoreResourcesPrefsTemplateBase;
import templates._common.settings.EclipseJdtCorePrefsTemplateBase;
import templates._common.settings.EclipseM2eCorePrefsTemplateBase;
import templates._common.settings.EclipseWstProjectFacetCorePrefsTemplateBase;
import templates._common.settings.EclipseWstProjectFacetCoreXmlTemplateBase;
import templates._common.src_main_resource.meta_inf.EjbJarXmlTemplateBase;
import templates._common.src_main_resource.meta_inf.ManifestMfTemplateBase;
import templates._common.src_main_resource.meta_inf.PersistenceXmlTemplateBase;
import templates._common.src_main_webapp.web_inf.FacesConfigXmlTemplateBase;
import templates._common.src_main_webapp.web_inf.WebXmlTemplateBase;
import templates.faces.EclipseDotProjectTemplate;
import templates.faces.PomXmlTemplate;
import templates.faces.src_main_java.basepack.faces.SpringAppXtendTemplate;
import templates.faces.src_main_java.basepack.faces.SpringWebXmlXtendTemplate;
import templates.faces.src_main_java.basepack.faces.bean.AbstractViewBeanXtendTemplate;
import templates.faces.src_main_java.basepack.faces.bean.EntityViewBeanXtendTemplate;
import templates.faces.src_main_java.basepack.faces.presenter.AbstractPresenterXtendTemplate;
import templates.faces.src_main_java.basepack.faces.presenter.EntityPresenterXtendTemplate;
import templates.faces.src_main_java.basepack.faces.presenter.ViewPresenterXtendTemplate;
import templates.faces.src_main_webapp.IndexHtmlTemplate;
import templates.faces.src_main_webapp.IndexXhtmlTemplate;
import templates.faces.src_main_webapp.desktop.EntityDetailsDesktopXhtmlTemplate;
import templates.faces.src_main_webapp.desktop.EntityListDesktopXhtmlTemplate;
import templates.faces.src_main_webapp.desktop.IndexDesktopXhtmlTemplate;
import templates.faces.src_main_webapp.mobile.EntityDetailsMobileXhtmlTemplate;
import templates.faces.src_main_webapp.mobile.EntityListMobileXhtmlTemplate;
import templates.faces.src_main_webapp.mobile.IndexMobileXhtmlTemplate;
import templates.faces.src_test_java_basepack.faces.BehaviorFeatureDirectTemplate;
import templates.faces.src_test_java_basepack.faces.BehaviorFeatureStepsXtendDirectTemplate;
import templates.faces.src_test_java_basepack.faces.BehaviorFeatureStepsXtendTemplate;
import templates.faces.src_test_java_basepack.faces.BehaviorFeatureTemplate;

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
        EclipseDotProjectTemplateBase _eclipseDotProjectTemplateBase = new EclipseDotProjectTemplateBase(this.stubbr, _project_5);
        Project _project_6 = this.getProject();
        ManifestMfTemplateBase _manifestMfTemplateBase = new ManifestMfTemplateBase(this.stubbr, _project_6);
        Project _project_7 = this.getProject();
        EjbJarXmlTemplateBase _ejbJarXmlTemplateBase = new EjbJarXmlTemplateBase(this.stubbr, _project_7);
        Project _project_8 = this.getProject();
        PersistenceXmlTemplateBase _persistenceXmlTemplateBase = new PersistenceXmlTemplateBase(this.stubbr, _project_8);
        Project _project_9 = this.getProject();
        EclipseCoreResourcesPrefsTemplateBase _eclipseCoreResourcesPrefsTemplateBase = new EclipseCoreResourcesPrefsTemplateBase(this.stubbr, _project_9);
        Project _project_10 = this.getProject();
        EclipseJdtCorePrefsTemplateBase _eclipseJdtCorePrefsTemplateBase = new EclipseJdtCorePrefsTemplateBase(this.stubbr, _project_10);
        Project _project_11 = this.getProject();
        EclipseM2eCorePrefsTemplateBase _eclipseM2eCorePrefsTemplateBase = new EclipseM2eCorePrefsTemplateBase(this.stubbr, _project_11);
        Project _project_12 = this.getProject();
        EclipseWstProjectFacetCorePrefsTemplateBase _eclipseWstProjectFacetCorePrefsTemplateBase = new EclipseWstProjectFacetCorePrefsTemplateBase(this.stubbr, _project_12);
        Project _project_13 = this.getProject();
        EclipseWstProjectFacetCoreXmlTemplateBase _eclipseWstProjectFacetCoreXmlTemplateBase = new EclipseWstProjectFacetCoreXmlTemplateBase(this.stubbr, _project_13);
        Project _project_14 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase = new GitKeepTemplateBase(this.stubbr, _project_14, "/src/main/java/");
        Project _project_15 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_1 = new GitKeepTemplateBase(this.stubbr, _project_15, "/src/main/src-gen/");
        Project _project_16 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_2 = new GitKeepTemplateBase(this.stubbr, _project_16, "/src/main/xtend-gen/");
        Project _project_17 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_3 = new GitKeepTemplateBase(this.stubbr, _project_17, "/src/main/resources/");
        Project _project_18 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_4 = new GitKeepTemplateBase(this.stubbr, _project_18, "/src/test/java/");
        Project _project_19 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_5 = new GitKeepTemplateBase(this.stubbr, _project_19, "/src/test/src-gen/");
        Project _project_20 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_6 = new GitKeepTemplateBase(this.stubbr, _project_20, "/src/test/xtend-gen/");
        Project _project_21 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_7 = new GitKeepTemplateBase(this.stubbr, _project_21, "/src/test/resources/");
        Project _project_22 = this.getProject();
        PomXmlTemplate _pomXmlTemplate = new PomXmlTemplate(this.stubbr, _project_22);
        Project _project_23 = this.getProject();
        EclipseDotProjectTemplate _eclipseDotProjectTemplate = new EclipseDotProjectTemplate(this.stubbr, _project_23);
        Project _project_24 = this.getProject();
        WebXmlTemplateBase _webXmlTemplateBase = new WebXmlTemplateBase(this.stubbr, _project_24);
        Project _project_25 = this.getProject();
        FacesConfigXmlTemplateBase _facesConfigXmlTemplateBase = new FacesConfigXmlTemplateBase(this.stubbr, _project_25);
        Project _project_26 = this.getProject();
        IndexDesktopXhtmlTemplate _indexDesktopXhtmlTemplate = new IndexDesktopXhtmlTemplate(this.stubbr, _project_26);
        Project _project_27 = this.getProject();
        IndexMobileXhtmlTemplate _indexMobileXhtmlTemplate = new IndexMobileXhtmlTemplate(this.stubbr, _project_27);
        Project _project_28 = this.getProject();
        IndexHtmlTemplate _indexHtmlTemplate = new IndexHtmlTemplate(this.stubbr, _project_28);
        Project _project_29 = this.getProject();
        IndexXhtmlTemplate _indexXhtmlTemplate = new IndexXhtmlTemplate(this.stubbr, _project_29);
        Project _project_30 = this.getProject();
        AbstractPresenterXtendTemplate _abstractPresenterXtendTemplate = new AbstractPresenterXtendTemplate(this.stubbr, _project_30);
        Project _project_31 = this.getProject();
        AbstractViewBeanXtendTemplate _abstractViewBeanXtendTemplate = new AbstractViewBeanXtendTemplate(this.stubbr, _project_31);
        _files.addAll(
          Collections.<AbstractTemplate>unmodifiableList(CollectionLiterals.<AbstractTemplate>newArrayList(_readmeMdTemplateBase, _intellijProjectImlFileBase, _dotGitignoreTemplateBase, _eclipseDotClasspathTemplateBase, _eclipseDotProjectTemplateBase, _manifestMfTemplateBase, _ejbJarXmlTemplateBase, _persistenceXmlTemplateBase, _eclipseCoreResourcesPrefsTemplateBase, _eclipseJdtCorePrefsTemplateBase, _eclipseM2eCorePrefsTemplateBase, _eclipseWstProjectFacetCorePrefsTemplateBase, _eclipseWstProjectFacetCoreXmlTemplateBase, _gitKeepTemplateBase, _gitKeepTemplateBase_1, _gitKeepTemplateBase_2, _gitKeepTemplateBase_3, _gitKeepTemplateBase_4, _gitKeepTemplateBase_5, _gitKeepTemplateBase_6, _gitKeepTemplateBase_7, _pomXmlTemplate, _eclipseDotProjectTemplate, _webXmlTemplateBase, _facesConfigXmlTemplateBase, _indexDesktopXhtmlTemplate, _indexMobileXhtmlTemplate, _indexHtmlTemplate, _indexXhtmlTemplate, _abstractPresenterXtendTemplate, _abstractViewBeanXtendTemplate)));
      }
      Stubb _stubb = null;
      if (this.stubbr!=null) {
        _stubb=this.stubbr.getStubb();
      }
      ChapterGlobals _globals = null;
      if (_stubb!=null) {
        _globals=_stubb.getGlobals();
      }
      boolean _isUseSpringMVC = _globals.isUseSpringMVC();
      if (_isUseSpringMVC) {
        Project _project_32 = this.getProject();
        List<AbstractTemplate> _files_1 = null;
        if (_project_32!=null) {
          _files_1=_project_32.getFiles();
        }
        if (_files_1!=null) {
          Project _project_33 = this.getProject();
          SpringAppXtendTemplate _springAppXtendTemplate = new SpringAppXtendTemplate(this.stubbr, _project_33);
          Project _project_34 = this.getProject();
          SpringWebXmlXtendTemplate _springWebXmlXtendTemplate = new SpringWebXmlXtendTemplate(this.stubbr, _project_34);
          _files_1.addAll(
            Collections.<AbstractTemplate>unmodifiableList(CollectionLiterals.<AbstractTemplate>newArrayList(_springAppXtendTemplate, _springWebXmlXtendTemplate)));
        }
      }
      Stubb _stubb_1 = null;
      if (this.stubbr!=null) {
        _stubb_1=this.stubbr.getStubb();
      }
      ChapterPersistence _persistence = null;
      if (_stubb_1!=null) {
        _persistence=_stubb_1.getPersistence();
      }
      EList<Entity> _entities = null;
      if (_persistence!=null) {
        _entities=_persistence.getEntities();
      }
      if (_entities!=null) {
        final Consumer<Entity> _function = (Entity entity) -> {
          Project _project_35 = this.getProject();
          List<AbstractTemplate> _files_2 = null;
          if (_project_35!=null) {
            _files_2=_project_35.getFiles();
          }
          if (_files_2!=null) {
            Project _project_36 = this.getProject();
            EntityPresenterXtendTemplate _entityPresenterXtendTemplate = new EntityPresenterXtendTemplate(this.stubbr, _project_36, entity);
            Project _project_37 = this.getProject();
            EntityViewBeanXtendTemplate _entityViewBeanXtendTemplate = new EntityViewBeanXtendTemplate(this.stubbr, _project_37, entity);
            Project _project_38 = this.getProject();
            EntityListDesktopXhtmlTemplate _entityListDesktopXhtmlTemplate = new EntityListDesktopXhtmlTemplate(this.stubbr, _project_38, entity);
            Project _project_39 = this.getProject();
            EntityDetailsDesktopXhtmlTemplate _entityDetailsDesktopXhtmlTemplate = new EntityDetailsDesktopXhtmlTemplate(this.stubbr, _project_39, entity);
            Project _project_40 = this.getProject();
            EntityListMobileXhtmlTemplate _entityListMobileXhtmlTemplate = new EntityListMobileXhtmlTemplate(this.stubbr, _project_40, entity);
            Project _project_41 = this.getProject();
            EntityDetailsMobileXhtmlTemplate _entityDetailsMobileXhtmlTemplate = new EntityDetailsMobileXhtmlTemplate(this.stubbr, _project_41, entity);
            _files_2.addAll(
              Collections.<AbstractTemplate>unmodifiableList(CollectionLiterals.<AbstractTemplate>newArrayList(_entityPresenterXtendTemplate, _entityViewBeanXtendTemplate, _entityListDesktopXhtmlTemplate, _entityDetailsDesktopXhtmlTemplate, _entityListMobileXhtmlTemplate, _entityDetailsMobileXhtmlTemplate)));
          }
        };
        _entities.forEach(_function);
      }
      Stubb _stubb_2 = null;
      if (this.stubbr!=null) {
        _stubb_2=this.stubbr.getStubb();
      }
      ChapterPresentation _presentation = null;
      if (_stubb_2!=null) {
        _presentation=_stubb_2.getPresentation();
      }
      EList<View> _views = null;
      if (_presentation!=null) {
        _views=_presentation.getViews();
      }
      if (_views!=null) {
        final Consumer<View> _function_1 = (View view) -> {
          Project _project_35 = this.getProject();
          List<AbstractTemplate> _files_2 = null;
          if (_project_35!=null) {
            _files_2=_project_35.getFiles();
          }
          if (_files_2!=null) {
            Project _project_36 = this.getProject();
            ViewPresenterXtendTemplate _viewPresenterXtendTemplate = new ViewPresenterXtendTemplate(this.stubbr, _project_36, view);
            _files_2.addAll(
              Collections.<AbstractTemplate>unmodifiableList(CollectionLiterals.<AbstractTemplate>newArrayList(_viewPresenterXtendTemplate)));
          }
        };
        _views.forEach(_function_1);
      }
      Stubb _stubb_3 = null;
      if (this.stubbr!=null) {
        _stubb_3=this.stubbr.getStubb();
      }
      ChapterBehavior _behavior = null;
      if (_stubb_3!=null) {
        _behavior=_stubb_3.getBehavior();
      }
      EList<Feature> _features = null;
      if (_behavior!=null) {
        _features=_behavior.getFeatures();
      }
      if (_features!=null) {
        final Consumer<Feature> _function_2 = (Feature feature) -> {
          Project _project_35 = this.getProject();
          List<AbstractTemplate> _files_2 = null;
          if (_project_35!=null) {
            _files_2=_project_35.getFiles();
          }
          if (_files_2!=null) {
            Project _project_36 = this.getProject();
            BehaviorFeatureTemplate _behaviorFeatureTemplate = new BehaviorFeatureTemplate(this.stubbr, _project_36, feature);
            _files_2.add(_behaviorFeatureTemplate);
          }
          Project _project_37 = this.getProject();
          List<AbstractTemplate> _files_3 = null;
          if (_project_37!=null) {
            _files_3=_project_37.getFiles();
          }
          if (_files_3!=null) {
            Project _project_38 = this.getProject();
            BehaviorFeatureStepsXtendTemplate _behaviorFeatureStepsXtendTemplate = new BehaviorFeatureStepsXtendTemplate(this.stubbr, _project_38, feature);
            _files_3.add(_behaviorFeatureStepsXtendTemplate);
          }
        };
        _features.forEach(_function_2);
      }
      Stubb _stubb_4 = null;
      if (this.stubbr!=null) {
        _stubb_4=this.stubbr.getStubb();
      }
      ChapterBehavior _behavior_1 = null;
      if (_stubb_4!=null) {
        _behavior_1=_stubb_4.getBehavior();
      }
      EList<String> _specifications = null;
      if (_behavior_1!=null) {
        _specifications=_behavior_1.getSpecifications();
      }
      if (_specifications!=null) {
        final Consumer<String> _function_3 = (String specification) -> {
          final Feature feature = this.gherkinAdapter.parseToFeature(specification);
          Project _project_35 = this.getProject();
          List<AbstractTemplate> _files_2 = null;
          if (_project_35!=null) {
            _files_2=_project_35.getFiles();
          }
          if (_files_2!=null) {
            Project _project_36 = this.getProject();
            File _findFile = this.fileHelper.findFile(specification);
            String _fileContent = this.fileHelper.getFileContent(_findFile);
            BehaviorFeatureDirectTemplate _behaviorFeatureDirectTemplate = new BehaviorFeatureDirectTemplate(this.stubbr, _project_36, feature, _fileContent);
            Project _project_37 = this.getProject();
            Project _project_38 = this.getProject();
            String _generate = this.gherkinAdapter.generate(_project_38, specification);
            BehaviorFeatureStepsXtendDirectTemplate _behaviorFeatureStepsXtendDirectTemplate = new BehaviorFeatureStepsXtendDirectTemplate(this.stubbr, _project_37, feature, _generate);
            _files_2.addAll(
              Collections.<AbstractTemplate>unmodifiableList(CollectionLiterals.<AbstractTemplate>newArrayList(_behaviorFeatureDirectTemplate, _behaviorFeatureStepsXtendDirectTemplate)));
          }
        };
        _specifications.forEach(_function_3);
      }
      _xblockexpression = this.getProject();
    }
    return _xblockexpression;
  }
  
  private boolean isActive() {
    return true;
  }
}
