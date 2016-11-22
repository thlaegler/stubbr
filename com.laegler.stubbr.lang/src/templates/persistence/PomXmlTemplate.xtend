package templates.persistence

import com.laegler.stubbr.lang.genmodel.Project
import templates._common.PomXmlTemplateBase
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File Generator for Maven project object model (pom.xml)
 */
class PomXmlTemplate extends PomXmlTemplateBase {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		documentation = 'Maven project object model (pom.xml)'

		
	}

	override def String getTemplate() '''
		«parentSection»
		
		<artifactId>«project?.name»</artifactId>
		<name>«projectName»</name>
		<packaging>«project?.packaging»</packaging>
		<description>«project?.documentation»</description>
		
		<dependencies>
			<!-- Internal dependencies -->
			<dependency>
				<groupId>${project.groupId}</groupId>
				<artifactId>«stubbr.stubb?.name?.toLowerCase»-common</artifactId>
				<version>${project.version}</version>
			</dependency>
			<dependency>
				<groupId>${project.groupId}</groupId>
				<artifactId>«stubbr.stubb?.name?.toLowerCase»-model</artifactId>
				<version>${project.version}</version>
			</dependency>
			
			<!-- Project-specific dependencies -->
			«IF stubbr?.stubb?.globals.useSpringMVC»
				<dependency>
				    <groupId>org.springframework.data</groupId>
				    <artifactId>spring-data-jpa</artifactId>
				    <version>1.10.5.RELEASE</version>
				</dependency>
			«ENDIF»
			
			<!-- Other dependencies -->
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
				<groupId>mysql</groupId>
				<artifactId>mysql-connector-java</artifactId>
				<version>6.0.3</version>
			</dependency>
			<dependency>
				<groupId>org.hibernate.javax.persistence</groupId>
				<artifactId>hibernate-jpa-2.1-api</artifactId>
				<version>1.0.0.Final</version>
			</dependency>
			<dependency>
				<groupId>org.hibernate</groupId>
				<artifactId>hibernate-core</artifactId>
				<version>5.2.2.Final</version>
			</dependency>
			<dependency>
				<groupId>org.hibernate</groupId>
				<artifactId>hibernate-validator</artifactId>
				<version>5.2.2.Final</version>
			</dependency>
			<dependency>
				<groupId>org.hibernate.common</groupId>
				<artifactId>hibernate-commons-annotations</artifactId>
				<version>5.0.1.Final</version>
			</dependency>
			<dependency>
				<groupId>org.hibernate</groupId>
				<artifactId>hibernate-entitymanager</artifactId>
				<version>5.2.2.Final</version>
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
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-ejb-plugin</artifactId>
					<version>${ejb.plugin.version}</version>
					<configuration>
					   	<ejbVersion>3.1</ejbVersion>
					</configuration>
				</plugin>
			</plugins>
		</build>
	'''

}
