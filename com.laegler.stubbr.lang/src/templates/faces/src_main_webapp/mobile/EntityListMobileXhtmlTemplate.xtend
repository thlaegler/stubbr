package templates.faces.src_main_webapp.mobile

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Attribute
import com.laegler.stubbr.lang.stubbrLang.Entity
import org.eclipse.xtend.lib.annotations.Accessors
import templates.AbstractMobileXhtmlTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for JSF/XHTML mobile list view for entity.
 */
class EntityListMobileXhtmlTemplate extends AbstractMobileXhtmlTemplate {

	@Accessors
	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entity?.name?.toLowerCase»-list'''
		relativPath = '''/src/main/webapp/mobile/«entity?.name?.toLowerCase»/'''
		header = '''
			<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
			<html xmlns="http://www.w3.org/1999/xhtml"
				xmlns:ui="http://java.sun.com/jsf/facelets"
				xmlns:f="http://java.sun.com/jsf/core"
				xmlns:h="http://java.sun.com/jsf/html"
				xmlns:c="http://java.sun.com/jsp/jstl/core"
				xmlns:p="http://primefaces.org/ui">
				
				<h:head></h:head>
				<h:body>
		'''
		footer = '''
				</h:body>
			</html>
		'''
		documentation = '''JSF/XHTML mobile list view for entity «entity?.name?.toFirstUpper»'''

		content = template
	}

	private def String getTemplate() '''
		<p:dataTable value="#{«entity?.name?.toLowerCase».presenter.getAll()}" var="«entity?.name?.toLowerCase»"
			styleClass="order-table" headerClass="order-table-header"
			rowClasses="order-table-odd-row,order-table-even-row">
			
			<h:column>
				<f:facet name="header">ID</f:facet>
				<h:outputText value="#{«entity?.name?.toLowerCase».id}" />
			</h:column>
			
			«FOR Attribute attribute : entity.attributes»
				<h:column>
					<f:facet name="header">«attribute?.label?.toFirstUpper»</f:facet>
					<h:outputText value="#{«entity?.name?.toLowerCase».«attribute?.label?.toFirstLower»}" />
				</h:column>
			«ENDFOR»
		
			<h:column>
				<f:facet name="header">actions</f:facet>
				<h:link value="Edit User" outcome="edit">
					<f:param name="enterprise" value="#{enterprise.enterpriseId}" />
					<h:graphicImage library="images" name="sofa.png" />
				</h:link>
		
				<h:link value="Delete User" outcome="remove">
					<f:param name="enterprise" value="#{enterprise.enterpriseId}" />
					<h:graphicImage library="images" name="sofa.png" />
				</h:link>
			</h:column>
		</p:dataTable>
	'''

}
