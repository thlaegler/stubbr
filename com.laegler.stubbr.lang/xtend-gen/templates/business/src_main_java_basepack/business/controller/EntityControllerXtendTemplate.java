package templates.business.src_main_java_basepack.business.controller;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Attribute;
import com.laegler.stubbr.lang.stubbrLang.ChapterPersistence;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractXtendTemplate;

/**
 * File template for controller for entity.
 */
@SuppressWarnings("all")
public class EntityControllerXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public EntityControllerXtendTemplate(final StubbrRegistry stubbr, final Project project, final Entity entity) {
    super(stubbr, project);
    this.entity = entity;
    StringConcatenation _builder = new StringConcatenation();
    String _name = null;
    if (entity!=null) {
      _name=entity.getName();
    }
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    _builder.append(_firstUpper, "");
    _builder.append("Controller");
    this.setFileName(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _basePackage = project.getBasePackage();
    _builder_1.append(_basePackage, "");
    _builder_1.append(".controller");
    this.setHeader(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("/src/main/java/");
    String _basePackage_1 = null;
    if (project!=null) {
      _basePackage_1=project.getBasePackage();
    }
    String _path = null;
    if (_basePackage_1!=null) {
      _path=this.toPath(_basePackage_1);
    }
    _builder_2.append(_path, "");
    _builder_2.append("/controller/");
    this.setRelativPath(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("Controller for entity ");
    String _name_1 = null;
    if (entity!=null) {
      _name_1=entity.getName();
    }
    String _firstUpper_1 = null;
    if (_name_1!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_name_1);
    }
    _builder_3.append(_firstUpper_1, "");
    this.setDocumentation(_builder_3.toString());
    String _template = this.getTemplate();
    String _withImports = this.withImports(_template);
    this.setContent(_withImports);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    Project _project = this.getProject();
    String _basePackage = _project.getBasePackage();
    _builder.append(_basePackage, "");
    _builder.append(".*");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.io.Serializable");
    _builder.newLine();
    _builder.append("import javax.persistence.Column");
    _builder.newLine();
    _builder.append("import javax.persistence.Entity");
    _builder.newLine();
    _builder.append("import javax.persistence.Table");
    _builder.newLine();
    _builder.append("import javax.xml.bind.annotation.XmlElement");
    _builder.newLine();
    _builder.append("import javax.xml.bind.annotation.XmlRootElement");
    _builder.newLine();
    _builder.append("import org.eclipse.xtend.lib.annotations.Accessors");
    _builder.newLine();
    _builder.append("import com.google.gson.annotations.Expose");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.example.stubbr.persistence.service.BarService");
    _builder.newLine();
    _builder.append("import org.example.stubbr.business.object.BarBusinessObject");
    _builder.newLine();
    _builder.append("import javax.inject.Inject");
    _builder.newLine();
    _builder.append("import org.example.stubbr.model.entity.Bar");
    _builder.newLine();
    _builder.newLine();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@");
    String _asImport = this.asImport("javax.ejb.Stateless");
    _builder.append(_asImport, "");
    _builder.newLineIfNotEmpty();
    _builder.append("class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" extends AbstractController {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@");
    String _asImport_1 = this.asImport("javax.inject.Inject");
    _builder.append(_asImport_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private ");
    StubbrRegistry _stubbr = this.getStubbr();
    Stubb _stubb = null;
    if (_stubbr!=null) {
      _stubb=_stubbr.getStubb();
    }
    String _packageName = null;
    if (_stubb!=null) {
      _packageName=_stubb.getPackageName();
    }
    String _plus = (_packageName + ".persistence.service.");
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    String _plus_1 = (_plus + _firstUpper);
    String _plus_2 = (_plus_1 + "Service");
    String _asImport_2 = this.asImport(_plus_2);
    _builder.append(_asImport_2, "\t");
    _builder.append(" ");
    String _name_1 = null;
    if (this.entity!=null) {
      _name_1=this.entity.getName();
    }
    String _firstLower = null;
    if (_name_1!=null) {
      _firstLower=StringExtensions.toFirstLower(_name_1);
    }
    _builder.append(_firstLower, "\t");
    _builder.append("Service");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    StubbrRegistry _stubbr_1 = this.getStubbr();
    Stubb _stubb_1 = null;
    if (_stubbr_1!=null) {
      _stubb_1=_stubbr_1.getStubb();
    }
    String _packageName_1 = null;
    if (_stubb_1!=null) {
      _packageName_1=_stubb_1.getPackageName();
    }
    String _plus_3 = (_packageName_1 + ".business.object.");
    String _name_2 = null;
    if (this.entity!=null) {
      _name_2=this.entity.getName();
    }
    String _firstUpper_1 = null;
    if (_name_2!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_name_2);
    }
    String _plus_4 = (_plus_3 + _firstUpper_1);
    String _plus_5 = (_plus_4 + "BusinessObject");
    String _asImport_3 = this.asImport(_plus_5);
    _builder.append(_asImport_3, "\t");
    _builder.append(" ");
    String _name_3 = null;
    if (this.entity!=null) {
      _name_3=this.entity.getName();
    }
    String _firstLower_1 = null;
    if (_name_3!=null) {
      _firstLower_1=StringExtensions.toFirstLower(_name_3);
    }
    _builder.append(_firstLower_1, "\t");
    _builder.append("BusinessObject");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public def init() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val ");
    StubbrRegistry _stubbr_2 = this.getStubbr();
    Stubb _stubb_2 = null;
    if (_stubbr_2!=null) {
      _stubb_2=_stubbr_2.getStubb();
    }
    String _packageName_2 = null;
    if (_stubb_2!=null) {
      _packageName_2=_stubb_2.getPackageName();
    }
    String _plus_6 = (_packageName_2 + ".model.entity.");
    String _name_4 = null;
    if (this.entity!=null) {
      _name_4=this.entity.getName();
    }
    String _firstUpper_2 = null;
    if (_name_4!=null) {
      _firstUpper_2=StringExtensions.toFirstUpper(_name_4);
    }
    String _plus_7 = (_plus_6 + _firstUpper_2);
    String _asImport_4 = this.asImport(_plus_7);
    _builder.append(_asImport_4, "\t\t");
    _builder.append(" ");
    String _name_5 = null;
    if (this.entity!=null) {
      _name_5=this.entity.getName();
    }
    String _firstLower_2 = null;
    if (_name_5!=null) {
      _firstLower_2=StringExtensions.toFirstLower(_name_5);
    }
    _builder.append(_firstLower_2, "\t\t");
    _builder.append(" = ");
    String _name_6 = null;
    if (this.entity!=null) {
      _name_6=this.entity.getName();
    }
    String _firstLower_3 = null;
    if (_name_6!=null) {
      _firstLower_3=StringExtensions.toFirstLower(_name_6);
    }
    _builder.append(_firstLower_3, "\t\t");
    _builder.append("Service.findById(1)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.");
    String _name_7 = null;
    if (this.entity!=null) {
      _name_7=this.entity.getName();
    }
    String _firstLower_4 = null;
    if (_name_7!=null) {
      _firstLower_4=StringExtensions.toFirstLower(_name_7);
    }
    _builder.append(_firstLower_4, "\t\t");
    _builder.append("BusinessObject = new ");
    String _name_8 = null;
    if (this.entity!=null) {
      _name_8=this.entity.getName();
    }
    String _firstUpper_3 = null;
    if (_name_8!=null) {
      _firstUpper_3=StringExtensions.toFirstUpper(_name_8);
    }
    _builder.append(_firstUpper_3, "\t\t");
    _builder.append("BusinessObject(");
    String _name_9 = null;
    if (this.entity!=null) {
      _name_9=this.entity.getName();
    }
    String _firstLower_5 = null;
    if (_name_9!=null) {
      _firstLower_5=StringExtensions.toFirstLower(_name_9);
    }
    _builder.append(_firstLower_5, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public def ");
    StubbrRegistry _stubbr_3 = this.getStubbr();
    Stubb _stubb_3 = null;
    if (_stubbr_3!=null) {
      _stubb_3=_stubbr_3.getStubb();
    }
    String _packageName_3 = null;
    if (_stubb_3!=null) {
      _packageName_3=_stubb_3.getPackageName();
    }
    String _plus_8 = (_packageName_3 + ".business.object.");
    String _name_10 = null;
    if (this.entity!=null) {
      _name_10=this.entity.getName();
    }
    String _firstUpper_4 = null;
    if (_name_10!=null) {
      _firstUpper_4=StringExtensions.toFirstUpper(_name_10);
    }
    String _plus_9 = (_plus_8 + _firstUpper_4);
    String _plus_10 = (_plus_9 + "BusinessObject");
    String _asImport_5 = this.asImport(_plus_10);
    _builder.append(_asImport_5, "\t");
    _builder.append(" save(");
    StubbrRegistry _stubbr_4 = this.getStubbr();
    Stubb _stubb_4 = null;
    if (_stubbr_4!=null) {
      _stubb_4=_stubbr_4.getStubb();
    }
    String _packageName_4 = null;
    if (_stubb_4!=null) {
      _packageName_4=_stubb_4.getPackageName();
    }
    String _plus_11 = (_packageName_4 + ".business.object.");
    String _name_11 = null;
    if (this.entity!=null) {
      _name_11=this.entity.getName();
    }
    String _firstUpper_5 = null;
    if (_name_11!=null) {
      _firstUpper_5=StringExtensions.toFirstUpper(_name_11);
    }
    String _plus_12 = (_plus_11 + _firstUpper_5);
    String _plus_13 = (_plus_12 + "BusinessObject");
    String _asImport_6 = this.asImport(_plus_13);
    _builder.append(_asImport_6, "\t");
    _builder.append(" ");
    String _name_12 = null;
    if (this.entity!=null) {
      _name_12=this.entity.getName();
    }
    String _firstLower_6 = null;
    if (_name_12!=null) {
      _firstLower_6=StringExtensions.toFirstLower(_name_12);
    }
    _builder.append(_firstLower_6, "\t");
    _builder.append("BusinessObject) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val ");
    String _name_13 = null;
    if (this.entity!=null) {
      _name_13=this.entity.getName();
    }
    String _firstUpper_6 = null;
    if (_name_13!=null) {
      _firstUpper_6=StringExtensions.toFirstUpper(_name_13);
    }
    _builder.append(_firstUpper_6, "\t\t");
    _builder.append(" ");
    String _name_14 = null;
    if (this.entity!=null) {
      _name_14=this.entity.getName();
    }
    String _firstLower_7 = null;
    if (_name_14!=null) {
      _firstLower_7=StringExtensions.toFirstLower(_name_14);
    }
    _builder.append(_firstLower_7, "\t\t");
    _builder.append(" = businessObject2Model(");
    String _name_15 = null;
    if (this.entity!=null) {
      _name_15=this.entity.getName();
    }
    String _firstLower_8 = null;
    if (_name_15!=null) {
      _firstLower_8=StringExtensions.toFirstLower(_name_15);
    }
    _builder.append(_firstLower_8, "\t\t");
    _builder.append("BusinessObject)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val ");
    String _name_16 = null;
    if (this.entity!=null) {
      _name_16=this.entity.getName();
    }
    String _firstUpper_7 = null;
    if (_name_16!=null) {
      _firstUpper_7=StringExtensions.toFirstUpper(_name_16);
    }
    _builder.append(_firstUpper_7, "\t\t");
    _builder.append(" persisted");
    String _name_17 = null;
    if (this.entity!=null) {
      _name_17=this.entity.getName();
    }
    String _firstUpper_8 = null;
    if (_name_17!=null) {
      _firstUpper_8=StringExtensions.toFirstUpper(_name_17);
    }
    _builder.append(_firstUpper_8, "\t\t");
    _builder.append(" = ");
    String _name_18 = null;
    if (this.entity!=null) {
      _name_18=this.entity.getName();
    }
    String _firstLower_9 = null;
    if (_name_18!=null) {
      _firstLower_9=StringExtensions.toFirstLower(_name_18);
    }
    _builder.append(_firstLower_9, "\t\t");
    _builder.append("Service.persist(");
    String _name_19 = null;
    if (this.entity!=null) {
      _name_19=this.entity.getName();
    }
    String _firstLower_10 = null;
    if (_name_19!=null) {
      _firstLower_10=StringExtensions.toFirstLower(_name_19);
    }
    _builder.append(_firstLower_10, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("model2BusinessObject(persisted");
    String _name_20 = null;
    if (this.entity!=null) {
      _name_20=this.entity.getName();
    }
    String _firstUpper_9 = null;
    if (_name_20!=null) {
      _firstUpper_9=StringExtensions.toFirstUpper(_name_20);
    }
    _builder.append(_firstUpper_9, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public def void remove(");
    ChapterPersistence _chapterPersistence = this.getChapterPersistence();
    JvmTypeReference _javaType = _chapterPersistence.getJavaType();
    String _qualifiedName = null;
    if (_javaType!=null) {
      _qualifiedName=_javaType.getQualifiedName();
    }
    String _asImport_7 = this.asImport(_qualifiedName);
    _builder.append(_asImport_7, "\t");
    _builder.append(" id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_21 = null;
    if (this.entity!=null) {
      _name_21=this.entity.getName();
    }
    String _firstLower_11 = null;
    if (_name_21!=null) {
      _firstLower_11=StringExtensions.toFirstLower(_name_21);
    }
    _builder.append(_firstLower_11, "\t\t");
    _builder.append("Service.remove(id)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public def ");
    StubbrRegistry _stubbr_5 = this.getStubbr();
    Stubb _stubb_5 = null;
    if (_stubbr_5!=null) {
      _stubb_5=_stubbr_5.getStubb();
    }
    String _packageName_5 = null;
    if (_stubb_5!=null) {
      _packageName_5=_stubb_5.getPackageName();
    }
    String _plus_14 = (_packageName_5 + ".business.object.");
    String _name_22 = null;
    if (this.entity!=null) {
      _name_22=this.entity.getName();
    }
    String _firstUpper_10 = null;
    if (_name_22!=null) {
      _firstUpper_10=StringExtensions.toFirstUpper(_name_22);
    }
    String _plus_15 = (_plus_14 + _firstUpper_10);
    String _plus_16 = (_plus_15 + "BusinessObject");
    String _asImport_8 = this.asImport(_plus_16);
    _builder.append(_asImport_8, "\t");
    _builder.append(" findById(");
    ChapterPersistence _chapterPersistence_1 = this.getChapterPersistence();
    JvmTypeReference _javaType_1 = _chapterPersistence_1.getJavaType();
    String _qualifiedName_1 = null;
    if (_javaType_1!=null) {
      _qualifiedName_1=_javaType_1.getQualifiedName();
    }
    String _asImport_9 = this.asImport(_qualifiedName_1);
    _builder.append(_asImport_9, "\t");
    _builder.append(" id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val ");
    String _name_23 = null;
    if (this.entity!=null) {
      _name_23=this.entity.getName();
    }
    String _firstUpper_11 = null;
    if (_name_23!=null) {
      _firstUpper_11=StringExtensions.toFirstUpper(_name_23);
    }
    _builder.append(_firstUpper_11, "\t\t");
    _builder.append(" ");
    String _name_24 = null;
    if (this.entity!=null) {
      _name_24=this.entity.getName();
    }
    String _firstUpper_12 = null;
    if (_name_24!=null) {
      _firstUpper_12=StringExtensions.toFirstUpper(_name_24);
    }
    _builder.append(_firstUpper_12, "\t\t");
    _builder.append(" = ");
    String _name_25 = null;
    if (this.entity!=null) {
      _name_25=this.entity.getName();
    }
    String _firstLower_12 = null;
    if (_name_25!=null) {
      _firstLower_12=StringExtensions.toFirstLower(_name_25);
    }
    _builder.append(_firstLower_12, "\t\t");
    _builder.append("Service.findById(id)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("model2BusinessObject(");
    String _name_26 = null;
    if (this.entity!=null) {
      _name_26=this.entity.getName();
    }
    String _firstUpper_13 = null;
    if (_name_26!=null) {
      _firstUpper_13=StringExtensions.toFirstUpper(_name_26);
    }
    _builder.append(_firstUpper_13, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private def ");
    String _name_27 = null;
    if (this.entity!=null) {
      _name_27=this.entity.getName();
    }
    String _firstUpper_14 = null;
    if (_name_27!=null) {
      _firstUpper_14=StringExtensions.toFirstUpper(_name_27);
    }
    _builder.append(_firstUpper_14, "\t");
    _builder.append(" businessObject2Model(");
    StubbrRegistry _stubbr_6 = this.getStubbr();
    Stubb _stubb_6 = null;
    if (_stubbr_6!=null) {
      _stubb_6=_stubbr_6.getStubb();
    }
    String _packageName_6 = null;
    if (_stubb_6!=null) {
      _packageName_6=_stubb_6.getPackageName();
    }
    String _plus_17 = (_packageName_6 + ".business.object.");
    String _name_28 = null;
    if (this.entity!=null) {
      _name_28=this.entity.getName();
    }
    String _firstUpper_15 = null;
    if (_name_28!=null) {
      _firstUpper_15=StringExtensions.toFirstUpper(_name_28);
    }
    String _plus_18 = (_plus_17 + _firstUpper_15);
    String _plus_19 = (_plus_18 + "BusinessObject");
    String _asImport_10 = this.asImport(_plus_19);
    _builder.append(_asImport_10, "\t");
    _builder.append(" ");
    String _name_29 = null;
    if (this.entity!=null) {
      _name_29=this.entity.getName();
    }
    String _firstLower_13 = null;
    if (_name_29!=null) {
      _firstLower_13=StringExtensions.toFirstLower(_name_29);
    }
    _builder.append(_firstLower_13, "\t");
    _builder.append("BusinessObject) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val ");
    String _name_30 = null;
    if (this.entity!=null) {
      _name_30=this.entity.getName();
    }
    String _firstUpper_16 = null;
    if (_name_30!=null) {
      _firstUpper_16=StringExtensions.toFirstUpper(_name_30);
    }
    _builder.append(_firstUpper_16, "\t\t");
    _builder.append(" ");
    String _name_31 = null;
    if (this.entity!=null) {
      _name_31=this.entity.getName();
    }
    String _firstLower_14 = null;
    if (_name_31!=null) {
      _firstLower_14=StringExtensions.toFirstLower(_name_31);
    }
    _builder.append(_firstLower_14, "\t\t");
    _builder.append(" = new ");
    String _name_32 = null;
    if (this.entity!=null) {
      _name_32=this.entity.getName();
    }
    String _firstUpper_17 = null;
    if (_name_32!=null) {
      _firstUpper_17=StringExtensions.toFirstUpper(_name_32);
    }
    _builder.append(_firstUpper_17, "\t\t");
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    {
      EList<Attribute> _attributes = null;
      if (this.entity!=null) {
        _attributes=this.entity.getAttributes();
      }
      for(final Attribute attribute : _attributes) {
        _builder.append("\t\t");
        String _name_33 = null;
        if (this.entity!=null) {
          _name_33=this.entity.getName();
        }
        String _firstLower_15 = null;
        if (_name_33!=null) {
          _firstLower_15=StringExtensions.toFirstLower(_name_33);
        }
        _builder.append(_firstLower_15, "\t\t");
        _builder.append(".");
        String _name_34 = null;
        if (attribute!=null) {
          _name_34=attribute.getName();
        }
        String _firstLower_16 = null;
        if (_name_34!=null) {
          _firstLower_16=StringExtensions.toFirstLower(_name_34);
        }
        _builder.append(_firstLower_16, "\t\t");
        _builder.append(" = ");
        String _name_35 = null;
        if (this.entity!=null) {
          _name_35=this.entity.getName();
        }
        String _firstLower_17 = null;
        if (_name_35!=null) {
          _firstLower_17=StringExtensions.toFirstLower(_name_35);
        }
        _builder.append(_firstLower_17, "\t\t");
        _builder.append("BusinessObject.");
        String _name_36 = null;
        if (attribute!=null) {
          _name_36=attribute.getName();
        }
        String _firstLower_18 = null;
        if (_name_36!=null) {
          _firstLower_18=StringExtensions.toFirstLower(_name_36);
        }
        _builder.append(_firstLower_18, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("return ");
    String _name_37 = null;
    if (this.entity!=null) {
      _name_37=this.entity.getName();
    }
    String _firstLower_19 = null;
    if (_name_37!=null) {
      _firstLower_19=StringExtensions.toFirstLower(_name_37);
    }
    _builder.append(_firstLower_19, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private def ");
    StubbrRegistry _stubbr_7 = this.getStubbr();
    Stubb _stubb_7 = null;
    if (_stubbr_7!=null) {
      _stubb_7=_stubbr_7.getStubb();
    }
    String _packageName_7 = null;
    if (_stubb_7!=null) {
      _packageName_7=_stubb_7.getPackageName();
    }
    String _plus_20 = (_packageName_7 + ".business.object.");
    String _name_38 = null;
    if (this.entity!=null) {
      _name_38=this.entity.getName();
    }
    String _firstUpper_18 = null;
    if (_name_38!=null) {
      _firstUpper_18=StringExtensions.toFirstUpper(_name_38);
    }
    String _plus_21 = (_plus_20 + _firstUpper_18);
    String _plus_22 = (_plus_21 + "BusinessObject");
    String _asImport_11 = this.asImport(_plus_22);
    _builder.append(_asImport_11, "\t");
    _builder.append(" model2BusinessObject(");
    StubbrRegistry _stubbr_8 = this.getStubbr();
    Stubb _stubb_8 = null;
    if (_stubbr_8!=null) {
      _stubb_8=_stubbr_8.getStubb();
    }
    String _packageName_8 = null;
    if (_stubb_8!=null) {
      _packageName_8=_stubb_8.getPackageName();
    }
    String _plus_23 = (_packageName_8 + ".model.entity.");
    String _name_39 = null;
    if (this.entity!=null) {
      _name_39=this.entity.getName();
    }
    String _firstUpper_19 = null;
    if (_name_39!=null) {
      _firstUpper_19=StringExtensions.toFirstUpper(_name_39);
    }
    String _plus_24 = (_plus_23 + _firstUpper_19);
    String _asImport_12 = this.asImport(_plus_24);
    _builder.append(_asImport_12, "\t");
    _builder.append(" ");
    String _name_40 = null;
    if (this.entity!=null) {
      _name_40=this.entity.getName();
    }
    String _firstLower_20 = null;
    if (_name_40!=null) {
      _firstLower_20=StringExtensions.toFirstLower(_name_40);
    }
    _builder.append(_firstLower_20, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("val ");
    String _name_41 = null;
    if (this.entity!=null) {
      _name_41=this.entity.getName();
    }
    String _firstUpper_20 = null;
    if (_name_41!=null) {
      _firstUpper_20=StringExtensions.toFirstUpper(_name_41);
    }
    _builder.append(_firstUpper_20, "\t\t");
    _builder.append("BusinessObject ");
    String _name_42 = null;
    if (this.entity!=null) {
      _name_42=this.entity.getName();
    }
    String _firstLower_21 = null;
    if (_name_42!=null) {
      _firstLower_21=StringExtensions.toFirstLower(_name_42);
    }
    _builder.append(_firstLower_21, "\t\t");
    _builder.append("BusinessObject = new ");
    String _name_43 = null;
    if (this.entity!=null) {
      _name_43=this.entity.getName();
    }
    String _firstUpper_21 = null;
    if (_name_43!=null) {
      _firstUpper_21=StringExtensions.toFirstUpper(_name_43);
    }
    _builder.append(_firstUpper_21, "\t\t");
    _builder.append("BusinessObject()");
    _builder.newLineIfNotEmpty();
    {
      EList<Attribute> _attributes_1 = null;
      if (this.entity!=null) {
        _attributes_1=this.entity.getAttributes();
      }
      for(final Attribute attribute_1 : _attributes_1) {
        _builder.append("\t\t");
        String _name_44 = null;
        if (this.entity!=null) {
          _name_44=this.entity.getName();
        }
        String _firstLower_22 = null;
        if (_name_44!=null) {
          _firstLower_22=StringExtensions.toFirstLower(_name_44);
        }
        _builder.append(_firstLower_22, "\t\t");
        _builder.append("BusinessObject.");
        String _name_45 = null;
        if (attribute_1!=null) {
          _name_45=attribute_1.getName();
        }
        String _firstLower_23 = null;
        if (_name_45!=null) {
          _firstLower_23=StringExtensions.toFirstLower(_name_45);
        }
        _builder.append(_firstLower_23, "\t\t");
        _builder.append(" = ");
        String _name_46 = null;
        if (this.entity!=null) {
          _name_46=this.entity.getName();
        }
        String _firstLower_24 = null;
        if (_name_46!=null) {
          _firstLower_24=StringExtensions.toFirstLower(_name_46);
        }
        _builder.append(_firstLower_24, "\t\t");
        _builder.append(".");
        String _name_47 = null;
        if (attribute_1!=null) {
          _name_47=attribute_1.getName();
        }
        String _firstLower_25 = null;
        if (_name_47!=null) {
          _firstLower_25=StringExtensions.toFirstLower(_name_47);
        }
        _builder.append(_firstLower_25, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("return ");
    String _name_48 = null;
    if (this.entity!=null) {
      _name_48=this.entity.getName();
    }
    String _firstLower_26 = null;
    if (_name_48!=null) {
      _firstLower_26=StringExtensions.toFirstLower(_name_48);
    }
    _builder.append(_firstLower_26, "\t\t");
    _builder.append("BusinessObject");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
