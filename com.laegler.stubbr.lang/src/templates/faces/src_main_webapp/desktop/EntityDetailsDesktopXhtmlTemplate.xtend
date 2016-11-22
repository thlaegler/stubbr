package templates.faces.src_main_webapp.desktop

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Attribute
import com.laegler.stubbr.lang.stubbrLang.Entity
import org.eclipse.xtend.lib.annotations.Accessors
import templates.AbstractDesktopXhtmlTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for JSF/XHTML desktop details page for entity.
 */
class EntityDetailsDesktopXhtmlTemplate extends AbstractDesktopXhtmlTemplate {

	@Accessors
	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entity?.name?.toLowerCase»-details'''
		relativPath = '''/src/main/webapp/desktop/«entity?.name?.toLowerCase»/'''
		documentation = '''JSF/XHTML desktop details page for entity «entity?.name?.toFirstUpper»'''

		
	}

	override def String getTemplate() '''
		<f:metadata>
			<f:viewParam name="id"
				value="#{presenter.«entity?.name?.toFirstLower».model.id}" />
			<f:event listener="#{presenter.«entity?.name?.toFirstLower».onViewLoad}"
				type="preRenderView" />
		</f:metadata>
		
		<ui:define name="cq-title">
			#{citysquire['«entity?.name?.toFirstLower».details.title']}
		</ui:define>
		
		<ui:define name="cq-pages">
		
			<pm:page id="pg-«entity?.name?.toFirstLower»-details"
				title="#{citysquire['«entity?.name?.toFirstLower».details.title']}"
				swatch="#{security.context.swatch.swatchName}" styleClass="cq-page"
				lazy="false">
				<pm:header styleClass="cq-header"
					title="#{citysquire['enterprise.«entity?.name?.toFirstLower».details.title']}"
					fixed="true">
					<cq:header backButtonLink="/mobile/enterprise/«entity?.name?.toFirstLower»/index" />
				</pm:header>
		
				<pm:content styleClass="cq-content">
					<h:form id="frm-details">
						<p:growl id="growl" showDetail="false" autoUpdate="true" />
		
						«FOR Attribute attribute : entity?.attributes»
							<ui:remove>
								<!-- «attribute?.name?.toFirstLower» -->
							</ui:remove>
							<pm:field>
								<p:outputLabel for="«entity?.name?.toFirstLower»"
									value="#{citysquire['«entity?.name?.toFirstLower».details.«attribute?.name?.toFirstLower»']}" />
								<h:inputText id="email" alt="#{citysquire['«entity?.name?.toFirstLower».details.«attribute?.name?.toFirstLower»']}"
									title="#{citysquire['«entity?.name?.toFirstLower».details.«attribute?.name?.toFirstLower»']}"
									value="#{presenter.«entity?.name?.toLowerCase».«attribute?.name?.toFirstLower»}" />
								<p:watermark for="«attribute?.name?.toFirstLower»"
									value="#{citysquire['«entity?.name?.toFirstLower».details.«attribute?.name?.toFirstLower»']}" />
								<p:message for="«attribute?.name?.toFirstLower»" />
							</pm:field>
						«ENDFOR»
		
						<pm:field rendered="#{not empty presenter.«entity?.name?.toFirstLower».bean.code}">
							<p:barcode id="«entity?.name?.toFirstLower»-code-image" width="100%"
								alt="#{citysquire['enterprise.«entity?.name?.toFirstLower».details.code']}"
								title="#{citysquire['enterprise.«entity?.name?.toFirstLower».details.code']}"
								value="#{presenter.«entity?.name?.toFirstLower».bean.code}" type="qr" />
						</pm:field>
		
						<ui:remove>
							<!-- Submit Create -->
						</ui:remove>
						<pm:field>
							<p:commandButton id="bttn-submit" process="@form" 
								update="@form growl"
								action="#{presenter.«entity?.name?.toLowerCase».submit()}"
								alt="#{citysquire['«entity?.name?.toFirstLower».details.submit']}"
								title="#{citysquire['«entity?.name?.toFirstLower».details.submit']}"
								value="#{citysquire['«entity?.name?.toFirstLower».details.submit']}">
								<f:param name="id"
									value="#{presenter.«entity?.name?.toLowerCase».model.id}" />
								<f:attribute name="id"
									value="#{presenter.«entity?.name?.toLowerCase».model.id}" />
							</p:commandButton>
						</pm:field>
					</h:form>
				</pm:content>
			</pm:page>
		
		</ui:define>
	'''

}
