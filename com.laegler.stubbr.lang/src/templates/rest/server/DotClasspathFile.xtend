package templates.rest.server

import com.laegler.stubbr.lang.generator.repository.ProjectType

/**
 * File Generator for .classpath
 */
class DotClasspathFile extends templates._common.DotClasspathFile {

	override public getTemplateName() '''«this.class.name»'''

	override public ProjectType getProject() { ProjectType.REST_SERVER }

}
