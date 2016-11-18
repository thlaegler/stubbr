package com.laegler.stubbr.lang.generator

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.ProjectType
import templates._common.IntellijProjectImlFileBase
import templates._common.EclipseDotClasspathTemplateBase
import templates._common.DotGitignoreTemplateBase
import templates._common.ReadmeMdTemplateBase
import templates._common.EclipseDotProjectTemplateBase
import templates.soap.server.src_main_java.basepack.soap.server.SoapEndpointPublisherXtendTemplate
import templates._common.src_main_resource.meta_inf.ManifestMfTemplateBase
import templates.soap.server.src_main_java.basepack.soap.server.SoapEndpointInterfaceXtendTemplate
import templates.soap.server.src_main_java.basepack.soap.server.SoapEndpointImplXtendTemplate
import templates.soap.server.PomXmlTemplate
import templates._common.settings.EclipseCoreResourcesPrefsTemplateBase
import templates._common.settings.EclipseJdtCorePrefsTemplateBase
import templates._common.settings.EclipseM2eCorePrefsTemplateBase
import templates._common.settings.EclipseWstProjectFacetCoreXmlTemplateBase
import templates._common.src_main_webapp.web_inf.WebXmlTemplateBase

/**
 * Project Generator for SOAP server project
 */
class SoapServerProjectGenerator extends AbstractProjectGenerator {

	private def void initProject() {
		if (active) {
			project = new Project(stubbr)
			project.name = '''«stubbr?.stubb?.name?.toLowerCase»-soap-server'''
			project.basePackage = '''«stubbr?.stubb?.packageName?.toLowerCase».soap.server'''
			project.projectType = ProjectType.SOAP_SERVER
			project.relativePath = '''/«project.name»/'''
			project.canonicalName = 'SOAP server project'
			project.documentation = 'This project keeps the Java SOAP server'
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
			new ManifestMfTemplateBase(stubbr, project),
			new WebXmlTemplateBase(stubbr, project),
			// Eclipse templates
			new EclipseCoreResourcesPrefsTemplateBase(stubbr, project),
			new EclipseJdtCorePrefsTemplateBase(stubbr, project),
			new EclipseM2eCorePrefsTemplateBase(stubbr, project),
			new EclipseWstProjectFacetCoreXmlTemplateBase(stubbr, project),
			// Project-specific singular templates
			new PomXmlTemplate(stubbr, project),
			new SoapEndpointPublisherXtendTemplate(stubbr, project)
		])

		// Entity-specific templates
		stubbr?.stubb?.persistence?.entities?.forEach [ entity |
			project?.files?.addAll(#[
				new SoapEndpointInterfaceXtendTemplate(stubbr, project, entity),
				new SoapEndpointImplXtendTemplate(stubbr, project, entity)
			])
		]

		// val Definitions wsdl = wsdlParserHelper.parse(webservice.specFile)
		// wsdl.paths.forEach[key, value|(pathApiFile.element = new CustomPath(value, key)).generate]
		project
	}

	private def boolean isActive() {
		// !stubbr?.stubb?.persistence?.entityModel.nullOrEmpty2 && !stubbr?.stubb?.persistence?.databases.nullOrEmpty2
		true
	}

}
