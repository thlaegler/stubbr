package templates.common.settings

import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.genmodel.Project
import templates.AbstractXmlTemplate

/**
 * File template for Eclipse WST project facet prefs xml (org.eclipse.wst.common.project.facet.core.xml).
 */
class EclipseWstProjectFacetCoreXmlTemplate extends AbstractXmlTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'org.eclipse.wst.common.project.facet.core'
		relativPath = '/.settings/'
		header = '''
			<?xml version="1.0" encoding="UTF-8"?>
			<faceted-project>
		'''
		footer = '</faceted-project>'
		documentation = 'Eclipse WST project facet prefs xml'
		skipStamping = true

		content = template
	}

	private def String getTemplate() '''
		<installed facet="jboss.m2" version="1.0"/>
		<installed facet="java" version="1.8"/>
		<installed facet="jst.cdi" version="1.2"/>
		<installed facet="jst.web" version="3.0"/>
	'''

}
