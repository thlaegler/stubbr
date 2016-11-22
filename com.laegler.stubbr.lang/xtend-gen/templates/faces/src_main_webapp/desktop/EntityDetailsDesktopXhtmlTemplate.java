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
 * File template for JSF/XHTML desktop details page for entity.
 */
@SuppressWarnings("all")
public class EntityDetailsDesktopXhtmlTemplate extends AbstractDesktopXhtmlTemplate {
  @Accessors
  private Entity entity;
  
  public EntityDetailsDesktopXhtmlTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
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
    _builder.append("-details");
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
    _builder_2.append("JSF/XHTML desktop details page for entity ");
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
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<f:metadata>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<f:viewParam name=\"id\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("value=\"#{presenter.");
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _firstLower = null;
    if (_name!=null) {
      _firstLower=StringExtensions.toFirstLower(_name);
    }
    _builder.append(_firstLower, "\t\t");
    _builder.append(".model.id}\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<f:event listener=\"#{presenter.");
    String _name_1 = null;
    if (this.entity!=null) {
      _name_1=this.entity.getName();
    }
    String _firstLower_1 = null;
    if (_name_1!=null) {
      _firstLower_1=StringExtensions.toFirstLower(_name_1);
    }
    _builder.append(_firstLower_1, "\t");
    _builder.append(".onViewLoad}\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("type=\"preRenderView\" />");
    _builder.newLine();
    _builder.append("</f:metadata>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<ui:define name=\"cq-title\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#{citysquire[\'");
    String _name_2 = null;
    if (this.entity!=null) {
      _name_2=this.entity.getName();
    }
    String _firstLower_2 = null;
    if (_name_2!=null) {
      _firstLower_2=StringExtensions.toFirstLower(_name_2);
    }
    _builder.append(_firstLower_2, "\t");
    _builder.append(".details.title\']}");
    _builder.newLineIfNotEmpty();
    _builder.append("</ui:define>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<ui:define name=\"cq-pages\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<pm:page id=\"pg-");
    String _name_3 = null;
    if (this.entity!=null) {
      _name_3=this.entity.getName();
    }
    String _firstLower_3 = null;
    if (_name_3!=null) {
      _firstLower_3=StringExtensions.toFirstLower(_name_3);
    }
    _builder.append(_firstLower_3, "\t");
    _builder.append("-details\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("title=\"#{citysquire[\'");
    String _name_4 = null;
    if (this.entity!=null) {
      _name_4=this.entity.getName();
    }
    String _firstLower_4 = null;
    if (_name_4!=null) {
      _firstLower_4=StringExtensions.toFirstLower(_name_4);
    }
    _builder.append(_firstLower_4, "\t\t");
    _builder.append(".details.title\']}\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("swatch=\"#{security.context.swatch.swatchName}\" styleClass=\"cq-page\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("lazy=\"false\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<pm:header styleClass=\"cq-header\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("title=\"#{citysquire[\'enterprise.");
    String _name_5 = null;
    if (this.entity!=null) {
      _name_5=this.entity.getName();
    }
    String _firstLower_5 = null;
    if (_name_5!=null) {
      _firstLower_5=StringExtensions.toFirstLower(_name_5);
    }
    _builder.append(_firstLower_5, "\t\t\t");
    _builder.append(".details.title\']}\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("fixed=\"true\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<cq:header backButtonLink=\"/mobile/enterprise/");
    String _name_6 = null;
    if (this.entity!=null) {
      _name_6=this.entity.getName();
    }
    String _firstLower_6 = null;
    if (_name_6!=null) {
      _firstLower_6=StringExtensions.toFirstLower(_name_6);
    }
    _builder.append(_firstLower_6, "\t\t\t");
    _builder.append("/index\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</pm:header>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<pm:content styleClass=\"cq-content\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h:form id=\"frm-details\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<p:growl id=\"growl\" showDetail=\"false\" autoUpdate=\"true\" />");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Attribute> _attributes = null;
      if (this.entity!=null) {
        _attributes=this.entity.getAttributes();
      }
      for(final Attribute attribute : _attributes) {
        _builder.append("\t\t\t\t");
        _builder.append("<ui:remove>");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("\t");
        _builder.append("<!-- ");
        String _name_7 = null;
        if (attribute!=null) {
          _name_7=attribute.getName();
        }
        String _firstLower_7 = null;
        if (_name_7!=null) {
          _firstLower_7=StringExtensions.toFirstLower(_name_7);
        }
        _builder.append(_firstLower_7, "\t\t\t\t\t");
        _builder.append(" -->");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("</ui:remove>");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("<pm:field>");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("\t");
        _builder.append("<p:outputLabel for=\"");
        String _name_8 = null;
        if (this.entity!=null) {
          _name_8=this.entity.getName();
        }
        String _firstLower_8 = null;
        if (_name_8!=null) {
          _firstLower_8=StringExtensions.toFirstLower(_name_8);
        }
        _builder.append(_firstLower_8, "\t\t\t\t\t");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("\t\t");
        _builder.append("value=\"#{citysquire[\'");
        String _name_9 = null;
        if (this.entity!=null) {
          _name_9=this.entity.getName();
        }
        String _firstLower_9 = null;
        if (_name_9!=null) {
          _firstLower_9=StringExtensions.toFirstLower(_name_9);
        }
        _builder.append(_firstLower_9, "\t\t\t\t\t\t");
        _builder.append(".details.");
        String _name_10 = null;
        if (attribute!=null) {
          _name_10=attribute.getName();
        }
        String _firstLower_10 = null;
        if (_name_10!=null) {
          _firstLower_10=StringExtensions.toFirstLower(_name_10);
        }
        _builder.append(_firstLower_10, "\t\t\t\t\t\t");
        _builder.append("\']}\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("\t");
        _builder.append("<h:inputText id=\"email\" alt=\"#{citysquire[\'");
        String _name_11 = null;
        if (this.entity!=null) {
          _name_11=this.entity.getName();
        }
        String _firstLower_11 = null;
        if (_name_11!=null) {
          _firstLower_11=StringExtensions.toFirstLower(_name_11);
        }
        _builder.append(_firstLower_11, "\t\t\t\t\t");
        _builder.append(".details.");
        String _name_12 = null;
        if (attribute!=null) {
          _name_12=attribute.getName();
        }
        String _firstLower_12 = null;
        if (_name_12!=null) {
          _firstLower_12=StringExtensions.toFirstLower(_name_12);
        }
        _builder.append(_firstLower_12, "\t\t\t\t\t");
        _builder.append("\']}\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("\t\t");
        _builder.append("title=\"#{citysquire[\'");
        String _name_13 = null;
        if (this.entity!=null) {
          _name_13=this.entity.getName();
        }
        String _firstLower_13 = null;
        if (_name_13!=null) {
          _firstLower_13=StringExtensions.toFirstLower(_name_13);
        }
        _builder.append(_firstLower_13, "\t\t\t\t\t\t");
        _builder.append(".details.");
        String _name_14 = null;
        if (attribute!=null) {
          _name_14=attribute.getName();
        }
        String _firstLower_14 = null;
        if (_name_14!=null) {
          _firstLower_14=StringExtensions.toFirstLower(_name_14);
        }
        _builder.append(_firstLower_14, "\t\t\t\t\t\t");
        _builder.append("\']}\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("\t\t");
        _builder.append("value=\"#{presenter.");
        String _name_15 = null;
        if (this.entity!=null) {
          _name_15=this.entity.getName();
        }
        String _lowerCase = null;
        if (_name_15!=null) {
          _lowerCase=_name_15.toLowerCase();
        }
        _builder.append(_lowerCase, "\t\t\t\t\t\t");
        _builder.append(".");
        String _name_16 = null;
        if (attribute!=null) {
          _name_16=attribute.getName();
        }
        String _firstLower_15 = null;
        if (_name_16!=null) {
          _firstLower_15=StringExtensions.toFirstLower(_name_16);
        }
        _builder.append(_firstLower_15, "\t\t\t\t\t\t");
        _builder.append("}\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("\t");
        _builder.append("<p:watermark for=\"");
        String _name_17 = null;
        if (attribute!=null) {
          _name_17=attribute.getName();
        }
        String _firstLower_16 = null;
        if (_name_17!=null) {
          _firstLower_16=StringExtensions.toFirstLower(_name_17);
        }
        _builder.append(_firstLower_16, "\t\t\t\t\t");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("\t\t");
        _builder.append("value=\"#{citysquire[\'");
        String _name_18 = null;
        if (this.entity!=null) {
          _name_18=this.entity.getName();
        }
        String _firstLower_17 = null;
        if (_name_18!=null) {
          _firstLower_17=StringExtensions.toFirstLower(_name_18);
        }
        _builder.append(_firstLower_17, "\t\t\t\t\t\t");
        _builder.append(".details.");
        String _name_19 = null;
        if (attribute!=null) {
          _name_19=attribute.getName();
        }
        String _firstLower_18 = null;
        if (_name_19!=null) {
          _firstLower_18=StringExtensions.toFirstLower(_name_19);
        }
        _builder.append(_firstLower_18, "\t\t\t\t\t\t");
        _builder.append("\']}\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("\t");
        _builder.append("<p:message for=\"");
        String _name_20 = null;
        if (attribute!=null) {
          _name_20=attribute.getName();
        }
        String _firstLower_19 = null;
        if (_name_20!=null) {
          _firstLower_19=StringExtensions.toFirstLower(_name_20);
        }
        _builder.append(_firstLower_19, "\t\t\t\t\t");
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("</pm:field>");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<pm:field rendered=\"#{not empty presenter.");
    String _name_21 = null;
    if (this.entity!=null) {
      _name_21=this.entity.getName();
    }
    String _firstLower_20 = null;
    if (_name_21!=null) {
      _firstLower_20=StringExtensions.toFirstLower(_name_21);
    }
    _builder.append(_firstLower_20, "\t\t\t\t");
    _builder.append(".bean.code}\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.append("<p:barcode id=\"");
    String _name_22 = null;
    if (this.entity!=null) {
      _name_22=this.entity.getName();
    }
    String _firstLower_21 = null;
    if (_name_22!=null) {
      _firstLower_21=StringExtensions.toFirstLower(_name_22);
    }
    _builder.append(_firstLower_21, "\t\t\t\t\t");
    _builder.append("-code-image\" width=\"100%\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("alt=\"#{citysquire[\'enterprise.");
    String _name_23 = null;
    if (this.entity!=null) {
      _name_23=this.entity.getName();
    }
    String _firstLower_22 = null;
    if (_name_23!=null) {
      _firstLower_22=StringExtensions.toFirstLower(_name_23);
    }
    _builder.append(_firstLower_22, "\t\t\t\t\t\t");
    _builder.append(".details.code\']}\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("title=\"#{citysquire[\'enterprise.");
    String _name_24 = null;
    if (this.entity!=null) {
      _name_24=this.entity.getName();
    }
    String _firstLower_23 = null;
    if (_name_24!=null) {
      _firstLower_23=StringExtensions.toFirstLower(_name_24);
    }
    _builder.append(_firstLower_23, "\t\t\t\t\t\t");
    _builder.append(".details.code\']}\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("value=\"#{presenter.");
    String _name_25 = null;
    if (this.entity!=null) {
      _name_25=this.entity.getName();
    }
    String _firstLower_24 = null;
    if (_name_25!=null) {
      _firstLower_24=StringExtensions.toFirstLower(_name_25);
    }
    _builder.append(_firstLower_24, "\t\t\t\t\t\t");
    _builder.append(".bean.code}\" type=\"qr\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("</pm:field>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<ui:remove>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<!-- Submit Create -->");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</ui:remove>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<pm:field>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<p:commandButton id=\"bttn-submit\" process=\"@form\" ");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("update=\"@form growl\"");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("action=\"#{presenter.");
    String _name_26 = null;
    if (this.entity!=null) {
      _name_26=this.entity.getName();
    }
    String _lowerCase_1 = null;
    if (_name_26!=null) {
      _lowerCase_1=_name_26.toLowerCase();
    }
    _builder.append(_lowerCase_1, "\t\t\t\t\t\t");
    _builder.append(".submit()}\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("alt=\"#{citysquire[\'");
    String _name_27 = null;
    if (this.entity!=null) {
      _name_27=this.entity.getName();
    }
    String _firstLower_25 = null;
    if (_name_27!=null) {
      _firstLower_25=StringExtensions.toFirstLower(_name_27);
    }
    _builder.append(_firstLower_25, "\t\t\t\t\t\t");
    _builder.append(".details.submit\']}\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("title=\"#{citysquire[\'");
    String _name_28 = null;
    if (this.entity!=null) {
      _name_28=this.entity.getName();
    }
    String _firstLower_26 = null;
    if (_name_28!=null) {
      _firstLower_26=StringExtensions.toFirstLower(_name_28);
    }
    _builder.append(_firstLower_26, "\t\t\t\t\t\t");
    _builder.append(".details.submit\']}\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("value=\"#{citysquire[\'");
    String _name_29 = null;
    if (this.entity!=null) {
      _name_29=this.entity.getName();
    }
    String _firstLower_27 = null;
    if (_name_29!=null) {
      _firstLower_27=StringExtensions.toFirstLower(_name_29);
    }
    _builder.append(_firstLower_27, "\t\t\t\t\t\t");
    _builder.append(".details.submit\']}\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<f:param name=\"id\"");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("value=\"#{presenter.");
    String _name_30 = null;
    if (this.entity!=null) {
      _name_30=this.entity.getName();
    }
    String _lowerCase_2 = null;
    if (_name_30!=null) {
      _lowerCase_2=_name_30.toLowerCase();
    }
    _builder.append(_lowerCase_2, "\t\t\t\t\t\t\t");
    _builder.append(".model.id}\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<f:attribute name=\"id\"");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("value=\"#{presenter.");
    String _name_31 = null;
    if (this.entity!=null) {
      _name_31=this.entity.getName();
    }
    String _lowerCase_3 = null;
    if (_name_31!=null) {
      _lowerCase_3=_name_31.toLowerCase();
    }
    _builder.append(_lowerCase_3, "\t\t\t\t\t\t\t");
    _builder.append(".model.id}\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.append("</p:commandButton>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</pm:field>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</h:form>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</pm:content>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</pm:page>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</ui:define>");
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
