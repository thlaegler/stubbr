package templates.rest.server.settings

import com.laegler.stubbr.lang.generator.repository.ProjectType

/**
 * File Generator for .settings/org.eclipse.wst.common.project.facet.core.xml
 */
class EclipseWstFacetPrefsFile extends templates._common.EclipseWstFacetPrefsFile {

	override public String getTemplateName() '''«this.class.name»'''
	
	override public ProjectType getProject() { ProjectType.REST_SERVER }

}