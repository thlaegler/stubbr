/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.generator;

import com.laegler.stubbr.lang.generator.BusinessProjectGenerator;
import com.laegler.stubbr.lang.generator.CommonProjectGenerator;
import com.laegler.stubbr.lang.generator.EarProjectGenerator;
import com.laegler.stubbr.lang.generator.FacesProjectGenerator;
import com.laegler.stubbr.lang.generator.ModelProjectGenerator;
import com.laegler.stubbr.lang.generator.ParentProjectGenerator;
import com.laegler.stubbr.lang.generator.PersistenceProjectGenerator;
import com.laegler.stubbr.lang.generator.SoapClientProjectGenerator;
import com.laegler.stubbr.lang.generator.SoapServerProjectGenerator;
import com.laegler.stubbr.lang.generator.SwaggerProjectGenerator;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.genmodel.TemplateProvider;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import templates.AbstractTemplate;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class StubbrLangGenerator implements IGenerator2 {
  @Inject
  private StubbrRegistry stubbr;
  
  @Inject
  private ParentProjectGenerator parentProject;
  
  @Inject
  private CommonProjectGenerator commonProject;
  
  @Inject
  private ModelProjectGenerator modelProject;
  
  @Inject
  private PersistenceProjectGenerator persistenceProject;
  
  @Inject
  private BusinessProjectGenerator businessProject;
  
  @Inject
  private FacesProjectGenerator facesProject;
  
  @Inject
  private SwaggerProjectGenerator swaggerProject;
  
  @Inject
  private SoapServerProjectGenerator soapServerProject;
  
  @Inject
  private SoapClientProjectGenerator soapClientProject;
  
  @Inject
  private EarProjectGenerator earProject;
  
  @Inject
  private TemplateProvider templateProvider;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EList<EObject> _contents = input.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Stubb stubb = ((Stubb) _head);
    ArrayList<Project> _arrayList = new ArrayList<Project>();
    this.stubbr.setProjects(_arrayList);
    this.stubbr.setFsa(fsa);
    this.stubbr.setStubb(stubb);
    List<Project> _projects = null;
    if (this.stubbr!=null) {
      _projects=this.stubbr.getProjects();
    }
    if (_projects!=null) {
      Project _prepare = this.parentProject.prepare();
      Project _prepare_1 = this.commonProject.prepare();
      Project _prepare_2 = this.modelProject.prepare();
      Project _prepare_3 = this.persistenceProject.prepare();
      Project _prepare_4 = this.businessProject.prepare();
      Project _prepare_5 = this.facesProject.prepare();
      Project _prepare_6 = this.soapServerProject.prepare();
      Project _prepare_7 = this.soapClientProject.prepare();
      Project _prepare_8 = this.earProject.prepare();
      _projects.addAll(
        Collections.<Project>unmodifiableList(CollectionLiterals.<Project>newArrayList(_prepare, _prepare_1, _prepare_2, _prepare_3, _prepare_4, _prepare_5, _prepare_6, _prepare_7, _prepare_8)));
    }
    List<Project> _projects_1 = null;
    if (this.stubbr!=null) {
      _projects_1=this.stubbr.getProjects();
    }
    if (_projects_1!=null) {
      List<Project> _prepareMulti = this.swaggerProject.prepareMulti();
      _projects_1.addAll(_prepareMulti);
    }
    List<Project> _projects_2 = null;
    if (this.stubbr!=null) {
      _projects_2=this.stubbr.getProjects();
    }
    if (_projects_2!=null) {
      final Consumer<Project> _function = (Project project) -> {
        List<AbstractTemplate> _files = null;
        if (project!=null) {
          _files=project.getFiles();
        }
        if (_files!=null) {
          final Consumer<AbstractTemplate> _function_1 = (AbstractTemplate template) -> {
            this.templateProvider.generateFile(template);
          };
          _files.forEach(_function_1);
        }
      };
      _projects_2.forEach(_function);
    }
  }
  
  @Override
  public void beforeGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
  
  @Override
  public void afterGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
}