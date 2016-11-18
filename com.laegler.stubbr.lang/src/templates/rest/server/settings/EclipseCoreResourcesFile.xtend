package templates.rest.server.settings

import com.laegler.stubbr.lang.generator.repository.ProjectType

/**
 * File Generator for .settings/org.eclipse.core.resources.prefs
 */
class EclipseCoreResourcesFile extends templates._common.EclipseCoreResourcesFile {

	override public String getTemplateName() '''«this.class.name»'''
	
	override public ProjectType getProject() { ProjectType.REST_SERVER }

}
