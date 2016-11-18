package templates.soap.server

import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.genmodel.Project
import templates._common.PomXmlTemplateBase

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

		content = template
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
				<artifactId>«stubbr?.stubb?.name?.toLowerCase»-model</artifactId>
				<version>${project.version}</version>
			</dependency>
			<dependency>
				<groupId>${project.groupId}</groupId>
				<artifactId>«stubbr?.stubb?.name?.toLowerCase»-persistence</artifactId>
				<version>${project.version}</version>
			</dependency>
			<dependency>
				<groupId>${project.groupId}</groupId>
				<artifactId>«stubbr?.stubb?.name?.toLowerCase»-business</artifactId>
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
					<groupId>org.codehaus.mojo</groupId>
					<artifactId>jaxws-maven-plugin</artifactId>
					<executions>
						<execution>
							<id>generate-wsdl</id>
							<phase>process-classes</phase>
							<goals>
								<goal>wsgen</goal>
							</goals>
							<configuration>
								<sei><!-- fully qualified class name goes here --></sei>
								<genWsdl>true</genWsdl>
							</configuration>
						</execution>
						<execution>
							<id>generate-stubs</id>
							<phase>process-classes</phase>
							<goals>
								<goal>wsimport</goal>
							</goals>
							<configuration>
								<wsdlDirectory>target/jaxws/wsgen/wsdl</wsdlDirectory>
								<wsdlFiles>				   
									<wsdlFile><!-- class name goes here -->Service.wsdl</wsdlFile>
								</wsdlFiles>
								<!-- *** you need the next line to set the wsdlLocation in the generated stubs *** -->
								<wsdlLocation>http://localhost:8080/test</wsdlLocation> 
							</configuration>
						</execution>
					</executions>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-jar-plugin</artifactId>
					<executions>
						<execution>
							<id>package-wsclient-jars</id>
							<phase>package</phase>
							<goals>
								<goal>jar</goal>
							</goals>
							<configuration>
								<classesDirectory>target/jaxws/<!-- rest of the path here, can't remember it right now --></classesDirectory>
								<classifier>wsclient</classifier>
							</configuration>
						</execution>
					</executions>
				</plugin>
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

}
