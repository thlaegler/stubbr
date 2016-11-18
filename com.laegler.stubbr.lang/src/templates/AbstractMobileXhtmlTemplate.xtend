package templates

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * Abstract super type for all JSF/XHTML mobile templates.
 */
abstract class AbstractMobileXhtmlTemplate extends AbstractXhtmlTemplate {

	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		relativPath = '/src/main/webapp/mobile/'
		header = '''
			<ui:composition
				xmlns="http://www.w3.org/1999/xhtml"
				xmlns:h="http://xmlns.jcp.org/jsf/html"
				xmlns:p="http://primefaces.org/ui"
				xmlns:c="http://java.sun.com/jsp/jstl/core"
				xmlns:ui="http://java.sun.com/jsf/facelets"
				xmlns:f="http://xmlns.jcp.org/jsf/core"
				xmlns:pm="http://primefaces.org/mobile">
				
				<f:view renderKitId="PRIMEFACES_MOBILE" />
		'''
		footer = '</ui:composition>'
	}
}
