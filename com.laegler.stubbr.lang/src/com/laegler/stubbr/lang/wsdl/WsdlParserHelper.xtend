package com.laegler.stubbr.lang.wsdl

import io.swagger.models.Swagger
import io.swagger.parser.SwaggerParser
import java.io.File
import java.util.logging.Logger
import javax.inject.Inject
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException

class WsdlParserHelper {

	@Inject
	Logger log

//	@Inject SwaggerParser swaggerParser

	def Swagger parse(String specFile) {
		val File file = findFile(specFile.replaceAll('%22', '').replaceAll('"', ''))
//		if (file != null) {
//			return swaggerParser.read(file.path)
//		}
		null
	}

	def File findFile(String specFile) {
		val IWorkspaceRoot root = ResourcesPlugin.workspace.root

		// Loop over all projects
		for (IProject project : root.projects) {
			try {
				System.out.println(project)
				val IFile file = project.getFile(specFile)
				if (file != null) {
					return file.location.toFile
				}
			} catch (CoreException e) {
				e.printStackTrace
			}
		}
		null
	}

}
