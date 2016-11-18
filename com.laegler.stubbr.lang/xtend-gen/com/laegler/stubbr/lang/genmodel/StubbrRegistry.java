package com.laegler.stubbr.lang.genmodel;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class StubbrRegistry {
  public static Stubb STUBB;
  
  public static IFileSystemAccess FSA;
  
  public static List<Project> PROJECTS = new ArrayList<Project>();
  
  public static void clean() {
    StubbrRegistry.STUBB = null;
    StubbrRegistry.FSA = null;
    ArrayList<Project> _arrayList = new ArrayList<Project>();
    StubbrRegistry.PROJECTS = _arrayList;
  }
  
  public Stubb getStubb() {
    return StubbrRegistry.STUBB;
  }
  
  public Stubb setStubb(final Stubb stubb) {
    return StubbrRegistry.STUBB = stubb;
  }
  
  public IFileSystemAccess getFsa() {
    return StubbrRegistry.FSA;
  }
  
  public IFileSystemAccess setFsa(final IFileSystemAccess fsa) {
    return StubbrRegistry.FSA = fsa;
  }
  
  public List<Project> getProjects() {
    return StubbrRegistry.PROJECTS;
  }
  
  public List<Project> setProjects(final List<Project> projects) {
    return StubbrRegistry.PROJECTS = projects;
  }
}
