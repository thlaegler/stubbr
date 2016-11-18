package templates.rest.client

import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import javax.inject.Inject
import com.laegler.stubbr.lang.generator.repository.ProjectType

/**
 * File Generator for .classpath
 */
class DotClasspathFile extends templates._common.DotClasspathFile {

	@Inject extension StubbrRegistry

	override public getTemplateName() '''«this.class.name»'''

	override public ProjectType getProject() { ProjectType.REST_CLIENT }

	override public getTemplate() '''
		«header»
			<classpathentry kind="con" path="org.eclipse.xtend.XTEND_CONTAINER"/>
			<classpathentry kind="src" output="target/classes" path="src/main/java">
				<attributes>
					<attribute name="optional" value="true"/>
					<attribute name="maven.pomderived" value="true"/>
				</attributes>
			</classpathentry>
			
			<classpathentry kind="src" output="target/classes" path="src-gen/main/java">
				<attributes>
					<attribute name="optional" value="true"/>
					<attribute name="maven.pomderived" value="true"/>
				</attributes>
			</classpathentry>
		
			<classpathentry kind="src" output="target/classes" path="src/main/xtend-gen">
				<attributes>
					<attribute name="optional" value="true"/>
					<attribute name="maven.pomderived" value="true"/>
				</attributes>
			</classpathentry>
		
			<classpathentry kind="src" output="target/test-classes" path="src/test/java">
				<attributes>
					<attribute name="optional" value="true"/>
					<attribute name="maven.pomderived" value="true"/>
				</attributes>
			</classpathentry>
			
			<classpathentry kind="src" output="target/test-classes" path="src-gen/test/java">
				<attributes>
					<attribute name="optional" value="true"/>
					<attribute name="maven.pomderived" value="true"/>
				</attributes>
			</classpathentry>
		
			<classpathentry kind="src" output="target/test-classes" path="src/test/xtend-gen">
				<attributes>
					<attribute name="optional" value="true"/>
					<attribute name="maven.pomderived" value="true"/>
				</attributes>
			</classpathentry>
			
			<classpathentry kind="src" output="target/classes" path="src/main/resources" excluding="**">
				<attributes>
					<attribute name="optional" value="true"/>
					<attribute name="maven.pomderived" value="true"/>
				</attributes>
			</classpathentry>
			
			<classpathentry kind="src" output="target/test-classes" path="src/test/resources" excluding="**">
				<attributes>
					<attribute name="optional" value="true"/>
					<attribute name="maven.pomderived" value="true"/>
				</attributes>
			</classpathentry>
			
			<classpathentry kind="con" path="org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER">
				<attributes>
					<attribute name="maven.pomderived" value="true"/>
«««					<attribute name="org.eclipse.jst.component.dependency" value="/WEB-INF/lib"/>
					<attribute name="org.eclipse.jst.component.nondependency" value=""/>
				</attributes>
			</classpathentry>

			<classpathentry kind="con" path="org.eclipse.jst.server.core.container/org.jboss.ide.eclipse.as.core.server.runtime.runtimeTarget/WildFly 10.x Runtime">
				<attributes>
					<attribute name="owner.project.facets" value="jst.jaxrs"/>
				</attributes>
			</classpathentry>

			<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-«stubb.environment?.runtime?.jvm.literal»">
				<attributes>
					<attribute name="maven.pomderived" value="true"/>
				</attributes>
			</classpathentry>
			<classpathentry kind="output" path="target/classes"/>
		«footer»
	'''

}
