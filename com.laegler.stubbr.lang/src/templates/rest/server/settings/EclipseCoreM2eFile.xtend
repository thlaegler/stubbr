package templates.rest.server.settings

import com.laegler.stubbr.lang.generator.repository.ProjectType

/**
 * File Generator for .settings/org.eclipse.m2e.core.prefs
 */
class EclipseCoreM2eFile extends templates._common.EclipseCoreM2eFile {

	override public String getTemplateName() '''«this.class.name»'''
	
	override public ProjectType getProject() { ProjectType.REST_SERVER }

}
