package com.laegler.stubbr.lang.generator

import com.laegler.stubbr.lang.adapter.GherkinAdapter
import com.laegler.stubbr.lang.genmodel.FileHelper
import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.ProjectType
import com.laegler.stubbr.lang.stubbrLang.Feature
import javax.inject.Inject
import templates._common.DotGitignoreTemplateBase
import templates._common.EclipseDotClasspathTemplateBase
import templates._common.EclipseDotProjectTemplateBase
import templates._common.IntellijProjectImlFileBase
import templates._common.ReadmeMdTemplateBase
import templates._common.settings.EclipseCoreResourcesPrefsTemplateBase
import templates._common.settings.EclipseJdtCorePrefsTemplateBase
import templates._common.settings.EclipseM2eCorePrefsTemplateBase
import templates._common.settings.EclipseWstProjectFacetCorePrefsTemplateBase
import templates._common.settings.EclipseWstProjectFacetCoreXmlTemplateBase
import templates._common.src_main_resource.meta_inf.EjbJarXmlTemplateBase
import templates._common.src_main_resource.meta_inf.ManifestMfTemplateBase
import templates._common.src_main_resource.meta_inf.PersistenceXmlTemplateBase
import templates._common.src_main_webapp.web_inf.FacesConfigXmlTemplateBase
import templates._common.src_main_webapp.web_inf.WebXmlTemplateBase
import templates.faces.PomXmlTemplate
import templates.faces.src_main_java.basepack.faces.SpringAppXtendTemplate
import templates.faces.src_main_java.basepack.faces.SpringWebXmlXtendTemplate
import templates.faces.src_main_java.basepack.faces.presenter.AbstractPresenterXtendTemplate
import templates.faces.src_main_java.basepack.faces.presenter.EntityPresenterXtendTemplate
import templates.faces.src_main_java.basepack.faces.presenter.ViewPresenterXtendTemplate
import templates.faces.src_main_webapp.IndexHtmlTemplate
import templates.faces.src_main_webapp.IndexXhtmlTemplate
import templates.faces.src_main_webapp.desktop.EntityDetailsDesktopXhtmlTemplate
import templates.faces.src_main_webapp.desktop.EntityListDesktopXhtmlTemplate
import templates.faces.src_main_webapp.desktop.IndexDesktopXhtmlTemplate
import templates.faces.src_main_webapp.mobile.EntityDetailsMobileXhtmlTemplate
import templates.faces.src_main_webapp.mobile.EntityListMobileXhtmlTemplate
import templates.faces.src_main_webapp.mobile.IndexMobileXhtmlTemplate
import templates.faces.src_test_java_basepack.faces.BehaviorFeatureStepsXtendTemplate
import templates.faces.src_test_java_basepack.faces.BehaviorFeatureTemplate
import templates.faces.src_main_java.basepack.faces.bean.EntityViewBeanXtendTemplate
import templates.faces.src_main_java.basepack.faces.bean.AbstractViewBeanXtendTemplate
import templates._common.GitKeepTemplateBase
import templates.faces.EclipseDotProjectTemplate

/**
 * Project Generator for JSF/Faces Project
 */
class FacesProjectGenerator extends AbstractProjectGenerator {

	@Inject FileHelper fileHelper
	@Inject GherkinAdapter gherkinAdapter

	private def void initProject() {
		if (active) {
			project = new Project(stubbr)
			project.name = '''«stubbr?.stubb?.name?.toLowerCase»-faces'''
			project.basePackage = '''«stubbr?.stubb?.packageName?.toLowerCase».faces'''
			project.projectType = ProjectType.FACES
			project.relativePath = '''/«project?.name»/'''
			project.canonicalName = 'JSF/Faces project'
			project.documentation = 'This project provides JSF/Faces UI layer'
			log.info('''Generating Project: «project?.name»''')
		}
	}

