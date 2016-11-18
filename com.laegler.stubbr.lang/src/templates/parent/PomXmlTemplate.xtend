package templates.parent

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.ProjectType
import java.util.Map
import java.util.HashMap
import templates._common.PomXmlTemplateBase
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File Generator for Maven project object model (pom.xml) for parent project.
 */
class PomXmlTemplate extends PomXmlTemplateBase {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		documentation = '''«documentation» for parent project'''
		
		content = template
	}

	private def String getTemplate() '''
		<groupId>«stubbr?.stubb?.packageName»</groupId>
		<artifactId>«project?.name»</artifactId>
		<version>«project?.version»</version>
		<name>«stubbr?.stubb?.name?.toFirstUpper» Parent Project</name>
		<packaging>«project?.packaging»</packaging>
		
		<properties>
			«FOR Object entry : properties?.entrySet»
				«IF entry instanceof Map.Entry<?, ?>»
					<«entry.key»>«entry.value»</«entry.key»>
				«ENDIF»
			«ENDFOR»
			<compiler.source.version>«stubbr?.stubb?.environment?.runtime?.jvm?.literal»</compiler.source.version>
			<compiler.target.version>«stubbr?.stubb?.environment?.runtime?.jvm?.literal»</compiler.target.version>
		</properties>
		<modules>
			«FOR Project project : stubbr?.projects»
				«IF project != null && !project.name.nullOrEmpty && project?.projectType != ProjectType.PARENT»
					<module>«IF !stubbr?.stubb?.structure.isIsNestedParent»../«ENDIF»«project?.name»</module>
				«ENDIF»
			«ENDFOR»
		</modules>
		<dependencyManagement>
			<dependencies>
				«FOR Project project : stubbr?.projects»
					«IF project != null && !project.name.nullOrEmpty && project?.projectType != ProjectType.PARENT»
						<dependency>
							<groupId>${project.groupId}</groupId>
							<artifactId>«project?.name»</artifactId>
							<version>${project.version}</version>
							<type>«project?.packaging»</type>
						</dependency>
					«ENDIF»
				«ENDFOR»
				<dependency>
					<groupId>org.wildfly.bom</groupId>
					<artifactId>wildfly-javaee7-with-tools</artifactId>
					<version>${wildfly.bom.version}</version>
					<type>pom</type>
					<scope>import</scope>
				</dependency>
				<dependency>
					<groupId>javax.enterprise</groupId>
					<artifactId>cdi-api</artifactId>
					<version>${cdi.version}</version>
				</dependency>
				<dependency>
					<groupId>org.jboss.spec.javax.ejb</groupId>
					<artifactId>jboss-ejb-api_3.2_spec</artifactId>
					<version>1.0.0.Final</version>
				</dependency>
				<dependency>
					<groupId>org.jboss.spec.javax.faces</groupId>
					<artifactId>jboss-jsf-api_2.2_spec</artifactId>
					<version>2.2.13</version>
				</dependency>
				<dependency>
					<groupId>org.jboss.spec.javax.servlet</groupId>
					<artifactId>jboss-servlet-api_3.1_spec</artifactId>
					<version>1.0.0.Final</version>
				</dependency>
				<dependency>
					<groupId>org.jboss.spec.javax.annotation</groupId>
					<artifactId>jboss-annotations-api_1.2_spec</artifactId>
					<version>1.0.0.Final</version>
				</dependency>
				<dependency>
					<groupId>org.eclipse.xtend</groupId>
					<artifactId>org.eclipse.xtend.lib</artifactId>
					<version>${xtend.version}</version>
				</dependency>
				<dependency>
					<groupId>joda-time</groupId>
					<artifactId>joda-time</artifactId>
					<version>${joda.version}</version>
				</dependency>
				<dependency>
					<groupId>org.slf4j</groupId>
					<artifactId>slf4j-api</artifactId>
					<version>${slf4j.version}</version>
				</dependency>
				<dependency>
					<groupId>com.google.code.gson</groupId>
					<artifactId>gson</artifactId>
					<version>${gson.version}</version>
				</dependency>
				<dependency>
				    <groupId>com.fasterxml.jackson.core</groupId>
				    <artifactId>jackson-annotations</artifactId>
				    <version>${jackson.version}</version>
				</dependency>
				<dependency>
					<groupId>junit</groupId>
					<artifactId>junit</artifactId>
					<version>${junit.version}</version>
					<scope>test</scope>
				</dependency>
				<dependency>
					<groupId>org.mockito</groupId>
					<artifactId>mockito-all</artifactId>
					<version>${mockito.version}</version>
					<scope>test</scope>
				</dependency>
				<dependency>
					<groupId>org.powermock</groupId>
					<artifactId>powermock-api-mockito</artifactId>
					<version>${powermock.version}</version>
					<scope>test</scope>
				</dependency>
				<dependency>
					<groupId>info.cukes</groupId>
					<artifactId>cucumber-core</artifactId>
					<version>${cucumber.version}</version>
					<scope>test</scope>
				</dependency>
				<dependency>
					<groupId>info.cukes</groupId>
					<artifactId>cucumber-java</artifactId>
					<version>${cucumber.version}</version>
					<scope>test</scope>
				</dependency>
				<dependency>
					<groupId>info.cukes</groupId>
					<artifactId>cucumber-junit</artifactId>
					<version>${cucumber.version}</version>
					<scope>test</scope>
				</dependency>
				<dependency>
					<groupId>info.cukes</groupId>
					<artifactId>gherkin</artifactId>
					<version>${gherkin.version}</version>
					<scope>test</scope>
				</dependency>
			</dependencies>
		</dependencyManagement>
		<build>
			<finalName>${project.artifactId}</finalName>
			<plugins>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-compiler-plugin</artifactId>
					<version>3.5.1</version>
				</plugin>
				<plugin>
					<groupId>org.wildfly.plugins</groupId>
					<artifactId>wildfly-maven-plugin</artifactId>
					<version>${wildfly.plugin.version}</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven</groupId>
					<artifactId>maven-jar-plugin</artifactId>
					<version>${jar.plugin.version}</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven</groupId>
					<artifactId>maven-ejb-plugin</artifactId>
					<version>${ejb.plugin.version}</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven</groupId>
					<artifactId>maven-war-plugin</artifactId>
					<version>${war.plugin.version}</version>
					<configuration>
						<failOnMissingWebXml>false</failOnMissingWebXml>
					</configuration>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-failsafe-plugin</artifactId>
					<version>${failsafe.plugin.version}</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven</groupId>
					<artifactId>maven-plugin-api</artifactId>
					<version>${api.plugin.version}</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-surefire-plugin</artifactId>
					<version>${surefire.plugin.version}</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-source-plugin</artifactId>
					<version>${source.plugin.version}</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-javadoc-plugin</artifactId>
					<version>${javadoc.plugin.version}</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-site-plugin</artifactId>
					<version>${site.plugin.version}</version>
				</plugin>
			</plugins>
		</build>
	'''

	private def Map<String, String> getProperties() {
		new HashMap<String, String> => [
			put('wildfly.bom.version', '10.1.0.Final')
			put('tuckey.version', '4.0.3')
			put('cdi.version', '1.2')
			put('xtend.version', '2.10.0')
			put('joda.version', '2.9.4')
			put('slf4j.version', '1.7.21')
			put('gson.version', '2.7')
			put('jackson.version', '2.8.4')
			put('cdi.version', '1.2')
			put('junit.version', '4.12')
			put('mockito.version', '2.0.2-beta')
			put('powermock.version', '1.6.5')
			put('cucumber.version', '1.2.4')
			put('gherkin.version', '2.12.2')
			put('compiler.plugin.version', '3.3')
			put('jar.plugin.version', '3.0.2')
			put('ejb.plugin.version', '2.5.1')
			put('war.plugin.version', '3.0.0')
			put('ear.plugin.version', '2.10.1')
			put('wildfly.plugin.version', '1.0.2.Final')
			put('source.plugin.version', '2.10.4')
			put('api.plugin.version', '2.10.4')
			put('dependency.plugin.version', '2.10.4')
			put('failsafe.plugin.version', '2.19.1')
			put('checkstyle.plugin.version', '2.17')
			put('surefire.plugin.version', '2.19.1')
			put('javadoc.plugin.version', '2.10.4')
			put('site.plugin.version', '3.4')
		]
	}

}
