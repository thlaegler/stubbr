package com.laegler.stubbr.lang.generator;

import com.laegler.stubbr.lang.adapter.SwaggerAdapter;
import com.laegler.stubbr.lang.generator.AbstractProjectGenerator;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.ProjectType;
import com.laegler.stubbr.lang.stubbrLang.ChapterWebservice;
import com.laegler.stubbr.lang.stubbrLang.RestLanguage;
import com.laegler.stubbr.lang.stubbrLang.RestWebservice;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import com.laegler.stubbr.lang.stubbrLang.Webservice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import templates.AbstractTemplate;
import templates._common.DotGitignoreTemplateBase;
import templates._common.EclipseDotClasspathTemplateBase;
import templates._common.EclipseDotProjectTemplateBase;
import templates._common.IntellijProjectImlFileBase;
import templates._common.ReadmeMdTemplateBase;
import templates._common.settings.EclipseCoreResourcesPrefsTemplateBase;
import templates._common.settings.EclipseJdtCorePrefsTemplateBase;
import templates._common.settings.EclipseM2eCorePrefsTemplateBase;
import templates._common.settings.EclipseWstProjectFacetCorePrefsTemplateBase;
import templates._common.settings.EclipseWstProjectFacetCoreXmlTemplateBase;
import templates._common.src_main_resource.meta_inf.ManifestMfTemplateBase;

/**
 * Project generator for Swagger-based REST projects (multiple!)
 */
@SuppressWarnings("all")
public class SwaggerProjectGenerator extends AbstractProjectGenerator {
  @Inject
  private SwaggerAdapter swaggerAdapter;
  
  @Accessors
  private String clientOrServer;
  
  private void initProject(final RestWebservice webservice, final RestLanguage language) {
    boolean _isActive = this.isActive();
    if (_isActive) {
      Project _project = new Project(this.stubbr);
      this.setProject(_project);
      String _name = language.getName();
      boolean _contains = _name.contains("CLIENT");
      if (_contains) {
        Project _project_1 = this.getProject();
        _project_1.setProjectType(ProjectType.REST_CLIENT);
        this.clientOrServer = "client";
      } else {
        Project _project_2 = this.getProject();
        _project_2.setProjectType(ProjectType.REST_SERVER);
        this.clientOrServer = "server";
      }
      Project _project_3 = this.getProject();
      StringConcatenation _builder = new StringConcatenation();
      Stubb _stubb = null;
      if (this.stubbr!=null) {
        _stubb=this.stubbr.getStubb();
      }
      String _name_1 = null;
      if (_stubb!=null) {
        _name_1=_stubb.getName();
      }
      String _lowerCase = null;
      if (_name_1!=null) {
        _lowerCase=_name_1.toLowerCase();
      }
      _builder.append(_lowerCase, "");
      _builder.append("-rest-");
      _builder.append(this.clientOrServer, "");
      _builder.append("-");
      _builder.append(language, "");
      _project_3.setName(_builder.toString());
      Project _project_4 = this.getProject();
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
      _builder_1.append(".rest.");
      _builder_1.append(this.clientOrServer, "");
      _builder_1.append(".");
      _builder_1.append(language, "");
      _project_4.setBasePackage(_builder_1.toString());
      Project _project_5 = this.getProject();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("/");
      Project _project_6 = this.getProject();
      String _name_2 = null;
      if (_project_6!=null) {
        _name_2=_project_6.getName();
      }
      _builder_2.append(_name_2, "");
      _builder_2.append("/");
      _project_5.setRelativePath(_builder_2.toString());
      Project _project_7 = this.getProject();
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("RESTful ");
      _builder_3.append(this.clientOrServer, "");
      _builder_3.append(" for language ");
      _builder_3.append(language, "");
      _project_7.setCanonicalName(_builder_3.toString());
      Project _project_8 = this.getProject();
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("This project holds the RESTful ");
      _builder_4.append(this.clientOrServer, "");
      _builder_4.append(" for language ");
      _builder_4.append(language, "");
      _project_8.setDocumentation(_builder_4.toString());
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("Generating Project: ");
      Project _project_9 = this.getProject();
      String _name_3 = null;
      if (_project_9!=null) {
        _name_3=_project_9.getName();
      }
      _builder_5.append(_name_3, "");
      this.log.info(_builder_5.toString());
    }
  }
  
