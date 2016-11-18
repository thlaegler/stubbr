package templates.rest.server

import com.laegler.stubbr.lang.generator.repository.ProjectType

/**
 * File Generator for project.iml
 */
class IntellijProjectImlFile extends templates._common.IntellijProjectImlFile {

	override public getTemplateName() '''«this.class.name»'''

	override public ProjectType getProject() { ProjectType.REST_SERVER }

}
