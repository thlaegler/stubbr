package templates.rest.server.src_main_webapp.web_inf

import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.generator.template.XmlTemplateFile
import com.laegler.stubbr.lang.stubbrLang.Entity
import javax.inject.Inject
import com.laegler.stubbr.lang.generator.repository.ProjectType

/**
 * File Generator for web.xml
 */
class WebXmlFile extends XmlTemplateFile<Entity> {

	@Inject extension StubbrRegistry

	override public getDocumentation() '''The Web Project Description File'''

	override public getTemplateName() '''«this.class.name»'''

	override public getFileName() '''web'''

	override public getPath() '''«parentDir»«stubb?.name?.toLowerCase»-«project?.getName()»/src/main/webapp/WEB-INF/'''

	override public ProjectType getProject() { ProjectType.REST_SERVER }

	override public getTemplate() '''
		«header»
			<display-name>pmbok-web</display-name>
			<description>The Rest Project</description>
			
			<servlet>
				<description>JAX-RS Tools Generated - Do not modify</description>
				<servlet-name>JAX-RS Servlet</servlet-name>
				<load-on-startup>1</load-on-startup>
			</servlet>
			<servlet-mapping>
				<servlet-name>JAX-RS Servlet</servlet-name>
				<url-pattern>/jaxrs/*</url-pattern>
			</servlet-mapping>
		«footer»
	'''

	protected override String getHeader() '''
		<?xml version="1.0" encoding="UTF-8"?>
		<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xmlns="http://java.sun.com/xml/ns/javaee"
			xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
			version="3.0">
	'''

	protected override String getPlainText(String text) '''
		«text»
	'''

	protected override String getFooter() '''
		</web-app>
	'''
}
