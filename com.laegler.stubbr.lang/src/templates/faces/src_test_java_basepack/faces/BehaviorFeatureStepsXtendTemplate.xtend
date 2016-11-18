package templates.faces.src_test_java_basepack.faces

import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Feature
import com.laegler.stubbr.lang.stubbrLang.GivenStep
import com.laegler.stubbr.lang.stubbrLang.Scenario
import com.laegler.stubbr.lang.stubbrLang.ThenStep
import com.laegler.stubbr.lang.stubbrLang.WhenStep
import templates.AbstractXtendTemplate
import java.util.ArrayList
import java.util.List

/**
 * File template for Cucumber feature steps (glue).
 */
class BehaviorFeatureStepsXtendTemplate extends AbstractXtendTemplate {

	private Feature feature
	private List<String> stepMethods = new ArrayList<String>

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Feature feature) {
		super(stubbr, project)
		this.feature = feature
		fileName = '''«feature?.name?.replaceAll(' ', '').toFirstUpper»StepDefinitions'''
		relativPath = '''/src/test/java/«project?.basePackage?.toPath»/feature/«feature?.name?.replaceAll(' ', '').replaceAll('"', '').toLowerCase»/'''
		documentation = '''Cucumber feature step definitions (glue) for «feature?.name?.toFirstUpper» - «feature?.label?.replaceAll('"', '')»'''

		content = template
	}

	private def String getTemplate() '''
		package «project?.basePackage».feature.«feature?.name?.replaceAll(' ', '').replaceAll('"', '').toLowerCase»
		
		import «project?.basePackage».*
		import com.google.gson.annotations.Until
		import javax.annotation.Generated
		import javax.annotation.PostConstruct
		import javax.annotation.security.PermitAll
		import javax.inject.Inject
		import org.slf4j.Logger
		import cucumber.api.java.en.Given
		import cucumber.api.java.en.Then
		import cucumber.api.java.en.When
		import cucumber.api.PendingException
		
		«javaDocType»
		class «fileName» {
		
			@Inject Logger log
		
			«FOR Scenario scenario : feature?.scenarios»
				«FOR GivenStep given : scenario?.givenSteps»
					«val String stepMethodName = given?.toMethodName.replaceAll(' ', '').replaceAll('"', '')»
					«IF !stepMethods.contains(stepMethodName)»
						«given?.toAnnotation»
						«toMethod(stepMethodName, given?.actor?.name)»
					«ENDIF»
					
				«ENDFOR»
				«FOR WhenStep when : scenario?.whenSteps»
					«val String stepMethodName = when?.toMethodName.replaceAll(' ', '').replaceAll('"', '')»
					«IF !stepMethods.contains(stepMethodName)»
						«when?.toAnnotation»
						«toMethod(stepMethodName, when?.actor?.name)»
					«ENDIF»
					
				«ENDFOR»
				«FOR ThenStep then : scenario?.thenSteps»
					«val String stepMethodName = then?.toMethodName.replaceAll(' ', '').replaceAll('"', '')»
					«IF !stepMethods.contains(stepMethodName)»
						«then?.toAnnotation»
						«toMethod(stepMethodName, then?.actor?.name)»
					«ENDIF»
					
				«ENDFOR»
				
			«ENDFOR»
		}
	'''
	
	private def String toMethod(String stepMethodName, String actor) {
		stepMethods.add(stepMethodName)
		return '''
			public def void «stepMethodName»() throws Throwable {
				// TODO «actor»
				throw new PendingException
			}
		'''
	}
	
	private def String toMethodName(GivenStep step) {
		var name = '''«step?.actor?.name»«step?.actorElement?.name»«step?.objectWildcard»'''
		return toMethodName(name)
	}
	
	private def String toMethodName(WhenStep step) {
		var name = '''«step?.actor?.name»«step?.actorElement?.name»«step?.objectWildcard»_«step?.action» «step?.value»_«step?.subjectElement?.name»«step?.subjectWildcard»'''
		return toMethodName(name)
	}
	
	private def String toMethodName(ThenStep step) {
		var name = '''«step?.actor?.name»«step?.actorElement?.name»«step?.objectWildcard»_should_«step?.action» «step?.value»_«step?.subjectElement?.name»«step?.subjectWildcard»'''
		return toMethodName(name)
	}
	 
	private def String toMethodName(String methodName) {
		methodName.replaceAll(' ', '').replaceAll('"', '').toFirstLower
	}

	private def String toAnnotation(GivenStep step) '''
		@Given("^«step?.actor?.name»«step?.actorElement?.name»«step?.objectWildcard?.replaceAll('"', '')»$")
	'''
	
	private def String toAnnotation(WhenStep step) '''
		@When("^«step?.actor?.name»«step?.actorElement?.name»«step?.objectWildcard?.replaceAll('"', '')» «step?.action» «step?.value?.replaceAll('"', '')» «step?.subjectElement?.name»«step?.subjectWildcard?.replaceAll('"', '')»$")
	'''
	
	private def String toAnnotation(ThenStep step) '''
		@Then("^«step?.actor?.name»«step?.actorElement?.name»«step?.objectWildcard?.replaceAll('"', '')» should «step?.action» «step?.value?.replaceAll('"', '')» «step?.subjectElement?.name»«step?.subjectWildcard?.replaceAll('"', '')»$")
	'''
			
}
