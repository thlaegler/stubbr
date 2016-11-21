package com.laegler.stubbr.lang.generator;

import com.laegler.stubbr.lang.generator.AbstractProjectGenerator;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.ProjectType;
import com.laegler.stubbr.lang.stubbrLang.ChapterGlobals;
import com.laegler.stubbr.lang.stubbrLang.ChapterPersistence;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
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
import templates._common.settings.EclipseWstProjectFacetCorePrefsTemplateBase;
import templates._common.settings.EclipseWstProjectFacetCoreXmlTemplateBase;
import templates._common.src_main_resource.meta_inf.EjbJarXmlTemplateBase;
import templates._common.src_main_resource.meta_inf.ManifestMfTemplateBase;
import templates._common.src_main_resource.meta_inf.PersistenceXmlTemplateBase;
import templates.persistence.EclipseDotProjectTemplate;
import templates.persistence.PomXmlTemplate;
import templates.persistence.src_main_java.basepack.persistence.service.EntityServiceImplXtendTemplate;
import templates.persistence.src_main_java.basepack.persistence.service.EntityServiceInterfaceXtendTemplate;
import templates.persistence.src_main_java.basepack.persistence.spring.dto.EntitySpringDtoXtendTemplate;
import templates.persistence.src_main_java.basepack.persistence.spring.mapper.EntitySpringMapperXtendTemplate;
import templates.persistence.src_main_java.basepack.persistence.spring.repository.EntitySpringRepositoryXtendTemplate;
import templates.persistence.src_main_java.basepack.persistence.spring.service.EntitySpringServiceImplXtendTemplate;
import templates.persistence.src_main_java.basepack.persistence.spring.service.EntitySpringServiceInterfaceXtendTemplate;
import templates.persistence.src_main_resources.meta_inf.CreateScriptSqlTemplate;

/**
 * Project generator for persistence project
 */