  /**
   * Generate persistence project
   */
  @Override
  public Project prepare() {
    throw new RuntimeException("Not implemented. Use prepare Multi instead");
  }
  
  public List<Project> prepareMulti() {
    List<Project> _xblockexpression = null;
    {
      final List<Project> projects = new ArrayList<Project>();
      Stubb _stubb = null;
      if (this.stubbr!=null) {
        _stubb=this.stubbr.getStubb();
      }
      ChapterWebservice _webservice = null;
      if (_stubb!=null) {
        _webservice=_stubb.getWebservice();
      }
      EList<Webservice> _webservices = null;
      if (_webservice!=null) {
        _webservices=_webservice.getWebservices();
      }
      if (_webservices!=null) {
        final Consumer<Webservice> _function = (Webservice webservice) -> {
          if ((webservice instanceof RestWebservice)) {
            EList<RestLanguage> _languages = null;
            if (((RestWebservice)webservice)!=null) {
              _languages=((RestWebservice)webservice).getLanguages();
            }
            if (_languages!=null) {
              final Consumer<RestLanguage> _function_1 = (RestLanguage language) -> {
                this.initProject(((RestWebservice)webservice), language);
                HashMap<String, Object> _hashMap = new HashMap<String, Object>();
                final Procedure1<HashMap<String, Object>> _function_2 = (HashMap<String, Object> it) -> {
                  it.put("language", language);
                  Project _project = this.getProject();
                  String _relativePath = _project.getRelativePath();
                  it.put("outputLocation", _relativePath);
                };
                final Map<String, Object> params = ObjectExtensions.<HashMap<String, Object>>operator_doubleArrow(_hashMap, _function_2);
                Project _project = this.getProject();
                String _specification = ((RestWebservice)webservice).getSpecification();
                this.swaggerAdapter.generate(_project, _specification, params);
                Project _project_1 = this.getProject();
                List<AbstractTemplate> _files = null;
                if (_project_1!=null) {
                  _files=_project_1.getFiles();
                }
                if (_files!=null) {
                  Project _project_2 = this.getProject();
                  ReadmeMdTemplateBase _readmeMdTemplateBase = new ReadmeMdTemplateBase(this.stubbr, _project_2);
                  Project _project_3 = this.getProject();
                  IntellijProjectImlFileBase _intellijProjectImlFileBase = new IntellijProjectImlFileBase(this.stubbr, _project_3);
                  Project _project_4 = this.getProject();
                  DotGitignoreTemplateBase _dotGitignoreTemplateBase = new DotGitignoreTemplateBase(this.stubbr, _project_4);
                  Project _project_5 = this.getProject();
                  EclipseDotClasspathTemplateBase _eclipseDotClasspathTemplateBase = new EclipseDotClasspathTemplateBase(this.stubbr, _project_5);
                  Project _project_6 = this.getProject();
                  EclipseDotProjectTemplateBase _eclipseDotProjectTemplateBase = new EclipseDotProjectTemplateBase(this.stubbr, _project_6);
                  Project _project_7 = this.getProject();
                  ManifestMfTemplateBase _manifestMfTemplateBase = new ManifestMfTemplateBase(this.stubbr, _project_7);
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
                  _files.addAll(
                    Collections.<AbstractTemplate>unmodifiableList(CollectionLiterals.<AbstractTemplate>newArrayList(_readmeMdTemplateBase, _intellijProjectImlFileBase, _dotGitignoreTemplateBase, _eclipseDotClasspathTemplateBase, _eclipseDotProjectTemplateBase, _manifestMfTemplateBase, _eclipseCoreResourcesPrefsTemplateBase, _eclipseJdtCorePrefsTemplateBase, _eclipseM2eCorePrefsTemplateBase, _eclipseWstProjectFacetCorePrefsTemplateBase, _eclipseWstProjectFacetCoreXmlTemplateBase)));
                }
                Project _project_13 = this.getProject();
                projects.add(_project_13);
              };
              _languages.forEach(_function_1);
            }
          }
        };
        _webservices.forEach(_function);
      }
      _xblockexpression = projects;
    }
    return _xblockexpression;
  }
  
  private boolean isActive() {
    return true;
  }
  
  @Pure
  public String getClientOrServer() {
    return this.clientOrServer;
  }
  
  public void setClientOrServer(final String clientOrServer) {
    this.clientOrServer = clientOrServer;
  }
}
