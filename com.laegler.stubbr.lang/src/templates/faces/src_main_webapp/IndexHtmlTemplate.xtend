package templates.faces.src_main_webapp

import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.Project
import templates.AbstractTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for JSF presenter for view.
 */
class IndexHtmlTemplate extends AbstractTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'index'
		fileType = FileType.HTML
		relativPath = '/src/main/webapp/'
		header = '<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">'
		documentation = 'HTML index page'

		content = template
	}

	private def String getTemplate() '''
		<html>
			<head>
				<title>«stubbr?.stubb?.name?.toFirstUpper»</title>
				<meta http-equiv="Refresh" content="0; URL=index.jsf">
			</head>
		</html>
	'''

}
