package templates.faces.src_main_webapp.mobile

import com.laegler.stubbr.lang.genmodel.Project
import templates.AbstractMobileXhtmlTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for JSF/XHTML mobile index page.
 */
class IndexMobileXhtmlTemplate extends AbstractMobileXhtmlTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'index'
		relativPath = '/src/main/webapp/mobile/'
		documentation = 'JSF/XHTML mobile index page.'

		
	}

	override def String getTemplate() '''
		<f:view renderKitId="PRIMEFACES_MOBILE" />
		<ui:include src="/mobile/index.xhtml" />
	'''

}
