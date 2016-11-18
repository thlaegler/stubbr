package templates.faces.src_main_webapp

import com.laegler.stubbr.lang.genmodel.Project
import templates.AbstractDesktopXhtmlTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for XHTML desktop index page.
 */
class IndexXhtmlTemplate extends AbstractDesktopXhtmlTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'index'
		relativPath = '/src/main/webapp/'
		documentation = 'XHTML desktop index page.'

		content = template
	}

	private def String getTemplate() '''
		<ui:include src="/mobile/index.xhtml" />
	'''

}
