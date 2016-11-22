package templates.faces.src_test_java_basepack.faces

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.stubbrLang.Feature
import templates.AbstractXtendTemplate

/**
 * File template for Cucumber feature steps (glue).
 */
class BehaviorFeatureStepsXtendDirectTemplate extends AbstractXtendTemplate {

	private String content

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Feature feature, String content) {
		super(stubbr, project)
		this.content = content
		fileName = '''«feature?.name?.replaceAll(' ', '').toFirstUpper»StepDefinitions'''
		header = '''package «project?.basePackage».feature.«feature?.name?.replaceAll(' ', '').replaceAll('"', '').toLowerCase»'''
		relativPath = '''/src/test/java/«project?.basePackage?.toPath»/feature/«feature?.name?.replaceAll(' ', '').replaceAll('"', '').toLowerCase»/'''
		documentation = '''Cucumber feature step definitions (glue) for «feature?.name?.toFirstUpper» - «feature?.label?.replaceAll('"', '')»'''
	}

	override def String getTemplate() '''«content»'''
			
}
