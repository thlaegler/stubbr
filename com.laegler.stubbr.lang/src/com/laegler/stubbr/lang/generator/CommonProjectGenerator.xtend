package com.laegler.stubbr.lang.generator

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.ProjectType
import templates._common.DotGitignoreTemplateBase
import templates._common.EclipseDotClasspathTemplateBase
import templates._common.GitKeepTemplateBase
import templates._common.IntellijProjectImlFileBase
import templates._common.ReadmeMdTemplateBase
import templates._common.settings.EclipseCoreResourcesPrefsTemplateBase
import templates._common.settings.EclipseJdtCorePrefsTemplateBase
import templates._common.settings.EclipseM2eCorePrefsTemplateBase
import templates._common.src_main_resource.meta_inf.ManifestMfTemplateBase
import templates.common.EclipseDotProjectTemplate
import templates.common.PomXmlTemplate
import templates.common.settings.EclipseWstCommonComponentTemplate
import templates.common.settings.EclipseWstProjectFacetCoreXmlTemplate

/**
 * Project Generator for Common Project
 */
class CommonProjectGenerator extends AbstractProjectGenerator {

	private def void initProject() {
		if (active) {
			project = new Project(stubbr)
			project.name = '''«stubbr?.stubb?.name?.toLowerCase»-common'''
			project.basePackage = '''«stubbr?.stubb?.packageName?.toLowerCase».common'''
			project.projectType = ProjectType.COMMON
			project.relativePath = '''/«project.name»/'''
			project.canonicalName = 'Common project'
			project.documentation = 'This project keeps common utilities and settings for all other projects'
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
			new ManifestMfTemplateBase(stubbr, project),
			// Eclipse templates
			new EclipseCoreResourcesPrefsTemplateBase(stubbr, project),
			new EclipseJdtCorePrefsTemplateBase(stubbr, project),
			new EclipseM2eCorePrefsTemplateBase(stubbr, project),
			new EclipseWstProjectFacetCoreXmlTemplate(stubbr, project),
			new EclipseWstCommonComponentTemplate(stubbr, project),
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
			new EclipseDotProjectTemplate(stubbr, project)
		])

		// Entity-specific templates
//		stubbr?.stubb?.persistence?.entityModel?.entities?.forEach [ entity |
//			project?.files?.add(new EntityTemplate(project, entity))
//		]
		project
	}

	private def boolean isActive() {
		true
	}

}
