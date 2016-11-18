package templates.business.src_main_java_basepack.business.object

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import com.laegler.stubbr.lang.stubbrLang.Attribute
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for business object.
 */
class BusinessObjectXtendTemplate extends AbstractXtendTemplate {

	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entity?.name?.toFirstUpper»BusinessObject'''
		header = '''package «project.basePackage».object'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/object/'''
		documentation = '''Business object for entity «entity?.name?.toFirstUpper»'''

		content = withImports(template)
	}

	private def String getTemplate() '''
		«javaDocType»
		@«asImport('org.eclipse.xtend.lib.annotations.Accessors')»
		@«asImport('javax.xml.bind.annotation.XmlRootElement')»
		class «fileName» implements «asImport('java.io.Serializable')» {
			
			new(«entity?.name?.toFirstUpper» «entity?.name?.toFirstLower») {
				«IF !stubbr?.stubb?.persistence.customIds»
					this.id = «entity?.name?.toFirstLower».id
				«ENDIF»
				«FOR Attribute attribute : entity?.attributes»
					this.«attribute?.name?.toFirstLower» = «entity?.name?.toFirstLower».id
				«ENDFOR»
			}
			
			«IF !stubbr?.stubb?.persistence.customIds»
				/**
				 * ID / primary key of entity «entity?.name?.toFirstUpper»
				 */
				private «asImport(stubbr?.stubb?.persistence?.javaType?.getQualifiedName)» id
				
			«ENDIF»
			«FOR Attribute attribute : entity?.attributes»
				/**
				 * «attribute?.documentation»
				 */
				@«asImport('com.google.gson.annotations.Until')»(«project.version.toVersionDouble»)
				@«asImport('com.fasterxml.jackson.annotation.JsonProperty')»('«attribute?.name?.toFirstLower»')
				@«asImport('javax.xml.bind.annotation.XmlElement')»
				@«asImport('com.google.gson.annotations.Expose')»(serialize=true, deserialize=true)
				private «IF attribute?.javaType != null»«asImport(attribute?.javaType?.qualifiedName)»«ELSE»«asImport(stubbr?.stubb?.packageName + '.model.entity.' + attribute?.type?.name)»«ENDIF» «attribute?.name?.toFirstLower»
				
			«ENDFOR»
		}
	'''

}
