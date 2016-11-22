package templates.faces.src_test_java_basepack.faces

import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.stubbrLang.Feature
import com.laegler.stubbr.lang.stubbrLang.Scenario
import templates.AbstractTemplate

/**
 * File template for Cucumber feature definition.
 */
class BehaviorFeatureDirectTemplate extends AbstractTemplate {

	private String content

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Feature feature, String content) {
		super(stubbr, project)
		this.content = content
		fileType = FileType.FEATURE
		fileName = '''«feature?.name?.toLowerCase.replaceAll(' ', '')»'''
		relativPath = '''/src/test/java/«project?.basePackage?.toPath»/feature/«feature?.name?.replaceAll(' ', '').replaceAll('"', '').toLowerCase»/'''
		documentation = '''
			The Cucumber feature definition for «feature?.name?.toFirstUpper» «feature?.label?.replaceAll('"', '')»
			
			Scenarios:
			<ul>
			«FOR Scenario scenario : feature?.scenarios»
				<li>«scenario?.name?.toFirstUpper» - «scenario?.label?.replaceAll('"', '')»</li>
			«ENDFOR»
			</ul>
		'''
	}

	override def String getTemplate() '''«content»'''

}
