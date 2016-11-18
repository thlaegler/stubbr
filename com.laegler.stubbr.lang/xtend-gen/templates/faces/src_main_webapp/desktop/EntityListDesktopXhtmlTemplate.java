package templates.faces.src_main_webapp.desktop;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Attribute;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractDesktopXhtmlTemplate;

/**
 * File template for JSF/XHTML desktop list view for entity.
 */
@SuppressWarnings("all")
public class EntityListDesktopXhtmlTemplate extends AbstractDesktopXhtmlTemplate {
  @Accessors
  private Entity entity;
  
  public EntityListDesktopXhtmlTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
    super(stubbr, project);
    this.entity = entity;
    StringConcatenation _builder = new StringConcatenation();
    String _name = null;
    if (entity!=null) {
      _name=entity.getName();
    }
    String _lowerCase = null;
    if (_name!=null) {
      _lowerCase=_name.toLowerCase();
    }
    _builder.append(_lowerCase, "");
    _builder.append("-list");
    this.setFileName(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("/src/main/webapp/desktop/");
    String _name_1 = null;
    if (entity!=null) {
      _name_1=entity.getName();
    }
    String _lowerCase_1 = null;
    if (_name_1!=null) {
      _lowerCase_1=_name_1.toLowerCase();
    }
    _builder_1.append(_lowerCase_1, "");
    _builder_1.append("/");
    this.setRelativPath(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("JSF/XHTML desktop list view for entity ");
    String _name_2 = null;
    if (entity!=null) {
      _name_2=entity.getName();
    }
    String _firstUpper = null;
    if (_name_2!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name_2);
    }
    _builder_2.append(_firstUpper, "");
    this.setDocumentation(_builder_2.toString());
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p:dataTable value=\"#{");
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _lowerCase = null;
    if (_name!=null) {
      _lowerCase=_name.toLowerCase();
    }
    _builder.append(_lowerCase, "");
    _builder.append(".presenter.getAll()}\" var=\"");
    String _name_1 = null;
    if (this.entity!=null) {
      _name_1=this.entity.getName();
    }
    String _lowerCase_1 = null;
    if (_name_1!=null) {
      _lowerCase_1=_name_1.toLowerCase();
    }
    _builder.append(_lowerCase_1, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("styleClass=\"order-table\" headerClass=\"order-table-header\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rowClasses=\"order-table-odd-row,order-table-even-row\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h:column>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<f:facet name=\"header\">ID</f:facet>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h:outputText value=\"#{");
    String _name_2 = null;
    if (this.entity!=null) {
      _name_2=this.entity.getName();
    }
    String _lowerCase_2 = null;
    if (_name_2!=null) {
      _lowerCase_2=_name_2.toLowerCase();
    }
    _builder.append(_lowerCase_2, "\t\t");
    _builder.append(".id}\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</h:column>");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Attribute> _attributes = this.entity.getAttributes();
      for(final Attribute attribute : _attributes) {
        _builder.append("\t");
        _builder.append("<h:column>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<f:facet name=\"header\">");
        String _label = null;
        if (attribute!=null) {
          _label=attribute.getLabel();
        }
        String _firstUpper = null;
        if (_label!=null) {
          _firstUpper=StringExtensions.toFirstUpper(_label);
        }
        _builder.append(_firstUpper, "\t\t");
        _builder.append("</f:facet>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<h:outputText value=\"#{");
        String _name_3 = null;
        if (this.entity!=null) {
          _name_3=this.entity.getName();
        }
        String _lowerCase_3 = null;
        if (_name_3!=null) {
          _lowerCase_3=_name_3.toLowerCase();
        }
        _builder.append(_lowerCase_3, "\t\t");
        _builder.append(".");
        String _label_1 = null;
        if (attribute!=null) {
          _label_1=attribute.getLabel();
        }
        String _firstLower = null;
        if (_label_1!=null) {
          _firstLower=StringExtensions.toFirstLower(_label_1);
        }
        _builder.append(_firstLower, "\t\t");
        _builder.append("}\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</h:column>");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h:column>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<f:facet name=\"header\">actions</f:facet>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h:link value=\"Edit User\" outcome=\"edit\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<f:param name=\"enterprise\" value=\"#{enterprise.enterpriseId}\" />");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h:graphicImage library=\"images\" name=\"sofa.png\" />");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</h:link>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h:link value=\"Delete User\" outcome=\"remove\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<f:param name=\"enterprise\" value=\"#{enterprise.enterpriseId}\" />");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h:graphicImage library=\"images\" name=\"sofa.png\" />");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</h:link>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</h:column>");
    _builder.newLine();
    _builder.append("</p:dataTable>");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Pure
  public Entity getEntity() {
    return this.entity;
  }
  
  public void setEntity(final Entity entity) {
    this.entity = entity;
  }
}
