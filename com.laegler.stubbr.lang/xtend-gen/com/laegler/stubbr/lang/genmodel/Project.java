package com.laegler.stubbr.lang.genmodel;

import com.laegler.stubbr.lang.genmodel.ProjectType;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pure;
import templates.AbstractTemplate;

@SuppressWarnings("all")
public class Project {
  @Accessors
  private StubbrRegistry stubbr;
  
  @Accessors
  private String name;
  
  @Accessors
  private String basePackage;
  
  @Accessors
  private String relativePath;
  
  @Accessors
  private String version;
  
  @Accessors
  private List<String> dependencies;
  
  @Accessors
  private List<AbstractTemplate> files;
  
  @Accessors
  private ProjectType projectType;
  
  @Accessors
  private String canonicalName;
  
  @Accessors
  private String documentation;
  
  public Project(final StubbrRegistry stubbr) {
    super();
    this.stubbr = stubbr;
    this.name = "undefined-project";
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("undefined/");
    _builder.append(this.name, "");
    this.relativePath = _builder.toString();
    Stubb _stubb = null;
    if (stubbr!=null) {
      _stubb=stubbr.getStubb();
    }
    String _version = null;
    if (_stubb!=null) {
      _version=_stubb.getVersion();
    }
    String _replaceFirst = null;
    if (_version!=null) {
      _replaceFirst=_version.replaceFirst("v", "");
    }
    this.version = _replaceFirst;
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.dependencies = _arrayList;
    ArrayList<AbstractTemplate> _arrayList_1 = new ArrayList<AbstractTemplate>();
    this.files = _arrayList_1;
    this.projectType = ProjectType.UNDEFINED;
    this.canonicalName = "Undefined project";
    this.documentation = "This is an undefined project (Generator is not implemented yet)";
  }
  
  public String getPackaging() {
    return this.projectType.getPackaging();
  }
  
  @Pure
  public StubbrRegistry getStubbr() {
    return this.stubbr;
  }
  
  public void setStubbr(final StubbrRegistry stubbr) {
    this.stubbr = stubbr;
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  @Pure
  public String getBasePackage() {
    return this.basePackage;
  }
  
  public void setBasePackage(final String basePackage) {
    this.basePackage = basePackage;
  }
  
  @Pure
  public String getRelativePath() {
    return this.relativePath;
  }
  
  public void setRelativePath(final String relativePath) {
    this.relativePath = relativePath;
  }
  
  @Pure
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(final String version) {
    this.version = version;
  }
  
  @Pure
  public List<String> getDependencies() {
    return this.dependencies;
  }
  
  public void setDependencies(final List<String> dependencies) {
    this.dependencies = dependencies;
  }
  
  @Pure
  public List<AbstractTemplate> getFiles() {
    return this.files;
  }
  
  public void setFiles(final List<AbstractTemplate> files) {
    this.files = files;
  }
  
  @Pure
  public ProjectType getProjectType() {
    return this.projectType;
  }
  
  public void setProjectType(final ProjectType projectType) {
    this.projectType = projectType;
  }
  
  @Pure
  public String getCanonicalName() {
    return this.canonicalName;
  }
  
  public void setCanonicalName(final String canonicalName) {
    this.canonicalName = canonicalName;
  }
  
  @Pure
  public String getDocumentation() {
    return this.documentation;
  }
  
  public void setDocumentation(final String documentation) {
    this.documentation = documentation;
  }
}
