package com.laegler.stubbr.lang.generator

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.ProjectType
import templates._common.DotGitignoreTemplateBase
import templates._common.EclipseDotClasspathTemplateBase
import templates._common.IntellijProjectImlFileBase
import templates._common.ReadmeMdTemplateBase
import templates._common.settings.EclipseCoreResourcesPrefsTemplateBase
import templates.ear.EclipseDotProjectTemplate
import templates.ear.PomXmlTemplate
import templates.ear.settings.EclipseWstCommonComponentTemplate
import templates.ear.settings.EclipseWstProjectFacetCoreXmlTemplate

/**
 * Project Generator for EAR project
 */
class EarProjectGenerator extends AbstractProjectGenerator {

	private def void initProject() {
		if (active) {
			project = new Project(stubbr)
			project.name = '''«stubbr?.stubb?.name?.toLowerCase»-ear'''
			project.basePackage = '''«stubbr?.stubb?.packageName?.toLowerCase».ear'''
			project.projectType = ProjectType.EAR
			project.relativePath = '''/«project.name»/'''
			project.canonicalName = 'EAR project'
			project.documentation = 'This project keeps the deployable enterprise archive (EAR)'
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
			// Eclipse templates
			new EclipseDotProjectTemplate(stubbr, project),
			new EclipseCoreResourcesPrefsTemplateBase(stubbr, project),
			new EclipseWstProjectFacetCoreXmlTemplate(stubbr, project),
			new EclipseWstCommonComponentTemplate(stubbr, project),
			// Project-specific singular templates
			new PomXmlTemplate(stubbr, project)
		])

		project
	}

	private def boolean isActive() {
		// TODO: introduce flag in grammar for enabling EAR project generation
//		stubbr?.stubb?.structure.isIsNestedParent
		true
	}

}
