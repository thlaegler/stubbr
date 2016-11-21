package com.laegler.stubbr.lang.generator

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.ProjectType
import templates._common.DotGitignoreTemplateBase
import templates._common.EclipseDotClasspathTemplateBase
import templates._common.IntellijProjectImlFileBase
import templates._common.src_main_resource.meta_inf.EjbJarXmlTemplateBase
import templates._common.src_main_resource.meta_inf.ManifestMfTemplateBase
import templates.persistence.PomXmlTemplate
import templates.persistence.src_main_java.basepack.persistence.service.EntityServiceImplXtendTemplate
import templates.persistence.src_main_java.basepack.persistence.service.EntityServiceInterfaceXtendTemplate
import templates._common.ReadmeMdTemplateBase
import templates._common.settings.EclipseCoreResourcesPrefsTemplateBase
import templates._common.settings.EclipseJdtCorePrefsTemplateBase
import templates._common.settings.EclipseM2eCorePrefsTemplateBase
import templates._common.settings.EclipseWstProjectFacetCorePrefsTemplateBase
import templates._common.settings.EclipseWstProjectFacetCoreXmlTemplateBase
import templates._common.src_main_resource.meta_inf.PersistenceXmlTemplateBase
import templates.persistence.src_main_java.basepack.persistence.spring.repository.EntitySpringRepositoryXtendTemplate
import templates.persistence.src_main_java.basepack.persistence.spring.dto.EntitySpringDtoXtendTemplate
import templates.persistence.src_main_java.basepack.persistence.spring.mapper.EntitySpringMapperXtendTemplate
import templates.persistence.src_main_java.basepack.persistence.spring.service.EntitySpringServiceInterfaceXtendTemplate
import templates.persistence.src_main_java.basepack.persistence.spring.service.EntitySpringServiceImplXtendTemplate
import templates.persistence.src_main_resources.meta_inf.CreateScriptSqlTemplate
import templates._common.GitKeepTemplateBase
import templates.persistence.EclipseDotProjectTemplate

/**
 * Project generator for persistence project
 */
class PersistenceProjectGenerator extends AbstractProjectGenerator {

	private def void initProject() {
		if (active) {
			project = new Project(stubbr)
			project.name = '''«stubbr?.stubb?.name?.toLowerCase»-persistence'''
			project.basePackage = '''«stubbr?.stubb?.packageName?.toLowerCase».persistence'''
			project.projectType = ProjectType.PERSISTENCE
			project.relativePath = '''/«project.name»/'''
			project.canonicalName = 'Persistence project'
			project.documentation = 'This project is the interface to the physical persistence layer'
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
			new EclipseDotProjectTemplate(stubbr, project)
		])

		// SpringMVC entity-specific templates
		if (stubbr?.stubb?.globals.useSpringMVC) {
			stubbr?.stubb?.persistence?.entities?.forEach [ entity |
				project?.files?.addAll(#[
					new EntitySpringServiceInterfaceXtendTemplate(stubbr, project, entity),
					new EntitySpringServiceImplXtendTemplate(stubbr, project, entity),
					new EntitySpringMapperXtendTemplate(stubbr, project, entity),
					new EntitySpringDtoXtendTemplate(stubbr, project, entity),
					new EntitySpringRepositoryXtendTemplate(stubbr, project, entity)
				])
			]
		} else {
			stubbr?.stubb?.persistence?.entities?.forEach [ entity |
				project?.files?.addAll(#[
					new EntityServiceInterfaceXtendTemplate(stubbr, project, entity),
					new EntityServiceImplXtendTemplate(stubbr, project, entity)
				])
			]
		}

		// SQL scrips
		project?.files?.addAll(#[
			new CreateScriptSqlTemplate(stubbr, project)
//			new InsertScriptSqlTemplate(stubbr, project),
//			new DeleteScriptSqlTemplate(stubbr, project)
		])

		project
	}

	private def boolean isActive() {
//		!stubbr?.stubb?.persistence?.entityModel.nullOrEmpty2 && !stubbr?.stubb?.persistence?.databases.nullOrEmpty2
		true
	}

}
