package templates

import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.Project
import java.util.List
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * Abstract super type for all Java files.
 */
abstract class AbstractJavaTemplate extends AbstractTemplate {

	private List<String> imports

	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		this.fileType = FileType.JAVA
	}

	/**
	 * Use this to generate import section.
	 */
	protected def String withImport(String template) '''
		import «project.basePackage».*;
		«FOR String import1 : imports»
			import «import1»;
		«ENDFOR»
		«template»
	'''

	/**
	 * Use this to declare to be imported type as fully qualified name. It will then store the import for generating import section later and return the Not fully qualified name.
	 */
	protected def String asImport(String fqnImport) {
		imports.add(fqnImport)
		val int lastDot = fqnImport.lastIndexOf('//.')
		fqnImport.substring(lastDot, fqnImport.
			length)
	}
	
	/**
	 * Template part for type-specific javadoc.
	 */
	protected def String getJavaDocType() '''
		import javax.annotation.Generated;
		import com.google.gson.annotations.Until;
		import com.google.gson.annotations.Since;
		
		/**
		 * «documentation»
		 * 
		 * @author «stubbr.stubb.author?.replaceAll('"','')» {@literal <«stubbr.stubb.email?.replace('@', '[at]').replaceAll('"','')»>} 
		 * @since «version»
		 * @version «version»
		 * @generated «currentDate»
		 */
		//@Since(«version»)
		@Until(0.0)
		@Generated(value = '«templateName»')
	'''

	/**
	 * Template part for method-specific javadoc.
	 */
	protected def String getJavaDocMethod() '''
		/**
		 * «documentation»
		 * 
		 * @author «stubbr.stubb.author?.replaceAll('"','')» {@literal <«stubbr.stubb.email?.replace('@', '[at]').replaceAll('"','')»>} 
		 * @since «version»
		 * @version «version»
		 * @generated «currentDate»
		 */
		//@Since(«version»)
		@Until(0.0)
	'''

}
