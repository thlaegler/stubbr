package templates

import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.Project
import java.util.List
import java.util.ArrayList
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * Abstract super type for all Xtend files.
 */
abstract class AbstractXtendTemplate extends AbstractTemplate {

	private List<String> imports = new ArrayList<String>

	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileType = FileType.XTEND
	}

	/**
	 * Assemble file content with header, footer and generation-stamp.
	 */
	override def String getFileContent() '''
		«stamp»
		«header»
		
		«withImports(template)»
		«footer»
	'''
	
	/**
	 * Use this to generate import section.
	 */
	protected def String withImports(String template) '''
		import «project.basePackage».*
		«FOR String import1 : imports»
			import «import1»
		«ENDFOR»
		«template»
	'''

	/**
	 * Use this to declare to be imported type as fully qualified name. It will then store the import for generating import section later and return the Not fully qualified name.
	 */
	protected def String asImport(String fqnImport) {
		if (!imports.contains(fqnImport)) {
			if (!fqnImport.equalsIgnoreCase('long') && !fqnImport.equalsIgnoreCase('boolean') &&
				!fqnImport.equalsIgnoreCase('string') && !fqnImport.equalsIgnoreCase('int') &&
				!fqnImport.equalsIgnoreCase('integer') && !fqnImport.equalsIgnoreCase('double') &&
				!fqnImport.equalsIgnoreCase('float')) {
				imports.add(fqnImport)
			}
		}
		val int lastDot = fqnImport.lastIndexOf('.')
		if (lastDot != -1) {
			return fqnImport.substring(lastDot + 1, fqnImport.
				length)
		} else {
			return fqnImport
		}
	}

	/**
	 * Template part for type-specific javadoc.
	 */
	protected def String getJavaDocType() '''
		import com.google.gson.annotations.Since
		import com.google.gson.annotations.Until
		import javax.annotation.Generated
		
		/**
		 * «documentation»
		 * 
		 * @author «stubb?.author?.replaceAll('"','')» {@literal <«stubb?.email?.replace('@', '[at]').replaceAll('"','')»>} 
		 * @since «version?.replaceFirst('v', '')»
		 * @version «version?.replaceFirst('v', '')»
		 * @generated «currentDate»
		 */
		@«asImport('com.google.gson.annotations.Since')»(value = «version?.toVersionDouble»)
		@«asImport('com.google.gson.annotations.Until')»(value = «version?.toVersionDouble»)
		@«asImport('javax.annotation.Generated')»(value = '«templateName»')
	'''

	/**
	 * Template part for method-specific javadoc.
	 */
	protected def String getJavaDocMethod() '''
		/**
		 * «documentation»
		 * 
		 * @author «stubb?.author?.replaceAll('"','')» {@literal <«stubb?.email?.replace('@', '[at]').replaceAll('"','')»>} 
		 * @since «version?.replaceFirst('v', '')»
		 * @version «version?.replaceFirst('v', '')»
		 * @generated «currentDate»
		 */
		@«asImport('com.google.gson.annotations.Since')»(value = «version?.toVersionDouble»)
		@«asImport('com.google.gson.annotations.Until')»(value = «version?.toVersionDouble»)
		@«asImport('javax.annotation.Generated')»(value = '«templateName»')
	'''

	protected def String getLoggerName() {
		if(chapterGlobals?.loggerName != null) {
			return chapterGlobals?.loggerName
		} else {
			return 'log'
		}
	}
	
	protected def String getLoggerType() {
		if(chapterGlobals?.loggerType != null) {
			return chapterGlobals?.loggerType
		} else {
			return 'org.slf4j.Logger'
		}
	}
	
	protected def String getEntityIdType() {
		if(chapterPersistence?.javaType != null) {
			return chapterPersistence?.javaType.qualifiedName
		} else {
			return 'long'
		}
	}

}
