package templates

import com.google.common.base.CaseFormat
import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.OverwritePolicy
import com.laegler.stubbr.lang.genmodel.Project
import java.util.GregorianCalendar
import java.util.HashMap
import java.util.UUID
import org.eclipse.xtend.lib.annotations.Accessors
import java.text.SimpleDateFormat
import java.text.DateFormat
import javax.xml.bind.JAXBElement
import java.io.StringWriter
import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * Abstract super type for all templates.
 */
abstract class AbstractTemplate {

//	@Inject protected Logger log
//	@Inject protected StubbrRegistry stubbr
	@Accessors StubbrRegistry stubbr

	@Accessors UUID id
	@Accessors String fileName
	@Accessors FileType fileType
	@Accessors String relativPath
	@Accessors Project project

	@Accessors String header
	@Deprecated
	@Accessors String content
	@Accessors String footer

	@Accessors HashMap<String, Object> parameters
	@Accessors OverwritePolicy overwritePolicy
	@Accessors String documentation
	@Accessors String version

	@Accessors boolean skipStamping

	/**
	 * Set default preferences for all templates.
	 */
	new(StubbrRegistry stubbr, Project project) {
		this.stubbr = stubbr
		this.id = UUID.randomUUID()
		this.fileName = 'undefined file name'
		this.fileType = FileType.UNDEFINED
		this.relativPath = ''
		this.project = project
		this.header = null
		this.content = null
		this.footer = null
		this.parameters = null
		this.overwritePolicy = OverwritePolicy.OVERWRITE
		this.documentation = null
		this.version = project?.version
		this.skipStamping = false
	}
	
	abstract def String getTemplate()

	/**
	 * 
	 */
	public def String getFullPathWithName() {
		'''«project.getRelativePath»/«relativPath»/«fileName».«fileType.extension»'''
	}

	protected def String getTemplateName() {
		this.class.canonicalName
	}

	/**
	 * Assemble file content with header, footer and generation-stamp.
	 */
	public def String getFileContent() {
		if (!header.nullOrEmpty && !footer.nullOrEmpty) {
			if (header.contains('xmlns') || header.startsWith('/</?xml')) {
				// XML file
				return '''
					«header»
					«stamp»
						«template»
					«footer»
				'''
			} else {
				return '''
					«stamp»
					«header»
						«template»
					«footer»
				'''
			}
		} else {
			// Without header and footer
			return '''
				«stamp»
				«template»
			'''
		}
	}

	/**
	 * 
	 */
	public def String getStamp() {
		if (skipStamping == false) {
			if (fileType.lineComment != null) {
				return '''
					«fileType.lineComment»Generated with Stubbr
					«fileType.lineComment»«documentation»
					«fileType.lineComment»{{{Version: «version»}}}
					«fileType.lineComment»{{{Date: «currentDate»}}}
					«fileType.lineComment»{{{Generator: «templateName»}}}
				'''
			} else {
				return '''
					«fileType.beginComment»
						Generated with Stubbr
						«documentation»
						{{{Version: «version»}}}
						{{{Date: «currentDate»}}}
						{{{Generator: «templateName»}}}
					«fileType.endComment»
				'''
			}
		}
	}

	/**
	 * 
	 */
	protected def String getCurrentDate() {
		val DateFormat sdf = new SimpleDateFormat('dd.MM.yyyy - HH:mm:ss')
		val GregorianCalendar calendar = new GregorianCalendar
		sdf.format(calendar.time)
	}

	/**
	 * Transform a String (version) into Double compatible String.
	 * 
	 * Note: This is so stupid!
	 */
	protected def String toVersionDouble(String version) {
		version.replaceFirst('v', '').replaceFirst('\\.', '987654321').replaceAll('\\D', '').replaceFirst('987654321',
			'.')
	}

	/**
	 * Transform a String (package name) into file system compatible path.
	 * e.g. 'org.example.foo' will be transformed into 'com/example/foo'
	 */
	protected def String toPath(String packageName) {
		packageName.replace('.', '/')
	}

	/**
	 * Transform a (camelCased) String into lowercase with underscore.
	 * e.g. 'myExampleName' will be transformed into 'my_example_name'
	 */
	protected def String toLowerUnderscore(String input) {
		CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, input);
	}

	/**
	 * Transform a String (package name) into valid namespace value.
	 * e.g. 'org.example.foo' will be transformed into 'http://www.example.org/foo'
	 */
	protected def String toNamespace(String input) {
		val String[] parts = input?.toLowerCase?.split('\\.')
		val String[] lastParts = input?.replaceAll(parts.get(0) + '.', '')?.replaceAll(parts.get(1) + '.', '')?.
			toLowerCase?.split('.')

		'''http://www.«parts.get(1)».«parts.get(0)»«FOR String part : lastParts»/«part»«ENDFOR»'''
	}

	protected def getStubb() {
		return stubbr?.stubb
	}
	protected def getChapterGlobals() {
		return stubbr?.stubb?.globals
	}
	protected def getChapterEnvironment() {
		return stubbr?.stubb.environment
	}
	protected def getChapterStructure() {
		return stubbr?.stubb.structure
	}
	protected def getChapterStakeholder() {
		return stubbr?.stubb.stakeholders
	}
	protected def getChapterPersistence() {
		return stubbr?.stubb.persistence
	}
	protected def getChapterBusiness() {
		return stubbr?.stubb.business
	}
	protected def getChapterWebservice() {
		return stubbr?.stubb.webservice
	}
	protected def getChapterPresentation() {
		return stubbr?.stubb.presentation
	}
	protected def getChapterBehavior() {
		return stubbr?.stubb.behavior
	}
	protected def getChapterTesting() {
		return stubbr?.stubb.testing
	}
	protected def getChapterProjectManagement() {
		return stubbr?.stubb.projectManagement
	}

	@Deprecated
	protected def <T> String marshal(JAXBElement<T> model, Class<T> clazz) {
		val StringWriter writer = new StringWriter
		val JAXBContext context = JAXBContext.newInstance(clazz)

		val Marshaller marshaller = context.createMarshaller
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.mysite.com/abc.xsd");
		marshaller.marshal(model, writer)

//		marshaller.marshal(jaxbElement, NoNamespaceWriter.filter(writer))
//		val JAXBElement<T> jaxbElement = new JAXBElement(new QName(clazz.simpleName.toFirstLower), clazz, model)
//		marshaller.marshal(jaxbElement, writer)
//		val JAXBSource source = new JAXBSource(context, jaxbElement)
		return writer.toString
	}

}
