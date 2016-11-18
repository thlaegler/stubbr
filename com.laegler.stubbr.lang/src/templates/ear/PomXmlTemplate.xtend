package templates.ear

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.ProjectType
import templates._common.PomXmlTemplateBase
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File Generator for Maven project object model (pom.xml) for EAR project.
 */
class PomXmlTemplate extends PomXmlTemplateBase {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		documentation = '''«this.documentation» for EAR project'''
		
		content = template
	}

	private def String getTemplate() '''
		«parentSection»
		
		<artifactId>«project.name»</artifactId>
		<name>«stubbr.stubb?.name?.toFirstUpper» EAR Project</name>
		<packaging>«project.packaging»</packaging>
	
		<dependencies>
			<!-- Project internal -->
			«FOR Project project : stubbr?.projects»
				«IF project != null && !project.name.nullOrEmpty && project?.projectType != ProjectType.PARENT»
					<dependency>
						<groupId>${project.groupId}</groupId>
						<artifactId>«project?.name»</artifactId>
						<version>${project.version}</version>
					</dependency>
				«ENDIF»
			«ENDFOR»
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
			<artifactId>maven-ear-plugin</artifactId>
			<version>${ear.plugin.version}</version>
			<configuration>
				<defaultLibBundleDir>lib/</defaultLibBundleDir>
				<fileNameMapping>no-version</fileNameMapping>
				<skinnyWars>true</skinnyWars>
				<version>7</version>
				<includeInApplicationXml>true</includeInApplicationXml>
				<archive>
					<manifest>
						<addClasspath>true</addClasspath>
					</manifest>
				</archive>
				<modules>
					«FOR Project project : stubbr?.projects»
						«IF project != null && !project.name.nullOrEmpty && project?.projectType != ProjectType.PARENT»
							«IF project?.getPackaging.equals('jar')»
								<jarModule>
									<groupId>${project.groupId}</groupId>
									<artifactId>«project?.name»</artifactId>
								</jarModule>
							«ELSEIF project?.getPackaging.equals('ejb')»
								<ejbModule>
									<groupId>${project.groupId}</groupId>
									<artifactId>«project?.name»</artifactId>
									<bundleDir>/</bundleDir>
								</ejbModule>
							«ELSEIF project?.getPackaging.equals('war')»
								<webModule>
									<groupId>${project.groupId}</groupId>
									<artifactId>«project?.name»</artifactId>
									<contextRoot>/</contextRoot>
								</webModule>
							«ENDIF»
						«ENDIF»
					«ENDFOR»
				</modules>
			</configuration>
		</plugin>
			</plugins>
		</build>
	'''

}
