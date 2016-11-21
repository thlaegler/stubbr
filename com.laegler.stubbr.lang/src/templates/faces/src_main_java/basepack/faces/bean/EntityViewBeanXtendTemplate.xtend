package templates.faces.src_main_java.basepack.faces.bean

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.stubbrLang.Attribute

/**
 * File template for JSF/Faces view bean for entity.
 */
class EntityViewBeanXtendTemplate extends AbstractXtendTemplate {

	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entity?.name?.toFirstUpper»ViewBean'''
		header = '''package «project.basePackage».bean'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/bean/'''
		documentation = '''JSF/Faces view bean for entity «entity?.name?.toFirstUpper»'''

		content = withImports(template)
	}

	private def String getTemplate() '''
		import «project.basePackage».*
		import «stubbr?.stubb?.packageName».model.entity.*
		import com.google.gson.annotations.Until
		import javax.annotation.Generated
		import javax.annotation.security.PermitAll
		import org.slf4j.Logger
		
		«javaDocType»
		@«asImport('javax.enterprise.context.RequestScoped')»
		@«asImport('org.eclipse.xtend.lib.annotations.Accessors')»
		class «fileName» implements «asImport('java.io.Serializable')» {
			
			«IF !chapterPersistence.customIds»
				@«asImport('com.google.gson.annotations.Since')»(«project.version.toVersionDouble»)
				@«asImport('com.google.gson.annotations.Until')»(«project.version.toVersionDouble»)
				private «asImport(stubbr?.stubb?.persistence?.javaType?.getQualifiedName)» id
				
			«ENDIF»
			«FOR Attribute attribute : entity?.attributes»
				@«asImport('com.google.gson.annotations.Since')»(«project.version.toVersionDouble»)
				@«asImport('com.google.gson.annotations.Until')»(«project.version.toVersionDouble»)
				private «IF attribute?.javaType != null»«asImport(attribute?.javaType?.qualifiedName)»«ELSE»«asImport(stubbr?.stubb?.packageName + '.model.entity.' + attribute?.type?.name)»«ENDIF» «attribute?.name?.toFirstLower»
				
			«ENDFOR»
		
		}
	'''

}
