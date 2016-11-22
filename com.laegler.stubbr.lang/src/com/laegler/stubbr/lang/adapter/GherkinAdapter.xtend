package com.laegler.stubbr.lang.adapter

import com.laegler.stubbr.lang.adapter.cucumber.CamelCaseConcatenator
import com.laegler.stubbr.lang.adapter.cucumber.Concatenator
import com.laegler.stubbr.lang.adapter.cucumber.FunctionNameGenerator
import com.laegler.stubbr.lang.adapter.cucumber.Snippet
import com.laegler.stubbr.lang.adapter.cucumber.SnippetGenerator
import com.laegler.stubbr.lang.adapter.cucumber.XtendSnippet
import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.FileHelper
import gherkin.AstBuilder
import gherkin.Parser
import gherkin.ParserException
import gherkin.TokenMatcher
import gherkin.ast.GherkinDocument
import gherkin.ast.ScenarioDefinition
import gherkin.ast.Step
import java.io.File
import java.util.HashMap
import java.util.Map
import java.util.logging.Logger
import javax.inject.Inject
import java.util.ArrayList
import java.util.List
import com.laegler.stubbr.lang.stubbrLang.impl.StubbrLangFactoryImpl
import com.laegler.stubbr.lang.stubbrLang.Feature

/**
 * Reads, parses and generates Cucumber/Gherkin files.
 */
class GherkinAdapter implements StubbrAdapter<GherkinDocument> {

	@Inject Logger log
	@Inject FileHelper fileHelper

	List<String> methodSnippets = new ArrayList<String>

	/**
	 * 
	 */
	public override GherkinDocument parse(String fileLocation) {
		log.info('Parsing Swagger YAML file.')
		val File file = fileHelper.findFile(fileLocation)

		val String gherkinFileContent = fileHelper.getFileContent(file)

		val TokenMatcher matcher = new TokenMatcher => []
		val AstBuilder builder = new AstBuilder => []
		val Parser<GherkinDocument> parser = new Parser(builder) => [
			stopAtFirstError = false
		]

		try {
			val GherkinDocument gherkinModel = parser.parse(gherkinFileContent, matcher)
			log.info('Gherkin feature file successfully parsed')
			return gherkinModel
		} catch (ParserException e) {
			log.warning('''Failed to parse gherkin feature «file»''')
		}
		null
	}

	/**
	 * 
	 */
	public def Feature parseToFeature(String fileLocation) {
		val GherkinDocument gherkinModel = parse(fileLocation)
		log.info('Gherkin feature file successfully parsed')

		val Feature feature = StubbrLangFactoryImpl.eINSTANCE.createFeature => [
			name = gherkinModel?.feature?.name
			label = gherkinModel?.feature?.description
		]
		return feature
	}

	public override String generate(Project project, String fileLocation) {
		generate(project, fileLocation, new HashMap)
	}

	public override String generate(Project project, String fileLocation, Map<String, Object> params) {
		log.info('''Generate Cucumber snippets/stubs for feature «fileLocation».''')
		val GherkinDocument featureModel = parse(fileLocation)

		val Snippet snippet = new XtendSnippet
		val SnippetGenerator generator = new SnippetGenerator(snippet)
		val Concatenator concatenator = new CamelCaseConcatenator
		val FunctionNameGenerator fuctionNameGen = new FunctionNameGenerator(
			concatenator)

		methodSnippets = new ArrayList<String>

		return '''
			import «project?.basePackage».*
			import javax.inject.Inject
			import org.slf4j.Logger
			import cucumber.api.java.en.Given
			import cucumber.api.java.en.Then
			import cucumber.api.java.en.When
			import cucumber.api.java.en.And
			import cucumber.api.PendingException
			
			class «featureModel?.feature?.name?.replaceAll(' ', '')?.toFirstUpper»StepDefinitions {
				
				@Inject Logger log
				
				«FOR ScenarioDefinition scenario : featureModel?.feature?.children»
					«FOR Step step : scenario?.steps»
						«addSnippet(generator.getSnippet(step, fuctionNameGen))»
					«ENDFOR»
				«ENDFOR»
			}
		'''
	}

	private def String addSnippet(String methodSnippet) {
		if (!methodSnippets.contains(methodSnippet)) {
			methodSnippets.add(methodSnippet)
			return methodSnippet
		} else {
			return ''
		}
	}

}
