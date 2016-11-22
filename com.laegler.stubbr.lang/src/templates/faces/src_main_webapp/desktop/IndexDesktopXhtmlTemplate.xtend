package templates.faces.src_main_webapp.desktop

import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.genmodel.Project
import templates.AbstractDesktopXhtmlTemplate

/**
 * File template for JSF/XHTML desktop index page.
 */
class IndexDesktopXhtmlTemplate extends AbstractDesktopXhtmlTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'index'
		relativPath = '/src/main/webapp/desktop/'
		documentation = 'JSF/XHTML desktop index page.'

		
	}

	override def String getTemplate() '''
		<ui:include src="/desktop/index.xhtml" />
	'''

}
