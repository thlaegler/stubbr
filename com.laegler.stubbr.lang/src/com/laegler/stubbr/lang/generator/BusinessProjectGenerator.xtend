package com.laegler.stubbr.lang.generator

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.ProjectType
import templates._common.IntellijProjectImlFileBase
import templates._common.EclipseDotClasspathTemplateBase
import templates._common.DotGitignoreTemplateBase
import templates._common.ReadmeMdTemplateBase
import templates._common.settings.EclipseWstProjectFacetCoreXmlTemplateBase
import templates._common.settings.EclipseWstProjectFacetCorePrefsTemplateBase
import templates._common.settings.EclipseM2eCorePrefsTemplateBase
import templates._common.settings.EclipseJdtCorePrefsTemplateBase
import templates._common.settings.EclipseCoreResourcesPrefsTemplateBase
import templates._common.src_main_resource.meta_inf.EjbJarXmlTemplateBase
import templates._common.src_main_resource.meta_inf.ManifestMfTemplateBase
import templates.business.src_main_java_basepack.business.controller.EntityControllerXtendTemplate
import templates.business.PomXmlTemplate
import templates._common.EclipseDotProjectTemplateBase
import templates._common.src_main_resource.meta_inf.PersistenceXmlTemplateBase
import templates.business.src_main_java_basepack.business.config.ConfigXtendTemplate
import templates.business.src_main_java_basepack.business.config.SeverityXtendTemplate
import templates.business.src_main_java_basepack.business.config.EnvironmentXtendTemplate
import templates.business.src_main_java_basepack.business.object.BusinessObjectXtendTemplate

/**
 * Project generator for business project
 */
class BusinessProjectGenerator extends AbstractProjectGenerator {

	private def void initProject() {
		if (active) {
			project = new Project(stubbr)
			project.name = '''«stubbr?.stubb?.name?.toLowerCase»-business'''
			project.basePackage = '''«stubbr?.stubb?.packageName?.toLowerCase».business'''
			project.projectType = ProjectType.BUSINESS
			project.relativePath = '''/«project.name»/'''
			project.canonicalName = 'Business project'
			project.documentation = 'This project holds the business logic layer'
			log.info('''Generating Project: «project.name»''')
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
			new ReadmeMdTemplateBase(stubbr, project),
			new IntellijProjectImlFileBase(stubbr, project),
			new DotGitignoreTemplateBase(stubbr, project),
			new EclipseDotClasspathTemplateBase(stubbr, project),
			new ManifestMfTemplateBase(stubbr, project),
			new EjbJarXmlTemplateBase(stubbr, project),
			new PersistenceXmlTemplateBase(stubbr, project),
			// Eclipse templates
			new EclipseCoreResourcesPrefsTemplateBase(stubbr, project),
			new EclipseJdtCorePrefsTemplateBase(stubbr, project),
			new EclipseM2eCorePrefsTemplateBase(stubbr, project),
			new EclipseWstProjectFacetCorePrefsTemplateBase(stubbr, project),
			new EclipseWstProjectFacetCoreXmlTemplateBase(stubbr, project),
			// Project-specific singular templates
			new PomXmlTemplate(stubbr, project),
			new ConfigXtendTemplate(stubbr, project),
			new EnvironmentXtendTemplate(stubbr, project),
			new SeverityXtendTemplate(stubbr, project)
		])

		// Entity-specific templates
		stubbr?.stubb?.persistence?.entities?.forEach [ entity |
			project?.files?.addAll(#[
				new EntityControllerXtendTemplate(stubbr, project, entity),
				new BusinessObjectXtendTemplate(stubbr, project, entity)
			])
		]

		project
	}

	private def boolean isActive() {
//		!stubbr?.stubb?.persistence?.entityModel.nullOrEmpty2 && !stubbr?.stubb?.persistence?.databases.nullOrEmpty2
		true
	}

}
