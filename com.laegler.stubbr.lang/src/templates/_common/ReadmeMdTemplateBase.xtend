package templates._common

import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Organization
import com.laegler.stubbr.lang.stubbrLang.Person
import templates.AbstractTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File Generator for github documentation (README.MD)
 */
class ReadmeMdTemplateBase extends AbstractTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileType = FileType.MD
		fileName = 'README'
		relativPath = '/'
		documentation = 'Github documentation (README.MD)'
		skipStamping = true
	}

	override def String getTemplate() '''
		# «stubb?.name?.toFirstUpper» - «project?.canonicalName»
				
		«stubb?.documentation»
		
		## Stakeholders
		### Organizations
		«FOR Organization organization : chapterStakeholder?.organizations»
			* «organization?.name»
		«ENDFOR»
		
		### Developers
		«FOR Person person : chapterStakeholder?.persons»
			* «person?.name»
		«ENDFOR»
	'''
}
