package templates

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * Abstract super type for all JSF/XHTML desktop templates.
 */
abstract class AbstractDesktopXhtmlTemplate extends AbstractXhtmlTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		relativPath = '/src/main/webapp/desktop/'
		header = '''
			<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
			<html xmlns="http://www.w3.org/1999/xhtml"
				xmlns:ui="http://java.sun.com/jsf/facelets"
				xmlns:f="http://java.sun.com/jsf/core"
				xmlns:h="http://java.sun.com/jsf/html"
				xmlns:c="http://java.sun.com/jsp/jstl/core"
				xmlns:p="http://primefaces.org/ui">
				
				<h:head></h:head>
				<h:body>
		'''
		footer = '''
				</h:body>
			</html>
		'''
	}
}
