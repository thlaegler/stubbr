package templates._common

import templates.AbstractTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.FileType

class GitKeepTemplateBase extends AbstractTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, String directory) {
		super(stubbr, project)
		fileType = FileType.GITKEEP
		fileName = ''
		relativPath = directory
		documentation = 'Git keep source directories'
		skipStamping = true

		content = ''
	}

}