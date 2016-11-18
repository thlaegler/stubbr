package templates._common

import com.laegler.stubbr.lang.genmodel.Project
import templates.AbstractXmlTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File Generator for Maven project object model (pom.xml)
 */
class PomXmlTemplateBase extends AbstractXmlTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'pom'
		relativPath = '/'
		header = '''
			<project
				xmlns="http://maven.apache.org/POM/4.0.0"
				xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
				xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
					http://maven.apache.org/xsd/maven-4.0.0.xsd">
				<modelVersion>4.0.0</modelVersion>
		'''
		footer = '</project>'
		documentation = 'Maven project object model (pom.xml)'
		version = project?.version

		content = template

//		var model = new Model => [
//			groupId = stubbr?.stubb?.packageName
//			name = projectName
//			version = stubbr?.stubb.version.version
//			packaging = 'pom'
//			parent = null
//			modules = new Modules => [
//				
//			]
//		]
//		val ObjectFactory mavenFactory = new ObjectFactory
//		val String content = marshal(mavenFactory.createProject(model), Model)
	}

	private def String getTemplate() '''
		«parentSection»
		<artifactId>«project?.name»</artifactId>
		<name>«project?.canonicalName»</name>
		<packaging>«project?.packaging»</packaging>
		<description>«project?.documentation»</description>
		<dependencies>
			<!-- Project internal -->
			<dependency>
				<groupId>${project.groupId}</groupId>
				<artifactId>«stubbr?.stubb?.name?.toLowerCase»-common</artifactId>
				<version>${project.version}</version>
			</dependency>
			<dependency>
				<groupId>${project.groupId}</groupId>
				<artifactId>«stubbr.stubb?.name?.toLowerCase»-model</artifactId>
				<version>${project.version}</version>
			</dependency>
			<dependency>
				<groupId>${project.groupId}</groupId>
				<artifactId>«stubbr.stubb?.name?.toLowerCase»-persistence</artifactId>
				<version>${project.version}</version>
			</dependency>
			<dependency>
				<groupId>org.wildfly.bom</groupId>
				<artifactId>wildfly-javaee7-with-tools</artifactId>
				<version>${wildfly.bom.version}</version>
				<type>pom</type>
			</dependency>
			<dependency>
				<groupId>javax.enterprise</groupId>
				<artifactId>cdi-api</artifactId>
			</dependency>
			<dependency>
				<groupId>org.jboss.spec.javax.ejb</groupId>
				<artifactId>jboss-ejb-api_3.2_spec</artifactId>
			</dependency>
			<dependency>
				<groupId>org.jboss.spec.javax.annotation</groupId>
				<artifactId>jboss-annotations-api_1.2_spec</artifactId>
			</dependency>
			<dependency>
				<groupId>org.jboss.resteasy</groupId>
				<artifactId>resteasy-jaxrs</artifactId>
				<version>3.1.0.Beta1</version>
			</dependency>
			<dependency>
				<groupId>io.rest-assured</groupId>
				<artifactId>rest-assured</artifactId>
				<version>3.0.0</version>
			</dependency>
			<dependency>
				<groupId>org.eclipse.xtend</groupId>
				<artifactId>org.eclipse.xtend.lib</artifactId>
			</dependency>
			<dependency>
				<groupId>org.slf4j</groupId>
				<artifactId>slf4j-api</artifactId>
			</dependency>
			<dependency>
				<groupId>joda-time</groupId>
				<artifactId>joda-time</artifactId>
			</dependency>
			<dependency>
				<groupId>com.google.code.gson</groupId>
				<artifactId>gson</artifactId>
			</dependency>
			<dependency>
				<groupId>junit</groupId>
				<artifactId>junit</artifactId>
				<scope>test</scope>
			</dependency>
			<dependency>
				<groupId>org.mockito</groupId>
				<artifactId>mockito-all</artifactId>
				<scope>test</scope>
			</dependency>
			<dependency>
				<groupId>org.powermock</groupId>
				<artifactId>powermock-api-mockito</artifactId>
				<scope>test</scope>
			</dependency>
			<dependency>
				<groupId>info.cukes</groupId>
				<artifactId>cucumber-core</artifactId>
				<scope>test</scope>
			</dependency>
			<dependency>
				<groupId>info.cukes</groupId>
				<artifactId>cucumber-java</artifactId>
				<scope>test</scope>
			</dependency>
			<dependency>
				<groupId>info.cukes</groupId>
				<artifactId>cucumber-junit</artifactId>
				<scope>test</scope>
			</dependency>
			<dependency>
				<groupId>info.cukes</groupId>
				<artifactId>gherkin</artifactId>
				<scope>test</scope>
			</dependency>
		</dependencies>
		<build>
			<finalName>${project.artifactId}</finalName>
			<plugins>
				<plugin>
					<groupId>org.apache.maven</groupId>
					<artifactId>maven-war-plugin</artifactId>
					<version>${war.plugin.version}</version>
					<configuration>
						<failOnMissingWebXml>false</failOnMissingWebXml>
						<webXml>src/main/webapp/WEB-INF/web.xml</webXml>
					</configuration>
				</plugin>
			</plugins>
		</build>
	'''

	/**
	 * Parent section in POM depending, if projects are nested in parent project or sibling projects.
	 */
	protected def String getParentSection() '''
		<parent>
			<groupId>«stubbr?.stubb?.packageName?.toLowerCase»</groupId>
			<artifactId>«stubbr?.stubb?.name?.toLowerCase»-parent</artifactId>
			<version>«project?.version»</version>
			«IF !stubbr?.stubb?.structure.isNestedParent»
				<relativePath>../«stubbr?.stubb?.name?.toLowerCase»-parent/</relativePath>
			«ENDIF»
		</parent>
	'''

}