	/**
	 * Generate persistence project	
	 */
	override public def prepare() {
		initProject

		project?.files?.addAll(#[
			// General templates
			new ReadmeMdTemplateBase(stubbr, project),
			new IntellijProjectImlFileBase(stubbr, project),
			new DotGitignoreTemplateBase(stubbr, project),
			new EclipseDotClasspathTemplateBase(stubbr, project),
			new EclipseDotProjectTemplateBase(stubbr, project),
			new ManifestMfTemplateBase(stubbr, project),
			new EjbJarXmlTemplateBase(stubbr, project),
			new PersistenceXmlTemplateBase(stubbr, project),
			// Eclipse templates
			new EclipseCoreResourcesPrefsTemplateBase(stubbr, project),
			new EclipseJdtCorePrefsTemplateBase(stubbr, project),
			new EclipseM2eCorePrefsTemplateBase(stubbr, project),
			new EclipseWstProjectFacetCorePrefsTemplateBase(stubbr, project),
			new EclipseWstProjectFacetCoreXmlTemplateBase(stubbr, project),
			new GitKeepTemplateBase(stubbr, project, '/src/main/java/'),
			new GitKeepTemplateBase(stubbr, project, '/src/main/src-gen/'),
			new GitKeepTemplateBase(stubbr, project, '/src/main/xtend-gen/'),
			new GitKeepTemplateBase(stubbr, project, '/src/main/resources/'),
			new GitKeepTemplateBase(stubbr, project, '/src/test/java/'),
			new GitKeepTemplateBase(stubbr, project, '/src/test/src-gen/'),
			new GitKeepTemplateBase(stubbr, project, '/src/test/xtend-gen/'),
			new GitKeepTemplateBase(stubbr, project, '/src/test/resources/'),
			// Project-specific singular templates
			new PomXmlTemplate(stubbr, project),
			new EclipseDotProjectTemplate(stubbr, project),
			new WebXmlTemplateBase(stubbr, project),
			new FacesConfigXmlTemplateBase(stubbr, project),
			new IndexDesktopXhtmlTemplate(stubbr, project),
			new IndexMobileXhtmlTemplate(stubbr, project),
			new IndexHtmlTemplate(stubbr, project),
			new IndexXhtmlTemplate(stubbr, project),
			new AbstractPresenterXtendTemplate(stubbr, project),
			new AbstractViewBeanXtendTemplate(stubbr, project)
		])
		
		// Spring MVC
		if(stubbr?.stubb?.globals.useSpringMVC) {
			project?.files?.addAll(#[
				new SpringAppXtendTemplate(stubbr, project),
				new SpringWebXmlXtendTemplate(stubbr, project)
			])
		}

		// Entity-specific templates
		stubbr?.stubb?.persistence?.entities?.forEach [ entity |
			project?.files?.addAll(#[
				new EntityPresenterXtendTemplate(stubbr, project, entity),
				new EntityViewBeanXtendTemplate(stubbr, project, entity),
				new EntityListDesktopXhtmlTemplate(stubbr, project, entity),
				new EntityDetailsDesktopXhtmlTemplate(stubbr, project, entity),
				new EntityListMobileXhtmlTemplate(stubbr, project, entity),
				new EntityDetailsMobileXhtmlTemplate(stubbr, project, entity)
			])
		]

		stubbr?.stubb?.presentation?.views?.forEach [ view |
			project?.files?.addAll(#[
				new ViewPresenterXtendTemplate(stubbr, project, view)
//				new ViewListDesktopXhtmlTemplate(stubbr, project, view),
//				new ViewDetailsDesktopXhtmlTemplate(stubbr, project, view),
//				new ViewListMobileXhtmlTemplate(stubbr, project, view),
//				new ViewDetailsMobileXhtmlTemplate(stubbr, project, view)
			])
		]

		stubbr?.stubb?.behavior?.features?.forEach [ feature |
			project?.files?.add(new BehaviorFeatureTemplate(stubbr, project, feature))
			project?.files?.add(new BehaviorFeatureStepsXtendTemplate(stubbr, project, feature))
		]

		stubbr?.stubb?.behavior?.specifications?.forEach [ specification |
			val Feature feature = gherkinAdapter.parseToFeature(specification)
			project?.files?.add(new BehaviorFeatureTemplate(stubbr, project, feature) => [
				content = fileHelper.getFileContent(fileHelper.findFile(specification))
			])
			project?.files?.add(new BehaviorFeatureStepsXtendTemplate(stubbr, project, feature) => [
				content = gherkinAdapter.generate(project, specification)
			])
		]

		project
	}

	private def boolean isActive() {
//		stubbr?.stubb?.presentation?.uiFramework == UiFramework.JSF
		true
	}

}