@SuppressWarnings("all")
public class PersistenceProjectGenerator extends AbstractProjectGenerator {
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
      _builder.append("-persistence");
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
      _builder_1.append(".persistence");
      _project_2.setBasePackage(_builder_1.toString());
      Project _project_3 = this.getProject();
      _project_3.setProjectType(ProjectType.PERSISTENCE);
      Project _project_4 = this.getProject();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("/");
      Project _project_5 = this.getProject();
      String _name_1 = _project_5.getName();
      _builder_2.append(_name_1, "");
      _builder_2.append("/");
      _project_4.setRelativePath(_builder_2.toString());
      Project _project_6 = this.getProject();
      _project_6.setCanonicalName("Persistence project");
      Project _project_7 = this.getProject();
      _project_7.setDocumentation("This project is the interface to the physical persistence layer");
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
        EjbJarXmlTemplateBase _ejbJarXmlTemplateBase = new EjbJarXmlTemplateBase(this.stubbr, _project_6);
        Project _project_7 = this.getProject();
        PersistenceXmlTemplateBase _persistenceXmlTemplateBase = new PersistenceXmlTemplateBase(this.stubbr, _project_7);
        Project _project_8 = this.getProject();
        EclipseCoreResourcesPrefsTemplateBase _eclipseCoreResourcesPrefsTemplateBase = new EclipseCoreResourcesPrefsTemplateBase(this.stubbr, _project_8);
        Project _project_9 = this.getProject();
        EclipseJdtCorePrefsTemplateBase _eclipseJdtCorePrefsTemplateBase = new EclipseJdtCorePrefsTemplateBase(this.stubbr, _project_9);
        Project _project_10 = this.getProject();
        EclipseM2eCorePrefsTemplateBase _eclipseM2eCorePrefsTemplateBase = new EclipseM2eCorePrefsTemplateBase(this.stubbr, _project_10);
        Project _project_11 = this.getProject();
        EclipseWstProjectFacetCorePrefsTemplateBase _eclipseWstProjectFacetCorePrefsTemplateBase = new EclipseWstProjectFacetCorePrefsTemplateBase(this.stubbr, _project_11);
        Project _project_12 = this.getProject();
        EclipseWstProjectFacetCoreXmlTemplateBase _eclipseWstProjectFacetCoreXmlTemplateBase = new EclipseWstProjectFacetCoreXmlTemplateBase(this.stubbr, _project_12);
        Project _project_13 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase = new GitKeepTemplateBase(this.stubbr, _project_13, "/src/main/java/");
        Project _project_14 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_1 = new GitKeepTemplateBase(this.stubbr, _project_14, "/src/main/src-gen/");
        Project _project_15 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_2 = new GitKeepTemplateBase(this.stubbr, _project_15, "/src/main/xtend-gen/");
        Project _project_16 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_3 = new GitKeepTemplateBase(this.stubbr, _project_16, "/src/main/resources/");
        Project _project_17 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_4 = new GitKeepTemplateBase(this.stubbr, _project_17, "/src/test/java/");
        Project _project_18 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_5 = new GitKeepTemplateBase(this.stubbr, _project_18, "/src/test/src-gen/");
        Project _project_19 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_6 = new GitKeepTemplateBase(this.stubbr, _project_19, "/src/test/xtend-gen/");
        Project _project_20 = this.getProject();
        GitKeepTemplateBase _gitKeepTemplateBase_7 = new GitKeepTemplateBase(this.stubbr, _project_20, "/src/test/resources/");
        Project _project_21 = this.getProject();
        PomXmlTemplate _pomXmlTemplate = new PomXmlTemplate(this.stubbr, _project_21);
        Project _project_22 = this.getProject();
        EclipseDotProjectTemplate _eclipseDotProjectTemplate = new EclipseDotProjectTemplate(this.stubbr, _project_22);
        _files.addAll(
          Collections.<AbstractTemplate>unmodifiableList(CollectionLiterals.<AbstractTemplate>newArrayList(_readmeMdTemplateBase, _intellijProjectImlFileBase, _dotGitignoreTemplateBase, _eclipseDotClasspathTemplateBase, _manifestMfTemplateBase, _ejbJarXmlTemplateBase, _persistenceXmlTemplateBase, _eclipseCoreResourcesPrefsTemplateBase, _eclipseJdtCorePrefsTemplateBase, _eclipseM2eCorePrefsTemplateBase, _eclipseWstProjectFacetCorePrefsTemplateBase, _eclipseWstProjectFacetCoreXmlTemplateBase, _gitKeepTemplateBase, _gitKeepTemplateBase_1, _gitKeepTemplateBase_2, _gitKeepTemplateBase_3, _gitKeepTemplateBase_4, _gitKeepTemplateBase_5, _gitKeepTemplateBase_6, _gitKeepTemplateBase_7, _pomXmlTemplate, _eclipseDotProjectTemplate)));
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
            Project _project_23 = this.getProject();
            List<AbstractTemplate> _files_1 = null;
            if (_project_23!=null) {
              _files_1=_project_23.getFiles();
            }
            if (_files_1!=null) {
              Project _project_24 = this.getProject();
              EntitySpringServiceInterfaceXtendTemplate _entitySpringServiceInterfaceXtendTemplate = new EntitySpringServiceInterfaceXtendTemplate(this.stubbr, _project_24, entity);
              Project _project_25 = this.getProject();
              EntitySpringServiceImplXtendTemplate _entitySpringServiceImplXtendTemplate = new EntitySpringServiceImplXtendTemplate(this.stubbr, _project_25, entity);
              Project _project_26 = this.getProject();
              EntitySpringMapperXtendTemplate _entitySpringMapperXtendTemplate = new EntitySpringMapperXtendTemplate(this.stubbr, _project_26, entity);
              Project _project_27 = this.getProject();
              EntitySpringDtoXtendTemplate _entitySpringDtoXtendTemplate = new EntitySpringDtoXtendTemplate(this.stubbr, _project_27, entity);
              Project _project_28 = this.getProject();
              EntitySpringRepositoryXtendTemplate _entitySpringRepositoryXtendTemplate = new EntitySpringRepositoryXtendTemplate(this.stubbr, _project_28, entity);
              _files_1.addAll(
                Collections.<AbstractTemplate>unmodifiableList(CollectionLiterals.<AbstractTemplate>newArrayList(_entitySpringServiceInterfaceXtendTemplate, _entitySpringServiceImplXtendTemplate, _entitySpringMapperXtendTemplate, _entitySpringDtoXtendTemplate, _entitySpringRepositoryXtendTemplate)));
            }
          };
          _entities.forEach(_function);
        }
      } else {
        Stubb _stubb_2 = null;
        if (this.stubbr!=null) {
          _stubb_2=this.stubbr.getStubb();
        }
        ChapterPersistence _persistence_1 = null;
        if (_stubb_2!=null) {
          _persistence_1=_stubb_2.getPersistence();
        }
        EList<Entity> _entities_1 = null;
        if (_persistence_1!=null) {
          _entities_1=_persistence_1.getEntities();
        }
        if (_entities_1!=null) {
          final Consumer<Entity> _function_1 = (Entity entity) -> {
            Project _project_23 = this.getProject();
            List<AbstractTemplate> _files_1 = null;
            if (_project_23!=null) {
              _files_1=_project_23.getFiles();
            }
            if (_files_1!=null) {
              Project _project_24 = this.getProject();
              EntityServiceInterfaceXtendTemplate _entityServiceInterfaceXtendTemplate = new EntityServiceInterfaceXtendTemplate(this.stubbr, _project_24, entity);
              Project _project_25 = this.getProject();
              EntityServiceImplXtendTemplate _entityServiceImplXtendTemplate = new EntityServiceImplXtendTemplate(this.stubbr, _project_25, entity);
              _files_1.addAll(
                Collections.<AbstractTemplate>unmodifiableList(CollectionLiterals.<AbstractTemplate>newArrayList(_entityServiceInterfaceXtendTemplate, _entityServiceImplXtendTemplate)));
            }
          };
          _entities_1.forEach(_function_1);
        }
      }
      Project _project_23 = this.getProject();
      List<AbstractTemplate> _files_1 = null;
      if (_project_23!=null) {
        _files_1=_project_23.getFiles();
      }
      if (_files_1!=null) {
        Project _project_24 = this.getProject();
        CreateScriptSqlTemplate _createScriptSqlTemplate = new CreateScriptSqlTemplate(this.stubbr, _project_24);
        _files_1.addAll(
          Collections.<AbstractTemplate>unmodifiableList(CollectionLiterals.<AbstractTemplate>newArrayList(_createScriptSqlTemplate)));
      }
      _xblockexpression = this.getProject();
    }
    return _xblockexpression;
  }
  
  private boolean isActive() {
    return true;
  }
}
