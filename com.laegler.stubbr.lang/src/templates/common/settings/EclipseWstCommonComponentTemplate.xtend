package templates.common.settings

import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import templates.AbstractTemplate

/**
 * File template for Eclipse settings WST common component (org.eclipse.wst.common.component).
 */
class EclipseWstCommonComponentTemplate extends AbstractTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'org.eclipse.wst.common'
		fileType = FileType.ECLIPSE_COMPONENT
		relativPath = '/.settings/'
		documentation = 'Eclipse settings for WST common component.'
		skipStamping = true

		content = template
	}

	private def String getTemplate() '''<?xml version="1.0" encoding="UTF-8"?><project-modules id="moduleCoreId"/>'''

}
