package templates.rest.server

import com.laegler.stubbr.lang.generator.repository.ProjectType

/**
 * File Generator for .classpath
 */
class DotProjectFile extends templates._common.DotProjectFile {

	override public getTemplateName() '''«this.class.name»'''
	
	override public ProjectType getProject() { ProjectType.REST_SERVER }
	
}
