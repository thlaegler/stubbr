package templates._common

import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.Project
import templates.AbstractTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for Eclipse classpath.
 */
class EclipseDotClasspathTemplateBase extends AbstractTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileType = FileType.ECLIPSE_CLASSPATH
		fileName = ''
		relativPath = '/'
		header = '''
			<?xml version="1.0" encoding="UTF-8"?>
			<classpath>
		'''
		footer = '</classpath>'
		documentation = 'Eclipse classpath'
		skipStamping = true

		content = template
	}

	private def String getTemplate() '''
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
				<attribute name="org.eclipse.jst.component.nondependency" value=""/>
			</attributes>
		</classpathentry>
		<classpathentry kind="con" path="org.eclipse.jst.server.core.container/rg.jboss.ide.eclrse.as.core.server.runtime.runtimeTarget/WildFly 10.x Runtime">
			<attributes>
				<attribute name="owner.project.facets" value="jst.jaxrs"/>
			</attributes>
		</classpathentry>
		<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-«stubbr?.stubb?.environment?.runtime?.jvm.literal»">
			<attributes>
				<attribute name="maven.pomderived" value="true"/>
			</attributes>
		</classpathentry>
		<classpathentry kind="output" path="target/classes"/>
	'''

}
