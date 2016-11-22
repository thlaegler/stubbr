package templates.parent

import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.genmodel.Project
import templates._common.EclipseDotClasspathTemplateBase

/**
 * File template for Eclipse classpath for parent project.
 */
class EclipseDotClasspathTemplate extends EclipseDotClasspathTemplateBase {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		relativPath = '/'
		documentation = 'Eclipse classpath for parent project'
	}

	override def String getTemplate() '''
		<classpathentry kind="src" path="src"/>
		<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8"/>
		<classpathentry kind="output" path="target/classes"/>
	'''

}
