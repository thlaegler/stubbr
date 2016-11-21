//package templates.rest.client
//
//import com.laegler.stubbr.lang.genmodel.StubbrRegistry
//import javax.inject.Inject
//import com.laegler.stubbr.lang.generator.repository.ProjectType
//
///**
// * File Generator for Maven pom.xml
// */
//class PomFile extends templates._common.PomFile {
//
//	@Inject extension StubbrRegistry
//
//	override public getTemplateName() '''«this.class.name»'''
//
//	override public ProjectType getProject() { ProjectType.REST_CLIENT }
//
//	override public getTemplate() '''
//		«header»
//			«parentSection»
//		
//			<artifactId>«projectName»</artifactId>
//			<name>«stubb?.name?.toFirstUpper» Rest Client Project</name>
//			<packaging>«project?.getPackaging»</packaging>
//		
//			<dependencies>
//				<!-- Project internal -->
//				<dependency>
//					<groupId>${project.groupId}</groupId>
//					<artifactId>«stubb?.name?.toLowerCase»-common</artifactId>
//					<version>${project.version}</version>
//				</dependency>
//				<dependency>
//					<groupId>${project.groupId}</groupId>
//					<artifactId>«stubb?.name?.toLowerCase»-model</artifactId>
//					<version>${project.version}</version>
//				</dependency>
//				<dependency>
//					<groupId>${project.groupId}</groupId>
//					<artifactId>«stubb?.name?.toLowerCase»-persistence</artifactId>
//					<version>${project.version}</version>
//				</dependency>
//				
//				<dependency>
//					<groupId>org.wildfly.bom</groupId>
//					<artifactId>wildfly-javaee7-with-tools</artifactId>
//					<version>${wildfly.bom.version}</version>
//					<type>pom</type>
//				</dependency>
//				<dependency>
//					<groupId>javax.enterprise</groupId>
//					<artifactId>cdi-api</artifactId>
//				</dependency>
//				<dependency>
//					<groupId>org.jboss.spec.javax.ejb</groupId>
//					<artifactId>jboss-ejb-api_3.2_spec</artifactId>
//				</dependency>
//				<dependency>
//					<groupId>org.jboss.spec.javax.annotation</groupId>
//					<artifactId>jboss-annotations-api_1.2_spec</artifactId>
//				</dependency>
//				<dependency>
//					<groupId>org.jboss.resteasy</groupId>
//					<artifactId>resteasy-jaxrs</artifactId>
//					<version>3.1.0.Beta1</version>
//				</dependency>
//				<dependency>
//					<groupId>io.rest-assured</groupId>
//					<artifactId>rest-assured</artifactId>
//					<version>3.0.0</version>
//				</dependency>
//				<dependency>
//					<groupId>org.eclipse.xtend</groupId>
//					<artifactId>org.eclipse.xtend.lib</artifactId>
//				</dependency>
//				<dependency>
//					<groupId>org.slf4j</groupId>
//					<artifactId>slf4j-api</artifactId>
//				</dependency>
//				<dependency>
//					<groupId>joda-time</groupId>
//					<artifactId>joda-time</artifactId>
//				</dependency>
//				<dependency>
//					<groupId>com.google.code.gson</groupId>
//					<artifactId>gson</artifactId>
//				</dependency>
//				<dependency>
//					<groupId>junit</groupId>
//					<artifactId>junit</artifactId>
//					<scope>test</scope>
//				</dependency>
//				<dependency>
//					<groupId>org.mockito</groupId>
//					<artifactId>mockito-all</artifactId>
//					<scope>test</scope>
//				</dependency>
//				<dependency>
//					<groupId>org.powermock</groupId>
//					<artifactId>powermock-api-mockito</artifactId>
//					<scope>test</scope>
//				</dependency>
//				<dependency>
//					<groupId>info.cukes</groupId>
//					<artifactId>cucumber-core</artifactId>
//					<scope>test</scope>
//				</dependency>
//				<dependency>
//					<groupId>info.cukes</groupId>
//					<artifactId>cucumber-java</artifactId>
//					<scope>test</scope>
//				</dependency>
//				<dependency>
//					<groupId>info.cukes</groupId>
//					<artifactId>cucumber-junit</artifactId>
//					<scope>test</scope>
//				</dependency>
//				<dependency>
//					<groupId>info.cukes</groupId>
//					<artifactId>gherkin</artifactId>
//					<scope>test</scope>
//				</dependency>
//			</dependencies>
//		
//			<build>
//				<finalName>${project.artifactId}</finalName>
//
//				<plugins>
//					<plugin>
//						<groupId>org.apache.maven</groupId>
//						<artifactId>maven-war-plugin</artifactId>
//						<version>${war.plugin.version}</version>
//						<configuration>
//							<failOnMissingWebXml>false</failOnMissingWebXml>
//							<webXml>src/main/webapp/WEB-INF/web.xml</webXml>
//						</configuration>
//					</plugin>
//				</plugins>
//			</build>
//		«footer»
//	'''
//
//}
