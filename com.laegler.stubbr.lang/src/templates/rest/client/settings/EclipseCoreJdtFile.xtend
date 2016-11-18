package templates.rest.client.settings

import com.laegler.stubbr.lang.generator.repository.ProjectType

/**
 * File Generator for .settings/org.eclipse.jdt.core.prefs
 */
class EclipseCoreJdtFile extends templates._common.EclipseCoreJdtFile {

	override public String getTemplateName() '''«this.class.name»'''
	
	override public ProjectType getProject() { ProjectType.REST_CLIENT }

}
